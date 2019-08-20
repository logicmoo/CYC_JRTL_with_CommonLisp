/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_parser;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      OPENCYC-DIAGNOSTICS
 *  source file: /cyc/top/cycl/owl/opencyc-diagnostics.lisp
 *  created:     2019/07/03 17:38:28
 */
public final class opencyc_diagnostics extends SubLTranslatedFile implements V02 {
    // // Constructor
    private opencyc_diagnostics() {
    }

    public static final SubLFile me = new opencyc_diagnostics();


    // // Definitions
    /**
     * Check some things before doing export. As long as we get no errors, we're good.
     */
    public static final SubLObject perform_pre_opencyc_export_tests() {
        check_opencyc_term_chunks();
        check_opencyc_unlexified_term_handling();
        check_opencyc_wikipedia_url_extent();
        check_opencyc_xml_for_selected_terms();
        return NIL;
    }

    public static final SubLObject check_opencyc_term_chunks() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
                SubLObject _prev_bind_1 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                SubLObject _prev_bind_3 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
                SubLObject _prev_bind_6 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
                SubLObject _prev_bind_7 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                SubLObject _prev_bind_8 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                try {
                    owlification.$owl_use_pretty_stringsP$.bind(T, thread);
                    owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
                    owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                    owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                    owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
                    owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
                    owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
                    owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
                    owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                            Errors.error($str_alt0$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
                        }
                    }
                    {
                        SubLObject chunk = owlification.owl_cyclify_term($$RDFAboutUSSECIDNamespace);
                        SubLObject count = count(owlification.owl_cyclify_predicate($$owlSameAs), chunk, symbol_function(EQUAL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED);
                        if (!THREE_INTEGER.eql(count)) {
                            Errors.error($str_alt4$Wanted_3_owl_SameAs_sentences_for, $$RDFAboutUSSECIDNamespace, count);
                        }
                    }
                    {
                        SubLObject chunk = owlification.owl_cyclify_term($$USCity);
                        SubLObject count = count(owlification.owl_cyclify_predicate($$genls), chunk, symbol_function(EQUAL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED);
                        if (!count.numG(ONE_INTEGER)) {
                            Errors.error($str_alt7$Wanted_multiple___genls_sentences, $$USCity, count);
                        }
                    }
                } finally {
                    owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_8, thread);
                    owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_7, thread);
                    owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_6, thread);
                    owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_5, thread);
                    owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_4, thread);
                    owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_3, thread);
                    owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_2, thread);
                    owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_1, thread);
                    owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_opencyc_unlexified_term_handling() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unlexified_count = ZERO_INTEGER;
                SubLObject lex = NIL;
                SubLObject bad = NIL;
                SubLObject message = $str_alt8$Checking_unlexified_FORTs___;
                SubLObject total = forts.fort_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(message);
                        {
                            SubLObject rest = NIL;
                            for (rest = forts.do_forts_tables(); !((NIL != lex) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject table_var = rest.first();
                                    if (NIL == id_index.do_id_index_empty_p(table_var, $SKIP)) {
                                        {
                                            SubLObject id = id_index.do_id_index_next_id(table_var, T, NIL, NIL);
                                            SubLObject state_var = id_index.do_id_index_next_state(table_var, T, id, NIL);
                                            SubLObject fort = NIL;
                                            while ((NIL != id) && (NIL == lex)) {
                                                fort = id_index.do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                if (NIL != id_index.do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    utilities_macros.note_percent_progress(sofar, total);
                                                    if (NIL == kb_mapping_utilities.some_pred_value_in_any_mt(fort, $$prettyString_Canonical, UNPROVIDED, UNPROVIDED)) {
                                                        unlexified_count = add(unlexified_count, ONE_INTEGER);
                                                        {
                                                            SubLObject phrase = owlification.owl_get_generated_phrase(fort);
                                                            if (NIL != find(CHAR_space, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                lex = phrase;
                                                            } else
                                                                if (NIL != find_if(UPPER_CASE_P, phrase, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED)) {
                                                                    bad = list(fort, phrase);
                                                                }

                                                        }
                                                    }
                                                }
                                                id = id_index.do_id_index_next_id(table_var, T, id, state_var);
                                                state_var = id_index.do_id_index_next_state(table_var, T, id, state_var);
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                if (unlexified_count.isZero()) {
                    format(T, $str_alt12$No_unlexified_FORTs_);
                } else
                    if (NIL != lex) {
                        format(T, $str_alt13$Found_good_phrase_after__D_unlexi, unlexified_count);
                    } else {
                        Errors.error($str_alt14$Got_bad_phrase_for_unlexified_ter, bad);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject check_opencyc_wikipedia_url_extent() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (!kb_indexing.num_predicate_extent_index($$wikipediaArticleURL, UNPROVIDED).isPositive()) {
                        Errors.error($str_alt18$No___wikipediaArticleURL_extent_);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject check_opencyc_xml_for_selected_terms() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xml = NIL;
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            SubLObject _prev_bind_1 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                            SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                            SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                            SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
                            SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
                            SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                            SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(stream, thread);
                                owlification.$owl_use_pretty_stringsP$.bind(T, thread);
                                owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                                owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                                owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
                                owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
                                owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
                                owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                                        Errors.error($str_alt0$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
                                    }
                                }
                                owl_cycl_to_xml.owl_export_term_chunk($$Witbrock, UNPROVIDED);
                            } finally {
                                owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_9, thread);
                                owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_8, thread);
                                owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_7, thread);
                                owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_6, thread);
                                owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_5, thread);
                                owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_4, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_3, thread);
                                owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_2, thread);
                                owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_1, thread);
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        xml = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = list(new SubLObject[]{ rdf_utilities.rdfs_name($$$label), $$$prettyString, $str_alt23$cycAnnot_label, $str_alt24$cycAnnot_externalID, $$$wikipediaArticleURL, rdf_utilities.rdf_name($$$type), $$$languageSpoken, $$$titleOfPerson, owl_utilities.owl_name($$$sameAs) });
                    SubLObject tag = NIL;
                    for (tag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tag = cdolist_list_var.first()) {
                        if (NIL == list_utilities.lengthG(string_utilities.search_all(tag, xml, symbol_function(EQUAL), UNPROVIDED), ZERO_INTEGER, UNPROVIDED)) {
                            Errors.error($str_alt20$No__A_value_for_Witbrock__Got__A, tag, xml);
                        }
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            SubLObject _prev_bind_1 = owlification.$owl_use_pretty_stringsP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                            SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                            SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                            SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding(thread);
                            SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding(thread);
                            SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                            SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(stream, thread);
                                owlification.$owl_use_pretty_stringsP$.bind(T, thread);
                                owlification.$owl_use_external_ids_for_namesP$.bind(T, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                                owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                                owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(T, thread);
                                owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind(T, thread);
                                owlification.$owl_export_from_opencyc_kbP$.bind(T, thread);
                                owlification.$owl_use_external_ids_for_namesP$.bind(NIL, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.bind(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == numeric_date_utilities.universal_date_p(owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread))) {
                                        Errors.error($str_alt0$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread));
                                    }
                                }
                                owl_cycl_to_xml.owl_export_term_chunk($$Dog, UNPROVIDED);
                            } finally {
                                owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_9, thread);
                                owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_8, thread);
                                owlification.$owl_export_from_opencyc_kbP$.rebind(_prev_bind_7, thread);
                                owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind(_prev_bind_6, thread);
                                owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_5, thread);
                                owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_4, thread);
                                owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_3, thread);
                                owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_2, thread);
                                owlification.$owl_use_pretty_stringsP$.rebind(_prev_bind_1, thread);
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        xml = get_output_stream_string(stream);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                close(stream, UNPROVIDED);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = list(new SubLObject[]{ rdf_utilities.rdfs_name($$$label), $$$prettyString, $str_alt23$cycAnnot_label, $str_alt24$cycAnnot_externalID, rdf_utilities.rdfs_name($$$comment), $$$broaderTerm, rdf_utilities.rdfs_name($$$subClassOf), $str_alt35$facets_Generic, $$$seeAlsoURI, $$$wikipediaArticleURL, rdf_utilities.rdf_name($$$type), owl_utilities.owl_name($$$sameAs) });
                    SubLObject tag = NIL;
                    for (tag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tag = cdolist_list_var.first()) {
                        if (NIL == list_utilities.lengthG(string_utilities.search_all(tag, xml, symbol_function(EQUAL), UNPROVIDED), ZERO_INTEGER, UNPROVIDED)) {
                            Errors.error($str_alt31$No__A_value_for_Dog__Got__A, tag, xml);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $opencyc_graph$ = makeSymbol("*OPENCYC-GRAPH*");

    // deflexical
    private static final SubLSymbol $opencyc_source_file$ = makeSymbol("*OPENCYC-SOURCE-FILE*");

    public static final SubLObject load_opencyc_graph(SubLObject owl_file) {
        SubLTrampolineFile.enforceType(owl_file, $sym37$FILE_EXISTS_);
        $opencyc_graph$.setGlobalValue(rdf_parser.parse_rdfXxml_file(owl_file, UNPROVIDED));
        $opencyc_source_file$.setGlobalValue(owl_file);
        return $opencyc_graph$.getGlobalValue();
    }

    public static final SubLObject find_opencyc_root_classes() {
        return owl_utilities.rdf_graph_root_classes($opencyc_graph$.getGlobalValue());
    }

    public static final SubLObject count_opencyc_outgoing_links() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject list_var = rdf_graph.rdf_graph_find_predicate_triples($opencyc_graph$.getGlobalValue(), owl_utilities.owl_expanded_name($$$sameAs));
                utilities_macros.$progress_note$.setDynamicValue($str_alt38$Counting_outgoing_links___, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject triple = NIL;
                            for (triple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , triple = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != outgoing_same_as_tripleP(triple)) {
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject count_opencyc_non_same_as_triples() {
        return subtract(rdf_graph.rdf_graph_triple_count($opencyc_graph$.getGlobalValue()), rdf_graph.rdf_graph_predicate_triple_count($opencyc_graph$.getGlobalValue(), owl_utilities.owl_expanded_name($$$sameAs)));
    }

    public static final SubLObject outgoing_same_as_tripleP(SubLObject triple) {
        if (!owl_utilities.owl_expanded_name($$$sameAs).equal(rdf_uri.rdf_uri_utf8_string(rdf_triple.rdf_triple_predicate(triple)))) {
            Errors.error($str_alt39$_S_is_not_an_owl_sameAs_triple, triple);
        }
        {
            SubLObject uri = rdf_triple.rdf_triple_object(triple);
            return makeBoolean((NIL != rdf_uri.rdf_uri_p(uri)) && (!((NIL != rdf_uri.rdf_uri_starts_withP(uri, $str_alt40$http___sw_cyc_com_)) || (NIL != rdf_uri.rdf_uri_starts_withP(uri, $str_alt41$http___sw_opencyc_org_)))));
        }
    }

    public static final SubLObject categorize_opencyc_same_as_triples() {
        {
            SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples($opencyc_graph$.getGlobalValue(), owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                {
                    SubLObject uri = rdf_triple.rdf_triple_object(triple);
                    if (NIL != rdf_uri.rdf_uri_p(uri)) {
                        dictionary_utilities.dictionary_increment(dict, rdf_uri.rdf_uri_base_uri(uri), UNPROVIDED);
                    }
                }
            }
            return dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym42$_));
        }
    }

    public static final SubLObject rank_opencyc_predicates() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator($opencyc_graph$.getGlobalValue());
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject triple = iteration.iteration_next(iterator_var);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            dictionary_utilities.dictionary_increment(dict, rdf_triple.rdf_triple_predicate(triple), UNPROVIDED);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym42$_));
            }
        }
    }

    public static final SubLObject rank_opencyc_classes() {
        {
            SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples($opencyc_graph$.getGlobalValue(), rdf_utilities.rdf_expanded_name($$$type));
            SubLObject triple = NIL;
            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_increment(dict, rdf_triple.rdf_triple_object(triple), UNPROVIDED);
            }
            return dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym42$_));
        }
    }

    // deflexical
    private static final SubLSymbol $opencyc_classes_to_count$ = makeSymbol("*OPENCYC-CLASSES-TO-COUNT*");

    public static final SubLObject count_opencyc_instances_for_selected_classes() {
        {
            SubLObject cdolist_list_var = $opencyc_classes_to_count$.getGlobalValue();
            SubLObject v_class = NIL;
            for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                format(T, $str_alt44$___S___S___S_unique___, new SubLObject[]{ v_class, rdf_graph.rdf_graph_count_instances($opencyc_graph$.getGlobalValue(), v_class), length(rdf_graph.rdf_graph_instances($opencyc_graph$.getGlobalValue(), v_class, UNPROVIDED)) });
            }
        }
        return NIL;
    }

    public static final SubLObject do_rdf_graph_random_triples(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject triple = NIL;
                    SubLObject v_graph = NIL;
                    SubLObject predicate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    triple = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    v_graph = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    predicate = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt45);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt45);
                            if (NIL == member(current_1, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt45);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject all_triples = $sym49$ALL_TRIPLES;
                                SubLObject done_triples = $sym50$DONE_TRIPLES;
                                SubLObject doneP = $sym51$DONE_;
                                return list(CLET, list(list(all_triples, list(RDF_GRAPH_FIND_PREDICATE_TRIPLES, v_graph, predicate)), bq_cons(done_triples, $list_alt54), list(doneP, done)), list(UNTIL, doneP, list(CLET, list(list(triple, list(RANDOM_ELEMENT, all_triples))), listS(PUNLESS, list(SET_ADD, triple, done_triples), append(body, list(list(PWHEN, list(COR, done, list($sym61$__, list(SET_SIZE, done_triples), list(LENGTH, all_triples))), listS(CSETQ, doneP, $list_alt65))))))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject check_dbpedia_links(SubLObject n) {
        {
            SubLObject done_count = ZERO_INTEGER;
            SubLObject bad_count = ZERO_INTEGER;
            SubLObject doneP = numGE(done_count, n);
            SubLObject all_triples = rdf_graph.rdf_graph_find_predicate_triples($opencyc_graph$.getGlobalValue(), owl_utilities.owl_expanded_name($$$sameAs));
            SubLObject done_triples = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject doneP_2 = doneP;
            while (NIL == doneP_2) {
                {
                    SubLObject triple = list_utilities.random_element(all_triples);
                    if (NIL == set.set_add(triple, done_triples)) {
                        {
                            SubLObject subject = rdf_triple.rdf_triple_subject(triple);
                            SubLObject v_object = rdf_triple.rdf_triple_object(triple);
                            if ((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_starts_withP(v_object, $str_alt66$http___dbpedia_org_resource_))) {
                                format_nil.force_format(T, $str_alt67$___D__D__S_____S__, bad_count, done_count, rdf_graph.rdf_graph_get_label($opencyc_graph$.getGlobalValue(), subject), string_utilities.pre_remove(rdf_uri.rdf_uri_utf8_string(v_object), $str_alt66$http___dbpedia_org_resource_, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                done_count = add(done_count, ONE_INTEGER);
                                if (NIL == string_utilities.empty_string_p(read_line(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    bad_count = add(bad_count, ONE_INTEGER);
                                }
                                doneP = numGE(done_count, n);
                            }
                        }
                        if ((NIL != doneP) || set.set_size(done_triples).numGE(length(all_triples))) {
                            doneP_2 = T;
                        }
                    }
                }
            } 
            return bad_count;
        }
    }

    public static final SubLObject dump_opencyc_persons(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_file = cconcatenate(directory, NIL != string_utilities.ends_with(directory, $str_alt68$_, UNPROVIDED) ? ((SubLObject) ($str_alt69$persons_txt)) : $str_alt70$_persons_txt);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt72$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject out_stream = stream;
                        SubLObject list_var = rdf_graph.rdf_graph_instances($opencyc_graph$.getGlobalValue(), $$Person, T);
                        utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject person = NIL;
                                    for (person = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , person = csome_list_var.first()) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        princ(rdf_graph.rdf_graph_get_label($opencyc_graph$.getGlobalValue(), person), out_stream);
                                        terpri(out_stream);
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return output_file;
            }
        }
    }

    public static final SubLObject dump_opencyc_places(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_file = cconcatenate(directory, NIL != string_utilities.ends_with(directory, $str_alt68$_, UNPROVIDED) ? ((SubLObject) ($str_alt75$places_txt)) : $str_alt76$_places_txt);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt72$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject out_stream = stream;
                        SubLObject list_var = rdf_graph.rdf_graph_instances($opencyc_graph$.getGlobalValue(), $$Place, T);
                        utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject place = NIL;
                                    for (place = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , place = csome_list_var.first()) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        princ(rdf_graph.rdf_graph_get_label($opencyc_graph$.getGlobalValue(), place), out_stream);
                                        terpri(out_stream);
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return output_file;
            }
        }
    }

    public static final SubLObject generate_crs_link_bundles(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject comment = $str_alt78$Provided_by_David_Baxter_at_Cycor;
                SubLObject owl_opencyc_base_uri_dated = owl_uris_and_prefixes.owl_opencyc_base_uri(UNPROVIDED);
                SubLObject owl_opencyc_base_uri = owl_uris_and_prefixes.owl_opencyc_base_uri(NIL);
                SubLObject output_file = cconcatenate(directory, $str_alt79$crs_bundles_tsv);
                SubLObject previous_base_uris = NIL;
                {
                    SubLObject cdolist_list_var = owl_uris_and_prefixes.previous_owl_export_version_dates();
                    SubLObject previous_date = NIL;
                    for (previous_date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , previous_date = cdolist_list_var.first()) {
                        previous_base_uris = cons(owl_uris_and_prefixes.owl_opencyc_base_uri(previous_date), previous_base_uris);
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt72$Unable_to_open__S, output_file);
                        }
                        {
                            SubLObject out_stream = stream;
                            SubLObject file_var = cconcatenate(directory, $str_alt80$fort_owl_names_csv);
                            SubLObject stream_3 = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream_3 = compatibility.open_text(file_var, $INPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream_3.isStream()) {
                                    Errors.error($str_alt72$Unable_to_open__S, file_var);
                                }
                                {
                                    SubLObject stream_var = stream_3;
                                    if (stream_var.isStream()) {
                                        {
                                            SubLObject stream_var_4 = stream_var;
                                            SubLObject line_number_var = NIL;
                                            SubLObject line = NIL;
                                            for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_4, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_4, NIL, NIL, UNPROVIDED)) {
                                                {
                                                    SubLObject tokenized_line = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str_alt82$_, $str_alt82$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                                                    SubLObject datum = Mapping.mapcar(READ_FROM_STRING, tokenized_line);
                                                    SubLObject current = datum;
                                                    SubLObject external_id = NIL;
                                                    SubLObject human_readable_name = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    external_id = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    human_readable_name = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        {
                                                            SubLObject canonical_uri = cconcatenate($str_alt85$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(owl_opencyc_base_uri), format_nil.format_nil_a_no_copy(external_id), $str_alt86$_ });
                                                            format(out_stream, $str_alt87$_A_A__A_A__A_A_AN__, new SubLObject[]{ canonical_uri, CHAR_tab, owl_opencyc_base_uri_dated, human_readable_name, CHAR_tab, comment, CHAR_tab });
                                                            format(out_stream, $str_alt87$_A_A__A_A__A_A_AN__, new SubLObject[]{ canonical_uri, CHAR_tab, owl_opencyc_base_uri_dated, external_id, CHAR_tab, comment, CHAR_tab });
                                                            {
                                                                SubLObject cdolist_list_var = previous_base_uris;
                                                                SubLObject deprecated_base_uri = NIL;
                                                                for (deprecated_base_uri = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deprecated_base_uri = cdolist_list_var.first()) {
                                                                    format(out_stream, $str_alt88$_A_A__A_A__A_A_AY__, new SubLObject[]{ canonical_uri, CHAR_tab, deprecated_base_uri, human_readable_name, CHAR_tab, comment, CHAR_tab });
                                                                    format(out_stream, $str_alt88$_A_A__A_A__A_A_AY__, new SubLObject[]{ canonical_uri, CHAR_tab, deprecated_base_uri, external_id, CHAR_tab, comment, CHAR_tab });
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt84);
                                                    }
                                                    terpri(out_stream);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_3.isStream()) {
                                            close(stream_3, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return output_file;
            }
        }
    }

    public static final SubLObject generate_crs_link_bundles_new(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject comment = $str_alt78$Provided_by_David_Baxter_at_Cycor;
                SubLObject owl_opencyc_base_uri_dated = owl_uris_and_prefixes.owl_opencyc_base_uri(UNPROVIDED);
                SubLObject owl_opencyc_base_uri = owl_uris_and_prefixes.owl_opencyc_base_uri(NIL);
                SubLObject output_file = cconcatenate(directory, $str_alt89$crs_bundles_ternary_tsv);
                SubLObject dep_file = cconcatenate(directory, $str_alt90$deprecated_uris_txt);
                SubLObject previous_base_uris = NIL;
                {
                    SubLObject cdolist_list_var = owl_uris_and_prefixes.previous_owl_export_version_dates();
                    SubLObject previous_date = NIL;
                    for (previous_date = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , previous_date = cdolist_list_var.first()) {
                        previous_base_uris = cons(owl_uris_and_prefixes.owl_opencyc_base_uri(previous_date), previous_base_uris);
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt72$Unable_to_open__S, output_file);
                        }
                        {
                            SubLObject out_stream = stream;
                            SubLObject stream_5 = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream_5 = compatibility.open_text(dep_file, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream_5.isStream()) {
                                    Errors.error($str_alt72$Unable_to_open__S, dep_file);
                                }
                                {
                                    SubLObject dep_out_stream = stream_5;
                                    SubLObject file_var = cconcatenate(directory, $str_alt80$fort_owl_names_csv);
                                    SubLObject stream_6 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_6 = compatibility.open_text(file_var, $INPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if (!stream_6.isStream()) {
                                            Errors.error($str_alt72$Unable_to_open__S, file_var);
                                        }
                                        {
                                            SubLObject stream_var = stream_6;
                                            if (stream_var.isStream()) {
                                                {
                                                    SubLObject stream_var_7 = stream_var;
                                                    SubLObject line_number_var = NIL;
                                                    SubLObject line = NIL;
                                                    for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_7, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_7, NIL, NIL, UNPROVIDED)) {
                                                        {
                                                            SubLObject tokenized_line = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str_alt82$_, $str_alt82$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                                                            SubLObject datum = Mapping.mapcar(READ_FROM_STRING, tokenized_line);
                                                            SubLObject current = datum;
                                                            SubLObject external_id = NIL;
                                                            SubLObject human_readable_name = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt84);
                                                            external_id = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt84);
                                                            human_readable_name = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject canonical_uri = cconcatenate($str_alt85$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(owl_opencyc_base_uri), format_nil.format_nil_a_no_copy(external_id), $str_alt86$_ });
                                                                    format(out_stream, $str_alt91$_A_A__A_A__A_A__, new SubLObject[]{ canonical_uri, CHAR_tab, owl_opencyc_base_uri_dated, human_readable_name, CHAR_tab, comment });
                                                                    format(out_stream, $str_alt91$_A_A__A_A__A_A__, new SubLObject[]{ canonical_uri, CHAR_tab, owl_opencyc_base_uri_dated, external_id, CHAR_tab, comment });
                                                                    {
                                                                        SubLObject cdolist_list_var = previous_base_uris;
                                                                        SubLObject deprecated_base_uri = NIL;
                                                                        for (deprecated_base_uri = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deprecated_base_uri = cdolist_list_var.first()) {
                                                                            format(out_stream, $str_alt91$_A_A__A_A__A_A__, new SubLObject[]{ canonical_uri, CHAR_tab, deprecated_base_uri, human_readable_name, CHAR_tab, comment });
                                                                            format(out_stream, $str_alt91$_A_A__A_A__A_A__, new SubLObject[]{ canonical_uri, CHAR_tab, deprecated_base_uri, external_id, CHAR_tab, comment });
                                                                            format(dep_out_stream, $str_alt92$__A_A___, deprecated_base_uri, human_readable_name);
                                                                            format(dep_out_stream, $str_alt92$__A_A___, deprecated_base_uri, external_id);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt84);
                                                            }
                                                            terpri(out_stream);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_6.isStream()) {
                                                    close(stream_6, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_5.isStream()) {
                                            close(stream_5, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return output_file;
            }
        }
    }

    public static final SubLObject declare_opencyc_diagnostics_file() {
        declareFunction("perform_pre_opencyc_export_tests", "PERFORM-PRE-OPENCYC-EXPORT-TESTS", 0, 0, false);
        declareFunction("check_opencyc_term_chunks", "CHECK-OPENCYC-TERM-CHUNKS", 0, 0, false);
        declareFunction("check_opencyc_unlexified_term_handling", "CHECK-OPENCYC-UNLEXIFIED-TERM-HANDLING", 0, 0, false);
        declareFunction("check_opencyc_wikipedia_url_extent", "CHECK-OPENCYC-WIKIPEDIA-URL-EXTENT", 0, 0, false);
        declareFunction("check_opencyc_xml_for_selected_terms", "CHECK-OPENCYC-XML-FOR-SELECTED-TERMS", 0, 0, false);
        declareFunction("load_opencyc_graph", "LOAD-OPENCYC-GRAPH", 1, 0, false);
        declareFunction("find_opencyc_root_classes", "FIND-OPENCYC-ROOT-CLASSES", 0, 0, false);
        declareFunction("count_opencyc_outgoing_links", "COUNT-OPENCYC-OUTGOING-LINKS", 0, 0, false);
        declareFunction("count_opencyc_non_same_as_triples", "COUNT-OPENCYC-NON-SAME-AS-TRIPLES", 0, 0, false);
        declareFunction("outgoing_same_as_tripleP", "OUTGOING-SAME-AS-TRIPLE?", 1, 0, false);
        declareFunction("categorize_opencyc_same_as_triples", "CATEGORIZE-OPENCYC-SAME-AS-TRIPLES", 0, 0, false);
        declareFunction("rank_opencyc_predicates", "RANK-OPENCYC-PREDICATES", 0, 0, false);
        declareFunction("rank_opencyc_classes", "RANK-OPENCYC-CLASSES", 0, 0, false);
        declareFunction("count_opencyc_instances_for_selected_classes", "COUNT-OPENCYC-INSTANCES-FOR-SELECTED-CLASSES", 0, 0, false);
        declareMacro("do_rdf_graph_random_triples", "DO-RDF-GRAPH-RANDOM-TRIPLES");
        declareFunction("check_dbpedia_links", "CHECK-DBPEDIA-LINKS", 1, 0, false);
        declareFunction("dump_opencyc_persons", "DUMP-OPENCYC-PERSONS", 1, 0, false);
        declareFunction("dump_opencyc_places", "DUMP-OPENCYC-PLACES", 1, 0, false);
        declareFunction("generate_crs_link_bundles", "GENERATE-CRS-LINK-BUNDLES", 1, 0, false);
        declareFunction("generate_crs_link_bundles_new", "GENERATE-CRS-LINK-BUNDLES-NEW", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_opencyc_diagnostics_file() {
        deflexical("*OPENCYC-GRAPH*", misc_utilities.uninitialized());
        deflexical("*OPENCYC-SOURCE-FILE*", misc_utilities.uninitialized());
        deflexical("*OPENCYC-CLASSES-TO-COUNT*", $list_alt43);
        return NIL;
    }

    public static final SubLObject setup_opencyc_diagnostics_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$Human_readable_OWL_export_require = makeString("Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S");

    public static final SubLObject $$RDFAboutUSSECIDNamespace = constant_handles.reader_make_constant_shell(makeString("RDFAboutUSSECIDNamespace"));

    public static final SubLObject $$owlSameAs = constant_handles.reader_make_constant_shell(makeString("owlSameAs"));



    static private final SubLString $str_alt4$Wanted_3_owl_SameAs_sentences_for = makeString("Wanted 3 owl:SameAs sentences for ~S, got ~D.");

    public static final SubLObject $$USCity = constant_handles.reader_make_constant_shell(makeString("USCity"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLString $str_alt7$Wanted_multiple___genls_sentences = makeString("Wanted multiple #$genls sentences for ~S, got ~D.");

    static private final SubLString $str_alt8$Checking_unlexified_FORTs___ = makeString("Checking unlexified FORTs...");



    public static final SubLObject $$prettyString_Canonical = constant_handles.reader_make_constant_shell(makeString("prettyString-Canonical"));



    static private final SubLString $str_alt12$No_unlexified_FORTs_ = makeString("No unlexified FORTs.");

    static private final SubLString $str_alt13$Found_good_phrase_after__D_unlexi = makeString("Found good phrase after ~D unlexified FORTs.");

    static private final SubLString $str_alt14$Got_bad_phrase_for_unlexified_ter = makeString("Got bad phrase for unlexified terms, including ~S");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$wikipediaArticleURL = constant_handles.reader_make_constant_shell(makeString("wikipediaArticleURL"));

    static private final SubLString $str_alt18$No___wikipediaArticleURL_extent_ = makeString("No #$wikipediaArticleURL extent.");

    public static final SubLObject $$Witbrock = constant_handles.reader_make_constant_shell(makeString("Witbrock"));

    static private final SubLString $str_alt20$No__A_value_for_Witbrock__Got__A = makeString("No ~A value for Witbrock. Got ~A");

    static private final SubLString $$$label = makeString("label");

    static private final SubLString $$$prettyString = makeString("prettyString");

    static private final SubLString $str_alt23$cycAnnot_label = makeString("cycAnnot:label");

    static private final SubLString $str_alt24$cycAnnot_externalID = makeString("cycAnnot:externalID");

    static private final SubLString $$$wikipediaArticleURL = makeString("wikipediaArticleURL");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $$$languageSpoken = makeString("languageSpoken");

    static private final SubLString $$$titleOfPerson = makeString("titleOfPerson");

    static private final SubLString $$$sameAs = makeString("sameAs");

    public static final SubLObject $$Dog = constant_handles.reader_make_constant_shell(makeString("Dog"));

    static private final SubLString $str_alt31$No__A_value_for_Dog__Got__A = makeString("No ~A value for Dog. Got ~A");

    static private final SubLString $$$comment = makeString("comment");

    static private final SubLString $$$broaderTerm = makeString("broaderTerm");

    static private final SubLString $$$subClassOf = makeString("subClassOf");

    static private final SubLString $str_alt35$facets_Generic = makeString("facets_Generic");

    static private final SubLString $$$seeAlsoURI = makeString("seeAlsoURI");

    static private final SubLSymbol $sym37$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    static private final SubLString $str_alt38$Counting_outgoing_links___ = makeString("Counting outgoing links...");

    static private final SubLString $str_alt39$_S_is_not_an_owl_sameAs_triple = makeString("~S is not an owl:sameAs triple");

    static private final SubLString $str_alt40$http___sw_cyc_com_ = makeString("http://sw.cyc.com/");

    static private final SubLString $str_alt41$http___sw_opencyc_org_ = makeString("http://sw.opencyc.org/");

    static private final SubLSymbol $sym42$_ = makeSymbol(">");

    static private final SubLList $list_alt43 = list(constant_handles.reader_make_constant_shell(makeString("Place")), constant_handles.reader_make_constant_shell(makeString("Organization")), constant_handles.reader_make_constant_shell(makeString("Predicate")), constant_handles.reader_make_constant_shell(makeString("BusinessRelatedThing")), constant_handles.reader_make_constant_shell(makeString("Person")));

    static private final SubLString $str_alt44$___S___S___S_unique___ = makeString("~&~S: ~S (~S unique)~%");

    static private final SubLList $list_alt45 = list(list(makeSymbol("TRIPLE"), makeSymbol("GRAPH"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt46 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    static private final SubLSymbol $sym49$ALL_TRIPLES = makeUninternedSymbol("ALL-TRIPLES");

    static private final SubLSymbol $sym50$DONE_TRIPLES = makeUninternedSymbol("DONE-TRIPLES");

    static private final SubLSymbol $sym51$DONE_ = makeUninternedSymbol("DONE?");



    private static final SubLSymbol RDF_GRAPH_FIND_PREDICATE_TRIPLES = makeSymbol("RDF-GRAPH-FIND-PREDICATE-TRIPLES");

    static private final SubLList $list_alt54 = list(list(makeSymbol("NEW-SET")));



    private static final SubLSymbol RANDOM_ELEMENT = makeSymbol("RANDOM-ELEMENT");









    static private final SubLSymbol $sym61$__ = makeSymbol(">=");

    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");





    static private final SubLList $list_alt65 = list(T);

    static private final SubLString $str_alt66$http___dbpedia_org_resource_ = makeString("http://dbpedia.org/resource/");

    static private final SubLString $str_alt67$___D__D__S_____S__ = makeString("~&~D/~D ~S -> ~S~%");

    static private final SubLString $str_alt68$_ = makeString("/");

    static private final SubLString $str_alt69$persons_txt = makeString("persons.txt");

    static private final SubLString $str_alt70$_persons_txt = makeString("/persons.txt");



    static private final SubLString $str_alt72$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));

    static private final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLString $str_alt75$places_txt = makeString("places.txt");

    static private final SubLString $str_alt76$_places_txt = makeString("/places.txt");

    public static final SubLObject $$Place = constant_handles.reader_make_constant_shell(makeString("Place"));

    static private final SubLString $str_alt78$Provided_by_David_Baxter_at_Cycor = makeString("Provided by David Baxter at Cycorp");

    static private final SubLString $str_alt79$crs_bundles_tsv = makeString("crs-bundles.tsv");

    static private final SubLString $str_alt80$fort_owl_names_csv = makeString("fort-owl-names.csv");



    static private final SubLString $str_alt82$_ = makeString("\"");



    static private final SubLList $list_alt84 = list(makeSymbol("EXTERNAL-ID"), makeSymbol("HUMAN-READABLE-NAME"));

    static private final SubLString $str_alt85$_ = makeString("<");

    static private final SubLString $str_alt86$_ = makeString(">");

    static private final SubLString $str_alt87$_A_A__A_A__A_A_AN__ = makeString("~A~A<~A~A>~A~A~AN~%");

    static private final SubLString $str_alt88$_A_A__A_A__A_A_AY__ = makeString("~A~A<~A~A>~A~A~AY~%");

    static private final SubLString $str_alt89$crs_bundles_ternary_tsv = makeString("crs-bundles-ternary.tsv");

    static private final SubLString $str_alt90$deprecated_uris_txt = makeString("deprecated-uris.txt");

    static private final SubLString $str_alt91$_A_A__A_A__A_A__ = makeString("~A~A<~A~A>~A~A~%");

    static private final SubLString $str_alt92$__A_A___ = makeString("<~A~A>~%");

    // // Initializers
    public void declareFunctions() {
        declare_opencyc_diagnostics_file();
    }

    public void initializeVariables() {
        init_opencyc_diagnostics_file();
    }

    public void runTopLevelForms() {
        setup_opencyc_diagnostics_file();
    }
}

