package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.owl.owl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_graph
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_graph";
  public static final String myFingerPrint = "f38d1035223a743e697b06873420f4df81a197225205b992dfedf4f1eabacf95";
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 824L)
  private static SubLSymbol $loaded_rdf_graphs$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 869L)
  public static SubLSymbol $loaded_rdf_graphs_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 951L)
  private static SubLSymbol $rdf_graph_literal_indexing_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 6066L)
  public static SubLSymbol $rdf_graph_converted_triples$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 26218L)
  private static SubLSymbol $target_max_loaded_rdf_triple_count$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27039L)
  private static SubLSymbol $rdf_blank_node_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27225L)
  private static SubLSymbol $rdf_graph_get_blank_node_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27466L)
  private static SubLSymbol $rdf_graph_get_literal_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLSymbol $dtp_rdf_graph$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 34316L)
  private static SubLSymbol $rdf_graph_internal_triple_comparison_test$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 34387L)
  private static SubLSymbol $rdf_graph_internal_node_comparison_test$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41875L)
  private static SubLSymbol $rdf_graph_index_sub_indexes_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLSymbol $dtp_rdf_graph_index$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 51390L)
  private static SubLSymbol $graph2_matched_triples$;
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 55542L)
  private static SubLSymbol $rdf_triples_assumed_isomophic$;
  private static final SubLString $str0$Loaded_RDF_Graphs;
  private static final SubLSymbol $sym1$RDF_GRAPH_P;
  private static final SubLSymbol $sym2$VALID_RDF_SUBJECT_P;
  private static final SubLSymbol $sym3$VALID_RDF_PREDICATE_P;
  private static final SubLSymbol $sym4$VALID_RDF_OBJECT_P;
  private static final SubLString $str5$label;
  private static final SubLString $str6$comment;
  private static final SubLSymbol $sym7$RDF_TRIPLE_P;
  private static final SubLSymbol $kw8$SUBJECT;
  private static final SubLSymbol $kw9$OBJECT;
  private static final SubLSymbol $sym10$RDF_TRIPLES_EQUAL_;
  private static final SubLSymbol $kw11$PREDICATE;
  private static final SubLSymbol $sym12$COPY_RDF_TRIPLE;
  private static final SubLSymbol $sym13$STRINGP;
  private static final SubLSymbol $sym14$VALID_RDF_LITERAL_DATATYPE_P;
  private static final SubLSymbol $sym15$FORT_OR_RDF_URI_P;
  private static final SubLString $str16$type;
  private static final SubLString $str17$sameAs;
  private static final SubLString $str18$Class;
  private static final SubLString $str19$Ranking_classes_by_transitive_ins;
  private static final SubLString $str20$cdolist;
  private static final SubLSymbol $sym21$ZEROP;
  private static final SubLSymbol $sym22$_;
  private static final SubLSymbol $sym23$CDR;
  private static final SubLString $str24$subClassOf;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$WITH_READER_LOCK;
  private static final SubLSymbol $sym27$GET_RDF_GRAPH_LOCK;
  private static final SubLSymbol $sym28$DO_ITERATOR;
  private static final SubLSymbol $sym29$RDF_GRAPH_NODE_ITERATOR;
  private static final SubLSymbol $sym30$RDF_GRAPH_DO_NODES;
  private static final SubLSymbol $sym31$ITERATE_RDF_GRAPH_NODES_DONE;
  private static final SubLSymbol $sym32$ITERATE_RDF_GRAPH_NODES_NEXT;
  private static final SubLString $str33$_S_already_exists_;
  private static final SubLSymbol $kw34$OUTPUT;
  private static final SubLString $str35$Unable_to_open__S;
  private static final SubLString $str36$Dumping_RDF_graph_to_;
  private static final SubLString $str37$___;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw41$DONE;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$LOADED_RDF_GRAPHS;
  private static final SubLSymbol $sym45$DO_LOADED_RDF_GRAPHS;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$TRIPLE;
  private static final SubLSymbol $sym48$DONE_SUBJECTS;
  private static final SubLSymbol $sym49$CLET;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$RDF_GRAPH_TRIPLES_ITERATOR;
  private static final SubLSymbol $sym52$RDF_TRIPLE_SUBJECT;
  private static final SubLSymbol $sym53$PWHEN;
  private static final SubLSymbol $sym54$SET_ADD;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$RDF_URI_P;
  private static final SubLSymbol $sym57$RDF_GRAPH_TOPIC;
  private static final SubLSymbol $kw58$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym59$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str60$Ontology;
  private static final SubLSymbol $kw61$ALL;
  private static final SubLInteger $int62$10000;
  private static final SubLSymbol $sym63$_RDF_BLANK_NODE_ISG_;
  private static final SubLSymbol $sym64$RDF_GRAPH_GET_BLANK_NODE_CACHED;
  private static final SubLSymbol $sym65$_RDF_GRAPH_GET_BLANK_NODE_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym66$RDF_GRAPH_GET_LITERAL_CACHED;
  private static final SubLSymbol $sym67$_RDF_GRAPH_GET_LITERAL_CACHED_CACHING_STATE_;
  private static final SubLString $str68$XMLLiteral;
  private static final SubLSymbol $kw69$NOT_FOUND;
  private static final SubLSymbol $sym70$RDF_NODES_EQUAL_;
  private static final SubLSymbol $sym71$RDF_GRAPH;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$PRINT_RDF_GRAPH;
  private static final SubLSymbol $sym77$RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$RDF_GRAPH_STRUCT_TRIPLES;
  private static final SubLSymbol $sym80$_CSETF_RDF_GRAPH_STRUCT_TRIPLES;
  private static final SubLSymbol $sym81$RDF_GRAPH_STRUCT_NODES;
  private static final SubLSymbol $sym82$_CSETF_RDF_GRAPH_STRUCT_NODES;
  private static final SubLSymbol $sym83$RDF_GRAPH_STRUCT_INDEX;
  private static final SubLSymbol $sym84$_CSETF_RDF_GRAPH_STRUCT_INDEX;
  private static final SubLSymbol $sym85$RDF_GRAPH_STRUCT_LOCK;
  private static final SubLSymbol $sym86$_CSETF_RDF_GRAPH_STRUCT_LOCK;
  private static final SubLSymbol $sym87$RDF_GRAPH_STRUCT_NODE_COUNT;
  private static final SubLSymbol $sym88$_CSETF_RDF_GRAPH_STRUCT_NODE_COUNT;
  private static final SubLSymbol $sym89$RDF_GRAPH_STRUCT_PREFIX_MAP;
  private static final SubLSymbol $sym90$_CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP;
  private static final SubLSymbol $sym91$RDF_GRAPH_STRUCT_FILE_LOCATION;
  private static final SubLSymbol $sym92$_CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION;
  private static final SubLSymbol $sym93$RDF_GRAPH_STRUCT_TOPIC;
  private static final SubLSymbol $sym94$_CSETF_RDF_GRAPH_STRUCT_TOPIC;
  private static final SubLSymbol $sym95$RDF_GRAPH_STRUCT_FOCAL_NODES;
  private static final SubLSymbol $sym96$_CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES;
  private static final SubLSymbol $kw97$TRIPLES;
  private static final SubLSymbol $kw98$NODES;
  private static final SubLSymbol $kw99$INDEX;
  private static final SubLSymbol $kw100$LOCK;
  private static final SubLSymbol $kw101$NODE_COUNT;
  private static final SubLSymbol $kw102$PREFIX_MAP;
  private static final SubLSymbol $kw103$FILE_LOCATION;
  private static final SubLSymbol $kw104$TOPIC;
  private static final SubLSymbol $kw105$FOCAL_NODES;
  private static final SubLString $str106$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw107$BEGIN;
  private static final SubLSymbol $sym108$MAKE_RDF_GRAPH;
  private static final SubLSymbol $kw109$SLOT;
  private static final SubLSymbol $kw110$END;
  private static final SubLSymbol $sym111$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD;
  private static final SubLString $str112$_RDF_GRAPH__A_;
  private static final SubLString $str113$RDF_GRAPH;
  private static final SubLSymbol $sym114$RDF_GRAPH_DO_SUBJECTS;
  private static final SubLList $list115;
  private static final SubLString $str116$xmlns;
  private static final SubLString $str117$xml_base;
  private static final SubLString $str118$xmlns_;
  private static final SubLSymbol $sym119$URI_P;
  private static final SubLString $str120$_;
  private static final SubLString $str121$en;
  private static final SubLSymbol $sym122$RDF_LITERAL_LANGUAGE_TAG;
  private static final SubLString $str123$http;
  private static final SubLSymbol $sym124$SXHASH_RDF_GRAPH_METHOD;
  private static final SubLSymbol $sym125$RDF_GRAPH_INDEX_SUB_INDEXES;
  private static final SubLSymbol $sym126$_RDF_GRAPH_INDEX_SUB_INDEXES_CACHING_STATE_;
  private static final SubLSymbol $sym127$RDF_TRIPLE_POSITION_P;
  private static final SubLSymbol $sym128$APPEND;
  private static final SubLSymbol $sym129$SET_ELEMENT_LIST;
  private static final SubLSymbol $sym130$RDF_GRAPH_INDEX;
  private static final SubLSymbol $sym131$RDF_GRAPH_INDEX_P;
  private static final SubLList $list132;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$PRINT_RDF_GRAPH_INDEX;
  private static final SubLSymbol $sym137$RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX;
  private static final SubLSymbol $sym140$_CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX;
  private static final SubLSymbol $sym141$RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX;
  private static final SubLSymbol $sym142$_CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX;
  private static final SubLSymbol $sym143$RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX;
  private static final SubLSymbol $sym144$_CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX;
  private static final SubLSymbol $kw145$SUBJECT_INDEX;
  private static final SubLSymbol $kw146$PREDICATE_INDEX;
  private static final SubLSymbol $kw147$OBJECT_INDEX;
  private static final SubLSymbol $sym148$MAKE_RDF_GRAPH_INDEX;
  private static final SubLSymbol $sym149$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD;
  private static final SubLString $str150$_RDF_GRAPH_INDEX_;
  private static final SubLSymbol $sym151$SXHASH_RDF_GRAPH_INDEX_METHOD;
  private static final SubLString $str152$______A__A__A___;
  private static final SubLString $str153$Comparing_graph1___A_triples___A_;
  private static final SubLString $str154$Comparing_focal_nodes___A_compare;
  private static final SubLString $str155$Comparing_all_nodes___A_compares_;
  private static final SubLSymbol $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_;
  private static final SubLSymbol $sym157$_EXIT;
  private static final SubLSymbol $sym158$RDF_TRIPLE_PAIR_EQUAL_;
  private static final SubLSymbol $sym159$RDF_TRIPLES_ISOMORPHIC__INT;
  private static final SubLSymbol $sym160$RDF_NODE_SYMMETRIC_PREDICATE_;
  private static final SubLString $str161$owl_complementOf;
  private static final SubLString $str162$owl_disjointWith;
  private static final SubLString $str163$owl_equivalentClass;
  private static final SubLString $str164$owl_equivalentProperty;
  private static final SubLString $str165$owl_incompatibleWith;
  private static final SubLString $str166$owl_inverseOf;
  private static final SubLSymbol $sym167$GET_KNOWN_URI;
  private static final SubLString $str168$owl_;
  private static final SubLString $str169$rdf_;
  private static final SubLString $str170$rdfs_;
  private static final SubLString $str171$xsd_;
  private static final SubLObject $const172$rdfURI;
  private static final SubLObject $const173$BaseKB;
  private static final SubLList $list174;
  private static final SubLList $list175;
  private static final SubLSymbol $sym176$STRING_;
  private static final SubLList $list177;
  private static final SubLString $str178$owl;
  private static final SubLString $str179$rdf;
  private static final SubLString $str180$rdfs;
  private static final SubLString $str181$xsd;
  private static final SubLString $str182$get_known_uri_called_with_unhandl;
  private static final SubLSymbol $sym183$TEST_RDF_GRAPH;
  private static final SubLSymbol $kw184$TEST;
  private static final SubLSymbol $kw185$OWNER;
  private static final SubLSymbol $kw186$CLASSES;
  private static final SubLList $list187;
  private static final SubLSymbol $kw188$KB;
  private static final SubLSymbol $kw189$TINY;
  private static final SubLSymbol $kw190$WORKING_;
  private static final SubLList $list191;
  private static final SubLObject $const192$Emu;
  private static final SubLObject $const193$genls;
  private static final SubLObject $const194$comment;
  private static final SubLObject $const195$Bird;
  private static final SubLObject $const196$CurrentWorldDataCollectorMt;
  private static final SubLString $str197$FOO;
  private static final SubLString $str198$foo;
  private static final SubLString $str199$Failed_to_canonicalize_;
  private static final SubLString $str200$Got_non_EQ_URIs_for___Emu_;
  private static final SubLString $str201$Got_non_EQ_literals_for_comment_l;
  private static final SubLString $str202$Couldn_t_find_equivalent_triple_;
  private static final SubLString $str203$Failed_to_realize_that_triple_was;
  private static final SubLString $str204$Failed_to_realize_that_triple_was;
  private static final SubLString $str205$Can_t_find_URI_for__S;
  private static final SubLString $str206$Expecting_3_nodes_left__Actual_co;
  private static final SubLString $str207$Graph_does_not_genls_triple_we_ju;
  private static final SubLString $str208$Expected_1_subject_triple_for_emu;
  private static final SubLString $str209$Expected_1_subject_for_genls_bird;
  private static final SubLString $str210$Expecting_5_nodes_left__Actual_co;
  private static final SubLString $str211$Graph_does_not_comment_triple_we_;
  private static final SubLString $str212$Graph_contains_genls_triple_we_ju;
  private static final SubLString $str213$Graph_does_not_big_foo_triple_we_;
  private static final SubLString $str214$Graph_does_not_little_foo_triple_;
  private static final SubLString $str215$Looked_for_big_foo__got_little_fo;

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 1150L)
  public static SubLObject new_rdf_graph()
  {
    return make_new_rdf_graph();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 1268L)
  public static SubLObject rdf_graph_add_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    final SubLObject c_subject = canonicalize_rdf_triple_argument( subject, v_graph );
    final SubLObject c_predicate = canonicalize_rdf_triple_argument( predicate, v_graph );
    SubLObject c_object = canonicalize_rdf_triple_argument( v_object, v_graph );
    SubLObject triple = NIL;
    SubLObject newP = NIL;
    if( v_object.isString() && ( NIL != rdf_nodes_equalP( c_predicate, rdf_graph_get_uri( v_graph, rdf_utilities.rdfs_expanded_name( $str5$label ), UNPROVIDED, UNPROVIDED ) ) || NIL != rdf_nodes_equalP( c_predicate,
        rdf_graph_get_uri( v_graph, rdf_utilities.rdfs_expanded_name( $str6$comment ), UNPROVIDED, UNPROVIDED ) ) ) )
    {
      c_object = rdf_graph_get_literal( v_graph, v_object, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      thread.resetMultipleValues();
      final SubLObject triple_$1 = rdf_graph_find_or_create_rdf_triple( v_graph, c_subject, c_predicate, c_object );
      final SubLObject newP_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      triple = triple_$1;
      newP = newP_$2;
      if( NIL != newP )
      {
        set.set_add( triple, rdf_graph_triples( v_graph ) );
        SubLObject cdolist_list_var = rdf_triple.rdf_triple_args( triple );
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          rdf_graph_nodes_add( v_graph, node );
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
        rdf_graph_index_add( rdf_graph_index( v_graph ), triple );
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return newP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 2512L)
  public static SubLObject rdf_graph_remove_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    SubLObject triple = NIL;
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      triple = rdf_graph_find_triple( v_graph, subject, predicate, v_object );
      if( NIL != triple )
      {
        set.set_remove( triple, rdf_graph_triples( v_graph ) );
        rdf_graph_index_remove( rdf_graph_index( v_graph ), triple );
        SubLObject cdolist_list_var = rdf_triple.rdf_triple_args( triple );
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == rdf_graph_index_contains_nodeP( rdf_graph_index( v_graph ), node ) )
          {
            rdf_graph_nodes_remove( v_graph, node );
          }
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return list_utilities.sublisp_boolean( triple );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 3329L)
  public static SubLObject rdf_graph_remove_known_triple(final SubLObject v_graph, final SubLObject triple)
  {
    assert NIL != rdf_triple.rdf_triple_p( triple, UNPROVIDED ) : triple;
    rdf_graph_remove_triple( v_graph, rdf_triple.rdf_triple_subject( triple ), rdf_triple.rdf_triple_predicate( triple ), rdf_triple.rdf_triple_object( triple ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 3576L)
  public static SubLObject rdf_graph_contains_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    return list_utilities.sublisp_boolean( rdf_graph_find_triple( v_graph, subject, predicate, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 3967L)
  public static SubLObject rdf_graph_contains_equivalent_tripleP(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    return list_utilities.sublisp_boolean( rdf_graph_find_equivalent_triple( v_graph, subject, predicate, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 4390L)
  public static SubLObject rdf_graph_find_subject_triples(final SubLObject v_graph, final SubLObject subject, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    SubLObject triples = NIL;
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    final SubLObject set_var = rdf_graph_find_triples( v_graph, subject, $kw8$SUBJECT );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 5063L)
  public static SubLObject rdf_graph_find_subject_triples_closure(final SubLObject v_graph, final SubLObject subject, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    SubLObject triples = NIL;
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    SubLObject set_var = rdf_graph_find_triples( v_graph, subject, $kw8$SUBJECT );
    SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    set_var = rdf_graph_find_triples( v_graph, subject, $kw9$OBJECT );
    set_contents_var = set.do_set_internal( set_var );
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple ) ) && ( NIL == predicate || predicate_uri.eql( rdf_triple
          .rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 6268L)
  public static SubLObject rdf_graph_find_subject_triples_canonical(final SubLObject v_graph, final SubLObject subject, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    SubLObject triples = NIL;
    SubLObject set_var = rdf_graph_find_triples( v_graph, subject, $kw8$SUBJECT );
    SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL == subl_promotions.memberP( triple, $rdf_graph_converted_triples$.getDynamicValue( thread ), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED )
          && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    set_var = rdf_graph_find_triples( v_graph, subject, $kw9$OBJECT );
    set_contents_var = set.do_set_internal( set_var );
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple ) ) && ( NIL == predicate || predicate_uri.eql( rdf_triple
          .rdf_triple_predicate( triple ) ) ) )
      {
        $rdf_graph_converted_triples$.setDynamicValue( ConsesLow.cons( triple, $rdf_graph_converted_triples$.getDynamicValue( thread ) ), thread );
        triples = ConsesLow.cons( rdf_triple.new_rdf_triple( rdf_triple.rdf_triple_object( triple ), rdf_triple.rdf_triple_predicate( triple ), rdf_triple.rdf_triple_subject( triple ) ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 7700L)
  public static SubLObject rdf_graph_subject_triple_count(final SubLObject v_graph, final SubLObject subject, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    final SubLObject all_subject_triples = rdf_graph_find_triples( v_graph, subject, $kw8$SUBJECT );
    if( NIL == predicate )
    {
      return set.set_size( all_subject_triples );
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject predicate_rdf_uri = ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( all_subject_triples );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && predicate_rdf_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 8342L)
  public static SubLObject rdf_graph_find_subjects(final SubLObject v_graph, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    return rdf_graph_find_values( v_graph, predicate, $kw11$PREDICATE, v_object, $kw9$OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 8747L)
  public static SubLObject rdf_graph_find_predicate_triples(final SubLObject v_graph, final SubLObject predicate)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    return Mapping.mapcar( $sym12$COPY_RDF_TRIPLE, set.set_element_list( rdf_graph_find_triples( v_graph, predicate, $kw11$PREDICATE ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 9087L)
  public static SubLObject rdf_graph_find_predicates(final SubLObject v_graph, final SubLObject subject, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    return rdf_graph_find_values( v_graph, subject, $kw8$SUBJECT, v_object, $kw9$OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 9484L)
  public static SubLObject rdf_graph_predicate_triple_count(final SubLObject v_graph, final SubLObject predicate)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    return set.set_size( rdf_graph_find_triples( v_graph, predicate, $kw11$PREDICATE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 9703L)
  public static SubLObject rdf_graph_find_object_triples(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    SubLObject triples = NIL;
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    final SubLObject set_var = rdf_graph_find_triples( v_graph, v_object, $kw9$OBJECT );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 10368L)
  public static SubLObject rdf_graph_find_object_triples_closure(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    SubLObject triples = NIL;
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    SubLObject set_var = rdf_graph_find_triples( v_graph, v_object, $kw9$OBJECT );
    SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    set_var = rdf_graph_find_triples( v_graph, v_object, $kw8$SUBJECT );
    set_contents_var = set.do_set_internal( set_var );
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple ) ) && ( NIL == predicate || predicate_uri.eql( rdf_triple
          .rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 11363L)
  public static SubLObject rdf_graph_find_object_triples_canonical(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    SubLObject triples = NIL;
    final SubLObject predicate_uri = ( NIL != predicate ) ? ( ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED ) ) : NIL;
    final SubLObject set_var = rdf_graph_find_triples( v_graph, v_object, $kw9$OBJECT );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL == subl_promotions.memberP( triple, $rdf_graph_converted_triples$.getDynamicValue( thread ), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED )
          && ( NIL == predicate || predicate_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) ) )
      {
        triples = ConsesLow.cons( rdf_triple.copy_rdf_triple( triple ), triples );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 12241L)
  public static SubLObject rdf_graph_find_objects(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    return rdf_graph_find_values( v_graph, subject, $kw8$SUBJECT, predicate, $kw11$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 12650L)
  public static SubLObject rdf_graph_object_triple_count(final SubLObject v_graph, final SubLObject v_object, SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    if( NIL != predicate && !assertionsDisabledInClass && NIL == valid_rdf_predicate_p( predicate ) )
    {
      throw new AssertionError( predicate );
    }
    final SubLObject all_object_triples = rdf_graph_find_triples( v_graph, v_object, $kw9$OBJECT );
    if( NIL == predicate )
    {
      return set.set_size( all_object_triples );
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject predicate_rdf_uri = ( NIL != rdf_uri.rdf_uri_p( predicate ) ) ? predicate : rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( all_object_triples );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && predicate_rdf_uri.eql( rdf_triple.rdf_triple_predicate( triple ) ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 13283L)
  public static SubLObject valid_rdf_subject_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( v_object ) || NIL != web_utilities.uri_p( v_object, UNPROVIDED ) || NIL != rdf_blank_node.rdf_blank_node_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 13497L)
  public static SubLObject valid_rdf_predicate_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != web_utilities.uri_p( v_object, UNPROVIDED ) || NIL != rdf_uri.rdf_uri_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 13681L)
  public static SubLObject valid_rdf_object_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( v_object ) || NIL != web_utilities.uri_p( v_object, UNPROVIDED ) || NIL != rdf_literal.rdf_literal_p( v_object ) || NIL != rdf_blank_node.rdf_blank_node_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 13921L)
  public static SubLObject rdf_graph_get_rdf_namesapce_uri(final SubLObject v_graph, final SubLObject local_part)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_get_uri_from_two_parts( v_graph, rdf_utilities.rdf_namespace(), local_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 14172L)
  public static SubLObject rdf_graph_get_uri(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part)
  {
    if( connector == UNPROVIDED )
    {
      connector = NIL;
    }
    if( local_part == UNPROVIDED )
    {
      local_part = NIL;
    }
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_uri.get_rdf_uri( base_uri, connector, local_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 14423L)
  public static SubLObject rdf_graph_has_uriP(final SubLObject v_graph, final SubLObject base_uri, SubLObject connector, SubLObject local_part)
  {
    if( connector == UNPROVIDED )
    {
      connector = NIL;
    }
    if( local_part == UNPROVIDED )
    {
      local_part = NIL;
    }
    return list_utilities.sublisp_boolean( rdf_graph_nodes_lookup( v_graph, rdf_uri.get_rdf_uri( base_uri, connector, local_part ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 14685L)
  public static SubLObject rdf_graph_get_blank_node(final SubLObject v_graph, final SubLObject id)
  {
    SubLObject node = NIL;
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      node = rdf_graph_get_blank_node_cached( v_graph, id );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 14925L)
  public static SubLObject rdf_graph_get_new_blank_node(final SubLObject v_graph)
  {
    return rdf_blank_node.new_rdf_blank_node( next_rdf_blank_node_id() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 15050L)
  public static SubLObject rdf_graph_get_literal(final SubLObject v_graph, final SubLObject utf8_lexical_form, SubLObject language_tag, SubLObject datatype)
  {
    if( language_tag == UNPROVIDED )
    {
      language_tag = NIL;
    }
    if( datatype == UNPROVIDED )
    {
      datatype = NIL;
    }
    assert NIL != Types.stringp( utf8_lexical_form ) : utf8_lexical_form;
    if( NIL != language_tag && !assertionsDisabledInClass && NIL == Types.stringp( language_tag ) )
    {
      throw new AssertionError( language_tag );
    }
    if( NIL != datatype && !assertionsDisabledInClass && NIL == rdf_literal.valid_rdf_literal_datatype_p( datatype ) )
    {
      throw new AssertionError( datatype );
    }
    SubLObject node = NIL;
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      node = rdf_graph_get_literal_cached( v_graph, utf8_lexical_form, language_tag, datatype );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 15560L)
  public static SubLObject rdf_graph_diff(final SubLObject graph1, final SubLObject graph2)
  {
    return Values.values( rdf_graph_difference( graph1, graph2 ), rdf_graph_difference( graph2, graph1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 15823L)
  public static SubLObject rdf_graph_difference(final SubLObject graph1, final SubLObject graph2)
  {
    SubLObject ans = NIL;
    final SubLObject set_var = rdf_graph_triples( graph1 );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && NIL == rdf_graph_contains_equivalent_tripleP( graph2, rdf_triple.rdf_triple_subject( triple ), rdf_triple.rdf_triple_predicate( triple ),
          rdf_triple.rdf_triple_object( triple ) ) )
      {
        ans = ConsesLow.cons( triple, ans );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 16222L)
  public static SubLObject fort_or_rdf_uri_p(final SubLObject obj)
  {
    return makeBoolean( NIL != forts.fort_p( obj ) || NIL != rdf_uri.rdf_uri_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 16311L)
  public static SubLObject rdf_graph_instances(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP)
  {
    if( transitiveP == UNPROVIDED )
    {
      transitiveP = T;
    }
    assert NIL != fort_or_rdf_uri_p( collection ) : collection;
    final SubLObject collection_class = ( NIL != rdf_uri.rdf_uri_p( collection ) ) ? collection : rdf_graph_uri_for_fort( v_graph, collection );
    final SubLObject direct_instances = rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str16$type ), collection_class );
    if( NIL != transitiveP )
    {
      SubLObject v_instances = direct_instances;
      SubLObject cdolist_list_var = rdf_graph_subclasses( v_graph, collection_class, UNPROVIDED );
      SubLObject subclass = NIL;
      subclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_instances = ConsesLow.nconc( v_instances, rdf_graph_instances( v_graph, subclass, NIL ) );
        cdolist_list_var = cdolist_list_var.rest();
        subclass = cdolist_list_var.first();
      }
      return Sequences.delete_duplicates( v_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return direct_instances;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 16952L)
  public static SubLObject rdf_graph_uri_for_fort(final SubLObject v_graph, final SubLObject fort)
  {
    return rdf_graph_find_subjects( v_graph, owl_utilities.owl_expanded_name( $str17$sameAs ), owl_cycl_to_xml.owl_cyc_latest_uri_for_fort( fort ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 17129L)
  public static SubLObject rank_rdf_classes_transitive(final SubLObject v_graph)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dict = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject list_var = rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str16$type ), owl_utilities.owl_expanded_name( $str18$Class ) );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str19$Ranking_classes_by_transitive_ins, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject v_class = NIL;
        v_class = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != rdf_uri.rdf_uri_p( v_class ) )
          {
            final SubLObject direct_instance_count = rdf_graph_object_triple_count( v_graph, v_class, rdf_utilities.rdf_expanded_name( $str16$type ) );
            dictionary_utilities.dictionary_increment( dict, v_class, direct_instance_count );
            increment_superclass_count( dict, v_graph, v_class, direct_instance_count, UNPROVIDED );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          v_class = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_if( $sym21$ZEROP, dictionary_utilities.sort_dictionary_by_values( dict, Symbols.symbol_function( $sym22$_ ) ), Symbols.symbol_function( $sym23$CDR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 17740L)
  public static SubLObject increment_superclass_count(final SubLObject dict, final SubLObject v_graph, final SubLObject v_class, final SubLObject count, SubLObject done)
  {
    if( done == UNPROVIDED )
    {
      done = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    SubLObject cdolist_list_var = rdf_graph_find_objects( v_graph, v_class, rdf_utilities.rdfs_expanded_name( $str24$subClassOf ) );
    SubLObject superclass = NIL;
    superclass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == set.set_memberP( superclass, done ) )
      {
        dictionary_utilities.dictionary_increment( dict, superclass, count );
        set.set_add( superclass, done );
        increment_superclass_count( dict, v_graph, superclass, count, done );
      }
      cdolist_list_var = cdolist_list_var.rest();
      superclass = cdolist_list_var.first();
    }
    return dict;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 18142L)
  public static SubLObject rdf_graph_count_instances(final SubLObject v_graph, final SubLObject collection)
  {
    assert NIL != fort_or_rdf_uri_p( collection ) : collection;
    final SubLObject collection_class = ( NIL != rdf_uri.rdf_uri_p( collection ) ) ? collection : rdf_graph_uri_for_fort( v_graph, collection );
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = rdf_graph_subclasses( v_graph, collection_class, T );
    SubLObject subclass = NIL;
    subclass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, rdf_graph_object_triple_count( v_graph, subclass, rdf_utilities.rdf_expanded_name( $str16$type ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      subclass = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 18562L)
  public static SubLObject rdf_graph_subclasses(final SubLObject v_graph, final SubLObject collection, SubLObject transitiveP)
  {
    if( transitiveP == UNPROVIDED )
    {
      transitiveP = T;
    }
    assert NIL != fort_or_rdf_uri_p( collection ) : collection;
    final SubLObject collection_class = ( NIL != rdf_uri.rdf_uri_p( collection ) ) ? collection : rdf_graph_uri_for_fort( v_graph, collection );
    if( NIL != transitiveP )
    {
      return set.set_element_list( rdf_graph_gather_subclasses_transitive( v_graph, collection_class, UNPROVIDED ) );
    }
    return Sequences.delete_duplicates( ConsesLow.cons( collection_class, rdf_graph_find_subjects( v_graph, rdf_utilities.rdfs_expanded_name( $str24$subClassOf ), collection_class ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 19077L)
  public static SubLObject rdf_graph_gather_subclasses_transitive(final SubLObject v_graph, final SubLObject collection_class, SubLObject collector)
  {
    if( collector == UNPROVIDED )
    {
      collector = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    if( NIL != set.set_add( collection_class, collector ) )
    {
      SubLObject cdolist_list_var = rdf_graph_subclasses( v_graph, collection_class, NIL );
      SubLObject subclass = NIL;
      subclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        rdf_graph_gather_subclasses_transitive( v_graph, subclass, collector );
        cdolist_list_var = cdolist_list_var.rest();
        subclass = cdolist_list_var.first();
      }
    }
    return collector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 19496L)
  public static SubLObject rdf_graph_triple_count(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return set.set_size( rdf_graph_triples( v_graph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 19622L)
  public static SubLObject rdf_graph_empty_p(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return Equality.eql( ZERO_INTEGER, rdf_graph_triple_count( v_graph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 19745L)
  public static SubLObject rdf_graph_do_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node = NIL;
    SubLObject v_graph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    v_graph = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym26$WITH_READER_LOCK, ConsesLow.list( ConsesLow.list( $sym27$GET_RDF_GRAPH_LOCK, v_graph ) ), ConsesLow.listS( $sym28$DO_ITERATOR, ConsesLow.list( node, ConsesLow.list(
          $sym29$RDF_GRAPH_NODE_ITERATOR, v_graph ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 19937L)
  public static SubLObject get_rdf_graph_lock(final SubLObject v_graph)
  {
    return rdf_graph_lock( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 20048L)
  public static SubLObject rdf_graph_node_iterator(final SubLObject v_graph)
  {
    return iteration.new_iterator( make_rdf_graph_nodes_iterator_state( rdf_graph_nodes( v_graph ) ), $sym31$ITERATE_RDF_GRAPH_NODES_DONE, $sym32$ITERATE_RDF_GRAPH_NODES_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 20292L)
  public static SubLObject make_rdf_graph_nodes_iterator_state(final SubLObject graph_nodes)
  {
    return ConsesLow.cons( NIL, dictionary.new_dictionary_iterator( graph_nodes ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 20416L)
  public static SubLObject iterate_rdf_graph_nodes_done(final SubLObject state)
  {
    return makeBoolean( NIL != list_utilities.empty_list_p( state.first() ) && NIL != iteration.iteration_done( state.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 20556L)
  public static SubLObject iterate_rdf_graph_nodes_next(final SubLObject state)
  {
    SubLObject next = NIL;
    if( NIL != list_utilities.non_empty_list_p( state.first() ) )
    {
      next = state.first().first();
      ConsesLow.rplaca( state, state.first().rest() );
    }
    else
    {
      final SubLObject next_value = conses_high.second( iteration.iteration_next( state.rest() ) );
      if( next_value.isList() )
      {
        ConsesLow.rplaca( state, next_value.rest() );
        next = next_value.first();
      }
      else
      {
        next = next_value;
      }
    }
    return Values.values( next, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 20987L)
  public static SubLObject dump_rdf_graph_to_n_triples(final SubLObject v_graph, final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != Types.stringp( filename ) : filename;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != file_utilities.file_existsP( filename ) )
    {
      Errors.error( $str33$_S_already_exists_, filename );
    }
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw34$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str35$Unable_to_open__S, filename );
      }
      final SubLObject stream_$4 = stream;
      final SubLObject set_var = rdf_graph_triples( v_graph );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( Sequences.cconcatenate( $str36$Dumping_RDF_graph_to_, new SubLObject[] { format_nil.format_nil_s_no_copy( filename ), $str37$___
        } ), thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( set.set_size( set_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject triple;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
              .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            triple = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, triple ) )
            {
              rdf_n_triples_writer.write_n_triple( triple, stream_$4 );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_8, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 21403L)
  public static SubLObject do_loaded_rdf_graphs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_graph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    v_graph = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$6, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw40$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw41$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym26$WITH_READER_LOCK, $list42, ConsesLow.listS( $sym28$DO_ITERATOR, ConsesLow.list( v_graph, $list43, $kw41$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 21599L)
  public static SubLObject loaded_rdf_graphs()
  {
    return iteration.new_list_iterator( $loaded_rdf_graphs$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 21723L)
  public static SubLObject rdf_graph_do_subjects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subject = NIL;
    SubLObject v_graph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    subject = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    v_graph = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list46 );
      if( NIL == conses_high.member( current_$7, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw40$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw41$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject triple = $sym47$TRIPLE;
    final SubLObject done_subjects = $sym48$DONE_SUBJECTS;
    return ConsesLow.list( $sym49$CLET, ConsesLow.list( reader.bq_cons( done_subjects, $list50 ) ), ConsesLow.list( $sym28$DO_ITERATOR, ConsesLow.list( triple, ConsesLow.list( $sym51$RDF_GRAPH_TRIPLES_ITERATOR,
        v_graph ), $kw41$DONE, done ), ConsesLow.list( $sym49$CLET, ConsesLow.list( ConsesLow.list( subject, ConsesLow.list( $sym52$RDF_TRIPLE_SUBJECT, triple ) ) ), ConsesLow.listS( $sym53$PWHEN, ConsesLow.list(
            $sym54$SET_ADD, subject, done_subjects ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 22080L)
  public static SubLObject rdf_graph_subject_count(final SubLObject v_graph, SubLObject omit_blank_nodesP)
  {
    if( omit_blank_nodesP == UNPROVIDED )
    {
      omit_blank_nodesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject done_subjects = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject iterator_var = rdf_graph_triples_iterator( v_graph );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject triple = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        final SubLObject subject = rdf_triple.rdf_triple_subject( triple );
        if( NIL != set.set_add( subject, done_subjects ) && ( NIL == omit_blank_nodesP || NIL == rdf_blank_node.rdf_blank_node_p( subject ) ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 22324L)
  public static SubLObject rdf_graph_do_triples(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject triple = NIL;
    SubLObject v_graph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    triple = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    v_graph = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      if( NIL == conses_high.member( current_$8, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw40$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw41$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym28$DO_ITERATOR, ConsesLow.list( triple, ConsesLow.list( $sym51$RDF_GRAPH_TRIPLES_ITERATOR, v_graph ), $kw41$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 22497L)
  public static SubLObject rdf_graph_for_uri_loadedP(final SubLObject v_rdf_uri)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject loadedP = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = loadedP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != loadedP ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          loadedP = Equality.eql( v_rdf_uri, rdf_graph_topic( v_graph ) );
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return loadedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 22702L)
  public static SubLObject loaded_rdf_graph_count()
  {
    return Sequences.length( $loaded_rdf_graphs$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 22782L)
  public static SubLObject find_or_download_rdf_graph(SubLObject subject_uri)
  {
    if( NIL != web_utilities.uri_p( subject_uri, UNPROVIDED ) )
    {
      subject_uri = rdf_uri.get_rdf_uri( subject_uri, UNPROVIDED, UNPROVIDED );
    }
    assert NIL != rdf_uri.rdf_uri_p( subject_uri ) : subject_uri;
    SubLObject v_graph = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      v_graph = Sequences.find( subject_uri, $loaded_rdf_graphs$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym57$RDF_GRAPH_TOPIC ), UNPROVIDED, UNPROVIDED );
      if( NIL != v_graph )
      {
        note_rdf_graph_accessed( v_graph );
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    if( NIL == v_graph )
    {
      v_graph = download_rdf_graph( subject_uri );
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 23248L)
  public static SubLObject download_rdf_graph(SubLObject subject_uri)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != web_utilities.uri_p( subject_uri, UNPROVIDED ) )
    {
      subject_uri = rdf_uri.get_rdf_uri( subject_uri, UNPROVIDED, UNPROVIDED );
    }
    assert NIL != rdf_uri.rdf_uri_p( subject_uri ) : subject_uri;
    SubLObject v_graph = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw58$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym59$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
          SubLObject needs_to_releaseP = NIL;
          try
          {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
            v_graph = rdf_parser.parse_rdfXxml_from_url( rdf_uri.rdf_uri_utf8_string( subject_uri ), UNPROVIDED );
            if( NIL == rdf_graph_empty_p( v_graph ) )
            {
              note_rdf_graph_loaded( v_graph );
            }
          }
          finally
          {
            if( NIL != needs_to_releaseP )
            {
              ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw58$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 23670L)
  public static SubLObject rdf_graph_ontology_uri(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    final SubLObject all_ontologies = rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str16$type ), owl_utilities.owl_expanded_name( $str60$Ontology ) );
    return ( NIL != list_utilities.singletonP( all_ontologies ) ) ? all_ontologies.first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 23942L)
  public static SubLObject rdf_graphs_with_uri_predicate_triples(final SubLObject v_rdf_uri, final SubLObject arg, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject graphs = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          if( arg.eql( ONE_INTEGER ) )
          {
            if( NIL != list_utilities.sublisp_boolean( rdf_graph_find_objects( v_graph, v_rdf_uri, predicate ) ) )
            {
              graphs = ConsesLow.cons( v_graph, graphs );
            }
          }
          else if( arg.eql( TWO_INTEGER ) && NIL != list_utilities.sublisp_boolean( rdf_graph_find_subjects( v_graph, predicate, v_rdf_uri ) ) )
          {
            graphs = ConsesLow.cons( v_graph, graphs );
          }
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return graphs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 24313L)
  public static SubLObject rdf_predicate_has_uri_objectsP(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject found_oneP = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = found_oneP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != found_oneP ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          final SubLObject set_var = rdf_graph_find_triples( v_graph, predicate, $kw11$PREDICATE );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject triple;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == found_oneP
              && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            triple = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, triple ) )
            {
              found_oneP = rdf_uri.rdf_uri_p( rdf_triple.rdf_triple_object( triple ) );
            }
          }
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return found_oneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 24626L)
  public static SubLObject count_triples_for_uri(final SubLObject v_rdf_uri, SubLObject position)
  {
    if( position == UNPROVIDED )
    {
      position = $kw61$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          if( position == $kw61$ALL || position == $kw8$SUBJECT )
          {
            count = Numbers.add( count, rdf_graph_subject_triple_count( v_graph, v_rdf_uri, UNPROVIDED ) );
          }
          if( position == $kw61$ALL || position == $kw11$PREDICATE )
          {
            count = Numbers.add( count, rdf_graph_predicate_triple_count( v_graph, v_rdf_uri ) );
          }
          if( position == $kw61$ALL || position == $kw9$OBJECT )
          {
            count = Numbers.add( count, rdf_graph_object_triple_count( v_graph, v_rdf_uri, UNPROVIDED ) );
          }
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 25217L)
  public static SubLObject rdf_graph_get_uri_from_two_parts(final SubLObject v_graph, final SubLObject start, final SubLObject end)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject base_uri = rdf_uri.rdf_uri_parts_from_two_parts( start, end );
    final SubLObject connector = thread.secondMultipleValue();
    final SubLObject local_part = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return rdf_graph_get_uri( v_graph, base_uri, connector, local_part );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 25497L)
  public static SubLObject note_rdf_graph_accessed(final SubLObject v_rdf_graph)
  {
    $loaded_rdf_graphs$.setGlobalValue( ConsesLow.cons( v_rdf_graph, Sequences.delete( v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    return $loaded_rdf_graphs$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 25669L)
  public static SubLObject note_rdf_graph_loaded(final SubLObject v_rdf_graph)
  {
    $loaded_rdf_graphs$.setGlobalValue( ConsesLow.cons( v_rdf_graph, Sequences.delete( v_rdf_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    possibly_cull_loaded_rdf_graphs();
    return $loaded_rdf_graphs$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 25875L)
  public static SubLObject remove_from_loaded_rdf_graphs(final SubLObject v_graph)
  {
    $loaded_rdf_graphs$.setGlobalValue( Sequences.delete( v_graph, $loaded_rdf_graphs$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return $loaded_rdf_graphs$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 26026L)
  public static SubLObject qname_for_uri(final SubLObject v_rdf_uri)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject qname = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = qname; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != qname ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          qname = rdf_graph_qname_for_uri( v_graph, v_rdf_uri );
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return qname;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 26320L)
  public static SubLObject possibly_cull_loaded_rdf_graphs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( loaded_rdf_graph_count().numG( ONE_INTEGER ) )
    {
      SubLObject triple_count = ZERO_INTEGER;
      final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
      SubLObject needs_to_releaseP = NIL;
      try
      {
        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
        final SubLObject rw_lock_var_$9 = $loaded_rdf_graphs_lock$.getGlobalValue();
        SubLObject needs_to_releaseP_$10 = NIL;
        try
        {
          needs_to_releaseP_$10 = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var_$9 );
          final SubLObject iterator_var = loaded_rdf_graphs();
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_graph = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              triple_count = Numbers.add( triple_count, rdf_graph_triple_count( v_graph ) );
            }
          }
        }
        finally
        {
          if( NIL != needs_to_releaseP_$10 )
          {
            ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var_$9 );
          }
        }
        while ( triple_count.numG( $target_max_loaded_rdf_triple_count$.getGlobalValue() ) && loaded_rdf_graph_count().numG( ONE_INTEGER ))
        {
          final SubLObject doomed = list_utilities.last_one( $loaded_rdf_graphs$.getGlobalValue() );
          triple_count = Numbers.subtract( triple_count, rdf_graph_triple_count( doomed ) );
          remove_from_loaded_rdf_graphs( doomed );
        }
      }
      finally
      {
        if( NIL != needs_to_releaseP )
        {
          ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27118L)
  public static SubLObject next_rdf_blank_node_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $rdf_blank_node_isg$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27225L)
  public static SubLObject clear_rdf_graph_get_blank_node_cached()
  {
    final SubLObject cs = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27225L)
  public static SubLObject remove_rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue(), ConsesLow.list( v_graph, id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27225L)
  public static SubLObject rdf_graph_get_blank_node_cached_internal(final SubLObject v_graph, final SubLObject id)
  {
    final SubLObject new_node = rdf_blank_node.new_rdf_blank_node( id );
    final SubLObject found_node = rdf_graph_nodes_lookup( v_graph, new_node );
    return ( NIL != found_node ) ? found_node : new_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27225L)
  public static SubLObject rdf_graph_get_blank_node_cached(final SubLObject v_graph, final SubLObject id)
  {
    SubLObject caching_state = $rdf_graph_get_blank_node_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym64$RDF_GRAPH_GET_BLANK_NODE_CACHED, $sym65$_RDF_GRAPH_GET_BLANK_NODE_CACHED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_graph, id );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_graph.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && id.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rdf_graph_get_blank_node_cached_internal( v_graph, id ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_graph, id ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27466L)
  public static SubLObject clear_rdf_graph_get_literal_cached()
  {
    final SubLObject cs = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27466L)
  public static SubLObject remove_rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rdf_graph_get_literal_cached_caching_state$.getGlobalValue(), ConsesLow.list( v_graph, utf8_lexical_form, language_tag, datatype ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27466L)
  public static SubLObject rdf_graph_get_literal_cached_internal(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype)
  {
    final SubLObject new_node = rdf_literal.new_rdf_literal( utf8_lexical_form, language_tag, datatype );
    final SubLObject found_node = rdf_graph_nodes_lookup( v_graph, new_node );
    return ( NIL != found_node ) ? found_node : new_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27466L)
  public static SubLObject rdf_graph_get_literal_cached(final SubLObject v_graph, final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype)
  {
    SubLObject caching_state = $rdf_graph_get_literal_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym66$RDF_GRAPH_GET_LITERAL_CACHED, $sym67$_RDF_GRAPH_GET_LITERAL_CACHED_CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( v_graph, utf8_lexical_form, language_tag, datatype );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_graph.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( utf8_lexical_form.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( language_tag.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && datatype.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rdf_graph_get_literal_cached_internal( v_graph, utf8_lexical_form, language_tag, datatype ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_graph, utf8_lexical_form, language_tag, datatype ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 27781L)
  public static SubLObject rdf_graph_find_or_create_rdf_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    final SubLObject found = rdf_graph_find_triple( v_graph, subject, predicate, v_object );
    return Values.values( ( NIL != found ) ? found : rdf_triple.new_rdf_triple( subject, predicate, v_object ), Types.sublisp_null( found ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 28197L)
  public static SubLObject rdf_graph_find_triple(final SubLObject v_graph, SubLObject subject, SubLObject predicate, SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    if( NIL != web_utilities.uri_p( subject, UNPROVIDED ) )
    {
      subject = rdf_graph_get_uri( v_graph, subject, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != web_utilities.uri_p( predicate, UNPROVIDED ) )
    {
      predicate = rdf_graph_get_uri( v_graph, predicate, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != web_utilities.uri_p( v_object, UNPROVIDED ) )
    {
      v_object = rdf_graph_get_uri( v_graph, v_object, UNPROVIDED, UNPROVIDED );
    }
    SubLObject triple = NIL;
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      triple = rdf_graph_index_find_triple( rdf_graph_index( v_graph ), subject, predicate, v_object, UNPROVIDED );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return triple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 28862L)
  public static SubLObject rdf_graph_find_equivalent_triple(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( subject ) : subject;
    assert NIL != valid_rdf_predicate_p( predicate ) : predicate;
    assert NIL != valid_rdf_object_p( v_object ) : v_object;
    final SubLObject c_subject = canonicalize_rdf_triple_argument( subject, v_graph );
    final SubLObject c_predicate = canonicalize_rdf_triple_argument( predicate, v_graph );
    final SubLObject c_object = canonicalize_rdf_triple_argument( v_object, v_graph );
    SubLObject triple = NIL;
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      triple = rdf_graph_index_find_triple( rdf_graph_index( v_graph ), c_subject, c_predicate, c_object, T );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return triple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 29492L)
  public static SubLObject canonicalize_rdf_triple_argument(final SubLObject arg, final SubLObject v_graph)
  {
    SubLObject canonical = arg;
    if( NIL != rdf_uri.rdf_uri_p( arg ) )
    {
      canonical = rdf_uri.rdf_uri_utf8_string( arg );
    }
    if( canonical.isString() )
    {
      canonical = rdf_graph_get_uri( v_graph, canonical, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != rdf_literal.rdf_literal_p( arg ) )
    {
      final SubLObject datatype = rdf_literal.rdf_literal_datatype( arg );
      final SubLObject lexical_form = ( NIL != xml_literal_datatype_p( datatype ) ) ? rdf_utilities.rdf_canonicalize_xml_string( rdf_literal.rdf_literal_utf8_lexical_form( arg ) )
          : rdf_literal.rdf_literal_utf8_lexical_form( arg );
      canonical = rdf_graph_get_literal( v_graph, lexical_form, rdf_literal.rdf_literal_language_tag( arg ), datatype );
    }
    return canonical;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 30148L)
  public static SubLObject xml_literal_datatype_p(final SubLObject datatype)
  {
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && rdf_utilities.rdf_expanded_name( $str68$XMLLiteral ).equal( rdf_uri.rdf_uri_utf8_string( datatype ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 30314L)
  public static SubLObject rdf_graph_find_values(final SubLObject v_graph, SubLObject node, SubLObject position, SubLObject other_node, SubLObject other_position)
  {
    if( other_node == UNPROVIDED )
    {
      other_node = NIL;
    }
    if( other_position == UNPROVIDED )
    {
      other_position = NIL;
    }
    SubLObject values = NIL;
    if( NIL != web_utilities.uri_p( node, UNPROVIDED ) )
    {
      node = rdf_graph_get_uri( v_graph, node, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != web_utilities.uri_p( other_node, UNPROVIDED ) )
    {
      other_node = rdf_graph_get_uri( v_graph, other_node, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      values = rdf_graph_index_find_values( rdf_graph_index( v_graph ), node, position, other_node, other_position );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 30781L)
  public static SubLObject rdf_graph_find_triples(final SubLObject v_graph, SubLObject node, SubLObject position)
  {
    SubLObject triples = NIL;
    if( NIL != web_utilities.uri_p( node, UNPROVIDED ) )
    {
      node = rdf_graph_get_uri( v_graph, node, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject rw_lock_var = rdf_graph_lock( v_graph );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      triples = rdf_graph_index_find_triples( rdf_graph_index( v_graph ), node, position );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 31095L)
  public static SubLObject rdf_graph_nodes_add(final SubLObject v_graph, final SubLObject node)
  {
    final SubLObject existing = dictionary.dictionary_lookup_without_values( rdf_graph_nodes( v_graph ), node, $kw69$NOT_FOUND );
    SubLObject addedP = NIL;
    if( $kw69$NOT_FOUND == existing )
    {
      dictionary.dictionary_enter( rdf_graph_nodes( v_graph ), node, node );
      addedP = T;
    }
    else if( existing.isList() )
    {
      if( NIL == Sequences.find( node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        dictionary_utilities.dictionary_push( rdf_graph_nodes( v_graph ), node, node );
        addedP = T;
      }
    }
    else if( !existing.eql( node ) )
    {
      dictionary.dictionary_enter( rdf_graph_nodes( v_graph ), node, ConsesLow.list( existing, node ) );
      addedP = T;
    }
    if( NIL != addedP )
    {
      rdf_graph_increment_node_count( v_graph );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 31767L)
  public static SubLObject rdf_graph_nodes_remove(final SubLObject v_graph, final SubLObject node)
  {
    final SubLObject existing = dictionary.dictionary_lookup_without_values( rdf_graph_nodes( v_graph ), node, $kw69$NOT_FOUND );
    SubLObject removedP = NIL;
    if( existing.isList() )
    {
      if( NIL != Sequences.find( node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        dictionary_utilities.dictionary_delete_from_value( rdf_graph_nodes( v_graph ), node, node, UNPROVIDED, UNPROVIDED );
        removedP = T;
      }
    }
    else if( existing.eql( node ) )
    {
      dictionary.dictionary_remove( rdf_graph_nodes( v_graph ), node );
      removedP = T;
    }
    if( NIL != removedP )
    {
      rdf_graph_decrement_node_count( v_graph );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 32294L)
  public static SubLObject rdf_graph_nodes_lookup(final SubLObject v_graph, final SubLObject node)
  {
    final SubLObject existing = dictionary.dictionary_lookup_without_values( rdf_graph_nodes( v_graph ), node, $kw69$NOT_FOUND );
    if( existing.isList() )
    {
      return Sequences.find( node, existing, $sym70$RDF_NODES_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != rdf_nodes_equalP( existing, node ) )
    {
      return existing;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 32612L)
  public static SubLObject rdf_nodes_equalP(final SubLObject node1, final SubLObject node2)
  {
    if( NIL != rdf_blank_node.rdf_blank_node_p( node1 ) && NIL != rdf_blank_node.rdf_blank_node_p( node2 ) )
    {
      return rdf_blank_node.rdf_blank_node_equal_p( node1, node2 );
    }
    if( NIL != rdf_uri.rdf_uri_p( node1 ) && NIL != rdf_uri.rdf_uri_p( node2 ) )
    {
      return rdf_uri.rdf_uri_equal_p( node1, node2 );
    }
    if( NIL != rdf_literal.rdf_literal_p( node1 ) && NIL != rdf_literal.rdf_literal_p( node2 ) )
    {
      return rdf_literal.rdf_literal_equal_p( node1, node2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rdf_graph( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rdf_graph_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_triples(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_nodes(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_index(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_lock(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_node_count(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_prefix_map(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_file_location(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_topic(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject rdf_graph_struct_focal_nodes(final SubLObject v_object)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_triples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_node_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_prefix_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_file_location(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_topic(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject _csetf_rdf_graph_struct_focal_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject make_rdf_graph(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rdf_graph_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw97$TRIPLES ) )
      {
        _csetf_rdf_graph_struct_triples( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$NODES ) )
      {
        _csetf_rdf_graph_struct_nodes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$INDEX ) )
      {
        _csetf_rdf_graph_struct_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$LOCK ) )
      {
        _csetf_rdf_graph_struct_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw101$NODE_COUNT ) )
      {
        _csetf_rdf_graph_struct_node_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw102$PREFIX_MAP ) )
      {
        _csetf_rdf_graph_struct_prefix_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw103$FILE_LOCATION ) )
      {
        _csetf_rdf_graph_struct_file_location( v_new, current_value );
      }
      else if( pcase_var.eql( $kw104$TOPIC ) )
      {
        _csetf_rdf_graph_struct_topic( v_new, current_value );
      }
      else if( pcase_var.eql( $kw105$FOCAL_NODES ) )
      {
        _csetf_rdf_graph_struct_focal_nodes( v_new, current_value );
      }
      else
      {
        Errors.error( $str106$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject visit_defstruct_rdf_graph(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw107$BEGIN, $sym108$MAKE_RDF_GRAPH, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw97$TRIPLES, rdf_graph_struct_triples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw98$NODES, rdf_graph_struct_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw99$INDEX, rdf_graph_struct_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw100$LOCK, rdf_graph_struct_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw101$NODE_COUNT, rdf_graph_struct_node_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw102$PREFIX_MAP, rdf_graph_struct_prefix_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw103$FILE_LOCATION, rdf_graph_struct_file_location( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw104$TOPIC, rdf_graph_struct_topic( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw105$FOCAL_NODES, rdf_graph_struct_focal_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw110$END, $sym108$MAKE_RDF_GRAPH, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 33374L)
  public static SubLObject visit_defstruct_object_rdf_graph_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rdf_graph( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 34035L)
  public static SubLObject print_rdf_graph(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str112$_RDF_GRAPH__A_, ( NIL != rdf_graph_struct_topic( v_object ) ) ? rdf_uri.rdf_uri_utf8_string( rdf_graph_struct_topic( v_object ) ) : rdf_graph_struct_file_location( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 34456L)
  public static SubLObject make_new_rdf_graph()
  {
    final SubLObject v_graph = make_rdf_graph( UNPROVIDED );
    _csetf_rdf_graph_struct_triples( v_graph, set.new_set( $rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED ) );
    _csetf_rdf_graph_struct_nodes( v_graph, dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    _csetf_rdf_graph_struct_index( v_graph, new_rdf_graph_index() );
    _csetf_rdf_graph_struct_lock( v_graph, ReadWriteLocks.new_rw_lock( $str113$RDF_GRAPH ) );
    _csetf_rdf_graph_struct_node_count( v_graph, ZERO_INTEGER );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 34971L)
  public static SubLObject rdf_graph_triples(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_triples( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35103L)
  public static SubLObject rdf_graph_triples_iterator(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return set.new_set_iterator( rdf_graph_struct_triples( v_graph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35287L)
  public static SubLObject rdf_graph_nodes(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_nodes( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35401L)
  public static SubLObject rdf_graph_index(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_index( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35515L)
  public static SubLObject rdf_graph_lock(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_lock( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35627L)
  public static SubLObject rdf_graph_node_count(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_node_count( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35750L)
  public static SubLObject rdf_graph_increment_node_count(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    _csetf_rdf_graph_struct_node_count( v_graph, Numbers.add( rdf_graph_struct_node_count( v_graph ), ONE_INTEGER ) );
    return rdf_graph_struct_node_count( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 35929L)
  public static SubLObject rdf_graph_decrement_node_count(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    _csetf_rdf_graph_struct_node_count( v_graph, Numbers.subtract( rdf_graph_struct_node_count( v_graph ), ONE_INTEGER ) );
    return rdf_graph_struct_node_count( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36108L)
  public static SubLObject rdf_graph_file_location(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_file_location( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36240L)
  public static SubLObject rdf_graph_note_file_location(final SubLObject v_graph, final SubLObject file_location)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != Types.stringp( file_location ) : file_location;
    _csetf_rdf_graph_struct_file_location( v_graph, file_location );
    return file_location;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36466L)
  public static SubLObject rdf_graph_topic(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_topic( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36582L)
  public static SubLObject rdf_graph_note_topic(final SubLObject v_graph, final SubLObject topic)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != rdf_uri.rdf_uri_p( topic ) : topic;
    _csetf_rdf_graph_struct_topic( v_graph, topic );
    return topic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36762L)
  public static SubLObject rdf_graph_focal_nodes(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return rdf_graph_struct_focal_nodes( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 36890L)
  public static SubLObject rdf_graph_note_focal_node(final SubLObject v_graph, final SubLObject focal_node)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    assert NIL != valid_rdf_subject_p( focal_node ) : focal_node;
    SubLObject focal_nodes = rdf_graph_struct_focal_nodes( v_graph );
    focal_nodes = ConsesLow.cons( focal_node, focal_nodes );
    _csetf_rdf_graph_struct_focal_nodes( v_graph, focal_nodes );
    return focal_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 37211L)
  public static SubLObject rdf_graph_prefix_map(final SubLObject v_graph)
  {
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    return conses_high.copy_tree( rdf_graph_struct_prefix_map( v_graph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 37349L)
  public static SubLObject rdf_graph_note_namespace_prefixes(final SubLObject v_graph, final SubLObject attributes)
  {
    SubLObject cdolist_list_var = attributes;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject attribute = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
      attribute = current.first();
      current = ( value = current.rest() );
      if( NIL != string_utilities.starts_with( attribute, $str116$xmlns ) || NIL != Strings.stringE( attribute, $str117$xml_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject prefix = $str116$xmlns.equal( attribute ) ? string_utilities.$empty_string$.getGlobalValue() : string_utilities.pre_remove( attribute, $str118$xmlns_, UNPROVIDED );
        _csetf_rdf_graph_struct_prefix_map( v_graph, list_utilities.alist_enter( rdf_graph_struct_prefix_map( v_graph ), prefix, value, Symbols.symbol_function( EQUAL ) ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return rdf_graph_struct_prefix_map( v_graph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 37829L)
  public static SubLObject rdf_graph_qname_for_uri(final SubLObject v_graph, final SubLObject uri)
  {
    if( NIL == rdf_uri.rdf_uri_p( uri ) && !assertionsDisabledInClass && NIL == web_utilities.uri_p( uri, UNPROVIDED ) )
    {
      throw new AssertionError( uri );
    }
    final SubLObject utf8 = ( NIL != rdf_uri.rdf_uri_p( uri ) ) ? rdf_uri.rdf_uri_utf8_string( uri ) : uri;
    final SubLObject hash_pos = list_utilities.position_from_end( Characters.CHAR_hash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject slash_pos = list_utilities.position_from_end( Characters.CHAR_slash, utf8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject namespace_penult = ( NIL != hash_pos ) ? ( ( NIL != slash_pos ) ? number_utilities.maximum( ConsesLow.list( hash_pos, slash_pos ), UNPROVIDED ) : hash_pos ) : slash_pos;
    final SubLObject namespace = string_utilities.substring( utf8, ZERO_INTEGER, ( NIL != namespace_penult ) ? number_utilities.f_1X( namespace_penult ) : NIL );
    SubLObject prefix = list_utilities.alist_reverse_lookup_without_values( rdf_graph_prefix_map( v_graph ), namespace, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL == prefix )
    {
      prefix = rdf_utilities.rdf_standard_prefix_for_namespace( namespace );
    }
    return ( NIL != prefix && !utf8.equal( namespace ) ) ? ( ( NIL != string_utilities.empty_string_p( prefix ) ) ? string_utilities.pre_remove( utf8, namespace, UNPROVIDED )
        : Sequences.cconcatenate( prefix, new SubLObject[]
        { $str120$_, string_utilities.pre_remove( utf8, namespace, UNPROVIDED )
        } ) ) : rdf_uri.rdf_uri_utf8_string( uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 38690L)
  public static SubLObject rdf_graph_get_label(final SubLObject v_graph, final SubLObject v_rdf_uri)
  {
    SubLObject label = NIL;
    if( NIL == label )
    {
      SubLObject csome_list_var;
      SubLObject predicate;
      for( csome_list_var = rdf_utilities.rdf_label_properties( NIL ), predicate = NIL, predicate = csome_list_var.first(); NIL == label && NIL != csome_list_var; label = Sequences.find( $str121$en,
          rdf_graph_find_objects( v_graph, v_rdf_uri, predicate ), Symbols.symbol_function( EQUAL ), $sym122$RDF_LITERAL_LANGUAGE_TAG, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var
              .rest(), predicate = csome_list_var.first() )
      {
      }
    }
    return ( NIL != label ) ? rdf_literal.rdf_literal_utf8_lexical_form( label ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 39003L)
  public static SubLObject rdf_graph_get_labels(final SubLObject v_graph, final SubLObject v_rdf_uri, SubLObject language_tag, SubLObject max_number)
  {
    if( language_tag == UNPROVIDED )
    {
      language_tag = NIL;
    }
    if( max_number == UNPROVIDED )
    {
      max_number = NIL;
    }
    SubLObject labels = NIL;
    SubLObject doneP = makeBoolean( NIL != max_number && NIL != list_utilities.lengthGE( labels, max_number, UNPROVIDED ) );
    if( NIL == doneP )
    {
      SubLObject csome_list_var = rdf_utilities.rdf_label_properties( T );
      SubLObject predicate = NIL;
      predicate = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL == doneP )
        {
          SubLObject csome_list_var_$11 = rdf_graph_find_objects( v_graph, v_rdf_uri, predicate );
          SubLObject label = NIL;
          label = csome_list_var_$11.first();
          while ( NIL == doneP && NIL != csome_list_var_$11)
          {
            if( NIL == language_tag || NIL == rdf_literal.rdf_literal_language_tag( label ) || language_tag.equal( rdf_literal.rdf_literal_language_tag( label ) ) )
            {
              final SubLObject item_var = rdf_literal.rdf_literal_cyc_string( label );
              if( NIL == conses_high.member( item_var, labels, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                labels = ConsesLow.cons( item_var, labels );
              }
              doneP = makeBoolean( NIL != max_number && NIL != list_utilities.lengthGE( labels, max_number, UNPROVIDED ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 39578L)
  public static SubLObject rdf_uris_matching_label(final SubLObject label, SubLObject exactP)
  {
    if( exactP == UNPROVIDED )
    {
      exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject uris = NIL;
    final SubLObject rw_lock_var = $loaded_rdf_graphs_lock$.getGlobalValue();
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      final SubLObject iterator_var = loaded_rdf_graphs();
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_graph = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject cdolist_list_var = rdf_graph_get_uris_matching_label( v_graph, label, exactP );
          SubLObject uri = NIL;
          uri = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var = uri;
            if( NIL == conses_high.member( item_var, uris, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              uris = ConsesLow.cons( item_var, uris );
            }
            cdolist_list_var = cdolist_list_var.rest();
            uri = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return uris;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 39813L)
  public static SubLObject rdf_graph_get_uris_matching_label(final SubLObject v_graph, final SubLObject label, SubLObject exactP)
  {
    if( exactP == UNPROVIDED )
    {
      exactP = NIL;
    }
    SubLObject uris = NIL;
    SubLObject cdolist_list_var = rdf_utilities.rdf_label_properties( T );
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$12 = rdf_graph_find_predicate_triples( v_graph, predicate );
      SubLObject triple = NIL;
      triple = cdolist_list_var_$12.first();
      while ( NIL != cdolist_list_var_$12)
      {
        final SubLObject v_object = rdf_triple.rdf_triple_object( triple );
        final SubLObject this_label = ( NIL != rdf_literal.rdf_literal_p( v_object ) ) ? rdf_literal.rdf_literal_cyc_string( v_object ) : NIL;
        if( NIL != this_label && NIL != ( ( NIL != exactP ) ? Equality.equal( this_label, label ) : unicode_nauts.unicode_substringP( label, this_label, NIL ) ) )
        {
          final SubLObject item_var = rdf_triple.rdf_triple_subject( triple );
          if( NIL == conses_high.member( item_var, uris, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            uris = ConsesLow.cons( item_var, uris );
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

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 40372L)
  public static SubLObject rdf_labels_for_term(final SubLObject v_term, SubLObject language_tag, SubLObject max_number, SubLObject external_onlyP)
  {
    if( language_tag == UNPROVIDED )
    {
      language_tag = NIL;
    }
    if( max_number == UNPROVIDED )
    {
      max_number = NIL;
    }
    if( external_onlyP == UNPROVIDED )
    {
      external_onlyP = NIL;
    }
    SubLObject labels = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = rdf_utilities.rdf_uris_for_cyc_term( v_term, NIL, external_onlyP );
      SubLObject subject_uri = NIL;
      subject_uri = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != string_utilities.starts_with( subject_uri, $str123$http ) )
        {
          final SubLObject v_graph = find_or_download_rdf_graph( subject_uri );
          if( NIL != rdf_graph_p( v_graph ) && NIL == doneP )
          {
            SubLObject csome_list_var_$13 = rdf_graph_get_labels( v_graph, subject_uri, language_tag, UNPROVIDED );
            SubLObject label = NIL;
            label = csome_list_var_$13.first();
            while ( NIL == doneP && NIL != csome_list_var_$13)
            {
              final SubLObject item_var = label;
              if( NIL == conses_high.member( item_var, labels, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                labels = ConsesLow.cons( item_var, labels );
              }
              doneP = makeBoolean( NIL != max_number && NIL != list_utilities.lengthGE( labels, max_number, UNPROVIDED ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 40924L)
  public static SubLObject sxhash_rdf_graph_method(final SubLObject v_object)
  {
    return sxhash_rdf_graph( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41033L)
  public static SubLObject sxhash_rdf_graph(final SubLObject v_graph)
  {
    return Sxhash.sxhash( rdf_graph_struct_triples( v_graph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41240L)
  public static SubLObject rdf_graph_index_add(final SubLObject index, final SubLObject triple)
  {
    SubLObject sub_index = NIL;
    SubLObject sub_index_$14 = NIL;
    SubLObject key = NIL;
    SubLObject key_$15 = NIL;
    sub_index = rdf_graph_index_sub_indexes( index );
    sub_index_$14 = sub_index.first();
    key = rdf_triple.rdf_triple_args( triple );
    key_$15 = key.first();
    while ( NIL != key || NIL != sub_index)
    {
      rdf_graph_sub_index_add( sub_index_$14, key_$15, triple );
      sub_index = sub_index.rest();
      sub_index_$14 = sub_index.first();
      key = key.rest();
      key_$15 = key.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41465L)
  public static SubLObject rdf_graph_sub_index_add(final SubLObject sub_index, final SubLObject key, final SubLObject triple)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rdf_graph_literal_indexing_enabledP$.getDynamicValue( thread ) || NIL == rdf_literal.rdf_literal_p( key ) )
    {
      SubLObject triples = dictionary.dictionary_lookup_without_values( sub_index, key, NIL );
      if( NIL == set.set_p( triples ) )
      {
        triples = set.new_set( $rdf_graph_internal_triple_comparison_test$.getGlobalValue(), UNPROVIDED );
        dictionary.dictionary_enter( sub_index, key, triples );
      }
      return set.set_add( triple, triples );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41875L)
  public static SubLObject clear_rdf_graph_index_sub_indexes()
  {
    final SubLObject cs = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41875L)
  public static SubLObject remove_rdf_graph_index_sub_indexes(final SubLObject graph_index)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue(), ConsesLow.list( graph_index ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41875L)
  public static SubLObject rdf_graph_index_sub_indexes_internal(final SubLObject graph_index)
  {
    return ConsesLow.list( rdf_graph_index_subject_index( graph_index ), rdf_graph_index_predicate_index( graph_index ), rdf_graph_index_object_index( graph_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 41875L)
  public static SubLObject rdf_graph_index_sub_indexes(final SubLObject graph_index)
  {
    SubLObject caching_state = $rdf_graph_index_sub_indexes_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym125$RDF_GRAPH_INDEX_SUB_INDEXES, $sym126$_RDF_GRAPH_INDEX_SUB_INDEXES_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, graph_index, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rdf_graph_index_sub_indexes_internal( graph_index ) ) );
      memoization_state.caching_state_put( caching_state, graph_index, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 42130L)
  public static SubLObject rdf_graph_index_remove(final SubLObject index, final SubLObject triple)
  {
    rdf_graph_subject_index_remove( rdf_graph_index_subject_index( index ), triple );
    rdf_graph_predicate_index_remove( rdf_graph_index_predicate_index( index ), triple );
    rdf_graph_object_index_remove( rdf_graph_index_object_index( index ), triple );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 42440L)
  public static SubLObject rdf_graph_subject_index_remove(final SubLObject subject_index, final SubLObject triple)
  {
    final SubLObject subject = rdf_triple.rdf_triple_subject( triple );
    final SubLObject triples = dictionary.dictionary_lookup_without_values( subject_index, subject, NIL );
    return ( NIL != set.set_p( triples ) ) ? set.set_remove( triple, triples ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 42696L)
  public static SubLObject rdf_graph_predicate_index_remove(final SubLObject predicate_index, final SubLObject triple)
  {
    final SubLObject predicate = rdf_triple.rdf_triple_predicate( triple );
    final SubLObject triples = dictionary.dictionary_lookup_without_values( predicate_index, predicate, NIL );
    return ( NIL != set.set_p( triples ) ) ? set.set_remove( triple, triples ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 42964L)
  public static SubLObject rdf_graph_object_index_remove(final SubLObject object_index, final SubLObject triple)
  {
    final SubLObject v_object = rdf_triple.rdf_triple_object( triple );
    final SubLObject triples = dictionary.dictionary_lookup_without_values( object_index, v_object, NIL );
    return ( NIL != set.set_p( triples ) ) ? set.set_remove( triple, triples ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 43214L)
  public static SubLObject rdf_graph_index_find_triple(final SubLObject graph_index, final SubLObject subject, final SubLObject predicate, final SubLObject v_object, SubLObject permissive_blank_node_matchingP)
  {
    if( permissive_blank_node_matchingP == UNPROVIDED )
    {
      permissive_blank_node_matchingP = NIL;
    }
    final SubLObject subject_index_count = rdf_graph_index_subject_index_count( graph_index, subject );
    final SubLObject predicate_index_count = rdf_graph_index_predicate_index_count( graph_index, predicate );
    final SubLObject object_index_count = rdf_graph_index_object_index_count( graph_index, v_object );
    if( subject_index_count.numLE( predicate_index_count ) && ( NIL != rdf_literal.rdf_literal_p( v_object ) || subject_index_count.numLE( object_index_count ) ) && ( NIL == permissive_blank_node_matchingP
        || NIL == rdf_blank_node.rdf_blank_node_p( subject ) ) )
    {
      return rdf_graph_index_find( rdf_graph_index_subject_index( graph_index ), subject, subject, predicate, v_object, permissive_blank_node_matchingP );
    }
    if( NIL == rdf_literal.rdf_literal_p( v_object ) && object_index_count.numLE( predicate_index_count ) && ( NIL == permissive_blank_node_matchingP || NIL == rdf_blank_node.rdf_blank_node_p( v_object ) ) )
    {
      return rdf_graph_index_find( rdf_graph_index_object_index( graph_index ), v_object, subject, predicate, v_object, permissive_blank_node_matchingP );
    }
    if( NIL == permissive_blank_node_matchingP || NIL == rdf_blank_node.rdf_blank_node_p( predicate ) )
    {
      return rdf_graph_index_find( rdf_graph_index_predicate_index( graph_index ), predicate, subject, predicate, v_object, permissive_blank_node_matchingP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 44637L)
  public static SubLObject rdf_graph_index_find_triples(final SubLObject graph_index, final SubLObject node, SubLObject position)
  {
    assert NIL != rdf_triple.rdf_triple_position_p( position ) : position;
    SubLObject triples = NIL;
    if( position.eql( $kw8$SUBJECT ) )
    {
      triples = dictionary.dictionary_lookup_without_values( rdf_graph_index_subject_index( graph_index ), node, UNPROVIDED );
    }
    else if( position.eql( $kw11$PREDICATE ) )
    {
      triples = dictionary.dictionary_lookup_without_values( rdf_graph_index_predicate_index( graph_index ), node, UNPROVIDED );
    }
    else if( position.eql( $kw9$OBJECT ) )
    {
      triples = dictionary.dictionary_lookup_without_values( rdf_graph_index_object_index( graph_index ), node, UNPROVIDED );
    }
    return ( NIL != triples ) ? triples : set.new_set( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 45269L)
  public static SubLObject rdf_graph_index_find_values(final SubLObject graph_index, final SubLObject node, SubLObject position, final SubLObject other_node, final SubLObject other_position)
  {
    final SubLObject index_count = rdf_graph_index_sub_index_count( graph_index, node, position );
    final SubLObject other_index_count = rdf_graph_index_sub_index_count( graph_index, other_node, other_position );
    if( index_count.numLE( other_index_count ) )
    {
      final SubLObject triples = rdf_graph_index_find_triples( graph_index, node, position );
      SubLObject values = NIL;
      final SubLObject set_contents_var = set.do_set_internal( triples );
      SubLObject basis_object;
      SubLObject state;
      SubLObject triple;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        triple = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && other_node.eql( rdf_triple.rdf_triple_arg( triple, other_position ) ) )
        {
          item_var = rdf_triple.rdf_triple_remaining_arg( triple, position, other_position );
          if( NIL == conses_high.member( item_var, values, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            values = ConsesLow.cons( item_var, values );
          }
        }
      }
      return values;
    }
    final SubLObject triples = rdf_graph_index_find_triples( graph_index, other_node, other_position );
    SubLObject values = NIL;
    final SubLObject set_contents_var = set.do_set_internal( triples );
    SubLObject basis_object;
    SubLObject state;
    SubLObject triple;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      triple = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, triple ) && node.eql( rdf_triple.rdf_triple_arg( triple, position ) ) )
      {
        item_var = rdf_triple.rdf_triple_remaining_arg( triple, position, other_position );
        if( NIL == conses_high.member( item_var, values, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          values = ConsesLow.cons( item_var, values );
        }
      }
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 46187L)
  public static SubLObject rdf_graph_index_sub_index_count(final SubLObject graph_index, final SubLObject node, SubLObject position)
  {
    final SubLObject sub_index = rdf_graph_index_get_sub_index( graph_index, position );
    final SubLObject triples = dictionary.dictionary_lookup_without_values( sub_index, node, NIL );
    return ( NIL != set.set_p( triples ) ) ? set.set_size( triples ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 46460L)
  public static SubLObject rdf_graph_index_get_sub_index(final SubLObject graph_index, SubLObject position)
  {
    assert NIL != rdf_triple.rdf_triple_position_p( position ) : position;
    if( position.eql( $kw8$SUBJECT ) )
    {
      return rdf_graph_index_subject_index( graph_index );
    }
    if( position.eql( $kw11$PREDICATE ) )
    {
      return rdf_graph_index_predicate_index( graph_index );
    }
    if( position.eql( $kw9$OBJECT ) )
    {
      return rdf_graph_index_object_index( graph_index );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 46808L)
  public static SubLObject rdf_graph_index_subject_index_count(final SubLObject graph_index, final SubLObject subject)
  {
    return rdf_graph_index_sub_index_count( graph_index, subject, $kw8$SUBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 46955L)
  public static SubLObject rdf_graph_index_predicate_index_count(final SubLObject graph_index, final SubLObject predicate)
  {
    return rdf_graph_index_sub_index_count( graph_index, predicate, $kw11$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 47110L)
  public static SubLObject rdf_graph_index_object_index_count(final SubLObject graph_index, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rdf_graph_literal_indexing_enabledP$.getDynamicValue( thread ) && NIL != rdf_literal.rdf_literal_p( v_object ) )
    {
      final SubLObject triples = Functions.apply( $sym128$APPEND, Mapping.mapcar( $sym129$SET_ELEMENT_LIST, dictionary.dictionary_values( rdf_graph_index_object_index( graph_index ) ) ) );
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = triples;
      SubLObject triple = NIL;
      triple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != rdf_nodes_equalP( v_object, rdf_triple.rdf_triple_object( triple ) ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        triple = cdolist_list_var.first();
      }
      return count;
    }
    return rdf_graph_index_sub_index_count( graph_index, v_object, $kw9$OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 47640L)
  public static SubLObject rdf_graph_index_find(final SubLObject sub_index, final SubLObject key, final SubLObject subject, final SubLObject predicate, final SubLObject v_object,
      SubLObject permissive_blank_node_matchingP)
  {
    if( permissive_blank_node_matchingP == UNPROVIDED )
    {
      permissive_blank_node_matchingP = NIL;
    }
    final SubLObject triples = dictionary.dictionary_lookup_without_values( sub_index, key, NIL );
    SubLObject triple = NIL;
    if( NIL != set.set_p( triples ) )
    {
      final SubLObject set_contents_var = set.do_set_internal( triples );
      SubLObject basis_object;
      SubLObject state;
      SubLObject this_triple;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == triple
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        this_triple = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, this_triple ) && NIL != rdf_graph_nodes_matchP( rdf_triple.rdf_triple_subject( this_triple ), subject, permissive_blank_node_matchingP )
            && NIL != rdf_graph_nodes_matchP( rdf_triple.rdf_triple_predicate( this_triple ), predicate, permissive_blank_node_matchingP ) && NIL != ( ( NIL != rdf_literal.rdf_literal_p( v_object ) ) ? rdf_nodes_equalP(
                rdf_triple.rdf_triple_object( this_triple ), v_object ) : rdf_graph_nodes_matchP( rdf_triple.rdf_triple_object( this_triple ), v_object, permissive_blank_node_matchingP ) ) )
        {
          triple = this_triple;
        }
      }
    }
    return triple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 48395L)
  public static SubLObject rdf_graph_nodes_matchP(final SubLObject node1, final SubLObject node2, SubLObject permissive_blank_node_matchingP)
  {
    if( permissive_blank_node_matchingP == UNPROVIDED )
    {
      permissive_blank_node_matchingP = NIL;
    }
    return makeBoolean( ( NIL != permissive_blank_node_matchingP && NIL != rdf_blank_node.rdf_blank_node_p( node1 ) && NIL != rdf_blank_node.rdf_blank_node_p( node2 ) ) || NIL != Functions.funcall(
        $rdf_graph_internal_node_comparison_test$.getGlobalValue(), node1, node2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 48664L)
  public static SubLObject rdf_graph_index_contains_nodeP(final SubLObject graph_index, final SubLObject node)
  {
    return makeBoolean( rdf_graph_index_subject_index_count( graph_index, node ).isPositive() || rdf_graph_index_predicate_index_count( graph_index, node ).isPositive() || rdf_graph_index_object_index_count( graph_index,
        node ).isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject rdf_graph_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rdf_graph_index( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject rdf_graph_index_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rdf_graph_index_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject rdf_graph_index_struct_subject_index(final SubLObject v_object)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject rdf_graph_index_struct_predicate_index(final SubLObject v_object)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject rdf_graph_index_struct_object_index(final SubLObject v_object)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject _csetf_rdf_graph_index_struct_subject_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject _csetf_rdf_graph_index_struct_predicate_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject _csetf_rdf_graph_index_struct_object_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_graph_index_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject make_rdf_graph_index(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rdf_graph_index_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw145$SUBJECT_INDEX ) )
      {
        _csetf_rdf_graph_index_struct_subject_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw146$PREDICATE_INDEX ) )
      {
        _csetf_rdf_graph_index_struct_predicate_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw147$OBJECT_INDEX ) )
      {
        _csetf_rdf_graph_index_struct_object_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str106$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject visit_defstruct_rdf_graph_index(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw107$BEGIN, $sym148$MAKE_RDF_GRAPH_INDEX, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw145$SUBJECT_INDEX, rdf_graph_index_struct_subject_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw146$PREDICATE_INDEX, rdf_graph_index_struct_predicate_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw109$SLOT, $kw147$OBJECT_INDEX, rdf_graph_index_struct_object_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw110$END, $sym148$MAKE_RDF_GRAPH_INDEX, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49196L)
  public static SubLObject visit_defstruct_object_rdf_graph_index_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rdf_graph_index( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49373L)
  public static SubLObject print_rdf_graph_index(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str150$_RDF_GRAPH_INDEX_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 49521L)
  public static SubLObject new_rdf_graph_index()
  {
    final SubLObject graph_index = make_rdf_graph_index( UNPROVIDED );
    _csetf_rdf_graph_index_struct_subject_index( graph_index, dictionary.new_dictionary( $rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED ) );
    _csetf_rdf_graph_index_struct_predicate_index( graph_index, dictionary.new_dictionary( $rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED ) );
    _csetf_rdf_graph_index_struct_object_index( graph_index, dictionary.new_dictionary( $rdf_graph_internal_node_comparison_test$.getGlobalValue(), UNPROVIDED ) );
    return graph_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50016L)
  public static SubLObject rdf_graph_index_subject_index(final SubLObject graph_index)
  {
    assert NIL != rdf_graph_index_p( graph_index ) : graph_index;
    return rdf_graph_index_struct_subject_index( graph_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50194L)
  public static SubLObject rdf_graph_index_predicate_index(final SubLObject graph_index)
  {
    assert NIL != rdf_graph_index_p( graph_index ) : graph_index;
    return rdf_graph_index_struct_predicate_index( graph_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50364L)
  public static SubLObject rdf_graph_index_object_index(final SubLObject graph_index)
  {
    assert NIL != rdf_graph_index_p( graph_index ) : graph_index;
    return rdf_graph_index_struct_object_index( graph_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50528L)
  public static SubLObject sxhash_rdf_graph_index_method(final SubLObject v_object)
  {
    return sxhash_rdf_graph_index( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50638L)
  public static SubLObject sxhash_rdf_graph_index(final SubLObject graph_index)
  {
    return Sxhash.sxhash( rdf_graph_index_struct_subject_index( graph_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 50773L)
  public static SubLObject print_rdf_graph_triples_readably(final SubLObject v_graph)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_graph_p( v_graph ) : v_graph;
    SubLObject cdolist_list_var = set.set_element_list( rdf_graph_triples( v_graph ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject predicate_string = owl_utilities.rdf_graph_node_abbreviation_string( v_graph, rdf_triple.rdf_triple_predicate( triple ) );
      final SubLObject subject_string = owl_utilities.rdf_graph_node_abbreviation_string( v_graph, rdf_triple.rdf_triple_subject( triple ) );
      final SubLObject object_string = owl_utilities.rdf_graph_node_abbreviation_string( v_graph, rdf_triple.rdf_triple_object( triple ) );
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str152$______A__A__A___, new SubLObject[] { predicate_string, subject_string, object_string
      } );
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 51561L)
  public static SubLObject rdf_graph_compare(final SubLObject graph1, final SubLObject graph2, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject graph1_triple_count = rdf_graph_triple_count( graph1 );
    final SubLObject graph2_triple_count = rdf_graph_triple_count( graph2 );
    final SubLObject _prev_bind_0 = $graph2_matched_triples$.currentBinding( thread );
    try
    {
      $graph2_matched_triples$.bind( NIL, thread );
      SubLObject graph1_focal_triples = NIL;
      SubLObject graph2_focal_triples = NIL;
      SubLObject graph1_matched_triples = NIL;
      SubLObject iterator_var = rdf_graph_triples_iterator( graph1 );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject triple1 = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid && NIL != subl_promotions.memberP( rdf_triple.rdf_triple_subject( triple1 ), rdf_graph_focal_nodes( graph1 ), $sym70$RDF_NODES_EQUAL_, UNPROVIDED ) )
        {
          graph1_focal_triples = ConsesLow.cons( triple1, graph1_focal_triples );
        }
      }
      iterator_var = rdf_graph_triples_iterator( graph2 );
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject triple2 = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid && NIL != subl_promotions.memberP( rdf_triple.rdf_triple_subject( triple2 ), rdf_graph_focal_nodes( graph2 ), $sym70$RDF_NODES_EQUAL_, UNPROVIDED ) )
        {
          graph2_focal_triples = ConsesLow.cons( triple2, graph2_focal_triples );
        }
      }
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str153$Comparing_graph1___A_triples___A_, graph1_triple_count, rdf_graph_node_count( graph1 ), Sequences.length( graph1_focal_triples ), graph2_triple_count, rdf_graph_node_count(
            graph2 ), Sequences.length( graph2_focal_triples ), UNPROVIDED, UNPROVIDED );
      }
      final SubLObject _prev_bind_0_$16 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$silent_progressP$.bind( makeBoolean( NIL == verboseP ), thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            SubLObject compares_total = Numbers.multiply( Sequences.length( graph1_focal_triples ), Sequences.length( graph2_focal_triples ) );
            SubLObject compare_count = ZERO_INTEGER;
            if( ZERO_INTEGER.numL( compares_total ) )
            {
              final SubLObject _prev_bind_0_$18 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
              final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
              final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
              try
              {
                utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                try
                {
                  utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str154$Comparing_focal_nodes___A_compare, compares_total ) );
                  SubLObject cdolist_list_var = graph1_focal_triples;
                  SubLObject triple3 = NIL;
                  triple3 = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject graph2_triples_left_count = Sequences.length( graph2_focal_triples );
                    SubLObject done_with_triple2P = NIL;
                    if( NIL == done_with_triple2P )
                    {
                      SubLObject csome_list_var = graph2_focal_triples;
                      SubLObject triple4 = NIL;
                      triple4 = csome_list_var.first();
                      while ( NIL == done_with_triple2P && NIL != csome_list_var)
                      {
                        compare_count = Numbers.add( compare_count, ONE_INTEGER );
                        graph2_triples_left_count = Numbers.subtract( graph2_triples_left_count, ONE_INTEGER );
                        utilities_macros.note_percent_progress( compare_count, compares_total );
                        if( NIL == subl_promotions.memberP( triple4, $graph2_matched_triples$.getDynamicValue( thread ), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED ) && NIL != rdf_triples_isomorphicP( graph1, triple3, graph2,
                            triple4 ) )
                        {
                          done_with_triple2P = T;
                          compare_count = Numbers.add( compare_count, graph2_triples_left_count );
                        }
                        csome_list_var = csome_list_var.rest();
                        triple4 = csome_list_var.first();
                      }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    triple3 = cdolist_list_var.first();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                  }
                }
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$18, thread );
              }
            }
            compares_total = Numbers.multiply( rdf_graph_triple_count( graph1 ), rdf_graph_triple_count( graph1 ) );
            compare_count = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$20 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
              utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
              utilities_macros.$within_noting_percent_progress$.bind( T, thread );
              utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
              try
              {
                utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str155$Comparing_all_nodes___A_compares_, compares_total ) );
                final SubLObject iterator_var2 = rdf_graph_triples_iterator( graph1 );
                SubLObject valid2;
                for( SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean( NIL == valid2 ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject triple5 = iteration.iteration_next( iterator_var2 );
                  valid2 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != valid2 )
                  {
                    SubLObject graph2_triples_left_count2 = graph2_triple_count;
                    SubLObject done_with_triple2P2 = NIL;
                    final SubLObject iterator_var_$21 = rdf_graph_triples_iterator( graph2 );
                    SubLObject valid_$23;
                    for( SubLObject done_var_$22 = done_with_triple2P2; NIL == done_var_$22; done_var_$22 = makeBoolean( NIL == valid_$23 || NIL != done_with_triple2P2 ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject triple6 = iteration.iteration_next( iterator_var_$21 );
                      valid_$23 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != valid_$23 && NIL == subl_promotions.memberP( triple6, $graph2_matched_triples$.getDynamicValue( thread ), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED ) )
                      {
                        compare_count = Numbers.add( compare_count, ONE_INTEGER );
                        graph2_triples_left_count2 = Numbers.subtract( graph2_triples_left_count2, ONE_INTEGER );
                        utilities_macros.note_percent_progress( compare_count, compares_total );
                        if( NIL != rdf_triples_isomorphicP( graph1, triple5, graph2, triple6 ) )
                        {
                          graph1_matched_triples = ConsesLow.cons( triple5, graph1_matched_triples );
                          if( NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple6 ) ) )
                          {
                            final SubLObject symmetric_triple = rdf_triple.new_rdf_triple( rdf_triple.rdf_triple_object( triple6 ), rdf_triple.rdf_triple_predicate( triple6 ), rdf_triple.rdf_triple_subject( triple6 ) );
                            if( NIL != subl_promotions.memberP( symmetric_triple, $graph2_matched_triples$.getDynamicValue( thread ), $sym10$RDF_TRIPLES_EQUAL_, UNPROVIDED ) )
                            {
                              $graph2_matched_triples$.setDynamicValue( ConsesLow.cons( triple6, $graph2_matched_triples$.getDynamicValue( thread ) ), thread );
                            }
                            else
                            {
                              $graph2_matched_triples$.setDynamicValue( ConsesLow.cons( symmetric_triple, $graph2_matched_triples$.getDynamicValue( thread ) ), thread );
                            }
                          }
                          else
                          {
                            $graph2_matched_triples$.setDynamicValue( ConsesLow.cons( triple6, $graph2_matched_triples$.getDynamicValue( thread ) ), thread );
                          }
                          done_with_triple2P2 = T;
                          compare_count = Numbers.add( compare_count, graph2_triples_left_count2 );
                        }
                      }
                    }
                  }
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  utilities_macros.noting_percent_progress_postamble();
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                }
              }
            }
            finally
            {
              utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
              utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
              utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
              utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$20, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$16, thread );
      }
      SubLObject graph1_unmatched_triples = NIL;
      SubLObject graph2_unmatched_triples = NIL;
      SubLObject iterator_var3 = rdf_graph_triples_iterator( graph1 );
      SubLObject valid3;
      for( SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean( NIL == valid3 ) )
      {
        thread.resetMultipleValues();
        final SubLObject triple7 = iteration.iteration_next( iterator_var3 );
        valid3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid3 && NIL == subl_promotions.memberP( triple7, graph1_matched_triples, $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED ) )
        {
          graph1_unmatched_triples = ConsesLow.cons( triple7, graph1_unmatched_triples );
        }
      }
      iterator_var3 = rdf_graph_triples_iterator( graph2 );
      for( SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean( NIL == valid3 ) )
      {
        thread.resetMultipleValues();
        final SubLObject triple8 = iteration.iteration_next( iterator_var3 );
        valid3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid3 && NIL == subl_promotions.memberP( triple8, $graph2_matched_triples$.getDynamicValue( thread ), $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_, UNPROVIDED ) )
        {
          graph2_unmatched_triples = ConsesLow.cons( triple8, graph2_unmatched_triples );
        }
      }
      return Values.values( graph1_unmatched_triples, graph2_unmatched_triples );
    }
    finally
    {
      $graph2_matched_triples$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 55603L)
  public static SubLObject rdf_triples_isomorphicP(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( ConsesLow.list( triple1, triple2 ), $rdf_triples_assumed_isomophic$.getDynamicValue( thread ), Symbols.symbol_function( $sym158$RDF_TRIPLE_PAIR_EQUAL_ ), UNPROVIDED ) )
    {
      return T;
    }
    return rdf_triples_isomorphicP_int( graph1, triple1, graph2, triple2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 55908L)
  public static SubLObject rdf_triple_pair_equalP(final SubLObject triple_pair_1, final SubLObject triple_pair_2)
  {
    final SubLObject pair_1_first = triple_pair_1.first();
    final SubLObject pair_1_second = conses_high.second( triple_pair_1 );
    final SubLObject pair_2_first = triple_pair_2.first();
    final SubLObject pair_2_second = conses_high.second( triple_pair_2 );
    return makeBoolean( ( NIL != rdf_triple.rdf_triples_equalP( pair_1_first, pair_2_first ) && NIL != rdf_triple.rdf_triples_equalP( pair_1_second, pair_2_second ) ) || ( NIL != rdf_triple.rdf_triples_equalP(
        pair_1_first, pair_2_second ) && NIL != rdf_triple.rdf_triples_equalP( pair_1_second, pair_2_first ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 56395L)
  public static SubLObject rdf_triples_isomorphicP_int_internal(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_predicate( triple1 ), graph2, rdf_triple.rdf_triple_predicate( triple2 ), UNPROVIDED ) && ( ( NIL != rdf_nodes_isomorphicP( graph1, rdf_triple
        .rdf_triple_subject( triple1 ), graph2, rdf_triple.rdf_triple_subject( triple2 ), UNPROVIDED ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_object( triple1 ), graph2, rdf_triple
            .rdf_triple_object( triple2 ), UNPROVIDED ) ) || ( NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple1 ) ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_subject(
                triple1 ), graph2, rdf_triple.rdf_triple_object( triple2 ), UNPROVIDED ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_object( triple1 ), graph2, rdf_triple.rdf_triple_subject( triple2 ),
                    UNPROVIDED ) ) ) )
    {
      final SubLObject _prev_bind_0 = $rdf_triples_assumed_isomophic$.currentBinding( thread );
      try
      {
        $rdf_triples_assumed_isomophic$.bind( ConsesLow.cons( ConsesLow.list( triple1, triple2 ), $rdf_triples_assumed_isomophic$.getDynamicValue( thread ) ), thread );
        result = makeBoolean( NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_predicate( triple1 ), graph2, rdf_triple.rdf_triple_predicate( triple2 ), T ) && ( ( NIL != rdf_nodes_isomorphicP( graph1,
            rdf_triple.rdf_triple_subject( triple1 ), graph2, rdf_triple.rdf_triple_subject( triple2 ), T ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_object( triple1 ), graph2, rdf_triple
                .rdf_triple_object( triple2 ), T ) ) || ( NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple1 ) ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_subject(
                    triple1 ), graph2, rdf_triple.rdf_triple_object( triple2 ), T ) && NIL != rdf_nodes_isomorphicP( graph1, rdf_triple.rdf_triple_object( triple1 ), graph2, rdf_triple.rdf_triple_subject( triple2 ),
                        T ) ) ) );
      }
      finally
      {
        $rdf_triples_assumed_isomophic$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 56395L)
  public static SubLObject rdf_triples_isomorphicP_int(final SubLObject graph1, final SubLObject triple1, final SubLObject graph2, final SubLObject triple2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rdf_triples_isomorphicP_int_internal( graph1, triple1, graph2, triple2 );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym159$RDF_TRIPLES_ISOMORPHIC__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym159$RDF_TRIPLES_ISOMORPHIC__INT, FOUR_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym159$RDF_TRIPLES_ISOMORPHIC__INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( graph1, triple1, graph2, triple2 );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( graph1.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( triple1.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( graph2.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && triple2.eql( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rdf_triples_isomorphicP_int_internal( graph1, triple1, graph2, triple2 ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( graph1, triple1, graph2, triple2 ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 58068L)
  public static SubLObject rdf_node_symmetric_predicateP_internal(final SubLObject node)
  {
    return makeBoolean( NIL != rdf_nodes_equalP( node, get_known_uri( $str161$owl_complementOf ) ) || NIL != rdf_nodes_equalP( node, get_known_uri( $str162$owl_disjointWith ) ) || NIL != rdf_nodes_equalP( node,
        get_known_uri( $str163$owl_equivalentClass ) ) || NIL != rdf_nodes_equalP( node, get_known_uri( $str164$owl_equivalentProperty ) ) || NIL != rdf_nodes_equalP( node, get_known_uri( $str165$owl_incompatibleWith ) )
        || NIL != rdf_nodes_equalP( node, get_known_uri( $str166$owl_inverseOf ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 58068L)
  public static SubLObject rdf_node_symmetric_predicateP(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rdf_node_symmetric_predicateP_internal( node );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym160$RDF_NODE_SYMMETRIC_PREDICATE_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, node, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rdf_node_symmetric_predicateP_internal( node ) ) );
      memoization_state.caching_state_put( caching_state, node, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 58547L)
  public static SubLObject rdf_triples_equal_with_symmetryP(final SubLObject triple1, final SubLObject triple2)
  {
    if( NIL != rdf_triple.rdf_triples_equalP( triple1, triple2 ) )
    {
      return T;
    }
    if( NIL != rdf_nodes_equalP( rdf_triple.rdf_triple_predicate( triple1 ), rdf_triple.rdf_triple_predicate( triple2 ) ) && NIL != rdf_node_symmetric_predicateP( rdf_triple.rdf_triple_predicate( triple1 ) )
        && NIL != rdf_nodes_equalP( rdf_triple.rdf_triple_subject( triple1 ), rdf_triple.rdf_triple_object( triple2 ) ) && NIL != rdf_nodes_equalP( rdf_triple.rdf_triple_object( triple1 ), rdf_triple.rdf_triple_subject(
            triple2 ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 59053L)
  public static SubLObject rdf_nodes_isomorphicP(final SubLObject graph1, final SubLObject node1, final SubLObject graph2, final SubLObject node2, SubLObject deep_checkingP)
  {
    if( deep_checkingP == UNPROVIDED )
    {
      deep_checkingP = NIL;
    }
    if( NIL != owl_cycl_to_xml.cyc_uri_p( node1 ) && NIL != owl_cycl_to_xml.cyc_uri_p( node2 ) )
    {
      return Equality.equal( rdf_utilities.cyc_term_from_cyc_rdf_uri( node1 ), rdf_utilities.cyc_term_from_cyc_rdf_uri( node2 ) );
    }
    if( NIL != rdf_uri.rdf_uri_p( node1 ) && NIL != rdf_uri.rdf_uri_p( node2 ) && NIL != rdf_utilities.rdf_uri_to_cyc_term( node1 ) && NIL != rdf_utilities.rdf_uri_to_cyc_term( node2 ) )
    {
      return Equality.equal( rdf_utilities.rdf_uri_to_cyc_term( node1 ), rdf_utilities.rdf_uri_to_cyc_term( node2 ) );
    }
    if( NIL != rdf_uri.rdf_uri_p( node1 ) && NIL != rdf_uri.rdf_uri_p( node2 ) )
    {
      return rdf_uri.rdf_uri_equal_p( node1, node2 );
    }
    if( NIL != rdf_literal.rdf_literal_p( node1 ) && NIL != rdf_literal.rdf_literal_p( node2 ) )
    {
      final SubLObject node1_datatype_term = ( NIL != rdf_literal.rdf_literal_datatype( node1 ) ) ? rdf_utilities.rdf_uri_to_cyc_term( rdf_literal.rdf_literal_datatype( node1 ) ) : NIL;
      final SubLObject node2_datatype_term = ( NIL != rdf_literal.rdf_literal_datatype( node2 ) ) ? rdf_utilities.rdf_uri_to_cyc_term( rdf_literal.rdf_literal_datatype( node2 ) ) : NIL;
      return makeBoolean( NIL != Strings.stringE( rdf_literal.rdf_literal_utf8_lexical_form( node1 ), rdf_literal.rdf_literal_utf8_lexical_form( node2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
          && ( ( ( NIL == rdf_literal.rdf_literal_language_tag( node1 ) || NIL != Strings.stringE( $str121$en, rdf_literal.rdf_literal_language_tag( node1 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              && ( NIL == rdf_literal.rdf_literal_language_tag( node2 ) || NIL != Strings.stringE( $str121$en, rdf_literal.rdf_literal_language_tag( node2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
              || rdf_literal.rdf_literal_language_tag( node1 ).equal( rdf_literal.rdf_literal_language_tag( node2 ) ) ) && ( rdf_literal.rdf_literal_datatype( node1 ).equal( rdf_literal.rdf_literal_datatype( node2 ) )
                  || ( NIL != forts.fort_p( node1_datatype_term ) && NIL != forts.fort_p( node2_datatype_term ) && ( node1_datatype_term.equal( node2_datatype_term ) || NIL != genls.genlsP( node1_datatype_term,
                      node2_datatype_term, UNPROVIDED, UNPROVIDED ) || NIL != genls.genlsP( node2_datatype_term, node1_datatype_term, UNPROVIDED, UNPROVIDED ) ) ) ) );
    }
    if( NIL != rdf_blank_node.rdf_blank_node_p( node1 ) && NIL != rdf_blank_node.rdf_blank_node_p( node2 ) )
    {
      final SubLObject node1_subject_triples = rdf_graph_find_subject_triples_closure( graph1, node1, UNPROVIDED );
      final SubLObject node2_subject_triples = rdf_graph_find_subject_triples_closure( graph2, node2, UNPROVIDED );
      final SubLObject node1_object_triples = rdf_graph_find_object_triples_closure( graph1, node1, UNPROVIDED );
      final SubLObject node2_object_triples = rdf_graph_find_object_triples_closure( graph2, node2, UNPROVIDED );
      if( NIL == list_utilities.same_length_p( node1_subject_triples, node2_subject_triples ) || NIL == list_utilities.same_length_p( node1_object_triples, node2_object_triples ) )
      {
        return NIL;
      }
      if( NIL == deep_checkingP )
      {
        return T;
      }
      if( NIL != rdf_triple_sets_isomorphicP( graph1, node1_subject_triples, graph2, node2_subject_triples ) && NIL != rdf_triple_sets_isomorphicP( graph1, node1_object_triples, graph2, node2_object_triples ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 62137L)
  public static SubLObject rdf_triple_sets_isomorphicP(final SubLObject graph1, final SubLObject graph1_triples, final SubLObject graph2, final SubLObject graph2_triples)
  {
    if( NIL == list_utilities.same_length_p( graph1_triples, graph2_triples ) )
    {
      return NIL;
    }
    SubLObject match_count = ZERO_INTEGER;
    SubLObject cdolist_list_var = graph1_triples;
    SubLObject graph1_triple = NIL;
    graph1_triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject match_foundP = NIL;
      if( NIL == match_foundP )
      {
        SubLObject csome_list_var = graph2_triples;
        SubLObject graph2_triple = NIL;
        graph2_triple = csome_list_var.first();
        while ( NIL == match_foundP && NIL != csome_list_var)
        {
          if( NIL != rdf_triples_isomorphicP( graph1, graph1_triple, graph2, graph2_triple ) )
          {
            match_count = Numbers.add( match_count, ONE_INTEGER );
            match_foundP = T;
          }
          csome_list_var = csome_list_var.rest();
          graph2_triple = csome_list_var.first();
        }
      }
      if( NIL == match_foundP )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      graph1_triple = cdolist_list_var.first();
    }
    if( match_count.eql( Sequences.length( graph1_triples ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 63113L)
  public static SubLObject get_known_uri_internal(final SubLObject v_object)
  {
    if( NIL != constant_handles.constant_p( v_object ) && ( NIL != string_utilities.starts_with( constants_high.constant_name( v_object ), $str168$owl_ ) || NIL != string_utilities.starts_with( constants_high
        .constant_name( v_object ), $str169$rdf_ ) || NIL != string_utilities.starts_with( constants_high.constant_name( v_object ), $str170$rdfs_ ) || NIL != string_utilities.starts_with( constants_high.constant_name(
            v_object ), $str171$xsd_ ) ) )
    {
      return get_known_uri( constants_high.constant_name( v_object ) );
    }
    if( NIL != forts.fort_p( v_object ) )
    {
      final SubLObject uri_string = kb_mapping_utilities.fpred_value_in_mt( v_object, $const172$rdfURI, $const173$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject uri = uri_string.isString() ? rdf_uri.get_rdf_uri( uri_string, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL != rdf_utilities.rdf_namespace_uriP( uri ) || NIL != rdf_utilities.rdfs_namespace_uriP( uri ) || NIL != owl_utilities.owl_namespace_uriP( uri ) || NIL != rdf_utilities.xsd_namespace_uriP( uri ) )
      {
        return uri;
      }
      return NIL;
    }
    else
    {
      if( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str168$owl_ ) && NIL != constants_high.find_constant( v_object ) )
      {
        return rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( string_utilities.pre_remove( v_object, $str168$owl_, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      if( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str169$rdf_ ) && NIL != constants_high.find_constant( v_object ) )
      {
        return rdf_uri.get_rdf_uri( rdf_utilities.rdf_expanded_name( string_utilities.pre_remove( v_object, $str169$rdf_, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      if( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str170$rdfs_ ) && NIL != constants_high.find_constant( v_object ) )
      {
        return rdf_uri.get_rdf_uri( rdf_utilities.rdfs_expanded_name( string_utilities.pre_remove( v_object, $str170$rdfs_, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      if( NIL != owl_utilities.implementation_uriP( v_object ) )
      {
        return v_object;
      }
      if( v_object.isString() && NIL != string_utilities.contains_charP( v_object, Characters.CHAR_colon ) )
      {
        final SubLObject prefix_local_part = string_utilities.string_tokenize( v_object, $list174, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.doubletonP( prefix_local_part ) && prefix_local_part.first().isString() && NIL != subl_promotions.memberP( prefix_local_part.first(), $list175, $sym176$STRING_, UNPROVIDED )
            && NIL != string_utilities.non_empty_stringP( conses_high.second( prefix_local_part ) ) )
        {
          SubLObject current;
          final SubLObject datum = current = prefix_local_part;
          SubLObject prefix = NIL;
          SubLObject local_part = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
          prefix = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
          local_part = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != Strings.stringE( prefix, $str178$owl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return rdf_uri.get_rdf_uri( owl_utilities.owl_expanded_name( local_part ), UNPROVIDED, UNPROVIDED );
            }
            if( NIL != Strings.stringE( prefix, $str179$rdf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return rdf_uri.get_rdf_uri( rdf_utilities.rdf_expanded_name( local_part ), UNPROVIDED, UNPROVIDED );
            }
            if( NIL != Strings.stringE( prefix, $str180$rdfs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return rdf_uri.get_rdf_uri( rdf_utilities.rdfs_expanded_name( local_part ), UNPROVIDED, UNPROVIDED );
            }
            if( NIL != Strings.stringE( prefix, $str181$xsd, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return rdf_uri.get_rdf_uri( rdf_utilities.xsd_expanded_name( local_part ), UNPROVIDED, UNPROVIDED );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list177 );
          }
        }
      }
      else
      {
        if( v_object.isString() && NIL != owl_utilities.implementation_uriP( rdf_uri.get_rdf_uri( v_object, UNPROVIDED, UNPROVIDED ) ) )
        {
          return rdf_uri.get_rdf_uri( v_object, UNPROVIDED, UNPROVIDED );
        }
        Errors.error( $str182$get_known_uri_called_with_unhandl, v_object );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 63113L)
  public static SubLObject get_known_uri(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_known_uri_internal( v_object );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym167$GET_KNOWN_URI, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym167$GET_KNOWN_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym167$GET_KNOWN_URI, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_known_uri_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-graph.lisp", position = 65341L)
  public static SubLObject test_rdf_graph()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_graph = new_rdf_graph();
    final SubLObject emu_uri = owl_cycl_to_xml.owl_cyc_uri_for_fort( $const192$Emu, NIL, NIL, UNPROVIDED );
    final SubLObject emu = rdf_graph_get_uri( v_graph, emu_uri, UNPROVIDED, UNPROVIDED );
    final SubLObject emu2 = rdf_uri.get_rdf_uri( emu_uri, NIL, NIL );
    final SubLObject v_genls = rdf_graph_get_uri( v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort( $const193$genls, NIL, NIL, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    final SubLObject comment = rdf_graph_get_uri( v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort( $const194$comment, NIL, NIL, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    final SubLObject bird = rdf_graph_get_uri( v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort( $const195$Bird, NIL, NIL, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    final SubLObject comment_literal = rdf_graph_get_literal( v_graph, kb_accessors.comment( $const192$Emu, $const196$CurrentWorldDataCollectorMt ), $str121$en, UNPROVIDED );
    final SubLObject big_foo = rdf_graph_get_literal( v_graph, $str197$FOO, $str121$en, UNPROVIDED );
    final SubLObject little_foo = rdf_graph_get_literal( v_graph, $str198$foo, $str121$en, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !emu.eql( canonicalize_rdf_triple_argument( emu2, v_graph ) ) )
    {
      Errors.error( $str199$Failed_to_canonicalize_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !emu.eql( rdf_graph_get_uri( v_graph, owl_cycl_to_xml.owl_cyc_uri_for_fort( $const192$Emu, NIL, NIL, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) ) )
    {
      Errors.error( $str200$Got_non_EQ_URIs_for___Emu_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !comment_literal.eql( rdf_graph_get_literal( v_graph, kb_accessors.comment( $const192$Emu, $const196$CurrentWorldDataCollectorMt ), $str121$en,
        UNPROVIDED ) ) )
    {
      Errors.error( $str201$Got_non_EQ_literals_for_comment_l );
    }
    rdf_graph_add_triple( v_graph, emu, v_genls, bird );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_contains_equivalent_tripleP( v_graph, emu2, v_genls, bird ) )
    {
      Errors.error( $str202$Couldn_t_find_equivalent_triple_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != rdf_graph_add_triple( v_graph, emu, v_genls, bird ) )
    {
      Errors.error( $str203$Failed_to_realize_that_triple_was );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != rdf_graph_add_triple( v_graph, emu_uri, v_genls, bird ) )
    {
      Errors.error( $str204$Failed_to_realize_that_triple_was );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_has_uriP( v_graph, emu_uri, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str205$Can_t_find_URI_for__S, emu_uri );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !THREE_INTEGER.eql( rdf_graph_node_count( v_graph ) ) )
    {
      Errors.error( $str206$Expecting_3_nodes_left__Actual_co, rdf_graph_node_count( v_graph ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_contains_tripleP( v_graph, emu, v_genls, bird ) )
    {
      Errors.error( $str207$Graph_does_not_genls_triple_we_ju );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthE( rdf_graph_find_subject_triples( v_graph, emu, UNPROVIDED ), ONE_INTEGER, UNPROVIDED ) )
    {
      Errors.error( $str208$Expected_1_subject_triple_for_emu, rdf_graph_find_subject_triples( v_graph, emu, UNPROVIDED ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthE( rdf_graph_find_subject_triples( v_graph, emu_uri, UNPROVIDED ), ONE_INTEGER, UNPROVIDED ) )
    {
      Errors.error( $str208$Expected_1_subject_triple_for_emu, rdf_graph_find_subject_triples( v_graph, emu_uri, UNPROVIDED ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.lengthE( rdf_graph_find_subjects( v_graph, v_genls, bird ), ONE_INTEGER, UNPROVIDED ) )
    {
      Errors.error( $str209$Expected_1_subject_for_genls_bird, rdf_graph_find_subjects( v_graph, v_genls, bird ) );
    }
    rdf_graph_add_triple( v_graph, emu, comment, comment_literal );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !FIVE_INTEGER.eql( rdf_graph_node_count( v_graph ) ) )
    {
      Errors.error( $str210$Expecting_5_nodes_left__Actual_co, rdf_graph_node_count( v_graph ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_contains_tripleP( v_graph, emu, comment, comment_literal ) )
    {
      Errors.error( $str211$Graph_does_not_comment_triple_we_ );
    }
    rdf_graph_remove_triple( v_graph, emu, v_genls, bird );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != rdf_graph_contains_tripleP( v_graph, emu, v_genls, bird ) )
    {
      Errors.error( $str212$Graph_contains_genls_triple_we_ju );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !THREE_INTEGER.eql( rdf_graph_node_count( v_graph ) ) )
    {
      Errors.error( $str206$Expecting_3_nodes_left__Actual_co, rdf_graph_node_count( v_graph ) );
    }
    rdf_graph_add_triple( v_graph, emu, comment, big_foo );
    rdf_graph_add_triple( v_graph, emu, comment, little_foo );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_contains_tripleP( v_graph, emu, comment, big_foo ) )
    {
      Errors.error( $str213$Graph_does_not_big_foo_triple_we_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == rdf_graph_contains_tripleP( v_graph, emu, comment, little_foo ) )
    {
      Errors.error( $str214$Graph_does_not_little_foo_triple_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && rdf_graph_get_literal( v_graph, $str197$FOO, $str121$en, UNPROVIDED ).eql( little_foo ) )
    {
      Errors.error( $str215$Looked_for_big_foo__got_little_fo );
    }
    return T;
  }

  public static SubLObject declare_rdf_graph_file()
  {
    SubLFiles.declareFunction( me, "new_rdf_graph", "NEW-RDF-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_add_triple", "RDF-GRAPH-ADD-TRIPLE", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_remove_triple", "RDF-GRAPH-REMOVE-TRIPLE", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_remove_known_triple", "RDF-GRAPH-REMOVE-KNOWN-TRIPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_contains_tripleP", "RDF-GRAPH-CONTAINS-TRIPLE?", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_contains_equivalent_tripleP", "RDF-GRAPH-CONTAINS-EQUIVALENT-TRIPLE?", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_subject_triples", "RDF-GRAPH-FIND-SUBJECT-TRIPLES", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_subject_triples_closure", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CLOSURE", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_subject_triples_canonical", "RDF-GRAPH-FIND-SUBJECT-TRIPLES-CANONICAL", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_subject_triple_count", "RDF-GRAPH-SUBJECT-TRIPLE-COUNT", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_subjects", "RDF-GRAPH-FIND-SUBJECTS", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_predicate_triples", "RDF-GRAPH-FIND-PREDICATE-TRIPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_predicates", "RDF-GRAPH-FIND-PREDICATES", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_predicate_triple_count", "RDF-GRAPH-PREDICATE-TRIPLE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_object_triples", "RDF-GRAPH-FIND-OBJECT-TRIPLES", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_object_triples_closure", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CLOSURE", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_object_triples_canonical", "RDF-GRAPH-FIND-OBJECT-TRIPLES-CANONICAL", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_objects", "RDF-GRAPH-FIND-OBJECTS", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_object_triple_count", "RDF-GRAPH-OBJECT-TRIPLE-COUNT", 2, 1, false );
    SubLFiles.declareFunction( me, "valid_rdf_subject_p", "VALID-RDF-SUBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_rdf_predicate_p", "VALID-RDF-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_rdf_object_p", "VALID-RDF-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_rdf_namesapce_uri", "RDF-GRAPH-GET-RDF-NAMESAPCE-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_uri", "RDF-GRAPH-GET-URI", 2, 2, false );
    SubLFiles.declareFunction( me, "rdf_graph_has_uriP", "RDF-GRAPH-HAS-URI?", 2, 2, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_blank_node", "RDF-GRAPH-GET-BLANK-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_new_blank_node", "RDF-GRAPH-GET-NEW-BLANK-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_literal", "RDF-GRAPH-GET-LITERAL", 2, 2, false );
    SubLFiles.declareFunction( me, "rdf_graph_diff", "RDF-GRAPH-DIFF", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_difference", "RDF-GRAPH-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_or_rdf_uri_p", "FORT-OR-RDF-URI-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_instances", "RDF-GRAPH-INSTANCES", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_uri_for_fort", "RDF-GRAPH-URI-FOR-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "rank_rdf_classes_transitive", "RANK-RDF-CLASSES-TRANSITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "increment_superclass_count", "INCREMENT-SUPERCLASS-COUNT", 4, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_count_instances", "RDF-GRAPH-COUNT-INSTANCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_subclasses", "RDF-GRAPH-SUBCLASSES", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_gather_subclasses_transitive", "RDF-GRAPH-GATHER-SUBCLASSES-TRANSITIVE", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_triple_count", "RDF-GRAPH-TRIPLE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_empty_p", "RDF-GRAPH-EMPTY-P", 1, 0, false );
    SubLFiles.declareMacro( me, "rdf_graph_do_nodes", "RDF-GRAPH-DO-NODES" );
    SubLFiles.declareFunction( me, "get_rdf_graph_lock", "GET-RDF-GRAPH-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_node_iterator", "RDF-GRAPH-NODE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_rdf_graph_nodes_iterator_state", "MAKE-RDF-GRAPH-NODES-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_rdf_graph_nodes_done", "ITERATE-RDF-GRAPH-NODES-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_rdf_graph_nodes_next", "ITERATE-RDF-GRAPH-NODES-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_rdf_graph_to_n_triples", "DUMP-RDF-GRAPH-TO-N-TRIPLES", 2, 0, false );
    SubLFiles.declareMacro( me, "do_loaded_rdf_graphs", "DO-LOADED-RDF-GRAPHS" );
    SubLFiles.declareFunction( me, "loaded_rdf_graphs", "LOADED-RDF-GRAPHS", 0, 0, false );
    SubLFiles.declareMacro( me, "rdf_graph_do_subjects", "RDF-GRAPH-DO-SUBJECTS" );
    SubLFiles.declareFunction( me, "rdf_graph_subject_count", "RDF-GRAPH-SUBJECT-COUNT", 1, 1, false );
    SubLFiles.declareMacro( me, "rdf_graph_do_triples", "RDF-GRAPH-DO-TRIPLES" );
    SubLFiles.declareFunction( me, "rdf_graph_for_uri_loadedP", "RDF-GRAPH-FOR-URI-LOADED?", 1, 0, false );
    SubLFiles.declareFunction( me, "loaded_rdf_graph_count", "LOADED-RDF-GRAPH-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "find_or_download_rdf_graph", "FIND-OR-DOWNLOAD-RDF-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "download_rdf_graph", "DOWNLOAD-RDF-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_ontology_uri", "RDF-GRAPH-ONTOLOGY-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graphs_with_uri_predicate_triples", "RDF-GRAPHS-WITH-URI-PREDICATE-TRIPLES", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_predicate_has_uri_objectsP", "RDF-PREDICATE-HAS-URI-OBJECTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "count_triples_for_uri", "COUNT-TRIPLES-FOR-URI", 1, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_uri_from_two_parts", "RDF-GRAPH-GET-URI-FROM-TWO-PARTS", 3, 0, false );
    SubLFiles.declareFunction( me, "note_rdf_graph_accessed", "NOTE-RDF-GRAPH-ACCESSED", 1, 0, false );
    SubLFiles.declareFunction( me, "note_rdf_graph_loaded", "NOTE-RDF-GRAPH-LOADED", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_from_loaded_rdf_graphs", "REMOVE-FROM-LOADED-RDF-GRAPHS", 1, 0, false );
    SubLFiles.declareFunction( me, "qname_for_uri", "QNAME-FOR-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_cull_loaded_rdf_graphs", "POSSIBLY-CULL-LOADED-RDF-GRAPHS", 0, 0, false );
    SubLFiles.declareFunction( me, "next_rdf_blank_node_id", "NEXT-RDF-BLANK-NODE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_rdf_graph_get_blank_node_cached", "CLEAR-RDF-GRAPH-GET-BLANK-NODE-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rdf_graph_get_blank_node_cached", "REMOVE-RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_blank_node_cached_internal", "RDF-GRAPH-GET-BLANK-NODE-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_blank_node_cached", "RDF-GRAPH-GET-BLANK-NODE-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_rdf_graph_get_literal_cached", "CLEAR-RDF-GRAPH-GET-LITERAL-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rdf_graph_get_literal_cached", "REMOVE-RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_literal_cached_internal", "RDF-GRAPH-GET-LITERAL-CACHED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_literal_cached", "RDF-GRAPH-GET-LITERAL-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_or_create_rdf_triple", "RDF-GRAPH-FIND-OR-CREATE-RDF-TRIPLE", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_triple", "RDF-GRAPH-FIND-TRIPLE", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_equivalent_triple", "RDF-GRAPH-FIND-EQUIVALENT-TRIPLE", 4, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_rdf_triple_argument", "CANONICALIZE-RDF-TRIPLE-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_literal_datatype_p", "XML-LITERAL-DATATYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_values", "RDF-GRAPH-FIND-VALUES", 3, 2, false );
    SubLFiles.declareFunction( me, "rdf_graph_find_triples", "RDF-GRAPH-FIND-TRIPLES", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_nodes_add", "RDF-GRAPH-NODES-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_nodes_remove", "RDF-GRAPH-NODES-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_nodes_lookup", "RDF-GRAPH-NODES-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_nodes_equalP", "RDF-NODES-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_print_function_trampoline", "RDF-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_p", "RDF-GRAPH-P", 1, 0, false );
    new $rdf_graph_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rdf_graph_struct_triples", "RDF-GRAPH-STRUCT-TRIPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_nodes", "RDF-GRAPH-STRUCT-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_index", "RDF-GRAPH-STRUCT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_lock", "RDF-GRAPH-STRUCT-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_node_count", "RDF-GRAPH-STRUCT-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_prefix_map", "RDF-GRAPH-STRUCT-PREFIX-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_file_location", "RDF-GRAPH-STRUCT-FILE-LOCATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_topic", "RDF-GRAPH-STRUCT-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_struct_focal_nodes", "RDF-GRAPH-STRUCT-FOCAL-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_triples", "_CSETF-RDF-GRAPH-STRUCT-TRIPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_nodes", "_CSETF-RDF-GRAPH-STRUCT-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_index", "_CSETF-RDF-GRAPH-STRUCT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_lock", "_CSETF-RDF-GRAPH-STRUCT-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_node_count", "_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_prefix_map", "_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_file_location", "_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_topic", "_CSETF-RDF-GRAPH-STRUCT-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_struct_focal_nodes", "_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rdf_graph", "MAKE-RDF-GRAPH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rdf_graph", "VISIT-DEFSTRUCT-RDF-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rdf_graph_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rdf_graph", "PRINT-RDF-GRAPH", 3, 0, false );
    SubLFiles.declareFunction( me, "make_new_rdf_graph", "MAKE-NEW-RDF-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_triples", "RDF-GRAPH-TRIPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_triples_iterator", "RDF-GRAPH-TRIPLES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_nodes", "RDF-GRAPH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index", "RDF-GRAPH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_lock", "RDF-GRAPH-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_node_count", "RDF-GRAPH-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_increment_node_count", "RDF-GRAPH-INCREMENT-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_decrement_node_count", "RDF-GRAPH-DECREMENT-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_file_location", "RDF-GRAPH-FILE-LOCATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_note_file_location", "RDF-GRAPH-NOTE-FILE-LOCATION", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_topic", "RDF-GRAPH-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_note_topic", "RDF-GRAPH-NOTE-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_focal_nodes", "RDF-GRAPH-FOCAL-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_note_focal_node", "RDF-GRAPH-NOTE-FOCAL-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_prefix_map", "RDF-GRAPH-PREFIX-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_note_namespace_prefixes", "RDF-GRAPH-NOTE-NAMESPACE-PREFIXES", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_qname_for_uri", "RDF-GRAPH-QNAME-FOR-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_label", "RDF-GRAPH-GET-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_labels", "RDF-GRAPH-GET-LABELS", 2, 2, false );
    SubLFiles.declareFunction( me, "rdf_uris_matching_label", "RDF-URIS-MATCHING-LABEL", 1, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_get_uris_matching_label", "RDF-GRAPH-GET-URIS-MATCHING-LABEL", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_labels_for_term", "RDF-LABELS-FOR-TERM", 1, 3, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_graph_method", "SXHASH-RDF-GRAPH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_graph", "SXHASH-RDF-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_add", "RDF-GRAPH-INDEX-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_sub_index_add", "RDF-GRAPH-SUB-INDEX-ADD", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_rdf_graph_index_sub_indexes", "CLEAR-RDF-GRAPH-INDEX-SUB-INDEXES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rdf_graph_index_sub_indexes", "REMOVE-RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_sub_indexes_internal", "RDF-GRAPH-INDEX-SUB-INDEXES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_sub_indexes", "RDF-GRAPH-INDEX-SUB-INDEXES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_remove", "RDF-GRAPH-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_subject_index_remove", "RDF-GRAPH-SUBJECT-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_predicate_index_remove", "RDF-GRAPH-PREDICATE-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_object_index_remove", "RDF-GRAPH-OBJECT-INDEX-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_find_triple", "RDF-GRAPH-INDEX-FIND-TRIPLE", 4, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_find_triples", "RDF-GRAPH-INDEX-FIND-TRIPLES", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_find_values", "RDF-GRAPH-INDEX-FIND-VALUES", 5, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_sub_index_count", "RDF-GRAPH-INDEX-SUB-INDEX-COUNT", 3, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_get_sub_index", "RDF-GRAPH-INDEX-GET-SUB-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_subject_index_count", "RDF-GRAPH-INDEX-SUBJECT-INDEX-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_predicate_index_count", "RDF-GRAPH-INDEX-PREDICATE-INDEX-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_object_index_count", "RDF-GRAPH-INDEX-OBJECT-INDEX-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_find", "RDF-GRAPH-INDEX-FIND", 5, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_nodes_matchP", "RDF-GRAPH-NODES-MATCH?", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_contains_nodeP", "RDF-GRAPH-INDEX-CONTAINS-NODE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_print_function_trampoline", "RDF-GRAPH-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_p", "RDF-GRAPH-INDEX-P", 1, 0, false );
    new $rdf_graph_index_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rdf_graph_index_struct_subject_index", "RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_struct_predicate_index", "RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_struct_object_index", "RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_index_struct_subject_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_index_struct_predicate_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_graph_index_struct_object_index", "_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rdf_graph_index", "MAKE-RDF-GRAPH-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rdf_graph_index", "VISIT-DEFSTRUCT-RDF-GRAPH-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rdf_graph_index_method", "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rdf_graph_index", "PRINT-RDF-GRAPH-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rdf_graph_index", "NEW-RDF-GRAPH-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_subject_index", "RDF-GRAPH-INDEX-SUBJECT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_predicate_index", "RDF-GRAPH-INDEX-PREDICATE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_index_object_index", "RDF-GRAPH-INDEX-OBJECT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_graph_index_method", "SXHASH-RDF-GRAPH-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_graph_index", "SXHASH-RDF-GRAPH-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "print_rdf_graph_triples_readably", "PRINT-RDF-GRAPH-TRIPLES-READABLY", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_compare", "RDF-GRAPH-COMPARE", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_triples_isomorphicP", "RDF-TRIPLES-ISOMORPHIC?", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_triple_pair_equalP", "RDF-TRIPLE-PAIR-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_triples_isomorphicP_int_internal", "RDF-TRIPLES-ISOMORPHIC?-INT-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_triples_isomorphicP_int", "RDF-TRIPLES-ISOMORPHIC?-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "rdf_node_symmetric_predicateP_internal", "RDF-NODE-SYMMETRIC-PREDICATE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_node_symmetric_predicateP", "RDF-NODE-SYMMETRIC-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_triples_equal_with_symmetryP", "RDF-TRIPLES-EQUAL-WITH-SYMMETRY?", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_nodes_isomorphicP", "RDF-NODES-ISOMORPHIC?", 4, 1, false );
    SubLFiles.declareFunction( me, "rdf_triple_sets_isomorphicP", "RDF-TRIPLE-SETS-ISOMORPHIC?", 4, 0, false );
    SubLFiles.declareFunction( me, "get_known_uri_internal", "GET-KNOWN-URI-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_known_uri", "GET-KNOWN-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "test_rdf_graph", "TEST-RDF-GRAPH", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_rdf_graph_file()
  {
    $loaded_rdf_graphs$ = SubLFiles.deflexical( "*LOADED-RDF-GRAPHS*", NIL );
    $loaded_rdf_graphs_lock$ = SubLFiles.deflexical( "*LOADED-RDF-GRAPHS-LOCK*", ReadWriteLocks.new_rw_lock( $str0$Loaded_RDF_Graphs ) );
    $rdf_graph_literal_indexing_enabledP$ = SubLFiles.defparameter( "*RDF-GRAPH-LITERAL-INDEXING-ENABLED?*", NIL );
    $rdf_graph_converted_triples$ = SubLFiles.defparameter( "*RDF-GRAPH-CONVERTED-TRIPLES*", NIL );
    $target_max_loaded_rdf_triple_count$ = SubLFiles.deflexical( "*TARGET-MAX-LOADED-RDF-TRIPLE-COUNT*", $int62$10000 );
    $rdf_blank_node_isg$ = SubLFiles.deflexical( "*RDF-BLANK-NODE-ISG*", maybeDefault( $sym63$_RDF_BLANK_NODE_ISG_, $rdf_blank_node_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) ) );
    $rdf_graph_get_blank_node_cached_caching_state$ = SubLFiles.deflexical( "*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*", NIL );
    $rdf_graph_get_literal_cached_caching_state$ = SubLFiles.deflexical( "*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*", NIL );
    $dtp_rdf_graph$ = SubLFiles.defconstant( "*DTP-RDF-GRAPH*", $sym71$RDF_GRAPH );
    $rdf_graph_internal_triple_comparison_test$ = SubLFiles.deflexical( "*RDF-GRAPH-INTERNAL-TRIPLE-COMPARISON-TEST*", Symbols.symbol_function( EQ ) );
    $rdf_graph_internal_node_comparison_test$ = SubLFiles.deflexical( "*RDF-GRAPH-INTERNAL-NODE-COMPARISON-TEST*", Symbols.symbol_function( EQ ) );
    $rdf_graph_index_sub_indexes_caching_state$ = SubLFiles.deflexical( "*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*", NIL );
    $dtp_rdf_graph_index$ = SubLFiles.defconstant( "*DTP-RDF-GRAPH-INDEX*", $sym130$RDF_GRAPH_INDEX );
    $graph2_matched_triples$ = SubLFiles.defparameter( "*GRAPH2-MATCHED-TRIPLES*", NIL );
    $rdf_triples_assumed_isomophic$ = SubLFiles.defparameter( "*RDF-TRIPLES-ASSUMED-ISOMOPHIC*", NIL );
    return NIL;
  }

  public static SubLObject setup_rdf_graph_file()
  {
    access_macros.register_macro_helper( $sym27$GET_RDF_GRAPH_LOCK, $sym30$RDF_GRAPH_DO_NODES );
    access_macros.register_macro_helper( $sym29$RDF_GRAPH_NODE_ITERATOR, $sym30$RDF_GRAPH_DO_NODES );
    utilities_macros.note_funcall_helper_function( $sym31$ITERATE_RDF_GRAPH_NODES_DONE );
    utilities_macros.note_funcall_helper_function( $sym32$ITERATE_RDF_GRAPH_NODES_NEXT );
    access_macros.register_macro_helper( $sym44$LOADED_RDF_GRAPHS, $sym45$DO_LOADED_RDF_GRAPHS );
    subl_macro_promotions.declare_defglobal( $sym63$_RDF_BLANK_NODE_ISG_ );
    memoization_state.note_globally_cached_function( $sym64$RDF_GRAPH_GET_BLANK_NODE_CACHED );
    memoization_state.note_globally_cached_function( $sym66$RDF_GRAPH_GET_LITERAL_CACHED );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), Symbols.symbol_function( $sym77$RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list78 );
    Structures.def_csetf( $sym79$RDF_GRAPH_STRUCT_TRIPLES, $sym80$_CSETF_RDF_GRAPH_STRUCT_TRIPLES );
    Structures.def_csetf( $sym81$RDF_GRAPH_STRUCT_NODES, $sym82$_CSETF_RDF_GRAPH_STRUCT_NODES );
    Structures.def_csetf( $sym83$RDF_GRAPH_STRUCT_INDEX, $sym84$_CSETF_RDF_GRAPH_STRUCT_INDEX );
    Structures.def_csetf( $sym85$RDF_GRAPH_STRUCT_LOCK, $sym86$_CSETF_RDF_GRAPH_STRUCT_LOCK );
    Structures.def_csetf( $sym87$RDF_GRAPH_STRUCT_NODE_COUNT, $sym88$_CSETF_RDF_GRAPH_STRUCT_NODE_COUNT );
    Structures.def_csetf( $sym89$RDF_GRAPH_STRUCT_PREFIX_MAP, $sym90$_CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP );
    Structures.def_csetf( $sym91$RDF_GRAPH_STRUCT_FILE_LOCATION, $sym92$_CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION );
    Structures.def_csetf( $sym93$RDF_GRAPH_STRUCT_TOPIC, $sym94$_CSETF_RDF_GRAPH_STRUCT_TOPIC );
    Structures.def_csetf( $sym95$RDF_GRAPH_STRUCT_FOCAL_NODES, $sym96$_CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES );
    Equality.identity( $sym71$RDF_GRAPH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), Symbols.symbol_function( $sym111$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym76$PRINT_RDF_GRAPH );
    access_macros.register_macro_helper( $sym51$RDF_GRAPH_TRIPLES_ITERATOR, $sym114$RDF_GRAPH_DO_SUBJECTS );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph$.getGlobalValue(), Symbols.symbol_function( $sym124$SXHASH_RDF_GRAPH_METHOD ) );
    memoization_state.note_globally_cached_function( $sym125$RDF_GRAPH_INDEX_SUB_INDEXES );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), Symbols.symbol_function( $sym137$RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list138 );
    Structures.def_csetf( $sym139$RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX, $sym140$_CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX );
    Structures.def_csetf( $sym141$RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX, $sym142$_CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX );
    Structures.def_csetf( $sym143$RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX, $sym144$_CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX );
    Equality.identity( $sym130$RDF_GRAPH_INDEX );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), Symbols.symbol_function(
        $sym149$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym136$PRINT_RDF_GRAPH_INDEX );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_graph_index$.getGlobalValue(), Symbols.symbol_function( $sym151$SXHASH_RDF_GRAPH_INDEX_METHOD ) );
    memoization_state.note_memoized_function( $sym159$RDF_TRIPLES_ISOMORPHIC__INT );
    memoization_state.note_memoized_function( $sym160$RDF_NODE_SYMMETRIC_PREDICATE_ );
    memoization_state.note_memoized_function( $sym167$GET_KNOWN_URI );
    generic_testing.define_test_case_table_int( $sym183$TEST_RDF_GRAPH, ConsesLow.list( new SubLObject[] { $kw184$TEST, NIL, $kw185$OWNER, NIL, $kw186$CLASSES, $list187, $kw188$KB, $kw189$TINY, $kw190$WORKING_, T
    } ), $list191 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rdf_graph_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rdf_graph_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rdf_graph_file();
  }
  static
  {
    me = new rdf_graph();
    $loaded_rdf_graphs$ = null;
    $loaded_rdf_graphs_lock$ = null;
    $rdf_graph_literal_indexing_enabledP$ = null;
    $rdf_graph_converted_triples$ = null;
    $target_max_loaded_rdf_triple_count$ = null;
    $rdf_blank_node_isg$ = null;
    $rdf_graph_get_blank_node_cached_caching_state$ = null;
    $rdf_graph_get_literal_cached_caching_state$ = null;
    $dtp_rdf_graph$ = null;
    $rdf_graph_internal_triple_comparison_test$ = null;
    $rdf_graph_internal_node_comparison_test$ = null;
    $rdf_graph_index_sub_indexes_caching_state$ = null;
    $dtp_rdf_graph_index$ = null;
    $graph2_matched_triples$ = null;
    $rdf_triples_assumed_isomophic$ = null;
    $str0$Loaded_RDF_Graphs = makeString( "Loaded RDF Graphs" );
    $sym1$RDF_GRAPH_P = makeSymbol( "RDF-GRAPH-P" );
    $sym2$VALID_RDF_SUBJECT_P = makeSymbol( "VALID-RDF-SUBJECT-P" );
    $sym3$VALID_RDF_PREDICATE_P = makeSymbol( "VALID-RDF-PREDICATE-P" );
    $sym4$VALID_RDF_OBJECT_P = makeSymbol( "VALID-RDF-OBJECT-P" );
    $str5$label = makeString( "label" );
    $str6$comment = makeString( "comment" );
    $sym7$RDF_TRIPLE_P = makeSymbol( "RDF-TRIPLE-P" );
    $kw8$SUBJECT = makeKeyword( "SUBJECT" );
    $kw9$OBJECT = makeKeyword( "OBJECT" );
    $sym10$RDF_TRIPLES_EQUAL_ = makeSymbol( "RDF-TRIPLES-EQUAL?" );
    $kw11$PREDICATE = makeKeyword( "PREDICATE" );
    $sym12$COPY_RDF_TRIPLE = makeSymbol( "COPY-RDF-TRIPLE" );
    $sym13$STRINGP = makeSymbol( "STRINGP" );
    $sym14$VALID_RDF_LITERAL_DATATYPE_P = makeSymbol( "VALID-RDF-LITERAL-DATATYPE-P" );
    $sym15$FORT_OR_RDF_URI_P = makeSymbol( "FORT-OR-RDF-URI-P" );
    $str16$type = makeString( "type" );
    $str17$sameAs = makeString( "sameAs" );
    $str18$Class = makeString( "Class" );
    $str19$Ranking_classes_by_transitive_ins = makeString( "Ranking classes by transitive instance count..." );
    $str20$cdolist = makeString( "cdolist" );
    $sym21$ZEROP = makeSymbol( "ZEROP" );
    $sym22$_ = makeSymbol( ">" );
    $sym23$CDR = makeSymbol( "CDR" );
    $str24$subClassOf = makeString( "subClassOf" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "GRAPH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$WITH_READER_LOCK = makeSymbol( "WITH-READER-LOCK" );
    $sym27$GET_RDF_GRAPH_LOCK = makeSymbol( "GET-RDF-GRAPH-LOCK" );
    $sym28$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym29$RDF_GRAPH_NODE_ITERATOR = makeSymbol( "RDF-GRAPH-NODE-ITERATOR" );
    $sym30$RDF_GRAPH_DO_NODES = makeSymbol( "RDF-GRAPH-DO-NODES" );
    $sym31$ITERATE_RDF_GRAPH_NODES_DONE = makeSymbol( "ITERATE-RDF-GRAPH-NODES-DONE" );
    $sym32$ITERATE_RDF_GRAPH_NODES_NEXT = makeSymbol( "ITERATE-RDF-GRAPH-NODES-NEXT" );
    $str33$_S_already_exists_ = makeString( "~S already exists." );
    $kw34$OUTPUT = makeKeyword( "OUTPUT" );
    $str35$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str36$Dumping_RDF_graph_to_ = makeString( "Dumping RDF graph to " );
    $str37$___ = makeString( "..." );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "GRAPH" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list39 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw40$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw41$DONE = makeKeyword( "DONE" );
    $list42 = ConsesLow.list( makeSymbol( "*LOADED-RDF-GRAPHS-LOCK*" ) );
    $list43 = ConsesLow.list( makeSymbol( "LOADED-RDF-GRAPHS" ) );
    $sym44$LOADED_RDF_GRAPHS = makeSymbol( "LOADED-RDF-GRAPHS" );
    $sym45$DO_LOADED_RDF_GRAPHS = makeSymbol( "DO-LOADED-RDF-GRAPHS" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBJECT" ), makeSymbol( "GRAPH" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym47$TRIPLE = makeUninternedSymbol( "TRIPLE" );
    $sym48$DONE_SUBJECTS = makeUninternedSymbol( "DONE-SUBJECTS" );
    $sym49$CLET = makeSymbol( "CLET" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-SET" ) ) );
    $sym51$RDF_GRAPH_TRIPLES_ITERATOR = makeSymbol( "RDF-GRAPH-TRIPLES-ITERATOR" );
    $sym52$RDF_TRIPLE_SUBJECT = makeSymbol( "RDF-TRIPLE-SUBJECT" );
    $sym53$PWHEN = makeSymbol( "PWHEN" );
    $sym54$SET_ADD = makeSymbol( "SET-ADD" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRIPLE" ), makeSymbol( "GRAPH" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym56$RDF_URI_P = makeSymbol( "RDF-URI-P" );
    $sym57$RDF_GRAPH_TOPIC = makeSymbol( "RDF-GRAPH-TOPIC" );
    $kw58$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym59$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str60$Ontology = makeString( "Ontology" );
    $kw61$ALL = makeKeyword( "ALL" );
    $int62$10000 = makeInteger( 10000 );
    $sym63$_RDF_BLANK_NODE_ISG_ = makeSymbol( "*RDF-BLANK-NODE-ISG*" );
    $sym64$RDF_GRAPH_GET_BLANK_NODE_CACHED = makeSymbol( "RDF-GRAPH-GET-BLANK-NODE-CACHED" );
    $sym65$_RDF_GRAPH_GET_BLANK_NODE_CACHED_CACHING_STATE_ = makeSymbol( "*RDF-GRAPH-GET-BLANK-NODE-CACHED-CACHING-STATE*" );
    $sym66$RDF_GRAPH_GET_LITERAL_CACHED = makeSymbol( "RDF-GRAPH-GET-LITERAL-CACHED" );
    $sym67$_RDF_GRAPH_GET_LITERAL_CACHED_CACHING_STATE_ = makeSymbol( "*RDF-GRAPH-GET-LITERAL-CACHED-CACHING-STATE*" );
    $str68$XMLLiteral = makeString( "XMLLiteral" );
    $kw69$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $sym70$RDF_NODES_EQUAL_ = makeSymbol( "RDF-NODES-EQUAL?" );
    $sym71$RDF_GRAPH = makeSymbol( "RDF-GRAPH" );
    $list72 = ConsesLow.list( new SubLObject[] { makeSymbol( "TRIPLES" ), makeSymbol( "NODES" ), makeSymbol( "INDEX" ), makeSymbol( "LOCK" ), makeSymbol( "NODE-COUNT" ), makeSymbol( "PREFIX-MAP" ), makeSymbol(
        "FILE-LOCATION" ), makeSymbol( "TOPIC" ), makeSymbol( "FOCAL-NODES" )
    } );
    $list73 = ConsesLow.list( new SubLObject[] { makeKeyword( "TRIPLES" ), makeKeyword( "NODES" ), makeKeyword( "INDEX" ), makeKeyword( "LOCK" ), makeKeyword( "NODE-COUNT" ), makeKeyword( "PREFIX-MAP" ), makeKeyword(
        "FILE-LOCATION" ), makeKeyword( "TOPIC" ), makeKeyword( "FOCAL-NODES" )
    } );
    $list74 = ConsesLow.list( new SubLObject[] { makeSymbol( "RDF-GRAPH-STRUCT-TRIPLES" ), makeSymbol( "RDF-GRAPH-STRUCT-NODES" ), makeSymbol( "RDF-GRAPH-STRUCT-INDEX" ), makeSymbol( "RDF-GRAPH-STRUCT-LOCK" ),
      makeSymbol( "RDF-GRAPH-STRUCT-NODE-COUNT" ), makeSymbol( "RDF-GRAPH-STRUCT-PREFIX-MAP" ), makeSymbol( "RDF-GRAPH-STRUCT-FILE-LOCATION" ), makeSymbol( "RDF-GRAPH-STRUCT-TOPIC" ), makeSymbol(
          "RDF-GRAPH-STRUCT-FOCAL-NODES" )
    } );
    $list75 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-TRIPLES" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-NODES" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-INDEX" ), makeSymbol(
        "_CSETF-RDF-GRAPH-STRUCT-LOCK" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION" ), makeSymbol(
            "_CSETF-RDF-GRAPH-STRUCT-TOPIC" ), makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES" )
    } );
    $sym76$PRINT_RDF_GRAPH = makeSymbol( "PRINT-RDF-GRAPH" );
    $sym77$RDF_GRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RDF-GRAPH-PRINT-FUNCTION-TRAMPOLINE" );
    $list78 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RDF-GRAPH-P" ) );
    $sym79$RDF_GRAPH_STRUCT_TRIPLES = makeSymbol( "RDF-GRAPH-STRUCT-TRIPLES" );
    $sym80$_CSETF_RDF_GRAPH_STRUCT_TRIPLES = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-TRIPLES" );
    $sym81$RDF_GRAPH_STRUCT_NODES = makeSymbol( "RDF-GRAPH-STRUCT-NODES" );
    $sym82$_CSETF_RDF_GRAPH_STRUCT_NODES = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-NODES" );
    $sym83$RDF_GRAPH_STRUCT_INDEX = makeSymbol( "RDF-GRAPH-STRUCT-INDEX" );
    $sym84$_CSETF_RDF_GRAPH_STRUCT_INDEX = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-INDEX" );
    $sym85$RDF_GRAPH_STRUCT_LOCK = makeSymbol( "RDF-GRAPH-STRUCT-LOCK" );
    $sym86$_CSETF_RDF_GRAPH_STRUCT_LOCK = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-LOCK" );
    $sym87$RDF_GRAPH_STRUCT_NODE_COUNT = makeSymbol( "RDF-GRAPH-STRUCT-NODE-COUNT" );
    $sym88$_CSETF_RDF_GRAPH_STRUCT_NODE_COUNT = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-NODE-COUNT" );
    $sym89$RDF_GRAPH_STRUCT_PREFIX_MAP = makeSymbol( "RDF-GRAPH-STRUCT-PREFIX-MAP" );
    $sym90$_CSETF_RDF_GRAPH_STRUCT_PREFIX_MAP = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-PREFIX-MAP" );
    $sym91$RDF_GRAPH_STRUCT_FILE_LOCATION = makeSymbol( "RDF-GRAPH-STRUCT-FILE-LOCATION" );
    $sym92$_CSETF_RDF_GRAPH_STRUCT_FILE_LOCATION = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-FILE-LOCATION" );
    $sym93$RDF_GRAPH_STRUCT_TOPIC = makeSymbol( "RDF-GRAPH-STRUCT-TOPIC" );
    $sym94$_CSETF_RDF_GRAPH_STRUCT_TOPIC = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-TOPIC" );
    $sym95$RDF_GRAPH_STRUCT_FOCAL_NODES = makeSymbol( "RDF-GRAPH-STRUCT-FOCAL-NODES" );
    $sym96$_CSETF_RDF_GRAPH_STRUCT_FOCAL_NODES = makeSymbol( "_CSETF-RDF-GRAPH-STRUCT-FOCAL-NODES" );
    $kw97$TRIPLES = makeKeyword( "TRIPLES" );
    $kw98$NODES = makeKeyword( "NODES" );
    $kw99$INDEX = makeKeyword( "INDEX" );
    $kw100$LOCK = makeKeyword( "LOCK" );
    $kw101$NODE_COUNT = makeKeyword( "NODE-COUNT" );
    $kw102$PREFIX_MAP = makeKeyword( "PREFIX-MAP" );
    $kw103$FILE_LOCATION = makeKeyword( "FILE-LOCATION" );
    $kw104$TOPIC = makeKeyword( "TOPIC" );
    $kw105$FOCAL_NODES = makeKeyword( "FOCAL-NODES" );
    $str106$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw107$BEGIN = makeKeyword( "BEGIN" );
    $sym108$MAKE_RDF_GRAPH = makeSymbol( "MAKE-RDF-GRAPH" );
    $kw109$SLOT = makeKeyword( "SLOT" );
    $kw110$END = makeKeyword( "END" );
    $sym111$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-METHOD" );
    $str112$_RDF_GRAPH__A_ = makeString( "<RDF-GRAPH ~A>" );
    $str113$RDF_GRAPH = makeString( "RDF GRAPH" );
    $sym114$RDF_GRAPH_DO_SUBJECTS = makeSymbol( "RDF-GRAPH-DO-SUBJECTS" );
    $list115 = ConsesLow.cons( makeSymbol( "ATTRIBUTE" ), makeSymbol( "VALUE" ) );
    $str116$xmlns = makeString( "xmlns" );
    $str117$xml_base = makeString( "xml:base" );
    $str118$xmlns_ = makeString( "xmlns:" );
    $sym119$URI_P = makeSymbol( "URI-P" );
    $str120$_ = makeString( ":" );
    $str121$en = makeString( "en" );
    $sym122$RDF_LITERAL_LANGUAGE_TAG = makeSymbol( "RDF-LITERAL-LANGUAGE-TAG" );
    $str123$http = makeString( "http" );
    $sym124$SXHASH_RDF_GRAPH_METHOD = makeSymbol( "SXHASH-RDF-GRAPH-METHOD" );
    $sym125$RDF_GRAPH_INDEX_SUB_INDEXES = makeSymbol( "RDF-GRAPH-INDEX-SUB-INDEXES" );
    $sym126$_RDF_GRAPH_INDEX_SUB_INDEXES_CACHING_STATE_ = makeSymbol( "*RDF-GRAPH-INDEX-SUB-INDEXES-CACHING-STATE*" );
    $sym127$RDF_TRIPLE_POSITION_P = makeSymbol( "RDF-TRIPLE-POSITION-P" );
    $sym128$APPEND = makeSymbol( "APPEND" );
    $sym129$SET_ELEMENT_LIST = makeSymbol( "SET-ELEMENT-LIST" );
    $sym130$RDF_GRAPH_INDEX = makeSymbol( "RDF-GRAPH-INDEX" );
    $sym131$RDF_GRAPH_INDEX_P = makeSymbol( "RDF-GRAPH-INDEX-P" );
    $list132 = ConsesLow.list( makeSymbol( "SUBJECT-INDEX" ), makeSymbol( "PREDICATE-INDEX" ), makeSymbol( "OBJECT-INDEX" ) );
    $list133 = ConsesLow.list( makeKeyword( "SUBJECT-INDEX" ), makeKeyword( "PREDICATE-INDEX" ), makeKeyword( "OBJECT-INDEX" ) );
    $list134 = ConsesLow.list( makeSymbol( "RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX" ), makeSymbol( "RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX" ), makeSymbol( "RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX" ) );
    $list135 = ConsesLow.list( makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX" ), makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX" ), makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX" ) );
    $sym136$PRINT_RDF_GRAPH_INDEX = makeSymbol( "PRINT-RDF-GRAPH-INDEX" );
    $sym137$RDF_GRAPH_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RDF-GRAPH-INDEX-PRINT-FUNCTION-TRAMPOLINE" );
    $list138 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RDF-GRAPH-INDEX-P" ) );
    $sym139$RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX = makeSymbol( "RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX" );
    $sym140$_CSETF_RDF_GRAPH_INDEX_STRUCT_SUBJECT_INDEX = makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-SUBJECT-INDEX" );
    $sym141$RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX = makeSymbol( "RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX" );
    $sym142$_CSETF_RDF_GRAPH_INDEX_STRUCT_PREDICATE_INDEX = makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-PREDICATE-INDEX" );
    $sym143$RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX = makeSymbol( "RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX" );
    $sym144$_CSETF_RDF_GRAPH_INDEX_STRUCT_OBJECT_INDEX = makeSymbol( "_CSETF-RDF-GRAPH-INDEX-STRUCT-OBJECT-INDEX" );
    $kw145$SUBJECT_INDEX = makeKeyword( "SUBJECT-INDEX" );
    $kw146$PREDICATE_INDEX = makeKeyword( "PREDICATE-INDEX" );
    $kw147$OBJECT_INDEX = makeKeyword( "OBJECT-INDEX" );
    $sym148$MAKE_RDF_GRAPH_INDEX = makeSymbol( "MAKE-RDF-GRAPH-INDEX" );
    $sym149$VISIT_DEFSTRUCT_OBJECT_RDF_GRAPH_INDEX_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RDF-GRAPH-INDEX-METHOD" );
    $str150$_RDF_GRAPH_INDEX_ = makeString( "<RDF-GRAPH-INDEX>" );
    $sym151$SXHASH_RDF_GRAPH_INDEX_METHOD = makeSymbol( "SXHASH-RDF-GRAPH-INDEX-METHOD" );
    $str152$______A__A__A___ = makeString( "~&  (~A ~A ~A)~%" );
    $str153$Comparing_graph1___A_triples___A_ = makeString( "Comparing graph1 (~A triples, ~A nodes, ~A focal)~%  against graph2 (~A triples, ~A nodes, ~A focal)~%" );
    $str154$Comparing_focal_nodes___A_compare = makeString( "Comparing focal nodes (~A compares)..." );
    $str155$Comparing_all_nodes___A_compares_ = makeString( "Comparing all nodes (~A compares)..." );
    $sym156$RDF_TRIPLES_EQUAL_WITH_SYMMETRY_ = makeSymbol( "RDF-TRIPLES-EQUAL-WITH-SYMMETRY?" );
    $sym157$_EXIT = makeSymbol( "%EXIT" );
    $sym158$RDF_TRIPLE_PAIR_EQUAL_ = makeSymbol( "RDF-TRIPLE-PAIR-EQUAL?" );
    $sym159$RDF_TRIPLES_ISOMORPHIC__INT = makeSymbol( "RDF-TRIPLES-ISOMORPHIC?-INT" );
    $sym160$RDF_NODE_SYMMETRIC_PREDICATE_ = makeSymbol( "RDF-NODE-SYMMETRIC-PREDICATE?" );
    $str161$owl_complementOf = makeString( "owl:complementOf" );
    $str162$owl_disjointWith = makeString( "owl:disjointWith" );
    $str163$owl_equivalentClass = makeString( "owl:equivalentClass" );
    $str164$owl_equivalentProperty = makeString( "owl:equivalentProperty" );
    $str165$owl_incompatibleWith = makeString( "owl:incompatibleWith" );
    $str166$owl_inverseOf = makeString( "owl:inverseOf" );
    $sym167$GET_KNOWN_URI = makeSymbol( "GET-KNOWN-URI" );
    $str168$owl_ = makeString( "owl:" );
    $str169$rdf_ = makeString( "rdf:" );
    $str170$rdfs_ = makeString( "rdfs:" );
    $str171$xsd_ = makeString( "xsd:" );
    $const172$rdfURI = constant_handles.reader_make_constant_shell( makeString( "rdfURI" ) );
    $const173$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list174 = ConsesLow.list( makeString( ":" ) );
    $list175 = ConsesLow.list( makeString( "owl" ), makeString( "rdf" ), makeString( "rdfs" ), makeString( "xsd" ) );
    $sym176$STRING_ = makeSymbol( "STRING=" );
    $list177 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "LOCAL-PART" ) );
    $str178$owl = makeString( "owl" );
    $str179$rdf = makeString( "rdf" );
    $str180$rdfs = makeString( "rdfs" );
    $str181$xsd = makeString( "xsd" );
    $str182$get_known_uri_called_with_unhandl = makeString( "get-known-uri called with unhandled object ~S" );
    $sym183$TEST_RDF_GRAPH = makeSymbol( "TEST-RDF-GRAPH" );
    $kw184$TEST = makeKeyword( "TEST" );
    $kw185$OWNER = makeKeyword( "OWNER" );
    $kw186$CLASSES = makeKeyword( "CLASSES" );
    $list187 = ConsesLow.list( makeSymbol( "RDF-TEST-CASE-TABLES" ) );
    $kw188$KB = makeKeyword( "KB" );
    $kw189$TINY = makeKeyword( "TINY" );
    $kw190$WORKING_ = makeKeyword( "WORKING?" );
    $list191 = ConsesLow.list( ConsesLow.list( NIL, T ) );
    $const192$Emu = constant_handles.reader_make_constant_shell( makeString( "Emu" ) );
    $const193$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const194$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $const195$Bird = constant_handles.reader_make_constant_shell( makeString( "Bird" ) );
    $const196$CurrentWorldDataCollectorMt = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt" ) );
    $str197$FOO = makeString( "FOO" );
    $str198$foo = makeString( "foo" );
    $str199$Failed_to_canonicalize_ = makeString( "Failed to canonicalize." );
    $str200$Got_non_EQ_URIs_for___Emu_ = makeString( "Got non-EQ URIs for #$Emu." );
    $str201$Got_non_EQ_literals_for_comment_l = makeString( "Got non-EQ literals for comment-literal." );
    $str202$Couldn_t_find_equivalent_triple_ = makeString( "Couldn't find equivalent triple." );
    $str203$Failed_to_realize_that_triple_was = makeString( "Failed to realize that triple was already there when subject specified via struct." );
    $str204$Failed_to_realize_that_triple_was = makeString( "Failed to realize that triple was already there when subject specified via string." );
    $str205$Can_t_find_URI_for__S = makeString( "Can't find URI for ~S" );
    $str206$Expecting_3_nodes_left__Actual_co = makeString( "Expecting 3 nodes left. Actual count: ~D" );
    $str207$Graph_does_not_genls_triple_we_ju = makeString( "Graph does not genls triple we just added." );
    $str208$Expected_1_subject_triple_for_emu = makeString( "Expected 1 subject triple for emu. Got ~D" );
    $str209$Expected_1_subject_for_genls_bird = makeString( "Expected 1 subject for genls bird Got ~D" );
    $str210$Expecting_5_nodes_left__Actual_co = makeString( "Expecting 5 nodes left. Actual count: ~D" );
    $str211$Graph_does_not_comment_triple_we_ = makeString( "Graph does not comment triple we just added." );
    $str212$Graph_contains_genls_triple_we_ju = makeString( "Graph contains genls triple we just removed" );
    $str213$Graph_does_not_big_foo_triple_we_ = makeString( "Graph does not big-foo triple we just added." );
    $str214$Graph_does_not_little_foo_triple_ = makeString( "Graph does not little-foo triple we just added." );
    $str215$Looked_for_big_foo__got_little_fo = makeString( "Looked for big-foo, got little-foo." );
  }

  public static final class $rdf_graph_native
      extends
        SubLStructNative
  {
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

    public $rdf_graph_native()
    {
      this.$triples = CommonSymbols.NIL;
      this.$nodes = CommonSymbols.NIL;
      this.$index = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
      this.$node_count = CommonSymbols.NIL;
      this.$prefix_map = CommonSymbols.NIL;
      this.$file_location = CommonSymbols.NIL;
      this.$topic = CommonSymbols.NIL;
      this.$focal_nodes = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rdf_graph_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$triples;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$nodes;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$index;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$node_count;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$prefix_map;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$file_location;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$topic;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$focal_nodes;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$triples = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$nodes = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$index = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$node_count = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$prefix_map = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$file_location = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$topic = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$focal_nodes = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rdf_graph_native.class, $sym71$RDF_GRAPH, $sym1$RDF_GRAPH_P, $list72, $list73, new String[] { "$triples", "$nodes", "$index", "$lock", "$node_count", "$prefix_map",
        "$file_location", "$topic", "$focal_nodes"
      }, $list74, $list75, $sym76$PRINT_RDF_GRAPH );
    }
  }

  public static final class $rdf_graph_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rdf_graph_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RDF-GRAPH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rdf_graph_p( arg1 );
    }
  }

  public static final class $rdf_graph_index_native
      extends
        SubLStructNative
  {
    public SubLObject $subject_index;
    public SubLObject $predicate_index;
    public SubLObject $object_index;
    private static final SubLStructDeclNative structDecl;

    public $rdf_graph_index_native()
    {
      this.$subject_index = CommonSymbols.NIL;
      this.$predicate_index = CommonSymbols.NIL;
      this.$object_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rdf_graph_index_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$subject_index;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$predicate_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$object_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$subject_index = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$predicate_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$object_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rdf_graph_index_native.class, $sym130$RDF_GRAPH_INDEX, $sym131$RDF_GRAPH_INDEX_P, $list132, $list133, new String[] { "$subject_index", "$predicate_index",
        "$object_index"
      }, $list134, $list135, $sym136$PRINT_RDF_GRAPH_INDEX );
    }
  }

  public static final class $rdf_graph_index_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rdf_graph_index_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RDF-GRAPH-INDEX-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rdf_graph_index_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1316 ms synthetic
 */