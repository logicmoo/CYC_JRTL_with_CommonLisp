/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_term;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.owl_opencyc_versioned_uri_for_fort;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_cyc_string;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_matchesP;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_p;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.seventh;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-UTILITIES
 * source file: /cyc/top/cycl/rdf/rdf-utilities.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject pretty_print_subject_triples(SubLObject v_graph, SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, uri, UNPROVIDED);
                if (NIL == list_utilities.empty_list_p(triples)) {
                    {
                        SubLObject grouped = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = triples;
                            SubLObject triple = NIL;
                            for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                                dictionary_utilities.dictionary_push(grouped, rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                            }
                        }
                        print(rdf_triple.rdf_triple_subject(triples.first()), UNPROVIDED);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(grouped));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject objects = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    format(T, $str_alt85$_____S__, predicate);
                                    {
                                        SubLObject cdolist_list_var = objects;
                                        SubLObject v_object = NIL;
                                        for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                                            format(T, $str_alt86$_______S__, v_object);
                                        }
                                    }
                                    terpri(UNPROVIDED);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLFile me = new rdf_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_utilities";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdf_namespace$ = makeSymbol("*RDF-NAMESPACE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $xsd_namespace$ = makeSymbol("*XSD-NAMESPACE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdfs_namespace$ = makeSymbol("*RDFS-NAMESPACE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $skos_core_namespace$ = makeSymbol("*SKOS-CORE-NAMESPACE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $foaf_namespace$ = makeSymbol("*FOAF-NAMESPACE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$http___www_w3_org_1999_02_22_rdf_ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");

    private static final SubLSymbol RDF_EXPANDED_NAME = makeSymbol("RDF-EXPANDED-NAME");

    public static final SubLSymbol $rdf_expanded_name_caching_state$ = makeSymbol("*RDF-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol RDF_NAME = makeSymbol("RDF-NAME");

    private static final SubLString $str4$rdf_ = makeString("rdf:");

    private static final SubLSymbol $rdf_name_caching_state$ = makeSymbol("*RDF-NAME-CACHING-STATE*");

    private static final SubLString $str6$http___www_w3_org_2001_XMLSchema_ = makeString("http://www.w3.org/2001/XMLSchema#");

    private static final SubLSymbol XSD_EXPANDED_NAME = makeSymbol("XSD-EXPANDED-NAME");

    private static final SubLSymbol $xsd_expanded_name_caching_state$ = makeSymbol("*XSD-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol XSD_NAME = makeSymbol("XSD-NAME");

    private static final SubLString $str10$xsd_ = makeString("xsd:");

    private static final SubLSymbol $xsd_name_caching_state$ = makeSymbol("*XSD-NAME-CACHING-STATE*");

    private static final SubLString $str12$http___www_w3_org_2000_01_rdf_sch = makeString("http://www.w3.org/2000/01/rdf-schema#");

    private static final SubLSymbol RDFS_EXPANDED_NAME = makeSymbol("RDFS-EXPANDED-NAME");

    private static final SubLSymbol $rdfs_expanded_name_caching_state$ = makeSymbol("*RDFS-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol RDFS_NAME = makeSymbol("RDFS-NAME");

    private static final SubLString $str16$rdfs_ = makeString("rdfs:");

    private static final SubLSymbol $rdfs_name_caching_state$ = makeSymbol("*RDFS-NAME-CACHING-STATE*");

    private static final SubLString $str18$http___www_w3_org_2004_02_skos_co = makeString("http://www.w3.org/2004/02/skos/core#");

    private static final SubLSymbol SKOS_EXPANDED_NAME = makeSymbol("SKOS-EXPANDED-NAME");

    private static final SubLSymbol $skos_expanded_name_caching_state$ = makeSymbol("*SKOS-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol SKOS_NAME = makeSymbol("SKOS-NAME");

    private static final SubLString $str22$skos_ = makeString("skos:");

    private static final SubLSymbol $skos_name_caching_state$ = makeSymbol("*SKOS-NAME-CACHING-STATE*");

    private static final SubLString $str24$http___xmlns_com_foaf_0_1_ = makeString("http://xmlns.com/foaf/0.1/");

    private static final SubLSymbol FOAF_EXPANDED_NAME = makeSymbol("FOAF-EXPANDED-NAME");

    private static final SubLSymbol $foaf_expanded_name_caching_state$ = makeSymbol("*FOAF-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLSymbol FOAF_NAME = makeSymbol("FOAF-NAME");

    private static final SubLString $str28$foaf_ = makeString("foaf:");

    private static final SubLSymbol $foaf_name_caching_state$ = makeSymbol("*FOAF-NAME-CACHING-STATE*");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$prefLabel = makeString("prefLabel");

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $$$altLabel = makeString("altLabel");



    private static final SubLSymbol RDF_STANDARD_PREFIX_FOR_NAMESPACE = makeSymbol("RDF-STANDARD-PREFIX-FOR-NAMESPACE");







    private static final SubLSymbol $rdf_standard_prefix_for_namespace_caching_state$ = makeSymbol("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*");

    private static final SubLString $str43$xmlns_ = makeString("xmlns:");

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLSymbol $sym45$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str46$Can_t_find_or_create_term_for__S = makeString("Can't find or create term for ~S");



    private static final SubLString $$$type = makeString("type");



    private static final SubLSymbol $sym50$_TERM = makeSymbol("?TERM");





    private static final SubLList $list53 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    static private final SubLList $list54 = list(makeString("T"), makeString("1"), makeString("true"), makeString("True"), makeString("TRUE"));



    private static final SubLList $list56 = list(makeString("NIL"), makeString("0"), makeString("false"), makeString("False"), makeString("FALSE"));



    private static final SubLString $str58$literal_is_a__S = makeString("literal is a ~S");

    private static final SubLString $str59$_S_is_not_a_list_node_ = makeString("~S is not a list node.");

    private static final SubLString $$$nil = makeString("nil");





    private static final SubLString $$$first = makeString("first");

    private static final SubLSymbol RDF_TRIPLE_PREDICATE = makeSymbol("RDF-TRIPLE-PREDICATE");

    private static final SubLString $$$rest = makeString("rest");

    private static final SubLList $list66 = list(makeString("application/rdf+xml"), makeString("*/*;q=0.5"));

    private static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    private static final SubLList $list68 = list(makeString("-"), makeString("T"), makeString(":"), makeString("."));

    private static final SubLSymbol CYC_TERM_FROM_OTHER_URI = makeSymbol("CYC-TERM-FROM-OTHER-URI");

    private static final SubLString $str70$_ = makeString("/");

    private static final SubLObject $$rdf_type = reader_make_constant_shell("rdf-type");

    private static final SubLSymbol STRINGIFY_CYC_URI = makeSymbol("STRINGIFY-CYC-URI");

    private static final SubLSymbol STARTS_WITH = makeSymbol("STARTS-WITH");

    private static final SubLList $list74 = list(reader_make_constant_shell("SchemaObjectFn"), makeKeyword("ANYTHING"), makeKeyword("STRING"));

    private static final SubLString $str75$_ = makeString("<");

    private static final SubLString $str76$_ = makeString(">");

    private static final SubLList $list77 = list(reader_make_constant_shell("ResourceWithURIFn"), list($TEST, makeSymbol("URI-P")));

    private static final SubLString $$$opencyc = makeString("opencyc");

    static private final SubLList $list79 = list(reader_make_constant_shell("URLFn"), reader_make_constant_shell("URIFn"));

    public static SubLObject clear_rdf_caches() {
        rdf_graph.clear_rdf_graph_get_blank_node_cached();
        rdf_graph.clear_rdf_graph_get_literal_cached();
        rdf_graph.clear_rdf_graph_index_sub_indexes();
        rdf_parser.clear_resolve_rdfXxml_uri_internal();
        rdf_parser.clear_expand_rdf_xml_uri_namespace_prefix();
        rdf_uri.clear_rdf_find_base_uri();
        rdf_uri.clear_get_rdf_uri_internal();
        clear_rdf_expanded_name();
        clear_rdf_name();
        clear_xsd_expanded_name();
        clear_xsd_name();
        clear_rdfs_expanded_name();
        clear_rdfs_name();
        clear_skos_expanded_name();
        clear_skos_name();
        clear_foaf_expanded_name();
        clear_foaf_name();
        clear_rdf_standard_prefix_for_namespace();
        return NIL;
    }

    public static final SubLObject rdf_namespace_alt() {
        return $rdf_namespace$.getGlobalValue();
    }

    public static SubLObject rdf_namespace() {
        return $rdf_namespace$.getGlobalValue();
    }

    public static final SubLObject clear_rdf_expanded_name_alt() {
        {
            SubLObject cs = $rdf_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_expanded_name() {
        final SubLObject cs = $rdf_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate($rdf_namespace$.getGlobalValue(), local_name);
    }

    public static SubLObject rdf_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate($rdf_namespace$.getGlobalValue(), local_name);
    }

    public static final SubLObject rdf_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $rdf_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_EXPANDED_NAME, $rdf_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdf_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $rdf_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_EXPANDED_NAME, $rdf_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_rdf_name_alt() {
        {
            SubLObject cs = $rdf_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_name() {
        final SubLObject cs = $rdf_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt5$rdf_, local_name);
    }

    public static SubLObject rdf_name_internal(final SubLObject local_name) {
        return cconcatenate($str4$rdf_, local_name);
    }

    public static final SubLObject rdf_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $rdf_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_NAME, $rdf_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdf_name(final SubLObject local_name) {
        SubLObject caching_state = $rdf_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_NAME, $rdf_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rdf_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, rdf_namespace())));
    }

    public static final SubLObject xsd_namespace_alt() {
        return $xsd_namespace$.getGlobalValue();
    }

    public static SubLObject xsd_namespace() {
        return $xsd_namespace$.getGlobalValue();
    }

    public static final SubLObject clear_xsd_expanded_name_alt() {
        {
            SubLObject cs = $xsd_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_xsd_expanded_name() {
        final SubLObject cs = $xsd_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_xsd_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($xsd_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_xsd_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($xsd_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xsd_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate($xsd_namespace$.getGlobalValue(), local_name);
    }

    public static SubLObject xsd_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate($xsd_namespace$.getGlobalValue(), local_name);
    }

    public static final SubLObject xsd_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $xsd_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(XSD_EXPANDED_NAME, $xsd_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.xsd_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject xsd_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $xsd_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(XSD_EXPANDED_NAME, $xsd_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(xsd_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_xsd_name_alt() {
        {
            SubLObject cs = $xsd_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_xsd_name() {
        final SubLObject cs = $xsd_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_xsd_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($xsd_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_xsd_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($xsd_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xsd_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt11$xsd_, local_name);
    }

    public static SubLObject xsd_name_internal(final SubLObject local_name) {
        return cconcatenate($str10$xsd_, local_name);
    }

    public static final SubLObject xsd_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $xsd_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(XSD_NAME, $xsd_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.xsd_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject xsd_name(final SubLObject local_name) {
        SubLObject caching_state = $xsd_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(XSD_NAME, $xsd_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(xsd_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject xsd_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, xsd_namespace())));
    }

    public static final SubLObject rdfs_namespace_alt() {
        return $rdfs_namespace$.getGlobalValue();
    }

    public static SubLObject rdfs_namespace() {
        return $rdfs_namespace$.getGlobalValue();
    }

    public static final SubLObject clear_rdfs_expanded_name_alt() {
        {
            SubLObject cs = $rdfs_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdfs_expanded_name() {
        final SubLObject cs = $rdfs_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdfs_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdfs_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdfs_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdfs_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdfs_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate($rdfs_namespace$.getGlobalValue(), local_name);
    }

    public static SubLObject rdfs_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate($rdfs_namespace$.getGlobalValue(), local_name);
    }

    public static final SubLObject rdfs_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $rdfs_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDFS_EXPANDED_NAME, $rdfs_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdfs_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdfs_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $rdfs_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDFS_EXPANDED_NAME, $rdfs_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdfs_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_rdfs_name_alt() {
        {
            SubLObject cs = $rdfs_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdfs_name() {
        final SubLObject cs = $rdfs_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdfs_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdfs_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdfs_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($rdfs_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdfs_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt17$rdfs_, local_name);
    }

    public static SubLObject rdfs_name_internal(final SubLObject local_name) {
        return cconcatenate($str16$rdfs_, local_name);
    }

    public static final SubLObject rdfs_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $rdfs_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDFS_NAME, $rdfs_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdfs_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdfs_name(final SubLObject local_name) {
        SubLObject caching_state = $rdfs_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDFS_NAME, $rdfs_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdfs_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rdfs_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, rdfs_namespace())));
    }

    public static final SubLObject skos_core_namespace_alt() {
        return $skos_core_namespace$.getGlobalValue();
    }

    public static SubLObject skos_core_namespace() {
        return $skos_core_namespace$.getGlobalValue();
    }

    public static final SubLObject clear_skos_expanded_name_alt() {
        {
            SubLObject cs = $skos_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_skos_expanded_name() {
        final SubLObject cs = $skos_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_skos_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($skos_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_skos_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($skos_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject skos_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate(com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_core_namespace(), local_name);
    }

    public static SubLObject skos_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate(skos_core_namespace(), local_name);
    }

    public static final SubLObject skos_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $skos_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(SKOS_EXPANDED_NAME, $skos_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject skos_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $skos_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKOS_EXPANDED_NAME, $skos_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(skos_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_skos_name_alt() {
        {
            SubLObject cs = $skos_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_skos_name() {
        final SubLObject cs = $skos_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_skos_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($skos_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_skos_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($skos_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject skos_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt23$skos_, local_name);
    }

    public static SubLObject skos_name_internal(final SubLObject local_name) {
        return cconcatenate($str22$skos_, local_name);
    }

    public static final SubLObject skos_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $skos_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(SKOS_NAME, $skos_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject skos_name(final SubLObject local_name) {
        SubLObject caching_state = $skos_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SKOS_NAME, $skos_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(skos_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject skos_core_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, skos_core_namespace())));
    }

    public static final SubLObject foaf_namespace_alt() {
        return $foaf_namespace$.getGlobalValue();
    }

    public static SubLObject foaf_namespace() {
        return $foaf_namespace$.getGlobalValue();
    }

    public static final SubLObject clear_foaf_expanded_name_alt() {
        {
            SubLObject cs = $foaf_expanded_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_foaf_expanded_name() {
        final SubLObject cs = $foaf_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_foaf_expanded_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($foaf_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_foaf_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($foaf_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject foaf_expanded_name_internal_alt(SubLObject local_name) {
        return cconcatenate(com.cyc.cycjava.cycl.rdf.rdf_utilities.foaf_namespace(), local_name);
    }

    public static SubLObject foaf_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate(foaf_namespace(), local_name);
    }

    public static final SubLObject foaf_expanded_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $foaf_expanded_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FOAF_EXPANDED_NAME, $foaf_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.foaf_expanded_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject foaf_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $foaf_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FOAF_EXPANDED_NAME, $foaf_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(foaf_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_foaf_name_alt() {
        {
            SubLObject cs = $foaf_name_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_foaf_name() {
        final SubLObject cs = $foaf_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_foaf_name_alt(SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($foaf_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_foaf_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($foaf_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject foaf_name_internal_alt(SubLObject local_name) {
        return cconcatenate($str_alt29$foaf_, local_name);
    }

    public static SubLObject foaf_name_internal(final SubLObject local_name) {
        return cconcatenate($str28$foaf_, local_name);
    }

    public static final SubLObject foaf_name_alt(SubLObject local_name) {
        {
            SubLObject caching_state = $foaf_name_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FOAF_NAME, $foaf_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.foaf_name_internal(local_name)));
                    memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject foaf_name(final SubLObject local_name) {
        SubLObject caching_state = $foaf_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FOAF_NAME, $foaf_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(foaf_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject foaf_namespace_uriP(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(v_object)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_object, foaf_namespace())));
    }

    public static final SubLObject rdf_label_properties_alt(SubLObject allow_alternate_labelsP) {
        if (allow_alternate_labelsP == UNPROVIDED) {
            allow_alternate_labelsP = NIL;
        }
        {
            SubLObject v_properties = list(com.cyc.cycjava.cycl.rdf.rdf_utilities.foaf_expanded_name($$$name), com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_expanded_name($$$prefLabel), com.cyc.cycjava.cycl.rdf.rdf_utilities.rdfs_expanded_name($$$label));
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_utilities.cyc_pretty_string_uris();
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                v_properties = list_utilities.nadd_to_end(property, v_properties);
            }
            if (NIL != allow_alternate_labelsP) {
                v_properties = list_utilities.nadd_to_end(com.cyc.cycjava.cycl.rdf.rdf_utilities.skos_expanded_name($$$altLabel), v_properties);
            }
            return v_properties;
        }
    }

    public static SubLObject rdf_label_properties(SubLObject allow_alternate_labelsP) {
        if (allow_alternate_labelsP == UNPROVIDED) {
            allow_alternate_labelsP = NIL;
        }
        SubLObject v_properties = list(foaf_expanded_name($$$name), skos_expanded_name($$$prefLabel), rdfs_expanded_name($$$label));
        SubLObject cdolist_list_var = cyc_pretty_string_uris();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_properties = list_utilities.nadd_to_end(property, v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        if (NIL != allow_alternate_labelsP) {
            v_properties = list_utilities.nadd_to_end(skos_expanded_name($$$altLabel), v_properties);
        }
        return v_properties;
    }

    public static final SubLObject cyc_pretty_string_uris_alt() {
        return com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_uris_for_cyc_term($$prettyString, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_pretty_string_uris() {
        return rdf_uris_for_cyc_term($$prettyString, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_rdf_standard_prefix_for_namespace_alt() {
        {
            SubLObject cs = $rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_standard_prefix_for_namespace() {
        final SubLObject cs = $rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_standard_prefix_for_namespace_alt(SubLObject namespace) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue(), list(namespace), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_standard_prefix_for_namespace(final SubLObject namespace) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue(), list(namespace), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_standard_prefix_for_namespace_internal_alt(SubLObject namespace) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject prefix = NIL;
                if (NIL != kb_loaded()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = $$uriString;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(namespace, TWO_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(namespace, TWO_INTEGER, pred_var);
                                        SubLObject done_var = prefix;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_1 = prefix;
                                                                SubLObject token_var_2 = NIL;
                                                                while (NIL == done_var_1) {
                                                                    {
                                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                        SubLObject valid_3 = makeBoolean(token_var_2 != gaf);
                                                                        if (NIL != valid_3) {
                                                                            {
                                                                                SubLObject reified_namespace = assertions_high.gaf_arg1(gaf);
                                                                                prefix = kb_mapping_utilities.fpred_value(reified_namespace, $$standardPrefixForURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                                                            }
                                                                        }
                                                                        done_var_1 = makeBoolean((NIL == valid_3) || (NIL != prefix));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != prefix));
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
                return prefix;
            }
        }
    }

    public static SubLObject rdf_standard_prefix_for_namespace_internal(final SubLObject namespace) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prefix = NIL;
        if (NIL != kb_loaded()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = $$uriString;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(namespace, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(namespace, TWO_INTEGER, pred_var);
                    SubLObject done_var = prefix;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = prefix;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(gaf));
                                    if (NIL != valid_$3) {
                                        final SubLObject reified_namespace = assertions_high.gaf_arg1(gaf);
                                        prefix = kb_mapping_utilities.fpred_value(reified_namespace, $$standardPrefixForURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                    }
                                    done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != prefix));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != prefix));
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return prefix;
    }

    public static final SubLObject rdf_standard_prefix_for_namespace_alt(SubLObject namespace) {
        {
            SubLObject caching_state = $rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_STANDARD_PREFIX_FOR_NAMESPACE, $rdf_standard_prefix_for_namespace_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, namespace, $kw3$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_standard_prefix_for_namespace_internal(namespace)));
                    memoization_state.caching_state_put(caching_state, namespace, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdf_standard_prefix_for_namespace(final SubLObject namespace) {
        SubLObject caching_state = $rdf_standard_prefix_for_namespace_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_STANDARD_PREFIX_FOR_NAMESPACE, $rdf_standard_prefix_for_namespace_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, namespace, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_standard_prefix_for_namespace_internal(namespace)));
            memoization_state.caching_state_put(caching_state, namespace, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject rdf_canonicalize_xml_string_alt(SubLObject xml) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokens = web_utilities.xml_string_tokenize(xml, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject sexprs = NIL;
                while (NIL != list_utilities.non_empty_list_p(tokens)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject sexpr = web_utilities.xml_tokens_to_sexpr(tokens);
                        SubLObject remaining = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        sexprs = cons(sexpr, sexprs);
                        tokens = remaining;
                    }
                } 
                return com.cyc.cycjava.cycl.rdf.rdf_utilities.exclusive_canonical_xml_from_sexprs(nreverse(sexprs), UNPROVIDED);
            }
        }
    }

    public static SubLObject rdf_canonicalize_xml_string(final SubLObject xml) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = xml_parsing_utilities.xml_string_tokenize(xml, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject sexprs = NIL;
        while (NIL != list_utilities.non_empty_list_p(tokens)) {
            thread.resetMultipleValues();
            final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
            final SubLObject remaining = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sexprs = cons(sexpr, sexprs);
            tokens = remaining;
        } 
        return exclusive_canonical_xml_from_sexprs(nreverse(sexprs), UNPROVIDED);
    }

    /**
     *
     *
     * @return stringp.
    Cf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/
     */
    @LispMethod(comment = "@return stringp.\r\nCf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/")
    public static final SubLObject exclusive_canonical_xml_from_sexprs_alt(SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != list_utilities.singletonP(xml_sexprs)) && list_utilities.only_one(xml_sexprs).isString()) {
                return list_utilities.only_one(xml_sexprs);
            } else {
                {
                    SubLObject xml_string = NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(stream, thread);
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_utilities.exclusive_canonicalize_xml_sexprs(xml_sexprs, attribute_lists);
                                    SubLObject sexpr = NIL;
                                    for (sexpr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sexpr = cdolist_list_var.first()) {
                                        xml_utilities.xml_sexpr_output_as_xml(sexpr);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                        xml_string = get_output_stream_string(stream);
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
                    return string_utilities.trim_whitespace(xml_string);
                }
            }
        }
    }

    /**
     *
     *
     * @return stringp.
    Cf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/
     */
    @LispMethod(comment = "@return stringp.\r\nCf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/")
    public static SubLObject exclusive_canonical_xml_from_sexprs(final SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != list_utilities.singletonP(xml_sexprs)) && list_utilities.only_one(xml_sexprs).isString()) {
            return list_utilities.only_one(xml_sexprs);
        }
        SubLObject xml_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                SubLObject cdolist_list_var = exclusive_canonicalize_xml_sexprs(xml_sexprs, attribute_lists);
                SubLObject sexpr = NIL;
                sexpr = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    xml_utilities.xml_sexpr_output_as_xml(sexpr);
                    cdolist_list_var = cdolist_list_var.rest();
                    sexpr = cdolist_list_var.first();
                } 
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string_utilities.trim_whitespace(xml_string);
    }

    /**
     *
     *
     * @return listp of sexprs
    Cf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/
     */
    @LispMethod(comment = "@return listp of sexprs\r\nCf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/")
    public static final SubLObject exclusive_canonicalize_xml_sexprs_alt(SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        {
            SubLObject canonicalized = NIL;
            SubLObject cdolist_list_var = xml_sexprs;
            SubLObject sexpr = NIL;
            for (sexpr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sexpr = cdolist_list_var.first()) {
                canonicalized = cons(com.cyc.cycjava.cycl.rdf.rdf_utilities.exclusive_canonicalize_xml_sexpr(sexpr, attribute_lists), canonicalized);
            }
            return nreverse(canonicalized);
        }
    }

    /**
     *
     *
     * @return listp of sexprs
    Cf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/
     */
    @LispMethod(comment = "@return listp of sexprs\r\nCf. http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/")
    public static SubLObject exclusive_canonicalize_xml_sexprs(final SubLObject xml_sexprs, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        SubLObject canonicalized = NIL;
        SubLObject cdolist_list_var = xml_sexprs;
        SubLObject sexpr = NIL;
        sexpr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            canonicalized = cons(exclusive_canonicalize_xml_sexpr(sexpr, attribute_lists), canonicalized);
            cdolist_list_var = cdolist_list_var.rest();
            sexpr = cdolist_list_var.first();
        } 
        return nreverse(canonicalized);
    }

    public static final SubLObject exclusive_canonicalize_xml_sexpr_alt(SubLObject sexpr, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        return sexpr.isList() ? ((SubLObject) (com.cyc.cycjava.cycl.rdf.rdf_utilities.exclusive_canonicalize_xml_sexpr_internal(copy_tree(sexpr), attribute_lists))) : sexpr;
    }

    public static SubLObject exclusive_canonicalize_xml_sexpr(final SubLObject sexpr, SubLObject attribute_lists) {
        if (attribute_lists == UNPROVIDED) {
            attribute_lists = NIL;
        }
        return sexpr.isList() ? exclusive_canonicalize_xml_sexpr_internal(copy_tree(sexpr), attribute_lists) : sexpr;
    }

    public static final SubLObject exclusive_canonicalize_xml_sexpr_internal_alt(SubLObject sexpr, SubLObject attribute_lists) {
        if (sexpr.isList()) {
            {
                SubLObject ns_key = com.cyc.cycjava.cycl.rdf.rdf_utilities.get_namespace_key(web_utilities.xml_sexpr_type(sexpr));
                SubLObject xmlns = com.cyc.cycjava.cycl.rdf.rdf_utilities.xmlns_from_attribute_lists(ns_key, attribute_lists);
                if (NIL == xmlns) {
                } else {
                    if (NIL != web_utilities.xml_sexpr_attribute_value(sexpr, ns_key)) {
                    } else {
                        web_utilities.xml_sexpr_set_attribute(sexpr, ns_key, xmlns);
                    }
                }
                {
                    SubLObject augmented = cons(web_utilities.xml_sexpr_attributes(sexpr), attribute_lists);
                    SubLObject cdolist_list_var = web_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED);
                    SubLObject dtr = NIL;
                    for (dtr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dtr = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.rdf.rdf_utilities.exclusive_canonicalize_xml_sexpr_internal(dtr, augmented);
                    }
                }
            }
        }
        return sexpr;
    }

    public static SubLObject exclusive_canonicalize_xml_sexpr_internal(final SubLObject sexpr, final SubLObject attribute_lists) {
        if (sexpr.isList()) {
            final SubLObject ns_key = get_namespace_key(xml_parsing_utilities.xml_sexpr_type(sexpr));
            final SubLObject xmlns = xmlns_from_attribute_lists(ns_key, attribute_lists);
            if (NIL != xmlns) {
                if (NIL == xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, ns_key)) {
                    xml_parsing_utilities.xml_sexpr_set_attribute(sexpr, ns_key, xmlns);
                }
            }
            final SubLObject augmented = cons(xml_parsing_utilities.xml_sexpr_attributes(sexpr), attribute_lists);
            SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED);
            SubLObject dtr = NIL;
            dtr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                exclusive_canonicalize_xml_sexpr_internal(dtr, augmented);
                cdolist_list_var = cdolist_list_var.rest();
                dtr = cdolist_list_var.first();
            } 
        }
        return sexpr;
    }

    public static final SubLObject get_namespace_key_alt(SubLObject xml_sexpr_type) {
        {
            SubLObject colon_pos = position(CHAR_colon, xml_sexpr_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != colon_pos ? ((SubLObject) (cconcatenate($str_alt44$xmlns_, string_utilities.substring(xml_sexpr_type, ZERO_INTEGER, colon_pos)))) : $$$xmlns;
        }
    }

    public static SubLObject get_namespace_key(final SubLObject xml_sexpr_type) {
        final SubLObject colon_pos = position(CHAR_colon, xml_sexpr_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != colon_pos ? cconcatenate($str43$xmlns_, string_utilities.substring(xml_sexpr_type, ZERO_INTEGER, colon_pos)) : $$$xmlns;
    }

    public static final SubLObject xmlns_from_attribute_lists_alt(SubLObject ns_key, SubLObject attribute_lists) {
        {
            SubLObject xmlns = NIL;
            if (NIL == xmlns) {
                {
                    SubLObject csome_list_var = attribute_lists;
                    SubLObject attribute_list = NIL;
                    for (attribute_list = csome_list_var.first(); !((NIL != xmlns) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , attribute_list = csome_list_var.first()) {
                        xmlns = list_utilities.alist_lookup_without_values(attribute_list, ns_key, symbol_function($sym46$STRING_), UNPROVIDED);
                    }
                }
            }
            return xmlns;
        }
    }

    public static SubLObject xmlns_from_attribute_lists(final SubLObject ns_key, final SubLObject attribute_lists) {
        SubLObject xmlns = NIL;
        if (NIL == xmlns) {
            SubLObject csome_list_var;
            SubLObject attribute_list;
            for (csome_list_var = attribute_lists, attribute_list = NIL, attribute_list = csome_list_var.first(); (NIL == xmlns) && (NIL != csome_list_var); xmlns = list_utilities.alist_lookup_without_values(attribute_list, ns_key, symbol_function($sym45$STRING_), UNPROVIDED) , csome_list_var = csome_list_var.rest() , attribute_list = csome_list_var.first()) {
            }
        }
        return xmlns;
    }

    public static final SubLObject rdf_find_or_create_term_for_node_alt(SubLObject node, SubLObject v_graph) {
        if (NIL != rdf_uri_p(node)) {
            return com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_find_or_create_term_for_uri(node);
        } else {
            if (NIL != rdf_literal.rdf_literal_p(node)) {
                return com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_find_or_create_term_for_literal(node);
            } else {
                if (NIL != com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_p(node, v_graph)) {
                    return com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_find_or_create_term_for_list_node(node, v_graph);
                } else {
                    Errors.error($str_alt47$Can_t_find_or_create_term_for__S, node);
                }
            }
        }
        return NIL;
    }

    public static SubLObject rdf_find_or_create_term_for_node(final SubLObject node, final SubLObject v_graph) {
        if (NIL != rdf_uri.rdf_uri_p(node)) {
            return rdf_find_or_create_term_for_uri(node);
        }
        if (NIL != rdf_literal.rdf_literal_p(node)) {
            return rdf_find_or_create_term_for_literal(node);
        }
        if (NIL != rdf_list_p(node, v_graph)) {
            return rdf_find_or_create_term_for_list_node(node, v_graph);
        }
        Errors.error($str46$Can_t_find_or_create_term_for__S, node);
        return NIL;
    }

    public static final SubLObject rdf_find_or_create_term_for_uri_alt(SubLObject uri) {
        {
            SubLObject v_term = com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_find_term_for_uri(uri);
            return NIL != v_term ? ((SubLObject) (v_term)) : narts_high.nart_substitute(make_unary_formula($$ResourceWithURIFn, rdf_uri_utf8_string(uri)));
        }
    }

    public static SubLObject rdf_find_or_create_term_for_uri(final SubLObject uri) {
        final SubLObject v_term = rdf_find_term_for_uri(uri);
        return NIL != forts.fort_p(v_term) ? v_term : czer_main.cyc_find_or_create_nart(make_unary_formula($$ResourceWithURIFn, rdf_uri.rdf_uri_utf8_string(uri)), UNPROVIDED);
    }

    public static final SubLObject rdf_find_term_for_uri_alt(SubLObject uri) {
        {
            SubLObject uri_string = rdf_uri_utf8_string(uri);
            if (uri_string.equal(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$type))) {
                return $$isa;
            }
            return ask_utilities.query_variable($sym51$_TERM, list($$rdfURI, $sym51$_TERM, uri_string), $$InferencePSC, $list_alt54).first();
        }
    }

    public static SubLObject rdf_find_term_for_uri(final SubLObject uri) {
        final SubLObject uri_string = rdf_uri.rdf_uri_utf8_string(uri);
        if (uri_string.equal(rdf_expanded_name($$$type))) {
            return $$isa;
        }
        return ask_utilities.query_variable($sym50$_TERM, list($$rdfURI, $sym50$_TERM, uri_string), $$InferencePSC, $list53).first();
    }

    public static final SubLObject rdf_find_or_create_term_for_literal_alt(SubLObject literal) {
        if (NIL == rdf_literal.rdf_literal_datatype(literal)) {
            return rdf_literal.rdf_literal_utf8_lexical_form(literal);
        } else {
            if (NIL != rdf_literal.rdf_string_literal_p(literal)) {
                return rdf_literal.rdf_literal_utf8_lexical_form(literal);
            } else {
                Errors.error($str_alt47$Can_t_find_or_create_term_for__S, literal);
            }
        }
        return NIL;
    }

    public static SubLObject rdf_find_or_create_term_for_literal(final SubLObject literal) {
        if (NIL == rdf_literal.rdf_literal_datatype(literal)) {
            return rdf_literal.rdf_literal_utf8_lexical_form(literal);
        }
        if (NIL != rdf_literal.rdf_boolean_literal_p(literal)) {
            final SubLObject value = rdf_literal.rdf_literal_utf8_lexical_form(literal);
            if (NIL != list_utilities.member_equalP(value, $list54)) {
                return $$True;
            }
            if (NIL != list_utilities.member_equalP(value, $list56)) {
                return $$False;
            }
        } else {
            if (NIL != rdf_literal.rdf_string_literal_p(literal)) {
                return rdf_literal.rdf_literal_utf8_lexical_form(literal);
            }
            if (NIL != rdf_literal.rdf_date_literal_p(literal)) {
                return cycl_date_from_rdf_date(rdf_literal.rdf_literal_utf8_lexical_form(literal));
            }
            if (NIL != rdf_literal.rdf_integer_literal_p(literal)) {
                return read_from_string_ignoring_errors(rdf_literal.rdf_literal_utf8_lexical_form(literal), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != rdf_literal.rdf_double_literal_p(literal)) {
                return read_from_string_ignoring_errors(rdf_literal.rdf_literal_utf8_lexical_form(literal), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != rdf_literal.rdf_uri_literal_p(literal)) && (NIL != web_utilities.uri_p(rdf_literal.rdf_literal_utf8_lexical_form(literal), UNPROVIDED))) {
                return rdf_find_or_create_term_for_uri(rdf_uri.get_rdf_uri(rdf_literal.rdf_literal_utf8_lexical_form(literal), UNPROVIDED, UNPROVIDED));
            }
            Errors.warn($str58$literal_is_a__S, rdf_literal.rdf_literal_datatype(literal));
            Errors.error($str46$Can_t_find_or_create_term_for__S, literal);
        }
        return NIL;
    }

    public static final SubLObject rdf_find_or_create_term_for_list_node_alt(SubLObject list_node, SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_p(list_node, v_graph)) {
                    Errors.error($str_alt55$_S_is_not_a_list_node_, list_node);
                }
            }
            if ((NIL != rdf_uri_p(list_node)) && (NIL != rdf_uri_matchesP(list_node, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$nil)))) {
                return $$TheEmptyList;
            } else {
                return canonicalize_term(make_el_formula($$TheList, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_node_terms(list_node, v_graph), UNPROVIDED), UNPROVIDED);
            }
        }
    }

    public static SubLObject rdf_find_or_create_term_for_list_node(final SubLObject list_node, final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_list_p(list_node, v_graph))) {
            Errors.error($str59$_S_is_not_a_list_node_, list_node);
        }
        if ((NIL != rdf_uri.rdf_uri_p(list_node)) && (NIL != rdf_uri.rdf_uri_matchesP(list_node, rdf_expanded_name($$$nil)))) {
            return $$TheEmptyList;
        }
        return czer_main.canonicalize_term(make_el_formula($$TheList, rdf_list_node_terms(list_node, v_graph), UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject rdf_list_node_terms_alt(SubLObject node, SubLObject v_graph) {
        if ((NIL != rdf_uri_p(node)) && (NIL != rdf_uri_matchesP(node, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$nil)))) {
            return NIL;
        }
        {
            SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            SubLObject first_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
            SubLObject first_term = com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_find_or_create_term_for_node(rdf_triple.rdf_triple_object(first_triple), v_graph);
            SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
            SubLObject rest_terms = com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_node_terms(rdf_triple.rdf_triple_object(rest_triple), v_graph);
            return cons(first_term, rest_terms);
        }
    }

    public static SubLObject rdf_list_node_terms(final SubLObject node, final SubLObject v_graph) {
        if ((NIL != rdf_uri.rdf_uri_p(node)) && (NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name($$$nil)))) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        final SubLObject first_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject first_term = rdf_find_or_create_term_for_node(rdf_triple.rdf_triple_object(first_triple), v_graph);
        final SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject rest_terms = rdf_list_node_terms(rdf_triple.rdf_triple_object(rest_triple), v_graph);
        return cons(first_term, rest_terms);
    }

    public static final SubLObject rdf_list_nodes_alt(SubLObject node, SubLObject v_graph) {
        if ((NIL != rdf_uri_p(node)) && (NIL != rdf_uri_matchesP(node, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$nil)))) {
            return NIL;
        }
        {
            SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            SubLObject first_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
            SubLObject first_node = rdf_triple.rdf_triple_object(first_triple);
            SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
            SubLObject rest_nodes = com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_nodes(rdf_triple.rdf_triple_object(rest_triple), v_graph);
            return cons(first_node, rest_nodes);
        }
    }

    public static SubLObject rdf_list_nodes(final SubLObject node, final SubLObject v_graph) {
        if ((NIL != rdf_uri.rdf_uri_p(node)) && (NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name($$$nil)))) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        final SubLObject first_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject first_node = rdf_triple.rdf_triple_object(first_triple);
        final SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject rest_nodes = rdf_list_nodes(rdf_triple.rdf_triple_object(rest_triple), v_graph);
        return cons(first_node, rest_nodes);
    }

    public static final SubLObject rdf_list_p_alt(SubLObject node, SubLObject v_graph) {
        if ((NIL != rdf_uri_p(node)) && (NIL != rdf_uri_matchesP(node, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$nil)))) {
            return T;
        }
        if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return NIL;
        }
        {
            SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            if (!((NIL != list_utilities.doubletonP(triples)) && (NIL != find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED)))) {
                return NIL;
            }
            {
                SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
                return makeBoolean((NIL != rest_triple) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_list_p(rdf_triple.rdf_triple_object(rest_triple), v_graph)));
            }
        }
    }

    public static SubLObject rdf_list_p(final SubLObject node, final SubLObject v_graph) {
        if ((NIL != rdf_uri.rdf_uri_p(node)) && (NIL != rdf_uri.rdf_uri_matchesP(node, rdf_expanded_name($$$nil)))) {
            return T;
        }
        if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
            return NIL;
        }
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        if (((NIL == list_utilities.doubletonP(triples)) && (NIL == list_utilities.tripleP(triples))) || (NIL == find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        return makeBoolean((NIL != rest_triple) && (NIL != rdf_list_p(rdf_triple.rdf_triple_object(rest_triple), v_graph)));
    }

    public static SubLObject rdf_graph_remove_node(final SubLObject v_graph, final SubLObject node) {
        if (NIL != rdf_graph.valid_rdf_subject_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
        }
        if (NIL != rdf_graph.valid_rdf_predicate_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, node);
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
        }
        if (NIL != rdf_graph.valid_rdf_object_p(node)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_object_triples(v_graph, node, UNPROVIDED);
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject rdf_graph_remove_list(final SubLObject v_graph, final SubLObject list) {
        if (NIL != rdf_blank_node.rdf_blank_node_p(list)) {
            final SubLObject first_node_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, list, rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED)).first();
            final SubLObject rest_node_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, list, rdf_graph.rdf_graph_get_uri(v_graph, rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED)).first();
            if ((NIL != rdf_triple.rdf_triple_p(first_node_triple, UNPROVIDED)) && (NIL != rdf_triple.rdf_triple_p(rest_node_triple, UNPROVIDED))) {
                rdf_graph_remove_list(v_graph, rdf_triple.rdf_triple_object(first_node_triple));
                rdf_graph_remove_list(v_graph, rdf_triple.rdf_triple_object(rest_node_triple));
                rdf_graph.rdf_graph_remove_known_triple(v_graph, first_node_triple);
                rdf_graph.rdf_graph_remove_known_triple(v_graph, rest_node_triple);
                rdf_graph_remove_node(v_graph, list);
            }
        }
        return NIL;
    }

    public static final SubLObject download_rdf_url_alt(SubLObject url, SubLObject source_file) {
        if (source_file == UNPROVIDED) {
            source_file = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(url, URL_P);
            if (NIL == source_file) {
                source_file = file_utilities.make_unused_temp_filename(UNPROVIDED);
            }
            {
                SubLObject error_message = web_utilities.save_url_to_file(url, source_file, $list_alt63, T);
                if (NIL == error_message) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(source_file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt65$Unable_to_open__S, source_file);
                            }
                            {
                                SubLObject s = stream;
                                if (file_length(s).numL($int$2000)) {
                                    {
                                        SubLObject contents = string_utilities.read_string_from_file(source_file, UNPROVIDED, UNPROVIDED);
                                        if ((NIL != search($$$404, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search($$$Not_Found, contents, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                            error_message = $str_alt69$Url_not_found_;
                                        } else {
                                            if (NIL != search($str_alt70$503_Service_Temporarily_Unavailab, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                error_message = $$$Server_not_available;
                                            } else {
                                                if (NIL == string_utilities.starts_with_by_test(contents, $str_alt72$__xml, symbol_function(EQUALP))) {
                                                    {
                                                        SubLObject snippet_end = min(FIFTEEN_INTEGER, length(contents));
                                                        SubLObject snippet = string_utilities.substring(contents, ZERO_INTEGER, snippet_end);
                                                        error_message = cconcatenate($str_alt73$Not_XML_document__Starts_with_, format_nil.format_nil_s_no_copy(snippet));
                                                    }
                                                }
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
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                if (NIL != error_message) {
                    Errors.error($str_alt74$Encountered_error_trying_to_downl, url, error_message);
                }
                return source_file;
            }
        }
    }

    public static SubLObject download_rdf_url(final SubLObject url, SubLObject source_file) {
        if (source_file == UNPROVIDED) {
            source_file = NIL;
        }
        return xml_utilities.download_xml_url(url, source_file, $list66, T);
    }

    public static final SubLObject rdf_uri_to_cyc_term_alt(SubLObject v_rdf_uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_rdf_uri, RDF_URI_P);
            {
                SubLObject uri_cyc_string = rdf_uri_cyc_string(v_rdf_uri);
                SubLObject v_term = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        v_term = kb_mapping_utilities.fpred_value_in_any_mt(uri_cyc_string, $$rdfURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != v_term ? ((SubLObject) (v_term)) : make_unary_formula($$ResourceWithURIFn, uri_cyc_string);
            }
        }
    }

    public static SubLObject rdf_uri_to_cyc_term(final SubLObject v_rdf_uri) {
        assert NIL != rdf_uri.rdf_uri_p(v_rdf_uri) : "! rdf_uri.rdf_uri_p(v_rdf_uri) " + ("rdf_uri.rdf_uri_p(v_rdf_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(v_rdf_uri) ") + v_rdf_uri;
        final SubLObject uri_cyc_string = rdf_uri.rdf_uri_cyc_string(v_rdf_uri);
        SubLObject v_term = NIL;
        if (NIL != owl_cycl_to_xml.cyc_uri_p(v_rdf_uri)) {
            v_term = cyc_term_from_cyc_rdf_uri(v_rdf_uri);
        } else {
            v_term = cyc_term_from_other_uri(uri_cyc_string);
        }
        if (NIL == v_term) {
            v_term = make_unary_formula($$ResourceWithURIFn, uri_cyc_string);
        }
        return v_term;
    }

    public static SubLObject cycl_date_from_rdf_date(final SubLObject date_string) {
        final SubLObject date_tokens = string_utilities.string_tokenize(date_string, $list68, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject year = string_utilities.string_to_integer(date_tokens.first());
        final SubLObject month = (NIL != second(date_tokens)) ? string_utilities.string_to_integer(second(date_tokens)) : NIL;
        final SubLObject day = (NIL != third(date_tokens)) ? string_utilities.string_to_integer(third(date_tokens)) : NIL;
        final SubLObject hour = (NIL != fourth(date_tokens)) ? read_from_string_ignoring_errors(fourth(date_tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject minute = (NIL != fifth(date_tokens)) ? read_from_string_ignoring_errors(fifth(date_tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject second = (NIL != sixth(date_tokens)) ? read_from_string_ignoring_errors(sixth(date_tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject millisecond = (NIL != seventh(date_tokens)) ? read_from_string_ignoring_errors(seventh(date_tokens), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        return NIL != millisecond ? date_utilities.construct_calendar_date(year, month, day, hour, minute, second, millisecond) : date_utilities.construct_reduced_cycl_date(second, minute, hour, day, month, year);
    }

    public static SubLObject cyc_term_from_other_uri_internal(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = kb_mapping_utilities.fpred_value_in_any_mt(uri, $$rdfURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject cyc_term_from_other_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cyc_term_from_other_uri_internal(uri);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CYC_TERM_FROM_OTHER_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CYC_TERM_FROM_OTHER_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CYC_TERM_FROM_OTHER_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, uri, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(cyc_term_from_other_uri_internal(uri)));
            memoization_state.caching_state_put(caching_state, uri, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject cyc_term_from_cyc_rdf_uri(final SubLObject cyc_uri) {
        assert NIL != rdf_uri.rdf_uri_p(cyc_uri) : "! rdf_uri.rdf_uri_p(cyc_uri) " + ("rdf_uri.rdf_uri_p(cyc_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(cyc_uri) ") + cyc_uri;
        final SubLObject id = find_id_from_cyc_uri_string(rdf_uri.rdf_uri_local_part(cyc_uri));
        SubLObject cyc_term = constants_high.find_constant(id);
        if (NIL == cyc_term) {
            cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string(id);
        }
        if (NIL != cycl_grammar.cycl_denotational_term_p(cyc_term)) {
            return cyc_term;
        }
        return NIL;
    }

    public static SubLObject find_id_from_cyc_uri_string(final SubLObject uri) {
        final SubLObject slash_position = last(string_utilities.search_all($str70$_, uri, UNPROVIDED, UNPROVIDED), UNPROVIDED).first();
        final SubLObject uri_after_slash = string_utilities.substring(uri, NIL != slash_position ? slash_position : ZERO_INTEGER, UNPROVIDED);
        final SubLObject id = Strings.string_right_trim(list(CHAR_greater), uri_after_slash);
        return id;
    }

    /**
     * Find all RDF URIs for TERM known in the current MT context,
     * limiting answers to those in NAMESPACE if non-NIL.
     *
     * @unknown -- Use asserted URIs to find others.
     */
    @LispMethod(comment = "Find all RDF URIs for TERM known in the current MT context,\r\nlimiting answers to those in NAMESPACE if non-NIL.\r\n\r\n@unknown -- Use asserted URIs to find others.\nFind all RDF URIs for TERM known in the current MT context,\nlimiting answers to those in NAMESPACE if non-NIL.")
    public static final SubLObject rdf_uris_for_cyc_term_alt(SubLObject v_term, SubLObject namespace, SubLObject external_onlyP) {
        if (namespace == UNPROVIDED) {
            namespace = NIL;
        }
        if (external_onlyP == UNPROVIDED) {
            external_onlyP = NIL;
        }
        {
            SubLObject uris = NIL;
            if (v_term.eql($$rdf_type)) {
                uris = cons(com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name($$$type), uris);
            }
            if (NIL != indexed_term_p(v_term)) {
                {
                    SubLObject all_uris = remove(NIL, Mapping.mapcar(STRINGIFY_CYC_URI, kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject items_var = (NIL != namespace) ? ((SubLObject) (list_utilities.find_all(namespace, all_uris, STARTS_WITH, UNPROVIDED))) : all_uris;
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = (NIL != namespace) ? ((SubLObject) (list_utilities.find_all(namespace, all_uris, STARTS_WITH, UNPROVIDED))) : all_uris;
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    uris = cons(item, uris);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = (NIL != namespace) ? ((SubLObject) (list_utilities.find_all(namespace, all_uris, STARTS_WITH, UNPROVIDED))) : all_uris;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                uris = cons(item, uris);
                            }
                        }
                    }
                }
            }
            if ((NIL != formula_pattern_match.formula_matches_pattern(v_term, $list_alt79)) && (NIL != web_utilities.uri_p(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, UNPROVIDED), $str_alt80$_, UNPROVIDED), $str_alt81$_, UNPROVIDED), UNPROVIDED))) {
                uris = cons(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, UNPROVIDED), $str_alt80$_, UNPROVIDED), $str_alt81$_, UNPROVIDED), uris);
            }
            if (NIL != formula_pattern_match.formula_matches_pattern(v_term, $list_alt82)) {
                uris = cons(cycl_utilities.nat_arg1(v_term, UNPROVIDED), uris);
            }
            if ((NIL == external_onlyP) && (NIL != fort_p(v_term))) {
                if ((NIL == namespace) || (NIL != search($$$opencyc, namespace, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    uris = cons(owl_opencyc_latest_uri_for_fort(v_term), uris);
                    uris = cons(owl_opencyc_versioned_uri_for_fort(v_term, UNPROVIDED), uris);
                    uris = cons(owl_opencyc_readable_uri_for_fort(v_term, UNPROVIDED), uris);
                    if (NIL != namespace) {
                        uris = list_utilities.find_all(namespace, uris, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            }
            return delete_duplicates(uris, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Find all RDF URIs for TERM known in the current MT context,
     * limiting answers to those in NAMESPACE if non-NIL.
     *
     * @unknown -- Use asserted URIs to find others.
     */
    @LispMethod(comment = "Find all RDF URIs for TERM known in the current MT context,\r\nlimiting answers to those in NAMESPACE if non-NIL.\r\n\r\n@unknown -- Use asserted URIs to find others.\nFind all RDF URIs for TERM known in the current MT context,\nlimiting answers to those in NAMESPACE if non-NIL.")
    public static SubLObject rdf_uris_for_cyc_term(final SubLObject v_term, SubLObject namespace, SubLObject external_onlyP) {
        if (namespace == UNPROVIDED) {
            namespace = NIL;
        }
        if (external_onlyP == UNPROVIDED) {
            external_onlyP = NIL;
        }
        SubLObject uris = NIL;
        if (v_term.eql($$rdf_type)) {
            uris = cons(rdf_expanded_name($$$type), uris);
        }
        if (NIL != indexed_term_p(v_term)) {
            final SubLObject all_uris = remove(NIL, Mapping.mapcar(STRINGIFY_CYC_URI, kb_mapping_utilities.pred_values(v_term, $$rdfURI, ONE_INTEGER, TWO_INTEGER, $TRUE)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject items_var = (NIL != namespace) ? list_utilities.find_all(namespace, all_uris, STARTS_WITH, UNPROVIDED) : all_uris;
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    uris = cons(item, uris);
                }
            } else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    uris = cons(item2, uris);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        }
        if ((NIL != formula_pattern_match.formula_matches_pattern(v_term, $list74)) && (NIL != web_utilities.uri_p(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, UNPROVIDED), $str75$_, UNPROVIDED), $str76$_, UNPROVIDED), UNPROVIDED))) {
            uris = cons(string_utilities.post_remove(string_utilities.pre_remove(cycl_utilities.nat_arg2(v_term, UNPROVIDED), $str75$_, UNPROVIDED), $str76$_, UNPROVIDED), uris);
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(v_term, $list77)) {
            uris = cons(cycl_utilities.nat_arg1(v_term, UNPROVIDED), uris);
        }
        if (((NIL == external_onlyP) && (NIL != forts.fort_p(v_term))) && ((NIL == namespace) || (NIL != search($$$opencyc, namespace, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            uris = cons(owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(v_term), uris);
            uris = cons(owl_cycl_to_xml.owl_opencyc_versioned_uri_for_fort(v_term, UNPROVIDED), uris);
            uris = cons(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(v_term, UNPROVIDED), uris);
            if (NIL != namespace) {
                uris = list_utilities.find_all(namespace, uris, symbol_function(EQUAL), UNPROVIDED);
            }
        }
        return delete_duplicates(uris, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject stringify_cyc_uri_alt(SubLObject cyc_uri) {
        if (cyc_uri.isString()) {
            return cyc_uri;
        } else {
            if (NIL != member(cycl_utilities.nat_functor(cyc_uri), $list_alt84, UNPROVIDED, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.rdf.rdf_utilities.stringify_cyc_uri(cycl_utilities.nat_arg1(cyc_uri, UNPROVIDED));
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject stringify_cyc_uri(final SubLObject cyc_uri) {
        if (cyc_uri.isString()) {
            return cyc_uri;
        }
        if (NIL != member(cycl_utilities.nat_functor(cyc_uri), $list79, UNPROVIDED, UNPROVIDED)) {
            return stringify_cyc_uri(cycl_utilities.nat_arg1(cyc_uri, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject declare_rdf_utilities_file_alt() {
        declareFunction("rdf_namespace", "RDF-NAMESPACE", 0, 0, false);
        declareFunction("clear_rdf_expanded_name", "CLEAR-RDF-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_rdf_expanded_name", "REMOVE-RDF-EXPANDED-NAME", 1, 0, false);
        declareFunction("rdf_expanded_name_internal", "RDF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdf_expanded_name", "RDF-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_rdf_name", "CLEAR-RDF-NAME", 0, 0, false);
        declareFunction("remove_rdf_name", "REMOVE-RDF-NAME", 1, 0, false);
        declareFunction("rdf_name_internal", "RDF-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdf_name", "RDF-NAME", 1, 0, false);
        declareFunction("xsd_namespace", "XSD-NAMESPACE", 0, 0, false);
        declareFunction("clear_xsd_expanded_name", "CLEAR-XSD-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_xsd_expanded_name", "REMOVE-XSD-EXPANDED-NAME", 1, 0, false);
        declareFunction("xsd_expanded_name_internal", "XSD-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("xsd_expanded_name", "XSD-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_xsd_name", "CLEAR-XSD-NAME", 0, 0, false);
        declareFunction("remove_xsd_name", "REMOVE-XSD-NAME", 1, 0, false);
        declareFunction("xsd_name_internal", "XSD-NAME-INTERNAL", 1, 0, false);
        declareFunction("xsd_name", "XSD-NAME", 1, 0, false);
        declareFunction("rdfs_namespace", "RDFS-NAMESPACE", 0, 0, false);
        declareFunction("clear_rdfs_expanded_name", "CLEAR-RDFS-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_rdfs_expanded_name", "REMOVE-RDFS-EXPANDED-NAME", 1, 0, false);
        declareFunction("rdfs_expanded_name_internal", "RDFS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdfs_expanded_name", "RDFS-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_rdfs_name", "CLEAR-RDFS-NAME", 0, 0, false);
        declareFunction("remove_rdfs_name", "REMOVE-RDFS-NAME", 1, 0, false);
        declareFunction("rdfs_name_internal", "RDFS-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdfs_name", "RDFS-NAME", 1, 0, false);
        declareFunction("skos_core_namespace", "SKOS-CORE-NAMESPACE", 0, 0, false);
        declareFunction("clear_skos_expanded_name", "CLEAR-SKOS-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_skos_expanded_name", "REMOVE-SKOS-EXPANDED-NAME", 1, 0, false);
        declareFunction("skos_expanded_name_internal", "SKOS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("skos_expanded_name", "SKOS-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_skos_name", "CLEAR-SKOS-NAME", 0, 0, false);
        declareFunction("remove_skos_name", "REMOVE-SKOS-NAME", 1, 0, false);
        declareFunction("skos_name_internal", "SKOS-NAME-INTERNAL", 1, 0, false);
        declareFunction("skos_name", "SKOS-NAME", 1, 0, false);
        declareFunction("foaf_namespace", "FOAF-NAMESPACE", 0, 0, false);
        declareFunction("clear_foaf_expanded_name", "CLEAR-FOAF-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_foaf_expanded_name", "REMOVE-FOAF-EXPANDED-NAME", 1, 0, false);
        declareFunction("foaf_expanded_name_internal", "FOAF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("foaf_expanded_name", "FOAF-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_foaf_name", "CLEAR-FOAF-NAME", 0, 0, false);
        declareFunction("remove_foaf_name", "REMOVE-FOAF-NAME", 1, 0, false);
        declareFunction("foaf_name_internal", "FOAF-NAME-INTERNAL", 1, 0, false);
        declareFunction("foaf_name", "FOAF-NAME", 1, 0, false);
        declareFunction("rdf_label_properties", "RDF-LABEL-PROPERTIES", 0, 1, false);
        declareFunction("cyc_pretty_string_uris", "CYC-PRETTY-STRING-URIS", 0, 0, false);
        declareFunction("clear_rdf_standard_prefix_for_namespace", "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 0, 0, false);
        declareFunction("remove_rdf_standard_prefix_for_namespace", "REMOVE-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        declareFunction("rdf_standard_prefix_for_namespace_internal", "RDF-STANDARD-PREFIX-FOR-NAMESPACE-INTERNAL", 1, 0, false);
        declareFunction("rdf_standard_prefix_for_namespace", "RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        declareFunction("rdf_canonicalize_xml_string", "RDF-CANONICALIZE-XML-STRING", 1, 0, false);
        declareFunction("exclusive_canonical_xml_from_sexprs", "EXCLUSIVE-CANONICAL-XML-FROM-SEXPRS", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexprs", "EXCLUSIVE-CANONICALIZE-XML-SEXPRS", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexpr", "EXCLUSIVE-CANONICALIZE-XML-SEXPR", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexpr_internal", "EXCLUSIVE-CANONICALIZE-XML-SEXPR-INTERNAL", 2, 0, false);
        declareFunction("get_namespace_key", "GET-NAMESPACE-KEY", 1, 0, false);
        declareFunction("xmlns_from_attribute_lists", "XMLNS-FROM-ATTRIBUTE-LISTS", 2, 0, false);
        declareFunction("rdf_find_or_create_term_for_node", "RDF-FIND-OR-CREATE-TERM-FOR-NODE", 2, 0, false);
        declareFunction("rdf_find_or_create_term_for_uri", "RDF-FIND-OR-CREATE-TERM-FOR-URI", 1, 0, false);
        declareFunction("rdf_find_term_for_uri", "RDF-FIND-TERM-FOR-URI", 1, 0, false);
        declareFunction("rdf_find_or_create_term_for_literal", "RDF-FIND-OR-CREATE-TERM-FOR-LITERAL", 1, 0, false);
        declareFunction("rdf_find_or_create_term_for_list_node", "RDF-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
        declareFunction("rdf_list_node_terms", "RDF-LIST-NODE-TERMS", 2, 0, false);
        declareFunction("rdf_list_nodes", "RDF-LIST-NODES", 2, 0, false);
        declareFunction("rdf_list_p", "RDF-LIST-P", 2, 0, false);
        declareFunction("download_rdf_url", "DOWNLOAD-RDF-URL", 1, 1, false);
        declareFunction("rdf_uri_to_cyc_term", "RDF-URI-TO-CYC-TERM", 1, 0, false);
        declareFunction("rdf_uris_for_cyc_term", "RDF-URIS-FOR-CYC-TERM", 1, 2, false);
        declareFunction("stringify_cyc_uri", "STRINGIFY-CYC-URI", 1, 0, false);
        declareFunction("pretty_print_subject_triples", "PRETTY-PRINT-SUBJECT-TRIPLES", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_rdf_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("clear_rdf_caches", "CLEAR-RDF-CACHES", 0, 0, false);
            declareFunction("rdf_namespace", "RDF-NAMESPACE", 0, 0, false);
            declareFunction("clear_rdf_expanded_name", "CLEAR-RDF-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_rdf_expanded_name", "REMOVE-RDF-EXPANDED-NAME", 1, 0, false);
            declareFunction("rdf_expanded_name_internal", "RDF-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("rdf_expanded_name", "RDF-EXPANDED-NAME", 1, 0, false);
            declareFunction("clear_rdf_name", "CLEAR-RDF-NAME", 0, 0, false);
            declareFunction("remove_rdf_name", "REMOVE-RDF-NAME", 1, 0, false);
            declareFunction("rdf_name_internal", "RDF-NAME-INTERNAL", 1, 0, false);
            declareFunction("rdf_name", "RDF-NAME", 1, 0, false);
            declareFunction("rdf_namespace_uriP", "RDF-NAMESPACE-URI?", 1, 0, false);
            declareFunction("xsd_namespace", "XSD-NAMESPACE", 0, 0, false);
            declareFunction("clear_xsd_expanded_name", "CLEAR-XSD-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_xsd_expanded_name", "REMOVE-XSD-EXPANDED-NAME", 1, 0, false);
            declareFunction("xsd_expanded_name_internal", "XSD-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("xsd_expanded_name", "XSD-EXPANDED-NAME", 1, 0, false);
            declareFunction("clear_xsd_name", "CLEAR-XSD-NAME", 0, 0, false);
            declareFunction("remove_xsd_name", "REMOVE-XSD-NAME", 1, 0, false);
            declareFunction("xsd_name_internal", "XSD-NAME-INTERNAL", 1, 0, false);
            declareFunction("xsd_name", "XSD-NAME", 1, 0, false);
            declareFunction("xsd_namespace_uriP", "XSD-NAMESPACE-URI?", 1, 0, false);
            declareFunction("rdfs_namespace", "RDFS-NAMESPACE", 0, 0, false);
            declareFunction("clear_rdfs_expanded_name", "CLEAR-RDFS-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_rdfs_expanded_name", "REMOVE-RDFS-EXPANDED-NAME", 1, 0, false);
            declareFunction("rdfs_expanded_name_internal", "RDFS-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("rdfs_expanded_name", "RDFS-EXPANDED-NAME", 1, 0, false);
            declareFunction("clear_rdfs_name", "CLEAR-RDFS-NAME", 0, 0, false);
            declareFunction("remove_rdfs_name", "REMOVE-RDFS-NAME", 1, 0, false);
            declareFunction("rdfs_name_internal", "RDFS-NAME-INTERNAL", 1, 0, false);
            declareFunction("rdfs_name", "RDFS-NAME", 1, 0, false);
            declareFunction("rdfs_namespace_uriP", "RDFS-NAMESPACE-URI?", 1, 0, false);
            declareFunction("skos_core_namespace", "SKOS-CORE-NAMESPACE", 0, 0, false);
            declareFunction("clear_skos_expanded_name", "CLEAR-SKOS-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_skos_expanded_name", "REMOVE-SKOS-EXPANDED-NAME", 1, 0, false);
            declareFunction("skos_expanded_name_internal", "SKOS-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("skos_expanded_name", "SKOS-EXPANDED-NAME", 1, 0, false);
            declareFunction("clear_skos_name", "CLEAR-SKOS-NAME", 0, 0, false);
            declareFunction("remove_skos_name", "REMOVE-SKOS-NAME", 1, 0, false);
            declareFunction("skos_name_internal", "SKOS-NAME-INTERNAL", 1, 0, false);
            declareFunction("skos_name", "SKOS-NAME", 1, 0, false);
            declareFunction("skos_core_namespace_uriP", "SKOS-CORE-NAMESPACE-URI?", 1, 0, false);
            declareFunction("foaf_namespace", "FOAF-NAMESPACE", 0, 0, false);
            declareFunction("clear_foaf_expanded_name", "CLEAR-FOAF-EXPANDED-NAME", 0, 0, false);
            declareFunction("remove_foaf_expanded_name", "REMOVE-FOAF-EXPANDED-NAME", 1, 0, false);
            declareFunction("foaf_expanded_name_internal", "FOAF-EXPANDED-NAME-INTERNAL", 1, 0, false);
            declareFunction("foaf_expanded_name", "FOAF-EXPANDED-NAME", 1, 0, false);
            declareFunction("clear_foaf_name", "CLEAR-FOAF-NAME", 0, 0, false);
            declareFunction("remove_foaf_name", "REMOVE-FOAF-NAME", 1, 0, false);
            declareFunction("foaf_name_internal", "FOAF-NAME-INTERNAL", 1, 0, false);
            declareFunction("foaf_name", "FOAF-NAME", 1, 0, false);
            declareFunction("foaf_namespace_uriP", "FOAF-NAMESPACE-URI?", 1, 0, false);
            declareFunction("rdf_label_properties", "RDF-LABEL-PROPERTIES", 0, 1, false);
            declareFunction("cyc_pretty_string_uris", "CYC-PRETTY-STRING-URIS", 0, 0, false);
            declareFunction("clear_rdf_standard_prefix_for_namespace", "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 0, 0, false);
            declareFunction("remove_rdf_standard_prefix_for_namespace", "REMOVE-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
            declareFunction("rdf_standard_prefix_for_namespace_internal", "RDF-STANDARD-PREFIX-FOR-NAMESPACE-INTERNAL", 1, 0, false);
            declareFunction("rdf_standard_prefix_for_namespace", "RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
            declareFunction("rdf_canonicalize_xml_string", "RDF-CANONICALIZE-XML-STRING", 1, 0, false);
            declareFunction("exclusive_canonical_xml_from_sexprs", "EXCLUSIVE-CANONICAL-XML-FROM-SEXPRS", 1, 1, false);
            declareFunction("exclusive_canonicalize_xml_sexprs", "EXCLUSIVE-CANONICALIZE-XML-SEXPRS", 1, 1, false);
            declareFunction("exclusive_canonicalize_xml_sexpr", "EXCLUSIVE-CANONICALIZE-XML-SEXPR", 1, 1, false);
            declareFunction("exclusive_canonicalize_xml_sexpr_internal", "EXCLUSIVE-CANONICALIZE-XML-SEXPR-INTERNAL", 2, 0, false);
            declareFunction("get_namespace_key", "GET-NAMESPACE-KEY", 1, 0, false);
            declareFunction("xmlns_from_attribute_lists", "XMLNS-FROM-ATTRIBUTE-LISTS", 2, 0, false);
            declareFunction("rdf_find_or_create_term_for_node", "RDF-FIND-OR-CREATE-TERM-FOR-NODE", 2, 0, false);
            declareFunction("rdf_find_or_create_term_for_uri", "RDF-FIND-OR-CREATE-TERM-FOR-URI", 1, 0, false);
            declareFunction("rdf_find_term_for_uri", "RDF-FIND-TERM-FOR-URI", 1, 0, false);
            declareFunction("rdf_find_or_create_term_for_literal", "RDF-FIND-OR-CREATE-TERM-FOR-LITERAL", 1, 0, false);
            declareFunction("rdf_find_or_create_term_for_list_node", "RDF-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
            declareFunction("rdf_list_node_terms", "RDF-LIST-NODE-TERMS", 2, 0, false);
            declareFunction("rdf_list_nodes", "RDF-LIST-NODES", 2, 0, false);
            declareFunction("rdf_list_p", "RDF-LIST-P", 2, 0, false);
            declareFunction("rdf_graph_remove_node", "RDF-GRAPH-REMOVE-NODE", 2, 0, false);
            declareFunction("rdf_graph_remove_list", "RDF-GRAPH-REMOVE-LIST", 2, 0, false);
            declareFunction("download_rdf_url", "DOWNLOAD-RDF-URL", 1, 1, false);
            declareFunction("rdf_uri_to_cyc_term", "RDF-URI-TO-CYC-TERM", 1, 0, false);
            declareFunction("cycl_date_from_rdf_date", "CYCL-DATE-FROM-RDF-DATE", 1, 0, false);
            declareFunction("cyc_term_from_other_uri_internal", "CYC-TERM-FROM-OTHER-URI-INTERNAL", 1, 0, false);
            declareFunction("cyc_term_from_other_uri", "CYC-TERM-FROM-OTHER-URI", 1, 0, false);
            declareFunction("cyc_term_from_cyc_rdf_uri", "CYC-TERM-FROM-CYC-RDF-URI", 1, 0, false);
            declareFunction("find_id_from_cyc_uri_string", "FIND-ID-FROM-CYC-URI-STRING", 1, 0, false);
            declareFunction("rdf_uris_for_cyc_term", "RDF-URIS-FOR-CYC-TERM", 1, 2, false);
            declareFunction("stringify_cyc_uri", "STRINGIFY-CYC-URI", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("pretty_print_subject_triples", "PRETTY-PRINT-SUBJECT-TRIPLES", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_rdf_utilities_file_Previous() {
        declareFunction("clear_rdf_caches", "CLEAR-RDF-CACHES", 0, 0, false);
        declareFunction("rdf_namespace", "RDF-NAMESPACE", 0, 0, false);
        declareFunction("clear_rdf_expanded_name", "CLEAR-RDF-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_rdf_expanded_name", "REMOVE-RDF-EXPANDED-NAME", 1, 0, false);
        declareFunction("rdf_expanded_name_internal", "RDF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdf_expanded_name", "RDF-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_rdf_name", "CLEAR-RDF-NAME", 0, 0, false);
        declareFunction("remove_rdf_name", "REMOVE-RDF-NAME", 1, 0, false);
        declareFunction("rdf_name_internal", "RDF-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdf_name", "RDF-NAME", 1, 0, false);
        declareFunction("rdf_namespace_uriP", "RDF-NAMESPACE-URI?", 1, 0, false);
        declareFunction("xsd_namespace", "XSD-NAMESPACE", 0, 0, false);
        declareFunction("clear_xsd_expanded_name", "CLEAR-XSD-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_xsd_expanded_name", "REMOVE-XSD-EXPANDED-NAME", 1, 0, false);
        declareFunction("xsd_expanded_name_internal", "XSD-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("xsd_expanded_name", "XSD-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_xsd_name", "CLEAR-XSD-NAME", 0, 0, false);
        declareFunction("remove_xsd_name", "REMOVE-XSD-NAME", 1, 0, false);
        declareFunction("xsd_name_internal", "XSD-NAME-INTERNAL", 1, 0, false);
        declareFunction("xsd_name", "XSD-NAME", 1, 0, false);
        declareFunction("xsd_namespace_uriP", "XSD-NAMESPACE-URI?", 1, 0, false);
        declareFunction("rdfs_namespace", "RDFS-NAMESPACE", 0, 0, false);
        declareFunction("clear_rdfs_expanded_name", "CLEAR-RDFS-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_rdfs_expanded_name", "REMOVE-RDFS-EXPANDED-NAME", 1, 0, false);
        declareFunction("rdfs_expanded_name_internal", "RDFS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdfs_expanded_name", "RDFS-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_rdfs_name", "CLEAR-RDFS-NAME", 0, 0, false);
        declareFunction("remove_rdfs_name", "REMOVE-RDFS-NAME", 1, 0, false);
        declareFunction("rdfs_name_internal", "RDFS-NAME-INTERNAL", 1, 0, false);
        declareFunction("rdfs_name", "RDFS-NAME", 1, 0, false);
        declareFunction("rdfs_namespace_uriP", "RDFS-NAMESPACE-URI?", 1, 0, false);
        declareFunction("skos_core_namespace", "SKOS-CORE-NAMESPACE", 0, 0, false);
        declareFunction("clear_skos_expanded_name", "CLEAR-SKOS-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_skos_expanded_name", "REMOVE-SKOS-EXPANDED-NAME", 1, 0, false);
        declareFunction("skos_expanded_name_internal", "SKOS-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("skos_expanded_name", "SKOS-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_skos_name", "CLEAR-SKOS-NAME", 0, 0, false);
        declareFunction("remove_skos_name", "REMOVE-SKOS-NAME", 1, 0, false);
        declareFunction("skos_name_internal", "SKOS-NAME-INTERNAL", 1, 0, false);
        declareFunction("skos_name", "SKOS-NAME", 1, 0, false);
        declareFunction("skos_core_namespace_uriP", "SKOS-CORE-NAMESPACE-URI?", 1, 0, false);
        declareFunction("foaf_namespace", "FOAF-NAMESPACE", 0, 0, false);
        declareFunction("clear_foaf_expanded_name", "CLEAR-FOAF-EXPANDED-NAME", 0, 0, false);
        declareFunction("remove_foaf_expanded_name", "REMOVE-FOAF-EXPANDED-NAME", 1, 0, false);
        declareFunction("foaf_expanded_name_internal", "FOAF-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction("foaf_expanded_name", "FOAF-EXPANDED-NAME", 1, 0, false);
        declareFunction("clear_foaf_name", "CLEAR-FOAF-NAME", 0, 0, false);
        declareFunction("remove_foaf_name", "REMOVE-FOAF-NAME", 1, 0, false);
        declareFunction("foaf_name_internal", "FOAF-NAME-INTERNAL", 1, 0, false);
        declareFunction("foaf_name", "FOAF-NAME", 1, 0, false);
        declareFunction("foaf_namespace_uriP", "FOAF-NAMESPACE-URI?", 1, 0, false);
        declareFunction("rdf_label_properties", "RDF-LABEL-PROPERTIES", 0, 1, false);
        declareFunction("cyc_pretty_string_uris", "CYC-PRETTY-STRING-URIS", 0, 0, false);
        declareFunction("clear_rdf_standard_prefix_for_namespace", "CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 0, 0, false);
        declareFunction("remove_rdf_standard_prefix_for_namespace", "REMOVE-RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        declareFunction("rdf_standard_prefix_for_namespace_internal", "RDF-STANDARD-PREFIX-FOR-NAMESPACE-INTERNAL", 1, 0, false);
        declareFunction("rdf_standard_prefix_for_namespace", "RDF-STANDARD-PREFIX-FOR-NAMESPACE", 1, 0, false);
        declareFunction("rdf_canonicalize_xml_string", "RDF-CANONICALIZE-XML-STRING", 1, 0, false);
        declareFunction("exclusive_canonical_xml_from_sexprs", "EXCLUSIVE-CANONICAL-XML-FROM-SEXPRS", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexprs", "EXCLUSIVE-CANONICALIZE-XML-SEXPRS", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexpr", "EXCLUSIVE-CANONICALIZE-XML-SEXPR", 1, 1, false);
        declareFunction("exclusive_canonicalize_xml_sexpr_internal", "EXCLUSIVE-CANONICALIZE-XML-SEXPR-INTERNAL", 2, 0, false);
        declareFunction("get_namespace_key", "GET-NAMESPACE-KEY", 1, 0, false);
        declareFunction("xmlns_from_attribute_lists", "XMLNS-FROM-ATTRIBUTE-LISTS", 2, 0, false);
        declareFunction("rdf_find_or_create_term_for_node", "RDF-FIND-OR-CREATE-TERM-FOR-NODE", 2, 0, false);
        declareFunction("rdf_find_or_create_term_for_uri", "RDF-FIND-OR-CREATE-TERM-FOR-URI", 1, 0, false);
        declareFunction("rdf_find_term_for_uri", "RDF-FIND-TERM-FOR-URI", 1, 0, false);
        declareFunction("rdf_find_or_create_term_for_literal", "RDF-FIND-OR-CREATE-TERM-FOR-LITERAL", 1, 0, false);
        declareFunction("rdf_find_or_create_term_for_list_node", "RDF-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
        declareFunction("rdf_list_node_terms", "RDF-LIST-NODE-TERMS", 2, 0, false);
        declareFunction("rdf_list_nodes", "RDF-LIST-NODES", 2, 0, false);
        declareFunction("rdf_list_p", "RDF-LIST-P", 2, 0, false);
        declareFunction("rdf_graph_remove_node", "RDF-GRAPH-REMOVE-NODE", 2, 0, false);
        declareFunction("rdf_graph_remove_list", "RDF-GRAPH-REMOVE-LIST", 2, 0, false);
        declareFunction("download_rdf_url", "DOWNLOAD-RDF-URL", 1, 1, false);
        declareFunction("rdf_uri_to_cyc_term", "RDF-URI-TO-CYC-TERM", 1, 0, false);
        declareFunction("cycl_date_from_rdf_date", "CYCL-DATE-FROM-RDF-DATE", 1, 0, false);
        declareFunction("cyc_term_from_other_uri_internal", "CYC-TERM-FROM-OTHER-URI-INTERNAL", 1, 0, false);
        declareFunction("cyc_term_from_other_uri", "CYC-TERM-FROM-OTHER-URI", 1, 0, false);
        declareFunction("cyc_term_from_cyc_rdf_uri", "CYC-TERM-FROM-CYC-RDF-URI", 1, 0, false);
        declareFunction("find_id_from_cyc_uri_string", "FIND-ID-FROM-CYC-URI-STRING", 1, 0, false);
        declareFunction("rdf_uris_for_cyc_term", "RDF-URIS-FOR-CYC-TERM", 1, 2, false);
        declareFunction("stringify_cyc_uri", "STRINGIFY-CYC-URI", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$http___www_w3_org_1999_02_22_rdf_ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");

    public static final SubLSymbol $kw3$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt5$rdf_ = makeString("rdf:");

    static private final SubLString $str_alt7$http___www_w3_org_2001_XMLSchema_ = makeString("http://www.w3.org/2001/XMLSchema#");

    static private final SubLString $str_alt11$xsd_ = makeString("xsd:");

    static private final SubLString $str_alt13$http___www_w3_org_2000_01_rdf_sch = makeString("http://www.w3.org/2000/01/rdf-schema#");

    static private final SubLString $str_alt17$rdfs_ = makeString("rdfs:");

    static private final SubLString $str_alt19$http___www_w3_org_2004_02_skos_co = makeString("http://www.w3.org/2004/02/skos/core#");

    static private final SubLString $str_alt23$skos_ = makeString("skos:");

    static private final SubLString $str_alt25$http___xmlns_com_foaf_0_1_ = makeString("http://xmlns.com/foaf/0.1/");

    static private final SubLString $str_alt29$foaf_ = makeString("foaf:");

    static private final SubLString $str_alt44$xmlns_ = makeString("xmlns:");

    public static final SubLObject init_rdf_utilities_file_alt() {
        deflexical("*RDF-NAMESPACE*", $str_alt0$http___www_w3_org_1999_02_22_rdf_);
        deflexical("*RDF-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*RDF-NAME-CACHING-STATE*", NIL);
        deflexical("*XSD-NAMESPACE*", $str_alt7$http___www_w3_org_2001_XMLSchema_);
        deflexical("*XSD-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*XSD-NAME-CACHING-STATE*", NIL);
        deflexical("*RDFS-NAMESPACE*", $str_alt13$http___www_w3_org_2000_01_rdf_sch);
        deflexical("*RDFS-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*RDFS-NAME-CACHING-STATE*", NIL);
        deflexical("*SKOS-CORE-NAMESPACE*", $str_alt19$http___www_w3_org_2004_02_skos_co);
        deflexical("*SKOS-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*SKOS-NAME-CACHING-STATE*", NIL);
        deflexical("*FOAF-NAMESPACE*", $str_alt25$http___xmlns_com_foaf_0_1_);
        deflexical("*FOAF-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*FOAF-NAME-CACHING-STATE*", NIL);
        deflexical("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_rdf_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RDF-NAMESPACE*", $str0$http___www_w3_org_1999_02_22_rdf_);
            deflexical("*RDF-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*RDF-NAME-CACHING-STATE*", NIL);
            deflexical("*XSD-NAMESPACE*", $str6$http___www_w3_org_2001_XMLSchema_);
            deflexical("*XSD-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*XSD-NAME-CACHING-STATE*", NIL);
            deflexical("*RDFS-NAMESPACE*", $str12$http___www_w3_org_2000_01_rdf_sch);
            deflexical("*RDFS-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*RDFS-NAME-CACHING-STATE*", NIL);
            deflexical("*SKOS-CORE-NAMESPACE*", $str18$http___www_w3_org_2004_02_skos_co);
            deflexical("*SKOS-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*SKOS-NAME-CACHING-STATE*", NIL);
            deflexical("*FOAF-NAMESPACE*", $str24$http___xmlns_com_foaf_0_1_);
            deflexical("*FOAF-EXPANDED-NAME-CACHING-STATE*", NIL);
            deflexical("*FOAF-NAME-CACHING-STATE*", NIL);
            deflexical("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*XSD-NAMESPACE*", $str_alt7$http___www_w3_org_2001_XMLSchema_);
            deflexical("*RDFS-NAMESPACE*", $str_alt13$http___www_w3_org_2000_01_rdf_sch);
            deflexical("*SKOS-CORE-NAMESPACE*", $str_alt19$http___www_w3_org_2004_02_skos_co);
            deflexical("*FOAF-NAMESPACE*", $str_alt25$http___xmlns_com_foaf_0_1_);
        }
        return NIL;
    }

    public static SubLObject init_rdf_utilities_file_Previous() {
        deflexical("*RDF-NAMESPACE*", $str0$http___www_w3_org_1999_02_22_rdf_);
        deflexical("*RDF-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*RDF-NAME-CACHING-STATE*", NIL);
        deflexical("*XSD-NAMESPACE*", $str6$http___www_w3_org_2001_XMLSchema_);
        deflexical("*XSD-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*XSD-NAME-CACHING-STATE*", NIL);
        deflexical("*RDFS-NAMESPACE*", $str12$http___www_w3_org_2000_01_rdf_sch);
        deflexical("*RDFS-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*RDFS-NAME-CACHING-STATE*", NIL);
        deflexical("*SKOS-CORE-NAMESPACE*", $str18$http___www_w3_org_2004_02_skos_co);
        deflexical("*SKOS-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*SKOS-NAME-CACHING-STATE*", NIL);
        deflexical("*FOAF-NAMESPACE*", $str24$http___xmlns_com_foaf_0_1_);
        deflexical("*FOAF-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*FOAF-NAME-CACHING-STATE*", NIL);
        deflexical("*RDF-STANDARD-PREFIX-FOR-NAMESPACE-CACHING-STATE*", NIL);
        return NIL;
    }

    static private final SubLSymbol $sym46$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt47$Can_t_find_or_create_term_for__S = makeString("Can't find or create term for ~S");

    static private final SubLSymbol $sym51$_TERM = makeSymbol("?TERM");

    static private final SubLList $list_alt54 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    static private final SubLString $str_alt55$_S_is_not_a_list_node_ = makeString("~S is not a list node.");

    public static SubLObject setup_rdf_utilities_file() {
        memoization_state.note_globally_cached_function(RDF_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(RDF_NAME);
        memoization_state.note_globally_cached_function(XSD_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(XSD_NAME);
        memoization_state.note_globally_cached_function(RDFS_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(RDFS_NAME);
        memoization_state.note_globally_cached_function(SKOS_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(SKOS_NAME);
        memoization_state.note_globally_cached_function(FOAF_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(FOAF_NAME);
        memoization_state.note_globally_cached_function(RDF_STANDARD_PREFIX_FOR_NAMESPACE);
        memoization_state.note_memoized_function(CYC_TERM_FROM_OTHER_URI);
        return NIL;
    }

    private static final SubLSymbol URL_P = makeSymbol("URL-P");

    static private final SubLList $list_alt63 = list(makeString("application/rdf+xml"), makeString("*/*;q=0.5"));

    static private final SubLString $str_alt65$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLInteger $int$2000 = makeInteger(2000);

    static private final SubLString $$$404 = makeString("404");

    static private final SubLString $$$Not_Found = makeString("Not Found");

    @Override
    public void declareFunctions() {
        declare_rdf_utilities_file();
    }

    static private final SubLString $str_alt69$Url_not_found_ = makeString("Url not found.");

    @Override
    public void initializeVariables() {
        init_rdf_utilities_file();
    }

    static private final SubLString $str_alt70$503_Service_Temporarily_Unavailab = makeString("503 Service Temporarily Unavailable");

    @Override
    public void runTopLevelForms() {
        setup_rdf_utilities_file();
    }

    static private final SubLString $$$Server_not_available = makeString("Server not available");

    

    static private final SubLString $str_alt72$__xml = makeString("<?xml");

    static private final SubLString $str_alt73$Not_XML_document__Starts_with_ = makeString("Not XML document. Starts with ");

    static private final SubLString $str_alt74$Encountered_error_trying_to_downl = makeString("Encountered error trying to download ~S:~% ~S");

    static private final SubLList $list_alt79 = list(reader_make_constant_shell("SchemaObjectFn"), makeKeyword("ANYTHING"), makeKeyword("STRING"));

    static private final SubLString $str_alt80$_ = makeString("<");

    static private final SubLString $str_alt81$_ = makeString(">");

    static private final SubLList $list_alt82 = list(reader_make_constant_shell("ResourceWithURIFn"), list($TEST, makeSymbol("URI-P")));

    static private final SubLList $list_alt84 = list(reader_make_constant_shell("URLFn"), reader_make_constant_shell("URIFn"));

    static private final SubLString $str_alt85$_____S__ = makeString("~&  ~S~%");

    static private final SubLString $str_alt86$_______S__ = makeString("~&    ~S~%");
}

/**
 * Total time: 312 ms
 */
