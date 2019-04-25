package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_after_addings extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings";
    public static final String myFingerPrint = "033b55ed2a73675d812a2f233fefc36d50ff9a27ca72f11f9697659fa568958e";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 26495L)
    public static SubLSymbol $sksi_automatic_cost_estimate_update_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 28442L)
    private static SubLSymbol $sksi_automatic_cost_estimate_update_timeout$;
    private static final SubLObject $const0$schemaFieldNameList;
    private static final SubLObject $const1$PhysicalFieldFn;
    private static final SubLSymbol $sym2$SKSI_REIFY_PHYSICAL_SCHEMA_FIELDS;
    private static final SubLSymbol $sym3$SKSI_UNREIFY_PHYSICAL_SCHEMA_FIELDS;
    private static final SubLObject $const4$quotedIsa;
    private static final SubLObject $const5$LogicalFieldIndexical;
    private static final SubLSymbol $sym6$SKSI_QUOTED_ISA_AFTER_ADDINGS;
    private static final SubLSymbol $sym7$SKSI_QUOTED_ISA_AFTER_REMOVINGS;
    private static final SubLSymbol $kw8$ADD;
    private static final SubLSymbol $kw9$REMOVE;
    private static final SubLObject $const10$sksIsa;
    private static final SubLSymbol $sym11$SKSI_REMOVE_SKS_ISA;
    private static final SubLObject $const12$structuredKnowledgeSourceName;
    private static final SubLSymbol $sym13$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAME;
    private static final SubLSymbol $sym14$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAME;
    private static final SubLObject $const15$structuredKnowledgeSourceNamespac;
    private static final SubLSymbol $sym16$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE;
    private static final SubLSymbol $sym17$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE;
    private static final SubLObject $const18$serverOfSKS;
    private static final SubLSymbol $sym19$SKSI_ADD_SERVER_OF_SKS;
    private static final SubLSymbol $sym20$SKSI_REMOVE_SERVER_OF_SKS;
    private static final SubLObject $const21$portNumberForSKS;
    private static final SubLSymbol $sym22$SKSI_ADD_PORT_NUMBER_FOR_SKS;
    private static final SubLSymbol $sym23$SKSI_REMOVE_PORT_NUMBER_FOR_SKS;
    private static final SubLObject $const24$sksProxyHost;
    private static final SubLSymbol $sym25$SKSI_ADD_SKS_PROXY_HOST;
    private static final SubLSymbol $sym26$SKSI_REMOVE_SKS_PROXY_HOST;
    private static final SubLObject $const27$sksProxyPort;
    private static final SubLSymbol $sym28$SKSI_ADD_SKS_PROXY_PORT;
    private static final SubLSymbol $sym29$SKSI_REMOVE_SKS_PROXY_PORT;
    private static final SubLObject $const30$sksConnectionTimeout;
    private static final SubLSymbol $sym31$SKSI_ADD_SKS_CONNECTION_TIMEOUT;
    private static final SubLSymbol $sym32$SKSI_REMOVE_SKS_CONNECTION_TIMEOUT;
    private static final SubLObject $const33$userNameForSKS;
    private static final SubLSymbol $sym34$SKSI_ADD_USER_NAME_FOR_SKS;
    private static final SubLSymbol $sym35$SKSI_REMOVE_USER_NAME_FOR_SKS;
    private static final SubLObject $const36$passwordForSKS;
    private static final SubLSymbol $sym37$SKSI_ADD_PASSWORD_FOR_SKS;
    private static final SubLSymbol $sym38$SKSI_REMOVE_PASSWORD_FOR_SKS;
    private static final SubLObject $const39$subProtocolForSKS;
    private static final SubLSymbol $sym40$SKSI_ADD_SUBPROTOCOL_FOR_SKS;
    private static final SubLSymbol $sym41$SKSI_REMOVE_SUBPROTOCOL_FOR_SKS;
    private static final SubLObject $const42$sqlProgramForSKS;
    private static final SubLSymbol $sym43$SKSI_ADD_SQL_PROGRAM_FOR_SKS;
    private static final SubLSymbol $sym44$SKSI_REMOVE_SQL_PROGRAM_FOR_SKS;
    private static final SubLObject $const45$filenameForSKS;
    private static final SubLSymbol $sym46$SKSI_ADD_FILENAME_FOR_SKS;
    private static final SubLSymbol $sym47$SKSI_REMOVE_FILENAME_FOR_SKS;
    private static final SubLObject $const48$keyTestFunctionForSKS;
    private static final SubLSymbol $sym49$SKSI_ADD_KEY_TEST_FUNCTION_FOR_SKS;
    private static final SubLSymbol $sym50$SKSI_REMOVE_KEY_TEST_FUNCTION_FOR_SKS;
    private static final SubLObject $const51$valueTestFunctionForSKS;
    private static final SubLSymbol $sym52$SKSI_ADD_VALUE_TEST_FUNCTION_FOR_SKS;
    private static final SubLSymbol $sym53$SKSI_REMOVE_VALUE_TEST_FUNCTION_FOR_SKS;
    private static final SubLObject $const54$serializationTypeForSKS;
    private static final SubLSymbol $sym55$SKSI_ADD_SERIALIZATION_TYPE_FOR_SKS;
    private static final SubLSymbol $sym56$SKSI_REMOVE_SERIALIZATION_TYPE_FOR_SKS;
    private static final SubLObject $const57$httpdRequestURLForSKS;
    private static final SubLSymbol $sym58$SKSI_ADD_HTTPD_REQUEST_URL_FOR_SKS;
    private static final SubLSymbol $sym59$SKSI_REMOVE_HTTPD_REQUEST_URL_FOR_SKS;
    private static final SubLObject $const60$httpdRequestMethodForSKS;
    private static final SubLSymbol $sym61$SKSI_REMOVE_HTTPD_REQUEST_METHOD_FOR_SKS;
    private static final SubLObject $const62$httpdRequestQueryTemplateForSKS;
    private static final SubLSymbol $sym63$SKSI_REMOVE_HTTPD_REQUEST_QUERY_TEMPLATE_FOR_SKS;
    private static final SubLObject $const64$httpdRequestSubLBooleanParsingPro;
    private static final SubLSymbol $sym65$SKSI_REMOVE_HTTPD_REQUEST_SUBL_BOOLEAN_PARSING_PROGRAM_FOR_SKS;
    private static final SubLObject $const66$baseNamespaceForSKS;
    private static final SubLSymbol $sym67$SKSI_ADD_BASE_NAMESPACE_FOR_SKS;
    private static final SubLSymbol $sym68$SKSI_REMOVE_BASE_NAMESPACE_FOR_SKS;
    private static final SubLObject $const69$nameSpacePrefixForSKS;
    private static final SubLSymbol $sym70$SKSI_RECOMPUTE_NAME_SPACE_PREFIX_FOR_SKS;
    private static final SubLObject $const71$rdfStoreIdentifierForSKS;
    private static final SubLSymbol $sym72$SKSI_ADD_RDF_STORE_IDENTIFIER_FOR_SKS;
    private static final SubLSymbol $sym73$SKSI_REMOVE_RDF_STORE_IDENTIFIER_FOR_SKS;
    private static final SubLObject $const74$relativePathForAPIAccessToSKS;
    private static final SubLSymbol $sym75$SKSI_ADD_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS;
    private static final SubLSymbol $sym76$SKSI_REMOVE_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS;
    private static final SubLSymbol $sym77$CLET;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$PROGN;
    private static final SubLList $list80;
    private static final SubLInteger $int81$120;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$TIMED_OUT;
    private static final SubLSymbol $sym84$IGNORE_ERRORS;
    private static final SubLSymbol $sym85$PWHEN;
    private static final SubLSymbol $sym86$CAND;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$TRUE_GAF_ASSERTION_WITH_PRED_P;
    private static final SubLSymbol $sym89$WITH_TIMEOUT;
    private static final SubLSymbol $sym90$_SKSI_AUTOMATIC_COST_ESTIMATE_UPDATE_TIMEOUT_;
    private static final SubLSymbol $sym91$IGNORE;
    private static final SubLSymbol $kw92$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym93$IGNORE_ERRORS_HANDLER;
    private static final SubLObject $const94$meaningSentenceOfSchema;
    private static final SubLSymbol $kw95$ONLY_ADD;
    private static final SubLSymbol $sym96$SKSI_ADD_COST_ESTIMATES_FOR_MEANING_SENTENCE;
    private static final SubLSymbol $kw97$ONLY_REMOVE;
    private static final SubLSymbol $sym98$SKSI_REMOVE_COST_ESTIMATES_FOR_MEANING_SENTENCE;
    private static final SubLObject $const99$conditionalMeaningSentenceOfSchem;
    private static final SubLSymbol $sym100$SKSI_ADD_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLSymbol $sym101$SKSI_REMOVE_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE;
    private static final SubLObject $const102$fieldDecoding;
    private static final SubLSymbol $sym103$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_DECODING;
    private static final SubLSymbol $sym104$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_DECODING;
    private static final SubLObject $const105$fieldEncoding;
    private static final SubLSymbol $sym106$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_ENCODING;
    private static final SubLSymbol $sym107$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_ENCODING;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 852L)
    public static SubLObject sksi_reify_physical_schema_fields(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const0$schemaFieldNameList)) {
            final SubLObject ps = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject pf_names = cdolist_list_var = el_utilities.el_list_items(assertions_high.gaf_arg2(assertion));
            SubLObject pf_name = (SubLObject)sksi_after_addings.NIL;
            pf_name = cdolist_list_var.first();
            while (sksi_after_addings.NIL != cdolist_list_var) {
                czer_main.cyc_find_or_create_nart(el_utilities.make_binary_formula(sksi_after_addings.$const1$PhysicalFieldFn, ps, pf_name), (SubLObject)sksi_after_addings.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                pf_name = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 1365L)
    public static SubLObject sksi_unreify_physical_schema_fields(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const0$schemaFieldNameList)) {
            final SubLObject ps = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject pf_names = cdolist_list_var = el_utilities.el_list_items(assertions_high.gaf_arg2(assertion));
            SubLObject pf_name = (SubLObject)sksi_after_addings.NIL;
            pf_name = cdolist_list_var.first();
            while (sksi_after_addings.NIL != cdolist_list_var) {
                final SubLObject pf = narts_high.find_nart(el_utilities.make_binary_formula(sksi_after_addings.$const1$PhysicalFieldFn, ps, pf_name));
                if (sksi_after_addings.NIL != nart_handles.nart_p(pf)) {
                    cyc_kernel.cyc_kill(pf);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pf_name = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 1882L)
    public static SubLObject sksi_quoted_isa_after_addings(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const4$quotedIsa) && sksi_after_addings.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(assertion), sksi_after_addings.$const5$LogicalFieldIndexical)) {
            sksi_infrastructure_utilities.possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 2336L)
    public static SubLObject sksi_quoted_isa_after_removings(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const4$quotedIsa) && sksi_after_addings.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(assertion), sksi_after_addings.$const5$LogicalFieldIndexical)) {
            sksi_infrastructure_utilities.possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache(assertions_high.gaf_arg1(assertion), assertions_high.assertion_mt(assertion));
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 2732L)
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
            SubLObject sub_ks = (SubLObject)sksi_after_addings.NIL;
            sub_ks = cdolist_list_var.first();
            while (sksi_after_addings.NIL != cdolist_list_var) {
                if (operation.eql((SubLObject)sksi_after_addings.$kw8$ADD)) {
                    sksi_access_path.add_to_external_source_access_path(sub_ks, property, value);
                }
                else if (operation.eql((SubLObject)sksi_after_addings.$kw9$REMOVE)) {
                    sksi_access_path.remove_from_external_source_access_path(sub_ks, property, value);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_ks = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 3405L)
    public static SubLObject sksi_remove_sks_isa(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const10$sksIsa)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            sksi_access_path.remove_external_source_access_path_from_cache(sk_source, (SubLObject)sksi_after_addings.UNPROVIDED);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 4211L)
    public static SubLObject sksi_add_structured_knowledge_source_name(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const12$structuredKnowledgeSourceName)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject name = assertions_high.gaf_arg2(assertion);
            if (sksi_after_addings.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const12$structuredKnowledgeSourceName, name, (SubLObject)sksi_after_addings.$kw8$ADD);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 4817L)
    public static SubLObject sksi_remove_structured_knowledge_source_name(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const12$structuredKnowledgeSourceName)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject name = assertions_high.gaf_arg2(assertion);
            if (sksi_after_addings.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const12$structuredKnowledgeSourceName, name, (SubLObject)sksi_after_addings.$kw9$REMOVE);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 5326L)
    public static SubLObject sksi_add_structured_knowledge_source_namespace(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const15$structuredKnowledgeSourceNamespac)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject namespace = assertions_high.gaf_arg2(assertion);
            if (sksi_after_addings.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const15$structuredKnowledgeSourceNamespac, namespace, (SubLObject)sksi_after_addings.$kw8$ADD);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 5971L)
    public static SubLObject sksi_remove_structured_knowledge_source_namespace(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const15$structuredKnowledgeSourceNamespac)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject namespace = assertions_high.gaf_arg2(assertion);
            if (sksi_after_addings.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(sk_source)) {
                sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const15$structuredKnowledgeSourceNamespac, namespace, (SubLObject)sksi_after_addings.$kw9$REMOVE);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 6505L)
    public static SubLObject sksi_add_server_of_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const18$serverOfSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject server = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const18$serverOfSKS, server, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 6926L)
    public static SubLObject sksi_remove_server_of_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const18$serverOfSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject server = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const18$serverOfSKS, server, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 7304L)
    public static SubLObject sksi_add_port_number_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const21$portNumberForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const21$portNumberForSKS, port, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 7759L)
    public static SubLObject sksi_remove_port_number_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const21$portNumberForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const21$portNumberForSKS, port, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 8156L)
    public static SubLObject sksi_add_sks_proxy_host(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const24$sksProxyHost)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject host = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const24$sksProxyHost, host, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 8582L)
    public static SubLObject sksi_remove_sks_proxy_host(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const24$sksProxyHost)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject host = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const24$sksProxyHost, host, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 8962L)
    public static SubLObject sksi_add_sks_proxy_port(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const27$sksProxyPort)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const27$sksProxyPort, port, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 9388L)
    public static SubLObject sksi_remove_sks_proxy_port(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const27$sksProxyPort)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject port = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const27$sksProxyPort, port, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 9768L)
    public static SubLObject sksi_add_sks_connection_timeout(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const30$sksConnectionTimeout)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject timeout = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const30$sksConnectionTimeout, timeout, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 10255L)
    public static SubLObject sksi_remove_sks_connection_timeout(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const30$sksConnectionTimeout)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject timeout = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const30$sksConnectionTimeout, timeout, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 10673L)
    public static SubLObject sksi_add_user_name_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const33$userNameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject user = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const33$userNameForSKS, user, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 11113L)
    public static SubLObject sksi_remove_user_name_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const33$userNameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject user = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const33$userNameForSKS, user, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 11502L)
    public static SubLObject sksi_add_password_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const36$passwordForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject password = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const36$passwordForSKS, password, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 11954L)
    public static SubLObject sksi_remove_password_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const36$passwordForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject password = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const36$passwordForSKS, password, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 12354L)
    public static SubLObject sksi_add_subprotocol_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const39$subProtocolForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const39$subProtocolForSKS, subprotocol, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 12935L)
    public static SubLObject sksi_remove_subprotocol_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const39$subProtocolForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject subprotocol = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const39$subProtocolForSKS, subprotocol, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 13350L)
    public static SubLObject sksi_add_sql_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const42$sqlProgramForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject sql_program = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const42$sqlProgramForSKS, sql_program, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 13820L)
    public static SubLObject sksi_remove_sql_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const42$sqlProgramForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject sql_program = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const42$sqlProgramForSKS, sql_program, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 14232L)
    public static SubLObject sksi_add_filename_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const45$filenameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject filename = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const45$filenameForSKS, filename, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 14792L)
    public static SubLObject sksi_remove_filename_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const45$filenameForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject filename = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const45$filenameForSKS, filename, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 15190L)
    public static SubLObject sksi_add_key_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const48$keyTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const48$keyTestFunctionForSKS, test_fn, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 15690L)
    public static SubLObject sksi_remove_key_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const48$keyTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const48$keyTestFunctionForSKS, test_fn, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 16117L)
    public static SubLObject sksi_add_value_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const51$valueTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const51$valueTestFunctionForSKS, test_fn, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 16631L)
    public static SubLObject sksi_remove_value_test_function_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const51$valueTestFunctionForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject test_fn = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const51$valueTestFunctionForSKS, test_fn, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 17066L)
    public static SubLObject sksi_add_serialization_type_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const54$serializationTypeForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject serialization = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const54$serializationTypeForSKS, serialization, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 17591L)
    public static SubLObject sksi_remove_serialization_type_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const54$serializationTypeForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject serialization = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const54$serializationTypeForSKS, serialization, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 18037L)
    public static SubLObject sksi_add_httpd_request_url_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const57$httpdRequestURLForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject url = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const57$httpdRequestURLForSKS, url, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 18626L)
    public static SubLObject sksi_remove_httpd_request_url_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const57$httpdRequestURLForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject url = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const57$httpdRequestURLForSKS, url, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 19045L)
    public static SubLObject sksi_remove_httpd_request_method_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const60$httpdRequestMethodForSKS)) {
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
                SubLObject sub_ks = (SubLObject)sksi_after_addings.NIL;
                sub_ks = cdolist_list_var.first();
                while (sksi_after_addings.NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, (SubLObject)sksi_after_addings.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 20183L)
    public static SubLObject sksi_remove_httpd_request_query_template_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const62$httpdRequestQueryTemplateForSKS)) {
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
                SubLObject sub_ks = (SubLObject)sksi_after_addings.NIL;
                sub_ks = cdolist_list_var.first();
                while (sksi_after_addings.NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, (SubLObject)sksi_after_addings.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 21386L)
    public static SubLObject sksi_remove_httpd_request_subl_boolean_parsing_program_for_sks(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const64$httpdRequestSubLBooleanParsingPro)) {
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
                SubLObject sub_ks = (SubLObject)sksi_after_addings.NIL;
                sub_ks = cdolist_list_var.first();
                while (sksi_after_addings.NIL != cdolist_list_var) {
                    sksi_access_path.remove_external_source_access_path_from_cache(sub_ks, (SubLObject)sksi_after_addings.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_ks = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 22700L)
    public static SubLObject sksi_add_base_namespace_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const66$baseNamespaceForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const66$baseNamespaceForSKS, base_namespace, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 23334L)
    public static SubLObject sksi_remove_base_namespace_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const66$baseNamespaceForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject base_namespace = sksi_access_path.get_uri_string(assertions_high.gaf_arg2(assertion));
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const66$baseNamespaceForSKS, base_namespace, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 23780L)
    public static SubLObject sksi_recompute_name_space_prefix_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const69$nameSpacePrefixForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject uri_map = sksi_access_path.get_sks_prefix_to_uri_map(sk_source);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const69$nameSpacePrefixForSKS, uri_map, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 24357L)
    public static SubLObject sksi_add_rdf_store_identifier_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const71$rdfStoreIdentifierForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const71$rdfStoreIdentifierForSKS, rdf_store_identifier, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 24907L)
    public static SubLObject sksi_remove_rdf_store_identifier_for_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const71$rdfStoreIdentifierForSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject rdf_store_identifier = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const71$rdfStoreIdentifierForSKS, rdf_store_identifier, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 25375L)
    public static SubLObject sksi_add_relative_path_for_api_access_to_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const74$relativePathForAPIAccessToSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const74$relativePathForAPIAccessToSKS, relative_path_for_api_access, (SubLObject)sksi_after_addings.$kw8$ADD);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 25981L)
    public static SubLObject sksi_remove_relative_path_for_api_access_to_sks(final SubLObject argument, final SubLObject assertion) {
        if (sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const74$relativePathForAPIAccessToSKS)) {
            final SubLObject sk_source = assertions_high.gaf_arg1(assertion);
            final SubLObject relative_path_for_api_access = assertions_high.gaf_arg2(assertion);
            sksi_edit_access_path_property_for_sks(sk_source, sksi_after_addings.$const74$relativePathForAPIAccessToSKS, relative_path_for_api_access, (SubLObject)sksi_after_addings.$kw9$REMOVE);
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 27050L)
    public static SubLObject sksi_automatic_cost_estimate_update_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 27173L)
    public static SubLObject enable_sksi_automatic_cost_estimate_update() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue((SubLObject)sksi_after_addings.T, thread);
        return sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 27353L)
    public static SubLObject disable_sksi_automatic_cost_estimate_update() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$.setDynamicValue((SubLObject)sksi_after_addings.NIL, thread);
        return sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 27536L)
    public static SubLObject with_sksi_automatic_cost_estimate_update_enabled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym77$CLET, (SubLObject)sksi_after_addings.$list78, reader.bq_cons((SubLObject)sksi_after_addings.$sym79$PROGN, ConsesLow.append(body, (SubLObject)sksi_after_addings.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 27987L)
    public static SubLObject with_sksi_automatic_cost_estimate_update_disabled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym77$CLET, (SubLObject)sksi_after_addings.$list80, reader.bq_cons((SubLObject)sksi_after_addings.$sym79$PROGN, ConsesLow.append(body, (SubLObject)sksi_after_addings.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 28704L)
    public static SubLObject sksi_automatic_cost_estimate_update_add(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)sksi_after_addings.NIL;
        SubLObject pred = (SubLObject)sksi_after_addings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        pred = current.first();
        current = current.rest();
        if (sksi_after_addings.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject timed_out = (SubLObject)sksi_after_addings.$sym83$TIMED_OUT;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym84$IGNORE_ERRORS, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym77$CLET, (SubLObject)ConsesLow.list(timed_out), (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym85$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym86$CAND, (SubLObject)sksi_after_addings.$list87, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym88$TRUE_GAF_ASSERTION_WITH_PRED_P, assertion, pred)), (SubLObject)ConsesLow.listS((SubLObject)sksi_after_addings.$sym89$WITH_TIMEOUT, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym90$_SKSI_AUTOMATIC_COST_ESTIMATE_UPDATE_TIMEOUT_, timed_out), (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym91$IGNORE, timed_out), ConsesLow.append(body, (SubLObject)sksi_after_addings.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_after_addings.$list82);
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 29130L)
    public static SubLObject sksi_automatic_cost_estimate_update_remove(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)sksi_after_addings.NIL;
        SubLObject pred = (SubLObject)sksi_after_addings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_after_addings.$list82);
        pred = current.first();
        current = current.rest();
        if (sksi_after_addings.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym84$IGNORE_ERRORS, (SubLObject)ConsesLow.listS((SubLObject)sksi_after_addings.$sym85$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym86$CAND, (SubLObject)sksi_after_addings.$list87, (SubLObject)ConsesLow.list((SubLObject)sksi_after_addings.$sym88$TRUE_GAF_ASSERTION_WITH_PRED_P, assertion, pred)), ConsesLow.append(body, (SubLObject)sksi_after_addings.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_after_addings.$list82);
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 29395L)
    public static SubLObject sksi_add_cost_estimates_for_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = (SubLObject)sksi_after_addings.NIL;
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const94$meaningSentenceOfSchema)) {
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sksi_after_addings.T, thread);
                                SubLObject timer = (SubLObject)sksi_after_addings.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sksi_after_addings.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, (SubLObject)sksi_after_addings.$kw95$ONLY_ADD);
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_after_addings.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 29867L)
    public static SubLObject sksi_remove_cost_estimates_for_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const94$meaningSentenceOfSchema)) {
                        sksi_cost_estimates.update_cost_estimates_for_meaning_sentence(assertion, (SubLObject)sksi_after_addings.$kw97$ONLY_REMOVE);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 30200L)
    public static SubLObject sksi_add_cost_estimates_for_conditional_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = (SubLObject)sksi_after_addings.NIL;
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const99$conditionalMeaningSentenceOfSchem)) {
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$4 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sksi_after_addings.T, thread);
                                SubLObject timer = (SubLObject)sksi_after_addings.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sksi_after_addings.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, (SubLObject)sksi_after_addings.$kw95$ONLY_ADD);
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_after_addings.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 30747L)
    public static SubLObject sksi_remove_cost_estimates_for_conditional_meaning_sentence(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const99$conditionalMeaningSentenceOfSchem)) {
                        sksi_cost_estimates.update_cost_estimates_for_conditional_meaning_sentence(assertion, (SubLObject)sksi_after_addings.$kw97$ONLY_REMOVE);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 31125L)
    public static SubLObject sksi_add_cost_estimates_for_field_decoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = (SubLObject)sksi_after_addings.NIL;
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const102$fieldDecoding)) {
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$7 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sksi_after_addings.T, thread);
                                SubLObject timer = (SubLObject)sksi_after_addings.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$8 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sksi_after_addings.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, (SubLObject)sksi_after_addings.$kw95$ONLY_ADD);
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_after_addings.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 31563L)
    public static SubLObject sksi_remove_cost_estimates_for_field_decoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const102$fieldDecoding)) {
                        sksi_cost_estimates.update_cost_estimates_for_field_decoding(assertion, (SubLObject)sksi_after_addings.$kw97$ONLY_REMOVE);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 31871L)
    public static SubLObject sksi_add_cost_estimates_for_field_encoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject timed_out = (SubLObject)sksi_after_addings.NIL;
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const105$fieldEncoding)) {
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sksi_after_addings.T, thread);
                                SubLObject timer = (SubLObject)sksi_after_addings.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sksi_after_addings.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$.getGlobalValue(), tag);
                                        sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, (SubLObject)sksi_after_addings.$kw95$ONLY_ADD);
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_after_addings.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-after-addings.lisp", position = 32309L)
    public static SubLObject sksi_remove_cost_estimates_for_field_encoding(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)sksi_after_addings.NIL;
        try {
            thread.throwStack.push(sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_after_addings.$sym93$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (sksi_after_addings.NIL != sksi_automatic_cost_estimate_update_enabledP() && sksi_after_addings.NIL != assertion_utilities.true_gaf_assertion_with_pred_p(assertion, sksi_after_addings.$const105$fieldEncoding)) {
                        sksi_cost_estimates.update_cost_estimates_for_field_encoding(assertion, (SubLObject)sksi_after_addings.$kw97$ONLY_REMOVE);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_after_addings.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_after_addings.$kw92$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    public static SubLObject declare_sksi_after_addings_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_reify_physical_schema_fields", "SKSI-REIFY-PHYSICAL-SCHEMA-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_unreify_physical_schema_fields", "SKSI-UNREIFY-PHYSICAL-SCHEMA-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_quoted_isa_after_addings", "SKSI-QUOTED-ISA-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_quoted_isa_after_removings", "SKSI-QUOTED-ISA-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_edit_access_path_property_for_sks", "SKSI-EDIT-ACCESS-PATH-PROPERTY-FOR-SKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_sks_isa", "SKSI-REMOVE-SKS-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_structured_knowledge_source_name", "SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_structured_knowledge_source_name", "SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_structured_knowledge_source_namespace", "SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_structured_knowledge_source_namespace", "SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_server_of_sks", "SKSI-ADD-SERVER-OF-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_server_of_sks", "SKSI-REMOVE-SERVER-OF-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_port_number_for_sks", "SKSI-ADD-PORT-NUMBER-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_port_number_for_sks", "SKSI-REMOVE-PORT-NUMBER-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_sks_proxy_host", "SKSI-ADD-SKS-PROXY-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_sks_proxy_host", "SKSI-REMOVE-SKS-PROXY-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_sks_proxy_port", "SKSI-ADD-SKS-PROXY-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_sks_proxy_port", "SKSI-REMOVE-SKS-PROXY-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_sks_connection_timeout", "SKSI-ADD-SKS-CONNECTION-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_sks_connection_timeout", "SKSI-REMOVE-SKS-CONNECTION-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_user_name_for_sks", "SKSI-ADD-USER-NAME-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_user_name_for_sks", "SKSI-REMOVE-USER-NAME-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_password_for_sks", "SKSI-ADD-PASSWORD-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_password_for_sks", "SKSI-REMOVE-PASSWORD-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_subprotocol_for_sks", "SKSI-ADD-SUBPROTOCOL-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_subprotocol_for_sks", "SKSI-REMOVE-SUBPROTOCOL-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_sql_program_for_sks", "SKSI-ADD-SQL-PROGRAM-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_sql_program_for_sks", "SKSI-REMOVE-SQL-PROGRAM-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_filename_for_sks", "SKSI-ADD-FILENAME-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_filename_for_sks", "SKSI-REMOVE-FILENAME-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_key_test_function_for_sks", "SKSI-ADD-KEY-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_key_test_function_for_sks", "SKSI-REMOVE-KEY-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_value_test_function_for_sks", "SKSI-ADD-VALUE-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_value_test_function_for_sks", "SKSI-REMOVE-VALUE-TEST-FUNCTION-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_serialization_type_for_sks", "SKSI-ADD-SERIALIZATION-TYPE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_serialization_type_for_sks", "SKSI-REMOVE-SERIALIZATION-TYPE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_httpd_request_url_for_sks", "SKSI-ADD-HTTPD-REQUEST-URL-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_httpd_request_url_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-URL-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_httpd_request_method_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-METHOD-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_httpd_request_query_template_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-QUERY-TEMPLATE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_httpd_request_subl_boolean_parsing_program_for_sks", "SKSI-REMOVE-HTTPD-REQUEST-SUBL-BOOLEAN-PARSING-PROGRAM-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_base_namespace_for_sks", "SKSI-ADD-BASE-NAMESPACE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_base_namespace_for_sks", "SKSI-REMOVE-BASE-NAMESPACE-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_recompute_name_space_prefix_for_sks", "SKSI-RECOMPUTE-NAME-SPACE-PREFIX-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_rdf_store_identifier_for_sks", "SKSI-ADD-RDF-STORE-IDENTIFIER-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_rdf_store_identifier_for_sks", "SKSI-REMOVE-RDF-STORE-IDENTIFIER-FOR-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_relative_path_for_api_access_to_sks", "SKSI-ADD-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_relative_path_for_api_access_to_sks", "SKSI-REMOVE-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_automatic_cost_estimate_update_enabledP", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "enable_sksi_automatic_cost_estimate_update", "ENABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "disable_sksi_automatic_cost_estimate_update", "DISABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "with_sksi_automatic_cost_estimate_update_enabled", "WITH-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "with_sksi_automatic_cost_estimate_update_disabled", "WITH-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-DISABLED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_automatic_cost_estimate_update_add", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ADD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_automatic_cost_estimate_update_remove", "SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-REMOVE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_cost_estimates_for_meaning_sentence", "SKSI-ADD-COST-ESTIMATES-FOR-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_cost_estimates_for_meaning_sentence", "SKSI-REMOVE-COST-ESTIMATES-FOR-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_cost_estimates_for_conditional_meaning_sentence", "SKSI-ADD-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_cost_estimates_for_conditional_meaning_sentence", "SKSI-REMOVE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_cost_estimates_for_field_decoding", "SKSI-ADD-COST-ESTIMATES-FOR-FIELD-DECODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_cost_estimates_for_field_decoding", "SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-DECODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_add_cost_estimates_for_field_encoding", "SKSI-ADD-COST-ESTIMATES-FOR-FIELD-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_after_addings", "sksi_remove_cost_estimates_for_field_encoding", "SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-ENCODING", 2, 0, false);
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    public static SubLObject init_sksi_after_addings_file() {
        sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$ = SubLFiles.defparameter("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*", (SubLObject)sksi_after_addings.NIL);
        sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$ = SubLFiles.deflexical("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-TIMEOUT*", (SubLObject)sksi_after_addings.$int81$120);
        return (SubLObject)sksi_after_addings.NIL;
    }
    
    public static SubLObject setup_sksi_after_addings_file() {
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym2$SKSI_REIFY_PHYSICAL_SCHEMA_FIELDS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym3$SKSI_UNREIFY_PHYSICAL_SCHEMA_FIELDS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym6$SKSI_QUOTED_ISA_AFTER_ADDINGS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym7$SKSI_QUOTED_ISA_AFTER_REMOVINGS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym11$SKSI_REMOVE_SKS_ISA);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym13$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAME);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym14$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAME);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym16$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym17$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym19$SKSI_ADD_SERVER_OF_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym20$SKSI_REMOVE_SERVER_OF_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym22$SKSI_ADD_PORT_NUMBER_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym23$SKSI_REMOVE_PORT_NUMBER_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym25$SKSI_ADD_SKS_PROXY_HOST);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym26$SKSI_REMOVE_SKS_PROXY_HOST);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym28$SKSI_ADD_SKS_PROXY_PORT);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym29$SKSI_REMOVE_SKS_PROXY_PORT);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym31$SKSI_ADD_SKS_CONNECTION_TIMEOUT);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym32$SKSI_REMOVE_SKS_CONNECTION_TIMEOUT);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym34$SKSI_ADD_USER_NAME_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym35$SKSI_REMOVE_USER_NAME_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym37$SKSI_ADD_PASSWORD_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym38$SKSI_REMOVE_PASSWORD_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym40$SKSI_ADD_SUBPROTOCOL_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym41$SKSI_REMOVE_SUBPROTOCOL_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym43$SKSI_ADD_SQL_PROGRAM_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym44$SKSI_REMOVE_SQL_PROGRAM_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym46$SKSI_ADD_FILENAME_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym47$SKSI_REMOVE_FILENAME_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym49$SKSI_ADD_KEY_TEST_FUNCTION_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym50$SKSI_REMOVE_KEY_TEST_FUNCTION_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym52$SKSI_ADD_VALUE_TEST_FUNCTION_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym53$SKSI_REMOVE_VALUE_TEST_FUNCTION_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym55$SKSI_ADD_SERIALIZATION_TYPE_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym56$SKSI_REMOVE_SERIALIZATION_TYPE_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym58$SKSI_ADD_HTTPD_REQUEST_URL_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym59$SKSI_REMOVE_HTTPD_REQUEST_URL_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym61$SKSI_REMOVE_HTTPD_REQUEST_METHOD_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym63$SKSI_REMOVE_HTTPD_REQUEST_QUERY_TEMPLATE_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym65$SKSI_REMOVE_HTTPD_REQUEST_SUBL_BOOLEAN_PARSING_PROGRAM_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym67$SKSI_ADD_BASE_NAMESPACE_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym68$SKSI_REMOVE_BASE_NAMESPACE_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym70$SKSI_RECOMPUTE_NAME_SPACE_PREFIX_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym72$SKSI_ADD_RDF_STORE_IDENTIFIER_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym73$SKSI_REMOVE_RDF_STORE_IDENTIFIER_FOR_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym75$SKSI_ADD_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym76$SKSI_REMOVE_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym96$SKSI_ADD_COST_ESTIMATES_FOR_MEANING_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym98$SKSI_REMOVE_COST_ESTIMATES_FOR_MEANING_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym100$SKSI_ADD_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym101$SKSI_REMOVE_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym103$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_DECODING);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym104$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_DECODING);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym106$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_ENCODING);
        utilities_macros.register_kb_function((SubLObject)sksi_after_addings.$sym107$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_ENCODING);
        return (SubLObject)sksi_after_addings.NIL;
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
    
    static {
        me = (SubLFile)new sksi_after_addings();
        sksi_after_addings.$sksi_automatic_cost_estimate_update_enabledP$ = null;
        sksi_after_addings.$sksi_automatic_cost_estimate_update_timeout$ = null;
        $const0$schemaFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList"));
        $const1$PhysicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalFieldFn"));
        $sym2$SKSI_REIFY_PHYSICAL_SCHEMA_FIELDS = SubLObjectFactory.makeSymbol("SKSI-REIFY-PHYSICAL-SCHEMA-FIELDS");
        $sym3$SKSI_UNREIFY_PHYSICAL_SCHEMA_FIELDS = SubLObjectFactory.makeSymbol("SKSI-UNREIFY-PHYSICAL-SCHEMA-FIELDS");
        $const4$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const5$LogicalFieldIndexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldIndexical"));
        $sym6$SKSI_QUOTED_ISA_AFTER_ADDINGS = SubLObjectFactory.makeSymbol("SKSI-QUOTED-ISA-AFTER-ADDINGS");
        $sym7$SKSI_QUOTED_ISA_AFTER_REMOVINGS = SubLObjectFactory.makeSymbol("SKSI-QUOTED-ISA-AFTER-REMOVINGS");
        $kw8$ADD = SubLObjectFactory.makeKeyword("ADD");
        $kw9$REMOVE = SubLObjectFactory.makeKeyword("REMOVE");
        $const10$sksIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksIsa"));
        $sym11$SKSI_REMOVE_SKS_ISA = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SKS-ISA");
        $const12$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName"));
        $sym13$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAME = SubLObjectFactory.makeSymbol("SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAME");
        $sym14$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAME = SubLObjectFactory.makeSymbol("SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAME");
        $const15$structuredKnowledgeSourceNamespac = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceNamespace"));
        $sym16$SKSI_ADD_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE = SubLObjectFactory.makeSymbol("SKSI-ADD-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE");
        $sym17$SKSI_REMOVE_STRUCTURED_KNOWLEDGE_SOURCE_NAMESPACE = SubLObjectFactory.makeSymbol("SKSI-REMOVE-STRUCTURED-KNOWLEDGE-SOURCE-NAMESPACE");
        $const18$serverOfSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("serverOfSKS"));
        $sym19$SKSI_ADD_SERVER_OF_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-SERVER-OF-SKS");
        $sym20$SKSI_REMOVE_SERVER_OF_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SERVER-OF-SKS");
        $const21$portNumberForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("portNumberForSKS"));
        $sym22$SKSI_ADD_PORT_NUMBER_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-PORT-NUMBER-FOR-SKS");
        $sym23$SKSI_REMOVE_PORT_NUMBER_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-PORT-NUMBER-FOR-SKS");
        $const24$sksProxyHost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyHost"));
        $sym25$SKSI_ADD_SKS_PROXY_HOST = SubLObjectFactory.makeSymbol("SKSI-ADD-SKS-PROXY-HOST");
        $sym26$SKSI_REMOVE_SKS_PROXY_HOST = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SKS-PROXY-HOST");
        $const27$sksProxyPort = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyPort"));
        $sym28$SKSI_ADD_SKS_PROXY_PORT = SubLObjectFactory.makeSymbol("SKSI-ADD-SKS-PROXY-PORT");
        $sym29$SKSI_REMOVE_SKS_PROXY_PORT = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SKS-PROXY-PORT");
        $const30$sksConnectionTimeout = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksConnectionTimeout"));
        $sym31$SKSI_ADD_SKS_CONNECTION_TIMEOUT = SubLObjectFactory.makeSymbol("SKSI-ADD-SKS-CONNECTION-TIMEOUT");
        $sym32$SKSI_REMOVE_SKS_CONNECTION_TIMEOUT = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SKS-CONNECTION-TIMEOUT");
        $const33$userNameForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userNameForSKS"));
        $sym34$SKSI_ADD_USER_NAME_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-USER-NAME-FOR-SKS");
        $sym35$SKSI_REMOVE_USER_NAME_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-USER-NAME-FOR-SKS");
        $const36$passwordForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passwordForSKS"));
        $sym37$SKSI_ADD_PASSWORD_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-PASSWORD-FOR-SKS");
        $sym38$SKSI_REMOVE_PASSWORD_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-PASSWORD-FOR-SKS");
        $const39$subProtocolForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subProtocolForSKS"));
        $sym40$SKSI_ADD_SUBPROTOCOL_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-SUBPROTOCOL-FOR-SKS");
        $sym41$SKSI_REMOVE_SUBPROTOCOL_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SUBPROTOCOL-FOR-SKS");
        $const42$sqlProgramForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sqlProgramForSKS"));
        $sym43$SKSI_ADD_SQL_PROGRAM_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-SQL-PROGRAM-FOR-SKS");
        $sym44$SKSI_REMOVE_SQL_PROGRAM_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SQL-PROGRAM-FOR-SKS");
        $const45$filenameForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("filenameForSKS"));
        $sym46$SKSI_ADD_FILENAME_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-FILENAME-FOR-SKS");
        $sym47$SKSI_REMOVE_FILENAME_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-FILENAME-FOR-SKS");
        $const48$keyTestFunctionForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keyTestFunctionForSKS"));
        $sym49$SKSI_ADD_KEY_TEST_FUNCTION_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-KEY-TEST-FUNCTION-FOR-SKS");
        $sym50$SKSI_REMOVE_KEY_TEST_FUNCTION_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-KEY-TEST-FUNCTION-FOR-SKS");
        $const51$valueTestFunctionForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueTestFunctionForSKS"));
        $sym52$SKSI_ADD_VALUE_TEST_FUNCTION_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-VALUE-TEST-FUNCTION-FOR-SKS");
        $sym53$SKSI_REMOVE_VALUE_TEST_FUNCTION_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-VALUE-TEST-FUNCTION-FOR-SKS");
        $const54$serializationTypeForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("serializationTypeForSKS"));
        $sym55$SKSI_ADD_SERIALIZATION_TYPE_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-SERIALIZATION-TYPE-FOR-SKS");
        $sym56$SKSI_REMOVE_SERIALIZATION_TYPE_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-SERIALIZATION-TYPE-FOR-SKS");
        $const57$httpdRequestURLForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("httpdRequestURLForSKS"));
        $sym58$SKSI_ADD_HTTPD_REQUEST_URL_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-HTTPD-REQUEST-URL-FOR-SKS");
        $sym59$SKSI_REMOVE_HTTPD_REQUEST_URL_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-URL-FOR-SKS");
        $const60$httpdRequestMethodForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("httpdRequestMethodForSKS"));
        $sym61$SKSI_REMOVE_HTTPD_REQUEST_METHOD_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-METHOD-FOR-SKS");
        $const62$httpdRequestQueryTemplateForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("httpdRequestQueryTemplateForSKS"));
        $sym63$SKSI_REMOVE_HTTPD_REQUEST_QUERY_TEMPLATE_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-QUERY-TEMPLATE-FOR-SKS");
        $const64$httpdRequestSubLBooleanParsingPro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("httpdRequestSubLBooleanParsingProgramForSKS"));
        $sym65$SKSI_REMOVE_HTTPD_REQUEST_SUBL_BOOLEAN_PARSING_PROGRAM_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-HTTPD-REQUEST-SUBL-BOOLEAN-PARSING-PROGRAM-FOR-SKS");
        $const66$baseNamespaceForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseNamespaceForSKS"));
        $sym67$SKSI_ADD_BASE_NAMESPACE_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-BASE-NAMESPACE-FOR-SKS");
        $sym68$SKSI_REMOVE_BASE_NAMESPACE_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-BASE-NAMESPACE-FOR-SKS");
        $const69$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS"));
        $sym70$SKSI_RECOMPUTE_NAME_SPACE_PREFIX_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-RECOMPUTE-NAME-SPACE-PREFIX-FOR-SKS");
        $const71$rdfStoreIdentifierForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfStoreIdentifierForSKS"));
        $sym72$SKSI_ADD_RDF_STORE_IDENTIFIER_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-RDF-STORE-IDENTIFIER-FOR-SKS");
        $sym73$SKSI_REMOVE_RDF_STORE_IDENTIFIER_FOR_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-RDF-STORE-IDENTIFIER-FOR-SKS");
        $const74$relativePathForAPIAccessToSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relativePathForAPIAccessToSKS"));
        $sym75$SKSI_ADD_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS = SubLObjectFactory.makeSymbol("SKSI-ADD-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS");
        $sym76$SKSI_REMOVE_RELATIVE_PATH_FOR_API_ACCESS_TO_SKS = SubLObjectFactory.makeSymbol("SKSI-REMOVE-RELATIVE-PATH-FOR-API-ACCESS-TO-SKS");
        $sym77$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), (SubLObject)sksi_after_addings.T));
        $sym79$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?*"), (SubLObject)sksi_after_addings.NIL));
        $int81$120 = SubLObjectFactory.makeInteger(120);
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym83$TIMED_OUT = SubLObjectFactory.makeUninternedSymbol("TIMED-OUT");
        $sym84$IGNORE_ERRORS = SubLObjectFactory.makeSymbol("IGNORE-ERRORS");
        $sym85$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym86$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?"));
        $sym88$TRUE_GAF_ASSERTION_WITH_PRED_P = SubLObjectFactory.makeSymbol("TRUE-GAF-ASSERTION-WITH-PRED-P");
        $sym89$WITH_TIMEOUT = SubLObjectFactory.makeSymbol("WITH-TIMEOUT");
        $sym90$_SKSI_AUTOMATIC_COST_ESTIMATE_UPDATE_TIMEOUT_ = SubLObjectFactory.makeSymbol("*SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-TIMEOUT*");
        $sym91$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $kw92$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym93$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $const94$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema"));
        $kw95$ONLY_ADD = SubLObjectFactory.makeKeyword("ONLY-ADD");
        $sym96$SKSI_ADD_COST_ESTIMATES_FOR_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-MEANING-SENTENCE");
        $kw97$ONLY_REMOVE = SubLObjectFactory.makeKeyword("ONLY-REMOVE");
        $sym98$SKSI_REMOVE_COST_ESTIMATES_FOR_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-MEANING-SENTENCE");
        $const99$conditionalMeaningSentenceOfSchem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalMeaningSentenceOfSchema"));
        $sym100$SKSI_ADD_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE");
        $sym101$SKSI_REMOVE_COST_ESTIMATES_FOR_CONDITIONAL_MEANING_SENTENCE = SubLObjectFactory.makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE");
        $const102$fieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding"));
        $sym103$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_DECODING = SubLObjectFactory.makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-FIELD-DECODING");
        $sym104$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_DECODING = SubLObjectFactory.makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-DECODING");
        $const105$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $sym106$SKSI_ADD_COST_ESTIMATES_FOR_FIELD_ENCODING = SubLObjectFactory.makeSymbol("SKSI-ADD-COST-ESTIMATES-FOR-FIELD-ENCODING");
        $sym107$SKSI_REMOVE_COST_ESTIMATES_FOR_FIELD_ENCODING = SubLObjectFactory.makeSymbol("SKSI-REMOVE-COST-ESTIMATES-FOR-FIELD-ENCODING");
    }
}

/*

	Total time: 295 ms
	
*/