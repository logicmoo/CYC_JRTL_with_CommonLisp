package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.open_cyc_inference_api;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_library_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.query_library_api";
    public static final String myFingerPrint = "0707bb10756a002672ba9fc20133933aaaae7526a4c5efb2b14fcc1e147fc43b";
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2984L)
    private static SubLSymbol $get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 10097L)
    private static SubLSymbol $max_ql_answers_to_paraphrase$;
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25127L)
    private static SubLSymbol $predicate_requires_backchainP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25395L)
    private static SubLSymbol $predicate_backchain_encouragedP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25667L)
    private static SubLSymbol $ql_collection_backchain_encouragedP_caching_state$;
    private static final SubLSymbol $sym0$GET_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT;
    private static final SubLSymbol $sym1$_MT;
    private static final SubLObject $const2$definingMt;
    private static final SubLList $list3;
    private static final SubLObject $const4$InferencePSC;
    private static final SubLList $list5;
    private static final SubLObject $const6$KEInteractionResourceTestMt;
    private static final SubLSymbol $sym7$GET_QUERY_LIBRARY_IN_XML;
    private static final SubLSymbol $sym8$FORT_OR_NAUT_P;
    private static final SubLSymbol $sym9$POSSIBLY_MT_P;
    private static final SubLString $str10$queryLibrary;
    private static final SubLString $str11$http___www_opencyc_org_xml_queryL;
    private static final SubLSymbol $kw12$UNINITIALIZED;
    private static final SubLSymbol $sym13$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED;
    private static final SubLSymbol $sym14$REMOVE_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED;
    private static final SubLSymbol $sym15$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT;
    private static final SubLSymbol $sym16$_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT_CA;
    private static final SubLInteger $int17$512;
    private static final SubLSymbol $sym18$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML;
    private static final SubLSymbol $sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED;
    private static final SubLSymbol $sym20$GET_QUERY_TERM_PROPERTIES;
    private static final SubLSymbol $sym21$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym22$EL_FORMULA_P;
    private static final SubLSymbol $sym23$FORT_P;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLObject $const26$propertiesPanelEntry_WithPredicat;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$QL_PROCESS_INFERENCE_ANSWER;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$BINDINGS;
    private static final SubLSymbol $kw32$SOURCE_ICONS;
    private static final SubLSymbol $kw33$ANSWER_ID;
    private static final SubLSymbol $kw34$SPECULATION_LEVEL;
    private static final SubLSymbol $kw35$IRRELEVANT_TERMS;
    private static final SubLList $list36;
    private static final SubLInteger $int37$40;
    private static final SubLString $str38$_;
    private static final SubLString $str39$_;
    private static final SubLSymbol $kw40$IGNORE;
    private static final SubLSymbol $sym41$COMBINE_FORMULAS_AT_POSITION;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$COMBINE_QUERIES;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$COMBINE_MULTIPLE_QUERIES;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$CREATE_FORMULA_FROM_TERM;
    private static final SubLObject $const49$Collection;
    private static final SubLObject $const50$isa;
    private static final SubLSymbol $sym51$_X;
    private static final SubLObject $const52$Set_Mathematical;
    private static final SubLObject $const53$elementOf;
    private static final SubLObject $const54$BinaryPredicate;
    private static final SubLList $list55;
    private static final SubLObject $const56$TernaryPredicate;
    private static final SubLList $list57;
    private static final SubLObject $const58$QuaternaryPredicate;
    private static final SubLList $list59;
    private static final SubLObject $const60$QuintaryPredicate;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$PREDICATE_REQUIRES_BACKCHAIN_;
    private static final SubLObject $const63$backchainRequired;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$_PREDICATE_REQUIRES_BACKCHAIN__CACHING_STATE_;
    private static final SubLSymbol $sym66$CLEAR_PREDICATE_REQUIRES_BACKCHAIN_;
    private static final SubLSymbol $sym67$PREDICATE_BACKCHAIN_ENCOURAGED_;
    private static final SubLObject $const68$backchainEncouraged;
    private static final SubLSymbol $sym69$_PREDICATE_BACKCHAIN_ENCOURAGED__CACHING_STATE_;
    private static final SubLSymbol $sym70$CLEAR_PREDICATE_BACKCHAIN_ENCOURAGED_;
    private static final SubLSymbol $sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_;
    private static final SubLSymbol $sym72$_QL_COLLECTION_BACKCHAIN_ENCOURAGED__CACHING_STATE_;
    private static final SubLSymbol $sym73$CLEAR_QL_COLLECTION_BACKCHAIN_ENCOURAGED_;
    private static final SubLSymbol $sym74$GUESS_INFERENCE_PARAMETERS_FOR_QUERY;
    private static final SubLSymbol $kw75$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $sym76$COMBINE_FORMULAS_AT_POSITION_INT;
    private static final SubLSymbol $kw77$TEST;
    private static final SubLSymbol $kw78$OWNER;
    private static final SubLSymbol $kw79$CLASSES;
    private static final SubLSymbol $kw80$KB;
    private static final SubLSymbol $kw81$FULL;
    private static final SubLSymbol $kw82$WORKING_;
    private static final SubLObject $list83;
    private static final SubLSymbol $sym84$COMBINE_QUERIES_INT;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$CREATE_FORMULA_FROM_TERM_INT;
    private static final SubLList $list87;
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 1162L)
    public static SubLObject get_query_library_in_xml_from_default_mt(final SubLObject query_library) {
        final SubLObject first_mt = ask_utilities.query_variable((SubLObject)query_library_api.$sym1$_MT, (SubLObject)ConsesLow.listS(query_library_api.$const2$definingMt, query_library, (SubLObject)query_library_api.$list3), query_library_api.$const4$InferencePSC, (SubLObject)query_library_api.$list5).first();
        final SubLObject mt = (query_library_api.NIL != first_mt) ? first_mt : query_library_api.$const6$KEInteractionResourceTestMt;
        return get_query_library_in_xml(query_library, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 1556L)
    public static SubLObject get_query_library_in_xml(SubLObject query_library, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert query_library_api.NIL != cycl_utilities.fort_or_naut_p(query_library) : query_library;
        assert query_library_api.NIL != hlmt.possibly_mt_p(mt) : mt;
        query_library = czer_main.coerce_to_fort(query_library);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject query_library_data = (SubLObject)query_library_api.NIL;
        SubLObject xml_string = (SubLObject)query_library_api.NIL;
        final SubLObject _prev_bind_0 = formula_template_vars.$default_assertion_template_elmt$.currentBinding(thread);
        try {
            formula_template_vars.$default_assertion_template_elmt$.bind(mt, thread);
            final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$2 = formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.currentBinding(thread);
                    try {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.bind(formula_template_vars.$use_formula_template_candidate_replacements_auto_expand$.getGlobalValue(), thread);
                        query_library_data = ke_interaction_folder.ke_interaction_folder_load_query_library(query_library, mt, (SubLObject)query_library_api.UNPROVIDED);
                    }
                    finally {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = (SubLObject)query_library_api.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)query_library_api.$str10$queryLibrary, (SubLObject)query_library_api.$str11$http___www_opencyc_org_xml_queryL, stream);
                try {
                    final SubLObject _prev_bind_0_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)query_library_api.$str10$queryLibrary, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.$kw12$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)query_library_api.$kw12$UNINITIALIZED, thread);
                            ke_interaction_folder.xml_serialize_ke_interaction_folder(query_library_data, stream);
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)query_library_api.$str10$queryLibrary);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
            xml_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)query_library_api.UNPROVIDED);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return xml_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2612L)
    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached(final SubLObject query_library) {
        return get_one_level_query_library_in_xml_from_default_mt_cached_int(query_library, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2791L)
    public static SubLObject remove_get_one_level_query_library_in_xml_from_default_mt_cached(final SubLObject query_library) {
        return remove_get_one_level_query_library_in_xml_from_default_mt_cached_int(query_library, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2984L)
    public static SubLObject clear_get_one_level_query_library_in_xml_from_default_mt_cached_int() {
        final SubLObject cs = query_library_api.$get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue();
        if (query_library_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2984L)
    public static SubLObject remove_get_one_level_query_library_in_xml_from_default_mt_cached_int(final SubLObject query_library, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args(query_library_api.$get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(query_library, task), (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2984L)
    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached_int_internal(final SubLObject query_library, final SubLObject task) {
        return get_one_level_query_library_in_xml_from_default_mt(query_library, task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 2984L)
    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached_int(final SubLObject query_library, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = query_library_api.$get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue();
        if (query_library_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_api.$sym15$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT, (SubLObject)query_library_api.$sym16$_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT_CA, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.EQUAL, (SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.$int17$512);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_library, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)query_library_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)query_library_api.NIL;
            collision = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (query_library.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_library_api.NIL != cached_args && query_library_api.NIL == cached_args.rest() && task.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_one_level_query_library_in_xml_from_default_mt_cached_int_internal(query_library, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query_library, task));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 3227L)
    public static SubLObject get_one_level_query_library_in_xml_from_default_mt(final SubLObject query_library, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = ke_interaction_folder.default_mt_for_ke_interaction_folder(query_library);
        SubLObject xml = (SubLObject)query_library_api.NIL;
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = formula_template_vars.$template_topic_problem_store$.currentBinding(thread);
        try {
            formula_template_vars.$template_topic_problem_store$.bind(formula_template_vars.find_or_create_template_topic_problem_store(), thread);
            final SubLObject reusedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)query_library_api.TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)query_library_api.T, thread);
                    xml = get_one_level_query_library_in_xml(query_library, mt, task);
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (query_library_api.NIL == reusedP && query_library_api.NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP()) {
                        formula_template_vars.destroy_template_topic_problem_store((SubLObject)query_library_api.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0, thread);
        }
        return xml;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 3594L)
    public static SubLObject get_one_level_query_library_in_xml(SubLObject query_library, SubLObject mt, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert query_library_api.NIL != cycl_utilities.fort_or_naut_p(query_library) : query_library;
        assert query_library_api.NIL != hlmt.possibly_mt_p(mt) : mt;
        query_library = czer_main.coerce_to_fort(query_library);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject query_library_data = (SubLObject)query_library_api.NIL;
        SubLObject xml_string = (SubLObject)query_library_api.NIL;
        final SubLObject _prev_bind_0 = formula_template_vars.$default_assertion_template_elmt$.currentBinding(thread);
        try {
            formula_template_vars.$default_assertion_template_elmt$.bind(mt, thread);
            final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
            final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$10 = formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.currentBinding(thread);
                    try {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.bind(formula_template_vars.$use_formula_template_candidate_replacements_auto_expand$.getGlobalValue(), thread);
                        query_library_data = update_folder_query_params_using_task_defaults(ke_interaction_folder.ke_interaction_folder_load_one_level(query_library, mt, (SubLObject)query_library_api.UNPROVIDED), task);
                    }
                    finally {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
            }
        }
        finally {
            formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = (SubLObject)query_library_api.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                final SubLObject stream_$12 = xml_vars.$xml_stream$.getDynamicValue(thread);
                xml_utilities.generate_valid_xml_header(stream_$12);
                xml_utilities.generate_xml_header_entry_for_dtd((SubLObject)query_library_api.$str10$queryLibrary, (SubLObject)query_library_api.$str11$http___www_opencyc_org_xml_queryL, stream_$12);
                try {
                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)query_library_api.$str10$queryLibrary, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.$kw12$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)query_library_api.$kw12$UNINITIALIZED, thread);
                            ke_interaction_folder.xml_serialize_ke_interaction_folder(query_library_data, stream_$12);
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)query_library_api.$str10$queryLibrary);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
            xml_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)query_library_api.UNPROVIDED);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return xml_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 4688L)
    public static SubLObject update_folder_query_params_using_task_defaults(final SubLObject v_ke_interaction_folder, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLObject params = query_library_utils.default_inference_parameters_for_task(task);
        ke_interaction_folder.update_folder_query_params_using_defaults(v_ke_interaction_folder, params);
        return v_ke_interaction_folder;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 4985L)
    public static SubLObject ke_interaction_folder_load_query_library_memoized_internal(final SubLObject query_library, final SubLObject mt) {
        return ke_interaction_folder.ke_interaction_folder_load_query_library(query_library, mt, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 4985L)
    public static SubLObject ke_interaction_folder_load_query_library_memoized(final SubLObject query_library, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)query_library_api.NIL;
        if (query_library_api.NIL == v_memoization_state) {
            return ke_interaction_folder_load_query_library_memoized_internal(query_library, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)query_library_api.$sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, (SubLObject)query_library_api.UNPROVIDED);
        if (query_library_api.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)query_library_api.$sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, (SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.EQUAL, (SubLObject)query_library_api.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)query_library_api.$sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_library, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)query_library_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)query_library_api.NIL;
            collision = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (query_library.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_library_api.NIL != cached_args && query_library_api.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ke_interaction_folder_load_query_library_memoized_internal(query_library, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query_library, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 5159L)
    public static SubLObject clear_query_library_caches(SubLObject argument, SubLObject assertion) {
        if (argument == query_library_api.UNPROVIDED) {
            argument = (SubLObject)query_library_api.NIL;
        }
        if (assertion == query_library_api.UNPROVIDED) {
            assertion = (SubLObject)query_library_api.NIL;
        }
        formula_template_vars.$template_topic_memoization$.setGlobalValue(memoization_state.new_memoization_state((SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED));
        clear_get_one_level_query_library_in_xml_from_default_mt_cached_int();
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 5411L)
    public static SubLObject get_query_term_properties(final SubLObject v_term, final SubLObject query_formula, SubLObject task) {
        if (task == query_library_api.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        assert query_library_api.NIL != cycl_grammar.cycl_denotational_term_p(v_term) : v_term;
        assert query_library_api.NIL != el_utilities.el_formula_p(query_formula) : query_formula;
        assert query_library_api.NIL != forts.fort_p(task) : task;
        final SubLObject v_properties = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)query_library_api.EQUAL), (SubLObject)query_library_api.UNPROVIDED);
        final SubLObject query_properties = (SubLObject)query_library_api.$list24;
        final SubLObject canonical_term = narts_high.nart_substitute(v_term);
        final SubLObject query_template = (SubLObject)query_library_api.$list25;
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = (SubLObject)query_library_api.NIL;
        stacks.stack_push(narts_high.nart_substitute(query_formula), stack);
        while (query_library_api.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (query_library_api.NIL != el_utilities.literalP(entry)) {
                literal = entry;
                if (query_library_api.NIL != cycl_utilities.expression_find(canonical_term, literal, (SubLObject)query_library_api.T, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), (SubLObject)query_library_api.UNPROVIDED)) {
                    final SubLObject query_sentence = (SubLObject)ConsesLow.listS(query_library_api.$const26$propertiesPanelEntry_WithPredicat, v_term, cycl_utilities.atomic_sentence_predicate(literal), task, (SubLObject)query_library_api.$list27);
                    SubLObject cdolist_list_var;
                    final SubLObject literal_results = cdolist_list_var = ask_utilities.query_template(query_template, query_sentence, query_library_api.$const4$InferencePSC, query_properties);
                    SubLObject cons = (SubLObject)query_library_api.NIL;
                    cons = cdolist_list_var.first();
                    while (query_library_api.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject property = (SubLObject)query_library_api.NIL;
                        SubLObject value = (SubLObject)query_library_api.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list28);
                        property = current.first();
                        current = (value = current.rest());
                        dictionary_utilities.dictionary_pushnew(v_properties, property, value, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), (SubLObject)query_library_api.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    }
                }
            }
            SubLObject cdolist_list_var2 = cycl_utilities.formula_args(entry, (SubLObject)query_library_api.UNPROVIDED);
            SubLObject arg = (SubLObject)query_library_api.NIL;
            arg = cdolist_list_var2.first();
            while (query_library_api.NIL != cdolist_list_var2) {
                stacks.stack_push(arg, stack);
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg = cdolist_list_var2.first();
            }
        }
        return dictionary_utilities.dictionary_to_alist(v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 6687L)
    public static SubLObject ql_process_inference_answer(final SubLObject inference, final SubLObject inference_answer, final SubLObject nl_generation_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abduction_allowedP = inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_inference.inference_problem_store(inference));
        SubLObject binding_set = inference_kernel.inference_answer_el_bindings(inference_answer);
        if (query_library_api.NIL != list_utilities.empty_list_p(binding_set)) {
            binding_set = (SubLObject)query_library_api.$list30;
        }
        final SubLObject look_for_source_dataP = query_library_utils.source_information_enabled_for_task(cae_query_search.current_cae_task());
        final SubLObject source_icon_data = (SubLObject)((query_library_api.NIL != look_for_source_dataP) ? sources.source_icon_paths_for_inference_answer(inference_answer) : query_library_api.NIL);
        final SubLObject answer_speculation_level = (SubLObject)((query_library_api.NIL != abduction_allowedP) ? abduction.inference_answer_minimal_abduction_count(inference_answer) : query_library_api.NIL);
        final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(inference_answer);
        SubLObject irrelevant_terms = (SubLObject)query_library_api.NIL;
        SubLObject processed_binding_set = (SubLObject)query_library_api.NIL;
        SubLObject cdolist_list_var = binding_set;
        SubLObject binding = (SubLObject)query_library_api.NIL;
        binding = cdolist_list_var.first();
        while (query_library_api.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject ql_binding = el_binding_to_ql_binding(binding, nl_generation_properties, inference_answer);
            final SubLObject irrelevantP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            processed_binding_set = (SubLObject)ConsesLow.cons(ql_binding, processed_binding_set);
            if (query_library_api.NIL != irrelevantP) {
                final SubLObject item_var = bindings.variable_binding_value(binding);
                if (query_library_api.NIL == conses_high.member(item_var, irrelevant_terms, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), Symbols.symbol_function((SubLObject)query_library_api.IDENTITY))) {
                    irrelevant_terms = (SubLObject)ConsesLow.cons(item_var, irrelevant_terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        SubLObject plist = (SubLObject)ConsesLow.list((SubLObject)query_library_api.$kw31$BINDINGS, processed_binding_set, (SubLObject)query_library_api.$kw32$SOURCE_ICONS, source_icon_data, (SubLObject)query_library_api.$kw33$ANSWER_ID, answer_id);
        if (query_library_api.NIL != abduction_allowedP) {
            plist = conses_high.putf(plist, (SubLObject)query_library_api.$kw34$SPECULATION_LEVEL, answer_speculation_level);
        }
        plist = conses_high.putf(plist, (SubLObject)query_library_api.$kw35$IRRELEVANT_TERMS, irrelevant_terms);
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 8640L)
    public static SubLObject ql_irrelevant_termP(final SubLObject obj, SubLObject mt) {
        if (mt == query_library_api.UNPROVIDED) {
            mt = query_library_utils.get_default_wff_checking_mt(cae_query_search.current_cae_task());
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(query_library_api.NIL != forts.fort_p(obj) && query_library_api.NIL == term.fast_reified_skolemP(obj) && query_library_api.NIL != thcl.ke_irrelevant_termP(obj, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 8943L)
    public static SubLObject el_binding_to_ql_binding(final SubLObject binding, final SubLObject nl_generation_properties, final SubLObject inference_answer) {
        SubLObject variable = (SubLObject)query_library_api.NIL;
        SubLObject value = (SubLObject)query_library_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(binding, binding, (SubLObject)query_library_api.$list36);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        value = narts_high.nart_substitute(value);
        final SubLObject variable_string = ql_variable_to_nl_string(variable);
        final SubLObject pph_result = paraphrase_value_for_ql_binding(value, nl_generation_properties, inference_answer);
        final SubLObject offer_fact_sheetP = fact_sheets.term_ok_for_fact_sheet_p(value, (SubLObject)query_library_api.UNPROVIDED);
        final SubLObject irrelevantP = (SubLObject)SubLObjectFactory.makeBoolean(query_library_api.NIL == query_library_utils.irrelevant_results_allowed_for_task(cae_query_search.current_cae_task()) && query_library_api.NIL != ql_irrelevant_termP(value, (SubLObject)query_library_api.UNPROVIDED));
        return Values.values((SubLObject)ConsesLow.list(variable_string, pph_result, value, offer_fact_sheetP), irrelevantP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 10439L)
    public static SubLObject paraphrase_value_for_ql_binding(final SubLObject value, final SubLObject nl_generation_properties, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max = query_library_api.$max_ql_answers_to_paraphrase$.getGlobalValue();
        SubLObject ans = (SubLObject)query_library_api.NIL;
        if (query_library_api.NIL == max || inference_datastructures_inference.inference_answer_suid(inference_answer).numL(max) || value.isString() || value.isNumber()) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)query_library_api.T, thread);
                pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)query_library_api.UNPROVIDED), thread);
                ans = pph_utilities.generate_phrase_for_java_no_checks_with_property_list(value, nl_generation_properties, open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue(thread));
                if (query_library_api.NIL != pph_utilities.pph_javalist_p(ans)) {
                    pph_utilities.possibly_optimize_pph_javalist_for_alphabetization(ans);
                }
            }
            finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            ans = (SubLObject)ConsesLow.list(inference_datastructures_problem_store.problem_store_suid(store), inference_datastructures_inference.inference_suid(inference), inference_datastructures_inference.inference_answer_suid(inference_answer));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 11399L)
    public static SubLObject ql_variable_to_nl_string(final SubLObject variable) {
        SubLObject variable_string = string_utilities.substring(Strings.string_downcase(string_utilities.to_string(variable), (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED), (SubLObject)query_library_api.ONE_INTEGER, (SubLObject)query_library_api.UNPROVIDED);
        variable_string = string_utilities.string_substitute((SubLObject)query_library_api.$str38$_, (SubLObject)query_library_api.$str39$_, variable_string, (SubLObject)query_library_api.UNPROVIDED);
        return pph_utilities.add_title_capitalization(variable_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 11713L)
    public static SubLObject find_all_variables_outside_negated_clauses(final SubLObject formula) {
        return set.set_element_list(find_all_variables_outside_negated_clauses_int(formula, set.new_set((SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 12066L)
    public static SubLObject find_all_variables_outside_negated_clauses_int(final SubLObject formula, final SubLObject seen) {
        if (query_library_api.NIL == variable_unification.el_negation_or_unknown_sentence_p(formula)) {
            if (query_library_api.NIL != el_utilities.el_formula_p(formula)) {
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(formula, (SubLObject)query_library_api.$kw40$IGNORE);
                SubLObject part = (SubLObject)query_library_api.NIL;
                part = cdolist_list_var.first();
                while (query_library_api.NIL != cdolist_list_var) {
                    find_all_variables_outside_negated_clauses_int(part, seen);
                    cdolist_list_var = cdolist_list_var.rest();
                    part = cdolist_list_var.first();
                }
            }
            else if (query_library_api.NIL != cycl_variables.cyc_varP(formula)) {
                set.set_add(formula, seen);
            }
        }
        return seen;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 12668L)
    public static SubLObject existentially_bind_free_variables_inside_negated_clauses(final SubLObject formula) {
        return existentially_bind_free_variables_inside_negated_clauses_int(formula, find_all_variables_outside_negated_clauses(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 13455L)
    public static SubLObject existentially_bind_free_variables_inside_negated_clauses_int(final SubLObject formula, final SubLObject excluded_variables) {
        if (query_library_api.NIL != variable_unification.el_negation_or_unknown_sentence_p(formula)) {
            final SubLObject v_negation_predicate = cycl_utilities.formula_arg0(formula);
            SubLObject v_core = cycl_utilities.formula_arg1(formula, (SubLObject)query_library_api.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject v_variables = cdolist_list_var = obsolete.formula_free_variables(v_core, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
            SubLObject variable = (SubLObject)query_library_api.NIL;
            variable = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                if (query_library_api.NIL == conses_high.member(variable, excluded_variables, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED)) {
                    v_core = el_utilities.make_existential(variable, v_core);
                }
                cdolist_list_var = cdolist_list_var.rest();
                variable = cdolist_list_var.first();
            }
            return el_utilities.make_unary_formula(v_negation_predicate, v_core);
        }
        if (query_library_api.NIL != el_utilities.el_formula_p(formula)) {
            SubLObject new_terms = (SubLObject)query_library_api.NIL;
            SubLObject cdolist_list_var2;
            final SubLObject terms = cdolist_list_var2 = cycl_utilities.formula_terms(formula, (SubLObject)query_library_api.$kw40$IGNORE);
            SubLObject part = (SubLObject)query_library_api.NIL;
            part = cdolist_list_var2.first();
            while (query_library_api.NIL != cdolist_list_var2) {
                new_terms = (SubLObject)ConsesLow.cons(existentially_bind_free_variables_inside_negated_clauses_int(part, excluded_variables), new_terms);
                cdolist_list_var2 = cdolist_list_var2.rest();
                part = cdolist_list_var2.first();
            }
            return el_utilities.list_to_elf(Sequences.nreverse(new_terms));
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 14456L)
    public static SubLObject combine_formulas_at_position(final SubLObject formula1, final SubLObject formula2, final SubLObject argpos, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == query_library_api.UNPROVIDED) {
            auto_unifyP = (SubLObject)query_library_api.T;
        }
        if (auto_unification_mt == query_library_api.UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        if (optimize_variable_namesP == query_library_api.UNPROVIDED) {
            optimize_variable_namesP = (SubLObject)query_library_api.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula = combine_formulas_at_position_int(formula1, formula2, argpos, auto_unifyP, auto_unification_mt);
        if (query_library_api.NIL != optimize_variable_namesP && query_library_api.NIL != el_utilities.el_formula_p(new_formula)) {
            new_formula = el_utilities.optimize_el_formula_variable_names(new_formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, formula1);
        }
        return new_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 15627L)
    public static SubLObject combine_formulas_at_position_int(final SubLObject formula1, final SubLObject formula2, final SubLObject argpos, SubLObject auto_unifyP, SubLObject auto_unification_mt) {
        if (auto_unifyP == query_library_api.UNPROVIDED) {
            auto_unifyP = (SubLObject)query_library_api.T;
        }
        if (auto_unification_mt == query_library_api.UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans1 = (SubLObject)query_library_api.NIL;
        SubLObject ans2 = (SubLObject)query_library_api.NIL;
        SubLObject ans3 = (SubLObject)query_library_api.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                final SubLObject uniq_formula1 = prepare_formulas_for_combination(formula1, formula2, argpos);
                final SubLObject uniq_formula2 = thread.secondMultipleValue();
                final SubLObject formula2_variable_renames = thread.thirdMultipleValue();
                final SubLObject new_argpos = thread.fourthMultipleValue();
                final SubLObject closed_vars_in_formula1 = thread.fifthMultipleValue();
                final SubLObject closed_vars_in_formula2 = thread.sixthMultipleValue();
                thread.resetMultipleValues();
                final SubLObject part_to_unify = cycl_utilities.formula_arg_position(uniq_formula1, new_argpos, (SubLObject)query_library_api.UNPROVIDED);
                final SubLObject top_levelP = Equality.eql((SubLObject)query_library_api.NIL, new_argpos);
                final SubLObject new_part = build_new_formula_for_combination(part_to_unify, uniq_formula2, top_levelP);
                SubLObject new_formula = (query_library_api.NIL != new_argpos) ? cycl_utilities.formula_arg_position_subst(new_part, new_argpos, uniq_formula1) : new_part;
                final SubLObject formula1_variable_renames = (SubLObject)query_library_api.NIL;
                if (query_library_api.NIL != auto_unifyP) {
                    final SubLObject allow_duplicatesP = (SubLObject)query_library_api.NIL;
                    SubLObject cdolist_list_var;
                    final SubLObject unifications = cdolist_list_var = variable_unification.attempt_to_combine_variables_in_complex_combination(new_formula, uniq_formula2, uniq_formula1, auto_unification_mt, allow_duplicatesP, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
                    SubLObject cons = (SubLObject)query_library_api.NIL;
                    cons = cdolist_list_var.first();
                    while (query_library_api.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject source_var = (SubLObject)query_library_api.NIL;
                        SubLObject target_var = (SubLObject)query_library_api.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list42);
                        source_var = current.first();
                        current = (target_var = current.rest());
                        new_formula = cycl_utilities.formula_subst(target_var, source_var, new_formula, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    }
                }
                SubLObject cdolist_list_var2 = (SubLObject)ConsesLow.list(closed_vars_in_formula2, closed_vars_in_formula1);
                SubLObject vars = (SubLObject)query_library_api.NIL;
                vars = cdolist_list_var2.first();
                while (query_library_api.NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$16 = vars;
                    SubLObject var = (SubLObject)query_library_api.NIL;
                    var = cdolist_list_var_$16.first();
                    while (query_library_api.NIL != cdolist_list_var_$16) {
                        if (query_library_api.NIL != list_utilities.tree_find(var, new_formula, (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED)) {
                            new_formula = el_utilities.make_existential(var, new_formula);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        var = cdolist_list_var_$16.first();
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    vars = cdolist_list_var2.first();
                }
                ans1 = existentially_bind_free_variables_inside_negated_clauses(new_formula);
                ans2 = formula1_variable_renames;
                ans3 = formula2_variable_renames;
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_api.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans1, ans2, ans3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 17393L)
    public static SubLObject prepare_formulas_for_combination(final SubLObject formula1, final SubLObject formula2, SubLObject argpos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uniq_formula1 = formula1;
        SubLObject formula2_variable_renames = (SubLObject)query_library_api.NIL;
        SubLObject closed_vars_in_formula1 = (SubLObject)query_library_api.NIL;
        SubLObject closed_vars_in_formula2 = (SubLObject)query_library_api.NIL;
        thread.resetMultipleValues();
        final SubLObject uniq_formula2_$18 = value_tables.varmap_uniquify_source_vars(formula2, formula1);
        final SubLObject formula2_variable_renames_$19 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject uniq_formula2 = uniq_formula2_$18;
        formula2_variable_renames = formula2_variable_renames_$19;
        SubLObject doneP = (SubLObject)query_library_api.NIL;
        while (query_library_api.NIL == doneP) {
            if (query_library_api.NIL != el_utilities.el_existential_p(uniq_formula1)) {
                closed_vars_in_formula1 = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(uniq_formula1, (SubLObject)query_library_api.UNPROVIDED), closed_vars_in_formula1);
                uniq_formula1 = cycl_utilities.formula_arg2(uniq_formula1, (SubLObject)query_library_api.UNPROVIDED);
                argpos = argpos.rest();
            }
            else if (query_library_api.NIL != el_utilities.el_conjunction_p(uniq_formula1) && query_library_api.NIL != list_utilities.singletonP(cycl_utilities.formula_args(uniq_formula1, (SubLObject)query_library_api.UNPROVIDED)) && query_library_api.NIL != el_utilities.el_existential_p(cycl_utilities.formula_arg1(uniq_formula1, (SubLObject)query_library_api.UNPROVIDED))) {
                uniq_formula1 = cycl_utilities.formula_arg1(uniq_formula1, (SubLObject)query_library_api.UNPROVIDED);
                argpos = argpos.rest();
            }
            else {
                doneP = (SubLObject)query_library_api.T;
            }
        }
        while (query_library_api.NIL != el_utilities.el_existential_p(uniq_formula2)) {
            closed_vars_in_formula2 = (SubLObject)ConsesLow.cons(conses_high.second(uniq_formula2), closed_vars_in_formula2);
            uniq_formula2 = conses_high.third(uniq_formula2);
        }
        return Values.values(uniq_formula1, uniq_formula2, formula2_variable_renames, argpos, closed_vars_in_formula1, closed_vars_in_formula2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 18492L)
    public static SubLObject build_new_formula_for_combination(final SubLObject part_to_unify, final SubLObject uniq_formula2, final SubLObject top_levelP) {
        SubLObject new_part = (SubLObject)query_library_api.NIL;
        if (query_library_api.NIL != el_utilities.el_disjunction_p(part_to_unify) && query_library_api.NIL != el_utilities.el_disjunction_p(uniq_formula2) && query_library_api.NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED))) {
            new_part = simplifier.disjoin(ConsesLow.append(cycl_utilities.formula_args(part_to_unify, (SubLObject)query_library_api.UNPROVIDED), cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED)), (SubLObject)query_library_api.UNPROVIDED);
        }
        else if (query_library_api.NIL != top_levelP && query_library_api.NIL != el_utilities.el_conjunction_p(part_to_unify) && query_library_api.NIL != el_utilities.el_conjunction_p(uniq_formula2) && query_library_api.NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED))) {
            new_part = simplifier.conjoin(ConsesLow.append(cycl_utilities.formula_args(part_to_unify, (SubLObject)query_library_api.UNPROVIDED), cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED)), (SubLObject)query_library_api.UNPROVIDED);
        }
        else if (query_library_api.NIL != el_utilities.el_disjunction_p(part_to_unify)) {
            new_part = simplifier.disjoin(list_utilities.add_to_end(uniq_formula2, cycl_utilities.formula_args(part_to_unify, (SubLObject)query_library_api.UNPROVIDED)), (SubLObject)query_library_api.UNPROVIDED);
        }
        else if (query_library_api.NIL != el_utilities.el_conjunction_p(part_to_unify)) {
            new_part = simplifier.conjoin(list_utilities.add_to_end(uniq_formula2, cycl_utilities.formula_args(part_to_unify, (SubLObject)query_library_api.UNPROVIDED)), (SubLObject)query_library_api.UNPROVIDED);
        }
        else if (query_library_api.NIL != el_utilities.el_conjunction_p(uniq_formula2) && query_library_api.NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED))) {
            new_part = simplifier.conjoin((SubLObject)ConsesLow.cons(part_to_unify, cycl_utilities.formula_args(uniq_formula2, (SubLObject)query_library_api.UNPROVIDED)), (SubLObject)query_library_api.UNPROVIDED);
        }
        else {
            new_part = simplifier.conjoin((SubLObject)ConsesLow.list(part_to_unify, uniq_formula2), (SubLObject)query_library_api.UNPROVIDED);
        }
        return new_part;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 19941L)
    public static SubLObject combine_queries_int(final SubLObject formula1, final SubLObject mt1, final SubLObject props1, final SubLObject formula2, final SubLObject mt2, final SubLObject props2, SubLObject auto_unifyP, SubLObject auto_unification_mt) {
        if (auto_unifyP == query_library_api.UNPROVIDED) {
            auto_unifyP = (SubLObject)query_library_api.T;
        }
        if (auto_unification_mt == query_library_api.UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        final SubLObject new_formula = combine_formulas_at_position(formula1, formula2, (SubLObject)query_library_api.NIL, auto_unifyP, auto_unification_mt, (SubLObject)query_library_api.NIL);
        final SubLObject new_mt = mt1.eql(mt2) ? mt1 : hlmt.union_mt_relevance_contexts((SubLObject)ConsesLow.list(mt1, mt2));
        final SubLObject new_props = api_widgets.combine_query_properties(props1, props2);
        return (SubLObject)ConsesLow.list(new_formula, new_mt, new_props);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 20436L)
    public static SubLObject combine_queries(final SubLObject formula1, final SubLObject mt1, final SubLObject props1, final SubLObject formula2, final SubLObject mt2, final SubLObject props2, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == query_library_api.UNPROVIDED) {
            auto_unifyP = (SubLObject)query_library_api.T;
        }
        if (auto_unification_mt == query_library_api.UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        if (optimize_variable_namesP == query_library_api.UNPROVIDED) {
            optimize_variable_namesP = (SubLObject)query_library_api.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = combine_queries_int(formula1, mt1, props1, formula2, mt2, props2, auto_unifyP, auto_unification_mt);
        SubLObject new_formula = (SubLObject)query_library_api.NIL;
        SubLObject new_mt = (SubLObject)query_library_api.NIL;
        SubLObject new_props = (SubLObject)query_library_api.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list44);
        new_formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list44);
        new_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list44);
        new_props = current.first();
        current = current.rest();
        if (query_library_api.NIL == current) {
            if (query_library_api.NIL != optimize_variable_namesP && query_library_api.NIL != el_utilities.el_formula_p(new_formula)) {
                new_formula = el_utilities.optimize_el_formula_variable_names(new_formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, (SubLObject)query_library_api.UNPROVIDED);
            }
            return (SubLObject)ConsesLow.list(new_formula, new_mt, new_props);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_library_api.$list44);
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 21877L)
    public static SubLObject combine_multiple_queries(final SubLObject queries, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == query_library_api.UNPROVIDED) {
            auto_unifyP = (SubLObject)query_library_api.T;
        }
        if (auto_unification_mt == query_library_api.UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        if (optimize_variable_namesP == query_library_api.UNPROVIDED) {
            optimize_variable_namesP = (SubLObject)query_library_api.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = queries.first();
        SubLObject cdolist_list_var;
        final SubLObject other_queries = cdolist_list_var = queries.rest();
        SubLObject other_query = (SubLObject)query_library_api.NIL;
        other_query = cdolist_list_var.first();
        while (query_library_api.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query;
            SubLObject formula = (SubLObject)query_library_api.NIL;
            SubLObject mt = (SubLObject)query_library_api.NIL;
            SubLObject props = (SubLObject)query_library_api.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list46);
            formula = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list46);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_api.$list46);
            props = current.first();
            current = current.rest();
            if (query_library_api.NIL == current) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = other_query;
                SubLObject other_formula = (SubLObject)query_library_api.NIL;
                SubLObject other_mt = (SubLObject)query_library_api.NIL;
                SubLObject other_props = (SubLObject)query_library_api.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)query_library_api.$list47);
                other_formula = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)query_library_api.$list47);
                other_mt = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)query_library_api.$list47);
                other_props = current_$21.first();
                current_$21 = current_$21.rest();
                if (query_library_api.NIL == current_$21) {
                    query = combine_queries(formula, mt, props, other_formula, other_mt, other_props, auto_unifyP, auto_unification_mt, optimize_variable_namesP);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)query_library_api.$list47);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_library_api.$list46);
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_query = cdolist_list_var.first();
        }
        if (query_library_api.NIL != optimize_variable_namesP && query_library_api.NIL != list_utilities.empty_list_p(other_queries)) {
            final SubLObject new_formula = el_utilities.optimize_el_formula_variable_names(query.first(), pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, (SubLObject)query_library_api.UNPROVIDED);
            ConsesLow.rplaca(query, new_formula);
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 23466L)
    public static SubLObject create_formula_from_term(final SubLObject v_term, SubLObject domain_mt, SubLObject optimize_variable_namesP) {
        if (domain_mt == query_library_api.UNPROVIDED) {
            domain_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        if (optimize_variable_namesP == query_library_api.UNPROVIDED) {
            optimize_variable_namesP = (SubLObject)query_library_api.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = create_formula_from_term_int(v_term, domain_mt);
        if (query_library_api.NIL != formula && query_library_api.NIL != optimize_variable_namesP) {
            formula = el_utilities.optimize_el_formula_variable_names(formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, (SubLObject)query_library_api.UNPROVIDED);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 24348L)
    public static SubLObject create_formula_from_term_int(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == query_library_api.UNPROVIDED) {
            domain_mt = query_library_utils.get_auto_unification_mt((SubLObject)query_library_api.UNPROVIDED);
        }
        SubLObject formula = (SubLObject)query_library_api.NIL;
        if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const49$Collection, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = (SubLObject)ConsesLow.list(query_library_api.$const50$isa, (SubLObject)query_library_api.$sym51$_X, v_term);
        }
        else if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const52$Set_Mathematical, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = (SubLObject)ConsesLow.list(query_library_api.$const53$elementOf, (SubLObject)query_library_api.$sym51$_X, v_term);
        }
        else if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const54$BinaryPredicate, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = reader.bq_cons(v_term, (SubLObject)query_library_api.$list55);
        }
        else if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const56$TernaryPredicate, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = reader.bq_cons(v_term, (SubLObject)query_library_api.$list57);
        }
        else if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const58$QuaternaryPredicate, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = reader.bq_cons(v_term, (SubLObject)query_library_api.$list59);
        }
        else if (query_library_api.NIL != isa.isaP(v_term, query_library_api.$const60$QuintaryPredicate, domain_mt, (SubLObject)query_library_api.UNPROVIDED)) {
            formula = reader.bq_cons(v_term, (SubLObject)query_library_api.$list61);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25127L)
    public static SubLObject clear_predicate_requires_backchainP() {
        final SubLObject cs = query_library_api.$predicate_requires_backchainP_caching_state$.getGlobalValue();
        if (query_library_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25127L)
    public static SubLObject remove_predicate_requires_backchainP(final SubLObject predicate, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_api.$predicate_requires_backchainP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, mt), (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25127L)
    public static SubLObject predicate_requires_backchainP_internal(final SubLObject predicate, final SubLObject mt) {
        if (query_library_api.NIL != cycl_variables.cyc_varP(predicate)) {
            return (SubLObject)query_library_api.NIL;
        }
        if (query_library_api.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(query_library_api.$const63$backchainRequired, predicate), mt, (SubLObject)query_library_api.$list64)) {
            return (SubLObject)query_library_api.T;
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25127L)
    public static SubLObject predicate_requires_backchainP(final SubLObject predicate, final SubLObject mt) {
        SubLObject caching_state = query_library_api.$predicate_requires_backchainP_caching_state$.getGlobalValue();
        if (query_library_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_api.$sym62$PREDICATE_REQUIRES_BACKCHAIN_, (SubLObject)query_library_api.$sym65$_PREDICATE_REQUIRES_BACKCHAIN__CACHING_STATE_, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.EQL, (SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)query_library_api.$sym66$CLEAR_PREDICATE_REQUIRES_BACKCHAIN_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)query_library_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)query_library_api.NIL;
            collision = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_library_api.NIL != cached_args && query_library_api.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predicate_requires_backchainP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25395L)
    public static SubLObject clear_predicate_backchain_encouragedP() {
        final SubLObject cs = query_library_api.$predicate_backchain_encouragedP_caching_state$.getGlobalValue();
        if (query_library_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25395L)
    public static SubLObject remove_predicate_backchain_encouragedP(final SubLObject predicate, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_api.$predicate_backchain_encouragedP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, mt), (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25395L)
    public static SubLObject predicate_backchain_encouragedP_internal(final SubLObject predicate, final SubLObject mt) {
        if (query_library_api.NIL != cycl_variables.cyc_varP(predicate)) {
            return (SubLObject)query_library_api.NIL;
        }
        if (query_library_api.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(query_library_api.$const68$backchainEncouraged, predicate), mt, (SubLObject)query_library_api.$list64)) {
            return (SubLObject)query_library_api.T;
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25395L)
    public static SubLObject predicate_backchain_encouragedP(final SubLObject predicate, final SubLObject mt) {
        SubLObject caching_state = query_library_api.$predicate_backchain_encouragedP_caching_state$.getGlobalValue();
        if (query_library_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_api.$sym67$PREDICATE_BACKCHAIN_ENCOURAGED_, (SubLObject)query_library_api.$sym69$_PREDICATE_BACKCHAIN_ENCOURAGED__CACHING_STATE_, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.EQL, (SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)query_library_api.$sym70$CLEAR_PREDICATE_BACKCHAIN_ENCOURAGED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)query_library_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)query_library_api.NIL;
            collision = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_library_api.NIL != cached_args && query_library_api.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predicate_backchain_encouragedP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25667L)
    public static SubLObject clear_ql_collection_backchain_encouragedP() {
        final SubLObject cs = query_library_api.$ql_collection_backchain_encouragedP_caching_state$.getGlobalValue();
        if (query_library_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25667L)
    public static SubLObject remove_ql_collection_backchain_encouragedP(final SubLObject coll, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_api.$ql_collection_backchain_encouragedP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(coll, mt), (SubLObject)query_library_api.UNPROVIDED, (SubLObject)query_library_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25667L)
    public static SubLObject ql_collection_backchain_encouragedP_internal(final SubLObject coll, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_library_api.NIL != kb_accessors.collection_backchain_encouragedP(coll, mt) || query_library_api.NIL != kb_accessors.collection_isa_backchain_encouragedP(coll, mt) || query_library_api.NIL != kb_accessors.collection_genls_backchain_encouragedP(coll, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25667L)
    public static SubLObject ql_collection_backchain_encouragedP(final SubLObject coll, final SubLObject mt) {
        SubLObject caching_state = query_library_api.$ql_collection_backchain_encouragedP_caching_state$.getGlobalValue();
        if (query_library_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_api.$sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_, (SubLObject)query_library_api.$sym72$_QL_COLLECTION_BACKCHAIN_ENCOURAGED__CACHING_STATE_, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.EQL, (SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)query_library_api.$sym73$CLEAR_QL_COLLECTION_BACKCHAIN_ENCOURAGED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(coll, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)query_library_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)query_library_api.NIL;
            collision = cdolist_list_var.first();
            while (query_library_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (coll.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_library_api.NIL != cached_args && query_library_api.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ql_collection_backchain_encouragedP_internal(coll, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(coll, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 25933L)
    public static SubLObject formula_requires_backchainP(final SubLObject formula, final SubLObject mt) {
        if (query_library_api.NIL == formula) {
            return (SubLObject)query_library_api.NIL;
        }
        if (!formula.isList()) {
            return (SubLObject)query_library_api.NIL;
        }
        if (query_library_api.NIL != inference_trampolines.inference_backchain_required_asentP(formula, mt)) {
            return (SubLObject)query_library_api.T;
        }
        if (query_library_api.NIL != predicate_requires_backchainP(formula.first(), mt)) {
            return (SubLObject)query_library_api.T;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)query_library_api.$kw40$IGNORE);
        SubLObject arg = (SubLObject)query_library_api.NIL;
        arg = cdolist_list_var.first();
        while (query_library_api.NIL != cdolist_list_var) {
            if (query_library_api.NIL != formula_requires_backchainP(arg, mt)) {
                return (SubLObject)query_library_api.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 26313L)
    public static SubLObject formula_backchain_encouragedP(final SubLObject formula, final SubLObject mt) {
        if (query_library_api.NIL == formula) {
            return (SubLObject)query_library_api.NIL;
        }
        if (query_library_api.NIL != fort_types_interface.collectionP(formula)) {
            return ql_collection_backchain_encouragedP(formula, mt);
        }
        if (!formula.isList()) {
            return (SubLObject)query_library_api.NIL;
        }
        if (query_library_api.NIL != predicate_backchain_encouragedP(formula.first(), mt)) {
            return (SubLObject)query_library_api.T;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)query_library_api.$kw40$IGNORE);
        SubLObject arg = (SubLObject)query_library_api.NIL;
        arg = cdolist_list_var.first();
        while (query_library_api.NIL != cdolist_list_var) {
            if (query_library_api.NIL != formula_backchain_encouragedP(arg, mt)) {
                return (SubLObject)query_library_api.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)query_library_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-api.lisp", position = 26709L)
    public static SubLObject guess_inference_parameters_for_query(final SubLObject formula, final SubLObject mt) {
        SubLObject ip = query_library_utils.default_inference_parameters_for_task(cae_query_search.current_cae_task());
        if (query_library_api.NIL != formula_backchain_encouragedP(formula, mt) || query_library_api.NIL != formula_requires_backchainP(formula, mt)) {
            final SubLObject default_transformations_for_task = conses_high.getf(ip, (SubLObject)query_library_api.$kw75$MAX_TRANSFORMATION_DEPTH, (SubLObject)query_library_api.ZERO_INTEGER);
            ip = conses_high.putf(ip, (SubLObject)query_library_api.$kw75$MAX_TRANSFORMATION_DEPTH, Numbers.max(default_transformations_for_task, (SubLObject)query_library_api.ONE_INTEGER));
        }
        return ip;
    }
    
    public static SubLObject declare_query_library_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_query_library_in_xml_from_default_mt", "GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_query_library_in_xml", "GET-QUERY-LIBRARY-IN-XML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_one_level_query_library_in_xml_from_default_mt_cached", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "remove_get_one_level_query_library_in_xml_from_default_mt_cached", "REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "clear_get_one_level_query_library_in_xml_from_default_mt_cached_int", "CLEAR-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "remove_get_one_level_query_library_in_xml_from_default_mt_cached_int", "REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_one_level_query_library_in_xml_from_default_mt_cached_int_internal", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_one_level_query_library_in_xml_from_default_mt_cached_int", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_one_level_query_library_in_xml_from_default_mt", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_one_level_query_library_in_xml", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "update_folder_query_params_using_task_defaults", "UPDATE-FOLDER-QUERY-PARAMS-USING-TASK-DEFAULTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ke_interaction_folder_load_query_library_memoized_internal", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ke_interaction_folder_load_query_library_memoized", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "clear_query_library_caches", "CLEAR-QUERY-LIBRARY-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "get_query_term_properties", "GET-QUERY-TERM-PROPERTIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ql_process_inference_answer", "QL-PROCESS-INFERENCE-ANSWER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ql_irrelevant_termP", "QL-IRRELEVANT-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "el_binding_to_ql_binding", "EL-BINDING-TO-QL-BINDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "paraphrase_value_for_ql_binding", "PARAPHRASE-VALUE-FOR-QL-BINDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ql_variable_to_nl_string", "QL-VARIABLE-TO-NL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "find_all_variables_outside_negated_clauses", "FIND-ALL-VARIABLES-OUTSIDE-NEGATED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "find_all_variables_outside_negated_clauses_int", "FIND-ALL-VARIABLES-OUTSIDE-NEGATED-CLAUSES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "existentially_bind_free_variables_inside_negated_clauses", "EXISTENTIALLY-BIND-FREE-VARIABLES-INSIDE-NEGATED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "existentially_bind_free_variables_inside_negated_clauses_int", "EXISTENTIALLY-BIND-FREE-VARIABLES-INSIDE-NEGATED-CLAUSES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "combine_formulas_at_position", "COMBINE-FORMULAS-AT-POSITION", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "combine_formulas_at_position_int", "COMBINE-FORMULAS-AT-POSITION-INT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "prepare_formulas_for_combination", "PREPARE-FORMULAS-FOR-COMBINATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "build_new_formula_for_combination", "BUILD-NEW-FORMULA-FOR-COMBINATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "combine_queries_int", "COMBINE-QUERIES-INT", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "combine_queries", "COMBINE-QUERIES", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "combine_multiple_queries", "COMBINE-MULTIPLE-QUERIES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "create_formula_from_term", "CREATE-FORMULA-FROM-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "create_formula_from_term_int", "CREATE-FORMULA-FROM-TERM-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "clear_predicate_requires_backchainP", "CLEAR-PREDICATE-REQUIRES-BACKCHAIN?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "remove_predicate_requires_backchainP", "REMOVE-PREDICATE-REQUIRES-BACKCHAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "predicate_requires_backchainP_internal", "PREDICATE-REQUIRES-BACKCHAIN?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "predicate_requires_backchainP", "PREDICATE-REQUIRES-BACKCHAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "clear_predicate_backchain_encouragedP", "CLEAR-PREDICATE-BACKCHAIN-ENCOURAGED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "remove_predicate_backchain_encouragedP", "REMOVE-PREDICATE-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "predicate_backchain_encouragedP_internal", "PREDICATE-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "predicate_backchain_encouragedP", "PREDICATE-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "clear_ql_collection_backchain_encouragedP", "CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "remove_ql_collection_backchain_encouragedP", "REMOVE-QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ql_collection_backchain_encouragedP_internal", "QL-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "ql_collection_backchain_encouragedP", "QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "formula_requires_backchainP", "FORMULA-REQUIRES-BACKCHAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "formula_backchain_encouragedP", "FORMULA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_api", "guess_inference_parameters_for_query", "GUESS-INFERENCE-PARAMETERS-FOR-QUERY", 2, 0, false);
        return (SubLObject)query_library_api.NIL;
    }
    
    public static SubLObject init_query_library_api_file() {
        query_library_api.$get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$ = SubLFiles.deflexical("*GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-CACHING-STATE*", (SubLObject)query_library_api.NIL);
        query_library_api.$max_ql_answers_to_paraphrase$ = SubLFiles.deflexical("*MAX-QL-ANSWERS-TO-PARAPHRASE*", (SubLObject)query_library_api.$int37$40);
        query_library_api.$predicate_requires_backchainP_caching_state$ = SubLFiles.deflexical("*PREDICATE-REQUIRES-BACKCHAIN?-CACHING-STATE*", (SubLObject)query_library_api.NIL);
        query_library_api.$predicate_backchain_encouragedP_caching_state$ = SubLFiles.deflexical("*PREDICATE-BACKCHAIN-ENCOURAGED?-CACHING-STATE*", (SubLObject)query_library_api.NIL);
        query_library_api.$ql_collection_backchain_encouragedP_caching_state$ = SubLFiles.deflexical("*QL-COLLECTION-BACKCHAIN-ENCOURAGED?-CACHING-STATE*", (SubLObject)query_library_api.NIL);
        return (SubLObject)query_library_api.NIL;
    }
    
    public static SubLObject setup_query_library_api_file() {
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym0$GET_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym7$GET_QUERY_LIBRARY_IN_XML);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym13$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym14$REMOVE_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)query_library_api.$sym15$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym18$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML);
        memoization_state.note_memoized_function((SubLObject)query_library_api.$sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym20$GET_QUERY_TERM_PROPERTIES);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym29$QL_PROCESS_INFERENCE_ANSWER);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym41$COMBINE_FORMULAS_AT_POSITION);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym43$COMBINE_QUERIES);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym45$COMBINE_MULTIPLE_QUERIES);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym48$CREATE_FORMULA_FROM_TERM);
        memoization_state.note_globally_cached_function((SubLObject)query_library_api.$sym62$PREDICATE_REQUIRES_BACKCHAIN_);
        memoization_state.note_globally_cached_function((SubLObject)query_library_api.$sym67$PREDICATE_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_globally_cached_function((SubLObject)query_library_api.$sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_);
        access_macros.register_external_symbol((SubLObject)query_library_api.$sym74$GUESS_INFERENCE_PARAMETERS_FOR_QUERY);
        generic_testing.define_test_case_table_int((SubLObject)query_library_api.$sym76$COMBINE_FORMULAS_AT_POSITION_INT, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_api.$kw77$TEST, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), query_library_api.$kw78$OWNER, query_library_api.NIL, query_library_api.$kw79$CLASSES, query_library_api.NIL, query_library_api.$kw80$KB, query_library_api.$kw81$FULL, query_library_api.$kw82$WORKING_, query_library_api.T }), query_library_api.$list83);
        generic_testing.define_test_case_table_int((SubLObject)query_library_api.$sym84$COMBINE_QUERIES_INT, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_api.$kw77$TEST, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), query_library_api.$kw78$OWNER, query_library_api.NIL, query_library_api.$kw79$CLASSES, query_library_api.NIL, query_library_api.$kw80$KB, query_library_api.$kw81$FULL, query_library_api.$kw82$WORKING_, query_library_api.T }), (SubLObject)query_library_api.$list85);
        generic_testing.define_test_case_table_int((SubLObject)query_library_api.$sym86$CREATE_FORMULA_FROM_TERM_INT, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_api.$kw77$TEST, Symbols.symbol_function((SubLObject)query_library_api.EQUAL), query_library_api.$kw78$OWNER, query_library_api.NIL, query_library_api.$kw79$CLASSES, query_library_api.NIL, query_library_api.$kw80$KB, query_library_api.$kw81$FULL, query_library_api.$kw82$WORKING_, query_library_api.T }), (SubLObject)query_library_api.$list87);
        return (SubLObject)query_library_api.NIL;
    }
    
    private static SubLObject _constant_83_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?REVASCULARIZATION-PROCEDURE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?REVASCULARIZATION-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Generic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.THREE_INTEGER, (SubLObject)query_library_api.ONE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchRecommendedWFFCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?REVASCULARIZATION-PROCEDURE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?REVASCULARIZATION-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Generic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"))))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INFARCTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?INFARCTION"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valveRegurgitationSeverity")), (SubLObject)SubLObjectFactory.makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?STORE-OF-INFORMATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")), (SubLObject)SubLObjectFactory.makeSymbol("?FIRST-ORDER-COLLECTION")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.TWO_INTEGER, (SubLObject)query_library_api.THREE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchRecommendedWFFCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INFARCTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?INFARCTION"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valveRegurgitationSeverity")), (SubLObject)SubLObjectFactory.makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?STORE-OF-INFORMATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")), (SubLObject)SubLObjectFactory.makeSymbol("?FIRST-ORDER-COLLECTION")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fromLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?FROM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("toLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?TO")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fromLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?FROM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("toLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?FROM")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fromLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?FROM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("toLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?TO")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fromLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?FROM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("toLocation")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?TO")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCATION")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Murder"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Murder"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Murder"))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.ONE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Murder")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.ONE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.ONE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Piracy-AtSea"))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?E"), (SubLObject)SubLObjectFactory.makeSymbol("?D")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?E"), (SubLObject)SubLObjectFactory.makeSymbol("?P"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?D")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?P")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET")), (SubLObject)ConsesLow.list((SubLObject)query_library_api.ONE_INTEGER, (SubLObject)query_library_api.TWO_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intendedAttackTargets")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?TARGET")))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.ONE_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.TWO_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK-1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mammal"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mammal"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fish"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fish"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedMVROperation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedAVROperation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list((SubLObject)query_library_api.TWO_INTEGER), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchRecommendedWFFCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedMVROperation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedAVROperation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MITRAL-VALVE-PROCEDURE"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT-2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasDiagnosis")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventHasDiagnosisOrFinding")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-EVALUATION"), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-EVALUATION"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT-2"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchRecommendedWFFCheckingMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT-2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasDiagnosis")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventHasDiagnosisOrFinding")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-EVALUATION"), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICAL-EVALUATION"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT-2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("patientTreated")), (SubLObject)SubLObjectFactory.makeSymbol("?THING"), (SubLObject)SubLObjectFactory.makeSymbol("?PATIENT-2"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL, (SubLObject)query_library_api.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))) });
    }
    
    public void declareFunctions() {
        declare_query_library_api_file();
    }
    
    public void initializeVariables() {
        init_query_library_api_file();
    }
    
    public void runTopLevelForms() {
        setup_query_library_api_file();
    }
    
    static {
        me = (SubLFile)new query_library_api();
        query_library_api.$get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$ = null;
        query_library_api.$max_ql_answers_to_paraphrase$ = null;
        query_library_api.$predicate_requires_backchainP_caching_state$ = null;
        query_library_api.$predicate_backchain_encouragedP_caching_state$ = null;
        query_library_api.$ql_collection_backchain_encouragedP_caching_state$ = null;
        $sym0$GET_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT = SubLObjectFactory.makeSymbol("GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT");
        $sym1$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const2$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $const4$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)query_library_api.ONE_INTEGER);
        $const6$KEInteractionResourceTestMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEInteractionResourceTestMt"));
        $sym7$GET_QUERY_LIBRARY_IN_XML = SubLObjectFactory.makeSymbol("GET-QUERY-LIBRARY-IN-XML");
        $sym8$FORT_OR_NAUT_P = SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P");
        $sym9$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $str10$queryLibrary = SubLObjectFactory.makeString("queryLibrary");
        $str11$http___www_opencyc_org_xml_queryL = SubLObjectFactory.makeString("http://www.opencyc.org/xml/queryLibrary.dtd");
        $kw12$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym13$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED = SubLObjectFactory.makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED");
        $sym14$REMOVE_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED = SubLObjectFactory.makeSymbol("REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED");
        $sym15$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT = SubLObjectFactory.makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT");
        $sym16$_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT_CA = SubLObjectFactory.makeSymbol("*GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-CACHING-STATE*");
        $int17$512 = SubLObjectFactory.makeInteger(512);
        $sym18$GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML = SubLObjectFactory.makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML");
        $sym19$KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED = SubLObjectFactory.makeSymbol("KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED");
        $sym20$GET_QUERY_TERM_PROPERTIES = SubLObjectFactory.makeSymbol("GET-QUERY-TERM-PROPERTIES");
        $sym21$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $sym22$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym23$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), query_library_api.NIL, SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), query_library_api.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), query_library_api.TWO_INTEGER, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(30) });
        $list25 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("?VALUE"));
        $const26$propertiesPanelEntry_WithPredicat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("propertiesPanelEntry-WithPredicate"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("?VALUE"));
        $list28 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym29$QL_PROCESS_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol("QL-PROCESS-INFERENCE-ANSWER");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?TRUTH"), (SubLObject)SubLObjectFactory.makeString("Yes")));
        $kw31$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw32$SOURCE_ICONS = SubLObjectFactory.makeKeyword("SOURCE-ICONS");
        $kw33$ANSWER_ID = SubLObjectFactory.makeKeyword("ANSWER-ID");
        $kw34$SPECULATION_LEVEL = SubLObjectFactory.makeKeyword("SPECULATION-LEVEL");
        $kw35$IRRELEVANT_TERMS = SubLObjectFactory.makeKeyword("IRRELEVANT-TERMS");
        $list36 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $int37$40 = SubLObjectFactory.makeInteger(40);
        $str38$_ = SubLObjectFactory.makeString(" ");
        $str39$_ = SubLObjectFactory.makeString("-");
        $kw40$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym41$COMBINE_FORMULAS_AT_POSITION = SubLObjectFactory.makeSymbol("COMBINE-FORMULAS-AT-POSITION");
        $list42 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"));
        $sym43$COMBINE_QUERIES = SubLObjectFactory.makeSymbol("COMBINE-QUERIES");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPS"));
        $sym45$COMBINE_MULTIPLE_QUERIES = SubLObjectFactory.makeSymbol("COMBINE-MULTIPLE-QUERIES");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPS"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PROPS"));
        $sym48$CREATE_FORMULA_FROM_TERM = SubLObjectFactory.makeSymbol("CREATE-FORMULA-FROM-TERM");
        $const49$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const50$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym51$_X = SubLObjectFactory.makeSymbol("?X");
        $const52$Set_Mathematical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Set-Mathematical"));
        $const53$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $const54$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"));
        $const56$TernaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TernaryPredicate"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $const58$QuaternaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuaternaryPredicate"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?W"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $const60$QuintaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuintaryPredicate"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?V"), (SubLObject)SubLObjectFactory.makeSymbol("?W"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?T"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $sym62$PREDICATE_REQUIRES_BACKCHAIN_ = SubLObjectFactory.makeSymbol("PREDICATE-REQUIRES-BACKCHAIN?");
        $const63$backchainRequired = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("backchainRequired"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $sym65$_PREDICATE_REQUIRES_BACKCHAIN__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDICATE-REQUIRES-BACKCHAIN?-CACHING-STATE*");
        $sym66$CLEAR_PREDICATE_REQUIRES_BACKCHAIN_ = SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-REQUIRES-BACKCHAIN?");
        $sym67$PREDICATE_BACKCHAIN_ENCOURAGED_ = SubLObjectFactory.makeSymbol("PREDICATE-BACKCHAIN-ENCOURAGED?");
        $const68$backchainEncouraged = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("backchainEncouraged"));
        $sym69$_PREDICATE_BACKCHAIN_ENCOURAGED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDICATE-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");
        $sym70$CLEAR_PREDICATE_BACKCHAIN_ENCOURAGED_ = SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-BACKCHAIN-ENCOURAGED?");
        $sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_ = SubLObjectFactory.makeSymbol("QL-COLLECTION-BACKCHAIN-ENCOURAGED?");
        $sym72$_QL_COLLECTION_BACKCHAIN_ENCOURAGED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QL-COLLECTION-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");
        $sym73$CLEAR_QL_COLLECTION_BACKCHAIN_ENCOURAGED_ = SubLObjectFactory.makeSymbol("CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?");
        $sym74$GUESS_INFERENCE_PARAMETERS_FOR_QUERY = SubLObjectFactory.makeSymbol("GUESS-INFERENCE-PARAMETERS-FOR-QUERY");
        $kw75$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $sym76$COMBINE_FORMULAS_AT_POSITION_INT = SubLObjectFactory.makeSymbol("COMBINE-FORMULAS-AT-POSITION-INT");
        $kw77$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw78$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw79$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw80$KB = SubLObjectFactory.makeKeyword("KB");
        $kw81$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw82$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list83 = _constant_83_initializer();
        $sym84$COMBINE_QUERIES_INT = SubLObjectFactory.makeSymbol("COMBINE-QUERIES-INT");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW")), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL")), (SubLObject)query_library_api.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerrorismRecommendedWffCheckingMt"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW")))));
        $sym86$CREATE_FORMULA_FROM_TERM_INT = SubLObjectFactory.makeSymbol("CREATE-FORMULA-FROM-TERM-INT");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah"))), (SubLObject)query_library_api.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subOrganizations"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subOrganizations")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))))));
    }
}

/*

	Total time: 978 ms
	
*/