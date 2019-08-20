package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_events extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_events();





    private static final SubLObject $$currentCompletionValue = reader_make_constant_shell(makeString("currentCompletionValue"));

    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");



    public static final SubLSymbol $event_defining_mt$ = makeSymbol("*EVENT-DEFINING-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol $REMOVAL_CURRENT_COMPLETION_VALUE_POS = makeKeyword("REMOVAL-CURRENT-COMPLETION-VALUE-POS");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("currentCompletionValue")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("currentCompletionValue")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("currentCompletionValue")), list($BIND, makeSymbol("EVENT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("EVENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("EVENT-COMPLETION-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("currentCompletionValue")), list(makeKeyword("VALUE"), makeSymbol("EVENT")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(currentCompletionValue <FULLY BOUND> <ANYTHING>)"), makeKeyword("EXAMPLE"), makeString("(currentCompletionValue Solving-RobotFuel-PlannedBy-VersionOfElleForHarper-On-2011 ?VAR)") });

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLObject $$properSubEvents = reader_make_constant_shell(makeString("properSubEvents"));

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLList $list13 = list(makeSymbol("?EVT"));

    public static SubLObject event_completion_value(final SubLObject event) {
        final SubLObject sub_events = get_proper_sub_events_inf(event);
        SubLObject val = get_completion_value(event);
        if (val.equalp($float$1_0)) {
            return val;
        }
        if (list_length(sub_events).eql(ZERO_INTEGER)) {
            return ZERO_INTEGER;
        }
        SubLObject cdolist_list_var = sub_events;
        SubLObject sub_event = NIL;
        sub_event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            val = add(val, event_completion_value(sub_event));
            cdolist_list_var = cdolist_list_var.rest();
            sub_event = cdolist_list_var.first();
        } 
        return divide(val, list_length(sub_events));
    }

    public static SubLObject get_proper_sub_events(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, ONE_INTEGER, $$properSubEvents, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        SubLObject sub_events = NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sub_events = cons(assertions_high.gaf_arg2(gaf), sub_events);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return sub_events;
    }

    public static SubLObject get_completion_value(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, ONE_INTEGER, $$currentCompletionValue, UNPROVIDED, UNPROVIDED);
            SubLObject vals = NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                vals = cons(assertions_high.gaf_arg2(gaf), vals);
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            } 
            if (!list_length(vals).numL(TWO_INTEGER)) {
            }
            if (NIL != vals) {
                return vals.first();
            }
            return $float$0_0;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject get_proper_sub_events_inf(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject results = inference_kernel.new_cyc_query(list($$assertedSentence, listS($$properSubEvents, event, $list13)), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        SubLObject sub_events = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sub_events = cons(result.first().rest(), sub_events);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return sub_events;
    }

    public static SubLObject declare_removal_modules_events_file() {
        declareFunction("event_completion_value", "EVENT-COMPLETION-VALUE", 1, 0, false);
        declareFunction("get_proper_sub_events", "GET-PROPER-SUB-EVENTS", 1, 0, false);
        declareFunction("get_completion_value", "GET-COMPLETION-VALUE", 1, 0, false);
        declareFunction("get_proper_sub_events_inf", "GET-PROPER-SUB-EVENTS-INF", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_events_file() {
        deflexical("*EVENT-DEFINING-MT*", SubLTrampolineFile.maybeDefault($event_defining_mt$, $event_defining_mt$, $$UniversalVocabularyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_events_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$currentCompletionValue);
        inference_modules.inference_removal_module_use_generic($$currentCompletionValue, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$currentCompletionValue, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$currentCompletionValue, ONE_INTEGER);
        declare_defglobal($event_defining_mt$);
        mt_vars.note_mt_var($event_defining_mt$, $$currentCompletionValue);
        inference_modules.inference_removal_module($REMOVAL_CURRENT_COMPLETION_VALUE_POS, $list7);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_events_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_events_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_events_file();
    }

    static {
















    }
}

/**
 * Total time: 84 ms
 */
