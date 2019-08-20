/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup_without_values;
import static com.cyc.cycjava.cycl.dictionary.dictionary_remove;
import static com.cyc.cycjava.cycl.dictionary.dictionary_values;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary_iterator;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_delete_from_value;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_increment;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.dictionary_utilities.sort_dictionary_by_values;
import static com.cyc.cycjava.cycl.file_utilities.file_existsP;
import static com.cyc.cycjava.cycl.format_nil.force_format;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s_no_copy;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.integer_sequence_generator.integer_sequence_generator_next;
import static com.cyc.cycjava.cycl.integer_sequence_generator.new_integer_sequence_generator;
import static com.cyc.cycjava.cycl.iteration.iteration_done;
import static com.cyc.cycjava.cycl.iteration.iteration_next;
import static com.cyc.cycjava.cycl.iteration.new_iterator;
import static com.cyc.cycjava.cycl.iteration.new_list_iterator;
import static com.cyc.cycjava.cycl.kb_accessors.comment;
import static com.cyc.cycjava.cycl.list_utilities.alist_enter;
import static com.cyc.cycjava.cycl.list_utilities.alist_reverse_lookup_without_values;
import static com.cyc.cycjava.cycl.list_utilities.doubletonP;
import static com.cyc.cycjava.cycl.list_utilities.empty_list_p;
import static com.cyc.cycjava.cycl.list_utilities.last_one;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.list_utilities.lengthGE;
import static com.cyc.cycjava.cycl.list_utilities.non_empty_list_p;
import static com.cyc.cycjava.cycl.list_utilities.position_from_end;
import static com.cyc.cycjava.cycl.list_utilities.same_length_p;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_possibly_clear_original_process;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.new_memoization_state;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_4;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.number_utilities.maximum;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.cyc_uri_p;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.owl_cyc_latest_uri_for_fort;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.owl_cyc_uri_for_fort;
import static com.cyc.cycjava.cycl.owl.owl_utilities.implementation_uriP;
import static com.cyc.cycjava.cycl.owl.owl_utilities.owl_expanded_name;
import static com.cyc.cycjava.cycl.owl.owl_utilities.owl_namespace_uriP;
import static com.cyc.cycjava.cycl.owl.owl_utilities.rdf_graph_node_abbreviation_string;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_canonicalize_xml_string;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_expanded_name;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_label_properties;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_namespace;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_standard_prefix_for_namespace;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdf_uris_for_cyc_term;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.rdfs_expanded_name;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.new_set_iterator;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.set.set_p;
import static com.cyc.cycjava.cycl.set.set_remove;
import static com.cyc.cycjava.cycl.set.set_size;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.string_utilities.$empty_string$;
import static com.cyc.cycjava.cycl.string_utilities.contains_charP;
import static com.cyc.cycjava.cycl.string_utilities.empty_string_p;
import static com.cyc.cycjava.cycl.string_utilities.non_empty_stringP;
import static com.cyc.cycjava.cycl.string_utilities.pre_remove;
import static com.cyc.cycjava.cycl.string_utilities.starts_with;
import static com.cyc.cycjava.cycl.string_utilities.string_tokenize;
import static com.cyc.cycjava.cycl.string_utilities.substring;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.unicode_nauts.unicode_substringP;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.web_utilities.uri_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.owl.owl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-GRAPH
 * source file: /cyc/top/cycl/rdf/rdf-graph.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_graph extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rdf_graph();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $loaded_rdf_graphs$ = makeSymbol("*LOADED-RDF-GRAPHS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $loaded_rdf_graphs_lock$ = makeSymbol("*LOADED-RDF-GRAPHS-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rdf_graph_literal_indexing_enabledP$ = makeSymbol("*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rdf_graph_converted_triples$ = makeSymbol("*RDF-GRAPH-CONVERTED-TRIPLES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $target_max_loaded_rdf_triple_count$ = makeSymbol("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rdf_graph$ = makeSymbol("*DTP-RDF-GRAPH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdf_graph_internal_triple_comparison_test$ = makeSymbol("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdf_graph_internal_node_comparison_test$ = makeSymbol("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rdf_graph_index$ = makeSymbol("*DTP-RDF-GRAPH-INDEX*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $graph2_matched_triples$ = makeSymbol("*GRAPH2-MATCHED-TRIPLES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rdf_triples_assumed_isomophic$ = makeSymbol("*RDF-TRIPLES-ASSUMED-ISOMOPHIC*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Loaded_RDF_Graphs = makeString("Loaded RDF Graphs");

    private static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    private static final SubLSymbol VALID_RDF_SUBJECT_P = makeSymbol("VALID-RDF-SUBJECT-P");

    private static final SubLSymbol VALID_RDF_PREDICATE_P = makeSymbol("VALID-RDF-PREDICATE-P");

    private static final SubLSymbol VALID_RDF_OBJECT_P = makeSymbol("VALID-RDF-OBJECT-P");

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $$$comment = makeString("comment");

    private static final SubLSymbol RDF_TRIPLE_P = makeSymbol("RDF-TRIPLE-P");

    private static final SubLSymbol $sym10$RDF_TRIPLES_EQUAL_ = makeSymbol("RDF-TRIPLES-EQUAL?");

    private static final SubLSymbol COPY_RDF_TRIPLE = makeSymbol("COPY-RDF-TRIPLE");

    private static final SubLSymbol VALID_RDF_LITERAL_DATATYPE_P = makeSymbol("VALID-RDF-LITERAL-DATATYPE-P");

    private static final SubLSymbol FORT_OR_RDF_URI_P = makeSymbol("FORT-OR-RDF-URI-P");

    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$sameAs = makeString("sameAs");

    private static final SubLString $$$Class = makeString("Class");

    private static final SubLString $str19$Ranking_classes_by_transitive_ins = makeString("Ranking classes by transitive instance count...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym22$_ = makeSymbol(">");

    private static final SubLString $$$subClassOf = makeString("subClassOf");

    private static final SubLList $list25 = list(list(makeSymbol("NODE"), makeSymbol("GRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_READER_LOCK = makeSymbol("WITH-READER-LOCK");

    private static final SubLSymbol GET_RDF_GRAPH_LOCK = makeSymbol("GET-RDF-GRAPH-LOCK");

    private static final SubLSymbol RDF_GRAPH_NODE_ITERATOR = makeSymbol("RDF-GRAPH-NODE-ITERATOR");

    private static final SubLSymbol RDF_GRAPH_DO_NODES = makeSymbol("RDF-GRAPH-DO-NODES");

    private static final SubLSymbol ITERATE_RDF_GRAPH_NODES_DONE = makeSymbol("ITERATE-RDF-GRAPH-NODES-DONE");

    private static final SubLSymbol ITERATE_RDF_GRAPH_NODES_NEXT = makeSymbol("ITERATE-RDF-GRAPH-NODES-NEXT");

    private static final SubLString $str33$_S_already_exists_ = makeString("~S already exists.");

    private static final SubLString $str35$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Dumping_RDF_graph_to_ = makeString("Dumping RDF graph to ");

    private static final SubLString $str37$___ = makeString("...");

    static private final SubLList $list38 = list(list(makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list39 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLList $list42 = list(makeSymbol("*LOADED-RDF-GRAPHS-LOCK*"));

    private static final SubLList $list43 = list(makeSymbol("LOADED-RDF-GRAPHS"));

    private static final SubLSymbol LOADED_RDF_GRAPHS = makeSymbol("LOADED-RDF-GRAPHS");

    private static final SubLSymbol DO_LOADED_RDF_GRAPHS = makeSymbol("DO-LOADED-RDF-GRAPHS");

    private static final SubLList $list46 = list(list(makeSymbol("SUBJECT"), makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym47$TRIPLE = makeUninternedSymbol("TRIPLE");

    private static final SubLSymbol $sym48$DONE_SUBJECTS = makeUninternedSymbol("DONE-SUBJECTS");

    static private final SubLList $list50 = list(list(makeSymbol("NEW-SET")));

    private static final SubLSymbol RDF_GRAPH_TRIPLES_ITERATOR = makeSymbol("RDF-GRAPH-TRIPLES-ITERATOR");

    private static final SubLSymbol RDF_TRIPLE_SUBJECT = makeSymbol("RDF-TRIPLE-SUBJECT");

    private static final SubLList $list55 = list(list(makeSymbol("TRIPLE"), makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    private static final SubLSymbol RDF_GRAPH_TOPIC = makeSymbol("RDF-GRAPH-TOPIC");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$Ontology = makeString("Ontology");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol $rdf_blank_node_isg$ = makeSymbol("*RDF-BLANK-NODE-ISG*");

    private static final SubLSymbol RDF_GRAPH_GET_BLANK_NODE_CACHED = makeSymbol("RDF-GRAPH-GET-BLANK-NODE-CACHED");

    private static final SubLSymbol $rdf_graph_get_blank_node_cached_caching_state$ = makeSymbol("*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*");

    private static final SubLSymbol RDF_GRAPH_GET_LITERAL_CACHED = makeSymbol("RDF-GRAPH-GET-LITERAL-CACHED");

    private static final SubLSymbol $rdf_graph_get_literal_cached_caching_state$ = makeSymbol("*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*");

    private static final SubLString $$$XMLLiteral = makeString("XMLLiteral");

    private static final SubLSymbol $sym70$RDF_NODES_EQUAL_ = makeSymbol("RDF-NODES-EQUAL?");

    private static final SubLSymbol RDF_GRAPH = makeSymbol("RDF-GRAPH");

    private static final SubLList $list72 = list(new SubLObject[]{ makeSymbol("TRIPLES"), makeSymbol("NODES"), makeSymbol("INDEX"), makeSymbol("LOCK"), makeSymbol("NODE-COUNT"), makeSymbol("PREFIX-MAP"), makeSymbol("FILE-LOCATION"), makeSymbol("TOPIC"), makeSymbol("FOCAL-NODES") });

    private static final SubLList $list73 = list(new SubLObject[]{ makeKeyword("TRIPLES"), makeKeyword("NODES"), makeKeyword("INDEX"), $LOCK, makeKeyword("NODE-COUNT"), makeKeyword("PREFIX-MAP"), makeKeyword("FILE-LOCATION"), makeKeyword("TOPIC"), makeKeyword("FOCAL-NODES") });

    private static final SubLList $list74 = list(new SubLObject[]{ makeSymbol("RDF-GRAPH-STRUCT-TRIPLES"), makeSymbol("RDF-GRAPH-STRUCT-NODES"), makeSymbol("RDF-GRAPH-STRUCT-INDEX"), makeSymbol("RDF-GRAPH-STRUCT-LOCK"), makeSymbol("RDF-GRAPH-STRUCT-NODE-COUNT"), makeSymbol("RDF-GRAPH-STRUCT-PREFIX-MAP"), makeSymbol("RDF-GRAPH-STRUCT-FILE-LOCATION"), makeSymbol("RDF-GRAPH-STRUCT-TOPIC"), makeSymbol("RDF-GRAPH-STRUCT-FOCAL-NODES") });

    private static final SubLList $list75 = list(new SubLObject[]{ makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TRIPLES"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODES"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-LOCK"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TOPIC"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES") });

    private static final SubLSymbol PRINT_RDF_GRAPH = makeSymbol("PRINT-RDF-GRAPH");

    private static final SubLSymbol RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-GRAPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list78 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-GRAPH-P"));

    private static final SubLSymbol RDF_GRAPH_STRUCT_TRIPLES = makeSymbol("RDF-GRAPH-STRUCT-TRIPLES");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_TRIPLES = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TRIPLES");

    private static final SubLSymbol RDF_GRAPH_STRUCT_NODES = makeSymbol("RDF-GRAPH-STRUCT-NODES");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_NODES = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODES");

    private static final SubLSymbol RDF_GRAPH_STRUCT_INDEX = makeSymbol("RDF-GRAPH-STRUCT-INDEX");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_INDEX = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-INDEX");

    private static final SubLSymbol RDF_GRAPH_STRUCT_LOCK = makeSymbol("RDF-GRAPH-STRUCT-LOCK");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_LOCK = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-LOCK");

    private static final SubLSymbol RDF_GRAPH_STRUCT_NODE_COUNT = makeSymbol("RDF-GRAPH-STRUCT-NODE-COUNT");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_NODE_COUNT = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT");

    private static final SubLSymbol RDF_GRAPH_STRUCT_PREFIX_MAP = makeSymbol("RDF-GRAPH-STRUCT-PREFIX-MAP");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP");

    private static final SubLSymbol RDF_GRAPH_STRUCT_FILE_LOCATION = makeSymbol("RDF-GRAPH-STRUCT-FILE-LOCATION");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION");

    private static final SubLSymbol RDF_GRAPH_STRUCT_TOPIC = makeSymbol("RDF-GRAPH-STRUCT-TOPIC");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_TOPIC = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TOPIC");

    private static final SubLSymbol RDF_GRAPH_STRUCT_FOCAL_NODES = makeSymbol("RDF-GRAPH-STRUCT-FOCAL-NODES");

    private static final SubLSymbol _CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES = makeSymbol("_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES");

    private static final SubLString $str106$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RDF_GRAPH = makeSymbol("MAKE-RDF-GRAPH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-METHOD");

    private static final SubLString $str112$_RDF_GRAPH__A_ = makeString("<RDF-GRAPH ~A>");

    private static final SubLString $$$RDF_GRAPH = makeString("RDF GRAPH");

    private static final SubLSymbol RDF_GRAPH_DO_SUBJECTS = makeSymbol("RDF-GRAPH-DO-SUBJECTS");

    private static final SubLList $list115 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLString $str117$xml_base = makeString("xml:base");

    private static final SubLString $str118$xmlns_ = makeString("xmlns:");

    private static final SubLSymbol URI_P = makeSymbol("URI-P");

    private static final SubLString $str120$_ = makeString(":");

    private static final SubLString $$$en = makeString("en");

    private static final SubLSymbol RDF_LITERAL_LANGUAGE_TAG = makeSymbol("RDF-LITERAL-LANGUAGE-TAG");

    private static final SubLString $$$http = makeString("http");

    private static final SubLSymbol SXHASH_RDF_GRAPH_METHOD = makeSymbol("SXHASH-RDF-GRAPH-METHOD");

    private static final SubLSymbol RDF_GRAPH_INDEX_SUB_INDEXES = makeSymbol("RDF-GRAPH-INDEX-SUB-INDEXES");

    private static final SubLSymbol $rdf_graph_index_sub_indexes_caching_state$ = makeSymbol("*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*");

    private static final SubLSymbol RDF_TRIPLE_POSITION_P = makeSymbol("RDF-TRIPLE-POSITION-P");

    private static final SubLSymbol SET_ELEMENT_LIST = makeSymbol("SET-ELEMENT-LIST");

    private static final SubLSymbol RDF_GRAPH_INDEX = makeSymbol("RDF-GRAPH-INDEX");

    private static final SubLSymbol RDF_GRAPH_INDEX_P = makeSymbol("RDF-GRAPH-INDEX-P");

    private static final SubLList $list132 = list(makeSymbol("SUBJECT-INDEX"), makeSymbol("PREDICATE-INDEX"), makeSymbol("OBJECT-INDEX"));

    private static final SubLList $list133 = list(makeKeyword("SUBJECT-INDEX"), makeKeyword("PREDICATE-INDEX"), makeKeyword("OBJECT-INDEX"));

    private static final SubLList $list134 = list(makeSymbol("RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX"), makeSymbol("RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX"), makeSymbol("RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX"));

    private static final SubLList $list135 = list(makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX"));

    private static final SubLSymbol PRINT_RDF_GRAPH_INDEX = makeSymbol("PRINT-RDF-GRAPH-INDEX");

    private static final SubLSymbol RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-GRAPH-INDEX-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list138 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-GRAPH-INDEX-P"));

    private static final SubLSymbol RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX = makeSymbol("RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX");

    private static final SubLSymbol _CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX = makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX");

    private static final SubLSymbol RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX = makeSymbol("RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX");

    private static final SubLSymbol _CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX = makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX");

    private static final SubLSymbol RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX = makeSymbol("RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX");

    private static final SubLSymbol _CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX = makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX");

    private static final SubLSymbol MAKE_RDF_GRAPH_INDEX = makeSymbol("MAKE-RDF-GRAPH-INDEX");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-INDEX-METHOD");

    private static final SubLString $str150$_RDF_GRAPH_INDEX_ = makeString("<RDF-GRAPH-INDEX>");

    private static final SubLSymbol SXHASH_RDF_GRAPH_INDEX_METHOD = makeSymbol("SXHASH-RDF-GRAPH-INDEX-METHOD");

    private static final SubLString $str152$______A__A__A___ = makeString("~&  (~A ~A ~A)~%");

    private static final SubLString $str153$Comparing_graph1___A_triples___A_ = makeString("Comparing graph1 (~A triples, ~A nodes, ~A focal)~%  against graph2 (~A triples, ~A nodes, ~A focal)~%");

    private static final SubLString $str154$Comparing_focal_nodes___A_compare = makeString("Comparing focal nodes (~A compares)...");

    private static final SubLString $str155$Comparing_all_nodes___A_compares_ = makeString("Comparing all nodes (~A compares)...");

    private static final SubLSymbol $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_ = makeSymbol("RDF-TRIPLES-EQUAL-WITH-SYMMETRY?");

    private static final SubLSymbol $sym157$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym158$RDF_TRIPLE_PAIR_EQUAL_ = makeSymbol("RDF-TRIPLE-PAIR-EQUAL?");

    private static final SubLSymbol $sym159$RDF_TRIPLES_ISOMORPHIC__INT = makeSymbol("RDF-TRIPLES-ISOMORPHIC?-INT");

    private static final SubLSymbol $sym160$RDF_NODE_SYMMETRIC_PREDICATE_ = makeSymbol("RDF-NODE-SYMMETRIC-PREDICATE?");

    private static final SubLString $str161$owl_complementOf = makeString("owl:complementOf");

    private static final SubLString $str162$owl_disjointWith = makeString("owl:disjointWith");

    private static final SubLString $str163$owl_equivalentClass = makeString("owl:equivalentClass");

    private static final SubLString $str164$owl_equivalentProperty = makeString("owl:equivalentProperty");

    private static final SubLString $str165$owl_incompatibleWith = makeString("owl:incompatibleWith");

    private static final SubLString $str166$owl_inverseOf = makeString("owl:inverseOf");

    private static final SubLSymbol GET_KNOWN_URI = makeSymbol("GET-KNOWN-URI");

    private static final SubLString $str168$owl_ = makeString("owl:");

    private static final SubLString $str169$rdf_ = makeString("rdf:");

    private static final SubLString $str170$rdfs_ = makeString("rdfs:");

    private static final SubLString $str171$xsd_ = makeString("xsd:");





    private static final SubLList $list174 = list(makeString(":"));

    private static final SubLList $list175 = list(makeString("owl"), makeString("rdf"), makeString("rdfs"), makeString("xsd"));

    private static final SubLSymbol $sym176$STRING_ = makeSymbol("STRING=");

    private static final SubLList $list177 = list(makeSymbol("PREFIX"), makeSymbol("LOCAL-PART"));

    private static final SubLString $$$owl = makeString("owl");

    private static final SubLString $$$rdf = makeString("rdf");

    private static final SubLString $$$rdfs = makeString("rdfs");

    private static final SubLString $$$xsd = makeString("xsd");

    private static final SubLString $str182$get_known_uri_called_with_unhandl = makeString("get-known-uri called with unhandled object ~S");

    private static final SubLSymbol TEST_RDF_GRAPH = makeSymbol("TEST-RDF-GRAPH");

    private static final SubLList $list187 = list(makeSymbol("RDF-TEST-CASE-TABLES"));

    private static final SubLList $list191 = list(list(NIL, T));











    private static final SubLString $$$FOO = makeString("FOO");

    private static final SubLString $$$foo = makeString("foo");

    private static final SubLString $str199$Failed_to_canonicalize_ = makeString("Failed to canonicalize.");

    private static final SubLString $str200$Got_non_EQ_URIs_for___Emu_ = makeString("Got non-EQ URIs for #$Emu.");

    private static final SubLString $str201$Got_non_EQ_literals_for_comment_l = makeString("Got non-EQ literals for comment-literal.");

    private static final SubLString $str202$Couldn_t_find_equivalent_triple_ = makeString("Couldn't find equivalent triple.");

    private static final SubLString $str203$Failed_to_realize_that_triple_was = makeString("Failed to realize that triple was already there when subject specified via struct.");

    private static final SubLString $str204$Failed_to_realize_that_triple_was = makeString("Failed to realize that triple was already there when subject specified via string.");

    private static final SubLString $str205$Can_t_find_URI_for__S = makeString("Can't find URI for ~S");

    private static final SubLString $str206$Expecting_3_nodes_left__Actual_co = makeString("Expecting 3 nodes left. Actual count: ~D");

    private static final SubLString $str207$Graph_does_not_genls_triple_we_ju = makeString("Graph does not genls triple we just added.");

    private static final SubLString $str208$Expected_1_subject_triple_for_emu = makeString("Expected 1 subject triple for emu. Got ~D");

    private static final SubLString $str209$Expected_1_subject_for_genls_bird = makeString("Expected 1 subject for genls bird Got ~D");

    private static final SubLString $str210$Expecting_5_nodes_left__Actual_co = makeString("Expecting 5 nodes left. Actual count: ~D");

    private static final SubLString $str211$Graph_does_not_comment_triple_we_ = makeString("Graph does not comment triple we just added.");

    private static final SubLString $str212$Graph_contains_genls_triple_we_ju = makeString("Graph contains genls triple we just removed");

    private static final SubLString $str213$Graph_does_not_big_foo_triple_we_ = makeString("Graph does not big-foo triple we just added.");

    private static final SubLString $str214$Graph_does_not_little_foo_triple_ = makeString("Graph does not little-foo triple we just added.");

    private static final SubLString $str215$Looked_for_big_foo__got_little_fo = makeString("Looked for big-foo, got little-foo.");

    /**
     * Make and return a new, empty, RDF graph structure.
     */
    @LispMethod(comment = "Make and return a new, empty, RDF graph structure.")
    public static final SubLObject new_rdf_graph_alt() {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.make_new_rdf_graph();
    }

    /**
     * Make and return a new, empty, RDF graph structure.
     */
    @LispMethod(comment = "Make and return a new, empty, RDF graph structure.")
    public static SubLObject new_rdf_graph() {
        return rdf_graph.make_new_rdf_graph();
    }

    /**
     * Add the triple #(SUBJECT PREDICATE OBJECT) into GRAPH.
     *
     * @return boolean, t iff the triple was not already there.
     */
    @LispMethod(comment = "Add the triple #(SUBJECT PREDICATE OBJECT) into GRAPH.\r\n\r\n@return boolean, t iff the triple was not already there.")
    public static final SubLObject rdf_graph_add_triple_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
            SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
            SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
            SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
            {
                SubLObject c_subject = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(subject, v_graph);
                SubLObject c_predicate = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(predicate, v_graph);
                SubLObject c_object = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(v_object, v_graph);
                SubLObject triple = NIL;
                SubLObject newP = NIL;
                SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                    thread.resetMultipleValues();
                    {
                        SubLObject triple_1 = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_or_create_rdf_triple(v_graph, c_subject, c_predicate, c_object);
                        SubLObject newP_2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        triple = triple_1;
                        newP = newP_2;
                    }
                    if (NIL != newP) {
                        set.set_add(triple, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples(v_graph));
                        {
                            SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                            SubLObject node = NIL;
                            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_add(v_graph, node);
                            }
                        }
                        com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_add(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), triple);
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                    }
                }
                return newP;
            }
        }
    }

    /**
     * Add the triple #(SUBJECT PREDICATE OBJECT) into GRAPH.
     *
     * @return boolean, t iff the triple was not already there.
     */
    @LispMethod(comment = "Add the triple #(SUBJECT PREDICATE OBJECT) into GRAPH.\r\n\r\n@return boolean, t iff the triple was not already there.")
    public static SubLObject rdf_graph_add_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject c_subject = rdf_graph.canonicalize_rdf_triple_argument(subject, v_graph);
        final SubLObject c_predicate = rdf_graph.canonicalize_rdf_triple_argument(predicate, v_graph);
        SubLObject c_object = rdf_graph.canonicalize_rdf_triple_argument(v_object, v_graph);
        SubLObject triple = NIL;
        SubLObject newP = NIL;
        if (v_object.isString() && ((NIL != rdf_graph.rdf_nodes_equalP(c_predicate, rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdfs_expanded_name(rdf_graph.$$$label), UNPROVIDED, UNPROVIDED))) || (NIL != rdf_graph.rdf_nodes_equalP(c_predicate, rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdfs_expanded_name(rdf_graph.$$$comment), UNPROVIDED, UNPROVIDED))))) {
            c_object = rdf_graph.rdf_graph_get_literal(v_graph, v_object, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            thread.resetMultipleValues();
            final SubLObject triple_$1 = rdf_graph.rdf_graph_find_or_create_rdf_triple(v_graph, c_subject, c_predicate, c_object);
            final SubLObject newP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            triple = triple_$1;
            newP = newP_$2;
            if (NIL != newP) {
                set_add(triple, rdf_graph.rdf_graph_triples(v_graph));
                SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rdf_graph.rdf_graph_nodes_add(v_graph, node);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
                rdf_graph.rdf_graph_index_add(rdf_graph.rdf_graph_index(v_graph), triple);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return newP;
    }

    /**
     * Remove the triple #(SUBJECT PREDICATE OBJECT) from GRAPH.
     *
     * @return boolean, t iff the triple was there to begin with.
     */
    @LispMethod(comment = "Remove the triple #(SUBJECT PREDICATE OBJECT) from GRAPH.\r\n\r\n@return boolean, t iff the triple was there to begin with.")
    public static final SubLObject rdf_graph_remove_triple_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        {
            SubLObject triple = NIL;
            SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                triple = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object);
                if (NIL != triple) {
                    set.set_remove(triple, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples(v_graph));
                    com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_remove(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), triple);
                    {
                        SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                        SubLObject node = NIL;
                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_contains_nodeP(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), node)) {
                                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_remove(v_graph, node);
                            }
                        }
                    }
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            return list_utilities.sublisp_boolean(triple);
        }
    }

    /**
     * Remove the triple #(SUBJECT PREDICATE OBJECT) from GRAPH.
     *
     * @return boolean, t iff the triple was there to begin with.
     */
    @LispMethod(comment = "Remove the triple #(SUBJECT PREDICATE OBJECT) from GRAPH.\r\n\r\n@return boolean, t iff the triple was there to begin with.")
    public static SubLObject rdf_graph_remove_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            triple = rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object);
            if (NIL != triple) {
                set_remove(triple, rdf_graph.rdf_graph_triples(v_graph));
                rdf_graph.rdf_graph_index_remove(rdf_graph.rdf_graph_index(v_graph), triple);
                SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == rdf_graph.rdf_graph_index_contains_nodeP(rdf_graph.rdf_graph_index(v_graph), node)) {
                        rdf_graph.rdf_graph_nodes_remove(v_graph, node);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return sublisp_boolean(triple);
    }

    public static SubLObject rdf_graph_remove_known_triple(final SubLObject v_graph, final SubLObject triple) {
        assert NIL != rdf_triple.rdf_triple_p(triple, UNPROVIDED) : "! rdf_triple.rdf_triple_p(triple, .UNPROVIDED) " + ("rdf_triple.rdf_triple_p(triple, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_p(triple, CommonSymbols.UNPROVIDED) ") + triple;
        rdf_graph.rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
        return NIL;
    }

    /**
     *
     *
     * @return t iff GRAPH contains the triple #(SUBJECT PREDICATE OBJECT).
     */
    @LispMethod(comment = "@return t iff GRAPH contains the triple #(SUBJECT PREDICATE OBJECT).")
    public static final SubLObject rdf_graph_contains_tripleP_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object));
    }

    /**
     *
     *
     * @return t iff GRAPH contains the triple #(SUBJECT PREDICATE OBJECT).
     */
    @LispMethod(comment = "@return t iff GRAPH contains the triple #(SUBJECT PREDICATE OBJECT).")
    public static SubLObject rdf_graph_contains_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        return sublisp_boolean(rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object));
    }

    /**
     *
     *
     * @return t iff GRAPH contains a triple equivalent to #(SUBJECT PREDICATE OBJECT).
     */
    @LispMethod(comment = "@return t iff GRAPH contains a triple equivalent to #(SUBJECT PREDICATE OBJECT).")
    public static final SubLObject rdf_graph_contains_equivalent_tripleP_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_equivalent_triple(v_graph, subject, predicate, v_object));
    }

    /**
     *
     *
     * @return t iff GRAPH contains a triple equivalent to #(SUBJECT PREDICATE OBJECT).
     */
    @LispMethod(comment = "@return t iff GRAPH contains a triple equivalent to #(SUBJECT PREDICATE OBJECT).")
    public static SubLObject rdf_graph_contains_equivalent_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        return sublisp_boolean(rdf_graph.rdf_graph_find_equivalent_triple(v_graph, subject, predicate, v_object));
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which SUBJECT is the subject.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which SUBJECT is the subject.")
    public static final SubLObject rdf_graph_find_subject_triples_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        if (NIL != predicate) {
            SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        }
        {
            SubLObject triples = NIL;
            SubLObject predicate_uri = (NIL != predicate) ? ((SubLObject) (NIL != rdf_uri.rdf_uri_p(predicate) ? ((SubLObject) (predicate)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                        if ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                            triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
                        }
                    }
                }
            }
            return triples;
        }
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which SUBJECT is the subject.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which SUBJECT is the subject.")
    public static SubLObject rdf_graph_find_subject_triples(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_subject_triples_closure(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph.rdf_graph_find_triples(v_graph, subject, $OBJECT);
        set_contents_var = do_set_internal(set_var);
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, triple)) && (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_subject_triples_canonical(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject triples = NIL;
        SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, triple)) && (NIL == subl_promotions.memberP(triple, rdf_graph.$rdf_graph_converted_triples$.getDynamicValue(thread), rdf_graph.$sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph.rdf_graph_find_triples(v_graph, subject, $OBJECT);
        set_contents_var = do_set_internal(set_var);
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, triple)) && (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                rdf_graph.$rdf_graph_converted_triples$.setDynamicValue(cons(triple, rdf_graph.$rdf_graph_converted_triples$.getDynamicValue(thread)), thread);
                triples = cons(rdf_triple.new_rdf_triple(rdf_triple.rdf_triple_object(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_subject(triple)), triples);
            }
        }
        return triples;
    }

    public static final SubLObject rdf_graph_subject_triple_count_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        if (NIL != predicate) {
            SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        }
        {
            SubLObject all_subject_triples = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT);
            if (NIL == predicate) {
                return set.set_size(all_subject_triples);
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? ((SubLObject) (predicate)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(all_subject_triples);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                            if (predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject rdf_graph_subject_triple_count(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject all_subject_triples = rdf_graph.rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        if (NIL == predicate) {
            return set_size(all_subject_triples);
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = do_set_internal(all_subject_triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-SUBJECT-P that are subjects in triples in GRAPH in which
    PREDICATE is the predicate and OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-SUBJECT-P that are subjects in triples in GRAPH in which\r\nPREDICATE is the predicate and OBJECT is the object.")
    public static final SubLObject rdf_graph_find_subjects_alt(SubLObject v_graph, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_values(v_graph, predicate, $PREDICATE, v_object, $OBJECT);
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-SUBJECT-P that are subjects in triples in GRAPH in which
    PREDICATE is the predicate and OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-SUBJECT-P that are subjects in triples in GRAPH in which\r\nPREDICATE is the predicate and OBJECT is the object.")
    public static SubLObject rdf_graph_find_subjects(final SubLObject v_graph, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        return rdf_graph.rdf_graph_find_values(v_graph, predicate, $PREDICATE, v_object, $OBJECT);
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which PREDICATE is the predicate.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which PREDICATE is the predicate.")
    public static final SubLObject rdf_graph_find_predicate_triples_alt(SubLObject v_graph, SubLObject predicate) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        return Mapping.mapcar(COPY_RDF_TRIPLE, set.set_element_list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE)));
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which PREDICATE is the predicate.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which PREDICATE is the predicate.")
    public static SubLObject rdf_graph_find_predicate_triples(final SubLObject v_graph, final SubLObject predicate) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        return Mapping.mapcar(rdf_graph.COPY_RDF_TRIPLE, set_element_list(rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE)));
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-PREDICATE-P that are predicates in triples in GRAPH in which
    SUBJECT is the subject and OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-PREDICATE-P that are predicates in triples in GRAPH in which\r\nSUBJECT is the subject and OBJECT is the object.")
    public static final SubLObject rdf_graph_find_predicates_alt(SubLObject v_graph, SubLObject subject, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_values(v_graph, subject, $SUBJECT, v_object, $OBJECT);
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-PREDICATE-P that are predicates in triples in GRAPH in which
    SUBJECT is the subject and OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-PREDICATE-P that are predicates in triples in GRAPH in which\r\nSUBJECT is the subject and OBJECT is the object.")
    public static SubLObject rdf_graph_find_predicates(final SubLObject v_graph, final SubLObject subject, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        return rdf_graph.rdf_graph_find_values(v_graph, subject, $SUBJECT, v_object, $OBJECT);
    }

    public static final SubLObject rdf_graph_predicate_triple_count_alt(SubLObject v_graph, SubLObject predicate) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        return set.set_size(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE));
    }

    public static SubLObject rdf_graph_predicate_triple_count(final SubLObject v_graph, final SubLObject predicate) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        return set_size(rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE));
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which OBJECT is the object.")
    public static final SubLObject rdf_graph_find_object_triples_alt(SubLObject v_graph, SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        if (NIL != predicate) {
            SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        }
        {
            SubLObject triples = NIL;
            SubLObject predicate_uri = (NIL != predicate) ? ((SubLObject) (NIL != rdf_uri.rdf_uri_p(predicate) ? ((SubLObject) (predicate)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED))) : NIL;
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                        if ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                            triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
                        }
                    }
                }
            }
            return triples;
        }
    }

    /**
     *
     *
     * @return LISTP of triples contained in GRAPH in which OBJECT is the object.
     */
    @LispMethod(comment = "@return LISTP of triples contained in GRAPH in which OBJECT is the object.")
    public static SubLObject rdf_graph_find_object_triples(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_object_triples_closure(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph.rdf_graph_find_triples(v_graph, v_object, $SUBJECT);
        set_contents_var = do_set_internal(set_var);
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, triple)) && (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_object_triples_canonical(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if (((NIL != do_set_contents_element_validP(state, triple)) && (NIL == subl_promotions.memberP(triple, rdf_graph.$rdf_graph_converted_triples$.getDynamicValue(thread), rdf_graph.$sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-OBJECT-P that are objects in triples in GRAPH in which
    SUBJECT is the subject and PREDICATE is the predicate.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-OBJECT-P that are objects in triples in GRAPH in which\r\nSUBJECT is the subject and PREDICATE is the predicate.")
    public static final SubLObject rdf_graph_find_objects_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_values(v_graph, subject, $SUBJECT, predicate, $PREDICATE);
    }

    /**
     *
     *
     * @return LISTP of VALID-RDF-OBJECT-P that are objects in triples in GRAPH in which
    SUBJECT is the subject and PREDICATE is the predicate.
     */
    @LispMethod(comment = "@return LISTP of VALID-RDF-OBJECT-P that are objects in triples in GRAPH in which\r\nSUBJECT is the subject and PREDICATE is the predicate.")
    public static SubLObject rdf_graph_find_objects(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        return rdf_graph.rdf_graph_find_values(v_graph, subject, $SUBJECT, predicate, $PREDICATE);
    }

    public static final SubLObject rdf_graph_object_triple_count_alt(SubLObject v_graph, SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        if (NIL != predicate) {
            SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        }
        {
            SubLObject all_object_triples = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT);
            if (NIL == predicate) {
                return set.set_size(all_object_triples);
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? ((SubLObject) (predicate)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(all_object_triples);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                            if (predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject rdf_graph_object_triple_count(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_graph.valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject all_object_triples = rdf_graph.rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        if (NIL == predicate) {
            return set_size(all_object_triples);
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? predicate : rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = do_set_internal(all_object_triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the subject of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the subject of an RDF triple.")
    public static final SubLObject valid_rdf_subject_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != web_utilities.uri_p(v_object, UNPROVIDED))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the subject of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the subject of an RDF triple.")
    public static SubLObject valid_rdf_subject_p(final SubLObject v_object) {
        return makeBoolean(((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != uri_p(v_object, UNPROVIDED))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the predicate of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the predicate of an RDF triple.")
    public static final SubLObject valid_rdf_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != web_utilities.uri_p(v_object, UNPROVIDED)) || (NIL != rdf_uri.rdf_uri_p(v_object)));
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the predicate of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the predicate of an RDF triple.")
    public static SubLObject valid_rdf_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != uri_p(v_object, UNPROVIDED)) || (NIL != rdf_uri.rdf_uri_p(v_object)));
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the object of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the object of an RDF triple.")
    public static final SubLObject valid_rdf_object_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != web_utilities.uri_p(v_object, UNPROVIDED))) || (NIL != rdf_literal.rdf_literal_p(v_object))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    /**
     *
     *
     * @return non-NIL iff OBJECT can be validly used as the object of an RDF triple.
     */
    @LispMethod(comment = "@return non-NIL iff OBJECT can be validly used as the object of an RDF triple.")
    public static SubLObject valid_rdf_object_p(final SubLObject v_object) {
        return makeBoolean((((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != uri_p(v_object, UNPROVIDED))) || (NIL != rdf_literal.rdf_literal_p(v_object))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    /**
     *
     *
     * @return RDF-URI-P for the RDF namesapce URI with LOCAL-PART in GRAPH.
     */
    @LispMethod(comment = "@return RDF-URI-P for the RDF namesapce URI with LOCAL-PART in GRAPH.")
    public static final SubLObject rdf_graph_get_rdf_namesapce_uri_alt(SubLObject v_graph, SubLObject local_part) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri_from_two_parts(v_graph, rdf_namespace(), local_part);
    }

    /**
     *
     *
     * @return RDF-URI-P for the RDF namesapce URI with LOCAL-PART in GRAPH.
     */
    @LispMethod(comment = "@return RDF-URI-P for the RDF namesapce URI with LOCAL-PART in GRAPH.")
    public static SubLObject rdf_graph_get_rdf_namesapce_uri(final SubLObject v_graph, final SubLObject local_part) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_get_uri_from_two_parts(v_graph, rdf_utilities.rdf_namespace(), local_part);
    }

    /**
     *
     *
     * @return RDF-URI-P for BASE-URI+CONNECTOR+LOCAL-PART in GRAPH.
     */
    @LispMethod(comment = "@return RDF-URI-P for BASE-URI+CONNECTOR+LOCAL-PART in GRAPH.")
    public static final SubLObject rdf_graph_get_uri_alt(SubLObject v_graph, SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return rdf_uri.get_rdf_uri(base_uri, connector, local_part);
    }

    /**
     *
     *
     * @return RDF-URI-P for BASE-URI+CONNECTOR+LOCAL-PART in GRAPH.
     */
    @LispMethod(comment = "@return RDF-URI-P for BASE-URI+CONNECTOR+LOCAL-PART in GRAPH.")
    public static SubLObject rdf_graph_get_uri(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_uri.get_rdf_uri(base_uri, connector, local_part);
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff GRAPH has a URI for BASE-URI+CONNECTOR+LOCAL-PART.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff GRAPH has a URI for BASE-URI+CONNECTOR+LOCAL-PART.")
    public static final SubLObject rdf_graph_has_uriP_alt(SubLObject v_graph, SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_lookup(v_graph, rdf_uri.get_rdf_uri(base_uri, connector, local_part)));
    }

    /**
     *
     *
     * @return BOOLEANP; Non-NIL iff GRAPH has a URI for BASE-URI+CONNECTOR+LOCAL-PART.
     */
    @LispMethod(comment = "@return BOOLEANP; Non-NIL iff GRAPH has a URI for BASE-URI+CONNECTOR+LOCAL-PART.")
    public static SubLObject rdf_graph_has_uriP(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        return sublisp_boolean(rdf_graph.rdf_graph_nodes_lookup(v_graph, rdf_uri.get_rdf_uri(base_uri, connector, local_part)));
    }

    /**
     *
     *
     * @return RDF-BLANK-NODE-P for ID in GRAPH.
     */
    @LispMethod(comment = "@return RDF-BLANK-NODE-P for ID in GRAPH.")
    public static final SubLObject rdf_graph_get_blank_node_alt(SubLObject v_graph, SubLObject id) {
        {
            SubLObject node = NIL;
            SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_blank_node_cached(v_graph, id);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return node;
        }
    }

    /**
     *
     *
     * @return RDF-BLANK-NODE-P for ID in GRAPH.
     */
    @LispMethod(comment = "@return RDF-BLANK-NODE-P for ID in GRAPH.")
    public static SubLObject rdf_graph_get_blank_node(final SubLObject v_graph, final SubLObject id) {
        SubLObject node = NIL;
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            node = rdf_graph.rdf_graph_get_blank_node_cached(v_graph, id);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return node;
    }

    public static final SubLObject rdf_graph_get_new_blank_node_alt(SubLObject v_graph) {
        return rdf_blank_node.new_rdf_blank_node(com.cyc.cycjava.cycl.rdf.rdf_graph.next_rdf_blank_node_id());
    }

    public static SubLObject rdf_graph_get_new_blank_node(final SubLObject v_graph) {
        return rdf_blank_node.new_rdf_blank_node(rdf_graph.next_rdf_blank_node_id());
    }

    /**
     *
     *
     * @return RDF-LITERAL-P for UTF8-LEXICAL-FORM, LANGUAGE-TAG, and DATATYPE in GRAPH.
     */
    @LispMethod(comment = "@return RDF-LITERAL-P for UTF8-LEXICAL-FORM, LANGUAGE-TAG, and DATATYPE in GRAPH.")
    public static final SubLObject rdf_graph_get_literal_alt(SubLObject v_graph, SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        SubLTrampolineFile.checkType(utf8_lexical_form, STRINGP);
        if (NIL != language_tag) {
            SubLTrampolineFile.checkType(language_tag, STRINGP);
        }
        if (NIL != datatype) {
            SubLTrampolineFile.checkType(datatype, VALID_RDF_LITERAL_DATATYPE_P);
        }
        {
            SubLObject node = NIL;
            SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal_cached(v_graph, utf8_lexical_form, language_tag, datatype);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return node;
        }
    }

    /**
     *
     *
     * @return RDF-LITERAL-P for UTF8-LEXICAL-FORM, LANGUAGE-TAG, and DATATYPE in GRAPH.
     */
    @LispMethod(comment = "@return RDF-LITERAL-P for UTF8-LEXICAL-FORM, LANGUAGE-TAG, and DATATYPE in GRAPH.")
    public static SubLObject rdf_graph_get_literal(final SubLObject v_graph, final SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        assert NIL != stringp(utf8_lexical_form) : "! stringp(utf8_lexical_form) " + ("Types.stringp(utf8_lexical_form) " + "CommonSymbols.NIL != Types.stringp(utf8_lexical_form) ") + utf8_lexical_form;
        if (((NIL != language_tag) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(language_tag))) {
            throw new AssertionError(language_tag);
        }
        if (((NIL != datatype) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_literal.valid_rdf_literal_datatype_p(datatype))) {
            throw new AssertionError(datatype);
        }
        SubLObject node = NIL;
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            node = rdf_graph.rdf_graph_get_literal_cached(v_graph, utf8_lexical_form, language_tag, datatype);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return node;
    }

    /**
     *
     *
     * @return 0 listp of triples in GRAPH1 and not in GRAPH2.
     * @return 1 listp of triples in GRAPH2 and not in GRAPH1.
     */
    @LispMethod(comment = "@return 0 listp of triples in GRAPH1 and not in GRAPH2.\r\n@return 1 listp of triples in GRAPH2 and not in GRAPH1.")
    public static final SubLObject rdf_graph_diff_alt(SubLObject graph1, SubLObject graph2) {
        return values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_difference(graph1, graph2), com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_difference(graph2, graph1));
    }

    /**
     *
     *
     * @return 0 listp of triples in GRAPH1 and not in GRAPH2.
     * @return 1 listp of triples in GRAPH2 and not in GRAPH1.
     */
    @LispMethod(comment = "@return 0 listp of triples in GRAPH1 and not in GRAPH2.\r\n@return 1 listp of triples in GRAPH2 and not in GRAPH1.")
    public static SubLObject rdf_graph_diff(final SubLObject graph1, final SubLObject graph2) {
        return values(rdf_graph.rdf_graph_difference(graph1, graph2), rdf_graph.rdf_graph_difference(graph2, graph1));
    }

    /**
     *
     *
     * @return listp of triples in GRAPH1 and not in GRAPH2.
     */
    @LispMethod(comment = "@return listp of triples in GRAPH1 and not in GRAPH2.")
    public static final SubLObject rdf_graph_difference_alt(SubLObject graph1, SubLObject graph2) {
        {
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples(graph1));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                        if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_equivalent_tripleP(graph2, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple))) {
                            ans = cons(triple, ans);
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return listp of triples in GRAPH1 and not in GRAPH2.
     */
    @LispMethod(comment = "@return listp of triples in GRAPH1 and not in GRAPH2.")
    public static SubLObject rdf_graph_difference(final SubLObject graph1, final SubLObject graph2) {
        SubLObject ans = NIL;
        final SubLObject set_var = rdf_graph.rdf_graph_triples(graph1);
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && (NIL == rdf_graph.rdf_graph_contains_equivalent_tripleP(graph2, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple)))) {
                ans = cons(triple, ans);
            }
        }
        return ans;
    }

    public static final SubLObject fort_or_rdf_uri_p_alt(SubLObject obj) {
        return makeBoolean((NIL != forts.fort_p(obj)) || (NIL != rdf_uri.rdf_uri_p(obj)));
    }

    public static SubLObject fort_or_rdf_uri_p(final SubLObject obj) {
        return makeBoolean((NIL != fort_p(obj)) || (NIL != rdf_uri.rdf_uri_p(obj)));
    }

    public static final SubLObject rdf_graph_instances_alt(SubLObject v_graph, SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        SubLTrampolineFile.checkType(collection, FORT_OR_RDF_URI_P);
        {
            SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? ((SubLObject) (collection)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
            SubLObject direct_instances = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), collection_class);
            if (NIL != transitiveP) {
                {
                    SubLObject v_instances = direct_instances;
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subclasses(v_graph, collection_class, UNPROVIDED);
                    SubLObject subclass = NIL;
                    for (subclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclass = cdolist_list_var.first()) {
                        v_instances = nconc(v_instances, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_instances(v_graph, subclass, NIL));
                    }
                    return delete_duplicates(v_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                return direct_instances;
            }
        }
    }

    public static SubLObject rdf_graph_instances(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        assert NIL != rdf_graph.fort_or_rdf_uri_p(collection) : "! rdf_graph.fort_or_rdf_uri_p(collection) " + ("rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) ") + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
        final SubLObject direct_instances = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name(rdf_graph.$$$type), collection_class);
        if (NIL != transitiveP) {
            SubLObject v_instances = direct_instances;
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_subclasses(v_graph, collection_class, UNPROVIDED);
            SubLObject subclass = NIL;
            subclass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_instances = nconc(v_instances, rdf_graph.rdf_graph_instances(v_graph, subclass, NIL));
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            } 
            return delete_duplicates(v_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return direct_instances;
    }

    public static final SubLObject rdf_graph_uri_for_fort_alt(SubLObject v_graph, SubLObject fort) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, owl_utilities.owl_expanded_name($$$sameAs), owl_cycl_to_xml.owl_cyc_latest_uri_for_fort(fort)).first();
    }

    public static SubLObject rdf_graph_uri_for_fort(final SubLObject v_graph, final SubLObject fort) {
        return rdf_graph.rdf_graph_find_subjects(v_graph, owl_expanded_name(rdf_graph.$$$sameAs), owl_cyc_latest_uri_for_fort(fort)).first();
    }

    public static final SubLObject rank_rdf_classes_transitive_alt(SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), owl_utilities.owl_expanded_name($$$Class));
                $progress_note$.setDynamicValue($str_alt15$Ranking_classes_by_transitive_ins, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject v_class = NIL;
                            for (v_class = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_class = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != rdf_uri.rdf_uri_p(v_class)) {
                                    {
                                        SubLObject direct_instance_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_object_triple_count(v_graph, v_class, rdf_expanded_name($$$type));
                                        dictionary_utilities.dictionary_increment(dict, v_class, direct_instance_count);
                                        com.cyc.cycjava.cycl.rdf.rdf_graph.increment_superclass_count(dict, v_graph, v_class, direct_instance_count, UNPROVIDED);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return remove_if(ZEROP, dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym17$_)), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject rank_rdf_classes_transitive(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject list_var = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name(rdf_graph.$$$type), owl_expanded_name(rdf_graph.$$$Class));
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(rdf_graph.$str19$Ranking_classes_by_transitive_ins, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject v_class = NIL;
                v_class = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL != rdf_uri.rdf_uri_p(v_class)) {
                        final SubLObject direct_instance_count = rdf_graph.rdf_graph_object_triple_count(v_graph, v_class, rdf_utilities.rdf_expanded_name(rdf_graph.$$$type));
                        dictionary_increment(dict, v_class, direct_instance_count);
                        rdf_graph.increment_superclass_count(dict, v_graph, v_class, direct_instance_count, UNPROVIDED);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_class = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return remove_if(ZEROP, sort_dictionary_by_values(dict, symbol_function(rdf_graph.$sym22$_)), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject increment_superclass_count_alt(SubLObject dict, SubLObject v_graph, SubLObject v_class, SubLObject count, SubLObject done) {
        if (done == UNPROVIDED) {
            done = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_objects(v_graph, v_class, rdfs_expanded_name($$$subClassOf));
            SubLObject superclass = NIL;
            for (superclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , superclass = cdolist_list_var.first()) {
                if (NIL == set.set_memberP(superclass, done)) {
                    dictionary_utilities.dictionary_increment(dict, superclass, count);
                    set.set_add(superclass, done);
                    com.cyc.cycjava.cycl.rdf.rdf_graph.increment_superclass_count(dict, v_graph, superclass, count, done);
                }
            }
        }
        return dict;
    }

    public static SubLObject increment_superclass_count(final SubLObject dict, final SubLObject v_graph, final SubLObject v_class, final SubLObject count, SubLObject done) {
        if (done == UNPROVIDED) {
            done = new_set(UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_objects(v_graph, v_class, rdf_utilities.rdfs_expanded_name(rdf_graph.$$$subClassOf));
        SubLObject superclass = NIL;
        superclass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == set_memberP(superclass, done)) {
                dictionary_increment(dict, superclass, count);
                set_add(superclass, done);
                rdf_graph.increment_superclass_count(dict, v_graph, superclass, count, done);
            }
            cdolist_list_var = cdolist_list_var.rest();
            superclass = cdolist_list_var.first();
        } 
        return dict;
    }

    public static final SubLObject rdf_graph_count_instances_alt(SubLObject v_graph, SubLObject collection) {
        SubLTrampolineFile.checkType(collection, FORT_OR_RDF_URI_P);
        {
            SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? ((SubLObject) (collection)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subclasses(v_graph, collection_class, T);
            SubLObject subclass = NIL;
            for (subclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclass = cdolist_list_var.first()) {
                count = add(count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_object_triple_count(v_graph, subclass, rdf_expanded_name($$$type)));
            }
            return count;
        }
    }

    public static SubLObject rdf_graph_count_instances(final SubLObject v_graph, final SubLObject collection) {
        assert NIL != rdf_graph.fort_or_rdf_uri_p(collection) : "! rdf_graph.fort_or_rdf_uri_p(collection) " + ("rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) ") + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rdf_graph.rdf_graph_subclasses(v_graph, collection_class, T);
        SubLObject subclass = NIL;
        subclass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, rdf_graph.rdf_graph_object_triple_count(v_graph, subclass, rdf_utilities.rdf_expanded_name(rdf_graph.$$$type)));
            cdolist_list_var = cdolist_list_var.rest();
            subclass = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject rdf_graph_subclasses_alt(SubLObject v_graph, SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        SubLTrampolineFile.checkType(collection, FORT_OR_RDF_URI_P);
        {
            SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? ((SubLObject) (collection)) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
            if (NIL != transitiveP) {
                return set.set_element_list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_gather_subclasses_transitive(v_graph, collection_class, UNPROVIDED));
            } else {
                return delete_duplicates(cons(collection_class, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, rdfs_expanded_name($$$subClassOf), collection_class)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject rdf_graph_subclasses(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        assert NIL != rdf_graph.fort_or_rdf_uri_p(collection) : "! rdf_graph.fort_or_rdf_uri_p(collection) " + ("rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) ") + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph.rdf_graph_uri_for_fort(v_graph, collection);
        if (NIL != transitiveP) {
            return set_element_list(rdf_graph.rdf_graph_gather_subclasses_transitive(v_graph, collection_class, UNPROVIDED));
        }
        return delete_duplicates(cons(collection_class, rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdfs_expanded_name(rdf_graph.$$$subClassOf), collection_class)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_graph_gather_subclasses_transitive_alt(SubLObject v_graph, SubLObject collection_class, SubLObject collector) {
        if (collector == UNPROVIDED) {
            collector = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        if (NIL != set.set_add(collection_class, collector)) {
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subclasses(v_graph, collection_class, NIL);
                SubLObject subclass = NIL;
                for (subclass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subclass = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_gather_subclasses_transitive(v_graph, subclass, collector);
                }
            }
        }
        return collector;
    }

    public static SubLObject rdf_graph_gather_subclasses_transitive(final SubLObject v_graph, final SubLObject collection_class, SubLObject collector) {
        if (collector == UNPROVIDED) {
            collector = new_set(UNPROVIDED, UNPROVIDED);
        }
        if (NIL != set_add(collection_class, collector)) {
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_subclasses(v_graph, collection_class, NIL);
            SubLObject subclass = NIL;
            subclass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_gather_subclasses_transitive(v_graph, subclass, collector);
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            } 
        }
        return collector;
    }

    public static final SubLObject rdf_graph_triple_count_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return set.set_size(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples(v_graph));
    }

    public static SubLObject rdf_graph_triple_count(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return set_size(rdf_graph.rdf_graph_triples(v_graph));
    }

    public static final SubLObject rdf_graph_empty_p_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return eql(ZERO_INTEGER, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triple_count(v_graph));
    }

    public static SubLObject rdf_graph_empty_p(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return eql(ZERO_INTEGER, rdf_graph.rdf_graph_triple_count(v_graph));
    }

    public static final SubLObject rdf_graph_do_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node = NIL;
                    SubLObject v_graph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    v_graph = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_READER_LOCK, list(list(GET_RDF_GRAPH_LOCK, v_graph)), listS(DO_ITERATOR, list(node, list(RDF_GRAPH_NODE_ITERATOR, v_graph)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rdf_graph_do_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, rdf_graph.$list25);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list25);
        v_graph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(rdf_graph.WITH_READER_LOCK, list(list(rdf_graph.GET_RDF_GRAPH_LOCK, v_graph)), listS(DO_ITERATOR, list(node, list(rdf_graph.RDF_GRAPH_NODE_ITERATOR, v_graph)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, rdf_graph.$list25);
        return NIL;
    }

    public static final SubLObject get_rdf_graph_lock_alt(SubLObject v_graph) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
    }

    public static SubLObject get_rdf_graph_lock(final SubLObject v_graph) {
        return rdf_graph.rdf_graph_lock(v_graph);
    }

    public static final SubLObject rdf_graph_node_iterator_alt(SubLObject v_graph) {
        return iteration.new_iterator(com.cyc.cycjava.cycl.rdf.rdf_graph.make_rdf_graph_nodes_iterator_state(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph)), ITERATE_RDF_GRAPH_NODES_DONE, ITERATE_RDF_GRAPH_NODES_NEXT, UNPROVIDED);
    }

    public static SubLObject rdf_graph_node_iterator(final SubLObject v_graph) {
        return new_iterator(rdf_graph.make_rdf_graph_nodes_iterator_state(rdf_graph.rdf_graph_nodes(v_graph)), rdf_graph.ITERATE_RDF_GRAPH_NODES_DONE, rdf_graph.ITERATE_RDF_GRAPH_NODES_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_rdf_graph_nodes_iterator_state_alt(SubLObject graph_nodes) {
        return cons(NIL, dictionary.new_dictionary_iterator(graph_nodes));
    }

    public static SubLObject make_rdf_graph_nodes_iterator_state(final SubLObject graph_nodes) {
        return cons(NIL, new_dictionary_iterator(graph_nodes));
    }

    public static final SubLObject iterate_rdf_graph_nodes_done_alt(SubLObject state) {
        return makeBoolean((NIL != list_utilities.empty_list_p(state.first())) && (NIL != iteration.iteration_done(state.rest())));
    }

    public static SubLObject iterate_rdf_graph_nodes_done(final SubLObject state) {
        return makeBoolean((NIL != empty_list_p(state.first())) && (NIL != iteration_done(state.rest())));
    }

    public static final SubLObject iterate_rdf_graph_nodes_next_alt(SubLObject state) {
        {
            SubLObject next = NIL;
            if (NIL != list_utilities.non_empty_list_p(state.first())) {
                next = state.first().first();
                rplaca(state, state.first().rest());
            } else {
                {
                    SubLObject next_value = second(iteration.iteration_next(state.rest()));
                    if (next_value.isList()) {
                        rplaca(state, next_value.rest());
                        next = next_value.first();
                    } else {
                        next = next_value;
                    }
                }
            }
            return values(next, state);
        }
    }

    public static SubLObject iterate_rdf_graph_nodes_next(final SubLObject state) {
        SubLObject next = NIL;
        if (NIL != non_empty_list_p(state.first())) {
            next = state.first().first();
            rplaca(state, state.first().rest());
        } else {
            final SubLObject next_value = second(iteration_next(state.rest()));
            if (next_value.isList()) {
                rplaca(state, next_value.rest());
                next = next_value.first();
            } else {
                next = next_value;
            }
        }
        return values(next, state);
    }

    public static final SubLObject dump_rdf_graph_to_n_triples_alt(SubLObject v_graph, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != file_utilities.file_existsP(filename)) {
                    Errors.error($str_alt28$_S_already_exists_, filename);
                }
            }
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt30$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_3 = stream;
                        SubLObject set_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples(v_graph);
                        $progress_note$.setDynamicValue(cconcatenate($str_alt31$Dumping_RDF_graph_to_, new SubLObject[]{ format_nil.format_nil_s_no_copy(filename), $str_alt32$___ }), thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(set.set_size(set_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject set_contents_var = set.do_set_internal(set_var);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                rdf_n_triples_writer.write_n_triple(triple, stream_3);
                                            }
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
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
            return filename;
        }
    }

    public static SubLObject dump_rdf_graph_to_n_triples(final SubLObject v_graph, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != file_existsP(filename))) {
            Errors.error(rdf_graph.$str33$_S_already_exists_, filename);
        }
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error(rdf_graph.$str35$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            final SubLObject set_var = rdf_graph.rdf_graph_triples(v_graph);
            final SubLObject _prev_bind_2 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(cconcatenate(rdf_graph.$$$Dumping_RDF_graph_to_, new SubLObject[]{ format_nil_s_no_copy(filename), rdf_graph.$str37$___ }), thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(set_size(set_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    final SubLObject set_contents_var = do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject triple;
                    for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                        triple = do_set_contents_next(basis_object, state);
                        if (NIL != do_set_contents_element_validP(state, triple)) {
                            rdf_n_triples_writer.write_n_triple(triple, stream_$4);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                $last_percent_progress_index$.rebind(_prev_bind_6, thread);
                $progress_sofar$.rebind(_prev_bind_5, thread);
                $progress_total$.rebind(_prev_bind_4, thread);
                $progress_start_time$.rebind(_prev_bind_3, thread);
                $progress_note$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return filename;
    }

    public static final SubLObject do_loaded_rdf_graphs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_graph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    v_graph = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            if (NIL == member(current_4, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt33);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(WITH_READER_LOCK, $list_alt37, listS(DO_ITERATOR, list(v_graph, $list_alt38, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_loaded_rdf_graphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, rdf_graph.$list38);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list38);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list38);
            if (NIL == member(current_$6, rdf_graph.$list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == rdf_graph.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, rdf_graph.$list38);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(rdf_graph.WITH_READER_LOCK, rdf_graph.$list42, listS(DO_ITERATOR, list(v_graph, rdf_graph.$list43, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject loaded_rdf_graphs_alt() {
        return iteration.new_list_iterator($loaded_rdf_graphs$.getGlobalValue());
    }

    public static SubLObject loaded_rdf_graphs() {
        return new_list_iterator(rdf_graph.$loaded_rdf_graphs$.getGlobalValue());
    }

    public static final SubLObject rdf_graph_do_subjects_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt41);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject subject = NIL;
                    SubLObject v_graph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    subject = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    v_graph = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt41);
                            if (NIL == member(current_5, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt41);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject triple = $sym42$TRIPLE;
                                SubLObject done_subjects = $sym43$DONE_SUBJECTS;
                                return list(CLET, list(bq_cons(done_subjects, $list_alt45)), list(DO_ITERATOR, list(triple, list(RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), list(CLET, list(list(subject, list(RDF_TRIPLE_SUBJECT, triple))), listS(PWHEN, list(SET_ADD, subject, done_subjects), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject rdf_graph_do_subjects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subject = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, rdf_graph.$list46);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list46);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list46);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list46);
            if (NIL == member(current_$7, rdf_graph.$list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == rdf_graph.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, rdf_graph.$list46);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject triple = rdf_graph.$sym47$TRIPLE;
        final SubLObject done_subjects = rdf_graph.$sym48$DONE_SUBJECTS;
        return list(CLET, list(bq_cons(done_subjects, rdf_graph.$list50)), list(DO_ITERATOR, list(triple, list(rdf_graph.RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), list(CLET, list(list(subject, list(rdf_graph.RDF_TRIPLE_SUBJECT, triple))), listS(PWHEN, list(SET_ADD, subject, done_subjects), append(body, NIL)))));
    }

    public static final SubLObject rdf_graph_subject_count_alt(SubLObject v_graph, SubLObject omit_blank_nodesP) {
        if (omit_blank_nodesP == UNPROVIDED) {
            omit_blank_nodesP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject done_subjects = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triples_iterator(v_graph);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject triple = iteration.iteration_next(iterator_var);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            {
                                SubLObject subject = rdf_triple.rdf_triple_subject(triple);
                                if (NIL != set.set_add(subject, done_subjects)) {
                                    if (!((NIL != omit_blank_nodesP) && (NIL != rdf_blank_node.rdf_blank_node_p(subject)))) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return count;
            }
        }
    }

    public static SubLObject rdf_graph_subject_count(final SubLObject v_graph, SubLObject omit_blank_nodesP) {
        if (omit_blank_nodesP == UNPROVIDED) {
            omit_blank_nodesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject done_subjects = new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator(v_graph);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject triple = iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject subject = rdf_triple.rdf_triple_subject(triple);
                if ((NIL != set_add(subject, done_subjects)) && ((NIL == omit_blank_nodesP) || (NIL == rdf_blank_node.rdf_blank_node_p(subject)))) {
                    count = add(count, ONE_INTEGER);
                }
            }
        }
        return count;
    }

    public static final SubLObject rdf_graph_do_triples_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject triple = NIL;
                    SubLObject v_graph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    triple = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    v_graph = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            if (NIL == member(current_6, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt50);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_ITERATOR, list(triple, list(RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject rdf_graph_do_triples(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject triple = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, rdf_graph.$list55);
        triple = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, rdf_graph.$list55);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list55);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, rdf_graph.$list55);
            if (NIL == member(current_$8, rdf_graph.$list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == rdf_graph.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, rdf_graph.$list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ITERATOR, list(triple, list(rdf_graph.RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), append(body, NIL));
    }

    public static final SubLObject rdf_graph_for_uri_loadedP_alt(SubLObject v_rdf_uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject loadedP = NIL;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = loadedP;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    loadedP = eql(v_rdf_uri, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_topic(v_graph));
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != loadedP));
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return loadedP;
            }
        }
    }

    public static SubLObject rdf_graph_for_uri_loadedP(final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject loadedP = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = loadedP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != loadedP))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    loadedP = eql(v_rdf_uri, rdf_graph.rdf_graph_topic(v_graph));
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return loadedP;
    }

    public static final SubLObject loaded_rdf_graph_count_alt() {
        return length($loaded_rdf_graphs$.getGlobalValue());
    }

    public static SubLObject loaded_rdf_graph_count() {
        return length(rdf_graph.$loaded_rdf_graphs$.getGlobalValue());
    }

    public static final SubLObject find_or_download_rdf_graph_alt(SubLObject subject_uri) {
        if (NIL != web_utilities.uri_p(subject_uri, UNPROVIDED)) {
            subject_uri = rdf_uri.get_rdf_uri(subject_uri, UNPROVIDED, UNPROVIDED);
        }
        SubLTrampolineFile.checkType(subject_uri, RDF_URI_P);
        {
            SubLObject v_graph = NIL;
            SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                v_graph = find(subject_uri, $loaded_rdf_graphs$.getGlobalValue(), symbol_function(EQ), symbol_function(RDF_GRAPH_TOPIC), UNPROVIDED, UNPROVIDED);
                if (NIL != v_graph) {
                    com.cyc.cycjava.cycl.rdf.rdf_graph.note_rdf_graph_accessed(v_graph);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            if (NIL == v_graph) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    {
                                        SubLObject rw_lock_var_7 = $loaded_rdf_graphs_lock$.getGlobalValue();
                                        SubLObject needs_to_releaseP_8 = NIL;
                                        try {
                                            needs_to_releaseP_8 = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var_7);
                                            v_graph = rdf_parser.parse_rdfXxml_from_url(rdf_uri.rdf_uri_utf8_string(subject_uri), UNPROVIDED);
                                            if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_empty_p(v_graph)) {
                                                com.cyc.cycjava.cycl.rdf.rdf_graph.note_rdf_graph_loaded(v_graph);
                                            }
                                        } finally {
                                            if (NIL != needs_to_releaseP_8) {
                                                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var_7);
                                            }
                                        }
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
            }
            return v_graph;
        }
    }

    public static SubLObject find_or_download_rdf_graph(SubLObject subject_uri) {
        if (NIL != uri_p(subject_uri, UNPROVIDED)) {
            subject_uri = rdf_uri.get_rdf_uri(subject_uri, UNPROVIDED, UNPROVIDED);
        }
        assert NIL != rdf_uri.rdf_uri_p(subject_uri) : "! rdf_uri.rdf_uri_p(subject_uri) " + ("rdf_uri.rdf_uri_p(subject_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(subject_uri) ") + subject_uri;
        SubLObject v_graph = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            v_graph = find(subject_uri, rdf_graph.$loaded_rdf_graphs$.getGlobalValue(), symbol_function(EQ), symbol_function(rdf_graph.RDF_GRAPH_TOPIC), UNPROVIDED, UNPROVIDED);
            if (NIL != v_graph) {
                rdf_graph.note_rdf_graph_accessed(v_graph);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        if (NIL == v_graph) {
            v_graph = rdf_graph.download_rdf_graph(subject_uri);
        }
        return v_graph;
    }

    public static SubLObject download_rdf_graph(SubLObject subject_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != uri_p(subject_uri, UNPROVIDED)) {
            subject_uri = rdf_uri.get_rdf_uri(subject_uri, UNPROVIDED, UNPROVIDED);
        }
        assert NIL != rdf_uri.rdf_uri_p(subject_uri) : "! rdf_uri.rdf_uri_p(subject_uri) " + ("rdf_uri.rdf_uri_p(subject_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(subject_uri) ") + subject_uri;
        SubLObject v_graph = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(rdf_graph.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(rdf_graph.IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        v_graph = rdf_parser.parse_rdfXxml_from_url(rdf_uri.rdf_uri_utf8_string(subject_uri), UNPROVIDED);
                        if (NIL == rdf_graph.rdf_graph_empty_p(v_graph)) {
                            rdf_graph.note_rdf_graph_loaded(v_graph);
                        }
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, rdf_graph.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return v_graph;
    }

    public static final SubLObject rdf_graph_ontology_uri_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        {
            SubLObject all_ontologies = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), owl_utilities.owl_expanded_name($$$Ontology));
            return NIL != list_utilities.singletonP(all_ontologies) ? ((SubLObject) (all_ontologies.first())) : NIL;
        }
    }

    public static SubLObject rdf_graph_ontology_uri(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        final SubLObject all_ontologies = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name(rdf_graph.$$$type), owl_expanded_name(rdf_graph.$$$Ontology));
        return NIL != singletonP(all_ontologies) ? all_ontologies.first() : NIL;
    }

    public static final SubLObject rdf_graphs_with_uri_predicate_triples_alt(SubLObject v_rdf_uri, SubLObject arg, SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject graphs = NIL;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject pcase_var = arg;
                                        if (pcase_var.eql(ONE_INTEGER)) {
                                            if (NIL != list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate))) {
                                                graphs = cons(v_graph, graphs);
                                            }
                                        } else {
                                            if (pcase_var.eql(TWO_INTEGER)) {
                                                if (NIL != list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, predicate, v_rdf_uri))) {
                                                    graphs = cons(v_graph, graphs);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return graphs;
            }
        }
    }

    public static SubLObject rdf_graphs_with_uri_predicate_triples(final SubLObject v_rdf_uri, final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject graphs = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    if (arg.eql(ONE_INTEGER)) {
                        if (NIL != sublisp_boolean(rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate))) {
                            graphs = cons(v_graph, graphs);
                        }
                    } else
                        if (arg.eql(TWO_INTEGER) && (NIL != sublisp_boolean(rdf_graph.rdf_graph_find_subjects(v_graph, predicate, v_rdf_uri)))) {
                            graphs = cons(v_graph, graphs);
                        }

                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return graphs;
    }

    public static final SubLObject rdf_predicate_has_uri_objectsP_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found_oneP = NIL;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = found_oneP;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE));
                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                        SubLObject state = NIL;
                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != found_oneP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                                SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                                                if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                                                    found_oneP = rdf_uri.rdf_uri_p(rdf_triple.rdf_triple_object(triple));
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != found_oneP));
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return found_oneP;
            }
        }
    }

    public static SubLObject rdf_predicate_has_uri_objectsP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = found_oneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != found_oneP))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    final SubLObject set_var = rdf_graph.rdf_graph_find_triples(v_graph, predicate, $PREDICATE);
                    final SubLObject set_contents_var = do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject triple;
                    for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == do_set_contents_doneP(basis_object, state)); state = do_set_contents_update_state(state)) {
                        triple = do_set_contents_next(basis_object, state);
                        if (NIL != do_set_contents_element_validP(state, triple)) {
                            found_oneP = rdf_uri.rdf_uri_p(rdf_triple.rdf_triple_object(triple));
                        }
                    }
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return found_oneP;
    }

    /**
     *
     *
     * @param POSITION
     * 		keywordp; One of :SUBJECT, :PREDICATE, :OBJECT :ALL.
     */
    @LispMethod(comment = "@param POSITION\r\n\t\tkeywordp; One of :SUBJECT, :PREDICATE, :OBJECT :ALL.")
    public static final SubLObject count_triples_for_uri_alt(SubLObject v_rdf_uri, SubLObject position) {
        if (position == UNPROVIDED) {
            position = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    if ((position == $ALL) || (position == $SUBJECT)) {
                                        count = add(count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subject_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
                                    }
                                    if ((position == $ALL) || (position == $PREDICATE)) {
                                        count = add(count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_predicate_triple_count(v_graph, v_rdf_uri));
                                    }
                                    if ((position == $ALL) || (position == $OBJECT)) {
                                        count = add(count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_object_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @param POSITION
     * 		keywordp; One of :SUBJECT, :PREDICATE, :OBJECT :ALL.
     */
    @LispMethod(comment = "@param POSITION\r\n\t\tkeywordp; One of :SUBJECT, :PREDICATE, :OBJECT :ALL.")
    public static SubLObject count_triples_for_uri(final SubLObject v_rdf_uri, SubLObject position) {
        if (position == UNPROVIDED) {
            position = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    if ((position == $ALL) || (position == $SUBJECT)) {
                        count = add(count, rdf_graph.rdf_graph_subject_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
                    }
                    if ((position == $ALL) || (position == $PREDICATE)) {
                        count = add(count, rdf_graph.rdf_graph_predicate_triple_count(v_graph, v_rdf_uri));
                    }
                    if ((position == $ALL) || (position == $OBJECT)) {
                        count = add(count, rdf_graph.rdf_graph_object_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
                    }
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return count;
    }

    public static final SubLObject rdf_graph_get_uri_from_two_parts_alt(SubLObject v_graph, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject base_uri = rdf_uri.rdf_uri_parts_from_two_parts(start, end);
                SubLObject connector = thread.secondMultipleValue();
                SubLObject local_part = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, base_uri, connector, local_part);
            }
        }
    }

    public static SubLObject rdf_graph_get_uri_from_two_parts(final SubLObject v_graph, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject base_uri = rdf_uri.rdf_uri_parts_from_two_parts(start, end);
        final SubLObject connector = thread.secondMultipleValue();
        final SubLObject local_part = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return rdf_graph.rdf_graph_get_uri(v_graph, base_uri, connector, local_part);
    }

    public static final SubLObject note_rdf_graph_accessed_alt(SubLObject v_rdf_graph) {
        $loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject note_rdf_graph_accessed(final SubLObject v_rdf_graph) {
        rdf_graph.$loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, rdf_graph.$loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return rdf_graph.$loaded_rdf_graphs$.getGlobalValue();
    }

    public static final SubLObject note_rdf_graph_loaded_alt(SubLObject v_rdf_graph) {
        $loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        com.cyc.cycjava.cycl.rdf.rdf_graph.possibly_cull_loaded_rdf_graphs();
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject note_rdf_graph_loaded(final SubLObject v_rdf_graph) {
        rdf_graph.$loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, rdf_graph.$loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        rdf_graph.possibly_cull_loaded_rdf_graphs();
        return rdf_graph.$loaded_rdf_graphs$.getGlobalValue();
    }

    public static final SubLObject remove_from_loaded_rdf_graphs_alt(SubLObject v_graph) {
        $loaded_rdf_graphs$.setGlobalValue(delete(v_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject remove_from_loaded_rdf_graphs(final SubLObject v_graph) {
        rdf_graph.$loaded_rdf_graphs$.setGlobalValue(delete(v_graph, rdf_graph.$loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return rdf_graph.$loaded_rdf_graphs$.getGlobalValue();
    }

    public static final SubLObject qname_for_uri_alt(SubLObject v_rdf_uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject qname = NIL;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = qname;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    qname = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_qname_for_uri(v_graph, v_rdf_uri);
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != qname));
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return qname;
            }
        }
    }

    public static SubLObject qname_for_uri(final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject qname = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = qname; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != qname))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    qname = rdf_graph.rdf_graph_qname_for_uri(v_graph, v_rdf_uri);
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return qname;
    }

    /**
     * Try to keep the total triple count of all loaded graphs under *TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*.
     */
    @LispMethod(comment = "Try to keep the total triple count of all loaded graphs under *TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*.")
    public static final SubLObject possibly_cull_loaded_rdf_graphs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graph_count().numG(ONE_INTEGER)) {
                {
                    SubLObject triple_count = ZERO_INTEGER;
                    SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        {
                            SubLObject rw_lock_var_9 = $loaded_rdf_graphs_lock$.getGlobalValue();
                            SubLObject needs_to_releaseP_10 = NIL;
                            try {
                                needs_to_releaseP_10 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var_9);
                                {
                                    SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                                    SubLObject done_var = NIL;
                                    while (NIL == done_var) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_graph = iteration.iteration_next(iterator_var);
                                            SubLObject valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                triple_count = add(triple_count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triple_count(v_graph));
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                if (NIL != needs_to_releaseP_10) {
                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var_9);
                                }
                            }
                        }
                        while (triple_count.numG($target_max_loaded_rdf_triple_count$.getGlobalValue()) && com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graph_count().numG(ONE_INTEGER)) {
                            {
                                SubLObject doomed = list_utilities.last_one($loaded_rdf_graphs$.getGlobalValue());
                                triple_count = subtract(triple_count, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_triple_count(doomed));
                                com.cyc.cycjava.cycl.rdf.rdf_graph.remove_from_loaded_rdf_graphs(doomed);
                            }
                        } 
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Try to keep the total triple count of all loaded graphs under *TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*.
     */
    @LispMethod(comment = "Try to keep the total triple count of all loaded graphs under *TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*.")
    public static SubLObject possibly_cull_loaded_rdf_graphs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rdf_graph.loaded_rdf_graph_count().numG(ONE_INTEGER)) {
            SubLObject triple_count = ZERO_INTEGER;
            final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                final SubLObject rw_lock_var_$9 = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP_$10 = NIL;
                try {
                    needs_to_releaseP_$10 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var_$9);
                    final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject v_graph = iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            triple_count = add(triple_count, rdf_graph.rdf_graph_triple_count(v_graph));
                        }
                    }
                } finally {
                    if (NIL != needs_to_releaseP_$10) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var_$9);
                    }
                }
                while (triple_count.numG(rdf_graph.$target_max_loaded_rdf_triple_count$.getGlobalValue()) && rdf_graph.loaded_rdf_graph_count().numG(ONE_INTEGER)) {
                    final SubLObject doomed = last_one(rdf_graph.$loaded_rdf_graphs$.getGlobalValue());
                    triple_count = subtract(triple_count, rdf_graph.rdf_graph_triple_count(doomed));
                    rdf_graph.remove_from_loaded_rdf_graphs(doomed);
                } 
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject next_rdf_blank_node_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($rdf_blank_node_isg$.getGlobalValue());
    }

    public static SubLObject next_rdf_blank_node_id() {
        return integer_sequence_generator_next(rdf_graph.$rdf_blank_node_isg$.getGlobalValue());
    }

    public static final SubLObject clear_rdf_graph_get_blank_node_cached_alt() {
        {
            SubLObject cs = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_graph_get_blank_node_cached() {
        final SubLObject cs = rdf_graph.$rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_graph_get_blank_node_cached_alt(SubLObject v_graph, SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue(), list(v_graph, id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id) {
        return caching_state_remove_function_results_with_args(rdf_graph.$rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue(), list(v_graph, id), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_graph_get_blank_node_cached_internal_alt(SubLObject v_graph, SubLObject id) {
        {
            SubLObject new_node = rdf_blank_node.new_rdf_blank_node(id);
            SubLObject found_node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_lookup(v_graph, new_node);
            return NIL != found_node ? ((SubLObject) (found_node)) : new_node;
        }
    }

    public static SubLObject rdf_graph_get_blank_node_cached_internal(final SubLObject v_graph, final SubLObject id) {
        final SubLObject new_node = rdf_blank_node.new_rdf_blank_node(id);
        final SubLObject found_node = rdf_graph.rdf_graph_nodes_lookup(v_graph, new_node);
        return NIL != found_node ? found_node : new_node;
    }

    public static final SubLObject rdf_graph_get_blank_node_cached_alt(SubLObject v_graph, SubLObject id) {
        {
            SubLObject caching_state = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_GET_BLANK_NODE_CACHED, $rdf_graph_get_blank_node_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_graph, id);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw61$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_graph.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_blank_node_cached_internal(v_graph, id)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_graph, id));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id) {
        SubLObject caching_state = rdf_graph.$rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rdf_graph.RDF_GRAPH_GET_BLANK_NODE_CACHED, rdf_graph.$rdf_graph_get_blank_node_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_2(v_graph, id);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_graph.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.equal(cached_args.first())) {
                        return caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rdf_graph.rdf_graph_get_blank_node_cached_internal(v_graph, id)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_graph, id));
        return caching_results(results3);
    }

    public static final SubLObject clear_rdf_graph_get_literal_cached_alt() {
        {
            SubLObject cs = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_graph_get_literal_cached() {
        final SubLObject cs = rdf_graph.$rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_graph_get_literal_cached_alt(SubLObject v_graph, SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_get_literal_cached_caching_state$.getGlobalValue(), list(v_graph, utf8_lexical_form, language_tag, datatype), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        return caching_state_remove_function_results_with_args(rdf_graph.$rdf_graph_get_literal_cached_caching_state$.getGlobalValue(), list(v_graph, utf8_lexical_form, language_tag, datatype), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_graph_get_literal_cached_internal_alt(SubLObject v_graph, SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        {
            SubLObject new_node = rdf_literal.new_rdf_literal(utf8_lexical_form, language_tag, datatype);
            SubLObject found_node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_lookup(v_graph, new_node);
            return NIL != found_node ? ((SubLObject) (found_node)) : new_node;
        }
    }

    public static SubLObject rdf_graph_get_literal_cached_internal(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        final SubLObject new_node = rdf_literal.new_rdf_literal(utf8_lexical_form, language_tag, datatype);
        final SubLObject found_node = rdf_graph.rdf_graph_nodes_lookup(v_graph, new_node);
        return NIL != found_node ? found_node : new_node;
    }

    public static final SubLObject rdf_graph_get_literal_cached_alt(SubLObject v_graph, SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        {
            SubLObject caching_state = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_GET_LITERAL_CACHED, $rdf_graph_get_literal_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(v_graph, utf8_lexical_form, language_tag, datatype);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw61$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_graph.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (utf8_lexical_form.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (language_tag.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && datatype.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal_cached_internal(v_graph, utf8_lexical_form, language_tag, datatype)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_graph, utf8_lexical_form, language_tag, datatype));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        SubLObject caching_state = rdf_graph.$rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rdf_graph.RDF_GRAPH_GET_LITERAL_CACHED, rdf_graph.$rdf_graph_get_literal_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_4(v_graph, utf8_lexical_form, language_tag, datatype);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_graph.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (utf8_lexical_form.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (language_tag.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && datatype.equal(cached_args.first())) {
                                return caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rdf_graph.rdf_graph_get_literal_cached_internal(v_graph, utf8_lexical_form, language_tag, datatype)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_graph, utf8_lexical_form, language_tag, datatype));
        return caching_results(results3);
    }

    public static final SubLObject rdf_graph_find_or_create_rdf_triple_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        {
            SubLObject found = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object);
            return values(NIL != found ? ((SubLObject) (found)) : rdf_triple.new_rdf_triple(subject, predicate, v_object), sublisp_null(found));
        }
    }

    public static SubLObject rdf_graph_find_or_create_rdf_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject found = rdf_graph.rdf_graph_find_triple(v_graph, subject, predicate, v_object);
        return values(NIL != found ? found : rdf_triple.new_rdf_triple(subject, predicate, v_object), sublisp_null(found));
    }

    public static final SubLObject rdf_graph_find_triple_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        if (NIL != web_utilities.uri_p(subject, UNPROVIDED)) {
            subject = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, subject, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != web_utilities.uri_p(predicate, UNPROVIDED)) {
            predicate = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != web_utilities.uri_p(v_object, UNPROVIDED)) {
            v_object = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, v_object, UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject triple = NIL;
            SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                triple = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_triple(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), subject, predicate, v_object, UNPROVIDED);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return triple;
        }
    }

    public static SubLObject rdf_graph_find_triple(final SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (NIL != uri_p(subject, UNPROVIDED)) {
            subject = rdf_graph.rdf_graph_get_uri(v_graph, subject, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != uri_p(predicate, UNPROVIDED)) {
            predicate = rdf_graph.rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != uri_p(v_object, UNPROVIDED)) {
            v_object = rdf_graph.rdf_graph_get_uri(v_graph, v_object, UNPROVIDED, UNPROVIDED);
        }
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triple = rdf_graph.rdf_graph_index_find_triple(rdf_graph.rdf_graph_index(v_graph), subject, predicate, v_object, UNPROVIDED);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triple;
    }

    public static final SubLObject rdf_graph_find_equivalent_triple_alt(SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(subject, VALID_RDF_SUBJECT_P);
        SubLTrampolineFile.checkType(predicate, VALID_RDF_PREDICATE_P);
        SubLTrampolineFile.checkType(v_object, VALID_RDF_OBJECT_P);
        {
            SubLObject c_subject = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(subject, v_graph);
            SubLObject c_predicate = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(predicate, v_graph);
            SubLObject c_object = com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(v_object, v_graph);
            SubLObject triple = NIL;
            SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                triple = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_triple(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), c_subject, c_predicate, c_object, T);
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
            return triple;
        }
    }

    public static SubLObject rdf_graph_find_equivalent_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "! rdf_graph.valid_rdf_subject_p(subject) " + ("rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) ") + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "! rdf_graph.valid_rdf_predicate_p(predicate) " + ("rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) ") + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "! rdf_graph.valid_rdf_object_p(v_object) " + "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject c_subject = rdf_graph.canonicalize_rdf_triple_argument(subject, v_graph);
        final SubLObject c_predicate = rdf_graph.canonicalize_rdf_triple_argument(predicate, v_graph);
        final SubLObject c_object = rdf_graph.canonicalize_rdf_triple_argument(v_object, v_graph);
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triple = rdf_graph.rdf_graph_index_find_triple(rdf_graph.rdf_graph_index(v_graph), c_subject, c_predicate, c_object, T);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triple;
    }

    public static final SubLObject canonicalize_rdf_triple_argument_alt(SubLObject arg, SubLObject v_graph) {
        {
            SubLObject canonical = arg;
            if (NIL != rdf_uri.rdf_uri_p(arg)) {
                canonical = rdf_uri.rdf_uri_utf8_string(arg);
            }
            if (canonical.isString()) {
                canonical = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, canonical, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != rdf_literal.rdf_literal_p(arg)) {
                {
                    SubLObject datatype = rdf_literal.rdf_literal_datatype(arg);
                    SubLObject lexical_form = (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.xml_literal_datatype_p(datatype)) ? ((SubLObject) (rdf_canonicalize_xml_string(rdf_literal.rdf_literal_utf8_lexical_form(arg)))) : rdf_literal.rdf_literal_utf8_lexical_form(arg);
                    canonical = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, lexical_form, rdf_literal.rdf_literal_language_tag(arg), datatype);
                }
            }
            return canonical;
        }
    }

    public static SubLObject canonicalize_rdf_triple_argument(final SubLObject arg, final SubLObject v_graph) {
        SubLObject canonical = arg;
        if (NIL != rdf_uri.rdf_uri_p(arg)) {
            canonical = rdf_uri.rdf_uri_utf8_string(arg);
        }
        if (canonical.isString()) {
            canonical = rdf_graph.rdf_graph_get_uri(v_graph, canonical, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != rdf_literal.rdf_literal_p(arg)) {
            final SubLObject datatype = rdf_literal.rdf_literal_datatype(arg);
            final SubLObject lexical_form = (NIL != rdf_graph.xml_literal_datatype_p(datatype)) ? rdf_utilities.rdf_canonicalize_xml_string(rdf_literal.rdf_literal_utf8_lexical_form(arg)) : rdf_literal.rdf_literal_utf8_lexical_form(arg);
            canonical = rdf_graph.rdf_graph_get_literal(v_graph, lexical_form, rdf_literal.rdf_literal_language_tag(arg), datatype);
        }
        return canonical;
    }

    public static final SubLObject xml_literal_datatype_p_alt(SubLObject datatype) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_expanded_name($$$XMLLiteral).equal(rdf_uri.rdf_uri_utf8_string(datatype)));
    }

    public static SubLObject xml_literal_datatype_p(final SubLObject datatype) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_utilities.rdf_expanded_name(rdf_graph.$$$XMLLiteral).equal(rdf_uri.rdf_uri_utf8_string(datatype)));
    }

    public static final SubLObject rdf_graph_find_values_alt(SubLObject v_graph, SubLObject node, SubLObject position, SubLObject other_node, SubLObject other_position) {
        if (other_node == UNPROVIDED) {
            other_node = NIL;
        }
        if (other_position == UNPROVIDED) {
            other_position = NIL;
        }
        {
            SubLObject values = NIL;
            if (NIL != web_utilities.uri_p(node, UNPROVIDED)) {
                node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != web_utilities.uri_p(other_node, UNPROVIDED)) {
                other_node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, other_node, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    values = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), node, position, other_node, other_position);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
            }
            return values;
        }
    }

    public static SubLObject rdf_graph_find_values(final SubLObject v_graph, SubLObject node, SubLObject position, SubLObject other_node, SubLObject other_position) {
        if (other_node == UNPROVIDED) {
            other_node = NIL;
        }
        if (other_position == UNPROVIDED) {
            other_position = NIL;
        }
        SubLObject values = NIL;
        if (NIL != uri_p(node, UNPROVIDED)) {
            node = rdf_graph.rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != uri_p(other_node, UNPROVIDED)) {
            other_node = rdf_graph.rdf_graph_get_uri(v_graph, other_node, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            values = rdf_graph.rdf_graph_index_find_values(rdf_graph.rdf_graph_index(v_graph), node, position, other_node, other_position);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return values;
    }

    public static final SubLObject rdf_graph_find_triples_alt(SubLObject v_graph, SubLObject node, SubLObject position) {
        {
            SubLObject triples = NIL;
            if (NIL != web_utilities.uri_p(node, UNPROVIDED)) {
                node = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject rw_lock_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_lock(v_graph);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    triples = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_triples(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index(v_graph), node, position);
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
            }
            return triples;
        }
    }

    public static SubLObject rdf_graph_find_triples(final SubLObject v_graph, SubLObject node, SubLObject position) {
        SubLObject triples = NIL;
        if (NIL != uri_p(node, UNPROVIDED)) {
            node = rdf_graph.rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph.rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triples = rdf_graph.rdf_graph_index_find_triples(rdf_graph.rdf_graph_index(v_graph), node, position);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triples;
    }

    public static final SubLObject rdf_graph_nodes_add_alt(SubLObject v_graph, SubLObject node) {
        {
            SubLObject existing = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
            SubLObject addedP = NIL;
            if ($NOT_FOUND == existing) {
                dictionary.dictionary_enter(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, node);
                addedP = T;
            } else {
                if (existing.isList()) {
                    if (NIL == find(node, existing, $sym66$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        dictionary_utilities.dictionary_push(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, node);
                        addedP = T;
                    }
                } else {
                    if (existing == node) {
                    } else {
                        dictionary.dictionary_enter(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, list(existing, node));
                        addedP = T;
                    }
                }
            }
            if (NIL != addedP) {
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_increment_node_count(v_graph);
            }
        }
        return NIL;
    }

    public static SubLObject rdf_graph_nodes_add(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary_lookup_without_values(rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        SubLObject addedP = NIL;
        if ($NOT_FOUND == existing) {
            dictionary_enter(rdf_graph.rdf_graph_nodes(v_graph), node, node);
            addedP = T;
        } else
            if (existing.isList()) {
                if (NIL == find(node, existing, rdf_graph.$sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    dictionary_push(rdf_graph.rdf_graph_nodes(v_graph), node, node);
                    addedP = T;
                }
            } else
                if (!existing.eql(node)) {
                    dictionary_enter(rdf_graph.rdf_graph_nodes(v_graph), node, list(existing, node));
                    addedP = T;
                }


        if (NIL != addedP) {
            rdf_graph.rdf_graph_increment_node_count(v_graph);
        }
        return NIL;
    }

    public static final SubLObject rdf_graph_nodes_remove_alt(SubLObject v_graph, SubLObject node) {
        {
            SubLObject existing = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
            SubLObject removedP = NIL;
            if (existing.isList()) {
                if (NIL != find(node, existing, $sym66$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    dictionary_utilities.dictionary_delete_from_value(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, node, UNPROVIDED, UNPROVIDED);
                    removedP = T;
                }
            } else {
                if (existing == node) {
                    dictionary.dictionary_remove(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node);
                    removedP = T;
                }
            }
            if (NIL != removedP) {
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_decrement_node_count(v_graph);
            }
        }
        return NIL;
    }

    public static SubLObject rdf_graph_nodes_remove(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary_lookup_without_values(rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        SubLObject removedP = NIL;
        if (existing.isList()) {
            if (NIL != find(node, existing, rdf_graph.$sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                dictionary_delete_from_value(rdf_graph.rdf_graph_nodes(v_graph), node, node, UNPROVIDED, UNPROVIDED);
                removedP = T;
            }
        } else
            if (existing.eql(node)) {
                dictionary_remove(rdf_graph.rdf_graph_nodes(v_graph), node);
                removedP = T;
            }

        if (NIL != removedP) {
            rdf_graph.rdf_graph_decrement_node_count(v_graph);
        }
        return NIL;
    }

    public static final SubLObject rdf_graph_nodes_lookup_alt(SubLObject v_graph, SubLObject node) {
        {
            SubLObject existing = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
            if (existing.isList()) {
                return find(node, existing, $sym66$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_nodes_equalP(existing, node)) {
                    return existing;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject rdf_graph_nodes_lookup(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary_lookup_without_values(rdf_graph.rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        if (existing.isList()) {
            return find(node, existing, rdf_graph.$sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != rdf_graph.rdf_nodes_equalP(existing, node)) {
            return existing;
        }
        return NIL;
    }

    public static final SubLObject rdf_nodes_equalP_alt(SubLObject node1, SubLObject node2) {
        if ((NIL != rdf_blank_node.rdf_blank_node_p(node1)) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) {
            return rdf_blank_node.rdf_blank_node_equal_p(node1, node2);
        } else {
            if ((NIL != rdf_uri.rdf_uri_p(node1)) && (NIL != rdf_uri.rdf_uri_p(node2))) {
                return rdf_uri.rdf_uri_equal_p(node1, node2);
            } else {
                if ((NIL != rdf_literal.rdf_literal_p(node1)) && (NIL != rdf_literal.rdf_literal_p(node2))) {
                    return rdf_literal.rdf_literal_equal_p(node1, node2);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject rdf_nodes_equalP(final SubLObject node1, final SubLObject node2) {
        if ((NIL != rdf_blank_node.rdf_blank_node_p(node1)) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) {
            return rdf_blank_node.rdf_blank_node_equal_p(node1, node2);
        }
        if ((NIL != rdf_uri.rdf_uri_p(node1)) && (NIL != rdf_uri.rdf_uri_p(node2))) {
            return rdf_uri.rdf_uri_equal_p(node1, node2);
        }
        if ((NIL != rdf_literal.rdf_literal_p(node1)) && (NIL != rdf_literal.rdf_literal_p(node2))) {
            return rdf_literal.rdf_literal_equal_p(node1, node2);
        }
        return NIL;
    }

    public static final SubLObject rdf_graph_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rdf.rdf_graph.print_rdf_graph(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdf_graph.print_rdf_graph(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rdf_graph_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rdf_graph_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_native.class ? T : NIL;
    }

    public static final SubLObject rdf_graph_struct_triples_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$triples;
    }

    public static SubLObject rdf_graph_struct_triples(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rdf_graph_struct_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$nodes;
    }

    public static SubLObject rdf_graph_struct_nodes(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rdf_graph_struct_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$index;
    }

    public static SubLObject rdf_graph_struct_index(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rdf_graph_struct_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$lock;
    }

    public static SubLObject rdf_graph_struct_lock(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rdf_graph_struct_node_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$node_count;
    }

    public static SubLObject rdf_graph_struct_node_count(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rdf_graph_struct_prefix_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$prefix_map;
    }

    public static SubLObject rdf_graph_struct_prefix_map(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject rdf_graph_struct_file_location_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$file_location;
    }

    public static SubLObject rdf_graph_struct_file_location(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject rdf_graph_struct_topic_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$topic;
    }

    public static SubLObject rdf_graph_struct_topic(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rdf_graph_struct_focal_nodes(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_rdf_graph_struct_triples_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$triples = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_triples(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$nodes = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$index = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$lock = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_node_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$node_count = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_node_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_prefix_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$prefix_map = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_prefix_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_file_location_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$file_location = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_file_location(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_rdf_graph_struct_topic_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_P);
        return (($rdf_graph_native)v_object).$topic = (value);
    }

    public static SubLObject _csetf_rdf_graph_struct_topic(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_focal_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_p(v_object) : "! rdf_graph.rdf_graph_p(v_object) " + "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_rdf_graph_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TRIPLES)) {
                        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_triples(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NODES)) {
                            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_nodes(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INDEX)) {
                                com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_index(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LOCK)) {
                                    com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_lock(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($NODE_COUNT)) {
                                        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_node_count(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PREFIX_MAP)) {
                                            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_prefix_map(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($FILE_LOCATION)) {
                                                com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_file_location(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($TOPIC)) {
                                                    com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_topic(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt98$Invalid_slot__S_for_construction_, current_arg);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rdf_graph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TRIPLES)) {
                rdf_graph._csetf_rdf_graph_struct_triples(v_new, current_value);
            } else
                if (pcase_var.eql($NODES)) {
                    rdf_graph._csetf_rdf_graph_struct_nodes(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX)) {
                        rdf_graph._csetf_rdf_graph_struct_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($LOCK)) {
                            rdf_graph._csetf_rdf_graph_struct_lock(v_new, current_value);
                        } else
                            if (pcase_var.eql($NODE_COUNT)) {
                                rdf_graph._csetf_rdf_graph_struct_node_count(v_new, current_value);
                            } else
                                if (pcase_var.eql($PREFIX_MAP)) {
                                    rdf_graph._csetf_rdf_graph_struct_prefix_map(v_new, current_value);
                                } else
                                    if (pcase_var.eql($FILE_LOCATION)) {
                                        rdf_graph._csetf_rdf_graph_struct_file_location(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TOPIC)) {
                                            rdf_graph._csetf_rdf_graph_struct_topic(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FOCAL_NODES)) {
                                                rdf_graph._csetf_rdf_graph_struct_focal_nodes(v_new, current_value);
                                            } else {
                                                Errors.error(rdf_graph.$str106$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_graph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rdf_graph.MAKE_RDF_GRAPH, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TRIPLES, rdf_graph.rdf_graph_struct_triples(obj));
        funcall(visitor_fn, obj, $SLOT, $NODES, rdf_graph.rdf_graph_struct_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, rdf_graph.rdf_graph_struct_index(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, rdf_graph.rdf_graph_struct_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $NODE_COUNT, rdf_graph.rdf_graph_struct_node_count(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFIX_MAP, rdf_graph.rdf_graph_struct_prefix_map(obj));
        funcall(visitor_fn, obj, $SLOT, $FILE_LOCATION, rdf_graph.rdf_graph_struct_file_location(obj));
        funcall(visitor_fn, obj, $SLOT, $TOPIC, rdf_graph.rdf_graph_struct_topic(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCAL_NODES, rdf_graph.rdf_graph_struct_focal_nodes(obj));
        funcall(visitor_fn, obj, $END, rdf_graph.MAKE_RDF_GRAPH, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_graph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rdf_graph.visit_defstruct_rdf_graph(obj, visitor_fn);
    }

    public static final SubLObject print_rdf_graph_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt99$_RDF_GRAPH__A_, NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_topic(v_object) ? ((SubLObject) (rdf_uri.rdf_uri_utf8_string(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_topic(v_object)))) : com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_file_location(v_object));
        return v_object;
    }

    public static SubLObject print_rdf_graph(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rdf_graph.$str112$_RDF_GRAPH__A_, NIL != rdf_graph.rdf_graph_struct_topic(v_object) ? rdf_uri.rdf_uri_utf8_string(rdf_graph.rdf_graph_struct_topic(v_object)) : rdf_graph.rdf_graph_struct_file_location(v_object));
        return v_object;
    }

    /**
     * Make and return a new, empty, RDF graph structure.
     */
    @LispMethod(comment = "Make and return a new, empty, RDF graph structure.")
    public static final SubLObject make_new_rdf_graph_alt() {
        {
            SubLObject v_graph = com.cyc.cycjava.cycl.rdf.rdf_graph.make_rdf_graph(UNPROVIDED);
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_triples(v_graph, set.new_set($rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED));
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_nodes(v_graph, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_index(v_graph, com.cyc.cycjava.cycl.rdf.rdf_graph.new_rdf_graph_index());
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_lock(v_graph, ReadWriteLocks.new_rw_lock($$$RDF_GRAPH));
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, ZERO_INTEGER);
            return v_graph;
        }
    }

    /**
     * Make and return a new, empty, RDF graph structure.
     */
    @LispMethod(comment = "Make and return a new, empty, RDF graph structure.")
    public static SubLObject make_new_rdf_graph() {
        final SubLObject v_graph = rdf_graph.make_rdf_graph(UNPROVIDED);
        rdf_graph._csetf_rdf_graph_struct_triples(v_graph, new_set(rdf_graph.$rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED));
        rdf_graph._csetf_rdf_graph_struct_nodes(v_graph, new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        rdf_graph._csetf_rdf_graph_struct_index(v_graph, rdf_graph.new_rdf_graph_index());
        rdf_graph._csetf_rdf_graph_struct_lock(v_graph, ReadWriteLocks.new_rw_lock(rdf_graph.$$$RDF_GRAPH));
        rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, ZERO_INTEGER);
        return v_graph;
    }

    public static final SubLObject rdf_graph_triples_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_triples(v_graph);
    }

    public static SubLObject rdf_graph_triples(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_triples(v_graph);
    }

    public static final SubLObject rdf_graph_triples_iterator_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return set.new_set_iterator(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_triples(v_graph));
    }

    public static SubLObject rdf_graph_triples_iterator(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return new_set_iterator(rdf_graph.rdf_graph_struct_triples(v_graph));
    }

    public static final SubLObject rdf_graph_nodes_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_nodes(v_graph);
    }

    public static SubLObject rdf_graph_nodes(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_nodes(v_graph);
    }

    public static final SubLObject rdf_graph_index_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_index(v_graph);
    }

    public static SubLObject rdf_graph_index(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_index(v_graph);
    }

    public static final SubLObject rdf_graph_lock_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_lock(v_graph);
    }

    public static SubLObject rdf_graph_lock(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_lock(v_graph);
    }

    public static final SubLObject rdf_graph_node_count_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static final SubLObject rdf_graph_increment_node_count_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, add(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_increment_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, add(rdf_graph.rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static final SubLObject rdf_graph_decrement_node_count_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, subtract(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_decrement_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        rdf_graph._csetf_rdf_graph_struct_node_count(v_graph, subtract(rdf_graph.rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return rdf_graph.rdf_graph_struct_node_count(v_graph);
    }

    public static final SubLObject rdf_graph_file_location_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_file_location(v_graph);
    }

    public static SubLObject rdf_graph_file_location(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_file_location(v_graph);
    }

    public static final SubLObject rdf_graph_note_file_location_alt(SubLObject v_graph, SubLObject file_location) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(file_location, STRINGP);
        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_file_location(v_graph, file_location);
        return file_location;
    }

    public static SubLObject rdf_graph_note_file_location(final SubLObject v_graph, final SubLObject file_location) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != stringp(file_location) : "! stringp(file_location) " + ("Types.stringp(file_location) " + "CommonSymbols.NIL != Types.stringp(file_location) ") + file_location;
        rdf_graph._csetf_rdf_graph_struct_file_location(v_graph, file_location);
        return file_location;
    }

    public static final SubLObject rdf_graph_topic_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_topic(v_graph);
    }

    public static SubLObject rdf_graph_topic(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_topic(v_graph);
    }

    public static final SubLObject rdf_graph_note_topic_alt(SubLObject v_graph, SubLObject topic) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(topic, RDF_URI_P);
        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_topic(v_graph, topic);
        return topic;
    }

    public static SubLObject rdf_graph_note_topic(final SubLObject v_graph, final SubLObject topic) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_uri.rdf_uri_p(topic) : "! rdf_uri.rdf_uri_p(topic) " + ("rdf_uri.rdf_uri_p(topic) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(topic) ") + topic;
        rdf_graph._csetf_rdf_graph_struct_topic(v_graph, topic);
        return topic;
    }

    public static SubLObject rdf_graph_focal_nodes(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return rdf_graph.rdf_graph_struct_focal_nodes(v_graph);
    }

    public static SubLObject rdf_graph_note_focal_node(final SubLObject v_graph, final SubLObject focal_node) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != rdf_graph.valid_rdf_subject_p(focal_node) : "! rdf_graph.valid_rdf_subject_p(focal_node) " + ("rdf_graph.valid_rdf_subject_p(focal_node) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(focal_node) ") + focal_node;
        SubLObject focal_nodes = rdf_graph.rdf_graph_struct_focal_nodes(v_graph);
        focal_nodes = cons(focal_node, focal_nodes);
        rdf_graph._csetf_rdf_graph_struct_focal_nodes(v_graph, focal_nodes);
        return focal_node;
    }

    public static final SubLObject rdf_graph_prefix_map_alt(SubLObject v_graph) {
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        return copy_tree(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_prefix_map(v_graph));
    }

    public static SubLObject rdf_graph_prefix_map(final SubLObject v_graph) {
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        return copy_tree(rdf_graph.rdf_graph_struct_prefix_map(v_graph));
    }

    public static final SubLObject rdf_graph_note_namespace_prefixes_alt(SubLObject v_graph, SubLObject attributes) {
        {
            SubLObject cdolist_list_var = attributes;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject attribute = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt102);
                    attribute = current.first();
                    current = current.rest();
                    value = current;
                    if (NIL != string_utilities.starts_with(attribute, $$$xmlns)) {
                        {
                            SubLObject prefix = ($$$xmlns.equal(attribute)) ? ((SubLObject) (string_utilities.$empty_string$.getGlobalValue())) : string_utilities.pre_remove(attribute, $str_alt104$xmlns_, UNPROVIDED);
                            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_struct_prefix_map(v_graph, list_utilities.alist_enter(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_prefix_map(v_graph), prefix, value, symbol_function(EQUAL)));
                        }
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_prefix_map(v_graph);
    }

    public static SubLObject rdf_graph_note_namespace_prefixes(final SubLObject v_graph, final SubLObject attributes) {
        SubLObject cdolist_list_var = attributes;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject attribute = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, rdf_graph.$list115);
            attribute = current.first();
            current = value = current.rest();
            if ((NIL != starts_with(attribute, rdf_graph.$$$xmlns)) || (NIL != Strings.stringE(attribute, rdf_graph.$str117$xml_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject prefix = (rdf_graph.$$$xmlns.equal(attribute)) ? $empty_string$.getGlobalValue() : pre_remove(attribute, rdf_graph.$str118$xmlns_, UNPROVIDED);
                rdf_graph._csetf_rdf_graph_struct_prefix_map(v_graph, alist_enter(rdf_graph.rdf_graph_struct_prefix_map(v_graph), prefix, value, symbol_function(EQUAL)));
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return rdf_graph.rdf_graph_struct_prefix_map(v_graph);
    }

    public static final SubLObject rdf_graph_qname_for_uri_alt(SubLObject v_graph, SubLObject uri) {
        if (NIL == rdf_uri.rdf_uri_p(uri)) {
            SubLTrampolineFile.checkType(uri, URI_P);
        }
        {
            SubLObject utf8 = (NIL != rdf_uri.rdf_uri_p(uri)) ? ((SubLObject) (rdf_uri.rdf_uri_utf8_string(uri))) : uri;
            SubLObject hash_pos = list_utilities.position_from_end(CHAR_hash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject slash_pos = list_utilities.position_from_end(CHAR_slash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject namespace_penult = (NIL != hash_pos) ? ((SubLObject) (NIL != slash_pos ? ((SubLObject) (number_utilities.maximum(list(hash_pos, slash_pos), UNPROVIDED))) : hash_pos)) : slash_pos;
            SubLObject namespace = string_utilities.substring(utf8, ZERO_INTEGER, NIL != namespace_penult ? ((SubLObject) (number_utilities.f_1X(namespace_penult))) : NIL);
            SubLObject prefix = list_utilities.alist_reverse_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_prefix_map(v_graph), namespace, symbol_function(EQUAL), UNPROVIDED);
            if (NIL == prefix) {
                prefix = rdf_standard_prefix_for_namespace(namespace);
            }
            return (NIL != prefix) && (!utf8.equal(namespace)) ? ((SubLObject) (cconcatenate(prefix, new SubLObject[]{ $str_alt106$_, string_utilities.pre_remove(utf8, namespace, UNPROVIDED) }))) : NIL;
        }
    }

    public static SubLObject rdf_graph_qname_for_uri(final SubLObject v_graph, final SubLObject uri) {
        if (((NIL == rdf_uri.rdf_uri_p(uri)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == uri_p(uri, UNPROVIDED))) {
            throw new AssertionError(uri);
        }
        final SubLObject utf8 = (NIL != rdf_uri.rdf_uri_p(uri)) ? rdf_uri.rdf_uri_utf8_string(uri) : uri;
        final SubLObject hash_pos = position_from_end(CHAR_hash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject slash_pos = position_from_end(CHAR_slash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject namespace_penult = (NIL != hash_pos) ? NIL != slash_pos ? maximum(list(hash_pos, slash_pos), UNPROVIDED) : hash_pos : slash_pos;
        final SubLObject namespace = substring(utf8, ZERO_INTEGER, NIL != namespace_penult ? f_1X(namespace_penult) : NIL);
        SubLObject prefix = alist_reverse_lookup_without_values(rdf_graph.rdf_graph_prefix_map(v_graph), namespace, symbol_function(EQUAL), UNPROVIDED);
        if (NIL == prefix) {
            prefix = rdf_utilities.rdf_standard_prefix_for_namespace(namespace);
        }
        return (NIL != prefix) && (!utf8.equal(namespace)) ? NIL != empty_string_p(prefix) ? pre_remove(utf8, namespace, UNPROVIDED) : cconcatenate(prefix, new SubLObject[]{ rdf_graph.$str120$_, pre_remove(utf8, namespace, UNPROVIDED) }) : rdf_uri.rdf_uri_utf8_string(uri);
    }

    public static final SubLObject rdf_graph_get_label_alt(SubLObject v_graph, SubLObject v_rdf_uri) {
        {
            SubLObject label = NIL;
            if (NIL == label) {
                {
                    SubLObject csome_list_var = rdf_label_properties(NIL);
                    SubLObject predicate = NIL;
                    for (predicate = csome_list_var.first(); !((NIL != label) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                        label = find($$$en, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate), symbol_function(EQUAL), RDF_LITERAL_LANGUAGE_TAG, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL != label ? ((SubLObject) (rdf_literal.rdf_literal_utf8_lexical_form(label))) : NIL;
        }
    }

    public static SubLObject rdf_graph_get_label(final SubLObject v_graph, final SubLObject v_rdf_uri) {
        SubLObject label = NIL;
        if (NIL == label) {
            SubLObject csome_list_var;
            SubLObject predicate;
            for (csome_list_var = rdf_utilities.rdf_label_properties(NIL), predicate = NIL, predicate = csome_list_var.first(); (NIL == label) && (NIL != csome_list_var); label = find(rdf_graph.$$$en, rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate), symbol_function(EQUAL), rdf_graph.RDF_LITERAL_LANGUAGE_TAG, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
            }
        }
        return NIL != label ? rdf_literal.rdf_literal_utf8_lexical_form(label) : NIL;
    }

    public static final SubLObject rdf_graph_get_labels_alt(SubLObject v_graph, SubLObject v_rdf_uri, SubLObject language_tag, SubLObject max_number) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        {
            SubLObject labels = NIL;
            SubLObject doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = rdf_label_properties(T);
                    SubLObject predicate = NIL;
                    for (predicate = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var_11 = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate);
                                SubLObject label = NIL;
                                for (label = csome_list_var_11.first(); !((NIL != doneP) || (NIL == csome_list_var_11)); csome_list_var_11 = csome_list_var_11.rest() , label = csome_list_var_11.first()) {
                                    if ((!((NIL != language_tag) && (NIL != rdf_literal.rdf_literal_language_tag(label)))) || language_tag.equal(rdf_literal.rdf_literal_language_tag(label))) {
                                        {
                                            SubLObject item_var = rdf_literal.rdf_literal_cyc_string(label);
                                            if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                labels = cons(item_var, labels);
                                            }
                                        }
                                        doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return labels;
        }
    }

    public static SubLObject rdf_graph_get_labels(final SubLObject v_graph, final SubLObject v_rdf_uri, SubLObject language_tag, SubLObject max_number) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        SubLObject labels = NIL;
        SubLObject doneP = makeBoolean((NIL != max_number) && (NIL != lengthGE(labels, max_number, UNPROVIDED)));
        if (NIL == doneP) {
            SubLObject csome_list_var = rdf_utilities.rdf_label_properties(T);
            SubLObject predicate = NIL;
            predicate = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL == doneP) {
                    SubLObject csome_list_var_$11 = rdf_graph.rdf_graph_find_objects(v_graph, v_rdf_uri, predicate);
                    SubLObject label = NIL;
                    label = csome_list_var_$11.first();
                    while ((NIL == doneP) && (NIL != csome_list_var_$11)) {
                        if (((NIL == language_tag) || (NIL == rdf_literal.rdf_literal_language_tag(label))) || language_tag.equal(rdf_literal.rdf_literal_language_tag(label))) {
                            final SubLObject item_var = rdf_literal.rdf_literal_cyc_string(label);
                            if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                labels = cons(item_var, labels);
                            }
                            doneP = makeBoolean((NIL != max_number) && (NIL != lengthGE(labels, max_number, UNPROVIDED)));
                        }
                        csome_list_var_$11 = csome_list_var_$11.rest();
                        label = csome_list_var_$11.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                predicate = csome_list_var.first();
            } 
        }
        return labels;
    }

    public static final SubLObject rdf_uris_matching_label_alt(SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject uris = NIL;
                SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = com.cyc.cycjava.cycl.rdf.rdf_graph.loaded_rdf_graphs();
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_graph = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uris_matching_label(v_graph, label, exactP);
                                        SubLObject uri = NIL;
                                        for (uri = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uri = cdolist_list_var.first()) {
                                            {
                                                SubLObject item_var = uri;
                                                if (NIL == member(item_var, uris, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    uris = cons(item_var, uris);
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    if (NIL != needs_to_releaseP) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                    }
                }
                return uris;
            }
        }
    }

    public static SubLObject rdf_uris_matching_label(final SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uris = NIL;
        final SubLObject rw_lock_var = rdf_graph.$loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject cdolist_list_var = rdf_graph.rdf_graph_get_uris_matching_label(v_graph, label, exactP);
                    SubLObject uri = NIL;
                    uri = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = uri;
                        if (NIL == member(item_var, uris, symbol_function(EQL), symbol_function(IDENTITY))) {
                            uris = cons(item_var, uris);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        uri = cdolist_list_var.first();
                    } 
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return uris;
    }

    public static final SubLObject rdf_graph_get_uris_matching_label_alt(SubLObject v_graph, SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        {
            SubLObject uris = NIL;
            SubLObject cdolist_list_var = rdf_label_properties(T);
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_12 = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_predicate_triples(v_graph, predicate);
                    SubLObject triple = NIL;
                    for (triple = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , triple = cdolist_list_var_12.first()) {
                        {
                            SubLObject v_object = rdf_triple.rdf_triple_object(triple);
                            SubLObject this_label = (NIL != rdf_literal.rdf_literal_p(v_object)) ? ((SubLObject) (rdf_literal.rdf_literal_cyc_string(v_object))) : NIL;
                            if ((NIL != this_label) && (NIL != (NIL != exactP ? ((SubLObject) (equal(this_label, label))) : unicode_nauts.unicode_substringP(label, this_label, NIL)))) {
                                {
                                    SubLObject item_var = rdf_triple.rdf_triple_subject(triple);
                                    if (NIL == member(item_var, uris, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        uris = cons(item_var, uris);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return uris;
        }
    }

    public static SubLObject rdf_graph_get_uris_matching_label(final SubLObject v_graph, final SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        SubLObject uris = NIL;
        SubLObject cdolist_list_var = rdf_utilities.rdf_label_properties(T);
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = rdf_graph.rdf_graph_find_predicate_triples(v_graph, predicate);
            SubLObject triple = NIL;
            triple = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                final SubLObject v_object = rdf_triple.rdf_triple_object(triple);
                final SubLObject this_label = (NIL != rdf_literal.rdf_literal_p(v_object)) ? rdf_literal.rdf_literal_cyc_string(v_object) : NIL;
                if ((NIL != this_label) && (NIL != (NIL != exactP ? equal(this_label, label) : unicode_substringP(label, this_label, NIL)))) {
                    final SubLObject item_var = rdf_triple.rdf_triple_subject(triple);
                    if (NIL == member(item_var, uris, symbol_function(EQL), symbol_function(IDENTITY))) {
                        uris = cons(item_var, uris);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                triple = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return uris;
    }

    public static final SubLObject rdf_labels_for_term_alt(SubLObject v_term, SubLObject language_tag, SubLObject max_number, SubLObject external_onlyP) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        if (external_onlyP == UNPROVIDED) {
            external_onlyP = NIL;
        }
        {
            SubLObject labels = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = rdf_uris_for_cyc_term(v_term, NIL, external_onlyP);
                    SubLObject subject_uri = NIL;
                    for (subject_uri = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subject_uri = csome_list_var.first()) {
                        if (NIL != string_utilities.starts_with(subject_uri, $$$http)) {
                            {
                                SubLObject v_graph = com.cyc.cycjava.cycl.rdf.rdf_graph.find_or_download_rdf_graph(subject_uri);
                                if (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_p(v_graph)) {
                                    if (NIL == doneP) {
                                        {
                                            SubLObject csome_list_var_13 = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_labels(v_graph, subject_uri, language_tag, UNPROVIDED);
                                            SubLObject label = NIL;
                                            for (label = csome_list_var_13.first(); !((NIL != doneP) || (NIL == csome_list_var_13)); csome_list_var_13 = csome_list_var_13.rest() , label = csome_list_var_13.first()) {
                                                {
                                                    SubLObject item_var = label;
                                                    if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        labels = cons(item_var, labels);
                                                    }
                                                }
                                                doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return labels;
        }
    }

    public static SubLObject rdf_labels_for_term(final SubLObject v_term, SubLObject language_tag, SubLObject max_number, SubLObject external_onlyP) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        if (external_onlyP == UNPROVIDED) {
            external_onlyP = NIL;
        }
        SubLObject labels = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = rdf_utilities.rdf_uris_for_cyc_term(v_term, NIL, external_onlyP);
            SubLObject subject_uri = NIL;
            subject_uri = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != starts_with(subject_uri, rdf_graph.$$$http)) {
                    final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                    if ((NIL != rdf_graph.rdf_graph_p(v_graph)) && (NIL == doneP)) {
                        SubLObject csome_list_var_$13 = rdf_graph.rdf_graph_get_labels(v_graph, subject_uri, language_tag, UNPROVIDED);
                        SubLObject label = NIL;
                        label = csome_list_var_$13.first();
                        while ((NIL == doneP) && (NIL != csome_list_var_$13)) {
                            final SubLObject item_var = label;
                            if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                labels = cons(item_var, labels);
                            }
                            doneP = makeBoolean((NIL != max_number) && (NIL != lengthGE(labels, max_number, UNPROVIDED)));
                            csome_list_var_$13 = csome_list_var_$13.rest();
                            label = csome_list_var_$13.first();
                        } 
                    }
                }
                csome_list_var = csome_list_var.rest();
                subject_uri = csome_list_var.first();
            } 
        }
        return labels;
    }

    public static final SubLObject sxhash_rdf_graph_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.sxhash_rdf_graph(v_object);
    }

    public static SubLObject sxhash_rdf_graph_method(final SubLObject v_object) {
        return rdf_graph.sxhash_rdf_graph(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_rdf_graph_alt(SubLObject v_graph) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_struct_triples(v_graph));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_rdf_graph(final SubLObject v_graph) {
        return Sxhash.sxhash(rdf_graph.rdf_graph_struct_triples(v_graph));
    }

    public static final SubLObject rdf_graph_index_add_alt(SubLObject index, SubLObject triple) {
        {
            SubLObject sub_index = NIL;
            SubLObject sub_index_14 = NIL;
            SubLObject key = NIL;
            SubLObject key_15 = NIL;
            for (sub_index = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_indexes(index), sub_index_14 = sub_index.first(), key = rdf_triple.rdf_triple_args(triple), key_15 = key.first(); !((NIL == key) && (NIL == sub_index)); sub_index = sub_index.rest() , sub_index_14 = sub_index.first() , key = key.rest() , key_15 = key.first()) {
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_sub_index_add(sub_index_14, key_15, triple);
            }
        }
        return NIL;
    }

    public static SubLObject rdf_graph_index_add(final SubLObject index, final SubLObject triple) {
        SubLObject sub_index = NIL;
        SubLObject sub_index_$14 = NIL;
        SubLObject key = NIL;
        SubLObject key_$15 = NIL;
        sub_index = rdf_graph.rdf_graph_index_sub_indexes(index);
        sub_index_$14 = sub_index.first();
        key = rdf_triple.rdf_triple_args(triple);
        key_$15 = key.first();
        while ((NIL != key) || (NIL != sub_index)) {
            rdf_graph.rdf_graph_sub_index_add(sub_index_$14, key_$15, triple);
            sub_index = sub_index.rest();
            sub_index_$14 = sub_index.first();
            key = key.rest();
            key_$15 = key.first();
        } 
        return NIL;
    }

    public static final SubLObject rdf_graph_sub_index_add_alt(SubLObject sub_index, SubLObject key, SubLObject triple) {
        {
            SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, key, NIL);
            if (NIL == set.set_p(triples)) {
                triples = set.new_set($rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED);
                dictionary.dictionary_enter(sub_index, key, triples);
            }
            return set.set_add(triple, triples);
        }
    }

    public static SubLObject rdf_graph_sub_index_add(final SubLObject sub_index, final SubLObject key, final SubLObject triple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != rdf_graph.$rdf_graph_literal_indexing_enabledP$.getDynamicValue(thread)) || (NIL == rdf_literal.rdf_literal_p(key))) {
            SubLObject triples = dictionary_lookup_without_values(sub_index, key, NIL);
            if (NIL == set_p(triples)) {
                triples = new_set(rdf_graph.$rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED);
                dictionary_enter(sub_index, key, triples);
            }
            return set_add(triple, triples);
        }
        return NIL;
    }

    public static final SubLObject clear_rdf_graph_index_sub_indexes_alt() {
        {
            SubLObject cs = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_graph_index_sub_indexes() {
        final SubLObject cs = rdf_graph.$rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_graph_index_sub_indexes_alt(SubLObject graph_index) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_index_sub_indexes_caching_state$.getGlobalValue(), list(graph_index), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_graph_index_sub_indexes(final SubLObject graph_index) {
        return caching_state_remove_function_results_with_args(rdf_graph.$rdf_graph_index_sub_indexes_caching_state$.getGlobalValue(), list(graph_index), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_graph_index_sub_indexes_internal_alt(SubLObject graph_index) {
        return list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index(graph_index), com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index(graph_index), com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index(graph_index));
    }

    public static SubLObject rdf_graph_index_sub_indexes_internal(final SubLObject graph_index) {
        return list(rdf_graph.rdf_graph_index_subject_index(graph_index), rdf_graph.rdf_graph_index_predicate_index(graph_index), rdf_graph.rdf_graph_index_object_index(graph_index));
    }

    public static final SubLObject rdf_graph_index_sub_indexes_alt(SubLObject graph_index) {
        {
            SubLObject caching_state = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_INDEX_SUB_INDEXES, $rdf_graph_index_sub_indexes_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, graph_index, $kw61$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw61$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_indexes_internal(graph_index)));
                    memoization_state.caching_state_put(caching_state, graph_index, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdf_graph_index_sub_indexes(final SubLObject graph_index) {
        SubLObject caching_state = rdf_graph.$rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rdf_graph.RDF_GRAPH_INDEX_SUB_INDEXES, rdf_graph.$rdf_graph_index_sub_indexes_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, graph_index, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_graph.rdf_graph_index_sub_indexes_internal(graph_index)));
            caching_state_put(caching_state, graph_index, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject rdf_graph_index_remove_alt(SubLObject index, SubLObject triple) {
        com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_subject_index_remove(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index(index), triple);
        com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_predicate_index_remove(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index(index), triple);
        com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_object_index_remove(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index(index), triple);
        return NIL;
    }

    public static SubLObject rdf_graph_index_remove(final SubLObject index, final SubLObject triple) {
        rdf_graph.rdf_graph_subject_index_remove(rdf_graph.rdf_graph_index_subject_index(index), triple);
        rdf_graph.rdf_graph_predicate_index_remove(rdf_graph.rdf_graph_index_predicate_index(index), triple);
        rdf_graph.rdf_graph_object_index_remove(rdf_graph.rdf_graph_index_object_index(index), triple);
        return NIL;
    }

    public static final SubLObject rdf_graph_subject_index_remove_alt(SubLObject subject_index, SubLObject triple) {
        {
            SubLObject subject = rdf_triple.rdf_triple_subject(triple);
            SubLObject triples = dictionary.dictionary_lookup_without_values(subject_index, subject, NIL);
            return NIL != set.set_p(triples) ? ((SubLObject) (set.set_remove(triple, triples))) : NIL;
        }
    }

    public static SubLObject rdf_graph_subject_index_remove(final SubLObject subject_index, final SubLObject triple) {
        final SubLObject subject = rdf_triple.rdf_triple_subject(triple);
        final SubLObject triples = dictionary_lookup_without_values(subject_index, subject, NIL);
        return NIL != set_p(triples) ? set_remove(triple, triples) : NIL;
    }

    public static final SubLObject rdf_graph_predicate_index_remove_alt(SubLObject predicate_index, SubLObject triple) {
        {
            SubLObject predicate = rdf_triple.rdf_triple_predicate(triple);
            SubLObject triples = dictionary.dictionary_lookup_without_values(predicate_index, predicate, NIL);
            return NIL != set.set_p(triples) ? ((SubLObject) (set.set_remove(triple, triples))) : NIL;
        }
    }

    public static SubLObject rdf_graph_predicate_index_remove(final SubLObject predicate_index, final SubLObject triple) {
        final SubLObject predicate = rdf_triple.rdf_triple_predicate(triple);
        final SubLObject triples = dictionary_lookup_without_values(predicate_index, predicate, NIL);
        return NIL != set_p(triples) ? set_remove(triple, triples) : NIL;
    }

    public static final SubLObject rdf_graph_object_index_remove_alt(SubLObject object_index, SubLObject triple) {
        {
            SubLObject v_object = rdf_triple.rdf_triple_object(triple);
            SubLObject triples = dictionary.dictionary_lookup_without_values(object_index, v_object, NIL);
            return NIL != set.set_p(triples) ? ((SubLObject) (set.set_remove(triple, triples))) : NIL;
        }
    }

    public static SubLObject rdf_graph_object_index_remove(final SubLObject object_index, final SubLObject triple) {
        final SubLObject v_object = rdf_triple.rdf_triple_object(triple);
        final SubLObject triples = dictionary_lookup_without_values(object_index, v_object, NIL);
        return NIL != set_p(triples) ? set_remove(triple, triples) : NIL;
    }

    public static final SubLObject rdf_graph_index_find_triple_alt(SubLObject graph_index, SubLObject subject, SubLObject predicate, SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        {
            SubLObject subject_index_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index_count(graph_index, subject);
            SubLObject predicate_index_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index_count(graph_index, predicate);
            SubLObject object_index_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index_count(graph_index, v_object);
            if ((subject_index_count.numLE(predicate_index_count) && subject_index_count.numLE(object_index_count)) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(subject)))) {
                {
                    SubLObject key = subject;
                    return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index(graph_index), key, subject, predicate, v_object, permissive_blank_node_matchingP);
                }
            } else {
                if (object_index_count.numLE(predicate_index_count) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(v_object)))) {
                    {
                        SubLObject key = v_object;
                        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index(graph_index), key, subject, predicate, v_object, permissive_blank_node_matchingP);
                    }
                } else {
                    if ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(predicate))) {
                        {
                            SubLObject key = predicate;
                            return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index(graph_index), key, subject, predicate, v_object, permissive_blank_node_matchingP);
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject rdf_graph_index_find_triple(final SubLObject graph_index, final SubLObject subject, final SubLObject predicate, final SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        final SubLObject subject_index_count = rdf_graph.rdf_graph_index_subject_index_count(graph_index, subject);
        final SubLObject predicate_index_count = rdf_graph.rdf_graph_index_predicate_index_count(graph_index, predicate);
        final SubLObject object_index_count = rdf_graph.rdf_graph_index_object_index_count(graph_index, v_object);
        if ((subject_index_count.numLE(predicate_index_count) && ((NIL != rdf_literal.rdf_literal_p(v_object)) || subject_index_count.numLE(object_index_count))) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(subject)))) {
            return rdf_graph.rdf_graph_index_find(rdf_graph.rdf_graph_index_subject_index(graph_index), subject, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        if (((NIL == rdf_literal.rdf_literal_p(v_object)) && object_index_count.numLE(predicate_index_count)) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(v_object)))) {
            return rdf_graph.rdf_graph_index_find(rdf_graph.rdf_graph_index_object_index(graph_index), v_object, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        if ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(predicate))) {
            return rdf_graph.rdf_graph_index_find(rdf_graph.rdf_graph_index_predicate_index(graph_index), predicate, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        return NIL;
    }

    /**
     *
     *
     * @return SET-P of triples in which NODE is in POSITION
     */
    @LispMethod(comment = "@return SET-P of triples in which NODE is in POSITION")
    public static final SubLObject rdf_graph_index_find_triples_alt(SubLObject graph_index, SubLObject node, SubLObject position) {
        SubLTrampolineFile.checkType(position, RDF_TRIPLE_POSITION_P);
        {
            SubLObject triples = NIL;
            SubLObject pcase_var = position;
            if (pcase_var.eql($SUBJECT)) {
                triples = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index(graph_index), node, UNPROVIDED);
            } else {
                if (pcase_var.eql($PREDICATE)) {
                    triples = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index(graph_index), node, UNPROVIDED);
                } else {
                    if (pcase_var.eql($OBJECT)) {
                        triples = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index(graph_index), node, UNPROVIDED);
                    }
                }
            }
            return NIL != triples ? ((SubLObject) (triples)) : set.new_set(UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return SET-P of triples in which NODE is in POSITION
     */
    @LispMethod(comment = "@return SET-P of triples in which NODE is in POSITION")
    public static SubLObject rdf_graph_index_find_triples(final SubLObject graph_index, final SubLObject node, SubLObject position) {
        assert NIL != rdf_triple.rdf_triple_position_p(position) : "! rdf_triple.rdf_triple_position_p(position) " + ("rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) ") + position;
        SubLObject triples = NIL;
        if (position.eql($SUBJECT)) {
            triples = dictionary_lookup_without_values(rdf_graph.rdf_graph_index_subject_index(graph_index), node, UNPROVIDED);
        } else
            if (position.eql($PREDICATE)) {
                triples = dictionary_lookup_without_values(rdf_graph.rdf_graph_index_predicate_index(graph_index), node, UNPROVIDED);
            } else
                if (position.eql($OBJECT)) {
                    triples = dictionary_lookup_without_values(rdf_graph.rdf_graph_index_object_index(graph_index), node, UNPROVIDED);
                }


        return NIL != triples ? triples : new_set(UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rdf_graph_index_find_values_alt(SubLObject graph_index, SubLObject node, SubLObject position, SubLObject other_node, SubLObject other_position) {
        {
            SubLObject index_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_index_count(graph_index, node, position);
            SubLObject other_index_count = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_index_count(graph_index, other_node, other_position);
            if (index_count.numLE(other_index_count)) {
                {
                    SubLObject triples = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_triples(graph_index, node, position);
                    SubLObject values = NIL;
                    SubLObject set_contents_var = set.do_set_internal(triples);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                                if (other_node == rdf_triple.rdf_triple_arg(triple, other_position)) {
                                    {
                                        SubLObject item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                                        if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            values = cons(item_var, values);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return values;
                }
            } else {
                {
                    SubLObject triples = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_find_triples(graph_index, other_node, other_position);
                    SubLObject values = NIL;
                    SubLObject set_contents_var = set.do_set_internal(triples);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject triple = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
                                if (node == rdf_triple.rdf_triple_arg(triple, position)) {
                                    {
                                        SubLObject item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                                        if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            values = cons(item_var, values);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return values;
                }
            }
        }
    }

    public static SubLObject rdf_graph_index_find_values(final SubLObject graph_index, final SubLObject node, SubLObject position, final SubLObject other_node, final SubLObject other_position) {
        final SubLObject index_count = rdf_graph.rdf_graph_index_sub_index_count(graph_index, node, position);
        final SubLObject other_index_count = rdf_graph.rdf_graph_index_sub_index_count(graph_index, other_node, other_position);
        if (index_count.numLE(other_index_count)) {
            final SubLObject triples = rdf_graph.rdf_graph_index_find_triples(graph_index, node, position);
            SubLObject values = NIL;
            final SubLObject set_contents_var = do_set_internal(triples);
            SubLObject basis_object;
            SubLObject state;
            SubLObject triple;
            SubLObject item_var;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                triple = do_set_contents_next(basis_object, state);
                if ((NIL != do_set_contents_element_validP(state, triple)) && other_node.eql(rdf_triple.rdf_triple_arg(triple, other_position))) {
                    item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                    if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                        values = cons(item_var, values);
                    }
                }
            }
            return values;
        }
        final SubLObject triples = rdf_graph.rdf_graph_index_find_triples(graph_index, other_node, other_position);
        SubLObject values = NIL;
        final SubLObject set_contents_var = do_set_internal(triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        SubLObject item_var;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            triple = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, triple)) && node.eql(rdf_triple.rdf_triple_arg(triple, position))) {
                item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                    values = cons(item_var, values);
                }
            }
        }
        return values;
    }

    public static final SubLObject rdf_graph_index_sub_index_count_alt(SubLObject graph_index, SubLObject node, SubLObject position) {
        {
            SubLObject sub_index = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_get_sub_index(graph_index, position);
            SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, node, NIL);
            return NIL != set.set_p(triples) ? ((SubLObject) (set.set_size(triples))) : ZERO_INTEGER;
        }
    }

    public static SubLObject rdf_graph_index_sub_index_count(final SubLObject graph_index, final SubLObject node, SubLObject position) {
        final SubLObject sub_index = rdf_graph.rdf_graph_index_get_sub_index(graph_index, position);
        final SubLObject triples = dictionary_lookup_without_values(sub_index, node, NIL);
        return NIL != set_p(triples) ? set_size(triples) : ZERO_INTEGER;
    }

    public static final SubLObject rdf_graph_index_get_sub_index_alt(SubLObject graph_index, SubLObject position) {
        SubLTrampolineFile.checkType(position, RDF_TRIPLE_POSITION_P);
        {
            SubLObject pcase_var = position;
            if (pcase_var.eql($SUBJECT)) {
                return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index(graph_index);
            } else {
                if (pcase_var.eql($PREDICATE)) {
                    return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index(graph_index);
                } else {
                    if (pcase_var.eql($OBJECT)) {
                        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index(graph_index);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rdf_graph_index_get_sub_index(final SubLObject graph_index, SubLObject position) {
        assert NIL != rdf_triple.rdf_triple_position_p(position) : "! rdf_triple.rdf_triple_position_p(position) " + ("rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) ") + position;
        if (position.eql($SUBJECT)) {
            return rdf_graph.rdf_graph_index_subject_index(graph_index);
        }
        if (position.eql($PREDICATE)) {
            return rdf_graph.rdf_graph_index_predicate_index(graph_index);
        }
        if (position.eql($OBJECT)) {
            return rdf_graph.rdf_graph_index_object_index(graph_index);
        }
        return NIL;
    }

    public static final SubLObject rdf_graph_index_subject_index_count_alt(SubLObject graph_index, SubLObject subject) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_index_count(graph_index, subject, $SUBJECT);
    }

    public static SubLObject rdf_graph_index_subject_index_count(final SubLObject graph_index, final SubLObject subject) {
        return rdf_graph.rdf_graph_index_sub_index_count(graph_index, subject, $SUBJECT);
    }

    public static final SubLObject rdf_graph_index_predicate_index_count_alt(SubLObject graph_index, SubLObject predicate) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_index_count(graph_index, predicate, $PREDICATE);
    }

    public static SubLObject rdf_graph_index_predicate_index_count(final SubLObject graph_index, final SubLObject predicate) {
        return rdf_graph.rdf_graph_index_sub_index_count(graph_index, predicate, $PREDICATE);
    }

    public static final SubLObject rdf_graph_index_object_index_count_alt(SubLObject graph_index, SubLObject v_object) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_sub_index_count(graph_index, v_object, $OBJECT);
    }

    public static SubLObject rdf_graph_index_object_index_count(final SubLObject graph_index, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != rdf_graph.$rdf_graph_literal_indexing_enabledP$.getDynamicValue(thread)) && (NIL != rdf_literal.rdf_literal_p(v_object))) {
            final SubLObject triples = apply(APPEND, Mapping.mapcar(rdf_graph.SET_ELEMENT_LIST, dictionary_values(rdf_graph.rdf_graph_index_object_index(graph_index))));
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = triples;
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != rdf_graph.rdf_nodes_equalP(v_object, rdf_triple.rdf_triple_object(triple))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
            return count;
        }
        return rdf_graph.rdf_graph_index_sub_index_count(graph_index, v_object, $OBJECT);
    }

    public static final SubLObject rdf_graph_index_find_alt(SubLObject sub_index, SubLObject key, SubLObject subject, SubLObject predicate, SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        {
            SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, key, NIL);
            SubLObject triple = NIL;
            if (NIL != set.set_p(triples)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(triples);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != triple) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject this_triple = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, this_triple)) {
                                if (((NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_subject(this_triple), subject, permissive_blank_node_matchingP)) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_predicate(this_triple), predicate, permissive_blank_node_matchingP))) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_object(this_triple), v_object, permissive_blank_node_matchingP))) {
                                    triple = this_triple;
                                }
                            }
                        }
                    }
                }
            }
            return triple;
        }
    }

    public static SubLObject rdf_graph_index_find(final SubLObject sub_index, final SubLObject key, final SubLObject subject, final SubLObject predicate, final SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        final SubLObject triples = dictionary_lookup_without_values(sub_index, key, NIL);
        SubLObject triple = NIL;
        if (NIL != set_p(triples)) {
            final SubLObject set_contents_var = do_set_internal(triples);
            SubLObject basis_object;
            SubLObject state;
            SubLObject this_triple;
            for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); (NIL == triple) && (NIL == do_set_contents_doneP(basis_object, state)); state = do_set_contents_update_state(state)) {
                this_triple = do_set_contents_next(basis_object, state);
                if ((((NIL != do_set_contents_element_validP(state, this_triple)) && (NIL != rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_subject(this_triple), subject, permissive_blank_node_matchingP))) && (NIL != rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_predicate(this_triple), predicate, permissive_blank_node_matchingP))) && (NIL != (NIL != rdf_literal.rdf_literal_p(v_object) ? rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(this_triple), v_object) : rdf_graph.rdf_graph_nodes_matchP(rdf_triple.rdf_triple_object(this_triple), v_object, permissive_blank_node_matchingP)))) {
                    triple = this_triple;
                }
            }
        }
        return triple;
    }

    public static final SubLObject rdf_graph_nodes_matchP_alt(SubLObject node1, SubLObject node2, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        return makeBoolean((((NIL != permissive_blank_node_matchingP) && (NIL != rdf_blank_node.rdf_blank_node_p(node1))) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) || (NIL != funcall($rdf_graph_internal_node_comparison_test$.getGlobalValue(), node1, node2)));
    }

    public static SubLObject rdf_graph_nodes_matchP(final SubLObject node1, final SubLObject node2, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        return makeBoolean((((NIL != permissive_blank_node_matchingP) && (NIL != rdf_blank_node.rdf_blank_node_p(node1))) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) || (NIL != funcall(rdf_graph.$rdf_graph_internal_node_comparison_test$.getGlobalValue(), node1, node2)));
    }

    public static final SubLObject rdf_graph_index_contains_nodeP_alt(SubLObject graph_index, SubLObject node) {
        return makeBoolean((com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_subject_index_count(graph_index, node).isPositive() || com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_predicate_index_count(graph_index, node).isPositive()) || com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_object_index_count(graph_index, node).isPositive());
    }

    public static SubLObject rdf_graph_index_contains_nodeP(final SubLObject graph_index, final SubLObject node) {
        return makeBoolean((rdf_graph.rdf_graph_index_subject_index_count(graph_index, node).isPositive() || rdf_graph.rdf_graph_index_predicate_index_count(graph_index, node).isPositive()) || rdf_graph.rdf_graph_index_object_index_count(graph_index, node).isPositive());
    }

    public static final SubLObject rdf_graph_index_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rdf.rdf_graph.print_rdf_graph_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_graph_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdf_graph.print_rdf_graph_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rdf_graph_index_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_index_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rdf_graph_index_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_index_native.class ? T : NIL;
    }

    public static final SubLObject rdf_graph_index_struct_subject_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_INDEX_P);
        return (($rdf_graph_native)v_object).$index;
    }

    public static SubLObject rdf_graph_index_struct_subject_index(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rdf_graph_index_struct_predicate_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_INDEX_P);
        return (($rdf_graph_native)v_object).$index;
    }

    public static SubLObject rdf_graph_index_struct_predicate_index(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rdf_graph_index_struct_object_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, rdf_graph.RDF_GRAPH_INDEX_P);
        return (($rdf_graph_native)v_object).$index;
    }

    public static SubLObject rdf_graph_index_struct_object_index(final SubLObject v_object) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rdf_graph_index_struct_subject_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_GRAPH_INDEX_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_graph_index_struct_subject_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rdf_graph_index_struct_predicate_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_GRAPH_INDEX_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdf_graph_index_struct_predicate_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rdf_graph_index_struct_object_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_GRAPH_INDEX_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rdf_graph_index_struct_object_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph.rdf_graph_index_p(v_object) : "! rdf_graph.rdf_graph_index_p(v_object) " + "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_rdf_graph_index_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_index_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SUBJECT_INDEX)) {
                        com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_subject_index(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PREDICATE_INDEX)) {
                            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_predicate_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($OBJECT_INDEX)) {
                                com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_object_index(v_new, current_value);
                            } else {
                                Errors.error($str_alt98$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rdf_graph_index(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUBJECT_INDEX)) {
                rdf_graph._csetf_rdf_graph_index_struct_subject_index(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATE_INDEX)) {
                    rdf_graph._csetf_rdf_graph_index_struct_predicate_index(v_new, current_value);
                } else
                    if (pcase_var.eql($OBJECT_INDEX)) {
                        rdf_graph._csetf_rdf_graph_index_struct_object_index(v_new, current_value);
                    } else {
                        Errors.error(rdf_graph.$str106$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_graph_index(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rdf_graph.MAKE_RDF_GRAPH_INDEX, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUBJECT_INDEX, rdf_graph.rdf_graph_index_struct_subject_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE_INDEX, rdf_graph.rdf_graph_index_struct_predicate_index(obj));
        funcall(visitor_fn, obj, $SLOT, $OBJECT_INDEX, rdf_graph.rdf_graph_index_struct_object_index(obj));
        funcall(visitor_fn, obj, $END, rdf_graph.MAKE_RDF_GRAPH_INDEX, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_graph_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rdf_graph.visit_defstruct_rdf_graph_index(obj, visitor_fn);
    }

    public static final SubLObject print_rdf_graph_index_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt131$_RDF_GRAPH_INDEX_);
        return v_object;
    }

    public static SubLObject print_rdf_graph_index(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rdf_graph.$str150$_RDF_GRAPH_INDEX_);
        return v_object;
    }

    public static final SubLObject new_rdf_graph_index_alt() {
        {
            SubLObject graph_index = com.cyc.cycjava.cycl.rdf.rdf_graph.make_rdf_graph_index(UNPROVIDED);
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_subject_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_predicate_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
            com.cyc.cycjava.cycl.rdf.rdf_graph._csetf_rdf_graph_index_struct_object_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
            return graph_index;
        }
    }

    public static SubLObject new_rdf_graph_index() {
        final SubLObject graph_index = rdf_graph.make_rdf_graph_index(UNPROVIDED);
        rdf_graph._csetf_rdf_graph_index_struct_subject_index(graph_index, new_dictionary(rdf_graph.$rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        rdf_graph._csetf_rdf_graph_index_struct_predicate_index(graph_index, new_dictionary(rdf_graph.$rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        rdf_graph._csetf_rdf_graph_index_struct_object_index(graph_index, new_dictionary(rdf_graph.$rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        return graph_index;
    }

    public static final SubLObject rdf_graph_index_subject_index_alt(SubLObject graph_index) {
        SubLTrampolineFile.checkType(graph_index, RDF_GRAPH_INDEX_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_struct_subject_index(graph_index);
    }

    public static SubLObject rdf_graph_index_subject_index(final SubLObject graph_index) {
        assert NIL != rdf_graph.rdf_graph_index_p(graph_index) : "! rdf_graph.rdf_graph_index_p(graph_index) " + ("rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) ") + graph_index;
        return rdf_graph.rdf_graph_index_struct_subject_index(graph_index);
    }

    public static final SubLObject rdf_graph_index_predicate_index_alt(SubLObject graph_index) {
        SubLTrampolineFile.checkType(graph_index, RDF_GRAPH_INDEX_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_struct_predicate_index(graph_index);
    }

    public static SubLObject rdf_graph_index_predicate_index(final SubLObject graph_index) {
        assert NIL != rdf_graph.rdf_graph_index_p(graph_index) : "! rdf_graph.rdf_graph_index_p(graph_index) " + ("rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) ") + graph_index;
        return rdf_graph.rdf_graph_index_struct_predicate_index(graph_index);
    }

    public static final SubLObject rdf_graph_index_object_index_alt(SubLObject graph_index) {
        SubLTrampolineFile.checkType(graph_index, RDF_GRAPH_INDEX_P);
        return com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_struct_object_index(graph_index);
    }

    public static SubLObject rdf_graph_index_object_index(final SubLObject graph_index) {
        assert NIL != rdf_graph.rdf_graph_index_p(graph_index) : "! rdf_graph.rdf_graph_index_p(graph_index) " + ("rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) ") + graph_index;
        return rdf_graph.rdf_graph_index_struct_object_index(graph_index);
    }

    public static final SubLObject sxhash_rdf_graph_index_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.rdf.rdf_graph.sxhash_rdf_graph_index(v_object);
    }

    public static SubLObject sxhash_rdf_graph_index_method(final SubLObject v_object) {
        return rdf_graph.sxhash_rdf_graph_index(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_rdf_graph_index_alt(SubLObject graph_index) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_index_struct_subject_index(graph_index));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_rdf_graph_index(final SubLObject graph_index) {
        return Sxhash.sxhash(rdf_graph.rdf_graph_index_struct_subject_index(graph_index));
    }

    public static SubLObject print_rdf_graph_triples_readably(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        SubLObject cdolist_list_var = set_element_list(rdf_graph.rdf_graph_triples(v_graph));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate_string = rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_predicate(triple));
            final SubLObject subject_string = rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_subject(triple));
            final SubLObject object_string = rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_object(triple));
            format(StreamsLow.$standard_output$.getDynamicValue(thread), rdf_graph.$str152$______A__A__A___, new SubLObject[]{ predicate_string, subject_string, object_string });
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject rdf_graph_compare(final SubLObject graph1, final SubLObject graph2, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject graph1_triple_count = rdf_graph.rdf_graph_triple_count(graph1);
        final SubLObject graph2_triple_count = rdf_graph.rdf_graph_triple_count(graph2);
        final SubLObject _prev_bind_0 = rdf_graph.$graph2_matched_triples$.currentBinding(thread);
        try {
            rdf_graph.$graph2_matched_triples$.bind(NIL, thread);
            SubLObject graph1_focal_triples = NIL;
            SubLObject graph2_focal_triples = NIL;
            SubLObject graph1_matched_triples = NIL;
            SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator(graph1);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject triple1 = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid) && (NIL != subl_promotions.memberP(rdf_triple.rdf_triple_subject(triple1), rdf_graph.rdf_graph_focal_nodes(graph1), rdf_graph.$sym70$RDF_NODES_EQUAL_, UNPROVIDED))) {
                    graph1_focal_triples = cons(triple1, graph1_focal_triples);
                }
            }
            iterator_var = rdf_graph.rdf_graph_triples_iterator(graph2);
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject triple2 = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid) && (NIL != subl_promotions.memberP(rdf_triple.rdf_triple_subject(triple2), rdf_graph.rdf_graph_focal_nodes(graph2), rdf_graph.$sym70$RDF_NODES_EQUAL_, UNPROVIDED))) {
                    graph2_focal_triples = cons(triple2, graph2_focal_triples);
                }
            }
            if (NIL != verboseP) {
                force_format(T, rdf_graph.$str153$Comparing_graph1___A_triples___A_, graph1_triple_count, rdf_graph.rdf_graph_node_count(graph1), length(graph1_focal_triples), graph2_triple_count, rdf_graph.rdf_graph_node_count(graph2), length(graph2_focal_triples), UNPROVIDED, UNPROVIDED);
            }
            final SubLObject _prev_bind_0_$16 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
                final SubLObject local_state;
                final SubLObject state = local_state = new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = $memoization_state$.currentBinding(thread);
                try {
                    $memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state_original_process(local_state);
                    try {
                        SubLObject compares_total = multiply(length(graph1_focal_triples), length(graph2_focal_triples));
                        SubLObject compare_count = ZERO_INTEGER;
                        if (ZERO_INTEGER.numL(compares_total)) {
                            final SubLObject _prev_bind_0_$18 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                try {
                                    noting_percent_progress_preamble(format(NIL, rdf_graph.$str154$Comparing_focal_nodes___A_compare, compares_total));
                                    SubLObject cdolist_list_var = graph1_focal_triples;
                                    SubLObject triple3 = NIL;
                                    triple3 = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject graph2_triples_left_count = length(graph2_focal_triples);
                                        SubLObject done_with_triple2P = NIL;
                                        if (NIL == done_with_triple2P) {
                                            SubLObject csome_list_var = graph2_focal_triples;
                                            SubLObject triple4 = NIL;
                                            triple4 = csome_list_var.first();
                                            while ((NIL == done_with_triple2P) && (NIL != csome_list_var)) {
                                                compare_count = add(compare_count, ONE_INTEGER);
                                                graph2_triples_left_count = subtract(graph2_triples_left_count, ONE_INTEGER);
                                                note_percent_progress(compare_count, compares_total);
                                                if ((NIL == subl_promotions.memberP(triple4, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread), rdf_graph.$sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED)) && (NIL != rdf_graph.rdf_triples_isomorphicP(graph1, triple3, graph2, triple4))) {
                                                    done_with_triple2P = T;
                                                    compare_count = add(compare_count, graph2_triples_left_count);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                triple4 = csome_list_var.first();
                                            } 
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        triple3 = cdolist_list_var.first();
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        compares_total = multiply(rdf_graph.rdf_graph_triple_count(graph1), rdf_graph.rdf_graph_triple_count(graph1));
                        compare_count = ZERO_INTEGER;
                        final SubLObject _prev_bind_0_$20 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(format(NIL, rdf_graph.$str155$Comparing_all_nodes___A_compares_, compares_total));
                                final SubLObject iterator_var2 = rdf_graph.rdf_graph_triples_iterator(graph1);
                                SubLObject valid2;
                                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject triple5 = iteration_next(iterator_var2);
                                    valid2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid2) {
                                        SubLObject graph2_triples_left_count2 = graph2_triple_count;
                                        SubLObject done_with_triple2P2 = NIL;
                                        final SubLObject iterator_var_$21 = rdf_graph.rdf_graph_triples_iterator(graph2);
                                        SubLObject valid_$23;
                                        for (SubLObject done_var_$22 = done_with_triple2P2; NIL == done_var_$22; done_var_$22 = makeBoolean((NIL == valid_$23) || (NIL != done_with_triple2P2))) {
                                            thread.resetMultipleValues();
                                            final SubLObject triple6 = iteration_next(iterator_var_$21);
                                            valid_$23 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != valid_$23) && (NIL == subl_promotions.memberP(triple6, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread), rdf_graph.$sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) {
                                                compare_count = add(compare_count, ONE_INTEGER);
                                                graph2_triples_left_count2 = subtract(graph2_triples_left_count2, ONE_INTEGER);
                                                note_percent_progress(compare_count, compares_total);
                                                if (NIL != rdf_graph.rdf_triples_isomorphicP(graph1, triple5, graph2, triple6)) {
                                                    graph1_matched_triples = cons(triple5, graph1_matched_triples);
                                                    if (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple6))) {
                                                        final SubLObject symmetric_triple = rdf_triple.new_rdf_triple(rdf_triple.rdf_triple_object(triple6), rdf_triple.rdf_triple_predicate(triple6), rdf_triple.rdf_triple_subject(triple6));
                                                        if (NIL != subl_promotions.memberP(symmetric_triple, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread), rdf_graph.$sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED)) {
                                                            rdf_graph.$graph2_matched_triples$.setDynamicValue(cons(triple6, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread)), thread);
                                                        } else {
                                                            rdf_graph.$graph2_matched_triples$.setDynamicValue(cons(symmetric_triple, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread)), thread);
                                                        }
                                                    } else {
                                                        rdf_graph.$graph2_matched_triples$.setDynamicValue(cons(triple6, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread)), thread);
                                                    }
                                                    done_with_triple2P2 = T;
                                                    compare_count = add(compare_count, graph2_triples_left_count2);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    $memoization_state$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0_$16, thread);
            }
            SubLObject graph1_unmatched_triples = NIL;
            SubLObject graph2_unmatched_triples = NIL;
            SubLObject iterator_var3 = rdf_graph.rdf_graph_triples_iterator(graph1);
            SubLObject valid3;
            for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject triple7 = iteration_next(iterator_var3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid3) && (NIL == subl_promotions.memberP(triple7, graph1_matched_triples, rdf_graph.$sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED))) {
                    graph1_unmatched_triples = cons(triple7, graph1_unmatched_triples);
                }
            }
            iterator_var3 = rdf_graph.rdf_graph_triples_iterator(graph2);
            for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject triple8 = iteration_next(iterator_var3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid3) && (NIL == subl_promotions.memberP(triple8, rdf_graph.$graph2_matched_triples$.getDynamicValue(thread), rdf_graph.$sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED))) {
                    graph2_unmatched_triples = cons(triple8, graph2_unmatched_triples);
                }
            }
            return values(graph1_unmatched_triples, graph2_unmatched_triples);
        } finally {
            rdf_graph.$graph2_matched_triples$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt15$Ranking_classes_by_transitive_ins = makeString("Ranking classes by transitive instance count...");

    static private final SubLSymbol $sym17$_ = makeSymbol(">");

    static private final SubLList $list_alt20 = list(list(makeSymbol("NODE"), makeSymbol("GRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt28$_S_already_exists_ = makeString("~S already exists.");

    static private final SubLString $str_alt30$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt31$Dumping_RDF_graph_to_ = makeString("Dumping RDF graph to ");

    static private final SubLString $str_alt32$___ = makeString("...");

    static private final SubLList $list_alt33 = list(list(makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list($DONE);

    static private final SubLList $list_alt37 = list(makeSymbol("*LOADED-RDF-GRAPHS-LOCK*"));

    static private final SubLList $list_alt38 = list(makeSymbol("LOADED-RDF-GRAPHS"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("SUBJECT"), makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym42$TRIPLE = makeUninternedSymbol("TRIPLE");

    static private final SubLSymbol $sym43$DONE_SUBJECTS = makeUninternedSymbol("DONE-SUBJECTS");

    static private final SubLList $list_alt45 = list(list(makeSymbol("NEW-SET")));

    static private final SubLList $list_alt50 = list(list(makeSymbol("TRIPLE"), makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $kw61$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym66$RDF_NODES_EQUAL_ = makeSymbol("RDF-NODES-EQUAL?");

    static private final SubLList $list_alt68 = list(makeSymbol("TRIPLES"), makeSymbol("NODES"), makeSymbol("INDEX"), makeSymbol("LOCK"), makeSymbol("NODE-COUNT"), makeSymbol("PREFIX-MAP"), makeSymbol("FILE-LOCATION"), makeSymbol("TOPIC"));

    static private final SubLList $list_alt69 = list(makeKeyword("TRIPLES"), makeKeyword("NODES"), makeKeyword("INDEX"), $LOCK, makeKeyword("NODE-COUNT"), makeKeyword("PREFIX-MAP"), makeKeyword("FILE-LOCATION"), makeKeyword("TOPIC"));

    static private final SubLList $list_alt70 = list(makeSymbol("RDF-GRAPH-STRUCT-TRIPLES"), makeSymbol("RDF-GRAPH-STRUCT-NODES"), makeSymbol("RDF-GRAPH-STRUCT-INDEX"), makeSymbol("RDF-GRAPH-STRUCT-LOCK"), makeSymbol("RDF-GRAPH-STRUCT-NODE-COUNT"), makeSymbol("RDF-GRAPH-STRUCT-PREFIX-MAP"), makeSymbol("RDF-GRAPH-STRUCT-FILE-LOCATION"), makeSymbol("RDF-GRAPH-STRUCT-TOPIC"));

    static private final SubLList $list_alt71 = list(makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TRIPLES"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODES"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-LOCK"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION"), makeSymbol("_CSETF-RDF-GRAPH-STRUCT-TOPIC"));

    static private final SubLString $str_alt98$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt99$_RDF_GRAPH__A_ = makeString("<RDF-GRAPH ~A>");

    static private final SubLList $list_alt102 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    static private final SubLString $str_alt104$xmlns_ = makeString("xmlns:");

    static private final SubLString $str_alt106$_ = makeString(":");

    static private final SubLList $list_alt116 = list(makeSymbol("SUBJECT-INDEX"), makeSymbol("PREDICATE-INDEX"), makeSymbol("OBJECT-INDEX"));

    static private final SubLList $list_alt117 = list(makeKeyword("SUBJECT-INDEX"), makeKeyword("PREDICATE-INDEX"), makeKeyword("OBJECT-INDEX"));

    static private final SubLList $list_alt118 = list(makeSymbol("RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX"), makeSymbol("RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX"), makeSymbol("RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX"));

    static private final SubLList $list_alt119 = list(makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX"), makeSymbol("_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX"));

    public static SubLObject rdf_triples_isomorphicP(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(list(triple1, triple2), rdf_graph.$rdf_triples_assumed_isomophic$.getDynamicValue(thread), symbol_function(rdf_graph.$sym158$RDF_TRIPLE_PAIR_EQUAL_), UNPROVIDED)) {
            return T;
        }
        return rdf_graph.rdf_triples_isomorphicP_int(graph1, triple1, graph2, triple2);
    }

    public static SubLObject rdf_triple_pair_equalP(final SubLObject triple_pair_1, final SubLObject triple_pair_2) {
        final SubLObject pair_1_first = triple_pair_1.first();
        final SubLObject pair_1_second = second(triple_pair_1);
        final SubLObject pair_2_first = triple_pair_2.first();
        final SubLObject pair_2_second = second(triple_pair_2);
        return makeBoolean(((NIL != rdf_triple.rdf_triples_equalP(pair_1_first, pair_2_first)) && (NIL != rdf_triple.rdf_triples_equalP(pair_1_second, pair_2_second))) || ((NIL != rdf_triple.rdf_triples_equalP(pair_1_first, pair_2_second)) && (NIL != rdf_triple.rdf_triples_equalP(pair_1_second, pair_2_first))));
    }

    static private final SubLString $str_alt131$_RDF_GRAPH_INDEX_ = makeString("<RDF-GRAPH-INDEX>");

    static private final SubLString $$$baxter = makeString("baxter");

    public static SubLObject rdf_triples_isomorphicP_int_internal(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_predicate(triple1), graph2, rdf_triple.rdf_triple_predicate(triple2), UNPROVIDED)) && (((NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), UNPROVIDED)) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_object(triple2), UNPROVIDED))) || (((NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1))) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_object(triple2), UNPROVIDED))) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), UNPROVIDED))))) {
            final SubLObject _prev_bind_0 = rdf_graph.$rdf_triples_assumed_isomophic$.currentBinding(thread);
            try {
                rdf_graph.$rdf_triples_assumed_isomophic$.bind(cons(list(triple1, triple2), rdf_graph.$rdf_triples_assumed_isomophic$.getDynamicValue(thread)), thread);
                result = makeBoolean((NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_predicate(triple1), graph2, rdf_triple.rdf_triple_predicate(triple2), T)) && (((NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), T)) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_object(triple2), T))) || (((NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1))) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_object(triple2), T))) && (NIL != rdf_graph.rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), T)))));
            } finally {
                rdf_graph.$rdf_triples_assumed_isomophic$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    static private final SubLList $list_alt138 = list(makeSymbol("RDF-TEST-CASE-TABLES"));

    static private final SubLList $list_alt142 = list(list(NIL, T));

    static private final SubLString $str_alt150$Failed_to_canonicalize_ = makeString("Failed to canonicalize.");

    static private final SubLString $str_alt151$Got_non_EQ_URIs_for___Emu_ = makeString("Got non-EQ URIs for #$Emu.");

    static private final SubLString $str_alt152$Got_non_EQ_literals_for_comment_l = makeString("Got non-EQ literals for comment-literal.");

    static private final SubLString $str_alt153$Couldn_t_find_equivalent_triple_ = makeString("Couldn't find equivalent triple.");

    static private final SubLString $str_alt154$Failed_to_realize_that_triple_was = makeString("Failed to realize that triple was already there when subject specified via struct.");

    static private final SubLString $str_alt155$Failed_to_realize_that_triple_was = makeString("Failed to realize that triple was already there when subject specified via string.");

    static private final SubLString $str_alt156$Can_t_find_URI_for__S = makeString("Can't find URI for ~S");

    static private final SubLString $str_alt157$Expecting_3_nodes_left__Actual_co = makeString("Expecting 3 nodes left. Actual count: ~D");

    static private final SubLString $str_alt158$Graph_does_not_genls_triple_we_ju = makeString("Graph does not genls triple we just added.");

    static private final SubLString $str_alt159$Expected_1_subject_triple_for_emu = makeString("Expected 1 subject triple for emu. Got ~D");

    static private final SubLString $str_alt160$Expected_1_subject_for_genls_bird = makeString("Expected 1 subject for genls bird Got ~D");

    public static SubLObject rdf_triples_isomorphicP_int(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_graph.rdf_triples_isomorphicP_int_internal(graph1, triple1, graph2, triple2);
        }
        caching_state = memoization_state_lookup(v_memoization_state, rdf_graph.$sym159$RDF_TRIPLES_ISOMORPHIC__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), rdf_graph.$sym159$RDF_TRIPLES_ISOMORPHIC__INT, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state_put(v_memoization_state, rdf_graph.$sym159$RDF_TRIPLES_ISOMORPHIC__INT, caching_state);
        }
        final SubLObject sxhash = sxhash_calc_4(graph1, triple1, graph2, triple2);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (graph1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (triple1.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (graph2.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && triple2.eql(cached_args.first())) {
                                return caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_graph.rdf_triples_isomorphicP_int_internal(graph1, triple1, graph2, triple2)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(graph1, triple1, graph2, triple2));
        return caching_results(results3);
    }

    static private final SubLString $str_alt161$Expecting_5_nodes_left__Actual_co = makeString("Expecting 5 nodes left. Actual count: ~D");

    static private final SubLString $str_alt162$Graph_does_not_comment_triple_we_ = makeString("Graph does not comment triple we just added.");

    static private final SubLString $str_alt163$Graph_contains_genls_triple_we_ju = makeString("Graph contains genls triple we just removed");

    static private final SubLString $str_alt164$Graph_does_not_big_foo_triple_we_ = makeString("Graph does not big-foo triple we just added.");

    static private final SubLString $str_alt165$Graph_does_not_little_foo_triple_ = makeString("Graph does not little-foo triple we just added.");

    static private final SubLString $str_alt166$Looked_for_big_foo__got_little_fo = makeString("Looked for big-foo, got little-foo.");

    public static SubLObject rdf_node_symmetric_predicateP_internal(final SubLObject node) {
        return makeBoolean((((((NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str161$owl_complementOf))) || (NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str162$owl_disjointWith)))) || (NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str163$owl_equivalentClass)))) || (NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str164$owl_equivalentProperty)))) || (NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str165$owl_incompatibleWith)))) || (NIL != rdf_graph.rdf_nodes_equalP(node, rdf_graph.get_known_uri(rdf_graph.$str166$owl_inverseOf))));
    }

    public static SubLObject rdf_node_symmetric_predicateP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_graph.rdf_node_symmetric_predicateP_internal(node);
        }
        caching_state = memoization_state_lookup(v_memoization_state, rdf_graph.$sym160$RDF_NODE_SYMMETRIC_PREDICATE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), rdf_graph.$sym160$RDF_NODE_SYMMETRIC_PREDICATE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state_put(v_memoization_state, rdf_graph.$sym160$RDF_NODE_SYMMETRIC_PREDICATE_, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, node, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_graph.rdf_node_symmetric_predicateP_internal(node)));
            caching_state_put(caching_state, node, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static SubLObject rdf_triples_equal_with_symmetryP(final SubLObject triple1, final SubLObject triple2) {
        if (NIL != rdf_triple.rdf_triples_equalP(triple1, triple2)) {
            return T;
        }
        if ((((NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple1), rdf_triple.rdf_triple_predicate(triple2))) && (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1)))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_subject(triple1), rdf_triple.rdf_triple_object(triple2)))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(triple1), rdf_triple.rdf_triple_subject(triple2)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject rdf_nodes_isomorphicP(final SubLObject graph1, final SubLObject node1, final SubLObject graph2, final SubLObject node2, SubLObject deep_checkingP) {
        if (deep_checkingP == UNPROVIDED) {
            deep_checkingP = NIL;
        }
        if ((NIL != cyc_uri_p(node1)) && (NIL != cyc_uri_p(node2))) {
            return equal(rdf_utilities.cyc_term_from_cyc_rdf_uri(node1), rdf_utilities.cyc_term_from_cyc_rdf_uri(node2));
        }
        if ((((NIL != rdf_uri.rdf_uri_p(node1)) && (NIL != rdf_uri.rdf_uri_p(node2))) && (NIL != rdf_utilities.rdf_uri_to_cyc_term(node1))) && (NIL != rdf_utilities.rdf_uri_to_cyc_term(node2))) {
            return equal(rdf_utilities.rdf_uri_to_cyc_term(node1), rdf_utilities.rdf_uri_to_cyc_term(node2));
        }
        if ((NIL != rdf_uri.rdf_uri_p(node1)) && (NIL != rdf_uri.rdf_uri_p(node2))) {
            return rdf_uri.rdf_uri_equal_p(node1, node2);
        }
        if ((NIL != rdf_literal.rdf_literal_p(node1)) && (NIL != rdf_literal.rdf_literal_p(node2))) {
            final SubLObject node1_datatype_term = (NIL != rdf_literal.rdf_literal_datatype(node1)) ? rdf_utilities.rdf_uri_to_cyc_term(rdf_literal.rdf_literal_datatype(node1)) : NIL;
            final SubLObject node2_datatype_term = (NIL != rdf_literal.rdf_literal_datatype(node2)) ? rdf_utilities.rdf_uri_to_cyc_term(rdf_literal.rdf_literal_datatype(node2)) : NIL;
            return makeBoolean(((NIL != Strings.stringE(rdf_literal.rdf_literal_utf8_lexical_form(node1), rdf_literal.rdf_literal_utf8_lexical_form(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((((NIL == rdf_literal.rdf_literal_language_tag(node1)) || (NIL != Strings.stringE(rdf_graph.$$$en, rdf_literal.rdf_literal_language_tag(node1), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL == rdf_literal.rdf_literal_language_tag(node2)) || (NIL != Strings.stringE(rdf_graph.$$$en, rdf_literal.rdf_literal_language_tag(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || rdf_literal.rdf_literal_language_tag(node1).equal(rdf_literal.rdf_literal_language_tag(node2)))) && (rdf_literal.rdf_literal_datatype(node1).equal(rdf_literal.rdf_literal_datatype(node2)) || (((NIL != fort_p(node1_datatype_term)) && (NIL != fort_p(node2_datatype_term))) && ((node1_datatype_term.equal(node2_datatype_term) || (NIL != genls.genlsP(node1_datatype_term, node2_datatype_term, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlsP(node2_datatype_term, node1_datatype_term, UNPROVIDED, UNPROVIDED))))));
        }
        if ((NIL != rdf_blank_node.rdf_blank_node_p(node1)) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) {
            final SubLObject node1_subject_triples = rdf_graph.rdf_graph_find_subject_triples_closure(graph1, node1, UNPROVIDED);
            final SubLObject node2_subject_triples = rdf_graph.rdf_graph_find_subject_triples_closure(graph2, node2, UNPROVIDED);
            final SubLObject node1_object_triples = rdf_graph.rdf_graph_find_object_triples_closure(graph1, node1, UNPROVIDED);
            final SubLObject node2_object_triples = rdf_graph.rdf_graph_find_object_triples_closure(graph2, node2, UNPROVIDED);
            if ((NIL == same_length_p(node1_subject_triples, node2_subject_triples)) || (NIL == same_length_p(node1_object_triples, node2_object_triples))) {
                return NIL;
            }
            if (NIL == deep_checkingP) {
                return T;
            }
            if ((NIL != rdf_graph.rdf_triple_sets_isomorphicP(graph1, node1_subject_triples, graph2, node2_subject_triples)) && (NIL != rdf_graph.rdf_triple_sets_isomorphicP(graph1, node1_object_triples, graph2, node2_object_triples))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject rdf_triple_sets_isomorphicP(final SubLObject graph1, final SubLObject graph1_triples, final SubLObject graph2, final SubLObject graph2_triples) {
        if (NIL == same_length_p(graph1_triples, graph2_triples)) {
            return NIL;
        }
        SubLObject match_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = graph1_triples;
        SubLObject graph1_triple = NIL;
        graph1_triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject match_foundP = NIL;
            if (NIL == match_foundP) {
                SubLObject csome_list_var = graph2_triples;
                SubLObject graph2_triple = NIL;
                graph2_triple = csome_list_var.first();
                while ((NIL == match_foundP) && (NIL != csome_list_var)) {
                    if (NIL != rdf_graph.rdf_triples_isomorphicP(graph1, graph1_triple, graph2, graph2_triple)) {
                        match_count = add(match_count, ONE_INTEGER);
                        match_foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    graph2_triple = csome_list_var.first();
                } 
            }
            if (NIL == match_foundP) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            graph1_triple = cdolist_list_var.first();
        } 
        if (match_count.eql(length(graph1_triples))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject get_known_uri_internal(final SubLObject v_object) {
        if ((NIL != constant_p(v_object)) && ((((NIL != starts_with(constants_high.constant_name(v_object), rdf_graph.$str168$owl_)) || (NIL != starts_with(constants_high.constant_name(v_object), rdf_graph.$str169$rdf_))) || (NIL != starts_with(constants_high.constant_name(v_object), rdf_graph.$str170$rdfs_))) || (NIL != starts_with(constants_high.constant_name(v_object), rdf_graph.$str171$xsd_)))) {
            return rdf_graph.get_known_uri(constants_high.constant_name(v_object));
        }
        if (NIL != fort_p(v_object)) {
            final SubLObject uri_string = kb_mapping_utilities.fpred_value_in_mt(v_object, rdf_graph.$$rdfURI, rdf_graph.$$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject uri = (uri_string.isString()) ? rdf_uri.get_rdf_uri(uri_string, UNPROVIDED, UNPROVIDED) : NIL;
            if ((((NIL != rdf_utilities.rdf_namespace_uriP(uri)) || (NIL != rdf_utilities.rdfs_namespace_uriP(uri))) || (NIL != owl_namespace_uriP(uri))) || (NIL != rdf_utilities.xsd_namespace_uriP(uri))) {
                return uri;
            }
            return NIL;
        } else {
            if ((v_object.isString() && (NIL != starts_with(v_object, rdf_graph.$str168$owl_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(owl_expanded_name(pre_remove(v_object, rdf_graph.$str168$owl_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if ((v_object.isString() && (NIL != starts_with(v_object, rdf_graph.$str169$rdf_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name(pre_remove(v_object, rdf_graph.$str169$rdf_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if ((v_object.isString() && (NIL != starts_with(v_object, rdf_graph.$str170$rdfs_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(rdf_utilities.rdfs_expanded_name(pre_remove(v_object, rdf_graph.$str170$rdfs_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != implementation_uriP(v_object)) {
                return v_object;
            }
            if (v_object.isString() && (NIL != contains_charP(v_object, CHAR_colon))) {
                final SubLObject prefix_local_part = string_tokenize(v_object, rdf_graph.$list174, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((((NIL != doubletonP(prefix_local_part)) && prefix_local_part.first().isString()) && (NIL != subl_promotions.memberP(prefix_local_part.first(), rdf_graph.$list175, rdf_graph.$sym176$STRING_, UNPROVIDED))) && (NIL != non_empty_stringP(second(prefix_local_part)))) {
                    SubLObject current;
                    final SubLObject datum = current = prefix_local_part;
                    SubLObject prefix = NIL;
                    SubLObject local_part = NIL;
                    destructuring_bind_must_consp(current, datum, rdf_graph.$list177);
                    prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, rdf_graph.$list177);
                    local_part = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != Strings.stringE(prefix, rdf_graph.$$$owl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(owl_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, rdf_graph.$$$rdf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, rdf_graph.$$$rdfs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.rdfs_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, rdf_graph.$$$xsd, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.xsd_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, rdf_graph.$list177);
                    }
                }
            } else {
                if (v_object.isString() && (NIL != implementation_uriP(rdf_uri.get_rdf_uri(v_object, UNPROVIDED, UNPROVIDED)))) {
                    return rdf_uri.get_rdf_uri(v_object, UNPROVIDED, UNPROVIDED);
                }
                Errors.error(rdf_graph.$str182$get_known_uri_called_with_unhandl, v_object);
            }
            return NIL;
        }
    }

    public static SubLObject get_known_uri(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_graph.get_known_uri_internal(v_object);
        }
        caching_state = memoization_state_lookup(v_memoization_state, rdf_graph.GET_KNOWN_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), rdf_graph.GET_KNOWN_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state_put(v_memoization_state, rdf_graph.GET_KNOWN_URI, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, v_object, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_graph.get_known_uri_internal(v_object)));
            caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject test_rdf_graph_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_graph = com.cyc.cycjava.cycl.rdf.rdf_graph.new_rdf_graph();
                SubLObject emu_uri = owl_cycl_to_xml.owl_cyc_uri_for_fort($$Emu, NIL, NIL, UNPROVIDED);
                SubLObject emu = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, emu_uri, UNPROVIDED, UNPROVIDED);
                SubLObject emu2 = rdf_uri.get_rdf_uri(emu_uri, NIL, NIL);
                SubLObject v_genls = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$genls, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject comment = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$comment, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject bird = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$Bird, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject comment_literal = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, kb_accessors.comment($$Emu, $$CurrentWorldDataCollectorMt), $$$en, UNPROVIDED);
                SubLObject big_foo = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, $$$FOO, $$$en, UNPROVIDED);
                SubLObject little_foo = com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, $$$foo, $$$en, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (emu != com.cyc.cycjava.cycl.rdf.rdf_graph.canonicalize_rdf_triple_argument(emu2, v_graph)) {
                        Errors.error($str_alt150$Failed_to_canonicalize_);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (emu != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$Emu, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt151$Got_non_EQ_URIs_for___Emu_);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (comment_literal != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, kb_accessors.comment($$Emu, $$CurrentWorldDataCollectorMt), $$$en, UNPROVIDED)) {
                        Errors.error($str_alt152$Got_non_EQ_literals_for_comment_l);
                    }
                }
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu, v_genls, bird);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_equivalent_tripleP(v_graph, emu2, v_genls, bird)) {
                        Errors.error($str_alt153$Couldn_t_find_equivalent_triple_);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu, v_genls, bird)) {
                        Errors.error($str_alt154$Failed_to_realize_that_triple_was);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu_uri, v_genls, bird)) {
                        Errors.error($str_alt155$Failed_to_realize_that_triple_was);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_has_uriP(v_graph, emu_uri, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt156$Can_t_find_URI_for__S, emu_uri);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!THREE_INTEGER.eql(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph))) {
                        Errors.error($str_alt157$Expecting_3_nodes_left__Actual_co, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird)) {
                        Errors.error($str_alt158$Graph_does_not_genls_triple_we_ju);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.lengthE(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
                        Errors.error($str_alt159$Expected_1_subject_triple_for_emu, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.lengthE(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
                        Errors.error($str_alt159$Expected_1_subject_triple_for_emu, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.lengthE(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, v_genls, bird), ONE_INTEGER, UNPROVIDED)) {
                        Errors.error($str_alt160$Expected_1_subject_for_genls_bird, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_find_subjects(v_graph, v_genls, bird));
                    }
                }
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, comment_literal);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!FIVE_INTEGER.eql(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph))) {
                        Errors.error($str_alt161$Expecting_5_nodes_left__Actual_co, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, comment_literal)) {
                        Errors.error($str_alt162$Graph_does_not_comment_triple_we_);
                    }
                }
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_remove_triple(v_graph, emu, v_genls, bird);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird)) {
                        Errors.error($str_alt163$Graph_contains_genls_triple_we_ju);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!THREE_INTEGER.eql(com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph))) {
                        Errors.error($str_alt157$Expecting_3_nodes_left__Actual_co, com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_node_count(v_graph));
                    }
                }
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, big_foo);
                com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, little_foo);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, big_foo)) {
                        Errors.error($str_alt164$Graph_does_not_big_foo_triple_we_);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, little_foo)) {
                        Errors.error($str_alt165$Graph_does_not_little_foo_triple_);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (com.cyc.cycjava.cycl.rdf.rdf_graph.rdf_graph_get_literal(v_graph, $$$FOO, $$$en, UNPROVIDED) == little_foo) {
                        Errors.error($str_alt166$Looked_for_big_foo__got_little_fo);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject test_rdf_graph() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = rdf_graph.new_rdf_graph();
        final SubLObject emu_uri = owl_cyc_uri_for_fort(rdf_graph.$$Emu, NIL, NIL, UNPROVIDED);
        final SubLObject emu = rdf_graph.rdf_graph_get_uri(v_graph, emu_uri, UNPROVIDED, UNPROVIDED);
        final SubLObject emu2 = rdf_uri.get_rdf_uri(emu_uri, NIL, NIL);
        final SubLObject v_genls = rdf_graph.rdf_graph_get_uri(v_graph, owl_cyc_uri_for_fort(rdf_graph.$$genls, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject comment = rdf_graph.rdf_graph_get_uri(v_graph, owl_cyc_uri_for_fort(rdf_graph.$$comment, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject bird = rdf_graph.rdf_graph_get_uri(v_graph, owl_cyc_uri_for_fort(rdf_graph.$$Bird, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject comment_literal = rdf_graph.rdf_graph_get_literal(v_graph, comment(rdf_graph.$$Emu, rdf_graph.$$CurrentWorldDataCollectorMt), rdf_graph.$$$en, UNPROVIDED);
        final SubLObject big_foo = rdf_graph.rdf_graph_get_literal(v_graph, rdf_graph.$$$FOO, rdf_graph.$$$en, UNPROVIDED);
        final SubLObject little_foo = rdf_graph.rdf_graph_get_literal(v_graph, rdf_graph.$$$foo, rdf_graph.$$$en, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!emu.eql(rdf_graph.canonicalize_rdf_triple_argument(emu2, v_graph)))) {
            Errors.error(rdf_graph.$str199$Failed_to_canonicalize_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!emu.eql(rdf_graph.rdf_graph_get_uri(v_graph, owl_cyc_uri_for_fort(rdf_graph.$$Emu, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
            Errors.error(rdf_graph.$str200$Got_non_EQ_URIs_for___Emu_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!comment_literal.eql(rdf_graph.rdf_graph_get_literal(v_graph, comment(rdf_graph.$$Emu, rdf_graph.$$CurrentWorldDataCollectorMt), rdf_graph.$$$en, UNPROVIDED)))) {
            Errors.error(rdf_graph.$str201$Got_non_EQ_literals_for_comment_l);
        }
        rdf_graph.rdf_graph_add_triple(v_graph, emu, v_genls, bird);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_contains_equivalent_tripleP(v_graph, emu2, v_genls, bird))) {
            Errors.error(rdf_graph.$str202$Couldn_t_find_equivalent_triple_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph.rdf_graph_add_triple(v_graph, emu, v_genls, bird))) {
            Errors.error(rdf_graph.$str203$Failed_to_realize_that_triple_was);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph.rdf_graph_add_triple(v_graph, emu_uri, v_genls, bird))) {
            Errors.error(rdf_graph.$str204$Failed_to_realize_that_triple_was);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_has_uriP(v_graph, emu_uri, UNPROVIDED, UNPROVIDED))) {
            Errors.error(rdf_graph.$str205$Can_t_find_URI_for__S, emu_uri);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!THREE_INTEGER.eql(rdf_graph.rdf_graph_node_count(v_graph)))) {
            Errors.error(rdf_graph.$str206$Expecting_3_nodes_left__Actual_co, rdf_graph.rdf_graph_node_count(v_graph));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird))) {
            Errors.error(rdf_graph.$str207$Graph_does_not_genls_triple_we_ju);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == lengthE(rdf_graph.rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED), ONE_INTEGER, UNPROVIDED))) {
            Errors.error(rdf_graph.$str208$Expected_1_subject_triple_for_emu, rdf_graph.rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == lengthE(rdf_graph.rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED), ONE_INTEGER, UNPROVIDED))) {
            Errors.error(rdf_graph.$str208$Expected_1_subject_triple_for_emu, rdf_graph.rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == lengthE(rdf_graph.rdf_graph_find_subjects(v_graph, v_genls, bird), ONE_INTEGER, UNPROVIDED))) {
            Errors.error(rdf_graph.$str209$Expected_1_subject_for_genls_bird, rdf_graph.rdf_graph_find_subjects(v_graph, v_genls, bird));
        }
        rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, comment_literal);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!FIVE_INTEGER.eql(rdf_graph.rdf_graph_node_count(v_graph)))) {
            Errors.error(rdf_graph.$str210$Expecting_5_nodes_left__Actual_co, rdf_graph.rdf_graph_node_count(v_graph));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, comment_literal))) {
            Errors.error(rdf_graph.$str211$Graph_does_not_comment_triple_we_);
        }
        rdf_graph.rdf_graph_remove_triple(v_graph, emu, v_genls, bird);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird))) {
            Errors.error(rdf_graph.$str212$Graph_contains_genls_triple_we_ju);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!THREE_INTEGER.eql(rdf_graph.rdf_graph_node_count(v_graph)))) {
            Errors.error(rdf_graph.$str206$Expecting_3_nodes_left__Actual_co, rdf_graph.rdf_graph_node_count(v_graph));
        }
        rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, big_foo);
        rdf_graph.rdf_graph_add_triple(v_graph, emu, comment, little_foo);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, big_foo))) {
            Errors.error(rdf_graph.$str213$Graph_does_not_big_foo_triple_we_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph.rdf_graph_contains_tripleP(v_graph, emu, comment, little_foo))) {
            Errors.error(rdf_graph.$str214$Graph_does_not_little_foo_triple_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && rdf_graph.rdf_graph_get_literal(v_graph, rdf_graph.$$$FOO, rdf_graph.$$$en, UNPROVIDED).eql(little_foo)) {
            Errors.error(rdf_graph.$str215$Looked_for_big_foo__got_little_fo);
        }
        return T;
    }

    public static SubLObject declare_rdf_graph_file() {
        declareFunction("new_rdf_graph", "NEW-RDF-GRAPH", 0, 0, false);
        declareFunction("rdf_graph_add_triple", "RDF-GRAPH-ADD-TRIPLE", 4, 0, false);
        declareFunction("rdf_graph_remove_triple", "RDF-GRAPH-REMOVE-TRIPLE", 4, 0, false);
        declareFunction("rdf_graph_remove_known_triple", "RDF-GRAPH-REMOVE-KNOWN-TRIPLE", 2, 0, false);
        declareFunction("rdf_graph_contains_tripleP", "RDF-GRAPH-CONTAINS-TRIPLE?", 4, 0, false);
        declareFunction("rdf_graph_contains_equivalent_tripleP", "RDF-GRAPH-CONTAINS-EQUIVALENT-TRIPLE?", 4, 0, false);
        declareFunction("rdf_graph_find_subject_triples", "RDF-GRAPH-FIND-SUBJECT-TRIPLES", 2, 1, false);
        declareFunction("rdf_graph_find_subject_triples_closure", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CLOSURE", 2, 1, false);
        declareFunction("rdf_graph_find_subject_triples_canonical", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CANONICAL", 2, 1, false);
        declareFunction("rdf_graph_subject_triple_count", "RDF-GRAPH-SUBJECT-TRIPLE-COUNT", 2, 1, false);
        declareFunction("rdf_graph_find_subjects", "RDF-GRAPH-FIND-SUBJECTS", 3, 0, false);
        declareFunction("rdf_graph_find_predicate_triples", "RDF-GRAPH-FIND-PREDICATE-TRIPLES", 2, 0, false);
        declareFunction("rdf_graph_find_predicates", "RDF-GRAPH-FIND-PREDICATES", 3, 0, false);
        declareFunction("rdf_graph_predicate_triple_count", "RDF-GRAPH-PREDICATE-TRIPLE-COUNT", 2, 0, false);
        declareFunction("rdf_graph_find_object_triples", "RDF-GRAPH-FIND-OBJECT-TRIPLES", 2, 1, false);
        declareFunction("rdf_graph_find_object_triples_closure", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CLOSURE", 2, 1, false);
        declareFunction("rdf_graph_find_object_triples_canonical", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CANONICAL", 2, 1, false);
        declareFunction("rdf_graph_find_objects", "RDF-GRAPH-FIND-OBJECTS", 3, 0, false);
        declareFunction("rdf_graph_object_triple_count", "RDF-GRAPH-OBJECT-TRIPLE-COUNT", 2, 1, false);
        declareFunction("valid_rdf_subject_p", "VALID-RDF-SUBJECT-P", 1, 0, false);
        declareFunction("valid_rdf_predicate_p", "VALID-RDF-PREDICATE-P", 1, 0, false);
        declareFunction("valid_rdf_object_p", "VALID-RDF-OBJECT-P", 1, 0, false);
        declareFunction("rdf_graph_get_rdf_namesapce_uri", "RDF-GRAPH-GET-RDF-NAMESAPCE-URI", 2, 0, false);
        declareFunction("rdf_graph_get_uri", "RDF-GRAPH-GET-URI", 2, 2, false);
        declareFunction("rdf_graph_has_uriP", "RDF-GRAPH-HAS-URI?", 2, 2, false);
        declareFunction("rdf_graph_get_blank_node", "RDF-GRAPH-GET-BLANK-NODE", 2, 0, false);
        declareFunction("rdf_graph_get_new_blank_node", "RDF-GRAPH-GET-NEW-BLANK-NODE", 1, 0, false);
        declareFunction("rdf_graph_get_literal", "RDF-GRAPH-GET-LITERAL", 2, 2, false);
        declareFunction("rdf_graph_diff", "RDF-GRAPH-DIFF", 2, 0, false);
        declareFunction("rdf_graph_difference", "RDF-GRAPH-DIFFERENCE", 2, 0, false);
        declareFunction("fort_or_rdf_uri_p", "FORT-OR-RDF-URI-P", 1, 0, false);
        declareFunction("rdf_graph_instances", "RDF-GRAPH-INSTANCES", 2, 1, false);
        declareFunction("rdf_graph_uri_for_fort", "RDF-GRAPH-URI-FOR-FORT", 2, 0, false);
        declareFunction("rank_rdf_classes_transitive", "RANK-RDF-CLASSES-TRANSITIVE", 1, 0, false);
        declareFunction("increment_superclass_count", "INCREMENT-SUPERCLASS-COUNT", 4, 1, false);
        declareFunction("rdf_graph_count_instances", "RDF-GRAPH-COUNT-INSTANCES", 2, 0, false);
        declareFunction("rdf_graph_subclasses", "RDF-GRAPH-SUBCLASSES", 2, 1, false);
        declareFunction("rdf_graph_gather_subclasses_transitive", "RDF-GRAPH-GATHER-SUBCLASSES-TRANSITIVE", 2, 1, false);
        declareFunction("rdf_graph_triple_count", "RDF-GRAPH-TRIPLE-COUNT", 1, 0, false);
        declareFunction("rdf_graph_empty_p", "RDF-GRAPH-EMPTY-P", 1, 0, false);
        declareMacro("rdf_graph_do_nodes", "RDF-GRAPH-DO-NODES");
        declareFunction("get_rdf_graph_lock", "GET-RDF-GRAPH-LOCK", 1, 0, false);
        declareFunction("rdf_graph_node_iterator", "RDF-GRAPH-NODE-ITERATOR", 1, 0, false);
        declareFunction("make_rdf_graph_nodes_iterator_state", "MAKE-RDF-GRAPH-NODES-ITERATOR-STATE", 1, 0, false);
        declareFunction("iterate_rdf_graph_nodes_done", "ITERATE-RDF-GRAPH-NODES-DONE", 1, 0, false);
        declareFunction("iterate_rdf_graph_nodes_next", "ITERATE-RDF-GRAPH-NODES-NEXT", 1, 0, false);
        declareFunction("dump_rdf_graph_to_n_triples", "DUMP-RDF-GRAPH-TO-N-TRIPLES", 2, 0, false);
        declareMacro("do_loaded_rdf_graphs", "DO-LOADED-RDF-GRAPHS");
        declareFunction("loaded_rdf_graphs", "LOADED-RDF-GRAPHS", 0, 0, false);
        declareMacro("rdf_graph_do_subjects", "RDF-GRAPH-DO-SUBJECTS");
        declareFunction("rdf_graph_subject_count", "RDF-GRAPH-SUBJECT-COUNT", 1, 1, false);
        declareMacro("rdf_graph_do_triples", "RDF-GRAPH-DO-TRIPLES");
        declareFunction("rdf_graph_for_uri_loadedP", "RDF-GRAPH-FOR-URI-LOADED?", 1, 0, false);
        declareFunction("loaded_rdf_graph_count", "LOADED-RDF-GRAPH-COUNT", 0, 0, false);
        declareFunction("find_or_download_rdf_graph", "FIND-OR-DOWNLOAD-RDF-GRAPH", 1, 0, false);
        declareFunction("download_rdf_graph", "DOWNLOAD-RDF-GRAPH", 1, 0, false);
        declareFunction("rdf_graph_ontology_uri", "RDF-GRAPH-ONTOLOGY-URI", 1, 0, false);
        declareFunction("rdf_graphs_with_uri_predicate_triples", "RDF-GRAPHS-WITH-URI-PREDICATE-TRIPLES", 3, 0, false);
        declareFunction("rdf_predicate_has_uri_objectsP", "RDF-PREDICATE-HAS-URI-OBJECTS?", 1, 0, false);
        declareFunction("count_triples_for_uri", "COUNT-TRIPLES-FOR-URI", 1, 1, false);
        declareFunction("rdf_graph_get_uri_from_two_parts", "RDF-GRAPH-GET-URI-FROM-TWO-PARTS", 3, 0, false);
        declareFunction("note_rdf_graph_accessed", "NOTE-RDF-GRAPH-ACCESSED", 1, 0, false);
        declareFunction("note_rdf_graph_loaded", "NOTE-RDF-GRAPH-LOADED", 1, 0, false);
        declareFunction("remove_from_loaded_rdf_graphs", "REMOVE-FROM-LOADED-RDF-GRAPHS", 1, 0, false);
        declareFunction("qname_for_uri", "QNAME-FOR-URI", 1, 0, false);
        declareFunction("possibly_cull_loaded_rdf_graphs", "POSSIBLY-CULL-LOADED-RDF-GRAPHS", 0, 0, false);
        declareFunction("next_rdf_blank_node_id", "NEXT-RDF-BLANK-NODE-ID", 0, 0, false);
        declareFunction("clear_rdf_graph_get_blank_node_cached", "CLEAR-RDF-GRAPH-GET-BLANK-NODE-CACHED", 0, 0, false);
        declareFunction("remove_rdf_graph_get_blank_node_cached", "REMOVE-RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false);
        declareFunction("rdf_graph_get_blank_node_cached_internal", "RDF-GRAPH-GET-BLANK-NODE-CACHED-INTERNAL", 2, 0, false);
        declareFunction("rdf_graph_get_blank_node_cached", "RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false);
        declareFunction("clear_rdf_graph_get_literal_cached", "CLEAR-RDF-GRAPH-GET-LITERAL-CACHED", 0, 0, false);
        declareFunction("remove_rdf_graph_get_literal_cached", "REMOVE-RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false);
        declareFunction("rdf_graph_get_literal_cached_internal", "RDF-GRAPH-GET-LITERAL-CACHED-INTERNAL", 4, 0, false);
        declareFunction("rdf_graph_get_literal_cached", "RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false);
        declareFunction("rdf_graph_find_or_create_rdf_triple", "RDF-GRAPH-FIND-OR-CREATE-RDF-TRIPLE", 4, 0, false);
        declareFunction("rdf_graph_find_triple", "RDF-GRAPH-FIND-TRIPLE", 4, 0, false);
        declareFunction("rdf_graph_find_equivalent_triple", "RDF-GRAPH-FIND-EQUIVALENT-TRIPLE", 4, 0, false);
        declareFunction("canonicalize_rdf_triple_argument", "CANONICALIZE-RDF-TRIPLE-ARGUMENT", 2, 0, false);
        declareFunction("xml_literal_datatype_p", "XML-LITERAL-DATATYPE-P", 1, 0, false);
        declareFunction("rdf_graph_find_values", "RDF-GRAPH-FIND-VALUES", 3, 2, false);
        declareFunction("rdf_graph_find_triples", "RDF-GRAPH-FIND-TRIPLES", 3, 0, false);
        declareFunction("rdf_graph_nodes_add", "RDF-GRAPH-NODES-ADD", 2, 0, false);
        declareFunction("rdf_graph_nodes_remove", "RDF-GRAPH-NODES-REMOVE", 2, 0, false);
        declareFunction("rdf_graph_nodes_lookup", "RDF-GRAPH-NODES-LOOKUP", 2, 0, false);
        declareFunction("rdf_nodes_equalP", "RDF-NODES-EQUAL?", 2, 0, false);
        declareFunction("rdf_graph_print_function_trampoline", "RDF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rdf_graph_p", "RDF-GRAPH-P", 1, 0, false);
        new rdf_graph.$rdf_graph_p$UnaryFunction();
        declareFunction("rdf_graph_struct_triples", "RDF-GRAPH-STRUCT-TRIPLES", 1, 0, false);
        declareFunction("rdf_graph_struct_nodes", "RDF-GRAPH-STRUCT-NODES", 1, 0, false);
        declareFunction("rdf_graph_struct_index", "RDF-GRAPH-STRUCT-INDEX", 1, 0, false);
        declareFunction("rdf_graph_struct_lock", "RDF-GRAPH-STRUCT-LOCK", 1, 0, false);
        declareFunction("rdf_graph_struct_node_count", "RDF-GRAPH-STRUCT-NODE-COUNT", 1, 0, false);
        declareFunction("rdf_graph_struct_prefix_map", "RDF-GRAPH-STRUCT-PREFIX-MAP", 1, 0, false);
        declareFunction("rdf_graph_struct_file_location", "RDF-GRAPH-STRUCT-FILE-LOCATION", 1, 0, false);
        declareFunction("rdf_graph_struct_topic", "RDF-GRAPH-STRUCT-TOPIC", 1, 0, false);
        declareFunction("rdf_graph_struct_focal_nodes", "RDF-GRAPH-STRUCT-FOCAL-NODES", 1, 0, false);
        declareFunction("_csetf_rdf_graph_struct_triples", "_CSETF-RDF-GRAPH-STRUCT-TRIPLES", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_nodes", "_CSETF-RDF-GRAPH-STRUCT-NODES", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_index", "_CSETF-RDF-GRAPH-STRUCT-INDEX", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_lock", "_CSETF-RDF-GRAPH-STRUCT-LOCK", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_node_count", "_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_prefix_map", "_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_file_location", "_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_topic", "_CSETF-RDF-GRAPH-STRUCT-TOPIC", 2, 0, false);
        declareFunction("_csetf_rdf_graph_struct_focal_nodes", "_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES", 2, 0, false);
        declareFunction("make_rdf_graph", "MAKE-RDF-GRAPH", 0, 1, false);
        declareFunction("visit_defstruct_rdf_graph", "VISIT-DEFSTRUCT-RDF-GRAPH", 2, 0, false);
        declareFunction("visit_defstruct_object_rdf_graph_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-METHOD", 2, 0, false);
        declareFunction("print_rdf_graph", "PRINT-RDF-GRAPH", 3, 0, false);
        declareFunction("make_new_rdf_graph", "MAKE-NEW-RDF-GRAPH", 0, 0, false);
        declareFunction("rdf_graph_triples", "RDF-GRAPH-TRIPLES", 1, 0, false);
        declareFunction("rdf_graph_triples_iterator", "RDF-GRAPH-TRIPLES-ITERATOR", 1, 0, false);
        declareFunction("rdf_graph_nodes", "RDF-GRAPH-NODES", 1, 0, false);
        declareFunction("rdf_graph_index", "RDF-GRAPH-INDEX", 1, 0, false);
        declareFunction("rdf_graph_lock", "RDF-GRAPH-LOCK", 1, 0, false);
        declareFunction("rdf_graph_node_count", "RDF-GRAPH-NODE-COUNT", 1, 0, false);
        declareFunction("rdf_graph_increment_node_count", "RDF-GRAPH-INCREMENT-NODE-COUNT", 1, 0, false);
        declareFunction("rdf_graph_decrement_node_count", "RDF-GRAPH-DECREMENT-NODE-COUNT", 1, 0, false);
        declareFunction("rdf_graph_file_location", "RDF-GRAPH-FILE-LOCATION", 1, 0, false);
        declareFunction("rdf_graph_note_file_location", "RDF-GRAPH-NOTE-FILE-LOCATION", 2, 0, false);
        declareFunction("rdf_graph_topic", "RDF-GRAPH-TOPIC", 1, 0, false);
        declareFunction("rdf_graph_note_topic", "RDF-GRAPH-NOTE-TOPIC", 2, 0, false);
        declareFunction("rdf_graph_focal_nodes", "RDF-GRAPH-FOCAL-NODES", 1, 0, false);
        declareFunction("rdf_graph_note_focal_node", "RDF-GRAPH-NOTE-FOCAL-NODE", 2, 0, false);
        declareFunction("rdf_graph_prefix_map", "RDF-GRAPH-PREFIX-MAP", 1, 0, false);
        declareFunction("rdf_graph_note_namespace_prefixes", "RDF-GRAPH-NOTE-NAMESPACE-PREFIXES", 2, 0, false);
        declareFunction("rdf_graph_qname_for_uri", "RDF-GRAPH-QNAME-FOR-URI", 2, 0, false);
        declareFunction("rdf_graph_get_label", "RDF-GRAPH-GET-LABEL", 2, 0, false);
        declareFunction("rdf_graph_get_labels", "RDF-GRAPH-GET-LABELS", 2, 2, false);
        declareFunction("rdf_uris_matching_label", "RDF-URIS-MATCHING-LABEL", 1, 1, false);
        declareFunction("rdf_graph_get_uris_matching_label", "RDF-GRAPH-GET-URIS-MATCHING-LABEL", 2, 1, false);
        declareFunction("rdf_labels_for_term", "RDF-LABELS-FOR-TERM", 1, 3, false);
        declareFunction("sxhash_rdf_graph_method", "SXHASH-RDF-GRAPH-METHOD", 1, 0, false);
        declareFunction("sxhash_rdf_graph", "SXHASH-RDF-GRAPH", 1, 0, false);
        declareFunction("rdf_graph_index_add", "RDF-GRAPH-INDEX-ADD", 2, 0, false);
        declareFunction("rdf_graph_sub_index_add", "RDF-GRAPH-SUB-INDEX-ADD", 3, 0, false);
        declareFunction("clear_rdf_graph_index_sub_indexes", "CLEAR-RDF-GRAPH-INDEX-SUB-INDEXES", 0, 0, false);
        declareFunction("remove_rdf_graph_index_sub_indexes", "REMOVE-RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false);
        declareFunction("rdf_graph_index_sub_indexes_internal", "RDF-GRAPH-INDEX-SUB-INDEXES-INTERNAL", 1, 0, false);
        declareFunction("rdf_graph_index_sub_indexes", "RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false);
        declareFunction("rdf_graph_index_remove", "RDF-GRAPH-INDEX-REMOVE", 2, 0, false);
        declareFunction("rdf_graph_subject_index_remove", "RDF-GRAPH-SUBJECT-INDEX-REMOVE", 2, 0, false);
        declareFunction("rdf_graph_predicate_index_remove", "RDF-GRAPH-PREDICATE-INDEX-REMOVE", 2, 0, false);
        declareFunction("rdf_graph_object_index_remove", "RDF-GRAPH-OBJECT-INDEX-REMOVE", 2, 0, false);
        declareFunction("rdf_graph_index_find_triple", "RDF-GRAPH-INDEX-FIND-TRIPLE", 4, 1, false);
        declareFunction("rdf_graph_index_find_triples", "RDF-GRAPH-INDEX-FIND-TRIPLES", 3, 0, false);
        declareFunction("rdf_graph_index_find_values", "RDF-GRAPH-INDEX-FIND-VALUES", 5, 0, false);
        declareFunction("rdf_graph_index_sub_index_count", "RDF-GRAPH-INDEX-SUB-INDEX-COUNT", 3, 0, false);
        declareFunction("rdf_graph_index_get_sub_index", "RDF-GRAPH-INDEX-GET-SUB-INDEX", 2, 0, false);
        declareFunction("rdf_graph_index_subject_index_count", "RDF-GRAPH-INDEX-SUBJECT-INDEX-COUNT", 2, 0, false);
        declareFunction("rdf_graph_index_predicate_index_count", "RDF-GRAPH-INDEX-PREDICATE-INDEX-COUNT", 2, 0, false);
        declareFunction("rdf_graph_index_object_index_count", "RDF-GRAPH-INDEX-OBJECT-INDEX-COUNT", 2, 0, false);
        declareFunction("rdf_graph_index_find", "RDF-GRAPH-INDEX-FIND", 5, 1, false);
        declareFunction("rdf_graph_nodes_matchP", "RDF-GRAPH-NODES-MATCH?", 2, 1, false);
        declareFunction("rdf_graph_index_contains_nodeP", "RDF-GRAPH-INDEX-CONTAINS-NODE?", 2, 0, false);
        declareFunction("rdf_graph_index_print_function_trampoline", "RDF-GRAPH-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rdf_graph_index_p", "RDF-GRAPH-INDEX-P", 1, 0, false);
        new rdf_graph.$rdf_graph_index_p$UnaryFunction();
        declareFunction("rdf_graph_index_struct_subject_index", "RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 1, 0, false);
        declareFunction("rdf_graph_index_struct_predicate_index", "RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 1, 0, false);
        declareFunction("rdf_graph_index_struct_object_index", "RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 1, 0, false);
        declareFunction("_csetf_rdf_graph_index_struct_subject_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 2, 0, false);
        declareFunction("_csetf_rdf_graph_index_struct_predicate_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 2, 0, false);
        declareFunction("_csetf_rdf_graph_index_struct_object_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 2, 0, false);
        declareFunction("make_rdf_graph_index", "MAKE-RDF-GRAPH-INDEX", 0, 1, false);
        declareFunction("visit_defstruct_rdf_graph_index", "VISIT-DEFSTRUCT-RDF-GRAPH-INDEX", 2, 0, false);
        declareFunction("visit_defstruct_object_rdf_graph_index_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-INDEX-METHOD", 2, 0, false);
        declareFunction("print_rdf_graph_index", "PRINT-RDF-GRAPH-INDEX", 3, 0, false);
        declareFunction("new_rdf_graph_index", "NEW-RDF-GRAPH-INDEX", 0, 0, false);
        declareFunction("rdf_graph_index_subject_index", "RDF-GRAPH-INDEX-SUBJECT-INDEX", 1, 0, false);
        declareFunction("rdf_graph_index_predicate_index", "RDF-GRAPH-INDEX-PREDICATE-INDEX", 1, 0, false);
        declareFunction("rdf_graph_index_object_index", "RDF-GRAPH-INDEX-OBJECT-INDEX", 1, 0, false);
        declareFunction("sxhash_rdf_graph_index_method", "SXHASH-RDF-GRAPH-INDEX-METHOD", 1, 0, false);
        declareFunction("sxhash_rdf_graph_index", "SXHASH-RDF-GRAPH-INDEX", 1, 0, false);
        declareFunction("print_rdf_graph_triples_readably", "PRINT-RDF-GRAPH-TRIPLES-READABLY", 1, 0, false);
        declareFunction("rdf_graph_compare", "RDF-GRAPH-COMPARE", 2, 1, false);
        declareFunction("rdf_triples_isomorphicP", "RDF-TRIPLES-ISOMORPHIC?", 4, 0, false);
        declareFunction("rdf_triple_pair_equalP", "RDF-TRIPLE-PAIR-EQUAL?", 2, 0, false);
        declareFunction("rdf_triples_isomorphicP_int_internal", "RDF-TRIPLES-ISOMORPHIC?-INT-INTERNAL", 4, 0, false);
        declareFunction("rdf_triples_isomorphicP_int", "RDF-TRIPLES-ISOMORPHIC?-INT", 4, 0, false);
        declareFunction("rdf_node_symmetric_predicateP_internal", "RDF-NODE-SYMMETRIC-PREDICATE?-INTERNAL", 1, 0, false);
        declareFunction("rdf_node_symmetric_predicateP", "RDF-NODE-SYMMETRIC-PREDICATE?", 1, 0, false);
        declareFunction("rdf_triples_equal_with_symmetryP", "RDF-TRIPLES-EQUAL-WITH-SYMMETRY?", 2, 0, false);
        declareFunction("rdf_nodes_isomorphicP", "RDF-NODES-ISOMORPHIC?", 4, 1, false);
        declareFunction("rdf_triple_sets_isomorphicP", "RDF-TRIPLE-SETS-ISOMORPHIC?", 4, 0, false);
        declareFunction("get_known_uri_internal", "GET-KNOWN-URI-INTERNAL", 1, 0, false);
        declareFunction("get_known_uri", "GET-KNOWN-URI", 1, 0, false);
        declareFunction("test_rdf_graph", "TEST-RDF-GRAPH", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_rdf_graph_file_alt() {
        deflexical("*LOADED-RDF-GRAPHS*", NIL);
        deflexical("*LOADED-RDF-GRAPHS-LOCK*", ReadWriteLocks.new_rw_lock($$$Loaded_RDF_Graphs));
        deflexical("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*", $int$10000);
        deflexical("*RDF-BLANK-NODE-ISG*", NIL != boundp($rdf_blank_node_isg$) ? ((SubLObject) ($rdf_blank_node_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*", NIL);
        deflexical("*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH*", RDF_GRAPH);
        deflexical("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH-INDEX*", RDF_GRAPH_INDEX);
        return NIL;
    }

    public static SubLObject init_rdf_graph_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*LOADED-RDF-GRAPHS*", NIL);
            deflexical("*LOADED-RDF-GRAPHS-LOCK*", ReadWriteLocks.new_rw_lock(rdf_graph.$$$Loaded_RDF_Graphs));
            defparameter("*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*", NIL);
            defparameter("*RDF-GRAPH-CONVERTED-TRIPLES*", NIL);
            deflexical("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*", rdf_graph.$int$10000);
            deflexical("*RDF-BLANK-NODE-ISG*", SubLTrampolineFile.maybeDefault(rdf_graph.$rdf_blank_node_isg$, rdf_graph.$rdf_blank_node_isg$, () -> new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            deflexical("*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*", NIL);
            deflexical("*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*", NIL);
            defconstant("*DTP-RDF-GRAPH*", rdf_graph.RDF_GRAPH);
            deflexical("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*", symbol_function(EQ));
            deflexical("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*", symbol_function(EQ));
            deflexical("*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*", NIL);
            defconstant("*DTP-RDF-GRAPH-INDEX*", rdf_graph.RDF_GRAPH_INDEX);
            defparameter("*GRAPH2-MATCHED-TRIPLES*", NIL);
            defparameter("*RDF-TRIPLES-ASSUMED-ISOMOPHIC*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RDF-BLANK-NODE-ISG*", NIL != boundp($rdf_blank_node_isg$) ? ((SubLObject) ($rdf_blank_node_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_rdf_graph_file_Previous() {
        deflexical("*LOADED-RDF-GRAPHS*", NIL);
        deflexical("*LOADED-RDF-GRAPHS-LOCK*", ReadWriteLocks.new_rw_lock(rdf_graph.$$$Loaded_RDF_Graphs));
        defparameter("*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*", NIL);
        defparameter("*RDF-GRAPH-CONVERTED-TRIPLES*", NIL);
        deflexical("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*", rdf_graph.$int$10000);
        deflexical("*RDF-BLANK-NODE-ISG*", SubLTrampolineFile.maybeDefault(rdf_graph.$rdf_blank_node_isg$, rdf_graph.$rdf_blank_node_isg$, () -> new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*", NIL);
        deflexical("*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH*", rdf_graph.RDF_GRAPH);
        deflexical("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH-INDEX*", rdf_graph.RDF_GRAPH_INDEX);
        defparameter("*GRAPH2-MATCHED-TRIPLES*", NIL);
        defparameter("*RDF-TRIPLES-ASSUMED-ISOMOPHIC*", NIL);
        return NIL;
    }

    public static final SubLObject setup_rdf_graph_file_alt() {
        register_macro_helper(GET_RDF_GRAPH_LOCK, RDF_GRAPH_DO_NODES);
        register_macro_helper(RDF_GRAPH_NODE_ITERATOR, RDF_GRAPH_DO_NODES);
        note_funcall_helper_function(ITERATE_RDF_GRAPH_NODES_DONE);
        note_funcall_helper_function(ITERATE_RDF_GRAPH_NODES_NEXT);
        register_macro_helper(LOADED_RDF_GRAPHS, DO_LOADED_RDF_GRAPHS);
        declare_defglobal($rdf_blank_node_isg$);
        memoization_state.note_globally_cached_function(RDF_GRAPH_GET_BLANK_NODE_CACHED);
        memoization_state.note_globally_cached_function(RDF_GRAPH_GET_LITERAL_CACHED);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), symbol_function(RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RDF_GRAPH_STRUCT_TRIPLES, _CSETF_RDF_GRAPH_STRUCT_TRIPLES);
        def_csetf(RDF_GRAPH_STRUCT_NODES, _CSETF_RDF_GRAPH_STRUCT_NODES);
        def_csetf(RDF_GRAPH_STRUCT_INDEX, _CSETF_RDF_GRAPH_STRUCT_INDEX);
        def_csetf(RDF_GRAPH_STRUCT_LOCK, _CSETF_RDF_GRAPH_STRUCT_LOCK);
        def_csetf(RDF_GRAPH_STRUCT_NODE_COUNT, _CSETF_RDF_GRAPH_STRUCT_NODE_COUNT);
        def_csetf(RDF_GRAPH_STRUCT_PREFIX_MAP, _CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP);
        def_csetf(RDF_GRAPH_STRUCT_FILE_LOCATION, _CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION);
        def_csetf(RDF_GRAPH_STRUCT_TOPIC, _CSETF_RDF_GRAPH_STRUCT_TOPIC);
        identity(RDF_GRAPH);
        note_funcall_helper_function(PRINT_RDF_GRAPH);
        register_macro_helper(RDF_GRAPH_TRIPLES_ITERATOR, RDF_GRAPH_DO_SUBJECTS);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), symbol_function(SXHASH_RDF_GRAPH_METHOD));
        memoization_state.note_globally_cached_function(RDF_GRAPH_INDEX_SUB_INDEXES);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), symbol_function(RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX);
        def_csetf(RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX);
        def_csetf(RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX);
        identity(RDF_GRAPH_INDEX);
        note_funcall_helper_function(PRINT_RDF_GRAPH_INDEX);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), symbol_function(SXHASH_RDF_GRAPH_INDEX_METHOD));
        define_test_case_table_int(TEST_RDF_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, $list_alt138, $KB, $TINY, $WORKING_, T }), $list_alt142);
        return NIL;
    }

    public static SubLObject setup_rdf_graph_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(rdf_graph.GET_RDF_GRAPH_LOCK, rdf_graph.RDF_GRAPH_DO_NODES);
            register_macro_helper(rdf_graph.RDF_GRAPH_NODE_ITERATOR, rdf_graph.RDF_GRAPH_DO_NODES);
            note_funcall_helper_function(rdf_graph.ITERATE_RDF_GRAPH_NODES_DONE);
            note_funcall_helper_function(rdf_graph.ITERATE_RDF_GRAPH_NODES_NEXT);
            register_macro_helper(rdf_graph.LOADED_RDF_GRAPHS, rdf_graph.DO_LOADED_RDF_GRAPHS);
            declare_defglobal(rdf_graph.$rdf_blank_node_isg$);
            note_globally_cached_function(rdf_graph.RDF_GRAPH_GET_BLANK_NODE_CACHED);
            note_globally_cached_function(rdf_graph.RDF_GRAPH_GET_LITERAL_CACHED);
            register_method($print_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rdf_graph.$list78);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_TRIPLES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_TRIPLES);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_NODES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_NODES);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_INDEX, rdf_graph._CSETF_RDF_GRAPH_STRUCT_INDEX);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_LOCK, rdf_graph._CSETF_RDF_GRAPH_STRUCT_LOCK);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_NODE_COUNT, rdf_graph._CSETF_RDF_GRAPH_STRUCT_NODE_COUNT);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_PREFIX_MAP, rdf_graph._CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_FILE_LOCATION, rdf_graph._CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_TOPIC, rdf_graph._CSETF_RDF_GRAPH_STRUCT_TOPIC);
            def_csetf(rdf_graph.RDF_GRAPH_STRUCT_FOCAL_NODES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES);
            identity(rdf_graph.RDF_GRAPH);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD));
            note_funcall_helper_function(rdf_graph.PRINT_RDF_GRAPH);
            register_macro_helper(rdf_graph.RDF_GRAPH_TRIPLES_ITERATOR, rdf_graph.RDF_GRAPH_DO_SUBJECTS);
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.SXHASH_RDF_GRAPH_METHOD));
            note_globally_cached_function(rdf_graph.RDF_GRAPH_INDEX_SUB_INDEXES);
            register_method($print_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(rdf_graph.$list138);
            def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX);
            def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX);
            def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX);
            identity(rdf_graph.RDF_GRAPH_INDEX);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD));
            note_funcall_helper_function(rdf_graph.PRINT_RDF_GRAPH_INDEX);
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.SXHASH_RDF_GRAPH_INDEX_METHOD));
            note_memoized_function(rdf_graph.$sym159$RDF_TRIPLES_ISOMORPHIC__INT);
            note_memoized_function(rdf_graph.$sym160$RDF_NODE_SYMMETRIC_PREDICATE_);
            note_memoized_function(rdf_graph.GET_KNOWN_URI);
            define_test_case_table_int(rdf_graph.TEST_RDF_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, rdf_graph.$list187, $KB, $TINY, $WORKING_, T }), rdf_graph.$list191);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_RDF_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, $list_alt138, $KB, $TINY, $WORKING_, T }), $list_alt142);
        }
        return NIL;
    }

    public static SubLObject setup_rdf_graph_file_Previous() {
        register_macro_helper(rdf_graph.GET_RDF_GRAPH_LOCK, rdf_graph.RDF_GRAPH_DO_NODES);
        register_macro_helper(rdf_graph.RDF_GRAPH_NODE_ITERATOR, rdf_graph.RDF_GRAPH_DO_NODES);
        note_funcall_helper_function(rdf_graph.ITERATE_RDF_GRAPH_NODES_DONE);
        note_funcall_helper_function(rdf_graph.ITERATE_RDF_GRAPH_NODES_NEXT);
        register_macro_helper(rdf_graph.LOADED_RDF_GRAPHS, rdf_graph.DO_LOADED_RDF_GRAPHS);
        declare_defglobal(rdf_graph.$rdf_blank_node_isg$);
        note_globally_cached_function(rdf_graph.RDF_GRAPH_GET_BLANK_NODE_CACHED);
        note_globally_cached_function(rdf_graph.RDF_GRAPH_GET_LITERAL_CACHED);
        register_method($print_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rdf_graph.$list78);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_TRIPLES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_TRIPLES);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_NODES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_NODES);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_INDEX, rdf_graph._CSETF_RDF_GRAPH_STRUCT_INDEX);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_LOCK, rdf_graph._CSETF_RDF_GRAPH_STRUCT_LOCK);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_NODE_COUNT, rdf_graph._CSETF_RDF_GRAPH_STRUCT_NODE_COUNT);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_PREFIX_MAP, rdf_graph._CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_FILE_LOCATION, rdf_graph._CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_TOPIC, rdf_graph._CSETF_RDF_GRAPH_STRUCT_TOPIC);
        def_csetf(rdf_graph.RDF_GRAPH_STRUCT_FOCAL_NODES, rdf_graph._CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES);
        identity(rdf_graph.RDF_GRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD));
        note_funcall_helper_function(rdf_graph.PRINT_RDF_GRAPH);
        register_macro_helper(rdf_graph.RDF_GRAPH_TRIPLES_ITERATOR, rdf_graph.RDF_GRAPH_DO_SUBJECTS);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph$.getGlobalValue(), symbol_function(rdf_graph.SXHASH_RDF_GRAPH_METHOD));
        note_globally_cached_function(rdf_graph.RDF_GRAPH_INDEX_SUB_INDEXES);
        register_method($print_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rdf_graph.$list138);
        def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX);
        def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX);
        def_csetf(rdf_graph.RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX, rdf_graph._CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX);
        identity(rdf_graph.RDF_GRAPH_INDEX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD));
        note_funcall_helper_function(rdf_graph.PRINT_RDF_GRAPH_INDEX);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_graph.$dtp_rdf_graph_index$.getGlobalValue(), symbol_function(rdf_graph.SXHASH_RDF_GRAPH_INDEX_METHOD));
        note_memoized_function(rdf_graph.$sym159$RDF_TRIPLES_ISOMORPHIC__INT);
        note_memoized_function(rdf_graph.$sym160$RDF_NODE_SYMMETRIC_PREDICATE_);
        note_memoized_function(rdf_graph.GET_KNOWN_URI);
        define_test_case_table_int(rdf_graph.TEST_RDF_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, rdf_graph.$list187, $KB, $TINY, $WORKING_, T }), rdf_graph.$list191);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        rdf_graph.declare_rdf_graph_file();
    }

    @Override
    public void initializeVariables() {
        rdf_graph.init_rdf_graph_file();
    }

    @Override
    public void runTopLevelForms() {
        rdf_graph.setup_rdf_graph_file();
    }

    static {
    }

    public static final class $rdf_graph_native extends SubLStructNative {
        public SubLObject $triples;

        public SubLObject $nodes;

        public SubLObject $index;

        public SubLObject $lock;

        public SubLObject $node_count;

        public SubLObject $prefix_map;

        public SubLObject $file_location;

        public SubLObject $topic;

        public SubLObject $focal_nodes;

        private static final SubLStructDeclNative structDecl;

        public $rdf_graph_native() {
            rdf_graph.$rdf_graph_native.this.$triples = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$nodes = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$index = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$lock = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$node_count = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$prefix_map = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$file_location = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$topic = Lisp.NIL;
            rdf_graph.$rdf_graph_native.this.$focal_nodes = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rdf_graph.$rdf_graph_native.this.$triples;
        }

        @Override
        public SubLObject getField3() {
            return rdf_graph.$rdf_graph_native.this.$nodes;
        }

        @Override
        public SubLObject getField4() {
            return rdf_graph.$rdf_graph_native.this.$index;
        }

        @Override
        public SubLObject getField5() {
            return rdf_graph.$rdf_graph_native.this.$lock;
        }

        @Override
        public SubLObject getField6() {
            return rdf_graph.$rdf_graph_native.this.$node_count;
        }

        @Override
        public SubLObject getField7() {
            return rdf_graph.$rdf_graph_native.this.$prefix_map;
        }

        @Override
        public SubLObject getField8() {
            return rdf_graph.$rdf_graph_native.this.$file_location;
        }

        @Override
        public SubLObject getField9() {
            return rdf_graph.$rdf_graph_native.this.$topic;
        }

        @Override
        public SubLObject getField10() {
            return rdf_graph.$rdf_graph_native.this.$focal_nodes;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$triples = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$nodes = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$lock = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$node_count = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$prefix_map = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$file_location = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$topic = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rdf_graph.$rdf_graph_native.this.$focal_nodes = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_native.class, rdf_graph.RDF_GRAPH, rdf_graph.RDF_GRAPH_P, rdf_graph.$list72, rdf_graph.$list73, new String[]{ "$triples", "$nodes", "$index", "$lock", "$node_count", "$prefix_map", "$file_location", "$topic", "$focal_nodes" }, rdf_graph.$list74, rdf_graph.$list75, rdf_graph.PRINT_RDF_GRAPH);
        }
    }

    public static final class $rdf_graph_p$UnaryFunction extends UnaryFunction {
        public $rdf_graph_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-GRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_graph.rdf_graph_p(arg1);
        }
    }

    public static final class $rdf_graph_index_native extends SubLStructNative {
        public SubLObject $subject_index;

        public SubLObject $predicate_index;

        public SubLObject $object_index;

        private static final SubLStructDeclNative structDecl;

        public $rdf_graph_index_native() {
            rdf_graph.$rdf_graph_index_native.this.$subject_index = Lisp.NIL;
            rdf_graph.$rdf_graph_index_native.this.$predicate_index = Lisp.NIL;
            rdf_graph.$rdf_graph_index_native.this.$object_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rdf_graph.$rdf_graph_index_native.this.$subject_index;
        }

        @Override
        public SubLObject getField3() {
            return rdf_graph.$rdf_graph_index_native.this.$predicate_index;
        }

        @Override
        public SubLObject getField4() {
            return rdf_graph.$rdf_graph_index_native.this.$object_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rdf_graph.$rdf_graph_index_native.this.$subject_index = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rdf_graph.$rdf_graph_index_native.this.$predicate_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rdf_graph.$rdf_graph_index_native.this.$object_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rdf.rdf_graph.$rdf_graph_index_native.class, rdf_graph.RDF_GRAPH_INDEX, rdf_graph.RDF_GRAPH_INDEX_P, rdf_graph.$list132, rdf_graph.$list133, new String[]{ "$subject_index", "$predicate_index", "$object_index" }, rdf_graph.$list134, rdf_graph.$list135, rdf_graph.PRINT_RDF_GRAPH_INDEX);
        }
    }

    public static final class $rdf_graph_index_p$UnaryFunction extends UnaryFunction {
        public $rdf_graph_index_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-GRAPH-INDEX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_graph.rdf_graph_index_p(arg1);
        }
    }
}

/**
 * Total time: 1316 ms synthetic
 */
