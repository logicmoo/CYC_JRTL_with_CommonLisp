package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_events extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_events";
    public static final String myFingerPrint = "b804476d8b7903d95d79750c4ca83bfede084408eaf7ae2d803eee18941fc6cb";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 1279L)
    public static SubLSymbol $event_defining_mt$;
    private static final SubLObject $const0$currentCompletionValue;
    private static final SubLSymbol $kw1$REMOVAL_LOOKUP_POS;
    private static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static final SubLSymbol $kw3$POS;
    private static final SubLSymbol $sym4$_EVENT_DEFINING_MT_;
    private static final SubLObject $const5$UniversalVocabularyMt;
    private static final SubLSymbol $kw6$REMOVAL_CURRENT_COMPLETION_VALUE_POS;
    private static final SubLList $list7;
    private static final SubLFloat $float8$1_0;
    private static final SubLObject $const9$properSubEvents;
    private static final SubLSymbol $sym10$_EXIT;
    private static final SubLFloat $float11$0_0;
    private static final SubLObject $const12$assertedSentence;
    private static final SubLList $list13;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2148L)
    public static SubLObject event_completion_value(final SubLObject event) {
        final SubLObject sub_events = get_proper_sub_events_inf(event);
        SubLObject val = get_completion_value(event);
        if (val.equalp((SubLObject)removal_modules_events.$float8$1_0)) {
            return val;
        }
        if (conses_high.list_length(sub_events).eql((SubLObject)removal_modules_events.ZERO_INTEGER)) {
            return (SubLObject)removal_modules_events.ZERO_INTEGER;
        }
        SubLObject cdolist_list_var = sub_events;
        SubLObject sub_event = (SubLObject)removal_modules_events.NIL;
        sub_event = cdolist_list_var.first();
        while (removal_modules_events.NIL != cdolist_list_var) {
            val = Numbers.add(val, event_completion_value(sub_event));
            cdolist_list_var = cdolist_list_var.rest();
            sub_event = cdolist_list_var.first();
        }
        return Numbers.divide(val, conses_high.list_length(sub_events));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2559L)
    public static SubLObject get_proper_sub_events(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, (SubLObject)removal_modules_events.ONE_INTEGER, removal_modules_events.$const9$properSubEvents, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_events.UNPROVIDED);
        SubLObject sub_events = (SubLObject)removal_modules_events.NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = (SubLObject)removal_modules_events.NIL;
        gaf = cdolist_list_var.first();
        while (removal_modules_events.NIL != cdolist_list_var) {
            sub_events = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), sub_events);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return sub_events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2786L)
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
            final SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, (SubLObject)removal_modules_events.ONE_INTEGER, removal_modules_events.$const0$currentCompletionValue, (SubLObject)removal_modules_events.UNPROVIDED, (SubLObject)removal_modules_events.UNPROVIDED);
            SubLObject vals = (SubLObject)removal_modules_events.NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = (SubLObject)removal_modules_events.NIL;
            gaf = cdolist_list_var.first();
            while (removal_modules_events.NIL != cdolist_list_var) {
                vals = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg2(gaf), vals);
                cdolist_list_var = cdolist_list_var.rest();
                gaf = cdolist_list_var.first();
            }
            if (!conses_high.list_length(vals).numL((SubLObject)removal_modules_events.TWO_INTEGER)) {}
            if (removal_modules_events.NIL != vals) {
                return vals.first();
            }
            return (SubLObject)removal_modules_events.$float11$0_0;
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 3165L)
    public static SubLObject get_proper_sub_events_inf(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject results = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(removal_modules_events.$const12$assertedSentence, (SubLObject)ConsesLow.listS(removal_modules_events.$const9$properSubEvents, event, (SubLObject)removal_modules_events.$list13)), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_events.UNPROVIDED);
        SubLObject sub_events = (SubLObject)removal_modules_events.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)removal_modules_events.NIL;
        result = cdolist_list_var.first();
        while (removal_modules_events.NIL != cdolist_list_var) {
            sub_events = (SubLObject)ConsesLow.cons(result.first().rest(), sub_events);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return sub_events;
    }
    
    public static SubLObject declare_removal_modules_events_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_events", "event_completion_value", "EVENT-COMPLETION-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_events", "get_proper_sub_events", "GET-PROPER-SUB-EVENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_events", "get_completion_value", "GET-COMPLETION-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_events", "get_proper_sub_events_inf", "GET-PROPER-SUB-EVENTS-INF", 1, 0, false);
        return (SubLObject)removal_modules_events.NIL;
    }
    
    public static SubLObject init_removal_modules_events_file() {
        removal_modules_events.$event_defining_mt$ = SubLFiles.deflexical("*EVENT-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_events.$sym4$_EVENT_DEFINING_MT_, removal_modules_events.$event_defining_mt$, removal_modules_events.$const5$UniversalVocabularyMt));
        return (SubLObject)removal_modules_events.NIL;
    }
    
    public static SubLObject setup_removal_modules_events_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_events.$const0$currentCompletionValue);
        inference_modules.inference_removal_module_use_generic(removal_modules_events.$const0$currentCompletionValue, (SubLObject)removal_modules_events.$kw1$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_events.$const0$currentCompletionValue, (SubLObject)removal_modules_events.$kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_events.$kw3$POS, removal_modules_events.$const0$currentCompletionValue, (SubLObject)removal_modules_events.ONE_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_events.$sym4$_EVENT_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_events.$sym4$_EVENT_DEFINING_MT_, removal_modules_events.$const0$currentCompletionValue);
        inference_modules.inference_removal_module((SubLObject)removal_modules_events.$kw6$REMOVAL_CURRENT_COMPLETION_VALUE_POS, (SubLObject)removal_modules_events.$list7);
        return (SubLObject)removal_modules_events.NIL;
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
        me = (SubLFile)new removal_modules_events();
        removal_modules_events.$event_defining_mt$ = null;
        $const0$currentCompletionValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("currentCompletionValue"));
        $kw1$REMOVAL_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $kw3$POS = SubLObjectFactory.makeKeyword("POS");
        $sym4$_EVENT_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*EVENT-DEFINING-MT*");
        $const5$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw6$REMOVAL_CURRENT_COMPLETION_VALUE_POS = SubLObjectFactory.makeKeyword("REMOVAL-CURRENT-COMPLETION-VALUE-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("currentCompletionValue")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("currentCompletionValue")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_events.ONE_INTEGER, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("currentCompletionValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-COMPLETION-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("currentCompletionValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(currentCompletionValue <FULLY BOUND> <ANYTHING>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(currentCompletionValue Solving-RobotFuel-PlannedBy-VersionOfElleForHarper-On-2011 ?VAR)") });
        $float8$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $const9$properSubEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents"));
        $sym10$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $float11$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $const12$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?EVT"));
    }
}

/*

	Total time: 84 ms
	
*/