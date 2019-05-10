package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.nl.document_disambiguation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class concept_tagger
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.concept_tagger";
  public static final String myFingerPrint = "7ae1c8966d3085a508cb8ac25bc7ace6ace2138f70cf45a00309fc869c008938";
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 831L)
  public static SubLSymbol $default_sentence_string_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 896L)
  public static SubLSymbol $default_sentence_string_parser$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 958L)
  private static SubLSymbol $concept_tagger_lexical_generality_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 5745L)
  private static SubLSymbol $html_concept_filters$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 9827L)
  public static SubLSymbol $doc_tagger_default_style$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15567L)
  private static SubLSymbol $browser_tagging_lexicons$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22612L)
  public static SubLSymbol $cb_tag_document_to_html$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22712L)
  public static SubLSymbol $cb_tag_document_to_xml$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLSymbol $dtp_tag_concepts_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 27690L)
  private static SubLSymbol $tag_concepts_quicklyP$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32642L)
  private static SubLSymbol $registered_concept_taggers$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLSymbol $dtp_concept_tagger$;
  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 43211L)
  private static SubLSymbol $concept_tagger_test_docs$;
  private static final SubLInteger $int0$400000;
  private static final SubLSymbol $sym1$TAG_CONCEPTS;
  private static final SubLSymbol $sym2$DOCUMENT_P;
  private static final SubLSymbol $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P;
  private static final SubLSymbol $sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P;
  private static final SubLSymbol $sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$LEXICON;
  private static final SubLSymbol $kw8$FILTER;
  private static final SubLSymbol $sym9$GET_NEXT_SENTENCE_ANNOTATION;
  private static final SubLSymbol $sym10$ITERATOR_P;
  private static final SubLSymbol $sym11$ANNOTATION_COMPLETE_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$ITER;
  private static final SubLSymbol $sym14$CLET;
  private static final SubLSymbol $sym15$WITH_SBHL_RESOURCED_MARKING_SPACES;
  private static final SubLSymbol $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE;
  private static final SubLSymbol $sym17$WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE;
  private static final SubLSymbol $sym18$DO_ITERATOR;
  private static final SubLSymbol $sym19$ALL_TAGGED_CONCEPTS;
  private static final SubLString $str20$d__;
  private static final SubLString $str21$p__;
  private static final SubLString $str22$s__;
  private static final SubLString $str23$w_A_A_A_A__A;
  private static final SubLString $str24$_A_A;
  private static final SubLString $str25$__;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$XML_TAG_DOCUMENT;
  private static final SubLSymbol $kw28$XML_HANDLER;
  private static final SubLSymbol $sym29$TAG_DOCUMENT_XML;
  private static final SubLString $str30$utf_8;
  private static final SubLString $str31$document;
  private static final SubLString $str32$xmlns;
  private static final SubLString $str33$http___ws_opencyc_org_xsd_TextPro;
  private static final SubLSymbol $kw34$UNINITIALIZED;
  private static final SubLString $str35$meta;
  private static final SubLString $str36$title;
  private static final SubLString $str37$uri;
  private static final SubLString $str38$tagset;
  private static final SubLString $str39$element;
  private static final SubLString $str40$start;
  private static final SubLString $str41$source;
  private static final SubLString $str42$___CDATA__A___;
  private static final SubLSymbol $sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM;
  private static final SubLString $str44$sense;
  private static final SubLString $str45$xmlns_concepts;
  private static final SubLString $str46$http___ws_opencyc_org_xsd_CycConc;
  private static final SubLString $str47$concept;
  private static final SubLString $str48$concepts_externalId;
  private static final SubLString $str49$concepts_preferredNl;
  private static final SubLString $str50$xml_lang;
  private static final SubLString $str51$en;
  private static final SubLString $str52$concepts_cycl;
  private static final SubLString $str53$Predicate;
  private static final SubLString $str54$Collection;
  private static final SubLString $str55$Individual;
  private static final SubLString $str56$concepts_conceptType;
  private static final SubLString $str57$type;
  private static final SubLString $str58$_cycl__font_family__sans_serif__c;
  private static final SubLString $str59$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str60$_meta_http_equiv__X_UA_Compatible;
  private static final SubLString $str61$;
  private static final SubLSymbol $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT;
  private static final SubLSymbol $sym63$HTML_TAG_DOCUMENT;
  private static final SubLSymbol $kw64$HTML_HANDLER;
  private static final SubLSymbol $sym65$HTML_TAG_DOCUMENT_INT;
  private static final SubLString $str66$_A;
  private static final SubLString $str67$__;
  private static final SubLSymbol $sym68$WEIGHT_;
  private static final SubLSymbol $sym69$GET_NL_INTERP_WEIGHT;
  private static final SubLSymbol $sym70$GET_NL_INTERP_CYCL;
  private static final SubLString $str71$_;
  private static final SubLString $str72$cycl;
  private static final SubLString $str73$_S;
  private static final SubLString $str74$weight;
  private static final SubLString $str75$__A;
  private static final SubLString $str76$_;
  private static final SubLString $str77$filter_id;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$FIRST;
  private static final SubLSymbol $sym80$ISOLATE;
  private static final SubLSymbol $kw81$PREFERRED;
  private static final SubLSymbol $sym82$SET_LEARNERS;
  private static final SubLSymbol $sym83$STANFORD_NER_LEARN;
  private static final SubLSymbol $sym84$ADD_LEARNER;
  private static final SubLSymbol $sym85$NUMBER_LEARN;
  private static final SubLSymbol $sym86$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $sym87$ADD_CONCEPT_FILTER_SPEC;
  private static final SubLSymbol $sym88$IGNORE_CACHE;
  private static final SubLSymbol $sym89$SET_BASE_MT;
  private static final SubLSymbol $sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS;
  private static final SubLSymbol $kw91$USE_NER;
  private static final SubLString $str92$NIL;
  private static final SubLSymbol $kw93$EXHAUSTIVE_TAGGING;
  private static final SubLSymbol $kw94$IGNORE_POS_TAGGER;
  private static final SubLSymbol $kw95$SENTENCIFY;
  private static final SubLSymbol $kw96$LEXICAL_MT;
  private static final SubLSymbol $kw97$CASE_SENSITIVITY;
  private static final SubLSymbol $kw98$OFF;
  private static final SubLSymbol $kw99$CONCEPT_FILTER;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$ANNOTATE_SPECS;
  private static final SubLSymbol $kw102$ANNOTATE_INSTANCES;
  private static final SubLSymbol $kw103$MIN_LEXICAL_STRENGTH;
  private static final SubLList $list104;
  private static final SubLObject $const105$ContextuallyDependentLexicalMappi;
  private static final SubLList $list106;
  private static final SubLObject $const107$PrimaryLexicalMapping;
  private static final SubLSymbol $kw108$VANISHINGLY_RARE;
  private static final SubLString $str109$inputText;
  private static final SubLString $str110$use_ner;
  private static final SubLString $str111$exhaustive_tagging;
  private static final SubLString $str112$ignore_pos_tagger;
  private static final SubLString $str113$sentencify;
  private static final SubLString $str114$lexicalMt;
  private static final SubLSymbol $sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC;
  private static final SubLSymbol $sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC;
  private static final SubLSymbol $sym117$EXHAUSTIVE_CONCEPT_TAGGER;
  private static final SubLSymbol $sym118$SIMPLE_CONCEPT_TAGGER;
  private static final SubLSymbol $sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER;
  private static final SubLSymbol $sym120$POS_TAGGING_CONCEPT_TAGGER;
  private static final SubLString $str121$disambiguate;
  private static final SubLString $str122$lexicalStrength;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLList $list125;
  private static final SubLString $str126$vanishingly_rare;
  private static final SubLString $str127$allowSpecs;
  private static final SubLSymbol $sym128$READ_MULTIPLE_TERMS_FROM_STRING;
  private static final SubLString $str129$allowInstances;
  private static final SubLSymbol $sym130$CB_GUESS_TERM;
  private static final SubLString $str131$caseSensitivity;
  private static final SubLString $str132$preferred;
  private static final SubLList $list133;
  private static final SubLSymbol $kw134$ON;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLString $str137$Invalid_argument_for_case_sensiti;
  private static final SubLString $str138$text_html;
  private static final SubLString $str139$text_xml;
  private static final SubLSymbol $sym140$CB_TAG_DOCUMENT_HANDLER;
  private static final SubLSymbol $sym141$CB_XML_TAG_DOCUMENT;
  private static final SubLString $str142$Concept_Tagger_Web_Service;
  private static final SubLSymbol $kw143$CB_CYC;
  private static final SubLSymbol $kw144$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw145$SHA1;
  private static final SubLString $str146$yui_skin_sam;
  private static final SubLString $str147$reloadFrameButton;
  private static final SubLString $str148$button;
  private static final SubLString $str149$reload;
  private static final SubLString $str150$Refresh_Frames;
  private static final SubLString $str151$post;
  private static final SubLString $str152$cb_tag_document_handler;
  private static final SubLInteger $int153$100;
  private static final SubLString $str154$virtual;
  private static final SubLString $str155$Tag_to__;
  private static final SubLList $list156;
  private static final SubLString $str157$Lexical_Mt__optional_;
  private static final SubLInteger $int158$60;
  private static final SubLString $str159$_Use_Named_Entity_Recognizer;
  private static final SubLString $str160$t;
  private static final SubLString $str161$_Ignore_Part_of_speech_tagger;
  private static final SubLString $str162$_Obey_computed_sentence_boundarie;
  private static final SubLString $str163$Should_complex_phrases_also_get_i;
  private static final SubLString $str164$_Tag_Exhaustively;
  private static final SubLString $str165$_Disambiguation__;
  private static final SubLSymbol $kw166$T;
  private static final SubLString $str167$rule;
  private static final SubLString $str168$Maximal;
  private static final SubLSymbol $kw169$NIL;
  private static final SubLString $str170$none;
  private static final SubLString $str171$None;
  private static final SubLString $str172$_Minimum_Lexical_Strength__;
  private static final SubLString $str173$primary;
  private static final SubLString $str174$Use_only_primary_mappings;
  private static final SubLString $str175$context_sensitive;
  private static final SubLString $str176$Exclude_vanishingly_rare_mappings;
  private static final SubLString $str177$Use_all_lexical_mappings;
  private static final SubLString $str178$_Extract_Propositional_Informatio;
  private static final SubLString $str179$extract_info;
  private static final SubLString $str180$Tag_to_XML;
  private static final SubLString $str181$Tag_to_HTML;
  private static final SubLSymbol $sym182$TAG_CONCEPTS_ITERATOR_STATE;
  private static final SubLSymbol $sym183$TAG_CONCEPTS_ITERATOR_STATE_P;
  private static final SubLList $list184;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLList $list187;
  private static final SubLSymbol $sym188$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym189$TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO;
  private static final SubLSymbol $sym192$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO;
  private static final SubLSymbol $sym193$TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT;
  private static final SubLSymbol $sym194$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT;
  private static final SubLSymbol $sym195$TAG_CONCEPTS_ITERATOR_STATE_LEXICON;
  private static final SubLSymbol $sym196$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON;
  private static final SubLSymbol $sym197$TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER;
  private static final SubLSymbol $sym198$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER;
  private static final SubLSymbol $sym199$TAG_CONCEPTS_ITERATOR_STATE_FILTER;
  private static final SubLSymbol $sym200$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER;
  private static final SubLSymbol $sym201$TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC;
  private static final SubLSymbol $sym202$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC;
  private static final SubLSymbol $sym203$TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
  private static final SubLSymbol $sym204$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT;
  private static final SubLSymbol $kw205$SENTENCES_TO_DO;
  private static final SubLSymbol $kw206$DOCUMENT;
  private static final SubLSymbol $kw207$SENSE_TAGGER;
  private static final SubLSymbol $kw208$OUTPUT_SPEC;
  private static final SubLSymbol $kw209$PREPARED_SENTENCE_OUTPUT;
  private static final SubLString $str210$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw211$BEGIN;
  private static final SubLSymbol $sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE;
  private static final SubLSymbol $kw213$SLOT;
  private static final SubLSymbol $kw214$END;
  private static final SubLSymbol $sym215$VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD;
  private static final SubLSymbol $sym216$LEARN;
  private static final SubLSymbol $sym217$YIELD;
  private static final SubLSymbol $sym218$GET_LEXES;
  private static final SubLSymbol $sym219$GET_CATEGORY;
  private static final SubLSymbol $kw220$INTERPS;
  private static final SubLSymbol $kw221$CYC_POS;
  private static final SubLSymbol $kw222$LEX_ENTRIES;
  private static final SubLSymbol $kw223$STRING;
  private static final SubLSymbol $sym224$GET_STRING;
  private static final SubLSymbol $kw225$CATEGORY;
  private static final SubLSymbol $kw226$INFO;
  private static final SubLSymbol $sym227$PARSE;
  private static final SubLSymbol $sym228$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym229$LEXIFY;
  private static final SubLString $str230$_______________Error_____________;
  private static final SubLString $str231$Caught__S_while_processing__S__;
  private static final SubLSymbol $sym232$CONCEPT_TAGGER;
  private static final SubLSymbol $sym233$CONCEPT_TAGGER_P;
  private static final SubLList $list234;
  private static final SubLList $list235;
  private static final SubLList $list236;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$PRINT_CONCEPT_TAGGER;
  private static final SubLSymbol $sym239$CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list240;
  private static final SubLSymbol $sym241$CONCEPT_TAGGER_NAME;
  private static final SubLSymbol $sym242$_CSETF_CONCEPT_TAGGER_NAME;
  private static final SubLSymbol $sym243$CONCEPT_TAGGER_TAG_METHOD;
  private static final SubLSymbol $sym244$_CSETF_CONCEPT_TAGGER_TAG_METHOD;
  private static final SubLSymbol $sym245$CONCEPT_TAGGER_LEXICON_METHOD;
  private static final SubLSymbol $sym246$_CSETF_CONCEPT_TAGGER_LEXICON_METHOD;
  private static final SubLSymbol $kw247$NAME;
  private static final SubLSymbol $kw248$TAG_METHOD;
  private static final SubLSymbol $kw249$LEXICON_METHOD;
  private static final SubLSymbol $sym250$MAKE_CONCEPT_TAGGER;
  private static final SubLSymbol $sym251$VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD;
  private static final SubLString $str252$__Concept_Tagger__A_;
  private static final SubLString $str253$_S_is_not_a_registered_concept_ta;
  private static final SubLString $str254$_S_is_not_a_registered_concept_ta;
  private static final SubLSymbol $sym255$LEXIFY_SENTENCE;
  private static final SubLSymbol $sym256$LEXIFY_SENTENCE_EXHAUSTIVELY;
  private static final SubLSymbol $sym257$GET_CONCEPT_FILTER_SPECS;
  private static final SubLSymbol $sym258$GET;
  private static final SubLSymbol $sym259$TAG_CONCEPTS_USING_POS_TAGS;
  private static final SubLSymbol $sym260$NEW_TERM_LEXICON;
  private static final SubLSymbol $sym261$TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS;
  private static final SubLSymbol $sym262$TAG_CONCEPTS_FAST;
  private static final SubLSymbol $sym263$TAG_CONCEPTS_FAST_EXHAUSTIVELY;
  private static final SubLSymbol $sym264$TERM_LEXICON;
  private static final SubLSymbol $sym265$ALLOW_PREDICATE;
  private static final SubLObject $const266$preferredNameString;
  private static final SubLSymbol $sym267$EXCLUDE_PREDICATE;
  private static final SubLObject $const268$ksTermString;
  private static final SubLSymbol $sym269$EXCLUDE_POS;
  private static final SubLObject $const270$ClosedClassWord;
  private static final SubLSymbol $sym271$ALLOW_MT;
  private static final SubLObject $const272$RelationParaphraseMt;
  private static final SubLSymbol $sym273$STANFORD_NER_DATE_LEARN;
  private static final SubLSymbol $kw274$WARN;
  private static final SubLList $list275;
  private static final SubLSymbol $kw276$DENOT;
  private static final SubLSymbol $kw277$CYCL;
  private static final SubLSymbol $kw278$PHRASE_TYPES;
  private static final SubLSymbol $kw279$INFLECTIONS;
  private static final SubLSymbol $kw280$PRAGMATICS;
  private static final SubLObject $const281$InferencePSC;
  private static final SubLSymbol $sym282$PARSING_REWRITE_OF_INVERSE_;
  private static final SubLSymbol $kw283$TRIE_ENTRY;
  private static final SubLSymbol $kw284$COMPLEX;
  private static final SubLSymbol $kw285$INTERP_SPEC;
  private static final SubLSymbol $kw286$SIMPLE;
  private static final SubLSymbol $sym287$INTERSECTION;
  private static final SubLSymbol $kw288$DEFAULT;
  private static final SubLObject $const289$ImplementationConstant;
  private static final SubLSymbol $sym290$KEYWORDP;
  private static final SubLObject $const291$InstanceFn;
  private static final SubLObject $const292$Collection;
  private static final SubLString $str293$T;
  private static final SubLList $list294;
  private static final SubLList $list295;
  private static final SubLString $str296$doc_string;
  private static final SubLList $list297;
  private static final SubLSymbol $sym298$FORGET;
  private static final SubLSymbol $kw299$OUTPUT;
  private static final SubLString $str300$Unable_to_open__S;
  private static final SubLList $list301;
  private static final SubLSymbol $sym302$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS;
  private static final SubLSymbol $kw303$TEST;
  private static final SubLSymbol $sym304$TERM_ABSENT_FROM_DOC_INTERPS;
  private static final SubLSymbol $kw305$OWNER;
  private static final SubLSymbol $kw306$CLASSES;
  private static final SubLSymbol $kw307$KB;
  private static final SubLSymbol $kw308$FULL;
  private static final SubLSymbol $kw309$WORKING_;
  private static final SubLList $list310;
  private static final SubLSymbol $sym311$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS;
  private static final SubLSymbol $sym312$TERM_IN_DOC_INTERPS;
  private static final SubLList $list313;
  private static final SubLSymbol $sym314$TRUE;
  private static final SubLList $list315;
  private static final SubLList $list316;

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 1116L)
  public static SubLObject tag_concepts(final SubLObject v_document, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    enforceType( v_document, $sym2$DOCUMENT_P );
    enforceType( optional_arg_plist, $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P );
    final SubLObject augmented_plist = augment_tag_concepts_optional_arg_plist_with_defaults( optional_arg_plist );
    SubLObject sentences = NIL;
    final SubLObject vector_var = document.document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$1;
    SubLObject backwardP_var_$2;
    SubLObject length_$3;
    SubLObject v_iteration_$4;
    SubLObject element_num_$5;
    SubLObject sentence;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$1 = document.paragraph_sentences( paragraph );
      backwardP_var_$2 = NIL;
      for( length_$3 = Sequences.length( vector_var_$1 ), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL( length_$3 ); v_iteration_$4 = Numbers.add( v_iteration_$4, ONE_INTEGER ) )
      {
        element_num_$5 = ( ( NIL != backwardP_var_$2 ) ? Numbers.subtract( length_$3, v_iteration_$4, ONE_INTEGER ) : v_iteration_$4 );
        sentence = Vectors.aref( vector_var_$1, element_num_$5 );
        sentences = ConsesLow.cons( sentence, sentences );
      }
    }
    sentences = Sequences.nreverse( sentences );
    return iteration.new_iterator( new_tag_concepts_iterator_state( sentences, v_document, augmented_plist ), $sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P, $sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 2070L)
  public static SubLObject tag_concepts_optional_args_p(final SubLObject obj)
  {
    if( NIL == list_utilities.plist_restricted_to_indicatorsP( obj, $list6 ) )
    {
      return NIL;
    }
    if( NIL == list_utilities.plist_has_keyP( obj, $kw7$LEXICON ) )
    {
      return T;
    }
    if( NIL == term_lexicon.term_lexicon_p( conses_high.getf( obj, $kw7$LEXICON, UNPROVIDED ) ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.plist_has_keyP( obj, $kw8$FILTER ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 2823L)
  public static SubLObject get_next_sentence_annotation(final SubLObject iterator)
  {
    enforceType( iterator, $sym10$ITERATOR_P );
    return iteration.iteration_next( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3070L)
  public static SubLObject annotation_completeP(final SubLObject iterator)
  {
    enforceType( iterator, $sym10$ITERATOR_P );
    return iteration.iteration_done( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3295L)
  public static SubLObject do_tagged_concepts_results(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result = NIL;
    SubLObject v_document = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    v_document = current.first();
    current = current.rest();
    final SubLObject optional_arg_plist = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list12 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject iter = $sym13$ITER;
      return ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( iter, ConsesLow.list( $sym1$TAG_CONCEPTS, v_document, optional_arg_plist ) ) ), ConsesLow.list( $sym15$WITH_SBHL_RESOURCED_MARKING_SPACES,
          SIX_INTEGER, ConsesLow.list( $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE, ConsesLow.list( $sym17$WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE, ConsesLow.listS( $sym18$DO_ITERATOR, ConsesLow.list( result, iter ),
              ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3686L)
  public static SubLObject all_tagged_concepts(final SubLObject v_document, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_document, $sym2$DOCUMENT_P );
    enforceType( optional_arg_plist, $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P );
    SubLObject result = NIL;
    final SubLObject iter = tag_concepts( v_document, optional_arg_plist );
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$7 = concept_filter.$concept_filter_memoization_state$.currentBinding( thread );
          try
          {
            concept_filter.$concept_filter_memoization_state$.bind( memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject return_value = iteration.iteration_next( iter );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                SubLObject cdolist_list_var = extract_cycl_from_concept_tagger_output( return_value );
                SubLObject cycl = NIL;
                cycl = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  final SubLObject item_var = cycl;
                  if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var, result );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  cycl = cdolist_list_var.first();
                }
              }
            }
          }
          finally
          {
            concept_filter.$concept_filter_memoization_state$.rebind( _prev_bind_0_$7, thread );
          }
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
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$6, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 4313L)
  public static SubLObject extract_cycl_from_concept_tagger_output(final SubLObject concept_tagger_output)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( concept_tagger_output );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = Sequences.cconcatenate( document.word_cycls( word ), result );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 4756L)
  public static SubLObject tagged_concepts_for_disambiguator(final SubLObject v_document, SubLObject optional_arg_plist)
  {
    if( optional_arg_plist == UNPROVIDED )
    {
      optional_arg_plist = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject output_string = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject iter = tag_concepts( v_document, optional_arg_plist );
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            PrintLow.format( s, $str20$d__ );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject sentence = iteration.iteration_next( iter );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                final SubLObject paragraph = document.sentence_mother( sentence );
                if( document.paragraph_get( paragraph, ZERO_INTEGER ).eql( sentence ) )
                {
                  PrintLow.format( s, $str21$p__ );
                }
                PrintLow.format( s, $str22$s__ );
                SubLObject cdolist_list_var = document.sentence_yield_exhaustive( sentence );
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  PrintLow.format( s, $str23$w_A_A_A_A__A, new SubLObject[] { Characters.CHAR_tab, document.word_string( word ), Characters.CHAR_tab, document.word_category( word ), Characters.CHAR_tab
                  } );
                  SubLObject cdolist_list_var_$10 = document.word_cycls( word );
                  SubLObject cycl = NIL;
                  cycl = cdolist_list_var_$10.first();
                  while ( NIL != cdolist_list_var_$10)
                  {
                    PrintLow.format( s, $str24$_A_A, cycl, Characters.CHAR_tab );
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    cycl = cdolist_list_var_$10.first();
                  }
                  PrintLow.format( s, $str25$__ );
                  cdolist_list_var = cdolist_list_var.rest();
                  word = cdolist_list_var.first();
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$9, thread );
        }
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
      }
      output_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7123L)
  public static SubLObject xml_tag_document(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject doc = get_tagged_document_from_html_args( args );
    return xml_tag_document_int( doc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7344L)
  public static SubLObject tag_document_xml(final SubLObject text, SubLObject params)
  {
    if( params == UNPROVIDED )
    {
      params = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject doc = get_tagged_document_from_params( unicode_nauts.convert_unicode_nauts_to_utf8_strings( text ), params );
    SubLObject xml_string = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
    try
    {
      html_macros.$html_stream$.bind( NIL, thread );
      try
      {
        html_macros.$html_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        xml_tag_document_int( doc );
        xml_string = streams_high.get_output_stream_string( html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED );
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
      html_macros.$html_stream$.rebind( _prev_bind_0, thread );
    }
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7700L)
  public static SubLObject xml_tag_document_int(final SubLObject doc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_assumed_validP$.bind( T, thread );
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_utilities.xml_header( xml_utilities.$xml_version$.getDynamicValue( thread ), $str30$utf_8, UNPROVIDED );
      xml_utilities.xml_terpri();
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            try
            {
              final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str31$document, ConsesLow.list( $str32$xmlns, $str33$http___ws_opencyc_org_xsd_TextPro ), NIL, NIL, $kw34$UNINITIALIZED );
                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                  try
                  {
                    final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                    try
                    {
                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                          thread );
                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                      xml_utilities.xml_start_tag_internal( $str35$meta, NIL, NIL, NIL, $kw34$UNINITIALIZED );
                      final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                      try
                      {
                        xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                        final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str36$title, NIL, T, NIL, $kw34$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$20, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$17, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$19, thread );
                        }
                        final SubLObject _prev_bind_0_$21 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str37$uri, NIL, T, NIL, $kw34$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$22, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$21, thread );
                        }
                      }
                      finally
                      {
                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$18, thread );
                      }
                    }
                    finally
                    {
                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$16, thread );
                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$17, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      xml_utilities.xml_terpri();
                      xml_utilities.xml_end_tag_internal( $str35$meta );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
                    }
                  }
                  try
                  {
                    final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                    try
                    {
                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                          thread );
                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                      xml_utilities.xml_start_tag_internal( $str38$tagset, NIL, NIL, NIL, $kw34$UNINITIALIZED );
                      final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                      try
                      {
                        xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                        xml_utilities.xml_terpri();
                        final SubLObject vector_var = document.document_paragraphs( doc );
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject paragraph;
                        SubLObject vector_var_$32;
                        SubLObject backwardP_var_$33;
                        SubLObject length_$34;
                        SubLObject v_iteration_$35;
                        SubLObject element_num_$36;
                        SubLObject sentence;
                        SubLObject cdolist_list_var;
                        SubLObject word;
                        SubLObject _prev_bind_0_$26;
                        SubLObject _prev_bind_1_$20;
                        SubLObject _prev_bind_0_$27;
                        SubLObject source_attrs;
                        SubLObject _prev_bind_0_$28;
                        SubLObject _prev_bind_1_$21;
                        SubLObject _prev_bind_0_$29;
                        SubLObject _prev_bind_0_$30;
                        SubLObject _values2;
                        SubLObject cdolist_list_var_$44;
                        SubLObject interp;
                        SubLObject _prev_bind_0_$31;
                        SubLObject _values3;
                        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                        {
                          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                          paragraph = Vectors.aref( vector_var, element_num );
                          vector_var_$32 = document.paragraph_sentences( paragraph );
                          backwardP_var_$33 = NIL;
                          for( length_$34 = Sequences.length( vector_var_$32 ), v_iteration_$35 = NIL, v_iteration_$35 = ZERO_INTEGER; v_iteration_$35.numL( length_$34 ); v_iteration_$35 = Numbers.add( v_iteration_$35,
                              ONE_INTEGER ) )
                          {
                            element_num_$36 = ( ( NIL != backwardP_var_$33 ) ? Numbers.subtract( length_$34, v_iteration_$35, ONE_INTEGER ) : v_iteration_$35 );
                            sentence = Vectors.aref( vector_var_$32, element_num_$36 );
                            cdolist_list_var = document.sentence_yield_exhaustive( sentence );
                            word = NIL;
                            word = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              try
                              {
                                _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str39$element, NIL, NIL, NIL, $kw34$UNINITIALIZED );
                                  _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                                    xml_utilities.xml_terpri();
                                    source_attrs = ConsesLow.list( $str40$start, document.word_offset( word ) );
                                    try
                                    {
                                      _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                      _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                      try
                                      {
                                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                            thread ) ), thread );
                                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                        xml_utilities.xml_start_tag_internal( $str41$source, source_attrs, NIL, NIL, $kw34$UNINITIALIZED );
                                        _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                        try
                                        {
                                          xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                                          PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str42$___CDATA__A___, document.word_string( word ) );
                                        }
                                        finally
                                        {
                                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$29, thread );
                                        }
                                      }
                                      finally
                                      {
                                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$21, thread );
                                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$28, thread );
                                      }
                                    }
                                    finally
                                    {
                                      _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal( $str41$source );
                                        Values.restoreValuesFromVector( _values2 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                                      }
                                    }
                                    xml_utilities.xml_terpri();
                                    cdolist_list_var_$44 = document.word_interps( word );
                                    interp = NIL;
                                    interp = cdolist_list_var_$44.first();
                                    while ( NIL != cdolist_list_var_$44)
                                    {
                                      serialize_xml_sense_tag_for_cycl_term( nl_api_datastructures.get_nl_interp_cycl( interp ) );
                                      cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                      interp = cdolist_list_var_$44.first();
                                    }
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$27, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$26, thread );
                                }
                              }
                              finally
                              {
                                _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  _values3 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str39$element );
                                  Values.restoreValuesFromVector( _values3 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                                }
                              }
                              xml_utilities.xml_terpri();
                              cdolist_list_var = cdolist_list_var.rest();
                              word = cdolist_list_var.first();
                            }
                          }
                        }
                      }
                      finally
                      {
                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$25, thread );
                      }
                    }
                    finally
                    {
                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$19, thread );
                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$24, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values4 = Values.getValuesAsVector();
                      xml_utilities.xml_terpri();
                      xml_utilities.xml_end_tag_internal( $str38$tagset );
                      Values.restoreValuesFromVector( _values4 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
                    }
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$15, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$15, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str31$document );
                Values.restoreValuesFromVector( _values5 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values6 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values6 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$14, thread );
        }
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$14, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$13, thread );
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
      lexicon_macros.$nl_trie_assumed_validP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 8692L)
  public static SubLObject serialize_xml_sense_tag_for_cycl_term(final SubLObject cycl_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ids = misc_kb_utilities.get_cyc_term_external_identifiers( cycl_term );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str44$sense, ConsesLow.list( $str45$xmlns_concepts, $str46$http___ws_opencyc_org_xsd_CycConc ), NIL, NIL, $kw34$UNINITIALIZED );
        final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
          xml_utilities.xml_terpri();
          try
          {
            final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$51 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str47$concept, ConsesLow.list( $str37$uri, owl_cycl_to_xml.owl_opencyc_latest_uri_for_term( cycl_term ) ), NIL, NIL, $kw34$UNINITIALIZED );
              final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                xml_utilities.xml_terpri();
                try
                {
                  final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$52 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str48$concepts_externalId, NIL, NIL, NIL, $kw34$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                      xml_utilities.xml_write_wXescaped_special_chars( kb_utilities.compact_hl_external_id_string( cycl_term ) );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$53, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$52, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$52, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str48$concepts_externalId );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
                  }
                }
                xml_utilities.xml_terpri();
                try
                {
                  final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$53 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str49$concepts_preferredNl, ConsesLow.list( $str50$xml_lang, $str51$en ), NIL, NIL, $kw34$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                      xml_utilities.xml_write_wXescaped_special_chars( unicode_nauts.convert_unicode_nauts_to_utf8_strings( conses_high.third( ids ) ) );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$56, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$53, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$55, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str49$concepts_preferredNl );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                  }
                }
                xml_utilities.xml_terpri();
                try
                {
                  final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str52$concepts_cycl, ConsesLow.list( $str50$xml_lang, $str51$en ), NIL, NIL, $kw34$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                      xml_utilities.xml_cdata( print_high.prin1_to_string( ids.first() ) );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$59, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$54, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$58, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str52$concepts_cycl );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$60, thread );
                  }
                }
                xml_utilities.xml_terpri();
                final SubLObject concept_type = ( NIL != fort_types_interface.predicate_p( cycl_term ) ) ? $str53$Predicate
                    : ( ( NIL != fort_types_interface.collection_p( cycl_term ) ) ? $str54$Collection : $str55$Individual );
                final SubLObject _prev_bind_0_$61 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str56$concepts_conceptType, ConsesLow.list( $str57$type, concept_type ), T, NIL, $kw34$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$62 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw34$UNINITIALIZED, thread );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$62, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$55, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$61, thread );
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$51, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$51, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$50, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str47$concept );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$49, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str44$sense );
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    xml_utilities.xml_terpri();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 13595L)
  public static SubLObject html_tag_document(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str60$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw34$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str61$ );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( $str61$ );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_style_head$.getGlobalValue() );
          html_utilities.html_princ( $doc_tagger_default_style$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_style_tail$.getGlobalValue() );
          html_tag_document_int( args );
          if( $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec() )
          {
            Functions.funcall( $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT, args );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$69, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 13915L)
  public static SubLObject html_tag_document_int(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject doc = get_tagged_document_from_html_args( args );
    return html_display_tagger_result( doc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 14084L)
  public static SubLObject html_display_tagger_result(final SubLObject doc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_assumed_validP$.bind( T, thread );
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_1_$72 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0_$72 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            final SubLObject vector_var = document.document_paragraphs( doc );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject para;
            SubLObject vector_var_$74;
            SubLObject backwardP_var_$75;
            SubLObject length_$76;
            SubLObject v_iteration_$77;
            SubLObject element_num_$78;
            SubLObject sentence;
            SubLObject cdolist_list_var;
            SubLObject word;
            SubLObject list_var;
            SubLObject interp;
            SubLObject interp_num;
            SubLObject _prev_bind_0_$73;
            SubLObject _prev_bind_0_$74;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              para = Vectors.aref( vector_var, element_num );
              html_utilities.html_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_paragraph_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_paragraph_tail$.getGlobalValue() );
              vector_var_$74 = document.paragraph_sentences( para );
              backwardP_var_$75 = NIL;
              for( length_$76 = Sequences.length( vector_var_$74 ), v_iteration_$77 = NIL, v_iteration_$77 = ZERO_INTEGER; v_iteration_$77.numL( length_$76 ); v_iteration_$77 = Numbers.add( v_iteration_$77,
                  ONE_INTEGER ) )
              {
                element_num_$78 = ( ( NIL != backwardP_var_$75 ) ? Numbers.subtract( length_$76, v_iteration_$77, ONE_INTEGER ) : v_iteration_$77 );
                sentence = Vectors.aref( vector_var_$74, element_num_$78 );
                cdolist_list_var = document.sentence_yield_exhaustive( sentence );
                word = NIL;
                word = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str66$_A, document.word_string( word ) );
                  if( NIL != document.word_cycls( word ) )
                  {
                    html_utilities.html_princ( $str67$__ );
                    list_var = NIL;
                    interp = NIL;
                    interp_num = NIL;
                    list_var = Sequences.remove_duplicates( Sort.sort( conses_high.copy_list( document.word_interps( word ) ), $sym68$WEIGHT_, $sym69$GET_NL_INTERP_WEIGHT ), EQUAL, $sym70$GET_NL_INTERP_CYCL, UNPROVIDED,
                        UNPROVIDED );
                    interp = list_var.first();
                    for( interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add( ONE_INTEGER, interp_num ) )
                    {
                      if( !interp_num.eql( ZERO_INTEGER ) )
                      {
                        html_utilities.html_princ( $str71$_ );
                      }
                      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str72$cycl );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str73$_S, cycl_utilities.hl_to_el( nl_api_datastructures.get_nl_interp_cycl( interp ) ) );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
                      if( NIL != nl_api_datastructures.get_nl_interp_weight( interp ) )
                      {
                        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str74$weight );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str75$__A, nl_api_datastructures.get_nl_interp_weight( interp ) );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
                      }
                    }
                    html_utilities.html_princ( $str76$_ );
                  }
                  if( NIL == document.no_space_before_following_wordP( word ) )
                  {
                    html_utilities.html_princ( $str71$_ );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  word = cdolist_list_var.first();
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$75, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0_$72, thread );
        }
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$72, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$71, thread );
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
      lexicon_macros.$nl_trie_assumed_validP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15116L)
  public static SubLObject get_concept_filter_from_html_args(final SubLObject args)
  {
    final SubLObject filter_id = html_utilities.html_extract_input( $str77$filter_id, args );
    SubLObject filter = $list78;
    final SubLObject filter_item = Sequences.find( filter_id, $html_concept_filters$.getGlobalValue(), EQUALP, $sym79$FIRST, UNPROVIDED, UNPROVIDED );
    if( NIL != filter_item )
    {
      filter = conses_high.third( filter_item );
    }
    return filter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15648L)
  public static SubLObject clear_browser_tagging_lexicons()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $browser_tagging_lexicons$.getDynamicValue( thread ) ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject lexicon = thread.secondMultipleValue();
      thread.resetMultipleValues();
      methods.funcall_instance_method_with_0_args( lexicon, $sym80$ISOLATE );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    $browser_tagging_lexicons$.setDynamicValue( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
    return $browser_tagging_lexicons$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15899L)
  public static SubLObject get_browser_tagging_lexicon(final SubLObject ner, final SubLObject filter_specs, SubLObject case_sensitivity, SubLObject lexical_mt)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = $kw81$PREFERRED;
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lex_dictionary_key = ConsesLow.list( ner, filter_specs, case_sensitivity, lexical_mt );
    SubLObject lexicon = dictionary.dictionary_lookup( $browser_tagging_lexicons$.getDynamicValue( thread ), lex_dictionary_key, UNPROVIDED );
    if( NIL == lexicon )
    {
      lexicon = make_default_concept_tagger_lexicon();
      methods.funcall_instance_method_with_1_args( lexicon, $sym82$SET_LEARNERS, ( NIL != ner ) ? ConsesLow.list( $sym83$STANFORD_NER_LEARN ) : NIL );
      methods.funcall_instance_method_with_1_args( lexicon, $sym84$ADD_LEARNER, $sym85$NUMBER_LEARN );
      methods.funcall_instance_method_with_1_args( lexicon, $sym86$SET_CASE_SENSITIVITY, case_sensitivity );
      SubLObject cdolist_list_var = filter_specs;
      SubLObject filter_spec = NIL;
      filter_spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym87$ADD_CONCEPT_FILTER_SPEC, filter_spec );
        cdolist_list_var = cdolist_list_var.rest();
        filter_spec = cdolist_list_var.first();
      }
      methods.funcall_instance_method_with_0_args( lexicon, $sym88$IGNORE_CACHE );
      if( NIL != lexical_mt )
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym89$SET_BASE_MT, lexical_mt );
      }
      dictionary.dictionary_enter( $browser_tagging_lexicons$.getDynamicValue( thread ), lex_dictionary_key, lexicon );
    }
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 16732L)
  public static SubLObject get_tagged_document_from_params(final SubLObject text, final SubLObject params)
  {
    return get_tagged_document( text, conses_high.getf( params, $kw91$USE_NER, $str92$NIL ), conses_high.getf( params, $kw93$EXHAUSTIVE_TAGGING, T ), conses_high.getf( params, $kw94$IGNORE_POS_TAGGER, UNPROVIDED ),
        conses_high.getf( params, $kw95$SENTENCIFY, UNPROVIDED ), conses_high.getf( params, $kw96$LEXICAL_MT, UNPROVIDED ), conses_high.getf( params, $kw97$CASE_SENSITIVITY, $kw98$OFF ), ConsesLow.list(
            get_lexical_strength_disambiguator( params ) ), conses_high.getf( params, $kw99$CONCEPT_FILTER, $list100 ), conses_high.getf( params, $kw101$ANNOTATE_SPECS, UNPROVIDED ), conses_high.getf( params,
                $kw102$ANNOTATE_INSTANCES, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 17371L)
  public static SubLObject get_lexical_strength_disambiguator(final SubLObject params)
  {
    final SubLObject lexical_strength_value = conses_high.getf( params, $kw103$MIN_LEXICAL_STRENGTH, UNPROVIDED );
    if( NIL != subl_promotions.memberP( lexical_strength_value, $list104, UNPROVIDED, UNPROVIDED ) )
    {
      return document_disambiguation.new_simple_disambiguator( $const105$ContextuallyDependentLexicalMappi );
    }
    if( NIL != subl_promotions.memberP( lexical_strength_value, $list106, UNPROVIDED, UNPROVIDED ) )
    {
      return document_disambiguation.new_simple_disambiguator( $const107$PrimaryLexicalMapping );
    }
    if( lexical_strength_value.equal( $kw108$VANISHINGLY_RARE ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 17865L)
  public static SubLObject get_tagged_document_from_html_args(final SubLObject args)
  {
    final SubLObject doc_string = html_utilities.html_extract_input( $str109$inputText, args );
    final SubLObject nerP = html_utilities.html_extract_input( $str110$use_ner, args );
    final SubLObject exhaustive_tagging = html_utilities.html_extract_sexpr( $str111$exhaustive_tagging, args, UNPROVIDED );
    final SubLObject ignore_pos_tagger = html_utilities.html_extract_sexpr( $str112$ignore_pos_tagger, args, UNPROVIDED );
    final SubLObject sentencifyP = html_utilities.html_extract_sexpr( $str113$sentencify, args, NIL );
    final SubLObject lexical_mt = html_utilities.html_extract_cyclified_sexpr( $str114$lexicalMt, args, NIL );
    final SubLObject case_sensitivity = get_case_sensitivity_value( args );
    final SubLObject disambiguators = get_disambiguators_from_html_args( args );
    final SubLObject filters = ConsesLow.list( get_concept_filter_from_html_args( args ) );
    final SubLObject specs_filter_terms = get_specs_filter_terms_from_html_args( args );
    final SubLObject instance_filter_terms = get_instance_filter_terms_from_html_args( args );
    return get_tagged_document( doc_string, nerP, exhaustive_tagging, ignore_pos_tagger, sentencifyP, lexical_mt, case_sensitivity, disambiguators, filters, specs_filter_terms, instance_filter_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 18866L)
  public static SubLObject get_tagged_document(final SubLObject text, final SubLObject nerP, final SubLObject exhaustive_taggingP, final SubLObject ignore_pos_taggerP, final SubLObject sentencifyP,
      final SubLObject lexical_mt, final SubLObject case_sensitivity, final SubLObject disambiguators, final SubLObject filters, final SubLObject spec_filter_terms, final SubLObject instance_filter_terms)
  {
    final SubLObject specs_filters = Mapping.mapcar( $sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, spec_filter_terms );
    final SubLObject instance_filters = Mapping.mapcar( $sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, instance_filter_terms );
    final SubLObject lexicon = get_browser_tagging_lexicon( nerP, ConsesLow.append( filters, specs_filters, instance_filters, NIL ), case_sensitivity, lexical_mt );
    final SubLObject tagger = ( NIL != ignore_pos_taggerP && NIL != exhaustive_taggingP ) ? $sym117$EXHAUSTIVE_CONCEPT_TAGGER
        : ( ( NIL != ignore_pos_taggerP ) ? $sym118$SIMPLE_CONCEPT_TAGGER : ( ( NIL != exhaustive_taggingP ) ? $sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER : $sym120$POS_TAGGING_CONCEPT_TAGGER ) );
    final SubLObject v_document = document_annotation_widgets.new_tagged_document( text, lexicon, NIL, tagger, sentencifyP );
    SubLObject cdolist_list_var = disambiguators;
    SubLObject disambiguator = NIL;
    disambiguator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      document_disambiguation.document_disambiguate( disambiguator, v_document, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      disambiguator = cdolist_list_var.first();
    }
    return v_document;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 19861L)
  public static SubLObject get_disambiguators_from_html_args(final SubLObject args)
  {
    final SubLObject disambiguate_value = html_utilities.html_extract_input( $str121$disambiguate, args );
    final SubLObject lexical_strength_value = html_utilities.html_extract_input( $str122$lexicalStrength, args );
    SubLObject disambiguators = NIL;
    if( NIL != subl_promotions.memberP( disambiguate_value, $list123, UNPROVIDED, UNPROVIDED ) )
    {
      disambiguators = ConsesLow.cons( rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED ), disambiguators );
    }
    if( NIL != subl_promotions.memberP( lexical_strength_value, $list124, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      disambiguators = ConsesLow.cons( document_disambiguation.new_simple_disambiguator( $const105$ContextuallyDependentLexicalMappi ), disambiguators );
    }
    else if( NIL != subl_promotions.memberP( lexical_strength_value, $list125, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      disambiguators = ConsesLow.cons( document_disambiguation.new_simple_disambiguator( $const107$PrimaryLexicalMapping ), disambiguators );
    }
    else if( lexical_strength_value.equalp( $str126$vanishingly_rare ) )
    {
    }
    return disambiguators;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 20627L)
  public static SubLObject get_specs_filters_from_html_args(final SubLObject args)
  {
    final SubLObject coll_strings = html_utilities.html_extract_input_values( $str127$allowSpecs, args );
    final SubLObject colls = Mapping.mapcan( $sym128$READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, EMPTY_SUBL_OBJECT_ARRAY );
    final SubLObject filters = Mapping.mapcar( $sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, colls );
    return filters;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 20916L)
  public static SubLObject get_instance_filters_from_html_args(final SubLObject args)
  {
    final SubLObject coll_strings = html_utilities.html_extract_input_values( $str129$allowInstances, args );
    final SubLObject colls = Mapping.mapcar( $sym130$CB_GUESS_TERM, coll_strings );
    final SubLObject filters = Mapping.mapcar( $sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, colls );
    return filters;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21192L)
  public static SubLObject get_specs_filter_terms_from_html_args(final SubLObject args)
  {
    final SubLObject coll_strings = html_utilities.html_extract_input_values( $str127$allowSpecs, args );
    final SubLObject colls = Mapping.mapcan( $sym128$READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, EMPTY_SUBL_OBJECT_ARRAY );
    return colls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21416L)
  public static SubLObject get_instance_filter_terms_from_html_args(final SubLObject args)
  {
    final SubLObject coll_strings = html_utilities.html_extract_input_values( $str129$allowInstances, args );
    final SubLObject colls = Mapping.mapcar( $sym130$CB_GUESS_TERM, coll_strings );
    return colls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21628L)
  public static SubLObject get_case_sensitivity_value(final SubLObject args)
  {
    SubLObject raw_value = html_utilities.html_extract_input( $str131$caseSensitivity, args );
    if( NIL == raw_value )
    {
      raw_value = $str132$preferred;
    }
    if( NIL != subl_promotions.memberP( raw_value, $list133, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return $kw134$ON;
    }
    if( NIL != subl_promotions.memberP( raw_value, $list135, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return $kw98$OFF;
    }
    if( NIL != subl_promotions.memberP( raw_value, $list136, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return $kw81$PREFERRED;
    }
    Errors.error( $str137$Invalid_argument_for_case_sensiti, raw_value );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22089L)
  public static SubLObject get_rdf_tagging_lexicon()
  {
    return get_browser_tagging_lexicon( T, NIL, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22178L)
  public static SubLObject get_rdf_tagged_document(final SubLObject string, SubLObject lexicon, SubLObject disambiguateP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_rdf_tagging_lexicon();
    }
    if( disambiguateP == UNPROVIDED )
    {
      disambiguateP = T;
    }
    final SubLObject doc = document_annotation_widgets.new_tagged_document( string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != disambiguateP )
    {
      rule_disambiguation.rdis_disambiguate( rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED ), doc, UNPROVIDED );
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22442L)
  public static SubLObject weightG(final SubLObject x, final SubLObject y)
  {
    if( x.isNumber() && y.isNumber() )
    {
      return Numbers.numG( x, y );
    }
    if( x.isNumber() )
    {
      return T;
    }
    if( y.isNumber() )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22808L)
  public static SubLObject allow_document_tagger_restricted_web_service()
  {
    html_kernel.initialize_http_restricted_functions();
    html_kernel.http_allow_function( $sym140$CB_TAG_DOCUMENT_HANDLER );
    html_kernel.http_allow_function( $sym141$CB_XML_TAG_DOCUMENT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 23021L)
  public static SubLObject cb_tag_document_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject xml = html_utilities.html_extract_input( $cb_tag_document_to_xml$.getGlobalValue(), args );
    final SubLObject html = html_utilities.html_extract_input( $cb_tag_document_to_html$.getGlobalValue(), args );
    SubLObject ret_value = NIL;
    final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding( thread );
    try
    {
      reader.$read_eval$.bind( NIL, thread );
      if( NIL != xml )
      {
        ret_value = xml_tag_document( args );
      }
      else if( NIL != html )
      {
        ret_value = html_tag_document( args );
      }
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_0, thread );
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 23408L)
  public static SubLObject cb_xml_tag_document(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ignore_pos_tagger = html_utilities.html_extract_sexpr( $str112$ignore_pos_tagger, args, NIL );
    final SubLObject exhaustive_tagging = html_utilities.html_extract_sexpr( $str111$exhaustive_tagging, args, NIL );
    final SubLObject sentencify = html_utilities.html_extract_sexpr( $str113$sentencify, args, NIL );
    final SubLObject use_ner = html_utilities.html_extract_sexpr( $str110$use_ner, args, NIL );
    final SubLObject title_var = $str142$Concept_Tagger_Web_Service;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str60$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$82 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw34$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw143$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$83 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str146$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str147$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str148$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str149$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str150$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str151$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str152$cb_tag_document_handler, T, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str109$inputText );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int153$100 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWENTY_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str154$virtual );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_script_utilities.html_clear_input_button( $str109$inputText, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str155$Tag_to__ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str77$filter_id );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ONE_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                    {
                      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      SubLObject cdolist_list_var = $html_concept_filters$.getGlobalValue();
                      SubLObject filter_spec_list = NIL;
                      filter_spec_list = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        SubLObject current;
                        final SubLObject datum = current = filter_spec_list;
                        SubLObject id_num = NIL;
                        SubLObject display_string = NIL;
                        SubLObject cycl = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
                        id_num = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
                        display_string = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
                        cycl = current.first();
                        current = current.rest();
                        if( NIL == current )
                        {
                          html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                          if( NIL != id_num )
                          {
                            html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( id_num );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ( display_string );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        filter_spec_list = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str157$Lexical_Mt__optional_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_text_input( $str114$lexicalMt, $str61$, $int158$60 );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$94, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str159$_Use_Named_Entity_Recognizer );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_checkbox_input( $str110$use_ner, $str160$t, use_ner, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$99, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str161$_Ignore_Part_of_speech_tagger );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_checkbox_input( $str112$ignore_pos_tagger, $str160$t, ignore_pos_tagger, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str162$_Obey_computed_sentence_boundarie );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_checkbox_input( $str113$sentencify, $str160$t, sentencify, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_row_title$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $str163$Should_complex_phrases_also_get_i ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str164$_Tag_Exhaustively );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_checkbox_input( $str111$exhaustive_tagging, $str160$t, exhaustive_tagging, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str165$_Disambiguation__ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str121$disambiguate );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ONE_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                    {
                      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str167$rule );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str168$Maximal );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$113, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str170$none );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str171$None );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str172$_Minimum_Lexical_Strength__ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str122$lexicalStrength );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ONE_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                    {
                      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str173$primary );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str174$Use_only_primary_mappings );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str175$context_sensitive );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str176$Exclude_vanishingly_rare_mappings );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str126$vanishingly_rare );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str177$Use_all_lexical_mappings );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                if( $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec() )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str178$_Extract_Propositional_Informatio );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_checkbox_input( $str179$extract_info, $str160$t, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str180$Tag_to_XML, $cb_tag_document_to_xml$.getGlobalValue(), UNPROVIDED );
              html_utilities.html_submit_input( $str181$Tag_to_HTML, $cb_tag_document_to_html$.getGlobalValue(), UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$83, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$82, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $tag_concepts_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_document(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_lexicon(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_sense_tagger(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_filter(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_output_spec(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_document(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_lexicon(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_filter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_output_spec(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject _csetf_tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != tag_concepts_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject make_tag_concepts_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $tag_concepts_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw205$SENTENCES_TO_DO ) )
      {
        _csetf_tag_concepts_iterator_state_sentences_to_do( v_new, current_value );
      }
      else if( pcase_var.eql( $kw206$DOCUMENT ) )
      {
        _csetf_tag_concepts_iterator_state_document( v_new, current_value );
      }
      else if( pcase_var.eql( $kw7$LEXICON ) )
      {
        _csetf_tag_concepts_iterator_state_lexicon( v_new, current_value );
      }
      else if( pcase_var.eql( $kw207$SENSE_TAGGER ) )
      {
        _csetf_tag_concepts_iterator_state_sense_tagger( v_new, current_value );
      }
      else if( pcase_var.eql( $kw8$FILTER ) )
      {
        _csetf_tag_concepts_iterator_state_filter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw208$OUTPUT_SPEC ) )
      {
        _csetf_tag_concepts_iterator_state_output_spec( v_new, current_value );
      }
      else if( pcase_var.eql( $kw209$PREPARED_SENTENCE_OUTPUT ) )
      {
        _csetf_tag_concepts_iterator_state_prepared_sentence_output( v_new, current_value );
      }
      else
      {
        Errors.error( $str210$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject visit_defstruct_tag_concepts_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw211$BEGIN, $sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw205$SENTENCES_TO_DO, tag_concepts_iterator_state_sentences_to_do( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw206$DOCUMENT, tag_concepts_iterator_state_document( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw7$LEXICON, tag_concepts_iterator_state_lexicon( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw207$SENSE_TAGGER, tag_concepts_iterator_state_sense_tagger( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw8$FILTER, tag_concepts_iterator_state_filter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw208$OUTPUT_SPEC, tag_concepts_iterator_state_output_spec( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw209$PREPARED_SENTENCE_OUTPUT, tag_concepts_iterator_state_prepared_sentence_output( obj ) );
    Functions.funcall( visitor_fn, obj, $kw214$END, $sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
  public static SubLObject visit_defstruct_object_tag_concepts_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_tag_concepts_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26899L)
  public static SubLObject new_tag_concepts_iterator_state(final SubLObject sentences, final SubLObject v_document, final SubLObject optional_arg_plist)
  {
    final SubLObject iter = make_tag_concepts_iterator_state( UNPROVIDED );
    _csetf_tag_concepts_iterator_state_sentences_to_do( iter, sentences );
    _csetf_tag_concepts_iterator_state_document( iter, v_document );
    _csetf_tag_concepts_iterator_state_lexicon( iter, conses_high.getf( optional_arg_plist, $kw7$LEXICON, UNPROVIDED ) );
    _csetf_tag_concepts_iterator_state_sense_tagger( iter, conses_high.getf( optional_arg_plist, $kw207$SENSE_TAGGER, UNPROVIDED ) );
    _csetf_tag_concepts_iterator_state_output_spec( iter, conses_high.getf( optional_arg_plist, $kw208$OUTPUT_SPEC, UNPROVIDED ) );
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 27483L)
  public static SubLObject tag_concepts_iterator_state_done_p(final SubLObject state)
  {
    return makeBoolean( NIL == tag_concepts_iterator_state_prepared_sentence_output( state ) && NIL == tag_concepts_iterator_state_sentences_to_do( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 27826L)
  public static SubLObject tag_concepts_iterator_state_next(final SubLObject state)
  {
    SubLObject result = NIL;
    if( NIL != tag_concepts_iterator_state_prepared_sentence_output( state ) )
    {
      result = tag_concepts_iterator_state_prepared_sentence_output( state ).first();
      _csetf_tag_concepts_iterator_state_prepared_sentence_output( state, tag_concepts_iterator_state_prepared_sentence_output( state ).rest() );
      return Values.values( result, state, NIL );
    }
    if( NIL == tag_concepts_iterator_state_sentences_to_do( state ) )
    {
      return Values.values( NIL, state, T );
    }
    final SubLObject sentence = tag_concepts_iterator_state_sentences_to_do( state ).first();
    final SubLObject lexicon = tag_concepts_iterator_state_lexicon( state );
    final SubLObject output_spec = tag_concepts_iterator_state_output_spec( state );
    final SubLObject learned_entries = methods.funcall_instance_method_with_1_args( lexicon, $sym216$LEARN, document.sentence_string( sentence ) );
    final SubLObject v_concept_tagger = tag_concepts_iterator_state_sense_tagger( state );
    final SubLObject sentence_result = Functions.funcall( concept_tagger_get_tag_method( v_concept_tagger ), sentence, lexicon, output_spec );
    _csetf_tag_concepts_iterator_state_sentences_to_do( state, tag_concepts_iterator_state_sentences_to_do( state ).rest() );
    _csetf_tag_concepts_iterator_state_prepared_sentence_output( state, ConsesLow.cons( sentence_result, tag_concepts_iterator_state_prepared_sentence_output( state ) ) );
    result = tag_concepts_iterator_state_prepared_sentence_output( state ).first();
    _csetf_tag_concepts_iterator_state_prepared_sentence_output( state, tag_concepts_iterator_state_prepared_sentence_output( state ).rest() );
    return Values.values( result, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 29259L)
  public static SubLObject concept_tagger_process_sentence_with_syntactic_parser(final SubLObject sentence, final SubLObject lexicon, final SubLObject aggressive_retokenizationP, SubLObject output_spec,
      SubLObject filter)
  {
    if( output_spec == UNPROVIDED )
    {
      output_spec = NIL;
    }
    if( filter == UNPROVIDED )
    {
      filter = NIL;
    }
    SubLObject sentence_result = NIL;
    final SubLObject string = document.sentence_string( sentence );
    final SubLObject syntax = sentence_string_denotation_mapper_get_lexified_syntax( string, lexicon, aggressive_retokenizationP );
    if( NIL != syntax )
    {
      SubLObject cdolist_list_var;
      final SubLObject yield = cdolist_list_var = methods.funcall_instance_method_with_0_args( syntax, $sym217$YIELD );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject lexes = methods.funcall_instance_method_with_0_args( word, $sym218$GET_LEXES );
        final SubLObject interps = Sequences.remove_duplicates( concept_tagger_extract_interpretations_from_lex_entry( lexes, nl_api_datastructures.output_spec_interp_spec( output_spec ), filter ), Symbols
            .symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject pos = parsing_utilities.penntag_to_cycl( Symbols.symbol_name( methods.funcall_instance_method_with_0_args( word, $sym219$GET_CATEGORY ) ) );
        final SubLObject new_info = ( NIL != interps ) ? ConsesLow.list( $kw220$INTERPS, interps, $kw221$CYC_POS, pos, $kw222$LEX_ENTRIES, lexes ) : NIL;
        sentence_result = ConsesLow.cons( document.new_word( ConsesLow.list( $kw223$STRING, methods.funcall_instance_method_with_0_args( word, $sym224$GET_STRING ), $kw225$CATEGORY, pos, $kw226$INFO, new_info ) ),
            sentence_result );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( sentence_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 30880L)
  public static SubLObject sentence_string_denotation_mapper_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon, final SubLObject aggressiveP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject syntax = NIL;
    SubLObject error = NIL;
    if( NIL != aggressiveP )
    {
      syntax = word_linkage.new_word_linkage( sentence_string, ConsesLow.list( $kw7$LEXICON, lexicon ) );
      if( NIL == syntax )
      {
        final SubLObject v_parser = get_default_sentence_string_parser();
        syntax = methods.funcall_instance_method_with_1_args( v_parser, $sym227$PARSE, sentence_string );
      }
    }
    else
    {
      final SubLObject v_parser = get_default_sentence_string_parser();
      syntax = methods.funcall_instance_method_with_1_args( v_parser, $sym227$PARSE, sentence_string );
      if( NIL == syntax )
      {
        syntax = word_linkage.new_word_linkage( sentence_string, ConsesLow.list( $kw7$LEXICON, lexicon ) );
      }
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym228$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          methods.funcall_instance_method_with_1_args( syntax, $sym229$LEXIFY, lexicon );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      Errors.warn( $str230$_______________Error_____________ );
      Errors.warn( $str231$Caught__S_while_processing__S__, error, sentence_string );
    }
    return syntax;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 31710L)
  public static SubLObject sentence_string_denotation_mapper_aggressive_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_linkage = word_linkage.new_word_linkage( sentence_string, ConsesLow.list( $kw7$LEXICON, lexicon ) );
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym228$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          methods.funcall_instance_method_with_1_args( v_linkage, $sym229$LEXIFY, lexicon );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      Errors.warn( $str230$_______________Error_____________ );
      Errors.warn( $str231$Caught__S_while_processing__S__, error, sentence_string );
    }
    return v_linkage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32151L)
  public static SubLObject sentence_string_denotation_mapper_conservative_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_parser = get_default_sentence_string_parser();
    final SubLObject tree = methods.funcall_instance_method_with_1_args( v_parser, $sym227$PARSE, sentence_string );
    if( NIL != parse_tree.parse_tree_p( tree ) )
    {
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym228$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            methods.funcall_instance_method_with_1_args( tree, $sym229$LEXIFY, lexicon );
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
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error )
      {
        Errors.warn( $str230$_______________Error_____________ );
        Errors.warn( $str231$Caught__S_while_processing__S__, error, sentence_string );
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject concept_tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_concept_tagger( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject concept_tagger_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $concept_tagger_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject concept_tagger_name(final SubLObject v_object)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject concept_tagger_tag_method(final SubLObject v_object)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject concept_tagger_lexicon_method(final SubLObject v_object)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject _csetf_concept_tagger_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject _csetf_concept_tagger_tag_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject _csetf_concept_tagger_lexicon_method(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != concept_tagger_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject make_concept_tagger(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $concept_tagger_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw247$NAME ) )
      {
        _csetf_concept_tagger_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw248$TAG_METHOD ) )
      {
        _csetf_concept_tagger_tag_method( v_new, current_value );
      }
      else if( pcase_var.eql( $kw249$LEXICON_METHOD ) )
      {
        _csetf_concept_tagger_lexicon_method( v_new, current_value );
      }
      else
      {
        Errors.error( $str210$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject visit_defstruct_concept_tagger(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw211$BEGIN, $sym250$MAKE_CONCEPT_TAGGER, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw247$NAME, concept_tagger_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw248$TAG_METHOD, concept_tagger_tag_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw213$SLOT, $kw249$LEXICON_METHOD, concept_tagger_lexicon_method( obj ) );
    Functions.funcall( visitor_fn, obj, $kw214$END, $sym250$MAKE_CONCEPT_TAGGER, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
  public static SubLObject visit_defstruct_object_concept_tagger_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_concept_tagger( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33015L)
  public static SubLObject print_concept_tagger(final SubLObject ctagger, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str252$__Concept_Tagger__A_, concept_tagger_name( ctagger ) );
    return ctagger;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33195L)
  public static SubLObject declare_concept_tagger(final SubLObject ctagger_name, final SubLObject ctagger_method, SubLObject lexicon_method)
  {
    if( lexicon_method == UNPROVIDED )
    {
      lexicon_method = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ctagger = make_concept_tagger( UNPROVIDED );
    _csetf_concept_tagger_name( ctagger, ctagger_name );
    _csetf_concept_tagger_tag_method( ctagger, ctagger_method );
    _csetf_concept_tagger_lexicon_method( ctagger, lexicon_method );
    dictionary.dictionary_enter( $registered_concept_taggers$.getDynamicValue( thread ), ctagger_name, ctagger );
    return ctagger;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33613L)
  public static SubLObject concept_tagger_get_tag_method(final SubLObject ctagger_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ctagger = dictionary.dictionary_lookup( $registered_concept_taggers$.getDynamicValue( thread ), ctagger_name, UNPROVIDED );
    if( NIL == ctagger )
    {
      Errors.error( $str253$_S_is_not_a_registered_concept_ta, ctagger_name );
    }
    return concept_tagger_tag_method( ctagger );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33890L)
  public static SubLObject concept_tagger_get_lexicon_method(final SubLObject ctagger_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ctagger = dictionary.dictionary_lookup( $registered_concept_taggers$.getDynamicValue( thread ), ctagger_name, UNPROVIDED );
    if( NIL == ctagger )
    {
      Errors.error( $str254$_S_is_not_a_registered_concept_ta, ctagger_name );
    }
    return concept_tagger_lexicon_method( ctagger );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34175L)
  public static SubLObject default_lexicon_for_concept_tagger(final SubLObject ctagger_name)
  {
    return Functions.funcall( concept_tagger_get_lexicon_method( ctagger_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34312L)
  public static SubLObject default_concept_tagging_domain_mt()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34381L)
  public static SubLObject tag_concepts_fast(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec)
  {
    return tag_concepts_fast_int( sentence, lexicon, output_spec, $sym255$LEXIFY_SENTENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34529L)
  public static SubLObject tag_concepts_fast_exhaustively(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec)
  {
    return tag_concepts_fast_int( sentence, lexicon, output_spec, $sym256$LEXIFY_SENTENCE_EXHAUSTIVELY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34702L)
  public static SubLObject tag_concepts_fast_int(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject tag_method)
  {
    final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args( lexicon, tag_method, sentence );
    final SubLObject filters = methods.funcall_instance_method_with_0_args( lexicon, $sym257$GET_CONCEPT_FILTER_SPECS );
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( lexified_sentence );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lexes = document.word_info( word );
      final SubLObject interps = Sequences.remove_duplicates( concept_tagger_extract_interpretations_from_lex_entry( lexes, nl_api_datastructures.output_spec_interp_spec( output_spec ), filters ), Symbols
          .symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject new_info = ConsesLow.list( $kw220$INTERPS, interps, $kw221$CYC_POS, ( NIL != lexes ) ? methods.funcall_instance_method_with_1_args( lexes.first(), $sym258$GET, $kw221$CYC_POS ) : NIL,
          $kw222$LEX_ENTRIES, lexes );
      document.sign_update( word, ConsesLow.list( $kw226$INFO, new_info ) );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    disambiguation.disambiguate_sentence( lexified_sentence );
    return lexified_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 35486L)
  public static SubLObject tag_concepts_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec)
  {
    final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), sentence );
    return tag_concepts_fast( pos_tagged_sentence, lexicon, output_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 35712L)
  public static SubLObject tag_concepts_exhaustively_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec)
  {
    final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), sentence );
    return tag_concepts_fast_exhaustively( pos_tagged_sentence, lexicon, output_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject get_default_concept_tagger_lexicon(SubLObject filter)
  {
    if( filter == UNPROVIDED )
    {
      filter = NIL;
    }
    return ( NIL != concept_filter.concept_filter_specification_p( filter ) ) ? get_default_concept_tagger_lexicon_for_filter( filter ) : get_default_sentence_string_lexicon();
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject get_default_concept_tagger_lexicon_for_filter(final SubLObject filter)
  {
    final SubLObject lexicon = make_default_concept_tagger_lexicon();
    methods.funcall_instance_method_with_1_args( lexicon, $sym87$ADD_CONCEPT_FILTER_SPEC, filter );
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject make_default_concept_tagger_lexicon()
  {
    final SubLObject lexicon = object.new_class_instance( $sym264$TERM_LEXICON );
    methods.funcall_instance_method_with_1_args( lexicon, $sym86$SET_CASE_SENSITIVITY, $kw98$OFF );
    methods.funcall_instance_method_with_1_args( lexicon, $sym265$ALLOW_PREDICATE, $const266$preferredNameString );
    methods.funcall_instance_method_with_1_args( lexicon, $sym267$EXCLUDE_PREDICATE, $const268$ksTermString );
    methods.funcall_instance_method_with_1_args( lexicon, $sym269$EXCLUDE_POS, $const270$ClosedClassWord );
    methods.funcall_instance_method_with_1_args( lexicon, $sym84$ADD_LEARNER, $sym85$NUMBER_LEARN );
    methods.funcall_instance_method_with_1_args( lexicon, $sym271$ALLOW_MT, $const272$RelationParaphraseMt );
    if( NIL != named_entity_recognizer.stanford_ner_ping( UNPROVIDED, UNPROVIDED ) )
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym84$ADD_LEARNER, $sym273$STANFORD_NER_DATE_LEARN );
    }
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject get_default_sentence_string_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $default_sentence_string_lexicon$.getDynamicValue( thread ) ) )
    {
      $default_sentence_string_lexicon$.setDynamicValue( make_default_concept_tagger_lexicon(), thread );
    }
    return $default_sentence_string_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject get_default_sentence_string_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == parser.stanford_parser_p( $default_sentence_string_parser$.getDynamicValue( thread ) ) )
    {
      $default_sentence_string_parser$.setDynamicValue( parser.new_stanford_parser( $kw274$WARN, UNPROVIDED ), thread );
    }
    return $default_sentence_string_parser$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
  public static SubLObject concept_tagger_extract_interpretations_from_lex_entry(final SubLObject lex_entries, final SubLObject output_spec, SubLObject filters)
  {
    if( filters == UNPROVIDED )
    {
      filters = $list275;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lex_entries;
    SubLObject raw_lex_entry = NIL;
    raw_lex_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex_entry = ( NIL != cyclifier.ranked_lex_entry_p( raw_lex_entry ) ) ? cyclifier.rle_lex( raw_lex_entry ) : raw_lex_entry;
      final SubLObject intermed_result = methods.funcall_instance_method_with_1_args( lex_entry, $sym258$GET, $kw276$DENOT );
      SubLObject intermed_results = NIL;
      if( NIL != filters && NIL == non_trie_lex_entry_p( lex_entry ) )
      {
        intermed_results = concept_tagger_accepted_terms( intermed_result, filters, UNPROVIDED );
      }
      else
      {
        intermed_results = ConsesLow.list( intermed_result );
      }
      SubLObject cdolist_list_var_$125 = intermed_results;
      SubLObject intermed_result_$126 = NIL;
      intermed_result_$126 = cdolist_list_var_$125.first();
      while ( NIL != cdolist_list_var_$125)
      {
        SubLObject new_interp = nl_api_datastructures.new_nl_interpretation( UNPROVIDED );
        if( NIL != nl_api_datastructures.nl_interp_spec_return_cyclP( output_spec ) )
        {
          new_interp = conses_high.putf( new_interp, $kw277$CYCL, intermed_result_$126 );
        }
        if( NIL != nl_api_datastructures.nl_interp_spec_return_phrase_typesP( output_spec ) )
        {
          new_interp = conses_high.putf( new_interp, $kw278$PHRASE_TYPES, ConsesLow.list( methods.funcall_instance_method_with_1_args( lex_entry, $sym258$GET, $kw221$CYC_POS ) ) );
        }
        if( NIL != nl_api_datastructures.nl_interp_spec_return_head_inflectionsP( output_spec ) )
        {
          new_interp = conses_high.putf( new_interp, $kw279$INFLECTIONS, methods.funcall_instance_method_with_1_args( lex_entry, $sym258$GET, $kw279$INFLECTIONS ) );
        }
        if( NIL != nl_api_datastructures.nl_interp_spec_return_pragmaticsP( output_spec ) && NIL != methods.funcall_instance_method_with_1_args( lex_entry, $sym258$GET, $kw280$PRAGMATICS ) )
        {
          new_interp = conses_high.putf( new_interp, $kw280$PRAGMATICS, methods.funcall_instance_method_with_1_args( lex_entry, $sym258$GET, $kw280$PRAGMATICS ) );
        }
        result = ConsesLow.cons( new_interp, result );
        cdolist_list_var_$125 = cdolist_list_var_$125.rest();
        intermed_result_$126 = cdolist_list_var_$125.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      raw_lex_entry = cdolist_list_var.first();
    }
    SubLObject final_result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const281$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final_result = list_utilities.remove_subsumed_items( Sequences.remove_duplicates( result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym282$PARSING_REWRITE_OF_INVERSE_, $sym70$GET_NL_INTERP_CYCL );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 39924L)
  public static SubLObject non_trie_lex_entry_p(final SubLObject entry)
  {
    return makeBoolean( NIL == abstract_lexicon.lex_entry_p( entry ) || NIL == methods.funcall_instance_method_with_1_args( entry, $sym258$GET, $kw283$TRIE_ENTRY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 40061L)
  public static SubLObject augment_tag_concepts_optional_arg_plist_with_defaults(final SubLObject optional_arg_plist)
  {
    SubLObject plist_to_return = list_utilities.augment_plist_with_defaults( optional_arg_plist, ConsesLow.list( $kw207$SENSE_TAGGER, $sym120$POS_TAGGING_CONCEPT_TAGGER ) );
    if( NIL != nl_api_datastructures.nl_interpretation_spec_p( conses_high.getf( optional_arg_plist, $kw208$OUTPUT_SPEC, UNPROVIDED ) ) )
    {
      plist_to_return = conses_high.putf( plist_to_return, $kw208$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec( $kw284$COMPLEX, conses_high.getf( optional_arg_plist, $kw285$INTERP_SPEC, UNPROVIDED ) ) );
    }
    if( NIL == list_utilities.plist_has_keyP( optional_arg_plist, $kw7$LEXICON ) )
    {
      final SubLObject filter = conses_high.getf( optional_arg_plist, $kw8$FILTER, UNPROVIDED );
      plist_to_return = conses_high.putf( plist_to_return, $kw7$LEXICON, get_default_concept_tagger_lexicon( filter ) );
    }
    if( NIL == list_utilities.plist_has_keyP( optional_arg_plist, $kw208$OUTPUT_SPEC ) )
    {
      plist_to_return = conses_high.putf( plist_to_return, $kw208$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec( $kw286$SIMPLE, nl_api_datastructures.new_nl_interpretation_spec( UNPROVIDED ) ) );
    }
    return plist_to_return;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 40894L)
  public static SubLObject concept_tagger_accepted_terms(final SubLObject v_term, SubLObject filters, SubLObject mt)
  {
    if( filters == UNPROVIDED )
    {
      filters = $list275;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject accepted_terms = NIL;
    SubLObject cdolist_list_var = filters;
    SubLObject filter = NIL;
    filter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      accepted_terms = ConsesLow.cons( concept_tagger_accepted_terms_int( v_term, filter, mt ), accepted_terms );
      cdolist_list_var = cdolist_list_var.rest();
      filter = cdolist_list_var.first();
    }
    return Sequences.creduce( $sym287$INTERSECTION, accepted_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 41180L)
  public static SubLObject concept_tagger_accepted_terms_int(final SubLObject v_term, SubLObject filter, SubLObject mt)
  {
    if( filter == UNPROVIDED )
    {
      filter = $kw288$DEFAULT;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( filter == $kw288$DEFAULT )
    {
      return ( NIL != rkf_relevance_utilities.rkf_irrelevant_term( narts_high.nart_substitute( v_term ), mt ) || NIL != isa.quoted_isaP( v_term, $const289$ImplementationConstant, UNPROVIDED, UNPROVIDED )
          || NIL != cycl_utilities.expression_find_if( $sym290$KEYWORDP, v_term, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities.naut_with_functor_p( v_term, $const291$InstanceFn ) || ( NIL != isa.isaP( v_term,
              $const292$Collection, UNPROVIDED, UNPROVIDED ) && cardinality_estimates.generality_estimate( v_term ).numG( $concept_tagger_lexical_generality_cutoff$.getDynamicValue( thread ) ) ) ) ? NIL
                  : ConsesLow.list( v_term );
    }
    if( NIL != concept_filter.concept_filter_specification_p( filter ) )
    {
      return concept_filter.valid_concept_filter_nodes( v_term, filter );
    }
    return ConsesLow.list( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 41913L)
  public static SubLObject concept_tagger_irrelevant_term(final SubLObject v_term, SubLObject filter, SubLObject mt)
  {
    if( filter == UNPROVIDED )
    {
      filter = $kw288$DEFAULT;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( filter == $kw288$DEFAULT )
    {
      return rkf_relevance_utilities.rkf_irrelevant_term( narts_high.nart_substitute( v_term ), mt );
    }
    if( NIL != concept_filter.concept_filter_specification_p( filter ) )
    {
      return makeBoolean( NIL == concept_filter.valid_concept_filter_nodes( v_term, filter ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 42313L)
  public static SubLObject test_concept_tagger_speed(SubLObject string_list, SubLObject filter_num, SubLObject output_file)
  {
    if( string_list == UNPROVIDED )
    {
      string_list = $concept_tagger_test_docs$.getDynamicValue();
    }
    if( filter_num == UNPROVIDED )
    {
      filter_num = FOUR_INTEGER;
    }
    if( output_file == UNPROVIDED )
    {
      output_file = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total_time = ZERO_INTEGER;
    SubLObject output_string = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
    try
    {
      html_macros.$html_stream$.bind( NIL, thread );
      try
      {
        html_macros.$html_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        final SubLObject _prev_bind_0_$127 = $default_sentence_string_lexicon$.currentBinding( thread );
        try
        {
          $default_sentence_string_lexicon$.bind( NIL, thread );
          final SubLObject warm_up_arg_list = ConsesLow.list( $str293$T, $list294, $list295, ConsesLow.list( $str77$filter_id, PrintLow.write_to_string( filter_num, EMPTY_SUBL_OBJECT_ARRAY ) ) );
          xml_tag_document( warm_up_arg_list );
          Storage.gc_ephemeral();
          final SubLObject time_var = Time.get_internal_real_time();
          SubLObject cdolist_list_var = string_list;
          SubLObject doc_string = NIL;
          doc_string = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject arg_list = ConsesLow.list( $str293$T, ConsesLow.list( $str296$doc_string, doc_string ), $list297, ConsesLow.list( $str77$filter_id, PrintLow.write_to_string( filter_num,
                EMPTY_SUBL_OBJECT_ARRAY ) ) );
            xml_tag_document( arg_list );
            cdolist_list_var = cdolist_list_var.rest();
            doc_string = cdolist_list_var.first();
          }
          total_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
          methods.funcall_instance_method_with_0_args( $default_sentence_string_lexicon$.getDynamicValue( thread ), $sym298$FORGET );
        }
        finally
        {
          $default_sentence_string_lexicon$.rebind( _prev_bind_0_$127, thread );
        }
        output_string = streams_high.get_output_stream_string( html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$128, thread );
        }
      }
    }
    finally
    {
      html_macros.$html_stream$.rebind( _prev_bind_0, thread );
    }
    if( NIL != output_file )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( output_file, $kw299$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str300$Unable_to_open__S, output_file );
        }
        final SubLObject f = stream;
        print_high.princ( output_string, f );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return total_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
  public static SubLObject term_absent_from_doc_interps(final SubLObject doc, final SubLObject v_term)
  {
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$129;
    SubLObject backwardP_var_$130;
    SubLObject length_$131;
    SubLObject v_iteration_$132;
    SubLObject element_num_$133;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$134;
    SubLObject interp;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$129 = document.paragraph_sentences( paragraph );
      backwardP_var_$130 = NIL;
      for( length_$131 = Sequences.length( vector_var_$129 ), v_iteration_$132 = NIL, v_iteration_$132 = ZERO_INTEGER; v_iteration_$132.numL( length_$131 ); v_iteration_$132 = Numbers.add( v_iteration_$132,
          ONE_INTEGER ) )
      {
        element_num_$133 = ( ( NIL != backwardP_var_$130 ) ? Numbers.subtract( length_$131, v_iteration_$132, ONE_INTEGER ) : v_iteration_$132 );
        sentence = Vectors.aref( vector_var_$129, element_num_$133 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$134 = document.word_interps( word );
          interp = NIL;
          interp = cdolist_list_var_$134.first();
          while ( NIL != cdolist_list_var_$134)
          {
            if( nl_api_datastructures.get_nl_interp_cycl( interp ).equal( v_term ) )
            {
              return NIL;
            }
            cdolist_list_var_$134 = cdolist_list_var_$134.rest();
            interp = cdolist_list_var_$134.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
  public static SubLObject term_in_doc_interps(final SubLObject doc, final SubLObject v_term)
  {
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$135;
    SubLObject backwardP_var_$136;
    SubLObject length_$137;
    SubLObject v_iteration_$138;
    SubLObject element_num_$139;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$140;
    SubLObject interp;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$135 = document.paragraph_sentences( paragraph );
      backwardP_var_$136 = NIL;
      for( length_$137 = Sequences.length( vector_var_$135 ), v_iteration_$138 = NIL, v_iteration_$138 = ZERO_INTEGER; v_iteration_$138.numL( length_$137 ); v_iteration_$138 = Numbers.add( v_iteration_$138,
          ONE_INTEGER ) )
      {
        element_num_$139 = ( ( NIL != backwardP_var_$136 ) ? Numbers.subtract( length_$137, v_iteration_$138, ONE_INTEGER ) : v_iteration_$138 );
        sentence = Vectors.aref( vector_var_$135, element_num_$139 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$140 = document.word_interps( word );
          interp = NIL;
          interp = cdolist_list_var_$140.first();
          while ( NIL != cdolist_list_var_$140)
          {
            if( nl_api_datastructures.get_nl_interp_cycl( interp ).equal( v_term ) )
            {
              return T;
            }
            cdolist_list_var_$140 = cdolist_list_var_$140.rest();
            interp = cdolist_list_var_$140.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
  public static SubLObject get_tagged_document_from_html_args_pos(final SubLObject args)
  {
    return get_tagged_document_from_html_args( args );
  }

  public static SubLObject declare_concept_tagger_file()
  {
    SubLFiles.declareFunction( me, "tag_concepts", "TAG-CONCEPTS", 1, 1, false );
    SubLFiles.declareFunction( me, "tag_concepts_optional_args_p", "TAG-CONCEPTS-OPTIONAL-ARGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_next_sentence_annotation", "GET-NEXT-SENTENCE-ANNOTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "annotation_completeP", "ANNOTATION-COMPLETE?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_tagged_concepts_results", "DO-TAGGED-CONCEPTS-RESULTS" );
    SubLFiles.declareFunction( me, "all_tagged_concepts", "ALL-TAGGED-CONCEPTS", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_cycl_from_concept_tagger_output", "EXTRACT-CYCL-FROM-CONCEPT-TAGGER-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "tagged_concepts_for_disambiguator", "TAGGED-CONCEPTS-FOR-DISAMBIGUATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_tag_document", "XML-TAG-DOCUMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "tag_document_xml", "TAG-DOCUMENT-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_tag_document_int", "XML-TAG-DOCUMENT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_xml_sense_tag_for_cycl_term", "SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "html_tag_document", "HTML-TAG-DOCUMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "html_tag_document_int", "HTML-TAG-DOCUMENT-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "html_display_tagger_result", "HTML-DISPLAY-TAGGER-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_filter_from_html_args", "GET-CONCEPT-FILTER-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_browser_tagging_lexicons", "CLEAR-BROWSER-TAGGING-LEXICONS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 2, false );
    SubLFiles.declareFunction( me, "get_tagged_document_from_params", "GET-TAGGED-DOCUMENT-FROM-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lexical_strength_disambiguator", "GET-LEXICAL-STRENGTH-DISAMBIGUATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tagged_document_from_html_args", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tagged_document", "GET-TAGGED-DOCUMENT", 11, 0, false );
    SubLFiles.declareFunction( me, "get_disambiguators_from_html_args", "GET-DISAMBIGUATORS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_specs_filters_from_html_args", "GET-SPECS-FILTERS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_instance_filters_from_html_args", "GET-INSTANCE-FILTERS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_specs_filter_terms_from_html_args", "GET-SPECS-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_instance_filter_terms_from_html_args", "GET-INSTANCE-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_case_sensitivity_value", "GET-CASE-SENSITIVITY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_rdf_tagging_lexicon", "GET-RDF-TAGGING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_rdf_tagged_document", "GET-RDF-TAGGED-DOCUMENT", 1, 2, false );
    SubLFiles.declareFunction( me, "weightG", "WEIGHT>", 2, 0, false );
    SubLFiles.declareFunction( me, "allow_document_tagger_restricted_web_service", "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_tag_document_handler", "CB-TAG-DOCUMENT-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_xml_tag_document", "CB-XML-TAG-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_print_function_trampoline", "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_p", "TAG-CONCEPTS-ITERATOR-STATE-P", 1, 0, false );
    new $tag_concepts_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_sentences_to_do", "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_document", "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_lexicon", "TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_sense_tagger", "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_filter", "TAG-CONCEPTS-ITERATOR-STATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_output_spec", "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_prepared_sentence_output", "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_sentences_to_do", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_document", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_lexicon", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_sense_tagger", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_filter", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_output_spec", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tag_concepts_iterator_state_prepared_sentence_output", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_tag_concepts_iterator_state", "MAKE-TAG-CONCEPTS-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_tag_concepts_iterator_state", "VISIT-DEFSTRUCT-TAG-CONCEPTS-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_tag_concepts_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_tag_concepts_iterator_state", "NEW-TAG-CONCEPTS-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_done_p", "TAG-CONCEPTS-ITERATOR-STATE-DONE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_iterator_state_next", "TAG-CONCEPTS-ITERATOR-STATE-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_process_sentence_with_syntactic_parser", "CONCEPT-TAGGER-PROCESS-SENTENCE-WITH-SYNTACTIC-PARSER", 3, 2, false );
    SubLFiles.declareFunction( me, "sentence_string_denotation_mapper_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-GET-LEXIFIED-SYNTAX", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_string_denotation_mapper_aggressive_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-AGGRESSIVE-GET-LEXIFIED-SYNTAX", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_string_denotation_mapper_conservative_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-CONSERVATIVE-GET-LEXIFIED-SYNTAX", 2, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_print_function_trampoline", "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_p", "CONCEPT-TAGGER-P", 1, 0, false );
    new $concept_tagger_p$UnaryFunction();
    SubLFiles.declareFunction( me, "concept_tagger_name", "CONCEPT-TAGGER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_tag_method", "CONCEPT-TAGGER-TAG-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_lexicon_method", "CONCEPT-TAGGER-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_concept_tagger_name", "_CSETF-CONCEPT-TAGGER-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_concept_tagger_tag_method", "_CSETF-CONCEPT-TAGGER-TAG-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_concept_tagger_lexicon_method", "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "make_concept_tagger", "MAKE-CONCEPT-TAGGER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_concept_tagger", "VISIT-DEFSTRUCT-CONCEPT-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_concept_tagger_method", "VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_concept_tagger", "PRINT-CONCEPT-TAGGER", 1, 2, false );
    SubLFiles.declareFunction( me, "declare_concept_tagger", "DECLARE-CONCEPT-TAGGER", 2, 1, false );
    SubLFiles.declareFunction( me, "concept_tagger_get_tag_method", "CONCEPT-TAGGER-GET-TAG-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_get_lexicon_method", "CONCEPT-TAGGER-GET-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "default_lexicon_for_concept_tagger", "DEFAULT-LEXICON-FOR-CONCEPT-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "default_concept_tagging_domain_mt", "DEFAULT-CONCEPT-TAGGING-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_fast", "TAG-CONCEPTS-FAST", 3, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_fast_exhaustively", "TAG-CONCEPTS-FAST-EXHAUSTIVELY", 3, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_fast_int", "TAG-CONCEPTS-FAST-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_using_pos_tags", "TAG-CONCEPTS-USING-POS-TAGS", 3, 0, false );
    SubLFiles.declareFunction( me, "tag_concepts_exhaustively_using_pos_tags", "TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_default_concept_tagger_lexicon", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "get_default_concept_tagger_lexicon_for_filter", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON-FOR-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "make_default_concept_tagger_lexicon", "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_default_sentence_string_lexicon", "GET-DEFAULT-SENTENCE-STRING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_default_sentence_string_parser", "GET-DEFAULT-SENTENCE-STRING-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_extract_interpretations_from_lex_entry", "CONCEPT-TAGGER-EXTRACT-INTERPRETATIONS-FROM-LEX-ENTRY", 2, 1, false );
    SubLFiles.declareFunction( me, "non_trie_lex_entry_p", "NON-TRIE-LEX-ENTRY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "augment_tag_concepts_optional_arg_plist_with_defaults", "AUGMENT-TAG-CONCEPTS-OPTIONAL-ARG-PLIST-WITH-DEFAULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tagger_accepted_terms", "CONCEPT-TAGGER-ACCEPTED-TERMS", 1, 2, false );
    SubLFiles.declareFunction( me, "concept_tagger_accepted_terms_int", "CONCEPT-TAGGER-ACCEPTED-TERMS-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "concept_tagger_irrelevant_term", "CONCEPT-TAGGER-IRRELEVANT-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "test_concept_tagger_speed", "TEST-CONCEPT-TAGGER-SPEED", 0, 3, false );
    SubLFiles.declareFunction( me, "term_absent_from_doc_interps", "TERM-ABSENT-FROM-DOC-INTERPS", 2, 0, false );
    SubLFiles.declareFunction( me, "term_in_doc_interps", "TERM-IN-DOC-INTERPS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tagged_document_from_html_args_pos", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_concept_tagger_file()
  {
    $default_sentence_string_lexicon$ = SubLFiles.defparameter( "*DEFAULT-SENTENCE-STRING-LEXICON*", NIL );
    $default_sentence_string_parser$ = SubLFiles.defparameter( "*DEFAULT-SENTENCE-STRING-PARSER*", NIL );
    $concept_tagger_lexical_generality_cutoff$ = SubLFiles.defparameter( "*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*", $int0$400000 );
    $html_concept_filters$ = SubLFiles.deflexical( "*HTML-CONCEPT-FILTERS*", $list26 );
    $doc_tagger_default_style$ = SubLFiles.defparameter( "*DOC-TAGGER-DEFAULT-STYLE*", $str58$_cycl__font_family__sans_serif__c );
    $browser_tagging_lexicons$ = SubLFiles.defparameter( "*BROWSER-TAGGING-LEXICONS*", dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    $cb_tag_document_to_html$ = SubLFiles.defconstant( "*CB-TAG-DOCUMENT-TO-HTML*", Sequences.cconcatenate( http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str138$text_html ) );
    $cb_tag_document_to_xml$ = SubLFiles.defconstant( "*CB-TAG-DOCUMENT-TO-XML*", Sequences.cconcatenate( http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), $str139$text_xml ) );
    $dtp_tag_concepts_iterator_state$ = SubLFiles.defconstant( "*DTP-TAG-CONCEPTS-ITERATOR-STATE*", $sym182$TAG_CONCEPTS_ITERATOR_STATE );
    $tag_concepts_quicklyP$ = SubLFiles.defparameter( "*TAG-CONCEPTS-QUICKLY?*", T );
    $registered_concept_taggers$ = SubLFiles.defparameter( "*REGISTERED-CONCEPT-TAGGERS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $dtp_concept_tagger$ = SubLFiles.defconstant( "*DTP-CONCEPT-TAGGER*", $sym232$CONCEPT_TAGGER );
    $concept_tagger_test_docs$ = SubLFiles.defparameter( "*CONCEPT-TAGGER-TEST-DOCS*", $list301 );
    return NIL;
  }

  public static SubLObject setup_concept_tagger_file()
  {
    access_macros.register_external_symbol( $sym1$TAG_CONCEPTS );
    access_macros.register_external_symbol( $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P );
    access_macros.register_external_symbol( $sym9$GET_NEXT_SENTENCE_ANNOTATION );
    access_macros.register_external_symbol( $sym11$ANNOTATION_COMPLETE_ );
    access_macros.register_external_symbol( $sym19$ALL_TAGGED_CONCEPTS );
    html_macros.note_cgi_handler_function( $sym27$XML_TAG_DOCUMENT, $kw28$XML_HANDLER );
    access_macros.register_external_symbol( $sym29$TAG_DOCUMENT_XML );
    access_macros.register_external_symbol( $sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM );
    html_macros.note_cgi_handler_function( $sym63$HTML_TAG_DOCUMENT, $kw64$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym65$HTML_TAG_DOCUMENT_INT, $kw64$HTML_HANDLER );
    access_macros.register_external_symbol( $sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS );
    html_macros.note_cgi_handler_function( $sym140$CB_TAG_DOCUMENT_HANDLER, $kw64$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym141$CB_XML_TAG_DOCUMENT, $kw64$HTML_HANDLER );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym189$TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list190 );
    Structures.def_csetf( $sym191$TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO, $sym192$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO );
    Structures.def_csetf( $sym193$TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT, $sym194$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT );
    Structures.def_csetf( $sym195$TAG_CONCEPTS_ITERATOR_STATE_LEXICON, $sym196$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON );
    Structures.def_csetf( $sym197$TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER, $sym198$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER );
    Structures.def_csetf( $sym199$TAG_CONCEPTS_ITERATOR_STATE_FILTER, $sym200$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER );
    Structures.def_csetf( $sym201$TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC, $sym202$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC );
    Structures.def_csetf( $sym203$TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, $sym204$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT );
    Equality.identity( $sym182$TAG_CONCEPTS_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tag_concepts_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym215$VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P );
    utilities_macros.note_funcall_helper_function( $sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), Symbols.symbol_function( $sym239$CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list240 );
    Structures.def_csetf( $sym241$CONCEPT_TAGGER_NAME, $sym242$_CSETF_CONCEPT_TAGGER_NAME );
    Structures.def_csetf( $sym243$CONCEPT_TAGGER_TAG_METHOD, $sym244$_CSETF_CONCEPT_TAGGER_TAG_METHOD );
    Structures.def_csetf( $sym245$CONCEPT_TAGGER_LEXICON_METHOD, $sym246$_CSETF_CONCEPT_TAGGER_LEXICON_METHOD );
    Equality.identity( $sym232$CONCEPT_TAGGER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_concept_tagger$.getGlobalValue(), Symbols.symbol_function( $sym251$VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD ) );
    declare_concept_tagger( $sym120$POS_TAGGING_CONCEPT_TAGGER, $sym259$TAG_CONCEPTS_USING_POS_TAGS, $sym260$NEW_TERM_LEXICON );
    declare_concept_tagger( $sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER, $sym261$TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS, $sym260$NEW_TERM_LEXICON );
    declare_concept_tagger( $sym118$SIMPLE_CONCEPT_TAGGER, $sym262$TAG_CONCEPTS_FAST, $sym260$NEW_TERM_LEXICON );
    declare_concept_tagger( $sym117$EXHAUSTIVE_CONCEPT_TAGGER, $sym263$TAG_CONCEPTS_FAST_EXHAUSTIVELY, $sym260$NEW_TERM_LEXICON );
    generic_testing.define_test_case_table_int( $sym302$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS, ConsesLow.list( new SubLObject[] { $kw303$TEST, $sym304$TERM_ABSENT_FROM_DOC_INTERPS, $kw305$OWNER, NIL, $kw306$CLASSES, NIL,
      $kw307$KB, $kw308$FULL, $kw309$WORKING_, T
    } ), $list310 );
    generic_testing.define_test_case_table_int( $sym311$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS, ConsesLow.list( new SubLObject[] { $kw303$TEST, $sym312$TERM_IN_DOC_INTERPS, $kw305$OWNER, NIL, $kw306$CLASSES, NIL,
      $kw307$KB, $kw308$FULL, $kw309$WORKING_, T
    } ), $list313 );
    generic_testing.define_test_case_table_int( $sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM, ConsesLow.list( new SubLObject[] { $kw303$TEST, $sym314$TRUE, $kw305$OWNER, NIL, $kw306$CLASSES, NIL, $kw307$KB, $kw308$FULL,
      $kw309$WORKING_, T
    } ), $list315 );
    generic_testing.define_test_case_table_int( $sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS, ConsesLow.list( new SubLObject[] { $kw303$TEST, $sym304$TERM_ABSENT_FROM_DOC_INTERPS, $kw305$OWNER, NIL, $kw306$CLASSES, NIL,
      $kw307$KB, $kw308$FULL, $kw309$WORKING_, T
    } ), $list316 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_concept_tagger_file();
  }

  @Override
  public void initializeVariables()
  {
    init_concept_tagger_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_concept_tagger_file();
  }
  static
  {
    me = new concept_tagger();
    $default_sentence_string_lexicon$ = null;
    $default_sentence_string_parser$ = null;
    $concept_tagger_lexical_generality_cutoff$ = null;
    $html_concept_filters$ = null;
    $doc_tagger_default_style$ = null;
    $browser_tagging_lexicons$ = null;
    $cb_tag_document_to_html$ = null;
    $cb_tag_document_to_xml$ = null;
    $dtp_tag_concepts_iterator_state$ = null;
    $tag_concepts_quicklyP$ = null;
    $registered_concept_taggers$ = null;
    $dtp_concept_tagger$ = null;
    $concept_tagger_test_docs$ = null;
    $int0$400000 = makeInteger( 400000 );
    $sym1$TAG_CONCEPTS = makeSymbol( "TAG-CONCEPTS" );
    $sym2$DOCUMENT_P = makeSymbol( "DOCUMENT-P" );
    $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P = makeSymbol( "TAG-CONCEPTS-OPTIONAL-ARGS-P" );
    $sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-DONE-P" );
    $sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-NEXT" );
    $list6 = ConsesLow.list( makeKeyword( "LEXICON" ), makeKeyword( "OUTPUT-SPEC" ), makeKeyword( "FILTER" ), makeKeyword( "SENSE-TAGGER" ), makeKeyword( "TIMEOUT" ) );
    $kw7$LEXICON = makeKeyword( "LEXICON" );
    $kw8$FILTER = makeKeyword( "FILTER" );
    $sym9$GET_NEXT_SENTENCE_ANNOTATION = makeSymbol( "GET-NEXT-SENTENCE-ANNOTATION" );
    $sym10$ITERATOR_P = makeSymbol( "ITERATOR-P" );
    $sym11$ANNOTATION_COMPLETE_ = makeSymbol( "ANNOTATION-COMPLETE?" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "DOCUMENT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "OPTIONAL-ARG-PLIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$ITER = makeUninternedSymbol( "ITER" );
    $sym14$CLET = makeSymbol( "CLET" );
    $sym15$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol( "WITH-SBHL-RESOURCED-MARKING-SPACES" );
    $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol( "WITH-POSSIBLY-NEW-MEMOIZATION-STATE" );
    $sym17$WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE = makeSymbol( "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE" );
    $sym18$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym19$ALL_TAGGED_CONCEPTS = makeSymbol( "ALL-TAGGED-CONCEPTS" );
    $str20$d__ = makeString( "d~%" );
    $str21$p__ = makeString( "p~%" );
    $str22$s__ = makeString( "s~%" );
    $str23$w_A_A_A_A__A = makeString( "w~A~A~A~A ~A" );
    $str24$_A_A = makeString( "~A~A" );
    $str25$__ = makeString( "~%" );
    $list26 = ConsesLow.list( ConsesLow.list( makeString( "6" ), makeString( "The Cyc Commonsense Ontology" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ),
        constant_handles.reader_make_constant_shell( makeString( "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles
            .reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ) ), ConsesLow.list( makeString( "0" ), makeString( "Entire Cyc KB" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCycOntology" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ) ), ConsesLow.list( makeString( "1" ), makeString( "Medical Filter" ), ConsesLow
                        .list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CAEMedicalResearchFilterTree" ) ),
                            constant_handles.reader_make_constant_shell( makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "TriggerFromConceptSpecOrInstance" ) ) ) ), ConsesLow.list( makeString( "2" ), makeString( "Military Taxonomy" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "ConceptFilterSpecificationFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptNodesForTaxonFn" ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "MilitaryThingTaxonomy" ) ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "TriggerFromConceptSpecOrInstance" ) ) ) ), ConsesLow.list( makeString( "3" ), makeString( "Terrorism Filter" ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "ConceptNodesForTaskTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntelligenceAnalysisTask-Allotment" ) ) ), constant_handles
                                                        .reader_make_constant_shell( makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "TriggerFromConceptSpecOrInstance" ) ) ) ), ConsesLow.list( makeString( "4" ), makeString( "Food & Drink Taxonomy" ), ConsesLow.list( constant_handles
                                                                .reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                    "FoodAndDrinkTaxonomy" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles
                                                                        .reader_make_constant_shell( makeString( "TriggerFromConceptSpecOrInstance" ) ) ) ), ConsesLow.list( makeString( "5" ), makeString(
                                                                            "Investment Taxonomy" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ),
                                                                                constant_handles.reader_make_constant_shell( makeString( "InvestmentRelatedThingTaxonomy" ) ), constant_handles.reader_make_constant_shell(
                                                                                    makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                        "TriggerFromConceptSpecOrInstance" ) ) ) ) );
    $sym27$XML_TAG_DOCUMENT = makeSymbol( "XML-TAG-DOCUMENT" );
    $kw28$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $sym29$TAG_DOCUMENT_XML = makeSymbol( "TAG-DOCUMENT-XML" );
    $str30$utf_8 = makeString( "utf-8" );
    $str31$document = makeString( "document" );
    $str32$xmlns = makeString( "xmlns" );
    $str33$http___ws_opencyc_org_xsd_TextPro = makeString( "http://ws.opencyc.org/xsd/TextProcessing" );
    $kw34$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str35$meta = makeString( "meta" );
    $str36$title = makeString( "title" );
    $str37$uri = makeString( "uri" );
    $str38$tagset = makeString( "tagset" );
    $str39$element = makeString( "element" );
    $str40$start = makeString( "start" );
    $str41$source = makeString( "source" );
    $str42$___CDATA__A___ = makeString( "<![CDATA[~A]]>" );
    $sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM = makeSymbol( "SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM" );
    $str44$sense = makeString( "sense" );
    $str45$xmlns_concepts = makeString( "xmlns:concepts" );
    $str46$http___ws_opencyc_org_xsd_CycConc = makeString( "http://ws.opencyc.org/xsd/CycConcepts" );
    $str47$concept = makeString( "concept" );
    $str48$concepts_externalId = makeString( "concepts:externalId" );
    $str49$concepts_preferredNl = makeString( "concepts:preferredNl" );
    $str50$xml_lang = makeString( "xml:lang" );
    $str51$en = makeString( "en" );
    $str52$concepts_cycl = makeString( "concepts:cycl" );
    $str53$Predicate = makeString( "Predicate" );
    $str54$Collection = makeString( "Collection" );
    $str55$Individual = makeString( "Individual" );
    $str56$concepts_conceptType = makeString( "concepts:conceptType" );
    $str57$type = makeString( "type" );
    $str58$_cycl__font_family__sans_serif__c = makeString( ".cycl {font-family: sans-serif; color: #0000FF; font-size: smaller}\n     .weight {font-family: sans-serif; color: #AA00EE; font-size: smaller}" );
    $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str60$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $str61$ = makeString( "" );
    $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT = makeSymbol( "MAYBE-HTML-EXTRACT-FROM-DOCUMENT" );
    $sym63$HTML_TAG_DOCUMENT = makeSymbol( "HTML-TAG-DOCUMENT" );
    $kw64$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym65$HTML_TAG_DOCUMENT_INT = makeSymbol( "HTML-TAG-DOCUMENT-INT" );
    $str66$_A = makeString( "~A" );
    $str67$__ = makeString( " (" );
    $sym68$WEIGHT_ = makeSymbol( "WEIGHT>" );
    $sym69$GET_NL_INTERP_WEIGHT = makeSymbol( "GET-NL-INTERP-WEIGHT" );
    $sym70$GET_NL_INTERP_CYCL = makeSymbol( "GET-NL-INTERP-CYCL" );
    $str71$_ = makeString( " " );
    $str72$cycl = makeString( "cycl" );
    $str73$_S = makeString( "~S" );
    $str74$weight = makeString( "weight" );
    $str75$__A = makeString( " ~A" );
    $str76$_ = makeString( ")" );
    $str77$filter_id = makeString( "filter-id" );
    $list78 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCycOntology" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) );
    $sym79$FIRST = makeSymbol( "FIRST" );
    $sym80$ISOLATE = makeSymbol( "ISOLATE" );
    $kw81$PREFERRED = makeKeyword( "PREFERRED" );
    $sym82$SET_LEARNERS = makeSymbol( "SET-LEARNERS" );
    $sym83$STANFORD_NER_LEARN = makeSymbol( "STANFORD-NER-LEARN" );
    $sym84$ADD_LEARNER = makeSymbol( "ADD-LEARNER" );
    $sym85$NUMBER_LEARN = makeSymbol( "NUMBER-LEARN" );
    $sym86$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $sym87$ADD_CONCEPT_FILTER_SPEC = makeSymbol( "ADD-CONCEPT-FILTER-SPEC" );
    $sym88$IGNORE_CACHE = makeSymbol( "IGNORE-CACHE" );
    $sym89$SET_BASE_MT = makeSymbol( "SET-BASE-MT" );
    $sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS = makeSymbol( "GET-TAGGED-DOCUMENT-FROM-PARAMS" );
    $kw91$USE_NER = makeKeyword( "USE-NER" );
    $str92$NIL = makeString( "NIL" );
    $kw93$EXHAUSTIVE_TAGGING = makeKeyword( "EXHAUSTIVE-TAGGING" );
    $kw94$IGNORE_POS_TAGGER = makeKeyword( "IGNORE-POS-TAGGER" );
    $kw95$SENTENCIFY = makeKeyword( "SENTENCIFY" );
    $kw96$LEXICAL_MT = makeKeyword( "LEXICAL-MT" );
    $kw97$CASE_SENSITIVITY = makeKeyword( "CASE-SENSITIVITY" );
    $kw98$OFF = makeKeyword( "OFF" );
    $kw99$CONCEPT_FILTER = makeKeyword( "CONCEPT-FILTER" );
    $list100 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheCycOntology" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ) );
    $kw101$ANNOTATE_SPECS = makeKeyword( "ANNOTATE-SPECS" );
    $kw102$ANNOTATE_INSTANCES = makeKeyword( "ANNOTATE-INSTANCES" );
    $kw103$MIN_LEXICAL_STRENGTH = makeKeyword( "MIN-LEXICAL-STRENGTH" );
    $list104 = ConsesLow.list( makeKeyword( "MINIMAL" ), makeKeyword( "CONTEXT-SENSITIVE" ) );
    $const105$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell( makeString( "ContextuallyDependentLexicalMapping" ) );
    $list106 = ConsesLow.list( makeKeyword( "PRIMARY" ) );
    $const107$PrimaryLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "PrimaryLexicalMapping" ) );
    $kw108$VANISHINGLY_RARE = makeKeyword( "VANISHINGLY-RARE" );
    $str109$inputText = makeString( "inputText" );
    $str110$use_ner = makeString( "use-ner" );
    $str111$exhaustive_tagging = makeString( "exhaustive-tagging" );
    $str112$ignore_pos_tagger = makeString( "ignore-pos-tagger" );
    $str113$sentencify = makeString( "sentencify" );
    $str114$lexicalMt = makeString( "lexicalMt" );
    $sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = makeSymbol( "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC" );
    $sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = makeSymbol( "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC" );
    $sym117$EXHAUSTIVE_CONCEPT_TAGGER = makeSymbol( "EXHAUSTIVE-CONCEPT-TAGGER" );
    $sym118$SIMPLE_CONCEPT_TAGGER = makeSymbol( "SIMPLE-CONCEPT-TAGGER" );
    $sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER = makeSymbol( "POS-TAGGING-EXHAUSTIVE-CONCEPT-TAGGER" );
    $sym120$POS_TAGGING_CONCEPT_TAGGER = makeSymbol( "POS-TAGGING-CONCEPT-TAGGER" );
    $str121$disambiguate = makeString( "disambiguate" );
    $str122$lexicalStrength = makeString( "lexicalStrength" );
    $list123 = ConsesLow.list( makeString( "rule" ), makeString( "true" ), makeString( "maximal" ) );
    $list124 = ConsesLow.list( makeString( "minimal" ), makeString( "context_sensitive" ) );
    $list125 = ConsesLow.list( makeString( "primary" ) );
    $str126$vanishingly_rare = makeString( "vanishingly_rare" );
    $str127$allowSpecs = makeString( "allowSpecs" );
    $sym128$READ_MULTIPLE_TERMS_FROM_STRING = makeSymbol( "READ-MULTIPLE-TERMS-FROM-STRING" );
    $str129$allowInstances = makeString( "allowInstances" );
    $sym130$CB_GUESS_TERM = makeSymbol( "CB-GUESS-TERM" );
    $str131$caseSensitivity = makeString( "caseSensitivity" );
    $str132$preferred = makeString( "preferred" );
    $list133 = ConsesLow.list( makeString( "on" ), makeString( "t" ) );
    $kw134$ON = makeKeyword( "ON" );
    $list135 = ConsesLow.list( makeString( "off" ), makeString( "f" ) );
    $list136 = ConsesLow.list( makeString( "preferred" ), makeString( ":preferred" ) );
    $str137$Invalid_argument_for_case_sensiti = makeString( "Invalid argument for case-sensitivity ~S" );
    $str138$text_html = makeString( "text/html" );
    $str139$text_xml = makeString( "text/xml" );
    $sym140$CB_TAG_DOCUMENT_HANDLER = makeSymbol( "CB-TAG-DOCUMENT-HANDLER" );
    $sym141$CB_XML_TAG_DOCUMENT = makeSymbol( "CB-XML-TAG-DOCUMENT" );
    $str142$Concept_Tagger_Web_Service = makeString( "Concept Tagger Web Service" );
    $kw143$CB_CYC = makeKeyword( "CB-CYC" );
    $kw144$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw145$SHA1 = makeKeyword( "SHA1" );
    $str146$yui_skin_sam = makeString( "yui-skin-sam" );
    $str147$reloadFrameButton = makeString( "reloadFrameButton" );
    $str148$button = makeString( "button" );
    $str149$reload = makeString( "reload" );
    $str150$Refresh_Frames = makeString( "Refresh Frames" );
    $str151$post = makeString( "post" );
    $str152$cb_tag_document_handler = makeString( "cb-tag-document-handler" );
    $int153$100 = makeInteger( 100 );
    $str154$virtual = makeString( "virtual" );
    $str155$Tag_to__ = makeString( "Tag to: " );
    $list156 = ConsesLow.list( makeSymbol( "ID-NUM" ), makeSymbol( "DISPLAY-STRING" ), makeSymbol( "CYCL" ) );
    $str157$Lexical_Mt__optional_ = makeString( "Lexical Mt (optional)" );
    $int158$60 = makeInteger( 60 );
    $str159$_Use_Named_Entity_Recognizer = makeString( " Use Named Entity Recognizer" );
    $str160$t = makeString( "t" );
    $str161$_Ignore_Part_of_speech_tagger = makeString( " Ignore Part-of-speech tagger" );
    $str162$_Obey_computed_sentence_boundarie = makeString( " Obey computed sentence boundaries?" );
    $str163$Should_complex_phrases_also_get_i = makeString( "Should complex phrases also get interpretations for the simpler words contained within them?" );
    $str164$_Tag_Exhaustively = makeString( " Tag Exhaustively" );
    $str165$_Disambiguation__ = makeString( " Disambiguation: " );
    $kw166$T = makeKeyword( "T" );
    $str167$rule = makeString( "rule" );
    $str168$Maximal = makeString( "Maximal" );
    $kw169$NIL = makeKeyword( "NIL" );
    $str170$none = makeString( "none" );
    $str171$None = makeString( "None" );
    $str172$_Minimum_Lexical_Strength__ = makeString( " Minimum Lexical Strength: " );
    $str173$primary = makeString( "primary" );
    $str174$Use_only_primary_mappings = makeString( "Use only primary mappings" );
    $str175$context_sensitive = makeString( "context_sensitive" );
    $str176$Exclude_vanishingly_rare_mappings = makeString( "Exclude vanishingly rare mappings" );
    $str177$Use_all_lexical_mappings = makeString( "Use all lexical mappings" );
    $str178$_Extract_Propositional_Informatio = makeString( " Extract Propositional Information (HTML-only)" );
    $str179$extract_info = makeString( "extract-info" );
    $str180$Tag_to_XML = makeString( "Tag to XML" );
    $str181$Tag_to_HTML = makeString( "Tag to HTML" );
    $sym182$TAG_CONCEPTS_ITERATOR_STATE = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE" );
    $sym183$TAG_CONCEPTS_ITERATOR_STATE_P = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-P" );
    $list184 = ConsesLow.list( makeSymbol( "SENTENCES-TO-DO" ), makeSymbol( "DOCUMENT" ), makeSymbol( "LEXICON" ), makeSymbol( "SENSE-TAGGER" ), makeSymbol( "FILTER" ), makeSymbol( "OUTPUT-SPEC" ), makeSymbol(
        "PREPARED-SENTENCE-OUTPUT" ) );
    $list185 = ConsesLow.list( makeKeyword( "SENTENCES-TO-DO" ), makeKeyword( "DOCUMENT" ), makeKeyword( "LEXICON" ), makeKeyword( "SENSE-TAGGER" ), makeKeyword( "FILTER" ), makeKeyword( "OUTPUT-SPEC" ), makeKeyword(
        "PREPARED-SENTENCE-OUTPUT" ) );
    $list186 = ConsesLow.list( makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO" ), makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT" ), makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-LEXICON" ), makeSymbol(
        "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER" ), makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-FILTER" ), makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC" ), makeSymbol(
            "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" ) );
    $list187 = ConsesLow.list( makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO" ), makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT" ), makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON" ),
        makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER" ), makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER" ), makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC" ), makeSymbol(
            "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" ) );
    $sym188$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym189$TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list190 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-P" ) );
    $sym191$TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO" );
    $sym192$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO" );
    $sym193$TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT" );
    $sym194$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT" );
    $sym195$TAG_CONCEPTS_ITERATOR_STATE_LEXICON = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-LEXICON" );
    $sym196$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON" );
    $sym197$TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER" );
    $sym198$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER" );
    $sym199$TAG_CONCEPTS_ITERATOR_STATE_FILTER = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-FILTER" );
    $sym200$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER" );
    $sym201$TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC" );
    $sym202$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC" );
    $sym203$TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol( "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" );
    $sym204$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol( "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT" );
    $kw205$SENTENCES_TO_DO = makeKeyword( "SENTENCES-TO-DO" );
    $kw206$DOCUMENT = makeKeyword( "DOCUMENT" );
    $kw207$SENSE_TAGGER = makeKeyword( "SENSE-TAGGER" );
    $kw208$OUTPUT_SPEC = makeKeyword( "OUTPUT-SPEC" );
    $kw209$PREPARED_SENTENCE_OUTPUT = makeKeyword( "PREPARED-SENTENCE-OUTPUT" );
    $str210$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw211$BEGIN = makeKeyword( "BEGIN" );
    $sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE = makeSymbol( "MAKE-TAG-CONCEPTS-ITERATOR-STATE" );
    $kw213$SLOT = makeKeyword( "SLOT" );
    $kw214$END = makeKeyword( "END" );
    $sym215$VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD" );
    $sym216$LEARN = makeSymbol( "LEARN" );
    $sym217$YIELD = makeSymbol( "YIELD" );
    $sym218$GET_LEXES = makeSymbol( "GET-LEXES" );
    $sym219$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw220$INTERPS = makeKeyword( "INTERPS" );
    $kw221$CYC_POS = makeKeyword( "CYC-POS" );
    $kw222$LEX_ENTRIES = makeKeyword( "LEX-ENTRIES" );
    $kw223$STRING = makeKeyword( "STRING" );
    $sym224$GET_STRING = makeSymbol( "GET-STRING" );
    $kw225$CATEGORY = makeKeyword( "CATEGORY" );
    $kw226$INFO = makeKeyword( "INFO" );
    $sym227$PARSE = makeSymbol( "PARSE" );
    $sym228$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym229$LEXIFY = makeSymbol( "LEXIFY" );
    $str230$_______________Error_____________ = makeString( "***************Error*****************" );
    $str231$Caught__S_while_processing__S__ = makeString( "Caught ~S while processing ~S~%" );
    $sym232$CONCEPT_TAGGER = makeSymbol( "CONCEPT-TAGGER" );
    $sym233$CONCEPT_TAGGER_P = makeSymbol( "CONCEPT-TAGGER-P" );
    $list234 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "TAG-METHOD" ), makeSymbol( "LEXICON-METHOD" ) );
    $list235 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "TAG-METHOD" ), makeKeyword( "LEXICON-METHOD" ) );
    $list236 = ConsesLow.list( makeSymbol( "CONCEPT-TAGGER-NAME" ), makeSymbol( "CONCEPT-TAGGER-TAG-METHOD" ), makeSymbol( "CONCEPT-TAGGER-LEXICON-METHOD" ) );
    $list237 = ConsesLow.list( makeSymbol( "_CSETF-CONCEPT-TAGGER-NAME" ), makeSymbol( "_CSETF-CONCEPT-TAGGER-TAG-METHOD" ), makeSymbol( "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD" ) );
    $sym238$PRINT_CONCEPT_TAGGER = makeSymbol( "PRINT-CONCEPT-TAGGER" );
    $sym239$CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE" );
    $list240 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CONCEPT-TAGGER-P" ) );
    $sym241$CONCEPT_TAGGER_NAME = makeSymbol( "CONCEPT-TAGGER-NAME" );
    $sym242$_CSETF_CONCEPT_TAGGER_NAME = makeSymbol( "_CSETF-CONCEPT-TAGGER-NAME" );
    $sym243$CONCEPT_TAGGER_TAG_METHOD = makeSymbol( "CONCEPT-TAGGER-TAG-METHOD" );
    $sym244$_CSETF_CONCEPT_TAGGER_TAG_METHOD = makeSymbol( "_CSETF-CONCEPT-TAGGER-TAG-METHOD" );
    $sym245$CONCEPT_TAGGER_LEXICON_METHOD = makeSymbol( "CONCEPT-TAGGER-LEXICON-METHOD" );
    $sym246$_CSETF_CONCEPT_TAGGER_LEXICON_METHOD = makeSymbol( "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD" );
    $kw247$NAME = makeKeyword( "NAME" );
    $kw248$TAG_METHOD = makeKeyword( "TAG-METHOD" );
    $kw249$LEXICON_METHOD = makeKeyword( "LEXICON-METHOD" );
    $sym250$MAKE_CONCEPT_TAGGER = makeSymbol( "MAKE-CONCEPT-TAGGER" );
    $sym251$VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD" );
    $str252$__Concept_Tagger__A_ = makeString( "#<Concept-Tagger:~A>" );
    $str253$_S_is_not_a_registered_concept_ta = makeString( "~S is not a registered concept-tagger" );
    $str254$_S_is_not_a_registered_concept_ta = makeString( "~S is not a registered concept tagger" );
    $sym255$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym256$LEXIFY_SENTENCE_EXHAUSTIVELY = makeSymbol( "LEXIFY-SENTENCE-EXHAUSTIVELY" );
    $sym257$GET_CONCEPT_FILTER_SPECS = makeSymbol( "GET-CONCEPT-FILTER-SPECS" );
    $sym258$GET = makeSymbol( "GET" );
    $sym259$TAG_CONCEPTS_USING_POS_TAGS = makeSymbol( "TAG-CONCEPTS-USING-POS-TAGS" );
    $sym260$NEW_TERM_LEXICON = makeSymbol( "NEW-TERM-LEXICON" );
    $sym261$TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS = makeSymbol( "TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS" );
    $sym262$TAG_CONCEPTS_FAST = makeSymbol( "TAG-CONCEPTS-FAST" );
    $sym263$TAG_CONCEPTS_FAST_EXHAUSTIVELY = makeSymbol( "TAG-CONCEPTS-FAST-EXHAUSTIVELY" );
    $sym264$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym265$ALLOW_PREDICATE = makeSymbol( "ALLOW-PREDICATE" );
    $const266$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $sym267$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $const268$ksTermString = constant_handles.reader_make_constant_shell( makeString( "ksTermString" ) );
    $sym269$EXCLUDE_POS = makeSymbol( "EXCLUDE-POS" );
    $const270$ClosedClassWord = constant_handles.reader_make_constant_shell( makeString( "ClosedClassWord" ) );
    $sym271$ALLOW_MT = makeSymbol( "ALLOW-MT" );
    $const272$RelationParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "RelationParaphraseMt" ) );
    $sym273$STANFORD_NER_DATE_LEARN = makeSymbol( "STANFORD-NER-DATE-LEARN" );
    $kw274$WARN = makeKeyword( "WARN" );
    $list275 = ConsesLow.list( makeKeyword( "DEFAULT" ) );
    $kw276$DENOT = makeKeyword( "DENOT" );
    $kw277$CYCL = makeKeyword( "CYCL" );
    $kw278$PHRASE_TYPES = makeKeyword( "PHRASE-TYPES" );
    $kw279$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $kw280$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $const281$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym282$PARSING_REWRITE_OF_INVERSE_ = makeSymbol( "PARSING-REWRITE-OF-INVERSE?" );
    $kw283$TRIE_ENTRY = makeKeyword( "TRIE-ENTRY" );
    $kw284$COMPLEX = makeKeyword( "COMPLEX" );
    $kw285$INTERP_SPEC = makeKeyword( "INTERP-SPEC" );
    $kw286$SIMPLE = makeKeyword( "SIMPLE" );
    $sym287$INTERSECTION = makeSymbol( "INTERSECTION" );
    $kw288$DEFAULT = makeKeyword( "DEFAULT" );
    $const289$ImplementationConstant = constant_handles.reader_make_constant_shell( makeString( "ImplementationConstant" ) );
    $sym290$KEYWORDP = makeSymbol( "KEYWORDP" );
    $const291$InstanceFn = constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) );
    $const292$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str293$T = makeString( "T" );
    $list294 = ConsesLow.list( makeString( "doc-string" ), makeString( "Bananas and kiwis are fruit" ) );
    $list295 = ConsesLow.list( makeString( "submit-button" ), makeString( "Display as HTML" ) );
    $str296$doc_string = makeString( "doc-string" );
    $list297 = ConsesLow.list( makeString( "sumbit-button" ), makeString( "Display as HTML" ) );
    $sym298$FORGET = makeSymbol( "FORGET" );
    $kw299$OUTPUT = makeKeyword( "OUTPUT" );
    $str300$Unable_to_open__S = makeString( "Unable to open ~S" );
    $list301 = ConsesLow.list( makeString(
        "NEWS & NOTES\n\nThe San Francisco Chronicle reports this week on new measures that Whole Foods plans to take to increase its commitment to sustainable agriculture and local produce, including a requirement that all Whole Foods stores buy from at least four individual local farms, a pledge of $10 million a year in donations to small farms, and Sunday Farmers Markets in Whole Foods parking lots.\n\nThe Agriculture Department is proposing new legislation that would loosen the standards for what is classified as grass-fed, reports The New York Times. Under the proposed rule, it is possible that animals that were not raised on a pasture and were given antibiotics and hormones could still be considered grass-fed.\n\nGothamist provides tips on how to prepare and store lettuce, which they like to get from Gorzynski Organic Farm at the Union Square Greenmarket.\n\nGET OUT OF TOWN\n\nThe New York Times has a series of articles this week on road trips to various farms, purveyors, and eateries in Columbia County, NY, Long Beach Island, NJ, Litchfield County, CT, and North Folk, NY. If you're looking for more ideas, several Greenmarket farms offer \"pick-your-own\" or \"make-your-own\" activities:\n\n    * You can pick-your-own fruit at Phillips Farms in Milford, NJ every day except for Tuesdays, from 8:00 a.m. to 8:00 p.m. Go now and catch the tail end of the blueberry season. Peaches, raspberries, and blackberries are also ready to be picked (or will be shortly). Call 908.995.0022 for more information.\n    * Prospect Hill Orchards offers seasonal pick-your-own weekends (9:00 a.m. to 4:00 p.m.). Right now, peaches (donut, yellow, and white) are ripe and ready. Nectarines can be picked starting the second weekend of August. Come mid-September, apples, pears, and pumpkins will be available. Contact Steve, Judy, or Brad Clarke at 845.795.2383 for more information.\n    * Learn old-fashioned cheesemaking at Valley Shepherd Creamery in Long Valley, NJ. You'll get to make your own cheese wheel, which you leave in the Creamery's hillside aging cave and pick up when it's ready in 60 to 75 days. The next cheesemaking class is September 17th. It costs $129 and includes the cheese class, cheese tasting, a tour, luncheon, and the wheel of cheese. Call 908.876.3200 for more information.\n\nWHAT'S IN, WHAT'S OUT\n\nBaby organic carrots ($1.50/bunch) and hot peppers (6/$1.00) from HydroGarden Farm...hyssop tea (\"licorice flavor, heals the lungs\") and lemon verbena tea ($1.00) from Berried Treasures...cranberry beans ($3.00/lb.) and yellow plum tomatoes ($2.50/lb) at Migliorelli Farm...blackberries ($4.00/half pint) from Locust Grove and Breezy Hill Orchard...early red free apples ($1.50) from Oak Grove Plantation...more varieties of apples from Caradonna, including red delicious, pristine, golden delicious, empire, mutsu, and cameo ($.75 to $1.25/lb.)...cubanelles ($2.40/lb.) from Keith's.\n\nDue to popular demand, Lynnhaven now has feta in brine (which gives it its characteristic saltiness). Feta crumbles not in brine are still available ($5.00).\n\nTamarack Hollow Farm is now taking orders for holiday ham, duck, goose, and suckling pig.\n\nRhubarb and fava beans are essentially gone...cherries are becoming less abundant...only tri-star strawberries are left.\n\nFOCUS ON: Just Rugelach\n\nRugelach Although the labels on their goods and the sign on their stand say \"Just Rugelach,\" perhaps the name on their CENY placard - \"Not Just Rugelach\" - is more apt. In addition to the traditional Jewish treat, they sell a wide array of baked goods: everything from muffins, strudels, bread, and cookies to more uncommon items. Take the roast pork buns: Roselie Halik, who runs the company with her husband Tom, explains that when she was pregnant she was craving them and Tom developed the recipe for her. They liked it so much that they kept it around and sell it at market to this day. Both times I visited them at the Tribeca Greenmarket, numerous patrons came just for these doughy delicacies, which they sell for $1.00 each.\n\nTom Halik started the company in 1995 after attending culinary school in Paris and working at the 5th Avenue Epicure in New York (where he met Roselie). He has come to be known as \"the rugelach man\" in Kearny, NJ, where they are based.  Everything is made from scratch, every day, and Tom is always working to improve his recipes: \"constantly developing,\" Roselie says. She tries all the recipes as her husband works on them, offering advice how they might be tweaked before they are finalized. \"I'm his biggest critic,\" she says with a laugh.\n\nDespite the array of baked goods they sell, Roselie says that \"people always come for the rugelach.\" Right now they offer four different flavors: walnut raison apricot, walnut raisin raspberry, chocolate hazelnut, and cinnamon raisin. She says they try to make seasonal varieties, but always keep their standbys, like the classic walnut raisin apricot. Their rugelach can be bought wholesale or through mail order and at any of their Greenmarket locations throughout the city (see FARMER INFORMATION). Rugelach is 50 cents a piece or $2.00/quarter pound.\n\nFARMER INFORMATION\n\n    * Berried Treasures, Cooks Falls, NY. At the Union Square Greenmarket Wednesdays and Fridays.\n    * Breezy Hill Orchard, Staatsburg, NY. At the Union Square Greenmarket Wednesdays and Saturdays and the Orchard Street Market on Sundays (845.266.3979).\n    * Caradonna, at the Union Square Greenmarket Wednesdays and Saturdays.\n    * Hydro Garden Farm, Yaphank, NY. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (631.286.3423).\n    * Just Rugelach, Kearny, NJ. At the Tribeca Greenmarket Wednesdays and Saturdays, Brooklyn Borough Hall Greenmarket Tuesdays and Saturdays, UN Plaza Greenmarket on Wednesdays,  Bowling Green Greenmarket on Thursdays, and 77th Street Greenmarket and Jackson Heights Greenmarket on Sundays (201.246.9211).\n    * Keith's Farm, Westtown, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.856.4955).\n    * Locust Grove, Milton, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.795.5194).\n    * Lynnhaven, Pine Bush, NY. At the Union Square Greenmarket on Wednesdays (845.744.6089).\n    * Migliorelli Farm, Tivoli, NY. At the Union Square Greenmarket Wednesdays, Fridays, and Saturdays.\n    * Oak Grove Plantation, at the Union Square Greenmarket Fridays and Saturdays.\n    * Phillips Farms, Milford, NJ. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (908.995.0022).\n    * Prospect Hill Orchards, Milton, NY. At the Tribeca Greenmarket Saturdays (845.795.2383).\n    * Tamarack Hollow Farm, Corinth, VT. At the Union Square Greenmarket on Wednesdays (802.439.5078)\n    * Valley Shepherd Creamery, Long Valley, NJ. At the Union Square Greenmarket Wednesdays and Saturdays and the Tribeca Greenmarket on Wednesdays (908.876.3200)." ),
        makeString(
            "Cheap Fun Wines\nCheap Fun Wines.com is on a mission to find the most luscious wines on the planet for under $20.\n\nLeather Wine ToteThere are some days when it's fine to be swinging your bottles around in a nylon wine tote, but sometimes you need to class things up a bit. Enter the leather wine carrier from Wine Enthusiast, available at Amazon - it holds two bottles and your opening gear, and it makes you look a little less K-Mart and a little more J. Peterman.\n\n    Product Description\n\nWhen an invitation restaurant or learned palate requires you to 'bring your own' you can do so at last with classic style and good taste. Our two-bottle wine tote is crafted of beautifully thick and supple nubuck with a warm brown finish that is smooth natural and surprisingly rugged. Features a zippered compartment to keep your corkscrew and antique-finished brass hardware for a handsome conclusion to this superior piece. Also holds champagne.from Amazon" ),
        makeString(
            "Vagablond - Stylish Travel, Food & Wine Blog\nThe globetrotter's guide to fashionable travel, wine, and food.\n\nI've bought $100 bottles of wine and $10 bottles. Mostly the latter. But to some, $500 for 25.6 ounces of fermented grape juice and yeast is a price well worth paying. These are the \"baseball card collectors\" of wine who buy some to save, some to trade and some to sell.\n\nAccording to an article, \"Worth Its Weight In Gold?\" in today's SF Chronicle, \"$100 is a midrange price for a top-notch Napa Valley Cabernet Sauvignon, and with the price of Screaming Eagle Cabernet soaring to $500 with the October release of the 2003 vintage, expect others to follow along.\"" ),
        makeString(
            "Accidental Hedonist\n\nIn writing about the French restaurants, I came to question just exactly where the idea of \"restaurants\" comes from. As per usual, I've discovered something that I have previously did not know.\n\nThe word itself provides a fair amount of clues...restaurant comes from the Old French term restaurateur, which meant someone who provides (i.e. sells) restaurer. Restauarer means \"to restore\". In other words - a \"restorative\".\n\nIf one were to look back in the history books for the word \"restaurant\", the first appearance shows up in the 15th century as a recipe. In this recipe, a capon is rendered in a glass kettle along with gold or gems. This itself also help evolve into the idea that chicken soup can cures what ails.\n\nOver the course of years, restaurants evolved from gold laden rendered chicken, into soups and broths which were sold to the public by specific people. Much like other food producers, restaurateurs had their own guild and were able to sell the broth, much like charcutiers sold sausages and rotisseurs sold fresh game.\n\nIt was this collection of different vendors and sellers of food that allowed restaurateurs to flourish. The French Revolution helped take down, not just a monarchy, but the economic system of guilds that sometimes prevented one food producer from selling products that were typically the \"responsibility\" of another. Additionally the bourgeoisie became a viable economic force as tradesmen and artisans started to travel to other areas of France to find new markets for their wares. These traveling businessmen looked for places to eat which offered a variety of foods in a comforting atmosphere that reflected their own station in life. These were variables that inns and taverns (the initial purveyors of food to travelers) could not meet on a regular basis.\n\nRestaurants filled this void nicely, first by selling varieties of bouillon. Then, as the guikld system slowly dissolved away, they started offering other foodstuffs, such as soups, meats and pastries. This eventually (and quickly) evolved into businesses that resemble the restaurants we know of today.\n\nWho would have thought that the creation of restaurants was so involved?\n\nTechnorati Tags: Restaurants, Food, Food+History " ),
        makeString(
            "Wine Camp\nA wine blog with a terroir-ist twist.\n\nmikerichmond.jpgBouchaine is a winery that seemed always to be around, but was never exciting. While one of the founders of Carneros as a top pinot noir region, Bouchaine always remained in the shadow of its neighbors Acacia and Saintsbury. While some good wines were made at Bouchaine, other wineries rode the Carneros wave to the top.\n\nNow things are turned around and the same thing that took Acacia to the top is now powering Bouchaine, which has finally taken its place on the \"A\" team of Carneros producers. What made the wines of Acacia compelling was the talent, intelligence and passion of winemaker Mike Richmond, who has now taken his considerable talents to Bouchaine. \n\nMeanwhile the once revered Acacia winery has been turned into an industrial production line of plonk pinot by alcoholic beverage super-giant Diageo and now Acacia is involved in hand-to-hand combat with Sanford Winery and other corporate pinot noir producers to see who can sell the most boxes of indistinguishable pinot noir. If you are trying to decide between which of these labels to buy you should flip a coin or buy the cheapest because what's in the bottle is of little consequence or interest.\n\nAt this year's International Pinot Noir Celebration (IPNC), Mike Richmond presented his first Bouchaine Pinot Noir that he was responsible for from start to finish and a very nice wine it is. The 2004 Bouchaine Carneros Estate Pinot Noir is a lovely wine with a graceful balance and an intriguing subtle character. It certainly shows the richer characteristics of California, but is still restrained and complex with a lingering, not heavy finish.\n\nThe emergence of Bouchaine as a first class Carneros pinot noir producer reminds us that while great wines are made in the vineyard, you have to know what to do with those grapes when you get them. Mike Richmond obviously knows what to do and, perhaps more importantly when it comes to pinot noir - what not to do. " ) );
    $sym302$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS = makeSymbol( "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS" );
    $kw303$TEST = makeKeyword( "TEST" );
    $sym304$TERM_ABSENT_FROM_DOC_INTERPS = makeSymbol( "TERM-ABSENT-FROM-DOC-INTERPS" );
    $kw305$OWNER = makeKeyword( "OWNER" );
    $kw306$CLASSES = makeKeyword( "CLASSES" );
    $kw307$KB = makeKeyword( "KB" );
    $kw308$FULL = makeKeyword( "FULL" );
    $kw309$WORKING_ = makeKeyword( "WORKING?" );
    $list310 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "T" ), ConsesLow.list( makeString( "inputText" ), makeString( "an iranian" ) ), ConsesLow.list( makeString( "filter-id" ),
        makeString( "6" ) ), ConsesLow.list( makeString( "ignore-pos-tagger" ), makeString( "t" ) ), ConsesLow.list( makeString( "disambiguate" ), makeString( "none" ) ), ConsesLow.list( makeString( "lexicalStrength" ),
            makeString( "context_sensitive" ) ), ConsesLow.list( makeString( "return-mime-type:text/html" ), makeString( "Tag to HTML" ) ), ConsesLow.list( makeString( "uniquifier-code" ), makeString( "378" ) ) ) ),
        constant_handles.reader_make_constant_shell( makeString( "AndamanAndNicobarIslands-UnionTerritoryIndia" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "T" ), ConsesLow.list( makeString(
            "inputText" ), makeString( "an iranian" ) ), ConsesLow.list( makeString( "filter-id" ), makeString( "6" ) ), ConsesLow.list( makeString( "ignore-pos-tagger" ), makeString( "t" ) ), ConsesLow.list( makeString(
                "disambiguate" ), makeString( "maximal" ) ), ConsesLow.list( makeString( "lexicalStrength" ), makeString( "primary" ) ), ConsesLow.list( makeString( "return-mime-type:text/html" ), makeString(
                    "Tag to HTML" ) ), ConsesLow.list( makeString( "uniquifier-code" ), makeString( "378" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                        "AndamanAndNicobarIslands-UnionTerritoryIndia" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "T" ), ConsesLow.list( makeString( "inputText" ), makeString( "an iranian" ) ),
                            ConsesLow.list( makeString( "filter-id" ), makeString( "6" ) ), ConsesLow.list( makeString( "ignore-pos-tagger" ), makeString( "t" ) ), ConsesLow.list( makeString( "disambiguate" ),
                                makeString( "maximal" ) ), ConsesLow.list( makeString( "lexicalStrength" ), makeString( "primary" ) ), ConsesLow.list( makeString( "return-mime-type:text/html" ), makeString(
                                    "Tag to HTML" ) ), ConsesLow.list( makeString( "uniquifier-code" ), makeString( "378" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "TerroristOrganization-Aryan-Nations" ) ) ) );
    $sym311$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS = makeSymbol( "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS" );
    $sym312$TERM_IN_DOC_INTERPS = makeSymbol( "TERM-IN-DOC-INTERPS" );
    $list313 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "T" ), ConsesLow.list( makeString( "inputText" ), makeString( "an iranian" ) ), ConsesLow.list( makeString( "filter-id" ),
        makeString( "6" ) ), ConsesLow.list( makeString( "ignore-pos-tagger" ), makeString( "t" ) ), ConsesLow.list( makeString( "disambiguate" ), makeString( "none" ) ), ConsesLow.list( makeString( "lexicalStrength" ),
            makeString( "vanishingly_rare" ) ), ConsesLow.list( makeString( "return-mime-type:text/html" ), makeString( "Tag to HTML" ) ), ConsesLow.list( makeString( "uniquifier-code" ), makeString( "378" ) ) ) ),
        constant_handles.reader_make_constant_shell( makeString( "AndamanAndNicobarIslands-UnionTerritoryIndia" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "T" ), ConsesLow.list( makeString(
            "inputText" ), makeString( "an iranian" ) ), ConsesLow.list( makeString( "filter-id" ), makeString( "6" ) ), ConsesLow.list( makeString( "ignore-pos-tagger" ), makeString( "t" ) ), ConsesLow.list( makeString(
                "disambiguate" ), makeString( "maximal" ) ), ConsesLow.list( makeString( "lexicalStrength" ), makeString( "vanishingly_rare" ) ), ConsesLow.list( makeString( "return-mime-type:text/html" ), makeString(
                    "Tag to HTML" ) ), ConsesLow.list( makeString( "uniquifier-code" ), makeString( "378" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "TerroristOrganization-Aryan-Nations" ) ) ) );
    $sym314$TRUE = makeSymbol( "TRUE" );
    $list315 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DeltaOnQuantitySlotFn" ) ), constant_handles.reader_make_constant_shell(
        makeString( "gibbsFreeEnergyOfSystem" ) ), constant_handles.reader_make_constant_shell( makeString( "situationConcernsThermodynamicSystem" ) ) ) ), T ) );
    $list316 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "an iranian" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FILTER-ID" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles
            .reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ), makeKeyword( "IGNORE-POS-TAGGER" ), T,
        makeKeyword( "MIN-LEXICAL-STRENGTH" ), makeKeyword( "CONTEXT-SENSITIVE" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "AndamanAndNicobarIslands-UnionTerritoryIndia" ) ) ), ConsesLow.list(
            ConsesLow.list( makeString( "an iranian" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FILTER-ID" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ), makeKeyword( "IGNORE-POS-TAGGER" ), T, makeKeyword( "MIN-LEXICAL-STRENGTH" ),
                makeKeyword( "PRIMARY" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "AndamanAndNicobarIslands-UnionTerritoryIndia" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "an iranian" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FILTER-ID" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) ), makeKeyword( "IGNORE-POS-TAGGER" ), T, makeKeyword( "MIN-LEXICAL-STRENGTH" ), makeKeyword( "PRIMARY" ) ) ) ),
                    constant_handles.reader_make_constant_shell( makeString( "TerroristOrganization-Aryan-Nations" ) ) ) );
  }

  public static final class $tag_concepts_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $sentences_to_do;
    public SubLObject $document;
    public SubLObject $lexicon;
    public SubLObject $sense_tagger;
    public SubLObject $filter;
    public SubLObject $output_spec;
    public SubLObject $prepared_sentence_output;
    private static final SubLStructDeclNative structDecl;

    public $tag_concepts_iterator_state_native()
    {
      this.$sentences_to_do = CommonSymbols.NIL;
      this.$document = CommonSymbols.NIL;
      this.$lexicon = CommonSymbols.NIL;
      this.$sense_tagger = CommonSymbols.NIL;
      this.$filter = CommonSymbols.NIL;
      this.$output_spec = CommonSymbols.NIL;
      this.$prepared_sentence_output = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $tag_concepts_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentences_to_do;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$document;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lexicon;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$sense_tagger;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$filter;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$output_spec;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$prepared_sentence_output;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentences_to_do = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$document = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lexicon = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$sense_tagger = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$filter = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$output_spec = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$prepared_sentence_output = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $tag_concepts_iterator_state_native.class, $sym182$TAG_CONCEPTS_ITERATOR_STATE, $sym183$TAG_CONCEPTS_ITERATOR_STATE_P, $list184, $list185, new String[] {
        "$sentences_to_do", "$document", "$lexicon", "$sense_tagger", "$filter", "$output_spec", "$prepared_sentence_output"
      }, $list186, $list187, $sym188$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $tag_concepts_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $tag_concepts_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TAG-CONCEPTS-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return tag_concepts_iterator_state_p( arg1 );
    }
  }

  public static final class $concept_tagger_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $tag_method;
    public SubLObject $lexicon_method;
    private static final SubLStructDeclNative structDecl;

    public $concept_tagger_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$tag_method = CommonSymbols.NIL;
      this.$lexicon_method = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $concept_tagger_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$tag_method;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lexicon_method;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$tag_method = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lexicon_method = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $concept_tagger_native.class, $sym232$CONCEPT_TAGGER, $sym233$CONCEPT_TAGGER_P, $list234, $list235, new String[] { "$name", "$tag_method", "$lexicon_method"
      }, $list236, $list237, $sym238$PRINT_CONCEPT_TAGGER );
    }
  }

  public static final class $concept_tagger_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $concept_tagger_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONCEPT-TAGGER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return concept_tagger_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2749 ms
 * 
 */