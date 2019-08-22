package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rdf_graph extends SubLTranslatedFile {
    public static final SubLFile me = new rdf_graph();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_graph";

    public static final String myFingerPrint = "f38d1035223a743e697b06873420f4df81a197225205b992dfedf4f1eabacf95";

    // deflexical
    // Definitions
    private static final SubLSymbol $loaded_rdf_graphs$ = makeSymbol("*LOADED-RDF-GRAPHS*");

    // deflexical
    public static final SubLSymbol $loaded_rdf_graphs_lock$ = makeSymbol("*LOADED-RDF-GRAPHS-LOCK*");

    // defparameter
    private static final SubLSymbol $rdf_graph_literal_indexing_enabledP$ = makeSymbol("*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*");

    // defparameter
    public static final SubLSymbol $rdf_graph_converted_triples$ = makeSymbol("*RDF-GRAPH-CONVERTED-TRIPLES*");

    // deflexical
    private static final SubLSymbol $target_max_loaded_rdf_triple_count$ = makeSymbol("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*");







    // defconstant
    public static final SubLSymbol $dtp_rdf_graph$ = makeSymbol("*DTP-RDF-GRAPH*");

    // deflexical
    private static final SubLSymbol $rdf_graph_internal_triple_comparison_test$ = makeSymbol("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*");

    // deflexical
    private static final SubLSymbol $rdf_graph_internal_node_comparison_test$ = makeSymbol("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*");



    // defconstant
    public static final SubLSymbol $dtp_rdf_graph_index$ = makeSymbol("*DTP-RDF-GRAPH-INDEX*");

    // defparameter
    private static final SubLSymbol $graph2_matched_triples$ = makeSymbol("*GRAPH2-MATCHED-TRIPLES*");

    // defparameter
    private static final SubLSymbol $rdf_triples_assumed_isomophic$ = makeSymbol("*RDF-TRIPLES-ASSUMED-ISOMOPHIC*");

    // Internal Constants
    public static final SubLString $$$Loaded_RDF_Graphs = makeString("Loaded RDF Graphs");

    public static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    public static final SubLSymbol VALID_RDF_SUBJECT_P = makeSymbol("VALID-RDF-SUBJECT-P");

    public static final SubLSymbol VALID_RDF_PREDICATE_P = makeSymbol("VALID-RDF-PREDICATE-P");

    public static final SubLSymbol VALID_RDF_OBJECT_P = makeSymbol("VALID-RDF-OBJECT-P");

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

    public static final SubLList $list38 = list(list(makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list39 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLList $list42 = list(makeSymbol("*LOADED-RDF-GRAPHS-LOCK*"));

    private static final SubLList $list43 = list(makeSymbol("LOADED-RDF-GRAPHS"));

    private static final SubLSymbol LOADED_RDF_GRAPHS = makeSymbol("LOADED-RDF-GRAPHS");

    private static final SubLSymbol DO_LOADED_RDF_GRAPHS = makeSymbol("DO-LOADED-RDF-GRAPHS");

    private static final SubLList $list46 = list(list(makeSymbol("SUBJECT"), makeSymbol("GRAPH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym47$TRIPLE = makeUninternedSymbol("TRIPLE");

    private static final SubLSymbol $sym48$DONE_SUBJECTS = makeUninternedSymbol("DONE-SUBJECTS");



    public static final SubLList $list50 = list(list(makeSymbol("NEW-SET")));

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

    private static final SubLList $list73 = list(new SubLObject[]{ makeKeyword("TRIPLES"), makeKeyword("NODES"), makeKeyword("INDEX"), makeKeyword("LOCK"), makeKeyword("NODE-COUNT"), makeKeyword("PREFIX-MAP"), makeKeyword("FILE-LOCATION"), makeKeyword("TOPIC"), makeKeyword("FOCAL-NODES") });

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

    public static final SubLList $list138 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-GRAPH-INDEX-P"));

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

    private static final SubLObject $$rdfURI = reader_make_constant_shell(makeString("rdfURI"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

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

    private static final SubLObject $$Emu = reader_make_constant_shell(makeString("Emu"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLObject $$Bird = reader_make_constant_shell(makeString("Bird"));

    private static final SubLObject $$CurrentWorldDataCollectorMt = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt"));

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

    public static SubLObject new_rdf_graph() {
        return make_new_rdf_graph();
    }

    public static SubLObject rdf_graph_add_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject c_subject = canonicalize_rdf_triple_argument(subject, v_graph);
        final SubLObject c_predicate = canonicalize_rdf_triple_argument(predicate, v_graph);
        SubLObject c_object = canonicalize_rdf_triple_argument(v_object, v_graph);
        SubLObject triple = NIL;
        SubLObject newP = NIL;
        if (v_object.isString() && ((NIL != rdf_nodes_equalP(c_predicate, rdf_graph_get_uri(v_graph, rdf_utilities.rdfs_expanded_name($$$label), UNPROVIDED, UNPROVIDED))) || (NIL != rdf_nodes_equalP(c_predicate, rdf_graph_get_uri(v_graph, rdf_utilities.rdfs_expanded_name($$$comment), UNPROVIDED, UNPROVIDED))))) {
            c_object = rdf_graph_get_literal(v_graph, v_object, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            thread.resetMultipleValues();
            final SubLObject triple_$1 = rdf_graph_find_or_create_rdf_triple(v_graph, c_subject, c_predicate, c_object);
            final SubLObject newP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            triple = triple_$1;
            newP = newP_$2;
            if (NIL != newP) {
                set.set_add(triple, rdf_graph_triples(v_graph));
                SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rdf_graph_nodes_add(v_graph, node);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
                rdf_graph_index_add(rdf_graph_index(v_graph), triple);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return newP;
    }

    public static SubLObject rdf_graph_remove_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            triple = rdf_graph_find_triple(v_graph, subject, predicate, v_object);
            if (NIL != triple) {
                set.set_remove(triple, rdf_graph_triples(v_graph));
                rdf_graph_index_remove(rdf_graph_index(v_graph), triple);
                SubLObject cdolist_list_var = rdf_triple.rdf_triple_args(triple);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == rdf_graph_index_contains_nodeP(rdf_graph_index(v_graph), node)) {
                        rdf_graph_nodes_remove(v_graph, node);
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
        return list_utilities.sublisp_boolean(triple);
    }

    public static SubLObject rdf_graph_remove_known_triple(final SubLObject v_graph, final SubLObject triple) {
        assert NIL != rdf_triple.rdf_triple_p(triple, UNPROVIDED) : "rdf_triple.rdf_triple_p(triple, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_p(triple, CommonSymbols.UNPROVIDED) " + triple;
        rdf_graph_remove_triple(v_graph, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple));
        return NIL;
    }

    public static SubLObject rdf_graph_contains_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        return list_utilities.sublisp_boolean(rdf_graph_find_triple(v_graph, subject, predicate, v_object));
    }

    public static SubLObject rdf_graph_contains_equivalent_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        return list_utilities.sublisp_boolean(rdf_graph_find_equivalent_triple(v_graph, subject, predicate, v_object));
    }

    public static SubLObject rdf_graph_find_subject_triples(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_subject_triples_closure(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject set_var = rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph_find_triples(v_graph, subject, $OBJECT);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
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
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject triples = NIL;
        SubLObject set_var = rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL == subl_promotions.memberP(triple, $rdf_graph_converted_triples$.getDynamicValue(thread), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph_find_triples(v_graph, subject, $OBJECT);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                $rdf_graph_converted_triples$.setDynamicValue(cons(triple, $rdf_graph_converted_triples$.getDynamicValue(thread)), thread);
                triples = cons(rdf_triple.new_rdf_triple(rdf_triple.rdf_triple_object(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_subject(triple)), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_subject_triple_count(final SubLObject v_graph, final SubLObject subject, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject all_subject_triples = rdf_graph_find_triples(v_graph, subject, $SUBJECT);
        if (NIL == predicate) {
            return set.set_size(all_subject_triples);
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(all_subject_triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject rdf_graph_find_subjects(final SubLObject v_graph, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        return rdf_graph_find_values(v_graph, predicate, $PREDICATE, v_object, $OBJECT);
    }

    public static SubLObject rdf_graph_find_predicate_triples(final SubLObject v_graph, final SubLObject predicate) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        return Mapping.mapcar(COPY_RDF_TRIPLE, set.set_element_list(rdf_graph_find_triples(v_graph, predicate, $PREDICATE)));
    }

    public static SubLObject rdf_graph_find_predicates(final SubLObject v_graph, final SubLObject subject, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        return rdf_graph_find_values(v_graph, subject, $SUBJECT, v_object, $OBJECT);
    }

    public static SubLObject rdf_graph_predicate_triple_count(final SubLObject v_graph, final SubLObject predicate) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        return set.set_size(rdf_graph_find_triples(v_graph, predicate, $PREDICATE));
    }

    public static SubLObject rdf_graph_find_object_triples(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_object_triples_closure(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject set_var = rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        set_var = rdf_graph_find_triples(v_graph, v_object, $SUBJECT);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
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
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        SubLObject triples = NIL;
        final SubLObject predicate_uri = (NIL != predicate) ? NIL != rdf_uri.rdf_uri_p(predicate) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject set_var = rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL == subl_promotions.memberP(triple, $rdf_graph_converted_triples$.getDynamicValue(thread), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) && ((NIL == predicate) || predicate_uri.eql(rdf_triple.rdf_triple_predicate(triple)))) {
                triples = cons(rdf_triple.copy_rdf_triple(triple), triples);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_find_objects(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        return rdf_graph_find_values(v_graph, subject, $SUBJECT, predicate, $PREDICATE);
    }

    public static SubLObject rdf_graph_object_triple_count(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (((NIL != predicate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_predicate_p(predicate))) {
            throw new AssertionError(predicate);
        }
        final SubLObject all_object_triples = rdf_graph_find_triples(v_graph, v_object, $OBJECT);
        if (NIL == predicate) {
            return set.set_size(all_object_triples);
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject predicate_rdf_uri = (NIL != rdf_uri.rdf_uri_p(predicate)) ? predicate : rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(all_object_triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && predicate_rdf_uri.eql(rdf_triple.rdf_triple_predicate(triple))) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject valid_rdf_subject_p(final SubLObject v_object) {
        return makeBoolean(((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != web_utilities.uri_p(v_object, UNPROVIDED))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    public static SubLObject valid_rdf_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != web_utilities.uri_p(v_object, UNPROVIDED)) || (NIL != rdf_uri.rdf_uri_p(v_object)));
    }

    public static SubLObject valid_rdf_object_p(final SubLObject v_object) {
        return makeBoolean((((NIL != rdf_uri.rdf_uri_p(v_object)) || (NIL != web_utilities.uri_p(v_object, UNPROVIDED))) || (NIL != rdf_literal.rdf_literal_p(v_object))) || (NIL != rdf_blank_node.rdf_blank_node_p(v_object)));
    }

    public static SubLObject rdf_graph_get_rdf_namesapce_uri(final SubLObject v_graph, final SubLObject local_part) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_get_uri_from_two_parts(v_graph, rdf_utilities.rdf_namespace(), local_part);
    }

    public static SubLObject rdf_graph_get_uri(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_uri.get_rdf_uri(base_uri, connector, local_part);
    }

    public static SubLObject rdf_graph_has_uriP(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        return list_utilities.sublisp_boolean(rdf_graph_nodes_lookup(v_graph, rdf_uri.get_rdf_uri(base_uri, connector, local_part)));
    }

    public static SubLObject rdf_graph_get_blank_node(final SubLObject v_graph, final SubLObject id) {
        SubLObject node = NIL;
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            node = rdf_graph_get_blank_node_cached(v_graph, id);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return node;
    }

    public static SubLObject rdf_graph_get_new_blank_node(final SubLObject v_graph) {
        return rdf_blank_node.new_rdf_blank_node(next_rdf_blank_node_id());
    }

    public static SubLObject rdf_graph_get_literal(final SubLObject v_graph, final SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (datatype == UNPROVIDED) {
            datatype = NIL;
        }
        assert NIL != stringp(utf8_lexical_form) : "Types.stringp(utf8_lexical_form) " + "CommonSymbols.NIL != Types.stringp(utf8_lexical_form) " + utf8_lexical_form;
        if (((NIL != language_tag) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(language_tag))) {
            throw new AssertionError(language_tag);
        }
        if (((NIL != datatype) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_literal.valid_rdf_literal_datatype_p(datatype))) {
            throw new AssertionError(datatype);
        }
        SubLObject node = NIL;
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            node = rdf_graph_get_literal_cached(v_graph, utf8_lexical_form, language_tag, datatype);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return node;
    }

    public static SubLObject rdf_graph_diff(final SubLObject graph1, final SubLObject graph2) {
        return values(rdf_graph_difference(graph1, graph2), rdf_graph_difference(graph2, graph1));
    }

    public static SubLObject rdf_graph_difference(final SubLObject graph1, final SubLObject graph2) {
        SubLObject ans = NIL;
        final SubLObject set_var = rdf_graph_triples(graph1);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && (NIL == rdf_graph_contains_equivalent_tripleP(graph2, rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple)))) {
                ans = cons(triple, ans);
            }
        }
        return ans;
    }

    public static SubLObject fort_or_rdf_uri_p(final SubLObject obj) {
        return makeBoolean((NIL != forts.fort_p(obj)) || (NIL != rdf_uri.rdf_uri_p(obj)));
    }

    public static SubLObject rdf_graph_instances(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        assert NIL != fort_or_rdf_uri_p(collection) : "rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) " + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph_uri_for_fort(v_graph, collection);
        final SubLObject direct_instances = rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name($$$type), collection_class);
        if (NIL != transitiveP) {
            SubLObject v_instances = direct_instances;
            SubLObject cdolist_list_var = rdf_graph_subclasses(v_graph, collection_class, UNPROVIDED);
            SubLObject subclass = NIL;
            subclass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_instances = nconc(v_instances, rdf_graph_instances(v_graph, subclass, NIL));
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            } 
            return delete_duplicates(v_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return direct_instances;
    }

    public static SubLObject rdf_graph_uri_for_fort(final SubLObject v_graph, final SubLObject fort) {
        return rdf_graph_find_subjects(v_graph, owl_utilities.owl_expanded_name($$$sameAs), owl_cycl_to_xml.owl_cyc_latest_uri_for_fort(fort)).first();
    }

    public static SubLObject rank_rdf_classes_transitive(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject list_var = rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name($$$type), owl_utilities.owl_expanded_name($$$Class));
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str19$Ranking_classes_by_transitive_ins, thread);
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
                        final SubLObject direct_instance_count = rdf_graph_object_triple_count(v_graph, v_class, rdf_utilities.rdf_expanded_name($$$type));
                        dictionary_utilities.dictionary_increment(dict, v_class, direct_instance_count);
                        increment_superclass_count(dict, v_graph, v_class, direct_instance_count, UNPROVIDED);
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
        return remove_if(ZEROP, dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym22$_)), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject increment_superclass_count(final SubLObject dict, final SubLObject v_graph, final SubLObject v_class, final SubLObject count, SubLObject done) {
        if (done == UNPROVIDED) {
            done = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = rdf_graph_find_objects(v_graph, v_class, rdf_utilities.rdfs_expanded_name($$$subClassOf));
        SubLObject superclass = NIL;
        superclass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == set.set_memberP(superclass, done)) {
                dictionary_utilities.dictionary_increment(dict, superclass, count);
                set.set_add(superclass, done);
                increment_superclass_count(dict, v_graph, superclass, count, done);
            }
            cdolist_list_var = cdolist_list_var.rest();
            superclass = cdolist_list_var.first();
        } 
        return dict;
    }

    public static SubLObject rdf_graph_count_instances(final SubLObject v_graph, final SubLObject collection) {
        assert NIL != fort_or_rdf_uri_p(collection) : "rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) " + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph_uri_for_fort(v_graph, collection);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = rdf_graph_subclasses(v_graph, collection_class, T);
        SubLObject subclass = NIL;
        subclass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, rdf_graph_object_triple_count(v_graph, subclass, rdf_utilities.rdf_expanded_name($$$type)));
            cdolist_list_var = cdolist_list_var.rest();
            subclass = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject rdf_graph_subclasses(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP) {
        if (transitiveP == UNPROVIDED) {
            transitiveP = T;
        }
        assert NIL != fort_or_rdf_uri_p(collection) : "rdf_graph.fort_or_rdf_uri_p(collection) " + "CommonSymbols.NIL != rdf_graph.fort_or_rdf_uri_p(collection) " + collection;
        final SubLObject collection_class = (NIL != rdf_uri.rdf_uri_p(collection)) ? collection : rdf_graph_uri_for_fort(v_graph, collection);
        if (NIL != transitiveP) {
            return set.set_element_list(rdf_graph_gather_subclasses_transitive(v_graph, collection_class, UNPROVIDED));
        }
        return delete_duplicates(cons(collection_class, rdf_graph_find_subjects(v_graph, rdf_utilities.rdfs_expanded_name($$$subClassOf), collection_class)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_graph_gather_subclasses_transitive(final SubLObject v_graph, final SubLObject collection_class, SubLObject collector) {
        if (collector == UNPROVIDED) {
            collector = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        if (NIL != set.set_add(collection_class, collector)) {
            SubLObject cdolist_list_var = rdf_graph_subclasses(v_graph, collection_class, NIL);
            SubLObject subclass = NIL;
            subclass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph_gather_subclasses_transitive(v_graph, subclass, collector);
                cdolist_list_var = cdolist_list_var.rest();
                subclass = cdolist_list_var.first();
            } 
        }
        return collector;
    }

    public static SubLObject rdf_graph_triple_count(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return set.set_size(rdf_graph_triples(v_graph));
    }

    public static SubLObject rdf_graph_empty_p(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return eql(ZERO_INTEGER, rdf_graph_triple_count(v_graph));
    }

    public static SubLObject rdf_graph_do_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        v_graph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_READER_LOCK, list(list(GET_RDF_GRAPH_LOCK, v_graph)), listS(DO_ITERATOR, list(node, list(RDF_GRAPH_NODE_ITERATOR, v_graph)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static SubLObject get_rdf_graph_lock(final SubLObject v_graph) {
        return rdf_graph_lock(v_graph);
    }

    public static SubLObject rdf_graph_node_iterator(final SubLObject v_graph) {
        return iteration.new_iterator(make_rdf_graph_nodes_iterator_state(rdf_graph_nodes(v_graph)), ITERATE_RDF_GRAPH_NODES_DONE, ITERATE_RDF_GRAPH_NODES_NEXT, UNPROVIDED);
    }

    public static SubLObject make_rdf_graph_nodes_iterator_state(final SubLObject graph_nodes) {
        return cons(NIL, dictionary.new_dictionary_iterator(graph_nodes));
    }

    public static SubLObject iterate_rdf_graph_nodes_done(final SubLObject state) {
        return makeBoolean((NIL != list_utilities.empty_list_p(state.first())) && (NIL != iteration.iteration_done(state.rest())));
    }

    public static SubLObject iterate_rdf_graph_nodes_next(final SubLObject state) {
        SubLObject next = NIL;
        if (NIL != list_utilities.non_empty_list_p(state.first())) {
            next = state.first().first();
            rplaca(state, state.first().rest());
        } else {
            final SubLObject next_value = second(iteration.iteration_next(state.rest()));
            if (next_value.isList()) {
                rplaca(state, next_value.rest());
                next = next_value.first();
            } else {
                next = next_value;
            }
        }
        return values(next, state);
    }

    public static SubLObject dump_rdf_graph_to_n_triples(final SubLObject v_graph, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != file_utilities.file_existsP(filename))) {
            Errors.error($str33$_S_already_exists_, filename);
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
                Errors.error($str35$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            final SubLObject set_var = rdf_graph_triples(v_graph);
            final SubLObject _prev_bind_2 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(cconcatenate($$$Dumping_RDF_graph_to_, new SubLObject[]{ format_nil.format_nil_s_no_copy(filename), $str37$___ }), thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(set.set_size(set_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject triple;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        triple = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
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

    public static SubLObject do_loaded_rdf_graphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$6, $list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(WITH_READER_LOCK, $list42, listS(DO_ITERATOR, list(v_graph, $list43, $DONE, done), append(body, NIL)));
    }

    public static SubLObject loaded_rdf_graphs() {
        return iteration.new_list_iterator($loaded_rdf_graphs$.getGlobalValue());
    }

    public static SubLObject rdf_graph_do_subjects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subject = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list46);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list46);
            if (NIL == member(current_$7, $list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list46);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject triple = $sym47$TRIPLE;
        final SubLObject done_subjects = $sym48$DONE_SUBJECTS;
        return list(CLET, list(bq_cons(done_subjects, $list50)), list(DO_ITERATOR, list(triple, list(RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), list(CLET, list(list(subject, list(RDF_TRIPLE_SUBJECT, triple))), listS(PWHEN, list(SET_ADD, subject, done_subjects), append(body, NIL)))));
    }

    public static SubLObject rdf_graph_subject_count(final SubLObject v_graph, SubLObject omit_blank_nodesP) {
        if (omit_blank_nodesP == UNPROVIDED) {
            omit_blank_nodesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject done_subjects = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator_var = rdf_graph_triples_iterator(v_graph);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject triple = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject subject = rdf_triple.rdf_triple_subject(triple);
                if ((NIL != set.set_add(subject, done_subjects)) && ((NIL == omit_blank_nodesP) || (NIL == rdf_blank_node.rdf_blank_node_p(subject)))) {
                    count = add(count, ONE_INTEGER);
                }
            }
        }
        return count;
    }

    public static SubLObject rdf_graph_do_triples(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject triple = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        triple = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        v_graph = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$8, $list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ITERATOR, list(triple, list(RDF_GRAPH_TRIPLES_ITERATOR, v_graph), $DONE, done), append(body, NIL));
    }

    public static SubLObject rdf_graph_for_uri_loadedP(final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject loadedP = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = loadedP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != loadedP))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    loadedP = eql(v_rdf_uri, rdf_graph_topic(v_graph));
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return loadedP;
    }

    public static SubLObject loaded_rdf_graph_count() {
        return length($loaded_rdf_graphs$.getGlobalValue());
    }

    public static SubLObject find_or_download_rdf_graph(SubLObject subject_uri) {
        if (NIL != web_utilities.uri_p(subject_uri, UNPROVIDED)) {
            subject_uri = rdf_uri.get_rdf_uri(subject_uri, UNPROVIDED, UNPROVIDED);
        }
        assert NIL != rdf_uri.rdf_uri_p(subject_uri) : "rdf_uri.rdf_uri_p(subject_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(subject_uri) " + subject_uri;
        SubLObject v_graph = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            v_graph = find(subject_uri, $loaded_rdf_graphs$.getGlobalValue(), symbol_function(EQ), symbol_function(RDF_GRAPH_TOPIC), UNPROVIDED, UNPROVIDED);
            if (NIL != v_graph) {
                note_rdf_graph_accessed(v_graph);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        if (NIL == v_graph) {
            v_graph = download_rdf_graph(subject_uri);
        }
        return v_graph;
    }

    public static SubLObject download_rdf_graph(SubLObject subject_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != web_utilities.uri_p(subject_uri, UNPROVIDED)) {
            subject_uri = rdf_uri.get_rdf_uri(subject_uri, UNPROVIDED, UNPROVIDED);
        }
        assert NIL != rdf_uri.rdf_uri_p(subject_uri) : "rdf_uri.rdf_uri_p(subject_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(subject_uri) " + subject_uri;
        SubLObject v_graph = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                        v_graph = rdf_parser.parse_rdfXxml_from_url(rdf_uri.rdf_uri_utf8_string(subject_uri), UNPROVIDED);
                        if (NIL == rdf_graph_empty_p(v_graph)) {
                            note_rdf_graph_loaded(v_graph);
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
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return v_graph;
    }

    public static SubLObject rdf_graph_ontology_uri(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        final SubLObject all_ontologies = rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name($$$type), owl_utilities.owl_expanded_name($$$Ontology));
        return NIL != list_utilities.singletonP(all_ontologies) ? all_ontologies.first() : NIL;
    }

    public static SubLObject rdf_graphs_with_uri_predicate_triples(final SubLObject v_rdf_uri, final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject graphs = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    if (arg.eql(ONE_INTEGER)) {
                        if (NIL != list_utilities.sublisp_boolean(rdf_graph_find_objects(v_graph, v_rdf_uri, predicate))) {
                            graphs = cons(v_graph, graphs);
                        }
                    } else
                        if (arg.eql(TWO_INTEGER) && (NIL != list_utilities.sublisp_boolean(rdf_graph_find_subjects(v_graph, predicate, v_rdf_uri)))) {
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

    public static SubLObject rdf_predicate_has_uri_objectsP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = found_oneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != found_oneP))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    final SubLObject set_var = rdf_graph_find_triples(v_graph, predicate, $PREDICATE);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject triple;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_oneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        triple = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, triple)) {
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

    public static SubLObject count_triples_for_uri(final SubLObject v_rdf_uri, SubLObject position) {
        if (position == UNPROVIDED) {
            position = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    if ((position == $ALL) || (position == $SUBJECT)) {
                        count = add(count, rdf_graph_subject_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
                    }
                    if ((position == $ALL) || (position == $PREDICATE)) {
                        count = add(count, rdf_graph_predicate_triple_count(v_graph, v_rdf_uri));
                    }
                    if ((position == $ALL) || (position == $OBJECT)) {
                        count = add(count, rdf_graph_object_triple_count(v_graph, v_rdf_uri, UNPROVIDED));
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

    public static SubLObject rdf_graph_get_uri_from_two_parts(final SubLObject v_graph, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject base_uri = rdf_uri.rdf_uri_parts_from_two_parts(start, end);
        final SubLObject connector = thread.secondMultipleValue();
        final SubLObject local_part = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return rdf_graph_get_uri(v_graph, base_uri, connector, local_part);
    }

    public static SubLObject note_rdf_graph_accessed(final SubLObject v_rdf_graph) {
        $loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject note_rdf_graph_loaded(final SubLObject v_rdf_graph) {
        $loaded_rdf_graphs$.setGlobalValue(cons(v_rdf_graph, delete(v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        possibly_cull_loaded_rdf_graphs();
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject remove_from_loaded_rdf_graphs(final SubLObject v_graph) {
        $loaded_rdf_graphs$.setGlobalValue(delete(v_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return $loaded_rdf_graphs$.getGlobalValue();
    }

    public static SubLObject qname_for_uri(final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject qname = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = qname; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != qname))) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    qname = rdf_graph_qname_for_uri(v_graph, v_rdf_uri);
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return qname;
    }

    public static SubLObject possibly_cull_loaded_rdf_graphs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (loaded_rdf_graph_count().numG(ONE_INTEGER)) {
            SubLObject triple_count = ZERO_INTEGER;
            final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                final SubLObject rw_lock_var_$9 = $loaded_rdf_graphs_lock$.getGlobalValue();
                SubLObject needs_to_releaseP_$10 = NIL;
                try {
                    needs_to_releaseP_$10 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var_$9);
                    final SubLObject iterator_var = loaded_rdf_graphs();
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject v_graph = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            triple_count = add(triple_count, rdf_graph_triple_count(v_graph));
                        }
                    }
                } finally {
                    if (NIL != needs_to_releaseP_$10) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var_$9);
                    }
                }
                while (triple_count.numG($target_max_loaded_rdf_triple_count$.getGlobalValue()) && loaded_rdf_graph_count().numG(ONE_INTEGER)) {
                    final SubLObject doomed = list_utilities.last_one($loaded_rdf_graphs$.getGlobalValue());
                    triple_count = subtract(triple_count, rdf_graph_triple_count(doomed));
                    remove_from_loaded_rdf_graphs(doomed);
                } 
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
        }
        return NIL;
    }

    public static SubLObject next_rdf_blank_node_id() {
        return integer_sequence_generator.integer_sequence_generator_next($rdf_blank_node_isg$.getGlobalValue());
    }

    public static SubLObject clear_rdf_graph_get_blank_node_cached() {
        final SubLObject cs = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue(), list(v_graph, id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_graph_get_blank_node_cached_internal(final SubLObject v_graph, final SubLObject id) {
        final SubLObject new_node = rdf_blank_node.new_rdf_blank_node(id);
        final SubLObject found_node = rdf_graph_nodes_lookup(v_graph, new_node);
        return NIL != found_node ? found_node : new_node;
    }

    public static SubLObject rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id) {
        SubLObject caching_state = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_GET_BLANK_NODE_CACHED, $rdf_graph_get_blank_node_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_graph, id);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_graph.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rdf_graph_get_blank_node_cached_internal(v_graph, id)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_graph, id));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_rdf_graph_get_literal_cached() {
        final SubLObject cs = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_get_literal_cached_caching_state$.getGlobalValue(), list(v_graph, utf8_lexical_form, language_tag, datatype), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_graph_get_literal_cached_internal(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        final SubLObject new_node = rdf_literal.new_rdf_literal(utf8_lexical_form, language_tag, datatype);
        final SubLObject found_node = rdf_graph_nodes_lookup(v_graph, new_node);
        return NIL != found_node ? found_node : new_node;
    }

    public static SubLObject rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        SubLObject caching_state = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_GET_LITERAL_CACHED, $rdf_graph_get_literal_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_graph, utf8_lexical_form, language_tag, datatype);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
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
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rdf_graph_get_literal_cached_internal(v_graph, utf8_lexical_form, language_tag, datatype)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_graph, utf8_lexical_form, language_tag, datatype));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rdf_graph_find_or_create_rdf_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject found = rdf_graph_find_triple(v_graph, subject, predicate, v_object);
        return values(NIL != found ? found : rdf_triple.new_rdf_triple(subject, predicate, v_object), sublisp_null(found));
    }

    public static SubLObject rdf_graph_find_triple(final SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        if (NIL != web_utilities.uri_p(subject, UNPROVIDED)) {
            subject = rdf_graph_get_uri(v_graph, subject, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != web_utilities.uri_p(predicate, UNPROVIDED)) {
            predicate = rdf_graph_get_uri(v_graph, predicate, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != web_utilities.uri_p(v_object, UNPROVIDED)) {
            v_object = rdf_graph_get_uri(v_graph, v_object, UNPROVIDED, UNPROVIDED);
        }
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triple = rdf_graph_index_find_triple(rdf_graph_index(v_graph), subject, predicate, v_object, UNPROVIDED);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triple;
    }

    public static SubLObject rdf_graph_find_equivalent_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject c_subject = canonicalize_rdf_triple_argument(subject, v_graph);
        final SubLObject c_predicate = canonicalize_rdf_triple_argument(predicate, v_graph);
        final SubLObject c_object = canonicalize_rdf_triple_argument(v_object, v_graph);
        SubLObject triple = NIL;
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triple = rdf_graph_index_find_triple(rdf_graph_index(v_graph), c_subject, c_predicate, c_object, T);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triple;
    }

    public static SubLObject canonicalize_rdf_triple_argument(final SubLObject arg, final SubLObject v_graph) {
        SubLObject canonical = arg;
        if (NIL != rdf_uri.rdf_uri_p(arg)) {
            canonical = rdf_uri.rdf_uri_utf8_string(arg);
        }
        if (canonical.isString()) {
            canonical = rdf_graph_get_uri(v_graph, canonical, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != rdf_literal.rdf_literal_p(arg)) {
            final SubLObject datatype = rdf_literal.rdf_literal_datatype(arg);
            final SubLObject lexical_form = (NIL != xml_literal_datatype_p(datatype)) ? rdf_utilities.rdf_canonicalize_xml_string(rdf_literal.rdf_literal_utf8_lexical_form(arg)) : rdf_literal.rdf_literal_utf8_lexical_form(arg);
            canonical = rdf_graph_get_literal(v_graph, lexical_form, rdf_literal.rdf_literal_language_tag(arg), datatype);
        }
        return canonical;
    }

    public static SubLObject xml_literal_datatype_p(final SubLObject datatype) {
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_utilities.rdf_expanded_name($$$XMLLiteral).equal(rdf_uri.rdf_uri_utf8_string(datatype)));
    }

    public static SubLObject rdf_graph_find_values(final SubLObject v_graph, SubLObject node, SubLObject position, SubLObject other_node, SubLObject other_position) {
        if (other_node == UNPROVIDED) {
            other_node = NIL;
        }
        if (other_position == UNPROVIDED) {
            other_position = NIL;
        }
        SubLObject values = NIL;
        if (NIL != web_utilities.uri_p(node, UNPROVIDED)) {
            node = rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != web_utilities.uri_p(other_node, UNPROVIDED)) {
            other_node = rdf_graph_get_uri(v_graph, other_node, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            values = rdf_graph_index_find_values(rdf_graph_index(v_graph), node, position, other_node, other_position);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return values;
    }

    public static SubLObject rdf_graph_find_triples(final SubLObject v_graph, SubLObject node, SubLObject position) {
        SubLObject triples = NIL;
        if (NIL != web_utilities.uri_p(node, UNPROVIDED)) {
            node = rdf_graph_get_uri(v_graph, node, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject rw_lock_var = rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            triples = rdf_graph_index_find_triples(rdf_graph_index(v_graph), node, position);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return triples;
    }

    public static SubLObject rdf_graph_nodes_add(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary.dictionary_lookup_without_values(rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        SubLObject addedP = NIL;
        if ($NOT_FOUND == existing) {
            dictionary.dictionary_enter(rdf_graph_nodes(v_graph), node, node);
            addedP = T;
        } else
            if (existing.isList()) {
                if (NIL == find(node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    dictionary_utilities.dictionary_push(rdf_graph_nodes(v_graph), node, node);
                    addedP = T;
                }
            } else
                if (!existing.eql(node)) {
                    dictionary.dictionary_enter(rdf_graph_nodes(v_graph), node, list(existing, node));
                    addedP = T;
                }


        if (NIL != addedP) {
            rdf_graph_increment_node_count(v_graph);
        }
        return NIL;
    }

    public static SubLObject rdf_graph_nodes_remove(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary.dictionary_lookup_without_values(rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        SubLObject removedP = NIL;
        if (existing.isList()) {
            if (NIL != find(node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                dictionary_utilities.dictionary_delete_from_value(rdf_graph_nodes(v_graph), node, node, UNPROVIDED, UNPROVIDED);
                removedP = T;
            }
        } else
            if (existing.eql(node)) {
                dictionary.dictionary_remove(rdf_graph_nodes(v_graph), node);
                removedP = T;
            }

        if (NIL != removedP) {
            rdf_graph_decrement_node_count(v_graph);
        }
        return NIL;
    }

    public static SubLObject rdf_graph_nodes_lookup(final SubLObject v_graph, final SubLObject node) {
        final SubLObject existing = dictionary.dictionary_lookup_without_values(rdf_graph_nodes(v_graph), node, $NOT_FOUND);
        if (existing.isList()) {
            return find(node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != rdf_nodes_equalP(existing, node)) {
            return existing;
        }
        return NIL;
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

    public static SubLObject rdf_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rdf_graph(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_graph_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rdf_graph_native.class ? T : NIL;
    }

    public static SubLObject rdf_graph_struct_triples(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rdf_graph_struct_nodes(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rdf_graph_struct_index(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rdf_graph_struct_lock(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rdf_graph_struct_node_count(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rdf_graph_struct_prefix_map(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rdf_graph_struct_file_location(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rdf_graph_struct_topic(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rdf_graph_struct_focal_nodes(final SubLObject v_object) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_rdf_graph_struct_triples(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_node_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_prefix_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_file_location(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_topic(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rdf_graph_struct_focal_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_p(v_object) : "rdf_graph.rdf_graph_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_rdf_graph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rdf_graph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TRIPLES)) {
                _csetf_rdf_graph_struct_triples(v_new, current_value);
            } else
                if (pcase_var.eql($NODES)) {
                    _csetf_rdf_graph_struct_nodes(v_new, current_value);
                } else
                    if (pcase_var.eql($INDEX)) {
                        _csetf_rdf_graph_struct_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($LOCK)) {
                            _csetf_rdf_graph_struct_lock(v_new, current_value);
                        } else
                            if (pcase_var.eql($NODE_COUNT)) {
                                _csetf_rdf_graph_struct_node_count(v_new, current_value);
                            } else
                                if (pcase_var.eql($PREFIX_MAP)) {
                                    _csetf_rdf_graph_struct_prefix_map(v_new, current_value);
                                } else
                                    if (pcase_var.eql($FILE_LOCATION)) {
                                        _csetf_rdf_graph_struct_file_location(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TOPIC)) {
                                            _csetf_rdf_graph_struct_topic(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FOCAL_NODES)) {
                                                _csetf_rdf_graph_struct_focal_nodes(v_new, current_value);
                                            } else {
                                                Errors.error($str106$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_graph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RDF_GRAPH, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TRIPLES, rdf_graph_struct_triples(obj));
        funcall(visitor_fn, obj, $SLOT, $NODES, rdf_graph_struct_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, rdf_graph_struct_index(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, rdf_graph_struct_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $NODE_COUNT, rdf_graph_struct_node_count(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFIX_MAP, rdf_graph_struct_prefix_map(obj));
        funcall(visitor_fn, obj, $SLOT, $FILE_LOCATION, rdf_graph_struct_file_location(obj));
        funcall(visitor_fn, obj, $SLOT, $TOPIC, rdf_graph_struct_topic(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCAL_NODES, rdf_graph_struct_focal_nodes(obj));
        funcall(visitor_fn, obj, $END, MAKE_RDF_GRAPH, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_graph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rdf_graph(obj, visitor_fn);
    }

    public static SubLObject print_rdf_graph(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str112$_RDF_GRAPH__A_, NIL != rdf_graph_struct_topic(v_object) ? rdf_uri.rdf_uri_utf8_string(rdf_graph_struct_topic(v_object)) : rdf_graph_struct_file_location(v_object));
        return v_object;
    }

    public static SubLObject make_new_rdf_graph() {
        final SubLObject v_graph = make_rdf_graph(UNPROVIDED);
        _csetf_rdf_graph_struct_triples(v_graph, set.new_set($rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED));
        _csetf_rdf_graph_struct_nodes(v_graph, dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED));
        _csetf_rdf_graph_struct_index(v_graph, new_rdf_graph_index());
        _csetf_rdf_graph_struct_lock(v_graph, ReadWriteLocks.new_rw_lock($$$RDF_GRAPH));
        _csetf_rdf_graph_struct_node_count(v_graph, ZERO_INTEGER);
        return v_graph;
    }

    public static SubLObject rdf_graph_triples(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_triples(v_graph);
    }

    public static SubLObject rdf_graph_triples_iterator(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return set.new_set_iterator(rdf_graph_struct_triples(v_graph));
    }

    public static SubLObject rdf_graph_nodes(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_nodes(v_graph);
    }

    public static SubLObject rdf_graph_index(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_index(v_graph);
    }

    public static SubLObject rdf_graph_lock(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_lock(v_graph);
    }

    public static SubLObject rdf_graph_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_increment_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        _csetf_rdf_graph_struct_node_count(v_graph, add(rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_decrement_node_count(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        _csetf_rdf_graph_struct_node_count(v_graph, subtract(rdf_graph_struct_node_count(v_graph), ONE_INTEGER));
        return rdf_graph_struct_node_count(v_graph);
    }

    public static SubLObject rdf_graph_file_location(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_file_location(v_graph);
    }

    public static SubLObject rdf_graph_note_file_location(final SubLObject v_graph, final SubLObject file_location) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != stringp(file_location) : "Types.stringp(file_location) " + "CommonSymbols.NIL != Types.stringp(file_location) " + file_location;
        _csetf_rdf_graph_struct_file_location(v_graph, file_location);
        return file_location;
    }

    public static SubLObject rdf_graph_topic(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_topic(v_graph);
    }

    public static SubLObject rdf_graph_note_topic(final SubLObject v_graph, final SubLObject topic) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != rdf_uri.rdf_uri_p(topic) : "rdf_uri.rdf_uri_p(topic) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(topic) " + topic;
        _csetf_rdf_graph_struct_topic(v_graph, topic);
        return topic;
    }

    public static SubLObject rdf_graph_focal_nodes(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return rdf_graph_struct_focal_nodes(v_graph);
    }

    public static SubLObject rdf_graph_note_focal_node(final SubLObject v_graph, final SubLObject focal_node) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        assert NIL != valid_rdf_subject_p(focal_node) : "rdf_graph.valid_rdf_subject_p(focal_node) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(focal_node) " + focal_node;
        SubLObject focal_nodes = rdf_graph_struct_focal_nodes(v_graph);
        focal_nodes = cons(focal_node, focal_nodes);
        _csetf_rdf_graph_struct_focal_nodes(v_graph, focal_nodes);
        return focal_node;
    }

    public static SubLObject rdf_graph_prefix_map(final SubLObject v_graph) {
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        return copy_tree(rdf_graph_struct_prefix_map(v_graph));
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
            destructuring_bind_must_consp(current, datum, $list115);
            attribute = current.first();
            current = value = current.rest();
            if ((NIL != string_utilities.starts_with(attribute, $$$xmlns)) || (NIL != Strings.stringE(attribute, $str117$xml_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject prefix = ($$$xmlns.equal(attribute)) ? string_utilities.$empty_string$.getGlobalValue() : string_utilities.pre_remove(attribute, $str118$xmlns_, UNPROVIDED);
                _csetf_rdf_graph_struct_prefix_map(v_graph, list_utilities.alist_enter(rdf_graph_struct_prefix_map(v_graph), prefix, value, symbol_function(EQUAL)));
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return rdf_graph_struct_prefix_map(v_graph);
    }

    public static SubLObject rdf_graph_qname_for_uri(final SubLObject v_graph, final SubLObject uri) {
        if (((NIL == rdf_uri.rdf_uri_p(uri)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == web_utilities.uri_p(uri, UNPROVIDED))) {
            throw new AssertionError(uri);
        }
        final SubLObject utf8 = (NIL != rdf_uri.rdf_uri_p(uri)) ? rdf_uri.rdf_uri_utf8_string(uri) : uri;
        final SubLObject hash_pos = list_utilities.position_from_end(CHAR_hash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject slash_pos = list_utilities.position_from_end(CHAR_slash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject namespace_penult = (NIL != hash_pos) ? NIL != slash_pos ? number_utilities.maximum(list(hash_pos, slash_pos), UNPROVIDED) : hash_pos : slash_pos;
        final SubLObject namespace = string_utilities.substring(utf8, ZERO_INTEGER, NIL != namespace_penult ? number_utilities.f_1X(namespace_penult) : NIL);
        SubLObject prefix = list_utilities.alist_reverse_lookup_without_values(rdf_graph_prefix_map(v_graph), namespace, symbol_function(EQUAL), UNPROVIDED);
        if (NIL == prefix) {
            prefix = rdf_utilities.rdf_standard_prefix_for_namespace(namespace);
        }
        return (NIL != prefix) && (!utf8.equal(namespace)) ? NIL != string_utilities.empty_string_p(prefix) ? string_utilities.pre_remove(utf8, namespace, UNPROVIDED) : cconcatenate(prefix, new SubLObject[]{ $str120$_, string_utilities.pre_remove(utf8, namespace, UNPROVIDED) }) : rdf_uri.rdf_uri_utf8_string(uri);
    }

    public static SubLObject rdf_graph_get_label(final SubLObject v_graph, final SubLObject v_rdf_uri) {
        SubLObject label = NIL;
        if (NIL == label) {
            SubLObject csome_list_var;
            SubLObject predicate;
            for (csome_list_var = rdf_utilities.rdf_label_properties(NIL), predicate = NIL, predicate = csome_list_var.first(); (NIL == label) && (NIL != csome_list_var); label = find($$$en, rdf_graph_find_objects(v_graph, v_rdf_uri, predicate), symbol_function(EQUAL), RDF_LITERAL_LANGUAGE_TAG, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
            }
        }
        return NIL != label ? rdf_literal.rdf_literal_utf8_lexical_form(label) : NIL;
    }

    public static SubLObject rdf_graph_get_labels(final SubLObject v_graph, final SubLObject v_rdf_uri, SubLObject language_tag, SubLObject max_number) {
        if (language_tag == UNPROVIDED) {
            language_tag = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        SubLObject labels = NIL;
        SubLObject doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
        if (NIL == doneP) {
            SubLObject csome_list_var = rdf_utilities.rdf_label_properties(T);
            SubLObject predicate = NIL;
            predicate = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL == doneP) {
                    SubLObject csome_list_var_$11 = rdf_graph_find_objects(v_graph, v_rdf_uri, predicate);
                    SubLObject label = NIL;
                    label = csome_list_var_$11.first();
                    while ((NIL == doneP) && (NIL != csome_list_var_$11)) {
                        if (((NIL == language_tag) || (NIL == rdf_literal.rdf_literal_language_tag(label))) || language_tag.equal(rdf_literal.rdf_literal_language_tag(label))) {
                            final SubLObject item_var = rdf_literal.rdf_literal_cyc_string(label);
                            if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                labels = cons(item_var, labels);
                            }
                            doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
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

    public static SubLObject rdf_uris_matching_label(final SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uris = NIL;
        final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = loaded_rdf_graphs();
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject v_graph = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject cdolist_list_var = rdf_graph_get_uris_matching_label(v_graph, label, exactP);
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

    public static SubLObject rdf_graph_get_uris_matching_label(final SubLObject v_graph, final SubLObject label, SubLObject exactP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        SubLObject uris = NIL;
        SubLObject cdolist_list_var = rdf_utilities.rdf_label_properties(T);
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = rdf_graph_find_predicate_triples(v_graph, predicate);
            SubLObject triple = NIL;
            triple = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                final SubLObject v_object = rdf_triple.rdf_triple_object(triple);
                final SubLObject this_label = (NIL != rdf_literal.rdf_literal_p(v_object)) ? rdf_literal.rdf_literal_cyc_string(v_object) : NIL;
                if ((NIL != this_label) && (NIL != (NIL != exactP ? equal(this_label, label) : unicode_nauts.unicode_substringP(label, this_label, NIL)))) {
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
                if (NIL != string_utilities.starts_with(subject_uri, $$$http)) {
                    final SubLObject v_graph = find_or_download_rdf_graph(subject_uri);
                    if ((NIL != rdf_graph_p(v_graph)) && (NIL == doneP)) {
                        SubLObject csome_list_var_$13 = rdf_graph_get_labels(v_graph, subject_uri, language_tag, UNPROVIDED);
                        SubLObject label = NIL;
                        label = csome_list_var_$13.first();
                        while ((NIL == doneP) && (NIL != csome_list_var_$13)) {
                            final SubLObject item_var = label;
                            if (NIL == member(item_var, labels, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                labels = cons(item_var, labels);
                            }
                            doneP = makeBoolean((NIL != max_number) && (NIL != list_utilities.lengthGE(labels, max_number, UNPROVIDED)));
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

    public static SubLObject sxhash_rdf_graph_method(final SubLObject v_object) {
        return sxhash_rdf_graph(v_object);
    }

    public static SubLObject sxhash_rdf_graph(final SubLObject v_graph) {
        return Sxhash.sxhash(rdf_graph_struct_triples(v_graph));
    }

    public static SubLObject rdf_graph_index_add(final SubLObject index, final SubLObject triple) {
        SubLObject sub_index = NIL;
        SubLObject sub_index_$14 = NIL;
        SubLObject key = NIL;
        SubLObject key_$15 = NIL;
        sub_index = rdf_graph_index_sub_indexes(index);
        sub_index_$14 = sub_index.first();
        key = rdf_triple.rdf_triple_args(triple);
        key_$15 = key.first();
        while ((NIL != key) || (NIL != sub_index)) {
            rdf_graph_sub_index_add(sub_index_$14, key_$15, triple);
            sub_index = sub_index.rest();
            sub_index_$14 = sub_index.first();
            key = key.rest();
            key_$15 = key.first();
        } 
        return NIL;
    }

    public static SubLObject rdf_graph_sub_index_add(final SubLObject sub_index, final SubLObject key, final SubLObject triple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $rdf_graph_literal_indexing_enabledP$.getDynamicValue(thread)) || (NIL == rdf_literal.rdf_literal_p(key))) {
            SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, key, NIL);
            if (NIL == set.set_p(triples)) {
                triples = set.new_set($rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED);
                dictionary.dictionary_enter(sub_index, key, triples);
            }
            return set.set_add(triple, triples);
        }
        return NIL;
    }

    public static SubLObject clear_rdf_graph_index_sub_indexes() {
        final SubLObject cs = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rdf_graph_index_sub_indexes(final SubLObject graph_index) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_graph_index_sub_indexes_caching_state$.getGlobalValue(), list(graph_index), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_graph_index_sub_indexes_internal(final SubLObject graph_index) {
        return list(rdf_graph_index_subject_index(graph_index), rdf_graph_index_predicate_index(graph_index), rdf_graph_index_object_index(graph_index));
    }

    public static SubLObject rdf_graph_index_sub_indexes(final SubLObject graph_index) {
        SubLObject caching_state = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RDF_GRAPH_INDEX_SUB_INDEXES, $rdf_graph_index_sub_indexes_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, graph_index, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_graph_index_sub_indexes_internal(graph_index)));
            memoization_state.caching_state_put(caching_state, graph_index, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rdf_graph_index_remove(final SubLObject index, final SubLObject triple) {
        rdf_graph_subject_index_remove(rdf_graph_index_subject_index(index), triple);
        rdf_graph_predicate_index_remove(rdf_graph_index_predicate_index(index), triple);
        rdf_graph_object_index_remove(rdf_graph_index_object_index(index), triple);
        return NIL;
    }

    public static SubLObject rdf_graph_subject_index_remove(final SubLObject subject_index, final SubLObject triple) {
        final SubLObject subject = rdf_triple.rdf_triple_subject(triple);
        final SubLObject triples = dictionary.dictionary_lookup_without_values(subject_index, subject, NIL);
        return NIL != set.set_p(triples) ? set.set_remove(triple, triples) : NIL;
    }

    public static SubLObject rdf_graph_predicate_index_remove(final SubLObject predicate_index, final SubLObject triple) {
        final SubLObject predicate = rdf_triple.rdf_triple_predicate(triple);
        final SubLObject triples = dictionary.dictionary_lookup_without_values(predicate_index, predicate, NIL);
        return NIL != set.set_p(triples) ? set.set_remove(triple, triples) : NIL;
    }

    public static SubLObject rdf_graph_object_index_remove(final SubLObject object_index, final SubLObject triple) {
        final SubLObject v_object = rdf_triple.rdf_triple_object(triple);
        final SubLObject triples = dictionary.dictionary_lookup_without_values(object_index, v_object, NIL);
        return NIL != set.set_p(triples) ? set.set_remove(triple, triples) : NIL;
    }

    public static SubLObject rdf_graph_index_find_triple(final SubLObject graph_index, final SubLObject subject, final SubLObject predicate, final SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        final SubLObject subject_index_count = rdf_graph_index_subject_index_count(graph_index, subject);
        final SubLObject predicate_index_count = rdf_graph_index_predicate_index_count(graph_index, predicate);
        final SubLObject object_index_count = rdf_graph_index_object_index_count(graph_index, v_object);
        if ((subject_index_count.numLE(predicate_index_count) && ((NIL != rdf_literal.rdf_literal_p(v_object)) || subject_index_count.numLE(object_index_count))) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(subject)))) {
            return rdf_graph_index_find(rdf_graph_index_subject_index(graph_index), subject, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        if (((NIL == rdf_literal.rdf_literal_p(v_object)) && object_index_count.numLE(predicate_index_count)) && ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(v_object)))) {
            return rdf_graph_index_find(rdf_graph_index_object_index(graph_index), v_object, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        if ((NIL == permissive_blank_node_matchingP) || (NIL == rdf_blank_node.rdf_blank_node_p(predicate))) {
            return rdf_graph_index_find(rdf_graph_index_predicate_index(graph_index), predicate, subject, predicate, v_object, permissive_blank_node_matchingP);
        }
        return NIL;
    }

    public static SubLObject rdf_graph_index_find_triples(final SubLObject graph_index, final SubLObject node, SubLObject position) {
        assert NIL != rdf_triple.rdf_triple_position_p(position) : "rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) " + position;
        SubLObject triples = NIL;
        if (position.eql($SUBJECT)) {
            triples = dictionary.dictionary_lookup_without_values(rdf_graph_index_subject_index(graph_index), node, UNPROVIDED);
        } else
            if (position.eql($PREDICATE)) {
                triples = dictionary.dictionary_lookup_without_values(rdf_graph_index_predicate_index(graph_index), node, UNPROVIDED);
            } else
                if (position.eql($OBJECT)) {
                    triples = dictionary.dictionary_lookup_without_values(rdf_graph_index_object_index(graph_index), node, UNPROVIDED);
                }


        return NIL != triples ? triples : set.new_set(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_graph_index_find_values(final SubLObject graph_index, final SubLObject node, SubLObject position, final SubLObject other_node, final SubLObject other_position) {
        final SubLObject index_count = rdf_graph_index_sub_index_count(graph_index, node, position);
        final SubLObject other_index_count = rdf_graph_index_sub_index_count(graph_index, other_node, other_position);
        if (index_count.numLE(other_index_count)) {
            final SubLObject triples = rdf_graph_index_find_triples(graph_index, node, position);
            SubLObject values = NIL;
            final SubLObject set_contents_var = set.do_set_internal(triples);
            SubLObject basis_object;
            SubLObject state;
            SubLObject triple;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                triple = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && other_node.eql(rdf_triple.rdf_triple_arg(triple, other_position))) {
                    item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                    if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                        values = cons(item_var, values);
                    }
                }
            }
            return values;
        }
        final SubLObject triples = rdf_graph_index_find_triples(graph_index, other_node, other_position);
        SubLObject values = NIL;
        final SubLObject set_contents_var = set.do_set_internal(triples);
        SubLObject basis_object;
        SubLObject state;
        SubLObject triple;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            triple = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, triple)) && node.eql(rdf_triple.rdf_triple_arg(triple, position))) {
                item_var = rdf_triple.rdf_triple_remaining_arg(triple, position, other_position);
                if (NIL == member(item_var, values, symbol_function(EQL), symbol_function(IDENTITY))) {
                    values = cons(item_var, values);
                }
            }
        }
        return values;
    }

    public static SubLObject rdf_graph_index_sub_index_count(final SubLObject graph_index, final SubLObject node, SubLObject position) {
        final SubLObject sub_index = rdf_graph_index_get_sub_index(graph_index, position);
        final SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, node, NIL);
        return NIL != set.set_p(triples) ? set.set_size(triples) : ZERO_INTEGER;
    }

    public static SubLObject rdf_graph_index_get_sub_index(final SubLObject graph_index, SubLObject position) {
        assert NIL != rdf_triple.rdf_triple_position_p(position) : "rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) " + position;
        if (position.eql($SUBJECT)) {
            return rdf_graph_index_subject_index(graph_index);
        }
        if (position.eql($PREDICATE)) {
            return rdf_graph_index_predicate_index(graph_index);
        }
        if (position.eql($OBJECT)) {
            return rdf_graph_index_object_index(graph_index);
        }
        return NIL;
    }

    public static SubLObject rdf_graph_index_subject_index_count(final SubLObject graph_index, final SubLObject subject) {
        return rdf_graph_index_sub_index_count(graph_index, subject, $SUBJECT);
    }

    public static SubLObject rdf_graph_index_predicate_index_count(final SubLObject graph_index, final SubLObject predicate) {
        return rdf_graph_index_sub_index_count(graph_index, predicate, $PREDICATE);
    }

    public static SubLObject rdf_graph_index_object_index_count(final SubLObject graph_index, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $rdf_graph_literal_indexing_enabledP$.getDynamicValue(thread)) && (NIL != rdf_literal.rdf_literal_p(v_object))) {
            final SubLObject triples = apply(APPEND, Mapping.mapcar(SET_ELEMENT_LIST, dictionary.dictionary_values(rdf_graph_index_object_index(graph_index))));
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = triples;
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != rdf_nodes_equalP(v_object, rdf_triple.rdf_triple_object(triple))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
            return count;
        }
        return rdf_graph_index_sub_index_count(graph_index, v_object, $OBJECT);
    }

    public static SubLObject rdf_graph_index_find(final SubLObject sub_index, final SubLObject key, final SubLObject subject, final SubLObject predicate, final SubLObject v_object, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        final SubLObject triples = dictionary.dictionary_lookup_without_values(sub_index, key, NIL);
        SubLObject triple = NIL;
        if (NIL != set.set_p(triples)) {
            final SubLObject set_contents_var = set.do_set_internal(triples);
            SubLObject basis_object;
            SubLObject state;
            SubLObject this_triple;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == triple) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                this_triple = set_contents.do_set_contents_next(basis_object, state);
                if ((((NIL != set_contents.do_set_contents_element_validP(state, this_triple)) && (NIL != rdf_graph_nodes_matchP(rdf_triple.rdf_triple_subject(this_triple), subject, permissive_blank_node_matchingP))) && (NIL != rdf_graph_nodes_matchP(rdf_triple.rdf_triple_predicate(this_triple), predicate, permissive_blank_node_matchingP))) && (NIL != (NIL != rdf_literal.rdf_literal_p(v_object) ? rdf_nodes_equalP(rdf_triple.rdf_triple_object(this_triple), v_object) : rdf_graph_nodes_matchP(rdf_triple.rdf_triple_object(this_triple), v_object, permissive_blank_node_matchingP)))) {
                    triple = this_triple;
                }
            }
        }
        return triple;
    }

    public static SubLObject rdf_graph_nodes_matchP(final SubLObject node1, final SubLObject node2, SubLObject permissive_blank_node_matchingP) {
        if (permissive_blank_node_matchingP == UNPROVIDED) {
            permissive_blank_node_matchingP = NIL;
        }
        return makeBoolean((((NIL != permissive_blank_node_matchingP) && (NIL != rdf_blank_node.rdf_blank_node_p(node1))) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) || (NIL != funcall($rdf_graph_internal_node_comparison_test$.getGlobalValue(), node1, node2)));
    }

    public static SubLObject rdf_graph_index_contains_nodeP(final SubLObject graph_index, final SubLObject node) {
        return makeBoolean((rdf_graph_index_subject_index_count(graph_index, node).isPositive() || rdf_graph_index_predicate_index_count(graph_index, node).isPositive()) || rdf_graph_index_object_index_count(graph_index, node).isPositive());
    }

    public static SubLObject rdf_graph_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rdf_graph_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_graph_index_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rdf_graph_index_native.class ? T : NIL;
    }

    public static SubLObject rdf_graph_index_struct_subject_index(final SubLObject v_object) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rdf_graph_index_struct_predicate_index(final SubLObject v_object) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rdf_graph_index_struct_object_index(final SubLObject v_object) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_rdf_graph_index_struct_subject_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_graph_index_struct_predicate_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdf_graph_index_struct_object_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_graph_index_p(v_object) : "rdf_graph.rdf_graph_index_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_rdf_graph_index(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rdf_graph_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUBJECT_INDEX)) {
                _csetf_rdf_graph_index_struct_subject_index(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATE_INDEX)) {
                    _csetf_rdf_graph_index_struct_predicate_index(v_new, current_value);
                } else
                    if (pcase_var.eql($OBJECT_INDEX)) {
                        _csetf_rdf_graph_index_struct_object_index(v_new, current_value);
                    } else {
                        Errors.error($str106$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_graph_index(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RDF_GRAPH_INDEX, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUBJECT_INDEX, rdf_graph_index_struct_subject_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE_INDEX, rdf_graph_index_struct_predicate_index(obj));
        funcall(visitor_fn, obj, $SLOT, $OBJECT_INDEX, rdf_graph_index_struct_object_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_RDF_GRAPH_INDEX, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_graph_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rdf_graph_index(obj, visitor_fn);
    }

    public static SubLObject print_rdf_graph_index(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str150$_RDF_GRAPH_INDEX_);
        return v_object;
    }

    public static SubLObject new_rdf_graph_index() {
        final SubLObject graph_index = make_rdf_graph_index(UNPROVIDED);
        _csetf_rdf_graph_index_struct_subject_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        _csetf_rdf_graph_index_struct_predicate_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        _csetf_rdf_graph_index_struct_object_index(graph_index, dictionary.new_dictionary($rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED));
        return graph_index;
    }

    public static SubLObject rdf_graph_index_subject_index(final SubLObject graph_index) {
        assert NIL != rdf_graph_index_p(graph_index) : "rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) " + graph_index;
        return rdf_graph_index_struct_subject_index(graph_index);
    }

    public static SubLObject rdf_graph_index_predicate_index(final SubLObject graph_index) {
        assert NIL != rdf_graph_index_p(graph_index) : "rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) " + graph_index;
        return rdf_graph_index_struct_predicate_index(graph_index);
    }

    public static SubLObject rdf_graph_index_object_index(final SubLObject graph_index) {
        assert NIL != rdf_graph_index_p(graph_index) : "rdf_graph.rdf_graph_index_p(graph_index) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_index_p(graph_index) " + graph_index;
        return rdf_graph_index_struct_object_index(graph_index);
    }

    public static SubLObject sxhash_rdf_graph_index_method(final SubLObject v_object) {
        return sxhash_rdf_graph_index(v_object);
    }

    public static SubLObject sxhash_rdf_graph_index(final SubLObject graph_index) {
        return Sxhash.sxhash(rdf_graph_index_struct_subject_index(graph_index));
    }

    public static SubLObject print_rdf_graph_triples_readably(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        SubLObject cdolist_list_var = set.set_element_list(rdf_graph_triples(v_graph));
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicate_string = owl_utilities.rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_predicate(triple));
            final SubLObject subject_string = owl_utilities.rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_subject(triple));
            final SubLObject object_string = owl_utilities.rdf_graph_node_abbreviation_string(v_graph, rdf_triple.rdf_triple_object(triple));
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str152$______A__A__A___, new SubLObject[]{ predicate_string, subject_string, object_string });
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
        final SubLObject graph1_triple_count = rdf_graph_triple_count(graph1);
        final SubLObject graph2_triple_count = rdf_graph_triple_count(graph2);
        final SubLObject _prev_bind_0 = $graph2_matched_triples$.currentBinding(thread);
        try {
            $graph2_matched_triples$.bind(NIL, thread);
            SubLObject graph1_focal_triples = NIL;
            SubLObject graph2_focal_triples = NIL;
            SubLObject graph1_matched_triples = NIL;
            SubLObject iterator_var = rdf_graph_triples_iterator(graph1);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject triple1 = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid) && (NIL != subl_promotions.memberP(rdf_triple.rdf_triple_subject(triple1), rdf_graph_focal_nodes(graph1), $sym70$RDF_NODES_EQUAL_, UNPROVIDED))) {
                    graph1_focal_triples = cons(triple1, graph1_focal_triples);
                }
            }
            iterator_var = rdf_graph_triples_iterator(graph2);
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject triple2 = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid) && (NIL != subl_promotions.memberP(rdf_triple.rdf_triple_subject(triple2), rdf_graph_focal_nodes(graph2), $sym70$RDF_NODES_EQUAL_, UNPROVIDED))) {
                    graph2_focal_triples = cons(triple2, graph2_focal_triples);
                }
            }
            if (NIL != verboseP) {
                format_nil.force_format(T, $str153$Comparing_graph1___A_triples___A_, graph1_triple_count, rdf_graph_node_count(graph1), length(graph1_focal_triples), graph2_triple_count, rdf_graph_node_count(graph2), length(graph2_focal_triples), UNPROVIDED, UNPROVIDED);
            }
            final SubLObject _prev_bind_0_$16 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
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
                                    noting_percent_progress_preamble(format(NIL, $str154$Comparing_focal_nodes___A_compare, compares_total));
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
                                                if ((NIL == subl_promotions.memberP(triple4, $graph2_matched_triples$.getDynamicValue(thread), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED)) && (NIL != rdf_triples_isomorphicP(graph1, triple3, graph2, triple4))) {
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
                        compares_total = multiply(rdf_graph_triple_count(graph1), rdf_graph_triple_count(graph1));
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
                                noting_percent_progress_preamble(format(NIL, $str155$Comparing_all_nodes___A_compares_, compares_total));
                                final SubLObject iterator_var2 = rdf_graph_triples_iterator(graph1);
                                SubLObject valid2;
                                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject triple5 = iteration.iteration_next(iterator_var2);
                                    valid2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid2) {
                                        SubLObject graph2_triples_left_count2 = graph2_triple_count;
                                        SubLObject done_with_triple2P2 = NIL;
                                        final SubLObject iterator_var_$21 = rdf_graph_triples_iterator(graph2);
                                        SubLObject valid_$23;
                                        for (SubLObject done_var_$22 = done_with_triple2P2; NIL == done_var_$22; done_var_$22 = makeBoolean((NIL == valid_$23) || (NIL != done_with_triple2P2))) {
                                            thread.resetMultipleValues();
                                            final SubLObject triple6 = iteration.iteration_next(iterator_var_$21);
                                            valid_$23 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != valid_$23) && (NIL == subl_promotions.memberP(triple6, $graph2_matched_triples$.getDynamicValue(thread), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED))) {
                                                compare_count = add(compare_count, ONE_INTEGER);
                                                graph2_triples_left_count2 = subtract(graph2_triples_left_count2, ONE_INTEGER);
                                                note_percent_progress(compare_count, compares_total);
                                                if (NIL != rdf_triples_isomorphicP(graph1, triple5, graph2, triple6)) {
                                                    graph1_matched_triples = cons(triple5, graph1_matched_triples);
                                                    if (NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple6))) {
                                                        final SubLObject symmetric_triple = rdf_triple.new_rdf_triple(rdf_triple.rdf_triple_object(triple6), rdf_triple.rdf_triple_predicate(triple6), rdf_triple.rdf_triple_subject(triple6));
                                                        if (NIL != subl_promotions.memberP(symmetric_triple, $graph2_matched_triples$.getDynamicValue(thread), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED)) {
                                                            $graph2_matched_triples$.setDynamicValue(cons(triple6, $graph2_matched_triples$.getDynamicValue(thread)), thread);
                                                        } else {
                                                            $graph2_matched_triples$.setDynamicValue(cons(symmetric_triple, $graph2_matched_triples$.getDynamicValue(thread)), thread);
                                                        }
                                                    } else {
                                                        $graph2_matched_triples$.setDynamicValue(cons(triple6, $graph2_matched_triples$.getDynamicValue(thread)), thread);
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
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0_$16, thread);
            }
            SubLObject graph1_unmatched_triples = NIL;
            SubLObject graph2_unmatched_triples = NIL;
            SubLObject iterator_var3 = rdf_graph_triples_iterator(graph1);
            SubLObject valid3;
            for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject triple7 = iteration.iteration_next(iterator_var3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid3) && (NIL == subl_promotions.memberP(triple7, graph1_matched_triples, $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED))) {
                    graph1_unmatched_triples = cons(triple7, graph1_unmatched_triples);
                }
            }
            iterator_var3 = rdf_graph_triples_iterator(graph2);
            for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject triple8 = iteration.iteration_next(iterator_var3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid3) && (NIL == subl_promotions.memberP(triple8, $graph2_matched_triples$.getDynamicValue(thread), $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED))) {
                    graph2_unmatched_triples = cons(triple8, graph2_unmatched_triples);
                }
            }
            return values(graph1_unmatched_triples, graph2_unmatched_triples);
        } finally {
            $graph2_matched_triples$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject rdf_triples_isomorphicP(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(list(triple1, triple2), $rdf_triples_assumed_isomophic$.getDynamicValue(thread), symbol_function($sym158$RDF_TRIPLE_PAIR_EQUAL_), UNPROVIDED)) {
            return T;
        }
        return rdf_triples_isomorphicP_int(graph1, triple1, graph2, triple2);
    }

    public static SubLObject rdf_triple_pair_equalP(final SubLObject triple_pair_1, final SubLObject triple_pair_2) {
        final SubLObject pair_1_first = triple_pair_1.first();
        final SubLObject pair_1_second = second(triple_pair_1);
        final SubLObject pair_2_first = triple_pair_2.first();
        final SubLObject pair_2_second = second(triple_pair_2);
        return makeBoolean(((NIL != rdf_triple.rdf_triples_equalP(pair_1_first, pair_2_first)) && (NIL != rdf_triple.rdf_triples_equalP(pair_1_second, pair_2_second))) || ((NIL != rdf_triple.rdf_triples_equalP(pair_1_first, pair_2_second)) && (NIL != rdf_triple.rdf_triples_equalP(pair_1_second, pair_2_first))));
    }

    public static SubLObject rdf_triples_isomorphicP_int_internal(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_predicate(triple1), graph2, rdf_triple.rdf_triple_predicate(triple2), UNPROVIDED)) && (((NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), UNPROVIDED)) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_object(triple2), UNPROVIDED))) || (((NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1))) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_object(triple2), UNPROVIDED))) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), UNPROVIDED))))) {
            final SubLObject _prev_bind_0 = $rdf_triples_assumed_isomophic$.currentBinding(thread);
            try {
                $rdf_triples_assumed_isomophic$.bind(cons(list(triple1, triple2), $rdf_triples_assumed_isomophic$.getDynamicValue(thread)), thread);
                result = makeBoolean((NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_predicate(triple1), graph2, rdf_triple.rdf_triple_predicate(triple2), T)) && (((NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), T)) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_object(triple2), T))) || (((NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1))) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_subject(triple1), graph2, rdf_triple.rdf_triple_object(triple2), T))) && (NIL != rdf_nodes_isomorphicP(graph1, rdf_triple.rdf_triple_object(triple1), graph2, rdf_triple.rdf_triple_subject(triple2), T)))));
            } finally {
                $rdf_triples_assumed_isomophic$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject rdf_triples_isomorphicP_int(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_triples_isomorphicP_int_internal(graph1, triple1, graph2, triple2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym159$RDF_TRIPLES_ISOMORPHIC__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym159$RDF_TRIPLES_ISOMORPHIC__INT, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym159$RDF_TRIPLES_ISOMORPHIC__INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(graph1, triple1, graph2, triple2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
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
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_triples_isomorphicP_int_internal(graph1, triple1, graph2, triple2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(graph1, triple1, graph2, triple2));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rdf_node_symmetric_predicateP_internal(final SubLObject node) {
        return makeBoolean((((((NIL != rdf_nodes_equalP(node, get_known_uri($str161$owl_complementOf))) || (NIL != rdf_nodes_equalP(node, get_known_uri($str162$owl_disjointWith)))) || (NIL != rdf_nodes_equalP(node, get_known_uri($str163$owl_equivalentClass)))) || (NIL != rdf_nodes_equalP(node, get_known_uri($str164$owl_equivalentProperty)))) || (NIL != rdf_nodes_equalP(node, get_known_uri($str165$owl_incompatibleWith)))) || (NIL != rdf_nodes_equalP(node, get_known_uri($str166$owl_inverseOf))));
    }

    public static SubLObject rdf_node_symmetric_predicateP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_node_symmetric_predicateP_internal(node);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, node, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_node_symmetric_predicateP_internal(node)));
            memoization_state.caching_state_put(caching_state, node, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rdf_triples_equal_with_symmetryP(final SubLObject triple1, final SubLObject triple2) {
        if (NIL != rdf_triple.rdf_triples_equalP(triple1, triple2)) {
            return T;
        }
        if ((((NIL != rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple1), rdf_triple.rdf_triple_predicate(triple2))) && (NIL != rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple1)))) && (NIL != rdf_nodes_equalP(rdf_triple.rdf_triple_subject(triple1), rdf_triple.rdf_triple_object(triple2)))) && (NIL != rdf_nodes_equalP(rdf_triple.rdf_triple_object(triple1), rdf_triple.rdf_triple_subject(triple2)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject rdf_nodes_isomorphicP(final SubLObject graph1, final SubLObject node1, final SubLObject graph2, final SubLObject node2, SubLObject deep_checkingP) {
        if (deep_checkingP == UNPROVIDED) {
            deep_checkingP = NIL;
        }
        if ((NIL != owl_cycl_to_xml.cyc_uri_p(node1)) && (NIL != owl_cycl_to_xml.cyc_uri_p(node2))) {
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
            return makeBoolean(((NIL != Strings.stringE(rdf_literal.rdf_literal_utf8_lexical_form(node1), rdf_literal.rdf_literal_utf8_lexical_form(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((((NIL == rdf_literal.rdf_literal_language_tag(node1)) || (NIL != Strings.stringE($$$en, rdf_literal.rdf_literal_language_tag(node1), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL == rdf_literal.rdf_literal_language_tag(node2)) || (NIL != Strings.stringE($$$en, rdf_literal.rdf_literal_language_tag(node2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || rdf_literal.rdf_literal_language_tag(node1).equal(rdf_literal.rdf_literal_language_tag(node2)))) && (rdf_literal.rdf_literal_datatype(node1).equal(rdf_literal.rdf_literal_datatype(node2)) || (((NIL != forts.fort_p(node1_datatype_term)) && (NIL != forts.fort_p(node2_datatype_term))) && ((node1_datatype_term.equal(node2_datatype_term) || (NIL != genls.genlsP(node1_datatype_term, node2_datatype_term, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlsP(node2_datatype_term, node1_datatype_term, UNPROVIDED, UNPROVIDED))))));
        }
        if ((NIL != rdf_blank_node.rdf_blank_node_p(node1)) && (NIL != rdf_blank_node.rdf_blank_node_p(node2))) {
            final SubLObject node1_subject_triples = rdf_graph_find_subject_triples_closure(graph1, node1, UNPROVIDED);
            final SubLObject node2_subject_triples = rdf_graph_find_subject_triples_closure(graph2, node2, UNPROVIDED);
            final SubLObject node1_object_triples = rdf_graph_find_object_triples_closure(graph1, node1, UNPROVIDED);
            final SubLObject node2_object_triples = rdf_graph_find_object_triples_closure(graph2, node2, UNPROVIDED);
            if ((NIL == list_utilities.same_length_p(node1_subject_triples, node2_subject_triples)) || (NIL == list_utilities.same_length_p(node1_object_triples, node2_object_triples))) {
                return NIL;
            }
            if (NIL == deep_checkingP) {
                return T;
            }
            if ((NIL != rdf_triple_sets_isomorphicP(graph1, node1_subject_triples, graph2, node2_subject_triples)) && (NIL != rdf_triple_sets_isomorphicP(graph1, node1_object_triples, graph2, node2_object_triples))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject rdf_triple_sets_isomorphicP(final SubLObject graph1, final SubLObject graph1_triples, final SubLObject graph2, final SubLObject graph2_triples) {
        if (NIL == list_utilities.same_length_p(graph1_triples, graph2_triples)) {
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
                    if (NIL != rdf_triples_isomorphicP(graph1, graph1_triple, graph2, graph2_triple)) {
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
        if ((NIL != constant_p(v_object)) && ((((NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str168$owl_)) || (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str169$rdf_))) || (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str170$rdfs_))) || (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str171$xsd_)))) {
            return get_known_uri(constants_high.constant_name(v_object));
        }
        if (NIL != forts.fort_p(v_object)) {
            final SubLObject uri_string = kb_mapping_utilities.fpred_value_in_mt(v_object, $$rdfURI, $$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject uri = (uri_string.isString()) ? rdf_uri.get_rdf_uri(uri_string, UNPROVIDED, UNPROVIDED) : NIL;
            if ((((NIL != rdf_utilities.rdf_namespace_uriP(uri)) || (NIL != rdf_utilities.rdfs_namespace_uriP(uri))) || (NIL != owl_utilities.owl_namespace_uriP(uri))) || (NIL != rdf_utilities.xsd_namespace_uriP(uri))) {
                return uri;
            }
            return NIL;
        } else {
            if ((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str168$owl_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(string_utilities.pre_remove(v_object, $str168$owl_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if ((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str169$rdf_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name(string_utilities.pre_remove(v_object, $str169$rdf_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if ((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str170$rdfs_))) && (NIL != constants_high.find_constant(v_object))) {
                return rdf_uri.get_rdf_uri(rdf_utilities.rdfs_expanded_name(string_utilities.pre_remove(v_object, $str170$rdfs_, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != owl_utilities.implementation_uriP(v_object)) {
                return v_object;
            }
            if (v_object.isString() && (NIL != string_utilities.contains_charP(v_object, CHAR_colon))) {
                final SubLObject prefix_local_part = string_utilities.string_tokenize(v_object, $list174, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((((NIL != list_utilities.doubletonP(prefix_local_part)) && prefix_local_part.first().isString()) && (NIL != subl_promotions.memberP(prefix_local_part.first(), $list175, $sym176$STRING_, UNPROVIDED))) && (NIL != string_utilities.non_empty_stringP(second(prefix_local_part)))) {
                    SubLObject current;
                    final SubLObject datum = current = prefix_local_part;
                    SubLObject prefix = NIL;
                    SubLObject local_part = NIL;
                    destructuring_bind_must_consp(current, datum, $list177);
                    prefix = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list177);
                    local_part = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != Strings.stringE(prefix, $$$owl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, $$$rdf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, $$$rdfs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.rdfs_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(prefix, $$$xsd, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return rdf_uri.get_rdf_uri(rdf_utilities.xsd_expanded_name(local_part), UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list177);
                    }
                }
            } else {
                if (v_object.isString() && (NIL != owl_utilities.implementation_uriP(rdf_uri.get_rdf_uri(v_object, UNPROVIDED, UNPROVIDED)))) {
                    return rdf_uri.get_rdf_uri(v_object, UNPROVIDED, UNPROVIDED);
                }
                Errors.error($str182$get_known_uri_called_with_unhandl, v_object);
            }
            return NIL;
        }
    }

    public static SubLObject get_known_uri(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return get_known_uri_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_KNOWN_URI, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_KNOWN_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GET_KNOWN_URI, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(get_known_uri_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject test_rdf_graph() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = new_rdf_graph();
        final SubLObject emu_uri = owl_cycl_to_xml.owl_cyc_uri_for_fort($$Emu, NIL, NIL, UNPROVIDED);
        final SubLObject emu = rdf_graph_get_uri(v_graph, emu_uri, UNPROVIDED, UNPROVIDED);
        final SubLObject emu2 = rdf_uri.get_rdf_uri(emu_uri, NIL, NIL);
        final SubLObject v_genls = rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$genls, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject comment = rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$comment, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject bird = rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$Bird, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject comment_literal = rdf_graph_get_literal(v_graph, kb_accessors.comment($$Emu, $$CurrentWorldDataCollectorMt), $$$en, UNPROVIDED);
        final SubLObject big_foo = rdf_graph_get_literal(v_graph, $$$FOO, $$$en, UNPROVIDED);
        final SubLObject little_foo = rdf_graph_get_literal(v_graph, $$$foo, $$$en, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!emu.eql(canonicalize_rdf_triple_argument(emu2, v_graph)))) {
            Errors.error($str199$Failed_to_canonicalize_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!emu.eql(rdf_graph_get_uri(v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort($$Emu, NIL, NIL, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
            Errors.error($str200$Got_non_EQ_URIs_for___Emu_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!comment_literal.eql(rdf_graph_get_literal(v_graph, kb_accessors.comment($$Emu, $$CurrentWorldDataCollectorMt), $$$en, UNPROVIDED)))) {
            Errors.error($str201$Got_non_EQ_literals_for_comment_l);
        }
        rdf_graph_add_triple(v_graph, emu, v_genls, bird);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_contains_equivalent_tripleP(v_graph, emu2, v_genls, bird))) {
            Errors.error($str202$Couldn_t_find_equivalent_triple_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph_add_triple(v_graph, emu, v_genls, bird))) {
            Errors.error($str203$Failed_to_realize_that_triple_was);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph_add_triple(v_graph, emu_uri, v_genls, bird))) {
            Errors.error($str204$Failed_to_realize_that_triple_was);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_has_uriP(v_graph, emu_uri, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str205$Can_t_find_URI_for__S, emu_uri);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!THREE_INTEGER.eql(rdf_graph_node_count(v_graph)))) {
            Errors.error($str206$Expecting_3_nodes_left__Actual_co, rdf_graph_node_count(v_graph));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird))) {
            Errors.error($str207$Graph_does_not_genls_triple_we_ju);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED), ONE_INTEGER, UNPROVIDED))) {
            Errors.error($str208$Expected_1_subject_triple_for_emu, rdf_graph_find_subject_triples(v_graph, emu, UNPROVIDED));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED), ONE_INTEGER, UNPROVIDED))) {
            Errors.error($str208$Expected_1_subject_triple_for_emu, rdf_graph_find_subject_triples(v_graph, emu_uri, UNPROVIDED));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthE(rdf_graph_find_subjects(v_graph, v_genls, bird), ONE_INTEGER, UNPROVIDED))) {
            Errors.error($str209$Expected_1_subject_for_genls_bird, rdf_graph_find_subjects(v_graph, v_genls, bird));
        }
        rdf_graph_add_triple(v_graph, emu, comment, comment_literal);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!FIVE_INTEGER.eql(rdf_graph_node_count(v_graph)))) {
            Errors.error($str210$Expecting_5_nodes_left__Actual_co, rdf_graph_node_count(v_graph));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_contains_tripleP(v_graph, emu, comment, comment_literal))) {
            Errors.error($str211$Graph_does_not_comment_triple_we_);
        }
        rdf_graph_remove_triple(v_graph, emu, v_genls, bird);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != rdf_graph_contains_tripleP(v_graph, emu, v_genls, bird))) {
            Errors.error($str212$Graph_contains_genls_triple_we_ju);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!THREE_INTEGER.eql(rdf_graph_node_count(v_graph)))) {
            Errors.error($str206$Expecting_3_nodes_left__Actual_co, rdf_graph_node_count(v_graph));
        }
        rdf_graph_add_triple(v_graph, emu, comment, big_foo);
        rdf_graph_add_triple(v_graph, emu, comment, little_foo);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_contains_tripleP(v_graph, emu, comment, big_foo))) {
            Errors.error($str213$Graph_does_not_big_foo_triple_we_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_graph_contains_tripleP(v_graph, emu, comment, little_foo))) {
            Errors.error($str214$Graph_does_not_little_foo_triple_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && rdf_graph_get_literal(v_graph, $$$FOO, $$$en, UNPROVIDED).eql(little_foo)) {
            Errors.error($str215$Looked_for_big_foo__got_little_fo);
        }
        return T;
    }

    public static SubLObject declare_rdf_graph_file() {
        declareFunction(me, "new_rdf_graph", "NEW-RDF-GRAPH", 0, 0, false);
        declareFunction(me, "rdf_graph_add_triple", "RDF-GRAPH-ADD-TRIPLE", 4, 0, false);
        declareFunction(me, "rdf_graph_remove_triple", "RDF-GRAPH-REMOVE-TRIPLE", 4, 0, false);
        declareFunction(me, "rdf_graph_remove_known_triple", "RDF-GRAPH-REMOVE-KNOWN-TRIPLE", 2, 0, false);
        declareFunction(me, "rdf_graph_contains_tripleP", "RDF-GRAPH-CONTAINS-TRIPLE?", 4, 0, false);
        declareFunction(me, "rdf_graph_contains_equivalent_tripleP", "RDF-GRAPH-CONTAINS-EQUIVALENT-TRIPLE?", 4, 0, false);
        declareFunction(me, "rdf_graph_find_subject_triples", "RDF-GRAPH-FIND-SUBJECT-TRIPLES", 2, 1, false);
        declareFunction(me, "rdf_graph_find_subject_triples_closure", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CLOSURE", 2, 1, false);
        declareFunction(me, "rdf_graph_find_subject_triples_canonical", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CANONICAL", 2, 1, false);
        declareFunction(me, "rdf_graph_subject_triple_count", "RDF-GRAPH-SUBJECT-TRIPLE-COUNT", 2, 1, false);
        declareFunction(me, "rdf_graph_find_subjects", "RDF-GRAPH-FIND-SUBJECTS", 3, 0, false);
        declareFunction(me, "rdf_graph_find_predicate_triples", "RDF-GRAPH-FIND-PREDICATE-TRIPLES", 2, 0, false);
        declareFunction(me, "rdf_graph_find_predicates", "RDF-GRAPH-FIND-PREDICATES", 3, 0, false);
        declareFunction(me, "rdf_graph_predicate_triple_count", "RDF-GRAPH-PREDICATE-TRIPLE-COUNT", 2, 0, false);
        declareFunction(me, "rdf_graph_find_object_triples", "RDF-GRAPH-FIND-OBJECT-TRIPLES", 2, 1, false);
        declareFunction(me, "rdf_graph_find_object_triples_closure", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CLOSURE", 2, 1, false);
        declareFunction(me, "rdf_graph_find_object_triples_canonical", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CANONICAL", 2, 1, false);
        declareFunction(me, "rdf_graph_find_objects", "RDF-GRAPH-FIND-OBJECTS", 3, 0, false);
        declareFunction(me, "rdf_graph_object_triple_count", "RDF-GRAPH-OBJECT-TRIPLE-COUNT", 2, 1, false);
        declareFunction(me, "valid_rdf_subject_p", "VALID-RDF-SUBJECT-P", 1, 0, false);
        declareFunction(me, "valid_rdf_predicate_p", "VALID-RDF-PREDICATE-P", 1, 0, false);
        declareFunction(me, "valid_rdf_object_p", "VALID-RDF-OBJECT-P", 1, 0, false);
        declareFunction(me, "rdf_graph_get_rdf_namesapce_uri", "RDF-GRAPH-GET-RDF-NAMESAPCE-URI", 2, 0, false);
        declareFunction(me, "rdf_graph_get_uri", "RDF-GRAPH-GET-URI", 2, 2, false);
        declareFunction(me, "rdf_graph_has_uriP", "RDF-GRAPH-HAS-URI?", 2, 2, false);
        declareFunction(me, "rdf_graph_get_blank_node", "RDF-GRAPH-GET-BLANK-NODE", 2, 0, false);
        declareFunction(me, "rdf_graph_get_new_blank_node", "RDF-GRAPH-GET-NEW-BLANK-NODE", 1, 0, false);
        declareFunction(me, "rdf_graph_get_literal", "RDF-GRAPH-GET-LITERAL", 2, 2, false);
        declareFunction(me, "rdf_graph_diff", "RDF-GRAPH-DIFF", 2, 0, false);
        declareFunction(me, "rdf_graph_difference", "RDF-GRAPH-DIFFERENCE", 2, 0, false);
        declareFunction(me, "fort_or_rdf_uri_p", "FORT-OR-RDF-URI-P", 1, 0, false);
        declareFunction(me, "rdf_graph_instances", "RDF-GRAPH-INSTANCES", 2, 1, false);
        declareFunction(me, "rdf_graph_uri_for_fort", "RDF-GRAPH-URI-FOR-FORT", 2, 0, false);
        declareFunction(me, "rank_rdf_classes_transitive", "RANK-RDF-CLASSES-TRANSITIVE", 1, 0, false);
        declareFunction(me, "increment_superclass_count", "INCREMENT-SUPERCLASS-COUNT", 4, 1, false);
        declareFunction(me, "rdf_graph_count_instances", "RDF-GRAPH-COUNT-INSTANCES", 2, 0, false);
        declareFunction(me, "rdf_graph_subclasses", "RDF-GRAPH-SUBCLASSES", 2, 1, false);
        declareFunction(me, "rdf_graph_gather_subclasses_transitive", "RDF-GRAPH-GATHER-SUBCLASSES-TRANSITIVE", 2, 1, false);
        declareFunction(me, "rdf_graph_triple_count", "RDF-GRAPH-TRIPLE-COUNT", 1, 0, false);
        declareFunction(me, "rdf_graph_empty_p", "RDF-GRAPH-EMPTY-P", 1, 0, false);
        declareMacro(me, "rdf_graph_do_nodes", "RDF-GRAPH-DO-NODES");
        declareFunction(me, "get_rdf_graph_lock", "GET-RDF-GRAPH-LOCK", 1, 0, false);
        declareFunction(me, "rdf_graph_node_iterator", "RDF-GRAPH-NODE-ITERATOR", 1, 0, false);
        declareFunction(me, "make_rdf_graph_nodes_iterator_state", "MAKE-RDF-GRAPH-NODES-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "iterate_rdf_graph_nodes_done", "ITERATE-RDF-GRAPH-NODES-DONE", 1, 0, false);
        declareFunction(me, "iterate_rdf_graph_nodes_next", "ITERATE-RDF-GRAPH-NODES-NEXT", 1, 0, false);
        declareFunction(me, "dump_rdf_graph_to_n_triples", "DUMP-RDF-GRAPH-TO-N-TRIPLES", 2, 0, false);
        declareMacro(me, "do_loaded_rdf_graphs", "DO-LOADED-RDF-GRAPHS");
        declareFunction(me, "loaded_rdf_graphs", "LOADED-RDF-GRAPHS", 0, 0, false);
        declareMacro(me, "rdf_graph_do_subjects", "RDF-GRAPH-DO-SUBJECTS");
        declareFunction(me, "rdf_graph_subject_count", "RDF-GRAPH-SUBJECT-COUNT", 1, 1, false);
        declareMacro(me, "rdf_graph_do_triples", "RDF-GRAPH-DO-TRIPLES");
        declareFunction(me, "rdf_graph_for_uri_loadedP", "RDF-GRAPH-FOR-URI-LOADED?", 1, 0, false);
        declareFunction(me, "loaded_rdf_graph_count", "LOADED-RDF-GRAPH-COUNT", 0, 0, false);
        declareFunction(me, "find_or_download_rdf_graph", "FIND-OR-DOWNLOAD-RDF-GRAPH", 1, 0, false);
        declareFunction(me, "download_rdf_graph", "DOWNLOAD-RDF-GRAPH", 1, 0, false);
        declareFunction(me, "rdf_graph_ontology_uri", "RDF-GRAPH-ONTOLOGY-URI", 1, 0, false);
        declareFunction(me, "rdf_graphs_with_uri_predicate_triples", "RDF-GRAPHS-WITH-URI-PREDICATE-TRIPLES", 3, 0, false);
        declareFunction(me, "rdf_predicate_has_uri_objectsP", "RDF-PREDICATE-HAS-URI-OBJECTS?", 1, 0, false);
        declareFunction(me, "count_triples_for_uri", "COUNT-TRIPLES-FOR-URI", 1, 1, false);
        declareFunction(me, "rdf_graph_get_uri_from_two_parts", "RDF-GRAPH-GET-URI-FROM-TWO-PARTS", 3, 0, false);
        declareFunction(me, "note_rdf_graph_accessed", "NOTE-RDF-GRAPH-ACCESSED", 1, 0, false);
        declareFunction(me, "note_rdf_graph_loaded", "NOTE-RDF-GRAPH-LOADED", 1, 0, false);
        declareFunction(me, "remove_from_loaded_rdf_graphs", "REMOVE-FROM-LOADED-RDF-GRAPHS", 1, 0, false);
        declareFunction(me, "qname_for_uri", "QNAME-FOR-URI", 1, 0, false);
        declareFunction(me, "possibly_cull_loaded_rdf_graphs", "POSSIBLY-CULL-LOADED-RDF-GRAPHS", 0, 0, false);
        declareFunction(me, "next_rdf_blank_node_id", "NEXT-RDF-BLANK-NODE-ID", 0, 0, false);
        declareFunction(me, "clear_rdf_graph_get_blank_node_cached", "CLEAR-RDF-GRAPH-GET-BLANK-NODE-CACHED", 0, 0, false);
        declareFunction(me, "remove_rdf_graph_get_blank_node_cached", "REMOVE-RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false);
        declareFunction(me, "rdf_graph_get_blank_node_cached_internal", "RDF-GRAPH-GET-BLANK-NODE-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "rdf_graph_get_blank_node_cached", "RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false);
        declareFunction(me, "clear_rdf_graph_get_literal_cached", "CLEAR-RDF-GRAPH-GET-LITERAL-CACHED", 0, 0, false);
        declareFunction(me, "remove_rdf_graph_get_literal_cached", "REMOVE-RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false);
        declareFunction(me, "rdf_graph_get_literal_cached_internal", "RDF-GRAPH-GET-LITERAL-CACHED-INTERNAL", 4, 0, false);
        declareFunction(me, "rdf_graph_get_literal_cached", "RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false);
        declareFunction(me, "rdf_graph_find_or_create_rdf_triple", "RDF-GRAPH-FIND-OR-CREATE-RDF-TRIPLE", 4, 0, false);
        declareFunction(me, "rdf_graph_find_triple", "RDF-GRAPH-FIND-TRIPLE", 4, 0, false);
        declareFunction(me, "rdf_graph_find_equivalent_triple", "RDF-GRAPH-FIND-EQUIVALENT-TRIPLE", 4, 0, false);
        declareFunction(me, "canonicalize_rdf_triple_argument", "CANONICALIZE-RDF-TRIPLE-ARGUMENT", 2, 0, false);
        declareFunction(me, "xml_literal_datatype_p", "XML-LITERAL-DATATYPE-P", 1, 0, false);
        declareFunction(me, "rdf_graph_find_values", "RDF-GRAPH-FIND-VALUES", 3, 2, false);
        declareFunction(me, "rdf_graph_find_triples", "RDF-GRAPH-FIND-TRIPLES", 3, 0, false);
        declareFunction(me, "rdf_graph_nodes_add", "RDF-GRAPH-NODES-ADD", 2, 0, false);
        declareFunction(me, "rdf_graph_nodes_remove", "RDF-GRAPH-NODES-REMOVE", 2, 0, false);
        declareFunction(me, "rdf_graph_nodes_lookup", "RDF-GRAPH-NODES-LOOKUP", 2, 0, false);
        declareFunction(me, "rdf_nodes_equalP", "RDF-NODES-EQUAL?", 2, 0, false);
        declareFunction(me, "rdf_graph_print_function_trampoline", "RDF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rdf_graph_p", "RDF-GRAPH-P", 1, 0, false);
        new rdf_graph.$rdf_graph_p$UnaryFunction();
        declareFunction(me, "rdf_graph_struct_triples", "RDF-GRAPH-STRUCT-TRIPLES", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_nodes", "RDF-GRAPH-STRUCT-NODES", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_index", "RDF-GRAPH-STRUCT-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_lock", "RDF-GRAPH-STRUCT-LOCK", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_node_count", "RDF-GRAPH-STRUCT-NODE-COUNT", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_prefix_map", "RDF-GRAPH-STRUCT-PREFIX-MAP", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_file_location", "RDF-GRAPH-STRUCT-FILE-LOCATION", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_topic", "RDF-GRAPH-STRUCT-TOPIC", 1, 0, false);
        declareFunction(me, "rdf_graph_struct_focal_nodes", "RDF-GRAPH-STRUCT-FOCAL-NODES", 1, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_triples", "_CSETF-RDF-GRAPH-STRUCT-TRIPLES", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_nodes", "_CSETF-RDF-GRAPH-STRUCT-NODES", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_index", "_CSETF-RDF-GRAPH-STRUCT-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_lock", "_CSETF-RDF-GRAPH-STRUCT-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_node_count", "_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_prefix_map", "_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_file_location", "_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_topic", "_CSETF-RDF-GRAPH-STRUCT-TOPIC", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_struct_focal_nodes", "_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES", 2, 0, false);
        declareFunction(me, "make_rdf_graph", "MAKE-RDF-GRAPH", 0, 1, false);
        declareFunction(me, "visit_defstruct_rdf_graph", "VISIT-DEFSTRUCT-RDF-GRAPH", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rdf_graph_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-METHOD", 2, 0, false);
        declareFunction(me, "print_rdf_graph", "PRINT-RDF-GRAPH", 3, 0, false);
        declareFunction(me, "make_new_rdf_graph", "MAKE-NEW-RDF-GRAPH", 0, 0, false);
        declareFunction(me, "rdf_graph_triples", "RDF-GRAPH-TRIPLES", 1, 0, false);
        declareFunction(me, "rdf_graph_triples_iterator", "RDF-GRAPH-TRIPLES-ITERATOR", 1, 0, false);
        declareFunction(me, "rdf_graph_nodes", "RDF-GRAPH-NODES", 1, 0, false);
        declareFunction(me, "rdf_graph_index", "RDF-GRAPH-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_lock", "RDF-GRAPH-LOCK", 1, 0, false);
        declareFunction(me, "rdf_graph_node_count", "RDF-GRAPH-NODE-COUNT", 1, 0, false);
        declareFunction(me, "rdf_graph_increment_node_count", "RDF-GRAPH-INCREMENT-NODE-COUNT", 1, 0, false);
        declareFunction(me, "rdf_graph_decrement_node_count", "RDF-GRAPH-DECREMENT-NODE-COUNT", 1, 0, false);
        declareFunction(me, "rdf_graph_file_location", "RDF-GRAPH-FILE-LOCATION", 1, 0, false);
        declareFunction(me, "rdf_graph_note_file_location", "RDF-GRAPH-NOTE-FILE-LOCATION", 2, 0, false);
        declareFunction(me, "rdf_graph_topic", "RDF-GRAPH-TOPIC", 1, 0, false);
        declareFunction(me, "rdf_graph_note_topic", "RDF-GRAPH-NOTE-TOPIC", 2, 0, false);
        declareFunction(me, "rdf_graph_focal_nodes", "RDF-GRAPH-FOCAL-NODES", 1, 0, false);
        declareFunction(me, "rdf_graph_note_focal_node", "RDF-GRAPH-NOTE-FOCAL-NODE", 2, 0, false);
        declareFunction(me, "rdf_graph_prefix_map", "RDF-GRAPH-PREFIX-MAP", 1, 0, false);
        declareFunction(me, "rdf_graph_note_namespace_prefixes", "RDF-GRAPH-NOTE-NAMESPACE-PREFIXES", 2, 0, false);
        declareFunction(me, "rdf_graph_qname_for_uri", "RDF-GRAPH-QNAME-FOR-URI", 2, 0, false);
        declareFunction(me, "rdf_graph_get_label", "RDF-GRAPH-GET-LABEL", 2, 0, false);
        declareFunction(me, "rdf_graph_get_labels", "RDF-GRAPH-GET-LABELS", 2, 2, false);
        declareFunction(me, "rdf_uris_matching_label", "RDF-URIS-MATCHING-LABEL", 1, 1, false);
        declareFunction(me, "rdf_graph_get_uris_matching_label", "RDF-GRAPH-GET-URIS-MATCHING-LABEL", 2, 1, false);
        declareFunction(me, "rdf_labels_for_term", "RDF-LABELS-FOR-TERM", 1, 3, false);
        declareFunction(me, "sxhash_rdf_graph_method", "SXHASH-RDF-GRAPH-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_rdf_graph", "SXHASH-RDF-GRAPH", 1, 0, false);
        declareFunction(me, "rdf_graph_index_add", "RDF-GRAPH-INDEX-ADD", 2, 0, false);
        declareFunction(me, "rdf_graph_sub_index_add", "RDF-GRAPH-SUB-INDEX-ADD", 3, 0, false);
        declareFunction(me, "clear_rdf_graph_index_sub_indexes", "CLEAR-RDF-GRAPH-INDEX-SUB-INDEXES", 0, 0, false);
        declareFunction(me, "remove_rdf_graph_index_sub_indexes", "REMOVE-RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false);
        declareFunction(me, "rdf_graph_index_sub_indexes_internal", "RDF-GRAPH-INDEX-SUB-INDEXES-INTERNAL", 1, 0, false);
        declareFunction(me, "rdf_graph_index_sub_indexes", "RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false);
        declareFunction(me, "rdf_graph_index_remove", "RDF-GRAPH-INDEX-REMOVE", 2, 0, false);
        declareFunction(me, "rdf_graph_subject_index_remove", "RDF-GRAPH-SUBJECT-INDEX-REMOVE", 2, 0, false);
        declareFunction(me, "rdf_graph_predicate_index_remove", "RDF-GRAPH-PREDICATE-INDEX-REMOVE", 2, 0, false);
        declareFunction(me, "rdf_graph_object_index_remove", "RDF-GRAPH-OBJECT-INDEX-REMOVE", 2, 0, false);
        declareFunction(me, "rdf_graph_index_find_triple", "RDF-GRAPH-INDEX-FIND-TRIPLE", 4, 1, false);
        declareFunction(me, "rdf_graph_index_find_triples", "RDF-GRAPH-INDEX-FIND-TRIPLES", 3, 0, false);
        declareFunction(me, "rdf_graph_index_find_values", "RDF-GRAPH-INDEX-FIND-VALUES", 5, 0, false);
        declareFunction(me, "rdf_graph_index_sub_index_count", "RDF-GRAPH-INDEX-SUB-INDEX-COUNT", 3, 0, false);
        declareFunction(me, "rdf_graph_index_get_sub_index", "RDF-GRAPH-INDEX-GET-SUB-INDEX", 2, 0, false);
        declareFunction(me, "rdf_graph_index_subject_index_count", "RDF-GRAPH-INDEX-SUBJECT-INDEX-COUNT", 2, 0, false);
        declareFunction(me, "rdf_graph_index_predicate_index_count", "RDF-GRAPH-INDEX-PREDICATE-INDEX-COUNT", 2, 0, false);
        declareFunction(me, "rdf_graph_index_object_index_count", "RDF-GRAPH-INDEX-OBJECT-INDEX-COUNT", 2, 0, false);
        declareFunction(me, "rdf_graph_index_find", "RDF-GRAPH-INDEX-FIND", 5, 1, false);
        declareFunction(me, "rdf_graph_nodes_matchP", "RDF-GRAPH-NODES-MATCH?", 2, 1, false);
        declareFunction(me, "rdf_graph_index_contains_nodeP", "RDF-GRAPH-INDEX-CONTAINS-NODE?", 2, 0, false);
        declareFunction(me, "rdf_graph_index_print_function_trampoline", "RDF-GRAPH-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rdf_graph_index_p", "RDF-GRAPH-INDEX-P", 1, 0, false);
        new rdf_graph.$rdf_graph_index_p$UnaryFunction();
        declareFunction(me, "rdf_graph_index_struct_subject_index", "RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_index_struct_predicate_index", "RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_index_struct_object_index", "RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_rdf_graph_index_struct_subject_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_index_struct_predicate_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_rdf_graph_index_struct_object_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 2, 0, false);
        declareFunction(me, "make_rdf_graph_index", "MAKE-RDF-GRAPH-INDEX", 0, 1, false);
        declareFunction(me, "visit_defstruct_rdf_graph_index", "VISIT-DEFSTRUCT-RDF-GRAPH-INDEX", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rdf_graph_index_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-INDEX-METHOD", 2, 0, false);
        declareFunction(me, "print_rdf_graph_index", "PRINT-RDF-GRAPH-INDEX", 3, 0, false);
        declareFunction(me, "new_rdf_graph_index", "NEW-RDF-GRAPH-INDEX", 0, 0, false);
        declareFunction(me, "rdf_graph_index_subject_index", "RDF-GRAPH-INDEX-SUBJECT-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_index_predicate_index", "RDF-GRAPH-INDEX-PREDICATE-INDEX", 1, 0, false);
        declareFunction(me, "rdf_graph_index_object_index", "RDF-GRAPH-INDEX-OBJECT-INDEX", 1, 0, false);
        declareFunction(me, "sxhash_rdf_graph_index_method", "SXHASH-RDF-GRAPH-INDEX-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_rdf_graph_index", "SXHASH-RDF-GRAPH-INDEX", 1, 0, false);
        declareFunction(me, "print_rdf_graph_triples_readably", "PRINT-RDF-GRAPH-TRIPLES-READABLY", 1, 0, false);
        declareFunction(me, "rdf_graph_compare", "RDF-GRAPH-COMPARE", 2, 1, false);
        declareFunction(me, "rdf_triples_isomorphicP", "RDF-TRIPLES-ISOMORPHIC?", 4, 0, false);
        declareFunction(me, "rdf_triple_pair_equalP", "RDF-TRIPLE-PAIR-EQUAL?", 2, 0, false);
        declareFunction(me, "rdf_triples_isomorphicP_int_internal", "RDF-TRIPLES-ISOMORPHIC?-INT-INTERNAL", 4, 0, false);
        declareFunction(me, "rdf_triples_isomorphicP_int", "RDF-TRIPLES-ISOMORPHIC?-INT", 4, 0, false);
        declareFunction(me, "rdf_node_symmetric_predicateP_internal", "RDF-NODE-SYMMETRIC-PREDICATE?-INTERNAL", 1, 0, false);
        declareFunction(me, "rdf_node_symmetric_predicateP", "RDF-NODE-SYMMETRIC-PREDICATE?", 1, 0, false);
        declareFunction(me, "rdf_triples_equal_with_symmetryP", "RDF-TRIPLES-EQUAL-WITH-SYMMETRY?", 2, 0, false);
        declareFunction(me, "rdf_nodes_isomorphicP", "RDF-NODES-ISOMORPHIC?", 4, 1, false);
        declareFunction(me, "rdf_triple_sets_isomorphicP", "RDF-TRIPLE-SETS-ISOMORPHIC?", 4, 0, false);
        declareFunction(me, "get_known_uri_internal", "GET-KNOWN-URI-INTERNAL", 1, 0, false);
        declareFunction(me, "get_known_uri", "GET-KNOWN-URI", 1, 0, false);
        declareFunction(me, "test_rdf_graph", "TEST-RDF-GRAPH", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_graph_file() {
        deflexical("*LOADED-RDF-GRAPHS*", NIL);
        deflexical("*LOADED-RDF-GRAPHS-LOCK*", ReadWriteLocks.new_rw_lock($$$Loaded_RDF_Graphs));
        defparameter("*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*", NIL);
        defparameter("*RDF-GRAPH-CONVERTED-TRIPLES*", NIL);
        deflexical("*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*", $int$10000);
        deflexical("*RDF-BLANK-NODE-ISG*", SubLTrampolineFile.maybeDefault($rdf_blank_node_isg$, $rdf_blank_node_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*", NIL);
        deflexical("*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH*", RDF_GRAPH);
        deflexical("*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*", symbol_function(EQ));
        deflexical("*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-GRAPH-INDEX*", RDF_GRAPH_INDEX);
        defparameter("*GRAPH2-MATCHED-TRIPLES*", NIL);
        defparameter("*RDF-TRIPLES-ASSUMED-ISOMOPHIC*", NIL);
        return NIL;
    }

    public static SubLObject setup_rdf_graph_file() {
        register_macro_helper(GET_RDF_GRAPH_LOCK, RDF_GRAPH_DO_NODES);
        register_macro_helper(RDF_GRAPH_NODE_ITERATOR, RDF_GRAPH_DO_NODES);
        note_funcall_helper_function(ITERATE_RDF_GRAPH_NODES_DONE);
        note_funcall_helper_function(ITERATE_RDF_GRAPH_NODES_NEXT);
        register_macro_helper(LOADED_RDF_GRAPHS, DO_LOADED_RDF_GRAPHS);
        declare_defglobal($rdf_blank_node_isg$);
        memoization_state.note_globally_cached_function(RDF_GRAPH_GET_BLANK_NODE_CACHED);
        memoization_state.note_globally_cached_function(RDF_GRAPH_GET_LITERAL_CACHED);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), symbol_function(RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list78);
        def_csetf(RDF_GRAPH_STRUCT_TRIPLES, _CSETF_RDF_GRAPH_STRUCT_TRIPLES);
        def_csetf(RDF_GRAPH_STRUCT_NODES, _CSETF_RDF_GRAPH_STRUCT_NODES);
        def_csetf(RDF_GRAPH_STRUCT_INDEX, _CSETF_RDF_GRAPH_STRUCT_INDEX);
        def_csetf(RDF_GRAPH_STRUCT_LOCK, _CSETF_RDF_GRAPH_STRUCT_LOCK);
        def_csetf(RDF_GRAPH_STRUCT_NODE_COUNT, _CSETF_RDF_GRAPH_STRUCT_NODE_COUNT);
        def_csetf(RDF_GRAPH_STRUCT_PREFIX_MAP, _CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP);
        def_csetf(RDF_GRAPH_STRUCT_FILE_LOCATION, _CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION);
        def_csetf(RDF_GRAPH_STRUCT_TOPIC, _CSETF_RDF_GRAPH_STRUCT_TOPIC);
        def_csetf(RDF_GRAPH_STRUCT_FOCAL_NODES, _CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES);
        identity(RDF_GRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD));
        note_funcall_helper_function(PRINT_RDF_GRAPH);
        register_macro_helper(RDF_GRAPH_TRIPLES_ITERATOR, RDF_GRAPH_DO_SUBJECTS);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), symbol_function(SXHASH_RDF_GRAPH_METHOD));
        memoization_state.note_globally_cached_function(RDF_GRAPH_INDEX_SUB_INDEXES);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), symbol_function(RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list138);
        def_csetf(RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX);
        def_csetf(RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX);
        def_csetf(RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX, _CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX);
        identity(RDF_GRAPH_INDEX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD));
        note_funcall_helper_function(PRINT_RDF_GRAPH_INDEX);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), symbol_function(SXHASH_RDF_GRAPH_INDEX_METHOD));
        memoization_state.note_memoized_function($sym159$RDF_TRIPLES_ISOMORPHIC__INT);
        memoization_state.note_memoized_function($sym160$RDF_NODE_SYMMETRIC_PREDICATE_);
        memoization_state.note_memoized_function(GET_KNOWN_URI);
        define_test_case_table_int(TEST_RDF_GRAPH, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list187, $KB, $TINY, $WORKING_, T }), $list191);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_graph_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_graph_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_graph_file();
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

        private $rdf_graph_native() {
            this.$triples = Lisp.NIL;
            this.$nodes = Lisp.NIL;
            this.$index = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$node_count = Lisp.NIL;
            this.$prefix_map = Lisp.NIL;
            this.$file_location = Lisp.NIL;
            this.$topic = Lisp.NIL;
            this.$focal_nodes = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$triples;
        }

        @Override
        public SubLObject getField3() {
            return this.$nodes;
        }

        @Override
        public SubLObject getField4() {
            return this.$index;
        }

        @Override
        public SubLObject getField5() {
            return this.$lock;
        }

        @Override
        public SubLObject getField6() {
            return this.$node_count;
        }

        @Override
        public SubLObject getField7() {
            return this.$prefix_map;
        }

        @Override
        public SubLObject getField8() {
            return this.$file_location;
        }

        @Override
        public SubLObject getField9() {
            return this.$topic;
        }

        @Override
        public SubLObject getField10() {
            return this.$focal_nodes;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$triples = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$nodes = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$node_count = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$prefix_map = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$file_location = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$topic = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$focal_nodes = value;
        }

        static {
            structDecl = makeStructDeclNative($rdf_graph_native.class, RDF_GRAPH, RDF_GRAPH_P, $list72, $list73, new String[]{ "$triples", "$nodes", "$index", "$lock", "$node_count", "$prefix_map", "$file_location", "$topic", "$focal_nodes" }, $list74, $list75, PRINT_RDF_GRAPH);
        }
    }

    public static final class $rdf_graph_p$UnaryFunction extends UnaryFunction {
        public $rdf_graph_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-GRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_graph_p(arg1);
        }
    }

    public static final class $rdf_graph_index_native extends SubLStructNative {
        public SubLObject $subject_index;

        public SubLObject $predicate_index;

        public SubLObject $object_index;

        private static final SubLStructDeclNative structDecl;

        private $rdf_graph_index_native() {
            this.$subject_index = Lisp.NIL;
            this.$predicate_index = Lisp.NIL;
            this.$object_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$subject_index;
        }

        @Override
        public SubLObject getField3() {
            return this.$predicate_index;
        }

        @Override
        public SubLObject getField4() {
            return this.$object_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$subject_index = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$predicate_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$object_index = value;
        }

        static {
            structDecl = makeStructDeclNative($rdf_graph_index_native.class, RDF_GRAPH_INDEX, RDF_GRAPH_INDEX_P, $list132, $list133, new String[]{ "$subject_index", "$predicate_index", "$object_index" }, $list134, $list135, PRINT_RDF_GRAPH_INDEX);
        }
    }

    public static final class $rdf_graph_index_p$UnaryFunction extends UnaryFunction {
        public $rdf_graph_index_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-GRAPH-INDEX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_graph_index_p(arg1);
        }
    }
}

/**
 * Total time: 1316 ms synthetic
 */
