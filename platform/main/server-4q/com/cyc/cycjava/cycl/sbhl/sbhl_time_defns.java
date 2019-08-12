/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-TIME-DEFNS
 * source file: /cyc/top/cycl/sbhl/sbhl-time-defns.lisp
 * created:     2019/07/03 17:37:36
 */
public final class sbhl_time_defns extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_time_defns();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_defns";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_TEMPORAL_INTERSECTION = makeSymbol("CYC-TEMPORAL-INTERSECTION");

    private static final SubLSymbol CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");

    private static final SubLObject $const2$IntervalEndedByLastSubintervalOfT = reader_make_constant_shell("IntervalEndedByLastSubintervalOfTypeFn");

    private static final SubLSymbol CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");

    private static final SubLObject $const5$IntervalStartedByFirstSubinterval = reader_make_constant_shell("IntervalStartedByFirstSubintervalOfTypeFn");

    private static final SubLSymbol CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLObject $const8$NthMetricallyPrecedingTimeInterva = reader_make_constant_shell("NthMetricallyPrecedingTimeIntervalOfTypeFn");

    private static final SubLSymbol CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLSymbol CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLObject $const11$NthMetricallySucceedingTimeInterv = reader_make_constant_shell("NthMetricallySucceedingTimeIntervalOfTypeFn");

    private static final SubLSymbol CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");

    // Definitions
    /**
     * evaluationDefn for #$TemporalIntersectionFn
     */
    @LispMethod(comment = "evaluationDefn for #$TemporalIntersectionFn")
    public static final SubLObject cyc_temporal_intersection_alt(SubLObject args) {
        {
            SubLObject result = hlmt_relevance.temporal_intersection_set(args);
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    // Definitions
    /**
     * evaluationDefn for #$TemporalIntersectionFn
     */
    @LispMethod(comment = "evaluationDefn for #$TemporalIntersectionFn")
    public static SubLObject cyc_temporal_intersection(final SubLObject args) {
        final SubLObject result = hlmt_relevance.temporal_intersection_set(args);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * evaluationDefn for #$IntervalEndedByLastSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$IntervalEndedByLastSubintervalOfTypeFn")
    public static final SubLObject cyc_interval_ended_by_last_subinterval_of_type_alt(SubLObject interval, SubLObject type) {
        {
            SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * evaluationDefn for #$IntervalEndedByLastSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$IntervalEndedByLastSubintervalOfTypeFn")
    public static SubLObject cyc_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * evaluationDefn for #$ELIntervalEndedByLastSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$ELIntervalEndedByLastSubintervalOfTypeFn")
    public static final SubLObject cyc_el_interval_ended_by_last_subinterval_of_type_alt(SubLObject interval, SubLObject type) {
        {
            SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
            if (NIL == result) {
                result = make_binary_formula($const2$IntervalEndedByLastSubintervalOfT, interval, type);
            }
            return result;
        }
    }

    /**
     * evaluationDefn for #$ELIntervalEndedByLastSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$ELIntervalEndedByLastSubintervalOfTypeFn")
    public static SubLObject cyc_el_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (NIL == result) {
            result = make_binary_formula($const2$IntervalEndedByLastSubintervalOfT, interval, type);
        }
        return result;
    }

    /**
     * evaluationDefn for #$IntervalStartedByFirstSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$IntervalStartedByFirstSubintervalOfTypeFn")
    public static final SubLObject cyc_interval_started_by_first_subinterval_of_type_alt(SubLObject interval, SubLObject type) {
        {
            SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$IntervalStartedByFirstSubintervalOfTypeFn")
    public static SubLObject cyc_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * evaluationDefn for #$ELIntervalStartedByFirstSubintervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$ELIntervalStartedByFirstSubintervalOfTypeFn")
    public static final SubLObject cyc_el_interval_started_by_first_subinterval_of_type_alt(SubLObject interval, SubLObject type) {
        {
            SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
            if (NIL == result) {
                result = make_binary_formula($const5$IntervalStartedByFirstSubinterval, interval, type);
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$ELIntervalStartedByFirstSubintervalOfTypeFn")
    public static SubLObject cyc_el_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (NIL == result) {
            result = make_binary_formula($const5$IntervalStartedByFirstSubinterval, interval, type);
        }
        return result;
    }

    /**
     * evaluationDefn for #$NthMetricallyPrecedingTimeIntervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$NthMetricallyPrecedingTimeIntervalOfTypeFn")
    public static final SubLObject cyc_nth_metrically_preceding_time_interval_of_type_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = com.cyc.cycjava.cycl.sbhl.sbhl_time_defns.cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$NthMetricallyPrecedingTimeIntervalOfTypeFn")
    public static SubLObject cyc_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject cyc_nth_metrically_preceding_time_interval_of_type_int_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = NIL;
            if ((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_interval_utilities.metric_tense_supported_type_p(type))) {
                {
                    SubLObject reference_interval = time_parameter_utilities.nth_type_ending_no_earlier_than_end_of_interval(interval, type, ZERO_INTEGER);
                    if (NIL != reference_interval) {
                        result = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(reference_interval, type, n);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject cyc_nth_metrically_preceding_time_interval_of_type_int(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = NIL;
        if ((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_interval_utilities.metric_tense_supported_type_p(type))) {
            final SubLObject reference_interval = time_parameter_utilities.nth_type_ending_no_earlier_than_end_of_interval(interval, type, ZERO_INTEGER);
            if (NIL != reference_interval) {
                result = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(reference_interval, type, n);
            }
        }
        return result;
    }

    /**
     * evaluationDefn for #$ELNthMetricallyPrecedingTimeIntervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$ELNthMetricallyPrecedingTimeIntervalOfTypeFn")
    public static final SubLObject cyc_el_nth_metrically_preceding_time_interval_of_type_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = com.cyc.cycjava.cycl.sbhl.sbhl_time_defns.cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
            if (NIL == result) {
                result = make_ternary_formula($const8$NthMetricallyPrecedingTimeInterva, n, interval, type);
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$ELNthMetricallyPrecedingTimeIntervalOfTypeFn")
    public static SubLObject cyc_el_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            result = make_ternary_formula($const8$NthMetricallyPrecedingTimeInterva, n, interval, type);
        }
        return result;
    }

    /**
     * evaluationDefn for #$NthMetricallySucceedingTimeIntervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$NthMetricallySucceedingTimeIntervalOfTypeFn")
    public static final SubLObject cyc_nth_metrically_succeeding_time_interval_of_type_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = com.cyc.cycjava.cycl.sbhl.sbhl_time_defns.cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$NthMetricallySucceedingTimeIntervalOfTypeFn")
    public static SubLObject cyc_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject cyc_nth_metrically_succeeding_time_interval_of_type_int_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = NIL;
            if ((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_interval_utilities.metric_tense_supported_type_p(type))) {
                {
                    SubLObject reference_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
                    if (NIL != reference_interval) {
                        result = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(reference_interval, type, n);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject cyc_nth_metrically_succeeding_time_interval_of_type_int(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = NIL;
        if ((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_interval_utilities.metric_tense_supported_type_p(type))) {
            final SubLObject reference_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
            if (NIL != reference_interval) {
                result = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(reference_interval, type, n);
            }
        }
        return result;
    }

    /**
     * evaluationDefn for #$ELNthMetricallySucceedingTimeIntervalOfTypeFn
     */
    @LispMethod(comment = "evaluationDefn for #$ELNthMetricallySucceedingTimeIntervalOfTypeFn")
    public static final SubLObject cyc_el_nth_metrically_succeeding_time_interval_of_type_alt(SubLObject n, SubLObject interval, SubLObject type) {
        {
            SubLObject result = com.cyc.cycjava.cycl.sbhl.sbhl_time_defns.cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
            if (NIL == result) {
                result = make_ternary_formula($const11$NthMetricallySucceedingTimeInterv, n, interval, type);
            }
            return result;
        }
    }

    @LispMethod(comment = "evaluationDefn for #$ELNthMetricallySucceedingTimeIntervalOfTypeFn")
    public static SubLObject cyc_el_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            result = make_ternary_formula($const11$NthMetricallySucceedingTimeInterv, n, interval, type);
        }
        return result;
    }

    public static SubLObject declare_sbhl_time_defns_file() {
        declareFunction("cyc_temporal_intersection", "CYC-TEMPORAL-INTERSECTION", 1, 0, false);
        declareFunction("cyc_interval_ended_by_last_subinterval_of_type", "CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction("cyc_el_interval_ended_by_last_subinterval_of_type", "CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction("cyc_interval_started_by_first_subinterval_of_type", "CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction("cyc_el_interval_started_by_first_subinterval_of_type", "CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction("cyc_nth_metrically_preceding_time_interval_of_type", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction("cyc_nth_metrically_preceding_time_interval_of_type_int", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        declareFunction("cyc_el_nth_metrically_preceding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction("cyc_nth_metrically_succeeding_time_interval_of_type", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction("cyc_nth_metrically_succeeding_time_interval_of_type_int", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        declareFunction("cyc_el_nth_metrically_succeeding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_time_defns_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_time_defns_file() {
        register_kb_function(CYC_TEMPORAL_INTERSECTION);
        register_kb_function(CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        register_kb_function(CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        register_kb_function(CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        register_kb_function(CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        register_kb_function(CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        register_kb_function(CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        register_kb_function(CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        register_kb_function(CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_defns_file();
    }

    static {
    }
}

/**
 * Total time: 74 ms
 */
