package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_hlmt_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities";
    public static final String myFingerPrint = "b4624fb9fb800cd564c461a0c35fc94a17bb993f2e3ddf57f3ff4af27af1b245";
    private static final SubLObject $const0$mtMonad;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_MT_MONAD_CHECK;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_MT_MONAD_UNIFY;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_MT_MONAD_UNIFY_ARG1;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$MT_MONAD_UNIFY_ARG1_POS;
    private static final SubLList $list9;
    private static final SubLObject $const10$MtSpace;
    private static final SubLList $list11;
    private static final SubLInteger $int12$32;
    private static final SubLSymbol $sym13$HLMT_EQUAL;
    private static final SubLObject $const14$AnytimePSC;
    private static final SubLObject $const15$mtTimeIndex;
    private static final SubLSymbol $kw16$REMOVAL_MT_TIME_INDEX_CHECK;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_MT_TIME_INDEX_UNIFY;
    private static final SubLList $list19;
    private static final SubLObject $const20$mtTimeParameter;
    private static final SubLSymbol $kw21$REMOVAL_MT_TIME_PARAMETER_CHECK;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$REMOVAL_MT_TIME_PARAMETER_UNIFY;
    private static final SubLList $list24;
    private static final SubLObject $const25$temporalMicrotheoriesIntersect;
    private static final SubLSymbol $sym26$CONTAINS_INDEXICAL_;
    private static final SubLSymbol $kw27$REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS;
    private static final SubLList $list28;
    private static final SubLObject $const29$precedes_Metric;
    private static final SubLSymbol $kw30$REMOVAL_PRECEDES_METRIC_CHECK;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$REMOVAL_PRECEDES_METRIC_UNIFY_1;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$REMOVAL_PRECEDES_METRIC_UNIFY_2;
    private static final SubLList $list35;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 3140L)
    public static SubLObject removal_mt_monad_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_hlmt_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_hlmt_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED);
        SubLObject cost = (SubLObject)removal_modules_hlmt_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate((SubLObject)ConsesLow.listS(removal_modules_hlmt_utilities.$const10$MtSpace, monad, (SubLObject)removal_modules_hlmt_utilities.$list11));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = virtual_indexing.estimated_num_overlap_index((SubLObject)ConsesLow.list(removal_modules_hlmt_utilities.$const10$MtSpace, monad), (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 3432L)
    public static SubLObject hlmts_with_monad(final SubLObject monad) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)ConsesLow.list(monad);
        final SubLObject hlmts_seen_so_far = set.new_set(Symbols.symbol_function((SubLObject)removal_modules_hlmt_utilities.EQUAL), (SubLObject)removal_modules_hlmt_utilities.$int12$32);
        if (removal_modules_hlmt_utilities.NIL == conses_high.member(monad, results, (SubLObject)removal_modules_hlmt_utilities.$sym13$HLMT_EQUAL, Symbols.symbol_function((SubLObject)removal_modules_hlmt_utilities.IDENTITY))) {
            results = (SubLObject)ConsesLow.cons(monad, results);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate((SubLObject)ConsesLow.list(removal_modules_hlmt_utilities.$const10$MtSpace, monad, removal_modules_hlmt_utilities.$const14$AnytimePSC));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index((SubLObject)ConsesLow.list(monad), (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED);
            SubLObject assertion = (SubLObject)removal_modules_hlmt_utilities.NIL;
            assertion = cdolist_list_var.first();
            while (removal_modules_hlmt_utilities.NIL != cdolist_list_var) {
                final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
                if (removal_modules_hlmt_utilities.NIL != hlmt.hlmt_equal(monad, hlmt.hlmt_monad_mt(v_hlmt)) && removal_modules_hlmt_utilities.NIL == set.set_memberP(v_hlmt, hlmts_seen_so_far)) {
                    set.set_add(v_hlmt, hlmts_seen_so_far);
                    final SubLObject item_var = v_hlmt;
                    if (removal_modules_hlmt_utilities.NIL == conses_high.member(item_var, results, (SubLObject)removal_modules_hlmt_utilities.$sym13$HLMT_EQUAL, Symbols.symbol_function((SubLObject)removal_modules_hlmt_utilities.IDENTITY))) {
                        results = (SubLObject)ConsesLow.cons(item_var, results);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iteration.new_list_iterator(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 7374L)
    public static SubLObject inference_temporal_mt_intersection_setP(final SubLObject asent) {
        SubLObject hlmts = cycl_utilities.formula_args(asent, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED);
        if (removal_modules_hlmt_utilities.NIL != list_utilities.any_in_list((SubLObject)removal_modules_hlmt_utilities.$sym26$CONTAINS_INDEXICAL_, hlmts, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED)) {
            hlmts = date_utilities.bind_temporal_indexicals_in_hlmt_list(hlmts);
        }
        return hlmt_relevance.temporal_mt_intersection_setP(hlmts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 8394L)
    public static SubLObject inference_precedes_metric_check(final SubLObject interval1, final SubLObject interval2, final SubLObject type, final SubLObject amt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_hlmt_utilities.NIL != at_defns.quiet_has_typeP(interval1, type, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED) && removal_modules_hlmt_utilities.NIL != at_defns.quiet_has_typeP(interval2, type, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification.unify(interval1, time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval2, type, amt), (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return v_bindings;
        }
        return (SubLObject)removal_modules_hlmt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 8820L)
    public static SubLObject inference_time_of_type_before_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        final SubLObject result = (SubLObject)((removal_modules_hlmt_utilities.NIL != at_defns.quiet_has_typeP(interval, type, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, amt) : removal_modules_hlmt_utilities.NIL);
        return (SubLObject)((removal_modules_hlmt_utilities.NIL != result) ? ConsesLow.list(result) : removal_modules_hlmt_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-hlmt-utilities.lisp", position = 9077L)
    public static SubLObject inference_time_of_type_after_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        final SubLObject result = (SubLObject)((removal_modules_hlmt_utilities.NIL != at_defns.quiet_has_typeP(interval, type, (SubLObject)removal_modules_hlmt_utilities.UNPROVIDED)) ? time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, amt) : removal_modules_hlmt_utilities.NIL);
        return (SubLObject)((removal_modules_hlmt_utilities.NIL != result) ? ConsesLow.list(result) : removal_modules_hlmt_utilities.NIL);
    }
    
    public static SubLObject declare_removal_modules_hlmt_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "removal_mt_monad_unify_arg1_cost", "REMOVAL-MT-MONAD-UNIFY-ARG1-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "hlmts_with_monad", "HLMTS-WITH-MONAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "inference_temporal_mt_intersection_setP", "INFERENCE-TEMPORAL-MT-INTERSECTION-SET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "inference_precedes_metric_check", "INFERENCE-PRECEDES-METRIC-CHECK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "inference_time_of_type_before_interval", "INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_hlmt_utilities", "inference_time_of_type_after_interval", "INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
        return (SubLObject)removal_modules_hlmt_utilities.NIL;
    }
    
    public static SubLObject init_removal_modules_hlmt_utilities_file() {
        return (SubLObject)removal_modules_hlmt_utilities.NIL;
    }
    
    public static SubLObject setup_removal_modules_hlmt_utilities_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_hlmt_utilities.$const0$mtMonad);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_hlmt_utilities.$kw1$POS, removal_modules_hlmt_utilities.$const0$mtMonad);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw2$REMOVAL_MT_MONAD_CHECK, (SubLObject)removal_modules_hlmt_utilities.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw4$REMOVAL_MT_MONAD_UNIFY, (SubLObject)removal_modules_hlmt_utilities.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw6$REMOVAL_MT_MONAD_UNIFY_ARG1, (SubLObject)removal_modules_hlmt_utilities.$list7);
        preference_modules.inference_preference_module((SubLObject)removal_modules_hlmt_utilities.$kw8$MT_MONAD_UNIFY_ARG1_POS, (SubLObject)removal_modules_hlmt_utilities.$list9);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_hlmt_utilities.$const15$mtTimeIndex);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_hlmt_utilities.$kw1$POS, removal_modules_hlmt_utilities.$const15$mtTimeIndex, (SubLObject)removal_modules_hlmt_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw16$REMOVAL_MT_TIME_INDEX_CHECK, (SubLObject)removal_modules_hlmt_utilities.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw18$REMOVAL_MT_TIME_INDEX_UNIFY, (SubLObject)removal_modules_hlmt_utilities.$list19);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_hlmt_utilities.$const20$mtTimeParameter);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_hlmt_utilities.$kw1$POS, removal_modules_hlmt_utilities.$const20$mtTimeParameter, (SubLObject)removal_modules_hlmt_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw21$REMOVAL_MT_TIME_PARAMETER_CHECK, (SubLObject)removal_modules_hlmt_utilities.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw23$REMOVAL_MT_TIME_PARAMETER_UNIFY, (SubLObject)removal_modules_hlmt_utilities.$list24);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_hlmt_utilities.$const25$temporalMicrotheoriesIntersect);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_hlmt_utilities.$kw1$POS, removal_modules_hlmt_utilities.$const25$temporalMicrotheoriesIntersect);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw27$REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS, (SubLObject)removal_modules_hlmt_utilities.$list28);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_hlmt_utilities.$const29$precedes_Metric);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw30$REMOVAL_PRECEDES_METRIC_CHECK, (SubLObject)removal_modules_hlmt_utilities.$list31);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw32$REMOVAL_PRECEDES_METRIC_UNIFY_1, (SubLObject)removal_modules_hlmt_utilities.$list33);
        inference_modules.inference_removal_module((SubLObject)removal_modules_hlmt_utilities.$kw34$REMOVAL_PRECEDES_METRIC_UNIFY_2, (SubLObject)removal_modules_hlmt_utilities.$list35);
        return (SubLObject)removal_modules_hlmt_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_hlmt_utilities_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_hlmt_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_hlmt_utilities_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_hlmt_utilities();
        $const0$mtMonad = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_MT_MONAD_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-MT-MONAD-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD-MT-EQUAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-MONAD-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtMonad <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) #$HumanActivitiesMt)") });
        $kw4$REMOVAL_MT_MONAD_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MT-MONAD-UNIFY");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-MONAD-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtMonad <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtMonad (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?MONAD)\n    -->\n    (((?MONAD . #$HumanActivitiesMt)))") });
        $kw6$REMOVAL_MT_MONAD_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-MT-MONAD-UNIFY-ARG1");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MT-MONAD-UNIFY-ARG1-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("HLMTS-WITH-MONAD"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONAD"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtMonad <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtMonad ?HLMT #$HumanActivitiesMt)") });
        $kw8$MT_MONAD_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("MT-MONAD-UNIFY-ARG1-POS");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $const10$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $int12$32 = SubLObjectFactory.makeInteger(32);
        $sym13$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $const14$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $const15$mtTimeIndex = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex"));
        $kw16$REMOVAL_MT_TIME_INDEX_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-MT-TIME-INDEX-CHECK");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TIME")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("TIME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-OBJECT-EQUAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TIME")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtTimeIndex <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) (#$YearFn 2000))") });
        $kw18$REMOVAL_MT_TIME_INDEX_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MT-TIME-INDEX-UNIFY");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtTimeIndex <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtTimeIndex (#$MtSpace #$HumanActivitiesMt (#$MtTimeDimFn (#$YearFn 2000))) ?TIME)\n    -->\n    (((?TIME #$YearFn 2000)))") });
        $const20$mtTimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter"));
        $kw21$REMOVAL_MT_TIME_PARAMETER_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-MT-TIME-PARAMETER-CHECK");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-PARAMETER-EQUAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtTimeParameter <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) #$CalendarSecond)") });
        $kw23$REMOVAL_MT_TIME_PARAMETER_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MT-TIME-PARAMETER-UNIFY");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-HLMT-TIME-PARAMETER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$mtTimeParameter <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$mtTimeParameter (#$MtSpace #$HumanActivitiesMt (#$MtTimeWithGranularityDimFn (#$YearFn 2000) #$CalendarSecond)) ?PARAM)\n    -->\n    (((?PARAM . #$CalendarSecond)))") });
        $const25$temporalMicrotheoriesIntersect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect"));
        $sym26$CONTAINS_INDEXICAL_ = SubLObjectFactory.makeSymbol("CONTAINS-INDEXICAL?");
        $kw27$REMOVAL_TEMPORAL_MICROTHEORIES_INTERSECT_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORAL-MICROTHEORIES-INTERSECT-CHECK-POS");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalMicrotheoriesIntersect")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TEMPORAL-MT-INTERSECTION-SET?"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporalMicrotheoriesIntersect . <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporalMicrotheoriesIntersect (#$MtTimeWithGranularityDimFn (#$YearFn 2004) #$CalendarMonth) (#$MtTimeDimFn (#$MonthFn #$September (#$YearFn 2004))))") });
        $const29$precedes_Metric = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric"));
        $kw30$REMOVAL_PRECEDES_METRIC_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-PRECEDES-METRIC-CHECK");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("AMT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL1"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL2"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-PRECEDES-METRIC-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$precedes-Metric <fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$precedes-Metric (#$YearFn 2001) (#$YearFn 2004) #$CalendarYear 3)") });
        $kw32$REMOVAL_PRECEDES_METRIC_UNIFY_1 = SubLObjectFactory.makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-1");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("AMT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TIME-OF-TYPE-BEFORE-INTERVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$precedes-Metric <not-fully-bound> <fully-bound> <fully-bound> <positive-integer-p>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$precedes-Metric ?WHAT (#$YearFn 2004) #$CalendarYear 3)") });
        $kw34$REMOVAL_PRECEDES_METRIC_UNIFY_2 = SubLObjectFactory.makeKeyword("REMOVAL-PRECEDES-METRIC-UNIFY-2");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("AMT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TIME-OF-TYPE-AFTER-INTERVAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("precedes-Metric")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("AMT"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$precedes-Metric <fully-bound> <not-fully-bound> <fully-bound> <positive-integer-p>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$precedes-Metric (#$YearFn 2001) ?WHAT #$CalendarYear 3)") });
    }
}

/*

	Total time: 212 ms
	
*/