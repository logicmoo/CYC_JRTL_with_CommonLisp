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

public final class concept_tagger extends SubLTranslatedFile
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
    public static SubLObject tag_concepts(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == concept_tagger.UNPROVIDED) {
            optional_arg_plist = (SubLObject)concept_tagger.NIL;
        }
        enforceType(v_document, concept_tagger.$sym2$DOCUMENT_P);
        enforceType(optional_arg_plist, concept_tagger.$sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P);
        final SubLObject augmented_plist = augment_tag_concepts_optional_arg_plist_with_defaults(optional_arg_plist);
        SubLObject sentences = (SubLObject)concept_tagger.NIL;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)concept_tagger.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)concept_tagger.NIL, v_iteration = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)concept_tagger.ONE_INTEGER)) {
            element_num = ((concept_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$1 = document.paragraph_sentences(paragraph);
            backwardP_var_$2 = (SubLObject)concept_tagger.NIL;
            for (length_$3 = Sequences.length(vector_var_$1), v_iteration_$4 = (SubLObject)concept_tagger.NIL, v_iteration_$4 = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = Numbers.add(v_iteration_$4, (SubLObject)concept_tagger.ONE_INTEGER)) {
                element_num_$5 = ((concept_tagger.NIL != backwardP_var_$2) ? Numbers.subtract(length_$3, v_iteration_$4, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration_$4);
                sentence = Vectors.aref(vector_var_$1, element_num_$5);
                sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
            }
        }
        sentences = Sequences.nreverse(sentences);
        return iteration.new_iterator(new_tag_concepts_iterator_state(sentences, v_document, augmented_plist), (SubLObject)concept_tagger.$sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P, (SubLObject)concept_tagger.$sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT, (SubLObject)concept_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 2070L)
    public static SubLObject tag_concepts_optional_args_p(final SubLObject obj) {
        if (concept_tagger.NIL == list_utilities.plist_restricted_to_indicatorsP(obj, (SubLObject)concept_tagger.$list6)) {
            return (SubLObject)concept_tagger.NIL;
        }
        if (concept_tagger.NIL == list_utilities.plist_has_keyP(obj, (SubLObject)concept_tagger.$kw7$LEXICON)) {
            return (SubLObject)concept_tagger.T;
        }
        if (concept_tagger.NIL == term_lexicon.term_lexicon_p(conses_high.getf(obj, (SubLObject)concept_tagger.$kw7$LEXICON, (SubLObject)concept_tagger.UNPROVIDED))) {
            return (SubLObject)concept_tagger.NIL;
        }
        if (concept_tagger.NIL != list_utilities.plist_has_keyP(obj, (SubLObject)concept_tagger.$kw8$FILTER)) {
            return (SubLObject)concept_tagger.NIL;
        }
        return (SubLObject)concept_tagger.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 2823L)
    public static SubLObject get_next_sentence_annotation(final SubLObject iterator) {
        enforceType(iterator, concept_tagger.$sym10$ITERATOR_P);
        return iteration.iteration_next(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3070L)
    public static SubLObject annotation_completeP(final SubLObject iterator) {
        enforceType(iterator, concept_tagger.$sym10$ITERATOR_P);
        return iteration.iteration_done(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3295L)
    public static SubLObject do_tagged_concepts_results(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result = (SubLObject)concept_tagger.NIL;
        SubLObject v_document = (SubLObject)concept_tagger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list12);
        result = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list12);
        v_document = current.first();
        current = current.rest();
        final SubLObject optional_arg_plist = (SubLObject)(current.isCons() ? current.first() : concept_tagger.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)concept_tagger.$list12);
        current = current.rest();
        if (concept_tagger.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject iter = (SubLObject)concept_tagger.$sym13$ITER;
            return (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iter, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$sym1$TAG_CONCEPTS, v_document, optional_arg_plist))), (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$sym15$WITH_SBHL_RESOURCED_MARKING_SPACES, (SubLObject)concept_tagger.SIX_INTEGER, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$sym17$WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE, (SubLObject)ConsesLow.listS((SubLObject)concept_tagger.$sym18$DO_ITERATOR, (SubLObject)ConsesLow.list(result, iter), ConsesLow.append(body, (SubLObject)concept_tagger.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)concept_tagger.$list12);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 3686L)
    public static SubLObject all_tagged_concepts(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == concept_tagger.UNPROVIDED) {
            optional_arg_plist = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_document, concept_tagger.$sym2$DOCUMENT_P);
        enforceType(optional_arg_plist, concept_tagger.$sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P);
        SubLObject result = (SubLObject)concept_tagger.NIL;
        final SubLObject iter = tag_concepts(v_document, optional_arg_plist);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)concept_tagger.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)concept_tagger.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$7 = concept_filter.$concept_filter_memoization_state$.currentBinding(thread);
                    try {
                        concept_filter.$concept_filter_memoization_state$.bind(memoization_state.new_memoization_state((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED), thread);
                        SubLObject valid;
                        for (SubLObject done_var = (SubLObject)concept_tagger.NIL; concept_tagger.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(concept_tagger.NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject return_value = iteration.iteration_next(iter);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (concept_tagger.NIL != valid) {
                                SubLObject cdolist_list_var = extract_cycl_from_concept_tagger_output(return_value);
                                SubLObject cycl = (SubLObject)concept_tagger.NIL;
                                cycl = cdolist_list_var.first();
                                while (concept_tagger.NIL != cdolist_list_var) {
                                    final SubLObject item_var = cycl;
                                    if (concept_tagger.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)concept_tagger.EQUAL), Symbols.symbol_function((SubLObject)concept_tagger.IDENTITY))) {
                                        result = (SubLObject)ConsesLow.cons(item_var, result);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    cycl = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                    finally {
                        concept_filter.$concept_filter_memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 4313L)
    public static SubLObject extract_cycl_from_concept_tagger_output(final SubLObject concept_tagger_output) {
        SubLObject result = (SubLObject)concept_tagger.NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(concept_tagger_output);
        SubLObject word = (SubLObject)concept_tagger.NIL;
        word = cdolist_list_var.first();
        while (concept_tagger.NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(document.word_cycls(word), result);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 4756L)
    public static SubLObject tagged_concepts_for_disambiguator(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == concept_tagger.UNPROVIDED) {
            optional_arg_plist = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = (SubLObject)concept_tagger.NIL;
        SubLObject s = (SubLObject)concept_tagger.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject iter = tag_concepts(v_document, optional_arg_plist);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)concept_tagger.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)concept_tagger.T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        PrintLow.format(s, (SubLObject)concept_tagger.$str20$d__);
                        SubLObject valid;
                        for (SubLObject done_var = (SubLObject)concept_tagger.NIL; concept_tagger.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(concept_tagger.NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject sentence = iteration.iteration_next(iter);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (concept_tagger.NIL != valid) {
                                final SubLObject paragraph = document.sentence_mother(sentence);
                                if (document.paragraph_get(paragraph, (SubLObject)concept_tagger.ZERO_INTEGER).eql(sentence)) {
                                    PrintLow.format(s, (SubLObject)concept_tagger.$str21$p__);
                                }
                                PrintLow.format(s, (SubLObject)concept_tagger.$str22$s__);
                                SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                SubLObject word = (SubLObject)concept_tagger.NIL;
                                word = cdolist_list_var.first();
                                while (concept_tagger.NIL != cdolist_list_var) {
                                    PrintLow.format(s, (SubLObject)concept_tagger.$str23$w_A_A_A_A__A, new SubLObject[] { Characters.CHAR_tab, document.word_string(word), Characters.CHAR_tab, document.word_category(word), Characters.CHAR_tab });
                                    SubLObject cdolist_list_var_$10 = document.word_cycls(word);
                                    SubLObject cycl = (SubLObject)concept_tagger.NIL;
                                    cycl = cdolist_list_var_$10.first();
                                    while (concept_tagger.NIL != cdolist_list_var_$10) {
                                        PrintLow.format(s, (SubLObject)concept_tagger.$str24$_A_A, cycl, (SubLObject)Characters.CHAR_tab);
                                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                        cycl = cdolist_list_var_$10.first();
                                    }
                                    PrintLow.format(s, (SubLObject)concept_tagger.$str25$__);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    word = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
            }
            output_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)concept_tagger.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7123L)
    public static SubLObject xml_tag_document(SubLObject args) {
        if (args == concept_tagger.UNPROVIDED) {
            args = (SubLObject)concept_tagger.NIL;
        }
        final SubLObject doc = get_tagged_document_from_html_args(args);
        return xml_tag_document_int(doc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7344L)
    public static SubLObject tag_document_xml(final SubLObject text, SubLObject params) {
        if (params == concept_tagger.UNPROVIDED) {
            params = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = get_tagged_document_from_params(unicode_nauts.convert_unicode_nauts_to_utf8_strings(text), params);
        SubLObject xml_string = (SubLObject)concept_tagger.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind((SubLObject)concept_tagger.NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                xml_tag_document_int(doc);
                xml_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        return xml_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 7700L)
    public static SubLObject xml_tag_document_int(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind((SubLObject)concept_tagger.T, thread);
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            xml_utilities.xml_header(xml_utilities.$xml_version$.getDynamicValue(thread), (SubLObject)concept_tagger.$str30$utf_8, (SubLObject)concept_tagger.UNPROVIDED);
            xml_utilities.xml_terpri();
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)concept_tagger.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)concept_tagger.T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        try {
                            final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str31$document, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str32$xmlns, (SubLObject)concept_tagger.$str33$http___ws_opencyc_org_xsd_TextPro), (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str35$meta, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str36$title, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.T, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$19, thread);
                                                }
                                                final SubLObject _prev_bind_0_$21 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str37$uri, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.T, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$22, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$21, thread);
                                                }
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str35$meta);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    }
                                    try {
                                        final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str38$tagset, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                xml_utilities.xml_terpri();
                                                final SubLObject vector_var = document.document_paragraphs(doc);
                                                final SubLObject backwardP_var = (SubLObject)concept_tagger.NIL;
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
                                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)concept_tagger.NIL, v_iteration = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)concept_tagger.ONE_INTEGER)) {
                                                    element_num = ((concept_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration);
                                                    paragraph = Vectors.aref(vector_var, element_num);
                                                    vector_var_$32 = document.paragraph_sentences(paragraph);
                                                    backwardP_var_$33 = (SubLObject)concept_tagger.NIL;
                                                    for (length_$34 = Sequences.length(vector_var_$32), v_iteration_$35 = (SubLObject)concept_tagger.NIL, v_iteration_$35 = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration_$35.numL(length_$34); v_iteration_$35 = Numbers.add(v_iteration_$35, (SubLObject)concept_tagger.ONE_INTEGER)) {
                                                        element_num_$36 = ((concept_tagger.NIL != backwardP_var_$33) ? Numbers.subtract(length_$34, v_iteration_$35, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration_$35);
                                                        sentence = Vectors.aref(vector_var_$32, element_num_$36);
                                                        cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                                        word = (SubLObject)concept_tagger.NIL;
                                                        word = cdolist_list_var.first();
                                                        while (concept_tagger.NIL != cdolist_list_var) {
                                                            try {
                                                                _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str39$element, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                                                    _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                                        xml_utilities.xml_terpri();
                                                                        source_attrs = (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str40$start, document.word_offset(word));
                                                                        try {
                                                                            _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                            _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str41$source, source_attrs, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                                                                _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                try {
                                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                                                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.$str42$___CDATA__A___, document.word_string(word));
                                                                                }
                                                                                finally {
                                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                                                                _values2 = Values.getValuesAsVector();
                                                                                xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str41$source);
                                                                                Values.restoreValuesFromVector(_values2);
                                                                            }
                                                                            finally {
                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                                            }
                                                                        }
                                                                        xml_utilities.xml_terpri();
                                                                        cdolist_list_var_$44 = document.word_interps(word);
                                                                        interp = (SubLObject)concept_tagger.NIL;
                                                                        interp = cdolist_list_var_$44.first();
                                                                        while (concept_tagger.NIL != cdolist_list_var_$44) {
                                                                            serialize_xml_sense_tag_for_cycl_term(nl_api_datastructures.get_nl_interp_cycl(interp));
                                                                            cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                                                            interp = cdolist_list_var_$44.first();
                                                                        }
                                                                    }
                                                                    finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                                                                    }
                                                                }
                                                                finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                                                                }
                                                            }
                                                            finally {
                                                                _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                                                    _values3 = Values.getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str39$element);
                                                                    Values.restoreValuesFromVector(_values3);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                                }
                                                            }
                                                            xml_utilities.xml_terpri();
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            word = cdolist_list_var.first();
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$25, thread);
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                            final SubLObject _values4 = Values.getValuesAsVector();
                                            xml_utilities.xml_terpri();
                                            xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str38$tagset);
                                            Values.restoreValuesFromVector(_values4);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                        }
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$15, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str31$document);
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                            final SubLObject _values6 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values6);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$14, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$13, thread);
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 8692L)
    public static SubLObject serialize_xml_sense_tag_for_cycl_term(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ids = misc_kb_utilities.get_cyc_term_external_identifiers(cycl_term);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str44$sense, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str45$xmlns_concepts, (SubLObject)concept_tagger.$str46$http___ws_opencyc_org_xsd_CycConc), (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    try {
                        final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str47$concept, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str37$uri, owl_cycl_to_xml.owl_opencyc_latest_uri_for_term(cycl_term)), (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$52 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str48$concepts_externalId, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                            xml_utilities.xml_write_wXescaped_special_chars(kb_utilities.compact_hl_external_id_string(cycl_term));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$53, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$52, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str48$concepts_externalId);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$55 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str49$concepts_preferredNl, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str50$xml_lang, (SubLObject)concept_tagger.$str51$en), (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$56 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                            xml_utilities.xml_write_wXescaped_special_chars(unicode_nauts.convert_unicode_nauts_to_utf8_strings(conses_high.third(ids)));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$56, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$53, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$55, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str49$concepts_preferredNl);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                try {
                                    final SubLObject _prev_bind_0_$58 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str52$concepts_cycl, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str50$xml_lang, (SubLObject)concept_tagger.$str51$en), (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                            xml_utilities.xml_cdata(print_high.prin1_to_string(ids.first()));
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$54, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$58, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str52$concepts_cycl);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                final SubLObject concept_type = (SubLObject)((concept_tagger.NIL != fort_types_interface.predicate_p(cycl_term)) ? concept_tagger.$str53$Predicate : ((concept_tagger.NIL != fort_types_interface.collection_p(cycl_term)) ? concept_tagger.$str54$Collection : concept_tagger.$str55$Individual));
                                final SubLObject _prev_bind_0_$61 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)concept_tagger.$str56$concepts_conceptType, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str57$type, concept_type), (SubLObject)concept_tagger.T, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.$kw34$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$62 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)concept_tagger.$kw34$UNINITIALIZED, thread);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$62, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$55, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$61, thread);
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$51, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str47$concept);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                        }
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$49, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)concept_tagger.$str44$sense);
                Values.restoreValuesFromVector(_values5);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 13595L)
    public static SubLObject html_tag_document(SubLObject args) {
        if (args == concept_tagger.UNPROVIDED) {
            args = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)concept_tagger.$str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (concept_tagger.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
            html_utilities.html_markup((SubLObject)concept_tagger.$str60$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == concept_tagger.$kw34$UNINITIALIZED) ? ConsesLow.list(concept_tagger.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)concept_tagger.$str61$);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)concept_tagger.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (concept_tagger.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)concept_tagger.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)concept_tagger.$str61$);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)concept_tagger.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
                    html_utilities.html_princ(concept_tagger.$doc_tagger_default_style$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
                    html_tag_document_int(args);
                    if (concept_tagger.$sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                        Functions.funcall((SubLObject)concept_tagger.$sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT, args);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$69, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 13915L)
    public static SubLObject html_tag_document_int(SubLObject args) {
        if (args == concept_tagger.UNPROVIDED) {
            args = (SubLObject)concept_tagger.NIL;
        }
        final SubLObject doc = get_tagged_document_from_html_args(args);
        return html_display_tagger_result(doc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 14084L)
    public static SubLObject html_display_tagger_result(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind((SubLObject)concept_tagger.T, thread);
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$72 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)concept_tagger.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)concept_tagger.T, thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$72 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject vector_var = document.document_paragraphs(doc);
                        final SubLObject backwardP_var = (SubLObject)concept_tagger.NIL;
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
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)concept_tagger.NIL, v_iteration = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)concept_tagger.ONE_INTEGER)) {
                            element_num = ((concept_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration);
                            para = Vectors.aref(vector_var, element_num);
                            html_utilities.html_terpri((SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            vector_var_$74 = document.paragraph_sentences(para);
                            backwardP_var_$75 = (SubLObject)concept_tagger.NIL;
                            for (length_$76 = Sequences.length(vector_var_$74), v_iteration_$77 = (SubLObject)concept_tagger.NIL, v_iteration_$77 = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration_$77.numL(length_$76); v_iteration_$77 = Numbers.add(v_iteration_$77, (SubLObject)concept_tagger.ONE_INTEGER)) {
                                element_num_$78 = ((concept_tagger.NIL != backwardP_var_$75) ? Numbers.subtract(length_$76, v_iteration_$77, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration_$77);
                                sentence = Vectors.aref(vector_var_$74, element_num_$78);
                                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                word = (SubLObject)concept_tagger.NIL;
                                word = cdolist_list_var.first();
                                while (concept_tagger.NIL != cdolist_list_var) {
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.$str66$_A, document.word_string(word));
                                    if (concept_tagger.NIL != document.word_cycls(word)) {
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str67$__);
                                        list_var = (SubLObject)concept_tagger.NIL;
                                        interp = (SubLObject)concept_tagger.NIL;
                                        interp_num = (SubLObject)concept_tagger.NIL;
                                        list_var = Sequences.remove_duplicates(Sort.sort(conses_high.copy_list(document.word_interps(word)), (SubLObject)concept_tagger.$sym68$WEIGHT_, (SubLObject)concept_tagger.$sym69$GET_NL_INTERP_WEIGHT), (SubLObject)concept_tagger.EQUAL, (SubLObject)concept_tagger.$sym70$GET_NL_INTERP_CYCL, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                        interp = list_var.first();
                                        for (interp_num = (SubLObject)concept_tagger.ZERO_INTEGER; concept_tagger.NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add((SubLObject)concept_tagger.ONE_INTEGER, interp_num)) {
                                            if (!interp_num.eql((SubLObject)concept_tagger.ZERO_INTEGER)) {
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str71$_);
                                            }
                                            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str72$cycl);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.$str73$_S, cycl_utilities.hl_to_el(nl_api_datastructures.get_nl_interp_cycl(interp)));
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                            if (concept_tagger.NIL != nl_api_datastructures.get_nl_interp_weight(interp)) {
                                                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)concept_tagger.$str74$weight);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                                _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.$str75$__A, nl_api_datastructures.get_nl_interp_weight(interp));
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                            }
                                        }
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str76$_);
                                    }
                                    if (concept_tagger.NIL == document.no_space_before_following_wordP(word)) {
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str71$_);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    word = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$72, thread);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$72, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$71, thread);
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15116L)
    public static SubLObject get_concept_filter_from_html_args(final SubLObject args) {
        final SubLObject filter_id = html_utilities.html_extract_input((SubLObject)concept_tagger.$str77$filter_id, args);
        SubLObject filter = (SubLObject)concept_tagger.$list78;
        final SubLObject filter_item = Sequences.find(filter_id, concept_tagger.$html_concept_filters$.getGlobalValue(), (SubLObject)concept_tagger.EQUALP, (SubLObject)concept_tagger.$sym79$FIRST, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL != filter_item) {
            filter = conses_high.third(filter_item);
        }
        return filter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15648L)
    public static SubLObject clear_browser_tagging_lexicons() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(concept_tagger.$browser_tagging_lexicons$.getDynamicValue(thread))); concept_tagger.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject lexicon = thread.secondMultipleValue();
            thread.resetMultipleValues();
            methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)concept_tagger.$sym80$ISOLATE);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        concept_tagger.$browser_tagging_lexicons$.setDynamicValue(dictionary.new_dictionary((SubLObject)concept_tagger.EQUAL, (SubLObject)concept_tagger.UNPROVIDED), thread);
        return concept_tagger.$browser_tagging_lexicons$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 15899L)
    public static SubLObject get_browser_tagging_lexicon(final SubLObject ner, final SubLObject filter_specs, SubLObject case_sensitivity, SubLObject lexical_mt) {
        if (case_sensitivity == concept_tagger.UNPROVIDED) {
            case_sensitivity = (SubLObject)concept_tagger.$kw81$PREFERRED;
        }
        if (lexical_mt == concept_tagger.UNPROVIDED) {
            lexical_mt = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_dictionary_key = (SubLObject)ConsesLow.list(ner, filter_specs, case_sensitivity, lexical_mt);
        SubLObject lexicon = dictionary.dictionary_lookup(concept_tagger.$browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL == lexicon) {
            lexicon = make_default_concept_tagger_lexicon();
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym82$SET_LEARNERS, (SubLObject)((concept_tagger.NIL != ner) ? ConsesLow.list((SubLObject)concept_tagger.$sym83$STANFORD_NER_LEARN) : concept_tagger.NIL));
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym84$ADD_LEARNER, (SubLObject)concept_tagger.$sym85$NUMBER_LEARN);
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym86$SET_CASE_SENSITIVITY, case_sensitivity);
            SubLObject cdolist_list_var = filter_specs;
            SubLObject filter_spec = (SubLObject)concept_tagger.NIL;
            filter_spec = cdolist_list_var.first();
            while (concept_tagger.NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym87$ADD_CONCEPT_FILTER_SPEC, filter_spec);
                cdolist_list_var = cdolist_list_var.rest();
                filter_spec = cdolist_list_var.first();
            }
            methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)concept_tagger.$sym88$IGNORE_CACHE);
            if (concept_tagger.NIL != lexical_mt) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym89$SET_BASE_MT, lexical_mt);
            }
            dictionary.dictionary_enter(concept_tagger.$browser_tagging_lexicons$.getDynamicValue(thread), lex_dictionary_key, lexicon);
        }
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 16732L)
    public static SubLObject get_tagged_document_from_params(final SubLObject text, final SubLObject params) {
        return get_tagged_document(text, conses_high.getf(params, (SubLObject)concept_tagger.$kw91$USE_NER, (SubLObject)concept_tagger.$str92$NIL), conses_high.getf(params, (SubLObject)concept_tagger.$kw93$EXHAUSTIVE_TAGGING, (SubLObject)concept_tagger.T), conses_high.getf(params, (SubLObject)concept_tagger.$kw94$IGNORE_POS_TAGGER, (SubLObject)concept_tagger.UNPROVIDED), conses_high.getf(params, (SubLObject)concept_tagger.$kw95$SENTENCIFY, (SubLObject)concept_tagger.UNPROVIDED), conses_high.getf(params, (SubLObject)concept_tagger.$kw96$LEXICAL_MT, (SubLObject)concept_tagger.UNPROVIDED), conses_high.getf(params, (SubLObject)concept_tagger.$kw97$CASE_SENSITIVITY, (SubLObject)concept_tagger.$kw98$OFF), (SubLObject)ConsesLow.list(get_lexical_strength_disambiguator(params)), conses_high.getf(params, (SubLObject)concept_tagger.$kw99$CONCEPT_FILTER, (SubLObject)concept_tagger.$list100), conses_high.getf(params, (SubLObject)concept_tagger.$kw101$ANNOTATE_SPECS, (SubLObject)concept_tagger.UNPROVIDED), conses_high.getf(params, (SubLObject)concept_tagger.$kw102$ANNOTATE_INSTANCES, (SubLObject)concept_tagger.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 17371L)
    public static SubLObject get_lexical_strength_disambiguator(final SubLObject params) {
        final SubLObject lexical_strength_value = conses_high.getf(params, (SubLObject)concept_tagger.$kw103$MIN_LEXICAL_STRENGTH, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL != subl_promotions.memberP(lexical_strength_value, (SubLObject)concept_tagger.$list104, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED)) {
            return document_disambiguation.new_simple_disambiguator(concept_tagger.$const105$ContextuallyDependentLexicalMappi);
        }
        if (concept_tagger.NIL != subl_promotions.memberP(lexical_strength_value, (SubLObject)concept_tagger.$list106, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED)) {
            return document_disambiguation.new_simple_disambiguator(concept_tagger.$const107$PrimaryLexicalMapping);
        }
        if (lexical_strength_value.equal((SubLObject)concept_tagger.$kw108$VANISHINGLY_RARE)) {
            return (SubLObject)concept_tagger.NIL;
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 17865L)
    public static SubLObject get_tagged_document_from_html_args(final SubLObject args) {
        final SubLObject doc_string = html_utilities.html_extract_input((SubLObject)concept_tagger.$str109$inputText, args);
        final SubLObject nerP = html_utilities.html_extract_input((SubLObject)concept_tagger.$str110$use_ner, args);
        final SubLObject exhaustive_tagging = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str111$exhaustive_tagging, args, (SubLObject)concept_tagger.UNPROVIDED);
        final SubLObject ignore_pos_tagger = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str112$ignore_pos_tagger, args, (SubLObject)concept_tagger.UNPROVIDED);
        final SubLObject sentencifyP = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str113$sentencify, args, (SubLObject)concept_tagger.NIL);
        final SubLObject lexical_mt = html_utilities.html_extract_cyclified_sexpr((SubLObject)concept_tagger.$str114$lexicalMt, args, (SubLObject)concept_tagger.NIL);
        final SubLObject case_sensitivity = get_case_sensitivity_value(args);
        final SubLObject disambiguators = get_disambiguators_from_html_args(args);
        final SubLObject filters = (SubLObject)ConsesLow.list(get_concept_filter_from_html_args(args));
        final SubLObject specs_filter_terms = get_specs_filter_terms_from_html_args(args);
        final SubLObject instance_filter_terms = get_instance_filter_terms_from_html_args(args);
        return get_tagged_document(doc_string, nerP, exhaustive_tagging, ignore_pos_tagger, sentencifyP, lexical_mt, case_sensitivity, disambiguators, filters, specs_filter_terms, instance_filter_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 18866L)
    public static SubLObject get_tagged_document(final SubLObject text, final SubLObject nerP, final SubLObject exhaustive_taggingP, final SubLObject ignore_pos_taggerP, final SubLObject sentencifyP, final SubLObject lexical_mt, final SubLObject case_sensitivity, final SubLObject disambiguators, final SubLObject filters, final SubLObject spec_filter_terms, final SubLObject instance_filter_terms) {
        final SubLObject specs_filters = Mapping.mapcar((SubLObject)concept_tagger.$sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, spec_filter_terms);
        final SubLObject instance_filters = Mapping.mapcar((SubLObject)concept_tagger.$sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, instance_filter_terms);
        final SubLObject lexicon = get_browser_tagging_lexicon(nerP, ConsesLow.append(filters, specs_filters, instance_filters, (SubLObject)concept_tagger.NIL), case_sensitivity, lexical_mt);
        final SubLObject tagger = (SubLObject)((concept_tagger.NIL != ignore_pos_taggerP && concept_tagger.NIL != exhaustive_taggingP) ? concept_tagger.$sym117$EXHAUSTIVE_CONCEPT_TAGGER : ((concept_tagger.NIL != ignore_pos_taggerP) ? concept_tagger.$sym118$SIMPLE_CONCEPT_TAGGER : ((concept_tagger.NIL != exhaustive_taggingP) ? concept_tagger.$sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER : concept_tagger.$sym120$POS_TAGGING_CONCEPT_TAGGER)));
        final SubLObject v_document = document_annotation_widgets.new_tagged_document(text, lexicon, (SubLObject)concept_tagger.NIL, tagger, sentencifyP);
        SubLObject cdolist_list_var = disambiguators;
        SubLObject disambiguator = (SubLObject)concept_tagger.NIL;
        disambiguator = cdolist_list_var.first();
        while (concept_tagger.NIL != cdolist_list_var) {
            document_disambiguation.document_disambiguate(disambiguator, v_document, (SubLObject)concept_tagger.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            disambiguator = cdolist_list_var.first();
        }
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 19861L)
    public static SubLObject get_disambiguators_from_html_args(final SubLObject args) {
        final SubLObject disambiguate_value = html_utilities.html_extract_input((SubLObject)concept_tagger.$str121$disambiguate, args);
        final SubLObject lexical_strength_value = html_utilities.html_extract_input((SubLObject)concept_tagger.$str122$lexicalStrength, args);
        SubLObject disambiguators = (SubLObject)concept_tagger.NIL;
        if (concept_tagger.NIL != subl_promotions.memberP(disambiguate_value, (SubLObject)concept_tagger.$list123, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED)) {
            disambiguators = (SubLObject)ConsesLow.cons(rule_disambiguation.new_rule_disambiguator((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED), disambiguators);
        }
        if (concept_tagger.NIL != subl_promotions.memberP(lexical_strength_value, (SubLObject)concept_tagger.$list124, Symbols.symbol_function((SubLObject)concept_tagger.EQUALP), (SubLObject)concept_tagger.UNPROVIDED)) {
            disambiguators = (SubLObject)ConsesLow.cons(document_disambiguation.new_simple_disambiguator(concept_tagger.$const105$ContextuallyDependentLexicalMappi), disambiguators);
        }
        else if (concept_tagger.NIL != subl_promotions.memberP(lexical_strength_value, (SubLObject)concept_tagger.$list125, Symbols.symbol_function((SubLObject)concept_tagger.EQUALP), (SubLObject)concept_tagger.UNPROVIDED)) {
            disambiguators = (SubLObject)ConsesLow.cons(document_disambiguation.new_simple_disambiguator(concept_tagger.$const107$PrimaryLexicalMapping), disambiguators);
        }
        else if (lexical_strength_value.equalp((SubLObject)concept_tagger.$str126$vanishingly_rare)) {}
        return disambiguators;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 20627L)
    public static SubLObject get_specs_filters_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_utilities.html_extract_input_values((SubLObject)concept_tagger.$str127$allowSpecs, args);
        final SubLObject colls = Mapping.mapcan((SubLObject)concept_tagger.$sym128$READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, concept_tagger.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject filters = Mapping.mapcar((SubLObject)concept_tagger.$sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC, colls);
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 20916L)
    public static SubLObject get_instance_filters_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_utilities.html_extract_input_values((SubLObject)concept_tagger.$str129$allowInstances, args);
        final SubLObject colls = Mapping.mapcar((SubLObject)concept_tagger.$sym130$CB_GUESS_TERM, coll_strings);
        final SubLObject filters = Mapping.mapcar((SubLObject)concept_tagger.$sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC, colls);
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21192L)
    public static SubLObject get_specs_filter_terms_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_utilities.html_extract_input_values((SubLObject)concept_tagger.$str127$allowSpecs, args);
        final SubLObject colls = Mapping.mapcan((SubLObject)concept_tagger.$sym128$READ_MULTIPLE_TERMS_FROM_STRING, coll_strings, concept_tagger.EMPTY_SUBL_OBJECT_ARRAY);
        return colls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21416L)
    public static SubLObject get_instance_filter_terms_from_html_args(final SubLObject args) {
        final SubLObject coll_strings = html_utilities.html_extract_input_values((SubLObject)concept_tagger.$str129$allowInstances, args);
        final SubLObject colls = Mapping.mapcar((SubLObject)concept_tagger.$sym130$CB_GUESS_TERM, coll_strings);
        return colls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 21628L)
    public static SubLObject get_case_sensitivity_value(final SubLObject args) {
        SubLObject raw_value = html_utilities.html_extract_input((SubLObject)concept_tagger.$str131$caseSensitivity, args);
        if (concept_tagger.NIL == raw_value) {
            raw_value = (SubLObject)concept_tagger.$str132$preferred;
        }
        if (concept_tagger.NIL != subl_promotions.memberP(raw_value, (SubLObject)concept_tagger.$list133, Symbols.symbol_function((SubLObject)concept_tagger.EQUALP), (SubLObject)concept_tagger.UNPROVIDED)) {
            return (SubLObject)concept_tagger.$kw134$ON;
        }
        if (concept_tagger.NIL != subl_promotions.memberP(raw_value, (SubLObject)concept_tagger.$list135, Symbols.symbol_function((SubLObject)concept_tagger.EQUALP), (SubLObject)concept_tagger.UNPROVIDED)) {
            return (SubLObject)concept_tagger.$kw98$OFF;
        }
        if (concept_tagger.NIL != subl_promotions.memberP(raw_value, (SubLObject)concept_tagger.$list136, Symbols.symbol_function((SubLObject)concept_tagger.EQUALP), (SubLObject)concept_tagger.UNPROVIDED)) {
            return (SubLObject)concept_tagger.$kw81$PREFERRED;
        }
        Errors.error((SubLObject)concept_tagger.$str137$Invalid_argument_for_case_sensiti, raw_value);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22089L)
    public static SubLObject get_rdf_tagging_lexicon() {
        return get_browser_tagging_lexicon((SubLObject)concept_tagger.T, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22178L)
    public static SubLObject get_rdf_tagged_document(final SubLObject string, SubLObject lexicon, SubLObject disambiguateP) {
        if (lexicon == concept_tagger.UNPROVIDED) {
            lexicon = get_rdf_tagging_lexicon();
        }
        if (disambiguateP == concept_tagger.UNPROVIDED) {
            disambiguateP = (SubLObject)concept_tagger.T;
        }
        final SubLObject doc = document_annotation_widgets.new_tagged_document(string, lexicon, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL != disambiguateP) {
            rule_disambiguation.rdis_disambiguate(rule_disambiguation.new_rule_disambiguator((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED), doc, (SubLObject)concept_tagger.UNPROVIDED);
        }
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22442L)
    public static SubLObject weightG(final SubLObject x, final SubLObject y) {
        if (x.isNumber() && y.isNumber()) {
            return Numbers.numG(x, y);
        }
        if (x.isNumber()) {
            return (SubLObject)concept_tagger.T;
        }
        if (y.isNumber()) {
            return (SubLObject)concept_tagger.NIL;
        }
        return (SubLObject)concept_tagger.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 22808L)
    public static SubLObject allow_document_tagger_restricted_web_service() {
        html_kernel.initialize_http_restricted_functions();
        html_kernel.http_allow_function((SubLObject)concept_tagger.$sym140$CB_TAG_DOCUMENT_HANDLER);
        html_kernel.http_allow_function((SubLObject)concept_tagger.$sym141$CB_XML_TAG_DOCUMENT);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 23021L)
    public static SubLObject cb_tag_document_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject xml = html_utilities.html_extract_input(concept_tagger.$cb_tag_document_to_xml$.getGlobalValue(), args);
        final SubLObject html = html_utilities.html_extract_input(concept_tagger.$cb_tag_document_to_html$.getGlobalValue(), args);
        SubLObject ret_value = (SubLObject)concept_tagger.NIL;
        final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding(thread);
        try {
            reader.$read_eval$.bind((SubLObject)concept_tagger.NIL, thread);
            if (concept_tagger.NIL != xml) {
                ret_value = xml_tag_document(args);
            }
            else if (concept_tagger.NIL != html) {
                ret_value = html_tag_document(args);
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_0, thread);
        }
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 23408L)
    public static SubLObject cb_xml_tag_document(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ignore_pos_tagger = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str112$ignore_pos_tagger, args, (SubLObject)concept_tagger.NIL);
        final SubLObject exhaustive_tagging = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str111$exhaustive_tagging, args, (SubLObject)concept_tagger.NIL);
        final SubLObject sentencify = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str113$sentencify, args, (SubLObject)concept_tagger.NIL);
        final SubLObject use_ner = html_utilities.html_extract_sexpr((SubLObject)concept_tagger.$str110$use_ner, args, (SubLObject)concept_tagger.NIL);
        final SubLObject title_var = (SubLObject)concept_tagger.$str142$Concept_Tagger_Web_Service;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((concept_tagger.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)concept_tagger.$str59$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (concept_tagger.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                html_utilities.html_markup((SubLObject)concept_tagger.$str60$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == concept_tagger.$kw34$UNINITIALIZED) ? ConsesLow.list(concept_tagger.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)concept_tagger.$kw143$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (concept_tagger.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)concept_tagger.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (concept_tagger.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)concept_tagger.$str146$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)concept_tagger.$str147$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.$str148$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.$str149$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)concept_tagger.$str150$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            if (concept_tagger.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (concept_tagger.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)concept_tagger.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)concept_tagger.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)concept_tagger.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)concept_tagger.$str151$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        if (concept_tagger.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)concept_tagger.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)concept_tagger.$str152$cb_tag_document_handler, (SubLObject)concept_tagger.T, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.$str109$inputText);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.$int153$100);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.TWENTY_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)concept_tagger.$str154$virtual);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)concept_tagger.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)concept_tagger.$str109$inputText, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                            final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str155$Tag_to__);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.$str77$filter_id);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.ONE_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        if (concept_tagger.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                            SubLObject cdolist_list_var = concept_tagger.$html_concept_filters$.getGlobalValue();
                                            SubLObject filter_spec_list = (SubLObject)concept_tagger.NIL;
                                            filter_spec_list = cdolist_list_var.first();
                                            while (concept_tagger.NIL != cdolist_list_var) {
                                                SubLObject current;
                                                final SubLObject datum = current = filter_spec_list;
                                                SubLObject id_num = (SubLObject)concept_tagger.NIL;
                                                SubLObject display_string = (SubLObject)concept_tagger.NIL;
                                                SubLObject cycl = (SubLObject)concept_tagger.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list156);
                                                id_num = current.first();
                                                current = current.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list156);
                                                display_string = current.first();
                                                current = current.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)concept_tagger.$list156);
                                                cycl = current.first();
                                                current = current.rest();
                                                if (concept_tagger.NIL == current) {
                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                    if (concept_tagger.NIL != id_num) {
                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                                        html_utilities.html_markup(id_num);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                        html_utilities.html_princ(display_string);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)concept_tagger.$list156);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                filter_spec_list = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str157$Lexical_Mt__optional_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_text_input((SubLObject)concept_tagger.$str114$lexicalMt, (SubLObject)concept_tagger.$str61$, (SubLObject)concept_tagger.$int158$60);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str159$_Use_Named_Entity_Recognizer);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_checkbox_input((SubLObject)concept_tagger.$str110$use_ner, (SubLObject)concept_tagger.$str160$t, use_ner, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str161$_Ignore_Part_of_speech_tagger);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_checkbox_input((SubLObject)concept_tagger.$str112$ignore_pos_tagger, (SubLObject)concept_tagger.$str160$t, ignore_pos_tagger, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str162$_Obey_computed_sentence_boundarie);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_checkbox_input((SubLObject)concept_tagger.$str113$sentencify, (SubLObject)concept_tagger.$str160$t, sentencify, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_row_title$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)concept_tagger.$str163$Should_complex_phrases_also_get_i));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str164$_Tag_Exhaustively);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_checkbox_input((SubLObject)concept_tagger.$str111$exhaustive_tagging, (SubLObject)concept_tagger.$str160$t, exhaustive_tagging, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str165$_Disambiguation__);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.$str121$disambiguate);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.ONE_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        if (concept_tagger.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str167$rule);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str168$Maximal);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str170$none);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str171$None);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_princ((SubLObject)concept_tagger.$str172$_Minimum_Lexical_Strength__);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.$str122$lexicalStrength);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)concept_tagger.ONE_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                        if (concept_tagger.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str173$primary);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str174$Use_only_primary_mappings);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str175$context_sensitive);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str176$Exclude_vanishingly_rare_mappings);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)concept_tagger.$str126$vanishingly_rare);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)concept_tagger.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                                html_utilities.html_princ((SubLObject)concept_tagger.$str177$Use_all_lexical_mappings);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                if (concept_tagger.$sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT.isFunctionSpec()) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                            html_utilities.html_princ((SubLObject)concept_tagger.$str178$_Extract_Propositional_Informatio);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)concept_tagger.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)concept_tagger.T, thread);
                                            html_utilities.html_checkbox_input((SubLObject)concept_tagger.$str179$extract_info, (SubLObject)concept_tagger.$str160$t, (SubLObject)concept_tagger.NIL, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)concept_tagger.$str180$Tag_to_XML, concept_tagger.$cb_tag_document_to_xml$.getGlobalValue(), (SubLObject)concept_tagger.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)concept_tagger.$str181$Tag_to_HTML, concept_tagger.$cb_tag_document_to_html$.getGlobalValue(), (SubLObject)concept_tagger.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$83, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$82, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)concept_tagger.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)concept_tagger.ZERO_INTEGER);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tag_concepts_iterator_state_native.class) ? concept_tagger.T : concept_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_document(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_lexicon(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_sense_tagger(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_filter(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_output_spec(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_sentences_to_do(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_document(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_filter(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_output_spec(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject _csetf_tag_concepts_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != tag_concepts_iterator_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject make_tag_concepts_iterator_state(SubLObject arglist) {
        if (arglist == concept_tagger.UNPROVIDED) {
            arglist = (SubLObject)concept_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tag_concepts_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)concept_tagger.NIL, next = arglist; concept_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)concept_tagger.$kw205$SENTENCES_TO_DO)) {
                _csetf_tag_concepts_iterator_state_sentences_to_do(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw206$DOCUMENT)) {
                _csetf_tag_concepts_iterator_state_document(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw7$LEXICON)) {
                _csetf_tag_concepts_iterator_state_lexicon(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw207$SENSE_TAGGER)) {
                _csetf_tag_concepts_iterator_state_sense_tagger(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw8$FILTER)) {
                _csetf_tag_concepts_iterator_state_filter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw208$OUTPUT_SPEC)) {
                _csetf_tag_concepts_iterator_state_output_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw209$PREPARED_SENTENCE_OUTPUT)) {
                _csetf_tag_concepts_iterator_state_prepared_sentence_output(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)concept_tagger.$str210$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject visit_defstruct_tag_concepts_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw211$BEGIN, (SubLObject)concept_tagger.$sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE, (SubLObject)concept_tagger.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw205$SENTENCES_TO_DO, tag_concepts_iterator_state_sentences_to_do(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw206$DOCUMENT, tag_concepts_iterator_state_document(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw7$LEXICON, tag_concepts_iterator_state_lexicon(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw207$SENSE_TAGGER, tag_concepts_iterator_state_sense_tagger(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw8$FILTER, tag_concepts_iterator_state_filter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC, tag_concepts_iterator_state_output_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw209$PREPARED_SENTENCE_OUTPUT, tag_concepts_iterator_state_prepared_sentence_output(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw214$END, (SubLObject)concept_tagger.$sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE, (SubLObject)concept_tagger.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26628L)
    public static SubLObject visit_defstruct_object_tag_concepts_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tag_concepts_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 26899L)
    public static SubLObject new_tag_concepts_iterator_state(final SubLObject sentences, final SubLObject v_document, final SubLObject optional_arg_plist) {
        final SubLObject iter = make_tag_concepts_iterator_state((SubLObject)concept_tagger.UNPROVIDED);
        _csetf_tag_concepts_iterator_state_sentences_to_do(iter, sentences);
        _csetf_tag_concepts_iterator_state_document(iter, v_document);
        _csetf_tag_concepts_iterator_state_lexicon(iter, conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw7$LEXICON, (SubLObject)concept_tagger.UNPROVIDED));
        _csetf_tag_concepts_iterator_state_sense_tagger(iter, conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw207$SENSE_TAGGER, (SubLObject)concept_tagger.UNPROVIDED));
        _csetf_tag_concepts_iterator_state_output_spec(iter, conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC, (SubLObject)concept_tagger.UNPROVIDED));
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 27483L)
    public static SubLObject tag_concepts_iterator_state_done_p(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(concept_tagger.NIL == tag_concepts_iterator_state_prepared_sentence_output(state) && concept_tagger.NIL == tag_concepts_iterator_state_sentences_to_do(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 27826L)
    public static SubLObject tag_concepts_iterator_state_next(final SubLObject state) {
        SubLObject result = (SubLObject)concept_tagger.NIL;
        if (concept_tagger.NIL != tag_concepts_iterator_state_prepared_sentence_output(state)) {
            result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
            _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
            return Values.values(result, state, (SubLObject)concept_tagger.NIL);
        }
        if (concept_tagger.NIL == tag_concepts_iterator_state_sentences_to_do(state)) {
            return Values.values((SubLObject)concept_tagger.NIL, state, (SubLObject)concept_tagger.T);
        }
        final SubLObject sentence = tag_concepts_iterator_state_sentences_to_do(state).first();
        final SubLObject lexicon = tag_concepts_iterator_state_lexicon(state);
        final SubLObject output_spec = tag_concepts_iterator_state_output_spec(state);
        final SubLObject learned_entries = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym216$LEARN, document.sentence_string(sentence));
        final SubLObject v_concept_tagger = tag_concepts_iterator_state_sense_tagger(state);
        final SubLObject sentence_result = Functions.funcall(concept_tagger_get_tag_method(v_concept_tagger), sentence, lexicon, output_spec);
        _csetf_tag_concepts_iterator_state_sentences_to_do(state, tag_concepts_iterator_state_sentences_to_do(state).rest());
        _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, (SubLObject)ConsesLow.cons(sentence_result, tag_concepts_iterator_state_prepared_sentence_output(state)));
        result = tag_concepts_iterator_state_prepared_sentence_output(state).first();
        _csetf_tag_concepts_iterator_state_prepared_sentence_output(state, tag_concepts_iterator_state_prepared_sentence_output(state).rest());
        return Values.values(result, state, (SubLObject)concept_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 29259L)
    public static SubLObject concept_tagger_process_sentence_with_syntactic_parser(final SubLObject sentence, final SubLObject lexicon, final SubLObject aggressive_retokenizationP, SubLObject output_spec, SubLObject filter) {
        if (output_spec == concept_tagger.UNPROVIDED) {
            output_spec = (SubLObject)concept_tagger.NIL;
        }
        if (filter == concept_tagger.UNPROVIDED) {
            filter = (SubLObject)concept_tagger.NIL;
        }
        SubLObject sentence_result = (SubLObject)concept_tagger.NIL;
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject syntax = sentence_string_denotation_mapper_get_lexified_syntax(string, lexicon, aggressive_retokenizationP);
        if (concept_tagger.NIL != syntax) {
            SubLObject cdolist_list_var;
            final SubLObject yield = cdolist_list_var = methods.funcall_instance_method_with_0_args(syntax, (SubLObject)concept_tagger.$sym217$YIELD);
            SubLObject word = (SubLObject)concept_tagger.NIL;
            word = cdolist_list_var.first();
            while (concept_tagger.NIL != cdolist_list_var) {
                final SubLObject lexes = methods.funcall_instance_method_with_0_args(word, (SubLObject)concept_tagger.$sym218$GET_LEXES);
                final SubLObject interps = Sequences.remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filter), Symbols.symbol_function((SubLObject)concept_tagger.EQUAL), (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
                final SubLObject pos = parsing_utilities.penntag_to_cycl(Symbols.symbol_name(methods.funcall_instance_method_with_0_args(word, (SubLObject)concept_tagger.$sym219$GET_CATEGORY)));
                final SubLObject new_info = (SubLObject)((concept_tagger.NIL != interps) ? ConsesLow.list((SubLObject)concept_tagger.$kw220$INTERPS, interps, (SubLObject)concept_tagger.$kw221$CYC_POS, pos, (SubLObject)concept_tagger.$kw222$LEX_ENTRIES, lexes) : concept_tagger.NIL);
                sentence_result = (SubLObject)ConsesLow.cons(document.new_word((SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw223$STRING, methods.funcall_instance_method_with_0_args(word, (SubLObject)concept_tagger.$sym224$GET_STRING), (SubLObject)concept_tagger.$kw225$CATEGORY, pos, (SubLObject)concept_tagger.$kw226$INFO, new_info)), sentence_result);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(sentence_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 30880L)
    public static SubLObject sentence_string_denotation_mapper_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon, final SubLObject aggressiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntax = (SubLObject)concept_tagger.NIL;
        SubLObject error = (SubLObject)concept_tagger.NIL;
        if (concept_tagger.NIL != aggressiveP) {
            syntax = word_linkage.new_word_linkage(sentence_string, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw7$LEXICON, lexicon));
            if (concept_tagger.NIL == syntax) {
                final SubLObject v_parser = get_default_sentence_string_parser();
                syntax = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)concept_tagger.$sym227$PARSE, sentence_string);
            }
        }
        else {
            final SubLObject v_parser = get_default_sentence_string_parser();
            syntax = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)concept_tagger.$sym227$PARSE, sentence_string);
            if (concept_tagger.NIL == syntax) {
                syntax = word_linkage.new_word_linkage(sentence_string, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw7$LEXICON, lexicon));
            }
        }
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)concept_tagger.$sym228$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(syntax, (SubLObject)concept_tagger.$sym229$LEXIFY, lexicon);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)concept_tagger.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (concept_tagger.NIL != error) {
            Errors.warn((SubLObject)concept_tagger.$str230$_______________Error_____________);
            Errors.warn((SubLObject)concept_tagger.$str231$Caught__S_while_processing__S__, error, sentence_string);
        }
        return syntax;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 31710L)
    public static SubLObject sentence_string_denotation_mapper_aggressive_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_linkage = word_linkage.new_word_linkage(sentence_string, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw7$LEXICON, lexicon));
        SubLObject error = (SubLObject)concept_tagger.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)concept_tagger.$sym228$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(v_linkage, (SubLObject)concept_tagger.$sym229$LEXIFY, lexicon);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)concept_tagger.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (concept_tagger.NIL != error) {
            Errors.warn((SubLObject)concept_tagger.$str230$_______________Error_____________);
            Errors.warn((SubLObject)concept_tagger.$str231$Caught__S_while_processing__S__, error, sentence_string);
        }
        return v_linkage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32151L)
    public static SubLObject sentence_string_denotation_mapper_conservative_get_lexified_syntax(final SubLObject sentence_string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_parser = get_default_sentence_string_parser();
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)concept_tagger.$sym227$PARSE, sentence_string);
        if (concept_tagger.NIL != parse_tree.parse_tree_p(tree)) {
            SubLObject error = (SubLObject)concept_tagger.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)concept_tagger.$sym228$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        methods.funcall_instance_method_with_1_args(tree, (SubLObject)concept_tagger.$sym229$LEXIFY, lexicon);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)concept_tagger.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (concept_tagger.NIL != error) {
                Errors.warn((SubLObject)concept_tagger.$str230$_______________Error_____________);
                Errors.warn((SubLObject)concept_tagger.$str231$Caught__S_while_processing__S__, error, sentence_string);
            }
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject concept_tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_concept_tagger(v_object, stream, (SubLObject)concept_tagger.ZERO_INTEGER);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject concept_tagger_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $concept_tagger_native.class) ? concept_tagger.T : concept_tagger.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject concept_tagger_name(final SubLObject v_object) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject concept_tagger_tag_method(final SubLObject v_object) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject concept_tagger_lexicon_method(final SubLObject v_object) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject _csetf_concept_tagger_name(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject _csetf_concept_tagger_tag_method(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject _csetf_concept_tagger_lexicon_method(final SubLObject v_object, final SubLObject value) {
        assert concept_tagger.NIL != concept_tagger_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject make_concept_tagger(SubLObject arglist) {
        if (arglist == concept_tagger.UNPROVIDED) {
            arglist = (SubLObject)concept_tagger.NIL;
        }
        final SubLObject v_new = (SubLObject)new $concept_tagger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)concept_tagger.NIL, next = arglist; concept_tagger.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)concept_tagger.$kw247$NAME)) {
                _csetf_concept_tagger_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw248$TAG_METHOD)) {
                _csetf_concept_tagger_tag_method(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)concept_tagger.$kw249$LEXICON_METHOD)) {
                _csetf_concept_tagger_lexicon_method(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)concept_tagger.$str210$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject visit_defstruct_concept_tagger(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw211$BEGIN, (SubLObject)concept_tagger.$sym250$MAKE_CONCEPT_TAGGER, (SubLObject)concept_tagger.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw247$NAME, concept_tagger_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw248$TAG_METHOD, concept_tagger_tag_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw213$SLOT, (SubLObject)concept_tagger.$kw249$LEXICON_METHOD, concept_tagger_lexicon_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)concept_tagger.$kw214$END, (SubLObject)concept_tagger.$sym250$MAKE_CONCEPT_TAGGER, (SubLObject)concept_tagger.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 32909L)
    public static SubLObject visit_defstruct_object_concept_tagger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_concept_tagger(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33015L)
    public static SubLObject print_concept_tagger(final SubLObject ctagger, SubLObject stream, SubLObject depth) {
        if (stream == concept_tagger.UNPROVIDED) {
            stream = (SubLObject)concept_tagger.T;
        }
        if (depth == concept_tagger.UNPROVIDED) {
            depth = (SubLObject)concept_tagger.NIL;
        }
        PrintLow.format(stream, (SubLObject)concept_tagger.$str252$__Concept_Tagger__A_, concept_tagger_name(ctagger));
        return ctagger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33195L)
    public static SubLObject declare_concept_tagger(final SubLObject ctagger_name, final SubLObject ctagger_method, SubLObject lexicon_method) {
        if (lexicon_method == concept_tagger.UNPROVIDED) {
            lexicon_method = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = make_concept_tagger((SubLObject)concept_tagger.UNPROVIDED);
        _csetf_concept_tagger_name(ctagger, ctagger_name);
        _csetf_concept_tagger_tag_method(ctagger, ctagger_method);
        _csetf_concept_tagger_lexicon_method(ctagger, lexicon_method);
        dictionary.dictionary_enter(concept_tagger.$registered_concept_taggers$.getDynamicValue(thread), ctagger_name, ctagger);
        return ctagger;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33613L)
    public static SubLObject concept_tagger_get_tag_method(final SubLObject ctagger_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = dictionary.dictionary_lookup(concept_tagger.$registered_concept_taggers$.getDynamicValue(thread), ctagger_name, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL == ctagger) {
            Errors.error((SubLObject)concept_tagger.$str253$_S_is_not_a_registered_concept_ta, ctagger_name);
        }
        return concept_tagger_tag_method(ctagger);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 33890L)
    public static SubLObject concept_tagger_get_lexicon_method(final SubLObject ctagger_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ctagger = dictionary.dictionary_lookup(concept_tagger.$registered_concept_taggers$.getDynamicValue(thread), ctagger_name, (SubLObject)concept_tagger.UNPROVIDED);
        if (concept_tagger.NIL == ctagger) {
            Errors.error((SubLObject)concept_tagger.$str254$_S_is_not_a_registered_concept_ta, ctagger_name);
        }
        return concept_tagger_lexicon_method(ctagger);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34175L)
    public static SubLObject default_lexicon_for_concept_tagger(final SubLObject ctagger_name) {
        return Functions.funcall(concept_tagger_get_lexicon_method(ctagger_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34312L)
    public static SubLObject default_concept_tagging_domain_mt() {
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34381L)
    public static SubLObject tag_concepts_fast(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        return tag_concepts_fast_int(sentence, lexicon, output_spec, (SubLObject)concept_tagger.$sym255$LEXIFY_SENTENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34529L)
    public static SubLObject tag_concepts_fast_exhaustively(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        return tag_concepts_fast_int(sentence, lexicon, output_spec, (SubLObject)concept_tagger.$sym256$LEXIFY_SENTENCE_EXHAUSTIVELY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 34702L)
    public static SubLObject tag_concepts_fast_int(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject tag_method) {
        final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lexicon, tag_method, sentence);
        final SubLObject filters = methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)concept_tagger.$sym257$GET_CONCEPT_FILTER_SPECS);
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(lexified_sentence);
        SubLObject word = (SubLObject)concept_tagger.NIL;
        word = cdolist_list_var.first();
        while (concept_tagger.NIL != cdolist_list_var) {
            final SubLObject lexes = document.word_info(word);
            final SubLObject interps = Sequences.remove_duplicates(concept_tagger_extract_interpretations_from_lex_entry(lexes, nl_api_datastructures.output_spec_interp_spec(output_spec), filters), Symbols.symbol_function((SubLObject)concept_tagger.EQUAL), (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
            final SubLObject new_info = (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw220$INTERPS, interps, (SubLObject)concept_tagger.$kw221$CYC_POS, (SubLObject)((concept_tagger.NIL != lexes) ? methods.funcall_instance_method_with_1_args(lexes.first(), (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw221$CYC_POS) : concept_tagger.NIL), (SubLObject)concept_tagger.$kw222$LEX_ENTRIES, lexes);
            document.sign_update(word, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw226$INFO, new_info));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        disambiguation.disambiguate_sentence(lexified_sentence);
        return lexified_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 35486L)
    public static SubLObject tag_concepts_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        return tag_concepts_fast(pos_tagged_sentence, lexicon, output_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 35712L)
    public static SubLObject tag_concepts_exhaustively_using_pos_tags(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec) {
        final SubLObject pos_tagged_sentence = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        return tag_concepts_fast_exhaustively(pos_tagged_sentence, lexicon, output_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject get_default_concept_tagger_lexicon(SubLObject filter) {
        if (filter == concept_tagger.UNPROVIDED) {
            filter = (SubLObject)concept_tagger.NIL;
        }
        return (concept_tagger.NIL != concept_filter.concept_filter_specification_p(filter)) ? get_default_concept_tagger_lexicon_for_filter(filter) : get_default_sentence_string_lexicon();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject get_default_concept_tagger_lexicon_for_filter(final SubLObject filter) {
        final SubLObject lexicon = make_default_concept_tagger_lexicon();
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym87$ADD_CONCEPT_FILTER_SPEC, filter);
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject make_default_concept_tagger_lexicon() {
        final SubLObject lexicon = object.new_class_instance((SubLObject)concept_tagger.$sym264$TERM_LEXICON);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym86$SET_CASE_SENSITIVITY, (SubLObject)concept_tagger.$kw98$OFF);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym265$ALLOW_PREDICATE, concept_tagger.$const266$preferredNameString);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym267$EXCLUDE_PREDICATE, concept_tagger.$const268$ksTermString);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym269$EXCLUDE_POS, concept_tagger.$const270$ClosedClassWord);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym84$ADD_LEARNER, (SubLObject)concept_tagger.$sym85$NUMBER_LEARN);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym271$ALLOW_MT, concept_tagger.$const272$RelationParaphraseMt);
        if (concept_tagger.NIL != named_entity_recognizer.stanford_ner_ping((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED)) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)concept_tagger.$sym84$ADD_LEARNER, (SubLObject)concept_tagger.$sym273$STANFORD_NER_DATE_LEARN);
        }
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject get_default_sentence_string_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (concept_tagger.NIL == abstract_lexicon.abstract_lexicon_p(concept_tagger.$default_sentence_string_lexicon$.getDynamicValue(thread))) {
            concept_tagger.$default_sentence_string_lexicon$.setDynamicValue(make_default_concept_tagger_lexicon(), thread);
        }
        return concept_tagger.$default_sentence_string_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject get_default_sentence_string_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (concept_tagger.NIL == parser.stanford_parser_p(concept_tagger.$default_sentence_string_parser$.getDynamicValue(thread))) {
            concept_tagger.$default_sentence_string_parser$.setDynamicValue(parser.new_stanford_parser((SubLObject)concept_tagger.$kw274$WARN, (SubLObject)concept_tagger.UNPROVIDED), thread);
        }
        return concept_tagger.$default_sentence_string_parser$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 36379L)
    public static SubLObject concept_tagger_extract_interpretations_from_lex_entry(final SubLObject lex_entries, final SubLObject output_spec, SubLObject filters) {
        if (filters == concept_tagger.UNPROVIDED) {
            filters = (SubLObject)concept_tagger.$list275;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)concept_tagger.NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject raw_lex_entry = (SubLObject)concept_tagger.NIL;
        raw_lex_entry = cdolist_list_var.first();
        while (concept_tagger.NIL != cdolist_list_var) {
            final SubLObject lex_entry = (concept_tagger.NIL != cyclifier.ranked_lex_entry_p(raw_lex_entry)) ? cyclifier.rle_lex(raw_lex_entry) : raw_lex_entry;
            final SubLObject intermed_result = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw276$DENOT);
            SubLObject intermed_results = (SubLObject)concept_tagger.NIL;
            if (concept_tagger.NIL != filters && concept_tagger.NIL == non_trie_lex_entry_p(lex_entry)) {
                intermed_results = concept_tagger_accepted_terms(intermed_result, filters, (SubLObject)concept_tagger.UNPROVIDED);
            }
            else {
                intermed_results = (SubLObject)ConsesLow.list(intermed_result);
            }
            SubLObject cdolist_list_var_$125 = intermed_results;
            SubLObject intermed_result_$126 = (SubLObject)concept_tagger.NIL;
            intermed_result_$126 = cdolist_list_var_$125.first();
            while (concept_tagger.NIL != cdolist_list_var_$125) {
                SubLObject new_interp = nl_api_datastructures.new_nl_interpretation((SubLObject)concept_tagger.UNPROVIDED);
                if (concept_tagger.NIL != nl_api_datastructures.nl_interp_spec_return_cyclP(output_spec)) {
                    new_interp = conses_high.putf(new_interp, (SubLObject)concept_tagger.$kw277$CYCL, intermed_result_$126);
                }
                if (concept_tagger.NIL != nl_api_datastructures.nl_interp_spec_return_phrase_typesP(output_spec)) {
                    new_interp = conses_high.putf(new_interp, (SubLObject)concept_tagger.$kw278$PHRASE_TYPES, (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw221$CYC_POS)));
                }
                if (concept_tagger.NIL != nl_api_datastructures.nl_interp_spec_return_head_inflectionsP(output_spec)) {
                    new_interp = conses_high.putf(new_interp, (SubLObject)concept_tagger.$kw279$INFLECTIONS, methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw279$INFLECTIONS));
                }
                if (concept_tagger.NIL != nl_api_datastructures.nl_interp_spec_return_pragmaticsP(output_spec) && concept_tagger.NIL != methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw280$PRAGMATICS)) {
                    new_interp = conses_high.putf(new_interp, (SubLObject)concept_tagger.$kw280$PRAGMATICS, methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw280$PRAGMATICS));
                }
                result = (SubLObject)ConsesLow.cons(new_interp, result);
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                intermed_result_$126 = cdolist_list_var_$125.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_lex_entry = cdolist_list_var.first();
        }
        SubLObject final_result = (SubLObject)concept_tagger.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(concept_tagger.$const281$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final_result = list_utilities.remove_subsumed_items(Sequences.remove_duplicates(result, (SubLObject)concept_tagger.EQUAL, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED), (SubLObject)concept_tagger.$sym282$PARSING_REWRITE_OF_INVERSE_, (SubLObject)concept_tagger.$sym70$GET_NL_INTERP_CYCL);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return final_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 39924L)
    public static SubLObject non_trie_lex_entry_p(final SubLObject entry) {
        return (SubLObject)SubLObjectFactory.makeBoolean(concept_tagger.NIL == abstract_lexicon.lex_entry_p(entry) || concept_tagger.NIL == methods.funcall_instance_method_with_1_args(entry, (SubLObject)concept_tagger.$sym258$GET, (SubLObject)concept_tagger.$kw283$TRIE_ENTRY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 40061L)
    public static SubLObject augment_tag_concepts_optional_arg_plist_with_defaults(final SubLObject optional_arg_plist) {
        SubLObject plist_to_return = list_utilities.augment_plist_with_defaults(optional_arg_plist, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$kw207$SENSE_TAGGER, (SubLObject)concept_tagger.$sym120$POS_TAGGING_CONCEPT_TAGGER));
        if (concept_tagger.NIL != nl_api_datastructures.nl_interpretation_spec_p(conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC, (SubLObject)concept_tagger.UNPROVIDED))) {
            plist_to_return = conses_high.putf(plist_to_return, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec((SubLObject)concept_tagger.$kw284$COMPLEX, conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw285$INTERP_SPEC, (SubLObject)concept_tagger.UNPROVIDED)));
        }
        if (concept_tagger.NIL == list_utilities.plist_has_keyP(optional_arg_plist, (SubLObject)concept_tagger.$kw7$LEXICON)) {
            final SubLObject filter = conses_high.getf(optional_arg_plist, (SubLObject)concept_tagger.$kw8$FILTER, (SubLObject)concept_tagger.UNPROVIDED);
            plist_to_return = conses_high.putf(plist_to_return, (SubLObject)concept_tagger.$kw7$LEXICON, get_default_concept_tagger_lexicon(filter));
        }
        if (concept_tagger.NIL == list_utilities.plist_has_keyP(optional_arg_plist, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC)) {
            plist_to_return = conses_high.putf(plist_to_return, (SubLObject)concept_tagger.$kw208$OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec((SubLObject)concept_tagger.$kw286$SIMPLE, nl_api_datastructures.new_nl_interpretation_spec((SubLObject)concept_tagger.UNPROVIDED)));
        }
        return plist_to_return;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 40894L)
    public static SubLObject concept_tagger_accepted_terms(final SubLObject v_term, SubLObject filters, SubLObject mt) {
        if (filters == concept_tagger.UNPROVIDED) {
            filters = (SubLObject)concept_tagger.$list275;
        }
        if (mt == concept_tagger.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject accepted_terms = (SubLObject)concept_tagger.NIL;
        SubLObject cdolist_list_var = filters;
        SubLObject filter = (SubLObject)concept_tagger.NIL;
        filter = cdolist_list_var.first();
        while (concept_tagger.NIL != cdolist_list_var) {
            accepted_terms = (SubLObject)ConsesLow.cons(concept_tagger_accepted_terms_int(v_term, filter, mt), accepted_terms);
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        }
        return Sequences.creduce((SubLObject)concept_tagger.$sym287$INTERSECTION, accepted_terms, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 41180L)
    public static SubLObject concept_tagger_accepted_terms_int(final SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == concept_tagger.UNPROVIDED) {
            filter = (SubLObject)concept_tagger.$kw288$DEFAULT;
        }
        if (mt == concept_tagger.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (filter == concept_tagger.$kw288$DEFAULT) {
            return (SubLObject)((concept_tagger.NIL != rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt) || concept_tagger.NIL != isa.quoted_isaP(v_term, concept_tagger.$const289$ImplementationConstant, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED) || concept_tagger.NIL != cycl_utilities.expression_find_if((SubLObject)concept_tagger.$sym290$KEYWORDP, v_term, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED) || concept_tagger.NIL != cycl_utilities.naut_with_functor_p(v_term, concept_tagger.$const291$InstanceFn) || (concept_tagger.NIL != isa.isaP(v_term, concept_tagger.$const292$Collection, (SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED) && cardinality_estimates.generality_estimate(v_term).numG(concept_tagger.$concept_tagger_lexical_generality_cutoff$.getDynamicValue(thread)))) ? concept_tagger.NIL : ConsesLow.list(v_term));
        }
        if (concept_tagger.NIL != concept_filter.concept_filter_specification_p(filter)) {
            return concept_filter.valid_concept_filter_nodes(v_term, filter);
        }
        return (SubLObject)ConsesLow.list(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 41913L)
    public static SubLObject concept_tagger_irrelevant_term(final SubLObject v_term, SubLObject filter, SubLObject mt) {
        if (filter == concept_tagger.UNPROVIDED) {
            filter = (SubLObject)concept_tagger.$kw288$DEFAULT;
        }
        if (mt == concept_tagger.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (filter == concept_tagger.$kw288$DEFAULT) {
            return rkf_relevance_utilities.rkf_irrelevant_term(narts_high.nart_substitute(v_term), mt);
        }
        if (concept_tagger.NIL != concept_filter.concept_filter_specification_p(filter)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(concept_tagger.NIL == concept_filter.valid_concept_filter_nodes(v_term, filter));
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 42313L)
    public static SubLObject test_concept_tagger_speed(SubLObject string_list, SubLObject filter_num, SubLObject output_file) {
        if (string_list == concept_tagger.UNPROVIDED) {
            string_list = concept_tagger.$concept_tagger_test_docs$.getDynamicValue();
        }
        if (filter_num == concept_tagger.UNPROVIDED) {
            filter_num = (SubLObject)concept_tagger.FOUR_INTEGER;
        }
        if (output_file == concept_tagger.UNPROVIDED) {
            output_file = (SubLObject)concept_tagger.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_time = (SubLObject)concept_tagger.ZERO_INTEGER;
        SubLObject output_string = (SubLObject)concept_tagger.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind((SubLObject)concept_tagger.NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                final SubLObject _prev_bind_0_$127 = concept_tagger.$default_sentence_string_lexicon$.currentBinding(thread);
                try {
                    concept_tagger.$default_sentence_string_lexicon$.bind((SubLObject)concept_tagger.NIL, thread);
                    final SubLObject warm_up_arg_list = (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str293$T, (SubLObject)concept_tagger.$list294, (SubLObject)concept_tagger.$list295, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str77$filter_id, PrintLow.write_to_string(filter_num, concept_tagger.EMPTY_SUBL_OBJECT_ARRAY)));
                    xml_tag_document(warm_up_arg_list);
                    Storage.gc_ephemeral();
                    final SubLObject time_var = Time.get_internal_real_time();
                    SubLObject cdolist_list_var = string_list;
                    SubLObject doc_string = (SubLObject)concept_tagger.NIL;
                    doc_string = cdolist_list_var.first();
                    while (concept_tagger.NIL != cdolist_list_var) {
                        final SubLObject arg_list = (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str293$T, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str296$doc_string, doc_string), (SubLObject)concept_tagger.$list297, (SubLObject)ConsesLow.list((SubLObject)concept_tagger.$str77$filter_id, PrintLow.write_to_string(filter_num, concept_tagger.EMPTY_SUBL_OBJECT_ARRAY)));
                        xml_tag_document(arg_list);
                        cdolist_list_var = cdolist_list_var.rest();
                        doc_string = cdolist_list_var.first();
                    }
                    total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    methods.funcall_instance_method_with_0_args(concept_tagger.$default_sentence_string_lexicon$.getDynamicValue(thread), (SubLObject)concept_tagger.$sym298$FORGET);
                }
                finally {
                    concept_tagger.$default_sentence_string_lexicon$.rebind(_prev_bind_0_$127, thread);
                }
                output_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)concept_tagger.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        }
        finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        if (concept_tagger.NIL != output_file) {
            SubLObject stream = (SubLObject)concept_tagger.NIL;
            try {
                stream = compatibility.open_text(output_file, (SubLObject)concept_tagger.$kw299$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)concept_tagger.$str300$Unable_to_open__S, output_file);
                }
                final SubLObject f = stream;
                print_high.princ(output_string, f);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)concept_tagger.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)concept_tagger.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
    public static SubLObject term_absent_from_doc_interps(final SubLObject doc, final SubLObject v_term) {
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)concept_tagger.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)concept_tagger.NIL, v_iteration = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)concept_tagger.ONE_INTEGER)) {
            element_num = ((concept_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$129 = document.paragraph_sentences(paragraph);
            backwardP_var_$130 = (SubLObject)concept_tagger.NIL;
            for (length_$131 = Sequences.length(vector_var_$129), v_iteration_$132 = (SubLObject)concept_tagger.NIL, v_iteration_$132 = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration_$132.numL(length_$131); v_iteration_$132 = Numbers.add(v_iteration_$132, (SubLObject)concept_tagger.ONE_INTEGER)) {
                element_num_$133 = ((concept_tagger.NIL != backwardP_var_$130) ? Numbers.subtract(length_$131, v_iteration_$132, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration_$132);
                sentence = Vectors.aref(vector_var_$129, element_num_$133);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)concept_tagger.NIL;
                word = cdolist_list_var.first();
                while (concept_tagger.NIL != cdolist_list_var) {
                    cdolist_list_var_$134 = document.word_interps(word);
                    interp = (SubLObject)concept_tagger.NIL;
                    interp = cdolist_list_var_$134.first();
                    while (concept_tagger.NIL != cdolist_list_var_$134) {
                        if (nl_api_datastructures.get_nl_interp_cycl(interp).equal(v_term)) {
                            return (SubLObject)concept_tagger.NIL;
                        }
                        cdolist_list_var_$134 = cdolist_list_var_$134.rest();
                        interp = cdolist_list_var_$134.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)concept_tagger.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
    public static SubLObject term_in_doc_interps(final SubLObject doc, final SubLObject v_term) {
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)concept_tagger.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)concept_tagger.NIL, v_iteration = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)concept_tagger.ONE_INTEGER)) {
            element_num = ((concept_tagger.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$135 = document.paragraph_sentences(paragraph);
            backwardP_var_$136 = (SubLObject)concept_tagger.NIL;
            for (length_$137 = Sequences.length(vector_var_$135), v_iteration_$138 = (SubLObject)concept_tagger.NIL, v_iteration_$138 = (SubLObject)concept_tagger.ZERO_INTEGER; v_iteration_$138.numL(length_$137); v_iteration_$138 = Numbers.add(v_iteration_$138, (SubLObject)concept_tagger.ONE_INTEGER)) {
                element_num_$139 = ((concept_tagger.NIL != backwardP_var_$136) ? Numbers.subtract(length_$137, v_iteration_$138, (SubLObject)concept_tagger.ONE_INTEGER) : v_iteration_$138);
                sentence = Vectors.aref(vector_var_$135, element_num_$139);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)concept_tagger.NIL;
                word = cdolist_list_var.first();
                while (concept_tagger.NIL != cdolist_list_var) {
                    cdolist_list_var_$140 = document.word_interps(word);
                    interp = (SubLObject)concept_tagger.NIL;
                    interp = cdolist_list_var_$140.first();
                    while (concept_tagger.NIL != cdolist_list_var_$140) {
                        if (nl_api_datastructures.get_nl_interp_cycl(interp).equal(v_term)) {
                            return (SubLObject)concept_tagger.T;
                        }
                        cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                        interp = cdolist_list_var_$140.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)concept_tagger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/concept-tagger.lisp", position = 56141L)
    public static SubLObject get_tagged_document_from_html_args_pos(final SubLObject args) {
        return get_tagged_document_from_html_args(args);
    }
    
    public static SubLObject declare_concept_tagger_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts", "TAG-CONCEPTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_optional_args_p", "TAG-CONCEPTS-OPTIONAL-ARGS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_next_sentence_annotation", "GET-NEXT-SENTENCE-ANNOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "annotation_completeP", "ANNOTATION-COMPLETE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.concept_tagger", "do_tagged_concepts_results", "DO-TAGGED-CONCEPTS-RESULTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "all_tagged_concepts", "ALL-TAGGED-CONCEPTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "extract_cycl_from_concept_tagger_output", "EXTRACT-CYCL-FROM-CONCEPT-TAGGER-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tagged_concepts_for_disambiguator", "TAGGED-CONCEPTS-FOR-DISAMBIGUATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "xml_tag_document", "XML-TAG-DOCUMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_document_xml", "TAG-DOCUMENT-XML", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "xml_tag_document_int", "XML-TAG-DOCUMENT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "serialize_xml_sense_tag_for_cycl_term", "SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "html_tag_document", "HTML-TAG-DOCUMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "html_tag_document_int", "HTML-TAG-DOCUMENT-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "html_display_tagger_result", "HTML-DISPLAY-TAGGER-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_concept_filter_from_html_args", "GET-CONCEPT-FILTER-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "clear_browser_tagging_lexicons", "CLEAR-BROWSER-TAGGING-LEXICONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_browser_tagging_lexicon", "GET-BROWSER-TAGGING-LEXICON", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_tagged_document_from_params", "GET-TAGGED-DOCUMENT-FROM-PARAMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_lexical_strength_disambiguator", "GET-LEXICAL-STRENGTH-DISAMBIGUATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_tagged_document_from_html_args", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_tagged_document", "GET-TAGGED-DOCUMENT", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_disambiguators_from_html_args", "GET-DISAMBIGUATORS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_specs_filters_from_html_args", "GET-SPECS-FILTERS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_instance_filters_from_html_args", "GET-INSTANCE-FILTERS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_specs_filter_terms_from_html_args", "GET-SPECS-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_instance_filter_terms_from_html_args", "GET-INSTANCE-FILTER-TERMS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_case_sensitivity_value", "GET-CASE-SENSITIVITY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_rdf_tagging_lexicon", "GET-RDF-TAGGING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_rdf_tagged_document", "GET-RDF-TAGGED-DOCUMENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "weightG", "WEIGHT>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "allow_document_tagger_restricted_web_service", "ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "cb_tag_document_handler", "CB-TAG-DOCUMENT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "cb_xml_tag_document", "CB-XML-TAG-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_print_function_trampoline", "TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_p", "TAG-CONCEPTS-ITERATOR-STATE-P", 1, 0, false);
        new $tag_concepts_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_sentences_to_do", "TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_document", "TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_lexicon", "TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_sense_tagger", "TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_filter", "TAG-CONCEPTS-ITERATOR-STATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_output_spec", "TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_prepared_sentence_output", "TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_sentences_to_do", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_document", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_lexicon", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_sense_tagger", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_filter", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_output_spec", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_tag_concepts_iterator_state_prepared_sentence_output", "_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "make_tag_concepts_iterator_state", "MAKE-TAG-CONCEPTS-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "visit_defstruct_tag_concepts_iterator_state", "VISIT-DEFSTRUCT-TAG-CONCEPTS-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "visit_defstruct_object_tag_concepts_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "new_tag_concepts_iterator_state", "NEW-TAG-CONCEPTS-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_done_p", "TAG-CONCEPTS-ITERATOR-STATE-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_iterator_state_next", "TAG-CONCEPTS-ITERATOR-STATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_process_sentence_with_syntactic_parser", "CONCEPT-TAGGER-PROCESS-SENTENCE-WITH-SYNTACTIC-PARSER", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "sentence_string_denotation_mapper_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-GET-LEXIFIED-SYNTAX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "sentence_string_denotation_mapper_aggressive_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-AGGRESSIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "sentence_string_denotation_mapper_conservative_get_lexified_syntax", "SENTENCE-STRING-DENOTATION-MAPPER-CONSERVATIVE-GET-LEXIFIED-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_print_function_trampoline", "CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_p", "CONCEPT-TAGGER-P", 1, 0, false);
        new $concept_tagger_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_name", "CONCEPT-TAGGER-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_tag_method", "CONCEPT-TAGGER-TAG-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_lexicon_method", "CONCEPT-TAGGER-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_concept_tagger_name", "_CSETF-CONCEPT-TAGGER-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_concept_tagger_tag_method", "_CSETF-CONCEPT-TAGGER-TAG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "_csetf_concept_tagger_lexicon_method", "_CSETF-CONCEPT-TAGGER-LEXICON-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "make_concept_tagger", "MAKE-CONCEPT-TAGGER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "visit_defstruct_concept_tagger", "VISIT-DEFSTRUCT-CONCEPT-TAGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "visit_defstruct_object_concept_tagger_method", "VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "print_concept_tagger", "PRINT-CONCEPT-TAGGER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "declare_concept_tagger", "DECLARE-CONCEPT-TAGGER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_get_tag_method", "CONCEPT-TAGGER-GET-TAG-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_get_lexicon_method", "CONCEPT-TAGGER-GET-LEXICON-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "default_lexicon_for_concept_tagger", "DEFAULT-LEXICON-FOR-CONCEPT-TAGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "default_concept_tagging_domain_mt", "DEFAULT-CONCEPT-TAGGING-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_fast", "TAG-CONCEPTS-FAST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_fast_exhaustively", "TAG-CONCEPTS-FAST-EXHAUSTIVELY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_fast_int", "TAG-CONCEPTS-FAST-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_using_pos_tags", "TAG-CONCEPTS-USING-POS-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "tag_concepts_exhaustively_using_pos_tags", "TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_default_concept_tagger_lexicon", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_default_concept_tagger_lexicon_for_filter", "GET-DEFAULT-CONCEPT-TAGGER-LEXICON-FOR-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "make_default_concept_tagger_lexicon", "MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_default_sentence_string_lexicon", "GET-DEFAULT-SENTENCE-STRING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_default_sentence_string_parser", "GET-DEFAULT-SENTENCE-STRING-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_extract_interpretations_from_lex_entry", "CONCEPT-TAGGER-EXTRACT-INTERPRETATIONS-FROM-LEX-ENTRY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "non_trie_lex_entry_p", "NON-TRIE-LEX-ENTRY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "augment_tag_concepts_optional_arg_plist_with_defaults", "AUGMENT-TAG-CONCEPTS-OPTIONAL-ARG-PLIST-WITH-DEFAULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_accepted_terms", "CONCEPT-TAGGER-ACCEPTED-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_accepted_terms_int", "CONCEPT-TAGGER-ACCEPTED-TERMS-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "concept_tagger_irrelevant_term", "CONCEPT-TAGGER-IRRELEVANT-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "test_concept_tagger_speed", "TEST-CONCEPT-TAGGER-SPEED", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "term_absent_from_doc_interps", "TERM-ABSENT-FROM-DOC-INTERPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "term_in_doc_interps", "TERM-IN-DOC-INTERPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.concept_tagger", "get_tagged_document_from_html_args_pos", "GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS", 1, 0, false);
        return (SubLObject)concept_tagger.NIL;
    }
    
    public static SubLObject init_concept_tagger_file() {
        concept_tagger.$default_sentence_string_lexicon$ = SubLFiles.defparameter("*DEFAULT-SENTENCE-STRING-LEXICON*", (SubLObject)concept_tagger.NIL);
        concept_tagger.$default_sentence_string_parser$ = SubLFiles.defparameter("*DEFAULT-SENTENCE-STRING-PARSER*", (SubLObject)concept_tagger.NIL);
        concept_tagger.$concept_tagger_lexical_generality_cutoff$ = SubLFiles.defparameter("*CONCEPT-TAGGER-LEXICAL-GENERALITY-CUTOFF*", (SubLObject)concept_tagger.$int0$400000);
        concept_tagger.$html_concept_filters$ = SubLFiles.deflexical("*HTML-CONCEPT-FILTERS*", (SubLObject)concept_tagger.$list26);
        concept_tagger.$doc_tagger_default_style$ = SubLFiles.defparameter("*DOC-TAGGER-DEFAULT-STYLE*", (SubLObject)concept_tagger.$str58$_cycl__font_family__sans_serif__c);
        concept_tagger.$browser_tagging_lexicons$ = SubLFiles.defparameter("*BROWSER-TAGGING-LEXICONS*", dictionary.new_dictionary((SubLObject)concept_tagger.EQUAL, (SubLObject)concept_tagger.UNPROVIDED));
        concept_tagger.$cb_tag_document_to_html$ = SubLFiles.defconstant("*CB-TAG-DOCUMENT-TO-HTML*", Sequences.cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), (SubLObject)concept_tagger.$str138$text_html));
        concept_tagger.$cb_tag_document_to_xml$ = SubLFiles.defconstant("*CB-TAG-DOCUMENT-TO-XML*", Sequences.cconcatenate(http_kernel.$http_return_mime_type_prefix$.getGlobalValue(), (SubLObject)concept_tagger.$str139$text_xml));
        concept_tagger.$dtp_tag_concepts_iterator_state$ = SubLFiles.defconstant("*DTP-TAG-CONCEPTS-ITERATOR-STATE*", (SubLObject)concept_tagger.$sym182$TAG_CONCEPTS_ITERATOR_STATE);
        concept_tagger.$tag_concepts_quicklyP$ = SubLFiles.defparameter("*TAG-CONCEPTS-QUICKLY?*", (SubLObject)concept_tagger.T);
        concept_tagger.$registered_concept_taggers$ = SubLFiles.defparameter("*REGISTERED-CONCEPT-TAGGERS*", dictionary.new_dictionary((SubLObject)concept_tagger.UNPROVIDED, (SubLObject)concept_tagger.UNPROVIDED));
        concept_tagger.$dtp_concept_tagger$ = SubLFiles.defconstant("*DTP-CONCEPT-TAGGER*", (SubLObject)concept_tagger.$sym232$CONCEPT_TAGGER);
        concept_tagger.$concept_tagger_test_docs$ = SubLFiles.defparameter("*CONCEPT-TAGGER-TEST-DOCS*", (SubLObject)concept_tagger.$list301);
        return (SubLObject)concept_tagger.NIL;
    }
    
    public static SubLObject setup_concept_tagger_file() {
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym1$TAG_CONCEPTS);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym9$GET_NEXT_SENTENCE_ANNOTATION);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym11$ANNOTATION_COMPLETE_);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym19$ALL_TAGGED_CONCEPTS);
        html_macros.note_cgi_handler_function((SubLObject)concept_tagger.$sym27$XML_TAG_DOCUMENT, (SubLObject)concept_tagger.$kw28$XML_HANDLER);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym29$TAG_DOCUMENT_XML);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM);
        html_macros.note_cgi_handler_function((SubLObject)concept_tagger.$sym63$HTML_TAG_DOCUMENT, (SubLObject)concept_tagger.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)concept_tagger.$sym65$HTML_TAG_DOCUMENT_INT, (SubLObject)concept_tagger.$kw64$HTML_HANDLER);
        access_macros.register_external_symbol((SubLObject)concept_tagger.$sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS);
        html_macros.note_cgi_handler_function((SubLObject)concept_tagger.$sym140$CB_TAG_DOCUMENT_HANDLER, (SubLObject)concept_tagger.$kw64$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)concept_tagger.$sym141$CB_XML_TAG_DOCUMENT, (SubLObject)concept_tagger.$kw64$HTML_HANDLER);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), concept_tagger.$dtp_tag_concepts_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)concept_tagger.$sym189$TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)concept_tagger.$list190);
        Structures.def_csetf((SubLObject)concept_tagger.$sym191$TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO, (SubLObject)concept_tagger.$sym192$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO);
        Structures.def_csetf((SubLObject)concept_tagger.$sym193$TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT, (SubLObject)concept_tagger.$sym194$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT);
        Structures.def_csetf((SubLObject)concept_tagger.$sym195$TAG_CONCEPTS_ITERATOR_STATE_LEXICON, (SubLObject)concept_tagger.$sym196$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON);
        Structures.def_csetf((SubLObject)concept_tagger.$sym197$TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER, (SubLObject)concept_tagger.$sym198$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER);
        Structures.def_csetf((SubLObject)concept_tagger.$sym199$TAG_CONCEPTS_ITERATOR_STATE_FILTER, (SubLObject)concept_tagger.$sym200$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER);
        Structures.def_csetf((SubLObject)concept_tagger.$sym201$TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC, (SubLObject)concept_tagger.$sym202$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC);
        Structures.def_csetf((SubLObject)concept_tagger.$sym203$TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, (SubLObject)concept_tagger.$sym204$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
        Equality.identity((SubLObject)concept_tagger.$sym182$TAG_CONCEPTS_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), concept_tagger.$dtp_tag_concepts_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)concept_tagger.$sym215$VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)concept_tagger.$sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P);
        utilities_macros.note_funcall_helper_function((SubLObject)concept_tagger.$sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), concept_tagger.$dtp_concept_tagger$.getGlobalValue(), Symbols.symbol_function((SubLObject)concept_tagger.$sym239$CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)concept_tagger.$list240);
        Structures.def_csetf((SubLObject)concept_tagger.$sym241$CONCEPT_TAGGER_NAME, (SubLObject)concept_tagger.$sym242$_CSETF_CONCEPT_TAGGER_NAME);
        Structures.def_csetf((SubLObject)concept_tagger.$sym243$CONCEPT_TAGGER_TAG_METHOD, (SubLObject)concept_tagger.$sym244$_CSETF_CONCEPT_TAGGER_TAG_METHOD);
        Structures.def_csetf((SubLObject)concept_tagger.$sym245$CONCEPT_TAGGER_LEXICON_METHOD, (SubLObject)concept_tagger.$sym246$_CSETF_CONCEPT_TAGGER_LEXICON_METHOD);
        Equality.identity((SubLObject)concept_tagger.$sym232$CONCEPT_TAGGER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), concept_tagger.$dtp_concept_tagger$.getGlobalValue(), Symbols.symbol_function((SubLObject)concept_tagger.$sym251$VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD));
        declare_concept_tagger((SubLObject)concept_tagger.$sym120$POS_TAGGING_CONCEPT_TAGGER, (SubLObject)concept_tagger.$sym259$TAG_CONCEPTS_USING_POS_TAGS, (SubLObject)concept_tagger.$sym260$NEW_TERM_LEXICON);
        declare_concept_tagger((SubLObject)concept_tagger.$sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER, (SubLObject)concept_tagger.$sym261$TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS, (SubLObject)concept_tagger.$sym260$NEW_TERM_LEXICON);
        declare_concept_tagger((SubLObject)concept_tagger.$sym118$SIMPLE_CONCEPT_TAGGER, (SubLObject)concept_tagger.$sym262$TAG_CONCEPTS_FAST, (SubLObject)concept_tagger.$sym260$NEW_TERM_LEXICON);
        declare_concept_tagger((SubLObject)concept_tagger.$sym117$EXHAUSTIVE_CONCEPT_TAGGER, (SubLObject)concept_tagger.$sym263$TAG_CONCEPTS_FAST_EXHAUSTIVELY, (SubLObject)concept_tagger.$sym260$NEW_TERM_LEXICON);
        generic_testing.define_test_case_table_int((SubLObject)concept_tagger.$sym302$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS, (SubLObject)ConsesLow.list(new SubLObject[] { concept_tagger.$kw303$TEST, concept_tagger.$sym304$TERM_ABSENT_FROM_DOC_INTERPS, concept_tagger.$kw305$OWNER, concept_tagger.NIL, concept_tagger.$kw306$CLASSES, concept_tagger.NIL, concept_tagger.$kw307$KB, concept_tagger.$kw308$FULL, concept_tagger.$kw309$WORKING_, concept_tagger.T }), (SubLObject)concept_tagger.$list310);
        generic_testing.define_test_case_table_int((SubLObject)concept_tagger.$sym311$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS, (SubLObject)ConsesLow.list(new SubLObject[] { concept_tagger.$kw303$TEST, concept_tagger.$sym312$TERM_IN_DOC_INTERPS, concept_tagger.$kw305$OWNER, concept_tagger.NIL, concept_tagger.$kw306$CLASSES, concept_tagger.NIL, concept_tagger.$kw307$KB, concept_tagger.$kw308$FULL, concept_tagger.$kw309$WORKING_, concept_tagger.T }), (SubLObject)concept_tagger.$list313);
        generic_testing.define_test_case_table_int((SubLObject)concept_tagger.$sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM, (SubLObject)ConsesLow.list(new SubLObject[] { concept_tagger.$kw303$TEST, concept_tagger.$sym314$TRUE, concept_tagger.$kw305$OWNER, concept_tagger.NIL, concept_tagger.$kw306$CLASSES, concept_tagger.NIL, concept_tagger.$kw307$KB, concept_tagger.$kw308$FULL, concept_tagger.$kw309$WORKING_, concept_tagger.T }), (SubLObject)concept_tagger.$list315);
        generic_testing.define_test_case_table_int((SubLObject)concept_tagger.$sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS, (SubLObject)ConsesLow.list(new SubLObject[] { concept_tagger.$kw303$TEST, concept_tagger.$sym304$TERM_ABSENT_FROM_DOC_INTERPS, concept_tagger.$kw305$OWNER, concept_tagger.NIL, concept_tagger.$kw306$CLASSES, concept_tagger.NIL, concept_tagger.$kw307$KB, concept_tagger.$kw308$FULL, concept_tagger.$kw309$WORKING_, concept_tagger.T }), (SubLObject)concept_tagger.$list316);
        return (SubLObject)concept_tagger.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_concept_tagger_file();
    }
    
    @Override
	public void initializeVariables() {
        init_concept_tagger_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_concept_tagger_file();
    }
    
    static {
        me = (SubLFile)new concept_tagger();
        concept_tagger.$default_sentence_string_lexicon$ = null;
        concept_tagger.$default_sentence_string_parser$ = null;
        concept_tagger.$concept_tagger_lexical_generality_cutoff$ = null;
        concept_tagger.$html_concept_filters$ = null;
        concept_tagger.$doc_tagger_default_style$ = null;
        concept_tagger.$browser_tagging_lexicons$ = null;
        concept_tagger.$cb_tag_document_to_html$ = null;
        concept_tagger.$cb_tag_document_to_xml$ = null;
        concept_tagger.$dtp_tag_concepts_iterator_state$ = null;
        concept_tagger.$tag_concepts_quicklyP$ = null;
        concept_tagger.$registered_concept_taggers$ = null;
        concept_tagger.$dtp_concept_tagger$ = null;
        concept_tagger.$concept_tagger_test_docs$ = null;
        $int0$400000 = SubLObjectFactory.makeInteger(400000);
        $sym1$TAG_CONCEPTS = SubLObjectFactory.makeSymbol("TAG-CONCEPTS");
        $sym2$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
        $sym3$TAG_CONCEPTS_OPTIONAL_ARGS_P = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-OPTIONAL-ARGS-P");
        $sym4$TAG_CONCEPTS_ITERATOR_STATE_DONE_P = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DONE-P");
        $sym5$TAG_CONCEPTS_ITERATOR_STATE_NEXT = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-NEXT");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $kw7$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw8$FILTER = SubLObjectFactory.makeKeyword("FILTER");
        $sym9$GET_NEXT_SENTENCE_ANNOTATION = SubLObjectFactory.makeSymbol("GET-NEXT-SENTENCE-ANNOTATION");
        $sym10$ITERATOR_P = SubLObjectFactory.makeSymbol("ITERATOR-P");
        $sym11$ANNOTATION_COMPLETE_ = SubLObjectFactory.makeSymbol("ANNOTATION-COMPLETE?");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONAL-ARG-PLIST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$ITER = SubLObjectFactory.makeUninternedSymbol("ITER");
        $sym14$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym15$WITH_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
        $sym16$WITH_POSSIBLY_NEW_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");
        $sym17$WITH_NEW_CONCEPT_FILTER_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
        $sym18$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym19$ALL_TAGGED_CONCEPTS = SubLObjectFactory.makeSymbol("ALL-TAGGED-CONCEPTS");
        $str20$d__ = SubLObjectFactory.makeString("d~%");
        $str21$p__ = SubLObjectFactory.makeString("p~%");
        $str22$s__ = SubLObjectFactory.makeString("s~%");
        $str23$w_A_A_A_A__A = SubLObjectFactory.makeString("w~A~A~A~A ~A");
        $str24$_A_A = SubLObjectFactory.makeString("~A~A");
        $str25$__ = SubLObjectFactory.makeString("~%");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("6"), (SubLObject)SubLObjectFactory.makeString("The Cyc Commonsense Ontology"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0"), (SubLObject)SubLObjectFactory.makeString("Entire Cyc KB"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCycOntology")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1"), (SubLObject)SubLObjectFactory.makeString("Medical Filter"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEMedicalResearchFilterTree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2"), (SubLObject)SubLObjectFactory.makeString("Military Taxonomy"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptNodesForTaxonFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilitaryThingTaxonomy"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3"), (SubLObject)SubLObjectFactory.makeString("Terrorism Filter"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptNodesForTaskTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligenceAnalysisTask-Allotment"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("4"), (SubLObject)SubLObjectFactory.makeString("Food & Drink Taxonomy"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FoodAndDrinkTaxonomy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("5"), (SubLObject)SubLObjectFactory.makeString("Investment Taxonomy"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InvestmentRelatedThingTaxonomy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptSpecOrInstance")))));
        $sym27$XML_TAG_DOCUMENT = SubLObjectFactory.makeSymbol("XML-TAG-DOCUMENT");
        $kw28$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $sym29$TAG_DOCUMENT_XML = SubLObjectFactory.makeSymbol("TAG-DOCUMENT-XML");
        $str30$utf_8 = SubLObjectFactory.makeString("utf-8");
        $str31$document = SubLObjectFactory.makeString("document");
        $str32$xmlns = SubLObjectFactory.makeString("xmlns");
        $str33$http___ws_opencyc_org_xsd_TextPro = SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/TextProcessing");
        $kw34$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str35$meta = SubLObjectFactory.makeString("meta");
        $str36$title = SubLObjectFactory.makeString("title");
        $str37$uri = SubLObjectFactory.makeString("uri");
        $str38$tagset = SubLObjectFactory.makeString("tagset");
        $str39$element = SubLObjectFactory.makeString("element");
        $str40$start = SubLObjectFactory.makeString("start");
        $str41$source = SubLObjectFactory.makeString("source");
        $str42$___CDATA__A___ = SubLObjectFactory.makeString("<![CDATA[~A]]>");
        $sym43$SERIALIZE_XML_SENSE_TAG_FOR_CYCL_TERM = SubLObjectFactory.makeSymbol("SERIALIZE-XML-SENSE-TAG-FOR-CYCL-TERM");
        $str44$sense = SubLObjectFactory.makeString("sense");
        $str45$xmlns_concepts = SubLObjectFactory.makeString("xmlns:concepts");
        $str46$http___ws_opencyc_org_xsd_CycConc = SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/CycConcepts");
        $str47$concept = SubLObjectFactory.makeString("concept");
        $str48$concepts_externalId = SubLObjectFactory.makeString("concepts:externalId");
        $str49$concepts_preferredNl = SubLObjectFactory.makeString("concepts:preferredNl");
        $str50$xml_lang = SubLObjectFactory.makeString("xml:lang");
        $str51$en = SubLObjectFactory.makeString("en");
        $str52$concepts_cycl = SubLObjectFactory.makeString("concepts:cycl");
        $str53$Predicate = SubLObjectFactory.makeString("Predicate");
        $str54$Collection = SubLObjectFactory.makeString("Collection");
        $str55$Individual = SubLObjectFactory.makeString("Individual");
        $str56$concepts_conceptType = SubLObjectFactory.makeString("concepts:conceptType");
        $str57$type = SubLObjectFactory.makeString("type");
        $str58$_cycl__font_family__sans_serif__c = SubLObjectFactory.makeString(".cycl {font-family: sans-serif; color: #0000FF; font-size: smaller}\n     .weight {font-family: sans-serif; color: #AA00EE; font-size: smaller}");
        $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str60$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $str61$ = SubLObjectFactory.makeString("");
        $sym62$MAYBE_HTML_EXTRACT_FROM_DOCUMENT = SubLObjectFactory.makeSymbol("MAYBE-HTML-EXTRACT-FROM-DOCUMENT");
        $sym63$HTML_TAG_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-TAG-DOCUMENT");
        $kw64$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym65$HTML_TAG_DOCUMENT_INT = SubLObjectFactory.makeSymbol("HTML-TAG-DOCUMENT-INT");
        $str66$_A = SubLObjectFactory.makeString("~A");
        $str67$__ = SubLObjectFactory.makeString(" (");
        $sym68$WEIGHT_ = SubLObjectFactory.makeSymbol("WEIGHT>");
        $sym69$GET_NL_INTERP_WEIGHT = SubLObjectFactory.makeSymbol("GET-NL-INTERP-WEIGHT");
        $sym70$GET_NL_INTERP_CYCL = SubLObjectFactory.makeSymbol("GET-NL-INTERP-CYCL");
        $str71$_ = SubLObjectFactory.makeString(" ");
        $str72$cycl = SubLObjectFactory.makeString("cycl");
        $str73$_S = SubLObjectFactory.makeString("~S");
        $str74$weight = SubLObjectFactory.makeString("weight");
        $str75$__A = SubLObjectFactory.makeString(" ~A");
        $str76$_ = SubLObjectFactory.makeString(")");
        $str77$filter_id = SubLObjectFactory.makeString("filter-id");
        $list78 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCycOntology")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")));
        $sym79$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym80$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $kw81$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym82$SET_LEARNERS = SubLObjectFactory.makeSymbol("SET-LEARNERS");
        $sym83$STANFORD_NER_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN");
        $sym84$ADD_LEARNER = SubLObjectFactory.makeSymbol("ADD-LEARNER");
        $sym85$NUMBER_LEARN = SubLObjectFactory.makeSymbol("NUMBER-LEARN");
        $sym86$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $sym87$ADD_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("ADD-CONCEPT-FILTER-SPEC");
        $sym88$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $sym89$SET_BASE_MT = SubLObjectFactory.makeSymbol("SET-BASE-MT");
        $sym90$GET_TAGGED_DOCUMENT_FROM_PARAMS = SubLObjectFactory.makeSymbol("GET-TAGGED-DOCUMENT-FROM-PARAMS");
        $kw91$USE_NER = SubLObjectFactory.makeKeyword("USE-NER");
        $str92$NIL = SubLObjectFactory.makeString("NIL");
        $kw93$EXHAUSTIVE_TAGGING = SubLObjectFactory.makeKeyword("EXHAUSTIVE-TAGGING");
        $kw94$IGNORE_POS_TAGGER = SubLObjectFactory.makeKeyword("IGNORE-POS-TAGGER");
        $kw95$SENTENCIFY = SubLObjectFactory.makeKeyword("SENTENCIFY");
        $kw96$LEXICAL_MT = SubLObjectFactory.makeKeyword("LEXICAL-MT");
        $kw97$CASE_SENSITIVITY = SubLObjectFactory.makeKeyword("CASE-SENSITIVITY");
        $kw98$OFF = SubLObjectFactory.makeKeyword("OFF");
        $kw99$CONCEPT_FILTER = SubLObjectFactory.makeKeyword("CONCEPT-FILTER");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCycOntology")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"))));
        $kw101$ANNOTATE_SPECS = SubLObjectFactory.makeKeyword("ANNOTATE-SPECS");
        $kw102$ANNOTATE_INSTANCES = SubLObjectFactory.makeKeyword("ANNOTATE-INSTANCES");
        $kw103$MIN_LEXICAL_STRENGTH = SubLObjectFactory.makeKeyword("MIN-LEXICAL-STRENGTH");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONTEXT-SENSITIVE"));
        $const105$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIMARY"));
        $const107$PrimaryLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping"));
        $kw108$VANISHINGLY_RARE = SubLObjectFactory.makeKeyword("VANISHINGLY-RARE");
        $str109$inputText = SubLObjectFactory.makeString("inputText");
        $str110$use_ner = SubLObjectFactory.makeString("use-ner");
        $str111$exhaustive_tagging = SubLObjectFactory.makeString("exhaustive-tagging");
        $str112$ignore_pos_tagger = SubLObjectFactory.makeString("ignore-pos-tagger");
        $str113$sentencify = SubLObjectFactory.makeString("sentencify");
        $str114$lexicalMt = SubLObjectFactory.makeString("lexicalMt");
        $sym115$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");
        $sym116$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");
        $sym117$EXHAUSTIVE_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("EXHAUSTIVE-CONCEPT-TAGGER");
        $sym118$SIMPLE_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("SIMPLE-CONCEPT-TAGGER");
        $sym119$POS_TAGGING_EXHAUSTIVE_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("POS-TAGGING-EXHAUSTIVE-CONCEPT-TAGGER");
        $sym120$POS_TAGGING_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("POS-TAGGING-CONCEPT-TAGGER");
        $str121$disambiguate = SubLObjectFactory.makeString("disambiguate");
        $str122$lexicalStrength = SubLObjectFactory.makeString("lexicalStrength");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeString("true"), (SubLObject)SubLObjectFactory.makeString("maximal"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("minimal"), (SubLObject)SubLObjectFactory.makeString("context_sensitive"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("primary"));
        $str126$vanishingly_rare = SubLObjectFactory.makeString("vanishingly_rare");
        $str127$allowSpecs = SubLObjectFactory.makeString("allowSpecs");
        $sym128$READ_MULTIPLE_TERMS_FROM_STRING = SubLObjectFactory.makeSymbol("READ-MULTIPLE-TERMS-FROM-STRING");
        $str129$allowInstances = SubLObjectFactory.makeString("allowInstances");
        $sym130$CB_GUESS_TERM = SubLObjectFactory.makeSymbol("CB-GUESS-TERM");
        $str131$caseSensitivity = SubLObjectFactory.makeString("caseSensitivity");
        $str132$preferred = SubLObjectFactory.makeString("preferred");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("t"));
        $kw134$ON = SubLObjectFactory.makeKeyword("ON");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("off"), (SubLObject)SubLObjectFactory.makeString("f"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("preferred"), (SubLObject)SubLObjectFactory.makeString(":preferred"));
        $str137$Invalid_argument_for_case_sensiti = SubLObjectFactory.makeString("Invalid argument for case-sensitivity ~S");
        $str138$text_html = SubLObjectFactory.makeString("text/html");
        $str139$text_xml = SubLObjectFactory.makeString("text/xml");
        $sym140$CB_TAG_DOCUMENT_HANDLER = SubLObjectFactory.makeSymbol("CB-TAG-DOCUMENT-HANDLER");
        $sym141$CB_XML_TAG_DOCUMENT = SubLObjectFactory.makeSymbol("CB-XML-TAG-DOCUMENT");
        $str142$Concept_Tagger_Web_Service = SubLObjectFactory.makeString("Concept Tagger Web Service");
        $kw143$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw144$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw145$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str146$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str147$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str148$button = SubLObjectFactory.makeString("button");
        $str149$reload = SubLObjectFactory.makeString("reload");
        $str150$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str151$post = SubLObjectFactory.makeString("post");
        $str152$cb_tag_document_handler = SubLObjectFactory.makeString("cb-tag-document-handler");
        $int153$100 = SubLObjectFactory.makeInteger(100);
        $str154$virtual = SubLObjectFactory.makeString("virtual");
        $str155$Tag_to__ = SubLObjectFactory.makeString("Tag to: ");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $str157$Lexical_Mt__optional_ = SubLObjectFactory.makeString("Lexical Mt (optional)");
        $int158$60 = SubLObjectFactory.makeInteger(60);
        $str159$_Use_Named_Entity_Recognizer = SubLObjectFactory.makeString(" Use Named Entity Recognizer");
        $str160$t = SubLObjectFactory.makeString("t");
        $str161$_Ignore_Part_of_speech_tagger = SubLObjectFactory.makeString(" Ignore Part-of-speech tagger");
        $str162$_Obey_computed_sentence_boundarie = SubLObjectFactory.makeString(" Obey computed sentence boundaries?");
        $str163$Should_complex_phrases_also_get_i = SubLObjectFactory.makeString("Should complex phrases also get interpretations for the simpler words contained within them?");
        $str164$_Tag_Exhaustively = SubLObjectFactory.makeString(" Tag Exhaustively");
        $str165$_Disambiguation__ = SubLObjectFactory.makeString(" Disambiguation: ");
        $kw166$T = SubLObjectFactory.makeKeyword("T");
        $str167$rule = SubLObjectFactory.makeString("rule");
        $str168$Maximal = SubLObjectFactory.makeString("Maximal");
        $kw169$NIL = SubLObjectFactory.makeKeyword("NIL");
        $str170$none = SubLObjectFactory.makeString("none");
        $str171$None = SubLObjectFactory.makeString("None");
        $str172$_Minimum_Lexical_Strength__ = SubLObjectFactory.makeString(" Minimum Lexical Strength: ");
        $str173$primary = SubLObjectFactory.makeString("primary");
        $str174$Use_only_primary_mappings = SubLObjectFactory.makeString("Use only primary mappings");
        $str175$context_sensitive = SubLObjectFactory.makeString("context_sensitive");
        $str176$Exclude_vanishingly_rare_mappings = SubLObjectFactory.makeString("Exclude vanishingly rare mappings");
        $str177$Use_all_lexical_mappings = SubLObjectFactory.makeString("Use all lexical mappings");
        $str178$_Extract_Propositional_Informatio = SubLObjectFactory.makeString(" Extract Propositional Information (HTML-only)");
        $str179$extract_info = SubLObjectFactory.makeString("extract-info");
        $str180$Tag_to_XML = SubLObjectFactory.makeString("Tag to XML");
        $str181$Tag_to_HTML = SubLObjectFactory.makeString("Tag to HTML");
        $sym182$TAG_CONCEPTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE");
        $sym183$TAG_CONCEPTS_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-P");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES-TO-DO"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARED-SENTENCE-OUTPUT"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCES-TO-DO"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)SubLObjectFactory.makeKeyword("SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("PREPARED-SENTENCE-OUTPUT"));
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT"));
        $sym188$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym189$TAG_CONCEPTS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-P"));
        $sym191$TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO");
        $sym192$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENTENCES_TO_DO = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENTENCES-TO-DO");
        $sym193$TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT");
        $sym194$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_DOCUMENT = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-DOCUMENT");
        $sym195$TAG_CONCEPTS_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-LEXICON");
        $sym196$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-LEXICON");
        $sym197$TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER");
        $sym198$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_SENSE_TAGGER = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-SENSE-TAGGER");
        $sym199$TAG_CONCEPTS_ITERATOR_STATE_FILTER = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-FILTER");
        $sym200$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_FILTER = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-FILTER");
        $sym201$TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC");
        $sym202$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_OUTPUT_SPEC = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-OUTPUT-SPEC");
        $sym203$TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");
        $sym204$_CSETF_TAG_CONCEPTS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeSymbol("_CSETF-TAG-CONCEPTS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");
        $kw205$SENTENCES_TO_DO = SubLObjectFactory.makeKeyword("SENTENCES-TO-DO");
        $kw206$DOCUMENT = SubLObjectFactory.makeKeyword("DOCUMENT");
        $kw207$SENSE_TAGGER = SubLObjectFactory.makeKeyword("SENSE-TAGGER");
        $kw208$OUTPUT_SPEC = SubLObjectFactory.makeKeyword("OUTPUT-SPEC");
        $kw209$PREPARED_SENTENCE_OUTPUT = SubLObjectFactory.makeKeyword("PREPARED-SENTENCE-OUTPUT");
        $str210$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw211$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym212$MAKE_TAG_CONCEPTS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-TAG-CONCEPTS-ITERATOR-STATE");
        $kw213$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw214$END = SubLObjectFactory.makeKeyword("END");
        $sym215$VISIT_DEFSTRUCT_OBJECT_TAG_CONCEPTS_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAG-CONCEPTS-ITERATOR-STATE-METHOD");
        $sym216$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym217$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym218$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $sym219$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw220$INTERPS = SubLObjectFactory.makeKeyword("INTERPS");
        $kw221$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $kw222$LEX_ENTRIES = SubLObjectFactory.makeKeyword("LEX-ENTRIES");
        $kw223$STRING = SubLObjectFactory.makeKeyword("STRING");
        $sym224$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $kw225$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw226$INFO = SubLObjectFactory.makeKeyword("INFO");
        $sym227$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym228$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym229$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $str230$_______________Error_____________ = SubLObjectFactory.makeString("***************Error*****************");
        $str231$Caught__S_while_processing__S__ = SubLObjectFactory.makeString("Caught ~S while processing ~S~%");
        $sym232$CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER");
        $sym233$CONCEPT_TAGGER_P = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-P");
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-METHOD"));
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TAG-METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON-METHOD"));
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-TAG-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-LEXICON-METHOD"));
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-TAG-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-LEXICON-METHOD"));
        $sym238$PRINT_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("PRINT-CONCEPT-TAGGER");
        $sym239$CONCEPT_TAGGER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-PRINT-FUNCTION-TRAMPOLINE");
        $list240 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-P"));
        $sym241$CONCEPT_TAGGER_NAME = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-NAME");
        $sym242$_CSETF_CONCEPT_TAGGER_NAME = SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-NAME");
        $sym243$CONCEPT_TAGGER_TAG_METHOD = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-TAG-METHOD");
        $sym244$_CSETF_CONCEPT_TAGGER_TAG_METHOD = SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-TAG-METHOD");
        $sym245$CONCEPT_TAGGER_LEXICON_METHOD = SubLObjectFactory.makeSymbol("CONCEPT-TAGGER-LEXICON-METHOD");
        $sym246$_CSETF_CONCEPT_TAGGER_LEXICON_METHOD = SubLObjectFactory.makeSymbol("_CSETF-CONCEPT-TAGGER-LEXICON-METHOD");
        $kw247$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw248$TAG_METHOD = SubLObjectFactory.makeKeyword("TAG-METHOD");
        $kw249$LEXICON_METHOD = SubLObjectFactory.makeKeyword("LEXICON-METHOD");
        $sym250$MAKE_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("MAKE-CONCEPT-TAGGER");
        $sym251$VISIT_DEFSTRUCT_OBJECT_CONCEPT_TAGGER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONCEPT-TAGGER-METHOD");
        $str252$__Concept_Tagger__A_ = SubLObjectFactory.makeString("#<Concept-Tagger:~A>");
        $str253$_S_is_not_a_registered_concept_ta = SubLObjectFactory.makeString("~S is not a registered concept-tagger");
        $str254$_S_is_not_a_registered_concept_ta = SubLObjectFactory.makeString("~S is not a registered concept tagger");
        $sym255$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym256$LEXIFY_SENTENCE_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY");
        $sym257$GET_CONCEPT_FILTER_SPECS = SubLObjectFactory.makeSymbol("GET-CONCEPT-FILTER-SPECS");
        $sym258$GET = SubLObjectFactory.makeSymbol("GET");
        $sym259$TAG_CONCEPTS_USING_POS_TAGS = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-USING-POS-TAGS");
        $sym260$NEW_TERM_LEXICON = SubLObjectFactory.makeSymbol("NEW-TERM-LEXICON");
        $sym261$TAG_CONCEPTS_EXHAUSTIVELY_USING_POS_TAGS = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-EXHAUSTIVELY-USING-POS-TAGS");
        $sym262$TAG_CONCEPTS_FAST = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-FAST");
        $sym263$TAG_CONCEPTS_FAST_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("TAG-CONCEPTS-FAST-EXHAUSTIVELY");
        $sym264$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $sym265$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
        $const266$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $sym267$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
        $const268$ksTermString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ksTermString"));
        $sym269$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
        $const270$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $sym271$ALLOW_MT = SubLObjectFactory.makeSymbol("ALLOW-MT");
        $const272$RelationParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt"));
        $sym273$STANFORD_NER_DATE_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-DATE-LEARN");
        $kw274$WARN = SubLObjectFactory.makeKeyword("WARN");
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $kw276$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw277$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw278$PHRASE_TYPES = SubLObjectFactory.makeKeyword("PHRASE-TYPES");
        $kw279$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $kw280$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $const281$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym282$PARSING_REWRITE_OF_INVERSE_ = SubLObjectFactory.makeSymbol("PARSING-REWRITE-OF-INVERSE?");
        $kw283$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $kw284$COMPLEX = SubLObjectFactory.makeKeyword("COMPLEX");
        $kw285$INTERP_SPEC = SubLObjectFactory.makeKeyword("INTERP-SPEC");
        $kw286$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $sym287$INTERSECTION = SubLObjectFactory.makeSymbol("INTERSECTION");
        $kw288$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const289$ImplementationConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplementationConstant"));
        $sym290$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $const291$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $const292$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $str293$T = SubLObjectFactory.makeString("T");
        $list294 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("doc-string"), (SubLObject)SubLObjectFactory.makeString("Bananas and kiwis are fruit"));
        $list295 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("submit-button"), (SubLObject)SubLObjectFactory.makeString("Display as HTML"));
        $str296$doc_string = SubLObjectFactory.makeString("doc-string");
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("sumbit-button"), (SubLObject)SubLObjectFactory.makeString("Display as HTML"));
        $sym298$FORGET = SubLObjectFactory.makeSymbol("FORGET");
        $kw299$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str300$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NEWS & NOTES\n\nThe San Francisco Chronicle reports this week on new measures that Whole Foods plans to take to increase its commitment to sustainable agriculture and local produce, including a requirement that all Whole Foods stores buy from at least four individual local farms, a pledge of $10 million a year in donations to small farms, and Sunday Farmers Markets in Whole Foods parking lots.\n\nThe Agriculture Department is proposing new legislation that would loosen the standards for what is classified as grass-fed, reports The New York Times. Under the proposed rule, it is possible that animals that were not raised on a pasture and were given antibiotics and hormones could still be considered grass-fed.\n\nGothamist provides tips on how to prepare and store lettuce, which they like to get from Gorzynski Organic Farm at the Union Square Greenmarket.\n\nGET OUT OF TOWN\n\nThe New York Times has a series of articles this week on road trips to various farms, purveyors, and eateries in Columbia County, NY, Long Beach Island, NJ, Litchfield County, CT, and North Folk, NY. If you're looking for more ideas, several Greenmarket farms offer \"pick-your-own\" or \"make-your-own\" activities:\n\n    * You can pick-your-own fruit at Phillips Farms in Milford, NJ every day except for Tuesdays, from 8:00 a.m. to 8:00 p.m. Go now and catch the tail end of the blueberry season. Peaches, raspberries, and blackberries are also ready to be picked (or will be shortly). Call 908.995.0022 for more information.\n    * Prospect Hill Orchards offers seasonal pick-your-own weekends (9:00 a.m. to 4:00 p.m.). Right now, peaches (donut, yellow, and white) are ripe and ready. Nectarines can be picked starting the second weekend of August. Come mid-September, apples, pears, and pumpkins will be available. Contact Steve, Judy, or Brad Clarke at 845.795.2383 for more information.\n    * Learn old-fashioned cheesemaking at Valley Shepherd Creamery in Long Valley, NJ. You'll get to make your own cheese wheel, which you leave in the Creamery's hillside aging cave and pick up when it's ready in 60 to 75 days. The next cheesemaking class is September 17th. It costs $129 and includes the cheese class, cheese tasting, a tour, luncheon, and the wheel of cheese. Call 908.876.3200 for more information.\n\nWHAT'S IN, WHAT'S OUT\n\nBaby organic carrots ($1.50/bunch) and hot peppers (6/$1.00) from HydroGarden Farm...hyssop tea (\"licorice flavor, heals the lungs\") and lemon verbena tea ($1.00) from Berried Treasures...cranberry beans ($3.00/lb.) and yellow plum tomatoes ($2.50/lb) at Migliorelli Farm...blackberries ($4.00/half pint) from Locust Grove and Breezy Hill Orchard...early red free apples ($1.50) from Oak Grove Plantation...more varieties of apples from Caradonna, including red delicious, pristine, golden delicious, empire, mutsu, and cameo ($.75 to $1.25/lb.)...cubanelles ($2.40/lb.) from Keith's.\n\nDue to popular demand, Lynnhaven now has feta in brine (which gives it its characteristic saltiness). Feta crumbles not in brine are still available ($5.00).\n\nTamarack Hollow Farm is now taking orders for holiday ham, duck, goose, and suckling pig.\n\nRhubarb and fava beans are essentially gone...cherries are becoming less abundant...only tri-star strawberries are left.\n\nFOCUS ON: Just Rugelach\n\nRugelach Although the labels on their goods and the sign on their stand say \"Just Rugelach,\" perhaps the name on their CENY placard - \"Not Just Rugelach\" - is more apt. In addition to the traditional Jewish treat, they sell a wide array of baked goods: everything from muffins, strudels, bread, and cookies to more uncommon items. Take the roast pork buns: Roselie Halik, who runs the company with her husband Tom, explains that when she was pregnant she was craving them and Tom developed the recipe for her. They liked it so much that they kept it around and sell it at market to this day. Both times I visited them at the Tribeca Greenmarket, numerous patrons came just for these doughy delicacies, which they sell for $1.00 each.\n\nTom Halik started the company in 1995 after attending culinary school in Paris and working at the 5th Avenue Epicure in New York (where he met Roselie). He has come to be known as \"the rugelach man\" in Kearny, NJ, where they are based.  Everything is made from scratch, every day, and Tom is always working to improve his recipes: \"constantly developing,\" Roselie says. She tries all the recipes as her husband works on them, offering advice how they might be tweaked before they are finalized. \"I'm his biggest critic,\" she says with a laugh.\n\nDespite the array of baked goods they sell, Roselie says that \"people always come for the rugelach.\" Right now they offer four different flavors: walnut raison apricot, walnut raisin raspberry, chocolate hazelnut, and cinnamon raisin. She says they try to make seasonal varieties, but always keep their standbys, like the classic walnut raisin apricot. Their rugelach can be bought wholesale or through mail order and at any of their Greenmarket locations throughout the city (see FARMER INFORMATION). Rugelach is 50 cents a piece or $2.00/quarter pound.\n\nFARMER INFORMATION\n\n    * Berried Treasures, Cooks Falls, NY. At the Union Square Greenmarket Wednesdays and Fridays.\n    * Breezy Hill Orchard, Staatsburg, NY. At the Union Square Greenmarket Wednesdays and Saturdays and the Orchard Street Market on Sundays (845.266.3979).\n    * Caradonna, at the Union Square Greenmarket Wednesdays and Saturdays.\n    * Hydro Garden Farm, Yaphank, NY. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (631.286.3423).\n    * Just Rugelach, Kearny, NJ. At the Tribeca Greenmarket Wednesdays and Saturdays, Brooklyn Borough Hall Greenmarket Tuesdays and Saturdays, UN Plaza Greenmarket on Wednesdays,  Bowling Green Greenmarket on Thursdays, and 77th Street Greenmarket and Jackson Heights Greenmarket on Sundays (201.246.9211).\n    * Keith's Farm, Westtown, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.856.4955).\n    * Locust Grove, Milton, NY. At the Union Square Greenmarket Wednesdays and Saturdays (845.795.5194).\n    * Lynnhaven, Pine Bush, NY. At the Union Square Greenmarket on Wednesdays (845.744.6089).\n    * Migliorelli Farm, Tivoli, NY. At the Union Square Greenmarket Wednesdays, Fridays, and Saturdays.\n    * Oak Grove Plantation, at the Union Square Greenmarket Fridays and Saturdays.\n    * Phillips Farms, Milford, NJ. At the Union Square Greenmarket Mondays, Wednesdays, Fridays, and Saturdays (908.995.0022).\n    * Prospect Hill Orchards, Milton, NY. At the Tribeca Greenmarket Saturdays (845.795.2383).\n    * Tamarack Hollow Farm, Corinth, VT. At the Union Square Greenmarket on Wednesdays (802.439.5078)\n    * Valley Shepherd Creamery, Long Valley, NJ. At the Union Square Greenmarket Wednesdays and Saturdays and the Tribeca Greenmarket on Wednesdays (908.876.3200)."), (SubLObject)SubLObjectFactory.makeString("Cheap Fun Wines\nCheap Fun Wines.com is on a mission to find the most luscious wines on the planet for under $20.\n\nLeather Wine ToteThere are some days when it's fine to be swinging your bottles around in a nylon wine tote, but sometimes you need to class things up a bit. Enter the leather wine carrier from Wine Enthusiast, available at Amazon - it holds two bottles and your opening gear, and it makes you look a little less K-Mart and a little more J. Peterman.\n\n    Product Description\n\nWhen an invitation restaurant or learned palate requires you to 'bring your own' you can do so at last with classic style and good taste. Our two-bottle wine tote is crafted of beautifully thick and supple nubuck with a warm brown finish that is smooth natural and surprisingly rugged. Features a zippered compartment to keep your corkscrew and antique-finished brass hardware for a handsome conclusion to this superior piece. Also holds champagne.from Amazon"), (SubLObject)SubLObjectFactory.makeString("Vagablond - Stylish Travel, Food & Wine Blog\nThe globetrotter's guide to fashionable travel, wine, and food.\n\nI've bought $100 bottles of wine and $10 bottles. Mostly the latter. But to some, $500 for 25.6 ounces of fermented grape juice and yeast is a price well worth paying. These are the \"baseball card collectors\" of wine who buy some to save, some to trade and some to sell.\n\nAccording to an article, \"Worth Its Weight In Gold?\" in today's SF Chronicle, \"$100 is a midrange price for a top-notch Napa Valley Cabernet Sauvignon, and with the price of Screaming Eagle Cabernet soaring to $500 with the October release of the 2003 vintage, expect others to follow along.\""), (SubLObject)SubLObjectFactory.makeString("Accidental Hedonist\n\nIn writing about the French restaurants, I came to question just exactly where the idea of \"restaurants\" comes from. As per usual, I've discovered something that I have previously did not know.\n\nThe word itself provides a fair amount of clues...restaurant comes from the Old French term restaurateur, which meant someone who provides (i.e. sells) restaurer. Restauarer means \"to restore\". In other words - a \"restorative\".\n\nIf one were to look back in the history books for the word \"restaurant\", the first appearance shows up in the 15th century as a recipe. In this recipe, a capon is rendered in a glass kettle along with gold or gems. This itself also help evolve into the idea that chicken soup can cures what ails.\n\nOver the course of years, restaurants evolved from gold laden rendered chicken, into soups and broths which were sold to the public by specific people. Much like other food producers, restaurateurs had their own guild and were able to sell the broth, much like charcutiers sold sausages and rotisseurs sold fresh game.\n\nIt was this collection of different vendors and sellers of food that allowed restaurateurs to flourish. The French Revolution helped take down, not just a monarchy, but the economic system of guilds that sometimes prevented one food producer from selling products that were typically the \"responsibility\" of another. Additionally the bourgeoisie became a viable economic force as tradesmen and artisans started to travel to other areas of France to find new markets for their wares. These traveling businessmen looked for places to eat which offered a variety of foods in a comforting atmosphere that reflected their own station in life. These were variables that inns and taverns (the initial purveyors of food to travelers) could not meet on a regular basis.\n\nRestaurants filled this void nicely, first by selling varieties of bouillon. Then, as the guikld system slowly dissolved away, they started offering other foodstuffs, such as soups, meats and pastries. This eventually (and quickly) evolved into businesses that resemble the restaurants we know of today.\n\nWho would have thought that the creation of restaurants was so involved?\n\nTechnorati Tags: Restaurants, Food, Food+History "), (SubLObject)SubLObjectFactory.makeString("Wine Camp\nA wine blog with a terroir-ist twist.\n\nmikerichmond.jpgBouchaine is a winery that seemed always to be around, but was never exciting. While one of the founders of Carneros as a top pinot noir region, Bouchaine always remained in the shadow of its neighbors Acacia and Saintsbury. While some good wines were made at Bouchaine, other wineries rode the Carneros wave to the top.\n\nNow things are turned around and the same thing that took Acacia to the top is now powering Bouchaine, which has finally taken its place on the \"A\" team of Carneros producers. What made the wines of Acacia compelling was the talent, intelligence and passion of winemaker Mike Richmond, who has now taken his considerable talents to Bouchaine. \n\nMeanwhile the once revered Acacia winery has been turned into an industrial production line of plonk pinot by alcoholic beverage super-giant Diageo and now Acacia is involved in hand-to-hand combat with Sanford Winery and other corporate pinot noir producers to see who can sell the most boxes of indistinguishable pinot noir. If you are trying to decide between which of these labels to buy you should flip a coin or buy the cheapest because what's in the bottle is of little consequence or interest.\n\nAt this year's International Pinot Noir Celebration (IPNC), Mike Richmond presented his first Bouchaine Pinot Noir that he was responsible for from start to finish and a very nice wine it is. The 2004 Bouchaine Carneros Estate Pinot Noir is a lovely wine with a graceful balance and an intriguing subtle character. It certainly shows the richer characteristics of California, but is still restrained and complex with a lingering, not heavy finish.\n\nThe emergence of Bouchaine as a first class Carneros pinot noir producer reminds us that while great wines are made in the vineyard, you have to know what to do with those grapes when you get them. Mike Richmond obviously knows what to do and, perhaps more importantly when it comes to pinot noir - what not to do. "));
        $sym302$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS = SubLObjectFactory.makeSymbol("GET-TAGGED-DOCUMENT-FROM-HTML-ARGS");
        $kw303$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym304$TERM_ABSENT_FROM_DOC_INTERPS = SubLObjectFactory.makeSymbol("TERM-ABSENT-FROM-DOC-INTERPS");
        $kw305$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw306$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw307$KB = SubLObjectFactory.makeKeyword("KB");
        $kw308$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw309$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list310 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inputText"), (SubLObject)SubLObjectFactory.makeString("an iranian")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter-id"), (SubLObject)SubLObjectFactory.makeString("6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ignore-pos-tagger"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disambiguate"), (SubLObject)SubLObjectFactory.makeString("none")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalStrength"), (SubLObject)SubLObjectFactory.makeString("context_sensitive")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return-mime-type:text/html"), (SubLObject)SubLObjectFactory.makeString("Tag to HTML")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquifier-code"), (SubLObject)SubLObjectFactory.makeString("378")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AndamanAndNicobarIslands-UnionTerritoryIndia"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inputText"), (SubLObject)SubLObjectFactory.makeString("an iranian")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter-id"), (SubLObject)SubLObjectFactory.makeString("6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ignore-pos-tagger"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disambiguate"), (SubLObject)SubLObjectFactory.makeString("maximal")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalStrength"), (SubLObject)SubLObjectFactory.makeString("primary")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return-mime-type:text/html"), (SubLObject)SubLObjectFactory.makeString("Tag to HTML")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquifier-code"), (SubLObject)SubLObjectFactory.makeString("378")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AndamanAndNicobarIslands-UnionTerritoryIndia"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inputText"), (SubLObject)SubLObjectFactory.makeString("an iranian")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter-id"), (SubLObject)SubLObjectFactory.makeString("6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ignore-pos-tagger"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disambiguate"), (SubLObject)SubLObjectFactory.makeString("maximal")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalStrength"), (SubLObject)SubLObjectFactory.makeString("primary")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return-mime-type:text/html"), (SubLObject)SubLObjectFactory.makeString("Tag to HTML")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquifier-code"), (SubLObject)SubLObjectFactory.makeString("378")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Aryan-Nations"))));
        $sym311$GET_TAGGED_DOCUMENT_FROM_HTML_ARGS_POS = SubLObjectFactory.makeSymbol("GET-TAGGED-DOCUMENT-FROM-HTML-ARGS-POS");
        $sym312$TERM_IN_DOC_INTERPS = SubLObjectFactory.makeSymbol("TERM-IN-DOC-INTERPS");
        $list313 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inputText"), (SubLObject)SubLObjectFactory.makeString("an iranian")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter-id"), (SubLObject)SubLObjectFactory.makeString("6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ignore-pos-tagger"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disambiguate"), (SubLObject)SubLObjectFactory.makeString("none")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalStrength"), (SubLObject)SubLObjectFactory.makeString("vanishingly_rare")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return-mime-type:text/html"), (SubLObject)SubLObjectFactory.makeString("Tag to HTML")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquifier-code"), (SubLObject)SubLObjectFactory.makeString("378")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AndamanAndNicobarIslands-UnionTerritoryIndia"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inputText"), (SubLObject)SubLObjectFactory.makeString("an iranian")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter-id"), (SubLObject)SubLObjectFactory.makeString("6")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ignore-pos-tagger"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("disambiguate"), (SubLObject)SubLObjectFactory.makeString("maximal")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lexicalStrength"), (SubLObject)SubLObjectFactory.makeString("vanishingly_rare")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return-mime-type:text/html"), (SubLObject)SubLObjectFactory.makeString("Tag to HTML")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("uniquifier-code"), (SubLObject)SubLObjectFactory.makeString("378")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Aryan-Nations"))));
        $sym314$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $list315 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DeltaOnQuantitySlotFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gibbsFreeEnergyOfSystem")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConcernsThermodynamicSystem")))), (SubLObject)concept_tagger.T));
        $list316 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("an iranian"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILTER-ID"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"))), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE-POS-TAGGER"), (SubLObject)concept_tagger.T, (SubLObject)SubLObjectFactory.makeKeyword("MIN-LEXICAL-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("CONTEXT-SENSITIVE")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AndamanAndNicobarIslands-UnionTerritoryIndia"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("an iranian"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILTER-ID"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"))), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE-POS-TAGGER"), (SubLObject)concept_tagger.T, (SubLObject)SubLObjectFactory.makeKeyword("MIN-LEXICAL-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMARY")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AndamanAndNicobarIslands-UnionTerritoryIndia"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("an iranian"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILTER-ID"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"))), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE-POS-TAGGER"), (SubLObject)concept_tagger.T, (SubLObject)SubLObjectFactory.makeKeyword("MIN-LEXICAL-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMARY")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Aryan-Nations"))));
    }
    
    public static final class $tag_concepts_iterator_state_native extends SubLStructNative
    {
        public SubLObject $sentences_to_do;
        public SubLObject $document;
        public SubLObject $lexicon;
        public SubLObject $sense_tagger;
        public SubLObject $filter;
        public SubLObject $output_spec;
        public SubLObject $prepared_sentence_output;
        private static final SubLStructDeclNative structDecl;
        
        public $tag_concepts_iterator_state_native() {
            this.$sentences_to_do = (SubLObject)CommonSymbols.NIL;
            this.$document = (SubLObject)CommonSymbols.NIL;
            this.$lexicon = (SubLObject)CommonSymbols.NIL;
            this.$sense_tagger = (SubLObject)CommonSymbols.NIL;
            this.$filter = (SubLObject)CommonSymbols.NIL;
            this.$output_spec = (SubLObject)CommonSymbols.NIL;
            this.$prepared_sentence_output = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tag_concepts_iterator_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$sentences_to_do;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$document;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lexicon;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$sense_tagger;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$filter;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$output_spec;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$prepared_sentence_output;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$sentences_to_do = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$document = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lexicon = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$sense_tagger = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$filter = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$output_spec = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$prepared_sentence_output = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$tag_concepts_iterator_state_native.class, concept_tagger.$sym182$TAG_CONCEPTS_ITERATOR_STATE, concept_tagger.$sym183$TAG_CONCEPTS_ITERATOR_STATE_P, concept_tagger.$list184, concept_tagger.$list185, new String[] { "$sentences_to_do", "$document", "$lexicon", "$sense_tagger", "$filter", "$output_spec", "$prepared_sentence_output" }, concept_tagger.$list186, concept_tagger.$list187, concept_tagger.$sym188$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $tag_concepts_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $tag_concepts_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TAG-CONCEPTS-ITERATOR-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return concept_tagger.tag_concepts_iterator_state_p(arg1);
        }
    }
    
    public static final class $concept_tagger_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $tag_method;
        public SubLObject $lexicon_method;
        private static final SubLStructDeclNative structDecl;
        
        public $concept_tagger_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$tag_method = (SubLObject)CommonSymbols.NIL;
            this.$lexicon_method = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$concept_tagger_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tag_method;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lexicon_method;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tag_method = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lexicon_method = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$concept_tagger_native.class, concept_tagger.$sym232$CONCEPT_TAGGER, concept_tagger.$sym233$CONCEPT_TAGGER_P, concept_tagger.$list234, concept_tagger.$list235, new String[] { "$name", "$tag_method", "$lexicon_method" }, concept_tagger.$list236, concept_tagger.$list237, concept_tagger.$sym238$PRINT_CONCEPT_TAGGER);
        }
    }
    
    public static final class $concept_tagger_p$UnaryFunction extends UnaryFunction
    {
        public $concept_tagger_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CONCEPT-TAGGER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return concept_tagger.concept_tagger_p(arg1);
        }
    }
}

/*

	Total time: 2749 ms
	
*/