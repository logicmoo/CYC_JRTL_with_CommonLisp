package com.cyc.cycjava.cycl.owl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.numeral_parser;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owl_to_cycl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.owl.owl_to_cycl";
    public static final String myFingerPrint = "034c38d42e75098dad56f7572f6dad42fdd70d40ede0a1b71e36033932a91607";
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 829L)
    private static SubLSymbol $owl_importer_v1_version_number$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 1170L)
    private static SubLSymbol $owl_importer$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7238L)
    private static SubLSymbol $owl_merge_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 14045L)
    private static SubLSymbol $owl_term_names_preceded_by_id$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 19303L)
    private static SubLSymbol $owl_term_names_preceded_by_about$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 21819L)
    private static SubLSymbol $owl_term_names_preceded_by_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 24353L)
    private static SubLSymbol $owl_term_names_preceded_by_parse_type$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 24717L)
    private static SubLSymbol $owl_definition_types$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 24865L)
    private static SubLSymbol $owl_definition_type$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 24956L)
    private static SubLSymbol $owl_definition_accumulator$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 27467L)
    private static SubLSymbol $owl_oe_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 27581L)
    private static SubLSymbol $owl_import_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31258L)
    private static SubLSymbol $xml_tokens_from_file_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 33105L)
    private static SubLSymbol $default_owl_file_encoding$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36677L)
    private static SubLSymbol $owl_import_parameters_ontology_context_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLSymbol $dtp_owl_pred_info$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLSymbol $dtp_owl_import_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 55188L)
    private static SubLSymbol $owl_reserved_namespaces$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 56369L)
    private static SubLSymbol $find_or_create_owl_ontology_for_uri_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59201L)
    private static SubLSymbol $owl_property_element_names_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 68708L)
    private static SubLSymbol $owl_spec_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72761L)
    private static SubLSymbol $owl_class_element_names_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 91834L)
    private static SubLSymbol $owl_force_new_term_creationP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 91893L)
    private static SubLSymbol $owl_allow_find_via_creationP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 99782L)
    private static SubLSymbol $cyc_properties_to_not_import$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107586L)
    private static SubLSymbol $owl_found_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111067L)
    private static SubLSymbol $owl_oe_queues$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111219L)
    private static SubLSymbol $owl_oe_daemon$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111259L)
    private static SubLSymbol $owl_oe_queue_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111426L)
    private static SubLSymbol $owl_oe_queue_end_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113412L)
    private static SubLSymbol $owl_node_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123327L)
    private static SubLSymbol $note_found_term_resolution_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 125853L)
    private static SubLSymbol $create_anonymous_owl_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 137911L)
    private static SubLSymbol $owl_restriction_collection_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 140736L)
    private static SubLSymbol $owl_term_from_specification_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLSymbol $dtp_owl_term_info$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 189024L)
    private static SubLSymbol $owl_interval_datatypes$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191096L)
    private static SubLSymbol $xml_name_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLSymbol $dtp_owl_importer$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197036L)
    private static SubLSymbol $owl_importer_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198767L)
    private static SubLSymbol $sweet_root$;
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198767L)
    private static SubLSymbol $sweet_ontologies$;
    private static final SubLSymbol $sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_;
    private static final SubLSymbol $sym1$DIGIT_CHAR_P;
    private static final SubLString $str2$_Revision__138034__;
    private static final SubLSymbol $sym3$HL_TERM_P;
    private static final SubLSymbol $sym4$LIST_OF_STRING_P;
    private static final SubLInteger $int5$255;
    private static final SubLInteger $int6$100;
    private static final SubLSymbol $sym7$_;
    private static final SubLObject $const8$OWLOntologyQuery_GetRootClasses;
    private static final SubLObject $const9$synonymousExternalConcept;
    private static final SubLSymbol $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX;
    private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const12$EverythingPSC;
    private static final SubLSymbol $kw13$GAF;
    private static final SubLObject $const14$owl_Ontology;
    private static final SubLObject $const15$owl_imports;
    private static final SubLObject $const16$Thing;
    private static final SubLString $str17$Can_t_find_path_from__S_to___Thin;
    private static final SubLSymbol $sym18$COLLECTION_P;
    private static final SubLSymbol $kw19$BREADTH;
    private static final SubLSymbol $kw20$QUEUE;
    private static final SubLSymbol $kw21$STACK;
    private static final SubLSymbol $sym22$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw23$ERROR;
    private static final SubLString $str24$_A_is_not_a__A;
    private static final SubLSymbol $sym25$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw26$CERROR;
    private static final SubLString $str27$continue_anyway;
    private static final SubLSymbol $kw28$WARN;
    private static final SubLString $str29$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const30$genls;
    private static final SubLString $str31$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str32$attempting_to_bind_direction_link;
    private static final SubLString $str33$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const34$OWLMappingMt;
    private static final SubLObject $const35$coExtensional;
    private static final SubLObject $const36$equals;
    private static final SubLSymbol $sym37$MEMOIZED_COUNT_ALL_SPECS;
    private static final SubLSymbol $sym38$ISA_COLLECTION_;
    private static final SubLSymbol $sym39$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const40$InferencePSC;
    private static final SubLSymbol $sym41$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym42$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL;
    private static final SubLSymbol $sym44$OWL_MIN_GENLS_MEMOIZED;
    private static final SubLSymbol $kw45$UP;
    private static final SubLString $str46$Of;
    private static final SubLSymbol $kw47$COLLECTION;
    private static final SubLSymbol $kw48$PREDICATE;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$INITIALIZED_P;
    private static final SubLSymbol $sym55$_EXIT;
    private static final SubLSymbol $sym56$OWL_DEFINITION_NAME;
    private static final SubLSymbol $kw57$PROPERTY;
    private static final SubLString $str58$_S_is_not_a_valid_definition_type;
    private static final SubLSymbol $sym59$IMPORT_OWL_ONTOLOGY;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$URI;
    private static final SubLSymbol $kw62$URI_PREFIX;
    private static final SubLSymbol $kw63$CONSTANT_PREFIX;
    private static final SubLSymbol $kw64$CONSTANT_SUFFIX;
    private static final SubLSymbol $kw65$SOURCE;
    private static final SubLSymbol $kw66$ONTOLOGY;
    private static final SubLSymbol $kw67$QUOTED_ISA;
    private static final SubLSymbol $kw68$CYCLIST;
    private static final SubLSymbol $kw69$PREFIX_EXTERNAL_NAMES_;
    private static final SubLSymbol $kw70$ABBREVIATE_PREFIXES_;
    private static final SubLString $str71$Can_only_import_OWL_ontologies_fr;
    private static final SubLSymbol $sym72$URI_P;
    private static final SubLSymbol $kw73$FILE;
    private static final SubLSymbol $kw74$URL;
    private static final SubLSymbol $sym75$XML_TOKENS_FROM_FILE;
    private static final SubLSymbol $kw76$INPUT;
    private static final SubLString $str77$Unable_to_open__S;
    private static final SubLSymbol $sym78$WHITESPACE_STRING_;
    private static final SubLSymbol $sym79$_XML_TOKENS_FROM_FILE_CACHING_STATE_;
    private static final SubLInteger $int80$48;
    private static final SubLString $str81$__Importing__S_from__S_____;
    private static final SubLSymbol $kw82$CLASS;
    private static final SubLString $str83$Processing__D_class_definition__P;
    private static final SubLSymbol $kw84$INSTANCE;
    private static final SubLString $str85$Processing__D_instance_definition;
    private static final SubLString $str86$utf_8;
    private static final SubLString $str87$_xml;
    private static final SubLString $str88$encoding;
    private static final SubLString $str89$OWLImport_;
    private static final SubLList $list90;
    private static final SubLObject $const91$UniversalVocabularyMt;
    private static final SubLString $str92$;
    private static final SubLSymbol $kw93$UPCASE;
    private static final SubLObject $const94$startingDate;
    private static final SubLObject $const95$infoTransferred;
    private static final SubLObject $const96$doneBy;
    private static final SubLObject $const97$endingDate;
    private static final SubLString $str98$Ontology;
    private static final SubLString $str99$RDF;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLString $str102$base;
    private static final SubLString $str103$Can_t_recognize_alleged_base_URI_;
    private static final SubLSymbol $sym104$OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT;
    private static final SubLSymbol $sym105$_OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT_CACHING_STATE_;
    private static final SubLObject $const106$ContextOfPCWFn;
    private static final SubLString $str107$Expected_ontology_token__got__S;
    private static final SubLString $str108$Couldn_t_find_closing_Ontology_ta;
    private static final SubLInteger $int109$32;
    private static final SubLString $str110$comment;
    private static final SubLString $str111$Expecting_comment__got__S;
    private static final SubLObject $const112$rdfs_comment;
    private static final SubLString $str113$label;
    private static final SubLString $str114$lang;
    private static final SubLObject $const115$EnglishLanguage;
    private static final SubLString $str116$Expecting_label__got__S;
    private static final SubLString $str117$priorVersion;
    private static final SubLString $str118$about;
    private static final SubLObject $const119$owl_priorVersion;
    private static final SubLString $str120$imports;
    private static final SubLString $str121$versionInfo;
    private static final SubLString $str122$Don_t_know_how_to_handle_ontology;
    private static final SubLSymbol $sym123$OWL_PRED_INFO;
    private static final SubLSymbol $sym124$OWL_PRED_INFO_P;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$PRINT_OWL_PRED_INFO;
    private static final SubLSymbol $sym130$OWL_PRED_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$OPI_CYC_NAME;
    private static final SubLSymbol $sym133$_CSETF_OPI_CYC_NAME;
    private static final SubLSymbol $sym134$OPI_COMMENT;
    private static final SubLSymbol $sym135$_CSETF_OPI_COMMENT;
    private static final SubLSymbol $sym136$OPI_DOMAINS;
    private static final SubLSymbol $sym137$_CSETF_OPI_DOMAINS;
    private static final SubLSymbol $sym138$OPI_RANGE;
    private static final SubLSymbol $sym139$_CSETF_OPI_RANGE;
    private static final SubLSymbol $sym140$OPI_PLIST;
    private static final SubLSymbol $sym141$_CSETF_OPI_PLIST;
    private static final SubLSymbol $kw142$CYC_NAME;
    private static final SubLSymbol $kw143$COMMENT;
    private static final SubLSymbol $kw144$DOMAINS;
    private static final SubLSymbol $kw145$RANGE;
    private static final SubLSymbol $kw146$PLIST;
    private static final SubLString $str147$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw148$BEGIN;
    private static final SubLSymbol $sym149$MAKE_OWL_PRED_INFO;
    private static final SubLSymbol $kw150$SLOT;
    private static final SubLSymbol $kw151$END;
    private static final SubLSymbol $sym152$VISIT_DEFSTRUCT_OBJECT_OWL_PRED_INFO_METHOD;
    private static final SubLString $str153$_OWL_PRED_INFO__A_;
    private static final SubLSymbol $kw154$EXTERNAL_NAME;
    private static final SubLSymbol $sym155$STRINGP;
    private static final SubLSymbol $sym156$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym157$OWL_EXTERNAL_VALUE_SPECIFICATION_P;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$OWL_QUASI_TERM_P;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLList $list163;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$OWL_EXTERNAL_TERM_ENUMERATION_P;
    private static final SubLSymbol $sym166$SXHASH_OWL_PRED_INFO_METHOD;
    private static final SubLSymbol $sym167$OWL_IMPORT_PARAMETERS;
    private static final SubLSymbol $sym168$OWL_IMPORT_PARAMETERS_P;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$PRINT_OWL_IMPORT_PARAMETERS;
    private static final SubLSymbol $sym174$OWL_IMPORT_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$OIP_ONTOLOGY;
    private static final SubLSymbol $sym177$_CSETF_OIP_ONTOLOGY;
    private static final SubLSymbol $sym178$OIP_NAMESPACE_MAP;
    private static final SubLSymbol $sym179$_CSETF_OIP_NAMESPACE_MAP;
    private static final SubLSymbol $sym180$OIP_CONSTANT_PREFIX;
    private static final SubLSymbol $sym181$_CSETF_OIP_CONSTANT_PREFIX;
    private static final SubLSymbol $sym182$OIP_CONSTANT_SUFFIX;
    private static final SubLSymbol $sym183$_CSETF_OIP_CONSTANT_SUFFIX;
    private static final SubLSymbol $sym184$OIP_BASE_URI;
    private static final SubLSymbol $sym185$_CSETF_OIP_BASE_URI;
    private static final SubLSymbol $sym186$OIP_URI_PREFIX;
    private static final SubLSymbol $sym187$_CSETF_OIP_URI_PREFIX;
    private static final SubLSymbol $sym188$OIP_CYCLIST;
    private static final SubLSymbol $sym189$_CSETF_OIP_CYCLIST;
    private static final SubLSymbol $sym190$OIP_QUOTED_ISA;
    private static final SubLSymbol $sym191$_CSETF_OIP_QUOTED_ISA;
    private static final SubLSymbol $sym192$OIP_PREFIX_EXTERNAL_NAMES_;
    private static final SubLSymbol $sym193$_CSETF_OIP_PREFIX_EXTERNAL_NAMES_;
    private static final SubLSymbol $sym194$OIP_ABBREVIATE_PREFIXES_;
    private static final SubLSymbol $sym195$_CSETF_OIP_ABBREVIATE_PREFIXES_;
    private static final SubLSymbol $sym196$OIP_IMPORT_TERM;
    private static final SubLSymbol $sym197$_CSETF_OIP_IMPORT_TERM;
    private static final SubLSymbol $sym198$OIP_ENCODING;
    private static final SubLSymbol $sym199$_CSETF_OIP_ENCODING;
    private static final SubLSymbol $kw200$NAMESPACE_MAP;
    private static final SubLSymbol $kw201$BASE_URI;
    private static final SubLSymbol $kw202$IMPORT_TERM;
    private static final SubLSymbol $kw203$ENCODING;
    private static final SubLSymbol $sym204$MAKE_OWL_IMPORT_PARAMETERS;
    private static final SubLSymbol $sym205$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORT_PARAMETERS_METHOD;
    private static final SubLString $str206$_OWL_IMPORT_PARAMETERS__S_;
    private static final SubLSymbol $sym207$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym208$CYCLIST_;
    private static final SubLObject $const209$SoftwareVersionFn;
    private static final SubLObject $const210$OWLImporter_Cyc;
    private static final SubLObject $const211$UserOfProgramFn;
    private static final SubLString $str212$Multiple_uris_for__S_____S____S;
    private static final SubLSymbol $sym213$FORT_P;
    private static final SubLSymbol $sym214$SXHASH_OWL_IMPORT_PARAMETERS_METHOD;
    private static final SubLString $str215$resource;
    private static final SubLString $str216$_;
    private static final SubLString $str217$interpretation_of_;
    private static final SubLString $str218$_as_a_URI_for_an_imported_ontolog;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLString $str221$Namespace_problem___A;
    private static final SubLString $str222$xmlns;
    private static final SubLList $list223;
    private static final SubLString $str224$_is_bound_to_;
    private static final SubLString $str225$_;
    private static final SubLString $str226$_Must_be_one_of_;
    private static final SubLString $str227$No_import_statement_for_;
    private static final SubLSymbol $sym228$FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI;
    private static final SubLSymbol $sym229$_ONTOLOGY;
    private static final SubLObject $const230$and;
    private static final SubLList $list231;
    private static final SubLObject $const232$salientURI;
    private static final SubLSymbol $kw233$INFERENCE_MODE;
    private static final SubLSymbol $kw234$MINIMAL;
    private static final SubLSymbol $kw235$PROBLEM_STORE;
    private static final SubLList $list236;
    private static final SubLString $str237$__;
    private static final SubLString $str238$Couldn_t_find_ontology_for__S__Cr;
    private static final SubLString $str239$__;
    private static final SubLObject $const240$OWLOntologyFn;
    private static final SubLSymbol $sym241$_FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI_CACHING_STATE_;
    private static final SubLSymbol $sym242$_TERM_TYPE;
    private static final SubLObject $const243$termTypeForOntology;
    private static final SubLList $list244;
    private static final SubLObject $const245$TermFromOntologyFn;
    private static final SubLSymbol $kw246$CLOSE;
    private static final SubLString $str247$There_is_no_range_for__S__Name_to;
    private static final SubLSymbol $sym248$OWL_PROPERTY_ELEMENT_NAMES;
    private static final SubLString $str249$DatatypeProperty;
    private static final SubLString $str250$AnnotationProperty;
    private static final SubLString $str251$ObjectProperty;
    private static final SubLString $str252$FunctionalProperty;
    private static final SubLString $str253$SymmetricProperty;
    private static final SubLString $str254$TransitiveProperty;
    private static final SubLSymbol $sym255$_OWL_PROPERTY_ELEMENT_NAMES_CACHING_STATE_;
    private static final SubLString $str256$____;
    private static final SubLString $str257$___;
    private static final SubLString $str258$Couldn_t_find_end_of_HTML_comment;
    private static final SubLString $str259$Skipping_comment___S;
    private static final SubLSymbol $kw260$ISAS;
    private static final SubLSymbol $kw261$NEXT_NON_WHITESPACE_TOKEN;
    private static final SubLString $str262$type;
    private static final SubLString $str263$Can_t_interpret_empty_label_token;
    private static final SubLString $str264$Can_t_decode_language_abbreviatio;
    private static final SubLSymbol $kw265$LABEL;
    private static final SubLString $str266$domain;
    private static final SubLString $str267$Couldn_t_identify_domain_from__S;
    private static final SubLString $str268$inverseOf;
    private static final SubLString $str269$__;
    private static final SubLString $str270$_S_is_its_own_inverse__so_it_s_sy;
    private static final SubLSymbol $kw271$SYMMETRIC_;
    private static final SubLSymbol $kw272$INVERSE;
    private static final SubLString $str273$subPropertyOf;
    private static final SubLString $str274$Noting_genl_property__S_of__S;
    private static final SubLSymbol $kw275$GENL_PROPERTY;
    private static final SubLString $str276$equivalentProperty;
    private static final SubLString $str277$Noting_equivalent_property__S_of_;
    private static final SubLSymbol $kw278$EQUIVALENT_PROPERTIES;
    private static final SubLString $str279$range;
    private static final SubLString $str280$Couldn_t_identify_range_from__S;
    private static final SubLString $str281$guid;
    private static final SubLString $str282$string;
    private static final SubLString $str283$__Noting_Cyc_guid_for__S_S__;
    private static final SubLSymbol $kw284$GUID;
    private static final SubLString $str285$externalID;
    private static final SubLString $str286$__Noting_Cyc_externalID_for__S_S_;
    private static final SubLSymbol $kw287$EXTERNALID;
    private static final SubLString $str288$datatype;
    private static final SubLString $str289$isa;
    private static final SubLString $str290$__Noting__isa__S__S___;
    private static final SubLString $str291$__Noting__S__S__;
    private static final SubLSymbol $kw292$MY_PRED_VALUES;
    private static final SubLString $str293$Ignoring_unrecognized_token___S;
    private static final SubLString $str294$cyc_com;
    private static final SubLString $str295$Don_t_know_how_to_interpret_attri;
    private static final SubLSymbol $kw296$NONLOCAL;
    private static final SubLString $str297$Processing__D_property_definition;
    private static final SubLString $str298$cdolist;
    private static final SubLString $str299$DataRange;
    private static final SubLString $str300$oneOf;
    private static final SubLString $str301$Can_t_read_range_starting_with__S;
    private static final SubLString $str302$__rdfs_range_;
    private static final SubLString $str303$Finished_range__S_;
    private static final SubLSymbol $sym304$OWL_CLASS_ELEMENT_NAMES;
    private static final SubLString $str305$Class;
    private static final SubLString $str306$DeprecatedClass;
    private static final SubLSymbol $sym307$_OWL_CLASS_ELEMENT_NAMES_CACHING_STATE_;
    private static final SubLSymbol $sym308$OWL_CLASS_TOKEN_P;
    private static final SubLString $str309$Reading_OWL_class_starting_with__;
    private static final SubLString $str310$nodeID;
    private static final SubLList $list311;
    private static final SubLSymbol $sym312$OWL_TERM_INFO_P;
    private static final SubLString $str313$Starting_token___S;
    private static final SubLString $str314$No_progress_reading_OWL_class__St;
    private static final SubLString $str315$Description;
    private static final SubLString $str316$Restriction;
    private static final SubLString $str317$Reading_restriction_starting_with;
    private static final SubLString $str318$unionOf;
    private static final SubLString $str319$Don_t_know_what_to_do_with_this_t;
    private static final SubLSymbol $kw320$NODE_ID;
    private static final SubLString $str321$Found_class___S___Components___S;
    private static final SubLSymbol $kw322$COMPLEMENT_CLASS;
    private static final SubLSymbol $kw323$COMPLEMENT_OF;
    private static final SubLSymbol $kw324$INTERSECTION_OF;
    private static final SubLString $str325$Don_t_know_what_this_class_is_nam;
    private static final SubLString $str326$Can_t_read_an_enumeration_that_is;
    private static final SubLString $str327$rest;
    private static final SubLString $str328$first;
    private static final SubLString $str329$Couldn_t_get_name_from__S;
    private static final SubLString $str330$Read_enumeration___S;
    private static final SubLSymbol $kw331$ONE_OF;
    private static final SubLString $str332$http___www_w3_org_1999_02_22_rdf_;
    private static final SubLString $str333$parseType;
    private static final SubLString $str334$Collection;
    private static final SubLString $str335$Found_non_first__non_rest_token_i;
    private static final SubLString $str336$__Next_item___S__;
    private static final SubLSymbol $kw337$UNION;
    private static final SubLString $str338$ID;
    private static final SubLString $str339$Got_null_arg_isa_name_in__S;
    private static final SubLSymbol $sym340$XML_SCHEMA_CLASS_URIS;
    private static final SubLList $list341;
    private static final SubLList $list342;
    private static final SubLList $list343;
    private static final SubLSymbol $sym344$CONSTANT_P;
    private static final SubLSymbol $sym345$KEYWORDP;
    private static final SubLList $list346;
    private static final SubLString $str347$__Found_term_by_guid___S;
    private static final SubLString $str348$__Found_term_by_externalID___S;
    private static final SubLObject $const349$owl_Class;
    private static final SubLSymbol $sym350$_URI;
    private static final SubLObject $const351$standardPrefixForURI;
    private static final SubLList $list352;
    private static final SubLList $list353;
    private static final SubLSymbol $sym354$STRING_ARG;
    private static final SubLSymbol $sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE;
    private static final SubLString $str356$Couldn_t_find_URI_for_namespace__;
    private static final SubLString $str357$Can_t_find_or_create_term_of_type;
    private static final SubLSymbol $sym358$CONTROL_CHAR_P;
    private static final SubLString $str359$external_name_appears_to_contain_;
    private static final SubLString $str360$external_name_appears_to_contain_;
    private static final SubLObject $const361$OWLClass;
    private static final SubLSymbol $sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY;
    private static final SubLObject $const363$Predicate;
    private static final SubLObject $const364$quotedIsa;
    private static final SubLObject $const365$BookkeepingMt;
    private static final SubLString $str366$_;
    private static final SubLList $list367;
    private static final SubLSymbol $sym368$ARG1;
    private static final SubLObject $const369$owlDefiningOntologyURI;
    private static final SubLList $list370;
    private static final SubLList $list371;
    private static final SubLSymbol $sym372$TRY_TO_ABBREVIATE_OWL_URI;
    private static final SubLString $str373$_cyc_top_transcripts_0953_jonny2_;
    private static final SubLString $str374$_cyc_top_transcripts_0953_vela_20;
    private static final SubLString $str375$_cyc_top_transcripts_0953_vela_20;
    private static final SubLString $str376$_cyc_top_transcripts_0953_jonny2_;
    private static final SubLString $str377$_cyc_top_transcripts_0953_jonny2_;
    private static final SubLString $str378$_cyc_top_transcripts_0953_jonny2_;
    private static final SubLString $str379$_cyc_top_transcripts_0953_jonny2_;
    private static final SubLSymbol $kw380$X;
    private static final SubLObject $const381$or;
    private static final SubLObject $const382$nameSpacePrefixForSKS;
    private static final SubLObject $const383$URIFn;
    private static final SubLList $list384;
    private static final SubLSymbol $sym385$CYCL_TERM_OR_OWL_QUASI_TERM_P;
    private static final SubLObject $const386$CollectionUnionFn;
    private static final SubLObject $const387$TheSet;
    private static final SubLObject $const388$CollectionIntersection2Fn;
    private static final SubLObject $const389$CollectionIntersectionFn;
    private static final SubLObject $const390$SingletonCollectionFn;
    private static final SubLObject $const391$TheCollection;
    private static final SubLList $list392;
    private static final SubLObject $const393$OWLProperty;
    private static final SubLSymbol $sym394$SPEC_;
    private static final SubLString $str395$Potentially_adding_assertions_to_;
    private static final SubLObject $const396$isa;
    private static final SubLString $str397$__Creating_predicate_from__S__;
    private static final SubLString $str398$Failed_to_find_or_create_a_predic;
    private static final SubLObject $const399$owl_SymmetricProperty;
    private static final SubLList $list400;
    private static final SubLObject $const401$rdfs_domain;
    private static final SubLList $list402;
    private static final SubLObject $const403$rdfs_range;
    private static final SubLString $str404$Asserting_genl_property__S_of__S;
    private static final SubLObject $const405$rdfs_subPropertyOf;
    private static final SubLString $str406$Asserting_spec_property__S_of__S;
    private static final SubLObject $const407$InverseBinaryPredicateFn;
    private static final SubLString $str408$Asserting_inverse__S_of__S;
    private static final SubLString $str409$Asserting_equivalent_property__S_;
    private static final SubLString $str410$Couldn_t_find_equivalent_property;
    private static final SubLObject $const411$owl_equivalentProperty;
    private static final SubLList $list412;
    private static final SubLString $str413$__Asserting__S__;
    private static final SubLObject $const414$Collection;
    private static final SubLSymbol $sym415$INVALID_FORT_;
    private static final SubLSymbol $sym416$_TERM;
    private static final SubLString $str417$Couldn_t_find__S;
    private static final SubLSymbol $sym418$_OWL_OE_QUEUES_;
    private static final SubLSymbol $sym419$_OWL_OE_DAEMON_;
    private static final SubLSymbol $sym420$_OWL_NODE_ID_INDEX_;
    private static final SubLString $str421$Circular_node_id_reference___S___;
    private static final SubLSymbol $kw422$UNRESOLVED;
    private static final SubLString $str423$Postponing__isa__S__S__because__S;
    private static final SubLList $list424;
    private static final SubLSymbol $sym425$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLString $str426$_;
    private static final SubLSymbol $kw427$ASSERT;
    private static final SubLString $str428$OWL_OE_Daemon;
    private static final SubLSymbol $sym429$OWL_OE_DAEMON_RUN;
    private static final SubLSymbol $sym430$CONSP;
    private static final SubLString $str431$Waiting_for__D_enqueued_operation;
    private static final SubLFloat $float432$0_5;
    private static final SubLString $str433$__Finished_pass_through_queue__Si;
    private static final SubLString $str434$__OE_queue_is_empty__Zzz___;
    private static final SubLString $str435$Unable_to_perform__D_operation__P;
    private static final SubLString $str436$__Can_t_do_anything_with_queue_no;
    private static final SubLList $list437;
    private static final SubLString $str438$__Noting_OE_performed___S__;
    private static final SubLList $list439;
    private static final SubLString $str440$__Failed_to_resolve__S__;
    private static final SubLSymbol $sym441$RESOLVE_OWL_QUASI_TERM;
    private static final SubLString $str442$Problem_performing__S;
    private static final SubLSymbol $kw443$OWL_QUASI_TERM;
    private static final SubLSymbol $kw444$FIND;
    private static final SubLString $str445$_S_is_not_an_OWL_node_ID_;
    private static final SubLList $list446;
    private static final SubLList $list447;
    private static final SubLSymbol $sym448$NOTE_FOUND_TERM_RESOLUTION;
    private static final SubLString $str449$__Resolved__S___to__S__;
    private static final SubLSymbol $sym450$_NOTE_FOUND_TERM_RESOLUTION_CACHING_STATE_;
    private static final SubLSymbol $sym451$OWL_ASSERT;
    private static final SubLSymbol $sym452$NON_ASCII_STRING_P;
    private static final SubLSymbol $sym453$NON_ASCII_STRING_TO_UNICODE;
    private static final SubLString $str454$Already_know__S___in__S;
    private static final SubLString $str455$Failed_to_assert__S__;
    private static final SubLString $str456$Processing_term_definitions___;
    private static final SubLString $str457$Anonymous_;
    private static final SubLString $str458$__Creating__S_____;
    private static final SubLString $str459$Potentially_adding_assertions_to_;
    private static final SubLString $str460$__Defining_term_from__S__;
    private static final SubLString $str461$Failed_to_find_or_create_a_term_w;
    private static final SubLSymbol $kw462$EQUIVALENT_CLASSES;
    private static final SubLSymbol $kw463$UNION_OF;
    private static final SubLString $str464$Thing;
    private static final SubLObject $const465$owl_Thing;
    private static final SubLString $str466$Asserting_genl_class__S_of__S;
    private static final SubLObject $const467$rdfs_subClassOf;
    private static final SubLList $list468;
    private static final SubLString $str469$Asserting_disjoint_class__S_of__S;
    private static final SubLObject $const470$owl_disjointWith;
    private static final SubLString $str471$Don_t_know_how_to_handle_supercla;
    private static final SubLString $str472$Asserting_disjoint___S_and__S;
    private static final SubLString $str473$Don_t_know_how_to_handle_disjoint;
    private static final SubLString $str474$Asserting_union__S_of__S;
    private static final SubLObject $const475$collectionUnion;
    private static final SubLString $str476$Asserting_intersection__S_of__S;
    private static final SubLObject $const477$collectionIntersection;
    private static final SubLSymbol $kw478$ENUMERATED_INSTANCES;
    private static final SubLString $str479$Asserting_enumeration__S_of__S;
    private static final SubLObject $const480$completelyAssertedCollection;
    private static final SubLString $str481$Can_t_handle__S__value___S_;
    private static final SubLList $list482;
    private static final SubLSymbol $sym483$_LEXICON;
    private static final SubLObject $const484$languageHasRootLexicon;
    private static final SubLList $list485;
    private static final SubLList $list486;
    private static final SubLObject $const487$GeneralEnglishMt;
    private static final SubLObject $const488$rdfs_label;
    private static final SubLString $str489$Asserting_equivalent_class__S_of_;
    private static final SubLObject $const490$owl_equivalentClass;
    private static final SubLString $str491$Failed_to_assert_equivalent_class;
    private static final SubLList $list492;
    private static final SubLString $str493$Resolved_nonlocal_reference__S___;
    private static final SubLString $str494$Node_ID_as_restriction_target___S;
    private static final SubLString $str495$Can_t_handle__S_restrictions_with;
    private static final SubLString $str496$allValuesFrom;
    private static final SubLObject $const497$relationAllOnly;
    private static final SubLString $str498$someValuesFrom;
    private static final SubLObject $const499$relationAllExists;
    private static final SubLString $str500$hasValue;
    private static final SubLObject $const501$relationAllInstance;
    private static final SubLString $str502$minCardinality;
    private static final SubLObject $const503$requiredArg1Pred;
    private static final SubLString $str504$cardinality;
    private static final SubLObject $const505$relationAllExistsCount;
    private static final SubLObject $const506$relationAllExistsMin;
    private static final SubLString $str507$maxCardinality;
    private static final SubLObject $const508$relationAllExistsMax;
    private static final SubLList $list509;
    private static final SubLList $list510;
    private static final SubLList $list511;
    private static final SubLList $list512;
    private static final SubLList $list513;
    private static final SubLList $list514;
    private static final SubLSymbol $kw515$PRED;
    private static final SubLSymbol $kw516$TARGET;
    private static final SubLSymbol $kw517$GENL;
    private static final SubLString $str518$Can_t_create_collection_from__S_r;
    private static final SubLSymbol $sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION;
    private static final SubLString $str520$Created__S_from__S;
    private static final SubLString $str521$__Asserting__S;
    private static final SubLSymbol $sym522$NODE_ID_SPECIFICATION_P;
    private static final SubLString $str523$Nested_calls_resolving__S;
    private static final SubLList $list524;
    private static final SubLObject $const525$CollectionDifferenceFn;
    private static final SubLSymbol $sym526$VALID_CONSTANT_;
    private static final SubLString $str527$Can_t_find_or_create__S_term_from;
    private static final SubLSymbol $sym528$OWL_RESTRICTION_P;
    private static final SubLString $str529$__Trying_to_resolve__S__;
    private static final SubLString $str530$__Result___S__;
    private static final SubLString $str531$Trying_to_create_term_from__S;
    private static final SubLSymbol $sym532$OWL_TERM_INFO;
    private static final SubLList $list533;
    private static final SubLList $list534;
    private static final SubLList $list535;
    private static final SubLList $list536;
    private static final SubLSymbol $sym537$PRINT_OWL_TERM_INFO;
    private static final SubLSymbol $sym538$OWL_TERM_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list539;
    private static final SubLSymbol $sym540$OTI_CYC_NAME;
    private static final SubLSymbol $sym541$_CSETF_OTI_CYC_NAME;
    private static final SubLSymbol $sym542$OTI_COMMENT;
    private static final SubLSymbol $sym543$_CSETF_OTI_COMMENT;
    private static final SubLSymbol $sym544$OTI_SUPERCLASSES;
    private static final SubLSymbol $sym545$_CSETF_OTI_SUPERCLASSES;
    private static final SubLSymbol $sym546$OTI_DISJOINT_CLASSES;
    private static final SubLSymbol $sym547$_CSETF_OTI_DISJOINT_CLASSES;
    private static final SubLSymbol $sym548$OTI_PLIST;
    private static final SubLSymbol $sym549$_CSETF_OTI_PLIST;
    private static final SubLSymbol $kw550$SUPERCLASSES;
    private static final SubLSymbol $kw551$DISJOINT_CLASSES;
    private static final SubLSymbol $sym552$MAKE_OWL_TERM_INFO;
    private static final SubLSymbol $sym553$VISIT_DEFSTRUCT_OBJECT_OWL_TERM_INFO_METHOD;
    private static final SubLString $str554$_OWL_TERM_INFO__A_;
    private static final SubLList $list555;
    private static final SubLString $str556$Don_t_know_about__S;
    private static final SubLSymbol $sym557$SXHASH_OWL_TERM_INFO_METHOD;
    private static final SubLSymbol $kw558$BNODE;
    private static final SubLString $str559$__Reading_Description___S__;
    private static final SubLString $str560$Skipping_rdf_Description_element_;
    private static final SubLString $str561$__Reading_Restriction___S__;
    private static final SubLString $str562$Skipping_owl_Restriction_element_;
    private static final SubLString $str563$Reading_top_level_named_class__S;
    private static final SubLString $str564$Failed_or_declined_to_read_a_clas;
    private static final SubLString $str565$There_are_no_superclasses_for__S;
    private static final SubLString $str566$Finished__S____Superclasses___S__;
    private static final SubLString $str567$Skipping_HTML_comment___S;
    private static final SubLString $str568$Reading_definition_of__S;
    private static final SubLString $str569$Skipping__S_to_close_tag;
    private static final SubLString $str570$Failed_or_declined_to_read_an_ins;
    private static final SubLString $str571$Finished__S_;
    private static final SubLString $str572$__Defining__S_as_an_instance_of__;
    private static final SubLString $str573$AllDifferent;
    private static final SubLString $str574$Skipping__S;
    private static final SubLString $str575$Skipping_locally_defined__S_to_cl;
    private static final SubLString $str576$subClassOf;
    private static final SubLString $str577$Read_superclass___S;
    private static final SubLString $str578$disjointWith;
    private static final SubLString $str579$equivalentClass;
    private static final SubLString $str580$owlEquivalentClass;
    private static final SubLString $str581$complementOf;
    private static final SubLString $str582$intersectionOf;
    private static final SubLString $str583$Read_one_intersection_element___S;
    private static final SubLString $str584$Intersection___S;
    private static final SubLString $str585$Read_one_union_element___S;
    private static final SubLString $str586$Union___S;
    private static final SubLString $str587$Read_enumerated_instances___S;
    private static final SubLString $str588$Couldn_t_determine_value_from__S_;
    private static final SubLString $str589$Apparently_anonymous_instance___S;
    private static final SubLList $list590;
    private static final SubLString $str591$Finding_or_creating_nonlocal_term;
    private static final SubLString $str592$Result___S;
    private static final SubLString $str593$Reading_OWL_class_or_restriction_;
    private static final SubLSymbol $kw594$RESTRICTION;
    private static final SubLString $str595$Can_t_read_class_starting_with__S;
    private static final SubLString $str596$_S___is_not_the_start_of_an_OWL_r;
    private static final SubLSymbol $kw597$INITIAL;
    private static final SubLSymbol $kw598$DONE;
    private static final SubLString $str599$Read_restriction___S__S__S__S;
    private static final SubLString $str600$onProperty;
    private static final SubLString $str601$Reading_restriction_property___;
    private static final SubLSymbol $kw602$READING_PROPERTY;
    private static final SubLString $str603$onClass;
    private static final SubLString $str604$Reading_restriction_class___;
    private static final SubLSymbol $kw605$READING_CLASS;
    private static final SubLString $str606$Read_restriction_property__S;
    private static final SubLSymbol $kw607$READ_PROPERTY;
    private static final SubLString $str608$Read_restriction_class__S;
    private static final SubLSymbol $kw609$READ_CLASS;
    private static final SubLString $str610$Got_onProperty_close_tag_when_we_;
    private static final SubLString $str611$Failed_to_read_property_;
    private static final SubLString $str612$Got_onClass_close_tag_when_we_wer;
    private static final SubLString $str613$Failed_to_read_class_;
    private static final SubLString $str614$Read_datatype__S_from__S;
    private static final SubLSymbol $kw615$READ_TYPE;
    private static final SubLString $str616$Read_value__S_from__S;
    private static final SubLSymbol $kw617$READ_VALUE;
    private static final SubLString $str618$Failed_to_read_restriction_value_;
    private static final SubLString $str619$Read_restriction_value__S;
    private static final SubLString $str620$__Reading_OWL_property_starting_w;
    private static final SubLString $str621$__Done_with__S__;
    private static final SubLString $str622$__Reading_OWL_class_starting_with;
    private static final SubLList $list623;
    private static final SubLString $str624$Can_t_parse__S_as_a__A;
    private static final SubLString $str625$boolean;
    private static final SubLList $list626;
    private static final SubLObject $const627$True;
    private static final SubLList $list628;
    private static final SubLObject $const629$False;
    private static final SubLString $str630$Couldn_t_read_boolean_value_from_;
    private static final SubLString $str631$date;
    private static final SubLString $str632$Couldn_t_parse_date_from__S;
    private static final SubLObject $const633$DayFn;
    private static final SubLSymbol $sym634$NAT_FUNCTOR;
    private static final SubLString $str635$Got_multiple_dates_from__S_____S;
    private static final SubLString $str636$Don_t_know_how_to_parse_value_fro;
    private static final SubLSymbol $sym637$XML_NAME;
    private static final SubLString $str638$xml_;
    private static final SubLSymbol $sym639$_XML_NAME_CACHING_STATE_;
    private static final SubLSymbol $sym640$OWL_IMPORTER;
    private static final SubLSymbol $sym641$OWL_IMPORTER_P;
    private static final SubLList $list642;
    private static final SubLList $list643;
    private static final SubLList $list644;
    private static final SubLList $list645;
    private static final SubLSymbol $sym646$PRINT_OWL_IMPORTER;
    private static final SubLSymbol $sym647$OWL_IMPORTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list648;
    private static final SubLSymbol $sym649$OWL_IMP_ID;
    private static final SubLSymbol $sym650$_CSETF_OWL_IMP_ID;
    private static final SubLSymbol $sym651$OWL_IMP_PROGRESS;
    private static final SubLSymbol $sym652$_CSETF_OWL_IMP_PROGRESS;
    private static final SubLSymbol $sym653$OWL_IMP_ERROR_INFO;
    private static final SubLSymbol $sym654$_CSETF_OWL_IMP_ERROR_INFO;
    private static final SubLSymbol $sym655$OWL_IMP_IMPORT_PARAMETERS;
    private static final SubLSymbol $sym656$_CSETF_OWL_IMP_IMPORT_PARAMETERS;
    private static final SubLSymbol $sym657$OWL_IMP_THREAD;
    private static final SubLSymbol $sym658$_CSETF_OWL_IMP_THREAD;
    private static final SubLSymbol $kw659$ID;
    private static final SubLSymbol $kw660$PROGRESS;
    private static final SubLSymbol $kw661$ERROR_INFO;
    private static final SubLSymbol $kw662$IMPORT_PARAMETERS;
    private static final SubLSymbol $kw663$THREAD;
    private static final SubLSymbol $sym664$MAKE_OWL_IMPORTER;
    private static final SubLSymbol $sym665$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER_METHOD;
    private static final SubLString $str666$_OWL_IMPORTER__D_;
    private static final SubLSymbol $sym667$SXHASH_OWL_IMPORTER_METHOD;
    private static final SubLSymbol $sym668$IMPORT_OWL_ONTOLOGY_WITH_IMPORTER;
    private static final SubLList $list669;
    private static final SubLString $str670$OWL_Importer;
    private static final SubLSymbol $sym671$OWL_IMPORTER_RUN;
    private static final SubLList $list672;
    private static final SubLSymbol $sym673$_OWL_IMPORTER_ID_INDEX_;
    private static final SubLSymbol $kw674$IMPORTER;
    private static final SubLString $str675$http___sweet_jpl_nasa_gov_ontolog;
    private static final SubLList $list676;
    private static final SubLString $str677$http___www_w3_org_TR_owl_guide_wi;
    private static final SubLString $str678$WINE_;
    private static final SubLString $str679$_owl;
    private static final SubLString $str680$SWEET_;
    private static final SubLString $str681$http___reliant_teknowledge_com_DA;
    private static final SubLString $str682$SUMO_;
    private static final SubLString $str683$http___open_meta_com_SUMO_owl;
    private static final SubLString $str684$http___kmf_patrick_afspc_ds_af_mi;
    private static final SubLString $str685$KMF_;
    private static final SubLString $str686$_home_baxter_tmp_decision_support;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 887L)
    public static SubLObject owl_importer_v1_version_number() {
        final SubLObject start = Sequences.position_if((SubLObject)owl_to_cycl.$sym1$DIGIT_CHAR_P, owl_to_cycl.$owl_importer_v1_version_number$.getGlobalValue(), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        return string_utilities.remove_last_char(string_utilities.substring(owl_to_cycl.$owl_importer_v1_version_number$.getGlobalValue(), start, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 1213L)
    public static SubLObject current_owl_importer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return owl_to_cycl.$owl_importer$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 1278L)
    public static SubLObject guess_terms_for_owl_term(final SubLObject owl_term, final SubLObject names, final SubLObject mt) {
        assert owl_to_cycl.NIL != term.hl_term_p(owl_term) : owl_term;
        assert owl_to_cycl.NIL != string_utilities.list_of_string_p(names) : names;
        final SubLObject owl_term_isas = isa.min_isa(owl_term, mt, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject owl_term_genls = genls.min_genls(owl_term, mt, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject scored_terms = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject scored_non_wff_terms = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject cdolist_list_var = names;
        SubLObject name = (SubLObject)owl_to_cycl.NIL;
        name = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = guess_forts_from_owl_term_name_non_partitioned(name);
            SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
            v_term = cdolist_list_var_$1.first();
            while (owl_to_cycl.NIL != cdolist_list_var_$1) {
                if (owl_to_cycl.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
                    final SubLObject term_isas = isa.min_isa(v_term, mt, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject term_genls = genls.min_genls(v_term, mt, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject dict = (owl_to_cycl.NIL != disjoint_with.any_disjoint_with_anyP(owl_term_isas, term_isas, mt, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) || owl_to_cycl.NIL != disjoint_with.any_disjoint_with_anyP(owl_term_genls, term_genls, mt, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) ? scored_non_wff_terms : scored_terms;
                    final SubLObject score = at_utilities.isas_and_genls_similarity(owl_term_isas, term_isas, owl_term_genls, term_genls, mt);
                    final SubLObject max = (SubLObject)owl_to_cycl.$int5$255;
                    final SubLObject scaled_int_score = Numbers.truncate(Numbers.divide(Numbers.multiply(score, max), (SubLObject)owl_to_cycl.$int6$100), (SubLObject)owl_to_cycl.UNPROVIDED);
                    dictionary.dictionary_enter(dict, v_term, scaled_int_score);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_term = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return Values.values(dictionary_utilities.sort_dictionary_by_values(scored_terms, Symbols.symbol_function((SubLObject)owl_to_cycl.$sym7$_)), dictionary_utilities.sort_dictionary_by_values(scored_non_wff_terms, Symbols.symbol_function((SubLObject)owl_to_cycl.$sym7$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 2701L)
    public static SubLObject root_classes_of_owl_ontology(final SubLObject owl_ontology) {
        return root_classes_of_owl_ontology_via_index(owl_ontology);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 2896L)
    public static SubLObject clear_owl_importer_caches() {
        clear_owl_found_terms();
        clear_owl_property_element_names();
        clear_owl_class_element_names();
        clear_xml_tokens_from_file();
        clear_note_found_term_resolution();
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 3119L)
    public static SubLObject root_classes_of_owl_ontology_via_inference(final SubLObject owl_ontology) {
        final SubLObject query_result = query_utilities.new_cyc_query_from_indexicalized_kbq(owl_to_cycl.$const8$OWLOntologyQuery_GetRootClasses, owl_ontology, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject root_classes = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = query_result;
        SubLObject v_bindings = (SubLObject)owl_to_cycl.NIL;
        v_bindings = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = bindings.bindings_values(v_bindings);
            SubLObject value = (SubLObject)owl_to_cycl.NIL;
            value = cdolist_list_var_$2.first();
            while (owl_to_cycl.NIL != cdolist_list_var_$2) {
                final SubLObject item_var = value;
                if (owl_to_cycl.NIL == conses_high.member(item_var, root_classes, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                    root_classes = (SubLObject)ConsesLow.cons(item_var, root_classes);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                value = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        }
        return root_classes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 3587L)
    public static SubLObject term_of_owl_ontologyP_via_index(final SubLObject v_term, final SubLObject owl_ontology) {
        return kb_mapping_utilities.pred_u_v_holds_in_any_mt(owl_to_cycl.$const9$synonymousExternalConcept, v_term, owl_ontology, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 3738L)
    public static SubLObject term_of_some_owl_ontologyP_via_index_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            SubLObject owl_ontology = (SubLObject)owl_to_cycl.NIL;
            final SubLObject pred_var = owl_to_cycl.$const9$synonymousExternalConcept;
            if (owl_to_cycl.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)owl_to_cycl.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)owl_to_cycl.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)owl_to_cycl.NIL;
                final SubLObject token_var = (SubLObject)owl_to_cycl.NIL;
                while (owl_to_cycl.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (owl_to_cycl.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)owl_to_cycl.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)owl_to_cycl.$kw13$GAF, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.NIL);
                            SubLObject done_var_$3 = (SubLObject)owl_to_cycl.NIL;
                            final SubLObject token_var_$4 = (SubLObject)owl_to_cycl.NIL;
                            while (owl_to_cycl.NIL == done_var_$3) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                if (owl_to_cycl.NIL != valid_$5) {
                                    owl_ontology = assertions_high.gaf_arg(assertion, (SubLObject)owl_to_cycl.TWO_INTEGER);
                                    if (owl_to_cycl.NIL != isa.isaP(owl_ontology, owl_to_cycl.$const14$owl_Ontology, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                        ans = (SubLObject)owl_to_cycl.T;
                                    }
                                }
                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL == valid_$5);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (owl_to_cycl.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 3738L)
    public static SubLObject term_of_some_owl_ontologyP_via_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return term_of_some_owl_ontologyP_via_index_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQ, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_of_some_owl_ontologyP_via_index_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 4033L)
    public static SubLObject all_terms_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        final SubLObject direct_members = kb_mapping_utilities.pred_values_in_any_mt(owl_ontology, owl_to_cycl.$const9$synonymousExternalConcept, (SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject imported_members = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(owl_ontology, owl_to_cycl.$const15$owl_imports, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject imported_ontology = (SubLObject)owl_to_cycl.NIL;
        imported_ontology = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            imported_members = ConsesLow.append(imported_members, kb_mapping_utilities.pred_values_in_any_mt(imported_ontology, owl_to_cycl.$const9$synonymousExternalConcept, (SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            imported_ontology = cdolist_list_var.first();
        }
        return ConsesLow.append(imported_members, direct_members);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 4645L)
    public static SubLObject owl_ontology_percent_of_classes_merged(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_classes = all_classes_of_owl_ontology_via_index(owl_ontology);
        SubLObject number_merged = (SubLObject)owl_to_cycl.ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = all_classes;
                SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
                v_class = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    if (owl_to_cycl.NIL != owl_class_mergedP_via_index(v_class)) {
                        number_merged = Numbers.add(number_merged, (SubLObject)owl_to_cycl.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_class = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return number_utilities.integer_percent(number_merged, Sequences.length(all_classes), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 5025L)
    public static SubLObject owl_ontology_average_class_depth(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject depths = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            SubLObject cdolist_list_var = all_classes_of_owl_ontology_via_index(owl_ontology);
            SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
            v_class = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject depth = longest_acyclic_genls_path_length(v_class, owl_to_cycl.$const16$Thing, (SubLObject)owl_to_cycl.UNPROVIDED);
                if (owl_to_cycl.NIL == subl_promotions.positive_integer_p(depth)) {
                    Errors.sublisp_break((SubLObject)owl_to_cycl.$str17$Can_t_find_path_from__S_to___Thin, new SubLObject[] { v_class });
                }
                depths = (SubLObject)ConsesLow.cons(depth, depths);
                cdolist_list_var = cdolist_list_var.rest();
                v_class = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((owl_to_cycl.NIL != depths) ? number_utilities.mean(depths) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 5438L)
    public static SubLObject owl_ontology_average_root_class_depth(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject depths = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            SubLObject cdolist_list_var = root_classes_of_owl_ontology(owl_ontology);
            SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
            v_class = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject depth = longest_acyclic_genls_path_length(v_class, owl_to_cycl.$const16$Thing, (SubLObject)owl_to_cycl.UNPROVIDED);
                if (owl_to_cycl.NIL == subl_promotions.positive_integer_p(depth)) {
                    Errors.sublisp_break((SubLObject)owl_to_cycl.$str17$Can_t_find_path_from__S_to___Thin, new SubLObject[] { v_class });
                }
                depths = (SubLObject)ConsesLow.cons(depth, depths);
                cdolist_list_var = cdolist_list_var.rest();
                v_class = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((owl_to_cycl.NIL != depths) ? number_utilities.mean(depths) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 5847L)
    public static SubLObject all_classes_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        return list_utilities.remove_if_not((SubLObject)owl_to_cycl.$sym18$COLLECTION_P, all_terms_of_owl_ontology_via_index(owl_ontology), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 6164L)
    public static SubLObject owl_class_mergedP_via_index(final SubLObject v_class) {
        return (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL != owl_class_merged_upwardP_via_index(v_class) || owl_to_cycl.NIL != owl_class_merged_downwardP_via_index(v_class));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 6438L)
    public static SubLObject owl_class_merged_upwardP_via_index(final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mergedP = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            if (owl_to_cycl.NIL == mergedP) {
                SubLObject node_var = v_class;
                final SubLObject deck_type = (SubLObject)owl_to_cycl.$kw21$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)owl_to_cycl.NIL;
                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((owl_to_cycl.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((owl_to_cycl.NIL != tv_var) ? owl_to_cycl.$sym22$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (owl_to_cycl.NIL != tv_var && owl_to_cycl.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && owl_to_cycl.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)owl_to_cycl.$kw23$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw26$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.$str27$continue_anyway, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw28$WARN)) {
                                    Errors.warn((SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)owl_to_cycl.$str29$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)owl_to_cycl.$str27$continue_anyway, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)owl_to_cycl.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls), thread);
                                if (owl_to_cycl.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || owl_to_cycl.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_class, sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)owl_to_cycl.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)owl_to_cycl.UNPROVIDED);
                                        while (owl_to_cycl.NIL != node_var && owl_to_cycl.NIL == mergedP) {
                                            final SubLObject genl = node_var;
                                            if (!genl.eql(owl_to_cycl.$const16$Thing) && owl_to_cycl.NIL == cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, genl, (SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                mergedP = (SubLObject)owl_to_cycl.T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$12;
                                            SubLObject _prev_bind_1_$13;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$13;
                                            SubLObject iteration_state_$19;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$14;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$21;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$15;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)owl_to_cycl.NIL, rest = accessible_modules; owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((owl_to_cycl.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(owl_to_cycl.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (owl_to_cycl.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED));
                                                        if (owl_to_cycl.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED));
                                                            if (owl_to_cycl.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (owl_to_cycl.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (owl_to_cycl.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (owl_to_cycl.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)owl_to_cycl.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (owl_to_cycl.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (owl_to_cycl.NIL == mergedP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)owl_to_cycl.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != csome_list_var) {
                                                                                                    if (owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)owl_to_cycl.$str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)owl_to_cycl.FIVE_INTEGER, (SubLObject)owl_to_cycl.$str32$attempting_to_bind_direction_link, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (owl_to_cycl.NIL != obsolete.cnat_p(node, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                        new_list = ((owl_to_cycl.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED)));
                                                        for (rest_$21 = (SubLObject)owl_to_cycl.NIL, rest_$21 = new_list; owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != rest_$21; rest_$21 = rest_$21.rest()) {
                                                            generating_fn = rest_$21.first();
                                                            _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (owl_to_cycl.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)owl_to_cycl.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (owl_to_cycl.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (owl_to_cycl.NIL == mergedP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)owl_to_cycl.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != csome_list_var2) {
                                                                            if (owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)owl_to_cycl.$str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.$str33$Node__a_does_not_pass_sbhl_type_t, v_class, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED)), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mergedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 6836L)
    public static SubLObject owl_class_merged_downwardP_via_index(final SubLObject v_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mergedP = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            if (owl_to_cycl.NIL == mergedP) {
                SubLObject node_var = v_class;
                final SubLObject deck_type = (SubLObject)owl_to_cycl.$kw21$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)owl_to_cycl.NIL;
                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((owl_to_cycl.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((owl_to_cycl.NIL != tv_var) ? owl_to_cycl.$sym22$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (owl_to_cycl.NIL != tv_var && owl_to_cycl.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && owl_to_cycl.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)owl_to_cycl.$kw23$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw26$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.$str27$continue_anyway, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw28$WARN)) {
                                    Errors.warn((SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)owl_to_cycl.$str29$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)owl_to_cycl.$str27$continue_anyway, (SubLObject)owl_to_cycl.$str24$_A_is_not_a__A, tv_var, (SubLObject)owl_to_cycl.$sym25$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)owl_to_cycl.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls), thread);
                                if (owl_to_cycl.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || owl_to_cycl.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_class, sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$28 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)owl_to_cycl.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)owl_to_cycl.UNPROVIDED);
                                        while (owl_to_cycl.NIL != node_var && owl_to_cycl.NIL == mergedP) {
                                            final SubLObject genl = node_var;
                                            if (!genl.eql(owl_to_cycl.$const16$Thing) && owl_to_cycl.NIL == cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX, genl, (SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                mergedP = (SubLObject)owl_to_cycl.T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(owl_to_cycl.$const30$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$28;
                                            SubLObject _prev_bind_1_$29;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$29;
                                            SubLObject iteration_state_$35;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$30;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$37;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$31;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)owl_to_cycl.NIL, rest = accessible_modules; owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((owl_to_cycl.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(owl_to_cycl.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (owl_to_cycl.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED));
                                                        if (owl_to_cycl.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED));
                                                            if (owl_to_cycl.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (owl_to_cycl.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (owl_to_cycl.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (owl_to_cycl.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)owl_to_cycl.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (owl_to_cycl.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (owl_to_cycl.NIL == mergedP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)owl_to_cycl.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != csome_list_var) {
                                                                                                    if (owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)owl_to_cycl.$str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$30, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$29, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)owl_to_cycl.FIVE_INTEGER, (SubLObject)owl_to_cycl.$str32$attempting_to_bind_direction_link, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (owl_to_cycl.NIL != obsolete.cnat_p(node, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                        new_list = ((owl_to_cycl.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED)));
                                                        for (rest_$37 = (SubLObject)owl_to_cycl.NIL, rest_$37 = new_list; owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != rest_$37; rest_$37 = rest_$37.rest()) {
                                                            generating_fn = rest_$37.first();
                                                            _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (owl_to_cycl.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)owl_to_cycl.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (owl_to_cycl.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (owl_to_cycl.NIL == mergedP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)owl_to_cycl.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (owl_to_cycl.NIL == mergedP && owl_to_cycl.NIL != csome_list_var2) {
                                                                            if (owl_to_cycl.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)owl_to_cycl.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)owl_to_cycl.$str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$31, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$29, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$28, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.$str33$Node__a_does_not_pass_sbhl_type_t, v_class, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)owl_to_cycl.UNPROVIDED)), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$26, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mergedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7290L)
    public static SubLObject owl_merge_mt() {
        return owl_to_cycl.$owl_merge_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7347L)
    public static SubLObject owl_merge_assert(final SubLObject sentence) {
        return ke.ke_assert_now(sentence, owl_merge_mt(), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7441L)
    public static SubLObject merge_owl_class_with_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const35$coExtensional, owl_class, collection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7583L)
    public static SubLObject merge_owl_term_with_cyc_term(final SubLObject owl_term, final SubLObject cyc_term) {
        if (owl_to_cycl.NIL != fort_types_interface.isa_collectionP(owl_term, (SubLObject)owl_to_cycl.UNPROVIDED) && owl_to_cycl.NIL != fort_types_interface.isa_collectionP(cyc_term, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            return merge_owl_class_with_collection(owl_term, cyc_term);
        }
        return owl_merge_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const36$equals, owl_term, cyc_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7848L)
    public static SubLObject link_owl_class_down_to_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const30$genls, collection, owl_class));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 7984L)
    public static SubLObject link_owl_class_up_to_collection(final SubLObject owl_class, final SubLObject collection) {
        return owl_merge_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const30$genls, owl_class, collection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 8118L)
    public static SubLObject next_owl_term_to_merge_for_ontology(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (owl_to_cycl.NIL == v_term) {
                        SubLObject csome_list_var = Sort.sort(root_classes_of_owl_ontology(owl_ontology), (SubLObject)owl_to_cycl.$sym7$_, (SubLObject)owl_to_cycl.$sym37$MEMOIZED_COUNT_ALL_SPECS);
                        SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
                        v_class = csome_list_var.first();
                        while (owl_to_cycl.NIL == v_term && owl_to_cycl.NIL != csome_list_var) {
                            if (owl_to_cycl.NIL == owl_class_merged_upwardP_via_index(v_class)) {
                                v_term = v_class;
                            }
                            csome_list_var = csome_list_var.rest();
                            v_class = csome_list_var.first();
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$40, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 8480L)
    public static SubLObject memoized_count_all_specs_internal(final SubLObject col) {
        return genls.count_all_specs(col, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 8480L)
    public static SubLObject memoized_count_all_specs(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return memoized_count_all_specs_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym37$MEMOIZED_COUNT_ALL_SPECS, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym37$MEMOIZED_COUNT_ALL_SPECS, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym37$MEMOIZED_COUNT_ALL_SPECS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_count_all_specs_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 8587L)
    public static SubLObject longest_acyclic_genls_path_length(final SubLObject lower, final SubLObject upper, SubLObject mt_info) {
        if (mt_info == owl_to_cycl.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        final SubLObject longest_path = longest_acyclic_genls_path(lower, upper, mt_info);
        return (SubLObject)((owl_to_cycl.NIL != longest_path) ? Sequences.length(longest_path) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 8851L)
    public static SubLObject longest_acyclic_genls_path(final SubLObject lower, final SubLObject upper, SubLObject mt_info) {
        if (mt_info == owl_to_cycl.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != fort_types_interface.isa_collectionP(lower, (SubLObject)owl_to_cycl.UNPROVIDED) : lower;
        assert owl_to_cycl.NIL != fort_types_interface.isa_collectionP(upper, (SubLObject)owl_to_cycl.UNPROVIDED) : upper;
        SubLObject path = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
                if (upper.eql(owl_to_cycl.$const16$Thing) || owl_to_cycl.NIL != genls.genlP(lower, upper, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            path = longest_acyclic_genls_path_internal(lower, upper, (SubLObject)owl_to_cycl.NIL);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$42, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (owl_to_cycl.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)owl_to_cycl.$sym39$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym39$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(owl_to_cycl.$const40$InferencePSC, thread);
                if (upper.eql(owl_to_cycl.$const16$Thing) || owl_to_cycl.NIL != genls.genlP(lower, upper, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$44 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            path = longest_acyclic_genls_path_internal(lower, upper, (SubLObject)owl_to_cycl.NIL);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (owl_to_cycl.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym41$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                if (upper.eql(owl_to_cycl.$const16$Thing) || owl_to_cycl.NIL != genls.genlP(lower, upper, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            path = longest_acyclic_genls_path_internal(lower, upper, (SubLObject)owl_to_cycl.NIL);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym42$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                if (upper.eql(owl_to_cycl.$const16$Thing) || owl_to_cycl.NIL != genls.genlP(lower, upper, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            path = longest_acyclic_genls_path_internal(lower, upper, (SubLObject)owl_to_cycl.NIL);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 9391L)
    public static SubLObject longest_acyclic_genls_path_internal_internal(final SubLObject lower, final SubLObject upper, final SubLObject path_down_from_lower) {
        SubLObject longest_path = (SubLObject)owl_to_cycl.NIL;
        if (upper.eql(owl_to_cycl.$const16$Thing) || owl_to_cycl.NIL != genls.genlP(lower, upper, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            SubLObject min_genls = owl_min_genls_memoized(lower);
            if (owl_to_cycl.NIL != list_utilities.empty_list_p(conses_high.set_difference(min_genls, path_down_from_lower, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED))) {
                min_genls = genls.min_cols(conses_high.set_difference(genls.all_genls(lower, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)ConsesLow.cons(lower, min_genls), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            SubLObject cdolist_list_var = min_genls;
            SubLObject genl = (SubLObject)owl_to_cycl.NIL;
            genl = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                if (owl_to_cycl.NIL == Sequences.find(genl, path_down_from_lower, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    if (genl.equal(upper)) {
                        if (owl_to_cycl.NIL == longest_path) {
                            longest_path = (SubLObject)ConsesLow.list(lower, upper);
                        }
                    }
                    else {
                        final SubLObject subpath = longest_acyclic_genls_path_internal(genl, upper, (SubLObject)ConsesLow.cons(lower, path_down_from_lower));
                        if (owl_to_cycl.NIL != subpath && owl_to_cycl.NIL == list_utilities.greater_length_p(longest_path, subpath)) {
                            longest_path = (SubLObject)ConsesLow.cons(lower, subpath);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            }
        }
        return longest_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 9391L)
    public static SubLObject longest_acyclic_genls_path_internal(final SubLObject lower, final SubLObject upper, final SubLObject path_down_from_lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return longest_acyclic_genls_path_internal_internal(lower, upper, path_down_from_lower);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, (SubLObject)owl_to_cycl.THREE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lower, upper, path_down_from_lower);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lower.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (upper.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && path_down_from_lower.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(longest_acyclic_genls_path_internal_internal(lower, upper, path_down_from_lower)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lower, upper, path_down_from_lower));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 10385L)
    public static SubLObject owl_min_genls_memoized_internal(final SubLObject col) {
        return genls.min_genls(col, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 10385L)
    public static SubLObject owl_min_genls_memoized(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return owl_min_genls_memoized_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym44$OWL_MIN_GENLS_MEMOIZED, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym44$OWL_MIN_GENLS_MEMOIZED, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQ, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym44$OWL_MIN_GENLS_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_min_genls_memoized_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 10492L)
    public static SubLObject genls_tree_with_root_via_index(final SubLObject root, SubLObject direction, SubLObject max_depth) {
        if (direction == owl_to_cycl.UNPROVIDED) {
            direction = (SubLObject)owl_to_cycl.$kw45$UP;
        }
        if (max_depth == owl_to_cycl.UNPROVIDED) {
            max_depth = (SubLObject)owl_to_cycl.TWO_INTEGER;
        }
        return genls_tree_with_root_via_index_internal(root, direction, max_depth, (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 10878L)
    public static SubLObject genls_tree_with_root_via_index_internal(final SubLObject root, final SubLObject direction, final SubLObject max_depth, final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subtrees = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == max_depth || max_depth.isPositive()) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
                SubLObject cdolist_list_var = (direction == owl_to_cycl.$kw45$UP) ? genls.min_genls(root, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) : genls.max_specs(root, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                SubLObject child = (SubLObject)owl_to_cycl.NIL;
                child = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    if (owl_to_cycl.NIL == Sequences.find(child, path, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                        subtrees = (SubLObject)ConsesLow.cons(genls_tree_with_root_via_index_internal(child, direction, (SubLObject)((owl_to_cycl.NIL != max_depth) ? number_utilities.f_1_(max_depth) : owl_to_cycl.NIL), (SubLObject)ConsesLow.cons(root, path)), subtrees);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    child = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)ConsesLow.cons(root, subtrees);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 11357L)
    public static SubLObject root_classes_of_owl_ontology_via_index(final SubLObject owl_ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_classes = all_classes_of_owl_ontology_via_index(owl_ontology);
        SubLObject roots = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
            roots = genls.max_cols(all_classes, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return roots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 11823L)
    public static SubLObject guess_forts_from_owl_term_name(final SubLObject owl_term_name) {
        final SubLObject terms = guess_forts_from_owl_term_name_non_partitioned(owl_term_name);
        return partition_cycl_terms_for_owl_term_name(terms, owl_term_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 12041L)
    public static SubLObject guess_forts_from_owl_term_name_non_partitioned(final SubLObject owl_term_name) {
        SubLObject terms = (SubLObject)owl_to_cycl.NIL;
        final SubLObject constant = constants_high.find_constant(owl_term_name);
        if (owl_to_cycl.NIL != constant) {
            terms = (SubLObject)ConsesLow.cons(constant, terms);
        }
        SubLObject cdolist_list_var = lexicon_accessors.denots_of_string(owl_term_name, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject denot = (SubLObject)owl_to_cycl.NIL;
        denot = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            final SubLObject item_var = denot;
            if (owl_to_cycl.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                terms = (SubLObject)ConsesLow.cons(item_var, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        final SubLObject spaced = string_utilities.space_dont_uncapitalize(owl_term_name);
        if (!spaced.equal(owl_term_name)) {
            SubLObject cdolist_list_var2 = string_utilities.sub_phrases(spaced);
            SubLObject string = (SubLObject)owl_to_cycl.NIL;
            string = cdolist_list_var2.first();
            while (owl_to_cycl.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$50 = lexicon_accessors.denots_of_string(string, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                SubLObject denot2 = (SubLObject)owl_to_cycl.NIL;
                denot2 = cdolist_list_var_$50.first();
                while (owl_to_cycl.NIL != cdolist_list_var_$50) {
                    final SubLObject item_var2 = denot2;
                    if (owl_to_cycl.NIL == conses_high.member(item_var2, terms, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var2, terms);
                    }
                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                    denot2 = cdolist_list_var_$50.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                string = cdolist_list_var2.first();
            }
        }
        if (owl_to_cycl.NIL != Characters.lower_case_p(string_utilities.first_char(owl_term_name)) && owl_to_cycl.NIL == morphology.plural_nounP(owl_term_name)) {
            final SubLObject plural = lexification_utilities.pluralize_word(owl_term_name, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (!plural.equal(owl_term_name)) {
                SubLObject cdolist_list_var2 = guess_forts_from_owl_term_name_non_partitioned(plural);
                SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
                v_term = cdolist_list_var2.first();
                while (owl_to_cycl.NIL != cdolist_list_var2) {
                    final SubLObject item_var3 = v_term;
                    if (owl_to_cycl.NIL == conses_high.member(item_var3, terms, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var3, terms);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    v_term = cdolist_list_var2.first();
                }
            }
        }
        if (owl_to_cycl.NIL != string_utilities.ends_with(owl_term_name, (SubLObject)owl_to_cycl.$str46$Of, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject non_of = string_utilities.substring(owl_term_name, (SubLObject)owl_to_cycl.ZERO_INTEGER, Numbers.subtract(Sequences.length(owl_term_name), (SubLObject)owl_to_cycl.TWO_INTEGER));
            SubLObject cdolist_list_var2 = guess_forts_from_owl_term_name_non_partitioned(non_of);
            SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
            v_term = cdolist_list_var2.first();
            while (owl_to_cycl.NIL != cdolist_list_var2) {
                final SubLObject item_var3 = v_term;
                if (owl_to_cycl.NIL == conses_high.member(item_var3, terms, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var3, terms);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term = cdolist_list_var2.first();
            }
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 13515L)
    public static SubLObject partition_cycl_terms_for_owl_term_name(final SubLObject terms, final SubLObject owl_term_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = (SubLObject)((owl_to_cycl.NIL != Characters.upper_case_p(string_utilities.first_char(owl_term_name))) ? owl_to_cycl.$kw47$COLLECTION : owl_to_cycl.$kw48$PREDICATE);
        SubLObject right_type = (SubLObject)owl_to_cycl.NIL;
        SubLObject wrong_type = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        v_term = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)owl_to_cycl.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(owl_to_cycl.$const12$EverythingPSC, thread);
                final SubLObject pcase_var = type;
                if (pcase_var.eql((SubLObject)owl_to_cycl.$kw47$COLLECTION)) {
                    if (owl_to_cycl.NIL != fort_types_interface.isa_collectionP(v_term, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                        right_type = (SubLObject)ConsesLow.cons(v_term, right_type);
                    }
                    else {
                        wrong_type = (SubLObject)ConsesLow.cons(v_term, wrong_type);
                    }
                }
                else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw48$PREDICATE)) {
                    if (owl_to_cycl.NIL != fort_types_interface.isa_predicateP(v_term, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                        right_type = (SubLObject)ConsesLow.cons(v_term, right_type);
                    }
                    else {
                        wrong_type = (SubLObject)ConsesLow.cons(v_term, wrong_type);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(right_type, wrong_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 24475L)
    public static SubLObject owl_term_names() {
        return Sequences.remove_duplicates(Sequences.cconcatenate(owl_to_cycl.$owl_term_names_preceded_by_parse_type$.getGlobalValue(), new SubLObject[] { owl_to_cycl.$owl_term_names_preceded_by_resource$.getGlobalValue(), owl_to_cycl.$owl_term_names_preceded_by_about$.getGlobalValue(), owl_to_cycl.$owl_term_names_preceded_by_id$.getGlobalValue() }), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 25025L)
    public static SubLObject new_owl_definition_accumulator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.make_list(Sequences.length(owl_to_cycl.$owl_definition_types$.getDynamicValue(thread)), (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 25132L)
    public static SubLObject accumulate_owl_definition(final SubLObject item, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread))) {
            final SubLObject existing = accumulated_owl_definitions_of_type(type);
            final SubLObject name = owl_definition_name(item, type);
            final SubLObject existing_with_name = find_owl_definition_of_type(name, type, existing);
            SubLObject v_new = existing;
            if (owl_to_cycl.NIL != existing_with_name) {
                merge_owl_definitions(item, existing_with_name);
            }
            else {
                v_new = list_utilities.nadd_to_end(item, existing);
            }
            set_accumulated_owl_definitions_of_type(type, v_new);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 25643L)
    public static SubLObject merge_owl_definitions(final SubLObject from, final SubLObject onto) {
        if (owl_to_cycl.NIL != owl_term_info_p(onto)) {
            merge_owl_term_definitions(from, onto);
        }
        else {
            merge_owl_pred_definitions(from, onto);
        }
        return onto;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 25831L)
    public static SubLObject find_accumulated_owl_definition(final SubLObject cyc_name, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) : owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        final SubLObject definitions = ConsesLow.nth(index, owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread));
        return find_owl_definition_of_type(cyc_name, type, definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 26148L)
    public static SubLObject find_owl_definition_of_type(final SubLObject cyc_name, final SubLObject type, final SubLObject definitions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind(type, thread);
            return Sequences.find(cyc_name, definitions, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.$sym56$OWL_DEFINITION_NAME, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 26329L)
    public static SubLObject owl_definition_name(final SubLObject definition, SubLObject type) {
        if (type == owl_to_cycl.UNPROVIDED) {
            type = owl_to_cycl.$owl_definition_type$.getDynamicValue();
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)owl_to_cycl.$kw57$PROPERTY)) {
            final SubLObject name = owl_pred_info_cyc_name(definition);
            return (owl_to_cycl.NIL != name) ? name : owl_pred_info_external_name(definition, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        final SubLObject name = owl_term_info_cyc_name(definition);
        return (owl_to_cycl.NIL != name) ? name : owl_term_info_external_name(definition, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 26720L)
    public static SubLObject accumulated_owl_definitions_of_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) : owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        return ConsesLow.nth(index, owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 26947L)
    public static SubLObject set_accumulated_owl_definitions_of_type(final SubLObject type, final SubLObject definitions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) : owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread);
        final SubLObject index = owl_accumulator_index_for_type(type);
        return ConsesLow.set_nth(index, owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread), definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 27206L)
    public static SubLObject owl_accumulator_index_for_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = Sequences.position(type, owl_to_cycl.$owl_definition_types$.getDynamicValue(thread), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == subl_promotions.non_negative_integer_p(index)) {
            Errors.error((SubLObject)owl_to_cycl.$str58$_S_is_not_a_valid_definition_type, type, owl_to_cycl.$owl_definition_types$.getDynamicValue(thread));
        }
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 27673L)
    public static SubLObject import_owl_ontology(final SubLObject uri, final SubLObject constant_prefix, SubLObject source, SubLObject ontology, SubLObject quoted_isa, SubLObject cyclist, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP) {
        if (source == owl_to_cycl.UNPROVIDED) {
            source = uri;
        }
        if (ontology == owl_to_cycl.UNPROVIDED) {
            ontology = (SubLObject)owl_to_cycl.NIL;
        }
        if (quoted_isa == owl_to_cycl.UNPROVIDED) {
            quoted_isa = (SubLObject)owl_to_cycl.NIL;
        }
        if (cyclist == owl_to_cycl.UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (prefix_external_namesP == owl_to_cycl.UNPROVIDED) {
            prefix_external_namesP = (SubLObject)owl_to_cycl.NIL;
        }
        if (abbreviate_prefixesP == owl_to_cycl.UNPROVIDED) {
            abbreviate_prefixesP = (SubLObject)owl_to_cycl.NIL;
        }
        return import_owl_ontology_from_info(list_utilities.make_plist((SubLObject)owl_to_cycl.$list60, (SubLObject)ConsesLow.list(uri, constant_prefix, source, ontology, quoted_isa, cyclist, prefix_external_namesP, abbreviate_prefixesP)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 29056L)
    public static SubLObject import_owl_ontology_from_info(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uri = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw61$URI, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject uri_prefix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw62$URI_PREFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject constant_prefix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw63$CONSTANT_PREFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject constant_suffix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw64$CONSTANT_SUFFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject source = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw65$SOURCE, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject ontology = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw66$ONTOLOGY, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject quoted_isa = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw67$QUOTED_ISA, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject cyclist = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw68$CYCLIST, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject prefix_external_namesP = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw69$PREFIX_EXTERNAL_NAMES_, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject abbreviate_prefixesP = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw70$ABBREVIATE_PREFIXES_, (SubLObject)owl_to_cycl.UNPROVIDED);
        uri = string_utilities.strip_final_if_char(uri, (SubLObject)Characters.CHAR_hash);
        uri = string_utilities.strip_final_if_char(uri, (SubLObject)Characters.CHAR_slash);
        if (owl_to_cycl.NIL == ontology) {
            ontology = find_or_create_owl_ontology_for_uri(uri, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL == quoted_isa) {
            quoted_isa = find_or_create_term_type_for_ontology(ontology, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL == string_utilities.non_empty_string_p(source)) {
            source = uri;
        }
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == web_utilities.uri_p(source, (SubLObject)owl_to_cycl.UNPROVIDED) && owl_to_cycl.NIL == file_utilities.file_existsP(source)) {
            Errors.error((SubLObject)owl_to_cycl.$str71$Can_only_import_OWL_ontologies_fr);
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            ke.ensure_cyclist_ok();
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        if (owl_to_cycl.NIL != uri && !owl_to_cycl.assertionsDisabledInClass && owl_to_cycl.NIL == web_utilities.uri_p(uri, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            throw new AssertionError(uri);
        }
        final SubLObject source_type = (SubLObject)((owl_to_cycl.NIL != file_utilities.file_existsP(source)) ? owl_to_cycl.$kw73$FILE : owl_to_cycl.$kw74$URL);
        final SubLObject source_file = source_type.eql((SubLObject)owl_to_cycl.$kw73$FILE) ? source : rdf_utilities.download_rdf_url(source, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject import_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject import_parameters = new_owl_import_parameters(ontology, constant_prefix, constant_suffix, quoted_isa, cyclist, uri, uri_prefix, prefix_external_namesP, abbreviate_prefixesP);
        final SubLObject _prev_bind_2 = owl_to_cycl.$owl_import_parameters$.currentBinding(thread);
        final SubLObject _prev_bind_3 = owl_to_cycl.$owl_oe_queue$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_import_parameters$.bind(import_parameters, thread);
            owl_to_cycl.$owl_oe_queue$.bind(new_owl_oe_queue(), thread);
            import_term = reify_term_for_new_import(import_parameters);
            note_owl_import_parameters(import_parameters);
            try {
                import_owl_ontology_internal(source, source_file, uri, import_parameters);
            }
            finally {
                final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    ensure_owl_oe_daemon_running();
                    note_owl_oe_queue_done((SubLObject)owl_to_cycl.UNPROVIDED);
                    wait_for_owl_oe_queue_to_empty((SubLObject)owl_to_cycl.UNPROVIDED);
                    note_import_end_time(import_term, import_parameters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                }
            }
        }
        finally {
            owl_to_cycl.$owl_oe_queue$.rebind(_prev_bind_3, thread);
            owl_to_cycl.$owl_import_parameters$.rebind(_prev_bind_2, thread);
        }
        if (source_type.eql((SubLObject)owl_to_cycl.$kw74$URL)) {
            Filesys.delete_file(source_file);
        }
        note_owl_import_done();
        return import_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31258L)
    public static SubLObject clear_xml_tokens_from_file() {
        final SubLObject cs = owl_to_cycl.$xml_tokens_from_file_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31258L)
    public static SubLObject remove_xml_tokens_from_file(final SubLObject source_file) {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$xml_tokens_from_file_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(source_file), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31258L)
    public static SubLObject xml_tokens_from_file_internal(final SubLObject source_file) {
        SubLObject tokens = (SubLObject)owl_to_cycl.NIL;
        SubLObject stream = (SubLObject)owl_to_cycl.NIL;
        try {
            stream = compatibility.open_text(source_file, (SubLObject)owl_to_cycl.$kw76$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)owl_to_cycl.$str77$Unable_to_open__S, source_file);
            }
            final SubLObject in_stream = stream;
            tokens = Sequences.delete_if((SubLObject)owl_to_cycl.$sym78$WHITESPACE_STRING_, xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)owl_to_cycl.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31258L)
    public static SubLObject xml_tokens_from_file(final SubLObject source_file) {
        SubLObject caching_state = owl_to_cycl.$xml_tokens_from_file_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym75$XML_TOKENS_FROM_FILE, (SubLObject)owl_to_cycl.$sym79$_XML_TOKENS_FROM_FILE_CACHING_STATE_, (SubLObject)owl_to_cycl.$int80$48, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, source_file, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(xml_tokens_from_file_internal(source_file)));
            memoization_state.caching_state_put(caching_state, source_file, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 31514L)
    public static SubLObject import_owl_ontology_internal(SubLObject source, final SubLObject source_file, final SubLObject uri, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str81$__Importing__S_from__S_____, uri, source);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$52 = owl_to_cycl.$owl_definition_accumulator$.currentBinding(thread);
                try {
                    owl_to_cycl.$owl_definition_accumulator$.bind(new_owl_definition_accumulator(), thread);
                    final SubLObject tokens = xml_tokens_from_file(source_file);
                    note_owl_file_encoding(tokens.first(), import_parameters);
                    final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
                    import_owl_ontology_info(ontology, tokens, import_parameters);
                    final SubLObject imported_ontology_uris = verify_imports_for_ontology_tokens(ontology, tokens, import_parameters);
                    validate_and_note_owl_namespaces(tokens, (SubLObject)ConsesLow.cons(uri, imported_ontology_uris), import_parameters);
                    import_named_bnodes(tokens, import_parameters);
                    read_class_info_from_owl_tokens(tokens, import_parameters);
                    SubLObject info = accumulated_owl_definitions_of_type((SubLObject)owl_to_cycl.$kw82$CLASS);
                    SubLObject message = PrintLow.format((SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.$str83$Processing__D_class_definition__P, Sequences.length(info));
                    create_terms_from_owl_data(info, import_parameters, message);
                    read_pred_info_from_owl_tokens(tokens, import_parameters);
                    create_preds_from_owl_data(accumulated_owl_definitions_of_type((SubLObject)owl_to_cycl.$kw57$PROPERTY), import_parameters);
                    read_instance_info_from_owl_tokens(tokens, import_parameters);
                    info = accumulated_owl_definitions_of_type((SubLObject)owl_to_cycl.$kw84$INSTANCE);
                    message = PrintLow.format((SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.$str85$Processing__D_instance_definition, Sequences.length(info));
                    create_terms_from_owl_data(info, import_parameters, message);
                }
                finally {
                    owl_to_cycl.$owl_definition_accumulator$.rebind(_prev_bind_0_$52, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 33163L)
    public static SubLObject note_owl_file_encoding(final SubLObject token, final SubLObject import_parameters) {
        SubLObject encoding = owl_to_cycl.$default_owl_file_encoding$.getGlobalValue();
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, (SubLObject)owl_to_cycl.$str87$_xml)) {
            encoding = xml_parsing_utilities.xml_tag_attribute_value(token, (SubLObject)owl_to_cycl.$str88$encoding, encoding);
        }
        owl_import_parameters_note_encoding(encoding, import_parameters);
        return encoding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 33494L)
    public static SubLObject reify_term_for_new_import(final SubLObject import_parameters) {
        final SubLObject v_term = owl_create(Sequences.cconcatenate((SubLObject)owl_to_cycl.$str89$OWLImport_, owl_ontology_name(import_parameters)), (SubLObject)owl_to_cycl.$list90, owl_to_cycl.$const91$UniversalVocabularyMt, (SubLObject)owl_to_cycl.$str92$, (SubLObject)owl_to_cycl.$str92$, (SubLObject)owl_to_cycl.$kw93$UPCASE, import_parameters);
        note_import_start_time(v_term, import_parameters);
        note_import_ontology(v_term, import_parameters);
        note_import_cyclist(v_term, import_parameters);
        owl_import_parameters_note_import_term(v_term, import_parameters);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 34000L)
    public static SubLObject owl_ontology_name(final SubLObject import_parameters) {
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        return (owl_to_cycl.NIL != constant_handles.constant_p(ontology)) ? constants_high.constant_name(ontology) : owl_import_parameters_base_uri(import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 34257L)
    public static SubLObject note_import_start_time(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject now = date_utilities.indexical_now();
        return owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const94$startingDate, import_term, now), owl_to_cycl.$const91$UniversalVocabularyMt, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 34464L)
    public static SubLObject note_import_ontology(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        return (SubLObject)((owl_to_cycl.NIL != ontology) ? owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const95$infoTransferred, import_term, ontology), owl_to_cycl.$const91$UniversalVocabularyMt, import_parameters) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 34738L)
    public static SubLObject note_import_cyclist(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject cyclist = owl_import_parameters_cyclist(import_parameters);
        return (SubLObject)((owl_to_cycl.NIL != cyclist) ? owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const96$doneBy, import_term, cyclist), owl_to_cycl.$const91$UniversalVocabularyMt, import_parameters) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 34998L)
    public static SubLObject note_import_end_time(final SubLObject import_term, final SubLObject import_parameters) {
        final SubLObject now = date_utilities.indexical_now();
        return owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const97$endingDate, import_term, now), owl_to_cycl.$const91$UniversalVocabularyMt, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 35201L)
    public static SubLObject import_owl_ontology_info(final SubLObject ontology, SubLObject tokens, final SubLObject import_parameters) {
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL == doneP && owl_to_cycl.NIL == list_utilities.empty_list_p(tokens)) {
            final SubLObject token = tokens.first();
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str98$Ontology))) {
                if (owl_to_cycl.NIL == xml_parsing_utilities.xml_empty_tagP(token)) {
                    import_owl_ontology_info_internal(ontology, tokens, import_parameters);
                }
                doneP = (SubLObject)owl_to_cycl.T;
            }
            else if (owl_to_cycl.NIL == xml_parsing_utilities.regular_xml_tagP(token)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str99$RDF))) {
                note_owl_ontology_base_uri(token, import_parameters);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else {
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
        }
        return ontology;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36007L)
    public static SubLObject note_owl_ontology_base_uri(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject base_uri = find_owl_ontology_base_uri(token);
        if (owl_to_cycl.NIL != base_uri) {
            owl_import_parameters_note_base_uri(base_uri, import_parameters);
        }
        return base_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36240L)
    public static SubLObject find_owl_ontology_base_uri(final SubLObject token) {
        SubLObject base_uri = (SubLObject)owl_to_cycl.NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = (SubLObject)owl_to_cycl.NIL;
        SubLObject attributes = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list100);
        element_name = current.first();
        current = (attributes = current.rest());
        SubLObject rest;
        SubLObject cons;
        SubLObject current_$55;
        SubLObject datum_$54;
        SubLObject attribute_name;
        SubLObject value;
        for (rest = (SubLObject)owl_to_cycl.NIL, rest = attributes; owl_to_cycl.NIL == base_uri && owl_to_cycl.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum_$54 = (current_$55 = cons);
            attribute_name = (SubLObject)owl_to_cycl.NIL;
            value = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$55, datum_$54, (SubLObject)owl_to_cycl.$list101);
            attribute_name = current_$55.first();
            current_$55 = (value = current_$55.rest());
            if (attribute_name.equal(xml_name((SubLObject)owl_to_cycl.$str102$base))) {
                if (owl_to_cycl.NIL != web_utilities.uri_p(value, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    base_uri = value;
                }
                else {
                    Errors.warn((SubLObject)owl_to_cycl.$str103$Can_t_recognize_alleged_base_URI_, value);
                }
            }
        }
        return base_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36677L)
    public static SubLObject clear_owl_import_parameters_ontology_context() {
        final SubLObject cs = owl_to_cycl.$owl_import_parameters_ontology_context_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36677L)
    public static SubLObject remove_owl_import_parameters_ontology_context(final SubLObject import_parameters) {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$owl_import_parameters_ontology_context_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(import_parameters), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36677L)
    public static SubLObject owl_import_parameters_ontology_context_internal(final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_context = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
            operation_communication.set_the_cyclist(owl_import_parameters_cyclist(import_parameters));
            v_context = get_owl_ontology_context(owl_import_parameters_ontology(import_parameters));
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return v_context;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36677L)
    public static SubLObject owl_import_parameters_ontology_context(final SubLObject import_parameters) {
        SubLObject caching_state = owl_to_cycl.$owl_import_parameters_ontology_context_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym104$OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT, (SubLObject)owl_to_cycl.$sym105$_OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQL, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, import_parameters, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_import_parameters_ontology_context_internal(import_parameters)));
            memoization_state.caching_state_put(caching_state, import_parameters, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 36996L)
    public static SubLObject get_owl_ontology_context(final SubLObject ontology) {
        return czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(owl_to_cycl.$const106$ContextOfPCWFn, ontology), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 37114L)
    public static SubLObject import_owl_ontology_info_internal(final SubLObject ontology, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(tokens.first(), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str98$Ontology))) {
            Errors.error((SubLObject)owl_to_cycl.$str107$Expected_ontology_token__got__S, tokens.first());
        }
        SubLObject remaining_tokens = tokens.rest();
        final SubLObject ontology_context = owl_import_parameters_ontology_context(import_parameters);
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL == doneP) {
            if (owl_to_cycl.NIL != list_utilities.empty_list_p(remaining_tokens)) {
                Errors.error((SubLObject)owl_to_cycl.$str108$Couldn_t_find_closing_Ontology_ta, list_utilities.first_n((SubLObject)owl_to_cycl.$int109$32, tokens));
            }
            SubLObject token;
            for (token = remaining_tokens.first(); owl_to_cycl.NIL == xml_parsing_utilities.regular_xml_tagP(token); token = remaining_tokens.first()) {
                remaining_tokens = xml_parsing_utilities.advance_xml_tokens(remaining_tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str110$comment))) {
                final SubLObject comment = conses_high.second(remaining_tokens);
                if (owl_to_cycl.NIL != xml_parsing_utilities.regular_xml_tagP(comment)) {
                    Errors.warn((SubLObject)owl_to_cycl.$str111$Expecting_comment__got__S, comment);
                }
                else {
                    owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const112$rdfs_comment, ontology, comment), ontology_context, import_parameters);
                }
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str113$label))) {
                final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(token, xml_name((SubLObject)owl_to_cycl.$str114$lang), (SubLObject)owl_to_cycl.NIL);
                final SubLObject language = (owl_to_cycl.NIL != lang_value) ? html_utilities.decode_html_language_abbreviation(lang_value) : owl_to_cycl.$const115$EnglishLanguage;
                final SubLObject label = conses_high.second(remaining_tokens);
                if (owl_to_cycl.NIL != xml_parsing_utilities.regular_xml_tagP(label)) {
                    Errors.warn((SubLObject)owl_to_cycl.$str116$Expecting_label__got__S, label);
                }
                else {
                    assert_owl_label(ontology, (SubLObject)ConsesLow.cons(label, language), import_parameters);
                }
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str117$priorVersion))) {
                final SubLObject ontology_token = conses_high.second(remaining_tokens);
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(ontology_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str98$Ontology))) {
                    Errors.error((SubLObject)owl_to_cycl.$str107$Expected_ontology_token__got__S, ontology_token);
                }
                final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(ontology_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str118$about), (SubLObject)owl_to_cycl.UNPROVIDED);
                final SubLObject uri = (owl_to_cycl.NIL != web_utilities.uri_p(about_value, (SubLObject)owl_to_cycl.UNPROVIDED)) ? about_value : process_owl_attribute_value(about_value);
                final SubLObject prior_ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
                owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const119$owl_priorVersion, ontology, prior_ontology), owl_to_cycl.$const34$OWLMappingMt, import_parameters);
            }
            else if (owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str120$imports))) {
                if (owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str121$versionInfo))) {
                    if (owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str98$Ontology), token)) {
                        doneP = (SubLObject)owl_to_cycl.T;
                    }
                    else {
                        Errors.warn((SubLObject)owl_to_cycl.$str122$Don_t_know_how_to_handle_ontology, token);
                    }
                }
            }
            remaining_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining_tokens);
        }
        return ontology;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject owl_pred_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_pred_info(v_object, stream, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject owl_pred_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $owl_pred_info_native.class) ? owl_to_cycl.T : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject opi_cyc_name(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject opi_comment(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject opi_domains(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject opi_range(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject opi_plist(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject _csetf_opi_cyc_name(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject _csetf_opi_comment(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject _csetf_opi_domains(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject _csetf_opi_range(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject _csetf_opi_plist(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_pred_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject make_owl_pred_info(SubLObject arglist) {
        if (arglist == owl_to_cycl.UNPROVIDED) {
            arglist = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject v_new = (SubLObject)new $owl_pred_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)owl_to_cycl.NIL, next = arglist; owl_to_cycl.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)owl_to_cycl.$kw142$CYC_NAME)) {
                _csetf_opi_cyc_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw143$COMMENT)) {
                _csetf_opi_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw144$DOMAINS)) {
                _csetf_opi_domains(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw145$RANGE)) {
                _csetf_opi_range(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw146$PLIST)) {
                _csetf_opi_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)owl_to_cycl.$str147$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject visit_defstruct_owl_pred_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw148$BEGIN, (SubLObject)owl_to_cycl.$sym149$MAKE_OWL_PRED_INFO, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw142$CYC_NAME, opi_cyc_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw143$COMMENT, opi_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw144$DOMAINS, opi_domains(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw145$RANGE, opi_range(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw146$PLIST, opi_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw151$END, (SubLObject)owl_to_cycl.$sym149$MAKE_OWL_PRED_INFO, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 39900L)
    public static SubLObject visit_defstruct_object_owl_pred_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_pred_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 40052L)
    public static SubLObject print_owl_pred_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)owl_to_cycl.$str153$_OWL_PRED_INFO__A_, owl_pred_info_external_name(v_object, (SubLObject)owl_to_cycl.UNPROVIDED));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 40236L)
    public static SubLObject find_or_create_owl_pred_info(final SubLObject external_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_info = (SubLObject)((owl_to_cycl.NIL != external_name && owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread))) ? find_accumulated_owl_definition(external_name, (SubLObject)owl_to_cycl.$kw57$PROPERTY) : owl_to_cycl.NIL);
        return (owl_to_cycl.NIL != pred_info) ? pred_info : new_owl_pred_info(external_name, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 40549L)
    public static SubLObject new_owl_pred_info(final SubLObject external_name, SubLObject cyc_name, SubLObject comment, SubLObject domains, SubLObject range) {
        if (cyc_name == owl_to_cycl.UNPROVIDED) {
            cyc_name = (SubLObject)owl_to_cycl.NIL;
        }
        if (comment == owl_to_cycl.UNPROVIDED) {
            comment = (SubLObject)owl_to_cycl.NIL;
        }
        if (domains == owl_to_cycl.UNPROVIDED) {
            domains = (SubLObject)owl_to_cycl.NIL;
        }
        if (range == owl_to_cycl.UNPROVIDED) {
            range = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject pred_info = make_owl_pred_info((SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL != cyc_name) {
            set_owl_pred_info_cyc_name(pred_info, cyc_name);
        }
        set_owl_pred_info_comment(pred_info, comment);
        set_owl_pred_info_domains(pred_info, domains);
        set_owl_pred_info_range(pred_info, range);
        _csetf_opi_plist(pred_info, (SubLObject)owl_to_cycl.NIL);
        if (owl_to_cycl.NIL != external_name) {
            owl_pred_info_plist_enter(pred_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, external_name);
        }
        return pred_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41063L)
    public static SubLObject owl_pred_info_cyc_name(final SubLObject pred_info) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        return opi_cyc_name(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41202L)
    public static SubLObject owl_pred_info_comment(final SubLObject pred_info) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        return opi_comment(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41327L)
    public static SubLObject owl_pred_info_domains(final SubLObject pred_info) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        return opi_domains(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41452L)
    public static SubLObject owl_pred_info_range(final SubLObject pred_info) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        return opi_range(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41573L)
    public static SubLObject owl_pred_info_plist(final SubLObject pred_info) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        return opi_plist(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41694L)
    public static SubLObject owl_pred_info_plist_lookup(final SubLObject pred_info, final SubLObject key, SubLObject default_value) {
        if (default_value == owl_to_cycl.UNPROVIDED) {
            default_value = (SubLObject)owl_to_cycl.NIL;
        }
        return conses_high.getf(opi_plist(pred_info), key, default_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41834L)
    public static SubLObject owl_pred_info_external_name(final SubLObject pred_info, SubLObject default_value) {
        if (default_value == owl_to_cycl.UNPROVIDED) {
            default_value = (SubLObject)owl_to_cycl.NIL;
        }
        return owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, default_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 41992L)
    public static SubLObject set_owl_pred_info_cyc_name(final SubLObject pred_info, final SubLObject name) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        assert owl_to_cycl.NIL != Types.stringp(name) : name;
        _csetf_opi_cyc_name(pred_info, name);
        return opi_cyc_name(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 42209L)
    public static SubLObject set_owl_pred_info_comment(final SubLObject pred_info, final SubLObject comment) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        if (owl_to_cycl.NIL != comment && !owl_to_cycl.assertionsDisabledInClass && owl_to_cycl.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        _csetf_opi_comment(pred_info, comment);
        return opi_comment(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 42430L)
    public static SubLObject set_owl_pred_info_domains(final SubLObject pred_info, final SubLObject domains) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        assert owl_to_cycl.NIL != list_utilities.non_dotted_list_p(domains) : domains;
        _csetf_opi_domains(pred_info, domains);
        return opi_domains(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 42650L)
    public static SubLObject set_owl_pred_info_range(final SubLObject pred_info, final SubLObject range) {
        assert owl_to_cycl.NIL != owl_pred_info_p(pred_info) : pred_info;
        if (owl_to_cycl.NIL != range && !owl_to_cycl.assertionsDisabledInClass && owl_to_cycl.NIL == owl_external_value_specification_p(range)) {
            throw new AssertionError(range);
        }
        _csetf_opi_range(pred_info, range);
        return opi_range(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 42886L)
    public static SubLObject merge_owl_pred_definitions(final SubLObject from, final SubLObject onto) {
        set_owl_pred_info_cyc_name(onto, owl_pred_info_cyc_name(from));
        set_owl_pred_info_comment(onto, owl_pred_info_comment(from));
        set_owl_pred_info_domains(onto, conses_high.union(owl_pred_info_domains(from), owl_pred_info_domains(onto), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED));
        set_owl_pred_info_range(onto, owl_pred_info_range(from));
        SubLObject remainder;
        SubLObject property;
        SubLObject from_value;
        SubLObject onto_value;
        SubLObject new_value;
        for (remainder = (SubLObject)owl_to_cycl.NIL, remainder = owl_pred_info_plist(from); owl_to_cycl.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            from_value = conses_high.cadr(remainder);
            onto_value = owl_pred_info_plist_lookup(onto, property, (SubLObject)owl_to_cycl.UNPROVIDED);
            new_value = ((owl_to_cycl.NIL != owl_term_info_plist_list_propertyP(property)) ? conses_high.union(from_value, onto_value, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED) : from_value);
            owl_pred_info_plist_enter(onto, property, new_value);
        }
        return onto;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 43581L)
    public static SubLObject owl_external_value_specification_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL != owl_external_value_specification_union_p(v_object) || owl_to_cycl.NIL != owl_external_value_specification_intersection_p(v_object) || owl_to_cycl.NIL != owl_external_term_enumeration_p(v_object) || owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(v_object) || owl_to_cycl.NIL != nonlocal_owl_term_reference_p(v_object) || owl_to_cycl.NIL != owl_restriction_p(v_object) || owl_to_cycl.NIL != pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list158) || owl_to_cycl.NIL != node_id_specification_p(v_object) || owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, v_object, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) || owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44148L)
    public static SubLObject node_id_specification_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list160);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44265L)
    public static SubLObject owl_restriction_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list161);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44404L)
    public static SubLObject owl_external_value_specification_union_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list162);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44532L)
    public static SubLObject owl_external_value_specification_union_names(final SubLObject union) {
        return union.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44623L)
    public static SubLObject owl_external_value_specification_intersection_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list163);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44768L)
    public static SubLObject owl_external_value_specification_intersection_names(final SubLObject intersection) {
        final SubLObject names = intersection.rest();
        return names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 44907L)
    public static SubLObject owl_external_term_enumeration_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list164);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 45027L)
    public static SubLObject owl_external_term_enumeration_terms(final SubLObject enumeration) {
        assert owl_to_cycl.NIL != owl_external_term_enumeration_p(enumeration) : enumeration;
        return enumeration.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 45180L)
    public static SubLObject owl_pred_info_plist_enter(final SubLObject pred_info, final SubLObject key, final SubLObject value) {
        _csetf_opi_plist(pred_info, conses_high.putf(opi_plist(pred_info), key, value));
        return opi_plist(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 45349L)
    public static SubLObject owl_pred_info_plist_push(final SubLObject pred_info, final SubLObject key, final SubLObject value) {
        final SubLObject existing = conses_high.getf(opi_plist(pred_info), key, (SubLObject)owl_to_cycl.NIL);
        final SubLObject v_new = (SubLObject)((owl_to_cycl.NIL != Sequences.find(value, existing, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) ? existing : ConsesLow.cons(value, existing));
        owl_pred_info_plist_enter(pred_info, key, v_new);
        return opi_plist(pred_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 45637L)
    public static SubLObject sxhash_owl_pred_info_method(final SubLObject v_object) {
        return sxhash_owl_pred_info(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 45743L)
    public static SubLObject sxhash_owl_pred_info(final SubLObject pred_info) {
        return Sxhash.sxhash(opi_cyc_name(pred_info));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject owl_import_parameters_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_import_parameters(v_object, stream, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject owl_import_parameters_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $owl_import_parameters_native.class) ? owl_to_cycl.T : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_ontology(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_namespace_map(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_constant_prefix(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_constant_suffix(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_base_uri(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_uri_prefix(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_cyclist(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_quoted_isa(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_prefix_external_namesP(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_abbreviate_prefixesP(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_import_term(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject oip_encoding(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_ontology(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_namespace_map(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_constant_prefix(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_constant_suffix(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_base_uri(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_uri_prefix(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_cyclist(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_quoted_isa(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_prefix_external_namesP(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_abbreviate_prefixesP(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_import_term(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject _csetf_oip_encoding(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject make_owl_import_parameters(SubLObject arglist) {
        if (arglist == owl_to_cycl.UNPROVIDED) {
            arglist = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject v_new = (SubLObject)new $owl_import_parameters_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)owl_to_cycl.NIL, next = arglist; owl_to_cycl.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)owl_to_cycl.$kw66$ONTOLOGY)) {
                _csetf_oip_ontology(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw200$NAMESPACE_MAP)) {
                _csetf_oip_namespace_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw63$CONSTANT_PREFIX)) {
                _csetf_oip_constant_prefix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw64$CONSTANT_SUFFIX)) {
                _csetf_oip_constant_suffix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw201$BASE_URI)) {
                _csetf_oip_base_uri(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw62$URI_PREFIX)) {
                _csetf_oip_uri_prefix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw68$CYCLIST)) {
                _csetf_oip_cyclist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw67$QUOTED_ISA)) {
                _csetf_oip_quoted_isa(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw69$PREFIX_EXTERNAL_NAMES_)) {
                _csetf_oip_prefix_external_namesP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw70$ABBREVIATE_PREFIXES_)) {
                _csetf_oip_abbreviate_prefixesP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw202$IMPORT_TERM)) {
                _csetf_oip_import_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw203$ENCODING)) {
                _csetf_oip_encoding(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)owl_to_cycl.$str147$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject visit_defstruct_owl_import_parameters(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw148$BEGIN, (SubLObject)owl_to_cycl.$sym204$MAKE_OWL_IMPORT_PARAMETERS, (SubLObject)owl_to_cycl.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw66$ONTOLOGY, oip_ontology(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw200$NAMESPACE_MAP, oip_namespace_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw63$CONSTANT_PREFIX, oip_constant_prefix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw64$CONSTANT_SUFFIX, oip_constant_suffix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw201$BASE_URI, oip_base_uri(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw62$URI_PREFIX, oip_uri_prefix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw68$CYCLIST, oip_cyclist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw67$QUOTED_ISA, oip_quoted_isa(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw69$PREFIX_EXTERNAL_NAMES_, oip_prefix_external_namesP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw70$ABBREVIATE_PREFIXES_, oip_abbreviate_prefixesP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw202$IMPORT_TERM, oip_import_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw203$ENCODING, oip_encoding(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw151$END, (SubLObject)owl_to_cycl.$sym204$MAKE_OWL_IMPORT_PARAMETERS, (SubLObject)owl_to_cycl.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46489L)
    public static SubLObject visit_defstruct_object_owl_import_parameters_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_import_parameters(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 46793L)
    public static SubLObject print_owl_import_parameters(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject ontology = oip_ontology(v_object);
        PrintLow.format(stream, (SubLObject)owl_to_cycl.$str206$_OWL_IMPORT_PARAMETERS__S_, (owl_to_cycl.NIL != ontology) ? ontology : oip_constant_prefix(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 47043L)
    public static SubLObject new_owl_import_parameters(final SubLObject ontology, final SubLObject constant_prefix, final SubLObject constant_suffix, final SubLObject quoted_isa, final SubLObject cyclist, final SubLObject uri, final SubLObject uri_prefix, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP) {
        if (prefix_external_namesP == owl_to_cycl.UNPROVIDED) {
            prefix_external_namesP = (SubLObject)owl_to_cycl.NIL;
        }
        if (abbreviate_prefixesP == owl_to_cycl.UNPROVIDED) {
            abbreviate_prefixesP = (SubLObject)owl_to_cycl.NIL;
        }
        assert owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(ontology) : ontology;
        assert owl_to_cycl.NIL != Types.stringp(constant_prefix) : constant_prefix;
        assert owl_to_cycl.NIL != Types.stringp(constant_suffix) : constant_suffix;
        assert owl_to_cycl.NIL != Types.stringp(uri_prefix) : uri_prefix;
        assert owl_to_cycl.NIL != kb_accessors.cyclistP(cyclist) : cyclist;
        assert owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(quoted_isa) : quoted_isa;
        final SubLObject parameters = make_owl_import_parameters((SubLObject)owl_to_cycl.UNPROVIDED);
        _csetf_oip_ontology(parameters, ontology);
        _csetf_oip_constant_prefix(parameters, constant_prefix);
        _csetf_oip_constant_suffix(parameters, constant_suffix);
        _csetf_oip_cyclist(parameters, cyclist_using_owl_importer_v1(cyclist));
        _csetf_oip_quoted_isa(parameters, quoted_isa);
        _csetf_oip_base_uri(parameters, uri);
        _csetf_oip_uri_prefix(parameters, uri_prefix);
        _csetf_oip_prefix_external_namesP(parameters, prefix_external_namesP);
        _csetf_oip_abbreviate_prefixesP(parameters, abbreviate_prefixesP);
        return parameters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 48442L)
    public static SubLObject cyclist_using_owl_importer_v1(final SubLObject cyclist) {
        final SubLObject version_string = owl_importer_v1_version_number();
        final SubLObject versioned_tool_nat = el_utilities.make_binary_formula(owl_to_cycl.$const209$SoftwareVersionFn, owl_to_cycl.$const210$OWLImporter_Cyc, version_string);
        return czer_main.cyc_find_or_create_nart(el_utilities.make_binary_formula(owl_to_cycl.$const211$UserOfProgramFn, versioned_tool_nat, cyclist), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 48762L)
    public static SubLObject owl_import_parameters_ontology(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_ontology(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 48920L)
    public static SubLObject owl_import_parameters_lookup_namespace(final SubLObject namespace, final SubLObject import_parameters) {
        return list_utilities.alist_lookup_without_values(oip_namespace_map(import_parameters), namespace, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49101L)
    public static SubLObject owl_import_parameters_constant_prefix(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_constant_prefix(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49261L)
    public static SubLObject owl_import_parameters_constant_suffix(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_constant_suffix(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49421L)
    public static SubLObject owl_import_parameters_base_uri(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_base_uri(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49567L)
    public static SubLObject owl_import_parameters_uri_prefix(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_uri_prefix(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49717L)
    public static SubLObject owl_import_parameters_cyclist(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_cyclist(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 49861L)
    public static SubLObject owl_import_parameters_quoted_isa(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_quoted_isa(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 50011L)
    public static SubLObject owl_import_parameters_prefix_external_namesP(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_prefix_external_namesP(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 50185L)
    public static SubLObject owl_import_parameters_abbreviate_prefixesP(final SubLObject parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(parameters) : parameters;
        return oip_abbreviate_prefixesP(parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 50355L)
    public static SubLObject owl_import_parameters_import_term(final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        return oip_import_term(import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 50528L)
    public static SubLObject owl_import_parameters_encoding(final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        return oip_encoding(import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 50695L)
    public static SubLObject owl_import_parameters_note_namespace(final SubLObject namespace, final SubLObject uri, final SubLObject import_parameters) {
        final SubLObject alist = oip_namespace_map(import_parameters);
        final SubLObject existing = owl_import_parameters_lookup_namespace(namespace, import_parameters);
        if (owl_to_cycl.NIL == existing) {
            _csetf_oip_namespace_map(import_parameters, list_utilities.alist_enter(alist, namespace, uri, (SubLObject)owl_to_cycl.UNPROVIDED));
        }
        else if (!existing.equal(uri)) {
            Errors.error((SubLObject)owl_to_cycl.$str212$Multiple_uris_for__S_____S____S, namespace, uri, existing);
        }
        return oip_namespace_map(import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 51214L)
    public static SubLObject owl_import_parameters_note_base_uri(final SubLObject base_uri, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        _csetf_oip_base_uri(import_parameters, base_uri);
        return base_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 51423L)
    public static SubLObject owl_import_parameters_note_import_term(final SubLObject v_term, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        assert owl_to_cycl.NIL != forts.fort_p(v_term) : v_term;
        _csetf_oip_import_term(import_parameters, v_term);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 51653L)
    public static SubLObject owl_import_parameters_note_encoding(final SubLObject encoding, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        assert owl_to_cycl.NIL != Types.stringp(encoding) : encoding;
        _csetf_oip_encoding(import_parameters, encoding);
        return encoding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 51894L)
    public static SubLObject sxhash_owl_import_parameters_method(final SubLObject v_object) {
        return sxhash_owl_import_parameters(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 52016L)
    public static SubLObject sxhash_owl_import_parameters(final SubLObject parameters) {
        return Sxhash.sxhash(oip_ontology(parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 52131L)
    public static SubLObject verify_imports_for_ontology_tokens(final SubLObject this_ontology, final SubLObject tokens, final SubLObject import_parameters) {
        SubLObject ontology_uris = (SubLObject)owl_to_cycl.NIL;
        SubLObject store = (SubLObject)owl_to_cycl.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)owl_to_cycl.NIL);
            SubLObject cdolist_list_var = tokens;
            SubLObject token = (SubLObject)owl_to_cycl.NIL;
            token = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str120$imports))) {
                    final SubLObject ontology_uri = string_utilities.post_remove(xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.$str216$_, (SubLObject)owl_to_cycl.UNPROVIDED);
                    if (owl_to_cycl.NIL != web_utilities.uri_p(ontology_uri, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                        final SubLObject ontology = find_or_create_owl_ontology_for_uri(ontology_uri, import_parameters, store);
                        owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const15$owl_imports, this_ontology, ontology), owl_to_cycl.$const34$OWLMappingMt, import_parameters);
                        ontology_uris = (SubLObject)ConsesLow.cons(ontology_uri, ontology_uris);
                    }
                    else {
                        note_owl_failure(Sequences.cconcatenate((SubLObject)owl_to_cycl.$str217$interpretation_of_, new SubLObject[] { format_nil.format_nil_s_no_copy(ontology_uri), owl_to_cycl.$str218$_as_a_URI_for_an_imported_ontolog }), (SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)owl_to_cycl.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ontology_uris;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 52904L)
    public static SubLObject validate_and_note_owl_namespaces(final SubLObject tokens, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        SubLObject unknown_namespaces = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)owl_to_cycl.NIL;
        token = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            if (owl_to_cycl.NIL != xml_parsing_utilities.regular_xml_tagP(token)) {
                final SubLObject v_new = validate_and_note_owl_namespaces_for_token(token, imported_ontology_uris, import_parameters);
                unknown_namespaces = ConsesLow.append(unknown_namespaces, v_new);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        if (owl_to_cycl.NIL != unknown_namespaces) {
            SubLObject problem = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL == problem) {
                SubLObject csome_list_var = tokens;
                SubLObject token2 = (SubLObject)owl_to_cycl.NIL;
                token2 = csome_list_var.first();
                while (owl_to_cycl.NIL == problem && owl_to_cycl.NIL != csome_list_var) {
                    if (owl_to_cycl.NIL != xml_parsing_utilities.regular_xml_tagP(token2)) {
                        SubLObject rest;
                        SubLObject cons;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject namespace;
                        SubLObject problem_string;
                        SubLObject current_$57;
                        SubLObject datum_$56;
                        SubLObject element_name;
                        SubLObject attributes;
                        SubLObject rest_$58;
                        SubLObject cons_$59;
                        SubLObject current_$58;
                        SubLObject datum_$57;
                        SubLObject attribute_name;
                        SubLObject value;
                        for (rest = (SubLObject)owl_to_cycl.NIL, rest = unknown_namespaces; owl_to_cycl.NIL == problem && owl_to_cycl.NIL != rest; rest = rest.rest()) {
                            cons = rest.first();
                            datum = (current = cons);
                            namespace = (SubLObject)owl_to_cycl.NIL;
                            problem_string = (SubLObject)owl_to_cycl.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list219);
                            namespace = current.first();
                            current = (problem_string = current.rest());
                            if (owl_to_cycl.NIL != string_utilities.substringP(namespace, token2, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                                datum_$56 = (current_$57 = xml_parsing_utilities.parse_xml_token(token2));
                                element_name = (SubLObject)owl_to_cycl.NIL;
                                attributes = (SubLObject)owl_to_cycl.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$57, datum_$56, (SubLObject)owl_to_cycl.$list100);
                                element_name = current_$57.first();
                                current_$57 = (attributes = current_$57.rest());
                                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(element_name) && namespace.equal(xml_parsing_utilities.xml_prefixed_name_namespace(element_name))) {
                                    problem = problem_string;
                                }
                                for (rest_$58 = (SubLObject)owl_to_cycl.NIL, rest_$58 = attributes; owl_to_cycl.NIL == problem && owl_to_cycl.NIL != rest_$58; rest_$58 = rest_$58.rest()) {
                                    cons_$59 = rest_$58.first();
                                    datum_$57 = (current_$58 = cons_$59);
                                    attribute_name = (SubLObject)owl_to_cycl.NIL;
                                    value = (SubLObject)owl_to_cycl.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current_$58, datum_$57, (SubLObject)owl_to_cycl.$list220);
                                    attribute_name = current_$58.first();
                                    current_$58 = (value = current_$58.rest());
                                    if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(attribute_name) && namespace.equal(xml_parsing_utilities.xml_prefixed_name_namespace(attribute_name))) {
                                        problem = problem_string;
                                    }
                                }
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    token2 = csome_list_var.first();
                }
            }
            if (owl_to_cycl.NIL != problem) {
                Errors.error((SubLObject)owl_to_cycl.$str221$Namespace_problem___A, problem);
            }
        }
        return (SubLObject)owl_to_cycl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 54059L)
    public static SubLObject validate_and_note_owl_namespaces_for_token(final SubLObject token, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        SubLObject problems = (SubLObject)owl_to_cycl.NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = (SubLObject)owl_to_cycl.NIL;
        SubLObject attributes = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list100);
        element_name = current.first();
        current = current.rest();
        SubLObject cdolist_list_var;
        attributes = (cdolist_list_var = current);
        SubLObject cons = (SubLObject)owl_to_cycl.NIL;
        cons = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            SubLObject current_$63;
            final SubLObject datum_$62 = current_$63 = cons;
            SubLObject attribute_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject value = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)owl_to_cycl.$list101);
            attribute_name = current_$63.first();
            current_$63 = (value = current_$63.rest());
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(attribute_name) && owl_to_cycl.$str222$xmlns.equal(xml_parsing_utilities.xml_prefixed_name_namespace(attribute_name))) {
                final SubLObject new_problem = validate_and_note_owl_namespace(attribute_name, value, imported_ontology_uris, import_parameters);
                if (owl_to_cycl.NIL != new_problem) {
                    problems = (SubLObject)ConsesLow.cons(new_problem, problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 54770L)
    public static SubLObject validate_and_note_owl_namespace(final SubLObject name, final SubLObject value, final SubLObject imported_ontology_uris, final SubLObject import_parameters) {
        final SubLObject namespace = xml_parsing_utilities.xml_prefixed_name_local_name(name);
        owl_import_parameters_note_namespace(namespace, value, import_parameters);
        return (owl_to_cycl.NIL != owl_reserved_namespace_p(namespace)) ? owl_reserved_namespace_problem(namespace, value) : owl_imported_namespace_problem(value, imported_ontology_uris);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 55497L)
    public static SubLObject owl_reserved_namespace_p(final SubLObject namespace) {
        return list_utilities.alist_has_keyP(owl_to_cycl.$owl_reserved_namespaces$.getGlobalValue(), namespace, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 55621L)
    public static SubLObject owl_reserved_namespace_problem(final SubLObject namespace, final SubLObject value) {
        return (SubLObject)((owl_to_cycl.NIL != subl_promotions.memberP(value, list_utilities.alist_lookup_without_values(owl_to_cycl.$owl_reserved_namespaces$.getGlobalValue(), namespace, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.NIL), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) ? owl_to_cycl.NIL : ConsesLow.cons(value, Sequences.cconcatenate(format_nil.format_nil_s_no_copy(namespace), new SubLObject[] { owl_to_cycl.$str224$_is_bound_to_, format_nil.format_nil_s_no_copy(value), owl_to_cycl.$str225$_, format_nil.$format_nil_percent$.getGlobalValue(), owl_to_cycl.$str226$_Must_be_one_of_, format_nil.format_nil_s_no_copy(list_utilities.alist_lookup_without_values(owl_to_cycl.$owl_reserved_namespaces$.getGlobalValue(), namespace, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.UNPROVIDED)) })));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 55966L)
    public static SubLObject owl_imported_namespace_problem(final SubLObject value, final SubLObject imported_ontology_uris) {
        SubLObject foundP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == foundP) {
            SubLObject csome_list_var = imported_ontology_uris;
            SubLObject uri = (SubLObject)owl_to_cycl.NIL;
            uri = csome_list_var.first();
            while (owl_to_cycl.NIL == foundP && owl_to_cycl.NIL != csome_list_var) {
                if (value.equal(uri) || (owl_to_cycl.NIL != string_utilities.starts_with(value, uri) && owl_to_cycl.NIL != list_utilities.lengthE(value, number_utilities.f_1X(Sequences.length(uri)), (SubLObject)owl_to_cycl.UNPROVIDED) && Characters.CHAR_hash.eql(string_utilities.last_char(value)))) {
                    foundP = (SubLObject)owl_to_cycl.T;
                }
                csome_list_var = csome_list_var.rest();
                uri = csome_list_var.first();
            }
        }
        return (SubLObject)((owl_to_cycl.NIL != foundP) ? owl_to_cycl.NIL : ConsesLow.cons(value, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str227$No_import_statement_for_, format_nil.format_nil_s_no_copy(value))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 56369L)
    public static SubLObject clear_find_or_create_owl_ontology_for_uri() {
        final SubLObject cs = owl_to_cycl.$find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 56369L)
    public static SubLObject remove_find_or_create_owl_ontology_for_uri(final SubLObject uri, SubLObject import_parameters, SubLObject problem_store) {
        if (import_parameters == owl_to_cycl.UNPROVIDED) {
            import_parameters = (SubLObject)owl_to_cycl.NIL;
        }
        if (problem_store == owl_to_cycl.UNPROVIDED) {
            problem_store = (SubLObject)owl_to_cycl.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(uri, import_parameters, problem_store), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 56369L)
    public static SubLObject find_or_create_owl_ontology_for_uri_internal(final SubLObject uri, final SubLObject import_parameters, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != web_utilities.uri_p(uri, (SubLObject)owl_to_cycl.UNPROVIDED) : uri;
        if (owl_to_cycl.NIL != import_parameters && !owl_to_cycl.assertionsDisabledInClass && owl_to_cycl.NIL == owl_import_parameters_p(import_parameters)) {
            throw new AssertionError(import_parameters);
        }
        SubLObject ontology = (SubLObject)((owl_to_cycl.NIL != import_parameters && uri.equal(owl_import_parameters_base_uri(import_parameters))) ? owl_import_parameters_ontology(import_parameters) : owl_to_cycl.NIL);
        if (owl_to_cycl.NIL == ontology) {
            ontology = ask_utilities.query_template((SubLObject)owl_to_cycl.$sym229$_ONTOLOGY, (SubLObject)ConsesLow.list(owl_to_cycl.$const230$and, (SubLObject)owl_to_cycl.$list231, (SubLObject)ConsesLow.list(owl_to_cycl.$const232$salientURI, (SubLObject)owl_to_cycl.$sym229$_ONTOLOGY, uri)), owl_to_cycl.$const40$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)owl_to_cycl.$kw233$INFERENCE_MODE, (SubLObject)owl_to_cycl.$kw234$MINIMAL, (SubLObject)owl_to_cycl.$kw235$PROBLEM_STORE, problem_store, (SubLObject)owl_to_cycl.$list236)).first();
            if (owl_to_cycl.NIL == ontology) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str238$Couldn_t_find_ontology_for__S__Cr, owl_to_cycl.$str239$__ }), uri);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                ontology = czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(owl_to_cycl.$const240$OWLOntologyFn, uri), (SubLObject)owl_to_cycl.UNPROVIDED);
            }
        }
        return ontology;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 56369L)
    public static SubLObject find_or_create_owl_ontology_for_uri(final SubLObject uri, SubLObject import_parameters, SubLObject problem_store) {
        if (import_parameters == owl_to_cycl.UNPROVIDED) {
            import_parameters = (SubLObject)owl_to_cycl.NIL;
        }
        if (problem_store == owl_to_cycl.UNPROVIDED) {
            problem_store = (SubLObject)owl_to_cycl.NIL;
        }
        SubLObject caching_state = owl_to_cycl.$find_or_create_owl_ontology_for_uri_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym228$FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI, (SubLObject)owl_to_cycl.$sym241$_FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.THREE_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(uri, import_parameters, problem_store);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (import_parameters.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && problem_store.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_or_create_owl_ontology_for_uri_internal(uri, import_parameters, problem_store)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(uri, import_parameters, problem_store));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 57282L)
    public static SubLObject find_or_create_term_type_for_ontology(final SubLObject ontology, SubLObject problem_store) {
        if (problem_store == owl_to_cycl.UNPROVIDED) {
            problem_store = (SubLObject)owl_to_cycl.NIL;
        }
        assert owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(ontology) : ontology;
        SubLObject term_type = ask_utilities.query_variable((SubLObject)owl_to_cycl.$sym242$_TERM_TYPE, (SubLObject)ConsesLow.listS(owl_to_cycl.$const243$termTypeForOntology, ontology, (SubLObject)owl_to_cycl.$list244), owl_to_cycl.$const34$OWLMappingMt, (SubLObject)ConsesLow.listS((SubLObject)owl_to_cycl.$kw233$INFERENCE_MODE, (SubLObject)owl_to_cycl.$kw234$MINIMAL, (SubLObject)owl_to_cycl.$kw235$PROBLEM_STORE, problem_store, (SubLObject)owl_to_cycl.$list236)).first();
        if (owl_to_cycl.NIL == term_type) {
            term_type = czer_main.canonicalize_term((SubLObject)ConsesLow.list(owl_to_cycl.$const245$TermFromOntologyFn, ontology), (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return term_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 57784L)
    public static SubLObject read_pred_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw57$PROPERTY, thread);
            SubLObject pred_info = (SubLObject)owl_to_cycl.NIL;
            while (owl_to_cycl.NIL != current_token) {
                thread.resetMultipleValues();
                final SubLObject new_pred_info = read_one_owl_chunk_for_pred_info(current_token, pred_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject pred_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (!pred_info.eql(new_pred_info)) {
                    pred_info = new_pred_info;
                }
                if (owl_to_cycl.NIL != pred_info_doneP) {
                    accumulate_owl_definition(new_pred_info, (SubLObject)owl_to_cycl.$kw57$PROPERTY);
                    pred_info = (SubLObject)owl_to_cycl.NIL;
                }
                if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                }
                else if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else {
                    final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                    tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
                }
                current_token = (SubLObject)((owl_to_cycl.NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : owl_to_cycl.NIL);
            }
            if (owl_to_cycl.NIL != pred_info) {
                if (owl_to_cycl.NIL != owl_pred_info_range(pred_info)) {
                    accumulate_owl_definition(pred_info, (SubLObject)owl_to_cycl.$kw57$PROPERTY);
                }
                else if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                    Errors.warn((SubLObject)owl_to_cycl.$str247$There_is_no_range_for__S__Name_to, pred_info, current_token);
                }
            }
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59201L)
    public static SubLObject clear_owl_property_element_names() {
        final SubLObject cs = owl_to_cycl.$owl_property_element_names_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59201L)
    public static SubLObject remove_owl_property_element_names() {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$owl_property_element_names_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(owl_to_cycl.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59201L)
    public static SubLObject owl_property_element_names_internal() {
        return (SubLObject)ConsesLow.list(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str249$DatatypeProperty), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str250$AnnotationProperty), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str251$ObjectProperty), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str252$FunctionalProperty), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str253$SymmetricProperty), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str254$TransitiveProperty));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59201L)
    public static SubLObject owl_property_element_names() {
        SubLObject caching_state = owl_to_cycl.$owl_property_element_names_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym248$OWL_PROPERTY_ELEMENT_NAMES, (SubLObject)owl_to_cycl.$sym255$_OWL_PROPERTY_ELEMENT_NAMES_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQL, (SubLObject)owl_to_cycl.ZERO_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_property_element_names_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59479L)
    public static SubLObject owl_property_token_p(final SubLObject token) {
        return subl_promotions.memberP(xml_parsing_utilities.xml_token_element_name(token), owl_property_element_names(), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 59612L)
    public static SubLObject read_one_owl_chunk_for_pred_info(final SubLObject current_token, final SubLObject pred_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_pred_info = pred_info;
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
        SubLObject pred_info_doneP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_starts_with(current_token, (SubLObject)owl_to_cycl.$str256$____)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, (SubLObject)owl_to_cycl.$str257$___, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !comment_close_position.isInteger()) {
                Errors.error((SubLObject)owl_to_cycl.$str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, tokens));
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str259$Skipping_comment___S, owl_to_cycl.$str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        }
        else if (owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tag_p(current_token) && owl_to_cycl.NIL != owl_property_token_p(current_token)) {
            SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject cyc_name = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                thread.resetMultipleValues();
                final SubLObject external_name_$64 = pred_names_from_token(current_token, import_parameters);
                final SubLObject cyc_name_$65 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                external_name = external_name_$64;
                cyc_name = cyc_name_$65;
            }
            new_pred_info = find_or_create_owl_pred_info(external_name);
            if (owl_to_cycl.NIL != cyc_name) {
                set_owl_pred_info_cyc_name(new_pred_info, cyc_name);
            }
            final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
            owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw260$ISAS, type);
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                pred_info_doneP = (SubLObject)owl_to_cycl.T;
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != owl_class_token_p(current_token)) {
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL == pred_info) {
            token_advance_spec = handle_non_target_owl_token(current_token);
        }
        else if (owl_to_cycl.NIL != string_utilities.whitespace_stringP(current_token)) {
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str262$type))) {
            owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw260$ISAS, term_names_from_token(current_token, import_parameters));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str113$label))) {
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                Errors.error((SubLObject)owl_to_cycl.$str263$Can_t_interpret_empty_label_token, current_token);
            }
            final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(current_token, xml_name((SubLObject)owl_to_cycl.$str114$lang), (SubLObject)owl_to_cycl.NIL);
            final SubLObject language = (owl_to_cycl.NIL != lang_value) ? html_utilities.decode_html_language_abbreviation(lang_value) : owl_to_cycl.$const115$EnglishLanguage;
            final SubLObject label = conses_high.second(tokens);
            if (owl_to_cycl.NIL != lang_value && owl_to_cycl.NIL == language && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str264$Can_t_decode_language_abbreviatio, lang_value);
            }
            owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw265$LABEL, (SubLObject)ConsesLow.cons(label, language));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str110$comment))) {
            set_owl_pred_info_comment(new_pred_info, conses_high.second(tokens));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str266$domain)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
            final SubLObject domains = process_domain_list(tokens, import_parameters);
            set_owl_pred_info_domains(new_pred_info, domains);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str266$domain))) {
            final SubLObject domain = read_owl_term_reference(current_token, import_parameters);
            if (owl_to_cycl.NIL != domain) {
                set_owl_pred_info_domains(new_pred_info, (SubLObject)ConsesLow.list(domain));
            }
            else if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str267$Couldn_t_identify_domain_from__S, list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, tokens));
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str268$inverseOf))) {
            final SubLObject atomicP = string_utilities.ends_with(current_token, (SubLObject)owl_to_cycl.$str269$__, (SubLObject)owl_to_cycl.UNPROVIDED);
            final SubLObject inverse_token = (owl_to_cycl.NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
            final SubLObject inverse_name = pred_names_from_token(inverse_token, import_parameters);
            if (inverse_name.equal(owl_pred_info_plist_lookup(new_pred_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED))) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str270$_S_is_its_own_inverse__so_it_s_sy, owl_to_cycl.$str239$__ }), inverse_name);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_pred_info_plist_enter(new_pred_info, (SubLObject)owl_to_cycl.$kw271$SYMMETRIC_, (SubLObject)owl_to_cycl.T);
            }
            else if (owl_to_cycl.NIL != inverse_name) {
                owl_pred_info_plist_enter(new_pred_info, (SubLObject)owl_to_cycl.$kw272$INVERSE, inverse_name);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str273$subPropertyOf))) {
            final SubLObject atomicP = xml_parsing_utilities.xml_empty_tagP(current_token);
            final SubLObject genl_property_token = (owl_to_cycl.NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
            final SubLObject genl_property_name = pred_names_from_token(genl_property_token, import_parameters);
            if (owl_to_cycl.NIL != genl_property_name) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str274$Noting_genl_property__S_of__S, owl_to_cycl.$str239$__ }), genl_property_name, pred_info);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_pred_info_plist_enter(new_pred_info, (SubLObject)owl_to_cycl.$kw275$GENL_PROPERTY, genl_property_name);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str276$equivalentProperty))) {
            final SubLObject atomicP = xml_parsing_utilities.xml_empty_tagP(current_token);
            final SubLObject equiv_property_token = (owl_to_cycl.NIL != atomicP) ? current_token : next_noninitial_non_whitespace_xml_token(tokens);
            final SubLObject equiv_property_name = pred_names_from_token(equiv_property_token, import_parameters);
            if (owl_to_cycl.NIL != equiv_property_name) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str277$Noting_equivalent_property__S_of_, owl_to_cycl.$str239$__ }), equiv_property_name, pred_info);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw278$EQUIVALENT_PROPERTIES, equiv_property_name);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str279$range)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
            thread.resetMultipleValues();
            final SubLObject range = process_range_list(tokens, import_parameters);
            final SubLObject tokens_to_advance = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_owl_pred_info_range(new_pred_info, range);
            token_advance_spec = tokens_to_advance;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str279$range))) {
            final SubLObject range = read_owl_term_reference(current_token, import_parameters);
            if (owl_to_cycl.NIL == range && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str280$Couldn_t_identify_range_from__S, list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, tokens));
            }
            set_owl_pred_info_range(new_pred_info, range);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != owl_property_token_p(current_token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(current_token)) {
            pred_info_doneP = (SubLObject)owl_to_cycl.T;
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str281$guid, import_parameters)) {
            final SubLObject next_token = conses_high.second(tokens);
            final SubLObject guid = owl_value_from_string(next_token, (SubLObject)owl_to_cycl.$str282$string);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str283$__Noting_Cyc_guid_for__S_S__, owl_to_cycl.$str239$__ }), guid, new_pred_info);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_pred_info_plist_enter(new_pred_info, (SubLObject)owl_to_cycl.$kw284$GUID, guid);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str285$externalID, import_parameters)) {
            final SubLObject next_token = conses_high.second(tokens);
            final SubLObject externalid = owl_value_from_string(next_token, (SubLObject)owl_to_cycl.$str282$string);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str286$__Noting_Cyc_externalID_for__S_S_, owl_to_cycl.$str239$__ }), externalid, new_pred_info);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_pred_info_plist_enter(new_pred_info, (SubLObject)owl_to_cycl.$kw287$EXTERNALID, externalid);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_tagP(current_token) && owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tag_p(current_token)) {
            final SubLObject property_name = xml_parsing_utilities.xml_token_element_name(current_token);
            final SubLObject value_name = (SubLObject)((owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) ? term_names_from_token(current_token, import_parameters) : owl_to_cycl.NIL);
            SubLObject value = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL != value_name) {
                value = owl_find_or_create_term_from_specification(value_name, owl_to_cycl.$const16$Thing, import_parameters);
            }
            else {
                final SubLObject datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str288$datatype), (SubLObject)owl_to_cycl.UNPROVIDED));
                final SubLObject next_token2 = conses_high.second(tokens);
                value = owl_value_from_string(next_token2, datatype);
            }
            if (owl_to_cycl.NIL != value) {
                if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str289$isa, import_parameters)) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str290$__Noting__isa__S__S___, owl_to_cycl.$str239$__ }), new_pred_info, value);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw260$ISAS, value);
                }
                else {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str291$__Noting__S__S__, owl_to_cycl.$str239$__ }), property_name, value);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    owl_pred_info_plist_push(new_pred_info, (SubLObject)owl_to_cycl.$kw292$MY_PRED_VALUES, (SubLObject)ConsesLow.list(property_name, value));
                }
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else {
            if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str293$Ignoring_unrecognized_token___S, current_token);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        return Values.values(new_pred_info, token_advance_spec, pred_info_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 67805L)
    public static SubLObject cyc_token_with_nameP(final SubLObject current_token, final SubLObject name, final SubLObject import_parameters) {
        return (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, name) && owl_import_parameters_base_uri(import_parameters).isString() && owl_to_cycl.NIL != string_utilities.substringP((SubLObject)owl_to_cycl.$str294$cyc_com, owl_import_parameters_base_uri(import_parameters), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 68090L)
    public static SubLObject process_owl_attribute_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hash_pos = Sequences.position((SubLObject)Characters.CHAR_hash, value, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject divider_pos = (owl_to_cycl.NIL != hash_pos) ? hash_pos : list_utilities.position_from_end((SubLObject)Characters.CHAR_slash, value, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == divider_pos) {
            return value;
        }
        if (divider_pos.eql((SubLObject)owl_to_cycl.ZERO_INTEGER)) {
            return string_utilities.substring(value, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        final SubLObject local_name = string_utilities.substring(value, number_utilities.f_1X(divider_pos), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject uri = string_utilities.substring(value, (SubLObject)owl_to_cycl.ZERO_INTEGER, divider_pos);
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == web_utilities.uri_p(uri, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            Errors.error((SubLObject)owl_to_cycl.$str295$Don_t_know_how_to_interpret_attri, value);
        }
        return (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw296$NONLOCAL, uri, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 68770L)
    public static SubLObject owl_note_spec_property(final SubLObject pred, final SubLObject genl_property_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_utilities.dictionary_pushnew(owl_to_cycl.$owl_spec_properties$.getDynamicValue(thread), genl_property_name, pred, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 68912L)
    public static SubLObject owl_lookup_spec_properties(final SubLObject genl_property_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup_without_values(owl_to_cycl.$owl_spec_properties$.getDynamicValue(thread), genl_property_name, (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 69065L)
    public static SubLObject create_preds_from_owl_data(final SubLObject pred_info_list, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unconstrained_preds = (SubLObject)owl_to_cycl.NIL;
        note_owl_import_section_started();
        if (owl_to_cycl.NIL != list_utilities.non_empty_list_p(pred_info_list)) {
            final SubLObject _prev_bind_0 = owl_to_cycl.$owl_spec_properties$.currentBinding(thread);
            try {
                owl_to_cycl.$owl_spec_properties$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED), thread);
                final SubLObject total = Sequences.length(pred_info_list);
                final SubLObject percent_per = Numbers.divide((SubLObject)owl_to_cycl.ONE_INTEGER, total);
                SubLObject percent_done = (SubLObject)owl_to_cycl.ZERO_INTEGER;
                final SubLObject message = PrintLow.format((SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.$str297$Processing__D_property_definition, total);
                final SubLObject _prev_bind_0_$66 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((owl_to_cycl.NIL != message) ? message : owl_to_cycl.$str298$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(pred_info_list), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)owl_to_cycl.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)owl_to_cycl.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)owl_to_cycl.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)owl_to_cycl.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = pred_info_list;
                        SubLObject pred_info = (SubLObject)owl_to_cycl.NIL;
                        pred_info = csome_list_var.first();
                        while (owl_to_cycl.NIL != csome_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject pred = owl_define_one_pred(pred_info, import_parameters);
                            final SubLObject unconstrainedP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            owl_utilities.note_term_acted_on_during_import(pred, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
                            if (owl_to_cycl.NIL != unconstrainedP) {
                                unconstrained_preds = (SubLObject)ConsesLow.cons(pred, unconstrained_preds);
                            }
                            percent_done = Numbers.add(percent_done, percent_per);
                            note_owl_import_section_progress(percent_done);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)owl_to_cycl.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            pred_info = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$66, thread);
                }
            }
            finally {
                owl_to_cycl.$owl_spec_properties$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return unconstrained_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 70266L)
    public static SubLObject process_domain_list(final SubLObject original_tokens, final SubLObject import_parameters) {
        SubLObject domains = (SubLObject)owl_to_cycl.NIL;
        SubLObject tokens = original_tokens;
        while (owl_to_cycl.NIL != tokens) {
            final SubLObject token = tokens.first();
            if (owl_to_cycl.NIL != string_utilities.whitespace_stringP(token)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else {
                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str266$domain)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(token)) {
                    return domains;
                }
                if (owl_to_cycl.NIL != owl_class_token_p(token)) {
                    final SubLObject this_class = read_owl_class(tokens, import_parameters);
                    domains = (SubLObject)ConsesLow.cons(this_class, domains);
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
                }
            }
        }
        return domains;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 71126L)
    public static SubLObject process_range_list(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject range = (SubLObject)owl_to_cycl.NIL;
        SubLObject tokens_to_advance = next_noninitial_non_whitespace_xml_token_position(original_tokens);
        final SubLObject start_of_specification = xml_parsing_utilities.advance_xml_tokens(original_tokens, tokens_to_advance);
        if (owl_to_cycl.NIL != owl_class_token_p(start_of_specification.first())) {
            range = read_owl_class(start_of_specification, import_parameters);
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(start_of_specification.first(), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str299$DataRange)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(start_of_specification.first()) && owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(conses_high.second(start_of_specification), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str300$oneOf))) {
            range = read_owl_enumeration(start_of_specification.rest(), import_parameters);
        }
        else {
            Errors.warn((SubLObject)owl_to_cycl.$str301$Can_t_read_range_starting_with__S, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, start_of_specification));
        }
        final SubLObject end_of_specification = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(start_of_specification);
        final SubLObject end_of_range = xml_parsing_utilities.advance_xml_tokens_to(end_of_specification, (SubLObject)owl_to_cycl.$str302$__rdfs_range_, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject next_start_position = next_noninitial_non_whitespace_xml_token_position(end_of_range);
        final SubLObject next_start_token = ConsesLow.nth(next_start_position, end_of_range);
        tokens_to_advance = Sequences.position(next_start_token, original_tokens, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str303$Finished_range__S_, owl_to_cycl.$str239$__ }), range);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return Values.values(range, tokens_to_advance);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72761L)
    public static SubLObject clear_owl_class_element_names() {
        final SubLObject cs = owl_to_cycl.$owl_class_element_names_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72761L)
    public static SubLObject remove_owl_class_element_names() {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$owl_class_element_names_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(owl_to_cycl.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72761L)
    public static SubLObject owl_class_element_names_internal() {
        return (SubLObject)ConsesLow.list(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str305$Class), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str306$DeprecatedClass), rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str305$Class));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72761L)
    public static SubLObject owl_class_element_names() {
        SubLObject caching_state = owl_to_cycl.$owl_class_element_names_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym304$OWL_CLASS_ELEMENT_NAMES, (SubLObject)owl_to_cycl.$sym307$_OWL_CLASS_ELEMENT_NAMES_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQL, (SubLObject)owl_to_cycl.ZERO_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_class_element_names_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 72925L)
    public static SubLObject owl_class_token_p(final SubLObject token) {
        return subl_promotions.memberP(xml_parsing_utilities.xml_token_element_name(token), owl_class_element_names(), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 73052L)
    public static SubLObject read_owl_class(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != owl_class_token_p(original_tokens.first()) : original_tokens.first();
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str309$Reading_OWL_class_starting_with__, owl_to_cycl.$str239$__ }), list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, original_tokens));
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(original_tokens.first(), rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != conses_high.member(owl_to_cycl.$owl_definition_type$.getDynamicValue(thread), (SubLObject)owl_to_cycl.$list311, Symbols.symbol_function((SubLObject)owl_to_cycl.EQL), (SubLObject)owl_to_cycl.UNPROVIDED) && read_owl_term_reference(original_tokens.first(), import_parameters).isString()) {
            final SubLObject term_info = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ONE_INTEGER), read_one_class_info_from_owl_tokens(original_tokens, import_parameters));
            assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
            v_class = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        else {
            SubLObject tokens = original_tokens;
            SubLObject previous_first_token = (SubLObject)owl_to_cycl.NIL;
            SubLObject components = (SubLObject)owl_to_cycl.NIL;
            SubLObject reading_unionP = (SubLObject)owl_to_cycl.NIL;
            SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
            while (owl_to_cycl.NIL != tokens && owl_to_cycl.NIL == doneP) {
                final SubLObject token = tokens.first();
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str313$Starting_token___S, owl_to_cycl.$str239$__ }), token);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                if (token.eql(previous_first_token)) {
                    Errors.sublisp_break((SubLObject)owl_to_cycl.$str314$No_progress_reading_OWL_class__St, new SubLObject[] { token });
                }
                else if ((owl_to_cycl.NIL != owl_class_token_p(token) || owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                    components = (SubLObject)ConsesLow.cons(read_owl_term_reference(token, import_parameters), components);
                    if (owl_to_cycl.NIL != reading_unionP) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    else {
                        doneP = (SubLObject)owl_to_cycl.T;
                    }
                }
                else if (owl_to_cycl.NIL != owl_class_token_p(token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(token)) {
                    if (owl_to_cycl.NIL == reading_unionP) {
                        doneP = (SubLObject)owl_to_cycl.T;
                    }
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str317$Reading_restriction_starting_with, owl_to_cycl.$str239$__ }), token);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    final SubLObject restriction = read_owl_class_or_restriction(tokens, import_parameters);
                    components = (SubLObject)ConsesLow.cons(restriction, components);
                    if (owl_to_cycl.NIL != reading_unionP) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                    }
                    else {
                        doneP = (SubLObject)owl_to_cycl.T;
                    }
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(token) && owl_to_cycl.NIL != owl_class_token_p(token)) {
                    thread.resetMultipleValues();
                    final SubLObject new_tokens = handle_open_class_tag(tokens, import_parameters, reading_unionP);
                    final SubLObject new_components = thread.secondMultipleValue();
                    final SubLObject done_nowP = thread.thirdMultipleValue();
                    final SubLObject reading_union_nowP = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    tokens = new_tokens;
                    components = ConsesLow.append(components, new_components);
                    doneP = done_nowP;
                    reading_unionP = reading_union_nowP;
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str318$unionOf), token)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
                    reading_unionP = (SubLObject)owl_to_cycl.NIL;
                }
                else {
                    Errors.sublisp_break((SubLObject)owl_to_cycl.$str319$Don_t_know_what_to_do_with_this_t, new SubLObject[] { token });
                }
                previous_first_token = token;
            }
            v_class = owl_external_value_specification_union(components);
        }
        if (owl_to_cycl.NIL != node_id) {
            note_node_id_reference(node_id, v_class);
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 76110L)
    public static SubLObject handle_open_class_tag(final SubLObject tokens, final SubLObject import_parameters, SubLObject reading_unionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token_position = next_noninitial_non_whitespace_xml_token_position(tokens);
        final SubLObject next_token = ConsesLow.nth(next_token_position, tokens);
        SubLObject components = (SubLObject)owl_to_cycl.NIL;
        SubLObject new_tokens = (SubLObject)owl_to_cycl.NIL;
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str318$unionOf)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(next_token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_tag_attribute_value(next_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(next_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
            components = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id);
            new_tokens = xml_parsing_utilities.advance_xml_tokens(tokens, number_utilities.f_1X(next_token_position));
            reading_unionP = (SubLObject)owl_to_cycl.NIL;
            doneP = (SubLObject)owl_to_cycl.T;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str318$unionOf)) && owl_to_cycl.NIL == xml_parsing_utilities.xml_empty_tagP(next_token)) {
            new_tokens = xml_parsing_utilities.advance_xml_tokens(tokens, number_utilities.f_1X(next_token_position));
            reading_unionP = (SubLObject)owl_to_cycl.T;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str300$oneOf))) {
            final SubLObject enumeration = read_owl_enumeration(xml_parsing_utilities.advance_xml_tokens(tokens, next_token_position), import_parameters);
            components = (SubLObject)ConsesLow.cons(enumeration, components);
            if (owl_to_cycl.NIL != reading_unionP) {
                new_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else {
                doneP = (SubLObject)owl_to_cycl.T;
            }
        }
        else {
            final SubLObject v_class = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ONE_INTEGER), read_one_class_info_from_owl_tokens(tokens, import_parameters));
            if (owl_to_cycl.NIL != v_class && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str321$Found_class___S___Components___S, owl_to_cycl.$str239$__ }), v_class, components);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            final SubLObject external_name = owl_term_info_plist_lookup(v_class, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (external_name.isString() || owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) {
                components = (SubLObject)ConsesLow.cons(external_name, components);
            }
            else if (owl_to_cycl.NIL != owl_term_info_plist_lookup(v_class, (SubLObject)owl_to_cycl.$kw322$COMPLEMENT_CLASS, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                components = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw323$COMPLEMENT_OF, owl_term_info_plist_lookup(v_class, (SubLObject)owl_to_cycl.$kw322$COMPLEMENT_CLASS, (SubLObject)owl_to_cycl.UNPROVIDED)), components);
            }
            else if (owl_to_cycl.NIL != owl_term_info_plist_lookup(v_class, (SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                components = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, owl_term_info_plist_lookup(v_class, (SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, (SubLObject)owl_to_cycl.UNPROVIDED)), components);
            }
            else {
                Errors.sublisp_break((SubLObject)owl_to_cycl.$str325$Don_t_know_what_this_class_is_nam, new SubLObject[] { v_class });
            }
            new_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            if (owl_to_cycl.NIL == reading_unionP) {
                doneP = (SubLObject)owl_to_cycl.T;
            }
        }
        return Values.values(new_tokens, components, doneP, reading_unionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 78449L)
    public static SubLObject read_owl_enumeration(final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject one_of_token = tokens.first();
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(one_of_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str300$oneOf))) {
            Errors.error((SubLObject)owl_to_cycl.$str326$Can_t_read_an_enumeration_that_is, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, tokens));
        }
        final SubLObject one_of_list = xml_parsing_utilities.advance_xml_tokens(tokens, Sequences.position(one_of_token, tokens, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
        final SubLObject next_position = next_noninitial_non_whitespace_xml_token_position(one_of_list);
        final SubLObject start_of_list = xml_parsing_utilities.advance_xml_tokens(one_of_list, next_position);
        SubLObject items = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != conses_high.member(xml_parsing_utilities.xml_token_element_name(start_of_list.first()), (SubLObject)ConsesLow.list(rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest), rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str328$first)), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            items = read_owl_list(start_of_list, import_parameters);
        }
        else {
            for (SubLObject remaining_tokens = start_of_list, current_token = remaining_tokens.first(); owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str300$oneOf), current_token); current_token = remaining_tokens.first()) {
                SubLObject name = (SubLObject)owl_to_cycl.NIL;
                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
                    final SubLObject term_info = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ONE_INTEGER), read_one_instance_info_from_owl_tokens(remaining_tokens, import_parameters));
                    assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
                    name = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                else {
                    name = owl_external_name_from_token(current_token, import_parameters);
                }
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !name.isString() && owl_to_cycl.NIL == nonlocal_owl_term_reference_p(name)) {
                    Errors.error((SubLObject)owl_to_cycl.$str329$Couldn_t_get_name_from__S, current_token);
                }
                items = (SubLObject)ConsesLow.cons(name, items);
                remaining_tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining_tokens);
            }
            items = Sequences.nreverse(items);
        }
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str330$Read_enumeration___S, owl_to_cycl.$str239$__ }), items);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.cons((SubLObject)owl_to_cycl.$kw331$ONE_OF, items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 80120L)
    public static SubLObject possible_read_owl_list_p(final SubLObject v_object) {
        SubLObject ans = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject oops = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL == oops) {
                SubLObject csome_list_var = v_object;
                SubLObject item = (SubLObject)owl_to_cycl.NIL;
                item = csome_list_var.first();
                while (owl_to_cycl.NIL == oops && owl_to_cycl.NIL != csome_list_var) {
                    if (!item.isString() && owl_to_cycl.NIL == list_utilities.list_of_type_p((SubLObject)owl_to_cycl.$sym155$STRINGP, item)) {
                        oops = item;
                    }
                    csome_list_var = csome_list_var.rest();
                    item = csome_list_var.first();
                }
            }
            ans = Types.sublisp_null(oops);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 80412L)
    public static SubLObject read_owl_list(final SubLObject tokens, final SubLObject import_parameters) {
        return read_owl_list_recursive(tokens, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 80719L)
    public static SubLObject read_owl_list_recursive(final SubLObject original_tokens, final SubLObject import_parameters) {
        SubLObject tokens = original_tokens;
        SubLObject first = (SubLObject)owl_to_cycl.NIL;
        SubLObject first_doneP = (SubLObject)owl_to_cycl.NIL;
        SubLObject rest_doneP = (SubLObject)owl_to_cycl.NIL;
        SubLObject rest = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL != tokens && (owl_to_cycl.NIL == first_doneP || owl_to_cycl.NIL == rest_doneP)) {
            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, first_non_whitespace_xml_token_position(tokens));
            if (owl_to_cycl.NIL != tokens) {
                final SubLObject first_token = tokens.first();
                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest)) && xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED).equal((SubLObject)owl_to_cycl.$str332$http___www_w3_org_1999_02_22_rdf_)) {
                    rest_doneP = (SubLObject)owl_to_cycl.T;
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest)) && xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str333$parseType), (SubLObject)owl_to_cycl.UNPROVIDED).equal((SubLObject)owl_to_cycl.$str334$Collection) && owl_to_cycl.NIL == xml_parsing_utilities.xml_empty_tagP(first_token)) {
                    SubLObject remaining = tokens.rest();
                    SubLObject next_token = remaining.first();
                    SubLObject accumulated = (SubLObject)owl_to_cycl.NIL;
                    while (owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tokenP(rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest), next_token)) {
                        final SubLObject item = read_one_owl_list_item(remaining, import_parameters);
                        accumulated = (SubLObject)ConsesLow.cons(item, accumulated);
                        remaining = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(remaining);
                        next_token = remaining.first();
                    }
                    rest = Sequences.nreverse(accumulated);
                    rest_doneP = (SubLObject)owl_to_cycl.T;
                    tokens = remaining;
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(first_token) && owl_to_cycl.NIL != string_utilities.non_empty_string_p(xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED))) {
                    final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
                    rest = try_to_resolve_node_id_specification((SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id));
                    rest_doneP = (SubLObject)owl_to_cycl.T;
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest))) {
                    rest = read_owl_list_recursive(tokens.rest(), import_parameters);
                    rest_doneP = (SubLObject)owl_to_cycl.T;
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str328$first))) {
                    first = read_one_owl_list_item(tokens, import_parameters);
                    first_doneP = (SubLObject)owl_to_cycl.T;
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else {
                    Errors.sublisp_break((SubLObject)owl_to_cycl.$str335$Found_non_first__non_rest_token_i, new SubLObject[] { first_token });
                }
            }
        }
        final SubLObject ans = (SubLObject)ConsesLow.cons(first, rest);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 83265L)
    public static SubLObject read_one_owl_list_item(SubLObject tokens, final SubLObject import_parameters) {
        SubLObject item;
        final SubLObject first_token = item = tokens.first();
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(first_token)) {
            item = first_token;
        }
        else {
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str328$first)) || owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str327$rest))) {
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
                item = tokens.first();
            }
            item = xml_parsing_utilities.xml_tokens_for_next_element(tokens);
            PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str336$__Next_item___S__, item);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 84006L)
    public static SubLObject owl_external_value_specification_union(final SubLObject external_values) {
        assert owl_to_cycl.NIL != list_utilities.non_dotted_list_p(external_values) : external_values;
        SubLObject cdolist_list_var = external_values;
        SubLObject elem = (SubLObject)owl_to_cycl.NIL;
        elem = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            assert owl_to_cycl.NIL != owl_external_value_specification_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return (SubLObject)((owl_to_cycl.NIL != list_utilities.empty_list_p(external_values)) ? owl_to_cycl.NIL : ((owl_to_cycl.NIL != list_utilities.singletonP(external_values)) ? list_utilities.only_one(external_values) : ConsesLow.cons((SubLObject)owl_to_cycl.$kw337$UNION, external_values)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 84295L)
    public static SubLObject first_non_whitespace_xml_token_position(final SubLObject tokens) {
        return xml_parsing_utilities.next_xml_token_position_if_not(tokens, (SubLObject)owl_to_cycl.$sym78$WHITESPACE_STRING_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 84429L)
    public static SubLObject next_noninitial_non_whitespace_xml_token_position(final SubLObject tokens) {
        final SubLObject position_in_rest = first_non_whitespace_xml_token_position(tokens.rest());
        return (SubLObject)((owl_to_cycl.NIL != position_in_rest) ? number_utilities.f_1X(position_in_rest) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 84648L)
    public static SubLObject next_noninitial_non_whitespace_xml_token(final SubLObject tokens) {
        return list_utilities.find_if_not((SubLObject)owl_to_cycl.$sym78$WHITESPACE_STRING_, tokens.rest(), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 84771L)
    public static SubLObject pred_names_from_token(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject pred_prefix = oip_pred_prefix(import_parameters);
        final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str118$about), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject resource_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str338$ID), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
        SubLObject cyc_name = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != about_value) {
            external_name = process_owl_attribute_value(about_value);
        }
        else if (owl_to_cycl.NIL != resource_value) {
            external_name = process_owl_attribute_value(resource_value);
        }
        else if (owl_to_cycl.NIL != id_value) {
            external_name = process_owl_attribute_value(id_value);
        }
        cyc_name = owl_pred_cyc_name_from_external_name(external_name, pred_prefix);
        return Values.values(external_name, cyc_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 85546L)
    public static SubLObject owl_pred_cyc_name_from_external_name(final SubLObject external_name, final SubLObject pred_prefix) {
        final SubLObject cyc_name_base = owl_pred_cyc_name_base(external_name);
        SubLObject clean_name = string_utilities.char_subst((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(pred_prefix, string_utilities.upcase_leading(cyc_name_base)));
        if (owl_to_cycl.NIL != Characters.upper_case_p(string_utilities.first_char(clean_name))) {
            clean_name = string_utilities.downcase_leading(clean_name);
        }
        return clean_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 85916L)
    public static SubLObject owl_pred_cyc_name_base(final SubLObject external_name) {
        final SubLObject cyc_name_base = (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) ? conses_high.third(external_name) : external_name;
        return cyc_name_base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 86341L)
    public static SubLObject owl_find_or_create_pred_arg_isa(final SubLObject cols, final SubLObject import_parameters) {
        SubLObject arg_isa_terms = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = cols;
        SubLObject arg_isa_name = (SubLObject)owl_to_cycl.NIL;
        arg_isa_name = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            if (owl_to_cycl.NIL != owl_external_value_specification_union_p(arg_isa_name)) {
                arg_isa_terms = (SubLObject)ConsesLow.cons(owl_find_or_create_pred_arg_isa(owl_external_value_specification_union_names(arg_isa_name), import_parameters), arg_isa_terms);
            }
            else if (owl_to_cycl.NIL == arg_isa_name) {
                if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                    Errors.warn((SubLObject)owl_to_cycl.$str339$Got_null_arg_isa_name_in__S, cols);
                }
            }
            else {
                arg_isa_terms = (SubLObject)ConsesLow.cons(owl_find_or_create_term_for_class(arg_isa_name, import_parameters), arg_isa_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_name = cdolist_list_var.first();
        }
        return owl_term_union(arg_isa_terms, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 87088L)
    public static SubLObject xml_schema_class_uris_internal() {
        return ask_utilities.query_template((SubLObject)owl_to_cycl.$list341, (SubLObject)owl_to_cycl.$list342, owl_to_cycl.$const34$OWLMappingMt, (SubLObject)owl_to_cycl.$list343);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 87088L)
    public static SubLObject xml_schema_class_uris() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return xml_schema_class_uris_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym340$XML_SCHEMA_CLASS_URIS, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym340$XML_SCHEMA_CLASS_URIS, (SubLObject)owl_to_cycl.ZERO_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym340$XML_SCHEMA_CLASS_URIS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(xml_schema_class_uris_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 87446L)
    public static SubLObject owl_find_or_create_term_for_class(final SubLObject specification, SubLObject import_parameters) {
        if (import_parameters == owl_to_cycl.UNPROVIDED) {
            import_parameters = owl_to_cycl.$owl_import_parameters$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_restriction_p(specification)) {
            return find_or_create_owl_class_from_restriction(specification, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym344$CONSTANT_P, specification, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) && owl_to_cycl.NIL == cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym345$KEYWORDP, specification, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            return specification;
        }
        if (owl_to_cycl.NIL != pattern_match.tree_matches_pattern(specification, (SubLObject)owl_to_cycl.$list346) && owl_to_cycl.NIL != list_utilities.alist_has_keyP(xml_schema_class_uris(), conses_high.third(specification), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL))) {
            return list_utilities.alist_lookup_without_values(xml_schema_class_uris(), conses_high.third(specification), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        if (specification.isString() && owl_to_cycl.NIL == xml_parsing_utilities.xml_prefixed_name_p(specification)) {
            final SubLObject info = find_accumulated_owl_definition(specification, (SubLObject)owl_to_cycl.$kw82$CLASS);
            final SubLObject guid = (SubLObject)((owl_to_cycl.NIL != info) ? owl_term_info_plist_lookup(info, (SubLObject)owl_to_cycl.$kw284$GUID, (SubLObject)owl_to_cycl.NIL) : owl_to_cycl.NIL);
            final SubLObject externalid = (SubLObject)((owl_to_cycl.NIL != info) ? owl_term_info_plist_lookup(info, (SubLObject)owl_to_cycl.$kw287$EXTERNALID, (SubLObject)owl_to_cycl.NIL) : owl_to_cycl.NIL);
            if (owl_to_cycl.NIL != Guids.guid_string_p(guid)) {
                v_term = constants_high.find_constant_by_guid_string(guid);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str347$__Found_term_by_guid___S, owl_to_cycl.$str239$__ }), v_term);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
            }
            else if (owl_to_cycl.NIL != kb_utilities.compact_hl_external_id_string_p(externalid)) {
                v_term = kb_utilities.find_object_by_compact_hl_external_id_string(externalid);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str348$__Found_term_by_externalID___S, owl_to_cycl.$str239$__ }), v_term);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
            }
        }
        if (owl_to_cycl.NIL == v_term) {
            final SubLObject class_type = owl_to_cycl.$const349$owl_Class;
            v_term = owl_find_or_create_term_from_specification(specification, class_type, import_parameters);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 88969L)
    public static SubLObject owl_uri_from_prefix(final SubLObject prefix, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert owl_to_cycl.NIL != Types.stringp(prefix) : prefix;
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        SubLObject uri = owl_import_parameters_lookup_namespace(prefix, import_parameters);
        if (owl_to_cycl.NIL == uri) {
            final SubLObject var = (SubLObject)owl_to_cycl.$sym350$_URI;
            final SubLObject sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const351$standardPrefixForURI, prefix, var);
            final SubLObject result = ask_utilities.query_variable(var, sentence, owl_to_cycl.$const34$OWLMappingMt, (SubLObject)owl_to_cycl.$list352);
            SubLObject result_string = (SubLObject)((owl_to_cycl.NIL != result) ? result.first() : owl_to_cycl.NIL);
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(result_string, (SubLObject)owl_to_cycl.$list353);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (owl_to_cycl.NIL != success) {
                final SubLObject string_arg = result_string = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)owl_to_cycl.$sym354$STRING_ARG, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            if (result_string.isString()) {
                result_string = (uri = string_utilities.post_remove(result_string, (SubLObject)owl_to_cycl.$str216$_, (SubLObject)owl_to_cycl.UNPROVIDED));
            }
        }
        return uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 89763L)
    public static SubLObject owl_find_or_create_term_of_type_internal(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(external_name)) {
            final SubLObject prefix = xml_parsing_utilities.xml_prefixed_name_namespace(external_name);
            final SubLObject local_name = xml_parsing_utilities.xml_prefixed_name_local_name(external_name);
            SubLObject uri = owl_uri_from_prefix(prefix, import_parameters);
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == web_utilities.uri_p(uri, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                Errors.error((SubLObject)owl_to_cycl.$str356$Couldn_t_find_URI_for_namespace__, prefix);
            }
            if (string_utilities.last_char(uri).eql((SubLObject)Characters.CHAR_hash)) {
                uri = string_utilities.remove_last_char(uri, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            return owl_find_or_create_term_of_type((SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw296$NONLOCAL, uri, local_name), type, import_parameters);
        }
        if (owl_to_cycl.NIL != owl_external_value_specification_union_p(external_name)) {
            SubLObject components = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = owl_external_value_specification_union_names(external_name);
            SubLObject name = (SubLObject)owl_to_cycl.NIL;
            name = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject v_class = owl_find_or_create_term_of_type(name, type, import_parameters);
                assert owl_to_cycl.NIL != fort_types_interface.collection_p(v_class) : v_class;
                components = (SubLObject)ConsesLow.cons(v_class, components);
                cdolist_list_var = cdolist_list_var.rest();
                name = cdolist_list_var.first();
            }
            return owl_term_union(components, import_parameters);
        }
        if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) {
            return resolve_nonlocal_owl_term_reference(external_name, type, import_parameters);
        }
        if (owl_to_cycl.NIL != node_id_specification_p(external_name)) {
            return try_to_resolve_node_id_specification(external_name);
        }
        if (!external_name.isString() && owl_to_cycl.NIL == nonlocal_owl_term_reference_p(external_name)) {
            if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str357$Can_t_find_or_create_term_of_type, type, external_name);
            }
            return (SubLObject)owl_to_cycl.NIL;
        }
        if (owl_to_cycl.NIL != Sequences.find_if((SubLObject)owl_to_cycl.$sym358$CONTROL_CHAR_P, external_name, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            Errors.warn((SubLObject)owl_to_cycl.$str359$external_name_appears_to_contain_, external_name);
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(external_name)) {
            Errors.warn((SubLObject)owl_to_cycl.$str360$external_name_appears_to_contain_, external_name);
        }
        final SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        final SubLObject v_term = owl_find_or_create_term_of_type_in_ontology(external_name, type, ontology, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 89763L)
    public static SubLObject owl_find_or_create_term_of_type(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return owl_find_or_create_term_of_type_internal(external_name, type, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE, (SubLObject)owl_to_cycl.THREE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(external_name, type, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (external_name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && import_parameters.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_find_or_create_term_of_type_internal(external_name, type, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(external_name, type, import_parameters));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 91639L)
    public static SubLObject owl_find_or_create_term_for_class_in_ontology(final SubLObject name, final SubLObject ontology, final SubLObject import_parameters) {
        return owl_find_or_create_term_of_type_in_ontology(name, owl_to_cycl.$const361$OWLClass, ontology, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 91951L)
    public static SubLObject owl_find_or_create_term_of_type_in_ontology_internal(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters, SubLObject force_creationP) {
        if (force_creationP == owl_to_cycl.UNPROVIDED) {
            force_creationP = owl_to_cycl.$owl_force_new_term_creationP$.getDynamicValue();
        }
        SubLObject v_term = owl_find_term_of_type(external_name, type, import_parameters, ontology);
        if (owl_to_cycl.NIL == v_term) {
            v_term = ((owl_to_cycl.NIL != force_creationP || !ontology.equal(owl_import_parameters_ontology(import_parameters))) ? create_owl_term(external_name, type, ontology, import_parameters) : owl_quasi_term_from_specification(external_name, type, ontology, import_parameters));
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 91951L)
    public static SubLObject owl_find_or_create_term_of_type_in_ontology(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters, SubLObject force_creationP) {
        if (force_creationP == owl_to_cycl.UNPROVIDED) {
            force_creationP = owl_to_cycl.$owl_force_new_term_creationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return owl_find_or_create_term_of_type_in_ontology_internal(external_name, type, ontology, import_parameters, force_creationP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, (SubLObject)owl_to_cycl.FIVE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(external_name, type, ontology, import_parameters, force_creationP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (external_name.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ontology.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (import_parameters.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && force_creationP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_find_or_create_term_of_type_in_ontology_internal(external_name, type, ontology, import_parameters, force_creationP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(external_name, type, ontology, import_parameters, force_creationP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 92577L)
    public static SubLObject create_owl_term(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_prefix = owl_import_parameters_constant_prefix(import_parameters);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        final SubLObject predicateP = genls.genlP(type, owl_to_cycl.$const363$Predicate, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject name_base = external_name;
        final SubLObject prefix = (owl_to_cycl.NIL != string_utilities.non_empty_string_p(raw_prefix) && owl_to_cycl.NIL != predicateP) ? string_utilities.downcase_leading(raw_prefix) : string_utilities.upcase_leading(raw_prefix);
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != predicateP) {
            name_base = owl_pred_cyc_name_base(external_name);
            if (owl_to_cycl.NIL != string_utilities.empty_string_p(prefix)) {
                name_base = string_utilities.downcase_leading(name_base);
            }
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
            operation_communication.set_the_cyclist(owl_import_parameters_cyclist(import_parameters));
            v_term = owl_create_new_constant(name_base, (SubLObject)ConsesLow.list(type), owl_to_cycl.$const91$UniversalVocabularyMt, prefix, suffix, (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL == predicateP));
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        owl_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, v_term, find_or_create_term_type_for_ontology(ontology, (SubLObject)owl_to_cycl.UNPROVIDED)), owl_to_cycl.$const365$BookkeepingMt, import_parameters);
        assert_synonymous_external_concept(v_term, ontology, external_name, import_parameters);
        if (owl_to_cycl.NIL != owl_import_parameters_import_term(import_parameters)) {
            owl_utilities.note_term_acted_on_during_import(v_term, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 93857L)
    public static SubLObject assert_synonymous_external_concept(final SubLObject v_term, final SubLObject ontology, final SubLObject unprefixed_external_name, final SubLObject import_parameters) {
        return owl_assert(get_synonymous_external_concept_sentence(v_term, ontology, unprefixed_external_name, import_parameters), owl_import_parameters_ontology_context(import_parameters), import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 94172L)
    public static SubLObject get_synonymous_external_concept_sentence(final SubLObject v_term, final SubLObject ontology, final SubLObject unprefixed_external_name, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != Types.stringp(unprefixed_external_name) : unprefixed_external_name;
        final SubLObject prefixP = owl_import_parameters_prefix_external_namesP(import_parameters);
        final SubLObject external_name = (owl_to_cycl.NIL != prefixP) ? prefix_external_owl_name(unprefixed_external_name, ontology, import_parameters) : unprefixed_external_name;
        final SubLObject ontology_to_assert = (owl_to_cycl.NIL != prefixP) ? owl_import_parameters_ontology(import_parameters) : ontology;
        return el_utilities.make_ternary_formula(owl_to_cycl.$const9$synonymousExternalConcept, v_term, ontology_to_assert, external_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 94772L)
    public static SubLObject prefix_external_owl_name(final SubLObject unprefixed_external_name, final SubLObject ontology, final SubLObject import_parameters) {
        final SubLObject uri = uri_for_owl_ontology(ontology, import_parameters);
        SubLObject prefix = (SubLObject)((uri.isString() && owl_to_cycl.NIL != owl_import_parameters_abbreviate_prefixesP(import_parameters)) ? try_to_abbreviate_owl_uri(uri, import_parameters) : owl_to_cycl.NIL);
        if (owl_to_cycl.NIL == uri) {
            prefix = (SubLObject)owl_to_cycl.$str92$;
        }
        else if (owl_to_cycl.NIL == prefix) {
            prefix = Sequences.cconcatenate(uri, (SubLObject)owl_to_cycl.$str216$_);
        }
        else if (!Characters.CHAR_colon.eql(string_utilities.last_char(prefix))) {
            prefix = Sequences.cconcatenate(prefix, (SubLObject)owl_to_cycl.$str366$_);
        }
        return Sequences.cconcatenate(prefix, unprefixed_external_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 95360L)
    public static SubLObject uri_for_owl_ontology(final SubLObject ontology, final SubLObject import_parameters) {
        final SubLObject el_ontology = cycl_utilities.hl_to_el(ontology);
        return el_ontology.equal(cycl_utilities.hl_to_el(owl_import_parameters_ontology(import_parameters))) ? owl_import_parameters_base_uri(import_parameters) : get_uri_for_owl_ontology(el_ontology);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 95682L)
    public static SubLObject get_uri_for_owl_ontology(final SubLObject ontology) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(ontology, (SubLObject)owl_to_cycl.$list367);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (owl_to_cycl.NIL != success) {
            final SubLObject arg1 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)owl_to_cycl.$sym368$ARG1, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            return stringify_uri(arg1);
        }
        final SubLObject sentence = (SubLObject)ConsesLow.listS(owl_to_cycl.$const369$owlDefiningOntologyURI, ontology, (SubLObject)owl_to_cycl.$list370);
        final SubLObject mt = owl_to_cycl.$const34$OWLMappingMt;
        final SubLObject result = ask_utilities.query_variable((SubLObject)owl_to_cycl.$sym350$_URI, sentence, mt, (SubLObject)owl_to_cycl.$list371);
        SubLObject uri = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != list_utilities.non_empty_list_p(result)) {
            uri = stringify_uri(result.first());
        }
        return uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 96170L)
    public static SubLObject stringify_uri(final SubLObject uri) {
        if (uri.isString()) {
            return uri;
        }
        if (owl_to_cycl.NIL != cycl_grammar.cycl_nat_p(uri) && cycl_utilities.nat_arg1(uri, (SubLObject)owl_to_cycl.UNPROVIDED).isString() && owl_to_cycl.ONE_INTEGER.eql(cycl_utilities.nat_arity(uri, (SubLObject)owl_to_cycl.UNPROVIDED))) {
            return cycl_utilities.nat_arg1(uri, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return print_high.princ_to_string(uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 96389L)
    public static SubLObject try_to_abbreviate_owl_uri_internal(final SubLObject uri, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != Types.stringp(uri) : uri;
        return try_to_abbreviate_owl_uri_recursive(uri, owl_import_parameters_ontology(import_parameters), (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 96389L)
    public static SubLObject try_to_abbreviate_owl_uri(final SubLObject uri, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return try_to_abbreviate_owl_uri_internal(uri, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym372$TRY_TO_ABBREVIATE_OWL_URI, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym372$TRY_TO_ABBREVIATE_OWL_URI, (SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym372$TRY_TO_ABBREVIATE_OWL_URI, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(uri, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && import_parameters.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(try_to_abbreviate_owl_uri_internal(uri, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(uri, import_parameters));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 96608L)
    public static SubLObject load_namespace_transcripts() {
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str373$_cyc_top_transcripts_0953_jonny2_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str374$_cyc_top_transcripts_0953_vela_20, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str375$_cyc_top_transcripts_0953_vela_20, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str376$_cyc_top_transcripts_0953_jonny2_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str377$_cyc_top_transcripts_0953_jonny2_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str378$_cyc_top_transcripts_0953_jonny2_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        operation_communication.load_transcript_file((SubLObject)owl_to_cycl.$str379$_cyc_top_transcripts_0953_jonny2_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 97425L)
    public static SubLObject try_to_abbreviate_owl_uri_recursive(final SubLObject uri, final SubLObject ontology, final SubLObject recursedP) {
        final SubLObject var = (SubLObject)owl_to_cycl.$kw380$X;
        SubLObject abbreviation = (SubLObject)owl_to_cycl.NIL;
        SubLObject sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const381$or, (SubLObject)ConsesLow.list(owl_to_cycl.$const382$nameSpacePrefixForSKS, ontology, var, uri), (SubLObject)ConsesLow.list(owl_to_cycl.$const382$nameSpacePrefixForSKS, ontology, var, (SubLObject)ConsesLow.list(owl_to_cycl.$const383$URIFn, uri)));
        SubLObject result = ask_utilities.query_variable(var, sentence, owl_to_cycl.$const34$OWLMappingMt, (SubLObject)owl_to_cycl.$list384);
        if (owl_to_cycl.NIL != result) {
            abbreviation = result.first();
        }
        if (owl_to_cycl.NIL == abbreviation) {
            sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const381$or, (SubLObject)ConsesLow.list(owl_to_cycl.$const351$standardPrefixForURI, var, uri), (SubLObject)ConsesLow.list(owl_to_cycl.$const351$standardPrefixForURI, var, (SubLObject)ConsesLow.list(owl_to_cycl.$const383$URIFn, uri)));
            result = ask_utilities.query_variable(var, sentence, owl_to_cycl.$const34$OWLMappingMt, (SubLObject)owl_to_cycl.$list384);
            if (owl_to_cycl.NIL != result) {
                abbreviation = result.first();
            }
        }
        if (owl_to_cycl.NIL == abbreviation && owl_to_cycl.NIL == recursedP) {
            abbreviation = (string_utilities.last_char(uri).eql((SubLObject)Characters.CHAR_hash) ? try_to_abbreviate_owl_uri_recursive(string_utilities.remove_last_char(uri, (SubLObject)owl_to_cycl.UNPROVIDED), ontology, (SubLObject)owl_to_cycl.T) : try_to_abbreviate_owl_uri_recursive(Sequences.cconcatenate(uri, (SubLObject)owl_to_cycl.$str216$_), ontology, (SubLObject)owl_to_cycl.T));
        }
        return abbreviation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 98518L)
    public static SubLObject owl_term_union(final SubLObject terms, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != list_utilities.non_dotted_list_p(terms) : terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = (SubLObject)owl_to_cycl.NIL;
        elem = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            assert owl_to_cycl.NIL != cycl_term_or_owl_quasi_term_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return (owl_to_cycl.NIL != list_utilities.singletonP(terms)) ? list_utilities.only_one(terms) : owl_find_or_create_nat((SubLObject)ConsesLow.list(owl_to_cycl.$const386$CollectionUnionFn, el_utilities.make_el_formula(owl_to_cycl.$const387$TheSet, terms, (SubLObject)owl_to_cycl.UNPROVIDED)), import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 98793L)
    public static SubLObject cycl_term_or_owl_quasi_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL != cycl_grammar.cycl_term_p(v_object) || (owl_to_cycl.NIL != list_utilities.proper_list_p(v_object) && owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, v_object, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 98970L)
    public static SubLObject owl_term_intersection(final SubLObject terms, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != list_utilities.non_dotted_list_p(terms) : terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = (SubLObject)owl_to_cycl.NIL;
        elem = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            assert owl_to_cycl.NIL != cycl_term_or_owl_quasi_term_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return (owl_to_cycl.NIL != list_utilities.singletonP(terms)) ? list_utilities.only_one(terms) : ((owl_to_cycl.NIL != list_utilities.doubletonP(terms)) ? owl_find_or_create_nat(reader.bq_cons(owl_to_cycl.$const388$CollectionIntersection2Fn, terms), import_parameters) : owl_find_or_create_nat((SubLObject)ConsesLow.list(owl_to_cycl.$const389$CollectionIntersectionFn, el_utilities.make_el_formula(owl_to_cycl.$const387$TheSet, terms, (SubLObject)owl_to_cycl.UNPROVIDED)), import_parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 99374L)
    public static SubLObject owl_term_enumeration(final SubLObject terms, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != list_utilities.non_dotted_list_p(terms) : terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = (SubLObject)owl_to_cycl.NIL;
        elem = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            assert owl_to_cycl.NIL != cycl_term_or_owl_quasi_term_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return owl_find_or_create_nat((SubLObject)((owl_to_cycl.NIL != list_utilities.singletonP(terms)) ? ConsesLow.list(owl_to_cycl.$const390$SingletonCollectionFn, list_utilities.only_one(terms)) : reader.bq_cons(owl_to_cycl.$const391$TheCollection, terms)), import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 99661L)
    public static SubLObject oip_pred_prefix(final SubLObject import_parameters) {
        return string_utilities.downcase_leading(oip_constant_prefix(import_parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 99903L)
    public static SubLObject owl_define_one_pred(final SubLObject pred_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_name = opi_cyc_name(pred_info);
        final SubLObject external_name = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        SubLObject isas = owl_pred_types_from_info(pred_info, import_parameters);
        final SubLObject defining_mt = owl_to_cycl.$const91$UniversalVocabularyMt;
        SubLObject unconstrainedP = (SubLObject)owl_to_cycl.NIL;
        SubLObject pred = (SubLObject)owl_to_cycl.NIL;
        final SubLObject item_var = owl_to_cycl.$const393$OWLProperty;
        if (owl_to_cycl.NIL == conses_high.member(item_var, isas, (SubLObject)owl_to_cycl.$sym394$SPEC_, Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
            isas = (SubLObject)ConsesLow.cons(item_var, isas);
        }
        if (owl_to_cycl.NIL == conses_high.member(external_name, owl_to_cycl.$cyc_properties_to_not_import$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED) || !owl_import_parameters_base_uri(import_parameters).isString() || owl_to_cycl.NIL == string_utilities.substringP((SubLObject)owl_to_cycl.$str294$cyc_com, owl_import_parameters_base_uri(import_parameters), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            pred = owl_find_pred(external_name, import_parameters);
            if (owl_to_cycl.NIL == pred) {
                final SubLObject guid_string = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw284$GUID, (SubLObject)owl_to_cycl.NIL);
                if (owl_to_cycl.NIL != Guids.guid_string_p(guid_string)) {
                    pred = constants_high.find_constant_by_guid_string(guid_string);
                }
            }
            if (owl_to_cycl.NIL == pred) {
                final SubLObject externalid_string = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw287$EXTERNALID, (SubLObject)owl_to_cycl.NIL);
                if (owl_to_cycl.NIL != kb_utilities.compact_hl_external_id_string_p(externalid_string)) {
                    pred = kb_utilities.find_object_by_compact_hl_external_id_string(externalid_string);
                }
            }
            if (owl_to_cycl.NIL != pred) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str395$Potentially_adding_assertions_to_, owl_to_cycl.$str239$__ }), pred);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = (SubLObject)owl_to_cycl.NIL;
                v_isa = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const396$isa, pred, v_isa), defining_mt, import_parameters);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                }
            }
            if (owl_to_cycl.NIL == pred) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str397$__Creating_predicate_from__S__, owl_to_cycl.$str239$__ }), pred_info);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                pred = owl_create(pred_name, isas, defining_mt, (SubLObject)owl_to_cycl.$str92$, suffix, (SubLObject)owl_to_cycl.NIL, import_parameters);
            }
            if (owl_to_cycl.NIL == pred) {
                if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                    Errors.warn((SubLObject)owl_to_cycl.$str398$Failed_to_find_or_create_a_predic, pred_name);
                }
            }
            else {
                unconstrainedP = owl_define_one_pred_internal(pred, pred_info, import_parameters);
            }
        }
        return Values.values(pred, unconstrainedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 101702L)
    public static SubLObject owl_pred_types_from_info(final SubLObject pred_info, final SubLObject import_parameters) {
        SubLObject types = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw260$ISAS, (SubLObject)owl_to_cycl.NIL);
        SubLObject v_isa = (SubLObject)owl_to_cycl.NIL;
        v_isa = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa, import_parameters);
            types = (SubLObject)ConsesLow.cons(isa_term, types);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        if (owl_to_cycl.T.eql(owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw271$SYMMETRIC_, (SubLObject)owl_to_cycl.NIL))) {
            types = (SubLObject)ConsesLow.cons(owl_to_cycl.$const399$owl_SymmetricProperty, types);
        }
        return Sequences.delete_duplicates(types, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 102136L)
    public static SubLObject owl_term_types_from_info(final SubLObject term_info, final SubLObject import_parameters) {
        SubLObject types = (SubLObject)owl_to_cycl.NIL;
        SubLObject cdolist_list_var = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, (SubLObject)owl_to_cycl.NIL);
        SubLObject v_isa = (SubLObject)owl_to_cycl.NIL;
        v_isa = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa, import_parameters);
            types = (SubLObject)ConsesLow.cons(isa_term, types);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return Sequences.delete_duplicates(types, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 102443L)
    public static SubLObject owl_define_one_pred_internal(final SubLObject pred, final SubLObject pred_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject range = owl_pred_info_range(pred_info);
        SubLObject external_name = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject ontology = oip_ontology(import_parameters);
        final SubLObject ontology_context = owl_import_parameters_ontology_context(import_parameters);
        SubLObject unconstrainedP = (SubLObject)owl_to_cycl.NIL;
        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, pred, oip_quoted_isa(import_parameters)), owl_to_cycl.$const365$BookkeepingMt, import_parameters);
        if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) {
            SubLObject current;
            final SubLObject datum = current = external_name.rest();
            SubLObject uri = (SubLObject)owl_to_cycl.NIL;
            SubLObject name = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
            uri = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
            name = current.first();
            current = current.rest();
            if (owl_to_cycl.NIL == current) {
                ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
                external_name = name;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list400);
            }
        }
        assert_synonymous_external_concept(pred, ontology, external_name, import_parameters);
        if (owl_to_cycl.NIL != owl_pred_info_domains(pred_info)) {
            final SubLObject pred_arg1isa = owl_find_or_create_pred_arg_isa(owl_pred_info_domains(pred_info), import_parameters);
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const401$rdfs_domain, pred, pred_arg1isa), ontology_context, import_parameters);
        }
        else {
            owl_enqueue_assert((SubLObject)ConsesLow.listS(owl_to_cycl.$const401$rdfs_domain, pred, (SubLObject)owl_to_cycl.$list402), ontology_context, import_parameters);
            unconstrainedP = (SubLObject)owl_to_cycl.T;
        }
        final SubLObject pred_arg2isa = owl_arg2isa_from_range(range, import_parameters);
        if (owl_to_cycl.NIL != pred_arg2isa) {
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const403$rdfs_range, pred, pred_arg2isa), ontology_context, import_parameters);
        }
        else {
            owl_enqueue_assert((SubLObject)ConsesLow.listS(owl_to_cycl.$const403$rdfs_range, pred, (SubLObject)owl_to_cycl.$list402), ontology_context, import_parameters);
            unconstrainedP = (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != owl_pred_info_comment(pred_info)) {
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const112$rdfs_comment, pred, owl_pred_info_comment(pred_info)), ontology_context, import_parameters);
        }
        SubLObject cdolist_list_var = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw265$LABEL, (SubLObject)owl_to_cycl.NIL);
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        value = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            assert_owl_label(pred, value, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        final SubLObject genl_property_name = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw275$GENL_PROPERTY, (SubLObject)owl_to_cycl.NIL);
        final SubLObject genl_property = (SubLObject)((owl_to_cycl.NIL != genl_property_name) ? owl_find_pred(genl_property_name, import_parameters) : owl_to_cycl.NIL);
        if (owl_to_cycl.NIL != genl_property) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str404$Asserting_genl_property__S_of__S, owl_to_cycl.$str239$__ }), genl_property, pred);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const405$rdfs_subPropertyOf, pred, genl_property), ontology_context, import_parameters);
        }
        else if (owl_to_cycl.NIL != genl_property_name) {
            owl_note_spec_property(pred, genl_property_name);
        }
        cdolist_list_var = owl_lookup_spec_properties(external_name);
        SubLObject spec_property = (SubLObject)owl_to_cycl.NIL;
        spec_property = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str406$Asserting_spec_property__S_of__S, owl_to_cycl.$str239$__ }), spec_property, pred);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const405$rdfs_subPropertyOf, spec_property, pred), ontology_context, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            spec_property = cdolist_list_var.first();
        }
        if (!owl_to_cycl.$const407$InverseBinaryPredicateFn.eql(cycl_utilities.nat_functor(pred))) {
            SubLObject inverse = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw272$INVERSE, (SubLObject)owl_to_cycl.NIL);
            if (owl_to_cycl.NIL != inverse) {
                if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(inverse)) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = inverse.rest();
                    SubLObject uri2 = (SubLObject)owl_to_cycl.NIL;
                    SubLObject name2 = (SubLObject)owl_to_cycl.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)owl_to_cycl.$list400);
                    uri2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)owl_to_cycl.$list400);
                    name2 = current2.first();
                    current2 = current2.rest();
                    if (owl_to_cycl.NIL == current2) {
                        ontology = find_or_create_owl_ontology_for_uri(uri2, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
                        inverse = name2;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)owl_to_cycl.$list400);
                    }
                }
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str408$Asserting_inverse__S_of__S, owl_to_cycl.$str239$__ }), inverse, pred);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                final SubLObject inverse_term = (SubLObject)ConsesLow.list(owl_to_cycl.$const407$InverseBinaryPredicateFn, pred);
                final SubLObject existsP = narts_high.find_nart(inverse_term);
                assert_synonymous_external_concept(inverse_term, ontology, inverse, import_parameters);
                if (owl_to_cycl.NIL == existsP) {
                    owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, inverse_term, oip_quoted_isa(import_parameters)), owl_to_cycl.$const365$BookkeepingMt, import_parameters);
                }
            }
        }
        cdolist_list_var = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw278$EQUIVALENT_PROPERTIES, (SubLObject)owl_to_cycl.NIL);
        SubLObject equivalent_property_name = (SubLObject)owl_to_cycl.NIL;
        equivalent_property_name = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str409$Asserting_equivalent_property__S_, owl_to_cycl.$str239$__ }), equivalent_property_name, pred);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            final SubLObject equivalent_property_term = owl_find_or_create_term_of_type(equivalent_property_name, owl_to_cycl.$const393$OWLProperty, import_parameters);
            final SubLObject existsP2 = list_utilities.sublisp_boolean(equivalent_property_term);
            if (owl_to_cycl.NIL == existsP2) {
                Errors.warn((SubLObject)owl_to_cycl.$str410$Couldn_t_find_equivalent_property, equivalent_property_name);
            }
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const411$owl_equivalentProperty, pred, equivalent_property_term), ontology_context, import_parameters);
            cdolist_list_var = cdolist_list_var.rest();
            equivalent_property_name = cdolist_list_var.first();
        }
        cdolist_list_var = owl_pred_info_plist_lookup(pred_info, (SubLObject)owl_to_cycl.$kw292$MY_PRED_VALUES, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject pair = (SubLObject)owl_to_cycl.NIL;
        pair = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            SubLObject current3;
            final SubLObject datum3 = current3 = pair;
            SubLObject property_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject value2 = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)owl_to_cycl.$list412);
            property_name = current3.first();
            current3 = current3.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)owl_to_cycl.$list412);
            value2 = current3.first();
            current3 = current3.rest();
            if (owl_to_cycl.NIL == current3) {
                final SubLObject arg0_pred = owl_find_or_create_term_of_type(property_name, owl_to_cycl.$const393$OWLProperty, import_parameters);
                final SubLObject sentence = el_utilities.make_binary_formula(arg0_pred, pred, value2);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str413$__Asserting__S__, owl_to_cycl.$str239$__ }), sentence);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_enqueue_assert(sentence, ontology_context, import_parameters);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum3, (SubLObject)owl_to_cycl.$list412);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return unconstrainedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107016L)
    public static SubLObject owl_find_pred(final SubLObject pred_name, final SubLObject import_parameters) {
        final SubLObject ontology = oip_ontology(import_parameters);
        return owl_find_term_of_type(pred_name, owl_to_cycl.$const363$Predicate, import_parameters, ontology);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107294L)
    public static SubLObject owl_find_collection(final SubLObject class_name, final SubLObject import_parameters) {
        final SubLObject ontology = oip_ontology(import_parameters);
        return owl_find_term_of_type(class_name, owl_to_cycl.$const414$Collection, import_parameters, ontology);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107651L)
    public static SubLObject note_owl_found_term(final SubLObject term_name, final SubLObject ontology, final SubLObject v_term) {
        return dictionary.dictionary_enter(owl_to_cycl.$owl_found_terms$.getGlobalValue(), (SubLObject)ConsesLow.list(term_name, ontology), v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107791L)
    public static SubLObject clear_owl_found_terms() {
        return dictionary.clear_dictionary(owl_to_cycl.$owl_found_terms$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 107879L)
    public static SubLObject lookup_owl_found_term(final SubLObject term_name, final SubLObject ontology) {
        final SubLObject key = (SubLObject)ConsesLow.list(term_name, ontology);
        SubLObject v_term = dictionary.dictionary_lookup_without_values(owl_to_cycl.$owl_found_terms$.getGlobalValue(), key, (SubLObject)owl_to_cycl.NIL);
        if (owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym415$INVALID_FORT_, v_term, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            dictionary.dictionary_remove(owl_to_cycl.$owl_found_terms$.getGlobalValue(), (SubLObject)ConsesLow.list(term_name, ontology));
            v_term = (SubLObject)owl_to_cycl.NIL;
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 108214L)
    public static SubLObject owl_find_term_of_type(final SubLObject term_name, final SubLObject type, final SubLObject import_parameters, SubLObject ontology) {
        if (ontology == owl_to_cycl.UNPROVIDED) {
            ontology = oip_ontology(import_parameters);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_term = (SubLObject)owl_to_cycl.NIL;
        if (term_name.isString() || owl_to_cycl.NIL != nonlocal_owl_term_reference_p(term_name)) {
            found_term = lookup_owl_found_term(term_name, ontology);
            if (owl_to_cycl.NIL == found_term) {
                SubLObject local_term_name = term_name;
                SubLObject local_ontology = ontology;
                if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(term_name)) {
                    SubLObject current;
                    final SubLObject datum = current = term_name.rest();
                    SubLObject uri = (SubLObject)owl_to_cycl.NIL;
                    SubLObject name = (SubLObject)owl_to_cycl.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
                    uri = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
                    name = current.first();
                    current = current.rest();
                    if (owl_to_cycl.NIL == current) {
                        local_ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
                        local_term_name = name;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list400);
                    }
                }
                found_term = ask_utilities.query_template((SubLObject)owl_to_cycl.$sym416$_TERM, (SubLObject)ConsesLow.list(owl_to_cycl.$const9$synonymousExternalConcept, (SubLObject)owl_to_cycl.$sym416$_TERM, local_ontology, local_term_name), owl_to_cycl.$const40$InferencePSC, (SubLObject)owl_to_cycl.$list236).first();
                if (owl_to_cycl.NIL == found_term) {
                    final SubLObject sentence = get_synonymous_external_concept_sentence((SubLObject)owl_to_cycl.$sym416$_TERM, local_ontology, local_term_name, import_parameters);
                    found_term = ask_utilities.query_template((SubLObject)owl_to_cycl.$sym416$_TERM, sentence, owl_to_cycl.$const40$InferencePSC, (SubLObject)owl_to_cycl.$list236).first();
                }
                if (owl_to_cycl.NIL != found_term) {
                    note_owl_found_term(term_name, ontology, found_term);
                }
                else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str417$Couldn_t_find__S, owl_to_cycl.$str239$__ }), term_name);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
            }
        }
        return found_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 109628L)
    public static SubLObject owl_arg2isa_from_range(final SubLObject range, final SubLObject import_parameters) {
        SubLObject pred_arg2isa = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == range) {
            return (SubLObject)owl_to_cycl.NIL;
        }
        if (owl_to_cycl.NIL != owl_external_value_specification_union_p(range)) {
            SubLObject components = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = owl_external_value_specification_union_names(range);
            SubLObject external_term = (SubLObject)owl_to_cycl.NIL;
            external_term = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                components = (SubLObject)ConsesLow.cons(owl_arg2isa_from_range(external_term, import_parameters), components);
                cdolist_list_var = cdolist_list_var.rest();
                external_term = cdolist_list_var.first();
            }
            pred_arg2isa = owl_term_union(components, import_parameters);
        }
        else if (owl_to_cycl.NIL != owl_external_value_specification_intersection_p(range)) {
            SubLObject components = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = owl_external_value_specification_intersection_names(range);
            SubLObject external_term = (SubLObject)owl_to_cycl.NIL;
            external_term = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject var;
                final SubLObject component = var = owl_arg2isa_from_range(external_term, import_parameters);
                if (owl_to_cycl.NIL != var) {
                    components = (SubLObject)ConsesLow.cons(var, components);
                }
                cdolist_list_var = cdolist_list_var.rest();
                external_term = cdolist_list_var.first();
            }
            if (owl_to_cycl.NIL != list_utilities.non_empty_list_p(components)) {
                pred_arg2isa = owl_term_intersection(components, import_parameters);
            }
        }
        else if (owl_to_cycl.NIL != owl_external_term_enumeration_p(range)) {
            SubLObject components = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = owl_external_term_enumeration_terms(range);
            SubLObject external_term = (SubLObject)owl_to_cycl.NIL;
            external_term = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                components = (SubLObject)ConsesLow.cons(external_term, components);
                cdolist_list_var = cdolist_list_var.rest();
                external_term = cdolist_list_var.first();
            }
            pred_arg2isa = owl_term_enumeration(components, import_parameters);
        }
        else if (range.isString()) {
            final SubLObject external_name = process_owl_attribute_value(range);
            pred_arg2isa = owl_find_or_create_pred_arg_isa((SubLObject)ConsesLow.list(external_name), import_parameters);
        }
        else {
            pred_arg2isa = owl_find_or_create_term_for_class(range, import_parameters);
        }
        return pred_arg2isa;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111576L)
    public static SubLObject note_owl_oe_queue_done(SubLObject owl_oe_queue) {
        if (owl_oe_queue == owl_to_cycl.UNPROVIDED) {
            owl_oe_queue = owl_to_cycl.$owl_oe_queue$.getDynamicValue();
        }
        return owl_oe_queue_enqueue_low(owl_to_cycl.$owl_oe_queue_end_marker$.getGlobalValue(), owl_oe_queue, (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 111737L)
    public static SubLObject new_owl_oe_queue() {
        final SubLObject owl_oe_queue = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.NIL, queues.create_queue((SubLObject)owl_to_cycl.UNPROVIDED), current_owl_importer());
        owl_oe_queue_enqueue_low(owl_to_cycl.$owl_oe_queue_marker$.getGlobalValue(), owl_oe_queue, (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_oe_queues$.setGlobalValue((SubLObject)ConsesLow.cons(owl_oe_queue, owl_to_cycl.$owl_oe_queues$.getGlobalValue()));
        ensure_owl_oe_daemon_running();
        return owl_oe_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112019L)
    public static SubLObject owl_oe_queue_modified_flag(final SubLObject owl_oe_queue) {
        return owl_oe_queue.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112108L)
    public static SubLObject set_owl_oe_queue_modified_flag(final SubLObject owl_oe_queue, final SubLObject value) {
        ConsesLow.set_nth((SubLObject)owl_to_cycl.ZERO_INTEGER, owl_oe_queue, list_utilities.sublisp_boolean(value));
        return owl_oe_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112242L)
    public static SubLObject owl_oe_queue_modifiedP(final SubLObject owl_oe_queue) {
        return owl_oe_queue_modified_flag(owl_oe_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112348L)
    public static SubLObject owl_oe_queue_queue(final SubLObject owl_oe_queue) {
        return conses_high.second(owl_oe_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112430L)
    public static SubLObject owl_oe_queue_importer(final SubLObject owl_oe_queue) {
        return conses_high.third(owl_oe_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112514L)
    public static SubLObject ensure_owl_oe_daemon_running() {
        if (owl_to_cycl.NIL == Threads.valid_process_p(owl_to_cycl.$owl_oe_daemon$.getGlobalValue())) {
            launch_owl_oe_queue_daemon();
        }
        return owl_to_cycl.$owl_oe_daemon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112667L)
    public static SubLObject launch_owl_oe_queue_daemon() {
        owl_to_cycl.$owl_oe_daemon$.setGlobalValue(new_owl_oe_daemon());
        return owl_to_cycl.$owl_oe_daemon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 112785L)
    public static SubLObject owl_oe_queue_enqueue(final SubLObject item, SubLObject owl_oe_queue) {
        if (owl_oe_queue == owl_to_cycl.UNPROVIDED) {
            owl_oe_queue = owl_to_cycl.$owl_oe_queue$.getDynamicValue();
        }
        final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
        if (owl_to_cycl.NIL == queues.queue_find(item, queue, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            owl_oe_queue_enqueue_low(item, owl_oe_queue, (SubLObject)owl_to_cycl.T);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113036L)
    public static SubLObject owl_oe_queue_reenqueue(final SubLObject item, final SubLObject owl_oe_queue) {
        return owl_oe_queue_enqueue_low(item, owl_oe_queue, (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113154L)
    public static SubLObject owl_oe_queue_enqueue_low(final SubLObject item, final SubLObject owl_oe_queue, final SubLObject set_modified_flagP) {
        final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
        queues.enqueue(item, queue);
        if (owl_to_cycl.NIL != set_modified_flagP) {
            set_owl_oe_queue_modified_flag(owl_oe_queue, (SubLObject)owl_to_cycl.T);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113457L)
    public static SubLObject owl_node_id_index() {
        if (owl_to_cycl.NIL == dictionary.dictionary_p(owl_to_cycl.$owl_node_id_index$.getGlobalValue())) {
            owl_to_cycl.$owl_node_id_index$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED));
        }
        return owl_to_cycl.$owl_node_id_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113628L)
    public static SubLObject note_node_id_reference(final SubLObject node_id, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && value.equal((SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id))) {
            Errors.error((SubLObject)owl_to_cycl.$str421$Circular_node_id_reference___S___, node_id, value);
        }
        return dictionary.dictionary_enter(owl_node_id_index(), node_id, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113854L)
    public static SubLObject lookup_node_id_reference(final SubLObject node_id) {
        return dictionary.dictionary_lookup_without_values(owl_node_id_index(), node_id, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 113978L)
    public static SubLObject owl_create(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject initial_case, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
            operation_communication.set_the_cyclist(oip_cyclist(import_parameters));
            new_term = owl_create_internal(name, isas, defining_mt, prefix, suffix, initial_case);
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 114272L)
    public static SubLObject owl_create_internal(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject initial_case) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_collections = (SubLObject)owl_to_cycl.NIL;
        SubLObject isas_to_postpone = (SubLObject)owl_to_cycl.NIL;
        SubLObject new_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(defining_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = (SubLObject)owl_to_cycl.NIL;
            v_isa = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject resolved_isa = (owl_to_cycl.NIL != owl_quasi_term_p(v_isa)) ? resolve_owl_quasi_term(v_isa) : v_isa;
                if (resolved_isa.eql((SubLObject)owl_to_cycl.$kw422$UNRESOLVED)) {
                    isas_to_postpone = (SubLObject)ConsesLow.cons(v_isa, isas_to_postpone);
                }
                else if (owl_to_cycl.NIL == fort_types_interface.isa_collectionP(resolved_isa, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    isas_to_postpone = (SubLObject)ConsesLow.cons(resolved_isa, isas_to_postpone);
                }
                else {
                    final SubLObject item_var = resolved_isa;
                    if (owl_to_cycl.NIL == conses_high.member(item_var, known_collections, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
                        known_collections = (SubLObject)ConsesLow.cons(item_var, known_collections);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        new_term = owl_create_new_constant(name, known_collections, defining_mt, prefix, suffix, initial_case);
        assert owl_to_cycl.NIL != constant_handles.constant_p(new_term) : new_term;
        SubLObject cdolist_list_var2 = isas_to_postpone;
        SubLObject v_isa2 = (SubLObject)owl_to_cycl.NIL;
        v_isa2 = cdolist_list_var2.first();
        while (owl_to_cycl.NIL != cdolist_list_var2) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str423$Postponing__isa__S__S__because__S, owl_to_cycl.$str239$__ }), new SubLObject[] { new_term, v_isa2, v_isa2 });
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const396$isa, new_term, v_isa2), defining_mt, (SubLObject)owl_to_cycl.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_isa2 = cdolist_list_var2.first();
        }
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 115199L)
    public static SubLObject owl_create_new_constant(SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject suffix, final SubLObject capitalizeP) {
        SubLObject new_constant = (SubLObject)owl_to_cycl.NIL;
        SubLObject basic_type_doneP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != string_utilities.non_empty_string_p(suffix)) {
            name = Sequences.cconcatenate(name, suffix);
        }
        if (owl_to_cycl.NIL != owl_utilities.owl_importer_use_rkfP()) {
            new_constant = rkf_term_utilities.create_new_constant(name, isas, (SubLObject)owl_to_cycl.NIL, defining_mt, prefix, (SubLObject)owl_to_cycl.NIL, capitalizeP, (SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL == new_constant) {
            new_constant = owl_create_new_constant_non_rkf(name, isas, defining_mt, prefix, capitalizeP);
        }
        if (owl_to_cycl.NIL == basic_type_doneP) {
            SubLObject csome_list_var = (SubLObject)owl_to_cycl.$list424;
            SubLObject basic_type = (SubLObject)owl_to_cycl.NIL;
            basic_type = csome_list_var.first();
            while (owl_to_cycl.NIL == basic_type_doneP && owl_to_cycl.NIL != csome_list_var) {
                if (owl_to_cycl.NIL != Sequences.find(basic_type, isas, (SubLObject)owl_to_cycl.$sym394$SPEC_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    owl_assert_low(el_utilities.make_binary_formula(owl_to_cycl.$const396$isa, new_constant, basic_type), owl_to_cycl.$const91$UniversalVocabularyMt);
                    basic_type_doneP = (SubLObject)owl_to_cycl.T;
                }
                csome_list_var = csome_list_var.rest();
                basic_type = csome_list_var.first();
            }
        }
        if (owl_to_cycl.NIL == basic_type_doneP) {
            owl_assert_low(el_utilities.make_binary_formula(owl_to_cycl.$const396$isa, new_constant, owl_to_cycl.$const16$Thing), owl_to_cycl.$const91$UniversalVocabularyMt);
        }
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 116205L)
    public static SubLObject owl_create_new_constant_non_rkf(final SubLObject name, final SubLObject known_collections, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP) {
        final SubLObject full_name = list_utilities.remove_if_not((SubLObject)owl_to_cycl.$sym425$VALID_CONSTANT_NAME_CHAR_P, (owl_to_cycl.NIL != string_utilities.non_empty_string_p(prefix)) ? Sequences.cconcatenate(prefix, new SubLObject[] { owl_to_cycl.$str426$_, name }) : name, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject new_constant = ke.ke_create_now((owl_to_cycl.NIL != capitalizeP) ? string_utilities.upcase_leading(full_name) : string_utilities.downcase_leading(full_name), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject cdolist_list_var = known_collections;
        SubLObject v_isa = (SubLObject)owl_to_cycl.NIL;
        v_isa = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            owl_assert_low(el_utilities.make_binary_formula(owl_to_cycl.$const396$isa, new_constant, v_isa), defining_mt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 116713L)
    public static SubLObject owl_enqueue_assert(final SubLObject quasi_sentence, final SubLObject mt, SubLObject import_parameters) {
        if (import_parameters == owl_to_cycl.UNPROVIDED) {
            import_parameters = owl_to_cycl.$owl_import_parameters$.getDynamicValue();
        }
        assert owl_to_cycl.NIL != owl_import_parameters_p(import_parameters) : import_parameters;
        if (owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, quasi_sentence, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) || owl_to_cycl.NIL == wff.el_wff_assertibleP(quasi_sentence, mt, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject assert_spec = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw427$ASSERT, quasi_sentence, mt, import_parameters);
            owl_oe_queue_enqueue(assert_spec, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        else {
            owl_assert(quasi_sentence, mt, import_parameters);
        }
        return (SubLObject)owl_to_cycl.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 117192L)
    public static SubLObject new_owl_oe_daemon() {
        final SubLObject daemon = process_utilities.make_cyc_server_process((SubLObject)owl_to_cycl.$str428$OWL_OE_Daemon, (SubLObject)owl_to_cycl.$sym429$OWL_OE_DAEMON_RUN);
        return daemon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 117329L)
    public static SubLObject owl_oe_queue_empty_p(final SubLObject owl_oe_queue) {
        return Types.sublisp_null(queues.queue_find_if((SubLObject)owl_to_cycl.$sym430$CONSP, owl_oe_queue_queue(owl_oe_queue), (SubLObject)owl_to_cycl.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 117455L)
    public static SubLObject wait_for_owl_oe_queue_to_empty(SubLObject owl_oe_queue) {
        if (owl_oe_queue == owl_to_cycl.UNPROVIDED) {
            owl_oe_queue = owl_to_cycl.$owl_oe_queue$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject starting_size = queues.queue_size(owl_oe_queue_queue(owl_oe_queue));
        final SubLObject message = PrintLow.format((SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.$str431$Waiting_for__D_enqueued_operation, starting_size);
        note_owl_import_section_started();
        if (starting_size.isPositive()) {
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)owl_to_cycl.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)owl_to_cycl.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)owl_to_cycl.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    while (owl_to_cycl.NIL == owl_oe_queue_empty_p(owl_oe_queue)) {
                        final SubLObject number_done = Numbers.subtract(starting_size, queues.queue_size(owl_oe_queue_queue(owl_oe_queue)));
                        final SubLObject percent_done = Numbers.divide(number_done, starting_size);
                        utilities_macros.note_percent_progress(number_done, starting_size);
                        note_owl_import_section_progress(percent_done);
                        Threads.sleep((SubLObject)owl_to_cycl.$float432$0_5);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 118184L)
    public static SubLObject owl_oe_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (owl_to_cycl.NIL == list_utilities.empty_list_p(owl_to_cycl.$owl_oe_queues$.getGlobalValue())) {
            SubLObject cdolist_list_var = conses_high.copy_list(owl_to_cycl.$owl_oe_queues$.getGlobalValue());
            SubLObject owl_oe_queue = (SubLObject)owl_to_cycl.NIL;
            owl_oe_queue = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                final SubLObject queue = owl_oe_queue_queue(owl_oe_queue);
                final SubLObject _prev_bind_0 = owl_to_cycl.$owl_importer$.currentBinding(thread);
                try {
                    owl_to_cycl.$owl_importer$.bind(owl_oe_queue_importer(owl_oe_queue), thread);
                    final SubLObject item = queues.dequeue(queue);
                    final SubLObject queue_closedP = queues.queue_find(owl_to_cycl.$owl_oe_queue_end_marker$.getGlobalValue(), queue, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    SubLObject oe_performedP = (SubLObject)owl_to_cycl.NIL;
                    if (item.eql(owl_to_cycl.$owl_oe_queue_end_marker$.getGlobalValue())) {
                        if (owl_to_cycl.NIL != owl_oe_queue_empty_p(owl_oe_queue)) {
                            queues.clear_queue(queue);
                            owl_to_cycl.$owl_oe_queues$.setGlobalValue(Sequences.remove(owl_oe_queue, owl_to_cycl.$owl_oe_queues$.getGlobalValue(), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
                        }
                    }
                    else if (item.eql(owl_to_cycl.$owl_oe_queue_marker$.getGlobalValue())) {
                        if (owl_to_cycl.NIL != owl_oe_queue_modifiedP(owl_oe_queue)) {
                            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str433$__Finished_pass_through_queue__Si, owl_to_cycl.$str239$__ }), queues.queue_size(queue));
                                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                            set_owl_oe_queue_modified_flag(owl_oe_queue, (SubLObject)owl_to_cycl.NIL);
                        }
                        else if (owl_to_cycl.NIL != owl_oe_queue_empty_p(owl_oe_queue)) {
                            if (owl_to_cycl.NIL != list_utilities.singletonP(owl_to_cycl.$owl_oe_queues$.getGlobalValue())) {
                                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str434$__OE_queue_is_empty__Zzz___, owl_to_cycl.$str239$__ }));
                                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                Threads.sleep((SubLObject)owl_to_cycl.FIVE_INTEGER);
                            }
                        }
                        else if (owl_to_cycl.NIL != queue_closedP) {
                            final SubLObject items_left = list_utilities.remove_if_not((SubLObject)owl_to_cycl.$sym430$CONSP, queues.queue_elements(queue), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                            Errors.warn((SubLObject)owl_to_cycl.$str435$Unable_to_perform__D_operation__P, Sequences.length(items_left), items_left);
                            SubLObject cdolist_list_var_$69 = items_left;
                            SubLObject item_$70 = (SubLObject)owl_to_cycl.NIL;
                            item_$70 = cdolist_list_var_$69.first();
                            while (owl_to_cycl.NIL != cdolist_list_var_$69) {
                                note_owl_failure(item_$70, (SubLObject)owl_to_cycl.UNPROVIDED);
                                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                                item_$70 = cdolist_list_var_$69.first();
                            }
                            queues.clear_queue(queue);
                            owl_to_cycl.$owl_oe_queues$.setGlobalValue(Sequences.remove(owl_oe_queue, owl_to_cycl.$owl_oe_queues$.getGlobalValue(), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
                        }
                        else {
                            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str436$__Can_t_do_anything_with_queue_no, owl_to_cycl.$str239$__ }));
                                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                            }
                            Threads.sleep((SubLObject)owl_to_cycl.FIVE_INTEGER);
                        }
                    }
                    else if (owl_to_cycl.NIL != pattern_match.tree_matches_pattern(item, (SubLObject)owl_to_cycl.$list437)) {
                        final SubLObject _prev_bind_0_$71 = owl_to_cycl.$owl_allow_find_via_creationP$.currentBinding(thread);
                        try {
                            owl_to_cycl.$owl_allow_find_via_creationP$.bind(queue_closedP, thread);
                            oe_performedP = owl_oe_daemon_assert(item);
                        }
                        finally {
                            owl_to_cycl.$owl_allow_find_via_creationP$.rebind(_prev_bind_0_$71, thread);
                        }
                    }
                    if (owl_to_cycl.NIL != oe_performedP) {
                        if (owl_to_cycl.NIL == owl_oe_queue_modifiedP(owl_oe_queue)) {
                            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str438$__Noting_OE_performed___S__, owl_to_cycl.$str239$__ }), item);
                                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                            set_owl_oe_queue_modified_flag(owl_oe_queue, (SubLObject)owl_to_cycl.T);
                        }
                    }
                    else {
                        owl_oe_queue_reenqueue(item, owl_oe_queue);
                    }
                }
                finally {
                    owl_to_cycl.$owl_importer$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                owl_oe_queue = cdolist_list_var.first();
            }
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 120084L)
    public static SubLObject note_owl_failure(final SubLObject item, SubLObject stream) {
        if (stream == owl_to_cycl.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = owl_failure_message(item);
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            note_owl_import_problem(item, message);
        }
        else {
            print_high.princ(message, stream);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 120314L)
    public static SubLObject owl_failure_message(final SubLObject item) {
        SubLObject message = (SubLObject)owl_to_cycl.NIL;
        SubLObject stream = (SubLObject)owl_to_cycl.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            if (owl_to_cycl.NIL != pattern_match.tree_matches_pattern(item, (SubLObject)owl_to_cycl.$list437)) {
                SubLObject current;
                final SubLObject datum = current = item.rest();
                SubLObject quasi_formula = (SubLObject)owl_to_cycl.NIL;
                SubLObject mt = (SubLObject)owl_to_cycl.NIL;
                SubLObject import_parameters = (SubLObject)owl_to_cycl.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
                quasi_formula = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
                import_parameters = current.first();
                current = current.rest();
                if (owl_to_cycl.NIL == current) {
                    SubLObject cdolist_list_var = cycl_utilities.expression_gather(quasi_formula, (SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    SubLObject quasi_term = (SubLObject)owl_to_cycl.NIL;
                    quasi_term = cdolist_list_var.first();
                    while (owl_to_cycl.NIL != cdolist_list_var) {
                        if (owl_to_cycl.$kw422$UNRESOLVED.eql(resolve_owl_quasi_term(quasi_term))) {
                            PrintLow.format(stream, (SubLObject)owl_to_cycl.$str440$__Failed_to_resolve__S__, quasi_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        quasi_term = cdolist_list_var.first();
                    }
                    final SubLObject resolved_formula = cycl_utilities.expression_transform(quasi_formula, (SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, (SubLObject)owl_to_cycl.$sym441$RESOLVE_OWL_QUASI_TERM, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                    if (owl_to_cycl.NIL == cycl_utilities.expression_find((SubLObject)owl_to_cycl.$kw422$UNRESOLVED, resolved_formula, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                        final SubLObject why_not_wff = wff.explain_why_not_wff_assert(resolved_formula, mt, (SubLObject)owl_to_cycl.UNPROVIDED);
                        if (owl_to_cycl.NIL != why_not_wff) {
                            print_high.print(why_not_wff, stream);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list439);
                }
            }
            else {
                PrintLow.format(stream, (SubLObject)owl_to_cycl.$str442$Problem_performing__S, item);
            }
            message = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)owl_to_cycl.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)owl_to_cycl.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 121180L)
    public static SubLObject owl_oe_daemon_assert(final SubLObject item) {
        SubLObject successP = (SubLObject)owl_to_cycl.NIL;
        SubLObject current;
        final SubLObject datum = current = item.rest();
        SubLObject quasi_formula = (SubLObject)owl_to_cycl.NIL;
        SubLObject mt = (SubLObject)owl_to_cycl.NIL;
        SubLObject import_parameters = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
        quasi_formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list439);
        import_parameters = current.first();
        current = current.rest();
        if (owl_to_cycl.NIL == current) {
            SubLObject resolvedP = Types.sublisp_null(cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, quasi_formula, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
            if (owl_to_cycl.NIL == resolvedP) {
                quasi_formula = cycl_utilities.expression_transform(quasi_formula, (SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, (SubLObject)owl_to_cycl.$sym441$RESOLVE_OWL_QUASI_TERM, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                resolvedP = Types.sublisp_null(cycl_utilities.expression_find((SubLObject)owl_to_cycl.$kw422$UNRESOLVED, quasi_formula, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
            }
            if (owl_to_cycl.NIL != resolvedP) {
                successP = owl_assert(quasi_formula, mt, import_parameters);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list439);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 121721L)
    public static SubLObject owl_quasi_term_from_specification(final SubLObject external_name, final SubLObject type, final SubLObject ontology, final SubLObject import_parameters) {
        return (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw443$OWL_QUASI_TERM, (SubLObject)owl_to_cycl.$kw444$FIND, external_name, type, ontology, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 121904L)
    public static SubLObject owl_quasi_term_from_node_id(final SubLObject node_id, SubLObject type) {
        if (type == owl_to_cycl.UNPROVIDED) {
            type = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == dictionary_utilities.dictionary_has_keyP(owl_node_id_index(), node_id)) {
            Errors.error((SubLObject)owl_to_cycl.$str445$_S_is_not_an_OWL_node_ID_, node_id);
        }
        return (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw443$OWL_QUASI_TERM, (SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 122125L)
    public static SubLObject owl_quasi_term_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list446);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 122238L)
    public static SubLObject resolve_owl_quasi_term(final SubLObject quasi_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)owl_to_cycl.$kw422$UNRESOLVED;
        final SubLObject pcase_var = conses_high.second(quasi_term);
        if (pcase_var.eql((SubLObject)owl_to_cycl.$kw320$NODE_ID)) {
            final SubLObject result = dictionary.dictionary_lookup_without_values(owl_node_id_index(), conses_high.third(quasi_term), (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL != constant_handles.valid_constantP(result, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                v_term = result;
            }
        }
        else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw444$FIND)) {
            SubLObject current;
            final SubLObject datum = current = Sequences.subseq(quasi_term, (SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.UNPROVIDED);
            SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject type = (SubLObject)owl_to_cycl.NIL;
            SubLObject ontology = (SubLObject)owl_to_cycl.NIL;
            SubLObject import_parameters = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list447);
            external_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list447);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list447);
            ontology = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list447);
            import_parameters = current.first();
            current = current.rest();
            if (owl_to_cycl.NIL == current) {
                if (owl_to_cycl.NIL != owl_external_value_specification_intersection_p(external_name)) {
                    v_term = owl_find_or_create_intersection(external_name, type, import_parameters, (SubLObject)owl_to_cycl.T);
                }
                else if (owl_to_cycl.NIL != owl_external_value_specification_union_p(external_name)) {
                    v_term = owl_find_or_create_union(external_name, type, import_parameters, (SubLObject)owl_to_cycl.T);
                }
                else {
                    final SubLObject result2 = (owl_to_cycl.NIL != owl_to_cycl.$owl_allow_find_via_creationP$.getDynamicValue(thread)) ? owl_find_or_create_term_of_type_in_ontology(external_name, type, ontology, import_parameters, (SubLObject)owl_to_cycl.T) : owl_find_term_of_type(external_name, type, import_parameters, ontology);
                    if (owl_to_cycl.NIL != result2) {
                        v_term = result2;
                        note_found_term_resolution(quasi_term, v_term);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list447);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123327L)
    public static SubLObject clear_note_found_term_resolution() {
        final SubLObject cs = owl_to_cycl.$note_found_term_resolution_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123327L)
    public static SubLObject remove_note_found_term_resolution(final SubLObject quasi_term, final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$note_found_term_resolution_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(quasi_term, v_term), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123327L)
    public static SubLObject note_found_term_resolution_internal(final SubLObject quasi_term, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str449$__Resolved__S___to__S__, owl_to_cycl.$str239$__ }), quasi_term, v_term);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123327L)
    public static SubLObject note_found_term_resolution(final SubLObject quasi_term, final SubLObject v_term) {
        SubLObject caching_state = owl_to_cycl.$note_found_term_resolution_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym448$NOTE_FOUND_TERM_RESOLUTION, (SubLObject)owl_to_cycl.$sym450$_NOTE_FOUND_TERM_RESOLUTION_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.TWO_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(quasi_term, v_term);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (quasi_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && v_term.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(note_found_term_resolution_internal(quasi_term, v_term)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(quasi_term, v_term));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123495L)
    public static SubLObject owl_assert_internal(SubLObject formula, final SubLObject mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_import_parameters_encoding(import_parameters).equalp((SubLObject)owl_to_cycl.$str86$utf_8) && owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym452$NON_ASCII_STRING_P, formula, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject transformed = cycl_utilities.expression_transform(formula, (SubLObject)owl_to_cycl.$sym452$NON_ASCII_STRING_P, (SubLObject)owl_to_cycl.$sym453$NON_ASCII_STRING_TO_UNICODE, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL == cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym452$NON_ASCII_STRING_P, transformed, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                formula = transformed;
            }
        }
        SubLObject successP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != czer_meta.el_asserted_assertion_specP(formula, mt)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str454$Already_know__S___in__S, owl_to_cycl.$str239$__ }), formula, mt);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            successP = (SubLObject)owl_to_cycl.T;
        }
        else {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
                operation_communication.set_the_cyclist(oip_cyclist(import_parameters));
                thread.resetMultipleValues();
                final SubLObject assertedP = owl_assert_low(formula, mt);
                final SubLObject problematic_formula = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (owl_to_cycl.NIL != assertedP) {
                    successP = (SubLObject)owl_to_cycl.T;
                }
                else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str455$Failed_to_assert__S__, owl_to_cycl.$str239$__ }), problematic_formula);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
            }
            finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        if (owl_to_cycl.NIL != successP) {
            owl_utilities.note_sentence_asserted(formula, mt, owl_import_parameters_import_term(import_parameters));
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 123495L)
    public static SubLObject owl_assert(final SubLObject formula, final SubLObject mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return owl_assert_internal(formula, mt, import_parameters);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym451$OWL_ASSERT, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym451$OWL_ASSERT, (SubLObject)owl_to_cycl.THREE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym451$OWL_ASSERT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(formula, mt, import_parameters);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && import_parameters.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(owl_assert_internal(formula, mt, import_parameters)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, mt, import_parameters));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 124511L)
    public static SubLObject owl_assert_low(final SubLObject formula, final SubLObject mt) {
        if (owl_to_cycl.NIL != owl_utilities.owl_importer_use_rkfP()) {
            return rkf_assertion_utilities.rkf_assert_with_implicature(formula, mt, (SubLObject)owl_to_cycl.T);
        }
        return Values.values(cyc_kernel.cyc_assert_wff(formula, mt, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 124724L)
    public static SubLObject create_terms_from_owl_data(final SubLObject term_info_list, final SubLObject import_parameters, SubLObject progress_message) {
        if (progress_message == owl_to_cycl.UNPROVIDED) {
            progress_message = (SubLObject)owl_to_cycl.$str456$Processing_term_definitions___;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        note_owl_import_section_started();
        if (owl_to_cycl.NIL != list_utilities.non_empty_list_p(term_info_list)) {
            final SubLObject total = Sequences.length(term_info_list);
            final SubLObject percent_per = Numbers.divide((SubLObject)owl_to_cycl.ONE_INTEGER, total);
            SubLObject percent_done = (SubLObject)owl_to_cycl.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((owl_to_cycl.NIL != progress_message) ? progress_message : owl_to_cycl.$str298$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(term_info_list), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)owl_to_cycl.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)owl_to_cycl.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)owl_to_cycl.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)owl_to_cycl.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = term_info_list;
                    SubLObject term_info = (SubLObject)owl_to_cycl.NIL;
                    term_info = csome_list_var.first();
                    while (owl_to_cycl.NIL != csome_list_var) {
                        if (owl_to_cycl.NIL == dont_reify_owl_termP(term_info, import_parameters)) {
                            owl_define_one_term(term_info, import_parameters);
                        }
                        percent_done = Numbers.add(percent_done, percent_per);
                        note_owl_import_section_progress(percent_done);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)owl_to_cycl.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        term_info = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)owl_to_cycl.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        note_owl_import_section_done();
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 125911L)
    public static SubLObject dont_reify_owl_termP(final SubLObject term_info, final SubLObject import_parameters) {
        if (owl_to_cycl.NIL == owl_term_info_cyc_name(term_info) && owl_to_cycl.NIL != owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw320$NODE_ID, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            return (SubLObject)owl_to_cycl.T;
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 126167L)
    public static SubLObject owl_define_one_term(final SubLObject term_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_name = owl_term_info_cyc_name(term_info);
        final SubLObject external_name = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject isas = owl_term_types_from_info(term_info, import_parameters);
        SubLObject v_term = (SubLObject)((owl_to_cycl.NIL != external_name) ? owl_find_term_of_type(external_name, isas.first(), import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED) : owl_to_cycl.NIL);
        final SubLObject defining_mt = owl_import_parameters_ontology_context(import_parameters);
        final SubLObject suffix = owl_import_parameters_constant_suffix(import_parameters);
        if (owl_to_cycl.NIL == forts.fort_p(v_term)) {
            v_term = owl_find_term_from_info(term_info, import_parameters);
        }
        if (owl_to_cycl.NIL == forts.fort_p(v_term) && owl_to_cycl.NIL == term_name) {
            if (owl_to_cycl.NIL == owl_to_cycl.$create_anonymous_owl_termsP$.getDynamicValue(thread)) {
                return (SubLObject)owl_to_cycl.NIL;
            }
            final SubLObject v_isa = Sequences.find_if((SubLObject)owl_to_cycl.$sym344$CONSTANT_P, isas, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            final SubLObject type = (owl_to_cycl.NIL != v_isa) ? v_isa : owl_to_cycl.$const16$Thing;
            term_name = Sequences.cconcatenate((SubLObject)owl_to_cycl.$str457$Anonymous_, constants_high.constant_name(type));
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str458$__Creating__S_____, owl_to_cycl.$str239$__ }), term_name);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, (SubLObject)owl_to_cycl.NIL);
        SubLObject v_isa2 = (SubLObject)owl_to_cycl.NIL;
        v_isa2 = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            final SubLObject isa_term = owl_find_or_create_term_for_class(v_isa2, import_parameters);
            isas = (SubLObject)ConsesLow.cons(isa_term, isas);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa2 = cdolist_list_var.first();
        }
        if (owl_to_cycl.NIL != forts.fort_p(v_term)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str459$Potentially_adding_assertions_to_, owl_to_cycl.$str239$__ }), v_term);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            cdolist_list_var = isas;
            v_isa2 = (SubLObject)owl_to_cycl.NIL;
            v_isa2 = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const396$isa, v_term, v_isa2), defining_mt, import_parameters);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa2 = cdolist_list_var.first();
            }
        }
        if (owl_to_cycl.NIL == forts.fort_p(v_term)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str460$__Defining_term_from__S__, owl_to_cycl.$str239$__ }), term_info);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            v_term = owl_create(term_name, isas, defining_mt, (SubLObject)owl_to_cycl.$str92$, suffix, (SubLObject)owl_to_cycl.$kw93$UPCASE, import_parameters);
        }
        if (owl_to_cycl.NIL == v_term) {
            if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str461$Failed_to_find_or_create_a_term_w, term_name);
            }
        }
        else {
            owl_define_one_term_internal(v_term, defining_mt, term_info, import_parameters);
            owl_utilities.note_term_acted_on_during_import(v_term, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 127999L)
    public static SubLObject owl_find_term_from_info(final SubLObject term_info, final SubLObject import_parameters) {
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject guid_string = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw284$GUID, (SubLObject)owl_to_cycl.NIL);
        final SubLObject externalid_string = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw287$EXTERNALID, (SubLObject)owl_to_cycl.NIL);
        if (owl_to_cycl.NIL != Guids.guid_string_p(guid_string)) {
            v_term = constants_high.find_constant_by_guid_string(guid_string);
        }
        else if (owl_to_cycl.NIL != kb_utilities.compact_hl_external_id_string_p(externalid_string)) {
            v_term = kb_utilities.find_object_by_compact_hl_external_id_string(externalid_string);
        }
        else if (owl_to_cycl.NIL != kb_utilities.hl_external_id_string_p(externalid_string)) {
            v_term = kb_utilities.find_object_by_hl_external_id_string(externalid_string);
        }
        if (owl_to_cycl.NIL == v_term) {
            SubLObject csome_list_var;
            SubLObject term_name;
            for (csome_list_var = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw462$EQUIVALENT_CLASSES, (SubLObject)owl_to_cycl.NIL), term_name = (SubLObject)owl_to_cycl.NIL, term_name = csome_list_var.first(); owl_to_cycl.NIL == v_term && owl_to_cycl.NIL != csome_list_var; v_term = owl_find_or_create_term_for_class(term_name, import_parameters), csome_list_var = csome_list_var.rest(), term_name = csome_list_var.first()) {}
        }
        if (owl_to_cycl.NIL == v_term) {
            final SubLObject component_names = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw463$UNION_OF, (SubLObject)owl_to_cycl.NIL);
            if (owl_to_cycl.NIL != component_names) {
                SubLObject components = (SubLObject)owl_to_cycl.NIL;
                SubLObject cdolist_list_var = component_names;
                SubLObject name = (SubLObject)owl_to_cycl.NIL;
                name = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    final SubLObject v_class = owl_find_or_create_term_for_class(name, import_parameters);
                    components = (SubLObject)ConsesLow.cons(v_class, components);
                    cdolist_list_var = cdolist_list_var.rest();
                    name = cdolist_list_var.first();
                }
                v_term = owl_term_union(components, import_parameters);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 129172L)
    public static SubLObject owl_define_one_term_internal(final SubLObject v_term, final SubLObject defining_mt, final SubLObject term_info, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject external_name = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject ontology = owl_import_parameters_ontology(import_parameters);
        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, v_term, owl_import_parameters_quoted_isa(import_parameters)), owl_to_cycl.$const365$BookkeepingMt, import_parameters);
        if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) {
            SubLObject current;
            final SubLObject datum = current = external_name.rest();
            SubLObject uri = (SubLObject)owl_to_cycl.NIL;
            SubLObject name = (SubLObject)owl_to_cycl.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
            uri = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
            name = current.first();
            current = current.rest();
            if (owl_to_cycl.NIL == current) {
                ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
                external_name = name;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list400);
            }
        }
        if (external_name.isString()) {
            assert_synonymous_external_concept(v_term, ontology, external_name, import_parameters);
        }
        if (owl_to_cycl.NIL != owl_term_info_comment(term_info)) {
            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const112$rdfs_comment, v_term, owl_term_info_comment(term_info)), defining_mt, import_parameters);
        }
        SubLObject superclasses = owl_term_info_superclasses(term_info);
        if (owl_to_cycl.NIL != list_utilities.empty_list_p(superclasses)) {
            superclasses = (SubLObject)ConsesLow.cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str464$Thing), superclasses);
            owl_utilities.note_term_acted_on_during_import(owl_to_cycl.$const465$owl_Thing, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        }
        SubLObject cdolist_list_var = superclasses;
        SubLObject genl_class_specification = (SubLObject)owl_to_cycl.NIL;
        genl_class_specification = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            if (owl_to_cycl.NIL != node_id_specification_p(genl_class_specification)) {
                genl_class_specification = try_to_resolve_node_id_specification(genl_class_specification);
            }
            if (genl_class_specification.isString() || owl_to_cycl.NIL != owl_external_value_specification_union_p(genl_class_specification) || owl_to_cycl.NIL != nonlocal_owl_term_reference_p(genl_class_specification)) {
                final SubLObject genl_class = owl_find_or_create_term_for_class(genl_class_specification, import_parameters);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str466$Asserting_genl_class__S_of__S, owl_to_cycl.$str239$__ }), genl_class, v_term);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const467$rdfs_subClassOf, v_term, genl_class), defining_mt, import_parameters);
            }
            else if (owl_to_cycl.NIL != owl_restriction_p(genl_class_specification)) {
                assert_owl_restriction(v_term, genl_class_specification, defining_mt, import_parameters);
            }
            else if (owl_to_cycl.NIL != pattern_match.tree_matches_pattern(genl_class_specification, (SubLObject)owl_to_cycl.$list468)) {
                final SubLObject value = conses_high.second(genl_class_specification);
                final SubLObject v_class = owl_find_or_create_term_for_class(value, import_parameters);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str469$Asserting_disjoint_class__S_of__S, owl_to_cycl.$str239$__ }), v_class, v_term);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const470$owl_disjointWith, v_class, v_term), defining_mt, import_parameters);
            }
            else {
                Errors.warn((SubLObject)owl_to_cycl.$str471$Don_t_know_how_to_handle_supercla, genl_class_specification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_class_specification = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = owl_term_info_disjoint_classes(term_info);
        SubLObject disjoint_class_specification = (SubLObject)owl_to_cycl.NIL;
        disjoint_class_specification = cdolist_list_var2.first();
        while (owl_to_cycl.NIL != cdolist_list_var2) {
            if (disjoint_class_specification.isString() || owl_to_cycl.NIL != owl_external_value_specification_union_p(disjoint_class_specification) || owl_to_cycl.NIL != nonlocal_owl_term_reference_p(disjoint_class_specification)) {
                final SubLObject disjoint_class = (SubLObject)((owl_to_cycl.NIL != disjoint_class_specification) ? owl_find_or_create_term_for_class(disjoint_class_specification, import_parameters) : owl_to_cycl.NIL);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str472$Asserting_disjoint___S_and__S, owl_to_cycl.$str239$__ }), disjoint_class, v_term);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const470$owl_disjointWith, v_term, disjoint_class), defining_mt, import_parameters);
            }
            else {
                Errors.warn((SubLObject)owl_to_cycl.$str473$Don_t_know_how_to_handle_disjoint, disjoint_class_specification);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            disjoint_class_specification = cdolist_list_var2.first();
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value2;
        SubLObject pcase_var;
        SubLObject cdolist_list_var3;
        SubLObject label_info;
        SubLObject equivalent_class_name;
        SubLObject external_name_$73;
        SubLObject v_class2;
        SubLObject components;
        SubLObject cdolist_list_var4;
        SubLObject name2;
        SubLObject v_class3;
        SubLObject names;
        SubLObject instance;
        SubLObject pair;
        SubLObject current2;
        SubLObject datum2;
        SubLObject property_name;
        SubLObject value_$74;
        SubLObject pred;
        SubLObject sentence;
        for (remainder = (SubLObject)owl_to_cycl.NIL, remainder = owl_term_info_plist(term_info); owl_to_cycl.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value2 = conses_high.cadr(remainder);
            pcase_var = property;
            if (!pcase_var.eql((SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME) && !pcase_var.eql((SubLObject)owl_to_cycl.$kw260$ISAS) && !pcase_var.eql((SubLObject)owl_to_cycl.$kw284$GUID)) {
                if (!pcase_var.eql((SubLObject)owl_to_cycl.$kw287$EXTERNALID)) {
                    if (pcase_var.eql((SubLObject)owl_to_cycl.$kw265$LABEL)) {
                        cdolist_list_var3 = value2;
                        label_info = (SubLObject)owl_to_cycl.NIL;
                        label_info = cdolist_list_var3.first();
                        while (owl_to_cycl.NIL != cdolist_list_var3) {
                            assert_owl_label(v_term, label_info, import_parameters);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            label_info = cdolist_list_var3.first();
                        }
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw462$EQUIVALENT_CLASSES)) {
                        cdolist_list_var3 = value2;
                        equivalent_class_name = (SubLObject)owl_to_cycl.NIL;
                        equivalent_class_name = cdolist_list_var3.first();
                        while (owl_to_cycl.NIL != cdolist_list_var3) {
                            assert_owl_equivalent_class(v_term, equivalent_class_name, defining_mt, import_parameters);
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            equivalent_class_name = cdolist_list_var3.first();
                        }
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw323$COMPLEMENT_OF)) {
                        external_name_$73 = value2;
                        v_class2 = owl_find_or_create_term_for_class(external_name_$73, import_parameters);
                        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str469$Asserting_disjoint_class__S_of__S, owl_to_cycl.$str239$__ }), v_class2, v_term);
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                        }
                        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const470$owl_disjointWith, v_class2, v_term), defining_mt, import_parameters);
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw463$UNION_OF)) {
                        components = (SubLObject)owl_to_cycl.NIL;
                        cdolist_list_var4 = value2;
                        name2 = (SubLObject)owl_to_cycl.NIL;
                        name2 = cdolist_list_var4.first();
                        while (owl_to_cycl.NIL != cdolist_list_var4) {
                            v_class3 = owl_find_or_create_term_for_class(name2, import_parameters);
                            components = (SubLObject)ConsesLow.cons(v_class3, components);
                            cdolist_list_var4 = cdolist_list_var4.rest();
                            name2 = cdolist_list_var4.first();
                        }
                        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str474$Asserting_union__S_of__S, owl_to_cycl.$str239$__ }), v_term, components);
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                        }
                        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const475$collectionUnion, v_term, reader.bq_cons(owl_to_cycl.$const387$TheSet, components)), defining_mt, import_parameters);
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF)) {
                        components = (SubLObject)owl_to_cycl.NIL;
                        cdolist_list_var4 = value2;
                        name2 = (SubLObject)owl_to_cycl.NIL;
                        name2 = cdolist_list_var4.first();
                        while (owl_to_cycl.NIL != cdolist_list_var4) {
                            v_class3 = owl_find_or_create_term_for_class(name2, import_parameters);
                            components = (SubLObject)ConsesLow.cons(v_class3, components);
                            cdolist_list_var4 = cdolist_list_var4.rest();
                            name2 = cdolist_list_var4.first();
                        }
                        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str476$Asserting_intersection__S_of__S, owl_to_cycl.$str239$__ }), v_term, components);
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                        }
                        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const477$collectionIntersection, v_term, reader.bq_cons(owl_to_cycl.$const387$TheSet, components)), defining_mt, import_parameters);
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw478$ENUMERATED_INSTANCES)) {
                        names = owl_external_term_enumeration_terms(value2);
                        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str479$Asserting_enumeration__S_of__S, owl_to_cycl.$str239$__ }), v_term, names);
                            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                        }
                        cdolist_list_var4 = names;
                        name2 = (SubLObject)owl_to_cycl.NIL;
                        name2 = cdolist_list_var4.first();
                        while (owl_to_cycl.NIL != cdolist_list_var4) {
                            instance = owl_find_or_create_term_of_type(name2, v_term, import_parameters);
                            owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const396$isa, instance, v_term), defining_mt, import_parameters);
                            cdolist_list_var4 = cdolist_list_var4.rest();
                            name2 = cdolist_list_var4.first();
                        }
                        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const480$completelyAssertedCollection, v_term), defining_mt, import_parameters);
                    }
                    else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw292$MY_PRED_VALUES)) {
                        cdolist_list_var3 = value2;
                        pair = (SubLObject)owl_to_cycl.NIL;
                        pair = cdolist_list_var3.first();
                        while (owl_to_cycl.NIL != cdolist_list_var3) {
                            datum2 = (current2 = pair);
                            property_name = (SubLObject)owl_to_cycl.NIL;
                            value_$74 = (SubLObject)owl_to_cycl.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)owl_to_cycl.$list412);
                            property_name = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)owl_to_cycl.$list412);
                            value_$74 = current2.first();
                            current2 = current2.rest();
                            if (owl_to_cycl.NIL == current2) {
                                pred = owl_find_or_create_term_of_type(property_name, owl_to_cycl.$const393$OWLProperty, import_parameters);
                                sentence = el_utilities.make_binary_formula(pred, v_term, value_$74);
                                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str413$__Asserting__S__, owl_to_cycl.$str239$__ }), sentence);
                                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                                }
                                owl_enqueue_assert(sentence, defining_mt, import_parameters);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)owl_to_cycl.$list412);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            pair = cdolist_list_var3.first();
                        }
                    }
                    else if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                        Errors.warn((SubLObject)owl_to_cycl.$str481$Can_t_handle__S__value___S_, property, value2);
                    }
                }
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 134832L)
    public static SubLObject assert_owl_label(final SubLObject v_term, final SubLObject value, final SubLObject import_parameters) {
        SubLObject label = (SubLObject)owl_to_cycl.NIL;
        SubLObject language = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(value, value, (SubLObject)owl_to_cycl.$list482);
        label = value.first();
        final SubLObject current = language = value.rest();
        final SubLObject lexicon = (SubLObject)((owl_to_cycl.NIL != language) ? ask_utilities.query_variable((SubLObject)owl_to_cycl.$sym483$_LEXICON, (SubLObject)ConsesLow.listS(owl_to_cycl.$const484$languageHasRootLexicon, language, (SubLObject)owl_to_cycl.$list485), owl_to_cycl.$const40$InferencePSC, (SubLObject)owl_to_cycl.$list486).first() : owl_to_cycl.NIL);
        final SubLObject mt = (owl_to_cycl.NIL != lexicon) ? lexicon : owl_to_cycl.$const487$GeneralEnglishMt;
        final SubLObject clean_label = string_utilities.strip_chars_meeting_test(label, Symbols.symbol_function((SubLObject)owl_to_cycl.$sym358$CONTROL_CHAR_P));
        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const488$rdfs_label, v_term, clean_label), mt, import_parameters);
        return label;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 135384L)
    public static SubLObject assert_owl_equivalent_class(final SubLObject col, final SubLObject external_name, final SubLObject defining_mt, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_class = owl_find_or_create_term_for_class(external_name, import_parameters);
        if (!v_class.equal(col)) {
            if (owl_to_cycl.NIL != v_class) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str489$Asserting_equivalent_class__S_of_, owl_to_cycl.$str239$__ }), v_class, col);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const490$owl_equivalentClass, v_class, col), defining_mt, import_parameters);
            }
            else if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str491$Failed_to_assert_equivalent_class, external_name, col);
            }
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 135886L)
    public static SubLObject assert_owl_restriction(final SubLObject col, final SubLObject restriction, final SubLObject defining_mt, final SubLObject import_parameters) {
        final SubLObject sentence = owl_restriction_sentence(col, restriction, import_parameters);
        if (owl_to_cycl.NIL != sentence) {
            owl_enqueue_assert(sentence, defining_mt, import_parameters);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 136157L)
    public static SubLObject owl_restriction_sentence(final SubLObject col, final SubLObject restriction, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = restriction.rest();
        SubLObject property = (SubLObject)owl_to_cycl.NIL;
        SubLObject type = (SubLObject)owl_to_cycl.NIL;
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        property = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        v_class = current.first();
        current = current.rest();
        if (owl_to_cycl.NIL == current) {
            final SubLObject pred = owl_find_or_create_term_of_type(property, owl_to_cycl.$const393$OWLProperty, import_parameters);
            final SubLObject resolved_class = (owl_to_cycl.NIL != forts.fort_p(v_class)) ? v_class : owl_find_or_create_term_of_type(v_class, owl_to_cycl.$const349$owl_Class, import_parameters);
            final SubLObject target = owl_find_or_create_term_from_specification(value, owl_to_cycl.$const16$Thing, import_parameters);
            SubLObject sentence = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(value) && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str493$Resolved_nonlocal_reference__S___, owl_to_cycl.$str239$__ }), value, target);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            if (owl_to_cycl.NIL != node_id_specification_p(target) && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str494$Node_ID_as_restriction_target___S, target);
            }
            if (owl_to_cycl.NIL == target) {
                Errors.warn((SubLObject)owl_to_cycl.$str495$Can_t_handle__S_restrictions_with, type, value);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str496$allValuesFrom))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const497$relationAllOnly, pred, col, target);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str498$someValuesFrom))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const499$relationAllExists, pred, col, target);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str500$hasValue))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const501$relationAllInstance, pred, col, target);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str502$minCardinality)) && value.eql((SubLObject)owl_to_cycl.ONE_INTEGER) && resolved_class.eql(owl_to_cycl.$const16$Thing)) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const503$requiredArg1Pred, col, pred);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str504$cardinality))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const505$relationAllExistsCount, pred, col, resolved_class, target);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str502$minCardinality))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const506$relationAllExistsMin, pred, col, resolved_class, target);
            }
            else if (type.equal(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str507$maxCardinality))) {
                sentence = (SubLObject)ConsesLow.list(owl_to_cycl.$const508$relationAllExistsMax, pred, col, resolved_class, target);
            }
            else {
                Errors.warn((SubLObject)owl_to_cycl.$str495$Can_t_handle__S_restrictions_with, type, value);
            }
            return sentence;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list492);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 138736L)
    public static SubLObject owl_restriction_collection(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == owl_to_cycl.UNPROVIDED) {
            genl = owl_to_cycl.$const16$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = restriction.rest();
        SubLObject property = (SubLObject)owl_to_cycl.NIL;
        SubLObject type = (SubLObject)owl_to_cycl.NIL;
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        SubLObject v_class = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        property = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list492);
        v_class = current.first();
        current = current.rest();
        if (owl_to_cycl.NIL == current) {
            final SubLObject pred = owl_find_or_create_term_of_type(property, owl_to_cycl.$const393$OWLProperty, import_parameters);
            final SubLObject resolved_class = (owl_to_cycl.NIL != forts.fort_p(v_class)) ? v_class : owl_find_or_create_term_of_type(v_class, owl_to_cycl.$const349$owl_Class, import_parameters);
            final SubLObject target = owl_find_or_create_term_from_specification(value, owl_to_cycl.$const16$Thing, import_parameters);
            SubLObject collection = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(value) && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str493$Resolved_nonlocal_reference__S___, owl_to_cycl.$str239$__ }), value, target);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            final SubLObject template = list_utilities.alist_lookup_without_values(owl_to_cycl.$owl_restriction_collection_templates$.getGlobalValue(), type, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL != template) {
                collection = cycl_utilities.formula_subst(pred, (SubLObject)owl_to_cycl.$kw515$PRED, cycl_utilities.formula_subst(resolved_class, (SubLObject)owl_to_cycl.$kw82$CLASS, cycl_utilities.formula_subst(target, (SubLObject)owl_to_cycl.$kw516$TARGET, cycl_utilities.formula_subst(genl, (SubLObject)owl_to_cycl.$kw517$GENL, template, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else {
                Errors.sublisp_break((SubLObject)owl_to_cycl.$str518$Can_t_create_collection_from__S_r, new SubLObject[] { type, value });
            }
            return collection;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list492);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 139777L)
    public static SubLObject find_or_create_owl_class_from_restriction_internal(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == owl_to_cycl.UNPROVIDED) {
            genl = owl_to_cycl.$const16$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_formula = owl_restriction_collection(restriction, import_parameters, genl);
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str520$Created__S_from__S, owl_to_cycl.$str239$__ }), term_formula, restriction);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return owl_find_or_create_nat(term_formula, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 139777L)
    public static SubLObject find_or_create_owl_class_from_restriction(final SubLObject restriction, final SubLObject import_parameters, SubLObject genl) {
        if (genl == owl_to_cycl.UNPROVIDED) {
            genl = owl_to_cycl.$const16$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == v_memoization_state) {
            return find_or_create_owl_class_from_restriction_internal(restriction, import_parameters, genl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)owl_to_cycl.$sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)owl_to_cycl.$sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, (SubLObject)owl_to_cycl.THREE_INTEGER, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)owl_to_cycl.$sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(restriction, import_parameters, genl);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)owl_to_cycl.NIL;
            collision = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (restriction.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (import_parameters.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (owl_to_cycl.NIL != cached_args && owl_to_cycl.NIL == cached_args.rest() && genl.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_or_create_owl_class_from_restriction_internal(restriction, import_parameters, genl)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(restriction, import_parameters, genl));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 140147L)
    public static SubLObject owl_find_or_create_nat(final SubLObject term_formula, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_type = find_or_create_term_type_for_ontology(owl_import_parameters_ontology(import_parameters), (SubLObject)owl_to_cycl.UNPROVIDED);
        owl_enqueue_assert((SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, term_formula, term_type), owl_to_cycl.$const365$BookkeepingMt, import_parameters);
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str521$__Asserting__S, owl_to_cycl.$str239$__ }), (SubLObject)ConsesLow.list(owl_to_cycl.$const364$quotedIsa, term_formula, term_type));
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        owl_utilities.note_term_acted_on_during_import(term_formula, owl_import_parameters_import_term(import_parameters), owl_import_parameters_cyclist(import_parameters));
        return (SubLObject)((owl_to_cycl.NIL != term_formula) ? czer_main.canonicalize_term(term_formula, (SubLObject)owl_to_cycl.UNPROVIDED) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 140798L)
    public static SubLObject try_to_resolve_node_id_specification(final SubLObject specification) {
        assert owl_to_cycl.NIL != node_id_specification_p(specification) : specification;
        final SubLObject resolved = lookup_node_id_reference(conses_high.second(specification));
        return (owl_to_cycl.NIL != resolved) ? resolved : specification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 141038L)
    public static SubLObject owl_find_or_create_term_from_specification(final SubLObject specification, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_term_from_specification_depth$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_term_from_specification_depth$.bind(number_utilities.f_1X(owl_to_cycl.$owl_term_from_specification_depth$.getDynamicValue(thread)), thread);
            if (owl_to_cycl.$owl_term_from_specification_depth$.getDynamicValue(thread).numG((SubLObject)owl_to_cycl.TEN_INTEGER)) {
                Errors.warn((SubLObject)owl_to_cycl.$str523$Nested_calls_resolving__S, specification);
            }
            if (owl_to_cycl.NIL != node_id_specification_p(specification)) {
                v_term = owl_find_or_create_term_from_node_id(specification, type, import_parameters);
            }
            else if (owl_to_cycl.NIL != owl_external_value_specification_union_p(specification)) {
                v_term = owl_find_or_create_union(specification, type, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (owl_to_cycl.NIL != owl_external_value_specification_intersection_p(specification)) {
                v_term = owl_find_or_create_intersection(specification, type, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (owl_to_cycl.NIL != owl_restriction_p(specification)) {
                v_term = find_or_create_owl_class_from_restriction(specification, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (owl_to_cycl.NIL != owl_external_term_enumeration_p(specification)) {
                SubLObject terms = (SubLObject)owl_to_cycl.NIL;
                SubLObject cdolist_list_var = owl_external_term_enumeration_terms(specification);
                SubLObject sub_spec = (SubLObject)owl_to_cycl.NIL;
                sub_spec = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    terms = (SubLObject)ConsesLow.cons(owl_find_or_create_term_from_specification(sub_spec, owl_to_cycl.$const16$Thing, import_parameters), terms);
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_spec = cdolist_list_var.first();
                }
                v_term = owl_term_enumeration(terms, import_parameters);
            }
            else if (owl_to_cycl.NIL != pattern_match.tree_matches_pattern(specification, (SubLObject)owl_to_cycl.$list524)) {
                final SubLObject complement = owl_find_or_create_term_from_specification(conses_high.second(specification), type, import_parameters);
                if (owl_to_cycl.NIL != complement) {
                    v_term = (SubLObject)ConsesLow.list(owl_to_cycl.$const525$CollectionDifferenceFn, owl_to_cycl.$const16$Thing, complement);
                }
            }
            else if (specification.isString()) {
                v_term = owl_find_or_create_term_of_type(specification, type, import_parameters);
            }
            else if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(specification)) {
                v_term = owl_find_or_create_term_of_type(specification, type, import_parameters);
            }
            else if (owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(specification) && (owl_to_cycl.NIL == el_utilities.el_formula_p(specification) || owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym526$VALID_CONSTANT_, specification, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED))) {
                v_term = specification;
            }
            else if (owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, specification, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                v_term = specification;
            }
        }
        finally {
            owl_to_cycl.$owl_term_from_specification_depth$.rebind(_prev_bind_0, thread);
        }
        if (owl_to_cycl.NIL == v_term) {
            Errors.sublisp_break((SubLObject)owl_to_cycl.$str527$Can_t_find_or_create__S_term_from, new SubLObject[] { type, specification });
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 143275L)
    public static SubLObject owl_find_or_create_union(final SubLObject specification, final SubLObject type, final SubLObject import_parameters, SubLObject resolve_node_idsP) {
        if (resolve_node_idsP == owl_to_cycl.UNPROVIDED) {
            resolve_node_idsP = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject names = owl_external_value_specification_union_names(specification);
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == resolve_node_idsP && owl_to_cycl.NIL != node_id_specification_p(names)) {
            v_term = owl_quasi_term_from_specification(specification, type, (SubLObject)owl_to_cycl.NIL, import_parameters);
        }
        else if (owl_to_cycl.NIL != node_id_specification_p(names)) {
            v_term = owl_term_union(owl_find_or_create_classes_from_node_id(names, type, import_parameters), import_parameters);
        }
        else {
            SubLObject terms = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = names;
            SubLObject sub_spec = (SubLObject)owl_to_cycl.NIL;
            sub_spec = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                terms = (SubLObject)ConsesLow.cons(owl_find_or_create_term_from_specification(sub_spec, type, import_parameters), terms);
                cdolist_list_var = cdolist_list_var.rest();
                sub_spec = cdolist_list_var.first();
            }
            v_term = owl_term_union(terms, import_parameters);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 144047L)
    public static SubLObject owl_find_or_create_intersection(final SubLObject specification, final SubLObject type, final SubLObject import_parameters, SubLObject resolve_node_idsP) {
        if (resolve_node_idsP == owl_to_cycl.UNPROVIDED) {
            resolve_node_idsP = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject names = owl_external_value_specification_intersection_names(specification);
        SubLObject v_term = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL == resolve_node_idsP && owl_to_cycl.NIL != node_id_specification_p(names)) {
            v_term = owl_quasi_term_from_specification(specification, type, (SubLObject)owl_to_cycl.NIL, import_parameters);
        }
        else if (owl_to_cycl.NIL != node_id_specification_p(names)) {
            v_term = owl_term_intersection(owl_find_or_create_classes_from_node_id(names, type, import_parameters), import_parameters);
        }
        else {
            SubLObject terms = (SubLObject)owl_to_cycl.NIL;
            SubLObject cdolist_list_var = Sequences.remove_if((SubLObject)owl_to_cycl.$sym528$OWL_RESTRICTION_P, names, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            SubLObject sub_spec = (SubLObject)owl_to_cycl.NIL;
            sub_spec = cdolist_list_var.first();
            while (owl_to_cycl.NIL != cdolist_list_var) {
                terms = (SubLObject)ConsesLow.cons(owl_find_or_create_term_from_specification(sub_spec, type, import_parameters), terms);
                cdolist_list_var = cdolist_list_var.rest();
                sub_spec = cdolist_list_var.first();
            }
            final SubLObject genl = (owl_to_cycl.NIL != list_utilities.non_empty_list_p(terms)) ? terms.first() : owl_to_cycl.$const16$Thing;
            SubLObject cdolist_list_var2 = list_utilities.remove_if_not((SubLObject)owl_to_cycl.$sym528$OWL_RESTRICTION_P, names, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            SubLObject sub_spec2 = (SubLObject)owl_to_cycl.NIL;
            sub_spec2 = cdolist_list_var2.first();
            while (owl_to_cycl.NIL != cdolist_list_var2) {
                terms = (SubLObject)ConsesLow.cons(find_or_create_owl_class_from_restriction(sub_spec2, import_parameters, genl), terms);
                cdolist_list_var2 = cdolist_list_var2.rest();
                sub_spec2 = cdolist_list_var2.first();
            }
            v_term = owl_term_intersection(terms, import_parameters);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 145109L)
    public static SubLObject owl_find_or_create_classes_from_node_id(final SubLObject node_id_specification, final SubLObject type, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != node_id_specification_p(node_id_specification) : node_id_specification;
        final SubLObject reference = lookup_node_id_reference(conses_high.second(node_id_specification));
        SubLObject v_classes = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != reference) {
            if (owl_to_cycl.NIL != possible_read_owl_list_p(reference)) {
                SubLObject cdolist_list_var;
                final SubLObject items = cdolist_list_var = reference;
                SubLObject item = (SubLObject)owl_to_cycl.NIL;
                item = cdolist_list_var.first();
                while (owl_to_cycl.NIL != cdolist_list_var) {
                    final SubLObject external_name = item.isString() ? read_owl_term_reference(item, import_parameters) : read_owl_class_or_restriction(item, import_parameters);
                    v_classes = (SubLObject)ConsesLow.cons(owl_find_or_create_term_from_specification(external_name, type, import_parameters), v_classes);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                v_classes = Sequences.nreverse(v_classes);
            }
            else if (owl_to_cycl.NIL != list_utilities.list_of_type_p((SubLObject)owl_to_cycl.$sym157$OWL_EXTERNAL_VALUE_SPECIFICATION_P, reference)) {
                SubLObject cdolist_list_var2 = reference;
                SubLObject item2 = (SubLObject)owl_to_cycl.NIL;
                item2 = cdolist_list_var2.first();
                while (owl_to_cycl.NIL != cdolist_list_var2) {
                    v_classes = (SubLObject)ConsesLow.cons(owl_find_or_create_term_from_specification(item2, type, import_parameters), v_classes);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    item2 = cdolist_list_var2.first();
                }
                v_classes = Sequences.nreverse(v_classes);
            }
        }
        if (owl_to_cycl.NIL != v_classes) {
            note_node_id_reference(conses_high.second(node_id_specification), v_classes);
        }
        return v_classes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 146175L)
    public static SubLObject owl_find_or_create_term_from_node_id(final SubLObject node_id_specification, final SubLObject type, final SubLObject import_parameters) {
        assert owl_to_cycl.NIL != node_id_specification_p(node_id_specification) : node_id_specification;
        SubLObject reference = lookup_node_id_reference(conses_high.second(node_id_specification));
        SubLObject v_term = node_id_specification;
        if (owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, reference, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str529$__Trying_to_resolve__S__, reference);
            final SubLObject maybe_resolved = cycl_utilities.expression_transform(el_utilities.copy_expression(reference), (SubLObject)owl_to_cycl.$sym159$OWL_QUASI_TERM_P, (SubLObject)owl_to_cycl.$sym441$RESOLVE_OWL_QUASI_TERM, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL == cycl_utilities.expression_find((SubLObject)owl_to_cycl.$kw422$UNRESOLVED, maybe_resolved, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                reference = maybe_resolved;
            }
            PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str530$__Result___S__, reference);
        }
        if (owl_to_cycl.NIL != reference) {
            if (owl_to_cycl.NIL != cycl_grammar.cycl_denotational_term_p(reference) && owl_to_cycl.NIL != cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym344$CONSTANT_P, reference, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED) && owl_to_cycl.NIL == cycl_utilities.expression_find_if((SubLObject)owl_to_cycl.$sym345$KEYWORDP, reference, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
                v_term = reference;
            }
            else if (owl_to_cycl.NIL != owl_external_value_specification_p(reference)) {
                final SubLObject resolved = owl_find_or_create_term_from_specification(reference, type, import_parameters);
                if (owl_to_cycl.NIL != resolved) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str449$__Resolved__S___to__S__, node_id_specification, resolved);
                    v_term = resolved;
                    note_node_id_reference(conses_high.second(node_id_specification), v_term);
                }
            }
            else {
                Errors.warn((SubLObject)owl_to_cycl.$str531$Trying_to_create_term_from__S, reference);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject owl_term_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_term_info(v_object, stream, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject owl_term_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $owl_term_info_native.class) ? owl_to_cycl.T : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject oti_cyc_name(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject oti_comment(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject oti_superclasses(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject oti_disjoint_classes(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject oti_plist(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject _csetf_oti_cyc_name(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject _csetf_oti_comment(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject _csetf_oti_superclasses(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject _csetf_oti_disjoint_classes(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject _csetf_oti_plist(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject make_owl_term_info(SubLObject arglist) {
        if (arglist == owl_to_cycl.UNPROVIDED) {
            arglist = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject v_new = (SubLObject)new $owl_term_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)owl_to_cycl.NIL, next = arglist; owl_to_cycl.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)owl_to_cycl.$kw142$CYC_NAME)) {
                _csetf_oti_cyc_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw143$COMMENT)) {
                _csetf_oti_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw550$SUPERCLASSES)) {
                _csetf_oti_superclasses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw551$DISJOINT_CLASSES)) {
                _csetf_oti_disjoint_classes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw146$PLIST)) {
                _csetf_oti_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)owl_to_cycl.$str147$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject visit_defstruct_owl_term_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw148$BEGIN, (SubLObject)owl_to_cycl.$sym552$MAKE_OWL_TERM_INFO, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw142$CYC_NAME, oti_cyc_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw143$COMMENT, oti_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw550$SUPERCLASSES, oti_superclasses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw551$DISJOINT_CLASSES, oti_disjoint_classes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw146$PLIST, oti_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw151$END, (SubLObject)owl_to_cycl.$sym552$MAKE_OWL_TERM_INFO, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 147841L)
    public static SubLObject visit_defstruct_object_owl_term_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_term_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 148009L)
    public static SubLObject print_owl_term_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)owl_to_cycl.$str554$_OWL_TERM_INFO__A_, oti_cyc_name(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 148178L)
    public static SubLObject find_or_create_owl_term_info(final SubLObject cyc_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_info = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != cyc_name && owl_to_cycl.NIL != misc_utilities.initialized_p(owl_to_cycl.$owl_definition_accumulator$.getDynamicValue(thread)) && owl_to_cycl.NIL == term_info) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = (SubLObject)owl_to_cycl.$list555, type = (SubLObject)owl_to_cycl.NIL, type = csome_list_var.first(); owl_to_cycl.NIL == term_info && owl_to_cycl.NIL != csome_list_var; term_info = find_accumulated_owl_definition(cyc_name, type), csome_list_var = csome_list_var.rest(), type = csome_list_var.first()) {}
        }
        return (owl_to_cycl.NIL != term_info) ? term_info : new_owl_term_info(cyc_name, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 148534L)
    public static SubLObject new_owl_term_info(SubLObject cyc_name, SubLObject comment) {
        if (cyc_name == owl_to_cycl.UNPROVIDED) {
            cyc_name = (SubLObject)owl_to_cycl.NIL;
        }
        if (comment == owl_to_cycl.UNPROVIDED) {
            comment = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject term_info = make_owl_term_info((SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL != cyc_name) {
            set_owl_term_info_cyc_name(term_info, cyc_name);
        }
        set_owl_term_info_comment(term_info, comment);
        _csetf_oti_plist(term_info, (SubLObject)owl_to_cycl.NIL);
        return term_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 148825L)
    public static SubLObject owl_term_info_cyc_name(final SubLObject term_info) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        return oti_cyc_name(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 148964L)
    public static SubLObject owl_term_info_comment(final SubLObject term_info) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        return oti_comment(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149089L)
    public static SubLObject owl_term_info_superclasses(final SubLObject term_info) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        return oti_superclasses(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149224L)
    public static SubLObject owl_term_info_disjoint_classes(final SubLObject term_info) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        return oti_disjoint_classes(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149367L)
    public static SubLObject owl_term_info_plist(final SubLObject term_info) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        return oti_plist(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149488L)
    public static SubLObject owl_term_info_plist_lookup(final SubLObject term_info, final SubLObject key, SubLObject default_value) {
        if (default_value == owl_to_cycl.UNPROVIDED) {
            default_value = (SubLObject)owl_to_cycl.NIL;
        }
        return conses_high.getf(oti_plist(term_info), key, default_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149628L)
    public static SubLObject owl_term_info_external_name(final SubLObject term_info, SubLObject default_value) {
        if (default_value == owl_to_cycl.UNPROVIDED) {
            default_value = (SubLObject)owl_to_cycl.NIL;
        }
        return owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, default_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 149786L)
    public static SubLObject set_owl_term_info_cyc_name(final SubLObject term_info, final SubLObject name) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        assert owl_to_cycl.NIL != Types.stringp(name) : name;
        _csetf_oti_cyc_name(term_info, name);
        return oti_cyc_name(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 150002L)
    public static SubLObject set_owl_term_info_comment(final SubLObject term_info, final SubLObject comment) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        if (owl_to_cycl.NIL != comment && !owl_to_cycl.assertionsDisabledInClass && owl_to_cycl.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        _csetf_oti_comment(term_info, comment);
        return oti_comment(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 150223L)
    public static SubLObject add_owl_term_info_superclass(final SubLObject term_info, final SubLObject superclass) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        assert owl_to_cycl.NIL != owl_external_value_specification_p(superclass) : superclass;
        if (owl_to_cycl.NIL == conses_high.member(superclass, oti_superclasses(term_info), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
            _csetf_oti_superclasses(term_info, (SubLObject)ConsesLow.cons(superclass, oti_superclasses(term_info)));
        }
        return oti_superclasses(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 150493L)
    public static SubLObject add_owl_term_info_disjoint_class(final SubLObject term_info, final SubLObject disjoint_class) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        assert owl_to_cycl.NIL != owl_external_value_specification_p(disjoint_class) : disjoint_class;
        if (owl_to_cycl.NIL == conses_high.member(disjoint_class, oti_disjoint_classes(term_info), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), Symbols.symbol_function((SubLObject)owl_to_cycl.IDENTITY))) {
            _csetf_oti_disjoint_classes(term_info, (SubLObject)ConsesLow.cons(disjoint_class, oti_disjoint_classes(term_info)));
        }
        return oti_disjoint_classes(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 150787L)
    public static SubLObject owl_term_info_plist_enter(final SubLObject term_info, final SubLObject key, final SubLObject value) {
        _csetf_oti_plist(term_info, conses_high.putf(oti_plist(term_info), key, value));
        return oti_plist(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 150956L)
    public static SubLObject owl_term_info_plist_push(final SubLObject term_info, final SubLObject key, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
        final SubLObject existing = conses_high.getf(oti_plist(term_info), key, (SubLObject)owl_to_cycl.NIL);
        final SubLObject v_new = (SubLObject)((owl_to_cycl.NIL != Sequences.find(value, existing, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) ? existing : ConsesLow.cons(value, existing));
        owl_term_info_plist_enter(term_info, key, v_new);
        return oti_plist(term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 151285L)
    public static SubLObject owl_term_info_plist_list_propertyP(final SubLObject key) {
        if (key.eql((SubLObject)owl_to_cycl.$kw260$ISAS) || key.eql((SubLObject)owl_to_cycl.$kw265$LABEL) || key.eql((SubLObject)owl_to_cycl.$kw462$EQUIVALENT_CLASSES) || key.eql((SubLObject)owl_to_cycl.$kw292$MY_PRED_VALUES) || key.eql((SubLObject)owl_to_cycl.$kw463$UNION_OF) || key.eql((SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (key.eql((SubLObject)owl_to_cycl.$kw320$NODE_ID) || key.eql((SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME) || key.eql((SubLObject)owl_to_cycl.$kw322$COMPLEMENT_CLASS) || key.eql((SubLObject)owl_to_cycl.$kw478$ENUMERATED_INSTANCES) || key.eql((SubLObject)owl_to_cycl.$kw284$GUID) || key.eql((SubLObject)owl_to_cycl.$kw287$EXTERNALID)) {
            return (SubLObject)owl_to_cycl.NIL;
        }
        if (key.eql((SubLObject)owl_to_cycl.$kw275$GENL_PROPERTY) || key.eql((SubLObject)owl_to_cycl.$kw272$INVERSE)) {
            return (SubLObject)owl_to_cycl.NIL;
        }
        Errors.sublisp_break((SubLObject)owl_to_cycl.$str556$Don_t_know_about__S, new SubLObject[] { key });
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 151680L)
    public static SubLObject merge_owl_term_definitions(final SubLObject from, final SubLObject onto) {
        final SubLObject cyc_name = owl_term_info_cyc_name(from);
        if (cyc_name.isString()) {
            set_owl_term_info_cyc_name(onto, cyc_name);
        }
        set_owl_term_info_comment(onto, owl_term_info_comment(from));
        SubLObject cdolist_list_var = owl_term_info_superclasses(from);
        SubLObject superclass = (SubLObject)owl_to_cycl.NIL;
        superclass = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            add_owl_term_info_superclass(onto, superclass);
            cdolist_list_var = cdolist_list_var.rest();
            superclass = cdolist_list_var.first();
        }
        cdolist_list_var = owl_term_info_disjoint_classes(from);
        SubLObject disjoint_class = (SubLObject)owl_to_cycl.NIL;
        disjoint_class = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            add_owl_term_info_disjoint_class(onto, disjoint_class);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_class = cdolist_list_var.first();
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject from_value;
        SubLObject onto_value;
        SubLObject new_value;
        for (remainder = (SubLObject)owl_to_cycl.NIL, remainder = owl_term_info_plist(from); owl_to_cycl.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            from_value = conses_high.cadr(remainder);
            onto_value = owl_term_info_plist_lookup(onto, property, (SubLObject)owl_to_cycl.UNPROVIDED);
            new_value = ((owl_to_cycl.NIL != owl_term_info_plist_list_propertyP(property)) ? conses_high.union(from_value, onto_value, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED) : from_value);
            owl_term_info_plist_enter(onto, property, new_value);
        }
        return onto;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 152500L)
    public static SubLObject sxhash_owl_term_info_method(final SubLObject v_object) {
        return sxhash_owl_term_info(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 152606L)
    public static SubLObject sxhash_owl_term_info(final SubLObject term_info) {
        return Sxhash.sxhash(oti_cyc_name(term_info));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 152711L)
    public static SubLObject import_named_bnodes(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw558$BNODE, thread);
            SubLObject new_tokens;
            for (SubLObject tokens = original_tokens; owl_to_cycl.NIL != tokens; new_tokens = (tokens = read_one_named_bnode(tokens, import_parameters))) {}
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 153019L)
    public static SubLObject read_one_named_bnode(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL == doneP && owl_to_cycl.NIL == list_utilities.empty_list_p(tokens)) {
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str559$__Reading_Description___S__, owl_to_cycl.$str239$__ }), current_token);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
                if (owl_to_cycl.NIL != node_id && owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(conses_high.second(tokens), rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str328$first))) {
                    final SubLObject list = read_owl_list(tokens.rest(), import_parameters);
                    note_node_id_reference(node_id, list);
                    doneP = (SubLObject)owl_to_cycl.T;
                }
                else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str560$Skipping_rdf_Description_element_, owl_to_cycl.$str239$__ }));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str561$__Reading_Restriction___S__, owl_to_cycl.$str239$__ }), current_token);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
                if (owl_to_cycl.NIL != node_id) {
                    read_owl_restriction(tokens, import_parameters);
                    doneP = (SubLObject)owl_to_cycl.T;
                }
                else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str562$Skipping_owl_Restriction_element_, owl_to_cycl.$str239$__ }));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str99$RDF)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, next_noninitial_non_whitespace_xml_token_position(tokens));
            }
            else if (owl_to_cycl.NIL != owl_class_token_p(current_token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, (SubLObject)owl_to_cycl.$str563$Reading_top_level_named_class__S, current_token);
                read_owl_class(tokens, import_parameters);
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else {
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
            }
            current_token = (SubLObject)((owl_to_cycl.NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : owl_to_cycl.NIL);
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 155102L)
    public static SubLObject read_class_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw82$CLASS, thread);
            SubLObject new_tokens;
            for (SubLObject tokens = original_tokens; owl_to_cycl.NIL != tokens; new_tokens = (tokens = read_one_class_info_from_owl_tokens(tokens, import_parameters))) {}
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 155416L)
    public static SubLObject read_one_class_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject term_info = (SubLObject)owl_to_cycl.NIL;
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL == doneP && owl_to_cycl.NIL == list_utilities.empty_list_p(tokens)) {
            thread.resetMultipleValues();
            final SubLObject new_term_info = read_one_owl_chunk_for_class_info(current_token, term_info, import_parameters, tokens);
            final SubLObject token_advance_spec = thread.secondMultipleValue();
            final SubLObject term_info_doneP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (!term_info.eql(new_term_info)) {
                term_info = new_term_info;
            }
            if (owl_to_cycl.NIL != term_info_doneP) {
                if (owl_to_cycl.NIL == term_info) {
                    if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                        Errors.warn((SubLObject)owl_to_cycl.$str564$Failed_or_declined_to_read_a_clas);
                    }
                }
                else if (owl_to_cycl.NIL != list_utilities.empty_list_p(owl_term_info_superclasses(term_info)) && owl_to_cycl.NIL != list_utilities.empty_list_p(owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, (SubLObject)owl_to_cycl.UNPROVIDED)) && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str565$There_are_no_superclasses_for__S, owl_to_cycl.$str239$__ }), term_info);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                if (owl_to_cycl.NIL != term_info && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str566$Finished__S____Superclasses___S__, owl_to_cycl.$str239$__ }), new SubLObject[] { term_info, owl_term_info_superclasses(term_info), owl_term_info_disjoint_classes(term_info), owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, (SubLObject)owl_to_cycl.UNPROVIDED) });
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                if (owl_to_cycl.NIL != term_info) {
                    accumulate_owl_definition(term_info, (SubLObject)owl_to_cycl.$kw82$CLASS);
                }
                doneP = (SubLObject)owl_to_cycl.T;
            }
            if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            }
            else if (token_advance_spec.isString()) {
                tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else {
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
            }
            current_token = (SubLObject)((owl_to_cycl.NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : owl_to_cycl.NIL);
        }
        return Values.values(tokens, term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 157171L)
    public static SubLObject read_one_owl_chunk_for_class_info(final SubLObject current_token, final SubLObject term_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term_info = term_info;
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
        SubLObject term_info_doneP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_starts_with(current_token, (SubLObject)owl_to_cycl.$str256$____)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, (SubLObject)owl_to_cycl.$str257$___, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !comment_close_position.isInteger()) {
                Errors.error((SubLObject)owl_to_cycl.$str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, tokens));
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str567$Skipping_HTML_comment___S, owl_to_cycl.$str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        }
        else if (owl_to_cycl.NIL != owl_class_token_p(current_token) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(current_token)) {
            term_info_doneP = (SubLObject)owl_to_cycl.T;
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != owl_class_token_p(current_token)) {
            SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject cyc_name = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                thread.resetMultipleValues();
                final SubLObject external_name_$75 = term_names_from_token(current_token, import_parameters);
                final SubLObject cyc_name_$76 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                external_name = external_name_$75;
                cyc_name = cyc_name_$76;
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str568$Reading_definition_of__S, owl_to_cycl.$str239$__ }), external_name);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            new_term_info = find_or_create_owl_term_info(cyc_name);
            final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, type);
            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL != node_id) {
                owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id);
            }
            if (owl_to_cycl.NIL != cyc_name) {
                set_owl_term_info_cyc_name(new_term_info, cyc_name);
            }
            if (owl_to_cycl.NIL != external_name) {
                owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, external_name);
            }
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                term_info_doneP = (SubLObject)owl_to_cycl.T;
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != owl_property_token_p(current_token)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str569$Skipping__S_to_close_tag, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL == term_info) {
            token_advance_spec = handle_non_target_owl_token(current_token);
        }
        else {
            token_advance_spec = handle_term_info_token(new_term_info, tokens, import_parameters);
        }
        return Values.values(new_term_info, token_advance_spec, term_info_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 159419L)
    public static SubLObject read_instance_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw84$INSTANCE, thread);
            for (SubLObject tokens = original_tokens; owl_to_cycl.NIL != tokens; tokens = read_one_instance_info_from_owl_tokens(tokens, import_parameters)) {}
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 159698L)
    public static SubLObject read_one_instance_info_from_owl_tokens(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = original_tokens;
        SubLObject current_token = tokens.first();
        SubLObject term_info = (SubLObject)owl_to_cycl.NIL;
        SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL == doneP && owl_to_cycl.NIL == list_utilities.empty_list_p(tokens)) {
            thread.resetMultipleValues();
            final SubLObject new_term_info = read_one_owl_chunk_for_instance_info(current_token, term_info, import_parameters, tokens);
            final SubLObject token_advance_spec = thread.secondMultipleValue();
            final SubLObject term_info_doneP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (!term_info.eql(new_term_info)) {
                term_info = new_term_info;
            }
            if (owl_to_cycl.NIL != term_info_doneP) {
                if (owl_to_cycl.NIL == term_info && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                    Errors.warn((SubLObject)owl_to_cycl.$str570$Failed_or_declined_to_read_an_ins);
                }
                if (owl_to_cycl.NIL != term_info) {
                    accumulate_owl_definition(term_info, (SubLObject)owl_to_cycl.$kw84$INSTANCE);
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str571$Finished__S_, owl_to_cycl.$str239$__ }), term_info);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                }
                doneP = (SubLObject)owl_to_cycl.T;
            }
            if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            }
            else if (token_advance_spec.isString()) {
                tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else {
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
            }
            current_token = (SubLObject)((owl_to_cycl.NIL != list_utilities.non_empty_list_p(tokens)) ? tokens.first() : owl_to_cycl.NIL);
        }
        return Values.values(tokens, term_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 161046L)
    public static SubLObject read_one_owl_chunk_for_instance_info(final SubLObject current_token, final SubLObject term_info, final SubLObject import_parameters, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_term_info = term_info;
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
        final SubLObject maybe_instance_tokenP = owl_maybe_instance_tokenP(current_token, import_parameters);
        SubLObject term_info_doneP = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_comment_p(current_token)) {
            final SubLObject comment_close_position = xml_parsing_utilities.next_xml_token_position(tokens, (SubLObject)owl_to_cycl.$str257$___, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !comment_close_position.isInteger()) {
                Errors.error((SubLObject)owl_to_cycl.$str258$Couldn_t_find_end_of_HTML_comment, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, tokens));
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str567$Skipping_HTML_comment___S, owl_to_cycl.$str239$__ }), list_utilities.first_n(number_utilities.f_1X(comment_close_position), tokens));
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = number_utilities.f_1X(comment_close_position);
        }
        else if (owl_to_cycl.NIL != maybe_instance_tokenP && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(current_token)) {
            term_info_doneP = (SubLObject)owl_to_cycl.T;
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL == term_info && owl_to_cycl.NIL != maybe_instance_tokenP) {
            SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
            SubLObject cyc_name = (SubLObject)owl_to_cycl.NIL;
            if (owl_to_cycl.NIL == list_utilities.empty_list_p(xml_parsing_utilities.parse_xml_token(current_token).rest())) {
                thread.resetMultipleValues();
                final SubLObject external_name_$77 = term_names_from_token(current_token, import_parameters);
                final SubLObject cyc_name_$78 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                external_name = external_name_$77;
                cyc_name = cyc_name_$78;
            }
            new_term_info = find_or_create_owl_term_info(cyc_name);
            if (owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) {
                final SubLObject type = xml_parsing_utilities.xml_token_element_name(current_token);
                owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, type);
            }
            if (owl_to_cycl.NIL != cyc_name) {
                set_owl_term_info_cyc_name(new_term_info, cyc_name);
            }
            if (owl_to_cycl.NIL != external_name) {
                owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, external_name);
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str572$__Defining__S_as_an_instance_of__, owl_to_cycl.$str239$__ }), new_term_info, xml_parsing_utilities.xml_token_element_name(current_token));
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                term_info_doneP = (SubLObject)owl_to_cycl.T;
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != owl_property_token_p(current_token)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str569$Skipping__S_to_close_tag, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != owl_class_token_p(current_token)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str569$Skipping__S_to_close_tag, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) {
            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL != node_id && owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(conses_high.second(tokens), rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str328$first))) {
                final SubLObject list = read_owl_list(tokens.rest(), import_parameters);
                note_node_id_reference(node_id, list);
            }
            else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str560$Skipping_rdf_Description_element_, owl_to_cycl.$str239$__ }));
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL == term_info) {
            token_advance_spec = handle_non_target_owl_token(current_token);
        }
        else {
            token_advance_spec = handle_term_info_token(new_term_info, tokens, import_parameters);
        }
        return Values.values(new_term_info, token_advance_spec, term_info_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 163930L)
    public static SubLObject owl_maybe_instance_tokenP(final SubLObject token, final SubLObject import_parameters) {
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(owl_to_cycl.NIL != xml_parsing_utilities.xml_tagP(token) && owl_to_cycl.NIL == owl_non_instance_tokenP(token, import_parameters));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 164118L)
    public static SubLObject owl_non_instance_tokenP(final SubLObject token, final SubLObject import_parameters) {
        if (owl_to_cycl.NIL != owl_class_token_p(token)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, (SubLObject)owl_to_cycl.$str87$_xml)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_doctype_tag_p(token)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != conses_high.member(xml_parsing_utilities.xml_token_element_name(token), owl_to_cycl.$cyc_properties_to_not_import$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED) && owl_import_parameters_base_uri(import_parameters).isString() && owl_to_cycl.NIL != string_utilities.substringP((SubLObject)owl_to_cycl.$str294$cyc_com, owl_import_parameters_base_uri(import_parameters), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            return (SubLObject)owl_to_cycl.T;
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_prefixed_name_p(xml_parsing_utilities.xml_token_element_name(token)) && owl_to_cycl.NIL != owl_reserved_namespace_p(xml_parsing_utilities.xml_prefixed_name_namespace(xml_parsing_utilities.xml_token_element_name(token)))) {
            return (SubLObject)owl_to_cycl.T;
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 164920L)
    public static SubLObject handle_non_target_owl_token(final SubLObject current_token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str98$Ontology))) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str569$Skipping__S_to_close_tag, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str573$AllDifferent))) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str569$Skipping__S_to_close_tag, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str99$RDF))) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str574$Skipping__S, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_declaration_p(current_token) || owl_to_cycl.NIL != xml_parsing_utilities.xml_doctype_tag_p(current_token)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str574$Skipping__S, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL == xml_parsing_utilities.xml_tagP(current_token)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str574$Skipping__S, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_tagP(current_token) && owl_to_cycl.NIL == xml_parsing_utilities.xml_prefixed_name_p(xml_parsing_utilities.xml_token_element_name(current_token))) {
            if (owl_to_cycl.NIL != Characters.lower_case_p(string_utilities.first_char(xml_parsing_utilities.xml_token_element_name(current_token))) && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str575$Skipping_locally_defined__S_to_cl, current_token);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str574$Skipping__S, owl_to_cycl.$str239$__ }), current_token);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        return token_advance_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 166429L)
    public static SubLObject handle_term_info_token(final SubLObject new_term_info, SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        final SubLObject current_token = tokens.first();
        if (owl_to_cycl.NIL != string_utilities.whitespace_stringP(current_token)) {
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str113$label))) {
            if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) {
                Errors.error((SubLObject)owl_to_cycl.$str263$Can_t_interpret_empty_label_token, current_token);
            }
            final SubLObject lang_value = xml_parsing_utilities.xml_tag_attribute_value(current_token, xml_name((SubLObject)owl_to_cycl.$str114$lang), (SubLObject)owl_to_cycl.NIL);
            final SubLObject language = (owl_to_cycl.NIL != lang_value) ? html_utilities.decode_html_language_abbreviation(lang_value) : owl_to_cycl.$const115$EnglishLanguage;
            final SubLObject label = conses_high.second(tokens);
            if (owl_to_cycl.NIL != lang_value && owl_to_cycl.NIL == language && owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str264$Can_t_decode_language_abbreviatio, lang_value);
            }
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw265$LABEL, (SubLObject)ConsesLow.cons(label, language));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str262$type))) {
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, term_names_from_token(current_token, import_parameters));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str110$comment))) {
            set_owl_term_info_comment(new_term_info, next_noninitial_non_whitespace_xml_token(tokens));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str576$subClassOf)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
            final SubLObject superclass = read_owl_class_or_restriction(tokens.rest(), import_parameters);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str577$Read_superclass___S, owl_to_cycl.$str239$__ }), superclass);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            add_owl_term_info_superclass(new_term_info, superclass);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, rdf_utilities.rdfs_name((SubLObject)owl_to_cycl.$str576$subClassOf))) {
            add_owl_term_info_superclass(new_term_info, read_owl_term_reference(current_token, import_parameters));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str578$disjointWith)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
            add_owl_term_info_disjoint_class(new_term_info, read_owl_class_or_restriction(tokens.rest(), import_parameters));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str578$disjointWith))) {
            add_owl_term_info_disjoint_class(new_term_info, process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED)));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token) && owl_to_cycl.NIL != conses_high.member(xml_parsing_utilities.xml_token_element_name(current_token), (SubLObject)ConsesLow.list(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str579$equivalentClass), (SubLObject)owl_to_cycl.$str580$owlEquivalentClass), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject equivalent_class = read_owl_class_or_restriction(tokens.rest(), import_parameters);
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw462$EQUIVALENT_CLASSES, equivalent_class);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != conses_high.member(xml_parsing_utilities.xml_token_element_name(current_token), (SubLObject)ConsesLow.list(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str579$equivalentClass), (SubLObject)owl_to_cycl.$str580$owlEquivalentClass), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject equivalent_class = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED));
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw462$EQUIVALENT_CLASSES, equivalent_class);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str581$complementOf)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(current_token)) {
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw322$COMPLEMENT_CLASS, read_owl_class_or_restriction(tokens.rest(), import_parameters));
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str581$complementOf))) {
            final SubLObject complement_class = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED));
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw322$COMPLEMENT_CLASS, complement_class);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str582$intersectionOf)) && owl_to_cycl.NIL == xml_parsing_utilities.xml_empty_tagP(current_token)) {
            SubLObject v_classes = (SubLObject)owl_to_cycl.NIL;
            SubLObject v_class;
            SubLObject first_token;
            for (tokens = tokens.rest(); owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str582$intersectionOf), tokens.first()); tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens)) {
                v_class = (SubLObject)owl_to_cycl.NIL;
                first_token = tokens.first();
                if (owl_to_cycl.NIL != owl_class_token_p(first_token) || owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
                    v_class = read_owl_class_or_restriction(tokens, import_parameters);
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) {
                    v_class = owl_external_name_from_token(first_token, import_parameters);
                }
                if (owl_to_cycl.NIL != v_class) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str583$Read_one_intersection_element___S, owl_to_cycl.$str239$__ }), v_class);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    v_classes = (SubLObject)ConsesLow.cons(v_class, v_classes);
                }
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str584$Intersection___S, owl_to_cycl.$str239$__ }), v_classes);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, v_classes);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str582$intersectionOf)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED)) {
            final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
            final SubLObject v_classes2 = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str584$Intersection___S, owl_to_cycl.$str239$__ }), v_classes2);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw324$INTERSECTION_OF, v_classes2);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str318$unionOf)) && owl_to_cycl.NIL == xml_parsing_utilities.xml_empty_tagP(current_token)) {
            SubLObject v_classes = (SubLObject)owl_to_cycl.NIL;
            SubLObject v_class;
            SubLObject first_token;
            for (tokens = tokens.rest(); owl_to_cycl.NIL == xml_parsing_utilities.xml_closing_tokenP(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str318$unionOf), tokens.first()); tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens)) {
                v_class = (SubLObject)owl_to_cycl.NIL;
                first_token = tokens.first();
                if (owl_to_cycl.NIL != owl_class_token_p(first_token) || owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
                    v_class = read_owl_class_or_restriction(tokens, import_parameters);
                }
                else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(first_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description))) {
                    v_class = owl_external_name_from_token(first_token, import_parameters);
                }
                if (owl_to_cycl.NIL != v_class) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str585$Read_one_union_element___S, owl_to_cycl.$str239$__ }), v_class);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    v_classes = (SubLObject)ConsesLow.cons(v_class, v_classes);
                }
            }
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str586$Union___S, owl_to_cycl.$str239$__ }), v_classes);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw463$UNION_OF, v_classes);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(current_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str300$oneOf))) {
            final SubLObject enumeration = read_owl_enumeration(tokens, import_parameters);
            owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw478$ENUMERATED_INSTANCES, enumeration);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str587$Read_enumerated_instances___S, owl_to_cycl.$str239$__ }), enumeration);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str281$guid, import_parameters)) {
            handle_cyc_guid(new_term_info, tokens);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str285$externalID, import_parameters)) {
            handle_cyc_external_id(new_term_info, tokens);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_tagP(current_token)) {
            handle_property_value_pair(new_term_info, current_token, tokens, import_parameters);
            token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
        }
        else {
            if (owl_to_cycl.NIL != owl_utilities.owl_warnP()) {
                Errors.warn((SubLObject)owl_to_cycl.$str293$Ignoring_unrecognized_token___S, current_token);
            }
            token_advance_spec = (SubLObject)owl_to_cycl.$kw261$NEXT_NON_WHITESPACE_TOKEN;
        }
        return token_advance_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 174178L)
    public static SubLObject handle_cyc_guid(final SubLObject new_term_info, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = conses_high.second(tokens);
        final SubLObject guid = owl_value_from_string(next_token, (SubLObject)owl_to_cycl.$str282$string);
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str283$__Noting_Cyc_guid_for__S_S__, owl_to_cycl.$str239$__ }), guid, new_term_info);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw284$GUID, guid);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 174462L)
    public static SubLObject handle_cyc_external_id(final SubLObject new_term_info, final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = conses_high.second(tokens);
        final SubLObject externalid = owl_value_from_string(next_token, (SubLObject)owl_to_cycl.$str282$string);
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str286$__Noting_Cyc_externalID_for__S_S_, owl_to_cycl.$str239$__ }), externalid, new_term_info);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        owl_term_info_plist_enter(new_term_info, (SubLObject)owl_to_cycl.$kw287$EXTERNALID, externalid);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 174783L)
    public static SubLObject handle_property_value_pair(final SubLObject new_term_info, final SubLObject current_token, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_name = xml_parsing_utilities.xml_token_element_name(current_token);
        final SubLObject value_name = (SubLObject)((owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(current_token)) ? term_names_from_token(current_token, import_parameters) : owl_to_cycl.NIL);
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != value_name) {
            value = owl_find_or_create_term_of_type(value_name, owl_to_cycl.$const16$Thing, import_parameters);
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(conses_high.second(tokens))) {
            value = (SubLObject)owl_to_cycl.$str92$;
        }
        else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_tagP(conses_high.second(tokens))) {
            final SubLObject term_info = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ONE_INTEGER), read_one_instance_info_from_owl_tokens(tokens.rest(), import_parameters));
            assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
            value = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        else {
            final SubLObject datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(current_token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str288$datatype), (SubLObject)owl_to_cycl.UNPROVIDED));
            final SubLObject next_token = conses_high.second(tokens);
            value = owl_value_from_string(next_token, datatype);
        }
        if (owl_to_cycl.NIL == value) {
            Errors.warn((SubLObject)owl_to_cycl.$str588$Couldn_t_determine_value_from__S_, current_token, conses_high.second(tokens));
        }
        else if (owl_to_cycl.NIL != cyc_token_with_nameP(current_token, (SubLObject)owl_to_cycl.$str289$isa, import_parameters)) {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str290$__Noting__isa__S__S___, owl_to_cycl.$str239$__ }), new_term_info, value);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw260$ISAS, value);
        }
        else {
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str291$__Noting__S__S__, owl_to_cycl.$str239$__ }), property_name, value);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            owl_term_info_plist_push(new_term_info, (SubLObject)owl_to_cycl.$kw292$MY_PRED_VALUES, (SubLObject)ConsesLow.list(property_name, value));
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 176246L)
    public static SubLObject read_owl_term_reference(final SubLObject token, final SubLObject import_parameters) {
        return term_names_from_token(token, import_parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 176370L)
    public static SubLObject owl_import_parameters_class_prefix(final SubLObject import_parameters) {
        return string_utilities.upcase_leading(owl_import_parameters_constant_prefix(import_parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 176526L)
    public static SubLObject term_names_from_token(final SubLObject token, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject class_prefix = owl_import_parameters_class_prefix(import_parameters);
        final SubLObject about_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str118$about), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str338$ID), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject node_id_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject resource_value = xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str215$resource), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject external_name = (SubLObject)owl_to_cycl.NIL;
        SubLObject cyc_name = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != about_value) {
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str315$Description)) && (owl_to_cycl.NIL != string_utilities.alphanumeric_stringP(about_value) || owl_to_cycl.NIL != lookup_node_id_reference(about_value))) {
                external_name = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, about_value);
            }
            else {
                external_name = process_owl_attribute_value(about_value);
            }
        }
        else if (owl_to_cycl.NIL != id_value) {
            external_name = process_owl_attribute_value(id_value);
        }
        else if (owl_to_cycl.NIL != node_id_value) {
            external_name = (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw320$NODE_ID, node_id_value);
        }
        else if (owl_to_cycl.NIL != resource_value) {
            external_name = process_owl_attribute_value(resource_value);
        }
        else if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str589$Apparently_anonymous_instance___S, owl_to_cycl.$str239$__ }), token);
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL != external_name && owl_to_cycl.NIL == node_id_specification_p(external_name)) {
            cyc_name = owl_class_cyc_name_from_external_name(external_name, class_prefix);
        }
        return Values.values(external_name, cyc_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 177845L)
    public static SubLObject owl_external_name_from_token(final SubLObject token, final SubLObject import_parameters) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ZERO_INTEGER), term_names_from_token(token, import_parameters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 177988L)
    public static SubLObject owl_class_cyc_name_from_external_name(final SubLObject external_name, final SubLObject class_prefix) {
        final SubLObject cyc_name_base = (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(external_name)) ? conses_high.third(external_name) : external_name;
        SubLObject clean_name = string_utilities.char_subst((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(class_prefix, string_utilities.upcase_leading(cyc_name_base)));
        if (owl_to_cycl.NIL != Characters.lower_case_p(string_utilities.first_char(clean_name))) {
            clean_name = string_utilities.upcase_leading(clean_name);
        }
        return clean_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 178424L)
    public static SubLObject nonlocal_owl_term_reference_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)owl_to_cycl.$list590);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 178562L)
    public static SubLObject resolve_nonlocal_owl_term_reference(final SubLObject external_name, final SubLObject type, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str591$Finding_or_creating_nonlocal_term, owl_to_cycl.$str239$__ }));
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        SubLObject current;
        final SubLObject datum = current = external_name.rest();
        SubLObject uri = (SubLObject)owl_to_cycl.NIL;
        SubLObject name = (SubLObject)owl_to_cycl.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
        uri = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)owl_to_cycl.$list400);
        name = current.first();
        current = current.rest();
        if (owl_to_cycl.NIL == current) {
            final SubLObject ontology = find_or_create_owl_ontology_for_uri(uri, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
            final SubLObject v_term = owl_find_or_create_term_of_type_in_ontology(name, type, ontology, import_parameters, (SubLObject)owl_to_cycl.UNPROVIDED);
            if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str592$Result___S, owl_to_cycl.$str239$__ }), v_term);
                streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
            }
            return v_term;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)owl_to_cycl.$list400);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 178993L)
    public static SubLObject read_owl_class_or_restriction(final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject next_token = tokens.first();
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str593$Reading_OWL_class_or_restriction_, owl_to_cycl.$str239$__ }), list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, tokens));
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL != owl_class_token_p(next_token)) {
            return read_owl_class(tokens, import_parameters);
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(next_token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
            thread.resetMultipleValues();
            final SubLObject property = read_owl_restriction(tokens, import_parameters);
            final SubLObject type = thread.secondMultipleValue();
            final SubLObject value = thread.thirdMultipleValue();
            final SubLObject v_class = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw594$RESTRICTION, property, type, value, v_class);
        }
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(next_token)) {
            return owl_external_name_from_token(next_token, import_parameters);
        }
        Errors.warn((SubLObject)owl_to_cycl.$str595$Can_t_read_class_starting_with__S, next_token);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 179710L)
    public static SubLObject read_owl_restriction(final SubLObject original_tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(original_tokens.first(), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction))) {
            Errors.error((SubLObject)owl_to_cycl.$str596$_S___is_not_the_start_of_an_OWL_r, list_utilities.first_n((SubLObject)owl_to_cycl.TEN_INTEGER, original_tokens));
        }
        final SubLObject node_id = xml_parsing_utilities.xml_tag_attribute_value(original_tokens.first(), rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str310$nodeID), (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject tokens = original_tokens;
        SubLObject state = (SubLObject)owl_to_cycl.$kw597$INITIAL;
        SubLObject property = (SubLObject)owl_to_cycl.NIL;
        SubLObject v_class = owl_to_cycl.$const16$Thing;
        SubLObject type = (SubLObject)owl_to_cycl.NIL;
        SubLObject datatype = (SubLObject)owl_to_cycl.NIL;
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        while (owl_to_cycl.NIL != tokens && state != owl_to_cycl.$kw598$DONE) {
            SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
            thread.resetMultipleValues();
            final SubLObject state_$79 = read_part_of_owl_restriction(state, property, v_class, type, datatype, value, tokens, import_parameters);
            final SubLObject property_$80 = thread.secondMultipleValue();
            final SubLObject v_class_$81 = thread.thirdMultipleValue();
            final SubLObject type_$82 = thread.fourthMultipleValue();
            final SubLObject datatype_$83 = thread.fifthMultipleValue();
            final SubLObject value_$84 = thread.sixthMultipleValue();
            final SubLObject token_advance_spec_$85 = thread.seventhMultipleValue();
            thread.resetMultipleValues();
            state = state_$79;
            property = property_$80;
            v_class = v_class_$81;
            type = type_$82;
            datatype = datatype_$83;
            value = value_$84;
            token_advance_spec = token_advance_spec_$85;
            if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
            }
            else if (token_advance_spec.isString()) {
                tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
            }
            else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
            }
            else {
                if (state == owl_to_cycl.$kw598$DONE) {
                    continue;
                }
                final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
            }
        }
        if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str599$Read_restriction___S__S__S__S, owl_to_cycl.$str239$__ }), new SubLObject[] { property, type, value, v_class });
            streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL != string_utilities.non_empty_string_p(node_id)) {
            note_node_id_reference(node_id, (SubLObject)ConsesLow.list((SubLObject)owl_to_cycl.$kw594$RESTRICTION, property, type, value, v_class));
        }
        return Values.values(property, type, value, v_class);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 181494L)
    public static SubLObject read_part_of_owl_restriction(SubLObject state, SubLObject property, SubLObject v_class, SubLObject type, SubLObject datatype, SubLObject value, final SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token = tokens.first();
        SubLObject token_advance_spec = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(token)) {
            state = (SubLObject)owl_to_cycl.$kw598$DONE;
        }
        else if (owl_to_cycl.NIL == xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str316$Restriction)) || owl_to_cycl.NIL == xml_parsing_utilities.xml_opening_tag_p(token) || owl_to_cycl.NIL != property || owl_to_cycl.NIL != type || owl_to_cycl.NIL != value) {
            if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str600$onProperty)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(token)) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str601$Reading_restriction_property___, owl_to_cycl.$str239$__ }));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)owl_to_cycl.$kw602$READING_PROPERTY;
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name((SubLObject)owl_to_cycl.$str603$onClass)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(token)) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str604$Reading_restriction_class___, owl_to_cycl.$str239$__ }));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)owl_to_cycl.$kw605$READING_CLASS;
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str600$onProperty)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                property = term_names_from_token(token, import_parameters);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str606$Read_restriction_property__S, owl_to_cycl.$str239$__ }), property);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)((owl_to_cycl.NIL != value) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw607$READ_PROPERTY);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name((SubLObject)owl_to_cycl.$str603$onClass)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                v_class = term_names_from_token(token, import_parameters);
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str608$Read_restriction_class__S, owl_to_cycl.$str239$__ }), v_class);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)((owl_to_cycl.NIL != value) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw609$READ_CLASS);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl_name((SubLObject)owl_to_cycl.$str600$onProperty)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(token)) {
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && state != owl_to_cycl.$kw602$READING_PROPERTY) {
                    Errors.error((SubLObject)owl_to_cycl.$str610$Got_onProperty_close_tag_when_we_);
                }
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == property) {
                    Errors.error((SubLObject)owl_to_cycl.$str611$Failed_to_read_property_);
                }
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str606$Read_restriction_property__S, owl_to_cycl.$str239$__ }), property);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)((owl_to_cycl.NIL != value) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw607$READ_PROPERTY);
            }
            else if (owl_to_cycl.NIL != xml_parsing_utilities.xml_token_element_nameP(token, owl_utilities.owl11_name((SubLObject)owl_to_cycl.$str603$onClass)) && owl_to_cycl.NIL != xml_parsing_utilities.xml_closing_tag_p(token)) {
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && state != owl_to_cycl.$kw605$READING_CLASS) {
                    Errors.error((SubLObject)owl_to_cycl.$str612$Got_onClass_close_tag_when_we_wer);
                }
                if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == v_class) {
                    Errors.error((SubLObject)owl_to_cycl.$str613$Failed_to_read_class_);
                }
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str608$Read_restriction_class__S, owl_to_cycl.$str239$__ }), v_class);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)((owl_to_cycl.NIL != value) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw609$READ_CLASS);
            }
            else if (state == owl_to_cycl.$kw602$READING_PROPERTY) {
                property = read_owl_restriction_property(tokens, import_parameters);
                token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
            }
            else if (state == owl_to_cycl.$kw605$READING_CLASS) {
                v_class = read_owl_restriction_class(tokens, import_parameters);
                token_advance_spec = (SubLObject)owl_to_cycl.$kw246$CLOSE;
            }
            else if (owl_to_cycl.NIL != conses_high.member(xml_parsing_utilities.xml_token_element_name(token), (SubLObject)ConsesLow.list(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str496$allValuesFrom), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str498$someValuesFrom), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str500$hasValue), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str504$cardinality), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str502$minCardinality), owl_utilities.owl_name((SubLObject)owl_to_cycl.$str507$maxCardinality)), Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED)) {
                type = xml_parsing_utilities.xml_token_element_name(token);
                datatype = process_owl_attribute_value(xml_parsing_utilities.xml_tag_attribute_value(token, rdf_utilities.rdf_name((SubLObject)owl_to_cycl.$str288$datatype), (SubLObject)owl_to_cycl.UNPROVIDED));
                if (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(datatype)) {
                    datatype = conses_high.third(datatype);
                }
                if (owl_to_cycl.NIL != datatype && owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str614$Read_datatype__S_from__S, owl_to_cycl.$str239$__ }), datatype, token);
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                state = (SubLObject)owl_to_cycl.$kw615$READ_TYPE;
                if (owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                    final SubLObject class_name = term_names_from_token(token, import_parameters);
                    value = owl_find_or_create_term_from_specification(class_name, owl_to_cycl.$const349$owl_Class, import_parameters);
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str616$Read_value__S_from__S, owl_to_cycl.$str239$__ }), value, token);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    state = (SubLObject)((owl_to_cycl.NIL != property) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw617$READ_VALUE);
                }
            }
            else if (state == owl_to_cycl.$kw615$READ_TYPE && owl_to_cycl.NIL != owl_class_token_p(token)) {
                final SubLObject class_name = read_owl_class(tokens, import_parameters);
                final SubLObject type_name = process_owl_attribute_value(xml_parsing_utilities.xml_token_element_name(token));
                final SubLObject _prev_bind_0 = owl_to_cycl.$owl_force_new_term_creationP$.currentBinding(thread);
                try {
                    owl_to_cycl.$owl_force_new_term_creationP$.bind((SubLObject)owl_to_cycl.T, thread);
                    final SubLObject type_$86 = owl_find_or_create_term_from_specification(type_name, owl_to_cycl.$const349$owl_Class, import_parameters);
                    final SubLObject this_class = owl_find_or_create_term_from_specification(class_name, type_$86, import_parameters);
                    if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == this_class) {
                        Errors.error((SubLObject)owl_to_cycl.$str618$Failed_to_read_restriction_value_);
                    }
                    value = this_class;
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str619$Read_restriction_value__S, owl_to_cycl.$str239$__ }), value);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    state = (SubLObject)owl_to_cycl.$kw617$READ_VALUE;
                }
                finally {
                    owl_to_cycl.$owl_force_new_term_creationP$.rebind(_prev_bind_0, thread);
                }
            }
            else if (state == owl_to_cycl.$kw615$READ_TYPE && owl_to_cycl.NIL == xml_parsing_utilities.xml_tagP(token)) {
                value = owl_value_from_string(token, datatype);
                if (owl_to_cycl.NIL != value) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str619$Read_restriction_value__S, owl_to_cycl.$str239$__ }), value);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    state = (SubLObject)owl_to_cycl.$kw617$READ_VALUE;
                }
            }
            else if (state == owl_to_cycl.$kw615$READ_TYPE && (owl_to_cycl.NIL != xml_parsing_utilities.xml_opening_tag_p(token) || owl_to_cycl.NIL != xml_parsing_utilities.xml_empty_tagP(token))) {
                final SubLObject term_info = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)owl_to_cycl.ONE_INTEGER), read_one_instance_info_from_owl_tokens(tokens, import_parameters));
                assert owl_to_cycl.NIL != owl_term_info_p(term_info) : term_info;
                value = owl_term_info_plist_lookup(term_info, (SubLObject)owl_to_cycl.$kw154$EXTERNAL_NAME, (SubLObject)owl_to_cycl.UNPROVIDED);
                if (owl_to_cycl.NIL != value) {
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str619$Read_restriction_value__S, owl_to_cycl.$str239$__ }), value);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                    state = (SubLObject)((owl_to_cycl.NIL != property) ? owl_to_cycl.$kw598$DONE : owl_to_cycl.$kw617$READ_VALUE);
                }
            }
        }
        return Values.values(state, property, v_class, type, datatype, value, token_advance_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 186399L)
    public static SubLObject read_owl_restriction_property(SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_token = tokens.first();
        final SubLObject name = read_owl_term_reference(first_token, import_parameters);
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw57$PROPERTY, thread);
            SubLObject pred_info = (SubLObject)owl_to_cycl.NIL;
            SubLObject current_token = first_token;
            SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
            while (owl_to_cycl.NIL == doneP) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str620$__Reading_OWL_property_starting_w, owl_to_cycl.$str239$__ }), list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, tokens));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                thread.resetMultipleValues();
                final SubLObject new_pred_info = read_one_owl_chunk_for_pred_info(current_token, pred_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject pred_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                pred_info = new_pred_info;
                if (owl_to_cycl.NIL != pred_info_doneP) {
                    accumulate_owl_definition(new_pred_info, (SubLObject)owl_to_cycl.$kw57$PROPERTY);
                    doneP = (SubLObject)owl_to_cycl.T;
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str621$__Done_with__S__, owl_to_cycl.$str239$__ }), new_pred_info);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                }
                if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                }
                else if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else {
                    final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                    tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
                }
                current_token = tokens.first();
            }
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 187717L)
    public static SubLObject read_owl_restriction_class(SubLObject tokens, final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_token = tokens.first();
        final SubLObject name = read_owl_term_reference(first_token, import_parameters);
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_definition_type$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_definition_type$.bind((SubLObject)owl_to_cycl.$kw82$CLASS, thread);
            SubLObject term_info = (SubLObject)owl_to_cycl.NIL;
            SubLObject current_token = first_token;
            SubLObject doneP = (SubLObject)owl_to_cycl.NIL;
            while (owl_to_cycl.NIL == doneP) {
                if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str622$__Reading_OWL_class_starting_with, owl_to_cycl.$str239$__ }), list_utilities.first_n((SubLObject)owl_to_cycl.FOUR_INTEGER, tokens));
                    streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                }
                thread.resetMultipleValues();
                final SubLObject new_term_info = read_one_owl_chunk_for_class_info(current_token, term_info, import_parameters, tokens);
                final SubLObject token_advance_spec = thread.secondMultipleValue();
                final SubLObject term_info_doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                term_info = new_term_info;
                if (owl_to_cycl.NIL != term_info_doneP) {
                    accumulate_owl_definition(new_term_info, (SubLObject)owl_to_cycl.$kw82$CLASS);
                    doneP = (SubLObject)owl_to_cycl.T;
                    if (owl_to_cycl.NIL != owl_utilities.$owl_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)owl_to_cycl.T, Sequences.cconcatenate((SubLObject)owl_to_cycl.$str237$__, new SubLObject[] { owl_to_cycl.$str621$__Done_with__S__, owl_to_cycl.$str239$__ }), new_term_info);
                        streams_high.force_output((SubLObject)owl_to_cycl.UNPROVIDED);
                    }
                }
                if (owl_to_cycl.NIL != subl_promotions.positive_integer_p(token_advance_spec)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, token_advance_spec);
                }
                else if (token_advance_spec.isString()) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, token_advance_spec, (SubLObject)owl_to_cycl.UNPROVIDED), (SubLObject)owl_to_cycl.UNPROVIDED);
                }
                else if (token_advance_spec.eql((SubLObject)owl_to_cycl.$kw246$CLOSE)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens_to_end_of_element(tokens);
                }
                else {
                    final SubLObject position = next_noninitial_non_whitespace_xml_token_position(tokens);
                    tokens = (SubLObject)((owl_to_cycl.NIL != position) ? xml_parsing_utilities.advance_xml_tokens(tokens, position) : owl_to_cycl.NIL);
                }
                current_token = tokens.first();
            }
        }
        finally {
            owl_to_cycl.$owl_definition_type$.rebind(_prev_bind_0, thread);
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 189265L)
    public static SubLObject owl_value_from_string(final SubLObject token, final SubLObject datatype) {
        final SubLObject local_datatype = (owl_to_cycl.NIL != nonlocal_owl_term_reference_p(datatype)) ? conses_high.third(datatype) : datatype;
        final SubLObject trimmed_token = string_utilities.trim_whitespace(token);
        SubLObject value = (SubLObject)owl_to_cycl.NIL;
        if (owl_to_cycl.NIL != Guids.guid_string_p(trimmed_token)) {
            return trimmed_token;
        }
        if (owl_to_cycl.NIL != conses_high.member(local_datatype, owl_to_cycl.$owl_interval_datatypes$.getGlobalValue(), (SubLObject)owl_to_cycl.EQUALP, (SubLObject)owl_to_cycl.UNPROVIDED) || owl_to_cycl.NIL == local_datatype) {
            final SubLObject parsed_value = numeral_parser.string_to_interval(trimmed_token);
            final SubLObject read_value = (SubLObject)(parsed_value.isNumber() ? owl_to_cycl.NIL : reader.read_from_string_ignoring_errors(trimmed_token, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED));
            final SubLObject numeric_value = (SubLObject)(parsed_value.isNumber() ? parsed_value : (read_value.isNumber() ? read_value : owl_to_cycl.NIL));
            if (owl_to_cycl.NIL != local_datatype && owl_to_cycl.NIL == numeric_value) {
                Errors.warn((SubLObject)owl_to_cycl.$str624$Can_t_parse__S_as_a__A, token, local_datatype);
            }
            value = ((owl_to_cycl.NIL != numeric_value) ? numeric_value : token);
        }
        else {
            if (local_datatype.equalp((SubLObject)owl_to_cycl.$str282$string)) {
                return token;
            }
            if (local_datatype.equalp((SubLObject)owl_to_cycl.$str625$boolean)) {
                if (owl_to_cycl.NIL != subl_promotions.memberP(trimmed_token, (SubLObject)owl_to_cycl.$list626, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUALP), (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    value = owl_to_cycl.$const627$True;
                }
                else if (owl_to_cycl.NIL != subl_promotions.memberP(trimmed_token, (SubLObject)owl_to_cycl.$list628, Symbols.symbol_function((SubLObject)owl_to_cycl.EQUALP), (SubLObject)owl_to_cycl.UNPROVIDED)) {
                    value = owl_to_cycl.$const629$False;
                }
                else {
                    Errors.warn((SubLObject)owl_to_cycl.$str630$Couldn_t_read_boolean_value_from_, token);
                }
            }
            else if (local_datatype.equalp((SubLObject)owl_to_cycl.$str631$date)) {
                final SubLObject dates = date_utilities.parse_date_from_string_fast(trimmed_token, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
                final SubLObject pcase_var = Sequences.length(dates);
                if (pcase_var.eql((SubLObject)owl_to_cycl.ONE_INTEGER)) {
                    value = list_utilities.only_one(dates);
                }
                else if (pcase_var.eql((SubLObject)owl_to_cycl.ZERO_INTEGER)) {
                    Errors.warn((SubLObject)owl_to_cycl.$str632$Couldn_t_parse_date_from__S, token);
                }
                else {
                    final SubLObject days = list_utilities.find_all(owl_to_cycl.$const633$DayFn, dates, Symbols.symbol_function((SubLObject)owl_to_cycl.EQL), (SubLObject)owl_to_cycl.$sym634$NAT_FUNCTOR);
                    if (owl_to_cycl.NIL != list_utilities.singletonP(days)) {
                        value = list_utilities.only_one(days);
                    }
                    else {
                        Errors.warn((SubLObject)owl_to_cycl.$str635$Got_multiple_dates_from__S_____S, token, dates);
                    }
                }
            }
            else {
                Errors.warn((SubLObject)owl_to_cycl.$str636$Don_t_know_how_to_parse_value_fro, token, local_datatype);
            }
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191096L)
    public static SubLObject clear_xml_name() {
        final SubLObject cs = owl_to_cycl.$xml_name_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191096L)
    public static SubLObject remove_xml_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(owl_to_cycl.$xml_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191096L)
    public static SubLObject xml_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)owl_to_cycl.$str638$xml_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191096L)
    public static SubLObject xml_name(final SubLObject local_name) {
        SubLObject caching_state = owl_to_cycl.$xml_name_caching_state$.getGlobalValue();
        if (owl_to_cycl.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)owl_to_cycl.$sym637$XML_NAME, (SubLObject)owl_to_cycl.$sym639$_XML_NAME_CACHING_STATE_, (SubLObject)owl_to_cycl.NIL, (SubLObject)owl_to_cycl.EQUAL, (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(xml_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_importer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_owl_importer(v_object, stream, (SubLObject)owl_to_cycl.ZERO_INTEGER);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_importer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $owl_importer_native.class) ? owl_to_cycl.T : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_imp_id(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_imp_progress(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_imp_error_info(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_imp_import_parameters(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject owl_imp_thread(final SubLObject v_object) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject _csetf_owl_imp_id(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject _csetf_owl_imp_progress(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject _csetf_owl_imp_error_info(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject _csetf_owl_imp_import_parameters(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject _csetf_owl_imp_thread(final SubLObject v_object, final SubLObject value) {
        assert owl_to_cycl.NIL != owl_importer_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject make_owl_importer(SubLObject arglist) {
        if (arglist == owl_to_cycl.UNPROVIDED) {
            arglist = (SubLObject)owl_to_cycl.NIL;
        }
        final SubLObject v_new = (SubLObject)new $owl_importer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)owl_to_cycl.NIL, next = arglist; owl_to_cycl.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)owl_to_cycl.$kw659$ID)) {
                _csetf_owl_imp_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw660$PROGRESS)) {
                _csetf_owl_imp_progress(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw661$ERROR_INFO)) {
                _csetf_owl_imp_error_info(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw662$IMPORT_PARAMETERS)) {
                _csetf_owl_imp_import_parameters(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)owl_to_cycl.$kw663$THREAD)) {
                _csetf_owl_imp_thread(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)owl_to_cycl.$str147$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject visit_defstruct_owl_importer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw148$BEGIN, (SubLObject)owl_to_cycl.$sym664$MAKE_OWL_IMPORTER, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw659$ID, owl_imp_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw660$PROGRESS, owl_imp_progress(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw661$ERROR_INFO, owl_imp_error_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw662$IMPORT_PARAMETERS, owl_imp_import_parameters(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw150$SLOT, (SubLObject)owl_to_cycl.$kw663$THREAD, owl_imp_thread(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)owl_to_cycl.$kw151$END, (SubLObject)owl_to_cycl.$sym664$MAKE_OWL_IMPORTER, (SubLObject)owl_to_cycl.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191585L)
    public static SubLObject visit_defstruct_object_owl_importer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_owl_importer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191750L)
    public static SubLObject print_owl_importer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)owl_to_cycl.$str666$_OWL_IMPORTER__D_, owl_imp_id(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 191915L)
    public static SubLObject new_owl_importer() {
        final SubLObject importer = make_owl_importer((SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject id = id_index.id_index_reserve(owl_importer_id_index());
        _csetf_owl_imp_id(importer, id);
        id_index.id_index_enter(owl_importer_id_index(), id, importer);
        return importer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192175L)
    public static SubLObject owl_importer_id(final SubLObject importer) {
        assert owl_to_cycl.NIL != owl_importer_p(importer) : importer;
        return owl_imp_id(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192301L)
    public static SubLObject owl_importer_progress(final SubLObject importer) {
        assert owl_to_cycl.NIL != owl_importer_p(importer) : importer;
        return owl_imp_progress(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192427L)
    public static SubLObject owl_importer_error_info(final SubLObject importer) {
        assert owl_to_cycl.NIL != owl_importer_p(importer) : importer;
        return owl_imp_error_info(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192557L)
    public static SubLObject owl_importer_import_parameters(final SubLObject importer) {
        assert owl_to_cycl.NIL != owl_importer_p(importer) : importer;
        return owl_imp_import_parameters(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192701L)
    public static SubLObject owl_importer_thread(final SubLObject importer) {
        assert owl_to_cycl.NIL != owl_importer_p(importer) : importer;
        return owl_imp_thread(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192823L)
    public static SubLObject sxhash_owl_importer_method(final SubLObject v_object) {
        return sxhash_owl_importer(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 192927L)
    public static SubLObject sxhash_owl_importer(final SubLObject importer) {
        return Sxhash.sxhash(owl_imp_id(importer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 193027L)
    public static SubLObject import_owl_ontology_with_importer(final SubLObject uri, final SubLObject constant_prefix, SubLObject source, SubLObject ontology, SubLObject prefix_external_namesP, SubLObject abbreviate_prefixesP, SubLObject quoted_isa, SubLObject cyclist) {
        if (source == owl_to_cycl.UNPROVIDED) {
            source = uri;
        }
        if (ontology == owl_to_cycl.UNPROVIDED) {
            ontology = (SubLObject)owl_to_cycl.NIL;
        }
        if (prefix_external_namesP == owl_to_cycl.UNPROVIDED) {
            prefix_external_namesP = (SubLObject)owl_to_cycl.NIL;
        }
        if (abbreviate_prefixesP == owl_to_cycl.UNPROVIDED) {
            abbreviate_prefixesP = (SubLObject)owl_to_cycl.NIL;
        }
        if (quoted_isa == owl_to_cycl.UNPROVIDED) {
            quoted_isa = (SubLObject)owl_to_cycl.NIL;
        }
        if (cyclist == owl_to_cycl.UNPROVIDED) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        return import_owl_ontology_with_importer_from_info(list_utilities.make_plist((SubLObject)owl_to_cycl.$list669, (SubLObject)ConsesLow.list(uri, constant_prefix, source, ontology, prefix_external_namesP, abbreviate_prefixesP, quoted_isa, cyclist)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 194293L)
    public static SubLObject import_owl_ontology_with_importer_from_info(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uri = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw61$URI, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject uri_prefix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw62$URI_PREFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject constant_prefix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw63$CONSTANT_PREFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject constant_suffix = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw64$CONSTANT_SUFFIX, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject source = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw65$SOURCE, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject ontology = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw66$ONTOLOGY, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject prefix_external_namesP = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw69$PREFIX_EXTERNAL_NAMES_, (SubLObject)owl_to_cycl.UNPROVIDED);
        final SubLObject abbreviate_prefixesP = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw70$ABBREVIATE_PREFIXES_, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject quoted_isa = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw67$QUOTED_ISA, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject cyclist = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw68$CYCLIST, (SubLObject)owl_to_cycl.UNPROVIDED);
        if (owl_to_cycl.NIL == cyclist) {
            cyclist = api_control_vars.$the_cyclist$.getDynamicValue(thread);
        }
        uri = string_utilities.strip_final_if_char(uri, (SubLObject)Characters.CHAR_hash);
        if (owl_to_cycl.NIL == ontology) {
            ontology = find_or_create_owl_ontology_for_uri(uri, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL == quoted_isa) {
            quoted_isa = find_or_create_term_type_for_ontology(ontology, (SubLObject)owl_to_cycl.UNPROVIDED);
        }
        if (owl_to_cycl.NIL == string_utilities.non_empty_string_p(source)) {
            source = uri;
        }
        if (owl_to_cycl.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && owl_to_cycl.NIL == web_utilities.uri_p(source, (SubLObject)owl_to_cycl.UNPROVIDED) && owl_to_cycl.NIL == file_utilities.file_existsP(source)) {
            Errors.error((SubLObject)owl_to_cycl.$str71$Can_only_import_OWL_ontologies_fr);
        }
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind((SubLObject)owl_to_cycl.NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            ke.ensure_cyclist_ok();
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        assert owl_to_cycl.NIL != web_utilities.uri_p(uri, (SubLObject)owl_to_cycl.UNPROVIDED) : uri;
        final SubLObject importer = new_owl_importer();
        process_utilities.make_cyc_server_process_with_args((SubLObject)owl_to_cycl.$str670$OWL_Importer, (SubLObject)owl_to_cycl.$sym671$OWL_IMPORTER_RUN, (SubLObject)ConsesLow.list(list_utilities.make_plist((SubLObject)owl_to_cycl.$list672, (SubLObject)ConsesLow.list(new SubLObject[] { importer, uri, constant_prefix, constant_suffix, uri_prefix, source, ontology, quoted_isa, cyclist, prefix_external_namesP, abbreviate_prefixesP }))));
        return owl_importer_id(importer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 196086L)
    public static SubLObject get_owl_importer_ontology(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        final SubLObject import_parameters = (SubLObject)((owl_to_cycl.NIL != importer) ? owl_importer_import_parameters(importer) : owl_to_cycl.NIL);
        return (SubLObject)((owl_to_cycl.NIL != import_parameters) ? owl_import_parameters_ontology(import_parameters) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 196371L)
    public static SubLObject get_owl_importer_progress(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return (SubLObject)((owl_to_cycl.NIL != importer) ? conses_high.copy_list(owl_importer_progress(importer)) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 196560L)
    public static SubLObject get_owl_importer_error_info(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return (SubLObject)((owl_to_cycl.NIL != importer) ? conses_high.copy_list(owl_importer_error_info(importer)) : owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 196753L)
    public static SubLObject owl_importer_done_p(final SubLObject importer_id) {
        final SubLObject importer = find_owl_importer_by_id(importer_id);
        return Equality.eql(owl_importer_progress(importer).first(), (SubLObject)owl_to_cycl.$kw598$DONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 196927L)
    public static SubLObject owl_importer_exists_p(final SubLObject importer_id) {
        return list_utilities.sublisp_boolean(find_owl_importer_by_id(importer_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197101L)
    public static SubLObject owl_importer_id_index() {
        if (owl_to_cycl.NIL == id_index.id_index_p(owl_to_cycl.$owl_importer_id_index$.getGlobalValue())) {
            owl_to_cycl.$owl_importer_id_index$.setGlobalValue(id_index.new_id_index((SubLObject)owl_to_cycl.$int109$32, (SubLObject)owl_to_cycl.ZERO_INTEGER));
        }
        return owl_to_cycl.$owl_importer_id_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197281L)
    public static SubLObject find_owl_importer_by_id(final SubLObject id) {
        return id_index.id_index_lookup(owl_importer_id_index(), id, (SubLObject)owl_to_cycl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197385L)
    public static SubLObject note_owl_import_parameters(final SubLObject import_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_import_parameters(owl_to_cycl.$owl_importer$.getDynamicValue(thread), import_parameters);
        }
        return import_parameters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197575L)
    public static SubLObject note_owl_import_section_progress(final SubLObject percent_done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            final SubLObject item = owl_importer_progress(owl_to_cycl.$owl_importer$.getDynamicValue(thread)).first();
            final SubLObject start_time = item.first();
            ConsesLow.set_nth((SubLObject)owl_to_cycl.ONE_INTEGER, item, percent_done);
            ConsesLow.set_nth((SubLObject)owl_to_cycl.TWO_INTEGER, item, subl_promotions.elapsed_universal_time(start_time, (SubLObject)owl_to_cycl.UNPROVIDED));
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 197870L)
    public static SubLObject note_owl_import_section_started() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_progress(owl_to_cycl.$owl_importer$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Time.get_universal_time(), (SubLObject)owl_to_cycl.ZERO_INTEGER, (SubLObject)owl_to_cycl.ZERO_INTEGER), owl_imp_progress(owl_to_cycl.$owl_importer$.getDynamicValue(thread))));
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198038L)
    public static SubLObject note_owl_import_section_done() {
        note_owl_import_section_progress((SubLObject)owl_to_cycl.ONE_INTEGER);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198183L)
    public static SubLObject note_owl_import_done() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_progress(owl_to_cycl.$owl_importer$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)owl_to_cycl.$kw598$DONE, owl_imp_progress(owl_to_cycl.$owl_importer$.getDynamicValue(thread))));
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198314L)
    public static SubLObject note_owl_import_problem(final SubLObject item, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (owl_to_cycl.NIL != owl_to_cycl.$owl_importer$.getDynamicValue(thread)) {
            _csetf_owl_imp_error_info(owl_to_cycl.$owl_importer$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(item, message), owl_imp_error_info(owl_to_cycl.$owl_importer$.getDynamicValue(thread))));
        }
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198476L)
    public static SubLObject owl_importer_run(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject importer = conses_high.getf(import_info, (SubLObject)owl_to_cycl.$kw674$IMPORTER, (SubLObject)owl_to_cycl.UNPROVIDED);
        _csetf_owl_imp_thread(importer, Threads.current_process());
        final SubLObject _prev_bind_0 = owl_to_cycl.$owl_importer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            owl_to_cycl.$owl_importer$.bind(importer, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)owl_to_cycl.T, thread);
            import_owl_ontology_from_info(import_info);
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_2, thread);
            owl_to_cycl.$owl_importer$.rebind(_prev_bind_0, thread);
        }
        return importer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/owl-to-cycl.lisp", position = 198767L)
    public static SubLObject import_sample_ontologies() {
        import_owl_ontology((SubLObject)owl_to_cycl.$str677$http___www_w3_org_TR_owl_guide_wi, (SubLObject)owl_to_cycl.$str678$WINE_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        SubLObject cdolist_list_var = owl_to_cycl.$sweet_ontologies$.getGlobalValue();
        SubLObject ontology = (SubLObject)owl_to_cycl.NIL;
        ontology = cdolist_list_var.first();
        while (owl_to_cycl.NIL != cdolist_list_var) {
            import_owl_ontology(Sequences.cconcatenate(owl_to_cycl.$sweet_root$.getGlobalValue(), new SubLObject[] { ontology, owl_to_cycl.$str679$_owl }), (SubLObject)owl_to_cycl.$str680$SWEET_, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            ontology = cdolist_list_var.first();
        }
        import_owl_ontology((SubLObject)owl_to_cycl.$str681$http___reliant_teknowledge_com_DA, (SubLObject)owl_to_cycl.$str682$SUMO_, (SubLObject)owl_to_cycl.$str683$http___open_meta_com_SUMO_owl, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        import_owl_ontology((SubLObject)owl_to_cycl.$str684$http___kmf_patrick_afspc_ds_af_mi, (SubLObject)owl_to_cycl.$str685$KMF_, (SubLObject)owl_to_cycl.$str686$_home_baxter_tmp_decision_support, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED, (SubLObject)owl_to_cycl.UNPROVIDED);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    public static SubLObject declare_owl_to_cycl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_v1_version_number", "OWL-IMPORTER-V1-VERSION-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "current_owl_importer", "CURRENT-OWL-IMPORTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "guess_terms_for_owl_term", "GUESS-TERMS-FOR-OWL-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "root_classes_of_owl_ontology", "ROOT-CLASSES-OF-OWL-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_owl_importer_caches", "CLEAR-OWL-IMPORTER-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "root_classes_of_owl_ontology_via_inference", "ROOT-CLASSES-OF-OWL-ONTOLOGY-VIA-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "term_of_owl_ontologyP_via_index", "TERM-OF-OWL-ONTOLOGY?-VIA-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "term_of_some_owl_ontologyP_via_index_internal", "TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "term_of_some_owl_ontologyP_via_index", "TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "all_terms_of_owl_ontology_via_index", "ALL-TERMS-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_ontology_percent_of_classes_merged", "OWL-ONTOLOGY-PERCENT-OF-CLASSES-MERGED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_ontology_average_class_depth", "OWL-ONTOLOGY-AVERAGE-CLASS-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_ontology_average_root_class_depth", "OWL-ONTOLOGY-AVERAGE-ROOT-CLASS-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "all_classes_of_owl_ontology_via_index", "ALL-CLASSES-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_mergedP_via_index", "OWL-CLASS-MERGED?-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_merged_upwardP_via_index", "OWL-CLASS-MERGED-UPWARD?-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_merged_downwardP_via_index", "OWL-CLASS-MERGED-DOWNWARD?-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_merge_mt", "OWL-MERGE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_merge_assert", "OWL-MERGE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "merge_owl_class_with_collection", "MERGE-OWL-CLASS-WITH-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "merge_owl_term_with_cyc_term", "MERGE-OWL-TERM-WITH-CYC-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "link_owl_class_down_to_collection", "LINK-OWL-CLASS-DOWN-TO-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "link_owl_class_up_to_collection", "LINK-OWL-CLASS-UP-TO-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "next_owl_term_to_merge_for_ontology", "NEXT-OWL-TERM-TO-MERGE-FOR-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "memoized_count_all_specs_internal", "MEMOIZED-COUNT-ALL-SPECS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "memoized_count_all_specs", "MEMOIZED-COUNT-ALL-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "longest_acyclic_genls_path_length", "LONGEST-ACYCLIC-GENLS-PATH-LENGTH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "longest_acyclic_genls_path", "LONGEST-ACYCLIC-GENLS-PATH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "longest_acyclic_genls_path_internal_internal", "LONGEST-ACYCLIC-GENLS-PATH-INTERNAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "longest_acyclic_genls_path_internal", "LONGEST-ACYCLIC-GENLS-PATH-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_min_genls_memoized_internal", "OWL-MIN-GENLS-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_min_genls_memoized", "OWL-MIN-GENLS-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "genls_tree_with_root_via_index", "GENLS-TREE-WITH-ROOT-VIA-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "genls_tree_with_root_via_index_internal", "GENLS-TREE-WITH-ROOT-VIA-INDEX-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "root_classes_of_owl_ontology_via_index", "ROOT-CLASSES-OF-OWL-ONTOLOGY-VIA-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "guess_forts_from_owl_term_name", "GUESS-FORTS-FROM-OWL-TERM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "guess_forts_from_owl_term_name_non_partitioned", "GUESS-FORTS-FROM-OWL-TERM-NAME-NON-PARTITIONED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "partition_cycl_terms_for_owl_term_name", "PARTITION-CYCL-TERMS-FOR-OWL-TERM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_names", "OWL-TERM-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_definition_accumulator", "NEW-OWL-DEFINITION-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "accumulate_owl_definition", "ACCUMULATE-OWL-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "merge_owl_definitions", "MERGE-OWL-DEFINITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_accumulated_owl_definition", "FIND-ACCUMULATED-OWL-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_owl_definition_of_type", "FIND-OWL-DEFINITION-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_definition_name", "OWL-DEFINITION-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "accumulated_owl_definitions_of_type", "ACCUMULATED-OWL-DEFINITIONS-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_accumulated_owl_definitions_of_type", "SET-ACCUMULATED-OWL-DEFINITIONS-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_accumulator_index_for_type", "OWL-ACCUMULATOR-INDEX-FOR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology", "IMPORT-OWL-ONTOLOGY", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_from_info", "IMPORT-OWL-ONTOLOGY-FROM-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_xml_tokens_from_file", "CLEAR-XML-TOKENS-FROM-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_xml_tokens_from_file", "REMOVE-XML-TOKENS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_tokens_from_file_internal", "XML-TOKENS-FROM-FILE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_tokens_from_file", "XML-TOKENS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_internal", "IMPORT-OWL-ONTOLOGY-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_file_encoding", "NOTE-OWL-FILE-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "reify_term_for_new_import", "REIFY-TERM-FOR-NEW-IMPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_ontology_name", "OWL-ONTOLOGY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_import_start_time", "NOTE-IMPORT-START-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_import_ontology", "NOTE-IMPORT-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_import_cyclist", "NOTE-IMPORT-CYCLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_import_end_time", "NOTE-IMPORT-END-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_info", "IMPORT-OWL-ONTOLOGY-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_ontology_base_uri", "NOTE-OWL-ONTOLOGY-BASE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_owl_ontology_base_uri", "FIND-OWL-ONTOLOGY-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_owl_import_parameters_ontology_context", "CLEAR-OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_owl_import_parameters_ontology_context", "REMOVE-OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_ontology_context_internal", "OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_ontology_context", "OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_owl_ontology_context", "GET-OWL-ONTOLOGY-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_info_internal", "IMPORT-OWL-ONTOLOGY-INFO-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_print_function_trampoline", "OWL-PRED-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_p", "OWL-PRED-INFO-P", 1, 0, false);
        new $owl_pred_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "opi_cyc_name", "OPI-CYC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "opi_comment", "OPI-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "opi_domains", "OPI-DOMAINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "opi_range", "OPI-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "opi_plist", "OPI-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_opi_cyc_name", "_CSETF-OPI-CYC-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_opi_comment", "_CSETF-OPI-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_opi_domains", "_CSETF-OPI-DOMAINS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_opi_range", "_CSETF-OPI-RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_opi_plist", "_CSETF-OPI-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "make_owl_pred_info", "MAKE-OWL-PRED-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_owl_pred_info", "VISIT-DEFSTRUCT-OWL-PRED-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_object_owl_pred_info_method", "VISIT-DEFSTRUCT-OBJECT-OWL-PRED-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "print_owl_pred_info", "PRINT-OWL-PRED-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_pred_info", "FIND-OR-CREATE-OWL-PRED-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_pred_info", "NEW-OWL-PRED-INFO", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_cyc_name", "OWL-PRED-INFO-CYC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_comment", "OWL-PRED-INFO-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_domains", "OWL-PRED-INFO-DOMAINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_range", "OWL-PRED-INFO-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_plist", "OWL-PRED-INFO-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_plist_lookup", "OWL-PRED-INFO-PLIST-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_external_name", "OWL-PRED-INFO-EXTERNAL-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_pred_info_cyc_name", "SET-OWL-PRED-INFO-CYC-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_pred_info_comment", "SET-OWL-PRED-INFO-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_pred_info_domains", "SET-OWL-PRED-INFO-DOMAINS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_pred_info_range", "SET-OWL-PRED-INFO-RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "merge_owl_pred_definitions", "MERGE-OWL-PRED-DEFINITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "node_id_specification_p", "NODE-ID-SPECIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_restriction_p", "OWL-RESTRICTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_union_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_union_names", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_intersection_p", "OWL-EXTERNAL-VALUE-SPECIFICATION-INTERSECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_intersection_names", "OWL-EXTERNAL-VALUE-SPECIFICATION-INTERSECTION-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_term_enumeration_p", "OWL-EXTERNAL-TERM-ENUMERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_term_enumeration_terms", "OWL-EXTERNAL-TERM-ENUMERATION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_plist_enter", "OWL-PRED-INFO-PLIST-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_info_plist_push", "OWL-PRED-INFO-PLIST-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_pred_info_method", "SXHASH-OWL-PRED-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_pred_info", "SXHASH-OWL-PRED-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_print_function_trampoline", "OWL-IMPORT-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_p", "OWL-IMPORT-PARAMETERS-P", 1, 0, false);
        new $owl_import_parameters_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_ontology", "OIP-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_namespace_map", "OIP-NAMESPACE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_constant_prefix", "OIP-CONSTANT-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_constant_suffix", "OIP-CONSTANT-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_base_uri", "OIP-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_uri_prefix", "OIP-URI-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_cyclist", "OIP-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_quoted_isa", "OIP-QUOTED-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_prefix_external_namesP", "OIP-PREFIX-EXTERNAL-NAMES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_abbreviate_prefixesP", "OIP-ABBREVIATE-PREFIXES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_import_term", "OIP-IMPORT-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_encoding", "OIP-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_ontology", "_CSETF-OIP-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_namespace_map", "_CSETF-OIP-NAMESPACE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_constant_prefix", "_CSETF-OIP-CONSTANT-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_constant_suffix", "_CSETF-OIP-CONSTANT-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_base_uri", "_CSETF-OIP-BASE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_uri_prefix", "_CSETF-OIP-URI-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_cyclist", "_CSETF-OIP-CYCLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_quoted_isa", "_CSETF-OIP-QUOTED-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_prefix_external_namesP", "_CSETF-OIP-PREFIX-EXTERNAL-NAMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_abbreviate_prefixesP", "_CSETF-OIP-ABBREVIATE-PREFIXES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_import_term", "_CSETF-OIP-IMPORT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oip_encoding", "_CSETF-OIP-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "make_owl_import_parameters", "MAKE-OWL-IMPORT-PARAMETERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_owl_import_parameters", "VISIT-DEFSTRUCT-OWL-IMPORT-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_object_owl_import_parameters_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORT-PARAMETERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "print_owl_import_parameters", "PRINT-OWL-IMPORT-PARAMETERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_import_parameters", "NEW-OWL-IMPORT-PARAMETERS", 7, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "cyclist_using_owl_importer_v1", "CYCLIST-USING-OWL-IMPORTER-V1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_ontology", "OWL-IMPORT-PARAMETERS-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_lookup_namespace", "OWL-IMPORT-PARAMETERS-LOOKUP-NAMESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_constant_prefix", "OWL-IMPORT-PARAMETERS-CONSTANT-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_constant_suffix", "OWL-IMPORT-PARAMETERS-CONSTANT-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_base_uri", "OWL-IMPORT-PARAMETERS-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_uri_prefix", "OWL-IMPORT-PARAMETERS-URI-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_cyclist", "OWL-IMPORT-PARAMETERS-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_quoted_isa", "OWL-IMPORT-PARAMETERS-QUOTED-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_prefix_external_namesP", "OWL-IMPORT-PARAMETERS-PREFIX-EXTERNAL-NAMES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_abbreviate_prefixesP", "OWL-IMPORT-PARAMETERS-ABBREVIATE-PREFIXES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_import_term", "OWL-IMPORT-PARAMETERS-IMPORT-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_encoding", "OWL-IMPORT-PARAMETERS-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_note_namespace", "OWL-IMPORT-PARAMETERS-NOTE-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_note_base_uri", "OWL-IMPORT-PARAMETERS-NOTE-BASE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_note_import_term", "OWL-IMPORT-PARAMETERS-NOTE-IMPORT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_note_encoding", "OWL-IMPORT-PARAMETERS-NOTE-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_import_parameters_method", "SXHASH-OWL-IMPORT-PARAMETERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_import_parameters", "SXHASH-OWL-IMPORT-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "verify_imports_for_ontology_tokens", "VERIFY-IMPORTS-FOR-ONTOLOGY-TOKENS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "validate_and_note_owl_namespaces", "VALIDATE-AND-NOTE-OWL-NAMESPACES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "validate_and_note_owl_namespaces_for_token", "VALIDATE-AND-NOTE-OWL-NAMESPACES-FOR-TOKEN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "validate_and_note_owl_namespace", "VALIDATE-AND-NOTE-OWL-NAMESPACE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_reserved_namespace_p", "OWL-RESERVED-NAMESPACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_reserved_namespace_problem", "OWL-RESERVED-NAMESPACE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imported_namespace_problem", "OWL-IMPORTED-NAMESPACE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_find_or_create_owl_ontology_for_uri", "CLEAR-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_find_or_create_owl_ontology_for_uri", "REMOVE-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_ontology_for_uri_internal", "FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_ontology_for_uri", "FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_term_type_for_ontology", "FIND-OR-CREATE-TERM-TYPE-FOR-ONTOLOGY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_pred_info_from_owl_tokens", "READ-PRED-INFO-FROM-OWL-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_owl_property_element_names", "CLEAR-OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_owl_property_element_names", "REMOVE-OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_property_element_names_internal", "OWL-PROPERTY-ELEMENT-NAMES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_property_element_names", "OWL-PROPERTY-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_property_token_p", "OWL-PROPERTY-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_owl_chunk_for_pred_info", "READ-ONE-OWL-CHUNK-FOR-PRED-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "cyc_token_with_nameP", "CYC-TOKEN-WITH-NAME?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "process_owl_attribute_value", "PROCESS-OWL-ATTRIBUTE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_note_spec_property", "OWL-NOTE-SPEC-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_lookup_spec_properties", "OWL-LOOKUP-SPEC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "create_preds_from_owl_data", "CREATE-PREDS-FROM-OWL-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "process_domain_list", "PROCESS-DOMAIN-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "process_range_list", "PROCESS-RANGE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_owl_class_element_names", "CLEAR-OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_owl_class_element_names", "REMOVE-OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_element_names_internal", "OWL-CLASS-ELEMENT-NAMES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_element_names", "OWL-CLASS-ELEMENT-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_token_p", "OWL-CLASS-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_class", "READ-OWL-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_open_class_tag", "HANDLE-OPEN-CLASS-TAG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_enumeration", "READ-OWL-ENUMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "possible_read_owl_list_p", "POSSIBLE-READ-OWL-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_list", "READ-OWL-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_list_recursive", "READ-OWL-LIST-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_owl_list_item", "READ-ONE-OWL-LIST-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_value_specification_union", "OWL-EXTERNAL-VALUE-SPECIFICATION-UNION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "first_non_whitespace_xml_token_position", "FIRST-NON-WHITESPACE-XML-TOKEN-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "next_noninitial_non_whitespace_xml_token_position", "NEXT-NONINITIAL-NON-WHITESPACE-XML-TOKEN-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "next_noninitial_non_whitespace_xml_token", "NEXT-NONINITIAL-NON-WHITESPACE-XML-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "pred_names_from_token", "PRED-NAMES-FROM-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_cyc_name_from_external_name", "OWL-PRED-CYC-NAME-FROM-EXTERNAL-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_cyc_name_base", "OWL-PRED-CYC-NAME-BASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_pred_arg_isa", "OWL-FIND-OR-CREATE-PRED-ARG-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_schema_class_uris_internal", "XML-SCHEMA-CLASS-URIS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_schema_class_uris", "XML-SCHEMA-CLASS-URIS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_for_class", "OWL-FIND-OR-CREATE-TERM-FOR-CLASS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_uri_from_prefix", "OWL-URI-FROM-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_of_type_internal", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_of_type", "OWL-FIND-OR-CREATE-TERM-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_for_class_in_ontology", "OWL-FIND-OR-CREATE-TERM-FOR-CLASS-IN-ONTOLOGY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_of_type_in_ontology_internal", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY-INTERNAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_of_type_in_ontology", "OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "create_owl_term", "CREATE-OWL-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "assert_synonymous_external_concept", "ASSERT-SYNONYMOUS-EXTERNAL-CONCEPT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_synonymous_external_concept_sentence", "GET-SYNONYMOUS-EXTERNAL-CONCEPT-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "prefix_external_owl_name", "PREFIX-EXTERNAL-OWL-NAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "uri_for_owl_ontology", "URI-FOR-OWL-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_uri_for_owl_ontology", "GET-URI-FOR-OWL-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "stringify_uri", "STRINGIFY-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "try_to_abbreviate_owl_uri_internal", "TRY-TO-ABBREVIATE-OWL-URI-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "try_to_abbreviate_owl_uri", "TRY-TO-ABBREVIATE-OWL-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "load_namespace_transcripts", "LOAD-NAMESPACE-TRANSCRIPTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "try_to_abbreviate_owl_uri_recursive", "TRY-TO-ABBREVIATE-OWL-URI-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_union", "OWL-TERM-UNION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "cycl_term_or_owl_quasi_term_p", "CYCL-TERM-OR-OWL-QUASI-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_intersection", "OWL-TERM-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_enumeration", "OWL-TERM-ENUMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oip_pred_prefix", "OIP-PRED-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_define_one_pred", "OWL-DEFINE-ONE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_pred_types_from_info", "OWL-PRED-TYPES-FROM-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_types_from_info", "OWL-TERM-TYPES-FROM-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_define_one_pred_internal", "OWL-DEFINE-ONE-PRED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_pred", "OWL-FIND-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_collection", "OWL-FIND-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_found_term", "NOTE-OWL-FOUND-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_owl_found_terms", "CLEAR-OWL-FOUND-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "lookup_owl_found_term", "LOOKUP-OWL-FOUND-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_term_of_type", "OWL-FIND-TERM-OF-TYPE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_arg2isa_from_range", "OWL-ARG2ISA-FROM-RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_oe_queue_done", "NOTE-OWL-OE-QUEUE-DONE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_oe_queue", "NEW-OWL-OE-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_modified_flag", "OWL-OE-QUEUE-MODIFIED-FLAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_oe_queue_modified_flag", "SET-OWL-OE-QUEUE-MODIFIED-FLAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_modifiedP", "OWL-OE-QUEUE-MODIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_queue", "OWL-OE-QUEUE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_importer", "OWL-OE-QUEUE-IMPORTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "ensure_owl_oe_daemon_running", "ENSURE-OWL-OE-DAEMON-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "launch_owl_oe_queue_daemon", "LAUNCH-OWL-OE-QUEUE-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_enqueue", "OWL-OE-QUEUE-ENQUEUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_reenqueue", "OWL-OE-QUEUE-REENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_enqueue_low", "OWL-OE-QUEUE-ENQUEUE-LOW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_node_id_index", "OWL-NODE-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_node_id_reference", "NOTE-NODE-ID-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "lookup_node_id_reference", "LOOKUP-NODE-ID-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_create", "OWL-CREATE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_create_internal", "OWL-CREATE-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_create_new_constant", "OWL-CREATE-NEW-CONSTANT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_create_new_constant_non_rkf", "OWL-CREATE-NEW-CONSTANT-NON-RKF", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_enqueue_assert", "OWL-ENQUEUE-ASSERT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_oe_daemon", "NEW-OWL-OE-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_queue_empty_p", "OWL-OE-QUEUE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "wait_for_owl_oe_queue_to_empty", "WAIT-FOR-OWL-OE-QUEUE-TO-EMPTY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_daemon_run", "OWL-OE-DAEMON-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_failure", "NOTE-OWL-FAILURE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_failure_message", "OWL-FAILURE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_oe_daemon_assert", "OWL-OE-DAEMON-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_quasi_term_from_specification", "OWL-QUASI-TERM-FROM-SPECIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_quasi_term_from_node_id", "OWL-QUASI-TERM-FROM-NODE-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_quasi_term_p", "OWL-QUASI-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "resolve_owl_quasi_term", "RESOLVE-OWL-QUASI-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_note_found_term_resolution", "CLEAR-NOTE-FOUND-TERM-RESOLUTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_note_found_term_resolution", "REMOVE-NOTE-FOUND-TERM-RESOLUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_found_term_resolution_internal", "NOTE-FOUND-TERM-RESOLUTION-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_found_term_resolution", "NOTE-FOUND-TERM-RESOLUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_assert_internal", "OWL-ASSERT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_assert", "OWL-ASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_assert_low", "OWL-ASSERT-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "create_terms_from_owl_data", "CREATE-TERMS-FROM-OWL-DATA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "dont_reify_owl_termP", "DONT-REIFY-OWL-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_define_one_term", "OWL-DEFINE-ONE-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_term_from_info", "OWL-FIND-TERM-FROM-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_define_one_term_internal", "OWL-DEFINE-ONE-TERM-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "assert_owl_label", "ASSERT-OWL-LABEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "assert_owl_equivalent_class", "ASSERT-OWL-EQUIVALENT-CLASS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "assert_owl_restriction", "ASSERT-OWL-RESTRICTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_restriction_sentence", "OWL-RESTRICTION-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_restriction_collection", "OWL-RESTRICTION-COLLECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_class_from_restriction_internal", "FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_class_from_restriction", "FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_nat", "OWL-FIND-OR-CREATE-NAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "try_to_resolve_node_id_specification", "TRY-TO-RESOLVE-NODE-ID-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_from_specification", "OWL-FIND-OR-CREATE-TERM-FROM-SPECIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_union", "OWL-FIND-OR-CREATE-UNION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_intersection", "OWL-FIND-OR-CREATE-INTERSECTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_classes_from_node_id", "OWL-FIND-OR-CREATE-CLASSES-FROM-NODE-ID", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_find_or_create_term_from_node_id", "OWL-FIND-OR-CREATE-TERM-FROM-NODE-ID", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_print_function_trampoline", "OWL-TERM-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_p", "OWL-TERM-INFO-P", 1, 0, false);
        new $owl_term_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oti_cyc_name", "OTI-CYC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oti_comment", "OTI-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oti_superclasses", "OTI-SUPERCLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oti_disjoint_classes", "OTI-DISJOINT-CLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "oti_plist", "OTI-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oti_cyc_name", "_CSETF-OTI-CYC-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oti_comment", "_CSETF-OTI-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oti_superclasses", "_CSETF-OTI-SUPERCLASSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oti_disjoint_classes", "_CSETF-OTI-DISJOINT-CLASSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_oti_plist", "_CSETF-OTI-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "make_owl_term_info", "MAKE-OWL-TERM-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_owl_term_info", "VISIT-DEFSTRUCT-OWL-TERM-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_object_owl_term_info_method", "VISIT-DEFSTRUCT-OBJECT-OWL-TERM-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "print_owl_term_info", "PRINT-OWL-TERM-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_or_create_owl_term_info", "FIND-OR-CREATE-OWL-TERM-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_term_info", "NEW-OWL-TERM-INFO", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_cyc_name", "OWL-TERM-INFO-CYC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_comment", "OWL-TERM-INFO-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_superclasses", "OWL-TERM-INFO-SUPERCLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_disjoint_classes", "OWL-TERM-INFO-DISJOINT-CLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_plist", "OWL-TERM-INFO-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_plist_lookup", "OWL-TERM-INFO-PLIST-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_external_name", "OWL-TERM-INFO-EXTERNAL-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_term_info_cyc_name", "SET-OWL-TERM-INFO-CYC-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "set_owl_term_info_comment", "SET-OWL-TERM-INFO-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "add_owl_term_info_superclass", "ADD-OWL-TERM-INFO-SUPERCLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "add_owl_term_info_disjoint_class", "ADD-OWL-TERM-INFO-DISJOINT-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_plist_enter", "OWL-TERM-INFO-PLIST-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_plist_push", "OWL-TERM-INFO-PLIST-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_term_info_plist_list_propertyP", "OWL-TERM-INFO-PLIST-LIST-PROPERTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "merge_owl_term_definitions", "MERGE-OWL-TERM-DEFINITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_term_info_method", "SXHASH-OWL-TERM-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_term_info", "SXHASH-OWL-TERM-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_named_bnodes", "IMPORT-NAMED-BNODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_named_bnode", "READ-ONE-NAMED-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_class_info_from_owl_tokens", "READ-CLASS-INFO-FROM-OWL-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_class_info_from_owl_tokens", "READ-ONE-CLASS-INFO-FROM-OWL-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_owl_chunk_for_class_info", "READ-ONE-OWL-CHUNK-FOR-CLASS-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_instance_info_from_owl_tokens", "READ-INSTANCE-INFO-FROM-OWL-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_instance_info_from_owl_tokens", "READ-ONE-INSTANCE-INFO-FROM-OWL-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_one_owl_chunk_for_instance_info", "READ-ONE-OWL-CHUNK-FOR-INSTANCE-INFO", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_maybe_instance_tokenP", "OWL-MAYBE-INSTANCE-TOKEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_non_instance_tokenP", "OWL-NON-INSTANCE-TOKEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_non_target_owl_token", "HANDLE-NON-TARGET-OWL-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_term_info_token", "HANDLE-TERM-INFO-TOKEN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_cyc_guid", "HANDLE-CYC-GUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_cyc_external_id", "HANDLE-CYC-EXTERNAL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "handle_property_value_pair", "HANDLE-PROPERTY-VALUE-PAIR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_term_reference", "READ-OWL-TERM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_import_parameters_class_prefix", "OWL-IMPORT-PARAMETERS-CLASS-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "term_names_from_token", "TERM-NAMES-FROM-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_external_name_from_token", "OWL-EXTERNAL-NAME-FROM-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_class_cyc_name_from_external_name", "OWL-CLASS-CYC-NAME-FROM-EXTERNAL-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "nonlocal_owl_term_reference_p", "NONLOCAL-OWL-TERM-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "resolve_nonlocal_owl_term_reference", "RESOLVE-NONLOCAL-OWL-TERM-REFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_class_or_restriction", "READ-OWL-CLASS-OR-RESTRICTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_restriction", "READ-OWL-RESTRICTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_part_of_owl_restriction", "READ-PART-OF-OWL-RESTRICTION", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_restriction_property", "READ-OWL-RESTRICTION-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "read_owl_restriction_class", "READ-OWL-RESTRICTION-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_value_from_string", "OWL-VALUE-FROM-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "clear_xml_name", "CLEAR-XML-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "remove_xml_name", "REMOVE-XML-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_name_internal", "XML-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "xml_name", "XML-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_print_function_trampoline", "OWL-IMPORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_p", "OWL-IMPORTER-P", 1, 0, false);
        new $owl_importer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imp_id", "OWL-IMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imp_progress", "OWL-IMP-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imp_error_info", "OWL-IMP-ERROR-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imp_import_parameters", "OWL-IMP-IMPORT-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_imp_thread", "OWL-IMP-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_owl_imp_id", "_CSETF-OWL-IMP-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_owl_imp_progress", "_CSETF-OWL-IMP-PROGRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_owl_imp_error_info", "_CSETF-OWL-IMP-ERROR-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_owl_imp_import_parameters", "_CSETF-OWL-IMP-IMPORT-PARAMETERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "_csetf_owl_imp_thread", "_CSETF-OWL-IMP-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "make_owl_importer", "MAKE-OWL-IMPORTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_owl_importer", "VISIT-DEFSTRUCT-OWL-IMPORTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "visit_defstruct_object_owl_importer_method", "VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "print_owl_importer", "PRINT-OWL-IMPORTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "new_owl_importer", "NEW-OWL-IMPORTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_id", "OWL-IMPORTER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_progress", "OWL-IMPORTER-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_error_info", "OWL-IMPORTER-ERROR-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_import_parameters", "OWL-IMPORTER-IMPORT-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_thread", "OWL-IMPORTER-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_importer_method", "SXHASH-OWL-IMPORTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "sxhash_owl_importer", "SXHASH-OWL-IMPORTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_with_importer", "IMPORT-OWL-ONTOLOGY-WITH-IMPORTER", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_owl_ontology_with_importer_from_info", "IMPORT-OWL-ONTOLOGY-WITH-IMPORTER-FROM-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_owl_importer_ontology", "GET-OWL-IMPORTER-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_owl_importer_progress", "GET-OWL-IMPORTER-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "get_owl_importer_error_info", "GET-OWL-IMPORTER-ERROR-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_done_p", "OWL-IMPORTER-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_exists_p", "OWL-IMPORTER-EXISTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_id_index", "OWL-IMPORTER-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "find_owl_importer_by_id", "FIND-OWL-IMPORTER-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_parameters", "NOTE-OWL-IMPORT-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_section_progress", "NOTE-OWL-IMPORT-SECTION-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_section_started", "NOTE-OWL-IMPORT-SECTION-STARTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_section_done", "NOTE-OWL-IMPORT-SECTION-DONE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_done", "NOTE-OWL-IMPORT-DONE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "note_owl_import_problem", "NOTE-OWL-IMPORT-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "owl_importer_run", "OWL-IMPORTER-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.owl_to_cycl", "import_sample_ontologies", "IMPORT-SAMPLE-ONTOLOGIES", 0, 0, false);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    public static SubLObject init_owl_to_cycl_file() {
        owl_to_cycl.$owl_importer_v1_version_number$ = SubLFiles.deflexical("*OWL-IMPORTER-V1-VERSION-NUMBER*", (SubLObject)(maybeDefault((SubLObject)owl_to_cycl.$sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_, owl_to_cycl.$owl_importer_v1_version_number$, owl_to_cycl.NIL)));
        owl_to_cycl.$owl_importer$ = SubLFiles.defparameter("*OWL-IMPORTER*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_merge_mt$ = SubLFiles.deflexical("*OWL-MERGE-MT*", owl_to_cycl.$const34$OWLMappingMt);
        owl_to_cycl.$owl_term_names_preceded_by_id$ = SubLFiles.deflexical("*OWL-TERM-NAMES-PRECEDED-BY-ID*", (SubLObject)owl_to_cycl.$list49);
        owl_to_cycl.$owl_term_names_preceded_by_about$ = SubLFiles.deflexical("*OWL-TERM-NAMES-PRECEDED-BY-ABOUT*", (SubLObject)owl_to_cycl.$list50);
        owl_to_cycl.$owl_term_names_preceded_by_resource$ = SubLFiles.deflexical("*OWL-TERM-NAMES-PRECEDED-BY-RESOURCE*", (SubLObject)owl_to_cycl.$list51);
        owl_to_cycl.$owl_term_names_preceded_by_parse_type$ = SubLFiles.deflexical("*OWL-TERM-NAMES-PRECEDED-BY-PARSE-TYPE*", (SubLObject)owl_to_cycl.$list52);
        owl_to_cycl.$owl_definition_types$ = SubLFiles.defparameter("*OWL-DEFINITION-TYPES*", (SubLObject)owl_to_cycl.$list53);
        owl_to_cycl.$owl_definition_type$ = SubLFiles.defparameter("*OWL-DEFINITION-TYPE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_definition_accumulator$ = SubLFiles.defparameter("*OWL-DEFINITION-ACCUMULATOR*", misc_utilities.uninitialized());
        owl_to_cycl.$owl_oe_queue$ = SubLFiles.defparameter("*OWL-OE-QUEUE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_import_parameters$ = SubLFiles.defparameter("*OWL-IMPORT-PARAMETERS*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$xml_tokens_from_file_caching_state$ = SubLFiles.deflexical("*XML-TOKENS-FROM-FILE-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$default_owl_file_encoding$ = SubLFiles.deflexical("*DEFAULT-OWL-FILE-ENCODING*", (SubLObject)owl_to_cycl.$str86$utf_8);
        owl_to_cycl.$owl_import_parameters_ontology_context_caching_state$ = SubLFiles.deflexical("*OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$dtp_owl_pred_info$ = SubLFiles.defconstant("*DTP-OWL-PRED-INFO*", (SubLObject)owl_to_cycl.$sym123$OWL_PRED_INFO);
        owl_to_cycl.$dtp_owl_import_parameters$ = SubLFiles.defconstant("*DTP-OWL-IMPORT-PARAMETERS*", (SubLObject)owl_to_cycl.$sym167$OWL_IMPORT_PARAMETERS);
        owl_to_cycl.$owl_reserved_namespaces$ = SubLFiles.deflexical("*OWL-RESERVED-NAMESPACES*", (SubLObject)owl_to_cycl.$list223);
        owl_to_cycl.$find_or_create_owl_ontology_for_uri_caching_state$ = SubLFiles.deflexical("*FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_property_element_names_caching_state$ = SubLFiles.deflexical("*OWL-PROPERTY-ELEMENT-NAMES-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_spec_properties$ = SubLFiles.defparameter("*OWL-SPEC-PROPERTIES*", misc_utilities.uninitialized());
        owl_to_cycl.$owl_class_element_names_caching_state$ = SubLFiles.deflexical("*OWL-CLASS-ELEMENT-NAMES-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_force_new_term_creationP$ = SubLFiles.defparameter("*OWL-FORCE-NEW-TERM-CREATION?*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_allow_find_via_creationP$ = SubLFiles.defparameter("*OWL-ALLOW-FIND-VIA-CREATION?*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$cyc_properties_to_not_import$ = SubLFiles.deflexical("*CYC-PROPERTIES-TO-NOT-IMPORT*", (SubLObject)owl_to_cycl.$list392);
        owl_to_cycl.$owl_found_terms$ = SubLFiles.deflexical("*OWL-FOUND-TERMS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)owl_to_cycl.EQUAL), (SubLObject)owl_to_cycl.UNPROVIDED));
        owl_to_cycl.$owl_oe_queues$ = SubLFiles.deflexical("*OWL-OE-QUEUES*", (SubLObject)(maybeDefault((SubLObject)owl_to_cycl.$sym418$_OWL_OE_QUEUES_, owl_to_cycl.$owl_oe_queues$, owl_to_cycl.NIL)));
        owl_to_cycl.$owl_oe_daemon$ = SubLFiles.deflexical("*OWL-OE-DAEMON*", (SubLObject)(maybeDefault((SubLObject)owl_to_cycl.$sym419$_OWL_OE_DAEMON_, owl_to_cycl.$owl_oe_daemon$, owl_to_cycl.NIL)));
        owl_to_cycl.$owl_oe_queue_marker$ = SubLFiles.deflexical("*OWL-OE-QUEUE-MARKER*", (SubLObject)Characters.CHAR_vertical);
        owl_to_cycl.$owl_oe_queue_end_marker$ = SubLFiles.deflexical("*OWL-OE-QUEUE-END-MARKER*", (SubLObject)Characters.CHAR_exclamation);
        owl_to_cycl.$owl_node_id_index$ = SubLFiles.deflexical("*OWL-NODE-ID-INDEX*", (SubLObject)(maybeDefault((SubLObject)owl_to_cycl.$sym420$_OWL_NODE_ID_INDEX_, owl_to_cycl.$owl_node_id_index$, owl_to_cycl.NIL)));
        owl_to_cycl.$note_found_term_resolution_caching_state$ = SubLFiles.deflexical("*NOTE-FOUND-TERM-RESOLUTION-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$create_anonymous_owl_termsP$ = SubLFiles.defparameter("*CREATE-ANONYMOUS-OWL-TERMS?*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$owl_restriction_collection_templates$ = SubLFiles.deflexical("*OWL-RESTRICTION-COLLECTION-TEMPLATES*", (SubLObject)ConsesLow.list(reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str496$allValuesFrom), (SubLObject)owl_to_cycl.$list509), reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str498$someValuesFrom), (SubLObject)owl_to_cycl.$list510), reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str500$hasValue), (SubLObject)owl_to_cycl.$list511), reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str504$cardinality), (SubLObject)owl_to_cycl.$list512), reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str507$maxCardinality), (SubLObject)owl_to_cycl.$list513), reader.bq_cons(owl_utilities.owl_name((SubLObject)owl_to_cycl.$str502$minCardinality), (SubLObject)owl_to_cycl.$list514)));
        owl_to_cycl.$owl_term_from_specification_depth$ = SubLFiles.defparameter("*OWL-TERM-FROM-SPECIFICATION-DEPTH*", (SubLObject)owl_to_cycl.ZERO_INTEGER);
        owl_to_cycl.$dtp_owl_term_info$ = SubLFiles.defconstant("*DTP-OWL-TERM-INFO*", (SubLObject)owl_to_cycl.$sym532$OWL_TERM_INFO);
        owl_to_cycl.$owl_interval_datatypes$ = SubLFiles.deflexical("*OWL-INTERVAL-DATATYPES*", (SubLObject)owl_to_cycl.$list623);
        owl_to_cycl.$xml_name_caching_state$ = SubLFiles.deflexical("*XML-NAME-CACHING-STATE*", (SubLObject)owl_to_cycl.NIL);
        owl_to_cycl.$dtp_owl_importer$ = SubLFiles.defconstant("*DTP-OWL-IMPORTER*", (SubLObject)owl_to_cycl.$sym640$OWL_IMPORTER);
        owl_to_cycl.$owl_importer_id_index$ = SubLFiles.deflexical("*OWL-IMPORTER-ID-INDEX*", (SubLObject)(maybeDefault((SubLObject)owl_to_cycl.$sym673$_OWL_IMPORTER_ID_INDEX_, owl_to_cycl.$owl_importer_id_index$, owl_to_cycl.NIL)));
        owl_to_cycl.$sweet_root$ = SubLFiles.deflexical("*SWEET-ROOT*", (SubLObject)owl_to_cycl.$str675$http___sweet_jpl_nasa_gov_ontolog);
        owl_to_cycl.$sweet_ontologies$ = SubLFiles.deflexical("*SWEET-ONTOLOGIES*", (SubLObject)owl_to_cycl.$list676);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    public static SubLObject setup_owl_to_cycl_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)owl_to_cycl.$sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_);
        owl_to_cycl.$owl_importer_v1_version_number$.setGlobalValue((SubLObject)owl_to_cycl.$str2$_Revision__138034__);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym37$MEMOIZED_COUNT_ALL_SPECS);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym44$OWL_MIN_GENLS_MEMOIZED);
        access_macros.register_external_symbol((SubLObject)owl_to_cycl.$sym59$IMPORT_OWL_ONTOLOGY);
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym75$XML_TOKENS_FROM_FILE);
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym104$OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_pred_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym130$OWL_PRED_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)owl_to_cycl.$list131);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym132$OPI_CYC_NAME, (SubLObject)owl_to_cycl.$sym133$_CSETF_OPI_CYC_NAME);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym134$OPI_COMMENT, (SubLObject)owl_to_cycl.$sym135$_CSETF_OPI_COMMENT);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym136$OPI_DOMAINS, (SubLObject)owl_to_cycl.$sym137$_CSETF_OPI_DOMAINS);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym138$OPI_RANGE, (SubLObject)owl_to_cycl.$sym139$_CSETF_OPI_RANGE);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym140$OPI_PLIST, (SubLObject)owl_to_cycl.$sym141$_CSETF_OPI_PLIST);
        Equality.identity((SubLObject)owl_to_cycl.$sym123$OWL_PRED_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_pred_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym152$VISIT_DEFSTRUCT_OBJECT_OWL_PRED_INFO_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)owl_to_cycl.$sym129$PRINT_OWL_PRED_INFO);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_pred_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym166$SXHASH_OWL_PRED_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_import_parameters$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym174$OWL_IMPORT_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)owl_to_cycl.$list175);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym176$OIP_ONTOLOGY, (SubLObject)owl_to_cycl.$sym177$_CSETF_OIP_ONTOLOGY);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym178$OIP_NAMESPACE_MAP, (SubLObject)owl_to_cycl.$sym179$_CSETF_OIP_NAMESPACE_MAP);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym180$OIP_CONSTANT_PREFIX, (SubLObject)owl_to_cycl.$sym181$_CSETF_OIP_CONSTANT_PREFIX);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym182$OIP_CONSTANT_SUFFIX, (SubLObject)owl_to_cycl.$sym183$_CSETF_OIP_CONSTANT_SUFFIX);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym184$OIP_BASE_URI, (SubLObject)owl_to_cycl.$sym185$_CSETF_OIP_BASE_URI);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym186$OIP_URI_PREFIX, (SubLObject)owl_to_cycl.$sym187$_CSETF_OIP_URI_PREFIX);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym188$OIP_CYCLIST, (SubLObject)owl_to_cycl.$sym189$_CSETF_OIP_CYCLIST);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym190$OIP_QUOTED_ISA, (SubLObject)owl_to_cycl.$sym191$_CSETF_OIP_QUOTED_ISA);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym192$OIP_PREFIX_EXTERNAL_NAMES_, (SubLObject)owl_to_cycl.$sym193$_CSETF_OIP_PREFIX_EXTERNAL_NAMES_);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym194$OIP_ABBREVIATE_PREFIXES_, (SubLObject)owl_to_cycl.$sym195$_CSETF_OIP_ABBREVIATE_PREFIXES_);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym196$OIP_IMPORT_TERM, (SubLObject)owl_to_cycl.$sym197$_CSETF_OIP_IMPORT_TERM);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym198$OIP_ENCODING, (SubLObject)owl_to_cycl.$sym199$_CSETF_OIP_ENCODING);
        Equality.identity((SubLObject)owl_to_cycl.$sym167$OWL_IMPORT_PARAMETERS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_import_parameters$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym205$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORT_PARAMETERS_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)owl_to_cycl.$sym173$PRINT_OWL_IMPORT_PARAMETERS);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_import_parameters$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym214$SXHASH_OWL_IMPORT_PARAMETERS_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym228$FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI);
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym248$OWL_PROPERTY_ELEMENT_NAMES);
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym304$OWL_CLASS_ELEMENT_NAMES);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym340$XML_SCHEMA_CLASS_URIS);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym372$TRY_TO_ABBREVIATE_OWL_URI);
        subl_macro_promotions.declare_defglobal((SubLObject)owl_to_cycl.$sym418$_OWL_OE_QUEUES_);
        subl_macro_promotions.declare_defglobal((SubLObject)owl_to_cycl.$sym419$_OWL_OE_DAEMON_);
        subl_macro_promotions.declare_defglobal((SubLObject)owl_to_cycl.$sym420$_OWL_NODE_ID_INDEX_);
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym448$NOTE_FOUND_TERM_RESOLUTION);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym451$OWL_ASSERT);
        memoization_state.note_memoized_function((SubLObject)owl_to_cycl.$sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_term_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym538$OWL_TERM_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)owl_to_cycl.$list539);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym540$OTI_CYC_NAME, (SubLObject)owl_to_cycl.$sym541$_CSETF_OTI_CYC_NAME);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym542$OTI_COMMENT, (SubLObject)owl_to_cycl.$sym543$_CSETF_OTI_COMMENT);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym544$OTI_SUPERCLASSES, (SubLObject)owl_to_cycl.$sym545$_CSETF_OTI_SUPERCLASSES);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym546$OTI_DISJOINT_CLASSES, (SubLObject)owl_to_cycl.$sym547$_CSETF_OTI_DISJOINT_CLASSES);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym548$OTI_PLIST, (SubLObject)owl_to_cycl.$sym549$_CSETF_OTI_PLIST);
        Equality.identity((SubLObject)owl_to_cycl.$sym532$OWL_TERM_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_term_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym553$VISIT_DEFSTRUCT_OBJECT_OWL_TERM_INFO_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)owl_to_cycl.$sym537$PRINT_OWL_TERM_INFO);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_term_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym557$SXHASH_OWL_TERM_INFO_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)owl_to_cycl.$sym637$XML_NAME);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_importer$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym647$OWL_IMPORTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)owl_to_cycl.$list648);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym649$OWL_IMP_ID, (SubLObject)owl_to_cycl.$sym650$_CSETF_OWL_IMP_ID);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym651$OWL_IMP_PROGRESS, (SubLObject)owl_to_cycl.$sym652$_CSETF_OWL_IMP_PROGRESS);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym653$OWL_IMP_ERROR_INFO, (SubLObject)owl_to_cycl.$sym654$_CSETF_OWL_IMP_ERROR_INFO);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym655$OWL_IMP_IMPORT_PARAMETERS, (SubLObject)owl_to_cycl.$sym656$_CSETF_OWL_IMP_IMPORT_PARAMETERS);
        Structures.def_csetf((SubLObject)owl_to_cycl.$sym657$OWL_IMP_THREAD, (SubLObject)owl_to_cycl.$sym658$_CSETF_OWL_IMP_THREAD);
        Equality.identity((SubLObject)owl_to_cycl.$sym640$OWL_IMPORTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_importer$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym665$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)owl_to_cycl.$sym646$PRINT_OWL_IMPORTER);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), owl_to_cycl.$dtp_owl_importer$.getGlobalValue(), Symbols.symbol_function((SubLObject)owl_to_cycl.$sym667$SXHASH_OWL_IMPORTER_METHOD));
        access_macros.register_external_symbol((SubLObject)owl_to_cycl.$sym668$IMPORT_OWL_ONTOLOGY_WITH_IMPORTER);
        subl_macro_promotions.declare_defglobal((SubLObject)owl_to_cycl.$sym673$_OWL_IMPORTER_ID_INDEX_);
        return (SubLObject)owl_to_cycl.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_owl_to_cycl_file();
    }
    
    @Override
	public void initializeVariables() {
        init_owl_to_cycl_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_owl_to_cycl_file();
    }
    
    static {
        me = (SubLFile)new owl_to_cycl();
        owl_to_cycl.$owl_importer_v1_version_number$ = null;
        owl_to_cycl.$owl_importer$ = null;
        owl_to_cycl.$owl_merge_mt$ = null;
        owl_to_cycl.$owl_term_names_preceded_by_id$ = null;
        owl_to_cycl.$owl_term_names_preceded_by_about$ = null;
        owl_to_cycl.$owl_term_names_preceded_by_resource$ = null;
        owl_to_cycl.$owl_term_names_preceded_by_parse_type$ = null;
        owl_to_cycl.$owl_definition_types$ = null;
        owl_to_cycl.$owl_definition_type$ = null;
        owl_to_cycl.$owl_definition_accumulator$ = null;
        owl_to_cycl.$owl_oe_queue$ = null;
        owl_to_cycl.$owl_import_parameters$ = null;
        owl_to_cycl.$xml_tokens_from_file_caching_state$ = null;
        owl_to_cycl.$default_owl_file_encoding$ = null;
        owl_to_cycl.$owl_import_parameters_ontology_context_caching_state$ = null;
        owl_to_cycl.$dtp_owl_pred_info$ = null;
        owl_to_cycl.$dtp_owl_import_parameters$ = null;
        owl_to_cycl.$owl_reserved_namespaces$ = null;
        owl_to_cycl.$find_or_create_owl_ontology_for_uri_caching_state$ = null;
        owl_to_cycl.$owl_property_element_names_caching_state$ = null;
        owl_to_cycl.$owl_spec_properties$ = null;
        owl_to_cycl.$owl_class_element_names_caching_state$ = null;
        owl_to_cycl.$owl_force_new_term_creationP$ = null;
        owl_to_cycl.$owl_allow_find_via_creationP$ = null;
        owl_to_cycl.$cyc_properties_to_not_import$ = null;
        owl_to_cycl.$owl_found_terms$ = null;
        owl_to_cycl.$owl_oe_queues$ = null;
        owl_to_cycl.$owl_oe_daemon$ = null;
        owl_to_cycl.$owl_oe_queue_marker$ = null;
        owl_to_cycl.$owl_oe_queue_end_marker$ = null;
        owl_to_cycl.$owl_node_id_index$ = null;
        owl_to_cycl.$note_found_term_resolution_caching_state$ = null;
        owl_to_cycl.$create_anonymous_owl_termsP$ = null;
        owl_to_cycl.$owl_restriction_collection_templates$ = null;
        owl_to_cycl.$owl_term_from_specification_depth$ = null;
        owl_to_cycl.$dtp_owl_term_info$ = null;
        owl_to_cycl.$owl_interval_datatypes$ = null;
        owl_to_cycl.$xml_name_caching_state$ = null;
        owl_to_cycl.$dtp_owl_importer$ = null;
        owl_to_cycl.$owl_importer_id_index$ = null;
        owl_to_cycl.$sweet_root$ = null;
        owl_to_cycl.$sweet_ontologies$ = null;
        $sym0$_OWL_IMPORTER_V1_VERSION_NUMBER_ = SubLObjectFactory.makeSymbol("*OWL-IMPORTER-V1-VERSION-NUMBER*");
        $sym1$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $str2$_Revision__138034__ = SubLObjectFactory.makeString("$Revision: 138034 $");
        $sym3$HL_TERM_P = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $sym4$LIST_OF_STRING_P = SubLObjectFactory.makeSymbol("LIST-OF-STRING-P");
        $int5$255 = SubLObjectFactory.makeInteger(255);
        $int6$100 = SubLObjectFactory.makeInteger(100);
        $sym7$_ = SubLObjectFactory.makeSymbol(">");
        $const8$OWLOntologyQuery_GetRootClasses = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLOntologyQuery-GetRootClasses"));
        $const9$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $sym10$TERM_OF_SOME_OWL_ONTOLOGY__VIA_INDEX = SubLObjectFactory.makeSymbol("TERM-OF-SOME-OWL-ONTOLOGY?-VIA-INDEX");
        $sym11$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const12$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw13$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const14$owl_Ontology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:Ontology"));
        $const15$owl_imports = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:imports"));
        $const16$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str17$Can_t_find_path_from__S_to___Thin = SubLObjectFactory.makeString("Can't find path from ~S to #$Thing.");
        $sym18$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $kw19$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw20$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw21$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym22$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw23$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str24$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym25$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw26$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str27$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw28$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str29$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const30$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str31$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str32$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str33$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const34$OWLMappingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLMappingMt"));
        $const35$coExtensional = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("coExtensional"));
        $const36$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym37$MEMOIZED_COUNT_ALL_SPECS = SubLObjectFactory.makeSymbol("MEMOIZED-COUNT-ALL-SPECS");
        $sym38$ISA_COLLECTION_ = SubLObjectFactory.makeSymbol("ISA-COLLECTION?");
        $sym39$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const40$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym41$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym42$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym43$LONGEST_ACYCLIC_GENLS_PATH_INTERNAL = SubLObjectFactory.makeSymbol("LONGEST-ACYCLIC-GENLS-PATH-INTERNAL");
        $sym44$OWL_MIN_GENLS_MEMOIZED = SubLObjectFactory.makeSymbol("OWL-MIN-GENLS-MEMOIZED");
        $kw45$UP = SubLObjectFactory.makeKeyword("UP");
        $str46$Of = SubLObjectFactory.makeString("Of");
        $kw47$COLLECTION = SubLObjectFactory.makeKeyword("COLLECTION");
        $kw48$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("UnknownOrganization"), SubLObjectFactory.makeString("FinancialOrganization"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("Organization"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("ResidentialBuilding"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("ShoppingMall"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("Kidnapping"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("TerroristAttack"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("CitizenPeopleGroup"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("MinistryOfCulture"), SubLObjectFactory.makeString("Ministry"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("Insurgent"), SubLObjectFactory.makeString("Citizen"), SubLObjectFactory.makeString("CivilianPerson"), SubLObjectFactory.makeString("HighSchool"), SubLObjectFactory.makeString("University"), SubLObjectFactory.makeString("Funeral"), SubLObjectFactory.makeString("Wedding"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("UnknownPeopleGroup"), SubLObjectFactory.makeString("PeopleGroup"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("SocioReligousEvent"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("Bank"), SubLObjectFactory.makeString("Company"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("GeneralElection"), SubLObjectFactory.makeString("repeatingEvent"), SubLObjectFactory.makeString("Election"), SubLObjectFactory.makeString("Synagogue"), SubLObjectFactory.makeString("Mosque"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("departureLocation"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("destination"), SubLObjectFactory.makeString("UnknownPerson"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("PowerPlant"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("NuclearFacility"), SubLObjectFactory.makeString("SuicideBombing"), SubLObjectFactory.makeString("Anniversary"), SubLObjectFactory.makeString("Group"), SubLObjectFactory.makeString("numberOfGrupMembers"), SubLObjectFactory.makeString("PoliticalParty"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("State"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("InsurgentPeopleGroup"), SubLObjectFactory.makeString("GovernmentalPeopleGroup"), SubLObjectFactory.makeString("Embassy"), SubLObjectFactory.makeString("MilitaryPerson"), SubLObjectFactory.makeString("War"), SubLObjectFactory.makeString("MilitaryPeopleGroup"), SubLObjectFactory.makeString("hasSpokesman"), SubLObjectFactory.makeString("isSpokesmanFor"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("ideologistFor"), SubLObjectFactory.makeString("hasIdeologist"), SubLObjectFactory.makeString("husbandOf"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("wifeOf"), SubLObjectFactory.makeString("hasSubevent"), SubLObjectFactory.makeString("cityInCountry"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("presentAt"), SubLObjectFactory.makeString("hasAttendant"), SubLObjectFactory.makeString("hasFollower"), SubLObjectFactory.makeString("followerOf"), SubLObjectFactory.makeString("chiefOf"), SubLObjectFactory.makeString("hasChief"), SubLObjectFactory.makeString("leaderOf"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("hasDirector"), SubLObjectFactory.makeString("directorOf"), SubLObjectFactory.makeString("provinceInCountry"), SubLObjectFactory.makeString("hasProvince"), SubLObjectFactory.makeString("acquiredNationality"), SubLObjectFactory.makeString("victimOf"), SubLObjectFactory.makeString("hasVictim"), SubLObjectFactory.makeString("isPressSecretaryFor"), SubLObjectFactory.makeString("hasPressSecretary"), SubLObjectFactory.makeString("cousinOf"), SubLObjectFactory.makeString("familyRelativeOf"), SubLObjectFactory.makeString("subEventOf"), SubLObjectFactory.makeString("hasActor"), SubLObjectFactory.makeString("isActorOf"), SubLObjectFactory.makeString("hasChairman"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("isChairmanOf"), SubLObjectFactory.makeString("organizerOf"), SubLObjectFactory.makeString("organizedBy"), SubLObjectFactory.makeString("capitalCityInCountry"), SubLObjectFactory.makeString("hasCapitalCity"), SubLObjectFactory.makeString("childOf"), SubLObjectFactory.makeString("parentOf"), SubLObjectFactory.makeString("hasMilitant"), SubLObjectFactory.makeString("militantOf"), SubLObjectFactory.makeString("countryInState"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("isPrimeMiniterOf"), SubLObjectFactory.makeString("hasPrimeMinister"), SubLObjectFactory.makeString("contactedBy"), SubLObjectFactory.makeString("contacts"), SubLObjectFactory.makeString("placeOfBirth"), SubLObjectFactory.makeString("residesIn"), SubLObjectFactory.makeString("killedAt"), SubLObjectFactory.makeString("hasPeopleKilled"), SubLObjectFactory.makeString("financedBy"), SubLObjectFactory.makeString("financierOf"), SubLObjectFactory.makeString("hasWounded"), SubLObjectFactory.makeString("woundedAt"), SubLObjectFactory.makeString("hasState"), SubLObjectFactory.makeString("isTargetOf"), SubLObjectFactory.makeString("hasTarget"), SubLObjectFactory.makeString("founderOf"), SubLObjectFactory.makeString("foundedBy"), SubLObjectFactory.makeString("arrestedAt"), SubLObjectFactory.makeString("hasPeopleArrested"), SubLObjectFactory.makeString("hasAuthor"), SubLObjectFactory.makeString("authorOf"), SubLObjectFactory.makeString("hasLocation"), SubLObjectFactory.makeString("locatedIn"), SubLObjectFactory.makeString("funderOf"), SubLObjectFactory.makeString("fundedBy"), SubLObjectFactory.makeString("isEventLocation"), SubLObjectFactory.makeString("locationOfEvent"), SubLObjectFactory.makeString("bornNationality"), SubLObjectFactory.makeString("employeeOf"), SubLObjectFactory.makeString("hasEmployee"), SubLObjectFactory.makeString("hasSuborganization"), SubLObjectFactory.makeString("subOrganizationOf"), SubLObjectFactory.makeString("happensAtPlace"), SubLObjectFactory.makeString("hasPart"), SubLObjectFactory.makeString("isPartOf"), SubLObjectFactory.makeString("contents"), SubLObjectFactory.makeString("startDateOfDuty"), SubLObjectFactory.makeString("occurenceTimeOfDate"), SubLObjectFactory.makeString("wikipediaEnrty"), SubLObjectFactory.makeString("currentOrganizationStatus"), SubLObjectFactory.makeString("langitude"), SubLObjectFactory.makeString("internationalOrganization"), SubLObjectFactory.makeString("eventTitles"), SubLObjectFactory.makeString("name"), SubLObjectFactory.makeString("damage"), SubLObjectFactory.makeString("endDateDuty"), SubLObjectFactory.makeString("numberHostages"), SubLObjectFactory.makeString("numberKilled"), SubLObjectFactory.makeString("publicName"), SubLObjectFactory.makeString("dateBirth"), SubLObjectFactory.makeString("currentPersonStatus"), SubLObjectFactory.makeString("dateArrested"), SubLObjectFactory.makeString("biography"), SubLObjectFactory.makeString("dateOfQuote"), SubLObjectFactory.makeString("lastName"), SubLObjectFactory.makeString("newsArticleId"), SubLObjectFactory.makeString("associatedKeywords"), SubLObjectFactory.makeString("filename"), SubLObjectFactory.makeString("startDate"), SubLObjectFactory.makeString("eventDate"), SubLObjectFactory.makeString("acronym"), SubLObjectFactory.makeString("firstName"), SubLObjectFactory.makeString("numberArrested"), SubLObjectFactory.makeString("recurrence"), SubLObjectFactory.makeString("currentlyInCharge"), SubLObjectFactory.makeString("homepage"), SubLObjectFactory.makeString("numberInjured"), SubLObjectFactory.makeString("picture"), SubLObjectFactory.makeString("endDate"), SubLObjectFactory.makeString("otherGivenNames"), SubLObjectFactory.makeString("associatedAlerts"), SubLObjectFactory.makeString("associatedNewsArticles"), SubLObjectFactory.makeString("size"), SubLObjectFactory.makeString("purpose"), SubLObjectFactory.makeString("dateDeath"), SubLObjectFactory.makeString("newsResource"), SubLObjectFactory.makeString("zipCode"), SubLObjectFactory.makeString("occurrenceDate"), SubLObjectFactory.makeString("associatedTitles"), SubLObjectFactory.makeString("foundationDate"), SubLObjectFactory.makeString("religion"), SubLObjectFactory.makeString("duration"), SubLObjectFactory.makeString("description"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("clusterId"), SubLObjectFactory.makeString("idEMM"), SubLObjectFactory.makeString("address"), SubLObjectFactory.makeString("maritalStatus"), SubLObjectFactory.makeString("occupation"), SubLObjectFactory.makeString("latitude"), SubLObjectFactory.makeString("title"), SubLObjectFactory.makeString("language"), SubLObjectFactory.makeString("colleagueOf"), SubLObjectFactory.makeString("siblingOf"), SubLObjectFactory.makeString("housemateOf"), SubLObjectFactory.makeString("friendOf"), SubLObjectFactory.makeString("gender"), SubLObjectFactory.makeString("areasOfOperation") });
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Citizen"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("Election"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Wedding"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("NuclearFacility"), SubLObjectFactory.makeString("Company"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("University"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("PeopleGroup"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("Mosque"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("SocioReligousEvent"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("TerroristAttack"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("ShoppingMall"), SubLObjectFactory.makeString("Ministry"), SubLObjectFactory.makeString("CivilianPerson"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("FinancialOrganization"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("wifeOf"), SubLObjectFactory.makeString("hasIdeologist"), SubLObjectFactory.makeString("departureLocation"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("hasAttendant"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("hasPeopleKilled"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("hasTarget"), SubLObjectFactory.makeString("destination"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("militantOf"), SubLObjectFactory.makeString("hasVictim"), SubLObjectFactory.makeString("hasProvince"), SubLObjectFactory.makeString("foundedBy"), SubLObjectFactory.makeString("locationOfEvent"), SubLObjectFactory.makeString("hasPressSecretary"), SubLObjectFactory.makeString("followerOf"), SubLObjectFactory.makeString("directorOf"), SubLObjectFactory.makeString("woundedAt"), SubLObjectFactory.makeString("isSpokesmanFor"), SubLObjectFactory.makeString("organizedBy"), SubLObjectFactory.makeString("hasCapitalCity"), SubLObjectFactory.makeString("hasPeopleArrested"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("isChairmanOf"), SubLObjectFactory.makeString("leaderOf"), SubLObjectFactory.makeString("contacts"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("financierOf"), SubLObjectFactory.makeString("hasState"), SubLObjectFactory.makeString("hasEmployee"), SubLObjectFactory.makeString("authorOf"), SubLObjectFactory.makeString("hasPrimeMinister"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("hasChief"), SubLObjectFactory.makeString("isActorOf"), SubLObjectFactory.makeString("parentOf"), SubLObjectFactory.makeString("fundedBy"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("repeatingEvent"), SubLObjectFactory.makeString("numberOfGrupMembers"), SubLObjectFactory.makeString("eventDate"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("Organization"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("subOrganizationOf"), SubLObjectFactory.makeString("isPartOf"), SubLObjectFactory.makeString("locatedIn"), SubLObjectFactory.makeString("familyRelativeOf") });
        $list51 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Insurgent"), SubLObjectFactory.makeString("Funeral"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("PowerPlant"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("Bank"), SubLObjectFactory.makeString("HighSchool"), SubLObjectFactory.makeString("PoliticalParty"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("Synagogue"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Kidnapping"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("ResidentialBuilding"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("Embassy"), SubLObjectFactory.makeString("GovernmentalPeopleGroup"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("UnknownPerson"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("UnknownOrganization"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("cousinOf"), SubLObjectFactory.makeString("husbandOf"), SubLObjectFactory.makeString("ideologistFor"), SubLObjectFactory.makeString("cityInCountry"), SubLObjectFactory.makeString("presentAt"), SubLObjectFactory.makeString("killedAt"), SubLObjectFactory.makeString("isTargetOf"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("hasMilitant"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("victimOf"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("provinceInCountry"), SubLObjectFactory.makeString("founderOf"), SubLObjectFactory.makeString("isEventLocation"), SubLObjectFactory.makeString("isPressSecretaryFor"), SubLObjectFactory.makeString("hasFollower"), SubLObjectFactory.makeString("hasDirector"), SubLObjectFactory.makeString("hasWounded"), SubLObjectFactory.makeString("hasSpokesman"), SubLObjectFactory.makeString("organizerOf"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("capitalCityInCountry"), SubLObjectFactory.makeString("arrestedAt"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("hasChairman"), SubLObjectFactory.makeString("contactedBy"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("financedBy"), SubLObjectFactory.makeString("State"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("employeeOf"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("hasAuthor"), SubLObjectFactory.makeString("isPrimeMiniterOf"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("chiefOf"), SubLObjectFactory.makeString("hasActor"), SubLObjectFactory.makeString("childOf"), SubLObjectFactory.makeString("funderOf"), SubLObjectFactory.makeString("damage"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("name"), SubLObjectFactory.makeString("Group"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("colleagueOf"), SubLObjectFactory.makeString("hasSuborganization"), SubLObjectFactory.makeString("siblingOf"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("hasPart"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("hasLocation"), SubLObjectFactory.makeString("housemateOf"), SubLObjectFactory.makeString("familyRelativeOf"), SubLObjectFactory.makeString("friendOf"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("Organization") });
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Collection"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTY"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("BNODE"));
        $sym54$INITIALIZED_P = SubLObjectFactory.makeSymbol("INITIALIZED-P");
        $sym55$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym56$OWL_DEFINITION_NAME = SubLObjectFactory.makeSymbol("OWL-DEFINITION-NAME");
        $kw57$PROPERTY = SubLObjectFactory.makeKeyword("PROPERTY");
        $str58$_S_is_not_a_valid_definition_type = SubLObjectFactory.makeString("~S is not a valid definition type. Must be one of ~S");
        $sym59$IMPORT_OWL_ONTOLOGY = SubLObjectFactory.makeSymbol("IMPORT-OWL-ONTOLOGY");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("CYCLIST"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"));
        $kw61$URI = SubLObjectFactory.makeKeyword("URI");
        $kw62$URI_PREFIX = SubLObjectFactory.makeKeyword("URI-PREFIX");
        $kw63$CONSTANT_PREFIX = SubLObjectFactory.makeKeyword("CONSTANT-PREFIX");
        $kw64$CONSTANT_SUFFIX = SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX");
        $kw65$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $kw66$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $kw67$QUOTED_ISA = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $kw68$CYCLIST = SubLObjectFactory.makeKeyword("CYCLIST");
        $kw69$PREFIX_EXTERNAL_NAMES_ = SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?");
        $kw70$ABBREVIATE_PREFIXES_ = SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?");
        $str71$Can_only_import_OWL_ontologies_fr = SubLObjectFactory.makeString("Can only import OWL ontologies from valid files or URLs.");
        $sym72$URI_P = SubLObjectFactory.makeSymbol("URI-P");
        $kw73$FILE = SubLObjectFactory.makeKeyword("FILE");
        $kw74$URL = SubLObjectFactory.makeKeyword("URL");
        $sym75$XML_TOKENS_FROM_FILE = SubLObjectFactory.makeSymbol("XML-TOKENS-FROM-FILE");
        $kw76$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str77$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym78$WHITESPACE_STRING_ = SubLObjectFactory.makeSymbol("WHITESPACE-STRING?");
        $sym79$_XML_TOKENS_FROM_FILE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*XML-TOKENS-FROM-FILE-CACHING-STATE*");
        $int80$48 = SubLObjectFactory.makeInteger(48);
        $str81$__Importing__S_from__S_____ = SubLObjectFactory.makeString("~&Importing ~S from ~S...~%");
        $kw82$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $str83$Processing__D_class_definition__P = SubLObjectFactory.makeString("Processing ~D class definition~:P...");
        $kw84$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $str85$Processing__D_instance_definition = SubLObjectFactory.makeString("Processing ~D instance definition~:P...");
        $str86$utf_8 = SubLObjectFactory.makeString("utf-8");
        $str87$_xml = SubLObjectFactory.makeString("?xml");
        $str88$encoding = SubLObjectFactory.makeString("encoding");
        $str89$OWLImport_ = SubLObjectFactory.makeString("OWLImport-");
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImportingAnOWLFileIntoAKnowledgeBase")));
        $const91$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str92$ = SubLObjectFactory.makeString("");
        $kw93$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $const94$startingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $const95$infoTransferred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infoTransferred"));
        $const96$doneBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy"));
        $const97$endingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate"));
        $str98$Ontology = SubLObjectFactory.makeString("Ontology");
        $str99$RDF = SubLObjectFactory.makeString("RDF");
        $list100 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"));
        $list101 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str102$base = SubLObjectFactory.makeString("base");
        $str103$Can_t_recognize_alleged_base_URI_ = SubLObjectFactory.makeString("Can't recognize alleged base URI ~S as a URI.");
        $sym104$OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT = SubLObjectFactory.makeSymbol("OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT");
        $sym105$_OWL_IMPORT_PARAMETERS_ONTOLOGY_CONTEXT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*OWL-IMPORT-PARAMETERS-ONTOLOGY-CONTEXT-CACHING-STATE*");
        $const106$ContextOfPCWFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextOfPCWFn"));
        $str107$Expected_ontology_token__got__S = SubLObjectFactory.makeString("Expected ontology token, got ~S");
        $str108$Couldn_t_find_closing_Ontology_ta = SubLObjectFactory.makeString("Couldn't find closing Ontology tag.~% ~S");
        $int109$32 = SubLObjectFactory.makeInteger(32);
        $str110$comment = SubLObjectFactory.makeString("comment");
        $str111$Expecting_comment__got__S = SubLObjectFactory.makeString("Expecting comment, got ~S");
        $const112$rdfs_comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:comment"));
        $str113$label = SubLObjectFactory.makeString("label");
        $str114$lang = SubLObjectFactory.makeString("lang");
        $const115$EnglishLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $str116$Expecting_label__got__S = SubLObjectFactory.makeString("Expecting label, got ~S");
        $str117$priorVersion = SubLObjectFactory.makeString("priorVersion");
        $str118$about = SubLObjectFactory.makeString("about");
        $const119$owl_priorVersion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:priorVersion"));
        $str120$imports = SubLObjectFactory.makeString("imports");
        $str121$versionInfo = SubLObjectFactory.makeString("versionInfo");
        $str122$Don_t_know_how_to_handle_ontology = SubLObjectFactory.makeString("Don't know how to handle ontology info from ~S");
        $sym123$OWL_PRED_INFO = SubLObjectFactory.makeSymbol("OWL-PRED-INFO");
        $sym124$OWL_PRED_INFO_P = SubLObjectFactory.makeSymbol("OWL-PRED-INFO-P");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAINS"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAINS"), (SubLObject)SubLObjectFactory.makeKeyword("RANGE"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPI-CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("OPI-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("OPI-DOMAINS"), (SubLObject)SubLObjectFactory.makeSymbol("OPI-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("OPI-PLIST"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OPI-CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OPI-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OPI-DOMAINS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OPI-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OPI-PLIST"));
        $sym129$PRINT_OWL_PRED_INFO = SubLObjectFactory.makeSymbol("PRINT-OWL-PRED-INFO");
        $sym130$OWL_PRED_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("OWL-PRED-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-PRED-INFO-P"));
        $sym132$OPI_CYC_NAME = SubLObjectFactory.makeSymbol("OPI-CYC-NAME");
        $sym133$_CSETF_OPI_CYC_NAME = SubLObjectFactory.makeSymbol("_CSETF-OPI-CYC-NAME");
        $sym134$OPI_COMMENT = SubLObjectFactory.makeSymbol("OPI-COMMENT");
        $sym135$_CSETF_OPI_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-OPI-COMMENT");
        $sym136$OPI_DOMAINS = SubLObjectFactory.makeSymbol("OPI-DOMAINS");
        $sym137$_CSETF_OPI_DOMAINS = SubLObjectFactory.makeSymbol("_CSETF-OPI-DOMAINS");
        $sym138$OPI_RANGE = SubLObjectFactory.makeSymbol("OPI-RANGE");
        $sym139$_CSETF_OPI_RANGE = SubLObjectFactory.makeSymbol("_CSETF-OPI-RANGE");
        $sym140$OPI_PLIST = SubLObjectFactory.makeSymbol("OPI-PLIST");
        $sym141$_CSETF_OPI_PLIST = SubLObjectFactory.makeSymbol("_CSETF-OPI-PLIST");
        $kw142$CYC_NAME = SubLObjectFactory.makeKeyword("CYC-NAME");
        $kw143$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw144$DOMAINS = SubLObjectFactory.makeKeyword("DOMAINS");
        $kw145$RANGE = SubLObjectFactory.makeKeyword("RANGE");
        $kw146$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str147$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw148$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym149$MAKE_OWL_PRED_INFO = SubLObjectFactory.makeSymbol("MAKE-OWL-PRED-INFO");
        $kw150$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw151$END = SubLObjectFactory.makeKeyword("END");
        $sym152$VISIT_DEFSTRUCT_OBJECT_OWL_PRED_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-PRED-INFO-METHOD");
        $str153$_OWL_PRED_INFO__A_ = SubLObjectFactory.makeString("<OWL-PRED-INFO ~A>");
        $kw154$EXTERNAL_NAME = SubLObjectFactory.makeKeyword("EXTERNAL-NAME");
        $sym155$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym156$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym157$OWL_EXTERNAL_VALUE_SPECIFICATION_P = SubLObjectFactory.makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P")));
        $sym159$OWL_QUASI_TERM_P = SubLObjectFactory.makeSymbol("OWL-QUASI-TERM-P");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESTRICTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list162 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list163 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INTERSECTION-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list164 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ONE-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym165$OWL_EXTERNAL_TERM_ENUMERATION_P = SubLObjectFactory.makeSymbol("OWL-EXTERNAL-TERM-ENUMERATION-P");
        $sym166$SXHASH_OWL_PRED_INFO_METHOD = SubLObjectFactory.makeSymbol("SXHASH-OWL-PRED-INFO-METHOD");
        $sym167$OWL_IMPORT_PARAMETERS = SubLObjectFactory.makeSymbol("OWL-IMPORT-PARAMETERS");
        $sym168$OWL_IMPORT_PARAMETERS_P = SubLObjectFactory.makeSymbol("OWL-IMPORT-PARAMETERS-P");
        $list169 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ONTOLOGY"), SubLObjectFactory.makeSymbol("NAMESPACE-MAP"), SubLObjectFactory.makeSymbol("CONSTANT-PREFIX"), SubLObjectFactory.makeSymbol("CONSTANT-SUFFIX"), SubLObjectFactory.makeSymbol("BASE-URI"), SubLObjectFactory.makeSymbol("URI-PREFIX"), SubLObjectFactory.makeSymbol("CYCLIST"), SubLObjectFactory.makeSymbol("QUOTED-ISA"), SubLObjectFactory.makeSymbol("PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeSymbol("ABBREVIATE-PREFIXES?"), SubLObjectFactory.makeSymbol("IMPORT-TERM"), SubLObjectFactory.makeSymbol("ENCODING") });
        $list170 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ONTOLOGY"), SubLObjectFactory.makeKeyword("NAMESPACE-MAP"), SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), SubLObjectFactory.makeKeyword("BASE-URI"), SubLObjectFactory.makeKeyword("URI-PREFIX"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("QUOTED-ISA"), SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), SubLObjectFactory.makeKeyword("IMPORT-TERM"), SubLObjectFactory.makeKeyword("ENCODING") });
        $list171 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("OIP-ONTOLOGY"), SubLObjectFactory.makeSymbol("OIP-NAMESPACE-MAP"), SubLObjectFactory.makeSymbol("OIP-CONSTANT-PREFIX"), SubLObjectFactory.makeSymbol("OIP-CONSTANT-SUFFIX"), SubLObjectFactory.makeSymbol("OIP-BASE-URI"), SubLObjectFactory.makeSymbol("OIP-URI-PREFIX"), SubLObjectFactory.makeSymbol("OIP-CYCLIST"), SubLObjectFactory.makeSymbol("OIP-QUOTED-ISA"), SubLObjectFactory.makeSymbol("OIP-PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeSymbol("OIP-ABBREVIATE-PREFIXES?"), SubLObjectFactory.makeSymbol("OIP-IMPORT-TERM"), SubLObjectFactory.makeSymbol("OIP-ENCODING") });
        $list172 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-OIP-ONTOLOGY"), SubLObjectFactory.makeSymbol("_CSETF-OIP-NAMESPACE-MAP"), SubLObjectFactory.makeSymbol("_CSETF-OIP-CONSTANT-PREFIX"), SubLObjectFactory.makeSymbol("_CSETF-OIP-CONSTANT-SUFFIX"), SubLObjectFactory.makeSymbol("_CSETF-OIP-BASE-URI"), SubLObjectFactory.makeSymbol("_CSETF-OIP-URI-PREFIX"), SubLObjectFactory.makeSymbol("_CSETF-OIP-CYCLIST"), SubLObjectFactory.makeSymbol("_CSETF-OIP-QUOTED-ISA"), SubLObjectFactory.makeSymbol("_CSETF-OIP-PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeSymbol("_CSETF-OIP-ABBREVIATE-PREFIXES?"), SubLObjectFactory.makeSymbol("_CSETF-OIP-IMPORT-TERM"), SubLObjectFactory.makeSymbol("_CSETF-OIP-ENCODING") });
        $sym173$PRINT_OWL_IMPORT_PARAMETERS = SubLObjectFactory.makeSymbol("PRINT-OWL-IMPORT-PARAMETERS");
        $sym174$OWL_IMPORT_PARAMETERS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("OWL-IMPORT-PARAMETERS-PRINT-FUNCTION-TRAMPOLINE");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMPORT-PARAMETERS-P"));
        $sym176$OIP_ONTOLOGY = SubLObjectFactory.makeSymbol("OIP-ONTOLOGY");
        $sym177$_CSETF_OIP_ONTOLOGY = SubLObjectFactory.makeSymbol("_CSETF-OIP-ONTOLOGY");
        $sym178$OIP_NAMESPACE_MAP = SubLObjectFactory.makeSymbol("OIP-NAMESPACE-MAP");
        $sym179$_CSETF_OIP_NAMESPACE_MAP = SubLObjectFactory.makeSymbol("_CSETF-OIP-NAMESPACE-MAP");
        $sym180$OIP_CONSTANT_PREFIX = SubLObjectFactory.makeSymbol("OIP-CONSTANT-PREFIX");
        $sym181$_CSETF_OIP_CONSTANT_PREFIX = SubLObjectFactory.makeSymbol("_CSETF-OIP-CONSTANT-PREFIX");
        $sym182$OIP_CONSTANT_SUFFIX = SubLObjectFactory.makeSymbol("OIP-CONSTANT-SUFFIX");
        $sym183$_CSETF_OIP_CONSTANT_SUFFIX = SubLObjectFactory.makeSymbol("_CSETF-OIP-CONSTANT-SUFFIX");
        $sym184$OIP_BASE_URI = SubLObjectFactory.makeSymbol("OIP-BASE-URI");
        $sym185$_CSETF_OIP_BASE_URI = SubLObjectFactory.makeSymbol("_CSETF-OIP-BASE-URI");
        $sym186$OIP_URI_PREFIX = SubLObjectFactory.makeSymbol("OIP-URI-PREFIX");
        $sym187$_CSETF_OIP_URI_PREFIX = SubLObjectFactory.makeSymbol("_CSETF-OIP-URI-PREFIX");
        $sym188$OIP_CYCLIST = SubLObjectFactory.makeSymbol("OIP-CYCLIST");
        $sym189$_CSETF_OIP_CYCLIST = SubLObjectFactory.makeSymbol("_CSETF-OIP-CYCLIST");
        $sym190$OIP_QUOTED_ISA = SubLObjectFactory.makeSymbol("OIP-QUOTED-ISA");
        $sym191$_CSETF_OIP_QUOTED_ISA = SubLObjectFactory.makeSymbol("_CSETF-OIP-QUOTED-ISA");
        $sym192$OIP_PREFIX_EXTERNAL_NAMES_ = SubLObjectFactory.makeSymbol("OIP-PREFIX-EXTERNAL-NAMES?");
        $sym193$_CSETF_OIP_PREFIX_EXTERNAL_NAMES_ = SubLObjectFactory.makeSymbol("_CSETF-OIP-PREFIX-EXTERNAL-NAMES?");
        $sym194$OIP_ABBREVIATE_PREFIXES_ = SubLObjectFactory.makeSymbol("OIP-ABBREVIATE-PREFIXES?");
        $sym195$_CSETF_OIP_ABBREVIATE_PREFIXES_ = SubLObjectFactory.makeSymbol("_CSETF-OIP-ABBREVIATE-PREFIXES?");
        $sym196$OIP_IMPORT_TERM = SubLObjectFactory.makeSymbol("OIP-IMPORT-TERM");
        $sym197$_CSETF_OIP_IMPORT_TERM = SubLObjectFactory.makeSymbol("_CSETF-OIP-IMPORT-TERM");
        $sym198$OIP_ENCODING = SubLObjectFactory.makeSymbol("OIP-ENCODING");
        $sym199$_CSETF_OIP_ENCODING = SubLObjectFactory.makeSymbol("_CSETF-OIP-ENCODING");
        $kw200$NAMESPACE_MAP = SubLObjectFactory.makeKeyword("NAMESPACE-MAP");
        $kw201$BASE_URI = SubLObjectFactory.makeKeyword("BASE-URI");
        $kw202$IMPORT_TERM = SubLObjectFactory.makeKeyword("IMPORT-TERM");
        $kw203$ENCODING = SubLObjectFactory.makeKeyword("ENCODING");
        $sym204$MAKE_OWL_IMPORT_PARAMETERS = SubLObjectFactory.makeSymbol("MAKE-OWL-IMPORT-PARAMETERS");
        $sym205$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORT_PARAMETERS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-IMPORT-PARAMETERS-METHOD");
        $str206$_OWL_IMPORT_PARAMETERS__S_ = SubLObjectFactory.makeString("<OWL-IMPORT-PARAMETERS ~S>");
        $sym207$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $sym208$CYCLIST_ = SubLObjectFactory.makeSymbol("CYCLIST?");
        $const209$SoftwareVersionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SoftwareVersionFn"));
        $const210$OWLImporter_Cyc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLImporter-Cyc"));
        $const211$UserOfProgramFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UserOfProgramFn"));
        $str212$Multiple_uris_for__S_____S____S = SubLObjectFactory.makeString("Multiple uris for ~S:~% ~S~% ~S");
        $sym213$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym214$SXHASH_OWL_IMPORT_PARAMETERS_METHOD = SubLObjectFactory.makeSymbol("SXHASH-OWL-IMPORT-PARAMETERS-METHOD");
        $str215$resource = SubLObjectFactory.makeString("resource");
        $str216$_ = SubLObjectFactory.makeString("#");
        $str217$interpretation_of_ = SubLObjectFactory.makeString("interpretation of ");
        $str218$_as_a_URI_for_an_imported_ontolog = SubLObjectFactory.makeString(" as a URI for an imported ontology.");
        $list219 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STRING"));
        $list220 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE-NAME"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("VALUE"));
        $str221$Namespace_problem___A = SubLObjectFactory.makeString("Namespace problem: ~A");
        $str222$xmlns = SubLObjectFactory.makeString("xmlns");
        $list223 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dc"), (SubLObject)SubLObjectFactory.makeString("http://purl.org/dc/elements/1.1/")));
        $str224$_is_bound_to_ = SubLObjectFactory.makeString(" is bound to ");
        $str225$_ = SubLObjectFactory.makeString(".");
        $str226$_Must_be_one_of_ = SubLObjectFactory.makeString(" Must be one of ");
        $str227$No_import_statement_for_ = SubLObjectFactory.makeString("No import statement for ");
        $sym228$FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI");
        $sym229$_ONTOLOGY = SubLObjectFactory.makeSymbol("?ONTOLOGY");
        $const230$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list231 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ONTOLOGY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:Ontology")));
        $const232$salientURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientURI"));
        $kw233$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw234$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw235$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)owl_to_cycl.ONE_INTEGER);
        $str237$__ = SubLObjectFactory.makeString("~&");
        $str238$Couldn_t_find_ontology_for__S__Cr = SubLObjectFactory.makeString("Couldn't find ontology for ~S. Creating a new one.");
        $str239$__ = SubLObjectFactory.makeString("~%");
        $const240$OWLOntologyFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLOntologyFn"));
        $sym241$_FIND_OR_CREATE_OWL_ONTOLOGY_FOR_URI_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI-CACHING-STATE*");
        $sym242$_TERM_TYPE = SubLObjectFactory.makeSymbol("?TERM-TYPE");
        $const243$termTypeForOntology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTypeForOntology"));
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TERM-TYPE"));
        $const245$TermFromOntologyFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermFromOntologyFn"));
        $kw246$CLOSE = SubLObjectFactory.makeKeyword("CLOSE");
        $str247$There_is_no_range_for__S__Name_to = SubLObjectFactory.makeString("There is no range for ~S~%Name token: ~S");
        $sym248$OWL_PROPERTY_ELEMENT_NAMES = SubLObjectFactory.makeSymbol("OWL-PROPERTY-ELEMENT-NAMES");
        $str249$DatatypeProperty = SubLObjectFactory.makeString("DatatypeProperty");
        $str250$AnnotationProperty = SubLObjectFactory.makeString("AnnotationProperty");
        $str251$ObjectProperty = SubLObjectFactory.makeString("ObjectProperty");
        $str252$FunctionalProperty = SubLObjectFactory.makeString("FunctionalProperty");
        $str253$SymmetricProperty = SubLObjectFactory.makeString("SymmetricProperty");
        $str254$TransitiveProperty = SubLObjectFactory.makeString("TransitiveProperty");
        $sym255$_OWL_PROPERTY_ELEMENT_NAMES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*OWL-PROPERTY-ELEMENT-NAMES-CACHING-STATE*");
        $str256$____ = SubLObjectFactory.makeString("<!--");
        $str257$___ = SubLObjectFactory.makeString("-->");
        $str258$Couldn_t_find_end_of_HTML_comment = SubLObjectFactory.makeString("Couldn't find end of HTML comment: ~S");
        $str259$Skipping_comment___S = SubLObjectFactory.makeString("Skipping comment: ~S");
        $kw260$ISAS = SubLObjectFactory.makeKeyword("ISAS");
        $kw261$NEXT_NON_WHITESPACE_TOKEN = SubLObjectFactory.makeKeyword("NEXT-NON-WHITESPACE-TOKEN");
        $str262$type = SubLObjectFactory.makeString("type");
        $str263$Can_t_interpret_empty_label_token = SubLObjectFactory.makeString("Can't interpret empty label token ~S");
        $str264$Can_t_decode_language_abbreviatio = SubLObjectFactory.makeString("Can't decode language abbreviation ~S");
        $kw265$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $str266$domain = SubLObjectFactory.makeString("domain");
        $str267$Couldn_t_identify_domain_from__S = SubLObjectFactory.makeString("Couldn't identify domain from ~S");
        $str268$inverseOf = SubLObjectFactory.makeString("inverseOf");
        $str269$__ = SubLObjectFactory.makeString("/>");
        $str270$_S_is_its_own_inverse__so_it_s_sy = SubLObjectFactory.makeString("~S is its own inverse, so it's symmetric.");
        $kw271$SYMMETRIC_ = SubLObjectFactory.makeKeyword("SYMMETRIC?");
        $kw272$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $str273$subPropertyOf = SubLObjectFactory.makeString("subPropertyOf");
        $str274$Noting_genl_property__S_of__S = SubLObjectFactory.makeString("Noting genl property ~S of ~S");
        $kw275$GENL_PROPERTY = SubLObjectFactory.makeKeyword("GENL-PROPERTY");
        $str276$equivalentProperty = SubLObjectFactory.makeString("equivalentProperty");
        $str277$Noting_equivalent_property__S_of_ = SubLObjectFactory.makeString("Noting equivalent property ~S of ~S");
        $kw278$EQUIVALENT_PROPERTIES = SubLObjectFactory.makeKeyword("EQUIVALENT-PROPERTIES");
        $str279$range = SubLObjectFactory.makeString("range");
        $str280$Couldn_t_identify_range_from__S = SubLObjectFactory.makeString("Couldn't identify range from ~S");
        $str281$guid = SubLObjectFactory.makeString("guid");
        $str282$string = SubLObjectFactory.makeString("string");
        $str283$__Noting_Cyc_guid_for__S_S__ = SubLObjectFactory.makeString("~&Noting Cyc guid for ~S~S~%");
        $kw284$GUID = SubLObjectFactory.makeKeyword("GUID");
        $str285$externalID = SubLObjectFactory.makeString("externalID");
        $str286$__Noting_Cyc_externalID_for__S_S_ = SubLObjectFactory.makeString("~&Noting Cyc externalID for ~S~S~%");
        $kw287$EXTERNALID = SubLObjectFactory.makeKeyword("EXTERNALID");
        $str288$datatype = SubLObjectFactory.makeString("datatype");
        $str289$isa = SubLObjectFactory.makeString("isa");
        $str290$__Noting__isa__S__S___ = SubLObjectFactory.makeString("~&Noting (isa ~S ~S)~%");
        $str291$__Noting__S__S__ = SubLObjectFactory.makeString("~&Noting ~S ~S~%");
        $kw292$MY_PRED_VALUES = SubLObjectFactory.makeKeyword("MY-PRED-VALUES");
        $str293$Ignoring_unrecognized_token___S = SubLObjectFactory.makeString("Ignoring unrecognized token: ~S");
        $str294$cyc_com = SubLObjectFactory.makeString("cyc.com");
        $str295$Don_t_know_how_to_interpret_attri = SubLObjectFactory.makeString("Don't know how to interpret attribute value ~S");
        $kw296$NONLOCAL = SubLObjectFactory.makeKeyword("NONLOCAL");
        $str297$Processing__D_property_definition = SubLObjectFactory.makeString("Processing ~D property definition~:P...");
        $str298$cdolist = SubLObjectFactory.makeString("cdolist");
        $str299$DataRange = SubLObjectFactory.makeString("DataRange");
        $str300$oneOf = SubLObjectFactory.makeString("oneOf");
        $str301$Can_t_read_range_starting_with__S = SubLObjectFactory.makeString("Can't read range starting with ~S");
        $str302$__rdfs_range_ = SubLObjectFactory.makeString("</rdfs:range>");
        $str303$Finished_range__S_ = SubLObjectFactory.makeString("Finished range ~S.");
        $sym304$OWL_CLASS_ELEMENT_NAMES = SubLObjectFactory.makeSymbol("OWL-CLASS-ELEMENT-NAMES");
        $str305$Class = SubLObjectFactory.makeString("Class");
        $str306$DeprecatedClass = SubLObjectFactory.makeString("DeprecatedClass");
        $sym307$_OWL_CLASS_ELEMENT_NAMES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*OWL-CLASS-ELEMENT-NAMES-CACHING-STATE*");
        $sym308$OWL_CLASS_TOKEN_P = SubLObjectFactory.makeSymbol("OWL-CLASS-TOKEN-P");
        $str309$Reading_OWL_class_starting_with__ = SubLObjectFactory.makeString("Reading OWL class starting with~% ~S");
        $str310$nodeID = SubLObjectFactory.makeString("nodeID");
        $list311 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("BNODE"));
        $sym312$OWL_TERM_INFO_P = SubLObjectFactory.makeSymbol("OWL-TERM-INFO-P");
        $str313$Starting_token___S = SubLObjectFactory.makeString("Starting token: ~S");
        $str314$No_progress_reading_OWL_class__St = SubLObjectFactory.makeString("No progress reading OWL class: Stuck on ~A.");
        $str315$Description = SubLObjectFactory.makeString("Description");
        $str316$Restriction = SubLObjectFactory.makeString("Restriction");
        $str317$Reading_restriction_starting_with = SubLObjectFactory.makeString("Reading restriction starting with ~S");
        $str318$unionOf = SubLObjectFactory.makeString("unionOf");
        $str319$Don_t_know_what_to_do_with_this_t = SubLObjectFactory.makeString("Don't know what to do with this token while reading OWL class:~% ~S~%");
        $kw320$NODE_ID = SubLObjectFactory.makeKeyword("NODE-ID");
        $str321$Found_class___S___Components___S = SubLObjectFactory.makeString("Found class: ~S~% Components: ~S");
        $kw322$COMPLEMENT_CLASS = SubLObjectFactory.makeKeyword("COMPLEMENT-CLASS");
        $kw323$COMPLEMENT_OF = SubLObjectFactory.makeKeyword("COMPLEMENT-OF");
        $kw324$INTERSECTION_OF = SubLObjectFactory.makeKeyword("INTERSECTION-OF");
        $str325$Don_t_know_what_this_class_is_nam = SubLObjectFactory.makeString("Don't know what this class is named:~% ~S");
        $str326$Can_t_read_an_enumeration_that_is = SubLObjectFactory.makeString("Can't read an enumeration that isn't a oneOf range:~% ~S");
        $str327$rest = SubLObjectFactory.makeString("rest");
        $str328$first = SubLObjectFactory.makeString("first");
        $str329$Couldn_t_get_name_from__S = SubLObjectFactory.makeString("Couldn't get name from ~S");
        $str330$Read_enumeration___S = SubLObjectFactory.makeString("Read enumeration: ~S");
        $kw331$ONE_OF = SubLObjectFactory.makeKeyword("ONE-OF");
        $str332$http___www_w3_org_1999_02_22_rdf_ = SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil");
        $str333$parseType = SubLObjectFactory.makeString("parseType");
        $str334$Collection = SubLObjectFactory.makeString("Collection");
        $str335$Found_non_first__non_rest_token_i = SubLObjectFactory.makeString("Found non-first, non-rest token in OWL list:~% ~S");
        $str336$__Next_item___S__ = SubLObjectFactory.makeString("~&Next item: ~S~%");
        $kw337$UNION = SubLObjectFactory.makeKeyword("UNION");
        $str338$ID = SubLObjectFactory.makeString("ID");
        $str339$Got_null_arg_isa_name_in__S = SubLObjectFactory.makeString("Got null arg-isa name in ~S");
        $sym340$XML_SCHEMA_CLASS_URIS = SubLObjectFactory.makeSymbol("XML-SCHEMA-CLASS-URIS");
        $list341 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?LOCAL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"));
        $list342 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlURI")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLFn")), (SubLObject)SubLObjectFactory.makeSymbol("?URI"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?URI"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/XMLSchema#"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCAL-NAME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlDataTypeSemanticCorrelation")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL")));
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $sym344$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym345$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $list346 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONLOCAL"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str347$__Found_term_by_guid___S = SubLObjectFactory.makeString("~&Found term by guid: ~S");
        $str348$__Found_term_by_externalID___S = SubLObjectFactory.makeString("~&Found term by externalID: ~S");
        $const349$owl_Class = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:Class"));
        $sym350$_URI = SubLObjectFactory.makeSymbol("?URI");
        $const351$standardPrefixForURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardPrefixForURI"));
        $list352 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("EL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)owl_to_cycl.ONE_INTEGER);
        $list353 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-ARG")));
        $sym354$STRING_ARG = SubLObjectFactory.makeSymbol("STRING-ARG");
        $sym355$OWL_FIND_OR_CREATE_TERM_OF_TYPE = SubLObjectFactory.makeSymbol("OWL-FIND-OR-CREATE-TERM-OF-TYPE");
        $str356$Couldn_t_find_URI_for_namespace__ = SubLObjectFactory.makeString("Couldn't find URI for namespace ~S");
        $str357$Can_t_find_or_create_term_of_type = SubLObjectFactory.makeString("Can't find or create term of type ~S from ~S");
        $sym358$CONTROL_CHAR_P = SubLObjectFactory.makeSymbol("CONTROL-CHAR-P");
        $str359$external_name_appears_to_contain_ = SubLObjectFactory.makeString("external-name appears to contain a control character: ~S");
        $str360$external_name_appears_to_contain_ = SubLObjectFactory.makeString("external-name appears to contain prefix: ~S");
        $const361$OWLClass = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLClass"));
        $sym362$OWL_FIND_OR_CREATE_TERM_OF_TYPE_IN_ONTOLOGY = SubLObjectFactory.makeSymbol("OWL-FIND-OR-CREATE-TERM-OF-TYPE-IN-ONTOLOGY");
        $const363$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const364$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const365$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $str366$_ = SubLObjectFactory.makeString(":");
        $list367 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLOntologyFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")));
        $sym368$ARG1 = SubLObjectFactory.makeSymbol("ARG1");
        $const369$owlDefiningOntologyURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owlDefiningOntologyURI"));
        $list370 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?URI"));
        $list371 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $sym372$TRY_TO_ABBREVIATE_OWL_URI = SubLObjectFactory.makeSymbol("TRY-TO-ABBREVIATE-OWL-URI");
        $str373$_cyc_top_transcripts_0953_jonny2_ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-62-sent.ts");
        $str374$_cyc_top_transcripts_0953_vela_20 = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/vela-20080414111900-21395-local-2-sent.ts");
        $str375$_cyc_top_transcripts_0953_vela_20 = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/vela-20080416102200-16797-local-0-sent.ts");
        $str376$_cyc_top_transcripts_0953_jonny2_ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-64-sent.ts");
        $str377$_cyc_top_transcripts_0953_jonny2_ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-68-sent.ts");
        $str378$_cyc_top_transcripts_0953_jonny2_ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-69-sent.ts");
        $str379$_cyc_top_transcripts_0953_jonny2_ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-94-sent.ts");
        $kw380$X = SubLObjectFactory.makeKeyword("X");
        $const381$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const382$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS"));
        $const383$URIFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn"));
        $list384 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)owl_to_cycl.ONE_INTEGER);
        $sym385$CYCL_TERM_OR_OWL_QUASI_TERM_P = SubLObjectFactory.makeSymbol("CYCL-TERM-OR-OWL-QUASI-TERM-P");
        $const386$CollectionUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $const387$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const388$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const389$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $const390$SingletonCollectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingletonCollectionFn"));
        $const391$TheCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollection"));
        $list392 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("externalID"), (SubLObject)SubLObjectFactory.makeString("guid"), (SubLObject)SubLObjectFactory.makeString("nonAtomicFormula"), (SubLObject)SubLObjectFactory.makeString("literalValue"), (SubLObject)SubLObjectFactory.makeString("isa"));
        $const393$OWLProperty = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OWLProperty"));
        $sym394$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $str395$Potentially_adding_assertions_to_ = SubLObjectFactory.makeString("Potentially adding assertions to existing predicate ~S");
        $const396$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str397$__Creating_predicate_from__S__ = SubLObjectFactory.makeString("~&Creating predicate from ~S~%");
        $str398$Failed_to_find_or_create_a_predic = SubLObjectFactory.makeString("Failed to find or create a predicate with name: ~S~%");
        $const399$owl_SymmetricProperty = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:SymmetricProperty"));
        $list400 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URI"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $const401$rdfs_domain = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:domain"));
        $list402 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $const403$rdfs_range = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:range"));
        $str404$Asserting_genl_property__S_of__S = SubLObjectFactory.makeString("Asserting genl property ~S of ~S");
        $const405$rdfs_subPropertyOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:subPropertyOf"));
        $str406$Asserting_spec_property__S_of__S = SubLObjectFactory.makeString("Asserting spec property ~S of ~S");
        $const407$InverseBinaryPredicateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InverseBinaryPredicateFn"));
        $str408$Asserting_inverse__S_of__S = SubLObjectFactory.makeString("Asserting inverse ~S of ~S");
        $str409$Asserting_equivalent_property__S_ = SubLObjectFactory.makeString("Asserting equivalent-property ~S of ~S");
        $str410$Couldn_t_find_equivalent_property = SubLObjectFactory.makeString("Couldn't find equivalent property ~S");
        $const411$owl_equivalentProperty = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:equivalentProperty"));
        $list412 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str413$__Asserting__S__ = SubLObjectFactory.makeString("~&Asserting ~S~%");
        $const414$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym415$INVALID_FORT_ = SubLObjectFactory.makeSymbol("INVALID-FORT?");
        $sym416$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $str417$Couldn_t_find__S = SubLObjectFactory.makeString("Couldn't find ~S");
        $sym418$_OWL_OE_QUEUES_ = SubLObjectFactory.makeSymbol("*OWL-OE-QUEUES*");
        $sym419$_OWL_OE_DAEMON_ = SubLObjectFactory.makeSymbol("*OWL-OE-DAEMON*");
        $sym420$_OWL_NODE_ID_INDEX_ = SubLObjectFactory.makeSymbol("*OWL-NODE-ID-INDEX*");
        $str421$Circular_node_id_reference___S___ = SubLObjectFactory.makeString("Circular node id reference: ~S -> ~S");
        $kw422$UNRESOLVED = SubLObjectFactory.makeKeyword("UNRESOLVED");
        $str423$Postponing__isa__S__S__because__S = SubLObjectFactory.makeString("Postponing (isa ~S ~S) because ~S is not (yet) known to be a collection.");
        $list424 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")));
        $sym425$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $str426$_ = SubLObjectFactory.makeString("-");
        $kw427$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $str428$OWL_OE_Daemon = SubLObjectFactory.makeString("OWL OE Daemon");
        $sym429$OWL_OE_DAEMON_RUN = SubLObjectFactory.makeSymbol("OWL-OE-DAEMON-RUN");
        $sym430$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $str431$Waiting_for__D_enqueued_operation = SubLObjectFactory.makeString("Waiting for ~D enqueued operation~:P to be processed...");
        $float432$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str433$__Finished_pass_through_queue__Si = SubLObjectFactory.makeString("~&Finished pass through queue. Size (including markers) is now ~D. Going around again...~%");
        $str434$__OE_queue_is_empty__Zzz___ = SubLObjectFactory.makeString("~&OE queue is empty. Zzz.~%");
        $str435$Unable_to_perform__D_operation__P = SubLObjectFactory.makeString("Unable to perform ~D operation~:P:~% ~S~%");
        $str436$__Can_t_do_anything_with_queue_no = SubLObjectFactory.makeString("~&Can't do anything with queue now. Awaiting further operations. Zzz.~%");
        $list437 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str438$__Noting_OE_performed___S__ = SubLObjectFactory.makeString("~&Noting OE performed: ~S~%");
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUASI-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("IMPORT-PARAMETERS"));
        $str440$__Failed_to_resolve__S__ = SubLObjectFactory.makeString("~&Failed to resolve ~S~%");
        $sym441$RESOLVE_OWL_QUASI_TERM = SubLObjectFactory.makeSymbol("RESOLVE-OWL-QUASI-TERM");
        $str442$Problem_performing__S = SubLObjectFactory.makeString("Problem performing ~S");
        $kw443$OWL_QUASI_TERM = SubLObjectFactory.makeKeyword("OWL-QUASI-TERM");
        $kw444$FIND = SubLObjectFactory.makeKeyword("FIND");
        $str445$_S_is_not_an_OWL_node_ID_ = SubLObjectFactory.makeString("~S is not an OWL node ID.");
        $list446 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OWL-QUASI-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list447 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeSymbol("IMPORT-PARAMETERS"));
        $sym448$NOTE_FOUND_TERM_RESOLUTION = SubLObjectFactory.makeSymbol("NOTE-FOUND-TERM-RESOLUTION");
        $str449$__Resolved__S___to__S__ = SubLObjectFactory.makeString("~&Resolved ~S~% to ~S~%");
        $sym450$_NOTE_FOUND_TERM_RESOLUTION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NOTE-FOUND-TERM-RESOLUTION-CACHING-STATE*");
        $sym451$OWL_ASSERT = SubLObjectFactory.makeSymbol("OWL-ASSERT");
        $sym452$NON_ASCII_STRING_P = SubLObjectFactory.makeSymbol("NON-ASCII-STRING-P");
        $sym453$NON_ASCII_STRING_TO_UNICODE = SubLObjectFactory.makeSymbol("NON-ASCII-STRING-TO-UNICODE");
        $str454$Already_know__S___in__S = SubLObjectFactory.makeString("Already know ~S~% in ~S");
        $str455$Failed_to_assert__S__ = SubLObjectFactory.makeString("Failed to assert ~S~%");
        $str456$Processing_term_definitions___ = SubLObjectFactory.makeString("Processing term definitions...");
        $str457$Anonymous_ = SubLObjectFactory.makeString("Anonymous-");
        $str458$__Creating__S_____ = SubLObjectFactory.makeString("~&Creating ~S...~%");
        $str459$Potentially_adding_assertions_to_ = SubLObjectFactory.makeString("Potentially adding assertions to existing term ~S");
        $str460$__Defining_term_from__S__ = SubLObjectFactory.makeString("~&Defining term from ~S~%");
        $str461$Failed_to_find_or_create_a_term_w = SubLObjectFactory.makeString("Failed to find or create a term with name: ~S~%");
        $kw462$EQUIVALENT_CLASSES = SubLObjectFactory.makeKeyword("EQUIVALENT-CLASSES");
        $kw463$UNION_OF = SubLObjectFactory.makeKeyword("UNION-OF");
        $str464$Thing = SubLObjectFactory.makeString("Thing");
        $const465$owl_Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:Thing"));
        $str466$Asserting_genl_class__S_of__S = SubLObjectFactory.makeString("Asserting genl class ~S of ~S");
        $const467$rdfs_subClassOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"));
        $list468 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $str469$Asserting_disjoint_class__S_of__S = SubLObjectFactory.makeString("Asserting disjoint class ~S of ~S");
        $const470$owl_disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:disjointWith"));
        $str471$Don_t_know_how_to_handle_supercla = SubLObjectFactory.makeString("Don't know how to handle superclass ~S");
        $str472$Asserting_disjoint___S_and__S = SubLObjectFactory.makeString("Asserting disjoint: ~S and ~S");
        $str473$Don_t_know_how_to_handle_disjoint = SubLObjectFactory.makeString("Don't know how to handle disjoint class ~S");
        $str474$Asserting_union__S_of__S = SubLObjectFactory.makeString("Asserting union ~S of ~S");
        $const475$collectionUnion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionUnion"));
        $str476$Asserting_intersection__S_of__S = SubLObjectFactory.makeString("Asserting intersection ~S of ~S");
        $const477$collectionIntersection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionIntersection"));
        $kw478$ENUMERATED_INSTANCES = SubLObjectFactory.makeKeyword("ENUMERATED-INSTANCES");
        $str479$Asserting_enumeration__S_of__S = SubLObjectFactory.makeString("Asserting enumeration ~S of ~S");
        $const480$completelyAssertedCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completelyAssertedCollection"));
        $str481$Can_t_handle__S__value___S_ = SubLObjectFactory.makeString("Can't handle ~S (value: ~S)");
        $list482 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("LANGUAGE"));
        $sym483$_LEXICON = SubLObjectFactory.makeSymbol("?LEXICON");
        $const484$languageHasRootLexicon = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageHasRootLexicon"));
        $list485 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEXICON"));
        $list486 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)owl_to_cycl.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $const487$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $const488$rdfs_label = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfs:label"));
        $str489$Asserting_equivalent_class__S_of_ = SubLObjectFactory.makeString("Asserting equivalent class ~S of ~S");
        $const490$owl_equivalentClass = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"));
        $str491$Failed_to_assert_equivalent_class = SubLObjectFactory.makeString("Failed to assert equivalent class ~S of ~S");
        $list492 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $str493$Resolved_nonlocal_reference__S___ = SubLObjectFactory.makeString("Resolved nonlocal reference ~S~% to ~S");
        $str494$Node_ID_as_restriction_target___S = SubLObjectFactory.makeString("Node ID as restriction target: ~S");
        $str495$Can_t_handle__S_restrictions_with = SubLObjectFactory.makeString("Can't handle ~S restrictions with value ~S.");
        $str496$allValuesFrom = SubLObjectFactory.makeString("allValuesFrom");
        $const497$relationAllOnly = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllOnly"));
        $str498$someValuesFrom = SubLObjectFactory.makeString("someValuesFrom");
        $const499$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $str500$hasValue = SubLObjectFactory.makeString("hasValue");
        $const501$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $str502$minCardinality = SubLObjectFactory.makeString("minCardinality");
        $const503$requiredArg1Pred = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred"));
        $str504$cardinality = SubLObjectFactory.makeString("cardinality");
        $const505$relationAllExistsCount = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount"));
        $const506$relationAllExistsMin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin"));
        $str507$maxCardinality = SubLObjectFactory.makeString("maxCardinality");
        $const508$relationAllExistsMax = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMax"));
        $list509 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceOnly")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $list510 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $list511 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $list512 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $list513 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMax")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $list514 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMin")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $kw515$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw516$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw517$GENL = SubLObjectFactory.makeKeyword("GENL");
        $str518$Can_t_create_collection_from__S_r = SubLObjectFactory.makeString("Can't create collection from ~S restrictions with value ~S.");
        $sym519$FIND_OR_CREATE_OWL_CLASS_FROM_RESTRICTION = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-OWL-CLASS-FROM-RESTRICTION");
        $str520$Created__S_from__S = SubLObjectFactory.makeString("Created ~S from ~S");
        $str521$__Asserting__S = SubLObjectFactory.makeString("~&Asserting ~S");
        $sym522$NODE_ID_SPECIFICATION_P = SubLObjectFactory.makeSymbol("NODE-ID-SPECIFICATION-P");
        $str523$Nested_calls_resolving__S = SubLObjectFactory.makeString("Nested calls resolving ~S");
        $list524 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-EXTERNAL-VALUE-SPECIFICATION-P")));
        $const525$CollectionDifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn"));
        $sym526$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $str527$Can_t_find_or_create__S_term_from = SubLObjectFactory.makeString("Can't find or create ~S term from ~S");
        $sym528$OWL_RESTRICTION_P = SubLObjectFactory.makeSymbol("OWL-RESTRICTION-P");
        $str529$__Trying_to_resolve__S__ = SubLObjectFactory.makeString("~&Trying to resolve ~S~%");
        $str530$__Result___S__ = SubLObjectFactory.makeString("~&Result: ~S~%");
        $str531$Trying_to_create_term_from__S = SubLObjectFactory.makeString("Trying to create term from ~S");
        $sym532$OWL_TERM_INFO = SubLObjectFactory.makeSymbol("OWL-TERM-INFO");
        $list533 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERCLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("DISJOINT-CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list534 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("SUPERCLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("DISJOINT-CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list535 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTI-CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("OTI-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("OTI-SUPERCLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("OTI-DISJOINT-CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("OTI-PLIST"));
        $list536 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OTI-CYC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OTI-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OTI-SUPERCLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OTI-DISJOINT-CLASSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OTI-PLIST"));
        $sym537$PRINT_OWL_TERM_INFO = SubLObjectFactory.makeSymbol("PRINT-OWL-TERM-INFO");
        $sym538$OWL_TERM_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("OWL-TERM-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list539 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-TERM-INFO-P"));
        $sym540$OTI_CYC_NAME = SubLObjectFactory.makeSymbol("OTI-CYC-NAME");
        $sym541$_CSETF_OTI_CYC_NAME = SubLObjectFactory.makeSymbol("_CSETF-OTI-CYC-NAME");
        $sym542$OTI_COMMENT = SubLObjectFactory.makeSymbol("OTI-COMMENT");
        $sym543$_CSETF_OTI_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-OTI-COMMENT");
        $sym544$OTI_SUPERCLASSES = SubLObjectFactory.makeSymbol("OTI-SUPERCLASSES");
        $sym545$_CSETF_OTI_SUPERCLASSES = SubLObjectFactory.makeSymbol("_CSETF-OTI-SUPERCLASSES");
        $sym546$OTI_DISJOINT_CLASSES = SubLObjectFactory.makeSymbol("OTI-DISJOINT-CLASSES");
        $sym547$_CSETF_OTI_DISJOINT_CLASSES = SubLObjectFactory.makeSymbol("_CSETF-OTI-DISJOINT-CLASSES");
        $sym548$OTI_PLIST = SubLObjectFactory.makeSymbol("OTI-PLIST");
        $sym549$_CSETF_OTI_PLIST = SubLObjectFactory.makeSymbol("_CSETF-OTI-PLIST");
        $kw550$SUPERCLASSES = SubLObjectFactory.makeKeyword("SUPERCLASSES");
        $kw551$DISJOINT_CLASSES = SubLObjectFactory.makeKeyword("DISJOINT-CLASSES");
        $sym552$MAKE_OWL_TERM_INFO = SubLObjectFactory.makeSymbol("MAKE-OWL-TERM-INFO");
        $sym553$VISIT_DEFSTRUCT_OBJECT_OWL_TERM_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-TERM-INFO-METHOD");
        $str554$_OWL_TERM_INFO__A_ = SubLObjectFactory.makeString("<OWL-TERM-INFO ~A>");
        $list555 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"));
        $str556$Don_t_know_about__S = SubLObjectFactory.makeString("Don't know about ~S");
        $sym557$SXHASH_OWL_TERM_INFO_METHOD = SubLObjectFactory.makeSymbol("SXHASH-OWL-TERM-INFO-METHOD");
        $kw558$BNODE = SubLObjectFactory.makeKeyword("BNODE");
        $str559$__Reading_Description___S__ = SubLObjectFactory.makeString("~&Reading Description: ~S~%");
        $str560$Skipping_rdf_Description_element_ = SubLObjectFactory.makeString("Skipping rdf:Description element.");
        $str561$__Reading_Restriction___S__ = SubLObjectFactory.makeString("~&Reading Restriction: ~S~%");
        $str562$Skipping_owl_Restriction_element_ = SubLObjectFactory.makeString("Skipping owl:Restriction element.");
        $str563$Reading_top_level_named_class__S = SubLObjectFactory.makeString("Reading top-level named class ~S");
        $str564$Failed_or_declined_to_read_a_clas = SubLObjectFactory.makeString("Failed or declined to read a class.");
        $str565$There_are_no_superclasses_for__S = SubLObjectFactory.makeString("There are no superclasses for ~S");
        $str566$Finished__S____Superclasses___S__ = SubLObjectFactory.makeString("Finished ~S.~% Superclasses: ~S.~% Disjoint classes: ~S.~% Isas: ~S.");
        $str567$Skipping_HTML_comment___S = SubLObjectFactory.makeString("Skipping HTML comment: ~S");
        $str568$Reading_definition_of__S = SubLObjectFactory.makeString("Reading definition of ~S");
        $str569$Skipping__S_to_close_tag = SubLObjectFactory.makeString("Skipping ~S to close tag");
        $str570$Failed_or_declined_to_read_an_ins = SubLObjectFactory.makeString("Failed or declined to read an instance.");
        $str571$Finished__S_ = SubLObjectFactory.makeString("Finished ~S.");
        $str572$__Defining__S_as_an_instance_of__ = SubLObjectFactory.makeString("~&Defining ~S as an instance of ~S~%");
        $str573$AllDifferent = SubLObjectFactory.makeString("AllDifferent");
        $str574$Skipping__S = SubLObjectFactory.makeString("Skipping ~S");
        $str575$Skipping_locally_defined__S_to_cl = SubLObjectFactory.makeString("Skipping locally-defined ~S to close tag");
        $str576$subClassOf = SubLObjectFactory.makeString("subClassOf");
        $str577$Read_superclass___S = SubLObjectFactory.makeString("Read superclass: ~S");
        $str578$disjointWith = SubLObjectFactory.makeString("disjointWith");
        $str579$equivalentClass = SubLObjectFactory.makeString("equivalentClass");
        $str580$owlEquivalentClass = SubLObjectFactory.makeString("owlEquivalentClass");
        $str581$complementOf = SubLObjectFactory.makeString("complementOf");
        $str582$intersectionOf = SubLObjectFactory.makeString("intersectionOf");
        $str583$Read_one_intersection_element___S = SubLObjectFactory.makeString("Read one intersection element: ~S");
        $str584$Intersection___S = SubLObjectFactory.makeString("Intersection: ~S");
        $str585$Read_one_union_element___S = SubLObjectFactory.makeString("Read one union element: ~S");
        $str586$Union___S = SubLObjectFactory.makeString("Union: ~S");
        $str587$Read_enumerated_instances___S = SubLObjectFactory.makeString("Read enumerated instances: ~S");
        $str588$Couldn_t_determine_value_from__S_ = SubLObjectFactory.makeString("Couldn't determine value from ~S~% ~S");
        $str589$Apparently_anonymous_instance___S = SubLObjectFactory.makeString("Apparently anonymous instance: ~S");
        $list590 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONLOCAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("URI-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $str591$Finding_or_creating_nonlocal_term = SubLObjectFactory.makeString("Finding or creating nonlocal term...");
        $str592$Result___S = SubLObjectFactory.makeString("Result: ~S");
        $str593$Reading_OWL_class_or_restriction_ = SubLObjectFactory.makeString("Reading OWL class or restriction starting with~% ~S");
        $kw594$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $str595$Can_t_read_class_starting_with__S = SubLObjectFactory.makeString("Can't read class starting with ~S");
        $str596$_S___is_not_the_start_of_an_OWL_r = SubLObjectFactory.makeString("~S~% is not the start of an OWL restriction declaration.");
        $kw597$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
        $kw598$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str599$Read_restriction___S__S__S__S = SubLObjectFactory.makeString("Read restriction: ~S ~S ~S ~S");
        $str600$onProperty = SubLObjectFactory.makeString("onProperty");
        $str601$Reading_restriction_property___ = SubLObjectFactory.makeString("Reading restriction property...");
        $kw602$READING_PROPERTY = SubLObjectFactory.makeKeyword("READING-PROPERTY");
        $str603$onClass = SubLObjectFactory.makeString("onClass");
        $str604$Reading_restriction_class___ = SubLObjectFactory.makeString("Reading restriction class...");
        $kw605$READING_CLASS = SubLObjectFactory.makeKeyword("READING-CLASS");
        $str606$Read_restriction_property__S = SubLObjectFactory.makeString("Read restriction property ~S");
        $kw607$READ_PROPERTY = SubLObjectFactory.makeKeyword("READ-PROPERTY");
        $str608$Read_restriction_class__S = SubLObjectFactory.makeString("Read restriction class ~S");
        $kw609$READ_CLASS = SubLObjectFactory.makeKeyword("READ-CLASS");
        $str610$Got_onProperty_close_tag_when_we_ = SubLObjectFactory.makeString("Got onProperty close tag when we weren't reading a property.");
        $str611$Failed_to_read_property_ = SubLObjectFactory.makeString("Failed to read property.");
        $str612$Got_onClass_close_tag_when_we_wer = SubLObjectFactory.makeString("Got onClass close tag when we weren't reading a class.");
        $str613$Failed_to_read_class_ = SubLObjectFactory.makeString("Failed to read class.");
        $str614$Read_datatype__S_from__S = SubLObjectFactory.makeString("Read datatype ~S from ~S");
        $kw615$READ_TYPE = SubLObjectFactory.makeKeyword("READ-TYPE");
        $str616$Read_value__S_from__S = SubLObjectFactory.makeString("Read value ~S from ~S");
        $kw617$READ_VALUE = SubLObjectFactory.makeKeyword("READ-VALUE");
        $str618$Failed_to_read_restriction_value_ = SubLObjectFactory.makeString("Failed to read restriction value.");
        $str619$Read_restriction_value__S = SubLObjectFactory.makeString("Read restriction value ~S");
        $str620$__Reading_OWL_property_starting_w = SubLObjectFactory.makeString("~&Reading OWL property starting with ~S~%");
        $str621$__Done_with__S__ = SubLObjectFactory.makeString("~&Done with ~S~%");
        $str622$__Reading_OWL_class_starting_with = SubLObjectFactory.makeString("~&Reading OWL class starting with ~S~%");
        $list623 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("double"), SubLObjectFactory.makeString("integer"), SubLObjectFactory.makeString("int"), SubLObjectFactory.makeString("unsignedInt"), SubLObjectFactory.makeString("nonNegativeInteger"), SubLObjectFactory.makeString("nonPositiveInteger"), SubLObjectFactory.makeString("positiveInteger"), SubLObjectFactory.makeString("negativeInteger"), SubLObjectFactory.makeString("decimal"), SubLObjectFactory.makeString("long"), SubLObjectFactory.makeString("unsignedLong"), SubLObjectFactory.makeString("short"), SubLObjectFactory.makeString("unsignedShort"), SubLObjectFactory.makeString("float") });
        $str624$Can_t_parse__S_as_a__A = SubLObjectFactory.makeString("Can't parse ~S as a ~A");
        $str625$boolean = SubLObjectFactory.makeString("boolean");
        $list626 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("true"), (SubLObject)SubLObjectFactory.makeString("1"));
        $const627$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $list628 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("false"), (SubLObject)SubLObjectFactory.makeString("0"));
        $const629$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $str630$Couldn_t_read_boolean_value_from_ = SubLObjectFactory.makeString("Couldn't read boolean value from ~S");
        $str631$date = SubLObjectFactory.makeString("date");
        $str632$Couldn_t_parse_date_from__S = SubLObjectFactory.makeString("Couldn't parse date from ~S");
        $const633$DayFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $sym634$NAT_FUNCTOR = SubLObjectFactory.makeSymbol("NAT-FUNCTOR");
        $str635$Got_multiple_dates_from__S_____S = SubLObjectFactory.makeString("Got multiple dates from ~S:~% ~S");
        $str636$Don_t_know_how_to_parse_value_fro = SubLObjectFactory.makeString("Don't know how to parse value from ~S with datatype ~S");
        $sym637$XML_NAME = SubLObjectFactory.makeSymbol("XML-NAME");
        $str638$xml_ = SubLObjectFactory.makeString("xml:");
        $sym639$_XML_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*XML-NAME-CACHING-STATE*");
        $sym640$OWL_IMPORTER = SubLObjectFactory.makeSymbol("OWL-IMPORTER");
        $sym641$OWL_IMPORTER_P = SubLObjectFactory.makeSymbol("OWL-IMPORTER-P");
        $list642 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("IMPORT-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("THREAD"));
        $list643 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("IMPORT-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("THREAD"));
        $list644 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWL-IMP-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMP-PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMP-ERROR-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMP-IMPORT-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMP-THREAD"));
        $list645 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-PROGRESS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-ERROR-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-IMPORT-PARAMETERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-THREAD"));
        $sym646$PRINT_OWL_IMPORTER = SubLObjectFactory.makeSymbol("PRINT-OWL-IMPORTER");
        $sym647$OWL_IMPORTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("OWL-IMPORTER-PRINT-FUNCTION-TRAMPOLINE");
        $list648 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("OWL-IMPORTER-P"));
        $sym649$OWL_IMP_ID = SubLObjectFactory.makeSymbol("OWL-IMP-ID");
        $sym650$_CSETF_OWL_IMP_ID = SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-ID");
        $sym651$OWL_IMP_PROGRESS = SubLObjectFactory.makeSymbol("OWL-IMP-PROGRESS");
        $sym652$_CSETF_OWL_IMP_PROGRESS = SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-PROGRESS");
        $sym653$OWL_IMP_ERROR_INFO = SubLObjectFactory.makeSymbol("OWL-IMP-ERROR-INFO");
        $sym654$_CSETF_OWL_IMP_ERROR_INFO = SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-ERROR-INFO");
        $sym655$OWL_IMP_IMPORT_PARAMETERS = SubLObjectFactory.makeSymbol("OWL-IMP-IMPORT-PARAMETERS");
        $sym656$_CSETF_OWL_IMP_IMPORT_PARAMETERS = SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-IMPORT-PARAMETERS");
        $sym657$OWL_IMP_THREAD = SubLObjectFactory.makeSymbol("OWL-IMP-THREAD");
        $sym658$_CSETF_OWL_IMP_THREAD = SubLObjectFactory.makeSymbol("_CSETF-OWL-IMP-THREAD");
        $kw659$ID = SubLObjectFactory.makeKeyword("ID");
        $kw660$PROGRESS = SubLObjectFactory.makeKeyword("PROGRESS");
        $kw661$ERROR_INFO = SubLObjectFactory.makeKeyword("ERROR-INFO");
        $kw662$IMPORT_PARAMETERS = SubLObjectFactory.makeKeyword("IMPORT-PARAMETERS");
        $kw663$THREAD = SubLObjectFactory.makeKeyword("THREAD");
        $sym664$MAKE_OWL_IMPORTER = SubLObjectFactory.makeSymbol("MAKE-OWL-IMPORTER");
        $sym665$VISIT_DEFSTRUCT_OBJECT_OWL_IMPORTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-OWL-IMPORTER-METHOD");
        $str666$_OWL_IMPORTER__D_ = SubLObjectFactory.makeString("<OWL-IMPORTER ~D>");
        $sym667$SXHASH_OWL_IMPORTER_METHOD = SubLObjectFactory.makeSymbol("SXHASH-OWL-IMPORTER-METHOD");
        $sym668$IMPORT_OWL_ONTOLOGY_WITH_IMPORTER = SubLObjectFactory.makeSymbol("IMPORT-OWL-ONTOLOGY-WITH-IMPORTER");
        $list669 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("CYCLIST"));
        $str670$OWL_Importer = SubLObjectFactory.makeString("OWL Importer");
        $sym671$OWL_IMPORTER_RUN = SubLObjectFactory.makeSymbol("OWL-IMPORTER-RUN");
        $list672 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("IMPORTER"), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), SubLObjectFactory.makeKeyword("URI-PREFIX"), SubLObjectFactory.makeKeyword("SOURCE"), SubLObjectFactory.makeKeyword("ONTOLOGY"), SubLObjectFactory.makeKeyword("QUOTED-ISA"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?") });
        $sym673$_OWL_IMPORTER_ID_INDEX_ = SubLObjectFactory.makeSymbol("*OWL-IMPORTER-ID-INDEX*");
        $kw674$IMPORTER = SubLObjectFactory.makeKeyword("IMPORTER");
        $str675$http___sweet_jpl_nasa_gov_ontolog = SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/");
        $list676 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("units"), SubLObjectFactory.makeString("time"), SubLObjectFactory.makeString("space"), SubLObjectFactory.makeString("sensor"), SubLObjectFactory.makeString("numerics"), SubLObjectFactory.makeString("phenomena"), SubLObjectFactory.makeString("process"), SubLObjectFactory.makeString("property"), SubLObjectFactory.makeString("substance"), SubLObjectFactory.makeString("material_thing"), SubLObjectFactory.makeString("human_activities"), SubLObjectFactory.makeString("data_center"), SubLObjectFactory.makeString("data"), SubLObjectFactory.makeString("biosphere"), SubLObjectFactory.makeString("earthrealm"), SubLObjectFactory.makeString("sunrealm") });
        $str677$http___www_w3_org_TR_owl_guide_wi = SubLObjectFactory.makeString("http://www.w3.org/TR/owl-guide/wine.rdf");
        $str678$WINE_ = SubLObjectFactory.makeString("WINE-");
        $str679$_owl = SubLObjectFactory.makeString(".owl");
        $str680$SWEET_ = SubLObjectFactory.makeString("SWEET-");
        $str681$http___reliant_teknowledge_com_DA = SubLObjectFactory.makeString("http://reliant.teknowledge.com/DAML/SUMO.owl");
        $str682$SUMO_ = SubLObjectFactory.makeString("SUMO-");
        $str683$http___open_meta_com_SUMO_owl = SubLObjectFactory.makeString("http://open-meta.com/SUMO.owl");
        $str684$http___kmf_patrick_afspc_ds_af_mi = SubLObjectFactory.makeString("http://kmf.patrick.afspc.ds.af.mil/KMF.owl");
        $str685$KMF_ = SubLObjectFactory.makeString("KMF-");
        $str686$_home_baxter_tmp_decision_support = SubLObjectFactory.makeString("/home/baxter/tmp/decision-support-kmf.owl");
    }
    
    public static final class $owl_pred_info_native extends SubLStructNative
    {
        public SubLObject $cyc_name;
        public SubLObject $comment;
        public SubLObject $domains;
        public SubLObject $range;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $owl_pred_info_native() {
            this.$cyc_name = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$domains = (SubLObject)CommonSymbols.NIL;
            this.$range = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$owl_pred_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$cyc_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$comment;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$domains;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$range;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$domains = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$range = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$owl_pred_info_native.class, owl_to_cycl.$sym123$OWL_PRED_INFO, owl_to_cycl.$sym124$OWL_PRED_INFO_P, owl_to_cycl.$list125, owl_to_cycl.$list126, new String[] { "$cyc_name", "$comment", "$domains", "$range", "$plist" }, owl_to_cycl.$list127, owl_to_cycl.$list128, owl_to_cycl.$sym129$PRINT_OWL_PRED_INFO);
        }
    }
    
    public static final class $owl_pred_info_p$UnaryFunction extends UnaryFunction
    {
        public $owl_pred_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OWL-PRED-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return owl_to_cycl.owl_pred_info_p(arg1);
        }
    }
    
    public static final class $owl_import_parameters_native extends SubLStructNative
    {
        public SubLObject $ontology;
        public SubLObject $namespace_map;
        public SubLObject $constant_prefix;
        public SubLObject $constant_suffix;
        public SubLObject $base_uri;
        public SubLObject $uri_prefix;
        public SubLObject $cyclist;
        public SubLObject $quoted_isa;
        public SubLObject $prefix_external_namesP;
        public SubLObject $abbreviate_prefixesP;
        public SubLObject $import_term;
        public SubLObject $encoding;
        private static final SubLStructDeclNative structDecl;
        
        public $owl_import_parameters_native() {
            this.$ontology = (SubLObject)CommonSymbols.NIL;
            this.$namespace_map = (SubLObject)CommonSymbols.NIL;
            this.$constant_prefix = (SubLObject)CommonSymbols.NIL;
            this.$constant_suffix = (SubLObject)CommonSymbols.NIL;
            this.$base_uri = (SubLObject)CommonSymbols.NIL;
            this.$uri_prefix = (SubLObject)CommonSymbols.NIL;
            this.$cyclist = (SubLObject)CommonSymbols.NIL;
            this.$quoted_isa = (SubLObject)CommonSymbols.NIL;
            this.$prefix_external_namesP = (SubLObject)CommonSymbols.NIL;
            this.$abbreviate_prefixesP = (SubLObject)CommonSymbols.NIL;
            this.$import_term = (SubLObject)CommonSymbols.NIL;
            this.$encoding = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$owl_import_parameters_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$ontology;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$namespace_map;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$constant_prefix;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$constant_suffix;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$base_uri;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$uri_prefix;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$cyclist;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$quoted_isa;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$prefix_external_namesP;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$abbreviate_prefixesP;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$import_term;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$encoding;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$ontology = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$namespace_map = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$constant_prefix = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$constant_suffix = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$base_uri = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$uri_prefix = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$cyclist = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$quoted_isa = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$prefix_external_namesP = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$abbreviate_prefixesP = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$import_term = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$encoding = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$owl_import_parameters_native.class, owl_to_cycl.$sym167$OWL_IMPORT_PARAMETERS, owl_to_cycl.$sym168$OWL_IMPORT_PARAMETERS_P, owl_to_cycl.$list169, owl_to_cycl.$list170, new String[] { "$ontology", "$namespace_map", "$constant_prefix", "$constant_suffix", "$base_uri", "$uri_prefix", "$cyclist", "$quoted_isa", "$prefix_external_namesP", "$abbreviate_prefixesP", "$import_term", "$encoding" }, owl_to_cycl.$list171, owl_to_cycl.$list172, owl_to_cycl.$sym173$PRINT_OWL_IMPORT_PARAMETERS);
        }
    }
    
    public static final class $owl_import_parameters_p$UnaryFunction extends UnaryFunction
    {
        public $owl_import_parameters_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OWL-IMPORT-PARAMETERS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return owl_to_cycl.owl_import_parameters_p(arg1);
        }
    }
    
    public static final class $owl_term_info_native extends SubLStructNative
    {
        public SubLObject $cyc_name;
        public SubLObject $comment;
        public SubLObject $superclasses;
        public SubLObject $disjoint_classes;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $owl_term_info_native() {
            this.$cyc_name = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$superclasses = (SubLObject)CommonSymbols.NIL;
            this.$disjoint_classes = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$owl_term_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$cyc_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$comment;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$superclasses;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$disjoint_classes;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$superclasses = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$disjoint_classes = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$owl_term_info_native.class, owl_to_cycl.$sym532$OWL_TERM_INFO, owl_to_cycl.$sym312$OWL_TERM_INFO_P, owl_to_cycl.$list533, owl_to_cycl.$list534, new String[] { "$cyc_name", "$comment", "$superclasses", "$disjoint_classes", "$plist" }, owl_to_cycl.$list535, owl_to_cycl.$list536, owl_to_cycl.$sym537$PRINT_OWL_TERM_INFO);
        }
    }
    
    public static final class $owl_term_info_p$UnaryFunction extends UnaryFunction
    {
        public $owl_term_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OWL-TERM-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return owl_to_cycl.owl_term_info_p(arg1);
        }
    }
    
    public static final class $owl_importer_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $progress;
        public SubLObject $error_info;
        public SubLObject $import_parameters;
        public SubLObject $thread;
        private static final SubLStructDeclNative structDecl;
        
        public $owl_importer_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$progress = (SubLObject)CommonSymbols.NIL;
            this.$error_info = (SubLObject)CommonSymbols.NIL;
            this.$import_parameters = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$owl_importer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$progress;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$error_info;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$import_parameters;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$thread;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$progress = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$error_info = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$import_parameters = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$thread = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$owl_importer_native.class, owl_to_cycl.$sym640$OWL_IMPORTER, owl_to_cycl.$sym641$OWL_IMPORTER_P, owl_to_cycl.$list642, owl_to_cycl.$list643, new String[] { "$id", "$progress", "$error_info", "$import_parameters", "$thread" }, owl_to_cycl.$list644, owl_to_cycl.$list645, owl_to_cycl.$sym646$PRINT_OWL_IMPORTER);
        }
    }
    
    public static final class $owl_importer_p$UnaryFunction extends UnaryFunction
    {
        public $owl_importer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OWL-IMPORTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return owl_to_cycl.owl_importer_p(arg1);
        }
    }
}

/*

	Total time: 5552 ms
	 synthetic 
*/