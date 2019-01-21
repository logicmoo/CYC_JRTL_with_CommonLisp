package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_defns";
    public static final String myFingerPrint = "bede373d7984bd5b17328515bfbd4a0d3697a783b3cc541d5f4c91eecc199902";
    private static final SubLSymbol $sym0$CYC_TEMPORAL_INTERSECTION;
    private static final SubLSymbol $sym1$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE;
    private static final SubLObject $const2$IntervalEndedByLastSubintervalOfT;
    private static final SubLSymbol $sym3$CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE;
    private static final SubLSymbol $sym4$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE;
    private static final SubLObject $const5$IntervalStartedByFirstSubinterval;
    private static final SubLSymbol $sym6$CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE;
    private static final SubLSymbol $sym7$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE;
    private static final SubLObject $const8$NthMetricallyPrecedingTimeInterva;
    private static final SubLSymbol $sym9$CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE;
    private static final SubLSymbol $sym10$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE;
    private static final SubLObject $const11$NthMetricallySucceedingTimeInterv;
    private static final SubLSymbol $sym12$CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 853L)
    public static SubLObject cyc_temporal_intersection(final SubLObject args) {
        final SubLObject result = hlmt_relevance.temporal_intersection_set(args);
        if (sbhl_time_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 1164L)
    public static SubLObject cyc_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (sbhl_time_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 1588L)
    public static SubLObject cyc_el_interval_ended_by_last_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, type);
        if (sbhl_time_defns.NIL == result) {
            result = el_utilities.make_binary_formula(sbhl_time_defns.$const2$IntervalEndedByLastSubintervalOfT, interval, type);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 2093L)
    public static SubLObject cyc_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        final SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (sbhl_time_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 2535L)
    public static SubLObject cyc_el_interval_started_by_first_subinterval_of_type(final SubLObject interval, final SubLObject type) {
        SubLObject result = time_parameter_utilities.time_started_by_first_type_in_interval(interval, type);
        if (sbhl_time_defns.NIL == result) {
            result = el_utilities.make_binary_formula(sbhl_time_defns.$const5$IntervalStartedByFirstSubinterval, interval, type);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 3061L)
    public static SubLObject cyc_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (sbhl_time_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 3528L)
    public static SubLObject cyc_nth_metrically_preceding_time_interval_of_type_int(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = (SubLObject)sbhl_time_defns.NIL;
        if (sbhl_time_defns.NIL != time_interval_utilities.date_interval_p(interval) && sbhl_time_defns.NIL != time_interval_utilities.metric_tense_supported_type_p(type)) {
            final SubLObject reference_interval = time_parameter_utilities.nth_type_ending_no_earlier_than_end_of_interval(interval, type, (SubLObject)sbhl_time_defns.ZERO_INTEGER);
            if (sbhl_time_defns.NIL != reference_interval) {
                result = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(reference_interval, type, n);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 3966L)
    public static SubLObject cyc_el_nth_metrically_preceding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_preceding_time_interval_of_type_int(n, interval, type);
        if (sbhl_time_defns.NIL == result) {
            result = el_utilities.make_ternary_formula(sbhl_time_defns.$const8$NthMetricallyPrecedingTimeInterva, n, interval, type);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 4521L)
    public static SubLObject cyc_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        final SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (sbhl_time_defns.NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 4994L)
    public static SubLObject cyc_nth_metrically_succeeding_time_interval_of_type_int(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = (SubLObject)sbhl_time_defns.NIL;
        if (sbhl_time_defns.NIL != time_interval_utilities.date_interval_p(interval) && sbhl_time_defns.NIL != time_interval_utilities.metric_tense_supported_type_p(type)) {
            final SubLObject reference_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, (SubLObject)sbhl_time_defns.ZERO_INTEGER);
            if (sbhl_time_defns.NIL != reference_interval) {
                result = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(reference_interval, type, n);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-defns.lisp", position = 5437L)
    public static SubLObject cyc_el_nth_metrically_succeeding_time_interval_of_type(final SubLObject n, final SubLObject interval, final SubLObject type) {
        SubLObject result = cyc_nth_metrically_succeeding_time_interval_of_type_int(n, interval, type);
        if (sbhl_time_defns.NIL == result) {
            result = el_utilities.make_ternary_formula(sbhl_time_defns.$const11$NthMetricallySucceedingTimeInterv, n, interval, type);
        }
        return result;
    }
    
    public static SubLObject declare_sbhl_time_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_temporal_intersection", "CYC-TEMPORAL-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_interval_ended_by_last_subinterval_of_type", "CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_el_interval_ended_by_last_subinterval_of_type", "CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_interval_started_by_first_subinterval_of_type", "CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_el_interval_started_by_first_subinterval_of_type", "CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_nth_metrically_preceding_time_interval_of_type", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_nth_metrically_preceding_time_interval_of_type_int", "CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_el_nth_metrically_preceding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_nth_metrically_succeeding_time_interval_of_type", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_nth_metrically_succeeding_time_interval_of_type_int", "CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_defns", "cyc_el_nth_metrically_succeeding_time_interval_of_type", "CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE", 3, 0, false);
        return (SubLObject)sbhl_time_defns.NIL;
    }
    
    public static SubLObject init_sbhl_time_defns_file() {
        return (SubLObject)sbhl_time_defns.NIL;
    }
    
    public static SubLObject setup_sbhl_time_defns_file() {
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym0$CYC_TEMPORAL_INTERSECTION);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym1$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym3$CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym4$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym6$CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym7$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym9$CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym10$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_defns.$sym12$CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE);
        return (SubLObject)sbhl_time_defns.NIL;
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
        me = (SubLFile)new sbhl_time_defns();
        $sym0$CYC_TEMPORAL_INTERSECTION = SubLObjectFactory.makeSymbol("CYC-TEMPORAL-INTERSECTION");
        $sym1$CYC_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");
        $const2$IntervalEndedByLastSubintervalOfT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByLastSubintervalOfTypeFn"));
        $sym3$CYC_EL_INTERVAL_ENDED_BY_LAST_SUBINTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-EL-INTERVAL-ENDED-BY-LAST-SUBINTERVAL-OF-TYPE");
        $sym4$CYC_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");
        $const5$IntervalStartedByFirstSubinterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFirstSubintervalOfTypeFn"));
        $sym6$CYC_EL_INTERVAL_STARTED_BY_FIRST_SUBINTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-EL-INTERVAL-STARTED-BY-FIRST-SUBINTERVAL-OF-TYPE");
        $sym7$CYC_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");
        $const8$NthMetricallyPrecedingTimeInterva = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthMetricallyPrecedingTimeIntervalOfTypeFn"));
        $sym9$CYC_EL_NTH_METRICALLY_PRECEDING_TIME_INTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-EL-NTH-METRICALLY-PRECEDING-TIME-INTERVAL-OF-TYPE");
        $sym10$CYC_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");
        $const11$NthMetricallySucceedingTimeInterv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthMetricallySucceedingTimeIntervalOfTypeFn"));
        $sym12$CYC_EL_NTH_METRICALLY_SUCCEEDING_TIME_INTERVAL_OF_TYPE = SubLObjectFactory.makeSymbol("CYC-EL-NTH-METRICALLY-SUCCEEDING-TIME-INTERVAL-OF-TYPE");
    }
}

/*

	Total time: 74 ms
	
*/