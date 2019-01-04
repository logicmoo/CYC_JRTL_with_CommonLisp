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

public final class wordnet_import extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.wordnet_import";
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
    public static SubLObject initialize_wordnet_import_kb_feature() {
        if (wordnet_import.NIL != list_utilities.every_in_list((SubLObject)wordnet_import.$sym1$VALID_CONSTANT_, wordnet_import.$wordnet_import_core_constants$.getGlobalValue(), (SubLObject)wordnet_import.UNPROVIDED)) {
            kb_control_vars.set_wordnet_import_kb_loaded();
        }
        else {
            kb_control_vars.unset_wordnet_import_kb_loaded();
        }
        return kb_control_vars.wordnet_import_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
    public static SubLObject clear_wni_unranked_synsets_for_english_word_string() {
        final SubLObject cs = wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
    public static SubLObject remove_wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_string), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
    public static SubLObject wni_unranked_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert wordnet_import.NIL != Types.stringp(word_string) : word_string;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const6$wnSynsetMemberWord, (SubLObject)wordnet_import.$sym7$_SYNSET, (SubLObject)ConsesLow.list(wordnet_import.$const8$WordNetEnglishWordFn, word_string));
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            synsets = (SubLObject)ConsesLow.cons(result.first().rest(), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 2589L)
    public static SubLObject wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING, (SubLObject)wordnet_import.$sym13$_WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_unranked_synsets_for_english_word_string_internal(word_string)));
            memoization_state.caching_state_put(caching_state, word_string, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
    public static SubLObject clear_wni_synsets_for_english_word_stringXpos() {
        final SubLObject cs = wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
    public static SubLObject remove_wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_string, speech_part), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
    public static SubLObject wni_synsets_for_english_word_stringXpos_internal(final SubLObject word_string, final SubLObject speech_part) {
        assert wordnet_import.NIL != Types.stringp(word_string) : word_string;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), speech_part, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
        final SubLObject sql_query = Sequences.cconcatenate((SubLObject)wordnet_import.$str15$select_synset_id_from_WordSense_w, new SubLObject[] { word_string, wordnet_import.$str16$__and_pos____, pos, wordnet_import.$str17$__order_by_word_sense });
        SubLObject rs = (SubLObject)wordnet_import.NIL;
        SubLObject statement = (SubLObject)wordnet_import.NIL;
        SubLObject connection = (SubLObject)wordnet_import.NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.list(new SubLObject[] { wordnet_import.$kw18$DBMS_SERVER, wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$kw22$TIMEOUT, wordnet_import.THREE_INTEGER }));
            if (wordnet_import.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (wordnet_import.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, (SubLObject)wordnet_import.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (wordnet_import.NIL != sdbc.sql_result_set_p(rs)) {
                while (wordnet_import.NIL != sdbc.sqlrs_next(rs)) {
                    synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wordnet_import.$const23$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, (SubLObject)wordnet_import.ONE_INTEGER)), synsets);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)wordnet_import.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (wordnet_import.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = (list_var = Sequences.nreverse(synsets));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 3635L)
    public static SubLObject wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        SubLObject caching_state = wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS, (SubLObject)wordnet_import.$sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.TWO_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)wordnet_import.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)wordnet_import.NIL;
            collision = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (wordnet_import.NIL != cached_args && wordnet_import.NIL == cached_args.rest() && speech_part.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synsets_for_english_word_stringXpos_internal(word_string, speech_part)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word_string, speech_part));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
    public static SubLObject clear_wni_synsets_for_english_word_string() {
        final SubLObject cs = wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
    public static SubLObject remove_wni_synsets_for_english_word_string(final SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_string), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
    public static SubLObject wni_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert wordnet_import.NIL != Types.stringp(word_string) : word_string;
        if (wordnet_import.NIL == sksi_infrastructure_utilities.sk_source_registeredP(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED)) {
            return (SubLObject)wordnet_import.NIL;
        }
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject sql_query = Sequences.cconcatenate((SubLObject)wordnet_import.$str15$select_synset_id_from_WordSense_w, new SubLObject[] { word_string, wordnet_import.$str27$__order_by_pos__word_sense });
        SubLObject rs = (SubLObject)wordnet_import.NIL;
        SubLObject statement = (SubLObject)wordnet_import.NIL;
        SubLObject connection = (SubLObject)wordnet_import.NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.list(new SubLObject[] { wordnet_import.$kw18$DBMS_SERVER, wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$kw22$TIMEOUT, wordnet_import.THREE_INTEGER }));
            if (wordnet_import.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (wordnet_import.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, (SubLObject)wordnet_import.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (wordnet_import.NIL != sdbc.sql_result_set_p(rs)) {
                while (wordnet_import.NIL != sdbc.sqlrs_next(rs)) {
                    synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wordnet_import.$const23$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, (SubLObject)wordnet_import.ONE_INTEGER)), synsets);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)wordnet_import.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (wordnet_import.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = (list_var = Sequences.nreverse(synsets));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 4897L)
    public static SubLObject wni_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = wordnet_import.$wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING, (SubLObject)wordnet_import.$sym28$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synsets_for_english_word_string_internal(word_string)));
            memoization_state.caching_state_put(caching_state, word_string, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
    public static SubLObject clear_wni_synset_collectionP() {
        final SubLObject cs = wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
    public static SubLObject remove_wni_synset_collectionP(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
    public static SubLObject wni_synset_collectionP_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject v_term = wni_synset_term(synset);
        if (wordnet_import.NIL != v_term) {
            return fort_types_interface.collectionP(v_term);
        }
        final SubLObject reified_synset = czer_main.canonicalize_term(wni_reifiable_synset(synset), (SubLObject)wordnet_import.UNPROVIDED);
        if (wordnet_import.NIL != nart_handles.nart_p(reified_synset)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(wordnet_import.NIL == isa.isaP(reified_synset, wordnet_import.$const30$WordNetSynsetImportStatus_Determi, wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return (SubLObject)wordnet_import.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6130L)
    public static SubLObject wni_synset_collectionP(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_collectionP_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym29$WNI_SYNSET_COLLECTION_, (SubLObject)wordnet_import.$sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_collectionP_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 6704L)
    public static SubLObject wni_synset_individuals() {
        final SubLObject list_var;
        final SubLObject individual_synsets = list_var = Mapping.mapcar((SubLObject)wordnet_import.$sym34$WNI_UNREIFIED_SYNSET, isa.instances(wordnet_import.$const30$WordNetSynsetImportStatus_Determi, wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.UNPROVIDED));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return individual_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 7075L)
    public static SubLObject wni_exclude_situations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synsets) : synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject non_situation_synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str36$excluding_specs_of___Situation, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(synsets), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = (SubLObject)wordnet_import.NIL;
                synset = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    if (wordnet_import.NIL == genls.any_specP(wordnet_import.$const38$Situation, wni_hypernym_terms(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                        non_situation_synsets = (SubLObject)ConsesLow.cons(synset, non_situation_synsets);
                    }
                    streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
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
        final SubLObject list_var_$2;
        non_situation_synsets = (list_var_$2 = Sequences.nreverse(non_situation_synsets));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var_$2) : list_var_$2;
        SubLObject cdolist_list_var2 = list_var_$2;
        SubLObject elem2 = (SubLObject)wordnet_import.NIL;
        elem2 = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem2) : elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        }
        return non_situation_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 7718L)
    public static SubLObject wni_exclude_relations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synsets) : synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject non_relation_synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str40$excluding_specs_of___Relation, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(synsets), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = (SubLObject)wordnet_import.NIL;
                synset = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    if (wordnet_import.NIL == genls.any_specP(wordnet_import.$const41$Relation, wni_hypernym_terms(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                        non_relation_synsets = (SubLObject)ConsesLow.cons(synset, non_relation_synsets);
                    }
                    streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
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
        final SubLObject list_var_$4;
        non_relation_synsets = (list_var_$4 = Sequences.nreverse(non_relation_synsets));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var_$4) : list_var_$4;
        SubLObject cdolist_list_var2 = list_var_$4;
        SubLObject elem2 = (SubLObject)wordnet_import.NIL;
        elem2 = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem2) : elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        }
        return non_relation_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 8351L)
    public static SubLObject wni_exclude_skipped(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synsets) : synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject non_skipped_synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str43$excluding_skipped_synsets, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(synsets), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = (SubLObject)wordnet_import.NIL;
                synset = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    if (wordnet_import.NIL == isa.isaP(wni_reifiable_synset(synset), wordnet_import.$const44$WordNetSynsetImportStatus_Skip, wordnet_import.$const10$WordNetWorkflowCollectorMt, (SubLObject)wordnet_import.UNPROVIDED)) {
                        non_skipped_synsets = (SubLObject)ConsesLow.cons(synset, non_skipped_synsets);
                    }
                    streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
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
        final SubLObject list_var_$6;
        non_skipped_synsets = (list_var_$6 = Sequences.nreverse(non_skipped_synsets));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var_$6) : list_var_$6;
        SubLObject cdolist_list_var2 = list_var_$6;
        SubLObject elem2 = (SubLObject)wordnet_import.NIL;
        elem2 = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem2) : elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        }
        return non_skipped_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 8999L)
    public static SubLObject wni_synset_id(final SubLObject synset) {
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(synset) : synset;
        final SubLObject synset_id = conses_high.second(synset);
        assert wordnet_import.NIL != Types.integerp(synset_id) : synset_id;
        return synset_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9341L)
    public static SubLObject wni_synset_words(final SubLObject synset) {
        return wni_synset_words_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9595L)
    public static SubLObject wni_synsets_equal(final SubLObject synset_1, final SubLObject synset_2) {
        return Equality.equal(wni_ensure_naut(synset_1), wni_ensure_naut(synset_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
    public static SubLObject clear_wni_synset_words_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
    public static SubLObject remove_wni_synset_words_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
    public static SubLObject wni_synset_words_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject words_and_indices = (SubLObject)wordnet_import.NIL;
        SubLObject words = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym52$_POS, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym53$_SENSE, (SubLObject)ConsesLow.listS(wordnet_import.$const54$wnSynsetWord, synset, (SubLObject)wordnet_import.$list55)));
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            words_and_indices = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(result.first().rest(), conses_high.second(result).rest()), words_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        cdolist_list_var = Sort.sort(words_and_indices, Symbols.symbol_function((SubLObject)wordnet_import.$sym56$_), Symbols.symbol_function((SubLObject)wordnet_import.$sym57$SECOND));
        SubLObject word_and_index = (SubLObject)wordnet_import.NIL;
        word_and_index = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            words = (SubLObject)ConsesLow.cons(word_and_index.first(), words);
            cdolist_list_var = cdolist_list_var.rest();
            word_and_index = cdolist_list_var.first();
        }
        final SubLObject list_var;
        words = (list_var = Sequences.nreverse(words));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != Types.stringp(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 9799L)
    public static SubLObject wni_synset_words_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_words_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym50$WNI_SYNSET_WORDS_HELPER, (SubLObject)wordnet_import.$sym58$_WNI_SYNSET_WORDS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_words_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11089L)
    public static SubLObject wni_synset_example_phrases(final SubLObject synset) {
        return wni_synset_example_phrases_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
    public static SubLObject clear_wni_synset_example_phrases_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
    public static SubLObject remove_wni_synset_example_phrases_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
    public static SubLObject wni_synset_example_phrases_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject example_phrases_and_indices = (SubLObject)wordnet_import.NIL;
        SubLObject example_phrases = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const61$wnSynsetExamplePhraseWithPosition, synset, (SubLObject)wordnet_import.$list62);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            example_phrases_and_indices = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(result.first().rest(), conses_high.second(result).rest()), example_phrases_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        cdolist_list_var = Sort.sort(example_phrases_and_indices, Symbols.symbol_function((SubLObject)wordnet_import.$sym56$_), Symbols.symbol_function((SubLObject)wordnet_import.$sym63$FIRST));
        SubLObject example_phrase_and_index = (SubLObject)wordnet_import.NIL;
        example_phrase_and_index = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            example_phrases = (SubLObject)ConsesLow.cons(conses_high.second(example_phrase_and_index), example_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            example_phrase_and_index = cdolist_list_var.first();
        }
        final SubLObject list_var;
        example_phrases = (list_var = Sequences.nreverse(example_phrases));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != Types.stringp(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return example_phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 11374L)
    public static SubLObject wni_synset_example_phrases_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER, (SubLObject)wordnet_import.$sym64$_WNI_SYNSET_EXAMPLE_PHRASES_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_example_phrases_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 13334L)
    public static SubLObject wni_most_general_synset_verb_frame(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject verb_frames = wni_synset_verb_frames(synset);
        SubLObject most_general_verb_frame_score = (SubLObject)wordnet_import.NIL;
        SubLObject most_general_verb_frame = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == verb_frames) {
            return (SubLObject)wordnet_import.NIL;
        }
        SubLObject cdolist_list_var = verb_frames;
        SubLObject verb_frame = (SubLObject)wordnet_import.NIL;
        verb_frame = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            final SubLObject verb_frame_score = list_utilities.alist_lookup_without_values(wordnet_import.$wni_verb_frame_generalities$.getGlobalValue(), verb_frame, Symbols.symbol_function((SubLObject)wordnet_import.EQL), wordnet_import.$wni_least_general_frame_generality_score$.getGlobalValue());
            if (wordnet_import.NIL == most_general_verb_frame || verb_frame_score.numL(most_general_verb_frame_score)) {
                most_general_verb_frame = verb_frame;
                most_general_verb_frame_score = verb_frame_score;
            }
            cdolist_list_var = cdolist_list_var.rest();
            verb_frame = cdolist_list_var.first();
        }
        if (wordnet_import.NIL != most_general_verb_frame && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(most_general_verb_frame)) {
            throw new AssertionError(most_general_verb_frame);
        }
        return most_general_verb_frame;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14260L)
    public static SubLObject wni_synset_verb_frames(final SubLObject synset) {
        return wni_synset_verb_frames_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
    public static SubLObject clear_wni_synset_verb_frames_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
    public static SubLObject remove_wni_synset_verb_frames_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
    public static SubLObject wni_synset_verb_frames_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const70$wnSynsetVerbFrame, synset, (SubLObject)wordnet_import.$list71);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list72;
        final SubLObject query_result = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject verb_frames = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var = query_result;
        SubLObject binding = (SubLObject)wordnet_import.NIL;
        binding = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL != forts.fort_p(binding)) {
                verb_frames = (SubLObject)ConsesLow.cons(binding, verb_frames);
            }
            else if (wordnet_import.NIL != el_utilities.possibly_naut_p(binding)) {
                SubLObject cdolist_list_var_$7 = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut(binding);
                SubLObject v_term = (SubLObject)wordnet_import.NIL;
                v_term = cdolist_list_var_$7.first();
                while (wordnet_import.NIL != cdolist_list_var_$7) {
                    if (wordnet_import.NIL != forts.fort_p(v_term)) {
                        verb_frames = (SubLObject)ConsesLow.cons(v_term, verb_frames);
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    v_term = cdolist_list_var_$7.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject list_var = verb_frames;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return verb_frames;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 14483L)
    public static SubLObject wni_synset_verb_frames_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym69$WNI_SYNSET_VERB_FRAMES_HELPER, (SubLObject)wordnet_import.$sym73$_WNI_SYNSET_VERB_FRAMES_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_verb_frames_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
    public static SubLObject clear_wni_verb_frames_for_word() {
        final SubLObject cs = wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
    public static SubLObject remove_wni_verb_frames_for_word(final SubLObject verb) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(verb), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
    public static SubLObject wni_verb_frames_for_word_internal(final SubLObject verb) {
        assert wordnet_import.NIL != Types.stringp(verb) : verb;
        SubLObject verb_frames = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const70$wnSynsetVerbFrame, (SubLObject)ConsesLow.list(wordnet_import.$const8$WordNetEnglishWordFn, verb), (SubLObject)wordnet_import.$list71);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            verb_frames = (SubLObject)ConsesLow.cons(result.first().rest(), verb_frames);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = verb_frames;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return verb_frames;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 15612L)
    public static SubLObject wni_verb_frames_for_word(final SubLObject verb) {
        SubLObject caching_state = wordnet_import.$wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym75$WNI_VERB_FRAMES_FOR_WORD, (SubLObject)wordnet_import.$sym76$_WNI_VERB_FRAMES_FOR_WORD_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, verb, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_verb_frames_for_word_internal(verb)));
            memoization_state.caching_state_put(caching_state, verb, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16550L)
    public static SubLObject wni_hypernyms(final SubLObject synset) {
        return wni_hypernyms_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
    public static SubLObject clear_wni_hypernyms_helper() {
        final SubLObject cs = wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
    public static SubLObject remove_wni_hypernyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
    public static SubLObject wni_hypernyms_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject hypernyms = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const79$wnHypernym, synset, (SubLObject)wordnet_import.$list80);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            hypernyms = (SubLObject)ConsesLow.cons(wni_ensure_naut(result.first().rest()), hypernyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = hypernyms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return hypernyms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 16779L)
    public static SubLObject wni_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym78$WNI_HYPERNYMS_HELPER, (SubLObject)wordnet_import.$sym81$_WNI_HYPERNYMS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_hypernyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17699L)
    public static SubLObject wni_all_hypernyms(final SubLObject synset) {
        return wni_all_hypernyms_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
    public static SubLObject clear_wni_all_hypernyms_helper() {
        final SubLObject cs = wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
    public static SubLObject remove_wni_all_hypernyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
    public static SubLObject wni_all_hypernyms_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject all_hypernyms = (SubLObject)wordnet_import.NIL;
        for (SubLObject hypernym = (SubLObject)wordnet_import.NIL, synsets_stack = wni_hypernyms(synset); wordnet_import.NIL != synsets_stack; synsets_stack = ConsesLow.append(synsets_stack, wni_hypernyms(hypernym))) {
            hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hypernym;
            if (wordnet_import.NIL == conses_high.member(item_var, all_hypernyms, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                all_hypernyms = (SubLObject)ConsesLow.cons(item_var, all_hypernyms);
            }
        }
        final SubLObject list_var = all_hypernyms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return all_hypernyms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 17982L)
    public static SubLObject wni_all_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym83$WNI_ALL_HYPERNYMS_HELPER, (SubLObject)wordnet_import.$sym84$_WNI_ALL_HYPERNYMS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_all_hypernyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 18619L)
    public static SubLObject wni_all_hypernymP(final SubLObject synset, final SubLObject hypernym) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != narts_high.naut_p(hypernym) : hypernym;
        for (SubLObject temp_hypernym = (SubLObject)wordnet_import.NIL, synsets_stack = wni_hypernyms(synset); wordnet_import.NIL != synsets_stack; synsets_stack = ConsesLow.append(synsets_stack, wni_hypernyms(temp_hypernym))) {
            temp_hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            if (wni_ensure_naut(temp_hypernym).equal(wni_ensure_naut(hypernym))) {
                return (SubLObject)wordnet_import.T;
            }
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19233L)
    public static SubLObject wni_hyponyms(final SubLObject synset) {
        return wni_hyponyms_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
    public static SubLObject clear_wni_hyponyms_helper() {
        final SubLObject cs = wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
    public static SubLObject remove_wni_hyponyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
    public static SubLObject wni_hyponyms_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject hyponyms = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const79$wnHypernym, (SubLObject)wordnet_import.$sym88$_HYPONYM_SYNSET, synset);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            hyponyms = (SubLObject)ConsesLow.cons(wni_ensure_naut(result.first().rest()), hyponyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = hyponyms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return hyponyms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 19459L)
    public static SubLObject wni_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym87$WNI_HYPONYMS_HELPER, (SubLObject)wordnet_import.$sym89$_WNI_HYPONYMS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_hyponyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20372L)
    public static SubLObject wni_all_hyponyms(final SubLObject synset) {
        return wni_all_hyponyms_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
    public static SubLObject clear_wni_all_hyponyms_helper() {
        final SubLObject cs = wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
    public static SubLObject remove_wni_all_hyponyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
    public static SubLObject wni_all_hyponyms_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject all_hyponyms = (SubLObject)wordnet_import.NIL;
        for (SubLObject hyponym = (SubLObject)wordnet_import.NIL, synsets_stack = wni_hyponyms(synset); wordnet_import.NIL != synsets_stack; synsets_stack = ConsesLow.append(synsets_stack, wni_hyponyms(hyponym))) {
            hyponym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hyponym;
            if (wordnet_import.NIL == conses_high.member(item_var, all_hyponyms, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                all_hyponyms = (SubLObject)ConsesLow.cons(item_var, all_hyponyms);
            }
        }
        final SubLObject list_var = all_hyponyms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return all_hyponyms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 20651L)
    public static SubLObject wni_all_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym91$WNI_ALL_HYPONYMS_HELPER, (SubLObject)wordnet_import.$sym92$_WNI_ALL_HYPONYMS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_all_hyponyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 21275L)
    public static SubLObject wni_any_hyponym_an_individual(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject cdolist_list_var;
        final SubLObject hyponyms = cdolist_list_var = wni_hyponyms(synset);
        SubLObject hyponym = (SubLObject)wordnet_import.NIL;
        hyponym = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL == wni_synset_collectionP(hyponym)) {
                return (SubLObject)wordnet_import.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hyponym = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 21648L)
    public static SubLObject wni_verb_is_derived_from_situation_nounP(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject cdolist_list_var;
        final SubLObject derived_forms = cdolist_list_var = wni_derived_forms(synset);
        SubLObject derived_form = (SubLObject)wordnet_import.NIL;
        derived_form = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.$const95$Noun.eql(wni_synset_pos(derived_form)) && wordnet_import.NIL != genls.any_specP(wordnet_import.$const38$Situation, wni_hypernym_terms(derived_form), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                return (SubLObject)wordnet_import.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            derived_form = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22212L)
    public static SubLObject wni_derived_forms(final SubLObject synset) {
        return wni_derived_forms_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
    public static SubLObject clear_wni_derived_forms_helper() {
        final SubLObject cs = wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
    public static SubLObject remove_wni_derived_forms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
    public static SubLObject wni_derived_forms_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject sql_query = Sequences.cconcatenate((SubLObject)wordnet_import.$str98$SELECT_DISTINCT_synsetpointer_syn, new SubLObject[] { string_utilities.to_string(wni_synset_id(synset)), wordnet_import.$str99$_AND____________________synsetpoi });
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        SubLObject rs = (SubLObject)wordnet_import.NIL;
        SubLObject statement = (SubLObject)wordnet_import.NIL;
        SubLObject connection = (SubLObject)wordnet_import.NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.list(new SubLObject[] { wordnet_import.$kw18$DBMS_SERVER, wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$kw22$TIMEOUT, wordnet_import.THREE_INTEGER }));
            if (wordnet_import.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (wordnet_import.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, (SubLObject)wordnet_import.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (wordnet_import.NIL != sdbc.sql_result_set_p(rs)) {
                while (wordnet_import.NIL != sdbc.sqlrs_next(rs)) {
                    synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wordnet_import.$const23$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, (SubLObject)wordnet_import.ONE_INTEGER)), synsets);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)wordnet_import.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (wordnet_import.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 22453L)
    public static SubLObject wni_derived_forms_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym97$WNI_DERIVED_FORMS_HELPER, (SubLObject)wordnet_import.$sym100$_WNI_DERIVED_FORMS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_derived_forms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23638L)
    public static SubLObject wni_synset_gloss(final SubLObject synset) {
        return wni_synset_gloss_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
    public static SubLObject clear_wni_synset_gloss_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
    public static SubLObject remove_wni_synset_gloss_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
    public static SubLObject wni_synset_gloss_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject gloss = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const103$wnSynsetGloss, synset, (SubLObject)wordnet_import.$list104);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list105;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        gloss = results.first();
        if (wordnet_import.NIL != gloss && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == Types.stringp(gloss)) {
            throw new AssertionError(gloss);
        }
        return gloss;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 23894L)
    public static SubLObject wni_synset_gloss_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym102$WNI_SYNSET_GLOSS_HELPER, (SubLObject)wordnet_import.$sym106$_WNI_SYNSET_GLOSS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUALP, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_gloss_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 24848L)
    public static SubLObject wni_synset_pos(final SubLObject synset) {
        return wni_synset_pos_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
    public static SubLObject clear_wni_synset_pos_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
    public static SubLObject remove_wni_synset_pos_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
    public static SubLObject wni_synset_pos_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject pos = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const109$wnSynsetSpeechPart, synset, (SubLObject)wordnet_import.$list110);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list111;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        pos = results.first();
        if (wordnet_import.NIL != pos && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(pos)) {
            throw new AssertionError(pos);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 25104L)
    public static SubLObject wni_synset_pos_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym108$WNI_SYNSET_POS_HELPER, (SubLObject)wordnet_import.$sym112$_WNI_SYNSET_POS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_pos_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26044L)
    public static SubLObject wni_synset_speech_part_offset(final SubLObject synset) {
        return wni_synset_speech_part_offset_helper(cycl_utilities.nat_functor(synset), wni_synset_id(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
    public static SubLObject clear_wni_synset_speech_part_offset_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
    public static SubLObject remove_wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(functor, synset_id), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
    public static SubLObject wni_synset_speech_part_offset_helper_internal(final SubLObject functor, final SubLObject synset_id) {
        assert wordnet_import.NIL != forts.fort_p(functor) : functor;
        assert wordnet_import.NIL != subl_promotions.positive_integer_p(synset_id) : synset_id;
        final SubLObject synset = el_utilities.make_unary_formula(functor, synset_id);
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const116$wnSynsetSpeechPartOffset, synset, (SubLObject)wordnet_import.$list117);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list118;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject speech_part_offset = (SubLObject)wordnet_import.NIL;
        speech_part_offset = results.first();
        if (wordnet_import.NIL == speech_part_offset && wordnet_import.NIL == inference_datastructures_problem_store.problem_store_p(wni_problem_store())) {
            Threads.sleep((SubLObject)wordnet_import.FIVE_INTEGER);
            speech_part_offset = wni_synset_speech_part_offset(synset);
        }
        assert wordnet_import.NIL != Types.stringp(speech_part_offset) : speech_part_offset;
        return speech_part_offset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 26419L)
    public static SubLObject wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        SubLObject caching_state = wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER, (SubLObject)wordnet_import.$sym119$_WNI_SYNSET_SPEECH_PART_OFFSET_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int120$256, (SubLObject)wordnet_import.EQL, (SubLObject)wordnet_import.TWO_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(functor, synset_id);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)wordnet_import.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)wordnet_import.NIL;
            collision = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (wordnet_import.NIL != cached_args && wordnet_import.NIL == cached_args.rest() && synset_id.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_speech_part_offset_helper_internal(functor, synset_id)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(functor, synset_id));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 27905L)
    public static SubLObject wni_hypernym_terms(final SubLObject synset) {
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(synset) : synset;
        SubLObject hypernym_terms = (SubLObject)wordnet_import.NIL;
        SubLObject hypernym_term = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var;
        final SubLObject hypernyms = cdolist_list_var = wni_hypernyms(synset);
        SubLObject hypernym = (SubLObject)wordnet_import.NIL;
        hypernym = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            hypernym_term = wni_synset_term(hypernym);
            if (wordnet_import.NIL != hypernym_term && wordnet_import.NIL != fort_types_interface.collectionP(hypernym_term)) {
                hypernym_terms = (SubLObject)ConsesLow.cons(hypernym_term, hypernym_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hypernym = cdolist_list_var.first();
        }
        final SubLObject list_var = hypernym_terms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return hypernym_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 28501L)
    public static SubLObject wni_hypernym_mappedP(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        return list_utilities.sublisp_boolean(wni_hypernym_terms(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 28752L)
    public static SubLObject wni_synset_term(final SubLObject synset) {
        return wni_synset_term_helper(cycl_utilities.nat_functor(synset), wni_synset_id(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
    public static SubLObject clear_wni_synset_term_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
    public static SubLObject remove_wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(functor, id), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
    public static SubLObject wni_synset_term_helper_internal(final SubLObject functor, final SubLObject id) {
        assert wordnet_import.NIL != kb_indexing_datastructures.indexed_term_p(functor) : functor;
        assert wordnet_import.NIL != subl_promotions.positive_integer_p(id) : id;
        final SubLObject speech_part_offset = wni_synset_speech_part_offset_helper(functor, id);
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const126$synonymousExternalConcept, (SubLObject)wordnet_import.$sym127$_TERM, wordnet_import.$const128$WordNet_Version2_0, speech_part_offset);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list129;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject v_term = results.first();
        if (wordnet_import.NIL == forts.fort_p(v_term)) {
            v_term = (SubLObject)wordnet_import.NIL;
        }
        if (wordnet_import.NIL != v_term && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(v_term)) {
            throw new AssertionError(v_term);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 29101L)
    public static SubLObject wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        SubLObject caching_state = wordnet_import.$wni_synset_term_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym124$WNI_SYNSET_TERM_HELPER, (SubLObject)wordnet_import.$sym130$_WNI_SYNSET_TERM_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQL, (SubLObject)wordnet_import.TWO_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(functor, id);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)wordnet_import.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)wordnet_import.NIL;
            collision = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (wordnet_import.NIL != cached_args && wordnet_import.NIL == cached_args.rest() && id.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_term_helper_internal(functor, id)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(functor, id));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 30227L)
    public static SubLObject wni_unmapped_hypernym_chain(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject unmapped_hypernym_chain = (SubLObject)ConsesLow.list(synset);
        SubLObject hypernym = wni_ensure_naut(synset);
        SubLObject doneP = (SubLObject)wordnet_import.NIL;
        while (wordnet_import.NIL == doneP) {
            hypernym = wni_hypernyms(hypernym).first();
            if (wordnet_import.NIL != hypernym) {
                if (wordnet_import.NIL != wni_synset_term(hypernym)) {
                    doneP = (SubLObject)wordnet_import.T;
                }
                else {
                    unmapped_hypernym_chain = (SubLObject)ConsesLow.cons(hypernym, unmapped_hypernym_chain);
                }
            }
            else {
                doneP = (SubLObject)wordnet_import.T;
            }
        }
        final SubLObject list_var = unmapped_hypernym_chain;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return unmapped_hypernym_chain;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 30961L)
    public static SubLObject wni_synset_wXo_links(final SubLObject synset) {
        return wni_synset_wXo_links_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
    public static SubLObject clear_wni_synset_wXo_links_helper() {
        final SubLObject cs = wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
    public static SubLObject remove_wni_synset_wXo_links_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
    public static SubLObject wni_synset_wXo_links_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject words = wni_synset_words(synset);
        SubLObject first_wordP = (SubLObject)wordnet_import.T;
        SubLObject string = (SubLObject)wordnet_import.NIL;
        string = (SubLObject)wordnet_import.$str134$_;
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)wordnet_import.NIL;
        word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL != first_wordP) {
                first_wordP = (SubLObject)wordnet_import.NIL;
            }
            else {
                string = Sequences.cconcatenate(string, (SubLObject)wordnet_import.$str135$___);
            }
            string = Sequences.cconcatenate(string, word);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        string = Sequences.cconcatenate(string, (SubLObject)wordnet_import.$str136$_);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31144L)
    public static SubLObject wni_synset_wXo_links_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym133$WNI_SYNSET_W_O_LINKS_HELPER, (SubLObject)wordnet_import.$sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.$int138$100, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synset_wXo_links_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31697L)
    public static SubLObject wni_synset_is_causerP(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        return list_utilities.sublisp_boolean(wni_synsets_caused_by(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 31941L)
    public static SubLObject wni_synsets_caused_by(final SubLObject synset) {
        return wni_synsets_caused_by_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
    public static SubLObject clear_wni_synsets_caused_by_helper() {
        final SubLObject cs = wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
    public static SubLObject remove_wni_synsets_caused_by_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
    public static SubLObject wni_synsets_caused_by_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject caused_synsets = (SubLObject)wordnet_import.NIL;
        SubLObject caused_synset = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const142$wnCause, synset, (SubLObject)wordnet_import.$list143);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            caused_synset = result.first().rest();
            if (!caused_synset.equal(synset)) {
                caused_synsets = (SubLObject)ConsesLow.cons(caused_synset, caused_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = caused_synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return caused_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 32165L)
    public static SubLObject wni_synsets_caused_by_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym141$WNI_SYNSETS_CAUSED_BY_HELPER, (SubLObject)wordnet_import.$sym144$_WNI_SYNSETS_CAUSED_BY_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synsets_caused_by_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33165L)
    public static SubLObject wni_synset_is_caused_byP(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        return list_utilities.sublisp_boolean(wni_synsets_caused_by(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33418L)
    public static SubLObject wni_synsets_causing(final SubLObject synset) {
        return wni_synsets_causing_helper(wni_ensure_naut(synset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
    public static SubLObject clear_wni_synsets_causing_helper() {
        final SubLObject cs = wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
    public static SubLObject remove_wni_synsets_causing_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(synset), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
    public static SubLObject wni_synsets_causing_helper_internal(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject causing_synsets = (SubLObject)wordnet_import.NIL;
        SubLObject causing_synset = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const142$wnCause, (SubLObject)wordnet_import.$sym148$_CAUSING_SYNSET, synset);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            causing_synset = result.first().rest();
            if (!causing_synset.equal(synset)) {
                causing_synsets = (SubLObject)ConsesLow.cons(causing_synset, causing_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = causing_synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return causing_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 33635L)
    public static SubLObject wni_synsets_causing_helper(final SubLObject synset) {
        SubLObject caching_state = wordnet_import.$wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym147$WNI_SYNSETS_CAUSING_HELPER, (SubLObject)wordnet_import.$sym149$_WNI_SYNSETS_CAUSING_HELPER_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_synsets_causing_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 34639L)
    public static SubLObject wni_urban_area_geographical_entity(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject gloss_words = string_utilities.split_string(wni_synset_gloss(synset), (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject gloss_word = (SubLObject)wordnet_import.NIL;
        SubLObject ancientP = (SubLObject)wordnet_import.NIL;
        SubLObject doneP = (SubLObject)wordnet_import.NIL;
        SubLObject place_name_words = (SubLObject)wordnet_import.NIL;
        SubLObject place_name = (SubLObject)wordnet_import.NIL;
        SubLObject place_name_denotations = (SubLObject)wordnet_import.NIL;
        SubLObject place_name_denotation = (SubLObject)wordnet_import.NIL;
        while (wordnet_import.NIL == doneP) {
            if (wordnet_import.NIL == gloss_words) {
                return (SubLObject)wordnet_import.NIL;
            }
            gloss_word = gloss_words.first();
            gloss_words = gloss_words.rest();
            if (wordnet_import.NIL != Strings.stringE(gloss_word, (SubLObject)wordnet_import.$str150$ancient, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                ancientP = (SubLObject)wordnet_import.T;
            }
            else if (wordnet_import.NIL != ancientP && wordnet_import.NIL != Strings.stringE(gloss_word, (SubLObject)wordnet_import.$str151$Greek, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                ancientP = (SubLObject)wordnet_import.NIL;
            }
            else {
                ancientP = (SubLObject)wordnet_import.NIL;
                if (wordnet_import.NIL != Characters.upper_case_p(string_utilities.first_char(gloss_word))) {
                    place_name_words = (SubLObject)ConsesLow.cons(gloss_word, place_name_words);
                }
                else {
                    if (wordnet_import.NIL == place_name_words) {
                        continue;
                    }
                    place_name = string_utilities.join_strings(Sequences.reverse(place_name_words), (SubLObject)wordnet_import.$str152$_);
                    if (wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str153$Atlantic) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str154$Pacific) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str155$Crown_Colony) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str156$Caribbean) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str157$State) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str158$Lake_Erie) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str159$Asia_Minor) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str160$Elbo_River) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str161$Asian) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str162$Yourba) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str163$Japanese) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str164$Nile) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str165$River_Thames) || wordnet_import.NIL != string_utilities.starts_with(place_name, (SubLObject)wordnet_import.$str166$River_Aire)) {
                        place_name_words = (SubLObject)wordnet_import.NIL;
                    }
                    else {
                        doneP = (SubLObject)wordnet_import.T;
                    }
                }
            }
        }
        if (wordnet_import.NIL == place_name) {
            return (SubLObject)wordnet_import.NIL;
        }
        place_name = string_utilities.remove_substring(place_name, (SubLObject)wordnet_import.$str167$_s);
        place_name_denotations = lexicon_accessors.denots_of_string(place_name, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
        while (wordnet_import.NIL != place_name_denotations) {
            place_name_denotation = place_name_denotations.first();
            place_name_denotations = place_name_denotations.rest();
            if (wordnet_import.NIL != isa.isa_in_any_mtP(place_name_denotation, wordnet_import.$const168$GeopoliticalEntity) && wordnet_import.NIL == isa.isa_in_any_mtP(place_name_denotation, wordnet_import.$const169$City)) {
                return place_name_denotation;
            }
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 37374L)
    public static SubLObject wni_synsets_having_pos(final SubLObject pos) {
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const109$wnSynsetSpeechPart, (SubLObject)wordnet_import.$sym7$_SYNSET, pos);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject result = (SubLObject)wordnet_import.NIL;
            result = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                synsets = (SubLObject)ConsesLow.cons(result.first().rest(), synsets);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 38260L)
    public static SubLObject wni_terms_synsets(final SubLObject v_term) {
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        SubLObject speech_part_offsets = (SubLObject)wordnet_import.NIL;
        SubLObject synset = (SubLObject)wordnet_import.NIL;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const126$synonymousExternalConcept, v_term, (SubLObject)wordnet_import.$list172);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list173;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = (SubLObject)wordnet_import.NIL;
            v_bindings = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                speech_part_offsets = (SubLObject)ConsesLow.cons(bindings.variable_lookup((SubLObject)wordnet_import.$sym174$_SPEECH_PART_OFFSET, v_bindings), speech_part_offsets);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var = speech_part_offsets;
        SubLObject speech_part_offset = (SubLObject)wordnet_import.NIL;
        speech_part_offset = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            synset = wni_speech_part_offset_to_synset(speech_part_offset);
            if (wordnet_import.NIL != synset) {
                synsets = (SubLObject)ConsesLow.cons(synset, synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            speech_part_offset = cdolist_list_var.first();
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
    public static SubLObject clear_wni_broader_terms() {
        final SubLObject cs = wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
    public static SubLObject remove_wni_broader_terms(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
    public static SubLObject wni_broader_terms_internal(final SubLObject v_term) {
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        SubLObject broader_terms = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var = (wordnet_import.NIL != fort_types_interface.collectionP(v_term)) ? genls.genls(v_term, wordnet_import.$const177$EverythingPSC, (SubLObject)wordnet_import.UNPROVIDED) : isa.isa(v_term, wordnet_import.$const177$EverythingPSC, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject broader_term = (SubLObject)wordnet_import.NIL;
        broader_term = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL == isa.isa_in_any_mtP(broader_term, wordnet_import.$const176$CycKBSubsetCollection) && wordnet_import.NIL != forts.fort_p(broader_term)) {
                broader_terms = (SubLObject)ConsesLow.cons(broader_term, broader_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            broader_term = cdolist_list_var.first();
        }
        final SubLObject list_var;
        broader_terms = (list_var = genls.min_cols(broader_terms, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return broader_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 39426L)
    public static SubLObject wni_broader_terms(final SubLObject v_term) {
        SubLObject caching_state = wordnet_import.$wni_broader_terms_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym175$WNI_BROADER_TERMS, (SubLObject)wordnet_import.$sym178$_WNI_BROADER_TERMS_CACHING_STATE_, (SubLObject)wordnet_import.TEN_INTEGER, (SubLObject)wordnet_import.EQ, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_broader_terms_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 40132L)
    public static SubLObject wni_mapped_terms_and_synsets(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        final SubLObject pos_first_char = list_utilities.alist_lookup(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), wordnet_import.$const95$Noun, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject mapped_terms_and_synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject list_var;
        final SubLObject mapped_terms_and_pos_offsets = list_var = wni_mapped_terms_and_pos_offsets();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str180$finding_synsets_for_speech_part_o, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject mapped_term_and_pos_offset = (SubLObject)wordnet_import.NIL;
                mapped_term_and_pos_offset = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    final SubLObject mapped_term = mapped_term_and_pos_offset.first();
                    final SubLObject pos_offset = conses_high.second(mapped_term_and_pos_offset);
                    if (pos_first_char.equal(string_utilities.first_of_string(pos_offset))) {
                        mapped_terms_and_synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mapped_term, wni_speech_part_offset_to_synset(pos_offset)), mapped_terms_and_synsets);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    mapped_term_and_pos_offset = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
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
        final SubLObject list_var_$9 = mapped_terms_and_synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var_$9) : list_var_$9;
        SubLObject cdolist_list_var = list_var_$9;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return mapped_terms_and_synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 41046L)
    public static SubLObject wni_synset_hypernyms_mappedP(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject hypernyms = wni_hypernyms(synset);
        SubLObject v_term = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL != hypernyms) {
            SubLObject cdolist_list_var = hypernyms;
            SubLObject hypernym = (SubLObject)wordnet_import.NIL;
            hypernym = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                v_term = wni_synset_term(hypernym);
                if (wordnet_import.NIL == v_term || wordnet_import.NIL != fort_types_interface.predicateP(v_term)) {
                    return (SubLObject)wordnet_import.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                hypernym = cdolist_list_var.first();
            }
            return (SubLObject)wordnet_import.T;
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 41537L)
    public static SubLObject wni_mapped_terms() {
        SubLObject mapped_terms = (SubLObject)wordnet_import.NIL;
        SubLObject mapped_term = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)wordnet_import.$list184;
        final SubLObject query_properties = (SubLObject)wordnet_import.$list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const185$WordNetMappingMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            mapped_term = result.first().rest();
            if (wordnet_import.NIL != forts.fort_p(mapped_term)) {
                mapped_terms = (SubLObject)ConsesLow.cons(mapped_term, mapped_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = mapped_terms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return mapped_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 42428L)
    public static SubLObject wni_mapped_terms_and_pos_offsets() {
        SubLObject value_pairs = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)wordnet_import.$list187;
        final SubLObject query_properties = (SubLObject)wordnet_import.$list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const185$WordNetMappingMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            value_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(result.first().rest(), conses_high.second(result).rest()), value_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = value_pairs;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != Types.listp(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return value_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 43291L)
    public static SubLObject wni_speech_part_offset_to_synset(final SubLObject pos_offset) {
        assert wordnet_import.NIL != Types.stringp(pos_offset) : pos_offset;
        SubLObject synset = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const116$wnSynsetSpeechPartOffset, (SubLObject)wordnet_import.$sym7$_SYNSET, pos_offset);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            synset = results.first().first().rest();
        }
        if (wordnet_import.NIL != synset && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == narts_high.naut_p(synset)) {
            throw new AssertionError(synset);
        }
        return synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 44243L)
    public static SubLObject wni_update_synset_with_term(final SubLObject synset, final SubLObject v_term) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.listS((SubLObject)wordnet_import.$kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_update = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str192$update_Synset_set_cyc_term_____A_, v_term, wni_synset_id(synset));
        sdbc.sqls_execute_update(sql_statement, sql_update);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 45132L)
    public static SubLObject wni_insert_concept_match_html(final SubLObject synset, final SubLObject html_string) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.stringp(html_string) : html_string;
        final SubLObject cyc_image_id = control_vars.cyc_image_id();
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.listS((SubLObject)wordnet_import.$kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str194$delete_from_ConceptMatchHTML_wher, wni_synset_id(synset), cyc_image_id);
        final SubLObject sql_insert = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str195$insert_into_ConceptMatchHTML_valu, new SubLObject[] { wni_synset_id(synset), string_utilities.string_substitute((SubLObject)wordnet_import.$str196$__, (SubLObject)wordnet_import.$str197$_, html_string, (SubLObject)wordnet_import.UNPROVIDED), cyc_image_id });
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_execute_update(sql_statement, sql_insert);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 46366L)
    public static SubLObject wni_select_concept_match_html(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.listS((SubLObject)wordnet_import.$kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_query = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str199$select_html_from_ConceptMatchHTML, wni_synset_id(synset), control_vars.cyc_image_id());
        final SubLObject sql_result_set = sdbc.sqls_execute_query(sql_statement, sql_query, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject html_string = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL != sdbc.sqlrs_emptyP(sql_result_set)) {
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return (SubLObject)wordnet_import.NIL;
        }
        sdbc.sqlrs_next(sql_result_set);
        html_string = sdbc.sqlrs_get_object(sql_result_set, (SubLObject)wordnet_import.ONE_INTEGER);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        assert wordnet_import.NIL != Types.stringp(html_string) : html_string;
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 47639L)
    public static SubLObject wni_delete_concept_match_html(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.listS((SubLObject)wordnet_import.$kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str194$delete_from_ConceptMatchHTML_wher, wni_synset_id(synset), control_vars.cyc_image_id());
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 48523L)
    public static SubLObject wni_delete_all_concept_match_html() {
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.listS((SubLObject)wordnet_import.$kw18$DBMS_SERVER, new SubLObject[] { wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str202$delete_from_ConceptMatchHTML_wher, control_vars.cyc_image_id());
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 49309L)
    public static SubLObject wni_unmapped_synsets_having_mapped_hypernym(final SubLObject speech_part) {
        assert wordnet_import.NIL != forts.fort_p(speech_part) : speech_part;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values(wordnet_import.$wni_1_char_pos_map$.getGlobalValue(), speech_part, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
        final SubLObject sql_query = Sequences.cconcatenate((SubLObject)wordnet_import.$str204$select_Synset_synset_id__________, new SubLObject[] { pos, wordnet_import.$str205$__and____________________Synset_c });
        SubLObject rs = (SubLObject)wordnet_import.NIL;
        SubLObject statement = (SubLObject)wordnet_import.NIL;
        SubLObject connection = (SubLObject)wordnet_import.NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), (SubLObject)ConsesLow.list(new SubLObject[] { wordnet_import.$kw18$DBMS_SERVER, wni_access_path_server(), wordnet_import.$kw19$PORT, wni_access_path_proxy_port(), wordnet_import.$kw20$SUBPROTOCOL, wni_access_path_subprotocol(), wordnet_import.$kw21$PROXY_SERVER, wni_access_path_proxy_server(), wordnet_import.$kw22$TIMEOUT, wordnet_import.THREE_INTEGER }));
            if (wordnet_import.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (wordnet_import.NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, (SubLObject)wordnet_import.UNPROVIDED);
            }
            else {
                rs = statement;
            }
            if (wordnet_import.NIL != sdbc.sql_result_set_p(rs)) {
                while (wordnet_import.NIL != sdbc.sqlrs_next(rs)) {
                    synsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(wordnet_import.$const23$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, (SubLObject)wordnet_import.ONE_INTEGER)), synsets);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)wordnet_import.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (wordnet_import.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 50718L)
    public static SubLObject wni_trace_new_cyc_query(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        assert wordnet_import.NIL != Types.listp(sentence) : sentence;
        if (wordnet_import.NIL != mt && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = query_properties;
        assert wordnet_import.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)wordnet_import.NIL, remainder = plist_var; wordnet_import.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert wordnet_import.NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        if (wordnet_import.NIL != inference_datastructures_problem_store.valid_problem_store_p(wni_problem_store()) && wordnet_import.NIL == list_utilities.plist_has_keyP(query_properties, (SubLObject)wordnet_import.$kw209$PROBLEM_STORE)) {
            query_properties = conses_high.putf(conses_high.copy_list(query_properties), (SubLObject)wordnet_import.$kw209$PROBLEM_STORE, wni_problem_store());
        }
        SubLObject results = (SubLObject)wordnet_import.NIL;
        results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        assert wordnet_import.NIL != Types.listp(results) : results;
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 51552L)
    public static SubLObject wni_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (wordnet_import.NIL != inference_datastructures_problem_store.problem_store_p(wordnet_import.$wni_problem_store$.getDynamicValue(thread))) {
            if (wordnet_import.NIL == inference_datastructures_problem_store.valid_problem_store_p(wordnet_import.$wni_problem_store$.getDynamicValue(thread))) {
                Errors.warn((SubLObject)wordnet_import.$str210$Destroying_invalid_WordNet_Import);
                inference_datastructures_problem_store.destroy_problem_store(wordnet_import.$wni_problem_store$.getDynamicValue(thread));
                wordnet_import.$wni_problem_store$.setDynamicValue(new_wni_problem_store(), thread);
            }
            else if (inference_datastructures_problem_store.problem_store_problem_count(wordnet_import.$wni_problem_store$.getDynamicValue(thread)).numG(Numbers.multiply((SubLObject)wordnet_import.$float211$0_9, inference_datastructures_problem_store.problem_store_max_problem_count(wordnet_import.$wni_problem_store$.getDynamicValue(thread))))) {
                Errors.warn((SubLObject)wordnet_import.$str212$Destroying_90___full_WordNet_Impo);
                inference_datastructures_problem_store.destroy_problem_store(wordnet_import.$wni_problem_store$.getDynamicValue(thread));
                wordnet_import.$wni_problem_store$.setDynamicValue(new_wni_problem_store(), thread);
            }
        }
        return wordnet_import.$wni_problem_store$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52212L)
    public static SubLObject new_wni_problem_store() {
        return inference_datastructures_problem_store.new_problem_store(wni_problem_store_properties());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52313L)
    public static SubLObject wni_problem_store_properties() {
        return (SubLObject)wordnet_import.$list213;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52472L)
    public static SubLObject wni_unreified_synset(final SubLObject reified_synset) {
        assert wordnet_import.NIL != nart_handles.nart_p(reified_synset) : reified_synset;
        final SubLObject synset = (SubLObject)ConsesLow.list(wordnet_import.$const23$WordNetSynsetFn, cycl_utilities.nat_arg1(reified_synset, (SubLObject)wordnet_import.UNPROVIDED));
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        return synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 52990L)
    public static SubLObject wni_reifiable_synset(final SubLObject synset) {
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(synset) : synset;
        final SubLObject reifiable_synset = el_utilities.make_unary_formula(wordnet_import.$const216$WordNetSynsetReifiedFn, conses_high.second(synset));
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(reifiable_synset) : reifiable_synset;
        return reifiable_synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 53474L)
    public static SubLObject wni_reifiable_synset_from_string(final SubLObject synset_id_string) {
        assert wordnet_import.NIL != Types.stringp(synset_id_string) : synset_id_string;
        final SubLObject reifiable_synset = (SubLObject)ConsesLow.list(wordnet_import.$const216$WordNetSynsetReifiedFn, string_utilities.string_to_integer(synset_id_string));
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(reifiable_synset) : reifiable_synset;
        return reifiable_synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54006L)
    public static SubLObject wni_synset_from_id_string(final SubLObject synset_id_string) {
        assert wordnet_import.NIL != string_utilities.digit_stringP(synset_id_string) : synset_id_string;
        final SubLObject id = string_utilities.string_to_integer(synset_id_string);
        final SubLObject synset = el_utilities.make_unary_formula(wordnet_import.$const23$WordNetSynsetFn, id);
        return synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54477L)
    public static SubLObject wni_ensure_naut(final SubLObject synset) {
        SubLObject synset_consp = synset;
        if (wordnet_import.NIL != nart_handles.nart_p(synset) || cycl_utilities.nat_functor(synset).eql(wordnet_import.$const216$WordNetSynsetReifiedFn)) {
            synset_consp = el_utilities.make_unary_formula(wordnet_import.$const23$WordNetSynsetFn, cycl_utilities.nat_arg1(synset, (SubLObject)wordnet_import.UNPROVIDED));
        }
        assert wordnet_import.NIL != el_utilities.possibly_naut_p(synset_consp) : synset_consp;
        return synset_consp;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 54931L)
    public static SubLObject wni_next_synset_with_status(final SubLObject status) {
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        SubLObject synset = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const223$isa, (SubLObject)wordnet_import.$sym224$_REIFIED_SYNSET, status), (SubLObject)wordnet_import.$list225);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            synset = wni_unreified_synset(results.first().first().rest());
        }
        if (wordnet_import.NIL != synset && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == narts_high.naut_p(synset)) {
            throw new AssertionError(synset);
        }
        return synset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 55979L)
    public static SubLObject wni_unlocked_synsets_with_status(final SubLObject status) {
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        SubLObject synsets = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const223$isa, (SubLObject)wordnet_import.$sym224$_REIFIED_SYNSET, status), (SubLObject)wordnet_import.$list225);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = (SubLObject)wordnet_import.NIL;
        result = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            synsets = (SubLObject)ConsesLow.cons(wni_unreified_synset(result.first().rest()), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        final SubLObject list_var = synsets;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return synsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57044L)
    public static SubLObject wni_term_has_verb_semtransP(final SubLObject v_term) {
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        return wni_term_has_verb_semtrans_helperP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
    public static SubLObject clear_wni_term_has_verb_semtrans_helperP() {
        final SubLObject cs = wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (wordnet_import.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
    public static SubLObject remove_wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
    public static SubLObject wni_term_has_verb_semtrans_helperP_internal(final SubLObject v_term) {
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym229$_WORD_UNIT, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym230$_SENSE_NBR, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const231$denotation, (SubLObject)wordnet_import.$sym229$_WORD_UNIT, wordnet_import.$const232$Verb, (SubLObject)wordnet_import.$sym230$_SENSE_NBR, v_term), (SubLObject)ConsesLow.list(wordnet_import.$const233$unknownSentence, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym234$_FRAME, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym235$_TRANS, (SubLObject)ConsesLow.listS(wordnet_import.$const236$verbSemTrans_Canonical, (SubLObject)wordnet_import.$sym229$_WORD_UNIT, (SubLObject)wordnet_import.$sym230$_SENSE_NBR, (SubLObject)wordnet_import.$sym234$_FRAME, v_term, (SubLObject)wordnet_import.$list237)))), (SubLObject)wordnet_import.$list238)));
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        return (SubLObject)SubLObjectFactory.makeBoolean(!results.equal((SubLObject)wordnet_import.$list239));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 57235L)
    public static SubLObject wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        SubLObject caching_state = wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (wordnet_import.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)wordnet_import.$sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_, (SubLObject)wordnet_import.$sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_, (SubLObject)wordnet_import.$int74$1000, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.ONE_INTEGER, (SubLObject)wordnet_import.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(wni_term_has_verb_semtrans_helperP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)wordnet_import.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 58626L)
    public static SubLObject wni_gather_terms_for_matching(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject terms = (SubLObject)wordnet_import.NIL;
        final SubLObject collectionP = wni_synset_collectionP(synset);
        terms = wni_exact_synset_term_matches(synset);
        if (wordnet_import.NIL == terms) {
            terms = wni_strong_synset_term_matches(synset, collectionP);
        }
        if (wordnet_import.NIL == terms) {
            terms = wni_weak_synset_term_matches(synset, collectionP, (SubLObject)wordnet_import.UNPROVIDED);
        }
        if (Sequences.length(terms).numL(wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
            SubLObject cdolist_list_var = cb_wordnet_utilities.wni_string_synset_term_matches(synset, collectionP);
            SubLObject v_term = (SubLObject)wordnet_import.NIL;
            v_term = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                if (Sequences.length(terms).numL(wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
                    final SubLObject item_var = v_term;
                    if (wordnet_import.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        terms = Sequences.nreverse(terms);
        if (wni_synset_pos(synset).eql(wordnet_import.$const232$Verb)) {
            SubLObject situation_terms = (SubLObject)wordnet_import.NIL;
            SubLObject cdolist_list_var2 = terms;
            SubLObject v_term2 = (SubLObject)wordnet_import.NIL;
            v_term2 = cdolist_list_var2.first();
            while (wordnet_import.NIL != cdolist_list_var2) {
                if (wordnet_import.NIL != fort_types_interface.collectionP(v_term2) && wordnet_import.NIL != genls.genlsP(v_term2, wordnet_import.$const38$Situation, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                    situation_terms = (SubLObject)ConsesLow.cons(v_term2, situation_terms);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term2 = cdolist_list_var2.first();
            }
            terms = Sequences.nreverse(situation_terms);
        }
        final SubLObject list_var = terms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 60113L)
    public static SubLObject wni_exact_synset_term_matches(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject terms = (SubLObject)wordnet_import.NIL;
        final SubLObject pos = wni_synset_pos(synset);
        final SubLObject synset_collectionP = wni_synset_collectionP(synset);
        final SubLObject synset_words = wni_synset_words(synset);
        final SubLObject hypernym_terms = wni_hypernym_terms(synset);
        if (wordnet_import.NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str243$___A_mapped_hypernyms__A___A__, new SubLObject[] { synset, hypernym_terms, wni_synset_gloss(synset) });
            streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        synset_word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str244$__considering_word____a__, synset_word);
                streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
            }
            SubLObject possible_matches = lexicon_accessors.denots_of_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
            if (pos.eql(wordnet_import.$const232$Verb)) {
                SubLObject possible_situation_matches = (SubLObject)wordnet_import.NIL;
                SubLObject cdolist_list_var_$10 = possible_matches;
                SubLObject possible_match = (SubLObject)wordnet_import.NIL;
                possible_match = cdolist_list_var_$10.first();
                while (wordnet_import.NIL != cdolist_list_var_$10) {
                    if (wordnet_import.NIL != forts.fort_p(possible_match) && wordnet_import.NIL != genls.genlsP(possible_match, wordnet_import.$const38$Situation, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                        possible_situation_matches = (SubLObject)ConsesLow.cons(possible_match, possible_situation_matches);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    possible_match = cdolist_list_var_$10.first();
                }
                possible_matches = possible_situation_matches;
            }
            if (wordnet_import.NIL != possible_matches) {
                if (wordnet_import.NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str245$____possible_lexical_matches__A__, possible_matches);
                    streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                }
                SubLObject cdolist_list_var_$11 = possible_matches;
                SubLObject possible_match2 = (SubLObject)wordnet_import.NIL;
                possible_match2 = cdolist_list_var_$11.first();
                while (wordnet_import.NIL != cdolist_list_var_$11) {
                    SubLObject mapped_broader_terms = (SubLObject)wordnet_import.NIL;
                    final SubLObject generated_phrase = pph_main.generate_phrase(possible_match2, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
                    SubLObject cdolist_list_var_$12 = (wordnet_import.NIL != synset_collectionP) ? genls.genls(possible_match2, wordnet_import.$const177$EverythingPSC, (SubLObject)wordnet_import.UNPROVIDED) : isa.isa(possible_match2, wordnet_import.$const177$EverythingPSC, (SubLObject)wordnet_import.UNPROVIDED);
                    SubLObject mapped_broader_term = (SubLObject)wordnet_import.NIL;
                    mapped_broader_term = cdolist_list_var_$12.first();
                    while (wordnet_import.NIL != cdolist_list_var_$12) {
                        if (wordnet_import.NIL == isa.isa_in_any_mtP(mapped_broader_term, wordnet_import.$const176$CycKBSubsetCollection)) {
                            mapped_broader_terms = (SubLObject)ConsesLow.cons(mapped_broader_term, mapped_broader_terms);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        mapped_broader_term = cdolist_list_var_$12.first();
                    }
                    if (wordnet_import.NIL != wordnet_import.$wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str246$____considering_term____a___const, possible_match2, mapped_broader_terms);
                        streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                    }
                    if (wordnet_import.NIL != forts.fort_p(possible_match2) && fort_types_interface.collectionP(possible_match2).eql(synset_collectionP)) {
                        if (wordnet_import.NIL != conses_high.intersection(hypernym_terms, mapped_broader_terms, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                            if (wordnet_import.NIL != wordnet_import.$wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str247$___A_____A__structure___, synset_word, possible_match2);
                                streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                            }
                            final SubLObject item_var = possible_match2;
                            if (wordnet_import.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                                terms = (SubLObject)ConsesLow.cons(item_var, terms);
                            }
                        }
                        else if (wordnet_import.NIL != Strings.stringE(generated_phrase, synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED) && wordnet_import.NIL == disjoint_with.any_disjoint_with_anyP(hypernym_terms, mapped_broader_terms, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                            if (wordnet_import.NIL != wordnet_import.$wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                PrintLow.format((SubLObject)wordnet_import.T, (SubLObject)wordnet_import.$str248$___A____A__lexicon___, synset_word, possible_match2);
                                streams_high.force_output((SubLObject)wordnet_import.UNPROVIDED);
                            }
                            final SubLObject item_var = possible_match2;
                            if (wordnet_import.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                                terms = (SubLObject)ConsesLow.cons(item_var, terms);
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
        if (pos.eql(wordnet_import.$const232$Verb)) {
            cdolist_list_var = wni_derived_forms(synset);
            SubLObject derivationally_related_synset = (SubLObject)wordnet_import.NIL;
            derivationally_related_synset = cdolist_list_var.first();
            while (wordnet_import.NIL != cdolist_list_var) {
                if (wordnet_import.$const95$Noun.eql(wni_synset_pos(derivationally_related_synset))) {
                    SubLObject v_term = (SubLObject)wordnet_import.NIL;
                    v_term = wni_synset_term(derivationally_related_synset);
                    if (wordnet_import.NIL != v_term && wordnet_import.NIL != forts.fort_p(v_term) && wordnet_import.NIL != genls.genlP(v_term, wordnet_import.$const38$Situation, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED) && wordnet_import.NIL == subl_promotions.memberP(v_term, terms, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                        terms = list_utilities.add_to_end(v_term, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_synset = cdolist_list_var.first();
            }
        }
        final SubLObject list_var = terms;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 63264L)
    public static SubLObject wni_strong_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(collectionP) : collectionP;
        final SubLObject all_hypernyms = wni_all_hypernyms(synset);
        final SubLObject synset_words = wni_synset_words(synset);
        SubLObject pos = lexification_utilities.keyword_for_pos(wni_synset_pos(synset), (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject ans = (SubLObject)wordnet_import.NIL;
        if (pos == wordnet_import.$kw251$NOUN) {
            pos = (SubLObject)wordnet_import.$kw252$ALL_NOUN_FORMS;
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = (SubLObject)wordnet_import.NIL;
        word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            final SubLObject possibilities = lexicon_accessors.denots_of_stringXpos(word, pos, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED);
            if (wordnet_import.NIL != possibilities) {
                SubLObject cdolist_list_var_$13 = all_hypernyms;
                SubLObject hypernym = (SubLObject)wordnet_import.NIL;
                hypernym = cdolist_list_var_$13.first();
                while (wordnet_import.NIL != cdolist_list_var_$13) {
                    final SubLObject hypernym_term = wni_synset_term(hypernym);
                    if (wordnet_import.NIL != hypernym_term) {
                        SubLObject cdolist_list_var_$14 = possibilities;
                        SubLObject possibility = (SubLObject)wordnet_import.NIL;
                        possibility = cdolist_list_var_$14.first();
                        while (wordnet_import.NIL != cdolist_list_var_$14) {
                            if (wordnet_import.NIL != forts.fort_p(possibility) && wordnet_import.NIL == subl_promotions.memberP(possibility, ans, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)wordnet_import.$sym253$RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind(wordnet_import.$const177$EverythingPSC, thread);
                                    if (wordnet_import.NIL != genls.genlP(possibility, hypernym_term, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED) || wordnet_import.NIL != isa.isaP(possibility, hypernym_term, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                                        final SubLObject item_var = possibility;
                                        if (wordnet_import.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
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
        ans = (list_var = ((wordnet_import.NIL != collectionP) ? list_utilities.find_all_if(Symbols.symbol_function((SubLObject)wordnet_import.$sym254$SET_OR_COLLECTION_), ans, (SubLObject)wordnet_import.UNPROVIDED) : list_utilities.find_all_if(Symbols.symbol_function((SubLObject)wordnet_import.$sym255$INDIVIDUAL_), ans, (SubLObject)wordnet_import.UNPROVIDED)));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 65012L)
    public static SubLObject wni_weak_synset_term_matches(final SubLObject synset, final SubLObject collectionP, SubLObject check_posP) {
        if (check_posP == wordnet_import.UNPROVIDED) {
            check_posP = (SubLObject)wordnet_import.NIL;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(collectionP) : collectionP;
        final SubLObject synset_words = wni_synset_words(synset);
        SubLObject ans = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = (SubLObject)wordnet_import.NIL;
        word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            SubLObject possibilities = (SubLObject)wordnet_import.NIL;
            SubLObject cdolist_list_var_$15;
            possibilities = (cdolist_list_var_$15 = ((wordnet_import.NIL != check_posP) ? lexicon_accessors.denots_of_stringXpos(word, lexification_utilities.keyword_for_pos(wni_synset_pos(synset), (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED) : lexicon_accessors.denots_of_string(word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)));
            SubLObject possibility = (SubLObject)wordnet_import.NIL;
            possibility = cdolist_list_var_$15.first();
            while (wordnet_import.NIL != cdolist_list_var_$15) {
                if (wordnet_import.NIL != forts.fort_p(possibility)) {
                    final SubLObject item_var = possibility;
                    if (wordnet_import.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)wordnet_import.EQL), Symbols.symbol_function((SubLObject)wordnet_import.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                possibility = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        ans = Sequences.nreverse(ans);
        final SubLObject list_var;
        ans = (list_var = ((wordnet_import.NIL != collectionP) ? list_utilities.find_all_if(Symbols.symbol_function((SubLObject)wordnet_import.$sym254$SET_OR_COLLECTION_), ans, (SubLObject)wordnet_import.UNPROVIDED) : list_utilities.find_all_if(Symbols.symbol_function((SubLObject)wordnet_import.$sym255$INDIVIDUAL_), ans, (SubLObject)wordnet_import.UNPROVIDED)));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 66472L)
    public static SubLObject wni_create_now(final SubLObject name) {
        SubLObject constant = constants_high.find_constant(name);
        if (wordnet_import.NIL == constant_handles.valid_constantP(constant, (SubLObject)wordnet_import.UNPROVIDED)) {
            assert wordnet_import.NIL != Types.stringp(name) : name;
            ke.ke_create_now(name, (SubLObject)wordnet_import.UNPROVIDED);
            constant = constants_high.find_constant(name);
        }
        assert wordnet_import.NIL != constant_handles.constant_p(constant) : constant;
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 66896L)
    public static SubLObject wni_assert_wff(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.consp(sentence) : sentence;
        assert wordnet_import.NIL != hlmt.hlmt_p(mt) : mt;
        assert wordnet_import.NIL != enumeration_types.direction_p(direction) : direction;
        assert wordnet_import.NIL != enumeration_types.el_strength_p(strength) : strength;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now(sentence, mt, strength, direction);
        }
        else {
            ke.ke_assert(sentence, mt, strength, direction);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 67598L)
    public static SubLObject wni_unassert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synsets) : synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = (SubLObject)wordnet_import.NIL;
        synset = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            wni_unassert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 68028L)
    public static SubLObject wni_unassert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_unassert_now((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, wni_reifiable_synset(synset), status), wordnet_import.$const31$WordNetWorkflowDataStatusMt);
        }
        else {
            ke.ke_unassert((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, wni_reifiable_synset(synset), status), wordnet_import.$const31$WordNetWorkflowDataStatusMt);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 68589L)
    public static SubLObject wni_assert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synsets) : synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != narts_high.naut_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = (SubLObject)wordnet_import.NIL;
        synset = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            wni_assert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 69010L)
    public static SubLObject wni_assert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != forts.fort_p(status) : status;
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)wordnet_import.NIL, thread);
                ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, wni_reifiable_synset(synset), status), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
            }
            finally {
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, wni_reifiable_synset(synset), status), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 69743L)
    public static SubLObject wni_assert_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        clear_wni_synset_term_helper();
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const126$synonymousExternalConcept, v_term, wordnet_import.$const128$WordNet_Version2_0, wni_synset_speech_part_offset(synset)), wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const126$synonymousExternalConcept, v_term, wordnet_import.$const128$WordNet_Version2_0, wni_synset_speech_part_offset(synset)), wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 70483L)
    public static SubLObject wni_assert_likely_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const271$wnLikelySynsetMapping, wni_reifiable_synset(synset), v_term), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const271$wnLikelySynsetMapping, wni_synset_speech_part_offset(synset), v_term), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 71163L)
    public static SubLObject wni_assert_quoted_isa_workflow_constant(final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.listS(wordnet_import.$const273$quotedIsa, v_term, (SubLObject)wordnet_import.$list274), wordnet_import.$const275$BookkeepingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.listS(wordnet_import.$const273$quotedIsa, v_term, (SubLObject)wordnet_import.$list274), wordnet_import.$const275$BookkeepingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 71720L)
    public static SubLObject wni_assert_isa_collection(final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        ke.ke_assert_wff_now((SubLObject)ConsesLow.listS(wordnet_import.$const223$isa, v_term, (SubLObject)wordnet_import.$list277), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 72073L)
    public static SubLObject wni_assert_genls(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = (SubLObject)wordnet_import.NIL;
        genl_term = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            if (wordnet_import.NIL == genls.genl_in_any_mtP(v_term, genl_term)) {
                if (wordnet_import.NIL != nowP) {
                    ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const280$genls, v_term, genl_term), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
                }
                else {
                    ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const280$genls, v_term, genl_term), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 72734L)
    public static SubLObject wni_unassert_genls(final SubLObject v_term, final SubLObject genl_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(genl_term) : genl_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_unassert_now((SubLObject)ConsesLow.list(wordnet_import.$const280$genls, v_term, genl_term), wordnet_import.$const278$UniversalVocabularyMt);
        }
        else {
            ke.ke_unassert((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, v_term, genl_term), wordnet_import.$const278$UniversalVocabularyMt);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 73223L)
    public static SubLObject wni_assert_isa(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = (SubLObject)wordnet_import.NIL;
        genl_term = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            if (wordnet_import.NIL == isa.isa_in_any_mtP(v_term, genl_term)) {
                if (wordnet_import.NIL != nowP) {
                    ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, v_term, genl_term), wordnet_import.$const283$WordNetIndividualMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
                }
                else {
                    ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const223$isa, v_term, genl_term), wordnet_import.$const283$WordNetIndividualMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 73807L)
    public static SubLObject wni_assert_isa_individual(final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.listS(wordnet_import.$const223$isa, v_term, (SubLObject)wordnet_import.$list285), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.listS(wordnet_import.$const223$isa, v_term, (SubLObject)wordnet_import.$list285), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 74279L)
    public static SubLObject wni_assert_isa_agent_generic(final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL == isa.isaP(v_term, wordnet_import.$const287$Agent_Generic, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            if (wordnet_import.NIL != nowP) {
                ke.ke_assert_wff_now((SubLObject)ConsesLow.listS(wordnet_import.$const223$isa, v_term, (SubLObject)wordnet_import.$list288), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
            }
            else {
                ke.ke_assert((SubLObject)ConsesLow.listS(wordnet_import.$const223$isa, v_term, (SubLObject)wordnet_import.$list288), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
            }
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 74803L)
    public static SubLObject wni_assert_reified_using(final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.listS(wordnet_import.$const290$reifiedUsingTool, v_term, (SubLObject)wordnet_import.$list291), wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.listS(wordnet_import.$const290$reifiedUsingTool, v_term, (SubLObject)wordnet_import.$list291), wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 75326L)
    public static SubLObject wni_synset_note(final SubLObject synset) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        SubLObject note = (SubLObject)wordnet_import.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const293$wnSynsetNote, wni_reifiable_synset(synset), (SubLObject)wordnet_import.$list294);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            note = results.first().first().rest();
        }
        if (wordnet_import.NIL == note) {
            note = (SubLObject)wordnet_import.$str295$;
        }
        assert wordnet_import.NIL != Types.stringp(note) : note;
        return note;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 76249L)
    public static SubLObject wni_assert_synset_note(final SubLObject synset, final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.stringp(note) : note;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)wordnet_import.NIL, thread);
            ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const293$wnSynsetNote, wni_reifiable_synset(synset), note), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 76722L)
    public static SubLObject wni_unassert_synset_note(final SubLObject synset, final SubLObject note) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.stringp(note) : note;
        ke.ke_unassert_now((SubLObject)ConsesLow.list(wordnet_import.$const293$wnSynsetNote, wni_reifiable_synset(synset), note), wordnet_import.$const31$WordNetWorkflowDataStatusMt);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77103L)
    public static SubLObject wni_assert_comment(final SubLObject v_term, final SubLObject comment, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.stringp(comment) : comment;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != nowP) {
            ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const299$comment, v_term, comment), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        else {
            ke.ke_assert((SubLObject)ConsesLow.list(wordnet_import.$const299$comment, v_term, comment), wordnet_import.$const278$UniversalVocabularyMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77640L)
    public static SubLObject wni_assert_term_of_unit(final SubLObject nat) {
        assert wordnet_import.NIL != Types.consp(nat) : nat;
        ke.ke_assert_now((SubLObject)ConsesLow.list(wordnet_import.$const301$termOfUnit, nat, nat), wordnet_import.$const302$BaseKB, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 77895L)
    public static SubLObject wni_lock_synset(final SubLObject synset) {
        ke.ke_assert_wff_now((SubLObject)ConsesLow.list(wordnet_import.$const304$wnWorkflowSynsetLock, wni_reifiable_synset(synset), operation_communication.the_cyclist(), date_utilities.indexical_now()), wordnet_import.$const31$WordNetWorkflowDataStatusMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 78219L)
    public static SubLObject wni_unlock_synset(final SubLObject synset, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject date = (SubLObject)wordnet_import.NIL;
        final SubLObject reifiable_synset = wni_reifiable_synset(synset);
        final SubLObject sentence = (SubLObject)ConsesLow.listS(wordnet_import.$const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), (SubLObject)wordnet_import.$list306);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const10$WordNetWorkflowCollectorMt, query_properties);
        if (wordnet_import.NIL != results) {
            date = results.first().first().rest();
            if (wordnet_import.NIL != nowP) {
                ke.ke_unassert_now((SubLObject)ConsesLow.list(wordnet_import.$const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), wordnet_import.$const31$WordNetWorkflowDataStatusMt);
            }
            else {
                ke.ke_unassert((SubLObject)ConsesLow.list(wordnet_import.$const304$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), wordnet_import.$const31$WordNetWorkflowDataStatusMt);
            }
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 79376L)
    public static SubLObject wni_assert_heuristic_lexicon(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != wni_synset_collectionP(synset)) {
            wni_assert_heuristic_lexicon_for_collection(synset, workflow_alist, v_term, nowP);
        }
        else {
            wni_assert_heuristic_lexicon_for_individual(synset, v_term, workflow_alist, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 80507L)
    public static SubLObject wni_assert_heuristic_lexicon_for_collection(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$organism_being_synset$.getGlobalValue()) && wordnet_import.NIL == wni_all_hypernymP(synset, wordnet_import.$person_synset$.getGlobalValue())) {
            wni_assert_heuristic_lexicon_for_organism(synset, v_term, workflow_alist, nowP);
            return (SubLObject)wordnet_import.NIL;
        }
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$chemical_compound_synset$.getGlobalValue())) {
            wni_assert_heuristic_lexicon_for_chemical(synset, v_term, nowP);
        }
        final SubLObject synset_words = wni_synset_words(synset);
        wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 81635L)
    public static SubLObject wni_assert_heuristic_lexicon_for_collection_common(final SubLObject synset, final SubLObject synset_words, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(synset_words) : synset_words;
        SubLObject cdolist_list_var = synset_words;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var2 = synset_words;
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        synset_word = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            if (wordnet_import.NIL != list_utilities.alist_lookup(workflow_alist, Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str312$_included), (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED)) {
                final SubLObject pos = wni_heuristic_pos(synset, synset_word, workflow_alist);
                if (wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_hyphen)) {
                    wni_assert_lexicon_for_hyphen_string(synset_word, v_term, workflow_alist, pos, nowP);
                }
                else if (wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_space)) {
                    wni_assert_lexicon_for_phrase(synset_word, v_term, workflow_alist, pos, nowP);
                }
                else {
                    wni_assert_lexicon_for_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset_word = cdolist_list_var2.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 83409L)
    public static SubLObject wni_assert_heuristic_lexicon_for_individual(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        if (wordnet_import.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !wordnet_import.$const95$Noun.equal(wni_synset_pos(synset))) {
            Errors.error((SubLObject)wordnet_import.$str316$WordNet_individual_synset__A_must, synset);
        }
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$person_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_person(synset, v_term, nowP);
            return (SubLObject)wordnet_import.NIL;
        }
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$country_synset$.getGlobalValue())) {
            return (SubLObject)wordnet_import.NIL;
        }
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$urban_area_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_urban_area(synset, v_term, nowP);
            return (SubLObject)wordnet_import.NIL;
        }
        if (wordnet_import.NIL != wni_all_hypernymP(synset, wordnet_import.$geographical_area_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_geographical_area(synset, v_term, nowP);
            return (SubLObject)wordnet_import.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject synset_words = cdolist_list_var = wni_synset_words(synset);
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        synset_word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL != list_utilities.alist_lookup(workflow_alist, Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str312$_included), (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED) && wordnet_import.NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                if (wordnet_import.NIL != Strings.stringE(synset_word, Strings.string_upcase(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                    if (wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_A) || wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_E) || wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_I) || wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_O) || wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_U)) {
                        wni_assert_acronym(synset_word, v_term, nowP);
                    }
                    else {
                        wni_assert_initialism(synset_word, v_term, nowP);
                    }
                }
                else {
                    wni_assert_name_string(synset_word, v_term, nowP);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 85433L)
    public static SubLObject wni_assert_heuristic_lexicon_for_organism(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject synset_words = wni_synset_words(synset);
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        if (wordnet_import.NIL != Characters.upper_case_p(string_utilities.first_char(last_synset_word))) {
            wni_assert_isa(v_term, (SubLObject)ConsesLow.list(wordnet_import.$const317$BiologicalSpecies), nowP);
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const318$scientificName, v_term, last_synset_word), wordnet_import.$const319$NewLatinLexicalMt, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            synset_words = list_utilities.remove_last(synset_words);
        }
        wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 86971L)
    public static SubLObject wni_assert_heuristic_lexicon_for_chemical(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject cdolist_list_var;
        final SubLObject gloss_words = cdolist_list_var = string_utilities.split_string(wni_synset_gloss(synset), (SubLObject)wordnet_import.$list320);
        SubLObject gloss_word = (SubLObject)wordnet_import.NIL;
        gloss_word = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL != string_utilities.starts_with(gloss_word, (SubLObject)wordnet_import.$str134$_) && wordnet_import.NIL != string_utilities.ends_with(gloss_word, (SubLObject)wordnet_import.$str136$_, (SubLObject)wordnet_import.UNPROVIDED)) {
                gloss_word = Sequences.subseq(gloss_word, (SubLObject)wordnet_import.ONE_INTEGER, Numbers.subtract(Sequences.length(gloss_word), (SubLObject)wordnet_import.ONE_INTEGER));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gloss_word = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 88130L)
    public static SubLObject wni_assert_lexicon_for_hyphen_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject hyphenated_words = string_utilities.split_string(synset_word, (SubLObject)wordnet_import.$list321);
        final SubLObject all_but_last_words = ConsesLow.append((SubLObject)ConsesLow.list(wordnet_import.$const322$TheList), list_utilities.remove_last(hyphenated_words));
        final SubLObject last_word = list_utilities.last_one(hyphenated_words);
        SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        SubLObject sentence = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == last_word_unit) {
            lexification_wizard.add_lexical_mapping(last_word, pos, wordnet_import.$const323$GeneralEnglishMt, (SubLObject)wordnet_import.UNPROVIDED);
            last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        }
        if (wordnet_import.NIL != last_word_unit) {
            sentence = (SubLObject)ConsesLow.list(wordnet_import.$const324$hyphenString, all_but_last_words, last_word_unit, pos, v_term);
            wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 89535L)
    public static SubLObject wni_assert_lexicon_for_phrase(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject key = Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED);
        if (wordnet_import.NIL != Strings.stringE(value, (SubLObject)wordnet_import.$str327$headword_is_first, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            wni_assert_lexicon_for_compound_string(synset_word, v_term, workflow_alist, pos, nowP);
        }
        else {
            wni_assert_lexicon_for_multi_word_string(synset_word, v_term, workflow_alist, pos, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 90549L)
    public static SubLObject wni_assert_lexicon_for_multi_word_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject multi_words = string_utilities.split_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED);
        final SubLObject all_but_last_words = ConsesLow.append((SubLObject)ConsesLow.list(wordnet_import.$const322$TheList), list_utilities.remove_last(multi_words));
        final SubLObject last_word = list_utilities.last_one(multi_words);
        SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        SubLObject sentence = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == last_word_unit) {
            lexification_wizard.add_lexical_mapping(last_word, pos, wordnet_import.$const323$GeneralEnglishMt, (SubLObject)wordnet_import.UNPROVIDED);
            last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        }
        if (wordnet_import.NIL != last_word_unit) {
            sentence = (SubLObject)ConsesLow.list(wordnet_import.$const328$multiWordString, all_but_last_words, last_word_unit, pos, v_term);
            wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 91942L)
    public static SubLObject wni_assert_lexicon_for_compound_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject multi_words = string_utilities.split_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED);
        final SubLObject all_but_first_words = ConsesLow.append((SubLObject)ConsesLow.list(wordnet_import.$const322$TheList), multi_words.rest());
        final SubLObject first_word = multi_words.first();
        SubLObject first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
        SubLObject sentence = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == first_word_unit) {
            lexification_wizard.add_lexical_mapping(first_word, pos, wordnet_import.$const323$GeneralEnglishMt, (SubLObject)wordnet_import.UNPROVIDED);
            first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
        }
        if (wordnet_import.NIL != first_word_unit) {
            sentence = (SubLObject)ConsesLow.list(wordnet_import.$const329$compoundString, first_word_unit, all_but_first_words, pos, v_term);
            wni_assert_wff(sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 93332L)
    public static SubLObject wni_assert_lexicon_for_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        SubLObject word_sense = (SubLObject)wordnet_import.NIL;
        SubLObject denotation_sentence = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == word_unit) {
            lexification_wizard.add_lexical_mapping(synset_word, pos, wordnet_import.$const323$GeneralEnglishMt, (SubLObject)wordnet_import.UNPROVIDED);
            word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        }
        if (wordnet_import.NIL != word_unit) {
            if (wordnet_import.NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                wni_assert_lexicon_for_existing_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                return (SubLObject)wordnet_import.NIL;
            }
            word_sense = lexicon_utilities.unique_ws(word_unit, pos, v_term);
            denotation_sentence = (SubLObject)ConsesLow.list(wordnet_import.$const231$denotation, word_unit, pos, word_sense, v_term);
            wni_assert_wff(denotation_sentence, wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 94790L)
    public static SubLObject wni_assert_lexicon_for_existing_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != forts.fort_p(pos) : pos;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        SubLObject actual_pos = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import.NIL == word_unit) {
            Errors.error((SubLObject)wordnet_import.$str330$must_have_an_existing_word_unit_f, synset_word, pos);
        }
        SubLObject word_sense = (SubLObject)wordnet_import.NIL;
        SubLObject denotation_sentence = (SubLObject)wordnet_import.NIL;
        final SubLObject query = (SubLObject)ConsesLow.list(wordnet_import.$const231$denotation, word_unit, (SubLObject)wordnet_import.$sym52$_POS, (SubLObject)wordnet_import.$sym331$_WORD_SENSE, v_term);
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        final SubLObject results = wni_trace_new_cyc_query(query, wordnet_import.$const323$GeneralEnglishMt, query_properties);
        if (wordnet_import.NIL != results) {
            actual_pos = bindings.variable_lookup((SubLObject)wordnet_import.$sym52$_POS, results.first());
            word_sense = bindings.variable_lookup((SubLObject)wordnet_import.$sym331$_WORD_SENSE, results.first());
        }
        if (wordnet_import.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && wordnet_import.NIL == word_sense) {
            Errors.error((SubLObject)wordnet_import.$str332$must_have_an_existing_word_sense_, word_unit, pos);
        }
        denotation_sentence = (SubLObject)ConsesLow.list(wordnet_import.$const231$denotation, word_unit, actual_pos, word_sense, v_term);
        wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 96624L)
    public static SubLObject wni_assert_lexical_annotations(final SubLObject denotation_sentence, final SubLObject synset_word, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.consp(denotation_sentence) : denotation_sentence;
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        final SubLObject politeness = wni_politeness(synset_word, workflow_alist);
        final SubLObject formality = wni_formality(synset_word, workflow_alist);
        final SubLObject rhetorical_device = wni_rhetorical_device(synset_word, workflow_alist);
        if (wordnet_import.NIL != politeness) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const333$politenessOfWS, denotation_sentence, politeness), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        if (wordnet_import.NIL != formality) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const334$formalityOfWS, denotation_sentence, formality), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        if (wordnet_import.NIL != rhetorical_device) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const335$rhetoricalDeviceOfPhrase, denotation_sentence, rhetorical_device), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 98086L)
    public static SubLObject wni_politeness(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        SubLObject politeness = (SubLObject)wordnet_import.NIL;
        final SubLObject politeness_value = list_utilities.alist_lookup(workflow_alist, Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str336$_politeness), (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED);
        if (wordnet_import.NIL != Strings.stringE(politeness_value, (SubLObject)wordnet_import.$str337$polite, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            politeness = wordnet_import.$const338$PoliteSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(politeness_value, (SubLObject)wordnet_import.$str339$rude, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            politeness = wordnet_import.$const340$RudeSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(politeness_value, (SubLObject)wordnet_import.$str341$vulgar, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            politeness = wordnet_import.$const342$VulgarSpeech;
        }
        if (wordnet_import.NIL != politeness && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(politeness)) {
            throw new AssertionError(politeness);
        }
        return politeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 98958L)
    public static SubLObject wni_formality(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        SubLObject formality = (SubLObject)wordnet_import.NIL;
        final SubLObject formality_value = list_utilities.alist_lookup(workflow_alist, Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str343$_formality), (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED);
        if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str344$archaic, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const345$ArchaicSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str346$slang, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const347$SlangSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str348$formal, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const349$FormalSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str350$informal, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const351$InformalSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str352$baby_talk, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const353$BabyTalk;
        }
        else if (wordnet_import.NIL != Strings.stringE(formality_value, (SubLObject)wordnet_import.$str354$technical_jargon, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            formality = wordnet_import.$const355$Jargon;
        }
        if (wordnet_import.NIL != formality && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(formality)) {
            throw new AssertionError(formality);
        }
        return formality;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 100062L)
    public static SubLObject wni_rhetorical_device(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        SubLObject rhetorical_device = (SubLObject)wordnet_import.NIL;
        final SubLObject rhetorical_device_value = list_utilities.alist_lookup(workflow_alist, Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str356$_rhetorical_device), (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED);
        if (wordnet_import.NIL != Strings.stringE(rhetorical_device_value, (SubLObject)wordnet_import.$str357$metaphor, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            rhetorical_device = wordnet_import.$const358$MetaphoricalSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(rhetorical_device_value, (SubLObject)wordnet_import.$str359$simile, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            rhetorical_device = wordnet_import.$const360$Simile_FigureOfSpeech;
        }
        else if (wordnet_import.NIL != Strings.stringE(rhetorical_device_value, (SubLObject)wordnet_import.$str361$euphemism, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            rhetorical_device = wordnet_import.$const362$EuphemisticSpeech;
        }
        if (wordnet_import.NIL != rhetorical_device && !wordnet_import.assertionsDisabledInClass && wordnet_import.NIL == forts.fort_p(rhetorical_device)) {
            throw new AssertionError(rhetorical_device);
        }
        return rhetorical_device;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 101083L)
    public static SubLObject wni_assert_lexicon_for_person(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        if (wordnet_import.NIL == isa.isaP(v_term, wordnet_import.$const287$Agent_Generic, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            wni_assert_isa_agent_generic(v_term, nowP);
        }
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        SubLObject last_name = (SubLObject)wordnet_import.NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_period)) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const363$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            return (SubLObject)wordnet_import.NIL;
        }
        last_name = synset_word;
        wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const364$familyName, v_term, last_name), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        if (wordnet_import.NIL == synset_words) {
            return (SubLObject)wordnet_import.NIL;
        }
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (wordnet_import.NIL != string_utilities.starts_with(synset_word, (SubLObject)wordnet_import.$str365$Mrs_) || wordnet_import.NIL != string_utilities.starts_with(synset_word, (SubLObject)wordnet_import.$str366$Sir_) || wordnet_import.NIL != string_utilities.ends_with(synset_word, (SubLObject)wordnet_import.$str367$_Jr_, (SubLObject)wordnet_import.UNPROVIDED) || wordnet_import.NIL != string_utilities.contains_charP(synset_word, (SubLObject)Characters.CHAR_period)) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const363$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            if (wordnet_import.NIL == synset_words) {
                return (SubLObject)wordnet_import.NIL;
            }
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
        }
        if (wordnet_import.NIL == string_utilities.starts_with(synset_word, (SubLObject)wordnet_import.$str365$Mrs_)) {
            if (wordnet_import.NIL != string_utilities.starts_with(synset_word, (SubLObject)wordnet_import.$str368$President_)) {
                synset_word = string_utilities.remove_substring(synset_word, (SubLObject)wordnet_import.$str368$President_);
            }
            if (wordnet_import.NIL != string_utilities.starts_with(synset_word, (SubLObject)wordnet_import.$str366$Sir_)) {
                synset_word = string_utilities.remove_substring(synset_word, (SubLObject)wordnet_import.$str366$Sir_);
            }
            if (wordnet_import.NIL != string_utilities.ends_with(synset_word, (SubLObject)wordnet_import.$str367$_Jr_, (SubLObject)wordnet_import.UNPROVIDED)) {
                synset_word = string_utilities.remove_substring(synset_word, (SubLObject)wordnet_import.$str367$_Jr_);
            }
            final SubLObject given_names = string_utilities.split_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED).first();
            if (wordnet_import.NIL == string_utilities.contains_charP(given_names, (SubLObject)Characters.CHAR_period)) {
                wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const369$givenNames, v_term, given_names), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            }
        }
        if (wordnet_import.NIL == synset_words) {
            synset_words = (SubLObject)ConsesLow.cons(synset_word, synset_words);
        }
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        SubLObject middle_names = string_utilities.split_string(last_synset_word, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject middle_names_string = (SubLObject)wordnet_import.NIL;
        if (wordnet_import.NIL != Strings.stringE(last_name, list_utilities.last_one(middle_names), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            middle_names = middle_names.rest();
            middle_names = list_utilities.remove_last(middle_names);
            if (wordnet_import.NIL != middle_names) {
                middle_names_string = string_utilities.join_strings(middle_names, (SubLObject)wordnet_import.$str152$_);
                wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const370$middleName, v_term, middle_names_string), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            }
        }
        else {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const371$pseudonym, v_term, last_synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 104437L)
    public static SubLObject wni_assert_lexicon_for_urban_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (wordnet_import.NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const372$placeName_Standard, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$16 = (SubLObject)wordnet_import.NIL;
        synset_word_$16 = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word_$16, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const363$nameString, v_term, synset_word_$16), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$16 = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 105419L)
    public static SubLObject wni_assert_lexicon_for_geographical_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = (SubLObject)wordnet_import.NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (wordnet_import.NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const373$placeName_ShortForm, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$17 = (SubLObject)wordnet_import.NIL;
        synset_word_$17 = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (wordnet_import.NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word_$17, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const363$nameString, v_term, synset_word_$17), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$17 = cdolist_list_var.first();
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 106446L)
    public static SubLObject wni_assert_name_string(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const363$nameString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 107003L)
    public static SubLObject wni_assert_acronym(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const374$acronymString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 107562L)
    public static SubLObject wni_assert_initialism(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == wordnet_import.UNPROVIDED) {
            nowP = (SubLObject)wordnet_import.T;
        }
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != forts.fort_p(v_term) : v_term;
        assert wordnet_import.NIL != Types.booleanp(nowP) : nowP;
        wni_assert_wff((SubLObject)ConsesLow.list(wordnet_import.$const375$initialismString, v_term, synset_word), wordnet_import.$const325$TemporaryLexicalAssertions_WordNe, (SubLObject)wordnet_import.$kw267$MONOTONIC, (SubLObject)wordnet_import.$kw268$FORWARD, nowP);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 108130L)
    public static SubLObject wni_heuristic_pos(final SubLObject synset, final SubLObject synset_word, final SubLObject workflow_alist) {
        assert wordnet_import.NIL != narts_high.naut_p(synset) : synset;
        assert wordnet_import.NIL != Types.stringp(synset_word) : synset_word;
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        final SubLObject pos = wni_synset_pos(synset);
        if (!pos.eql(wordnet_import.$const95$Noun)) {
            return pos;
        }
        if (Sequences.length(synset_word).numG((SubLObject)wordnet_import.FOUR_INTEGER) && wordnet_import.NIL != string_utilities.ends_with(synset_word, (SubLObject)wordnet_import.$str376$ing, (SubLObject)wordnet_import.UNPROVIDED)) {
            final SubLObject prefix = string_utilities.string_first_n(Numbers.subtract(Sequences.length(synset_word), (SubLObject)wordnet_import.THREE_INTEGER), synset_word);
            if (wordnet_import.NIL != genls.any_specP(wordnet_import.$const95$Noun, lexicon_accessors.pos_of_string(prefix, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                return wordnet_import.$const377$GerundiveNoun;
            }
        }
        final SubLObject key = Sequences.cconcatenate(synset_word, (SubLObject)wordnet_import.$str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, (SubLObject)wordnet_import.EQUAL, (SubLObject)wordnet_import.UNPROVIDED);
        final SubLObject count_nounP = (SubLObject)SubLObjectFactory.makeBoolean(wordnet_import.NIL != Strings.stringE(value, (SubLObject)wordnet_import.$str378$t, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED) || wordnet_import.NIL != Strings.stringE(value, (SubLObject)wordnet_import.$str327$headword_is_first, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        if (wordnet_import.NIL != lexification_utilities.initial_capitalizedP(synset_word) && wordnet_import.NIL == wni_synset_collectionP(synset)) {
            if (wordnet_import.NIL != count_nounP) {
                return wordnet_import.$const379$ProperCountNoun;
            }
            return wordnet_import.$const380$ProperMassNoun;
        }
        else {
            if (wordnet_import.NIL != count_nounP) {
                return wordnet_import.$const381$CountNoun;
            }
            return wordnet_import.$const382$MassNoun;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 109558L)
    public static SubLObject wni_number_of_workflow_mapped_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)wordnet_import.ZERO_INTEGER;
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt(wordnet_import.$const128$WordNet_Version2_0, wordnet_import.$const126$synonymousExternalConcept, wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.TWO_INTEGER, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject when_asserted = (SubLObject)wordnet_import.NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str384$Counting_recent_WordNet_mappings, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = (SubLObject)wordnet_import.NIL;
                gaf = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    when_asserted = assertions_high.asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG((SubLObject)wordnet_import.$int385$20050101)) {
                        count = Numbers.add(count, (SubLObject)wordnet_import.ONE_INTEGER);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
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
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 110125L)
    public static SubLObject wni_number_of_new_concepts_imported_from_wordnet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)wordnet_import.ZERO_INTEGER;
        final SubLObject terms = isa.quoted_instances(wordnet_import.$const387$WordNetWorkflowConstant_NotFullyR, wordnet_import.$const275$BookkeepingMt, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject creator = (SubLObject)wordnet_import.NIL;
        final SubLObject list_var = terms;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str388$Counting_terms_imported_from_Word, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject v_term = (SubLObject)wordnet_import.NIL;
                v_term = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    creator = bookkeeping_store.creator(v_term, (SubLObject)wordnet_import.UNPROVIDED);
                    if (creator.eql(wordnet_import.$const389$SteveReed) || wordnet_import.NIL != kb_mapping_utilities.pred_u_v_holds_in_mt(wordnet_import.$const290$reifiedUsingTool, v_term, wordnet_import.$const390$CycWordNetImportTool, wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                        count = Numbers.add(count, (SubLObject)wordnet_import.ONE_INTEGER);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
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
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 110656L)
    public static SubLObject wni_number_of_new_denotations_imported_from_wordet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)wordnet_import.ZERO_INTEGER;
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt(wordnet_import.$const128$WordNet_Version2_0, wordnet_import.$const126$synonymousExternalConcept, wordnet_import.$const185$WordNetMappingMt, (SubLObject)wordnet_import.TWO_INTEGER, (SubLObject)wordnet_import.UNPROVIDED);
        SubLObject when_asserted = (SubLObject)wordnet_import.NIL;
        SubLObject v_term = (SubLObject)wordnet_import.NIL;
        SubLObject denotation_gafs = (SubLObject)wordnet_import.NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)wordnet_import.$str392$Counting_recent_denotations_impor, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)wordnet_import.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)wordnet_import.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)wordnet_import.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = (SubLObject)wordnet_import.NIL;
                gaf = csome_list_var.first();
                while (wordnet_import.NIL != csome_list_var) {
                    when_asserted = assertions_high.asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG((SubLObject)wordnet_import.$int385$20050101)) {
                        v_term = assertions_high.gaf_arg1(gaf);
                        final SubLObject _prev_bind_0_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)wordnet_import.$sym253$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(wordnet_import.$const177$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, wordnet_import.$const231$denotation, (SubLObject)wordnet_import.FOUR_INTEGER, (SubLObject)wordnet_import.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$21, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$20, thread);
                        }
                        SubLObject cdolist_list_var = denotation_gafs;
                        SubLObject denotation_gaf = (SubLObject)wordnet_import.NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (wordnet_import.NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$22 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$22.isNumber() && when_asserted_$22.numG((SubLObject)wordnet_import.$int385$20050101)) {
                                count = Numbers.add(count, (SubLObject)wordnet_import.ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        }
                        final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)wordnet_import.$sym253$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(wordnet_import.$const177$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, wordnet_import.$const329$compoundString, (SubLObject)wordnet_import.FOUR_INTEGER, (SubLObject)wordnet_import.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$22, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = (SubLObject)wordnet_import.NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (wordnet_import.NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$23 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$23.isNumber() && when_asserted_$23.numG((SubLObject)wordnet_import.$int385$20050101)) {
                                count = Numbers.add(count, (SubLObject)wordnet_import.ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        }
                        final SubLObject _prev_bind_0_$22 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)wordnet_import.$sym253$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(wordnet_import.$const177$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, wordnet_import.$const328$multiWordString, (SubLObject)wordnet_import.FOUR_INTEGER, (SubLObject)wordnet_import.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$23, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$22, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = (SubLObject)wordnet_import.NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (wordnet_import.NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$24 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$24.isNumber() && when_asserted_$24.numG((SubLObject)wordnet_import.$int385$20050101)) {
                                count = Numbers.add(count, (SubLObject)wordnet_import.ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)wordnet_import.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wordnet_import.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
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
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_role_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        wni_print_role_info(v_object, stream, (SubLObject)wordnet_import.ZERO_INTEGER);
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_role_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $wni_role_info_native.class) ? wordnet_import.T : wordnet_import.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_role(final SubLObject v_object) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_filler(final SubLObject v_object) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_defining_col(final SubLObject v_object) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_defining_pred(final SubLObject v_object) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject wni_subsumption_status(final SubLObject v_object) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject _csetf_wni_role(final SubLObject v_object, final SubLObject value) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject _csetf_wni_filler(final SubLObject v_object, final SubLObject value) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject _csetf_wni_defining_col(final SubLObject v_object, final SubLObject value) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject _csetf_wni_defining_pred(final SubLObject v_object, final SubLObject value) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject _csetf_wni_subsumption_status(final SubLObject v_object, final SubLObject value) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject make_wni_role_info(SubLObject arglist) {
        if (arglist == wordnet_import.UNPROVIDED) {
            arglist = (SubLObject)wordnet_import.NIL;
        }
        final SubLObject v_new = (SubLObject)new $wni_role_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)wordnet_import.NIL, next = arglist; wordnet_import.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)wordnet_import.$kw412$ROLE)) {
                _csetf_wni_role(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)wordnet_import.$kw413$FILLER)) {
                _csetf_wni_filler(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)wordnet_import.$kw414$DEFINING_COL)) {
                _csetf_wni_defining_col(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)wordnet_import.$kw415$DEFINING_PRED)) {
                _csetf_wni_defining_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)wordnet_import.$kw416$SUBSUMPTION_STATUS)) {
                _csetf_wni_subsumption_status(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)wordnet_import.$str417$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject visit_defstruct_wni_role_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw418$BEGIN, (SubLObject)wordnet_import.$sym419$MAKE_WNI_ROLE_INFO, (SubLObject)wordnet_import.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw420$SLOT, (SubLObject)wordnet_import.$kw412$ROLE, wni_role(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw420$SLOT, (SubLObject)wordnet_import.$kw413$FILLER, wni_filler(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw420$SLOT, (SubLObject)wordnet_import.$kw414$DEFINING_COL, wni_defining_col(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw420$SLOT, (SubLObject)wordnet_import.$kw415$DEFINING_PRED, wni_defining_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw420$SLOT, (SubLObject)wordnet_import.$kw416$SUBSUMPTION_STATUS, wni_subsumption_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wordnet_import.$kw421$END, (SubLObject)wordnet_import.$sym419$MAKE_WNI_ROLE_INFO, (SubLObject)wordnet_import.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112074L)
    public static SubLObject visit_defstruct_object_wni_role_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_wni_role_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 112636L)
    public static SubLObject wni_print_role_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert wordnet_import.NIL != wni_role_info_p(v_object) : v_object;
        assert wordnet_import.NIL != Types.streamp(stream) : stream;
        PrintLow.format(stream, (SubLObject)wordnet_import.$str424$_ROLE_INFO___s__s__s__s__s_, new SubLObject[] { wni_role(v_object), wni_filler(v_object), wni_defining_col(v_object), wni_defining_pred(v_object), wni_subsumption_status(v_object) });
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 113109L)
    public static SubLObject wni_gather_roles_and_traits(final SubLObject event_col) {
        assert wordnet_import.NIL != forts.fort_p(event_col) : event_col;
        SubLObject role_infos = Sort.sort(wni_gather_roles(event_col), Symbols.symbol_function((SubLObject)wordnet_import.$sym426$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)wordnet_import.$sym406$WNI_DEFINING_COL));
        SubLObject role_info = (SubLObject)wordnet_import.NIL;
        SubLObject doneP = (SubLObject)wordnet_import.NIL;
        SubLObject j = (SubLObject)wordnet_import.NIL;
        SubLObject genl_predsP = (SubLObject)wordnet_import.NIL;
        role_infos = ConsesLow.append(role_infos, Sort.sort(wni_gather_traits(event_col), Symbols.symbol_function((SubLObject)wordnet_import.$sym426$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)wordnet_import.$sym406$WNI_DEFINING_COL)));
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(role_infos), i = (SubLObject)wordnet_import.NIL, i = (SubLObject)wordnet_import.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)wordnet_import.ONE_INTEGER)) {
            role_info = Sequences.elt(role_infos, i);
            j = (SubLObject)wordnet_import.ZERO_INTEGER;
            genl_predsP = (SubLObject)wordnet_import.NIL;
            doneP = (SubLObject)wordnet_import.NIL;
            while (wordnet_import.NIL == doneP) {
                if (j.numGE(i)) {
                    doneP = (SubLObject)wordnet_import.T;
                }
                else {
                    genl_predsP = wni_genl_preds_helper(Sequences.elt(role_infos, j), role_info);
                    if (wordnet_import.NIL != genl_predsP) {
                        doneP = (SubLObject)wordnet_import.T;
                    }
                    else {
                        j = Numbers.add(j, (SubLObject)wordnet_import.ONE_INTEGER);
                    }
                }
            }
            _csetf_wni_subsumption_status(role_info, genl_predsP);
        }
        final SubLObject list_var = role_infos;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != wni_role_info_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return role_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 114624L)
    public static SubLObject wni_find_compatible_roles(final SubLObject selected_role_info, final SubLObject role_infos) {
        assert wordnet_import.NIL != wni_role_info_p(selected_role_info) : selected_role_info;
        assert wordnet_import.NIL != Types.listp(role_infos) : role_infos;
        SubLObject compatible_role_infos = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var = role_infos;
        SubLObject role_info = (SubLObject)wordnet_import.NIL;
        role_info = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            if (!role_info.equal(selected_role_info) && wordnet_import.NIL != genls.max_floor_cols((SubLObject)ConsesLow.list(wni_filler(selected_role_info), wni_filler(role_info)), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                compatible_role_infos = (SubLObject)ConsesLow.cons(role_info, compatible_role_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            role_info = cdolist_list_var.first();
        }
        final SubLObject list_var;
        compatible_role_infos = (list_var = Sequences.nreverse(compatible_role_infos));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            assert wordnet_import.NIL != wni_role_info_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return compatible_role_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 115484L)
    public static SubLObject wni_genl_preds_helper(final SubLObject compare_role_info, final SubLObject role_info) {
        assert wordnet_import.NIL != wni_role_info_p(compare_role_info) : compare_role_info;
        assert wordnet_import.NIL != wni_role_info_p(role_info) : role_info;
        final SubLObject compare_role = wni_role(compare_role_info);
        final SubLObject role = wni_role(role_info);
        if (compare_role.eql(role)) {
            return (SubLObject)wordnet_import.T;
        }
        if (wordnet_import.NIL != genl_predicates.genl_predicateP(compare_role, role, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
            return compare_role;
        }
        final SubLObject sentence = (SubLObject)ConsesLow.list(wordnet_import.$const428$genlPredsWRTTypes, compare_role, role, wni_defining_col(compare_role_info), wni_filler(role_info));
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        if (results.equal((SubLObject)wordnet_import.$list239)) {
            return compare_role;
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 116734L)
    public static SubLObject wni_gather_roles(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != forts.fort_p(event_col) : event_col;
        final SubLObject template = (SubLObject)wordnet_import.$list429;
        SubLObject sentence = (SubLObject)wordnet_import.NIL;
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject v_bindings = (SubLObject)wordnet_import.NIL;
        SubLObject fillers = (SubLObject)wordnet_import.NIL;
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list431, (SubLObject)wordnet_import.$list432, (SubLObject)wordnet_import.$list433, (SubLObject)ConsesLow.list(wordnet_import.$const434$or, (SubLObject)ConsesLow.list(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list437), (SubLObject)ConsesLow.list(wordnet_import.$const233$unknownSentence, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym438$_FILLER_2, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list439), (SubLObject)wordnet_import.$list440)))), (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const233$unknownSentence, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym438$_FILLER_2, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list439))), (SubLObject)wordnet_import.$list441)));
        thread.resetMultipleValues();
        SubLObject values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym442$_COLL, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list443));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym444$_THING, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list445));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym446$_ROLE2, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const447$assertedSentence, (SubLObject)ConsesLow.listS(wordnet_import.$const428$genlPredsWRTTypes, (SubLObject)wordnet_import.$sym436$_ROLE, (SubLObject)wordnet_import.$sym446$_ROLE2, event_col, (SubLObject)wordnet_import.$list437)), (SubLObject)ConsesLow.list(wordnet_import.$const448$equals, (SubLObject)wordnet_import.$sym449$_DEFINING_COLL, event_col), (SubLObject)wordnet_import.$list450));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym446$_ROLE2, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const447$assertedSentence, (SubLObject)ConsesLow.listS(wordnet_import.$const428$genlPredsWRTTypes, (SubLObject)wordnet_import.$sym446$_ROLE2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list437)), (SubLObject)ConsesLow.list(wordnet_import.$const448$equals, (SubLObject)wordnet_import.$sym449$_DEFINING_COLL, event_col), (SubLObject)wordnet_import.$list450));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = (list_var = wni_most_specific_fillers(wni_bindings_to_role_infos(v_bindings)));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return fillers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 120795L)
    public static SubLObject wni_gather_traits(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert wordnet_import.NIL != forts.fort_p(event_col) : event_col;
        final SubLObject template = (SubLObject)wordnet_import.$list429;
        SubLObject sentence = (SubLObject)wordnet_import.NIL;
        final SubLObject query_properties = (SubLObject)wordnet_import.$list9;
        SubLObject v_bindings = (SubLObject)wordnet_import.NIL;
        SubLObject fillers = (SubLObject)wordnet_import.NIL;
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list451, (SubLObject)wordnet_import.$list432, (SubLObject)wordnet_import.$list433, (SubLObject)ConsesLow.list(wordnet_import.$const434$or, (SubLObject)ConsesLow.list(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list437), (SubLObject)ConsesLow.list(wordnet_import.$const233$unknownSentence, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym438$_FILLER_2, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list439), (SubLObject)wordnet_import.$list440)))), (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.list(wordnet_import.$const233$unknownSentence, (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym438$_FILLER_2, (SubLObject)ConsesLow.listS(wordnet_import.$const435$interArgIsa1_2, (SubLObject)wordnet_import.$sym436$_ROLE, event_col, (SubLObject)wordnet_import.$list439))), (SubLObject)wordnet_import.$list441)));
        thread.resetMultipleValues();
        SubLObject values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym442$_COLL, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list452));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        sentence = (SubLObject)ConsesLow.list(wordnet_import.$const51$thereExists, (SubLObject)wordnet_import.$sym444$_THING, (SubLObject)ConsesLow.listS(wordnet_import.$const222$and, (SubLObject)ConsesLow.listS(wordnet_import.$const280$genls, event_col, (SubLObject)wordnet_import.$list430), (SubLObject)wordnet_import.$list453));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, wordnet_import.$const177$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ConsesLow.nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = (list_var = wni_most_specific_fillers(wni_bindings_to_role_infos(v_bindings)));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return fillers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 124168L)
    public static SubLObject wni_bindings_to_role_infos(final SubLObject v_bindings) {
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(v_bindings) : v_bindings;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject wni_role_info = (SubLObject)wordnet_import.NIL;
        SubLObject wni_role_infos = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var2 = v_bindings;
        SubLObject binding = (SubLObject)wordnet_import.NIL;
        binding = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            wni_role_info = make_wni_role_info((SubLObject)wordnet_import.UNPROVIDED);
            _csetf_wni_role(wni_role_info, binding.first());
            _csetf_wni_filler(wni_role_info, conses_high.second(binding));
            _csetf_wni_defining_col(wni_role_info, conses_high.third(binding));
            _csetf_wni_defining_pred(wni_role_info, conses_high.fourth(binding));
            wni_role_infos = (SubLObject)ConsesLow.cons(wni_role_info, wni_role_infos);
            cdolist_list_var2 = cdolist_list_var2.rest();
            binding = cdolist_list_var2.first();
        }
        final SubLObject list_var = wni_role_infos;
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = (SubLObject)wordnet_import.NIL;
        elem2 = cdolist_list_var3.first();
        while (wordnet_import.NIL != cdolist_list_var3) {
            assert wordnet_import.NIL != wni_role_info_p(elem2) : elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        }
        return wni_role_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 124837L)
    public static SubLObject wni_sort_key_1(final SubLObject wni_role_info) {
        assert wordnet_import.NIL != wni_role_info_p(wni_role_info) : wni_role_info;
        final SubLObject key = Sequences.cconcatenate(PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str454$_A, wni_defining_col(wni_role_info)), new SubLObject[] { wordnet_import.$str152$_, PrintLow.format((SubLObject)wordnet_import.NIL, (SubLObject)wordnet_import.$str454$_A, wni_role(wni_role_info)) });
        assert wordnet_import.NIL != Types.stringp(key) : key;
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 125227L)
    public static SubLObject wni_most_specific_fillers(final SubLObject wni_role_infos) {
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(wni_role_infos) : wni_role_infos;
        SubLObject cdolist_list_var = wni_role_infos;
        SubLObject elem = (SubLObject)wordnet_import.NIL;
        elem = cdolist_list_var.first();
        while (wordnet_import.NIL != cdolist_list_var) {
            assert wordnet_import.NIL != wni_role_info_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject sorted_role_infos = (SubLObject)wordnet_import.NIL;
        SubLObject result_role_infos = (SubLObject)wordnet_import.NIL;
        SubLObject best_role_info = (SubLObject)wordnet_import.NIL;
        SubLObject cdolist_list_var2;
        sorted_role_infos = (cdolist_list_var2 = Sort.sort(wni_role_infos, Symbols.symbol_function((SubLObject)wordnet_import.$sym455$STRING_LESSP), Symbols.symbol_function((SubLObject)wordnet_import.$sym456$WNI_SORT_KEY_1)));
        SubLObject role_info = (SubLObject)wordnet_import.NIL;
        role_info = cdolist_list_var2.first();
        while (wordnet_import.NIL != cdolist_list_var2) {
            if (wordnet_import.NIL != best_role_info) {
                if (!wni_role(role_info).eql(wni_role(best_role_info)) || (wni_role(role_info).eql(wni_role(best_role_info)) && !wni_defining_col(role_info).eql(wni_defining_col(best_role_info)))) {
                    result_role_infos = (SubLObject)ConsesLow.cons(best_role_info, result_role_infos);
                    best_role_info = role_info;
                }
                else if (wordnet_import.NIL != genls.genlsP(wni_filler(role_info), wni_filler(best_role_info), (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED)) {
                    best_role_info = role_info;
                }
            }
            else {
                best_role_info = role_info;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            role_info = cdolist_list_var2.first();
        }
        result_role_infos = (SubLObject)ConsesLow.cons(best_role_info, result_role_infos);
        final SubLObject list_var;
        result_role_infos = (list_var = Sequences.nreverse(result_role_infos));
        assert wordnet_import.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = (SubLObject)wordnet_import.NIL;
        elem2 = cdolist_list_var3.first();
        while (wordnet_import.NIL != cdolist_list_var3) {
            assert wordnet_import.NIL != wni_role_info_p(elem2) : elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        }
        return result_role_infos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 126443L)
    public static SubLObject wni_clear_function_caches() {
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
        if (wordnet_import.NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        return (SubLObject)wordnet_import.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 127387L)
    public static SubLObject wni_create_workflow_alist_with_unmapped_hypernym_chain(final SubLObject unmapped_hypernym_chain, final SubLObject in_workflowP) {
        assert wordnet_import.NIL != Types.listp(unmapped_hypernym_chain) : unmapped_hypernym_chain;
        assert wordnet_import.NIL != Types.booleanp(in_workflowP) : in_workflowP;
        SubLObject workflow_alist = (SubLObject)wordnet_import.NIL;
        workflow_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wordnet_import.$str458$in_workflow_, (SubLObject)((wordnet_import.NIL != in_workflowP) ? wordnet_import.$str378$t : wordnet_import.$str459$nil)), workflow_alist);
        workflow_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)wordnet_import.$str460$unmapped_hypernym_chain, unmapped_hypernym_chain), workflow_alist);
        assert wordnet_import.NIL != Types.consp(workflow_alist) : workflow_alist;
        assert wordnet_import.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        return workflow_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128452L)
    public static SubLObject wni_access_path_server() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_server(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128723L)
    public static SubLObject wni_access_path_port() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_port(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 128988L)
    public static SubLObject wni_access_path_proxy_server() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_server(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129277L)
    public static SubLObject wni_access_path_proxy_port() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_port(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129560L)
    public static SubLObject wni_access_path_timeout() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_timeout(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 129834L)
    public static SubLObject wni_access_path_db() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_db(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130106L)
    public static SubLObject wni_access_path_user() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_user(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130371L)
    public static SubLObject wni_access_path_password() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_password(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-import.lisp", position = 130648L)
    public static SubLObject wni_access_path_subprotocol() {
        if (wordnet_import.NIL == wordnet_import.$wordnet_import_access_path$.getGlobalValue()) {
            wordnet_import.$wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path(wordnet_import.$const26$WordNet2_0_KS, (SubLObject)wordnet_import.UNPROVIDED, (SubLObject)wordnet_import.UNPROVIDED));
        }
        return sksi_access_path.access_path_subprotocol(wordnet_import.$wordnet_import_access_path$.getGlobalValue());
    }
    
    public static SubLObject declare_wordnet_import_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "initialize_wordnet_import_kb_feature", "INITIALIZE-WORDNET-IMPORT-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_unranked_synsets_for_english_word_string", "CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_unranked_synsets_for_english_word_string", "REMOVE-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unranked_synsets_for_english_word_string_internal", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unranked_synsets_for_english_word_string", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synsets_for_english_word_stringXpos", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synsets_for_english_word_stringXpos", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_for_english_word_stringXpos_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_for_english_word_stringXpos", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synsets_for_english_word_string", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synsets_for_english_word_string", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_for_english_word_string_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_for_english_word_string", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_collectionP", "CLEAR-WNI-SYNSET-COLLECTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_collectionP", "REMOVE-WNI-SYNSET-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_collectionP_internal", "WNI-SYNSET-COLLECTION?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_collectionP", "WNI-SYNSET-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_individuals", "WNI-SYNSET-INDIVIDUALS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_exclude_situations", "WNI-EXCLUDE-SITUATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_exclude_relations", "WNI-EXCLUDE-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_exclude_skipped", "WNI-EXCLUDE-SKIPPED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_id", "WNI-SYNSET-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_words", "WNI-SYNSET-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_equal", "WNI-SYNSETS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_words_helper", "CLEAR-WNI-SYNSET-WORDS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_words_helper", "REMOVE-WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_words_helper_internal", "WNI-SYNSET-WORDS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_words_helper", "WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_example_phrases", "WNI-SYNSET-EXAMPLE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_example_phrases_helper", "CLEAR-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_example_phrases_helper", "REMOVE-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_example_phrases_helper_internal", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_example_phrases_helper", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_most_general_synset_verb_frame", "WNI-MOST-GENERAL-SYNSET-VERB-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_verb_frames", "WNI-SYNSET-VERB-FRAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_verb_frames_helper", "CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_verb_frames_helper", "REMOVE-WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_verb_frames_helper_internal", "WNI-SYNSET-VERB-FRAMES-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_verb_frames_helper", "WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_verb_frames_for_word", "CLEAR-WNI-VERB-FRAMES-FOR-WORD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_verb_frames_for_word", "REMOVE-WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_verb_frames_for_word_internal", "WNI-VERB-FRAMES-FOR-WORD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_verb_frames_for_word", "WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hypernyms", "WNI-HYPERNYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_hypernyms_helper", "CLEAR-WNI-HYPERNYMS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_hypernyms_helper", "REMOVE-WNI-HYPERNYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hypernyms_helper_internal", "WNI-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hypernyms_helper", "WNI-HYPERNYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hypernyms", "WNI-ALL-HYPERNYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_all_hypernyms_helper", "CLEAR-WNI-ALL-HYPERNYMS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_all_hypernyms_helper", "REMOVE-WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hypernyms_helper_internal", "WNI-ALL-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hypernyms_helper", "WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hypernymP", "WNI-ALL-HYPERNYM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hyponyms", "WNI-HYPONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_hyponyms_helper", "CLEAR-WNI-HYPONYMS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_hyponyms_helper", "REMOVE-WNI-HYPONYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hyponyms_helper_internal", "WNI-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hyponyms_helper", "WNI-HYPONYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hyponyms", "WNI-ALL-HYPONYMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_all_hyponyms_helper", "CLEAR-WNI-ALL-HYPONYMS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_all_hyponyms_helper", "REMOVE-WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hyponyms_helper_internal", "WNI-ALL-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_all_hyponyms_helper", "WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_any_hyponym_an_individual", "WNI-ANY-HYPONYM-AN-INDIVIDUAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_verb_is_derived_from_situation_nounP", "WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_derived_forms", "WNI-DERIVED-FORMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_derived_forms_helper", "CLEAR-WNI-DERIVED-FORMS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_derived_forms_helper", "REMOVE-WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_derived_forms_helper_internal", "WNI-DERIVED-FORMS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_derived_forms_helper", "WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_gloss", "WNI-SYNSET-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_gloss_helper", "CLEAR-WNI-SYNSET-GLOSS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_gloss_helper", "REMOVE-WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_gloss_helper_internal", "WNI-SYNSET-GLOSS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_gloss_helper", "WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_pos", "WNI-SYNSET-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_pos_helper", "CLEAR-WNI-SYNSET-POS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_pos_helper", "REMOVE-WNI-SYNSET-POS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_pos_helper_internal", "WNI-SYNSET-POS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_pos_helper", "WNI-SYNSET-POS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_speech_part_offset", "WNI-SYNSET-SPEECH-PART-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_speech_part_offset_helper", "CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_speech_part_offset_helper", "REMOVE-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_speech_part_offset_helper_internal", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_speech_part_offset_helper", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hypernym_terms", "WNI-HYPERNYM-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_hypernym_mappedP", "WNI-HYPERNYM-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_term", "WNI-SYNSET-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_term_helper", "CLEAR-WNI-SYNSET-TERM-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_term_helper", "REMOVE-WNI-SYNSET-TERM-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_term_helper_internal", "WNI-SYNSET-TERM-HELPER-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_term_helper", "WNI-SYNSET-TERM-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unmapped_hypernym_chain", "WNI-UNMAPPED-HYPERNYM-CHAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_wXo_links", "WNI-SYNSET-W/O-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synset_wXo_links_helper", "CLEAR-WNI-SYNSET-W/O-LINKS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synset_wXo_links_helper", "REMOVE-WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_wXo_links_helper_internal", "WNI-SYNSET-W/O-LINKS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_wXo_links_helper", "WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_is_causerP", "WNI-SYNSET-IS-CAUSER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_caused_by", "WNI-SYNSETS-CAUSED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synsets_caused_by_helper", "CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synsets_caused_by_helper", "REMOVE-WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_caused_by_helper_internal", "WNI-SYNSETS-CAUSED-BY-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_caused_by_helper", "WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_is_caused_byP", "WNI-SYNSET-IS-CAUSED-BY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_causing", "WNI-SYNSETS-CAUSING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_synsets_causing_helper", "CLEAR-WNI-SYNSETS-CAUSING-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_synsets_causing_helper", "REMOVE-WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_causing_helper_internal", "WNI-SYNSETS-CAUSING-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_causing_helper", "WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_urban_area_geographical_entity", "WNI-URBAN-AREA-GEOGRAPHICAL-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synsets_having_pos", "WNI-SYNSETS-HAVING-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_terms_synsets", "WNI-TERMS-SYNSETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_broader_terms", "CLEAR-WNI-BROADER-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_broader_terms", "REMOVE-WNI-BROADER-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_broader_terms_internal", "WNI-BROADER-TERMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_broader_terms", "WNI-BROADER-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_mapped_terms_and_synsets", "WNI-MAPPED-TERMS-AND-SYNSETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_hypernyms_mappedP", "WNI-SYNSET-HYPERNYMS-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_mapped_terms", "WNI-MAPPED-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_mapped_terms_and_pos_offsets", "WNI-MAPPED-TERMS-AND-POS-OFFSETS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_speech_part_offset_to_synset", "WNI-SPEECH-PART-OFFSET-TO-SYNSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_update_synset_with_term", "WNI-UPDATE-SYNSET-WITH-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_insert_concept_match_html", "WNI-INSERT-CONCEPT-MATCH-HTML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_select_concept_match_html", "WNI-SELECT-CONCEPT-MATCH-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_delete_concept_match_html", "WNI-DELETE-CONCEPT-MATCH-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_delete_all_concept_match_html", "WNI-DELETE-ALL-CONCEPT-MATCH-HTML", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unmapped_synsets_having_mapped_hypernym", "WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_trace_new_cyc_query", "WNI-TRACE-NEW-CYC-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_problem_store", "WNI-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "new_wni_problem_store", "NEW-WNI-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_problem_store_properties", "WNI-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unreified_synset", "WNI-UNREIFIED-SYNSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_reifiable_synset", "WNI-REIFIABLE-SYNSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_reifiable_synset_from_string", "WNI-REIFIABLE-SYNSET-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_from_id_string", "WNI-SYNSET-FROM-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_ensure_naut", "WNI-ENSURE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_next_synset_with_status", "WNI-NEXT-SYNSET-WITH-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unlocked_synsets_with_status", "WNI-UNLOCKED-SYNSETS-WITH-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_term_has_verb_semtransP", "WNI-TERM-HAS-VERB-SEMTRANS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "clear_wni_term_has_verb_semtrans_helperP", "CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "remove_wni_term_has_verb_semtrans_helperP", "REMOVE-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_term_has_verb_semtrans_helperP_internal", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_term_has_verb_semtrans_helperP", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_gather_terms_for_matching", "WNI-GATHER-TERMS-FOR-MATCHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_exact_synset_term_matches", "WNI-EXACT-SYNSET-TERM-MATCHES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_strong_synset_term_matches", "WNI-STRONG-SYNSET-TERM-MATCHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_weak_synset_term_matches", "WNI-WEAK-SYNSET-TERM-MATCHES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_create_now", "WNI-CREATE-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_wff", "WNI-ASSERT-WFF", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unassert_import_statuses", "WNI-UNASSERT-IMPORT-STATUSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unassert_import_status", "WNI-UNASSERT-IMPORT-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_import_statuses", "WNI-ASSERT-IMPORT-STATUSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_import_status", "WNI-ASSERT-IMPORT-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_synset_mapping", "WNI-ASSERT-SYNSET-MAPPING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_likely_synset_mapping", "WNI-ASSERT-LIKELY-SYNSET-MAPPING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_quoted_isa_workflow_constant", "WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_isa_collection", "WNI-ASSERT-ISA-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_genls", "WNI-ASSERT-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unassert_genls", "WNI-UNASSERT-GENLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_isa", "WNI-ASSERT-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_isa_individual", "WNI-ASSERT-ISA-INDIVIDUAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_isa_agent_generic", "WNI-ASSERT-ISA-AGENT-GENERIC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_reified_using", "WNI-ASSERT-REIFIED-USING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_synset_note", "WNI-SYNSET-NOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_synset_note", "WNI-ASSERT-SYNSET-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unassert_synset_note", "WNI-UNASSERT-SYNSET-NOTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_comment", "WNI-ASSERT-COMMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_term_of_unit", "WNI-ASSERT-TERM-OF-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_lock_synset", "WNI-LOCK-SYNSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_unlock_synset", "WNI-UNLOCK-SYNSET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon", "WNI-ASSERT-HEURISTIC-LEXICON", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon_for_collection", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon_for_collection_common", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION-COMMON", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon_for_individual", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-INDIVIDUAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon_for_organism", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-ORGANISM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_heuristic_lexicon_for_chemical", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-CHEMICAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_hyphen_string", "WNI-ASSERT-LEXICON-FOR-HYPHEN-STRING", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_phrase", "WNI-ASSERT-LEXICON-FOR-PHRASE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_multi_word_string", "WNI-ASSERT-LEXICON-FOR-MULTI-WORD-STRING", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_compound_string", "WNI-ASSERT-LEXICON-FOR-COMPOUND-STRING", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_denotation", "WNI-ASSERT-LEXICON-FOR-DENOTATION", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_existing_denotation", "WNI-ASSERT-LEXICON-FOR-EXISTING-DENOTATION", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexical_annotations", "WNI-ASSERT-LEXICAL-ANNOTATIONS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_politeness", "WNI-POLITENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_formality", "WNI-FORMALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_rhetorical_device", "WNI-RHETORICAL-DEVICE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_person", "WNI-ASSERT-LEXICON-FOR-PERSON", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_urban_area", "WNI-ASSERT-LEXICON-FOR-URBAN-AREA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_lexicon_for_geographical_area", "WNI-ASSERT-LEXICON-FOR-GEOGRAPHICAL-AREA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_name_string", "WNI-ASSERT-NAME-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_acronym", "WNI-ASSERT-ACRONYM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_assert_initialism", "WNI-ASSERT-INITIALISM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_heuristic_pos", "WNI-HEURISTIC-POS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_number_of_workflow_mapped_terms", "WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_number_of_new_concepts_imported_from_wordnet", "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_number_of_new_denotations_imported_from_wordet", "WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_role_info_print_function_trampoline", "WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_role_info_p", "WNI-ROLE-INFO-P", 1, 0, false);
        new $wni_role_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_role", "WNI-ROLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_filler", "WNI-FILLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_defining_col", "WNI-DEFINING-COL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_defining_pred", "WNI-DEFINING-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_subsumption_status", "WNI-SUBSUMPTION-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "_csetf_wni_role", "_CSETF-WNI-ROLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "_csetf_wni_filler", "_CSETF-WNI-FILLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "_csetf_wni_defining_col", "_CSETF-WNI-DEFINING-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "_csetf_wni_defining_pred", "_CSETF-WNI-DEFINING-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "_csetf_wni_subsumption_status", "_CSETF-WNI-SUBSUMPTION-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "make_wni_role_info", "MAKE-WNI-ROLE-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "visit_defstruct_wni_role_info", "VISIT-DEFSTRUCT-WNI-ROLE-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "visit_defstruct_object_wni_role_info_method", "VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_print_role_info", "WNI-PRINT-ROLE-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_gather_roles_and_traits", "WNI-GATHER-ROLES-AND-TRAITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_find_compatible_roles", "WNI-FIND-COMPATIBLE-ROLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_genl_preds_helper", "WNI-GENL-PREDS-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_gather_roles", "WNI-GATHER-ROLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_gather_traits", "WNI-GATHER-TRAITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_bindings_to_role_infos", "WNI-BINDINGS-TO-ROLE-INFOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_sort_key_1", "WNI-SORT-KEY-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_most_specific_fillers", "WNI-MOST-SPECIFIC-FILLERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_clear_function_caches", "WNI-CLEAR-FUNCTION-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_create_workflow_alist_with_unmapped_hypernym_chain", "WNI-CREATE-WORKFLOW-ALIST-WITH-UNMAPPED-HYPERNYM-CHAIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_server", "WNI-ACCESS-PATH-SERVER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_port", "WNI-ACCESS-PATH-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_proxy_server", "WNI-ACCESS-PATH-PROXY-SERVER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_proxy_port", "WNI-ACCESS-PATH-PROXY-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_timeout", "WNI-ACCESS-PATH-TIMEOUT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_db", "WNI-ACCESS-PATH-DB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_user", "WNI-ACCESS-PATH-USER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_password", "WNI-ACCESS-PATH-PASSWORD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.wordnet_import", "wni_access_path_subprotocol", "WNI-ACCESS-PATH-SUBPROTOCOL", 0, 0, false);
        return (SubLObject)wordnet_import.NIL;
    }
    
    public static SubLObject init_wordnet_import_file() {
        wordnet_import.$wordnet_import_core_constants$ = SubLFiles.deflexical("*WORDNET-IMPORT-CORE-CONSTANTS*", (SubLObject)wordnet_import.$list0);
        wordnet_import.$wni_pos_map$ = SubLFiles.defconstant("*WNI-POS-MAP*", (SubLObject)wordnet_import.$list2);
        wordnet_import.$wni_1_char_pos_map$ = SubLFiles.defconstant("*WNI-1-CHAR-POS-MAP*", (SubLObject)wordnet_import.$list3);
        wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$ = SubLFiles.deflexical("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$ = SubLFiles.deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synsets_for_english_word_string_caching_state$ = SubLFiles.deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_collectionP_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-COLLECTION?-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_words_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_example_phrases_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_verb_frame_generalities$ = SubLFiles.defconstant("*WNI-VERB-FRAME-GENERALITIES*", (SubLObject)wordnet_import.$list65);
        wordnet_import.$wni_least_general_frame_generality_score$ = SubLFiles.defconstant("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", (SubLObject)wordnet_import.SIX_INTEGER);
        wordnet_import.$wni_synset_verb_frames_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_verb_frames_for_word_caching_state$ = SubLFiles.deflexical("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_hypernyms_helper_caching_state$ = SubLFiles.deflexical("*WNI-HYPERNYMS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_all_hypernyms_helper_caching_state$ = SubLFiles.deflexical("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_hyponyms_helper_caching_state$ = SubLFiles.deflexical("*WNI-HYPONYMS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_all_hyponyms_helper_caching_state$ = SubLFiles.deflexical("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_derived_forms_helper_caching_state$ = SubLFiles.deflexical("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_gloss_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_pos_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-POS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_term_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synset_wXo_links_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synsets_caused_by_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_synsets_causing_helper_caching_state$ = SubLFiles.deflexical("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_broader_terms_caching_state$ = SubLFiles.deflexical("*WNI-BROADER-TERMS-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_problem_store$ = SubLFiles.defparameter("*WNI-PROBLEM-STORE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$ = SubLFiles.deflexical("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$ = SubLFiles.defconstant("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", (SubLObject)wordnet_import.TWENTY_INTEGER);
        wordnet_import.$wni_very_verbose_exact_synset_term_matches$ = SubLFiles.defparameter("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$wni_verbose_exact_synset_term_matches$ = SubLFiles.defparameter("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", (SubLObject)wordnet_import.NIL);
        wordnet_import.$person_synset$ = SubLFiles.defconstant("*PERSON-SYNSET*", (SubLObject)wordnet_import.$list309);
        wordnet_import.$organism_being_synset$ = SubLFiles.defconstant("*ORGANISM-BEING-SYNSET*", (SubLObject)wordnet_import.$list310);
        wordnet_import.$chemical_compound_synset$ = SubLFiles.defconstant("*CHEMICAL-COMPOUND-SYNSET*", (SubLObject)wordnet_import.$list311);
        wordnet_import.$country_synset$ = SubLFiles.defconstant("*COUNTRY-SYNSET*", (SubLObject)wordnet_import.$list313);
        wordnet_import.$urban_area_synset$ = SubLFiles.defconstant("*URBAN-AREA-SYNSET*", (SubLObject)wordnet_import.$list314);
        wordnet_import.$geographical_area_synset$ = SubLFiles.defconstant("*GEOGRAPHICAL-AREA-SYNSET*", (SubLObject)wordnet_import.$list315);
        wordnet_import.$dtp_wni_role_info$ = SubLFiles.defconstant("*DTP-WNI-ROLE-INFO*", (SubLObject)wordnet_import.$sym393$WNI_ROLE_INFO);
        wordnet_import.$wordnet_import_access_path$ = SubLFiles.deflexical("*WORDNET-IMPORT-ACCESS-PATH*", (SubLObject)wordnet_import.NIL);
        return (SubLObject)wordnet_import.NIL;
    }
    
    public static SubLObject setup_wordnet_import_file() {
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym29$WNI_SYNSET_COLLECTION_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym33$WNI_SYNSET_INDIVIDUALS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym35$WNI_EXCLUDE_SITUATIONS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym39$WNI_EXCLUDE_RELATIONS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym42$WNI_EXCLUDE_SKIPPED);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym45$WNI_SYNSET_ID);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym48$WNI_SYNSET_WORDS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym49$WNI_SYNSETS_EQUAL);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym50$WNI_SYNSET_WORDS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym59$WNI_SYNSET_EXAMPLE_PHRASES);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym66$WNI_MOST_GENERAL_SYNSET_VERB_FRAME);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym68$WNI_SYNSET_VERB_FRAMES);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym69$WNI_SYNSET_VERB_FRAMES_HELPER);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym75$WNI_VERB_FRAMES_FOR_WORD);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym77$WNI_HYPERNYMS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym78$WNI_HYPERNYMS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym82$WNI_ALL_HYPERNYMS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym83$WNI_ALL_HYPERNYMS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym85$WNI_ALL_HYPERNYM_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym86$WNI_HYPONYMS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym87$WNI_HYPONYMS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym90$WNI_ALL_HYPONYMS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym91$WNI_ALL_HYPONYMS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym93$WNI_ANY_HYPONYM_AN_INDIVIDUAL);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym96$WNI_DERIVED_FORMS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym97$WNI_DERIVED_FORMS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym101$WNI_SYNSET_GLOSS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym102$WNI_SYNSET_GLOSS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym107$WNI_SYNSET_POS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym108$WNI_SYNSET_POS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym113$WNI_SYNSET_SPEECH_PART_OFFSET);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym121$WNI_HYPERNYM_TERMS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym122$WNI_HYPERNYM_MAPPED_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym123$WNI_SYNSET_TERM);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym124$WNI_SYNSET_TERM_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym131$WNI_UNMAPPED_HYPERNYM_CHAIN);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym132$WNI_SYNSET_W_O_LINKS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym133$WNI_SYNSET_W_O_LINKS_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym139$WNI_SYNSET_IS_CAUSER_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym140$WNI_SYNSETS_CAUSED_BY);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym141$WNI_SYNSETS_CAUSED_BY_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym145$WNI_SYNSET_IS_CAUSED_BY_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym146$WNI_SYNSETS_CAUSING);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym147$WNI_SYNSETS_CAUSING_HELPER);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym170$WNI_SYNSETS_HAVING_POS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym171$WNI_TERMS_SYNSETS);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym175$WNI_BROADER_TERMS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym179$WNI_MAPPED_TERMS_AND_SYNSETS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym182$WNI_SYNSET_HYPERNYMS_MAPPED_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym183$WNI_MAPPED_TERMS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym186$WNI_MAPPED_TERMS_AND_POS_OFFSETS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym188$WNI_SPEECH_PART_OFFSET_TO_SYNSET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym190$WNI_UPDATE_SYNSET_WITH_TERM);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym193$WNI_INSERT_CONCEPT_MATCH_HTML);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym198$WNI_SELECT_CONCEPT_MATCH_HTML);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym200$WNI_DELETE_CONCEPT_MATCH_HTML);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym201$WNI_DELETE_ALL_CONCEPT_MATCH_HTML);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym203$WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym34$WNI_UNREIFIED_SYNSET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym215$WNI_REIFIABLE_SYNSET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym217$WNI_REIFIABLE_SYNSET_FROM_STRING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym218$WNI_SYNSET_FROM_ID_STRING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym220$WNI_ENSURE_NAUT);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym221$WNI_NEXT_SYNSET_WITH_STATUS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym226$WNI_UNLOCKED_SYNSETS_WITH_STATUS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym227$WNI_TERM_HAS_VERB_SEMTRANS_);
        memoization_state.note_globally_cached_function((SubLObject)wordnet_import.$sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym241$WNI_GATHER_TERMS_FOR_MATCHING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym242$WNI_EXACT_SYNSET_TERM_MATCHES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym249$WNI_STRONG_SYNSET_TERM_MATCHES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym256$WNI_WEAK_SYNSET_TERM_MATCHES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym257$WNI_CREATE_NOW);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym259$WNI_ASSERT_WFF);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym263$WNI_UNASSERT_IMPORT_STATUSES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym264$WNI_UNASSERT_IMPORT_STATUS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym265$WNI_ASSERT_IMPORT_STATUSES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym266$WNI_ASSERT_IMPORT_STATUS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym269$WNI_ASSERT_SYNSET_MAPPING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym270$WNI_ASSERT_LIKELY_SYNSET_MAPPING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym272$WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym276$WNI_ASSERT_ISA_COLLECTION);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym279$WNI_ASSERT_GENLS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym281$WNI_UNASSERT_GENLS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym282$WNI_ASSERT_ISA);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym284$WNI_ASSERT_ISA_INDIVIDUAL);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym286$WNI_ASSERT_ISA_AGENT_GENERIC);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym289$WNI_ASSERT_REIFIED_USING);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym292$WNI_SYNSET_NOTE);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym296$WNI_ASSERT_SYNSET_NOTE);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym297$WNI_UNASSERT_SYNSET_NOTE);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym298$WNI_ASSERT_COMMENT);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym300$WNI_ASSERT_TERM_OF_UNIT);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym303$WNI_LOCK_SYNSET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym305$WNI_UNLOCK_SYNSET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym307$WNI_ASSERT_HEURISTIC_LEXICON);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym383$WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym386$WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym391$WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)wordnet_import.$sym400$WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)wordnet_import.$list401);
        Structures.def_csetf((SubLObject)wordnet_import.$sym402$WNI_ROLE, (SubLObject)wordnet_import.$sym403$_CSETF_WNI_ROLE);
        Structures.def_csetf((SubLObject)wordnet_import.$sym404$WNI_FILLER, (SubLObject)wordnet_import.$sym405$_CSETF_WNI_FILLER);
        Structures.def_csetf((SubLObject)wordnet_import.$sym406$WNI_DEFINING_COL, (SubLObject)wordnet_import.$sym407$_CSETF_WNI_DEFINING_COL);
        Structures.def_csetf((SubLObject)wordnet_import.$sym408$WNI_DEFINING_PRED, (SubLObject)wordnet_import.$sym409$_CSETF_WNI_DEFINING_PRED);
        Structures.def_csetf((SubLObject)wordnet_import.$sym410$WNI_SUBSUMPTION_STATUS, (SubLObject)wordnet_import.$sym411$_CSETF_WNI_SUBSUMPTION_STATUS);
        Equality.identity((SubLObject)wordnet_import.$sym393$WNI_ROLE_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), wordnet_import.$dtp_wni_role_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)wordnet_import.$sym422$VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD));
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym425$WNI_GATHER_ROLES_AND_TRAITS);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym427$WNI_FIND_COMPATIBLE_ROLES);
        access_macros.register_external_symbol((SubLObject)wordnet_import.$sym457$WNI_CLEAR_FUNCTION_CACHES);
        return (SubLObject)wordnet_import.NIL;
    }
    
    public void declareFunctions() {
        declare_wordnet_import_file();
    }
    
    public void initializeVariables() {
        init_wordnet_import_file();
    }
    
    public void runTopLevelForms() {
        setup_wordnet_import_file();
    }
    
    static {
        me = (SubLFile)new wordnet_import();
        wordnet_import.$wordnet_import_core_constants$ = null;
        wordnet_import.$wni_pos_map$ = null;
        wordnet_import.$wni_1_char_pos_map$ = null;
        wordnet_import.$wni_unranked_synsets_for_english_word_string_caching_state$ = null;
        wordnet_import.$wni_synsets_for_english_word_stringXpos_caching_state$ = null;
        wordnet_import.$wni_synsets_for_english_word_string_caching_state$ = null;
        wordnet_import.$wni_synset_collectionP_caching_state$ = null;
        wordnet_import.$wni_synset_words_helper_caching_state$ = null;
        wordnet_import.$wni_synset_example_phrases_helper_caching_state$ = null;
        wordnet_import.$wni_verb_frame_generalities$ = null;
        wordnet_import.$wni_least_general_frame_generality_score$ = null;
        wordnet_import.$wni_synset_verb_frames_helper_caching_state$ = null;
        wordnet_import.$wni_verb_frames_for_word_caching_state$ = null;
        wordnet_import.$wni_hypernyms_helper_caching_state$ = null;
        wordnet_import.$wni_all_hypernyms_helper_caching_state$ = null;
        wordnet_import.$wni_hyponyms_helper_caching_state$ = null;
        wordnet_import.$wni_all_hyponyms_helper_caching_state$ = null;
        wordnet_import.$wni_derived_forms_helper_caching_state$ = null;
        wordnet_import.$wni_synset_gloss_helper_caching_state$ = null;
        wordnet_import.$wni_synset_pos_helper_caching_state$ = null;
        wordnet_import.$wni_synset_speech_part_offset_helper_caching_state$ = null;
        wordnet_import.$wni_synset_term_helper_caching_state$ = null;
        wordnet_import.$wni_synset_wXo_links_helper_caching_state$ = null;
        wordnet_import.$wni_synsets_caused_by_helper_caching_state$ = null;
        wordnet_import.$wni_synsets_causing_helper_caching_state$ = null;
        wordnet_import.$wni_broader_terms_caching_state$ = null;
        wordnet_import.$wni_problem_store$ = null;
        wordnet_import.$wni_term_has_verb_semtrans_helperP_caching_state$ = null;
        wordnet_import.$wni_maximum_nbr_of_terms_to_gather_for_matching$ = null;
        wordnet_import.$wni_very_verbose_exact_synset_term_matches$ = null;
        wordnet_import.$wni_verbose_exact_synset_term_matches$ = null;
        wordnet_import.$person_synset$ = null;
        wordnet_import.$organism_being_synset$ = null;
        wordnet_import.$chemical_compound_synset$ = null;
        wordnet_import.$country_synset$ = null;
        wordnet_import.$urban_area_synset$ = null;
        wordnet_import.$geographical_area_synset$ = null;
        wordnet_import.$dtp_wni_role_info$ = null;
        wordnet_import.$wordnet_import_access_path$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetMemberWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetEnglishWordFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowCollectorMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet2_0-KS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-DeterminedIndividual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowDataStatusMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-Skip")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWordSenseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetExamplePhraseWithPosition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-8")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-9")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-11")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-22")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-4")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetVerbFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnHypernym")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetGloss")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetSpeechPart")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetReifiedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnWorkflowSynsetLock")) });
        $sym1$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), (SubLObject)SubLObjectFactory.makeString("Verb")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), (SubLObject)SubLObjectFactory.makeString("Adjective")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), (SubLObject)SubLObjectFactory.makeString("Adverb")));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)SubLObjectFactory.makeString("N")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), (SubLObject)SubLObjectFactory.makeString("V")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), (SubLObject)SubLObjectFactory.makeString("A")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), (SubLObject)SubLObjectFactory.makeString("R")));
        $sym4$WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING = SubLObjectFactory.makeSymbol("WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING");
        $sym5$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $const6$wnSynsetMemberWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetMemberWord"));
        $sym7$_SYNSET = SubLObjectFactory.makeSymbol("?SYNSET");
        $const8$WordNetEnglishWordFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetEnglishWordFn"));
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $const10$WordNetWorkflowCollectorMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowCollectorMt"));
        $sym11$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym12$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $sym13$_WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");
        $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS = SubLObjectFactory.makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS");
        $str15$select_synset_id_from_WordSense_w = SubLObjectFactory.makeString("select synset_id from WordSense where word = '");
        $str16$__and_pos____ = SubLObjectFactory.makeString("' and pos = '");
        $str17$__order_by_word_sense = SubLObjectFactory.makeString("' order by word_sense");
        $kw18$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw19$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw20$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw21$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw22$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $const23$WordNetSynsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn"));
        $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");
        $sym25$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING = SubLObjectFactory.makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING");
        $const26$WordNet2_0_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet2_0-KS"));
        $str27$__order_by_pos__word_sense = SubLObjectFactory.makeString("' order by pos, word_sense");
        $sym28$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");
        $sym29$WNI_SYNSET_COLLECTION_ = SubLObjectFactory.makeSymbol("WNI-SYNSET-COLLECTION?");
        $const30$WordNetSynsetImportStatus_Determi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-DeterminedIndividual"));
        $const31$WordNetWorkflowDataStatusMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowDataStatusMt"));
        $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");
        $sym33$WNI_SYNSET_INDIVIDUALS = SubLObjectFactory.makeSymbol("WNI-SYNSET-INDIVIDUALS");
        $sym34$WNI_UNREIFIED_SYNSET = SubLObjectFactory.makeSymbol("WNI-UNREIFIED-SYNSET");
        $sym35$WNI_EXCLUDE_SITUATIONS = SubLObjectFactory.makeSymbol("WNI-EXCLUDE-SITUATIONS");
        $str36$excluding_specs_of___Situation = SubLObjectFactory.makeString("excluding specs of #$Situation");
        $str37$cdolist = SubLObjectFactory.makeString("cdolist");
        $const38$Situation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"));
        $sym39$WNI_EXCLUDE_RELATIONS = SubLObjectFactory.makeSymbol("WNI-EXCLUDE-RELATIONS");
        $str40$excluding_specs_of___Relation = SubLObjectFactory.makeString("excluding specs of #$Relation");
        $const41$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym42$WNI_EXCLUDE_SKIPPED = SubLObjectFactory.makeSymbol("WNI-EXCLUDE-SKIPPED");
        $str43$excluding_skipped_synsets = SubLObjectFactory.makeString("excluding skipped synsets");
        $const44$WordNetSynsetImportStatus_Skip = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-Skip"));
        $sym45$WNI_SYNSET_ID = SubLObjectFactory.makeSymbol("WNI-SYNSET-ID");
        $sym46$POSSIBLY_NAUT_P = SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P");
        $sym47$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym48$WNI_SYNSET_WORDS = SubLObjectFactory.makeSymbol("WNI-SYNSET-WORDS");
        $sym49$WNI_SYNSETS_EQUAL = SubLObjectFactory.makeSymbol("WNI-SYNSETS-EQUAL");
        $sym50$WNI_SYNSET_WORDS_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-WORDS-HELPER");
        $const51$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym52$_POS = SubLObjectFactory.makeSymbol("?POS");
        $sym53$_SENSE = SubLObjectFactory.makeSymbol("?SENSE");
        $const54$wnSynsetWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetWord"));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWordSenseFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetEnglishWordFn")), (SubLObject)SubLObjectFactory.makeSymbol("?STRING")), (SubLObject)SubLObjectFactory.makeSymbol("?POS"), (SubLObject)SubLObjectFactory.makeSymbol("?SENSE")), (SubLObject)SubLObjectFactory.makeSymbol("?WORD-INDEX"));
        $sym56$_ = SubLObjectFactory.makeSymbol("<");
        $sym57$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym58$_WNI_SYNSET_WORDS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*");
        $sym59$WNI_SYNSET_EXAMPLE_PHRASES = SubLObjectFactory.makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES");
        $sym60$WNI_SYNSET_EXAMPLE_PHRASES_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES-HELPER");
        $const61$wnSynsetExamplePhraseWithPosition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetExamplePhraseWithPosition"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?EXAMPLE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEX"));
        $sym63$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym64$_WNI_SYNSET_EXAMPLE_PHRASES_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-8")), (SubLObject)wordnet_import.TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-2")), (SubLObject)wordnet_import.FIVE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-1")), (SubLObject)wordnet_import.FOUR_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-9")), (SubLObject)wordnet_import.THREE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-11")), (SubLObject)wordnet_import.ONE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-22")), (SubLObject)wordnet_import.FIVE_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WNVerbFrame-4")), (SubLObject)wordnet_import.FOUR_INTEGER));
        $sym66$WNI_MOST_GENERAL_SYNSET_VERB_FRAME = SubLObjectFactory.makeSymbol("WNI-MOST-GENERAL-SYNSET-VERB-FRAME");
        $sym67$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym68$WNI_SYNSET_VERB_FRAMES = SubLObjectFactory.makeSymbol("WNI-SYNSET-VERB-FRAMES");
        $sym69$WNI_SYNSET_VERB_FRAMES_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-VERB-FRAMES-HELPER");
        $const70$wnSynsetVerbFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetVerbFrame"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VERB-FRAME"));
        $list72 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?VERB-FRAME")), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $sym73$_WNI_SYNSET_VERB_FRAMES_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*");
        $int74$1000 = SubLObjectFactory.makeInteger(1000);
        $sym75$WNI_VERB_FRAMES_FOR_WORD = SubLObjectFactory.makeSymbol("WNI-VERB-FRAMES-FOR-WORD");
        $sym76$_WNI_VERB_FRAMES_FOR_WORD_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*");
        $sym77$WNI_HYPERNYMS = SubLObjectFactory.makeSymbol("WNI-HYPERNYMS");
        $sym78$WNI_HYPERNYMS_HELPER = SubLObjectFactory.makeSymbol("WNI-HYPERNYMS-HELPER");
        $const79$wnHypernym = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnHypernym"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HYPERNYM-SYNSET"));
        $sym81$_WNI_HYPERNYMS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-HYPERNYMS-HELPER-CACHING-STATE*");
        $sym82$WNI_ALL_HYPERNYMS = SubLObjectFactory.makeSymbol("WNI-ALL-HYPERNYMS");
        $sym83$WNI_ALL_HYPERNYMS_HELPER = SubLObjectFactory.makeSymbol("WNI-ALL-HYPERNYMS-HELPER");
        $sym84$_WNI_ALL_HYPERNYMS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*");
        $sym85$WNI_ALL_HYPERNYM_ = SubLObjectFactory.makeSymbol("WNI-ALL-HYPERNYM?");
        $sym86$WNI_HYPONYMS = SubLObjectFactory.makeSymbol("WNI-HYPONYMS");
        $sym87$WNI_HYPONYMS_HELPER = SubLObjectFactory.makeSymbol("WNI-HYPONYMS-HELPER");
        $sym88$_HYPONYM_SYNSET = SubLObjectFactory.makeSymbol("?HYPONYM-SYNSET");
        $sym89$_WNI_HYPONYMS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-HYPONYMS-HELPER-CACHING-STATE*");
        $sym90$WNI_ALL_HYPONYMS = SubLObjectFactory.makeSymbol("WNI-ALL-HYPONYMS");
        $sym91$WNI_ALL_HYPONYMS_HELPER = SubLObjectFactory.makeSymbol("WNI-ALL-HYPONYMS-HELPER");
        $sym92$_WNI_ALL_HYPONYMS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*");
        $sym93$WNI_ANY_HYPONYM_AN_INDIVIDUAL = SubLObjectFactory.makeSymbol("WNI-ANY-HYPONYM-AN-INDIVIDUAL");
        $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ = SubLObjectFactory.makeSymbol("WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?");
        $const95$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym96$WNI_DERIVED_FORMS = SubLObjectFactory.makeSymbol("WNI-DERIVED-FORMS");
        $sym97$WNI_DERIVED_FORMS_HELPER = SubLObjectFactory.makeSymbol("WNI-DERIVED-FORMS-HELPER");
        $str98$SELECT_DISTINCT_synsetpointer_syn = SubLObjectFactory.makeString("SELECT DISTINCT synsetpointer.synset_id \n               FROM synsetpointer \n               WHERE \n                 synsetpointer.target_synset_id = ");
        $str99$_AND____________________synsetpoi = SubLObjectFactory.makeString(" AND \n                 (synsetpointer.source_pos = 'n' OR\n                  synsetpointer.source_pos = 'a' OR\n                  synsetpointer.source_pos = 'r') AND \n                 synsetpointer.pointer_type = '+'");
        $sym100$_WNI_DERIVED_FORMS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*");
        $sym101$WNI_SYNSET_GLOSS = SubLObjectFactory.makeSymbol("WNI-SYNSET-GLOSS");
        $sym102$WNI_SYNSET_GLOSS_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-GLOSS-HELPER");
        $const103$wnSynsetGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetGloss"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GLOSS"));
        $list105 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?GLOSS")), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $sym106$_WNI_SYNSET_GLOSS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*");
        $sym107$WNI_SYNSET_POS = SubLObjectFactory.makeSymbol("WNI-SYNSET-POS");
        $sym108$WNI_SYNSET_POS_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-POS-HELPER");
        $const109$wnSynsetSpeechPart = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetSpeechPart"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?POS"));
        $list111 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?POS")), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $sym112$_WNI_SYNSET_POS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-POS-HELPER-CACHING-STATE*");
        $sym113$WNI_SYNSET_SPEECH_PART_OFFSET = SubLObjectFactory.makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET");
        $sym114$WNI_SYNSET_SPEECH_PART_OFFSET_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET-HELPER");
        $sym115$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $const116$wnSynsetSpeechPartOffset = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetSpeechPartOffset"));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET"));
        $list118 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET")), SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $sym119$_WNI_SYNSET_SPEECH_PART_OFFSET_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*");
        $int120$256 = SubLObjectFactory.makeInteger(256);
        $sym121$WNI_HYPERNYM_TERMS = SubLObjectFactory.makeSymbol("WNI-HYPERNYM-TERMS");
        $sym122$WNI_HYPERNYM_MAPPED_ = SubLObjectFactory.makeSymbol("WNI-HYPERNYM-MAPPED?");
        $sym123$WNI_SYNSET_TERM = SubLObjectFactory.makeSymbol("WNI-SYNSET-TERM");
        $sym124$WNI_SYNSET_TERM_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-TERM-HELPER");
        $sym125$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $const126$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $sym127$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const128$WordNet_Version2_0 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0"));
        $list129 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(0.95), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM")), SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(2000000) });
        $sym130$_WNI_SYNSET_TERM_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*");
        $sym131$WNI_UNMAPPED_HYPERNYM_CHAIN = SubLObjectFactory.makeSymbol("WNI-UNMAPPED-HYPERNYM-CHAIN");
        $sym132$WNI_SYNSET_W_O_LINKS = SubLObjectFactory.makeSymbol("WNI-SYNSET-W/O-LINKS");
        $sym133$WNI_SYNSET_W_O_LINKS_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSET-W/O-LINKS-HELPER");
        $str134$_ = SubLObjectFactory.makeString("(");
        $str135$___ = SubLObjectFactory.makeString(" | ");
        $str136$_ = SubLObjectFactory.makeString(")");
        $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");
        $int138$100 = SubLObjectFactory.makeInteger(100);
        $sym139$WNI_SYNSET_IS_CAUSER_ = SubLObjectFactory.makeSymbol("WNI-SYNSET-IS-CAUSER?");
        $sym140$WNI_SYNSETS_CAUSED_BY = SubLObjectFactory.makeSymbol("WNI-SYNSETS-CAUSED-BY");
        $sym141$WNI_SYNSETS_CAUSED_BY_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSETS-CAUSED-BY-HELPER");
        $const142$wnCause = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnCause"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CAUSED-SYNSET"));
        $sym144$_WNI_SYNSETS_CAUSED_BY_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*");
        $sym145$WNI_SYNSET_IS_CAUSED_BY_ = SubLObjectFactory.makeSymbol("WNI-SYNSET-IS-CAUSED-BY?");
        $sym146$WNI_SYNSETS_CAUSING = SubLObjectFactory.makeSymbol("WNI-SYNSETS-CAUSING");
        $sym147$WNI_SYNSETS_CAUSING_HELPER = SubLObjectFactory.makeSymbol("WNI-SYNSETS-CAUSING-HELPER");
        $sym148$_CAUSING_SYNSET = SubLObjectFactory.makeSymbol("?CAUSING-SYNSET");
        $sym149$_WNI_SYNSETS_CAUSING_HELPER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*");
        $str150$ancient = SubLObjectFactory.makeString("ancient");
        $str151$Greek = SubLObjectFactory.makeString("Greek");
        $str152$_ = SubLObjectFactory.makeString(" ");
        $str153$Atlantic = SubLObjectFactory.makeString("Atlantic");
        $str154$Pacific = SubLObjectFactory.makeString("Pacific");
        $str155$Crown_Colony = SubLObjectFactory.makeString("Crown Colony");
        $str156$Caribbean = SubLObjectFactory.makeString("Caribbean");
        $str157$State = SubLObjectFactory.makeString("State");
        $str158$Lake_Erie = SubLObjectFactory.makeString("Lake Erie");
        $str159$Asia_Minor = SubLObjectFactory.makeString("Asia Minor");
        $str160$Elbo_River = SubLObjectFactory.makeString("Elbo River");
        $str161$Asian = SubLObjectFactory.makeString("Asian");
        $str162$Yourba = SubLObjectFactory.makeString("Yourba");
        $str163$Japanese = SubLObjectFactory.makeString("Japanese");
        $str164$Nile = SubLObjectFactory.makeString("Nile");
        $str165$River_Thames = SubLObjectFactory.makeString("River Thames");
        $str166$River_Aire = SubLObjectFactory.makeString("River Aire");
        $str167$_s = SubLObjectFactory.makeString("'s");
        $const168$GeopoliticalEntity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntity"));
        $const169$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $sym170$WNI_SYNSETS_HAVING_POS = SubLObjectFactory.makeSymbol("WNI-SYNSETS-HAVING-POS");
        $sym171$WNI_TERMS_SYNSETS = SubLObjectFactory.makeSymbol("WNI-TERMS-SYNSETS");
        $list172 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET"));
        $list173 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(0.95), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeInteger(2000000) });
        $sym174$_SPEECH_PART_OFFSET = SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET");
        $sym175$WNI_BROADER_TERMS = SubLObjectFactory.makeSymbol("WNI-BROADER-TERMS");
        $const176$CycKBSubsetCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection"));
        $const177$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym178$_WNI_BROADER_TERMS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-BROADER-TERMS-CACHING-STATE*");
        $sym179$WNI_MAPPED_TERMS_AND_SYNSETS = SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS-AND-SYNSETS");
        $str180$finding_synsets_for_speech_part_o = SubLObjectFactory.makeString("finding synsets for speech-part-offsets");
        $sym181$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_ = SubLObjectFactory.makeSymbol("WNI-SYNSET-HYPERNYMS-MAPPED?");
        $sym183$WNI_MAPPED_TERMS = SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS");
        $list184 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET")));
        $const185$WordNetMappingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt"));
        $sym186$WNI_MAPPED_TERMS_AND_POS_OFFSETS = SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS-AND-POS-OFFSETS");
        $list187 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEECH-PART-OFFSET"));
        $sym188$WNI_SPEECH_PART_OFFSET_TO_SYNSET = SubLObjectFactory.makeSymbol("WNI-SPEECH-PART-OFFSET-TO-SYNSET");
        $list189 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-NUMBER"), wordnet_import.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), wordnet_import.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("BLOCK?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), wordnet_import.NIL, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $sym190$WNI_UPDATE_SYNSET_WITH_TERM = SubLObjectFactory.makeSymbol("WNI-UPDATE-SYNSET-WITH-TERM");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)wordnet_import.THREE_INTEGER);
        $str192$update_Synset_set_cyc_term_____A_ = SubLObjectFactory.makeString("update Synset set cyc_term = '~A' where synset_id = ~S");
        $sym193$WNI_INSERT_CONCEPT_MATCH_HTML = SubLObjectFactory.makeSymbol("WNI-INSERT-CONCEPT-MATCH-HTML");
        $str194$delete_from_ConceptMatchHTML_wher = SubLObjectFactory.makeString("delete from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");
        $str195$insert_into_ConceptMatchHTML_valu = SubLObjectFactory.makeString("insert into ConceptMatchHTML values(~A, '~A', '~A')");
        $str196$__ = SubLObjectFactory.makeString("''");
        $str197$_ = SubLObjectFactory.makeString("'");
        $sym198$WNI_SELECT_CONCEPT_MATCH_HTML = SubLObjectFactory.makeSymbol("WNI-SELECT-CONCEPT-MATCH-HTML");
        $str199$select_html_from_ConceptMatchHTML = SubLObjectFactory.makeString("select html from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");
        $sym200$WNI_DELETE_CONCEPT_MATCH_HTML = SubLObjectFactory.makeSymbol("WNI-DELETE-CONCEPT-MATCH-HTML");
        $sym201$WNI_DELETE_ALL_CONCEPT_MATCH_HTML = SubLObjectFactory.makeSymbol("WNI-DELETE-ALL-CONCEPT-MATCH-HTML");
        $str202$delete_from_ConceptMatchHTML_wher = SubLObjectFactory.makeString("delete from ConceptMatchHTML where cyc_image_id ='~A'");
        $sym203$WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM = SubLObjectFactory.makeSymbol("WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM");
        $str204$select_Synset_synset_id__________ = SubLObjectFactory.makeString("select Synset.synset_id\n                 from \n                   Synset, \n                   Synset as target_synset, \n                   SynsetPointer\n                 where\n                   Synset.pos = '");
        $str205$__and____________________Synset_c = SubLObjectFactory.makeString("' and\n                   Synset.cyc_term is null and\n                   pointer_type = '@' and\n                   SynsetPointer.synset_id = Synset.synset_id and\n                   SynsetPointer.target_synset_id = target_synset.synset_id and\n                   target_synset.cyc_term is not null\n                 order by Synset.synset_id");
        $sym206$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym207$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym208$QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $kw209$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $str210$Destroying_invalid_WordNet_Import = SubLObjectFactory.makeString("Destroying invalid WordNet Import problem store...");
        $float211$0_9 = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $str212$Destroying_90___full_WordNet_Impo = SubLObjectFactory.makeString("Destroying 90%+ full WordNet Import problem store...");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)wordnet_import.NIL, (SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)wordnet_import.NIL);
        $sym214$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym215$WNI_REIFIABLE_SYNSET = SubLObjectFactory.makeSymbol("WNI-REIFIABLE-SYNSET");
        $const216$WordNetSynsetReifiedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetReifiedFn"));
        $sym217$WNI_REIFIABLE_SYNSET_FROM_STRING = SubLObjectFactory.makeSymbol("WNI-REIFIABLE-SYNSET-FROM-STRING");
        $sym218$WNI_SYNSET_FROM_ID_STRING = SubLObjectFactory.makeSymbol("WNI-SYNSET-FROM-ID-STRING");
        $sym219$DIGIT_STRING_ = SubLObjectFactory.makeSymbol("DIGIT-STRING?");
        $sym220$WNI_ENSURE_NAUT = SubLObjectFactory.makeSymbol("WNI-ENSURE-NAUT");
        $sym221$WNI_NEXT_SYNSET_WITH_STATUS = SubLObjectFactory.makeSymbol("WNI-NEXT-SYNSET-WITH-STATUS");
        $const222$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const223$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym224$_REIFIED_SYNSET = SubLObjectFactory.makeSymbol("?REIFIED-SYNSET");
        $list225 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?CYCLIST"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnWorkflowSynsetLock")), (SubLObject)SubLObjectFactory.makeSymbol("?REIFIED-SYNSET"), (SubLObject)SubLObjectFactory.makeSymbol("?CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))))));
        $sym226$WNI_UNLOCKED_SYNSETS_WITH_STATUS = SubLObjectFactory.makeSymbol("WNI-UNLOCKED-SYNSETS-WITH-STATUS");
        $sym227$WNI_TERM_HAS_VERB_SEMTRANS_ = SubLObjectFactory.makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS?");
        $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ = SubLObjectFactory.makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS-HELPER?");
        $sym229$_WORD_UNIT = SubLObjectFactory.makeSymbol("?WORD-UNIT");
        $sym230$_SENSE_NBR = SubLObjectFactory.makeSymbol("?SENSE-NBR");
        $const231$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $const232$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const233$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym234$_FRAME = SubLObjectFactory.makeSymbol("?FRAME");
        $sym235$_TRANS = SubLObjectFactory.makeSymbol("?TRANS");
        $const236$verbSemTrans_Canonical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTrans-Canonical"));
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TRANS"));
        $list238 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?FRAME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TRANS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTrans")), (SubLObject)SubLObjectFactory.makeSymbol("?WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENSE-NBR"), (SubLObject)SubLObjectFactory.makeSymbol("?FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("?TRANS"))))));
        $list239 = ConsesLow.list((SubLObject)wordnet_import.NIL);
        $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");
        $sym241$WNI_GATHER_TERMS_FOR_MATCHING = SubLObjectFactory.makeSymbol("WNI-GATHER-TERMS-FOR-MATCHING");
        $sym242$WNI_EXACT_SYNSET_TERM_MATCHES = SubLObjectFactory.makeSymbol("WNI-EXACT-SYNSET-TERM-MATCHES");
        $str243$___A_mapped_hypernyms__A___A__ = SubLObjectFactory.makeString("~%~A mapped-hypernyms ~A~%~A~%");
        $str244$__considering_word____a__ = SubLObjectFactory.makeString("  considering word - ~a~%");
        $str245$____possible_lexical_matches__A__ = SubLObjectFactory.makeString("    possible lexical matches ~A~%");
        $str246$____considering_term____a___const = SubLObjectFactory.makeString("    considering term - ~a - constrained by mapped broader terms ~A~%");
        $str247$___A_____A__structure___ = SubLObjectFactory.makeString("~%~A  = ~A (structure)~%");
        $str248$___A____A__lexicon___ = SubLObjectFactory.makeString("~%~A = ~A (lexicon)~%");
        $sym249$WNI_STRONG_SYNSET_TERM_MATCHES = SubLObjectFactory.makeSymbol("WNI-STRONG-SYNSET-TERM-MATCHES");
        $sym250$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw251$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $kw252$ALL_NOUN_FORMS = SubLObjectFactory.makeKeyword("ALL-NOUN-FORMS");
        $sym253$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym254$SET_OR_COLLECTION_ = SubLObjectFactory.makeSymbol("SET-OR-COLLECTION?");
        $sym255$INDIVIDUAL_ = SubLObjectFactory.makeSymbol("INDIVIDUAL?");
        $sym256$WNI_WEAK_SYNSET_TERM_MATCHES = SubLObjectFactory.makeSymbol("WNI-WEAK-SYNSET-TERM-MATCHES");
        $sym257$WNI_CREATE_NOW = SubLObjectFactory.makeSymbol("WNI-CREATE-NOW");
        $sym258$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym259$WNI_ASSERT_WFF = SubLObjectFactory.makeSymbol("WNI-ASSERT-WFF");
        $sym260$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym261$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $sym262$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $sym263$WNI_UNASSERT_IMPORT_STATUSES = SubLObjectFactory.makeSymbol("WNI-UNASSERT-IMPORT-STATUSES");
        $sym264$WNI_UNASSERT_IMPORT_STATUS = SubLObjectFactory.makeSymbol("WNI-UNASSERT-IMPORT-STATUS");
        $sym265$WNI_ASSERT_IMPORT_STATUSES = SubLObjectFactory.makeSymbol("WNI-ASSERT-IMPORT-STATUSES");
        $sym266$WNI_ASSERT_IMPORT_STATUS = SubLObjectFactory.makeSymbol("WNI-ASSERT-IMPORT-STATUS");
        $kw267$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw268$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym269$WNI_ASSERT_SYNSET_MAPPING = SubLObjectFactory.makeSymbol("WNI-ASSERT-SYNSET-MAPPING");
        $sym270$WNI_ASSERT_LIKELY_SYNSET_MAPPING = SubLObjectFactory.makeSymbol("WNI-ASSERT-LIKELY-SYNSET-MAPPING");
        $const271$wnLikelySynsetMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnLikelySynsetMapping"));
        $sym272$WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT = SubLObjectFactory.makeSymbol("WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT");
        $const273$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list274 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowConstant-NotFullyReviewed")));
        $const275$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym276$WNI_ASSERT_ISA_COLLECTION = SubLObjectFactory.makeSymbol("WNI-ASSERT-ISA-COLLECTION");
        $list277 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $const278$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym279$WNI_ASSERT_GENLS = SubLObjectFactory.makeSymbol("WNI-ASSERT-GENLS");
        $const280$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym281$WNI_UNASSERT_GENLS = SubLObjectFactory.makeSymbol("WNI-UNASSERT-GENLS");
        $sym282$WNI_ASSERT_ISA = SubLObjectFactory.makeSymbol("WNI-ASSERT-ISA");
        $const283$WordNetIndividualMappingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetIndividualMappingMt"));
        $sym284$WNI_ASSERT_ISA_INDIVIDUAL = SubLObjectFactory.makeSymbol("WNI-ASSERT-ISA-INDIVIDUAL");
        $list285 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")));
        $sym286$WNI_ASSERT_ISA_AGENT_GENERIC = SubLObjectFactory.makeSymbol("WNI-ASSERT-ISA-AGENT-GENERIC");
        $const287$Agent_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $list288 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic")));
        $sym289$WNI_ASSERT_REIFIED_USING = SubLObjectFactory.makeSymbol("WNI-ASSERT-REIFIED-USING");
        $const290$reifiedUsingTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reifiedUsingTool"));
        $list291 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycWordNetImportTool")));
        $sym292$WNI_SYNSET_NOTE = SubLObjectFactory.makeSymbol("WNI-SYNSET-NOTE");
        $const293$wnSynsetNote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnSynsetNote"));
        $list294 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NOTE"));
        $str295$ = SubLObjectFactory.makeString("");
        $sym296$WNI_ASSERT_SYNSET_NOTE = SubLObjectFactory.makeSymbol("WNI-ASSERT-SYNSET-NOTE");
        $sym297$WNI_UNASSERT_SYNSET_NOTE = SubLObjectFactory.makeSymbol("WNI-UNASSERT-SYNSET-NOTE");
        $sym298$WNI_ASSERT_COMMENT = SubLObjectFactory.makeSymbol("WNI-ASSERT-COMMENT");
        $const299$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $sym300$WNI_ASSERT_TERM_OF_UNIT = SubLObjectFactory.makeSymbol("WNI-ASSERT-TERM-OF-UNIT");
        $const301$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $const302$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym303$WNI_LOCK_SYNSET = SubLObjectFactory.makeSymbol("WNI-LOCK-SYNSET");
        $const304$wnWorkflowSynsetLock = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wnWorkflowSynsetLock"));
        $sym305$WNI_UNLOCK_SYNSET = SubLObjectFactory.makeSymbol("WNI-UNLOCK-SYNSET");
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DATE"));
        $sym307$WNI_ASSERT_HEURISTIC_LEXICON = SubLObjectFactory.makeSymbol("WNI-ASSERT-HEURISTIC-LEXICON");
        $sym308$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $list309 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(114834));
        $list310 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(114709));
        $list311 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(567092));
        $str312$_included = SubLObjectFactory.makeString("-included");
        $list313 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(377912));
        $list314 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(382049));
        $list315 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetFn")), (SubLObject)SubLObjectFactory.makeInteger(378797));
        $str316$WordNet_individual_synset__A_must = SubLObjectFactory.makeString("WordNet individual synset ~A must be a #$Noun");
        $const317$BiologicalSpecies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalSpecies"));
        $const318$scientificName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scientificName"));
        $const319$NewLatinLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NewLatinLexicalMt"));
        $list320 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_semicolon, (SubLObject)Characters.CHAR_comma);
        $list321 = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $const322$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const323$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $const324$hyphenString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hyphenString"));
        $const325$TemporaryLexicalAssertions_WordNe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt"));
        $str326$_count_noun = SubLObjectFactory.makeString("-count-noun");
        $str327$headword_is_first = SubLObjectFactory.makeString("headword-is-first");
        $const328$multiWordString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $const329$compoundString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString"));
        $str330$must_have_an_existing_word_unit_f = SubLObjectFactory.makeString("must have an existing word unit for ~A which has speech-part ~A");
        $sym331$_WORD_SENSE = SubLObjectFactory.makeSymbol("?WORD-SENSE");
        $str332$must_have_an_existing_word_sense_ = SubLObjectFactory.makeString("must have an existing word sense for ~A which has speech-part ~A");
        $const333$politenessOfWS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politenessOfWS"));
        $const334$formalityOfWS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formalityOfWS"));
        $const335$rhetoricalDeviceOfPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rhetoricalDeviceOfPhrase"));
        $str336$_politeness = SubLObjectFactory.makeString("-politeness");
        $str337$polite = SubLObjectFactory.makeString("polite");
        $const338$PoliteSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PoliteSpeech"));
        $str339$rude = SubLObjectFactory.makeString("rude");
        $const340$RudeSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RudeSpeech"));
        $str341$vulgar = SubLObjectFactory.makeString("vulgar");
        $const342$VulgarSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VulgarSpeech"));
        $str343$_formality = SubLObjectFactory.makeString("-formality");
        $str344$archaic = SubLObjectFactory.makeString("archaic");
        $const345$ArchaicSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArchaicSpeech"));
        $str346$slang = SubLObjectFactory.makeString("slang");
        $const347$SlangSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SlangSpeech"));
        $str348$formal = SubLObjectFactory.makeString("formal");
        $const349$FormalSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormalSpeech"));
        $str350$informal = SubLObjectFactory.makeString("informal");
        $const351$InformalSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InformalSpeech"));
        $str352$baby_talk = SubLObjectFactory.makeString("baby talk");
        $const353$BabyTalk = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BabyTalk"));
        $str354$technical_jargon = SubLObjectFactory.makeString("technical jargon");
        $const355$Jargon = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Jargon"));
        $str356$_rhetorical_device = SubLObjectFactory.makeString("-rhetorical-device");
        $str357$metaphor = SubLObjectFactory.makeString("metaphor");
        $const358$MetaphoricalSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MetaphoricalSpeech"));
        $str359$simile = SubLObjectFactory.makeString("simile");
        $const360$Simile_FigureOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Simile-FigureOfSpeech"));
        $str361$euphemism = SubLObjectFactory.makeString("euphemism");
        $const362$EuphemisticSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EuphemisticSpeech"));
        $const363$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $const364$familyName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName"));
        $str365$Mrs_ = SubLObjectFactory.makeString("Mrs.");
        $str366$Sir_ = SubLObjectFactory.makeString("Sir ");
        $str367$_Jr_ = SubLObjectFactory.makeString(" Jr.");
        $str368$President_ = SubLObjectFactory.makeString("President ");
        $const369$givenNames = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames"));
        $const370$middleName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("middleName"));
        $const371$pseudonym = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pseudonym"));
        $const372$placeName_Standard = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-Standard"));
        $const373$placeName_ShortForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-ShortForm"));
        $const374$acronymString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $const375$initialismString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialismString"));
        $str376$ing = SubLObjectFactory.makeString("ing");
        $const377$GerundiveNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GerundiveNoun"));
        $str378$t = SubLObjectFactory.makeString("t");
        $const379$ProperCountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $const380$ProperMassNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"));
        $const381$CountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $const382$MassNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $sym383$WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS = SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS");
        $str384$Counting_recent_WordNet_mappings = SubLObjectFactory.makeString("Counting recent WordNet mappings");
        $int385$20050101 = SubLObjectFactory.makeInteger(20050101);
        $sym386$WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET = SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET");
        $const387$WordNetWorkflowConstant_NotFullyR = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetWorkflowConstant-NotFullyReviewed"));
        $str388$Counting_terms_imported_from_Word = SubLObjectFactory.makeString("Counting terms imported from WordNet");
        $const389$SteveReed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SteveReed"));
        $const390$CycWordNetImportTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycWordNetImportTool"));
        $sym391$WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET = SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET");
        $str392$Counting_recent_denotations_impor = SubLObjectFactory.makeString("Counting recent denotations imported from WordNet");
        $sym393$WNI_ROLE_INFO = SubLObjectFactory.makeSymbol("WNI-ROLE-INFO");
        $sym394$WNI_ROLE_INFO_P = SubLObjectFactory.makeSymbol("WNI-ROLE-INFO-P");
        $list395 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINING-COL"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSUMPTION-STATUS"));
        $list396 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROLE"), (SubLObject)SubLObjectFactory.makeKeyword("FILLER"), (SubLObject)SubLObjectFactory.makeKeyword("DEFINING-COL"), (SubLObject)SubLObjectFactory.makeKeyword("DEFINING-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("SUBSUMPTION-STATUS"));
        $list397 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WNI-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("WNI-FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("WNI-DEFINING-COL"), (SubLObject)SubLObjectFactory.makeSymbol("WNI-DEFINING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WNI-SUBSUMPTION-STATUS"));
        $list398 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WNI-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WNI-FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WNI-DEFINING-COL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WNI-DEFINING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS"));
        $sym399$WNI_PRINT_ROLE_INFO = SubLObjectFactory.makeSymbol("WNI-PRINT-ROLE-INFO");
        $sym400$WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("WNI-ROLE-INFO-P"));
        $sym402$WNI_ROLE = SubLObjectFactory.makeSymbol("WNI-ROLE");
        $sym403$_CSETF_WNI_ROLE = SubLObjectFactory.makeSymbol("_CSETF-WNI-ROLE");
        $sym404$WNI_FILLER = SubLObjectFactory.makeSymbol("WNI-FILLER");
        $sym405$_CSETF_WNI_FILLER = SubLObjectFactory.makeSymbol("_CSETF-WNI-FILLER");
        $sym406$WNI_DEFINING_COL = SubLObjectFactory.makeSymbol("WNI-DEFINING-COL");
        $sym407$_CSETF_WNI_DEFINING_COL = SubLObjectFactory.makeSymbol("_CSETF-WNI-DEFINING-COL");
        $sym408$WNI_DEFINING_PRED = SubLObjectFactory.makeSymbol("WNI-DEFINING-PRED");
        $sym409$_CSETF_WNI_DEFINING_PRED = SubLObjectFactory.makeSymbol("_CSETF-WNI-DEFINING-PRED");
        $sym410$WNI_SUBSUMPTION_STATUS = SubLObjectFactory.makeSymbol("WNI-SUBSUMPTION-STATUS");
        $sym411$_CSETF_WNI_SUBSUMPTION_STATUS = SubLObjectFactory.makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS");
        $kw412$ROLE = SubLObjectFactory.makeKeyword("ROLE");
        $kw413$FILLER = SubLObjectFactory.makeKeyword("FILLER");
        $kw414$DEFINING_COL = SubLObjectFactory.makeKeyword("DEFINING-COL");
        $kw415$DEFINING_PRED = SubLObjectFactory.makeKeyword("DEFINING-PRED");
        $kw416$SUBSUMPTION_STATUS = SubLObjectFactory.makeKeyword("SUBSUMPTION-STATUS");
        $str417$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw418$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym419$MAKE_WNI_ROLE_INFO = SubLObjectFactory.makeSymbol("MAKE-WNI-ROLE-INFO");
        $kw420$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw421$END = SubLObjectFactory.makeKeyword("END");
        $sym422$VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD");
        $sym423$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $str424$_ROLE_INFO___s__s__s__s__s_ = SubLObjectFactory.makeString("<ROLE-INFO: ~s ~s ~s ~s ~s>");
        $sym425$WNI_GATHER_ROLES_AND_TRAITS = SubLObjectFactory.makeSymbol("WNI-GATHER-ROLES-AND-TRAITS");
        $sym426$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym427$WNI_FIND_COMPATIBLE_ROLES = SubLObjectFactory.makeSymbol("WNI-FIND-COMPATIBLE-ROLES");
        $const428$genlPredsWRTTypes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPredsWRTTypes"));
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"));
        $list430 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"));
        $list431 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation")));
        $list432 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRelevantPreds")));
        $list433 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE")));
        $const434$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const435$interArgIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-2"));
        $sym436$_ROLE = SubLObjectFactory.makeSymbol("?ROLE");
        $list437 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FILLER"));
        $sym438$_FILLER_2 = SubLObjectFactory.makeSymbol("?FILLER-2");
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FILLER-2"));
        $list440 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER-2"), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER-2"), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER")));
        $list441 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER")));
        $sym442$_COLL = SubLObjectFactory.makeSymbol("?COLL");
        $list443 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplateConstant-FactEntryTool")))));
        $sym444$_THING = SubLObjectFactory.makeSymbol("?THING");
        $list445 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?THING"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("?THING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplateConstant-FactEntryTool")))));
        $sym446$_ROLE2 = SubLObjectFactory.makeSymbol("?ROLE2");
        $const447$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $const448$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym449$_DEFINING_COLL = SubLObjectFactory.makeSymbol("?DEFINING-COLL");
        $list450 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPredsWRTTypes"))));
        $list451 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"))));
        $list452 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplateConstant-FactEntryTool")))));
        $list453 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?THING"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?FILLER"), (SubLObject)SubLObjectFactory.makeSymbol("?THING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?DEFINING-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROLE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaTemplateConstant-FactEntryTool")))));
        $str454$_A = SubLObjectFactory.makeString("~A");
        $sym455$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym456$WNI_SORT_KEY_1 = SubLObjectFactory.makeSymbol("WNI-SORT-KEY-1");
        $sym457$WNI_CLEAR_FUNCTION_CACHES = SubLObjectFactory.makeSymbol("WNI-CLEAR-FUNCTION-CACHES");
        $str458$in_workflow_ = SubLObjectFactory.makeString("in-workflow?");
        $str459$nil = SubLObjectFactory.makeString("nil");
        $str460$unmapped_hypernym_chain = SubLObjectFactory.makeString("unmapped-hypernym-chain");
    }
    
    public static final class $wni_role_info_native extends SubLStructNative
    {
        public SubLObject $role;
        public SubLObject $filler;
        public SubLObject $defining_col;
        public SubLObject $defining_pred;
        public SubLObject $subsumption_status;
        private static final SubLStructDeclNative structDecl;
        
        public $wni_role_info_native() {
            this.$role = (SubLObject)CommonSymbols.NIL;
            this.$filler = (SubLObject)CommonSymbols.NIL;
            this.$defining_col = (SubLObject)CommonSymbols.NIL;
            this.$defining_pred = (SubLObject)CommonSymbols.NIL;
            this.$subsumption_status = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$wni_role_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$role;
        }
        
        public SubLObject getField3() {
            return this.$filler;
        }
        
        public SubLObject getField4() {
            return this.$defining_col;
        }
        
        public SubLObject getField5() {
            return this.$defining_pred;
        }
        
        public SubLObject getField6() {
            return this.$subsumption_status;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$role = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$filler = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$defining_col = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$defining_pred = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$subsumption_status = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$wni_role_info_native.class, wordnet_import.$sym393$WNI_ROLE_INFO, wordnet_import.$sym394$WNI_ROLE_INFO_P, wordnet_import.$list395, wordnet_import.$list396, new String[] { "$role", "$filler", "$defining_col", "$defining_pred", "$subsumption_status" }, wordnet_import.$list397, wordnet_import.$list398, wordnet_import.$sym399$WNI_PRINT_ROLE_INFO);
        }
    }
    
    public static final class $wni_role_info_p$UnaryFunction extends UnaryFunction
    {
        public $wni_role_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("WNI-ROLE-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return wordnet_import.wni_role_info_p(arg1);
        }
    }
}

/*

	Total time: 2268 ms
	 synthetic 
*/