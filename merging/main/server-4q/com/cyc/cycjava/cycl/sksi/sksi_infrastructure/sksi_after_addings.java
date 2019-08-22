/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_after_addings extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_after_addings();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings";


    // defparameter
    /**
     * Whether automatic cost estimate update is enabled or not; this is used to
     * gate the #$afterAddings/#$afterRemovings relevant to updating the cost
     * estimate information in the KB in the case of edits to the KB representation
     * of an existing knowledge source
     */
    @LispMethod(comment = "Whether automatic cost estimate update is enabled or not; this is used to\r\ngate the #$afterAddings/#$afterRemovings relevant to updating the cost\r\nestimate information in the KB in the case of edits to the KB representation\r\nof an existing knowledge source\ndefparameter\nWhether automatic cost estimate update is enabled or not; this is used to\ngate the #$afterAddings/#$afterRemovings relevant to updating the cost\nestimate information in the KB in the case of edits to the KB representation\nof an existing knowledge source")
    public static final SubLSymbol $sksi_automatic_cost_estimate_update_enabledP$ = makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*");





    private static final SubLSymbol SKSI_REIFY_PHYSICAL_SCHEMA_FIELDS = makeSymbol("SKSI-REIFY-PHYSICAL-SCHEMA-FIELDS");

    private static final SubLSymbol SKSI_UNREIFY_PHYSICAL_SCHEMA_FIELDS = makeSymbol("SKSI-UNREIFY-PHYSICAL-SCHEMA-FIELDS");





    private static final SubLSymbol SKSI_QUOTED_ISA_AFTER_ADDINGS = makeSymbol("SKSI-QUOTED-ISA-AFTER-ADDINGS");

    private static final SubLSymbol SKSI_QUOTED_ISA_AFTER_REMOVINGS = makeSymbol("SKSI-QUOTED-ISA-AFTER-REMOVINGS");



    private static final SubLSymbol SKSI_REMOVE_SKS_ISA = makeSymbol("SKSI-REMOVE-SKS-ISA");



    private static final SubLSymbol SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAME = makeSymbol("SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAME");

    private static final SubLSymbol SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAME = makeSymbol("SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAME");

    private static final SubLObject $const15$structuredKnowledgeSourceNamespac = reader_make_constant_shell("structuredKnowledgeSourceNamespace");

    private static final SubLSymbol SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE = makeSymbol("SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE");

    private static final SubLSymbol SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE = makeSymbol("SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE");



    private static final SubLSymbol SKSI_ADD_SERVER_OF_SKS = makeSymbol("SKSI-ADD-SERVER-OF-SKS");

    private static final SubLSymbol SKSI_REMOVE_SERVER_OF_SKS = makeSymbol("SKSI-REMOVE-SERVER-OF-SKS");



    private static final SubLSymbol SKSI_ADD_PORT_NUMBER_FOR_SKS = makeSymbol("SKSI-ADD-PORT-NUMBER-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_PORT_NUMBER_FOR_SKS = makeSymbol("SKSI-REMOVE-PORT-NUMBER-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_SKS_PROXY_HOST = makeSymbol("SKSI-ADD-SKS-PROXY-HOST");

    private static final SubLSymbol SKSI_REMOVE_SKS_PROXY_HOST = makeSymbol("SKSI-REMOVE-SKS-PROXY-HOST");



    private static final SubLSymbol SKSI_ADD_SKS_PROXY_PORT = makeSymbol("SKSI-ADD-SKS-PROXY-PORT");

    private static final SubLSymbol SKSI_REMOVE_SKS_PROXY_PORT = makeSymbol("SKSI-REMOVE-SKS-PROXY-PORT");



    private static final SubLSymbol SKSI_ADD_SKS_CONNECTION_TIMEOUT = makeSymbol("SKSI-ADD-SKS-CONNECTION-TIMEOUT");

    private static final SubLSymbol SKSI_REMOVE_SKS_CONNECTION_TIMEOUT = makeSymbol("SKSI-REMOVE-SKS-CONNECTION-TIMEOUT");



    private static final SubLSymbol SKSI_ADD_USER_NAME_FOR_SKS = makeSymbol("SKSI-ADD-USER-NAME-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_USER_NAME_FOR_SKS = makeSymbol("SKSI-REMOVE-USER-NAME-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_PASSWORD_FOR_SKS = makeSymbol("SKSI-ADD-PASSWORD-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_PASSWORD_FOR_SKS = makeSymbol("SKSI-REMOVE-PASSWORD-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_SUBPROTOCOL_FOR_SKS = makeSymbol("SKSI-ADD-SUBPROTOCOL-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_SUBPROTOCOL_FOR_SKS = makeSymbol("SKSI-REMOVE-SUBPROTOCOL-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_SQL_PROGRAM_FOR_SKS = makeSymbol("SKSI-ADD-SQL-PROGRAM-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_SQL_PROGRAM_FOR_SKS = makeSymbol("SKSI-REMOVE-SQL-PROGRAM-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_FILENAME_FOR_SKS = makeSymbol("SKSI-ADD-FILENAME-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_FILENAME_FOR_SKS = makeSymbol("SKSI-REMOVE-FILENAME-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_KEY_TEST_FUNCTION_FOR_SKS = makeSymbol("SKSI-ADD-KEY-TEST-FUNCTION-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_KEY_TEST_FUNCTION_FOR_SKS = makeSymbol("SKSI-REMOVE-KEY-TEST-FUNCTION-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_VALUE_TEST_FUNCTION_FOR_SKS = makeSymbol("SKSI-ADD-VALUE-TEST-FUNCTION-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_VALUE_TEST_FUNCTION_FOR_SKS = makeSymbol("SKSI-REMOVE-VALUE-TEST-FUNCTION-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_SERIALIZATION_TYPE_FOR_SKS = makeSymbol("SKSI-ADD-SERIALIZATION-TYPE-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_SERIALIZATION_TYPE_FOR_SKS = makeSymbol("SKSI-REMOVE-SERIALIZATION-TYPE-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_HTTPD_REQUEST_URL_FOR_SKS = makeSymbol("SKSI-ADD-HTTPD-REQUEST-URL-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_HTTPD_REQUEST_URL_FOR_SKS = makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-URL-FOR-SKS");



    private static final SubLSymbol SKSI_REMOVE_HTTPD_REQUEST_METHOD_FOR_SKS = makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-METHOD-FOR-SKS");



    private static final SubLSymbol SKSI_REMOVE_HTTPD_REQUEST_QUERY_TEMPLATE_FOR_SKS = makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-QUERY-TEMPLATE-FOR-SKS");

    private static final SubLObject $const64$httpdRequestSubLBooleanParsingPro = reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS");

    private static final SubLSymbol SKSI_REMOVE_HTTPD_REQUEST_SUBL_BOOLEAN_PARSING_PROGRAM_FOR_SKS = makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-SUBL-BOOLEAN-PARSING-PROGRAM-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_BASE_NAMESPACE_FOR_SKS = makeSymbol("SKSI-ADD-BASE-NAMESPACE-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_BASE_NAMESPACE_FOR_SKS = makeSymbol("SKSI-REMOVE-BASE-NAMESPACE-FOR-SKS");



    private static final SubLSymbol SKSI_RECOMPUTE_NAME_SPACE_PREFIX_FOR_SKS = makeSymbol("SKSI-RECOMPUTE-NAME-SPACE-PREFIX-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_RDF_STORE_IDENTIFIER_FOR_SKS = makeSymbol("SKSI-ADD-RDF-STORE-IDENTIFIER-FOR-SKS");

    private static final SubLSymbol SKSI_REMOVE_RDF_STORE_IDENTIFIER_FOR_SKS = makeSymbol("SKSI-REMOVE-RDF-STORE-IDENTIFIER-FOR-SKS");



    private static final SubLSymbol SKSI_ADD_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS = makeSymbol("SKSI-ADD-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS");

    private static final SubLSymbol SKSI_REMOVE_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS = makeSymbol("SKSI-REMOVE-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS");

    private static final SubLList $list78 = list(list(makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), T));

    private static final SubLList $list80 = list(list(makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), NIL));

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLList $list82 = list(list(makeSymbol("ASSERTION"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym83$TIMED_OUT = makeUninternedSymbol("TIMED-OUT");

    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");

    private static final SubLList $list87 = list(makeSymbol("SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?"));

    private static final SubLSymbol TRUE_GAF_ASSERTION_WITH_PRED_P = makeSymbol("TRUE-GAF-ASSERTION-WITH-PRED-P");

    private static final SubLSymbol $sksi_automatic_cost_estimate_update_timeout$ = makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-TIMEOUT*");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol SKSI_ADD_COST_ESTIMATES_FOR_MEANING_SENTENCE = makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-MEANING-SENTENCE");

    private static final SubLSymbol SKSI_REMOVE_COST_ESTIMATES_FOR_MEANING_SENTENCE = makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-MEANING-SENTENCE");

    private static final SubLObject $const99$conditionalMeaningSentenceOfSchem = reader_make_constant_shell("conditionalMeaningSentenceOfSchema");

    private static final SubLSymbol SKSI_ADD_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE = makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE");

    private static final SubLSymbol SKSI_REMOVE_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE = makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE");



    private static final SubLSymbol SKSI_ADD_COST_ESTIMATES_FOR_FIELD_DECODING = makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-FIELD-DECODING");

    private static final SubLSymbol SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_DECODING = makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-DECODING");



    private static final SubLSymbol SKSI_ADD_COST_ESTIMATES_FOR_FIELD_ENCODING = makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-FIELD-ENCODING");

    private static final SubLSymbol SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_ENCODING = makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-ENCODING");

    // Definitions
    /**
     * #$afterAdding for #$schemaFieldNameList
     */
    @LispMethod(comment = "#$afterAdding for #$schemaFieldNameList")
    public static final SubLObject sksi_reify_physical_schema_fields_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$schemaFieldNameList)) {
            {
                SubLObject ps = assertions_high.gaf_arg1(assertion);
                SubLObject pf_names = el_list_items(assertions_high.gaf_arg2(assertion));
                SubLObject cdolist_list_var = pf_names;
                SubLObject pf_name = NIL;
                for (pf_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pf_name = cdolist_list_var.first()) {
                    czer_main.cyc_find_or_create_nart(make_binary_formula($$PhysicalFieldFn, ps, pf_name), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * #$afterAdding for #$schemaFieldNameList
     */
    @LispMethod(comment = "#$afterAdding for #$schemaFieldNameList")
    public static SubLObject sksi_reify_physical_schema_fields(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$schemaFieldNameList)) {
            final SubLObject ps = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject pf_names = cdolist_list_var = el_list_items(assertions_high.gaf_arg2(assertion));
            SubLObject pf_name = NIL;
            pf_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                czer_main.cyc_find_or_create_nart(make_binary_formula($$PhysicalFieldFn, ps, pf_name), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                pf_name = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$schemaFieldNameList
     */
    @LispMethod(comment = "#$afterRemoving for #$schemaFieldNameList")
    public static final SubLObject sksi_unreify_physical_schema_fields_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$schemaFieldNameList)) {
            {
                SubLObject ps = assertions_high.gaf_arg1(assertion);
                SubLObject pf_names = el_list_items(assertions_high.gaf_arg2(assertion));
                SubLObject cdolist_list_var = pf_names;
                SubLObject pf_name = NIL;
                for (pf_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pf_name = cdolist_list_var.first()) {
                    {
                        SubLObject pf = narts_high.find_nart(make_binary_formula($$PhysicalFieldFn, ps, pf_name));
                        if (NIL != nart_handles.nart_p(pf)) {
                            cyc_kernel.cyc_kill(pf);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$schemaFieldNameList
     */
    @LispMethod(comment = "#$afterRemoving for #$schemaFieldNameList")
    public static SubLObject sksi_unreify_physical_schema_fields(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$schemaFieldNameList)) {
            final SubLObject ps = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject pf_names = cdolist_list_var = el_list_items(assertions_high.gaf_arg2(assertion));
            SubLObject pf_name = NIL;
            pf_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pf = narts_high.find_nart(make_binary_formula($$PhysicalFieldFn, ps, pf_name));
                if (NIL != nart_handles.nart_p(pf)) {
                    cyc_kernel.cyc_kill(pf);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pf_name = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$quotedIsa
     */
    @LispMethod(comment = "#$afterAdding for #$quotedIsa")
    public static final SubLObject sksi_quoted_isa_after_addings_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$quotedIsa)) {
            if (assertions_high.gaf_arg2(assertion) == $$LogicalFieldIndexical) {
                sksi_infrastructure_utilities.possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$quotedIsa
     */
    @LispMethod(comment = "#$afterAdding for #$quotedIsa")
    public static SubLObject sksi_quoted_isa_after_addings(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$quotedIsa)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(assertion), $$LogicalFieldIndexical))) {
            sksi_infrastructure_utilities.possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$quotedIsa
     */
    @LispMethod(comment = "#$afterRemoving for #$quotedIsa")
    public static final SubLObject sksi_quoted_isa_after_removings_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$quotedIsa)) {
            if (assertions_high.gaf_arg2(assertion) == $$LogicalFieldIndexical) {
                sksi_infrastructure_utilities.possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$quotedIsa
     */
    @LispMethod(comment = "#$afterRemoving for #$quotedIsa")
    public static SubLObject sksi_quoted_isa_after_removings(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$quotedIsa)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(assertion), $$LogicalFieldIndexical))) {
            sksi_infrastructure_utilities.possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
        }
        return NIL;
    }

    public static final SubLObject sksi_edit_access_path_property_for_sks_alt(SubLObject sk_source, SubLObject property, SubLObject value, SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                SubLObject mt_var = mapping_mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                            SubLObject cdolist_list_var = sub_ks_list;
                            SubLObject sub_ks = NIL;
                            for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                {
                                    SubLObject pcase_var = operation;
                                    if (pcase_var.eql($ADD)) {
                                        sksi_access_path.add_to_external_source_access_path(sub_ks, property, value);
                                    } else {
                                        if (pcase_var.eql($REMOVE)) {
                                            sksi_access_path.remove_from_external_source_access_path(sub_ks, property, value);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_edit_access_path_property_for_sks(final SubLObject sk_source, final SubLObject property, final SubLObject value, final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var;
        final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_list = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
            SubLObject sub_ks = NIL;
            sub_ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (operation.eql($ADD)) {
                    sksi_access_path.add_to_external_source_access_path(sub_ks, property, value);
                } else
                    if (operation.eql($REMOVE)) {
                        sksi_access_path.remove_from_external_source_access_path(sub_ks, property, value);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                sub_ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksIsa
     */
    @LispMethod(comment = "#$afterRemoving for #$sksIsa")
    public static final SubLObject sksi_remove_sks_isa_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sksIsa)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                sksi_access_path.remove_external_source_access_path_from_cache(sk_source, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksIsa
     */
    @LispMethod(comment = "#$afterRemoving for #$sksIsa")
    public static SubLObject sksi_remove_sks_isa(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksIsa)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            sksi_access_path.remove_external_source_access_path_from_cache(sk_source, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$structuredKnowledgeSourceName
     */
    @LispMethod(comment = "#$afterAdding for #$structuredKnowledgeSourceName")
    public static final SubLObject sksi_add_structured_knowledge_source_name_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$structuredKnowledgeSourceName)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject name = assertions_high.gaf_arg2(assertion);
                if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$structuredKnowledgeSourceName, name, $ADD);
                }
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$structuredKnowledgeSourceName
     */
    @LispMethod(comment = "#$afterAdding for #$structuredKnowledgeSourceName")
    public static SubLObject sksi_add_structured_knowledge_source_name(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$structuredKnowledgeSourceName)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject name = assertions_high.gaf_arg2(assertion);
            if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, $$structuredKnowledgeSourceName, name, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$structuredKnowledgeSourceName
     */
    @LispMethod(comment = "#$afterRemoving for #$structuredKnowledgeSourceName")
    public static final SubLObject sksi_remove_structured_knowledge_source_name_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$structuredKnowledgeSourceName)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject name = assertions_high.gaf_arg2(assertion);
                if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$structuredKnowledgeSourceName, name, $REMOVE);
                }
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$structuredKnowledgeSourceName
     */
    @LispMethod(comment = "#$afterRemoving for #$structuredKnowledgeSourceName")
    public static SubLObject sksi_remove_structured_knowledge_source_name(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$structuredKnowledgeSourceName)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject name = assertions_high.gaf_arg2(assertion);
            if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, $$structuredKnowledgeSourceName, name, $REMOVE);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_add_structured_knowledge_source_namespace(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $const15$structuredKnowledgeSourceNamespac)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject namespace = assertions_high.gaf_arg2(assertion);
            if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, $const15$structuredKnowledgeSourceNamespac, namespace, $ADD);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_remove_structured_knowledge_source_namespace(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $const15$structuredKnowledgeSourceNamespac)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject namespace = assertions_high.gaf_arg2(assertion);
            if (NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, $const15$structuredKnowledgeSourceNamespac, namespace, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$serverOfSKS
     */
    @LispMethod(comment = "#$afterAdding for #$serverOfSKS")
    public static final SubLObject sksi_add_server_of_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$serverOfSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject server = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$serverOfSKS, server, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$serverOfSKS
     */
    @LispMethod(comment = "#$afterAdding for #$serverOfSKS")
    public static SubLObject sksi_add_server_of_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$serverOfSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject server = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$serverOfSKS, server, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$serverOfSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$serverOfSKS")
    public static final SubLObject sksi_remove_server_of_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$serverOfSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject server = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$serverOfSKS, server, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$serverOfSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$serverOfSKS")
    public static SubLObject sksi_remove_server_of_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$serverOfSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject server = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$serverOfSKS, server, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$portNumberForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$portNumberForSKS")
    public static final SubLObject sksi_add_port_number_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$portNumberForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject port = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$portNumberForSKS, port, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$portNumberForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$portNumberForSKS")
    public static SubLObject sksi_add_port_number_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$portNumberForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$portNumberForSKS, port, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$portNumberForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$portNumberForSKS")
    public static final SubLObject sksi_remove_port_number_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$portNumberForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject port = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$portNumberForSKS, port, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$portNumberForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$portNumberForSKS")
    public static SubLObject sksi_remove_port_number_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$portNumberForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$portNumberForSKS, port, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sksProxyHost
     */
    @LispMethod(comment = "#$afterAdding for #$sksProxyHost")
    public static final SubLObject sksi_add_sks_proxy_host_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sksProxyHost)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject host = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyHost, host, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sksProxyHost
     */
    @LispMethod(comment = "#$afterAdding for #$sksProxyHost")
    public static SubLObject sksi_add_sks_proxy_host(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksProxyHost)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject host = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyHost, host, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksProxyHost
     */
    @LispMethod(comment = "#$afterRemoving for #$sksProxyHost")
    public static final SubLObject sksi_remove_sks_proxy_host_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sksProxyHost)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject host = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyHost, host, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksProxyHost
     */
    @LispMethod(comment = "#$afterRemoving for #$sksProxyHost")
    public static SubLObject sksi_remove_sks_proxy_host(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksProxyHost)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject host = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyHost, host, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sksProxyPort
     */
    @LispMethod(comment = "#$afterAdding for #$sksProxyPort")
    public static final SubLObject sksi_add_sks_proxy_port_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sksProxyPort)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject port = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyPort, port, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sksProxyPort
     */
    @LispMethod(comment = "#$afterAdding for #$sksProxyPort")
    public static SubLObject sksi_add_sks_proxy_port(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksProxyPort)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyPort, port, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksProxyPort
     */
    @LispMethod(comment = "#$afterRemoving for #$sksProxyPort")
    public static final SubLObject sksi_remove_sks_proxy_port_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sksProxyPort)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject port = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyPort, port, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sksProxyPort
     */
    @LispMethod(comment = "#$afterRemoving for #$sksProxyPort")
    public static SubLObject sksi_remove_sks_proxy_port(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksProxyPort)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksProxyPort, port, $REMOVE);
        }
        return NIL;
    }

    public static SubLObject sksi_add_sks_connection_timeout(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksConnectionTimeout)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject timeout = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksConnectionTimeout, timeout, $ADD);
        }
        return NIL;
    }

    public static SubLObject sksi_remove_sks_connection_timeout(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sksConnectionTimeout)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject timeout = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sksConnectionTimeout, timeout, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$userNameForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$userNameForSKS")
    public static final SubLObject sksi_add_user_name_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$userNameForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject user = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$userNameForSKS, user, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$userNameForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$userNameForSKS")
    public static SubLObject sksi_add_user_name_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$userNameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject user = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$userNameForSKS, user, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$userNameForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$userNameForSKS")
    public static final SubLObject sksi_remove_user_name_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$userNameForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject user = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$userNameForSKS, user, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$userNameForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$userNameForSKS")
    public static SubLObject sksi_remove_user_name_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$userNameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject user = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$userNameForSKS, user, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$passwordForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$passwordForSKS")
    public static final SubLObject sksi_add_password_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$passwordForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject password = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$passwordForSKS, password, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$passwordForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$passwordForSKS")
    public static SubLObject sksi_add_password_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$passwordForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject password = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$passwordForSKS, password, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$passwordForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$passwordForSKS")
    public static final SubLObject sksi_remove_password_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$passwordForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject password = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$passwordForSKS, password, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$passwordForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$passwordForSKS")
    public static SubLObject sksi_remove_password_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$passwordForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject password = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$passwordForSKS, password, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$subProtocolForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$subProtocolForSKS")
    public static final SubLObject sksi_add_subprotocol_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$subProtocolForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$subProtocolForSKS, subprotocol, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$subProtocolForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$subProtocolForSKS")
    public static SubLObject sksi_add_subprotocol_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$subProtocolForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$subProtocolForSKS, subprotocol, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$subProtocolForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$subProtocolForSKS")
    public static final SubLObject sksi_remove_subprotocol_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$subProtocolForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$subProtocolForSKS, subprotocol, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$subProtocolForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$subProtocolForSKS")
    public static SubLObject sksi_remove_subprotocol_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$subProtocolForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$subProtocolForSKS, subprotocol, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sqlProgramForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$sqlProgramForSKS")
    public static final SubLObject sksi_add_sql_program_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sqlProgramForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject sql_program = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sqlProgramForSKS, sql_program, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$sqlProgramForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$sqlProgramForSKS")
    public static SubLObject sksi_add_sql_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sqlProgramForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject sql_program = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sqlProgramForSKS, sql_program, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sqlProgramForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$sqlProgramForSKS")
    public static final SubLObject sksi_remove_sql_program_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$sqlProgramForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject sql_program = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$sqlProgramForSKS, sql_program, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$sqlProgramForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$sqlProgramForSKS")
    public static SubLObject sksi_remove_sql_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$sqlProgramForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject sql_program = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$sqlProgramForSKS, sql_program, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$filenameForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$filenameForSKS")
    public static final SubLObject sksi_add_filename_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$filenameForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject filename = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$filenameForSKS, filename, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$filenameForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$filenameForSKS")
    public static SubLObject sksi_add_filename_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$filenameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject filename = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$filenameForSKS, filename, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$filenameForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$filenameForSKS")
    public static final SubLObject sksi_remove_filename_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$filenameForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject filename = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$filenameForSKS, filename, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$filenameForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$filenameForSKS")
    public static SubLObject sksi_remove_filename_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$filenameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject filename = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$filenameForSKS, filename, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$keyTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$keyTestFunctionForSKS")
    public static final SubLObject sksi_add_key_test_function_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$keyTestFunctionForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject test_fn = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$keyTestFunctionForSKS, test_fn, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$keyTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$keyTestFunctionForSKS")
    public static SubLObject sksi_add_key_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$keyTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$keyTestFunctionForSKS, test_fn, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$keyTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$keyTestFunctionForSKS")
    public static final SubLObject sksi_remove_key_test_function_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$keyTestFunctionForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject test_fn = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$keyTestFunctionForSKS, test_fn, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$keyTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$keyTestFunctionForSKS")
    public static SubLObject sksi_remove_key_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$keyTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$keyTestFunctionForSKS, test_fn, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$valueTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$valueTestFunctionForSKS")
    public static final SubLObject sksi_add_value_test_function_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$valueTestFunctionForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject test_fn = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$valueTestFunctionForSKS, test_fn, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$valueTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$valueTestFunctionForSKS")
    public static SubLObject sksi_add_value_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$valueTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$valueTestFunctionForSKS, test_fn, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$valueTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$valueTestFunctionForSKS")
    public static final SubLObject sksi_remove_value_test_function_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$valueTestFunctionForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject test_fn = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$valueTestFunctionForSKS, test_fn, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$valueTestFunctionForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$valueTestFunctionForSKS")
    public static SubLObject sksi_remove_value_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$valueTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$valueTestFunctionForSKS, test_fn, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$serializationTypeForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$serializationTypeForSKS")
    public static final SubLObject sksi_add_serialization_type_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$serializationTypeForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject serialization = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$serializationTypeForSKS, serialization, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$serializationTypeForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$serializationTypeForSKS")
    public static SubLObject sksi_add_serialization_type_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$serializationTypeForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject serialization = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$serializationTypeForSKS, serialization, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$serializationTypeForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$serializationTypeForSKS")
    public static final SubLObject sksi_remove_serialization_type_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$serializationTypeForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject serialization = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$serializationTypeForSKS, serialization, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$serializationTypeForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$serializationTypeForSKS")
    public static SubLObject sksi_remove_serialization_type_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$serializationTypeForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject serialization = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$serializationTypeForSKS, serialization, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$httpdRequestURLForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$httpdRequestURLForSKS")
    public static final SubLObject sksi_add_httpd_request_url_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$httpdRequestURLForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject url = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$httpdRequestURLForSKS, url, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$httpdRequestURLForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$httpdRequestURLForSKS")
    public static SubLObject sksi_add_httpd_request_url_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$httpdRequestURLForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject url = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$httpdRequestURLForSKS, url, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$httpdRequestURLForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestURLForSKS")
    public static final SubLObject sksi_remove_httpd_request_url_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$httpdRequestURLForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject url = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$httpdRequestURLForSKS, url, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$httpdRequestURLForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestURLForSKS")
    public static SubLObject sksi_remove_httpd_request_url_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$httpdRequestURLForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject url = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$httpdRequestURLForSKS, url, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$httpdRequestMethodForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestMethodForSKS")
    public static final SubLObject sksi_remove_httpd_request_method_for_sks_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$httpdRequestMethodForSKS)) {
                {
                    SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                    SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                                SubLObject cdolist_list_var = sub_ks_list;
                                SubLObject sub_ks = NIL;
                                for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * #$afterRemoving for #$httpdRequestMethodForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestMethodForSKS")
    public static SubLObject sksi_remove_httpd_request_method_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$httpdRequestMethodForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject sub_ks_list = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                SubLObject sub_ks = NIL;
                sub_ks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$httpdRequestQueryTemplateForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestQueryTemplateForSKS")
    public static final SubLObject sksi_remove_httpd_request_query_template_for_sks_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$httpdRequestQueryTemplateForSKS)) {
                {
                    SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                    SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                                SubLObject cdolist_list_var = sub_ks_list;
                                SubLObject sub_ks = NIL;
                                for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * #$afterRemoving for #$httpdRequestQueryTemplateForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestQueryTemplateForSKS")
    public static SubLObject sksi_remove_httpd_request_query_template_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$httpdRequestQueryTemplateForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject sub_ks_list = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                SubLObject sub_ks = NIL;
                sub_ks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$httpdRequestSubLBooleanParsingProgramForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestSubLBooleanParsingProgramForSKS")
    public static final SubLObject sksi_remove_httpd_request_subl_boolean_parsing_program_for_sks_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $const58$httpdRequestSubLBooleanParsingPro)) {
                {
                    SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                    SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                    SubLObject mt_var = mapping_mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                                SubLObject cdolist_list_var = sub_ks_list;
                                SubLObject sub_ks = NIL;
                                for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * #$afterRemoving for #$httpdRequestSubLBooleanParsingProgramForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$httpdRequestSubLBooleanParsingProgramForSKS")
    public static SubLObject sksi_remove_httpd_request_subl_boolean_parsing_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $const64$httpdRequestSubLBooleanParsingPro)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject sub_ks_list = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                SubLObject sub_ks = NIL;
                sub_ks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$baseNamespaceForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$baseNamespaceForSKS")
    public static final SubLObject sksi_add_base_namespace_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$baseNamespaceForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$baseNamespaceForSKS, base_namespace, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$baseNamespaceForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$baseNamespaceForSKS")
    public static SubLObject sksi_add_base_namespace_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$baseNamespaceForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
            sksi_edit_access_path_property_for_sks(sk_source, $$baseNamespaceForSKS, base_namespace, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$baseNamespaceForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$baseNamespaceForSKS")
    public static final SubLObject sksi_remove_base_namespace_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$baseNamespaceForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$baseNamespaceForSKS, base_namespace, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$baseNamespaceForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$baseNamespaceForSKS")
    public static SubLObject sksi_remove_base_namespace_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$baseNamespaceForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
            sksi_edit_access_path_property_for_sks(sk_source, $$baseNamespaceForSKS, base_namespace, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding and #$afterRemoving for #$nameSpacePrefixForSKS
     */
    @LispMethod(comment = "#$afterAdding and #$afterRemoving for #$nameSpacePrefixForSKS")
    public static final SubLObject sksi_recompute_name_space_prefix_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$nameSpacePrefixForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject uri_map = sksi_access_path.get_sks_prefix_to_uri_map(sk_source);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$nameSpacePrefixForSKS, uri_map, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding and #$afterRemoving for #$nameSpacePrefixForSKS
     */
    @LispMethod(comment = "#$afterAdding and #$afterRemoving for #$nameSpacePrefixForSKS")
    public static SubLObject sksi_recompute_name_space_prefix_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$nameSpacePrefixForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject uri_map = sksi_access_path.get_sks_prefix_to_uri_map(sk_source);
            sksi_edit_access_path_property_for_sks(sk_source, $$nameSpacePrefixForSKS, uri_map, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$rdfStoreIdentifierForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$rdfStoreIdentifierForSKS")
    public static final SubLObject sksi_add_rdf_store_identifier_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$rdfStoreIdentifierForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$rdfStoreIdentifierForSKS, rdf_store_identifier, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$rdfStoreIdentifierForSKS
     */
    @LispMethod(comment = "#$afterAdding for #$rdfStoreIdentifierForSKS")
    public static SubLObject sksi_add_rdf_store_identifier_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$rdfStoreIdentifierForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$rdfStoreIdentifierForSKS, rdf_store_identifier, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$rdfStoreIdentifierForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$rdfStoreIdentifierForSKS")
    public static final SubLObject sksi_remove_rdf_store_identifier_for_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$rdfStoreIdentifierForSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$rdfStoreIdentifierForSKS, rdf_store_identifier, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$rdfStoreIdentifierForSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$rdfStoreIdentifierForSKS")
    public static SubLObject sksi_remove_rdf_store_identifier_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$rdfStoreIdentifierForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$rdfStoreIdentifierForSKS, rdf_store_identifier, $REMOVE);
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$relativePathForAPIAccessToSKS
     */
    @LispMethod(comment = "#$afterAdding for #$relativePathForAPIAccessToSKS")
    public static final SubLObject sksi_add_relative_path_for_api_access_to_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$relativePathForAPIAccessToSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$relativePathForAPIAccessToSKS, relative_path_for_api_access, $ADD);
            }
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$relativePathForAPIAccessToSKS
     */
    @LispMethod(comment = "#$afterAdding for #$relativePathForAPIAccessToSKS")
    public static SubLObject sksi_add_relative_path_for_api_access_to_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$relativePathForAPIAccessToSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$relativePathForAPIAccessToSKS, relative_path_for_api_access, $ADD);
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$relativePathForAPIAccessToSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$relativePathForAPIAccessToSKS")
    public static final SubLObject sksi_remove_relative_path_for_api_access_to_sks_alt(SubLObject argument, SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$relativePathForAPIAccessToSKS)) {
            {
                SubLObject sk_source = assertions_high.gaf_arg1(assertion);
                SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_edit_access_path_property_for_sks(sk_source, $$relativePathForAPIAccessToSKS, relative_path_for_api_access, $REMOVE);
            }
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$relativePathForAPIAccessToSKS
     */
    @LispMethod(comment = "#$afterRemoving for #$relativePathForAPIAccessToSKS")
    public static SubLObject sksi_remove_relative_path_for_api_access_to_sks(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$relativePathForAPIAccessToSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, $$relativePathForAPIAccessToSKS, relative_path_for_api_access, $REMOVE);
        }
        return NIL;
    }

    public static final SubLObject sksi_automatic_cost_estimate_update_enabledP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_automatic_cost_estimate_update_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject enable_sksi_automatic_cost_estimate_update_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue(T, thread);
            return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject enable_sksi_automatic_cost_estimate_update() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue(T, thread);
        return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject disable_sksi_automatic_cost_estimate_update_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue(NIL, thread);
            return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
        }
    }

    public static SubLObject disable_sksi_automatic_cost_estimate_update() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue(NIL, thread);
        return $sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject with_sksi_automatic_cost_estimate_update_enabled_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt72, bq_cons(PROGN, append(body, NIL)));
        }
    }

    public static SubLObject with_sksi_automatic_cost_estimate_update_enabled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list78, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject with_sksi_automatic_cost_estimate_update_disabled_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt74, bq_cons(PROGN, append(body, NIL)));
        }
    }

    public static SubLObject with_sksi_automatic_cost_estimate_update_disabled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list80, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject sksi_automatic_cost_estimate_update_add_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt76);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject timed_out = $sym77$TIMED_OUT;
                            return list(IGNORE_ERRORS, list(CLET, list(timed_out), list(PWHEN, list(CAND, $list_alt81, list(GAF_ASSERTION_WITH_PRED_P, assertion, pred)), listS(WITH_TIMEOUT, list($sksi_automatic_cost_estimate_update_timeout$, timed_out), list(IGNORE, timed_out), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_automatic_cost_estimate_update_add(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject timed_out = $sym83$TIMED_OUT;
            return list(IGNORE_ERRORS, list(CLET, list(timed_out), list(PWHEN, list(CAND, $list87, list(TRUE_GAF_ASSERTION_WITH_PRED_P, assertion, pred)), listS(WITH_TIMEOUT, list($sksi_automatic_cost_estimate_update_timeout$, timed_out), list(IGNORE, timed_out), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    public static final SubLObject sksi_automatic_cost_estimate_update_remove_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt76);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(IGNORE_ERRORS, listS(PWHEN, list(CAND, $list_alt81, list(GAF_ASSERTION_WITH_PRED_P, assertion, pred)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_automatic_cost_estimate_update_remove(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(IGNORE_ERRORS, listS(PWHEN, list(CAND, $list87, list(TRUE_GAF_ASSERTION_WITH_PRED_P, assertion, pred)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    /**
     * #$afterAdding for #$meaningSentenceOfSchema
     */
    @LispMethod(comment = "#$afterAdding for #$meaningSentenceOfSchema")
    public static final SubLObject sksi_add_cost_estimates_for_meaning_sentence_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject timed_out = NIL;
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$meaningSentenceOfSchema))) {
                                        {
                                            SubLObject tag = with_timeout_make_tag();
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_1 = $within_with_timeout$.currentBinding(thread);
                                                    try {
                                                        $within_with_timeout$.bind(T, thread);
                                                        {
                                                            SubLObject timer = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                    try {
                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                                                        sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, $ONLY_ADD);
                                                                    } finally {
                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_2, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        with_timeout_stop_timer(timer);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $within_with_timeout$.rebind(_prev_bind_0_1, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                            }
                                        }
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
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "#$afterAdding for #$meaningSentenceOfSchema")
    public static SubLObject sksi_add_cost_estimates_for_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = NIL;
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$meaningSentenceOfSchema))) {
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$1 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, $ONLY_ADD);
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$meaningSentenceOfSchema
     */
    @LispMethod(comment = "#$afterRemoving for #$meaningSentenceOfSchema")
    public static final SubLObject sksi_remove_cost_estimates_for_meaning_sentence_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$meaningSentenceOfSchema))) {
                                sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, $ONLY_REMOVE);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$afterRemoving for #$meaningSentenceOfSchema")
    public static SubLObject sksi_remove_cost_estimates_for_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$meaningSentenceOfSchema))) {
                        sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, $ONLY_REMOVE);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$conditionalMeaningSentenceOfSchema
     */
    @LispMethod(comment = "#$afterAdding for #$conditionalMeaningSentenceOfSchema")
    public static final SubLObject sksi_add_cost_estimates_for_conditional_meaning_sentence_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject timed_out = NIL;
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $const93$conditionalMeaningSentenceOfSchem))) {
                                        {
                                            SubLObject tag = with_timeout_make_tag();
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_4 = $within_with_timeout$.currentBinding(thread);
                                                    try {
                                                        $within_with_timeout$.bind(T, thread);
                                                        {
                                                            SubLObject timer = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_5 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                    try {
                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                                                        sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, $ONLY_ADD);
                                                                    } finally {
                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        with_timeout_stop_timer(timer);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $within_with_timeout$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                            }
                                        }
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
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "#$afterAdding for #$conditionalMeaningSentenceOfSchema")
    public static SubLObject sksi_add_cost_estimates_for_conditional_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = NIL;
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $const99$conditionalMeaningSentenceOfSchem))) {
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$4 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$5 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, $ONLY_ADD);
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$5, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$4, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$conditionalMeaningSentenceOfSchema
     */
    @LispMethod(comment = "#$afterRemoving for #$conditionalMeaningSentenceOfSchema")
    public static final SubLObject sksi_remove_cost_estimates_for_conditional_meaning_sentence_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $const93$conditionalMeaningSentenceOfSchem))) {
                                sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, $ONLY_REMOVE);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$afterRemoving for #$conditionalMeaningSentenceOfSchema")
    public static SubLObject sksi_remove_cost_estimates_for_conditional_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $const99$conditionalMeaningSentenceOfSchem))) {
                        sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, $ONLY_REMOVE);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$fieldDecoding
     */
    @LispMethod(comment = "#$afterAdding for #$fieldDecoding")
    public static final SubLObject sksi_add_cost_estimates_for_field_decoding_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject timed_out = NIL;
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$fieldDecoding))) {
                                        {
                                            SubLObject tag = with_timeout_make_tag();
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_7 = $within_with_timeout$.currentBinding(thread);
                                                    try {
                                                        $within_with_timeout$.bind(T, thread);
                                                        {
                                                            SubLObject timer = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_8 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                    try {
                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                                                        sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, $ONLY_ADD);
                                                                    } finally {
                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        with_timeout_stop_timer(timer);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $within_with_timeout$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                            }
                                        }
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
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "#$afterAdding for #$fieldDecoding")
    public static SubLObject sksi_add_cost_estimates_for_field_decoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = NIL;
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$fieldDecoding))) {
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$7 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$8 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, $ONLY_ADD);
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$8, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$7, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$fieldDecoding
     */
    @LispMethod(comment = "#$afterRemoving for #$fieldDecoding")
    public static final SubLObject sksi_remove_cost_estimates_for_field_decoding_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$fieldDecoding))) {
                                sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, $ONLY_REMOVE);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$afterRemoving for #$fieldDecoding")
    public static SubLObject sksi_remove_cost_estimates_for_field_decoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$fieldDecoding))) {
                        sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, $ONLY_REMOVE);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterAdding for #$fieldEncoding
     */
    @LispMethod(comment = "#$afterAdding for #$fieldEncoding")
    public static final SubLObject sksi_add_cost_estimates_for_field_encoding_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject timed_out = NIL;
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$fieldEncoding))) {
                                        {
                                            SubLObject tag = with_timeout_make_tag();
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_10 = $within_with_timeout$.currentBinding(thread);
                                                    try {
                                                        $within_with_timeout$.bind(T, thread);
                                                        {
                                                            SubLObject timer = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                    try {
                                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                                                        sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, $ONLY_ADD);
                                                                    } finally {
                                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_11, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        with_timeout_stop_timer(timer);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $within_with_timeout$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                            }
                                        }
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
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "#$afterAdding for #$fieldEncoding")
    public static SubLObject sksi_add_cost_estimates_for_field_encoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = NIL;
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$fieldEncoding))) {
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$10 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer($sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, $ONLY_ADD);
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * #$afterRemoving for #$fieldEncoding
     */
    @LispMethod(comment = "#$afterRemoving for #$fieldEncoding")
    public static final SubLObject sksi_remove_cost_estimates_for_field_encoding_alt(SubLObject argument, SubLObject assertion) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if ((NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings.sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$fieldEncoding))) {
                                sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, $ONLY_REMOVE);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#$afterRemoving for #$fieldEncoding")
    public static SubLObject sksi_remove_cost_estimates_for_field_encoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ((NIL != sksi_automatic_cost_estimate_update_enabledP()) && (NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, $$fieldEncoding))) {
                        sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, $ONLY_REMOVE);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject declare_sksi_after_addings_file() {
        declareFunction("sksi_reify_physical_schema_fields", "SKSI-REIFY-PHYSICAL-SCHEMA-FIELDS", 2, 0, false);
        declareFunction("sksi_unreify_physical_schema_fields", "SKSI-UNREIFY-PHYSICAL-SCHEMA-FIELDS", 2, 0, false);
        declareFunction("sksi_quoted_isa_after_addings", "SKSI-QUOTED-ISA-AFTER-ADDINGS", 2, 0, false);
        declareFunction("sksi_quoted_isa_after_removings", "SKSI-QUOTED-ISA-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("sksi_edit_access_path_property_for_sks", "SKSI-EDIT-ACCESS-PATH-PROPERTY-FOR-SKS", 4, 0, false);
        declareFunction("sksi_remove_sks_isa", "SKSI-REMOVE-SKS-ISA", 2, 0, false);
        declareFunction("sksi_add_structured_knowledge_source_name", "SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAME", 2, 0, false);
        declareFunction("sksi_remove_structured_knowledge_source_name", "SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAME", 2, 0, false);
        declareFunction("sksi_add_structured_knowledge_source_namespace", "SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE", 2, 0, false);
        declareFunction("sksi_remove_structured_knowledge_source_namespace", "SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE", 2, 0, false);
        declareFunction("sksi_add_server_of_sks", "SKSI-ADD-SERVER-OF-SKS", 2, 0, false);
        declareFunction("sksi_remove_server_of_sks", "SKSI-REMOVE-SERVER-OF-SKS", 2, 0, false);
        declareFunction("sksi_add_port_number_for_sks", "SKSI-ADD-PORT-NUMBER-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_port_number_for_sks", "SKSI-REMOVE-PORT-NUMBER-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_sks_proxy_host", "SKSI-ADD-SKS-PROXY-HOST", 2, 0, false);
        declareFunction("sksi_remove_sks_proxy_host", "SKSI-REMOVE-SKS-PROXY-HOST", 2, 0, false);
        declareFunction("sksi_add_sks_proxy_port", "SKSI-ADD-SKS-PROXY-PORT", 2, 0, false);
        declareFunction("sksi_remove_sks_proxy_port", "SKSI-REMOVE-SKS-PROXY-PORT", 2, 0, false);
        declareFunction("sksi_add_sks_connection_timeout", "SKSI-ADD-SKS-CONNECTION-TIMEOUT", 2, 0, false);
        declareFunction("sksi_remove_sks_connection_timeout", "SKSI-REMOVE-SKS-CONNECTION-TIMEOUT", 2, 0, false);
        declareFunction("sksi_add_user_name_for_sks", "SKSI-ADD-USER-NAME-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_user_name_for_sks", "SKSI-REMOVE-USER-NAME-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_password_for_sks", "SKSI-ADD-PASSWORD-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_password_for_sks", "SKSI-REMOVE-PASSWORD-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_subprotocol_for_sks", "SKSI-ADD-SUBPROTOCOL-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_subprotocol_for_sks", "SKSI-REMOVE-SUBPROTOCOL-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_sql_program_for_sks", "SKSI-ADD-SQL-PROGRAM-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_sql_program_for_sks", "SKSI-REMOVE-SQL-PROGRAM-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_filename_for_sks", "SKSI-ADD-FILENAME-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_filename_for_sks", "SKSI-REMOVE-FILENAME-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_key_test_function_for_sks", "SKSI-ADD-KEY-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_key_test_function_for_sks", "SKSI-REMOVE-KEY-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_value_test_function_for_sks", "SKSI-ADD-VALUE-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_value_test_function_for_sks", "SKSI-REMOVE-VALUE-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_serialization_type_for_sks", "SKSI-ADD-SERIALIZATION-TYPE-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_serialization_type_for_sks", "SKSI-REMOVE-SERIALIZATION-TYPE-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_httpd_request_url_for_sks", "SKSI-ADD-HTTPD-REQUEST-URL-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_httpd_request_url_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-URL-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_httpd_request_method_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-METHOD-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_httpd_request_query_template_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-QUERY-TEMPLATE-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_httpd_request_subl_boolean_parsing_program_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-SUBL-BOOLEAN-PARSING-PROGRAM-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_base_namespace_for_sks", "SKSI-ADD-BASE-NAMESPACE-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_base_namespace_for_sks", "SKSI-REMOVE-BASE-NAMESPACE-FOR-SKS", 2, 0, false);
        declareFunction("sksi_recompute_name_space_prefix_for_sks", "SKSI-RECOMPUTE-NAME-SPACE-PREFIX-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_rdf_store_identifier_for_sks", "SKSI-ADD-RDF-STORE-IDENTIFIER-FOR-SKS", 2, 0, false);
        declareFunction("sksi_remove_rdf_store_identifier_for_sks", "SKSI-REMOVE-RDF-STORE-IDENTIFIER-FOR-SKS", 2, 0, false);
        declareFunction("sksi_add_relative_path_for_api_access_to_sks", "SKSI-ADD-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS", 2, 0, false);
        declareFunction("sksi_remove_relative_path_for_api_access_to_sks", "SKSI-REMOVE-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS", 2, 0, false);
        declareFunction("sksi_automatic_cost_estimate_update_enabledP", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?", 0, 0, false);
        declareFunction("enable_sksi_automatic_cost_estimate_update", "ENABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE", 0, 0, false);
        declareFunction("disable_sksi_automatic_cost_estimate_update", "DISABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE", 0, 0, false);
        declareMacro("with_sksi_automatic_cost_estimate_update_enabled", "WITH-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED");
        declareMacro("with_sksi_automatic_cost_estimate_update_disabled", "WITH-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-DISABLED");
        declareMacro("sksi_automatic_cost_estimate_update_add", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ADD");
        declareMacro("sksi_automatic_cost_estimate_update_remove", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-REMOVE");
        declareFunction("sksi_add_cost_estimates_for_meaning_sentence", "SKSI-ADD-COST-ESTIMATES-FOR-MEANING-SENTENCE", 2, 0, false);
        declareFunction("sksi_remove_cost_estimates_for_meaning_sentence", "SKSI-REMOVE-COST-ESTIMATES-FOR-MEANING-SENTENCE", 2, 0, false);
        declareFunction("sksi_add_cost_estimates_for_conditional_meaning_sentence", "SKSI-ADD-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        declareFunction("sksi_remove_cost_estimates_for_conditional_meaning_sentence", "SKSI-REMOVE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        declareFunction("sksi_add_cost_estimates_for_field_decoding", "SKSI-ADD-COST-ESTIMATES-FOR-FIELD-DECODING", 2, 0, false);
        declareFunction("sksi_remove_cost_estimates_for_field_decoding", "SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-DECODING", 2, 0, false);
        declareFunction("sksi_add_cost_estimates_for_field_encoding", "SKSI-ADD-COST-ESTIMATES-FOR-FIELD-ENCODING", 2, 0, false);
        declareFunction("sksi_remove_cost_estimates_for_field_encoding", "SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-ENCODING", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_after_addings_file() {
        defparameter("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*", NIL);
        deflexical("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-TIMEOUT*", $int$120);
        return NIL;
    }

    public static SubLObject setup_sksi_after_addings_file() {
        register_kb_function(SKSI_REIFY_PHYSICAL_SCHEMA_FIELDS);
        register_kb_function(SKSI_UNREIFY_PHYSICAL_SCHEMA_FIELDS);
        register_kb_function(SKSI_QUOTED_ISA_AFTER_ADDINGS);
        register_kb_function(SKSI_QUOTED_ISA_AFTER_REMOVINGS);
        register_kb_function(SKSI_REMOVE_SKS_ISA);
        register_kb_function(SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAME);
        register_kb_function(SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAME);
        register_kb_function(SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE);
        register_kb_function(SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE);
        register_kb_function(SKSI_ADD_SERVER_OF_SKS);
        register_kb_function(SKSI_REMOVE_SERVER_OF_SKS);
        register_kb_function(SKSI_ADD_PORT_NUMBER_FOR_SKS);
        register_kb_function(SKSI_REMOVE_PORT_NUMBER_FOR_SKS);
        register_kb_function(SKSI_ADD_SKS_PROXY_HOST);
        register_kb_function(SKSI_REMOVE_SKS_PROXY_HOST);
        register_kb_function(SKSI_ADD_SKS_PROXY_PORT);
        register_kb_function(SKSI_REMOVE_SKS_PROXY_PORT);
        register_kb_function(SKSI_ADD_SKS_CONNECTION_TIMEOUT);
        register_kb_function(SKSI_REMOVE_SKS_CONNECTION_TIMEOUT);
        register_kb_function(SKSI_ADD_USER_NAME_FOR_SKS);
        register_kb_function(SKSI_REMOVE_USER_NAME_FOR_SKS);
        register_kb_function(SKSI_ADD_PASSWORD_FOR_SKS);
        register_kb_function(SKSI_REMOVE_PASSWORD_FOR_SKS);
        register_kb_function(SKSI_ADD_SUBPROTOCOL_FOR_SKS);
        register_kb_function(SKSI_REMOVE_SUBPROTOCOL_FOR_SKS);
        register_kb_function(SKSI_ADD_SQL_PROGRAM_FOR_SKS);
        register_kb_function(SKSI_REMOVE_SQL_PROGRAM_FOR_SKS);
        register_kb_function(SKSI_ADD_FILENAME_FOR_SKS);
        register_kb_function(SKSI_REMOVE_FILENAME_FOR_SKS);
        register_kb_function(SKSI_ADD_KEY_TEST_FUNCTION_FOR_SKS);
        register_kb_function(SKSI_REMOVE_KEY_TEST_FUNCTION_FOR_SKS);
        register_kb_function(SKSI_ADD_VALUE_TEST_FUNCTION_FOR_SKS);
        register_kb_function(SKSI_REMOVE_VALUE_TEST_FUNCTION_FOR_SKS);
        register_kb_function(SKSI_ADD_SERIALIZATION_TYPE_FOR_SKS);
        register_kb_function(SKSI_REMOVE_SERIALIZATION_TYPE_FOR_SKS);
        register_kb_function(SKSI_ADD_HTTPD_REQUEST_URL_FOR_SKS);
        register_kb_function(SKSI_REMOVE_HTTPD_REQUEST_URL_FOR_SKS);
        register_kb_function(SKSI_REMOVE_HTTPD_REQUEST_METHOD_FOR_SKS);
        register_kb_function(SKSI_REMOVE_HTTPD_REQUEST_QUERY_TEMPLATE_FOR_SKS);
        register_kb_function(SKSI_REMOVE_HTTPD_REQUEST_SUBL_BOOLEAN_PARSING_PROGRAM_FOR_SKS);
        register_kb_function(SKSI_ADD_BASE_NAMESPACE_FOR_SKS);
        register_kb_function(SKSI_REMOVE_BASE_NAMESPACE_FOR_SKS);
        register_kb_function(SKSI_RECOMPUTE_NAME_SPACE_PREFIX_FOR_SKS);
        register_kb_function(SKSI_ADD_RDF_STORE_IDENTIFIER_FOR_SKS);
        register_kb_function(SKSI_REMOVE_RDF_STORE_IDENTIFIER_FOR_SKS);
        register_kb_function(SKSI_ADD_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS);
        register_kb_function(SKSI_REMOVE_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS);
        register_kb_function(SKSI_ADD_COST_ESTIMATES_FOR_MEANING_SENTENCE);
        register_kb_function(SKSI_REMOVE_COST_ESTIMATES_FOR_MEANING_SENTENCE);
        register_kb_function(SKSI_ADD_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE);
        register_kb_function(SKSI_REMOVE_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE);
        register_kb_function(SKSI_ADD_COST_ESTIMATES_FOR_FIELD_DECODING);
        register_kb_function(SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_DECODING);
        register_kb_function(SKSI_ADD_COST_ESTIMATES_FOR_FIELD_ENCODING);
        register_kb_function(SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_ENCODING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_after_addings_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_after_addings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_after_addings_file();
    }

    

    public static final SubLObject $const58$httpdRequestSubLBooleanParsingPro = reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS");

    static private final SubLList $list_alt72 = list(list(makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), T));

    static private final SubLList $list_alt74 = list(list(makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), NIL));

    static private final SubLList $list_alt76 = list(list(makeSymbol("ASSERTION"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym77$TIMED_OUT = makeUninternedSymbol("TIMED-OUT");

    static private final SubLList $list_alt81 = list(makeSymbol("SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?"));

    private static final SubLSymbol GAF_ASSERTION_WITH_PRED_P = makeSymbol("GAF-ASSERTION-WITH-PRED-P");

    public static final SubLObject $const93$conditionalMeaningSentenceOfSchem = reader_make_constant_shell("conditionalMeaningSentenceOfSchema");
}

/**
 * Total time: 295 ms
 */
