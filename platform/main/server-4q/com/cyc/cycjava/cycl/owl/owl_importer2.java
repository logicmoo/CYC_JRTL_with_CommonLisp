/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.api_control_vars.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.czer_main.*;
import static com.cyc.cycjava.cycl.dictionary.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.cycjava.cycl.integer_sequence_generator.*;
import static com.cyc.cycjava.cycl.iteration.*;
import static com.cyc.cycjava.cycl.kb_accessors.*;
import static com.cyc.cycjava.cycl.ke.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.narts_high.*;
import static com.cyc.cycjava.cycl.number_utilities.*;
import static com.cyc.cycjava.cycl.operation_communication.*;
import static com.cyc.cycjava.cycl.owl.owl_utilities.*;
import static com.cyc.cycjava.cycl.rdf.rdf_blank_node.*;
import static com.cyc.cycjava.cycl.rdf.rdf_graph.*;
import static com.cyc.cycjava.cycl.rdf.rdf_literal.*;
import static com.cyc.cycjava.cycl.rdf.rdf_parser.*;
import static com.cyc.cycjava.cycl.rdf.rdf_triple.*;
import static com.cyc.cycjava.cycl.rdf.rdf_uri.*;
import static com.cyc.cycjava.cycl.rdf.rdf_utilities.*;
import static com.cyc.cycjava.cycl.set.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_literal;
import com.cyc.cycjava.cycl.rdf.rdf_parser;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OWL-IMPORTER2
 * source file: /cyc/top/cycl/owl/owl-importer2.lisp
 * created:     2019/07/03 17:38:14
 */
public final class owl_importer2 extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt75$ = makeString("");

    public static final SubLFile me = new owl_importer2();

 public static final String myName = "com.cyc.cycjava.cycl.owl.owl_importer2";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $owl_importer2_valid_options$ = makeSymbol("*OWL-IMPORTER2-VALID-OPTIONS*");

    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_importer2_version_number$ = makeSymbol("*OWL-IMPORTER2-VERSION-NUMBER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_owl_importer2$ = makeSymbol("*DTP-OWL-IMPORTER2*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_importer2_id_isg$ = makeSymbol("*OWL-IMPORTER2-ID-ISG*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_importer2_id_map$ = makeSymbol("*OWL-IMPORTER2-ID-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $owl_importer2_subject_stack$ = makeSymbol("*OWL-IMPORTER2-SUBJECT-STACK*");

    private static final SubLList $list0 = list(new SubLObject[]{ makeKeyword("ONTOLOGY-URI"), makeKeyword("ONTOLOGY-TERM"), makeKeyword("ONTOLOGY-MT"), makeKeyword("URI-PREFIX"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES"), makeKeyword("SYNONYMOUS-CONCEPT-PREFIX"), makeKeyword("CYCLIST"), makeKeyword("TEST-MODE"), makeKeyword("VERBOSE?"), makeKeyword("PROGRESS-STREAM"), makeKeyword("GRAPH-TRANSLATION-FUNCTIONS"), makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?"), makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?"), makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?") });

    private static final SubLString $str1$OWL_Importer_usages___ = makeString("OWL Importer usages:~%");

    private static final SubLString $str2$_owl_import_uri__uri__optional_im = makeString(" owl-import-uri (uri &optional importer-options)~%");

    private static final SubLString $str3$_owl_import_file__filename__optio = makeString(" owl-import-file (filename &optional importer-options)~%");

    private static final SubLString $str4$_owl_import_uri_from_file__uri_fi = makeString(" owl-import-uri-from-file (uri filename &optional importer-options)~%");

    private static final SubLSymbol OWL_IMPORT_URI = makeSymbol("OWL-IMPORT-URI");

    private static final SubLString $str6$owl_import_uri = makeString("owl-import-uri");

    private static final SubLList $list7 = list(makeKeyword("URI"), makeKeyword("IMPORTER-OPTIONS"));

    private static final SubLString $str8$Download_of_URI__S_to_temp_file_f = makeString("Download of URI ~S to temp file failed.");

    private static final SubLSymbol $SYNONYMOUS_CONCEPT_PREFIX = makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");

    private static final SubLString $str10$ = makeString("");

    private static final SubLSymbol OWL_IMPORT_FILE = makeSymbol("OWL-IMPORT-FILE");

    private static final SubLString $str15$owl_import_file = makeString("owl-import-file");

    static private final SubLList $list16 = list(makeKeyword("FILENAME"), makeKeyword("IMPORTER-OPTIONS"));

    private static final SubLSymbol OWL_IMPORT_URI_FROM_FILE = makeSymbol("OWL-IMPORT-URI-FROM-FILE");

    private static final SubLString $str19$owl_import_uri_from_file = makeString("owl-import-uri-from-file");

    private static final SubLList $list20 = list(makeKeyword("URI"), makeKeyword("FILENAME"), makeKeyword("IMPORTER-OPTIONS"));

    private static final SubLSymbol OWL_IMPORT_XML_GRAPH_FROM_FILE = makeSymbol("OWL-IMPORT-XML-GRAPH-FROM-FILE");

    private static final SubLString $str24$Importing_XML___ = makeString("Importing XML...");

    private static final SubLString $str26$__Using_local_URI_part_for___syno = makeString("~&Using local URI part for #$synonymousExternalConcept assertions~%");

    private static final SubLString $str27$__Using_URI_prefix___A__for___syn = makeString("~&Using URI prefix \"~A\" for #$synonymousExternalConcept assertions~%");

    private static final SubLString $str28$__Using_full_URIs_for___synonymou = makeString("~&Using full URIs for #$synonymousExternalConcept assertions~%");

    private static final SubLString $str29$__Note_that_synonymous_concept_pr = makeString("~&Note that synonymous-concept-prefix of ~S and uri-prefix of ~S do not match~%");

    private static final SubLString $str32$_ = makeString(":");

    private static final SubLString $str34$Changing_constant_prefix_from__S_ = makeString("Changing constant prefix from ~S to ~S to avoid invalid chars~%");

    private static final SubLString $str35$__Using_prefix___A__for_new_const = makeString("~&Using prefix \"~A\" for new constants~%");

    private static final SubLString $str36$__Using_suffix___A__for_new_const = makeString("~&Using suffix \"~A\" for new constants~%");

    private static final SubLString $str37$__Using___ResourceWithURIFn_NARTs = makeString("~&Using #$ResourceWithURIFn NARTs~%");









    private static final SubLString $str44$__Using_ontology_term_ = makeString("~&Using ontology-term ");

    private static final SubLString $str45$__Using_ontology_mt_ = makeString("~&Using ontology-mt ");

    private static final SubLString $str46$__Using_ontology_term__S__ = makeString("~&Using ontology-term ~S~%");

    private static final SubLString $str47$__Using_ontology_mt__S__ = makeString("~&Using ontology-mt ~S~%");

    private static final SubLList $list48 = cons(makeSymbol("PREFIX"), makeSymbol("URI-STRING"));

    private static final SubLString $str49$xml_base = makeString("xml:base");







    private static final SubLSymbol $GRAPH_TRANSLATION_FUNCTIONS = makeKeyword("GRAPH-TRANSLATION-FUNCTIONS");

    private static final SubLString $str57$_A_triples__ = makeString("~A triples~%");

    private static final SubLString $str58$_A_nodes__ = makeString("~A nodes~%");

    private static final SubLSymbol $sym60$SUPERSTRING_ = makeSymbol("SUPERSTRING?");

    private static final SubLSymbol $sym62$_ = makeSymbol(">");

    private static final SubLSymbol $sym64$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str66$_A__URI__S_is_not_valid__ = makeString("~A: URI ~S is not valid~%");

    private static final SubLString $str68$_A__FILENAME__S_does_not_exist__ = makeString("~A: FILENAME ~S does not exist~%");

    private static final SubLString $str70$_A__IMPORTER_OPTIONS__S_is_not_a_ = makeString("~A: IMPORTER-OPTIONS ~S is not a valid property list~%");



    private static final SubLString $str72$_A__IMPORTER_OPTIONS__cyclist__A_ = makeString("~A: IMPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%");



    private static final SubLString $str74$_A__Please_log_in_with__set_the_c = makeString("~A: Please log in with (set-the-cyclist [Cyc Account])~%");

    private static final SubLString $str75$_A__IMPORTER_OPTIONS_has_invalid_ = makeString("~A: IMPORTER-OPTIONS has invalid keys: ~A~%");

    private static final SubLString $str76$Errors_found__aborting_import___ = makeString("Errors found, aborting import...");

    private static final SubLSymbol $sym77$_OWL_IMPORTER2_VERSION_NUMBER_ = makeSymbol("*OWL-IMPORTER2-VERSION-NUMBER*");

    private static final SubLString $str78$_revision__1_2__ = makeString("$revision: 1.2 $");

    private static final SubLString $$$2 = makeString("2");



    private static final SubLObject $$OWLImporter_Cyc = reader_make_constant_shell("OWLImporter-Cyc");



    private static final SubLString $$$type = makeString("type");

    private static final SubLString $$$Ontology = makeString("Ontology");

    private static final SubLSymbol OWL_IMPORTER2 = makeSymbol("OWL-IMPORTER2");

    private static final SubLSymbol OWL_IMPORTER2_P = makeSymbol("OWL-IMPORTER2-P");

    private static final SubLList $list92 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("URI"), makeSymbol("FILE"), makeSymbol("GRAPH"), makeSymbol("CYCLIST"), makeSymbol("IMPORT"), makeSymbol("ONTOLOGIES"), makeSymbol("TERMS"), makeSymbol("SENTENCES"), makeSymbol("STATS"), makeSymbol("OPTIONS"), makeSymbol("THREAD") });

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("URI"), $FILE, makeKeyword("GRAPH"), makeKeyword("CYCLIST"), makeKeyword("IMPORT"), makeKeyword("ONTOLOGIES"), makeKeyword("TERMS"), makeKeyword("SENTENCES"), makeKeyword("STATS"), makeKeyword("OPTIONS"), makeKeyword("THREAD") });

    private static final SubLList $list94 = list(new SubLObject[]{ makeSymbol("OWL-IMP2-ID"), makeSymbol("OWL-IMP2-URI"), makeSymbol("OWL-IMP2-FILE"), makeSymbol("OWL-IMP2-GRAPH"), makeSymbol("OWL-IMP2-CYCLIST"), makeSymbol("OWL-IMP2-IMPORT"), makeSymbol("OWL-IMP2-ONTOLOGIES"), makeSymbol("OWL-IMP2-TERMS"), makeSymbol("OWL-IMP2-SENTENCES"), makeSymbol("OWL-IMP2-STATS"), makeSymbol("OWL-IMP2-OPTIONS"), makeSymbol("OWL-IMP2-THREAD") });

    private static final SubLList $list95 = list(new SubLObject[]{ makeSymbol("_CSETF-OWL-IMP2-ID"), makeSymbol("_CSETF-OWL-IMP2-URI"), makeSymbol("_CSETF-OWL-IMP2-FILE"), makeSymbol("_CSETF-OWL-IMP2-GRAPH"), makeSymbol("_CSETF-OWL-IMP2-CYCLIST"), makeSymbol("_CSETF-OWL-IMP2-IMPORT"), makeSymbol("_CSETF-OWL-IMP2-ONTOLOGIES"), makeSymbol("_CSETF-OWL-IMP2-TERMS"), makeSymbol("_CSETF-OWL-IMP2-SENTENCES"), makeSymbol("_CSETF-OWL-IMP2-STATS"), makeSymbol("_CSETF-OWL-IMP2-OPTIONS"), makeSymbol("_CSETF-OWL-IMP2-THREAD") });

    private static final SubLSymbol PRINT_OWL_IMPORTER2 = makeSymbol("PRINT-OWL-IMPORTER2");

    private static final SubLSymbol OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list98 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-IMPORTER2-P"));

    private static final SubLSymbol OWL_IMP2_ID = makeSymbol("OWL-IMP2-ID");

    private static final SubLSymbol _CSETF_OWL_IMP2_ID = makeSymbol("_CSETF-OWL-IMP2-ID");

    private static final SubLSymbol OWL_IMP2_URI = makeSymbol("OWL-IMP2-URI");

    private static final SubLSymbol _CSETF_OWL_IMP2_URI = makeSymbol("_CSETF-OWL-IMP2-URI");

    private static final SubLSymbol OWL_IMP2_FILE = makeSymbol("OWL-IMP2-FILE");

    private static final SubLSymbol _CSETF_OWL_IMP2_FILE = makeSymbol("_CSETF-OWL-IMP2-FILE");

    private static final SubLSymbol OWL_IMP2_GRAPH = makeSymbol("OWL-IMP2-GRAPH");

    private static final SubLSymbol _CSETF_OWL_IMP2_GRAPH = makeSymbol("_CSETF-OWL-IMP2-GRAPH");

    private static final SubLSymbol OWL_IMP2_CYCLIST = makeSymbol("OWL-IMP2-CYCLIST");

    private static final SubLSymbol _CSETF_OWL_IMP2_CYCLIST = makeSymbol("_CSETF-OWL-IMP2-CYCLIST");

    private static final SubLSymbol OWL_IMP2_IMPORT = makeSymbol("OWL-IMP2-IMPORT");

    private static final SubLSymbol _CSETF_OWL_IMP2_IMPORT = makeSymbol("_CSETF-OWL-IMP2-IMPORT");

    private static final SubLSymbol OWL_IMP2_ONTOLOGIES = makeSymbol("OWL-IMP2-ONTOLOGIES");

    private static final SubLSymbol _CSETF_OWL_IMP2_ONTOLOGIES = makeSymbol("_CSETF-OWL-IMP2-ONTOLOGIES");

    private static final SubLSymbol OWL_IMP2_TERMS = makeSymbol("OWL-IMP2-TERMS");

    private static final SubLSymbol _CSETF_OWL_IMP2_TERMS = makeSymbol("_CSETF-OWL-IMP2-TERMS");

    private static final SubLSymbol OWL_IMP2_SENTENCES = makeSymbol("OWL-IMP2-SENTENCES");

    private static final SubLSymbol _CSETF_OWL_IMP2_SENTENCES = makeSymbol("_CSETF-OWL-IMP2-SENTENCES");

    private static final SubLSymbol OWL_IMP2_STATS = makeSymbol("OWL-IMP2-STATS");

    private static final SubLSymbol _CSETF_OWL_IMP2_STATS = makeSymbol("_CSETF-OWL-IMP2-STATS");

    private static final SubLSymbol OWL_IMP2_OPTIONS = makeSymbol("OWL-IMP2-OPTIONS");

    private static final SubLSymbol _CSETF_OWL_IMP2_OPTIONS = makeSymbol("_CSETF-OWL-IMP2-OPTIONS");

    private static final SubLSymbol OWL_IMP2_THREAD = makeSymbol("OWL-IMP2-THREAD");

    private static final SubLSymbol _CSETF_OWL_IMP2_THREAD = makeSymbol("_CSETF-OWL-IMP2-THREAD");

    private static final SubLString $str133$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_OWL_IMPORTER2 = makeSymbol("MAKE-OWL-IMPORTER2");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER2-METHOD");

    private static final SubLString $str139$_OWL_IMPORTER__D_for__A_ = makeString("<OWL-IMPORTER ~D for ~A>");

    private static final SubLSymbol URL_P = makeSymbol("URL-P");

    private static final SubLSymbol $sym141$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    private static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    private static final SubLString $str145$No_import_owl_Ontology_URI_found_ = makeString("No import owl:Ontology URI found.  Aborting.");



    private static final SubLSymbol $sym147$_OWL_IMPORTER2_ID_ISG_ = makeSymbol("*OWL-IMPORTER2-ID-ISG*");

    private static final SubLSymbol $sym148$_OWL_IMPORTER2_ID_MAP_ = makeSymbol("*OWL-IMPORTER2-ID-MAP*");

    private static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    private static final SubLSymbol SXHASH_OWL_IMPORTER2_METHOD = makeSymbol("SXHASH-OWL-IMPORTER2-METHOD");

    private static final SubLString $$$Importing_ = makeString("Importing ");

    private static final SubLString $str154$_triples___ = makeString(" triples...");

    private static final SubLString $str155$node_count___A__ = makeString("node-count: ~A~%");

    private static final SubLString $str156$real_node_count___A__ = makeString("real-node-count: ~A~%");

    private static final SubLString $str157$triple_count___A__ = makeString("triple-count: ~A~%");

    private static final SubLString $str158$real_triple_count___A__ = makeString("real-triple-count: ~A~%");



    private static final SubLString $str160$Assert_nesting_depth___D = makeString("Assert nesting depth: ~D");



    private static final SubLList $list162 = list(reader_make_constant_shell("OWLProperty"));

    private static final SubLString $str163$Failed_to_assert__S_in__S = makeString("Failed to assert ~S in ~S");

    private static final SubLString $str164$__ = makeString("~%");

    private static final SubLString $str165$_S_is_not_a_list_node_ = makeString("~S is not a list node.");

    private static final SubLString $$$nil = makeString("nil");





    private static final SubLString $$$first = makeString("first");

    private static final SubLSymbol RDF_TRIPLE_PREDICATE = makeSymbol("RDF-TRIPLE-PREDICATE");

    private static final SubLString $$$rest = makeString("rest");

    private static final SubLString $str172$Can_t_find_or_create_term_for__S = makeString("Can't find or create term for ~S");

    private static final SubLSymbol $kw173$USE_GENLS_FOR_RDFS_SUBCLASS_ = makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?");

    private static final SubLString $str174$rdfs_subClassOf = makeString("rdfs:subClassOf");



    private static final SubLString $str176$Could_not_find_Cyc_term_for_URI__ = makeString("Could not find Cyc term for URI ~A");

    private static final SubLSymbol $USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES = makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");











    private static final SubLSymbol $kw183$USE_RDFS_LABEL_FOR_CONSTANT_NAME_ = makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?");

    private static final SubLString $str184$rdfs_label = makeString("rdfs:label");

    private static final SubLString $str185$rdf_type = makeString("rdf:type");

    private static final SubLString $str186$owl_Class = makeString("owl:Class");

    private static final SubLSymbol CYC_URI_P = makeSymbol("CYC-URI-P");

    private static final SubLString $$$intersectionOf = makeString("intersectionOf");





    private static final SubLString $$$unionOf = makeString("unionOf");



    private static final SubLString $$$complementOf = makeString("complementOf");





    private static final SubLString $$$onProperty = makeString("onProperty");

    private static final SubLString $$$allValuesFrom = makeString("allValuesFrom");

    private static final SubLString $$$hasValue = makeString("hasValue");

    private static final SubLString $$$someValuesFrom = makeString("someValuesFrom");

    private static final SubLString $$$valuesFrom = makeString("valuesFrom");

    private static final SubLString $$$subClassOf = makeString("subClassOf");

    private static final SubLString $$$cardinality = makeString("cardinality");

    private static final SubLString $$$minCardinality = makeString("minCardinality");

    private static final SubLString $$$maxCardinality = makeString("maxCardinality");

    private static final SubLSymbol $kw205$ONLY_ASSERT_RESTRICTIONS_AS_RMP_GAFS_ = makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?");







    private static final SubLSymbol $sym209$_X = makeSymbol("?X");





















    private static final SubLString $str220$restriction_not_handled_yet___A__ = makeString("restriction not handled yet: ~A~% ~A~% ~A~% ~A~%");

    private static final SubLString $$$oneOf = makeString("oneOf");



    private static final SubLString $$$AnonymousOWLTerm = makeString("AnonymousOWLTerm");





    private static final SubLSymbol RDF_TRIPLE_SUBJECT = makeSymbol("RDF-TRIPLE-SUBJECT");

    private static final SubLString $str227$___A_was_not_the_object_of_any_rd = makeString("~&~A was not the object of any rdfs:subClassOf triples!  No RMP assertion made.~%");

    private static final SubLString $str228$Eliminating_blank_nodes___ = makeString("Eliminating blank nodes...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str230$rdfs_domain = makeString("rdfs:domain");

    private static final SubLString $str231$owl_Thing = makeString("owl:Thing");

    private static final SubLString $str232$rdfs_range = makeString("rdfs:range");

    private static final SubLSymbol RDF_TRIPLE_OBJECT = makeSymbol("RDF-TRIPLE-OBJECT");

    private static final SubLString $str234$rdf_Property = makeString("rdf:Property");

    public static SubLObject show_owl_import_usages() {
        format_nil.force_format(T, owl_importer2.$str1$OWL_Importer_usages___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, owl_importer2.$str2$_owl_import_uri__uri__optional_im, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, owl_importer2.$str3$_owl_import_file__filename__optio, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, owl_importer2.$str4$_owl_import_uri_from_file__uri_fi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject owl_import_uri(final SubLObject uri, SubLObject importer_options) {
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        importer_options = copy_list(importer_options);
        owl_importer2.validate_owl_import_parameters(owl_importer2.$str6$owl_import_uri, list_utilities.make_plist(owl_importer2.$list7, list(uri, importer_options)));
        final SubLObject filename = rdf_utilities.download_rdf_url(uri, UNPROVIDED);
        if (NIL == file_utilities.file_existsP(filename)) {
            Errors.error(owl_importer2.$str8$Download_of_URI__S_to_temp_file_f, uri);
        }
        final SubLObject cyclist = owl_importer2.owl_importer_dwim_a_cyclist(importer_options);
        final SubLObject importer = owl_importer2.get_owl_importer2_for_file(filename, cyclist, uri);
        owl_importer2.owl_importer2_set_options(importer, importer_options);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, owl_importer2.$str10$);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $ONTOLOGY_URI, uri);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $CYCLIST, cyclist);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        return owl_importer2.owl_import_with_importer(importer);
    }

    public static SubLObject owl_import_file(final SubLObject filename, SubLObject importer_options) {
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        importer_options = copy_list(importer_options);
        owl_importer2.validate_owl_import_parameters(owl_importer2.$str15$owl_import_file, list_utilities.make_plist(owl_importer2.$list16, list(filename, importer_options)));
        SubLObject v_graph = NIL;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == getf(importer_options, $VERBOSE_, UNPROVIDED)), thread);
            v_graph = owl_importer2.owl_import_xml_graph_from_file(filename);
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject cyclist = owl_importer2.owl_importer_dwim_a_cyclist(importer_options);
        final SubLObject importer = owl_importer2.new_owl_importer2_for_graph(v_graph, cyclist, importer_options);
        final SubLObject graph_topic = rdf_graph.rdf_graph_topic(v_graph);
        final SubLObject uri = (NIL != rdf_uri.rdf_uri_p(graph_topic)) ? owl_importer2.dwim_rdf_uri_string(graph_topic) : NIL;
        owl_importer2.owl_importer2_set_options(importer, importer_options);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, owl_importer2.$str10$);
        if (NIL != web_utilities.url_p(uri)) {
            owl_importer2.owl_importer2_set_option_if_not_set(importer, $ONTOLOGY_URI, uri);
        }
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $CYCLIST, cyclist);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        return owl_importer2.owl_import_with_importer(importer);
    }

    public static SubLObject owl_import_uri_from_file(final SubLObject uri, final SubLObject filename, SubLObject importer_options) {
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        importer_options = copy_list(importer_options);
        owl_importer2.validate_owl_import_parameters(owl_importer2.$str19$owl_import_uri_from_file, list_utilities.make_plist(owl_importer2.$list20, list(uri, filename, importer_options)));
        final SubLObject cyclist = owl_importer2.owl_importer_dwim_a_cyclist(importer_options);
        final SubLObject importer = owl_importer2.get_owl_importer2_for_file(filename, cyclist, uri);
        owl_importer2.owl_importer2_set_options(importer, importer_options);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, owl_importer2.$str10$);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $ONTOLOGY_URI, uri);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $CYCLIST, cyclist);
        owl_importer2.owl_importer2_set_option_if_not_set(importer, $PROGRESS_STREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        return owl_importer2.owl_import_with_importer(importer);
    }

    public static SubLObject owl_import_file_to_graph_only(final SubLObject filename, SubLObject importer_options) {
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        importer_options = putf(importer_options, $TEST_MODE, $GRAPH_ONLY);
        return owl_importer2.owl_import_file(filename, importer_options);
    }

    public static SubLObject owl_import_xml_graph_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_graph = NIL;
        final SubLObject str = owl_importer2.$str24$Importing_XML___;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            v_graph = rdf_parser.parse_rdfXxml_file_with_detail(filename);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return v_graph;
    }

    public static SubLObject owl_import_with_importer(final SubLObject importer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject verboseP = owl_importer2.owl_importer2_get_option(importer, $VERBOSE_, UNPROVIDED);
        if (NIL != verboseP) {
            owl_utilities.owl_debug_show_options(owl_importer2.owl_importer2_options(importer));
        }
        if ($GRAPH_ONLY == owl_importer2.owl_importer2_get_option(importer, $TEST_MODE, UNPROVIDED)) {
            return importer;
        }
        final SubLObject ontology_uri = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_URI, UNPROVIDED);
        SubLObject uri_prefix = owl_importer2.owl_importer2_get_option(importer, $URI_PREFIX, UNPROVIDED);
        final SubLObject synonymous_concept_prefix = owl_importer2.owl_importer2_get_option(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED);
        if (NIL == uri_prefix) {
            uri_prefix = owl_importer2.determine_uri_prefix_from_prefix_map(ontology_uri, rdf_graph.rdf_graph_prefix_map(owl_importer2.owl_importer2_graph(importer)));
            if (NIL != string_utilities.non_empty_string_p(uri_prefix)) {
                owl_importer2.owl_importer2_set_option(importer, $URI_PREFIX, uri_prefix);
            } else {
                uri_prefix = owl_importer2.$str10$;
                owl_importer2.owl_importer2_set_option(importer, $URI_PREFIX, owl_importer2.$str10$);
            }
        }
        if (NIL != string_utilities.empty_string_p(synonymous_concept_prefix)) {
            if (NIL != verboseP) {
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str26$__Using_local_URI_part_for___syno, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != string_utilities.non_empty_string_p(synonymous_concept_prefix)) {
                if (NIL != verboseP) {
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str27$__Using_URI_prefix___A__for___syn, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != verboseP) {
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str28$__Using_full_URIs_for___synonymou, synonymous_concept_prefix, ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }


        if (((NIL != string_utilities.non_empty_string_p(synonymous_concept_prefix)) && (NIL == Strings.stringE(uri_prefix, synonymous_concept_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != verboseP)) {
            format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str29$__Note_that_synonymous_concept_pr, synonymous_concept_prefix, uri_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject constant_prefix = owl_importer2.owl_importer2_get_option(importer, $CONSTANT_PREFIX, UNPROVIDED);
        final SubLObject constant_suffix = owl_importer2.owl_importer2_get_option(importer, $CONSTANT_SUFFIX, UNPROVIDED);
        if (((NIL == string_utilities.non_empty_string_p(constant_prefix)) || ((NIL != constant_suffix) && (NIL == string_utilities.non_empty_string_p(constant_suffix)))) && (NIL != string_utilities.non_empty_string_p(uri_prefix))) {
            constant_prefix = cconcatenate(uri_prefix, owl_importer2.$str32$_);
        }
        if (NIL != string_utilities.non_empty_string_p(constant_prefix)) {
            final SubLObject valid_prefix = list_utilities.remove_if_not(VALID_CONSTANT_NAME_CHAR_P, constant_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == Strings.stringE(constant_prefix, valid_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                if (NIL != verboseP) {
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str34$Changing_constant_prefix_from__S_, constant_prefix, valid_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                constant_prefix = valid_prefix;
            }
        }
        owl_importer2.owl_importer2_set_option(importer, $CONSTANT_PREFIX, constant_prefix);
        owl_importer2.owl_importer2_set_option(importer, $CONSTANT_SUFFIX, constant_suffix);
        if (NIL != verboseP) {
            if (NIL != string_utilities.non_empty_string_p(constant_prefix)) {
                if (NIL == string_utilities.ends_with(constant_prefix, owl_importer2.$str32$_, UNPROVIDED)) {
                    constant_prefix = cconcatenate(constant_prefix, owl_importer2.$str32$_);
                }
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str35$__Using_prefix___A__for_new_const, constant_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != string_utilities.non_empty_string_p(constant_suffix)) {
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str36$__Using_suffix___A__for_new_const, constant_suffix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != string_utilities.empty_string_p(constant_prefix)) && (NIL != string_utilities.empty_string_p(constant_suffix))) {
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str37$__Using___ResourceWithURIFn_NARTs, uri_prefix, ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        SubLObject ontology_term = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_TERM, UNPROVIDED);
        SubLObject ontology_mt = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_MT, UNPROVIDED);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
            if (NIL == forts.fort_p(ontology_term)) {
                owl_utilities.owl_assert_wff(list(owl_importer2.$$retainTerm, list(owl_importer2.$$OWLOntologyFn, ontology_uri)), owl_importer2.$$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                ontology_term = czer_main.cyc_find_or_create_nart(list(owl_importer2.$$OWLOntologyFn, ontology_uri), UNPROVIDED);
                owl_importer2.owl_importer2_set_option(importer, $ONTOLOGY_TERM, ontology_term);
            }
            if (NIL == hlmt.hlmt_p(ontology_mt)) {
                ontology_mt = czer_main.cyc_find_or_create_nart(list(owl_importer2.$$ContextOfPCWFn, ontology_term), UNPROVIDED);
                owl_importer2.owl_importer2_set_option(importer, $ONTOLOGY_MT, ontology_mt);
            }
            if (NIL != verboseP) {
                if (html_macros.$html_stream$.getDynamicValue(thread).equal(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED))) {
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str44$__Using_ontology_term_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_form(ontology_term, UNPROVIDED, UNPROVIDED);
                    terpri(UNPROVIDED);
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str45$__Using_ontology_mt_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cb_form(ontology_mt, UNPROVIDED, UNPROVIDED);
                    terpri(UNPROVIDED);
                } else {
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str46$__Using_ontology_term__S__, narts_high.nart_expand(ontology_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str47$__Using_ontology_mt__S__, narts_high.nart_expand(ontology_mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            SubLObject cdolist_list_var = rdf_graph.rdf_graph_prefix_map(owl_importer2.owl_importer2_graph(importer));
            SubLObject prefix_uri_pair = NIL;
            prefix_uri_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = prefix_uri_pair;
                SubLObject prefix = NIL;
                SubLObject uri_string = NIL;
                destructuring_bind_must_consp(current, datum, owl_importer2.$list48);
                prefix = current.first();
                current = uri_string = current.rest();
                if (NIL != web_utilities.url_p(uri_string)) {
                    if (NIL != Strings.stringE(prefix, owl_importer2.$str49$xml_base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        owl_utilities.owl_assert_wff(list(owl_importer2.$$baseNamespaceForSKS, ontology_term, list(owl_importer2.$$URIFn, uri_string)), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        owl_utilities.owl_assert_wff(list(owl_importer2.$$nameSpacePrefixForSKS, ontology_term, prefix, list(owl_importer2.$$URIFn, uri_string)), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                prefix_uri_pair = cdolist_list_var.first();
            } 
            final SubLObject translation_functions = list_utilities.remove_if_not(FUNCTION_SPEC_P, owl_importer2.owl_importer2_get_option(importer, owl_importer2.$GRAPH_TRANSLATION_FUNCTIONS, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != translation_functions) {
                final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
                SubLObject cdolist_list_var2 = translation_functions;
                SubLObject translation_function = NIL;
                translation_function = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    funcall(translation_function, v_graph, verboseP);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    translation_function = cdolist_list_var2.first();
                } 
                owl_importer2.owl_importer2_note_stat(importer, $NODE_COUNT, rdf_graph.rdf_graph_node_count(v_graph));
                owl_importer2.owl_importer2_note_stat(importer, $TRIPLE_COUNT, rdf_graph.rdf_graph_triple_count(v_graph));
            }
            if (NIL != verboseP) {
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str57$_A_triples__, rdf_graph.rdf_graph_triple_count(owl_importer2.owl_importer2_graph(importer)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str58$_A_nodes__, rdf_graph.rdf_graph_node_count(owl_importer2.owl_importer2_graph(importer)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            owl_importer2.owl_importer2_assert_triples(importer);
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return importer;
    }

    public static SubLObject determine_uri_prefix_from_prefix_map(final SubLObject uri, final SubLObject prefix_map) {
        return Sort.sort(Mapping.mapcar(CAR, list_utilities.find_all(uri, prefix_map, owl_importer2.$sym60$SUPERSTRING_, CDR)), owl_importer2.$sym62$_, LENGTH).first();
    }

    public static SubLObject determine_base_uri_from_prefix_map(final SubLObject prefix_map) {
        return Sort.sort(Mapping.mapcar(CDR, list_utilities.find_all(owl_importer2.$str10$, prefix_map, owl_importer2.$sym64$STRING_, CAR)), owl_importer2.$sym62$_, LENGTH).first();
    }

    public static SubLObject validate_owl_import_parameters(final SubLObject function_name, final SubLObject importer_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorsP = NIL;
        if ((NIL != list_utilities.plist_has_keyP(importer_parameters, $URI)) && (NIL == web_utilities.url_p(getf(importer_parameters, $URI, UNPROVIDED)))) {
            format_nil.force_format(T, owl_importer2.$str66$_A__URI__S_is_not_valid__, function_name, getf(importer_parameters, $URI, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        if ((NIL != list_utilities.plist_has_keyP(importer_parameters, $FILENAME)) && (NIL == file_utilities.file_existsP(getf(importer_parameters, $FILENAME, UNPROVIDED)))) {
            format_nil.force_format(T, owl_importer2.$str68$_A__FILENAME__S_does_not_exist__, function_name, getf(importer_parameters, $FILENAME, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        final SubLObject options = getf(importer_parameters, $IMPORTER_OPTIONS, UNPROVIDED);
        if (NIL == list_utilities.property_list_p(options)) {
            format_nil.force_format(T, owl_importer2.$str70$_A__IMPORTER_OPTIONS__S_is_not_a_, function_name, getf(importer_parameters, $IMPORTER_OPTIONS, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        final SubLObject cyclist = getf(options, $CYCLIST, UNPROVIDED);
        if (NIL != cyclist) {
            if (NIL == isa.isa_in_any_mtP(cyclist, owl_importer2.$$Cyclist)) {
                format_nil.force_format(T, owl_importer2.$str72$_A__IMPORTER_OPTIONS__cyclist__A_, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                errorsP = T;
            }
        } else
            if ((NIL == isa.isa_in_any_mtP(operation_communication.the_cyclist(), owl_importer2.$$Cyclist)) || owl_importer2.$$Guest.eql(operation_communication.the_cyclist())) {
                format_nil.force_format(T, owl_importer2.$str74$_A__Please_log_in_with__set_the_c, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                errorsP = T;
            }

        final SubLObject invalid_options = set_difference(list_utilities.plist_keys(options), owl_importer2.$owl_importer2_valid_options$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != invalid_options) {
            format_nil.force_format(T, owl_importer2.$str75$_A__IMPORTER_OPTIONS_has_invalid_, function_name, invalid_options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        if (NIL != errorsP) {
            owl_importer2.show_owl_import_usages();
            Errors.error(owl_importer2.$str76$Errors_found__aborting_import___);
        }
        return NIL;
    }

    public static SubLObject owl_importer_dwim_a_cyclist(final SubLObject importer_options) {
        SubLObject cyclist = getf(importer_options, $CYCLIST, UNPROVIDED);
        if (NIL == forts.fort_p(cyclist)) {
            cyclist = operation_communication.the_cyclist();
        }
        return cyclist;
    }

    public static final SubLObject owl_importer_v2_version_number_alt() {
        {
            SubLObject start = position_if(DIGIT_CHAR_P, $owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject version_string = remove_last_char(substring($owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER);
            set_nth_char(ZERO_INTEGER, version_string, CHAR_2, UNPROVIDED);
            return version_string;
        }
    }

    public static SubLObject owl_importer_v2_version_number() {
        final SubLObject start = position_if(DIGIT_CHAR_P, owl_importer2.$owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject version_string = string_utilities.remove_last_char(string_utilities.substring(owl_importer2.$owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER);
        string_utilities.set_nth_char(ZERO_INTEGER, version_string, CHAR_2, UNPROVIDED);
        return version_string;
    }

    public static final SubLObject import_owl_ontology_from_url_alt(SubLObject url, SubLObject mapping_mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        {
            SubLObject source_file = download_rdf_url(url, UNPROVIDED);
            return com.cyc.cycjava.cycl.owl.owl_importer2.import_owl_ontology_from_file(source_file, mapping_mt, cyclist, url);
        }
    }

    public static SubLObject import_owl_ontology_from_url(final SubLObject url, final SubLObject mapping_mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLObject source_file = rdf_utilities.download_rdf_url(url, UNPROVIDED);
        return owl_importer2.import_owl_ontology_from_file(source_file, mapping_mt, cyclist, url);
    }

    public static final SubLObject import_owl_ontology_from_file_alt(SubLObject file, SubLObject mapping_mt, SubLObject cyclist, SubLObject base_uri) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        {
            SubLObject importer = com.cyc.cycjava.cycl.owl.owl_importer2.get_owl_importer2_for_file(file, cyclist, base_uri);
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_triples(importer, mapping_mt);
        }
        return NIL;
    }

    public static SubLObject import_owl_ontology_from_file(final SubLObject file, final SubLObject mapping_mt, SubLObject cyclist, SubLObject base_uri) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        final SubLObject importer = owl_importer2.get_owl_importer2_for_file(file, cyclist, base_uri);
        owl_importer2.owl_importer2_assert_triples(importer);
        return NIL;
    }

    public static final SubLObject get_owl_importer2_for_url_alt(SubLObject url, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        {
            SubLObject source_file = download_rdf_url(url, UNPROVIDED);
            return com.cyc.cycjava.cycl.owl.owl_importer2.get_owl_importer2_for_file(source_file, cyclist, url);
        }
    }

    public static SubLObject get_owl_importer2_for_url(final SubLObject url, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLObject source_file = rdf_utilities.download_rdf_url(url, UNPROVIDED);
        return owl_importer2.get_owl_importer2_for_file(source_file, cyclist, url);
    }

    public static final SubLObject get_owl_importer2_for_file_alt(SubLObject file, SubLObject cyclist, SubLObject base_uri) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        {
            SubLObject importer = com.cyc.cycjava.cycl.owl.owl_importer2.new_owl_importer2(file, cyclist);
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_load_graph(importer, base_uri);
            return importer;
        }
    }

    public static SubLObject get_owl_importer2_for_file(final SubLObject file, SubLObject cyclist, SubLObject base_uri) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        final SubLObject importer = owl_importer2.new_owl_importer2(base_uri, file, cyclist, UNPROVIDED);
        owl_importer2.owl_importer2_load_graph(importer, base_uri);
        return importer;
    }

    public static final SubLObject find_owl_importer2_by_id_alt(SubLObject id) {
        return dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_id_map(), id, UNPROVIDED);
    }

    public static SubLObject find_owl_importer2_by_id(final SubLObject id) {
        return dictionary_lookup_without_values(owl_importer2.owl_importer2_id_map(), id, UNPROVIDED);
    }

    /**
     *
     *
     * @return stringp -- the owl importer version number for the importer defined in this file -- version 2.
     */
    @LispMethod(comment = "@return stringp -- the owl importer version number for the importer defined in this file -- version 2.")
    public static final SubLObject owl_importer2_version_number_alt() {
        {
            SubLObject start = position(CHAR_period, $owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return cconcatenate($$$2, remove_last_char(substring($owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER));
        }
    }

    /**
     *
     *
     * @return stringp -- the owl importer version number for the importer defined in this file -- version 2.
     */
    @LispMethod(comment = "@return stringp -- the owl importer version number for the importer defined in this file -- version 2.")
    public static SubLObject owl_importer2_version_number() {
        final SubLObject start = position(CHAR_period, owl_importer2.$owl_importer2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cconcatenate(owl_importer2.$$$2, string_utilities.remove_last_char(string_utilities.substring(owl_importer2.$owl_importer2_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER));
    }

    public static final SubLObject import_owl_triples_from_rdf_graph_alt(SubLObject v_graph, SubLObject mapping_mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        {
            SubLObject importer = com.cyc.cycjava.cycl.owl.owl_importer2.new_owl_importer2_for_graph(v_graph, cyclist);
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_triples(importer, mapping_mt);
        }
        return NIL;
    }

    public static SubLObject import_owl_triples_from_rdf_graph(final SubLObject v_graph, final SubLObject mapping_mt, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        final SubLObject importer = owl_importer2.new_owl_importer2_for_graph(v_graph, cyclist, UNPROVIDED);
        owl_importer2.owl_importer2_assert_triples(importer);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$_OWL_IMPORTER2_VERSION_NUMBER_ = makeSymbol("*OWL-IMPORTER2-VERSION-NUMBER*");

    static private final SubLString $str_alt1$_revision__1_2__ = makeString("$revision: 1.2 $");

    public static final SubLObject cyclist_using_owl_importer2_alt(SubLObject cyclist) {
        {
            SubLObject version_string = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_version_number();
            SubLObject versioned_tool_nat = make_binary_formula($$SoftwareVersion, $$OWLImporter_Cyc, version_string);
            return cyc_find_or_create_nart(make_binary_formula($$UserOfProgramFn, versioned_tool_nat, cyclist), UNPROVIDED);
        }
    }

    public static SubLObject cyclist_using_owl_importer2(final SubLObject cyclist) {
        final SubLObject version_string = owl_importer2.owl_importer2_version_number();
        final SubLObject versioned_tool_nat = make_binary_formula(owl_importer2.$$SoftwareVersion, owl_importer2.$$OWLImporter_Cyc, version_string);
        return czer_main.cyc_find_or_create_nart(make_binary_formula(owl_importer2.$$UserOfProgramFn, versioned_tool_nat, cyclist), UNPROVIDED);
    }

    public static final SubLObject owl_importer2_load_graph_alt(SubLObject importer, SubLObject base_uri) {
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        {
            SubLObject v_graph = parse_rdfXxml_file(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_file(importer), base_uri);
            return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_load_graph_internal(importer, v_graph);
        }
    }

    public static SubLObject owl_importer2_load_graph(final SubLObject importer, SubLObject base_uri) {
        if (base_uri == UNPROVIDED) {
            base_uri = NIL;
        }
        final SubLObject v_graph = rdf_parser.parse_rdfXxml_file(owl_importer2.owl_importer2_file(importer), base_uri);
        return owl_importer2.owl_importer2_load_graph_internal(importer, v_graph);
    }

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("FILE"), makeSymbol("GRAPH"), makeSymbol("CYCLIST"), makeSymbol("IMPORT"), makeSymbol("ONTOLOGIES"), makeSymbol("TERMS"), makeSymbol("SENTENCES"), makeSymbol("STATS"), makeSymbol("THREAD") });

    public static final SubLObject owl_importer2_load_graph_internal_alt(SubLObject importer, SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_set_graph(importer, v_graph);
            {
                SubLObject rw_lock_var = get_rdf_graph_lock(v_graph);
                SubLObject needs_to_releaseP = NIL;
                try {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                    {
                        SubLObject iterator_var = rdf_graph_node_iterator(v_graph);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject node = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    dictionary.dictionary_enter(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_terms(importer), node, NIL);
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
            }
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $NODE_COUNT, rdf_graph_node_count(v_graph));
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $TRIPLE_COUNT, rdf_graph_triple_count(v_graph));
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $NODES_DONE, ZERO_INTEGER);
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $TRIPLES_DONE, ZERO_INTEGER);
            {
                SubLObject ontologies = rdf_graph_find_subjects(v_graph, rdf_expanded_name($$$type), owl_expanded_name($$$Ontology));
                com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_set_ontologies(importer, ontologies);
            }
            return v_graph;
        }
    }

    public static SubLObject owl_importer2_load_graph_internal(final SubLObject importer, final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        owl_importer2.owl_importer2_set_graph(importer, v_graph);
        final SubLObject rw_lock_var = rdf_graph.get_rdf_graph_lock(v_graph);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject iterator_var = rdf_graph.rdf_graph_node_iterator(v_graph);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject node = iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    dictionary_enter(owl_importer2.owl_importer2_terms(importer), node, NIL);
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        owl_importer2.owl_importer2_note_stat(importer, $NODE_COUNT, rdf_graph.rdf_graph_node_count(v_graph));
        owl_importer2.owl_importer2_note_stat(importer, $TRIPLE_COUNT, rdf_graph.rdf_graph_triple_count(v_graph));
        owl_importer2.owl_importer2_note_stat(importer, $NODES_DONE, ZERO_INTEGER);
        owl_importer2.owl_importer2_note_stat(importer, $TRIPLES_DONE, ZERO_INTEGER);
        owl_importer2.owl_importer2_note_stat(importer, $TERMS_CREATED, ZERO_INTEGER);
        owl_importer2.owl_importer2_note_stat(importer, $ASSERTIONS_CREATED, ZERO_INTEGER);
        final SubLObject ontologies = rdf_graph.rdf_graph_find_subjects(v_graph, rdf_utilities.rdf_expanded_name(owl_importer2.$$$type), owl_utilities.owl_expanded_name(owl_importer2.$$$Ontology));
        owl_importer2.owl_importer2_set_ontologies(importer, ontologies);
        return v_graph;
    }

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("ID"), $FILE, makeKeyword("GRAPH"), makeKeyword("CYCLIST"), makeKeyword("IMPORT"), makeKeyword("ONTOLOGIES"), makeKeyword("TERMS"), makeKeyword("SENTENCES"), makeKeyword("STATS"), makeKeyword("THREAD") });

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeSymbol("OWL-IMP2-ID"), makeSymbol("OWL-IMP2-FILE"), makeSymbol("OWL-IMP2-GRAPH"), makeSymbol("OWL-IMP2-CYCLIST"), makeSymbol("OWL-IMP2-IMPORT"), makeSymbol("OWL-IMP2-ONTOLOGIES"), makeSymbol("OWL-IMP2-TERMS"), makeSymbol("OWL-IMP2-SENTENCES"), makeSymbol("OWL-IMP2-STATS"), makeSymbol("OWL-IMP2-THREAD") });

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeSymbol("_CSETF-OWL-IMP2-ID"), makeSymbol("_CSETF-OWL-IMP2-FILE"), makeSymbol("_CSETF-OWL-IMP2-GRAPH"), makeSymbol("_CSETF-OWL-IMP2-CYCLIST"), makeSymbol("_CSETF-OWL-IMP2-IMPORT"), makeSymbol("_CSETF-OWL-IMP2-ONTOLOGIES"), makeSymbol("_CSETF-OWL-IMP2-TERMS"), makeSymbol("_CSETF-OWL-IMP2-SENTENCES"), makeSymbol("_CSETF-OWL-IMP2-STATS"), makeSymbol("_CSETF-OWL-IMP2-THREAD") });

    public static final SubLObject owl_importer2_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.owl.owl_importer2.print_owl_importer2(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_importer2_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        owl_importer2.print_owl_importer2(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject owl_importer2_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject owl_importer2_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_native.class ? T : NIL;
    }

    public static final SubLObject owl_imp2_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$id;
    }

    public static SubLObject owl_imp2_id(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject owl_imp2_uri(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject owl_imp2_file_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$file;
    }

    public static SubLObject owl_imp2_file(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject owl_imp2_graph_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$graph;
    }

    public static SubLObject owl_imp2_graph(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject owl_imp2_cyclist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$cyclist;
    }

    public static SubLObject owl_imp2_cyclist(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject owl_imp2_import_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$import;
    }

    public static SubLObject owl_imp2_import(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField7();
    }

    static private final SubLString $str_alt51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt52$_OWL_IMPORTER__D_ = makeString("<OWL-IMPORTER ~D>");

    public static final SubLObject owl_imp2_ontologies_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$ontologies;
    }

    public static SubLObject owl_imp2_ontologies(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField8();
    }

    static private final SubLSymbol $sym53$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    public static final SubLObject owl_imp2_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$terms;
    }

    public static SubLObject owl_imp2_terms(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject owl_imp2_sentences_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$sentences;
    }

    public static SubLObject owl_imp2_sentences(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField10();
    }

    static private final SubLSymbol $sym59$_OWL_IMPORTER2_ID_ISG_ = makeSymbol("*OWL-IMPORTER2-ID-ISG*");

    public static final SubLObject owl_imp2_stats_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$stats;
    }

    public static SubLObject owl_imp2_stats(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField11();
    }

    static private final SubLSymbol $sym60$_OWL_IMPORTER2_ID_MAP_ = makeSymbol("*OWL-IMPORTER2-ID-MAP*");

    public static SubLObject owl_imp2_options(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField12();
    }

    static private final SubLString $str_alt65$Importing_ = makeString("Importing ");

    static private final SubLString $str_alt66$_triples___ = makeString(" triples...");

    public static final SubLObject owl_imp2_thread_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$thread;
    }

    public static SubLObject owl_imp2_thread(final SubLObject v_object) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.getField13();
    }

    static private final SubLString $str_alt68$Assert_nesting_depth___D = makeString("Assert nesting depth: ~D");

    public static final SubLObject _csetf_owl_imp2_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$id = (value);
    }

    public static SubLObject _csetf_owl_imp2_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField2(value);
    }

    static private final SubLList $list_alt70 = list(reader_make_constant_shell("OWLProperty"));

    static private final SubLString $str_alt71$Failed_to_assert__S = makeString("Failed to assert ~S");

    public static SubLObject _csetf_owl_imp2_uri(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField3(value);
    }

    static private final SubLString $str_alt72$Can_t_find_or_create_term_for__S = makeString("Can't find or create term for ~S");

    public static final SubLObject _csetf_owl_imp2_file_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$file = (value);
    }

    public static SubLObject _csetf_owl_imp2_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_owl_imp2_graph_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$graph = (value);
    }

    public static SubLObject _csetf_owl_imp2_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_owl_imp2_cyclist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$cyclist = (value);
    }

    public static SubLObject _csetf_owl_imp2_cyclist(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_owl_imp2_import_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$import = (value);
    }

    public static SubLObject _csetf_owl_imp2_import(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_owl_imp2_ontologies_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$ontologies = (value);
    }

    public static SubLObject _csetf_owl_imp2_ontologies(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_owl_imp2_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$terms = (value);
    }

    public static SubLObject _csetf_owl_imp2_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_owl_imp2_sentences_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$sentences = (value);
    }

    public static SubLObject _csetf_owl_imp2_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_owl_imp2_stats_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$stats = (value);
    }

    public static SubLObject _csetf_owl_imp2_stats(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_owl_imp2_options(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_owl_imp2_thread_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, owl_importer2.OWL_IMPORTER2_P);
        return (($owl_importer2_native)v_object).$thread = (value);
    }

    public static SubLObject _csetf_owl_imp2_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(v_object) : "! owl_importer2.owl_importer2_p(v_object) " + "owl_importer2.owl_importer2_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_owl_importer2_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FILE)) {
                            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_file(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GRAPH)) {
                                com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_graph(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CYCLIST)) {
                                    com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_cyclist(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($IMPORT)) {
                                        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_import(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ONTOLOGIES)) {
                                            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_ontologies(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($TERMS)) {
                                                com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_terms(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($SENTENCES)) {
                                                    com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_sentences(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($STATS)) {
                                                        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_stats(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($THREAD)) {
                                                            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_thread(v_new, current_value);
                                                        } else {
                                                            Errors.error($str_alt51$Invalid_slot__S_for_construction_, current_arg);
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
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_owl_importer2(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                owl_importer2._csetf_owl_imp2_id(v_new, current_value);
            } else
                if (pcase_var.eql($URI)) {
                    owl_importer2._csetf_owl_imp2_uri(v_new, current_value);
                } else
                    if (pcase_var.eql($FILE)) {
                        owl_importer2._csetf_owl_imp2_file(v_new, current_value);
                    } else
                        if (pcase_var.eql($GRAPH)) {
                            owl_importer2._csetf_owl_imp2_graph(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYCLIST)) {
                                owl_importer2._csetf_owl_imp2_cyclist(v_new, current_value);
                            } else
                                if (pcase_var.eql($IMPORT)) {
                                    owl_importer2._csetf_owl_imp2_import(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ONTOLOGIES)) {
                                        owl_importer2._csetf_owl_imp2_ontologies(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TERMS)) {
                                            owl_importer2._csetf_owl_imp2_terms(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SENTENCES)) {
                                                owl_importer2._csetf_owl_imp2_sentences(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($STATS)) {
                                                    owl_importer2._csetf_owl_imp2_stats(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($OPTIONS)) {
                                                        owl_importer2._csetf_owl_imp2_options(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($THREAD)) {
                                                            owl_importer2._csetf_owl_imp2_thread(v_new, current_value);
                                                        } else {
                                                            Errors.error(owl_importer2.$str133$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_importer2(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, owl_importer2.MAKE_OWL_IMPORTER2, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, owl_importer2.owl_imp2_id(obj));
        funcall(visitor_fn, obj, $SLOT, $URI, owl_importer2.owl_imp2_uri(obj));
        funcall(visitor_fn, obj, $SLOT, $FILE, owl_importer2.owl_imp2_file(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, owl_importer2.owl_imp2_graph(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLIST, owl_importer2.owl_imp2_cyclist(obj));
        funcall(visitor_fn, obj, $SLOT, $IMPORT, owl_importer2.owl_imp2_import(obj));
        funcall(visitor_fn, obj, $SLOT, $ONTOLOGIES, owl_importer2.owl_imp2_ontologies(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, owl_importer2.owl_imp2_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, owl_importer2.owl_imp2_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $STATS, owl_importer2.owl_imp2_stats(obj));
        funcall(visitor_fn, obj, $SLOT, $OPTIONS, owl_importer2.owl_imp2_options(obj));
        funcall(visitor_fn, obj, $SLOT, $THREAD, owl_importer2.owl_imp2_thread(obj));
        funcall(visitor_fn, obj, $END, owl_importer2.MAKE_OWL_IMPORTER2, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_importer2_method(final SubLObject obj, final SubLObject visitor_fn) {
        return owl_importer2.visit_defstruct_owl_importer2(obj, visitor_fn);
    }

    public static final SubLObject print_owl_importer2_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt52$_OWL_IMPORTER__D_, com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_id(v_object));
        return v_object;
    }

    public static SubLObject print_owl_importer2(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, owl_importer2.$str139$_OWL_IMPORTER__D_for__A_, owl_importer2.owl_imp2_id(v_object), owl_importer2.owl_imp2_uri(v_object));
        return v_object;
    }

    public static final SubLObject new_owl_importer2(SubLObject file, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        SubLTrampolineFile.checkType(file, $sym53$FILE_EXISTS_);
        SubLTrampolineFile.checkType(cyclist, FORT_P);
        {
            SubLObject importer = com.cyc.cycjava.cycl.owl.owl_importer2.make_owl_importer2(UNPROVIDED);
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_id(importer, com.cyc.cycjava.cycl.owl.owl_importer2.next_owl_importer2_id());
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_file(importer, file);
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_cyclist(importer, com.cyc.cycjava.cycl.owl.owl_importer2.cyclist_using_owl_importer_v2(cyclist));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_terms(importer, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_sentences(importer, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_stats(importer, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            return importer;
        }
    }

    public static SubLObject new_owl_importer2(final SubLObject uri, final SubLObject file, SubLObject cyclist, SubLObject options) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        assert NIL != web_utilities.url_p(uri) : "! web_utilities.url_p(uri) " + ("web_utilities.url_p(uri) " + "CommonSymbols.NIL != web_utilities.url_p(uri) ") + uri;
        assert NIL != file_utilities.file_existsP(file) : "! file_utilities.file_existsP(file) " + ("file_utilities.file_existsP(file) " + "CommonSymbols.NIL != file_utilities.file_existsP(file) ") + file;
        assert NIL != forts.fort_p(cyclist) : "! forts.fort_p(cyclist) " + ("forts.fort_p(cyclist) " + "CommonSymbols.NIL != forts.fort_p(cyclist) ") + cyclist;
        assert NIL != list_utilities.property_list_p(options) : "! list_utilities.property_list_p(options) " + ("list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) ") + options;
        final SubLObject importer = owl_importer2.make_owl_importer2(UNPROVIDED);
        owl_importer2._csetf_owl_imp2_id(importer, owl_importer2.next_owl_importer2_id());
        owl_importer2._csetf_owl_imp2_uri(importer, uri);
        owl_importer2._csetf_owl_imp2_file(importer, file);
        owl_importer2._csetf_owl_imp2_cyclist(importer, cyclist);
        owl_importer2._csetf_owl_imp2_terms(importer, new_dictionary(symbol_function(EQL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_sentences(importer, new_set(symbol_function(EQUAL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_stats(importer, new_dictionary(symbol_function(EQL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_options(importer, options);
        return importer;
    }

    public static final SubLObject new_owl_importer2_for_graph(SubLObject v_graph, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = the_cyclist();
        }
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        SubLTrampolineFile.checkType(cyclist, FORT_P);
        {
            SubLObject importer = com.cyc.cycjava.cycl.owl.owl_importer2.make_owl_importer2(UNPROVIDED);
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_id(importer, com.cyc.cycjava.cycl.owl.owl_importer2.next_owl_importer2_id());
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_cyclist(importer, com.cyc.cycjava.cycl.owl.owl_importer2.cyclist_using_owl_importer_v2(cyclist));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_terms(importer, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_sentences(importer, set.new_set(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_stats(importer, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_load_graph_internal(importer, v_graph);
            return importer;
        }
    }

    public static SubLObject new_owl_importer2_for_graph(final SubLObject v_graph, SubLObject cyclist, SubLObject options) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        assert NIL != forts.fort_p(cyclist) : "! forts.fort_p(cyclist) " + ("forts.fort_p(cyclist) " + "CommonSymbols.NIL != forts.fort_p(cyclist) ") + cyclist;
        if (NIL == rdf_uri.rdf_uri_p(rdf_graph.rdf_graph_topic(v_graph))) {
            Errors.error(owl_importer2.$str145$No_import_owl_Ontology_URI_found_);
        }
        final SubLObject importer = owl_importer2.make_owl_importer2(UNPROVIDED);
        owl_importer2._csetf_owl_imp2_id(importer, owl_importer2.next_owl_importer2_id());
        owl_importer2._csetf_owl_imp2_uri(importer, rdf_uri.rdf_uri_utf8_string(rdf_graph.rdf_graph_topic(v_graph)));
        owl_importer2._csetf_owl_imp2_cyclist(importer, cyclist);
        owl_importer2._csetf_owl_imp2_terms(importer, new_dictionary(symbol_function(EQL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_sentences(importer, new_set(symbol_function(EQUAL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_stats(importer, new_dictionary(symbol_function(EQL), UNPROVIDED));
        owl_importer2._csetf_owl_imp2_options(importer, options);
        owl_importer2.owl_importer2_load_graph_internal(importer, v_graph);
        return importer;
    }

    public static final SubLObject cyclist_using_owl_importer_v2_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject version_string = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer_v2_version_number();
                SubLObject versioned_tool_nat = make_binary_formula($$SoftwareVersionFn, $$OWLImporter_Cyc, version_string);
                SubLObject cyclist_using_tool_naut = make_binary_formula($$UserOfProgramFn, versioned_tool_nat, cyclist);
                if (NIL == kb_accessors.cyclistP(find_nart(cyclist_using_tool_naut))) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind(NIL, thread);
                            set_the_cyclist(cyclist);
                            ke.ke_assert_now(list($$retainTerm, cyclist_using_tool_naut), $$BaseKB, UNPROVIDED, UNPROVIDED);
                        } finally {
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return find_nart(cyclist_using_tool_naut);
            }
        }
    }

    public static SubLObject cyclist_using_owl_importer_v2(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject version_string = owl_importer2.owl_importer_v2_version_number();
        final SubLObject versioned_tool_nat = make_binary_formula(owl_importer2.$$SoftwareVersionFn, owl_importer2.$$OWLImporter_Cyc, version_string);
        final SubLObject cyclist_using_tool_naut = make_binary_formula(owl_importer2.$$UserOfProgramFn, versioned_tool_nat, cyclist);
        if (NIL == cyclistP(narts_high.find_nart(cyclist_using_tool_naut))) {
            final SubLObject _prev_bind_0 = $the_cyclist$.currentBinding(thread);
            try {
                $the_cyclist$.bind(NIL, thread);
                operation_communication.set_the_cyclist(cyclist);
                ke_assert_now(list(owl_importer2.$$retainTerm, cyclist_using_tool_naut), owl_importer2.$$BaseKB, UNPROVIDED, UNPROVIDED);
            } finally {
                $the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return narts_high.find_nart(cyclist_using_tool_naut);
    }

    public static final SubLObject next_owl_importer2_id_alt() {
        return integer_sequence_generator.integer_sequence_generator_next($owl_importer2_id_isg$.getGlobalValue());
    }

    public static SubLObject next_owl_importer2_id() {
        return integer_sequence_generator_next(owl_importer2.$owl_importer2_id_isg$.getGlobalValue());
    }

    public static final SubLObject owl_importer2_id_map_alt() {
        return $owl_importer2_id_map$.getGlobalValue();
    }

    public static SubLObject owl_importer2_id_map() {
        return owl_importer2.$owl_importer2_id_map$.getGlobalValue();
    }

    public static final SubLObject note_owl_importer2_id_alt(SubLObject importer, SubLObject id) {
        return dictionary.dictionary_enter($owl_importer2_id_map$.getGlobalValue(), id, importer);
    }

    public static SubLObject note_owl_importer2_id(final SubLObject importer, final SubLObject id) {
        return dictionary_enter(owl_importer2.$owl_importer2_id_map$.getGlobalValue(), id, importer);
    }

    public static final SubLObject owl_importer2_id_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_id(importer);
    }

    public static SubLObject owl_importer2_id(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_id(importer);
    }

    public static SubLObject owl_importer2_uri(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_uri(importer);
    }

    public static final SubLObject owl_importer2_file_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_file(importer);
    }

    public static SubLObject owl_importer2_file(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_file(importer);
    }

    public static final SubLObject owl_importer2_graph_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_graph(importer);
    }

    public static SubLObject owl_importer2_graph(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_graph(importer);
    }

    public static final SubLObject owl_importer2_set_graph_alt(SubLObject importer, SubLObject v_graph) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        SubLTrampolineFile.checkType(v_graph, RDF_GRAPH_P);
        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_graph(importer, v_graph);
        return v_graph;
    }

    public static SubLObject owl_importer2_set_graph(final SubLObject importer, final SubLObject v_graph) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "! rdf_graph.rdf_graph_p(v_graph) " + ("rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) ") + v_graph;
        owl_importer2._csetf_owl_imp2_graph(importer, v_graph);
        return v_graph;
    }

    public static final SubLObject owl_importer2_cyclist_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_cyclist(importer);
    }

    public static SubLObject owl_importer2_cyclist(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_cyclist(importer);
    }

    public static final SubLObject owl_importer2_import_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_import(importer);
    }

    public static SubLObject owl_importer2_import(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_import(importer);
    }

    public static final SubLObject owl_importer2_ontologies_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_ontologies(importer);
    }

    public static SubLObject owl_importer2_ontologies(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_ontologies(importer);
    }

    public static final SubLObject owl_importer2_set_ontologies_alt(SubLObject importer, SubLObject ontologies) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        {
            SubLObject list_var = ontologies;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, RDF_URI_P);
                }
            }
        }
        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_ontologies(importer, ontologies);
        return ontologies;
    }

    public static SubLObject owl_importer2_set_ontologies(final SubLObject importer, final SubLObject ontologies) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        assert NIL != list_utilities.non_dotted_list_p(ontologies) : "! list_utilities.non_dotted_list_p(ontologies) " + ("list_utilities.non_dotted_list_p(ontologies) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ontologies) ") + ontologies;
        SubLObject cdolist_list_var = ontologies;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != rdf_uri.rdf_uri_p(elem) : "! rdf_uri.rdf_uri_p(elem) " + ("rdf_uri.rdf_uri_p(elem) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        owl_importer2._csetf_owl_imp2_ontologies(importer, ontologies);
        return ontologies;
    }

    public static final SubLObject owl_importer2_terms_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_terms(importer);
    }

    public static SubLObject owl_importer2_terms(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_terms(importer);
    }

    public static final SubLObject owl_importer2_sentences_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_sentences(importer);
    }

    public static SubLObject owl_importer2_sentences(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_sentences(importer);
    }

    public static final SubLObject owl_importer2_stats_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_stats(importer);
    }

    public static SubLObject owl_importer2_stats(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_stats(importer);
    }

    public static final SubLObject owl_importer2_note_stat_alt(SubLObject importer, SubLObject stat, SubLObject value) {
        return dictionary.dictionary_enter(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_stats(importer), stat, value);
    }

    public static SubLObject owl_importer2_note_stat(final SubLObject importer, final SubLObject stat, final SubLObject value) {
        return dictionary_enter(owl_importer2.owl_importer2_stats(importer), stat, value);
    }

    public static final SubLObject owl_importer2_lookup_stat_alt(SubLObject importer, SubLObject stat) {
        return dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_stats(importer), stat, UNPROVIDED);
    }

    public static SubLObject owl_importer2_lookup_stat(final SubLObject importer, final SubLObject stat) {
        return dictionary_lookup_without_values(owl_importer2.owl_importer2_stats(importer), stat, UNPROVIDED);
    }

    public static final SubLObject owl_importer2_triple_count_alt(SubLObject importer) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_lookup_stat(importer, $TRIPLE_COUNT);
    }

    public static SubLObject owl_importer2_triple_count(final SubLObject importer) {
        return owl_importer2.owl_importer2_lookup_stat(importer, $TRIPLE_COUNT);
    }

    public static final SubLObject owl_importer2_triples_done_alt(SubLObject importer) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_lookup_stat(importer, $TRIPLES_DONE);
    }

    public static SubLObject owl_importer2_triples_done(final SubLObject importer) {
        return owl_importer2.owl_importer2_lookup_stat(importer, $TRIPLES_DONE);
    }

    public static final SubLObject owl_importer2_nodes_done_alt(SubLObject importer) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_lookup_stat(importer, $NODES_DONE);
    }

    public static SubLObject owl_importer2_nodes_done(final SubLObject importer) {
        return owl_importer2.owl_importer2_lookup_stat(importer, $NODES_DONE);
    }

    public static final SubLObject owl_importer2_increment_triples_done_alt(SubLObject importer) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $TRIPLES_DONE, number_utilities.f_1X(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_triples_done(importer)));
    }

    public static SubLObject owl_importer2_increment_triples_done(final SubLObject importer) {
        return owl_importer2.owl_importer2_note_stat(importer, $TRIPLES_DONE, f_1X(owl_importer2.owl_importer2_triples_done(importer)));
    }

    public static final SubLObject owl_importer2_increment_nodes_done_alt(SubLObject importer) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_stat(importer, $NODES_DONE, number_utilities.f_1X(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_nodes_done(importer)));
    }

    public static SubLObject owl_importer2_increment_nodes_done(final SubLObject importer) {
        return owl_importer2.owl_importer2_note_stat(importer, $NODES_DONE, f_1X(owl_importer2.owl_importer2_nodes_done(importer)));
    }

    public static SubLObject owl_importer2_set_options(final SubLObject importer, final SubLObject options) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        if (((NIL != options) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == list_utilities.property_list_p(options))) {
            throw new AssertionError(options);
        }
        owl_importer2._csetf_owl_imp2_options(importer, options);
        return options;
    }

    public static SubLObject owl_importer2_set_option(final SubLObject importer, final SubLObject key, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        SubLObject options = owl_importer2.owl_imp2_options(importer);
        options = putf(options, key, value);
        owl_importer2._csetf_owl_imp2_options(importer, options);
        return options;
    }

    public static SubLObject owl_importer2_set_option_if_not_set(final SubLObject importer, final SubLObject key, final SubLObject value) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        SubLObject options = owl_importer2.owl_imp2_options(importer);
        if (NIL == list_utilities.plist_has_keyP(options, key)) {
            options = putf(options, key, value);
            owl_importer2._csetf_owl_imp2_options(importer, options);
        }
        return options;
    }

    public static SubLObject owl_importer2_get_option(final SubLObject importer, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return getf(owl_importer2.owl_imp2_options(importer), key, v_default);
    }

    public static SubLObject owl_importer2_options(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_options(importer);
    }

    public static final SubLObject owl_importer2_note_thread_alt(SubLObject importer, SubLObject thread) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        SubLTrampolineFile.checkType(thread, PROCESSP);
        com.cyc.cycjava.cycl.owl.owl_importer2._csetf_owl_imp2_thread(importer, thread);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_thread(importer);
    }

    public static SubLObject owl_importer2_note_thread(final SubLObject importer, final SubLObject thread) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        assert NIL != processp(thread) : "! processp(thread) " + ("Types.processp(thread) " + "CommonSymbols.NIL != Types.processp(thread) ") + thread;
        owl_importer2._csetf_owl_imp2_thread(importer, thread);
        return owl_importer2.owl_imp2_thread(importer);
    }

    public static final SubLObject owl_importer2_thread_alt(SubLObject importer) {
        SubLTrampolineFile.checkType(importer, OWL_IMPORTER2_P);
        return com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_thread(importer);
    }

    public static SubLObject owl_importer2_thread(final SubLObject importer) {
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        return owl_importer2.owl_imp2_thread(importer);
    }

    public static final SubLObject sxhash_owl_importer2_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.owl.owl_importer2.sxhash_owl_importer2(v_object);
    }

    public static SubLObject sxhash_owl_importer2_method(final SubLObject v_object) {
        return owl_importer2.sxhash_owl_importer2(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_owl_importer2_alt(SubLObject importer) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.owl.owl_importer2.owl_imp2_id(importer));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_owl_importer2(final SubLObject importer) {
        return Sxhash.sxhash(owl_importer2.owl_imp2_id(importer));
    }

    public static final SubLObject owl_importer2_assert_triples(SubLObject importer, SubLObject assert_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_thread(importer, current_process());
            {
                SubLObject v_graph = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_graph(importer);
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
                        noting_percent_progress_preamble(cconcatenate($str_alt65$Importing_, new SubLObject[]{ format_nil_d_no_copy(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_triple_count(importer)), $str_alt66$_triples___ }));
                        {
                            SubLObject rw_lock_var = get_rdf_graph_lock(v_graph);
                            SubLObject needs_to_releaseP = NIL;
                            try {
                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                {
                                    SubLObject iterator_var = rdf_graph_node_iterator(v_graph);
                                    SubLObject done_var = NIL;
                                    while (NIL == done_var) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject node = iteration.iteration_next(iterator_var);
                                            SubLObject valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_subject_triples(importer, node, assert_mt);
                                                com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_increment_nodes_done(importer);
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
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_nodes_done(importer);
            }
        }
    }

    public static SubLObject owl_importer2_assert_triples(final SubLObject importer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        owl_importer2.owl_importer2_note_thread(importer, current_process());
        final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(cconcatenate(owl_importer2.$$$Importing_, new SubLObject[]{ format_nil.format_nil_d_no_copy(owl_importer2.owl_importer2_triple_count(importer)), owl_importer2.$str154$_triples___ }));
                if (NIL != owl_importer2.owl_importer2_get_option(importer, $VERBOSE_, UNPROVIDED)) {
                    SubLObject node_count = ZERO_INTEGER;
                    SubLObject real_node_count = ZERO_INTEGER;
                    SubLObject triple_count = ZERO_INTEGER;
                    SubLObject real_triple_count = ZERO_INTEGER;
                    final SubLObject rw_lock_var = rdf_graph.get_rdf_graph_lock(v_graph);
                    SubLObject needs_to_releaseP = NIL;
                    try {
                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                        final SubLObject iterator_var = rdf_graph.rdf_graph_node_iterator(v_graph);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject node = iteration_next(iterator_var);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                node_count = add(node_count, ONE_INTEGER);
                                if ((NIL != rdf_uri.rdf_uri_p(node)) || (NIL != rdf_literal.rdf_literal_p(node))) {
                                    real_node_count = add(real_node_count, ONE_INTEGER);
                                }
                            }
                        }
                    } finally {
                        if (NIL != needs_to_releaseP) {
                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                        }
                    }
                    final SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator(v_graph);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject triple = iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            triple_count = add(triple_count, ONE_INTEGER);
                            if (NIL != rdf_triple.rdf_triple_p(triple, UNPROVIDED)) {
                                real_triple_count = add(real_triple_count, ONE_INTEGER);
                            }
                        }
                    }
                    format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), owl_importer2.$str155$node_count___A__, node_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), owl_importer2.$str156$real_node_count___A__, real_node_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), owl_importer2.$str157$triple_count___A__, triple_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), owl_importer2.$str158$real_triple_count___A__, real_triple_count, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                final SubLObject rw_lock_var2 = rdf_graph.get_rdf_graph_lock(v_graph);
                SubLObject needs_to_releaseP2 = NIL;
                try {
                    needs_to_releaseP2 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var2);
                    final SubLObject iterator_var2 = rdf_graph.rdf_graph_node_iterator(v_graph);
                    SubLObject valid2;
                    for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                        thread.resetMultipleValues();
                        final SubLObject node2 = iteration_next(iterator_var2);
                        valid2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid2) {
                            owl_importer2.owl_importer2_assert_subject_triples(importer, node2);
                            owl_importer2.owl_importer2_increment_nodes_done(importer);
                        }
                    }
                } finally {
                    if (NIL != needs_to_releaseP2) {
                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var2);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return owl_importer2.owl_importer2_nodes_done(importer);
    }

    public static final SubLObject owl_importer2_assert_subject_triples(SubLObject importer, SubLObject node, SubLObject assert_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == subl_promotions.memberP(node, $owl_importer2_subject_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject v_graph = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_graph(importer);
                    {
                        SubLObject _prev_bind_0 = $owl_importer2_subject_stack$.currentBinding(thread);
                        try {
                            $owl_importer2_subject_stack$.bind(cons(node, $owl_importer2_subject_stack$.getDynamicValue(thread)), thread);
                            if ((NIL != valid_rdf_subject_p(node)) && (NIL == rdf_list_p(node, v_graph))) {
                                if (NIL != lengthG($owl_importer2_subject_stack$.getDynamicValue(thread), $int$40, UNPROVIDED)) {
                                    Errors.sublisp_break($str_alt68$Assert_nesting_depth___D, new SubLObject[]{ length($owl_importer2_subject_stack$.getDynamicValue(thread)) });
                                }
                                {
                                    SubLObject cdolist_list_var = rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
                                    SubLObject triple = NIL;
                                    for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , triple = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_triple(importer, triple, assert_mt);
                                    }
                                }
                            }
                        } finally {
                            $owl_importer2_subject_stack$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return node;
        }
    }

    public static SubLObject owl_importer2_assert_subject_triples(final SubLObject importer, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == memberP(node, owl_importer2.$owl_importer2_subject_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
            final SubLObject _prev_bind_0 = owl_importer2.$owl_importer2_subject_stack$.currentBinding(thread);
            try {
                owl_importer2.$owl_importer2_subject_stack$.bind(cons(node, owl_importer2.$owl_importer2_subject_stack$.getDynamicValue(thread)), thread);
                if ((NIL != rdf_graph.valid_rdf_subject_p(node)) && (NIL == rdf_utilities.rdf_list_p(node, v_graph))) {
                    if (NIL != list_utilities.lengthG(owl_importer2.$owl_importer2_subject_stack$.getDynamicValue(thread), owl_importer2.$int$40, UNPROVIDED)) {
                        Errors.sublisp_break(owl_importer2.$str160$Assert_nesting_depth___D, new SubLObject[]{ length(owl_importer2.$owl_importer2_subject_stack$.getDynamicValue(thread)) });
                    }
                    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
                    SubLObject triple = NIL;
                    triple = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        owl_importer2.owl_importer2_assert_triple(importer, triple);
                        cdolist_list_var = cdolist_list_var.rest();
                        triple = cdolist_list_var.first();
                    } 
                }
            } finally {
                owl_importer2.$owl_importer2_subject_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return node;
    }

    public static final SubLObject owl_importer2_assert_triple(SubLObject importer, SubLObject triple, SubLObject assert_mt) {
        {
            SubLObject sentence = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_sentence_for_triple(importer, triple, assert_mt);
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(sentence);
            SubLObject import_term = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_import(importer);
            SubLObject cyclist = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_cyclist(importer);
            if (NIL == kb_accessors.binary_predicateP(predicate)) {
                owl_assert_wff(listS($$isa, predicate, $list_alt70), assert_mt, import_term, cyclist, UNPROVIDED);
            }
            {
                SubLObject successP = makeBoolean((NIL != com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_sentence_doneP(importer, sentence)) || (NIL != owl_assert_wff(sentence, assert_mt, import_term, cyclist, UNPROVIDED)));
                if (NIL == successP) {
                    Errors.sublisp_break($str_alt71$Failed_to_assert__S, new SubLObject[]{ sentence });
                }
            }
            com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_note_sentence_done(importer, sentence);
        }
        note_percent_progress(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_triples_done(importer), com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_triple_count(importer));
        return triple;
    }

    public static SubLObject owl_importer2_assert_triple(final SubLObject importer, final SubLObject triple) {
        final SubLObject sentence = owl_importer2.owl_importer2_sentence_for_triple(importer, triple);
        final SubLObject predicate = atomic_sentence_predicate(sentence);
        final SubLObject import_term = owl_importer2.owl_importer2_import(importer);
        final SubLObject cyclist = owl_importer2.owl_importer2_cyclist(importer);
        final SubLObject assert_mt = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_MT, UNPROVIDED);
        if (NIL == binary_predicateP(predicate)) {
            owl_utilities.owl_assert_wff(listS(owl_importer2.$$isa, predicate, owl_importer2.$list162), assert_mt, import_term, cyclist, UNPROVIDED);
        }
        if (NIL != sentence) {
            final SubLObject successP = makeBoolean((NIL != owl_importer2.owl_importer2_sentence_doneP(importer, sentence)) || (NIL != owl_utilities.owl_assert_wff(sentence, assert_mt, import_term, cyclist, UNPROVIDED)));
            if (NIL == successP) {
                Errors.warn(owl_importer2.$str163$Failed_to_assert__S_in__S, sentence, assert_mt);
                wff.explain_why_not_wff_assert(narts_high.nart_expand(sentence), assert_mt, UNPROVIDED);
                format_nil.force_format(owl_importer2.owl_importer2_get_option(importer, $PROGRESS_STREAM, UNPROVIDED), owl_importer2.$str164$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        owl_importer2.owl_importer2_note_sentence_done(importer, sentence);
        note_percent_progress(owl_importer2.owl_importer2_triples_done(importer), owl_importer2.owl_importer2_triple_count(importer));
        return triple;
    }

    public static final SubLObject owl_importer2_sentence_doneP_alt(SubLObject importer, SubLObject sentence) {
        return set.set_memberP(sentence, com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_sentences(importer));
    }

    public static SubLObject owl_importer2_sentence_doneP(final SubLObject importer, final SubLObject sentence) {
        return set_memberP(sentence, owl_importer2.owl_importer2_sentences(importer));
    }

    public static final SubLObject owl_importer2_note_sentence_done_alt(SubLObject importer, SubLObject sentence) {
        com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_increment_triples_done(importer);
        return set.set_add(sentence, com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_sentences(importer));
    }

    public static SubLObject owl_importer2_note_sentence_done(final SubLObject importer, final SubLObject sentence) {
        owl_importer2.owl_importer2_increment_triples_done(importer);
        return set_add(sentence, owl_importer2.owl_importer2_sentences(importer));
    }

    public static final SubLObject owl_importer2_sentence_for_triple(SubLObject importer, SubLObject triple, SubLObject assert_mt) {
        return make_binary_formula(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple_predicate(triple), assert_mt), com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple_subject(triple), NIL), com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple_object(triple), assert_mt));
    }

    public static SubLObject owl_importer2_sentence_for_triple(final SubLObject importer, final SubLObject triple) {
        final SubLObject predicate = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_predicate(triple), UNPROVIDED);
        final SubLObject subject = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_subject(triple), T);
        final SubLObject v_object = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(triple), rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)));
        if (((NIL != predicate) && (NIL != subject)) && (NIL != v_object)) {
            return make_binary_formula(predicate, subject, v_object);
        }
        return NIL;
    }

    public static SubLObject owl_importer2_find_or_create_term_for_list_node(final SubLObject importer, final SubLObject list_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == rdf_utilities.rdf_list_p(list_node, v_graph))) {
            Errors.error(owl_importer2.$str165$_S_is_not_a_list_node_, list_node);
        }
        if ((NIL != rdf_uri.rdf_uri_p(list_node)) && (NIL != rdf_uri.rdf_uri_matchesP(list_node, rdf_utilities.rdf_expanded_name(owl_importer2.$$$nil)))) {
            return owl_importer2.$$TheEmptyList;
        }
        return czer_main.canonicalize_term(make_el_formula(owl_importer2.$$TheList, owl_importer2.owl_importer2_list_node_terms(importer, list_node), UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject owl_importer2_list_node_terms(final SubLObject importer, final SubLObject node) {
        if ((NIL != rdf_uri.rdf_uri_p(node)) && (NIL != rdf_uri.rdf_uri_matchesP(node, rdf_utilities.rdf_expanded_name(owl_importer2.$$$nil)))) {
            return NIL;
        }
        final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
        final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
        final SubLObject first_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name(owl_importer2.$$$first), UNPROVIDED, UNPROVIDED), triples, EQ, owl_importer2.RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject first_term = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(first_triple), UNPROVIDED);
        final SubLObject rest_triple = find(rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdf_expanded_name(owl_importer2.$$$rest), UNPROVIDED, UNPROVIDED), triples, EQ, owl_importer2.RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED);
        final SubLObject rest_terms = owl_importer2.owl_importer2_list_node_terms(importer, rdf_triple.rdf_triple_object(rest_triple));
        return cons(first_term, rest_terms);
    }

    /**
     *
     *
     * @param ASSERT-MT;
     * 		If non-NIL, subject triples for RDF-NODE will be asserted here.
     */
    @LispMethod(comment = "@param ASSERT-MT;\r\n\t\tIf non-NIL, subject triples for RDF-NODE will be asserted here.")
    public static final SubLObject owl_importer2_find_or_create_term_alt(SubLObject importer, SubLObject rdf_node, SubLObject assert_mt) {
        {
            SubLObject v_term = dictionary.dictionary_lookup_without_values(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_terms(importer), rdf_node, UNPROVIDED);
            if (NIL != v_term) {
                return v_term;
            } else {
                if (NIL != rdf_uri_p(rdf_node)) {
                    v_term = rdf_find_or_create_term_for_uri(rdf_node);
                } else {
                    if (NIL != rdf_literal_p(rdf_node)) {
                        v_term = rdf_find_or_create_term_for_literal(rdf_node);
                    } else {
                        if (NIL != rdf_blank_node.rdf_blank_node_p(rdf_node)) {
                            v_term = com.cyc.cycjava.cycl.owl.owl_importer2.owl_find_or_create_term_for_blank_node(rdf_node, importer, assert_mt);
                        } else {
                            Errors.error($str_alt72$Can_t_find_or_create_term_for__S, rdf_node);
                        }
                    }
                }
            }
            if ((NIL != assert_mt) && (NIL == rdf_list_p(rdf_node, com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_graph(importer)))) {
                com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_subject_triples(importer, rdf_node, assert_mt);
            }
            dictionary.dictionary_enter(com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_terms(importer), rdf_node, v_term);
            return v_term;
        }
    }

    /**
     *
     *
     * @param ASSERT-MT;
     * 		If non-NIL, subject triples for RDF-NODE will be asserted here.
     */
    @LispMethod(comment = "@param ASSERT-MT;\r\n\t\tIf non-NIL, subject triples for RDF-NODE will be asserted here.")
    public static SubLObject owl_importer2_find_or_create_term(final SubLObject importer, final SubLObject rdf_node, SubLObject mark_term_in_ontologyP) {
        if (mark_term_in_ontologyP == UNPROVIDED) {
            mark_term_in_ontologyP = NIL;
        }
        SubLObject v_term = dictionary_lookup_without_values(owl_importer2.owl_importer2_terms(importer), rdf_node, UNPROVIDED);
        if (NIL != v_term) {
            return v_term;
        }
        if (NIL != rdf_uri.rdf_uri_p(rdf_node)) {
            v_term = owl_importer2.owl_importer2_find_or_create_term_for_uri(importer, rdf_node, mark_term_in_ontologyP);
        } else
            if (NIL != rdf_literal.rdf_literal_p(rdf_node)) {
                v_term = rdf_utilities.rdf_find_or_create_term_for_literal(rdf_node);
            } else
                if (NIL != rdf_blank_node_p(rdf_node)) {
                    v_term = owl_importer2.owl_find_or_create_term_for_blank_node(rdf_node, importer);
                    owl_importer2.owl_importer2_mark_term_in_ontology(importer, v_term, UNPROVIDED);
                    mark_term_in_ontologyP = NIL;
                } else {
                    Errors.error(owl_importer2.$str172$Can_t_find_or_create_term_for__S, rdf_node);
                }


        if (NIL != mark_term_in_ontologyP) {
            owl_importer2.owl_importer2_mark_term_in_ontology(importer, v_term, UNPROVIDED);
        }
        if (NIL == rdf_utilities.rdf_list_p(rdf_node, owl_importer2.owl_importer2_graph(importer))) {
            owl_importer2.owl_importer2_assert_subject_triples(importer, rdf_node);
        }
        dictionary_enter(owl_importer2.owl_importer2_terms(importer), rdf_node, v_term);
        return v_term;
    }

    public static SubLObject owl_importer2_find_or_create_term_for_uri(final SubLObject importer, final SubLObject uri, SubLObject mark_term_in_ontologyP) {
        if (mark_term_in_ontologyP == UNPROVIDED) {
            mark_term_in_ontologyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        final SubLObject ontology_uri_string = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_URI, UNPROVIDED);
        SubLObject v_term = NIL;
        if ((NIL != owl_importer2.owl_importer2_get_option(importer, owl_importer2.$kw173$USE_GENLS_FOR_RDFS_SUBCLASS_, UNPROVIDED)) && (NIL != rdf_graph.rdf_nodes_equalP(uri, rdf_graph.get_known_uri(owl_importer2.$str174$rdfs_subClassOf)))) {
            return owl_importer2.$$genls;
        }
        if (NIL != owl_utilities.implementation_uriP(uri)) {
            return rdf_utilities.rdf_find_or_create_term_for_uri(uri);
        }
        if (NIL != owl_cycl_to_xml.cyc_uri_p(uri)) {
            v_term = owl_importer2.cyc_uri_to_term(uri);
            if (NIL == forts.fort_p(v_term)) {
                Errors.warn(owl_importer2.$str176$Could_not_find_Cyc_term_for_URI__, owl_importer2.dwim_rdf_uri_string(uri));
            }
        }
        if ((NIL == forts.fort_p(v_term)) && (NIL != string_utilities.starts_with(rdf_uri.rdf_uri_utf8_string(uri), ontology_uri_string))) {
            v_term = owl_importer2.owl_importer2_find_or_create_uri_term(importer, uri, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == forts.fort_p(v_term)) && (NIL != owl_importer2.owl_importer2_get_option(importer, owl_importer2.$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri(rdf_graph.rdf_graph_prefix_map(owl_importer2.owl_importer2_graph(importer)), uri);
            final SubLObject found_name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != string_utilities.non_empty_string_p(found_prefix)) && (NIL != string_utilities.non_empty_string_p(found_name))) {
                v_term = owl_importer2.owl_importer2_find_or_create_uri_term(importer, uri, found_prefix, found_name);
            }
        }
        if ((NIL != mark_term_in_ontologyP) && (NIL != forts.fort_p(v_term))) {
            owl_importer2.owl_importer2_mark_term_in_ontology(importer, v_term, uri);
        }
        if (NIL == forts.fort_p(v_term)) {
            v_term = rdf_utilities.rdf_find_or_create_term_for_uri(uri);
        }
        return v_term;
    }

    public static SubLObject owl_importer2_mark_term_in_ontology(final SubLObject importer, final SubLObject v_term, SubLObject uri) {
        if (uri == UNPROVIDED) {
            uri = NIL;
        }
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        if (((NIL != uri) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_uri.rdf_uri_p(uri))) {
            throw new AssertionError(uri);
        }
        final SubLObject ontology_term = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_TERM, UNPROVIDED);
        final SubLObject ontology_mt = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_MT, UNPROVIDED);
        final SubLObject possibly_abbreviated_uri_string = (NIL != uri) ? owl_importer2.owl_importer2_possibly_abbreviate_uri(importer, uri) : NIL;
        owl_utilities.owl_assert_wff(list(owl_importer2.$$quotedIsa, v_term, list(owl_importer2.$$TermFromOntologyFn, ontology_term)), owl_importer2.$$BookkeepingMt, v_term, UNPROVIDED, UNPROVIDED);
        if (NIL != string_utilities.non_empty_string_p(possibly_abbreviated_uri_string)) {
            owl_utilities.owl_assert_wff(list(owl_importer2.$$synonymousExternalConcept, v_term, ontology_term, possibly_abbreviated_uri_string), ontology_mt, v_term, UNPROVIDED, UNPROVIDED);
        }
        return v_term;
    }

    public static SubLObject owl_importer2_find_or_create_uri_term(final SubLObject importer, final SubLObject uri, SubLObject prefix, SubLObject name) {
        if (prefix == UNPROVIDED) {
            prefix = NIL;
        }
        if (name == UNPROVIDED) {
            name = NIL;
        }
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        final SubLObject uri_string = owl_importer2.dwim_rdf_uri_string(uri);
        final SubLObject ontology_term = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_TERM, UNPROVIDED);
        final SubLObject ontology_mt = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_MT, UNPROVIDED);
        SubLObject v_term = kb_mapping_utilities.fpred_value_in_any_mt(uri_string, owl_importer2.$$rdfURI, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            final SubLObject rdf_uri_local_part = rdf_uri.rdf_uri_local_part(uri);
            if (NIL != string_utilities.empty_string_p(rdf_uri_local_part)) {
                return ontology_term;
            }
            SubLObject suffix = owl_importer2.owl_importer2_get_option(importer, $CONSTANT_SUFFIX, UNPROVIDED);
            if (NIL == string_utilities.non_empty_string_p(prefix)) {
                prefix = owl_importer2.owl_importer2_get_option(importer, $CONSTANT_PREFIX, UNPROVIDED);
            }
            if ((NIL != string_utilities.non_empty_string_p(prefix)) && (NIL == string_utilities.ends_with(prefix, owl_importer2.$str32$_, UNPROVIDED))) {
                prefix = cconcatenate(prefix, owl_importer2.$str32$_);
            }
            if (!prefix.isString()) {
                prefix = owl_importer2.$str10$;
            }
            if (!suffix.isString()) {
                suffix = owl_importer2.$str10$;
            }
            if (NIL == string_utilities.non_empty_string_p(name)) {
                name = rdf_uri_local_part;
            }
            if (NIL != owl_importer2.owl_importer2_get_option(importer, owl_importer2.$kw183$USE_RDFS_LABEL_FOR_CONSTANT_NAME_, UNPROVIDED)) {
                final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
                final SubLObject label_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, uri, rdf_graph.get_known_uri(owl_importer2.$str184$rdfs_label)).first();
                final SubLObject label_node = (NIL != rdf_triple.rdf_triple_p(label_triple, UNPROVIDED)) ? rdf_triple.rdf_triple_object(label_triple) : NIL;
                final SubLObject label_string = (NIL != rdf_literal.rdf_literal_p(label_node)) ? rdf_literal.rdf_literal_utf8_lexical_form(label_node) : NIL;
                if (NIL != string_utilities.non_empty_string_p(label_string)) {
                    name = string_utilities.make_valid_constant_name(label_string, rdf_graph.rdf_graph_find_triple(v_graph, uri, rdf_graph.get_known_uri(owl_importer2.$str185$rdf_type), rdf_graph.get_known_uri(owl_importer2.$str186$owl_Class)));
                }
            }
            if (NIL != string_utilities.non_empty_string_p(suffix)) {
                name = cconcatenate(name, suffix);
            }
            if ((NIL != string_utilities.empty_string_p(prefix)) && (NIL != string_utilities.empty_string_p(suffix))) {
                v_term = rdf_utilities.rdf_find_or_create_term_for_uri(uri);
            } else {
                v_term = owl_utilities.owl_create_wff(name, NIL, ontology_mt, prefix, NIL, UNPROVIDED);
            }
            if (NIL != forts.fort_p(v_term)) {
                owl_utilities.owl_assert_wff(list(owl_importer2.$$rdfURI, v_term, owl_importer2.dwim_rdf_uri_string(uri)), ontology_mt, v_term, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL != narts_high.naut_p(v_term) ? narts_high.find_nart(v_term) : v_term;
    }

    public static SubLObject owl_importer2_possibly_abbreviate_uri(final SubLObject importer, final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_importer2.owl_importer2_p(importer) : "! owl_importer2.owl_importer2_p(importer) " + ("owl_importer2.owl_importer2_p(importer) " + "CommonSymbols.NIL != owl_importer2.owl_importer2_p(importer) ") + importer;
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        final SubLObject ontology_uri = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_URI, UNPROVIDED);
        final SubLObject synonymous_concept_prefix = owl_importer2.owl_importer2_get_option(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED);
        if (NIL != string_utilities.substringP(rdf_uri.rdf_uri_base_uri(uri), ontology_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != string_utilities.empty_string_p(synonymous_concept_prefix)) {
                return rdf_uri.rdf_uri_local_part(uri);
            }
            if (NIL != string_utilities.non_empty_string_p(synonymous_concept_prefix)) {
                return cconcatenate(synonymous_concept_prefix, new SubLObject[]{ owl_importer2.$str32$_, rdf_uri.rdf_uri_local_part(uri) });
            }
            return rdf_uri.rdf_uri_utf8_string(uri);
        } else {
            if (NIL != owl_cycl_to_xml.cyc_uri_p(uri)) {
                return rdf_uri.rdf_uri_utf8_string(uri);
            }
            if (T != owl_importer2.owl_importer2_get_option(importer, owl_importer2.$SYNONYMOUS_CONCEPT_PREFIX, UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri(rdf_graph.rdf_graph_prefix_map(owl_importer2.owl_importer2_graph(importer)), uri);
                final SubLObject found_name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != string_utilities.non_empty_string_p(found_prefix)) && (NIL != string_utilities.non_empty_string_p(found_name))) {
                    return cconcatenate(found_prefix, new SubLObject[]{ owl_importer2.$str32$_, found_name });
                }
            }
            return rdf_uri.rdf_uri_utf8_string(uri);
        }
    }

    public static SubLObject cyc_uri_to_term(final SubLObject uri) {
        assert NIL != owl_cycl_to_xml.cyc_uri_p(uri) : "! owl_cycl_to_xml.cyc_uri_p(uri) " + ("owl_cycl_to_xml.cyc_uri_p(uri) " + "CommonSymbols.NIL != owl_cycl_to_xml.cyc_uri_p(uri) ") + uri;
        final SubLObject term_id_string = (NIL != rdf_uri.rdf_uri_p(uri)) ? rdf_uri.rdf_uri_local_part(uri) : rdf_uri.rdf_uri_local_part(rdf_uri.get_rdf_uri(uri, UNPROVIDED, UNPROVIDED));
        SubLObject v_term = NIL;
        v_term = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(term_id_string);
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        v_term = constants_high.find_constant(term_id_string);
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        v_term = constants_high.find_constant(string_utilities.char_subst(CHAR_underbar, CHAR_hyphen, term_id_string));
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        v_term = constants_high.find_constant(string_utilities.char_subst(CHAR_hyphen, CHAR_underbar, term_id_string));
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        return NIL;
    }

    public static SubLObject dwim_rdf_uri_string(final SubLObject uri) {
        return uri.isString() ? uri : NIL != rdf_uri.rdf_uri_p(uri) ? rdf_uri.rdf_uri_utf8_string(uri) : owl_importer2.$str10$;
    }

    public static final SubLObject owl_find_or_create_term_for_blank_node(SubLObject node, SubLObject importer, SubLObject assert_mt) {
        {
            SubLObject v_graph = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_graph(importer);
            SubLObject cyclist = com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_cyclist(importer);
            if (NIL != rdf_list_p(node, v_graph)) {
                {
                    SubLObject v_term = rdf_find_or_create_term_for_list_node(node, v_graph);
                    SubLObject cdolist_list_var = rdf_list_nodes(node, v_graph);
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.owl.owl_importer2.owl_importer2_assert_subject_triples(importer, item, assert_mt);
                    }
                    return v_term;
                }
            } else {
                return owl_create_wff($$$AnonymousOWLTerm, NIL, $$UniversalVocabularyMt, $str_alt75$, T, cyclist);
            }
        }
    }

    public static SubLObject owl_find_or_create_term_for_blank_node(final SubLObject node, final SubLObject importer) {
        final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
        final SubLObject cyclist = owl_importer2.owl_importer2_cyclist(importer);
        SubLObject result = NIL;
        if (NIL != rdf_utilities.rdf_list_p(node, v_graph)) {
            final SubLObject v_term = owl_importer2.owl_importer2_find_or_create_term_for_list_node(importer, node);
            SubLObject cdolist_list_var = rdf_utilities.rdf_list_nodes(node, v_graph);
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                owl_importer2.owl_importer2_assert_subject_triples(importer, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            result = v_term;
        } else
            if (NIL != owl_utilities.owl_intersection_of_node_p(node, v_graph)) {
                final SubLObject intersection_objects = rdf_graph.rdf_graph_find_objects(v_graph, node, owl_utilities.owl_expanded_name(owl_importer2.$$$intersectionOf));
                SubLObject intersection_terms = NIL;
                SubLObject cdolist_list_var2 = intersection_objects;
                SubLObject intersection_object = NIL;
                intersection_object = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$2 = el_list_items(owl_importer2.owl_importer2_find_or_create_term(importer, intersection_object, UNPROVIDED));
                    SubLObject v_term2 = NIL;
                    v_term2 = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject item_var = v_term2;
                        if (NIL == member(item_var, intersection_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                            intersection_terms = cons(item_var, intersection_terms);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        v_term2 = cdolist_list_var_$2.first();
                    } 
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    intersection_object = cdolist_list_var2.first();
                } 
                intersection_terms = nreverse(intersection_terms);
                result = list(owl_importer2.$$CollectionIntersectionFn, bq_cons(owl_importer2.$$TheSet, append(intersection_terms, NIL)));
            } else
                if (NIL != owl_utilities.owl_union_of_node_p(node, v_graph)) {
                    final SubLObject union_objects = rdf_graph.rdf_graph_find_objects(v_graph, node, owl_utilities.owl_expanded_name(owl_importer2.$$$unionOf));
                    SubLObject union_terms = NIL;
                    SubLObject cdolist_list_var2 = union_objects;
                    SubLObject union_object = NIL;
                    union_object = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$3 = el_list_items(owl_importer2.owl_importer2_find_or_create_term(importer, union_object, UNPROVIDED));
                        SubLObject v_term2 = NIL;
                        v_term2 = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            final SubLObject item_var = v_term2;
                            if (NIL == member(item_var, union_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                union_terms = cons(item_var, union_terms);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            v_term2 = cdolist_list_var_$3.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        union_object = cdolist_list_var2.first();
                    } 
                    union_terms = nreverse(union_terms);
                    result = list(owl_importer2.$$CollectionUnionFn, bq_cons(owl_importer2.$$TheSet, append(union_terms, NIL)));
                } else
                    if (NIL != owl_utilities.owl_complement_of_node_p(node, v_graph)) {
                        final SubLObject complement_object = rdf_graph.rdf_graph_find_objects(v_graph, node, owl_utilities.owl_expanded_name(owl_importer2.$$$complementOf)).first();
                        final SubLObject complement_term = owl_importer2.owl_importer2_find_or_create_term(importer, complement_object, UNPROVIDED);
                        result = list(owl_importer2.$$CollectionDifferenceFn, owl_importer2.$$Thing, complement_term);
                    } else
                        if (NIL != owl_utilities.owl_restriction_node_p(node, v_graph)) {
                            final SubLObject subject_triples = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, UNPROVIDED);
                            SubLObject on_property_triple = NIL;
                            SubLObject type_triple = NIL;
                            SubLObject value_constraint_triple = NIL;
                            SubLObject cardinality_triple = NIL;
                            SubLObject subclassof_triple = NIL;
                            SubLObject other_triples = NIL;
                            SubLObject cdolist_list_var3 = subject_triples;
                            SubLObject triple = NIL;
                            triple = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$onProperty), UNPROVIDED, UNPROVIDED))) {
                                    on_property_triple = triple;
                                } else
                                    if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name(owl_importer2.$$$type), UNPROVIDED, UNPROVIDED))) {
                                        type_triple = triple;
                                    } else
                                        if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$allValuesFrom), UNPROVIDED, UNPROVIDED))) {
                                            value_constraint_triple = triple;
                                        } else
                                            if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$hasValue), UNPROVIDED, UNPROVIDED))) {
                                                value_constraint_triple = triple;
                                            } else
                                                if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$someValuesFrom), UNPROVIDED, UNPROVIDED))) {
                                                    value_constraint_triple = triple;
                                                } else
                                                    if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$valuesFrom), UNPROVIDED, UNPROVIDED))) {
                                                        value_constraint_triple = triple;
                                                    } else
                                                        if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(rdf_utilities.rdfs_expanded_name(owl_importer2.$$$subClassOf), UNPROVIDED, UNPROVIDED))) {
                                                            subclassof_triple = triple;
                                                        } else
                                                            if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$cardinality), UNPROVIDED, UNPROVIDED))) {
                                                                cardinality_triple = triple;
                                                            } else
                                                                if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$minCardinality), UNPROVIDED, UNPROVIDED))) {
                                                                    cardinality_triple = triple;
                                                                } else
                                                                    if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(triple), rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name(owl_importer2.$$$maxCardinality), UNPROVIDED, UNPROVIDED))) {
                                                                        cardinality_triple = triple;
                                                                    } else {
                                                                        other_triples = cons(triple, other_triples);
                                                                    }









                                cdolist_list_var3 = cdolist_list_var3.rest();
                                triple = cdolist_list_var3.first();
                            } 
                            final SubLObject only_assert_restrictions_as_rmp_gafsP = owl_importer2.owl_importer2_get_option(importer, owl_importer2.$kw205$ONLY_ASSERT_RESTRICTIONS_AS_RMP_GAFS_, UNPROVIDED);
                            final SubLObject value_constraint_node = (NIL != value_constraint_triple) ? rdf_triple.rdf_triple_predicate(value_constraint_triple) : NIL;
                            final SubLObject cardinality_pred_node = (NIL != cardinality_triple) ? rdf_triple.rdf_triple_predicate(cardinality_triple) : NIL;
                            final SubLObject cardinality_value = (NIL != cardinality_triple) ? owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(cardinality_triple), UNPROVIDED) : NIL;
                            final SubLObject pred = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(on_property_triple), UNPROVIDED);
                            final SubLObject target = (NIL != value_constraint_triple) ? owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(value_constraint_triple), UNPROVIDED) : NIL;
                            final SubLObject col1 = (NIL != subclassof_triple) ? owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(subclassof_triple), UNPROVIDED) : owl_importer2.$$Thing;
                            if (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$allValuesFrom), UNPROVIDED, UNPROVIDED))) {
                                if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                    result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllOnly, pred, target, UNPROVIDED);
                                } else {
                                    result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(owl_importer2.$$relationInstanceOnly, pred, owl_importer2.$sym209$_X, target)));
                                }
                            } else
                                if (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$someValuesFrom), UNPROVIDED, UNPROVIDED))) {
                                    if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                        result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllExists, pred, target, UNPROVIDED);
                                    } else {
                                        result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(owl_importer2.$$relationInstanceExists, pred, owl_importer2.$sym209$_X, target)));
                                    }
                                } else
                                    if (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$hasValue), UNPROVIDED, UNPROVIDED))) {
                                        if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                            result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllInstance, pred, target, UNPROVIDED);
                                        } else {
                                            result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(pred, owl_importer2.$sym209$_X, target)));
                                        }
                                    } else
                                        if (NIL != rdf_graph.rdf_nodes_equalP(cardinality_pred_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$maxCardinality), UNPROVIDED, UNPROVIDED))) {
                                            final SubLObject col2 = ((NIL != value_constraint_node) && (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$valuesFrom), UNPROVIDED, UNPROVIDED)))) ? target : owl_importer2.$$Thing;
                                            if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                                result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllExistsMax, pred, target, cardinality_value);
                                            } else {
                                                result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(owl_importer2.$$relationInstanceExistsMax, pred, owl_importer2.$sym209$_X, col2, cardinality_value)));
                                            }
                                        } else
                                            if (NIL != rdf_graph.rdf_nodes_equalP(cardinality_pred_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$minCardinality), UNPROVIDED, UNPROVIDED))) {
                                                final SubLObject col2 = ((NIL != value_constraint_node) && (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$valuesFrom), UNPROVIDED, UNPROVIDED)))) ? target : owl_importer2.$$Thing;
                                                if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                                    result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllExistsMin, pred, target, cardinality_value);
                                                } else {
                                                    result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(owl_importer2.$$relationInstanceExistsMin, pred, owl_importer2.$sym209$_X, col2, cardinality_value)));
                                                }
                                            } else
                                                if (NIL != rdf_graph.rdf_nodes_equalP(cardinality_pred_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$cardinality), UNPROVIDED, UNPROVIDED))) {
                                                    final SubLObject col2 = ((NIL != value_constraint_node) && (NIL != rdf_graph.rdf_nodes_equalP(value_constraint_node, rdf_graph.rdf_graph_get_uri(v_graph, owl_utilities.owl_expanded_name(owl_importer2.$$$valuesFrom), UNPROVIDED, UNPROVIDED)))) ? target : owl_importer2.$$Thing;
                                                    if (NIL != only_assert_restrictions_as_rmp_gafsP) {
                                                        result = owl_importer2.owl_importer2_assert_rmp_gaf_directly(importer, node, owl_importer2.$$relationAllExistsCount, pred, target, cardinality_value);
                                                    } else {
                                                        result = list(owl_importer2.$$CollectionSubsetFn, col1, list(owl_importer2.$$TheSetOf, owl_importer2.$sym209$_X, list(owl_importer2.$$relationInstanceExistsCount, pred, owl_importer2.$sym209$_X, col2, cardinality_value)));
                                                    }
                                                } else {
                                                    Errors.sublisp_break(owl_importer2.$str220$restriction_not_handled_yet___A__, new SubLObject[]{ subject_triples, on_property_triple, type_triple, value_constraint_triple });
                                                }





                        } else
                            if (NIL != owl_utilities.owl_one_of_node_p(node, v_graph)) {
                                final SubLObject one_of_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, node, owl_utilities.owl_expanded_name(owl_importer2.$$$oneOf)).first();
                                final SubLObject cols_list = owl_importer2.owl_importer2_find_or_create_term(importer, rdf_triple.rdf_triple_object(one_of_triple), UNPROVIDED);
                                result = bq_cons(owl_importer2.$$TheCollection, append(el_list_items(cols_list), NIL));
                            } else {
                                final SubLObject v_term = owl_utilities.owl_create_wff(owl_importer2.$$$AnonymousOWLTerm, NIL, owl_importer2.$$UniversalVocabularyMt, owl_importer2.$str10$, T, cyclist);
                                owl_utilities.owl_assert_wff(make_binary_formula(owl_importer2.$$quotedIsa, v_term, owl_importer2.$$IndeterminateTerm), owl_importer2.$$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                result = v_term;
                            }





        return result;
    }

    public static SubLObject owl_importer2_assert_rmp_gaf_directly(final SubLObject importer, final SubLObject node, final SubLObject rmp_pred, final SubLObject pred, final SubLObject target, SubLObject cardinality_value) {
        if (cardinality_value == UNPROVIDED) {
            cardinality_value = NIL;
        }
        final SubLObject v_graph = owl_importer2.owl_importer2_graph(importer);
        final SubLObject ontology_mt = owl_importer2.owl_importer2_get_option(importer, $ONTOLOGY_MT, UNPROVIDED);
        final SubLObject spec_nodes = Mapping.mapcar(owl_importer2.RDF_TRIPLE_SUBJECT, rdf_graph.rdf_graph_find_object_triples(v_graph, node, rdf_graph.rdf_graph_get_uri(v_graph, rdf_utilities.rdfs_expanded_name(owl_importer2.$$$subClassOf), UNPROVIDED, UNPROVIDED)));
        if (NIL == spec_nodes) {
            Errors.warn(owl_importer2.$str227$___A_was_not_the_object_of_any_rd, node);
            return NIL;
        }
        SubLObject cdolist_list_var = spec_nodes;
        SubLObject spec_node = NIL;
        spec_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject spec_term = owl_importer2.owl_importer2_find_or_create_term(importer, spec_node, UNPROVIDED);
            if (NIL == cardinality_value) {
                owl_importer2.owl_importer2_assert_wff(importer, make_ternary_formula(rmp_pred, pred, spec_term, target), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                owl_importer2.owl_importer2_assert_wff(importer, make_quaternary_formula(rmp_pred, pred, spec_term, target, cardinality_value), ontology_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject owl_importer2_create_wff(final SubLObject importer, final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP, SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return owl_utilities.owl_create_wff(name, isas, defining_mt, prefix, capitalizeP, cyclist);
    }

    public static SubLObject owl_importer2_find_or_create_nart(final SubLObject importer, final SubLObject nart, final SubLObject assume_all_reifiableP) {
        return czer_main.cyc_find_or_create_nart(nart, assume_all_reifiableP);
    }

    public static SubLObject owl_importer2_assert_wff(final SubLObject importer, final SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P) {
        if (import_term == UNPROVIDED) {
            import_term = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (utf_8P == UNPROVIDED) {
            utf_8P = T;
        }
        return owl_utilities.owl_assert_wff(formula, mt, import_term, cyclist, utf_8P);
    }

    public static SubLObject owl_import_file_verify(final SubLObject filename, final SubLObject expected_constant_count, final SubLObject expected_nart_count, final SubLObject expected_assertion_count, SubLObject importer_options) {
        if (importer_options == UNPROVIDED) {
            importer_options = NIL;
        }
        final SubLObject importer = owl_importer2.owl_import_file(filename, importer_options);
        return importer;
    }

    public static SubLObject normalize_rdf_graph_by_eliminating_blank_node(final SubLObject v_graph, final SubLObject old_predicate_node, final SubLObject second_predicate_node, final SubLObject new_predicate_node, SubLObject progress_message) {
        if (progress_message == UNPROVIDED) {
            progress_message = owl_importer2.$str228$Eliminating_blank_nodes___;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_predicate_triple_addedP = NIL;
        final SubLObject list_var = rdf_graph.rdf_graph_find_predicate_triples(v_graph, old_predicate_node);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != progress_message ? progress_message : owl_importer2.$$$cdolist, thread);
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
                SubLObject triple = NIL;
                triple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject subject_node = rdf_triple.rdf_triple_subject(triple);
                    final SubLObject blank_node = rdf_triple.rdf_triple_object(triple);
                    final SubLObject object_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, blank_node, second_predicate_node).first();
                    final SubLObject object_node = (NIL != rdf_triple.rdf_triple_p(object_triple, UNPROVIDED)) ? rdf_triple.rdf_triple_object(object_triple) : NIL;
                    if (NIL != rdf_graph.valid_rdf_object_p(object_node)) {
                        new_predicate_triple_addedP = T;
                        rdf_utilities.rdf_graph_remove_node(v_graph, blank_node);
                        rdf_graph.rdf_graph_add_triple(v_graph, subject_node, new_predicate_node, object_node);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    triple = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
        if (NIL != new_predicate_triple_addedP) {
            final SubLObject possible_domain_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, old_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str230$rdfs_domain)).first();
            final SubLObject domain_node = (NIL != rdf_triple.rdf_triple_p(possible_domain_triple, UNPROVIDED)) ? rdf_triple.rdf_triple_object(possible_domain_triple) : rdf_graph.get_known_uri(owl_importer2.$str231$owl_Thing);
            final SubLObject possible_range_triple = rdf_graph.rdf_graph_find_subject_triples(v_graph, old_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str232$rdfs_range)).first();
            final SubLObject range_node = (NIL != rdf_triple.rdf_triple_p(possible_range_triple, UNPROVIDED)) ? rdf_triple.rdf_triple_object(possible_range_triple) : rdf_graph.get_known_uri(owl_importer2.$str231$owl_Thing);
            final SubLObject type_nodes = Mapping.mapcar(owl_importer2.RDF_TRIPLE_OBJECT, rdf_graph.rdf_graph_find_subject_triples(v_graph, second_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str185$rdf_type)));
            if (NIL != type_nodes) {
                SubLObject cdolist_list_var = type_nodes;
                SubLObject type_node = NIL;
                type_node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rdf_graph.rdf_graph_add_triple(v_graph, new_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str185$rdf_type), type_node);
                    cdolist_list_var = cdolist_list_var.rest();
                    type_node = cdolist_list_var.first();
                } 
            } else {
                rdf_graph.rdf_graph_add_triple(v_graph, new_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str185$rdf_type), rdf_graph.get_known_uri(owl_importer2.$str234$rdf_Property));
            }
            rdf_graph.rdf_graph_add_triple(v_graph, new_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str230$rdfs_domain), domain_node);
            rdf_graph.rdf_graph_add_triple(v_graph, new_predicate_node, rdf_graph.get_known_uri(owl_importer2.$str232$rdfs_range), range_node);
        }
        rdf_utilities.rdf_graph_remove_node(v_graph, old_predicate_node);
        return new_predicate_triple_addedP;
    }

    public static final SubLObject declare_owl_importer2_file_alt() {
        declareFunction("owl_importer_v2_version_number", "OWL-IMPORTER-V2-VERSION-NUMBER", 0, 0, false);
        declareFunction("import_owl_ontology_from_url", "IMPORT-OWL-ONTOLOGY-FROM-URL", 2, 1, false);
        declareFunction("import_owl_ontology_from_file", "IMPORT-OWL-ONTOLOGY-FROM-FILE", 2, 2, false);
        declareFunction("get_owl_importer2_for_url", "GET-OWL-IMPORTER2-FOR-URL", 1, 1, false);
        declareFunction("get_owl_importer2_for_file", "GET-OWL-IMPORTER2-FOR-FILE", 1, 2, false);
        declareFunction("find_owl_importer2_by_id", "FIND-OWL-IMPORTER2-BY-ID", 1, 0, false);
        declareFunction("owl_importer2_version_number", "OWL-IMPORTER2-VERSION-NUMBER", 0, 0, false);
        declareFunction("import_owl_triples_from_rdf_graph", "IMPORT-OWL-TRIPLES-FROM-RDF-GRAPH", 2, 1, false);
        declareFunction("cyclist_using_owl_importer2", "CYCLIST-USING-OWL-IMPORTER2", 1, 0, false);
        declareFunction("owl_importer2_load_graph", "OWL-IMPORTER2-LOAD-GRAPH", 1, 1, false);
        declareFunction("owl_importer2_load_graph_internal", "OWL-IMPORTER2-LOAD-GRAPH-INTERNAL", 2, 0, false);
        declareFunction("owl_importer2_print_function_trampoline", "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("owl_importer2_p", "OWL-IMPORTER2-P", 1, 0, false);
        new com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_p$UnaryFunction();
        declareFunction("owl_imp2_id", "OWL-IMP2-ID", 1, 0, false);
        declareFunction("owl_imp2_file", "OWL-IMP2-FILE", 1, 0, false);
        declareFunction("owl_imp2_graph", "OWL-IMP2-GRAPH", 1, 0, false);
        declareFunction("owl_imp2_cyclist", "OWL-IMP2-CYCLIST", 1, 0, false);
        declareFunction("owl_imp2_import", "OWL-IMP2-IMPORT", 1, 0, false);
        declareFunction("owl_imp2_ontologies", "OWL-IMP2-ONTOLOGIES", 1, 0, false);
        declareFunction("owl_imp2_terms", "OWL-IMP2-TERMS", 1, 0, false);
        declareFunction("owl_imp2_sentences", "OWL-IMP2-SENTENCES", 1, 0, false);
        declareFunction("owl_imp2_stats", "OWL-IMP2-STATS", 1, 0, false);
        declareFunction("owl_imp2_thread", "OWL-IMP2-THREAD", 1, 0, false);
        declareFunction("_csetf_owl_imp2_id", "_CSETF-OWL-IMP2-ID", 2, 0, false);
        declareFunction("_csetf_owl_imp2_file", "_CSETF-OWL-IMP2-FILE", 2, 0, false);
        declareFunction("_csetf_owl_imp2_graph", "_CSETF-OWL-IMP2-GRAPH", 2, 0, false);
        declareFunction("_csetf_owl_imp2_cyclist", "_CSETF-OWL-IMP2-CYCLIST", 2, 0, false);
        declareFunction("_csetf_owl_imp2_import", "_CSETF-OWL-IMP2-IMPORT", 2, 0, false);
        declareFunction("_csetf_owl_imp2_ontologies", "_CSETF-OWL-IMP2-ONTOLOGIES", 2, 0, false);
        declareFunction("_csetf_owl_imp2_terms", "_CSETF-OWL-IMP2-TERMS", 2, 0, false);
        declareFunction("_csetf_owl_imp2_sentences", "_CSETF-OWL-IMP2-SENTENCES", 2, 0, false);
        declareFunction("_csetf_owl_imp2_stats", "_CSETF-OWL-IMP2-STATS", 2, 0, false);
        declareFunction("_csetf_owl_imp2_thread", "_CSETF-OWL-IMP2-THREAD", 2, 0, false);
        declareFunction("make_owl_importer2", "MAKE-OWL-IMPORTER2", 0, 1, false);
        declareFunction("print_owl_importer2", "PRINT-OWL-IMPORTER2", 3, 0, false);
        declareFunction("new_owl_importer2", "NEW-OWL-IMPORTER2", 1, 1, false);
        declareFunction("new_owl_importer2_for_graph", "NEW-OWL-IMPORTER2-FOR-GRAPH", 1, 1, false);
        declareFunction("cyclist_using_owl_importer_v2", "CYCLIST-USING-OWL-IMPORTER-V2", 1, 0, false);
        declareFunction("next_owl_importer2_id", "NEXT-OWL-IMPORTER2-ID", 0, 0, false);
        declareFunction("owl_importer2_id_map", "OWL-IMPORTER2-ID-MAP", 0, 0, false);
        declareFunction("note_owl_importer2_id", "NOTE-OWL-IMPORTER2-ID", 2, 0, false);
        declareFunction("owl_importer2_id", "OWL-IMPORTER2-ID", 1, 0, false);
        declareFunction("owl_importer2_file", "OWL-IMPORTER2-FILE", 1, 0, false);
        declareFunction("owl_importer2_graph", "OWL-IMPORTER2-GRAPH", 1, 0, false);
        declareFunction("owl_importer2_set_graph", "OWL-IMPORTER2-SET-GRAPH", 2, 0, false);
        declareFunction("owl_importer2_cyclist", "OWL-IMPORTER2-CYCLIST", 1, 0, false);
        declareFunction("owl_importer2_import", "OWL-IMPORTER2-IMPORT", 1, 0, false);
        declareFunction("owl_importer2_ontologies", "OWL-IMPORTER2-ONTOLOGIES", 1, 0, false);
        declareFunction("owl_importer2_set_ontologies", "OWL-IMPORTER2-SET-ONTOLOGIES", 2, 0, false);
        declareFunction("owl_importer2_terms", "OWL-IMPORTER2-TERMS", 1, 0, false);
        declareFunction("owl_importer2_sentences", "OWL-IMPORTER2-SENTENCES", 1, 0, false);
        declareFunction("owl_importer2_stats", "OWL-IMPORTER2-STATS", 1, 0, false);
        declareFunction("owl_importer2_note_stat", "OWL-IMPORTER2-NOTE-STAT", 3, 0, false);
        declareFunction("owl_importer2_lookup_stat", "OWL-IMPORTER2-LOOKUP-STAT", 2, 0, false);
        declareFunction("owl_importer2_triple_count", "OWL-IMPORTER2-TRIPLE-COUNT", 1, 0, false);
        declareFunction("owl_importer2_triples_done", "OWL-IMPORTER2-TRIPLES-DONE", 1, 0, false);
        declareFunction("owl_importer2_nodes_done", "OWL-IMPORTER2-NODES-DONE", 1, 0, false);
        declareFunction("owl_importer2_increment_triples_done", "OWL-IMPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false);
        declareFunction("owl_importer2_increment_nodes_done", "OWL-IMPORTER2-INCREMENT-NODES-DONE", 1, 0, false);
        declareFunction("owl_importer2_note_thread", "OWL-IMPORTER2-NOTE-THREAD", 2, 0, false);
        declareFunction("owl_importer2_thread", "OWL-IMPORTER2-THREAD", 1, 0, false);
        declareFunction("sxhash_owl_importer2_method", "SXHASH-OWL-IMPORTER2-METHOD", 1, 0, false);
        declareFunction("sxhash_owl_importer2", "SXHASH-OWL-IMPORTER2", 1, 0, false);
        declareFunction("owl_importer2_assert_triples", "OWL-IMPORTER2-ASSERT-TRIPLES", 2, 0, false);
        declareFunction("owl_importer2_assert_subject_triples", "OWL-IMPORTER2-ASSERT-SUBJECT-TRIPLES", 3, 0, false);
        declareFunction("owl_importer2_assert_triple", "OWL-IMPORTER2-ASSERT-TRIPLE", 3, 0, false);
        declareFunction("owl_importer2_sentence_doneP", "OWL-IMPORTER2-SENTENCE-DONE?", 2, 0, false);
        declareFunction("owl_importer2_note_sentence_done", "OWL-IMPORTER2-NOTE-SENTENCE-DONE", 2, 0, false);
        declareFunction("owl_importer2_sentence_for_triple", "OWL-IMPORTER2-SENTENCE-FOR-TRIPLE", 3, 0, false);
        declareFunction("owl_importer2_find_or_create_term", "OWL-IMPORTER2-FIND-OR-CREATE-TERM", 3, 0, false);
        declareFunction("owl_find_or_create_term_for_blank_node", "OWL-FIND-OR-CREATE-TERM-FOR-BLANK-NODE", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_owl_importer2_file() {
        if (SubLFiles.USE_V1) {
	    declareFunction("show_owl_import_usages", "SHOW-OWL-IMPORT-USAGES", 0, 0, false);
	    declareFunction("owl_import_uri", "OWL-IMPORT-URI", 1, 1, false);
	    declareFunction("owl_import_file", "OWL-IMPORT-FILE", 1, 1, false);
	    declareFunction("owl_import_uri_from_file", "OWL-IMPORT-URI-FROM-FILE", 2, 1, false);
	    declareFunction("owl_import_file_to_graph_only", "OWL-IMPORT-FILE-TO-GRAPH-ONLY", 1, 1, false);
	    declareFunction("owl_import_xml_graph_from_file", "OWL-IMPORT-XML-GRAPH-FROM-FILE", 1, 0, false);
	    declareFunction("owl_import_with_importer", "OWL-IMPORT-WITH-IMPORTER", 1, 0, false);
	    declareFunction("determine_uri_prefix_from_prefix_map", "DETERMINE-URI-PREFIX-FROM-PREFIX-MAP", 2, 0, false);
	    declareFunction("determine_base_uri_from_prefix_map", "DETERMINE-BASE-URI-FROM-PREFIX-MAP", 1, 0, false);
	    declareFunction("validate_owl_import_parameters", "VALIDATE-OWL-IMPORT-PARAMETERS", 2, 0, false);
	    declareFunction("owl_importer_dwim_a_cyclist", "OWL-IMPORTER-DWIM-A-CYCLIST", 1, 0, false);
	    declareFunction("owl_importer_v2_version_number", "OWL-IMPORTER-V2-VERSION-NUMBER", 0, 0, false);
	    declareFunction("import_owl_ontology_from_url", "IMPORT-OWL-ONTOLOGY-FROM-URL", 2, 1, false);
	    declareFunction("import_owl_ontology_from_file", "IMPORT-OWL-ONTOLOGY-FROM-FILE", 2, 2, false);
	    declareFunction("get_owl_importer2_for_url", "GET-OWL-IMPORTER2-FOR-URL", 1, 1, false);
	    declareFunction("get_owl_importer2_for_file", "GET-OWL-IMPORTER2-FOR-FILE", 1, 2, false);
	    declareFunction("find_owl_importer2_by_id", "FIND-OWL-IMPORTER2-BY-ID", 1, 0, false);
	    declareFunction("owl_importer2_version_number", "OWL-IMPORTER2-VERSION-NUMBER", 0, 0, false);
	    declareFunction("import_owl_triples_from_rdf_graph", "IMPORT-OWL-TRIPLES-FROM-RDF-GRAPH", 2, 1, false);
	    declareFunction("cyclist_using_owl_importer2", "CYCLIST-USING-OWL-IMPORTER2", 1, 0, false);
	    declareFunction("owl_importer2_load_graph", "OWL-IMPORTER2-LOAD-GRAPH", 1, 1, false);
	    declareFunction("owl_importer2_load_graph_internal", "OWL-IMPORTER2-LOAD-GRAPH-INTERNAL", 2, 0, false);
	    declareFunction("owl_importer2_print_function_trampoline", "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("owl_importer2_p", "OWL-IMPORTER2-P", 1, 0, false);
            new owl_importer2.$owl_importer2_p$UnaryFunction();
	    declareFunction("owl_imp2_id", "OWL-IMP2-ID", 1, 0, false);
	    declareFunction("owl_imp2_uri", "OWL-IMP2-URI", 1, 0, false);
	    declareFunction("owl_imp2_file", "OWL-IMP2-FILE", 1, 0, false);
	    declareFunction("owl_imp2_graph", "OWL-IMP2-GRAPH", 1, 0, false);
	    declareFunction("owl_imp2_cyclist", "OWL-IMP2-CYCLIST", 1, 0, false);
	    declareFunction("owl_imp2_import", "OWL-IMP2-IMPORT", 1, 0, false);
	    declareFunction("owl_imp2_ontologies", "OWL-IMP2-ONTOLOGIES", 1, 0, false);
	    declareFunction("owl_imp2_terms", "OWL-IMP2-TERMS", 1, 0, false);
	    declareFunction("owl_imp2_sentences", "OWL-IMP2-SENTENCES", 1, 0, false);
	    declareFunction("owl_imp2_stats", "OWL-IMP2-STATS", 1, 0, false);
	    declareFunction("owl_imp2_options", "OWL-IMP2-OPTIONS", 1, 0, false);
	    declareFunction("owl_imp2_thread", "OWL-IMP2-THREAD", 1, 0, false);
	    declareFunction("_csetf_owl_imp2_id", "_CSETF-OWL-IMP2-ID", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_uri", "_CSETF-OWL-IMP2-URI", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_file", "_CSETF-OWL-IMP2-FILE", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_graph", "_CSETF-OWL-IMP2-GRAPH", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_cyclist", "_CSETF-OWL-IMP2-CYCLIST", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_import", "_CSETF-OWL-IMP2-IMPORT", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_ontologies", "_CSETF-OWL-IMP2-ONTOLOGIES", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_terms", "_CSETF-OWL-IMP2-TERMS", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_sentences", "_CSETF-OWL-IMP2-SENTENCES", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_stats", "_CSETF-OWL-IMP2-STATS", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_options", "_CSETF-OWL-IMP2-OPTIONS", 2, 0, false);
	    declareFunction("_csetf_owl_imp2_thread", "_CSETF-OWL-IMP2-THREAD", 2, 0, false);
	    declareFunction("make_owl_importer2", "MAKE-OWL-IMPORTER2", 0, 1, false);
	    declareFunction("visit_defstruct_owl_importer2", "VISIT-DEFSTRUCT-OWL-IMPORTER2", 2, 0, false);
	    declareFunction("visit_defstruct_object_owl_importer2_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER2-METHOD", 2, 0, false);
	    declareFunction("print_owl_importer2", "PRINT-OWL-IMPORTER2", 3, 0, false);
	    declareFunction("new_owl_importer2", "NEW-OWL-IMPORTER2", 2, 2, false);
	    declareFunction("new_owl_importer2_for_graph", "NEW-OWL-IMPORTER2-FOR-GRAPH", 1, 2, false);
	    declareFunction("cyclist_using_owl_importer_v2", "CYCLIST-USING-OWL-IMPORTER-V2", 1, 0, false);
	    declareFunction("next_owl_importer2_id", "NEXT-OWL-IMPORTER2-ID", 0, 0, false);
	    declareFunction("owl_importer2_id_map", "OWL-IMPORTER2-ID-MAP", 0, 0, false);
	    declareFunction("note_owl_importer2_id", "NOTE-OWL-IMPORTER2-ID", 2, 0, false);
	    declareFunction("owl_importer2_id", "OWL-IMPORTER2-ID", 1, 0, false);
	    declareFunction("owl_importer2_uri", "OWL-IMPORTER2-URI", 1, 0, false);
	    declareFunction("owl_importer2_file", "OWL-IMPORTER2-FILE", 1, 0, false);
	    declareFunction("owl_importer2_graph", "OWL-IMPORTER2-GRAPH", 1, 0, false);
	    declareFunction("owl_importer2_set_graph", "OWL-IMPORTER2-SET-GRAPH", 2, 0, false);
	    declareFunction("owl_importer2_cyclist", "OWL-IMPORTER2-CYCLIST", 1, 0, false);
	    declareFunction("owl_importer2_import", "OWL-IMPORTER2-IMPORT", 1, 0, false);
	    declareFunction("owl_importer2_ontologies", "OWL-IMPORTER2-ONTOLOGIES", 1, 0, false);
	    declareFunction("owl_importer2_set_ontologies", "OWL-IMPORTER2-SET-ONTOLOGIES", 2, 0, false);
	    declareFunction("owl_importer2_terms", "OWL-IMPORTER2-TERMS", 1, 0, false);
	    declareFunction("owl_importer2_sentences", "OWL-IMPORTER2-SENTENCES", 1, 0, false);
	    declareFunction("owl_importer2_stats", "OWL-IMPORTER2-STATS", 1, 0, false);
	    declareFunction("owl_importer2_note_stat", "OWL-IMPORTER2-NOTE-STAT", 3, 0, false);
	    declareFunction("owl_importer2_lookup_stat", "OWL-IMPORTER2-LOOKUP-STAT", 2, 0, false);
	    declareFunction("owl_importer2_triple_count", "OWL-IMPORTER2-TRIPLE-COUNT", 1, 0, false);
	    declareFunction("owl_importer2_triples_done", "OWL-IMPORTER2-TRIPLES-DONE", 1, 0, false);
	    declareFunction("owl_importer2_nodes_done", "OWL-IMPORTER2-NODES-DONE", 1, 0, false);
	    declareFunction("owl_importer2_increment_triples_done", "OWL-IMPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false);
	    declareFunction("owl_importer2_increment_nodes_done", "OWL-IMPORTER2-INCREMENT-NODES-DONE", 1, 0, false);
	    declareFunction("owl_importer2_set_options", "OWL-IMPORTER2-SET-OPTIONS", 2, 0, false);
	    declareFunction("owl_importer2_set_option", "OWL-IMPORTER2-SET-OPTION", 3, 0, false);
	    declareFunction("owl_importer2_set_option_if_not_set", "OWL-IMPORTER2-SET-OPTION-IF-NOT-SET", 3, 0, false);
	    declareFunction("owl_importer2_get_option", "OWL-IMPORTER2-GET-OPTION", 2, 1, false);
	    declareFunction("owl_importer2_options", "OWL-IMPORTER2-OPTIONS", 1, 0, false);
	    declareFunction("owl_importer2_note_thread", "OWL-IMPORTER2-NOTE-THREAD", 2, 0, false);
	    declareFunction("owl_importer2_thread", "OWL-IMPORTER2-THREAD", 1, 0, false);
	    declareFunction("sxhash_owl_importer2_method", "SXHASH-OWL-IMPORTER2-METHOD", 1, 0, false);
	    declareFunction("sxhash_owl_importer2", "SXHASH-OWL-IMPORTER2", 1, 0, false);
	    declareFunction("owl_importer2_assert_triples", "OWL-IMPORTER2-ASSERT-TRIPLES", 1, 0, false);
	    declareFunction("owl_importer2_assert_subject_triples", "OWL-IMPORTER2-ASSERT-SUBJECT-TRIPLES", 2, 0, false);
	    declareFunction("owl_importer2_assert_triple", "OWL-IMPORTER2-ASSERT-TRIPLE", 2, 0, false);
	    declareFunction("owl_importer2_sentence_doneP", "OWL-IMPORTER2-SENTENCE-DONE?", 2, 0, false);
	    declareFunction("owl_importer2_note_sentence_done", "OWL-IMPORTER2-NOTE-SENTENCE-DONE", 2, 0, false);
	    declareFunction("owl_importer2_sentence_for_triple", "OWL-IMPORTER2-SENTENCE-FOR-TRIPLE", 2, 0, false);
	    declareFunction("owl_importer2_find_or_create_term_for_list_node", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
	    declareFunction("owl_importer2_list_node_terms", "OWL-IMPORTER2-LIST-NODE-TERMS", 2, 0, false);
	    declareFunction("owl_importer2_find_or_create_term", "OWL-IMPORTER2-FIND-OR-CREATE-TERM", 2, 1, false);
	    declareFunction("owl_importer2_find_or_create_term_for_uri", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-URI", 2, 1, false);
	    declareFunction("owl_importer2_mark_term_in_ontology", "OWL-IMPORTER2-MARK-TERM-IN-ONTOLOGY", 2, 1, false);
	    declareFunction("owl_importer2_find_or_create_uri_term", "OWL-IMPORTER2-FIND-OR-CREATE-URI-TERM", 2, 2, false);
	    declareFunction("owl_importer2_possibly_abbreviate_uri", "OWL-IMPORTER2-POSSIBLY-ABBREVIATE-URI", 2, 0, false);
	    declareFunction("cyc_uri_to_term", "CYC-URI-TO-TERM", 1, 0, false);
	    declareFunction("dwim_rdf_uri_string", "DWIM-RDF-URI-STRING", 1, 0, false);
	    declareFunction("owl_find_or_create_term_for_blank_node", "OWL-FIND-OR-CREATE-TERM-FOR-BLANK-NODE", 2, 0, false);
	    declareFunction("owl_importer2_assert_rmp_gaf_directly", "OWL-IMPORTER2-ASSERT-RMP-GAF-DIRECTLY", 5, 1, false);
	    declareFunction("owl_importer2_create_wff", "OWL-IMPORTER2-CREATE-WFF", 6, 1, false);
	    declareFunction("owl_importer2_find_or_create_nart", "OWL-IMPORTER2-FIND-OR-CREATE-NART", 3, 0, false);
	    declareFunction("owl_importer2_assert_wff", "OWL-IMPORTER2-ASSERT-WFF", 3, 3, false);
	    declareFunction("owl_import_file_verify", "OWL-IMPORT-FILE-VERIFY", 4, 1, false);
	    declareFunction("normalize_rdf_graph_by_eliminating_blank_node", "NORMALIZE-RDF-GRAPH-BY-ELIMINATING-BLANK-NODE", 4, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("owl_importer_v2_version_number", "OWL-IMPORTER-V2-VERSION-NUMBER", 0, 0, false);
            declareFunction("import_owl_ontology_from_url", "IMPORT-OWL-ONTOLOGY-FROM-URL", 2, 1, false);
            declareFunction("import_owl_ontology_from_file", "IMPORT-OWL-ONTOLOGY-FROM-FILE", 2, 2, false);
            declareFunction("get_owl_importer2_for_url", "GET-OWL-IMPORTER2-FOR-URL", 1, 1, false);
            declareFunction("get_owl_importer2_for_file", "GET-OWL-IMPORTER2-FOR-FILE", 1, 2, false);
            declareFunction("find_owl_importer2_by_id", "FIND-OWL-IMPORTER2-BY-ID", 1, 0, false);
            declareFunction("owl_importer2_version_number", "OWL-IMPORTER2-VERSION-NUMBER", 0, 0, false);
            declareFunction("import_owl_triples_from_rdf_graph", "IMPORT-OWL-TRIPLES-FROM-RDF-GRAPH", 2, 1, false);
            declareFunction("cyclist_using_owl_importer2", "CYCLIST-USING-OWL-IMPORTER2", 1, 0, false);
            declareFunction("owl_importer2_load_graph", "OWL-IMPORTER2-LOAD-GRAPH", 1, 1, false);
            declareFunction("owl_importer2_load_graph_internal", "OWL-IMPORTER2-LOAD-GRAPH-INTERNAL", 2, 0, false);
            declareFunction("owl_importer2_print_function_trampoline", "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("owl_importer2_p", "OWL-IMPORTER2-P", 1, 0, false);
            declareFunction("owl_imp2_id", "OWL-IMP2-ID", 1, 0, false);
            declareFunction("owl_imp2_file", "OWL-IMP2-FILE", 1, 0, false);
            declareFunction("owl_imp2_graph", "OWL-IMP2-GRAPH", 1, 0, false);
            declareFunction("owl_imp2_cyclist", "OWL-IMP2-CYCLIST", 1, 0, false);
            declareFunction("owl_imp2_import", "OWL-IMP2-IMPORT", 1, 0, false);
            declareFunction("owl_imp2_ontologies", "OWL-IMP2-ONTOLOGIES", 1, 0, false);
            declareFunction("owl_imp2_terms", "OWL-IMP2-TERMS", 1, 0, false);
            declareFunction("owl_imp2_sentences", "OWL-IMP2-SENTENCES", 1, 0, false);
            declareFunction("owl_imp2_stats", "OWL-IMP2-STATS", 1, 0, false);
            declareFunction("owl_imp2_thread", "OWL-IMP2-THREAD", 1, 0, false);
            declareFunction("_csetf_owl_imp2_id", "_CSETF-OWL-IMP2-ID", 2, 0, false);
            declareFunction("_csetf_owl_imp2_file", "_CSETF-OWL-IMP2-FILE", 2, 0, false);
            declareFunction("_csetf_owl_imp2_graph", "_CSETF-OWL-IMP2-GRAPH", 2, 0, false);
            declareFunction("_csetf_owl_imp2_cyclist", "_CSETF-OWL-IMP2-CYCLIST", 2, 0, false);
            declareFunction("_csetf_owl_imp2_import", "_CSETF-OWL-IMP2-IMPORT", 2, 0, false);
            declareFunction("_csetf_owl_imp2_ontologies", "_CSETF-OWL-IMP2-ONTOLOGIES", 2, 0, false);
            declareFunction("_csetf_owl_imp2_terms", "_CSETF-OWL-IMP2-TERMS", 2, 0, false);
            declareFunction("_csetf_owl_imp2_sentences", "_CSETF-OWL-IMP2-SENTENCES", 2, 0, false);
            declareFunction("_csetf_owl_imp2_stats", "_CSETF-OWL-IMP2-STATS", 2, 0, false);
            declareFunction("_csetf_owl_imp2_thread", "_CSETF-OWL-IMP2-THREAD", 2, 0, false);
            declareFunction("make_owl_importer2", "MAKE-OWL-IMPORTER2", 0, 1, false);
            declareFunction("print_owl_importer2", "PRINT-OWL-IMPORTER2", 3, 0, false);
            declareFunction("new_owl_importer2", "NEW-OWL-IMPORTER2", 1, 1, false);
            declareFunction("new_owl_importer2_for_graph", "NEW-OWL-IMPORTER2-FOR-GRAPH", 1, 1, false);
            declareFunction("cyclist_using_owl_importer_v2", "CYCLIST-USING-OWL-IMPORTER-V2", 1, 0, false);
            declareFunction("next_owl_importer2_id", "NEXT-OWL-IMPORTER2-ID", 0, 0, false);
            declareFunction("owl_importer2_id_map", "OWL-IMPORTER2-ID-MAP", 0, 0, false);
            declareFunction("note_owl_importer2_id", "NOTE-OWL-IMPORTER2-ID", 2, 0, false);
            declareFunction("owl_importer2_id", "OWL-IMPORTER2-ID", 1, 0, false);
            declareFunction("owl_importer2_file", "OWL-IMPORTER2-FILE", 1, 0, false);
            declareFunction("owl_importer2_graph", "OWL-IMPORTER2-GRAPH", 1, 0, false);
            declareFunction("owl_importer2_set_graph", "OWL-IMPORTER2-SET-GRAPH", 2, 0, false);
            declareFunction("owl_importer2_cyclist", "OWL-IMPORTER2-CYCLIST", 1, 0, false);
            declareFunction("owl_importer2_import", "OWL-IMPORTER2-IMPORT", 1, 0, false);
            declareFunction("owl_importer2_ontologies", "OWL-IMPORTER2-ONTOLOGIES", 1, 0, false);
            declareFunction("owl_importer2_set_ontologies", "OWL-IMPORTER2-SET-ONTOLOGIES", 2, 0, false);
            declareFunction("owl_importer2_terms", "OWL-IMPORTER2-TERMS", 1, 0, false);
            declareFunction("owl_importer2_sentences", "OWL-IMPORTER2-SENTENCES", 1, 0, false);
            declareFunction("owl_importer2_stats", "OWL-IMPORTER2-STATS", 1, 0, false);
            declareFunction("owl_importer2_note_stat", "OWL-IMPORTER2-NOTE-STAT", 3, 0, false);
            declareFunction("owl_importer2_lookup_stat", "OWL-IMPORTER2-LOOKUP-STAT", 2, 0, false);
            declareFunction("owl_importer2_triple_count", "OWL-IMPORTER2-TRIPLE-COUNT", 1, 0, false);
            declareFunction("owl_importer2_triples_done", "OWL-IMPORTER2-TRIPLES-DONE", 1, 0, false);
            declareFunction("owl_importer2_nodes_done", "OWL-IMPORTER2-NODES-DONE", 1, 0, false);
            declareFunction("owl_importer2_increment_triples_done", "OWL-IMPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false);
            declareFunction("owl_importer2_increment_nodes_done", "OWL-IMPORTER2-INCREMENT-NODES-DONE", 1, 0, false);
            declareFunction("owl_importer2_note_thread", "OWL-IMPORTER2-NOTE-THREAD", 2, 0, false);
            declareFunction("owl_importer2_thread", "OWL-IMPORTER2-THREAD", 1, 0, false);
            declareFunction("sxhash_owl_importer2_method", "SXHASH-OWL-IMPORTER2-METHOD", 1, 0, false);
            declareFunction("sxhash_owl_importer2", "SXHASH-OWL-IMPORTER2", 1, 0, false);
            declareFunction("owl_importer2_assert_triples", "OWL-IMPORTER2-ASSERT-TRIPLES", 2, 0, false);
            declareFunction("owl_importer2_assert_subject_triples", "OWL-IMPORTER2-ASSERT-SUBJECT-TRIPLES", 3, 0, false);
            declareFunction("owl_importer2_assert_triple", "OWL-IMPORTER2-ASSERT-TRIPLE", 3, 0, false);
            declareFunction("owl_importer2_sentence_doneP", "OWL-IMPORTER2-SENTENCE-DONE?", 2, 0, false);
            declareFunction("owl_importer2_note_sentence_done", "OWL-IMPORTER2-NOTE-SENTENCE-DONE", 2, 0, false);
            declareFunction("owl_importer2_sentence_for_triple", "OWL-IMPORTER2-SENTENCE-FOR-TRIPLE", 3, 0, false);
            declareFunction("owl_importer2_find_or_create_term", "OWL-IMPORTER2-FIND-OR-CREATE-TERM", 3, 0, false);
            declareFunction("owl_find_or_create_term_for_blank_node", "OWL-FIND-OR-CREATE-TERM-FOR-BLANK-NODE", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_owl_importer2_file_Previous() {
	declareFunction("show_owl_import_usages", "SHOW-OWL-IMPORT-USAGES", 0, 0, false);
	declareFunction("owl_import_uri", "OWL-IMPORT-URI", 1, 1, false);
	declareFunction("owl_import_file", "OWL-IMPORT-FILE", 1, 1, false);
	declareFunction("owl_import_uri_from_file", "OWL-IMPORT-URI-FROM-FILE", 2, 1, false);
	declareFunction("owl_import_file_to_graph_only", "OWL-IMPORT-FILE-TO-GRAPH-ONLY", 1, 1, false);
	declareFunction("owl_import_xml_graph_from_file", "OWL-IMPORT-XML-GRAPH-FROM-FILE", 1, 0, false);
	declareFunction("owl_import_with_importer", "OWL-IMPORT-WITH-IMPORTER", 1, 0, false);
	declareFunction("determine_uri_prefix_from_prefix_map", "DETERMINE-URI-PREFIX-FROM-PREFIX-MAP", 2, 0, false);
	declareFunction("determine_base_uri_from_prefix_map", "DETERMINE-BASE-URI-FROM-PREFIX-MAP", 1, 0, false);
	declareFunction("validate_owl_import_parameters", "VALIDATE-OWL-IMPORT-PARAMETERS", 2, 0, false);
	declareFunction("owl_importer_dwim_a_cyclist", "OWL-IMPORTER-DWIM-A-CYCLIST", 1, 0, false);
	declareFunction("owl_importer_v2_version_number", "OWL-IMPORTER-V2-VERSION-NUMBER", 0, 0, false);
	declareFunction("import_owl_ontology_from_url", "IMPORT-OWL-ONTOLOGY-FROM-URL", 2, 1, false);
	declareFunction("import_owl_ontology_from_file", "IMPORT-OWL-ONTOLOGY-FROM-FILE", 2, 2, false);
	declareFunction("get_owl_importer2_for_url", "GET-OWL-IMPORTER2-FOR-URL", 1, 1, false);
	declareFunction("get_owl_importer2_for_file", "GET-OWL-IMPORTER2-FOR-FILE", 1, 2, false);
	declareFunction("find_owl_importer2_by_id", "FIND-OWL-IMPORTER2-BY-ID", 1, 0, false);
	declareFunction("owl_importer2_version_number", "OWL-IMPORTER2-VERSION-NUMBER", 0, 0, false);
	declareFunction("import_owl_triples_from_rdf_graph", "IMPORT-OWL-TRIPLES-FROM-RDF-GRAPH", 2, 1, false);
	declareFunction("cyclist_using_owl_importer2", "CYCLIST-USING-OWL-IMPORTER2", 1, 0, false);
	declareFunction("owl_importer2_load_graph", "OWL-IMPORTER2-LOAD-GRAPH", 1, 1, false);
	declareFunction("owl_importer2_load_graph_internal", "OWL-IMPORTER2-LOAD-GRAPH-INTERNAL", 2, 0, false);
	declareFunction("owl_importer2_print_function_trampoline", "OWL-IMPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("owl_importer2_p", "OWL-IMPORTER2-P", 1, 0, false);
        new owl_importer2.$owl_importer2_p$UnaryFunction();
	declareFunction("owl_imp2_id", "OWL-IMP2-ID", 1, 0, false);
	declareFunction("owl_imp2_uri", "OWL-IMP2-URI", 1, 0, false);
	declareFunction("owl_imp2_file", "OWL-IMP2-FILE", 1, 0, false);
	declareFunction("owl_imp2_graph", "OWL-IMP2-GRAPH", 1, 0, false);
	declareFunction("owl_imp2_cyclist", "OWL-IMP2-CYCLIST", 1, 0, false);
	declareFunction("owl_imp2_import", "OWL-IMP2-IMPORT", 1, 0, false);
	declareFunction("owl_imp2_ontologies", "OWL-IMP2-ONTOLOGIES", 1, 0, false);
	declareFunction("owl_imp2_terms", "OWL-IMP2-TERMS", 1, 0, false);
	declareFunction("owl_imp2_sentences", "OWL-IMP2-SENTENCES", 1, 0, false);
	declareFunction("owl_imp2_stats", "OWL-IMP2-STATS", 1, 0, false);
	declareFunction("owl_imp2_options", "OWL-IMP2-OPTIONS", 1, 0, false);
	declareFunction("owl_imp2_thread", "OWL-IMP2-THREAD", 1, 0, false);
	declareFunction("_csetf_owl_imp2_id", "_CSETF-OWL-IMP2-ID", 2, 0, false);
	declareFunction("_csetf_owl_imp2_uri", "_CSETF-OWL-IMP2-URI", 2, 0, false);
	declareFunction("_csetf_owl_imp2_file", "_CSETF-OWL-IMP2-FILE", 2, 0, false);
	declareFunction("_csetf_owl_imp2_graph", "_CSETF-OWL-IMP2-GRAPH", 2, 0, false);
	declareFunction("_csetf_owl_imp2_cyclist", "_CSETF-OWL-IMP2-CYCLIST", 2, 0, false);
	declareFunction("_csetf_owl_imp2_import", "_CSETF-OWL-IMP2-IMPORT", 2, 0, false);
	declareFunction("_csetf_owl_imp2_ontologies", "_CSETF-OWL-IMP2-ONTOLOGIES", 2, 0, false);
	declareFunction("_csetf_owl_imp2_terms", "_CSETF-OWL-IMP2-TERMS", 2, 0, false);
	declareFunction("_csetf_owl_imp2_sentences", "_CSETF-OWL-IMP2-SENTENCES", 2, 0, false);
	declareFunction("_csetf_owl_imp2_stats", "_CSETF-OWL-IMP2-STATS", 2, 0, false);
	declareFunction("_csetf_owl_imp2_options", "_CSETF-OWL-IMP2-OPTIONS", 2, 0, false);
	declareFunction("_csetf_owl_imp2_thread", "_CSETF-OWL-IMP2-THREAD", 2, 0, false);
	declareFunction("make_owl_importer2", "MAKE-OWL-IMPORTER2", 0, 1, false);
	declareFunction("visit_defstruct_owl_importer2", "VISIT-DEFSTRUCT-OWL-IMPORTER2", 2, 0, false);
	declareFunction("visit_defstruct_object_owl_importer2_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER2-METHOD", 2, 0, false);
	declareFunction("print_owl_importer2", "PRINT-OWL-IMPORTER2", 3, 0, false);
	declareFunction("new_owl_importer2", "NEW-OWL-IMPORTER2", 2, 2, false);
	declareFunction("new_owl_importer2_for_graph", "NEW-OWL-IMPORTER2-FOR-GRAPH", 1, 2, false);
	declareFunction("cyclist_using_owl_importer_v2", "CYCLIST-USING-OWL-IMPORTER-V2", 1, 0, false);
	declareFunction("next_owl_importer2_id", "NEXT-OWL-IMPORTER2-ID", 0, 0, false);
	declareFunction("owl_importer2_id_map", "OWL-IMPORTER2-ID-MAP", 0, 0, false);
	declareFunction("note_owl_importer2_id", "NOTE-OWL-IMPORTER2-ID", 2, 0, false);
	declareFunction("owl_importer2_id", "OWL-IMPORTER2-ID", 1, 0, false);
	declareFunction("owl_importer2_uri", "OWL-IMPORTER2-URI", 1, 0, false);
	declareFunction("owl_importer2_file", "OWL-IMPORTER2-FILE", 1, 0, false);
	declareFunction("owl_importer2_graph", "OWL-IMPORTER2-GRAPH", 1, 0, false);
	declareFunction("owl_importer2_set_graph", "OWL-IMPORTER2-SET-GRAPH", 2, 0, false);
	declareFunction("owl_importer2_cyclist", "OWL-IMPORTER2-CYCLIST", 1, 0, false);
	declareFunction("owl_importer2_import", "OWL-IMPORTER2-IMPORT", 1, 0, false);
	declareFunction("owl_importer2_ontologies", "OWL-IMPORTER2-ONTOLOGIES", 1, 0, false);
	declareFunction("owl_importer2_set_ontologies", "OWL-IMPORTER2-SET-ONTOLOGIES", 2, 0, false);
	declareFunction("owl_importer2_terms", "OWL-IMPORTER2-TERMS", 1, 0, false);
	declareFunction("owl_importer2_sentences", "OWL-IMPORTER2-SENTENCES", 1, 0, false);
	declareFunction("owl_importer2_stats", "OWL-IMPORTER2-STATS", 1, 0, false);
	declareFunction("owl_importer2_note_stat", "OWL-IMPORTER2-NOTE-STAT", 3, 0, false);
	declareFunction("owl_importer2_lookup_stat", "OWL-IMPORTER2-LOOKUP-STAT", 2, 0, false);
	declareFunction("owl_importer2_triple_count", "OWL-IMPORTER2-TRIPLE-COUNT", 1, 0, false);
	declareFunction("owl_importer2_triples_done", "OWL-IMPORTER2-TRIPLES-DONE", 1, 0, false);
	declareFunction("owl_importer2_nodes_done", "OWL-IMPORTER2-NODES-DONE", 1, 0, false);
	declareFunction("owl_importer2_increment_triples_done", "OWL-IMPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false);
	declareFunction("owl_importer2_increment_nodes_done", "OWL-IMPORTER2-INCREMENT-NODES-DONE", 1, 0, false);
	declareFunction("owl_importer2_set_options", "OWL-IMPORTER2-SET-OPTIONS", 2, 0, false);
	declareFunction("owl_importer2_set_option", "OWL-IMPORTER2-SET-OPTION", 3, 0, false);
	declareFunction("owl_importer2_set_option_if_not_set", "OWL-IMPORTER2-SET-OPTION-IF-NOT-SET", 3, 0, false);
	declareFunction("owl_importer2_get_option", "OWL-IMPORTER2-GET-OPTION", 2, 1, false);
	declareFunction("owl_importer2_options", "OWL-IMPORTER2-OPTIONS", 1, 0, false);
	declareFunction("owl_importer2_note_thread", "OWL-IMPORTER2-NOTE-THREAD", 2, 0, false);
	declareFunction("owl_importer2_thread", "OWL-IMPORTER2-THREAD", 1, 0, false);
	declareFunction("sxhash_owl_importer2_method", "SXHASH-OWL-IMPORTER2-METHOD", 1, 0, false);
	declareFunction("sxhash_owl_importer2", "SXHASH-OWL-IMPORTER2", 1, 0, false);
	declareFunction("owl_importer2_assert_triples", "OWL-IMPORTER2-ASSERT-TRIPLES", 1, 0, false);
	declareFunction("owl_importer2_assert_subject_triples", "OWL-IMPORTER2-ASSERT-SUBJECT-TRIPLES", 2, 0, false);
	declareFunction("owl_importer2_assert_triple", "OWL-IMPORTER2-ASSERT-TRIPLE", 2, 0, false);
	declareFunction("owl_importer2_sentence_doneP", "OWL-IMPORTER2-SENTENCE-DONE?", 2, 0, false);
	declareFunction("owl_importer2_note_sentence_done", "OWL-IMPORTER2-NOTE-SENTENCE-DONE", 2, 0, false);
	declareFunction("owl_importer2_sentence_for_triple", "OWL-IMPORTER2-SENTENCE-FOR-TRIPLE", 2, 0, false);
	declareFunction("owl_importer2_find_or_create_term_for_list_node", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-LIST-NODE", 2, 0, false);
	declareFunction("owl_importer2_list_node_terms", "OWL-IMPORTER2-LIST-NODE-TERMS", 2, 0, false);
	declareFunction("owl_importer2_find_or_create_term", "OWL-IMPORTER2-FIND-OR-CREATE-TERM", 2, 1, false);
	declareFunction("owl_importer2_find_or_create_term_for_uri", "OWL-IMPORTER2-FIND-OR-CREATE-TERM-FOR-URI", 2, 1, false);
	declareFunction("owl_importer2_mark_term_in_ontology", "OWL-IMPORTER2-MARK-TERM-IN-ONTOLOGY", 2, 1, false);
	declareFunction("owl_importer2_find_or_create_uri_term", "OWL-IMPORTER2-FIND-OR-CREATE-URI-TERM", 2, 2, false);
	declareFunction("owl_importer2_possibly_abbreviate_uri", "OWL-IMPORTER2-POSSIBLY-ABBREVIATE-URI", 2, 0, false);
	declareFunction("cyc_uri_to_term", "CYC-URI-TO-TERM", 1, 0, false);
	declareFunction("dwim_rdf_uri_string", "DWIM-RDF-URI-STRING", 1, 0, false);
	declareFunction("owl_find_or_create_term_for_blank_node", "OWL-FIND-OR-CREATE-TERM-FOR-BLANK-NODE", 2, 0, false);
	declareFunction("owl_importer2_assert_rmp_gaf_directly", "OWL-IMPORTER2-ASSERT-RMP-GAF-DIRECTLY", 5, 1, false);
	declareFunction("owl_importer2_create_wff", "OWL-IMPORTER2-CREATE-WFF", 6, 1, false);
	declareFunction("owl_importer2_find_or_create_nart", "OWL-IMPORTER2-FIND-OR-CREATE-NART", 3, 0, false);
	declareFunction("owl_importer2_assert_wff", "OWL-IMPORTER2-ASSERT-WFF", 3, 3, false);
	declareFunction("owl_import_file_verify", "OWL-IMPORT-FILE-VERIFY", 4, 1, false);
	declareFunction("normalize_rdf_graph_by_eliminating_blank_node", "NORMALIZE-RDF-GRAPH-BY-ELIMINATING-BLANK-NODE", 4, 1, false);
        return NIL;
    }

    public static final SubLObject init_owl_importer2_file_alt() {
        deflexical("*OWL-IMPORTER2-VERSION-NUMBER*", NIL != boundp($sym0$_OWL_IMPORTER2_VERSION_NUMBER_) ? ((SubLObject) ($owl_importer2_version_number$.getGlobalValue())) : NIL);
        defconstant("*DTP-OWL-IMPORTER2*", OWL_IMPORTER2);
        deflexical("*OWL-IMPORTER2-ID-ISG*", NIL != boundp($sym59$_OWL_IMPORTER2_ID_ISG_) ? ((SubLObject) ($owl_importer2_id_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*OWL-IMPORTER2-ID-MAP*", NIL != boundp($sym60$_OWL_IMPORTER2_ID_MAP_) ? ((SubLObject) ($owl_importer2_id_map$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        defparameter("*OWL-IMPORTER2-SUBJECT-STACK*", NIL);
        return NIL;
    }

    public static SubLObject init_owl_importer2_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*OWL-IMPORTER2-VALID-OPTIONS*", owl_importer2.$list0);
            deflexical("*OWL-IMPORTER2-VERSION-NUMBER*", NIL != boundp(owl_importer2.$sym77$_OWL_IMPORTER2_VERSION_NUMBER_) ? owl_importer2.$owl_importer2_version_number$.getGlobalValue() : NIL);
            defconstant("*DTP-OWL-IMPORTER2*", owl_importer2.OWL_IMPORTER2);
            deflexical("*OWL-IMPORTER2-ID-ISG*", NIL != boundp(owl_importer2.$sym147$_OWL_IMPORTER2_ID_ISG_) ? owl_importer2.$owl_importer2_id_isg$.getGlobalValue() : new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*OWL-IMPORTER2-ID-MAP*", NIL != boundp(owl_importer2.$sym148$_OWL_IMPORTER2_ID_MAP_) ? owl_importer2.$owl_importer2_id_map$.getGlobalValue() : new_dictionary(symbol_function(EQL), UNPROVIDED));
            defparameter("*OWL-IMPORTER2-SUBJECT-STACK*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*OWL-IMPORTER2-VERSION-NUMBER*", NIL != boundp($sym0$_OWL_IMPORTER2_VERSION_NUMBER_) ? ((SubLObject) ($owl_importer2_version_number$.getGlobalValue())) : NIL);
            deflexical("*OWL-IMPORTER2-ID-ISG*", NIL != boundp($sym59$_OWL_IMPORTER2_ID_ISG_) ? ((SubLObject) ($owl_importer2_id_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
            deflexical("*OWL-IMPORTER2-ID-MAP*", NIL != boundp($sym60$_OWL_IMPORTER2_ID_MAP_) ? ((SubLObject) ($owl_importer2_id_map$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_owl_importer2_file_Previous() {
        defparameter("*OWL-IMPORTER2-VALID-OPTIONS*", owl_importer2.$list0);
        deflexical("*OWL-IMPORTER2-VERSION-NUMBER*", NIL != boundp(owl_importer2.$sym77$_OWL_IMPORTER2_VERSION_NUMBER_) ? owl_importer2.$owl_importer2_version_number$.getGlobalValue() : NIL);
        defconstant("*DTP-OWL-IMPORTER2*", owl_importer2.OWL_IMPORTER2);
        deflexical("*OWL-IMPORTER2-ID-ISG*", NIL != boundp(owl_importer2.$sym147$_OWL_IMPORTER2_ID_ISG_) ? owl_importer2.$owl_importer2_id_isg$.getGlobalValue() : new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*OWL-IMPORTER2-ID-MAP*", NIL != boundp(owl_importer2.$sym148$_OWL_IMPORTER2_ID_MAP_) ? owl_importer2.$owl_importer2_id_map$.getGlobalValue() : new_dictionary(symbol_function(EQL), UNPROVIDED));
        defparameter("*OWL-IMPORTER2-SUBJECT-STACK*", NIL);
        return NIL;
    }

    public static final SubLObject setup_owl_importer2_file_alt() {
        declare_defglobal($sym0$_OWL_IMPORTER2_VERSION_NUMBER_);
        $owl_importer2_version_number$.setGlobalValue($str_alt1$_revision__1_2__);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_importer2$.getGlobalValue(), symbol_function(OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(OWL_IMP2_ID, _CSETF_OWL_IMP2_ID);
        def_csetf(OWL_IMP2_FILE, _CSETF_OWL_IMP2_FILE);
        def_csetf(OWL_IMP2_GRAPH, _CSETF_OWL_IMP2_GRAPH);
        def_csetf(OWL_IMP2_CYCLIST, _CSETF_OWL_IMP2_CYCLIST);
        def_csetf(OWL_IMP2_IMPORT, _CSETF_OWL_IMP2_IMPORT);
        def_csetf(OWL_IMP2_ONTOLOGIES, _CSETF_OWL_IMP2_ONTOLOGIES);
        def_csetf(OWL_IMP2_TERMS, _CSETF_OWL_IMP2_TERMS);
        def_csetf(OWL_IMP2_SENTENCES, _CSETF_OWL_IMP2_SENTENCES);
        def_csetf(OWL_IMP2_STATS, _CSETF_OWL_IMP2_STATS);
        def_csetf(OWL_IMP2_THREAD, _CSETF_OWL_IMP2_THREAD);
        identity(OWL_IMPORTER2);
        note_funcall_helper_function(PRINT_OWL_IMPORTER2);
        declare_defglobal($sym59$_OWL_IMPORTER2_ID_ISG_);
        declare_defglobal($sym60$_OWL_IMPORTER2_ID_MAP_);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_importer2$.getGlobalValue(), symbol_function(SXHASH_OWL_IMPORTER2_METHOD));
        return NIL;
    }

    public static SubLObject setup_owl_importer2_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(owl_importer2.OWL_IMPORT_URI);
            register_external_symbol(owl_importer2.OWL_IMPORT_FILE);
            register_external_symbol(owl_importer2.OWL_IMPORT_URI_FROM_FILE);
            register_external_symbol(owl_importer2.OWL_IMPORT_XML_GRAPH_FROM_FILE);
            declare_defglobal(owl_importer2.$sym77$_OWL_IMPORTER2_VERSION_NUMBER_);
            owl_importer2.$owl_importer2_version_number$.setGlobalValue(owl_importer2.$str78$_revision__1_2__);
            register_method($print_object_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(owl_importer2.$list98);
            def_csetf(owl_importer2.OWL_IMP2_ID, owl_importer2._CSETF_OWL_IMP2_ID);
            def_csetf(owl_importer2.OWL_IMP2_URI, owl_importer2._CSETF_OWL_IMP2_URI);
            def_csetf(owl_importer2.OWL_IMP2_FILE, owl_importer2._CSETF_OWL_IMP2_FILE);
            def_csetf(owl_importer2.OWL_IMP2_GRAPH, owl_importer2._CSETF_OWL_IMP2_GRAPH);
            def_csetf(owl_importer2.OWL_IMP2_CYCLIST, owl_importer2._CSETF_OWL_IMP2_CYCLIST);
            def_csetf(owl_importer2.OWL_IMP2_IMPORT, owl_importer2._CSETF_OWL_IMP2_IMPORT);
            def_csetf(owl_importer2.OWL_IMP2_ONTOLOGIES, owl_importer2._CSETF_OWL_IMP2_ONTOLOGIES);
            def_csetf(owl_importer2.OWL_IMP2_TERMS, owl_importer2._CSETF_OWL_IMP2_TERMS);
            def_csetf(owl_importer2.OWL_IMP2_SENTENCES, owl_importer2._CSETF_OWL_IMP2_SENTENCES);
            def_csetf(owl_importer2.OWL_IMP2_STATS, owl_importer2._CSETF_OWL_IMP2_STATS);
            def_csetf(owl_importer2.OWL_IMP2_OPTIONS, owl_importer2._CSETF_OWL_IMP2_OPTIONS);
            def_csetf(owl_importer2.OWL_IMP2_THREAD, owl_importer2._CSETF_OWL_IMP2_THREAD);
            identity(owl_importer2.OWL_IMPORTER2);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD));
            note_funcall_helper_function(owl_importer2.PRINT_OWL_IMPORTER2);
            declare_defglobal(owl_importer2.$sym147$_OWL_IMPORTER2_ID_ISG_);
            declare_defglobal(owl_importer2.$sym148$_OWL_IMPORTER2_ID_MAP_);
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.SXHASH_OWL_IMPORTER2_METHOD));
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($sym0$_OWL_IMPORTER2_VERSION_NUMBER_);
            $owl_importer2_version_number$.setGlobalValue($str_alt1$_revision__1_2__);
            declare_defglobal($sym59$_OWL_IMPORTER2_ID_ISG_);
            declare_defglobal($sym60$_OWL_IMPORTER2_ID_MAP_);
        }
        return NIL;
    }

    public static SubLObject setup_owl_importer2_file_Previous() {
        register_external_symbol(owl_importer2.OWL_IMPORT_URI);
        register_external_symbol(owl_importer2.OWL_IMPORT_FILE);
        register_external_symbol(owl_importer2.OWL_IMPORT_URI_FROM_FILE);
        register_external_symbol(owl_importer2.OWL_IMPORT_XML_GRAPH_FROM_FILE);
        declare_defglobal(owl_importer2.$sym77$_OWL_IMPORTER2_VERSION_NUMBER_);
        owl_importer2.$owl_importer2_version_number$.setGlobalValue(owl_importer2.$str78$_revision__1_2__);
        register_method($print_object_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.OWL_IMPORTER2_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(owl_importer2.$list98);
        def_csetf(owl_importer2.OWL_IMP2_ID, owl_importer2._CSETF_OWL_IMP2_ID);
        def_csetf(owl_importer2.OWL_IMP2_URI, owl_importer2._CSETF_OWL_IMP2_URI);
        def_csetf(owl_importer2.OWL_IMP2_FILE, owl_importer2._CSETF_OWL_IMP2_FILE);
        def_csetf(owl_importer2.OWL_IMP2_GRAPH, owl_importer2._CSETF_OWL_IMP2_GRAPH);
        def_csetf(owl_importer2.OWL_IMP2_CYCLIST, owl_importer2._CSETF_OWL_IMP2_CYCLIST);
        def_csetf(owl_importer2.OWL_IMP2_IMPORT, owl_importer2._CSETF_OWL_IMP2_IMPORT);
        def_csetf(owl_importer2.OWL_IMP2_ONTOLOGIES, owl_importer2._CSETF_OWL_IMP2_ONTOLOGIES);
        def_csetf(owl_importer2.OWL_IMP2_TERMS, owl_importer2._CSETF_OWL_IMP2_TERMS);
        def_csetf(owl_importer2.OWL_IMP2_SENTENCES, owl_importer2._CSETF_OWL_IMP2_SENTENCES);
        def_csetf(owl_importer2.OWL_IMP2_STATS, owl_importer2._CSETF_OWL_IMP2_STATS);
        def_csetf(owl_importer2.OWL_IMP2_OPTIONS, owl_importer2._CSETF_OWL_IMP2_OPTIONS);
        def_csetf(owl_importer2.OWL_IMP2_THREAD, owl_importer2._CSETF_OWL_IMP2_THREAD);
        identity(owl_importer2.OWL_IMPORTER2);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER2_METHOD));
        note_funcall_helper_function(owl_importer2.PRINT_OWL_IMPORTER2);
        declare_defglobal(owl_importer2.$sym147$_OWL_IMPORTER2_ID_ISG_);
        declare_defglobal(owl_importer2.$sym148$_OWL_IMPORTER2_ID_MAP_);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_importer2.$dtp_owl_importer2$.getGlobalValue(), symbol_function(owl_importer2.SXHASH_OWL_IMPORTER2_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        owl_importer2.declare_owl_importer2_file();
    }

    @Override
    public void initializeVariables() {
        owl_importer2.init_owl_importer2_file();
    }

    @Override
    public void runTopLevelForms() {
        owl_importer2.setup_owl_importer2_file();
    }

    static {
    }

    public static final class $owl_importer2_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $uri;

        public SubLObject $file;

        public SubLObject $graph;

        public SubLObject $cyclist;

        public SubLObject $import;

        public SubLObject $ontologies;

        public SubLObject $terms;

        public SubLObject $sentences;

        public SubLObject $stats;

        public SubLObject $options;

        public SubLObject $thread;

        private static final SubLStructDeclNative structDecl;

        public $owl_importer2_native() {
            owl_importer2.$owl_importer2_native.this.$id = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$uri = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$file = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$graph = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$cyclist = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$import = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$ontologies = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$terms = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$sentences = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$stats = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$options = Lisp.NIL;
            owl_importer2.$owl_importer2_native.this.$thread = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return owl_importer2.$owl_importer2_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return owl_importer2.$owl_importer2_native.this.$uri;
        }

        @Override
        public SubLObject getField4() {
            return owl_importer2.$owl_importer2_native.this.$file;
        }

        @Override
        public SubLObject getField5() {
            return owl_importer2.$owl_importer2_native.this.$graph;
        }

        @Override
        public SubLObject getField6() {
            return owl_importer2.$owl_importer2_native.this.$cyclist;
        }

        @Override
        public SubLObject getField7() {
            return owl_importer2.$owl_importer2_native.this.$import;
        }

        @Override
        public SubLObject getField8() {
            return owl_importer2.$owl_importer2_native.this.$ontologies;
        }

        @Override
        public SubLObject getField9() {
            return owl_importer2.$owl_importer2_native.this.$terms;
        }

        @Override
        public SubLObject getField10() {
            return owl_importer2.$owl_importer2_native.this.$sentences;
        }

        @Override
        public SubLObject getField11() {
            return owl_importer2.$owl_importer2_native.this.$stats;
        }

        @Override
        public SubLObject getField12() {
            return owl_importer2.$owl_importer2_native.this.$options;
        }

        @Override
        public SubLObject getField13() {
            return owl_importer2.$owl_importer2_native.this.$thread;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$uri = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$file = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$graph = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$cyclist = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$import = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$ontologies = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$terms = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$sentences = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$stats = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$options = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return owl_importer2.$owl_importer2_native.this.$thread = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.owl.owl_importer2.$owl_importer2_native.class, owl_importer2.OWL_IMPORTER2, owl_importer2.OWL_IMPORTER2_P, owl_importer2.$list92, owl_importer2.$list93, new String[]{ "$id", "$uri", "$file", "$graph", "$cyclist", "$import", "$ontologies", "$terms", "$sentences", "$stats", "$options", "$thread" }, owl_importer2.$list94, owl_importer2.$list95, owl_importer2.PRINT_OWL_IMPORTER2);
        }
    }

    public static final class $owl_importer2_p$UnaryFunction extends UnaryFunction {
        public $owl_importer2_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-IMPORTER2-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_importer2.owl_importer2_p(arg1);
        }
    }
}

/**
 * Total time: 782 ms synthetic
 */
