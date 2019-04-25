package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexification_wizard;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet_import
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import";
  public static final String myFingerPrint = "8d907c3f50ddc87d6066cc092bc4fd0bb1dc1ed33d74303d4aa696023482c40c";
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 800L)
  private static SubLSymbol $wordnet_import_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2104L)
  public static SubLSymbol $wni_pos_map$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2376L)
  public static SubLSymbol $wni_1_char_pos_map$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
  private static SubLSymbol $wni_unranked_synsets_for_english_word_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
  private static SubLSymbol $wni_synsets_for_english_word_stringXpos_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
  private static SubLSymbol $wni_synsets_for_english_word_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
  private static SubLSymbol $wni_synset_collectionP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
  private static SubLSymbol $wni_synset_words_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
  private static SubLSymbol $wni_synset_example_phrases_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 12654L)
  private static SubLSymbol $wni_verb_frame_generalities$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 13201L)
  private static SubLSymbol $wni_least_general_frame_generality_score$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
  private static SubLSymbol $wni_synset_verb_frames_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
  private static SubLSymbol $wni_verb_frames_for_word_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
  private static SubLSymbol $wni_hypernyms_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
  private static SubLSymbol $wni_all_hypernyms_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
  private static SubLSymbol $wni_hyponyms_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
  private static SubLSymbol $wni_all_hyponyms_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
  private static SubLSymbol $wni_derived_forms_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
  private static SubLSymbol $wni_synset_gloss_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
  private static SubLSymbol $wni_synset_pos_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
  private static SubLSymbol $wni_synset_speech_part_offset_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
  private static SubLSymbol $wni_synset_term_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
  private static SubLSymbol $wni_synset_wXo_links_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
  private static SubLSymbol $wni_synsets_caused_by_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
  private static SubLSymbol $wni_synsets_causing_helper_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
  private static SubLSymbol $wni_broader_terms_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 51505L)
  public static SubLSymbol $wni_problem_store$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
  private static SubLSymbol $wni_term_has_verb_semtrans_helperP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 58393L)
  private static SubLSymbol $wni_maximum_nbr_of_terms_to_gather_for_matching$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 59830L)
  public static SubLSymbol $wni_very_verbose_exact_synset_term_matches$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 59979L)
  public static SubLSymbol $wni_verbose_exact_synset_term_matches$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 80147L)
  public static SubLSymbol $person_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 80262L)
  public static SubLSymbol $organism_being_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 80382L)
  public static SubLSymbol $chemical_compound_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 82982L)
  public static SubLSymbol $country_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 83100L)
  public static SubLSymbol $urban_area_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 83227L)
  public static SubLSymbol $geographical_area_synset$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLSymbol $dtp_wni_role_info$;
  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128275L)
  private static SubLSymbol $wordnet_import_access_path$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING;
  private static final SubLSymbol $sym5$STRINGP;
  private static final SubLObject $const6$wnSynsetMemberWord;
  private static final SubLSymbol $sym7$_SYNSET;
  private static final SubLObject $const8$WordNetEnglishWordFn;
  private static final SubLList $list9;
  private static final SubLObject $const10$WordNetWorkflowCollectorMt;
  private static final SubLSymbol $sym11$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym12$NAUT_P;
  private static final SubLSymbol $sym13$_WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_;
  private static final SubLSymbol $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS;
  private static final SubLString $str15$select_synset_id_from_WordSense_w;
  private static final SubLString $str16$__and_pos____;
  private static final SubLString $str17$__order_by_word_sense;
  private static final SubLSymbol $kw18$DBMS_SERVER;
  private static final SubLSymbol $kw19$PORT;
  private static final SubLSymbol $kw20$SUBPROTOCOL;
  private static final SubLSymbol $kw21$PROXY_SERVER;
  private static final SubLSymbol $kw22$TIMEOUT;
  private static final SubLObject $const23$WordNetSynsetFn;
  private static final SubLSymbol $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_;
  private static final SubLSymbol $sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING;
  private static final SubLObject $const26$WordNet2_0_KS;
  private static final SubLString $str27$__order_by_pos__word_sense;
  private static final SubLSymbol $sym28$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_;
  private static final SubLSymbol $sym29$WNI_SYNSET_COLLECTION_;
  private static final SubLObject $const30$WordNetSynsetImportStatus_Determi;
  private static final SubLObject $const31$WordNetWorkflowDataStatusMt;
  private static final SubLSymbol $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_;
  private static final SubLSymbol $sym33$WNI_SYNSET_INDIVIDUALS;
  private static final SubLSymbol $sym34$WNI_UNREIFIED_SYNSET;
  private static final SubLSymbol $sym35$WNI_EXCLUDE_SITUATIONS;
  private static final SubLString $str36$excluding_specs_of___Situation;
  private static final SubLString $str37$cdolist;
  private static final SubLObject $const38$Situation;
  private static final SubLSymbol $sym39$WNI_EXCLUDE_RELATIONS;
  private static final SubLString $str40$excluding_specs_of___Relation;
  private static final SubLObject $const41$Relation;
  private static final SubLSymbol $sym42$WNI_EXCLUDE_SKIPPED;
  private static final SubLString $str43$excluding_skipped_synsets;
  private static final SubLObject $const44$WordNetSynsetImportStatus_Skip;
  private static final SubLSymbol $sym45$WNI_SYNSET_ID;
  private static final SubLSymbol $sym46$POSSIBLY_NAUT_P;
  private static final SubLSymbol $sym47$INTEGERP;
  private static final SubLSymbol $sym48$WNI_SYNSET_WORDS;
  private static final SubLSymbol $sym49$WNI_SYNSETS_EQUAL;
  private static final SubLSymbol $sym50$WNI_SYNSET_WORDS_HELPER;
  private static final SubLObject $const51$thereExists;
  private static final SubLSymbol $sym52$_POS;
  private static final SubLSymbol $sym53$_SENSE;
  private static final SubLObject $const54$wnSynsetWord;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$_;
  private static final SubLSymbol $sym57$SECOND;
  private static final SubLSymbol $sym58$_WNI_SYNSET_WORDS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym59$WNI_SYNSET_EXAMPLE_PHRASES;
  private static final SubLSymbol $sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER;
  private static final SubLObject $const61$wnSynsetExamplePhraseWithPosition;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$FIRST;
  private static final SubLSymbol $sym64$_WNI_SYNSET_EXAMPLE_PHRASES_HELPER_CACHING_STATE_;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$WNI_MOST_GENERAL_SYNSET_VERB_FRAME;
  private static final SubLSymbol $sym67$FORT_P;
  private static final SubLSymbol $sym68$WNI_SYNSET_VERB_FRAMES;
  private static final SubLSymbol $sym69$WNI_SYNSET_VERB_FRAMES_HELPER;
  private static final SubLObject $const70$wnSynsetVerbFrame;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$_WNI_SYNSET_VERB_FRAMES_HELPER_CACHING_STATE_;
  private static final SubLInteger $int74$1000;
  private static final SubLSymbol $sym75$WNI_VERB_FRAMES_FOR_WORD;
  private static final SubLSymbol $sym76$_WNI_VERB_FRAMES_FOR_WORD_CACHING_STATE_;
  private static final SubLSymbol $sym77$WNI_HYPERNYMS;
  private static final SubLSymbol $sym78$WNI_HYPERNYMS_HELPER;
  private static final SubLObject $const79$wnHypernym;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$_WNI_HYPERNYMS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym82$WNI_ALL_HYPERNYMS;
  private static final SubLSymbol $sym83$WNI_ALL_HYPERNYMS_HELPER;
  private static final SubLSymbol $sym84$_WNI_ALL_HYPERNYMS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym85$WNI_ALL_HYPERNYM_;
  private static final SubLSymbol $sym86$WNI_HYPONYMS;
  private static final SubLSymbol $sym87$WNI_HYPONYMS_HELPER;
  private static final SubLSymbol $sym88$_HYPONYM_SYNSET;
  private static final SubLSymbol $sym89$_WNI_HYPONYMS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym90$WNI_ALL_HYPONYMS;
  private static final SubLSymbol $sym91$WNI_ALL_HYPONYMS_HELPER;
  private static final SubLSymbol $sym92$_WNI_ALL_HYPONYMS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym93$WNI_ANY_HYPONYM_AN_INDIVIDUAL;
  private static final SubLSymbol $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_;
  private static final SubLObject $const95$Noun;
  private static final SubLSymbol $sym96$WNI_DERIVED_FORMS;
  private static final SubLSymbol $sym97$WNI_DERIVED_FORMS_HELPER;
  private static final SubLString $str98$SELECT_DISTINCT_synsetpointer_syn;
  private static final SubLString $str99$_AND____________________synsetpoi;
  private static final SubLSymbol $sym100$_WNI_DERIVED_FORMS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym101$WNI_SYNSET_GLOSS;
  private static final SubLSymbol $sym102$WNI_SYNSET_GLOSS_HELPER;
  private static final SubLObject $const103$wnSynsetGloss;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$_WNI_SYNSET_GLOSS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym107$WNI_SYNSET_POS;
  private static final SubLSymbol $sym108$WNI_SYNSET_POS_HELPER;
  private static final SubLObject $const109$wnSynsetSpeechPart;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$_WNI_SYNSET_POS_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym113$WNI_SYNSET_SPEECH_PART_OFFSET;
  private static final SubLSymbol $sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER;
  private static final SubLSymbol $sym115$POSITIVE_INTEGER_P;
  private static final SubLObject $const116$wnSynsetSpeechPartOffset;
  private static final SubLList $list117;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$_WNI_SYNSET_SPEECH_PART_OFFSET_HELPER_CACHING_STATE_;
  private static final SubLInteger $int120$256;
  private static final SubLSymbol $sym121$WNI_HYPERNYM_TERMS;
  private static final SubLSymbol $sym122$WNI_HYPERNYM_MAPPED_;
  private static final SubLSymbol $sym123$WNI_SYNSET_TERM;
  private static final SubLSymbol $sym124$WNI_SYNSET_TERM_HELPER;
  private static final SubLSymbol $sym125$INDEXED_TERM_P;
  private static final SubLObject $const126$synonymousExternalConcept;
  private static final SubLSymbol $sym127$_TERM;
  private static final SubLObject $const128$WordNet_Version2_0;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$_WNI_SYNSET_TERM_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym131$WNI_UNMAPPED_HYPERNYM_CHAIN;
  private static final SubLSymbol $sym132$WNI_SYNSET_W_O_LINKS;
  private static final SubLSymbol $sym133$WNI_SYNSET_W_O_LINKS_HELPER;
  private static final SubLString $str134$_;
  private static final SubLString $str135$___;
  private static final SubLString $str136$_;
  private static final SubLSymbol $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_;
  private static final SubLInteger $int138$100;
  private static final SubLSymbol $sym139$WNI_SYNSET_IS_CAUSER_;
  private static final SubLSymbol $sym140$WNI_SYNSETS_CAUSED_BY;
  private static final SubLSymbol $sym141$WNI_SYNSETS_CAUSED_BY_HELPER;
  private static final SubLObject $const142$wnCause;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$_WNI_SYNSETS_CAUSED_BY_HELPER_CACHING_STATE_;
  private static final SubLSymbol $sym145$WNI_SYNSET_IS_CAUSED_BY_;
  private static final SubLSymbol $sym146$WNI_SYNSETS_CAUSING;
  private static final SubLSymbol $sym147$WNI_SYNSETS_CAUSING_HELPER;
  private static final SubLSymbol $sym148$_CAUSING_SYNSET;
  private static final SubLSymbol $sym149$_WNI_SYNSETS_CAUSING_HELPER_CACHING_STATE_;
  private static final SubLString $str150$ancient;
  private static final SubLString $str151$Greek;
  private static final SubLString $str152$_;
  private static final SubLString $str153$Atlantic;
  private static final SubLString $str154$Pacific;
  private static final SubLString $str155$Crown_Colony;
  private static final SubLString $str156$Caribbean;
  private static final SubLString $str157$State;
  private static final SubLString $str158$Lake_Erie;
  private static final SubLString $str159$Asia_Minor;
  private static final SubLString $str160$Elbo_River;
  private static final SubLString $str161$Asian;
  private static final SubLString $str162$Yourba;
  private static final SubLString $str163$Japanese;
  private static final SubLString $str164$Nile;
  private static final SubLString $str165$River_Thames;
  private static final SubLString $str166$River_Aire;
  private static final SubLString $str167$_s;
  private static final SubLObject $const168$GeopoliticalEntity;
  private static final SubLObject $const169$City;
  private static final SubLSymbol $sym170$WNI_SYNSETS_HAVING_POS;
  private static final SubLSymbol $sym171$WNI_TERMS_SYNSETS;
  private static final SubLList $list172;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$_SPEECH_PART_OFFSET;
  private static final SubLSymbol $sym175$WNI_BROADER_TERMS;
  private static final SubLObject $const176$CycKBSubsetCollection;
  private static final SubLObject $const177$EverythingPSC;
  private static final SubLSymbol $sym178$_WNI_BROADER_TERMS_CACHING_STATE_;
  private static final SubLSymbol $sym179$WNI_MAPPED_TERMS_AND_SYNSETS;
  private static final SubLString $str180$finding_synsets_for_speech_part_o;
  private static final SubLSymbol $sym181$LISTP;
  private static final SubLSymbol $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_;
  private static final SubLSymbol $sym183$WNI_MAPPED_TERMS;
  private static final SubLList $list184;
  private static final SubLObject $const185$WordNetMappingMt;
  private static final SubLSymbol $sym186$WNI_MAPPED_TERMS_AND_POS_OFFSETS;
  private static final SubLList $list187;
  private static final SubLSymbol $sym188$WNI_SPEECH_PART_OFFSET_TO_SYNSET;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$WNI_UPDATE_SYNSET_WITH_TERM;
  private static final SubLList $list191;
  private static final SubLString $str192$update_Synset_set_cyc_term_____A_;
  private static final SubLSymbol $sym193$WNI_INSERT_CONCEPT_MATCH_HTML;
  private static final SubLString $str194$delete_from_ConceptMatchHTML_wher;
  private static final SubLString $str195$insert_into_ConceptMatchHTML_valu;
  private static final SubLString $str196$__;
  private static final SubLString $str197$_;
  private static final SubLSymbol $sym198$WNI_SELECT_CONCEPT_MATCH_HTML;
  private static final SubLString $str199$select_html_from_ConceptMatchHTML;
  private static final SubLSymbol $sym200$WNI_DELETE_CONCEPT_MATCH_HTML;
  private static final SubLSymbol $sym201$WNI_DELETE_ALL_CONCEPT_MATCH_HTML;
  private static final SubLString $str202$delete_from_ConceptMatchHTML_wher;
  private static final SubLSymbol $sym203$WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM;
  private static final SubLString $str204$select_Synset_synset_id__________;
  private static final SubLString $str205$__and____________________Synset_c;
  private static final SubLSymbol $sym206$HLMT_P;
  private static final SubLSymbol $sym207$PROPERTY_LIST_P;
  private static final SubLSymbol $sym208$QUERY_PROPERTY_P;
  private static final SubLSymbol $kw209$PROBLEM_STORE;
  private static final SubLString $str210$Destroying_invalid_WordNet_Import;
  private static final SubLFloat $float211$0_9;
  private static final SubLString $str212$Destroying_90___full_WordNet_Impo;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$NART_P;
  private static final SubLSymbol $sym215$WNI_REIFIABLE_SYNSET;
  private static final SubLObject $const216$WordNetSynsetReifiedFn;
  private static final SubLSymbol $sym217$WNI_REIFIABLE_SYNSET_FROM_STRING;
  private static final SubLSymbol $sym218$WNI_SYNSET_FROM_ID_STRING;
  private static final SubLSymbol $sym219$DIGIT_STRING_;
  private static final SubLSymbol $sym220$WNI_ENSURE_NAUT;
  private static final SubLSymbol $sym221$WNI_NEXT_SYNSET_WITH_STATUS;
  private static final SubLObject $const222$and;
  private static final SubLObject $const223$isa;
  private static final SubLSymbol $sym224$_REIFIED_SYNSET;
  private static final SubLList $list225;
  private static final SubLSymbol $sym226$WNI_UNLOCKED_SYNSETS_WITH_STATUS;
  private static final SubLSymbol $sym227$WNI_TERM_HAS_VERB_SEMTRANS_;
  private static final SubLSymbol $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_;
  private static final SubLSymbol $sym229$_WORD_UNIT;
  private static final SubLSymbol $sym230$_SENSE_NBR;
  private static final SubLObject $const231$denotation;
  private static final SubLObject $const232$Verb;
  private static final SubLObject $const233$unknownSentence;
  private static final SubLSymbol $sym234$_FRAME;
  private static final SubLSymbol $sym235$_TRANS;
  private static final SubLObject $const236$verbSemTrans_Canonical;
  private static final SubLList $list237;
  private static final SubLList $list238;
  private static final SubLList $list239;
  private static final SubLSymbol $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_;
  private static final SubLSymbol $sym241$WNI_GATHER_TERMS_FOR_MATCHING;
  private static final SubLSymbol $sym242$WNI_EXACT_SYNSET_TERM_MATCHES;
  private static final SubLString $str243$___A_mapped_hypernyms__A___A__;
  private static final SubLString $str244$__considering_word____a__;
  private static final SubLString $str245$____possible_lexical_matches__A__;
  private static final SubLString $str246$____considering_term____a___const;
  private static final SubLString $str247$___A_____A__structure___;
  private static final SubLString $str248$___A____A__lexicon___;
  private static final SubLSymbol $sym249$WNI_STRONG_SYNSET_TERM_MATCHES;
  private static final SubLSymbol $sym250$BOOLEANP;
  private static final SubLSymbol $kw251$NOUN;
  private static final SubLSymbol $kw252$ALL_NOUN_FORMS;
  private static final SubLSymbol $sym253$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLSymbol $sym254$SET_OR_COLLECTION_;
  private static final SubLSymbol $sym255$INDIVIDUAL_;
  private static final SubLSymbol $sym256$WNI_WEAK_SYNSET_TERM_MATCHES;
  private static final SubLSymbol $sym257$WNI_CREATE_NOW;
  private static final SubLSymbol $sym258$CONSTANT_P;
  private static final SubLSymbol $sym259$WNI_ASSERT_WFF;
  private static final SubLSymbol $sym260$CONSP;
  private static final SubLSymbol $sym261$DIRECTION_P;
  private static final SubLSymbol $sym262$EL_STRENGTH_P;
  private static final SubLSymbol $sym263$WNI_UNASSERT_IMPORT_STATUSES;
  private static final SubLSymbol $sym264$WNI_UNASSERT_IMPORT_STATUS;
  private static final SubLSymbol $sym265$WNI_ASSERT_IMPORT_STATUSES;
  private static final SubLSymbol $sym266$WNI_ASSERT_IMPORT_STATUS;
  private static final SubLSymbol $kw267$MONOTONIC;
  private static final SubLSymbol $kw268$FORWARD;
  private static final SubLSymbol $sym269$WNI_ASSERT_SYNSET_MAPPING;
  private static final SubLSymbol $sym270$WNI_ASSERT_LIKELY_SYNSET_MAPPING;
  private static final SubLObject $const271$wnLikelySynsetMapping;
  private static final SubLSymbol $sym272$WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT;
  private static final SubLObject $const273$quotedIsa;
  private static final SubLList $list274;
  private static final SubLObject $const275$BookkeepingMt;
  private static final SubLSymbol $sym276$WNI_ASSERT_ISA_COLLECTION;
  private static final SubLList $list277;
  private static final SubLObject $const278$UniversalVocabularyMt;
  private static final SubLSymbol $sym279$WNI_ASSERT_GENLS;
  private static final SubLObject $const280$genls;
  private static final SubLSymbol $sym281$WNI_UNASSERT_GENLS;
  private static final SubLSymbol $sym282$WNI_ASSERT_ISA;
  private static final SubLObject $const283$WordNetIndividualMappingMt;
  private static final SubLSymbol $sym284$WNI_ASSERT_ISA_INDIVIDUAL;
  private static final SubLList $list285;
  private static final SubLSymbol $sym286$WNI_ASSERT_ISA_AGENT_GENERIC;
  private static final SubLObject $const287$Agent_Generic;
  private static final SubLList $list288;
  private static final SubLSymbol $sym289$WNI_ASSERT_REIFIED_USING;
  private static final SubLObject $const290$reifiedUsingTool;
  private static final SubLList $list291;
  private static final SubLSymbol $sym292$WNI_SYNSET_NOTE;
  private static final SubLObject $const293$wnSynsetNote;
  private static final SubLList $list294;
  private static final SubLString $str295$;
  private static final SubLSymbol $sym296$WNI_ASSERT_SYNSET_NOTE;
  private static final SubLSymbol $sym297$WNI_UNASSERT_SYNSET_NOTE;
  private static final SubLSymbol $sym298$WNI_ASSERT_COMMENT;
  private static final SubLObject $const299$comment;
  private static final SubLSymbol $sym300$WNI_ASSERT_TERM_OF_UNIT;
  private static final SubLObject $const301$termOfUnit;
  private static final SubLObject $const302$BaseKB;
  private static final SubLSymbol $sym303$WNI_LOCK_SYNSET;
  private static final SubLObject $const304$wnWorkflowSynsetLock;
  private static final SubLSymbol $sym305$WNI_UNLOCK_SYNSET;
  private static final SubLList $list306;
  private static final SubLSymbol $sym307$WNI_ASSERT_HEURISTIC_LEXICON;
  private static final SubLSymbol $sym308$ALIST_P;
  private static final SubLList $list309;
  private static final SubLList $list310;
  private static final SubLList $list311;
  private static final SubLString $str312$_included;
  private static final SubLList $list313;
  private static final SubLList $list314;
  private static final SubLList $list315;
  private static final SubLString $str316$WordNet_individual_synset__A_must;
  private static final SubLObject $const317$BiologicalSpecies;
  private static final SubLObject $const318$scientificName;
  private static final SubLObject $const319$NewLatinLexicalMt;
  private static final SubLList $list320;
  private static final SubLList $list321;
  private static final SubLObject $const322$TheList;
  private static final SubLObject $const323$GeneralEnglishMt;
  private static final SubLObject $const324$hyphenString;
  private static final SubLObject $const325$TemporaryLexicalAssertions_WordNe;
  private static final SubLString $str326$_count_noun;
  private static final SubLString $str327$headword_is_first;
  private static final SubLObject $const328$multiWordString;
  private static final SubLObject $const329$compoundString;
  private static final SubLString $str330$must_have_an_existing_word_unit_f;
  private static final SubLSymbol $sym331$_WORD_SENSE;
  private static final SubLString $str332$must_have_an_existing_word_sense_;
  private static final SubLObject $const333$politenessOfWS;
  private static final SubLObject $const334$formalityOfWS;
  private static final SubLObject $const335$rhetoricalDeviceOfPhrase;
  private static final SubLString $str336$_politeness;
  private static final SubLString $str337$polite;
  private static final SubLObject $const338$PoliteSpeech;
  private static final SubLString $str339$rude;
  private static final SubLObject $const340$RudeSpeech;
  private static final SubLString $str341$vulgar;
  private static final SubLObject $const342$VulgarSpeech;
  private static final SubLString $str343$_formality;
  private static final SubLString $str344$archaic;
  private static final SubLObject $const345$ArchaicSpeech;
  private static final SubLString $str346$slang;
  private static final SubLObject $const347$SlangSpeech;
  private static final SubLString $str348$formal;
  private static final SubLObject $const349$FormalSpeech;
  private static final SubLString $str350$informal;
  private static final SubLObject $const351$InformalSpeech;
  private static final SubLString $str352$baby_talk;
  private static final SubLObject $const353$BabyTalk;
  private static final SubLString $str354$technical_jargon;
  private static final SubLObject $const355$Jargon;
  private static final SubLString $str356$_rhetorical_device;
  private static final SubLString $str357$metaphor;
  private static final SubLObject $const358$MetaphoricalSpeech;
  private static final SubLString $str359$simile;
  private static final SubLObject $const360$Simile_FigureOfSpeech;
  private static final SubLString $str361$euphemism;
  private static final SubLObject $const362$EuphemisticSpeech;
  private static final SubLObject $const363$nameString;
  private static final SubLObject $const364$familyName;
  private static final SubLString $str365$Mrs_;
  private static final SubLString $str366$Sir_;
  private static final SubLString $str367$_Jr_;
  private static final SubLString $str368$President_;
  private static final SubLObject $const369$givenNames;
  private static final SubLObject $const370$middleName;
  private static final SubLObject $const371$pseudonym;
  private static final SubLObject $const372$placeName_Standard;
  private static final SubLObject $const373$placeName_ShortForm;
  private static final SubLObject $const374$acronymString;
  private static final SubLObject $const375$initialismString;
  private static final SubLString $str376$ing;
  private static final SubLObject $const377$GerundiveNoun;
  private static final SubLString $str378$t;
  private static final SubLObject $const379$ProperCountNoun;
  private static final SubLObject $const380$ProperMassNoun;
  private static final SubLObject $const381$CountNoun;
  private static final SubLObject $const382$MassNoun;
  private static final SubLSymbol $sym383$WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS;
  private static final SubLString $str384$Counting_recent_WordNet_mappings;
  private static final SubLInteger $int385$20050101;
  private static final SubLSymbol $sym386$WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET;
  private static final SubLObject $const387$WordNetWorkflowConstant_NotFullyR;
  private static final SubLString $str388$Counting_terms_imported_from_Word;
  private static final SubLObject $const389$SteveReed;
  private static final SubLObject $const390$CycWordNetImportTool;
  private static final SubLSymbol $sym391$WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET;
  private static final SubLString $str392$Counting_recent_denotations_impor;
  private static final SubLSymbol $sym393$WNI_ROLE_INFO;
  private static final SubLSymbol $sym394$WNI_ROLE_INFO_P;
  private static final SubLList $list395;
  private static final SubLList $list396;
  private static final SubLList $list397;
  private static final SubLList $list398;
  private static final SubLSymbol $sym399$WNI_PRINT_ROLE_INFO;
  private static final SubLSymbol $sym400$WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list401;
  private static final SubLSymbol $sym402$WNI_ROLE;
  private static final SubLSymbol $sym403$_CSETF_WNI_ROLE;
  private static final SubLSymbol $sym404$WNI_FILLER;
  private static final SubLSymbol $sym405$_CSETF_WNI_FILLER;
  private static final SubLSymbol $sym406$WNI_DEFINING_COL;
  private static final SubLSymbol $sym407$_CSETF_WNI_DEFINING_COL;
  private static final SubLSymbol $sym408$WNI_DEFINING_PRED;
  private static final SubLSymbol $sym409$_CSETF_WNI_DEFINING_PRED;
  private static final SubLSymbol $sym410$WNI_SUBSUMPTION_STATUS;
  private static final SubLSymbol $sym411$_CSETF_WNI_SUBSUMPTION_STATUS;
  private static final SubLSymbol $kw412$ROLE;
  private static final SubLSymbol $kw413$FILLER;
  private static final SubLSymbol $kw414$DEFINING_COL;
  private static final SubLSymbol $kw415$DEFINING_PRED;
  private static final SubLSymbol $kw416$SUBSUMPTION_STATUS;
  private static final SubLString $str417$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw418$BEGIN;
  private static final SubLSymbol $sym419$MAKE_WNI_ROLE_INFO;
  private static final SubLSymbol $kw420$SLOT;
  private static final SubLSymbol $kw421$END;
  private static final SubLSymbol $sym422$VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD;
  private static final SubLSymbol $sym423$STREAMP;
  private static final SubLString $str424$_ROLE_INFO___s__s__s__s__s_;
  private static final SubLSymbol $sym425$WNI_GATHER_ROLES_AND_TRAITS;
  private static final SubLSymbol $sym426$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym427$WNI_FIND_COMPATIBLE_ROLES;
  private static final SubLObject $const428$genlPredsWRTTypes;
  private static final SubLList $list429;
  private static final SubLList $list430;
  private static final SubLList $list431;
  private static final SubLList $list432;
  private static final SubLList $list433;
  private static final SubLObject $const434$or;
  private static final SubLObject $const435$interArgIsa1_2;
  private static final SubLSymbol $sym436$_ROLE;
  private static final SubLList $list437;
  private static final SubLSymbol $sym438$_FILLER_2;
  private static final SubLList $list439;
  private static final SubLList $list440;
  private static final SubLList $list441;
  private static final SubLSymbol $sym442$_COLL;
  private static final SubLList $list443;
  private static final SubLSymbol $sym444$_THING;
  private static final SubLList $list445;
  private static final SubLSymbol $sym446$_ROLE2;
  private static final SubLObject $const447$assertedSentence;
  private static final SubLObject $const448$equals;
  private static final SubLSymbol $sym449$_DEFINING_COLL;
  private static final SubLList $list450;
  private static final SubLList $list451;
  private static final SubLList $list452;
  private static final SubLList $list453;
  private static final SubLString $str454$_A;
  private static final SubLSymbol $sym455$STRING_LESSP;
  private static final SubLSymbol $sym456$WNI_SORT_KEY_1;
  private static final SubLSymbol $sym457$WNI_CLEAR_FUNCTION_CACHES;
  private static final SubLString $str458$in_workflow_;
  private static final SubLString $str459$nil;
  private static final SubLString $str460$unmapped_hypernym_chain;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 1718L)
  public static SubLObject initialize_wordnet_import_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $wordnet_import_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_wordnet_import_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_wordnet_import_kb_loaded();
    }
    return kb_control_vars.wordnet_import_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
  public static SubLObject clear_wni_unranked_synsets_for_english_word_string()
  {
    final SubLObject cs = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
  public static SubLObject remove_wni_unranked_synsets_for_english_word_string(final SubLObject word_string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue(), ConsesLow.list( word_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
  public static SubLObject wni_unranked_synsets_for_english_word_string_internal(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    SubLObject synsets = NIL;
    final SubLObject sentence = ConsesLow.list( $const6$wnSynsetMemberWord, $sym7$_SYNSET, ConsesLow.list( $const8$WordNetEnglishWordFn, word_string ) );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synsets = ConsesLow.cons( result.first().rest(), synsets );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
  public static SubLObject wni_unranked_synsets_for_english_word_string(final SubLObject word_string)
  {
    SubLObject caching_state = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING, $sym13$_WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_, TEN_INTEGER, EQUAL,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_unranked_synsets_for_english_word_string_internal( word_string ) ) );
      memoization_state.caching_state_put( caching_state, word_string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
  public static SubLObject clear_wni_synsets_for_english_word_stringXpos()
  {
    final SubLObject cs = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
  public static SubLObject remove_wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue(), ConsesLow.list( word_string, speech_part ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
  public static SubLObject wni_synsets_for_english_word_stringXpos_internal(final SubLObject word_string, final SubLObject speech_part)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    SubLObject synsets = NIL;
    final SubLObject pos = Strings.string_downcase( list_utilities.alist_lookup_without_values( $wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    final SubLObject sql_query = Sequences.cconcatenate( $str15$select_synset_id_from_WordSense_w, new SubLObject[] { word_string, $str16$__and_pos____, pos, $str17$__order_by_word_sense
    } );
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.list( new SubLObject[] { $kw18$DBMS_SERVER, wni_access_path_server(), $kw19$PORT,
        wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $kw22$TIMEOUT, THREE_INTEGER
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, sql_query, UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          synsets = ConsesLow.cons( ConsesLow.list( $const23$WordNetSynsetFn, sdbc.sqlrs_get_object( rs, ONE_INTEGER ) ), synsets );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    final SubLObject list_var;
    synsets = ( list_var = Sequences.nreverse( synsets ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
  public static SubLObject wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part)
  {
    SubLObject caching_state = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS, $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_, TEN_INTEGER, EQUAL,
          TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word_string, speech_part );
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
        if( word_string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && speech_part.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synsets_for_english_word_stringXpos_internal( word_string, speech_part ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_string, speech_part ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
  public static SubLObject clear_wni_synsets_for_english_word_string()
  {
    final SubLObject cs = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
  public static SubLObject remove_wni_synsets_for_english_word_string(final SubLObject word_string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synsets_for_english_word_string_caching_state$.getGlobalValue(), ConsesLow.list( word_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
  public static SubLObject wni_synsets_for_english_word_string_internal(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    if( NIL == sksi_infrastructure_utilities.sk_source_registeredP( $const26$WordNet2_0_KS, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject synsets = NIL;
    final SubLObject sql_query = Sequences.cconcatenate( $str15$select_synset_id_from_WordSense_w, new SubLObject[] { word_string, $str27$__order_by_pos__word_sense
    } );
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.list( new SubLObject[] { $kw18$DBMS_SERVER, wni_access_path_server(), $kw19$PORT,
        wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $kw22$TIMEOUT, THREE_INTEGER
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, sql_query, UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          synsets = ConsesLow.cons( ConsesLow.list( $const23$WordNetSynsetFn, sdbc.sqlrs_get_object( rs, ONE_INTEGER ) ), synsets );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    final SubLObject list_var;
    synsets = ( list_var = Sequences.nreverse( synsets ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
  public static SubLObject wni_synsets_for_english_word_string(final SubLObject word_string)
  {
    SubLObject caching_state = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING, $sym28$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synsets_for_english_word_string_internal( word_string ) ) );
      memoization_state.caching_state_put( caching_state, word_string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
  public static SubLObject clear_wni_synset_collectionP()
  {
    final SubLObject cs = $wni_synset_collectionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
  public static SubLObject remove_wni_synset_collectionP(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_collectionP_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
  public static SubLObject wni_synset_collectionP_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject v_term = wni_synset_term( synset );
    if( NIL != v_term )
    {
      return fort_types_interface.collectionP( v_term );
    }
    final SubLObject reified_synset = czer_main.canonicalize_term( wni_reifiable_synset( synset ), UNPROVIDED );
    if( NIL != nart_handles.nart_p( reified_synset ) )
    {
      return makeBoolean( NIL == isa.isaP( reified_synset, $const30$WordNetSynsetImportStatus_Determi, $const31$WordNetWorkflowDataStatusMt, UNPROVIDED ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
  public static SubLObject wni_synset_collectionP(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_collectionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$WNI_SYNSET_COLLECTION_, $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_collectionP_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6704L)
  public static SubLObject wni_synset_individuals()
  {
    final SubLObject list_var;
    final SubLObject individual_synsets = list_var = Mapping.mapcar( $sym34$WNI_UNREIFIED_SYNSET, isa.instances( $const30$WordNetSynsetImportStatus_Determi, $const31$WordNetWorkflowDataStatusMt, UNPROVIDED ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return individual_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 7075L)
  public static SubLObject wni_exclude_situations(final SubLObject synsets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( synsets ) : synsets;
    SubLObject cdolist_list_var = synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject non_situation_synsets = NIL;
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
      utilities_macros.$progress_note$.bind( $str36$excluding_specs_of___Situation, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( synsets ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = synsets;
        SubLObject synset = NIL;
        synset = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == genls.any_specP( $const38$Situation, wni_hypernym_terms( synset ), UNPROVIDED, UNPROVIDED ) )
          {
            non_situation_synsets = ConsesLow.cons( synset, non_situation_synsets );
          }
          streams_high.force_output( UNPROVIDED );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          synset = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
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
    final SubLObject list_var_$2;
    non_situation_synsets = ( list_var_$2 = Sequences.nreverse( non_situation_synsets ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var_$2 ) : list_var_$2;
    SubLObject cdolist_list_var2 = list_var_$2;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem2 ) : elem2;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem2 = cdolist_list_var2.first();
    }
    return non_situation_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 7718L)
  public static SubLObject wni_exclude_relations(final SubLObject synsets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( synsets ) : synsets;
    SubLObject cdolist_list_var = synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject non_relation_synsets = NIL;
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
      utilities_macros.$progress_note$.bind( $str40$excluding_specs_of___Relation, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( synsets ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = synsets;
        SubLObject synset = NIL;
        synset = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == genls.any_specP( $const41$Relation, wni_hypernym_terms( synset ), UNPROVIDED, UNPROVIDED ) )
          {
            non_relation_synsets = ConsesLow.cons( synset, non_relation_synsets );
          }
          streams_high.force_output( UNPROVIDED );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          synset = csome_list_var.first();
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
    final SubLObject list_var_$4;
    non_relation_synsets = ( list_var_$4 = Sequences.nreverse( non_relation_synsets ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var_$4 ) : list_var_$4;
    SubLObject cdolist_list_var2 = list_var_$4;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem2 ) : elem2;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem2 = cdolist_list_var2.first();
    }
    return non_relation_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 8351L)
  public static SubLObject wni_exclude_skipped(final SubLObject synsets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( synsets ) : synsets;
    SubLObject cdolist_list_var = synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject non_skipped_synsets = NIL;
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
      utilities_macros.$progress_note$.bind( $str43$excluding_skipped_synsets, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( synsets ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = synsets;
        SubLObject synset = NIL;
        synset = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == isa.isaP( wni_reifiable_synset( synset ), $const44$WordNetSynsetImportStatus_Skip, $const10$WordNetWorkflowCollectorMt, UNPROVIDED ) )
          {
            non_skipped_synsets = ConsesLow.cons( synset, non_skipped_synsets );
          }
          streams_high.force_output( UNPROVIDED );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          synset = csome_list_var.first();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    final SubLObject list_var_$6;
    non_skipped_synsets = ( list_var_$6 = Sequences.nreverse( non_skipped_synsets ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var_$6 ) : list_var_$6;
    SubLObject cdolist_list_var2 = list_var_$6;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem2 ) : elem2;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem2 = cdolist_list_var2.first();
    }
    return non_skipped_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 8999L)
  public static SubLObject wni_synset_id(final SubLObject synset)
  {
    assert NIL != el_utilities.possibly_naut_p( synset ) : synset;
    final SubLObject synset_id = conses_high.second( synset );
    assert NIL != Types.integerp( synset_id ) : synset_id;
    return synset_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9341L)
  public static SubLObject wni_synset_words(final SubLObject synset)
  {
    return wni_synset_words_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9595L)
  public static SubLObject wni_synsets_equal(final SubLObject synset_1, final SubLObject synset_2)
  {
    return Equality.equal( wni_ensure_naut( synset_1 ), wni_ensure_naut( synset_2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
  public static SubLObject clear_wni_synset_words_helper()
  {
    final SubLObject cs = $wni_synset_words_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
  public static SubLObject remove_wni_synset_words_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_words_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
  public static SubLObject wni_synset_words_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject words_and_indices = NIL;
    SubLObject words = NIL;
    final SubLObject sentence = ConsesLow.list( $const51$thereExists, $sym52$_POS, ConsesLow.list( $const51$thereExists, $sym53$_SENSE, ConsesLow.listS( $const54$wnSynsetWord, synset, $list55 ) ) );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words_and_indices = ConsesLow.cons( ConsesLow.list( result.first().rest(), conses_high.second( result ).rest() ), words_and_indices );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    cdolist_list_var = Sort.sort( words_and_indices, Symbols.symbol_function( $sym56$_ ), Symbols.symbol_function( $sym57$SECOND ) );
    SubLObject word_and_index = NIL;
    word_and_index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words = ConsesLow.cons( word_and_index.first(), words );
      cdolist_list_var = cdolist_list_var.rest();
      word_and_index = cdolist_list_var.first();
    }
    final SubLObject list_var;
    words = ( list_var = Sequences.nreverse( words ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
  public static SubLObject wni_synset_words_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_words_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym50$WNI_SYNSET_WORDS_HELPER, $sym58$_WNI_SYNSET_WORDS_HELPER_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_words_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11089L)
  public static SubLObject wni_synset_example_phrases(final SubLObject synset)
  {
    return wni_synset_example_phrases_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
  public static SubLObject clear_wni_synset_example_phrases_helper()
  {
    final SubLObject cs = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
  public static SubLObject remove_wni_synset_example_phrases_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_example_phrases_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
  public static SubLObject wni_synset_example_phrases_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject example_phrases_and_indices = NIL;
    SubLObject example_phrases = NIL;
    final SubLObject sentence = ConsesLow.listS( $const61$wnSynsetExamplePhraseWithPosition, synset, $list62 );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      example_phrases_and_indices = ConsesLow.cons( ConsesLow.list( result.first().rest(), conses_high.second( result ).rest() ), example_phrases_and_indices );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    cdolist_list_var = Sort.sort( example_phrases_and_indices, Symbols.symbol_function( $sym56$_ ), Symbols.symbol_function( $sym63$FIRST ) );
    SubLObject example_phrase_and_index = NIL;
    example_phrase_and_index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      example_phrases = ConsesLow.cons( conses_high.second( example_phrase_and_index ), example_phrases );
      cdolist_list_var = cdolist_list_var.rest();
      example_phrase_and_index = cdolist_list_var.first();
    }
    final SubLObject list_var;
    example_phrases = ( list_var = Sequences.nreverse( example_phrases ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return example_phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
  public static SubLObject wni_synset_example_phrases_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER, $sym64$_WNI_SYNSET_EXAMPLE_PHRASES_HELPER_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_example_phrases_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 13334L)
  public static SubLObject wni_most_general_synset_verb_frame(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject verb_frames = wni_synset_verb_frames( synset );
    SubLObject most_general_verb_frame_score = NIL;
    SubLObject most_general_verb_frame = NIL;
    if( NIL == verb_frames )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = verb_frames;
    SubLObject verb_frame = NIL;
    verb_frame = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject verb_frame_score = list_utilities.alist_lookup_without_values( $wni_verb_frame_generalities$.getGlobalValue(), verb_frame, Symbols.symbol_function( EQL ), $wni_least_general_frame_generality_score$
          .getGlobalValue() );
      if( NIL == most_general_verb_frame || verb_frame_score.numL( most_general_verb_frame_score ) )
      {
        most_general_verb_frame = verb_frame;
        most_general_verb_frame_score = verb_frame_score;
      }
      cdolist_list_var = cdolist_list_var.rest();
      verb_frame = cdolist_list_var.first();
    }
    if( NIL != most_general_verb_frame && !assertionsDisabledInClass && NIL == forts.fort_p( most_general_verb_frame ) )
    {
      throw new AssertionError( most_general_verb_frame );
    }
    return most_general_verb_frame;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14260L)
  public static SubLObject wni_synset_verb_frames(final SubLObject synset)
  {
    return wni_synset_verb_frames_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
  public static SubLObject clear_wni_synset_verb_frames_helper()
  {
    final SubLObject cs = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
  public static SubLObject remove_wni_synset_verb_frames_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_verb_frames_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
  public static SubLObject wni_synset_verb_frames_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject sentence = ConsesLow.listS( $const70$wnSynsetVerbFrame, synset, $list71 );
    final SubLObject query_properties = $list72;
    final SubLObject query_result = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject verb_frames = NIL;
    SubLObject cdolist_list_var = query_result;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.fort_p( binding ) )
      {
        verb_frames = ConsesLow.cons( binding, verb_frames );
      }
      else if( NIL != el_utilities.possibly_naut_p( binding ) )
      {
        SubLObject cdolist_list_var_$7 = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut( binding );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          if( NIL != forts.fort_p( v_term ) )
          {
            verb_frames = ConsesLow.cons( v_term, verb_frames );
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          v_term = cdolist_list_var_$7.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    final SubLObject list_var = verb_frames;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return verb_frames;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
  public static SubLObject wni_synset_verb_frames_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym69$WNI_SYNSET_VERB_FRAMES_HELPER, $sym73$_WNI_SYNSET_VERB_FRAMES_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_verb_frames_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
  public static SubLObject clear_wni_verb_frames_for_word()
  {
    final SubLObject cs = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
  public static SubLObject remove_wni_verb_frames_for_word(final SubLObject verb)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_verb_frames_for_word_caching_state$.getGlobalValue(), ConsesLow.list( verb ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
  public static SubLObject wni_verb_frames_for_word_internal(final SubLObject verb)
  {
    assert NIL != Types.stringp( verb ) : verb;
    SubLObject verb_frames = NIL;
    final SubLObject sentence = ConsesLow.listS( $const70$wnSynsetVerbFrame, ConsesLow.list( $const8$WordNetEnglishWordFn, verb ), $list71 );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      verb_frames = ConsesLow.cons( result.first().rest(), verb_frames );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = verb_frames;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return verb_frames;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
  public static SubLObject wni_verb_frames_for_word(final SubLObject verb)
  {
    SubLObject caching_state = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym75$WNI_VERB_FRAMES_FOR_WORD, $sym76$_WNI_VERB_FRAMES_FOR_WORD_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, verb, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_verb_frames_for_word_internal( verb ) ) );
      memoization_state.caching_state_put( caching_state, verb, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16550L)
  public static SubLObject wni_hypernyms(final SubLObject synset)
  {
    return wni_hypernyms_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
  public static SubLObject clear_wni_hypernyms_helper()
  {
    final SubLObject cs = $wni_hypernyms_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
  public static SubLObject remove_wni_hypernyms_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_hypernyms_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
  public static SubLObject wni_hypernyms_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject hypernyms = NIL;
    final SubLObject sentence = ConsesLow.listS( $const79$wnHypernym, synset, $list80 );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hypernyms = ConsesLow.cons( wni_ensure_naut( result.first().rest() ), hypernyms );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = hypernyms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return hypernyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
  public static SubLObject wni_hypernyms_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_hypernyms_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$WNI_HYPERNYMS_HELPER, $sym81$_WNI_HYPERNYMS_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_hypernyms_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17699L)
  public static SubLObject wni_all_hypernyms(final SubLObject synset)
  {
    return wni_all_hypernyms_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
  public static SubLObject clear_wni_all_hypernyms_helper()
  {
    final SubLObject cs = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
  public static SubLObject remove_wni_all_hypernyms_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_all_hypernyms_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
  public static SubLObject wni_all_hypernyms_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject all_hypernyms = NIL;
    for( SubLObject hypernym = NIL, synsets_stack = wni_hypernyms( synset ); NIL != synsets_stack; synsets_stack = ConsesLow.append( synsets_stack, wni_hypernyms( hypernym ) ) )
    {
      hypernym = synsets_stack.first();
      synsets_stack = synsets_stack.rest();
      final SubLObject item_var = hypernym;
      if( NIL == conses_high.member( item_var, all_hypernyms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_hypernyms = ConsesLow.cons( item_var, all_hypernyms );
      }
    }
    final SubLObject list_var = all_hypernyms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return all_hypernyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
  public static SubLObject wni_all_hypernyms_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym83$WNI_ALL_HYPERNYMS_HELPER, $sym84$_WNI_ALL_HYPERNYMS_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_all_hypernyms_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 18619L)
  public static SubLObject wni_all_hypernymP(final SubLObject synset, final SubLObject hypernym)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != narts_high.naut_p( hypernym ) : hypernym;
    for( SubLObject temp_hypernym = NIL, synsets_stack = wni_hypernyms( synset ); NIL != synsets_stack; synsets_stack = ConsesLow.append( synsets_stack, wni_hypernyms( temp_hypernym ) ) )
    {
      temp_hypernym = synsets_stack.first();
      synsets_stack = synsets_stack.rest();
      if( wni_ensure_naut( temp_hypernym ).equal( wni_ensure_naut( hypernym ) ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19233L)
  public static SubLObject wni_hyponyms(final SubLObject synset)
  {
    return wni_hyponyms_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
  public static SubLObject clear_wni_hyponyms_helper()
  {
    final SubLObject cs = $wni_hyponyms_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
  public static SubLObject remove_wni_hyponyms_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_hyponyms_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
  public static SubLObject wni_hyponyms_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject hyponyms = NIL;
    final SubLObject sentence = ConsesLow.list( $const79$wnHypernym, $sym88$_HYPONYM_SYNSET, synset );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hyponyms = ConsesLow.cons( wni_ensure_naut( result.first().rest() ), hyponyms );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = hyponyms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return hyponyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
  public static SubLObject wni_hyponyms_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_hyponyms_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym87$WNI_HYPONYMS_HELPER, $sym89$_WNI_HYPONYMS_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_hyponyms_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20372L)
  public static SubLObject wni_all_hyponyms(final SubLObject synset)
  {
    return wni_all_hyponyms_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
  public static SubLObject clear_wni_all_hyponyms_helper()
  {
    final SubLObject cs = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
  public static SubLObject remove_wni_all_hyponyms_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_all_hyponyms_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
  public static SubLObject wni_all_hyponyms_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject all_hyponyms = NIL;
    for( SubLObject hyponym = NIL, synsets_stack = wni_hyponyms( synset ); NIL != synsets_stack; synsets_stack = ConsesLow.append( synsets_stack, wni_hyponyms( hyponym ) ) )
    {
      hyponym = synsets_stack.first();
      synsets_stack = synsets_stack.rest();
      final SubLObject item_var = hyponym;
      if( NIL == conses_high.member( item_var, all_hyponyms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        all_hyponyms = ConsesLow.cons( item_var, all_hyponyms );
      }
    }
    final SubLObject list_var = all_hyponyms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return all_hyponyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
  public static SubLObject wni_all_hyponyms_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym91$WNI_ALL_HYPONYMS_HELPER, $sym92$_WNI_ALL_HYPONYMS_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_all_hyponyms_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 21275L)
  public static SubLObject wni_any_hyponym_an_individual(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject cdolist_list_var;
    final SubLObject hyponyms = cdolist_list_var = wni_hyponyms( synset );
    SubLObject hyponym = NIL;
    hyponym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == wni_synset_collectionP( hyponym ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      hyponym = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 21648L)
  public static SubLObject wni_verb_is_derived_from_situation_nounP(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject cdolist_list_var;
    final SubLObject derived_forms = cdolist_list_var = wni_derived_forms( synset );
    SubLObject derived_form = NIL;
    derived_form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $const95$Noun.eql( wni_synset_pos( derived_form ) ) && NIL != genls.any_specP( $const38$Situation, wni_hypernym_terms( derived_form ), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      derived_form = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22212L)
  public static SubLObject wni_derived_forms(final SubLObject synset)
  {
    return wni_derived_forms_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
  public static SubLObject clear_wni_derived_forms_helper()
  {
    final SubLObject cs = $wni_derived_forms_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
  public static SubLObject remove_wni_derived_forms_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_derived_forms_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
  public static SubLObject wni_derived_forms_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject sql_query = Sequences.cconcatenate( $str98$SELECT_DISTINCT_synsetpointer_syn, new SubLObject[] { string_utilities.to_string( wni_synset_id( synset ) ), $str99$_AND____________________synsetpoi
    } );
    SubLObject synsets = NIL;
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.list( new SubLObject[] { $kw18$DBMS_SERVER, wni_access_path_server(), $kw19$PORT,
        wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $kw22$TIMEOUT, THREE_INTEGER
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, sql_query, UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          synsets = ConsesLow.cons( ConsesLow.list( $const23$WordNetSynsetFn, sdbc.sqlrs_get_object( rs, ONE_INTEGER ) ), synsets );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
  public static SubLObject wni_derived_forms_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_derived_forms_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym97$WNI_DERIVED_FORMS_HELPER, $sym100$_WNI_DERIVED_FORMS_HELPER_CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_derived_forms_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23638L)
  public static SubLObject wni_synset_gloss(final SubLObject synset)
  {
    return wni_synset_gloss_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
  public static SubLObject clear_wni_synset_gloss_helper()
  {
    final SubLObject cs = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
  public static SubLObject remove_wni_synset_gloss_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_gloss_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
  public static SubLObject wni_synset_gloss_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject gloss = NIL;
    final SubLObject sentence = ConsesLow.listS( $const103$wnSynsetGloss, synset, $list104 );
    final SubLObject query_properties = $list105;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    gloss = results.first();
    if( NIL != gloss && !assertionsDisabledInClass && NIL == Types.stringp( gloss ) )
    {
      throw new AssertionError( gloss );
    }
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
  public static SubLObject wni_synset_gloss_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym102$WNI_SYNSET_GLOSS_HELPER, $sym106$_WNI_SYNSET_GLOSS_HELPER_CACHING_STATE_, TEN_INTEGER, EQUALP, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_gloss_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 24848L)
  public static SubLObject wni_synset_pos(final SubLObject synset)
  {
    return wni_synset_pos_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
  public static SubLObject clear_wni_synset_pos_helper()
  {
    final SubLObject cs = $wni_synset_pos_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
  public static SubLObject remove_wni_synset_pos_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_pos_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
  public static SubLObject wni_synset_pos_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject pos = NIL;
    final SubLObject sentence = ConsesLow.listS( $const109$wnSynsetSpeechPart, synset, $list110 );
    final SubLObject query_properties = $list111;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    pos = results.first();
    if( NIL != pos && !assertionsDisabledInClass && NIL == forts.fort_p( pos ) )
    {
      throw new AssertionError( pos );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
  public static SubLObject wni_synset_pos_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_pos_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym108$WNI_SYNSET_POS_HELPER, $sym112$_WNI_SYNSET_POS_HELPER_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_pos_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26044L)
  public static SubLObject wni_synset_speech_part_offset(final SubLObject synset)
  {
    return wni_synset_speech_part_offset_helper( cycl_utilities.nat_functor( synset ), wni_synset_id( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
  public static SubLObject clear_wni_synset_speech_part_offset_helper()
  {
    final SubLObject cs = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
  public static SubLObject remove_wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue(), ConsesLow.list( functor, synset_id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
  public static SubLObject wni_synset_speech_part_offset_helper_internal(final SubLObject functor, final SubLObject synset_id)
  {
    assert NIL != forts.fort_p( functor ) : functor;
    assert NIL != subl_promotions.positive_integer_p( synset_id ) : synset_id;
    final SubLObject synset = el_utilities.make_unary_formula( functor, synset_id );
    final SubLObject sentence = ConsesLow.listS( $const116$wnSynsetSpeechPartOffset, synset, $list117 );
    final SubLObject query_properties = $list118;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject speech_part_offset = NIL;
    speech_part_offset = results.first();
    if( NIL == speech_part_offset && NIL == inference_datastructures_problem_store.problem_store_p( wni_problem_store() ) )
    {
      Threads.sleep( FIVE_INTEGER );
      speech_part_offset = wni_synset_speech_part_offset( synset );
    }
    assert NIL != Types.stringp( speech_part_offset ) : speech_part_offset;
    return speech_part_offset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
  public static SubLObject wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id)
  {
    SubLObject caching_state = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER, $sym119$_WNI_SYNSET_SPEECH_PART_OFFSET_HELPER_CACHING_STATE_, $int120$256, EQL, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( functor, synset_id );
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
        if( functor.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && synset_id.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_speech_part_offset_helper_internal( functor, synset_id ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( functor, synset_id ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 27905L)
  public static SubLObject wni_hypernym_terms(final SubLObject synset)
  {
    assert NIL != el_utilities.possibly_naut_p( synset ) : synset;
    SubLObject hypernym_terms = NIL;
    SubLObject hypernym_term = NIL;
    SubLObject cdolist_list_var;
    final SubLObject hypernyms = cdolist_list_var = wni_hypernyms( synset );
    SubLObject hypernym = NIL;
    hypernym = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hypernym_term = wni_synset_term( hypernym );
      if( NIL != hypernym_term && NIL != fort_types_interface.collectionP( hypernym_term ) )
      {
        hypernym_terms = ConsesLow.cons( hypernym_term, hypernym_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      hypernym = cdolist_list_var.first();
    }
    final SubLObject list_var = hypernym_terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return hypernym_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 28501L)
  public static SubLObject wni_hypernym_mappedP(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    return list_utilities.sublisp_boolean( wni_hypernym_terms( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 28752L)
  public static SubLObject wni_synset_term(final SubLObject synset)
  {
    return wni_synset_term_helper( cycl_utilities.nat_functor( synset ), wni_synset_id( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
  public static SubLObject clear_wni_synset_term_helper()
  {
    final SubLObject cs = $wni_synset_term_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
  public static SubLObject remove_wni_synset_term_helper(final SubLObject functor, final SubLObject id)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_term_helper_caching_state$.getGlobalValue(), ConsesLow.list( functor, id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
  public static SubLObject wni_synset_term_helper_internal(final SubLObject functor, final SubLObject id)
  {
    assert NIL != kb_indexing_datastructures.indexed_term_p( functor ) : functor;
    assert NIL != subl_promotions.positive_integer_p( id ) : id;
    final SubLObject speech_part_offset = wni_synset_speech_part_offset_helper( functor, id );
    final SubLObject sentence = ConsesLow.list( $const126$synonymousExternalConcept, $sym127$_TERM, $const128$WordNet_Version2_0, speech_part_offset );
    final SubLObject query_properties = $list129;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject v_term = results.first();
    if( NIL == forts.fort_p( v_term ) )
    {
      v_term = NIL;
    }
    if( NIL != v_term && !assertionsDisabledInClass && NIL == forts.fort_p( v_term ) )
    {
      throw new AssertionError( v_term );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
  public static SubLObject wni_synset_term_helper(final SubLObject functor, final SubLObject id)
  {
    SubLObject caching_state = $wni_synset_term_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym124$WNI_SYNSET_TERM_HELPER, $sym130$_WNI_SYNSET_TERM_HELPER_CACHING_STATE_, $int74$1000, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( functor, id );
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
        if( functor.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && id.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_term_helper_internal( functor, id ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( functor, id ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 30227L)
  public static SubLObject wni_unmapped_hypernym_chain(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject unmapped_hypernym_chain = ConsesLow.list( synset );
    SubLObject hypernym = wni_ensure_naut( synset );
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      hypernym = wni_hypernyms( hypernym ).first();
      if( NIL != hypernym )
      {
        if( NIL != wni_synset_term( hypernym ) )
        {
          doneP = T;
        }
        else
        {
          unmapped_hypernym_chain = ConsesLow.cons( hypernym, unmapped_hypernym_chain );
        }
      }
      else
      {
        doneP = T;
      }
    }
    final SubLObject list_var = unmapped_hypernym_chain;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return unmapped_hypernym_chain;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 30961L)
  public static SubLObject wni_synset_wXo_links(final SubLObject synset)
  {
    return wni_synset_wXo_links_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
  public static SubLObject clear_wni_synset_wXo_links_helper()
  {
    final SubLObject cs = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
  public static SubLObject remove_wni_synset_wXo_links_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synset_wXo_links_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
  public static SubLObject wni_synset_wXo_links_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject words = wni_synset_words( synset );
    SubLObject first_wordP = T;
    SubLObject string = NIL;
    string = $str134$_;
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != first_wordP )
      {
        first_wordP = NIL;
      }
      else
      {
        string = Sequences.cconcatenate( string, $str135$___ );
      }
      string = Sequences.cconcatenate( string, word );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    string = Sequences.cconcatenate( string, $str136$_ );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
  public static SubLObject wni_synset_wXo_links_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym133$WNI_SYNSET_W_O_LINKS_HELPER, $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_, $int138$100, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synset_wXo_links_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31697L)
  public static SubLObject wni_synset_is_causerP(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    return list_utilities.sublisp_boolean( wni_synsets_caused_by( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31941L)
  public static SubLObject wni_synsets_caused_by(final SubLObject synset)
  {
    return wni_synsets_caused_by_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
  public static SubLObject clear_wni_synsets_caused_by_helper()
  {
    final SubLObject cs = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
  public static SubLObject remove_wni_synsets_caused_by_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synsets_caused_by_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
  public static SubLObject wni_synsets_caused_by_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject caused_synsets = NIL;
    SubLObject caused_synset = NIL;
    final SubLObject sentence = ConsesLow.listS( $const142$wnCause, synset, $list143 );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      caused_synset = result.first().rest();
      if( !caused_synset.equal( synset ) )
      {
        caused_synsets = ConsesLow.cons( caused_synset, caused_synsets );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = caused_synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return caused_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
  public static SubLObject wni_synsets_caused_by_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym141$WNI_SYNSETS_CAUSED_BY_HELPER, $sym144$_WNI_SYNSETS_CAUSED_BY_HELPER_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synsets_caused_by_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33165L)
  public static SubLObject wni_synset_is_caused_byP(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    return list_utilities.sublisp_boolean( wni_synsets_caused_by( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33418L)
  public static SubLObject wni_synsets_causing(final SubLObject synset)
  {
    return wni_synsets_causing_helper( wni_ensure_naut( synset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
  public static SubLObject clear_wni_synsets_causing_helper()
  {
    final SubLObject cs = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
  public static SubLObject remove_wni_synsets_causing_helper(final SubLObject synset)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_synsets_causing_helper_caching_state$.getGlobalValue(), ConsesLow.list( synset ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
  public static SubLObject wni_synsets_causing_helper_internal(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject causing_synsets = NIL;
    SubLObject causing_synset = NIL;
    final SubLObject sentence = ConsesLow.list( $const142$wnCause, $sym148$_CAUSING_SYNSET, synset );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      causing_synset = result.first().rest();
      if( !causing_synset.equal( synset ) )
      {
        causing_synsets = ConsesLow.cons( causing_synset, causing_synsets );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = causing_synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return causing_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
  public static SubLObject wni_synsets_causing_helper(final SubLObject synset)
  {
    SubLObject caching_state = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym147$WNI_SYNSETS_CAUSING_HELPER, $sym149$_WNI_SYNSETS_CAUSING_HELPER_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_synsets_causing_helper_internal( synset ) ) );
      memoization_state.caching_state_put( caching_state, synset, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 34639L)
  public static SubLObject wni_urban_area_geographical_entity(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject gloss_words = string_utilities.split_string( wni_synset_gloss( synset ), UNPROVIDED );
    SubLObject gloss_word = NIL;
    SubLObject ancientP = NIL;
    SubLObject doneP = NIL;
    SubLObject place_name_words = NIL;
    SubLObject place_name = NIL;
    SubLObject place_name_denotations = NIL;
    SubLObject place_name_denotation = NIL;
    while ( NIL == doneP)
    {
      if( NIL == gloss_words )
      {
        return NIL;
      }
      gloss_word = gloss_words.first();
      gloss_words = gloss_words.rest();
      if( NIL != Strings.stringE( gloss_word, $str150$ancient, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ancientP = T;
      }
      else if( NIL != ancientP && NIL != Strings.stringE( gloss_word, $str151$Greek, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ancientP = NIL;
      }
      else
      {
        ancientP = NIL;
        if( NIL != Characters.upper_case_p( string_utilities.first_char( gloss_word ) ) )
        {
          place_name_words = ConsesLow.cons( gloss_word, place_name_words );
        }
        else
        {
          if( NIL == place_name_words )
          {
            continue;
          }
          place_name = string_utilities.join_strings( Sequences.reverse( place_name_words ), $str152$_ );
          if( NIL != string_utilities.starts_with( place_name, $str153$Atlantic ) || NIL != string_utilities.starts_with( place_name, $str154$Pacific ) || NIL != string_utilities.starts_with( place_name,
              $str155$Crown_Colony ) || NIL != string_utilities.starts_with( place_name, $str156$Caribbean ) || NIL != string_utilities.starts_with( place_name, $str157$State ) || NIL != string_utilities.starts_with(
                  place_name, $str158$Lake_Erie ) || NIL != string_utilities.starts_with( place_name, $str159$Asia_Minor ) || NIL != string_utilities.starts_with( place_name, $str160$Elbo_River )
              || NIL != string_utilities.starts_with( place_name, $str161$Asian ) || NIL != string_utilities.starts_with( place_name, $str162$Yourba ) || NIL != string_utilities.starts_with( place_name,
                  $str163$Japanese ) || NIL != string_utilities.starts_with( place_name, $str164$Nile ) || NIL != string_utilities.starts_with( place_name, $str165$River_Thames ) || NIL != string_utilities.starts_with(
                      place_name, $str166$River_Aire ) )
          {
            place_name_words = NIL;
          }
          else
          {
            doneP = T;
          }
        }
      }
    }
    if( NIL == place_name )
    {
      return NIL;
    }
    place_name = string_utilities.remove_substring( place_name, $str167$_s );
    place_name_denotations = lexicon_accessors.denots_of_string( place_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    while ( NIL != place_name_denotations)
    {
      place_name_denotation = place_name_denotations.first();
      place_name_denotations = place_name_denotations.rest();
      if( NIL != isa.isa_in_any_mtP( place_name_denotation, $const168$GeopoliticalEntity ) && NIL == isa.isa_in_any_mtP( place_name_denotation, $const169$City ) )
      {
        return place_name_denotation;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 37374L)
  public static SubLObject wni_synsets_having_pos(final SubLObject pos)
  {
    assert NIL != forts.fort_p( pos ) : pos;
    SubLObject synsets = NIL;
    final SubLObject sentence = ConsesLow.list( $const109$wnSynsetSpeechPart, $sym7$_SYNSET, pos );
    final SubLObject query_properties = $list9;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      SubLObject cdolist_list_var = results;
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        synsets = ConsesLow.cons( result.first().rest(), synsets );
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 38260L)
  public static SubLObject wni_terms_synsets(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    SubLObject speech_part_offsets = NIL;
    SubLObject synset = NIL;
    SubLObject synsets = NIL;
    final SubLObject sentence = ConsesLow.listS( $const126$synonymousExternalConcept, v_term, $list172 );
    final SubLObject query_properties = $list173;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      SubLObject cdolist_list_var = results;
      SubLObject v_bindings = NIL;
      v_bindings = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        speech_part_offsets = ConsesLow.cons( bindings.variable_lookup( $sym174$_SPEECH_PART_OFFSET, v_bindings ), speech_part_offsets );
        cdolist_list_var = cdolist_list_var.rest();
        v_bindings = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var = speech_part_offsets;
    SubLObject speech_part_offset = NIL;
    speech_part_offset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synset = wni_speech_part_offset_to_synset( speech_part_offset );
      if( NIL != synset )
      {
        synsets = ConsesLow.cons( synset, synsets );
      }
      cdolist_list_var = cdolist_list_var.rest();
      speech_part_offset = cdolist_list_var.first();
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
  public static SubLObject clear_wni_broader_terms()
  {
    final SubLObject cs = $wni_broader_terms_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
  public static SubLObject remove_wni_broader_terms(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_broader_terms_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
  public static SubLObject wni_broader_terms_internal(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    SubLObject broader_terms = NIL;
    SubLObject cdolist_list_var = ( NIL != fort_types_interface.collectionP( v_term ) ) ? genls.genls( v_term, $const177$EverythingPSC, UNPROVIDED ) : isa.isa( v_term, $const177$EverythingPSC, UNPROVIDED );
    SubLObject broader_term = NIL;
    broader_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == isa.isa_in_any_mtP( broader_term, $const176$CycKBSubsetCollection ) && NIL != forts.fort_p( broader_term ) )
      {
        broader_terms = ConsesLow.cons( broader_term, broader_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      broader_term = cdolist_list_var.first();
    }
    final SubLObject list_var;
    broader_terms = ( list_var = genls.min_cols( broader_terms, UNPROVIDED, UNPROVIDED ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return broader_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
  public static SubLObject wni_broader_terms(final SubLObject v_term)
  {
    SubLObject caching_state = $wni_broader_terms_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym175$WNI_BROADER_TERMS, $sym178$_WNI_BROADER_TERMS_CACHING_STATE_, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_broader_terms_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 40132L)
  public static SubLObject wni_mapped_terms_and_synsets(final SubLObject pos)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( pos ) : pos;
    final SubLObject pos_first_char = list_utilities.alist_lookup( $wni_1_char_pos_map$.getGlobalValue(), $const95$Noun, UNPROVIDED, UNPROVIDED );
    SubLObject mapped_terms_and_synsets = NIL;
    final SubLObject list_var;
    final SubLObject mapped_terms_and_pos_offsets = list_var = wni_mapped_terms_and_pos_offsets();
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
      utilities_macros.$progress_note$.bind( $str180$finding_synsets_for_speech_part_o, thread );
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
        SubLObject mapped_term_and_pos_offset = NIL;
        mapped_term_and_pos_offset = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject mapped_term = mapped_term_and_pos_offset.first();
          final SubLObject pos_offset = conses_high.second( mapped_term_and_pos_offset );
          if( pos_first_char.equal( string_utilities.first_of_string( pos_offset ) ) )
          {
            mapped_terms_and_synsets = ConsesLow.cons( ConsesLow.list( mapped_term, wni_speech_part_offset_to_synset( pos_offset ) ), mapped_terms_and_synsets );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          mapped_term_and_pos_offset = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    final SubLObject list_var_$9 = mapped_terms_and_synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var_$9 ) : list_var_$9;
    SubLObject cdolist_list_var = list_var_$9;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.listp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return mapped_terms_and_synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 41046L)
  public static SubLObject wni_synset_hypernyms_mappedP(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject hypernyms = wni_hypernyms( synset );
    SubLObject v_term = NIL;
    if( NIL != hypernyms )
    {
      SubLObject cdolist_list_var = hypernyms;
      SubLObject hypernym = NIL;
      hypernym = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_term = wni_synset_term( hypernym );
        if( NIL == v_term || NIL != fort_types_interface.predicateP( v_term ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        hypernym = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 41537L)
  public static SubLObject wni_mapped_terms()
  {
    SubLObject mapped_terms = NIL;
    SubLObject mapped_term = NIL;
    final SubLObject sentence = $list184;
    final SubLObject query_properties = $list173;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const185$WordNetMappingMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mapped_term = result.first().rest();
      if( NIL != forts.fort_p( mapped_term ) )
      {
        mapped_terms = ConsesLow.cons( mapped_term, mapped_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = mapped_terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return mapped_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 42428L)
  public static SubLObject wni_mapped_terms_and_pos_offsets()
  {
    SubLObject value_pairs = NIL;
    final SubLObject sentence = $list187;
    final SubLObject query_properties = $list173;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const185$WordNetMappingMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      value_pairs = ConsesLow.cons( ConsesLow.list( result.first().rest(), conses_high.second( result ).rest() ), value_pairs );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = value_pairs;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != Types.listp( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return value_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 43291L)
  public static SubLObject wni_speech_part_offset_to_synset(final SubLObject pos_offset)
  {
    assert NIL != Types.stringp( pos_offset ) : pos_offset;
    SubLObject synset = NIL;
    final SubLObject sentence = ConsesLow.list( $const116$wnSynsetSpeechPartOffset, $sym7$_SYNSET, pos_offset );
    final SubLObject query_properties = $list189;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      synset = results.first().first().rest();
    }
    if( NIL != synset && !assertionsDisabledInClass && NIL == narts_high.naut_p( synset ) )
    {
      throw new AssertionError( synset );
    }
    return synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 44243L)
  public static SubLObject wni_update_synset_with_term(final SubLObject synset, final SubLObject v_term)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    final SubLObject sql_connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.listS( $kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(),
      $kw19$PORT, wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $list191
    } ) );
    final SubLObject sql_statement = sdbc.sqlc_create_statement( sql_connection );
    final SubLObject sql_update = PrintLow.format( NIL, $str192$update_Synset_set_cyc_term_____A_, v_term, wni_synset_id( synset ) );
    sdbc.sqls_execute_update( sql_statement, sql_update );
    sdbc.sqls_close( sql_statement );
    sdbc.sqlc_close( sql_connection );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 45132L)
  public static SubLObject wni_insert_concept_match_html(final SubLObject synset, final SubLObject html_string)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( html_string ) : html_string;
    final SubLObject cyc_image_id = control_vars.cyc_image_id();
    final SubLObject sql_connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.listS( $kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(),
      $kw19$PORT, wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $list191
    } ) );
    final SubLObject sql_statement = sdbc.sqlc_create_statement( sql_connection );
    final SubLObject sql_delete = PrintLow.format( NIL, $str194$delete_from_ConceptMatchHTML_wher, wni_synset_id( synset ), cyc_image_id );
    final SubLObject sql_insert = PrintLow.format( NIL, $str195$insert_into_ConceptMatchHTML_valu, new SubLObject[] { wni_synset_id( synset ), string_utilities.string_substitute( $str196$__, $str197$_, html_string,
        UNPROVIDED ), cyc_image_id
    } );
    sdbc.sqls_execute_update( sql_statement, sql_delete );
    sdbc.sqls_execute_update( sql_statement, sql_insert );
    sdbc.sqls_close( sql_statement );
    sdbc.sqlc_close( sql_connection );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 46366L)
  public static SubLObject wni_select_concept_match_html(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject sql_connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.listS( $kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(),
      $kw19$PORT, wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $list191
    } ) );
    final SubLObject sql_statement = sdbc.sqlc_create_statement( sql_connection );
    final SubLObject sql_query = PrintLow.format( NIL, $str199$select_html_from_ConceptMatchHTML, wni_synset_id( synset ), control_vars.cyc_image_id() );
    final SubLObject sql_result_set = sdbc.sqls_execute_query( sql_statement, sql_query, UNPROVIDED );
    SubLObject html_string = NIL;
    if( NIL != sdbc.sqlrs_emptyP( sql_result_set ) )
    {
      sdbc.sqls_close( sql_statement );
      sdbc.sqlc_close( sql_connection );
      return NIL;
    }
    sdbc.sqlrs_next( sql_result_set );
    html_string = sdbc.sqlrs_get_object( sql_result_set, ONE_INTEGER );
    sdbc.sqls_close( sql_statement );
    sdbc.sqlc_close( sql_connection );
    assert NIL != Types.stringp( html_string ) : html_string;
    return html_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 47639L)
  public static SubLObject wni_delete_concept_match_html(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    final SubLObject sql_connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.listS( $kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(),
      $kw19$PORT, wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $list191
    } ) );
    final SubLObject sql_statement = sdbc.sqlc_create_statement( sql_connection );
    final SubLObject sql_delete = PrintLow.format( NIL, $str194$delete_from_ConceptMatchHTML_wher, wni_synset_id( synset ), control_vars.cyc_image_id() );
    sdbc.sqls_execute_update( sql_statement, sql_delete );
    sdbc.sqls_close( sql_statement );
    sdbc.sqlc_close( sql_connection );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 48523L)
  public static SubLObject wni_delete_all_concept_match_html()
  {
    final SubLObject sql_connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.listS( $kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(),
      $kw19$PORT, wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $list191
    } ) );
    final SubLObject sql_statement = sdbc.sqlc_create_statement( sql_connection );
    final SubLObject sql_delete = PrintLow.format( NIL, $str202$delete_from_ConceptMatchHTML_wher, control_vars.cyc_image_id() );
    sdbc.sqls_execute_update( sql_statement, sql_delete );
    sdbc.sqls_close( sql_statement );
    sdbc.sqlc_close( sql_connection );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 49309L)
  public static SubLObject wni_unmapped_synsets_having_mapped_hypernym(final SubLObject speech_part)
  {
    assert NIL != forts.fort_p( speech_part ) : speech_part;
    SubLObject synsets = NIL;
    final SubLObject pos = Strings.string_downcase( list_utilities.alist_lookup_without_values( $wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    final SubLObject sql_query = Sequences.cconcatenate( $str204$select_Synset_synset_id__________, new SubLObject[] { pos, $str205$__and____________________Synset_c
    } );
    SubLObject rs = NIL;
    SubLObject statement = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sdbc.new_sql_connection( wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), ConsesLow.list( new SubLObject[] { $kw18$DBMS_SERVER, wni_access_path_server(), $kw19$PORT,
        wni_access_path_proxy_port(), $kw20$SUBPROTOCOL, wni_access_path_subprotocol(), $kw21$PROXY_SERVER, wni_access_path_proxy_server(), $kw22$TIMEOUT, THREE_INTEGER
      } ) );
      if( NIL != sdbc.sql_open_connection_p( connection ) )
      {
        statement = sdbc.sqlc_create_statement( connection );
      }
      else
      {
        statement = connection;
      }
      if( NIL != sdbc.sql_open_statement_p( statement ) )
      {
        rs = sdbc.sqls_execute_query( statement, sql_query, UNPROVIDED );
      }
      else
      {
        rs = statement;
      }
      if( NIL != sdbc.sql_result_set_p( rs ) )
      {
        while ( NIL != sdbc.sqlrs_next( rs ))
        {
          synsets = ConsesLow.cons( ConsesLow.list( $const23$WordNetSynsetFn, sdbc.sqlrs_get_object( rs, ONE_INTEGER ) ), synsets );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 50718L)
  public static SubLObject wni_trace_new_cyc_query(final SubLObject sentence, final SubLObject mt, SubLObject query_properties)
  {
    assert NIL != Types.listp( sentence ) : sentence;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    final SubLObject plist_var = query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( wni_problem_store() ) && NIL == list_utilities.plist_has_keyP( query_properties, $kw209$PROBLEM_STORE ) )
    {
      query_properties = conses_high.putf( conses_high.copy_list( query_properties ), $kw209$PROBLEM_STORE, wni_problem_store() );
    }
    SubLObject results = NIL;
    results = inference_kernel.new_cyc_query( sentence, mt, query_properties );
    assert NIL != Types.listp( results ) : results;
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 51552L)
  public static SubLObject wni_problem_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_datastructures_problem_store.problem_store_p( $wni_problem_store$.getDynamicValue( thread ) ) )
    {
      if( NIL == inference_datastructures_problem_store.valid_problem_store_p( $wni_problem_store$.getDynamicValue( thread ) ) )
      {
        Errors.warn( $str210$Destroying_invalid_WordNet_Import );
        inference_datastructures_problem_store.destroy_problem_store( $wni_problem_store$.getDynamicValue( thread ) );
        $wni_problem_store$.setDynamicValue( new_wni_problem_store(), thread );
      }
      else if( inference_datastructures_problem_store.problem_store_problem_count( $wni_problem_store$.getDynamicValue( thread ) ).numG( Numbers.multiply( $float211$0_9, inference_datastructures_problem_store
          .problem_store_max_problem_count( $wni_problem_store$.getDynamicValue( thread ) ) ) ) )
      {
        Errors.warn( $str212$Destroying_90___full_WordNet_Impo );
        inference_datastructures_problem_store.destroy_problem_store( $wni_problem_store$.getDynamicValue( thread ) );
        $wni_problem_store$.setDynamicValue( new_wni_problem_store(), thread );
      }
    }
    return $wni_problem_store$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52212L)
  public static SubLObject new_wni_problem_store()
  {
    return inference_datastructures_problem_store.new_problem_store( wni_problem_store_properties() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52313L)
  public static SubLObject wni_problem_store_properties()
  {
    return $list213;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52472L)
  public static SubLObject wni_unreified_synset(final SubLObject reified_synset)
  {
    assert NIL != nart_handles.nart_p( reified_synset ) : reified_synset;
    final SubLObject synset = ConsesLow.list( $const23$WordNetSynsetFn, cycl_utilities.nat_arg1( reified_synset, UNPROVIDED ) );
    assert NIL != narts_high.naut_p( synset ) : synset;
    return synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52990L)
  public static SubLObject wni_reifiable_synset(final SubLObject synset)
  {
    assert NIL != el_utilities.possibly_naut_p( synset ) : synset;
    final SubLObject reifiable_synset = el_utilities.make_unary_formula( $const216$WordNetSynsetReifiedFn, conses_high.second( synset ) );
    assert NIL != el_utilities.possibly_naut_p( reifiable_synset ) : reifiable_synset;
    return reifiable_synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 53474L)
  public static SubLObject wni_reifiable_synset_from_string(final SubLObject synset_id_string)
  {
    assert NIL != Types.stringp( synset_id_string ) : synset_id_string;
    final SubLObject reifiable_synset = ConsesLow.list( $const216$WordNetSynsetReifiedFn, string_utilities.string_to_integer( synset_id_string ) );
    assert NIL != el_utilities.possibly_naut_p( reifiable_synset ) : reifiable_synset;
    return reifiable_synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54006L)
  public static SubLObject wni_synset_from_id_string(final SubLObject synset_id_string)
  {
    assert NIL != string_utilities.digit_stringP( synset_id_string ) : synset_id_string;
    final SubLObject id = string_utilities.string_to_integer( synset_id_string );
    final SubLObject synset = el_utilities.make_unary_formula( $const23$WordNetSynsetFn, id );
    return synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54477L)
  public static SubLObject wni_ensure_naut(final SubLObject synset)
  {
    SubLObject synset_consp = synset;
    if( NIL != nart_handles.nart_p( synset ) || cycl_utilities.nat_functor( synset ).eql( $const216$WordNetSynsetReifiedFn ) )
    {
      synset_consp = el_utilities.make_unary_formula( $const23$WordNetSynsetFn, cycl_utilities.nat_arg1( synset, UNPROVIDED ) );
    }
    assert NIL != el_utilities.possibly_naut_p( synset_consp ) : synset_consp;
    return synset_consp;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54931L)
  public static SubLObject wni_next_synset_with_status(final SubLObject status)
  {
    assert NIL != forts.fort_p( status ) : status;
    SubLObject synset = NIL;
    final SubLObject sentence = ConsesLow.listS( $const222$and, ConsesLow.list( $const223$isa, $sym224$_REIFIED_SYNSET, status ), $list225 );
    final SubLObject query_properties = $list189;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      synset = wni_unreified_synset( results.first().first().rest() );
    }
    if( NIL != synset && !assertionsDisabledInClass && NIL == narts_high.naut_p( synset ) )
    {
      throw new AssertionError( synset );
    }
    return synset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 55979L)
  public static SubLObject wni_unlocked_synsets_with_status(final SubLObject status)
  {
    assert NIL != forts.fort_p( status ) : status;
    SubLObject synsets = NIL;
    final SubLObject sentence = ConsesLow.listS( $const222$and, ConsesLow.list( $const223$isa, $sym224$_REIFIED_SYNSET, status ), $list225 );
    final SubLObject query_properties = $list9;
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synsets = ConsesLow.cons( wni_unreified_synset( result.first().rest() ), synsets );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final SubLObject list_var = synsets;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return synsets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57044L)
  public static SubLObject wni_term_has_verb_semtransP(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    return wni_term_has_verb_semtrans_helperP( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
  public static SubLObject clear_wni_term_has_verb_semtrans_helperP()
  {
    final SubLObject cs = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
  public static SubLObject remove_wni_term_has_verb_semtrans_helperP(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
  public static SubLObject wni_term_has_verb_semtrans_helperP_internal(final SubLObject v_term)
  {
    assert NIL != forts.fort_p( v_term ) : v_term;
    final SubLObject sentence = ConsesLow.list( $const51$thereExists, $sym229$_WORD_UNIT, ConsesLow.list( $const51$thereExists, $sym230$_SENSE_NBR, ConsesLow.listS( $const222$and, ConsesLow.list( $const231$denotation,
        $sym229$_WORD_UNIT, $const232$Verb, $sym230$_SENSE_NBR, v_term ), ConsesLow.list( $const233$unknownSentence, ConsesLow.list( $const51$thereExists, $sym234$_FRAME, ConsesLow.list( $const51$thereExists,
            $sym235$_TRANS, ConsesLow.listS( $const236$verbSemTrans_Canonical, $sym229$_WORD_UNIT, $sym230$_SENSE_NBR, $sym234$_FRAME, v_term, $list237 ) ) ) ), $list238 ) ) );
    final SubLObject query_properties = $list9;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const177$EverythingPSC, query_properties );
    return makeBoolean( !results.equal( $list239 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
  public static SubLObject wni_term_has_verb_semtrans_helperP(final SubLObject v_term)
  {
    SubLObject caching_state = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_, $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_, $int74$1000, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wni_term_has_verb_semtrans_helperP_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 58626L)
  public static SubLObject wni_gather_terms_for_matching(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject terms = NIL;
    final SubLObject collectionP = wni_synset_collectionP( synset );
    terms = wni_exact_synset_term_matches( synset );
    if( NIL == terms )
    {
      terms = wni_strong_synset_term_matches( synset, collectionP );
    }
    if( NIL == terms )
    {
      terms = wni_weak_synset_term_matches( synset, collectionP, UNPROVIDED );
    }
    if( Sequences.length( terms ).numL( $wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = cb_wordnet_utilities.wni_string_synset_term_matches( synset, collectionP );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( Sequences.length( terms ).numL( $wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue() ) )
        {
          final SubLObject item_var = v_term;
          if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var, terms );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    terms = Sequences.nreverse( terms );
    if( wni_synset_pos( synset ).eql( $const232$Verb ) )
    {
      SubLObject situation_terms = NIL;
      SubLObject cdolist_list_var2 = terms;
      SubLObject v_term2 = NIL;
      v_term2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != fort_types_interface.collectionP( v_term2 ) && NIL != genls.genlsP( v_term2, $const38$Situation, UNPROVIDED, UNPROVIDED ) )
        {
          situation_terms = ConsesLow.cons( v_term2, situation_terms );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        v_term2 = cdolist_list_var2.first();
      }
      terms = Sequences.nreverse( situation_terms );
    }
    final SubLObject list_var = terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 60113L)
  public static SubLObject wni_exact_synset_term_matches(final SubLObject synset)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject terms = NIL;
    final SubLObject pos = wni_synset_pos( synset );
    final SubLObject synset_collectionP = wni_synset_collectionP( synset );
    final SubLObject synset_words = wni_synset_words( synset );
    final SubLObject hypernym_terms = wni_hypernym_terms( synset );
    if( NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str243$___A_mapped_hypernyms__A___A__, new SubLObject[] { synset, hypernym_terms, wni_synset_gloss( synset )
      } );
      streams_high.force_output( UNPROVIDED );
    }
    SubLObject cdolist_list_var = synset_words;
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str244$__considering_word____a__, synset_word );
        streams_high.force_output( UNPROVIDED );
      }
      SubLObject possible_matches = lexicon_accessors.denots_of_string( synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( pos.eql( $const232$Verb ) )
      {
        SubLObject possible_situation_matches = NIL;
        SubLObject cdolist_list_var_$10 = possible_matches;
        SubLObject possible_match = NIL;
        possible_match = cdolist_list_var_$10.first();
        while ( NIL != cdolist_list_var_$10)
        {
          if( NIL != forts.fort_p( possible_match ) && NIL != genls.genlsP( possible_match, $const38$Situation, UNPROVIDED, UNPROVIDED ) )
          {
            possible_situation_matches = ConsesLow.cons( possible_match, possible_situation_matches );
          }
          cdolist_list_var_$10 = cdolist_list_var_$10.rest();
          possible_match = cdolist_list_var_$10.first();
        }
        possible_matches = possible_situation_matches;
      }
      if( NIL != possible_matches )
      {
        if( NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str245$____possible_lexical_matches__A__, possible_matches );
          streams_high.force_output( UNPROVIDED );
        }
        SubLObject cdolist_list_var_$11 = possible_matches;
        SubLObject possible_match2 = NIL;
        possible_match2 = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          SubLObject mapped_broader_terms = NIL;
          final SubLObject generated_phrase = pph_main.generate_phrase( possible_match2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var_$12 = ( NIL != synset_collectionP ) ? genls.genls( possible_match2, $const177$EverythingPSC, UNPROVIDED ) : isa.isa( possible_match2, $const177$EverythingPSC, UNPROVIDED );
          SubLObject mapped_broader_term = NIL;
          mapped_broader_term = cdolist_list_var_$12.first();
          while ( NIL != cdolist_list_var_$12)
          {
            if( NIL == isa.isa_in_any_mtP( mapped_broader_term, $const176$CycKBSubsetCollection ) )
            {
              mapped_broader_terms = ConsesLow.cons( mapped_broader_term, mapped_broader_terms );
            }
            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
            mapped_broader_term = cdolist_list_var_$12.first();
          }
          if( NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
          {
            PrintLow.format( T, $str246$____considering_term____a___const, possible_match2, mapped_broader_terms );
            streams_high.force_output( UNPROVIDED );
          }
          if( NIL != forts.fort_p( possible_match2 ) && fort_types_interface.collectionP( possible_match2 ).eql( synset_collectionP ) )
          {
            if( NIL != conses_high.intersection( hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
              {
                PrintLow.format( T, $str247$___A_____A__structure___, synset_word, possible_match2 );
                streams_high.force_output( UNPROVIDED );
              }
              final SubLObject item_var = possible_match2;
              if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                terms = ConsesLow.cons( item_var, terms );
              }
            }
            else if( NIL != Strings.stringE( generated_phrase, synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == disjoint_with.any_disjoint_with_anyP( hypernym_terms, mapped_broader_terms,
                UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue( thread ) )
              {
                PrintLow.format( T, $str248$___A____A__lexicon___, synset_word, possible_match2 );
                streams_high.force_output( UNPROVIDED );
              }
              final SubLObject item_var = possible_match2;
              if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                terms = ConsesLow.cons( item_var, terms );
              }
            }
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          possible_match2 = cdolist_list_var_$11.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset_word = cdolist_list_var.first();
    }
    if( pos.eql( $const232$Verb ) )
    {
      cdolist_list_var = wni_derived_forms( synset );
      SubLObject derivationally_related_synset = NIL;
      derivationally_related_synset = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( $const95$Noun.eql( wni_synset_pos( derivationally_related_synset ) ) )
        {
          SubLObject v_term = NIL;
          v_term = wni_synset_term( derivationally_related_synset );
          if( NIL != v_term && NIL != forts.fort_p( v_term ) && NIL != genls.genlP( v_term, $const38$Situation, UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( v_term, terms, UNPROVIDED, UNPROVIDED ) )
          {
            terms = list_utilities.add_to_end( v_term, terms );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        derivationally_related_synset = cdolist_list_var.first();
      }
    }
    final SubLObject list_var = terms;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 63264L)
  public static SubLObject wni_strong_synset_term_matches(final SubLObject synset, final SubLObject collectionP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( collectionP ) : collectionP;
    final SubLObject all_hypernyms = wni_all_hypernyms( synset );
    final SubLObject synset_words = wni_synset_words( synset );
    SubLObject pos = lexification_utilities.keyword_for_pos( wni_synset_pos( synset ), UNPROVIDED );
    SubLObject ans = NIL;
    if( pos == $kw251$NOUN )
    {
      pos = $kw252$ALL_NOUN_FORMS;
    }
    SubLObject cdolist_list_var = synset_words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject possibilities = lexicon_accessors.denots_of_stringXpos( word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != possibilities )
      {
        SubLObject cdolist_list_var_$13 = all_hypernyms;
        SubLObject hypernym = NIL;
        hypernym = cdolist_list_var_$13.first();
        while ( NIL != cdolist_list_var_$13)
        {
          final SubLObject hypernym_term = wni_synset_term( hypernym );
          if( NIL != hypernym_term )
          {
            SubLObject cdolist_list_var_$14 = possibilities;
            SubLObject possibility = NIL;
            possibility = cdolist_list_var_$14.first();
            while ( NIL != cdolist_list_var_$14)
            {
              if( NIL != forts.fort_p( possibility ) && NIL == subl_promotions.memberP( possibility, ans, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$relevant_mt_function$.bind( $sym253$RELEVANT_MT_IS_EVERYTHING, thread );
                  mt_relevance_macros.$mt$.bind( $const177$EverythingPSC, thread );
                  if( NIL != genls.genlP( possibility, hypernym_term, UNPROVIDED, UNPROVIDED ) || NIL != isa.isaP( possibility, hypernym_term, UNPROVIDED, UNPROVIDED ) )
                  {
                    final SubLObject item_var = possibility;
                    if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      ans = ConsesLow.cons( item_var, ans );
                    }
                  }
                }
                finally
                {
                  mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
                }
              }
              cdolist_list_var_$14 = cdolist_list_var_$14.rest();
              possibility = cdolist_list_var_$14.first();
            }
          }
          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
          hypernym = cdolist_list_var_$13.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    final SubLObject list_var;
    ans = ( list_var = ( ( NIL != collectionP ) ? list_utilities.find_all_if( Symbols.symbol_function( $sym254$SET_OR_COLLECTION_ ), ans, UNPROVIDED )
        : list_utilities.find_all_if( Symbols.symbol_function( $sym255$INDIVIDUAL_ ), ans, UNPROVIDED ) ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 65012L)
  public static SubLObject wni_weak_synset_term_matches(final SubLObject synset, final SubLObject collectionP, SubLObject check_posP)
  {
    if( check_posP == UNPROVIDED )
    {
      check_posP = NIL;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( collectionP ) : collectionP;
    final SubLObject synset_words = wni_synset_words( synset );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = synset_words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject possibilities = NIL;
      SubLObject cdolist_list_var_$15;
      possibilities = ( cdolist_list_var_$15 = ( ( NIL != check_posP ) ? lexicon_accessors.denots_of_stringXpos( word, lexification_utilities.keyword_for_pos( wni_synset_pos( synset ), UNPROVIDED ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : lexicon_accessors.denots_of_string( word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
      SubLObject possibility = NIL;
      possibility = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        if( NIL != forts.fort_p( possibility ) )
        {
          final SubLObject item_var = possibility;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
        possibility = cdolist_list_var_$15.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    ans = Sequences.nreverse( ans );
    final SubLObject list_var;
    ans = ( list_var = ( ( NIL != collectionP ) ? list_utilities.find_all_if( Symbols.symbol_function( $sym254$SET_OR_COLLECTION_ ), ans, UNPROVIDED )
        : list_utilities.find_all_if( Symbols.symbol_function( $sym255$INDIVIDUAL_ ), ans, UNPROVIDED ) ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 66472L)
  public static SubLObject wni_create_now(final SubLObject name)
  {
    SubLObject constant = constants_high.find_constant( name );
    if( NIL == constant_handles.valid_constantP( constant, UNPROVIDED ) )
    {
      assert NIL != Types.stringp( name ) : name;
      ke.ke_create_now( name, UNPROVIDED );
      constant = constants_high.find_constant( name );
    }
    assert NIL != constant_handles.constant_p( constant ) : constant;
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 66896L)
  public static SubLObject wni_assert_wff(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.consp( sentence ) : sentence;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != enumeration_types.direction_p( direction ) : direction;
    assert NIL != enumeration_types.el_strength_p( strength ) : strength;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( sentence, mt, strength, direction );
    }
    else
    {
      ke.ke_assert( sentence, mt, strength, direction );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 67598L)
  public static SubLObject wni_unassert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( status ) : status;
    assert NIL != list_utilities.non_dotted_list_p( synsets ) : synsets;
    SubLObject cdolist_list_var = synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var2 = synsets;
    SubLObject synset = NIL;
    synset = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      wni_unassert_import_status( status, synset, nowP );
      cdolist_list_var2 = cdolist_list_var2.rest();
      synset = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 68028L)
  public static SubLObject wni_unassert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( status ) : status;
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_unassert_now( ConsesLow.list( $const223$isa, wni_reifiable_synset( synset ), status ), $const31$WordNetWorkflowDataStatusMt );
    }
    else
    {
      ke.ke_unassert( ConsesLow.list( $const223$isa, wni_reifiable_synset( synset ), status ), $const31$WordNetWorkflowDataStatusMt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 68589L)
  public static SubLObject wni_assert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( status ) : status;
    assert NIL != list_utilities.non_dotted_list_p( synsets ) : synsets;
    SubLObject cdolist_list_var = synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var2 = synsets;
    SubLObject synset = NIL;
    synset = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      wni_assert_import_status( status, synset, nowP );
      cdolist_list_var2 = cdolist_list_var2.rest();
      synset = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 69010L)
  public static SubLObject wni_assert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( status ) : status;
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
        ke.ke_assert_wff_now( ConsesLow.list( $const223$isa, wni_reifiable_synset( synset ), status ), $const31$WordNetWorkflowDataStatusMt, $kw267$MONOTONIC, $kw268$FORWARD );
      }
      finally
      {
        kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      ke.ke_assert( ConsesLow.list( $const223$isa, wni_reifiable_synset( synset ), status ), $const31$WordNetWorkflowDataStatusMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 69743L)
  public static SubLObject wni_assert_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( nowP ) : nowP;
    clear_wni_synset_term_helper();
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.list( $const126$synonymousExternalConcept, v_term, $const128$WordNet_Version2_0, wni_synset_speech_part_offset( synset ) ), $const185$WordNetMappingMt, $kw267$MONOTONIC,
          $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.list( $const126$synonymousExternalConcept, v_term, $const128$WordNet_Version2_0, wni_synset_speech_part_offset( synset ) ), $const185$WordNetMappingMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 70483L)
  public static SubLObject wni_assert_likely_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.list( $const271$wnLikelySynsetMapping, wni_reifiable_synset( synset ), v_term ), $const31$WordNetWorkflowDataStatusMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.list( $const271$wnLikelySynsetMapping, wni_synset_speech_part_offset( synset ), v_term ), $const31$WordNetWorkflowDataStatusMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 71163L)
  public static SubLObject wni_assert_quoted_isa_workflow_constant(final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.listS( $const273$quotedIsa, v_term, $list274 ), $const275$BookkeepingMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.listS( $const273$quotedIsa, v_term, $list274 ), $const275$BookkeepingMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 71720L)
  public static SubLObject wni_assert_isa_collection(final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    ke.ke_assert_wff_now( ConsesLow.listS( $const223$isa, v_term, $list277 ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 72073L)
  public static SubLObject wni_assert_genls(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var2 = genl_terms;
    SubLObject genl_term = NIL;
    genl_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == genls.genl_in_any_mtP( v_term, genl_term ) )
      {
        if( NIL != nowP )
        {
          ke.ke_assert_wff_now( ConsesLow.list( $const280$genls, v_term, genl_term ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
        }
        else
        {
          ke.ke_assert( ConsesLow.list( $const280$genls, v_term, genl_term ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      genl_term = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 72734L)
  public static SubLObject wni_unassert_genls(final SubLObject v_term, final SubLObject genl_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( genl_term ) : genl_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_unassert_now( ConsesLow.list( $const280$genls, v_term, genl_term ), $const278$UniversalVocabularyMt );
    }
    else
    {
      ke.ke_unassert( ConsesLow.list( $const223$isa, v_term, genl_term ), $const278$UniversalVocabularyMt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 73223L)
  public static SubLObject wni_assert_isa(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.non_dotted_list_p( genl_terms ) : genl_terms;
    SubLObject cdolist_list_var = genl_terms;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var2 = genl_terms;
    SubLObject genl_term = NIL;
    genl_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == isa.isa_in_any_mtP( v_term, genl_term ) )
      {
        if( NIL != nowP )
        {
          ke.ke_assert_wff_now( ConsesLow.list( $const223$isa, v_term, genl_term ), $const283$WordNetIndividualMappingMt, $kw267$MONOTONIC, $kw268$FORWARD );
        }
        else
        {
          ke.ke_assert( ConsesLow.list( $const223$isa, v_term, genl_term ), $const283$WordNetIndividualMappingMt, $kw267$MONOTONIC, $kw268$FORWARD );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      genl_term = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 73807L)
  public static SubLObject wni_assert_isa_individual(final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.listS( $const223$isa, v_term, $list285 ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.listS( $const223$isa, v_term, $list285 ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 74279L)
  public static SubLObject wni_assert_isa_agent_generic(final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL == isa.isaP( v_term, $const287$Agent_Generic, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != nowP )
      {
        ke.ke_assert_wff_now( ConsesLow.listS( $const223$isa, v_term, $list288 ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
      }
      else
      {
        ke.ke_assert( ConsesLow.listS( $const223$isa, v_term, $list288 ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 74803L)
  public static SubLObject wni_assert_reified_using(final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.listS( $const290$reifiedUsingTool, v_term, $list291 ), $const185$WordNetMappingMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.listS( $const290$reifiedUsingTool, v_term, $list291 ), $const185$WordNetMappingMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 75326L)
  public static SubLObject wni_synset_note(final SubLObject synset)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    SubLObject note = NIL;
    final SubLObject sentence = ConsesLow.listS( $const293$wnSynsetNote, wni_reifiable_synset( synset ), $list294 );
    final SubLObject query_properties = $list9;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      note = results.first().first().rest();
    }
    if( NIL == note )
    {
      note = $str295$;
    }
    assert NIL != Types.stringp( note ) : note;
    return note;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 76249L)
  public static SubLObject wni_assert_synset_note(final SubLObject synset, final SubLObject note)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( note ) : note;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
      ke.ke_assert_wff_now( ConsesLow.list( $const293$wnSynsetNote, wni_reifiable_synset( synset ), note ), $const31$WordNetWorkflowDataStatusMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    finally
    {
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 76722L)
  public static SubLObject wni_unassert_synset_note(final SubLObject synset, final SubLObject note)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( note ) : note;
    ke.ke_unassert_now( ConsesLow.list( $const293$wnSynsetNote, wni_reifiable_synset( synset ), note ), $const31$WordNetWorkflowDataStatusMt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77103L)
  public static SubLObject wni_assert_comment(final SubLObject v_term, final SubLObject comment, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.stringp( comment ) : comment;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != nowP )
    {
      ke.ke_assert_wff_now( ConsesLow.list( $const299$comment, v_term, comment ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    else
    {
      ke.ke_assert( ConsesLow.list( $const299$comment, v_term, comment ), $const278$UniversalVocabularyMt, $kw267$MONOTONIC, $kw268$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77640L)
  public static SubLObject wni_assert_term_of_unit(final SubLObject nat)
  {
    assert NIL != Types.consp( nat ) : nat;
    ke.ke_assert_now( ConsesLow.list( $const301$termOfUnit, nat, nat ), $const302$BaseKB, $kw267$MONOTONIC, $kw268$FORWARD );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77895L)
  public static SubLObject wni_lock_synset(final SubLObject synset)
  {
    ke.ke_assert_wff_now( ConsesLow.list( $const304$wnWorkflowSynsetLock, wni_reifiable_synset( synset ), operation_communication.the_cyclist(), date_utilities.indexical_now() ), $const31$WordNetWorkflowDataStatusMt,
        $kw267$MONOTONIC, $kw268$FORWARD );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 78219L)
  public static SubLObject wni_unlock_synset(final SubLObject synset, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject date = NIL;
    final SubLObject reifiable_synset = wni_reifiable_synset( synset );
    final SubLObject sentence = ConsesLow.listS( $const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), $list306 );
    final SubLObject query_properties = $list189;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const10$WordNetWorkflowCollectorMt, query_properties );
    if( NIL != results )
    {
      date = results.first().first().rest();
      if( NIL != nowP )
      {
        ke.ke_unassert_now( ConsesLow.list( $const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date ), $const31$WordNetWorkflowDataStatusMt );
      }
      else
      {
        ke.ke_unassert( ConsesLow.list( $const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date ), $const31$WordNetWorkflowDataStatusMt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 79376L)
  public static SubLObject wni_assert_heuristic_lexicon(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != wni_synset_collectionP( synset ) )
    {
      wni_assert_heuristic_lexicon_for_collection( synset, workflow_alist, v_term, nowP );
    }
    else
    {
      wni_assert_heuristic_lexicon_for_individual( synset, v_term, workflow_alist, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 80507L)
  public static SubLObject wni_assert_heuristic_lexicon_for_collection(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != wni_all_hypernymP( synset, $organism_being_synset$.getGlobalValue() ) && NIL == wni_all_hypernymP( synset, $person_synset$.getGlobalValue() ) )
    {
      wni_assert_heuristic_lexicon_for_organism( synset, v_term, workflow_alist, nowP );
      return NIL;
    }
    if( NIL != wni_all_hypernymP( synset, $chemical_compound_synset$.getGlobalValue() ) )
    {
      wni_assert_heuristic_lexicon_for_chemical( synset, v_term, nowP );
    }
    final SubLObject synset_words = wni_synset_words( synset );
    wni_assert_heuristic_lexicon_for_collection_common( synset, synset_words, v_term, workflow_alist, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 81635L)
  public static SubLObject wni_assert_heuristic_lexicon_for_collection_common(final SubLObject synset, final SubLObject synset_words, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != list_utilities.non_dotted_list_p( synset_words ) : synset_words;
    SubLObject cdolist_list_var = synset_words;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var2 = synset_words;
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != list_utilities.alist_lookup( workflow_alist, Sequences.cconcatenate( synset_word, $str312$_included ), EQUAL, UNPROVIDED ) )
      {
        final SubLObject pos = wni_heuristic_pos( synset, synset_word, workflow_alist );
        if( NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_hyphen ) )
        {
          wni_assert_lexicon_for_hyphen_string( synset_word, v_term, workflow_alist, pos, nowP );
        }
        else if( NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_space ) )
        {
          wni_assert_lexicon_for_phrase( synset_word, v_term, workflow_alist, pos, nowP );
        }
        else
        {
          wni_assert_lexicon_for_denotation( synset_word, v_term, workflow_alist, pos, nowP );
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      synset_word = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 83409L)
  public static SubLObject wni_assert_heuristic_lexicon_for_individual(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$const95$Noun.equal( wni_synset_pos( synset ) ) )
    {
      Errors.error( $str316$WordNet_individual_synset__A_must, synset );
    }
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL != wni_all_hypernymP( synset, $person_synset$.getGlobalValue() ) )
    {
      wni_assert_lexicon_for_person( synset, v_term, nowP );
      return NIL;
    }
    if( NIL != wni_all_hypernymP( synset, $country_synset$.getGlobalValue() ) )
    {
      return NIL;
    }
    if( NIL != wni_all_hypernymP( synset, $urban_area_synset$.getGlobalValue() ) )
    {
      wni_assert_lexicon_for_urban_area( synset, v_term, nowP );
      return NIL;
    }
    if( NIL != wni_all_hypernymP( synset, $geographical_area_synset$.getGlobalValue() ) )
    {
      wni_assert_lexicon_for_geographical_area( synset, v_term, nowP );
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject synset_words = cdolist_list_var = wni_synset_words( synset );
    SubLObject synset_word = NIL;
    synset_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.alist_lookup( workflow_alist, Sequences.cconcatenate( synset_word, $str312$_included ), EQUAL, UNPROVIDED ) && NIL == subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string(
          synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != Strings.stringE( synset_word, Strings.string_upcase( synset_word, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_A ) || NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_E ) || NIL != string_utilities.contains_charP( synset_word,
              Characters.CHAR_I ) || NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_O ) || NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_U ) )
          {
            wni_assert_acronym( synset_word, v_term, nowP );
          }
          else
          {
            wni_assert_initialism( synset_word, v_term, nowP );
          }
        }
        else
        {
          wni_assert_name_string( synset_word, v_term, nowP );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset_word = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 85433L)
  public static SubLObject wni_assert_heuristic_lexicon_for_organism(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject synset_words = wni_synset_words( synset );
    final SubLObject last_synset_word = list_utilities.last_one( synset_words );
    if( NIL != Characters.upper_case_p( string_utilities.first_char( last_synset_word ) ) )
    {
      wni_assert_isa( v_term, ConsesLow.list( $const317$BiologicalSpecies ), nowP );
      wni_assert_wff( ConsesLow.list( $const318$scientificName, v_term, last_synset_word ), $const319$NewLatinLexicalMt, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      synset_words = list_utilities.remove_last( synset_words );
    }
    wni_assert_heuristic_lexicon_for_collection_common( synset, synset_words, v_term, workflow_alist, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 86971L)
  public static SubLObject wni_assert_heuristic_lexicon_for_chemical(final SubLObject synset, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject cdolist_list_var;
    final SubLObject gloss_words = cdolist_list_var = string_utilities.split_string( wni_synset_gloss( synset ), $list320 );
    SubLObject gloss_word = NIL;
    gloss_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.starts_with( gloss_word, $str134$_ ) && NIL != string_utilities.ends_with( gloss_word, $str136$_, UNPROVIDED ) )
      {
        gloss_word = Sequences.subseq( gloss_word, ONE_INTEGER, Numbers.subtract( Sequences.length( gloss_word ), ONE_INTEGER ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gloss_word = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 88130L)
  public static SubLObject wni_assert_lexicon_for_hyphen_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject hyphenated_words = string_utilities.split_string( synset_word, $list321 );
    final SubLObject all_but_last_words = ConsesLow.append( ConsesLow.list( $const322$TheList ), list_utilities.remove_last( hyphenated_words ) );
    final SubLObject last_word = list_utilities.last_one( hyphenated_words );
    SubLObject last_word_unit = lexicon_accessors.best_wu_for_string( last_word, pos );
    SubLObject sentence = NIL;
    if( NIL == last_word_unit )
    {
      lexification_wizard.add_lexical_mapping( last_word, pos, $const323$GeneralEnglishMt, UNPROVIDED );
      last_word_unit = lexicon_accessors.best_wu_for_string( last_word, pos );
    }
    if( NIL != last_word_unit )
    {
      sentence = ConsesLow.list( $const324$hyphenString, all_but_last_words, last_word_unit, pos, v_term );
      wni_assert_wff( sentence, $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      wni_assert_lexical_annotations( sentence, synset_word, workflow_alist, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 89535L)
  public static SubLObject wni_assert_lexicon_for_phrase(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject key = Sequences.cconcatenate( synset_word, $str326$_count_noun );
    final SubLObject value = list_utilities.alist_lookup( workflow_alist, key, EQUAL, UNPROVIDED );
    if( NIL != Strings.stringE( value, $str327$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      wni_assert_lexicon_for_compound_string( synset_word, v_term, workflow_alist, pos, nowP );
    }
    else
    {
      wni_assert_lexicon_for_multi_word_string( synset_word, v_term, workflow_alist, pos, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 90549L)
  public static SubLObject wni_assert_lexicon_for_multi_word_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject multi_words = string_utilities.split_string( synset_word, UNPROVIDED );
    final SubLObject all_but_last_words = ConsesLow.append( ConsesLow.list( $const322$TheList ), list_utilities.remove_last( multi_words ) );
    final SubLObject last_word = list_utilities.last_one( multi_words );
    SubLObject last_word_unit = lexicon_accessors.best_wu_for_string( last_word, pos );
    SubLObject sentence = NIL;
    if( NIL == last_word_unit )
    {
      lexification_wizard.add_lexical_mapping( last_word, pos, $const323$GeneralEnglishMt, UNPROVIDED );
      last_word_unit = lexicon_accessors.best_wu_for_string( last_word, pos );
    }
    if( NIL != last_word_unit )
    {
      sentence = ConsesLow.list( $const328$multiWordString, all_but_last_words, last_word_unit, pos, v_term );
      wni_assert_wff( sentence, $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      wni_assert_lexical_annotations( sentence, synset_word, workflow_alist, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 91942L)
  public static SubLObject wni_assert_lexicon_for_compound_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject multi_words = string_utilities.split_string( synset_word, UNPROVIDED );
    final SubLObject all_but_first_words = ConsesLow.append( ConsesLow.list( $const322$TheList ), multi_words.rest() );
    final SubLObject first_word = multi_words.first();
    SubLObject first_word_unit = lexicon_accessors.best_wu_for_string( first_word, pos );
    SubLObject sentence = NIL;
    if( NIL == first_word_unit )
    {
      lexification_wizard.add_lexical_mapping( first_word, pos, $const323$GeneralEnglishMt, UNPROVIDED );
      first_word_unit = lexicon_accessors.best_wu_for_string( first_word, pos );
    }
    if( NIL != first_word_unit )
    {
      sentence = ConsesLow.list( $const329$compoundString, first_word_unit, all_but_first_words, pos, v_term );
      wni_assert_wff( sentence, $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      wni_assert_lexical_annotations( sentence, synset_word, workflow_alist, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 93332L)
  public static SubLObject wni_assert_lexicon_for_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject word_unit = lexicon_accessors.best_wu_for_string( synset_word, pos );
    SubLObject word_sense = NIL;
    SubLObject denotation_sentence = NIL;
    if( NIL == word_unit )
    {
      lexification_wizard.add_lexical_mapping( synset_word, pos, $const323$GeneralEnglishMt, UNPROVIDED );
      word_unit = lexicon_accessors.best_wu_for_string( synset_word, pos );
    }
    if( NIL != word_unit )
    {
      if( NIL != subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string( synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED ) )
      {
        wni_assert_lexicon_for_existing_denotation( synset_word, v_term, workflow_alist, pos, nowP );
        return NIL;
      }
      word_sense = lexicon_utilities.unique_ws( word_unit, pos, v_term );
      denotation_sentence = ConsesLow.list( $const231$denotation, word_unit, pos, word_sense, v_term );
      wni_assert_wff( denotation_sentence, $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      wni_assert_lexical_annotations( denotation_sentence, synset_word, workflow_alist, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 94790L)
  public static SubLObject wni_assert_lexicon_for_existing_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pos ) : pos;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    assert NIL != Types.booleanp( nowP ) : nowP;
    final SubLObject word_unit = lexicon_accessors.best_wu_for_string( synset_word, pos );
    SubLObject actual_pos = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == word_unit )
    {
      Errors.error( $str330$must_have_an_existing_word_unit_f, synset_word, pos );
    }
    SubLObject word_sense = NIL;
    SubLObject denotation_sentence = NIL;
    final SubLObject query = ConsesLow.list( $const231$denotation, word_unit, $sym52$_POS, $sym331$_WORD_SENSE, v_term );
    final SubLObject query_properties = $list9;
    final SubLObject results = wni_trace_new_cyc_query( query, $const323$GeneralEnglishMt, query_properties );
    if( NIL != results )
    {
      actual_pos = bindings.variable_lookup( $sym52$_POS, results.first() );
      word_sense = bindings.variable_lookup( $sym331$_WORD_SENSE, results.first() );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == word_sense )
    {
      Errors.error( $str332$must_have_an_existing_word_sense_, word_unit, pos );
    }
    denotation_sentence = ConsesLow.list( $const231$denotation, word_unit, actual_pos, word_sense, v_term );
    wni_assert_lexical_annotations( denotation_sentence, synset_word, workflow_alist, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 96624L)
  public static SubLObject wni_assert_lexical_annotations(final SubLObject denotation_sentence, final SubLObject synset_word, final SubLObject workflow_alist, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.consp( denotation_sentence ) : denotation_sentence;
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    final SubLObject politeness = wni_politeness( synset_word, workflow_alist );
    final SubLObject formality = wni_formality( synset_word, workflow_alist );
    final SubLObject rhetorical_device = wni_rhetorical_device( synset_word, workflow_alist );
    if( NIL != politeness )
    {
      wni_assert_wff( ConsesLow.list( $const333$politenessOfWS, denotation_sentence, politeness ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    if( NIL != formality )
    {
      wni_assert_wff( ConsesLow.list( $const334$formalityOfWS, denotation_sentence, formality ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    if( NIL != rhetorical_device )
    {
      wni_assert_wff( ConsesLow.list( $const335$rhetoricalDeviceOfPhrase, denotation_sentence, rhetorical_device ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 98086L)
  public static SubLObject wni_politeness(final SubLObject synset_word, final SubLObject workflow_alist)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    SubLObject politeness = NIL;
    final SubLObject politeness_value = list_utilities.alist_lookup( workflow_alist, Sequences.cconcatenate( synset_word, $str336$_politeness ), EQUAL, UNPROVIDED );
    if( NIL != Strings.stringE( politeness_value, $str337$polite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      politeness = $const338$PoliteSpeech;
    }
    else if( NIL != Strings.stringE( politeness_value, $str339$rude, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      politeness = $const340$RudeSpeech;
    }
    else if( NIL != Strings.stringE( politeness_value, $str341$vulgar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      politeness = $const342$VulgarSpeech;
    }
    if( NIL != politeness && !assertionsDisabledInClass && NIL == forts.fort_p( politeness ) )
    {
      throw new AssertionError( politeness );
    }
    return politeness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 98958L)
  public static SubLObject wni_formality(final SubLObject synset_word, final SubLObject workflow_alist)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    SubLObject formality = NIL;
    final SubLObject formality_value = list_utilities.alist_lookup( workflow_alist, Sequences.cconcatenate( synset_word, $str343$_formality ), EQUAL, UNPROVIDED );
    if( NIL != Strings.stringE( formality_value, $str344$archaic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const345$ArchaicSpeech;
    }
    else if( NIL != Strings.stringE( formality_value, $str346$slang, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const347$SlangSpeech;
    }
    else if( NIL != Strings.stringE( formality_value, $str348$formal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const349$FormalSpeech;
    }
    else if( NIL != Strings.stringE( formality_value, $str350$informal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const351$InformalSpeech;
    }
    else if( NIL != Strings.stringE( formality_value, $str352$baby_talk, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const353$BabyTalk;
    }
    else if( NIL != Strings.stringE( formality_value, $str354$technical_jargon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      formality = $const355$Jargon;
    }
    if( NIL != formality && !assertionsDisabledInClass && NIL == forts.fort_p( formality ) )
    {
      throw new AssertionError( formality );
    }
    return formality;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 100062L)
  public static SubLObject wni_rhetorical_device(final SubLObject synset_word, final SubLObject workflow_alist)
  {
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    SubLObject rhetorical_device = NIL;
    final SubLObject rhetorical_device_value = list_utilities.alist_lookup( workflow_alist, Sequences.cconcatenate( synset_word, $str356$_rhetorical_device ), EQUAL, UNPROVIDED );
    if( NIL != Strings.stringE( rhetorical_device_value, $str357$metaphor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      rhetorical_device = $const358$MetaphoricalSpeech;
    }
    else if( NIL != Strings.stringE( rhetorical_device_value, $str359$simile, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      rhetorical_device = $const360$Simile_FigureOfSpeech;
    }
    else if( NIL != Strings.stringE( rhetorical_device_value, $str361$euphemism, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      rhetorical_device = $const362$EuphemisticSpeech;
    }
    if( NIL != rhetorical_device && !assertionsDisabledInClass && NIL == forts.fort_p( rhetorical_device ) )
    {
      throw new AssertionError( rhetorical_device );
    }
    return rhetorical_device;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 101083L)
  public static SubLObject wni_assert_lexicon_for_person(final SubLObject synset, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    if( NIL == isa.isaP( v_term, $const287$Agent_Generic, UNPROVIDED, UNPROVIDED ) )
    {
      wni_assert_isa_agent_generic( v_term, nowP );
    }
    SubLObject synset_words = wni_synset_words( synset );
    SubLObject synset_word = NIL;
    SubLObject last_name = NIL;
    synset_word = synset_words.first();
    synset_words = synset_words.rest();
    if( NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_period ) )
    {
      wni_assert_wff( ConsesLow.list( $const363$nameString, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      return NIL;
    }
    last_name = synset_word;
    wni_assert_wff( ConsesLow.list( $const364$familyName, v_term, last_name ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    if( NIL == synset_words )
    {
      return NIL;
    }
    synset_word = synset_words.first();
    synset_words = synset_words.rest();
    if( NIL != string_utilities.starts_with( synset_word, $str365$Mrs_ ) || NIL != string_utilities.starts_with( synset_word, $str366$Sir_ ) || NIL != string_utilities.ends_with( synset_word, $str367$_Jr_, UNPROVIDED )
        || NIL != string_utilities.contains_charP( synset_word, Characters.CHAR_period ) )
    {
      wni_assert_wff( ConsesLow.list( $const363$nameString, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      if( NIL == synset_words )
      {
        return NIL;
      }
      synset_word = synset_words.first();
      synset_words = synset_words.rest();
    }
    if( NIL == string_utilities.starts_with( synset_word, $str365$Mrs_ ) )
    {
      if( NIL != string_utilities.starts_with( synset_word, $str368$President_ ) )
      {
        synset_word = string_utilities.remove_substring( synset_word, $str368$President_ );
      }
      if( NIL != string_utilities.starts_with( synset_word, $str366$Sir_ ) )
      {
        synset_word = string_utilities.remove_substring( synset_word, $str366$Sir_ );
      }
      if( NIL != string_utilities.ends_with( synset_word, $str367$_Jr_, UNPROVIDED ) )
      {
        synset_word = string_utilities.remove_substring( synset_word, $str367$_Jr_ );
      }
      final SubLObject given_names = string_utilities.split_string( synset_word, UNPROVIDED ).first();
      if( NIL == string_utilities.contains_charP( given_names, Characters.CHAR_period ) )
      {
        wni_assert_wff( ConsesLow.list( $const369$givenNames, v_term, given_names ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      }
    }
    if( NIL == synset_words )
    {
      synset_words = ConsesLow.cons( synset_word, synset_words );
    }
    final SubLObject last_synset_word = list_utilities.last_one( synset_words );
    SubLObject middle_names = string_utilities.split_string( last_synset_word, UNPROVIDED );
    SubLObject middle_names_string = NIL;
    if( NIL != Strings.stringE( last_name, list_utilities.last_one( middle_names ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      middle_names = middle_names.rest();
      middle_names = list_utilities.remove_last( middle_names );
      if( NIL != middle_names )
      {
        middle_names_string = string_utilities.join_strings( middle_names, $str152$_ );
        wni_assert_wff( ConsesLow.list( $const370$middleName, v_term, middle_names_string ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      }
    }
    else
    {
      wni_assert_wff( ConsesLow.list( $const371$pseudonym, v_term, last_synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 104437L)
  public static SubLObject wni_assert_lexicon_for_urban_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    SubLObject synset_words = wni_synset_words( synset );
    SubLObject synset_word = NIL;
    synset_word = synset_words.first();
    synset_words = synset_words.rest();
    if( NIL == subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string( synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED ) )
    {
      wni_assert_wff( ConsesLow.list( $const372$placeName_Standard, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    SubLObject cdolist_list_var = synset_words;
    SubLObject synset_word_$16 = NIL;
    synset_word_$16 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string( synset_word_$16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED ) )
      {
        wni_assert_wff( ConsesLow.list( $const363$nameString, v_term, synset_word_$16 ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset_word_$16 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 105419L)
  public static SubLObject wni_assert_lexicon_for_geographical_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    SubLObject synset_words = wni_synset_words( synset );
    SubLObject synset_word = NIL;
    synset_word = synset_words.first();
    synset_words = synset_words.rest();
    if( NIL == subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string( synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED ) )
    {
      wni_assert_wff( ConsesLow.list( $const373$placeName_ShortForm, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    }
    SubLObject cdolist_list_var = synset_words;
    SubLObject synset_word_$17 = NIL;
    synset_word_$17 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( v_term, lexicon_accessors.denots_of_string( synset_word_$17, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED ) )
      {
        wni_assert_wff( ConsesLow.list( $const363$nameString, v_term, synset_word_$17 ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset_word_$17 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 106446L)
  public static SubLObject wni_assert_name_string(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    wni_assert_wff( ConsesLow.list( $const363$nameString, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 107003L)
  public static SubLObject wni_assert_acronym(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    wni_assert_wff( ConsesLow.list( $const374$acronymString, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 107562L)
  public static SubLObject wni_assert_initialism(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP)
  {
    if( nowP == UNPROVIDED )
    {
      nowP = T;
    }
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.booleanp( nowP ) : nowP;
    wni_assert_wff( ConsesLow.list( $const375$initialismString, v_term, synset_word ), $const325$TemporaryLexicalAssertions_WordNe, $kw267$MONOTONIC, $kw268$FORWARD, nowP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 108130L)
  public static SubLObject wni_heuristic_pos(final SubLObject synset, final SubLObject synset_word, final SubLObject workflow_alist)
  {
    assert NIL != narts_high.naut_p( synset ) : synset;
    assert NIL != Types.stringp( synset_word ) : synset_word;
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    final SubLObject pos = wni_synset_pos( synset );
    if( !pos.eql( $const95$Noun ) )
    {
      return pos;
    }
    if( Sequences.length( synset_word ).numG( FOUR_INTEGER ) && NIL != string_utilities.ends_with( synset_word, $str376$ing, UNPROVIDED ) )
    {
      final SubLObject prefix = string_utilities.string_first_n( Numbers.subtract( Sequences.length( synset_word ), THREE_INTEGER ), synset_word );
      if( NIL != genls.any_specP( $const95$Noun, lexicon_accessors.pos_of_string( prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        return $const377$GerundiveNoun;
      }
    }
    final SubLObject key = Sequences.cconcatenate( synset_word, $str326$_count_noun );
    final SubLObject value = list_utilities.alist_lookup( workflow_alist, key, EQUAL, UNPROVIDED );
    final SubLObject count_nounP = makeBoolean( NIL != Strings.stringE( value, $str378$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.stringE( value, $str327$headword_is_first, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( NIL != lexification_utilities.initial_capitalizedP( synset_word ) && NIL == wni_synset_collectionP( synset ) )
    {
      if( NIL != count_nounP )
      {
        return $const379$ProperCountNoun;
      }
      return $const380$ProperMassNoun;
    }
    else
    {
      if( NIL != count_nounP )
      {
        return $const381$CountNoun;
      }
      return $const382$MassNoun;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 109558L)
  public static SubLObject wni_number_of_workflow_mapped_terms()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt( $const128$WordNet_Version2_0, $const126$synonymousExternalConcept, $const185$WordNetMappingMt, TWO_INTEGER, UNPROVIDED );
    SubLObject when_asserted = NIL;
    final SubLObject list_var = gafs;
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
      utilities_macros.$progress_note$.bind( $str384$Counting_recent_WordNet_mappings, thread );
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
        SubLObject gaf = NIL;
        gaf = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          when_asserted = assertions_high.asserted_when( gaf );
          if( when_asserted.isNumber() && when_asserted.numG( $int385$20050101 ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          gaf = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
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
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 110125L)
  public static SubLObject wni_number_of_new_concepts_imported_from_wordnet()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject terms = isa.quoted_instances( $const387$WordNetWorkflowConstant_NotFullyR, $const275$BookkeepingMt, UNPROVIDED );
    SubLObject creator = NIL;
    final SubLObject list_var = terms;
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
      utilities_macros.$progress_note$.bind( $str388$Counting_terms_imported_from_Word, thread );
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
        SubLObject v_term = NIL;
        v_term = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          creator = bookkeeping_store.creator( v_term, UNPROVIDED );
          if( creator.eql( $const389$SteveReed ) || NIL != kb_mapping_utilities.pred_u_v_holds_in_mt( $const290$reifiedUsingTool, v_term, $const390$CycWordNetImportTool, $const185$WordNetMappingMt, UNPROVIDED,
              UNPROVIDED, UNPROVIDED ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          v_term = csome_list_var.first();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 110656L)
  public static SubLObject wni_number_of_new_denotations_imported_from_wordet()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt( $const128$WordNet_Version2_0, $const126$synonymousExternalConcept, $const185$WordNetMappingMt, TWO_INTEGER, UNPROVIDED );
    SubLObject when_asserted = NIL;
    SubLObject v_term = NIL;
    SubLObject denotation_gafs = NIL;
    final SubLObject list_var = gafs;
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
      utilities_macros.$progress_note$.bind( $str392$Counting_recent_denotations_impor, thread );
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
        SubLObject gaf = NIL;
        gaf = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          when_asserted = assertions_high.asserted_when( gaf );
          if( when_asserted.isNumber() && when_asserted.numG( $int385$20050101 ) )
          {
            v_term = assertions_high.gaf_arg1( gaf );
            final SubLObject _prev_bind_0_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_1_$21 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym253$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const177$EverythingPSC, thread );
              denotation_gafs = kb_mapping_utilities.pred_value_gafs( v_term, $const231$denotation, FOUR_INTEGER, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_1_$21, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$20, thread );
            }
            SubLObject cdolist_list_var = denotation_gafs;
            SubLObject denotation_gaf = NIL;
            denotation_gaf = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject when_asserted_$22 = assertions_high.asserted_when( denotation_gaf );
              if( when_asserted_$22.isNumber() && when_asserted_$22.numG( $int385$20050101 ) )
              {
                count = Numbers.add( count, ONE_INTEGER );
              }
              cdolist_list_var = cdolist_list_var.rest();
              denotation_gaf = cdolist_list_var.first();
            }
            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_1_$22 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym253$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const177$EverythingPSC, thread );
              denotation_gafs = kb_mapping_utilities.pred_value_gafs( v_term, $const329$compoundString, FOUR_INTEGER, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_1_$22, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$21, thread );
            }
            cdolist_list_var = denotation_gafs;
            denotation_gaf = NIL;
            denotation_gaf = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject when_asserted_$23 = assertions_high.asserted_when( denotation_gaf );
              if( when_asserted_$23.isNumber() && when_asserted_$23.numG( $int385$20050101 ) )
              {
                count = Numbers.add( count, ONE_INTEGER );
              }
              cdolist_list_var = cdolist_list_var.rest();
              denotation_gaf = cdolist_list_var.first();
            }
            final SubLObject _prev_bind_0_$22 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_1_$23 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym253$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const177$EverythingPSC, thread );
              denotation_gafs = kb_mapping_utilities.pred_value_gafs( v_term, $const328$multiWordString, FOUR_INTEGER, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_1_$23, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$22, thread );
            }
            cdolist_list_var = denotation_gafs;
            denotation_gaf = NIL;
            denotation_gaf = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject when_asserted_$24 = assertions_high.asserted_when( denotation_gaf );
              if( when_asserted_$24.isNumber() && when_asserted_$24.numG( $int385$20050101 ) )
              {
                count = Numbers.add( count, ONE_INTEGER );
              }
              cdolist_list_var = cdolist_list_var.rest();
              denotation_gaf = cdolist_list_var.first();
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          gaf = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
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
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_role_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    wni_print_role_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_role_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $wni_role_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_role(final SubLObject v_object)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_filler(final SubLObject v_object)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_defining_col(final SubLObject v_object)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_defining_pred(final SubLObject v_object)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject wni_subsumption_status(final SubLObject v_object)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject _csetf_wni_role(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject _csetf_wni_filler(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject _csetf_wni_defining_col(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject _csetf_wni_defining_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject _csetf_wni_subsumption_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject make_wni_role_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $wni_role_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw412$ROLE ) )
      {
        _csetf_wni_role( v_new, current_value );
      }
      else if( pcase_var.eql( $kw413$FILLER ) )
      {
        _csetf_wni_filler( v_new, current_value );
      }
      else if( pcase_var.eql( $kw414$DEFINING_COL ) )
      {
        _csetf_wni_defining_col( v_new, current_value );
      }
      else if( pcase_var.eql( $kw415$DEFINING_PRED ) )
      {
        _csetf_wni_defining_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw416$SUBSUMPTION_STATUS ) )
      {
        _csetf_wni_subsumption_status( v_new, current_value );
      }
      else
      {
        Errors.error( $str417$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject visit_defstruct_wni_role_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw418$BEGIN, $sym419$MAKE_WNI_ROLE_INFO, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw420$SLOT, $kw412$ROLE, wni_role( obj ) );
    Functions.funcall( visitor_fn, obj, $kw420$SLOT, $kw413$FILLER, wni_filler( obj ) );
    Functions.funcall( visitor_fn, obj, $kw420$SLOT, $kw414$DEFINING_COL, wni_defining_col( obj ) );
    Functions.funcall( visitor_fn, obj, $kw420$SLOT, $kw415$DEFINING_PRED, wni_defining_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw420$SLOT, $kw416$SUBSUMPTION_STATUS, wni_subsumption_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw421$END, $sym419$MAKE_WNI_ROLE_INFO, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
  public static SubLObject visit_defstruct_object_wni_role_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_wni_role_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112636L)
  public static SubLObject wni_print_role_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    assert NIL != wni_role_info_p( v_object ) : v_object;
    assert NIL != Types.streamp( stream ) : stream;
    PrintLow.format( stream, $str424$_ROLE_INFO___s__s__s__s__s_, new SubLObject[] { wni_role( v_object ), wni_filler( v_object ), wni_defining_col( v_object ), wni_defining_pred( v_object ), wni_subsumption_status(
        v_object )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 113109L)
  public static SubLObject wni_gather_roles_and_traits(final SubLObject event_col)
  {
    assert NIL != forts.fort_p( event_col ) : event_col;
    SubLObject role_infos = Sort.sort( wni_gather_roles( event_col ), Symbols.symbol_function( $sym426$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym406$WNI_DEFINING_COL ) );
    SubLObject role_info = NIL;
    SubLObject doneP = NIL;
    SubLObject j = NIL;
    SubLObject genl_predsP = NIL;
    role_infos = ConsesLow.append( role_infos, Sort.sort( wni_gather_traits( event_col ), Symbols.symbol_function( $sym426$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym406$WNI_DEFINING_COL ) ) );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( role_infos ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      role_info = Sequences.elt( role_infos, i );
      j = ZERO_INTEGER;
      genl_predsP = NIL;
      doneP = NIL;
      while ( NIL == doneP)
      {
        if( j.numGE( i ) )
        {
          doneP = T;
        }
        else
        {
          genl_predsP = wni_genl_preds_helper( Sequences.elt( role_infos, j ), role_info );
          if( NIL != genl_predsP )
          {
            doneP = T;
          }
          else
          {
            j = Numbers.add( j, ONE_INTEGER );
          }
        }
      }
      _csetf_wni_subsumption_status( role_info, genl_predsP );
    }
    final SubLObject list_var = role_infos;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != wni_role_info_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return role_infos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 114624L)
  public static SubLObject wni_find_compatible_roles(final SubLObject selected_role_info, final SubLObject role_infos)
  {
    assert NIL != wni_role_info_p( selected_role_info ) : selected_role_info;
    assert NIL != Types.listp( role_infos ) : role_infos;
    SubLObject compatible_role_infos = NIL;
    SubLObject cdolist_list_var = role_infos;
    SubLObject role_info = NIL;
    role_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !role_info.equal( selected_role_info ) && NIL != genls.max_floor_cols( ConsesLow.list( wni_filler( selected_role_info ), wni_filler( role_info ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        compatible_role_infos = ConsesLow.cons( role_info, compatible_role_infos );
      }
      cdolist_list_var = cdolist_list_var.rest();
      role_info = cdolist_list_var.first();
    }
    final SubLObject list_var;
    compatible_role_infos = ( list_var = Sequences.nreverse( compatible_role_infos ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var2 = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      assert NIL != wni_role_info_p( elem ) : elem;
      cdolist_list_var2 = cdolist_list_var2.rest();
      elem = cdolist_list_var2.first();
    }
    return compatible_role_infos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 115484L)
  public static SubLObject wni_genl_preds_helper(final SubLObject compare_role_info, final SubLObject role_info)
  {
    assert NIL != wni_role_info_p( compare_role_info ) : compare_role_info;
    assert NIL != wni_role_info_p( role_info ) : role_info;
    final SubLObject compare_role = wni_role( compare_role_info );
    final SubLObject role = wni_role( role_info );
    if( compare_role.eql( role ) )
    {
      return T;
    }
    if( NIL != genl_predicates.genl_predicateP( compare_role, role, UNPROVIDED, UNPROVIDED ) )
    {
      return compare_role;
    }
    final SubLObject sentence = ConsesLow.list( $const428$genlPredsWRTTypes, compare_role, role, wni_defining_col( compare_role_info ), wni_filler( role_info ) );
    final SubLObject query_properties = $list9;
    final SubLObject results = wni_trace_new_cyc_query( sentence, $const177$EverythingPSC, query_properties );
    if( results.equal( $list239 ) )
    {
      return compare_role;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 116734L)
  public static SubLObject wni_gather_roles(final SubLObject event_col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( event_col ) : event_col;
    final SubLObject template = $list429;
    SubLObject sentence = NIL;
    final SubLObject query_properties = $list9;
    SubLObject v_bindings = NIL;
    SubLObject fillers = NIL;
    sentence = ConsesLow.list( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list431, $list432, $list433, ConsesLow.list( $const434$or, ConsesLow.list( $const222$and, ConsesLow.listS(
        $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list437 ), ConsesLow.list( $const233$unknownSentence, ConsesLow.list( $const51$thereExists, $sym438$_FILLER_2, ConsesLow.listS( $const222$and, ConsesLow.listS(
            $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list439 ), $list440 ) ) ) ), ConsesLow.listS( $const222$and, ConsesLow.list( $const233$unknownSentence, ConsesLow.list( $const51$thereExists,
                $sym438$_FILLER_2, ConsesLow.listS( $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list439 ) ) ), $list441 ) ) );
    thread.resetMultipleValues();
    SubLObject values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    SubLObject results = thread.secondMultipleValue();
    SubLObject halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    v_bindings = values;
    sentence = ConsesLow.list( $const51$thereExists, $sym442$_COLL, ConsesLow.listS( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list443 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    sentence = ConsesLow.list( $const51$thereExists, $sym444$_THING, ConsesLow.listS( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list445 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    sentence = ConsesLow.list( $const51$thereExists, $sym446$_ROLE2, ConsesLow.listS( $const222$and, ConsesLow.list( $const447$assertedSentence, ConsesLow.listS( $const428$genlPredsWRTTypes, $sym436$_ROLE,
        $sym446$_ROLE2, event_col, $list437 ) ), ConsesLow.list( $const448$equals, $sym449$_DEFINING_COLL, event_col ), $list450 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    sentence = ConsesLow.list( $const51$thereExists, $sym446$_ROLE2, ConsesLow.listS( $const222$and, ConsesLow.list( $const447$assertedSentence, ConsesLow.listS( $const428$genlPredsWRTTypes, $sym446$_ROLE2,
        $sym436$_ROLE, event_col, $list437 ) ), ConsesLow.list( $const448$equals, $sym449$_DEFINING_COLL, event_col ), $list450 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    final SubLObject list_var;
    fillers = ( list_var = wni_most_specific_fillers( wni_bindings_to_role_infos( v_bindings ) ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return fillers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 120795L)
  public static SubLObject wni_gather_traits(final SubLObject event_col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( event_col ) : event_col;
    final SubLObject template = $list429;
    SubLObject sentence = NIL;
    final SubLObject query_properties = $list9;
    SubLObject v_bindings = NIL;
    SubLObject fillers = NIL;
    sentence = ConsesLow.list( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list451, $list432, $list433, ConsesLow.list( $const434$or, ConsesLow.list( $const222$and, ConsesLow.listS(
        $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list437 ), ConsesLow.list( $const233$unknownSentence, ConsesLow.list( $const51$thereExists, $sym438$_FILLER_2, ConsesLow.listS( $const222$and, ConsesLow.listS(
            $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list439 ), $list440 ) ) ) ), ConsesLow.listS( $const222$and, ConsesLow.list( $const233$unknownSentence, ConsesLow.list( $const51$thereExists,
                $sym438$_FILLER_2, ConsesLow.listS( $const435$interArgIsa1_2, $sym436$_ROLE, event_col, $list439 ) ) ), $list441 ) ) );
    thread.resetMultipleValues();
    SubLObject values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    SubLObject results = thread.secondMultipleValue();
    SubLObject halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    v_bindings = values;
    sentence = ConsesLow.list( $const51$thereExists, $sym442$_COLL, ConsesLow.listS( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list452 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    sentence = ConsesLow.list( $const51$thereExists, $sym444$_THING, ConsesLow.listS( $const222$and, ConsesLow.listS( $const280$genls, event_col, $list430 ), $list453 ) );
    thread.resetMultipleValues();
    values = ask_utilities.query_template( template, sentence, $const177$EverythingPSC, query_properties );
    results = thread.secondMultipleValue();
    halt_reason = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    ConsesLow.nconc( v_bindings, values );
    final SubLObject list_var;
    fillers = ( list_var = wni_most_specific_fillers( wni_bindings_to_role_infos( v_bindings ) ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return fillers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 124168L)
  public static SubLObject wni_bindings_to_role_infos(final SubLObject v_bindings)
  {
    assert NIL != list_utilities.non_dotted_list_p( v_bindings ) : v_bindings;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.listp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject wni_role_info = NIL;
    SubLObject wni_role_infos = NIL;
    SubLObject cdolist_list_var2 = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      wni_role_info = make_wni_role_info( UNPROVIDED );
      _csetf_wni_role( wni_role_info, binding.first() );
      _csetf_wni_filler( wni_role_info, conses_high.second( binding ) );
      _csetf_wni_defining_col( wni_role_info, conses_high.third( binding ) );
      _csetf_wni_defining_pred( wni_role_info, conses_high.fourth( binding ) );
      wni_role_infos = ConsesLow.cons( wni_role_info, wni_role_infos );
      cdolist_list_var2 = cdolist_list_var2.rest();
      binding = cdolist_list_var2.first();
    }
    final SubLObject list_var = wni_role_infos;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var3 = list_var;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var3.first();
    while ( NIL != cdolist_list_var3)
    {
      assert NIL != wni_role_info_p( elem2 ) : elem2;
      cdolist_list_var3 = cdolist_list_var3.rest();
      elem2 = cdolist_list_var3.first();
    }
    return wni_role_infos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 124837L)
  public static SubLObject wni_sort_key_1(final SubLObject wni_role_info)
  {
    assert NIL != wni_role_info_p( wni_role_info ) : wni_role_info;
    final SubLObject key = Sequences.cconcatenate( PrintLow.format( NIL, $str454$_A, wni_defining_col( wni_role_info ) ), new SubLObject[] { $str152$_, PrintLow.format( NIL, $str454$_A, wni_role( wni_role_info ) )
    } );
    assert NIL != Types.stringp( key ) : key;
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 125227L)
  public static SubLObject wni_most_specific_fillers(final SubLObject wni_role_infos)
  {
    assert NIL != list_utilities.non_dotted_list_p( wni_role_infos ) : wni_role_infos;
    SubLObject cdolist_list_var = wni_role_infos;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != wni_role_info_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject sorted_role_infos = NIL;
    SubLObject result_role_infos = NIL;
    SubLObject best_role_info = NIL;
    SubLObject cdolist_list_var2;
    sorted_role_infos = ( cdolist_list_var2 = Sort.sort( wni_role_infos, Symbols.symbol_function( $sym455$STRING_LESSP ), Symbols.symbol_function( $sym456$WNI_SORT_KEY_1 ) ) );
    SubLObject role_info = NIL;
    role_info = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != best_role_info )
      {
        if( !wni_role( role_info ).eql( wni_role( best_role_info ) ) || ( wni_role( role_info ).eql( wni_role( best_role_info ) ) && !wni_defining_col( role_info ).eql( wni_defining_col( best_role_info ) ) ) )
        {
          result_role_infos = ConsesLow.cons( best_role_info, result_role_infos );
          best_role_info = role_info;
        }
        else if( NIL != genls.genlsP( wni_filler( role_info ), wni_filler( best_role_info ), UNPROVIDED, UNPROVIDED ) )
        {
          best_role_info = role_info;
        }
      }
      else
      {
        best_role_info = role_info;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      role_info = cdolist_list_var2.first();
    }
    result_role_infos = ConsesLow.cons( best_role_info, result_role_infos );
    final SubLObject list_var;
    result_role_infos = ( list_var = Sequences.nreverse( result_role_infos ) );
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var3 = list_var;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var3.first();
    while ( NIL != cdolist_list_var3)
    {
      assert NIL != wni_role_info_p( elem2 ) : elem2;
      cdolist_list_var3 = cdolist_list_var3.rest();
      elem2 = cdolist_list_var3.first();
    }
    return result_role_infos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 126443L)
  public static SubLObject wni_clear_function_caches()
  {
    clear_wni_synsets_for_english_word_string();
    clear_wni_synsets_for_english_word_stringXpos();
    clear_wni_synset_collectionP();
    clear_wni_synset_words_helper();
    clear_wni_synset_example_phrases_helper();
    clear_wni_synset_verb_frames_helper();
    clear_wni_verb_frames_for_word();
    clear_wni_hypernyms_helper();
    clear_wni_all_hypernyms_helper();
    clear_wni_derived_forms_helper();
    clear_wni_synset_gloss_helper();
    clear_wni_synset_pos_helper();
    clear_wni_synset_speech_part_offset_helper();
    clear_wni_synset_term_helper();
    clear_wni_synset_wXo_links_helper();
    clear_wni_synsets_caused_by_helper();
    clear_wni_synsets_causing_helper();
    clear_wni_broader_terms();
    final SubLObject problem_store = wni_problem_store();
    if( NIL != inference_datastructures_problem_store.problem_store_p( problem_store ) )
    {
      inference_datastructures_problem_store.destroy_problem_store( problem_store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 127387L)
  public static SubLObject wni_create_workflow_alist_with_unmapped_hypernym_chain(final SubLObject unmapped_hypernym_chain, final SubLObject in_workflowP)
  {
    assert NIL != Types.listp( unmapped_hypernym_chain ) : unmapped_hypernym_chain;
    assert NIL != Types.booleanp( in_workflowP ) : in_workflowP;
    SubLObject workflow_alist = NIL;
    workflow_alist = ConsesLow.cons( ConsesLow.cons( $str458$in_workflow_, ( NIL != in_workflowP ) ? $str378$t : $str459$nil ), workflow_alist );
    workflow_alist = ConsesLow.cons( ConsesLow.cons( $str460$unmapped_hypernym_chain, unmapped_hypernym_chain ), workflow_alist );
    assert NIL != Types.consp( workflow_alist ) : workflow_alist;
    assert NIL != list_utilities.alist_p( workflow_alist ) : workflow_alist;
    return workflow_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128452L)
  public static SubLObject wni_access_path_server()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_server( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128723L)
  public static SubLObject wni_access_path_port()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_port( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128988L)
  public static SubLObject wni_access_path_proxy_server()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_proxy_server( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129277L)
  public static SubLObject wni_access_path_proxy_port()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_proxy_port( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129560L)
  public static SubLObject wni_access_path_timeout()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_timeout( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129834L)
  public static SubLObject wni_access_path_db()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_db( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130106L)
  public static SubLObject wni_access_path_user()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_user( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130371L)
  public static SubLObject wni_access_path_password()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_password( $wordnet_import_access_path$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130648L)
  public static SubLObject wni_access_path_subprotocol()
  {
    if( NIL == $wordnet_import_access_path$.getGlobalValue() )
    {
      $wordnet_import_access_path$.setGlobalValue( sksi_access_path.external_source_access_path( $const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED ) );
    }
    return sksi_access_path.access_path_subprotocol( $wordnet_import_access_path$.getGlobalValue() );
  }

  public static SubLObject declare_wordnet_import_file()
  {
    SubLFiles.declareFunction( me, "initialize_wordnet_import_kb_feature", "INITIALIZE-WORDNET-IMPORT-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_unranked_synsets_for_english_word_string", "CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_unranked_synsets_for_english_word_string", "REMOVE-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_unranked_synsets_for_english_word_string_internal", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_unranked_synsets_for_english_word_string", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synsets_for_english_word_stringXpos", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synsets_for_english_word_stringXpos", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_for_english_word_stringXpos_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_for_english_word_stringXpos", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synsets_for_english_word_string", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synsets_for_english_word_string", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_for_english_word_string_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_for_english_word_string", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_collectionP", "CLEAR-WNI-SYNSET-COLLECTION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_collectionP", "REMOVE-WNI-SYNSET-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_collectionP_internal", "WNI-SYNSET-COLLECTION?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_collectionP", "WNI-SYNSET-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_individuals", "WNI-SYNSET-INDIVIDUALS", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_exclude_situations", "WNI-EXCLUDE-SITUATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_exclude_relations", "WNI-EXCLUDE-RELATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_exclude_skipped", "WNI-EXCLUDE-SKIPPED", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_id", "WNI-SYNSET-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_words", "WNI-SYNSET-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_equal", "WNI-SYNSETS-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_words_helper", "CLEAR-WNI-SYNSET-WORDS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_words_helper", "REMOVE-WNI-SYNSET-WORDS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_words_helper_internal", "WNI-SYNSET-WORDS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_words_helper", "WNI-SYNSET-WORDS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_example_phrases", "WNI-SYNSET-EXAMPLE-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_example_phrases_helper", "CLEAR-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_example_phrases_helper", "REMOVE-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_example_phrases_helper_internal", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_example_phrases_helper", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_most_general_synset_verb_frame", "WNI-MOST-GENERAL-SYNSET-VERB-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_verb_frames", "WNI-SYNSET-VERB-FRAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_verb_frames_helper", "CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_verb_frames_helper", "REMOVE-WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_verb_frames_helper_internal", "WNI-SYNSET-VERB-FRAMES-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_verb_frames_helper", "WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_verb_frames_for_word", "CLEAR-WNI-VERB-FRAMES-FOR-WORD", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_verb_frames_for_word", "REMOVE-WNI-VERB-FRAMES-FOR-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_verb_frames_for_word_internal", "WNI-VERB-FRAMES-FOR-WORD-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_verb_frames_for_word", "WNI-VERB-FRAMES-FOR-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hypernyms", "WNI-HYPERNYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_hypernyms_helper", "CLEAR-WNI-HYPERNYMS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_hypernyms_helper", "REMOVE-WNI-HYPERNYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hypernyms_helper_internal", "WNI-HYPERNYMS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hypernyms_helper", "WNI-HYPERNYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hypernyms", "WNI-ALL-HYPERNYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_all_hypernyms_helper", "CLEAR-WNI-ALL-HYPERNYMS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_all_hypernyms_helper", "REMOVE-WNI-ALL-HYPERNYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hypernyms_helper_internal", "WNI-ALL-HYPERNYMS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hypernyms_helper", "WNI-ALL-HYPERNYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hypernymP", "WNI-ALL-HYPERNYM?", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_hyponyms", "WNI-HYPONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_hyponyms_helper", "CLEAR-WNI-HYPONYMS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_hyponyms_helper", "REMOVE-WNI-HYPONYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hyponyms_helper_internal", "WNI-HYPONYMS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hyponyms_helper", "WNI-HYPONYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hyponyms", "WNI-ALL-HYPONYMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_all_hyponyms_helper", "CLEAR-WNI-ALL-HYPONYMS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_all_hyponyms_helper", "REMOVE-WNI-ALL-HYPONYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hyponyms_helper_internal", "WNI-ALL-HYPONYMS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_all_hyponyms_helper", "WNI-ALL-HYPONYMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_any_hyponym_an_individual", "WNI-ANY-HYPONYM-AN-INDIVIDUAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_verb_is_derived_from_situation_nounP", "WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_derived_forms", "WNI-DERIVED-FORMS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_derived_forms_helper", "CLEAR-WNI-DERIVED-FORMS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_derived_forms_helper", "REMOVE-WNI-DERIVED-FORMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_derived_forms_helper_internal", "WNI-DERIVED-FORMS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_derived_forms_helper", "WNI-DERIVED-FORMS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_gloss", "WNI-SYNSET-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_gloss_helper", "CLEAR-WNI-SYNSET-GLOSS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_gloss_helper", "REMOVE-WNI-SYNSET-GLOSS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_gloss_helper_internal", "WNI-SYNSET-GLOSS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_gloss_helper", "WNI-SYNSET-GLOSS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_pos", "WNI-SYNSET-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_pos_helper", "CLEAR-WNI-SYNSET-POS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_pos_helper", "REMOVE-WNI-SYNSET-POS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_pos_helper_internal", "WNI-SYNSET-POS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_pos_helper", "WNI-SYNSET-POS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_speech_part_offset", "WNI-SYNSET-SPEECH-PART-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_speech_part_offset_helper", "CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_speech_part_offset_helper", "REMOVE-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_speech_part_offset_helper_internal", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_speech_part_offset_helper", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_hypernym_terms", "WNI-HYPERNYM-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_hypernym_mappedP", "WNI-HYPERNYM-MAPPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_term", "WNI-SYNSET-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_term_helper", "CLEAR-WNI-SYNSET-TERM-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_term_helper", "REMOVE-WNI-SYNSET-TERM-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_term_helper_internal", "WNI-SYNSET-TERM-HELPER-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_term_helper", "WNI-SYNSET-TERM-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_unmapped_hypernym_chain", "WNI-UNMAPPED-HYPERNYM-CHAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_wXo_links", "WNI-SYNSET-W/O-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synset_wXo_links_helper", "CLEAR-WNI-SYNSET-W/O-LINKS-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synset_wXo_links_helper", "REMOVE-WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_wXo_links_helper_internal", "WNI-SYNSET-W/O-LINKS-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_wXo_links_helper", "WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_is_causerP", "WNI-SYNSET-IS-CAUSER?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_caused_by", "WNI-SYNSETS-CAUSED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synsets_caused_by_helper", "CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synsets_caused_by_helper", "REMOVE-WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_caused_by_helper_internal", "WNI-SYNSETS-CAUSED-BY-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_caused_by_helper", "WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_is_caused_byP", "WNI-SYNSET-IS-CAUSED-BY?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_causing", "WNI-SYNSETS-CAUSING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_synsets_causing_helper", "CLEAR-WNI-SYNSETS-CAUSING-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_synsets_causing_helper", "REMOVE-WNI-SYNSETS-CAUSING-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_causing_helper_internal", "WNI-SYNSETS-CAUSING-HELPER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_causing_helper", "WNI-SYNSETS-CAUSING-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_urban_area_geographical_entity", "WNI-URBAN-AREA-GEOGRAPHICAL-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synsets_having_pos", "WNI-SYNSETS-HAVING-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_terms_synsets", "WNI-TERMS-SYNSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_broader_terms", "CLEAR-WNI-BROADER-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_broader_terms", "REMOVE-WNI-BROADER-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_broader_terms_internal", "WNI-BROADER-TERMS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_broader_terms", "WNI-BROADER-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_mapped_terms_and_synsets", "WNI-MAPPED-TERMS-AND-SYNSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_hypernyms_mappedP", "WNI-SYNSET-HYPERNYMS-MAPPED?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_mapped_terms", "WNI-MAPPED-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_mapped_terms_and_pos_offsets", "WNI-MAPPED-TERMS-AND-POS-OFFSETS", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_speech_part_offset_to_synset", "WNI-SPEECH-PART-OFFSET-TO-SYNSET", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_update_synset_with_term", "WNI-UPDATE-SYNSET-WITH-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_insert_concept_match_html", "WNI-INSERT-CONCEPT-MATCH-HTML", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_select_concept_match_html", "WNI-SELECT-CONCEPT-MATCH-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_delete_concept_match_html", "WNI-DELETE-CONCEPT-MATCH-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_delete_all_concept_match_html", "WNI-DELETE-ALL-CONCEPT-MATCH-HTML", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_unmapped_synsets_having_mapped_hypernym", "WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_trace_new_cyc_query", "WNI-TRACE-NEW-CYC-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_problem_store", "WNI-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "new_wni_problem_store", "NEW-WNI-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_problem_store_properties", "WNI-PROBLEM-STORE-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_unreified_synset", "WNI-UNREIFIED-SYNSET", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_reifiable_synset", "WNI-REIFIABLE-SYNSET", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_reifiable_synset_from_string", "WNI-REIFIABLE-SYNSET-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_synset_from_id_string", "WNI-SYNSET-FROM-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_ensure_naut", "WNI-ENSURE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_next_synset_with_status", "WNI-NEXT-SYNSET-WITH-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_unlocked_synsets_with_status", "WNI-UNLOCKED-SYNSETS-WITH-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_term_has_verb_semtransP", "WNI-TERM-HAS-VERB-SEMTRANS?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wni_term_has_verb_semtrans_helperP", "CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wni_term_has_verb_semtrans_helperP", "REMOVE-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_term_has_verb_semtrans_helperP_internal", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_term_has_verb_semtrans_helperP", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_gather_terms_for_matching", "WNI-GATHER-TERMS-FOR-MATCHING", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_exact_synset_term_matches", "WNI-EXACT-SYNSET-TERM-MATCHES", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_strong_synset_term_matches", "WNI-STRONG-SYNSET-TERM-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_weak_synset_term_matches", "WNI-WEAK-SYNSET-TERM-MATCHES", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_create_now", "WNI-CREATE-NOW", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_assert_wff", "WNI-ASSERT-WFF", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_unassert_import_statuses", "WNI-UNASSERT-IMPORT-STATUSES", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_unassert_import_status", "WNI-UNASSERT-IMPORT-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_import_statuses", "WNI-ASSERT-IMPORT-STATUSES", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_import_status", "WNI-ASSERT-IMPORT-STATUS", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_synset_mapping", "WNI-ASSERT-SYNSET-MAPPING", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_likely_synset_mapping", "WNI-ASSERT-LIKELY-SYNSET-MAPPING", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_quoted_isa_workflow_constant", "WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_isa_collection", "WNI-ASSERT-ISA-COLLECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_genls", "WNI-ASSERT-GENLS", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_unassert_genls", "WNI-UNASSERT-GENLS", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_isa", "WNI-ASSERT-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_isa_individual", "WNI-ASSERT-ISA-INDIVIDUAL", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_isa_agent_generic", "WNI-ASSERT-ISA-AGENT-GENERIC", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_reified_using", "WNI-ASSERT-REIFIED-USING", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_synset_note", "WNI-SYNSET-NOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_assert_synset_note", "WNI-ASSERT-SYNSET-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_unassert_synset_note", "WNI-UNASSERT-SYNSET-NOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_assert_comment", "WNI-ASSERT-COMMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_term_of_unit", "WNI-ASSERT-TERM-OF-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_lock_synset", "WNI-LOCK-SYNSET", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_unlock_synset", "WNI-UNLOCK-SYNSET", 1, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon", "WNI-ASSERT-HEURISTIC-LEXICON", 3, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon_for_collection", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION", 3, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon_for_collection_common", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION-COMMON", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon_for_individual", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-INDIVIDUAL", 3, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon_for_organism", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-ORGANISM", 3, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_heuristic_lexicon_for_chemical", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-CHEMICAL", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_hyphen_string", "WNI-ASSERT-LEXICON-FOR-HYPHEN-STRING", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_phrase", "WNI-ASSERT-LEXICON-FOR-PHRASE", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_multi_word_string", "WNI-ASSERT-LEXICON-FOR-MULTI-WORD-STRING", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_compound_string", "WNI-ASSERT-LEXICON-FOR-COMPOUND-STRING", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_denotation", "WNI-ASSERT-LEXICON-FOR-DENOTATION", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_existing_denotation", "WNI-ASSERT-LEXICON-FOR-EXISTING-DENOTATION", 4, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexical_annotations", "WNI-ASSERT-LEXICAL-ANNOTATIONS", 3, 1, false );
    SubLFiles.declareFunction( me, "wni_politeness", "WNI-POLITENESS", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_formality", "WNI-FORMALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_rhetorical_device", "WNI-RHETORICAL-DEVICE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_person", "WNI-ASSERT-LEXICON-FOR-PERSON", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_urban_area", "WNI-ASSERT-LEXICON-FOR-URBAN-AREA", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_lexicon_for_geographical_area", "WNI-ASSERT-LEXICON-FOR-GEOGRAPHICAL-AREA", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_name_string", "WNI-ASSERT-NAME-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_acronym", "WNI-ASSERT-ACRONYM", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_assert_initialism", "WNI-ASSERT-INITIALISM", 2, 1, false );
    SubLFiles.declareFunction( me, "wni_heuristic_pos", "WNI-HEURISTIC-POS", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_number_of_workflow_mapped_terms", "WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_number_of_new_concepts_imported_from_wordnet", "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_number_of_new_denotations_imported_from_wordet", "WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_role_info_print_function_trampoline", "WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_role_info_p", "WNI-ROLE-INFO-P", 1, 0, false );
    new $wni_role_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "wni_role", "WNI-ROLE", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_filler", "WNI-FILLER", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_defining_col", "WNI-DEFINING-COL", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_defining_pred", "WNI-DEFINING-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_subsumption_status", "WNI-SUBSUMPTION-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wni_role", "_CSETF-WNI-ROLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wni_filler", "_CSETF-WNI-FILLER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wni_defining_col", "_CSETF-WNI-DEFINING-COL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wni_defining_pred", "_CSETF-WNI-DEFINING-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_wni_subsumption_status", "_CSETF-WNI-SUBSUMPTION-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_wni_role_info", "MAKE-WNI-ROLE-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_wni_role_info", "VISIT-DEFSTRUCT-WNI-ROLE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_wni_role_info_method", "VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_print_role_info", "WNI-PRINT-ROLE-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "wni_gather_roles_and_traits", "WNI-GATHER-ROLES-AND-TRAITS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_find_compatible_roles", "WNI-FIND-COMPATIBLE-ROLES", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_genl_preds_helper", "WNI-GENL-PREDS-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_gather_roles", "WNI-GATHER-ROLES", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_gather_traits", "WNI-GATHER-TRAITS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_bindings_to_role_infos", "WNI-BINDINGS-TO-ROLE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_sort_key_1", "WNI-SORT-KEY-1", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_most_specific_fillers", "WNI-MOST-SPECIFIC-FILLERS", 1, 0, false );
    SubLFiles.declareFunction( me, "wni_clear_function_caches", "WNI-CLEAR-FUNCTION-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_create_workflow_alist_with_unmapped_hypernym_chain", "WNI-CREATE-WORKFLOW-ALIST-WITH-UNMAPPED-HYPERNYM-CHAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_server", "WNI-ACCESS-PATH-SERVER", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_port", "WNI-ACCESS-PATH-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_proxy_server", "WNI-ACCESS-PATH-PROXY-SERVER", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_proxy_port", "WNI-ACCESS-PATH-PROXY-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_timeout", "WNI-ACCESS-PATH-TIMEOUT", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_db", "WNI-ACCESS-PATH-DB", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_user", "WNI-ACCESS-PATH-USER", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_password", "WNI-ACCESS-PATH-PASSWORD", 0, 0, false );
    SubLFiles.declareFunction( me, "wni_access_path_subprotocol", "WNI-ACCESS-PATH-SUBPROTOCOL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_wordnet_import_file()
  {
    $wordnet_import_core_constants$ = SubLFiles.deflexical( "*WORDNET-IMPORT-CORE-CONSTANTS*", $list0 );
    $wni_pos_map$ = SubLFiles.defconstant( "*WNI-POS-MAP*", $list2 );
    $wni_1_char_pos_map$ = SubLFiles.defconstant( "*WNI-1-CHAR-POS-MAP*", $list3 );
    $wni_unranked_synsets_for_english_word_string_caching_state$ = SubLFiles.deflexical( "*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL );
    $wni_synsets_for_english_word_stringXpos_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", NIL );
    $wni_synsets_for_english_word_string_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL );
    $wni_synset_collectionP_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-COLLECTION?-CACHING-STATE*", NIL );
    $wni_synset_words_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", NIL );
    $wni_synset_example_phrases_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", NIL );
    $wni_verb_frame_generalities$ = SubLFiles.defconstant( "*WNI-VERB-FRAME-GENERALITIES*", $list65 );
    $wni_least_general_frame_generality_score$ = SubLFiles.defconstant( "*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", SIX_INTEGER );
    $wni_synset_verb_frames_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", NIL );
    $wni_verb_frames_for_word_caching_state$ = SubLFiles.deflexical( "*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", NIL );
    $wni_hypernyms_helper_caching_state$ = SubLFiles.deflexical( "*WNI-HYPERNYMS-HELPER-CACHING-STATE*", NIL );
    $wni_all_hypernyms_helper_caching_state$ = SubLFiles.deflexical( "*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", NIL );
    $wni_hyponyms_helper_caching_state$ = SubLFiles.deflexical( "*WNI-HYPONYMS-HELPER-CACHING-STATE*", NIL );
    $wni_all_hyponyms_helper_caching_state$ = SubLFiles.deflexical( "*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", NIL );
    $wni_derived_forms_helper_caching_state$ = SubLFiles.deflexical( "*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", NIL );
    $wni_synset_gloss_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", NIL );
    $wni_synset_pos_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-POS-HELPER-CACHING-STATE*", NIL );
    $wni_synset_speech_part_offset_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", NIL );
    $wni_synset_term_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", NIL );
    $wni_synset_wXo_links_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", NIL );
    $wni_synsets_caused_by_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", NIL );
    $wni_synsets_causing_helper_caching_state$ = SubLFiles.deflexical( "*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", NIL );
    $wni_broader_terms_caching_state$ = SubLFiles.deflexical( "*WNI-BROADER-TERMS-CACHING-STATE*", NIL );
    $wni_problem_store$ = SubLFiles.defparameter( "*WNI-PROBLEM-STORE*", NIL );
    $wni_term_has_verb_semtrans_helperP_caching_state$ = SubLFiles.deflexical( "*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", NIL );
    $wni_maximum_nbr_of_terms_to_gather_for_matching$ = SubLFiles.defconstant( "*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", TWENTY_INTEGER );
    $wni_very_verbose_exact_synset_term_matches$ = SubLFiles.defparameter( "*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL );
    $wni_verbose_exact_synset_term_matches$ = SubLFiles.defparameter( "*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL );
    $person_synset$ = SubLFiles.defconstant( "*PERSON-SYNSET*", $list309 );
    $organism_being_synset$ = SubLFiles.defconstant( "*ORGANISM-BEING-SYNSET*", $list310 );
    $chemical_compound_synset$ = SubLFiles.defconstant( "*CHEMICAL-COMPOUND-SYNSET*", $list311 );
    $country_synset$ = SubLFiles.defconstant( "*COUNTRY-SYNSET*", $list313 );
    $urban_area_synset$ = SubLFiles.defconstant( "*URBAN-AREA-SYNSET*", $list314 );
    $geographical_area_synset$ = SubLFiles.defconstant( "*GEOGRAPHICAL-AREA-SYNSET*", $list315 );
    $dtp_wni_role_info$ = SubLFiles.defconstant( "*DTP-WNI-ROLE-INFO*", $sym393$WNI_ROLE_INFO );
    $wordnet_import_access_path$ = SubLFiles.deflexical( "*WORDNET-IMPORT-ACCESS-PATH*", NIL );
    return NIL;
  }

  public static SubLObject setup_wordnet_import_file()
  {
    memoization_state.note_globally_cached_function( $sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING );
    memoization_state.note_globally_cached_function( $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS );
    memoization_state.note_globally_cached_function( $sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING );
    memoization_state.note_globally_cached_function( $sym29$WNI_SYNSET_COLLECTION_ );
    access_macros.register_external_symbol( $sym33$WNI_SYNSET_INDIVIDUALS );
    access_macros.register_external_symbol( $sym35$WNI_EXCLUDE_SITUATIONS );
    access_macros.register_external_symbol( $sym39$WNI_EXCLUDE_RELATIONS );
    access_macros.register_external_symbol( $sym42$WNI_EXCLUDE_SKIPPED );
    access_macros.register_external_symbol( $sym45$WNI_SYNSET_ID );
    access_macros.register_external_symbol( $sym48$WNI_SYNSET_WORDS );
    access_macros.register_external_symbol( $sym49$WNI_SYNSETS_EQUAL );
    memoization_state.note_globally_cached_function( $sym50$WNI_SYNSET_WORDS_HELPER );
    access_macros.register_external_symbol( $sym59$WNI_SYNSET_EXAMPLE_PHRASES );
    memoization_state.note_globally_cached_function( $sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER );
    access_macros.register_external_symbol( $sym66$WNI_MOST_GENERAL_SYNSET_VERB_FRAME );
    access_macros.register_external_symbol( $sym68$WNI_SYNSET_VERB_FRAMES );
    memoization_state.note_globally_cached_function( $sym69$WNI_SYNSET_VERB_FRAMES_HELPER );
    memoization_state.note_globally_cached_function( $sym75$WNI_VERB_FRAMES_FOR_WORD );
    access_macros.register_external_symbol( $sym77$WNI_HYPERNYMS );
    memoization_state.note_globally_cached_function( $sym78$WNI_HYPERNYMS_HELPER );
    access_macros.register_external_symbol( $sym82$WNI_ALL_HYPERNYMS );
    memoization_state.note_globally_cached_function( $sym83$WNI_ALL_HYPERNYMS_HELPER );
    access_macros.register_external_symbol( $sym85$WNI_ALL_HYPERNYM_ );
    access_macros.register_external_symbol( $sym86$WNI_HYPONYMS );
    memoization_state.note_globally_cached_function( $sym87$WNI_HYPONYMS_HELPER );
    access_macros.register_external_symbol( $sym90$WNI_ALL_HYPONYMS );
    memoization_state.note_globally_cached_function( $sym91$WNI_ALL_HYPONYMS_HELPER );
    access_macros.register_external_symbol( $sym93$WNI_ANY_HYPONYM_AN_INDIVIDUAL );
    access_macros.register_external_symbol( $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ );
    access_macros.register_external_symbol( $sym96$WNI_DERIVED_FORMS );
    memoization_state.note_globally_cached_function( $sym97$WNI_DERIVED_FORMS_HELPER );
    access_macros.register_external_symbol( $sym101$WNI_SYNSET_GLOSS );
    memoization_state.note_globally_cached_function( $sym102$WNI_SYNSET_GLOSS_HELPER );
    access_macros.register_external_symbol( $sym107$WNI_SYNSET_POS );
    memoization_state.note_globally_cached_function( $sym108$WNI_SYNSET_POS_HELPER );
    access_macros.register_external_symbol( $sym113$WNI_SYNSET_SPEECH_PART_OFFSET );
    memoization_state.note_globally_cached_function( $sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER );
    access_macros.register_external_symbol( $sym121$WNI_HYPERNYM_TERMS );
    access_macros.register_external_symbol( $sym122$WNI_HYPERNYM_MAPPED_ );
    access_macros.register_external_symbol( $sym123$WNI_SYNSET_TERM );
    memoization_state.note_globally_cached_function( $sym124$WNI_SYNSET_TERM_HELPER );
    access_macros.register_external_symbol( $sym131$WNI_UNMAPPED_HYPERNYM_CHAIN );
    access_macros.register_external_symbol( $sym132$WNI_SYNSET_W_O_LINKS );
    memoization_state.note_globally_cached_function( $sym133$WNI_SYNSET_W_O_LINKS_HELPER );
    access_macros.register_external_symbol( $sym139$WNI_SYNSET_IS_CAUSER_ );
    access_macros.register_external_symbol( $sym140$WNI_SYNSETS_CAUSED_BY );
    memoization_state.note_globally_cached_function( $sym141$WNI_SYNSETS_CAUSED_BY_HELPER );
    access_macros.register_external_symbol( $sym145$WNI_SYNSET_IS_CAUSED_BY_ );
    access_macros.register_external_symbol( $sym146$WNI_SYNSETS_CAUSING );
    memoization_state.note_globally_cached_function( $sym147$WNI_SYNSETS_CAUSING_HELPER );
    access_macros.register_external_symbol( $sym170$WNI_SYNSETS_HAVING_POS );
    access_macros.register_external_symbol( $sym171$WNI_TERMS_SYNSETS );
    memoization_state.note_globally_cached_function( $sym175$WNI_BROADER_TERMS );
    access_macros.register_external_symbol( $sym179$WNI_MAPPED_TERMS_AND_SYNSETS );
    access_macros.register_external_symbol( $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_ );
    access_macros.register_external_symbol( $sym183$WNI_MAPPED_TERMS );
    access_macros.register_external_symbol( $sym186$WNI_MAPPED_TERMS_AND_POS_OFFSETS );
    access_macros.register_external_symbol( $sym188$WNI_SPEECH_PART_OFFSET_TO_SYNSET );
    access_macros.register_external_symbol( $sym190$WNI_UPDATE_SYNSET_WITH_TERM );
    access_macros.register_external_symbol( $sym193$WNI_INSERT_CONCEPT_MATCH_HTML );
    access_macros.register_external_symbol( $sym198$WNI_SELECT_CONCEPT_MATCH_HTML );
    access_macros.register_external_symbol( $sym200$WNI_DELETE_CONCEPT_MATCH_HTML );
    access_macros.register_external_symbol( $sym201$WNI_DELETE_ALL_CONCEPT_MATCH_HTML );
    access_macros.register_external_symbol( $sym203$WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM );
    access_macros.register_external_symbol( $sym34$WNI_UNREIFIED_SYNSET );
    access_macros.register_external_symbol( $sym215$WNI_REIFIABLE_SYNSET );
    access_macros.register_external_symbol( $sym217$WNI_REIFIABLE_SYNSET_FROM_STRING );
    access_macros.register_external_symbol( $sym218$WNI_SYNSET_FROM_ID_STRING );
    access_macros.register_external_symbol( $sym220$WNI_ENSURE_NAUT );
    access_macros.register_external_symbol( $sym221$WNI_NEXT_SYNSET_WITH_STATUS );
    access_macros.register_external_symbol( $sym226$WNI_UNLOCKED_SYNSETS_WITH_STATUS );
    access_macros.register_external_symbol( $sym227$WNI_TERM_HAS_VERB_SEMTRANS_ );
    memoization_state.note_globally_cached_function( $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ );
    access_macros.register_external_symbol( $sym241$WNI_GATHER_TERMS_FOR_MATCHING );
    access_macros.register_external_symbol( $sym242$WNI_EXACT_SYNSET_TERM_MATCHES );
    access_macros.register_external_symbol( $sym249$WNI_STRONG_SYNSET_TERM_MATCHES );
    access_macros.register_external_symbol( $sym256$WNI_WEAK_SYNSET_TERM_MATCHES );
    access_macros.register_external_symbol( $sym257$WNI_CREATE_NOW );
    access_macros.register_external_symbol( $sym259$WNI_ASSERT_WFF );
    access_macros.register_external_symbol( $sym263$WNI_UNASSERT_IMPORT_STATUSES );
    access_macros.register_external_symbol( $sym264$WNI_UNASSERT_IMPORT_STATUS );
    access_macros.register_external_symbol( $sym265$WNI_ASSERT_IMPORT_STATUSES );
    access_macros.register_external_symbol( $sym266$WNI_ASSERT_IMPORT_STATUS );
    access_macros.register_external_symbol( $sym269$WNI_ASSERT_SYNSET_MAPPING );
    access_macros.register_external_symbol( $sym270$WNI_ASSERT_LIKELY_SYNSET_MAPPING );
    access_macros.register_external_symbol( $sym272$WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT );
    access_macros.register_external_symbol( $sym276$WNI_ASSERT_ISA_COLLECTION );
    access_macros.register_external_symbol( $sym279$WNI_ASSERT_GENLS );
    access_macros.register_external_symbol( $sym281$WNI_UNASSERT_GENLS );
    access_macros.register_external_symbol( $sym282$WNI_ASSERT_ISA );
    access_macros.register_external_symbol( $sym284$WNI_ASSERT_ISA_INDIVIDUAL );
    access_macros.register_external_symbol( $sym286$WNI_ASSERT_ISA_AGENT_GENERIC );
    access_macros.register_external_symbol( $sym289$WNI_ASSERT_REIFIED_USING );
    access_macros.register_external_symbol( $sym292$WNI_SYNSET_NOTE );
    access_macros.register_external_symbol( $sym296$WNI_ASSERT_SYNSET_NOTE );
    access_macros.register_external_symbol( $sym297$WNI_UNASSERT_SYNSET_NOTE );
    access_macros.register_external_symbol( $sym298$WNI_ASSERT_COMMENT );
    access_macros.register_external_symbol( $sym300$WNI_ASSERT_TERM_OF_UNIT );
    access_macros.register_external_symbol( $sym303$WNI_LOCK_SYNSET );
    access_macros.register_external_symbol( $sym305$WNI_UNLOCK_SYNSET );
    access_macros.register_external_symbol( $sym307$WNI_ASSERT_HEURISTIC_LEXICON );
    access_macros.register_external_symbol( $sym383$WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS );
    access_macros.register_external_symbol( $sym386$WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET );
    access_macros.register_external_symbol( $sym391$WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_wni_role_info$.getGlobalValue(), Symbols.symbol_function( $sym400$WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list401 );
    Structures.def_csetf( $sym402$WNI_ROLE, $sym403$_CSETF_WNI_ROLE );
    Structures.def_csetf( $sym404$WNI_FILLER, $sym405$_CSETF_WNI_FILLER );
    Structures.def_csetf( $sym406$WNI_DEFINING_COL, $sym407$_CSETF_WNI_DEFINING_COL );
    Structures.def_csetf( $sym408$WNI_DEFINING_PRED, $sym409$_CSETF_WNI_DEFINING_PRED );
    Structures.def_csetf( $sym410$WNI_SUBSUMPTION_STATUS, $sym411$_CSETF_WNI_SUBSUMPTION_STATUS );
    Equality.identity( $sym393$WNI_ROLE_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_wni_role_info$.getGlobalValue(), Symbols.symbol_function( $sym422$VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD ) );
    access_macros.register_external_symbol( $sym425$WNI_GATHER_ROLES_AND_TRAITS );
    access_macros.register_external_symbol( $sym427$WNI_FIND_COMPATIBLE_ROLES );
    access_macros.register_external_symbol( $sym457$WNI_CLEAR_FUNCTION_CACHES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wordnet_import_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wordnet_import_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wordnet_import_file();
  }
  static
  {
    me = new wordnet_import();
    $wordnet_import_core_constants$ = null;
    $wni_pos_map$ = null;
    $wni_1_char_pos_map$ = null;
    $wni_unranked_synsets_for_english_word_string_caching_state$ = null;
    $wni_synsets_for_english_word_stringXpos_caching_state$ = null;
    $wni_synsets_for_english_word_string_caching_state$ = null;
    $wni_synset_collectionP_caching_state$ = null;
    $wni_synset_words_helper_caching_state$ = null;
    $wni_synset_example_phrases_helper_caching_state$ = null;
    $wni_verb_frame_generalities$ = null;
    $wni_least_general_frame_generality_score$ = null;
    $wni_synset_verb_frames_helper_caching_state$ = null;
    $wni_verb_frames_for_word_caching_state$ = null;
    $wni_hypernyms_helper_caching_state$ = null;
    $wni_all_hypernyms_helper_caching_state$ = null;
    $wni_hyponyms_helper_caching_state$ = null;
    $wni_all_hyponyms_helper_caching_state$ = null;
    $wni_derived_forms_helper_caching_state$ = null;
    $wni_synset_gloss_helper_caching_state$ = null;
    $wni_synset_pos_helper_caching_state$ = null;
    $wni_synset_speech_part_offset_helper_caching_state$ = null;
    $wni_synset_term_helper_caching_state$ = null;
    $wni_synset_wXo_links_helper_caching_state$ = null;
    $wni_synsets_caused_by_helper_caching_state$ = null;
    $wni_synsets_causing_helper_caching_state$ = null;
    $wni_broader_terms_caching_state$ = null;
    $wni_problem_store$ = null;
    $wni_term_has_verb_semtrans_helperP_caching_state$ = null;
    $wni_maximum_nbr_of_terms_to_gather_for_matching$ = null;
    $wni_very_verbose_exact_synset_term_matches$ = null;
    $wni_verbose_exact_synset_term_matches$ = null;
    $person_synset$ = null;
    $organism_being_synset$ = null;
    $chemical_compound_synset$ = null;
    $country_synset$ = null;
    $urban_area_synset$ = null;
    $geographical_area_synset$ = null;
    $dtp_wni_role_info$ = null;
    $wordnet_import_access_path$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "Noun" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Adjective" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetMemberWord" ) ), constant_handles.reader_make_constant_shell( makeString(
            "WordNetEnglishWordFn" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowCollectorMt" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNet2_0-KS" ) ),
      constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-DeterminedIndividual" ) ), constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ), constant_handles
          .reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowDataStatusMt" ) ), constant_handles.reader_make_constant_shell(
              makeString( "Situation" ) ), constant_handles.reader_make_constant_shell( makeString( "Relation" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-Skip" ) ),
      constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetWord" ) ), constant_handles.reader_make_constant_shell( makeString(
          "WordNetWordSenseFn" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetExamplePhraseWithPosition" ) ), constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-8" ) ),
      constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-1" ) ), constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-9" ) ), constant_handles.reader_make_constant_shell( makeString(
          "WNVerbFrame-11" ) ), constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-22" ) ), constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-4" ) ), constant_handles
              .reader_make_constant_shell( makeString( "WNVerbFrame-2" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetVerbFrame" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "wnHypernym" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetGloss" ) ), constant_handles.reader_make_constant_shell( makeString( "wnSynsetSpeechPart" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "WordNetSynsetReifiedFn" ) ), constant_handles.reader_make_constant_shell( makeString( "wnWorkflowSynsetLock" ) )
    } );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $list2 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ), makeString( "Noun" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
        "Verb" ) ), makeString( "Verb" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), makeString( "Adjective" ) ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "Adverb" ) ), makeString( "Adverb" ) ) );
    $list3 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ), makeString( "N" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ),
        makeString( "V" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), makeString( "A" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
            "Adverb" ) ), makeString( "R" ) ) );
    $sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol( "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING" );
    $sym5$STRINGP = makeSymbol( "STRINGP" );
    $const6$wnSynsetMemberWord = constant_handles.reader_make_constant_shell( makeString( "wnSynsetMemberWord" ) );
    $sym7$_SYNSET = makeSymbol( "?SYNSET" );
    $const8$WordNetEnglishWordFn = constant_handles.reader_make_constant_shell( makeString( "WordNetEnglishWordFn" ) );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), NIL, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ),
      makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword(
          "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $const10$WordNetWorkflowCollectorMt = constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowCollectorMt" ) );
    $sym11$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym12$NAUT_P = makeSymbol( "NAUT-P" );
    $sym13$_WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_ = makeSymbol( "*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*" );
    $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS = makeSymbol( "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS" );
    $str15$select_synset_id_from_WordSense_w = makeString( "select synset_id from WordSense where word = '" );
    $str16$__and_pos____ = makeString( "' and pos = '" );
    $str17$__order_by_word_sense = makeString( "' order by word_sense" );
    $kw18$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
    $kw19$PORT = makeKeyword( "PORT" );
    $kw20$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $kw21$PROXY_SERVER = makeKeyword( "PROXY-SERVER" );
    $kw22$TIMEOUT = makeKeyword( "TIMEOUT" );
    $const23$WordNetSynsetFn = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) );
    $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_ = makeSymbol( "*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*" );
    $sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol( "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING" );
    $const26$WordNet2_0_KS = constant_handles.reader_make_constant_shell( makeString( "WordNet2_0-KS" ) );
    $str27$__order_by_pos__word_sense = makeString( "' order by pos, word_sense" );
    $sym28$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_ = makeSymbol( "*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*" );
    $sym29$WNI_SYNSET_COLLECTION_ = makeSymbol( "WNI-SYNSET-COLLECTION?" );
    $const30$WordNetSynsetImportStatus_Determi = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-DeterminedIndividual" ) );
    $const31$WordNetWorkflowDataStatusMt = constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowDataStatusMt" ) );
    $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-COLLECTION?-CACHING-STATE*" );
    $sym33$WNI_SYNSET_INDIVIDUALS = makeSymbol( "WNI-SYNSET-INDIVIDUALS" );
    $sym34$WNI_UNREIFIED_SYNSET = makeSymbol( "WNI-UNREIFIED-SYNSET" );
    $sym35$WNI_EXCLUDE_SITUATIONS = makeSymbol( "WNI-EXCLUDE-SITUATIONS" );
    $str36$excluding_specs_of___Situation = makeString( "excluding specs of #$Situation" );
    $str37$cdolist = makeString( "cdolist" );
    $const38$Situation = constant_handles.reader_make_constant_shell( makeString( "Situation" ) );
    $sym39$WNI_EXCLUDE_RELATIONS = makeSymbol( "WNI-EXCLUDE-RELATIONS" );
    $str40$excluding_specs_of___Relation = makeString( "excluding specs of #$Relation" );
    $const41$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $sym42$WNI_EXCLUDE_SKIPPED = makeSymbol( "WNI-EXCLUDE-SKIPPED" );
    $str43$excluding_skipped_synsets = makeString( "excluding skipped synsets" );
    $const44$WordNetSynsetImportStatus_Skip = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetImportStatus-Skip" ) );
    $sym45$WNI_SYNSET_ID = makeSymbol( "WNI-SYNSET-ID" );
    $sym46$POSSIBLY_NAUT_P = makeSymbol( "POSSIBLY-NAUT-P" );
    $sym47$INTEGERP = makeSymbol( "INTEGERP" );
    $sym48$WNI_SYNSET_WORDS = makeSymbol( "WNI-SYNSET-WORDS" );
    $sym49$WNI_SYNSETS_EQUAL = makeSymbol( "WNI-SYNSETS-EQUAL" );
    $sym50$WNI_SYNSET_WORDS_HELPER = makeSymbol( "WNI-SYNSET-WORDS-HELPER" );
    $const51$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym52$_POS = makeSymbol( "?POS" );
    $sym53$_SENSE = makeSymbol( "?SENSE" );
    $const54$wnSynsetWord = constant_handles.reader_make_constant_shell( makeString( "wnSynsetWord" ) );
    $list55 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetWordSenseFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "WordNetEnglishWordFn" ) ), makeSymbol( "?STRING" ) ), makeSymbol( "?POS" ), makeSymbol( "?SENSE" ) ), makeSymbol( "?WORD-INDEX" ) );
    $sym56$_ = makeSymbol( "<" );
    $sym57$SECOND = makeSymbol( "SECOND" );
    $sym58$_WNI_SYNSET_WORDS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*" );
    $sym59$WNI_SYNSET_EXAMPLE_PHRASES = makeSymbol( "WNI-SYNSET-EXAMPLE-PHRASES" );
    $sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER = makeSymbol( "WNI-SYNSET-EXAMPLE-PHRASES-HELPER" );
    $const61$wnSynsetExamplePhraseWithPosition = constant_handles.reader_make_constant_shell( makeString( "wnSynsetExamplePhraseWithPosition" ) );
    $list62 = ConsesLow.list( makeSymbol( "?EXAMPLE-PHRASE" ), makeSymbol( "?INDEX" ) );
    $sym63$FIRST = makeSymbol( "FIRST" );
    $sym64$_WNI_SYNSET_EXAMPLE_PHRASES_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*" );
    $list65 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-8" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
        "WNVerbFrame-2" ) ), FIVE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-1" ) ), FOUR_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "WNVerbFrame-9" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-11" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                .reader_make_constant_shell( makeString( "WNVerbFrame-22" ) ), FIVE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "WNVerbFrame-4" ) ), FOUR_INTEGER ) );
    $sym66$WNI_MOST_GENERAL_SYNSET_VERB_FRAME = makeSymbol( "WNI-MOST-GENERAL-SYNSET-VERB-FRAME" );
    $sym67$FORT_P = makeSymbol( "FORT-P" );
    $sym68$WNI_SYNSET_VERB_FRAMES = makeSymbol( "WNI-SYNSET-VERB-FRAMES" );
    $sym69$WNI_SYNSET_VERB_FRAMES_HELPER = makeSymbol( "WNI-SYNSET-VERB-FRAMES-HELPER" );
    $const70$wnSynsetVerbFrame = constant_handles.reader_make_constant_shell( makeString( "wnSynsetVerbFrame" ) );
    $list71 = ConsesLow.list( makeSymbol( "?VERB-FRAME" ) );
    $list72 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), NIL, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ),
      makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?VERB-FRAME" ) ), makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword(
          "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $sym73$_WNI_SYNSET_VERB_FRAMES_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*" );
    $int74$1000 = makeInteger( 1000 );
    $sym75$WNI_VERB_FRAMES_FOR_WORD = makeSymbol( "WNI-VERB-FRAMES-FOR-WORD" );
    $sym76$_WNI_VERB_FRAMES_FOR_WORD_CACHING_STATE_ = makeSymbol( "*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*" );
    $sym77$WNI_HYPERNYMS = makeSymbol( "WNI-HYPERNYMS" );
    $sym78$WNI_HYPERNYMS_HELPER = makeSymbol( "WNI-HYPERNYMS-HELPER" );
    $const79$wnHypernym = constant_handles.reader_make_constant_shell( makeString( "wnHypernym" ) );
    $list80 = ConsesLow.list( makeSymbol( "?HYPERNYM-SYNSET" ) );
    $sym81$_WNI_HYPERNYMS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-HYPERNYMS-HELPER-CACHING-STATE*" );
    $sym82$WNI_ALL_HYPERNYMS = makeSymbol( "WNI-ALL-HYPERNYMS" );
    $sym83$WNI_ALL_HYPERNYMS_HELPER = makeSymbol( "WNI-ALL-HYPERNYMS-HELPER" );
    $sym84$_WNI_ALL_HYPERNYMS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*" );
    $sym85$WNI_ALL_HYPERNYM_ = makeSymbol( "WNI-ALL-HYPERNYM?" );
    $sym86$WNI_HYPONYMS = makeSymbol( "WNI-HYPONYMS" );
    $sym87$WNI_HYPONYMS_HELPER = makeSymbol( "WNI-HYPONYMS-HELPER" );
    $sym88$_HYPONYM_SYNSET = makeSymbol( "?HYPONYM-SYNSET" );
    $sym89$_WNI_HYPONYMS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-HYPONYMS-HELPER-CACHING-STATE*" );
    $sym90$WNI_ALL_HYPONYMS = makeSymbol( "WNI-ALL-HYPONYMS" );
    $sym91$WNI_ALL_HYPONYMS_HELPER = makeSymbol( "WNI-ALL-HYPONYMS-HELPER" );
    $sym92$_WNI_ALL_HYPONYMS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*" );
    $sym93$WNI_ANY_HYPONYM_AN_INDIVIDUAL = makeSymbol( "WNI-ANY-HYPONYM-AN-INDIVIDUAL" );
    $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ = makeSymbol( "WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?" );
    $const95$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $sym96$WNI_DERIVED_FORMS = makeSymbol( "WNI-DERIVED-FORMS" );
    $sym97$WNI_DERIVED_FORMS_HELPER = makeSymbol( "WNI-DERIVED-FORMS-HELPER" );
    $str98$SELECT_DISTINCT_synsetpointer_syn = makeString( "SELECT DISTINCT synsetpointer.synset_id \n               FROM synsetpointer \n               WHERE \n                 synsetpointer.target_synset_id = " );
    $str99$_AND____________________synsetpoi = makeString(
        " AND \n                 (synsetpointer.source_pos = 'n' OR\n                  synsetpointer.source_pos = 'a' OR\n                  synsetpointer.source_pos = 'r') AND \n                 synsetpointer.pointer_type = '+'" );
    $sym100$_WNI_DERIVED_FORMS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*" );
    $sym101$WNI_SYNSET_GLOSS = makeSymbol( "WNI-SYNSET-GLOSS" );
    $sym102$WNI_SYNSET_GLOSS_HELPER = makeSymbol( "WNI-SYNSET-GLOSS-HELPER" );
    $const103$wnSynsetGloss = constant_handles.reader_make_constant_shell( makeString( "wnSynsetGloss" ) );
    $list104 = ConsesLow.list( makeSymbol( "?GLOSS" ) );
    $list105 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ),
      makeKeyword( "HL" ), makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?GLOSS" ) ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "CONTINUABLE?" ), NIL,
      makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $sym106$_WNI_SYNSET_GLOSS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*" );
    $sym107$WNI_SYNSET_POS = makeSymbol( "WNI-SYNSET-POS" );
    $sym108$WNI_SYNSET_POS_HELPER = makeSymbol( "WNI-SYNSET-POS-HELPER" );
    $const109$wnSynsetSpeechPart = constant_handles.reader_make_constant_shell( makeString( "wnSynsetSpeechPart" ) );
    $list110 = ConsesLow.list( makeSymbol( "?POS" ) );
    $list111 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ),
      makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?POS" ) ), makeKeyword(
          "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $sym112$_WNI_SYNSET_POS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-POS-HELPER-CACHING-STATE*" );
    $sym113$WNI_SYNSET_SPEECH_PART_OFFSET = makeSymbol( "WNI-SYNSET-SPEECH-PART-OFFSET" );
    $sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER = makeSymbol( "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER" );
    $sym115$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $const116$wnSynsetSpeechPartOffset = constant_handles.reader_make_constant_shell( makeString( "wnSynsetSpeechPartOffset" ) );
    $list117 = ConsesLow.list( makeSymbol( "?SPEECH-PART-OFFSET" ) );
    $list118 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol(
            "?SPEECH-PART-OFFSET" ) ), makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ),
      makeKeyword( "POSITIVE-INFINITY" )
    } );
    $sym119$_WNI_SYNSET_SPEECH_PART_OFFSET_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*" );
    $int120$256 = makeInteger( 256 );
    $sym121$WNI_HYPERNYM_TERMS = makeSymbol( "WNI-HYPERNYM-TERMS" );
    $sym122$WNI_HYPERNYM_MAPPED_ = makeSymbol( "WNI-HYPERNYM-MAPPED?" );
    $sym123$WNI_SYNSET_TERM = makeSymbol( "WNI-SYNSET-TERM" );
    $sym124$WNI_SYNSET_TERM_HELPER = makeSymbol( "WNI-SYNSET-TERM-HELPER" );
    $sym125$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $const126$synonymousExternalConcept = constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) );
    $sym127$_TERM = makeSymbol( "?TERM" );
    $const128$WordNet_Version2_0 = constant_handles.reader_make_constant_shell( makeString( "WordNet-Version2_0" ) );
    $list129 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 0.95 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol(
            "?TERM" ) ), makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeInteger(
                2000000 )
    } );
    $sym130$_WNI_SYNSET_TERM_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-TERM-HELPER-CACHING-STATE*" );
    $sym131$WNI_UNMAPPED_HYPERNYM_CHAIN = makeSymbol( "WNI-UNMAPPED-HYPERNYM-CHAIN" );
    $sym132$WNI_SYNSET_W_O_LINKS = makeSymbol( "WNI-SYNSET-W/O-LINKS" );
    $sym133$WNI_SYNSET_W_O_LINKS_HELPER = makeSymbol( "WNI-SYNSET-W/O-LINKS-HELPER" );
    $str134$_ = makeString( "(" );
    $str135$___ = makeString( " | " );
    $str136$_ = makeString( ")" );
    $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*" );
    $int138$100 = makeInteger( 100 );
    $sym139$WNI_SYNSET_IS_CAUSER_ = makeSymbol( "WNI-SYNSET-IS-CAUSER?" );
    $sym140$WNI_SYNSETS_CAUSED_BY = makeSymbol( "WNI-SYNSETS-CAUSED-BY" );
    $sym141$WNI_SYNSETS_CAUSED_BY_HELPER = makeSymbol( "WNI-SYNSETS-CAUSED-BY-HELPER" );
    $const142$wnCause = constant_handles.reader_make_constant_shell( makeString( "wnCause" ) );
    $list143 = ConsesLow.list( makeSymbol( "?CAUSED-SYNSET" ) );
    $sym144$_WNI_SYNSETS_CAUSED_BY_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*" );
    $sym145$WNI_SYNSET_IS_CAUSED_BY_ = makeSymbol( "WNI-SYNSET-IS-CAUSED-BY?" );
    $sym146$WNI_SYNSETS_CAUSING = makeSymbol( "WNI-SYNSETS-CAUSING" );
    $sym147$WNI_SYNSETS_CAUSING_HELPER = makeSymbol( "WNI-SYNSETS-CAUSING-HELPER" );
    $sym148$_CAUSING_SYNSET = makeSymbol( "?CAUSING-SYNSET" );
    $sym149$_WNI_SYNSETS_CAUSING_HELPER_CACHING_STATE_ = makeSymbol( "*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*" );
    $str150$ancient = makeString( "ancient" );
    $str151$Greek = makeString( "Greek" );
    $str152$_ = makeString( " " );
    $str153$Atlantic = makeString( "Atlantic" );
    $str154$Pacific = makeString( "Pacific" );
    $str155$Crown_Colony = makeString( "Crown Colony" );
    $str156$Caribbean = makeString( "Caribbean" );
    $str157$State = makeString( "State" );
    $str158$Lake_Erie = makeString( "Lake Erie" );
    $str159$Asia_Minor = makeString( "Asia Minor" );
    $str160$Elbo_River = makeString( "Elbo River" );
    $str161$Asian = makeString( "Asian" );
    $str162$Yourba = makeString( "Yourba" );
    $str163$Japanese = makeString( "Japanese" );
    $str164$Nile = makeString( "Nile" );
    $str165$River_Thames = makeString( "River Thames" );
    $str166$River_Aire = makeString( "River Aire" );
    $str167$_s = makeString( "'s" );
    $const168$GeopoliticalEntity = constant_handles.reader_make_constant_shell( makeString( "GeopoliticalEntity" ) );
    $const169$City = constant_handles.reader_make_constant_shell( makeString( "City" ) );
    $sym170$WNI_SYNSETS_HAVING_POS = makeSymbol( "WNI-SYNSETS-HAVING-POS" );
    $sym171$WNI_TERMS_SYNSETS = makeSymbol( "WNI-TERMS-SYNSETS" );
    $list172 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNet-Version2_0" ) ), makeSymbol( "?SPEECH-PART-OFFSET" ) );
    $list173 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), NIL, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ),
      makeDouble( 0.95 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword(
          "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeInteger( 2000000 )
    } );
    $sym174$_SPEECH_PART_OFFSET = makeSymbol( "?SPEECH-PART-OFFSET" );
    $sym175$WNI_BROADER_TERMS = makeSymbol( "WNI-BROADER-TERMS" );
    $const176$CycKBSubsetCollection = constant_handles.reader_make_constant_shell( makeString( "CycKBSubsetCollection" ) );
    $const177$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym178$_WNI_BROADER_TERMS_CACHING_STATE_ = makeSymbol( "*WNI-BROADER-TERMS-CACHING-STATE*" );
    $sym179$WNI_MAPPED_TERMS_AND_SYNSETS = makeSymbol( "WNI-MAPPED-TERMS-AND-SYNSETS" );
    $str180$finding_synsets_for_speech_part_o = makeString( "finding synsets for speech-part-offsets" );
    $sym181$LISTP = makeSymbol( "LISTP" );
    $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_ = makeSymbol( "WNI-SYNSET-HYPERNYMS-MAPPED?" );
    $sym183$WNI_MAPPED_TERMS = makeSymbol( "WNI-MAPPED-TERMS" );
    $list184 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?SPEECH-PART-OFFSET" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "synonymousExternalConcept" ) ), makeSymbol( "?TERM" ), constant_handles.reader_make_constant_shell( makeString( "WordNet-Version2_0" ) ), makeSymbol( "?SPEECH-PART-OFFSET" ) ) );
    $const185$WordNetMappingMt = constant_handles.reader_make_constant_shell( makeString( "WordNetMappingMt" ) );
    $sym186$WNI_MAPPED_TERMS_AND_POS_OFFSETS = makeSymbol( "WNI-MAPPED-TERMS-AND-POS-OFFSETS" );
    $list187 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "synonymousExternalConcept" ) ), makeSymbol( "?TERM" ), constant_handles.reader_make_constant_shell( makeString(
        "WordNet-Version2_0" ) ), makeSymbol( "?SPEECH-PART-OFFSET" ) );
    $sym188$WNI_SPEECH_PART_OFFSET_TO_SYNSET = makeSymbol( "WNI-SPEECH-PART-OFFSET-TO-SYNSET" );
    $list189 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword(
        "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ), makeKeyword( "BLOCK?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "CACHE-INFERENCE-RESULTS?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ),
      makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $sym190$WNI_UPDATE_SYNSET_WITH_TERM = makeSymbol( "WNI-UPDATE-SYNSET-WITH-TERM" );
    $list191 = ConsesLow.list( makeKeyword( "TIMEOUT" ), THREE_INTEGER );
    $str192$update_Synset_set_cyc_term_____A_ = makeString( "update Synset set cyc_term = '~A' where synset_id = ~S" );
    $sym193$WNI_INSERT_CONCEPT_MATCH_HTML = makeSymbol( "WNI-INSERT-CONCEPT-MATCH-HTML" );
    $str194$delete_from_ConceptMatchHTML_wher = makeString( "delete from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'" );
    $str195$insert_into_ConceptMatchHTML_valu = makeString( "insert into ConceptMatchHTML values(~A, '~A', '~A')" );
    $str196$__ = makeString( "''" );
    $str197$_ = makeString( "'" );
    $sym198$WNI_SELECT_CONCEPT_MATCH_HTML = makeSymbol( "WNI-SELECT-CONCEPT-MATCH-HTML" );
    $str199$select_html_from_ConceptMatchHTML = makeString( "select html from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'" );
    $sym200$WNI_DELETE_CONCEPT_MATCH_HTML = makeSymbol( "WNI-DELETE-CONCEPT-MATCH-HTML" );
    $sym201$WNI_DELETE_ALL_CONCEPT_MATCH_HTML = makeSymbol( "WNI-DELETE-ALL-CONCEPT-MATCH-HTML" );
    $str202$delete_from_ConceptMatchHTML_wher = makeString( "delete from ConceptMatchHTML where cyc_image_id ='~A'" );
    $sym203$WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM = makeSymbol( "WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM" );
    $str204$select_Synset_synset_id__________ = makeString(
        "select Synset.synset_id\n                 from \n                   Synset, \n                   Synset as target_synset, \n                   SynsetPointer\n                 where\n                   Synset.pos = '" );
    $str205$__and____________________Synset_c = makeString(
        "' and\n                   Synset.cyc_term is null and\n                   pointer_type = '@' and\n                   SynsetPointer.synset_id = Synset.synset_id and\n                   SynsetPointer.target_synset_id = target_synset.synset_id and\n                   target_synset.cyc_term is not null\n                 order by Synset.synset_id" );
    $sym206$HLMT_P = makeSymbol( "HLMT-P" );
    $sym207$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym208$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $kw209$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $str210$Destroying_invalid_WordNet_Import = makeString( "Destroying invalid WordNet Import problem store..." );
    $float211$0_9 = makeDouble( 0.9 );
    $str212$Destroying_90___full_WordNet_Impo = makeString( "Destroying 90%+ full WordNet Import problem store..." );
    $list213 = ConsesLow.list( makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "NONE" ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), NIL, makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL );
    $sym214$NART_P = makeSymbol( "NART-P" );
    $sym215$WNI_REIFIABLE_SYNSET = makeSymbol( "WNI-REIFIABLE-SYNSET" );
    $const216$WordNetSynsetReifiedFn = constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetReifiedFn" ) );
    $sym217$WNI_REIFIABLE_SYNSET_FROM_STRING = makeSymbol( "WNI-REIFIABLE-SYNSET-FROM-STRING" );
    $sym218$WNI_SYNSET_FROM_ID_STRING = makeSymbol( "WNI-SYNSET-FROM-ID-STRING" );
    $sym219$DIGIT_STRING_ = makeSymbol( "DIGIT-STRING?" );
    $sym220$WNI_ENSURE_NAUT = makeSymbol( "WNI-ENSURE-NAUT" );
    $sym221$WNI_NEXT_SYNSET_WITH_STATUS = makeSymbol( "WNI-NEXT-SYNSET-WITH-STATUS" );
    $const222$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const223$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym224$_REIFIED_SYNSET = makeSymbol( "?REIFIED-SYNSET" );
    $list225 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ),
        makeSymbol( "?CYCLIST" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?DATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "wnWorkflowSynsetLock" ) ), makeSymbol( "?REIFIED-SYNSET" ), makeSymbol( "?CYCLIST" ), makeSymbol( "?DATE" ) ) ) ) ) );
    $sym226$WNI_UNLOCKED_SYNSETS_WITH_STATUS = makeSymbol( "WNI-UNLOCKED-SYNSETS-WITH-STATUS" );
    $sym227$WNI_TERM_HAS_VERB_SEMTRANS_ = makeSymbol( "WNI-TERM-HAS-VERB-SEMTRANS?" );
    $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ = makeSymbol( "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?" );
    $sym229$_WORD_UNIT = makeSymbol( "?WORD-UNIT" );
    $sym230$_SENSE_NBR = makeSymbol( "?SENSE-NBR" );
    $const231$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $const232$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const233$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $sym234$_FRAME = makeSymbol( "?FRAME" );
    $sym235$_TRANS = makeSymbol( "?TRANS" );
    $const236$verbSemTrans_Canonical = constant_handles.reader_make_constant_shell( makeString( "verbSemTrans-Canonical" ) );
    $list237 = ConsesLow.list( makeSymbol( "?TRANS" ) );
    $list238 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ),
        makeSymbol( "?FRAME" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?TRANS" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "verbSemTrans" ) ), makeSymbol( "?WORD-UNIT" ), makeSymbol( "?SENSE-NBR" ), makeSymbol( "?FRAME" ), makeSymbol( "?TRANS" ) ) ) ) ) );
    $list239 = ConsesLow.list( NIL );
    $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_ = makeSymbol( "*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*" );
    $sym241$WNI_GATHER_TERMS_FOR_MATCHING = makeSymbol( "WNI-GATHER-TERMS-FOR-MATCHING" );
    $sym242$WNI_EXACT_SYNSET_TERM_MATCHES = makeSymbol( "WNI-EXACT-SYNSET-TERM-MATCHES" );
    $str243$___A_mapped_hypernyms__A___A__ = makeString( "~%~A mapped-hypernyms ~A~%~A~%" );
    $str244$__considering_word____a__ = makeString( "  considering word - ~a~%" );
    $str245$____possible_lexical_matches__A__ = makeString( "    possible lexical matches ~A~%" );
    $str246$____considering_term____a___const = makeString( "    considering term - ~a - constrained by mapped broader terms ~A~%" );
    $str247$___A_____A__structure___ = makeString( "~%~A  = ~A (structure)~%" );
    $str248$___A____A__lexicon___ = makeString( "~%~A = ~A (lexicon)~%" );
    $sym249$WNI_STRONG_SYNSET_TERM_MATCHES = makeSymbol( "WNI-STRONG-SYNSET-TERM-MATCHES" );
    $sym250$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw251$NOUN = makeKeyword( "NOUN" );
    $kw252$ALL_NOUN_FORMS = makeKeyword( "ALL-NOUN-FORMS" );
    $sym253$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym254$SET_OR_COLLECTION_ = makeSymbol( "SET-OR-COLLECTION?" );
    $sym255$INDIVIDUAL_ = makeSymbol( "INDIVIDUAL?" );
    $sym256$WNI_WEAK_SYNSET_TERM_MATCHES = makeSymbol( "WNI-WEAK-SYNSET-TERM-MATCHES" );
    $sym257$WNI_CREATE_NOW = makeSymbol( "WNI-CREATE-NOW" );
    $sym258$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym259$WNI_ASSERT_WFF = makeSymbol( "WNI-ASSERT-WFF" );
    $sym260$CONSP = makeSymbol( "CONSP" );
    $sym261$DIRECTION_P = makeSymbol( "DIRECTION-P" );
    $sym262$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $sym263$WNI_UNASSERT_IMPORT_STATUSES = makeSymbol( "WNI-UNASSERT-IMPORT-STATUSES" );
    $sym264$WNI_UNASSERT_IMPORT_STATUS = makeSymbol( "WNI-UNASSERT-IMPORT-STATUS" );
    $sym265$WNI_ASSERT_IMPORT_STATUSES = makeSymbol( "WNI-ASSERT-IMPORT-STATUSES" );
    $sym266$WNI_ASSERT_IMPORT_STATUS = makeSymbol( "WNI-ASSERT-IMPORT-STATUS" );
    $kw267$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw268$FORWARD = makeKeyword( "FORWARD" );
    $sym269$WNI_ASSERT_SYNSET_MAPPING = makeSymbol( "WNI-ASSERT-SYNSET-MAPPING" );
    $sym270$WNI_ASSERT_LIKELY_SYNSET_MAPPING = makeSymbol( "WNI-ASSERT-LIKELY-SYNSET-MAPPING" );
    $const271$wnLikelySynsetMapping = constant_handles.reader_make_constant_shell( makeString( "wnLikelySynsetMapping" ) );
    $sym272$WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT = makeSymbol( "WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT" );
    $const273$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list274 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowConstant-NotFullyReviewed" ) ) );
    $const275$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym276$WNI_ASSERT_ISA_COLLECTION = makeSymbol( "WNI-ASSERT-ISA-COLLECTION" );
    $list277 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $const278$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $sym279$WNI_ASSERT_GENLS = makeSymbol( "WNI-ASSERT-GENLS" );
    $const280$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym281$WNI_UNASSERT_GENLS = makeSymbol( "WNI-UNASSERT-GENLS" );
    $sym282$WNI_ASSERT_ISA = makeSymbol( "WNI-ASSERT-ISA" );
    $const283$WordNetIndividualMappingMt = constant_handles.reader_make_constant_shell( makeString( "WordNetIndividualMappingMt" ) );
    $sym284$WNI_ASSERT_ISA_INDIVIDUAL = makeSymbol( "WNI-ASSERT-ISA-INDIVIDUAL" );
    $list285 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $sym286$WNI_ASSERT_ISA_AGENT_GENERIC = makeSymbol( "WNI-ASSERT-ISA-AGENT-GENERIC" );
    $const287$Agent_Generic = constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) );
    $list288 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) ) );
    $sym289$WNI_ASSERT_REIFIED_USING = makeSymbol( "WNI-ASSERT-REIFIED-USING" );
    $const290$reifiedUsingTool = constant_handles.reader_make_constant_shell( makeString( "reifiedUsingTool" ) );
    $list291 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycWordNetImportTool" ) ) );
    $sym292$WNI_SYNSET_NOTE = makeSymbol( "WNI-SYNSET-NOTE" );
    $const293$wnSynsetNote = constant_handles.reader_make_constant_shell( makeString( "wnSynsetNote" ) );
    $list294 = ConsesLow.list( makeSymbol( "?NOTE" ) );
    $str295$ = makeString( "" );
    $sym296$WNI_ASSERT_SYNSET_NOTE = makeSymbol( "WNI-ASSERT-SYNSET-NOTE" );
    $sym297$WNI_UNASSERT_SYNSET_NOTE = makeSymbol( "WNI-UNASSERT-SYNSET-NOTE" );
    $sym298$WNI_ASSERT_COMMENT = makeSymbol( "WNI-ASSERT-COMMENT" );
    $const299$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $sym300$WNI_ASSERT_TERM_OF_UNIT = makeSymbol( "WNI-ASSERT-TERM-OF-UNIT" );
    $const301$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const302$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym303$WNI_LOCK_SYNSET = makeSymbol( "WNI-LOCK-SYNSET" );
    $const304$wnWorkflowSynsetLock = constant_handles.reader_make_constant_shell( makeString( "wnWorkflowSynsetLock" ) );
    $sym305$WNI_UNLOCK_SYNSET = makeSymbol( "WNI-UNLOCK-SYNSET" );
    $list306 = ConsesLow.list( makeSymbol( "?DATE" ) );
    $sym307$WNI_ASSERT_HEURISTIC_LEXICON = makeSymbol( "WNI-ASSERT-HEURISTIC-LEXICON" );
    $sym308$ALIST_P = makeSymbol( "ALIST-P" );
    $list309 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 114834 ) );
    $list310 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 114709 ) );
    $list311 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 567092 ) );
    $str312$_included = makeString( "-included" );
    $list313 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 377912 ) );
    $list314 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 382049 ) );
    $list315 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WordNetSynsetFn" ) ), makeInteger( 378797 ) );
    $str316$WordNet_individual_synset__A_must = makeString( "WordNet individual synset ~A must be a #$Noun" );
    $const317$BiologicalSpecies = constant_handles.reader_make_constant_shell( makeString( "BiologicalSpecies" ) );
    $const318$scientificName = constant_handles.reader_make_constant_shell( makeString( "scientificName" ) );
    $const319$NewLatinLexicalMt = constant_handles.reader_make_constant_shell( makeString( "NewLatinLexicalMt" ) );
    $list320 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_semicolon, Characters.CHAR_comma );
    $list321 = ConsesLow.list( Characters.CHAR_hyphen );
    $const322$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $const323$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $const324$hyphenString = constant_handles.reader_make_constant_shell( makeString( "hyphenString" ) );
    $const325$TemporaryLexicalAssertions_WordNe = constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertions-WordNetImportMt" ) );
    $str326$_count_noun = makeString( "-count-noun" );
    $str327$headword_is_first = makeString( "headword-is-first" );
    $const328$multiWordString = constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) );
    $const329$compoundString = constant_handles.reader_make_constant_shell( makeString( "compoundString" ) );
    $str330$must_have_an_existing_word_unit_f = makeString( "must have an existing word unit for ~A which has speech-part ~A" );
    $sym331$_WORD_SENSE = makeSymbol( "?WORD-SENSE" );
    $str332$must_have_an_existing_word_sense_ = makeString( "must have an existing word sense for ~A which has speech-part ~A" );
    $const333$politenessOfWS = constant_handles.reader_make_constant_shell( makeString( "politenessOfWS" ) );
    $const334$formalityOfWS = constant_handles.reader_make_constant_shell( makeString( "formalityOfWS" ) );
    $const335$rhetoricalDeviceOfPhrase = constant_handles.reader_make_constant_shell( makeString( "rhetoricalDeviceOfPhrase" ) );
    $str336$_politeness = makeString( "-politeness" );
    $str337$polite = makeString( "polite" );
    $const338$PoliteSpeech = constant_handles.reader_make_constant_shell( makeString( "PoliteSpeech" ) );
    $str339$rude = makeString( "rude" );
    $const340$RudeSpeech = constant_handles.reader_make_constant_shell( makeString( "RudeSpeech" ) );
    $str341$vulgar = makeString( "vulgar" );
    $const342$VulgarSpeech = constant_handles.reader_make_constant_shell( makeString( "VulgarSpeech" ) );
    $str343$_formality = makeString( "-formality" );
    $str344$archaic = makeString( "archaic" );
    $const345$ArchaicSpeech = constant_handles.reader_make_constant_shell( makeString( "ArchaicSpeech" ) );
    $str346$slang = makeString( "slang" );
    $const347$SlangSpeech = constant_handles.reader_make_constant_shell( makeString( "SlangSpeech" ) );
    $str348$formal = makeString( "formal" );
    $const349$FormalSpeech = constant_handles.reader_make_constant_shell( makeString( "FormalSpeech" ) );
    $str350$informal = makeString( "informal" );
    $const351$InformalSpeech = constant_handles.reader_make_constant_shell( makeString( "InformalSpeech" ) );
    $str352$baby_talk = makeString( "baby talk" );
    $const353$BabyTalk = constant_handles.reader_make_constant_shell( makeString( "BabyTalk" ) );
    $str354$technical_jargon = makeString( "technical jargon" );
    $const355$Jargon = constant_handles.reader_make_constant_shell( makeString( "Jargon" ) );
    $str356$_rhetorical_device = makeString( "-rhetorical-device" );
    $str357$metaphor = makeString( "metaphor" );
    $const358$MetaphoricalSpeech = constant_handles.reader_make_constant_shell( makeString( "MetaphoricalSpeech" ) );
    $str359$simile = makeString( "simile" );
    $const360$Simile_FigureOfSpeech = constant_handles.reader_make_constant_shell( makeString( "Simile-FigureOfSpeech" ) );
    $str361$euphemism = makeString( "euphemism" );
    $const362$EuphemisticSpeech = constant_handles.reader_make_constant_shell( makeString( "EuphemisticSpeech" ) );
    $const363$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const364$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $str365$Mrs_ = makeString( "Mrs." );
    $str366$Sir_ = makeString( "Sir " );
    $str367$_Jr_ = makeString( " Jr." );
    $str368$President_ = makeString( "President " );
    $const369$givenNames = constant_handles.reader_make_constant_shell( makeString( "givenNames" ) );
    $const370$middleName = constant_handles.reader_make_constant_shell( makeString( "middleName" ) );
    $const371$pseudonym = constant_handles.reader_make_constant_shell( makeString( "pseudonym" ) );
    $const372$placeName_Standard = constant_handles.reader_make_constant_shell( makeString( "placeName-Standard" ) );
    $const373$placeName_ShortForm = constant_handles.reader_make_constant_shell( makeString( "placeName-ShortForm" ) );
    $const374$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $const375$initialismString = constant_handles.reader_make_constant_shell( makeString( "initialismString" ) );
    $str376$ing = makeString( "ing" );
    $const377$GerundiveNoun = constant_handles.reader_make_constant_shell( makeString( "GerundiveNoun" ) );
    $str378$t = makeString( "t" );
    $const379$ProperCountNoun = constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) );
    $const380$ProperMassNoun = constant_handles.reader_make_constant_shell( makeString( "ProperMassNoun" ) );
    $const381$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $const382$MassNoun = constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) );
    $sym383$WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS = makeSymbol( "WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS" );
    $str384$Counting_recent_WordNet_mappings = makeString( "Counting recent WordNet mappings" );
    $int385$20050101 = makeInteger( 20050101 );
    $sym386$WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET = makeSymbol( "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET" );
    $const387$WordNetWorkflowConstant_NotFullyR = constant_handles.reader_make_constant_shell( makeString( "WordNetWorkflowConstant-NotFullyReviewed" ) );
    $str388$Counting_terms_imported_from_Word = makeString( "Counting terms imported from WordNet" );
    $const389$SteveReed = constant_handles.reader_make_constant_shell( makeString( "SteveReed" ) );
    $const390$CycWordNetImportTool = constant_handles.reader_make_constant_shell( makeString( "CycWordNetImportTool" ) );
    $sym391$WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET = makeSymbol( "WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET" );
    $str392$Counting_recent_denotations_impor = makeString( "Counting recent denotations imported from WordNet" );
    $sym393$WNI_ROLE_INFO = makeSymbol( "WNI-ROLE-INFO" );
    $sym394$WNI_ROLE_INFO_P = makeSymbol( "WNI-ROLE-INFO-P" );
    $list395 = ConsesLow.list( makeSymbol( "ROLE" ), makeSymbol( "FILLER" ), makeSymbol( "DEFINING-COL" ), makeSymbol( "DEFINING-PRED" ), makeSymbol( "SUBSUMPTION-STATUS" ) );
    $list396 = ConsesLow.list( makeKeyword( "ROLE" ), makeKeyword( "FILLER" ), makeKeyword( "DEFINING-COL" ), makeKeyword( "DEFINING-PRED" ), makeKeyword( "SUBSUMPTION-STATUS" ) );
    $list397 = ConsesLow.list( makeSymbol( "WNI-ROLE" ), makeSymbol( "WNI-FILLER" ), makeSymbol( "WNI-DEFINING-COL" ), makeSymbol( "WNI-DEFINING-PRED" ), makeSymbol( "WNI-SUBSUMPTION-STATUS" ) );
    $list398 = ConsesLow.list( makeSymbol( "_CSETF-WNI-ROLE" ), makeSymbol( "_CSETF-WNI-FILLER" ), makeSymbol( "_CSETF-WNI-DEFINING-COL" ), makeSymbol( "_CSETF-WNI-DEFINING-PRED" ), makeSymbol(
        "_CSETF-WNI-SUBSUMPTION-STATUS" ) );
    $sym399$WNI_PRINT_ROLE_INFO = makeSymbol( "WNI-PRINT-ROLE-INFO" );
    $sym400$WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list401 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "WNI-ROLE-INFO-P" ) );
    $sym402$WNI_ROLE = makeSymbol( "WNI-ROLE" );
    $sym403$_CSETF_WNI_ROLE = makeSymbol( "_CSETF-WNI-ROLE" );
    $sym404$WNI_FILLER = makeSymbol( "WNI-FILLER" );
    $sym405$_CSETF_WNI_FILLER = makeSymbol( "_CSETF-WNI-FILLER" );
    $sym406$WNI_DEFINING_COL = makeSymbol( "WNI-DEFINING-COL" );
    $sym407$_CSETF_WNI_DEFINING_COL = makeSymbol( "_CSETF-WNI-DEFINING-COL" );
    $sym408$WNI_DEFINING_PRED = makeSymbol( "WNI-DEFINING-PRED" );
    $sym409$_CSETF_WNI_DEFINING_PRED = makeSymbol( "_CSETF-WNI-DEFINING-PRED" );
    $sym410$WNI_SUBSUMPTION_STATUS = makeSymbol( "WNI-SUBSUMPTION-STATUS" );
    $sym411$_CSETF_WNI_SUBSUMPTION_STATUS = makeSymbol( "_CSETF-WNI-SUBSUMPTION-STATUS" );
    $kw412$ROLE = makeKeyword( "ROLE" );
    $kw413$FILLER = makeKeyword( "FILLER" );
    $kw414$DEFINING_COL = makeKeyword( "DEFINING-COL" );
    $kw415$DEFINING_PRED = makeKeyword( "DEFINING-PRED" );
    $kw416$SUBSUMPTION_STATUS = makeKeyword( "SUBSUMPTION-STATUS" );
    $str417$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw418$BEGIN = makeKeyword( "BEGIN" );
    $sym419$MAKE_WNI_ROLE_INFO = makeSymbol( "MAKE-WNI-ROLE-INFO" );
    $kw420$SLOT = makeKeyword( "SLOT" );
    $kw421$END = makeKeyword( "END" );
    $sym422$VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD" );
    $sym423$STREAMP = makeSymbol( "STREAMP" );
    $str424$_ROLE_INFO___s__s__s__s__s_ = makeString( "<ROLE-INFO: ~s ~s ~s ~s ~s>" );
    $sym425$WNI_GATHER_ROLES_AND_TRAITS = makeSymbol( "WNI-GATHER-ROLES-AND-TRAITS" );
    $sym426$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $sym427$WNI_FIND_COMPATIBLE_ROLES = makeSymbol( "WNI-FIND-COMPATIBLE-ROLES" );
    $const428$genlPredsWRTTypes = constant_handles.reader_make_constant_shell( makeString( "genlPredsWRTTypes" ) );
    $list429 = ConsesLow.list( makeSymbol( "?ROLE" ), makeSymbol( "?FILLER" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?DEFINING-PRED" ) );
    $list430 = ConsesLow.list( makeSymbol( "?DEFINING-COLL" ) );
    $list431 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString( "Situation" ) ) );
    $list432 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell( makeString( "keRelevantPreds" ) ) );
    $list433 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ), ConsesLow.list( makeSymbol( "?DEFINING-PRED" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?ROLE" ) ) );
    $const434$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const435$interArgIsa1_2 = constant_handles.reader_make_constant_shell( makeString( "interArgIsa1-2" ) );
    $sym436$_ROLE = makeSymbol( "?ROLE" );
    $list437 = ConsesLow.list( makeSymbol( "?FILLER" ) );
    $sym438$_FILLER_2 = makeSymbol( "?FILLER-2" );
    $list439 = ConsesLow.list( makeSymbol( "?FILLER-2" ) );
    $list440 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?FILLER-2" ), makeSymbol( "?FILLER" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?FILLER-2" ), makeSymbol( "?FILLER" ) ) );
    $list441 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) ), makeSymbol( "?ROLE" ), makeSymbol( "?FILLER" ) ) );
    $sym442$_COLL = makeSymbol( "?COLL" );
    $list443 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString(
        "Situation" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "relationAllExists" ) ), makeSymbol( "?ROLE" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?COLL" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol(
                "?FILLER" ), makeSymbol( "?COLL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell(
                    makeString( "relationAllExists" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "quotedIsa" ) ), makeSymbol( "?ROLE" ), constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateConstant-FactEntryTool" ) ) ) ) );
    $sym444$_THING = makeSymbol( "?THING" );
    $list445 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString(
        "Situation" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "relationAllInstance" ) ), makeSymbol( "?ROLE" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?THING" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol(
                "?FILLER" ), makeSymbol( "?THING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell(
                    makeString( "relationAllInstance" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "quotedIsa" ) ), makeSymbol( "?ROLE" ), constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateConstant-FactEntryTool" ) ) ) ) );
    $sym446$_ROLE2 = makeSymbol( "?ROLE2" );
    $const447$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $const448$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $sym449$_DEFINING_COLL = makeSymbol( "?DEFINING-COLL" );
    $list450 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell( makeString(
        "genlPredsWRTTypes" ) ) ) );
    $list451 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
        "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString( "Situation" ) ) ) );
    $list452 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
        makeSymbol( "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString( "Situation" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), makeSymbol( "?ROLE" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?COLL" ) ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?FILLER" ), makeSymbol( "?COLL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "equals" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeSymbol( "?ROLE" ), constant_handles.reader_make_constant_shell(
                            makeString( "FormulaTemplateConstant-FactEntryTool" ) ) ) ) );
    $list453 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ),
        makeSymbol( "?DEFINING-COLL" ), constant_handles.reader_make_constant_shell( makeString( "Situation" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ), makeSymbol( "?ROLE" ), makeSymbol( "?DEFINING-COLL" ), makeSymbol( "?THING" ) ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?FILLER" ), makeSymbol( "?THING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "equals" ) ), makeSymbol( "?DEFINING-PRED" ), constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeSymbol( "?ROLE" ), constant_handles.reader_make_constant_shell(
                            makeString( "FormulaTemplateConstant-FactEntryTool" ) ) ) ) );
    $str454$_A = makeString( "~A" );
    $sym455$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym456$WNI_SORT_KEY_1 = makeSymbol( "WNI-SORT-KEY-1" );
    $sym457$WNI_CLEAR_FUNCTION_CACHES = makeSymbol( "WNI-CLEAR-FUNCTION-CACHES" );
    $str458$in_workflow_ = makeString( "in-workflow?" );
    $str459$nil = makeString( "nil" );
    $str460$unmapped_hypernym_chain = makeString( "unmapped-hypernym-chain" );
  }

  public static final class $wni_role_info_native
      extends
        SubLStructNative
  {
    public SubLObject $role;
    public SubLObject $filler;
    public SubLObject $defining_col;
    public SubLObject $defining_pred;
    public SubLObject $subsumption_status;
    private static final SubLStructDeclNative structDecl;

    public $wni_role_info_native()
    {
      this.$role = CommonSymbols.NIL;
      this.$filler = CommonSymbols.NIL;
      this.$defining_col = CommonSymbols.NIL;
      this.$defining_pred = CommonSymbols.NIL;
      this.$subsumption_status = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $wni_role_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$role;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$filler;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$defining_col;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$defining_pred;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$subsumption_status;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$role = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$filler = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$defining_col = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$defining_pred = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$subsumption_status = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $wni_role_info_native.class, $sym393$WNI_ROLE_INFO, $sym394$WNI_ROLE_INFO_P, $list395, $list396, new String[] { "$role", "$filler", "$defining_col", "$defining_pred",
        "$subsumption_status"
      }, $list397, $list398, $sym399$WNI_PRINT_ROLE_INFO );
    }
  }

  public static final class $wni_role_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $wni_role_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "WNI-ROLE-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return wni_role_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2268 ms synthetic
 */