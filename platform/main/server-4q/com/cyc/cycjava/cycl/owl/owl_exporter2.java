package com.cyc.cycjava.cycl.owl;


import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.keyhash;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.owl.owl_exporter2;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_literal;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.owl.owl_exporter2.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class owl_exporter2 extends SubLTranslatedFile {
    public static final SubLFile me = new owl_exporter2();

    public static final String myName = "com.cyc.cycjava.cycl.owl.owl_exporter2";

    public static final String myFingerPrint = "5f78243ec7242df58f4c23ea9f51513970bdec9be58bb80ce17bfba9c6ab4931";

    // defparameter
    private static final SubLSymbol $owl_exporter2_valid_options$ = makeSymbol("*OWL-EXPORTER2-VALID-OPTIONS*");

    // defparameter
    private static final SubLSymbol $owl_export_subject_node_to_term_hash$ = makeSymbol("*OWL-EXPORT-SUBJECT-NODE-TO-TERM-HASH*");

    // deflexical
    private static final SubLSymbol $owl_exporter2_version_number$ = makeSymbol("*OWL-EXPORTER2-VERSION-NUMBER*");

    // defconstant
    public static final SubLSymbol $dtp_owl_exporter2$ = makeSymbol("*DTP-OWL-EXPORTER2*");

    // deflexical
    private static final SubLSymbol $owl_exporter2_id_isg$ = makeSymbol("*OWL-EXPORTER2-ID-ISG*");

    // deflexical
    private static final SubLSymbol $owl_exporter2_id_map$ = makeSymbol("*OWL-EXPORTER2-ID-MAP*");

    // defparameter
    private static final SubLSymbol $owl_export_exporting_terms$ = makeSymbol("*OWL-EXPORT-EXPORTING-TERMS*");

    // defparameter
    private static final SubLSymbol $owl_export_old_compatibility_modeP$ = makeSymbol("*OWL-EXPORT-OLD-COMPATIBILITY-MODE?*");

    // defparameter
    private static final SubLSymbol $owl_export_exporting_focal_nodeP$ = makeSymbol("*OWL-EXPORT-EXPORTING-FOCAL-NODE?*");

    // defparameter
    private static final SubLSymbol $owl_export_exported_triples$ = makeSymbol("*OWL-EXPORT-EXPORTED-TRIPLES*");

    // defparameter
    private static final SubLSymbol $owl_export_exported_focal_nodes$ = makeSymbol("*OWL-EXPORT-EXPORTED-FOCAL-NODES*");

    // defparameter
    private static final SubLSymbol $owl_export_additional_export_terms$ = makeSymbol("*OWL-EXPORT-ADDITIONAL-EXPORT-TERMS*");

    private static final SubLList $list0 = list(new SubLObject[]{ makeKeyword("ONTOLOGY-TERM"), makeKeyword("ONTOLOGY-MT"), makeKeyword("ONTOLOGY-URI"), makeKeyword("BASE-URI"), makeKeyword("DEFAULT-NAMESPACE-URI"), makeKeyword("CYCLIST"), makeKeyword("PREFER-URIS"), makeKeyword("SAME-AS-URIS"), makeKeyword("ADD-COMMENTS"), makeKeyword("ADD-PRETTY-STRINGS"), makeKeyword("ADD-PRETTY-STRING-CANONICAL"), makeKeyword("RESTRICT-CONTEXT?"), makeKeyword("SUPPRESS-ADDITIONAL-TYPE-TRIPLES?"), makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?"), makeKeyword("SUPPRESS-HUMANLY-READABLE-NON-OPENCYC-URIS"), makeKeyword("EXPORT-ENTIRE-KB?"), makeKeyword("OPENCYC-EXPORT?"), makeKeyword("VERBOSE?") });

    private static final SubLString $str1$OWL_Exporter_usages___ = makeString("OWL Exporter usages:~%");

    private static final SubLString $str2$_owl_export_ontology_to_file____o = makeString(" owl-export-ontology-to-file   (ontology-term filename &optional exporter-options)~%");

    private static final SubLString $str3$_owl_export_ontology_to_stream__o = makeString(" owl-export-ontology-to-stream (ontology-term (stream *xml-stream*) &optional exporter-options)~%");

    private static final SubLSymbol OWL_EXPORT_ONTOLOGY_TO_FILE = makeSymbol("OWL-EXPORT-ONTOLOGY-TO-FILE");

    private static final SubLString $str5$owl_export_ontology_to_file = makeString("owl-export-ontology-to-file");

    private static final SubLList $list6 = list(makeKeyword("ONTOLOGY-TERM"), makeKeyword("FILENAME"), makeKeyword("EXPORTER-OPTIONS"));



    private static final SubLString $str8$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $OUTPUT_STREAM = makeKeyword("OUTPUT-STREAM");



    private static final SubLSymbol $sym11$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol OWL_EXPORT_ONTOLOGY_TO_STREAM = makeSymbol("OWL-EXPORT-ONTOLOGY-TO-STREAM");

    private static final SubLString $str13$owl_export_ontology_to_stream = makeString("owl-export-ontology-to-stream");

    private static final SubLList $list14 = list(makeKeyword("ONTOLOGY-TERM"), makeKeyword("STREAM"), makeKeyword("EXPORTER-OPTIONS"));

    private static final SubLSymbol OWL_EXPORT_TERMS_TO_FILE = makeSymbol("OWL-EXPORT-TERMS-TO-FILE");

    private static final SubLString $str16$owl_export_terms_to_file = makeString("owl-export-terms-to-file");

    private static final SubLList $list17 = list(makeKeyword("TERMS"), makeKeyword("FILENAME"), makeKeyword("EXPORTER-OPTIONS"));

    private static final SubLSymbol OWL_EXPORT_TERMS_TO_STREAM = makeSymbol("OWL-EXPORT-TERMS-TO-STREAM");

    private static final SubLString $str19$owl_export_terms_to_stream = makeString("owl-export-terms-to-stream");

    private static final SubLList $list20 = list(makeKeyword("TERMS"), makeKeyword("EXPORTER-OPTIONS"));

    private static final SubLObject $$termTypeForOntology = reader_make_constant_shell(makeString("termTypeForOntology"));

    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    private static final SubLObject $$overlappingExternalConcept = reader_make_constant_shell(makeString("overlappingExternalConcept"));

    private static final SubLString $str24$_A__FILENAME__S_already_exists__ = makeString("~A: FILENAME ~S already exists~%");

    private static final SubLSymbol $EXPORTER_OPTIONS = makeKeyword("EXPORTER-OPTIONS");

    private static final SubLString $str26$_A__EXPORTER_OPTIONS__S_is_not_a_ = makeString("~A: EXPORTER-OPTIONS ~S is not a valid property list~%");



    private static final SubLObject $$Cyclist = reader_make_constant_shell(makeString("Cyclist"));

    private static final SubLString $str29$_A__EXPORTER_OPTIONS__cyclist__A_ = makeString("~A: EXPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%");

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLString $str31$_A__Please_log_in_with__set_the_c = makeString("~A: Please log in with (set-the-cyclist [Cyc Account])~%");

    private static final SubLString $str32$_A__EXPORTER_OPTIONS_has_invalid_ = makeString("~A: EXPORTER-OPTIONS has invalid keys: ~A~%");

    private static final SubLString $str33$Errors_found__aborting_export___ = makeString("Errors found, aborting export...");

    private static final SubLSymbol OWL_EXPORTER2_P = makeSymbol("OWL-EXPORTER2-P");



    private static final SubLSymbol $ONTOLOGY_TERM_TYPE = makeKeyword("ONTOLOGY-TERM-TYPE");







    private static final SubLObject $$contextOfPCW = reader_make_constant_shell(makeString("contextOfPCW"));

    private static final SubLSymbol $kw41$OPENCYC_EXPORT_ = makeKeyword("OPENCYC-EXPORT?");

    private static final SubLString $str42$Performing_OpenCyc_export_____ = makeString("Performing OpenCyc export...~%");

    private static final SubLSymbol $OPENCYC = makeKeyword("OPENCYC");

    private static final SubLSymbol $PREFER_URIS = makeKeyword("PREFER-URIS");

    private static final SubLString $$$Setting_prefer_OpenCyc_URI_option = makeString("Setting prefer OpenCyc URI option");

    private static final SubLSymbol $SAME_AS_URIS = makeKeyword("SAME-AS-URIS");

    private static final SubLString $str47$Resetting_sameAs_URI_parameter_to = makeString("Resetting sameAs URI parameter to opencyc settings");

    private static final SubLSymbol $ADD_COMMENTS = makeKeyword("ADD-COMMENTS");

    private static final SubLSymbol $HUMAN_READABLE = makeKeyword("HUMAN-READABLE");

    private static final SubLSymbol $DEFAULT_NAMESPACE_URI = makeKeyword("DEFAULT-NAMESPACE-URI");

    private static final SubLList $list51 = list(makeKeyword("DBPEDIA"), makeKeyword("UMBEL"), makeKeyword("OPENCYC-VERSIONED"), makeKeyword("OPENCYC-UNVERSIONED"));

    private static final SubLSymbol $VERSIONED = makeKeyword("VERSIONED");

    private static final SubLList $list53 = list(makeKeyword("DBPEDIA"), makeKeyword("UMBEL"), makeKeyword("OPENCYC"), makeKeyword("OPENCYC-UNVERSIONED"));

    private static final SubLSymbol $UNVERSIONED = makeKeyword("UNVERSIONED");

    private static final SubLList $list55 = list(makeKeyword("DBPEDIA"), makeKeyword("UMBEL"), makeKeyword("OPENCYC"), makeKeyword("OPENCYC-VERSIONED"));

    private static final SubLString $str56$Invalid_opencyc_export_type___A__ = makeString("Invalid opencyc export type: ~A.  Defaulting to readable.");

    private static final SubLObject $$baseNamespaceForSKS = reader_make_constant_shell(makeString("baseNamespaceForSKS"));

    private static final SubLObject $$uriString = reader_make_constant_shell(makeString("uriString"));

    private static final SubLSymbol $sym59$_OWL_EXPORTER2_VERSION_NUMBER_ = makeSymbol("*OWL-EXPORTER2-VERSION-NUMBER*");

    private static final SubLString $str60$_revision__1_2__ = makeString("$revision: 1.2 $");



    private static final SubLSymbol OWL_EXPORTER2 = makeSymbol("OWL-EXPORTER2");

    private static final SubLList $list63 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("URI"), makeSymbol("FILE"), makeSymbol("GRAPH"), makeSymbol("CYCLIST"), makeSymbol("EXPORT"), makeSymbol("ONTOLOGY"), makeSymbol("TERMS"), makeSymbol("SENTENCES"), makeSymbol("STATS"), makeSymbol("OPTIONS"), makeSymbol("THREAD") });

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("URI"), makeKeyword("FILE"), makeKeyword("GRAPH"), makeKeyword("CYCLIST"), makeKeyword("EXPORT"), makeKeyword("ONTOLOGY"), makeKeyword("TERMS"), makeKeyword("SENTENCES"), makeKeyword("STATS"), makeKeyword("OPTIONS"), makeKeyword("THREAD") });

    private static final SubLList $list65 = list(new SubLObject[]{ makeSymbol("OWL-EXP2-ID"), makeSymbol("OWL-EXP2-URI"), makeSymbol("OWL-EXP2-FILE"), makeSymbol("OWL-EXP2-GRAPH"), makeSymbol("OWL-EXP2-CYCLIST"), makeSymbol("OWL-EXP2-EXPORT"), makeSymbol("OWL-EXP2-ONTOLOGY"), makeSymbol("OWL-EXP2-TERMS"), makeSymbol("OWL-EXP2-SENTENCES"), makeSymbol("OWL-EXP2-STATS"), makeSymbol("OWL-EXP2-OPTIONS"), makeSymbol("OWL-EXP2-THREAD") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("_CSETF-OWL-EXP2-ID"), makeSymbol("_CSETF-OWL-EXP2-URI"), makeSymbol("_CSETF-OWL-EXP2-FILE"), makeSymbol("_CSETF-OWL-EXP2-GRAPH"), makeSymbol("_CSETF-OWL-EXP2-CYCLIST"), makeSymbol("_CSETF-OWL-EXP2-EXPORT"), makeSymbol("_CSETF-OWL-EXP2-ONTOLOGY"), makeSymbol("_CSETF-OWL-EXP2-TERMS"), makeSymbol("_CSETF-OWL-EXP2-SENTENCES"), makeSymbol("_CSETF-OWL-EXP2-STATS"), makeSymbol("_CSETF-OWL-EXP2-OPTIONS"), makeSymbol("_CSETF-OWL-EXP2-THREAD") });

    private static final SubLSymbol PRINT_OWL_EXPORTER2 = makeSymbol("PRINT-OWL-EXPORTER2");

    private static final SubLSymbol OWL_EXPORTER2_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OWL-EXPORTER2-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OWL-EXPORTER2-P"));

    private static final SubLSymbol OWL_EXP2_ID = makeSymbol("OWL-EXP2-ID");

    private static final SubLSymbol _CSETF_OWL_EXP2_ID = makeSymbol("_CSETF-OWL-EXP2-ID");

    private static final SubLSymbol OWL_EXP2_URI = makeSymbol("OWL-EXP2-URI");

    private static final SubLSymbol _CSETF_OWL_EXP2_URI = makeSymbol("_CSETF-OWL-EXP2-URI");

    private static final SubLSymbol OWL_EXP2_FILE = makeSymbol("OWL-EXP2-FILE");

    private static final SubLSymbol _CSETF_OWL_EXP2_FILE = makeSymbol("_CSETF-OWL-EXP2-FILE");

    private static final SubLSymbol OWL_EXP2_GRAPH = makeSymbol("OWL-EXP2-GRAPH");

    private static final SubLSymbol _CSETF_OWL_EXP2_GRAPH = makeSymbol("_CSETF-OWL-EXP2-GRAPH");

    private static final SubLSymbol OWL_EXP2_CYCLIST = makeSymbol("OWL-EXP2-CYCLIST");

    private static final SubLSymbol _CSETF_OWL_EXP2_CYCLIST = makeSymbol("_CSETF-OWL-EXP2-CYCLIST");

    private static final SubLSymbol OWL_EXP2_EXPORT = makeSymbol("OWL-EXP2-EXPORT");

    private static final SubLSymbol _CSETF_OWL_EXP2_EXPORT = makeSymbol("_CSETF-OWL-EXP2-EXPORT");

    private static final SubLSymbol OWL_EXP2_ONTOLOGY = makeSymbol("OWL-EXP2-ONTOLOGY");

    private static final SubLSymbol _CSETF_OWL_EXP2_ONTOLOGY = makeSymbol("_CSETF-OWL-EXP2-ONTOLOGY");

    private static final SubLSymbol OWL_EXP2_TERMS = makeSymbol("OWL-EXP2-TERMS");

    private static final SubLSymbol _CSETF_OWL_EXP2_TERMS = makeSymbol("_CSETF-OWL-EXP2-TERMS");

    private static final SubLSymbol OWL_EXP2_SENTENCES = makeSymbol("OWL-EXP2-SENTENCES");

    private static final SubLSymbol _CSETF_OWL_EXP2_SENTENCES = makeSymbol("_CSETF-OWL-EXP2-SENTENCES");

    private static final SubLSymbol OWL_EXP2_STATS = makeSymbol("OWL-EXP2-STATS");

    private static final SubLSymbol _CSETF_OWL_EXP2_STATS = makeSymbol("_CSETF-OWL-EXP2-STATS");

    private static final SubLSymbol OWL_EXP2_OPTIONS = makeSymbol("OWL-EXP2-OPTIONS");

    private static final SubLSymbol _CSETF_OWL_EXP2_OPTIONS = makeSymbol("_CSETF-OWL-EXP2-OPTIONS");

    private static final SubLSymbol OWL_EXP2_THREAD = makeSymbol("OWL-EXP2-THREAD");

    private static final SubLSymbol _CSETF_OWL_EXP2_THREAD = makeSymbol("_CSETF-OWL-EXP2-THREAD");









    private static final SubLSymbol $EXPORT = makeKeyword("EXPORT");













    private static final SubLString $str105$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_OWL_EXPORTER2 = makeSymbol("MAKE-OWL-EXPORTER2");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OWL_EXPORTER2_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-EXPORTER2-METHOD");

    private static final SubLString $str111$_OWL_EXPORTER__D_for__A_ = makeString("<OWL-EXPORTER ~D for ~A>");



    private static final SubLObject $$SoftwareVersionFn = reader_make_constant_shell(makeString("SoftwareVersionFn"));

    private static final SubLObject $$OWLExporter_Cyc = reader_make_constant_shell(makeString("OWLExporter-Cyc"));

    private static final SubLObject $$UserOfProgramFn = reader_make_constant_shell(makeString("UserOfProgramFn"));

    private static final SubLObject $$retainTerm = reader_make_constant_shell(makeString("retainTerm"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $sym118$_OWL_EXPORTER2_ID_ISG_ = makeSymbol("*OWL-EXPORTER2-ID-ISG*");

    private static final SubLSymbol $sym119$_OWL_EXPORTER2_ID_MAP_ = makeSymbol("*OWL-EXPORTER2-ID-MAP*");

    private static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");











    private static final SubLSymbol SXHASH_OWL_EXPORTER2_METHOD = makeSymbol("SXHASH-OWL-EXPORTER2-METHOD");

    private static final SubLSymbol $kw127$EXPORT_ENTIRE_KB_ = makeKeyword("EXPORT-ENTIRE-KB?");



    private static final SubLSymbol $kw129$RESTRICT_CONTEXT_ = makeKeyword("RESTRICT-CONTEXT?");





    private static final SubLString $str132$Adding_ontology_to_graph___ = makeString("Adding ontology to graph...");

    private static final SubLString $str133$Adding_collections_to_export_grap = makeString("Adding collections to export graph...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str135$Adding_non_collections_to_export_ = makeString("Adding non-collections to export graph...");

    private static final SubLString $str136$Adding_all_KB_collections_to_expo = makeString("Adding all KB collections to export graph...");



    private static final SubLString $str138$Adding_all_KB_non_collections_to_ = makeString("Adding all KB non-collections to export graph...");

    private static final SubLString $str139$_A_triple__p__ = makeString("~A triple~:p~%");

    private static final SubLString $str140$_A_node__p__ = makeString("~A node~:p~%");

    private static final SubLObject $$TheEmptyList = reader_make_constant_shell(makeString("TheEmptyList"));

    private static final SubLString $str142$owl_sameAs = makeString("owl:sameAs");

    private static final SubLString $str143$xsd_int = makeString("xsd:int");

    private static final SubLString $str144$_F = makeString("~F");

    private static final SubLString $str145$xsd_float = makeString("xsd:float");

    private static final SubLList $list146 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("comment")), reader_make_constant_shell(makeString("coExtensional")), reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("arg1Isa")), reader_make_constant_shell(makeString("arg2Isa")));

    private static final SubLSymbol OWL_EXPORTER2_FIND_NODE_FOR_TERM_INT = makeSymbol("OWL-EXPORTER2-FIND-NODE-FOR-TERM-INT");

    private static final SubLObject $$ResourceWithURIFn = reader_make_constant_shell(makeString("ResourceWithURIFn"));

    private static final SubLObject $const149$owl_Class = reader_make_constant_shell(makeString("owl:Class"));

    private static final SubLObject $const150$owl_Restriction = reader_make_constant_shell(makeString("owl:Restriction"));

    private static final SubLObject $$URIFn = reader_make_constant_shell(makeString("URIFn"));

    private static final SubLString $str152$rdf_nil = makeString("rdf:nil");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLString $str154$rdf_type = makeString("rdf:type");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str156$rdfs_subClassOf = makeString("rdfs:subClassOf");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str158$rdfs_subPropertyOf = makeString("rdfs:subPropertyOf");

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLString $str160$rdfs_comment = makeString("rdfs:comment");

    private static final SubLObject $$coExtensional = reader_make_constant_shell(makeString("coExtensional"));

    private static final SubLString $str162$owl_equivalentClass = makeString("owl:equivalentClass");

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLString $str164$owl_disjointWith = makeString("owl:disjointWith");

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLString $str166$rdfs_domain = makeString("rdfs:domain");

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLString $str168$rdfs_range = makeString("rdfs:range");



    private static final SubLString $$$Indeterminate = makeString("Indeterminate");

    private static final SubLString $$$Anonymous = makeString("Anonymous");

    private static final SubLObject $$IndeterminateTerm = reader_make_constant_shell(makeString("IndeterminateTerm"));

    private static final SubLObject $$TheCollection = reader_make_constant_shell(makeString("TheCollection"));

    private static final SubLSymbol $SYNONYMOUS_EXTERNAL_CONCEPT = makeKeyword("SYNONYMOUS-EXTERNAL-CONCEPT");

    private static final SubLSymbol $SUPPRESS_HUMANLY_READABLE_NON_OPENCYC_URIS = makeKeyword("SUPPRESS-HUMANLY-READABLE-NON-OPENCYC-URIS");

    private static final SubLObject $$rdfURI = reader_make_constant_shell(makeString("rdfURI"));

    private static final SubLString $str177$_A_has_more_than_one___rdfURI_ass = makeString("~A has more than one #$rdfURI assertion in ~A");

    private static final SubLString $str178$Cannot_find_best_node_for_fort__A = makeString("Cannot find best node for fort ~A, using mycyc:");

    private static final SubLString $str179$Cannot_find_best_node_for_naut__S = makeString("Cannot find best node for naut ~S, using mycyc:");

    private static final SubLSymbol GAF_ARG3 = makeSymbol("GAF-ARG3");

    private static final SubLList $list181 = list(CHAR_colon);

    private static final SubLSymbol $BLANK_NODE_COUNT = makeKeyword("BLANK-NODE-COUNT");

    private static final SubLList $list183 = list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("relationAllOnly")), reader_make_constant_shell(makeString("relationAllInstance")), reader_make_constant_shell(makeString("relationAllExistsCount")), reader_make_constant_shell(makeString("relationAllExistsMin")), reader_make_constant_shell(makeString("relationAllExistsMax")));

    private static final SubLSymbol $RULE_MACRO_PRED_ASSERTION_TERM_NOT_EXPORTABLE = makeKeyword("RULE-MACRO-PRED-ASSERTION-TERM-NOT-EXPORTABLE");

    private static final SubLSymbol $RULES_NOT_EXPORTABLE = makeKeyword("RULES-NOT-EXPORTABLE");

    private static final SubLSymbol $NON_BINARY_PREDICATE = makeKeyword("NON-BINARY-PREDICATE");

    private static final SubLSymbol $UNEXPORTABLE_PREDICATE = makeKeyword("UNEXPORTABLE-PREDICATE");

    private static final SubLSymbol $SUBJECT_NOT_EXPORTABLE = makeKeyword("SUBJECT-NOT-EXPORTABLE");

    private static final SubLObject $$owlDataTypeSemanticCorrelation = reader_make_constant_shell(makeString("owlDataTypeSemanticCorrelation"));

    private static final SubLSymbol $OBJECT_NOT_EXPORTABLE = makeKeyword("OBJECT-NOT-EXPORTABLE");

    private static final SubLSymbol $kw191$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_ = makeKeyword("SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?");

    private static final SubLString $str192$Could_not_export_assertion__A = makeString("Could not export assertion ~A");



    private static final SubLString $str194$owl_onProperty = makeString("owl:onProperty");

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLString $str196$owl_someValuesFrom = makeString("owl:someValuesFrom");

    private static final SubLObject $$relationAllOnly = reader_make_constant_shell(makeString("relationAllOnly"));

    private static final SubLString $str198$owl_allValuesFrom = makeString("owl:allValuesFrom");

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLString $str200$owl_hasValue = makeString("owl:hasValue");

    private static final SubLList $list201 = list(reader_make_constant_shell(makeString("relationAllExistsCount")), reader_make_constant_shell(makeString("relationAllExistsMin")), reader_make_constant_shell(makeString("relationAllExistsMax")));

    private static final SubLString $str202$owl_valuesFrom = makeString("owl:valuesFrom");

    private static final SubLString $str203$owl_Restriction = makeString("owl:Restriction");

    private static final SubLObject $$relationAllExistsCount = reader_make_constant_shell(makeString("relationAllExistsCount"));

    private static final SubLString $str205$owl_cardinality = makeString("owl:cardinality");

    private static final SubLObject $$relationAllExistsMin = reader_make_constant_shell(makeString("relationAllExistsMin"));

    private static final SubLString $str207$owl_minCardinality = makeString("owl:minCardinality");

    private static final SubLObject $$relationAllExistsMax = reader_make_constant_shell(makeString("relationAllExistsMax"));

    private static final SubLString $str209$owl_maxCardinality = makeString("owl:maxCardinality");

    private static final SubLString $str210$Unhandled_rmp_pred_for_assertion_ = makeString("Unhandled rmp pred for assertion ~A");

    private static final SubLSymbol $kw211$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_ = makeKeyword("SUPPRESS-ADDITIONAL-TYPE-TRIPLES?");

    private static final SubLObject $$Ontology = reader_make_constant_shell(makeString("Ontology"));

    private static final SubLString $str213$owl_Ontology = makeString("owl:Ontology");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $const215$rdfs_Literal = reader_make_constant_shell(makeString("rdfs:Literal"));

    private static final SubLString $str216$owl_DatatypeProperty = makeString("owl:DatatypeProperty");

    private static final SubLString $str217$owl_ObjectProperty = makeString("owl:ObjectProperty");

    private static final SubLString $str218$owl_Class = makeString("owl:Class");

    private static final SubLString $str219$owl_NamedIndividual = makeString("owl:NamedIndividual");

    private static final SubLString $str220$rdf_Property = makeString("rdf:Property");

    private static final SubLSymbol $sym221$COLLECTION_ = makeSymbol("COLLECTION?");

    private static final SubLObject $$RDFSchemaDatatype = reader_make_constant_shell(makeString("RDFSchemaDatatype"));

    private static final SubLString $str223$owl_Thing = makeString("owl:Thing");



    private static final SubLString $str225$rdf_first = makeString("rdf:first");

    private static final SubLString $str226$rdf_rest = makeString("rdf:rest");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$sameAs = makeString("sameAs");

    private static final SubLString $$$Adding_additional_triples_for_ = makeString("Adding additional triples for ");

    private static final SubLString $str231$_nodes___ = makeString(" nodes...");

    private static final SubLSymbol $OPENCYC_VERSIONED = makeKeyword("OPENCYC-VERSIONED");

    private static final SubLSymbol $OPENCYC_UNVERSIONED = makeKeyword("OPENCYC-UNVERSIONED");



    private static final SubLSymbol $DBPEDIA = makeKeyword("DBPEDIA");

    private static final SubLList $list236 = list(reader_make_constant_shell(makeString("MappingMtFn")), reader_make_constant_shell(makeString("DBPediaTripleStore")));

    private static final SubLSymbol $ADD_PRETTY_STRINGS = makeKeyword("ADD-PRETTY-STRINGS");

    private static final SubLObject $$prettyString = reader_make_constant_shell(makeString("prettyString"));

    private static final SubLString $$$en = makeString("en");

    private static final SubLSymbol $ADD_PRETTY_STRING_CANONICAL = makeKeyword("ADD-PRETTY-STRING-CANONICAL");

    private static final SubLObject $$prettyString_Canonical = reader_make_constant_shell(makeString("prettyString-Canonical"));





    private static final SubLString $str244$owl_versionInfo = makeString("owl:versionInfo");

    private static final SubLString $str245$Adding_rdf_label_triples_for_ = makeString("Adding rdf:label triples for ");

    private static final SubLString $$$_FORTs = makeString(" FORTs");

    private static final SubLString $str247$rdf_label = makeString("rdf:label");

    private static final SubLSymbol $sym248$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str249$xmlns_ = makeString("xmlns:");

    private static final SubLString $$$externalID = makeString("externalID");

    private static final SubLString $str251$owl_AnnotationProperty = makeString("owl:AnnotationProperty");

    private static final SubLString $str252$owl_FunctionalProperty = makeString("owl:FunctionalProperty");

    private static final SubLString $str253$Adding_cycAnnot_externalID_triple = makeString("Adding cycAnnot:externalID triples for ");

    private static final SubLString $$$label = makeString("label");

    private static final SubLString $str255$Adding_cycAnnot_label_triples_for = makeString("Adding cycAnnot:label triples for ");

    private static final SubLString $str256$Removing__rdfs_range__X_owl_Thing = makeString("Removing (rdfs:range ?X owl:Thing) triples");

    private static final SubLString $str257$Removing__rdfs_domain__X_owl_Thin = makeString("Removing (rdfs:domain ?X owl:Thing) triples");

    private static final SubLString $str258$base_uri = makeString("base:uri");

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLObject $$nameSpacePrefixForSKS = reader_make_constant_shell(makeString("nameSpacePrefixForSKS"));

    private static final SubLList $list261 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $$$rdf = makeString("rdf");

    private static final SubLString $str263$http___www_w3_org_1999_02_22_rdf_ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#");

    private static final SubLString $$$owl = makeString("owl");

    private static final SubLString $str265$http___www_w3_org_2002_07_owl_ = makeString("http://www.w3.org/2002/07/owl#");

    private static final SubLString $$$rdfs = makeString("rdfs");

    private static final SubLString $str267$http___www_w3_org_2000_01_rdf_sch = makeString("http://www.w3.org/2000/01/rdf-schema#");

    private static final SubLString $$$xsd = makeString("xsd");

    private static final SubLString $str269$http___www_w3_org_2001_XMLSchema_ = makeString("http://www.w3.org/2001/XMLSchema#");

    private static final SubLString $$$opencyc = makeString("opencyc");

    private static final SubLString $$$mycyc = makeString("mycyc");

    private static final SubLString $str272$http___sw_cyc_com_concept_ = makeString("http://sw.cyc.com/concept/");

    private static final SubLSymbol $sym273$RDF_NODES_EQUAL_ = makeSymbol("RDF-NODES-EQUAL?");

    private static final SubLString $str274$UTF_8 = makeString("UTF-8");

    private static final SubLString $str275$xml_base = makeString("xml:base");

    private static final SubLString $str276$rdf_RDF = makeString("rdf:RDF");



    private static final SubLList $list278 = list(makeString("owl:AnnotationProperty"), makeString("owl:ObjectProperty"), makeString("owl:DatatypeProperty"), makeString("owl:NamedIndividual"), makeString("owl:Class"), makeString("owl:Restriction"));

    private static final SubLString $str279$Finding_unexported_nodes___ = makeString("Finding unexported nodes...");

    private static final SubLString $str280$Exporting__A_owl_Description_node = makeString("Exporting ~A owl:Description node~:p");

    private static final SubLString $$$type = makeString("type");

    private static final SubLSymbol RDF_TRIPLE_SUBJECT = makeSymbol("RDF-TRIPLE-SUBJECT");

    private static final SubLString $str283$Exporting__A__A_node__p = makeString("Exporting ~A ~A node~:p");

    private static final SubLString $str284$Exporting__A__A_node__p__blank_ = makeString("Exporting ~A ~A node~:p (blank)");

    private static final SubLSymbol $sym285$OWL_EXPORT_EXPORTED_TRIPLE_ = makeSymbol("OWL-EXPORT-EXPORTED-TRIPLE?");

    private static final SubLString $$$Description = makeString("Description");

    private static final SubLString $str287$rdf_nodeID = makeString("rdf:nodeID");

    private static final SubLString $$$A = makeString("A");

    private static final SubLString $str289$rdf_about = makeString("rdf:about");

    private static final SubLString $str290$rdf_resource = makeString("rdf:resource");

    private static final SubLSymbol VALID_RDF_SUBJECT_P = makeSymbol("VALID-RDF-SUBJECT-P");



    private static final SubLSymbol RDF_TRIPLE_P = makeSymbol("RDF-TRIPLE-P");

    private static final SubLString $$$Class = makeString("Class");

    private static final SubLString $str295$Cannot_export_OWL_predicate_node_ = makeString("Cannot export OWL predicate node as tag due to missing namespace prefix definition: ~A");

    private static final SubLString $$$rest = makeString("rest");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str298$rdf_parseType = makeString("rdf:parseType");

    private static final SubLString $$$Collection = makeString("Collection");

    private static final SubLSymbol RDF_LITERAL_P = makeSymbol("RDF-LITERAL-P");

    private static final SubLString $str301$xml_lang = makeString("xml:lang");

    private static final SubLString $str302$rdf_datatype = makeString("rdf:datatype");

    private static final SubLString $str303$Unexportable_literal_encountered_ = makeString("Unexportable literal encountered: ~A");

    private static final SubLString $str304$rdfs_Literal = makeString("rdfs:Literal");

    private static final SubLString $str305$Don_t_know_how_to_export__A = makeString("Don't know how to export ~A");

    private static final SubLSymbol RDF_BLANK_NODE_P = makeSymbol("RDF-BLANK-NODE-P");

    private static final SubLString $str307$rdf_Description = makeString("rdf:Description");

    private static final SubLString $$$first = makeString("first");

    private static final SubLSymbol $kw309$SUPPRESS_DUPLICATE_EXPORT_OF_BLANK_NODES_ = makeKeyword("SUPPRESS-DUPLICATE-EXPORT-OF-BLANK-NODES?");

    private static final SubLString $str310$ = makeString("");

    private static final SubLString $str311$_ = makeString(":");

    private static final SubLString $str312$_ = makeString("&");

    private static final SubLString $str313$_ = makeString(";");

    public static SubLObject show_owl_export_usages() {
        format_nil.force_format(T, $str1$OWL_Exporter_usages___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str2$_owl_export_ontology_to_file____o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(T, $str3$_owl_export_ontology_to_stream__o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject owl_export_ontology_to_file(final SubLObject ontology_term, final SubLObject filename, SubLObject exporter_options) {
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        exporter_options = copy_list(exporter_options);
        validate_owl_export_parameters($str5$owl_export_ontology_to_file, list_utilities.make_plist($list6, list(ontology_term, filename, exporter_options)));
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str8$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            final SubLObject exporter = new_owl_exporter2(exporter_options);
            owl_exporter2_set_ontology(exporter, ontology_term);
            owl_exporter2_set_terms(exporter, owl_terms_for_ontology(ontology_term));
            owl_exporter2_set_option(exporter, $OUTPUT_STREAM, stream_$1);
            owl_exporter2_set_option(exporter, $FILENAME, filename);
            owl_export_with_exporter(exporter);
            return exporter;
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
    }

    public static SubLObject owl_export_ontology_to_stream(final SubLObject ontology_term, SubLObject stream, SubLObject exporter_options) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        exporter_options = copy_list(exporter_options);
        validate_owl_export_parameters($str13$owl_export_ontology_to_stream, list_utilities.make_plist($list14, list(ontology_term, stream, exporter_options)));
        final SubLObject exporter = new_owl_exporter2(exporter_options);
        owl_exporter2_set_ontology(exporter, ontology_term);
        owl_exporter2_set_terms(exporter, owl_terms_for_ontology(ontology_term));
        owl_exporter2_set_option(exporter, $OUTPUT_STREAM, stream);
        owl_export_with_exporter(exporter);
        return exporter;
    }

    public static SubLObject owl_export_terms_to_file(final SubLObject terms, final SubLObject filename, SubLObject exporter_options) {
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        exporter_options = copy_list(exporter_options);
        validate_owl_export_parameters($str16$owl_export_terms_to_file, list_utilities.make_plist($list17, list(terms, filename, exporter_options)));
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str8$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            final SubLObject exporter = new_owl_exporter2(exporter_options);
            owl_exporter2_set_terms(exporter, terms);
            owl_exporter2_set_option(exporter, $OUTPUT_STREAM, stream_$2);
            owl_exporter2_set_option(exporter, $FILENAME, filename);
            owl_export_with_exporter(exporter);
            return exporter;
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
    }

    public static SubLObject owl_export_terms_to_stream(final SubLObject terms, SubLObject stream, SubLObject exporter_options) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        if (exporter_options == UNPROVIDED) {
            exporter_options = NIL;
        }
        exporter_options = copy_list(exporter_options);
        validate_owl_export_parameters($str19$owl_export_terms_to_stream, list_utilities.make_plist($list20, list(terms, exporter_options)));
        final SubLObject exporter = new_owl_exporter2(exporter_options);
        owl_exporter2_set_terms(exporter, terms);
        owl_exporter2_set_option(exporter, $OUTPUT_STREAM, stream);
        owl_export_with_exporter(exporter);
        return exporter;
    }

    public static SubLObject owl_terms_for_ontology(final SubLObject ontology_term) {
        final SubLObject term_types = kb_mapping_utilities.pred_values_in_any_mt(ontology_term, $$termTypeForOntology, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = term_types;
        SubLObject term_type = NIL;
        term_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = isa.all_quoted_instances_in_all_mts(term_type);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_term = cdolist_list_var_$3.first();
            } 
            SubLObject cdolist_list_var_$4 = isa.all_instances_in_all_mts(term_type);
            v_term = NIL;
            v_term = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                v_term = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            term_type = cdolist_list_var.first();
        } 
        cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(ontology_term, $$synonymousExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = v_term2;
            if (NIL == member(item_var2, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                terms = cons(item_var2, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term2 = cdolist_list_var.first();
        } 
        cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(ontology_term, $$overlappingExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        v_term2 = NIL;
        v_term2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var2 = v_term2;
            if (NIL == member(item_var2, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                terms = cons(item_var2, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term2 = cdolist_list_var.first();
        } 
        return nreverse(terms);
    }

    public static SubLObject validate_owl_export_parameters(final SubLObject function_name, final SubLObject exporter_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorsP = NIL;
        if (NIL != list_utilities.plist_has_keyP(exporter_parameters, $FILENAME)) {
            final SubLObject filename = getf(exporter_parameters, $FILENAME, UNPROVIDED);
            if (NIL != file_utilities.file_existsP(filename)) {
                format_nil.force_format(T, $str24$_A__FILENAME__S_already_exists__, function_name, getf(exporter_parameters, $FILENAME, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                errorsP = T;
            }
        }
        final SubLObject options = getf(exporter_parameters, $EXPORTER_OPTIONS, UNPROVIDED);
        if (NIL == list_utilities.property_list_p(options)) {
            format_nil.force_format(T, $str26$_A__EXPORTER_OPTIONS__S_is_not_a_, function_name, getf(exporter_parameters, $EXPORTER_OPTIONS, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        final SubLObject cyclist = getf(options, $CYCLIST, UNPROVIDED);
        if (NIL != cyclist) {
            if (NIL == isa.isa_in_any_mtP(cyclist, $$Cyclist)) {
                format_nil.force_format(T, $str29$_A__EXPORTER_OPTIONS__cyclist__A_, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                errorsP = T;
            }
        } else
            if ((NIL == isa.isa_in_any_mtP(operation_communication.the_cyclist(), $$Cyclist)) || $$Guest.eql(operation_communication.the_cyclist())) {
                format_nil.force_format(T, $str31$_A__Please_log_in_with__set_the_c, function_name, options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                errorsP = T;
            }

        final SubLObject invalid_options = set_difference(list_utilities.plist_keys(options), $owl_exporter2_valid_options$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != invalid_options) {
            format_nil.force_format(T, $str32$_A__EXPORTER_OPTIONS_has_invalid_, function_name, invalid_options, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            errorsP = T;
        }
        if (NIL != errorsP) {
            show_owl_export_usages();
            Errors.error($str33$Errors_found__aborting_export___);
        }
        return NIL;
    }

    public static SubLObject owl_export_with_exporter(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        final SubLObject ontology_term = owl_exporter2_ontology(exporter);
        final SubLObject terms = owl_exporter2_terms(exporter);
        SubLObject ontology_mt = owl_exporter2_get_option(exporter, $ONTOLOGY_MT, UNPROVIDED);
        SubLObject ontology_term_type = owl_exporter2_get_option(exporter, $ONTOLOGY_TERM_TYPE, UNPROVIDED);
        final SubLObject base_uri = owl_exporter2_get_option(exporter, $BASE_URI, UNPROVIDED);
        final SubLObject _prev_bind_0 = $owl_export_subject_node_to_term_hash$.currentBinding(thread);
        try {
            $owl_export_subject_node_to_term_hash$.bind(make_hash_table(min(TEN_INTEGER, multiply(THREE_INTEGER, length(terms))), UNPROVIDED, UNPROVIDED), thread);
            final SubLObject verboseP = owl_exporter2_get_option(exporter, $VERBOSE_, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(NIL == verboseP), thread);
                if (((NIL == hlmt.hlmtP(ontology_mt)) && ($ALL != ontology_mt)) && (NIL != forts.fort_p(ontology_term))) {
                    ontology_mt = kb_mapping_utilities.fpred_value_in_any_mt(ontology_term, $$contextOfPCW, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == hlmt.hlmtP(ontology_mt)) {
                    ontology_mt = $ALL;
                }
                owl_exporter2_set_option(exporter, $ONTOLOGY_MT, ontology_mt);
                if ((NIL == fort_types_interface.collectionP(ontology_term_type)) && (NIL != forts.fort_p(ontology_term))) {
                    ontology_term_type = kb_mapping_utilities.fpred_value_in_any_mt(ontology_term, $$termTypeForOntology, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == fort_types_interface.collectionP(ontology_term_type)) {
                    ontology_term_type = NIL;
                }
                owl_exporter2_set_option(exporter, $ONTOLOGY_TERM_TYPE, ontology_term_type);
                if (NIL != owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                    if (NIL != verboseP) {
                        format_nil.force_format(StreamsLow.$standard_output$.getDynamicValue(thread), $str42$Performing_OpenCyc_export_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if ($OPENCYC != owl_exporter2_get_option(exporter, $PREFER_URIS, UNPROVIDED)) {
                        if (NIL != verboseP) {
                            Errors.warn($$$Setting_prefer_OpenCyc_URI_option);
                        }
                        owl_exporter2_set_option(exporter, $PREFER_URIS, $OPENCYC);
                    }
                    if (NIL != owl_exporter2_get_option(exporter, $SAME_AS_URIS, UNPROVIDED)) {
                        Errors.warn($str47$Resetting_sameAs_URI_parameter_to);
                    }
                    owl_exporter2_set_option(exporter, $ADD_COMMENTS, T);
                    if (T == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                        owl_exporter2_set_option(exporter, $kw41$OPENCYC_EXPORT_, $HUMAN_READABLE);
                    }
                    if ($HUMAN_READABLE == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                        owl_exporter2_set_option(exporter, $BASE_URI, owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
                        owl_exporter2_set_option(exporter, $DEFAULT_NAMESPACE_URI, owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
                        owl_exporter2_set_option(exporter, $SAME_AS_URIS, $list51);
                    } else
                        if ($VERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                            owl_exporter2_set_option(exporter, $BASE_URI, owl_uris_and_prefixes.owl_opencyc_base_uri(UNPROVIDED));
                            owl_exporter2_set_option(exporter, $DEFAULT_NAMESPACE_URI, owl_uris_and_prefixes.owl_opencyc_base_uri(UNPROVIDED));
                            owl_exporter2_set_option(exporter, $SAME_AS_URIS, $list53);
                        } else
                            if ($UNVERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                                owl_exporter2_set_option(exporter, $BASE_URI, owl_uris_and_prefixes.owl_opencyc_unversioned_base_uri());
                                owl_exporter2_set_option(exporter, $DEFAULT_NAMESPACE_URI, owl_uris_and_prefixes.owl_opencyc_unversioned_base_uri());
                                owl_exporter2_set_option(exporter, $SAME_AS_URIS, $list55);
                            } else {
                                if (NIL != verboseP) {
                                    Errors.warn($str56$Invalid_opencyc_export_type___A__);
                                }
                                owl_exporter2_set_option(exporter, $kw41$OPENCYC_EXPORT_, $HUMAN_READABLE);
                                owl_exporter2_set_option(exporter, $BASE_URI, owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
                                owl_exporter2_set_option(exporter, $DEFAULT_NAMESPACE_URI, owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
                            }


                }
                if ((NIL == string_utilities.non_empty_stringP(base_uri)) && (NIL != forts.fort_p(ontology_term))) {
                    final SubLObject base_uri_term = kb_mapping_utilities.fpred_value_in_any_mt(ontology_term, $$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject base_uri_string = (NIL != forts.fort_p(base_uri_term)) ? kb_mapping_utilities.fpred_value_in_any_mt(base_uri_term, $$uriString, UNPROVIDED, UNPROVIDED, UNPROVIDED) : base_uri_term;
                    if (NIL != string_utilities.non_empty_stringP(base_uri_string)) {
                        owl_exporter2_set_option(exporter, $BASE_URI, base_uri_string);
                    }
                }
                final SubLObject owl_use_external_ids_for_names = makeBoolean(($UNVERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) || ($VERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)));
                final SubLObject _prev_bind_0_$6 = owlification.$owl_use_entity_referencesP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding(thread);
                try {
                    owlification.$owl_use_entity_referencesP$.bind(NIL, thread);
                    owlification.$owl_use_external_ids_for_namesP$.bind(owl_use_external_ids_for_names, thread);
                    owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind(list_utilities.sublisp_boolean(owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)), thread);
                    owl_exporter2_create_graph(exporter);
                    if (NIL != verboseP) {
                        owl_utilities.owl_debug_show_options(owl_exporter2_options(exporter));
                    }
                    owl_exporter2_modify_graph(exporter);
                } finally {
                    owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind(_prev_bind_3, thread);
                    owlification.$owl_use_external_ids_for_namesP$.rebind(_prev_bind_2, thread);
                    owlification.$owl_use_entity_referencesP$.rebind(_prev_bind_0_$6, thread);
                }
                owl_exporter2_output_to_stream(exporter);
            } finally {
                $silent_progressP$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            $owl_export_subject_node_to_term_hash$.rebind(_prev_bind_0, thread);
        }
        return exporter;
    }

    public static SubLObject owl_exporter_v2_version_number() {
        final SubLObject start = position_if(DIGIT_CHAR_P, $owl_exporter2_version_number$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject version_string = string_utilities.remove_last_char(string_utilities.substring($owl_exporter2_version_number$.getGlobalValue(), start, UNPROVIDED), TWO_INTEGER);
        string_utilities.set_nth_char(ZERO_INTEGER, version_string, CHAR_2, UNPROVIDED);
        return version_string;
    }

    public static SubLObject owl_exporter2_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_exporter2(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject owl_exporter2_p(final SubLObject v_object) {
        return v_object.getClass() == owl_exporter2.$owl_exporter2_native.class ? T : NIL;
    }

    public static SubLObject owl_exp2_id(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject owl_exp2_uri(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject owl_exp2_file(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject owl_exp2_graph(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject owl_exp2_cyclist(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject owl_exp2_export(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject owl_exp2_ontology(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject owl_exp2_terms(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject owl_exp2_sentences(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject owl_exp2_stats(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject owl_exp2_options(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject owl_exp2_thread(final SubLObject v_object) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_owl_exp2_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_owl_exp2_uri(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_owl_exp2_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_owl_exp2_graph(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_owl_exp2_cyclist(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_owl_exp2_export(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_owl_exp2_ontology(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_owl_exp2_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_owl_exp2_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_owl_exp2_stats(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_owl_exp2_options(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_owl_exp2_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != owl_exporter2_p(v_object) : "owl_exporter2.owl_exporter2_p(v_object) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_owl_exporter2(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new owl_exporter2.$owl_exporter2_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_owl_exp2_id(v_new, current_value);
            } else
                if (pcase_var.eql($URI)) {
                    _csetf_owl_exp2_uri(v_new, current_value);
                } else
                    if (pcase_var.eql($FILE)) {
                        _csetf_owl_exp2_file(v_new, current_value);
                    } else
                        if (pcase_var.eql($GRAPH)) {
                            _csetf_owl_exp2_graph(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYCLIST)) {
                                _csetf_owl_exp2_cyclist(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXPORT)) {
                                    _csetf_owl_exp2_export(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ONTOLOGY)) {
                                        _csetf_owl_exp2_ontology(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TERMS)) {
                                            _csetf_owl_exp2_terms(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($SENTENCES)) {
                                                _csetf_owl_exp2_sentences(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($STATS)) {
                                                    _csetf_owl_exp2_stats(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($OPTIONS)) {
                                                        _csetf_owl_exp2_options(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($THREAD)) {
                                                            _csetf_owl_exp2_thread(v_new, current_value);
                                                        } else {
                                                            Errors.error($str105$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_owl_exporter2(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OWL_EXPORTER2, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, owl_exp2_id(obj));
        funcall(visitor_fn, obj, $SLOT, $URI, owl_exp2_uri(obj));
        funcall(visitor_fn, obj, $SLOT, $FILE, owl_exp2_file(obj));
        funcall(visitor_fn, obj, $SLOT, $GRAPH, owl_exp2_graph(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLIST, owl_exp2_cyclist(obj));
        funcall(visitor_fn, obj, $SLOT, $EXPORT, owl_exp2_export(obj));
        funcall(visitor_fn, obj, $SLOT, $ONTOLOGY, owl_exp2_ontology(obj));
        funcall(visitor_fn, obj, $SLOT, $TERMS, owl_exp2_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, owl_exp2_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $STATS, owl_exp2_stats(obj));
        funcall(visitor_fn, obj, $SLOT, $OPTIONS, owl_exp2_options(obj));
        funcall(visitor_fn, obj, $SLOT, $THREAD, owl_exp2_thread(obj));
        funcall(visitor_fn, obj, $END, MAKE_OWL_EXPORTER2, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_owl_exporter2_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_exporter2(obj, visitor_fn);
    }

    public static SubLObject print_owl_exporter2(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str111$_OWL_EXPORTER__D_for__A_, owl_exp2_id(v_object), owl_exp2_uri(v_object));
        return v_object;
    }

    public static SubLObject new_owl_exporter2(final SubLObject options) {
        assert NIL != list_utilities.property_list_p(options) : "list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) " + options;
        final SubLObject exporter = make_owl_exporter2(UNPROVIDED);
        final SubLObject cyclist = getf(options, $CYCLIST, UNPROVIDED);
        _csetf_owl_exp2_id(exporter, next_owl_exporter2_id());
        _csetf_owl_exp2_cyclist(exporter, cyclist_using_owl_exporter_v2(cyclist));
        _csetf_owl_exp2_terms(exporter, NIL);
        _csetf_owl_exp2_sentences(exporter, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        _csetf_owl_exp2_stats(exporter, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        _csetf_owl_exp2_options(exporter, options);
        return exporter;
    }

    public static SubLObject cyclist_using_owl_exporter_v2(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject version_string = owl_exporter_v2_version_number();
        final SubLObject versioned_tool_nat = make_binary_formula($$SoftwareVersionFn, $$OWLExporter_Cyc, version_string);
        final SubLObject cyclist_using_tool_naut = make_binary_formula($$UserOfProgramFn, versioned_tool_nat, cyclist);
        if (NIL == kb_accessors.cyclistP(narts_high.find_nart(cyclist_using_tool_naut))) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(NIL, thread);
                operation_communication.set_the_cyclist(cyclist);
                ke.ke_assert_now(list($$retainTerm, cyclist_using_tool_naut), $$BaseKB, UNPROVIDED, UNPROVIDED);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return narts_high.find_nart(cyclist_using_tool_naut);
    }

    public static SubLObject next_owl_exporter2_id() {
        return integer_sequence_generator.integer_sequence_generator_next($owl_exporter2_id_isg$.getGlobalValue());
    }

    public static SubLObject owl_exporter2_id_map() {
        return $owl_exporter2_id_map$.getGlobalValue();
    }

    public static SubLObject note_owl_exporter2_id(final SubLObject exporter, final SubLObject id) {
        return dictionary.dictionary_enter($owl_exporter2_id_map$.getGlobalValue(), id, exporter);
    }

    public static SubLObject owl_exporter2_id(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_id(exporter);
    }

    public static SubLObject owl_exporter2_uri(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_uri(exporter);
    }

    public static SubLObject owl_exporter2_file(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_file(exporter);
    }

    public static SubLObject owl_exporter2_graph(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_graph(exporter);
    }

    public static SubLObject owl_exporter2_set_graph(final SubLObject exporter, final SubLObject v_graph) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != rdf_graph.rdf_graph_p(v_graph) : "rdf_graph.rdf_graph_p(v_graph) " + "CommonSymbols.NIL != rdf_graph.rdf_graph_p(v_graph) " + v_graph;
        _csetf_owl_exp2_graph(exporter, v_graph);
        return v_graph;
    }

    public static SubLObject owl_exporter2_cyclist(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_cyclist(exporter);
    }

    public static SubLObject owl_exporter2_export(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_export(exporter);
    }

    public static SubLObject owl_exporter2_ontology(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_ontology(exporter);
    }

    public static SubLObject owl_exporter2_set_ontology(final SubLObject exporter, final SubLObject ontology) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != forts.fort_p(ontology) : "forts.fort_p(ontology) " + "CommonSymbols.NIL != forts.fort_p(ontology) " + ontology;
        _csetf_owl_exp2_ontology(exporter, ontology);
        return ontology;
    }

    public static SubLObject owl_exporter2_terms(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_terms(exporter);
    }

    public static SubLObject owl_exporter2_set_terms(final SubLObject exporter, final SubLObject terms) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        _csetf_owl_exp2_terms(exporter, terms);
        return terms;
    }

    public static SubLObject owl_exporter2_sentences(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_sentences(exporter);
    }

    public static SubLObject owl_exporter2_stats(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_stats(exporter);
    }

    public static SubLObject owl_exporter2_note_stat(final SubLObject exporter, final SubLObject stat, final SubLObject value) {
        return dictionary.dictionary_enter(owl_exporter2_stats(exporter), stat, value);
    }

    public static SubLObject owl_exporter2_lookup_stat(final SubLObject exporter, final SubLObject stat) {
        return dictionary.dictionary_lookup_without_values(owl_exporter2_stats(exporter), stat, UNPROVIDED);
    }

    public static SubLObject owl_exporter2_triple_count(final SubLObject exporter) {
        return owl_exporter2_lookup_stat(exporter, $TRIPLE_COUNT);
    }

    public static SubLObject owl_exporter2_triples_done(final SubLObject exporter) {
        return owl_exporter2_lookup_stat(exporter, $TRIPLES_DONE);
    }

    public static SubLObject owl_exporter2_nodes_done(final SubLObject exporter) {
        return owl_exporter2_lookup_stat(exporter, $NODES_DONE);
    }

    public static SubLObject owl_exporter2_increment_triples_done(final SubLObject exporter) {
        return owl_exporter2_note_stat(exporter, $TRIPLES_DONE, number_utilities.f_1X(owl_exporter2_triples_done(exporter)));
    }

    public static SubLObject owl_exporter2_increment_nodes_done(final SubLObject exporter) {
        return owl_exporter2_note_stat(exporter, $NODES_DONE, number_utilities.f_1X(owl_exporter2_nodes_done(exporter)));
    }

    public static SubLObject owl_exporter2_set_options(final SubLObject exporter, final SubLObject options) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        if (((NIL != options) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == list_utilities.property_list_p(options))) {
            throw new AssertionError(options);
        }
        _csetf_owl_exp2_options(exporter, options);
        return options;
    }

    public static SubLObject owl_exporter2_set_option(final SubLObject exporter, final SubLObject key, final SubLObject value) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        SubLObject options = owl_exp2_options(exporter);
        options = putf(options, key, value);
        _csetf_owl_exp2_options(exporter, options);
        return options;
    }

    public static SubLObject owl_exporter2_set_option_if_not_set(final SubLObject exporter, final SubLObject key, final SubLObject value) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        SubLObject options = owl_exp2_options(exporter);
        if (NIL == list_utilities.plist_has_keyP(options, key)) {
            options = putf(options, key, value);
            _csetf_owl_exp2_options(exporter, options);
        }
        return options;
    }

    public static SubLObject owl_exporter2_get_option(final SubLObject exporter, final SubLObject key, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return getf(owl_exp2_options(exporter), key, v_default);
    }

    public static SubLObject owl_exporter2_options(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_options(exporter);
    }

    public static SubLObject owl_exporter2_note_thread(final SubLObject exporter, final SubLObject thread) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != processp(thread) : "Types.processp(thread) " + "CommonSymbols.NIL != Types.processp(thread) " + thread;
        _csetf_owl_exp2_thread(exporter, thread);
        return owl_exp2_thread(exporter);
    }

    public static SubLObject owl_exporter2_thread(final SubLObject exporter) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        return owl_exp2_thread(exporter);
    }

    public static SubLObject sxhash_owl_exporter2_method(final SubLObject v_object) {
        return sxhash_owl_exporter2(v_object);
    }

    public static SubLObject sxhash_owl_exporter2(final SubLObject exporter) {
        return Sxhash.sxhash(owl_exp2_id(exporter));
    }

    public static SubLObject owl_exporter2_create_graph(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        final SubLObject verboseP = owl_exporter2_get_option(exporter, $VERBOSE_, UNPROVIDED);
        final SubLObject ontology_term = owl_exporter2_ontology(exporter);
        final SubLObject ontology_mt = owl_exporter2_get_option(exporter, $ONTOLOGY_MT, UNPROVIDED);
        final SubLObject terms = owl_exporter2_terms(exporter);
        final SubLObject v_graph = rdf_graph.new_rdf_graph();
        owl_exporter2_set_graph(exporter, v_graph);
        owl_exporter2_add_rdf_graph_prefix_map(exporter);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            mt_relevance_macros.$mt$.bind(NIL != hlmt.hlmt_p(ontology_mt) ? ontology_mt : NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((NIL != owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED)) || ($ALL == ontology_mt) ? RELEVANT_MT_IS_EVERYTHING : NIL != owl_exporter2_get_option(exporter, $kw129$RESTRICT_CONTEXT_, UNPROVIDED) ? RELEVANT_MT_IS_EQ : RELEVANT_MT_IS_GENL_MT, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject str = $str132$Adding_ontology_to_graph___;
                    final SubLObject _prev_bind_0_$8 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$9 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$10 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$11 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$12 = $progress_pacifications_since_last_nl$.currentBinding(thread);
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
                        if (NIL != forts.fort_p(ontology_term)) {
                            owl_exporter2_add_term_assertions_to_graph(exporter, ontology_term, T);
                        }
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$12, thread);
                        $progress_notification_count$.rebind(_prev_bind_3_$11, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$10, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$9, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$8, thread);
                    }
                    if (NIL != terms) {
                        SubLObject list_var = terms;
                        final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$11 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$12 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_4_$13 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind($str133$Adding_collections_to_export_grap, thread);
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
                                SubLObject v_term = NIL;
                                v_term = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    if (NIL != fort_types_interface.collectionP(v_term)) {
                                        owl_exporter2_add_term_assertions_to_graph(exporter, v_term, T);
                                    }
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    v_term = csome_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_4_$13, thread);
                            $progress_sofar$.rebind(_prev_bind_3_$12, thread);
                            $progress_total$.rebind(_prev_bind_2_$11, thread);
                            $progress_start_time$.rebind(_prev_bind_1_$10, thread);
                            $progress_note$.rebind(_prev_bind_0_$9, thread);
                        }
                        list_var = terms;
                        final SubLObject _prev_bind_0_$11 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$11 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$12 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$13 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_4_$14 = $last_percent_progress_index$.currentBinding(thread);
                        _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                        _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                        _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind($str135$Adding_non_collections_to_export_, thread);
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
                                SubLObject v_term = NIL;
                                v_term = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    if (NIL == fort_types_interface.collectionP(v_term)) {
                                        owl_exporter2_add_term_assertions_to_graph(exporter, v_term, T);
                                    }
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    v_term = csome_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_4_$14, thread);
                            $progress_sofar$.rebind(_prev_bind_3_$13, thread);
                            $progress_total$.rebind(_prev_bind_2_$12, thread);
                            $progress_start_time$.rebind(_prev_bind_1_$11, thread);
                            $progress_note$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                    if (NIL != owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED)) {
                        SubLObject message = copy_seq($str136$Adding_all_KB_collections_to_expo);
                        SubLObject total = forts.fort_count();
                        SubLObject sofar = ZERO_INTEGER;
                        final SubLObject _prev_bind_0_$13 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$12 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$13 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$14 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(message);
                                SubLObject cdolist_list_var = forts.do_forts_tables();
                                SubLObject table_var = NIL;
                                table_var = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject idx = table_var;
                                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                        final SubLObject idx_$29 = idx;
                                        if (NIL == id_index_dense_objects_empty_p(idx_$29, $SKIP)) {
                                            final SubLObject vector_var = id_index_dense_objects(idx_$29);
                                            final SubLObject backwardP_var = NIL;
                                            SubLObject length;
                                            SubLObject v_iteration;
                                            SubLObject id;
                                            SubLObject fort;
                                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                fort = aref(vector_var, id);
                                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                    if (NIL != id_index_tombstone_p(fort)) {
                                                        fort = $SKIP;
                                                    }
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL != fort_types_interface.collectionP(fort)) {
                                                        owl_exporter2_add_term_assertions_to_graph(exporter, fort, T);
                                                    }
                                                }
                                            }
                                        }
                                        final SubLObject idx_$30 = idx;
                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$30)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            final SubLObject sparse = id_index_sparse_objects(idx_$30);
                                            SubLObject id2 = id_index_sparse_id_threshold(idx_$30);
                                            final SubLObject end_id = id_index_next_id(idx_$30);
                                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                            while (id2.numL(end_id)) {
                                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL != fort_types_interface.collectionP(fort2)) {
                                                        owl_exporter2_add_term_assertions_to_graph(exporter, fort2, T);
                                                    }
                                                }
                                                id2 = add(id2, ONE_INTEGER);
                                            } 
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    table_var = cdolist_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3_$14, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$13, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$12, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$13, thread);
                        }
                        message = copy_seq($str138$Adding_all_KB_non_collections_to_);
                        total = forts.fort_count();
                        sofar = ZERO_INTEGER;
                        final SubLObject _prev_bind_0_$15 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$14 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$15 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(message);
                                SubLObject cdolist_list_var = forts.do_forts_tables();
                                SubLObject table_var = NIL;
                                table_var = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject idx = table_var;
                                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                        final SubLObject idx_$31 = idx;
                                        if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                                            final SubLObject vector_var = id_index_dense_objects(idx_$31);
                                            final SubLObject backwardP_var = NIL;
                                            SubLObject length;
                                            SubLObject v_iteration;
                                            SubLObject id;
                                            SubLObject fort;
                                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                fort = aref(vector_var, id);
                                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                    if (NIL != id_index_tombstone_p(fort)) {
                                                        fort = $SKIP;
                                                    }
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL == fort_types_interface.collectionP(fort)) {
                                                        owl_exporter2_add_term_assertions_to_graph(exporter, fort, T);
                                                    }
                                                }
                                            }
                                        }
                                        final SubLObject idx_$32 = idx;
                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$32)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            final SubLObject sparse = id_index_sparse_objects(idx_$32);
                                            SubLObject id2 = id_index_sparse_id_threshold(idx_$32);
                                            final SubLObject end_id = id_index_next_id(idx_$32);
                                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                            while (id2.numL(end_id)) {
                                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL == fort_types_interface.collectionP(fort2)) {
                                                        owl_exporter2_add_term_assertions_to_graph(exporter, fort2, T);
                                                    }
                                                }
                                                id2 = add(id2, ONE_INTEGER);
                                            } 
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    table_var = cdolist_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3_$15, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$14, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        if (NIL != verboseP) {
            format_nil.force_format(T, $str139$_A_triple__p__, rdf_graph.rdf_graph_triple_count(owl_exporter2_graph(exporter)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            format_nil.force_format(T, $str140$_A_node__p__, rdf_graph.rdf_graph_node_count(owl_exporter2_graph(exporter)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return exporter;
    }

    public static SubLObject owl_exporter2_add_term_assertions_to_graph(final SubLObject exporter, SubLObject v_term, SubLObject focal_nodeP) {
        if (focal_nodeP == UNPROVIDED) {
            focal_nodeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(v_term, $owl_export_exporting_terms$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED)) {
            focal_nodeP = T;
        }
        final SubLObject _prev_bind_0 = $owl_export_exporting_terms$.currentBinding(thread);
        try {
            $owl_export_exporting_terms$.bind(cons(v_term, $owl_export_exporting_terms$.getDynamicValue(thread)), thread);
            final SubLObject term_node = owl_exporter2_find_node_for_term(exporter, v_term, focal_nodeP, UNPROVIDED);
            if ((NIL != focal_nodeP) && (NIL != rdf_graph.valid_rdf_subject_p(term_node))) {
                rdf_graph.rdf_graph_note_focal_node(owl_exporter2_graph(exporter), term_node);
            }
            if (NIL != el_empty_list_p(v_term)) {
                v_term = $$TheEmptyList;
            }
            if (NIL != el_non_empty_list_p(v_term)) {
                owl_exporter2_add_el_list_to_graph(exporter, v_term);
            } else {
                SubLObject rmp_assertions = NIL;
                SubLObject cdolist_list_var = owl_exporter2_term_graph_assertions(exporter, v_term);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != owl_export_supported_rule_macro_predicateP(assertions_high.gaf_predicate(assertion)))) {
                        rmp_assertions = cons(assertion, rmp_assertions);
                    } else {
                        owl_exporter2_add_assertion_to_graph(exporter, assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                cdolist_list_var = rmp_assertions;
                assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    owl_exporter2_add_assertion_to_graph(exporter, assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            }
            if ((NIL == rdf_blank_node.rdf_blank_node_p(term_node)) && (NIL != focal_nodeP)) {
                owl_exporter2_add_type_for_node_to_graph(exporter, term_node, v_term);
            }
            if ((NIL == rdf_blank_node.rdf_blank_node_p(term_node)) && (NIL != focal_nodeP)) {
                final SubLObject focal_node_as_nonfocal = owl_exporter2_find_node_for_term(exporter, v_term, T, UNPROVIDED);
                if (NIL == rdf_graph.rdf_nodes_equalP(term_node, focal_node_as_nonfocal)) {
                    rdf_graph.rdf_graph_add_triple(owl_exporter2_graph(exporter), term_node, rdf_graph.get_known_uri($str142$owl_sameAs), focal_node_as_nonfocal);
                }
            }
        } finally {
            $owl_export_exporting_terms$.rebind(_prev_bind_0, thread);
        }
        return exporter;
    }

    public static SubLObject owl_exporter2_find_node_for_term(final SubLObject exporter, final SubLObject v_term, SubLObject focal_nodeP, SubLObject assertion) {
        if (focal_nodeP == UNPROVIDED) {
            focal_nodeP = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (v_term.isInteger()) {
            result = rdf_graph.rdf_graph_get_literal(owl_exporter2_graph(exporter), format_nil.format_nil_d(v_term), NIL, rdf_graph.get_known_uri($str143$xsd_int));
        } else
            if (v_term.isNumber()) {
                result = rdf_graph.rdf_graph_get_literal(owl_exporter2_graph(exporter), format(NIL, $str144$_F, v_term), NIL, rdf_graph.get_known_uri($str145$xsd_float));
            } else
                if (v_term.isString()) {
                    result = rdf_graph.rdf_graph_get_literal(owl_exporter2_graph(exporter), v_term, NIL != assertion_handles.assertion_p(assertion) ? get_language_code_for_mt(assertions_high.assertion_mt(assertion)) : NIL, UNPROVIDED);
                } else
                    if (NIL != unicode_nauts.unicode_naut_p(v_term, UNPROVIDED)) {
                        result = rdf_graph.rdf_graph_get_literal(owl_exporter2_graph(exporter), unicode_nauts.convert_unicode_string_naut_to_utf8(v_term), NIL != assertion_handles.assertion_p(assertion) ? get_language_code_for_mt(assertions_high.assertion_mt(assertion)) : NIL, UNPROVIDED);
                    } else
                        if ((NIL != focal_nodeP) && v_term.eql($$TheEmptyList)) {
                            result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        } else
                            if ((((NIL != focal_nodeP) && ($OPENCYC == owl_exporter2_get_option(exporter, $PREFER_URIS, UNPROVIDED))) && (NIL != list_utilities.member_eqP(v_term, $list146))) && ((NIL != owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED)) || (NIL != list_utilities.member_eqP(v_term, owl_exporter2_terms(exporter))))) {
                                result = owl_exporter2_owl_opencyc_uri_for_fort(exporter, v_term);
                            } else {
                                result = owl_exporter2_find_node_for_term_int(exporter, v_term);
                            }





        if ((NIL != result) && $owl_export_subject_node_to_term_hash$.getDynamicValue(thread).isHashtable()) {
            sethash(result, $owl_export_subject_node_to_term_hash$.getDynamicValue(thread), v_term);
        }
        return result;
    }

    public static SubLObject owl_exporter2_find_node_for_term_int_internal(final SubLObject exporter, final SubLObject v_term) {
        final SubLObject ontology_mt = owl_exporter2_get_option(exporter, $ONTOLOGY_MT, UNPROVIDED);
        SubLObject result = NIL;
        if (((NIL != nart_handles.nart_p(v_term)) && (NIL == narts_high.nart_with_functor_p($$ResourceWithURIFn, v_term))) && ((NIL != isa.isa_in_any_mtP(v_term, $const149$owl_Class)) || (NIL != isa.isa_in_any_mtP(v_term, $const150$owl_Restriction)))) {
            result = rdf_blank_node.new_rdf_blank_node(owl_exporter2_next_blank_node_id(exporter));
        } else
            if ((NIL != nart_handles.nart_p(v_term)) && (NIL != narts_high.nart_with_functor_p($$ResourceWithURIFn, v_term))) {
                result = rdf_uri.get_rdf_uri(cycl_utilities.formula_arg1(narts_high.nart_el_formula(v_term), UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if ((NIL != nart_handles.nart_p(v_term)) && (NIL != narts_high.nart_with_functor_p($$URIFn, v_term))) {
                    result = rdf_uri.get_rdf_uri(cycl_utilities.formula_arg1(narts_high.nart_el_formula(v_term), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL != el_empty_list_p(v_term)) {
                        result = rdf_graph.get_known_uri($str152$rdf_nil);
                    } else
                        if (NIL != el_list_p(v_term)) {
                            result = rdf_blank_node.new_rdf_blank_node(owl_exporter2_next_blank_node_id(exporter));
                        } else
                            if (v_term.eql($$isa)) {
                                result = rdf_graph.get_known_uri($str154$rdf_type);
                            } else
                                if (v_term.eql($$genls)) {
                                    result = rdf_graph.get_known_uri($str156$rdfs_subClassOf);
                                } else
                                    if (v_term.eql($$genlPreds)) {
                                        result = rdf_graph.get_known_uri($str158$rdfs_subPropertyOf);
                                    } else
                                        if (v_term.eql($$comment)) {
                                            result = rdf_graph.get_known_uri($str160$rdfs_comment);
                                        } else
                                            if (v_term.eql($$coExtensional)) {
                                                result = rdf_graph.get_known_uri($str162$owl_equivalentClass);
                                            } else
                                                if (v_term.eql($$disjointWith)) {
                                                    result = rdf_graph.get_known_uri($str164$owl_disjointWith);
                                                } else
                                                    if (v_term.eql($$arg1Isa)) {
                                                        result = rdf_graph.get_known_uri($str166$rdfs_domain);
                                                    } else
                                                        if (v_term.eql($$arg2Isa)) {
                                                            result = rdf_graph.get_known_uri($str168$rdfs_range);
                                                        } else
                                                            if (NIL != has_known_uriP(v_term)) {
                                                                result = rdf_graph.get_known_uri(v_term);
                                                            } else {
                                                                if (v_term.eql(owl_exporter2_ontology(exporter)) && (NIL != web_utilities.uri_p(owl_exporter2_get_option(exporter, $ONTOLOGY_URI, UNPROVIDED), UNPROVIDED))) {
                                                                    return rdf_uri.get_rdf_uri(owl_exporter2_get_option(exporter, $ONTOLOGY_URI, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (((NIL != constant_p(v_term)) && ((NIL != string_utilities.substringP($$$Indeterminate, constants_high.constant_name(v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.substringP($$$Anonymous, constants_high.constant_name(v_term), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != isa.quoted_isa_in_any_mtP(v_term, $$IndeterminateTerm))) {
                                                                    result = rdf_blank_node.new_rdf_blank_node(owl_exporter2_next_blank_node_id(exporter));
                                                                } else
                                                                    if ((NIL != nart_handles.nart_p(v_term)) && cycl_utilities.nat_functor(v_term).eql($$TheCollection)) {
                                                                        result = rdf_blank_node.new_rdf_blank_node(owl_exporter2_next_blank_node_id(exporter));
                                                                    } else
                                                                        if ((($SYNONYMOUS_EXTERNAL_CONCEPT == owl_exporter2_get_option(exporter, $PREFER_URIS, UNPROVIDED)) && (NIL != forts.fort_p(v_term))) && (NIL != owl_exporter2_owl_synonymous_external_concept_uri_for_fort(exporter, v_term))) {
                                                                            result = owl_exporter2_owl_synonymous_external_concept_uri_for_fort(exporter, v_term);
                                                                        } else
                                                                            if ((($OPENCYC == owl_exporter2_get_option(exporter, $PREFER_URIS, UNPROVIDED)) && (NIL != forts.fort_p(v_term))) && (NIL != owl_exporter2_fort_has_exported_owl_opencyc_contentP(exporter, v_term))) {
                                                                                result = owl_exporter2_owl_opencyc_uri_for_fort(exporter, v_term);
                                                                            } else
                                                                                if (($OPENCYC == owl_exporter2_get_option(exporter, $PREFER_URIS, UNPROVIDED)) && (NIL != forts.fort_p(v_term))) {
                                                                                    if (NIL != owl_exporter2_get_option(exporter, $SUPPRESS_HUMANLY_READABLE_NON_OPENCYC_URIS, UNPROVIDED)) {
                                                                                        result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_cyc_latest_uri_for_fort(v_term), UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_cyc_latest_readable_uri_for_fort(v_term), UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } else
                                                                                    if ((NIL != forts.fort_p(v_term)) && ((NIL != (NIL != hlmt.hlmt_p(ontology_mt) ? kb_mapping_utilities.pred_values(v_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED) : kb_mapping_utilities.pred_values_in_any_mt(v_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != kb_mapping_utilities.pred_values_in_mt(v_term, $$rdfURI, $$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                                                                                        SubLObject values = (NIL != hlmt.hlmt_p(ontology_mt)) ? kb_mapping_utilities.pred_values(v_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED) : kb_mapping_utilities.pred_values_in_any_mt(v_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        if (NIL == values) {
                                                                                            values = kb_mapping_utilities.pred_values_in_mt(v_term, $$rdfURI, $$BaseKB, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                        if (ONE_INTEGER.numL(length(values))) {
                                                                                            Errors.warn($str177$_A_has_more_than_one___rdfURI_ass, v_term, ontology_mt);
                                                                                        }
                                                                                        result = rdf_uri.get_rdf_uri(values.first(), UNPROVIDED, UNPROVIDED);
                                                                                    } else
                                                                                        if (NIL != forts.fort_p(v_term)) {
                                                                                            Errors.warn($str178$Cannot_find_best_node_for_fort__A, v_term);
                                                                                            result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_cyc_latest_uri_for_fort(v_term), UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            Errors.warn($str179$Cannot_find_best_node_for_naut__S, v_term);
                                                                                            result = rdf_graph.rdf_graph_get_literal(owl_exporter2_graph(exporter), owl_cycl_to_xml.owl_cyc_uri_for_cyc_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                                                        }






                                                            }













        return result;
    }

    public static SubLObject owl_exporter2_find_node_for_term_int(final SubLObject exporter, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return owl_exporter2_find_node_for_term_int_internal(exporter, v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OWL_EXPORTER2_FIND_NODE_FOR_TERM_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OWL_EXPORTER2_FIND_NODE_FOR_TERM_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OWL_EXPORTER2_FIND_NODE_FOR_TERM_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(exporter, v_term);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (exporter.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_term.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(owl_exporter2_find_node_for_term_int_internal(exporter, v_term)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(exporter, v_term));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject owl_exporter2_owl_opencyc_uri_for_fort(final SubLObject exporter, final SubLObject v_term) {
        SubLObject result = NIL;
        if ($UNVERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
            result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(v_term), UNPROVIDED, UNPROVIDED);
        } else
            if ($VERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
                result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_opencyc_versioned_uri_for_fort(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else {
                result = rdf_uri.get_rdf_uri(owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return result;
    }

    public static SubLObject owl_exporter2_owl_synonymous_external_concept_uri_for_fort(final SubLObject exporter, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ontology = owl_exporter2_ontology(exporter);
        final SubLObject ontology_mt = owl_exporter2_get_option(exporter, $ONTOLOGY_MT, UNPROVIDED);
        final SubLObject ontology_base_uri = owl_exporter2_get_option(exporter, $BASE_URI, UNPROVIDED);
        SubLObject synonymous_external_concept_assertions = NIL;
        if (NIL != hlmt.hlmt_p(ontology_mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(ontology_mt, thread);
                synonymous_external_concept_assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$synonymousExternalConcept, v_term, ontology, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == synonymous_external_concept_assertions) {
            synonymous_external_concept_assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$synonymousExternalConcept, v_term, ontology, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        }
        if (NIL != synonymous_external_concept_assertions) {
            final SubLObject synonymous_external_concept_strings = Mapping.mapcar(GAF_ARG3, synonymous_external_concept_assertions);
            final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(owl_exporter2_graph(exporter));
            SubLObject result = NIL;
            if (NIL == result) {
                SubLObject csome_list_var = synonymous_external_concept_strings;
                SubLObject synonymous_external_concept_string = NIL;
                synonymous_external_concept_string = csome_list_var.first();
                while ((NIL == result) && (NIL != csome_list_var)) {
                    if (NIL != web_utilities.url_p(synonymous_external_concept_string)) {
                        final SubLObject uri = rdf_uri.get_rdf_uri(synonymous_external_concept_string, UNPROVIDED, UNPROVIDED);
                        if (NIL != rdf_uri.rdf_uri_p(uri)) {
                            result = uri;
                        }
                    } else
                        if ((NIL != string_utilities.non_empty_stringP(ontology_base_uri)) && ONE_INTEGER.numE(string_utilities.count_chars_in_string(synonymous_external_concept_string, CHAR_colon))) {
                            thread.resetMultipleValues();
                            final SubLObject prefix = string_utilities.split_string(synonymous_external_concept_string, $list181);
                            final SubLObject name = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject prefix_baseuri = assoc(prefix, prefix_map, EQUAL, UNPROVIDED).rest();
                            if (NIL != prefix_baseuri) {
                                final SubLObject uri2 = rdf_uri.get_rdf_uri(prefix_baseuri, CHAR_hash, name);
                                if (NIL != rdf_uri.rdf_uri_p(uri2)) {
                                    result = uri2;
                                }
                            }
                        } else
                            if ((NIL != string_utilities.non_empty_stringP(ontology_base_uri)) && (NIL != string_utilities.non_empty_stringP(synonymous_external_concept_string))) {
                                final SubLObject uri = rdf_uri.get_rdf_uri(ontology_base_uri, CHAR_hash, synonymous_external_concept_string);
                                if (NIL != rdf_uri.rdf_uri_p(uri)) {
                                    result = uri;
                                }
                            }


                    csome_list_var = csome_list_var.rest();
                    synonymous_external_concept_string = csome_list_var.first();
                } 
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_fort_has_exported_owl_opencyc_contentP(final SubLObject exporter, final SubLObject fort) {
        return makeBoolean((NIL != owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) || (NIL != owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort)));
    }

    public static SubLObject owl_exporter2_next_blank_node_id(final SubLObject exporter) {
        final SubLObject last_id = getf(owl_exporter2_options(exporter), $BLANK_NODE_COUNT, UNPROVIDED);
        final SubLObject this_id = (last_id.isInteger()) ? add(ONE_INTEGER, last_id) : ONE_INTEGER;
        putf(owl_exporter2_options(exporter), $BLANK_NODE_COUNT, this_id);
        return this_id;
    }

    public static SubLObject owl_exporter2_term_graph_assertions(final SubLObject exporter, final SubLObject v_term) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject possible_assertion = NIL;
        possible_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != owl_exporter2_exportable_assertionP(exporter, possible_assertion)) {
                result = cons(possible_assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            possible_assertion = cdolist_list_var.first();
        } 
        cdolist_list_var = kb_mapping.gather_gaf_arg_index(v_term, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        possible_assertion = NIL;
        possible_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != kb_accessors.symmetric_predicateP(assertions_high.gaf_predicate(possible_assertion))) && (NIL != owl_exporter2_exportable_assertionP(exporter, possible_assertion))) {
                result = cons(possible_assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            possible_assertion = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject owl_export_supported_rule_macro_predicateP(final SubLObject pred) {
        return list_utilities.member_eqP(pred, $list183);
    }

    public static SubLObject owl_exporter2_exportable_assertionP(final SubLObject exporter, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = owl_exporter2_terms(exporter);
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        final SubLObject subject = assertions_high.gaf_arg1(assertion);
        final SubLObject v_object = assertions_high.gaf_arg2(assertion);
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_accessors.binary_predicateP(assertions_high.gaf_predicate(assertion)))) {
            thread.resetMultipleValues();
            final SubLObject exportableP = owl_exporter2_exportable_binary_gaf_formulaP(exporter, predicate, subject, v_object);
            final SubLObject reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != exportableP) {
                return values(exportableP, reason);
            }
            if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
                thread.resetMultipleValues();
                final SubLObject exportableP_2 = owl_exporter2_exportable_binary_gaf_formulaP(exporter, predicate, v_object, subject);
                final SubLObject reason_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != exportableP) {
                    return values(exportableP_2, reason_2);
                }
            }
            return values(exportableP, reason);
        } else {
            if (NIL != owl_export_supported_rule_macro_predicateP(predicate)) {
                SubLObject cdolist_list_var = assertions_high.assertion_formula(assertion).rest();
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((((NIL == member(arg, terms, EQUAL, UNPROVIDED)) && (NIL == owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED))) && (!arg.isString())) && (!arg.isNumber())) {
                        return values(NIL, $RULE_MACRO_PRED_ASSERTION_TERM_NOT_EXPORTABLE);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                return values(T, NIL);
            }
            return values(NIL, $RULES_NOT_EXPORTABLE);
        }
    }

    public static SubLObject owl_exporter2_exportable_binary_gaf_formulaP(final SubLObject exporter, final SubLObject predicate, final SubLObject subject, final SubLObject v_object) {
        final SubLObject terms = owl_exporter2_terms(exporter);
        final SubLObject export_entire_kbP = owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED);
        if (NIL == kb_accessors.binary_predicateP(predicate)) {
            return values(NIL, $NON_BINARY_PREDICATE);
        }
        if ((((((!predicate.eql($$isa)) && ((!predicate.eql($$genls)) || (NIL != genls.genl_in_any_mtP(v_object, subject)))) && ((!predicate.eql($$genlPreds)) || (((NIL != forts.fort_p(v_object)) && (NIL != forts.fort_p(subject))) && (NIL != genl_predicates.genl_predicate_in_any_mtP(v_object, subject))))) && (NIL == has_known_uriP(predicate))) && (NIL == subl_promotions.memberP(predicate, terms, EQUAL, UNPROVIDED))) && (NIL == export_entire_kbP)) {
            return values(NIL, $UNEXPORTABLE_PREDICATE);
        }
        if (((NIL == subl_promotions.memberP(subject, terms, UNPROVIDED, UNPROVIDED)) && (NIL == export_entire_kbP)) && ((NIL == forts.fort_p(owl_exporter2_ontology(exporter))) || (!subject.equal(owl_exporter2_ontology(exporter))))) {
            return values(NIL, $SUBJECT_NOT_EXPORTABLE);
        }
        if (((((((((NIL == has_known_uriP(v_object)) && (NIL == subl_promotions.memberP(v_object, terms, EQUAL, UNPROVIDED))) && (NIL == export_entire_kbP)) && (NIL == el_list_p(v_object))) && (!v_object.isString())) && (NIL == unicode_nauts.unicode_naut_p(v_object, UNPROVIDED))) && (!v_object.isInteger())) && ((NIL == forts.fort_p(v_object)) || (NIL == kb_mapping_utilities.fpred_value_in_any_mt(v_object, $$owlDataTypeSemanticCorrelation, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)))) && ((NIL == nart_handles.nart_p(v_object)) || (!cycl_utilities.nat_functor(v_object).eql($$ResourceWithURIFn)))) {
            return values(NIL, $OBJECT_NOT_EXPORTABLE);
        }
        return values(T, NIL);
    }

    public static SubLObject owl_exporter2_add_assertion_to_graph(final SubLObject exporter, final SubLObject assertion) {
        if ((NIL == assertions_high.asserted_assertionP(assertion)) && (NIL != owl_exporter2_get_option(exporter, $kw191$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != owl_exporter2_get_option(exporter, $ADD_COMMENTS, UNPROVIDED)) && $$comment.eql(assertions_high.gaf_predicate(assertion))) {
            return NIL;
        }
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_accessors.binary_predicateP(assertions_high.gaf_predicate(assertion)))) {
            return owl_exporter2_add_binary_gaf_to_graph(exporter, assertion);
        }
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != owl_export_supported_rule_macro_predicateP(assertions_high.gaf_predicate(assertion)))) {
            return owl_exporter2_add_rmp_assertion_to_graph(exporter, assertion);
        }
        Errors.warn($str192$Could_not_export_assertion__A, assertion);
        return NIL;
    }

    public static SubLObject owl_exporter2_add_binary_gaf_to_graph(final SubLObject exporter, final SubLObject binary_gaf) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != assertion_handles.assertion_p(binary_gaf) : "assertion_handles.assertion_p(binary_gaf) " + "CommonSymbols.NIL != assertion_handles.assertion_p(binary_gaf) " + binary_gaf;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject predicate_term = assertions_high.gaf_predicate(binary_gaf);
        final SubLObject subject_term = assertions_high.gaf_arg1(binary_gaf);
        final SubLObject object_term = assertions_high.gaf_arg2(binary_gaf);
        final SubLObject predicate = owl_exporter2_find_node_for_term(exporter, predicate_term, NIL, binary_gaf);
        final SubLObject subject = owl_exporter2_find_node_for_term(exporter, subject_term, T, binary_gaf);
        final SubLObject v_object = owl_exporter2_find_node_for_term(exporter, object_term, NIL, binary_gaf);
        if (((NIL == rdf_graph.valid_rdf_predicate_p(predicate)) || (NIL == rdf_graph.valid_rdf_subject_p(subject))) || (NIL == rdf_graph.valid_rdf_object_p(v_object))) {
            return NIL;
        }
        if ((NIL != rdf_blank_node.rdf_blank_node_p(subject)) && (NIL == assertions_high.asserted_assertionP(binary_gaf))) {
            return NIL;
        }
        if (((NIL != rdf_graph.rdf_node_symmetric_predicateP(predicate)) && (NIL != rdf_blank_node.rdf_blank_node_p(subject))) && (NIL == rdf_blank_node.rdf_blank_node_p(v_object))) {
            rdf_graph.rdf_graph_add_triple(v_graph, v_object, predicate, subject);
        } else {
            rdf_graph.rdf_graph_add_triple(v_graph, subject, predicate, v_object);
        }
        if (NIL != rdf_blank_node.rdf_blank_node_p(v_object)) {
            owl_exporter2_add_term_assertions_to_graph(exporter, object_term, UNPROVIDED);
        }
        return exporter;
    }

    public static SubLObject owl_exporter2_add_rmp_assertion_to_graph(final SubLObject exporter, final SubLObject rmp_gaf) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != assertion_handles.assertion_p(rmp_gaf) : "assertion_handles.assertion_p(rmp_gaf) " + "CommonSymbols.NIL != assertion_handles.assertion_p(rmp_gaf) " + rmp_gaf;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject rmp_predicate = assertions_high.gaf_predicate(rmp_gaf);
        final SubLObject predicate_term = assertions_high.gaf_arg1(rmp_gaf);
        final SubLObject col1_term = assertions_high.gaf_arg2(rmp_gaf);
        final SubLObject col2_term = assertions_high.gaf_arg3(rmp_gaf);
        final SubLObject predicate = owl_exporter2_find_node_for_term(exporter, predicate_term, NIL, rmp_gaf);
        final SubLObject col1 = owl_exporter2_find_node_for_term(exporter, col1_term, T, rmp_gaf);
        final SubLObject col2 = owl_exporter2_find_node_for_term(exporter, col2_term, NIL, rmp_gaf);
        final SubLObject triples = rdf_graph.rdf_graph_find_object_triples(v_graph, predicate, rdf_graph.get_known_uri($str194$owl_onProperty));
        if (NIL != triples) {
            SubLObject cdolist_list_var = triples;
            SubLObject triple = NIL;
            triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject possible_restriction = rdf_triple.rdf_triple_subject(triple);
                if ((NIL != rdf_blank_node.rdf_blank_node_p(possible_restriction)) && ((((rmp_predicate.eql($$relationAllExists) && (NIL != rdf_graph.rdf_graph_find_triple(v_graph, possible_restriction, rdf_graph.get_known_uri($str196$owl_someValuesFrom), col2))) || (rmp_predicate.eql($$relationAllOnly) && (NIL != rdf_graph.rdf_graph_find_triple(v_graph, possible_restriction, rdf_graph.get_known_uri($str198$owl_allValuesFrom), col2)))) || (rmp_predicate.eql($$relationAllInstance) && (NIL != rdf_graph.rdf_graph_find_triple(v_graph, possible_restriction, rdf_graph.get_known_uri($str200$owl_hasValue), col2)))) || ((NIL != list_utilities.member_eqP(rmp_predicate, $list201)) && (NIL != rdf_graph.rdf_graph_find_triple(v_graph, possible_restriction, rdf_graph.get_known_uri($str202$owl_valuesFrom), col2))))) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                triple = cdolist_list_var.first();
            } 
        }
        final SubLObject restriction = rdf_blank_node.new_rdf_blank_node(owl_exporter2_next_blank_node_id(exporter));
        if (NIL != owl_export_supported_rule_macro_predicateP(rmp_predicate)) {
            if (NIL == rdf_graph.rdf_graph_find_object_triples(v_graph, restriction, rdf_graph.get_known_uri($str156$rdfs_subClassOf))) {
                rdf_graph.rdf_graph_add_triple(v_graph, col1, rdf_graph.get_known_uri($str156$rdfs_subClassOf), restriction);
            }
            if (NIL == rdf_graph.rdf_graph_find_object_triples(v_graph, restriction, rdf_graph.get_known_uri($str154$rdf_type))) {
                rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str203$owl_Restriction));
            }
            rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str194$owl_onProperty), predicate);
            if (rmp_predicate.eql($$relationAllExists)) {
                rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str196$owl_someValuesFrom), col2);
            } else
                if (rmp_predicate.eql($$relationAllOnly)) {
                    rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str198$owl_allValuesFrom), col2);
                } else
                    if (rmp_predicate.eql($$relationAllInstance)) {
                        rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str200$owl_hasValue), col2);
                    } else
                        if (rmp_predicate.eql($$relationAllExistsCount)) {
                            rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str202$owl_valuesFrom), col2);
                            rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str205$owl_cardinality), owl_exporter2_find_node_for_term(exporter, assertions_high.gaf_arg4(rmp_gaf), NIL, rmp_gaf));
                        } else
                            if (rmp_predicate.eql($$relationAllExistsMin)) {
                                rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str202$owl_valuesFrom), col2);
                                rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str207$owl_minCardinality), owl_exporter2_find_node_for_term(exporter, assertions_high.gaf_arg4(rmp_gaf), NIL, rmp_gaf));
                            } else
                                if (rmp_predicate.eql($$relationAllExistsMax)) {
                                    rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str202$owl_valuesFrom), col2);
                                    rdf_graph.rdf_graph_add_triple(v_graph, restriction, rdf_graph.get_known_uri($str209$owl_maxCardinality), owl_exporter2_find_node_for_term(exporter, assertions_high.gaf_arg4(rmp_gaf), NIL, rmp_gaf));
                                }





        } else {
            Errors.warn($str210$Unhandled_rmp_pred_for_assertion_, rmp_gaf);
        }
        return exporter;
    }

    public static SubLObject owl_exporter2_add_type_for_node_to_graph(final SubLObject exporter, final SubLObject subject_node, final SubLObject subject_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != owl_exporter2_get_option(exporter, $kw211$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_, UNPROVIDED)) || (NIL != rdf_literal.rdf_literal_p(subject_node))) {
            return NIL;
        }
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject terms = owl_exporter2_terms(exporter);
        if ((NIL != isa.isa_in_any_mtP(subject_term, $$Ontology)) && (NIL == owl_exporter2_get_option(exporter, $kw211$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_, UNPROVIDED))) {
            rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str213$owl_Ontology));
        } else
            if (NIL != kb_accessors.binary_predicateP(subject_term)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != list_utilities.sublisp_boolean(genls.any_specP($const215$rdfs_Literal, kb_mapping_utilities.pred_values(subject_term, $$arg2Isa, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                        rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str216$owl_DatatypeProperty));
                    } else {
                        rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str217$owl_ObjectProperty));
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (!ZERO_INTEGER.numL(rdf_graph.rdf_graph_subject_triple_count(v_graph, subject_node, rdf_graph.get_known_uri($str168$rdfs_range)))) {
                    owl_exporter2_add_range_for_predicate(exporter, subject_node, subject_term);
                }
                if (!ZERO_INTEGER.numL(rdf_graph.rdf_graph_subject_triple_count(v_graph, subject_node, rdf_graph.get_known_uri($str166$rdfs_domain)))) {
                    owl_exporter2_add_domain_for_predicate(exporter, subject_node, subject_term);
                }
            } else
                if (NIL != fort_types_interface.collection_in_any_mtP(subject_term)) {
                    rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str218$owl_Class));
                } else
                    if (NIL != kb_accessors.individualP(subject_term)) {
                        rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str219$owl_NamedIndividual));
                    } else
                        if (NIL != fort_types_interface.predicate_in_any_mtP(subject_term)) {
                            rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str220$rdf_Property));
                        }




        if (!ZERO_INTEGER.numL(rdf_graph.rdf_graph_subject_triple_count(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type)))) {
            SubLObject cdolist_list_var;
            final SubLObject min_isas = cdolist_list_var = genls.min_cols(isa.all_isa_among(subject_term, list_utilities.remove_if_not($sym221$COLLECTION_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject min_isa = NIL;
            min_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rdf_graph.rdf_graph_add_triple(v_graph, subject_node, rdf_graph.get_known_uri($str154$rdf_type), owl_exporter2_find_node_for_term(exporter, min_isa, T, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                min_isa = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_add_range_for_predicate(final SubLObject exporter, final SubLObject predicate_node, final SubLObject predicate_term) {
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject terms = list_utilities.remove_if_not($sym221$COLLECTION_, owl_exporter2_terms(exporter), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg2_isas = kb_mapping_utilities.pred_values(predicate_term, $$arg2Isa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject range_cols = NIL;
        SubLObject cdolist_list_var = arg2_isas;
        SubLObject arg2_isa = NIL;
        arg2_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$40 = genls.all_genls_among(arg2_isa, terms, UNPROVIDED, UNPROVIDED);
            SubLObject col = NIL;
            col = cdolist_list_var_$40.first();
            while (NIL != cdolist_list_var_$40) {
                final SubLObject item_var = col;
                if (NIL == member(item_var, range_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                    range_cols = cons(item_var, range_cols);
                }
                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                col = cdolist_list_var_$40.first();
            } 
            SubLObject cdolist_list_var_$41 = genls.all_genls_among(arg2_isa, isa.all_instances_in_all_mts($$RDFSchemaDatatype), UNPROVIDED, UNPROVIDED);
            col = NIL;
            col = cdolist_list_var_$41.first();
            while (NIL != cdolist_list_var_$41) {
                final SubLObject item_var = col;
                if (NIL == member(item_var, range_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                    range_cols = cons(item_var, range_cols);
                }
                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                col = cdolist_list_var_$41.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg2_isa = cdolist_list_var.first();
        } 
        if (NIL != range_cols) {
            cdolist_list_var = genls.min_cols(range_cols, UNPROVIDED, UNPROVIDED);
            SubLObject range_col = NIL;
            range_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject range_node = owl_exporter2_find_node_for_term(exporter, range_col, UNPROVIDED, UNPROVIDED);
                rdf_graph.rdf_graph_add_triple(v_graph, predicate_node, rdf_graph.get_known_uri($str168$rdfs_range), range_node);
                cdolist_list_var = cdolist_list_var.rest();
                range_col = cdolist_list_var.first();
            } 
        } else {
            rdf_graph.rdf_graph_add_triple(v_graph, predicate_node, rdf_graph.get_known_uri($str168$rdfs_range), rdf_graph.get_known_uri($str223$owl_Thing));
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_add_domain_for_predicate(final SubLObject exporter, final SubLObject predicate_node, final SubLObject predicate_term) {
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject terms = list_utilities.remove_if_not($sym221$COLLECTION_, owl_exporter2_terms(exporter), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg1_isas = kb_mapping_utilities.pred_values(predicate_term, $$arg1Isa, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject domain_cols = NIL;
        SubLObject cdolist_list_var = arg1_isas;
        SubLObject arg1_isa = NIL;
        arg1_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$42 = genls.all_genls_among(arg1_isa, terms, UNPROVIDED, UNPROVIDED);
            SubLObject col = NIL;
            col = cdolist_list_var_$42.first();
            while (NIL != cdolist_list_var_$42) {
                final SubLObject item_var = col;
                if (NIL == member(item_var, domain_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                    domain_cols = cons(item_var, domain_cols);
                }
                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                col = cdolist_list_var_$42.first();
            } 
            SubLObject cdolist_list_var_$43 = genls.all_genls_among(arg1_isa, isa.all_instances_in_all_mts($$RDFSchemaDatatype), UNPROVIDED, UNPROVIDED);
            col = NIL;
            col = cdolist_list_var_$43.first();
            while (NIL != cdolist_list_var_$43) {
                final SubLObject item_var = col;
                if (NIL == member(item_var, domain_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                    domain_cols = cons(item_var, domain_cols);
                }
                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                col = cdolist_list_var_$43.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg1_isa = cdolist_list_var.first();
        } 
        if (NIL != domain_cols) {
            cdolist_list_var = genls.min_cols(domain_cols, UNPROVIDED, UNPROVIDED);
            SubLObject domain_col = NIL;
            domain_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject domain_node = owl_exporter2_find_node_for_term(exporter, domain_col, UNPROVIDED, UNPROVIDED);
                rdf_graph.rdf_graph_add_triple(v_graph, predicate_node, rdf_graph.get_known_uri($str166$rdfs_domain), domain_node);
                cdolist_list_var = cdolist_list_var.rest();
                domain_col = cdolist_list_var.first();
            } 
        } else {
            rdf_graph.rdf_graph_add_triple(v_graph, predicate_node, rdf_graph.get_known_uri($str166$rdfs_domain), rdf_graph.get_known_uri($str223$owl_Thing));
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_add_el_list_to_graph(final SubLObject exporter, final SubLObject el_list) {
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != el_list_p(el_list) : "el_utilities.el_list_p(el_list) " + "CommonSymbols.NIL != el_utilities.el_list_p(el_list) " + el_list;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject first_uri = rdf_graph.get_known_uri($str225$rdf_first);
        final SubLObject rest_uri = rdf_graph.get_known_uri($str226$rdf_rest);
        final SubLObject nil_uri = rdf_graph.get_known_uri($str152$rdf_nil);
        final SubLObject list = el_list_items(el_list);
        final SubLObject first_term = list.first();
        final SubLObject rest_terms = list.rest();
        final SubLObject list_$44 = owl_exporter2_find_node_for_term(exporter, el_list, UNPROVIDED, UNPROVIDED);
        final SubLObject first = owl_exporter2_find_node_for_term(exporter, first_term, UNPROVIDED, UNPROVIDED);
        rdf_graph.rdf_graph_add_triple(v_graph, list_$44, first_uri, first);
        if (NIL != rdf_blank_node.rdf_blank_node_p(first)) {
            owl_exporter2_add_term_assertions_to_graph(exporter, first_term, UNPROVIDED);
        }
        if (NIL == rest_terms) {
            rdf_graph.rdf_graph_add_triple(v_graph, list_$44, rest_uri, nil_uri);
        } else {
            final SubLObject rest_el_list = make_el_list(rest_terms, UNPROVIDED);
            final SubLObject rest = owl_exporter2_find_node_for_term(exporter, rest_el_list, UNPROVIDED, UNPROVIDED);
            rdf_graph.rdf_graph_add_triple(v_graph, list_$44, rest_uri, rest);
            owl_exporter2_add_term_assertions_to_graph(exporter, rest_el_list, UNPROVIDED);
        }
        return exporter;
    }

    public static SubLObject uri_for_cyc_term(final SubLObject v_term) {
        final SubLObject uri_string = kb_mapping_utilities.fpred_value(v_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != web_utilities.url_p(uri_string)) {
            return rdf_uri.get_rdf_uri(uri_string, UNPROVIDED, UNPROVIDED);
        }
        if (v_term.eql($$isa)) {
            return rdf_graph.get_known_uri($str154$rdf_type);
        }
        if (v_term.eql($$genls)) {
            return rdf_graph.get_known_uri($str156$rdfs_subClassOf);
        }
        if (v_term.eql($$genlPreds)) {
            return rdf_graph.get_known_uri($str158$rdfs_subPropertyOf);
        }
        return NIL;
    }

    public static SubLObject has_known_uriP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = rdf_graph.get_known_uri(v_object);
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
        return result;
    }

    public static SubLObject owl_exporter2_modify_graph(final SubLObject exporter) {
        owl_exporter2_add_extra_triples(exporter);
        if (NIL != owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED)) {
            owl_exporter2_add_opencyc_ontology(exporter);
        }
        return exporter;
    }

    public static SubLObject owl_exporter2_add_extra_triples(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject same_as = rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name($$$sameAs), UNPROVIDED, UNPROVIDED);
        final SubLObject add_same_as_triples = owl_exporter2_get_option(exporter, $SAME_AS_URIS, UNPROVIDED);
        SubLObject subjects = NIL;
        final SubLObject done_subjects = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject iterator_var = rdf_graph.rdf_graph_triples_iterator(v_graph);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject triple = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject subject = rdf_triple.rdf_triple_subject(triple);
                if ((NIL != set.set_add(subject, done_subjects)) && (NIL == rdf_blank_node.rdf_blank_node_p(subject))) {
                    subjects = cons(subject, subjects);
                }
            }
        }
        final SubLObject list_var = subjects;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Adding_additional_triples_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(subjects)), $str231$_nodes___ }) ? cconcatenate($$$Adding_additional_triples_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(subjects)), $str231$_nodes___ }) : $$$cdolist, thread);
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
                SubLObject subject2 = NIL;
                subject2 = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject subject_term = gethash(subject2, $owl_export_subject_node_to_term_hash$.getDynamicValue(thread), UNPROVIDED);
                    if (NIL != forts.fort_p(subject_term)) {
                        if (NIL != add_same_as_triples) {
                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(subject_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject uri_string = NIL;
                            uri_string = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL != web_utilities.uri_p(uri_string, UNPROVIDED)) {
                                    final SubLObject v_object = rdf_uri.get_rdf_uri(uri_string, UNPROVIDED, UNPROVIDED);
                                    if (NIL == rdf_graph.rdf_nodes_equalP(subject2, v_object)) {
                                        rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string, UNPROVIDED, UNPROVIDED));
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                uri_string = cdolist_list_var.first();
                            } 
                            if ((NIL != list_utilities.member_eqP($OPENCYC, add_same_as_triples)) && (NIL != owl_exporter2_fort_has_exported_owl_opencyc_contentP(exporter, subject_term))) {
                                final SubLObject uri_string2 = owl_cycl_to_xml.owl_opencyc_readable_uri_for_fort(subject_term, UNPROVIDED);
                                if ((NIL != rdf_blank_node.rdf_blank_node_p(subject2)) || (NIL == Strings.stringE(uri_string2, rdf_uri.rdf_uri_utf8_string(subject2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string2, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            if ((NIL != list_utilities.member_eqP($OPENCYC_VERSIONED, add_same_as_triples)) && (NIL != owl_exporter2_fort_has_exported_owl_opencyc_contentP(exporter, subject_term))) {
                                final SubLObject uri_string2 = owl_cycl_to_xml.owl_opencyc_versioned_uri_for_fort(subject_term, UNPROVIDED);
                                if ((NIL != rdf_blank_node.rdf_blank_node_p(subject2)) || (NIL == Strings.stringE(uri_string2, rdf_uri.rdf_uri_utf8_string(subject2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string2, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            if ((NIL != list_utilities.member_eqP($OPENCYC_UNVERSIONED, add_same_as_triples)) && (NIL != owl_exporter2_fort_has_exported_owl_opencyc_contentP(exporter, subject_term))) {
                                final SubLObject uri_string2 = owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(subject_term);
                                if ((NIL != rdf_blank_node.rdf_blank_node_p(subject2)) || (NIL == Strings.stringE(uri_string2, rdf_uri.rdf_uri_utf8_string(subject2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string2, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            if (NIL != list_utilities.member_eqP($CYC, add_same_as_triples)) {
                                final SubLObject uri_string2 = owl_cycl_to_xml.owl_cyc_latest_uri_for_fort(subject_term);
                                if ((NIL != rdf_blank_node.rdf_blank_node_p(subject2)) || (NIL == Strings.stringE(uri_string2, rdf_uri.rdf_uri_utf8_string(subject2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string2, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            if (NIL != list_utilities.member_eqP($DBPEDIA, add_same_as_triples)) {
                                final SubLObject _prev_bind_0_$45 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$46 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                    mt_relevance_macros.$mt$.bind(narts_high.find_nart($list236), thread);
                                    final SubLObject uri_string3 = kb_mapping_utilities.fpred_value(subject_term, $$rdfURI, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (uri_string3.isString()) {
                                        rdf_graph.rdf_graph_add_triple(v_graph, subject2, same_as, rdf_uri.get_rdf_uri(uri_string3, UNPROVIDED, UNPROVIDED));
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$46, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                        }
                        if (NIL != owl_exporter2_get_option(exporter, $ADD_COMMENTS, UNPROVIDED)) {
                            final SubLObject comment_node = owl_exporter2_find_node_for_term(exporter, $$comment, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_value_gafs(subject_term, $$comment, UNPROVIDED, UNPROVIDED);
                            SubLObject comment_assertion = NIL;
                            comment_assertion = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject lang = get_language_code_for_mt(assertions_high.assertion_mt(comment_assertion));
                                final SubLObject raw_comment_string = assertions_high.gaf_arg2(comment_assertion);
                                final SubLObject _prev_bind_0_$46 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$47 = owlification.$asent_to_owl_cyclify$.currentBinding(thread);
                                try {
                                    owl_uris_and_prefixes.$owl_export_version_date$.bind($UNVERSIONED == owl_exporter2_get_option(exporter, $kw41$OPENCYC_EXPORT_, UNPROVIDED) ? NIL : owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue(thread), thread);
                                    owlification.$asent_to_owl_cyclify$.bind(list($$comment, subject_term, raw_comment_string), thread);
                                    final SubLObject comment_string = owlification.owl_cyclify_string_with_constant_references(raw_comment_string, UNPROVIDED);
                                    SubLObject comment_cdata_string = NIL;
                                    SubLObject stream = NIL;
                                    try {
                                        stream = make_private_string_output_stream();
                                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_stream$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_stream$.bind(stream, thread);
                                            xml_utilities.xml_cdata(comment_string);
                                        } finally {
                                            xml_vars.$xml_stream$.rebind(_prev_bind_0_$47, thread);
                                        }
                                        comment_cdata_string = get_output_stream_string(stream);
                                    } finally {
                                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            close(stream, UNPROVIDED);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                    rdf_graph.rdf_graph_add_triple(v_graph, subject2, comment_node, rdf_literal.new_rdf_string_literal(comment_cdata_string, lang));
                                } finally {
                                    owlification.$asent_to_owl_cyclify$.rebind(_prev_bind_1_$47, thread);
                                    owl_uris_and_prefixes.$owl_export_version_date$.rebind(_prev_bind_0_$46, thread);
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                comment_assertion = cdolist_list_var2.first();
                            } 
                        }
                        final SubLObject _prev_bind_0_$49 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                        try {
                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$50 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                            try {
                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                final SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$51 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        final SubLObject new_or_reused = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$52 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                            final SubLObject _prev_bind_0_$53 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                try {
                                                    if (NIL != owl_exporter2_get_option(exporter, $ADD_PRETTY_STRINGS, UNPROVIDED)) {
                                                        final SubLObject pretty_string_node = owl_exporter2_find_node_for_term(exporter, $$prettyString, UNPROVIDED, UNPROVIDED);
                                                        SubLObject cdolist_list_var3 = owlification.owl_get_all_pretty_strings(subject_term);
                                                        SubLObject pretty_string = NIL;
                                                        pretty_string = cdolist_list_var3.first();
                                                        while (NIL != cdolist_list_var3) {
                                                            rdf_graph.rdf_graph_add_triple(v_graph, subject2, pretty_string_node, rdf_literal.new_rdf_string_literal(pretty_string, $$$en));
                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                            pretty_string = cdolist_list_var3.first();
                                                        } 
                                                    }
                                                    if (NIL != owl_exporter2_get_option(exporter, $ADD_PRETTY_STRING_CANONICAL, UNPROVIDED)) {
                                                        final SubLObject pretty_string_canonical_node = owl_exporter2_find_node_for_term(exporter, $$prettyString_Canonical, UNPROVIDED, UNPROVIDED);
                                                        final SubLObject pretty_string_canonical = owlification.owl_get_pretty_string_canonical(subject_term);
                                                        if (NIL != string_utilities.non_empty_stringP(pretty_string_canonical)) {
                                                            rdf_graph.rdf_graph_add_triple(v_graph, subject2, pretty_string_canonical_node, rdf_literal.new_rdf_string_literal(pretty_string_canonical, $$$en));
                                                        }
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$53, thread);
                                            }
                                        } finally {
                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$52, thread);
                                        }
                                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$51, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    subject2 = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
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
        return exporter;
    }

    public static SubLObject get_language_code_for_mt(final SubLObject mt) {
        final SubLObject language_term = lexicon_utilities.language_of_lexicon(mt);
        final SubLObject code = (NIL != language_term) ? lexicon_utilities.get_code_for_language(language_term) : NIL;
        return code;
    }

    public static SubLObject owl_exporter2_add_opencyc_ontology(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject ontology_node = rdf_uri.get_rdf_uri(owl_exporter2_get_option(exporter, $ONTOLOGY_TERM, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject export_entire_kbP = owl_exporter2_get_option(exporter, $kw127$EXPORT_ENTIRE_KB_, UNPROVIDED);
        final SubLObject v_forts = owl_exporter2_terms(exporter);
        rdf_graph.rdf_graph_note_topic(v_graph, ontology_node);
        rdf_graph.rdf_graph_add_triple(v_graph, ontology_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str213$owl_Ontology));
        rdf_graph.rdf_graph_add_triple(v_graph, ontology_node, rdf_graph.get_known_uri($str244$owl_versionInfo), rdf_literal.new_rdf_string_literal(owl_cycl_to_xml.$owl_export_version_string$.getDynamicValue(thread), UNPROVIDED));
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject ontology_comment = string_utilities.read_string_from_file(owl_cycl_to_xml.$owl_ontology_comment_file$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL != string_utilities.non_empty_stringP(ontology_comment)) {
                        rdf_graph.rdf_graph_add_triple(v_graph, ontology_node, rdf_graph.get_known_uri($str160$rdfs_comment), rdf_literal.new_rdf_string_literal(ontology_comment, $$$en));
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
        final SubLObject _prev_bind_2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$59 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$60 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$61 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$62 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    if (NIL != export_entire_kbP) {
                                        final SubLObject message = cconcatenate($str245$Adding_rdf_label_triples_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(forts.fort_count()), $$$_FORTs });
                                        final SubLObject total = forts.fort_count();
                                        SubLObject sofar = ZERO_INTEGER;
                                        final SubLObject _prev_bind_0_$63 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            try {
                                                noting_percent_progress_preamble(message);
                                                SubLObject cdolist_list_var = forts.do_forts_tables();
                                                SubLObject table_var = NIL;
                                                table_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject idx = table_var;
                                                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                                        final SubLObject idx_$64 = idx;
                                                        if (NIL == id_index_dense_objects_empty_p(idx_$64, $SKIP)) {
                                                            final SubLObject vector_var = id_index_dense_objects(idx_$64);
                                                            final SubLObject backwardP_var = NIL;
                                                            SubLObject length;
                                                            SubLObject v_iteration;
                                                            SubLObject id;
                                                            SubLObject fort;
                                                            SubLObject node;
                                                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                                fort = aref(vector_var, id);
                                                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                    if (NIL != id_index_tombstone_p(fort)) {
                                                                        fort = $SKIP;
                                                                    }
                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                    note_percent_progress(sofar, total);
                                                                    node = owl_exporter2_find_node_for_term(exporter, fort, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node, rdf_graph.get_known_uri($str247$rdf_label), rdf_literal.new_rdf_string_literal(owlification.owl_preferred_english_for_term(fort), $$$en));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject idx_$65 = idx;
                                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$65)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                            final SubLObject sparse = id_index_sparse_objects(idx_$65);
                                                            SubLObject id2 = id_index_sparse_id_threshold(idx_$65);
                                                            final SubLObject end_id = id_index_next_id(idx_$65);
                                                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                            while (id2.numL(end_id)) {
                                                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                    note_percent_progress(sofar, total);
                                                                    final SubLObject node2 = owl_exporter2_find_node_for_term(exporter, fort2, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node2)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node2, rdf_graph.get_known_uri($str247$rdf_label), rdf_literal.new_rdf_string_literal(owlification.owl_preferred_english_for_term(fort2), $$$en));
                                                                    }
                                                                }
                                                                id2 = add(id2, ONE_INTEGER);
                                                            } 
                                                        }
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    table_var = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_$63, thread);
                                        }
                                    } else {
                                        final SubLObject list_var = v_forts;
                                        final SubLObject _prev_bind_0_$65 = $progress_note$.currentBinding(thread);
                                        final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
                                        final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
                                        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $progress_note$.bind(NIL != cconcatenate($str245$Adding_rdf_label_triples_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) ? cconcatenate($str245$Adding_rdf_label_triples_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) : $$$cdolist, thread);
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
                                                SubLObject fort3 = NIL;
                                                fort3 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    final SubLObject node3 = owl_exporter2_find_node_for_term(exporter, fort3, T, UNPROVIDED);
                                                    if (NIL != rdf_uri.rdf_uri_p(node3)) {
                                                        rdf_graph.rdf_graph_add_triple(v_graph, node3, rdf_graph.get_known_uri($str247$rdf_label), rdf_literal.new_rdf_string_literal(owlification.owl_preferred_english_for_term(fort3), $$$en));
                                                    }
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    csome_list_var = csome_list_var.rest();
                                                    fort3 = csome_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
                                            $progress_sofar$.rebind(_prev_bind_8, thread);
                                            $progress_total$.rebind(_prev_bind_7, thread);
                                            $progress_start_time$.rebind(_prev_bind_6, thread);
                                            $progress_note$.rebind(_prev_bind_0_$65, thread);
                                        }
                                    }
                                    SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
                                    if (NIL == assoc(owl_uris_and_prefixes.cyc_annotation_prefix(), prefix_map, $sym248$STRING_, UNPROVIDED)) {
                                        final SubLObject item_var = cons(cconcatenate($str249$xmlns_, owl_uris_and_prefixes.cyc_annotation_prefix()), owl_uris_and_prefixes.cyc_annotation_base_uri());
                                        if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            prefix_map = cons(item_var, prefix_map);
                                        }
                                        rdf_graph.rdf_graph_note_namespace_prefixes(v_graph, prefix_map);
                                    }
                                    final SubLObject external_id_node_string = $$$externalID;
                                    final SubLObject external_id_node = rdf_uri.get_rdf_uri(cconcatenate(owl_uris_and_prefixes.cyc_annotation_base_uri(), external_id_node_string), UNPROVIDED, UNPROVIDED);
                                    final SubLObject external_id_comment = list_utilities.alist_lookup(owl_cycl_to_xml.$cyc_annotation_properties$.getGlobalValue(), external_id_node_string, $sym248$STRING_, UNPROVIDED).first();
                                    rdf_graph.rdf_graph_add_triple(v_graph, external_id_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str251$owl_AnnotationProperty));
                                    rdf_graph.rdf_graph_add_triple(v_graph, external_id_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str252$owl_FunctionalProperty));
                                    rdf_graph.rdf_graph_add_triple(v_graph, external_id_node, rdf_graph.get_known_uri($str247$rdf_label), rdf_literal.new_rdf_string_literal(external_id_node_string, $$$en));
                                    rdf_graph.rdf_graph_add_triple(v_graph, external_id_node, rdf_graph.get_known_uri($str160$rdfs_comment), rdf_literal.new_rdf_string_literal(external_id_comment, $$$en));
                                    if (NIL != export_entire_kbP) {
                                        final SubLObject message2 = cconcatenate($str253$Adding_cycAnnot_externalID_triple, new SubLObject[]{ format_nil.format_nil_a_no_copy(forts.fort_count()), $$$_FORTs });
                                        final SubLObject total2 = forts.fort_count();
                                        SubLObject sofar2 = ZERO_INTEGER;
                                        final SubLObject _prev_bind_0_$67 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_13 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_14 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_15 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            try {
                                                noting_percent_progress_preamble(message2);
                                                SubLObject cdolist_list_var2 = forts.do_forts_tables();
                                                SubLObject table_var2 = NIL;
                                                table_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject idx2 = table_var2;
                                                    if (NIL == id_index_objects_empty_p(idx2, $SKIP)) {
                                                        final SubLObject idx_$66 = idx2;
                                                        if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
                                                            final SubLObject vector_var2 = id_index_dense_objects(idx_$66);
                                                            final SubLObject backwardP_var2 = NIL;
                                                            SubLObject length2;
                                                            SubLObject v_iteration2;
                                                            SubLObject id3;
                                                            SubLObject fort4;
                                                            SubLObject node4;
                                                            for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                                                id3 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                                                fort4 = aref(vector_var2, id3);
                                                                if ((NIL == id_index_tombstone_p(fort4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                    if (NIL != id_index_tombstone_p(fort4)) {
                                                                        fort4 = $SKIP;
                                                                    }
                                                                    sofar2 = add(sofar2, ONE_INTEGER);
                                                                    note_percent_progress(sofar2, total2);
                                                                    node4 = owl_exporter2_find_node_for_term(exporter, fort4, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node4)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node4, external_id_node, rdf_literal.new_rdf_string_literal(owlification.owl_external_id_string(fort4), NIL));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject idx_$67 = idx2;
                                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$67)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                            final SubLObject sparse2 = id_index_sparse_objects(idx_$67);
                                                            SubLObject id = id_index_sparse_id_threshold(idx_$67);
                                                            final SubLObject end_id2 = id_index_next_id(idx_$67);
                                                            final SubLObject v_default2 = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                            while (id.numL(end_id2)) {
                                                                final SubLObject fort5 = gethash_without_values(id, sparse2, v_default2);
                                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort5))) {
                                                                    sofar2 = add(sofar2, ONE_INTEGER);
                                                                    note_percent_progress(sofar2, total2);
                                                                    final SubLObject node5 = owl_exporter2_find_node_for_term(exporter, fort5, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node5)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node5, external_id_node, rdf_literal.new_rdf_string_literal(owlification.owl_external_id_string(fort5), NIL));
                                                                    }
                                                                }
                                                                id = add(id, ONE_INTEGER);
                                                            } 
                                                        }
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    table_var2 = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_15, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_14, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_13, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    } else {
                                        final SubLObject list_var2 = v_forts;
                                        final SubLObject _prev_bind_0_$69 = $progress_note$.currentBinding(thread);
                                        final SubLObject _prev_bind_16 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_17 = $progress_total$.currentBinding(thread);
                                        final SubLObject _prev_bind_18 = $progress_sofar$.currentBinding(thread);
                                        final SubLObject _prev_bind_19 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_20 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_21 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_22 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $progress_note$.bind(NIL != cconcatenate($str253$Adding_cycAnnot_externalID_triple, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) ? cconcatenate($str253$Adding_cycAnnot_externalID_triple, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) : $$$cdolist, thread);
                                            $progress_start_time$.bind(get_universal_time(), thread);
                                            $progress_total$.bind(length(list_var2), thread);
                                            $progress_sofar$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            try {
                                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                SubLObject csome_list_var2 = list_var2;
                                                SubLObject fort6 = NIL;
                                                fort6 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject node6 = owl_exporter2_find_node_for_term(exporter, fort6, T, UNPROVIDED);
                                                    if (NIL != rdf_uri.rdf_uri_p(node6)) {
                                                        rdf_graph.rdf_graph_add_triple(v_graph, node6, external_id_node, rdf_literal.new_rdf_string_literal(owlification.owl_external_id_string(fort6), NIL));
                                                    }
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    fort6 = csome_list_var2.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_22, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_21, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_20, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_19, thread);
                                            $progress_sofar$.rebind(_prev_bind_18, thread);
                                            $progress_total$.rebind(_prev_bind_17, thread);
                                            $progress_start_time$.rebind(_prev_bind_16, thread);
                                            $progress_note$.rebind(_prev_bind_0_$69, thread);
                                        }
                                    }
                                    final SubLObject label_node_string = $$$label;
                                    final SubLObject label_node = rdf_uri.get_rdf_uri(cconcatenate(owl_uris_and_prefixes.cyc_annotation_base_uri(), label_node_string), UNPROVIDED, UNPROVIDED);
                                    final SubLObject label_comment = list_utilities.alist_lookup(owl_cycl_to_xml.$cyc_annotation_properties$.getGlobalValue(), label_node_string, $sym248$STRING_, UNPROVIDED).first();
                                    rdf_graph.rdf_graph_add_triple(v_graph, label_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str251$owl_AnnotationProperty));
                                    rdf_graph.rdf_graph_add_triple(v_graph, label_node, rdf_graph.get_known_uri($str154$rdf_type), rdf_graph.get_known_uri($str252$owl_FunctionalProperty));
                                    rdf_graph.rdf_graph_add_triple(v_graph, label_node, rdf_graph.get_known_uri($str247$rdf_label), rdf_literal.new_rdf_string_literal(label_node_string, $$$en));
                                    rdf_graph.rdf_graph_add_triple(v_graph, label_node, rdf_graph.get_known_uri($str160$rdfs_comment), rdf_literal.new_rdf_string_literal(label_comment, $$$en));
                                    if (NIL != export_entire_kbP) {
                                        final SubLObject message2 = cconcatenate($str255$Adding_cycAnnot_label_triples_for, new SubLObject[]{ format_nil.format_nil_a_no_copy(forts.fort_count()), $$$_FORTs });
                                        final SubLObject total2 = forts.fort_count();
                                        SubLObject sofar2 = ZERO_INTEGER;
                                        final SubLObject _prev_bind_0_$71 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_13 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_14 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_15 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            try {
                                                noting_percent_progress_preamble(message2);
                                                SubLObject cdolist_list_var2 = forts.do_forts_tables();
                                                SubLObject table_var2 = NIL;
                                                table_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject idx2 = table_var2;
                                                    if (NIL == id_index_objects_empty_p(idx2, $SKIP)) {
                                                        final SubLObject idx_$68 = idx2;
                                                        if (NIL == id_index_dense_objects_empty_p(idx_$68, $SKIP)) {
                                                            final SubLObject vector_var2 = id_index_dense_objects(idx_$68);
                                                            final SubLObject backwardP_var2 = NIL;
                                                            SubLObject length2;
                                                            SubLObject v_iteration2;
                                                            SubLObject id3;
                                                            SubLObject fort4;
                                                            SubLObject node4;
                                                            for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                                                id3 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                                                fort4 = aref(vector_var2, id3);
                                                                if ((NIL == id_index_tombstone_p(fort4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                    if (NIL != id_index_tombstone_p(fort4)) {
                                                                        fort4 = $SKIP;
                                                                    }
                                                                    sofar2 = add(sofar2, ONE_INTEGER);
                                                                    note_percent_progress(sofar2, total2);
                                                                    node4 = owl_exporter2_find_node_for_term(exporter, fort4, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node4)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node4, label_node, rdf_literal.new_rdf_string_literal(owlification.owl_fort_cyc_name(fort4), NIL));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject idx_$69 = idx2;
                                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$69)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                            final SubLObject sparse2 = id_index_sparse_objects(idx_$69);
                                                            SubLObject id = id_index_sparse_id_threshold(idx_$69);
                                                            final SubLObject end_id2 = id_index_next_id(idx_$69);
                                                            final SubLObject v_default2 = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                            while (id.numL(end_id2)) {
                                                                final SubLObject fort5 = gethash_without_values(id, sparse2, v_default2);
                                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort5))) {
                                                                    sofar2 = add(sofar2, ONE_INTEGER);
                                                                    note_percent_progress(sofar2, total2);
                                                                    final SubLObject node5 = owl_exporter2_find_node_for_term(exporter, fort5, T, UNPROVIDED);
                                                                    if (NIL != rdf_uri.rdf_uri_p(node5)) {
                                                                        rdf_graph.rdf_graph_add_triple(v_graph, node5, label_node, rdf_literal.new_rdf_string_literal(owlification.owl_fort_cyc_name(fort5), NIL));
                                                                    }
                                                                }
                                                                id = add(id, ONE_INTEGER);
                                                            } 
                                                        }
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    table_var2 = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values5 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values5);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_15, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_14, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_13, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_$71, thread);
                                        }
                                    } else {
                                        final SubLObject list_var2 = v_forts;
                                        final SubLObject _prev_bind_0_$73 = $progress_note$.currentBinding(thread);
                                        final SubLObject _prev_bind_16 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_17 = $progress_total$.currentBinding(thread);
                                        final SubLObject _prev_bind_18 = $progress_sofar$.currentBinding(thread);
                                        final SubLObject _prev_bind_19 = $last_percent_progress_index$.currentBinding(thread);
                                        final SubLObject _prev_bind_20 = $last_percent_progress_prediction$.currentBinding(thread);
                                        final SubLObject _prev_bind_21 = $within_noting_percent_progress$.currentBinding(thread);
                                        final SubLObject _prev_bind_22 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $progress_note$.bind(NIL != cconcatenate($str255$Adding_cycAnnot_label_triples_for, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) ? cconcatenate($str255$Adding_cycAnnot_label_triples_for, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(v_forts)), $$$_FORTs }) : $$$cdolist, thread);
                                            $progress_start_time$.bind(get_universal_time(), thread);
                                            $progress_total$.bind(length(list_var2), thread);
                                            $progress_sofar$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            try {
                                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                SubLObject csome_list_var2 = list_var2;
                                                SubLObject fort6 = NIL;
                                                fort6 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject node6 = owl_exporter2_find_node_for_term(exporter, fort6, T, UNPROVIDED);
                                                    if (NIL != rdf_uri.rdf_uri_p(node6)) {
                                                        rdf_graph.rdf_graph_add_triple(v_graph, node6, label_node, rdf_literal.new_rdf_string_literal(owlification.owl_preferred_english_for_term(fort6), $$$en));
                                                    }
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    fort6 = csome_list_var2.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values6 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values6);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_22, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_21, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_20, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_19, thread);
                                            $progress_sofar$.rebind(_prev_bind_18, thread);
                                            $progress_total$.rebind(_prev_bind_17, thread);
                                            $progress_start_time$.rebind(_prev_bind_16, thread);
                                            $progress_note$.rebind(_prev_bind_0_$73, thread);
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values7 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values7);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$62, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$61, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$60, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values8 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values8);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$59, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_2, thread);
        }
        SubLObject list_var3 = rdf_graph.rdf_graph_find_object_triples(v_graph, rdf_graph.get_known_uri($str223$owl_Thing), rdf_graph.get_known_uri($str168$rdfs_range));
        SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_23 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_24 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_25 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_26 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_27 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_28 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_29 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str256$Removing__rdfs_range__X_owl_Thing, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var3), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var3 = list_var3;
                SubLObject triple = NIL;
                triple = csome_list_var3.first();
                while (NIL != csome_list_var3) {
                    rdf_graph.rdf_graph_remove_known_triple(v_graph, triple);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var3 = csome_list_var3.rest();
                    triple = csome_list_var3.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values9 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values9);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_29, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_28, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_27, thread);
            $last_percent_progress_index$.rebind(_prev_bind_26, thread);
            $progress_sofar$.rebind(_prev_bind_25, thread);
            $progress_total$.rebind(_prev_bind_24, thread);
            $progress_start_time$.rebind(_prev_bind_23, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        list_var3 = rdf_graph.rdf_graph_find_object_triples(v_graph, rdf_graph.get_known_uri($str223$owl_Thing), rdf_graph.get_known_uri($str166$rdfs_domain));
        _prev_bind_0 = $progress_note$.currentBinding(thread);
        _prev_bind_23 = $progress_start_time$.currentBinding(thread);
        _prev_bind_24 = $progress_total$.currentBinding(thread);
        _prev_bind_25 = $progress_sofar$.currentBinding(thread);
        _prev_bind_26 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_27 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_28 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_29 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str257$Removing__rdfs_domain__X_owl_Thin, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var3), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var3 = list_var3;
                SubLObject triple = NIL;
                triple = csome_list_var3.first();
                while (NIL != csome_list_var3) {
                    rdf_graph.rdf_graph_remove_known_triple(v_graph, triple);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var3 = csome_list_var3.rest();
                    triple = csome_list_var3.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values10 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values10);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_29, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_28, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_27, thread);
            $last_percent_progress_index$.rebind(_prev_bind_26, thread);
            $progress_sofar$.rebind(_prev_bind_25, thread);
            $progress_total$.rebind(_prev_bind_24, thread);
            $progress_start_time$.rebind(_prev_bind_23, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_add_rdf_graph_prefix_map(final SubLObject exporter) {
        final SubLObject ontology_term = owl_exporter2_ontology(exporter);
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject base_uri = owl_exporter2_get_option(exporter, $BASE_URI, UNPROVIDED);
        SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
        if (NIL != string_utilities.non_empty_stringP(base_uri)) {
            final SubLObject item_var = cons($str258$base_uri, base_uri);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL != forts.fort_p(ontology_term)) {
            rdf_graph.rdf_graph_note_topic(v_graph, owl_exporter2_find_node_for_term(exporter, ontology_term, T, UNPROVIDED));
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_any_mt(ontology_term, $$nameSpacePrefixForSKS, ONE_INTEGER, $list261, UNPROVIDED);
            SubLObject prefix_uri_nart_pair = NIL;
            prefix_uri_nart_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject prefix_string = prefix_uri_nart_pair.first();
                final SubLObject uri_string = kb_mapping_utilities.fpred_value(second(prefix_uri_nart_pair), $$uriString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != string_utilities.empty_string_p(prefix_string)) {
                    final SubLObject item_var2 = cons($$$xmlns, uri_string);
                    if (NIL == member(item_var2, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                        prefix_map = cons(item_var2, prefix_map);
                    }
                } else {
                    final SubLObject item_var2 = cons(cconcatenate($str249$xmlns_, prefix_string), uri_string);
                    if (NIL == member(item_var2, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                        prefix_map = cons(item_var2, prefix_map);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                prefix_uri_nart_pair = cdolist_list_var.first();
            } 
        }
        if (NIL == assoc($$$rdf, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$rdf), $str263$http___www_w3_org_1999_02_22_rdf_);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL == assoc($$$owl, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$owl), $str265$http___www_w3_org_2002_07_owl_);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL == assoc($$$rdfs, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$rdfs), $str267$http___www_w3_org_2000_01_rdf_sch);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL == assoc($$$xsd, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$xsd), $str269$http___www_w3_org_2001_XMLSchema_);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL == assoc($$$opencyc, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$opencyc), owl_uris_and_prefixes.owl_english_opencyc_base_uri(UNPROVIDED));
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        if (NIL == assoc($$$mycyc, prefix_map, $sym248$STRING_, UNPROVIDED)) {
            final SubLObject item_var = cons(cconcatenate($str249$xmlns_, $$$mycyc), $str272$http___sw_cyc_com_concept_);
            if (NIL == member(item_var, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var, prefix_map);
            }
        }
        final SubLObject default_namespace_uri_string = owl_exporter2_get_option(exporter, $DEFAULT_NAMESPACE_URI, UNPROVIDED);
        if (NIL != web_utilities.uri_p(default_namespace_uri_string, UNPROVIDED)) {
            final SubLObject item_var3 = cons($$$xmlns, default_namespace_uri_string);
            if (NIL == member(item_var3, prefix_map, symbol_function(EQL), symbol_function(IDENTITY))) {
                prefix_map = cons(item_var3, prefix_map);
            }
        }
        rdf_graph.rdf_graph_note_namespace_prefixes(v_graph, prefix_map);
        return NIL;
    }

    public static SubLObject owl_exporter2_output_to_stream(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_amount$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_amount$.bind(FOUR_INTEGER, thread);
            owl_exporter2_export_rdf_graph_to_stream(exporter);
        } finally {
            xml_utilities.$xml_indentation_amount$.rebind(_prev_bind_0, thread);
        }
        return exporter;
    }

    public static SubLObject owl_export_exported_tripleP(final SubLObject triple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        if (NIL != keyhash.getkeyhash(list(rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_object(triple)), $owl_export_exported_triples$.getDynamicValue(thread))) {
            foundP = T;
        }
        if (((NIL == foundP) && (NIL != rdf_graph.rdf_node_symmetric_predicateP(rdf_triple.rdf_triple_predicate(triple)))) && (NIL != keyhash.getkeyhash(list(rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_object(triple), rdf_triple.rdf_triple_subject(triple)), $owl_export_exported_triples$.getDynamicValue(thread)))) {
            foundP = T;
        }
        return foundP;
    }

    public static SubLObject owl_export_note_exported_triple(final SubLObject triple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        keyhash.setkeyhash(list(rdf_triple.rdf_triple_predicate(triple), rdf_triple.rdf_triple_subject(triple), rdf_triple.rdf_triple_object(triple)), $owl_export_exported_triples$.getDynamicValue(thread));
        return triple;
    }

    public static SubLObject owl_export_exported_focal_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (node.isString()) {
            Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return keyhash.getkeyhash(node, $owl_export_exported_focal_nodes$.getDynamicValue(thread));
    }

    public static SubLObject owl_export_note_exported_focal_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        keyhash.setkeyhash(node, $owl_export_exported_focal_nodes$.getDynamicValue(thread));
        return node;
    }

    public static SubLObject owl_exporter2_focal_nodeP(final SubLObject exporter, final SubLObject node) {
        return subl_promotions.memberP(node, rdf_graph.rdf_graph_focal_nodes(owl_exporter2_graph(exporter)), $sym273$RDF_NODES_EQUAL_, UNPROVIDED);
    }

    public static SubLObject owl_exporter2_export_rdf_graph_to_stream(final SubLObject exporter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject stream = owl_exporter2_get_option(exporter, $OUTPUT_STREAM, UNPROVIDED);
        final SubLObject _prev_bind_0 = $owl_export_exported_triples$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $owl_export_exported_focal_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $owl_export_additional_export_terms$.currentBinding(thread);
        try {
            $owl_export_exported_triples$.bind(keyhash.new_keyhash(rdf_graph.rdf_graph_triple_count(v_graph), symbol_function(EQUAL)), thread);
            $owl_export_exported_focal_nodes$.bind(keyhash.new_keyhash(rdf_graph.rdf_graph_triple_count(v_graph), symbol_function(EQUAL)), thread);
            $owl_export_additional_export_terms$.bind(NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$85 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$86 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(stream, thread);
                        xml_utilities.xml_header(xml_utilities.$xml_version$.getDynamicValue(thread), $str274$UTF_8, UNPROVIDED);
                        owl_cycl_to_xml.write_rdf_doctype_declaration(rdf_graph.rdf_graph_prefix_map(v_graph));
                        SubLObject xmlns_plist = owl_utilities.rdf_graph_xmlns_plist(v_graph);
                        final SubLObject base_uri = owl_exporter2_get_option(exporter, $BASE_URI, UNPROVIDED);
                        if (NIL != web_utilities.uri_p(base_uri, UNPROVIDED)) {
                            xmlns_plist = putf(xmlns_plist, $str275$xml_base, base_uri);
                        }
                        try {
                            final SubLObject _prev_bind_0_$87 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$88 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str276$rdf_RDF), xmlns_plist, NIL, T, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    final SubLObject ontology_node = rdf_graph.rdf_graph_topic(v_graph);
                                    SubLObject ontology_triples = NIL;
                                    if (NIL != rdf_uri.rdf_uri_p(ontology_node)) {
                                        SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subject_triples(v_graph, ontology_node, UNPROVIDED);
                                        SubLObject ontology_triple = NIL;
                                        ontology_triple = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if ((NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(ontology_triple), rdf_graph.get_known_uri($str154$rdf_type))) && (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(ontology_triple), rdf_graph.get_known_uri($str213$owl_Ontology)))) {
                                                owl_export_note_exported_triple(ontology_triple);
                                            } else {
                                                ontology_triples = cons(ontology_triple, ontology_triples);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            ontology_triple = cdolist_list_var.first();
                                        } 
                                        owl_exporter2_export_rdf_subject_node_to_stream_int(exporter, ontology_node, rdf_graph.get_known_uri($str213$owl_Ontology));
                                        owl_export_note_exported_focal_node(ontology_node);
                                    }
                                    final SubLObject _prev_bind_0_$89 = rdf_graph.$rdf_graph_converted_triples$.currentBinding(thread);
                                    try {
                                        rdf_graph.$rdf_graph_converted_triples$.bind(NIL, thread);
                                        final SubLObject owl_types = $list278;
                                        SubLObject cdolist_list_var2;
                                        final SubLObject all_types = cdolist_list_var2 = owl_types;
                                        SubLObject owl_type = NIL;
                                        owl_type = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            owl_exporter2_export_rdf_nodes_of_type_to_stream(exporter, owl_type);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            owl_type = cdolist_list_var2.first();
                                        } 
                                        SubLObject description_nodes = NIL;
                                        SubLObject list_var = rdf_graph.rdf_graph_focal_nodes(v_graph);
                                        final SubLObject _prev_bind_0_$90 = $progress_note$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$89 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$93 = $progress_total$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                                        SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $progress_note$.bind($str279$Finding_unexported_nodes___, thread);
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
                                                SubLObject node = NIL;
                                                node = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if (NIL == owl_export_exported_focal_nodeP(node)) {
                                                        description_nodes = cons(node, description_nodes);
                                                    }
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    csome_list_var = csome_list_var.rest();
                                                    node = csome_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                                            $progress_sofar$.rebind(_prev_bind_4, thread);
                                            $progress_total$.rebind(_prev_bind_2_$93, thread);
                                            $progress_start_time$.rebind(_prev_bind_1_$89, thread);
                                            $progress_note$.rebind(_prev_bind_0_$90, thread);
                                        }
                                        list_var = description_nodes;
                                        final SubLObject _prev_bind_0_$92 = $progress_note$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$90 = $progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$94 = $progress_total$.currentBinding(thread);
                                        _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                                        _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                                        _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                                        _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                                        _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $progress_note$.bind(NIL != format(NIL, $str280$Exporting__A_owl_Description_node, length(description_nodes)) ? format(NIL, $str280$Exporting__A_owl_Description_node, length(description_nodes)) : $$$cdolist, thread);
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
                                                SubLObject node = NIL;
                                                node = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    final SubLObject _prev_bind_0_$93 = $owl_export_exporting_focal_nodeP$.currentBinding(thread);
                                                    try {
                                                        $owl_export_exporting_focal_nodeP$.bind(node, thread);
                                                        xml_utilities.xml_terpri();
                                                        owl_exporter2_export_rdf_subject_node_to_stream(exporter, node, UNPROVIDED);
                                                        owl_export_note_exported_focal_node(node);
                                                    } finally {
                                                        $owl_export_exporting_focal_nodeP$.rebind(_prev_bind_0_$93, thread);
                                                    }
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    csome_list_var = csome_list_var.rest();
                                                    node = csome_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    noting_percent_progress_postamble();
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                                                }
                                            }
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                                            $progress_sofar$.rebind(_prev_bind_4, thread);
                                            $progress_total$.rebind(_prev_bind_2_$94, thread);
                                            $progress_start_time$.rebind(_prev_bind_1_$90, thread);
                                            $progress_note$.rebind(_prev_bind_0_$92, thread);
                                        }
                                    } finally {
                                        rdf_graph.$rdf_graph_converted_triples$.rebind(_prev_bind_0_$89, thread);
                                    }
                                    xml_utilities.xml_terpri();
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$88, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$88, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$87, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, $str276$rdf_RDF));
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$86, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$85, thread);
            }
        } finally {
            $owl_export_additional_export_terms$.rebind(_prev_bind_3, thread);
            $owl_export_exported_focal_nodes$.rebind(_prev_bind_2, thread);
            $owl_export_exported_triples$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_export_rdf_nodes_of_type_to_stream(final SubLObject exporter, final SubLObject owl_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject rdf_type_node = rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED);
        final SubLObject type_node = rdf_graph.get_known_uri(owl_type);
        final SubLObject type_triples = rdf_graph.rdf_graph_find_object_triples_canonical(v_graph, type_node, rdf_type_node);
        final SubLObject subject_nodes = Mapping.mapcar(RDF_TRIPLE_SUBJECT, type_triples);
        if (NIL != subject_nodes) {
            SubLObject export_nodes = NIL;
            SubLObject cdolist_list_var = subject_nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == rdf_blank_node.rdf_blank_node_p(node)) {
                    export_nodes = cons(node, export_nodes);
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
            final SubLObject list_var;
            export_nodes = list_var = nreverse(export_nodes);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != format(NIL, $str283$Exporting__A__A_node__p, length(subject_nodes), owl_type) ? format(NIL, $str283$Exporting__A__A_node__p, length(subject_nodes), owl_type) : $$$cdolist, thread);
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
                    SubLObject subject_node = NIL;
                    subject_node = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject _prev_bind_0_$102 = $owl_export_exporting_focal_nodeP$.currentBinding(thread);
                        try {
                            $owl_export_exporting_focal_nodeP$.bind(subject_node, thread);
                            owl_exporter2_export_rdf_subject_node_to_stream_int(exporter, subject_node, type_node);
                            owl_export_note_exported_focal_node(subject_node);
                        } finally {
                            $owl_export_exporting_focal_nodeP$.rebind(_prev_bind_0_$102, thread);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        subject_node = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
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
        }
        final SubLObject list_var2 = subject_nodes;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != format(NIL, $str284$Exporting__A__A_node__p__blank_, length(subject_nodes), owl_type) ? format(NIL, $str284$Exporting__A__A_node__p__blank_, length(subject_nodes), owl_type) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var2), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject subject_node2 = NIL;
                subject_node2 = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    if ((NIL != rdf_blank_node.rdf_blank_node_p(subject_node2)) && (NIL == owl_export_exported_focal_nodeP(subject_node2))) {
                        final SubLObject _prev_bind_0_$104 = $owl_export_exporting_focal_nodeP$.currentBinding(thread);
                        try {
                            $owl_export_exporting_focal_nodeP$.bind(subject_node2, thread);
                            owl_exporter2_export_rdf_subject_node_to_stream_int(exporter, subject_node2, type_node);
                            owl_export_note_exported_focal_node(subject_node2);
                        } finally {
                            $owl_export_exporting_focal_nodeP$.rebind(_prev_bind_0_$104, thread);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    subject_node2 = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_export_rdf_subject_node_to_stream_int(final SubLObject exporter, final SubLObject subject_node, final SubLObject type_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        SubLObject subject_triples = remove_if($sym285$OWL_EXPORT_EXPORTED_TRIPLE_, rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, subject_node, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject type_triples = NIL;
        SubLObject subject_triples_without_type = NIL;
        SubLObject cdolist_list_var = subject_triples;
        SubLObject subject_triple = NIL;
        subject_triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_object(subject_triple), type_node)) {
                type_triples = cons(subject_triple, type_triples);
            } else {
                subject_triples_without_type = cons(subject_triple, subject_triples_without_type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subject_triple = cdolist_list_var.first();
        } 
        subject_triples = nreverse(subject_triples_without_type);
        if ((NIL != rdf_blank_node.rdf_blank_node_p(subject_node)) && (NIL == list_utilities.find_all_if_not($sym285$OWL_EXPORT_EXPORTED_TRIPLE_, type_triples, UNPROVIDED))) {
            return T;
        }
        SubLObject cdolist_list_var2 = type_triples;
        SubLObject type_triple = NIL;
        type_triple = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            owl_export_note_exported_triple(type_triple);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type_triple = cdolist_list_var2.first();
        } 
        xml_utilities.xml_terpri();
        xml_utilities.xml_terpri();
        if (NIL != xml_tag_abbrev(exporter, type_node)) {
            if ((NIL == rdf_blank_node.rdf_blank_node_p(subject_node)) || (NIL != $owl_export_exporting_focal_nodeP$.getDynamicValue(thread))) {
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, type_node), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), makeBoolean(NIL == subject_triples), NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$110 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            if (NIL != subject_triples) {
                                SubLObject cdolist_list_var3 = subject_triples;
                                SubLObject triple = NIL;
                                triple = cdolist_list_var3.first();
                                while (NIL != cdolist_list_var3) {
                                    owl_exporter2_export_rdf_triple_to_stream(exporter, triple);
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    triple = cdolist_list_var3.first();
                                } 
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$110, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != subject_triples) {
                            if (NIL != subject_triples) {
                                xml_utilities.xml_terpri();
                            }
                            xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, type_node));
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                return NIL;
            }
        }
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$111 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    final SubLObject _prev_bind_0_$112 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$108 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str154$rdf_type), owl_exporter2_xml_resource_attributes_for_node(exporter, type_node), T, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$113 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$113, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$108, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$112, thread);
                    }
                    if (NIL != subject_triples) {
                        owl_exporter2_export_rdf_subject_node_to_stream(exporter, subject_node, subject_triples);
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$111, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_xml_about_attributes_for_node(final SubLObject exporter, final SubLObject node) {
        return NIL != rdf_blank_node.rdf_blank_node_p(node) ? list(xml_tag_abbrev(exporter, $str287$rdf_nodeID), cconcatenate($$$A, rdf_blank_node.rdf_blank_node_id_string(node))) : list(xml_tag_abbrev(exporter, $str289$rdf_about), owl_exporter2_abbrevname_for_uri(exporter, node));
    }

    public static SubLObject owl_exporter2_xml_resource_attributes_for_node(final SubLObject exporter, final SubLObject node) {
        return NIL != rdf_blank_node.rdf_blank_node_p(node) ? list(xml_tag_abbrev(exporter, $str287$rdf_nodeID), cconcatenate($$$A, rdf_blank_node.rdf_blank_node_id_string(node))) : list(xml_tag_abbrev(exporter, $str290$rdf_resource), owl_exporter2_abbrevname_for_uri(exporter, node));
    }

    public static SubLObject owl_exporter2_export_rdf_subject_node_to_stream(final SubLObject exporter, final SubLObject subject_node, SubLObject subject_triples) {
        if (subject_triples == UNPROVIDED) {
            subject_triples = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != rdf_graph.valid_rdf_subject_p(subject_node) : "rdf_graph.valid_rdf_subject_p(subject_node) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject_node) " + subject_node;
        if (NIL != subject_triples) {
            final SubLObject list_var = subject_triples;
            assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assert NIL != rdf_triple.rdf_triple_p(elem, UNPROVIDED) : "rdf_triple.rdf_triple_p(elem, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_p(elem, CommonSymbols.UNPROVIDED) " + elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
        }
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        SubLObject type_triples = NIL;
        if (NIL == subject_triples) {
            subject_triples = remove_if($sym285$OWL_EXPORT_EXPORTED_TRIPLE_, rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, subject_node, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject subject_triples_without_type = NIL;
        SubLObject cdolist_list_var2 = subject_triples;
        SubLObject subject_triple = NIL;
        subject_triple = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != rdf_graph.rdf_nodes_equalP(rdf_triple.rdf_triple_predicate(subject_triple), rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED))) {
                type_triples = cons(subject_triple, type_triples);
            } else {
                subject_triples_without_type = cons(subject_triple, subject_triples_without_type);
            }
            subject_triples = subject_triples_without_type;
            cdolist_list_var2 = cdolist_list_var2.rest();
            subject_triple = cdolist_list_var2.first();
        } 
        if ((NIL == type_triples) && (NIL == subject_triples)) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$111 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$111, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
            return T;
        }
        if (NIL != list_utilities.singletonP(type_triples)) {
            if ((NIL != owl_export_exported_tripleP(type_triples.first())) && (NIL != rdf_blank_node.rdf_blank_node_p(subject_node))) {
                xml_utilities.xml_terpri();
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), T, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$112, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
                return NIL;
            }
            final SubLObject type_triple = type_triples.first();
            final SubLObject type_triple_object_node = rdf_triple.rdf_triple_object(type_triple);
            final SubLObject type_triple_subject_node = rdf_triple.rdf_triple_subject(type_triple);
            SubLObject cdolist_list_var3 = type_triples;
            SubLObject type_triple_$113 = NIL;
            type_triple_$113 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                owl_export_note_exported_triple(type_triple_$113);
                cdolist_list_var3 = cdolist_list_var3.rest();
                type_triple_$113 = cdolist_list_var3.first();
            } 
            xml_utilities.xml_terpri();
            if (NIL != rdf_blank_node.rdf_blank_node_p(type_triple_subject_node)) {
                if (NIL == rdf_blank_node.rdf_blank_node_p(type_triple_object_node)) {
                    if (NIL != xml_tag_abbrev(exporter, type_triple_object_node)) {
                        try {
                            final SubLObject _prev_bind_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, type_triple_object_node), NIL != owl_exporter2_blank_node_should_be_referenced_by_nameP(exporter, type_triple_subject_node) ? owl_exporter2_xml_about_attributes_for_node(exporter, type_triple_subject_node) : NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$113 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    if (NIL != subject_triples) {
                                        SubLObject cdolist_list_var4 = subject_triples;
                                        SubLObject triple = NIL;
                                        triple = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            owl_exporter2_export_rdf_triple_to_stream(exporter, triple);
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            triple = cdolist_list_var4.first();
                                        } 
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$113, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, type_triple_object_node));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                            }
                        }
                        return NIL;
                    }
                }
                try {
                    final SubLObject _prev_bind_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, type_triple_subject_node), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$114 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.xml_terpri();
                            final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str154$rdf_type), owl_exporter2_xml_resource_attributes_for_node(exporter, type_triple_object_node), T, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$116, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$115, thread);
                            }
                            SubLObject cdolist_list_var4 = subject_triples;
                            SubLObject triple = NIL;
                            triple = cdolist_list_var4.first();
                            while (NIL != cdolist_list_var4) {
                                owl_exporter2_export_rdf_triple_to_stream(exporter, triple);
                                cdolist_list_var4 = cdolist_list_var4.rest();
                                triple = cdolist_list_var4.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$114, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                    }
                }
            } else
                if (NIL != rdf_graph.rdf_nodes_equalP(type_triple_object_node, rdf_uri.get_rdf_uri(owl_utilities.owl_expanded_name($$$Class), UNPROVIDED, UNPROVIDED))) {
                    try {
                        final SubLObject _prev_bind_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, type_triple_subject_node), makeBoolean(NIL == subject_triples), NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                if (NIL != subject_triples) {
                                    SubLObject cdolist_list_var4 = subject_triples;
                                    SubLObject triple = NIL;
                                    triple = cdolist_list_var4.first();
                                    while (NIL != cdolist_list_var4) {
                                        owl_exporter2_export_rdf_triple_to_stream(exporter, triple);
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        triple = cdolist_list_var4.first();
                                    } 
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            if (NIL != subject_triples) {
                                if (NIL != subject_triples) {
                                    xml_utilities.xml_terpri();
                                }
                                xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                            }
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
                        }
                    }
                } else {
                    try {
                        final SubLObject _prev_bind_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, type_triple_subject_node), NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_terpri();
                                final SubLObject _prev_bind_0_$119 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$117 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str154$rdf_type), owl_exporter2_xml_resource_attributes_for_node(exporter, type_triple_object_node), T, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$120 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$120, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$117, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$119, thread);
                                }
                                SubLObject cdolist_list_var4 = subject_triples;
                                SubLObject triple = NIL;
                                triple = cdolist_list_var4.first();
                                while (NIL != cdolist_list_var4) {
                                    owl_exporter2_export_rdf_triple_to_stream(exporter, triple);
                                    cdolist_list_var4 = cdolist_list_var4.rest();
                                    triple = cdolist_list_var4.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$118, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_8, thread);
                        }
                    }
                }

        } else
            if (NIL != type_triples) {
                SubLObject cdolist_list_var5 = type_triples;
                SubLObject type_triple2 = NIL;
                type_triple2 = cdolist_list_var5.first();
                while (NIL != cdolist_list_var5) {
                    owl_export_note_exported_triple(type_triple2);
                    cdolist_list_var5 = cdolist_list_var5.rest();
                    type_triple2 = cdolist_list_var5.first();
                } 
                xml_utilities.xml_terpri();
                try {
                    final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            SubLObject cdolist_list_var3 = type_triples;
                            SubLObject type_triple3 = NIL;
                            type_triple3 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                final SubLObject type_triple_object_node2 = rdf_triple.rdf_triple_object(type_triple3);
                                xml_utilities.xml_terpri();
                                final SubLObject _prev_bind_0_$122 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$118 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str154$rdf_type), owl_exporter2_xml_resource_attributes_for_node(exporter, type_triple_object_node2), T, NIL, $UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$123 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$123, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$118, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$122, thread);
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                type_triple3 = cdolist_list_var3.first();
                            } 
                            cdolist_list_var3 = subject_triples;
                            SubLObject triple2 = NIL;
                            triple2 = cdolist_list_var3.first();
                            while (NIL != cdolist_list_var3) {
                                owl_exporter2_export_rdf_triple_to_stream(exporter, triple2);
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                triple2 = cdolist_list_var3.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$121, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                    }
                }
            } else
                if (NIL != $owl_export_old_compatibility_modeP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var5 = subject_triples;
                    SubLObject triple3 = NIL;
                    triple3 = cdolist_list_var5.first();
                    while (NIL != cdolist_list_var5) {
                        owl_exporter2_export_rdf_triple_to_stream(exporter, triple3);
                        cdolist_list_var5 = cdolist_list_var5.rest();
                        triple3 = cdolist_list_var5.first();
                    } 
                } else {
                    xml_utilities.xml_terpri();
                    try {
                        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)), owl_exporter2_xml_about_attributes_for_node(exporter, subject_node), NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                SubLObject cdolist_list_var3 = subject_triples;
                                SubLObject triple2 = NIL;
                                triple2 = cdolist_list_var3.first();
                                while (NIL != cdolist_list_var3) {
                                    owl_exporter2_export_rdf_triple_to_stream(exporter, triple2);
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    triple2 = cdolist_list_var3.first();
                                } 
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$124, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$Description), UNPROVIDED, UNPROVIDED)));
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                        }
                    }
                }


        return NIL;
    }

    public static SubLObject owl_exporter2_export_rdf_triple_to_stream(final SubLObject exporter, final SubLObject triple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        if (NIL == owl_export_exported_tripleP(triple)) {
            owl_export_note_exported_triple(triple);
            final SubLObject v_graph = owl_exporter2_graph(exporter);
            final SubLObject predicate_node = rdf_triple.rdf_triple_predicate(triple);
            final SubLObject subject_node = rdf_triple.rdf_triple_subject(triple);
            final SubLObject object_node = rdf_triple.rdf_triple_object(triple);
            final SubLObject tag = xml_tag_abbrev(exporter, predicate_node);
            if (!tag.isString()) {
                Errors.error($str295$Cannot_export_OWL_predicate_node_, predicate_node);
            }
            if (NIL != rdf_blank_node.rdf_blank_node_p(object_node)) {
                final SubLObject blank_node_rest_triple = rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, object_node, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED)).first();
                final SubLObject blank_node_rest = (NIL != blank_node_rest_triple) ? rdf_triple.rdf_triple_object(blank_node_rest_triple) : NIL;
                xml_utilities.xml_terpri();
                if ((NIL != blank_node_rest_triple) && (NIL == rdf_graph.rdf_nodes_equalP(blank_node_rest, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$nil), UNPROVIDED, UNPROVIDED)))) {
                    try {
                        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(tag, list(xml_tag_abbrev(exporter, $str298$rdf_parseType), $$$Collection), NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                owl_exporter2_export_blank_node_to_stream(exporter, object_node);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$129, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal(tag);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                } else {
                    try {
                        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(tag, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$130 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                owl_exporter2_export_blank_node_to_stream(exporter, object_node);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$130, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal(tag);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                        }
                    }
                }
            } else {
                xml_utilities.xml_terpri();
                if (NIL != rdf_literal.rdf_literal_p(object_node)) {
                    owl_exporter2_export_literal_to_stream(exporter, object_node, predicate_node);
                } else {
                    final SubLObject _prev_bind_5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal(tag, owl_exporter2_xml_resource_attributes_for_node(exporter, object_node), T, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$131, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_6, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_5, thread);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_export_literal_to_stream(final SubLObject exporter, final SubLObject literal, SubLObject predicate_node) {
        if (predicate_node == UNPROVIDED) {
            predicate_node = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != rdf_literal.rdf_literal_p(literal) : "rdf_literal.rdf_literal_p(literal) " + "CommonSymbols.NIL != rdf_literal.rdf_literal_p(literal) " + literal;
        final SubLObject lang = rdf_literal.rdf_literal_language_tag(literal);
        final SubLObject datatype = rdf_literal.rdf_literal_datatype(literal);
        if (NIL != predicate_node) {
            SubLObject attributes = NIL;
            if (NIL != lang) {
                attributes = putf(attributes, $str301$xml_lang, lang);
            } else
                if (NIL != datatype) {
                    attributes = putf(attributes, xml_tag_abbrev(exporter, $str302$rdf_datatype), owl_exporter2_abbrevname_for_uri(exporter, datatype));
                }

            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal(NIL != xml_tag_abbrev(exporter, predicate_node) ? xml_tag_abbrev(exporter, predicate_node) : rdf_uri.rdf_uri_utf8_string(predicate_node), attributes, NIL, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$132 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        final SubLObject lexical_form = rdf_literal.rdf_literal_utf8_lexical_form(literal);
                        if ((NIL != string_utilities.starts_with(lexical_form, xml_utilities.xml_cdata_prefix())) && (NIL != string_utilities.ends_with(lexical_form, xml_utilities.xml_cdata_suffix(), UNPROVIDED))) {
                            xml_utilities.xml_write_string(lexical_form, UNPROVIDED, UNPROVIDED);
                        } else {
                            xml_utilities.xml_write_wXescaped_special_chars(rdf_literal.rdf_literal_utf8_lexical_form(literal));
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$132, thread);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    xml_utilities.xml_end_tag_internal(NIL != xml_tag_abbrev(exporter, predicate_node) ? xml_tag_abbrev(exporter, predicate_node) : rdf_uri.rdf_uri_utf8_string(predicate_node));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } else {
            xml_utilities.xml_terpri();
            Errors.warn($str303$Unexportable_literal_encountered_, literal);
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str304$rdfs_Literal), owl_exporter2_xml_about_attributes_for_node(exporter, literal), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$133 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$133, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_5, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_export_node_to_stream(final SubLObject exporter, final SubLObject node) {
        if (NIL != rdf_graph.valid_rdf_subject_p(node)) {
            owl_exporter2_export_rdf_subject_node_to_stream(exporter, node, UNPROVIDED);
        } else
            if (NIL != rdf_literal.rdf_literal_p(node)) {
                owl_exporter2_export_literal_to_stream(exporter, node, UNPROVIDED);
            } else {
                Errors.sublisp_break($str305$Don_t_know_how_to_export__A, new SubLObject[]{ node });
            }

        return NIL;
    }

    public static SubLObject owl_exporter2_export_blank_node_to_stream(final SubLObject exporter, final SubLObject blank_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != owl_exporter2_p(exporter) : "owl_exporter2.owl_exporter2_p(exporter) " + "CommonSymbols.NIL != owl_exporter2.owl_exporter2_p(exporter) " + exporter;
        assert NIL != rdf_blank_node.rdf_blank_node_p(blank_node) : "rdf_blank_node.rdf_blank_node_p(blank_node) " + "CommonSymbols.NIL != rdf_blank_node.rdf_blank_node_p(blank_node) " + blank_node;
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        if (((NIL != owl_exporter2_blank_node_should_be_referenced_by_nameP(exporter, blank_node)) && (!blank_node.eql($owl_export_exporting_focal_nodeP$.getDynamicValue(thread)))) && (NIL != remove_if($sym285$OWL_EXPORT_EXPORTED_TRIPLE_, rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, blank_node, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, $str307$rdf_Description), owl_exporter2_xml_about_attributes_for_node(exporter, blank_node), T, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$134, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
            $owl_export_additional_export_terms$.setDynamicValue(cons(blank_node, $owl_export_additional_export_terms$.getDynamicValue(thread)), thread);
        } else {
            final SubLObject first_triple = rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, blank_node, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$first), UNPROVIDED, UNPROVIDED)).first();
            if (NIL != first_triple) {
                final SubLObject first_node = rdf_triple.rdf_triple_object(first_triple);
                final SubLObject rest_triple = rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, blank_node, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$rest), UNPROVIDED, UNPROVIDED)).first();
                final SubLObject rest_node = (NIL != rest_triple) ? rdf_triple.rdf_triple_object(rest_triple) : NIL;
                final SubLObject type_triple = rdf_graph.rdf_graph_find_subject_triples_canonical(v_graph, blank_node, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$type), UNPROVIDED, UNPROVIDED)).first();
                final SubLObject type_node = (NIL != type_triple) ? rdf_triple.rdf_triple_object(type_triple) : NIL;
                if (NIL != type_node) {
                    owl_export_note_exported_triple(type_triple);
                    try {
                        final SubLObject _prev_bind_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal(xml_tag_abbrev(exporter, type_node), NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$135 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                owl_exporter2_export_node_to_stream(exporter, first_node);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$135, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_4, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_3, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal(xml_tag_abbrev(exporter, type_node));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                        }
                    }
                } else {
                    owl_exporter2_export_node_to_stream(exporter, first_node);
                }
                if (NIL == rdf_graph.rdf_nodes_equalP(rest_node, rdf_uri.get_rdf_uri(rdf_utilities.rdf_expanded_name($$$nil), UNPROVIDED, UNPROVIDED))) {
                    owl_exporter2_export_blank_node_to_stream(exporter, rest_node);
                }
            } else {
                owl_exporter2_export_rdf_subject_node_to_stream(exporter, blank_node, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject owl_exporter2_blank_node_should_be_referenced_by_nameP(final SubLObject exporter, final SubLObject blank_node) {
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        return makeBoolean((((NIL == owl_exporter2_get_option(exporter, $kw309$SUPPRESS_DUPLICATE_EXPORT_OF_BLANK_NODES_, UNPROVIDED)) && (NIL != rdf_blank_node.rdf_blank_node_p(blank_node))) && (NIL == rdf_utilities.rdf_list_p(blank_node, v_graph))) && ONE_INTEGER.numL(length(rdf_graph.rdf_graph_find_object_triples_canonical(v_graph, blank_node, UNPROVIDED))));
    }

    public static SubLObject xml_tag_abbrev(final SubLObject exporter, final SubLObject uri) {
        return owl_exporter2_abbrevname_for_xml_tag(exporter, uri);
    }

    public static SubLObject owl_exporter2_abbrevname_for_xml_tag(final SubLObject exporter, SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (uri.isString()) {
            uri = rdf_graph.get_known_uri(uri);
        }
        if (NIL != rdf_literal.rdf_literal_p(uri)) {
            return rdf_literal.rdf_literal_utf8_lexical_form(uri);
        }
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
        final SubLObject empty_namespace_uri_string = list_utilities.alist_lookup(prefix_map, $str310$, $sym248$STRING_, UNPROVIDED);
        if ((NIL != string_utilities.non_empty_stringP(empty_namespace_uri_string)) && (NIL != Strings.stringE(rdf_uri.rdf_uri_utf8_string(uri), cconcatenate(empty_namespace_uri_string, rdf_uri.rdf_uri_local_part(uri)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return rdf_uri.rdf_uri_local_part(uri);
        }
        thread.resetMultipleValues();
        final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri(prefix_map, uri);
        final SubLObject found_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!found_prefix.isString()) {
            return NIL;
        }
        if (NIL != string_utilities.empty_string_p(found_prefix)) {
            return rdf_uri.rdf_uri_utf8_string(uri);
        }
        return cconcatenate(found_prefix, new SubLObject[]{ $str311$_, found_name });
    }

    public static SubLObject owl_exporter2_abbrevname_for_uri(final SubLObject exporter, final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rdf_literal.rdf_literal_p(uri)) {
            return rdf_literal.rdf_literal_utf8_lexical_form(uri);
        }
        final SubLObject v_graph = owl_exporter2_graph(exporter);
        final SubLObject base_uri_string = owl_exporter2_get_option(exporter, $BASE_URI, UNPROVIDED);
        final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map(v_graph);
        thread.resetMultipleValues();
        final SubLObject found_prefix = owl_utilities.rdf_abbrev_prefix_and_name_for_uri(prefix_map, uri);
        final SubLObject found_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != string_utilities.non_empty_stringP(base_uri_string)) && (NIL != Strings.stringE(rdf_uri.rdf_uri_utf8_string(uri), cconcatenate(base_uri_string, rdf_uri.rdf_uri_local_part(uri)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return rdf_uri.rdf_uri_local_part(uri);
        }
        if (!found_prefix.isString()) {
            return rdf_uri.rdf_uri_utf8_string(uri);
        }
        if (NIL != string_utilities.empty_string_p(found_prefix)) {
            return rdf_uri.rdf_uri_utf8_string(uri);
        }
        return cconcatenate($str312$_, new SubLObject[]{ found_prefix, $str313$_, found_name });
    }

    public static SubLObject declare_owl_exporter2_file() {
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "show_owl_export_usages", "SHOW-OWL-EXPORT-USAGES", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_ontology_to_file", "OWL-EXPORT-ONTOLOGY-TO-FILE", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_ontology_to_stream", "OWL-EXPORT-ONTOLOGY-TO-STREAM", 1, 2, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_terms_to_file", "OWL-EXPORT-TERMS-TO-FILE", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_terms_to_stream", "OWL-EXPORT-TERMS-TO-STREAM", 1, 2, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_terms_for_ontology", "OWL-TERMS-FOR-ONTOLOGY", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "validate_owl_export_parameters", "VALIDATE-OWL-EXPORT-PARAMETERS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_with_exporter", "OWL-EXPORT-WITH-EXPORTER", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter_v2_version_number", "OWL-EXPORTER-V2-VERSION-NUMBER", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_print_function_trampoline", "OWL-EXPORTER2-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_p", "OWL-EXPORTER2-P", 1, 0, false);
        new owl_exporter2.$owl_exporter2_p$UnaryFunction();
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_id", "OWL-EXP2-ID", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_uri", "OWL-EXP2-URI", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_file", "OWL-EXP2-FILE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_graph", "OWL-EXP2-GRAPH", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_cyclist", "OWL-EXP2-CYCLIST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_export", "OWL-EXP2-EXPORT", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_ontology", "OWL-EXP2-ONTOLOGY", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_terms", "OWL-EXP2-TERMS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_sentences", "OWL-EXP2-SENTENCES", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_stats", "OWL-EXP2-STATS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_options", "OWL-EXP2-OPTIONS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exp2_thread", "OWL-EXP2-THREAD", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_id", "_CSETF-OWL-EXP2-ID", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_uri", "_CSETF-OWL-EXP2-URI", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_file", "_CSETF-OWL-EXP2-FILE", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_graph", "_CSETF-OWL-EXP2-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_cyclist", "_CSETF-OWL-EXP2-CYCLIST", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_export", "_CSETF-OWL-EXP2-EXPORT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_ontology", "_CSETF-OWL-EXP2-ONTOLOGY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_terms", "_CSETF-OWL-EXP2-TERMS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_sentences", "_CSETF-OWL-EXP2-SENTENCES", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_stats", "_CSETF-OWL-EXP2-STATS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_options", "_CSETF-OWL-EXP2-OPTIONS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "_csetf_owl_exp2_thread", "_CSETF-OWL-EXP2-THREAD", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "make_owl_exporter2", "MAKE-OWL-EXPORTER2", 0, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "visit_defstruct_owl_exporter2", "VISIT-DEFSTRUCT-OWL-EXPORTER2", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "visit_defstruct_object_owl_exporter2_method", "VISIT-DEFSTRUCT-OBJECT-OWL-EXPORTER2-METHOD", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "print_owl_exporter2", "PRINT-OWL-EXPORTER2", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "new_owl_exporter2", "NEW-OWL-EXPORTER2", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "cyclist_using_owl_exporter_v2", "CYCLIST-USING-OWL-EXPORTER-V2", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "next_owl_exporter2_id", "NEXT-OWL-EXPORTER2-ID", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_id_map", "OWL-EXPORTER2-ID-MAP", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "note_owl_exporter2_id", "NOTE-OWL-EXPORTER2-ID", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_id", "OWL-EXPORTER2-ID", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_uri", "OWL-EXPORTER2-URI", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_file", "OWL-EXPORTER2-FILE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_graph", "OWL-EXPORTER2-GRAPH", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_graph", "OWL-EXPORTER2-SET-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_cyclist", "OWL-EXPORTER2-CYCLIST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export", "OWL-EXPORTER2-EXPORT", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_ontology", "OWL-EXPORTER2-ONTOLOGY", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_ontology", "OWL-EXPORTER2-SET-ONTOLOGY", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_terms", "OWL-EXPORTER2-TERMS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_terms", "OWL-EXPORTER2-SET-TERMS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_sentences", "OWL-EXPORTER2-SENTENCES", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_stats", "OWL-EXPORTER2-STATS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_note_stat", "OWL-EXPORTER2-NOTE-STAT", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_lookup_stat", "OWL-EXPORTER2-LOOKUP-STAT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_triple_count", "OWL-EXPORTER2-TRIPLE-COUNT", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_triples_done", "OWL-EXPORTER2-TRIPLES-DONE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_nodes_done", "OWL-EXPORTER2-NODES-DONE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_increment_triples_done", "OWL-EXPORTER2-INCREMENT-TRIPLES-DONE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_increment_nodes_done", "OWL-EXPORTER2-INCREMENT-NODES-DONE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_options", "OWL-EXPORTER2-SET-OPTIONS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_option", "OWL-EXPORTER2-SET-OPTION", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_set_option_if_not_set", "OWL-EXPORTER2-SET-OPTION-IF-NOT-SET", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_get_option", "OWL-EXPORTER2-GET-OPTION", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_options", "OWL-EXPORTER2-OPTIONS", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_note_thread", "OWL-EXPORTER2-NOTE-THREAD", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_thread", "OWL-EXPORTER2-THREAD", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "sxhash_owl_exporter2_method", "SXHASH-OWL-EXPORTER2-METHOD", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "sxhash_owl_exporter2", "SXHASH-OWL-EXPORTER2", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_create_graph", "OWL-EXPORTER2-CREATE-GRAPH", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_term_assertions_to_graph", "OWL-EXPORTER2-ADD-TERM-ASSERTIONS-TO-GRAPH", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_find_node_for_term", "OWL-EXPORTER2-FIND-NODE-FOR-TERM", 2, 2, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_find_node_for_term_int_internal", "OWL-EXPORTER2-FIND-NODE-FOR-TERM-INT-INTERNAL", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_find_node_for_term_int", "OWL-EXPORTER2-FIND-NODE-FOR-TERM-INT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_owl_opencyc_uri_for_fort", "OWL-EXPORTER2-OWL-OPENCYC-URI-FOR-FORT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_owl_synonymous_external_concept_uri_for_fort", "OWL-EXPORTER2-OWL-SYNONYMOUS-EXTERNAL-CONCEPT-URI-FOR-FORT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_fort_has_exported_owl_opencyc_contentP", "OWL-EXPORTER2-FORT-HAS-EXPORTED-OWL-OPENCYC-CONTENT?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_next_blank_node_id", "OWL-EXPORTER2-NEXT-BLANK-NODE-ID", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_term_graph_assertions", "OWL-EXPORTER2-TERM-GRAPH-ASSERTIONS", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_supported_rule_macro_predicateP", "OWL-EXPORT-SUPPORTED-RULE-MACRO-PREDICATE?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_exportable_assertionP", "OWL-EXPORTER2-EXPORTABLE-ASSERTION?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_exportable_binary_gaf_formulaP", "OWL-EXPORTER2-EXPORTABLE-BINARY-GAF-FORMULA?", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_assertion_to_graph", "OWL-EXPORTER2-ADD-ASSERTION-TO-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_binary_gaf_to_graph", "OWL-EXPORTER2-ADD-BINARY-GAF-TO-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_rmp_assertion_to_graph", "OWL-EXPORTER2-ADD-RMP-ASSERTION-TO-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_type_for_node_to_graph", "OWL-EXPORTER2-ADD-TYPE-FOR-NODE-TO-GRAPH", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_range_for_predicate", "OWL-EXPORTER2-ADD-RANGE-FOR-PREDICATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_domain_for_predicate", "OWL-EXPORTER2-ADD-DOMAIN-FOR-PREDICATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_el_list_to_graph", "OWL-EXPORTER2-ADD-EL-LIST-TO-GRAPH", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "uri_for_cyc_term", "URI-FOR-CYC-TERM", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "has_known_uriP", "HAS-KNOWN-URI?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_modify_graph", "OWL-EXPORTER2-MODIFY-GRAPH", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_extra_triples", "OWL-EXPORTER2-ADD-EXTRA-TRIPLES", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "get_language_code_for_mt", "GET-LANGUAGE-CODE-FOR-MT", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_opencyc_ontology", "OWL-EXPORTER2-ADD-OPENCYC-ONTOLOGY", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_add_rdf_graph_prefix_map", "OWL-EXPORTER2-ADD-RDF-GRAPH-PREFIX-MAP", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_output_to_stream", "OWL-EXPORTER2-OUTPUT-TO-STREAM", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_exported_tripleP", "OWL-EXPORT-EXPORTED-TRIPLE?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_note_exported_triple", "OWL-EXPORT-NOTE-EXPORTED-TRIPLE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_exported_focal_nodeP", "OWL-EXPORT-EXPORTED-FOCAL-NODE?", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_export_note_exported_focal_node", "OWL-EXPORT-NOTE-EXPORTED-FOCAL-NODE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_focal_nodeP", "OWL-EXPORTER2-FOCAL-NODE?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_rdf_graph_to_stream", "OWL-EXPORTER2-EXPORT-RDF-GRAPH-TO-STREAM", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_rdf_nodes_of_type_to_stream", "OWL-EXPORTER2-EXPORT-RDF-NODES-OF-TYPE-TO-STREAM", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_rdf_subject_node_to_stream_int", "OWL-EXPORTER2-EXPORT-RDF-SUBJECT-NODE-TO-STREAM-INT", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_xml_about_attributes_for_node", "OWL-EXPORTER2-XML-ABOUT-ATTRIBUTES-FOR-NODE", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_xml_resource_attributes_for_node", "OWL-EXPORTER2-XML-RESOURCE-ATTRIBUTES-FOR-NODE", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_rdf_subject_node_to_stream", "OWL-EXPORTER2-EXPORT-RDF-SUBJECT-NODE-TO-STREAM", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_rdf_triple_to_stream", "OWL-EXPORTER2-EXPORT-RDF-TRIPLE-TO-STREAM", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_literal_to_stream", "OWL-EXPORTER2-EXPORT-LITERAL-TO-STREAM", 2, 1, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_node_to_stream", "OWL-EXPORTER2-EXPORT-NODE-TO-STREAM", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_export_blank_node_to_stream", "OWL-EXPORTER2-EXPORT-BLANK-NODE-TO-STREAM", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_blank_node_should_be_referenced_by_nameP", "OWL-EXPORTER2-BLANK-NODE-SHOULD-BE-REFERENCED-BY-NAME?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "xml_tag_abbrev", "XML-TAG-ABBREV", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_abbrevname_for_xml_tag", "OWL-EXPORTER2-ABBREVNAME-FOR-XML-TAG", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.owl.owl_exporter2", "owl_exporter2_abbrevname_for_uri", "OWL-EXPORTER2-ABBREVNAME-FOR-URI", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_owl_exporter2_file() {
        defparameter("*OWL-EXPORTER2-VALID-OPTIONS*", $list0);
        defparameter("*OWL-EXPORT-SUBJECT-NODE-TO-TERM-HASH*", NIL);
        deflexical("*OWL-EXPORTER2-VERSION-NUMBER*", NIL != boundp($sym59$_OWL_EXPORTER2_VERSION_NUMBER_) ? $owl_exporter2_version_number$.getGlobalValue() : NIL);
        defconstant("*DTP-OWL-EXPORTER2*", OWL_EXPORTER2);
        deflexical("*OWL-EXPORTER2-ID-ISG*", NIL != boundp($sym118$_OWL_EXPORTER2_ID_ISG_) ? $owl_exporter2_id_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*OWL-EXPORTER2-ID-MAP*", NIL != boundp($sym119$_OWL_EXPORTER2_ID_MAP_) ? $owl_exporter2_id_map$.getGlobalValue() : dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        defparameter("*OWL-EXPORT-EXPORTING-TERMS*", NIL);
        defparameter("*OWL-EXPORT-OLD-COMPATIBILITY-MODE?*", NIL);
        defparameter("*OWL-EXPORT-EXPORTING-FOCAL-NODE?*", NIL);
        defparameter("*OWL-EXPORT-EXPORTED-TRIPLES*", NIL);
        defparameter("*OWL-EXPORT-EXPORTED-FOCAL-NODES*", NIL);
        defparameter("*OWL-EXPORT-ADDITIONAL-EXPORT-TERMS*", NIL);
        return NIL;
    }

    public static SubLObject setup_owl_exporter2_file() {
        register_external_symbol(OWL_EXPORT_ONTOLOGY_TO_FILE);
        register_external_symbol(OWL_EXPORT_ONTOLOGY_TO_STREAM);
        register_external_symbol(OWL_EXPORT_TERMS_TO_FILE);
        register_external_symbol(OWL_EXPORT_TERMS_TO_STREAM);
        declare_defglobal($sym59$_OWL_EXPORTER2_VERSION_NUMBER_);
        $owl_exporter2_version_number$.setGlobalValue($str60$_revision__1_2__);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_owl_exporter2$.getGlobalValue(), symbol_function(OWL_EXPORTER2_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list69);
        def_csetf(OWL_EXP2_ID, _CSETF_OWL_EXP2_ID);
        def_csetf(OWL_EXP2_URI, _CSETF_OWL_EXP2_URI);
        def_csetf(OWL_EXP2_FILE, _CSETF_OWL_EXP2_FILE);
        def_csetf(OWL_EXP2_GRAPH, _CSETF_OWL_EXP2_GRAPH);
        def_csetf(OWL_EXP2_CYCLIST, _CSETF_OWL_EXP2_CYCLIST);
        def_csetf(OWL_EXP2_EXPORT, _CSETF_OWL_EXP2_EXPORT);
        def_csetf(OWL_EXP2_ONTOLOGY, _CSETF_OWL_EXP2_ONTOLOGY);
        def_csetf(OWL_EXP2_TERMS, _CSETF_OWL_EXP2_TERMS);
        def_csetf(OWL_EXP2_SENTENCES, _CSETF_OWL_EXP2_SENTENCES);
        def_csetf(OWL_EXP2_STATS, _CSETF_OWL_EXP2_STATS);
        def_csetf(OWL_EXP2_OPTIONS, _CSETF_OWL_EXP2_OPTIONS);
        def_csetf(OWL_EXP2_THREAD, _CSETF_OWL_EXP2_THREAD);
        identity(OWL_EXPORTER2);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_owl_exporter2$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OWL_EXPORTER2_METHOD));
        note_funcall_helper_function(PRINT_OWL_EXPORTER2);
        declare_defglobal($sym118$_OWL_EXPORTER2_ID_ISG_);
        declare_defglobal($sym119$_OWL_EXPORTER2_ID_MAP_);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_owl_exporter2$.getGlobalValue(), symbol_function(SXHASH_OWL_EXPORTER2_METHOD));
        memoization_state.note_memoized_function(OWL_EXPORTER2_FIND_NODE_FOR_TERM_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_owl_exporter2_file();
    }

    @Override
    public void initializeVariables() {
        init_owl_exporter2_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_owl_exporter2_file();
    }

    static {







































































































































































































































































































































    }

    public static final class $owl_exporter2_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $uri;

        public SubLObject $file;

        public SubLObject $graph;

        public SubLObject $cyclist;

        public SubLObject $export;

        public SubLObject $ontology;

        public SubLObject $terms;

        public SubLObject $sentences;

        public SubLObject $stats;

        public SubLObject $options;

        public SubLObject $thread;

        private static final SubLStructDeclNative structDecl;

        public $owl_exporter2_native() {
            this.$id = Lisp.NIL;
            this.$uri = Lisp.NIL;
            this.$file = Lisp.NIL;
            this.$graph = Lisp.NIL;
            this.$cyclist = Lisp.NIL;
            this.$export = Lisp.NIL;
            this.$ontology = Lisp.NIL;
            this.$terms = Lisp.NIL;
            this.$sentences = Lisp.NIL;
            this.$stats = Lisp.NIL;
            this.$options = Lisp.NIL;
            this.$thread = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$uri;
        }

        @Override
        public SubLObject getField4() {
            return this.$file;
        }

        @Override
        public SubLObject getField5() {
            return this.$graph;
        }

        @Override
        public SubLObject getField6() {
            return this.$cyclist;
        }

        @Override
        public SubLObject getField7() {
            return this.$export;
        }

        @Override
        public SubLObject getField8() {
            return this.$ontology;
        }

        @Override
        public SubLObject getField9() {
            return this.$terms;
        }

        @Override
        public SubLObject getField10() {
            return this.$sentences;
        }

        @Override
        public SubLObject getField11() {
            return this.$stats;
        }

        @Override
        public SubLObject getField12() {
            return this.$options;
        }

        @Override
        public SubLObject getField13() {
            return this.$thread;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$uri = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$file = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$graph = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$cyclist = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$export = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$ontology = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$terms = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$sentences = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$stats = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$options = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$thread = value;
        }

        static {
            structDecl = makeStructDeclNative(owl_exporter2.$owl_exporter2_native.class, OWL_EXPORTER2, OWL_EXPORTER2_P, $list63, $list64, new String[]{ "$id", "$uri", "$file", "$graph", "$cyclist", "$export", "$ontology", "$terms", "$sentences", "$stats", "$options", "$thread" }, $list65, $list66, PRINT_OWL_EXPORTER2);
        }
    }

    public static final class $owl_exporter2_p$UnaryFunction extends UnaryFunction {
        public $owl_exporter2_p$UnaryFunction() {
            super(extractFunctionNamed("OWL-EXPORTER2-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return owl_exporter2_p(arg1);
        }
    }
}

/**
 * Total time: 4917 ms synthetic
 */
