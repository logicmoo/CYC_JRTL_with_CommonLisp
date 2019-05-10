package com.cyc.cycjava.cycl.owl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.date_defns;
import com.cyc.cycjava.cycl.constant_reader;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.constants_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owlification
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.owlification";
  public static final String myFingerPrint = "a2f99e6b0ab42ae4f875956794f372af0258a0905638e72baab64883c31fda7e";
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1126L)
  public static SubLSymbol $owl_use_external_ids_for_namesP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1312L)
  public static SubLSymbol $owl_prefer_ontology_urisP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1430L)
  public static SubLSymbol $owl_use_pretty_stringsP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1652L)
  public static SubLSymbol $owl_use_entity_referencesP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1709L)
  public static SubLSymbol $owl_asents_to_export$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1995L)
  public static SubLSymbol $owl_export_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 2536L)
  private static SubLSymbol $owl_remove_isa_individual_asentsP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 2697L)
  private static SubLSymbol $owl_profilingP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 2797L)
  public static SubLSymbol $owl_export_from_opencyc_kbP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 3040L)
  public static SubLSymbol $owl_export_cap_per_category$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 3251L)
  public static SubLSymbol $owl_export_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 3308L)
  public static SubLSymbol $owl_export_ontology$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 4708L)
  private static SubLSymbol $owl_export_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 5724L)
  private static SubLSymbol $owl_expected_nart_count$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 5839L)
  private static SubLSymbol $owl_singleton_predicate_list$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 6023L)
  private static SubLSymbol $owl_cycl_predicate_table_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 7582L)
  private static SubLSymbol $assertion_arg0s_excluded_from_owl_export$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 7774L)
  private static SubLSymbol $owl_cycl_predicates_to_use_as_is$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 7942L)
  private static SubLSymbol $owl_cycl_type_table$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 8078L)
  private static SubLSymbol $owl_cycl_property_table$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 9626L)
  private static SubLSymbol $owl_cycl_collection_table$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 10272L)
  private static SubLSymbol $owl_cycl_xsd_schema_table$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 11471L)
  private static SubLSymbol $owl_fort_arg2_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 11739L)
  private static SubLSymbol $owl_permissive_arg2_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 11887L)
  public static SubLSymbol $fort_owl_name_table$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 13066L)
  private static SubLSymbol $owl_name_uniquifier_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 13149L)
  private static SubLSymbol $fort_owl_name_counter$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 19269L)
  private static SubLSymbol $owl_transitive_via_genls_arg2_preds_to_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 23942L)
  private static SubLSymbol $owl_blacklist_sentence_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 33753L)
  public static SubLSymbol $asent_to_owl_cyclify$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 42064L)
  private static SubLSymbol $owl_include_cyc_constant_popupsP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 42139L)
  private static SubLSymbol $owl_link_constant_references_for_these_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 42860L)
  private static SubLSymbol $owl_span_id_counter$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 45947L)
  private static SubLSymbol $inverse_binary_predicate_var$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 53078L)
  private static SubLSymbol $rdf_name_invalid_start_char_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 60493L)
  private static SubLSymbol $ontology_uris$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 64636L)
  private static SubLSymbol $invalid_owl_name_chars_remove$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 64826L)
  private static SubLSymbol $invalid_owl_name_chars_underscore$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66675L)
  private static SubLSymbol $owl_human_readable_name_generation_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 67934L)
  private static SubLSymbol $umbel_id_map$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 68006L)
  private static SubLSymbol $umbel_data_files$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_OWL_ASENTS_TO_EXPORT_;
  private static final SubLSymbol $sym3$LISTP;
  private static final SubLString $str4$_OWL_EXPORT_TERMS__is_not_set_;
  private static final SubLSymbol $kw5$IGNORE;
  private static final SubLObject $const6$InferencePSC;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_OWL_EXPORT_VERSION_DATE_;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$WITH_OPENCYC_OWL_EXPORT_PARAMETERS;
  private static final SubLSymbol $sym13$WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$MUST;
  private static final SubLSymbol $sym16$UNIVERSAL_DATE_P;
  private static final SubLString $str17$Human_readable_OWL_export_require;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$TERM;
  private static final SubLSymbol $sym21$TERM_LIST;
  private static final SubLSymbol $sym22$_OWL_EXPORT_TERMS_;
  private static final SubLSymbol $sym23$NEW_SET;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$DO_ITERATOR;
  private static final SubLSymbol $sym27$SET_ADD;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CPUSH;
  private static final SubLSymbol $sym30$NEW_LIST_ITERATOR;
  private static final SubLSymbol $sym31$NREVERSE;
  private static final SubLInteger $int32$14822;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$OWL_CYCL_PREDICATE_TABLE;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLObject $const38$otherEnglish;
  private static final SubLObject $const39$prettyString;
  private static final SubLObject $const40$cycName;
  private static final SubLString $str41$_;
  private static final SubLString $str42$label;
  private static final SubLList $list43;
  private static final SubLObject $const44$owlExternalID;
  private static final SubLString $str45$externalID;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$_OWL_CYCL_PREDICATE_TABLE_CACHING_STATE_;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PWHEN;
  private static final SubLSymbol $sym59$DIRECTORY_P;
  private static final SubLSymbol $sym60$WRITE_FORT_OWL_NAME_TABLE;
  private static final SubLSymbol $kw61$OWL_NAME;
  private static final SubLString $str62$;
  private static final SubLString $str63$_;
  private static final SubLString $str64$fort_owl_names_csv;
  private static final SubLSymbol $kw65$OUTPUT;
  private static final SubLString $str66$Unable_to_open__S;
  private static final SubLList $list67;
  private static final SubLString $str68$_S___S__;
  private static final SubLString $str69$OWL_Name_Uniquifier;
  private static final SubLSymbol $sym70$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLObject $const71$isa;
  private static final SubLList $list72;
  private static final SubLObject $const73$genls;
  private static final SubLList $list74;
  private static final SubLString $str75$unexpected_asent__s;
  private static final SubLObject $const76$owl_sameAs;
  private static final SubLString $str77$Caught_error_OWL_cyclifying__S___;
  private static final SubLString $str78$_S_is_not_a_FORT_;
  private static final SubLSymbol $sym79$META_VARIABLE_P;
  private static final SubLObject $const80$owl_Ontology;
  private static final SubLString $str81$Can_t_export_OWL_Ontology_as_part;
  private static final SubLString $str82$Sorting_;
  private static final SubLString $str83$_terms_for_OWL_export___;
  private static final SubLInteger $int84$1000;
  private static final SubLString $str85$Couldn_t_resolve__S_to_a_canonica;
  private static final SubLSymbol $sym86$OWL_EXPORT_CANONICALIZE_NART;
  private static final SubLSymbol $sym87$NART_P;
  private static final SubLInteger $int88$225;
  private static final SubLSymbol $sym89$SUBSUMED_OWL_ASENT_;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$NONEXPORTABLE_TERM_WARNING;
  private static final SubLString $str92$Can_t_export__S;
  private static final SubLString $str93$Not_a_collection___S;
  private static final SubLObject $const94$SubcollectionRelationFunction;
  private static final SubLSymbol $sym95$FORT_P;
  private static final SubLString $str96$Restriction_property_is_not_a_bin;
  private static final SubLList $list97;
  private static final SubLString $str98$Couldn_t_find_or_create_inverse_o;
  private static final SubLList $list99;
  private static final SubLString $str100$restriction_property_is_not_a_FOR;
  private static final SubLSymbol $sym101$OWL_FORT__;
  private static final SubLSymbol $kw102$TRUE;
  private static final SubLSymbol $sym103$GAF_FORMULA;
  private static final SubLSymbol $sym104$OWL_BLACKLIST_SENTENCE_;
  private static final SubLSymbol $sym105$OWLIFIABLE_SENTENCE_;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$OWL_ISA_LIT_;
  private static final SubLSymbol $sym108$OWL_GENLS_LIT_;
  private static final SubLSymbol $sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_;
  private static final SubLObject $const110$Thing;
  private static final SubLObject $const111$synonymousExternalConceptWRTPredi;
  private static final SubLSymbol $kw112$GAF;
  private static final SubLObject $const113$rdf_type;
  private static final SubLObject $const114$synonymousExternalConcept;
  private static final SubLSymbol $sym115$OWL_ASENT__;
  private static final SubLSymbol $sym116$COMMENT_ASENT_;
  private static final SubLObject $const117$comment;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLObject $const120$preferredEnglish;
  private static final SubLObject $const121$specialIsa;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLObject $const124$StrictlyFunctionalSlot;
  private static final SubLObject $const125$argCardinality;
  private static final SubLList $list126;
  private static final SubLObject $const127$strictlyFunctionalInArgs;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_;
  private static final SubLObject $const132$rdfs_subClassOf;
  private static final SubLSymbol $sym133$ISA_LIT_;
  private static final SubLSymbol $sym134$ISA_INDIVIDUAL_ASENT_;
  private static final SubLObject $const135$Individual;
  private static final SubLObject $const136$rdfURI;
  private static final SubLSymbol $sym137$FIRST;
  private static final SubLString $str138$unexpected_owl_cycl_pred_for_asen;
  private static final SubLString $str139$Caught_error__S___while_trying_to;
  private static final SubLList $list140;
  private static final SubLString $str141$subject;
  private static final SubLString $str142$predicate;
  private static final SubLString $str143$object;
  private static final SubLSymbol $sym144$STRINGP;
  private static final SubLObject $const145$OWLPredicateFn;
  private static final SubLSymbol $sym146$FORT_IN_OWL_EXPORT_;
  private static final SubLSymbol $sym147$OWLIFIABLE_ARG1_;
  private static final SubLString $str148$Invalid_term_type___S_for__S__Exp;
  private static final SubLObject $const149$OWLTermOfTypeFn;
  private static final SubLObject $const150$OWLIntersectionFn;
  private static final SubLObject $const151$OWLURIFn;
  private static final SubLObject $const152$OWLDatatypeFn;
  private static final SubLString $str153$Unexpected_EL_formula_arg2___S;
  private static final SubLList $list154;
  private static final SubLString $str155$Raw_term_string_for__S___S;
  private static final SubLString $str156$Need_XSD_datatype_for__S;
  private static final SubLObject $const157$SecondFn;
  private static final SubLObject $const158$DayFn;
  private static final SubLObject $const159$MonthFn;
  private static final SubLObject $const160$YearFn;
  private static final SubLObject $const161$CenturyFn;
  private static final SubLString $str162$xsd;
  private static final SubLString $str163$integer;
  private static final SubLString $str164$decimal;
  private static final SubLString $str165$date;
  private static final SubLString $str166$timeInstant;
  private static final SubLString $str167$Don_t_know_XSD_datatype_for__S;
  private static final SubLString $str168$YYYY_MM_DD;
  private static final SubLString $str169$YYYY_MM;
  private static final SubLString $str170$YYYY;
  private static final SubLString $str171$YYYY_MM_DDTHH_MM_SS;
  private static final SubLString $str172$_;
  private static final SubLString $str173$_;
  private static final SubLList $list174;
  private static final SubLObject $const175$UniformResourceIdentifier;
  private static final SubLSymbol $sym176$URI_FORT_P;
  private static final SubLObject $const177$URIFn;
  private static final SubLObject $const178$URIInNamespaceFn;
  private static final SubLObject $const179$URIWithFragmentFn;
  private static final SubLString $str180$_;
  private static final SubLSymbol $sym181$_URI_STRING;
  private static final SubLObject $const182$uriString;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLString $str185$Can_t_convert_URI_FORT_to_string_;
  private static final SubLList $list186;
  private static final SubLSymbol $sym187$HTML_LINK_TO_OWL_URI_WITH_POPUPS;
  private static final SubLSymbol $sym188$HTML_LINK_TO_OWL_URI;
  private static final SubLString $str189$TagToTip__;
  private static final SubLString $str190$__;
  private static final SubLString $str191$UnTip__;
  private static final SubLString $str192$owl_cyc_constant_tooltip;
  private static final SubLString $str193$display__none_;
  private static final SubLString $str194$comment_header;
  private static final SubLString $str195$ID___A;
  private static final SubLString $str196$comment_body;
  private static final SubLString $str197$cyc_term;
  private static final SubLSymbol $sym198$HTML_LINK_TO_OWL_OPENCYC_URI;
  private static final SubLString $str199$No_comment_;
  private static final SubLObject $const200$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const201$SubcollectionOfWithRelationToType;
  private static final SubLObject $const202$SubcollectionOfWithRelationFromFn;
  private static final SubLObject $const203$SubcollectionOfWithRelationFromTy;
  private static final SubLString $str204$Couldn_t_find_inverse_of__S;
  private static final SubLString $str205$unexpected_subcollection_function;
  private static final SubLObject $const206$owl_intersectionOf;
  private static final SubLObject $const207$OWLRestrictionFn;
  private static final SubLObject $const208$owl_onProperty;
  private static final SubLObject $const209$owl_hasValue;
  private static final SubLSymbol $sym210$_PRED;
  private static final SubLObject $const211$and;
  private static final SubLObject $const212$genlInverse;
  private static final SubLSymbol $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE;
  private static final SubLObject $const214$BinaryPredicate;
  private static final SubLList $list215;
  private static final SubLObject $const216$UniversalVocabularyMt;
  private static final SubLObject $const217$InverseBinaryPredicateFn;
  private static final SubLString $str218$__Created__S__;
  private static final SubLSymbol $sym219$BINARY_PREDICATE_;
  private static final SubLList $list220;
  private static final SubLList $list221;
  private static final SubLString $str222$owl_Restriction;
  private static final SubLString $str223$owl_onProperty;
  private static final SubLString $str224$owl_hasValue;
  private static final SubLString $str225$Statement;
  private static final SubLString $str226$Description;
  private static final SubLObject $const227$Collection;
  private static final SubLSymbol $sym228$BEST_ISA_FOR_INDIVIDUAL;
  private static final SubLSymbol $sym229$CONSTANT_P;
  private static final SubLSymbol $sym230$ATOMIC_SENTENCE_PREDICATE;
  private static final SubLSymbol $sym231$ATOMIC_SENTENCE_ARG2;
  private static final SubLSymbol $kw232$CYC_PPH;
  private static final SubLSymbol $sym233$WITH_PPH_MEMOIZATION;
  private static final SubLSymbol $sym234$PROGN;
  private static final SubLString $str235$type;
  private static final SubLList $list236;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$INDEXED_TERM_P;
  private static final SubLSymbol $sym239$RELEVANT_MT_IS_ANY_MT;
  private static final SubLString $str240$_;
  private static final SubLSymbol $sym241$OWL_FORT_HUMAN_READABLE_NAME;
  private static final SubLList $list242;
  private static final SubLSymbol $sym243$NON_FORT_P;
  private static final SubLString $str244$unexpected_term__s;
  private static final SubLSymbol $kw245$PREFERRED_NAME;
  private static final SubLInteger $int246$60;
  private static final SubLInteger $int247$30;
  private static final SubLString $str248$Timed_out_generating_phrases_for_;
  private static final SubLList $list249;
  private static final SubLObject $const250$synonymousExternalPred_Inverse;
  private static final SubLList $list251;
  private static final SubLList $list252;
  private static final SubLSymbol $sym253$URI_FOR_PREFIX_AND_ONTOLOGY;
  private static final SubLSymbol $kw254$X;
  private static final SubLList $list255;
  private static final SubLObject $const256$nameSpacePrefixForSKS;
  private static final SubLObject $const257$standardPrefixForURI;
  private static final SubLString $str258$Couldn_t_find_expansion_for__S_wr;
  private static final SubLObject $const259$owl_inverseOf;
  private static final SubLString $str260$Can_t_get_URI_from_non_FORT_ontol;
  private static final SubLString $str261$Can_t_get_URI_from_non_string_loc;
  private static final SubLList $list262;
  private static final SubLString $str263$http___www_w3_org_2006_03_wn_wn20;
  private static final SubLSymbol $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI;
  private static final SubLString $str265$Couldn_t_find_URI_for__S_;
  private static final SubLList $list266;
  private static final SubLSymbol $sym267$ONTOLOGY_URI;
  private static final SubLSymbol $kw268$URI;
  private static final SubLObject $const269$salientURI;
  private static final SubLList $list270;
  private static final SubLList $list271;
  private static final SubLSymbol $sym272$STRING;
  private static final SubLSymbol $sym273$OWL_NART_NAME;
  private static final SubLString $str274$_;
  private static final SubLSymbol $sym275$OWL_NART_SORT_STRING;
  private static final SubLSymbol $sym276$DOUBLE_FLOAT;
  private static final SubLString $str277$_;
  private static final SubLString $str278$___;
  private static final SubLString $str279$_;
  private static final SubLString $str280$__;
  private static final SubLString $str281$__;
  private static final SubLString $str282$_u;
  private static final SubLString $str283$__;
  private static final SubLSymbol $sym284$INVALID_OWL_NAME_CHAR_TO_REMOVE_P;
  private static final SubLSymbol $sym285$VALID_OWL_NAME_CHAR_P;
  private static final SubLList $list286;
  private static final SubLList $list287;
  private static final SubLString $str288$HTML_tags_not_stripped_from__s;
  private static final SubLSymbol $sym289$OWL_EXTERNAL_ID_STRING;
  private static final SubLInteger $int290$26;
  private static final SubLString $str291$ID__S_for__S_is_suspiciously_shor;
  private static final SubLInteger $int292$256;
  private static final SubLList $list293;
  private static final SubLList $list294;
  private static final SubLSymbol $kw295$DEFAULT;
  private static final SubLObject $const296$OWLHumanReadableNameGenerationMt;
  private static final SubLSymbol $sym297$OWL_GENERATE_PHRASE_INT;
  private static final SubLSymbol $kw298$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym299$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym300$PPH_PRECISION_P;
  private static final SubLSymbol $kw301$NONE;
  private static final SubLString $str302$fake_pretty_string;
  private static final SubLObject $const303$prettyString_Canonical;
  private static final SubLList $list304;
  private static final SubLList $list305;
  private static final SubLSymbol $kw306$INPUT;
  private static final SubLString $str307$_;
  private static final SubLList $list308;
  private static final SubLString $str309$sc;
  private static final SubLObject $const310$umbelSubjectConceptName;
  private static final SubLObject $const311$umbelAbstractConceptName;
  private static final SubLObject $const312$MappingMtFn;
  private static final SubLObject $const313$OWLOntologyFn;
  private static final SubLObject $const314$UMBELSubjectConceptNamespace;
  private static final SubLObject $const315$UMBELAbstractConceptNamespace;

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 1869L)
  public static SubLObject with_owl_export_asents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject asents = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    asents = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_OWL_ASENTS_TO_EXPORT_, asents ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 2114L)
  public static SubLObject add_owl_asent_forts_to_export_terms(final SubLObject asents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( asents ) : asents;
    if( NIL == set.set_p( $owl_export_terms$.getDynamicValue( thread ) ) )
    {
      Errors.sublisp_break( $str4$_OWL_EXPORT_TERMS__is_not_set_, EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( NIL != set.set_p( $owl_export_terms$.getDynamicValue( thread ) ) )
    {
      SubLObject cdolist_list_var = asents;
      SubLObject asent = NIL;
      asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$1;
        final SubLObject args = cdolist_list_var_$1 = cycl_utilities.formula_args( asent, $kw5$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL != forts.fort_p( arg ) && NIL == set.set_memberP( arg, $owl_export_terms$.getDynamicValue( thread ) ) )
          {
            set.set_add( arg, $owl_export_terms$.getDynamicValue( thread ) );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          arg = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        asent = cdolist_list_var.first();
      }
    }
    return $owl_export_terms$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 3432L)
  public static SubLObject with_opencyc_owl_export_parameters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject version_date = current.isCons() ? current.first() : $sym8$_OWL_EXPORT_VERSION_DATE_;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list7 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.listS( $list9, $list10, ConsesLow.list( $sym8$_OWL_EXPORT_VERSION_DATE_, version_date ), $list11 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 3945L)
  public static SubLObject with_human_readable_opencyc_owl_export_parameters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject version_date = current.isCons() ? current.first() : $sym8$_OWL_EXPORT_VERSION_DATE_;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list7 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym12$WITH_OPENCYC_OWL_EXPORT_PARAMETERS, ConsesLow.list( version_date ), ConsesLow.listS( $sym13$WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS, ConsesLow.list( version_date ), ConsesLow.append(
          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 4267L)
  public static SubLObject with_human_readable_owl_export_parameters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject version_date = current.isCons() ? current.first() : $sym8$_OWL_EXPORT_VERSION_DATE_;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list7 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( $list14, ConsesLow.list( $sym8$_OWL_EXPORT_VERSION_DATE_, version_date ) ), ConsesLow.list( $sym15$MUST, ConsesLow.list( $sym16$UNIVERSAL_DATE_P, version_date ),
          $str17$Human_readable_OWL_export_require, version_date ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 5054L)
  public static SubLObject owl_export_parameter_snapshot()
  {
    SubLObject snapshot = NIL;
    SubLObject cdolist_list_var = $owl_export_parameters$.getGlobalValue();
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      snapshot = list_utilities.alist_enter( snapshot, param, Eval.eval( param ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return snapshot;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 5262L)
  public static SubLObject do_owl_export_terms(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject term_var = NIL;
    SubLObject term_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    term_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
    term_iterator = current.first();
    current = current.rest();
    final SubLObject term_count = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list19 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_term = $sym20$TERM;
      final SubLObject term_list = $sym21$TERM_LIST;
      return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym22$_OWL_EXPORT_TERMS_, ConsesLow.list( $sym23$NEW_SET, $list24, term_count ) ), reader.bq_cons( term_list, $list25 ) ), ConsesLow.list(
          $sym26$DO_ITERATOR, ConsesLow.list( v_term, term_iterator ), ConsesLow.listS( $sym27$SET_ADD, v_term, $list28 ), ConsesLow.list( $sym29$CPUSH, v_term, term_list ) ), ConsesLow.listS( $sym26$DO_ITERATOR,
              ConsesLow.list( term_var, ConsesLow.list( $sym30$NEW_LIST_ITERATOR, ConsesLow.list( $sym31$NREVERSE, term_list ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 6023L)
  public static SubLObject clear_owl_cycl_predicate_table()
  {
    final SubLObject cs = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 6023L)
  public static SubLObject remove_owl_cycl_predicate_table(SubLObject external_namesP)
  {
    if( external_namesP == UNPROVIDED )
    {
      external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $owl_cycl_predicate_table_caching_state$.getGlobalValue(), ConsesLow.list( external_namesP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 6023L)
  public static SubLObject owl_cycl_predicate_table_internal(final SubLObject external_namesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject table = NIL;
    final SubLObject _prev_bind_0 = $owl_use_external_ids_for_namesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = owl_uris_and_prefixes.$owl_export_base_uri$.currentBinding( thread );
    try
    {
      $owl_use_external_ids_for_namesP$.bind( external_namesP, thread );
      owl_uris_and_prefixes.$owl_export_base_uri$.bind( misc_utilities.uninitialized(), thread );
      table = ConsesLow.listS( $list35, new SubLObject[] { $list36, $list37, reader.bq_cons( $const38$otherEnglish, owl_fort_name( $const39$prettyString, T, UNPROVIDED ) ), reader.bq_cons( $const40$cycName, Sequences
          .cconcatenate( owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[]
          { $str41$_, $str42$label
          } ) ), $list43, reader.bq_cons( $const44$owlExternalID, Sequences.cconcatenate( owl_uris_and_prefixes.cyc_annotation_prefix(), new SubLObject[] { $str41$_, $str45$externalID
          } ) ), $list46
      } );
    }
    finally
    {
      owl_uris_and_prefixes.$owl_export_base_uri$.rebind( _prev_bind_2, thread );
      $owl_use_external_ids_for_namesP$.rebind( _prev_bind_0, thread );
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 6023L)
  public static SubLObject owl_cycl_predicate_table(SubLObject external_namesP)
  {
    if( external_namesP == UNPROVIDED )
    {
      external_namesP = $owl_use_external_ids_for_namesP$.getDynamicValue();
    }
    SubLObject caching_state = $owl_cycl_predicate_table_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym34$OWL_CYCL_PREDICATE_TABLE, $sym47$_OWL_CYCL_PREDICATE_TABLE_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, external_namesP, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl_cycl_predicate_table_internal( external_namesP ) ) );
      memoization_state.caching_state_put( caching_state, external_namesP, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 11951L)
  public static SubLObject with_new_fort_owl_name_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject dump_directory = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, $list57, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym58$PWHEN, ConsesLow.list( $sym59$DIRECTORY_P, dump_directory ), ConsesLow.list(
          $sym60$WRITE_FORT_OWL_NAME_TABLE, dump_directory ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 12200L)
  public static SubLObject note_fort_owl_name(final SubLObject fort, final SubLObject name, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw61$OWL_NAME;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( ConsesLow.cons( name, type ), $fort_owl_name_table$.getDynamicValue( thread ), fort );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 12345L)
  public static SubLObject write_fort_owl_name_table(final SubLObject dump_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = Sequences.cconcatenate( dump_directory, new SubLObject[] { Characters.CHAR_slash.eql( string_utilities.last_char( dump_directory ) ) ? $str62$ : $str63$_, $str64$fort_owl_names_csv
    } );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw65$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str66$Unable_to_open__S, filename );
      }
      final SubLObject stream_$2 = stream;
      final SubLObject cdohash_table = $fort_owl_name_table$.getDynamicValue( thread );
      SubLObject key = NIL;
      SubLObject fort = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          fort = Hashtables.getEntryValue( cdohash_entry );
          SubLObject current;
          final SubLObject datum = current = key;
          SubLObject name = NIL;
          SubLObject type = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
          name = current.first();
          current = ( type = current.rest() );
          if( type.eql( $kw61$OWL_NAME ) )
          {
            PrintLow.format( stream_$2, $str68$_S___S__, kb_utilities.compact_hl_external_id_string( fort ), name );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
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
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 12816L)
  public static SubLObject find_fort_by_owl_name(final SubLObject name, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw61$OWL_NAME;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant = type.eql( $kw61$OWL_NAME ) ? constants_high.find_constant( name ) : NIL;
    return ( NIL != constant ) ? constant : Hashtables.gethash_without_values( ConsesLow.cons( name, type ), $fort_owl_name_table$.getDynamicValue( thread ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 13207L)
  public static SubLObject owl_cyclify_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject owl_cycl_sentences = NIL;
    SubLObject error_message = NIL;
    SubLObject arg1 = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym70$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $owl_export_mt$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding( thread );
            try
            {
              memoization_state.$memoization_state$.bind( local_state, thread );
              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
              try
              {
                possibly_initialize_owl_export_state();
                SubLObject cdolist_list_var = all_gaf_arg1_owlifiable_asents_sorted( v_term );
                SubLObject sentence = NIL;
                sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL == formula_pattern_match.formula_matches_pattern( sentence, ConsesLow.listS( $const71$isa, v_term, $list72 ) ) || NIL == kb_accessors.binary_predicateP( v_term ) )
                  {
                    if( NIL == formula_pattern_match.formula_matches_pattern( sentence, ConsesLow.list( $const73$genls, v_term, v_term ) ) )
                    {
                      if( NIL != el_utilities.atomic_sentenceP( cycl_utilities.atomic_sentence_arg1( sentence, UNPROVIDED ) ) )
                      {
                        final SubLObject items_var = owl_cyclify_meta_asent( sentence );
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
                            owl_cycl_sentences = ConsesLow.cons( item, owl_cycl_sentences );
                          }
                        }
                        else
                        {
                          SubLObject cdolist_list_var_$5 = items_var;
                          SubLObject item2 = NIL;
                          item2 = cdolist_list_var_$5.first();
                          while ( NIL != cdolist_list_var_$5)
                          {
                            owl_cycl_sentences = ConsesLow.cons( item2, owl_cycl_sentences );
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            item2 = cdolist_list_var_$5.first();
                          }
                        }
                      }
                      else if( NIL != el_utilities.formula_arityE( sentence, TWO_INTEGER, UNPROVIDED ) )
                      {
                        final SubLObject var = owl_cyclify_binary_asent( sentence );
                        if( NIL != var )
                        {
                          owl_cycl_sentences = ConsesLow.cons( var, owl_cycl_sentences );
                        }
                      }
                      else if( NIL != formula_pattern_match.formula_matches_pattern( sentence, $list74 ) )
                      {
                        final SubLObject var = owl_cyclify_synonymous_external_concept_asent( sentence );
                        if( NIL != var )
                        {
                          owl_cycl_sentences = ConsesLow.cons( var, owl_cycl_sentences );
                        }
                      }
                      else
                      {
                        Errors.error( $str75$unexpected_asent__s, sentence );
                      }
                    }
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  sentence = cdolist_list_var.first();
                }
                if( NIL == misc_utilities.initialized_p( $owl_asents_to_export$.getDynamicValue( thread ) ) && NIL != owl_uris_and_prefixes.$owl_export_include_sameas_links_to_cyc_urisP$.getDynamicValue( thread ) )
                {
                  final SubLObject _prev_bind_0_$5 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$7 = $owl_use_external_ids_for_namesP$.currentBinding( thread );
                  try
                  {
                    owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
                    $owl_use_external_ids_for_namesP$.bind( T, thread );
                    final SubLObject full_cyc_link_asent = el_utilities.make_binary_formula( owl_cyclify_predicate( $const76$owl_sameAs ), owl_cyclify_arg1( v_term ), owl_cycl_to_xml.owl_cyc_uri_for_fort( v_term,
                        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                    owl_cycl_sentences = ConsesLow.cons( full_cyc_link_asent, owl_cycl_sentences );
                  }
                  finally
                  {
                    $owl_use_external_ids_for_namesP$.rebind( _prev_bind_1_$7, thread );
                    owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_0_$5, thread );
                  }
                  if( NIL == $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) )
                  {
                    final SubLObject _prev_bind_0_$6 = $owl_use_external_ids_for_namesP$.currentBinding( thread );
                    try
                    {
                      $owl_use_external_ids_for_namesP$.bind( T, thread );
                      final SubLObject opencyc_external_id_link_asent = el_utilities.make_binary_formula( owl_cyclify_predicate( $const76$owl_sameAs ), owl_cyclify_arg1( v_term ), owl_cycl_to_xml
                          .owl_opencyc_uri_for_fort( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                      owl_cycl_sentences = ConsesLow.cons( opencyc_external_id_link_asent, owl_cycl_sentences );
                    }
                    finally
                    {
                      $owl_use_external_ids_for_namesP$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                  if( NIL == $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) || NIL != owl_uris_and_prefixes.$owl_export_version_date$.getDynamicValue( thread ) )
                  {
                    final SubLObject _prev_bind_0_$7 = $owl_use_external_ids_for_namesP$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$8 = owl_uris_and_prefixes.$owl_export_version_date$.currentBinding( thread );
                    try
                    {
                      $owl_use_external_ids_for_namesP$.bind( T, thread );
                      owl_uris_and_prefixes.$owl_export_version_date$.bind( NIL, thread );
                      final SubLObject opencyc_external_id_link_asent2 = el_utilities.make_binary_formula( owl_cyclify_predicate( $const76$owl_sameAs ), owl_cyclify_arg1( v_term ), owl_cycl_to_xml
                          .owl_opencyc_uri_for_fort( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                      owl_cycl_sentences = ConsesLow.cons( opencyc_external_id_link_asent2, owl_cycl_sentences );
                    }
                    finally
                    {
                      owl_uris_and_prefixes.$owl_export_version_date$.rebind( _prev_bind_1_$8, thread );
                      $owl_use_external_ids_for_namesP$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                }
                arg1 = owl_cyclify_arg1( v_term );
              }
              finally
              {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                }
              }
            }
            finally
            {
              memoization_state.$memoization_state$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      Errors.warn( $str77$Caught_error_OWL_cyclifying__S___, v_term, error_message );
    }
    return ConsesLow.cons( arg1, Sequences.nreverse( owl_cycl_sentences ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 15834L)
  public static SubLObject new_owl_export_term_iterator(final SubLObject iterator)
  {
    final SubLObject terms = filter_and_sort_owl_export_terms( iterator );
    return Values.values( iteration.new_list_iterator( terms ), Sequences.length( terms ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 16102L)
  public static SubLObject filter_and_sort_owl_export_terms(final SubLObject iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = Symbols.symbol_function( EQUAL );
    SubLObject collections = set.new_set( test, UNPROVIDED );
    SubLObject binary_predicates = set.new_set( test, UNPROVIDED );
    SubLObject misc = set.new_set( test, UNPROVIDED );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        if( NIL != owlifiable_sentenceP( v_term ) )
        {
          set.set_add( v_term, misc );
        }
        else if( NIL == forts.fort_p( v_term ) )
        {
          Errors.warn( $str78$_S_is_not_a_FORT_, v_term );
        }
        else if( NIL != cycl_utilities.expression_find_if( $sym79$META_VARIABLE_P, v_term, T, UNPROVIDED ) )
        {
          nonexportable_term_warning( v_term );
        }
        else if( NIL != fort_types_interface.collection_p( v_term ) )
        {
          thread.resetMultipleValues();
          final SubLObject okP = valid_collection_fort_for_owl_exportP( v_term );
          final SubLObject binary_preds = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != okP )
          {
            add_fort_to_owl_export_set( v_term, collections );
            SubLObject cdolist_list_var = binary_preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              add_fort_to_owl_export_set( pred, binary_predicates );
              cdolist_list_var = cdolist_list_var.rest();
              pred = cdolist_list_var.first();
            }
          }
        }
        else if( NIL != kb_accessors.binary_predicateP( v_term ) )
        {
          add_fort_to_owl_export_set( v_term, binary_predicates );
        }
        else if( NIL != fort_types_interface.relation_p( v_term ) )
        {
          add_fort_to_owl_export_set( v_term, misc );
        }
        else if( NIL != isa.isa_in_any_mtP( v_term, $const80$owl_Ontology ) )
        {
          Errors.warn( $str81$Can_t_export_OWL_Ontology_as_part, v_term );
        }
        else
        {
          add_fort_to_owl_export_set( v_term, misc );
        }
      }
    }
    final SubLObject fort_count = Numbers.add( set.set_size( collections ), set.set_size( binary_predicates ), set.set_size( misc ) );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
        utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str82$Sorting_, new SubLObject[] { format_nil.format_nil_d_no_copy( fort_count ), $str83$_terms_for_OWL_export___
        } ) );
        collections = owl_sort_forts( collections );
        utilities_macros.note_percent_progress( ONE_INTEGER, FOUR_INTEGER );
        binary_predicates = owl_sort_forts( binary_predicates );
        utilities_macros.note_percent_progress( TWO_INTEGER, FOUR_INTEGER );
        misc = owl_sort_forts( misc );
        utilities_macros.note_percent_progress( THREE_INTEGER, FOUR_INTEGER );
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    if( NIL != subl_promotions.positive_integer_p( $owl_export_cap_per_category$.getDynamicValue( thread ) ) )
    {
      collections = list_utilities.first_n( $owl_export_cap_per_category$.getDynamicValue( thread ), collections );
      binary_predicates = list_utilities.first_n( $owl_export_cap_per_category$.getDynamicValue( thread ), binary_predicates );
      misc = list_utilities.first_n( $owl_export_cap_per_category$.getDynamicValue( thread ), misc );
    }
    if( NIL != $owl_profilingP$.getDynamicValue( thread ) )
    {
      collections = list_utilities.every_nth( $int84$1000, collections );
      binary_predicates = list_utilities.every_nth( $int84$1000, binary_predicates );
      misc = list_utilities.every_nth( $int84$1000, misc );
    }
    return ConsesLow.nconc( collections, binary_predicates, misc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 18204L)
  public static SubLObject add_fort_to_owl_export_set(final SubLObject fort, final SubLObject v_set)
  {
    final SubLObject fort_to_add = ( NIL != nart_handles.nart_p( fort ) ) ? owl_export_nart_export_form( fort ) : fort;
    if( NIL != forts.fort_p( fort_to_add ) )
    {
      set.set_add( fort_to_add, v_set );
    }
    else
    {
      Errors.warn( $str85$Couldn_t_resolve__S_to_a_canonica, fort );
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 18545L)
  public static SubLObject owl_export_nart_export_form(final SubLObject nart)
  {
    return ( NIL != nart_invalid_for_owl_exportP( nart ) ) ? NIL : owl_export_canonicalize_nart( nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 18690L)
  public static SubLObject owl_export_canonicalize_nart_internal(final SubLObject nart)
  {
    return narts_high.nart_substitute( narts_high.nart_el_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 18690L)
  public static SubLObject owl_export_canonicalize_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_export_canonicalize_nart_internal( nart );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym86$OWL_EXPORT_CANONICALIZE_NART, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym86$OWL_EXPORT_CANONICALIZE_NART, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym86$OWL_EXPORT_CANONICALIZE_NART, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_export_canonicalize_nart_internal( nart ) ) );
      memoization_state.caching_state_put( caching_state, nart, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 18826L)
  public static SubLObject nart_invalid_for_owl_exportP(final SubLObject nart)
  {
    assert NIL != nart_handles.nart_p( nart ) : nart;
    return makeBoolean( NIL == nart_handles.nart_p( owl_export_canonicalize_nart( nart ) ) || NIL != list_utilities.lengthG( owl_external_id_string( nart ), $int88$225, UNPROVIDED ) || NIL != list_utilities.lengthG(
        owl_fort_human_readable_name( nart, UNPROVIDED ), $int88$225, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 19155L)
  public static SubLObject delete_subsumed_owl_asents(final SubLObject asents)
  {
    return list_utilities.delete_subsumed_items( asents, $sym89$SUBSUMED_OWL_ASENT_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 19356L)
  public static SubLObject subsumed_owl_asentP(final SubLObject little, final SubLObject big)
  {
    if( !cycl_utilities.atomic_sentence_predicate( little ).equal( cycl_utilities.atomic_sentence_predicate( big ) ) )
    {
      return NIL;
    }
    if( !cycl_utilities.atomic_sentence_arg1( little, UNPROVIDED ).equal( cycl_utilities.atomic_sentence_arg1( big, UNPROVIDED ) ) )
    {
      return NIL;
    }
    if( NIL != subl_promotions.memberP( cycl_utilities.atomic_sentence_predicate( little ), $owl_transitive_via_genls_arg2_preds_to_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != genls.genlP( cycl_utilities
        .atomic_sentence_arg2( little, UNPROVIDED ), cycl_utilities.atomic_sentence_arg2( big, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 19820L)
  public static SubLObject valid_collection_fort_for_owl_exportP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject okP = valid_collection_fort_for_owl_exportP_internal( fort );
    final SubLObject binary_predicates = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == okP )
    {
      nonexportable_term_warning( fort );
    }
    return Values.values( okP, binary_predicates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 20093L)
  public static SubLObject nonexportable_term_warning_internal(final SubLObject fort)
  {
    Errors.warn( $str92$Can_t_export__S, fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 20093L)
  public static SubLObject nonexportable_term_warning(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return nonexportable_term_warning_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym91$NONEXPORTABLE_TERM_WARNING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym91$NONEXPORTABLE_TERM_WARNING, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym91$NONEXPORTABLE_TERM_WARNING, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( nonexportable_term_warning_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 20223L)
  public static SubLObject valid_collection_fort_for_owl_exportP_internal(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = forts.fort_p( fort );
    SubLObject binary_preds = NIL;
    if( NIL == fort_types_interface.collection_p( fort ) )
    {
      Errors.warn( $str93$Not_a_collection___S, fort );
      okP = NIL;
    }
    else if( NIL != nart_handles.nart_p( fort ) && NIL != nart_invalid_for_owl_exportP( fort ) )
    {
      okP = NIL;
    }
    else if( NIL != nart_handles.nart_p( fort ) && THREE_INTEGER.eql( cycl_utilities.nat_arity( fort, UNPROVIDED ) ) && NIL != isa.isaP( cycl_utilities.nat_functor( fort ), $const94$SubcollectionRelationFunction,
        UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject okP_$13 = valid_collection_fort_for_owl_exportP_internal( cycl_utilities.nat_arg1( fort, UNPROVIDED ) );
      final SubLObject binary_preds_$14 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      okP = okP_$13;
      binary_preds = binary_preds_$14;
      if( NIL != okP )
      {
        if( NIL != list_utilities.find_if_not( $sym95$FORT_P, cycl_utilities.formula_args( fort, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          okP = NIL;
        }
        else if( NIL == kb_accessors.binary_predicateP( cycl_utilities.nat_arg2( fort, UNPROVIDED ) ) )
        {
          Errors.warn( $str96$Restriction_property_is_not_a_bin, cycl_utilities.nat_arg2( fort, UNPROVIDED ) );
          okP = NIL;
        }
        else if( NIL != conses_high.member( cycl_utilities.nat_functor( fort ), $list97, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject arg2 = cycl_utilities.nat_arg2( fort, UNPROVIDED );
          final SubLObject inverse = find_or_create_inverse_binary_predicate( arg2 );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( inverse ) )
          {
            Errors.error( $str98$Couldn_t_find_or_create_inverse_o, arg2 );
          }
          final SubLObject item_var = inverse;
          if( NIL == conses_high.member( item_var, binary_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            binary_preds = ConsesLow.cons( item_var, binary_preds );
          }
        }
        else if( NIL != conses_high.member( cycl_utilities.nat_functor( fort ), $list99, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject arg2 = cycl_utilities.nat_arg2( fort, UNPROVIDED );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( arg2 ) )
          {
            Errors.error( $str100$restriction_property_is_not_a_FOR, arg2 );
          }
          final SubLObject item_var2 = arg2;
          if( NIL == conses_high.member( item_var2, binary_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            binary_preds = ConsesLow.cons( item_var2, binary_preds );
          }
        }
      }
    }
    return Values.values( okP, ( NIL != okP ) ? binary_preds : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 21653L)
  public static SubLObject owl_sort_forts(final SubLObject v_forts)
  {
    return Sort.sort( set.set_element_list( v_forts ), $sym101$OWL_FORT__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 21746L)
  public static SubLObject owl_fort_L(final SubLObject fort1, final SubLObject fort2)
  {
    if( NIL != constant_handles.constant_p( fort1 ) )
    {
      if( NIL != constant_handles.constant_p( fort2 ) )
      {
        return Strings.stringL( owl_sort_name( fort1 ), owl_sort_name( fort2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    else
    {
      if( NIL != constant_handles.constant_p( fort2 ) )
      {
        return T;
      }
      final SubLObject functor1 = cycl_utilities.nat_functor( fort1 );
      final SubLObject functor2 = cycl_utilities.nat_functor( fort2 );
      if( NIL != owl_fort_L( functor1, functor2 ) )
      {
        return T;
      }
      if( NIL != owl_fort_L( functor2, functor1 ) )
      {
        return NIL;
      }
      return Strings.stringL( owl_sort_name( fort1 ), owl_sort_name( fort2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 22496L)
  public static SubLObject all_gaf_arg1_owlifiable_asents_sorted(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $owl_asents_to_export$.getDynamicValue( thread ) ) )
    {
      return sort_owl_asents( owl_remove_type_isa( dictionary.dictionary_lookup_without_values( $owl_asents_to_export$.getDynamicValue( thread ), fort, UNPROVIDED ) ) );
    }
    final SubLObject gafs = kb_mapping.gather_gaf_arg_index( fort, ONE_INTEGER, NIL, NIL, $kw102$TRUE );
    SubLObject asents = Mapping.mapcar( $sym103$GAF_FORMULA, gafs );
    asents = ConsesLow.nconc( asents, synonymous_external_concept_asents( fort ) );
    asents = Sequences.delete_if( $sym104$OWL_BLACKLIST_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    asents = owl_adjust_isa_and_genls_asents( fort, asents );
    asents = owl_remove_type_isa( asents );
    asents = owl_remove_uvmt_anect_isa( asents );
    asents = list_utilities.delete_if_not( $sym105$OWLIFIABLE_SENTENCE_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject items_var;
    final SubLObject extras = items_var = owl_extra_arg1_asents_for_term( fort );
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
        asents = ConsesLow.cons( item, asents );
      }
    }
    else
    {
      SubLObject cdolist_list_var = items_var;
      SubLObject item2 = NIL;
      item2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        asents = ConsesLow.cons( item2, asents );
        cdolist_list_var = cdolist_list_var.rest();
        item2 = cdolist_list_var.first();
      }
    }
    asents = list_utilities.fast_delete_duplicates( asents, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    asents = owl_remove_singleton_predicates( asents );
    return sort_owl_asents( asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 23771L)
  public static SubLObject owl_whitelist_predicateP(final SubLObject obj)
  {
    return makeBoolean( NIL != subl_promotions.memberP( obj, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL != list_utilities.alist_lookup(
        owl_cycl_predicate_table( UNPROVIDED ), obj, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 24186L)
  public static SubLObject owl_blacklist_sentenceP(final SubLObject asent)
  {
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var = $owl_blacklist_sentence_patterns$.getGlobalValue();
      SubLObject pattern = NIL;
      pattern = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        if( NIL != formula_pattern_match.formula_matches_pattern( asent, pattern ) )
        {
          badP = T;
        }
        csome_list_var = csome_list_var.rest();
        pattern = csome_list_var.first();
      }
    }
    return badP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 24404L)
  public static SubLObject owl_blacklist_predicateP(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( obj, $assertion_arg0s_excluded_from_owl_export$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 24518L)
  public static SubLObject owl_adjust_isa_and_genls_asents(final SubLObject fort, SubLObject asents)
  {
    asents = Sequences.delete_if( $sym107$OWL_ISA_LIT_, Sequences.delete_if( $sym108$OWL_GENLS_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject items_var = isa_asents_for_fort( fort );
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
        asents = ConsesLow.cons( item, asents );
      }
    }
    else
    {
      SubLObject cdolist_list_var = items_var;
      SubLObject item2 = NIL;
      item2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        asents = ConsesLow.cons( item2, asents );
        cdolist_list_var = cdolist_list_var.rest();
        item2 = cdolist_list_var.first();
      }
    }
    if( NIL != fort_types_interface.collection_p( fort ) )
    {
      items_var = genls_asents_for_fort( fort );
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
          asents = ConsesLow.cons( item, asents );
        }
      }
      else
      {
        SubLObject cdolist_list_var = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          asents = ConsesLow.cons( item2, asents );
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 24881L)
  public static SubLObject isa_asents_for_fort(final SubLObject fort)
  {
    final SubLObject all_isa = isa.all_isa( fort, UNPROVIDED, UNPROVIDED );
    final SubLObject valid_isa = list_utilities.delete_if_not( $sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject min_valid_isa = genls.min_cols( valid_isa, UNPROVIDED, UNPROVIDED );
    SubLObject asents = NIL;
    SubLObject cdolist_list_var = min_valid_isa;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      asents = ConsesLow.cons( el_utilities.make_binary_formula( $const71$isa, fort, v_isa ), asents );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 25201L)
  public static SubLObject genls_asents_for_fort(final SubLObject fort)
  {
    final SubLObject all_genls = genls.genls( fort, UNPROVIDED, UNPROVIDED );
    SubLObject valid_genls = Sequences.delete( fort, list_utilities.delete_if_not( $sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_, all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject asents = NIL;
    if( NIL != list_utilities.empty_list_p( valid_genls ) )
    {
      valid_genls = ConsesLow.cons( $const110$Thing, valid_genls );
    }
    SubLObject cdolist_list_var = valid_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      asents = ConsesLow.cons( el_utilities.make_binary_formula( $const73$genls, fort, genl ), asents );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 25726L)
  public static SubLObject index_owl_asents_by_arg1(final SubLObject asents)
  {
    final SubLObject index = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = asents;
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_pushnew( index, cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ), asent, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    return index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 25945L)
  public static SubLObject synonymous_external_concept_asents(final SubLObject fort)
  {
    SubLObject asents = NIL;
    final SubLObject pred_var = $const111$synonymousExternalConceptWRTPredi;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw112$GAF, $kw102$TRUE, NIL );
            SubLObject done_var_$15 = NIL;
            final SubLObject token_var_$16 = NIL;
            while ( NIL == done_var_$15)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
              final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( gaf ) );
              if( NIL != valid_$17 && assertions_high.gaf_arg3( gaf ).eql( $const113$rdf_type ) )
              {
                asents = ConsesLow.cons( ConsesLow.list( $const114$synonymousExternalConcept, fort, assertions_high.gaf_arg2( gaf ), assertions_high.gaf_arg4( gaf ) ), asents );
              }
              done_var_$15 = makeBoolean( NIL == valid_$17 );
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
    final SubLObject set_var = gather_synonyms_via_synonymous_external_concept( fort, UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject v_term;
    SubLObject pred_var2;
    SubLObject iterator_var2;
    SubLObject done_var2;
    SubLObject token_var2;
    SubLObject final_index_spec2;
    SubLObject valid2;
    SubLObject final_index_iterator2;
    SubLObject done_var_$16;
    SubLObject token_var_$17;
    SubLObject gaf2;
    SubLObject valid_$18;
    SubLObject item_var;
    SubLObject _prev_bind_2;
    SubLObject _values2;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      v_term = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, v_term ) )
      {
        pred_var2 = $const114$synonymousExternalConcept;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var2 ) )
        {
          iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var2 );
          done_var2 = NIL;
          token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw112$GAF, $kw102$TRUE, NIL );
                done_var_$16 = NIL;
                token_var_$17 = NIL;
                while ( NIL == done_var_$16)
                {
                  gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$17 );
                  valid_$18 = makeBoolean( !token_var_$17.eql( gaf2 ) );
                  if( NIL != valid_$18 )
                  {
                    item_var = el_utilities.replace_formula_arg( ONE_INTEGER, fort, gaf2 );
                    if( NIL == conses_high.member( item_var, asents, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      asents = ConsesLow.cons( item_var, asents );
                    }
                  }
                  done_var_$16 = makeBoolean( NIL == valid_$18 );
                }
              }
              finally
              {
                _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
        }
      }
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 26562L)
  public static SubLObject gather_synonyms_via_synonymous_external_concept(final SubLObject indexed_term, SubLObject known_synonyms)
  {
    if( known_synonyms == UNPROVIDED )
    {
      known_synonyms = set_utilities.new_singleton_set( indexed_term, Symbols.symbol_function( EQL ) );
    }
    final SubLObject pred_var = $const114$synonymousExternalConcept;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( indexed_term, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( indexed_term, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw112$GAF, $kw102$TRUE, NIL );
            SubLObject done_var_$21 = NIL;
            final SubLObject token_var_$22 = NIL;
            while ( NIL == done_var_$21)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
              final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( gaf ) );
              if( NIL != valid_$23 )
              {
                final SubLObject ontology = assertions_high.gaf_arg2( gaf );
                final SubLObject local_name = assertions_high.gaf_arg3( gaf );
                final SubLObject pred_var_$24 = $const114$synonymousExternalConcept;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( local_name, THREE_INTEGER, pred_var_$24 ) )
                {
                  final SubLObject iterator_var_$25 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( local_name, THREE_INTEGER, pred_var_$24 );
                  SubLObject done_var_$22 = NIL;
                  final SubLObject token_var_$23 = NIL;
                  while ( NIL == done_var_$22)
                  {
                    final SubLObject final_index_spec_$28 = iteration.iteration_next_without_values_macro_helper( iterator_var_$25, token_var_$23 );
                    final SubLObject valid_$24 = makeBoolean( !token_var_$23.eql( final_index_spec_$28 ) );
                    if( NIL != valid_$24 )
                    {
                      SubLObject final_index_iterator_$30 = NIL;
                      try
                      {
                        final_index_iterator_$30 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$28, $kw112$GAF, $kw102$TRUE, NIL );
                        SubLObject done_var_$23 = NIL;
                        final SubLObject token_var_$24 = NIL;
                        while ( NIL == done_var_$23)
                        {
                          final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$30, token_var_$24 );
                          final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( gaf2 ) );
                          if( NIL != valid_$25 && assertions_high.gaf_arg2( gaf2 ).eql( ontology ) && NIL != kb_indexing_datastructures.indexed_term_p( assertions_high.gaf_arg1( gaf2 ) ) && NIL == set.set_memberP(
                              assertions_high.gaf_arg1( gaf2 ), known_synonyms ) )
                          {
                            final SubLObject synonym = assertions_high.gaf_arg1( gaf2 );
                            set.set_add( synonym, known_synonyms );
                            gather_synonyms_via_synonymous_external_concept( synonym, known_synonyms );
                          }
                          done_var_$23 = makeBoolean( NIL == valid_$25 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                        try
                        {
                          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                          final SubLObject _values = Values.getValuesAsVector();
                          if( NIL != final_index_iterator_$30 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$30 );
                          }
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                        }
                      }
                    }
                    done_var_$22 = makeBoolean( NIL == valid_$24 );
                  }
                }
              }
              done_var_$21 = makeBoolean( NIL == valid_$23 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return known_synonyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 27395L)
  public static SubLObject sort_owl_asents(final SubLObject asents)
  {
    return Sort.sort( asents, $sym115$OWL_ASENT__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 27468L)
  public static SubLObject owl_remove_singleton_predicates(final SubLObject asents)
  {
    final SubLObject comment_count = Sequences.count_if( $sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( comment_count.numG( ONE_INTEGER ) )
    {
      final SubLObject first_comment_asent = Sequences.find_if( $sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject other_asents = Sequences.remove_if( $sym116$COMMENT_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return ConsesLow.listS( first_comment_asent, other_asents );
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 27862L)
  public static SubLObject comment_asentP(final SubLObject v_object)
  {
    return el_utilities.el_formula_with_operator_p( v_object, $const117$comment );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 27958L)
  public static SubLObject owlifiable_sentenceP(final SubLObject sentence)
  {
    if( NIL == el_utilities.atomic_sentenceP( sentence ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_binary_formula_p( sentence ) && NIL != owlifiable_arg0P( cycl_utilities.atomic_sentence_predicate( sentence ) ) && NIL != owlifiable_arg1P( cycl_utilities.atomic_sentence_arg1( sentence,
        UNPROVIDED ) ) && NIL != owlifiable_arg2P( cycl_utilities.atomic_sentence_predicate( sentence ), cycl_utilities.atomic_sentence_arg2( sentence, UNPROVIDED ) ) )
    {
      return T;
    }
    if( NIL != formula_pattern_match.formula_matches_pattern( sentence, $list118 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 28521L)
  public static SubLObject owlifiable_arg0P(final SubLObject v_object)
  {
    return makeBoolean( NIL != owl_whitelist_predicateP( v_object ) || ( NIL != kb_accessors.binary_predicateP( v_object ) && NIL != owl_cycl_to_xml.fort_in_owl_exportP( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 28687L)
  public static SubLObject owlifiable_arg1P(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) || NIL != owlifiable_sentenceP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 28798L)
  public static SubLObject owlifiable_arg2P(final SubLObject predicate, final SubLObject arg2)
  {
    if( NIL != nart_handles.nart_p( arg2 ) && NIL != nart_invalid_for_owl_exportP( arg2 ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.member_eqP( predicate, $owl_permissive_arg2_predicates$.getGlobalValue() ) )
    {
      return T;
    }
    if( NIL != list_utilities.member_eqP( predicate, $owl_fort_arg2_predicates$.getGlobalValue() ) )
    {
      return makeBoolean( ( NIL == fort_types_interface.collection_p( arg2 ) || NIL != valid_collection_fort_for_owl_exportP( arg2 ) ) && NIL != forts.fort_p( arg2 ) );
    }
    return makeBoolean( NIL != owl_cycl_to_xml.fort_in_owl_exportP( arg2 ) || NIL != owlifiable_date_p( arg2 ) || arg2.isString() || arg2.isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 29309L)
  public static SubLObject owlifiable_date_p(final SubLObject obj)
  {
    return makeBoolean( NIL != date_utilities.date_p( obj ) && NIL != conses_high.member( cycl_utilities.nat_functor( obj ), $list119, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 29465L)
  public static SubLObject owl_extra_arg1_asents_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject extra_asents = NIL;
    final SubLObject preferred_english = owl_preferred_english_for_term( fort );
    extra_asents = ConsesLow.cons( ConsesLow.list( $const120$preferredEnglish, fort, preferred_english ), extra_asents );
    SubLObject cdolist_list_var = owl_other_english_for_term( fort );
    SubLObject other_english = NIL;
    other_english = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_string_p( other_english ) && !other_english.equalp( preferred_english ) )
      {
        extra_asents = ConsesLow.cons( ConsesLow.list( $const38$otherEnglish, fort, other_english ), extra_asents );
      }
      cdolist_list_var = cdolist_list_var.rest();
      other_english = cdolist_list_var.first();
    }
    extra_asents = ConsesLow.cons( ConsesLow.list( $const40$cycName, fort, owl_fort_cyc_name( fort ) ), extra_asents );
    if( NIL == $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) )
    {
      extra_asents = ConsesLow.cons( ConsesLow.list( $const44$owlExternalID, fort, owl_external_id_string( fort ) ), extra_asents );
    }
    if( NIL != owl_functional_propertyP( fort ) )
    {
      extra_asents = ConsesLow.cons( ConsesLow.listS( $const121$specialIsa, fort, $list122 ), extra_asents );
    }
    else if( NIL != owl_inverse_functional_propertyP( fort ) )
    {
      extra_asents = ConsesLow.cons( ConsesLow.listS( $const121$specialIsa, fort, $list123 ), extra_asents );
    }
    if( NIL != owl_subcollection_nart_p( fort ) )
    {
      final SubLObject var = owl_subcollection_asent( fort );
      if( NIL != var )
      {
        extra_asents = ConsesLow.cons( var, extra_asents );
      }
    }
    final SubLObject var2;
    final SubLObject umbel_uri_sentence = var2 = umbel_uri_sentence_for_fort( fort );
    if( NIL != var2 )
    {
      extra_asents = ConsesLow.cons( var2, extra_asents );
    }
    return Sequences.nreverse( extra_asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 30678L)
  public static SubLObject owl_functional_propertyP(final SubLObject fort)
  {
    if( NIL != kb_accessors.binary_predicateP( fort ) )
    {
      return makeBoolean( NIL != isa.isaP( fort, $const124$StrictlyFunctionalSlot, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.tuple_holds( ConsesLow.listS( $const125$argCardinality, fort, $list126 ),
          UNPROVIDED, UNPROVIDED ) || NIL != backward.removal_ask( ConsesLow.listS( $const127$strictlyFunctionalInArgs, fort, $list128 ), $const6$InferencePSC, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 30941L)
  public static SubLObject owl_inverse_functional_propertyP(final SubLObject fort)
  {
    if( NIL != kb_accessors.binary_predicateP( fort ) )
    {
      return makeBoolean( NIL != kb_mapping_utilities.tuple_holds( ConsesLow.listS( $const125$argCardinality, fort, $list129 ), UNPROVIDED, UNPROVIDED ) || NIL != backward.removal_ask( ConsesLow.listS(
          $const127$strictlyFunctionalInArgs, fort, $list130 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 31153L)
  public static SubLObject owl_remove_type_isa(final SubLObject asents)
  {
    return Sequences.remove_if( $sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 31338L)
  public static SubLObject owl_redundant_type_isa_asentP(final SubLObject asent)
  {
    if( NIL != owl_isa_litP( asent ) )
    {
      final SubLObject ins = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      final SubLObject type = best_isa_for_term( ins );
      return genls.genlP( type, col, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 31586L)
  public static SubLObject owl_isa_litP(final SubLObject asent)
  {
    return makeBoolean( NIL != el_utilities.isa_litP( asent ) || NIL != el_utilities.el_formula_with_operator_p( asent, $const113$rdf_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 31702L)
  public static SubLObject owl_genls_litP(final SubLObject asent)
  {
    return makeBoolean( NIL != el_utilities.genls_litP( asent ) || NIL != el_utilities.el_formula_with_operator_p( asent, $const132$rdfs_subClassOf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 31829L)
  public static SubLObject owl_remove_uvmt_anect_isa(final SubLObject asents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject removeP = NIL;
    if( ONE_INTEGER.numE( Sequences.count_if( $sym133$ISA_LIT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      removeP = NIL;
    }
    else if( NIL != $owl_remove_isa_individual_asentsP$.getDynamicValue( thread ) )
    {
      removeP = T;
    }
    else if( NIL != kb_accessors.binary_predicateP( cycl_utilities.atomic_sentence_arg1( asents.first(), UNPROVIDED ) ) )
    {
      removeP = T;
    }
    else
    {
      removeP = NIL;
    }
    if( NIL != removeP )
    {
      return Sequences.remove_if( $sym134$ISA_INDIVIDUAL_ASENT_, asents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 32242L)
  public static SubLObject isa_individual_asentP(final SubLObject asent)
  {
    return makeBoolean( NIL != el_utilities.isa_litP( asent ) && $const135$Individual.eql( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 32385L)
  public static SubLObject owl_asent_L(final SubLObject asent1, final SubLObject asent2)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( asent1, $const136$rdfURI ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_formula_with_operator_p( asent2, $const136$rdfURI ) )
    {
      return T;
    }
    if( NIL != el_utilities.formula_arityE( asent1, TWO_INTEGER, UNPROVIDED ) && NIL != el_utilities.formula_arityE( asent2, TWO_INTEGER, UNPROVIDED ) )
    {
      return owl_binary_asent_L( asent1, asent2 );
    }
    return kb_utilities.term_L( asent1, asent2, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 32736L)
  public static SubLObject owl_binary_asent_L(final SubLObject asent1, final SubLObject asent2)
  {
    final SubLObject pred1 = cycl_utilities.atomic_sentence_predicate( asent1 );
    final SubLObject pred2 = cycl_utilities.atomic_sentence_predicate( asent2 );
    final SubLObject pos1 = Sequences.position( pred1, owl_cycl_predicate_table( UNPROVIDED ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym137$FIRST ), UNPROVIDED, UNPROVIDED );
    final SubLObject pos2 = Sequences.position( pred2, owl_cycl_predicate_table( UNPROVIDED ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym137$FIRST ), UNPROVIDED, UNPROVIDED );
    if( NIL == pos1 && NIL == pos2 )
    {
      return kb_utilities.term_L_with_constant_by_name( pred1, pred2, UNPROVIDED );
    }
    if( NIL == pos1 )
    {
      return NIL;
    }
    if( NIL == pos2 )
    {
      return T;
    }
    if( pos1.numL( pos2 ) )
    {
      return T;
    }
    if( pos1.numG( pos2 ) )
    {
      return NIL;
    }
    final SubLObject term1 = cycl_utilities.sentence_arg2( asent1, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.sentence_arg2( asent2, UNPROVIDED );
    if( NIL != constant_handles.constant_p( term1 ) )
    {
      if( NIL != constant_handles.constant_p( term2 ) )
      {
        return Strings.stringL( owl_sort_name( term1 ), owl_sort_name( term2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    else
    {
      if( NIL != constant_handles.constant_p( term2 ) )
      {
        return T;
      }
      final SubLObject name1 = owl_sort_name( term1 );
      final SubLObject name2 = owl_sort_name( term2 );
      return Strings.stringL( name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 33846L)
  public static SubLObject owl_cyclify_binary_asent(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject owl_asent = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym70$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$34 = $asent_to_owl_cyclify$.currentBinding( thread );
          try
          {
            $asent_to_owl_cyclify$.bind( asent, thread );
            thread.resetMultipleValues();
            final SubLObject predicate = el_utilities.unmake_binary_formula( asent );
            final SubLObject arg1 = thread.secondMultipleValue();
            final SubLObject arg2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject owl_cycl_pred = owl_cyclify_predicate( predicate );
            if( NIL == owl_cycl_pred )
            {
              Errors.warn( $str138$unexpected_owl_cycl_pred_for_asen, asent );
            }
            if( NIL != owl_cycl_pred )
            {
              final SubLObject owl_cycl_arg1 = owl_cyclify_arg1( arg1 );
              final SubLObject owl_cycl_arg2 = owl_cyclify_arg2( arg2, predicate );
              owl_asent = el_utilities.make_binary_formula( owl_cycl_pred, owl_cycl_arg1, owl_cycl_arg2 );
            }
          }
          finally
          {
            $asent_to_owl_cyclify$.rebind( _prev_bind_0_$34, thread );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      Errors.warn( $str139$Caught_error__S___while_trying_to, error_message, asent );
    }
    return owl_asent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 34617L)
  public static SubLObject owl_cyclify_meta_asent(final SubLObject asent)
  {
    final SubLObject owlified = owl_cyclify_binary_asent( asent );
    final SubLObject topic_asent = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject statement = owl_cyclify_arg1( asent );
    return ConsesLow.cons( owlified, owl_reification_asents( topic_asent, statement ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 34886L)
  public static SubLObject owl_reification_asents(final SubLObject topic_asent, final SubLObject statement)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( topic_asent, UNPROVIDED );
    SubLObject predicate = NIL;
    SubLObject subject = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    subject = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list140 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( owl_reification_asent( $str141$subject, statement, subject ), owl_reification_asent( $str142$predicate, statement, predicate ), owl_reification_asent( $str143$object, statement, v_object ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list140 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 35221L)
  public static SubLObject owl_reification_asent(final SubLObject predicate, final SubLObject statement, final SubLObject v_object)
  {
    assert NIL != Types.stringp( predicate ) : predicate;
    return el_utilities.make_binary_formula( el_utilities.make_unary_formula( $const145$OWLPredicateFn, rdf_utilities.rdf_name( predicate ) ), statement, owl_cyclify_arg2( v_object, predicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 35497L)
  public static SubLObject owl_cyclify_predicate(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject owl_pred = list_utilities.alist_lookup( owl_cycl_predicate_table( UNPROVIDED ), pred, UNPROVIDED, UNPROVIDED );
    if( NIL == owl_pred || NIL != subl_promotions.memberP( pred, $owl_cycl_predicates_to_use_as_is$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      if( NIL == misc_utilities.initialized_p( $owl_asents_to_export$.getDynamicValue( thread ) ) )
      {
        enforceType( pred, $sym146$FORT_IN_OWL_EXPORT_ );
      }
      final SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding( thread );
      try
      {
        $owl_use_entity_referencesP$.bind( NIL, thread );
        owl_pred = owl_uris_and_prefixes.possibly_abbreviate_uri( owl_fort_name( pred, T, UNPROVIDED ) );
      }
      finally
      {
        $owl_use_entity_referencesP$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != owl_pred ) ? ConsesLow.list( $const145$OWLPredicateFn, owl_pred ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 35979L)
  public static SubLObject owl_cyclify_arg1(final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( arg1, $sym147$OWLIFIABLE_ARG1_ );
    SubLObject uri = NIL;
    SubLObject term_type = NIL;
    final SubLObject _prev_bind_0 = $owl_use_entity_referencesP$.currentBinding( thread );
    try
    {
      $owl_use_entity_referencesP$.bind( NIL, thread );
      if( NIL != forts.fort_p( arg1 ) )
      {
        if( NIL != $owl_prefer_ontology_urisP$.getDynamicValue( thread ) && NIL != $owl_export_ontology$.getDynamicValue( thread ) && NIL != $owl_export_mt$.getDynamicValue( thread ) )
        {
          uri = asserted_name_in_ontology( arg1, $owl_export_ontology$.getDynamicValue( thread ), $owl_export_mt$.getDynamicValue( thread ) );
        }
        else
        {
          uri = owl_fort_name( arg1, NIL, T );
        }
      }
      term_type = owl_uris_and_prefixes.possibly_abbreviate_uri( owl_term_type( arg1 ) );
      if( ( NIL == web_utilities.uri_p( term_type, UNPROVIDED ) || NIL == string_utilities.starts_with( term_type, owl_uris_and_prefixes.owl_export_default_namespace() ) ) && NIL == xml_utilities.valid_xml_name_p(
          term_type ) )
      {
        Errors.sublisp_break( $str148$Invalid_term_type___S_for__S__Exp, new SubLObject[] { term_type, arg1, owl_uris_and_prefixes.owl_export_default_namespace()
        } );
      }
    }
    finally
    {
      $owl_use_entity_referencesP$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.list( $const149$OWLTermOfTypeFn, term_type, uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 36931L)
  public static SubLObject owl_cyclify_arg2(final SubLObject arg2, final SubLObject property)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( arg2, $const150$OWLIntersectionFn ) )
    {
      return owl_cyclify_intersection( arg2 );
    }
    if( NIL != uri_fort_p( arg2 ) )
    {
      return el_utilities.make_unary_formula( $const151$OWLURIFn, stringify_uri_fort( arg2 ) );
    }
    if( NIL != date_utilities.date_p( arg2 ) )
    {
      final SubLObject datatype = owl_arg2_datatype( property, arg2 );
      final SubLObject date_string = owl_date_string( arg2 );
      return ( NIL != datatype && NIL != date_string ) ? el_utilities.make_binary_formula( $const152$OWLDatatypeFn, datatype, date_string ) : strip_hl_artifacts( owl_str_with_quotes_allowed( arg2 ) );
    }
    if( NIL != unicode_nauts.unicode_naut_p( arg2, UNPROVIDED ) )
    {
      return cycl_string.cycl_string_to_utf8_string( arg2 );
    }
    if( NIL != el_utilities.el_formula_p( arg2 ) )
    {
      Errors.sublisp_break( $str153$Unexpected_EL_formula_arg2___S, new SubLObject[] { arg2
      } );
      return strip_hl_artifacts( owl_str_with_quotes_allowed( arg2 ) );
    }
    if( arg2.isString() && NIL != Sequences.search( constant_reader.constant_reader_prefix(), arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return owl_cyclify_string_with_constant_references( arg2, UNPROVIDED );
    }
    SubLObject result = NIL;
    if( NIL == result )
    {
      final SubLObject uri = list_utilities.alist_lookup( $owl_cycl_property_table$.getGlobalValue(), arg2, Symbols.symbol_function( EQL ), NIL );
      if( NIL != uri )
      {
        result = el_utilities.make_unary_formula( $const151$OWLURIFn, uri );
      }
    }
    if( NIL == result )
    {
      final SubLObject mapping = list_utilities.alist_lookup( $owl_cycl_collection_table$.getGlobalValue(), arg2, UNPROVIDED, UNPROVIDED );
      if( NIL != mapping )
      {
        SubLObject current;
        final SubLObject datum = current = mapping;
        SubLObject entity = NIL;
        SubLObject local_name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
        entity = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
        local_name = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != entity )
          {
            result = el_utilities.make_unary_formula( $const151$OWLURIFn, maybe_expand_owl_entity_reference( entity, local_name ) );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list154 );
        }
      }
    }
    if( NIL == result )
    {
      final SubLObject raw_term_string = owl_term_string( arg2, UNPROVIDED );
      final SubLObject datatype2 = owl_arg2_datatype( property, arg2 );
      if( NIL != forts.fort_p( arg2 ) )
      {
        if( NIL == web_utilities.uri_p( raw_term_string, UNPROVIDED ) && !string_utilities.first_char( raw_term_string ).eql( Characters.CHAR_ampersand ) )
        {
          Errors.sublisp_break( $str155$Raw_term_string_for__S___S, new SubLObject[] { arg2, raw_term_string
          } );
        }
        final SubLObject term_string = raw_term_string;
        result = el_utilities.make_unary_formula( $const151$OWLURIFn, term_string );
      }
      else if( arg2.isNumber() && NIL != datatype2 )
      {
        result = el_utilities.make_binary_formula( $const152$OWLDatatypeFn, datatype2, raw_term_string );
      }
      else if( arg2.isString() )
      {
        result = raw_term_string;
      }
      else
      {
        Errors.sublisp_break( $str156$Need_XSD_datatype_for__S, new SubLObject[] { arg2
        } );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 39362L)
  public static SubLObject owl_date_string(final SubLObject date)
  {
    final SubLObject pcase_var = cycl_utilities.nat_functor( date );
    if( pcase_var.eql( $const157$SecondFn ) )
    {
      return owl_date_instant_string( date );
    }
    if( pcase_var.eql( $const158$DayFn ) )
    {
      return owl_day_string( date );
    }
    if( pcase_var.eql( $const159$MonthFn ) )
    {
      return owl_month_string( date );
    }
    if( pcase_var.eql( $const160$YearFn ) )
    {
      return owl_year_string( date );
    }
    if( pcase_var.eql( $const161$CenturyFn ) )
    {
      return owl_century_string( date );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 39668L)
  public static SubLObject owl_arg2_datatype(final SubLObject property, final SubLObject arg2)
  {
    SubLObject result = NIL;
    if( arg2.isInteger() )
    {
      result = maybe_expand_owl_entity_reference( $str162$xsd, $str163$integer );
    }
    else if( arg2.isNumber() )
    {
      result = maybe_expand_owl_entity_reference( $str162$xsd, $str164$decimal );
    }
    else if( NIL != date_utilities.date_p( arg2 ) )
    {
      final SubLObject pcase_var = cycl_utilities.nat_functor( arg2 );
      if( pcase_var.eql( $const158$DayFn ) || pcase_var.eql( $const159$MonthFn ) || pcase_var.eql( $const160$YearFn ) || pcase_var.eql( $const161$CenturyFn ) )
      {
        result = maybe_expand_owl_entity_reference( $str162$xsd, $str165$date );
      }
      else if( pcase_var.eql( $const157$SecondFn ) )
      {
        result = maybe_expand_owl_entity_reference( $str162$xsd, $str166$timeInstant );
      }
      else
      {
        Errors.sublisp_break( $str167$Don_t_know_XSD_datatype_for__S, new SubLObject[] { arg2
        } );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40276L)
  public static SubLObject owl_day_string(final SubLObject date)
  {
    return date_defns.cyc_date_encode_string( $str168$YYYY_MM_DD, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40367L)
  public static SubLObject owl_month_string(final SubLObject date)
  {
    return date_defns.cyc_date_encode_string( $str169$YYYY_MM, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40457L)
  public static SubLObject owl_year_string(final SubLObject date)
  {
    return date_defns.cyc_date_encode_string( $str170$YYYY, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40543L)
  public static SubLObject owl_century_string(final SubLObject date)
  {
    return print_high.princ_to_string( number_utilities.f_1_( cycl_utilities.nat_arg1( date, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40634L)
  public static SubLObject owl_date_instant_string(final SubLObject date)
  {
    return date_defns.cyc_date_encode_string( $str171$YYYY_MM_DDTHH_MM_SS, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40743L)
  public static SubLObject maybe_expand_owl_entity_reference(final SubLObject entity, final SubLObject local_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $owl_use_entity_referencesP$.getDynamicValue( thread ) ) ? Sequences.cconcatenate( $str172$_, new SubLObject[] { entity, $str173$_, local_name
    } ) : Sequences.cconcatenate( list_utilities.alist_lookup( owl_uris_and_prefixes.$owl_export_entity_map$.getDynamicValue( thread ), entity, Symbols.symbol_function( EQUAL ), UNPROVIDED ), local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 40989L)
  public static SubLObject uri_fort_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != subl_promotions.memberP( cycl_utilities.nat_functor( v_object ), $list174, UNPROVIDED, UNPROVIDED ) || ( NIL != constant_handles.constant_p( v_object ) && NIL != isa.isa_in_any_mtP(
        v_object, $const175$UniformResourceIdentifier ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 41205L)
  public static SubLObject stringify_uri_fort(final SubLObject uri_fort)
  {
    enforceType( uri_fort, $sym176$URI_FORT_P );
    return stringify_uri_fort_internal( uri_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 41336L)
  public static SubLObject stringify_uri_fort_internal(final SubLObject uri_fort)
  {
    if( uri_fort.isString() )
    {
      return uri_fort;
    }
    final SubLObject pcase_var = cycl_utilities.nat_functor( uri_fort );
    if( pcase_var.eql( $const177$URIFn ) )
    {
      return stringify_uri_fort_internal( cycl_utilities.nat_arg1( uri_fort, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const178$URIInNamespaceFn ) )
    {
      return Sequences.cconcatenate( stringify_uri_fort_internal( cycl_utilities.nat_arg1( uri_fort, UNPROVIDED ) ), cycl_utilities.nat_arg2( uri_fort, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const179$URIWithFragmentFn ) )
    {
      return Sequences.cconcatenate( stringify_uri_fort_internal( cycl_utilities.nat_arg1( uri_fort, UNPROVIDED ) ), new SubLObject[] { $str180$_, cycl_utilities.nat_arg2( uri_fort, UNPROVIDED )
      } );
    }
    final SubLObject asserted = ask_utilities.query_variable( $sym181$_URI_STRING, ConsesLow.listS( $const182$uriString, uri_fort, $list183 ), $const6$InferencePSC, $list184 );
    if( NIL != asserted )
    {
      return asserted.first();
    }
    Errors.error( $str185$Can_t_convert_URI_FORT_to_string_, uri_fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 42225L)
  public static SubLObject owl_cyclify_string_with_constant_references(final SubLObject string, SubLObject include_popupsP)
  {
    if( include_popupsP == UNPROVIDED )
    {
      include_popupsP = $owl_include_cyc_constant_popupsP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != misc_utilities.initialized_p( $asent_to_owl_cyclify$.getDynamicValue( thread ) ) && NIL != conses_high.member( cycl_utilities.atomic_sentence_predicate( $asent_to_owl_cyclify$.getDynamicValue( thread ) ),
        $owl_link_constant_references_for_these_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
        try
        {
          html_macros.$html_stream$.bind( stream, thread );
          html_utilities.html_princ_cycl_string( string, ( NIL != include_popupsP ) ? $sym187$HTML_LINK_TO_OWL_URI_WITH_POPUPS : $sym188$HTML_LINK_TO_OWL_URI, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_stream$.rebind( _prev_bind_0, thread );
        }
        result = streams_high.get_output_stream_string( stream );
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
    }
    if( NIL == result )
    {
      result = string_utilities.remove_substring( string, constant_reader.constant_reader_prefix() );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 42937L)
  public static SubLObject initialize_owl_span_id_counter()
  {
    integer_sequence_generator.integer_sequence_generator_reset( $owl_span_id_counter$.getGlobalValue() );
    return $owl_span_id_counter$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 43078L)
  public static SubLObject next_owl_span_id()
  {
    return integer_sequence_generator.integer_sequence_generator_next( $owl_span_id_counter$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 43180L)
  public static SubLObject html_link_to_owl_uri_with_popups(final SubLObject fort, SubLObject opencycP)
  {
    if( opencycP == UNPROVIDED )
    {
      opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject uri = ( NIL != opencycP ) ? owl_cycl_to_xml.owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : owl_cycl_to_xml.owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject span_id = next_owl_span_id();
    final SubLObject mouseover = Sequences.cconcatenate( $str189$TagToTip__, new SubLObject[] { format_nil.format_nil_d_no_copy( span_id ), $str190$__
    } );
    final SubLObject mouseout = $str191$UnTip__;
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( uri );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( mouseover );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( mouseout );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( owl_fort_human_readable_name( fort, UNPROVIDED ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != span_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( span_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str192$owl_cyc_constant_tooltip );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str193$display__none_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str194$comment_header );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( owl_fort_cyc_name( fort ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str194$comment_header );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str195$ID___A, owl_external_id_string( fort ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str196$comment_body );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_output_owl_fort_comment( fort, NIL );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 43180L)
  public static SubLObject html_link_to_owl_uri(final SubLObject fort, SubLObject opencycP)
  {
    if( opencycP == UNPROVIDED )
    {
      opencycP = owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject uri = ( NIL != opencycP ) ? owl_cycl_to_xml.owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : owl_cycl_to_xml.owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( uri );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str197$cyc_term );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( owl_fort_human_readable_name( fort, UNPROVIDED ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 43180L)
  public static SubLObject html_link_to_owl_opencyc_uri(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject uri = owl_cycl_to_xml.owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( uri );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str197$cyc_term );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( owl_fort_human_readable_name( fort, UNPROVIDED ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 44630L)
  public static SubLObject html_output_owl_fort_comment(final SubLObject fort, SubLObject include_popupsP)
  {
    if( include_popupsP == UNPROVIDED )
    {
      include_popupsP = T;
    }
    final SubLObject comment = kb_accessors.comment( fort, UNPROVIDED );
    html_utilities.html_princ( owl_cyclify_string_with_constant_references( ( NIL != comment ) ? comment : $str199$No_comment_, include_popupsP ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 44900L)
  public static SubLObject owl_subcollection_nart_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) && NIL != kb_accessors.subcollection_relation_function_expression_p( v_object ) && NIL != forts.fort_p( cycl_utilities.nat_arg1( v_object, UNPROVIDED ) )
        && NIL != fort_types_interface.collection_p( cycl_utilities.nat_arg1( v_object, UNPROVIDED ) ) && NIL != forts.fort_p( cycl_utilities.nat_arg2( v_object, UNPROVIDED ) ) && NIL != forts.fort_p( cycl_utilities
            .nat_arg3( v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 45221L)
  public static SubLObject owl_subcollection_asent(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject functor = el_utilities.unmake_ternary_formula( nart );
    final SubLObject arg1 = thread.secondMultipleValue();
    final SubLObject arg2 = thread.thirdMultipleValue();
    final SubLObject arg3 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject property = NIL;
    final SubLObject pcase_var = functor;
    if( pcase_var.eql( $const200$SubcollectionOfWithRelationToFn ) || pcase_var.eql( $const201$SubcollectionOfWithRelationToType ) )
    {
      property = arg2;
    }
    else if( pcase_var.eql( $const202$SubcollectionOfWithRelationFromFn ) || pcase_var.eql( $const203$SubcollectionOfWithRelationFromTy ) )
    {
      property = find_inverse_binary_predicate( arg2 );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( property ) )
      {
        Errors.error( $str204$Couldn_t_find_inverse_of__S, arg2 );
      }
    }
    else
    {
      Errors.error( $str205$unexpected_subcollection_function, functor );
    }
    return ConsesLow.list( $const206$owl_intersectionOf, nart, ConsesLow.list( $const150$OWLIntersectionFn, arg1, ConsesLow.list( $const207$OWLRestrictionFn, $const208$owl_onProperty, property, $const209$owl_hasValue,
        arg3 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 46007L)
  public static SubLObject inverse_binary_predicate_sentence(final SubLObject predicate)
  {
    return ConsesLow.list( $const211$and, ConsesLow.list( $const212$genlInverse, $inverse_binary_predicate_var$.getGlobalValue(), predicate ), ConsesLow.list( $const212$genlInverse, predicate,
        $inverse_binary_predicate_var$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 46210L)
  public static SubLObject find_or_create_inverse_binary_predicate_internal(final SubLObject predicate)
  {
    SubLObject inverse = find_inverse_binary_predicate( predicate );
    if( NIL == forts.fort_p( inverse ) )
    {
      if( NIL == isa.isaP( predicate, $const214$BinaryPredicate, UNPROVIDED, UNPROVIDED ) )
      {
        cyc_kernel.cyc_assert( ConsesLow.listS( $const71$isa, predicate, $list215 ), $const216$UniversalVocabularyMt, UNPROVIDED );
      }
      final SubLObject nat_formula = ConsesLow.list( $const217$InverseBinaryPredicateFn, predicate );
      inverse = narts_high.find_nart( nat_formula );
      if( NIL == forts.fort_p( inverse ) )
      {
        inverse = czer_main.cyc_find_or_create_nart( nat_formula, UNPROVIDED );
        PrintLow.format( T, $str218$__Created__S__, inverse );
      }
      cyc_kernel.cyc_assert( cycl_utilities.expression_subst( inverse, $inverse_binary_predicate_var$.getGlobalValue(), inverse_binary_predicate_sentence( predicate ), UNPROVIDED, UNPROVIDED ),
          $const216$UniversalVocabularyMt, UNPROVIDED );
    }
    return inverse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 46210L)
  public static SubLObject find_or_create_inverse_binary_predicate(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return find_or_create_inverse_binary_predicate_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( find_or_create_inverse_binary_predicate_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 46941L)
  public static SubLObject find_inverse_binary_predicate(final SubLObject predicate)
  {
    enforceType( predicate, $sym219$BINARY_PREDICATE_ );
    return ask_utilities.query_variable( $inverse_binary_predicate_var$.getGlobalValue(), inverse_binary_predicate_sentence( predicate ), $const216$UniversalVocabularyMt, $list220 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 47248L)
  public static SubLObject owl_cyclify_intersection(final SubLObject naut)
  {
    SubLObject owl_intersection_fn = NIL;
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( naut, naut, $list221 );
    owl_intersection_fn = naut.first();
    SubLObject current = naut.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject owl_restriction_fn = NIL;
    SubLObject owl_on_property = NIL;
    SubLObject property = NIL;
    SubLObject owl_has_value = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    owl_restriction_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    owl_on_property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    owl_has_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, naut, $list221 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        return ConsesLow.list( $const150$OWLIntersectionFn, owl_cyclify_arg1( v_class ), ConsesLow.list( $const207$OWLRestrictionFn, $str222$owl_Restriction, $str223$owl_onProperty, owl_cyclify_intersection_property(
            property ), $str224$owl_hasValue, owl_cyclify_arg2( value, property ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( naut, $list221 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( naut, $list221 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 47757L)
  public static SubLObject owl_cyclify_intersection_property(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return owl_cyclify_arg2( fort, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 47879L)
  public static SubLObject owl_term_type(final SubLObject v_term)
  {
    enforceType( v_term, $sym147$OWLIFIABLE_ARG1_ );
    if( NIL != el_utilities.atomic_sentenceP( v_term ) )
    {
      return rdf_utilities.rdf_name( $str225$Statement );
    }
    return owl_fort_type( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 48098L)
  public static SubLObject owl_fort_type(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject best_isa = best_isa_for_term( fort );
    return ( NIL != best_isa ) ? owl_type_name( best_isa ) : rdf_utilities.rdf_name( $str226$Description );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 48300L)
  public static SubLObject best_isa_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $owl_asents_to_export$.getDynamicValue( thread ) ) )
    {
      return best_isa_for_term_from_asents_to_export( fort );
    }
    if( NIL != fort_types_interface.collection_p( fort ) )
    {
      return $const227$Collection;
    }
    if( NIL != kb_accessors.binary_predicateP( fort ) )
    {
      return $const214$BinaryPredicate;
    }
    return best_isa_for_individual( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 48608L)
  public static SubLObject best_isa_for_individual_internal(final SubLObject individual)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject isas = isa.all_isa( individual, UNPROVIDED, UNPROVIDED );
    SubLObject best_isa = isas.first();
    if( NIL == best_isa )
    {
      return $const110$Thing;
    }
    if( NIL != list_utilities.singletonP( isas ) && NIL != constant_handles.constant_p( best_isa ) )
    {
      return best_isa;
    }
    final SubLObject candidate_isas = list_utilities.remove_if_not( $sym229$CONSTANT_P, isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == candidate_isas )
    {
      return best_isa;
    }
    if( NIL != list_utilities.singletonP( candidate_isas ) )
    {
      return list_utilities.only_one( candidate_isas );
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $owl_export_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      best_isa = genls.min_col( candidate_isas, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return best_isa;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 48608L)
  public static SubLObject best_isa_for_individual(final SubLObject individual)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return best_isa_for_individual_internal( individual );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym228$BEST_ISA_FOR_INDIVIDUAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym228$BEST_ISA_FOR_INDIVIDUAL, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym228$BEST_ISA_FOR_INDIVIDUAL, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, individual, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( best_isa_for_individual_internal( individual ) ) );
      memoization_state.caching_state_put( caching_state, individual, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 49195L)
  public static SubLObject best_isa_for_term_from_asents_to_export(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_asents = dictionary.dictionary_lookup_without_values( $owl_asents_to_export$.getDynamicValue( thread ), fort, NIL );
    final SubLObject isa_lits = ConsesLow.nconc( list_utilities.find_all( $const71$isa, all_asents, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym230$ATOMIC_SENTENCE_PREDICATE ) ), list_utilities.find_all(
        $const113$rdf_type, all_asents, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym230$ATOMIC_SENTENCE_PREDICATE ) ) );
    final SubLObject all_isas = Mapping.mapcar( $sym231$ATOMIC_SENTENCE_ARG2, isa_lits );
    if( NIL != subl_promotions.memberP( $const227$Collection, all_isas, UNPROVIDED, UNPROVIDED ) )
    {
      return $const227$Collection;
    }
    if( NIL != subl_promotions.memberP( $const214$BinaryPredicate, all_isas, UNPROVIDED, UNPROVIDED ) )
    {
      return $const214$BinaryPredicate;
    }
    return genls.min_cols( all_isas, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 49764L)
  public static SubLObject with_owl_pph_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw232$CYC_PPH, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym233$WITH_PPH_MEMOIZATION, ConsesLow.append( body, NIL ) );
    }
    return reader.bq_cons( $sym234$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 50041L)
  public static SubLObject owl_term_string(final SubLObject v_term, SubLObject local_part_onlyP)
  {
    if( local_part_onlyP == UNPROVIDED )
    {
      local_part_onlyP = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return owl_fort_name( v_term, local_part_onlyP, UNPROVIDED );
    }
    return owl_non_fort_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 50263L)
  public static SubLObject owl_fort_name(final SubLObject fort, SubLObject local_part_onlyP, SubLObject default_namespace_or_cyc_onlyP)
  {
    if( local_part_onlyP == UNPROVIDED )
    {
      local_part_onlyP = NIL;
    }
    if( default_namespace_or_cyc_onlyP == UNPROVIDED )
    {
      default_namespace_or_cyc_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    if( fort.eql( $const113$rdf_type ) && NIL == local_part_onlyP && NIL == default_namespace_or_cyc_onlyP )
    {
      return rdf_utilities.rdf_expanded_name( $str235$type );
    }
    final SubLObject asserted_name_in_ontology = ( NIL != $owl_export_ontology$.getDynamicValue( thread ) ) ? asserted_name_in_ontology( fort, $owl_export_ontology$.getDynamicValue( thread ), $owl_export_mt$
        .getDynamicValue( thread ) ) : NIL;
    final SubLObject asserted_default_namespace_name = asserted_name_in_namespace( fort, owl_uris_and_prefixes.owl_export_default_namespace(), $owl_export_mt$.getDynamicValue( thread ) );
    final SubLObject asserted_uri = ( NIL != local_part_onlyP || NIL != asserted_default_namespace_name || NIL != default_namespace_or_cyc_onlyP ) ? NIL : asserted_uri_in_entity_map_namespace( fort );
    if( NIL != asserted_name_in_ontology && NIL == local_part_onlyP && NIL == default_namespace_or_cyc_onlyP )
    {
      return asserted_name_in_ontology;
    }
    if( NIL != asserted_default_namespace_name )
    {
      return ( NIL != local_part_onlyP ) ? asserted_default_namespace_name : Sequences.cconcatenate( owl_uris_and_prefixes.owl_export_default_namespace(), asserted_default_namespace_name );
    }
    if( NIL != asserted_uri )
    {
      return asserted_uri;
    }
    if( NIL == local_part_onlyP )
    {
      return ( NIL != owl_uris_and_prefixes.$owl_export_limited_to_opencyc_contentP$.getDynamicValue( thread ) || NIL != owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP( fort ) ) ? owl_cycl_to_xml
          .owl_opencyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : owl_cycl_to_xml.owl_cyc_uri_for_fort( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) )
    {
      return owl_external_id_string( fort );
    }
    return owl_fort_human_readable_name( fort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 51791L)
  public static SubLObject asserted_name_in_ontology(final SubLObject v_term, final SubLObject ontology, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject uri = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == uri )
      {
        SubLObject csome_list_var = kb_mapping_utilities.pred_value_tuples( v_term, $const114$synonymousExternalConcept, ONE_INTEGER, $list237, UNPROVIDED );
        SubLObject tuple = NIL;
        tuple = csome_list_var.first();
        while ( NIL == uri && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = tuple;
          SubLObject asserted_ontology = NIL;
          SubLObject possible_uri = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list236 );
          asserted_ontology = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list236 );
          possible_uri = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( asserted_ontology.equal( ontology ) )
            {
              if( NIL != web_utilities.uri_p( possible_uri, UNPROVIDED ) )
              {
                uri = possible_uri;
              }
              else
              {
                possible_uri = Sequences.cconcatenate( ontology_uri( ontology ), new SubLObject[] { $str180$_, possible_uri
                } );
              }
              if( NIL != web_utilities.uri_p( possible_uri, UNPROVIDED ) )
              {
                uri = possible_uri;
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list236 );
          }
          csome_list_var = csome_list_var.rest();
          tuple = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 52361L)
  public static SubLObject asserted_name_in_namespace(final SubLObject v_term, final SubLObject namespace, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != Types.stringp( namespace ) : namespace;
    SubLObject uri = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == uri )
      {
        SubLObject csome_list_var = kb_mapping_utilities.pred_values( v_term, $const136$rdfURI, ONE_INTEGER, TWO_INTEGER, $kw102$TRUE );
        SubLObject this_uri = NIL;
        this_uri = csome_list_var.first();
        while ( NIL == uri && NIL != csome_list_var)
        {
          if( this_uri.isString() && NIL != string_utilities.starts_with( this_uri, namespace ) )
          {
            uri = this_uri;
          }
          csome_list_var = csome_list_var.rest();
          this_uri = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != uri ) ? string_utilities.pre_remove( uri, namespace, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 52761L)
  public static SubLObject asserted_uri_in_entity_map_namespace(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    SubLObject uri = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym239$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const6$InferencePSC, thread );
      if( NIL == uri )
      {
        SubLObject csome_list_var = kb_mapping_utilities.pred_values( v_term, $const136$rdfURI, ONE_INTEGER, TWO_INTEGER, $kw102$TRUE );
        SubLObject this_uri = NIL;
        this_uri = csome_list_var.first();
        while ( NIL == uri && NIL != csome_list_var)
        {
          if( this_uri.isString() && NIL != owl_uris_and_prefixes.uri_in_entity_map_namespaceP( this_uri ) )
          {
            uri = this_uri;
          }
          csome_list_var = csome_list_var.rest();
          this_uri = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 53141L)
  public static SubLObject owl_fort_human_readable_name_internal(final SubLObject fort, SubLObject generate_phraseP)
  {
    if( generate_phraseP == UNPROVIDED )
    {
      generate_phraseP = T;
    }
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject name = ( NIL != constant_handles.constant_p( fort ) ) ? sanitize_owl_name( constants_high.constant_name( fort ) ) : owl_nart_name( fort, generate_phraseP );
    if( NIL != nart_handles.nart_p( fort ) && NIL != generate_phraseP && NIL != string_utilities.empty_string_p( name ) )
    {
      name = owl_nart_name( fort, NIL );
    }
    if( NIL == valid_rdf_name_start_char_p( string_utilities.first_char( name ) ) )
    {
      name = Sequences.cconcatenate( $rdf_name_invalid_start_char_prefix$.getGlobalValue(), name );
    }
    return uniquify_and_note_owl_fort_name( name, fort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 53141L)
  public static SubLObject owl_fort_human_readable_name(final SubLObject fort, SubLObject generate_phraseP)
  {
    if( generate_phraseP == UNPROVIDED )
    {
      generate_phraseP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_fort_human_readable_name_internal( fort, generate_phraseP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym241$OWL_FORT_HUMAN_READABLE_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym241$OWL_FORT_HUMAN_READABLE_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym241$OWL_FORT_HUMAN_READABLE_NAME, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( fort, generate_phraseP );
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
        if( fort.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && generate_phraseP.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_fort_human_readable_name_internal( fort, generate_phraseP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fort, generate_phraseP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 53971L)
  public static SubLObject valid_rdf_name_start_char_p(final SubLObject v_char)
  {
    if( NIL != Characters.alpha_char_p( v_char ) )
    {
      return T;
    }
    if( NIL != Sequences.find( v_char, $list242, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 54132L)
  public static SubLObject owl_type_name(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject reserved_name = list_utilities.alist_lookup( $owl_cycl_type_table$.getGlobalValue(), fort, UNPROVIDED, UNPROVIDED );
    return ( NIL != reserved_name ) ? reserved_name : owl_fort_name( fort, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 54411L)
  public static SubLObject owl_fort_cyc_name(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_name( fort );
    }
    return strip_hl_artifacts( owl_str_with_quotes_allowed( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 54855L)
  public static SubLObject owl_non_fort_string(final SubLObject non_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.non_fort_p( non_fort ) : non_fort;
    if( non_fort.isString() )
    {
      return non_fort;
    }
    if( NIL != el_utilities.possibly_naut_p( non_fort ) )
    {
      if( NIL != $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) )
      {
        return owl_external_id_string( non_fort );
      }
      return strip_hl_artifacts( owl_str_with_quotes_allowed( non_fort ) );
    }
    else if( non_fort.isNumber() )
    {
      if( NIL != $owl_use_external_ids_for_namesP$.getDynamicValue( thread ) )
      {
        return kb_utilities.compact_hl_external_id_string( non_fort );
      }
      return owl_str( non_fort );
    }
    else
    {
      if( non_fort.isKeyword() )
      {
        return owl_str( non_fort );
      }
      Errors.warn( $str244$unexpected_term__s, non_fort );
      return owl_str( non_fort );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 55501L)
  public static SubLObject owl_sort_name(final SubLObject v_term)
  {
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      return constants_high.constant_name( v_term );
    }
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return owl_nart_sort_string( v_term );
    }
    return owl_non_fort_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 55794L)
  public static SubLObject owl_preferred_english_for_term(final SubLObject fort)
  {
    final SubLObject phrase = owl_get_generated_phrase( fort );
    final SubLObject uniquifyP = NIL;
    return ( NIL != uniquifyP ) ? uniquify_and_note_owl_fort_name( phrase, fort, $kw245$PREFERRED_NAME ) : phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 56059L)
  public static SubLObject owl_get_pretty_string_canonical(final SubLObject v_term)
  {
    return pph_utilities.get_pretty_string_canonical( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 56272L)
  public static SubLObject owl_get_all_pretty_strings(final SubLObject v_term)
  {
    return pph_utilities.get_all_pretty_strings( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 56465L)
  public static SubLObject owl_other_english_for_term(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $owl_export_from_opencyc_kbP$.getDynamicValue( thread ) )
    {
      return kb_mapping_utilities.pred_values( fort, $const39$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject phrases = NIL;
    SubLObject timed_outP = NIL;
    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
    try
    {
      thread.throwStack.push( tag );
      final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
      try
      {
        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
        SubLObject timer = NIL;
        try
        {
          final SubLObject _prev_bind_0_$38 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( $int246$60, tag );
            final SubLObject _prev_bind_0_$39 = pph_macros.$pph_timeout_time_check_count$.currentBinding( thread );
            final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding( thread );
            final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding( thread );
            try
            {
              pph_macros.$pph_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
              pph_macros.$pph_timeout_time$.bind( pph_macros.pph_compute_timeout_time( $int247$30 ), thread );
              pph_macros.$pph_timeout_reachedP$.bind( pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ), thread );
              pph_macros.$pph_timeout_reachedP$.setDynamicValue( pph_macros.pph_timeout_time_reachedP(), thread );
              if( NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ) )
              {
                phrases = pph_methods_lexicon.all_phrases_for_term( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              timed_outP = pph_macros.pph_timeout_time_reachedP();
            }
            finally
            {
              pph_macros.$pph_timeout_reachedP$.rebind( _prev_bind_3, thread );
              pph_macros.$pph_timeout_time$.rebind( _prev_bind_2, thread );
              pph_macros.$pph_timeout_time_check_count$.rebind( _prev_bind_0_$39, thread );
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$38, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
          }
        }
      }
      finally
      {
        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != timed_outP )
    {
      Errors.warn( $str248$Timed_out_generating_phrases_for_, fort, phrases );
    }
    return phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 56967L)
  public static SubLObject possibly_initialize_owl_export_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.uninitialized_p( $fort_owl_name_table$.getDynamicValue( thread ) ) || NIL != misc_utilities.uninitialized_p( $fort_owl_name_counter$.getDynamicValue( thread ) ) )
    {
      return clear_owl_export_state();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 57165L)
  public static SubLObject clear_owl_export_state()
  {
    $fort_owl_name_table$.setDynamicValue( Hashtables.make_hash_table( $owl_expected_nart_count$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $fort_owl_name_counter$.setDynamicValue( ONE_INTEGER );
    initialize_owl_span_id_counter();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 57376L)
  public static SubLObject owl_cyclify_synonymous_external_concept_asent(final SubLObject asent)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject this_term = NIL;
    SubLObject ontology = NIL;
    SubLObject local_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list249 );
    this_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list249 );
    ontology = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list249 );
    local_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject uri = ( NIL != Sequences.find( Characters.CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? expand_prefixed_owl_reference( ontology, local_name )
          : owl_uri_from_ontology_and_local_name( ontology, local_name );
      final SubLObject inverseP = el_utilities.el_formula_with_operator_p( asent, $const250$synonymousExternalPred_Inverse );
      return ( NIL != web_utilities.uri_p( uri, UNPROVIDED ) ) ? owl_cyclify_synonymous_external_term( this_term, uri, inverseP ) : NIL;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list249 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 57913L)
  public static SubLObject expand_prefixed_owl_reference(final SubLObject ontology, final SubLObject prefixed_name)
  {
    final SubLObject tokens = string_utilities.string_tokenize( prefixed_name, $list251, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject uri = NIL;
    SubLObject expanded = NIL;
    if( NIL != list_utilities.doubletonP( tokens ) )
    {
      SubLObject current;
      final SubLObject datum = current = tokens;
      SubLObject prefix = NIL;
      SubLObject local_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list252 );
      prefix = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list252 );
      local_name = current.first();
      current = current.rest();
      if( NIL == current )
      {
        uri = uri_for_prefix_and_ontology( prefix, ontology );
        if( NIL != uri )
        {
          expanded = Sequences.cconcatenate( uri, local_name );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list252 );
      }
    }
    return expanded;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 58299L)
  public static SubLObject uri_for_prefix_and_ontology_internal(final SubLObject prefix, final SubLObject ontology)
  {
    final SubLObject var = $kw254$X;
    final SubLObject v_properties = $list255;
    SubLObject uri = ask_utilities.query_variable( var, ConsesLow.list( $const256$nameSpacePrefixForSKS, ontology, prefix, var ), $const6$InferencePSC, v_properties ).first();
    if( NIL == uri )
    {
      uri = ask_utilities.query_variable( var, ConsesLow.list( $const257$standardPrefixForURI, prefix, var ), $const6$InferencePSC, v_properties ).first();
    }
    if( NIL != cycl_grammar.cycl_nat_p( uri ) )
    {
      uri = cycl_utilities.nat_arg1( uri, UNPROVIDED );
    }
    if( NIL == web_utilities.uri_p( uri, UNPROVIDED ) )
    {
      Errors.warn( $str258$Couldn_t_find_expansion_for__S_wr, prefix, ontology );
    }
    return ( NIL != web_utilities.uri_p( uri, UNPROVIDED ) ) ? uri : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 58299L)
  public static SubLObject uri_for_prefix_and_ontology(final SubLObject prefix, final SubLObject ontology)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return uri_for_prefix_and_ontology_internal( prefix, ontology );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym253$URI_FOR_PREFIX_AND_ONTOLOGY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym253$URI_FOR_PREFIX_AND_ONTOLOGY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym253$URI_FOR_PREFIX_AND_ONTOLOGY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( prefix, ontology );
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
        if( prefix.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ontology.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( uri_for_prefix_and_ontology_internal( prefix, ontology ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( prefix, ontology ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 58931L)
  public static SubLObject owl_cyclify_synonymous_external_term(final SubLObject this_term, final SubLObject uri, SubLObject inverseP)
  {
    if( inverseP == UNPROVIDED )
    {
      inverseP = NIL;
    }
    if( !uri.isString() )
    {
      return NIL;
    }
    return el_utilities.make_binary_formula( ( NIL != inverseP ) ? owl_cyclify_predicate( $const259$owl_inverseOf ) : owl_cyclify_predicate( $const76$owl_sameAs ), owl_cyclify_arg1( this_term ), owl_cyclify_arg2( uri,
        NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 59370L)
  public static SubLObject owl_uri_from_ontology_and_local_name(final SubLObject ontology, final SubLObject local_name)
  {
    if( NIL == forts.fort_p( ontology ) )
    {
      Errors.warn( $str260$Can_t_get_URI_from_non_FORT_ontol, ontology );
      return NIL;
    }
    if( !local_name.isString() )
    {
      Errors.warn( $str261$Can_t_get_URI_from_non_string_loc, local_name );
      return NIL;
    }
    if( NIL != Sequences.find( Characters.CHAR_colon, local_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return local_name;
    }
    final SubLObject ontology_uri = ontology_uri( ontology );
    if( NIL == ontology_uri )
    {
      maybe_warn_about_ontology_missing_uri( ontology );
      return NIL;
    }
    if( NIL != string_utilities.ends_with_one_of( ontology_uri, $list262 ) )
    {
      return Sequences.cconcatenate( ontology_uri, local_name );
    }
    if( ontology_uri.equal( $str263$http___www_w3_org_2006_03_wn_wn20 ) )
    {
      return Sequences.cconcatenate( ontology_uri, new SubLObject[] { $str63$_, local_name
      } );
    }
    return Sequences.cconcatenate( ontology_uri, new SubLObject[] { $str180$_, local_name
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 60349L)
  public static SubLObject maybe_warn_about_ontology_missing_uri_internal(final SubLObject ontology)
  {
    Errors.warn( $str265$Couldn_t_find_URI_for__S_, ontology );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 60349L)
  public static SubLObject maybe_warn_about_ontology_missing_uri(final SubLObject ontology)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return maybe_warn_about_ontology_missing_uri_internal( ontology );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ontology, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( maybe_warn_about_ontology_missing_uri_internal( ontology ) ) );
      memoization_state.caching_state_put( caching_state, ontology, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 60586L)
  public static SubLObject ontology_uri_internal(final SubLObject ontology)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hard_coded = list_utilities.alist_lookup_without_values( $ontology_uris$.getGlobalValue(), ontology, Symbols.symbol_function( EQUAL ), NIL );
    if( NIL != hard_coded )
    {
      return hard_coded;
    }
    SubLObject uri = backward.removal_ask_variable( $kw268$URI, ConsesLow.listS( $const269$salientURI, ontology, $list270 ), $const6$InferencePSC, UNPROVIDED, UNPROVIDED ).first();
    if( NIL != cycl_grammar.cycl_nat_p( uri ) )
    {
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( uri, $list271 );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject string = uri = list_utilities.alist_lookup_without_values( v_bindings, $sym272$STRING, UNPROVIDED, UNPROVIDED );
      }
    }
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 60586L)
  public static SubLObject ontology_uri(final SubLObject ontology)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return ontology_uri_internal( ontology );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym267$ONTOLOGY_URI, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym267$ONTOLOGY_URI, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym267$ONTOLOGY_URI, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ontology, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( ontology_uri_internal( ontology ) ) );
      memoization_state.caching_state_put( caching_state, ontology, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 61095L)
  public static SubLObject owl_nart_name_internal(final SubLObject nart, final SubLObject generate_phrase_for_nartsP)
  {
    SubLObject xml_name = ( NIL != generate_phrase_for_nartsP ) ? sanitize_owl_name( owl_get_generated_phrase( nart ) ) : nsanitize_owl_name( string_utilities.str( nart ) );
    if( NIL == fort_types_interface.predicate_p( nart ) )
    {
      xml_name = string_utilities.upcase_leading( xml_name );
    }
    return uniquify_and_note_owl_fort_name( xml_name, nart, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 61095L)
  public static SubLObject owl_nart_name(final SubLObject nart, final SubLObject generate_phrase_for_nartsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_nart_name_internal( nart, generate_phrase_for_nartsP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym273$OWL_NART_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym273$OWL_NART_NAME, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym273$OWL_NART_NAME, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( nart, generate_phrase_for_nartsP );
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
        if( nart.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && generate_phrase_for_nartsP.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_nart_name_internal( nart, generate_phrase_for_nartsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( nart, generate_phrase_for_nartsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 61503L)
  public static SubLObject uniquify_and_note_owl_fort_name(final SubLObject name_base, final SubLObject fort, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw61$OWL_NAME;
    }
    possibly_initialize_owl_export_state();
    SubLObject uniquifier_number = NIL;
    SubLObject new_name = name_base;
    final SubLObject connector = type.eql( $kw245$PREFERRED_NAME ) ? $str274$_ : $str240$_;
    SubLObject clash = find_fort_by_owl_name( new_name, type );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $owl_name_uniquifier_lock$.getGlobalValue() );
      while ( NIL != clash && !clash.eql( fort ))
      {
        uniquifier_number = uniquifier_number_for_type( uniquifier_number, type );
        new_name = Sequences.cconcatenate( name_base, new SubLObject[] { connector, string_utilities.str( uniquifier_number )
        } );
        clash = find_fort_by_owl_name( new_name, type );
      }
      note_fort_owl_name( fort, new_name, type );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $owl_name_uniquifier_lock$.getGlobalValue() );
      }
    }
    return new_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 62261L)
  public static SubLObject uniquifier_number_for_type(final SubLObject current_uniquifier_number, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( type.eql( $kw245$PREFERRED_NAME ) )
    {
      return current_uniquifier_number.isInteger() ? number_utilities.f_1X( current_uniquifier_number ) : ONE_INTEGER;
    }
    final SubLObject uniquifier_number = $fort_owl_name_counter$.getDynamicValue( thread );
    $fort_owl_name_counter$.setDynamicValue( Numbers.add( $fort_owl_name_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return uniquifier_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 62622L)
  public static SubLObject owl_nart_sort_string_internal(final SubLObject nart)
  {
    return string_utilities.char_subst( Characters.CHAR_exclamation, Characters.CHAR_less, owl_str( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 62622L)
  public static SubLObject owl_nart_sort_string(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_nart_sort_string_internal( nart );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym275$OWL_NART_SORT_STRING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym275$OWL_NART_SORT_STRING, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym275$OWL_NART_SORT_STRING, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, nart, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_nart_sort_string_internal( nart ) ) );
      memoization_state.caching_state_put( caching_state, nart, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 62846L)
  public static SubLObject owl_str(final SubLObject v_object)
  {
    return owl_str_int( v_object, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 62914L)
  public static SubLObject owl_str_with_quotes_allowed(final SubLObject v_object)
  {
    return owl_str_int( v_object, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63000L)
  public static SubLObject owl_str_int(final SubLObject v_object, final SubLObject quotes_allowedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    final SubLObject _prev_bind_4 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      reader.$read_default_float_format$.bind( $sym276$DOUBLE_FLOAT, thread );
      if( NIL != quotes_allowedP )
      {
        result = format_nil.format_nil_s( v_object );
      }
      else
      {
        result = string_utilities.str( v_object );
      }
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_4, thread );
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63282L)
  public static SubLObject strip_hl_artifacts(final SubLObject string)
  {
    return strip_nart_brackets( strip_hash_dollars( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63455L)
  public static SubLObject strip_nart_brackets(SubLObject string)
  {
    string = string_utilities.string_subst( $str277$_, $str278$___, string, UNPROVIDED );
    string = string_utilities.string_subst( $str279$_, $str280$__, string, UNPROVIDED );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63613L)
  public static SubLObject strip_hash_dollars(final SubLObject string)
  {
    return string_utilities.string_subst( $str62$, $str281$__, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63744L)
  public static SubLObject sanitize_owl_name(final SubLObject xml_string)
  {
    return nsanitize_owl_name( string_utilities.copy_string( xml_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 63847L)
  public static SubLObject nsanitize_owl_name(SubLObject xml_string)
  {
    if( NIL != Sequences.search( $str282$_u, xml_string, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject unicode = unicode_strings.display_to_utf8_string( xml_string );
      xml_string = ( ( NIL != unicode ) ? unicode : xml_string );
    }
    if( NIL != string_utilities.substringP( $str283$__, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      xml_string = strip_html_tags( xml_string );
    }
    xml_string = Sequences.delete_if( $sym284$INVALID_OWL_NAME_CHAR_TO_REMOVE_P, xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    xml_string = string_utilities.nchar_subst_if_not( Characters.CHAR_underbar, $sym285$VALID_OWL_NAME_CHAR_P, xml_string );
    xml_string = strip_hash_dollars( xml_string );
    xml_string = string_utilities.string_subst( $str240$_, $str278$___, xml_string, UNPROVIDED );
    xml_string = string_utilities.string_subst( $str240$_, $str280$__, xml_string, UNPROVIDED );
    if( NIL == xml_utilities.valid_xml_name_p( xml_string ) )
    {
      xml_string = xml_utilities.remove_invalid_xml_name_chars( xml_string );
    }
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 64717L)
  public static SubLObject invalid_owl_name_char_to_remove_p(final SubLObject obj)
  {
    return Sequences.find( obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 65141L)
  public static SubLObject valid_owl_name_char_p(final SubLObject obj)
  {
    return makeBoolean( NIL != xml_utilities.valid_xml_char_p( obj ) && NIL == Sequences.find( obj, $invalid_owl_name_chars_underscore$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        && NIL == Sequences.find( obj, $invalid_owl_name_chars_remove$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 65341L)
  public static SubLObject strip_html_tags(final SubLObject string)
  {
    Errors.warn( $str288$HTML_tags_not_stripped_from__s, string );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 65936L)
  public static SubLObject owl_external_id_string_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = kb_utilities.compact_hl_external_id_string( v_term );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !id.isString() || NIL == list_utilities.lengthGE( id, $int290$26, UNPROVIDED ) ) )
    {
      Errors.error( $str291$ID__S_for__S_is_suspiciously_shor, id, v_term, Sequences.length( id ) );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 65936L)
  public static SubLObject owl_external_id_string(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_external_id_string_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym289$OWL_EXTERNAL_ID_STRING, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym289$OWL_EXTERNAL_ID_STRING, ONE_INTEGER, $int292$256, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym289$OWL_EXTERNAL_ID_STRING, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_external_id_string_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66293L)
  public static SubLObject owl_get_plural_generated_phrase(final SubLObject v_term)
  {
    return owl_generate_phrase_int( v_term, $list293 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66461L)
  public static SubLObject owl_get_singular_generated_phrase(final SubLObject v_term)
  {
    return owl_generate_phrase_int( v_term, $list294 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66575L)
  public static SubLObject owl_get_generated_phrase(final SubLObject v_term)
  {
    return owl_generate_phrase_int( v_term, $kw295$DEFAULT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66772L)
  public static SubLObject owl_generate_phrase_int_internal(final SubLObject v_term, final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = owl_pretty_string( v_term );
    if( NIL == string_utilities.non_empty_string_p( result ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw298$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym299$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            assert NIL != pph_utilities.pph_precision_p( T ) : T;
            final SubLObject _prev_bind_0_$41 = pph_vars.$paraphrase_precision$.currentBinding( thread );
            final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding( thread );
            final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding( thread );
            try
            {
              pph_vars.$paraphrase_precision$.bind( T, thread );
              pph_vars.$pph_ambiguous_strings$.bind( ( NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread ) ) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread )
                  : dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
              pph_vars.$pph_language_mt$.bind( $owl_human_readable_name_generation_mt$.getGlobalValue(), thread );
              result = cycl_string.cycl_string_to_utf8_string( pph_main.generate_text_wXsentential_force( v_term, $kw301$NONE, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
            }
            finally
            {
              pph_vars.$pph_language_mt$.rebind( _prev_bind_3, thread );
              pph_vars.$pph_ambiguous_strings$.rebind( _prev_bind_2, thread );
              pph_vars.$paraphrase_precision$.rebind( _prev_bind_0_$41, thread );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw298$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    if( NIL == result )
    {
      final SubLObject crappy_paraphrase = result = owl_generate_phrase_fallback( v_term );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 66772L)
  public static SubLObject owl_generate_phrase_int(final SubLObject v_term, final SubLObject nl_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_generate_phrase_int_internal( v_term, nl_preds );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym297$OWL_GENERATE_PHRASE_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym297$OWL_GENERATE_PHRASE_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym297$OWL_GENERATE_PHRASE_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, nl_preds );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && nl_preds.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_generate_phrase_int_internal( v_term, nl_preds ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, nl_preds ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 67447L)
  public static SubLObject owl_generate_phrase_fallback(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $owl_profilingP$.getDynamicValue( thread ) )
    {
      return $str302$fake_pretty_string;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return owl_fort_human_readable_name( v_term, NIL );
    }
    return owl_non_fort_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 67677L)
  public static SubLObject owl_pretty_string(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $owl_use_pretty_stringsP$.getDynamicValue( thread ) )
    {
      SubLObject string = kb_mapping_utilities.fpred_value_in_any_mt( fort, $const303$prettyString_Canonical, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == string )
      {
        string = kb_mapping_utilities.fpred_value_in_any_mt( fort, $const39$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return string;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 68283L)
  public static SubLObject initialize_umbel_id_map()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dictionary.dictionary_p( $umbel_id_map$.getGlobalValue() ) )
    {
      dictionary.clear_dictionary( $umbel_id_map$.getGlobalValue() );
    }
    else
    {
      $umbel_id_map$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    }
    SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject file = NIL;
      SubLObject base_uri = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list305 );
      file = current.first();
      current = ( base_uri = current.rest() );
      if( NIL != file_utilities.file_existsP( file ) )
      {
        final SubLObject file_var = file;
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( file_var, $kw306$INPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str66$Unable_to_open__S, file_var );
          }
          final SubLObject stream_var = stream;
          if( stream_var.isStream() )
          {
            final SubLObject stream_var_$42 = stream_var;
            SubLObject line_number_var = NIL;
            SubLObject line = NIL;
            line_number_var = ZERO_INTEGER;
            for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$42 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$42 ) )
            {
              final SubLObject line_$43 = string_utilities.string_tokenize( line, ConsesLow.list( Characters.CHAR_comma ), ConsesLow.list( ConsesLow.list( $str307$_, $str307$_ ) ), NIL, NIL, ConsesLow.list(
                  Characters.CHAR_backslash ), UNPROVIDED );
              SubLObject current_$45;
              final SubLObject datum_$44 = current_$45 = line_$43;
              SubLObject umbel_id = NIL;
              SubLObject cyc_id = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$45, datum_$44, $list308 );
              umbel_id = current_$45.first();
              current_$45 = current_$45.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$45, datum_$44, $list308 );
              cyc_id = current_$45.first();
              current_$45 = current_$45.rest();
              if( NIL == current_$45 )
              {
                final SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string( cyc_id );
                if( NIL != forts.valid_fortP( cyc_term ) )
                {
                  dictionary.dictionary_enter( $umbel_id_map$.getGlobalValue(), cyc_term, Sequences.cconcatenate( base_uri, umbel_id ) );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$44, $list308 );
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
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return $umbel_id_map$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 68843L)
  public static SubLObject slurp_umbel_names(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $umbel_data_files$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject file = NIL;
      SubLObject base_uri = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list305 );
      file = current.first();
      current = ( base_uri = current.rest() );
      if( NIL != file_utilities.file_existsP( file ) )
      {
        final SubLObject subject_conceptsP = Sequences.search( $str309$sc, base_uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject pred = ( NIL != subject_conceptsP ) ? $const310$umbelSubjectConceptName : $const311$umbelAbstractConceptName;
        final SubLObject mt = narts_high.find_nart( ConsesLow.list( $const312$MappingMtFn, ConsesLow.list( $const313$OWLOntologyFn, ( NIL != subject_conceptsP ) ? $const314$UMBELSubjectConceptNamespace
            : $const315$UMBELAbstractConceptNamespace ) ) );
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
        try
        {
          api_control_vars.$the_cyclist$.bind( NIL, thread );
          operation_communication.set_the_cyclist( cyclist );
          final SubLObject file_var = file;
          SubLObject stream = NIL;
          try
          {
            final SubLObject _prev_bind_0_$46 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream = compatibility.open_text( file_var, $kw306$INPUT );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$46, thread );
            }
            if( !stream.isStream() )
            {
              Errors.error( $str66$Unable_to_open__S, file_var );
            }
            final SubLObject stream_var = stream;
            if( stream_var.isStream() )
            {
              final SubLObject stream_var_$47 = stream_var;
              SubLObject line_number_var = NIL;
              SubLObject line = NIL;
              line_number_var = ZERO_INTEGER;
              for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$47 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$47 ) )
              {
                final SubLObject line_$48 = string_utilities.string_tokenize( line, ConsesLow.list( Characters.CHAR_comma ), ConsesLow.list( ConsesLow.list( $str307$_, $str307$_ ) ), NIL, NIL, ConsesLow.list(
                    Characters.CHAR_backslash ), UNPROVIDED );
                SubLObject current_$50;
                final SubLObject datum_$49 = current_$50 = line_$48;
                SubLObject umbel_id = NIL;
                SubLObject cyc_id = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$50, datum_$49, $list308 );
                umbel_id = current_$50.first();
                current_$50 = current_$50.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$50, datum_$49, $list308 );
                cyc_id = current_$50.first();
                current_$50 = current_$50.rest();
                if( NIL == current_$50 )
                {
                  final SubLObject cyc_term = kb_utilities.find_object_by_compact_hl_external_id_string( cyc_id );
                  SubLObject name = umbel_id;
                  if( NIL != unicode_strings.non_ascii_string_p( name ) )
                  {
                    name = unicode_nauts.non_ascii_string_to_unicode( name );
                  }
                  if( NIL != forts.valid_fortP( cyc_term ) )
                  {
                    ke.ke_assert( el_utilities.make_binary_formula( pred, cyc_term, name ), mt, UNPROVIDED, UNPROVIDED );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$49, $list308 );
                }
                line_number_var = number_utilities.f_1X( line_number_var );
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
            }
          }
        }
        finally
        {
          api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 69743L)
  public static SubLObject umbel_uri_for_fort(final SubLObject fort)
  {
    if( NIL == misc_utilities.initialized_p( $umbel_id_map$.getGlobalValue() ) )
    {
      initialize_umbel_id_map();
    }
    return dictionary.dictionary_lookup_without_values( $umbel_id_map$.getGlobalValue(), fort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/lisp", position = 69925L)
  public static SubLObject umbel_uri_sentence_for_fort(final SubLObject fort)
  {
    final SubLObject uri = umbel_uri_for_fort( fort );
    return ( NIL != uri ) ? ConsesLow.list( $const136$rdfURI, fort, uri ) : NIL;
  }

  public static SubLObject declare_owlification_file()
  {
    SubLFiles.declareMacro( me, "with_owl_export_asents", "WITH-OWL-EXPORT-ASENTS" );
    SubLFiles.declareFunction( me, "add_owl_asent_forts_to_export_terms", "ADD-OWL-ASENT-FORTS-TO-EXPORT-TERMS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_opencyc_owl_export_parameters", "WITH-OPENCYC-OWL-EXPORT-PARAMETERS" );
    SubLFiles.declareMacro( me, "with_human_readable_opencyc_owl_export_parameters", "WITH-HUMAN-READABLE-OPENCYC-OWL-EXPORT-PARAMETERS" );
    SubLFiles.declareMacro( me, "with_human_readable_owl_export_parameters", "WITH-HUMAN-READABLE-OWL-EXPORT-PARAMETERS" );
    SubLFiles.declareFunction( me, "owl_export_parameter_snapshot", "OWL-EXPORT-PARAMETER-SNAPSHOT", 0, 0, false );
    SubLFiles.declareMacro( me, "do_owl_export_terms", "DO-OWL-EXPORT-TERMS" );
    SubLFiles.declareFunction( me, "clear_owl_cycl_predicate_table", "CLEAR-OWL-CYCL-PREDICATE-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl_cycl_predicate_table", "REMOVE-OWL-CYCL-PREDICATE-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "owl_cycl_predicate_table_internal", "OWL-CYCL-PREDICATE-TABLE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cycl_predicate_table", "OWL-CYCL-PREDICATE-TABLE", 0, 1, false );
    SubLFiles.declareMacro( me, "with_new_fort_owl_name_table", "WITH-NEW-FORT-OWL-NAME-TABLE" );
    SubLFiles.declareFunction( me, "note_fort_owl_name", "NOTE-FORT-OWL-NAME", 2, 1, false );
    SubLFiles.declareFunction( me, "write_fort_owl_name_table", "WRITE-FORT-OWL-NAME-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_fort_by_owl_name", "FIND-FORT-BY-OWL-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_cyclify_term", "OWL-CYCLIFY-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_owl_export_term_iterator", "NEW-OWL-EXPORT-TERM-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_and_sort_owl_export_terms", "FILTER-AND-SORT-OWL-EXPORT-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_fort_to_owl_export_set", "ADD-FORT-TO-OWL-EXPORT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_export_nart_export_form", "OWL-EXPORT-NART-EXPORT-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_canonicalize_nart_internal", "OWL-EXPORT-CANONICALIZE-NART-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_export_canonicalize_nart", "OWL-EXPORT-CANONICALIZE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_invalid_for_owl_exportP", "NART-INVALID-FOR-OWL-EXPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_subsumed_owl_asents", "DELETE-SUBSUMED-OWL-ASENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "subsumed_owl_asentP", "SUBSUMED-OWL-ASENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_collection_fort_for_owl_exportP", "VALID-COLLECTION-FORT-FOR-OWL-EXPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nonexportable_term_warning_internal", "NONEXPORTABLE-TERM-WARNING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "nonexportable_term_warning", "NONEXPORTABLE-TERM-WARNING", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_collection_fort_for_owl_exportP_internal", "VALID-COLLECTION-FORT-FOR-OWL-EXPORT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_sort_forts", "OWL-SORT-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_fort_L", "OWL-FORT-<", 2, 0, false );
    SubLFiles.declareFunction( me, "all_gaf_arg1_owlifiable_asents_sorted", "ALL-GAF-ARG1-OWLIFIABLE-ASENTS-SORTED", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_whitelist_predicateP", "OWL-WHITELIST-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_blacklist_sentenceP", "OWL-BLACKLIST-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_blacklist_predicateP", "OWL-BLACKLIST-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_adjust_isa_and_genls_asents", "OWL-ADJUST-ISA-AND-GENLS-ASENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "isa_asents_for_fort", "ISA-ASENTS-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "genls_asents_for_fort", "GENLS-ASENTS-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "index_owl_asents_by_arg1", "INDEX-OWL-ASENTS-BY-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "synonymous_external_concept_asents", "SYNONYMOUS-EXTERNAL-CONCEPT-ASENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_synonyms_via_synonymous_external_concept", "GATHER-SYNONYMS-VIA-SYNONYMOUS-EXTERNAL-CONCEPT", 1, 1, false );
    SubLFiles.declareFunction( me, "sort_owl_asents", "SORT-OWL-ASENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_remove_singleton_predicates", "OWL-REMOVE-SINGLETON-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "comment_asentP", "COMMENT-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owlifiable_sentenceP", "OWLIFIABLE-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "owlifiable_arg0P", "OWLIFIABLE-ARG0?", 1, 0, false );
    SubLFiles.declareFunction( me, "owlifiable_arg1P", "OWLIFIABLE-ARG1?", 1, 0, false );
    SubLFiles.declareFunction( me, "owlifiable_arg2P", "OWLIFIABLE-ARG2?", 2, 0, false );
    SubLFiles.declareFunction( me, "owlifiable_date_p", "OWLIFIABLE-DATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_extra_arg1_asents_for_term", "OWL-EXTRA-ARG1-ASENTS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_functional_propertyP", "OWL-FUNCTIONAL-PROPERTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_inverse_functional_propertyP", "OWL-INVERSE-FUNCTIONAL-PROPERTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_remove_type_isa", "OWL-REMOVE-TYPE-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_redundant_type_isa_asentP", "OWL-REDUNDANT-TYPE-ISA-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_isa_litP", "OWL-ISA-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_genls_litP", "OWL-GENLS-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_remove_uvmt_anect_isa", "OWL-REMOVE-UVMT-ANECT-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_individual_asentP", "ISA-INDIVIDUAL-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_asent_L", "OWL-ASENT-<", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_binary_asent_L", "OWL-BINARY-ASENT-<", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_binary_asent", "OWL-CYCLIFY-BINARY-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_meta_asent", "OWL-CYCLIFY-META-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_reification_asents", "OWL-REIFICATION-ASENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_reification_asent", "OWL-REIFICATION-ASENT", 3, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_predicate", "OWL-CYCLIFY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_arg1", "OWL-CYCLIFY-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_arg2", "OWL-CYCLIFY-ARG2", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_date_string", "OWL-DATE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_arg2_datatype", "OWL-ARG2-DATATYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_day_string", "OWL-DAY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_month_string", "OWL-MONTH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_year_string", "OWL-YEAR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_century_string", "OWL-CENTURY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_date_instant_string", "OWL-DATE-INSTANT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_expand_owl_entity_reference", "MAYBE-EXPAND-OWL-ENTITY-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "uri_fort_p", "URI-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "stringify_uri_fort", "STRINGIFY-URI-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "stringify_uri_fort_internal", "STRINGIFY-URI-FORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_string_with_constant_references", "OWL-CYCLIFY-STRING-WITH-CONSTANT-REFERENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_owl_span_id_counter", "INITIALIZE-OWL-SPAN-ID-COUNTER", 0, 0, false );
    SubLFiles.declareFunction( me, "next_owl_span_id", "NEXT-OWL-SPAN-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "html_link_to_owl_uri_with_popups", "HTML-LINK-TO-OWL-URI-WITH-POPUPS", 1, 1, false );
    SubLFiles.declareFunction( me, "html_link_to_owl_uri", "HTML-LINK-TO-OWL-URI", 1, 1, false );
    SubLFiles.declareFunction( me, "html_link_to_owl_opencyc_uri", "HTML-LINK-TO-OWL-OPENCYC-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "html_output_owl_fort_comment", "HTML-OUTPUT-OWL-FORT-COMMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_subcollection_nart_p", "OWL-SUBCOLLECTION-NART-P", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_subcollection_asent", "OWL-SUBCOLLECTION-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "inverse_binary_predicate_sentence", "INVERSE-BINARY-PREDICATE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_inverse_binary_predicate_internal", "FIND-OR-CREATE-INVERSE-BINARY-PREDICATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_inverse_binary_predicate", "FIND-OR-CREATE-INVERSE-BINARY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_inverse_binary_predicate", "FIND-INVERSE-BINARY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_intersection", "OWL-CYCLIFY-INTERSECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_intersection_property", "OWL-CYCLIFY-INTERSECTION-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_term_type", "OWL-TERM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_fort_type", "OWL-FORT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "best_isa_for_term", "BEST-ISA-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "best_isa_for_individual_internal", "BEST-ISA-FOR-INDIVIDUAL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "best_isa_for_individual", "BEST-ISA-FOR-INDIVIDUAL", 1, 0, false );
    SubLFiles.declareFunction( me, "best_isa_for_term_from_asents_to_export", "BEST-ISA-FOR-TERM-FROM-ASENTS-TO-EXPORT", 1, 0, false );
    SubLFiles.declareMacro( me, "with_owl_pph_memoization", "WITH-OWL-PPH-MEMOIZATION" );
    SubLFiles.declareFunction( me, "owl_term_string", "OWL-TERM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_fort_name", "OWL-FORT-NAME", 1, 2, false );
    SubLFiles.declareFunction( me, "asserted_name_in_ontology", "ASSERTED-NAME-IN-ONTOLOGY", 3, 0, false );
    SubLFiles.declareFunction( me, "asserted_name_in_namespace", "ASSERTED-NAME-IN-NAMESPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "asserted_uri_in_entity_map_namespace", "ASSERTED-URI-IN-ENTITY-MAP-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_fort_human_readable_name_internal", "OWL-FORT-HUMAN-READABLE-NAME-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "owl_fort_human_readable_name", "OWL-FORT-HUMAN-READABLE-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_rdf_name_start_char_p", "VALID-RDF-NAME-START-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_type_name", "OWL-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_fort_cyc_name", "OWL-FORT-CYC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_non_fort_string", "OWL-NON-FORT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_sort_name", "OWL-SORT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_preferred_english_for_term", "OWL-PREFERRED-ENGLISH-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_get_pretty_string_canonical", "OWL-GET-PRETTY-STRING-CANONICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_get_all_pretty_strings", "OWL-GET-ALL-PRETTY-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_other_english_for_term", "OWL-OTHER-ENGLISH-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_owl_export_state", "POSSIBLY-INITIALIZE-OWL-EXPORT-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_owl_export_state", "CLEAR-OWL-EXPORT-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_synonymous_external_concept_asent", "OWL-CYCLIFY-SYNONYMOUS-EXTERNAL-CONCEPT-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_prefixed_owl_reference", "EXPAND-PREFIXED-OWL-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "uri_for_prefix_and_ontology_internal", "URI-FOR-PREFIX-AND-ONTOLOGY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "uri_for_prefix_and_ontology", "URI-FOR-PREFIX-AND-ONTOLOGY", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_cyclify_synonymous_external_term", "OWL-CYCLIFY-SYNONYMOUS-EXTERNAL-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "owl_uri_from_ontology_and_local_name", "OWL-URI-FROM-ONTOLOGY-AND-LOCAL-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_warn_about_ontology_missing_uri_internal", "MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_warn_about_ontology_missing_uri", "MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "ontology_uri_internal", "ONTOLOGY-URI-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ontology_uri", "ONTOLOGY-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_nart_name_internal", "OWL-NART-NAME-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_nart_name", "OWL-NART-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "uniquify_and_note_owl_fort_name", "UNIQUIFY-AND-NOTE-OWL-FORT-NAME", 2, 1, false );
    SubLFiles.declareFunction( me, "uniquifier_number_for_type", "UNIQUIFIER-NUMBER-FOR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_nart_sort_string_internal", "OWL-NART-SORT-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_nart_sort_string", "OWL-NART-SORT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_str", "OWL-STR", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_str_with_quotes_allowed", "OWL-STR-WITH-QUOTES-ALLOWED", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_str_int", "OWL-STR-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "strip_hl_artifacts", "STRIP-HL-ARTIFACTS", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_nart_brackets", "STRIP-NART-BRACKETS", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_hash_dollars", "STRIP-HASH-DOLLARS", 1, 0, false );
    SubLFiles.declareFunction( me, "sanitize_owl_name", "SANITIZE-OWL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "nsanitize_owl_name", "NSANITIZE-OWL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_owl_name_char_to_remove_p", "INVALID-OWL-NAME-CHAR-TO-REMOVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_owl_name_char_p", "VALID-OWL-NAME-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_html_tags", "STRIP-HTML-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_external_id_string_internal", "OWL-EXTERNAL-ID-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_external_id_string", "OWL-EXTERNAL-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_get_plural_generated_phrase", "OWL-GET-PLURAL-GENERATED-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_get_singular_generated_phrase", "OWL-GET-SINGULAR-GENERATED-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_get_generated_phrase", "OWL-GET-GENERATED-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_generate_phrase_int_internal", "OWL-GENERATE-PHRASE-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_generate_phrase_int", "OWL-GENERATE-PHRASE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_generate_phrase_fallback", "OWL-GENERATE-PHRASE-FALLBACK", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_pretty_string", "OWL-PRETTY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_umbel_id_map", "INITIALIZE-UMBEL-ID-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "slurp_umbel_names", "SLURP-UMBEL-NAMES", 0, 1, false );
    SubLFiles.declareFunction( me, "umbel_uri_for_fort", "UMBEL-URI-FOR-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "umbel_uri_sentence_for_fort", "UMBEL-URI-SENTENCE-FOR-FORT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_owlification_file()
  {
    $owl_use_external_ids_for_namesP$ = SubLFiles.defparameter( "*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*", T );
    $owl_prefer_ontology_urisP$ = SubLFiles.defparameter( "*OWL-PREFER-ONTOLOGY-URIS?*", NIL );
    $owl_use_pretty_stringsP$ = SubLFiles.defparameter( "*OWL-USE-PRETTY-STRINGS?*", T );
    $owl_use_entity_referencesP$ = SubLFiles.defparameter( "*OWL-USE-ENTITY-REFERENCES?*", T );
    $owl_asents_to_export$ = SubLFiles.defparameter( "*OWL-ASENTS-TO-EXPORT*", misc_utilities.uninitialized() );
    $owl_export_terms$ = SubLFiles.defparameter( "*OWL-EXPORT-TERMS*", NIL );
    $owl_remove_isa_individual_asentsP$ = SubLFiles.defparameter( "*OWL-REMOVE-ISA-INDIVIDUAL-ASENTS?*", NIL );
    $owl_profilingP$ = SubLFiles.defparameter( "*OWL-PROFILING?*", NIL );
    $owl_export_from_opencyc_kbP$ = SubLFiles.defparameter( "*OWL-EXPORT-FROM-OPENCYC-KB?*", NIL );
    $owl_export_cap_per_category$ = SubLFiles.defparameter( "*OWL-EXPORT-CAP-PER-CATEGORY*", NIL );
    $owl_export_mt$ = SubLFiles.defparameter( "*OWL-EXPORT-MT*", $const6$InferencePSC );
    $owl_export_ontology$ = SubLFiles.defparameter( "*OWL-EXPORT-ONTOLOGY*", NIL );
    $owl_export_parameters$ = SubLFiles.deflexical( "*OWL-EXPORT-PARAMETERS*", $list18 );
    $owl_expected_nart_count$ = SubLFiles.deflexical( "*OWL-EXPECTED-NART-COUNT*", $int32$14822 );
    $owl_singleton_predicate_list$ = SubLFiles.deflexical( "*OWL-SINGLETON-PREDICATE-LIST*", $list33 );
    $owl_cycl_predicate_table_caching_state$ = SubLFiles.deflexical( "*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*", NIL );
    $assertion_arg0s_excluded_from_owl_export$ = SubLFiles.defparameter( "*ASSERTION-ARG0S-EXCLUDED-FROM-OWL-EXPORT*", $list48 );
    $owl_cycl_predicates_to_use_as_is$ = SubLFiles.deflexical( "*OWL-CYCL-PREDICATES-TO-USE-AS-IS*", $list49 );
    $owl_cycl_type_table$ = SubLFiles.deflexical( "*OWL-CYCL-TYPE-TABLE*", $list50 );
    $owl_cycl_property_table$ = SubLFiles.deflexical( "*OWL-CYCL-PROPERTY-TABLE*", $list51 );
    $owl_cycl_collection_table$ = SubLFiles.deflexical( "*OWL-CYCL-COLLECTION-TABLE*", $list52 );
    $owl_cycl_xsd_schema_table$ = SubLFiles.deflexical( "*OWL-CYCL-XSD-SCHEMA-TABLE*", $list53 );
    $owl_fort_arg2_predicates$ = SubLFiles.deflexical( "*OWL-FORT-ARG2-PREDICATES*", $list54 );
    $owl_permissive_arg2_predicates$ = SubLFiles.deflexical( "*OWL-PERMISSIVE-ARG2-PREDICATES*", $list55 );
    $fort_owl_name_table$ = SubLFiles.defparameter( "*FORT-OWL-NAME-TABLE*", misc_utilities.uninitialized() );
    $owl_name_uniquifier_lock$ = SubLFiles.deflexical( "*OWL-NAME-UNIQUIFIER-LOCK*", Locks.make_lock( $str69$OWL_Name_Uniquifier ) );
    $fort_owl_name_counter$ = SubLFiles.defvar( "*FORT-OWL-NAME-COUNTER*", misc_utilities.uninitialized() );
    $owl_transitive_via_genls_arg2_preds_to_filter$ = SubLFiles.deflexical( "*OWL-TRANSITIVE-VIA-GENLS-ARG2-PREDS-TO-FILTER*", $list90 );
    $owl_blacklist_sentence_patterns$ = SubLFiles.deflexical( "*OWL-BLACKLIST-SENTENCE-PATTERNS*", $list106 );
    $asent_to_owl_cyclify$ = SubLFiles.defparameter( "*ASENT-TO-OWL-CYCLIFY*", misc_utilities.uninitialized() );
    $owl_include_cyc_constant_popupsP$ = SubLFiles.defparameter( "*OWL-INCLUDE-CYC-CONSTANT-POPUPS?*", NIL );
    $owl_link_constant_references_for_these_preds$ = SubLFiles.deflexical( "*OWL-LINK-CONSTANT-REFERENCES-FOR-THESE-PREDS*", $list186 );
    $owl_span_id_counter$ = SubLFiles.deflexical( "*OWL-SPAN-ID-COUNTER*", integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $inverse_binary_predicate_var$ = SubLFiles.deflexical( "*INVERSE-BINARY-PREDICATE-VAR*", $sym210$_PRED );
    $rdf_name_invalid_start_char_prefix$ = SubLFiles.deflexical( "*RDF-NAME-INVALID-START-CHAR-PREFIX*", $str240$_ );
    $ontology_uris$ = SubLFiles.deflexical( "*ONTOLOGY-URIS*", $list266 );
    $invalid_owl_name_chars_remove$ = SubLFiles.deflexical( "*INVALID-OWL-NAME-CHARS-REMOVE*", $list286 );
    $invalid_owl_name_chars_underscore$ = SubLFiles.deflexical( "*INVALID-OWL-NAME-CHARS-UNDERSCORE*", $list287 );
    $owl_human_readable_name_generation_mt$ = SubLFiles.deflexical( "*OWL-HUMAN-READABLE-NAME-GENERATION-MT*", $const296$OWLHumanReadableNameGenerationMt );
    $umbel_id_map$ = SubLFiles.deflexical( "*UMBEL-ID-MAP*", misc_utilities.uninitialized() );
    $umbel_data_files$ = SubLFiles.deflexical( "*UMBEL-DATA-FILES*", $list304 );
    return NIL;
  }

  public static SubLObject setup_owlification_file()
  {
    memoization_state.note_globally_cached_function( $sym34$OWL_CYCL_PREDICATE_TABLE );
    memoization_state.note_memoized_function( $sym86$OWL_EXPORT_CANONICALIZE_NART );
    memoization_state.note_memoized_function( $sym91$NONEXPORTABLE_TERM_WARNING );
    utilities_macros.note_funcall_helper_function( $sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_ );
    utilities_macros.note_funcall_helper_function( $sym134$ISA_INDIVIDUAL_ASENT_ );
    utilities_macros.note_funcall_helper_function( $sym115$OWL_ASENT__ );
    utilities_macros.note_funcall_helper_function( $sym188$HTML_LINK_TO_OWL_URI );
    utilities_macros.note_funcall_helper_function( $sym198$HTML_LINK_TO_OWL_OPENCYC_URI );
    memoization_state.note_memoized_function( $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE );
    memoization_state.note_memoized_function( $sym228$BEST_ISA_FOR_INDIVIDUAL );
    memoization_state.note_memoized_function( $sym241$OWL_FORT_HUMAN_READABLE_NAME );
    memoization_state.note_memoized_function( $sym253$URI_FOR_PREFIX_AND_ONTOLOGY );
    memoization_state.note_memoized_function( $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI );
    memoization_state.note_memoized_function( $sym267$ONTOLOGY_URI );
    memoization_state.note_memoized_function( $sym273$OWL_NART_NAME );
    memoization_state.note_memoized_function( $sym275$OWL_NART_SORT_STRING );
    memoization_state.note_memoized_function( $sym289$OWL_EXTERNAL_ID_STRING );
    memoization_state.note_memoized_function( $sym297$OWL_GENERATE_PHRASE_INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_owlification_file();
  }

  @Override
  public void initializeVariables()
  {
    init_owlification_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_owlification_file();
  }
  static
  {
    me = new owlification();
    $owl_use_external_ids_for_namesP$ = null;
    $owl_prefer_ontology_urisP$ = null;
    $owl_use_pretty_stringsP$ = null;
    $owl_use_entity_referencesP$ = null;
    $owl_asents_to_export$ = null;
    $owl_export_terms$ = null;
    $owl_remove_isa_individual_asentsP$ = null;
    $owl_profilingP$ = null;
    $owl_export_from_opencyc_kbP$ = null;
    $owl_export_cap_per_category$ = null;
    $owl_export_mt$ = null;
    $owl_export_ontology$ = null;
    $owl_export_parameters$ = null;
    $owl_expected_nart_count$ = null;
    $owl_singleton_predicate_list$ = null;
    $owl_cycl_predicate_table_caching_state$ = null;
    $assertion_arg0s_excluded_from_owl_export$ = null;
    $owl_cycl_predicates_to_use_as_is$ = null;
    $owl_cycl_type_table$ = null;
    $owl_cycl_property_table$ = null;
    $owl_cycl_collection_table$ = null;
    $owl_cycl_xsd_schema_table$ = null;
    $owl_fort_arg2_predicates$ = null;
    $owl_permissive_arg2_predicates$ = null;
    $fort_owl_name_table$ = null;
    $owl_name_uniquifier_lock$ = null;
    $fort_owl_name_counter$ = null;
    $owl_transitive_via_genls_arg2_preds_to_filter$ = null;
    $owl_blacklist_sentence_patterns$ = null;
    $asent_to_owl_cyclify$ = null;
    $owl_include_cyc_constant_popupsP$ = null;
    $owl_link_constant_references_for_these_preds$ = null;
    $owl_span_id_counter$ = null;
    $inverse_binary_predicate_var$ = null;
    $rdf_name_invalid_start_char_prefix$ = null;
    $ontology_uris$ = null;
    $invalid_owl_name_chars_remove$ = null;
    $invalid_owl_name_chars_underscore$ = null;
    $owl_human_readable_name_generation_mt$ = null;
    $umbel_id_map$ = null;
    $umbel_data_files$ = null;
    $list0 = ConsesLow.list( makeSymbol( "ASENTS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_OWL_ASENTS_TO_EXPORT_ = makeSymbol( "*OWL-ASENTS-TO-EXPORT*" );
    $sym3$LISTP = makeSymbol( "LISTP" );
    $str4$_OWL_EXPORT_TERMS__is_not_set_ = makeString( "*OWL-EXPORT-TERMS* is not set." );
    $kw5$IGNORE = makeKeyword( "IGNORE" );
    $const6$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VERSION-DATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*OWL-EXPORT-VERSION-DATE*" ) ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$_OWL_EXPORT_VERSION_DATE_ = makeSymbol( "*OWL-EXPORT-VERSION-DATE*" );
    $list9 = ConsesLow.list( makeSymbol( "*OWL-USE-PRETTY-STRINGS?*" ), T );
    $list10 = ConsesLow.list( makeSymbol( "*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*" ), T );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "*OWL-USE-ENTITY-REFERENCES?*" ), NIL ), ConsesLow.list( makeSymbol( "*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*" ), T ), ConsesLow.list( makeSymbol(
        "*OWL-EXPORT-INCLUDE-SAMEAS-LINKS-TO-CYC-URIS?*" ), T ), ConsesLow.list( makeSymbol( "*OWL-EXPORT-FROM-OPENCYC-KB?*" ), T ) );
    $sym12$WITH_OPENCYC_OWL_EXPORT_PARAMETERS = makeSymbol( "WITH-OPENCYC-OWL-EXPORT-PARAMETERS" );
    $sym13$WITH_HUMAN_READABLE_OWL_EXPORT_PARAMETERS = makeSymbol( "WITH-HUMAN-READABLE-OWL-EXPORT-PARAMETERS" );
    $list14 = ConsesLow.list( makeSymbol( "*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*" ), NIL );
    $sym15$MUST = makeSymbol( "MUST" );
    $sym16$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $str17$Human_readable_OWL_export_require = makeString( "Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S" );
    $list18 = ConsesLow.list( makeSymbol( "*XML-STREAM*" ), makeSymbol( "*OWL-USE-PRETTY-STRINGS?*" ), makeSymbol( "*OWL-USE-EXTERNAL-IDS-FOR-NAMES?*" ), makeSymbol( "*OWL-USE-ENTITY-REFERENCES?*" ), makeSymbol(
        "*OWL-EXPORT-VERSION-DATE*" ), makeSymbol( "*OWL-EXPORT-LIMITED-TO-OPENCYC-CONTENT?*" ), makeSymbol( "*OWL-EXPORT-FROM-OPENCYC-KB?*" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM-VAR" ), makeSymbol( "TERM-ITERATOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TERM-COUNT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym20$TERM = makeUninternedSymbol( "TERM" );
    $sym21$TERM_LIST = makeUninternedSymbol( "TERM-LIST" );
    $sym22$_OWL_EXPORT_TERMS_ = makeSymbol( "*OWL-EXPORT-TERMS*" );
    $sym23$NEW_SET = makeSymbol( "NEW-SET" );
    $list24 = ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL );
    $list25 = ConsesLow.list( NIL );
    $sym26$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym27$SET_ADD = makeSymbol( "SET-ADD" );
    $list28 = ConsesLow.list( makeSymbol( "*OWL-EXPORT-TERMS*" ) );
    $sym29$CPUSH = makeSymbol( "CPUSH" );
    $sym30$NEW_LIST_ITERATOR = makeSymbol( "NEW-LIST-ITERATOR" );
    $sym31$NREVERSE = makeSymbol( "NREVERSE" );
    $int32$14822 = makeInteger( 14822 );
    $list33 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "preferredEnglish" ) ), constant_handles.reader_make_constant_shell( makeString( "cycName" ) ), constant_handles
        .reader_make_constant_shell( makeString( "comment" ) ), constant_handles.reader_make_constant_shell( makeString( "owlExternalID" ) ), constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ) );
    $sym34$OWL_CYCL_PREDICATE_TABLE = makeSymbol( "OWL-CYCL-PREDICATE-TABLE" );
    $list35 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "specialIsa" ) ), makeString( "rdf:type" ) );
    $list36 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "preferredEnglish" ) ), makeString( "rdfs:label" ) );
    $list37 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "skos:prefLabel" ) ), makeString( "skos:prefLabel" ) );
    $const38$otherEnglish = constant_handles.reader_make_constant_shell( makeString( "otherEnglish" ) );
    $const39$prettyString = constant_handles.reader_make_constant_shell( makeString( "prettyString" ) );
    $const40$cycName = constant_handles.reader_make_constant_shell( makeString( "cycName" ) );
    $str41$_ = makeString( ":" );
    $str42$label = makeString( "label" );
    $list43 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "comment" ) ), makeString( "rdfs:comment" ) );
    $const44$owlExternalID = constant_handles.reader_make_constant_shell( makeString( "owlExternalID" ) );
    $str45$externalID = makeString( "externalID" );
    $list46 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "broaderTerm" ) ), makeString( "broaderTerm" ) ), ConsesLow.cons( constant_handles
        .reader_make_constant_shell( makeString( "owl:sameAs" ) ), makeString( "owl:sameAs" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "rdfURI" ) ), makeString( "owl:sameAs" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "owl:inverseOf" ) ), makeString( "owl:inverseOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
          makeString( "rdf:type" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeString( "rdfs:subClassOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
              makeString( "genlPreds" ) ), makeString( "rdfs:subPropertyOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), makeString( "rdfs:domain" ) ), ConsesLow.cons(
                  constant_handles.reader_make_constant_shell( makeString( "arg1SometimesIsa" ) ), makeString( "rdfs:domain" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ),
                      makeString( "rdfs:range" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2SometimesIsa" ) ), makeString( "rdfs:range" ) ), ConsesLow.cons( constant_handles
                          .reader_make_constant_shell( makeString( "equals" ) ), makeString( "owl:sameAs" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "owl:intersectionOf" ) ),
                              makeString( "owl:intersectionOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeString( "owl:disjointWith" ) ), ConsesLow.cons(
                                  constant_handles.reader_make_constant_shell( makeString( "OWLRestrictionFn" ) ), makeString( "owl:Restriction" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                      makeString( "owl:onProperty" ) ), makeString( "owl:onProperty" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "owl:hasValue" ) ), makeString(
                                          "owl:hasValue" ) )
    } );
    $sym47$_OWL_CYCL_PREDICATE_TABLE_CACHING_STATE_ = makeSymbol( "*OWL-CYCL-PREDICATE-TABLE-CACHING-STATE*" );
    $list48 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "prettyString" ) ), constant_handles.reader_make_constant_shell( makeString( "prettyString-Canonical" ) ), constant_handles
        .reader_make_constant_shell( makeString( "termOfUnit" ) ) );
    $list49 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "broaderThan" ) ), constant_handles.reader_make_constant_shell( makeString( "broaderTerm" ) ), constant_handles
        .reader_make_constant_shell( makeString( "requiredActorSlots" ) ) );
    $list50 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), makeString( "owl:Class" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
        makeString( "BinaryPredicate" ) ), makeString( "owl:ObjectProperty" ) ) );
    $list51 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "SubLAtomicTerm" ) ), makeString( "http://www.w3.org/2000/01/rdf-schema#Literal" ) ), ConsesLow
        .cons( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "genls" ) ), makeString( "http://www.w3.org/2000/01/rdf-schema#subClassOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeString(
                "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "comment" ) ), makeString(
                    "http://www.w3.org/2000/01/rdf-schema#comment" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeString(
                        "http://www.w3.org/2002/07/owl#disjointWith" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeString(
                            "http://www.w3.org/2002/07/owl#differentFrom" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeString(
                                "http://www.w3.org/2002/07/owl#sameAs" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), makeString(
                                    "http://www.w3.org/2000/01/rdf-schema#domain" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), makeString(
                                        "http://www.w3.org/2000/01/rdf-schema#range" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1SometimesIsa" ) ), makeString(
                                            "http://www.w3.org/2000/01/rdf-schema#domain" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2SometimesIsa" ) ), makeString(
                                                "http://www.w3.org/2000/01/rdf-schema#range" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "ontologyVersionInfo" ) ), makeString(
                                                    "http://www.w3.org/2002/07/owl#versionInfo" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "ontologyPriorVersion" ) ), makeString(
                                                        "http://www.w3.org/2002/07/owl#priorVersion" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "incompatibleOntology" ) ), makeString(
                                                            "http://www.w3.org/2002/07/owl#incompatibleWith" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "owl:differentFrom" ) ),
                                                                makeString( "http://www.w3.org/2002/07/owl#differentFrom" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                    "backwardsCompatibleOntology" ) ), makeString( "http://www.w3.org/2002/07/owl#backwardCompatibleWith" ) ), ConsesLow.cons( constant_handles
                                                                        .reader_make_constant_shell( makeString( "inverseBinaryPredicateOf" ) ), makeString( "http://www.w3.org/2002/07/owl#inverseOf" ) ), ConsesLow.cons(
                                                                            constant_handles.reader_make_constant_shell( makeString( "coExtensional" ) ), makeString( "http://www.w3.org/2002/07/owl#equivalentClass" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "owlRestrictionAllValuesFrom" ) ), makeString( "http://www.w3.org/2002/07/owl#allValuesFrom" ) )
    } );
    $list52 = ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:Thing" ) ), makeString( "owl" ), makeString( "Thing" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "owl:Nothing" ) ), makeString( "owl" ), makeString( "Nothing" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:Class" ) ), makeString(
            "owl" ), makeString( "Class" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:DeprecatedClass" ) ), makeString( "owl" ), makeString( "DeprecatedClass" ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "owl:TransitiveProperty" ) ), makeString( "owl" ), makeString( "TransitiveProperty" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "owl:SymmetricProperty" ) ), makeString( "owl" ), makeString( "SymmetricProperty" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "owl:ObjectProperty" ) ), makeString( "owl" ), makeString( "ObjectProperty" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:DatatypeProperty" ) ), makeString(
                            "owl" ), makeString( "DatatypeProperty" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:DeprecatedProperty" ) ), makeString( "owl" ), makeString(
                                "DeprecatedProperty" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:FunctionalProperty" ) ), makeString( "owl" ), makeString( "FunctionalProperty" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:InverseFunctionalProperty" ) ), makeString( "owl" ), makeString( "InverseFunctionalProperty" ) )
    } );
    $list53 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "UniformResourceIdentifier" ) ), makeString( "http://www.w3.org/2001/XMLSchema#uriReference" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "UniformResourceLocator" ) ), makeString( "http://www.w3.org/2001/XMLSchema#uriReference" ) ), ConsesLow.cons( constant_handles
          .reader_make_constant_shell( makeString( "Date" ) ), makeString( "http://www.w3.org/2001/XMLSchema#date" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "SubLRealNumber" ) ),
              makeString( "http://www.w3.org/2001/XMLSchema#double" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "SubLString" ) ), makeString(
                  "http://www.w3.org/2001/XMLSchema#string" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "SubLInteger" ) ), makeString( "http://www.w3.org/2001/XMLSchema#integer" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "PositiveInteger" ) ), makeString( "http://www.w3.org/2001/XMLSchema#positiveInteger" ) ), ConsesLow.cons( constant_handles
          .reader_make_constant_shell( makeString( "Integer" ) ), makeString( "http://www.w3.org/2001/XMLSchema#integer" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "NonNegativeInteger" ) ), makeString( "http://www.w3.org/2001/XMLSchema#nonNegativeInteger" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "SubLBoolean" ) ), makeString(
                  "http://www.w3.org/2001/XMLSchema#boolean" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "CalendarSecond" ) ), makeString(
                      "http://www.w3.org/2001/XMLSchema#dateTime" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "CalendarDay" ) ), makeString( "http://www.w3.org/2001/XMLSchema#date" ) ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "CalendarMonth" ) ), makeString( "http://www.w3.org/2001/XMLSchema#gYearMonth" ) ), ConsesLow.cons( constant_handles
          .reader_make_constant_shell( makeString( "CalendarYear" ) ), makeString( "http://www.w3.org/2001/XMLSchema#gYear" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "DayOfMonthType" ) ), makeString( "http://www.w3.org/2001/XMLSchema#gDay" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "GregorianMonthType" ) ), makeString(
                  "http://www.w3.org/2001/XMLSchema#gMonth" ) )
    } );
    $list54 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "broaderThan" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
        .reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "arg1SometimesIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell( makeString(
          "arg2SometimesIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) )
    } );
    $list55 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ) );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "DUMP-DIRECTORY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "*FORT-OWL-NAME-TABLE*" ), ConsesLow.list( makeSymbol( "UNINITIALIZED" ) ) ) );
    $sym58$PWHEN = makeSymbol( "PWHEN" );
    $sym59$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym60$WRITE_FORT_OWL_NAME_TABLE = makeSymbol( "WRITE-FORT-OWL-NAME-TABLE" );
    $kw61$OWL_NAME = makeKeyword( "OWL-NAME" );
    $str62$ = makeString( "" );
    $str63$_ = makeString( "/" );
    $str64$fort_owl_names_csv = makeString( "fort-owl-names.csv" );
    $kw65$OUTPUT = makeKeyword( "OUTPUT" );
    $str66$Unable_to_open__S = makeString( "Unable to open ~S" );
    $list67 = ConsesLow.cons( makeSymbol( "NAME" ), makeSymbol( "TYPE" ) );
    $str68$_S___S__ = makeString( "~S, ~S~%" );
    $str69$OWL_Name_Uniquifier = makeString( "OWL Name Uniquifier" );
    $sym70$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $const71$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list72 = ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) );
    $const73$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list74 = ConsesLow.cons( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) ), constant_handles.reader_make_constant_shell( makeString(
        "synonymousExternalPred-Inverse" ) ) ), makeKeyword( "ANYTHING" ) );
    $str75$unexpected_asent__s = makeString( "unexpected asent ~s" );
    $const76$owl_sameAs = constant_handles.reader_make_constant_shell( makeString( "owl:sameAs" ) );
    $str77$Caught_error_OWL_cyclifying__S___ = makeString( "Caught error OWL-cyclifying ~S:~% ~S" );
    $str78$_S_is_not_a_FORT_ = makeString( "~S is not a FORT." );
    $sym79$META_VARIABLE_P = makeSymbol( "META-VARIABLE-P" );
    $const80$owl_Ontology = constant_handles.reader_make_constant_shell( makeString( "owl:Ontology" ) );
    $str81$Can_t_export_OWL_Ontology_as_part = makeString( "Can't export OWL Ontology as part of export of larger ontology: ~S" );
    $str82$Sorting_ = makeString( "Sorting " );
    $str83$_terms_for_OWL_export___ = makeString( " terms for OWL export..." );
    $int84$1000 = makeInteger( 1000 );
    $str85$Couldn_t_resolve__S_to_a_canonica = makeString( "Couldn't resolve ~S to a canonical FORT." );
    $sym86$OWL_EXPORT_CANONICALIZE_NART = makeSymbol( "OWL-EXPORT-CANONICALIZE-NART" );
    $sym87$NART_P = makeSymbol( "NART-P" );
    $int88$225 = makeInteger( 225 );
    $sym89$SUBSUMED_OWL_ASENT_ = makeSymbol( "SUBSUMED-OWL-ASENT?" );
    $list90 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym91$NONEXPORTABLE_TERM_WARNING = makeSymbol( "NONEXPORTABLE-TERM-WARNING" );
    $str92$Can_t_export__S = makeString( "Can't export ~S" );
    $str93$Not_a_collection___S = makeString( "Not a collection: ~S" );
    $const94$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction" ) );
    $sym95$FORT_P = makeSymbol( "FORT-P" );
    $str96$Restriction_property_is_not_a_bin = makeString( "Restriction property is not a binary predicate(!): ~S" );
    $list97 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SubcollectionOfWithRelationFromTypeFn" ) ) );
    $str98$Couldn_t_find_or_create_inverse_o = makeString( "Couldn't find or create inverse of ~S" );
    $list99 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SubcollectionOfWithRelationToTypeFn" ) ) );
    $str100$restriction_property_is_not_a_FOR = makeString( "restriction property is not a FORT: ~S" );
    $sym101$OWL_FORT__ = makeSymbol( "OWL-FORT-<" );
    $kw102$TRUE = makeKeyword( "TRUE" );
    $sym103$GAF_FORMULA = makeSymbol( "GAF-FORMULA" );
    $sym104$OWL_BLACKLIST_SENTENCE_ = makeSymbol( "OWL-BLACKLIST-SENTENCE?" );
    $sym105$OWLIFIABLE_SENTENCE_ = makeSymbol( "OWLIFIABLE-SENTENCE?" );
    $list106 = ConsesLow.list( ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "OWL-BLACKLIST-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "quotedIsa" ) ), makeKeyword( "ANYTHING" ), constant_handles.reader_make_constant_shell( makeString( "TerrorismOntologyConstant" ) ) ) );
    $sym107$OWL_ISA_LIT_ = makeSymbol( "OWL-ISA-LIT?" );
    $sym108$OWL_GENLS_LIT_ = makeSymbol( "OWL-GENLS-LIT?" );
    $sym109$VALID_COLLECTION_FORT_FOR_OWL_EXPORT_ = makeSymbol( "VALID-COLLECTION-FORT-FOR-OWL-EXPORT?" );
    $const110$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const111$synonymousExternalConceptWRTPredi = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConceptWRTPredicate" ) );
    $kw112$GAF = makeKeyword( "GAF" );
    $const113$rdf_type = constant_handles.reader_make_constant_shell( makeString( "rdf-type" ) );
    $const114$synonymousExternalConcept = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) );
    $sym115$OWL_ASENT__ = makeSymbol( "OWL-ASENT-<" );
    $sym116$COMMENT_ASENT_ = makeSymbol( "COMMENT-ASENT?" );
    $const117$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $list118 = ConsesLow.listS( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) ), constant_handles.reader_make_constant_shell( makeString(
        "synonymousExternalPred-Inverse" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "ANYTHING" ) );
    $list119 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), constant_handles.reader_make_constant_shell(
        makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CenturyFn" ) ) );
    $const120$preferredEnglish = constant_handles.reader_make_constant_shell( makeString( "preferredEnglish" ) );
    $const121$specialIsa = constant_handles.reader_make_constant_shell( makeString( "specialIsa" ) );
    $list122 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:FunctionalProperty" ) ) );
    $list123 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:InverseFunctionalProperty" ) ) );
    $const124$StrictlyFunctionalSlot = constant_handles.reader_make_constant_shell( makeString( "StrictlyFunctionalSlot" ) );
    $const125$argCardinality = constant_handles.reader_make_constant_shell( makeString( "argCardinality" ) );
    $list126 = ConsesLow.list( TWO_INTEGER, ONE_INTEGER );
    $const127$strictlyFunctionalInArgs = constant_handles.reader_make_constant_shell( makeString( "strictlyFunctionalInArgs" ) );
    $list128 = ConsesLow.list( TWO_INTEGER );
    $list129 = ConsesLow.list( ONE_INTEGER, ONE_INTEGER );
    $list130 = ConsesLow.list( ONE_INTEGER );
    $sym131$OWL_REDUNDANT_TYPE_ISA_ASENT_ = makeSymbol( "OWL-REDUNDANT-TYPE-ISA-ASENT?" );
    $const132$rdfs_subClassOf = constant_handles.reader_make_constant_shell( makeString( "rdfs:subClassOf" ) );
    $sym133$ISA_LIT_ = makeSymbol( "ISA-LIT?" );
    $sym134$ISA_INDIVIDUAL_ASENT_ = makeSymbol( "ISA-INDIVIDUAL-ASENT?" );
    $const135$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const136$rdfURI = constant_handles.reader_make_constant_shell( makeString( "rdfURI" ) );
    $sym137$FIRST = makeSymbol( "FIRST" );
    $str138$unexpected_owl_cycl_pred_for_asen = makeString( "unexpected owl-cycl-pred for asent ~s" );
    $str139$Caught_error__S___while_trying_to = makeString( "Caught error ~S~% while trying to OWL-cyclify~% ~S" );
    $list140 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "SUBJECT" ), makeSymbol( "OBJECT" ) );
    $str141$subject = makeString( "subject" );
    $str142$predicate = makeString( "predicate" );
    $str143$object = makeString( "object" );
    $sym144$STRINGP = makeSymbol( "STRINGP" );
    $const145$OWLPredicateFn = constant_handles.reader_make_constant_shell( makeString( "OWLPredicateFn" ) );
    $sym146$FORT_IN_OWL_EXPORT_ = makeSymbol( "FORT-IN-OWL-EXPORT?" );
    $sym147$OWLIFIABLE_ARG1_ = makeSymbol( "OWLIFIABLE-ARG1?" );
    $str148$Invalid_term_type___S_for__S__Exp = makeString( "Invalid term type: ~S for ~S~%Export default namespace = ~S" );
    $const149$OWLTermOfTypeFn = constant_handles.reader_make_constant_shell( makeString( "OWLTermOfTypeFn" ) );
    $const150$OWLIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "OWLIntersectionFn" ) );
    $const151$OWLURIFn = constant_handles.reader_make_constant_shell( makeString( "OWLURIFn" ) );
    $const152$OWLDatatypeFn = constant_handles.reader_make_constant_shell( makeString( "OWLDatatypeFn" ) );
    $str153$Unexpected_EL_formula_arg2___S = makeString( "Unexpected EL formula arg2: ~S" );
    $list154 = ConsesLow.list( makeSymbol( "ENTITY" ), makeSymbol( "LOCAL-NAME" ) );
    $str155$Raw_term_string_for__S___S = makeString( "Raw term string for ~S: ~S" );
    $str156$Need_XSD_datatype_for__S = makeString( "Need XSD datatype for ~S" );
    $const157$SecondFn = constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) );
    $const158$DayFn = constant_handles.reader_make_constant_shell( makeString( "DayFn" ) );
    $const159$MonthFn = constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) );
    $const160$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $const161$CenturyFn = constant_handles.reader_make_constant_shell( makeString( "CenturyFn" ) );
    $str162$xsd = makeString( "xsd" );
    $str163$integer = makeString( "integer" );
    $str164$decimal = makeString( "decimal" );
    $str165$date = makeString( "date" );
    $str166$timeInstant = makeString( "timeInstant" );
    $str167$Don_t_know_XSD_datatype_for__S = makeString( "Don't know XSD datatype for ~S" );
    $str168$YYYY_MM_DD = makeString( "YYYY-MM-DD" );
    $str169$YYYY_MM = makeString( "YYYY-MM" );
    $str170$YYYY = makeString( "YYYY" );
    $str171$YYYY_MM_DDTHH_MM_SS = makeString( "YYYY-MM-DDTHH:MM:SS" );
    $str172$_ = makeString( "&" );
    $str173$_ = makeString( ";" );
    $list174 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "URIWithFragmentFn" ) ), constant_handles.reader_make_constant_shell( makeString( "URIInNamespaceFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "URIFn" ) ) );
    $const175$UniformResourceIdentifier = constant_handles.reader_make_constant_shell( makeString( "UniformResourceIdentifier" ) );
    $sym176$URI_FORT_P = makeSymbol( "URI-FORT-P" );
    $const177$URIFn = constant_handles.reader_make_constant_shell( makeString( "URIFn" ) );
    $const178$URIInNamespaceFn = constant_handles.reader_make_constant_shell( makeString( "URIInNamespaceFn" ) );
    $const179$URIWithFragmentFn = constant_handles.reader_make_constant_shell( makeString( "URIWithFragmentFn" ) );
    $str180$_ = makeString( "#" );
    $sym181$_URI_STRING = makeSymbol( "?URI-STRING" );
    $const182$uriString = constant_handles.reader_make_constant_shell( makeString( "uriString" ) );
    $list183 = ConsesLow.list( makeSymbol( "?URI-STRING" ) );
    $list184 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $str185$Can_t_convert_URI_FORT_to_string_ = makeString( "Can't convert URI FORT to string: ~S" );
    $list186 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "comment" ) ) );
    $sym187$HTML_LINK_TO_OWL_URI_WITH_POPUPS = makeSymbol( "HTML-LINK-TO-OWL-URI-WITH-POPUPS" );
    $sym188$HTML_LINK_TO_OWL_URI = makeSymbol( "HTML-LINK-TO-OWL-URI" );
    $str189$TagToTip__ = makeString( "TagToTip('" );
    $str190$__ = makeString( "')" );
    $str191$UnTip__ = makeString( "UnTip()" );
    $str192$owl_cyc_constant_tooltip = makeString( "owl_cyc_constant_tooltip" );
    $str193$display__none_ = makeString( "display: none;" );
    $str194$comment_header = makeString( "comment_header" );
    $str195$ID___A = makeString( "ID: ~A" );
    $str196$comment_body = makeString( "comment_body" );
    $str197$cyc_term = makeString( "cyc_term" );
    $sym198$HTML_LINK_TO_OWL_OPENCYC_URI = makeSymbol( "HTML-LINK-TO-OWL-OPENCYC-URI" );
    $str199$No_comment_ = makeString( "No comment." );
    $const200$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const201$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $const202$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $const203$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $str204$Couldn_t_find_inverse_of__S = makeString( "Couldn't find inverse of ~S" );
    $str205$unexpected_subcollection_function = makeString( "unexpected subcollection function ~s" );
    $const206$owl_intersectionOf = constant_handles.reader_make_constant_shell( makeString( "owl:intersectionOf" ) );
    $const207$OWLRestrictionFn = constant_handles.reader_make_constant_shell( makeString( "OWLRestrictionFn" ) );
    $const208$owl_onProperty = constant_handles.reader_make_constant_shell( makeString( "owl:onProperty" ) );
    $const209$owl_hasValue = constant_handles.reader_make_constant_shell( makeString( "owl:hasValue" ) );
    $sym210$_PRED = makeSymbol( "?PRED" );
    $const211$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const212$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym213$FIND_OR_CREATE_INVERSE_BINARY_PREDICATE = makeSymbol( "FIND-OR-CREATE-INVERSE-BINARY-PREDICATE" );
    $const214$BinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) );
    $list215 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) );
    $const216$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const217$InverseBinaryPredicateFn = constant_handles.reader_make_constant_shell( makeString( "InverseBinaryPredicateFn" ) );
    $str218$__Created__S__ = makeString( "~&Created ~S~%" );
    $sym219$BINARY_PREDICATE_ = makeSymbol( "BINARY-PREDICATE?" );
    $list220 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) );
    $list221 = ConsesLow.list( makeSymbol( "OWL-INTERSECTION-FN" ), makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "OWL-RESTRICTION-FN" ), makeSymbol( "OWL-ON-PROPERTY" ), makeSymbol( "PROPERTY" ), makeSymbol(
        "OWL-HAS-VALUE" ), makeSymbol( "VALUE" ) ) );
    $str222$owl_Restriction = makeString( "owl:Restriction" );
    $str223$owl_onProperty = makeString( "owl:onProperty" );
    $str224$owl_hasValue = makeString( "owl:hasValue" );
    $str225$Statement = makeString( "Statement" );
    $str226$Description = makeString( "Description" );
    $const227$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym228$BEST_ISA_FOR_INDIVIDUAL = makeSymbol( "BEST-ISA-FOR-INDIVIDUAL" );
    $sym229$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym230$ATOMIC_SENTENCE_PREDICATE = makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $sym231$ATOMIC_SENTENCE_ARG2 = makeSymbol( "ATOMIC-SENTENCE-ARG2" );
    $kw232$CYC_PPH = makeKeyword( "CYC-PPH" );
    $sym233$WITH_PPH_MEMOIZATION = makeSymbol( "WITH-PPH-MEMOIZATION" );
    $sym234$PROGN = makeSymbol( "PROGN" );
    $str235$type = makeString( "type" );
    $list236 = ConsesLow.list( makeSymbol( "ASSERTED-ONTOLOGY" ), makeSymbol( "POSSIBLE-URI" ) );
    $list237 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $sym238$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym239$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $str240$_ = makeString( "_" );
    $sym241$OWL_FORT_HUMAN_READABLE_NAME = makeSymbol( "OWL-FORT-HUMAN-READABLE-NAME" );
    $list242 = ConsesLow.list( Characters.CHAR_dollar, Characters.CHAR_underbar, Characters.CHAR_colon );
    $sym243$NON_FORT_P = makeSymbol( "NON-FORT-P" );
    $str244$unexpected_term__s = makeString( "unexpected term ~s" );
    $kw245$PREFERRED_NAME = makeKeyword( "PREFERRED-NAME" );
    $int246$60 = makeInteger( 60 );
    $int247$30 = makeInteger( 30 );
    $str248$Timed_out_generating_phrases_for_ = makeString( "Timed out generating phrases for ~S.~% Phrases generated: ~S" );
    $list249 = ConsesLow.list( makeSymbol( "THIS-TERM" ), makeSymbol( "ONTOLOGY" ), makeSymbol( "LOCAL-NAME" ) );
    $const250$synonymousExternalPred_Inverse = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalPred-Inverse" ) );
    $list251 = ConsesLow.list( Characters.CHAR_colon );
    $list252 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "LOCAL-NAME" ) );
    $sym253$URI_FOR_PREFIX_AND_ONTOLOGY = makeSymbol( "URI-FOR-PREFIX-AND-ONTOLOGY" );
    $kw254$X = makeKeyword( "X" );
    $list255 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ) );
    $const256$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell( makeString( "nameSpacePrefixForSKS" ) );
    $const257$standardPrefixForURI = constant_handles.reader_make_constant_shell( makeString( "standardPrefixForURI" ) );
    $str258$Couldn_t_find_expansion_for__S_wr = makeString( "Couldn't find expansion for ~S wrt ~S" );
    $const259$owl_inverseOf = constant_handles.reader_make_constant_shell( makeString( "owl:inverseOf" ) );
    $str260$Can_t_get_URI_from_non_FORT_ontol = makeString( "Can't get URI from non-FORT ontology ~S" );
    $str261$Can_t_get_URI_from_non_string_loc = makeString( "Can't get URI from non-string local name ~S" );
    $list262 = ConsesLow.list( makeString( "#" ), makeString( "/" ) );
    $str263$http___www_w3_org_2006_03_wn_wn20 = makeString( "http://www.w3.org/2006/03/wn/wn20/instances" );
    $sym264$MAYBE_WARN_ABOUT_ONTOLOGY_MISSING_URI = makeSymbol( "MAYBE-WARN-ABOUT-ONTOLOGY-MISSING-URI" );
    $str265$Couldn_t_find_URI_for__S_ = makeString( "Couldn't find URI for ~S." );
    $list266 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "FOAFOntology" ) ), makeString( "http://xmlns.com/foaf/0.1/" ) ) );
    $sym267$ONTOLOGY_URI = makeSymbol( "ONTOLOGY-URI" );
    $kw268$URI = makeKeyword( "URI" );
    $const269$salientURI = constant_handles.reader_make_constant_shell( makeString( "salientURI" ) );
    $list270 = ConsesLow.list( makeKeyword( "URI" ) );
    $list271 = ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "URLFn" ) ), constant_handles.reader_make_constant_shell( makeString( "URIFn" ) ) ), ConsesLow
        .list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ) );
    $sym272$STRING = makeSymbol( "STRING" );
    $sym273$OWL_NART_NAME = makeSymbol( "OWL-NART-NAME" );
    $str274$_ = makeString( " " );
    $sym275$OWL_NART_SORT_STRING = makeSymbol( "OWL-NART-SORT-STRING" );
    $sym276$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str277$_ = makeString( "(" );
    $str278$___ = makeString( "#<(" );
    $str279$_ = makeString( ")" );
    $str280$__ = makeString( ")>" );
    $str281$__ = makeString( "#$" );
    $str282$_u = makeString( "&u" );
    $str283$__ = makeString( "</" );
    $sym284$INVALID_OWL_NAME_CHAR_TO_REMOVE_P = makeSymbol( "INVALID-OWL-NAME-CHAR-TO-REMOVE-P" );
    $sym285$VALID_OWL_NAME_CHAR_P = makeSymbol( "VALID-OWL-NAME-CHAR-P" );
    $list286 = ConsesLow.list( Characters.CHAR_question, Characters.CHAR_comma, Characters.CHAR_lbrace, Characters.CHAR_rbrace, Characters.CHAR_hash );
    $list287 = ConsesLow.list( new SubLObject[] { Characters.CHAR_hyphen, Characters.CHAR_space, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_backquote, Characters.CHAR_backslash,
      Characters.CHAR_colon, Characters.CHAR_slash, Characters.CHAR_semicolon, Characters.CHAR_percent, Characters.CHAR_less, Characters.CHAR_greater, Characters.CHAR_ampersand, Characters.CHAR_dollar,
      Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_lbrace, Characters.CHAR_rbrace, Characters.CHAR_exclamation, Characters.CHAR_at, Characters.CHAR_caret, Characters.CHAR_period
    } );
    $str288$HTML_tags_not_stripped_from__s = makeString( "HTML tags not stripped from ~s" );
    $sym289$OWL_EXTERNAL_ID_STRING = makeSymbol( "OWL-EXTERNAL-ID-STRING" );
    $int290$26 = makeInteger( 26 );
    $str291$ID__S_for__S_is_suspiciously_shor = makeString( "ID ~S for ~S is suspiciously short (~D characters)" );
    $int292$256 = makeInteger( 256 );
    $list293 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "plural" ) ) );
    $list294 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) );
    $kw295$DEFAULT = makeKeyword( "DEFAULT" );
    $const296$OWLHumanReadableNameGenerationMt = constant_handles.reader_make_constant_shell( makeString( "OWLHumanReadableNameGenerationMt" ) );
    $sym297$OWL_GENERATE_PHRASE_INT = makeSymbol( "OWL-GENERATE-PHRASE-INT" );
    $kw298$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym299$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym300$PPH_PRECISION_P = makeSymbol( "PPH-PRECISION-P" );
    $kw301$NONE = makeKeyword( "NONE" );
    $str302$fake_pretty_string = makeString( "fake pretty string" );
    $const303$prettyString_Canonical = constant_handles.reader_make_constant_shell( makeString( "prettyString-Canonical" ) );
    $list304 = ConsesLow.list( ConsesLow.cons( makeString( "/cyc/projects/opencyc/owl-export/mappings/umbel_subject_concepts_latest.csv" ), makeString( "http://umbel.org/umbel/sc/" ) ), ConsesLow.cons( makeString(
        "/cyc/projects/opencyc/owl-export/mappings/umbel_abstract_concepts_latest.csv" ), makeString( "http://umbel.org/umbel/ac/" ) ) );
    $list305 = ConsesLow.cons( makeSymbol( "FILE" ), makeSymbol( "BASE-URI" ) );
    $kw306$INPUT = makeKeyword( "INPUT" );
    $str307$_ = makeString( "\"" );
    $list308 = ConsesLow.list( makeSymbol( "UMBEL-ID" ), makeSymbol( "CYC-ID" ) );
    $str309$sc = makeString( "sc" );
    $const310$umbelSubjectConceptName = constant_handles.reader_make_constant_shell( makeString( "umbelSubjectConceptName" ) );
    $const311$umbelAbstractConceptName = constant_handles.reader_make_constant_shell( makeString( "umbelAbstractConceptName" ) );
    $const312$MappingMtFn = constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) );
    $const313$OWLOntologyFn = constant_handles.reader_make_constant_shell( makeString( "OWLOntologyFn" ) );
    $const314$UMBELSubjectConceptNamespace = constant_handles.reader_make_constant_shell( makeString( "UMBELSubjectConceptNamespace" ) );
    $const315$UMBELAbstractConceptNamespace = constant_handles.reader_make_constant_shell( makeString( "UMBELAbstractConceptNamespace" ) );
  }
}
/*
 * 
 * Total time: 1521 ms
 * 
 */