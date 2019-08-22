package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hlmt_relevance extends SubLTranslatedFile {
    public static final SubLFile me = new hlmt_relevance();

    public static final String myName = "com.cyc.cycjava.cycl.hlmt_relevance";

    public static final String myFingerPrint = "ad79486bde89714a57bba28603678baedfc31cb51728e73af32275d42352fc3e";



    // defparameter
    public static final SubLSymbol $hlmt_sliding_type$ = makeSymbol("*HLMT-SLIDING-TYPE*");

    // deflexical
    private static final SubLSymbol $date_range_time_mt_pattern$ = makeSymbol("*DATE-RANGE-TIME-MT-PATTERN*");

    // defparameter
    public static final SubLSymbol $temporal_intersection_call_args$ = makeSymbol("*TEMPORAL-INTERSECTION-CALL-ARGS*");

    // defparameter
    public static final SubLSymbol $disable_temporal_indexical_supportP$ = makeSymbol("*DISABLE-TEMPORAL-INDEXICAL-SUPPORT?*");

    // defparameter
    public static final SubLSymbol $mub_sliding_and_gappy_types_result$ = makeSymbol("*MUB-SLIDING-AND-GAPPY-TYPES-RESULT*");

    // defparameter
    public static final SubLSymbol $param_max_upper_bound$ = makeSymbol("*PARAM-MAX-UPPER-BOUND*");

    // Internal Constants
    public static final SubLSymbol $time_inference_mt$ = makeSymbol("*TIME-INFERENCE-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell(makeString("temporallySubsumes-TypeType"));

    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell(makeString("temporallySubsumes-InsType"));

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    public static final SubLSymbol $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("PARAMETER>=PREVIOUS-SLIDING-TYPE");

    public static final SubLSymbol $sym9$PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("PARAMETER<=PREVIOUS-SLIDING-TYPE");





    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    public static final SubLSymbol $sym13$_X = makeSymbol("?X");



    public static final SubLSymbol $sym15$DATE_ = makeSymbol("DATE<");

    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    public static final SubLSymbol $sym17$DATE_ = makeSymbol("DATE>");

    public static final SubLSymbol EXTRACT_HLMT_TEMPORAL_INDEX_OR_DEFAULT = makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT");

    public static final SubLSymbol $sym19$ALWAYS_TIME_INTERVAL_ = makeSymbol("ALWAYS-TIME-INTERVAL?");

    public static final SubLSymbol $sym20$CONTAINS_INDEXICAL_ = makeSymbol("CONTAINS-INDEXICAL?");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    public static final SubLSymbol CYCL_TIME_INDEX_START = makeSymbol("CYCL-TIME-INDEX-START");

    public static final SubLSymbol CYCL_TIME_INDEX_END = makeSymbol("CYCL-TIME-INDEX-END");

    public static final SubLSymbol EXTRACT_HLMT_TIME_PARAMETER = makeSymbol("EXTRACT-HLMT-TIME-PARAMETER");

    public static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");

    private static final SubLList $list26 = list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("TEST"), makeSymbol("SIMPLE-EL-DATE-P")), list(makeKeyword("TEST"), makeSymbol("SIMPLE-EL-DATE-P"))), reader_make_constant_shell(makeString("TimePoint")));



    private static final SubLSymbol $FAST_INTERSECT_UNSUPPORTED = makeKeyword("FAST-INTERSECT-UNSUPPORTED");

    private static final SubLObject $$TheEmptyTimeInterval = reader_make_constant_shell(makeString("TheEmptyTimeInterval"));

    private static final SubLSymbol $sym30$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"));

    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLString $str34$One_same_length_duration_paramete = makeString("One same length duration parameter should subsume another ~a ~a~%");

    private static final SubLSymbol MUB_GATHER_SUBSUMED_SLIDING_TYPES = makeSymbol("MUB-GATHER-SUBSUMED-SLIDING-TYPES");

    private static final SubLInteger $int$128 = makeInteger(128);



    public static SubLObject hlmt_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_mt_monad = hlmt.hlmt_monad_mt(spec_mt);
        final SubLObject genl_mt_monad = hlmt.hlmt_monad_mt(genl_mt);
        SubLObject hlmt_visibleP = NIL;
        if (NIL != genl_mts.monad_genl_mtP(spec_mt_monad, genl_mt_monad, UNPROVIDED, UNPROVIDED)) {
            final SubLObject mt_var = spec_mt_monad;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != mt_temporally_visible_p(spec_mt, genl_mt)) {
                    hlmt_visibleP = T;
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return hlmt_visibleP;
    }

    public static SubLObject mt_temporally_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (NIL != hlmt.atemporal_hlmtP(genl_mt)) {
            return T;
        }
        if (NIL != hlmt.atemporal_hlmtP(spec_mt)) {
            return temporal_mt_visible_to_atemporal_mtP(genl_mt, spec_mt);
        }
        return temporal_mts_visible_p(spec_mt, genl_mt);
    }

    public static SubLObject why_hlmt_visible_p(final SubLObject spec_mt, final SubLObject genl_mt, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_mt_monad = hlmt.hlmt_monad_mt(spec_mt);
        final SubLObject genl_mt_monad = hlmt.hlmt_monad_mt(genl_mt);
        final SubLObject monad_just = genl_mts.why_monad_genl_mtP(spec_mt_monad, genl_mt_monad, mt_mt, tv, behavior);
        SubLObject just = NIL;
        if (NIL != monad_just) {
            final SubLObject mt_var = spec_mt_monad;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                thread.resetMultipleValues();
                final SubLObject time_just = why_mt_temporally_visible_p(spec_mt, genl_mt);
                final SubLObject time_just_validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != time_just_validP) {
                    just = append(monad_just, time_just);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return just;
    }

    public static SubLObject why_mt_temporally_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (NIL != hlmt.atemporal_hlmtP(genl_mt)) {
            return values(NIL, T);
        }
        if (NIL != hlmt.atemporal_hlmtP(spec_mt)) {
            final SubLObject just = why_temporal_mt_visible_to_atemporal_mtP(genl_mt, spec_mt);
            return values(just, list_utilities.sublisp_boolean(just));
        }
        final SubLObject just = why_temporal_mts_visible_p(spec_mt, genl_mt);
        return values(just, list_utilities.sublisp_boolean(just));
    }

    public static SubLObject temporal_mt_visible_to_atemporal_mtP(final SubLObject genl_mt, final SubLObject spec_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_time_index = hlmt.$default_mt_time_interval$.getGlobalValue();
        final SubLObject spec_time_param = hlmt.$default_atemporal_specmt_time_parameter$.getGlobalValue();
        SubLObject genl_time_index = NIL;
        SubLObject genl_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject genl_time_index_$1 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject genl_time_param_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        genl_time_index = genl_time_index_$1;
        genl_time_param = genl_time_param_$2;
        return mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
    }

    public static SubLObject temporal_mts_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec_time_index = NIL;
        SubLObject spec_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject spec_time_index_$3 = hlmt.explode_hlmt_temporal_facets(spec_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject spec_time_param_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        spec_time_index = spec_time_index_$3;
        spec_time_param = spec_time_param_$4;
        SubLObject genl_time_index = NIL;
        SubLObject genl_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject genl_time_index_$5 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject genl_time_param_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        genl_time_index = genl_time_index_$5;
        genl_time_param = genl_time_param_$6;
        return mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
    }

    public static SubLObject why_temporal_mt_visible_to_atemporal_mtP(final SubLObject genl_mt, final SubLObject spec_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec_time_index = hlmt.$default_mt_time_interval$.getGlobalValue();
        final SubLObject spec_time_param = hlmt.$default_atemporal_specmt_time_parameter$.getGlobalValue();
        SubLObject genl_time_index = NIL;
        SubLObject genl_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject genl_time_index_$7 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject genl_time_param_$8 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        genl_time_index = genl_time_index_$7;
        genl_time_param = genl_time_param_$8;
        return why_mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
    }

    public static SubLObject why_temporal_mts_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec_time_index = NIL;
        SubLObject spec_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject spec_time_index_$9 = hlmt.explode_hlmt_temporal_facets(spec_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject spec_time_param_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        spec_time_index = spec_time_index_$9;
        spec_time_param = spec_time_param_$10;
        SubLObject genl_time_index = NIL;
        SubLObject genl_time_param = NIL;
        thread.resetMultipleValues();
        final SubLObject genl_time_index_$11 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject genl_time_param_$12 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        genl_time_index = genl_time_index_$11;
        genl_time_param = genl_time_param_$12;
        return why_mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
    }

    public static SubLObject mt_time_interval_subsumes(final SubLObject genl_mt, final SubLObject spec_mt) {
        SubLObject spec_time = hlmt.extract_hlmt_temporal_index(spec_mt);
        SubLObject genl_time = hlmt.extract_hlmt_temporal_index(genl_mt);
        spec_time = date_utilities.possibly_bind_temporal_indexical_in_object(spec_time);
        genl_time = date_utilities.possibly_bind_temporal_indexical_in_object(genl_time);
        return subsumed_time_intervalP(spec_time, genl_time);
    }

    public static SubLObject mt_times_visible_p(SubLObject interval_1, SubLObject interval_2, final SubLObject parameter_1, final SubLObject parameter_2) {
        interval_1 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_1);
        interval_2 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_2);
        return makeBoolean(((NIL != subsumed_time_intervalP(interval_1, interval_2)) && (NIL != bigger_time_typeP(parameter_1, parameter_2))) && (interval_1.equal(interval_2) || (NIL != time_interval_subsumes_typeP(interval_1, parameter_2))));
    }

    public static SubLObject why_mt_times_visible_p(SubLObject interval_1, SubLObject interval_2, final SubLObject parameter_1, final SubLObject parameter_2) {
        SubLObject just = NIL;
        interval_1 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_1);
        interval_2 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_2);
        if (NIL != subsumed_time_intervalP(interval_1, interval_2)) {
            final SubLObject subsumed_time_interval_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes, interval_2, interval_1), UNPROVIDED, UNPROVIDED);
            if (NIL != bigger_time_typeP(parameter_1, parameter_2)) {
                final SubLObject bigger_time_type_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_TypeType, parameter_1, parameter_2), UNPROVIDED, UNPROVIDED);
                if (interval_1.equal(interval_2)) {
                    just = list(subsumed_time_interval_support, bigger_time_type_support);
                } else
                    if (NIL != time_interval_subsumes_typeP(interval_1, parameter_2)) {
                        final SubLObject time_interval_subsumes_type_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_InsType, interval_1, parameter_2), UNPROVIDED, UNPROVIDED);
                        just = list(subsumed_time_interval_support, bigger_time_type_support, time_interval_subsumes_type_support);
                    }

            }
        }
        return just;
    }

    public static SubLObject subsumed_time_intervalP(final SubLObject small, final SubLObject big) {
        if (NIL != date_utilities.always_time_intervalP(big)) {
            return T;
        }
        if (NIL != date_utilities.always_time_intervalP(small)) {
            return NIL;
        }
        if (small.equal(big)) {
            return T;
        }
        if ((NIL != time_interval_utilities.date_interval_p(small)) && (NIL != time_interval_utilities.date_interval_p(big))) {
            return time_interval_utilities.date_interval_subsumesP(big, small);
        }
        return sbhl_time_modules.temporally_subsumesP(big, small, UNPROVIDED);
    }

    public static SubLObject bigger_time_typeP(final SubLObject big, final SubLObject small) {
        if (big.eql($$Null_TimeParameter)) {
            return T;
        }
        if (small.eql($$Null_TimeParameter)) {
            return NIL;
        }
        if (small.eql($$TimePoint)) {
            return T;
        }
        if (big.eql($$TimePoint)) {
            return NIL;
        }
        if (big.equal(small)) {
            return T;
        }
        if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
            return sliding_time_typeLE(small, big);
        }
        if ((NIL != time_parameter_utilities.conventional_time_series_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
            return covering_type_subsumes_sliding_typeP(big, small);
        }
        if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.conventional_time_series_p(small))) {
            return sliding_type_subsumes_covering_typeP(big, small);
        }
        return ghl_search_methods.ghl_predicate_relation_p($$temporallySubsumes_TypeType, big, small, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sliding_time_typeLE(final SubLObject type1, final SubLObject type2) {
        final SubLObject type1_unit = time_parameter_utilities.extract_sliding_time_type(type1);
        final SubLObject type2_unit = time_parameter_utilities.extract_sliding_time_type(type2);
        final SubLObject type1_amount = time_parameter_utilities.extract_sliding_type_amount(type1);
        final SubLObject type2_amount = time_parameter_utilities.extract_sliding_type_amount(type2);
        if (type1_unit.eql(type2_unit)) {
            return numLE(type1_amount, type2_amount);
        }
        if (NIL != time_parameter_utilities.duration_typeL(type1_unit, type2_unit)) {
            return numLE(type1_amount, multiply(time_parameter_utilities.find_duration_quotient(type1_unit, type2_unit, UNPROVIDED), type2_amount));
        }
        return numLE(multiply(type1_amount, time_parameter_utilities.find_duration_quotient(type2_unit, type1_unit, UNPROVIDED)), type2_amount);
    }

    public static SubLObject covering_type_subsumes_sliding_typeP(final SubLObject covering_type, final SubLObject sliding_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            $hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, covering_type, $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            $hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sliding_type_subsumes_covering_typeP(final SubLObject sliding_type, final SubLObject covering_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
            final SubLObject subsuming_slider = minimally_subsuming_sliding_type_for_gappy_type(covering_type);
            return NIL != subsuming_slider ? sliding_time_typeLE(subsuming_slider, sliding_type) : NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            $hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_gather_inferior($$temporallySubsumes_TypeType, covering_type, $sym9$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            $hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject parameterLEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? sliding_time_typeLE(time_parameter, $hlmt_sliding_type$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject parameterGEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? sliding_time_typeLE($hlmt_sliding_type$.getDynamicValue(thread), time_parameter) : NIL;
    }

    public static SubLObject time_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        if (NIL != date_utilities.always_time_intervalP(interval)) {
            return T;
        }
        if (NIL != date_utilities.empty_time_intervalP(interval)) {
            return NIL;
        }
        if (type.eql($$Null_TimeParameter)) {
            return NIL;
        }
        if (NIL != time_parameter_utilities.time_point_type_p(type)) {
            return T;
        }
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            return time_parameter_utilities.date_interval_subsumes_typeP(interval, type);
        }
        return arbitrary_interval_subsumes_typeP(interval, type);
    }

    public static SubLObject time_interval_subsumed_by_typeP(final SubLObject interval, final SubLObject type) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            return time_parameter_utilities.date_interval_subsumed_by_typeP(interval, type);
        }
        return NIL;
    }

    public static SubLObject arbitrary_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start = starting_date(interval, UNPROVIDED);
        final SubLObject end = ending_date(interval, UNPROVIDED);
        if ((NIL != start) && (NIL != end)) {
            return time_parameter_utilities.date_interval_subsumes_typeP(date_from_to(start, end), type);
        }
        SubLObject subsumes_typeP = NIL;
        final SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator($$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $DEPTH_FIRST, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = subsumes_typeP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != subsumes_typeP))) {
            thread.resetMultipleValues();
            final SubLObject subsumed_interval = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL != arbitrary_interval_subsumes_typeP_int(subsumed_interval, type))) {
                subsumes_typeP = T;
            }
        }
        return subsumes_typeP;
    }

    public static SubLObject arbitrary_interval_subsumes_typeP_int(final SubLObject interval, final SubLObject type) {
        return makeBoolean(((((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_parameter_utilities.date_interval_subsumes_typeP(interval, type))) || (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED))) || ((NIL != indexed_term_p(interval)) && (NIL != list_utilities.member_equalP(type, kb_mapping_utilities.pred_values(interval, $$temporallySubsumes_InsType, ONE_INTEGER, TWO_INTEGER, $TRUE))))) || ((NIL != indexed_term_p(type)) && (NIL != list_utilities.member_equalP(interval, kb_mapping_utilities.pred_values(type, $$temporallySubsumes_InsType, TWO_INTEGER, ONE_INTEGER, $TRUE)))));
    }

    public static SubLObject starting_date(final SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject v_bindings = inference_trivial.new_cyc_trivial_query(make_binary_formula($$startingDate, interval, $sym13$_X), mt, UNPROVIDED);
        final SubLObject dates = Mapping.mapcar(CDAR, v_bindings);
        final SubLObject date = list_utilities.extremal(dates, $sym15$DATE_, UNPROVIDED);
        return date;
    }

    public static SubLObject ending_date(final SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject v_bindings = inference_trivial.new_cyc_trivial_query(make_binary_formula($$endingDate, interval, $sym13$_X), mt, UNPROVIDED);
        final SubLObject dates = Mapping.mapcar(CDAR, v_bindings);
        final SubLObject date = list_utilities.extremal(dates, $sym17$DATE_, UNPROVIDED);
        return date;
    }

    public static SubLObject max_floor_polyad_mts(final SubLObject hlmts, SubLObject candidates, SubLObject mt_mt, SubLObject prune_cyclesP) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (prune_cyclesP == UNPROVIDED) {
            prune_cyclesP = NIL;
        }
        if (NIL == hlmts) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(hlmts)) {
            return NIL != candidates ? keyhash_utilities.fast_intersection(hlmts, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED) : hlmts;
        }
        final SubLObject intersection = temporal_index_intersection(hlmts);
        final SubLObject mubs = (NIL != intersection) ? time_parameter_mubs(hlmts) : NIL;
        final SubLObject monads = (NIL != mubs) ? max_floor_monads(hlmts, mt_mt, prune_cyclesP) : NIL;
        SubLObject result = NIL;
        if (NIL != monads) {
            SubLObject cdolist_list_var = mubs;
            SubLObject param = NIL;
            param = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$13 = monads;
                SubLObject monad = NIL;
                monad = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    result = cons(hlmt.new_temporal_hlmt(monad, intersection, param), result);
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    monad = cdolist_list_var_$13.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                param = cdolist_list_var.first();
            } 
        }
        return NIL != candidates ? keyhash_utilities.fast_intersection(result, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED) : result;
    }

    public static SubLObject temporal_index_intersection(SubLObject hlmts) {
        SubLObject temporal_indexes = Mapping.mapcar(EXTRACT_HLMT_TEMPORAL_INDEX_OR_DEFAULT, hlmts);
        temporal_indexes = remove_if($sym19$ALWAYS_TIME_INTERVAL_, temporal_indexes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.any_in_list($sym20$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED)) && (NIL == list_utilities.every_in_list($sym20$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED))) {
            hlmts = date_utilities.bind_temporal_indexicals_in_hlmt_list(hlmts);
        }
        final SubLObject pcase_var = length(temporal_indexes);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $$Always_TimeInterval;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return temporal_indexes.first();
        }
        final SubLObject starts = Mapping.mapcar(CYCL_TIME_INDEX_START, temporal_indexes);
        final SubLObject ends = Mapping.mapcar(CYCL_TIME_INDEX_END, temporal_indexes);
        final SubLObject last_start = date_utilities.last_among_time_indexes(starts);
        final SubLObject first_end = date_utilities.first_among_time_indexes(ends);
        return ((NIL == last_start) || (NIL == first_end)) || (NIL != sbhl_time_modules.starts_after_ending_ofP(last_start, first_end, UNPROVIDED)) ? NIL : date_from_to(last_start, first_end);
    }

    public static SubLObject time_parameter_mubs(final SubLObject hlmts) {
        final SubLObject params = Mapping.mapcar(EXTRACT_HLMT_TIME_PARAMETER, hlmts);
        SubLObject mub = params.first();
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = params.rest();
            SubLObject param = NIL;
            param = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                mub = time_parameter_mub(mub, param);
                if (NIL == mub) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                param = csome_list_var.first();
            } 
        }
        return list(mub);
    }

    public static SubLObject max_floor_monads(final SubLObject hlmts, final SubLObject mt_mt, final SubLObject prune_cyclesP) {
        return NIL != prune_cyclesP ? genl_mts.max_floor_monad_mts_with_cycles_pruned(Mapping.mapcar(HLMT_MONAD_MT, hlmts), NIL, mt_mt) : genl_mts.max_floor_monad_mts(Mapping.mapcar(HLMT_MONAD_MT, hlmts), NIL, mt_mt);
    }

    public static SubLObject temporal_mts_intersect_fastP(final SubLObject time_mt1, final SubLObject time_mt2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject validP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if ((NIL != pattern_match.pattern_matches_tree_without_bindings($date_range_time_mt_pattern$.getGlobalValue(), time_mt1)) && (NIL != pattern_match.pattern_matches_tree_without_bindings($date_range_time_mt_pattern$.getGlobalValue(), time_mt2))) {
                        final SubLObject range1 = cycl_utilities.el_formula_arg1(time_mt1, UNPROVIDED);
                        final SubLObject range2 = cycl_utilities.el_formula_arg1(time_mt2, UNPROVIDED);
                        final SubLObject start1 = cycl_utilities.el_formula_arg1(range1, UNPROVIDED);
                        final SubLObject end1 = cycl_utilities.el_formula_arg2(range1, UNPROVIDED);
                        final SubLObject start2 = cycl_utilities.el_formula_arg1(range2, UNPROVIDED);
                        final SubLObject end2 = cycl_utilities.el_formula_arg2(range2, UNPROVIDED);
                        result = makeBoolean((NIL != date_utilities.fast_date_LE(start2, end1)) && (NIL != date_utilities.fast_date_LE(start1, end2)));
                        validP = T;
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
        if ((NIL != error_message) || (NIL == validP)) {
            return $FAST_INTERSECT_UNSUPPORTED;
        }
        return result;
    }

    public static SubLObject temporal_mt_intersection_setP(final SubLObject mts) {
        return list_utilities.sublisp_boolean(temporal_mt_intersection_set(mts));
    }

    public static SubLObject temporal_mts_intersectP(final SubLObject mt_1, final SubLObject mt_2) {
        final SubLObject intersect_fastP = temporal_mts_intersect_fastP(mt_1, mt_2);
        if (intersect_fastP != $FAST_INTERSECT_UNSUPPORTED) {
            return intersect_fastP;
        }
        return list_utilities.sublisp_boolean(temporal_mt_intersection(mt_1, mt_2));
    }

    public static SubLObject temporal_mt_intersection_set(final SubLObject mts) {
        return NIL == mts ? hlmt.new_time_dimension($$Always_TimeInterval, $$TimePoint) : temporal_mt_intersection(mts.first(), temporal_mt_intersection_set(mts.rest()));
    }

    public static SubLObject temporal_mt_intersection(final SubLObject mt_1, final SubLObject mt_2) {
        if ((NIL == mt_1) || (NIL == mt_2)) {
            return NIL;
        }
        if (NIL != hlmt.hlmt_equalP(mt_1, mt_2)) {
            return mt_1;
        }
        final SubLObject index_1 = hlmt.extract_hlmt_temporal_index_or_default(mt_1);
        final SubLObject param_1 = hlmt.extract_hlmt_time_parameter(mt_1);
        final SubLObject index_2 = hlmt.extract_hlmt_temporal_index_or_default(mt_2);
        final SubLObject param_2 = hlmt.extract_hlmt_time_parameter(mt_2);
        final SubLObject new_index = temporal_intersection(index_1, index_2);
        if ((NIL == new_index) || (NIL != date_utilities.empty_time_intervalP(new_index))) {
            return NIL;
        }
        if (param_1.eql($$Null_TimeParameter)) {
            if (NIL == subsumed_time_intervalP(index_1, new_index)) {
                return NIL;
            }
        } else
            if (NIL == time_interval_subsumes_typeP(new_index, param_1)) {
                return NIL;
            }

        if (param_2.eql($$Null_TimeParameter)) {
            if (NIL == subsumed_time_intervalP(index_2, new_index)) {
                return NIL;
            }
        } else
            if (NIL == time_interval_subsumes_typeP(new_index, param_2)) {
                return NIL;
            }

        return hlmt.new_time_dimension(new_index, NIL != bigger_time_typeP(param_1, param_2) ? param_1 : param_2);
    }

    public static SubLObject temporal_intersection_set(final SubLObject intervals) {
        return NIL == intervals ? $$Always_TimeInterval : temporal_intersection(intervals.first(), temporal_intersection_set(intervals.rest()));
    }

    public static SubLObject temporal_intersection(final SubLObject interval_1, final SubLObject interval_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(list(interval_1, interval_2), $temporal_intersection_call_args$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $temporal_intersection_call_args$.currentBinding(thread);
        try {
            $temporal_intersection_call_args$.bind(cons(list(interval_1, interval_2), $temporal_intersection_call_args$.getDynamicValue(thread)), thread);
            result = temporal_intersection_int(interval_1, interval_2);
        } finally {
            $temporal_intersection_call_args$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject temporal_intersection_int(final SubLObject interval_1, final SubLObject interval_2) {
        if (NIL != subsumed_time_intervalP(interval_2, interval_1)) {
            return interval_2;
        }
        if (NIL != subsumed_time_intervalP(interval_1, interval_2)) {
            return interval_1;
        }
        if (NIL != empty_temporal_intersectionP(interval_1, interval_2)) {
            return $$TheEmptyTimeInterval;
        }
        final SubLObject start_1 = time_interval_utilities.cycl_interval_initial_second(interval_1);
        final SubLObject start_2 = time_interval_utilities.cycl_interval_initial_second(interval_2);
        final SubLObject end_1 = time_interval_utilities.cycl_interval_final_second(interval_1);
        final SubLObject end_2 = time_interval_utilities.cycl_interval_final_second(interval_2);
        if ((((NIL == start_1) || (NIL == start_2)) || (NIL == end_1)) || (NIL == end_2)) {
            return NIL;
        }
        if (NIL != date_utilities.dateLE(start_1, start_2)) {
            return date_from_to(start_2, end_1);
        }
        return date_from_to(start_1, end_2);
    }

    public static SubLObject empty_temporal_intersectionP(final SubLObject interval_1, final SubLObject interval_2) {
        if ((NIL != date_utilities.empty_time_intervalP(interval_1)) || (NIL != date_utilities.empty_time_intervalP(interval_2))) {
            return T;
        }
        if ((NIL != time_interval_utilities.date_interval_p(interval_1)) && (NIL != time_interval_utilities.date_interval_p(interval_2))) {
            return makeBoolean(NIL == time_interval_utilities.date_intervals_intersectP(interval_1, interval_2, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != sbhl_time_modules.not_temporally_intersectsP(interval_1, interval_2, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject date_from_to(final SubLObject date_1, final SubLObject date_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $disable_temporal_indexical_supportP$.currentBinding(thread);
        try {
            $disable_temporal_indexical_supportP$.bind(T, thread);
            final SubLObject date_1_simplified = date_utilities.reduce_date_start(date_1);
            final SubLObject date_2_simplified = date_utilities.reduce_date_end(date_2);
            SubLObject result = NIL;
            if (date_1_simplified.equal(date_2_simplified)) {
                return date_1_simplified;
            }
            if ((NIL != date_utilities.beginning_of_timeP(date_1_simplified)) && (NIL != date_utilities.end_of_timeP(date_2_simplified))) {
                return $$Always_TimeInterval;
            }
            if (NIL != date_utilities.beginning_of_timeP(date_1_simplified)) {
                result = make_unary_formula($$IntervalEndedByFn_Inclusive, date_2_simplified);
            } else
                if (NIL != date_utilities.end_of_timeP(date_2_simplified)) {
                    result = make_unary_formula($$IntervalStartedByFn_Inclusive, date_1_simplified);
                } else {
                    result = make_binary_formula($$TimeIntervalInclusiveFn, date_1_simplified, date_2_simplified);
                }

            return time_interval_utilities.recanonicalize_time_interval(result, UNPROVIDED, UNPROVIDED);
        } finally {
            $disable_temporal_indexical_supportP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject time_parameter_mub(final SubLObject param_1, final SubLObject param_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (param_1.equal(param_2)) {
            return param_2;
        }
        if (NIL != bigger_time_typeP(param_1, param_2)) {
            return param_1;
        }
        if (NIL != bigger_time_typeP(param_2, param_1)) {
            return param_2;
        }
        if ((NIL != time_parameter_utilities.conventional_time_series_p(param_1)) && (NIL != time_parameter_utilities.conventional_time_series_p(param_2))) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
            try {
                gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                result = gt_methods.gt_max_floors($$temporallySubsumes_TypeType, list(param_1, param_2), UNPROVIDED, UNPROVIDED);
            } finally {
                gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        if ((NIL != time_parameter_utilities.sliding_time_type_p(param_1)) && (NIL != time_parameter_utilities.sliding_time_type_p(param_2))) {
            Errors.error($str34$One_same_length_duration_paramete, param_1, param_2);
            return NIL;
        }
        final SubLObject conventional_type = (NIL != time_parameter_utilities.conventional_time_series_p(param_1)) ? param_1 : param_2;
        final SubLObject sliding_type = (conventional_type.eql(param_2)) ? param_1 : param_2;
        if (NIL != time_parameter_utilities.gappy_time_type_p(conventional_type)) {
            return mub_of_sliding_type_and_gappy_type(sliding_type, conventional_type);
        }
        return mub_of_sliding_type_and_covering_type(sliding_type, conventional_type);
    }

    public static SubLObject mub_of_sliding_type_and_gappy_type(final SubLObject sliding_type, final SubLObject gappy_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $param_max_upper_bound$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $mub_sliding_and_gappy_types_result$.currentBinding(thread);
        try {
            $param_max_upper_bound$.bind(minimally_subsuming_sliding_type_for_gappy_type(gappy_type), thread);
            $hlmt_sliding_type$.bind(sliding_type, thread);
            $mub_sliding_and_gappy_types_result$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$14 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
            try {
                gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                gt_methods.gt_compose_fn_all_inferiors($$temporallySubsumes_TypeType, gappy_type, MUB_GATHER_SUBSUMED_SLIDING_TYPES, UNPROVIDED, UNPROVIDED);
            } finally {
                gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0_$14, thread);
            }
            result = $mub_sliding_and_gappy_types_result$.getDynamicValue(thread);
            if (NIL == result) {
                result = $param_max_upper_bound$.getDynamicValue(thread);
            }
        } finally {
            $mub_sliding_and_gappy_types_result$.rebind(_prev_bind_3, thread);
            $hlmt_sliding_type$.rebind(_prev_bind_2, thread);
            $param_max_upper_bound$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject minimally_subsuming_sliding_type_for_gappy_type(final SubLObject type) {
        final SubLObject type_dur = time_parameter_utilities.gappy_type_duration(type);
        final SubLObject period_dur = time_parameter_utilities.gappy_type_period(type);
        if ((NIL != time_parameter_utilities.duration_p(type_dur)) && (NIL != time_parameter_utilities.duration_p(period_dur))) {
            return time_parameter_utilities.make_sliding_type(time_parameter_utilities.add_durations(type_dur, period_dur));
        }
        return NIL;
    }

    public static SubLObject mub_gather_subsumed_sliding_types(final SubLObject time_param) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind(NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
            if (NIL == bigger_time_typeP(time_param, $param_max_upper_bound$.getDynamicValue(thread))) {
                final SubLObject _prev_bind_0_$15 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                final SubLObject _prev_bind_1_$16 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    final SubLObject _prev_bind_0_$16 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        SubLObject catch_var = NIL;
                        try {
                            thread.throwStack.push($MAPPING_DONE);
                            if (NIL != gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, time_param, $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED)) {
                                $mub_sliding_and_gappy_types_result$.setDynamicValue(time_param, thread);
                            }
                            gt_search.gt_finished(T);
                        } catch (final Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0_$16, thread);
                    }
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1_$16, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject mub_of_sliding_type_and_covering_type(final SubLObject sliding_type, final SubLObject covering_type) {
        return time_parameter_utilities.make_sliding_type(list(time_parameter_utilities.time_series_type_duration(covering_type), TWO_INTEGER));
    }

    public static SubLObject declare_hlmt_relevance_file() {
        declareFunction(me, "hlmt_visible_p", "HLMT-VISIBLE-P", 2, 0, false);
        declareFunction(me, "mt_temporally_visible_p", "MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction(me, "why_hlmt_visible_p", "WHY-HLMT-VISIBLE-P", 2, 3, false);
        declareFunction(me, "why_mt_temporally_visible_p", "WHY-MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction(me, "temporal_mt_visible_to_atemporal_mtP", "TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction(me, "temporal_mts_visible_p", "TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction(me, "why_temporal_mt_visible_to_atemporal_mtP", "WHY-TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction(me, "why_temporal_mts_visible_p", "WHY-TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction(me, "mt_time_interval_subsumes", "MT-TIME-INTERVAL-SUBSUMES", 2, 0, false);
        declareFunction(me, "mt_times_visible_p", "MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction(me, "why_mt_times_visible_p", "WHY-MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction(me, "subsumed_time_intervalP", "SUBSUMED-TIME-INTERVAL?", 2, 0, false);
        declareFunction(me, "bigger_time_typeP", "BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction(me, "sliding_time_typeLE", "SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction(me, "covering_type_subsumes_sliding_typeP", "COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction(me, "sliding_type_subsumes_covering_typeP", "SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction(me, "parameterLEprevious_sliding_type", "PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "parameterGEprevious_sliding_type", "PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "time_interval_subsumes_typeP", "TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(me, "time_interval_subsumed_by_typeP", "TIME-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction(me, "arbitrary_interval_subsumes_typeP", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(me, "arbitrary_interval_subsumes_typeP_int", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?-INT", 2, 0, false);
        declareFunction(me, "starting_date", "STARTING-DATE", 1, 1, false);
        declareFunction(me, "ending_date", "ENDING-DATE", 1, 1, false);
        declareFunction(me, "max_floor_polyad_mts", "MAX-FLOOR-POLYAD-MTS", 1, 3, false);
        declareFunction(me, "temporal_index_intersection", "TEMPORAL-INDEX-INTERSECTION", 1, 0, false);
        declareFunction(me, "time_parameter_mubs", "TIME-PARAMETER-MUBS", 1, 0, false);
        declareFunction(me, "max_floor_monads", "MAX-FLOOR-MONADS", 3, 0, false);
        declareFunction(me, "temporal_mts_intersect_fastP", "TEMPORAL-MTS-INTERSECT-FAST?", 2, 0, false);
        declareFunction(me, "temporal_mt_intersection_setP", "TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        declareFunction(me, "temporal_mts_intersectP", "TEMPORAL-MTS-INTERSECT?", 2, 0, false);
        declareFunction(me, "temporal_mt_intersection_set", "TEMPORAL-MT-INTERSECTION-SET", 1, 0, false);
        declareFunction(me, "temporal_mt_intersection", "TEMPORAL-MT-INTERSECTION", 2, 0, false);
        declareFunction(me, "temporal_intersection_set", "TEMPORAL-INTERSECTION-SET", 1, 0, false);
        declareFunction(me, "temporal_intersection", "TEMPORAL-INTERSECTION", 2, 0, false);
        declareFunction(me, "temporal_intersection_int", "TEMPORAL-INTERSECTION-INT", 2, 0, false);
        declareFunction(me, "empty_temporal_intersectionP", "EMPTY-TEMPORAL-INTERSECTION?", 2, 0, false);
        declareFunction(me, "date_from_to", "DATE-FROM-TO", 2, 0, false);
        declareFunction(me, "time_parameter_mub", "TIME-PARAMETER-MUB", 2, 0, false);
        declareFunction(me, "mub_of_sliding_type_and_gappy_type", "MUB-OF-SLIDING-TYPE-AND-GAPPY-TYPE", 2, 0, false);
        declareFunction(me, "minimally_subsuming_sliding_type_for_gappy_type", "MINIMALLY-SUBSUMING-SLIDING-TYPE-FOR-GAPPY-TYPE", 1, 0, false);
        declareFunction(me, "mub_gather_subsumed_sliding_types", "MUB-GATHER-SUBSUMED-SLIDING-TYPES", 1, 0, false);
        declareFunction(me, "mub_of_sliding_type_and_covering_type", "MUB-OF-SLIDING-TYPE-AND-COVERING-TYPE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_hlmt_relevance_file() {
        deflexical("*TIME-INFERENCE-MT*", SubLTrampolineFile.maybeDefault($time_inference_mt$, $time_inference_mt$, $$UniversalVocabularyMt));
        defparameter("*HLMT-SLIDING-TYPE*", NIL);
        deflexical("*DATE-RANGE-TIME-MT-PATTERN*", $list26);
        defparameter("*TEMPORAL-INTERSECTION-CALL-ARGS*", NIL);
        defparameter("*DISABLE-TEMPORAL-INDEXICAL-SUPPORT?*", NIL);
        defparameter("*MUB-SLIDING-AND-GAPPY-TYPES-RESULT*", NIL);
        defparameter("*PARAM-MAX-UPPER-BOUND*", NIL);
        return NIL;
    }

    public static SubLObject setup_hlmt_relevance_file() {
        declare_defglobal($time_inference_mt$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hlmt_relevance_file();
    }

    @Override
    public void initializeVariables() {
        init_hlmt_relevance_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hlmt_relevance_file();
    }

    
}

/**
 * Total time: 322 ms
 */
