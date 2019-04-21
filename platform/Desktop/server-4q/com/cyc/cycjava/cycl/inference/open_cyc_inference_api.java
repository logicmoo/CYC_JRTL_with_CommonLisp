package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class open_cyc_inference_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.open_cyc_inference_api";
    public static final String myFingerPrint = "8d6ac2e42be978087cf0c106d5444430392dcf2e66314bb8e8bca05c44b50c0d";
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 1814L)
    private static SubLSymbol $use_api_task_processor_incremental_resultsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2025L)
    private static SubLSymbol $open_cyc_minimum_time_before_sending_new_answers$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2225L)
    public static SubLSymbol $default_open_cyc_nl_generation_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2926L)
    private static SubLSymbol $inference_to_ipc_queue_map$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3008L)
    private static SubLSymbol $opencyc_inference_output$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3074L)
    private static SubLSymbol $synch_format_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3688L)
    private static SubLSymbol $client_to_problem_stores_map$;
    private static final SubLSymbol $kw0$NL_PREDS;
    private static final SubLSymbol $kw1$DEFAULT;
    private static final SubLSymbol $kw2$FORCE;
    private static final SubLSymbol $kw3$NONE;
    private static final SubLSymbol $kw4$LANGUAGE_MT;
    private static final SubLSymbol $kw5$DOMAIN_MT;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_;
    private static final SubLSymbol $sym8$_OPENCYC_INFERENCE_OUTPUT_;
    private static final SubLSymbol $sym9$_SYNCH_FORMAT_LOCK_;
    private static final SubLString $str10$_synch_format_lock_;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$WITH_LOCK_HELD;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$FORMAT;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$CYC_PPH;
    private static final SubLSymbol $sym17$WITH_PPH_MEMOIZATION;
    private static final SubLSymbol $sym18$PROGN;
    private static final SubLSymbol $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_;
    private static final SubLSymbol $kw20$NEW_ANSWER;
    private static final SubLSymbol $kw21$SUSPENDED;
    private static final SubLSymbol $kw22$STATUS_CHANGE;
    private static final SubLSymbol $kw23$DEAD;
    private static final SubLSymbol $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT;
    private static final SubLSymbol $sym25$EL_FORMULA_P;
    private static final SubLSymbol $sym26$POSSIBLY_MT_P;
    private static final SubLSymbol $sym27$QUERY_PROPERTIES_P;
    private static final SubLSymbol $sym28$OPEN_CYC_START_CONTINUABLE_QUERY;
    private static final SubLList $list29;
    private static final SubLString $str30$Starts_a_continuable_inference_as;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$EVENTS;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$CONDITIONAL_SENTENCE_;
    private static final SubLString $str35$Inference_Communication_Queue;
    private static final SubLSymbol $kw36$INFERENCE_START;
    private static final SubLString $str37$Problem_store_ID___A___Inference_;
    private static final SubLSymbol $sym38$STRINGP;
    private static final SubLSymbol $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT;
    private static final SubLList $list40;
    private static final SubLString $str41$Releases_all_inference_resources_;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE;
    private static final SubLSymbol $sym44$OPEN_CYC_GET_ANSWER_BINDINGS;
    private static final SubLSymbol $sym45$INTEGERP;
    private static final SubLSymbol $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P;
    private static final SubLSymbol $sym47$OPEN_CYC_CONTINUE_QUERY;
    private static final SubLList $list48;
    private static final SubLString $str49$Continues_an_existing_continuable;
    private static final SubLList $list50;
    private static final SubLString $str51$Inference__A_is_already_running__;
    private static final SubLString $str52$Cannot_ask_query__Invalid_inferen;
    private static final SubLObject $const53$CycAPIMt;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$GET_INFERENCE_PARAMETER_INFORMATION;
    private static final SubLString $str56$Returns_a_property_list_of_infere;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str59$Query_thread_;
    private static final SubLSymbol $sym60$CONTINUE_INFERENCE;
    private static final SubLSymbol $kw61$NEW;
    private static final SubLSymbol $kw62$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym63$IGNORE_ERRORS_HANDLER;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$VALUE;
    private static final SubLSymbol $kw66$SHORT_DESC;
    private static final SubLSymbol $kw67$LONG_DESC;
    private static final SubLObject $const68$BooleanInferenceParameter;
    private static final SubLObject $const69$IntegerInferenceParameter;
    private static final SubLSymbol $kw70$MIN_VALUE;
    private static final SubLSymbol $kw71$MAX_VALUE;
    private static final SubLObject $const72$RealNumberInferenceParameter;
    private static final SubLObject $const73$EnumerationInferenceParameter;
    private static final SubLSymbol $kw74$POTENTIAL_VALUES;
    private static final SubLObject $const75$InferenceParameter;
    private static final SubLObject $const76$quotedIsa;
    private static final SubLObject $const77$InferenceSupportedTerm;
    private static final SubLSymbol $kw78$FALSE;
    private static final SubLSymbol $kw79$BASIC_;
    private static final SubLObject $const80$AdvancedInferenceParameter;
    private static final SubLObject $const81$subLIdentifier;
    private static final SubLSymbol $kw82$TRUE;
    private static final SubLObject $const83$SubLQuoteFn;
    private static final SubLObject $const84$CycInferenceEngine;
    private static final SubLObject $const85$NonNegativeInteger;
    private static final SubLObject $const86$IntegerFromToFn;
    private static final SubLSymbol $kw87$INTEGER_PLUS_INFINITY;
    private static final SubLObject $const88$Real0_1;
    private static final SubLFloat $float89$0_0;
    private static final SubLFloat $float90$1_0;
    private static final SubLSymbol $kw91$NAME;
    private static final SubLSymbol $kw92$QUERY_STATIC_;
    private static final SubLSymbol $kw93$DEFAULT_VALUE;
    private static final SubLSymbol $kw94$NO_VALUE_SPECIFIED;
    private static final SubLSymbol $kw95$ALTERNATE_VALUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2434L)
    public static SubLObject initialize_open_cyc_inference_api_vars() {
        return initialize_default_open_cyc_nl_generation_properties();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 2560L)
    public static SubLObject initialize_default_open_cyc_nl_generation_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.setDynamicValue((SubLObject)ConsesLow.listS((SubLObject)open_cyc_inference_api.$kw0$NL_PREDS, new SubLObject[] { open_cyc_inference_api.$kw1$DEFAULT, open_cyc_inference_api.$kw2$FORCE, open_cyc_inference_api.$kw3$NONE, open_cyc_inference_api.$kw4$LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(thread), open_cyc_inference_api.$kw5$DOMAIN_MT, pph_vars.$pph_domain_mt$.getDynamicValue(thread), open_cyc_inference_api.$list6 }), thread);
        return open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3150L)
    public static SubLObject synch_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_control = (SubLObject)open_cyc_inference_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)open_cyc_inference_api.$list11);
        format_control = current.first();
        final SubLObject format_arguments;
        current = (format_arguments = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)open_cyc_inference_api.$sym12$WITH_LOCK_HELD, (SubLObject)open_cyc_inference_api.$list13, (SubLObject)ConsesLow.listS((SubLObject)open_cyc_inference_api.$sym14$FORMAT, (SubLObject)open_cyc_inference_api.$sym8$_OPENCYC_INFERENCE_OUTPUT_, format_control, ConsesLow.append(format_arguments, (SubLObject)open_cyc_inference_api.NIL)), (SubLObject)open_cyc_inference_api.$list15);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3396L)
    public static SubLObject with_opencyc_inference_pph_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (open_cyc_inference_api.NIL != Sequences.find((SubLObject)open_cyc_inference_api.$kw16$CYC_PPH, reader.$features$.getDynamicValue(thread), (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED)) {
            return reader.bq_cons((SubLObject)open_cyc_inference_api.$sym17$WITH_PPH_MEMOIZATION, ConsesLow.append(body, (SubLObject)open_cyc_inference_api.NIL));
        }
        return reader.bq_cons((SubLObject)open_cyc_inference_api.$sym18$PROGN, ConsesLow.append(body, (SubLObject)open_cyc_inference_api.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3779L)
    public static SubLObject get_problem_store_ids_for_client(final SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_lookup(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, (SubLObject)open_cyc_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 3920L)
    public static SubLObject register_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_push(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4097L)
    public static SubLObject deregister_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_delete_from_value(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4291L)
    public static SubLObject deregister_all_problem_store_ids_for_client(final SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_remove(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 4443L)
    public static SubLObject open_cyc_handle_new_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject datum) {
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, (SubLObject)open_cyc_inference_api.NIL);
        if (datum.isInteger()) {
            process_utilities.ipc_enqueue((SubLObject)open_cyc_inference_api.$kw20$NEW_ANSWER, ipc_queue, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        }
        else if (datum == open_cyc_inference_api.$kw21$SUSPENDED) {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)open_cyc_inference_api.$kw22$STATUS_CHANGE, datum, inference_suspend_reason(inference)), ipc_queue, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        }
        else {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)open_cyc_inference_api.$kw22$STATUS_CHANGE, datum, (SubLObject)open_cyc_inference_api.NIL), ipc_queue, (SubLObject)open_cyc_inference_api.UNPROVIDED);
            if (datum == open_cyc_inference_api.$kw23$DEAD) {
                dictionary_utilities.synchronized_dictionary_remove(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference);
                inference_event_filters.deregister_handler_for_inference_event(problem_store_id, inference_id, (SubLObject)open_cyc_inference_api.$sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
                open_cyc_release_inference_resources(problem_store_id, inference_id);
            }
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5638L)
    public static SubLObject inference_suspend_reason(final SubLObject inference) {
        return (SubLObject)((open_cyc_inference_api.NIL != inference_datastructures_inference.suspended_inference_p(inference)) ? inference_datastructures_inference.inference_suspend_status(inference) : open_cyc_inference_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 5782L)
    public static SubLObject open_cyc_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
        if (v_properties == open_cyc_inference_api.UNPROVIDED) {
            v_properties = (SubLObject)open_cyc_inference_api.NIL;
        }
        if (nl_generation_properties == open_cyc_inference_api.UNPROVIDED) {
            nl_generation_properties = open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == open_cyc_inference_api.UNPROVIDED) {
            inference_answer_process_function = (SubLObject)open_cyc_inference_api.NIL;
        }
        if (incremental_resultsP == open_cyc_inference_api.UNPROVIDED) {
            incremental_resultsP = open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        if (optimize_query_sentence_variablesP == open_cyc_inference_api.UNPROVIDED) {
            optimize_query_sentence_variablesP = (SubLObject)open_cyc_inference_api.T;
        }
        enforceType(sentence, open_cyc_inference_api.$sym25$EL_FORMULA_P);
        enforceType(mt, open_cyc_inference_api.$sym26$POSSIBLY_MT_P);
        enforceType(v_properties, open_cyc_inference_api.$sym27$QUERY_PROPERTIES_P);
        return open_cyc_start_continuable_query_internal(sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 7971L)
    public static SubLObject open_cyc_start_continuable_query_internal(final SubLObject sentence, SubLObject mt, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP, final SubLObject optimize_query_sentence_variablesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = hlmt_czer.coerce_to_hlmt(mt);
        v_properties = conses_high.putf(v_properties, (SubLObject)open_cyc_inference_api.$kw32$EVENTS, (SubLObject)open_cyc_inference_api.$list33);
        final SubLObject optimized_sentence = (open_cyc_inference_api.NIL != optimize_query_sentence_variablesP) ? el_utilities.optimize_el_formula_variable_names(sentence, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED) : sentence;
        final SubLObject conditionalP = (open_cyc_inference_api.NIL != list_utilities.plist_has_keyP(v_properties, (SubLObject)open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_)) ? list_utilities.plist_lookup(v_properties, (SubLObject)open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_, (SubLObject)open_cyc_inference_api.UNPROVIDED) : inference_strategist.inference_conditional_sentence_p(cycl_utilities.hl_to_el(optimized_sentence));
        final SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), (SubLObject)ConsesLow.list((SubLObject)open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_, conditionalP));
        final SubLObject ipc_queue = process_utilities.new_ipc_queue((SubLObject)open_cyc_inference_api.$str35$Inference_Communication_Queue);
        thread.resetMultipleValues();
        final SubLObject inference = open_cyc_initialize_inference(optimized_sentence, mt, static_properties);
        final SubLObject problem_store_id = thread.secondMultipleValue();
        final SubLObject inference_id = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        dictionary_utilities.synchronized_dictionary_enter(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue);
        inference_event_filters.register_handler_for_all_inference_events(inference, (SubLObject)open_cyc_inference_api.$sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
        if (open_cyc_inference_api.NIL != incremental_resultsP) {
            task_processor.post_task_info_processor_partial_results((SubLObject)ConsesLow.list((SubLObject)open_cyc_inference_api.$kw36$INFERENCE_START, problem_store_id, inference_id));
        }
        else {
            PrintLow.format((SubLObject)open_cyc_inference_api.T, (SubLObject)open_cyc_inference_api.$str37$Problem_store_ID___A___Inference_, problem_store_id, inference_id);
        }
        return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 9715L)
    public static SubLObject open_cyc_release_inference_resources_for_client(SubLObject client) {
        if (client == open_cyc_inference_api.UNPROVIDED) {
            client = task_processor.get_current_task_processor_client();
        }
        enforceType(client, open_cyc_inference_api.$sym38$STRINGP);
        SubLObject cdolist_list_var;
        final SubLObject problem_store_ids = cdolist_list_var = get_problem_store_ids_for_client(client);
        SubLObject problem_store_id = (SubLObject)open_cyc_inference_api.NIL;
        problem_store_id = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id));
            cdolist_list_var = cdolist_list_var.rest();
            problem_store_id = cdolist_list_var.first();
        }
        deregister_all_problem_store_ids_for_client(client);
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10263L)
    public static SubLObject open_cyc_get_binding_for_variable(final SubLObject variable, final SubLObject inference_answer_signature) {
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
        final SubLObject v_bindings = (SubLObject)((open_cyc_inference_api.NIL != inference_answer) ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : open_cyc_inference_api.NIL);
        return bindings.variable_lookup(variable, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 10664L)
    public static SubLObject open_cyc_get_answer_bindings(final SubLObject inference_answer_signature) {
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(inference_answer_signature);
        return (SubLObject)((open_cyc_inference_api.NIL != inference_answer) ? inference_datastructures_inference.inference_answer_bindings(inference_answer) : open_cyc_inference_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 11014L)
    public static SubLObject open_cyc_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        if (nl_generation_properties == open_cyc_inference_api.UNPROVIDED) {
            nl_generation_properties = open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == open_cyc_inference_api.UNPROVIDED) {
            inference_answer_process_function = (SubLObject)open_cyc_inference_api.NIL;
        }
        if (incremental_resultsP == open_cyc_inference_api.UNPROVIDED) {
            incremental_resultsP = open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        enforceType(problem_store_id, open_cyc_inference_api.$sym45$INTEGERP);
        enforceType(inference_id, open_cyc_inference_api.$sym45$INTEGERP);
        enforceType(v_properties, open_cyc_inference_api.$sym27$QUERY_PROPERTIES_P);
        enforceType(nl_generation_properties, open_cyc_inference_api.$sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P);
        return open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 12932L)
    public static SubLObject open_cyc_continue_query_guts(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP) {
        v_properties = conses_high.putf(v_properties, (SubLObject)open_cyc_inference_api.$kw32$EVENTS, (SubLObject)open_cyc_inference_api.$list33);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        if (open_cyc_inference_api.NIL != inference_datastructures_inference.running_inference_p(inference)) {
            Errors.error((SubLObject)open_cyc_inference_api.$str51$Inference__A_is_already_running__, inference);
        }
        else {
            if (open_cyc_inference_api.NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                return open_cyc_continue_query_internal(inference, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
            }
            Errors.error((SubLObject)open_cyc_inference_api.$str52$Cannot_ask_query__Invalid_inferen, inference_datastructures_inference.inference_status(inference));
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 13666L)
    public static SubLObject get_inference_parameter_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(open_cyc_inference_api.$const53$CycAPIMt);
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
            result = list_utilities.make_plist((SubLObject)open_cyc_inference_api.$list54, (SubLObject)ConsesLow.list(boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters, other_inference_parameters));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15253L)
    public static SubLObject open_cyc_initialize_inference(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties) {
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject client = task_processor.get_current_task_processor_client();
        if (open_cyc_inference_api.NIL != client) {
            register_problem_store_id_for_client(client, problem_store_id);
        }
        return Values.values(inference, problem_store_id, inference_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 15947L)
    public static SubLObject open_cyc_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject client = task_processor.get_current_task_processor_client();
        if (open_cyc_inference_api.NIL != client) {
            deregister_problem_store_id_for_client(client, problem_store_id);
        }
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 16826L)
    public static SubLObject open_cyc_continue_query_internal(final SubLObject inference, final SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject final_result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject error_message = (SubLObject)open_cyc_inference_api.NIL;
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)open_cyc_inference_api.$sym58$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                        try {
                            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)open_cyc_inference_api.NIL, thread);
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
                                                    SubLObject inference_process = (SubLObject)open_cyc_inference_api.NIL;
                                                    final SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id(inference);
                                                    inference_process = process_utilities.make_cyc_server_process_with_args(Sequences.cconcatenate((SubLObject)open_cyc_inference_api.$str59$Query_thread_, format_nil.format_nil_a_no_copy(inference)), (SubLObject)open_cyc_inference_api.$sym60$CONTINUE_INFERENCE, (SubLObject)ConsesLow.list(inference, dynamic_properties));
                                                    final SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, (SubLObject)open_cyc_inference_api.UNPROVIDED);
                                                    final SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, open_cyc_inference_api.$open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue(thread), incremental_resultsP, start_index, inference_process);
                                                    while (open_cyc_inference_api.NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(ipcq_processor)) {
                                                        inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration(ipcq_processor);
                                                    }
                                                    final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results(ipcq_processor);
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)open_cyc_inference_api.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        }
                                        finally {
                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                                        }
                                        if (new_or_reused == open_cyc_inference_api.$kw61$NEW && open_cyc_inference_api.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)open_cyc_inference_api.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (open_cyc_inference_api.NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        finally {
                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)open_cyc_inference_api.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)open_cyc_inference_api.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag = (SubLObject)open_cyc_inference_api.NIL;
                try {
                    thread.throwStack.push(open_cyc_inference_api.$kw62$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)open_cyc_inference_api.$sym63$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            inference_strategist.inference_interrupt(inference, (SubLObject)open_cyc_inference_api.FIVE_INTEGER);
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)open_cyc_inference_api.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)open_cyc_inference_api.$kw62$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                if (open_cyc_inference_api.NIL != error_message) {
                    Errors.error(error_message);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return final_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 19986L)
    public static SubLObject get_information_for_inference_parameter(final SubLObject param) {
        final SubLObject name = inference_parameter_name(param);
        final SubLObject basic_propP = basic_inference_parameter_p(param);
        final SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p(name);
        final SubLObject short_desc = inference_parameter_short_description(param);
        final SubLObject long_desc = inference_parameter_long_description(param);
        final SubLObject default_value = inference_parameter_default_value(param);
        final SubLObject alternate_value = inference_parameter_alternate_value(param);
        final SubLObject alternate_value_property_list = (SubLObject)((open_cyc_inference_api.NIL != alternate_value) ? get_inference_parameter_value_info(alternate_value) : open_cyc_inference_api.NIL);
        final SubLObject param_result = list_utilities.make_plist((SubLObject)open_cyc_inference_api.$list64, (SubLObject)ConsesLow.list(name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list));
        return param_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 20952L)
    public static SubLObject get_inference_parameter_value_info(final SubLObject param_value) {
        final SubLObject subl_value = inference_parameter_value_subl_identifier(param_value);
        final SubLObject short_desc = inference_parameter_value_short_description(param_value);
        final SubLObject long_desc = inference_parameter_value_long_description(param_value);
        return (SubLObject)ConsesLow.list((SubLObject)open_cyc_inference_api.$kw65$VALUE, subl_value, (SubLObject)open_cyc_inference_api.$kw66$SHORT_DESC, short_desc, (SubLObject)open_cyc_inference_api.$kw67$LONG_DESC, long_desc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21340L)
    public static SubLObject get_boolean_inference_parameter_information() {
        final SubLObject parameters = isa.all_fort_instances(open_cyc_inference_api.$const68$BooleanInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = (SubLObject)open_cyc_inference_api.NIL;
        param = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            final SubLObject param_result = get_information_for_inference_parameter(param);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 21681L)
    public static SubLObject get_integer_inference_parameter_information() {
        final SubLObject parameters = isa.all_fort_instances(open_cyc_inference_api.$const69$IntegerInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = (SubLObject)open_cyc_inference_api.NIL;
        param = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            final SubLObject min_value = integer_inference_parameter_min_value(param);
            final SubLObject max_value = integer_inference_parameter_max_value(param);
            param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw70$MIN_VALUE, min_value);
            param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw71$MAX_VALUE, max_value);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22278L)
    public static SubLObject get_real_number_inference_parameter_information() {
        final SubLObject parameters = isa.all_fort_instances(open_cyc_inference_api.$const72$RealNumberInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = (SubLObject)open_cyc_inference_api.NIL;
        param = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            final SubLObject min_value = real_number_inference_parameter_min_value(param);
            final SubLObject max_value = real_number_inference_parameter_max_value(param);
            param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw70$MIN_VALUE, min_value);
            param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw71$MAX_VALUE, max_value);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 22892L)
    public static SubLObject get_enumeration_inference_parameter_information() {
        final SubLObject parameters = isa.all_fort_instances(open_cyc_inference_api.$const73$EnumerationInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = (SubLObject)open_cyc_inference_api.NIL;
        param = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            SubLObject param_result = get_information_for_inference_parameter(param);
            final SubLObject potential_values = enumeration_inference_parameter_potential_values(param);
            param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw74$POTENTIAL_VALUES, potential_values);
            result = conses_high.putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 23400L)
    public static SubLObject get_other_inference_parameter_information() {
        final SubLObject parameters = isa.all_fort_instances(open_cyc_inference_api.$const75$InferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = (SubLObject)open_cyc_inference_api.NIL;
        param = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            if (open_cyc_inference_api.NIL == nart_handles.nart_p(param) && open_cyc_inference_api.NIL == kb_mapping_utilities.pred_u_v_holds_in_any_mt(open_cyc_inference_api.$const76$quotedIsa, param, open_cyc_inference_api.$const77$InferenceSupportedTerm, (SubLObject)open_cyc_inference_api.ONE_INTEGER, (SubLObject)open_cyc_inference_api.TWO_INTEGER, (SubLObject)open_cyc_inference_api.$kw78$FALSE) && open_cyc_inference_api.NIL == hl_prototypes.hl_prototypical_instanceP(param)) {
                final SubLObject min_isa = isa.min_isa(param, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED);
                if (open_cyc_inference_api.NIL != list_utilities.singletonP(min_isa) && open_cyc_inference_api.$const75$InferenceParameter.eql(list_utilities.only_one(min_isa))) {
                    SubLObject param_result = get_information_for_inference_parameter(param);
                    param_result = conses_high.putf(param_result, (SubLObject)open_cyc_inference_api.$kw79$BASIC_, (SubLObject)open_cyc_inference_api.NIL);
                    result = conses_high.putf(result, param, param_result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24194L)
    public static SubLObject advanced_inference_parameter_p(final SubLObject param) {
        return isa.isaP(param, open_cyc_inference_api.$const80$AdvancedInferenceParameter, (SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24671L)
    public static SubLObject basic_inference_parameter_p(final SubLObject param) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL == advanced_inference_parameter_p(param));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 24779L)
    public static SubLObject inference_parameter_name(final SubLObject parameter) {
        final SubLObject v_subl_identifier = kb_mapping_utilities.fpred_value_in_mt(parameter, open_cyc_inference_api.$const81$subLIdentifier, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.ONE_INTEGER, (SubLObject)open_cyc_inference_api.TWO_INTEGER, (SubLObject)open_cyc_inference_api.$kw82$TRUE);
        if (open_cyc_inference_api.NIL != el_utilities.el_formula_with_operator_p(v_subl_identifier, open_cyc_inference_api.$const83$SubLQuoteFn)) {
            return cycl_utilities.nat_arg1(v_subl_identifier, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25042L)
    public static SubLObject inference_parameter_short_description(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_short_description(parameter, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25179L)
    public static SubLObject inference_parameter_long_description(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_long_description(parameter, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25314L)
    public static SubLObject inference_parameter_value_subl_identifier(final SubLObject param_value) {
        return parameter_specification_utilities.software_parameter_value_subl_identifier(param_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25451L)
    public static SubLObject inference_parameter_default_value(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_default_value(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25600L)
    public static SubLObject inference_parameter_alternate_value(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_alternate_value(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 25754L)
    public static SubLObject enumeration_inference_parameter_potential_values(final SubLObject parameter) {
        final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
        SubLObject result = (SubLObject)open_cyc_inference_api.NIL;
        if (open_cyc_inference_api.NIL != el_utilities.el_extensional_set_p(domain)) {
            SubLObject cdolist_list_var = el_utilities.el_extensional_set_elements(domain);
            SubLObject elem = (SubLObject)open_cyc_inference_api.NIL;
            elem = cdolist_list_var.first();
            while (open_cyc_inference_api.NIL != cdolist_list_var) {
                final SubLObject value_property_list = get_inference_parameter_value_info(elem);
                result = (SubLObject)ConsesLow.cons(value_property_list, result);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26206L)
    public static SubLObject integer_inference_parameter_min_value(final SubLObject parameter) {
        final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
        if (domain.eql(open_cyc_inference_api.$const85$NonNegativeInteger)) {
            return (SubLObject)open_cyc_inference_api.ZERO_INTEGER;
        }
        if (open_cyc_inference_api.NIL != narts_high.nart_with_functor_p(open_cyc_inference_api.$const86$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg1(domain, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 26742L)
    public static SubLObject integer_inference_parameter_max_value(final SubLObject parameter) {
        final SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
        if (domain.eql(open_cyc_inference_api.$const85$NonNegativeInteger)) {
            return (SubLObject)open_cyc_inference_api.$kw87$INTEGER_PLUS_INFINITY;
        }
        if (open_cyc_inference_api.NIL != narts_high.nart_with_functor_p(open_cyc_inference_api.$const86$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg2(domain, (SubLObject)open_cyc_inference_api.UNPROVIDED);
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27298L)
    public static SubLObject real_number_inference_parameter_min_value(final SubLObject parameter) {
        final SubLObject pcase_var;
        final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
        if (pcase_var.eql(open_cyc_inference_api.$const88$Real0_1)) {
            return (SubLObject)open_cyc_inference_api.$float89$0_0;
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 27732L)
    public static SubLObject real_number_inference_parameter_max_value(final SubLObject parameter) {
        final SubLObject pcase_var;
        final SubLObject domain = pcase_var = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$const84$CycInferenceEngine, open_cyc_inference_api.$const53$CycAPIMt);
        if (pcase_var.eql(open_cyc_inference_api.$const88$Real0_1)) {
            return (SubLObject)open_cyc_inference_api.$float90$1_0;
        }
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28165L)
    public static SubLObject inference_parameter_value_short_description(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_short_description(parameter, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28343L)
    public static SubLObject inference_parameter_value_long_description(final SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_long_description(parameter, open_cyc_inference_api.$const53$CycAPIMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 28518L)
    public static SubLObject inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        if (open_cyc_inference_api.NIL != isa.isaP(param_cycl, open_cyc_inference_api.$const68$BooleanInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED)) {
            return boolean_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (open_cyc_inference_api.NIL != isa.isaP(param_cycl, open_cyc_inference_api.$const69$IntegerInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED)) {
            return integer_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (open_cyc_inference_api.NIL != isa.isaP(param_cycl, open_cyc_inference_api.$const72$RealNumberInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED)) {
            return real_number_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (open_cyc_inference_api.NIL != isa.isaP(param_cycl, open_cyc_inference_api.$const73$EnumerationInferenceParameter, open_cyc_inference_api.$const53$CycAPIMt, (SubLObject)open_cyc_inference_api.UNPROVIDED)) {
            return enumeration_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        return other_inference_parameter_has_valid_information_p(param_cycl, param_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29354L)
    public static SubLObject inference_parameter_has_valid_basic_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != cycl_grammar.cycl_denotational_term_p(param_cycl) && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw91$NAME, (SubLObject)open_cyc_inference_api.UNPROVIDED).isKeyword() && open_cyc_inference_api.NIL != Types.booleanp(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw79$BASIC_, (SubLObject)open_cyc_inference_api.UNPROVIDED)) && open_cyc_inference_api.NIL != Types.booleanp(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw92$QUERY_STATIC_, (SubLObject)open_cyc_inference_api.UNPROVIDED)) && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw66$SHORT_DESC, (SubLObject)open_cyc_inference_api.UNPROVIDED).isString() && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw67$LONG_DESC, (SubLObject)open_cyc_inference_api.UNPROVIDED).isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 29726L)
    public static SubLObject enumeration_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && open_cyc_inference_api.NIL != valid_enumeration_inference_parameter_values_p(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw74$POTENTIAL_VALUES, (SubLObject)open_cyc_inference_api.UNPROVIDED)) && open_cyc_inference_api.NIL != pph_utilities.keyword_or_nil_p(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw93$DEFAULT_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED)) && open_cyc_inference_api.NIL != pph_utilities.keyword_or_nil_p(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw95$ALTERNATE_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30171L)
    public static SubLObject other_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return inference_parameter_has_valid_basic_information_p(param_cycl, param_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30345L)
    public static SubLObject boolean_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && open_cyc_inference_api.NIL != Types.booleanp(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw93$DEFAULT_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED)) && open_cyc_inference_api.NIL != Types.booleanp(conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw95$ALTERNATE_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 30672L)
    public static SubLObject integer_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw70$MIN_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isInteger() && (open_cyc_inference_api.$kw87$INTEGER_PLUS_INFINITY == conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw71$MAX_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED) || conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw71$MAX_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isInteger()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31091L)
    public static SubLObject real_number_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != inference_parameter_has_valid_basic_information_p(param_cycl, param_info) && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw93$DEFAULT_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isNumber() && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw70$MIN_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isNumber() && conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw71$MAX_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isNumber() && (open_cyc_inference_api.NIL == conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw95$ALTERNATE_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED) || conses_high.getf(param_info, (SubLObject)open_cyc_inference_api.$kw95$ALTERNATE_VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED).isNumber()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31631L)
    public static SubLObject valid_enumeration_inference_parameter_values_p(final SubLObject potential_values) {
        if (open_cyc_inference_api.NIL == potential_values) {
            return (SubLObject)open_cyc_inference_api.NIL;
        }
        SubLObject cdolist_list_var = potential_values;
        SubLObject potential_value = (SubLObject)open_cyc_inference_api.NIL;
        potential_value = cdolist_list_var.first();
        while (open_cyc_inference_api.NIL != cdolist_list_var) {
            if (open_cyc_inference_api.NIL == valid_enumeration_inference_parameter_value_p(potential_value)) {
                return (SubLObject)open_cyc_inference_api.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            potential_value = cdolist_list_var.first();
        }
        return (SubLObject)open_cyc_inference_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-inference-api.lisp", position = 31914L)
    public static SubLObject valid_enumeration_inference_parameter_value_p(final SubLObject potential_value) {
        return (SubLObject)SubLObjectFactory.makeBoolean(open_cyc_inference_api.NIL != list_utilities.non_empty_list_p(potential_value) && conses_high.getf(potential_value, (SubLObject)open_cyc_inference_api.$kw65$VALUE, (SubLObject)open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED) != open_cyc_inference_api.$kw94$NO_VALUE_SPECIFIED && conses_high.getf(potential_value, (SubLObject)open_cyc_inference_api.$kw66$SHORT_DESC, (SubLObject)open_cyc_inference_api.UNPROVIDED).isString() && conses_high.getf(potential_value, (SubLObject)open_cyc_inference_api.$kw67$LONG_DESC, (SubLObject)open_cyc_inference_api.UNPROVIDED).isString());
    }
    
    public static SubLObject declare_open_cyc_inference_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "initialize_open_cyc_inference_api_vars", "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "initialize_default_open_cyc_nl_generation_properties", "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "synch_format", "SYNCH-FORMAT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "with_opencyc_inference_pph_memoization", "WITH-OPENCYC-INFERENCE-PPH-MEMOIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_problem_store_ids_for_client", "GET-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "register_problem_store_id_for_client", "REGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "deregister_problem_store_id_for_client", "DEREGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "deregister_all_problem_store_ids_for_client", "DEREGISTER-ALL-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_handle_new_inference_event", "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_suspend_reason", "INFERENCE-SUSPEND-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_start_continuable_query", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_start_continuable_query_internal", "OPEN-CYC-START-CONTINUABLE-QUERY-INTERNAL", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_release_inference_resources_for_client", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_get_binding_for_variable", "OPEN-CYC-GET-BINDING-FOR-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_get_answer_bindings", "OPEN-CYC-GET-ANSWER-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_continue_query", "OPEN-CYC-CONTINUE-QUERY", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_continue_query_guts", "OPEN-CYC-CONTINUE-QUERY-GUTS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_inference_parameter_information", "GET-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_initialize_inference", "OPEN-CYC-INITIALIZE-INFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_release_inference_resources", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "open_cyc_continue_query_internal", "OPEN-CYC-CONTINUE-QUERY-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_information_for_inference_parameter", "GET-INFORMATION-FOR-INFERENCE-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_inference_parameter_value_info", "GET-INFERENCE-PARAMETER-VALUE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_boolean_inference_parameter_information", "GET-BOOLEAN-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_integer_inference_parameter_information", "GET-INTEGER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_real_number_inference_parameter_information", "GET-REAL-NUMBER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_enumeration_inference_parameter_information", "GET-ENUMERATION-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "get_other_inference_parameter_information", "GET-OTHER-INFERENCE-PARAMETER-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "advanced_inference_parameter_p", "ADVANCED-INFERENCE-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "basic_inference_parameter_p", "BASIC-INFERENCE-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_name", "INFERENCE-PARAMETER-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_short_description", "INFERENCE-PARAMETER-SHORT-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_long_description", "INFERENCE-PARAMETER-LONG-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_value_subl_identifier", "INFERENCE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_default_value", "INFERENCE-PARAMETER-DEFAULT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_alternate_value", "INFERENCE-PARAMETER-ALTERNATE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "enumeration_inference_parameter_potential_values", "ENUMERATION-INFERENCE-PARAMETER-POTENTIAL-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "integer_inference_parameter_min_value", "INTEGER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "integer_inference_parameter_max_value", "INTEGER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "real_number_inference_parameter_min_value", "REAL-NUMBER-INFERENCE-PARAMETER-MIN-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "real_number_inference_parameter_max_value", "REAL-NUMBER-INFERENCE-PARAMETER-MAX-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_value_short_description", "INFERENCE-PARAMETER-VALUE-SHORT-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_value_long_description", "INFERENCE-PARAMETER-VALUE-LONG-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_has_valid_information_p", "INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "inference_parameter_has_valid_basic_information_p", "INFERENCE-PARAMETER-HAS-VALID-BASIC-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "enumeration_inference_parameter_has_valid_information_p", "ENUMERATION-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "other_inference_parameter_has_valid_information_p", "OTHER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "boolean_inference_parameter_has_valid_information_p", "BOOLEAN-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "integer_inference_parameter_has_valid_information_p", "INTEGER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "real_number_inference_parameter_has_valid_information_p", "REAL-NUMBER-INFERENCE-PARAMETER-HAS-VALID-INFORMATION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "valid_enumeration_inference_parameter_values_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_inference_api", "valid_enumeration_inference_parameter_value_p", "VALID-ENUMERATION-INFERENCE-PARAMETER-VALUE-P", 1, 0, false);
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    public static SubLObject init_open_cyc_inference_api_file() {
        open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$ = SubLFiles.defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", (SubLObject)open_cyc_inference_api.T);
        open_cyc_inference_api.$open_cyc_minimum_time_before_sending_new_answers$ = SubLFiles.defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time((SubLObject)open_cyc_inference_api.ONE_INTEGER));
        open_cyc_inference_api.$default_open_cyc_nl_generation_properties$ = SubLFiles.defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", (SubLObject)open_cyc_inference_api.NIL);
        open_cyc_inference_api.$inference_to_ipc_queue_map$ = SubLFiles.deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", maybeDefault((SubLObject)open_cyc_inference_api.$sym7$_INFERENCE_TO_IPC_QUEUE_MAP_, open_cyc_inference_api.$inference_to_ipc_queue_map$, ()->(dictionary_utilities.new_synchronized_dictionary((SubLObject)open_cyc_inference_api.UNPROVIDED, (SubLObject)open_cyc_inference_api.UNPROVIDED))));
        open_cyc_inference_api.$opencyc_inference_output$ = SubLFiles.deflexical("*OPENCYC-INFERENCE-OUTPUT*", maybeDefault((SubLObject)open_cyc_inference_api.$sym8$_OPENCYC_INFERENCE_OUTPUT_, open_cyc_inference_api.$opencyc_inference_output$, ()->(StreamsLow.$standard_output$.getDynamicValue())));
        open_cyc_inference_api.$synch_format_lock$ = SubLFiles.deflexical("*SYNCH-FORMAT-LOCK*", maybeDefault((SubLObject)open_cyc_inference_api.$sym9$_SYNCH_FORMAT_LOCK_, open_cyc_inference_api.$synch_format_lock$, ()->(Locks.make_lock((SubLObject)open_cyc_inference_api.$str10$_synch_format_lock_))));
        open_cyc_inference_api.$client_to_problem_stores_map$ = SubLFiles.deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", maybeDefault((SubLObject)open_cyc_inference_api.$sym19$_CLIENT_TO_PROBLEM_STORES_MAP_, open_cyc_inference_api.$client_to_problem_stores_map$, ()->(dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)open_cyc_inference_api.EQUAL), (SubLObject)open_cyc_inference_api.UNPROVIDED))));
        return (SubLObject)open_cyc_inference_api.NIL;
    }
    
    public static SubLObject setup_open_cyc_inference_api_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)open_cyc_inference_api.$sym7$_INFERENCE_TO_IPC_QUEUE_MAP_);
        subl_macro_promotions.declare_defglobal((SubLObject)open_cyc_inference_api.$sym8$_OPENCYC_INFERENCE_OUTPUT_);
        subl_macro_promotions.declare_defglobal((SubLObject)open_cyc_inference_api.$sym9$_SYNCH_FORMAT_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)open_cyc_inference_api.$sym19$_CLIENT_TO_PROBLEM_STORES_MAP_);
        utilities_macros.register_cyc_api_function((SubLObject)open_cyc_inference_api.$sym28$OPEN_CYC_START_CONTINUABLE_QUERY, (SubLObject)open_cyc_inference_api.$list29, (SubLObject)open_cyc_inference_api.$str30$Starts_a_continuable_inference_as, (SubLObject)open_cyc_inference_api.$list31, (SubLObject)open_cyc_inference_api.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)open_cyc_inference_api.$sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, (SubLObject)open_cyc_inference_api.$list40, (SubLObject)open_cyc_inference_api.$str41$Releases_all_inference_resources_, (SubLObject)open_cyc_inference_api.$list42, (SubLObject)open_cyc_inference_api.NIL);
        access_macros.register_external_symbol((SubLObject)open_cyc_inference_api.$sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE);
        access_macros.register_external_symbol((SubLObject)open_cyc_inference_api.$sym44$OPEN_CYC_GET_ANSWER_BINDINGS);
        utilities_macros.register_cyc_api_function((SubLObject)open_cyc_inference_api.$sym47$OPEN_CYC_CONTINUE_QUERY, (SubLObject)open_cyc_inference_api.$list48, (SubLObject)open_cyc_inference_api.$str49$Continues_an_existing_continuable, (SubLObject)open_cyc_inference_api.$list50, (SubLObject)open_cyc_inference_api.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)open_cyc_inference_api.$sym55$GET_INFERENCE_PARAMETER_INFORMATION, (SubLObject)open_cyc_inference_api.NIL, (SubLObject)open_cyc_inference_api.$str56$Returns_a_property_list_of_infere, (SubLObject)open_cyc_inference_api.NIL, (SubLObject)open_cyc_inference_api.$list57);
        return (SubLObject)open_cyc_inference_api.NIL;
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
        me = (SubLFile)new open_cyc_inference_api();
        open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$ = null;
        open_cyc_inference_api.$open_cyc_minimum_time_before_sending_new_answers$ = null;
        open_cyc_inference_api.$default_open_cyc_nl_generation_properties$ = null;
        open_cyc_inference_api.$inference_to_ipc_queue_map$ = null;
        open_cyc_inference_api.$opencyc_inference_output$ = null;
        open_cyc_inference_api.$synch_format_lock$ = null;
        open_cyc_inference_api.$client_to_problem_stores_map$ = null;
        $kw0$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $kw1$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw2$FORCE = SubLObjectFactory.makeKeyword("FORCE");
        $kw3$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw4$LANGUAGE_MT = SubLObjectFactory.makeKeyword("LANGUAGE-MT");
        $kw5$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("HTML"));
        $sym7$_INFERENCE_TO_IPC_QUEUE_MAP_ = SubLObjectFactory.makeSymbol("*INFERENCE-TO-IPC-QUEUE-MAP*");
        $sym8$_OPENCYC_INFERENCE_OUTPUT_ = SubLObjectFactory.makeSymbol("*OPENCYC-INFERENCE-OUTPUT*");
        $sym9$_SYNCH_FORMAT_LOCK_ = SubLObjectFactory.makeSymbol("*SYNCH-FORMAT-LOCK*");
        $str10$_synch_format_lock_ = SubLObjectFactory.makeString("*synch-format-lock*");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-CONTROL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-ARGUMENTS"));
        $sym12$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SYNCH-FORMAT-LOCK*"));
        $sym14$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("*OPENCYC-INFERENCE-OUTPUT*")));
        $kw16$CYC_PPH = SubLObjectFactory.makeKeyword("CYC-PPH");
        $sym17$WITH_PPH_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION");
        $sym18$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym19$_CLIENT_TO_PROBLEM_STORES_MAP_ = SubLObjectFactory.makeSymbol("*CLIENT-TO-PROBLEM-STORES-MAP*");
        $kw20$NEW_ANSWER = SubLObjectFactory.makeKeyword("NEW-ANSWER");
        $kw21$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $kw22$STATUS_CHANGE = SubLObjectFactory.makeKeyword("STATUS-CHANGE");
        $kw23$DEAD = SubLObjectFactory.makeKeyword("DEAD");
        $sym24$OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT = SubLObjectFactory.makeSymbol("OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT");
        $sym25$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym26$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $sym27$QUERY_PROPERTIES_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P");
        $sym28$OPEN_CYC_START_CONTINUABLE_QUERY = SubLObjectFactory.makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-GENERATION-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENTAL-RESULTS?"), (SubLObject)SubLObjectFactory.makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-QUERY-SENTENCE-VARIABLES?"), (SubLObject)open_cyc_inference_api.T));
        $str30$Starts_a_continuable_inference_as = SubLObjectFactory.makeString("Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P")));
        $kw32$EVENTS = SubLObjectFactory.makeKeyword("EVENTS");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS-CHANGE"));
        $kw34$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $str35$Inference_Communication_Queue = SubLObjectFactory.makeString("Inference Communication Queue");
        $kw36$INFERENCE_START = SubLObjectFactory.makeKeyword("INFERENCE-START");
        $str37$Problem_store_ID___A___Inference_ = SubLObjectFactory.makeString("Problem store ID: ~A ~%Inference ID: ~A~%");
        $sym38$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym39$OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT = SubLObjectFactory.makeSymbol("OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CURRENT-TASK-PROCESSOR-CLIENT"))));
        $str41$Releases_all_inference_resources_ = SubLObjectFactory.makeString("Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $sym43$OPEN_CYC_GET_BINDING_FOR_VARIABLE = SubLObjectFactory.makeSymbol("OPEN-CYC-GET-BINDING-FOR-VARIABLE");
        $sym44$OPEN_CYC_GET_ANSWER_BINDINGS = SubLObjectFactory.makeSymbol("OPEN-CYC-GET-ANSWER-BINDINGS");
        $sym45$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym46$GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P");
        $sym47$OPEN_CYC_CONTINUE_QUERY = SubLObjectFactory.makeSymbol("OPEN-CYC-CONTINUE-QUERY");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-GENERATION-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENTAL-RESULTS?"), (SubLObject)SubLObjectFactory.makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")));
        $str49$Continues_an_existing_continuable = SubLObjectFactory.makeString("Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-GENERATION-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P")));
        $str51$Inference__A_is_already_running__ = SubLObjectFactory.makeString("Inference ~A is already running!~%");
        $str52$Cannot_ask_query__Invalid_inferen = SubLObjectFactory.makeString("Cannot ask query. Invalid inference-status: ~A~%");
        $const53$CycAPIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER-INFERENCE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("OTHER-INFERENCE-PARAMETERS"));
        $sym55$GET_INFERENCE_PARAMETER_INFORMATION = SubLObjectFactory.makeSymbol("GET-INFERENCE-PARAMETER-INFORMATION");
        $str56$Returns_a_property_list_of_infere = SubLObjectFactory.makeString("Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-LIST-P"));
        $sym58$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str59$Query_thread_ = SubLObjectFactory.makeString("Query thread ");
        $sym60$CONTINUE_INFERENCE = SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE");
        $kw61$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw62$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym63$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("BASIC?"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY-STATIC?"), (SubLObject)SubLObjectFactory.makeKeyword("SHORT-DESC"), (SubLObject)SubLObjectFactory.makeKeyword("LONG-DESC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ALTERNATE-VALUE"));
        $kw65$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw66$SHORT_DESC = SubLObjectFactory.makeKeyword("SHORT-DESC");
        $kw67$LONG_DESC = SubLObjectFactory.makeKeyword("LONG-DESC");
        $const68$BooleanInferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BooleanInferenceParameter"));
        $const69$IntegerInferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntegerInferenceParameter"));
        $kw70$MIN_VALUE = SubLObjectFactory.makeKeyword("MIN-VALUE");
        $kw71$MAX_VALUE = SubLObjectFactory.makeKeyword("MAX-VALUE");
        $const72$RealNumberInferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RealNumberInferenceParameter"));
        $const73$EnumerationInferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnumerationInferenceParameter"));
        $kw74$POTENTIAL_VALUES = SubLObjectFactory.makeKeyword("POTENTIAL-VALUES");
        $const75$InferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceParameter"));
        $const76$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const77$InferenceSupportedTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceSupportedTerm"));
        $kw78$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw79$BASIC_ = SubLObjectFactory.makeKeyword("BASIC?");
        $const80$AdvancedInferenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdvancedInferenceParameter"));
        $const81$subLIdentifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $kw82$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const83$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $const84$CycInferenceEngine = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycInferenceEngine"));
        $const85$NonNegativeInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeInteger"));
        $const86$IntegerFromToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntegerFromToFn"));
        $kw87$INTEGER_PLUS_INFINITY = SubLObjectFactory.makeKeyword("INTEGER-PLUS-INFINITY");
        $const88$Real0_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Real0-1"));
        $float89$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $float90$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw91$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw92$QUERY_STATIC_ = SubLObjectFactory.makeKeyword("QUERY-STATIC?");
        $kw93$DEFAULT_VALUE = SubLObjectFactory.makeKeyword("DEFAULT-VALUE");
        $kw94$NO_VALUE_SPECIFIED = SubLObjectFactory.makeKeyword("NO-VALUE-SPECIFIED");
        $kw95$ALTERNATE_VALUE = SubLObjectFactory.makeKeyword("ALTERNATE-VALUE");
    }
}

/*

	Total time: 374 ms
	
*/