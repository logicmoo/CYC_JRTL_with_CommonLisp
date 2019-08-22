package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_access_path extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_access_path();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path";

    public static final String myFingerPrint = "bd88d9b3f083e84a516d0d923768cf30616205aea888627218d9b65b3f176193";



    // defparameter
    // Whether to ignore access patch errors
    private static final SubLSymbol $ignore_access_path_errorsP$ = makeSymbol("*IGNORE-ACCESS-PATH-ERRORS?*");

    // deflexical
    private static final SubLSymbol $red_candidate_access_path_predicates$ = makeSymbol("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*");

    // deflexical
    private static final SubLSymbol $sksi_red_prefix$ = makeSymbol("*SKSI-RED-PREFIX*");

    // deflexical
    private static final SubLSymbol $sksi_red_access_path_prefix$ = makeSymbol("*SKSI-RED-ACCESS-PATH-PREFIX*");

    // Internal Constants
    public static final SubLSymbol DETERMINE_SKS_TYPE = makeSymbol("DETERMINE-SKS-TYPE");

    private static final SubLSymbol $external_source_access_path_cache$ = makeSymbol("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*");

    private static final SubLObject $$SpreadsheetSKS = reader_make_constant_shell(makeString("SpreadsheetSKS"));

    private static final SubLObject $$structuredKnowledgeSourceName = reader_make_constant_shell(makeString("structuredKnowledgeSourceName"));



    public static final SubLString $str5$TestLanguageSpoken_DB = makeString("TestLanguageSpoken-DB");

    public static final SubLList $list6 = list(list(makeSymbol("IGNORE?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym8$_IGNORE_ACCESS_PATH_ERRORS__ = makeSymbol("*IGNORE-ACCESS-PATH-ERRORS?*");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $$WebPage_AIS = reader_make_constant_shell(makeString("WebPage-AIS"));

    private static final SubLObject $$CycKB = reader_make_constant_shell(makeString("CycKB"));

    private static final SubLObject $$FileHashTable_File = reader_make_constant_shell(makeString("FileHashTable-File"));

    private static final SubLObject $const13$CommonObjectRequestBrokerArchitec = reader_make_constant_shell(makeString("CommonObjectRequestBrokerArchitecture"));

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell(makeString("RDFTripleStore-Physical"));

    public static final SubLString $str15$Unknown_access_path_type__A_for__ = makeString("Unknown access path type ~A for ~A.");

    private static final SubLObject $$sksIsa = reader_make_constant_shell(makeString("sksIsa"));





    private static final SubLObject $$userNameForSKS = reader_make_constant_shell(makeString("userNameForSKS"));

    private static final SubLObject $$passwordForSKS = reader_make_constant_shell(makeString("passwordForSKS"));

    private static final SubLObject $$serverOfSKS = reader_make_constant_shell(makeString("serverOfSKS"));

    private static final SubLObject $$portNumberForSKS = reader_make_constant_shell(makeString("portNumberForSKS"));

    private static final SubLObject $$sksProxyHost = reader_make_constant_shell(makeString("sksProxyHost"));

    private static final SubLObject $$sksProxyPort = reader_make_constant_shell(makeString("sksProxyPort"));

    private static final SubLObject $$subProtocolForSKS = reader_make_constant_shell(makeString("subProtocolForSKS"));

    private static final SubLObject $$sqlProgramForSKS = reader_make_constant_shell(makeString("sqlProgramForSKS"));



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLObject $$httpdRequestURLForSKS = reader_make_constant_shell(makeString("httpdRequestURLForSKS"));

    private static final SubLObject $$httpdRequestQueryTemplateForSKS = reader_make_constant_shell(makeString("httpdRequestQueryTemplateForSKS"));

    private static final SubLObject $$httpdRequestMethodForSKS = reader_make_constant_shell(makeString("httpdRequestMethodForSKS"));





    private static final SubLSymbol $PHYSICAL_FIELD_NAMES = makeKeyword("PHYSICAL-FIELD-NAMES");

    private static final SubLObject $$filenameForSKS = reader_make_constant_shell(makeString("filenameForSKS"));

    private static final SubLObject $$keyTestFunctionForSKS = reader_make_constant_shell(makeString("keyTestFunctionForSKS"));

    private static final SubLObject $$valueTestFunctionForSKS = reader_make_constant_shell(makeString("valueTestFunctionForSKS"));

    private static final SubLObject $$serializationTypeForSKS = reader_make_constant_shell(makeString("serializationTypeForSKS"));

    private static final SubLObject $$corbaSKSInitialORBHost = reader_make_constant_shell(makeString("corbaSKSInitialORBHost"));

    private static final SubLObject $$corbaSKSInitialORBPort = reader_make_constant_shell(makeString("corbaSKSInitialORBPort"));

    private static final SubLObject $$corbaSKSServiceName = reader_make_constant_shell(makeString("corbaSKSServiceName"));

    private static final SubLObject $$corbaSKSInitialObjectClass = reader_make_constant_shell(makeString("corbaSKSInitialObjectClass"));

    private static final SubLString $$$Helper = makeString("Helper");

    private static final SubLSymbol $INITIAL_ORB_HOST = makeKeyword("INITIAL-ORB-HOST");

    private static final SubLSymbol $INITIAL_ORB_PORT = makeKeyword("INITIAL-ORB-PORT");



    private static final SubLSymbol $INITIAL_OBJECT_CLASS = makeKeyword("INITIAL-OBJECT-CLASS");

    private static final SubLSymbol $INITIAL_OBJECT_CLASS_HELPER = makeKeyword("INITIAL-OBJECT-CLASS-HELPER");

    private static final SubLObject $$baseNamespaceForSKS = reader_make_constant_shell(makeString("baseNamespaceForSKS"));

    private static final SubLObject $$nameSpacePrefixForSKS = reader_make_constant_shell(makeString("nameSpacePrefixForSKS"));

    private static final SubLObject $$rdfStoreIdentifierForSKS = reader_make_constant_shell(makeString("rdfStoreIdentifierForSKS"));

    private static final SubLObject $$relativePathForAPIAccessToSKS = reader_make_constant_shell(makeString("relativePathForAPIAccessToSKS"));

    private static final SubLList $list54 = list(new SubLObject[]{ reader_make_constant_shell(makeString("structuredKnowledgeSourceName")), reader_make_constant_shell(makeString("serverOfSKS")), reader_make_constant_shell(makeString("portNumberForSKS")), reader_make_constant_shell(makeString("sksProxyHost")), reader_make_constant_shell(makeString("sksProxyPort")), reader_make_constant_shell(makeString("userNameForSKS")), reader_make_constant_shell(makeString("passwordForSKS")), reader_make_constant_shell(makeString("sqlProgramForSKS")), reader_make_constant_shell(makeString("subProtocolForSKS")), reader_make_constant_shell(makeString("filenameForSKS")), reader_make_constant_shell(makeString("serializationTypeForSKS")), reader_make_constant_shell(makeString("keyTestFunctionForSKS")), reader_make_constant_shell(makeString("valueTestFunctionForSKS")) });

    private static final SubLString $str55$application_sksi = makeString("application.sksi");

    private static final SubLString $str56$access_paths = makeString("access-paths");

    private static final SubLString $str57$_ = makeString(".");

    private static final SubLString $str58$__ = makeString("#$");



    private static final SubLObject $$sksConnectionTimeout = reader_make_constant_shell(makeString("sksConnectionTimeout"));



    private static final SubLObject $$sksiTargetForSpreadsheet = reader_make_constant_shell(makeString("sksiTargetForSpreadsheet"));

    private static final SubLString $str63$_ = makeString("!");

    private static final SubLObject $$HTTP_GET_RequestMethod = reader_make_constant_shell(makeString("HTTP-GET-RequestMethod"));



    private static final SubLObject $$HTTP_POST_RequestMethod = reader_make_constant_shell(makeString("HTTP-POST-RequestMethod"));



    private static final SubLString $str68$Unknown_HTTP_request_method__S_fo = makeString("Unknown HTTP request method ~S for ~S");

    private static final SubLObject $const69$httpdRequestSubLBooleanParsingPro = reader_make_constant_shell(makeString("httpdRequestSubLBooleanParsingProgramForSKS"));



    private static final SubLObject $const71$httpdRequestUnboundOnlySubLParsin = reader_make_constant_shell(makeString("httpdRequestUnboundOnlySubLParsingProgramForSKS"));





    private static final SubLObject $const74$httpdRequestSubLParsingProgramFor = reader_make_constant_shell(makeString("httpdRequestSubLParsingProgramForSKS"));

    private static final SubLObject $$uriString = reader_make_constant_shell(makeString("uriString"));

    private static final SubLList $list76 = list(makeSymbol("?PREFIX"), makeSymbol("?URI"));

    private static final SubLList $list77 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?PREFIX"), makeSymbol("?URI"))));

    private static final SubLList $list78 = list(makeSymbol("PREFIX"), makeSymbol("URI"));







    public static SubLObject structured_knowledge_source_type(final SubLObject access_path) {
        return access_path_type(access_path);
    }

    public static SubLObject determine_sks_type_internal(final SubLObject sk_source, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return get_sks_type(sk_source);
    }

    public static SubLObject determine_sks_type(final SubLObject sk_source, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return determine_sks_type_internal(sk_source, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DETERMINE_SKS_TYPE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DETERMINE_SKS_TYPE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DETERMINE_SKS_TYPE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sk_source, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sk_source.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(determine_sks_type_internal(sk_source, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sk_source, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject determine_sks_db_sql_flavor(final SubLObject sk_source) {
        return get_sks_db_sql_flavor(sk_source);
    }

    public static SubLObject clear_external_source_access_path_cache() {
        dictionary.clear_dictionary($external_source_access_path_cache$.getGlobalValue());
        return $external_source_access_path_cache$.getGlobalValue();
    }

    public static SubLObject initialize_external_source_access_path_cache(SubLObject allowed_sources_onlyP) {
        if (allowed_sources_onlyP == UNPROVIDED) {
            allowed_sources_onlyP = NIL;
        }
        clear_external_source_access_path_cache();
        SubLObject cdolist_list_var;
        final SubLObject sks_list = cdolist_list_var = (NIL != allowed_sources_onlyP) ? sksi_infrastructure_utilities.list_of_external_sources_activated_in_image() : sksi_infrastructure_utilities.gather_all_complete_knowledge_sources();
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            external_source_access_path(sks, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return $external_source_access_path_cache$.getGlobalValue();
    }

    public static SubLObject external_source_access_path(final SubLObject sk_source, SubLObject physical_schema, SubLObject mapping_mt) {
        if (physical_schema == UNPROVIDED) {
            physical_schema = NIL;
        }
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
        if (NIL == dictionary.dictionary_p(mt_access_path_subcache)) {
            mt_access_path_subcache = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject access_path = external_source_access_path_int(sk_source, physical_schema, mapping_mt);
            dictionary.dictionary_enter(mt_access_path_subcache, mapping_mt, access_path);
            dictionary.dictionary_enter($external_source_access_path_cache$.getGlobalValue(), sk_source, mt_access_path_subcache);
            return access_path;
        }
        SubLObject access_path = dictionary.dictionary_lookup_without_values(mt_access_path_subcache, mapping_mt, UNPROVIDED);
        if (NIL == access_path_p(access_path)) {
            access_path = external_source_access_path_int(sk_source, physical_schema, mapping_mt);
            dictionary.dictionary_enter(mt_access_path_subcache, mapping_mt, access_path);
            return access_path;
        }
        if (NIL != isa.isaP(sk_source, $$SpreadsheetSKS, UNPROVIDED, UNPROVIDED)) {
            access_path_remove(access_path, $$structuredKnowledgeSourceName);
            final SubLObject mt_var = mapping_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                access_path_enter(access_path, $$structuredKnowledgeSourceName, get_spreadsheet_db_name(sk_source));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return access_path;
        }
        return access_path;
    }

    public static SubLObject external_source_access_path_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject access_path = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mapping_mt), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mapping_mt), thread);
                    access_path = sksi_determine_access_path(sk_source, physical_schema, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return access_path;
    }

    public static SubLObject get_external_source_access_path_from_cache(final SubLObject sk_source, SubLObject mapping_mt) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
        if (NIL != dictionary.dictionary_p(mt_access_path_subcache)) {
            return dictionary.dictionary_lookup_without_values(mt_access_path_subcache, mapping_mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject remove_external_source_access_path_from_cache(final SubLObject sk_source, SubLObject mapping_mt) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
        if (NIL != dictionary.dictionary_p(mt_access_path_subcache)) {
            return dictionary.dictionary_remove(mt_access_path_subcache, mapping_mt);
        }
        return NIL;
    }

    public static SubLObject add_to_external_source_access_path(final SubLObject sk_source, final SubLObject property, final SubLObject value) {
        final SubLObject access_path = get_external_source_access_path_from_cache(sk_source, UNPROVIDED);
        if (NIL != access_path_p(access_path)) {
            access_path_enter(access_path, property, value);
        }
        return access_path;
    }

    public static SubLObject remove_from_external_source_access_path(final SubLObject sk_source, final SubLObject property, final SubLObject value) {
        final SubLObject access_path = get_external_source_access_path_from_cache(sk_source, UNPROVIDED);
        if (NIL != access_path_p(access_path)) {
            final SubLObject current_value = access_path_lookup(access_path, property, $NOT_FOUND);
            if (value.equal(current_value)) {
                access_path_remove(access_path, property);
            }
        }
        return access_path;
    }

    public static SubLObject sksi_determine_access_path(final SubLObject sk_source, SubLObject physical_schema, SubLObject ignore_errorsP) {
        if (physical_schema == UNPROVIDED) {
            physical_schema = NIL;
        }
        if (ignore_errorsP == UNPROVIDED) {
            ignore_errorsP = NIL;
        }
        if ((NIL != forts.fort_p(sk_source)) && kb_paths.fort_name(sk_source).equal($str5$TestLanguageSpoken_DB)) {
            return new_cache_access_path();
        }
        return sksi_determine_access_path_int(sk_source, physical_schema, ignore_errorsP);
    }

    public static SubLObject with_ignore_access_path_errors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ignoreP = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        ignoreP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($sym8$_IGNORE_ACCESS_PATH_ERRORS__, ignoreP)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static SubLObject ignore_access_path_errorsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ignore_access_path_errorsP$.getDynamicValue(thread);
    }

    public static SubLObject sksi_determine_access_path_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject ignore_errorsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject access_path = NIL;
        final SubLObject _prev_bind_0 = $ignore_access_path_errorsP$.currentBinding(thread);
        try {
            $ignore_access_path_errorsP$.bind(ignore_errorsP, thread);
            access_path = sksi_determine_access_path_int2(sk_source, physical_schema);
        } finally {
            $ignore_access_path_errorsP$.rebind(_prev_bind_0, thread);
        }
        return access_path;
    }

    public static SubLObject sksi_determine_access_path_int2(final SubLObject sk_source, SubLObject physical_schema) {
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = determine_sks_type(sk_source, UNPROVIDED);
        if (pcase_var.eql($$Database_Physical)) {
            if (NIL != isa.isaP(sk_source, $$SpreadsheetSKS, UNPROVIDED, UNPROVIDED)) {
                return spreadsheet_determine_db_access_path(sk_source);
            }
            return sksi_determine_db_access_path(sk_source);
        } else {
            if (pcase_var.eql($$WebPage_AIS)) {
                if (NIL == physical_schema) {
                    physical_schema = sksi_kb_accessors.sk_source_complex_physical_schemata(sk_source).first();
                }
                return sksi_determine_web_page_access_path(sk_source, physical_schema);
            }
            if (pcase_var.eql($$CycKB)) {
                return sksi_determine_kb_access_path(sk_source);
            }
            if (pcase_var.eql($$FileHashTable_File)) {
                return sksi_determine_fht_access_path(sk_source);
            }
            if (pcase_var.eql($const13$CommonObjectRequestBrokerArchitec)) {
                return sksi_determine_corba_access_path(sk_source);
            }
            if (pcase_var.eql($$RDFTripleStore_Physical)) {
                return sksi_determine_rdf_access_path(sk_source);
            }
            if (NIL != ignore_access_path_errorsP()) {
                return NIL;
            }
            Errors.error($str15$Unknown_access_path_type__A_for__, type, sk_source);
            return NIL;
        }
    }

    public static SubLObject new_cache_access_path() {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $$sksIsa, $CACHE);
        return ap;
    }

    public static SubLObject sksi_determine_db_access_path(final SubLObject sk_source) {
        final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks(sk_source);
        final SubLObject name = get_sks_db_name(sk_source);
        final SubLObject user_name = get_sks_db_user_name(top_level_source);
        final SubLObject password = get_sks_db_password(top_level_source);
        final SubLObject server = get_sks_server(top_level_source);
        final SubLObject port = get_sks_port(top_level_source);
        final SubLObject proxy_server = get_sks_proxy_server(top_level_source);
        final SubLObject proxy_port = get_sks_proxy_port(top_level_source);
        final SubLObject subprotocol = get_sks_db_subprotocol(top_level_source);
        final SubLObject sql_flavor = get_sks_db_sql_flavor(top_level_source);
        final SubLObject timeout = get_sks_open_connection_timeout(top_level_source);
        return new_db_access_path(sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, sql_flavor, timeout);
    }

    public static SubLObject spreadsheet_determine_db_access_path(final SubLObject sk_source) {
        final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks(sk_source);
        final SubLObject name = get_spreadsheet_db_name(sk_source);
        final SubLObject user_name = get_sks_db_user_name(top_level_source);
        final SubLObject password = get_sks_db_password(top_level_source);
        final SubLObject server = get_sks_server(top_level_source);
        final SubLObject port = get_sks_port(top_level_source);
        final SubLObject proxy_server = get_sks_proxy_server(top_level_source);
        final SubLObject proxy_port = get_sks_proxy_port(top_level_source);
        final SubLObject subprotocol = get_sks_db_subprotocol(top_level_source);
        final SubLObject sql_flavor = get_sks_db_sql_flavor(top_level_source);
        final SubLObject timeout = get_sks_open_connection_timeout(top_level_source);
        return new_db_access_path(sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, sql_flavor, timeout);
    }

    public static SubLObject new_db_access_path(final SubLObject sk_source, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject server, final SubLObject port, final SubLObject proxy_server, final SubLObject proxy_port, final SubLObject subprotocol, final SubLObject sql_flavor, final SubLObject timeout) {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $SKS, sk_source);
        access_path_enter(ap, $$sksIsa, $$Database_Physical);
        access_path_enter(ap, $$structuredKnowledgeSourceName, db);
        access_path_enter(ap, $$userNameForSKS, user);
        access_path_enter(ap, $$passwordForSKS, password);
        access_path_enter(ap, $$serverOfSKS, server);
        access_path_enter(ap, $$portNumberForSKS, port);
        access_path_enter(ap, $$sksProxyHost, proxy_server);
        access_path_enter(ap, $$sksProxyPort, proxy_port);
        access_path_enter(ap, $$subProtocolForSKS, subprotocol);
        access_path_enter(ap, $$sqlProgramForSKS, sql_flavor);
        access_path_enter(ap, $TIMEOUT, timeout);
        return ap;
    }

    public static SubLObject sksi_determine_web_page_access_path(final SubLObject sk_source, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject server = get_sks_server(sk_source);
        final SubLObject port = get_sks_port(sk_source);
        final SubLObject url = get_sks_http_url(sk_source);
        final SubLObject timeout = get_sks_open_connection_timeout(sk_source);
        final SubLObject request_method = get_sks_http_request_method(sk_source);
        final SubLObject query_template = get_sks_http_query_template(sk_source);
        final SubLObject parsing_method = get_sks_http_parsing_method(sk_source);
        final SubLObject parsing_program = get_sks_http_parsing_program(sk_source);
        SubLObject physical_field_names = NIL;
        if (NIL != ignore_access_path_errorsP()) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        physical_field_names = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
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
        } else {
            physical_field_names = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
        }
        return new_web_page_access_path(sk_source, server, port, url, timeout, request_method, query_template, parsing_method, parsing_program, physical_field_names);
    }

    public static SubLObject new_web_page_access_path(final SubLObject sk_source, final SubLObject server, final SubLObject port, final SubLObject url, final SubLObject timeout, final SubLObject request_method, final SubLObject query_template, final SubLObject parsing_method, final SubLObject parsing_program, final SubLObject physical_field_names) {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $SKS, sk_source);
        access_path_enter(ap, $$sksIsa, $$WebPage_AIS);
        access_path_enter(ap, $$serverOfSKS, server);
        access_path_enter(ap, $$portNumberForSKS, port);
        access_path_enter(ap, $$httpdRequestURLForSKS, url);
        access_path_enter(ap, $TIMEOUT, timeout);
        access_path_enter(ap, $$httpdRequestQueryTemplateForSKS, query_template);
        access_path_enter(ap, $$httpdRequestMethodForSKS, request_method);
        access_path_enter(ap, $PARSING_METHOD, parsing_method);
        access_path_enter(ap, $PARSING_PROGRAM, parsing_program);
        access_path_enter(ap, $PHYSICAL_FIELD_NAMES, physical_field_names);
        return ap;
    }

    public static SubLObject sksi_determine_kb_access_path(final SubLObject sk_source) {
        return NIL;
    }

    public static SubLObject sksi_determine_fht_access_path(final SubLObject sk_source) {
        final SubLObject filename = get_sks_fht_filename(sk_source);
        final SubLObject key_test_fn = get_sks_fht_key_test_function(sk_source);
        final SubLObject value_test_fn = get_sks_fht_value_test_function(sk_source);
        final SubLObject serialization = get_sks_fht_serialization_type(sk_source);
        return new_fht_access_path(sk_source, filename, key_test_fn, value_test_fn, serialization);
    }

    public static SubLObject new_fht_access_path(final SubLObject sk_source, final SubLObject filename, final SubLObject key_test_fn, final SubLObject value_test_fn, final SubLObject serialization) {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $SKS, sk_source);
        access_path_enter(ap, $$sksIsa, $$FileHashTable_File);
        access_path_enter(ap, $$filenameForSKS, filename);
        access_path_enter(ap, $$keyTestFunctionForSKS, key_test_fn);
        access_path_enter(ap, $$valueTestFunctionForSKS, value_test_fn);
        access_path_enter(ap, $$serializationTypeForSKS, serialization);
        return ap;
    }

    public static SubLObject sksi_determine_corba_access_path(final SubLObject sks) {
        final SubLObject proxy_host = sksi_sks_accessors.sks_fget(sks, $$sksProxyHost, UNPROVIDED);
        final SubLObject proxy_port = sksi_sks_accessors.sks_fget(sks, $$sksProxyPort, UNPROVIDED);
        final SubLObject initial_orb_host = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBHost, UNPROVIDED);
        final SubLObject initial_orb_port = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBPort, UNPROVIDED);
        final SubLObject service_name = sksi_sks_accessors.sks_fget(sks, $$corbaSKSServiceName, UNPROVIDED);
        final SubLObject initial_object_class = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialObjectClass, UNPROVIDED);
        final SubLObject initial_object_class_helper = (NIL != initial_object_class) ? cconcatenate(initial_object_class, $$$Helper) : NIL;
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $SKS, sks);
        access_path_enter(ap, $$sksIsa, $const13$CommonObjectRequestBrokerArchitec);
        access_path_enter(ap, $$sksProxyHost, proxy_host);
        access_path_enter(ap, $$sksProxyPort, proxy_port);
        access_path_enter(ap, $INITIAL_ORB_HOST, initial_orb_host);
        access_path_enter(ap, $INITIAL_ORB_PORT, initial_orb_port);
        access_path_enter(ap, $SERVICE_NAME, service_name);
        access_path_enter(ap, $INITIAL_OBJECT_CLASS, initial_object_class);
        access_path_enter(ap, $INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper);
        return ap;
    }

    public static SubLObject sksi_determine_rdf_access_path(final SubLObject sk_source) {
        final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks(sk_source);
        final SubLObject name = get_sks_db_name(sk_source);
        final SubLObject user_name = get_sks_db_user_name(top_level_source);
        final SubLObject password = get_sks_db_password(top_level_source);
        final SubLObject server = get_sks_server(top_level_source);
        final SubLObject port = get_sks_port(top_level_source);
        final SubLObject proxy_server = get_sks_proxy_server(top_level_source);
        final SubLObject proxy_port = get_sks_proxy_port(top_level_source);
        final SubLObject subprotocol = get_sks_db_subprotocol(top_level_source);
        final SubLObject base_uri = get_sks_base_uri(top_level_source);
        final SubLObject prefix_to_uri_map = get_sks_prefix_to_uri_map(top_level_source);
        final SubLObject rdf_store = get_sks_rdf_store(top_level_source);
        final SubLObject relative_path = get_sks_relative_path(top_level_source);
        final SubLObject timeout = get_sks_open_connection_timeout(top_level_source);
        return new_rdf_access_path(sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, base_uri, prefix_to_uri_map, rdf_store, relative_path, timeout);
    }

    public static SubLObject new_rdf_access_path(final SubLObject sk_source, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject server, final SubLObject port, final SubLObject proxy_server, final SubLObject proxy_port, final SubLObject subprotocol, final SubLObject base_uri, final SubLObject prefix_to_uri_map, final SubLObject rdf_store, final SubLObject relative_path, final SubLObject timeout) {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $SKS, sk_source);
        access_path_enter(ap, $$sksIsa, $$RDFTripleStore_Physical);
        access_path_enter(ap, $$structuredKnowledgeSourceName, db);
        access_path_enter(ap, $$userNameForSKS, user);
        access_path_enter(ap, $$passwordForSKS, password);
        access_path_enter(ap, $$serverOfSKS, server);
        access_path_enter(ap, $$portNumberForSKS, port);
        access_path_enter(ap, $$sksProxyHost, proxy_server);
        access_path_enter(ap, $$sksProxyPort, proxy_port);
        access_path_enter(ap, $$subProtocolForSKS, subprotocol);
        access_path_enter(ap, $$baseNamespaceForSKS, base_uri);
        access_path_enter(ap, $$nameSpacePrefixForSKS, prefix_to_uri_map);
        access_path_enter(ap, $$rdfStoreIdentifierForSKS, rdf_store);
        access_path_enter(ap, $$relativePathForAPIAccessToSKS, relative_path);
        access_path_enter(ap, $TIMEOUT, timeout);
        return ap;
    }

    public static SubLObject get_red_value_from_framework(final SubLObject key) {
        return NIL;
    }

    public static SubLObject get_sksi_red_pred_value(final SubLObject sk_source, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject red_string = cconcatenate($sksi_red_prefix$.getGlobalValue(), new SubLObject[]{ $str57$_, $sksi_red_access_path_prefix$.getGlobalValue(), $str57$_, kb_paths.fort_name(sk_source), $str57$_, kb_paths.fort_name(pred) });
        SubLObject value = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    value = get_red_value_from_framework(red_string);
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
        if (NIL != value) {
            if ((value.isString() && (NIL != list_utilities.lengthG(value, TWO_INTEGER, UNPROVIDED))) && string_utilities.substring(value, ZERO_INTEGER, TWO_INTEGER).equal($str58$__)) {
                value = constants_high.find_constant(string_utilities.substring(value, TWO_INTEGER, UNPROVIDED));
            }
            final SubLObject support = arguments.make_hl_support($OPAQUE, make_binary_formula(pred, sk_source, value), UNPROVIDED, UNPROVIDED);
            if (NIL != arguments.hl_support_p(support)) {
                sksi_hl_support_utilities.note_csql_support(support);
            }
        }
        return value;
    }

    public static SubLObject get_access_path_info(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (gather_argnum == UNPROVIDED) {
            gather_argnum = TWO_INTEGER;
        }
        if (check_arg == UNPROVIDED) {
            check_arg = NIL;
        }
        if (check_argnum == UNPROVIDED) {
            check_argnum = NIL;
        }
        SubLObject result = NIL;
        result = get_access_path_info_from_kb(sk_source, pred, index_argnum, gather_argnum, check_arg, check_argnum);
        if (NIL != result) {
            return result;
        }
        if (NIL != subl_promotions.memberP(pred, $red_candidate_access_path_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            result = get_sksi_red_pred_value(sk_source, pred);
        }
        return result;
    }

    public static SubLObject get_access_path_info_from_kb(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum) {
        if (index_argnum == UNPROVIDED) {
            index_argnum = ONE_INTEGER;
        }
        if (gather_argnum == UNPROVIDED) {
            gather_argnum = TWO_INTEGER;
        }
        if (check_arg == UNPROVIDED) {
            check_arg = NIL;
        }
        if (check_argnum == UNPROVIDED) {
            check_argnum = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != ignore_access_path_errorsP()) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        v_answer = sksi_kb_accessors.get_sk_source_property_from_kb(sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum);
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
        } else {
            v_answer = sksi_kb_accessors.get_sk_source_property_from_kb(sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum);
        }
        return v_answer;
    }

    public static SubLObject get_sks_type(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_server(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$serverOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_port(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$portNumberForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_proxy_server(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksProxyHost, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_proxy_port(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksProxyPort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_open_connection_timeout(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value(sk_source, $$sksConnectionTimeout, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject get_sks_db_name(final SubLObject sk_source) {
        return get_access_path_info(sksi_kb_accessors.max_genl_ks(sk_source), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_user_name(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$userNameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_password(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$passwordForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_subprotocol(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$subProtocolForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_sql_flavor(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sqlProgramForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_spreadsheet_db_name(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.getDynamicValue(thread)) {
            SubLObject db_name = get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FOUR_INTEGER, ONE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.getDynamicValue(thread);
            SubLObject table_name = NIL;
            table_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                db_name = cconcatenate(db_name, new SubLObject[]{ $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(table_name, $$sksiTargetForSpreadsheet, FIVE_INTEGER, TWO_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(table_name, $$sksiTargetForSpreadsheet, FIVE_INTEGER, THREE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) });
                cdolist_list_var = cdolist_list_var.rest();
                table_name = cdolist_list_var.first();
            } 
            return db_name;
        }
        if (sk_source.equal(sksi_kb_accessors.max_genl_ks(sk_source))) {
            return cconcatenate(get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FOUR_INTEGER, ONE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new SubLObject[]{ $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FOUR_INTEGER, TWO_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FOUR_INTEGER, THREE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) });
        }
        return cconcatenate(get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FIVE_INTEGER, ONE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new SubLObject[]{ $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FIVE_INTEGER, TWO_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str63$_, get_access_path_info(kb_mapping_utilities.fpred_value(sk_source, $$sksiTargetForSpreadsheet, FIVE_INTEGER, THREE_INTEGER, $TRUE), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) });
    }

    public static SubLObject get_sks_http_url(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$httpdRequestURLForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_http_request_method(final SubLObject sk_source) {
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = get_access_path_info(sk_source, $$httpdRequestMethodForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql($$HTTP_GET_RequestMethod)) {
            return $GET;
        }
        if (pcase_var.eql($$HTTP_POST_RequestMethod)) {
            return $POST;
        }
        if (NIL != ignore_access_path_errorsP()) {
            return NIL;
        }
        Errors.error($str68$Unknown_HTTP_request_method__S_fo, method, sk_source);
        return NIL;
    }

    public static SubLObject get_sks_http_query_template(final SubLObject sk_source) {
        final SubLObject query_template = get_access_path_info(sk_source, $$httpdRequestQueryTemplateForSKS, ONE_INTEGER, THREE_INTEGER, UNPROVIDED, UNPROVIDED);
        return query_template;
    }

    public static SubLObject get_sks_http_parsing_method(final SubLObject sk_source) {
        final SubLObject parsing_program = get_access_path_info(sk_source, $const69$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != parsing_program) {
            return $SUBLBOOLEAN;
        }
        final SubLObject parsing_program_$3 = get_access_path_info(sk_source, $const71$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != parsing_program_$3) {
            return $SUBLUNBOUNDONLY;
        }
        return $SUBL;
    }

    public static SubLObject get_sks_http_parsing_program(final SubLObject sk_source) {
        final SubLObject parsing_program = get_access_path_info(sk_source, $const69$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != parsing_program) {
            return parsing_program;
        }
        final SubLObject parsing_program_$4 = get_access_path_info(sk_source, $const71$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != parsing_program_$4 ? parsing_program_$4 : get_access_path_info(sk_source, $const74$httpdRequestSubLParsingProgramFor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_fht_filename(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$filenameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_fht_key_test_function(final SubLObject sk_source) {
        final SubLObject test_fn = get_access_path_info(sk_source, $$keyTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != test_fn ? test_fn : file_hash_table.get_default_fht_test_function();
    }

    public static SubLObject get_sks_fht_value_test_function(final SubLObject sk_source) {
        final SubLObject test_fn = get_access_path_info(sk_source, $$valueTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != test_fn ? test_fn : symbol_function(EQUAL);
    }

    public static SubLObject get_sks_fht_serialization_type(final SubLObject sk_source) {
        final SubLObject serialization = get_access_path_info(sk_source, $$serializationTypeForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != serialization ? serialization : file_hash_table.get_default_fht_serialization_protocol();
    }

    public static SubLObject get_sks_base_uri(final SubLObject sk_source) {
        final SubLObject base_uri_term = get_access_path_info(sk_source, $$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != base_uri_term) {
            return get_uri_string(base_uri_term);
        }
        return NIL;
    }

    public static SubLObject get_uri_string(final SubLObject uri_term) {
        SubLObject uri_string = (NIL != indexed_term_p(uri_term)) ? kb_mapping_utilities.fpred_value(uri_term, $$uriString, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        if ((NIL == uri_string) && (NIL != cycl_grammar.cycl_nat_p(uri_term))) {
            uri_string = cycl_utilities.nat_arg(uri_term, ONE_INTEGER, UNPROVIDED);
        }
        return uri_string;
    }

    public static SubLObject get_sks_prefix_to_uri_map(final SubLObject sk_source) {
        final SubLObject tuples = inference_kernel.new_cyc_query(listS($$nameSpacePrefixForSKS, sk_source, $list76), mt_relevance_macros.current_mt_relevance_mt(), $list77);
        SubLObject uri_map = NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject prefix = NIL;
            SubLObject uri = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            prefix = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            uri = current.first();
            current = current.rest();
            if (NIL == current) {
                uri_map = list_utilities.alist_enter(uri_map, prefix, get_uri_string(uri), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list78);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return Sort.sort(uri_map, symbol_function(STRING_LESSP), symbol_function(FIRST));
    }

    public static SubLObject get_sks_rdf_store(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$rdfStoreIdentifierForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_relative_path(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$relativePathForAPIAccessToSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject access_path_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject new_access_path() {
        return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject access_path_enter(final SubLObject access_path, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(access_path, key, value);
    }

    public static SubLObject access_path_remove(final SubLObject access_path, final SubLObject key) {
        return dictionary.dictionary_remove(access_path, key);
    }

    public static SubLObject access_path_lookup(final SubLObject access_path, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return dictionary.dictionary_lookup_without_values(access_path, key, not_found);
    }

    public static SubLObject access_path_sks(final SubLObject access_path) {
        return access_path_lookup(access_path, $SKS, UNPROVIDED);
    }

    public static SubLObject access_path_type(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksIsa, UNPROVIDED);
    }

    public static SubLObject access_path_server(final SubLObject access_path) {
        return access_path_lookup(access_path, $$serverOfSKS, UNPROVIDED);
    }

    public static SubLObject access_path_port(final SubLObject access_path) {
        return access_path_lookup(access_path, $$portNumberForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_proxy_server(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksProxyHost, UNPROVIDED);
    }

    public static SubLObject access_path_proxy_port(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksProxyPort, UNPROVIDED);
    }

    public static SubLObject access_path_timeout(final SubLObject access_path) {
        return access_path_lookup(access_path, $TIMEOUT, UNPROVIDED);
    }

    public static SubLObject access_path_sql_flavor(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sqlProgramForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_db(final SubLObject access_path) {
        return access_path_lookup(access_path, $$structuredKnowledgeSourceName, UNPROVIDED);
    }

    public static SubLObject access_path_user(final SubLObject access_path) {
        return access_path_lookup(access_path, $$userNameForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_password(final SubLObject access_path) {
        return access_path_lookup(access_path, $$passwordForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_subprotocol(final SubLObject access_path) {
        return access_path_lookup(access_path, $$subProtocolForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_url(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestURLForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_request_method(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestMethodForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_query_template(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestQueryTemplateForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_parsing_method(final SubLObject access_path) {
        return access_path_lookup(access_path, $PARSING_METHOD, UNPROVIDED);
    }

    public static SubLObject access_path_parsing_program(final SubLObject access_path) {
        return access_path_lookup(access_path, $PARSING_PROGRAM, UNPROVIDED);
    }

    public static SubLObject access_path_physical_field_names(final SubLObject access_path) {
        return access_path_lookup(access_path, $PHYSICAL_FIELD_NAMES, UNPROVIDED);
    }

    public static SubLObject access_path_filename(final SubLObject access_path) {
        return access_path_lookup(access_path, $$filenameForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_key_test_function(final SubLObject access_path) {
        return access_path_lookup(access_path, $$keyTestFunctionForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_value_test_function(final SubLObject access_path) {
        return access_path_lookup(access_path, $$valueTestFunctionForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_serialization_type(final SubLObject access_path) {
        return access_path_lookup(access_path, $$serializationTypeForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_rdf_base(final SubLObject access_path) {
        return access_path_lookup(access_path, $$baseNamespaceForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_rdf_prefix_map(final SubLObject access_path) {
        return access_path_lookup(access_path, $$nameSpacePrefixForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_api_access_relative_path(final SubLObject access_path) {
        return access_path_lookup(access_path, $$relativePathForAPIAccessToSKS, UNPROVIDED);
    }

    public static SubLObject adjust_server_of_access_path(final SubLObject access_path, final SubLObject new_server) {
        assert NIL != stringp(new_server) : "Types.stringp(new_server) " + "CommonSymbols.NIL != Types.stringp(new_server) " + new_server;
        return access_path_enter(access_path, $$serverOfSKS, new_server);
    }

    public static SubLObject declare_sksi_access_path_file() {
        declareFunction(me, "structured_knowledge_source_type", "STRUCTURED-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
        declareFunction(me, "determine_sks_type_internal", "DETERMINE-SKS-TYPE-INTERNAL", 1, 1, false);
        declareFunction(me, "determine_sks_type", "DETERMINE-SKS-TYPE", 1, 1, false);
        declareFunction(me, "determine_sks_db_sql_flavor", "DETERMINE-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction(me, "clear_external_source_access_path_cache", "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 0, false);
        declareFunction(me, "initialize_external_source_access_path_cache", "INITIALIZE-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 1, false);
        declareFunction(me, "external_source_access_path", "EXTERNAL-SOURCE-ACCESS-PATH", 1, 2, false);
        declareFunction(me, "external_source_access_path_int", "EXTERNAL-SOURCE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction(me, "get_external_source_access_path_from_cache", "GET-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction(me, "remove_external_source_access_path_from_cache", "REMOVE-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction(me, "add_to_external_source_access_path", "ADD-TO-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction(me, "remove_from_external_source_access_path", "REMOVE-FROM-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction(me, "sksi_determine_access_path", "SKSI-DETERMINE-ACCESS-PATH", 1, 2, false);
        declareMacro(me, "with_ignore_access_path_errors", "WITH-IGNORE-ACCESS-PATH-ERRORS");
        declareFunction(me, "ignore_access_path_errorsP", "IGNORE-ACCESS-PATH-ERRORS?", 0, 0, false);
        declareFunction(me, "sksi_determine_access_path_int", "SKSI-DETERMINE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction(me, "sksi_determine_access_path_int2", "SKSI-DETERMINE-ACCESS-PATH-INT2", 2, 0, false);
        declareFunction(me, "new_cache_access_path", "NEW-CACHE-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "sksi_determine_db_access_path", "SKSI-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "spreadsheet_determine_db_access_path", "SPREADSHEET-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "new_db_access_path", "NEW-DB-ACCESS-PATH", 11, 0, false);
        declareFunction(me, "sksi_determine_web_page_access_path", "SKSI-DETERMINE-WEB-PAGE-ACCESS-PATH", 2, 0, false);
        declareFunction(me, "new_web_page_access_path", "NEW-WEB-PAGE-ACCESS-PATH", 10, 0, false);
        declareFunction(me, "sksi_determine_kb_access_path", "SKSI-DETERMINE-KB-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "sksi_determine_fht_access_path", "SKSI-DETERMINE-FHT-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "new_fht_access_path", "NEW-FHT-ACCESS-PATH", 5, 0, false);
        declareFunction(me, "sksi_determine_corba_access_path", "SKSI-DETERMINE-CORBA-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "sksi_determine_rdf_access_path", "SKSI-DETERMINE-RDF-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 14, 0, false);
        declareFunction(me, "get_red_value_from_framework", "GET-RED-VALUE-FROM-FRAMEWORK", 1, 0, false);
        declareFunction(me, "get_sksi_red_pred_value", "GET-SKSI-RED-PRED-VALUE", 2, 0, false);
        declareFunction(me, "get_access_path_info", "GET-ACCESS-PATH-INFO", 2, 4, false);
        declareFunction(me, "get_access_path_info_from_kb", "GET-ACCESS-PATH-INFO-FROM-KB", 2, 4, false);
        declareFunction(me, "get_sks_type", "GET-SKS-TYPE", 1, 0, false);
        declareFunction(me, "get_sks_server", "GET-SKS-SERVER", 1, 0, false);
        declareFunction(me, "get_sks_port", "GET-SKS-PORT", 1, 0, false);
        declareFunction(me, "get_sks_proxy_server", "GET-SKS-PROXY-SERVER", 1, 0, false);
        declareFunction(me, "get_sks_proxy_port", "GET-SKS-PROXY-PORT", 1, 0, false);
        declareFunction(me, "get_sks_open_connection_timeout", "GET-SKS-OPEN-CONNECTION-TIMEOUT", 1, 0, false);
        declareFunction(me, "get_sks_db_name", "GET-SKS-DB-NAME", 1, 0, false);
        declareFunction(me, "get_sks_db_user_name", "GET-SKS-DB-USER-NAME", 1, 0, false);
        declareFunction(me, "get_sks_db_password", "GET-SKS-DB-PASSWORD", 1, 0, false);
        declareFunction(me, "get_sks_db_subprotocol", "GET-SKS-DB-SUBPROTOCOL", 1, 0, false);
        declareFunction(me, "get_sks_db_sql_flavor", "GET-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction(me, "get_spreadsheet_db_name", "GET-SPREADSHEET-DB-NAME", 1, 0, false);
        declareFunction(me, "get_sks_http_url", "GET-SKS-HTTP-URL", 1, 0, false);
        declareFunction(me, "get_sks_http_request_method", "GET-SKS-HTTP-REQUEST-METHOD", 1, 0, false);
        declareFunction(me, "get_sks_http_query_template", "GET-SKS-HTTP-QUERY-TEMPLATE", 1, 0, false);
        declareFunction(me, "get_sks_http_parsing_method", "GET-SKS-HTTP-PARSING-METHOD", 1, 0, false);
        declareFunction(me, "get_sks_http_parsing_program", "GET-SKS-HTTP-PARSING-PROGRAM", 1, 0, false);
        declareFunction(me, "get_sks_fht_filename", "GET-SKS-FHT-FILENAME", 1, 0, false);
        declareFunction(me, "get_sks_fht_key_test_function", "GET-SKS-FHT-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "get_sks_fht_value_test_function", "GET-SKS-FHT-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "get_sks_fht_serialization_type", "GET-SKS-FHT-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction(me, "get_sks_base_uri", "GET-SKS-BASE-URI", 1, 0, false);
        declareFunction(me, "get_uri_string", "GET-URI-STRING", 1, 0, false);
        declareFunction(me, "get_sks_prefix_to_uri_map", "GET-SKS-PREFIX-TO-URI-MAP", 1, 0, false);
        declareFunction(me, "get_sks_rdf_store", "GET-SKS-RDF-STORE", 1, 0, false);
        declareFunction(me, "get_sks_relative_path", "GET-SKS-RELATIVE-PATH", 1, 0, false);
        declareFunction(me, "access_path_p", "ACCESS-PATH-P", 1, 0, false);
        declareFunction(me, "new_access_path", "NEW-ACCESS-PATH", 0, 0, false);
        declareFunction(me, "access_path_enter", "ACCESS-PATH-ENTER", 3, 0, false);
        declareFunction(me, "access_path_remove", "ACCESS-PATH-REMOVE", 2, 0, false);
        declareFunction(me, "access_path_lookup", "ACCESS-PATH-LOOKUP", 2, 1, false);
        declareFunction(me, "access_path_sks", "ACCESS-PATH-SKS", 1, 0, false);
        declareFunction(me, "access_path_type", "ACCESS-PATH-TYPE", 1, 0, false);
        declareFunction(me, "access_path_server", "ACCESS-PATH-SERVER", 1, 0, false);
        declareFunction(me, "access_path_port", "ACCESS-PATH-PORT", 1, 0, false);
        declareFunction(me, "access_path_proxy_server", "ACCESS-PATH-PROXY-SERVER", 1, 0, false);
        declareFunction(me, "access_path_proxy_port", "ACCESS-PATH-PROXY-PORT", 1, 0, false);
        declareFunction(me, "access_path_timeout", "ACCESS-PATH-TIMEOUT", 1, 0, false);
        declareFunction(me, "access_path_sql_flavor", "ACCESS-PATH-SQL-FLAVOR", 1, 0, false);
        declareFunction(me, "access_path_db", "ACCESS-PATH-DB", 1, 0, false);
        declareFunction(me, "access_path_user", "ACCESS-PATH-USER", 1, 0, false);
        declareFunction(me, "access_path_password", "ACCESS-PATH-PASSWORD", 1, 0, false);
        declareFunction(me, "access_path_subprotocol", "ACCESS-PATH-SUBPROTOCOL", 1, 0, false);
        declareFunction(me, "access_path_url", "ACCESS-PATH-URL", 1, 0, false);
        declareFunction(me, "access_path_request_method", "ACCESS-PATH-REQUEST-METHOD", 1, 0, false);
        declareFunction(me, "access_path_query_template", "ACCESS-PATH-QUERY-TEMPLATE", 1, 0, false);
        declareFunction(me, "access_path_parsing_method", "ACCESS-PATH-PARSING-METHOD", 1, 0, false);
        declareFunction(me, "access_path_parsing_program", "ACCESS-PATH-PARSING-PROGRAM", 1, 0, false);
        declareFunction(me, "access_path_physical_field_names", "ACCESS-PATH-PHYSICAL-FIELD-NAMES", 1, 0, false);
        declareFunction(me, "access_path_filename", "ACCESS-PATH-FILENAME", 1, 0, false);
        declareFunction(me, "access_path_key_test_function", "ACCESS-PATH-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "access_path_value_test_function", "ACCESS-PATH-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "access_path_serialization_type", "ACCESS-PATH-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction(me, "access_path_rdf_base", "ACCESS-PATH-RDF-BASE", 1, 0, false);
        declareFunction(me, "access_path_rdf_prefix_map", "ACCESS-PATH-RDF-PREFIX-MAP", 1, 0, false);
        declareFunction(me, "access_path_api_access_relative_path", "ACCESS-PATH-API-ACCESS-RELATIVE-PATH", 1, 0, false);
        declareFunction(me, "adjust_server_of_access_path", "ADJUST-SERVER-OF-ACCESS-PATH", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_access_path_file() {
        deflexical("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", SubLTrampolineFile.maybeDefault($external_source_access_path_cache$, $external_source_access_path_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defparameter("*IGNORE-ACCESS-PATH-ERRORS?*", NIL);
        deflexical("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list54);
        deflexical("*SKSI-RED-PREFIX*", $str55$application_sksi);
        deflexical("*SKSI-RED-ACCESS-PATH-PREFIX*", $str56$access_paths);
        return NIL;
    }

    public static SubLObject setup_sksi_access_path_file() {
        memoization_state.note_memoized_function(DETERMINE_SKS_TYPE);
        declare_defglobal($external_source_access_path_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_access_path_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_access_path_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_access_path_file();
    }

    
}

/**
 * Total time: 244 ms
 */
