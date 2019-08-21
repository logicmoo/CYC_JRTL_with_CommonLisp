/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_denotational_term_p;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_arg1;
import static com.cyc.cycjava.cycl.dictionary_utilities.new_synchronized_dictionary;
import static com.cyc.cycjava.cycl.dictionary_utilities.synchronized_dictionary_delete_from_value;
import static com.cyc.cycjava.cycl.dictionary_utilities.synchronized_dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary_utilities.synchronized_dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary_utilities.synchronized_dictionary_push;
import static com.cyc.cycjava.cycl.dictionary_utilities.synchronized_dictionary_remove;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.el_extensional_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.hlmt_czer.coerce_to_hlmt;
import static com.cyc.cycjava.cycl.isa.all_fort_instances;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.isa.min_isa;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.fpred_value_in_mt;
import static com.cyc.cycjava.cycl.kb_mapping_utilities.pred_u_v_holds_in_any_mt;
import static com.cyc.cycjava.cycl.list_utilities.make_plist;
import static com.cyc.cycjava.cycl.list_utilities.nmerge_plist;
import static com.cyc.cycjava.cycl.list_utilities.non_empty_list_p;
import static com.cyc.cycjava.cycl.list_utilities.only_one;
import static com.cyc.cycjava.cycl.list_utilities.plist_has_keyP;
import static com.cyc.cycjava.cycl.list_utilities.plist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.clear_all_memoization;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_p;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.nart_handles.nart_p;
import static com.cyc.cycjava.cycl.numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_alternate_value;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_default_value;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_long_description;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_short_description;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_value_domain_in_software_object;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_value_long_description;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_value_short_description;
import static com.cyc.cycjava.cycl.parameter_specification_utilities.software_parameter_value_subl_identifier;
import static com.cyc.cycjava.cycl.pph_macros.$free_pph_problem_store_pointers$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_external_memoization_state$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_memoization_state$;
import static com.cyc.cycjava.cycl.pph_macros.$pph_problem_store_pointer$;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_external_memoization_state;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_memoization_state;
import static com.cyc.cycjava.cycl.pph_macros.find_or_create_pph_problem_store_pointer;
import static com.cyc.cycjava.cycl.pph_macros.free_pph_problem_store_pointer;
import static com.cyc.cycjava.cycl.pph_utilities.keyword_or_nil_p;
import static com.cyc.cycjava.cycl.pph_vars.$pph_domain_mt$;
import static com.cyc.cycjava.cycl.pph_vars.$pph_language_mt$;
import static com.cyc.cycjava.cycl.process_utilities.ipc_enqueue;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.task_processor.get_current_task_processor_client;
import static com.cyc.cycjava.cycl.task_processor.post_task_info_processor_partial_results;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
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

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.classes;
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
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.cycjava.cycl.sunit_macros;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OPEN-CYC-INFERENCE-API
 * source file: /cyc/top/cycl/inference/open-cyc-inference-api.lisp
 * created:     2019/07/03 17:37:56
 */
public final class open_cyc_inference_api extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject open_cyc_start_continuable_query_test_case_p(SubLObject open_cyc_start_continuable_query_test_case) {
        return classes.subloop_instanceof_class(open_cyc_start_continuable_query_test_case, OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE);
    }

    public static final SubLFile me = new open_cyc_inference_api();



    // defparameter
    // Definitions
    // whether these api functions are called externally (i.e. outside SubL)
    /**
     * whether these api functions are called externally (i.e. outside SubL)
     */
    @LispMethod(comment = "whether these api functions are called externally (i.e. outside SubL)\ndefparameter")
    private static final SubLSymbol $use_api_task_processor_incremental_resultsP$ = makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*");

    // defparameter
    // the minimum time to wait before sending clients new inference answers.
    /**
     * the minimum time to wait before sending clients new inference answers.
     */
    @LispMethod(comment = "the minimum time to wait before sending clients new inference answers.\ndefparameter")
    private static final SubLSymbol $open_cyc_minimum_time_before_sending_new_answers$ = makeSymbol("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*");

    // defvar
    /**
     * The default properties for NL generation that will be used by the functions
     * in this file unless otherwise specified by the caller.
     */
    @LispMethod(comment = "The default properties for NL generation that will be used by the functions\r\nin this file unless otherwise specified by the caller.\ndefvar\nThe default properties for NL generation that will be used by the functions\nin this file unless otherwise specified by the caller.")
    public static final SubLSymbol $default_open_cyc_nl_generation_properties$ = makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*");

    static private final SubLList $list6 = list($MODE, $HTML);

    public static final SubLSymbol $inference_to_ipc_queue_map$ = makeSymbol("*INFERENCE-TO-IPC-QUEUE-MAP*");

    public static final SubLSymbol $opencyc_inference_output$ = makeSymbol("*OPENCYC-INFERENCE-OUTPUT*");

    public static final SubLSymbol $synch_format_lock$ = makeSymbol("*SYNCH-FORMAT-LOCK*");

    static private final SubLString $str10$_synch_format_lock_ = makeString("*synch-format-lock*");

    static private final SubLList $list11 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

    static private final SubLList $list13 = list(makeSymbol("*SYNCH-FORMAT-LOCK*"));

    static private final SubLList $list15 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*OPENCYC-INFERENCE-OUTPUT*")));

    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");

    private static final SubLSymbol $client_to_problem_stores_map$ = makeSymbol("*CLIENT-TO-PROBLEM-STORES-MAP*");

    private static final SubLSymbol OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT = makeSymbol("OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT");

    private static final SubLSymbol OPEN_CYC_START_CONTINUABLE_QUERY = makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY");

    private static final SubLList $list29 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")), list(makeSymbol("OPTIMIZE-QUERY-SENTENCE-VARIABLES?"), T));

    private static final SubLString $str30$Starts_a_continuable_inference_as = makeString("Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");

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

    private static final SubLString $str49$Continues_an_existing_continuable = makeString("Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");

    private static final SubLList $list50 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P")));

    private static final SubLString $str51$Inference__A_is_already_running__ = makeString("Inference ~A is already running!~%");

    private static final SubLString $str52$Cannot_ask_query__Invalid_inferen = makeString("Cannot ask query. Invalid inference-status: ~A~%");



    private static final SubLList $list54 = list(makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), makeKeyword("INTEGER-INFERENCE-PARAMETERS"), makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), makeKeyword("OTHER-INFERENCE-PARAMETERS"));

    private static final SubLSymbol GET_INFERENCE_PARAMETER_INFORMATION = makeSymbol("GET-INFERENCE-PARAMETER-INFORMATION");

    private static final SubLString $str56$Returns_a_property_list_of_infere = makeString("Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");

    private static final SubLList $list57 = list(makeSymbol("PROPERTY-LIST-P"));

    private static final SubLString $$$Query_thread_ = makeString("Query thread ");

    private static final SubLSymbol CONTINUE_INFERENCE = makeSymbol("CONTINUE-INFERENCE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list64 = list($NAME, makeKeyword("BASIC?"), makeKeyword("QUERY-STATIC?"), makeKeyword("SHORT-DESC"), makeKeyword("LONG-DESC"), makeKeyword("DEFAULT-VALUE"), makeKeyword("ALTERNATE-VALUE"));



























    private static final SubLSymbol $INTEGER_PLUS_INFINITY = makeKeyword("INTEGER-PLUS-INFINITY");

    private static final SubLObject $$Real0_1 = reader_make_constant_shell("Real0-1");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLSymbol $kw92$QUERY_STATIC_ = makeKeyword("QUERY-STATIC?");

    private static final SubLSymbol $NO_VALUE_SPECIFIED = makeKeyword("NO-VALUE-SPECIFIED");

    public static final SubLObject initialize_open_cyc_inference_api_vars_alt() {
        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.initialize_default_open_cyc_nl_generation_properties();
    }

    public static SubLObject initialize_open_cyc_inference_api_vars() {
        return open_cyc_inference_api.initialize_default_open_cyc_nl_generation_properties();
    }

    public static final SubLObject initialize_default_open_cyc_nl_generation_properties_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $default_open_cyc_nl_generation_properties$.setDynamicValue(listS($NL_PREDS, new SubLObject[]{ $DEFAULT, $FORCE, $NONE, $LANGUAGE_MT, pph_vars.$pph_language_mt$.getDynamicValue(thread), $DOMAIN_MT, pph_vars.$pph_domain_mt$.getDynamicValue(thread), $list_alt6 }), thread);
            return $default_open_cyc_nl_generation_properties$.getDynamicValue(thread);
        }
    }

    public static SubLObject initialize_default_open_cyc_nl_generation_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.setDynamicValue(listS($NL_PREDS, new SubLObject[]{ $DEFAULT, $FORCE, $NONE, $LANGUAGE_MT, $pph_language_mt$.getDynamicValue(thread), $DOMAIN_MT, $pph_domain_mt$.getDynamicValue(thread), open_cyc_inference_api.$list6 }), thread);
        return open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue(thread);
    }

    public static final SubLObject synch_format_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_control = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            format_control = current.first();
            current = current.rest();
            {
                SubLObject format_arguments = current;
                return listS(WITH_LOCK_HELD, $list_alt13, listS(FORMAT, $opencyc_inference_output$, format_control, append(format_arguments, NIL)), $list_alt15);
            }
        }
    }

    public static SubLObject synch_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_control = NIL;
        destructuring_bind_must_consp(current, datum, open_cyc_inference_api.$list11);
        format_control = current.first();
        final SubLObject format_arguments;
        current = format_arguments = current.rest();
        return listS(WITH_LOCK_HELD, open_cyc_inference_api.$list13, listS(FORMAT, open_cyc_inference_api.$opencyc_inference_output$, format_control, append(format_arguments, NIL)), open_cyc_inference_api.$list15);
    }

    public static SubLObject with_opencyc_inference_pph_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($CYC_PPH, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bq_cons(open_cyc_inference_api.WITH_PPH_MEMOIZATION, append(body, NIL));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static final SubLObject get_problem_store_ids_for_client_alt(SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_lookup($client_to_problem_stores_map$.getGlobalValue(), client, UNPROVIDED);
    }

    public static SubLObject get_problem_store_ids_for_client(final SubLObject client) {
        return synchronized_dictionary_lookup(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, UNPROVIDED);
    }

    public static final SubLObject register_problem_store_id_for_client_alt(SubLObject client, SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_push($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id);
    }

    public static SubLObject register_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
        return synchronized_dictionary_push(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id);
    }

    public static final SubLObject deregister_problem_store_id_for_client_alt(SubLObject client, SubLObject problem_store_id) {
        return dictionary_utilities.synchronized_dictionary_delete_from_value($client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject deregister_problem_store_id_for_client(final SubLObject client, final SubLObject problem_store_id) {
        return synchronized_dictionary_delete_from_value(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client, problem_store_id, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject deregister_all_problem_store_ids_for_client_alt(SubLObject client) {
        return dictionary_utilities.synchronized_dictionary_remove($client_to_problem_stores_map$.getGlobalValue(), client);
    }

    public static SubLObject deregister_all_problem_store_ids_for_client(final SubLObject client) {
        return synchronized_dictionary_remove(open_cyc_inference_api.$client_to_problem_stores_map$.getGlobalValue(), client);
    }

    public static final SubLObject open_cyc_handle_new_inference_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject datum) {
        {
            SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
            SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, NIL);
            if (datum.isInteger()) {
                process_utilities.ipc_enqueue($NEW_ANSWER, ipc_queue);
            } else {
                if (datum == $SUSPENDED) {
                    process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_suspend_reason(inference)), ipc_queue);
                } else {
                    process_utilities.ipc_enqueue(list($STATUS_CHANGE, datum, NIL), ipc_queue);
                    if (datum == $DEAD) {
                        dictionary_utilities.synchronized_dictionary_remove($inference_to_ipc_queue_map$.getGlobalValue(), inference);
                        inference_event_filters.deregister_handler_for_inference_event(problem_store_id, inference_id, OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
                        com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_release_inference_resources(problem_store_id, inference_id);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject open_cyc_handle_new_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject datum) {
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject ipc_queue = synchronized_dictionary_lookup(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, NIL);
        if (datum.isInteger()) {
            ipc_enqueue($NEW_ANSWER, ipc_queue, UNPROVIDED);
        } else
            if (datum == $SUSPENDED) {
                ipc_enqueue(list($STATUS_CHANGE, datum, open_cyc_inference_api.inference_suspend_reason(inference)), ipc_queue, UNPROVIDED);
            } else {
                ipc_enqueue(list($STATUS_CHANGE, datum, NIL), ipc_queue, UNPROVIDED);
                if (datum == $DEAD) {
                    synchronized_dictionary_remove(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference);
                    inference_event_filters.deregister_handler_for_inference_event(problem_store_id, inference_id, open_cyc_inference_api.OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
                    open_cyc_inference_api.open_cyc_release_inference_resources(problem_store_id, inference_id);
                }
            }

        return NIL;
    }

    public static final SubLObject inference_suspend_reason_alt(SubLObject inference) {
        return NIL != inference_datastructures_inference.suspended_inference_p(inference) ? ((SubLObject) (inference_datastructures_inference.inference_suspend_status(inference))) : NIL;
    }

    public static SubLObject inference_suspend_reason(final SubLObject inference) {
        return NIL != inference_datastructures_inference.suspended_inference_p(inference) ? inference_datastructures_inference.inference_suspend_status(inference) : NIL;
    }

    /**
     * Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT.
     * This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.
     *
     * INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.
     * NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.
     * INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     * If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.
     *
     * @return Partial result 1: (:INFERENCE-START problem-store-id inference-id)
    Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
    Destroy problem store and inference
     */
    @LispMethod(comment = "Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT.\r\nThis function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.\r\n\r\nINFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.\r\nNL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.\r\nINCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\nIf OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\r\n\r\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\r\nPartial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)\r\nDestroy problem store and inference\nStarts a continuable inference asking the query defined by SENTENCE in the microtheory MT.\nThis function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.\n\nINFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.\nNL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.\nINCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\nIf OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.")
    public static final SubLObject open_cyc_start_continuable_query_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
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
        SubLTrampolineFile.checkType(sentence, EL_FORMULA_P);
        SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
        SubLTrampolineFile.checkType(v_properties, QUERY_PROPERTIES_P);
        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_start_continuable_query_internal(sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP);
    }

    /**
     * Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT.
     * This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.
     *
     * INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.
     * NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.
     * INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     * If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.
     *
     * @return Partial result 1: (:INFERENCE-START problem-store-id inference-id)
    Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
    Destroy problem store and inference
     */
    @LispMethod(comment = "Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT.\r\nThis function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.\r\n\r\nINFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.\r\nNL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.\r\nINCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\nIf OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\r\n\r\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\r\nPartial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)\r\nDestroy problem store and inference\nStarts a continuable inference asking the query defined by SENTENCE in the microtheory MT.\nThis function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available.\n\nINFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing.\nNL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation.\nINCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\nIf OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.")
    public static SubLObject open_cyc_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (nl_generation_properties == UNPROVIDED) {
            nl_generation_properties = open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == UNPROVIDED) {
            inference_answer_process_function = NIL;
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        if (optimize_query_sentence_variablesP == UNPROVIDED) {
            optimize_query_sentence_variablesP = T;
        }
        SubLTrampolineFile.enforceType(sentence, EL_FORMULA_P);
        SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        SubLTrampolineFile.enforceType(v_properties, QUERY_PROPERTIES_P);
        return open_cyc_inference_api.open_cyc_start_continuable_query_internal(sentence, mt, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP, optimize_query_sentence_variablesP);
    }

    public static final SubLObject open_cyc_start_continuable_query_internal_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP, SubLObject optimize_query_sentence_variablesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            mt = hlmt_czer.coerce_to_hlmt(mt);
            v_properties = putf(v_properties, $EVENTS, $list_alt30);
            {
                SubLObject optimized_sentence = (NIL != optimize_query_sentence_variablesP) ? ((SubLObject) (optimize_el_formula_variable_names(sentence, UNPROVIDED, UNPROVIDED))) : sentence;
                SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(optimized_sentence);
                SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), list($kw31$CONDITIONAL_SENTENCE_, conditionalP));
                SubLObject ipc_queue = process_utilities.new_ipc_queue($$$Inference_Communication_Queue);
                thread.resetMultipleValues();
                {
                    SubLObject inference = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_initialize_inference(optimized_sentence, mt, static_properties);
                    SubLObject problem_store_id = thread.secondMultipleValue();
                    SubLObject inference_id = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    dictionary_utilities.synchronized_dictionary_enter($inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue);
                    inference_event_filters.register_handler_for_all_inference_events(inference, OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
                    if (NIL != incremental_resultsP) {
                        task_processor.post_task_info_processor_partial_results(list($INFERENCE_START, problem_store_id, inference_id));
                    } else {
                        format(T, $str_alt34$Problem_store_ID___A___Inference_, problem_store_id, inference_id);
                    }
                    return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
                }
            }
        }
    }

    public static SubLObject open_cyc_start_continuable_query_internal(final SubLObject sentence, SubLObject mt, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP, final SubLObject optimize_query_sentence_variablesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = coerce_to_hlmt(mt);
        v_properties = putf(v_properties, $EVENTS, open_cyc_inference_api.$list33);
        final SubLObject optimized_sentence = (NIL != optimize_query_sentence_variablesP) ? optimize_el_formula_variable_names(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentence;
        final SubLObject conditionalP = (NIL != plist_has_keyP(v_properties, open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_)) ? plist_lookup(v_properties, open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_, UNPROVIDED) : inference_strategist.inference_conditional_sentence_p(cycl_utilities.hl_to_el(optimized_sentence));
        final SubLObject static_properties = nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), list(open_cyc_inference_api.$kw34$CONDITIONAL_SENTENCE_, conditionalP));
        final SubLObject ipc_queue = process_utilities.new_ipc_queue(open_cyc_inference_api.$$$Inference_Communication_Queue);
        thread.resetMultipleValues();
        final SubLObject inference = open_cyc_inference_api.open_cyc_initialize_inference(optimized_sentence, mt, static_properties);
        final SubLObject problem_store_id = thread.secondMultipleValue();
        final SubLObject inference_id = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        synchronized_dictionary_enter(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, ipc_queue);
        inference_event_filters.register_handler_for_all_inference_events(inference, open_cyc_inference_api.OPEN_CYC_HANDLE_NEW_INFERENCE_EVENT);
        if (NIL != incremental_resultsP) {
            post_task_info_processor_partial_results(list($INFERENCE_START, problem_store_id, inference_id));
        } else {
            format(T, open_cyc_inference_api.$str37$Problem_store_ID___A___Inference_, problem_store_id, inference_id);
        }
        return open_cyc_inference_api.open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }

    /**
     * Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).
     */
    @LispMethod(comment = "Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).")
    public static final SubLObject open_cyc_release_inference_resources_for_client_alt(SubLObject client) {
        if (client == UNPROVIDED) {
            client = task_processor.get_current_task_processor_client();
        }
        SubLTrampolineFile.checkType(client, STRINGP);
        {
            SubLObject problem_store_ids = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_problem_store_ids_for_client(client);
            SubLObject cdolist_list_var = problem_store_ids;
            SubLObject problem_store_id = NIL;
            for (problem_store_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem_store_id = cdolist_list_var.first()) {
                inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id));
            }
            com.cyc.cycjava.cycl.inference.open_cyc_inference_api.deregister_all_problem_store_ids_for_client(client);
        }
        return NIL;
    }

    /**
     * Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).
     */
    @LispMethod(comment = "Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).")
    public static SubLObject open_cyc_release_inference_resources_for_client(SubLObject client) {
        if (client == UNPROVIDED) {
            client = get_current_task_processor_client();
        }
        SubLTrampolineFile.enforceType(client, STRINGP);
        SubLObject cdolist_list_var;
        final SubLObject problem_store_ids = cdolist_list_var = open_cyc_inference_api.get_problem_store_ids_for_client(client);
        SubLObject problem_store_id = NIL;
        problem_store_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id));
            cdolist_list_var = cdolist_list_var.rest();
            problem_store_id = cdolist_list_var.first();
        } 
        open_cyc_inference_api.deregister_all_problem_store_ids_for_client(client);
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

    /**
     * Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     *
     * @return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
     */
    @LispMethod(comment = "Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\n\r\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)")
    public static final SubLObject open_cyc_continue_query_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        if (nl_generation_properties == UNPROVIDED) {
            nl_generation_properties = $default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == UNPROVIDED) {
            inference_answer_process_function = NIL;
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = $use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(problem_store_id, INTEGERP);
        SubLTrampolineFile.checkType(inference_id, INTEGERP);
        SubLTrampolineFile.checkType(v_properties, QUERY_PROPERTIES_P);
        SubLTrampolineFile.checkType(nl_generation_properties, GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P);
        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }

    /**
     * Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     *
     * @return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
     */
    @LispMethod(comment = "Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\n\r\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)")
    public static SubLObject open_cyc_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        if (nl_generation_properties == UNPROVIDED) {
            nl_generation_properties = open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue();
        }
        if (inference_answer_process_function == UNPROVIDED) {
            inference_answer_process_function = NIL;
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = open_cyc_inference_api.$use_api_task_processor_incremental_resultsP$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        SubLTrampolineFile.enforceType(v_properties, QUERY_PROPERTIES_P);
        SubLTrampolineFile.enforceType(nl_generation_properties, open_cyc_inference_api.GENERATE_PHRASE_FOR_JAVA_PROPERTY_LIST_P);
        return open_cyc_inference_api.open_cyc_continue_query_guts(problem_store_id, inference_id, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
    }

    public static final SubLObject open_cyc_continue_query_guts_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        v_properties = putf(v_properties, $EVENTS, $list_alt30);
        {
            SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
            if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                Errors.error($str_alt46$Inference__A_is_already_running__, inference);
            } else {
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.open_cyc_continue_query_internal(inference, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
                } else {
                    Errors.error($str_alt47$Cannot_ask_query__Invalid_inferen, inference_datastructures_inference.inference_status(inference));
                }
            }
        }
        return NIL;
    }

    public static SubLObject open_cyc_continue_query_guts(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject v_properties, final SubLObject nl_generation_properties, final SubLObject inference_answer_process_function, final SubLObject incremental_resultsP) {
        v_properties = putf(v_properties, $EVENTS, open_cyc_inference_api.$list33);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            Errors.error(open_cyc_inference_api.$str51$Inference__A_is_already_running__, inference);
        } else {
            if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                return open_cyc_inference_api.open_cyc_continue_query_internal(inference, v_properties, nl_generation_properties, inference_answer_process_function, incremental_resultsP);
            }
            Errors.error(open_cyc_inference_api.$str52$Cannot_ask_query__Invalid_inferen, inference_datastructures_inference.inference_status(inference));
        }
        return NIL;
    }

    /**
     * Returns a property list of inference parameters
     * where keys are the value domain types (e.g. :boolean-inference-parameters,
     * :integer-inference-parameters, etc.) and values
     * are lists of inference parameters that take values
     * of that type. Each such value is a property list itself
     * where keys are inference parameters and values are
     * property lists that contain property/value pairs
     * appropriate for the parameter at hand according to
     * its value domain type.
     */
    @LispMethod(comment = "Returns a property list of inference parameters\r\nwhere keys are the value domain types (e.g. :boolean-inference-parameters,\r\n:integer-inference-parameters, etc.) and values\r\nare lists of inference parameters that take values\r\nof that type. Each such value is a property list itself\r\nwhere keys are inference parameters and values are\r\nproperty lists that contain property/value pairs\r\nappropriate for the parameter at hand according to\r\nits value domain type.\nReturns a property list of inference parameters\nwhere keys are the value domain types (e.g. :boolean-inference-parameters,\n:integer-inference-parameters, etc.) and values\nare lists of inference parameters that take values\nof that type. Each such value is a property list itself\nwhere keys are inference parameters and values are\nproperty lists that contain property/value pairs\nappropriate for the parameter at hand according to\nits value domain type.")
    public static final SubLObject get_inference_parameter_information_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$CycAPIMt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject boolean_inference_parameters = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_boolean_inference_parameter_information();
                            SubLObject integer_inference_parameters = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_integer_inference_parameter_information();
                            SubLObject real_number_inference_parameters = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_real_number_inference_parameter_information();
                            SubLObject enumeration_inference_parameters = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_enumeration_inference_parameter_information();
                            SubLObject other_inference_parameters = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_other_inference_parameter_information();
                            result = list_utilities.make_plist($list_alt49, list(boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters, other_inference_parameters));
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns a property list of inference parameters
     * where keys are the value domain types (e.g. :boolean-inference-parameters,
     * :integer-inference-parameters, etc.) and values
     * are lists of inference parameters that take values
     * of that type. Each such value is a property list itself
     * where keys are inference parameters and values are
     * property lists that contain property/value pairs
     * appropriate for the parameter at hand according to
     * its value domain type.
     */
    @LispMethod(comment = "Returns a property list of inference parameters\r\nwhere keys are the value domain types (e.g. :boolean-inference-parameters,\r\n:integer-inference-parameters, etc.) and values\r\nare lists of inference parameters that take values\r\nof that type. Each such value is a property list itself\r\nwhere keys are inference parameters and values are\r\nproperty lists that contain property/value pairs\r\nappropriate for the parameter at hand according to\r\nits value domain type.\nReturns a property list of inference parameters\nwhere keys are the value domain types (e.g. :boolean-inference-parameters,\n:integer-inference-parameters, etc.) and values\nare lists of inference parameters that take values\nof that type. Each such value is a property list itself\nwhere keys are inference parameters and values are\nproperty lists that contain property/value pairs\nappropriate for the parameter at hand according to\nits value domain type.")
    public static SubLObject get_inference_parameter_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(open_cyc_inference_api.$$CycAPIMt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject boolean_inference_parameters = open_cyc_inference_api.get_boolean_inference_parameter_information();
            final SubLObject integer_inference_parameters = open_cyc_inference_api.get_integer_inference_parameter_information();
            final SubLObject real_number_inference_parameters = open_cyc_inference_api.get_real_number_inference_parameter_information();
            final SubLObject enumeration_inference_parameters = open_cyc_inference_api.get_enumeration_inference_parameter_information();
            final SubLObject other_inference_parameters = open_cyc_inference_api.get_other_inference_parameter_information();
            result = make_plist(open_cyc_inference_api.$list54, list(boolean_inference_parameters, integer_inference_parameters, real_number_inference_parameters, enumeration_inference_parameters, other_inference_parameters));
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject open_cyc_initialize_inference_alt(SubLObject sentence, SubLObject mt, SubLObject static_properties) {
        {
            SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
            SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
            SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
            SubLObject client = task_processor.get_current_task_processor_client();
            if (NIL != client) {
                com.cyc.cycjava.cycl.inference.open_cyc_inference_api.register_problem_store_id_for_client(client, problem_store_id);
            }
            return values(inference, problem_store_id, inference_id);
        }
    }

    public static SubLObject open_cyc_initialize_inference(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties) {
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, static_properties);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject client = get_current_task_processor_client();
        if (NIL != client) {
            open_cyc_inference_api.register_problem_store_id_for_client(client, problem_store_id);
        }
        return values(inference, problem_store_id, inference_id);
    }

    /**
     * Destroy problem store and inference
     */
    @LispMethod(comment = "Destroy problem store and inference")
    public static final SubLObject open_cyc_release_inference_resources_alt(SubLObject problem_store_id, SubLObject inference_id) {
        {
            SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
            SubLObject client = task_processor.get_current_task_processor_client();
            if (NIL != client) {
                com.cyc.cycjava.cycl.inference.open_cyc_inference_api.deregister_problem_store_id_for_client(client, problem_store_id);
            }
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        return NIL;
    }

    /**
     * Destroy problem store and inference
     */
    @LispMethod(comment = "Destroy problem store and inference")
    public static SubLObject open_cyc_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject client = get_current_task_processor_client();
        if (NIL != client) {
            open_cyc_inference_api.deregister_problem_store_id_for_client(client, problem_store_id);
        }
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        return NIL;
    }

    /**
     * Internal function for continuing an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     *
     * @return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
     */
    @LispMethod(comment = "Internal function for continuing an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\n\r\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)")
    public static final SubLObject open_cyc_continue_query_internal_alt(SubLObject inference, SubLObject v_properties, SubLObject nl_generation_properties, SubLObject inference_answer_process_function, SubLObject incremental_resultsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject final_result = NIL;
                SubLObject error_message = NIL;
                try {
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject _prev_bind_0_1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                            {
                                                SubLObject reuseP = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                try {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject _prev_bind_0_2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                            {
                                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject _prev_bind_0_3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                    try {
                                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                        {
                                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                                try {
                                                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                                                    {
                                                                                        final SubLObject original_memoization_process = memoization_state.aquireMemoStateLock(local_state);
                                                                                        try {
                                                                                            {
                                                                                                SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
                                                                                                process_utilities.make_cyc_server_process_with_args(cconcatenate($str_alt55$Query_thread_, format_nil.format_nil_a_no_copy(inference)), CONTINUE_INFERENCE, list(inference, dynamic_properties));
                                                                                            }
                                                                                        } finally {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                    {
                                                                                                        SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id(inference);
                                                                                                        SubLObject ipc_queue = dictionary_utilities.synchronized_dictionary_lookup($inference_to_ipc_queue_map$.getGlobalValue(), inference, UNPROVIDED);
                                                                                                        SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, $open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue(thread), incremental_resultsP, start_index);
                                                                                                        while (NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(ipcq_processor)) {
                                                                                                            inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration(ipcq_processor);
                                                                                                        } 
                                                                                                        final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results(ipcq_processor);
                                                                                                    }
                                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_4, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_3, thread);
                                                                    }
                                                                }
                                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                }
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_2, thread);
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL == reuseP) {
                                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                inference_strategist.inference_interrupt(inference, FIVE_INTEGER);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                                if (NIL != error_message) {
                                    Errors.error(error_message);
                                }
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return final_result;
            }
        }
    }

    /**
     * Internal function for continuing an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it's results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.
     *
     * @return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)
    Partial result last: (:INFERENCE-FINISHED status reason)
     */
    @LispMethod(comment = "Internal function for continuing an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\r\n\r\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\r\nPartial result last: (:INFERENCE-FINISHED status reason)")
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
                        final SubLObject _prev_bind_0_$1 = $free_pph_problem_store_pointers$.currentBinding(thread);
                        try {
                            $free_pph_problem_store_pointers$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$2 = $pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                $pph_problem_store_pointer$.bind(find_or_create_pph_problem_store_pointer(), thread);
                                final SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$3 = $pph_memoization_state$.currentBinding(thread);
                                    try {
                                        $pph_memoization_state$.bind(find_or_create_pph_memoization_state(), thread);
                                        final SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$4 = $pph_external_memoization_state$.currentBinding(thread);
                                        try {
                                            $pph_external_memoization_state$.bind(find_or_create_pph_external_memoization_state(), thread);
                                            final SubLObject local_state = $pph_memoization_state$.getDynamicValue(thread);
                                            final SubLObject _prev_bind_0_$5 = $memoization_state$.currentBinding(thread);
                                            try {
                                                $memoization_state$.bind(local_state, thread);
                                                final SubLObject original_memoization_process = memoization_state_original_process(local_state);
                                                try {
                                                    final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
                                                    SubLObject inference_process = NIL;
                                                    final SubLObject start_index = inference_datastructures_inference.inference_next_new_answer_id(inference);
                                                    inference_process = process_utilities.make_cyc_server_process_with_args(cconcatenate(open_cyc_inference_api.$$$Query_thread_, format_nil_a_no_copy(inference)), open_cyc_inference_api.CONTINUE_INFERENCE, list(inference, dynamic_properties));
                                                    final SubLObject ipc_queue = synchronized_dictionary_lookup(open_cyc_inference_api.$inference_to_ipc_queue_map$.getGlobalValue(), inference, UNPROVIDED);
                                                    final SubLObject ipcq_processor = inference_ipc_queue_processor.new_inference_ipc_queue_processor(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, open_cyc_inference_api.$open_cyc_minimum_time_before_sending_new_answers$.getDynamicValue(thread), incremental_resultsP, start_index, inference_process);
                                                    while (NIL == inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(ipcq_processor)) {
                                                        inference_ipc_queue_processor.inference_ipc_queue_processor_do_one_iteration(ipcq_processor);
                                                    } 
                                                    final_result = inference_ipc_queue_processor.get_inference_ipc_queue_processor_results(ipcq_processor);
                                                } finally {
                                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                }
                                            } finally {
                                                $memoization_state$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        } finally {
                                            $pph_external_memoization_state$.rebind(_prev_bind_0_$4, thread);
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state_p($pph_memoization_state$.getDynamicValue(thread)))) {
                                            clear_all_memoization($pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $pph_memoization_state$.rebind(_prev_bind_0_$3, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL == reuseP) {
                                            free_pph_problem_store_pointer($pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            } finally {
                                $pph_problem_store_pointer$.rebind(_prev_bind_0_$2, thread);
                            }
                        } finally {
                            $free_pph_problem_store_pointers$.rebind(_prev_bind_0_$1, thread);
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
                    thread.throwStack.push(open_cyc_inference_api.$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(open_cyc_inference_api.IGNORE_ERRORS_HANDLER), thread);
                        try {
                            inference_strategist.inference_interrupt(inference, FIVE_INTEGER);
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, open_cyc_inference_api.$IGNORE_ERRORS_TARGET);
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

    public static final SubLObject get_information_for_inference_parameter_alt(SubLObject param) {
        {
            SubLObject name = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_name(param);
            SubLObject basic_propP = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.basic_inference_parameter_p(param);
            SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p(name);
            SubLObject short_desc = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_short_description(param);
            SubLObject long_desc = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_long_description(param);
            SubLObject default_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_default_value(param);
            SubLObject alternate_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_alternate_value(param);
            SubLObject alternate_value_property_list = (NIL != alternate_value) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_inference_parameter_value_info(alternate_value))) : NIL;
            SubLObject param_result = list_utilities.make_plist($list_alt60, list(name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list));
            return param_result;
        }
    }

    public static SubLObject get_information_for_inference_parameter(final SubLObject param) {
        final SubLObject name = open_cyc_inference_api.inference_parameter_name(param);
        final SubLObject basic_propP = open_cyc_inference_api.basic_inference_parameter_p(param);
        final SubLObject query_staticP = inference_datastructures_enumerated_types.query_static_property_p(name);
        final SubLObject short_desc = open_cyc_inference_api.inference_parameter_short_description(param);
        final SubLObject long_desc = open_cyc_inference_api.inference_parameter_long_description(param);
        final SubLObject default_value = open_cyc_inference_api.inference_parameter_default_value(param);
        final SubLObject alternate_value = open_cyc_inference_api.inference_parameter_alternate_value(param);
        final SubLObject alternate_value_property_list = (NIL != alternate_value) ? open_cyc_inference_api.get_inference_parameter_value_info(alternate_value) : NIL;
        final SubLObject param_result = make_plist(open_cyc_inference_api.$list64, list(name, basic_propP, query_staticP, short_desc, long_desc, default_value, alternate_value_property_list));
        return param_result;
    }

    public static final SubLObject get_inference_parameter_value_info_alt(SubLObject param_value) {
        {
            SubLObject subl_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_value_subl_identifier(param_value);
            SubLObject short_desc = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_value_short_description(param_value);
            SubLObject long_desc = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_value_long_description(param_value);
            return list($VALUE, subl_value, $SHORT_DESC, short_desc, $LONG_DESC, long_desc);
        }
    }

    public static SubLObject get_inference_parameter_value_info(final SubLObject param_value) {
        final SubLObject subl_value = open_cyc_inference_api.inference_parameter_value_subl_identifier(param_value);
        final SubLObject short_desc = open_cyc_inference_api.inference_parameter_value_short_description(param_value);
        final SubLObject long_desc = open_cyc_inference_api.inference_parameter_value_long_description(param_value);
        return list($VALUE, subl_value, $SHORT_DESC, short_desc, $LONG_DESC, long_desc);
    }

    public static final SubLObject get_boolean_inference_parameter_information_alt() {
        {
            SubLObject parameters = isa.all_fort_instances($$BooleanInferenceParameter, $$CycAPIMt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameters;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                {
                    SubLObject param_result = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_information_for_inference_parameter(param);
                    result = putf(result, param, param_result);
                }
            }
            return result;
        }
    }

    public static SubLObject get_boolean_inference_parameter_information() {
        final SubLObject parameters = all_fort_instances(open_cyc_inference_api.$$BooleanInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject param_result = open_cyc_inference_api.get_information_for_inference_parameter(param);
            result = putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject get_integer_inference_parameter_information_alt() {
        {
            SubLObject parameters = isa.all_fort_instances($$IntegerInferenceParameter, $$CycAPIMt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameters;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                {
                    SubLObject param_result = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_information_for_inference_parameter(param);
                    SubLObject min_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.integer_inference_parameter_min_value(param);
                    SubLObject max_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.integer_inference_parameter_max_value(param);
                    param_result = putf(param_result, $MIN_VALUE, min_value);
                    param_result = putf(param_result, $MAX_VALUE, max_value);
                    result = putf(result, param, param_result);
                }
            }
            return result;
        }
    }

    public static SubLObject get_integer_inference_parameter_information() {
        final SubLObject parameters = all_fort_instances(open_cyc_inference_api.$$IntegerInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = open_cyc_inference_api.get_information_for_inference_parameter(param);
            final SubLObject min_value = open_cyc_inference_api.integer_inference_parameter_min_value(param);
            final SubLObject max_value = open_cyc_inference_api.integer_inference_parameter_max_value(param);
            param_result = putf(param_result, $MIN_VALUE, min_value);
            param_result = putf(param_result, $MAX_VALUE, max_value);
            result = putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject get_real_number_inference_parameter_information_alt() {
        {
            SubLObject parameters = isa.all_fort_instances($$RealNumberInferenceParameter, $$CycAPIMt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameters;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                {
                    SubLObject param_result = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_information_for_inference_parameter(param);
                    SubLObject min_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.real_number_inference_parameter_min_value(param);
                    SubLObject max_value = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.real_number_inference_parameter_max_value(param);
                    param_result = putf(param_result, $MIN_VALUE, min_value);
                    param_result = putf(param_result, $MAX_VALUE, max_value);
                    result = putf(result, param, param_result);
                }
            }
            return result;
        }
    }

    public static SubLObject get_real_number_inference_parameter_information() {
        final SubLObject parameters = all_fort_instances(open_cyc_inference_api.$$RealNumberInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = open_cyc_inference_api.get_information_for_inference_parameter(param);
            final SubLObject min_value = open_cyc_inference_api.real_number_inference_parameter_min_value(param);
            final SubLObject max_value = open_cyc_inference_api.real_number_inference_parameter_max_value(param);
            param_result = putf(param_result, $MIN_VALUE, min_value);
            param_result = putf(param_result, $MAX_VALUE, max_value);
            result = putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject get_enumeration_inference_parameter_information_alt() {
        {
            SubLObject parameters = isa.all_fort_instances($$EnumerationInferenceParameter, $$CycAPIMt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameters;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                {
                    SubLObject param_result = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_information_for_inference_parameter(param);
                    SubLObject potential_values = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.enumeration_inference_parameter_potential_values(param);
                    param_result = putf(param_result, $POTENTIAL_VALUES, potential_values);
                    result = putf(result, param, param_result);
                }
            }
            return result;
        }
    }

    public static SubLObject get_enumeration_inference_parameter_information() {
        final SubLObject parameters = all_fort_instances(open_cyc_inference_api.$$EnumerationInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject param_result = open_cyc_inference_api.get_information_for_inference_parameter(param);
            final SubLObject potential_values = open_cyc_inference_api.enumeration_inference_parameter_potential_values(param);
            param_result = putf(param_result, $POTENTIAL_VALUES, potential_values);
            result = putf(result, param, param_result);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @unknown -- MT relevance set from outside.
     */
    @LispMethod(comment = "@unknown -- MT relevance set from outside.")
    public static final SubLObject get_other_inference_parameter_information_alt() {
        {
            SubLObject parameters = isa.all_fort_instances($$InferenceParameter, $$CycAPIMt, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parameters;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                if (!(((NIL != nart_handles.nart_p(param)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_any_mt($$quotedIsa, param, $$InferenceSupportedTerm, ONE_INTEGER, TWO_INTEGER, $FALSE))) || (NIL != hl_prototypes.hl_prototypical_instanceP(param)))) {
                    {
                        SubLObject min_isa = isa.min_isa(param, UNPROVIDED, UNPROVIDED);
                        if ((NIL != list_utilities.singletonP(min_isa)) && $$InferenceParameter.eql(list_utilities.only_one(min_isa))) {
                            {
                                SubLObject param_result = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_information_for_inference_parameter(param);
                                param_result = putf(param_result, $BASIC_, NIL);
                                result = putf(result, param, param_result);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown -- MT relevance set from outside.
     */
    @LispMethod(comment = "@unknown -- MT relevance set from outside.")
    public static SubLObject get_other_inference_parameter_information() {
        final SubLObject parameters = all_fort_instances(open_cyc_inference_api.$$InferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parameters;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == nart_p(param)) && (NIL == pred_u_v_holds_in_any_mt(open_cyc_inference_api.$$quotedIsa, param, open_cyc_inference_api.$$InferenceSupportedTerm, ONE_INTEGER, TWO_INTEGER, $FALSE))) && (NIL == hl_prototypes.hl_prototypical_instanceP(param))) {
                final SubLObject min_isa = min_isa(param, UNPROVIDED, UNPROVIDED);
                if ((NIL != singletonP(min_isa)) && open_cyc_inference_api.$$InferenceParameter.eql(only_one(min_isa))) {
                    SubLObject param_result = open_cyc_inference_api.get_information_for_inference_parameter(param);
                    param_result = putf(param_result, $BASIC_, NIL);
                    result = putf(result, param, param_result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject advanced_inference_parameter_p_alt(SubLObject param) {
        return isa.isaP(param, $$AdvancedInferenceParameter, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject advanced_inference_parameter_p(final SubLObject param) {
        return isaP(param, open_cyc_inference_api.$$AdvancedInferenceParameter, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject basic_inference_parameter_p_alt(SubLObject param) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.open_cyc_inference_api.advanced_inference_parameter_p(param));
    }

    public static SubLObject basic_inference_parameter_p(final SubLObject param) {
        return makeBoolean(NIL == open_cyc_inference_api.advanced_inference_parameter_p(param));
    }

    public static final SubLObject inference_parameter_name_alt(SubLObject parameter) {
        {
            SubLObject v_subl_identifier = kb_mapping_utilities.fpred_value_in_mt(parameter, $$subLIdentifier, $$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
            if (NIL != el_formula_with_operator_p(v_subl_identifier, $$SubLQuoteFn)) {
                return nat_arg1(v_subl_identifier, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject inference_parameter_name(final SubLObject parameter) {
        final SubLObject v_subl_identifier = fpred_value_in_mt(parameter, open_cyc_inference_api.$$subLIdentifier, open_cyc_inference_api.$$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (NIL != el_formula_with_operator_p(v_subl_identifier, open_cyc_inference_api.$$SubLQuoteFn)) {
            return cycl_utilities.nat_arg1(v_subl_identifier, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inference_parameter_short_description_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_short_description(parameter, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_short_description(final SubLObject parameter) {
        return software_parameter_short_description(parameter, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject inference_parameter_long_description_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_long_description(parameter, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_long_description(final SubLObject parameter) {
        return software_parameter_long_description(parameter, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject inference_parameter_value_subl_identifier_alt(SubLObject param_value) {
        return parameter_specification_utilities.software_parameter_value_subl_identifier(param_value);
    }

    public static SubLObject inference_parameter_value_subl_identifier(final SubLObject param_value) {
        return software_parameter_value_subl_identifier(param_value);
    }

    public static final SubLObject inference_parameter_default_value_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_default_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_default_value(final SubLObject parameter) {
        return software_parameter_default_value(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject inference_parameter_alternate_value_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_alternate_value(parameter, $$CycInferenceEngine, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_alternate_value(final SubLObject parameter) {
        return software_parameter_alternate_value(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject enumeration_inference_parameter_potential_values_alt(SubLObject parameter) {
        {
            SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
            SubLObject result = NIL;
            if (NIL != el_extensional_set_p(domain)) {
                {
                    SubLObject cdolist_list_var = el_extensional_set_elements(domain);
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        {
                            SubLObject value_property_list = com.cyc.cycjava.cycl.inference.open_cyc_inference_api.get_inference_parameter_value_info(elem);
                            result = cons(value_property_list, result);
                        }
                    }
                }
                return nreverse(result);
            }
        }
        return NIL;
    }

    public static SubLObject enumeration_inference_parameter_potential_values(final SubLObject parameter) {
        final SubLObject domain = software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
        SubLObject result = NIL;
        if (NIL != el_extensional_set_p(domain)) {
            SubLObject cdolist_list_var = el_extensional_set_elements(domain);
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject value_property_list = open_cyc_inference_api.get_inference_parameter_value_info(elem);
                result = cons(value_property_list, result);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        return NIL;
    }

    public static final SubLObject integer_inference_parameter_min_value_alt(SubLObject parameter) {
        {
            SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
            SubLObject pcase_var = domain;
            if (pcase_var.eql($$NonNegativeInteger)) {
                return ZERO_INTEGER;
            }
        }
        return NIL;
    }

    public static SubLObject integer_inference_parameter_min_value(final SubLObject parameter) {
        final SubLObject domain = software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
        if (domain.eql(open_cyc_inference_api.$$NonNegativeInteger)) {
            return ZERO_INTEGER;
        }
        if (NIL != narts_high.nart_with_functor_p(open_cyc_inference_api.$$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg1(domain, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject integer_inference_parameter_max_value_alt(SubLObject parameter) {
        {
            SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
            SubLObject pcase_var = domain;
            if (pcase_var.eql($$NonNegativeInteger)) {
                return $INTEGER_PLUS_INFINITY;
            }
        }
        return NIL;
    }

    public static SubLObject integer_inference_parameter_max_value(final SubLObject parameter) {
        final SubLObject domain = software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
        if (domain.eql(open_cyc_inference_api.$$NonNegativeInteger)) {
            return open_cyc_inference_api.$INTEGER_PLUS_INFINITY;
        }
        if (NIL != narts_high.nart_with_functor_p(open_cyc_inference_api.$$IntegerFromToFn, domain)) {
            return cycl_utilities.nat_arg2(domain, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject real_number_inference_parameter_min_value_alt(SubLObject parameter) {
        {
            SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
            SubLObject pcase_var = domain;
            if (pcase_var.eql($$Real0_1)) {
                return $float$0_0;
            }
        }
        return NIL;
    }

    public static SubLObject real_number_inference_parameter_min_value(final SubLObject parameter) {
        final SubLObject pcase_var;
        final SubLObject domain = pcase_var = software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
        if (pcase_var.eql(open_cyc_inference_api.$$Real0_1)) {
            return open_cyc_inference_api.$float$0_0;
        }
        return NIL;
    }

    public static final SubLObject real_number_inference_parameter_max_value_alt(SubLObject parameter) {
        {
            SubLObject domain = parameter_specification_utilities.software_parameter_value_domain_in_software_object(parameter, $$CycInferenceEngine, $$CycAPIMt);
            SubLObject pcase_var = domain;
            if (pcase_var.eql($$Real0_1)) {
                return $float$1_0;
            }
        }
        return NIL;
    }

    public static SubLObject real_number_inference_parameter_max_value(final SubLObject parameter) {
        final SubLObject pcase_var;
        final SubLObject domain = pcase_var = software_parameter_value_domain_in_software_object(parameter, open_cyc_inference_api.$$CycInferenceEngine, open_cyc_inference_api.$$CycAPIMt);
        if (pcase_var.eql(open_cyc_inference_api.$$Real0_1)) {
            return open_cyc_inference_api.$float$1_0;
        }
        return NIL;
    }

    public static final SubLObject inference_parameter_value_short_description_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_short_description(parameter, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_value_short_description(final SubLObject parameter) {
        return software_parameter_value_short_description(parameter, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject inference_parameter_value_long_description_alt(SubLObject parameter) {
        return parameter_specification_utilities.software_parameter_value_long_description(parameter, $$CycAPIMt);
    }

    public static SubLObject inference_parameter_value_long_description(final SubLObject parameter) {
        return software_parameter_value_long_description(parameter, open_cyc_inference_api.$$CycAPIMt);
    }

    public static final SubLObject inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        if (NIL != isa.isaP(param_cycl, $$BooleanInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.boolean_inference_parameter_has_valid_information_p(param_cycl, param_info);
        } else {
            if (NIL != isa.isaP(param_cycl, $$IntegerInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.integer_inference_parameter_has_valid_information_p(param_cycl, param_info);
            } else {
                if (NIL != isa.isaP(param_cycl, $$RealNumberInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.real_number_inference_parameter_has_valid_information_p(param_cycl, param_info);
                } else {
                    if (NIL != isa.isaP(param_cycl, $$EnumerationInferenceParameter, $$CycAPIMt, UNPROVIDED)) {
                        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.enumeration_inference_parameter_has_valid_information_p(param_cycl, param_info);
                    } else {
                        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.other_inference_parameter_has_valid_information_p(param_cycl, param_info);
                    }
                }
            }
        }
    }

    public static SubLObject inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        if (NIL != isaP(param_cycl, open_cyc_inference_api.$$BooleanInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED)) {
            return open_cyc_inference_api.boolean_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (NIL != isaP(param_cycl, open_cyc_inference_api.$$IntegerInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED)) {
            return open_cyc_inference_api.integer_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (NIL != isaP(param_cycl, open_cyc_inference_api.$$RealNumberInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED)) {
            return open_cyc_inference_api.real_number_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        if (NIL != isaP(param_cycl, open_cyc_inference_api.$$EnumerationInferenceParameter, open_cyc_inference_api.$$CycAPIMt, UNPROVIDED)) {
            return open_cyc_inference_api.enumeration_inference_parameter_has_valid_information_p(param_cycl, param_info);
        }
        return open_cyc_inference_api.other_inference_parameter_has_valid_information_p(param_cycl, param_info);
    }

    public static final SubLObject inference_parameter_has_valid_basic_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean((((((NIL != cycl_grammar.cycl_denotational_term_p(param_cycl)) && getf(param_info, $NAME, UNPROVIDED).isKeyword()) && (NIL != booleanp(getf(param_info, $BASIC_, UNPROVIDED)))) && (NIL != booleanp(getf(param_info, $kw87$QUERY_STATIC_, UNPROVIDED)))) && getf(param_info, $SHORT_DESC, UNPROVIDED).isString()) && getf(param_info, $LONG_DESC, UNPROVIDED).isString());
    }

    public static SubLObject inference_parameter_has_valid_basic_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return makeBoolean((((((NIL != cycl_denotational_term_p(param_cycl)) && getf(param_info, $NAME, UNPROVIDED).isKeyword()) && (NIL != booleanp(getf(param_info, $BASIC_, UNPROVIDED)))) && (NIL != booleanp(getf(param_info, open_cyc_inference_api.$kw92$QUERY_STATIC_, UNPROVIDED)))) && getf(param_info, $SHORT_DESC, UNPROVIDED).isString()) && getf(param_info, $LONG_DESC, UNPROVIDED).isString());
    }

    public static final SubLObject enumeration_inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != com.cyc.cycjava.cycl.inference.open_cyc_inference_api.valid_enumeration_inference_parameter_values_p(getf(param_info, $POTENTIAL_VALUES, UNPROVIDED)))) && (NIL != pph_utilities.keyword_or_nil_p(getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)))) && (NIL != pph_utilities.keyword_or_nil_p(getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED))));
    }

    public static SubLObject enumeration_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return makeBoolean((((NIL != open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != open_cyc_inference_api.valid_enumeration_inference_parameter_values_p(getf(param_info, $POTENTIAL_VALUES, UNPROVIDED)))) && (NIL != keyword_or_nil_p(getf(param_info, $DEFAULT_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED)))) && (NIL != keyword_or_nil_p(getf(param_info, $ALTERNATE_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED))));
    }

    public static final SubLObject other_inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info);
    }

    public static SubLObject other_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info);
    }

    public static final SubLObject boolean_inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != booleanp(getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED)))) && (NIL != booleanp(getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED))));
    }

    public static SubLObject boolean_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return makeBoolean(((NIL != open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && (NIL != booleanp(getf(param_info, $DEFAULT_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED)))) && (NIL != booleanp(getf(param_info, $ALTERNATE_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED))));
    }

    public static final SubLObject integer_inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isInteger()) && (($INTEGER_PLUS_INFINITY == getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED)) || getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isInteger()));
    }

    public static SubLObject integer_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return makeBoolean(((NIL != open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $MIN_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isInteger()) && ((open_cyc_inference_api.$INTEGER_PLUS_INFINITY == getf(param_info, $MAX_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED)) || getf(param_info, $MAX_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isInteger()));
    }

    public static final SubLObject real_number_inference_parameter_has_valid_information_p_alt(SubLObject param_cycl, SubLObject param_info) {
        return makeBoolean(((((NIL != com.cyc.cycjava.cycl.inference.open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $DEFAULT_VALUE, $NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MIN_VALUE, $NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MAX_VALUE, $NO_VALUE_SPECIFIED).isNumber()) && ((NIL == getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED)) || getf(param_info, $ALTERNATE_VALUE, $NO_VALUE_SPECIFIED).isNumber()));
    }

    public static SubLObject real_number_inference_parameter_has_valid_information_p(final SubLObject param_cycl, final SubLObject param_info) {
        return makeBoolean(((((NIL != open_cyc_inference_api.inference_parameter_has_valid_basic_information_p(param_cycl, param_info)) && getf(param_info, $DEFAULT_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MIN_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isNumber()) && getf(param_info, $MAX_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isNumber()) && ((NIL == getf(param_info, $ALTERNATE_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED)) || getf(param_info, $ALTERNATE_VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED).isNumber()));
    }

    public static final SubLObject valid_enumeration_inference_parameter_values_p_alt(SubLObject potential_values) {
        if (NIL == potential_values) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = potential_values;
            SubLObject potential_value = NIL;
            for (potential_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , potential_value = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.open_cyc_inference_api.valid_enumeration_inference_parameter_value_p(potential_value)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject valid_enumeration_inference_parameter_values_p(final SubLObject potential_values) {
        if (NIL == potential_values) {
            return NIL;
        }
        SubLObject cdolist_list_var = potential_values;
        SubLObject potential_value = NIL;
        potential_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == open_cyc_inference_api.valid_enumeration_inference_parameter_value_p(potential_value)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            potential_value = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject valid_enumeration_inference_parameter_value_p_alt(SubLObject potential_value) {
        return makeBoolean((((NIL != list_utilities.non_empty_list_p(potential_value)) && (getf(potential_value, $VALUE, $NO_VALUE_SPECIFIED) != $NO_VALUE_SPECIFIED)) && getf(potential_value, $SHORT_DESC, UNPROVIDED).isString()) && getf(potential_value, $LONG_DESC, UNPROVIDED).isString());
    }

    public static SubLObject valid_enumeration_inference_parameter_value_p(final SubLObject potential_value) {
        return makeBoolean((((NIL != non_empty_list_p(potential_value)) && (getf(potential_value, $VALUE, open_cyc_inference_api.$NO_VALUE_SPECIFIED) != open_cyc_inference_api.$NO_VALUE_SPECIFIED)) && getf(potential_value, $SHORT_DESC, UNPROVIDED).isString()) && getf(potential_value, $LONG_DESC, UNPROVIDED).isString());
    }

    public static final SubLObject declare_open_cyc_inference_api_file_alt() {
        declareFunction("initialize_open_cyc_inference_api_vars", "INITIALIZE-OPEN-CYC-INFERENCE-API-VARS", 0, 0, false);
        declareFunction("initialize_default_open_cyc_nl_generation_properties", "INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES", 0, 0, false);
        declareMacro("synch_format", "SYNCH-FORMAT");
        declareFunction("get_problem_store_ids_for_client", "GET-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        declareFunction("register_problem_store_id_for_client", "REGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        declareFunction("deregister_problem_store_id_for_client", "DEREGISTER-PROBLEM-STORE-ID-FOR-CLIENT", 2, 0, false);
        declareFunction("deregister_all_problem_store_ids_for_client", "DEREGISTER-ALL-PROBLEM-STORE-IDS-FOR-CLIENT", 1, 0, false);
        declareFunction("open_cyc_handle_new_inference_event", "OPEN-CYC-HANDLE-NEW-INFERENCE-EVENT", 3, 0, false);
        declareFunction("inference_suspend_reason", "INFERENCE-SUSPEND-REASON", 1, 0, false);
        declareFunction("open_cyc_start_continuable_query", "OPEN-CYC-START-CONTINUABLE-QUERY", 2, 5, false);
        declareFunction("open_cyc_start_continuable_query_internal", "OPEN-CYC-START-CONTINUABLE-QUERY-INTERNAL", 7, 0, false);
        declareFunction("open_cyc_release_inference_resources_for_client", "OPEN-CYC-RELEASE-INFERENCE-RESOURCES-FOR-CLIENT", 0, 1, false);
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
        declareFunction("subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("open_cyc_start_continuable_query_test_case_p", "OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_open_cyc_inference_api_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("open_cyc_start_continuable_query_test_case_p", "OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_open_cyc_inference_api_file_Previous() {
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

    public static final SubLObject init_open_cyc_inference_api_file_alt() {
        defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T);
        defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
        defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL);
        deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", NIL != boundp($inference_to_ipc_queue_map$) ? ((SubLObject) ($inference_to_ipc_queue_map$.getGlobalValue())) : dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*OPENCYC-INFERENCE-OUTPUT*", NIL != boundp($opencyc_inference_output$) ? ((SubLObject) ($opencyc_inference_output$.getGlobalValue())) : StreamsLow.$standard_output$.getDynamicValue());
        deflexical("*SYNCH-FORMAT-LOCK*", NIL != boundp($synch_format_lock$) ? ((SubLObject) ($synch_format_lock$.getGlobalValue())) : make_lock($str_alt10$_synch_format_lock_));
        deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", NIL != boundp($client_to_problem_stores_map$) ? ((SubLObject) ($client_to_problem_stores_map$.getGlobalValue())) : dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_open_cyc_inference_api_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T);
            defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
            defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL);
            deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$inference_to_ipc_queue_map$, open_cyc_inference_api.$inference_to_ipc_queue_map$, () -> new_synchronized_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*OPENCYC-INFERENCE-OUTPUT*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$opencyc_inference_output$, open_cyc_inference_api.$opencyc_inference_output$, () -> StreamsLow.$standard_output$.getDynamicValue()));
            deflexical("*SYNCH-FORMAT-LOCK*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$synch_format_lock$, open_cyc_inference_api.$synch_format_lock$, () -> make_lock(open_cyc_inference_api.$str10$_synch_format_lock_)));
            deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$client_to_problem_stores_map$, open_cyc_inference_api.$client_to_problem_stores_map$, () -> new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", NIL != boundp($inference_to_ipc_queue_map$) ? ((SubLObject) ($inference_to_ipc_queue_map$.getGlobalValue())) : dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*OPENCYC-INFERENCE-OUTPUT*", NIL != boundp($opencyc_inference_output$) ? ((SubLObject) ($opencyc_inference_output$.getGlobalValue())) : StreamsLow.$standard_output$.getDynamicValue());
            deflexical("*SYNCH-FORMAT-LOCK*", NIL != boundp($synch_format_lock$) ? ((SubLObject) ($synch_format_lock$.getGlobalValue())) : make_lock($str_alt10$_synch_format_lock_));
            deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", NIL != boundp($client_to_problem_stores_map$) ? ((SubLObject) ($client_to_problem_stores_map$.getGlobalValue())) : dictionary_utilities.new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_open_cyc_inference_api_file_Previous() {
        defparameter("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*", T);
        defparameter("*OPEN-CYC-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
        defvar("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*", NIL);
        deflexical("*INFERENCE-TO-IPC-QUEUE-MAP*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$inference_to_ipc_queue_map$, open_cyc_inference_api.$inference_to_ipc_queue_map$, () -> new_synchronized_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*OPENCYC-INFERENCE-OUTPUT*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$opencyc_inference_output$, open_cyc_inference_api.$opencyc_inference_output$, () -> StreamsLow.$standard_output$.getDynamicValue()));
        deflexical("*SYNCH-FORMAT-LOCK*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$synch_format_lock$, open_cyc_inference_api.$synch_format_lock$, () -> make_lock(open_cyc_inference_api.$str10$_synch_format_lock_)));
        deflexical("*CLIENT-TO-PROBLEM-STORES-MAP*", SubLTrampolineFile.maybeDefault(open_cyc_inference_api.$client_to_problem_stores_map$, open_cyc_inference_api.$client_to_problem_stores_map$, () -> new_synchronized_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_open_cyc_inference_api_file_alt() {
        declare_defglobal($inference_to_ipc_queue_map$);
        declare_defglobal($opencyc_inference_output$);
        declare_defglobal($synch_format_lock$);
        declare_defglobal($client_to_problem_stores_map$);
        register_cyc_api_function(OPEN_CYC_START_CONTINUABLE_QUERY, $list_alt26, $str_alt27$Starts_a_continuable_inference_as, $list_alt28, NIL);
        register_cyc_api_function(OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, $list_alt37, $str_alt38$Releases_all_inference_resources_, $list_alt39, NIL);
        register_cyc_api_function(OPEN_CYC_CONTINUE_QUERY, $list_alt43, $str_alt44$Continues_an_existing_continuable, $list_alt45, NIL);
        register_cyc_api_function(GET_INFERENCE_PARAMETER_INFORMATION, NIL, $str_alt51$Returns_a_property_list_of_infere, NIL, $list_alt52);
        sunit_external.define_test_category($$$Open_Cyc_Inference_API_Category, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE);
        classes.subloop_new_class(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt94);
        classes.class_set_implements_slot_listeners(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym103$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST);
        classes.subloop_note_instance_initialization_function(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym108$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST);
        com.cyc.cycjava.cycl.inference.open_cyc_inference_api.subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_class(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE);
        sunit_macros.define_test_case_postamble(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $str_alt109$open_cyc_inference_api, $$$cycl, $list_alt111);
        sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym112$ISA_X_DOG_);
        sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym113$OBJECTS_FOUND_IN_AMERICA_);
        sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, RELATION_ALL_EXISTS_PHYSICAL_PARTS_GUN);
        return NIL;
    }

    public static SubLObject setup_open_cyc_inference_api_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal(open_cyc_inference_api.$inference_to_ipc_queue_map$);
            declare_defglobal(open_cyc_inference_api.$opencyc_inference_output$);
            declare_defglobal(open_cyc_inference_api.$synch_format_lock$);
            declare_defglobal(open_cyc_inference_api.$client_to_problem_stores_map$);
            register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_START_CONTINUABLE_QUERY, open_cyc_inference_api.$list29, open_cyc_inference_api.$str30$Starts_a_continuable_inference_as, open_cyc_inference_api.$list31, NIL);
            register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, open_cyc_inference_api.$list40, open_cyc_inference_api.$str41$Releases_all_inference_resources_, open_cyc_inference_api.$list42, NIL);
            register_external_symbol(open_cyc_inference_api.OPEN_CYC_GET_BINDING_FOR_VARIABLE);
            register_external_symbol(open_cyc_inference_api.OPEN_CYC_GET_ANSWER_BINDINGS);
            register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_CONTINUE_QUERY, open_cyc_inference_api.$list48, open_cyc_inference_api.$str49$Continues_an_existing_continuable, open_cyc_inference_api.$list50, NIL);
            register_cyc_api_function(open_cyc_inference_api.GET_INFERENCE_PARAMETER_INFORMATION, NIL, open_cyc_inference_api.$str56$Returns_a_property_list_of_infere, NIL, open_cyc_inference_api.$list57);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(OPEN_CYC_START_CONTINUABLE_QUERY, $list_alt26, $str_alt27$Starts_a_continuable_inference_as, $list_alt28, NIL);
            register_cyc_api_function(OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, $list_alt37, $str_alt38$Releases_all_inference_resources_, $list_alt39, NIL);
            register_cyc_api_function(OPEN_CYC_CONTINUE_QUERY, $list_alt43, $str_alt44$Continues_an_existing_continuable, $list_alt45, NIL);
            register_cyc_api_function(GET_INFERENCE_PARAMETER_INFORMATION, NIL, $str_alt51$Returns_a_property_list_of_infere, NIL, $list_alt52);
            sunit_external.define_test_category($$$Open_Cyc_Inference_API_Category, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE);
            classes.subloop_new_class(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt94);
            classes.class_set_implements_slot_listeners(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym103$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST);
            classes.subloop_note_instance_initialization_function(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym108$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST);
            com.cyc.cycjava.cycl.inference.open_cyc_inference_api.subloop_reserved_initialize_open_cyc_start_continuable_query_test_case_class(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE);
            sunit_macros.define_test_case_postamble(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $str_alt109$open_cyc_inference_api, $$$cycl, $list_alt111);
            sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym112$ISA_X_DOG_);
            sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, $sym113$OBJECTS_FOUND_IN_AMERICA_);
            sunit_macros.def_test_method_register(OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE, RELATION_ALL_EXISTS_PHYSICAL_PARTS_GUN);
        }
        return NIL;
    }

    public static SubLObject setup_open_cyc_inference_api_file_Previous() {
        declare_defglobal(open_cyc_inference_api.$inference_to_ipc_queue_map$);
        declare_defglobal(open_cyc_inference_api.$opencyc_inference_output$);
        declare_defglobal(open_cyc_inference_api.$synch_format_lock$);
        declare_defglobal(open_cyc_inference_api.$client_to_problem_stores_map$);
        register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_START_CONTINUABLE_QUERY, open_cyc_inference_api.$list29, open_cyc_inference_api.$str30$Starts_a_continuable_inference_as, open_cyc_inference_api.$list31, NIL);
        register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_RELEASE_INFERENCE_RESOURCES_FOR_CLIENT, open_cyc_inference_api.$list40, open_cyc_inference_api.$str41$Releases_all_inference_resources_, open_cyc_inference_api.$list42, NIL);
        register_external_symbol(open_cyc_inference_api.OPEN_CYC_GET_BINDING_FOR_VARIABLE);
        register_external_symbol(open_cyc_inference_api.OPEN_CYC_GET_ANSWER_BINDINGS);
        register_cyc_api_function(open_cyc_inference_api.OPEN_CYC_CONTINUE_QUERY, open_cyc_inference_api.$list48, open_cyc_inference_api.$str49$Continues_an_existing_continuable, open_cyc_inference_api.$list50, NIL);
        register_cyc_api_function(open_cyc_inference_api.GET_INFERENCE_PARAMETER_INFORMATION, NIL, open_cyc_inference_api.$str56$Returns_a_property_list_of_infere, NIL, open_cyc_inference_api.$list57);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        open_cyc_inference_api.declare_open_cyc_inference_api_file();
    }

    @Override
    public void initializeVariables() {
        open_cyc_inference_api.init_open_cyc_inference_api_file();
    }

    @Override
    public void runTopLevelForms() {
        open_cyc_inference_api.setup_open_cyc_inference_api_file();
    }

    static {
    }

    static private final SubLList $list_alt6 = list($MODE, $HTML);

    static private final SubLString $str_alt10$_synch_format_lock_ = makeString("*synch-format-lock*");

    static private final SubLList $list_alt11 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));

    static private final SubLList $list_alt13 = list(makeSymbol("*SYNCH-FORMAT-LOCK*"));

    static private final SubLList $list_alt15 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*OPENCYC-INFERENCE-OUTPUT*")));

    static private final SubLList $list_alt26 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")), list(makeSymbol("OPTIMIZE-QUERY-SENTENCE-VARIABLES?"), T));

    static private final SubLString $str_alt27$Starts_a_continuable_inference_as = makeString("Starts a continuable inference asking the query defined by SENTENCE in the microtheory MT. \n   This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. \n\n   INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. \n   NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. \n   INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n   If OPTIMIZE-QUERY-SENTENCE-VARIABLES? is T then variable names in SENTENCE will be renamed to reflect the arg constraints.\n\n@return Partial result 1: (:INFERENCE-START problem-store-id inference-id)\n        Partial result 2+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)\n  Destroy problem store and inference");

    static private final SubLList $list_alt28 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("MT"), makeSymbol("POSSIBLY-MT-P")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));

    static private final SubLList $list_alt30 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"));

    public static final SubLSymbol $kw31$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    static private final SubLString $str_alt34$Problem_store_ID___A___Inference_ = makeString("Problem store ID: ~A ~%Inference ID: ~A~%");

    static private final SubLList $list_alt37 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CLIENT"), list(makeSymbol("GET-CURRENT-TASK-PROCESSOR-CLIENT"))));

    static private final SubLString $str_alt38$Releases_all_inference_resources_ = makeString("Releases all inference resources associated with CLIENT (e.g. destroys all problem stores associated with CLIENT).");

    static private final SubLList $list_alt39 = list(list(makeSymbol("CLIENT"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt43 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"), makeSymbol("PROPERTIES"), makeSymbol("&OPTIONAL"), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("*DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES*")), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), list(makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("*USE-API-TASK-PROCESSOR-INCREMENTAL-RESULTS?*")));

    static private final SubLString $str_alt44$Continues_an_existing_continuable = makeString("Continues an existing continuable inference given a PROBLEM-STORE-ID and INFERENCE-ID. This function is meant to be called by external applications that are using the OpenCyc API and it uses the ability to post partial results using the task processor API in order to send results back as soon as they become available. INFERENCE-ANSWER-PROCESS-FUNCTION is a function that will be called to process every binding set and it\'s results will be returned rather than the actual binding set. If INFERENCE-ANSWER-PROCESS-FUNCTION is nil, then the answer binding sets are returned unmodified. INFERENCE-ANSWER-PROCESS-FUNCTION allows work to be done on the SubL side for every answer, rather than having to do a separate round trip for processing. NL-GENERATION-PROPERTIES is a generate-phrase-for-java-property-list-p which can be used to pass properties for controlling NL generation, it can be set to nil if the INFERENCE-ANSWER-PROCESS-FUNCTION performs no NL generation. INCREMENTAL-RESULTS? indicates whether to use the API task processor partial result posting -- it should always be set to T except during SubL-side testing.\n@return Partial result 1+: (:INFERENCE-ANSWER (processed answer binding set)+)\n        Partial result last: (:INFERENCE-FINISHED status reason)");

    static private final SubLList $list_alt45 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")), list(makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P")));

    static private final SubLString $str_alt46$Inference__A_is_already_running__ = makeString("Inference ~A is already running!~%");

    static private final SubLString $str_alt47$Cannot_ask_query__Invalid_inferen = makeString("Cannot ask query. Invalid inference-status: ~A~%");

    static private final SubLList $list_alt49 = list(makeKeyword("BOOLEAN-INFERENCE-PARAMETERS"), makeKeyword("INTEGER-INFERENCE-PARAMETERS"), makeKeyword("REAL-NUMBER-INFERENCE-PARAMETERS"), makeKeyword("ENUMERATION-INFERENCE-PARAMETERS"), makeKeyword("OTHER-INFERENCE-PARAMETERS"));

    static private final SubLString $str_alt51$Returns_a_property_list_of_infere = makeString("Returns a property list of inference parameters\n   where keys are the value domain types (e.g. :boolean-inference-parameters,\n   :integer-inference-parameters, etc.) and values\n   are lists of inference parameters that take values\n   of that type. Each such value is a property list itself \n   where keys are inference parameters and values are\n   property lists that contain property/value pairs\n   appropriate for the parameter at hand according to\n   its value domain type.");

    static private final SubLList $list_alt52 = list(makeSymbol("PROPERTY-LIST-P"));

    static private final SubLString $str_alt54$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt55$Query_thread_ = makeString("Query thread ");

    static private final SubLList $list_alt60 = list($NAME, makeKeyword("BASIC?"), makeKeyword("QUERY-STATIC?"), makeKeyword("SHORT-DESC"), makeKeyword("LONG-DESC"), makeKeyword("DEFAULT-VALUE"), makeKeyword("ALTERNATE-VALUE"));

    public static final SubLSymbol $kw87$QUERY_STATIC_ = makeKeyword("QUERY-STATIC?");

    static private final SubLString $$$Open_Cyc_Inference_API_Category = makeString("Open Cyc Inference API Category");

    private static final SubLSymbol OPEN_CYC_START_CONTINUABLE_QUERY_TEST_CASE = makeSymbol("OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE");

    static private final SubLList $list_alt94 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISA-X-DOG?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECTS-FOUND-IN-AMERICA?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATION-ALL-EXISTS-PHYSICAL-PARTS-GUN"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-CLASS");

    static private final SubLSymbol $sym108$SUBLOOP_RESERVED_INITIALIZE_OPEN_CYC_START_CONTINUABLE_QUERY_TEST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OPEN-CYC-START-CONTINUABLE-QUERY-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt109$open_cyc_inference_api = makeString("open-cyc-inference-api");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt111 = list(makeString("Open Cyc Inference API Category"));

    static private final SubLSymbol $sym112$ISA_X_DOG_ = makeSymbol("ISA-X-DOG?");

    static private final SubLSymbol $sym113$OBJECTS_FOUND_IN_AMERICA_ = makeSymbol("OBJECTS-FOUND-IN-AMERICA?");

    private static final SubLSymbol RELATION_ALL_EXISTS_PHYSICAL_PARTS_GUN = makeSymbol("RELATION-ALL-EXISTS-PHYSICAL-PARTS-GUN");
}

/**
 * Total time: 374 ms
 */
