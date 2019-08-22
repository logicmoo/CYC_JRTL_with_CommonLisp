package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_date_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_date_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities";

    public static final String myFingerPrint = "bb07720054526272bd4ee00e6a53001ac6f24bdcac5f9b2b31c4199ad6836830";

    // defparameter
    private static final SubLSymbol $default_year_of_date_check_cost$ = makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_month_of_date_check_cost$ = makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_day_number_of_date_check_cost$ = makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_hour_number_of_date_check_cost$ = makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*");

    private static final SubLObject $$yearOfDate = reader_make_constant_shell(makeString("yearOfDate"));





    private static final SubLSymbol $REMOVAL_YEAR_OF_DATE_CHECK_POS = makeKeyword("REMOVAL-YEAR-OF-DATE-CHECK-POS");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("yearOfDate")), list(makeKeyword("BIND"), makeSymbol("YEAR")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("YEAR")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("YEAR"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("YEAR-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("YEAR")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("DOCUMENTATION"), makeString("(#$yearOfDate <year> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$yearOfDate 2003 (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_YEAR_OF_DATE_CHECK_NEG = makeKeyword("REMOVAL-YEAR-OF-DATE-CHECK-NEG");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("yearOfDate")), list(makeKeyword("BIND"), makeSymbol("YEAR")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("YEAR")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("YEAR"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("YEAR-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("YEAR")), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$yearOfDate <year> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$yearOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn #$August \n                                       (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_YEAR_OF_DATE_UNIFY = makeKeyword("REMOVAL-YEAR-OF-DATE-UNIFY");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-EXTRACT-DATE-YEAR"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("yearOfDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("DOCUMENTATION"), makeString("(#$yearOfDate <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$yearOfDate ?YEAR \n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });

    private static final SubLObject $$monthOfDate = reader_make_constant_shell(makeString("monthOfDate"));

    private static final SubLSymbol $REMOVAL_MONTH_OF_DATE_CHECK_POS = makeKeyword("REMOVAL-MONTH-OF-DATE-CHECK-POS");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("monthOfDate")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MONTH"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("MONTH-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("DOCUMENTATION"), makeString("(#$monthOfDate <month> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$monthOfDate #$August (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_MONTH_OF_DATE_CHECK_NEG = makeKeyword("REMOVAL-MONTH-OF-DATE-CHECK-NEG");

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("monthOfDate")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("MONTH"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("MONTH-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$monthOfDate <month> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$monthOfDate #$February (#$SecondFn 54 \n                                     (#$MinuteFn 48 \n                                      (#$HourFn 10 \n                                       (#$DayFn 28 \n                                        (#$MonthFn August \n                                         (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_MONTH_OF_DATE_UNIFY = makeKeyword("REMOVAL-MONTH-OF-DATE-UNIFY");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-EXTRACT-DATE-MONTH"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("monthOfDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("DOCUMENTATION"), makeString("(#$monthOfDate <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$monthOfDate ?MONTH (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn August \n                               (#$YearFn 2003)))))))") });

    private static final SubLObject $$dayNumberOfDate = reader_make_constant_shell(makeString("dayNumberOfDate"));

    private static final SubLSymbol $REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS = makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-CHECK-POS");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), list(makeKeyword("BIND"), makeSymbol("DAY-NUMBER")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("DAY-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DAY-NUMBER"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("DAY-NUMBER-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("DAY-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("DOCUMENTATION"), makeString("(#$dayNumberOfDate <day-number> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$dayNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG = makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-CHECK-NEG");

    public static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), list(makeKeyword("BIND"), makeSymbol("DAY-NUMBER")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("DAY-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DAY-NUMBER"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("DAY-NUMBER-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("DAY-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$dayNumberOfDate <day-number> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$dayNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_DAY_NUMBER_OF_DATE_UNIFY = makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-UNIFY");

    public static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-EXTRACT-DATE-DAY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("dayNumberOfDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("DOCUMENTATION"), makeString("(#$dayNumberOfDate <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$dayNumberOfDate ?DAY-NUMBER\n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn August \n                             (#$YearFn 2003)))))))") });

    private static final SubLObject $$hourNumberOfDate = reader_make_constant_shell(makeString("hourNumberOfDate"));

    private static final SubLSymbol $REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS = makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-POS");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), list(makeKeyword("BIND"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("HOUR-NUMBER"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("HOUR-NUMBER-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("DOCUMENTATION"), makeString("(#$hourNumberOfDate <hour-number> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$hourNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG = makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-NEG");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), list(makeKeyword("BIND"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("HOUR-NUMBER"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("HOUR-NUMBER-OF-DATE?"), list(makeKeyword("VALUE"), makeSymbol("HOUR-NUMBER")), list(makeKeyword("VALUE"), makeSymbol("DATE"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$hourNumberOfDate <hour-number> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$hourNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY = makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-UNIFY");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-EXTRACT-DATE-HOUR"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("hourNumberOfDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))), makeKeyword("DOCUMENTATION"), makeString("(#$hourNumberOfDate <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$hourNumberOfDate ?HOUR (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                (#$HourFn 10 \n                                 (#$DayFn 28 \n                                  (#$MonthFn August \n                                   (#$YearFn 2003)))))))") });

    private static final SubLSymbol $REMOVAL_DATE_INTERVALS_INTERSECT_CHECK = makeKeyword("REMOVAL-DATE-INTERVALS-INTERSECT-CHECK");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("OR"), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("TEMPORAL-INDEXICAL-P"))), list(makeKeyword("OR"), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("TEMPORAL-INDEXICAL-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallyIntersects")), list(makeKeyword("BIND"), makeSymbol("DATE1")), list(makeKeyword("BIND"), makeSymbol("DATE2"))), list(list(makeKeyword("VALUE"), makeSymbol("DATE1")), list(makeKeyword("VALUE"), makeSymbol("DATE2")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DATE1"), makeSymbol("DATE2")), list(makeKeyword("CALL"), makeSymbol("DATE-INTERVALS-OR-INDEXICALS-INTERSECT?"), list(makeKeyword("VALUE"), makeSymbol("DATE1")), list(makeKeyword("VALUE"), makeSymbol("DATE2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("SUPPORT-MT"), makeSymbol("*TIME-INFERENCE-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <date-interval> <date-interval>)"), makeKeyword("EXAMPLE"), makeString("(#$temporallyIntersects (#$IntervalEndedByFn (#$YearFn 2005)) (#$IntervalStartedBy (#$YearFn 2003)))") });

    private static final SubLSymbol $REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK = makeKeyword("REMOVAL-DATE-INTERVAL-SUBSUMES-CHECK");

    public static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("OR"), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("TEMPORAL-INDEXICAL-P"))), list(makeKeyword("TEST"), makeSymbol("INDETERMINATE-DATE-INTERVAL-P"))), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("INDETERMINATE-DATE-INTERVAL-P")), list(makeKeyword("OR"), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("TEMPORAL-INDEXICAL-P"))))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes")), list(makeKeyword("BIND"), makeSymbol("DATE1")), list(makeKeyword("BIND"), makeSymbol("DATE2"))), list(list(makeKeyword("VALUE"), makeSymbol("DATE1")), list(makeKeyword("VALUE"), makeSymbol("DATE2")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DATE1"), makeSymbol("DATE2")), list(makeKeyword("CALL"), makeSymbol("DATE-INTERVAL-OR-INDEXICAL-SUBSUMES?"), list(makeKeyword("VALUE"), makeSymbol("DATE1")), list(makeKeyword("VALUE"), makeSymbol("DATE2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("SUPPORT-MT"), makeSymbol("*TIME-INFERENCE-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <date-interval> <date-interval>)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes (#$IntervalEndedByFn (#$YearFn 2005)) (#$YearFn 2003))") });

    private static final SubLSymbol $REMOVAL_DATE_INTERVAL_DURATION_UNIFY = makeKeyword("REMOVAL-DATE-INTERVAL-DURATION-UNIFY");

    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("duration")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("duration")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("duration")), list(makeKeyword("BIND"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("BIND"), makeSymbol("NOT-FULLY-BOUND"))), list(list(makeKeyword("VALUE"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("NOT-FULLY-BOUND")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DATE-INTERVAL"), makeSymbol("NOT-FULLY-BOUND")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-DATE-INTERVAL-DURATION"), list(makeKeyword("VALUE"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("NOT-FULLY-BOUND"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("duration")), list(makeKeyword("VALUE"), makeSymbol("DATE-INTERVAL")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("SUPPORT-MT"), makeSymbol("*TIME-INFERENCE-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$duration <date-interval> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) ?DURATION)") });

    private static final SubLSymbol $REMOVAL_DATE_INTERVAL_DURATION_CHECK = makeKeyword("REMOVAL-DATE-INTERVAL-DURATION-CHECK");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("duration")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("duration")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("DURATION-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("duration")), list(makeKeyword("BIND"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("BIND"), makeSymbol("DURATION"))), list(list(makeKeyword("VALUE"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("DURATION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("DATE-INTERVAL"), makeSymbol("DURATION")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-DATE-INTERVAL-DURATION?"), list(makeKeyword("VALUE"), makeSymbol("DATE-INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("DURATION")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("SUPPORT-MT"), makeSymbol("*TIME-INFERENCE-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$duration <date-interval> <duration>)"), makeKeyword("EXAMPLE"), makeString("(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) (#$YearsDuration 4))") });



    private static final SubLSymbol $REMOVAL_DEFINING_TIME_UNIT_CHECK = makeKeyword("REMOVAL-DEFINING-TIME-UNIT-CHECK");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("definingTimeUnit")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("UNIT"))), list(list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("UNIT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TYPE"), makeSymbol("UNIT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-DEFINING-TIME-UNIT-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("UNIT")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$definingTimeUnit <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$definingTimeUnit #$CalendarSecond #$SecondsDuration)") });

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY = makeKeyword("REMOVAL-DEFINING-TIME-UNIT-ARG1-UNIFY");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("UNIT"))), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("SUPPORT"), makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$definingTimeUnit <not-fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$definingTimeUnit ?WHAT #$SecondsDuration)") });

    private static final SubLObject $$definingTimeUnit = reader_make_constant_shell(makeString("definingTimeUnit"));

    private static final SubLSymbol $REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY = makeKeyword("REMOVAL-DEFINING-TIME-UNIT-ARG2-UNIFY");

    private static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("definingTimeUnit")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("definingTimeUnit")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("definingTimeUnit")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$definingTimeUnit <fort> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$definingTimeUnit #$CalendarSecond ?WHAT)") });

    private static final SubLObject $$latestDateInListBeforeDate = reader_make_constant_shell(makeString("latestDateInListBeforeDate"));

    private static final SubLSymbol $REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE = makeKeyword("REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("latestDateInListBeforeDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("latestDateInListBeforeDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$latestDateInListBeforeDate <not-fully-bound> <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$latestDateInListBeforeDate ?DATE \n (#$TheList \n  (#$DayFn 5 \n   (#$MonthFn #$March \n    (#$YearFn 2012))) \n  (#$DayFn 8 \n   (#$MonthFn #$February \n    (#$YearFn 2012))) \n  (#$DayFn 10 \n   (#$MonthFn #$January \n    (#$YearFn 2012))))\n (#$DayFn 15 \n  (#$MonthFn #$February \n   (#$YearFn 2012))))\n-->\n(((?DATE #$DayFn 8 (#$MonthFn #$February (#$YearFn 2012)))))") });

    private static final SubLSymbol $DATE_LIST_ARG_IS_NOT_AN_EL_LIST = makeKeyword("DATE-LIST-ARG-IS-NOT-AN-EL-LIST");

    private static final SubLSymbol $LIMIT_DATE_ARG_IS_NOT_A_DATE = makeKeyword("LIMIT-DATE-ARG-IS-NOT-A-DATE");



    private static final SubLObject $$startingDate_Precise = reader_make_constant_shell(makeString("startingDate-Precise"));

    private static final SubLSymbol $REMOVAL_STARTING_DATE_PRECISE = makeKeyword("REMOVAL-STARTING-DATE-PRECISE");

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startingDate-Precise")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startingDate-Precise")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-STARTING-DATE-PRECISE"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate-Precise <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

    private static final SubLObject $$endingDate_Precise = reader_make_constant_shell(makeString("endingDate-Precise"));

    private static final SubLSymbol $REMOVAL_ENDING_DATE_PRECISE = makeKeyword("REMOVAL-ENDING-DATE-PRECISE");

    private static final SubLList $list61 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("endingDate-Precise")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("endingDate-Precise")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ENDING-DATE-PRECISE"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate-Precise <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    public static SubLObject inference_extract_date_year(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return NIL != date_utilities.date_p(date) ? date_utilities.extract_date_year(date) : NIL;
    }

    public static SubLObject year_of_dateP(final SubLObject year, final SubLObject date) {
        final SubLObject extracted_year = inference_extract_date_year(date);
        if (year.eql(extracted_year)) {
            return extracted_year;
        }
        return NIL;
    }

    public static SubLObject inference_extract_date_month(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return NIL != date_utilities.date_p(date) ? date_utilities.extract_date_month(date) : NIL;
    }

    public static SubLObject month_of_dateP(final SubLObject month, final SubLObject date) {
        final SubLObject extracted_month = inference_extract_date_month(date);
        if (month.equal(extracted_month)) {
            return extracted_month;
        }
        return NIL;
    }

    public static SubLObject inference_extract_date_day(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return NIL != date_utilities.date_p(date) ? date_utilities.extract_date_day(date) : NIL;
    }

    public static SubLObject day_number_of_dateP(final SubLObject day_number, final SubLObject date) {
        final SubLObject extracted_day_number = inference_extract_date_day(date);
        if (day_number.eql(extracted_day_number)) {
            return extracted_day_number;
        }
        return NIL;
    }

    public static SubLObject inference_extract_date_hour(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return NIL != date_utilities.date_p(date) ? date_utilities.extract_date_hour(date) : NIL;
    }

    public static SubLObject hour_number_of_dateP(final SubLObject hour, final SubLObject date) {
        final SubLObject extracted_hour = inference_extract_date_hour(date);
        if (hour.equal(extracted_hour)) {
            return extracted_hour;
        }
        return NIL;
    }

    public static SubLObject inference_date_interval_duration(final SubLObject date, SubLObject not_fully_bound) {
        if (not_fully_bound == UNPROVIDED) {
            not_fully_bound = NIL;
        }
        SubLObject precision = NIL;
        if (NIL != possibly_naut_p(not_fully_bound)) {
            final SubLObject operator = cycl_utilities.formula_operator(not_fully_bound);
            if (NIL != time_parameter_utilities.duration_function_p(operator)) {
                precision = operator;
            }
        }
        return time_interval_utilities.date_interval_duration(date, precision);
    }

    public static SubLObject inference_date_interval_durationP(final SubLObject interval, final SubLObject duration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject durationP = NIL;
        SubLObject catch_this = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            durationP = arithmetic.cyc_numerically_equal(time_interval_utilities.date_interval_duration(interval, time_parameter_utilities.duration_precision(duration)), duration);
        } catch (final Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        return durationP;
    }

    public static SubLObject inference_defining_time_unit_check(final SubLObject type, final SubLObject unit) {
        return eql(unit, date_utilities.inference_defining_time_unit(type));
    }

    public static SubLObject make_defining_time_unit_support(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return czer_meta.find_assertion_cycl(asent, $$BaseKB);
    }

    public static SubLObject inference_defining_time_unit_arg1_unify(final SubLObject unit) {
        return kb_mapping_utilities.fpred_value_in_any_mt(unit, $$definingTimeUnit, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject inference_defining_time_unit_arg2_unify(final SubLObject type) {
        return date_utilities.inference_defining_time_unit(type);
    }

    public static SubLObject removal_latest_date_in_list_before_date_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject date_var_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject date_list_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject limit_date_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (NIL == el_list_p(date_list_arg)) {
            return values(NIL, $DATE_LIST_ARG_IS_NOT_AN_EL_LIST);
        }
        if (NIL == date_utilities.date_p(limit_date_arg)) {
            return values($LIMIT_DATE_ARG_IS_NOT_A_DATE);
        }
        final SubLObject date_list_items = el_list_items(date_list_arg);
        SubLObject latest_date_before_date = NIL;
        SubLObject cdolist_list_var = date_list_items;
        SubLObject date_item = NIL;
        date_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != date_utilities.dateLE(date_utilities.cycl_date_initial_second(date_item), date_utilities.cycl_date_initial_second(limit_date_arg))) && ((NIL == latest_date_before_date) || (NIL != date_utilities.dateGE(date_utilities.cycl_date_initial_second(date_item), date_utilities.cycl_date_initial_second(limit_date_arg))))) {
                latest_date_before_date = date_item;
            }
            cdolist_list_var = cdolist_list_var.rest();
            date_item = cdolist_list_var.first();
        } 
        if (NIL != latest_date_before_date) {
            final SubLObject v_bindings = unification_utilities.term_unify(date_var_arg, latest_date_before_date, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_starting_date_precise(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject thing = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject assertions = NIL;
        final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (mt_name.eql($$EverythingPSC)) {
            assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, $$startingDate, ONE_INTEGER, UNPROVIDED);
        } else {
            assertions = kb_mapping_utilities.pred_value_gafs_in_mt(thing, $$startingDate, mt_name, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == assertions) {
            return NIL;
        }
        if (length(assertions).numE(ONE_INTEGER)) {
            final SubLObject assertion = cycl_utilities.formula_arg0(assertions);
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if (NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, NIL);
            }
        }
        final SubLObject most_precise_assertion = find_most_precise_date(assertions);
        if (NIL != most_precise_assertion) {
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(most_precise_assertion), UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if (NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, assertions.rest());
            }
        }
        return NIL;
    }

    public static SubLObject find_most_precise_date(final SubLObject lst_of_assertions) {
        SubLObject current_best_assertion = cycl_utilities.formula_arg0(lst_of_assertions);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst_of_assertions, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            final SubLObject current_best_date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            if ((!current_best_date.equal(date)) && (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallySubsumes, current_best_date, date, $POS, $$BaseKB))) {
                current_best_assertion = assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return current_best_assertion;
    }

    public static SubLObject removal_ending_date_precise(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject thing = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject assertions = NIL;
        final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (mt_name.eql($$EverythingPSC)) {
            assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, $$endingDate, ONE_INTEGER, UNPROVIDED);
        } else {
            assertions = kb_mapping_utilities.pred_value_gafs_in_mt(thing, $$endingDate, mt_name, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == assertions) {
            return NIL;
        }
        if (length(assertions).numE(ONE_INTEGER)) {
            final SubLObject assertion = cycl_utilities.formula_arg0(assertions);
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if (NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, NIL);
            }
        }
        final SubLObject most_precise_assertion = find_most_precise_date(assertions);
        if (NIL != most_precise_assertion) {
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(most_precise_assertion), UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if (NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, assertions.rest());
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_date_utilities_file() {
        declareFunction(me, "inference_extract_date_year", "INFERENCE-EXTRACT-DATE-YEAR", 1, 0, false);
        declareFunction(me, "year_of_dateP", "YEAR-OF-DATE?", 2, 0, false);
        declareFunction(me, "inference_extract_date_month", "INFERENCE-EXTRACT-DATE-MONTH", 1, 0, false);
        declareFunction(me, "month_of_dateP", "MONTH-OF-DATE?", 2, 0, false);
        declareFunction(me, "inference_extract_date_day", "INFERENCE-EXTRACT-DATE-DAY", 1, 0, false);
        declareFunction(me, "day_number_of_dateP", "DAY-NUMBER-OF-DATE?", 2, 0, false);
        declareFunction(me, "inference_extract_date_hour", "INFERENCE-EXTRACT-DATE-HOUR", 1, 0, false);
        declareFunction(me, "hour_number_of_dateP", "HOUR-NUMBER-OF-DATE?", 2, 0, false);
        declareFunction(me, "inference_date_interval_duration", "INFERENCE-DATE-INTERVAL-DURATION", 1, 1, false);
        declareFunction(me, "inference_date_interval_durationP", "INFERENCE-DATE-INTERVAL-DURATION?", 2, 0, false);
        declareFunction(me, "inference_defining_time_unit_check", "INFERENCE-DEFINING-TIME-UNIT-CHECK", 2, 0, false);
        declareFunction(me, "make_defining_time_unit_support", "MAKE-DEFINING-TIME-UNIT-SUPPORT", 1, 1, false);
        declareFunction(me, "inference_defining_time_unit_arg1_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY", 1, 0, false);
        declareFunction(me, "inference_defining_time_unit_arg2_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY", 1, 0, false);
        declareFunction(me, "removal_latest_date_in_list_before_date_expand", "REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_starting_date_precise", "REMOVAL-STARTING-DATE-PRECISE", 1, 1, false);
        declareFunction(me, "find_most_precise_date", "FIND-MOST-PRECISE-DATE", 1, 0, false);
        declareFunction(me, "removal_ending_date_precise", "REMOVAL-ENDING-DATE-PRECISE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_date_utilities_file() {
        defparameter("*DEFAULT-YEAR-OF-DATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-MONTH-OF-DATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_date_utilities_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$yearOfDate);
        preference_modules.doomed_unless_arg_bindable($POS, $$yearOfDate, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$yearOfDate);
        inference_modules.inference_removal_module($REMOVAL_YEAR_OF_DATE_CHECK_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_YEAR_OF_DATE_CHECK_NEG, $list6);
        inference_modules.inference_removal_module($REMOVAL_YEAR_OF_DATE_UNIFY, $list8);
        inference_modules.register_solely_specific_removal_module_predicate($$monthOfDate);
        inference_modules.inference_removal_module($REMOVAL_MONTH_OF_DATE_CHECK_POS, $list11);
        inference_modules.inference_removal_module($REMOVAL_MONTH_OF_DATE_CHECK_NEG, $list13);
        inference_modules.inference_removal_module($REMOVAL_MONTH_OF_DATE_UNIFY, $list15);
        inference_modules.register_solely_specific_removal_module_predicate($$dayNumberOfDate);
        inference_modules.inference_removal_module($REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS, $list18);
        inference_modules.inference_removal_module($REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG, $list20);
        inference_modules.inference_removal_module($REMOVAL_DAY_NUMBER_OF_DATE_UNIFY, $list22);
        inference_modules.register_solely_specific_removal_module_predicate($$hourNumberOfDate);
        inference_modules.inference_removal_module($REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS, $list25);
        inference_modules.inference_removal_module($REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG, $list27);
        inference_modules.inference_removal_module($REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY, $list29);
        inference_modules.inference_removal_module($REMOVAL_DATE_INTERVALS_INTERSECT_CHECK, $list31);
        inference_modules.inference_removal_module($REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK, $list33);
        inference_modules.inference_removal_module($REMOVAL_DATE_INTERVAL_DURATION_UNIFY, $list35);
        inference_modules.inference_removal_module($REMOVAL_DATE_INTERVAL_DURATION_CHECK, $list37);
        inference_modules.inference_removal_module($REMOVAL_DEFINING_TIME_UNIT_CHECK, $list40);
        inference_modules.inference_removal_module($REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY, $list43);
        inference_modules.inference_removal_module($REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY, $list46);
        inference_modules.register_solely_specific_removal_module_predicate($$latestDateInListBeforeDate);
        preference_modules.doomed_unless_arg_bindable($POS, $$latestDateInListBeforeDate, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$latestDateInListBeforeDate, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE, $list49);
        inference_modules.register_solely_specific_removal_module_predicate($$startingDate_Precise);
        preference_modules.doomed_unless_arg_bindable($POS, $$startingDate_Precise, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DATE_PRECISE, $list55);
        inference_modules.register_solely_specific_removal_module_predicate($$endingDate_Precise);
        preference_modules.doomed_unless_arg_bindable($POS, $$endingDate_Precise, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DATE_PRECISE, $list61);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_date_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_date_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_date_utilities_file();
    }

    
}

/**
 * Total time: 293 ms
 */
