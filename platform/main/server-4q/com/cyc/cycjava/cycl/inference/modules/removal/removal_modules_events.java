package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_events extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "b804476d8b7903d95d79750c4ca83bfede084408eaf7ae2d803eee18941fc6cb";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 1200L)
	public static SubLSymbol $event_defining_mt$;
	private static SubLObject $const0$currentCompletionValue;
	private static SubLSymbol $kw$REMOVAL_LOOKUP_POS;
	private static SubLSymbol $kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $sym4$_EVENT_DEFINING_MT_;
	private static SubLObject $const5$UniversalVocabularyMt;
	private static SubLSymbol $kw$REMOVAL_CURRENT_COMPLETION_VALUE_POS;
	private static SubLList $list7;
	private static SubLFloat $float8$1_0;
	private static SubLObject $const9$properSubEvents;
	private static SubLSymbol $sym10$_EXIT;
	private static SubLFloat $float11$0_0;
	private static SubLObject $const12$assertedSentence;
	private static SubLList $list13;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2100L)
	public static SubLObject event_completion_value(SubLObject event) {
		SubLObject sub_events = get_proper_sub_events_inf(event);
		SubLObject val = get_completion_value(event);
		if (val.equalp($float8$1_0))
			return val;
		if (conses_high.list_length(sub_events).eql(ZERO_INTEGER))
			return ZERO_INTEGER;
		SubLObject cdolist_list_var = sub_events;
		SubLObject sub_event = NIL;
		sub_event = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			val = Numbers.add(val, event_completion_value(sub_event));
			cdolist_list_var = cdolist_list_var.rest();
			sub_event = cdolist_list_var.first();
		}
		return Numbers.divide(val, conses_high.list_length(sub_events));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2500L)
	public static SubLObject get_proper_sub_events(SubLObject event) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, ONE_INTEGER, $const9$properSubEvents,
				mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
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

	@SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 2700L)
	public static SubLObject get_completion_value(SubLObject event) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject mt_var = mt_relevance_macros
				.with_inference_mt_relevance_validate(mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$
					.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var),
					thread);
			SubLObject gafs = kb_mapping.gather_gaf_arg_index(event, ONE_INTEGER, $const0$currentCompletionValue,
					UNPROVIDED, UNPROVIDED);
			SubLObject vals = NIL;
			SubLObject cdolist_list_var = gafs;
			SubLObject gaf = NIL;
			gaf = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				vals = cons(assertions_high.gaf_arg2(gaf), vals);
				cdolist_list_var = cdolist_list_var.rest();
				gaf = cdolist_list_var.first();
			}
			if (!conses_high.list_length(vals).numL(TWO_INTEGER)) {
			}
			if (NIL != vals)
				return vals.first();
			return $float11$0_0;
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-events.lisp", position = 3100L)
	public static SubLObject get_proper_sub_events_inf(SubLObject event) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject results = inference_kernel.new_cyc_query(
				list($const12$assertedSentence, listS($const9$properSubEvents, event, $list13)),
				mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
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
		$event_defining_mt$ = deflexical("*EVENT-DEFINING-MT*",
				maybeDefault($sym4$_EVENT_DEFINING_MT_, $event_defining_mt$, $const5$UniversalVocabularyMt));
		return NIL;
	}

	public static SubLObject setup_removal_modules_events_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$currentCompletionValue);
		inference_modules.inference_removal_module_use_generic($const0$currentCompletionValue, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const0$currentCompletionValue,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$currentCompletionValue, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym4$_EVENT_DEFINING_MT_);
		mt_vars.note_mt_var($sym4$_EVENT_DEFINING_MT_, $const0$currentCompletionValue);
		inference_modules.inference_removal_module($kw$REMOVAL_CURRENT_COMPLETION_VALUE_POS, $list7);
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
		me = new removal_modules_events();
		$event_defining_mt$ = null;
		$const0$currentCompletionValue = constant_handles
				.reader_make_constant_shell(makeString("currentCompletionValue"));
		$kw$REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
		$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
		$kw$POS = makeKeyword("POS");
		$sym4$_EVENT_DEFINING_MT_ = makeSymbol("*EVENT-DEFINING-MT*");
		$const5$UniversalVocabularyMt = constant_handles
				.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
		$kw$REMOVAL_CURRENT_COMPLETION_VALUE_POS = makeKeyword("REMOVAL-CURRENT-COMPLETION-VALUE-POS");
		$list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("currentCompletionValue")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("currentCompletionValue")),
						makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("currentCompletionValue")),
								list(makeKeyword("BIND"), makeSymbol("EVENT")), makeKeyword("ANYTHING")),
						list(makeKeyword("VALUE"), makeSymbol("EVENT"))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"),
						ConsesLow
								.list(makeKeyword("CALL"), makeSymbol("EVENT-COMPLETION-VALUE"), makeKeyword("INPUT"))),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("currentCompletionValue")),
						list(makeKeyword("VALUE"), makeSymbol("EVENT")), makeKeyword("INPUT")),
				makeKeyword("DOCUMENTATION"), makeString("(currentCompletionValue <FULLY BOUND> <ANYTHING>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(currentCompletionValue Solving-RobotFuel-PlannedBy-VersionOfElleForHarper-On-2011 ?VAR)") });
		$float8$1_0 = makeDouble(1.0);
		$const9$properSubEvents = constant_handles.reader_make_constant_shell(makeString("properSubEvents"));
		$sym10$_EXIT = makeSymbol("%EXIT");
		$float11$0_0 = makeDouble(0.0);
		$const12$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));
		$list13 = list(makeSymbol("?EVT"));
	}
}
/*
 *
 * Total time: 84 ms
 *
 */