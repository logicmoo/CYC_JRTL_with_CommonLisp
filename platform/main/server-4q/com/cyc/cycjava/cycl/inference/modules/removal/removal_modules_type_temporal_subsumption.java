package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_type_temporal_subsumption extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption";
    public static String myFingerPrint = "efae72f8f77143e2b7d587957ec170eec753a7f1712b066ca67bfcd5e13dc62e";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 1700L)
    private static SubLSymbol $default_temporally_subsumes_typetype_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 6000L)
    private static SubLSymbol $default_temporally_subsumes_instype_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 10100L)
    private static SubLSymbol $default_temporally_subsumed_by_instype_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13900L)
    private static SubLSymbol $time_point_subsumed_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14300L)
    private static SubLSymbol $null_param_subsumes_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14700L)
    private static SubLSymbol $temporally_subsumes_typetype_reflexive_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14900L)
    private static SubLSymbol $rae_defining_temporally_subsumes_typetype_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15200L)
    private static SubLSymbol $temporal_subsumption_of_sliding_types_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15600L)
    private static SubLSymbol $period_plus_duration_subsumes_gappy_type$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22400L)
    private static SubLSymbol $always_subsumes_everything_support$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22700L)
    private static SubLSymbol $time_point_subsumed_by_everything_support$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22900L)
    private static SubLSymbol $cooriginating_interval_of_lesser_duration_is_subsumed_support$;
    private static SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS;
    private static SubLList $list1;
    private static SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE;
    private static SubLList $list7;
    private static SubLObject $$TimeParameter;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE;
    private static SubLList $list10;
    private static SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS;
    private static SubLList $list12;
    private static SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS;
    private static SubLList $list14;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK;
    private static SubLList $list16;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES;
    private static SubLList $list18;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS;
    private static SubLList $list20;
    private static SubLObject $$temporallySubsumedBy_InsType;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK;
    private static SubLList $list24;
    private static SubLObject $$Null_TimeParameter;
    private static SubLObject $$TimePoint;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLObject $$temporallySubsumes_TypeType;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $sym31$_TIME_POINT_SUBSUMED_RULE_;
    private static SubLSymbol $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER;
    private static SubLList $list33;
    private static SubLSymbol $sym34$_NULL_PARAM_SUBSUMES_RULE_;
    private static SubLSymbol $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER;
    private static SubLList $list36;
    private static SubLSymbol $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_;
    private static SubLSymbol $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER;
    private static SubLList $list39;
    private static SubLSymbol $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_;
    private static SubLSymbol $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER;
    private static SubLList $list42;
    private static SubLSymbol $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_;
    private static SubLSymbol $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER;
    private static SubLList $list45;
    private static SubLSymbol $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_;
    private static SubLSymbol $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER;
    private static SubLList $list48;
    private static SubLSymbol $TRANSITIVITY;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLSymbol $EVAL;
    private static SubLObject $$lessThanOrEqualTo;
    private static SubLObject $$evaluate;
    private static SubLObject $$QuotientFn;
    private static SubLList $list55;
    private static SubLObject $$TimesFn;
    private static SubLSymbol $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
    private static SubLSymbol $TIME;
    private static SubLSymbol $ISA;
    private static SubLObject $$isa;
    private static SubLList $list61;
    private static SubLSymbol $QUERY;
    private static SubLObject $$periodOfTimeIntervalSeries;
    private static SubLObject $$durationOfType;
    private static SubLObject $$PlusFn;
    private static SubLSymbol $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
    private static SubLSymbol $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_;
    private static SubLSymbol $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER;
    private static SubLList $list69;
    private static SubLSymbol $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_;
    private static SubLSymbol $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER;
    private static SubLList $list72;
    private static SubLSymbol $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_;
    private static SubLSymbol $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I;
    private static SubLList $list75;
    private static SubLObject $$Always_TimeInterval;
    private static SubLObject $$temporallySubsumes;
    private static SubLSymbol $OPAQUE;
    private static SubLObject $$duration;
    private static SubLObject $$thereExists;
    private static SubLSymbol $sym81$_INTERVAL;
    private static SubLObject $$and;
    private static SubLObject $$temporallyCooriginating;
    private static SubLSymbol $DEPTH_FIRST;
    private static SubLObject $$temporallySubsumes_InsType;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3600L)
    public static SubLObject inference_temporally_subsumes_typetype(SubLObject type) {
        return all_types_temporally_subsumed_by_type(type);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3700L)
    public static SubLObject removal_temporally_subsumes_typetype_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.divide(Sequences.length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 4900L)
    public static SubLObject inference_temporally_subsumed_typetype(SubLObject type) {
        return all_types_temporally_subsuming_type(type);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 5000L)
    public static SubLObject removal_temporally_subsumed_typetype_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return Numbers.divide(Sequences.length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8000L)
    public static SubLObject inference_temporally_subsumes_instype_generate_types(SubLObject interval) {
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8200L)
    public static SubLObject removal_temporally_subsumes_instype_generate_types_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9400L)
    public static SubLObject inference_temporally_subsumed_instype_generate_intervals(SubLObject type) {
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9500L)
    public static SubLObject removal_temporally_subsumed_instype_generate_intervals_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11100L)
    public static SubLObject all_types_temporally_subsumed_by_type(SubLObject type) {
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11900L)
    public static SubLObject all_types_temporally_subsuming_type(SubLObject type) {
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12400L)
    public static SubLObject all_intervals_temporally_subsuming_type(SubLObject type) {
        return list(type);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12600L)
    public static SubLObject all_types_temporally_subsumed_by_interval(SubLObject interval) {
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12800L)
    public static SubLObject all_types_subsumed_by_sliding_type(SubLObject type) {
        SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13200L)
    public static SubLObject all_types_subsumed_by_conventional_type(SubLObject type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_all_superiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13400L)
    public static SubLObject all_types_subsuming_sliding_type(SubLObject type) {
        SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13700L)
    public static SubLObject all_types_subsuming_conventional_type(SubLObject type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_all_inferiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13900L)
    public static SubLObject time_point_subsumed_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list33, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14300L)
    public static SubLObject null_param_subsumes_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list36, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14700L)
    public static SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list39, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14900L)
    public static SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list42, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15200L)
    public static SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list45, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15600L)
    public static SubLObject period_plus_duration_subsumes_gappy_typeX_initializer() {
        return hl_supports.find_assertion_or_make_support($list48, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16000L)
    public static SubLObject why_bigger_time_typeP(SubLObject big, SubLObject small) {
        return why_temporally_subsumes_typetypeP(big, small);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16300L)
    public static SubLObject why_temporally_subsumes_typetypeP(SubLObject big, SubLObject small) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (big.equal(small)) {
            return list($temporally_subsumes_typetype_reflexive_rule$.getDynamicValue(thread));
        }
        if (big.eql($$Null_TimeParameter)) {
            return list($null_param_subsumes_rule$.getDynamicValue(thread));
        }
        if (small.eql($$TimePoint)) {
            return list($time_point_subsumed_rule$.getDynamicValue(thread));
        }
        if (NIL != time_parameter_utilities.sliding_time_type_p(big) && NIL != time_parameter_utilities.sliding_time_type_p(small)) {
            return why_sliding_time_typeLE(small, big);
        }
        if (NIL != time_parameter_utilities.conventional_time_series_p(big) && NIL != time_parameter_utilities.sliding_time_type_p(small)) {
            return why_covering_type_subsumes_sliding_typeP(big, small);
        }
        if (NIL != time_parameter_utilities.sliding_time_type_p(big) && NIL != time_parameter_utilities.conventional_time_series_p(small)) {
            return why_sliding_type_subsumes_covering_typeP(big, small);
        }
        return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, big, small), $$UniversalVocabularyMt, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 17400L)
    public static SubLObject why_sliding_time_typeLE(SubLObject small, SubLObject big) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject small_unit = time_parameter_utilities.extract_sliding_time_type(small);
        SubLObject big_unit = time_parameter_utilities.extract_sliding_time_type(big);
        SubLObject small_amount = time_parameter_utilities.extract_sliding_type_amount(small);
        SubLObject big_amount = time_parameter_utilities.extract_sliding_type_amount(big);
        if (small_unit.eql(big_unit)) {
            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, big_amount), UNPROVIDED, UNPROVIDED));
        }
        if (NIL != time_parameter_utilities.duration_typeL(small_unit, big_unit)) {
            SubLObject quotient = time_parameter_utilities.find_duration_quotient(small_unit, big_unit, UNPROVIDED);
            SubLObject product = Numbers.multiply(quotient, big_amount);
            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread),
                    arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, reader.bq_cons(big_unit, $list55), reader.bq_cons(small_unit, $list55))), UNPROVIDED, UNPROVIDED),
                    arguments.make_hl_support($EVAL, list($$evaluate, list(small_unit, product), list($$TimesFn, list(small_unit, quotient), big_amount)), UNPROVIDED, UNPROVIDED),
                    arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, product), UNPROVIDED, UNPROVIDED));
        }
        SubLObject quotient = time_parameter_utilities.find_duration_quotient(big_unit, small_unit, UNPROVIDED);
        SubLObject product = Numbers.multiply(quotient, small_amount);
        return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread),
                arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, reader.bq_cons(small_unit, $list55), reader.bq_cons(big_unit, $list55))), UNPROVIDED, UNPROVIDED),
                arguments.make_hl_support($EVAL, list($$evaluate, list(big_unit, product), list($$TimesFn, list(big_unit, quotient), small_amount)), UNPROVIDED, UNPROVIDED),
                arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, product, big_amount), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19100L)
    public static SubLObject why_covering_type_subsumes_sliding_typeP(SubLObject covering_type, SubLObject sliding_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_sliding_type = NIL;
        SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            subsumed_sliding_type = gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, covering_type, $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != subsumed_sliding_type) {
            return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, covering_type, subsumed_sliding_type), UNPROVIDED, UNPROVIDED),
                    arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, subsumed_sliding_type, sliding_type), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19900L)
    public static SubLObject first_parameterGEprevious_sliding_type(SubLObject time_parameter) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) && NIL != hlmt_relevance.sliding_time_typeLE(hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread), time_parameter)) {
            return time_parameter;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 20100L)
    public static SubLObject why_sliding_type_subsumes_covering_typeP(SubLObject sliding_type, SubLObject covering_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
            SubLObject min_subsuming_slider = hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(covering_type);
            SubLObject result = NIL;
            if (NIL != hlmt_relevance.sliding_time_typeLE(min_subsuming_slider, sliding_type)) {
                SubLObject period_dur = time_parameter_utilities.gappy_type_period(covering_type);
                SubLObject type_dur = time_parameter_utilities.gappy_type_duration(covering_type);
                result = list($period_plus_duration_subsumes_gappy_type$.getDynamicValue(thread), arguments.make_hl_support($ISA, listS($$isa, sliding_type, $list61), UNPROVIDED, UNPROVIDED),
                        arguments.make_hl_support($QUERY, list($$periodOfTimeIntervalSeries, covering_type, period_dur), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($QUERY, list($$durationOfType, covering_type, type_dur), UNPROVIDED, UNPROVIDED),
                        arguments.make_hl_support($EVAL, list($$evaluate, time_parameter_utilities.extract_sliding_type(min_subsuming_slider), list($$PlusFn, period_dur, type_dur)), UNPROVIDED, UNPROVIDED));
                if (!min_subsuming_slider.equal(sliding_type)) {
                    result = cons(arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, min_subsuming_slider), UNPROVIDED, UNPROVIDED), result);
                }
                return result;
            }
        }
        SubLObject subsuming_sliding_type = NIL;
        SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            subsuming_sliding_type = gt_methods.gt_gather_inferior($$temporallySubsumes_TypeType, covering_type, $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != subsuming_sliding_type) {
            return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, subsuming_sliding_type, covering_type), UNPROVIDED, UNPROVIDED),
                    arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, subsuming_sliding_type), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22100L)
    public static SubLObject first_parameterLEprevious_sliding_type(SubLObject time_parameter) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) && NIL != hlmt_relevance.sliding_time_typeLE(time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread))) {
            return time_parameter;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22400L)
    public static SubLObject always_subsumes_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list69, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22700L)
    public static SubLObject time_point_subsumed_by_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list72, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22900L)
    public static SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list75, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23400L)
    public static SubLObject why_time_interval_subsumes_typeP(SubLObject interval, SubLObject type) {
        return why_temporally_subsumes_instypeP(interval, type);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23700L)
    public static SubLObject why_temporally_subsumes_instypeP(SubLObject interval, SubLObject type) {
        SubLThread thread = SubLProcess.currentSubLThread();
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 24300L)
    public static SubLObject why_date_interval_subsumes_typeP(SubLObject interval, SubLObject type) {
        SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
        return witness.equal(interval) ? list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED))
                : list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes, interval, witness), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 25800L)
    public static SubLObject interval_subsumes_cooriginating_type_justification(SubLObject type, SubLObject interval) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_duration = time_parameter_utilities.get_duration_of_type(type);
        SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval(interval);
        return (NIL != type_duration && NIL != interval_duration) ? list(make_cooriginating_interval_support(type, interval), arguments.make_hl_support($QUERY, list($$durationOfType, type, type_duration), UNPROVIDED, UNPROVIDED),
                arguments.make_hl_support($OPAQUE, list($$duration, interval, interval_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, type_duration, interval_duration), UNPROVIDED, UNPROVIDED),
                $cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(thread)) : NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26400L)
    public static SubLObject make_cooriginating_interval_support(SubLObject type, SubLObject interval) {
        return arguments.make_hl_support($OPAQUE, list($$thereExists, $sym81$_INTERVAL, list($$and, list($$isa, $sym81$_INTERVAL, type), list($$temporallyCooriginating, $sym81$_INTERVAL, interval))), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26600L)
    public static SubLObject why_arbitrary_interval_subsumes_typeP(SubLObject interval, SubLObject type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_type = NIL;
        SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator($$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $DEPTH_FIRST, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = subsumed_type; NIL == done_var; done_var = makeBoolean(NIL == valid || NIL != subsumed_type)) {
            thread.resetMultipleValues();
            SubLObject subsumed_interval = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid && NIL != hlmt_relevance.arbitrary_interval_subsumes_typeP_int(subsumed_type, type)) {
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
        declareFunction(myName, "inference_temporally_subsumes_typetype", "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE", 1, 0, false);
        declareFunction(myName, "removal_temporally_subsumes_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST", 1, 1, false);
        declareFunction(myName, "inference_temporally_subsumed_typetype", "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE", 1, 0, false);
        declareFunction(myName, "removal_temporally_subsumed_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST", 1, 1, false);
        declareFunction(myName, "inference_temporally_subsumes_instype_generate_types", "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES", 1, 0, false);
        declareFunction(myName, "removal_temporally_subsumes_instype_generate_types_cost", "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST", 1, 1, false);
        declareFunction(myName, "inference_temporally_subsumed_instype_generate_intervals", "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS", 1, 0, false);
        declareFunction(myName, "removal_temporally_subsumed_instype_generate_intervals_cost", "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST", 1, 1, false);
        declareFunction(myName, "all_types_temporally_subsumed_by_type", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-TYPE", 1, 0, false);
        declareFunction(myName, "all_types_temporally_subsuming_type", "ALL-TYPES-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction(myName, "all_intervals_temporally_subsuming_type", "ALL-INTERVALS-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction(myName, "all_types_temporally_subsumed_by_interval", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-INTERVAL", 1, 0, false);
        declareFunction(myName, "all_types_subsumed_by_sliding_type", "ALL-TYPES-SUBSUMED-BY-SLIDING-TYPE", 1, 0, false);
        declareFunction(myName, "all_types_subsumed_by_conventional_type", "ALL-TYPES-SUBSUMED-BY-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction(myName, "all_types_subsuming_sliding_type", "ALL-TYPES-SUBSUMING-SLIDING-TYPE", 1, 0, false);
        declareFunction(myName, "all_types_subsuming_conventional_type", "ALL-TYPES-SUBSUMING-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction(myName, "time_point_subsumed_ruleX_initializer", "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "null_param_subsumes_ruleX_initializer", "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "temporally_subsumes_typetype_reflexive_ruleX_initializer", "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "rae_defining_temporally_subsumes_typetype_ruleX_initializer", "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "temporal_subsumption_of_sliding_types_ruleX_initializer", "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "period_plus_duration_subsumes_gappy_typeX_initializer", "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "why_bigger_time_typeP", "WHY-BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction(myName, "why_temporally_subsumes_typetypeP", "WHY-TEMPORALLY-SUBSUMES-TYPETYPE?", 2, 0, false);
        declareFunction(myName, "why_sliding_time_typeLE", "WHY-SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction(myName, "why_covering_type_subsumes_sliding_typeP", "WHY-COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction(myName, "first_parameterGEprevious_sliding_type", "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(myName, "why_sliding_type_subsumes_covering_typeP", "WHY-SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction(myName, "first_parameterLEprevious_sliding_type", "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(myName, "always_subsumes_everything_supportX_initializer", "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "time_point_subsumed_by_everything_supportX_initializer", "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer", "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(myName, "why_time_interval_subsumes_typeP", "WHY-TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(myName, "why_temporally_subsumes_instypeP", "WHY-TEMPORALLY-SUBSUMES-INSTYPE?", 2, 0, false);
        declareFunction(myName, "why_date_interval_subsumes_typeP", "WHY-DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(myName, "interval_subsumes_cooriginating_type_justification", "INTERVAL-SUBSUMES-COORIGINATING-TYPE-JUSTIFICATION", 2, 0, false);
        declareFunction(myName, "make_cooriginating_interval_support", "MAKE-COORIGINATING-INTERVAL-SUPPORT", 2, 0, false);
        declareFunction(myName, "why_arbitrary_interval_subsumes_typeP", "WHY-ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_type_temporal_subsumption_file() {
        $default_temporally_subsumes_typetype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*", ONE_INTEGER);
        $default_temporally_subsumes_instype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*", ONE_INTEGER);
        $default_temporally_subsumed_by_instype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*", ONE_INTEGER);
        $time_point_subsumed_rule$ = defvar("*TIME-POINT-SUBSUMED-RULE*", $UNINITIALIZED);
        $null_param_subsumes_rule$ = defvar("*NULL-PARAM-SUBSUMES-RULE*", $UNINITIALIZED);
        $temporally_subsumes_typetype_reflexive_rule$ = SubLFiles.defvar("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*", $UNINITIALIZED);
        $rae_defining_temporally_subsumes_typetype_rule$ = SubLFiles.defvar("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*", $UNINITIALIZED);
        $temporal_subsumption_of_sliding_types_rule$ = defvar("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*", $UNINITIALIZED);
        $period_plus_duration_subsumes_gappy_type$ = defvar("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*", $UNINITIALIZED);
        $always_subsumes_everything_support$ = defvar("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*", $UNINITIALIZED);
        $time_point_subsumed_by_everything_support$ = defvar("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*", $UNINITIALIZED);
        $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = SubLFiles.defvar("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*", $UNINITIALIZED);
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
        utilities_macros.register_kb_variable_initialization($sym31$_TIME_POINT_SUBSUMED_RULE_, $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym34$_NULL_PARAM_SUBSUMES_RULE_, $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_, $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_, $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_, $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_, $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_, $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_, $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER);
        utilities_macros.register_kb_variable_initialization($sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_, $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I);
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
        me = new removal_modules_type_temporal_subsumption();
        $default_temporally_subsumes_typetype_check_cost$ = null;
        $default_temporally_subsumes_instype_check_cost$ = null;
        $default_temporally_subsumed_by_instype_check_cost$ = null;
        $time_point_subsumed_rule$ = null;
        $null_param_subsumes_rule$ = null;
        $temporally_subsumes_typetype_reflexive_rule$ = null;
        $rae_defining_temporally_subsumes_typetype_rule$ = null;
        $temporal_subsumption_of_sliding_types_rule$ = null;
        $period_plus_duration_subsumes_gappy_type$ = null;
        $always_subsumes_everything_support$ = null;
        $time_point_subsumed_by_everything_support$ = null;
        $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = null;
        $TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS");
        $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS");
        $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-TypeType")), list(makeKeyword("BIND"), makeSymbol("BIG")), list(makeKeyword("BIND"), makeSymbol("SMALL"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("BIG"), makeSymbol("SMALL")), list(makeKeyword("CALL"), makeSymbol("BIGGER-TIME-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });
        $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-TypeType")), list(makeKeyword("BIND"), makeSymbol("BIG")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("BIG"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes-TypeType")), list(makeKeyword("VALUE"), makeSymbol("BIG")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), makeKeyword("EXAMPLE"),
                makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });
        $$TimeParameter = makeConstSym(("TimeParameter"));
        $REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SMALL"))), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes-TypeType")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SMALL"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), makeKeyword("EXAMPLE"),
                makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });
        $TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS");
        $list12 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS");
        $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("TIME-INTERVAL-SUBSUMES-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });
        $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType Interval ?X)"), makeKeyword("EXAMPLE"),
                makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });
        $REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS");
        $list20 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TYPE"))), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes-InsType")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), makeKeyword("EXAMPLE"),
                makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });
        $$temporallySubsumedBy_InsType = makeConstSym(("temporallySubsumedBy-InsType"));
        $POS = makeKeyword("POS");
        $REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumedBy-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumedBy-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumedBy-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("TIME-INTERVAL-SUBSUMED-BY-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });
        $$Null_TimeParameter = makeConstSym(("Null-TimeParameter"));
        $$TimePoint = makeConstSym(("TimePoint"));
        $list27 = list(makeConstSym(("TimePoint")));
        $list28 = list(makeConstSym(("Null-TimeParameter")));
        $$temporallySubsumes_TypeType = makeConstSym(("temporallySubsumes-TypeType"));
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $sym31$_TIME_POINT_SUBSUMED_RULE_ = makeSymbol("*TIME-POINT-SUBSUMED-RULE*");
        $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER");
        $list33 = list(makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?X"), makeConstSym(("TimeParameter"))), list(makeConstSym(("different")), makeConstSym(("TimePoint")), makeSymbol("?X"))),
                list(makeConstSym(("temporallySubsumes-TypeType")), makeSymbol("?X"), makeConstSym(("TimePoint"))));
        $sym34$_NULL_PARAM_SUBSUMES_RULE_ = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*");
        $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER");
        $list36 = list(makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?X"), makeConstSym(("TimeParameter"))), list(makeConstSym(("different")), makeConstSym(("Null-TimeParameter")), makeSymbol("?X"))),
                list(makeConstSym(("temporallySubsumes-TypeType")), makeConstSym(("Null-TimeParameter")), makeSymbol("?X")));
        $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_ = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*");
        $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER");
        $list39 = list(makeConstSym(("isa")), makeConstSym(("temporallySubsumes-TypeType")), makeConstSym(("ReflexiveBinaryPredicate")));
        $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_ = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*");
        $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER");
        $list42 = list(makeConstSym(("implies")), list(makeConstSym(("relationAllExists")), makeConstSym(("temporallySubsumes")), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")), list(makeConstSym(("temporallySubsumes-TypeType")), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")));
        $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_ = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*");
        $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER");
        $list45 = ConsesLow.list(
                makeConstSym(("implies")), list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?INT1"), list(makeConstSym(("SameLengthTimeIntervalTypeFn")), makeSymbol("?DUR1"))),
                        list(makeConstSym(("isa")), makeSymbol("?INT2"), list(makeConstSym(("SameLengthTimeIntervalTypeFn")), makeSymbol("?DUR2"))), list(makeConstSym(("lessThanOrEqualTo")), makeSymbol("?DUR1"), makeSymbol("?DUR2"))),
                list(makeConstSym(("temporallySubsumes")), makeSymbol("?INT2"), makeSymbol("?INT1")));
        $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_ = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*");
        $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER");
        $list48 = list(makeConstSym(("implies")),
                list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?TYPE"), makeConstSym(("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"))), list(makeConstSym(("periodOfTimeIntervalSeries")), makeSymbol("?TYPE"), makeSymbol("?DURATION1")),
                        list(makeConstSym(("durationOfType")), makeSymbol("?TYPE"), makeSymbol("?DURATION2"))),
                list(makeConstSym(("temporallySubsumes-TypeType")), list(makeConstSym(("SameLengthTimeIntervalTypeFn")), list(makeConstSym(("PlusFn")), makeSymbol("?DURATION1"), makeSymbol("?DURATION2"))), makeSymbol("?TYPE")));
        $TRANSITIVITY = makeKeyword("TRANSITIVITY");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $EVAL = makeKeyword("EVAL");
        $$lessThanOrEqualTo = makeConstSym(("lessThanOrEqualTo"));
        $$evaluate = makeConstSym(("evaluate"));
        $$QuotientFn = makeConstSym(("QuotientFn"));
        $list55 = list(ONE_INTEGER);
        $$TimesFn = makeConstSym(("TimesFn"));
        $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE");
        $TIME = makeKeyword("TIME");
        $ISA = makeKeyword("ISA");
        $$isa = makeConstSym(("isa"));
        $list61 = list(makeConstSym(("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")));
        $QUERY = makeKeyword("QUERY");
        $$periodOfTimeIntervalSeries = makeConstSym(("periodOfTimeIntervalSeries"));
        $$durationOfType = makeConstSym(("durationOfType"));
        $$PlusFn = makeConstSym(("PlusFn"));
        $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE");
        $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_ = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*");
        $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER");
        $list69 = list(makeConstSym(("relationInstanceAll")), makeConstSym(("timeSlices")), makeConstSym(("Always-TimeInterval")), makeConstSym(("TimeInterval")));
        $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_ = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*");
        $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER");
        $list72 = list(makeConstSym(("relationAllInstance")), makeConstSym(("temporallySubsumes")), makeConstSym(("TimeInterval")), makeConstSym(("TimePoint")));
        $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_ = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*");
        $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER");
        $list75 = list(makeConstSym(("implies")),
                list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?INTERVAL1"), makeConstSym(("TimeInterval"))), list(makeConstSym(("isa")), makeSymbol("?INTERVAL2"), makeConstSym(("TimeInterval"))), list(makeConstSym(("duration")), makeSymbol("?INTERVAL1"), makeSymbol("?DUR1")),
                        list(makeConstSym(("duration")), makeSymbol("?INTERVAL2"), makeSymbol("?DUR2")), list(makeConstSym(("lessThanOrEqualTo")), makeSymbol("?DUR2"), makeSymbol("?DUR1")), list(makeConstSym(("temporallyCooriginating")), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2"))),
                list(makeConstSym(("temporallySubsumes")), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2")));
        $$Always_TimeInterval = makeConstSym(("Always-TimeInterval"));
        $$temporallySubsumes = makeConstSym(("temporallySubsumes"));
        $OPAQUE = makeKeyword("OPAQUE");
        $$duration = makeConstSym(("duration"));
        $$thereExists = makeConstSym(("thereExists"));
        $sym81$_INTERVAL = makeSymbol("?INTERVAL");
        $$and = makeConstSym(("and"));
        $$temporallyCooriginating = makeConstSym(("temporallyCooriginating"));
        $DEPTH_FIRST = makeKeyword("DEPTH-FIRST");
        $$temporallySubsumes_InsType = makeConstSym(("temporallySubsumes-InsType"));
    }
}
/*
 *
 * Total time: 220 ms
 *
 */