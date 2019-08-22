package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.open_cyc_inference_api;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class query_library_api extends SubLTranslatedFile {
    public static final SubLFile me = new query_library_api();

    public static final String myName = "com.cyc.cycjava.cycl.query_library_api";

    public static final String myFingerPrint = "0707bb10756a002672ba9fc20133933aaaae7526a4c5efb2b14fcc1e147fc43b";



    // deflexical
    /**
     * NON-NEGATIVE-INTEGER-P or NIL; Cutoff for number of inference answers to
     * paraphrase eagerly, before they are sent back to the client. For any in
     * excess of this, an inference-answer signature is sent back along with the
     * CycL term, for use in generating paraphrases lazily if needed.
     */
    private static final SubLSymbol $max_ql_answers_to_paraphrase$ = makeSymbol("*MAX-QL-ANSWERS-TO-PARAPHRASE*");

    // deflexical
    private static final SubLSymbol $predicate_requires_backchainP_caching_state$ = makeSymbol("*PREDICATE-REQUIRES-BACKCHAIN?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $predicate_backchain_encouragedP_caching_state$ = makeSymbol("*PREDICATE-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $ql_collection_backchain_encouragedP_caching_state$ = makeSymbol("*QL-COLLECTION-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");

    // Internal Constants
    public static final SubLSymbol GET_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT = makeSymbol("GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT");

    public static final SubLSymbol $sym1$_MT = makeSymbol("?MT");

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    public static final SubLList $list3 = list(makeSymbol("?MT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLList $list5 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLObject $$KEInteractionResourceTestMt = reader_make_constant_shell(makeString("KEInteractionResourceTestMt"));

    public static final SubLSymbol GET_QUERY_LIBRARY_IN_XML = makeSymbol("GET-QUERY-LIBRARY-IN-XML");

    public static final SubLSymbol FORT_OR_NAUT_P = makeSymbol("FORT-OR-NAUT-P");



    private static final SubLString $$$queryLibrary = makeString("queryLibrary");

    private static final SubLString $str11$http___www_opencyc_org_xml_queryL = makeString("http://www.opencyc.org/xml/queryLibrary.dtd");



    public static final SubLSymbol GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED = makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED");

    public static final SubLSymbol REMOVE_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED = makeSymbol("REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED");

    public static final SubLSymbol GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT = makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT");

    public static final SubLSymbol $get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$ = makeSymbol("*GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-CACHING-STATE*");



    private static final SubLSymbol GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML = makeSymbol("GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML");

    private static final SubLSymbol KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED = makeSymbol("KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED");

    private static final SubLSymbol GET_QUERY_TERM_PROPERTIES = makeSymbol("GET-QUERY-TERM-PROPERTIES");







    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-TIME"), makeInteger(30) });

    public static final SubLList $list25 = cons(makeSymbol("?PROPERTY"), makeSymbol("?VALUE"));

    private static final SubLObject $const26$propertiesPanelEntry_WithPredicat = reader_make_constant_shell(makeString("propertiesPanelEntry-WithPredicate"));

    private static final SubLList $list27 = list(makeSymbol("?PROPERTY"), makeSymbol("?VALUE"));

    public static final SubLList $list28 = cons(makeSymbol("PROPERTY"), makeSymbol("VALUE"));

    private static final SubLSymbol QL_PROCESS_INFERENCE_ANSWER = makeSymbol("QL-PROCESS-INFERENCE-ANSWER");

    private static final SubLList $list30 = list(cons(makeSymbol("?TRUTH"), makeString("Yes")));











    public static final SubLList $list36 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLInteger $int$40 = makeInteger(40);

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str39$_ = makeString("-");



    private static final SubLSymbol COMBINE_FORMULAS_AT_POSITION = makeSymbol("COMBINE-FORMULAS-AT-POSITION");

    private static final SubLList $list42 = cons(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));

    private static final SubLSymbol COMBINE_QUERIES = makeSymbol("COMBINE-QUERIES");

    public static final SubLList $list44 = list(makeSymbol("NEW-FORMULA"), makeSymbol("NEW-MT"), makeSymbol("NEW-PROPS"));

    private static final SubLSymbol COMBINE_MULTIPLE_QUERIES = makeSymbol("COMBINE-MULTIPLE-QUERIES");

    private static final SubLList $list46 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("PROPS"));

    public static final SubLList $list47 = list(makeSymbol("OTHER-FORMULA"), makeSymbol("OTHER-MT"), makeSymbol("OTHER-PROPS"));

    private static final SubLSymbol CREATE_FORMULA_FROM_TERM = makeSymbol("CREATE-FORMULA-FROM-TERM");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym51$_X = makeSymbol("?X");

    private static final SubLObject $$Set_Mathematical = reader_make_constant_shell(makeString("Set-Mathematical"));

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    private static final SubLList $list55 = list(makeSymbol("?X"), makeSymbol("?Y"));

    private static final SubLObject $$TernaryPredicate = reader_make_constant_shell(makeString("TernaryPredicate"));

    private static final SubLList $list57 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLObject $$QuaternaryPredicate = reader_make_constant_shell(makeString("QuaternaryPredicate"));

    private static final SubLList $list59 = list(makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLObject $$QuintaryPredicate = reader_make_constant_shell(makeString("QuintaryPredicate"));

    private static final SubLList $list61 = list(makeSymbol("?V"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?T"), makeSymbol("?Z"));

    private static final SubLSymbol $sym62$PREDICATE_REQUIRES_BACKCHAIN_ = makeSymbol("PREDICATE-REQUIRES-BACKCHAIN?");

    private static final SubLObject $$backchainRequired = reader_make_constant_shell(makeString("backchainRequired"));

    public static final SubLList $list64 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    private static final SubLSymbol $sym65$_PREDICATE_REQUIRES_BACKCHAIN__CACHING_STATE_ = makeSymbol("*PREDICATE-REQUIRES-BACKCHAIN?-CACHING-STATE*");

    private static final SubLSymbol $sym66$CLEAR_PREDICATE_REQUIRES_BACKCHAIN_ = makeSymbol("CLEAR-PREDICATE-REQUIRES-BACKCHAIN?");

    private static final SubLSymbol $sym67$PREDICATE_BACKCHAIN_ENCOURAGED_ = makeSymbol("PREDICATE-BACKCHAIN-ENCOURAGED?");

    private static final SubLObject $$backchainEncouraged = reader_make_constant_shell(makeString("backchainEncouraged"));

    private static final SubLSymbol $sym69$_PREDICATE_BACKCHAIN_ENCOURAGED__CACHING_STATE_ = makeSymbol("*PREDICATE-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");

    private static final SubLSymbol $sym70$CLEAR_PREDICATE_BACKCHAIN_ENCOURAGED_ = makeSymbol("CLEAR-PREDICATE-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol $sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("QL-COLLECTION-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol $sym72$_QL_COLLECTION_BACKCHAIN_ENCOURAGED__CACHING_STATE_ = makeSymbol("*QL-COLLECTION-BACKCHAIN-ENCOURAGED?-CACHING-STATE*");

    private static final SubLSymbol $sym73$CLEAR_QL_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol("CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?");

    private static final SubLSymbol GUESS_INFERENCE_PARAMETERS_FOR_QUERY = makeSymbol("GUESS-INFERENCE-PARAMETERS-FOR-QUERY");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol COMBINE_FORMULAS_AT_POSITION_INT = makeSymbol("COMBINE-FORMULAS-AT-POSITION-INT");













    public static final SubLObject $list83 = _constant_83_initializer();

    private static final SubLSymbol COMBINE_QUERIES_INT = makeSymbol("COMBINE-QUERIES-INT");

    private static final SubLList $list85 = list(list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL")), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")))));

    private static final SubLSymbol CREATE_FORMULA_FROM_TERM_INT = makeSymbol("CREATE-FORMULA-FROM-TERM-INT");

    private static final SubLList $list87 = list(list(list(reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bombing")))), list(list(reader_make_constant_shell(makeString("LebaneseHizballah"))), NIL), list(list(reader_make_constant_shell(makeString("subOrganizations"))), list(reader_make_constant_shell(makeString("subOrganizations")), makeSymbol("?X"), makeSymbol("?Y"))), list(list(list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("GeorgeWBush")), reader_make_constant_shell(makeString("OsamaBinLaden")))), list(reader_make_constant_shell(makeString("elementOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("GeorgeWBush")), reader_make_constant_shell(makeString("OsamaBinLaden"))))));

    public static SubLObject get_query_library_in_xml_from_default_mt(final SubLObject query_library) {
        final SubLObject first_mt = ask_utilities.query_variable($sym1$_MT, listS($$definingMt, query_library, $list3), $$InferencePSC, $list5).first();
        final SubLObject mt = (NIL != first_mt) ? first_mt : $$KEInteractionResourceTestMt;
        return get_query_library_in_xml(query_library, mt);
    }

    public static SubLObject get_query_library_in_xml(SubLObject query_library, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_utilities.fort_or_naut_p(query_library) : "cycl_utilities.fort_or_naut_p(query_library) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(query_library) " + query_library;
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        query_library = czer_main.coerce_to_fort(query_library);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject query_library_data = NIL;
        SubLObject xml_string = NIL;
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
                        query_library_data = ke_interaction_folder.ke_interaction_folder_load_query_library(query_library, mt, UNPROVIDED);
                    } finally {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.generate_valid_xml_header(stream);
                xml_utilities.generate_xml_header_entry_for_dtd($$$queryLibrary, $str11$http___www_opencyc_org_xml_queryL, stream);
                try {
                    final SubLObject _prev_bind_0_$4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$queryLibrary, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            ke_interaction_folder.xml_serialize_ke_interaction_folder(query_library_data, stream);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$5, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$queryLibrary);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return xml_string;
    }

    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached(final SubLObject query_library) {
        return get_one_level_query_library_in_xml_from_default_mt_cached_int(query_library, UNPROVIDED);
    }

    public static SubLObject remove_get_one_level_query_library_in_xml_from_default_mt_cached(final SubLObject query_library) {
        return remove_get_one_level_query_library_in_xml_from_default_mt_cached_int(query_library, UNPROVIDED);
    }

    public static SubLObject clear_get_one_level_query_library_in_xml_from_default_mt_cached_int() {
        final SubLObject cs = $get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_one_level_query_library_in_xml_from_default_mt_cached_int(final SubLObject query_library, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue(), list(query_library, task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached_int_internal(final SubLObject query_library, final SubLObject task) {
        return get_one_level_query_library_in_xml_from_default_mt(query_library, task);
    }

    public static SubLObject get_one_level_query_library_in_xml_from_default_mt_cached_int(final SubLObject query_library, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = $get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT, $get_one_level_query_library_in_xml_from_default_mt_cached_int_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$512);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_library, task);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query_library.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && task.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_one_level_query_library_in_xml_from_default_mt_cached_int_internal(query_library, task)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query_library, task));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_one_level_query_library_in_xml_from_default_mt(final SubLObject query_library, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = ke_interaction_folder.default_mt_for_ke_interaction_folder(query_library);
        SubLObject xml = NIL;
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
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    xml = get_one_level_query_library_in_xml(query_library, mt, task);
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if ((NIL == reusedP) && (NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP())) {
                        formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0, thread);
        }
        return xml;
    }

    public static SubLObject get_one_level_query_library_in_xml(SubLObject query_library, SubLObject mt, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_utilities.fort_or_naut_p(query_library) : "cycl_utilities.fort_or_naut_p(query_library) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(query_library) " + query_library;
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
        query_library = czer_main.coerce_to_fort(query_library);
        mt = hlmt_czer.coerce_to_hlmt(mt);
        SubLObject query_library_data = NIL;
        SubLObject xml_string = NIL;
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
                        query_library_data = update_folder_query_params_using_task_defaults(ke_interaction_folder.ke_interaction_folder_load_one_level(query_library, mt, UNPROVIDED), task);
                    } finally {
                        formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0_$10, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
            }
        } finally {
            formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                final SubLObject stream_$12 = xml_vars.$xml_stream$.getDynamicValue(thread);
                xml_utilities.generate_valid_xml_header(stream_$12);
                xml_utilities.generate_xml_header_entry_for_dtd($$$queryLibrary, $str11$http___www_opencyc_org_xml_queryL, stream_$12);
                try {
                    final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$queryLibrary, NIL, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            ke_interaction_folder.xml_serialize_ke_interaction_folder(query_library_data, stream_$12);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$queryLibrary);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return xml_string;
    }

    public static SubLObject update_folder_query_params_using_task_defaults(final SubLObject v_ke_interaction_folder, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLObject params = query_library_utils.default_inference_parameters_for_task(task);
        ke_interaction_folder.update_folder_query_params_using_defaults(v_ke_interaction_folder, params);
        return v_ke_interaction_folder;
    }

    public static SubLObject ke_interaction_folder_load_query_library_memoized_internal(final SubLObject query_library, final SubLObject mt) {
        return ke_interaction_folder.ke_interaction_folder_load_query_library(query_library, mt, UNPROVIDED);
    }

    public static SubLObject ke_interaction_folder_load_query_library_memoized(final SubLObject query_library, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return ke_interaction_folder_load_query_library_memoized_internal(query_library, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(query_library, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query_library.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(ke_interaction_folder_load_query_library_memoized_internal(query_library, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query_library, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_query_library_caches(SubLObject argument, SubLObject assertion) {
        if (argument == UNPROVIDED) {
            argument = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        formula_template_vars.$template_topic_memoization$.setGlobalValue(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        clear_get_one_level_query_library_in_xml_from_default_mt_cached_int();
        return NIL;
    }

    public static SubLObject get_query_term_properties(final SubLObject v_term, final SubLObject query_formula, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_term) : "cycl_grammar.cycl_denotational_term_p(v_term) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_term) " + v_term;
        assert NIL != el_formula_p(query_formula) : "el_utilities.el_formula_p(query_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(query_formula) " + query_formula;
        assert NIL != forts.fort_p(task) : "forts.fort_p(task) " + "CommonSymbols.NIL != forts.fort_p(task) " + task;
        final SubLObject v_properties = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject query_properties = $list24;
        final SubLObject canonical_term = narts_high.nart_substitute(v_term);
        final SubLObject query_template = $list25;
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = NIL;
        stacks.stack_push(narts_high.nart_substitute(query_formula), stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (NIL != literalP(entry)) {
                literal = entry;
                if (NIL != cycl_utilities.expression_find(canonical_term, literal, T, symbol_function(EQUAL), UNPROVIDED)) {
                    final SubLObject query_sentence = listS($const26$propertiesPanelEntry_WithPredicat, v_term, cycl_utilities.atomic_sentence_predicate(literal), task, $list27);
                    SubLObject cdolist_list_var;
                    final SubLObject literal_results = cdolist_list_var = ask_utilities.query_template(query_template, query_sentence, $$InferencePSC, query_properties);
                    SubLObject cons = NIL;
                    cons = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject property = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list28);
                        property = current.first();
                        current = value = current.rest();
                        dictionary_utilities.dictionary_pushnew(v_properties, property, value, symbol_function(EQUAL), UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    } 
                }
            }
            SubLObject cdolist_list_var2 = cycl_utilities.formula_args(entry, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                stacks.stack_push(arg, stack);
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg = cdolist_list_var2.first();
            } 
        } 
        return dictionary_utilities.dictionary_to_alist(v_properties);
    }

    public static SubLObject ql_process_inference_answer(final SubLObject inference, final SubLObject inference_answer, final SubLObject nl_generation_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abduction_allowedP = inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_inference.inference_problem_store(inference));
        SubLObject binding_set = inference_kernel.inference_answer_el_bindings(inference_answer);
        if (NIL != list_utilities.empty_list_p(binding_set)) {
            binding_set = $list30;
        }
        final SubLObject look_for_source_dataP = query_library_utils.source_information_enabled_for_task(cae_query_search.current_cae_task());
        final SubLObject source_icon_data = (NIL != look_for_source_dataP) ? sources.source_icon_paths_for_inference_answer(inference_answer) : NIL;
        final SubLObject answer_speculation_level = (NIL != abduction_allowedP) ? abduction.inference_answer_minimal_abduction_count(inference_answer) : NIL;
        final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid(inference_answer);
        SubLObject irrelevant_terms = NIL;
        SubLObject processed_binding_set = NIL;
        SubLObject cdolist_list_var = binding_set;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject ql_binding = el_binding_to_ql_binding(binding, nl_generation_properties, inference_answer);
            final SubLObject irrelevantP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            processed_binding_set = cons(ql_binding, processed_binding_set);
            if (NIL != irrelevantP) {
                final SubLObject item_var = bindings.variable_binding_value(binding);
                if (NIL == member(item_var, irrelevant_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    irrelevant_terms = cons(item_var, irrelevant_terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        SubLObject plist = list($BINDINGS, processed_binding_set, $SOURCE_ICONS, source_icon_data, $ANSWER_ID, answer_id);
        if (NIL != abduction_allowedP) {
            plist = putf(plist, $SPECULATION_LEVEL, answer_speculation_level);
        }
        plist = putf(plist, $IRRELEVANT_TERMS, irrelevant_terms);
        return plist;
    }

    public static SubLObject ql_irrelevant_termP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = query_library_utils.get_default_wff_checking_mt(cae_query_search.current_cae_task());
        }
        return makeBoolean(((NIL != forts.fort_p(obj)) && (NIL == term.fast_reified_skolemP(obj))) && (NIL != thcl.ke_irrelevant_termP(obj, mt)));
    }

    public static SubLObject el_binding_to_ql_binding(final SubLObject binding, final SubLObject nl_generation_properties, final SubLObject inference_answer) {
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list36);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        value = narts_high.nart_substitute(value);
        final SubLObject variable_string = ql_variable_to_nl_string(variable);
        final SubLObject pph_result = paraphrase_value_for_ql_binding(value, nl_generation_properties, inference_answer);
        final SubLObject offer_fact_sheetP = fact_sheets.term_ok_for_fact_sheet_p(value, UNPROVIDED);
        final SubLObject irrelevantP = makeBoolean((NIL == query_library_utils.irrelevant_results_allowed_for_task(cae_query_search.current_cae_task())) && (NIL != ql_irrelevant_termP(value, UNPROVIDED)));
        return values(list(variable_string, pph_result, value, offer_fact_sheetP), irrelevantP);
    }

    public static SubLObject paraphrase_value_for_ql_binding(final SubLObject value, final SubLObject nl_generation_properties, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max = $max_ql_answers_to_paraphrase$.getGlobalValue();
        SubLObject ans = NIL;
        if ((((NIL == max) || inference_datastructures_inference.inference_answer_suid(inference_answer).numL(max)) || value.isString()) || value.isNumber()) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
                ans = pph_utilities.generate_phrase_for_java_no_checks_with_property_list(value, nl_generation_properties, open_cyc_inference_api.$default_open_cyc_nl_generation_properties$.getDynamicValue(thread));
                if (NIL != pph_utilities.pph_javalist_p(ans)) {
                    pph_utilities.possibly_optimize_pph_javalist_for_alphabetization(ans);
                }
            } finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            ans = list(inference_datastructures_problem_store.problem_store_suid(store), inference_datastructures_inference.inference_suid(inference), inference_datastructures_inference.inference_answer_suid(inference_answer));
        }
        return ans;
    }

    public static SubLObject ql_variable_to_nl_string(final SubLObject variable) {
        SubLObject variable_string = string_utilities.substring(Strings.string_downcase(string_utilities.to_string(variable), UNPROVIDED, UNPROVIDED), ONE_INTEGER, UNPROVIDED);
        variable_string = string_utilities.string_substitute($$$_, $str39$_, variable_string, UNPROVIDED);
        return pph_utilities.add_title_capitalization(variable_string);
    }

    public static SubLObject find_all_variables_outside_negated_clauses(final SubLObject formula) {
        return set.set_element_list(find_all_variables_outside_negated_clauses_int(formula, set.new_set(UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject find_all_variables_outside_negated_clauses_int(final SubLObject formula, final SubLObject seen) {
        if (NIL == variable_unification.el_negation_or_unknown_sentence_p(formula)) {
            if (NIL != el_formula_p(formula)) {
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(formula, $IGNORE);
                SubLObject part = NIL;
                part = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    find_all_variables_outside_negated_clauses_int(part, seen);
                    cdolist_list_var = cdolist_list_var.rest();
                    part = cdolist_list_var.first();
                } 
            } else
                if (NIL != cycl_variables.cyc_varP(formula)) {
                    set.set_add(formula, seen);
                }

        }
        return seen;
    }

    public static SubLObject existentially_bind_free_variables_inside_negated_clauses(final SubLObject formula) {
        return existentially_bind_free_variables_inside_negated_clauses_int(formula, find_all_variables_outside_negated_clauses(formula));
    }

    public static SubLObject existentially_bind_free_variables_inside_negated_clauses_int(final SubLObject formula, final SubLObject excluded_variables) {
        if (NIL != variable_unification.el_negation_or_unknown_sentence_p(formula)) {
            final SubLObject v_negation_predicate = cycl_utilities.formula_arg0(formula);
            SubLObject v_core = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject v_variables = cdolist_list_var = obsolete.formula_free_variables(v_core, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject variable = NIL;
            variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == member(variable, excluded_variables, UNPROVIDED, UNPROVIDED)) {
                    v_core = make_existential(variable, v_core);
                }
                cdolist_list_var = cdolist_list_var.rest();
                variable = cdolist_list_var.first();
            } 
            return make_unary_formula(v_negation_predicate, v_core);
        }
        if (NIL != el_formula_p(formula)) {
            SubLObject new_terms = NIL;
            SubLObject cdolist_list_var2;
            final SubLObject terms = cdolist_list_var2 = cycl_utilities.formula_terms(formula, $IGNORE);
            SubLObject part = NIL;
            part = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                new_terms = cons(existentially_bind_free_variables_inside_negated_clauses_int(part, excluded_variables), new_terms);
                cdolist_list_var2 = cdolist_list_var2.rest();
                part = cdolist_list_var2.first();
            } 
            return list_to_elf(nreverse(new_terms));
        }
        return formula;
    }

    public static SubLObject combine_formulas_at_position(final SubLObject formula1, final SubLObject formula2, final SubLObject argpos, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == UNPROVIDED) {
            auto_unifyP = T;
        }
        if (auto_unification_mt == UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        if (optimize_variable_namesP == UNPROVIDED) {
            optimize_variable_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula = combine_formulas_at_position_int(formula1, formula2, argpos, auto_unifyP, auto_unification_mt);
        if ((NIL != optimize_variable_namesP) && (NIL != el_formula_p(new_formula))) {
            new_formula = optimize_el_formula_variable_names(new_formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, formula1);
        }
        return new_formula;
    }

    public static SubLObject combine_formulas_at_position_int(final SubLObject formula1, final SubLObject formula2, final SubLObject argpos, SubLObject auto_unifyP, SubLObject auto_unification_mt) {
        if (auto_unifyP == UNPROVIDED) {
            auto_unifyP = T;
        }
        if (auto_unification_mt == UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans1 = NIL;
        SubLObject ans2 = NIL;
        SubLObject ans3 = NIL;
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
                final SubLObject part_to_unify = cycl_utilities.formula_arg_position(uniq_formula1, new_argpos, UNPROVIDED);
                final SubLObject top_levelP = eql(NIL, new_argpos);
                final SubLObject new_part = build_new_formula_for_combination(part_to_unify, uniq_formula2, top_levelP);
                SubLObject new_formula = (NIL != new_argpos) ? cycl_utilities.formula_arg_position_subst(new_part, new_argpos, uniq_formula1) : new_part;
                final SubLObject formula1_variable_renames = NIL;
                if (NIL != auto_unifyP) {
                    final SubLObject allow_duplicatesP = NIL;
                    SubLObject cdolist_list_var;
                    final SubLObject unifications = cdolist_list_var = variable_unification.attempt_to_combine_variables_in_complex_combination(new_formula, uniq_formula2, uniq_formula1, auto_unification_mt, allow_duplicatesP, UNPROVIDED, UNPROVIDED);
                    SubLObject cons = NIL;
                    cons = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject source_var = NIL;
                        SubLObject target_var = NIL;
                        destructuring_bind_must_consp(current, datum, $list42);
                        source_var = current.first();
                        current = target_var = current.rest();
                        new_formula = cycl_utilities.formula_subst(target_var, source_var, new_formula, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    } 
                }
                SubLObject cdolist_list_var2 = list(closed_vars_in_formula2, closed_vars_in_formula1);
                SubLObject vars = NIL;
                vars = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$16 = vars;
                    SubLObject var = NIL;
                    var = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        if (NIL != list_utilities.tree_find(var, new_formula, UNPROVIDED, UNPROVIDED)) {
                            new_formula = make_existential(var, new_formula);
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
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(ans1, ans2, ans3);
    }

    public static SubLObject prepare_formulas_for_combination(final SubLObject formula1, final SubLObject formula2, SubLObject argpos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uniq_formula1 = formula1;
        SubLObject formula2_variable_renames = NIL;
        SubLObject closed_vars_in_formula1 = NIL;
        SubLObject closed_vars_in_formula2 = NIL;
        thread.resetMultipleValues();
        final SubLObject uniq_formula2_$18 = value_tables.varmap_uniquify_source_vars(formula2, formula1);
        final SubLObject formula2_variable_renames_$19 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject uniq_formula2 = uniq_formula2_$18;
        formula2_variable_renames = formula2_variable_renames_$19;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            if (NIL != el_existential_p(uniq_formula1)) {
                closed_vars_in_formula1 = cons(cycl_utilities.formula_arg1(uniq_formula1, UNPROVIDED), closed_vars_in_formula1);
                uniq_formula1 = cycl_utilities.formula_arg2(uniq_formula1, UNPROVIDED);
                argpos = argpos.rest();
            } else
                if (((NIL != el_conjunction_p(uniq_formula1)) && (NIL != list_utilities.singletonP(cycl_utilities.formula_args(uniq_formula1, UNPROVIDED)))) && (NIL != el_existential_p(cycl_utilities.formula_arg1(uniq_formula1, UNPROVIDED)))) {
                    uniq_formula1 = cycl_utilities.formula_arg1(uniq_formula1, UNPROVIDED);
                    argpos = argpos.rest();
                } else {
                    doneP = T;
                }

        } 
        while (NIL != el_existential_p(uniq_formula2)) {
            closed_vars_in_formula2 = cons(second(uniq_formula2), closed_vars_in_formula2);
            uniq_formula2 = third(uniq_formula2);
        } 
        return values(uniq_formula1, uniq_formula2, formula2_variable_renames, argpos, closed_vars_in_formula1, closed_vars_in_formula2);
    }

    public static SubLObject build_new_formula_for_combination(final SubLObject part_to_unify, final SubLObject uniq_formula2, final SubLObject top_levelP) {
        SubLObject new_part = NIL;
        if (((NIL != el_disjunction_p(part_to_unify)) && (NIL != el_disjunction_p(uniq_formula2))) && (NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)))) {
            new_part = simplifier.disjoin(append(cycl_utilities.formula_args(part_to_unify, UNPROVIDED), cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)), UNPROVIDED);
        } else
            if ((((NIL != top_levelP) && (NIL != el_conjunction_p(part_to_unify))) && (NIL != el_conjunction_p(uniq_formula2))) && (NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)))) {
                new_part = simplifier.conjoin(append(cycl_utilities.formula_args(part_to_unify, UNPROVIDED), cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)), UNPROVIDED);
            } else
                if (NIL != el_disjunction_p(part_to_unify)) {
                    new_part = simplifier.disjoin(list_utilities.add_to_end(uniq_formula2, cycl_utilities.formula_args(part_to_unify, UNPROVIDED)), UNPROVIDED);
                } else
                    if (NIL != el_conjunction_p(part_to_unify)) {
                        new_part = simplifier.conjoin(list_utilities.add_to_end(uniq_formula2, cycl_utilities.formula_args(part_to_unify, UNPROVIDED)), UNPROVIDED);
                    } else
                        if ((NIL != el_conjunction_p(uniq_formula2)) && (NIL != list_utilities.non_empty_list_p(cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)))) {
                            new_part = simplifier.conjoin(cons(part_to_unify, cycl_utilities.formula_args(uniq_formula2, UNPROVIDED)), UNPROVIDED);
                        } else {
                            new_part = simplifier.conjoin(list(part_to_unify, uniq_formula2), UNPROVIDED);
                        }




        return new_part;
    }

    public static SubLObject combine_queries_int(final SubLObject formula1, final SubLObject mt1, final SubLObject props1, final SubLObject formula2, final SubLObject mt2, final SubLObject props2, SubLObject auto_unifyP, SubLObject auto_unification_mt) {
        if (auto_unifyP == UNPROVIDED) {
            auto_unifyP = T;
        }
        if (auto_unification_mt == UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        final SubLObject new_formula = combine_formulas_at_position(formula1, formula2, NIL, auto_unifyP, auto_unification_mt, NIL);
        final SubLObject new_mt = (mt1.eql(mt2)) ? mt1 : hlmt.union_mt_relevance_contexts(list(mt1, mt2));
        final SubLObject new_props = api_widgets.combine_query_properties(props1, props2);
        return list(new_formula, new_mt, new_props);
    }

    public static SubLObject combine_queries(final SubLObject formula1, final SubLObject mt1, final SubLObject props1, final SubLObject formula2, final SubLObject mt2, final SubLObject props2, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == UNPROVIDED) {
            auto_unifyP = T;
        }
        if (auto_unification_mt == UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        if (optimize_variable_namesP == UNPROVIDED) {
            optimize_variable_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = combine_queries_int(formula1, mt1, props1, formula2, mt2, props2, auto_unifyP, auto_unification_mt);
        SubLObject new_formula = NIL;
        SubLObject new_mt = NIL;
        SubLObject new_props = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        new_formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        new_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        new_props = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != optimize_variable_namesP) && (NIL != el_formula_p(new_formula))) {
                new_formula = optimize_el_formula_variable_names(new_formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, UNPROVIDED);
            }
            return list(new_formula, new_mt, new_props);
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject combine_multiple_queries(final SubLObject queries, SubLObject auto_unifyP, SubLObject auto_unification_mt, SubLObject optimize_variable_namesP) {
        if (auto_unifyP == UNPROVIDED) {
            auto_unifyP = T;
        }
        if (auto_unification_mt == UNPROVIDED) {
            auto_unification_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        if (optimize_variable_namesP == UNPROVIDED) {
            optimize_variable_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = queries.first();
        SubLObject cdolist_list_var;
        final SubLObject other_queries = cdolist_list_var = queries.rest();
        SubLObject other_query = NIL;
        other_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query;
            SubLObject formula = NIL;
            SubLObject mt = NIL;
            SubLObject props = NIL;
            destructuring_bind_must_consp(current, datum, $list46);
            formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list46);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list46);
            props = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = other_query;
                SubLObject other_formula = NIL;
                SubLObject other_mt = NIL;
                SubLObject other_props = NIL;
                destructuring_bind_must_consp(current_$21, datum_$20, $list47);
                other_formula = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list47);
                other_mt = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list47);
                other_props = current_$21.first();
                current_$21 = current_$21.rest();
                if (NIL == current_$21) {
                    query = combine_queries(formula, mt, props, other_formula, other_mt, other_props, auto_unifyP, auto_unification_mt, optimize_variable_namesP);
                } else {
                    cdestructuring_bind_error(datum_$20, $list47);
                }
            } else {
                cdestructuring_bind_error(datum, $list46);
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_query = cdolist_list_var.first();
        } 
        if ((NIL != optimize_variable_namesP) && (NIL != list_utilities.empty_list_p(other_queries))) {
            final SubLObject new_formula = optimize_el_formula_variable_names(query.first(), pph_vars.$pph_language_mt$.getDynamicValue(thread), auto_unification_mt, UNPROVIDED);
            rplaca(query, new_formula);
        }
        return query;
    }

    public static SubLObject create_formula_from_term(final SubLObject v_term, SubLObject domain_mt, SubLObject optimize_variable_namesP) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        if (optimize_variable_namesP == UNPROVIDED) {
            optimize_variable_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = create_formula_from_term_int(v_term, domain_mt);
        if ((NIL != formula) && (NIL != optimize_variable_namesP)) {
            formula = optimize_el_formula_variable_names(formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, UNPROVIDED);
        }
        return formula;
    }

    public static SubLObject create_formula_from_term_int(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = query_library_utils.get_auto_unification_mt(UNPROVIDED);
        }
        SubLObject formula = NIL;
        if (NIL != isa.isaP(v_term, $$Collection, domain_mt, UNPROVIDED)) {
            formula = list($$isa, $sym51$_X, v_term);
        } else
            if (NIL != isa.isaP(v_term, $$Set_Mathematical, domain_mt, UNPROVIDED)) {
                formula = list($$elementOf, $sym51$_X, v_term);
            } else
                if (NIL != isa.isaP(v_term, $$BinaryPredicate, domain_mt, UNPROVIDED)) {
                    formula = bq_cons(v_term, $list55);
                } else
                    if (NIL != isa.isaP(v_term, $$TernaryPredicate, domain_mt, UNPROVIDED)) {
                        formula = bq_cons(v_term, $list57);
                    } else
                        if (NIL != isa.isaP(v_term, $$QuaternaryPredicate, domain_mt, UNPROVIDED)) {
                            formula = bq_cons(v_term, $list59);
                        } else
                            if (NIL != isa.isaP(v_term, $$QuintaryPredicate, domain_mt, UNPROVIDED)) {
                                formula = bq_cons(v_term, $list61);
                            }





        return formula;
    }

    public static SubLObject clear_predicate_requires_backchainP() {
        final SubLObject cs = $predicate_requires_backchainP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_predicate_requires_backchainP(final SubLObject predicate, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($predicate_requires_backchainP_caching_state$.getGlobalValue(), list(predicate, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_requires_backchainP_internal(final SubLObject predicate, final SubLObject mt) {
        if (NIL != cycl_variables.cyc_varP(predicate)) {
            return NIL;
        }
        if (NIL != inference_kernel.new_cyc_query(list($$backchainRequired, predicate), mt, $list64)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject predicate_requires_backchainP(final SubLObject predicate, final SubLObject mt) {
        SubLObject caching_state = $predicate_requires_backchainP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym62$PREDICATE_REQUIRES_BACKCHAIN_, $sym65$_PREDICATE_REQUIRES_BACKCHAIN__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym66$CLEAR_PREDICATE_REQUIRES_BACKCHAIN_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(predicate_requires_backchainP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_predicate_backchain_encouragedP() {
        final SubLObject cs = $predicate_backchain_encouragedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_predicate_backchain_encouragedP(final SubLObject predicate, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($predicate_backchain_encouragedP_caching_state$.getGlobalValue(), list(predicate, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_backchain_encouragedP_internal(final SubLObject predicate, final SubLObject mt) {
        if (NIL != cycl_variables.cyc_varP(predicate)) {
            return NIL;
        }
        if (NIL != inference_kernel.new_cyc_query(list($$backchainEncouraged, predicate), mt, $list64)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject predicate_backchain_encouragedP(final SubLObject predicate, final SubLObject mt) {
        SubLObject caching_state = $predicate_backchain_encouragedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym67$PREDICATE_BACKCHAIN_ENCOURAGED_, $sym69$_PREDICATE_BACKCHAIN_ENCOURAGED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym70$CLEAR_PREDICATE_BACKCHAIN_ENCOURAGED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(predicate_backchain_encouragedP_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_ql_collection_backchain_encouragedP() {
        final SubLObject cs = $ql_collection_backchain_encouragedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ql_collection_backchain_encouragedP(final SubLObject coll, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($ql_collection_backchain_encouragedP_caching_state$.getGlobalValue(), list(coll, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ql_collection_backchain_encouragedP_internal(final SubLObject coll, final SubLObject mt) {
        return makeBoolean(((NIL != kb_accessors.collection_backchain_encouragedP(coll, mt)) || (NIL != kb_accessors.collection_isa_backchain_encouragedP(coll, mt))) || (NIL != kb_accessors.collection_genls_backchain_encouragedP(coll, mt)));
    }

    public static SubLObject ql_collection_backchain_encouragedP(final SubLObject coll, final SubLObject mt) {
        SubLObject caching_state = $ql_collection_backchain_encouragedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_, $sym72$_QL_COLLECTION_BACKCHAIN_ENCOURAGED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym73$CLEAR_QL_COLLECTION_BACKCHAIN_ENCOURAGED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(coll, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (coll.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ql_collection_backchain_encouragedP_internal(coll, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(coll, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject formula_requires_backchainP(final SubLObject formula, final SubLObject mt) {
        if (NIL == formula) {
            return NIL;
        }
        if (!formula.isList()) {
            return NIL;
        }
        if (NIL != inference_trampolines.inference_backchain_required_asentP(formula, mt)) {
            return T;
        }
        if (NIL != predicate_requires_backchainP(formula.first(), mt)) {
            return T;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_requires_backchainP(arg, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject formula_backchain_encouragedP(final SubLObject formula, final SubLObject mt) {
        if (NIL == formula) {
            return NIL;
        }
        if (NIL != fort_types_interface.collectionP(formula)) {
            return ql_collection_backchain_encouragedP(formula, mt);
        }
        if (!formula.isList()) {
            return NIL;
        }
        if (NIL != predicate_backchain_encouragedP(formula.first(), mt)) {
            return T;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_backchain_encouragedP(arg, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject guess_inference_parameters_for_query(final SubLObject formula, final SubLObject mt) {
        SubLObject ip = query_library_utils.default_inference_parameters_for_task(cae_query_search.current_cae_task());
        if ((NIL != formula_backchain_encouragedP(formula, mt)) || (NIL != formula_requires_backchainP(formula, mt))) {
            final SubLObject default_transformations_for_task = getf(ip, $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER);
            ip = putf(ip, $MAX_TRANSFORMATION_DEPTH, max(default_transformations_for_task, ONE_INTEGER));
        }
        return ip;
    }

    public static SubLObject declare_query_library_api_file() {
        declareFunction(me, "get_query_library_in_xml_from_default_mt", "GET-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT", 1, 0, false);
        declareFunction(me, "get_query_library_in_xml", "GET-QUERY-LIBRARY-IN-XML", 2, 0, false);
        declareFunction(me, "get_one_level_query_library_in_xml_from_default_mt_cached", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED", 1, 0, false);
        declareFunction(me, "remove_get_one_level_query_library_in_xml_from_default_mt_cached", "REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED", 1, 0, false);
        declareFunction(me, "clear_get_one_level_query_library_in_xml_from_default_mt_cached_int", "CLEAR-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_get_one_level_query_library_in_xml_from_default_mt_cached_int", "REMOVE-GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 1, 1, false);
        declareFunction(me, "get_one_level_query_library_in_xml_from_default_mt_cached_int_internal", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "get_one_level_query_library_in_xml_from_default_mt_cached_int", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT", 1, 1, false);
        declareFunction(me, "get_one_level_query_library_in_xml_from_default_mt", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT", 1, 1, false);
        declareFunction(me, "get_one_level_query_library_in_xml", "GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML", 2, 1, false);
        declareFunction(me, "update_folder_query_params_using_task_defaults", "UPDATE-FOLDER-QUERY-PARAMS-USING-TASK-DEFAULTS", 1, 1, false);
        declareFunction(me, "ke_interaction_folder_load_query_library_memoized_internal", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "ke_interaction_folder_load_query_library_memoized", "KE-INTERACTION-FOLDER-LOAD-QUERY-LIBRARY-MEMOIZED", 2, 0, false);
        declareFunction(me, "clear_query_library_caches", "CLEAR-QUERY-LIBRARY-CACHES", 0, 2, false);
        declareFunction(me, "get_query_term_properties", "GET-QUERY-TERM-PROPERTIES", 2, 1, false);
        declareFunction(me, "ql_process_inference_answer", "QL-PROCESS-INFERENCE-ANSWER", 3, 0, false);
        declareFunction(me, "ql_irrelevant_termP", "QL-IRRELEVANT-TERM?", 1, 1, false);
        declareFunction(me, "el_binding_to_ql_binding", "EL-BINDING-TO-QL-BINDING", 3, 0, false);
        declareFunction(me, "paraphrase_value_for_ql_binding", "PARAPHRASE-VALUE-FOR-QL-BINDING", 3, 0, false);
        declareFunction(me, "ql_variable_to_nl_string", "QL-VARIABLE-TO-NL-STRING", 1, 0, false);
        declareFunction(me, "find_all_variables_outside_negated_clauses", "FIND-ALL-VARIABLES-OUTSIDE-NEGATED-CLAUSES", 1, 0, false);
        declareFunction(me, "find_all_variables_outside_negated_clauses_int", "FIND-ALL-VARIABLES-OUTSIDE-NEGATED-CLAUSES-INT", 2, 0, false);
        declareFunction(me, "existentially_bind_free_variables_inside_negated_clauses", "EXISTENTIALLY-BIND-FREE-VARIABLES-INSIDE-NEGATED-CLAUSES", 1, 0, false);
        declareFunction(me, "existentially_bind_free_variables_inside_negated_clauses_int", "EXISTENTIALLY-BIND-FREE-VARIABLES-INSIDE-NEGATED-CLAUSES-INT", 2, 0, false);
        declareFunction(me, "combine_formulas_at_position", "COMBINE-FORMULAS-AT-POSITION", 3, 3, false);
        declareFunction(me, "combine_formulas_at_position_int", "COMBINE-FORMULAS-AT-POSITION-INT", 3, 2, false);
        declareFunction(me, "prepare_formulas_for_combination", "PREPARE-FORMULAS-FOR-COMBINATION", 3, 0, false);
        declareFunction(me, "build_new_formula_for_combination", "BUILD-NEW-FORMULA-FOR-COMBINATION", 3, 0, false);
        declareFunction(me, "combine_queries_int", "COMBINE-QUERIES-INT", 6, 2, false);
        declareFunction(me, "combine_queries", "COMBINE-QUERIES", 6, 3, false);
        declareFunction(me, "combine_multiple_queries", "COMBINE-MULTIPLE-QUERIES", 1, 3, false);
        declareFunction(me, "create_formula_from_term", "CREATE-FORMULA-FROM-TERM", 1, 2, false);
        declareFunction(me, "create_formula_from_term_int", "CREATE-FORMULA-FROM-TERM-INT", 1, 1, false);
        declareFunction(me, "clear_predicate_requires_backchainP", "CLEAR-PREDICATE-REQUIRES-BACKCHAIN?", 0, 0, false);
        declareFunction(me, "remove_predicate_requires_backchainP", "REMOVE-PREDICATE-REQUIRES-BACKCHAIN?", 2, 0, false);
        declareFunction(me, "predicate_requires_backchainP_internal", "PREDICATE-REQUIRES-BACKCHAIN?-INTERNAL", 2, 0, false);
        declareFunction(me, "predicate_requires_backchainP", "PREDICATE-REQUIRES-BACKCHAIN?", 2, 0, false);
        declareFunction(me, "clear_predicate_backchain_encouragedP", "CLEAR-PREDICATE-BACKCHAIN-ENCOURAGED?", 0, 0, false);
        declareFunction(me, "remove_predicate_backchain_encouragedP", "REMOVE-PREDICATE-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(me, "predicate_backchain_encouragedP_internal", "PREDICATE-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction(me, "predicate_backchain_encouragedP", "PREDICATE-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(me, "clear_ql_collection_backchain_encouragedP", "CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 0, 0, false);
        declareFunction(me, "remove_ql_collection_backchain_encouragedP", "REMOVE-QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(me, "ql_collection_backchain_encouragedP_internal", "QL-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false);
        declareFunction(me, "ql_collection_backchain_encouragedP", "QL-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(me, "formula_requires_backchainP", "FORMULA-REQUIRES-BACKCHAIN?", 2, 0, false);
        declareFunction(me, "formula_backchain_encouragedP", "FORMULA-BACKCHAIN-ENCOURAGED?", 2, 0, false);
        declareFunction(me, "guess_inference_parameters_for_query", "GUESS-INFERENCE-PARAMETERS-FOR-QUERY", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_query_library_api_file() {
        deflexical("*GET-ONE-LEVEL-QUERY-LIBRARY-IN-XML-FROM-DEFAULT-MT-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*MAX-QL-ANSWERS-TO-PARAPHRASE*", $int$40);
        deflexical("*PREDICATE-REQUIRES-BACKCHAIN?-CACHING-STATE*", NIL);
        deflexical("*PREDICATE-BACKCHAIN-ENCOURAGED?-CACHING-STATE*", NIL);
        deflexical("*QL-COLLECTION-BACKCHAIN-ENCOURAGED?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_query_library_api_file() {
        register_external_symbol(GET_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT);
        register_external_symbol(GET_QUERY_LIBRARY_IN_XML);
        register_external_symbol(GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED);
        register_external_symbol(REMOVE_GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED);
        memoization_state.note_globally_cached_function(GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML_FROM_DEFAULT_MT_CACHED_INT);
        register_external_symbol(GET_ONE_LEVEL_QUERY_LIBRARY_IN_XML);
        memoization_state.note_memoized_function(KE_INTERACTION_FOLDER_LOAD_QUERY_LIBRARY_MEMOIZED);
        register_external_symbol(GET_QUERY_TERM_PROPERTIES);
        register_external_symbol(QL_PROCESS_INFERENCE_ANSWER);
        register_external_symbol(COMBINE_FORMULAS_AT_POSITION);
        register_external_symbol(COMBINE_QUERIES);
        register_external_symbol(COMBINE_MULTIPLE_QUERIES);
        register_external_symbol(CREATE_FORMULA_FROM_TERM);
        memoization_state.note_globally_cached_function($sym62$PREDICATE_REQUIRES_BACKCHAIN_);
        memoization_state.note_globally_cached_function($sym67$PREDICATE_BACKCHAIN_ENCOURAGED_);
        memoization_state.note_globally_cached_function($sym71$QL_COLLECTION_BACKCHAIN_ENCOURAGED_);
        register_external_symbol(GUESS_INFERENCE_PARAMETERS_FOR_QUERY);
        define_test_case_table_int(COMBINE_FORMULAS_AT_POSITION_INT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list83);
        define_test_case_table_int(COMBINE_QUERIES_INT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list85);
        define_test_case_table_int(CREATE_FORMULA_FROM_TERM_INT, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list87);
        return NIL;
    }

    private static SubLObject _constant_83_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?REVASCULARIZATION-PROCEDURE"), reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?REVASCULARIZATION-PROCEDURE"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("and")))))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("Endocarditis-Generic"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(TWO_INTEGER, THREE_INTEGER, ONE_INTEGER), T, reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?REVASCULARIZATION-PROCEDURE"), reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?REVASCULARIZATION-PROCEDURE"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?THING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("Endocarditis-Generic"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?PATIENT"))))))))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INFARCTION"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?INFARCTION"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("and"))))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveRegurgitationSeverity")), makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), makeSymbol("?STORE-OF-INFORMATION"), reader_make_constant_shell(makeString("MitralValve")), makeSymbol("?FIRST-ORDER-COLLECTION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), makeSymbol("?Y")))), list(TWO_INTEGER, THREE_INTEGER), T, reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INFARCTION"), reader_make_constant_shell(makeString("HeartAttack"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?INFARCTION"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("valveRegurgitationSeverity")), makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), makeSymbol("?STORE-OF-INFORMATION"), reader_make_constant_shell(makeString("MitralValve")), makeSymbol("?FIRST-ORDER-COLLECTION")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MANAGEMENT-OR-EVALUATION-EVENT"), makeSymbol("?PATIENT"))))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?X"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell(makeString("fromLocation")), makeSymbol("?EVENT"), makeSymbol("?FROM")), list(reader_make_constant_shell(makeString("toLocation")), makeSymbol("?EVENT"), makeSymbol("?TO")), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("fromLocation")), makeSymbol("?EVENT"), makeSymbol("?FROM")), list(reader_make_constant_shell(makeString("toLocation")), makeSymbol("?EVENT"), makeSymbol("?FROM")))), list(list(list(reader_make_constant_shell(makeString("fromLocation")), makeSymbol("?EVENT"), makeSymbol("?FROM")), list(reader_make_constant_shell(makeString("toLocation")), makeSymbol("?EVENT"), makeSymbol("?TO")), NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("fromLocation")), makeSymbol("?EVENT"), makeSymbol("?FROM")), list(reader_make_constant_shell(makeString("toLocation")), makeSymbol("?X"), makeSymbol("?TO")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?EVENT"), makeSymbol("?LOCATION")), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?EVENT"), makeSymbol("?LOCATION")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?EVENT"), makeSymbol("?LOCATION")), NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), makeSymbol("?LOCATION")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea")))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?EVENT"), makeSymbol("?LOCATION")), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea")))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?EVENT"), makeSymbol("?LOCATION")))), list(list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Murder"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Murder"))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea")))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Murder"))), list(ONE_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Murder")))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))), list(ONE_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))))))), list(list(list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))), list(ONE_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Piracy-AtSea"))))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?E"), makeSymbol("?D")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?E"), makeSymbol("?P"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?X"), makeSymbol("?D")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), makeSymbol("?P")))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TARGET"), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?ATTACK"), makeSymbol("?TARGET"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TARGET"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?X"), makeSymbol("?TARGET"))))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bombing")))))), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?ATTACK"), makeSymbol("?TARGET")), list(ONE_INTEGER, TWO_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ATTACK"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TARGET"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("intendedAttackTargets")), makeSymbol("?ATTACK"), makeSymbol("?TARGET")))))))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))))), list(list(list(reader_make_constant_shell(makeString("and"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), reader_make_constant_shell(makeString("Person"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), reader_make_constant_shell(makeString("Person"))))), list(list(list(reader_make_constant_shell(makeString("not"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), reader_make_constant_shell(makeString("Person"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("not"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), reader_make_constant_shell(makeString("Person"))))), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), reader_make_constant_shell(makeString("Person"))), list(ONE_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?OBJ"), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), reader_make_constant_shell(makeString("Person"))))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("CarBombing")))), list(reader_make_constant_shell(makeString("and"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("and"))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT-1"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT-1"), reader_make_constant_shell(makeString("Bombing")))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT-1"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT-1"), reader_make_constant_shell(makeString("Bombing")))))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT-1"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT-1"), reader_make_constant_shell(makeString("Bombing")))), list(TWO_INTEGER), T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?EVENT-1"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVENT-1"), reader_make_constant_shell(makeString("Bombing"))))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?ATTACK"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("TerroristAttack")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK-1"), reader_make_constant_shell(makeString("TerroristAttack"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?ATTACK"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("TerroristAttack"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK-1"), reader_make_constant_shell(makeString("TerroristAttack"))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Mammal"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Mammal"))))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Fish"))), NIL, T, reader_make_constant_shell(makeString("TerrorismRecommendedWffCheckingMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dog"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Fish"))))), list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), reader_make_constant_shell(makeString("IsolatedMVROperation"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), makeSymbol("?PATIENT")))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("IsolatedAVROperation"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), list(TWO_INTEGER), T, reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), reader_make_constant_shell(makeString("IsolatedMVROperation"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), makeSymbol("?PATIENT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), reader_make_constant_shell(makeString("IsolatedAVROperation"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MITRAL-VALVE-PROCEDURE"), makeSymbol("?PATIENT"))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT-2"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), reader_make_constant_shell(makeString("AortaDissection"))), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?PATIENT-2"))))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("AortaDissection"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?Y")))), NIL, T, reader_make_constant_shell(makeString("MedicalResearchRecommendedWFFCheckingMt"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?PATIENT-2"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING"), reader_make_constant_shell(makeString("AortaDissection"))), list(reader_make_constant_shell(makeString("eventHasDiagnosisOrFinding")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?MEDICAL-DIAGNOSIS-OR-FINDING")), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?MEDICAL-EVALUATION"), makeSymbol("?PATIENT-2")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?THING"), reader_make_constant_shell(makeString("AortaDissection"))), list(reader_make_constant_shell(makeString("patientTreated")), makeSymbol("?THING"), makeSymbol("?PATIENT-2"))))), list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?X")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Person"))), NIL, NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?X"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Person"))))) });
    }

    @Override
    public void declareFunctions() {
        declare_query_library_api_file();
    }

    @Override
    public void initializeVariables() {
        init_query_library_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_query_library_api_file();
    }

    
}

/**
 * Total time: 978 ms
 */
