package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
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
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class open_cyc_inference_api extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "8d6ac2e42be978087cf0c106d5444430392dcf2e66314bb8e8bca05c44b50c0d";
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 1800L)
    private static SubLSymbol $use_api_task_processor_incremental_resultsP$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2000L)
    private static SubLSymbol $open_cyc_minimum_time_before_sending_new_answers$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2200L)
    public static SubLSymbol $default_open_cyc_nl_generation_properties$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2900L)
    private static SubLSymbol $inference_to_ipc_queue_map$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3000L)
    private static SubLSymbol $opencyc_inference_output$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3000L)
    private static SubLSymbol $synch_format_lock$;
    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3600L)
    private static SubLSymbol $client_to_problem_stores_map$;
    private static SubLSymbol $NL_PREDS;
    private static SubLSymbol $DEFAULT;
    private static SubLSymbol $FORCE;
    private static SubLSymbol $NONE;
    private static SubLSymbol $LANGUAGE_MT;
    private static SubLSymbol $DOMAIN_MT;
    private static SubLList $list6;
    private static SubLSymbol $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_;
    private static SubLSymbol $sym8$_OPENCYC_INFERENCE_OUTPUT_;
    private static SubLSymbol $sym9$_SYNCH_FORMAT_LOCK_;
    private static SubLString $str10$_synch_format_lock_;
    private static SubLList $list11;
    private static SubLSymbol $sym12$WITH_LOCK_HELD;
    private static SubLList $list13;
    private static SubLSymbol $sym14$FORMAT;
    private static SubLList $list15;
    private static SubLSymbol $CYC_PPH;
    private static SubLSymbol $sym17$WITH_PPH_MEMOIZATION;
    private static SubLSymbol $sym18$PROGN;
    private static SubLSymbol $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_;
    private static SubLSymbol $NEW_ANSWER;
    private static SubLSymbol $SUSPENDED;
    private static SubLSymbol $STATUS_CHANGE;
    private static SubLSymbol $DEAD;
    private static SubLSymbol $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT;
    private static SubLSymbol $sym25$EL_FORMULA_P;
    private static SubLSymbol $sym26$POSSIBLY_MT_P;
    private static SubLSymbol $sym27$QUERY_PROPERTIES_P;
    private static SubLSymbol $sym28$OPEN_CYC_START_CONTINUABLE_QUERY;
    private static SubLList $list29;
    private static SubLString $str30$Starts_a_continuable_inference_as;
    private static SubLList $list31;
    private static SubLSymbol $EVENTS;
    private static SubLList $list33;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLString $str35$Inference_Communication_Queue;
    private static SubLSymbol $INFERENCE_START;
    private static SubLString $str37$Problem_store_ID___A___Inference_;
    private static SubLSymbol $sym38$STRINGP;
    private static SubLSymbol $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT;
    private static SubLList $list40;
    private static SubLString $str41$Releases_all_inference_resources_;
    private static SubLList $list42;
    private static SubLSymbol $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE;
    private static SubLSymbol $sym44$OPEN_CYC_GET_ANSWER_BINDINGS;
    private static SubLSymbol $sym45$INTEGERP;
    private static SubLSymbol $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P;
    private static SubLSymbol $sym47$OPEN_CYC_CONTINUE_QUERY;
    private static SubLList $list48;
    private static SubLString $str49$Continues_an_existing_continuable;
    private static SubLList $list50;
    private static SubLString $str51$Inference__A_is_already_running__;
    private static SubLString $str52$Cannot_ask_query__Invalid_inferen;
    private static SubLObject $$CycAPIMt;
    private static SubLList $list54;
    private static SubLSymbol $sym55$GET_INFERENCE_PARAMETER_INFORMATION;
    private static SubLString $str56$Returns_a_property_list_of_infere;
    private static SubLList $list57;
    private static SubLSymbol $sym58$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLString $str59$Query_thread_;
    private static SubLSymbol $sym60$CONTINUE_INFERENCE;
    private static SubLSymbol $NEW;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym63$IGNORE_ERRORS_HANDLER;
    private static SubLList $list64;
    private static SubLSymbol $VALUE;
    private static SubLSymbol $SHORT_DESC;
    private static SubLSymbol $LONG_DESC;
    private static SubLObject $$BooleanInferenceParameter;
    private static SubLObject $$IntegerInferenceParameter;
    private static SubLSymbol $MIN_VALUE;
    private static SubLSymbol $MAX_VALUE;
    private static SubLObject $$RealNumberInferenceParameter;
    private static SubLObject $$EnumerationInferenceParameter;
    private static SubLSymbol $POTENTIAL_VALUES;
    private static SubLObject $$InferenceParameter;
    private static SubLObject $$quotedIsa;
    private static SubLObject $$InferenceSupportedTerm;
    private static SubLSymbol $FALSE;
    private static SubLSymbol $BASIC_;
    private static SubLObject $$AdvancedInferenceParameter;
    private static SubLObject $$subLIdentifier;
    private static SubLSymbol $TRUE;
    private static SubLObject $$SubLQuoteFn;
    private static SubLObject $$CycInferenceEngine;
    private static SubLObject $$NonNegativeInteger;
    private static SubLObject $$IntegerFromToFn;
    private static SubLSymbol $INTEGER_PLUS_INFINITY;
    private static SubLObject $$Real0_1;
    private static SubLFloat $float$0_0;
    private static SubLFloat $float$1_0;
    private static SubLSymbol $NAME;
    private static SubLSymbol $QUERY_STATIC_;
    private static SubLSymbol $DEFAULT_VALUE;
    private static SubLSymbol $NO_VALUE_SPECIFIED;
    private static SubLSymbol $ALTERNATE_VALUE;

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2400L)
    public static SubLObject initialize_open_cyc_inference_api_vars() {
        return initialize_default_open_cyc_nl_generation_properties();
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2500L)
    public static SubLObject initialize_default_open_cyc_nl_generation_properties() {
        SubLThread thread = SubLProcess.currentSubLThread();
        $default_open_cyc_nl_generation_properties$.setDynamicValue(listS($NL_PREDS, new SubLObject[] { $DEFAULT, $FORCE, $NONE, $LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(thread), $DOMAIN_MT, pph_vars.$pph_domain_mt$.getDynamicValue(thread), $list6 }), thread);
        return $default_open_cyc_nl_generation_properties$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3100L)
    public static SubLObject synch_format(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject format_control = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list11);
        format_control = current.first();
        SubLObject format_arguments;
        current = (format_arguments = current.rest());
        return listS($sym12$WITH_LOCK_HELD, $list13, listS($sym14$FORMAT, $sym8$_OPENCYC_INFERENCE_OUTPUT_, format_control, append(format_arguments, NIL)), $list15);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3300L)
    public static SubLObject with_opencyc_inference_pph_memoization(SubLObject macroform, SubLObject environment) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        if (NIL != Sequences.find($CYC_PPH, reader.$features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return reader.bq_cons($sym17$WITH_PPH_MEMOIZATION, append(body, NIL));
        }
        return reader.bq_cons($sym18$PROGN, append(body, NIL));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3700L)
    public static SubLObject get_problem_store_ids_for_client(SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_lookup($client_to_problem_stores_map$.getGlobalValue(), client, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3900L)
    public static SubLObject register_problem_store_id_for_client(SubLObject client, SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_push($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4000L)
    public static SubLObject deregister_problem_store_id_for_client(SubLObject client, SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_delete_from_value($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4200L)
    public static SubLObject deregister_all_problem_store_ids_for_client(SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_remove($client_to_problem_stores_map$.getGlobalValue(), client);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4400L)
    public static SubLObject open_cyc_handle_new_inference_event(SubLObject problem_store_id, SubLObject inference_id, SubLObject datum) {
        SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, NIL);
        if (datum.isInteger()) {
            process_utilities.ipc_enqueue($NEW_ANSWER, ipc_queue, UNPROVIDED);
        } else if (datum == $SUSPENDED) {
            process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, inference_suspend_reason(inference)), ipc_queue, UNPROVIDED);
        } else {
            process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, NIL), ipc_queue, UNPROVIDED);
            if (datum == $DEAD) {
                dictionary_utilities.synchronized_dictionary_remove($inference_to_ipc_queue_map$.getGlobalValue(), inference);
                inference_event_filters.deregister_handler_for_inference_event(problem_store_id, inference_id, $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
                open_cyc_release_inference_resources(problem_store_id, inference_id);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5600L)
    public static SubLObject inference_suspend_reason(SubLObject inference) {
        return (NIL != inference_datastructures_inference.suspended_inference_p(inference)) ? inference_datastructures_inference.inference_suspend_status(inference) : NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5700L)
    public static SubLObject open_cyc_start_continuable_query(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
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
        enforceType(sentence, $sym25$EL_FORMULA_P);
        enforceType(mt, $sym26$POSSIBLY_MT_P);
        enforceType(v_properties, $sym27$QUERY_PROPERTIES_P);
        return open_cyc_start_continuable_query_internal(sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 7900L)
    public static SubLObject open_cyc_start_continuable_query_internal(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        v_properties = conses_high.putf(v_properties, $EVENTS, $list33);
        SubLObject optimized_sentence = (NIL != optimize_query_sentence_variablesP) ? el_utilities.optimize_el_formula_variable_names(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence;
        SubLObject conditionalP = (NIL != list_utilities.plist_has_keyP(v_properties, $CONDITIONAL_SENTENCE_)) ? list_utilities.plist_lookup(v_properties, $CONDITIONAL_SENTENCE_, UNPROVIDED) : inference_strategist.inference_conditional_sentence_p(cycl_utilities.hl_to_el(optimized_sentence));
        SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), list($CONDITIONAL_SENTENCE_, conditionalP));
        SubLObject ipc_queue = process_utilities.new_ipc_queue($str35$Inference_Communication_Queue);
        thread.resetMultipleValues();
        SubLObject inference = open_cyc_initialize_inference(optimized_sentence, mt, static_properties);
        SubLObject problem_store_id = thread.secondMultipleValue();
        SubLObject inference_id = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        dictionary_utilities.synchronized_dictionary_enter($inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue);
        inference_event_filters.register_handler_for_all_inference_events(inference, $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
        if (NIL != incremental_resultsP) {
            task_processor.post_task_info_processor_partial_results(list($INFERENCE_START, problem_store_id, inference_id));
        } else {
            PrintLow.format(T, $str37$Problem_store_ID___A___Inference_, problem_store_id, inference_id);
        }
        return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 9700L)
    public static SubLObject open_cyc_release_inference_resources_for_client(SubLObject client) {
        if (client == UNPROVIDED) {
            client = task_processor.get_current_task_processor_client();
        }
        enforceType(client, $sym38$STRINGP);
        SubLObject cdolist_list_var;
        SubLObject problem_store_ids = cdolist_list_var = get_problem_store_ids_for_client(client);
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

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10200L)
    public static SubLObject open_cyc_get_binding_for_variable(SubLObject variable, SubLObject inference_answer_signature) {
        SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
        SubLObject v_bindings = (NIL != inference_answer) ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : NIL;
        return bindings.variable_lookup(variable, v_bindings);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10600L)
    public static SubLObject open_cyc_get_answer_bindings(SubLObject inference_answer_signature) {
        SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
        return (NIL != inference_answer) ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 11000L)
    public static SubLObject open_cyc_continue_query(SubLObject problem_store_id, SubLObject inference_id, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        if (nl_generation_properties == UNPROVIDED) {
            nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == UNPROVIDED) {
            inference_answer_process_function = NIL;
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        enforceType(problem_store_id, $sym45$INTEGERP);
        enforceType(inference_id, $sym45$INTEGERP);
        enforceType(v_properties, $sym27$QUERY_PROPERTIES_P);
        enforceType(nl_generation_properties, $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P);
        return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 12900L)
    public static SubLObject open_cyc_continue_query_guts(SubLObject problem_store_id, SubLObject inference_id, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        v_properties = conses_high.putf(v_properties, $EVENTS, $list33);
        SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
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

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 13600L)
    public static SubLObject get_inference_parameter_information() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$CycAPIMt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject boolean_inference_parameters = get_boolean_inference_parameter_information();
            SubLObject integer_inference_parameters = get_integer_inference_parameter_information();
            SubLObject real_number_inference_parameters = get_real_number_inference_parameter_information();
            SubLObject enumeration_inference_parameters = get_enumeration_inference_parameter_information();
            SubLObject other_inference_parameters = get_other_inference_parameter_information();
            result = list_utilities.make_plist($list54, list(boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters, other_inference_parameters));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15200L)
    public static SubLObject open_cyc_initialize_inference(SubLObject sentence, SubLObject mt, SubLObject static_properties) {
        SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
        SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        SubLObject client = task_processor.get_current_task_processor_client();
        if (NIL != client) {
            register_problem_store_id_for_client(client, problem_store_id);
        }
        return Values.values(inference, problem_store_id, inference_id);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15900L)
    public static SubLObject open_cyc_release_inference_resources(SubLObject problem_store_id, SubLObject inference_id) {
        SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        SubLObject client = task_processor.get_current_task_processor_client();
        if (NIL != client) {
            deregister_problem_store_id_for_client(client, problem_store_id);
        }
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 16800L)
    public static SubLObject open_cyc_continue_query_internal(SubLObject inference, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject final_result = NIL;
        SubLObject error_message = NIL;
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind($sym58$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                        try {
                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                            SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                try {
                                                    SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
                                                    SubLObject inference_process = NIL;
                                                    SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id(inference);
                                                    inference_process = process_utilities.make_cyc_server_process_with_args(Sequences.cconcatenate($str59$Query_thread_, format_nil.format_nil_a_no_copy(inference)), $sym60$CONTINUE_INFERENCE, list(inference, dynamic_properties));
                                                    SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, UNPROVIDED);
                                                    SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor(inference, ipc_queue, inference_answer_process_function, nl_generation_properties,
                                                            $open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue(thread), incremental_resultsP, start_index, inference_process);
                                                    while (NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(ipcq_processor)) {
                                                        inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration(ipcq_processor);
                                                    }
                                                    final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results(ipcq_processor);
                                                } finally {
                                                    SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                        SubLObject _values = Values.getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                        Values.restoreValuesFromVector(_values);
                                                    } finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        } finally {
                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                                        }
                                        if (new_or_reused == $NEW && NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                            }
                        } finally {
                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
                        }
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values3 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function($sym63$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            inference_strategist.inference_interrupt(inference, FIVE_INTEGER);
                        } catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                    }
                } catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    Errors.error(error_message);
                }
                Values.restoreValuesFromVector(_values3);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return final_result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 19900L)
    public static SubLObject get_information_for_inference_parameter(SubLObject param) {
        SubLObject name = inference_parameter_name(param);
        SubLObject basic_propP = basic_inference_parameter_p(param);
        SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p(name);
        SubLObject short_desc = inference_parameter_short_description(param);
        SubLObject long_desc = inference_parameter_long_description(param);
        SubLObject default_value = inference_parameter_default_value(param);
        SubLObject alternate_value = inference_parameter_alternate_value(param);
        SubLObject alternate_value_property_list = (NIL != alternate_value) ? get_inference_parameter_value_info(alternate_value) : NIL;
        SubLObject param_result = list_utilities.make_plist($list64, list(name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list));
        return param_result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 20900L)
    public static SubLObject get_inference_parameter_value_info(SubLObject param_value) {
        SubLObject subl_value = inference_parameter_value_subl_identifier(param_value);
        SubLObject short_desc = inference_parameter_value_short_description(param_value);
        SubLObject long_desc = inference_parameter_value_long_description(param_value);
        return list($VALUE, subl_value, $SHORT_DESC, short_desc, $LONG_DESC, long_desc);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21300L)
    public static SubLObject get_boolean_inference_parameter_information() {
        SubLObject parameters = isa.all_fort_instances($$BooleanInferenceParameter, $$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21600L)
    public static SubLObject get_integer_inference_parameter_information() {
        SubLObject parameters = isa.all_fort_instances($$IntegerInferenceParameter, $$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            SubLObject min_value = integer_inference_parameter_min_value(param);
            SubLObject max_value = integer_inference_parameter_max_value(param);
            param_result = conses_high.putf(param_result, $MIN_VALUE, min_value);
            param_result = conses_high.putf(param_result, $MAX_VALUE, max_value);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22200L)
    public static SubLObject get_real_number_inference_parameter_information() {
        SubLObject parameters = isa.all_fort_instances($$RealNumberInferenceParameter, $$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            SubLObject min_value = real_number_inference_parameter_min_value(param);
            SubLObject max_value = real_number_inference_parameter_max_value(param);
            param_result = conses_high.putf(param_result, $MIN_VALUE, min_value);
            param_result = conses_high.putf(param_result, $MAX_VALUE, max_value);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22800L)
    public static SubLObject get_enumeration_inference_parameter_information() {
        SubLObject parameters = isa.all_fort_instances($$EnumerationInferenceParameter, $$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            SubLObject potential_values = enumeration_inference_parameter_potential_values(param);
            param_result = conses_high.putf(param_result, $POTENTIAL_VALUES, potential_values);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 23400L)
    public static SubLObject get_other_inference_parameter_information() {
        SubLObject parameters = isa.all_fort_instances($$InferenceParameter, $$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == nart_handles.nart_p(param) && NIL == kb_mapping_utilities.pred_u_v_holds_in_any_mt($$quotedIsa, param, $$InferenceSupportedTerm, ONE_INTEGER, TWO_INTEGER, $FALSE) && NIL == hl_prototypes.hl_prototypical_instanceP(param)) {
                SubLObject min_isa = isa.min_isa(param, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(min_isa) && $$InferenceParameter.eql(list_utilities.only_one(min_isa))) {
                    SubLObject param_result = get_information_for_inference_parameter(param);
                    param_result = conses_high.putf(param_result, $BASIC_, NIL);
                    result = conses_high.putf(result, param, param_result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24100L)
    public static SubLObject advanced_inference_parameter_p(SubLObject param) {
        return isa.isaP(param, $$AdvancedInferenceParameter, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24600L)
    public static SubLObject basic_inference_parameter_p(SubLObject param) {
        return makeBoolean(NIL == advanced_inference_parameter_p(param));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24700L)
    public static SubLObject inference_parameter_name(SubLObject parameter) {
        SubLObject v_subl_identifier = kb_mapping_utilities.fpred_value_in_mt(parameter, $$subLIdentifier, $$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != el_utilities.el_formula_with_operator_p(v_subl_identifier, $$SubLQuoteFn)) {
            return cycl_utilities.nat_arg1(v_subl_identifier, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25000L)
    public static SubLObject inference_parameter_short_description(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_short_description(parameter, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25100L)
    public static SubLObject inference_parameter_long_description(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_long_description(parameter, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25300L)
    public static SubLObject inference_parameter_value_subl_identifier(SubLObject param_value) {
        return parameter_specification_utilities.software_parameter_value_subl_identifier(param_value);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25400L)
    public static SubLObject inference_parameter_default_value(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_default_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25600L)
    public static SubLObject inference_parameter_alternate_value(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_alternate_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25700L)
    public static SubLObject enumeration_inference_parameter_potential_values(SubLObject parameter) {
        SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
        SubLObject result = NIL;
        if (NIL != el_utilities.el_extensional_set_p(domain)) {
            SubLObject cdolist_list_var = el_utilities.el_extensional_set_elements(domain);
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject value_property_list = get_inference_parameter_value_info(elem);
                result = cons(value_property_list, result);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26200L)
    public static SubLObject integer_inference_parameter_min_value(SubLObject parameter) {
        SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
        if (domain.eql($$NonNegativeInteger)) {
            return ZERO_INTEGER;
        }
        if (NIL != narts_high.nart_with_functor_p($$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg1(domain, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26700L)
    public static SubLObject integer_inference_parameter_max_value(SubLObject parameter) {
        SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
        if (domain.eql($$NonNegativeInteger)) {
            return $INTEGER_PLUS_INFINITY;
        }
        if (NIL != narts_high.nart_with_functor_p($$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg2(domain, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27200L)
    public static SubLObject real_number_inference_parameter_min_value(SubLObject parameter) {
        SubLObject pcase_var;
        SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
        if (pcase_var.eql($$Real0_1)) {
            return $float$0_0;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27700L)
    public static SubLObject real_number_inference_parameter_max_value(SubLObject parameter) {
        SubLObject pcase_var;
        SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
        if (pcase_var.eql($$Real0_1)) {
            return $float$1_0;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28100L)
    public static SubLObject inference_parameter_value_short_description(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_short_description(parameter, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28300L)
    public static SubLObject inference_parameter_value_long_description(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_long_description(parameter, $$CycAPIMt);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28500L)
    public static SubLObject inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
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

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29300L)
    public static SubLObject inference_parameter_has_valid_basic_information_p(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(NIL != cycl_grammar.cycl_denotational_term_p(param_cycl) && conses_high.getf(param_info, $NAME, UNPROVIDED).isKeyword() && NIL != Types.booleanp(conses_high.getf(param_info, $BASIC_, UNPROVIDED))
                && NIL != Types.booleanp(conses_high.getf(param_info, $QUERY_STATIC_, UNPROVIDED)) && conses_high.getf(param_info, $SHORT_DESC, UNPROVIDED).isString() && conses_high.getf(param_info, $LONG_DESC, UNPROVIDED).isString());
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29700L)
    public static SubLObject enumeration_inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && NIL != valid_enumeration_inference_parameter_values_p(conses_high.getf(param_info, $POTENTIAL_VALUES, UNPROVIDED))
                && NIL != pph_utilities.keyword_or_nil_p(conses_high.getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)) && NIL != pph_utilities.keyword_or_nil_p(conses_high.getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED)));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30100L)
    public static SubLObject other_inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
        return inference_parameter_has_valid_basic_information_p(param_cycl, param_info);
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30300L)
    public static SubLObject boolean_inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(
                NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && NIL != Types.booleanp(conses_high.getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)) && NIL != Types.booleanp(conses_high.getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED)));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30600L)
    public static SubLObject integer_inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && conses_high.getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isInteger()
                && ($INTEGER_PLUS_INFINITY == conses_high.getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED) || conses_high.getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isInteger()));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31000L)
    public static SubLObject real_number_inference_parameter_has_valid_information_p(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && conses_high.getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED).isNumber() && conses_high.getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isNumber()
                && conses_high.getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isNumber() && (NIL == conses_high.getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED) || conses_high.getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED).isNumber()));
    }

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31600L)
    public static SubLObject valid_enumeration_inference_parameter_values_p(SubLObject potential_values) {
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

    @SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31900L)
    public static SubLObject valid_enumeration_inference_parameter_value_p(SubLObject potential_value) {
        return makeBoolean(NIL != list_utilities.non_empty_list_p(potential_value) && conses_high.getf(potential_value, $VALUE, $NO_VALUE_SPECIFIED) != $NO_VALUE_SPECIFIED && conses_high.getf(potential_value, $SHORT_DESC, UNPROVIDED).isString()
                && conses_high.getf(potential_value, $LONG_DESC, UNPROVIDED).isString());
    }

    public static SubLObject declare_open_cyc_inference_api_file() {
        declareFunction("initialize_open_cyc_inference_api_vars", "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS", 0, 0, false);
        declareFunction("initialize_default_open_cyc_nl_generation_properties", "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES", 0, 0, false);
        declareMacro("synch_format", "SYNCH-FORMAT");
        declareMacro("with_opencyc_inference_pph_memoization", "WITH-OPENCYC-INFERENCE-PPH-MEMOIZATION");
        declareFunction("get_problem_store_ids_for_client", "GET-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        declareFunction("register_problem_store_id_for_client", "REGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        declareFunction("deregister_problem_store_id_for_client", "DEREGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        declareFunction("deregister_all_problem_store_ids_for_client", "DEREGISTER-ALL-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        declareFunction("open_cyc_handle_new_inference_event", "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT", 3, 0, false);
        declareFunction("inference_suspend_reason", "INFERENCE-SUSPEND-REASON", 1, 0, false);
        declareFunction("open_cyc_start_continuable_query", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false);
        declareFunction("open_cyc_start_continuable_query_internal", "OPEN-CYC-START-CONTINUABLE-QUERY-INTERNAL", 7, 0, false);
        declareFunction("open_cyc_release_inference_resources_for_client", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false);
        declareFunction("open_cyc_get_binding_for_variable", "OPEN-CYC-GET-BINDING-FOR-VARIABLE", 2, 0, false);
        declareFunction("open_cyc_get_answer_bindings", "OPEN-CYC-GET-ANSWER-BINDINGS", 1, 0, false);
        declareFunction("open_cyc_continue_query", "OPEN-CYC-CONTINUE-QUERY", 3, 3, false);
        declareFunction("open_cyc_continue_query_guts", "OPEN-CYC-CONTINUE-QUERY-GUTS", 6, 0, false);
        declareFunction("get_inference_parameter_information", "GET-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("open_cyc_initialize_inference", "OPEN-CYC-INITIALIZE-INFERENCE", 3, 0, false);
        declareFunction("open_cyc_release_inference_resources", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES", 2, 0, false);
        declareFunction("open_cyc_continue_query_internal", "OPEN-CYC-CONTINUE-QUERY-INTERNAL", 5, 0, false);
        declareFunction("get_information_for_inference_parameter", "GET-INFORMATION-FOR-INFERENCE-PARAMETER", 1, 0, false);
        declareFunction("get_inference_parameter_value_info", "GET-INFERENCE-PARAMETER-VALUE-INFO", 1, 0, false);
        declareFunction("get_boolean_inference_parameter_information", "GET-BOOLEAN-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("get_integer_inference_parameter_information", "GET-INTEGER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("get_real_number_inference_parameter_information", "GET-REAL-NUMBER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("get_enumeration_inference_parameter_information", "GET-ENUMERATION-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("get_other_inference_parameter_information", "GET-OTHER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        declareFunction("advanced_inference_parameter_p", "ADVANCED-INFERENCE-PARAMETER-P", 1, 0, false);
        declareFunction("basic_inference_parameter_p", "BASIC-INFERENCE-PARAMETER-P", 1, 0, false);
        declareFunction("inference_parameter_name", "INFERENCE-PARAMETER-NAME", 1, 0, false);
        declareFunction("inference_parameter_short_description", "INFERENCE-PARAMETER-SHORT-DESCRIPTION", 1, 0, false);
        declareFunction("inference_parameter_long_description", "INFERENCE-PARAMETER-LONG-DESCRIPTION", 1, 0, false);
        declareFunction("inference_parameter_value_subl_identifier", "INFERENCE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false);
        declareFunction("inference_parameter_default_value", "INFERENCE-PARAMETER-DEFAULT-VALUE", 1, 0, false);
        declareFunction("inference_parameter_alternate_value", "INFERENCE-PARAMETER-ALTERNATE-VALUE", 1, 0, false);
        declareFunction("enumeration_inference_parameter_potential_values", "ENUMERATION-INFERENCE-PARAMETER-POTENTIAL-VALUES", 1, 0, false);
        declareFunction("integer_inference_parameter_min_value", "INTEGER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
        declareFunction("integer_inference_parameter_max_value", "INTEGER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
        declareFunction("real_number_inference_parameter_min_value", "REAL-NUMBER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
        declareFunction("real_number_inference_parameter_max_value", "REAL-NUMBER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
        declareFunction("inference_parameter_value_short_description", "INFERENCE-PARAMETER-VALUE-SHORT-DESCRIPTION", 1, 0, false);
        declareFunction("inference_parameter_value_long_description", "INFERENCE-PARAMETER-VALUE-LONG-DESCRIPTION", 1, 0, false);
        declareFunction("inference_parameter_has_valid_information_p", "INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("inference_parameter_has_valid_basic_information_p", "INFERENCE-PARAMETER-HAS-VALID-BASIC-INFORMATION-P", 2, 0, false);
        declareFunction("enumeration_inference_parameter_has_valid_information_p", "ENUMERATION-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("other_inference_parameter_has_valid_information_p", "OTHER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("boolean_inference_parameter_has_valid_information_p", "BOOLEAN-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("integer_inference_parameter_has_valid_information_p", "INTEGER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("real_number_inference_parameter_has_valid_information_p", "REAL-NUMBER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        declareFunction("valid_enumeration_inference_parameter_values_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUES-P", 1, 0, false);
        declareFunction("valid_enumeration_inference_parameter_value_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_open_cyc_inference_api_file() {
        $use_api_task_processor_incremental_resultsP$ = SubLFiles.defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T);
        $open_cyc_minimum_time_before_sending_new_answers$ = defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
        $default_open_cyc_nl_generation_properties$ = defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL);
        $inference_to_ipc_queue_map$ = deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", maybeDefault($sym7$_INFERENCE_TO_IPC_QUEUE_MAP_, $inference_to_ipc_queue_map$, () -> (dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED))));
        $opencyc_inference_output$ = deflexical("*OPENCYC-INFERENCE-OUTPUT*", maybeDefault($sym8$_OPENCYC_INFERENCE_OUTPUT_, $opencyc_inference_output$, () -> (StreamsLow.$standard_output$.getDynamicValue())));
        $synch_format_lock$ = deflexical("*SYNCH-FORMAT-LOCK*", maybeDefault($sym9$_SYNCH_FORMAT_LOCK_, $synch_format_lock$, () -> (Locks.make_lock($str10$_synch_format_lock_))));
        $client_to_problem_stores_map$ = deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", maybeDefault($sym19$_CLIENT_TO_PROBLEM_STORES_MAP_, $client_to_problem_stores_map$, () -> (dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED))));
        return NIL;
    }

    public static SubLObject setup_open_cyc_inference_api_file() {
        subl_macro_promotions.declare_defglobal($sym7$_INFERENCE_TO_IPC_QUEUE_MAP_);
        subl_macro_promotions.declare_defglobal($sym8$_OPENCYC_INFERENCE_OUTPUT_);
        subl_macro_promotions.declare_defglobal($sym9$_SYNCH_FORMAT_LOCK_);
        subl_macro_promotions.declare_defglobal($sym19$_CLIENT_TO_PROBLEM_STORES_MAP_);
        utilities_macros.register_cyc_api_function($sym28$OPEN_CYC_START_CONTINUABLE_QUERY, $list29, $str30$Starts_a_continuable_inference_as, $list31, NIL);
        utilities_macros.register_cyc_api_function($sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, $list40, $str41$Releases_all_inference_resources_, $list42, NIL);
        access_macros.register_external_symbol($sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE);
        access_macros.register_external_symbol($sym44$OPEN_CYC_GET_ANSWER_BINDINGS);
        utilities_macros.register_cyc_api_function($sym47$OPEN_CYC_CONTINUE_QUERY, $list48, $str49$Continues_an_existing_continuable, $list50, NIL);
        utilities_macros.register_cyc_api_function($sym55$GET_INFERENCE_PARAMETER_INFORMATION, NIL, $str56$Returns_a_property_list_of_infere, NIL, $list57);
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

    static {
        me = new open_cyc_inference_api();
        $use_api_task_processor_incremental_resultsP$ = null;
        $open_cyc_minimum_time_before_sending_new_answers$ = null;
        $default_open_cyc_nl_generation_properties$ = null;
        $inference_to_ipc_queue_map$ = null;
        $opencyc_inference_output$ = null;
        $synch_format_lock$ = null;
        $client_to_problem_stores_map$ = null;
        $NL_PREDS = makeKeyword("NL-PREDS");
        $DEFAULT = makeKeyword("DEFAULT");
        $FORCE = makeKeyword("FORCE");
        $NONE = makeKeyword("NONE");
        $LANGUAGE_MT = makeKeyword("LANGUAGE-MT");
        $DOMAIN_MT = makeKeyword("DOMAIN-MT");
        $list6 = list(makeKeyword("MODE"), makeKeyword("HTML"));
        $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_ = makeSymbol("*INFERENCE-TO-IPC-QUEUE-MAP*");
        $sym8$_OPENCYC_INFERENCE_OUTPUT_ = makeSymbol("*OPENCYC-INFERENCE-OUTPUT*");
        $sym9$_SYNCH_FORMAT_LOCK_ = makeSymbol("*SYNCH-FORMAT-LOCK*");
        $str10$_synch_format_lock_ = makeString("*synch-format-lock*");
        $list11 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));
        $sym12$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
        $list13 = list(makeSymbol("*SYNCH-FORMAT-LOCK*"));
        $sym14$FORMAT = makeSymbol("FORMAT");
        $list15 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*OPENCYC-INFERENCE-OUTPUT*")));
        $CYC_PPH = makeKeyword("CYC-PPH");
        $sym17$WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");
        $sym18$PROGN = makeSymbol("PROGN");
        $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_ = makeSymbol("*CLIENT-TO-PROBLEM-STORES-MAP*");
        $NEW_ANSWER = makeKeyword("NEW-ANSWER");
        $SUSPENDED = makeKeyword("SUSPENDED");
        $STATUS_CHANGE = makeKeyword("STATUS-CHANGE");
        $DEAD = makeKeyword("DEAD");
        $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT = makeSymbol("OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT");
        $sym25$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
        $sym26$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
        $sym27$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
        $sym28$OPEN_CYC_START_CONTINUABLE_QUERY = makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY");
        $list29 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"),
                list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")), list(makeSymbol("OPTIMIZE-QUERY-SENTENCE-VARIABLES?"), T));
        $str30$Starts_a_continuable_inference_as = makeString(
                "Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");
        $list31 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("MT"), makeSymbol("POSSIBLY-MT-P")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));
        $EVENTS = makeKeyword("EVENTS");
        $list33 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"));
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $str35$Inference_Communication_Queue = makeString("Inference Communication Queue");
        $INFERENCE_START = makeKeyword("INFERENCE-START");
        $str37$Problem_store_ID___A___Inference_ = makeString("Problem store ID: ~A ~%Inference ID: ~A~%");
        $sym38$STRINGP = makeSymbol("STRINGP");
        $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT = makeSymbol("OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT");
        $list40 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CLIENT"), list(makeSymbol("GET-CURRENT-TASK-PROCESSOR-CLIENT"))));
        $str41$Releases_all_inference_resources_ = makeString("Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).");
        $list42 = list(list(makeSymbol("CLIENT"), makeSymbol("STRINGP")));
        $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE = makeSymbol("OPEN-CYC-GET-BINDING-FOR-VARIABLE");
        $sym44$OPEN_CYC_GET_ANSWER_BINDINGS = makeSymbol("OPEN-CYC-GET-ANSWER-BINDINGS");
        $sym45$INTEGERP = makeSymbol("INTEGERP");
        $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P = makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P");
        $sym47$OPEN_CYC_CONTINUE_QUERY = makeSymbol("OPEN-CYC-CONTINUE-QUERY");
        $list48 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"), makeSymbol("PROPERTIES"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"),
                list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")));
        $str49$Continues_an_existing_continuable = makeString(
                "Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");
        $list50 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")),
                list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P")));
        $str51$Inference__A_is_already_running__ = makeString("Inference ~A is already running!~%");
        $str52$Cannot_ask_query__Invalid_inferen = makeString("Cannot ask query. Invalid inference-status: ~A~%");
        $$CycAPIMt = makeConstSym(("CycAPIMt"));
        $list54 = list(makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), makeKeyword("INTEGER-INFERENCE-PARAMETERS"), makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), makeKeyword("OTHER-INFERENCE-PARAMETERS"));
        $sym55$GET_INFERENCE_PARAMETER_INFORMATION = makeSymbol("GET-INFERENCE-PARAMETER-INFORMATION");
        $str56$Returns_a_property_list_of_infere = makeString(
                "Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");
        $list57 = list(makeSymbol("PROPERTY-LIST-P"));
        $sym58$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str59$Query_thread_ = makeString("Query thread ");
        $sym60$CONTINUE_INFERENCE = makeSymbol("CONTINUE-INFERENCE");
        $NEW = makeKeyword("NEW");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym63$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list64 = list(makeKeyword("NAME"), makeKeyword("BASIC?"), makeKeyword("QUERY-STATIC?"), makeKeyword("SHORT-DESC"), makeKeyword("LONG-DESC"), makeKeyword("DEFAULT-VALUE"), makeKeyword("ALTERNATE-VALUE"));
        $VALUE = makeKeyword("VALUE");
        $SHORT_DESC = makeKeyword("SHORT-DESC");
        $LONG_DESC = makeKeyword("LONG-DESC");
        $$BooleanInferenceParameter = makeConstSym(("BooleanInferenceParameter"));
        $$IntegerInferenceParameter = makeConstSym(("IntegerInferenceParameter"));
        $MIN_VALUE = makeKeyword("MIN-VALUE");
        $MAX_VALUE = makeKeyword("MAX-VALUE");
        $$RealNumberInferenceParameter = makeConstSym(("RealNumberInferenceParameter"));
        $$EnumerationInferenceParameter = makeConstSym(("EnumerationInferenceParameter"));
        $POTENTIAL_VALUES = makeKeyword("POTENTIAL-VALUES");
        $$InferenceParameter = makeConstSym(("InferenceParameter"));
        $$quotedIsa = makeConstSym(("quotedIsa"));
        $$InferenceSupportedTerm = makeConstSym(("InferenceSupportedTerm"));
        $FALSE = makeKeyword("FALSE");
        $BASIC_ = makeKeyword("BASIC?");
        $$AdvancedInferenceParameter = makeConstSym(("AdvancedInferenceParameter"));
        $$subLIdentifier = makeConstSym(("subLIdentifier"));
        $TRUE = makeKeyword("TRUE");
        $$SubLQuoteFn = makeConstSym(("SubLQuoteFn"));
        $$CycInferenceEngine = makeConstSym(("CycInferenceEngine"));
        $$NonNegativeInteger = makeConstSym(("NonNegativeInteger"));
        $$IntegerFromToFn = makeConstSym(("IntegerFromToFn"));
        $INTEGER_PLUS_INFINITY = makeKeyword("INTEGER-PLUS-INFINITY");
        $$Real0_1 = makeConstSym(("Real0-1"));
        $float$0_0 = makeDouble(0.0);
        $float$1_0 = makeDouble(1.0);
        $NAME = makeKeyword("NAME");
        $QUERY_STATIC_ = makeKeyword("QUERY-STATIC?");
        $DEFAULT_VALUE = makeKeyword("DEFAULT-VALUE");
        $NO_VALUE_SPECIFIED = makeKeyword("NO-VALUE-SPECIFIED");
        $ALTERNATE_VALUE = makeKeyword("ALTERNATE-VALUE");
    }
}
/*
 *
 * Total time: 374 ms
 *
 */