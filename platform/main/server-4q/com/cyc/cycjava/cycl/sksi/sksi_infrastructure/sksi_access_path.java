/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
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

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-ACCESS-PATH
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-access-path.lisp
 * created:     2019/07/03 17:37:53
 */
public final class sksi_access_path extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_access_path();





    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $red_candidate_access_path_predicates$ = makeSymbol("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_red_prefix$ = makeSymbol("*SKSI-RED-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_red_access_path_prefix$ = makeSymbol("*SKSI-RED-ACCESS-PATH-PREFIX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol DETERMINE_SKS_TYPE = makeSymbol("DETERMINE-SKS-TYPE");

    private static final SubLSymbol $external_source_access_path_cache$ = makeSymbol("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*");





    static private final SubLString $str5$TestLanguageSpoken_DB = makeString("TestLanguageSpoken-DB");

    static private final SubLList $list6 = list(list(makeSymbol("IGNORE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $ignore_access_path_errorsP$ = makeSymbol("*IGNORE-ACCESS-PATH-ERRORS?*");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell("Database-Physical");

    private static final SubLObject $$WebPage_AIS = reader_make_constant_shell("WebPage-AIS");



    private static final SubLObject $$FileHashTable_File = reader_make_constant_shell("FileHashTable-File");

    private static final SubLObject $const13$CommonObjectRequestBrokerArchitec = reader_make_constant_shell("CommonObjectRequestBrokerArchitecture");

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell("RDFTripleStore-Physical");

    static private final SubLString $str15$Unknown_access_path_type__A_for__ = makeString("Unknown access path type ~A for ~A.");



















    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");







    private static final SubLSymbol $PHYSICAL_FIELD_NAMES = makeKeyword("PHYSICAL-FIELD-NAMES");

















    private static final SubLString $$$Helper = makeString("Helper");

    private static final SubLSymbol $INITIAL_ORB_HOST = makeKeyword("INITIAL-ORB-HOST");

    private static final SubLSymbol $INITIAL_ORB_PORT = makeKeyword("INITIAL-ORB-PORT");

    private static final SubLSymbol $INITIAL_OBJECT_CLASS = makeKeyword("INITIAL-OBJECT-CLASS");

    private static final SubLSymbol $INITIAL_OBJECT_CLASS_HELPER = makeKeyword("INITIAL-OBJECT-CLASS-HELPER");









    private static final SubLList $list54 = list(new SubLObject[]{ reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("sksProxyHost"), reader_make_constant_shell("sksProxyPort"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("serializationTypeForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS") });

    private static final SubLString $str55$application_sksi = makeString("application.sksi");

    private static final SubLString $str56$access_paths = makeString("access-paths");

    private static final SubLString $str57$_ = makeString(".");

    private static final SubLString $str58$__ = makeString("#$");





    private static final SubLString $str63$_ = makeString("!");

    private static final SubLObject $$HTTP_GET_RequestMethod = reader_make_constant_shell("HTTP-GET-RequestMethod");

    private static final SubLObject $$HTTP_POST_RequestMethod = reader_make_constant_shell("HTTP-POST-RequestMethod");

    private static final SubLString $str68$Unknown_HTTP_request_method__S_fo = makeString("Unknown HTTP request method ~S for ~S");

    private static final SubLObject $const69$httpdRequestSubLBooleanParsingPro = reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS");

    private static final SubLObject $const71$httpdRequestUnboundOnlySubLParsin = reader_make_constant_shell("httpdRequestUnboundOnlySubLParsingProgramForSKS");

    private static final SubLObject $const74$httpdRequestSubLParsingProgramFor = reader_make_constant_shell("httpdRequestSubLParsingProgramForSKS");



    private static final SubLList $list76 = list(makeSymbol("?PREFIX"), makeSymbol("?URI"));

    private static final SubLList $list77 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?PREFIX"), makeSymbol("?URI"))));

    private static final SubLList $list78 = list(makeSymbol("PREFIX"), makeSymbol("URI"));

    // Definitions
    public static final SubLObject structured_knowledge_source_type_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_type(access_path);
    }

    // Definitions
    public static SubLObject structured_knowledge_source_type(final SubLObject access_path) {
        return access_path_type(access_path);
    }

    public static final SubLObject determine_sks_type_internal_alt(SubLObject sk_source, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_type(sk_source);
    }

    public static SubLObject determine_sks_type_internal(final SubLObject sk_source, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return get_sks_type(sk_source);
    }

    public static final SubLObject determine_sks_type_alt(SubLObject sk_source, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.determine_sks_type_internal(sk_source, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DETERMINE_SKS_TYPE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DETERMINE_SKS_TYPE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, DETERMINE_SKS_TYPE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(sk_source, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sk_source == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt_info == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.determine_sks_type_internal(sk_source, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sk_source, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
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

    public static final SubLObject determine_sks_db_sql_flavor_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_sql_flavor(sk_source);
    }

    public static SubLObject determine_sks_db_sql_flavor(final SubLObject sk_source) {
        return get_sks_db_sql_flavor(sk_source);
    }

    public static final SubLObject clear_external_source_access_path_cache_alt() {
        dictionary.clear_dictionary($external_source_access_path_cache$.getGlobalValue());
        return $external_source_access_path_cache$.getGlobalValue();
    }

    public static SubLObject clear_external_source_access_path_cache() {
        dictionary.clear_dictionary($external_source_access_path_cache$.getGlobalValue());
        return $external_source_access_path_cache$.getGlobalValue();
    }

    /**
     * Initializes the external source access path cache.
     * If ONLY-ALLOWED-SOURCES? then only access paths for external
     * sources that are allowed to be used in the current image are
     * initialized. Otherwise, access paths for all complete
     * knowledge sources are initialized.
     */
    @LispMethod(comment = "Initializes the external source access path cache.\r\nIf ONLY-ALLOWED-SOURCES? then only access paths for external\r\nsources that are allowed to be used in the current image are\r\ninitialized. Otherwise, access paths for all complete\r\nknowledge sources are initialized.\nInitializes the external source access path cache.\nIf ONLY-ALLOWED-SOURCES? then only access paths for external\nsources that are allowed to be used in the current image are\ninitialized. Otherwise, access paths for all complete\nknowledge sources are initialized.")
    public static final SubLObject initialize_external_source_access_path_cache_alt(SubLObject allowed_sources_onlyP) {
        if (allowed_sources_onlyP == UNPROVIDED) {
            allowed_sources_onlyP = NIL;
        }
        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.clear_external_source_access_path_cache();
        {
            SubLObject sks_list = (NIL != allowed_sources_onlyP) ? ((SubLObject) (sksi_infrastructure_utilities.list_of_external_sources_activated_in_image())) : sksi_infrastructure_utilities.gather_all_complete_knowledge_sources();
            SubLObject cdolist_list_var = sks_list;
            SubLObject sks = NIL;
            for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.external_source_access_path(sks, UNPROVIDED, UNPROVIDED);
            }
        }
        return $external_source_access_path_cache$.getGlobalValue();
    }

    /**
     * Initializes the external source access path cache.
     * If ONLY-ALLOWED-SOURCES? then only access paths for external
     * sources that are allowed to be used in the current image are
     * initialized. Otherwise, access paths for all complete
     * knowledge sources are initialized.
     */
    @LispMethod(comment = "Initializes the external source access path cache.\r\nIf ONLY-ALLOWED-SOURCES? then only access paths for external\r\nsources that are allowed to be used in the current image are\r\ninitialized. Otherwise, access paths for all complete\r\nknowledge sources are initialized.\nInitializes the external source access path cache.\nIf ONLY-ALLOWED-SOURCES? then only access paths for external\nsources that are allowed to be used in the current image are\ninitialized. Otherwise, access paths for all complete\nknowledge sources are initialized.")
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

    public static final SubLObject external_source_access_path_alt(SubLObject sk_source, SubLObject physical_schema, SubLObject mapping_mt) {
        if (physical_schema == UNPROVIDED) {
            physical_schema = NIL;
        }
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        {
            SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
            if (NIL != dictionary.dictionary_p(mt_access_path_subcache)) {
                {
                    SubLObject access_path = dictionary.dictionary_lookup_without_values(mt_access_path_subcache, mapping_mt, UNPROVIDED);
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_p(access_path)) {
                        return access_path;
                    } else {
                        access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.external_source_access_path_int(sk_source, physical_schema, mapping_mt);
                        dictionary.dictionary_enter(mt_access_path_subcache, mapping_mt, access_path);
                        return access_path;
                    }
                }
            } else {
                mt_access_path_subcache = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.external_source_access_path_int(sk_source, physical_schema, mapping_mt);
                    dictionary.dictionary_enter(mt_access_path_subcache, mapping_mt, access_path);
                    dictionary.dictionary_enter($external_source_access_path_cache$.getGlobalValue(), sk_source, mt_access_path_subcache);
                    return access_path;
                }
            }
        }
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

    public static final SubLObject external_source_access_path_int_alt(SubLObject sk_source, SubLObject physical_schema, SubLObject mapping_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject access_path = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt3$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject mt_var = mapping_mt;
                                    {
                                        SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_access_path(sk_source, physical_schema, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return access_path;
            }
        }
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

    /**
     * This is different than @xref external-source-access-path
     * in that it does not create an access-path for SK-SOURCE and
     * MAPPING-MT if there is not one already in the cache.
     */
    @LispMethod(comment = "This is different than @xref external-source-access-path\r\nin that it does not create an access-path for SK-SOURCE and\r\nMAPPING-MT if there is not one already in the cache.\nThis is different than @xref external-source-access-path\nin that it does not create an access-path for SK-SOURCE and\nMAPPING-MT if there is not one already in the cache.")
    public static final SubLObject get_external_source_access_path_from_cache_alt(SubLObject sk_source, SubLObject mapping_mt) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        {
            SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
            if (NIL != dictionary.dictionary_p(mt_access_path_subcache)) {
                return dictionary.dictionary_lookup_without_values(mt_access_path_subcache, mapping_mt, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * This is different than @xref external-source-access-path
     * in that it does not create an access-path for SK-SOURCE and
     * MAPPING-MT if there is not one already in the cache.
     */
    @LispMethod(comment = "This is different than @xref external-source-access-path\r\nin that it does not create an access-path for SK-SOURCE and\r\nMAPPING-MT if there is not one already in the cache.\nThis is different than @xref external-source-access-path\nin that it does not create an access-path for SK-SOURCE and\nMAPPING-MT if there is not one already in the cache.")
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

    /**
     * Removes the access path for [SK-SOURCE, MAPPING-MT] pair
     * from the access path cache.
     */
    @LispMethod(comment = "Removes the access path for [SK-SOURCE, MAPPING-MT] pair\r\nfrom the access path cache.\nRemoves the access path for [SK-SOURCE, MAPPING-MT] pair\nfrom the access path cache.")
    public static final SubLObject remove_external_source_access_path_from_cache_alt(SubLObject sk_source, SubLObject mapping_mt) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        {
            SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values($external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED);
            if (NIL != dictionary.dictionary_p(mt_access_path_subcache)) {
                return dictionary.dictionary_remove(mt_access_path_subcache, mapping_mt);
            }
        }
        return NIL;
    }

    /**
     * Removes the access path for [SK-SOURCE, MAPPING-MT] pair
     * from the access path cache.
     */
    @LispMethod(comment = "Removes the access path for [SK-SOURCE, MAPPING-MT] pair\r\nfrom the access path cache.\nRemoves the access path for [SK-SOURCE, MAPPING-MT] pair\nfrom the access path cache.")
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

    /**
     * Adds VALUE for PROPERTY in the access-path for SK-SOURCE
     * (if any) only if there is no current value for PROPERTY.
     */
    @LispMethod(comment = "Adds VALUE for PROPERTY in the access-path for SK-SOURCE\r\n(if any) only if there is no current value for PROPERTY.\nAdds VALUE for PROPERTY in the access-path for SK-SOURCE\n(if any) only if there is no current value for PROPERTY.")
    public static final SubLObject add_to_external_source_access_path_alt(SubLObject sk_source, SubLObject property, SubLObject value) {
        {
            SubLObject access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_external_source_access_path_from_cache(sk_source, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_p(access_path)) {
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(access_path, property, value);
            }
            return access_path;
        }
    }

    /**
     * Adds VALUE for PROPERTY in the access-path for SK-SOURCE
     * (if any) only if there is no current value for PROPERTY.
     */
    @LispMethod(comment = "Adds VALUE for PROPERTY in the access-path for SK-SOURCE\r\n(if any) only if there is no current value for PROPERTY.\nAdds VALUE for PROPERTY in the access-path for SK-SOURCE\n(if any) only if there is no current value for PROPERTY.")
    public static SubLObject add_to_external_source_access_path(final SubLObject sk_source, final SubLObject property, final SubLObject value) {
        final SubLObject access_path = get_external_source_access_path_from_cache(sk_source, UNPROVIDED);
        if (NIL != access_path_p(access_path)) {
            access_path_enter(access_path, property, value);
        }
        return access_path;
    }

    /**
     * Removes the value for PROPERTY in the access-path for SK-SOURCE
     * (if any) only if the current is equal to VALUE.
     */
    @LispMethod(comment = "Removes the value for PROPERTY in the access-path for SK-SOURCE\r\n(if any) only if the current is equal to VALUE.\nRemoves the value for PROPERTY in the access-path for SK-SOURCE\n(if any) only if the current is equal to VALUE.")
    public static final SubLObject remove_from_external_source_access_path_alt(SubLObject sk_source, SubLObject property, SubLObject value) {
        {
            SubLObject access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_external_source_access_path_from_cache(sk_source, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_p(access_path)) {
                {
                    SubLObject current_value = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, property, $NOT_FOUND);
                    if (value.equal(current_value)) {
                        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_remove(access_path, property);
                    }
                }
            }
            return access_path;
        }
    }

    /**
     * Removes the value for PROPERTY in the access-path for SK-SOURCE
     * (if any) only if the current is equal to VALUE.
     */
    @LispMethod(comment = "Removes the value for PROPERTY in the access-path for SK-SOURCE\r\n(if any) only if the current is equal to VALUE.\nRemoves the value for PROPERTY in the access-path for SK-SOURCE\n(if any) only if the current is equal to VALUE.")
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

    public static final SubLObject sksi_determine_access_path_alt(SubLObject sk_source, SubLObject physical_schema, SubLObject ignore_errorsP) {
        if (physical_schema == UNPROVIDED) {
            physical_schema = NIL;
        }
        if (ignore_errorsP == UNPROVIDED) {
            ignore_errorsP = NIL;
        }
        if ((NIL != constant_p(sk_source)) && constants_high.constant_name(sk_source).equal($str_alt5$TestLanguageSpoken_DB)) {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_cache_access_path();
        } else {
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_access_path_int(sk_source, physical_schema, ignore_errorsP);
        }
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

    public static final SubLObject with_ignore_access_path_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject ignoreP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    ignoreP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($ignore_access_path_errorsP$, ignoreP)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
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
            return listS(CLET, list(list($ignore_access_path_errorsP$, ignoreP)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static final SubLObject ignore_access_path_errorsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ignore_access_path_errorsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject ignore_access_path_errorsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ignore_access_path_errorsP$.getDynamicValue(thread);
    }

    public static final SubLObject sksi_determine_access_path_int_alt(SubLObject sk_source, SubLObject physical_schema, SubLObject ignore_errorsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject access_path = NIL;
                {
                    SubLObject _prev_bind_0 = $ignore_access_path_errorsP$.currentBinding(thread);
                    try {
                        $ignore_access_path_errorsP$.bind(ignore_errorsP, thread);
                        access_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_access_path_int2(sk_source, physical_schema);
                    } finally {
                        $ignore_access_path_errorsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return access_path;
            }
        }
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

    public static final SubLObject sksi_determine_access_path_int2_alt(SubLObject sk_source, SubLObject physical_schema) {
        {
            SubLObject type = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.determine_sks_type(sk_source, UNPROVIDED);
            SubLObject pcase_var = type;
            if (pcase_var.eql($$Database_Physical)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_db_access_path(sk_source);
            } else {
                if (pcase_var.eql($$WebPage_AIS)) {
                    if (NIL == physical_schema) {
                        physical_schema = sksi_kb_accessors.sk_source_complex_physical_schemata(sk_source).first();
                    }
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_web_page_access_path(sk_source, physical_schema);
                } else {
                    if (pcase_var.eql($$CycKB)) {
                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_kb_access_path(sk_source);
                    } else {
                        if (pcase_var.eql($$FileHashTable_File)) {
                            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_fht_access_path(sk_source);
                        } else {
                            if (pcase_var.eql($const13$CommonObjectRequestBrokerArchitec)) {
                                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_corba_access_path(sk_source);
                            } else {
                                if (pcase_var.eql($$RDFTripleStore_Physical)) {
                                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.sksi_determine_rdf_access_path(sk_source);
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.ignore_access_path_errorsP()) {
                                        return NIL;
                                    } else {
                                        Errors.error($str_alt15$Unknown_access_path_type__A_for__, type, sk_source);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject new_cache_access_path_alt() {
        {
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $CACHE);
            return ap;
        }
    }

    public static SubLObject new_cache_access_path() {
        final SubLObject ap = new_access_path();
        access_path_enter(ap, $$sksIsa, $CACHE);
        return ap;
    }

    public static final SubLObject sksi_determine_db_access_path_alt(SubLObject sk_source) {
        {
            SubLObject top_level_source = sksi_kb_accessors.max_genl_ks(sk_source);
            SubLObject name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_name(sk_source);
            SubLObject user_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_user_name(top_level_source);
            SubLObject password = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_password(top_level_source);
            SubLObject server = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_server(top_level_source);
            SubLObject port = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_port(top_level_source);
            SubLObject proxy_server = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_proxy_server(top_level_source);
            SubLObject proxy_port = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_proxy_port(top_level_source);
            SubLObject subprotocol = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_subprotocol(top_level_source);
            SubLObject sql_flavor = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_sql_flavor(top_level_source);
            SubLObject timeout = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_open_connection_timeout(top_level_source);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_db_access_path(sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, sql_flavor, timeout);
        }
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

    public static final SubLObject new_db_access_path_alt(SubLObject sk_source, SubLObject db, SubLObject user, SubLObject password, SubLObject server, SubLObject port, SubLObject proxy_server, SubLObject proxy_port, SubLObject subprotocol, SubLObject sql_flavor, SubLObject timeout) {
        {
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SKS, sk_source);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $$Database_Physical);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$structuredKnowledgeSourceName, db);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$userNameForSKS, user);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$passwordForSKS, password);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$serverOfSKS, server);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$portNumberForSKS, port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyHost, proxy_server);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyPort, proxy_port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$subProtocolForSKS, subprotocol);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sqlProgramForSKS, sql_flavor);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $TIMEOUT, timeout);
            return ap;
        }
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

    public static final SubLObject sksi_determine_web_page_access_path_alt(SubLObject sk_source, SubLObject physical_schema) {
        {
            SubLObject server = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_server(sk_source);
            SubLObject port = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_port(sk_source);
            SubLObject url = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_http_url(sk_source);
            SubLObject timeout = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_open_connection_timeout(sk_source);
            SubLObject request_method = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_http_request_method(sk_source);
            SubLObject query_template = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_http_query_template(sk_source);
            SubLObject parsing_method = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_http_parsing_method(sk_source);
            SubLObject parsing_program = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_http_parsing_program(sk_source);
            SubLObject physical_field_names = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.ignore_access_path_errorsP()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    physical_field_names = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
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
            } else {
                physical_field_names = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
            }
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_web_page_access_path(sk_source, server, port, url, timeout, request_method, query_template, parsing_method, parsing_program, physical_field_names);
        }
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

    public static final SubLObject new_web_page_access_path_alt(SubLObject sk_source, SubLObject server, SubLObject port, SubLObject url, SubLObject timeout, SubLObject request_method, SubLObject query_template, SubLObject parsing_method, SubLObject parsing_program, SubLObject physical_field_names) {
        {
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SKS, sk_source);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $$WebPage_AIS);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$serverOfSKS, server);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$portNumberForSKS, port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$httpdRequestURLForSKS, url);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $TIMEOUT, timeout);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$httpdRequestQueryTemplateForSKS, query_template);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$httpdRequestMethodForSKS, request_method);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $PARSING_METHOD, parsing_method);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $PARSING_PROGRAM, parsing_program);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $PHYSICAL_FIELD_NAMES, physical_field_names);
            return ap;
        }
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

    public static final SubLObject sksi_determine_kb_access_path_alt(SubLObject sk_source) {
        return NIL;
    }

    public static SubLObject sksi_determine_kb_access_path(final SubLObject sk_source) {
        return NIL;
    }

    public static final SubLObject sksi_determine_fht_access_path_alt(SubLObject sk_source) {
        {
            SubLObject filename = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_fht_filename(sk_source);
            SubLObject key_test_fn = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_fht_key_test_function(sk_source);
            SubLObject value_test_fn = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_fht_value_test_function(sk_source);
            SubLObject serialization = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_fht_serialization_type(sk_source);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_fht_access_path(sk_source, filename, key_test_fn, value_test_fn, serialization);
        }
    }

    public static SubLObject sksi_determine_fht_access_path(final SubLObject sk_source) {
        final SubLObject filename = get_sks_fht_filename(sk_source);
        final SubLObject key_test_fn = get_sks_fht_key_test_function(sk_source);
        final SubLObject value_test_fn = get_sks_fht_value_test_function(sk_source);
        final SubLObject serialization = get_sks_fht_serialization_type(sk_source);
        return new_fht_access_path(sk_source, filename, key_test_fn, value_test_fn, serialization);
    }

    public static final SubLObject new_fht_access_path_alt(SubLObject sk_source, SubLObject filename, SubLObject key_test_fn, SubLObject value_test_fn, SubLObject serialization) {
        {
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SKS, sk_source);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $$FileHashTable_File);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$filenameForSKS, filename);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$keyTestFunctionForSKS, key_test_fn);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$valueTestFunctionForSKS, value_test_fn);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$serializationTypeForSKS, serialization);
            return ap;
        }
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

    public static final SubLObject sksi_determine_corba_access_path_alt(SubLObject sks) {
        {
            SubLObject proxy_host = sksi_sks_accessors.sks_fget(sks, $$sksProxyHost, UNPROVIDED);
            SubLObject proxy_port = sksi_sks_accessors.sks_fget(sks, $$sksProxyPort, UNPROVIDED);
            SubLObject initial_orb_host = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBHost, UNPROVIDED);
            SubLObject initial_orb_port = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialORBPort, UNPROVIDED);
            SubLObject service_name = sksi_sks_accessors.sks_fget(sks, $$corbaSKSServiceName, UNPROVIDED);
            SubLObject initial_object_class = sksi_sks_accessors.sks_fget(sks, $$corbaSKSInitialObjectClass, UNPROVIDED);
            SubLObject initial_object_class_helper = (NIL != initial_object_class) ? ((SubLObject) (cconcatenate(initial_object_class, $$$Helper))) : NIL;
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SKS, sks);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $const13$CommonObjectRequestBrokerArchitec);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyHost, proxy_host);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyPort, proxy_port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $INITIAL_ORB_HOST, initial_orb_host);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $INITIAL_ORB_PORT, initial_orb_port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SERVICE_NAME, service_name);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $INITIAL_OBJECT_CLASS, initial_object_class);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper);
            return ap;
        }
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

    public static final SubLObject sksi_determine_rdf_access_path_alt(SubLObject sk_source) {
        {
            SubLObject top_level_source = sksi_kb_accessors.max_genl_ks(sk_source);
            SubLObject name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_name(sk_source);
            SubLObject user_name = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_user_name(top_level_source);
            SubLObject password = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_db_password(top_level_source);
            SubLObject server = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_server(top_level_source);
            SubLObject port = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_port(top_level_source);
            SubLObject proxy_server = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_proxy_server(top_level_source);
            SubLObject proxy_port = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_proxy_port(top_level_source);
            SubLObject base_uri = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_base_uri(top_level_source);
            SubLObject prefix_to_uri_map = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_prefix_to_uri_map(top_level_source);
            SubLObject rdf_store = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_rdf_store(top_level_source);
            SubLObject relative_path = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_relative_path(top_level_source);
            SubLObject timeout = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sks_open_connection_timeout(top_level_source);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_rdf_access_path(sk_source, name, user_name, password, server, port, proxy_server, proxy_port, base_uri, prefix_to_uri_map, rdf_store, relative_path, timeout);
        }
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

    public static final SubLObject new_rdf_access_path(SubLObject sk_source, SubLObject db, SubLObject user, SubLObject password, SubLObject server, SubLObject port, SubLObject proxy_server, SubLObject proxy_port, SubLObject base_uri, SubLObject prefix_to_uri_map, SubLObject rdf_store, SubLObject relative_path, SubLObject timeout) {
        {
            SubLObject ap = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.new_access_path();
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $SKS, sk_source);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksIsa, $$RDFTripleStore_Physical);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$structuredKnowledgeSourceName, db);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$userNameForSKS, user);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$passwordForSKS, password);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$serverOfSKS, server);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$portNumberForSKS, port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyHost, proxy_server);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$sksProxyPort, proxy_port);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$baseNamespaceForSKS, base_uri);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$nameSpacePrefixForSKS, prefix_to_uri_map);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$rdfStoreIdentifierForSKS, rdf_store);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $$relativePathForAPIAccessToSKS, relative_path);
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(ap, $TIMEOUT, timeout);
            return ap;
        }
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

    public static final SubLObject get_red_value_from_framework_alt(SubLObject key) {
        return NIL;
    }

    public static SubLObject get_red_value_from_framework(final SubLObject key) {
        return NIL;
    }

    public static final SubLObject get_sksi_red_pred_value_alt(SubLObject sk_source, SubLObject pred) {
        {
            SubLObject red_string = cconcatenate($sksi_red_prefix$.getGlobalValue(), new SubLObject[]{ $str_alt58$_, $sksi_red_access_path_prefix$.getGlobalValue(), $str_alt58$_, constants_high.constant_name(sk_source), $str_alt58$_, constants_high.constant_name(pred) });
            SubLObject value = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            value = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_red_value_from_framework(red_string);
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
            if (NIL != value) {
                if ((value.isString() && (NIL != list_utilities.lengthG(value, TWO_INTEGER, UNPROVIDED))) && string_utilities.substring(value, ZERO_INTEGER, TWO_INTEGER).equal($str_alt59$__)) {
                    value = constants_high.find_constant(string_utilities.substring(value, TWO_INTEGER, UNPROVIDED));
                }
                {
                    SubLObject support = arguments.make_hl_support($OPAQUE, make_binary_formula(pred, sk_source, value), UNPROVIDED, UNPROVIDED);
                    if (NIL != arguments.hl_support_p(support)) {
                        sksi_hl_support_utilities.note_csql_support(support);
                    }
                }
            }
            return value;
        }
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

    public static final SubLObject get_access_path_info_alt(SubLObject sk_source, SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum) {
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
        {
            SubLObject result = NIL;
            result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info_from_kb(sk_source, pred, index_argnum, gather_argnum, check_arg, check_argnum);
            if (NIL != result) {
                return result;
            }
            if (NIL != subl_promotions.memberP(pred, $red_candidate_access_path_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                result = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_sksi_red_pred_value(sk_source, pred);
            }
            return result;
        }
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

    public static final SubLObject get_access_path_info_from_kb_alt(SubLObject sk_source, SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum) {
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
        {
            SubLObject v_answer = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.ignore_access_path_errorsP()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    v_answer = sksi_kb_accessors.get_sk_source_property_from_kb(sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum);
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
            } else {
                v_answer = sksi_kb_accessors.get_sk_source_property_from_kb(sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum);
            }
            return v_answer;
        }
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

    public static final SubLObject get_sks_type_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$sksIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_type(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_server_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$serverOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_server(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$serverOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_port_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$portNumberForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_port(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$portNumberForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_proxy_server_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$sksProxyHost, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_proxy_server(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksProxyHost, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_proxy_port_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$sksProxyPort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_proxy_port(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$sksProxyPort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_open_connection_timeout_alt(SubLObject sk_source) {
        return NIL;
    }

    public static SubLObject get_sks_open_connection_timeout(final SubLObject sk_source) {
        return kb_mapping_utilities.fpred_value(sk_source, $$sksConnectionTimeout, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject get_sks_db_name_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sksi_kb_accessors.max_genl_ks(sk_source), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_name(final SubLObject sk_source) {
        return get_access_path_info(sksi_kb_accessors.max_genl_ks(sk_source), $$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_db_user_name_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$userNameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_user_name(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$userNameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_db_password_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$passwordForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_password(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$passwordForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_db_subprotocol_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$subProtocolForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_db_subprotocol(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$subProtocolForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_db_sql_flavor_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$sqlProgramForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject get_sks_http_url_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$httpdRequestURLForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_http_url(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$httpdRequestURLForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_http_request_method_alt(SubLObject sk_source) {
        {
            SubLObject method = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$httpdRequestMethodForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pcase_var = method;
            if (pcase_var.eql($$HTTP_GET_RequestMethod)) {
                return $GET;
            } else {
                if (pcase_var.eql($$HTTP_POST_RequestMethod)) {
                    return $POST;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.ignore_access_path_errorsP()) {
                        return NIL;
                    } else {
                        Errors.error($str_alt65$Unknown_HTTP_request_method__S_fo, method, sk_source);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject get_sks_http_query_template_alt(SubLObject sk_source) {
        {
            SubLObject query_template = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$httpdRequestQueryTemplateForSKS, ONE_INTEGER, THREE_INTEGER, UNPROVIDED, UNPROVIDED);
            return query_template;
        }
    }

    public static SubLObject get_sks_http_query_template(final SubLObject sk_source) {
        final SubLObject query_template = get_access_path_info(sk_source, $$httpdRequestQueryTemplateForSKS, ONE_INTEGER, THREE_INTEGER, UNPROVIDED, UNPROVIDED);
        return query_template;
    }

    public static final SubLObject get_sks_http_parsing_method_alt(SubLObject sk_source) {
        {
            SubLObject parsing_program = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $const66$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != parsing_program) {
                return $SUBLBOOLEAN;
            } else {
                {
                    SubLObject parsing_program_3 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $const68$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != parsing_program_3) {
                        return $SUBLUNBOUNDONLY;
                    } else {
                        return $SUBL;
                    }
                }
            }
        }
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

    public static final SubLObject get_sks_http_parsing_program_alt(SubLObject sk_source) {
        {
            SubLObject parsing_program = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $const66$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != parsing_program) {
                return parsing_program;
            } else {
                {
                    SubLObject parsing_program_4 = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $const68$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL != parsing_program_4 ? ((SubLObject) (parsing_program_4)) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $const71$httpdRequestSubLParsingProgramFor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject get_sks_http_parsing_program(final SubLObject sk_source) {
        final SubLObject parsing_program = get_access_path_info(sk_source, $const69$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != parsing_program) {
            return parsing_program;
        }
        final SubLObject parsing_program_$4 = get_access_path_info(sk_source, $const71$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != parsing_program_$4 ? parsing_program_$4 : get_access_path_info(sk_source, $const74$httpdRequestSubLParsingProgramFor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_fht_filename_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$filenameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_fht_filename(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$filenameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_fht_key_test_function_alt(SubLObject sk_source) {
        {
            SubLObject test_fn = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$keyTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != test_fn ? ((SubLObject) (test_fn)) : file_hash_table.get_default_fht_test_function();
        }
    }

    public static SubLObject get_sks_fht_key_test_function(final SubLObject sk_source) {
        final SubLObject test_fn = get_access_path_info(sk_source, $$keyTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != test_fn ? test_fn : file_hash_table.get_default_fht_test_function();
    }

    public static final SubLObject get_sks_fht_value_test_function_alt(SubLObject sk_source) {
        {
            SubLObject test_fn = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$valueTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != test_fn ? ((SubLObject) (test_fn)) : symbol_function(EQUAL);
        }
    }

    public static SubLObject get_sks_fht_value_test_function(final SubLObject sk_source) {
        final SubLObject test_fn = get_access_path_info(sk_source, $$valueTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != test_fn ? test_fn : symbol_function(EQUAL);
    }

    public static final SubLObject get_sks_fht_serialization_type_alt(SubLObject sk_source) {
        {
            SubLObject serialization = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$serializationTypeForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != serialization ? ((SubLObject) (serialization)) : file_hash_table.get_default_fht_serialization_protocol();
        }
    }

    public static SubLObject get_sks_fht_serialization_type(final SubLObject sk_source) {
        final SubLObject serialization = get_access_path_info(sk_source, $$serializationTypeForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != serialization ? serialization : file_hash_table.get_default_fht_serialization_protocol();
    }

    public static final SubLObject get_sks_base_uri_alt(SubLObject sk_source) {
        {
            SubLObject base_uri_term = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != base_uri_term) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_uri_string(base_uri_term);
            }
        }
        return NIL;
    }

    public static SubLObject get_sks_base_uri(final SubLObject sk_source) {
        final SubLObject base_uri_term = get_access_path_info(sk_source, $$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != base_uri_term) {
            return get_uri_string(base_uri_term);
        }
        return NIL;
    }

    public static final SubLObject get_uri_string_alt(SubLObject uri_term) {
        if (NIL != cycl_grammar.cycl_nat_p(uri_term)) {
            {
                SubLObject uri_string = cycl_utilities.nat_arg(uri_term, ONE_INTEGER, UNPROVIDED);
                if (uri_string.isString()) {
                    return uri_string;
                }
            }
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

    public static final SubLObject get_sks_prefix_to_uri_map_alt(SubLObject sk_source) {
        {
            SubLObject tuples = inference_kernel.new_cyc_query(listS($$nameSpacePrefixForSKS, sk_source, $list_alt72), mt_relevance_macros.current_mt_relevance_mt(), $list_alt73);
            SubLObject uri_map = NIL;
            SubLObject cdolist_list_var = tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject prefix = NIL;
                    SubLObject uri = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    uri = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        uri_map = list_utilities.alist_enter(uri_map, prefix, com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_uri_string(uri), UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt74);
                    }
                }
            }
            return Sort.sort(uri_map, symbol_function(STRING_LESSP), symbol_function(FIRST));
        }
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

    public static final SubLObject get_sks_rdf_store_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$rdfStoreIdentifierForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_rdf_store(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$rdfStoreIdentifierForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sks_relative_path_alt(SubLObject sk_source) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.get_access_path_info(sk_source, $$relativePathForAPIAccessToSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sks_relative_path(final SubLObject sk_source) {
        return get_access_path_info(sk_source, $$relativePathForAPIAccessToSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject access_path_p_alt(SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static SubLObject access_path_p(final SubLObject v_object) {
        return dictionary.dictionary_p(v_object);
    }

    public static final SubLObject new_access_path_alt() {
        return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_access_path() {
        return dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject access_path_enter_alt(SubLObject access_path, SubLObject key, SubLObject value) {
        return dictionary.dictionary_enter(access_path, key, value);
    }

    public static SubLObject access_path_enter(final SubLObject access_path, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(access_path, key, value);
    }

    public static final SubLObject access_path_remove_alt(SubLObject access_path, SubLObject key) {
        return dictionary.dictionary_remove(access_path, key);
    }

    public static SubLObject access_path_remove(final SubLObject access_path, final SubLObject key) {
        return dictionary.dictionary_remove(access_path, key);
    }

    public static final SubLObject access_path_lookup_alt(SubLObject access_path, SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return dictionary.dictionary_lookup_without_values(access_path, key, not_found);
    }

    public static SubLObject access_path_lookup(final SubLObject access_path, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return dictionary.dictionary_lookup_without_values(access_path, key, not_found);
    }

    public static final SubLObject access_path_sks_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $SKS, UNPROVIDED);
    }

    public static SubLObject access_path_sks(final SubLObject access_path) {
        return access_path_lookup(access_path, $SKS, UNPROVIDED);
    }

    public static final SubLObject access_path_type_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$sksIsa, UNPROVIDED);
    }

    public static SubLObject access_path_type(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksIsa, UNPROVIDED);
    }

    public static final SubLObject access_path_server_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$serverOfSKS, UNPROVIDED);
    }

    public static SubLObject access_path_server(final SubLObject access_path) {
        return access_path_lookup(access_path, $$serverOfSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_port_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$portNumberForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_port(final SubLObject access_path) {
        return access_path_lookup(access_path, $$portNumberForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_proxy_server_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$sksProxyHost, UNPROVIDED);
    }

    public static SubLObject access_path_proxy_server(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksProxyHost, UNPROVIDED);
    }

    public static final SubLObject access_path_proxy_port_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$sksProxyPort, UNPROVIDED);
    }

    public static SubLObject access_path_proxy_port(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sksProxyPort, UNPROVIDED);
    }

    public static final SubLObject access_path_timeout_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $TIMEOUT, UNPROVIDED);
    }

    public static SubLObject access_path_timeout(final SubLObject access_path) {
        return access_path_lookup(access_path, $TIMEOUT, UNPROVIDED);
    }

    public static final SubLObject access_path_sql_flavor_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$sqlProgramForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_sql_flavor(final SubLObject access_path) {
        return access_path_lookup(access_path, $$sqlProgramForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_db_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$structuredKnowledgeSourceName, UNPROVIDED);
    }

    public static SubLObject access_path_db(final SubLObject access_path) {
        return access_path_lookup(access_path, $$structuredKnowledgeSourceName, UNPROVIDED);
    }

    public static final SubLObject access_path_user_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$userNameForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_user(final SubLObject access_path) {
        return access_path_lookup(access_path, $$userNameForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_password_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$passwordForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_password(final SubLObject access_path) {
        return access_path_lookup(access_path, $$passwordForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_subprotocol_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$subProtocolForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_subprotocol(final SubLObject access_path) {
        return access_path_lookup(access_path, $$subProtocolForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_url_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$httpdRequestURLForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_url(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestURLForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_request_method_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$httpdRequestMethodForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_request_method(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestMethodForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_query_template_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$httpdRequestQueryTemplateForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_query_template(final SubLObject access_path) {
        return access_path_lookup(access_path, $$httpdRequestQueryTemplateForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_parsing_method_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $PARSING_METHOD, UNPROVIDED);
    }

    public static SubLObject access_path_parsing_method(final SubLObject access_path) {
        return access_path_lookup(access_path, $PARSING_METHOD, UNPROVIDED);
    }

    public static final SubLObject access_path_parsing_program_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $PARSING_PROGRAM, UNPROVIDED);
    }

    public static SubLObject access_path_parsing_program(final SubLObject access_path) {
        return access_path_lookup(access_path, $PARSING_PROGRAM, UNPROVIDED);
    }

    public static final SubLObject access_path_physical_field_names_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $PHYSICAL_FIELD_NAMES, UNPROVIDED);
    }

    public static SubLObject access_path_physical_field_names(final SubLObject access_path) {
        return access_path_lookup(access_path, $PHYSICAL_FIELD_NAMES, UNPROVIDED);
    }

    public static final SubLObject access_path_filename_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$filenameForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_filename(final SubLObject access_path) {
        return access_path_lookup(access_path, $$filenameForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_key_test_function_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$keyTestFunctionForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_key_test_function(final SubLObject access_path) {
        return access_path_lookup(access_path, $$keyTestFunctionForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_value_test_function_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$valueTestFunctionForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_value_test_function(final SubLObject access_path) {
        return access_path_lookup(access_path, $$valueTestFunctionForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_serialization_type_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$serializationTypeForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_serialization_type(final SubLObject access_path) {
        return access_path_lookup(access_path, $$serializationTypeForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_rdf_base_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$baseNamespaceForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_rdf_base(final SubLObject access_path) {
        return access_path_lookup(access_path, $$baseNamespaceForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_rdf_prefix_map_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$nameSpacePrefixForSKS, UNPROVIDED);
    }

    public static SubLObject access_path_rdf_prefix_map(final SubLObject access_path) {
        return access_path_lookup(access_path, $$nameSpacePrefixForSKS, UNPROVIDED);
    }

    public static final SubLObject access_path_api_access_relative_path_alt(SubLObject access_path) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_lookup(access_path, $$relativePathForAPIAccessToSKS, UNPROVIDED);
    }

    public static SubLObject access_path_api_access_relative_path(final SubLObject access_path) {
        return access_path_lookup(access_path, $$relativePathForAPIAccessToSKS, UNPROVIDED);
    }

    public static final SubLObject adjust_server_of_access_path_alt(SubLObject access_path, SubLObject new_server) {
        SubLTrampolineFile.checkType(new_server, STRINGP);
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_enter(access_path, $$serverOfSKS, new_server);
    }

    public static SubLObject adjust_server_of_access_path(final SubLObject access_path, final SubLObject new_server) {
        assert NIL != stringp(new_server) : "! stringp(new_server) " + ("Types.stringp(new_server) " + "CommonSymbols.NIL != Types.stringp(new_server) ") + new_server;
        return access_path_enter(access_path, $$serverOfSKS, new_server);
    }

    public static final SubLObject declare_sksi_access_path_file_alt() {
        declareFunction("structured_knowledge_source_type", "STRUCTURED-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
        declareFunction("determine_sks_type_internal", "DETERMINE-SKS-TYPE-INTERNAL", 1, 1, false);
        declareFunction("determine_sks_type", "DETERMINE-SKS-TYPE", 1, 1, false);
        declareFunction("determine_sks_db_sql_flavor", "DETERMINE-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction("clear_external_source_access_path_cache", "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 0, false);
        declareFunction("initialize_external_source_access_path_cache", "INITIALIZE-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 1, false);
        declareFunction("external_source_access_path", "EXTERNAL-SOURCE-ACCESS-PATH", 1, 2, false);
        declareFunction("external_source_access_path_int", "EXTERNAL-SOURCE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction("get_external_source_access_path_from_cache", "GET-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction("remove_external_source_access_path_from_cache", "REMOVE-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction("add_to_external_source_access_path", "ADD-TO-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction("remove_from_external_source_access_path", "REMOVE-FROM-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction("sksi_determine_access_path", "SKSI-DETERMINE-ACCESS-PATH", 1, 2, false);
        declareMacro("with_ignore_access_path_errors", "WITH-IGNORE-ACCESS-PATH-ERRORS");
        declareFunction("ignore_access_path_errorsP", "IGNORE-ACCESS-PATH-ERRORS?", 0, 0, false);
        declareFunction("sksi_determine_access_path_int", "SKSI-DETERMINE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction("sksi_determine_access_path_int2", "SKSI-DETERMINE-ACCESS-PATH-INT2", 2, 0, false);
        declareFunction("new_cache_access_path", "NEW-CACHE-ACCESS-PATH", 0, 0, false);
        declareFunction("sksi_determine_db_access_path", "SKSI-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
        declareFunction("new_db_access_path", "NEW-DB-ACCESS-PATH", 11, 0, false);
        declareFunction("sksi_determine_web_page_access_path", "SKSI-DETERMINE-WEB-PAGE-ACCESS-PATH", 2, 0, false);
        declareFunction("new_web_page_access_path", "NEW-WEB-PAGE-ACCESS-PATH", 10, 0, false);
        declareFunction("sksi_determine_kb_access_path", "SKSI-DETERMINE-KB-ACCESS-PATH", 1, 0, false);
        declareFunction("sksi_determine_fht_access_path", "SKSI-DETERMINE-FHT-ACCESS-PATH", 1, 0, false);
        declareFunction("new_fht_access_path", "NEW-FHT-ACCESS-PATH", 5, 0, false);
        declareFunction("sksi_determine_corba_access_path", "SKSI-DETERMINE-CORBA-ACCESS-PATH", 1, 0, false);
        declareFunction("sksi_determine_rdf_access_path", "SKSI-DETERMINE-RDF-ACCESS-PATH", 1, 0, false);
        declareFunction("new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 13, 0, false);
        declareFunction("get_red_value_from_framework", "GET-RED-VALUE-FROM-FRAMEWORK", 1, 0, false);
        declareFunction("get_sksi_red_pred_value", "GET-SKSI-RED-PRED-VALUE", 2, 0, false);
        declareFunction("get_access_path_info", "GET-ACCESS-PATH-INFO", 2, 4, false);
        declareFunction("get_access_path_info_from_kb", "GET-ACCESS-PATH-INFO-FROM-KB", 2, 4, false);
        declareFunction("get_sks_type", "GET-SKS-TYPE", 1, 0, false);
        declareFunction("get_sks_server", "GET-SKS-SERVER", 1, 0, false);
        declareFunction("get_sks_port", "GET-SKS-PORT", 1, 0, false);
        declareFunction("get_sks_proxy_server", "GET-SKS-PROXY-SERVER", 1, 0, false);
        declareFunction("get_sks_proxy_port", "GET-SKS-PROXY-PORT", 1, 0, false);
        declareFunction("get_sks_open_connection_timeout", "GET-SKS-OPEN-CONNECTION-TIMEOUT", 1, 0, false);
        declareFunction("get_sks_db_name", "GET-SKS-DB-NAME", 1, 0, false);
        declareFunction("get_sks_db_user_name", "GET-SKS-DB-USER-NAME", 1, 0, false);
        declareFunction("get_sks_db_password", "GET-SKS-DB-PASSWORD", 1, 0, false);
        declareFunction("get_sks_db_subprotocol", "GET-SKS-DB-SUBPROTOCOL", 1, 0, false);
        declareFunction("get_sks_db_sql_flavor", "GET-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction("get_sks_http_url", "GET-SKS-HTTP-URL", 1, 0, false);
        declareFunction("get_sks_http_request_method", "GET-SKS-HTTP-REQUEST-METHOD", 1, 0, false);
        declareFunction("get_sks_http_query_template", "GET-SKS-HTTP-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("get_sks_http_parsing_method", "GET-SKS-HTTP-PARSING-METHOD", 1, 0, false);
        declareFunction("get_sks_http_parsing_program", "GET-SKS-HTTP-PARSING-PROGRAM", 1, 0, false);
        declareFunction("get_sks_fht_filename", "GET-SKS-FHT-FILENAME", 1, 0, false);
        declareFunction("get_sks_fht_key_test_function", "GET-SKS-FHT-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction("get_sks_fht_value_test_function", "GET-SKS-FHT-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction("get_sks_fht_serialization_type", "GET-SKS-FHT-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction("get_sks_base_uri", "GET-SKS-BASE-URI", 1, 0, false);
        declareFunction("get_uri_string", "GET-URI-STRING", 1, 0, false);
        declareFunction("get_sks_prefix_to_uri_map", "GET-SKS-PREFIX-TO-URI-MAP", 1, 0, false);
        declareFunction("get_sks_rdf_store", "GET-SKS-RDF-STORE", 1, 0, false);
        declareFunction("get_sks_relative_path", "GET-SKS-RELATIVE-PATH", 1, 0, false);
        declareFunction("access_path_p", "ACCESS-PATH-P", 1, 0, false);
        declareFunction("new_access_path", "NEW-ACCESS-PATH", 0, 0, false);
        declareFunction("access_path_enter", "ACCESS-PATH-ENTER", 3, 0, false);
        declareFunction("access_path_remove", "ACCESS-PATH-REMOVE", 2, 0, false);
        declareFunction("access_path_lookup", "ACCESS-PATH-LOOKUP", 2, 1, false);
        declareFunction("access_path_sks", "ACCESS-PATH-SKS", 1, 0, false);
        declareFunction("access_path_type", "ACCESS-PATH-TYPE", 1, 0, false);
        declareFunction("access_path_server", "ACCESS-PATH-SERVER", 1, 0, false);
        declareFunction("access_path_port", "ACCESS-PATH-PORT", 1, 0, false);
        declareFunction("access_path_proxy_server", "ACCESS-PATH-PROXY-SERVER", 1, 0, false);
        declareFunction("access_path_proxy_port", "ACCESS-PATH-PROXY-PORT", 1, 0, false);
        declareFunction("access_path_timeout", "ACCESS-PATH-TIMEOUT", 1, 0, false);
        declareFunction("access_path_sql_flavor", "ACCESS-PATH-SQL-FLAVOR", 1, 0, false);
        declareFunction("access_path_db", "ACCESS-PATH-DB", 1, 0, false);
        declareFunction("access_path_user", "ACCESS-PATH-USER", 1, 0, false);
        declareFunction("access_path_password", "ACCESS-PATH-PASSWORD", 1, 0, false);
        declareFunction("access_path_subprotocol", "ACCESS-PATH-SUBPROTOCOL", 1, 0, false);
        declareFunction("access_path_url", "ACCESS-PATH-URL", 1, 0, false);
        declareFunction("access_path_request_method", "ACCESS-PATH-REQUEST-METHOD", 1, 0, false);
        declareFunction("access_path_query_template", "ACCESS-PATH-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("access_path_parsing_method", "ACCESS-PATH-PARSING-METHOD", 1, 0, false);
        declareFunction("access_path_parsing_program", "ACCESS-PATH-PARSING-PROGRAM", 1, 0, false);
        declareFunction("access_path_physical_field_names", "ACCESS-PATH-PHYSICAL-FIELD-NAMES", 1, 0, false);
        declareFunction("access_path_filename", "ACCESS-PATH-FILENAME", 1, 0, false);
        declareFunction("access_path_key_test_function", "ACCESS-PATH-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction("access_path_value_test_function", "ACCESS-PATH-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction("access_path_serialization_type", "ACCESS-PATH-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction("access_path_rdf_base", "ACCESS-PATH-RDF-BASE", 1, 0, false);
        declareFunction("access_path_rdf_prefix_map", "ACCESS-PATH-RDF-PREFIX-MAP", 1, 0, false);
        declareFunction("access_path_api_access_relative_path", "ACCESS-PATH-API-ACCESS-RELATIVE-PATH", 1, 0, false);
        declareFunction("adjust_server_of_access_path", "ADJUST-SERVER-OF-ACCESS-PATH", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_sksi_access_path_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("structured_knowledge_source_type", "STRUCTURED-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
            declareFunction("determine_sks_type_internal", "DETERMINE-SKS-TYPE-INTERNAL", 1, 1, false);
            declareFunction("determine_sks_type", "DETERMINE-SKS-TYPE", 1, 1, false);
            declareFunction("determine_sks_db_sql_flavor", "DETERMINE-SKS-DB-SQL-FLAVOR", 1, 0, false);
            declareFunction("clear_external_source_access_path_cache", "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 0, false);
            declareFunction("initialize_external_source_access_path_cache", "INITIALIZE-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 1, false);
            declareFunction("external_source_access_path", "EXTERNAL-SOURCE-ACCESS-PATH", 1, 2, false);
            declareFunction("external_source_access_path_int", "EXTERNAL-SOURCE-ACCESS-PATH-INT", 3, 0, false);
            declareFunction("get_external_source_access_path_from_cache", "GET-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
            declareFunction("remove_external_source_access_path_from_cache", "REMOVE-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
            declareFunction("add_to_external_source_access_path", "ADD-TO-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
            declareFunction("remove_from_external_source_access_path", "REMOVE-FROM-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
            declareFunction("sksi_determine_access_path", "SKSI-DETERMINE-ACCESS-PATH", 1, 2, false);
            declareMacro("with_ignore_access_path_errors", "WITH-IGNORE-ACCESS-PATH-ERRORS");
            declareFunction("ignore_access_path_errorsP", "IGNORE-ACCESS-PATH-ERRORS?", 0, 0, false);
            declareFunction("sksi_determine_access_path_int", "SKSI-DETERMINE-ACCESS-PATH-INT", 3, 0, false);
            declareFunction("sksi_determine_access_path_int2", "SKSI-DETERMINE-ACCESS-PATH-INT2", 2, 0, false);
            declareFunction("new_cache_access_path", "NEW-CACHE-ACCESS-PATH", 0, 0, false);
            declareFunction("sksi_determine_db_access_path", "SKSI-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
            declareFunction("spreadsheet_determine_db_access_path", "SPREADSHEET-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
            declareFunction("new_db_access_path", "NEW-DB-ACCESS-PATH", 11, 0, false);
            declareFunction("sksi_determine_web_page_access_path", "SKSI-DETERMINE-WEB-PAGE-ACCESS-PATH", 2, 0, false);
            declareFunction("new_web_page_access_path", "NEW-WEB-PAGE-ACCESS-PATH", 10, 0, false);
            declareFunction("sksi_determine_kb_access_path", "SKSI-DETERMINE-KB-ACCESS-PATH", 1, 0, false);
            declareFunction("sksi_determine_fht_access_path", "SKSI-DETERMINE-FHT-ACCESS-PATH", 1, 0, false);
            declareFunction("new_fht_access_path", "NEW-FHT-ACCESS-PATH", 5, 0, false);
            declareFunction("sksi_determine_corba_access_path", "SKSI-DETERMINE-CORBA-ACCESS-PATH", 1, 0, false);
            declareFunction("sksi_determine_rdf_access_path", "SKSI-DETERMINE-RDF-ACCESS-PATH", 1, 0, false);
            declareFunction("new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 14, 0, false);
            declareFunction("get_red_value_from_framework", "GET-RED-VALUE-FROM-FRAMEWORK", 1, 0, false);
            declareFunction("get_sksi_red_pred_value", "GET-SKSI-RED-PRED-VALUE", 2, 0, false);
            declareFunction("get_access_path_info", "GET-ACCESS-PATH-INFO", 2, 4, false);
            declareFunction("get_access_path_info_from_kb", "GET-ACCESS-PATH-INFO-FROM-KB", 2, 4, false);
            declareFunction("get_sks_type", "GET-SKS-TYPE", 1, 0, false);
            declareFunction("get_sks_server", "GET-SKS-SERVER", 1, 0, false);
            declareFunction("get_sks_port", "GET-SKS-PORT", 1, 0, false);
            declareFunction("get_sks_proxy_server", "GET-SKS-PROXY-SERVER", 1, 0, false);
            declareFunction("get_sks_proxy_port", "GET-SKS-PROXY-PORT", 1, 0, false);
            declareFunction("get_sks_open_connection_timeout", "GET-SKS-OPEN-CONNECTION-TIMEOUT", 1, 0, false);
            declareFunction("get_sks_db_name", "GET-SKS-DB-NAME", 1, 0, false);
            declareFunction("get_sks_db_user_name", "GET-SKS-DB-USER-NAME", 1, 0, false);
            declareFunction("get_sks_db_password", "GET-SKS-DB-PASSWORD", 1, 0, false);
            declareFunction("get_sks_db_subprotocol", "GET-SKS-DB-SUBPROTOCOL", 1, 0, false);
            declareFunction("get_sks_db_sql_flavor", "GET-SKS-DB-SQL-FLAVOR", 1, 0, false);
            declareFunction("get_spreadsheet_db_name", "GET-SPREADSHEET-DB-NAME", 1, 0, false);
            declareFunction("get_sks_http_url", "GET-SKS-HTTP-URL", 1, 0, false);
            declareFunction("get_sks_http_request_method", "GET-SKS-HTTP-REQUEST-METHOD", 1, 0, false);
            declareFunction("get_sks_http_query_template", "GET-SKS-HTTP-QUERY-TEMPLATE", 1, 0, false);
            declareFunction("get_sks_http_parsing_method", "GET-SKS-HTTP-PARSING-METHOD", 1, 0, false);
            declareFunction("get_sks_http_parsing_program", "GET-SKS-HTTP-PARSING-PROGRAM", 1, 0, false);
            declareFunction("get_sks_fht_filename", "GET-SKS-FHT-FILENAME", 1, 0, false);
            declareFunction("get_sks_fht_key_test_function", "GET-SKS-FHT-KEY-TEST-FUNCTION", 1, 0, false);
            declareFunction("get_sks_fht_value_test_function", "GET-SKS-FHT-VALUE-TEST-FUNCTION", 1, 0, false);
            declareFunction("get_sks_fht_serialization_type", "GET-SKS-FHT-SERIALIZATION-TYPE", 1, 0, false);
            declareFunction("get_sks_base_uri", "GET-SKS-BASE-URI", 1, 0, false);
            declareFunction("get_uri_string", "GET-URI-STRING", 1, 0, false);
            declareFunction("get_sks_prefix_to_uri_map", "GET-SKS-PREFIX-TO-URI-MAP", 1, 0, false);
            declareFunction("get_sks_rdf_store", "GET-SKS-RDF-STORE", 1, 0, false);
            declareFunction("get_sks_relative_path", "GET-SKS-RELATIVE-PATH", 1, 0, false);
            declareFunction("access_path_p", "ACCESS-PATH-P", 1, 0, false);
            declareFunction("new_access_path", "NEW-ACCESS-PATH", 0, 0, false);
            declareFunction("access_path_enter", "ACCESS-PATH-ENTER", 3, 0, false);
            declareFunction("access_path_remove", "ACCESS-PATH-REMOVE", 2, 0, false);
            declareFunction("access_path_lookup", "ACCESS-PATH-LOOKUP", 2, 1, false);
            declareFunction("access_path_sks", "ACCESS-PATH-SKS", 1, 0, false);
            declareFunction("access_path_type", "ACCESS-PATH-TYPE", 1, 0, false);
            declareFunction("access_path_server", "ACCESS-PATH-SERVER", 1, 0, false);
            declareFunction("access_path_port", "ACCESS-PATH-PORT", 1, 0, false);
            declareFunction("access_path_proxy_server", "ACCESS-PATH-PROXY-SERVER", 1, 0, false);
            declareFunction("access_path_proxy_port", "ACCESS-PATH-PROXY-PORT", 1, 0, false);
            declareFunction("access_path_timeout", "ACCESS-PATH-TIMEOUT", 1, 0, false);
            declareFunction("access_path_sql_flavor", "ACCESS-PATH-SQL-FLAVOR", 1, 0, false);
            declareFunction("access_path_db", "ACCESS-PATH-DB", 1, 0, false);
            declareFunction("access_path_user", "ACCESS-PATH-USER", 1, 0, false);
            declareFunction("access_path_password", "ACCESS-PATH-PASSWORD", 1, 0, false);
            declareFunction("access_path_subprotocol", "ACCESS-PATH-SUBPROTOCOL", 1, 0, false);
            declareFunction("access_path_url", "ACCESS-PATH-URL", 1, 0, false);
            declareFunction("access_path_request_method", "ACCESS-PATH-REQUEST-METHOD", 1, 0, false);
            declareFunction("access_path_query_template", "ACCESS-PATH-QUERY-TEMPLATE", 1, 0, false);
            declareFunction("access_path_parsing_method", "ACCESS-PATH-PARSING-METHOD", 1, 0, false);
            declareFunction("access_path_parsing_program", "ACCESS-PATH-PARSING-PROGRAM", 1, 0, false);
            declareFunction("access_path_physical_field_names", "ACCESS-PATH-PHYSICAL-FIELD-NAMES", 1, 0, false);
            declareFunction("access_path_filename", "ACCESS-PATH-FILENAME", 1, 0, false);
            declareFunction("access_path_key_test_function", "ACCESS-PATH-KEY-TEST-FUNCTION", 1, 0, false);
            declareFunction("access_path_value_test_function", "ACCESS-PATH-VALUE-TEST-FUNCTION", 1, 0, false);
            declareFunction("access_path_serialization_type", "ACCESS-PATH-SERIALIZATION-TYPE", 1, 0, false);
            declareFunction("access_path_rdf_base", "ACCESS-PATH-RDF-BASE", 1, 0, false);
            declareFunction("access_path_rdf_prefix_map", "ACCESS-PATH-RDF-PREFIX-MAP", 1, 0, false);
            declareFunction("access_path_api_access_relative_path", "ACCESS-PATH-API-ACCESS-RELATIVE-PATH", 1, 0, false);
            declareFunction("adjust_server_of_access_path", "ADJUST-SERVER-OF-ACCESS-PATH", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 13, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_access_path_file_Previous() {
        declareFunction("structured_knowledge_source_type", "STRUCTURED-KNOWLEDGE-SOURCE-TYPE", 1, 0, false);
        declareFunction("determine_sks_type_internal", "DETERMINE-SKS-TYPE-INTERNAL", 1, 1, false);
        declareFunction("determine_sks_type", "DETERMINE-SKS-TYPE", 1, 1, false);
        declareFunction("determine_sks_db_sql_flavor", "DETERMINE-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction("clear_external_source_access_path_cache", "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 0, false);
        declareFunction("initialize_external_source_access_path_cache", "INITIALIZE-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 1, false);
        declareFunction("external_source_access_path", "EXTERNAL-SOURCE-ACCESS-PATH", 1, 2, false);
        declareFunction("external_source_access_path_int", "EXTERNAL-SOURCE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction("get_external_source_access_path_from_cache", "GET-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction("remove_external_source_access_path_from_cache", "REMOVE-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false);
        declareFunction("add_to_external_source_access_path", "ADD-TO-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction("remove_from_external_source_access_path", "REMOVE-FROM-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false);
        declareFunction("sksi_determine_access_path", "SKSI-DETERMINE-ACCESS-PATH", 1, 2, false);
        declareMacro("with_ignore_access_path_errors", "WITH-IGNORE-ACCESS-PATH-ERRORS");
        declareFunction("ignore_access_path_errorsP", "IGNORE-ACCESS-PATH-ERRORS?", 0, 0, false);
        declareFunction("sksi_determine_access_path_int", "SKSI-DETERMINE-ACCESS-PATH-INT", 3, 0, false);
        declareFunction("sksi_determine_access_path_int2", "SKSI-DETERMINE-ACCESS-PATH-INT2", 2, 0, false);
        declareFunction("new_cache_access_path", "NEW-CACHE-ACCESS-PATH", 0, 0, false);
        declareFunction("sksi_determine_db_access_path", "SKSI-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
        declareFunction("spreadsheet_determine_db_access_path", "SPREADSHEET-DETERMINE-DB-ACCESS-PATH", 1, 0, false);
        declareFunction("new_db_access_path", "NEW-DB-ACCESS-PATH", 11, 0, false);
        declareFunction("sksi_determine_web_page_access_path", "SKSI-DETERMINE-WEB-PAGE-ACCESS-PATH", 2, 0, false);
        declareFunction("new_web_page_access_path", "NEW-WEB-PAGE-ACCESS-PATH", 10, 0, false);
        declareFunction("sksi_determine_kb_access_path", "SKSI-DETERMINE-KB-ACCESS-PATH", 1, 0, false);
        declareFunction("sksi_determine_fht_access_path", "SKSI-DETERMINE-FHT-ACCESS-PATH", 1, 0, false);
        declareFunction("new_fht_access_path", "NEW-FHT-ACCESS-PATH", 5, 0, false);
        declareFunction("sksi_determine_corba_access_path", "SKSI-DETERMINE-CORBA-ACCESS-PATH", 1, 0, false);
        declareFunction("sksi_determine_rdf_access_path", "SKSI-DETERMINE-RDF-ACCESS-PATH", 1, 0, false);
        declareFunction("new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 14, 0, false);
        declareFunction("get_red_value_from_framework", "GET-RED-VALUE-FROM-FRAMEWORK", 1, 0, false);
        declareFunction("get_sksi_red_pred_value", "GET-SKSI-RED-PRED-VALUE", 2, 0, false);
        declareFunction("get_access_path_info", "GET-ACCESS-PATH-INFO", 2, 4, false);
        declareFunction("get_access_path_info_from_kb", "GET-ACCESS-PATH-INFO-FROM-KB", 2, 4, false);
        declareFunction("get_sks_type", "GET-SKS-TYPE", 1, 0, false);
        declareFunction("get_sks_server", "GET-SKS-SERVER", 1, 0, false);
        declareFunction("get_sks_port", "GET-SKS-PORT", 1, 0, false);
        declareFunction("get_sks_proxy_server", "GET-SKS-PROXY-SERVER", 1, 0, false);
        declareFunction("get_sks_proxy_port", "GET-SKS-PROXY-PORT", 1, 0, false);
        declareFunction("get_sks_open_connection_timeout", "GET-SKS-OPEN-CONNECTION-TIMEOUT", 1, 0, false);
        declareFunction("get_sks_db_name", "GET-SKS-DB-NAME", 1, 0, false);
        declareFunction("get_sks_db_user_name", "GET-SKS-DB-USER-NAME", 1, 0, false);
        declareFunction("get_sks_db_password", "GET-SKS-DB-PASSWORD", 1, 0, false);
        declareFunction("get_sks_db_subprotocol", "GET-SKS-DB-SUBPROTOCOL", 1, 0, false);
        declareFunction("get_sks_db_sql_flavor", "GET-SKS-DB-SQL-FLAVOR", 1, 0, false);
        declareFunction("get_spreadsheet_db_name", "GET-SPREADSHEET-DB-NAME", 1, 0, false);
        declareFunction("get_sks_http_url", "GET-SKS-HTTP-URL", 1, 0, false);
        declareFunction("get_sks_http_request_method", "GET-SKS-HTTP-REQUEST-METHOD", 1, 0, false);
        declareFunction("get_sks_http_query_template", "GET-SKS-HTTP-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("get_sks_http_parsing_method", "GET-SKS-HTTP-PARSING-METHOD", 1, 0, false);
        declareFunction("get_sks_http_parsing_program", "GET-SKS-HTTP-PARSING-PROGRAM", 1, 0, false);
        declareFunction("get_sks_fht_filename", "GET-SKS-FHT-FILENAME", 1, 0, false);
        declareFunction("get_sks_fht_key_test_function", "GET-SKS-FHT-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction("get_sks_fht_value_test_function", "GET-SKS-FHT-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction("get_sks_fht_serialization_type", "GET-SKS-FHT-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction("get_sks_base_uri", "GET-SKS-BASE-URI", 1, 0, false);
        declareFunction("get_uri_string", "GET-URI-STRING", 1, 0, false);
        declareFunction("get_sks_prefix_to_uri_map", "GET-SKS-PREFIX-TO-URI-MAP", 1, 0, false);
        declareFunction("get_sks_rdf_store", "GET-SKS-RDF-STORE", 1, 0, false);
        declareFunction("get_sks_relative_path", "GET-SKS-RELATIVE-PATH", 1, 0, false);
        declareFunction("access_path_p", "ACCESS-PATH-P", 1, 0, false);
        declareFunction("new_access_path", "NEW-ACCESS-PATH", 0, 0, false);
        declareFunction("access_path_enter", "ACCESS-PATH-ENTER", 3, 0, false);
        declareFunction("access_path_remove", "ACCESS-PATH-REMOVE", 2, 0, false);
        declareFunction("access_path_lookup", "ACCESS-PATH-LOOKUP", 2, 1, false);
        declareFunction("access_path_sks", "ACCESS-PATH-SKS", 1, 0, false);
        declareFunction("access_path_type", "ACCESS-PATH-TYPE", 1, 0, false);
        declareFunction("access_path_server", "ACCESS-PATH-SERVER", 1, 0, false);
        declareFunction("access_path_port", "ACCESS-PATH-PORT", 1, 0, false);
        declareFunction("access_path_proxy_server", "ACCESS-PATH-PROXY-SERVER", 1, 0, false);
        declareFunction("access_path_proxy_port", "ACCESS-PATH-PROXY-PORT", 1, 0, false);
        declareFunction("access_path_timeout", "ACCESS-PATH-TIMEOUT", 1, 0, false);
        declareFunction("access_path_sql_flavor", "ACCESS-PATH-SQL-FLAVOR", 1, 0, false);
        declareFunction("access_path_db", "ACCESS-PATH-DB", 1, 0, false);
        declareFunction("access_path_user", "ACCESS-PATH-USER", 1, 0, false);
        declareFunction("access_path_password", "ACCESS-PATH-PASSWORD", 1, 0, false);
        declareFunction("access_path_subprotocol", "ACCESS-PATH-SUBPROTOCOL", 1, 0, false);
        declareFunction("access_path_url", "ACCESS-PATH-URL", 1, 0, false);
        declareFunction("access_path_request_method", "ACCESS-PATH-REQUEST-METHOD", 1, 0, false);
        declareFunction("access_path_query_template", "ACCESS-PATH-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("access_path_parsing_method", "ACCESS-PATH-PARSING-METHOD", 1, 0, false);
        declareFunction("access_path_parsing_program", "ACCESS-PATH-PARSING-PROGRAM", 1, 0, false);
        declareFunction("access_path_physical_field_names", "ACCESS-PATH-PHYSICAL-FIELD-NAMES", 1, 0, false);
        declareFunction("access_path_filename", "ACCESS-PATH-FILENAME", 1, 0, false);
        declareFunction("access_path_key_test_function", "ACCESS-PATH-KEY-TEST-FUNCTION", 1, 0, false);
        declareFunction("access_path_value_test_function", "ACCESS-PATH-VALUE-TEST-FUNCTION", 1, 0, false);
        declareFunction("access_path_serialization_type", "ACCESS-PATH-SERIALIZATION-TYPE", 1, 0, false);
        declareFunction("access_path_rdf_base", "ACCESS-PATH-RDF-BASE", 1, 0, false);
        declareFunction("access_path_rdf_prefix_map", "ACCESS-PATH-RDF-PREFIX-MAP", 1, 0, false);
        declareFunction("access_path_api_access_relative_path", "ACCESS-PATH-API-ACCESS-RELATIVE-PATH", 1, 0, false);
        declareFunction("adjust_server_of_access_path", "ADJUST-SERVER-OF-ACCESS-PATH", 2, 0, false);
        return NIL;
    }

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt3$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt5$TestLanguageSpoken_DB = makeString("TestLanguageSpoken-DB");

    static private final SubLList $list_alt6 = list(list(makeSymbol("IGNORE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt15$Unknown_access_path_type__A_for__ = makeString("Unknown access path type ~A for ~A.");

    static private final SubLList $list_alt55 = list(new SubLObject[]{ reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("portNumberForSKS"), reader_make_constant_shell("sksProxyHost"), reader_make_constant_shell("sksProxyPort"), reader_make_constant_shell("userNameForSKS"), reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("filenameForSKS"), reader_make_constant_shell("serializationTypeForSKS"), reader_make_constant_shell("keyTestFunctionForSKS"), reader_make_constant_shell("valueTestFunctionForSKS") });

    static private final SubLString $str_alt56$application_sksi = makeString("application.sksi");

    static private final SubLString $str_alt57$access_paths = makeString("access-paths");

    static private final SubLString $str_alt58$_ = makeString(".");

    public static final SubLObject init_sksi_access_path_file_alt() {
        deflexical("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", NIL != boundp($external_source_access_path_cache$) ? ((SubLObject) ($external_source_access_path_cache$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        defparameter("*IGNORE-ACCESS-PATH-ERRORS?*", NIL);
        deflexical("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list_alt55);
        deflexical("*SKSI-RED-PREFIX*", $str_alt56$application_sksi);
        deflexical("*SKSI-RED-ACCESS-PATH-PREFIX*", $str_alt57$access_paths);
        return NIL;
    }

    public static SubLObject init_sksi_access_path_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", SubLTrampolineFile.maybeDefault($external_source_access_path_cache$, $external_source_access_path_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
            defparameter("*IGNORE-ACCESS-PATH-ERRORS?*", NIL);
            deflexical("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list54);
            deflexical("*SKSI-RED-PREFIX*", $str55$application_sksi);
            deflexical("*SKSI-RED-ACCESS-PATH-PREFIX*", $str56$access_paths);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", NIL != boundp($external_source_access_path_cache$) ? ((SubLObject) ($external_source_access_path_cache$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list_alt55);
            deflexical("*SKSI-RED-PREFIX*", $str_alt56$application_sksi);
            deflexical("*SKSI-RED-ACCESS-PATH-PREFIX*", $str_alt57$access_paths);
        }
        return NIL;
    }

    public static SubLObject init_sksi_access_path_file_Previous() {
        deflexical("*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", SubLTrampolineFile.maybeDefault($external_source_access_path_cache$, $external_source_access_path_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defparameter("*IGNORE-ACCESS-PATH-ERRORS?*", NIL);
        deflexical("*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list54);
        deflexical("*SKSI-RED-PREFIX*", $str55$application_sksi);
        deflexical("*SKSI-RED-ACCESS-PATH-PREFIX*", $str56$access_paths);
        return NIL;
    }

    static private final SubLString $str_alt59$__ = makeString("#$");

    static private final SubLString $str_alt65$Unknown_HTTP_request_method__S_fo = makeString("Unknown HTTP request method ~S for ~S");

    public static final SubLObject $const66$httpdRequestSubLBooleanParsingPro = reader_make_constant_shell("httpdRequestSubLBooleanParsingProgramForSKS");

    public static SubLObject setup_sksi_access_path_file() {
        memoization_state.note_memoized_function(DETERMINE_SKS_TYPE);
        declare_defglobal($external_source_access_path_cache$);
        return NIL;
    }

    public static final SubLObject $const68$httpdRequestUnboundOnlySubLParsin = reader_make_constant_shell("httpdRequestUnboundOnlySubLParsingProgramForSKS");

    @Override
    public void declareFunctions() {
        declare_sksi_access_path_file();
    }

    public static final SubLObject $const71$httpdRequestSubLParsingProgramFor = reader_make_constant_shell("httpdRequestSubLParsingProgramForSKS");

    @Override
    public void initializeVariables() {
        init_sksi_access_path_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_access_path_file();
    }

    static private final SubLList $list_alt72 = list(makeSymbol("?PREFIX"), makeSymbol("?URI"));

    static {
    }

    static private final SubLList $list_alt73 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?PREFIX"), makeSymbol("?URI"))));

    static private final SubLList $list_alt74 = list(makeSymbol("PREFIX"), makeSymbol("URI"));
}

/**
 * Total time: 244 ms
 */
