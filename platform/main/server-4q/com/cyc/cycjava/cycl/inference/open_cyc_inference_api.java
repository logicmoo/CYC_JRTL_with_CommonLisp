package com.cyc.cycjava.cycl.inference;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class open_cyc_inference_api extends SubLTranslatedFile {
	public static final SubLFile me = new open_cyc_inference_api();

	public static final String myName = "com.cyc.cycjava.cycl.inference.open_cyc_inference_api";

	public static final String myFingerPrint = "8d6ac2e42be978087cf0c106d5444430392dcf2e66314bb8e8bca05c44b50c0d";

	// defparameter
	// Definitions
	// whether these api functions are called externally (i.e. outside SubL)
	private static final SubLSymbol $use_api_task_processor_incremental_resultsP$ = makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*");

	// defparameter
	// the minimum time to wait before sending clients new inference answers.
	private static final SubLSymbol $open_cyc_minimum_time_before_sending_new_answers$ = makeSymbol("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*");

	// defvar
	/**
	 * The default properties for NL generation that will be used by the functions
	 * in this file unless otherwise specified by the caller.
	 */
	public static final SubLSymbol $default_open_cyc_nl_generation_properties$ = makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*");

	public static final SubLList $list6 = list(makeKeyword("MODE"), makeKeyword("HTML"));

	public static final SubLSymbol $inference_to_ipc_queue_map$ = makeSymbol("*INFERENCE-TO-IPC-QUEUE-MAP*");

	public static final SubLSymbol $opencyc_inference_output$ = makeSymbol("*OPENCYC-INFERENCE-OUTPUT*");

	public static final SubLSymbol $synch_format_lock$ = makeSymbol("*SYNCH-FORMAT-LOCK*");

	public static final SubLString $str10$_synch_format_lock_ = makeString("*synch-format-lock*");

	public static final SubLList $list11 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

	public static final SubLList $list13 = list(makeSymbol("*SYNCH-FORMAT-LOCK*"));

	public static final SubLList $list15 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*OPENCYC-INFERENCE-OUTPUT*")));

	private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

	private static final SubLSymbol $client_to_problem_stores_map$ = makeSymbol("*CLIENT-TO-PROBLEM-STORES-MAP*");

	private static final SubLSymbol OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT = makeSymbol("OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT");

	private static final SubLSymbol OPEN_CYC_START_CONTINUABLE_QUERY = makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY");

	private static final SubLList $list29 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")),
			list(makeSymbol("OPTIMIZE-QUERY-SENTENCE-VARIABLES?"), T));

	private static final SubLString $str30$Starts_a_continuable_inference_as = makeString(
			"Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");

	private static final SubLList $list31 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("MT"), makeSymbol("POSSIBLY-MT-P")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));

	private static final SubLList $list33 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"));

	private static final SubLSymbol $kw34$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

	private static final SubLString $$$Inference_Communication_Queue = makeString("Inference Communication Queue");

	private static final SubLString $str37$Problem_store_ID___A___Inference_ = makeString("Problem store ID: ~A ~%Inference ID: ~A~%");

	private static final SubLSymbol OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT = makeSymbol("OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT");

	private static final SubLList $list40 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CLIENT"), list(makeSymbol("GET-CURRENT-TASK-PROCESSOR-CLIENT"))));

	private static final SubLString $str41$Releases_all_inference_resources_ = makeString("Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).");

	private static final SubLList $list42 = list(list(makeSymbol("CLIENT"), makeSymbol("STRINGP")));

	private static final SubLSymbol OPEN_CYC_GET_BINDING_FOR_VARIABLE = makeSymbol("OPEN-CYC-GET-BINDING-FOR-VARIABLE");

	private static final SubLSymbol OPEN_CYC_GET_ANSWER_BINDINGS = makeSymbol("OPEN-CYC-GET-ANSWER-BINDINGS");

	private static final SubLSymbol GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P = makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P");

	private static final SubLSymbol OPEN_CYC_CONTINUE_QUERY = makeSymbol("OPEN-CYC-CONTINUE-QUERY");

	private static final SubLList $list48 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"), makeSymbol("PROPERTIES"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")));

	private static final SubLString $str49$Continues_an_existing_continuable = makeString(
			"Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");

	private static final SubLList $list50 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P")));

	private static final SubLString $str51$Inference__A_is_already_running__ = makeString("Inference ~A is already running!~%");

	private static final SubLString $str52$Cannot_ask_query__Invalid_inferen = makeString("Cannot ask query. Invalid inference-status: ~A~%");

	private static final SubLObject $$CycAPIMt = reader_make_constant_shell(makeString("CycAPIMt"));

	private static final SubLList $list54 = list(makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), makeKeyword("INTEGER-INFERENCE-PARAMETERS"), makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), makeKeyword("OTHER-INFERENCE-PARAMETERS"));

	private static final SubLSymbol GET_INFERENCE_PARAMETER_INFORMATION = makeSymbol("GET-INFERENCE-PARAMETER-INFORMATION");

	private static final SubLString $str56$Returns_a_property_list_of_infere = makeString(
			"Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");

	private static final SubLList $list57 = list(makeSymbol("PROPERTY-LIST-P"));

	private static final SubLString $$$Query_thread_ = makeString("Query thread ");

	private static final SubLSymbol CONTINUE_INFERENCE = makeSymbol("CONTINUE-INFERENCE");

	private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

	private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

	private static final SubLList $list64 = list(makeKeyword("NAME"), makeKeyword("BASIC?"), makeKeyword("QUERY-STATIC?"), makeKeyword("SHORT-DESC"), makeKeyword("LONG-DESC"), makeKeyword("DEFAULT-VALUE"), makeKeyword("ALTERNATE-VALUE"));

	private static final SubLObject $$BooleanInferenceParameter = reader_make_constant_shell(makeString("BooleanInferenceParameter"));

	private static final SubLObject $$IntegerInferenceParameter = reader_make_constant_shell(makeString("IntegerInferenceParameter"));

	private static final SubLObject $$RealNumberInferenceParameter = reader_make_constant_shell(makeString("RealNumberInferenceParameter"));

	private static final SubLObject $$EnumerationInferenceParameter = reader_make_constant_shell(makeString("EnumerationInferenceParameter"));

	private static final SubLObject $$InferenceParameter = reader_make_constant_shell(makeString("InferenceParameter"));

	private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

	private static final SubLObject $$InferenceSupportedTerm = reader_make_constant_shell(makeString("InferenceSupportedTerm"));

	private static final SubLObject $$AdvancedInferenceParameter = reader_make_constant_shell(makeString("AdvancedInferenceParameter"));

	private static final SubLObject $$subLIdentifier = reader_make_constant_shell(makeString("subLIdentifier"));

	private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

	private static final SubLObject $$CycInferenceEngine = reader_make_constant_shell(makeString("CycInferenceEngine"));

	private static final SubLObject $$NonNegativeInteger = reader_make_constant_shell(makeString("NonNegativeInteger"));

	private static final SubLObject $$IntegerFromToFn = reader_make_constant_shell(makeString("IntegerFromToFn"));

	private static final SubLSymbol $INTEGER_PLUS_INFINITY = makeKeyword("INTEGER-PLUS-INFINITY");

	private static final SubLObject $$Real0_1 = reader_make_constant_shell(makeString("Real0-1"));

	private static final SubLFloat $float$0_0 = makeDouble(0.0);

	private static final SubLFloat $float$1_0 = makeDouble(1.0);

	private static final SubLSymbol $kw92$QUERY_STATIC_ = makeKeyword("QUERY-STATIC?");

	private static final SubLSymbol $NO_VALUE_SPECIFIED = makeKeyword("NO-VALUE-SPECIFIED");

	public static SubLObject initialize_open_cyc_inference_api_vars() {
		return initialize_default_open_cyc_nl_generation_properties();
	}

	public static SubLObject initialize_default_open_cyc_nl_generation_properties() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$default_open_cyc_nl_generation_properties$.setDynamicValue(listS($NL_PREDS, new SubLObject[] { $DEFAULT, $FORCE, $NONE, $LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(thread), $DOMAIN_MT, pph_vars.$pph_domain_mt$.getDynamicValue(thread), $list6 }), thread);
		return $default_open_cyc_nl_generation_properties$.getDynamicValue(thread);
	}

	public static SubLObject synch_format(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject format_control = NIL;
		destructuring_bind_must_consp(current, datum, $list11);
		format_control = current.first();
		final SubLObject format_arguments;
		current = format_arguments = current.rest();
		return listS(WITH_LOCK_HELD, $list13, listS(FORMAT, $opencyc_inference_output$, format_control, append(format_arguments, NIL)), $list15);
	}

	public static SubLObject with_opencyc_inference_pph_memoization(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		if (NIL != find($CYC_PPH, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return bq_cons(WITH_PPH_MEMOIZATION, append(body, NIL));
		}
		return bq_cons(PROGN, append(body, NIL));
	}

	public static SubLObject get_problem_store_ids_for_client(final SubLObject client) {
		return dictionary_utilities.synchronized_dictionary_lookup($client_to_problem_stores_map$.getGlobalValue(), client, UNPROVIDED);
	}

	public static SubLObject register_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
		return dictionary_utilities.synchronized_dictionary_push($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id);
	}

	public static SubLObject deregister_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
		return dictionary_utilities.synchronized_dictionary_delete_from_value($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject deregister_all_problem_store_ids_for_client(final SubLObject client) {
		return dictionary_utilities.synchronized_dictionary_remove($client_to_problem_stores_map$.getGlobalValue(), client);
	}

	public static SubLObject open_cyc_handle_new_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject datum) {
		final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
		final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, NIL);
		if (datum.isInteger()) {
			process_utilities.ipc_enqueue($NEW_ANSWER, ipc_queue, UNPROVIDED);
		} else if (datum == $SUSPENDED) {
			process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, inference_suspend_reason(inference)), ipc_queue, UNPROVIDED);
		} else {
			process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, NIL), ipc_queue, UNPROVIDED);
			if (datum == $DEAD) {
				dictionary_utilities.synchronized_dictionary_remove($inference_to_ipc_queue_map$.getGlobalValue(), inference);
				inference_event_filters.deregister_handler_for_inference_event(problem_store_id, inference_id, OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
				open_cyc_release_inference_resources(problem_store_id, inference_id);
			}
		}

		return NIL;
	}

	public static SubLObject inference_suspend_reason(final SubLObject inference) {
		return NIL != inference_datastructures_inference.suspended_inference_p(inference) ? inference_datastructures_inference.inference_suspend_status(inference) : NIL;
	}

	public static SubLObject open_cyc_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
		if (v_properties == UNPROVIDED) {
			v_properties = NIL;
		}
		if (nl_generation_properties == UNPROVIDED) {
			nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
		}
		if (inference_answer_process_function == UNPROVIDED) {
			inference_answer_process_function = NIL;
		}
		if (incremental_resultsP == UNPROVIDED) {
			incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
		}
		if (optimize_query_sentence_variablesP == UNPROVIDED) {
			optimize_query_sentence_variablesP = T;
		}
		SubLSystemTrampolineFile.enforceType(sentence, EL_FORMULA_P);
		SubLSystemTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
		SubLSystemTrampolineFile.enforceType(v_properties, QUERY_PROPERTIES_P);
		return open_cyc_start_continuable_query_internal(sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP);
	}

	public static SubLObject open_cyc_start_continuable_query_internal(final SubLObject sentence, SubLObject mt, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP, final SubLObject optimize_query_sentence_variablesP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		mt = hlmt_czer.coerce_to_hlmt(mt);
		v_properties = putf(v_properties, $EVENTS, $list33);
		final SubLObject optimized_sentence = (NIL != optimize_query_sentence_variablesP) ? optimize_el_formula_variable_names(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence;
		final SubLObject conditionalP = (NIL != list_utilities.plist_has_keyP(v_properties, $kw34$CONDITIONAL_SENTENCE_)) ? list_utilities.plist_lookup(v_properties, $kw34$CONDITIONAL_SENTENCE_, UNPROVIDED) : inference_strategist.inference_conditional_sentence_p(cycl_utilities.hl_to_el(optimized_sentence));
		final SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), list($kw34$CONDITIONAL_SENTENCE_, conditionalP));
		final SubLObject ipc_queue = process_utilities.new_ipc_queue($$$Inference_Communication_Queue);
		thread.resetMultipleValues();
		final SubLObject inference = open_cyc_initialize_inference(optimized_sentence, mt, static_properties);
		final SubLObject problem_store_id = thread.secondMultipleValue();
		final SubLObject inference_id = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		dictionary_utilities.synchronized_dictionary_enter($inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue);
		inference_event_filters.register_handler_for_all_inference_events(inference, OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
		if (NIL != incremental_resultsP) {
			task_processor.post_task_info_processor_partial_results(list($INFERENCE_START, problem_store_id, inference_id));
		} else {
			format(T, $str37$Problem_store_ID___A___Inference_, problem_store_id, inference_id);
		}
		return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
	}

	public static SubLObject open_cyc_release_inference_resources_for_client(SubLObject client) {
		if (client == UNPROVIDED) {
			client = task_processor.get_current_task_processor_client();
		}
		SubLSystemTrampolineFile.enforceType(client, STRINGP);
		SubLObject cdolist_list_var;
		final SubLObject problem_store_ids = cdolist_list_var = get_problem_store_ids_for_client(client);
		SubLObject problem_store_id = NIL;
		problem_store_id = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id));
			cdolist_list_var = cdolist_list_var.rest();
			problem_store_id = cdolist_list_var.first();
		}
		deregister_all_problem_store_ids_for_client(client);
		return NIL;
	}

	public static SubLObject open_cyc_get_binding_for_variable(final SubLObject variable, final SubLObject inference_answer_signature) {
		final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
		final SubLObject v_bindings = (NIL != inference_answer) ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : NIL;
		return bindings.variable_lookup(variable, v_bindings);
	}

	public static SubLObject open_cyc_get_answer_bindings(final SubLObject inference_answer_signature) {
		final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
		return NIL != inference_answer ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : NIL;
	}

	public static SubLObject open_cyc_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
		if (nl_generation_properties == UNPROVIDED) {
			nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
		}
		if (inference_answer_process_function == UNPROVIDED) {
			inference_answer_process_function = NIL;
		}
		if (incremental_resultsP == UNPROVIDED) {
			incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
		}
		SubLSystemTrampolineFile.enforceType(problem_store_id, INTEGERP);
		SubLSystemTrampolineFile.enforceType(inference_id, INTEGERP);
		SubLSystemTrampolineFile.enforceType(v_properties, QUERY_PROPERTIES_P);
		SubLSystemTrampolineFile.enforceType(nl_generation_properties, GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P);
		return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
	}

	public static SubLObject open_cyc_continue_query_guts(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP) {
		v_properties = putf(v_properties, $EVENTS, $list33);
		final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
		if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
			Errors.error($str51$Inference__A_is_already_running__, inference);
		} else {
			if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
				return open_cyc_continue_query_internal(inference, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
			}
			Errors.error($str52$Cannot_ask_query__Invalid_inferen, inference_datastructures_inference.inference_status(inference));
		}
		return NIL;
	}

	public static SubLObject get_inference_parameter_information() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$CycAPIMt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			final SubLObject boolean_inference_parameters = get_boolean_inference_parameter_information();
			final SubLObject integer_inference_parameters = get_integer_inference_parameter_information();
			final SubLObject real_number_inference_parameters = get_real_number_inference_parameter_information();
			final SubLObject enumeration_inference_parameters = get_enumeration_inference_parameter_information();
			final SubLObject other_inference_parameters = get_other_inference_parameter_information();
			result = list_utilities.make_plist($list54, list(boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters, other_inference_parameters));
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject open_cyc_initialize_inference(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties) {
		final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
		final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
		final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
		final SubLObject client = task_processor.get_current_task_processor_client();
		if (NIL != client) {
			register_problem_store_id_for_client(client, problem_store_id);
		}
		return values(inference, problem_store_id, inference_id);
	}

	public static SubLObject open_cyc_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id) {
		final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
		final SubLObject client = task_processor.get_current_task_processor_client();
		if (NIL != client) {
			deregister_problem_store_id_for_client(client, problem_store_id);
		}
		inference_datastructures_problem_store.destroy_problem_store(problem_store);
		return NIL;
	}

	public static SubLObject open_cyc_continue_query_internal(final SubLObject inference, final SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject final_result = NIL;
		SubLObject error_message = NIL;
		try {
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
						try {
							pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
							try {
								pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
								final SubLObject reuseP = thread.secondMultipleValue();
								thread.resetMultipleValues();
								try {
									thread.resetMultipleValues();
									final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
									try {
										pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
										final SubLObject new_or_reused = thread.secondMultipleValue();
										thread.resetMultipleValues();
										final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
										try {
											pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
											final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
											final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
											try {
												memoization_state.$memoization_state$.bind(local_state, thread);
												final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
												try {
													final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
													SubLObject inference_process = NIL;
													final SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id(inference);
													inference_process = process_utilities.make_cyc_server_process_with_args(cconcatenate($$$Query_thread_, format_nil.format_nil_a_no_copy(inference)), CONTINUE_INFERENCE, list(inference, dynamic_properties));
													final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, UNPROVIDED);
													final SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, $open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue(thread), incremental_resultsP, start_index, inference_process);
													while (NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(ipcq_processor)) {
														inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration(ipcq_processor);
													}
													final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results(ipcq_processor);
												} finally {
													final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
													try {
														$is_thread_performing_cleanupP$.bind(T, thread);
														final SubLObject _values = getValuesAsVector();
														memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
														restoreValuesFromVector(_values);
													} finally {
														$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
													}
												}
											} finally {
												memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
											}
										} finally {
											pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
										}
										if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
											memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
										}
									} finally {
										pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values2 = getValuesAsVector();
										if (NIL == reuseP) {
											pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
										}
										restoreValuesFromVector(_values2);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
									}
								}
							} finally {
								pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
							}
						} finally {
							pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
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
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values3 = getValuesAsVector();
				SubLObject ignore_errors_tag = NIL;
				try {
					thread.throwStack.push($IGNORE_ERRORS_TARGET);
					final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
					try {
						Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
						try {
							inference_strategist.inference_interrupt(inference, FIVE_INTEGER);
						} catch (final Throwable catch_var2) {
							Errors.handleThrowable(catch_var2, NIL);
						}
					} finally {
						Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
					}
				} catch (final Throwable ccatch_env_var2) {
					ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
					thread.throwStack.pop();
				} finally {
					thread.throwStack.pop();
				}
				if (NIL != error_message) {
					Errors.error(error_message);
				}
				restoreValuesFromVector(_values3);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return final_result;
	}

	public static SubLObject get_information_for_inference_parameter(final SubLObject param) {
		final SubLObject name = inference_parameter_name(param);
		final SubLObject basic_propP = basic_inference_parameter_p(param);
		final SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p(name);
		final SubLObject short_desc = inference_parameter_short_description(param);
		final SubLObject long_desc = inference_parameter_long_description(param);
		final SubLObject default_value = inference_parameter_default_value(param);
		final SubLObject alternate_value = inference_parameter_alternate_value(param);
		final SubLObject alternate_value_property_list = (NIL != alternate_value) ? get_inference_parameter_value_info(alternate_value) : NIL;
		final SubLObject param_result = list_utilities.make_plist($list64, list(name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list));
		return param_result;
	}

	public static SubLObject get_inference_parameter_value_info(final SubLObject param_value) {
		final SubLObject subl_value = inference_parameter_value_subl_identifier(param_value);
		final SubLObject short_desc = inference_parameter_value_short_description(param_value);
		final SubLObject long_desc = inference_parameter_value_long_description(param_value);
		return list($VALUE, subl_value, $SHORT_DESC, short_desc, $LONG_DESC, long_desc);
	}

	public static SubLObject get_boolean_inference_parameter_information() {
		final SubLObject parameters = isa.all_fort_instances($$BooleanInferenceParameter, $$CycAPIMt, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = parameters;
		SubLObject param = NIL;
		param = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject param_result = get_information_for_inference_parameter(param);
			result = putf(result, param, param_result);
			cdolist_list_var = cdolist_list_var.rest();
			param = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject get_integer_inference_parameter_information() {
		final SubLObject parameters = isa.all_fort_instances($$IntegerInferenceParameter, $$CycAPIMt, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = parameters;
		SubLObject param = NIL;
		param = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject param_result = get_information_for_inference_parameter(param);
			final SubLObject min_value = integer_inference_parameter_min_value(param);
			final SubLObject max_value = integer_inference_parameter_max_value(param);
			param_result = putf(param_result, $MIN_VALUE, min_value);
			param_result = putf(param_result, $MAX_VALUE, max_value);
			result = putf(result, param, param_result);
			cdolist_list_var = cdolist_list_var.rest();
			param = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject get_real_number_inference_parameter_information() {
		final SubLObject parameters = isa.all_fort_instances($$RealNumberInferenceParameter, $$CycAPIMt, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = parameters;
		SubLObject param = NIL;
		param = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject param_result = get_information_for_inference_parameter(param);
			final SubLObject min_value = real_number_inference_parameter_min_value(param);
			final SubLObject max_value = real_number_inference_parameter_max_value(param);
			param_result = putf(param_result, $MIN_VALUE, min_value);
			param_result = putf(param_result, $MAX_VALUE, max_value);
			result = putf(result, param, param_result);
			cdolist_list_var = cdolist_list_var.rest();
			param = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject get_enumeration_inference_parameter_information() {
		final SubLObject parameters = isa.all_fort_instances($$EnumerationInferenceParameter, $$CycAPIMt, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = parameters;
		SubLObject param = NIL;
		param = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject param_result = get_information_for_inference_parameter(param);
			final SubLObject potential_values = enumeration_inference_parameter_potential_values(param);
			param_result = putf(param_result, $POTENTIAL_VALUES, potential_values);
			result = putf(result, param, param_result);
			cdolist_list_var = cdolist_list_var.rest();
			param = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject get_other_inference_parameter_information() {
		final SubLObject parameters = isa.all_fort_instances($$InferenceParameter, $$CycAPIMt, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = parameters;
		SubLObject param = NIL;
		param = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (((NIL == nart_handles.nart_p(param)) && (NIL == kb_mapping_utilities.pred_u_v_holds_in_any_mt($$quotedIsa, param, $$InferenceSupportedTerm, ONE_INTEGER, TWO_INTEGER, $FALSE))) && (NIL == hl_prototypes.hl_prototypical_instanceP(param))) {
				final SubLObject min_isa = isa.min_isa(param, UNPROVIDED, UNPROVIDED);
				if ((NIL != list_utilities.singletonP(min_isa)) && $$InferenceParameter.eql(list_utilities.only_one(min_isa))) {
					SubLObject param_result = get_information_for_inference_parameter(param);
					param_result = putf(param_result, $BASIC_, NIL);
					result = putf(result, param, param_result);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			param = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject advanced_inference_parameter_p(final SubLObject param) {
		return isa.isaP(param, $$AdvancedInferenceParameter, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject basic_inference_parameter_p(final SubLObject param) {
		return makeBoolean(NIL == advanced_inference_parameter_p(param));
	}

	public static SubLObject inference_parameter_name(final SubLObject parameter) {
		final SubLObject v_subl_identifier = kb_mapping_utilities.fpred_value_in_mt(parameter, $$subLIdentifier, $$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
		if (NIL != el_formula_with_operator_p(v_subl_identifier, $$SubLQuoteFn)) {
			return cycl_utilities.nat_arg1(v_subl_identifier, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject inference_parameter_short_description(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_short_description(parameter, $$CycAPIMt);
	}

	public static SubLObject inference_parameter_long_description(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_long_description(parameter, $$CycAPIMt);
	}

	public static SubLObject inference_parameter_value_subl_identifier(final SubLObject param_value) {
		return parameter_specification_utilities.software_parameter_value_subl_identifier(param_value);
	}

	public static SubLObject inference_parameter_default_value(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_default_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
	}

	public static SubLObject inference_parameter_alternate_value(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_alternate_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
	}

	public static SubLObject enumeration_inference_parameter_potential_values(final SubLObject parameter) {
		final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
		SubLObject result = NIL;
		if (NIL != el_extensional_set_p(domain)) {
			SubLObject cdolist_list_var = el_extensional_set_elements(domain);
			SubLObject elem = NIL;
			elem = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject value_property_list = get_inference_parameter_value_info(elem);
				result = cons(value_property_list, result);
				cdolist_list_var = cdolist_list_var.rest();
				elem = cdolist_list_var.first();
			}
			return nreverse(result);
		}
		return NIL;
	}

	public static SubLObject integer_inference_parameter_min_value(final SubLObject parameter) {
		final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
		if (domain.eql($$NonNegativeInteger)) {
			return ZERO_INTEGER;
		}
		if (NIL != narts_high.nart_with_functor_p($$IntegerFromToFn, domain)) {
			return cycl_utilities.nat_arg1(domain, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject integer_inference_parameter_max_value(final SubLObject parameter) {
		final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
		if (domain.eql($$NonNegativeInteger)) {
			return $INTEGER_PLUS_INFINITY;
		}
		if (NIL != narts_high.nart_with_functor_p($$IntegerFromToFn, domain)) {
			return cycl_utilities.nat_arg2(domain, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject real_number_inference_parameter_min_value(final SubLObject parameter) {
		final SubLObject pcase_var;
		final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
		if (pcase_var.eql($$Real0_1)) {
			return $float$0_0;
		}
		return NIL;
	}

	public static SubLObject real_number_inference_parameter_max_value(final SubLObject parameter) {
		final SubLObject pcase_var;
		final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
		if (pcase_var.eql($$Real0_1)) {
			return $float$1_0;
		}
		return NIL;
	}

	public static SubLObject inference_parameter_value_short_description(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_value_short_description(parameter, $$CycAPIMt);
	}

	public static SubLObject inference_parameter_value_long_description(final SubLObject parameter) {
		return parameter_specification_utilities.software_parameter_value_long_description(parameter, $$CycAPIMt);
	}

	public static SubLObject inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		if (NIL != isa.isaP(param_cycl, $$BooleanInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
			return boolean_inference_parameter_has_valid_information_p(param_cycl, param_info);
		}
		if (NIL != isa.isaP(param_cycl, $$IntegerInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
			return integer_inference_parameter_has_valid_information_p(param_cycl, param_info);
		}
		if (NIL != isa.isaP(param_cycl, $$RealNumberInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
			return real_number_inference_parameter_has_valid_information_p(param_cycl, param_info);
		}
		if (NIL != isa.isaP(param_cycl, $$EnumerationInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
			return enumeration_inference_parameter_has_valid_information_p(param_cycl, param_info);
		}
		return other_inference_parameter_has_valid_information_p(param_cycl, param_info);
	}

	public static SubLObject inference_parameter_has_valid_basic_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return makeBoolean((((((NIL != cycl_grammar.cycl_denotational_term_p(param_cycl)) && getf(param_info, $NAME, UNPROVIDED).isKeyword()) && (NIL != booleanp(getf(param_info, $BASIC_, UNPROVIDED)))) && (NIL != booleanp(getf(param_info, $kw92$QUERY_STATIC_, UNPROVIDED)))) && getf(param_info, $SHORT_DESC, UNPROVIDED).isString()) && getf(param_info, $LONG_DESC, UNPROVIDED).isString());
	}

	public static SubLObject enumeration_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return makeBoolean(
				(((NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != valid_enumeration_inference_parameter_values_p(getf(param_info, $POTENTIAL_VALUES, UNPROVIDED)))) && (NIL != pph_utilities.keyword_or_nil_p(getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)))) && (NIL != pph_utilities.keyword_or_nil_p(getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED))));
	}

	public static SubLObject other_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return inference_parameter_has_valid_basic_information_p(param_cycl, param_info);
	}

	public static SubLObject boolean_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return makeBoolean(((NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != booleanp(getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)))) && (NIL != booleanp(getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED))));
	}

	public static SubLObject integer_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return makeBoolean(((NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isInteger()) && (($INTEGER_PLUS_INFINITY == getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED)) || getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isInteger()));
	}

	public static SubLObject real_number_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
		return makeBoolean(((((NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isNumber())
				&& ((NIL == getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED)) || getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED).isNumber()));
	}

	public static SubLObject valid_enumeration_inference_parameter_values_p(final SubLObject potential_values) {
		if (NIL == potential_values) {
			return NIL;
		}
		SubLObject cdolist_list_var = potential_values;
		SubLObject potential_value = NIL;
		potential_value = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == valid_enumeration_inference_parameter_value_p(potential_value)) {
				return NIL;
			}
			cdolist_list_var = cdolist_list_var.rest();
			potential_value = cdolist_list_var.first();
		}
		return T;
	}

	public static SubLObject valid_enumeration_inference_parameter_value_p(final SubLObject potential_value) {
		return makeBoolean((((NIL != list_utilities.non_empty_list_p(potential_value)) && (getf(potential_value, $VALUE, $NO_VALUE_SPECIFIED) != $NO_VALUE_SPECIFIED)) && getf(potential_value, $SHORT_DESC, UNPROVIDED).isString()) && getf(potential_value, $LONG_DESC, UNPROVIDED).isString());
	}

	public static SubLObject declare_open_cyc_inference_api_file() {
		declareFunction(me, "initialize_open_cyc_inference_api_vars", "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS", 0, 0, false);
		declareFunction(me, "initialize_default_open_cyc_nl_generation_properties", "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES", 0, 0, false);
		declareMacro(me, "synch_format", "SYNCH-FORMAT");
		declareMacro(me, "with_opencyc_inference_pph_memoization", "WITH-OPENCYC-INFERENCE-PPH-MEMOIZATION");
		declareFunction(me, "get_problem_store_ids_for_client", "GET-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
		declareFunction(me, "register_problem_store_id_for_client", "REGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
		declareFunction(me, "deregister_problem_store_id_for_client", "DEREGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
		declareFunction(me, "deregister_all_problem_store_ids_for_client", "DEREGISTER-ALL-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
		declareFunction(me, "open_cyc_handle_new_inference_event", "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT", 3, 0, false);
		declareFunction(me, "inference_suspend_reason", "INFERENCE-SUSPEND-REASON", 1, 0, false);
		declareFunction(me, "open_cyc_start_continuable_query", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false);
		declareFunction(me, "open_cyc_start_continuable_query_internal", "OPEN-CYC-START-CONTINUABLE-QUERY-INTERNAL", 7, 0, false);
		declareFunction(me, "open_cyc_release_inference_resources_for_client", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false);
		declareFunction(me, "open_cyc_get_binding_for_variable", "OPEN-CYC-GET-BINDING-FOR-VARIABLE", 2, 0, false);
		declareFunction(me, "open_cyc_get_answer_bindings", "OPEN-CYC-GET-ANSWER-BINDINGS", 1, 0, false);
		declareFunction(me, "open_cyc_continue_query", "OPEN-CYC-CONTINUE-QUERY", 3, 3, false);
		declareFunction(me, "open_cyc_continue_query_guts", "OPEN-CYC-CONTINUE-QUERY-GUTS", 6, 0, false);
		declareFunction(me, "get_inference_parameter_information", "GET-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "open_cyc_initialize_inference", "OPEN-CYC-INITIALIZE-INFERENCE", 3, 0, false);
		declareFunction(me, "open_cyc_release_inference_resources", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES", 2, 0, false);
		declareFunction(me, "open_cyc_continue_query_internal", "OPEN-CYC-CONTINUE-QUERY-INTERNAL", 5, 0, false);
		declareFunction(me, "get_information_for_inference_parameter", "GET-INFORMATION-FOR-INFERENCE-PARAMETER", 1, 0, false);
		declareFunction(me, "get_inference_parameter_value_info", "GET-INFERENCE-PARAMETER-VALUE-INFO", 1, 0, false);
		declareFunction(me, "get_boolean_inference_parameter_information", "GET-BOOLEAN-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "get_integer_inference_parameter_information", "GET-INTEGER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "get_real_number_inference_parameter_information", "GET-REAL-NUMBER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "get_enumeration_inference_parameter_information", "GET-ENUMERATION-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "get_other_inference_parameter_information", "GET-OTHER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
		declareFunction(me, "advanced_inference_parameter_p", "ADVANCED-INFERENCE-PARAMETER-P", 1, 0, false);
		declareFunction(me, "basic_inference_parameter_p", "BASIC-INFERENCE-PARAMETER-P", 1, 0, false);
		declareFunction(me, "inference_parameter_name", "INFERENCE-PARAMETER-NAME", 1, 0, false);
		declareFunction(me, "inference_parameter_short_description", "INFERENCE-PARAMETER-SHORT-DESCRIPTION", 1, 0, false);
		declareFunction(me, "inference_parameter_long_description", "INFERENCE-PARAMETER-LONG-DESCRIPTION", 1, 0, false);
		declareFunction(me, "inference_parameter_value_subl_identifier", "INFERENCE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false);
		declareFunction(me, "inference_parameter_default_value", "INFERENCE-PARAMETER-DEFAULT-VALUE", 1, 0, false);
		declareFunction(me, "inference_parameter_alternate_value", "INFERENCE-PARAMETER-ALTERNATE-VALUE", 1, 0, false);
		declareFunction(me, "enumeration_inference_parameter_potential_values", "ENUMERATION-INFERENCE-PARAMETER-POTENTIAL-VALUES", 1, 0, false);
		declareFunction(me, "integer_inference_parameter_min_value", "INTEGER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
		declareFunction(me, "integer_inference_parameter_max_value", "INTEGER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
		declareFunction(me, "real_number_inference_parameter_min_value", "REAL-NUMBER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
		declareFunction(me, "real_number_inference_parameter_max_value", "REAL-NUMBER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
		declareFunction(me, "inference_parameter_value_short_description", "INFERENCE-PARAMETER-VALUE-SHORT-DESCRIPTION", 1, 0, false);
		declareFunction(me, "inference_parameter_value_long_description", "INFERENCE-PARAMETER-VALUE-LONG-DESCRIPTION", 1, 0, false);
		declareFunction(me, "inference_parameter_has_valid_information_p", "INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "inference_parameter_has_valid_basic_information_p", "INFERENCE-PARAMETER-HAS-VALID-BASIC-INFORMATION-P", 2, 0, false);
		declareFunction(me, "enumeration_inference_parameter_has_valid_information_p", "ENUMERATION-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "other_inference_parameter_has_valid_information_p", "OTHER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "boolean_inference_parameter_has_valid_information_p", "BOOLEAN-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "integer_inference_parameter_has_valid_information_p", "INTEGER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "real_number_inference_parameter_has_valid_information_p", "REAL-NUMBER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
		declareFunction(me, "valid_enumeration_inference_parameter_values_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUES-P", 1, 0, false);
		declareFunction(me, "valid_enumeration_inference_parameter_value_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUE-P", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_open_cyc_inference_api_file() {
		defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T);
		defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
		defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL);
		deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", SubLSystemTrampolineFile.maybeDefault($inference_to_ipc_queue_map$, $inference_to_ipc_queue_map$, () -> dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED)));
		deflexical("*OPENCYC-INFERENCE-OUTPUT*", SubLSystemTrampolineFile.maybeDefault($opencyc_inference_output$, $opencyc_inference_output$, () -> StreamsLow.$standard_output$.getDynamicValue()));
		deflexical("*SYNCH-FORMAT-LOCK*", SubLSystemTrampolineFile.maybeDefault($synch_format_lock$, $synch_format_lock$, () -> make_lock($str10$_synch_format_lock_)));
		deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", SubLSystemTrampolineFile.maybeDefault($client_to_problem_stores_map$, $client_to_problem_stores_map$, () -> dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
		return NIL;
	}

	public static SubLObject setup_open_cyc_inference_api_file() {
		declare_defglobal($inference_to_ipc_queue_map$);
		declare_defglobal($opencyc_inference_output$);
		declare_defglobal($synch_format_lock$);
		declare_defglobal($client_to_problem_stores_map$);
		register_cyc_api_function(OPEN_CYC_START_CONTINUABLE_QUERY, $list29, $str30$Starts_a_continuable_inference_as, $list31, NIL);
		register_cyc_api_function(OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, $list40, $str41$Releases_all_inference_resources_, $list42, NIL);
		register_external_symbol(OPEN_CYC_GET_BINDING_FOR_VARIABLE);
		register_external_symbol(OPEN_CYC_GET_ANSWER_BINDINGS);
		register_cyc_api_function(OPEN_CYC_CONTINUE_QUERY, $list48, $str49$Continues_an_existing_continuable, $list50, NIL);
		register_cyc_api_function(GET_INFERENCE_PARAMETER_INFORMATION, NIL, $str56$Returns_a_property_list_of_infere, NIL, $list57);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_open_cyc_inference_api_file();
	}

	@Override
	public void initializeVariables() {
		init_open_cyc_inference_api_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_open_cyc_inference_api_file();
	}

	
}

/**
 * Total time: 374 ms
 */
