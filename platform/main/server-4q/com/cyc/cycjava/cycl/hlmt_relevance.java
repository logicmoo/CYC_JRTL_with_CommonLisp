/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HLMT-RELEVANCE
 * source file: /cyc/top/cycl/hlmt-relevance.lisp
 * created:     2019/07/03 17:37:28
 */
public final class hlmt_relevance extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return date-p.  Returns the simplest date that starts when DATE starts.
     */
    @LispMethod(comment = "@return date-p.  Returns the simplest date that starts when DATE starts.")
    public static final SubLObject reduce_date_start(SubLObject date) {
        if (NIL != date_utilities.temporal_indexical_p(date)) {
            return date;
        }
        if (NIL != date_utilities.beginning_of_timeP(date)) {
            return date;
        }
        {
            SubLObject most_significant_date_type = date.first();
            SubLObject most_significant_date_amount = second(date);
            SubLObject rest_of_date = third(date);
            SubLObject pcase_var = most_significant_date_type;
            if ((pcase_var.eql($$SecondFn) || pcase_var.eql($$MinuteFn)) || pcase_var.eql($$HourFn)) {
                if (most_significant_date_amount.numE(ZERO_INTEGER)) {
                    return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_start(rest_of_date);
                } else {
                    return date;
                }
            } else {
                if (pcase_var.eql($$DayFn)) {
                    if (most_significant_date_amount.numE(ONE_INTEGER)) {
                        return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_start(rest_of_date);
                    } else {
                        return date;
                    }
                } else {
                    if (pcase_var.eql($$MonthFn)) {
                        if (most_significant_date_amount == $$January) {
                            return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_start(rest_of_date);
                        } else {
                            return date;
                        }
                    } else {
                        return date;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return date-p.  Returns the simplest date that ends when DATE ends.
     */
    @LispMethod(comment = "@return date-p.  Returns the simplest date that ends when DATE ends.")
    public static final SubLObject reduce_date_end(SubLObject date) {
        if (NIL != date_utilities.temporal_indexical_p(date)) {
            return date;
        }
        if (NIL != date_utilities.end_of_timeP(date)) {
            return date;
        }
        {
            SubLObject most_significant_date_type = date.first();
            SubLObject most_significant_date_amount = second(date);
            SubLObject rest_of_date = third(date);
            SubLObject pcase_var = most_significant_date_type;
            if (pcase_var.eql($$SecondFn) || pcase_var.eql($$MinuteFn)) {
                if (most_significant_date_amount.numE($int$59)) {
                    return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_end(rest_of_date);
                } else {
                    return date;
                }
            } else {
                if (pcase_var.eql($$HourFn)) {
                    if (most_significant_date_amount.numE($int$23)) {
                        return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_end(rest_of_date);
                    } else {
                        return date;
                    }
                } else {
                    if (pcase_var.eql($$DayFn)) {
                        {
                            SubLObject month = date_utilities.extract_date_month(rest_of_date);
                            SubLObject year = date_utilities.extract_date_year(rest_of_date);
                            SubLObject days_in_month = numeric_date_utilities.days_in_month_number(date_utilities.number_of_month(month), year);
                            if (most_significant_date_amount.numE(days_in_month)) {
                                return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_end(rest_of_date);
                            } else {
                                return date;
                            }
                        }
                    } else {
                        if (pcase_var.eql($$MonthFn)) {
                            if (most_significant_date_amount == $$December) {
                                return com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_end(rest_of_date);
                            } else {
                                return date;
                            }
                        } else {
                            return date;
                        }
                    }
                }
            }
        }
    }

    public static final SubLFile me = new hlmt_relevance();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $hlmt_sliding_type$ = makeSymbol("*HLMT-SLIDING-TYPE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $date_range_time_mt_pattern$ = makeSymbol("*DATE-RANGE-TIME-MT-PATTERN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $temporal_intersection_call_args$ = makeSymbol("*TEMPORAL-INTERSECTION-CALL-ARGS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $disable_temporal_indexical_supportP$ = makeSymbol("*DISABLE-TEMPORAL-INDEXICAL-SUPPORT?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mub_sliding_and_gappy_types_result$ = makeSymbol("*MUB-SLIDING-AND-GAPPY-TYPES-RESULT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $param_max_upper_bound$ = makeSymbol("*PARAM-MAX-UPPER-BOUND*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $time_inference_mt$ = makeSymbol("*TIME-INFERENCE-MT*");





    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell("temporallySubsumes-TypeType");

    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell("temporallySubsumes-InsType");

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");



    static private final SubLSymbol $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("PARAMETER>=PREVIOUS-SLIDING-TYPE");

    static private final SubLSymbol $sym9$PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("PARAMETER<=PREVIOUS-SLIDING-TYPE");



    static private final SubLSymbol $sym13$_X = makeSymbol("?X");

    static private final SubLSymbol $sym15$DATE_ = makeSymbol("DATE<");



    static private final SubLSymbol $sym17$DATE_ = makeSymbol("DATE>");

    private static final SubLSymbol EXTRACT_HLMT_TEMPORAL_INDEX_OR_DEFAULT = makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT");

    static private final SubLSymbol $sym19$ALWAYS_TIME_INTERVAL_ = makeSymbol("ALWAYS-TIME-INTERVAL?");

    static private final SubLSymbol $sym20$CONTAINS_INDEXICAL_ = makeSymbol("CONTAINS-INDEXICAL?");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");

    private static final SubLSymbol CYCL_TIME_INDEX_START = makeSymbol("CYCL-TIME-INDEX-START");

    private static final SubLSymbol CYCL_TIME_INDEX_END = makeSymbol("CYCL-TIME-INDEX-END");

    private static final SubLSymbol EXTRACT_HLMT_TIME_PARAMETER = makeSymbol("EXTRACT-HLMT-TIME-PARAMETER");

    private static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");

    private static final SubLList $list26 = list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list($TEST, makeSymbol("SIMPLE-EL-DATE-P")), list($TEST, makeSymbol("SIMPLE-EL-DATE-P"))), reader_make_constant_shell("TimePoint"));

    private static final SubLSymbol $FAST_INTERSECT_UNSUPPORTED = makeKeyword("FAST-INTERSECT-UNSUPPORTED");



    private static final SubLSymbol $sym30$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell("IntervalEndedByFn-Inclusive");

    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell("IntervalStartedByFn-Inclusive");



    private static final SubLString $str34$One_same_length_duration_paramete = makeString("One same length duration parameter should subsume another ~a ~a~%");

    private static final SubLSymbol MUB_GATHER_SUBSUMED_SLIDING_TYPES = makeSymbol("MUB-GATHER-SUBSUMED-SLIDING-TYPES");

    private static final SubLInteger $int$128 = makeInteger(128);

    /**
     *
     *
     * @return booleanp;  Returns whether GENL-MT is a genl of SPEC-MT, allowing for either to be a hlmt.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether GENL-MT is a genl of SPEC-MT, allowing for either to be a hlmt.")
    public static final SubLObject hlmt_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_mt_monad = hlmt.hlmt_monad_mt(spec_mt);
                SubLObject genl_mt_monad = hlmt.hlmt_monad_mt(genl_mt);
                SubLObject hlmt_visibleP = NIL;
                if (NIL != genl_mts.monad_genl_mtP(spec_mt_monad, genl_mt_monad, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject mt_var = spec_mt_monad;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.mt_temporally_visible_p(spec_mt, genl_mt)) {
                                    hlmt_visibleP = T;
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return hlmt_visibleP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether GENL-MT is a genl of SPEC-MT, allowing for either to be a hlmt.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether GENL-MT is a genl of SPEC-MT, allowing for either to be a hlmt.")
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

    /**
     *
     *
     * @return booleanp; Whether GENL-MT is temporally relevant to SPEC-MT, i.e. (genlmt SPEC-MT GENL-MT) wrt the temporal dimension.
     */
    @LispMethod(comment = "@return booleanp; Whether GENL-MT is temporally relevant to SPEC-MT, i.e. (genlmt SPEC-MT GENL-MT) wrt the temporal dimension.")
    public static final SubLObject mt_temporally_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt) {
        if (NIL != hlmt.atemporal_hlmtP(genl_mt)) {
            return T;
        } else {
            if (NIL != hlmt.atemporal_hlmtP(spec_mt)) {
                return com.cyc.cycjava.cycl.hlmt_relevance.temporal_mt_visible_to_atemporal_mtP(genl_mt, spec_mt);
            } else {
                return com.cyc.cycjava.cycl.hlmt_relevance.temporal_mts_visible_p(spec_mt, genl_mt);
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether GENL-MT is temporally relevant to SPEC-MT, i.e. (genlmt SPEC-MT GENL-MT) wrt the temporal dimension.
     */
    @LispMethod(comment = "@return booleanp; Whether GENL-MT is temporally relevant to SPEC-MT, i.e. (genlmt SPEC-MT GENL-MT) wrt the temporal dimension.")
    public static SubLObject mt_temporally_visible_p(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (NIL != hlmt.atemporal_hlmtP(genl_mt)) {
            return T;
        }
        if (NIL != hlmt.atemporal_hlmtP(spec_mt)) {
            return temporal_mt_visible_to_atemporal_mtP(genl_mt, spec_mt);
        }
        return temporal_mts_visible_p(spec_mt, genl_mt);
    }

    public static final SubLObject why_hlmt_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_mt_monad = hlmt.hlmt_monad_mt(spec_mt);
                SubLObject genl_mt_monad = hlmt.hlmt_monad_mt(genl_mt);
                SubLObject monad_just = genl_mts.why_monad_genl_mtP(spec_mt_monad, genl_mt_monad, mt_mt, tv, behavior);
                SubLObject just = NIL;
                if (NIL != monad_just) {
                    {
                        SubLObject mt_var = spec_mt_monad;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject time_just = com.cyc.cycjava.cycl.hlmt_relevance.why_mt_temporally_visible_p(spec_mt, genl_mt);
                                    SubLObject time_just_validP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != time_just_validP) {
                                        just = append(monad_just, time_just);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return just;
            }
        }
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

    public static final SubLObject why_mt_temporally_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt) {
        if (NIL != hlmt.atemporal_hlmtP(genl_mt)) {
            return values(NIL, T);
        } else {
            if (NIL != hlmt.atemporal_hlmtP(spec_mt)) {
                {
                    SubLObject just = com.cyc.cycjava.cycl.hlmt_relevance.why_temporal_mt_visible_to_atemporal_mtP(genl_mt, spec_mt);
                    return values(just, list_utilities.sublisp_boolean(just));
                }
            } else {
                {
                    SubLObject just = com.cyc.cycjava.cycl.hlmt_relevance.why_temporal_mts_visible_p(spec_mt, genl_mt);
                    return values(just, list_utilities.sublisp_boolean(just));
                }
            }
        }
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

    public static final SubLObject temporal_mt_visible_to_atemporal_mtP_alt(SubLObject genl_mt, SubLObject spec_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_time_index = hlmt.$default_mt_time_interval$.getGlobalValue();
                SubLObject spec_time_param = hlmt.$default_atemporal_specmt_time_parameter$.getGlobalValue();
                SubLObject genl_time_index = NIL;
                SubLObject genl_time_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject genl_time_index_1 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject genl_time_param_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    genl_time_index = genl_time_index_1;
                    genl_time_param = genl_time_param_2;
                }
                return com.cyc.cycjava.cycl.hlmt_relevance.mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
            }
        }
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

    public static final SubLObject temporal_mts_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_time_index = NIL;
                SubLObject spec_time_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject spec_time_index_3 = hlmt.explode_hlmt_temporal_facets(spec_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject spec_time_param_4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    spec_time_index = spec_time_index_3;
                    spec_time_param = spec_time_param_4;
                }
                {
                    SubLObject genl_time_index = NIL;
                    SubLObject genl_time_param = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject genl_time_index_5 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                        SubLObject genl_time_param_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        genl_time_index = genl_time_index_5;
                        genl_time_param = genl_time_param_6;
                    }
                    return com.cyc.cycjava.cycl.hlmt_relevance.mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
                }
            }
        }
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

    public static final SubLObject why_temporal_mt_visible_to_atemporal_mtP_alt(SubLObject genl_mt, SubLObject spec_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_time_index = hlmt.$default_mt_time_interval$.getGlobalValue();
                SubLObject spec_time_param = hlmt.$default_atemporal_specmt_time_parameter$.getGlobalValue();
                SubLObject genl_time_index = NIL;
                SubLObject genl_time_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject genl_time_index_7 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject genl_time_param_8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    genl_time_index = genl_time_index_7;
                    genl_time_param = genl_time_param_8;
                }
                return com.cyc.cycjava.cycl.hlmt_relevance.why_mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
            }
        }
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

    public static final SubLObject why_temporal_mts_visible_p_alt(SubLObject spec_mt, SubLObject genl_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec_time_index = NIL;
                SubLObject spec_time_param = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject spec_time_index_9 = hlmt.explode_hlmt_temporal_facets(spec_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject spec_time_param_10 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    spec_time_index = spec_time_index_9;
                    spec_time_param = spec_time_param_10;
                }
                {
                    SubLObject genl_time_index = NIL;
                    SubLObject genl_time_param = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject genl_time_index_11 = hlmt.explode_hlmt_temporal_facets(genl_mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                        SubLObject genl_time_param_12 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        genl_time_index = genl_time_index_11;
                        genl_time_param = genl_time_param_12;
                    }
                    return com.cyc.cycjava.cycl.hlmt_relevance.why_mt_times_visible_p(spec_time_index, genl_time_index, spec_time_param, genl_time_param);
                }
            }
        }
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

    public static final SubLObject mt_time_interval_subsumes_alt(SubLObject genl_mt, SubLObject spec_mt) {
        {
            SubLObject spec_time = hlmt.extract_hlmt_temporal_index(spec_mt);
            SubLObject genl_time = hlmt.extract_hlmt_temporal_index(genl_mt);
            spec_time = date_utilities.possibly_bind_temporal_indexical_in_object(spec_time);
            genl_time = date_utilities.possibly_bind_temporal_indexical_in_object(genl_time);
            return com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(spec_time, genl_time);
        }
    }

    public static SubLObject mt_time_interval_subsumes(final SubLObject genl_mt, final SubLObject spec_mt) {
        SubLObject spec_time = hlmt.extract_hlmt_temporal_index(spec_mt);
        SubLObject genl_time = hlmt.extract_hlmt_temporal_index(genl_mt);
        spec_time = date_utilities.possibly_bind_temporal_indexical_in_object(spec_time);
        genl_time = date_utilities.possibly_bind_temporal_indexical_in_object(genl_time);
        return subsumed_time_intervalP(spec_time, genl_time);
    }

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL-1 and PARAMETER-1 specify time slices which are entailed by INTERVAL-2 and PARAMETER-2.  Specifically, these three conditions must hold:
    (1) INTERVAL-1 must be subsumed by INTERVAL-2
    (2) PARAMETER-1 must be bigger than PARAMETER-2 or of the same size
    (3) INTERVAL-1 must subsume some instance of PARAMETER-2
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL-1 and PARAMETER-1 specify time slices which are entailed by INTERVAL-2 and PARAMETER-2.  Specifically, these three conditions must hold:\r\n(1) INTERVAL-1 must be subsumed by INTERVAL-2\r\n(2) PARAMETER-1 must be bigger than PARAMETER-2 or of the same size\r\n(3) INTERVAL-1 must subsume some instance of PARAMETER-2")
    public static final SubLObject mt_times_visible_p_alt(SubLObject interval_1, SubLObject interval_2, SubLObject parameter_1, SubLObject parameter_2) {
        interval_1 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_1);
        interval_2 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_2);
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(interval_1, interval_2)) && (NIL != com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(parameter_1, parameter_2))) && (interval_1.equal(interval_2) || (NIL != com.cyc.cycjava.cycl.hlmt_relevance.time_interval_subsumes_typeP(interval_1, parameter_2))));
    }

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL-1 and PARAMETER-1 specify time slices which are entailed by INTERVAL-2 and PARAMETER-2.  Specifically, these three conditions must hold:
    (1) INTERVAL-1 must be subsumed by INTERVAL-2
    (2) PARAMETER-1 must be bigger than PARAMETER-2 or of the same size
    (3) INTERVAL-1 must subsume some instance of PARAMETER-2
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL-1 and PARAMETER-1 specify time slices which are entailed by INTERVAL-2 and PARAMETER-2.  Specifically, these three conditions must hold:\r\n(1) INTERVAL-1 must be subsumed by INTERVAL-2\r\n(2) PARAMETER-1 must be bigger than PARAMETER-2 or of the same size\r\n(3) INTERVAL-1 must subsume some instance of PARAMETER-2")
    public static SubLObject mt_times_visible_p(SubLObject interval_1, SubLObject interval_2, final SubLObject parameter_1, final SubLObject parameter_2) {
        interval_1 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_1);
        interval_2 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_2);
        return makeBoolean(((NIL != subsumed_time_intervalP(interval_1, interval_2)) && (NIL != bigger_time_typeP(parameter_1, parameter_2))) && (interval_1.equal(interval_2) || (NIL != time_interval_subsumes_typeP(interval_1, parameter_2))));
    }

    public static final SubLObject why_mt_times_visible_p_alt(SubLObject interval_1, SubLObject interval_2, SubLObject parameter_1, SubLObject parameter_2) {
        {
            SubLObject just = NIL;
            interval_1 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_1);
            interval_2 = date_utilities.possibly_bind_temporal_indexical_in_object(interval_2);
            if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(interval_1, interval_2)) {
                {
                    SubLObject subsumed_time_interval_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes, interval_2, interval_1), UNPROVIDED, UNPROVIDED);
                    if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(parameter_1, parameter_2)) {
                        {
                            SubLObject bigger_time_type_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_TypeType, parameter_1, parameter_2), UNPROVIDED, UNPROVIDED);
                            if (interval_1.equal(interval_2)) {
                                just = list(subsumed_time_interval_support, bigger_time_type_support);
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.time_interval_subsumes_typeP(interval_1, parameter_2)) {
                                    {
                                        SubLObject time_interval_subsumes_type_support = arguments.make_hl_support($TIME, make_binary_formula($$temporallySubsumes_InsType, interval_1, parameter_2), UNPROVIDED, UNPROVIDED);
                                        just = list(subsumed_time_interval_support, bigger_time_type_support, time_interval_subsumes_type_support);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return just;
        }
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

    /**
     *
     *
     * @return booleanp;  Returns whether SMALL is subsumed by BIG.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether SMALL is subsumed by BIG.")
    public static final SubLObject subsumed_time_intervalP_alt(SubLObject small, SubLObject big) {
        if (NIL != date_utilities.always_time_intervalP(big)) {
            return T;
        } else {
            if (NIL != date_utilities.always_time_intervalP(small)) {
                return NIL;
            } else {
                if (small.equal(big)) {
                    return T;
                } else {
                    if ((NIL != time_interval_utilities.date_interval_p(small)) && (NIL != time_interval_utilities.date_interval_p(big))) {
                        return time_interval_utilities.date_interval_subsumesP(big, small);
                    } else {
                        return sbhl_time_modules.temporally_subsumesP(big, small, UNPROVIDED);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether SMALL is subsumed by BIG.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether SMALL is subsumed by BIG.")
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

    /**
     *
     *
     * @return booleanp;  Returns whether (#$temporallySubsumes-TypeType BIG SMALL) is true.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether (#$temporallySubsumes-TypeType BIG SMALL) is true.")
    public static final SubLObject bigger_time_typeP_alt(SubLObject big, SubLObject small) {
        if (big == $$Null_TimeParameter) {
            return T;
        } else {
            if (small == $$Null_TimeParameter) {
                return NIL;
            } else {
                if (small == $$TimePoint) {
                    return T;
                } else {
                    if (big == $$TimePoint) {
                        return NIL;
                    } else {
                        if (big.equal(small)) {
                            return T;
                        } else {
                            if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
                                return com.cyc.cycjava.cycl.hlmt_relevance.sliding_time_typeLE(small, big);
                            } else {
                                if ((NIL != time_parameter_utilities.conventional_time_series_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
                                    return com.cyc.cycjava.cycl.hlmt_relevance.covering_type_subsumes_sliding_typeP(big, small);
                                } else {
                                    if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.conventional_time_series_p(small))) {
                                        return com.cyc.cycjava.cycl.hlmt_relevance.sliding_type_subsumes_covering_typeP(big, small);
                                    } else {
                                        return ghl_search_methods.ghl_predicate_relation_p($$temporallySubsumes_TypeType, big, small, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether (#$temporallySubsumes-TypeType BIG SMALL) is true.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether (#$temporallySubsumes-TypeType BIG SMALL) is true.")
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

    /**
     *
     *
     * @return booleanp; Returns whether TYPE1 has shorter or equal duration than TYPE2
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE1 has shorter or equal duration than TYPE2")
    public static final SubLObject sliding_time_typeLE_alt(SubLObject type1, SubLObject type2) {
        {
            SubLObject type1_unit = time_parameter_utilities.extract_sliding_time_type(type1);
            SubLObject type2_unit = time_parameter_utilities.extract_sliding_time_type(type2);
            SubLObject type1_amount = time_parameter_utilities.extract_sliding_type_amount(type1);
            SubLObject type2_amount = time_parameter_utilities.extract_sliding_type_amount(type2);
            if (type1_unit == type2_unit) {
                return numLE(type1_amount, type2_amount);
            } else {
                if (NIL != time_parameter_utilities.duration_typeL(type1_unit, type2_unit)) {
                    return numLE(type1_amount, multiply(time_parameter_utilities.find_duration_quotient(type1_unit, type2_unit, UNPROVIDED), type2_amount));
                } else {
                    return numLE(multiply(type1_amount, time_parameter_utilities.find_duration_quotient(type2_unit, type1_unit, UNPROVIDED)), type2_amount);
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE1 has shorter or equal duration than TYPE2
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE1 has shorter or equal duration than TYPE2")
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

    /**
     *
     *
     * @return booleanp;  Returns whether COVERING-TYPE subsumes some instance of SLIDING-TYPE.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether COVERING-TYPE subsumes some instance of SLIDING-TYPE.")
    public static final SubLObject covering_type_subsumes_sliding_typeP_alt(SubLObject covering_type, SubLObject sliding_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $hlmt_sliding_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        $hlmt_sliding_type$.bind(sliding_type, thread);
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        result = gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, covering_type, $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED);
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_1, thread);
                        $hlmt_sliding_type$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether COVERING-TYPE subsumes some instance of SLIDING-TYPE.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether COVERING-TYPE subsumes some instance of SLIDING-TYPE.")
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

    /**
     *
     *
     * @return booleanp;  Returns whether SLIDING-TYPE subsumes some instance of COVERING-TYPE.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether SLIDING-TYPE subsumes some instance of COVERING-TYPE.")
    public static final SubLObject sliding_type_subsumes_covering_typeP_alt(SubLObject sliding_type, SubLObject covering_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
                {
                    SubLObject subsuming_slider = com.cyc.cycjava.cycl.hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(covering_type);
                    return NIL != subsuming_slider ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_relevance.sliding_time_typeLE(subsuming_slider, sliding_type))) : NIL;
                }
            } else {
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = $hlmt_sliding_type$.currentBinding(thread);
                        SubLObject _prev_bind_1 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                        try {
                            $hlmt_sliding_type$.bind(sliding_type, thread);
                            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                            result = gt_methods.gt_gather_inferior($$temporallySubsumes_TypeType, covering_type, $sym9$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED);
                        } finally {
                            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_1, thread);
                            $hlmt_sliding_type$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether SLIDING-TYPE subsumes some instance of COVERING-TYPE.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether SLIDING-TYPE subsumes some instance of COVERING-TYPE.")
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

    /**
     *
     *
     * @return booleanp;  Returns whether some instance TIME-PARAMETER is subsumed by the #$SameLengthTimeIntervalTypeFn duration previously bound.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether some instance TIME-PARAMETER is subsumed by the #$SameLengthTimeIntervalTypeFn duration previously bound.")
    public static final SubLObject parameterLEprevious_sliding_type_alt(SubLObject time_parameter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_relevance.sliding_time_typeLE(time_parameter, $hlmt_sliding_type$.getDynamicValue(thread)))) : NIL;
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether some instance TIME-PARAMETER is subsumed by the #$SameLengthTimeIntervalTypeFn duration previously bound.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether some instance TIME-PARAMETER is subsumed by the #$SameLengthTimeIntervalTypeFn duration previously bound.")
    public static SubLObject parameterLEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? sliding_time_typeLE(time_parameter, $hlmt_sliding_type$.getDynamicValue(thread)) : NIL;
    }

    /**
     *
     *
     * @return booleanp;  Returns whether TIME-PARAMETER subsumes some instance of the #$SameLengthTimeIntervalTypeFn duration previously bound.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether TIME-PARAMETER subsumes some instance of the #$SameLengthTimeIntervalTypeFn duration previously bound.")
    public static final SubLObject parameterGEprevious_sliding_type_alt(SubLObject time_parameter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_relevance.sliding_time_typeLE($hlmt_sliding_type$.getDynamicValue(thread), time_parameter))) : NIL;
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether TIME-PARAMETER subsumes some instance of the #$SameLengthTimeIntervalTypeFn duration previously bound.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether TIME-PARAMETER subsumes some instance of the #$SameLengthTimeIntervalTypeFn duration previously bound.")
    public static SubLObject parameterGEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) ? sliding_time_typeLE($hlmt_sliding_type$.getDynamicValue(thread), time_parameter) : NIL;
    }

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL subsumes some instance of TYPE, i.e.
    (#$temporallySubsumes-InsType INSTANCE TYPE) holds.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL subsumes some instance of TYPE, i.e.\r\n(#$temporallySubsumes-InsType INSTANCE TYPE) holds.")
    public static final SubLObject time_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        if (NIL != date_utilities.always_time_intervalP(interval)) {
            return T;
        } else {
            if (NIL != date_utilities.empty_time_intervalP(interval)) {
                return NIL;
            } else {
                if (type == $$Null_TimeParameter) {
                    return NIL;
                } else {
                    if (NIL != time_parameter_utilities.time_point_type_p(type)) {
                        return T;
                    } else {
                        if (NIL != time_interval_utilities.date_interval_p(interval)) {
                            return time_parameter_utilities.date_interval_subsumes_typeP(interval, type);
                        } else {
                            return com.cyc.cycjava.cycl.hlmt_relevance.arbitrary_interval_subsumes_typeP(interval, type);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL subsumes some instance of TYPE, i.e.
    (#$temporallySubsumes-InsType INSTANCE TYPE) holds.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL subsumes some instance of TYPE, i.e.\r\n(#$temporallySubsumes-InsType INSTANCE TYPE) holds.")
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

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL is subsumed by some instance of TYPE, i.e.
    (#$temporallySubsumedBy-InsType INSTANCE TYPE) holds.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL is subsumed by some instance of TYPE, i.e.\r\n(#$temporallySubsumedBy-InsType INSTANCE TYPE) holds.")
    public static final SubLObject time_interval_subsumed_by_typeP_alt(SubLObject interval, SubLObject type) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            return time_parameter_utilities.date_interval_subsumed_by_typeP(interval, type);
        } else {
            return NIL;
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether INTERVAL is subsumed by some instance of TYPE, i.e.
    (#$temporallySubsumedBy-InsType INSTANCE TYPE) holds.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether INTERVAL is subsumed by some instance of TYPE, i.e.\r\n(#$temporallySubsumedBy-InsType INSTANCE TYPE) holds.")
    public static SubLObject time_interval_subsumed_by_typeP(final SubLObject interval, final SubLObject type) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            return time_parameter_utilities.date_interval_subsumed_by_typeP(interval, type);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether non date-interval-p INTERVAL subsumes an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether non date-interval-p INTERVAL subsumes an instance of TYPE.")
    public static final SubLObject arbitrary_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start = com.cyc.cycjava.cycl.hlmt_relevance.starting_date(interval, UNPROVIDED);
                SubLObject end = com.cyc.cycjava.cycl.hlmt_relevance.ending_date(interval, UNPROVIDED);
                if ((NIL != start) && (NIL != end)) {
                    return time_parameter_utilities.date_interval_subsumes_typeP(com.cyc.cycjava.cycl.hlmt_relevance.date_from_to(start, end), type);
                } else {
                    {
                        SubLObject subsumes_typeP = NIL;
                        SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator($$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $DEPTH_FIRST, UNPROVIDED);
                        SubLObject done_var = subsumes_typeP;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject subsumed_interval = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.arbitrary_interval_subsumes_typeP_int(subsumed_interval, type)) {
                                        subsumes_typeP = T;
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != subsumes_typeP));
                            }
                        } 
                        return subsumes_typeP;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether non date-interval-p INTERVAL subsumes an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether non date-interval-p INTERVAL subsumes an instance of TYPE.")
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

    public static final SubLObject arbitrary_interval_subsumes_typeP_int_alt(SubLObject interval, SubLObject type) {
        return makeBoolean(((((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_parameter_utilities.date_interval_subsumes_typeP(interval, type))) || (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED))) || ((NIL != indexed_term_p(interval)) && (NIL != list_utilities.member_equalP(type, kb_mapping_utilities.pred_values(interval, $$temporallySubsumes_InsType, ONE_INTEGER, TWO_INTEGER, $TRUE))))) || ((NIL != indexed_term_p(type)) && (NIL != list_utilities.member_equalP(interval, kb_mapping_utilities.pred_values(type, $$temporallySubsumes_InsType, TWO_INTEGER, ONE_INTEGER, $TRUE)))));
    }

    public static SubLObject arbitrary_interval_subsumes_typeP_int(final SubLObject interval, final SubLObject type) {
        return makeBoolean(((((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_parameter_utilities.date_interval_subsumes_typeP(interval, type))) || (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED))) || ((NIL != indexed_term_p(interval)) && (NIL != list_utilities.member_equalP(type, kb_mapping_utilities.pred_values(interval, $$temporallySubsumes_InsType, ONE_INTEGER, TWO_INTEGER, $TRUE))))) || ((NIL != indexed_term_p(type)) && (NIL != list_utilities.member_equalP(interval, kb_mapping_utilities.pred_values(type, $$temporallySubsumes_InsType, TWO_INTEGER, ONE_INTEGER, $TRUE)))));
    }

    public static final SubLObject starting_date_alt(SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject v_bindings = inference_trivial.new_cyc_trivial_query(make_binary_formula($$startingDate, interval, $sym13$_X), mt, UNPROVIDED);
            SubLObject dates = Mapping.mapcar(CDAR, v_bindings);
            SubLObject date = list_utilities.extremal(dates, $sym15$DATE_, UNPROVIDED);
            return date;
        }
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

    public static final SubLObject ending_date_alt(SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject v_bindings = inference_trivial.new_cyc_trivial_query(make_binary_formula($$endingDate, interval, $sym13$_X), mt, UNPROVIDED);
            SubLObject dates = Mapping.mapcar(CDAR, v_bindings);
            SubLObject date = list_utilities.extremal(dates, $sym17$DATE_, UNPROVIDED);
            return date;
        }
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

    /**
     *
     *
     * @return listp; Returns the set of independent hlmts H, s.t. all
    hlmts in HLMTS are visible from each hlmt in H.  NB: this is terribly
    inefficient if all HLMTS are atemporal.
     */
    @LispMethod(comment = "@return listp; Returns the set of independent hlmts H, s.t. all\r\nhlmts in HLMTS are visible from each hlmt in H.  NB: this is terribly\r\ninefficient if all HLMTS are atemporal.")
    public static final SubLObject max_floor_polyad_mts_alt(SubLObject hlmts, SubLObject candidates, SubLObject mt_mt, SubLObject prune_cyclesP) {
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
        } else {
            if (NIL != list_utilities.singletonP(hlmts)) {
                return NIL != candidates ? ((SubLObject) (keyhash_utilities.fast_intersection(hlmts, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : hlmts;
            } else {
                {
                    SubLObject intersection = com.cyc.cycjava.cycl.hlmt_relevance.temporal_index_intersection(hlmts);
                    SubLObject mubs = (NIL != intersection) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_relevance.time_parameter_mubs(hlmts))) : NIL;
                    SubLObject monads = (NIL != mubs) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_relevance.max_floor_monads(hlmts, mt_mt, prune_cyclesP))) : NIL;
                    SubLObject result = NIL;
                    if (NIL != monads) {
                        {
                            SubLObject cdolist_list_var = mubs;
                            SubLObject param = NIL;
                            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_13 = monads;
                                    SubLObject monad = NIL;
                                    for (monad = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , monad = cdolist_list_var_13.first()) {
                                        result = cons(hlmt.new_temporal_hlmt(monad, intersection, param), result);
                                    }
                                }
                            }
                        }
                    }
                    return NIL != candidates ? ((SubLObject) (keyhash_utilities.fast_intersection(result, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : result;
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; Returns the set of independent hlmts H, s.t. all
    hlmts in HLMTS are visible from each hlmt in H.  NB: this is terribly
    inefficient if all HLMTS are atemporal.
     */
    @LispMethod(comment = "@return listp; Returns the set of independent hlmts H, s.t. all\r\nhlmts in HLMTS are visible from each hlmt in H.  NB: this is terribly\r\ninefficient if all HLMTS are atemporal.")
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

    public static final SubLObject temporal_index_intersection_alt(SubLObject hlmts) {
        {
            SubLObject temporal_indexes = Mapping.mapcar(EXTRACT_HLMT_TEMPORAL_INDEX_OR_DEFAULT, hlmts);
            temporal_indexes = remove_if($sym19$ALWAYS_TIME_INTERVAL_, temporal_indexes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != list_utilities.any_in_list($sym20$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED)) && (NIL == list_utilities.every_in_list($sym20$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED))) {
                hlmts = date_utilities.bind_temporal_indexicals_in_hlmt_list(hlmts);
            }
            {
                SubLObject pcase_var = length(temporal_indexes);
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return $$Always_TimeInterval;
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return temporal_indexes.first();
                    } else {
                        {
                            SubLObject starts = Mapping.mapcar(CYCL_TIME_INDEX_START, temporal_indexes);
                            SubLObject ends = Mapping.mapcar(CYCL_TIME_INDEX_END, temporal_indexes);
                            SubLObject last_start = date_utilities.last_among_time_indexes(starts);
                            SubLObject first_end = date_utilities.first_among_time_indexes(ends);
                            return ((NIL == last_start) || (NIL == first_end)) || (NIL != sbhl_time_modules.starts_after_ending_ofP(last_start, first_end, UNPROVIDED)) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.hlmt_relevance.date_from_to(last_start, first_end);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject time_parameter_mubs_alt(SubLObject hlmts) {
        {
            SubLObject params = Mapping.mapcar(EXTRACT_HLMT_TIME_PARAMETER, hlmts);
            SubLObject mub = params.first();
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = params.rest();
                    SubLObject param = NIL;
                    for (param = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , param = csome_list_var.first()) {
                        mub = com.cyc.cycjava.cycl.hlmt_relevance.time_parameter_mub(mub, param);
                        if (NIL == mub) {
                            failP = T;
                        }
                    }
                }
            }
            return list(mub);
        }
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

    public static final SubLObject max_floor_monads_alt(SubLObject hlmts, SubLObject mt_mt, SubLObject prune_cyclesP) {
        return NIL != prune_cyclesP ? ((SubLObject) (genl_mts.max_floor_monad_mts_with_cycles_pruned(Mapping.mapcar(HLMT_MONAD_MT, hlmts), NIL, mt_mt))) : genl_mts.max_floor_monad_mts(Mapping.mapcar(HLMT_MONAD_MT, hlmts), NIL, mt_mt);
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

    public static final SubLObject temporal_mt_intersection_setP_alt(SubLObject mts) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hlmt_relevance.temporal_mt_intersection_set(mts));
    }

    public static SubLObject temporal_mt_intersection_setP(final SubLObject mts) {
        return list_utilities.sublisp_boolean(temporal_mt_intersection_set(mts));
    }

    public static final SubLObject temporal_mts_intersectP_alt(SubLObject mt_1, SubLObject mt_2) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hlmt_relevance.temporal_mt_intersection(mt_1, mt_2));
    }

    public static SubLObject temporal_mts_intersectP(final SubLObject mt_1, final SubLObject mt_2) {
        final SubLObject intersect_fastP = temporal_mts_intersect_fastP(mt_1, mt_2);
        if (intersect_fastP != $FAST_INTERSECT_UNSUPPORTED) {
            return intersect_fastP;
        }
        return list_utilities.sublisp_boolean(temporal_mt_intersection(mt_1, mt_2));
    }

    public static final SubLObject temporal_mt_intersection_set_alt(SubLObject mts) {
        return NIL == mts ? ((SubLObject) (hlmt.new_time_dimension($$Always_TimeInterval, $$TimePoint))) : com.cyc.cycjava.cycl.hlmt_relevance.temporal_mt_intersection(mts.first(), com.cyc.cycjava.cycl.hlmt_relevance.temporal_mt_intersection_set(mts.rest()));
    }

    public static SubLObject temporal_mt_intersection_set(final SubLObject mts) {
        return NIL == mts ? hlmt.new_time_dimension($$Always_TimeInterval, $$TimePoint) : temporal_mt_intersection(mts.first(), temporal_mt_intersection_set(mts.rest()));
    }

    public static final SubLObject temporal_mt_intersection_alt(SubLObject mt_1, SubLObject mt_2) {
        if (!((NIL != mt_1) && (NIL != mt_2))) {
            return NIL;
        }
        if (NIL != hlmt.hlmt_equalP(mt_1, mt_2)) {
            return mt_1;
        }
        {
            SubLObject index_1 = hlmt.extract_hlmt_temporal_index_or_default(mt_1);
            SubLObject param_1 = hlmt.extract_hlmt_time_parameter(mt_1);
            SubLObject index_2 = hlmt.extract_hlmt_temporal_index_or_default(mt_2);
            SubLObject param_2 = hlmt.extract_hlmt_time_parameter(mt_2);
            SubLObject new_index = com.cyc.cycjava.cycl.hlmt_relevance.temporal_intersection(index_1, index_2);
            if ((NIL == new_index) || (NIL != date_utilities.empty_time_intervalP(new_index))) {
                return NIL;
            }
            if (param_1 == $$Null_TimeParameter) {
                if (NIL == com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(index_1, new_index)) {
                    return NIL;
                }
            } else {
                if (NIL == com.cyc.cycjava.cycl.hlmt_relevance.time_interval_subsumes_typeP(new_index, param_1)) {
                    return NIL;
                }
            }
            if (param_2 == $$Null_TimeParameter) {
                if (NIL == com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(index_2, new_index)) {
                    return NIL;
                }
            } else {
                if (NIL == com.cyc.cycjava.cycl.hlmt_relevance.time_interval_subsumes_typeP(new_index, param_2)) {
                    return NIL;
                }
            }
            return hlmt.new_time_dimension(new_index, NIL != com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(param_1, param_2) ? ((SubLObject) (param_1)) : param_2);
        }
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

    public static final SubLObject temporal_intersection_set_alt(SubLObject intervals) {
        return NIL == intervals ? ((SubLObject) ($$Always_TimeInterval)) : com.cyc.cycjava.cycl.hlmt_relevance.temporal_intersection(intervals.first(), com.cyc.cycjava.cycl.hlmt_relevance.temporal_intersection_set(intervals.rest()));
    }

    public static SubLObject temporal_intersection_set(final SubLObject intervals) {
        return NIL == intervals ? $$Always_TimeInterval : temporal_intersection(intervals.first(), temporal_intersection_set(intervals.rest()));
    }

    /**
     *
     *
     * @return temporal-interval-p;  Returns the maximal time interval subsumed by both INTERVAL-1 and INTERVAL-2.
     */
    @LispMethod(comment = "@return temporal-interval-p;  Returns the maximal time interval subsumed by both INTERVAL-1 and INTERVAL-2.")
    public static final SubLObject temporal_intersection_alt(SubLObject interval_1, SubLObject interval_2) {
        if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(interval_2, interval_1)) {
            return interval_2;
        } else {
            if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.subsumed_time_intervalP(interval_1, interval_2)) {
                return interval_1;
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.empty_temporal_intersectionP(interval_1, interval_2)) {
                    return $$TheEmptyTimeInterval;
                } else {
                    {
                        SubLObject start_1 = time_interval_utilities.cycl_interval_initial_second(interval_1);
                        SubLObject start_2 = time_interval_utilities.cycl_interval_initial_second(interval_2);
                        SubLObject end_1 = time_interval_utilities.cycl_interval_final_second(interval_1);
                        SubLObject end_2 = time_interval_utilities.cycl_interval_final_second(interval_2);
                        if (!((((NIL != start_1) && (NIL != start_2)) && (NIL != end_1)) && (NIL != end_2))) {
                            return NIL;
                        } else {
                            if (NIL != date_utilities.dateLE(start_1, start_2)) {
                                return com.cyc.cycjava.cycl.hlmt_relevance.date_from_to(start_2, end_1);
                            } else {
                                return com.cyc.cycjava.cycl.hlmt_relevance.date_from_to(start_1, end_2);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return temporal-interval-p;  Returns the maximal time interval subsumed by both INTERVAL-1 and INTERVAL-2.
     */
    @LispMethod(comment = "@return temporal-interval-p;  Returns the maximal time interval subsumed by both INTERVAL-1 and INTERVAL-2.")
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

    /**
     *
     *
     * @return booleanp;  Returns whether the intersection of the time intervals INTERVAL-1 and INTERVAL-1 is empty.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether the intersection of the time intervals INTERVAL-1 and INTERVAL-1 is empty.")
    public static final SubLObject empty_temporal_intersectionP_alt(SubLObject interval_1, SubLObject interval_2) {
        if ((NIL != date_utilities.empty_time_intervalP(interval_1)) || (NIL != date_utilities.empty_time_intervalP(interval_2))) {
            return T;
        } else {
            if ((NIL != time_interval_utilities.date_interval_p(interval_1)) && (NIL != time_interval_utilities.date_interval_p(interval_2))) {
                return makeBoolean(NIL == time_interval_utilities.date_intervals_intersectP(interval_1, interval_2));
            } else {
                if (NIL != sbhl_time_modules.not_temporally_intersectsP(interval_1, interval_2, UNPROVIDED)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp;  Returns whether the intersection of the time intervals INTERVAL-1 and INTERVAL-1 is empty.
     */
    @LispMethod(comment = "@return booleanp;  Returns whether the intersection of the time intervals INTERVAL-1 and INTERVAL-1 is empty.")
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

    /**
     *
     *
     * @return time-interval-p;  Returns the time interval beginning at TIME-1 and ending at TIME-2.  Assumes that TIME-1 does in fact begin before TIME-2.
     */
    @LispMethod(comment = "@return time-interval-p;  Returns the time interval beginning at TIME-1 and ending at TIME-2.  Assumes that TIME-1 does in fact begin before TIME-2.")
    public static final SubLObject date_from_to_alt(SubLObject date_1, SubLObject date_2) {
        {
            SubLObject date_1_simplified = com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_start(date_1);
            SubLObject date_2_simplified = com.cyc.cycjava.cycl.hlmt_relevance.reduce_date_end(date_2);
            if (date_1_simplified.equal(date_2_simplified)) {
                return date_1_simplified;
            } else {
                if ((NIL != date_utilities.beginning_of_timeP(date_1_simplified)) && (NIL != date_utilities.end_of_timeP(date_2_simplified))) {
                    return $$Always_TimeInterval;
                } else {
                    if (NIL != date_utilities.beginning_of_timeP(date_1_simplified)) {
                        return list($$IntervalEndedByFn_Inclusive, date_2_simplified);
                    } else {
                        if (NIL != date_utilities.end_of_timeP(date_2_simplified)) {
                            return list($$IntervalStartedByFn_Inclusive, date_1_simplified);
                        } else {
                            return list($$TimeIntervalInclusiveFn, date_1_simplified, date_2_simplified);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return time-interval-p;  Returns the time interval beginning at TIME-1 and ending at TIME-2.  Assumes that TIME-1 does in fact begin before TIME-2.
     */
    @LispMethod(comment = "@return time-interval-p;  Returns the time interval beginning at TIME-1 and ending at TIME-2.  Assumes that TIME-1 does in fact begin before TIME-2.")
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

    /**
     *
     *
     * @return time-parameter-p;  Returns the minimal upper bound of time parameters PARAM-1 and PARAM-2.
     */
    @LispMethod(comment = "@return time-parameter-p;  Returns the minimal upper bound of time parameters PARAM-1 and PARAM-2.")
    public static final SubLObject time_parameter_mub_alt(SubLObject param_1, SubLObject param_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (param_1.equal(param_2)) {
                return param_2;
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(param_1, param_2)) {
                    return param_1;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(param_2, param_1)) {
                        return param_2;
                    } else {
                        if ((NIL != time_parameter_utilities.conventional_time_series_p(param_1)) && (NIL != time_parameter_utilities.conventional_time_series_p(param_2))) {
                            {
                                SubLObject result = NIL;
                                {
                                    SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                                    try {
                                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                                        result = gt_methods.gt_max_floors($$temporallySubsumes_TypeType, list(param_1, param_2), UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return result;
                            }
                        } else {
                            if ((NIL != time_parameter_utilities.sliding_time_type_p(param_1)) && (NIL != time_parameter_utilities.sliding_time_type_p(param_2))) {
                                Errors.error($str_alt39$One_same_length_duration_paramete, param_1, param_2);
                                return NIL;
                            } else {
                                {
                                    SubLObject conventional_type = (NIL != time_parameter_utilities.conventional_time_series_p(param_1)) ? ((SubLObject) (param_1)) : param_2;
                                    SubLObject sliding_type = (conventional_type == param_2) ? ((SubLObject) (param_1)) : param_2;
                                    if (NIL != time_parameter_utilities.gappy_time_type_p(conventional_type)) {
                                        return com.cyc.cycjava.cycl.hlmt_relevance.mub_of_sliding_type_and_gappy_type(sliding_type, conventional_type);
                                    } else {
                                        return com.cyc.cycjava.cycl.hlmt_relevance.mub_of_sliding_type_and_covering_type(sliding_type, conventional_type);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return time-parameter-p;  Returns the minimal upper bound of time parameters PARAM-1 and PARAM-2.
     */
    @LispMethod(comment = "@return time-parameter-p;  Returns the minimal upper bound of time parameters PARAM-1 and PARAM-2.")
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

    /**
     *
     *
     * @return time-parameter-p.  Returns the MUB of SLIDING-TYPE and GAPPY-TYPE, given
    the assumption that neither subsumes the other.
     */
    @LispMethod(comment = "@return time-parameter-p.  Returns the MUB of SLIDING-TYPE and GAPPY-TYPE, given\r\nthe assumption that neither subsumes the other.")
    public static final SubLObject mub_of_sliding_type_and_gappy_type_alt(SubLObject sliding_type, SubLObject gappy_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $param_max_upper_bound$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $hlmt_sliding_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $mub_sliding_and_gappy_types_result$.currentBinding(thread);
                    try {
                        $param_max_upper_bound$.bind(com.cyc.cycjava.cycl.hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(gappy_type), thread);
                        $hlmt_sliding_type$.bind(sliding_type, thread);
                        $mub_sliding_and_gappy_types_result$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_14 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                            try {
                                gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                                gt_methods.gt_compose_fn_all_inferiors($$temporallySubsumes_TypeType, gappy_type, MUB_GATHER_SUBSUMED_SLIDING_TYPES, UNPROVIDED, UNPROVIDED);
                            } finally {
                                gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0_14, thread);
                            }
                        }
                        result = $mub_sliding_and_gappy_types_result$.getDynamicValue(thread);
                        if (NIL == result) {
                            result = $param_max_upper_bound$.getDynamicValue(thread);
                        }
                    } finally {
                        $mub_sliding_and_gappy_types_result$.rebind(_prev_bind_2, thread);
                        $hlmt_sliding_type$.rebind(_prev_bind_1, thread);
                        $param_max_upper_bound$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return time-parameter-p.  Returns the MUB of SLIDING-TYPE and GAPPY-TYPE, given
    the assumption that neither subsumes the other.
     */
    @LispMethod(comment = "@return time-parameter-p.  Returns the MUB of SLIDING-TYPE and GAPPY-TYPE, given\r\nthe assumption that neither subsumes the other.")
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

    /**
     *
     *
     * @return sliding-time-type-p. Returns the minimally subsuming sliding time parameter type for the gappy calendar type TYPE.
     */
    @LispMethod(comment = "@return sliding-time-type-p. Returns the minimally subsuming sliding time parameter type for the gappy calendar type TYPE.")
    public static final SubLObject minimally_subsuming_sliding_type_for_gappy_type_alt(SubLObject type) {
        {
            SubLObject type_dur = time_parameter_utilities.gappy_type_duration(type);
            SubLObject period_dur = time_parameter_utilities.gappy_type_period(type);
            if ((NIL != time_parameter_utilities.duration_p(type_dur)) && (NIL != time_parameter_utilities.duration_p(period_dur))) {
                return time_parameter_utilities.make_sliding_type(time_parameter_utilities.add_durations(type_dur, period_dur));
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return sliding-time-type-p. Returns the minimally subsuming sliding time parameter type for the gappy calendar type TYPE.
     */
    @LispMethod(comment = "@return sliding-time-type-p. Returns the minimally subsuming sliding time parameter type for the gappy calendar type TYPE.")
    public static SubLObject minimally_subsuming_sliding_type_for_gappy_type(final SubLObject type) {
        final SubLObject type_dur = time_parameter_utilities.gappy_type_duration(type);
        final SubLObject period_dur = time_parameter_utilities.gappy_type_period(type);
        if ((NIL != time_parameter_utilities.duration_p(type_dur)) && (NIL != time_parameter_utilities.duration_p(period_dur))) {
            return time_parameter_utilities.make_sliding_type(time_parameter_utilities.add_durations(type_dur, period_dur));
        }
        return NIL;
    }

    /**
     * Modifier.  If TIME-PARAM susbsumes the previously bound sliding type, and is not subsumed by the previously calculated max upper bound, set *mub-sliding-and-gappy-types-result* and quit search.
     */
    @LispMethod(comment = "Modifier.  If TIME-PARAM susbsumes the previously bound sliding type, and is not subsumed by the previously calculated max upper bound, set *mub-sliding-and-gappy-types-result* and quit search.")
    public static final SubLObject mub_gather_subsumed_sliding_types_alt(SubLObject time_param) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    if (NIL == com.cyc.cycjava.cycl.hlmt_relevance.bigger_time_typeP(time_param, $param_max_upper_bound$.getDynamicValue(thread))) {
                        {
                            SubLObject _prev_bind_0_15 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                            SubLObject _prev_bind_1_16 = gt_vars.$gt_marking_table$.currentBinding(thread);
                            try {
                                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                                gt_vars.$gt_marking_table$.bind(NIL, thread);
                                gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                                {
                                    SubLObject _prev_bind_0_17 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                                    try {
                                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                                        {
                                            SubLObject catch_var = NIL;
                                            try {
                                                if (NIL != gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, time_param, $sym8$PARAMETER__PREVIOUS_SLIDING_TYPE, UNPROVIDED)) {
                                                    $mub_sliding_and_gappy_types_result$.setDynamicValue(time_param, thread);
                                                }
                                                gt_search.gt_finished(T);
                                            } catch (Throwable ccatch_env_var) {
                                                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_marking_table$.rebind(_prev_bind_1_16, thread);
                                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                    }
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier.  If TIME-PARAM susbsumes the previously bound sliding type, and is not subsumed by the previously calculated max upper bound, set *mub-sliding-and-gappy-types-result* and quit search.")
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
    }/**
     * Modifier.  If TIME-PARAM susbsumes the previously bound sliding type, and is not subsumed by the previously calculated max upper bound, set *mub-sliding-and-gappy-types-result* and quit search.
     */


    /**
     *
     *
     * @return time-parameter-p.  Returns the MUB of SLIDING-TYPE and COVERING-TYPE, given
    the assumption that neither subsumes the other.
     */
    @LispMethod(comment = "@return time-parameter-p.  Returns the MUB of SLIDING-TYPE and COVERING-TYPE, given\r\nthe assumption that neither subsumes the other.")
    public static final SubLObject mub_of_sliding_type_and_covering_type_alt(SubLObject sliding_type, SubLObject covering_type) {
        return time_parameter_utilities.make_sliding_type(list(time_parameter_utilities.time_series_type_duration(covering_type), TWO_INTEGER));
    }

    /**
     *
     *
     * @return time-parameter-p.  Returns the MUB of SLIDING-TYPE and COVERING-TYPE, given
    the assumption that neither subsumes the other.
     */
    @LispMethod(comment = "@return time-parameter-p.  Returns the MUB of SLIDING-TYPE and COVERING-TYPE, given\r\nthe assumption that neither subsumes the other.")
    public static SubLObject mub_of_sliding_type_and_covering_type(final SubLObject sliding_type, final SubLObject covering_type) {
        return time_parameter_utilities.make_sliding_type(list(time_parameter_utilities.time_series_type_duration(covering_type), TWO_INTEGER));
    }

    public static final SubLObject declare_hlmt_relevance_file_alt() {
        declareFunction("hlmt_visible_p", "HLMT-VISIBLE-P", 2, 0, false);
        declareFunction("mt_temporally_visible_p", "MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction("why_hlmt_visible_p", "WHY-HLMT-VISIBLE-P", 2, 3, false);
        declareFunction("why_mt_temporally_visible_p", "WHY-MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction("temporal_mt_visible_to_atemporal_mtP", "TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction("temporal_mts_visible_p", "TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction("why_temporal_mt_visible_to_atemporal_mtP", "WHY-TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction("why_temporal_mts_visible_p", "WHY-TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction("mt_time_interval_subsumes", "MT-TIME-INTERVAL-SUBSUMES", 2, 0, false);
        declareFunction("mt_times_visible_p", "MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction("why_mt_times_visible_p", "WHY-MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction("subsumed_time_intervalP", "SUBSUMED-TIME-INTERVAL?", 2, 0, false);
        declareFunction("bigger_time_typeP", "BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction("sliding_time_typeLE", "SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction("covering_type_subsumes_sliding_typeP", "COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction("sliding_type_subsumes_covering_typeP", "SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction("parameterLEprevious_sliding_type", "PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("parameterGEprevious_sliding_type", "PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("time_interval_subsumes_typeP", "TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("time_interval_subsumed_by_typeP", "TIME-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction("arbitrary_interval_subsumes_typeP", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("arbitrary_interval_subsumes_typeP_int", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?-INT", 2, 0, false);
        declareFunction("starting_date", "STARTING-DATE", 1, 1, false);
        declareFunction("ending_date", "ENDING-DATE", 1, 1, false);
        declareFunction("max_floor_polyad_mts", "MAX-FLOOR-POLYAD-MTS", 1, 3, false);
        declareFunction("temporal_index_intersection", "TEMPORAL-INDEX-INTERSECTION", 1, 0, false);
        declareFunction("time_parameter_mubs", "TIME-PARAMETER-MUBS", 1, 0, false);
        declareFunction("max_floor_monads", "MAX-FLOOR-MONADS", 3, 0, false);
        declareFunction("temporal_mt_intersection_setP", "TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        declareFunction("temporal_mts_intersectP", "TEMPORAL-MTS-INTERSECT?", 2, 0, false);
        declareFunction("temporal_mt_intersection_set", "TEMPORAL-MT-INTERSECTION-SET", 1, 0, false);
        declareFunction("temporal_mt_intersection", "TEMPORAL-MT-INTERSECTION", 2, 0, false);
        declareFunction("temporal_intersection_set", "TEMPORAL-INTERSECTION-SET", 1, 0, false);
        declareFunction("temporal_intersection", "TEMPORAL-INTERSECTION", 2, 0, false);
        declareFunction("empty_temporal_intersectionP", "EMPTY-TEMPORAL-INTERSECTION?", 2, 0, false);
        declareFunction("date_from_to", "DATE-FROM-TO", 2, 0, false);
        declareFunction("reduce_date_start", "REDUCE-DATE-START", 1, 0, false);
        declareFunction("reduce_date_end", "REDUCE-DATE-END", 1, 0, false);
        declareFunction("time_parameter_mub", "TIME-PARAMETER-MUB", 2, 0, false);
        declareFunction("mub_of_sliding_type_and_gappy_type", "MUB-OF-SLIDING-TYPE-AND-GAPPY-TYPE", 2, 0, false);
        declareFunction("minimally_subsuming_sliding_type_for_gappy_type", "MINIMALLY-SUBSUMING-SLIDING-TYPE-FOR-GAPPY-TYPE", 1, 0, false);
        declareFunction("mub_gather_subsumed_sliding_types", "MUB-GATHER-SUBSUMED-SLIDING-TYPES", 1, 0, false);
        declareFunction("mub_of_sliding_type_and_covering_type", "MUB-OF-SLIDING-TYPE-AND-COVERING-TYPE", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_hlmt_relevance_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("hlmt_visible_p", "HLMT-VISIBLE-P", 2, 0, false);
            declareFunction("mt_temporally_visible_p", "MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
            declareFunction("why_hlmt_visible_p", "WHY-HLMT-VISIBLE-P", 2, 3, false);
            declareFunction("why_mt_temporally_visible_p", "WHY-MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
            declareFunction("temporal_mt_visible_to_atemporal_mtP", "TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
            declareFunction("temporal_mts_visible_p", "TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
            declareFunction("why_temporal_mt_visible_to_atemporal_mtP", "WHY-TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
            declareFunction("why_temporal_mts_visible_p", "WHY-TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
            declareFunction("mt_time_interval_subsumes", "MT-TIME-INTERVAL-SUBSUMES", 2, 0, false);
            declareFunction("mt_times_visible_p", "MT-TIMES-VISIBLE-P", 4, 0, false);
            declareFunction("why_mt_times_visible_p", "WHY-MT-TIMES-VISIBLE-P", 4, 0, false);
            declareFunction("subsumed_time_intervalP", "SUBSUMED-TIME-INTERVAL?", 2, 0, false);
            declareFunction("bigger_time_typeP", "BIGGER-TIME-TYPE?", 2, 0, false);
            declareFunction("sliding_time_typeLE", "SLIDING-TIME-TYPE<=", 2, 0, false);
            declareFunction("covering_type_subsumes_sliding_typeP", "COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
            declareFunction("sliding_type_subsumes_covering_typeP", "SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
            declareFunction("parameterLEprevious_sliding_type", "PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
            declareFunction("parameterGEprevious_sliding_type", "PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
            declareFunction("time_interval_subsumes_typeP", "TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
            declareFunction("time_interval_subsumed_by_typeP", "TIME-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
            declareFunction("arbitrary_interval_subsumes_typeP", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
            declareFunction("arbitrary_interval_subsumes_typeP_int", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?-INT", 2, 0, false);
            declareFunction("starting_date", "STARTING-DATE", 1, 1, false);
            declareFunction("ending_date", "ENDING-DATE", 1, 1, false);
            declareFunction("max_floor_polyad_mts", "MAX-FLOOR-POLYAD-MTS", 1, 3, false);
            declareFunction("temporal_index_intersection", "TEMPORAL-INDEX-INTERSECTION", 1, 0, false);
            declareFunction("time_parameter_mubs", "TIME-PARAMETER-MUBS", 1, 0, false);
            declareFunction("max_floor_monads", "MAX-FLOOR-MONADS", 3, 0, false);
            declareFunction("temporal_mts_intersect_fastP", "TEMPORAL-MTS-INTERSECT-FAST?", 2, 0, false);
            declareFunction("temporal_mt_intersection_setP", "TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
            declareFunction("temporal_mts_intersectP", "TEMPORAL-MTS-INTERSECT?", 2, 0, false);
            declareFunction("temporal_mt_intersection_set", "TEMPORAL-MT-INTERSECTION-SET", 1, 0, false);
            declareFunction("temporal_mt_intersection", "TEMPORAL-MT-INTERSECTION", 2, 0, false);
            declareFunction("temporal_intersection_set", "TEMPORAL-INTERSECTION-SET", 1, 0, false);
            declareFunction("temporal_intersection", "TEMPORAL-INTERSECTION", 2, 0, false);
            declareFunction("temporal_intersection_int", "TEMPORAL-INTERSECTION-INT", 2, 0, false);
            declareFunction("empty_temporal_intersectionP", "EMPTY-TEMPORAL-INTERSECTION?", 2, 0, false);
            declareFunction("date_from_to", "DATE-FROM-TO", 2, 0, false);
            declareFunction("time_parameter_mub", "TIME-PARAMETER-MUB", 2, 0, false);
            declareFunction("mub_of_sliding_type_and_gappy_type", "MUB-OF-SLIDING-TYPE-AND-GAPPY-TYPE", 2, 0, false);
            declareFunction("minimally_subsuming_sliding_type_for_gappy_type", "MINIMALLY-SUBSUMING-SLIDING-TYPE-FOR-GAPPY-TYPE", 1, 0, false);
            declareFunction("mub_gather_subsumed_sliding_types", "MUB-GATHER-SUBSUMED-SLIDING-TYPES", 1, 0, false);
            declareFunction("mub_of_sliding_type_and_covering_type", "MUB-OF-SLIDING-TYPE-AND-COVERING-TYPE", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("reduce_date_start", "REDUCE-DATE-START", 1, 0, false);
            declareFunction("reduce_date_end", "REDUCE-DATE-END", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_hlmt_relevance_file_Previous() {
        declareFunction("hlmt_visible_p", "HLMT-VISIBLE-P", 2, 0, false);
        declareFunction("mt_temporally_visible_p", "MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction("why_hlmt_visible_p", "WHY-HLMT-VISIBLE-P", 2, 3, false);
        declareFunction("why_mt_temporally_visible_p", "WHY-MT-TEMPORALLY-VISIBLE-P", 2, 0, false);
        declareFunction("temporal_mt_visible_to_atemporal_mtP", "TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction("temporal_mts_visible_p", "TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction("why_temporal_mt_visible_to_atemporal_mtP", "WHY-TEMPORAL-MT-VISIBLE-TO-ATEMPORAL-MT?", 2, 0, false);
        declareFunction("why_temporal_mts_visible_p", "WHY-TEMPORAL-MTS-VISIBLE-P", 2, 0, false);
        declareFunction("mt_time_interval_subsumes", "MT-TIME-INTERVAL-SUBSUMES", 2, 0, false);
        declareFunction("mt_times_visible_p", "MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction("why_mt_times_visible_p", "WHY-MT-TIMES-VISIBLE-P", 4, 0, false);
        declareFunction("subsumed_time_intervalP", "SUBSUMED-TIME-INTERVAL?", 2, 0, false);
        declareFunction("bigger_time_typeP", "BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction("sliding_time_typeLE", "SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction("covering_type_subsumes_sliding_typeP", "COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction("sliding_type_subsumes_covering_typeP", "SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction("parameterLEprevious_sliding_type", "PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("parameterGEprevious_sliding_type", "PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("time_interval_subsumes_typeP", "TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("time_interval_subsumed_by_typeP", "TIME-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction("arbitrary_interval_subsumes_typeP", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("arbitrary_interval_subsumes_typeP_int", "ARBITRARY-INTERVAL-SUBSUMES-TYPE?-INT", 2, 0, false);
        declareFunction("starting_date", "STARTING-DATE", 1, 1, false);
        declareFunction("ending_date", "ENDING-DATE", 1, 1, false);
        declareFunction("max_floor_polyad_mts", "MAX-FLOOR-POLYAD-MTS", 1, 3, false);
        declareFunction("temporal_index_intersection", "TEMPORAL-INDEX-INTERSECTION", 1, 0, false);
        declareFunction("time_parameter_mubs", "TIME-PARAMETER-MUBS", 1, 0, false);
        declareFunction("max_floor_monads", "MAX-FLOOR-MONADS", 3, 0, false);
        declareFunction("temporal_mts_intersect_fastP", "TEMPORAL-MTS-INTERSECT-FAST?", 2, 0, false);
        declareFunction("temporal_mt_intersection_setP", "TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        declareFunction("temporal_mts_intersectP", "TEMPORAL-MTS-INTERSECT?", 2, 0, false);
        declareFunction("temporal_mt_intersection_set", "TEMPORAL-MT-INTERSECTION-SET", 1, 0, false);
        declareFunction("temporal_mt_intersection", "TEMPORAL-MT-INTERSECTION", 2, 0, false);
        declareFunction("temporal_intersection_set", "TEMPORAL-INTERSECTION-SET", 1, 0, false);
        declareFunction("temporal_intersection", "TEMPORAL-INTERSECTION", 2, 0, false);
        declareFunction("temporal_intersection_int", "TEMPORAL-INTERSECTION-INT", 2, 0, false);
        declareFunction("empty_temporal_intersectionP", "EMPTY-TEMPORAL-INTERSECTION?", 2, 0, false);
        declareFunction("date_from_to", "DATE-FROM-TO", 2, 0, false);
        declareFunction("time_parameter_mub", "TIME-PARAMETER-MUB", 2, 0, false);
        declareFunction("mub_of_sliding_type_and_gappy_type", "MUB-OF-SLIDING-TYPE-AND-GAPPY-TYPE", 2, 0, false);
        declareFunction("minimally_subsuming_sliding_type_for_gappy_type", "MINIMALLY-SUBSUMING-SLIDING-TYPE-FOR-GAPPY-TYPE", 1, 0, false);
        declareFunction("mub_gather_subsumed_sliding_types", "MUB-GATHER-SUBSUMED-SLIDING-TYPES", 1, 0, false);
        declareFunction("mub_of_sliding_type_and_covering_type", "MUB-OF-SLIDING-TYPE-AND-COVERING-TYPE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_hlmt_relevance_file_alt() {
        deflexical("*TIME-INFERENCE-MT*", NIL != boundp($time_inference_mt$) ? ((SubLObject) ($time_inference_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        defparameter("*HLMT-SLIDING-TYPE*", NIL);
        defparameter("*MUB-SLIDING-AND-GAPPY-TYPES-RESULT*", NIL);
        defparameter("*PARAM-MAX-UPPER-BOUND*", NIL);
        return NIL;
    }

    public static SubLObject init_hlmt_relevance_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TIME-INFERENCE-MT*", SubLTrampolineFile.maybeDefault($time_inference_mt$, $time_inference_mt$, $$UniversalVocabularyMt));
            defparameter("*HLMT-SLIDING-TYPE*", NIL);
            deflexical("*DATE-RANGE-TIME-MT-PATTERN*", $list26);
            defparameter("*TEMPORAL-INTERSECTION-CALL-ARGS*", NIL);
            defparameter("*DISABLE-TEMPORAL-INDEXICAL-SUPPORT?*", NIL);
            defparameter("*MUB-SLIDING-AND-GAPPY-TYPES-RESULT*", NIL);
            defparameter("*PARAM-MAX-UPPER-BOUND*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TIME-INFERENCE-MT*", NIL != boundp($time_inference_mt$) ? ((SubLObject) ($time_inference_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        }
        return NIL;
    }

    public static SubLObject init_hlmt_relevance_file_Previous() {
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

    static {
    }













    public static final SubLInteger $int$59 = makeInteger(59);





    static private final SubLString $str_alt39$One_same_length_duration_paramete = makeString("One same length duration parameter should subsume another ~a ~a~%");
}

/**
 * Total time: 322 ms
 */
