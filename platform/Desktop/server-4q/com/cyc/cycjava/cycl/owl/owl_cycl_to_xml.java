package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.rkf_concept_clarifier;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.cycjava.cycl.regular_expressions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owl_cycl_to_xml
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.owl_cycl_to_xml";
  public static final String myFingerPrint = "53c72cf363c18234e6d30827ef09768a243b871032960abeffc4ed44fa832953";
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1263L)
  public static SubLSymbol $owl_ontology_comment_file$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1766L)
  private static SubLSymbol $owl_xml_footer$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1823L)
  private static SubLSymbol $owl_xml_spacer$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1869L)
  private static SubLSymbol $owl_xml_spacer_2$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1958L)
  private static SubLSymbol $owl_xml_spacer_3$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2049L)
  private static SubLSymbol $owl_xml_spacer_4$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2140L)
  private static SubLSymbol $owl_xml_spacer_5$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2231L)
  private static SubLSymbol $owl_tag_attributes_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2809L)
  private static SubLSymbol $owl_standalone_resource_tags$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3208L)
  private static SubLSymbol $opencyc_uri_pattern_def$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3312L)
  private static SubLSymbol $cyc_uri_pattern_def$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3405L)
  private static SubLSymbol $opencyc_uri_pattern$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3455L)
  private static SubLSymbol $cyc_uri_pattern$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3500L)
  private static SubLSymbol $all_uri_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9620L)
  private static SubLSymbol $owl_opencyc_fort_owl_names_filename$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9720L)
  private static SubLSymbol $forts_with_exported_owl_opencyc_content_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10202L)
  private static SubLSymbol $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13071L)
  private static SubLSymbol $owl_collection_types_for_export$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13256L)
  private static SubLSymbol $owl_predicate_types_for_export_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 28051L)
  public static SubLSymbol $owl_export_version_string$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 35681L)
  public static SubLSymbol $cyc_annotation_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 36406L)
  private static SubLSymbol $cyc_annotation_external_prefixes$;
  private static final SubLString $str0$____rdfs_comment_xml_lang__en__;
  private static final SubLString $str1$___________rdfs_comment________ow;
  private static final SubLString $str2$opencyc;
  private static final SubLString $str3$__rdf_RDF__;
  private static final SubLString $str4$____;
  private static final SubLSymbol $sym5$OWL_TAG_ATTRIBUTES;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLObject $const10$prettyString;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLObject $const13$nameString;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLString $str17$_label;
  private static final SubLSymbol $sym18$_OWL_TAG_ATTRIBUTES_CACHING_STATE_;
  private static final SubLList $list19;
  private static final SubLString $str20$http___sw_opencyc_org__0_9____con;
  private static final SubLString $str21$http___sw_cyc_com__0_9____concept;
  private static final SubLString $str22$http___sw_opencyc_org;
  private static final SubLString $str23$http___sw_cyc_com;
  private static final SubLSymbol $sym24$SECOND;
  private static final SubLSymbol $sym25$FORT_P;
  private static final SubLSymbol $sym26$OWL_CYC_URI_FOR_CYC_TERM;
  private static final SubLInteger $int27$256;
  private static final SubLSymbol $sym28$OWL_OPENCYC_URI_FOR_TERM;
  private static final SubLString $str29$OpenCyc_URIs_must_either_use_a_ve;
  private static final SubLSymbol $sym30$OWL_OPENCYC_LATEST_URI_FOR_FORT;
  private static final SubLList $list31;
  private static final SubLString $str32$Human_readable_OWL_export_require;
  private static final SubLSymbol $sym33$_EXIT;
  private static final SubLString $str34$data_caches_5022_fort_owl_names_c;
  private static final SubLSymbol $sym35$FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT;
  private static final SubLInteger $int36$200000;
  private static final SubLSymbol $kw37$INPUT;
  private static final SubLString $str38$Unable_to_open__S;
  private static final SubLString $str39$_;
  private static final SubLSymbol $sym40$_FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT_CACHING_STATE_;
  private static final SubLSymbol $sym41$COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT;
  private static final SubLSymbol $sym42$_COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT;
  private static final SubLObject $const43$termTypeForOntology;
  private static final SubLObject $const44$contextOfPCW;
  private static final SubLObject $const45$synonymousExternalConcept;
  private static final SubLObject $const46$overlappingExternalConcept;
  private static final SubLSymbol $sym47$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym48$OWLIFIABLE_ARG1_;
  private static final SubLString $str49$No_asents_for__S_;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OWL_PREDICATE_TYPES_FOR_EXPORT;
  private static final SubLSymbol $sym52$HL_PROTOTYPICAL_INSTANCE_;
  private static final SubLSymbol $sym53$VALID_FORT_;
  private static final SubLObject $const54$BinaryPredicateTypeByLogicalFeatu;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$_OWL_PREDICATE_TYPES_FOR_EXPORT_CACHING_STATE_;
  private static final SubLSymbol $sym57$CLEAR_OWL_PREDICATE_TYPES_FOR_EXPORT;
  private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const59$EverythingPSC;
  private static final SubLSymbol $kw60$GAF;
  private static final SubLSymbol $kw61$TRUE;
  private static final SubLList $list62;
  private static final SubLObject $const63$isa;
  private static final SubLSymbol $kw64$GENLS;
  private static final SubLObject $const65$genls;
  private static final SubLSymbol $sym66$OWLIFIABLE_SENTENCE_;
  private static final SubLSymbol $sym67$ATOMIC_SENTENCE_ARG1;
  private static final SubLString $str68$__Extracted__D_subject_terms_from;
  private static final SubLSymbol $kw69$OUTPUT;
  private static final SubLString $str70$_;
  private static final SubLString $str71$log_txt;
  private static final SubLString $str72$owl_export_human_readable_owl;
  private static final SubLString $str73$__Starting_human_readable_export_;
  private static final SubLString $str74$owl_export_versioned_owl;
  private static final SubLString $str75$__Starting_versioned_export_____;
  private static final SubLString $str76$owl_export_unversioned_owl;
  private static final SubLString $str77$__Starting_unversioned_export____;
  private static final SubLString $str78$log_unversioned_txt;
  private static final SubLString $str79$_rdf;
  private static final SubLString $str80$_log;
  private static final SubLString $str81$skos;
  private static final SubLString $str82$rdf;
  private static final SubLString $str83$rdfs;
  private static final SubLString $str84$cyc;
  private static final SubLString $str85$oc;
  private static final SubLSymbol $kw86$NEW;
  private static final SubLString $str87$;
  private static final SubLString $str88$_A_A__;
  private static final SubLString $str89$_;
  private static final SubLSymbol $kw90$DEPTH;
  private static final SubLSymbol $kw91$STACK;
  private static final SubLSymbol $kw92$QUEUE;
  private static final SubLSymbol $sym93$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw94$ERROR;
  private static final SubLString $str95$_A_is_not_a__A;
  private static final SubLSymbol $sym96$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw97$CERROR;
  private static final SubLString $str98$continue_anyway;
  private static final SubLSymbol $kw99$WARN;
  private static final SubLString $str100$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const101$genlPreds;
  private static final SubLString $str102$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str103$attempting_to_bind_direction_link;
  private static final SubLString $str104$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLList $list105;
  private static final SubLSymbol $kw106$IGNORE;
  private static final SubLString $str107$__Exporting__D_Terms_from_iterato;
  private static final SubLString $str108$exporting_;
  private static final SubLString $str109$_terms_to_OWL;
  private static final SubLString $str110$__Exported__D_Terms_and__D_senten;
  private static final SubLSymbol $sym111$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str112$___S___D_sentences___;
  private static final SubLString $str113$Description;
  private static final SubLString $str114$_a;
  private static final SubLString $str115$2_0_0;
  private static final SubLString $str116$_________owl_versionInfo_Version_;
  private static final SubLString $str117$__owl_versionInfo_______;
  private static final SubLString $str118$__xml_version__1_0__encoding__UTF;
  private static final SubLString $str119$_rdf_RDF_xml_base__;
  private static final SubLString $str120$____xmlns__;
  private static final SubLList $list121;
  private static final SubLString $str122$______xmlns__A__S;
  private static final SubLString $str123$_;
  private static final SubLString $str124$_;
  private static final SubLString $str125$_____;
  private static final SubLString $str126$_____owl_Ontology_rdf_about______;
  private static final SubLSymbol $sym127$NON_EMPTY_LIST_P;
  private static final SubLList $list128;
  private static final SubLString $str129$ID;
  private static final SubLString $str130$about;
  private static final SubLSymbol $sym131$VALID_XML_NAME_P;
  private static final SubLString $str132$Invalid_XML_name___S___Default_na;
  private static final SubLString $str133$__;
  private static final SubLString $str134$_;
  private static final SubLString $str135$_u;
  private static final SubLString $str136$_p__;
  private static final SubLString $str137$_p_;
  private static final SubLString $str138$rdf_resource;
  private static final SubLObject $const139$OWLURIFn;
  private static final SubLObject $const140$OWLDatatypeFn;
  private static final SubLString $str141$rdf_datatype;
  private static final SubLString $str142$owl_intersectionOf;
  private static final SubLSymbol $sym143$XML_SPECIAL_CHAR_;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$CLET;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$_XML_INDENTATION_LEVEL_;
  private static final SubLSymbol $sym148$_;
  private static final SubLList $list149;
  private static final SubLList $list150;
  private static final SubLSymbol $kw151$UNINITIALIZED;
  private static final SubLString $str152$OWL_indent_level_too_high;
  private static final SubLSymbol $sym153$WARN_EXPORTING_UNVERIFIED_FORT;
  private static final SubLString $str154$Assuming__S_is_OK_to_export;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$CYC_ANNOTATION_EXTERNAL_PREFIX_P;
  private static final SubLSymbol $sym158$CAR;
  private static final SubLString $str159$xmlns_;
  private static final SubLString $str160$rdf_RDF;
  private static final SubLString $str161$xml_base;
  private static final SubLString $str162$xmlns;
  private static final SubLString $str163$__DOCTYPE_rdf_RDF;
  private static final SubLString $str164$____;
  private static final SubLSymbol $sym165$LENGTH;
  private static final SubLString $str166$_______ENTITY__;
  private static final SubLString $str167$A__S____;
  private static final SubLString $str168$____;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$ATOMIC_SENTENCE_PREDICATE;
  private static final SubLList $list171;
  private static final SubLString $str172$AnnotationProperty;
  private static final SubLString $str173$label;
  private static final SubLString $str174$lang;
  private static final SubLList $list175;
  private static final SubLString $str176$comment;
  private static final SubLString $str177$type;
  private static final SubLString $str178$resource;
  private static final SubLString $str179$FunctionalProperty;

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1037L)
  public static SubLObject owl_xml_ontology_comment_and_close_tag(final SubLObject comment)
  {
    return Sequences.cconcatenate( $str0$____rdfs_comment_xml_lang__en__, new SubLObject[] { comment, $str1$___________rdfs_comment________ow
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 1406L)
  public static SubLObject get_owl_ontology_comment()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject comment = NIL;
    if( NIL != owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue( thread ) && NIL != Sequences.search( $str2$opencyc, owl_uris_and_prefixes.owl_export_base_uri( UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != file_utilities.file_existsP( $owl_ontology_comment_file$.getGlobalValue() )
        && NIL == owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.getDynamicValue( thread ) )
    {
      comment = string_utilities.read_string_from_file( $owl_ontology_comment_file$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2231L)
  public static SubLObject clear_owl_tag_attributes()
  {
    final SubLObject cs = $owl_tag_attributes_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2231L)
  public static SubLObject remove_owl_tag_attributes()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl_tag_attributes_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2231L)
  public static SubLObject owl_tag_attributes_internal()
  {
    return ConsesLow.list( new SubLObject[] { $list6, $list7, $list8, $list9, reader.bq_cons( kb_utilities.compact_hl_external_id_string( $const10$prettyString ), $list11 ), $list12, reader.bq_cons( kb_utilities
        .compact_hl_external_id_string( $const13$nameString ), $list11 ), $list14, $list15, $list16, reader.bq_cons( Sequences.cconcatenate( owl_uris_and_prefixes.cyc_annotation_prefix(), $str17$_label ), $list11 )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 2231L)
  public static SubLObject owl_tag_attributes()
  {
    SubLObject caching_state = $owl_tag_attributes_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym5$OWL_TAG_ATTRIBUTES, $sym18$_OWL_TAG_ATTRIBUTES_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl_tag_attributes_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3546L)
  public static SubLObject get_opencyc_uri_pattern()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == regular_expressions.regex_pattern_p( $opencyc_uri_pattern$.getDynamicValue( thread ) ) )
    {
      $opencyc_uri_pattern$.setDynamicValue( regular_expressions.compile_regular_expression( $opencyc_uri_pattern_def$.getGlobalValue(), UNPROVIDED ), thread );
    }
    return $opencyc_uri_pattern$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3765L)
  public static SubLObject get_cyc_uri_pattern()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == regular_expressions.regex_pattern_p( $cyc_uri_pattern$.getDynamicValue( thread ) ) )
    {
      $cyc_uri_pattern$.setDynamicValue( regular_expressions.compile_regular_expression( $cyc_uri_pattern_def$.getGlobalValue(), UNPROVIDED ), thread );
    }
    return $cyc_uri_pattern$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 3963L)
  public static SubLObject get_all_uri_patterns()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$all_uri_patterns$.getDynamicValue( thread ).isCons() )
    {
      $all_uri_patterns$.setDynamicValue( ConsesLow.list( get_opencyc_uri_pattern(), get_cyc_uri_pattern() ), thread );
    }
    return $all_uri_patterns$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 4159L)
  public static SubLObject cyc_uri_p(final SubLObject uri)
  {
    SubLObject values = NIL;
    if( uri.isString() )
    {
      if( NIL == string_utilities.starts_with( uri, $str22$http___sw_opencyc_org ) && NIL == string_utilities.starts_with( uri, $str23$http___sw_cyc_com ) )
      {
        return NIL;
      }
      SubLObject cdolist_list_var = get_all_uri_patterns();
      SubLObject pattern = NIL;
      pattern = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject items_var = Mapping.mapcar( $sym24$SECOND, regular_expression_utilities.find_all_captured_matches_within_string( pattern, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            values = ConsesLow.cons( item, values );
          }
        }
        else
        {
          SubLObject cdolist_list_var_$1 = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            values = ConsesLow.cons( item2, values );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            item2 = cdolist_list_var_$1.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pattern = cdolist_list_var.first();
      }
    }
    else
    {
      if( NIL == rdf_uri.rdf_uri_p( uri ) )
      {
        return Values.values( NIL, NIL );
      }
      final SubLObject utf8_string = rdf_uri.rdf_uri_utf8_string( uri );
      if( NIL == string_utilities.starts_with( utf8_string, $str22$http___sw_opencyc_org ) && NIL == string_utilities.starts_with( utf8_string, $str23$http___sw_cyc_com ) )
      {
        return NIL;
      }
      SubLObject cdolist_list_var2 = get_all_uri_patterns();
      SubLObject pattern2 = NIL;
      pattern2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject items_var2 = Mapping.mapcar( $sym24$SECOND, regular_expression_utilities.find_all_captured_matches_within_string( pattern2, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        if( items_var2.isVector() )
        {
          final SubLObject vector_var2 = items_var2;
          final SubLObject backwardP_var2 = NIL;
          SubLObject length2;
          SubLObject v_iteration2;
          SubLObject element_num2;
          SubLObject item3;
          for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
          {
            element_num2 = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
            item3 = Vectors.aref( vector_var2, element_num2 );
            values = ConsesLow.cons( item3, values );
          }
        }
        else
        {
          SubLObject cdolist_list_var_$2 = items_var2;
          SubLObject item4 = NIL;
          item4 = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            values = ConsesLow.cons( item4, values );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            item4 = cdolist_list_var_$2.first();
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        pattern2 = cdolist_list_var2.first();
      }
    }
    return Values.values( list_utilities.sublisp_boolean( values ), values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 4994L)
  public static SubLObject owl_cyc_uri_for_fort(final SubLObject fort, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    return owl_cyc_uri_for_cyc_term( fort, use_entity_referencesP, use_external_ids_for_namesP, version_date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 5374L)
  public static SubLObject owl_cyc_uri_for_cyc_term_internal(final SubLObject v_term, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject uri = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_external_ids_for_namesP$.bind( use_external_ids_for_namesP, thread );
      final SubLObject base_uri = owl_uris_and_prefixes.owl_cyc_base_uri( version_date );
      uri = Sequences.cconcatenate( ( NIL != use_entity_referencesP ) ? owl_uris_and_prefixes.possibly_entity_reference_for_base_uri( base_uri ) : base_uri, owlification.owl_term_string( v_term, T ) );
    }
    finally
    {
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_0, thread );
    }
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 5374L)
  public static SubLObject owl_cyc_uri_for_cyc_term(final SubLObject v_term, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_cyc_uri_for_cyc_term_internal( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym26$OWL_CYC_URI_FOR_CYC_TERM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym26$OWL_CYC_URI_FOR_CYC_TERM, FOUR_INTEGER, $int27$256, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym26$OWL_CYC_URI_FOR_CYC_TERM, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date );
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
        if( v_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( use_entity_referencesP.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( use_external_ids_for_namesP.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && version_date.eql( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_cyc_uri_for_cyc_term_internal( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 5955L)
  public static SubLObject owl_opencyc_uri_for_fort(final SubLObject fort, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    return owl_opencyc_uri_for_term( fort, use_entity_referencesP, use_external_ids_for_namesP, version_date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 6325L)
  public static SubLObject owl_opencyc_uri_for_term_internal(final SubLObject v_term, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == use_external_ids_for_namesP && NIL == numeric_date_utilities.universal_date_p( version_date ) )
    {
      Errors.error( $str29$OpenCyc_URIs_must_either_use_a_ve );
    }
    SubLObject uri = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_base_uri$.currentBinding( thread );
    try
    {
      owlification.$owl_use_external_ids_for_namesP$.bind( use_external_ids_for_namesP, thread );
      owl_uris_and_prefixes.$owl_export_base_uri$.bind( misc_utilities.uninitialized(), thread );
      final SubLObject base_uri = ( NIL != use_external_ids_for_namesP ) ? owl_uris_and_prefixes.owl_opencyc_base_uri( version_date ) : owl_uris_and_prefixes.owl_english_opencyc_base_uri( version_date );
      uri = Sequences.cconcatenate( ( NIL != use_entity_referencesP ) ? owl_uris_and_prefixes.possibly_entity_reference_for_base_uri( base_uri ) : base_uri, owlification.owl_term_string( v_term, T ) );
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_base_uri$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_0, thread );
    }
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 6325L)
  public static SubLObject owl_opencyc_uri_for_term(final SubLObject v_term, SubLObject use_entity_referencesP, SubLObject use_external_ids_for_namesP, SubLObject version_date)
  {
    if( use_entity_referencesP == UNPROVIDED )
    {
      use_entity_referencesP = owlification.$owl_use_entity_referencesP$.getDynamicValue();
    }
    if( use_external_ids_for_namesP == UNPROVIDED )
    {
      use_external_ids_for_namesP = owlification.$owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    if( version_date == UNPROVIDED )
    {
      version_date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_opencyc_uri_for_term_internal( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym28$OWL_OPENCYC_URI_FOR_TERM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym28$OWL_OPENCYC_URI_FOR_TERM, FOUR_INTEGER, $int27$256, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym28$OWL_OPENCYC_URI_FOR_TERM, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date );
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
        if( v_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( use_entity_referencesP.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( use_external_ids_for_namesP.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && version_date.eql( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_opencyc_uri_for_term_internal( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, use_entity_referencesP, use_external_ids_for_namesP, version_date ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 7174L)
  public static SubLObject owl_opencyc_latest_uri_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      result = owl_opencyc_uri_for_term( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 7464L)
  public static SubLObject owl_opencyc_latest_uri_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      result = owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 7780L)
  public static SubLObject owl_opencyc_versioned_uri_for_fort(final SubLObject fort, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      result = owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 8102L)
  public static SubLObject owl_opencyc_readable_uri_for_fort(final SubLObject fort, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == numeric_date_utilities.universal_date_p( date ) )
      {
        Errors.error( $str32$Human_readable_OWL_export_require, date );
      }
      result = owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_9, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_8, thread );
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 8418L)
  public static SubLObject owl_cyc_latest_uri_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      result = owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 8671L)
  public static SubLObject owl_cyc_latest_readable_uri_for_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    try
    {
      owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
      owlification.$owl_use_entity_referencesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
      SubLObject result = NIL;
      result = owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return result;
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9012L)
  public static SubLObject owl_cyc_versioned_uri_for_fort(final SubLObject fort, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      result = owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9322L)
  public static SubLObject owl_cyc_readable_uri_for_fort(final SubLObject fort, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    try
    {
      owlification.$owl_use_pretty_stringsP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
      owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.bind( date, thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == numeric_date_utilities.universal_date_p( date ) )
      {
        Errors.error( $str32$Human_readable_OWL_export_require, date );
      }
      result = owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_9, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_8, thread );
      owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_7, thread );
      owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_6, thread );
      owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_5, thread );
      owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9720L)
  public static SubLObject clear_forts_with_exported_owl_opencyc_content()
  {
    final SubLObject cs = $forts_with_exported_owl_opencyc_content_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9720L)
  public static SubLObject remove_forts_with_exported_owl_opencyc_content()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $forts_with_exported_owl_opencyc_content_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9720L)
  public static SubLObject forts_with_exported_owl_opencyc_content_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_forts = set.new_set( Symbols.symbol_function( EQL ), $int36$200000 );
    final SubLObject file_var = $owl_opencyc_fort_owl_names_filename$.getDynamicValue( thread );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file_var, $kw37$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, file_var );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$3 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$3 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$3 ) )
        {
          final SubLObject tokens = string_utilities.string_tokenize( line, ConsesLow.list( Characters.CHAR_comma ), ConsesLow.list( ConsesLow.list( $str39$_, $str39$_ ) ), NIL, NIL, ConsesLow.list(
              Characters.CHAR_backslash ), UNPROVIDED );
          final SubLObject id_string = reader.read_from_string( tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject fort = kb_utilities.find_object_by_compact_hl_external_id_string( id_string );
          if( NIL != forts.fort_p( fort ) )
          {
            set.set_add( fort, v_forts );
          }
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return v_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 9720L)
  public static SubLObject forts_with_exported_owl_opencyc_content()
  {
    SubLObject caching_state = $forts_with_exported_owl_opencyc_content_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym35$FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT, $sym40$_FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT_CACHING_STATE_, NIL, EQL, ZERO_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( forts_with_exported_owl_opencyc_content_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10202L)
  public static SubLObject clear_compact_hl_external_id_strings_with_exported_owl_opencyc_content()
  {
    final SubLObject cs = $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10202L)
  public static SubLObject remove_compact_hl_external_id_strings_with_exported_owl_opencyc_content()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10202L)
  public static SubLObject compact_hl_external_id_strings_with_exported_owl_opencyc_content_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject compact_hl_external_id_strings = set.new_set( Symbols.symbol_function( EQUAL ), $int36$200000 );
    final SubLObject file_var = $owl_opencyc_fort_owl_names_filename$.getDynamicValue( thread );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file_var, $kw37$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, file_var );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$4 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$4 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$4 ) )
        {
          final SubLObject tokens = string_utilities.string_tokenize( line, ConsesLow.list( Characters.CHAR_comma ), ConsesLow.list( ConsesLow.list( $str39$_, $str39$_ ) ), NIL, NIL, ConsesLow.list(
              Characters.CHAR_backslash ), UNPROVIDED );
          final SubLObject id_string = reader.read_from_string( tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          set.set_add( id_string, compact_hl_external_id_strings );
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return compact_hl_external_id_strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10202L)
  public static SubLObject compact_hl_external_id_strings_with_exported_owl_opencyc_content()
  {
    SubLObject caching_state = $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym41$COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT,
          $sym42$_COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( compact_hl_external_id_strings_with_exported_owl_opencyc_content_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10761L)
  public static SubLObject fort_has_exported_owl_opencyc_contentP(final SubLObject fort)
  {
    return set.set_memberP( kb_utilities.compact_hl_external_id_string( fort ), compact_hl_external_id_strings_with_exported_owl_opencyc_content() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 10950L)
  public static SubLObject owl_export_ontology(final SubLObject ontology_term, final SubLObject prefer_ontology_urisP, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_types = kb_mapping_utilities.pred_values_in_any_mt( ontology_term, $const43$termTypeForOntology, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject terms = NIL;
    final SubLObject _prev_bind_0 = owlification.$owl_export_ontology$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_export_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owlification.$owl_prefer_ontology_urisP$.currentBinding( thread );
    try
    {
      owlification.$owl_export_ontology$.bind( ontology_term, thread );
      owlification.$owl_export_mt$.bind( ( NIL != kb_mapping_utilities.fpred_value_in_any_mt( ontology_term, $const44$contextOfPCW, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? kb_mapping_utilities.fpred_value_in_any_mt(
          ontology_term, $const44$contextOfPCW, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : owlification.$owl_export_mt$.getDynamicValue( thread ), thread );
      owlification.$owl_prefer_ontology_urisP$.bind( prefer_ontology_urisP, thread );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( ontology_term, $const45$synonymousExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = v_term;
        if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          terms = ConsesLow.cons( item_var, terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( ontology_term, $const46$overlappingExternalConcept, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = v_term;
        if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          terms = ConsesLow.cons( item_var, terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      cdolist_list_var = term_types;
      SubLObject term_type = NIL;
      term_type = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$5 = isa.all_quoted_instances_in_all_mts( term_type );
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          final SubLObject item_var2 = v_term2;
          if( NIL == conses_high.member( item_var2, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var2, terms );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          v_term2 = cdolist_list_var_$5.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        term_type = cdolist_list_var.first();
      }
      return owl_export_terms( terms, stream, UNPROVIDED );
    }
    finally
    {
      owlification.$owl_prefer_ontology_urisP$.rebind( _prev_bind_3, thread );
      owlification.$owl_export_mt$.rebind( _prev_bind_2, thread );
      owlification.$owl_export_ontology$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 11913L)
  public static SubLObject owl_export(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject fort_iterator = owlification.new_owl_export_term_iterator( forts.new_forts_iterator() );
    final SubLObject fort_count = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return owl_export_terms_from_iterator( fort_iterator, fort_count, stream, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 12186L)
  public static SubLObject owl_export_terms(final SubLObject terms, SubLObject stream, SubLObject asent_retrieval_fn)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    if( asent_retrieval_fn == UNPROVIDED )
    {
      asent_retrieval_fn = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( terms ) : terms;
    SubLObject cdolist_list_var = terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != owlification.owlifiable_arg1P( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( asent_retrieval_fn.isFunctionSpec() )
    {
      SubLObject asents = NIL;
      final SubLObject _prev_bind_0 = owlification.$owl_export_terms$.currentBinding( thread );
      try
      {
        owlification.$owl_export_terms$.bind( set_utilities.construct_set_from_list( list_utilities.remove_if_not( $sym25$FORT_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ),
            thread );
        SubLObject cdolist_list_var2 = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject my_asents = Functions.funcall( asent_retrieval_fn, v_term );
          if( NIL != list_utilities.empty_list_p( my_asents ) )
          {
            Errors.sublisp_break( $str49$No_asents_for__S_, new SubLObject[] { v_term
            } );
          }
          SubLObject cdolist_list_var_$6 = my_asents;
          SubLObject asent = NIL;
          asent = cdolist_list_var_$6.first();
          while ( NIL != cdolist_list_var_$6)
          {
            final SubLObject item_var = asent;
            if( NIL == conses_high.member( item_var, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              asents = ConsesLow.cons( item_var, asents );
            }
            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
            asent = cdolist_list_var_$6.first();
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          v_term = cdolist_list_var2.first();
        }
        owlification.add_owl_asent_forts_to_export_terms( asents );
        owl_export_asents( asents, owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue( thread ), stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        owlification.$owl_export_terms$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject owl_iterator = owlification.new_owl_export_term_iterator( iteration.new_list_iterator( terms ) );
      final SubLObject term_count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      owl_export_terms_from_iterator( owl_iterator, term_count, stream, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13256L)
  public static SubLObject clear_owl_predicate_types_for_export()
  {
    final SubLObject cs = $owl_predicate_types_for_export_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13256L)
  public static SubLObject remove_owl_predicate_types_for_export()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl_predicate_types_for_export_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13256L)
  public static SubLObject owl_predicate_types_for_export_internal()
  {
    return Sequences.delete_duplicates( Sequences.delete_if( $sym52$HL_PROTOTYPICAL_INSTANCE_, list_utilities.delete_if_not( $sym53$VALID_FORT_, ConsesLow.append( isa.all_instances_in_all_mts(
        $const54$BinaryPredicateTypeByLogicalFeatu ), $list55 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13256L)
  public static SubLObject owl_predicate_types_for_export()
  {
    SubLObject caching_state = $owl_predicate_types_for_export_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym51$OWL_PREDICATE_TYPES_FOR_EXPORT, $sym56$_OWL_PREDICATE_TYPES_FOR_EXPORT_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
      memoization_state.register_isa_dependent_cache_clear_callback( $sym57$CLEAR_OWL_PREDICATE_TYPES_FOR_EXPORT );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl_predicate_types_for_export_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 13661L)
  public static SubLObject fort_definitional_asents_for_owl_export(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject asents = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      SubLObject cdolist_list_var = $list62;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw60$GAF, $kw61$TRUE, NIL );
                SubLObject done_var_$7 = NIL;
                final SubLObject token_var_$8 = NIL;
                while ( NIL == done_var_$7)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                  final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( gaf ) );
                  if( NIL != valid_$9 && NIL == bad_owl_definitional_gafP( gaf ) )
                  {
                    final SubLObject item_var = assertions_high.gaf_formula( gaf );
                    if( NIL == conses_high.member( item_var, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      asents = ConsesLow.cons( item_var, asents );
                    }
                  }
                  done_var_$7 = makeBoolean( NIL == valid_$9 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      if( NIL != fort_types_interface.collection_p( fort ) )
      {
        cdolist_list_var = genls.min_cols( isa.all_isa_among( fort, $owl_collection_types_for_export$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2 = el_utilities.make_binary_formula( $const63$isa, fort, v_isa );
          if( NIL == conses_high.member( item_var2, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            asents = ConsesLow.cons( item_var2, asents );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        asents = Sequences.delete_duplicates( ConsesLow.append( asents, fort_genls_asents_for_owl_export( fort ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != fort_types_interface.predicate_p( fort ) )
      {
        cdolist_list_var = genls.min_cols( isa.all_isa_among( fort, owl_predicate_types_for_export(), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2 = el_utilities.make_binary_formula( $const63$isa, fort, v_isa );
          if( NIL == conses_high.member( item_var2, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            asents = ConsesLow.cons( item_var2, asents );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 14517L)
  public static SubLObject fort_genls_asents_for_owl_export(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == fort_types_interface.collection_p( fort ) )
    {
      return NIL;
    }
    final SubLObject v_genls = rkf_concept_clarifier.rkf_salient_generalizations( fort, mt_relevance_macros.$mt$.getDynamicValue( thread ), T, NIL, FIVE_INTEGER, T, $kw64$GENLS );
    SubLObject asents = NIL;
    SubLObject cdolist_list_var = v_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      asents = ConsesLow.cons( ConsesLow.list( $const65$genls, fort, genl ), asents );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 14896L)
  public static SubLObject bad_owl_definitional_gafP(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.find_if_not( $sym25$FORT_P, assertions_high.gaf_args( gaf ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != fort_types_interface.collection_p( assertions_high.gaf_arg1( gaf ) ) && $const63$isa.eql( assertions_high.gaf_arg0( gaf ) ) && NIL == conses_high.member( assertions_high.gaf_arg2( gaf ),
        $owl_collection_types_for_export$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != fort_types_interface.predicate_p( assertions_high.gaf_arg1( gaf ) ) )
    {
      return makeBoolean( ( $const63$isa.eql( assertions_high.gaf_arg0( gaf ) ) && NIL == conses_high.member( assertions_high.gaf_arg2( gaf ), owl_predicate_types_for_export(), UNPROVIDED, UNPROVIDED ) )
          || ( NIL != fort_types_interface.predicate_p( assertions_high.gaf_arg2( gaf ) ) && NIL != nart_handles.nart_p( assertions_high.gaf_arg2( gaf ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 15477L)
  public static SubLObject augment_with_transitive_closure(final SubLObject v_forts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject closure = set.new_set( Symbols.symbol_function( EQL ), Sequences.length( v_forts ) );
    final SubLObject queue = queues.create_queue( UNPROVIDED );
    SubLObject cdolist_list_var = v_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      queues.enqueue( fort, queue );
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    while ( NIL == queues.queue_empty_p( queue ))
    {
      final SubLObject fort2 = queues.dequeue( queue );
      set.set_add( fort2, closure );
      if( NIL != fort_types_interface.collection_p( fort2 ) )
      {
        thread.resetMultipleValues();
        final SubLObject okP = owlification.valid_collection_fort_for_owl_exportP( fort2 );
        final SubLObject binary_preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != okP )
        {
          SubLObject cdolist_list_var2 = binary_preds;
          SubLObject binary_pred = NIL;
          binary_pred = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( NIL != set.set_add( binary_pred, closure ) )
            {
              queues.enqueue( binary_pred, queue );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            binary_pred = cdolist_list_var2.first();
          }
        }
      }
      SubLObject cdolist_list_var3 = fort_definitional_asents_for_owl_export( fort2 );
      SubLObject asent = NIL;
      asent = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        final SubLObject new_fort = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
        if( NIL != set.set_add( new_fort, closure ) )
        {
          queues.enqueue( new_fort, queue );
        }
        cdolist_list_var3 = cdolist_list_var3.rest();
        asent = cdolist_list_var3.first();
      }
    }
    return set.set_element_list( closure );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 16248L)
  public static SubLObject owl_export_asents(final SubLObject asents, SubLObject opencyc_contentP, SubLObject stream, SubLObject log_stream, SubLObject base_uri)
  {
    if( opencyc_contentP == UNPROVIDED )
    {
      opencyc_contentP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    if( log_stream == UNPROVIDED )
    {
      log_stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( base_uri == UNPROVIDED )
    {
      base_uri = owl_uris_and_prefixes.owl_export_base_uri( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        assert NIL != list_utilities.non_dotted_list_p( asents ) : asents;
        SubLObject cdolist_list_var = asents;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          assert NIL != owlification.owlifiable_sentenceP( elem ) : elem;
          cdolist_list_var = cdolist_list_var.rest();
          elem = cdolist_list_var.first();
        }
        if( Characters.CHAR_hash.eql( string_utilities.last_char( base_uri ) ) )
        {
          base_uri = string_utilities.remove_last_char( base_uri, UNPROVIDED );
        }
        final SubLObject terms = Sequences.remove_duplicates( Mapping.mapcar( $sym67$ATOMIC_SENTENCE_ARG1, asents ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        PrintLow.format( log_stream, $str68$__Extracted__D_subject_terms_from, Sequences.length( terms ), Sequences.length( asents ) );
        final SubLObject _prev_bind_0_$11 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_base_uri$.currentBinding( thread );
        final SubLObject _prev_bind_3 = owlification.$owl_asents_to_export$.currentBinding( thread );
        try
        {
          owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( opencyc_contentP, thread );
          owl_uris_and_prefixes.$owl_export_base_uri$.bind( base_uri, thread );
          owlification.$owl_asents_to_export$.bind( owlification.index_owl_asents_by_arg1( asents ), thread );
          owl_export_terms( terms, stream, UNPROVIDED );
        }
        finally
        {
          owlification.$owl_asents_to_export$.rebind( _prev_bind_3, thread );
          owl_uris_and_prefixes.$owl_export_base_uri$.rebind( _prev_bind_2, thread );
          owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_0_$11, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 17085L)
  public static SubLObject owl_export_to_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw69$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, filename );
      }
      final SubLObject stream_$13 = stream;
      owl_export( stream_$13 );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 17226L)
  public static SubLObject owl_export_opencyc(SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.directory_p( directory ) )
    {
      Filesys.make_directory( directory, UNPROVIDED, UNPROVIDED );
    }
    if( !string_utilities.last_char( directory ).eql( Characters.CHAR_slash ) )
    {
      directory = Sequences.cconcatenate( directory, $str70$_ );
    }
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( Sequences.cconcatenate( directory, $str71$log_txt ), $kw69$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str71$log_txt ) );
      }
      final SubLObject log_stream = stream;
      final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding( thread );
      try
      {
        StreamsLow.$error_output$.bind( log_stream, thread );
        thread.resetMultipleValues();
        final SubLObject fort_iterator = owlification.new_owl_export_term_iterator( forts.new_forts_iterator() );
        final SubLObject fort_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject v_forts = NIL;
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject fort = iteration.iteration_next( fort_iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            v_forts = ConsesLow.cons( fort, v_forts );
          }
        }
        v_forts = Sequences.nreverse( v_forts );
        SubLObject stream_$14 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$15 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$14 = compatibility.open_text( Sequences.cconcatenate( directory, $str72$owl_export_human_readable_owl ), $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$15, thread );
          }
          if( !stream_$14.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str72$owl_export_human_readable_owl ) );
          }
          final SubLObject stream_$15 = stream_$14;
          final SubLObject _prev_bind_0_$16 = owlification.$fort_owl_name_table$.currentBinding( thread );
          try
          {
            owlification.$fort_owl_name_table$.bind( misc_utilities.uninitialized(), thread );
            PrintLow.format( T, $str73$__Starting_human_readable_export_ );
            final SubLObject _prev_bind_0_$17 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            final SubLObject _prev_bind_5 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
            final SubLObject _prev_bind_9 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_10 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            try
            {
              owlification.$owl_use_pretty_stringsP$.bind( T, thread );
              owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ), thread );
              owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
              owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
              owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ), thread );
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == numeric_date_utilities.universal_date_p( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ) ) )
              {
                Errors.error( $str32$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ) );
              }
              owl_export_terms_from_iterator( iteration.new_list_iterator( v_forts ), fort_count, stream_$15, log_stream );
            }
            finally
            {
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_10, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_9, thread );
              owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_8, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_7, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_6, thread );
              owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_5, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_4, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_3, thread );
              owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0_$17, thread );
            }
            if( NIL != Filesys.directory_p( directory ) )
            {
              owlification.write_fort_owl_name_table( directory );
            }
          }
          finally
          {
            owlification.$fort_owl_name_table$.rebind( _prev_bind_0_$16, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$14.isStream() )
            {
              streams_high.close( stream_$14, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
          }
        }
        SubLObject stream_$16 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$19 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$16 = compatibility.open_text( Sequences.cconcatenate( directory, $str74$owl_export_versioned_owl ), $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$19, thread );
          }
          if( !stream_$16.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str74$owl_export_versioned_owl ) );
          }
          final SubLObject stream_$17 = stream_$16;
          final SubLObject _prev_bind_0_$20 = owlification.$fort_owl_name_table$.currentBinding( thread );
          try
          {
            owlification.$fort_owl_name_table$.bind( misc_utilities.uninitialized(), thread );
            PrintLow.format( T, $str75$__Starting_versioned_export_____ );
            final SubLObject _prev_bind_0_$21 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            final SubLObject _prev_bind_5 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
            try
            {
              owlification.$owl_use_pretty_stringsP$.bind( T, thread );
              owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ), thread );
              owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
              owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
              owl_export_terms_from_iterator( iteration.new_list_iterator( v_forts ), fort_count, stream_$17, log_stream );
            }
            finally
            {
              owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_8, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_7, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_6, thread );
              owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_5, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_4, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_3, thread );
              owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0_$21, thread );
            }
            if( NIL != Filesys.directory_p( NIL ) )
            {
              owlification.write_fort_owl_name_table( NIL );
            }
          }
          finally
          {
            owlification.$fort_owl_name_table$.rebind( _prev_bind_0_$20, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( stream_$16.isStream() )
            {
              streams_high.close( stream_$16, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
          }
        }
        SubLObject stream_$18 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$18 = compatibility.open_text( Sequences.cconcatenate( directory, $str76$owl_export_unversioned_owl ), $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$23, thread );
          }
          if( !stream_$18.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str76$owl_export_unversioned_owl ) );
          }
          final SubLObject stream_$19 = stream_$18;
          final SubLObject _prev_bind_0_$24 = owlification.$fort_owl_name_table$.currentBinding( thread );
          try
          {
            owlification.$fort_owl_name_table$.bind( misc_utilities.uninitialized(), thread );
            PrintLow.format( T, $str77$__Starting_unversioned_export____ );
            final SubLObject _prev_bind_0_$25 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            final SubLObject _prev_bind_5 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
            try
            {
              owlification.$owl_use_pretty_stringsP$.bind( T, thread );
              owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
              owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
              owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
              owl_export_terms_from_iterator( iteration.new_list_iterator( v_forts ), fort_count, stream_$19, log_stream );
            }
            finally
            {
              owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_8, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_7, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_6, thread );
              owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_5, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_4, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_3, thread );
              owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0_$25, thread );
            }
            if( NIL != Filesys.directory_p( NIL ) )
            {
              owlification.write_fort_owl_name_table( NIL );
            }
          }
          finally
          {
            owlification.$fort_owl_name_table$.rebind( _prev_bind_0_$24, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            if( stream_$18.isStream() )
            {
              streams_high.close( stream_$18, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        StreamsLow.$error_output$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_11, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 18937L)
  public static SubLObject owl_export_opencyc_unversioned(SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.directory_p( directory ) )
    {
      Filesys.make_directory( directory, UNPROVIDED, UNPROVIDED );
    }
    if( !string_utilities.last_char( directory ).eql( Characters.CHAR_slash ) )
    {
      directory = Sequences.cconcatenate( directory, $str70$_ );
    }
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( Sequences.cconcatenate( directory, $str78$log_unversioned_txt ), $kw69$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str78$log_unversioned_txt ) );
      }
      final SubLObject log_stream = stream;
      final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding( thread );
      try
      {
        StreamsLow.$error_output$.bind( log_stream, thread );
        thread.resetMultipleValues();
        final SubLObject fort_iterator = owlification.new_owl_export_term_iterator( forts.new_forts_iterator() );
        final SubLObject fort_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject v_forts = NIL;
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject fort = iteration.iteration_next( fort_iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            v_forts = ConsesLow.cons( fort, v_forts );
          }
        }
        v_forts = Sequences.nreverse( v_forts );
        SubLObject stream_$32 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$33 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$32 = compatibility.open_text( Sequences.cconcatenate( directory, $str76$owl_export_unversioned_owl ), $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$33, thread );
          }
          if( !stream_$32.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str76$owl_export_unversioned_owl ) );
          }
          final SubLObject stream_$33 = stream_$32;
          final SubLObject _prev_bind_0_$34 = owlification.$fort_owl_name_table$.currentBinding( thread );
          try
          {
            owlification.$fort_owl_name_table$.bind( misc_utilities.uninitialized(), thread );
            PrintLow.format( T, $str77$__Starting_unversioned_export____ );
            final SubLObject _prev_bind_0_$35 = owlification.$owl_use_pretty_stringsP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            final SubLObject _prev_bind_5 = owlification.$owl_use_entity_referencesP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = owlification.$owl_export_from_opencyc_kbP$.currentBinding( thread );
            try
            {
              owlification.$owl_use_pretty_stringsP$.bind( T, thread );
              owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
              owlification.$owl_use_entity_referencesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.bind( T, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.bind( T, thread );
              owlification.$owl_export_from_opencyc_kbP$.bind( T, thread );
              owl_export_terms_from_iterator( iteration.new_list_iterator( v_forts ), fort_count, stream_$33, log_stream );
            }
            finally
            {
              owlification.$owl_export_from_opencyc_kbP$.rebind( _prev_bind_8, thread );
              owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.rebind( _prev_bind_7, thread );
              owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.rebind( _prev_bind_6, thread );
              owlification.$owl_use_entity_referencesP$.rebind( _prev_bind_5, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_4, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_3, thread );
              owlification.$owl_use_pretty_stringsP$.rebind( _prev_bind_0_$35, thread );
            }
            if( NIL != Filesys.directory_p( NIL ) )
            {
              owlification.write_fort_owl_name_table( NIL );
            }
          }
          finally
          {
            owlification.$fort_owl_name_table$.rebind( _prev_bind_0_$34, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$32.isStream() )
            {
              streams_high.close( stream_$32, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
          }
        }
      }
      finally
      {
        StreamsLow.$error_output$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 19986L)
  public static SubLObject owl_export_full_cyc(SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.directory_p( directory ) )
    {
      Filesys.make_directory( directory, UNPROVIDED, UNPROVIDED );
    }
    if( !string_utilities.last_char( directory ).eql( Characters.CHAR_slash ) )
    {
      directory = Sequences.cconcatenate( directory, $str70$_ );
    }
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( Sequences.cconcatenate( directory, $str71$log_txt ), $kw69$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str71$log_txt ) );
      }
      final SubLObject log_stream = stream;
      final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding( thread );
      try
      {
        StreamsLow.$error_output$.bind( log_stream, thread );
        thread.resetMultipleValues();
        final SubLObject fort_iterator = owlification.new_owl_export_term_iterator( forts.new_forts_iterator() );
        final SubLObject fort_count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject v_forts = NIL;
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject fort = iteration.iteration_next( fort_iterator );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            v_forts = ConsesLow.cons( fort, v_forts );
          }
        }
        v_forts = Sequences.nreverse( v_forts );
        SubLObject stream_$38 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$39 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$38 = compatibility.open_text( Sequences.cconcatenate( directory, $str72$owl_export_human_readable_owl ), $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$39, thread );
          }
          if( !stream_$38.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, Sequences.cconcatenate( directory, $str72$owl_export_human_readable_owl ) );
          }
          final SubLObject stream_$39 = stream_$38;
          final SubLObject _prev_bind_0_$40 = owlification.$fort_owl_name_table$.currentBinding( thread );
          try
          {
            owlification.$fort_owl_name_table$.bind( misc_utilities.uninitialized(), thread );
            PrintLow.format( T, $str73$__Starting_human_readable_export_ );
            final SubLObject _prev_bind_0_$41 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
            try
            {
              owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
              owl_uris_and_prefixes.$owl_export_version_date$.bind( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ), thread );
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == numeric_date_utilities.universal_date_p( owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ) ) )
              {
                Errors.error( $str32$Human_readable_OWL_export_require, owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ) );
              }
              owl_export_terms_from_iterator( iteration.new_list_iterator( v_forts ), fort_count, stream_$39, log_stream );
            }
            finally
            {
              owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_3, thread );
              owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_0_$41, thread );
            }
            if( NIL != Filesys.directory_p( directory ) )
            {
              owlification.write_fort_owl_name_table( directory );
            }
          }
          finally
          {
            owlification.$fort_owl_name_table$.rebind( _prev_bind_0_$40, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$38.isStream() )
            {
              streams_high.close( stream_$38, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
          }
        }
      }
      finally
      {
        StreamsLow.$error_output$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 20911L)
  public static SubLObject export_skos_taxonomy(final SubLObject taxonomy_kbq, final SubLObject directory, final SubLObject filename_root)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rdf_file = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( directory ), new SubLObject[] { format_nil.format_nil_a_no_copy( filename_root ), $str79$_rdf
    } );
    final SubLObject log_file = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( directory ), new SubLObject[] { format_nil.format_nil_a_no_copy( filename_root ), $str80$_log
    } );
    final SubLObject _prev_bind_0 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_default_namespace$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_entity_map$.currentBinding( thread );
    try
    {
      owlification.$owl_use_external_ids_for_namesP$.bind( NIL, thread );
      owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_default_namespace$.bind( owl_uris_and_prefixes.owl_opencyc_base_uri( UNPROVIDED ), thread );
      owl_uris_and_prefixes.$owl_export_entity_map$.bind( ConsesLow.list( reader.bq_cons( $str81$skos, rdf_utilities.skos_core_namespace() ), reader.bq_cons( $str82$rdf, rdf_utilities.rdf_namespace() ), reader.bq_cons(
          $str83$rdfs, rdf_utilities.rdfs_namespace() ), reader.bq_cons( $str84$cyc, owl_uris_and_prefixes.owl_cyc_base_uri( UNPROVIDED ) ), reader.bq_cons( $str85$oc, owl_uris_and_prefixes.owl_opencyc_base_uri(
              UNPROVIDED ) ) ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$44 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( rdf_file, $kw69$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$44, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str38$Unable_to_open__S, rdf_file );
        }
        final SubLObject stream_$45 = stream;
        SubLObject stream_$46 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$45 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$46 = compatibility.open_text( log_file, $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$45, thread );
          }
          if( !stream_$46.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, log_file );
          }
          final SubLObject log_stream = stream_$46;
          final SubLObject _prev_bind_0_$46 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
          try
          {
            pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$47 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
            try
            {
              pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
              final SubLObject reuseP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              try
              {
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$48 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                  final SubLObject new_or_reused = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$49 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$50 = memoization_state.$memoization_state$.currentBinding( thread );
                    try
                    {
                      memoization_state.$memoization_state$.bind( local_state, thread );
                      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                      try
                      {
                        final SubLObject asents = kb_query.new_cyc_query_from_kbq( taxonomy_kbq, UNPROVIDED, UNPROVIDED );
                        owl_export_asents( asents, NIL, stream_$45, log_stream, owl_uris_and_prefixes.owl_opencyc_base_uri( UNPROVIDED ) );
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                        }
                      }
                    }
                    finally
                    {
                      memoization_state.$memoization_state$.rebind( _prev_bind_0_$50, thread );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$49, thread );
                  }
                  if( new_or_reused == $kw86$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                  {
                    memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                  }
                }
                finally
                {
                  pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$48, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL == reuseP )
                  {
                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                }
              }
            }
            finally
            {
              pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$47, thread );
            }
          }
          finally
          {
            pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$46, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            if( stream_$46.isStream() )
            {
              streams_high.close( stream_$46, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values4 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values4 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
        }
      }
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_entity_map$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_default_namespace$.rebind( _prev_bind_3, thread );
      owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.rebind( _prev_bind_2, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_0, thread );
    }
    return rdf_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 22105L)
  public static SubLObject print_taxonomy(final SubLObject root_node, final SubLObject mt, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject indent_string = $str87$;
      print_taxonomy_internal( root_node, indent_string, stream );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 22324L)
  public static SubLObject print_taxonomy_internal(final SubLObject root_node, final SubLObject indent_string, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str88$_A_A__, indent_string, pph_utilities.add_title_capitalization( pph_main.generate_phrase( root_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    final SubLObject new_indent_string = Sequences.cconcatenate( indent_string, $str89$_ );
    final SubLObject done_preds = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject done_subnodes = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = $list105;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node_var = pred;
      final SubLObject deck_type = $kw92$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym93$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw94$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw97$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str98$continue_anyway, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw99$WARN ) )
              {
                Errors.warn( $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str100$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str98$continue_anyway, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$60 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const101$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$63 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject actual_pred = node_var_$63;
                    final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      final SubLObject inverseP = predicate_mode;
                      if( NIL != set.set_add( actual_pred, done_preds ) )
                      {
                        final SubLObject gather_index;
                        final SubLObject fan_out_arg = gather_index = kb_accessors.fan_out_arg( actual_pred, UNPROVIDED );
                        final SubLObject index_arg = Numbers.subtract( THREE_INTEGER, gather_index );
                        SubLObject narrower_term = NIL;
                        final SubLObject pred_var = actual_pred;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( root_node, index_arg, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( root_node, index_arg, pred_var );
                          SubLObject done_var = NIL;
                          final SubLObject token_var = NIL;
                          while ( NIL == done_var)
                          {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                            if( NIL != valid )
                            {
                              SubLObject final_index_iterator = NIL;
                              try
                              {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw60$GAF, $kw61$TRUE, NIL );
                                SubLObject done_var_$65 = NIL;
                                final SubLObject token_var_$66 = NIL;
                                while ( NIL == done_var_$65)
                                {
                                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                                  final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( assertion ) );
                                  if( NIL != valid_$67 )
                                  {
                                    narrower_term = assertions_high.gaf_arg( assertion, gather_index );
                                    if( NIL != set.set_add( narrower_term, done_subnodes ) )
                                    {
                                      print_taxonomy_internal( narrower_term, new_indent_string, stream );
                                    }
                                  }
                                  done_var_$65 = makeBoolean( NIL == valid_$67 );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values = Values.getValuesAsVector();
                                  if( NIL != final_index_iterator )
                                  {
                                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                  }
                                  Values.restoreValuesFromVector( _values );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid );
                          }
                        }
                      }
                      SubLObject cdolist_list_var_$69;
                      final SubLObject accessible_modules = cdolist_list_var_$69 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var_$69.first();
                      while ( NIL != cdolist_list_var_$69)
                      {
                        final SubLObject _prev_bind_0_$62 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$63 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$73;
                                      for( iteration_state_$73 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$73 ); iteration_state_$73 = dictionary_contents.do_dictionary_contents_next( iteration_state_$73 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$73 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str102$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$64, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$73 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$63, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str103$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$70;
                            final SubLObject new_list = cdolist_list_var_$70 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$70.first();
                            while ( NIL != cdolist_list_var_$70)
                            {
                              final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str102$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$65, thread );
                              }
                              cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                              generating_fn = cdolist_list_var_$70.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$61, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$62, thread );
                        }
                        cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                        module_var = cdolist_list_var_$69.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$60, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$62, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$60, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$59, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str104$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$59, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$58, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$57, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 23197L)
  public static SubLObject gather_taxonomy_terms(final SubLObject root_node, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject terms = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      gather_taxonomy_terms_internal( root_node, terms );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 23389L)
  public static SubLObject gather_taxonomy_terms_internal(final SubLObject root_node, final SubLObject terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject done_preds = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = $list105;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node_var = pred;
      final SubLObject deck_type = $kw92$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym93$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw94$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw97$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str98$continue_anyway, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw99$WARN ) )
              {
                Errors.warn( $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str100$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str98$continue_anyway, $str95$_A_is_not_a__A, tv_var, $sym96$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$81 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const101$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$84 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject actual_pred = node_var_$84;
                    final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      final SubLObject inverseP = predicate_mode;
                      if( NIL != set.set_add( actual_pred, done_preds ) )
                      {
                        final SubLObject gather_index;
                        final SubLObject fan_out_arg = gather_index = kb_accessors.fan_out_arg( actual_pred, UNPROVIDED );
                        final SubLObject index_arg = Numbers.subtract( THREE_INTEGER, gather_index );
                        SubLObject narrower_term = NIL;
                        final SubLObject pred_var = actual_pred;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( root_node, index_arg, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( root_node, index_arg, pred_var );
                          SubLObject done_var = NIL;
                          final SubLObject token_var = NIL;
                          while ( NIL == done_var)
                          {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                            if( NIL != valid )
                            {
                              SubLObject final_index_iterator = NIL;
                              try
                              {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw60$GAF, $kw61$TRUE, NIL );
                                SubLObject done_var_$86 = NIL;
                                final SubLObject token_var_$87 = NIL;
                                while ( NIL == done_var_$86)
                                {
                                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$87 );
                                  final SubLObject valid_$88 = makeBoolean( !token_var_$87.eql( assertion ) );
                                  if( NIL != valid_$88 )
                                  {
                                    narrower_term = assertions_high.gaf_arg( assertion, gather_index );
                                    if( NIL != set.set_add( narrower_term, terms ) )
                                    {
                                      gather_taxonomy_terms_internal( narrower_term, terms );
                                    }
                                  }
                                  done_var_$86 = makeBoolean( NIL == valid_$88 );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values = Values.getValuesAsVector();
                                  if( NIL != final_index_iterator )
                                  {
                                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                                  }
                                  Values.restoreValuesFromVector( _values );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid );
                          }
                        }
                      }
                      SubLObject cdolist_list_var_$90;
                      final SubLObject accessible_modules = cdolist_list_var_$90 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const101$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var_$90.first();
                      while ( NIL != cdolist_list_var_$90)
                      {
                        final SubLObject _prev_bind_0_$83 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$84 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$94;
                                      for( iteration_state_$94 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$94 ); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next( iteration_state_$94 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$94 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str102$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$85, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$94 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$84, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str103$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$91;
                            final SubLObject new_list = cdolist_list_var_$91 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$91.first();
                            while ( NIL != cdolist_list_var_$91)
                            {
                              final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str102$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$86, thread );
                              }
                              cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                              generating_fn = cdolist_list_var_$91.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$82, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$83, thread );
                        }
                        cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                        module_var = cdolist_list_var_$90.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$81, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$83, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$81, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$80, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str104$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$80, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$79, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$78, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 24057L)
  public static SubLObject gather_assertions_for_terms(final SubLObject terms, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertions = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject set_contents_var = set.do_set_internal( terms );
      SubLObject basis_object;
      SubLObject state;
      SubLObject v_term;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        v_term = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, v_term ) )
        {
          gather_assertions_for_term_wrt_terms( v_term, terms, assertions );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 24288L)
  public static SubLObject gather_assertions_for_term_wrt_terms(final SubLObject v_term, final SubLObject terms, final SubLObject assertions)
  {
    final SubLObject pred_var = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw60$GAF, NIL, NIL );
            SubLObject done_var_$99 = NIL;
            final SubLObject token_var_$100 = NIL;
            while ( NIL == done_var_$99)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$100 );
              final SubLObject valid_$101 = makeBoolean( !token_var_$100.eql( gaf ) );
              if( NIL != valid_$101 )
              {
                SubLObject badP = NIL;
                final SubLObject args = cycl_utilities.formula_args( gaf, $kw106$IGNORE );
                SubLObject rest;
                SubLObject arg;
                for( rest = NIL, rest = args; NIL == badP && NIL != rest; rest = rest.rest() )
                {
                  arg = rest.first();
                  if( !arg.equal( v_term ) && !arg.isString() && !arg.isNumber() && NIL == set.set_memberP( arg, terms ) )
                  {
                    badP = T;
                  }
                }
                if( NIL == badP )
                {
                  set.set_add( gaf, assertions );
                }
              }
              done_var_$99 = makeBoolean( NIL == valid_$101 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 24654L)
  public static SubLObject export_skos_taxonomy_from_asents(final SubLObject asents, final SubLObject directory, final SubLObject filename_root)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rdf_file = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( directory ), new SubLObject[] { format_nil.format_nil_a_no_copy( filename_root ), $str79$_rdf
    } );
    final SubLObject log_file = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( directory ), new SubLObject[] { format_nil.format_nil_a_no_copy( filename_root ), $str80$_log
    } );
    final SubLObject _prev_bind_0 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owlification.$owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = owl_uris_and_prefixes.$owl_export_default_namespace$.currentBinding( thread );
    final SubLObject _prev_bind_5 = owl_uris_and_prefixes.$owl_export_entity_map$.currentBinding( thread );
    try
    {
      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
      owlification.$owl_use_external_ids_for_namesP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.bind( T, thread );
      owl_uris_and_prefixes.$owl_export_default_namespace$.bind( owl_uris_and_prefixes.owl_opencyc_base_uri( UNPROVIDED ), thread );
      owl_uris_and_prefixes.$owl_export_entity_map$.bind( ConsesLow.list( reader.bq_cons( $str81$skos, rdf_utilities.skos_core_namespace() ), reader.bq_cons( $str82$rdf, rdf_utilities.rdf_namespace() ), reader.bq_cons(
          $str83$rdfs, rdf_utilities.rdfs_namespace() ), reader.bq_cons( $str84$cyc, owl_uris_and_prefixes.owl_cyc_base_uri( UNPROVIDED ) ), reader.bq_cons( $str85$oc, owl_uris_and_prefixes.owl_opencyc_base_uri(
              UNPROVIDED ) ) ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$102 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( rdf_file, $kw69$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$102, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str38$Unable_to_open__S, rdf_file );
        }
        final SubLObject stream_$103 = stream;
        SubLObject stream_$104 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$103 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$104 = compatibility.open_text( log_file, $kw69$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$103, thread );
          }
          if( !stream_$104.isStream() )
          {
            Errors.error( $str38$Unable_to_open__S, log_file );
          }
          final SubLObject log_stream = stream_$104;
          owl_export_asents( asents, NIL, stream_$103, log_stream, owl_uris_and_prefixes.owl_opencyc_base_uri( UNPROVIDED ) );
        }
        finally
        {
          final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$104.isStream() )
            {
              streams_high.close( stream_$104, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$105, thread );
        }
      }
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_entity_map$.rebind( _prev_bind_5, thread );
      owl_uris_and_prefixes.$owl_export_default_namespace$.rebind( _prev_bind_4, thread );
      owl_uris_and_prefixes.$owl_export_suppress_ontology_nodeP$.rebind( _prev_bind_3, thread );
      owlification.$owl_use_external_ids_for_namesP$.rebind( _prev_bind_2, thread );
      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_0, thread );
    }
    return rdf_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 25486L)
  public static SubLObject owl_export_terms_from_iterator(final SubLObject term_iterator, final SubLObject term_count, SubLObject stream, SubLObject log_stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    if( log_stream == UNPROVIDED )
    {
      log_stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( log_stream, $str107$__Exporting__D_Terms_from_iterato, term_count );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$108 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        final SubLObject _prev_bind_4 = StreamsLow.$error_output$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, FOUR_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          StreamsLow.$error_output$.bind( log_stream, thread );
          write_owl_header( stream );
          write_cyc_annotation_property_definitions( stream, UNPROVIDED );
          final SubLObject _prev_bind_0_$109 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_terpri();
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0_$109, thread );
          }
          SubLObject done_term_count = ZERO_INTEGER;
          SubLObject asent_count = ZERO_INTEGER;
          final SubLObject _prev_bind_0_$110 = StreamsLow.$standard_output$.currentBinding( thread );
          try
          {
            StreamsLow.$standard_output$.bind( log_stream, thread );
            final SubLObject progress_message = Sequences.cconcatenate( $str108$exporting_, new SubLObject[] { format_nil.format_nil_a_no_copy( term_count ), $str109$_terms_to_OWL
            } );
            final SubLObject _prev_bind_0_$111 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
            final SubLObject _prev_bind_1_$112 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
            final SubLObject _prev_bind_2_$113 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
            final SubLObject _prev_bind_3_$114 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
              utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
              utilities_macros.$within_noting_percent_progress$.bind( T, thread );
              utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
              try
              {
                utilities_macros.noting_percent_progress_preamble( progress_message );
                final SubLObject _prev_bind_0_$112 = owlification.$owl_export_terms$.currentBinding( thread );
                try
                {
                  owlification.$owl_export_terms$.bind( set.new_set( Symbols.symbol_function( EQUAL ), term_count ), thread );
                  SubLObject term_list = NIL;
                  SubLObject valid;
                  for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_term = iteration.iteration_next( term_iterator );
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != valid )
                    {
                      set.set_add( v_term, owlification.$owl_export_terms$.getDynamicValue( thread ) );
                      term_list = ConsesLow.cons( v_term, term_list );
                    }
                  }
                  final SubLObject iterator_var = iteration.new_list_iterator( Sequences.nreverse( term_list ) );
                  SubLObject valid2;
                  for( SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean( NIL == valid2 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject fort = iteration.iteration_next( iterator_var );
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != valid2 )
                    {
                      asent_count = Numbers.add( asent_count, owl_export_one_term( fort, stream, log_stream ) );
                      done_term_count = Numbers.add( done_term_count, ONE_INTEGER );
                      utilities_macros.note_percent_progress( done_term_count, term_count );
                    }
                  }
                }
                finally
                {
                  owlification.$owl_export_terms$.rebind( _prev_bind_0_$112, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  utilities_macros.noting_percent_progress_postamble();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$113, thread );
                }
              }
            }
            finally
            {
              utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3_$114, thread );
              utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$113, thread );
              utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$112, thread );
              utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$111, thread );
            }
            PrintLow.format( log_stream, $str110$__Exported__D_Terms_and__D_senten, done_term_count, asent_count );
          }
          finally
          {
            StreamsLow.$standard_output$.rebind( _prev_bind_0_$110, thread );
          }
          write_owl_footer( stream );
        }
        finally
        {
          StreamsLow.$error_output$.rebind( _prev_bind_4, thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$108, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 26551L)
  public static SubLObject owl_export_one_term(final SubLObject v_term, SubLObject stream, SubLObject log_stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    if( log_stream == UNPROVIDED )
    {
      log_stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject term_chunk = NIL;
    SubLObject emptyP = NIL;
    SubLObject err_msg = NIL;
    final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding( thread );
    try
    {
      StreamsLow.$error_output$.bind( log_stream, thread );
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0_$118 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym111$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            term_chunk = owlification.owl_cyclify_term( v_term );
            emptyP = empty_owl_term_chunk_p( term_chunk );
            if( NIL != subl_promotions.positive_integer_p( owlification.$owl_export_cap_per_category$.getDynamicValue( thread ) ) )
            {
              PrintLow.format( log_stream, $str112$___S___D_sentences___, v_term, Sequences.length( term_chunk ) );
            }
            if( NIL == emptyP )
            {
              write_owl_term_chunk( term_chunk, stream );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$118, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != err_msg )
      {
        Errors.warn( err_msg );
      }
    }
    finally
    {
      StreamsLow.$error_output$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != emptyP ) ? ZERO_INTEGER : Sequences.length( term_chunk );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 27158L)
  public static SubLObject empty_owl_term_chunk_p(final SubLObject term_chunk)
  {
    return makeBoolean( NIL != list_utilities.empty_list_p( term_chunk ) || ( NIL != list_utilities.lengthE( term_chunk, ONE_INTEGER, UNPROVIDED ) && rdf_utilities.rdf_name( $str113$Description ).equal( conses_high
        .second( term_chunk.first() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 27352L)
  public static SubLObject owl_export_term_chunk(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLObject term_chunk = owlification.owl_cyclify_term( fort );
    write_owl_term_chunk( term_chunk, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 27554L)
  public static SubLObject write_owl_header(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLObject comment = get_owl_ontology_comment();
    print_high.princ( owl_xml_header_first_half( list_utilities.sublisp_boolean( comment ) ), stream );
    if( NIL != string_utilities.non_empty_string_p( comment ) )
    {
      print_high.princ( owl_export_version_info(), stream );
      print_high.princ( owl_xml_ontology_comment_and_close_tag( comment ), stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 27937L)
  public static SubLObject write_owl_footer(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    return PrintLow.format( stream, $str114$_a, $owl_xml_footer$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 28113L)
  public static SubLObject owl_export_version_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( $str116$_________owl_versionInfo_Version_, new SubLObject[] { format_nil.format_nil_a_no_copy( $owl_export_version_string$.getDynamicValue( thread ) ), $str117$__owl_versionInfo_______
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 28287L)
  public static SubLObject owl_xml_header_first_half(final SubLObject include_ontology_headerP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject output_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      print_high.princ( Sequences.cconcatenate( $str118$__xml_version__1_0__encoding__UTF, new SubLObject[] { string_utilities.$new_line_string$.getGlobalValue(), owl_export_doctype_element(),
        $str119$_rdf_RDF_xml_base__, owl_uris_and_prefixes.owl_export_base_uri( UNPROVIDED ), $str39$_, string_utilities.$new_line_string$.getGlobalValue(), $str120$____xmlns__, owl_uris_and_prefixes
            .possibly_use_entity_reference( owl_uris_and_prefixes.owl_export_default_namespace() ), $str39$_
      } ), stream );
      SubLObject cdolist_list_var = owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue( thread );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject prefix = NIL;
        SubLObject uri = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
        prefix = current.first();
        current = ( uri = current.rest() );
        PrintLow.format( stream, $str122$______xmlns__A__S, prefix, ( NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue( thread ) ) ? Sequences.cconcatenate( $str123$_, new SubLObject[] { prefix, $str124$_
        } ) : uri );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      PrintLow.format( stream, $str125$_____ );
      if( NIL != include_ontology_headerP )
      {
        PrintLow.format( stream, $str126$_____owl_Ontology_rdf_about______ );
      }
      output_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 29067L)
  public static SubLObject owl_export_doctype_element()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue( thread ) )
    {
      SubLObject output_string = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( stream, thread );
          write_rdf_doctype_declaration( owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue( thread ) );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        output_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      return output_string;
    }
    return string_utilities.$empty_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 29336L)
  public static SubLObject write_owl_term_chunk(final SubLObject owl_cycl_term_chunk, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_empty_list_p( owl_cycl_term_chunk ) : owl_cycl_term_chunk;
    final SubLObject _prev_bind_0 = xml_vars.$xml_document_entity_names$.currentBinding( thread );
    try
    {
      xml_vars.$xml_document_entity_names$.bind( list_utilities.alist_keys( owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue( thread ) ), thread );
      SubLObject v_term = NIL;
      SubLObject owl_cycl_asents = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( owl_cycl_term_chunk, owl_cycl_term_chunk, $list128 );
      v_term = owl_cycl_term_chunk.first();
      final SubLObject current = owl_cycl_asents = owl_cycl_term_chunk.rest();
      final SubLObject _prev_bind_0_$119 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.xml_terpri();
        final SubLObject atomicP = list_utilities.empty_list_p( owl_cycl_asents );
        xml_write_owl_term_open_tag( v_term, ONE_INTEGER, atomicP, UNPROVIDED );
        xml_utilities.xml_terpri();
        SubLObject cdolist_list_var = owl_cycl_asents;
        SubLObject owl_cycl_asent = NIL;
        owl_cycl_asent = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred = cycl_utilities.formula_operator( owl_cycl_asent );
          final SubLObject pred_name = cycl_utilities.formula_arg1( pred, UNPROVIDED );
          final SubLObject element_name = xml_element_name_from_uri( pred_name );
          final SubLObject arg2 = cycl_utilities.formula_arg2( owl_cycl_asent, UNPROVIDED );
          PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str114$_a, owl_space( TWO_INTEGER ) );
          xml_write_owl_asent( element_name, arg2, UNPROVIDED );
          xml_utilities.xml_terpri();
          cdolist_list_var = cdolist_list_var.rest();
          owl_cycl_asent = cdolist_list_var.first();
        }
        if( NIL == atomicP )
        {
          PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str114$_a, owl_term_close_tag( v_term, ONE_INTEGER ) );
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0_$119, thread );
      }
    }
    finally
    {
      xml_vars.$xml_document_entity_names$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 30396L)
  public static SubLObject xml_write_owl_term_open_tag(final SubLObject v_term, final SubLObject indent_level, final SubLObject standalone_tagP, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      final SubLObject term_type = cycl_utilities.formula_arg1( v_term, UNPROVIDED );
      final SubLObject element_name = xml_element_name_from_uri( term_type );
      final SubLObject term_name = cycl_utilities.formula_arg2( v_term, UNPROVIDED );
      SubLObject attributes = NIL;
      if( NIL != string_utilities.starts_with( term_name, owl_uris_and_prefixes.owl_export_default_namespace() ) && Characters.CHAR_hash.eql( string_utilities.last_char( owl_uris_and_prefixes
          .owl_export_default_namespace() ) ) )
      {
        attributes = ConsesLow.list( rdf_utilities.rdf_name( $str129$ID ), string_utilities.pre_remove( term_name, owl_uris_and_prefixes.owl_export_default_namespace(), UNPROVIDED ) );
      }
      else if( NIL == web_utilities.uri_p( term_name, UNPROVIDED ) && Characters.CHAR_hash.eql( string_utilities.last_char( owl_uris_and_prefixes.owl_export_default_namespace() ) ) )
      {
        attributes = ConsesLow.list( rdf_utilities.rdf_name( $str129$ID ), term_name );
      }
      else
      {
        attributes = ConsesLow.list( rdf_utilities.rdf_name( $str130$about ), possibly_abbreviate_attribute_value_uri( term_name ) );
      }
      if( attributes.first().equal( rdf_utilities.rdf_name( $str129$ID ) ) )
      {
        enforceType( conses_high.second( attributes ), $sym131$VALID_XML_NAME_P );
      }
      xml_utilities.xml_write_string( owl_space( indent_level ), UNPROVIDED, UNPROVIDED );
      xml_utilities.xml_start_tag_internal( element_name, attributes, standalone_tagP, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 31447L)
  public static SubLObject xml_element_name_from_uri(final SubLObject term_type)
  {
    if( NIL != string_utilities.starts_with( term_type, owl_uris_and_prefixes.owl_export_default_namespace() ) )
    {
      return string_utilities.pre_remove( term_type, owl_uris_and_prefixes.owl_export_default_namespace(), UNPROVIDED );
    }
    if( NIL == xml_utilities.valid_xml_name_p( term_type ) )
    {
      Errors.error( $str132$Invalid_XML_name___S___Default_na, term_type, owl_uris_and_prefixes.owl_export_default_namespace() );
      return NIL;
    }
    return term_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 31803L)
  public static SubLObject possibly_abbreviate_attribute_value_uri(final SubLObject uri)
  {
    return ( NIL != string_utilities.starts_with( uri, owl_uris_and_prefixes.owl_export_base_uri( UNPROVIDED ) ) ) ? string_utilities.pre_remove( uri, owl_uris_and_prefixes.owl_export_base_uri( UNPROVIDED ), UNPROVIDED )
        : owl_uris_and_prefixes.possibly_use_entity_reference( uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 32006L)
  public static SubLObject owl_term_close_tag(final SubLObject v_term, final SubLObject indent_level)
  {
    final SubLObject term_type = cycl_utilities.formula_arg1( v_term, UNPROVIDED );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( owl_space( indent_level ) ), new SubLObject[] { $str133$__, format_nil.format_nil_a_no_copy( xml_element_name_from_uri( term_type ) ), $str134$_,
      format_nil.$format_nil_percent$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 32204L)
  public static SubLObject xml_write_owl_asent(final SubLObject tag, SubLObject value, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( tag, $sym131$VALID_XML_NAME_P );
    if( value.isString() && NIL != Sequences.search( $str135$_u, value, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject utf8 = unicode_strings.display_to_utf8_string( value );
      if( NIL != utf8 )
      {
        value = utf8;
      }
    }
    if( value.isString() && NIL != Sequences.find( Characters.CHAR_less, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      value = string_utilities.string_substitute( $str136$_p__, $str137$_p_, value, Symbols.symbol_function( EQUALP ) );
    }
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      xml_write_owl_element( tag, value );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 32745L)
  public static SubLObject xml_write_owl_element(final SubLObject tag, final SubLObject value)
  {
    SubLObject attributes = conses_high.copy_list( list_utilities.alist_lookup( owl_tag_attributes(), tag, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    if( value.isString() && NIL != list_utilities.member_equalP( tag, $owl_standalone_resource_tags$.getGlobalValue() ) )
    {
      xml_utilities.xml_start_tag_internal( tag, ConsesLow.list( $str138$rdf_resource, value ), T, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( value, $const139$OWLURIFn ) )
    {
      xml_utilities.xml_start_tag_internal( tag, ConsesLow.list( $str138$rdf_resource, possibly_abbreviate_attribute_value_uri( cycl_utilities.nat_arg1( value, UNPROVIDED ) ) ), T, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( value, $const140$OWLDatatypeFn ) )
    {
      attributes = conses_high.putf( attributes, $str141$rdf_datatype, cycl_utilities.nat_arg1( value, UNPROVIDED ) );
      xml_utilities.xml_start_tag_internal( tag, attributes, NIL, UNPROVIDED, UNPROVIDED );
      xml_utilities.xml_write_wXescaped_special_chars( cycl_utilities.nat_arg2( value, UNPROVIDED ) );
      xml_utilities.xml_end_tag_internal( tag );
    }
    else
    {
      xml_utilities.xml_start_tag_internal( tag, attributes, NIL, UNPROVIDED, UNPROVIDED );
      if( tag.equal( $str142$owl_intersectionOf ) )
      {
        xml_write_owl_intersection_value_string( value, UNPROVIDED );
      }
      else if( Sequences.count_if( $sym143$XML_SPECIAL_CHAR_, value, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numG( FOUR_INTEGER ) )
      {
        xml_utilities.xml_cdata( value );
      }
      else
      {
        xml_utilities.xml_write_wXescaped_special_chars( value );
      }
      xml_utilities.xml_end_tag_internal( tag );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 33701L)
  public static SubLObject with_owl_export_indentation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject level = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list144 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym145$CLET, ConsesLow.list( $list146, ConsesLow.list( $sym147$_XML_INDENTATION_LEVEL_, ConsesLow.listS( $sym148$_, level, $list149 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 33935L)
  public static SubLObject xml_write_owl_intersection_value_string(final SubLObject intersection_naut, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject owl_intersection_fn = NIL;
    SubLObject class_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( intersection_naut, intersection_naut, $list150 );
    owl_intersection_fn = intersection_naut.first();
    SubLObject current = intersection_naut.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    class_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject owl_restriction_fn = NIL;
    SubLObject owl_restriction = NIL;
    SubLObject owl_on_property = NIL;
    SubLObject property = NIL;
    SubLObject owl_has_value = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    owl_restriction_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    owl_restriction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    owl_on_property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    owl_has_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, intersection_naut, $list150 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( stream, thread );
          xml_utilities.xml_terpri();
          xml_write_owl_term_open_tag( class_term, THREE_INTEGER, T, UNPROVIDED );
          final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_amount$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_amount$.bind( Sequences.length( $owl_xml_spacer$.getGlobalValue() ), thread );
            xml_utilities.$xml_indentation_level$.bind( Numbers.multiply( TWO_INTEGER, xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ) ), thread );
            final SubLObject _prev_bind_0_$121 = xml_utilities.$xml_indentation_amount$.currentBinding( thread );
            final SubLObject _prev_bind_1_$122 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_amount$.bind( Sequences.length( $owl_xml_spacer$.getGlobalValue() ), thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.multiply( THREE_INTEGER, xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ) ), thread );
              xml_utilities.xml_terpri();
              try
              {
                final SubLObject _prev_bind_0_$122 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$123 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( owl_restriction, NIL, NIL, NIL, $kw151$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$123 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw151$UNINITIALIZED, thread );
                    xml_utilities.xml_terpri();
                    xml_write_owl_element( owl_on_property, property );
                    xml_utilities.xml_terpri();
                    xml_write_owl_element( owl_has_value, value );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$123, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$123, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$122, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( owl_restriction );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$124, thread );
                }
              }
            }
            finally
            {
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$122, thread );
              xml_utilities.$xml_indentation_amount$.rebind( _prev_bind_0_$121, thread );
            }
            xml_utilities.xml_terpri();
          }
          finally
          {
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_amount$.rebind( _prev_bind_0_$120, thread );
          }
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( intersection_naut, $list150 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( intersection_naut, $list150 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 34671L)
  public static SubLObject owl_space(final SubLObject n)
  {
    if( n.eql( ONE_INTEGER ) )
    {
      return $owl_xml_spacer$.getGlobalValue();
    }
    if( n.eql( TWO_INTEGER ) )
    {
      return $owl_xml_spacer_2$.getGlobalValue();
    }
    if( n.eql( THREE_INTEGER ) )
    {
      return $owl_xml_spacer_3$.getGlobalValue();
    }
    if( n.eql( FOUR_INTEGER ) )
    {
      return $owl_xml_spacer_4$.getGlobalValue();
    }
    if( n.eql( FIVE_INTEGER ) )
    {
      return $owl_xml_spacer_5$.getGlobalValue();
    }
    return Errors.error( $str152$OWL_indent_level_too_high );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 34988L)
  public static SubLObject owl_reference(final SubLObject string)
  {
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 35158L)
  public static SubLObject fort_in_owl_exportP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( fort ) )
    {
      return NIL;
    }
    if( NIL != set.set_p( owlification.$owl_export_terms$.getDynamicValue( thread ) ) && NIL != set.set_memberP( fort, owlification.$owl_export_terms$.getDynamicValue( thread ) ) )
    {
      return T;
    }
    if( NIL != set.set_p( owlification.$owl_export_terms$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    if( NIL != forts.fort_p( fort ) )
    {
      warn_exporting_unverified_fort( fort );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 35535L)
  public static SubLObject warn_exporting_unverified_fort_internal(final SubLObject fort)
  {
    Errors.warn( $str154$Assuming__S_is_OK_to_export, fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 35535L)
  public static SubLObject warn_exporting_unverified_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return warn_exporting_unverified_fort_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym153$WARN_EXPORTING_UNVERIFIED_FORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym153$WARN_EXPORTING_UNVERIFIED_FORT, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym153$WARN_EXPORTING_UNVERIFIED_FORT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( warn_exporting_unverified_fort_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 36584L)
  public static SubLObject cyc_annotation_external_prefix_p(final SubLObject obj)
  {
    return Sequences.find( obj, $cyc_annotation_external_prefixes$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 36703L)
  public static SubLObject make_cyc_annotation_entity_map()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.remove_if_not( $sym157$CYC_ANNOTATION_EXTERNAL_PREFIX_P, owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue( thread ), Symbols.symbol_function( $sym158$CAR ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 36843L)
  public static SubLObject cyc_annotation_namespace_pairs()
  {
    SubLObject pairs = NIL;
    SubLObject cdolist_list_var = $cyc_annotation_external_prefixes$.getGlobalValue();
    SubLObject prefix = NIL;
    prefix = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pairs = ConsesLow.cons( Sequences.cconcatenate( $str159$xmlns_, prefix ), pairs );
      pairs = ConsesLow.cons( Sequences.cconcatenate( $str123$_, new SubLObject[] { prefix, $str124$_
      } ), pairs );
      cdolist_list_var = cdolist_list_var.rest();
      prefix = cdolist_list_var.first();
    }
    return Sequences.nreverse( pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 37103L)
  public static SubLObject write_cyc_annotation_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw69$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, filename );
      }
      final SubLObject stream_$127 = stream;
      write_cyc_annotation_document( stream_$127 );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 37270L)
  public static SubLObject write_cyc_annotation_document(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      xml_utilities.xml_header( UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject map = make_cyc_annotation_entity_map();
      write_rdf_doctype_declaration( map );
      try
      {
        final SubLObject _prev_bind_0_$128 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str160$rdf_RDF, ConsesLow.listS( $str161$xml_base, owl_uris_and_prefixes.cyc_annotation_base_uri(), $str162$xmlns, owl_uris_and_prefixes.cyc_annotation_base_uri(),
              cyc_annotation_namespace_pairs() ), NIL, NIL, $kw151$UNINITIALIZED );
          final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw151$UNINITIALIZED, thread );
            write_cyc_annotation_property_definitions( stream, T );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$129, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$128, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str160$rdf_RDF );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$130, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 37734L)
  public static SubLObject write_rdf_doctype_declaration(SubLObject entity_map)
  {
    if( entity_map == UNPROVIDED )
    {
      entity_map = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    xml_utilities.xml_write_string( $str163$__DOCTYPE_rdf_RDF, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.non_empty_list_p( entity_map ) )
    {
      PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str164$____ );
      final SubLObject longest_prefix = number_utilities.maximum( list_utilities.alist_keys( entity_map ), Symbols.symbol_function( $sym165$LENGTH ) );
      final SubLObject format_string = Sequences.cconcatenate( $str166$_______ENTITY__, new SubLObject[] { print_high.princ_to_string( Sequences.length( longest_prefix ) ), $str167$A__S____
      } );
      SubLObject cdolist_list_var = entity_map;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject prefix = NIL;
        SubLObject uri = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
        prefix = current.first();
        current = ( uri = current.rest() );
        if( NIL == string_utilities.empty_string_p( prefix ) )
        {
          PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), format_string, prefix, uri );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      xml_utilities.xml_write_string( $str168$____, UNPROVIDED, UNPROVIDED );
    }
    xml_utilities.xml_write_string( $str134$_, UNPROVIDED, UNPROVIDED );
    xml_utilities.xml_terpri();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 38287L)
  public static SubLObject write_cyc_annotation_property_definitions(SubLObject stream, SubLObject standaloneP)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    if( standaloneP == UNPROVIDED )
    {
      standaloneP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      SubLObject cdolist_list_var = $cyc_annotation_properties$.getGlobalValue();
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == annotation_property_definitely_not_in_exportP( spec.first() ) )
        {
          write_cyc_annotation_property_definition( spec, standaloneP );
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 38642L)
  public static SubLObject annotation_property_definitely_not_in_exportP(final SubLObject property_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != misc_utilities.initialized_p( owlification.$owl_asents_to_export$.getDynamicValue( thread ) ) )
    {
      SubLObject foundP;
      SubLObject rest;
      SubLObject cons;
      SubLObject current;
      SubLObject datum;
      SubLObject cycl;
      SubLObject prefixed_name;
      SubLObject iteration_state;
      SubLObject key;
      SubLObject asents;
      for( foundP = NIL, rest = NIL, rest = owlification.owl_cycl_predicate_table( UNPROVIDED ); NIL == foundP && NIL != rest; rest = rest.rest() )
      {
        cons = rest.first();
        datum = ( current = cons );
        cycl = NIL;
        prefixed_name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list169 );
        cycl = current.first();
        current = ( prefixed_name = current.rest() );
        if( NIL != string_utilities.ends_with( prefixed_name, property_name, UNPROVIDED ) && NIL != string_utilities.starts_with( prefixed_name, owl_uris_and_prefixes.cyc_annotation_prefix() ) && NIL != list_utilities
            .lengthE( prefixed_name, Numbers.add( Sequences.length( property_name ), Sequences.length( owl_uris_and_prefixes.cyc_annotation_prefix() ), ONE_INTEGER ), UNPROVIDED ) )
        {
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( owlification.$owl_asents_to_export$.getDynamicValue( thread ) ) ); NIL == foundP
              && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            asents = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != Sequences.find( cycl, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym170$ATOMIC_SENTENCE_PREDICATE ), UNPROVIDED, UNPROVIDED ) )
            {
              foundP = T;
            }
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        }
      }
      if( NIL == foundP )
      {
        ans = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-cycl-to-xml.lisp", position = 39324L)
  public static SubLObject write_cyc_annotation_property_definition(final SubLObject spec, SubLObject standaloneP)
  {
    if( standaloneP == UNPROVIDED )
    {
      standaloneP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject local_name = NIL;
    SubLObject comment = NIL;
    SubLObject functionalP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( spec, spec, $list171 );
    local_name = spec.first();
    SubLObject current = spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, spec, $list171 );
    comment = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, spec, $list171 );
    functionalP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject name = ( NIL != standaloneP ) ? local_name
          : ( ( NIL != owlification.$owl_use_entity_referencesP$.getDynamicValue( thread ) ) ? Sequences.cconcatenate( $str123$_, new SubLObject[]
          { owl_uris_and_prefixes.cyc_annotation_prefix(), $str124$_, local_name
          } ) : Sequences.cconcatenate( owl_uris_and_prefixes.cyc_annotation_base_uri(), local_name ) );
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_amount$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_amount$.bind( Sequences.length( $owl_xml_spacer$.getGlobalValue() ), thread );
        xml_utilities.$xml_indentation_level$.bind( Numbers.multiply( ONE_INTEGER, xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ) ), thread );
        xml_utilities.xml_terpri();
        try
        {
          final SubLObject _prev_bind_0_$131 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_1_$132 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( owl_utilities.owl_name( $str172$AnnotationProperty ), ConsesLow.list( rdf_utilities.rdf_name( ( NIL != standaloneP ) ? $str129$ID : $str130$about ), name ), NIL, NIL,
                $kw151$UNINITIALIZED );
            final SubLObject _prev_bind_0_$132 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw151$UNINITIALIZED, thread );
              xml_utilities.xml_terpri();
              SubLObject name_var = rdf_utilities.rdfs_name( $str173$label );
              xml_utilities.xml_start_tag_internal( name_var, reader.bq_cons( owl_to_cycl.xml_name( $str174$lang ), $list175 ), NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_print( local_name, UNPROVIDED );
              xml_utilities.xml_end_tag_internal( name_var );
              xml_utilities.xml_terpri();
              name_var = rdf_utilities.rdfs_name( $str176$comment );
              xml_utilities.xml_start_tag_internal( name_var, reader.bq_cons( owl_to_cycl.xml_name( $str174$lang ), $list175 ), NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_print( comment, UNPROVIDED );
              xml_utilities.xml_end_tag_internal( name_var );
              if( NIL != functionalP )
              {
                xml_utilities.xml_terpri();
                xml_utilities.xml_start_tag_internal( rdf_utilities.rdf_name( $str177$type ), ConsesLow.list( rdf_utilities.rdf_name( $str178$resource ), owl_utilities.owl_name( $str179$FunctionalProperty ) ), T,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$132, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$132, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$131, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$133 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( owl_utilities.owl_name( $str172$AnnotationProperty ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$133, thread );
          }
        }
      }
      finally
      {
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_amount$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( spec, $list171 );
    }
    return NIL;
  }

  public static SubLObject declare_owl_cycl_to_xml_file()
  {
    SubLFiles.declareFunction( me, "owl_xml_ontology_comment_and_close_tag", "OWL-XML-ONTOLOGY-COMMENT-AND-CLOSE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "get_owl_ontology_comment", "GET-OWL-ONTOLOGY-COMMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_owl_tag_attributes", "CLEAR-OWL-TAG-ATTRIBUTES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl_tag_attributes", "REMOVE-OWL-TAG-ATTRIBUTES", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_tag_attributes_internal", "OWL-TAG-ATTRIBUTES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_tag_attributes", "OWL-TAG-ATTRIBUTES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_opencyc_uri_pattern", "GET-OPENCYC-URI-PATTERN", 0, 0, false );
    SubLFiles.declareFunction( me, "get_cyc_uri_pattern", "GET-CYC-URI-PATTERN", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_uri_patterns", "GET-ALL-URI-PATTERNS", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_uri_p", "CYC-URI-P", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyc_uri_for_fort", "OWL-CYC-URI-FOR-FORT", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_cyc_uri_for_cyc_term_internal", "OWL-CYC-URI-FOR-CYC-TERM-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_cyc_uri_for_cyc_term", "OWL-CYC-URI-FOR-CYC-TERM", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_opencyc_uri_for_fort", "OWL-OPENCYC-URI-FOR-FORT", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_opencyc_uri_for_term_internal", "OWL-OPENCYC-URI-FOR-TERM-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_opencyc_uri_for_term", "OWL-OPENCYC-URI-FOR-TERM", 1, 3, false );
    SubLFiles.declareFunction( me, "owl_opencyc_latest_uri_for_term", "OWL-OPENCYC-LATEST-URI-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_opencyc_latest_uri_for_fort", "OWL-OPENCYC-LATEST-URI-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_opencyc_versioned_uri_for_fort", "OWL-OPENCYC-VERSIONED-URI-FOR-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_opencyc_readable_uri_for_fort", "OWL-OPENCYC-READABLE-URI-FOR-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_cyc_latest_uri_for_fort", "OWL-CYC-LATEST-URI-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyc_latest_readable_uri_for_fort", "OWL-CYC-LATEST-READABLE-URI-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyc_versioned_uri_for_fort", "OWL-CYC-VERSIONED-URI-FOR-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_cyc_readable_uri_for_fort", "OWL-CYC-READABLE-URI-FOR-FORT", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_forts_with_exported_owl_opencyc_content", "CLEAR-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_forts_with_exported_owl_opencyc_content", "REMOVE-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "forts_with_exported_owl_opencyc_content_internal", "FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "forts_with_exported_owl_opencyc_content", "FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_compact_hl_external_id_strings_with_exported_owl_opencyc_content", "CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_compact_hl_external_id_strings_with_exported_owl_opencyc_content", "REMOVE-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "compact_hl_external_id_strings_with_exported_owl_opencyc_content_internal", "COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "compact_hl_external_id_strings_with_exported_owl_opencyc_content", "COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_has_exported_owl_opencyc_contentP", "FORT-HAS-EXPORTED-OWL-OPENCYC-CONTENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_ontology", "OWL-EXPORT-ONTOLOGY", 2, 1, false );
    SubLFiles.declareFunction( me, "owl_export", "OWL-EXPORT", 0, 1, false );
    SubLFiles.declareFunction( me, "owl_export_terms", "OWL-EXPORT-TERMS", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_owl_predicate_types_for_export", "CLEAR-OWL-PREDICATE-TYPES-FOR-EXPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl_predicate_types_for_export", "REMOVE-OWL-PREDICATE-TYPES-FOR-EXPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_predicate_types_for_export_internal", "OWL-PREDICATE-TYPES-FOR-EXPORT-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_predicate_types_for_export", "OWL-PREDICATE-TYPES-FOR-EXPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_definitional_asents_for_owl_export", "FORT-DEFINITIONAL-ASENTS-FOR-OWL-EXPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_genls_asents_for_owl_export", "FORT-GENLS-ASENTS-FOR-OWL-EXPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_owl_definitional_gafP", "BAD-OWL-DEFINITIONAL-GAF?", 1, 0, false );
    SubLFiles.declareFunction( me, "augment_with_transitive_closure", "AUGMENT-WITH-TRANSITIVE-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_asents", "OWL-EXPORT-ASENTS", 1, 4, false );
    SubLFiles.declareFunction( me, "owl_export_to_file", "OWL-EXPORT-TO-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_opencyc", "OWL-EXPORT-OPENCYC", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_opencyc_unversioned", "OWL-EXPORT-OPENCYC-UNVERSIONED", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_full_cyc", "OWL-EXPORT-FULL-CYC", 1, 0, false );
    SubLFiles.declareFunction( me, "export_skos_taxonomy", "EXPORT-SKOS-TAXONOMY", 3, 0, false );
    SubLFiles.declareFunction( me, "print_taxonomy", "PRINT-TAXONOMY", 2, 1, false );
    SubLFiles.declareFunction( me, "print_taxonomy_internal", "PRINT-TAXONOMY-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_taxonomy_terms", "GATHER-TAXONOMY-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_taxonomy_terms_internal", "GATHER-TAXONOMY-TERMS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_assertions_for_terms", "GATHER-ASSERTIONS-FOR-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_assertions_for_term_wrt_terms", "GATHER-ASSERTIONS-FOR-TERM-WRT-TERMS", 3, 0, false );
    SubLFiles.declareFunction( me, "export_skos_taxonomy_from_asents", "EXPORT-SKOS-TAXONOMY-FROM-ASENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "owl_export_terms_from_iterator", "OWL-EXPORT-TERMS-FROM-ITERATOR", 2, 2, false );
    SubLFiles.declareFunction( me, "owl_export_one_term", "OWL-EXPORT-ONE-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "empty_owl_term_chunk_p", "EMPTY-OWL-TERM-CHUNK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_term_chunk", "OWL-EXPORT-TERM-CHUNK", 1, 1, false );
    SubLFiles.declareFunction( me, "write_owl_header", "WRITE-OWL-HEADER", 0, 1, false );
    SubLFiles.declareFunction( me, "write_owl_footer", "WRITE-OWL-FOOTER", 0, 1, false );
    SubLFiles.declareFunction( me, "owl_export_version_info", "OWL-EXPORT-VERSION-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_xml_header_first_half", "OWL-XML-HEADER-FIRST-HALF", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_doctype_element", "OWL-EXPORT-DOCTYPE-ELEMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "write_owl_term_chunk", "WRITE-OWL-TERM-CHUNK", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_write_owl_term_open_tag", "XML-WRITE-OWL-TERM-OPEN-TAG", 3, 1, false );
    SubLFiles.declareFunction( me, "xml_element_name_from_uri", "XML-ELEMENT-NAME-FROM-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_abbreviate_attribute_value_uri", "POSSIBLY-ABBREVIATE-ATTRIBUTE-VALUE-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_term_close_tag", "OWL-TERM-CLOSE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_write_owl_asent", "XML-WRITE-OWL-ASENT", 2, 1, false );
    SubLFiles.declareFunction( me, "xml_write_owl_element", "XML-WRITE-OWL-ELEMENT", 2, 0, false );
    SubLFiles.declareMacro( me, "with_owl_export_indentation", "WITH-OWL-EXPORT-INDENTATION" );
    SubLFiles.declareFunction( me, "xml_write_owl_intersection_value_string", "XML-WRITE-OWL-INTERSECTION-VALUE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_space", "OWL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_reference", "OWL-REFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_in_owl_exportP", "FORT-IN-OWL-EXPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "warn_exporting_unverified_fort_internal", "WARN-EXPORTING-UNVERIFIED-FORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "warn_exporting_unverified_fort", "WARN-EXPORTING-UNVERIFIED-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_annotation_external_prefix_p", "CYC-ANNOTATION-EXTERNAL-PREFIX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_cyc_annotation_entity_map", "MAKE-CYC-ANNOTATION-ENTITY-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_annotation_namespace_pairs", "CYC-ANNOTATION-NAMESPACE-PAIRS", 0, 0, false );
    SubLFiles.declareFunction( me, "write_cyc_annotation_file", "WRITE-CYC-ANNOTATION-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "write_cyc_annotation_document", "WRITE-CYC-ANNOTATION-DOCUMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "write_rdf_doctype_declaration", "WRITE-RDF-DOCTYPE-DECLARATION", 0, 1, false );
    SubLFiles.declareFunction( me, "write_cyc_annotation_property_definitions", "WRITE-CYC-ANNOTATION-PROPERTY-DEFINITIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "annotation_property_definitely_not_in_exportP", "ANNOTATION-PROPERTY-DEFINITELY-NOT-IN-EXPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "write_cyc_annotation_property_definition", "WRITE-CYC-ANNOTATION-PROPERTY-DEFINITION", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_owl_cycl_to_xml_file()
  {
    $owl_ontology_comment_file$ = SubLFiles.deflexical( "*OWL-ONTOLOGY-COMMENT-FILE*", NIL );
    $owl_xml_footer$ = SubLFiles.deflexical( "*OWL-XML-FOOTER*", $str3$__rdf_RDF__ );
    $owl_xml_spacer$ = SubLFiles.deflexical( "*OWL-XML-SPACER*", $str4$____ );
    $owl_xml_spacer_2$ = SubLFiles.deflexical( "*OWL-XML-SPACER-2*", Sequences.cconcatenate( $owl_xml_spacer$.getGlobalValue(), $owl_xml_spacer$.getGlobalValue() ) );
    $owl_xml_spacer_3$ = SubLFiles.deflexical( "*OWL-XML-SPACER-3*", Sequences.cconcatenate( $owl_xml_spacer_2$.getGlobalValue(), $owl_xml_spacer$.getGlobalValue() ) );
    $owl_xml_spacer_4$ = SubLFiles.deflexical( "*OWL-XML-SPACER-4*", Sequences.cconcatenate( $owl_xml_spacer_3$.getGlobalValue(), $owl_xml_spacer$.getGlobalValue() ) );
    $owl_xml_spacer_5$ = SubLFiles.deflexical( "*OWL-XML-SPACER-5*", Sequences.cconcatenate( $owl_xml_spacer_4$.getGlobalValue(), $owl_xml_spacer$.getGlobalValue() ) );
    $owl_tag_attributes_caching_state$ = SubLFiles.deflexical( "*OWL-TAG-ATTRIBUTES-CACHING-STATE*", NIL );
    $owl_standalone_resource_tags$ = SubLFiles.deflexical( "*OWL-STANDALONE-RESOURCE-TAGS*", $list19 );
    $opencyc_uri_pattern_def$ = SubLFiles.deflexical( "*OPENCYC-URI-PATTERN-DEF*", $str20$http___sw_opencyc_org__0_9____con );
    $cyc_uri_pattern_def$ = SubLFiles.deflexical( "*CYC-URI-PATTERN-DEF*", $str21$http___sw_cyc_com__0_9____concept );
    $opencyc_uri_pattern$ = SubLFiles.defparameter( "*OPENCYC-URI-PATTERN*", NIL );
    $cyc_uri_pattern$ = SubLFiles.defparameter( "*CYC-URI-PATTERN*", NIL );
    $all_uri_patterns$ = SubLFiles.defparameter( "*ALL-URI-PATTERNS*", NIL );
    $owl_opencyc_fort_owl_names_filename$ = SubLFiles.defparameter( "*OWL-OPENCYC-FORT-OWL-NAMES-FILENAME*", $str34$data_caches_5022_fort_owl_names_c );
    $forts_with_exported_owl_opencyc_content_caching_state$ = SubLFiles.deflexical( "*FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-CACHING-STATE*", NIL );
    $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$ = SubLFiles.deflexical( "*COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-CACHING-STATE*", NIL );
    $owl_collection_types_for_export$ = SubLFiles.defparameter( "*OWL-COLLECTION-TYPES-FOR-EXPORT*", $list50 );
    $owl_predicate_types_for_export_caching_state$ = SubLFiles.deflexical( "*OWL-PREDICATE-TYPES-FOR-EXPORT-CACHING-STATE*", NIL );
    $owl_export_version_string$ = SubLFiles.defparameter( "*OWL-EXPORT-VERSION-STRING*", $str115$2_0_0 );
    $cyc_annotation_properties$ = SubLFiles.deflexical( "*CYC-ANNOTATION-PROPERTIES*", $list155 );
    $cyc_annotation_external_prefixes$ = SubLFiles.deflexical( "*CYC-ANNOTATION-EXTERNAL-PREFIXES*", $list156 );
    return NIL;
  }

  public static SubLObject setup_owl_cycl_to_xml_file()
  {
    memoization_state.note_globally_cached_function( $sym5$OWL_TAG_ATTRIBUTES );
    memoization_state.note_memoized_function( $sym26$OWL_CYC_URI_FOR_CYC_TERM );
    memoization_state.note_memoized_function( $sym28$OWL_OPENCYC_URI_FOR_TERM );
    access_macros.define_obsolete_register( $sym30$OWL_OPENCYC_LATEST_URI_FOR_FORT, $list31 );
    memoization_state.note_globally_cached_function( $sym35$FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT );
    memoization_state.note_globally_cached_function( $sym41$COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT );
    memoization_state.note_globally_cached_function( $sym51$OWL_PREDICATE_TYPES_FOR_EXPORT );
    memoization_state.note_memoized_function( $sym153$WARN_EXPORTING_UNVERIFIED_FORT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_owl_cycl_to_xml_file();
  }

  @Override
  public void initializeVariables()
  {
    init_owl_cycl_to_xml_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_owl_cycl_to_xml_file();
  }
  static
  {
    me = new owl_cycl_to_xml();
    $owl_ontology_comment_file$ = null;
    $owl_xml_footer$ = null;
    $owl_xml_spacer$ = null;
    $owl_xml_spacer_2$ = null;
    $owl_xml_spacer_3$ = null;
    $owl_xml_spacer_4$ = null;
    $owl_xml_spacer_5$ = null;
    $owl_tag_attributes_caching_state$ = null;
    $owl_standalone_resource_tags$ = null;
    $opencyc_uri_pattern_def$ = null;
    $cyc_uri_pattern_def$ = null;
    $opencyc_uri_pattern$ = null;
    $cyc_uri_pattern$ = null;
    $all_uri_patterns$ = null;
    $owl_opencyc_fort_owl_names_filename$ = null;
    $forts_with_exported_owl_opencyc_content_caching_state$ = null;
    $compact_hl_external_id_strings_with_exported_owl_opencyc_content_caching_state$ = null;
    $owl_collection_types_for_export$ = null;
    $owl_predicate_types_for_export_caching_state$ = null;
    $owl_export_version_string$ = null;
    $cyc_annotation_properties$ = null;
    $cyc_annotation_external_prefixes$ = null;
    $str0$____rdfs_comment_xml_lang__en__ = makeString( "   <rdfs:comment xml:lang=\"en\">" );
    $str1$___________rdfs_comment________ow = makeString( "\n        </rdfs:comment>\n    </owl:Ontology>\n" );
    $str2$opencyc = makeString( "opencyc" );
    $str3$__rdf_RDF__ = makeString( "</rdf:RDF>\n" );
    $str4$____ = makeString( "    " );
    $sym5$OWL_TAG_ATTRIBUTES = makeSymbol( "OWL-TAG-ATTRIBUTES" );
    $list6 = ConsesLow.list( makeString( "rdfs:label" ), makeString( "xml:lang" ), makeString( "en" ) );
    $list7 = ConsesLow.list( makeString( "skos:prefLabel" ), makeString( "xml:lang" ), makeString( "en" ) );
    $list8 = ConsesLow.list( makeString( "skos:altLabel" ), makeString( "xml:lang" ), makeString( "en" ) );
    $list9 = ConsesLow.list( makeString( "prettyString" ), makeString( "xml:lang" ), makeString( "en" ) );
    $const10$prettyString = constant_handles.reader_make_constant_shell( makeString( "prettyString" ) );
    $list11 = ConsesLow.list( makeString( "xml:lang" ), makeString( "en" ) );
    $list12 = ConsesLow.list( makeString( "nameString" ), makeString( "xml:lang" ), makeString( "en" ) );
    $const13$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $list14 = ConsesLow.list( makeString( "rdfs:comment" ), makeString( "xml:lang" ), makeString( "en" ) );
    $list15 = ConsesLow.list( makeString( "skos:definition" ), makeString( "xml:lang" ), makeString( "en" ) );
    $list16 = ConsesLow.list( makeString( "owl:intersectionOf" ), makeString( "rdf:parseType" ), makeString( "Collection" ) );
    $str17$_label = makeString( ":label" );
    $sym18$_OWL_TAG_ATTRIBUTES_CACHING_STATE_ = makeSymbol( "*OWL-TAG-ATTRIBUTES-CACHING-STATE*" );
    $list19 = ConsesLow.list( new SubLObject[] { makeString( "broaderThan" ), makeString( "Mx4rZOAVeiYGEdqAAAACs2IMmw" ), makeString( "broaderTerm" ), makeString( "hasWikipediaArticle" ), makeString(
        "Mx4rI7tMQs31R_6Nz85QD-I0Fg" ), makeString( "rdf:type" ), makeString( "rdfs:subClassOf" ), makeString( "rdfs:subPropertyOf" ), makeString( "rdfs:domain" ), makeString( "rdfs:range" ), makeString( "owl:sameAs" )
    } );
    $str20$http___sw_opencyc_org__0_9____con = makeString( "http://sw.opencyc.org/[0-9/]*(concept|cyc)/(.*)" );
    $str21$http___sw_cyc_com__0_9____concept = makeString( "http://sw.cyc.com/[0-9/]*(concept|cyc)/(.*)" );
    $str22$http___sw_opencyc_org = makeString( "http://sw.opencyc.org" );
    $str23$http___sw_cyc_com = makeString( "http://sw.cyc.com" );
    $sym24$SECOND = makeSymbol( "SECOND" );
    $sym25$FORT_P = makeSymbol( "FORT-P" );
    $sym26$OWL_CYC_URI_FOR_CYC_TERM = makeSymbol( "OWL-CYC-URI-FOR-CYC-TERM" );
    $int27$256 = makeInteger( 256 );
    $sym28$OWL_OPENCYC_URI_FOR_TERM = makeSymbol( "OWL-OPENCYC-URI-FOR-TERM" );
    $str29$OpenCyc_URIs_must_either_use_a_ve = makeString( "OpenCyc URIs must either use a version date or external ID." );
    $sym30$OWL_OPENCYC_LATEST_URI_FOR_FORT = makeSymbol( "OWL-OPENCYC-LATEST-URI-FOR-FORT" );
    $list31 = ConsesLow.list( makeSymbol( "OWL-OPENCYC-LAST-URI-FOR-TERM" ) );
    $str32$Human_readable_OWL_export_require = makeString( "Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S" );
    $sym33$_EXIT = makeSymbol( "%EXIT" );
    $str34$data_caches_5022_fort_owl_names_c = makeString( "data/caches/5022/fort-owl-names.csv" );
    $sym35$FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT = makeSymbol( "FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" );
    $int36$200000 = makeInteger( 200000 );
    $kw37$INPUT = makeKeyword( "INPUT" );
    $str38$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str39$_ = makeString( "\"" );
    $sym40$_FORTS_WITH_EXPORTED_OWL_OPENCYC_CONTENT_CACHING_STATE_ = makeSymbol( "*FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-CACHING-STATE*" );
    $sym41$COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT = makeSymbol( "COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT" );
    $sym42$_COMPACT_HL_EXTERNAL_ID_STRINGS_WITH_EXPORTED_OWL_OPENCYC_CONTENT = makeSymbol( "*COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-CACHING-STATE*" );
    $const43$termTypeForOntology = constant_handles.reader_make_constant_shell( makeString( "termTypeForOntology" ) );
    $const44$contextOfPCW = constant_handles.reader_make_constant_shell( makeString( "contextOfPCW" ) );
    $const45$synonymousExternalConcept = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) );
    $const46$overlappingExternalConcept = constant_handles.reader_make_constant_shell( makeString( "overlappingExternalConcept" ) );
    $sym47$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym48$OWLIFIABLE_ARG1_ = makeSymbol( "OWLIFIABLE-ARG1?" );
    $str49$No_asents_for__S_ = makeString( "No asents for ~S." );
    $list50 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ExistingObjectType" ) ), constant_handles.reader_make_constant_shell( makeString( "ExistingStuffType" ) ), constant_handles
        .reader_make_constant_shell( makeString( "TemporalObjectType" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporalStuffType" ) ), constant_handles.reader_make_constant_shell( makeString(
            "ObjectType" ) ), constant_handles.reader_make_constant_shell( makeString( "StuffType" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $sym51$OWL_PREDICATE_TYPES_FOR_EXPORT = makeSymbol( "OWL-PREDICATE-TYPES-FOR-EXPORT" );
    $sym52$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol( "HL-PROTOTYPICAL-INSTANCE?" );
    $sym53$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $const54$BinaryPredicateTypeByLogicalFeatu = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicateTypeByLogicalFeature" ) );
    $list55 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CoexistingObjectsPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "BinaryRolePredicate" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ComplexTemporalPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ), constant_handles
            .reader_make_constant_shell( makeString( "Predicate" ) ) );
    $sym56$_OWL_PREDICATE_TYPES_FOR_EXPORT_CACHING_STATE_ = makeSymbol( "*OWL-PREDICATE-TYPES-FOR-EXPORT-CACHING-STATE*" );
    $sym57$CLEAR_OWL_PREDICATE_TYPES_FOR_EXPORT = makeSymbol( "CLEAR-OWL-PREDICATE-TYPES-FOR-EXPORT" );
    $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const59$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw60$GAF = makeKeyword( "GAF" );
    $kw61$TRUE = makeKeyword( "TRUE" );
    $list62 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell(
        makeString( "arg1Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1SometimesIsa" ) ), constant_handles
            .reader_make_constant_shell( makeString( "arg2SometimesIsa" ) ) );
    $const63$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw64$GENLS = makeKeyword( "GENLS" );
    $const65$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym66$OWLIFIABLE_SENTENCE_ = makeSymbol( "OWLIFIABLE-SENTENCE?" );
    $sym67$ATOMIC_SENTENCE_ARG1 = makeSymbol( "ATOMIC-SENTENCE-ARG1" );
    $str68$__Extracted__D_subject_terms_from = makeString( "~&Extracted ~D subject terms from ~D asents.~%" );
    $kw69$OUTPUT = makeKeyword( "OUTPUT" );
    $str70$_ = makeString( "/" );
    $str71$log_txt = makeString( "log.txt" );
    $str72$owl_export_human_readable_owl = makeString( "owl-export-human-readable.owl" );
    $str73$__Starting_human_readable_export_ = makeString( "~&Starting human-readable export...~%" );
    $str74$owl_export_versioned_owl = makeString( "owl-export-versioned.owl" );
    $str75$__Starting_versioned_export_____ = makeString( "~&Starting versioned export...~%" );
    $str76$owl_export_unversioned_owl = makeString( "owl-export-unversioned.owl" );
    $str77$__Starting_unversioned_export____ = makeString( "~&Starting unversioned export...~%" );
    $str78$log_unversioned_txt = makeString( "log-unversioned.txt" );
    $str79$_rdf = makeString( ".rdf" );
    $str80$_log = makeString( ".log" );
    $str81$skos = makeString( "skos" );
    $str82$rdf = makeString( "rdf" );
    $str83$rdfs = makeString( "rdfs" );
    $str84$cyc = makeString( "cyc" );
    $str85$oc = makeString( "oc" );
    $kw86$NEW = makeKeyword( "NEW" );
    $str87$ = makeString( "" );
    $str88$_A_A__ = makeString( "~A~A~%" );
    $str89$_ = makeString( " " );
    $kw90$DEPTH = makeKeyword( "DEPTH" );
    $kw91$STACK = makeKeyword( "STACK" );
    $kw92$QUEUE = makeKeyword( "QUEUE" );
    $sym93$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw94$ERROR = makeKeyword( "ERROR" );
    $str95$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym96$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw97$CERROR = makeKeyword( "CERROR" );
    $str98$continue_anyway = makeString( "continue anyway" );
    $kw99$WARN = makeKeyword( "WARN" );
    $str100$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const101$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str102$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str103$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str104$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list105 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
        makeString( "geographicalSubRegions" ) ), constant_handles.reader_make_constant_shell( makeString( "geopoliticalSubdivision" ) ) );
    $kw106$IGNORE = makeKeyword( "IGNORE" );
    $str107$__Exporting__D_Terms_from_iterato = makeString( "~&Exporting ~D Terms from iterator.~%" );
    $str108$exporting_ = makeString( "exporting " );
    $str109$_terms_to_OWL = makeString( " terms to OWL" );
    $str110$__Exported__D_Terms_and__D_senten = makeString( "~&Exported ~D Terms and ~D sentences.~%" );
    $sym111$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str112$___S___D_sentences___ = makeString( "~&~S: ~D sentences.~%" );
    $str113$Description = makeString( "Description" );
    $str114$_a = makeString( "~a" );
    $str115$2_0_0 = makeString( "2.0.0" );
    $str116$_________owl_versionInfo_Version_ = makeString( "        <owl:versionInfo>Version " );
    $str117$__owl_versionInfo_______ = makeString( "</owl:versionInfo>\n     " );
    $str118$__xml_version__1_0__encoding__UTF = makeString( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" );
    $str119$_rdf_RDF_xml_base__ = makeString( "<rdf:RDF xml:base=\"" );
    $str120$____xmlns__ = makeString( "    xmlns=\"" );
    $list121 = ConsesLow.cons( makeSymbol( "PREFIX" ), makeSymbol( "URI" ) );
    $str122$______xmlns__A__S = makeString( "~%    xmlns:~A=~S" );
    $str123$_ = makeString( "&" );
    $str124$_ = makeString( ";" );
    $str125$_____ = makeString( ">~%~%" );
    $str126$_____owl_Ontology_rdf_about______ = makeString( "    <owl:Ontology rdf:about=\"\">~%" );
    $sym127$NON_EMPTY_LIST_P = makeSymbol( "NON-EMPTY-LIST-P" );
    $list128 = ConsesLow.cons( makeSymbol( "TERM" ), makeSymbol( "OWL-CYCL-ASENTS" ) );
    $str129$ID = makeString( "ID" );
    $str130$about = makeString( "about" );
    $sym131$VALID_XML_NAME_P = makeSymbol( "VALID-XML-NAME-P" );
    $str132$Invalid_XML_name___S___Default_na = makeString( "Invalid XML name: ~S~% Default namespace is ~S" );
    $str133$__ = makeString( "</" );
    $str134$_ = makeString( ">" );
    $str135$_u = makeString( "&u" );
    $str136$_p__ = makeString( "<p/>" );
    $str137$_p_ = makeString( "<p>" );
    $str138$rdf_resource = makeString( "rdf:resource" );
    $const139$OWLURIFn = constant_handles.reader_make_constant_shell( makeString( "OWLURIFn" ) );
    $const140$OWLDatatypeFn = constant_handles.reader_make_constant_shell( makeString( "OWLDatatypeFn" ) );
    $str141$rdf_datatype = makeString( "rdf:datatype" );
    $str142$owl_intersectionOf = makeString( "owl:intersectionOf" );
    $sym143$XML_SPECIAL_CHAR_ = makeSymbol( "XML-SPECIAL-CHAR?" );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "LEVEL" ), ONE_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym145$CLET = makeSymbol( "CLET" );
    $list146 = ConsesLow.list( makeSymbol( "*XML-INDENTATION-AMOUNT*" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "*OWL-XML-SPACER*" ) ) );
    $sym147$_XML_INDENTATION_LEVEL_ = makeSymbol( "*XML-INDENTATION-LEVEL*" );
    $sym148$_ = makeSymbol( "*" );
    $list149 = ConsesLow.list( makeSymbol( "*XML-INDENTATION-AMOUNT*" ) );
    $list150 = ConsesLow.list( makeSymbol( "OWL-INTERSECTION-FN" ), makeSymbol( "CLASS-TERM" ), ConsesLow.list( makeSymbol( "OWL-RESTRICTION-FN" ), makeSymbol( "OWL-RESTRICTION" ), makeSymbol( "OWL-ON-PROPERTY" ),
        makeSymbol( "PROPERTY" ), makeSymbol( "OWL-HAS-VALUE" ), makeSymbol( "VALUE" ) ) );
    $kw151$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str152$OWL_indent_level_too_high = makeString( "OWL indent level too high" );
    $sym153$WARN_EXPORTING_UNVERIFIED_FORT = makeSymbol( "WARN-EXPORTING-UNVERIFIED-FORT" );
    $str154$Assuming__S_is_OK_to_export = makeString( "Assuming ~S is OK to export" );
    $list155 = ConsesLow.list( ConsesLow.list( makeString( "externalID" ), makeString(
        "A unique, language-neutral, variable-sized identifier for a concept that can be used to refer unambiguously to that concept across OWL exports or across Cyc inference engines." ), T ), ConsesLow.list(
            makeString( "label" ), makeString(
                "A natural-language representation for a concept that is both human readable and readable by the Cyc inference engine. These terms are not guaranteed to refer to the same concept across time but are guaranteed to be consistent within a particular OWL export. Use \"cycAnnot:externalID\" for unambiguously referring to a concept across OWL exports or across Cyc inference engines." ),
            NIL ) );
    $list156 = ConsesLow.list( makeString( "owl" ), makeString( "rdfs" ), makeString( "rdf" ) );
    $sym157$CYC_ANNOTATION_EXTERNAL_PREFIX_P = makeSymbol( "CYC-ANNOTATION-EXTERNAL-PREFIX-P" );
    $sym158$CAR = makeSymbol( "CAR" );
    $str159$xmlns_ = makeString( "xmlns:" );
    $str160$rdf_RDF = makeString( "rdf:RDF" );
    $str161$xml_base = makeString( "xml:base" );
    $str162$xmlns = makeString( "xmlns" );
    $str163$__DOCTYPE_rdf_RDF = makeString( "<!DOCTYPE rdf:RDF" );
    $str164$____ = makeString( " [~%" );
    $sym165$LENGTH = makeSymbol( "LENGTH" );
    $str166$_______ENTITY__ = makeString( "     <!ENTITY ~" );
    $str167$A__S____ = makeString( "A ~S >~%" );
    $str168$____ = makeString( "   ]" );
    $list169 = ConsesLow.cons( makeSymbol( "CYCL" ), makeSymbol( "PREFIXED-NAME" ) );
    $sym170$ATOMIC_SENTENCE_PREDICATE = makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $list171 = ConsesLow.list( makeSymbol( "LOCAL-NAME" ), makeSymbol( "COMMENT" ), makeSymbol( "FUNCTIONAL?" ) );
    $str172$AnnotationProperty = makeString( "AnnotationProperty" );
    $str173$label = makeString( "label" );
    $str174$lang = makeString( "lang" );
    $list175 = ConsesLow.list( makeString( "en" ) );
    $str176$comment = makeString( "comment" );
    $str177$type = makeString( "type" );
    $str178$resource = makeString( "resource" );
    $str179$FunctionalProperty = makeString( "FunctionalProperty" );
  }
}
/*
 * 
 * Total time: 2645 ms
 * 
 */