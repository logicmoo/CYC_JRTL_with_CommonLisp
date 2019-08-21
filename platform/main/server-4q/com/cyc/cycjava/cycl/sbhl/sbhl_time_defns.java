package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_defns;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_defns.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_time_defns extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_time_defns();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_defns";

    public static final String myFingerPrint = "bede373d7984bd5b17328515bfbd4a0d3697a783b3cc541d5f4c91eecc199902";

    // Internal Constants
    public static final SubLSymbol CYC_TEMPORAL_INTERSECTION = makeSymbol("CYC-TEMPORAL-INTERSECTION");

    public static final SubLSymbol CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");

    private static final SubLObject $const2$IntervalEndedByLastSubintervalOfT = reader_make_constant_shell(makeString("IntervalEndedByLastSubintervalOfTypeFn"));

    public static final SubLSymbol CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");

    public static final SubLSymbol CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");

    private static final SubLObject $const5$IntervalStartedByFirstSubinterval = reader_make_constant_shell(makeString("IntervalStartedByFirstSubintervalOfTypeFn"));

    public static final SubLSymbol CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = makeSymbol("CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");

    public static final SubLSymbol CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLObject $const8$NthMetricallyPrecedingTimeInterva = reader_make_constant_shell(makeString("NthMetricallyPrecedingTimeIntervalOfTypeFn"));

    public static final SubLSymbol CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");

    public static final SubLSymbol CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");

    private static final SubLObject $const11$NthMetricallySucceedingTimeInterv = reader_make_constant_shell(makeString("NthMetricallySucceedingTimeIntervalOfTypeFn"));

    public static final SubLSymbol CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = makeSymbol("CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");

    public static SubLObject cyc_temporal_intersection(final SubLObject args) {
        final SubLObject result = hlmt_relevance.temporal_intersection_set(args);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_el_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (NIL == result) {
            result = make_binary_formula($const2$IntervalEndedByLastSubintervalOfT, interval, type);
        }
        return result;
    }

    public static SubLObject cyc_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_el_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (NIL == result) {
            result = make_binary_formula($const5$IntervalStartedByFirstSubinterval, interval, type);
        }
        return result;
    }

    public static SubLObject cyc_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
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

    public static SubLObject cyc_el_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            result = make_ternary_formula($const8$NthMetricallyPrecedingTimeInterva, n, interval, type);
        }
        return result;
    }

    public static SubLObject cyc_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
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

    public static SubLObject cyc_el_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (NIL == result) {
            result = make_ternary_formula($const11$NthMetricallySucceedingTimeInterv, n, interval, type);
        }
        return result;
    }

    public static SubLObject declare_sbhl_time_defns_file() {
        declareFunction(me, "cyc_temporal_intersection", "CYC-TEMPORAL-INTERSECTION", 1, 0, false);
        declareFunction(me, "cyc_interval_ended_by_last_subinterval_of_type", "CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction(me, "cyc_el_interval_ended_by_last_subinterval_of_type", "CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction(me, "cyc_interval_started_by_first_subinterval_of_type", "CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction(me, "cyc_el_interval_started_by_first_subinterval_of_type", "CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        declareFunction(me, "cyc_nth_metrically_preceding_time_interval_of_type", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction(me, "cyc_nth_metrically_preceding_time_interval_of_type_int", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        declareFunction(me, "cyc_el_nth_metrically_preceding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction(me, "cyc_nth_metrically_succeeding_time_interval_of_type", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        declareFunction(me, "cyc_nth_metrically_succeeding_time_interval_of_type_int", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        declareFunction(me, "cyc_el_nth_metrically_succeeding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
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
