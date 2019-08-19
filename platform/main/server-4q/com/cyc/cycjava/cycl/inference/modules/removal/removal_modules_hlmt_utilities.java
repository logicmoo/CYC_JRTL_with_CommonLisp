package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_hlmt_utilities extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities";
    public static String myFingerPrint = "b4624fb9fb800cd564c461a0c35fc94a17bb993f2e3ddf57f3ff4af27af1b245";
    private static SubLObject $$mtMonad;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_MT_MONAD_CHECK;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_MT_MONAD_UNIFY;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_MT_MONAD_UNIFY_ARG1;
    private static SubLList $list7;
    private static SubLSymbol $MT_MONAD_UNIFY_ARG1_POS;
    private static SubLList $list9;
    private static SubLObject $$MtSpace;
    private static SubLList $list11;
    private static SubLInteger $int$32;
    private static SubLSymbol $sym13$HLMT_EQUAL;
    private static SubLObject $$AnytimePSC;
    private static SubLObject $$mtTimeIndex;
    private static SubLSymbol $REMOVAL_MT_TIME_INDEX_CHECK;
    private static SubLList $list17;
    private static SubLSymbol $REMOVAL_MT_TIME_INDEX_UNIFY;
    private static SubLList $list19;
    private static SubLObject $$mtTimeParameter;
    private static SubLSymbol $REMOVAL_MT_TIME_PARAMETER_CHECK;
    private static SubLList $list22;
    private static SubLSymbol $REMOVAL_MT_TIME_PARAMETER_UNIFY;
    private static SubLList $list24;
    private static SubLObject $$temporalMicrotheoriesIntersect;
    private static SubLSymbol $sym26$CONTAINS_INDEXICAL_;
    private static SubLSymbol $REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS;
    private static SubLList $list28;
    private static SubLObject $$precedes_Metric;
    private static SubLSymbol $REMOVAL_PRECEDES_METRIC_CHECK;
    private static SubLList $list31;
    private static SubLSymbol $REMOVAL_PRECEDES_METRIC_UNIFY_1;
    private static SubLList $list33;
    private static SubLSymbol $REMOVAL_PRECEDES_METRIC_UNIFY_2;
    private static SubLList $list35;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 3100L)
    public static SubLObject removal_mt_monad_unify_arg1_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject monad = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        SubLObject cost = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(listS($$MtSpace, monad, $list11));
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 3400L)
    public static SubLObject hlmts_with_monad(SubLObject monad) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = list(monad);
        SubLObject hlmts_seen_so_far = set.new_set(Symbols.symbol_function(EQUAL), $int$32);
        if (NIL == conses_high.member(monad, results, $sym13$HLMT_EQUAL, Symbols.symbol_function(IDENTITY))) {
            results = cons(monad, results);
        }
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(list($$MtSpace, monad, $$AnytimePSC));
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list(monad), UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
                if (NIL != hlmt.hlmt_equal(monad, hlmt.hlmt_monad_mt(v_hlmt)) && NIL == set.set_memberP(v_hlmt, hlmts_seen_so_far)) {
                    set.set_add(v_hlmt, hlmts_seen_so_far);
                    SubLObject item_var = v_hlmt;
                    if (NIL == conses_high.member(item_var, results, $sym13$HLMT_EQUAL, Symbols.symbol_function(IDENTITY))) {
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 7300L)
    public static SubLObject inference_temporal_mt_intersection_setP(SubLObject asent) {
        SubLObject hlmts = cycl_utilities.formula_args(asent, UNPROVIDED);
        if (NIL != list_utilities.any_in_list($sym26$CONTAINS_INDEXICAL_, hlmts, UNPROVIDED)) {
            hlmts = date_utilities.bind_temporal_indexicals_in_hlmt_list(hlmts);
        }
        return hlmt_relevance.temporal_mt_intersection_setP(hlmts);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 8300L)
    public static SubLObject inference_precedes_metric_check(SubLObject interval1, SubLObject interval2, SubLObject type, SubLObject amt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_defns.quiet_has_typeP(interval1, type, UNPROVIDED) && NIL != at_defns.quiet_has_typeP(interval2, type, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification.unify(interval1, time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval2, type, amt), UNPROVIDED, UNPROVIDED);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return v_bindings;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 8800L)
    public static SubLObject inference_time_of_type_before_interval(SubLObject type, SubLObject amt, SubLObject interval) {
        SubLObject result = (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, amt) : NIL;
        return (NIL != result) ? list(result) : NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 9000L)
    public static SubLObject inference_time_of_type_after_interval(SubLObject type, SubLObject amt, SubLObject interval) {
        SubLObject result = (NIL != at_defns.quiet_has_typeP(interval, type, UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, amt) : NIL;
        return (NIL != result) ? list(result) : NIL;
    }

    public static SubLObject declare_removal_modules_hlmt_utilities_file() {
        declareFunction(myName, "removal_mt_monad_unify_arg1_cost", "REMOVAL-MT-MONAD-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(myName, "hlmts_with_monad", "HLMTS-WITH-MONAD", 1, 0, false);
        declareFunction(myName, "inference_temporal_mt_intersection_setP", "INFERENCE-TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        declareFunction(myName, "inference_precedes_metric_check", "INFERENCE-PRECEDES-METRIC-CHECK", 4, 0, false);
        declareFunction(myName, "inference_time_of_type_before_interval", "INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        declareFunction(myName, "inference_time_of_type_after_interval", "INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
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

    static {
        me = new removal_modules_hlmt_utilities();
        $$mtMonad = makeConstSym(("mtMonad"));
        $POS = makeKeyword("POS");
        $REMOVAL_MT_MONAD_CHECK = makeKeyword("REMOVAL-MT-MONAD-CHECK");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtMonad")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtMonad")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("MONAD"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("MONAD")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("MONAD")), list(makeKeyword("CALL"), makeSymbol("MONAD-MT-EQUAL"), list(makeKeyword("CALL"), makeSymbol("HLMT-MONAD-MT"), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), list(makeKeyword("VALUE"), makeSymbol("MONAD")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) #$HumanActivitiesMt)") });
        $REMOVAL_MT_MONAD_UNIFY = makeKeyword("REMOVAL-MT-MONAD-UNIFY");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtMonad")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtMonad")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("HLMT-MONAD-MT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("mtMonad")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtMonad <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?MONAD)\n    -->\n    (((?MONAD . #$HumanActivitiesMt)))") });
        $REMOVAL_MT_MONAD_UNIFY_ARG1 = makeKeyword("REMOVAL-MT-MONAD-UNIFY-ARG1");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtMonad")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MT-MONAD-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtMonad")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MONAD"))), list(makeKeyword("VALUE"), makeSymbol("MONAD"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("HLMTS-WITH-MONAD"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("mtMonad")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("MONAD"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$mtMonad <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtMonad ?HLMT #$HumanActivitiesMt)") });
        $MT_MONAD_UNIFY_ARG1_POS = makeKeyword("MT-MONAD-UNIFY-ARG1-POS");
        $list9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtMonad")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtMonad")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $$MtSpace = makeConstSym(("MtSpace"));
        $list11 = list(makeConstSym(("AnytimePSC")));
        $int$32 = makeInteger(32);
        $sym13$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
        $$AnytimePSC = makeConstSym(("AnytimePSC"));
        $$mtTimeIndex = makeConstSym(("mtTimeIndex"));
        $REMOVAL_MT_TIME_INDEX_CHECK = makeKeyword("REMOVAL-MT-TIME-INDEX-CHECK");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtTimeIndex")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtTimeIndex")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("TIME"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("TIME")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("TIME")),
                        list(makeKeyword("CALL"), makeSymbol("TEMPORAL-OBJECT-EQUAL"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), list(makeKeyword("VALUE"), makeSymbol("HLMT")))),
                                list(makeKeyword("VALUE"), makeSymbol("TIME")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) (#$YearFn 2000))") });
        $REMOVAL_MT_TIME_INDEX_UNIFY = makeKeyword("REMOVAL-MT-TIME-INDEX-UNIFY");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtTimeIndex")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtTimeIndex")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtTimeIndex")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("mtTimeIndex")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeIndex <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?TIME)\n    -->\n    (((?TIME #$YearFn 2000)))") });
        $$mtTimeParameter = makeConstSym(("mtTimeParameter"));
        $REMOVAL_MT_TIME_PARAMETER_CHECK = makeKeyword("REMOVAL-MT-TIME-PARAMETER-CHECK");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtTimeParameter")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtTimeParameter")), list(makeKeyword("BIND"), makeSymbol("HLMT")), list(makeKeyword("BIND"), makeSymbol("PARAM"))), list(list(makeKeyword("VALUE"), makeSymbol("HLMT")), list(makeKeyword("VALUE"), makeSymbol("PARAM")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("HLMT"), makeSymbol("PARAM")),
                        list(makeKeyword("CALL"), makeSymbol("TIME-PARAMETER-EQUAL"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), list(makeKeyword("VALUE"), makeSymbol("HLMT")))),
                                list(makeKeyword("VALUE"), makeSymbol("PARAM")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) #$CalendarSecond)") });
        $REMOVAL_MT_TIME_PARAMETER_UNIFY = makeKeyword("REMOVAL-MT-TIME-PARAMETER-UNIFY");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("mtTimeParameter")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("mtTimeParameter")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("mtTimeParameter")), list(makeKeyword("BIND"), makeSymbol("HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), list(makeKeyword("CALL"), makeSymbol("CANONICALIZE-HLMT"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("mtTimeParameter")), list(makeKeyword("VALUE"), makeSymbol("HLMT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$mtTimeParameter <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) ?PARAM)\n    -->\n    (((?PARAM . #$CalendarSecond)))") });
        $$temporalMicrotheoriesIntersect = makeConstSym(("temporalMicrotheoriesIntersect"));
        $sym26$CONTAINS_INDEXICAL_ = makeSymbol("CONTAINS-INDEXICAL?");
        $REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS = makeKeyword("REMOVAL-TEMPORAL-MICROTHEORIES-INTERSECT-CHECK-POS");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalMicrotheoriesIntersect")), makeKeyword("REQUIRED-PATTERN"), cons(makeConstSym(("temporalMicrotheoriesIntersect")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORAL-MT-INTERSECTION-SET?"), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$temporalMicrotheoriesIntersect . <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$temporalMicrotheoriesIntersect (#$MtTimeWithGranularityDimFn (#$YearFn 2004) #$CalendarMonth) (#$MtTimeDimFn (#$MonthFn #$September (#$YearFn 2004))))") });
        $$precedes_Metric = makeConstSym(("precedes-Metric"));
        $REMOVAL_PRECEDES_METRIC_CHECK = makeKeyword("REMOVAL-PRECEDES-METRIC-CHECK");
        $list31 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("precedes-Metric")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("precedes-Metric")), list(makeKeyword("BIND"), makeSymbol("INTERVAL1")), list(makeKeyword("BIND"), makeSymbol("INTERVAL2")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL1")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL2")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL1"), makeSymbol("INTERVAL2"), makeSymbol("TYPE"), makeSymbol("AMT")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-PRECEDES-METRIC-CHECK"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL1")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL2")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$precedes-Metric <fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) (#$YearFn 2004) #$CalendarYear 3)") });
        $REMOVAL_PRECEDES_METRIC_UNIFY_1 = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-1");
        $list33 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("precedes-Metric")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("precedes-Metric")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE"), makeSymbol("AMT")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("precedes-Metric")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$precedes-Metric <not-fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric ?WHAT (#$YearFn 2004) #$CalendarYear 3)") });
        $REMOVAL_PRECEDES_METRIC_UNIFY_2 = makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-2");
        $list35 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("precedes-Metric")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("precedes-Metric")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("precedes-Metric")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("TYPE")), list(makeKeyword("BIND"), makeSymbol("AMT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE"), makeSymbol("AMT")),
                        list(makeKeyword("CALL"), makeSymbol("INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("precedes-Metric")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE")), list(makeKeyword("VALUE"), makeSymbol("AMT"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$precedes-Metric <fully-bound> <not-fully-bound> <fully-bound> <positive-integer-p>"), makeKeyword("EXAMPLE"), makeString("(#$precedes-Metric (#$YearFn 2001) ?WHAT #$CalendarYear 3)") });
    }
}
/*
 *
 * Total time: 212 ms
 *
 */