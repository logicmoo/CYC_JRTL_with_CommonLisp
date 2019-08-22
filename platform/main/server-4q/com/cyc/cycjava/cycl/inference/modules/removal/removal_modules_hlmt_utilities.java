package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_hlmt_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_hlmt_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities";

    public static final String myFingerPrint = "b4624fb9fb800cd564c461a0c35fc94a17bb993f2e3ddf57f3ff4af27af1b245";

    private static final SubLObject $$mtMonad = reader_make_constant_shell(makeString("mtMonad"));



    private static final SubLSymbol $REMOVAL_MT_MONAD_CHECK = makeKeyword("REMOVAL-MT-MONAD-CHECK");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtMonad")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("MONAD"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("MONAD")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("MONAD")), list(makeKeyword("CALL"), makeSymbol("MONAD-MT-EQUAL"), list(makeKeyword("CALL"), makeSymbol("HLMT-MONAD-MT"), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), list(makeKeyword("VALUE"), makeSymbol("MONAD")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) #$HumanActivitiesMt)") });

    private static final SubLSymbol $REMOVAL_MT_MONAD_UNIFY = makeKeyword("REMOVAL-MT-MONAD-UNIFY");

    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtMonad")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("HLMT-MONAD-MT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?MONAD)\n    -->\n    (((?MONAD . #$HumanActivitiesMt)))") });

    private static final SubLSymbol $REMOVAL_MT_MONAD_UNIFY_ARG1 = makeKeyword("REMOVAL-MT-MONAD-UNIFY-ARG1");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MT-MONAD-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MONAD"))), list(makeKeyword("VALUE"), makeSymbol("MONAD"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("HLMTS-WITH-MONAD"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("MONAD"))), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad ?HLMT #$HumanActivitiesMt)") });

    private static final SubLSymbol $MT_MONAD_UNIFY_ARG1_POS = makeKeyword("MT-MONAD-UNIFY-ARG1-POS");

    private static final SubLList $list9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtMonad")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLList $list11 = list(reader_make_constant_shell(makeString("AnytimePSC")));





    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLObject $$mtTimeIndex = reader_make_constant_shell(makeString("mtTimeIndex"));

    private static final SubLSymbol $REMOVAL_MT_TIME_INDEX_CHECK = makeKeyword("REMOVAL-MT-TIME-INDEX-CHECK");

    public static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtTimeIndex")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("TIME"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("TIME")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("TIME")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-OBJECT-EQUAL"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), list(makeKeyword("VALUE"), makeSymbol("HLMT")))), list(makeKeyword("VALUE"), makeSymbol("TIME")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) (#$YearFn 2000))") });

    private static final SubLSymbol $REMOVAL_MT_TIME_INDEX_UNIFY = makeKeyword("REMOVAL-MT-TIME-INDEX-UNIFY");

    public static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtTimeIndex")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeIndex")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?TIME)\n    -->\n    (((?TIME #$YearFn 2000)))") });

    private static final SubLObject $$mtTimeParameter = reader_make_constant_shell(makeString("mtTimeParameter"));

    private static final SubLSymbol $REMOVAL_MT_TIME_PARAMETER_CHECK = makeKeyword("REMOVAL-MT-TIME-PARAMETER-CHECK");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeParameter")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtTimeParameter")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("PARAM"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("PARAM")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("PARAM")), list(makeKeyword("CALL"), makeSymbol("TIME-PARAMETER-EQUAL"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), list(makeKeyword("VALUE"), makeSymbol("HLMT")))), list(makeKeyword("VALUE"), makeSymbol("PARAM")))), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) #$CalendarSecond)") });

    private static final SubLSymbol $REMOVAL_MT_TIME_PARAMETER_UNIFY = makeKeyword("REMOVAL-MT-TIME-PARAMETER-UNIFY");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeParameter")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("mtTimeParameter")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("mtTimeParameter")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) ?PARAM)\n    -->\n    (((?PARAM . #$CalendarSecond)))") });

    private static final SubLObject $$temporalMicrotheoriesIntersect = reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect"));

    private static final SubLSymbol $sym26$CONTAINS_INDEXICAL_ = makeSymbol("CONTAINS-INDEXICAL?");

    private static final SubLSymbol $REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS = makeKeyword("REMOVAL-TEMPORAL-MICROTHEORIES-INTERSECT-CHECK-POS");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect")), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORAL-MT-INTERSECTION-SET?"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$temporalMicrotheoriesIntersect . <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$temporalMicrotheoriesIntersect (#$MtTimeWithGranularityDimFn (#$YearFn 2004) #$CalendarMonth) (#$MtTimeDimFn (#$MonthFn #$September (#$YearFn 2004))))") });

    private static final SubLObject $$precedes_Metric = reader_make_constant_shell(makeString("precedes-Metric"));

    private static final SubLSymbol $REMOVAL_PRECEDES_METRIC_CHECK = makeKeyword("REMOVAL-PRECEDES-METRIC-CHECK");

    public static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("precedes-Metric")), list(makeKeyword("BIND"), makeSymbol("INTERVAL1")), list(makeKeyword("BIND"), makeSymbol("INTERVAL2")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL1")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL2")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL1"), makeSymbol("INTERVAL2"), makeSymbol("TYPE"), makeSymbol("AMT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-PRECEDES-METRIC-CHECK"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL1")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL2")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) (#$YearFn 2004) #$CalendarYear 3)") });

    private static final SubLSymbol $REMOVAL_PRECEDES_METRIC_UNIFY_1 = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-1");

    public static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE"), makeSymbol("AMT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT"))), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <not-fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric ?WHAT (#$YearFn 2004) #$CalendarYear 3)") });

    private static final SubLSymbol $REMOVAL_PRECEDES_METRIC_UNIFY_2 = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-2");

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("precedes-Metric")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("precedes-Metric")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE"), makeSymbol("AMT")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("precedes-Metric")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT"))), makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <fully-bound> <not-fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) ?WHAT #$CalendarYear 3)") });

    public static SubLObject removal_mt_monad_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject cost = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(listS($$MtSpace, monad, $list11));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = virtual_indexing.estimated_num_overlap_index(list($$MtSpace, monad), UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    public static SubLObject hlmts_with_monad(final SubLObject monad) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = list(monad);
        final SubLObject hlmts_seen_so_far = set.new_set(symbol_function(EQUAL), $int$32);
        if (NIL == member(monad, results, HLMT_EQUAL, symbol_function(IDENTITY))) {
            results = cons(monad, results);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(list($$MtSpace, monad, $$AnytimePSC));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list(monad), UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
                if ((NIL != hlmt.hlmt_equal(monad, hlmt.hlmt_monad_mt(v_hlmt))) && (NIL == set.set_memberP(v_hlmt, hlmts_seen_so_far))) {
                    set.set_add(v_hlmt, hlmts_seen_so_far);
                    final SubLObject item_var = v_hlmt;
                    if (NIL == member(item_var, results, HLMT_EQUAL, symbol_function(IDENTITY))) {
                        results = cons(item_var, results);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iteration.new_list_iterator(results);
    }

    public static SubLObject inference_temporal_mt_intersection_setP(final SubLObject asent) {
        SubLObject hlmts = cycl_utilities.formula_args(asent, UNPROVIDED);
        if (NIL != list_utilities.any_in_list($sym26$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED)) {
            hlmts = date_utilities.bind_temporal_indexicals_in_hlmt_list(hlmts);
        }
        return hlmt_relevance.temporal_mt_intersection_setP(hlmts);
    }

    public static SubLObject inference_precedes_metric_check(final SubLObject interval1, final SubLObject interval2, final SubLObject type, final SubLObject amt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_defns.quiet_has_typeP(interval1, type, UNPROVIDED)) && (NIL != at_defns.quiet_has_typeP(interval2, type, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification.unify(interval1, time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval2, type, amt), UNPROVIDED, UNPROVIDED);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return v_bindings;
        }
        return NIL;
    }

    public static SubLObject inference_time_of_type_before_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        final SubLObject result = (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, amt) : NIL;
        return NIL != result ? list(result) : NIL;
    }

    public static SubLObject inference_time_of_type_after_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        final SubLObject result = (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, amt) : NIL;
        return NIL != result ? list(result) : NIL;
    }

    public static SubLObject declare_removal_modules_hlmt_utilities_file() {
        declareFunction(me, "removal_mt_monad_unify_arg1_cost", "REMOVAL-MT-MONAD-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "hlmts_with_monad", "HLMTS-WITH-MONAD", 1, 0, false);
        declareFunction(me, "inference_temporal_mt_intersection_setP", "INFERENCE-TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        declareFunction(me, "inference_precedes_metric_check", "INFERENCE-PRECEDES-METRIC-CHECK", 4, 0, false);
        declareFunction(me, "inference_time_of_type_before_interval", "INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        declareFunction(me, "inference_time_of_type_after_interval", "INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_hlmt_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_hlmt_utilities_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$mtMonad);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$mtMonad);
        inference_modules.inference_removal_module($REMOVAL_MT_MONAD_CHECK, $list3);
        inference_modules.inference_removal_module($REMOVAL_MT_MONAD_UNIFY, $list5);
        inference_modules.inference_removal_module($REMOVAL_MT_MONAD_UNIFY_ARG1, $list7);
        preference_modules.inference_preference_module($MT_MONAD_UNIFY_ARG1_POS, $list9);
        inference_modules.register_solely_specific_removal_module_predicate($$mtTimeIndex);
        preference_modules.doomed_unless_arg_bindable($POS, $$mtTimeIndex, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MT_TIME_INDEX_CHECK, $list17);
        inference_modules.inference_removal_module($REMOVAL_MT_TIME_INDEX_UNIFY, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($$mtTimeParameter);
        preference_modules.doomed_unless_arg_bindable($POS, $$mtTimeParameter, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MT_TIME_PARAMETER_CHECK, $list22);
        inference_modules.inference_removal_module($REMOVAL_MT_TIME_PARAMETER_UNIFY, $list24);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalMicrotheoriesIntersect);
        preference_modules.doomed_unless_all_args_bindable($POS, $$temporalMicrotheoriesIntersect);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS, $list28);
        inference_modules.register_solely_specific_removal_module_predicate($$precedes_Metric);
        inference_modules.inference_removal_module($REMOVAL_PRECEDES_METRIC_CHECK, $list31);
        inference_modules.inference_removal_module($REMOVAL_PRECEDES_METRIC_UNIFY_1, $list33);
        inference_modules.inference_removal_module($REMOVAL_PRECEDES_METRIC_UNIFY_2, $list35);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_hlmt_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_hlmt_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_hlmt_utilities_file();
    }

    
}

/**
 * Total time: 212 ms
 */
