package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.red_infrastructure_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.pph_question;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.subloop_tcp_client;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class search_engine extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.search_engine";
    public static final String myFingerPrint = "8f93d90346f8af9c9a47198352efbb5d61551394d5849393f339deb6fa185246";
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12836L)
    private static SubLSymbol $default_corpus$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 26748L)
    private static SubLSymbol $world_wide_web_corpus$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29202L)
    private static SubLSymbol $authorized_google_key$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29250L)
    private static SubLSymbol $google_client_key_file$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29524L)
    private static SubLSymbol $google_client_host$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29692L)
    private static SubLSymbol $google_client_port$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29841L)
    private static SubLSymbol $google_client$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46924L)
    private static SubLSymbol $wikipedia$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47936L)
    private static SubLSymbol $lucene_client_host$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47979L)
    private static SubLSymbol $lucene_client_port$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48021L)
    private static SubLSymbol $lucene_client$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 65813L)
    public static SubLSymbol $google_api_method_invocation_count$;
    private static final SubLSymbol $sym0$INFORMATION;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INSTANCE_COUNT;
    private static final SubLSymbol $sym4$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS;
    private static final SubLSymbol $sym5$ISOLATED_P;
    private static final SubLSymbol $sym6$INSTANCE_NUMBER;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE;
    private static final SubLSymbol $sym8$GET_SOURCE;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$INFORMATION_GET_SOURCE_METHOD;
    private static final SubLSymbol $sym12$ABSTRACT_PASSAGE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$VECTOR;
    private static final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS;
    private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$GET_CONTENT;
    private static final SubLSymbol $sym20$ABSTRACT_PASSAGE_EQUAL_METHOD;
    private static final SubLSymbol $sym21$SIMILARITY;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$ABSTRACT_PASSAGE_P;
    private static final SubLSymbol $sym25$GET_VECTOR;
    private static final SubLSymbol $sym26$ABSTRACT_PASSAGE_SIMILARITY_METHOD;
    private static final SubLSymbol $sym27$GET_DATES;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$GET_PUBLICATION_DATE;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$ABSTRACT_PASSAGE_GET_DATES_METHOD;
    private static final SubLSymbol $sym32$OLDER;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$DOC_ID;
    private static final SubLSymbol $sym36$SENTENCE_NUMBER;
    private static final SubLSymbol $sym37$ABSTRACT_PASSAGE_OLDER_METHOD;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD;
    private static final SubLSymbol $sym40$SIMPLE_PASSAGE;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$TEXT;
    private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS;
    private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE;
    private static final SubLSymbol $sym45$PRINT;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym50$SIMPLE_PASSAGE_PRINT_METHOD;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym53$SIMPLE_PASSAGE_GET_CONTENT_METHOD;
    private static final SubLSymbol $sym54$CORPUS_PASSAGE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CORPUS;
    private static final SubLSymbol $sym57$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS;
    private static final SubLSymbol $sym58$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE;
    private static final SubLSymbol $sym59$GET_CORPUS;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD;
    private static final SubLSymbol $sym62$CORPUS_PASSAGE_GET_CORPUS_METHOD;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD;
    private static final SubLSymbol $sym65$ABSTRACT_PASSAGE_GET_VECTOR_METHOD;
    private static final SubLSymbol $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD;
    private static final SubLSymbol $sym67$CORPUS_PASSAGE_GET_CONTENT_METHOD;
    private static final SubLSymbol $sym68$IDENTIFY_ENTITIES;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$LISTP;
    private static final SubLSymbol $sym73$ABSTRACT_LEXICON_P;
    private static final SubLSymbol $sym74$LEARN;
    private static final SubLSymbol $sym75$LEXIFY_SENTENCE;
    private static final SubLSymbol $sym76$GET;
    private static final SubLSymbol $kw77$DENOT;
    private static final SubLSymbol $kw78$PENN_TAGS;
    private static final SubLSymbol $kw79$STRING;
    private static final SubLList $list80;
    private static final SubLObject $const81$InstanceNamedFn;
    private static final SubLSymbol $sym82$ADD_PASSAGE;
    private static final SubLSymbol $sym83$CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD;
    private static final SubLSymbol $sym84$MAX_INSTANCES;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$GET_SCORE;
    private static final SubLSymbol $sym88$CORPUS_PASSAGE_MAX_INSTANCES_METHOD;
    private static final SubLSymbol $sym89$GET_PARSE_TREES;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$CHARNIAK_PARSER;
    private static final SubLSymbol $sym92$GET_PARSER;
    private static final SubLSymbol $sym93$PARSE;
    private static final SubLSymbol $sym94$CORPUS_PASSAGE_GET_PARSE_TREES_METHOD;
    private static final SubLSymbol $sym95$INFORMATION_REQUEST;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$TIMEOUT;
    private static final SubLSymbol $sym98$ERROR_HANDLING;
    private static final SubLSymbol $sym99$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS;
    private static final SubLSymbol $sym100$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE;
    private static final SubLSymbol $sym101$INITIALIZE;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD;
    private static final SubLSymbol $kw104$WARN;
    private static final SubLInteger $int105$720;
    private static final SubLSymbol $sym106$INFORMATION_REQUEST_INITIALIZE_METHOD;
    private static final SubLSymbol $sym107$KNOWLEDGE_SOURCE_QUERY;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$QUERY;
    private static final SubLSymbol $sym110$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS;
    private static final SubLSymbol $sym111$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE;
    private static final SubLSymbol $sym112$ANSWER;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD;
    private static final SubLSymbol $sym115$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str116$Query_execution_timeout_after__a_;
    private static final SubLSymbol $sym117$HANDLE_ERROR;
    private static final SubLSymbol $sym118$KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD;
    private static final SubLString $str121$__QUERY__;
    private static final SubLString $str122$_;
    private static final SubLSymbol $sym123$KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD;
    private static final SubLSymbol $kw127$THROW;
    private static final SubLSymbol $sym128$KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD;
    private static final SubLString $str129$CNSjan2004;
    private static final SubLSymbol $sym130$CORPUS_QUERY;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS;
    private static final SubLSymbol $sym133$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE;
    private static final SubLSymbol $sym134$GET_CORPUS_PATH_MAPPING;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD;
    private static final SubLSymbol $sym139$CORPUS_QUERY_GET_CORPUS_METHOD;
    private static final SubLSymbol $sym140$GET_CORPUS_PATH;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD;
    private static final SubLSymbol $sym143$CORPUS_QUERY_GET_CORPUS_PATH_METHOD;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD;
    private static final SubLString $str146$__QUERY_;
    private static final SubLString $str147$___;
    private static final SubLSymbol $sym148$CORPUS_QUERY_PRINT_METHOD;
    private static final SubLSymbol $sym149$GLIMPSE_QUERY;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS;
    private static final SubLSymbol $sym152$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE;
    private static final SubLString $str153$Non_supported_corpus__a;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD;
    private static final SubLString $str160$index;
    private static final SubLList $list161;
    private static final SubLSymbol $kw162$FILE;
    private static final SubLSymbol $kw163$ARTICLE;
    private static final SubLSymbol $kw164$LINE;
    private static final SubLSymbol $kw165$TEXT;
    private static final SubLSymbol $sym166$PASSAGE_EQUAL;
    private static final SubLSymbol $sym167$GLIMPSE_QUERY_GET_METHOD;
    private static final SubLString $str168$_glimpse_cgi;
    private static final SubLSymbol $kw169$POST;
    private static final SubLString $str170$query;
    private static final SubLSymbol $sym171$GLIMPSE_PASSAGE;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$LINE;
    private static final SubLSymbol $sym174$ARTICLE;
    private static final SubLSymbol $sym175$FILE;
    private static final SubLSymbol $sym176$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS;
    private static final SubLSymbol $sym177$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE;
    private static final SubLSymbol $sym178$STRINGP;
    private static final SubLSymbol $sym179$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym180$STRING;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD;
    private static final SubLSymbol $sym183$GLIMPSE_PASSAGE_PRINT_METHOD;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD;
    private static final SubLSymbol $sym186$GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD;
    private static final SubLString $str189$__Corpus___a___File___a___Article;
    private static final SubLSymbol $sym190$GLIMPSE_PASSAGE_GET_SOURCE_METHOD;
    private static final SubLSymbol $sym191$GURUQA_QUERY;
    private static final SubLSymbol $sym192$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS;
    private static final SubLSymbol $sym193$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE;
    private static final SubLList $list194;
    private static final SubLSymbol $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD;
    private static final SubLSymbol $kw196$DOC;
    private static final SubLSymbol $kw197$SENT;
    private static final SubLSymbol $kw198$LEN;
    private static final SubLSymbol $sym199$GURUQA_QUERY_GET_METHOD;
    private static final SubLSymbol $sym200$GURUQA_PASSAGE;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$SPAN;
    private static final SubLSymbol $sym203$SENTENCE_ID;
    private static final SubLSymbol $sym204$DOCUMENT_ID;
    private static final SubLSymbol $sym205$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS;
    private static final SubLSymbol $sym206$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE;
    private static final SubLSymbol $sym207$INTEGERP;
    private static final SubLList $list208;
    private static final SubLString $str209$Invalid_error_handling_tag;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD;
    private static final SubLSymbol $sym212$GURUQA_PASSAGE_PRINT_METHOD;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD;
    private static final SubLString $str215$Corpus___a__Document___a__Sentenc;
    private static final SubLSymbol $sym216$GURUQA_PASSAGE_GET_SOURCE_METHOD;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD;
    private static final SubLSymbol $sym219$GURUQA_PASSAGE_GET_CONTENT_METHOD;
    private static final SubLSymbol $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD;
    private static final SubLSymbol $sym221$GURUQA_PASSAGE_HANDLE_ERROR_METHOD;
    private static final SubLSymbol $sym222$LEMUR_QUERY;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$SENTNO;
    private static final SubLSymbol $sym225$DOCNO;
    private static final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS;
    private static final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE;
    private static final SubLInteger $int228$50;
    private static final SubLSymbol $sym229$POSITIVE_INTEGER_P;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD;
    private static final SubLList $list235;
    private static final SubLSymbol $sym236$LEMUR_QUERY_GET_METHOD;
    private static final SubLString $str237$_cyc_projects_aquaint_lemur_indic;
    private static final SubLString $str238$_lemur_cgi;
    private static final SubLString $str239$n;
    private static final SubLString $str240$N;
    private static final SubLString $str241$l;
    private static final SubLString $str242$p;
    private static final SubLSymbol $sym243$LEMUR_PASSAGE;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$SCORE;
    private static final SubLSymbol $sym246$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS;
    private static final SubLSymbol $sym247$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE;
    private static final SubLList $list248;
    private static final SubLList $list249;
    private static final SubLSymbol $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD;
    private static final SubLSymbol $sym251$LEMUR_PASSAGE_PRINT_METHOD;
    private static final SubLList $list252;
    private static final SubLSymbol $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD;
    private static final SubLString $str254$__Corpus___a__Source___a__Sentenc;
    private static final SubLSymbol $sym255$LEMUR_PASSAGE_GET_SOURCE_METHOD;
    private static final SubLList $list256;
    private static final SubLSymbol $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD;
    private static final SubLSymbol $sym258$LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD;
    private static final SubLSymbol $sym261$LEMUR_PASSAGE_GET_SCORE_METHOD;
    private static final SubLSymbol $sym262$QAGA_QUERY;
    private static final SubLList $list263;
    private static final SubLSymbol $sym264$AUGMENTATION_TERMS;
    private static final SubLSymbol $sym265$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS;
    private static final SubLSymbol $sym266$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE;
    private static final SubLList $list267;
    private static final SubLSymbol $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD;
    private static final SubLSymbol $kw269$DOCID;
    private static final SubLSymbol $kw270$SCORE;
    private static final SubLSymbol $kw271$AUGMENT;
    private static final SubLSymbol $sym272$QAGA_QUERY_GET_METHOD;
    private static final SubLSymbol $sym273$GET_AUGMENTATION_TERMS;
    private static final SubLList $list274;
    private static final SubLSymbol $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD;
    private static final SubLSymbol $sym276$QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD;
    private static final SubLString $str277$WWW;
    private static final SubLSymbol $sym278$GOOGLE_QUERY;
    private static final SubLList $list279;
    private static final SubLSymbol $sym280$GOOGLE_KEY;
    private static final SubLSymbol $sym281$START;
    private static final SubLSymbol $sym282$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS;
    private static final SubLSymbol $sym283$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE;
    private static final SubLList $list284;
    private static final SubLSymbol $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD;
    private static final SubLSymbol $sym286$SEARCH;
    private static final SubLSymbol $sym287$GOOGLE_QUERY_GET_METHOD;
    private static final SubLSymbol $sym288$COUNT;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD;
    private static final SubLSymbol $sym291$GOOGLE_QUERY_COUNT_METHOD;
    private static final SubLSymbol $sym292$QUIT;
    private static final SubLList $list293;
    private static final SubLSymbol $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD;
    private static final SubLSymbol $sym295$GOOGLE_QUERY_QUIT_METHOD;
    private static final SubLSymbol $sym296$SPELLING;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD;
    private static final SubLSymbol $sym299$GOOGLE_QUERY_SPELLING_METHOD;
    private static final SubLSymbol $sym300$VERSION;
    private static final SubLList $list301;
    private static final SubLSymbol $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD;
    private static final SubLSymbol $sym303$GOOGLE_QUERY_VERSION_METHOD;
    private static final SubLList $list304;
    private static final SubLSymbol $sym305$_GOOGLE_CLIENT_KEY_FILE_;
    private static final SubLString $str306$data_googlekey_txt;
    private static final SubLSymbol $kw307$PARAMETER;
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$_GOOGLE_CLIENT_HOST_;
    private static final SubLString $str310$googleserver_cyc_com;
    private static final SubLList $list311;
    private static final SubLSymbol $sym312$_GOOGLE_CLIENT_PORT_;
    private static final SubLInteger $int313$6667;
    private static final SubLSymbol $kw314$DIRECTION;
    private static final SubLSymbol $kw315$INPUT;
    private static final SubLSymbol $kw316$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw317$ERROR;
    private static final SubLSymbol $sym318$GOOGLE_CLIENT;
    private static final SubLSymbol $sym319$SET_HOST;
    private static final SubLSymbol $sym320$SET_PORT;
    private static final SubLSymbol $sym321$SET_CLIENT_KEY;
    private static final SubLSymbol $sym322$TCP_CLIENT;
    private static final SubLList $list323;
    private static final SubLSymbol $sym324$CLIENT_INTERACTION;
    private static final SubLSymbol $sym325$CLIENT_KEY;
    private static final SubLSymbol $sym326$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS;
    private static final SubLSymbol $sym327$HOST;
    private static final SubLSymbol $sym328$PORT;
    private static final SubLSymbol $sym329$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE;
    private static final SubLList $list330;
    private static final SubLSymbol $sym331$GOOGLE_CLIENT_INITIALIZE_METHOD;
    private static final SubLList $list332;
    private static final SubLList $list333;
    private static final SubLSymbol $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD;
    private static final SubLSymbol $sym335$GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD;
    private static final SubLList $list336;
    private static final SubLList $list337;
    private static final SubLList $list338;
    private static final SubLSymbol $sym339$BUILD_BASIC_GOOGLE_REQUEST;
    private static final SubLString $str340$search;
    private static final SubLSymbol $sym341$SET_DOCNO;
    private static final SubLSymbol $sym342$SET_START;
    private static final SubLSymbol $sym343$GET_ANSWER_FROM_REQUEST;
    private static final SubLSymbol $sym344$GOOGLE_CLIENT_SEARCH_METHOD;
    private static final SubLList $list345;
    private static final SubLList $list346;
    private static final SubLSymbol $sym347$GOOGLE_REQUEST;
    private static final SubLString $str348$count;
    private static final SubLSymbol $sym349$GOOGLE_CLIENT_COUNT_METHOD;
    private static final SubLList $list350;
    private static final SubLString $str351$spell;
    private static final SubLSymbol $sym352$GOOGLE_CLIENT_SPELLING_METHOD;
    private static final SubLList $list353;
    private static final SubLString $str354$_quit_;
    private static final SubLString $str355$;
    private static final SubLSymbol $sym356$GOOGLE_CLIENT_QUIT_METHOD;
    private static final SubLList $list357;
    private static final SubLString $str358$version;
    private static final SubLSymbol $sym359$GOOGLE_CLIENT_VERSION_METHOD;
    private static final SubLList $list360;
    private static final SubLList $list361;
    private static final SubLList $list362;
    private static final SubLSymbol $sym363$GOOGLE_CLIENT_INTERACTION;
    private static final SubLSymbol $sym364$SET_KEY;
    private static final SubLSymbol $sym365$SET_DIRECTIVE;
    private static final SubLSymbol $sym366$SET_DIRECTIVE_ARG;
    private static final SubLSymbol $sym367$GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD;
    private static final SubLList $list368;
    private static final SubLSymbol $sym369$PERFORM_REQUEST;
    private static final SubLSymbol $sym370$REQUEST_STRING;
    private static final SubLSymbol $sym371$BUILD_ANSWER;
    private static final SubLSymbol $sym372$GET_ANSWER;
    private static final SubLString $str373$Error_when_contacting_Google_serv;
    private static final SubLSymbol $sym374$GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD;
    private static final SubLList $list375;
    private static final SubLSymbol $sym376$GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD;
    private static final SubLList $list377;
    private static final SubLSymbol $sym378$GOOGLE_IO_ERROR;
    private static final SubLSymbol $sym379$GOOGLE_VERSION;
    private static final SubLSymbol $sym380$GOOGLE_SPELLING;
    private static final SubLSymbol $sym381$GOOGLE_COUNT;
    private static final SubLSymbol $sym382$GOOGLE_PASSAGES;
    private static final SubLSymbol $sym383$DIRECTIVE_ARG;
    private static final SubLSymbol $sym384$DIRECTIVE;
    private static final SubLInteger $int385$21;
    private static final SubLSymbol $sym386$SEARCH_DIRECTIVE_TAG;
    private static final SubLSymbol $sym387$COUNT_DIRECTIVE_TAG;
    private static final SubLSymbol $sym388$SPELL_DIRECTIVE_TAG;
    private static final SubLSymbol $sym389$QUIT_DIRECTIVE_TAG;
    private static final SubLSymbol $sym390$VERSION_DIRECTIVE_TAG;
    private static final SubLSymbol $sym391$SUBL_DIRECTIVE_TAG;
    private static final SubLString $str392$SubL;
    private static final SubLSymbol $sym393$QUERY_TAG;
    private static final SubLSymbol $sym394$QUERY_TYPE_ATTR;
    private static final SubLString $str395$type;
    private static final SubLSymbol $sym396$QUERY_COUNT_ATTR;
    private static final SubLString $str397$hitnum;
    private static final SubLSymbol $sym398$QUERY_START_ATTR;
    private static final SubLString $str399$startnum;
    private static final SubLSymbol $sym400$QUERY_KEY_ATTR;
    private static final SubLString $str401$key;
    private static final SubLSymbol $sym402$QUERY_LANGUAGE_ATTR;
    private static final SubLString $str403$language;
    private static final SubLSymbol $sym404$CONTENT_KEYWORD;
    private static final SubLSymbol $kw405$CONTENT;
    private static final SubLSymbol $sym406$URL_KEYWORD;
    private static final SubLSymbol $kw407$URL;
    private static final SubLSymbol $sym408$TITLE_KEYWORD;
    private static final SubLSymbol $kw409$TITLE;
    private static final SubLSymbol $sym410$FULL_TEXT_KEYWORD;
    private static final SubLSymbol $kw411$FULL_TEXT;
    private static final SubLSymbol $sym412$SNIPPET_KEYWORD;
    private static final SubLSymbol $kw413$SNIPPET;
    private static final SubLSymbol $sym414$OFFSET_IN_FULL_TEXT_KEYWORD;
    private static final SubLSymbol $kw415$OFFSET_IN_FULL_TEXT;
    private static final SubLSymbol $sym416$OFFSET_IN_SNIPPET_KEYWORD;
    private static final SubLSymbol $kw417$OFFSET_IN_SNIPPET;
    private static final SubLSymbol $sym418$RANK_KEYWORD;
    private static final SubLSymbol $kw419$RANK;
    private static final SubLSymbol $sym420$TOTAL_KEYWORD;
    private static final SubLSymbol $kw421$TOTAL;
    private static final SubLSymbol $sym422$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS;
    private static final SubLSymbol $sym423$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE;
    private static final SubLList $list424;
    private static final SubLSymbol $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym426$GOOGLE_PASSAGE_LIST;
    private static final SubLSymbol $sym427$GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD;
    private static final SubLList $list428;
    private static final SubLSymbol $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym430$GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD;
    private static final SubLList $list431;
    private static final SubLSymbol $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym433$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD;
    private static final SubLList $list434;
    private static final SubLSymbol $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym436$GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD;
    private static final SubLList $list437;
    private static final SubLSymbol $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym439$GOOGLE_CLIENT_INTERACTION_SET_START_METHOD;
    private static final SubLSymbol $sym440$GET_IO_ERROR_FLAG;
    private static final SubLList $list441;
    private static final SubLSymbol $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym443$GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD;
    private static final SubLList $list444;
    private static final SubLList $list445;
    private static final SubLSymbol $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLString $str447$Could_not_build_answer__the_respo;
    private static final SubLSymbol $kw448$IO_ERROR;
    private static final SubLString $str449$Google_count_is_not_a_digit_strin;
    private static final SubLSymbol $sym450$ADD;
    private static final SubLString $str451$Response__A_is_of_unwanted_type__;
    private static final SubLString $str452$Query_directive__S_is_not_support;
    private static final SubLSymbol $sym453$GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD;
    private static final SubLSymbol $sym454$GET_DIRECTIVE;
    private static final SubLList $list455;
    private static final SubLSymbol $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym457$GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD;
    private static final SubLList $list458;
    private static final SubLSymbol $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym460$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD;
    private static final SubLList $list461;
    private static final SubLSymbol $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym463$XML_WRITER;
    private static final SubLSymbol $sym464$SET_STREAM;
    private static final SubLSymbol $sym465$START_TAG;
    private static final SubLSymbol $sym466$XML_PRINT;
    private static final SubLSymbol $sym467$END_TAG;
    private static final SubLSymbol $sym468$GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD;
    private static final SubLList $list469;
    private static final SubLSymbol $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $kw471$SERVER_ERROR;
    private static final SubLSymbol $sym472$GET_GOOGLE_PASSAGES;
    private static final SubLSymbol $sym473$GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD;
    private static final SubLList $list474;
    private static final SubLSymbol $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym476$EMPTY_P;
    private static final SubLSymbol $sym477$ALLOCATE_ENUMERATOR;
    private static final SubLSymbol $sym478$FIRST;
    private static final SubLSymbol $sym479$LAST_P;
    private static final SubLSymbol $sym480$NEXT;
    private static final SubLSymbol $sym481$GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD;
    private static final SubLSymbol $sym482$BASIC_LIST;
    private static final SubLList $list483;
    private static final SubLSymbol $sym484$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS;
    private static final SubLSymbol $sym485$BASIC_COLLECTION;
    private static final SubLSymbol $sym486$CONTENTS;
    private static final SubLSymbol $sym487$ELEMENT_EQUALITY_PREDICATE;
    private static final SubLSymbol $sym488$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE;
    private static final SubLSymbol $sym489$ACCEPTABLE_P;
    private static final SubLList $list490;
    private static final SubLList $list491;
    private static final SubLSymbol $sym492$GOOGLE_PASSAGE;
    private static final SubLSymbol $sym493$IS_COMPLETE;
    private static final SubLSymbol $sym494$GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD;
    private static final SubLList $list495;
    private static final SubLString $str496$__Cannot_add__S_to_a_google_passa;
    private static final SubLSymbol $sym497$GOOGLE_PASSAGE_LIST_ADD_METHOD;
    private static final SubLList $list498;
    private static final SubLSymbol $sym499$PARSE_TREES;
    private static final SubLSymbol $sym500$TOTAL;
    private static final SubLSymbol $sym501$OFFSET_IN_TEXT;
    private static final SubLSymbol $sym502$OFFSET_IN_SNIPPET;
    private static final SubLSymbol $sym503$SNIPPET;
    private static final SubLSymbol $sym504$TITLE;
    private static final SubLSymbol $sym505$URL;
    private static final SubLSymbol $sym506$RANK;
    private static final SubLSymbol $sym507$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS;
    private static final SubLSymbol $sym508$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE;
    private static final SubLList $list509;
    private static final SubLSymbol $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym511$GOOGLE_PASSAGE_GET_SOURCE_METHOD;
    private static final SubLList $list512;
    private static final SubLSymbol $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym514$GOOGLE_PASSAGE_GET_SCORE_METHOD;
    private static final SubLList $list515;
    private static final SubLSymbol $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym517$GOOGLE_PASSAGE_IS_COMPLETE_METHOD;
    private static final SubLSymbol $sym518$GET_OFFSET_IN_FULL_TEXT;
    private static final SubLList $list519;
    private static final SubLSymbol $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym521$GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD;
    private static final SubLSymbol $sym522$GET_OFFSET_IN_SNIPPET;
    private static final SubLList $list523;
    private static final SubLSymbol $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym525$GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD;
    private static final SubLSymbol $sym526$GET_URL;
    private static final SubLList $list527;
    private static final SubLSymbol $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym529$GOOGLE_PASSAGE_GET_URL_METHOD;
    private static final SubLSymbol $sym530$GET_TITLE;
    private static final SubLList $list531;
    private static final SubLSymbol $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym533$GOOGLE_PASSAGE_GET_TITLE_METHOD;
    private static final SubLSymbol $sym534$GET_CACHED_FILE_ID;
    private static final SubLList $list535;
    private static final SubLSymbol $sym536$GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD;
    private static final SubLSymbol $sym537$GET_FULL_TEXT;
    private static final SubLList $list538;
    private static final SubLSymbol $sym539$GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD;
    private static final SubLSymbol $sym540$GET_SNIPPET;
    private static final SubLList $list541;
    private static final SubLSymbol $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym543$GOOGLE_PASSAGE_GET_SNIPPET_METHOD;
    private static final SubLSymbol $sym544$GET_RANK;
    private static final SubLList $list545;
    private static final SubLSymbol $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym547$GOOGLE_PASSAGE_GET_RANK_METHOD;
    private static final SubLSymbol $sym548$GET_TOTAL_FOR_RANK;
    private static final SubLList $list549;
    private static final SubLSymbol $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD;
    private static final SubLSymbol $sym551$GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD;
    private static final SubLSymbol $sym552$GET_RANK_AND_TOTAL;
    private static final SubLList $list553;
    private static final SubLSymbol $sym554$GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD;
    private static final SubLList $list555;
    private static final SubLSymbol $sym556$GOOGLE_PASSAGE_PRINT_METHOD;
    private static final SubLSymbol $sym557$GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD;
    private static final SubLString $str558$Wikipedia;
    private static final SubLSymbol $sym559$LUCENE_QUERY;
    private static final SubLList $list560;
    private static final SubLSymbol $sym561$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS;
    private static final SubLSymbol $sym562$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE;
    private static final SubLList $list563;
    private static final SubLSymbol $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD;
    private static final SubLSymbol $sym565$LUCENE_QUERY_GET_METHOD;
    private static final SubLSymbol $sym566$LUCENE_CLIENT;
    private static final SubLList $list567;
    private static final SubLSymbol $sym568$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS;
    private static final SubLSymbol $sym569$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE;
    private static final SubLSymbol $sym570$LUCENE_CLIENT_INITIALIZE_METHOD;
    private static final SubLList $list571;
    private static final SubLList $list572;
    private static final SubLSymbol $sym573$LUCENE_REQUEST;
    private static final SubLSymbol $sym574$LUCENE_CLIENT_SEARCH_METHOD;
    private static final SubLList $list575;
    private static final SubLSymbol $sym576$LUCENE_CLIENT_COUNT_METHOD;
    private static final SubLList $list577;
    private static final SubLList $list578;
    private static final SubLSymbol $sym579$LUCENE_CLIENT_INTERACTION;
    private static final SubLSymbol $sym580$LUCENE_CLIENT_LUCENE_REQUEST_METHOD;
    private static final SubLList $list581;
    private static final SubLSymbol $sym582$LUCENE_COUNT;
    private static final SubLSymbol $sym583$LUCENE_PASSAGES;
    private static final SubLSymbol $sym584$ID_KEYWORD;
    private static final SubLSymbol $kw585$ID;
    private static final SubLSymbol $sym586$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS;
    private static final SubLSymbol $sym587$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE;
    private static final SubLList $list588;
    private static final SubLSymbol $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym590$LUCENE_PASSAGE_LIST;
    private static final SubLSymbol $sym591$LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD;
    private static final SubLSymbol $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym593$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD;
    private static final SubLList $list594;
    private static final SubLSymbol $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLString $str596$Lucene_count_is_not_a_digit_strin;
    private static final SubLString $str597$Response_is_of_unwanted_type__S_;
    private static final SubLSymbol $sym598$LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD;
    private static final SubLSymbol $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym600$LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD;
    private static final SubLSymbol $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym602$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD;
    private static final SubLSymbol $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym604$LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD;
    private static final SubLList $list605;
    private static final SubLSymbol $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym607$LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD;
    private static final SubLList $list608;
    private static final SubLSymbol $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym610$GET_LUCENE_PASSAGES;
    private static final SubLSymbol $sym611$LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD;
    private static final SubLList $list612;
    private static final SubLSymbol $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD;
    private static final SubLSymbol $sym614$LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD;
    private static final SubLSymbol $sym615$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS;
    private static final SubLSymbol $sym616$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE;
    private static final SubLList $list617;
    private static final SubLSymbol $sym618$LUCENE_PASSAGE;
    private static final SubLSymbol $sym619$LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD;
    private static final SubLList $list620;
    private static final SubLString $str621$__Cannot_add__S_to_a_lucene_passa;
    private static final SubLSymbol $sym622$LUCENE_PASSAGE_LIST_ADD_METHOD;
    private static final SubLList $list623;
    private static final SubLSymbol $sym624$ID;
    private static final SubLSymbol $sym625$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS;
    private static final SubLSymbol $sym626$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE;
    private static final SubLList $list627;
    private static final SubLSymbol $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD;
    private static final SubLSymbol $sym629$LUCENE_PASSAGE_GET_SOURCE_METHOD;
    private static final SubLList $list630;
    private static final SubLSymbol $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD;
    private static final SubLSymbol $sym632$LUCENE_PASSAGE_GET_SCORE_METHOD;
    private static final SubLList $list633;
    private static final SubLSymbol $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD;
    private static final SubLSymbol $sym635$LUCENE_PASSAGE_IS_COMPLETE_METHOD;
    private static final SubLList $list636;
    private static final SubLSymbol $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD;
    private static final SubLSymbol $sym638$LUCENE_PASSAGE_PRINT_METHOD;
    private static final SubLSymbol $sym639$LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD;
    private static final SubLSymbol $sym640$CYCL_QUERY;
    private static final SubLList $list641;
    private static final SubLSymbol $sym642$PROPERTIES;
    private static final SubLSymbol $sym643$KNOWLEDGE_SOURCES;
    private static final SubLSymbol $sym644$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS;
    private static final SubLSymbol $sym645$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE;
    private static final SubLList $list646;
    private static final SubLList $list647;
    private static final SubLSymbol $sym648$EL_FORMULA_P;
    private static final SubLSymbol $sym649$CYCL_QUERY_P;
    private static final SubLList $list650;
    private static final SubLSymbol $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD;
    private static final SubLSymbol $sym652$GET_FROM_KB;
    private static final SubLSymbol $sym653$GET_FROM_CORPUS;
    private static final SubLString $str654$Unknown_knowledge_source__a;
    private static final SubLSymbol $sym655$CYCL_QUERY_GET_METHOD;
    private static final SubLList $list656;
    private static final SubLList $list657;
    private static final SubLSymbol $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD;
    private static final SubLSymbol $sym659$CYCL_QUERY_GET_FROM_KB_METHOD;
    private static final SubLList $list660;
    private static final SubLList $list661;
    private static final SubLSymbol $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD;
    private static final SubLSymbol $sym663$GENERATE_ASSIGNMENTS;
    private static final SubLSymbol $sym664$CYCL_QUERY_GET_FROM_CORPUS_METHOD;
    private static final SubLList $list665;
    private static final SubLList $list666;
    private static final SubLSymbol $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD;
    private static final SubLSymbol $sym668$ANSWER_P;
    private static final SubLSymbol $sym669$CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD;
    private static final SubLSymbol $sym670$MICROTHEORY_P;
    private static final SubLString $str671$TEMP_MT_;
    private static final SubLObject $const672$isa;
    private static final SubLList $list673;
    private static final SubLObject $const674$UniversalVocabularyMt;
    private static final SubLObject $const675$genlMt;
    private static final SubLSymbol $sym676$VAR_ASSIGNMENT;
    private static final SubLList $list677;
    private static final SubLSymbol $sym678$JUSTIFICATION;
    private static final SubLSymbol $sym679$BINDINGS;
    private static final SubLSymbol $sym680$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS;
    private static final SubLSymbol $sym681$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE;
    private static final SubLSymbol $sym682$BINDINGS_P;
    private static final SubLList $list683;
    private static final SubLSymbol $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD;
    private static final SubLString $str685$__CYC_ASSIGNMENT__;
    private static final SubLSymbol $sym686$VAR_ASSIGNMENT_PRINT_METHOD;
    private static final SubLList $list687;
    private static final SubLSymbol $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD;
    private static final SubLSymbol $sym689$VAR_ASSIGNMENT_GET_CONTENT_METHOD;
    private static final SubLList $list690;
    private static final SubLSymbol $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD;
    private static final SubLSymbol $sym692$VAR_ASSIGNMENT_GET_SOURCE_METHOD;
    private static final SubLSymbol $sym693$WORDNET_QUERY;
    private static final SubLList $list694;
    private static final SubLSymbol $sym695$POS;
    private static final SubLSymbol $sym696$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS;
    private static final SubLSymbol $sym697$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE;
    private static final SubLSymbol $sym698$WORDNET_POS_P;
    private static final SubLList $list699;
    private static final SubLList $list700;
    private static final SubLSymbol $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD;
    private static final SubLSymbol $sym702$GLOSS;
    private static final SubLSymbol $sym703$SYNSETS;
    private static final SubLSymbol $sym704$WORDNET_QUERY_GET_METHOD;
    private static final SubLSymbol $sym705$WORDNET_GLOSS;
    private static final SubLList $list706;
    private static final SubLSymbol $sym707$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS;
    private static final SubLSymbol $sym708$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE;
    private static final SubLList $list709;
    private static final SubLSymbol $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD;
    private static final SubLSymbol $sym711$WORDNET_GLOSS_GET_CONTENT_METHOD;
    private static final SubLList $list712;
    private static final SubLString $str713$Wordnet_1_7_1;
    private static final SubLSymbol $sym714$WORDNET_GLOSS_GET_SOURCE_METHOD;
    private static final SubLObject $const715$Collection;
    private static final SubLObject $const716$TheList;
    private static final SubLObject $const717$disjointWith;
    private static final SubLInteger $int718$200000;
    private static final SubLInteger $int719$5000;
    private static final SubLSymbol $sym720$SECOND;
    private static final SubLSymbol $sym721$_;
    private static final SubLList $list722;
    private static final SubLSymbol $sym723$CLET;
    private static final SubLList $list724;
    private static final SubLSymbol $sym725$PROGN;
    private static final SubLSymbol $sym726$CSETF;
    private static final SubLList $list727;
    private static final SubLString $str728$_S__;
    private static final SubLSymbol $sym729$_;
    private static final SubLSymbol $sym730$THIRD;
    private static final SubLSymbol $sym731$FORT__;
    private static final SubLSymbol $kw732$LICENSE_USE;
    private static final SubLSymbol $kw733$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym734$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str735$http___www_google_com_search_q__A;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1566L)
    public static SubLObject subloop_reserved_initialize_information_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1566L)
    public static SubLObject subloop_reserved_initialize_information_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1566L)
    public static SubLObject information_p(final SubLObject information) {
        return classes.subloop_instanceof_class(information, (SubLObject)search_engine.$sym0$INFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1833L)
    public static SubLObject information_get_source_method(final SubLObject self) {
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
    public static SubLObject get_abstract_passage_vector(final SubLObject abstract_passage) {
        return classes.subloop_get_access_protected_instance_slot(abstract_passage, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym14$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
    public static SubLObject set_abstract_passage_vector(final SubLObject abstract_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(abstract_passage, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym14$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
    public static SubLObject subloop_reserved_initialize_abstract_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
    public static SubLObject subloop_reserved_initialize_abstract_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
    public static SubLObject abstract_passage_p(final SubLObject abstract_passage) {
        return classes.subloop_instanceof_class(abstract_passage, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 2609L)
    public static SubLObject abstract_passage_equal_method(final SubLObject self, final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search_engine.NIL != abstract_passage_p(v_object) && methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT).equalp(methods.funcall_instance_method_with_0_args(v_object, (SubLObject)search_engine.$sym19$GET_CONTENT)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 2862L)
    public static SubLObject abstract_passage_similarity_method(final SubLObject self, final SubLObject passage1, final SubLObject passage2) {
        assert search_engine.NIL != abstract_passage_p(passage1) : passage1;
        assert search_engine.NIL != abstract_passage_p(passage2) : passage2;
        if (search_engine.NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(passage1, (SubLObject)search_engine.$sym19$GET_CONTENT), methods.funcall_instance_method_with_0_args(passage2, (SubLObject)search_engine.$sym19$GET_CONTENT), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)) {
            return (SubLObject)search_engine.ONE_INTEGER;
        }
        return scenario.safe_svector_cosine_angle(methods.funcall_instance_method_with_0_args(passage1, (SubLObject)search_engine.$sym25$GET_VECTOR), methods.funcall_instance_method_with_0_args(passage2, (SubLObject)search_engine.$sym25$GET_VECTOR), (SubLObject)search_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 3417L)
    public static SubLObject abstract_passage_get_dates_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = (SubLObject)search_engine.NIL;
        SubLObject date = (SubLObject)search_engine.NIL;
        thread.resetMultipleValues();
        final SubLObject thisday = numeric_date_utilities.decode_universal_date(numeric_date_utilities.get_universal_date((SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED));
        final SubLObject thismonth = thread.secondMultipleValue();
        final SubLObject thisyear = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject pday = numeric_date_utilities.decode_universal_date(date_utilities.cycl_date_to_universal_date(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE)));
        final SubLObject pmonth = thread.secondMultipleValue();
        final SubLObject pyear = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = external_interfaces.resporator(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        SubLObject typeXstring = (SubLObject)search_engine.NIL;
        typeXstring = cdolist_list_var.first();
        while (search_engine.NIL != cdolist_list_var) {
            if (search_engine.NIL != subl_promotions.memberP(typeXstring.first(), (SubLObject)search_engine.$list30, (SubLObject)search_engine.EQL, (SubLObject)search_engine.UNPROVIDED)) {
                date = external_interfaces.parse_date(typeXstring.rest(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                if (search_engine.NIL != date) {
                    thread.resetMultipleValues();
                    final SubLObject second = numeric_date_utilities.decode_extended_universal_date(date);
                    final SubLObject minute = thread.secondMultipleValue();
                    final SubLObject hour = thread.thirdMultipleValue();
                    final SubLObject day = thread.fourthMultipleValue();
                    final SubLObject month = thread.fifthMultipleValue();
                    SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    if (year.numE(thisyear)) {
                        year = guess_year(pyear, pmonth, pday, month, day);
                    }
                    dates = (SubLObject)ConsesLow.cons(date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, year), dates);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        }
        return dates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 4501L)
    public static SubLObject abstract_passage_older_method(final SubLObject self, final SubLObject other_passage) {
        assert search_engine.NIL != abstract_passage_p(other_passage) : other_passage;
        final SubLObject self_date = methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE);
        final SubLObject other_date = methods.funcall_instance_method_with_0_args(other_passage, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE);
        if (search_engine.NIL == date_utilities.date_p(self_date) || search_engine.NIL == date_utilities.date_p(other_date)) {
            return (SubLObject)search_engine.NIL;
        }
        if (search_engine.NIL != date_utilities.dateL(self_date, other_date)) {
            return (SubLObject)search_engine.T;
        }
        final SubLObject self_doc_id = instances.get_slot(self, (SubLObject)search_engine.$sym35$DOC_ID);
        if (search_engine.NIL == self_doc_id) {
            return (SubLObject)search_engine.NIL;
        }
        if (!self_doc_id.equal(instances.get_slot(other_passage, (SubLObject)search_engine.$sym35$DOC_ID))) {
            return (SubLObject)search_engine.NIL;
        }
        final SubLObject self_sentence_num = instances.get_slot(self, (SubLObject)search_engine.$sym36$SENTENCE_NUMBER);
        final SubLObject other_sentence_num = instances.get_slot(other_passage, (SubLObject)search_engine.$sym36$SENTENCE_NUMBER);
        if (!self_sentence_num.isInteger() || !other_sentence_num.isInteger()) {
            return (SubLObject)search_engine.NIL;
        }
        return Numbers.numL(self_sentence_num, other_sentence_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 5444L)
    public static SubLObject guess_year(final SubLObject pub_year, final SubLObject pub_month, final SubLObject pub_day, final SubLObject month, final SubLObject day) {
        final SubLObject pub_date = date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, pub_day, pub_month, pub_year);
        final SubLObject next_year_date = date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, number_utilities.f_1X(pub_year));
        final SubLObject this_year_date = date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, pub_year);
        final SubLObject previous_year_date = date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, number_utilities.f_1_(pub_year));
        final SubLObject next_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, next_year_date, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED);
        final SubLObject this_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, this_year_date, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED);
        final SubLObject previous_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, previous_year_date, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED);
        final SubLObject min = Numbers.min(next_year_delta, new SubLObject[] { this_year_delta, previous_year_delta });
        if (min.numE(next_year_delta)) {
            return number_utilities.f_1X(pub_year);
        }
        if (min.numE(this_year_delta)) {
            return pub_year;
        }
        if (min.numE(previous_year_delta)) {
            return number_utilities.f_1_(pub_year);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6334L)
    public static SubLObject abstract_passage_get_publication_date_method(final SubLObject self) {
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6511L)
    public static SubLObject passage_equal(final SubLObject passage1, final SubLObject passage2) {
        return methods.funcall_instance_method_with_1_args(passage1, (SubLObject)search_engine.EQUAL, passage2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
    public static SubLObject get_simple_passage_text(final SubLObject simple_passage) {
        return classes.subloop_get_access_protected_instance_slot(simple_passage, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym42$TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
    public static SubLObject set_simple_passage_text(final SubLObject simple_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_passage, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym42$TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
    public static SubLObject subloop_reserved_initialize_simple_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
    public static SubLObject subloop_reserved_initialize_simple_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
    public static SubLObject simple_passage_p(final SubLObject simple_passage) {
        return classes.subloop_instanceof_class(simple_passage, (SubLObject)search_engine.$sym40$SIMPLE_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6822L)
    public static SubLObject new_simple_passage(final SubLObject text) {
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE);
        set_simple_passage_text(passage, text);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7068L)
    public static SubLObject simple_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_simple_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
            try {
                print_high.princ(text, stream);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_simple_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_simple_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7237L)
    public static SubLObject simple_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_simple_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, text);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_simple_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_simple_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject get_corpus_passage_text(final SubLObject corpus_passage) {
        return classes.subloop_get_access_protected_instance_slot(corpus_passage, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym42$TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject set_corpus_passage_text(final SubLObject corpus_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_passage, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym42$TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject get_corpus_passage_corpus(final SubLObject corpus_passage) {
        return classes.subloop_get_access_protected_instance_slot(corpus_passage, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym56$CORPUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject set_corpus_passage_corpus(final SubLObject corpus_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_passage, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym56$CORPUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject subloop_reserved_initialize_corpus_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject subloop_reserved_initialize_corpus_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
    public static SubLObject corpus_passage_p(final SubLObject corpus_passage) {
        return classes.subloop_instanceof_class(corpus_passage, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7846L)
    public static SubLObject corpus_passage_get_corpus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, corpus);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_corpus_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8001L)
    public static SubLObject abstract_passage_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_passage_method = (SubLObject)search_engine.NIL;
        SubLObject vector = get_abstract_passage_vector(self);
        try {
            thread.throwStack.push(search_engine.$sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD);
            try {
                if (search_engine.NIL == vector) {
                    vector = question.new_string_vector(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT));
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD, vector);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_passage_vector(self, vector);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8227L)
    public static SubLObject corpus_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, text);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_corpus_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8349L)
    public static SubLObject corpus_passage_identify_entities_method(final SubLObject self, final SubLObject lexicon, SubLObject types_to_identify) {
        if (types_to_identify == search_engine.UNPROVIDED) {
            types_to_identify = (SubLObject)search_engine.$list71;
        }
        assert search_engine.NIL != Types.listp(types_to_identify) : types_to_identify;
        assert search_engine.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : lexicon;
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)search_engine.$sym74$LEARN, methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT));
        final SubLObject tagger = pos_tagger.get_tagger();
        SubLObject entities = (SubLObject)search_engine.NIL;
        final SubLObject vector_var;
        final SubLObject sentences = vector_var = document.string_sentencify(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT), (SubLObject)search_engine.UNPROVIDED);
        final SubLObject backwardP_var = (SubLObject)search_engine.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject tagged;
        SubLObject lexified;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$1;
        SubLObject lex_entry;
        SubLObject denot;
        SubLObject pos_tags;
        SubLObject string;
        SubLObject cdolist_list_var_$2;
        SubLObject type;
        SubLObject entity;
        SubLObject item_var;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)search_engine.NIL, v_iteration = (SubLObject)search_engine.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)search_engine.ONE_INTEGER)) {
            element_num = ((search_engine.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)search_engine.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
            lexified = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)search_engine.$sym75$LEXIFY_SENTENCE, tagged);
            cdolist_list_var = document.sentence_yield_exhaustive(lexified);
            word = (SubLObject)search_engine.NIL;
            word = cdolist_list_var.first();
            while (search_engine.NIL != cdolist_list_var) {
                cdolist_list_var_$1 = document.word_info(word);
                lex_entry = (SubLObject)search_engine.NIL;
                lex_entry = cdolist_list_var_$1.first();
                while (search_engine.NIL != cdolist_list_var_$1) {
                    denot = ((search_engine.NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) ? semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex_entry, (SubLObject)search_engine.UNPROVIDED) : methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$kw77$DENOT));
                    pos_tags = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$kw78$PENN_TAGS);
                    string = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$kw79$STRING);
                    if (Sequences.length(string).numG((SubLObject)search_engine.ONE_INTEGER) && search_engine.NIL != conses_high.intersection(pos_tags, (SubLObject)search_engine.$list80, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)) {
                        cdolist_list_var_$2 = types_to_identify;
                        type = (SubLObject)search_engine.NIL;
                        type = cdolist_list_var_$2.first();
                        while (search_engine.NIL != cdolist_list_var_$2) {
                            if (search_engine.NIL != at_utilities.more_specific_p(denot, type, (SubLObject)search_engine.UNPROVIDED)) {
                                if (search_engine.NIL == kb_accessors.individualP(denot)) {
                                    denot = el_utilities.make_el_formula(search_engine.$const81$InstanceNamedFn, (SubLObject)ConsesLow.list(string, denot), (SubLObject)search_engine.UNPROVIDED);
                                }
                                entity = focus_entity.new_textual_focus_entity(string, denot, (SubLObject)search_engine.UNPROVIDED);
                                methods.funcall_instance_method_with_1_args(entity, (SubLObject)search_engine.$sym82$ADD_PASSAGE, self);
                                item_var = entity;
                                if (search_engine.NIL == conses_high.member(item_var, entities, (SubLObject)search_engine.EQUALP, Symbols.symbol_function((SubLObject)search_engine.IDENTITY))) {
                                    entities = (SubLObject)ConsesLow.cons(item_var, entities);
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            type = cdolist_list_var_$2.first();
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    lex_entry = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        return entities;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 9763L)
    public static SubLObject corpus_passage_max_instances_method(final SubLObject self, final SubLObject passages) {
        assert search_engine.NIL != Types.listp(passages) : passages;
        SubLObject max_score = (SubLObject)search_engine.ZERO_INTEGER;
        SubLObject max_passages = (SubLObject)search_engine.NIL;
        SubLObject cdolist_list_var = passages;
        SubLObject passage = (SubLObject)search_engine.NIL;
        passage = cdolist_list_var.first();
        while (search_engine.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(passage, (SubLObject)search_engine.$sym87$GET_SCORE).numG(max_score)) {
                max_score = methods.funcall_instance_method_with_0_args(passage, (SubLObject)search_engine.$sym87$GET_SCORE);
            }
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        }
        cdolist_list_var = passages;
        passage = (SubLObject)search_engine.NIL;
        passage = cdolist_list_var.first();
        while (search_engine.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(passage, (SubLObject)search_engine.$sym87$GET_SCORE).numE(max_score)) {
                max_passages = (SubLObject)ConsesLow.cons(passage, max_passages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        }
        return max_passages;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 10364L)
    public static SubLObject corpus_passage_get_parse_trees_method(final SubLObject self) {
        final SubLObject v_document = document.new_document(streams_high.make_string_input_stream(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym19$GET_CONTENT), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        SubLObject trees = (SubLObject)search_engine.NIL;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)search_engine.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$3;
        SubLObject backwardP_var_$4;
        SubLObject length_$5;
        SubLObject v_iteration_$6;
        SubLObject element_num_$7;
        SubLObject sentence;
        SubLObject sent_string;
        SubLObject v_parse_tree;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)search_engine.NIL, v_iteration = (SubLObject)search_engine.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)search_engine.ONE_INTEGER)) {
            element_num = ((search_engine.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)search_engine.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$3 = document.paragraph_sentences(paragraph);
            backwardP_var_$4 = (SubLObject)search_engine.NIL;
            for (length_$5 = Sequences.length(vector_var_$3), v_iteration_$6 = (SubLObject)search_engine.NIL, v_iteration_$6 = (SubLObject)search_engine.ZERO_INTEGER; v_iteration_$6.numL(length_$5); v_iteration_$6 = Numbers.add(v_iteration_$6, (SubLObject)search_engine.ONE_INTEGER)) {
                element_num_$7 = ((search_engine.NIL != backwardP_var_$4) ? Numbers.subtract(length_$5, v_iteration_$6, (SubLObject)search_engine.ONE_INTEGER) : v_iteration_$6);
                sentence = Vectors.aref(vector_var_$3, element_num_$7);
                sent_string = document.sentence_string(sentence);
                v_parse_tree = (SubLObject)search_engine.NIL;
                if (search_engine.NIL != sent_string) {
                    v_parse_tree = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args((SubLObject)search_engine.$sym91$CHARNIAK_PARSER, (SubLObject)search_engine.$sym92$GET_PARSER), (SubLObject)search_engine.$sym93$PARSE, sent_string);
                    if (search_engine.NIL != v_parse_tree) {
                        trees = (SubLObject)ConsesLow.cons(v_parse_tree, trees);
                    }
                }
            }
        }
        return trees;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject get_information_request_timeout(final SubLObject information_request) {
        return classes.subloop_get_access_protected_instance_slot(information_request, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym97$TIMEOUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject set_information_request_timeout(final SubLObject information_request, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_request, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym97$TIMEOUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject get_information_request_error_handling(final SubLObject information_request) {
        return classes.subloop_get_access_protected_instance_slot(information_request, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym98$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject set_information_request_error_handling(final SubLObject information_request, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_request, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym98$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject subloop_reserved_initialize_information_request_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject subloop_reserved_initialize_information_request_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
    public static SubLObject information_request_p(final SubLObject information_request) {
        return classes.subloop_instanceof_class(information_request, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11459L)
    public static SubLObject information_request_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_request_method = (SubLObject)search_engine.NIL;
        SubLObject timeout = get_information_request_timeout(self);
        SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push(search_engine.$sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = (SubLObject)search_engine.$kw104$WARN;
                timeout = (SubLObject)search_engine.$int105$720;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_information_request_timeout(self, timeout);
                    set_information_request_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_information_request_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_request_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
    public static SubLObject get_knowledge_source_query_query(final SubLObject knowledge_source_query) {
        return classes.subloop_get_access_protected_instance_slot(knowledge_source_query, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym109$QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
    public static SubLObject set_knowledge_source_query_query(final SubLObject knowledge_source_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(knowledge_source_query, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym109$QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
    public static SubLObject subloop_reserved_initialize_knowledge_source_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
    public static SubLObject subloop_reserved_initialize_knowledge_source_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
    public static SubLObject knowledge_source_query_p(final SubLObject knowledge_source_query) {
        return classes.subloop_instanceof_class(knowledge_source_query, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11961L)
    public static SubLObject knowledge_source_query_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = (SubLObject)search_engine.NIL;
        final SubLObject timeout = get_information_request_timeout(self);
        try {
            thread.throwStack.push(search_engine.$sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                SubLObject answers = (SubLObject)search_engine.NIL;
                SubLObject error = (SubLObject)search_engine.NIL;
                SubLObject timedoutP = (SubLObject)search_engine.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)search_engine.$sym115$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$8 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)search_engine.T, thread);
                                    SubLObject timer = (SubLObject)search_engine.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)search_engine.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                            answers = methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym76$GET);
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                timedoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (search_engine.NIL != timedoutP) {
                                Errors.error((SubLObject)search_engine.$str116$Query_execution_timeout_after__a_, timeout);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (search_engine.NIL != error) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym117$HANDLE_ERROR, error);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_information_request_timeout(self, timeout);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var3, (SubLObject)search_engine.$sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12402L)
    public static SubLObject knowledge_source_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = (SubLObject)search_engine.NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                streams_high.write_string((SubLObject)search_engine.$str121$__QUERY__, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                print_high.prin1(query, stream);
                streams_high.write_string((SubLObject)search_engine.$str122$_, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12679L)
    public static SubLObject knowledge_source_query_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = (SubLObject)search_engine.NIL;
        final SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push(search_engine.$sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql((SubLObject)search_engine.$kw127$THROW)) {
                    Errors.error(error);
                }
                else if (pcase_var.eql((SubLObject)search_engine.$kw104$WARN)) {
                    Errors.warn(error);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_information_request_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
    public static SubLObject get_corpus_query_corpus(final SubLObject corpus_query) {
        return classes.subloop_get_access_protected_instance_slot(corpus_query, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym56$CORPUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
    public static SubLObject set_corpus_query_corpus(final SubLObject corpus_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_query, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym56$CORPUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
    public static SubLObject subloop_reserved_initialize_corpus_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
    public static SubLObject subloop_reserved_initialize_corpus_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
    public static SubLObject corpus_query_p(final SubLObject corpus_query) {
        return classes.subloop_instanceof_class(corpus_query, (SubLObject)search_engine.$sym130$CORPUS_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13269L)
    public static SubLObject corpus_query_get_corpus_path_mapping_method(final SubLObject self) {
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13499L)
    public static SubLObject corpus_query_get_corpus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = (SubLObject)search_engine.NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, corpus);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13620L)
    public static SubLObject corpus_query_get_corpus_path_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = (SubLObject)search_engine.NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, conses_high.assoc(corpus, methods.funcall_class_method_with_0_args(self, (SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING), (SubLObject)search_engine.EQUALP, (SubLObject)search_engine.UNPROVIDED).rest());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13843L)
    public static SubLObject corpus_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = (SubLObject)search_engine.NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                streams_high.write_string((SubLObject)search_engine.$str146$__QUERY_, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                print_high.princ(corpus, stream);
                streams_high.write_string((SubLObject)search_engine.$str147$___, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                print_high.prin1(query, stream);
                streams_high.write_string((SubLObject)search_engine.$str122$_, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
    public static SubLObject subloop_reserved_initialize_glimpse_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
    public static SubLObject subloop_reserved_initialize_glimpse_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
    public static SubLObject glimpse_query_p(final SubLObject glimpse_query) {
        return classes.subloop_instanceof_class(glimpse_query, (SubLObject)search_engine.$sym149$GLIMPSE_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14314L)
    public static SubLObject new_glimpse_query(final SubLObject string, SubLObject corpus) {
        if (corpus == search_engine.UNPROVIDED) {
            corpus = search_engine.$default_corpus$.getDynamicValue();
        }
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym149$GLIMPSE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        if (search_engine.NIL == methods.funcall_instance_method_with_0_args(query, (SubLObject)search_engine.$sym140$GET_CORPUS_PATH)) {
            Errors.error((SubLObject)search_engine.$str153$Non_supported_corpus__a, corpus);
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14711L)
    public static SubLObject glimpse_query_get_corpus_path_mapping_method(final SubLObject self) {
        return (SubLObject)search_engine.$list155;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 15193L)
    public static SubLObject glimpse_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_query_method = (SubLObject)search_engine.NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD);
            try {
                SubLObject passages = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = ask_glimpse(query, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)search_engine.$str160$index, methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym140$GET_CORPUS_PATH)), (SubLObject)search_engine.$list161), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                SubLObject v_answer = (SubLObject)search_engine.NIL;
                v_answer = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    final SubLObject current;
                    final SubLObject datum = current = v_answer;
                    final SubLObject file_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw162$FILE, current);
                    final SubLObject file = (SubLObject)((search_engine.NIL != file_tail) ? conses_high.cadr(file_tail) : search_engine.NIL);
                    final SubLObject article_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw163$ARTICLE, current);
                    final SubLObject article = (SubLObject)((search_engine.NIL != article_tail) ? conses_high.cadr(article_tail) : search_engine.NIL);
                    final SubLObject line_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw164$LINE, current);
                    final SubLObject line = (SubLObject)((search_engine.NIL != line_tail) ? conses_high.cadr(line_tail) : search_engine.NIL);
                    final SubLObject text_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw165$TEXT, current);
                    final SubLObject text = (SubLObject)((search_engine.NIL != text_tail) ? conses_high.cadr(text_tail) : search_engine.NIL);
                    passages = (SubLObject)ConsesLow.cons(new_glimpse_passage(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym59$GET_CORPUS), file, article, line, text), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD, Sequences.remove_duplicates(passages, Symbols.symbol_function((SubLObject)search_engine.$sym166$PASSAGE_EQUAL), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_glimpse_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 15738L)
    public static SubLObject ask_glimpse(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == search_engine.UNPROVIDED) {
            options = (SubLObject)search_engine.NIL;
        }
        if (path == search_engine.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)search_engine.$str168$_glimpse_cgi);
        }
        if (host == search_engine.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == search_engine.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == search_engine.UNPROVIDED) {
            method = (SubLObject)search_engine.$kw169$POST;
        }
        return reader.read_from_string(web_utilities.http_retrieve(reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)search_engine.$str170$query, query), ConsesLow.append(options, (SubLObject)search_engine.NIL)), path, host, port, method, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject get_glimpse_passage_line(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym173$LINE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject set_glimpse_passage_line(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym173$LINE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject get_glimpse_passage_article(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym174$ARTICLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject set_glimpse_passage_article(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym174$ARTICLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject get_glimpse_passage_file(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym175$FILE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject set_glimpse_passage_file(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym175$FILE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject subloop_reserved_initialize_glimpse_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject subloop_reserved_initialize_glimpse_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym175$FILE, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym174$ARTICLE, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym173$LINE, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
    public static SubLObject glimpse_passage_p(final SubLObject glimpse_passage) {
        return classes.subloop_instanceof_class(glimpse_passage, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16349L)
    public static SubLObject new_glimpse_passage(final SubLObject corpus, final SubLObject file, final SubLObject article, final SubLObject line, final SubLObject text) {
        assert search_engine.NIL != Types.stringp(corpus) : corpus;
        assert search_engine.NIL != Types.stringp(file) : file;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(line) : line;
        assert search_engine.NIL != Strings.string(text) : text;
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE);
        set_corpus_passage_corpus(passage, corpus);
        set_glimpse_passage_file(passage, file);
        set_glimpse_passage_article(passage, article);
        set_glimpse_passage_line(passage, line);
        set_corpus_passage_text(passage, text);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16925L)
    public static SubLObject glimpse_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                print_high.princ(glimpse_passage_get_source_method(self), stream);
                streams_high.terpri(stream);
                if (search_engine.NIL != text) {
                    print_high.princ(text, stream);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17173L)
    public static SubLObject glimpse_passage_get_publication_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject file = get_glimpse_passage_file(self);
        try {
            thread.throwStack.push(search_engine.$sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                if (Sequences.length(file).numG((SubLObject)search_engine.EIGHT_INTEGER)) {
                    final SubLObject year = reader.read_from_string(string_utilities.substring(file, (SubLObject)search_engine.ZERO_INTEGER, (SubLObject)search_engine.FOUR_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    final SubLObject month = reader.read_from_string(string_utilities.substring(file, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.SIX_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    final SubLObject day = reader.read_from_string(string_utilities.substring(file, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.EIGHT_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, year));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_glimpse_passage_file(self, file);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17598L)
    public static SubLObject glimpse_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject line = get_glimpse_passage_line(self);
        final SubLObject article = get_glimpse_passage_article(self);
        final SubLObject file = get_glimpse_passage_file(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, PrintLow.format((SubLObject)search_engine.NIL, (SubLObject)search_engine.$str189$__Corpus___a___File___a___Article, new SubLObject[] { corpus, file, article, line }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_glimpse_passage_line(self, line);
                    set_glimpse_passage_article(self, article);
                    set_glimpse_passage_file(self, file);
                    set_corpus_passage_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
    public static SubLObject subloop_reserved_initialize_guruqa_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
    public static SubLObject subloop_reserved_initialize_guruqa_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
    public static SubLObject guruqa_query_p(final SubLObject guruqa_query) {
        return classes.subloop_instanceof_class(guruqa_query, (SubLObject)search_engine.$sym191$GURUQA_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17958L)
    public static SubLObject new_guruqa_query(final SubLObject string, SubLObject corpus) {
        if (corpus == search_engine.UNPROVIDED) {
            corpus = search_engine.$default_corpus$.getDynamicValue();
        }
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym191$GURUQA_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18261L)
    public static SubLObject guruqa_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_query_method = (SubLObject)search_engine.NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        final SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push(search_engine.$sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD);
            try {
                final SubLObject indices = external_interfaces.guruqa_answer_indexes(query, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                SubLObject passages = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var = indices;
                SubLObject index = (SubLObject)search_engine.NIL;
                index = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    passages = (SubLObject)ConsesLow.cons(new_guruqa_passage(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym59$GET_CORPUS), conses_high.getf(index, (SubLObject)search_engine.$kw196$DOC, (SubLObject)search_engine.UNPROVIDED), conses_high.getf(index, (SubLObject)search_engine.$kw197$SENT, (SubLObject)search_engine.UNPROVIDED), conses_high.getf(index, (SubLObject)search_engine.$kw198$LEN, (SubLObject)search_engine.UNPROVIDED), instances.get_slot(self, (SubLObject)search_engine.$sym98$ERROR_HANDLING)), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    index = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD, Sequences.nreverse(passages));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    set_information_request_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_guruqa_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject get_guruqa_passage_error_handling(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym98$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject set_guruqa_passage_error_handling(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym98$ERROR_HANDLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject get_guruqa_passage_span(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym202$SPAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject set_guruqa_passage_span(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym202$SPAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject get_guruqa_passage_sentence_id(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym203$SENTENCE_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject set_guruqa_passage_sentence_id(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym203$SENTENCE_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject get_guruqa_passage_document_id(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym204$DOCUMENT_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject set_guruqa_passage_document_id(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym204$DOCUMENT_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject subloop_reserved_initialize_guruqa_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject subloop_reserved_initialize_guruqa_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym204$DOCUMENT_ID, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym203$SENTENCE_ID, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym202$SPAN, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
    public static SubLObject guruqa_passage_p(final SubLObject guruqa_passage) {
        return classes.subloop_instanceof_class(guruqa_passage, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 19104L)
    public static SubLObject new_guruqa_passage(final SubLObject corpus, final SubLObject v_document, final SubLObject sentence, SubLObject span, SubLObject error_handling) {
        if (span == search_engine.UNPROVIDED) {
            span = (SubLObject)search_engine.ZERO_INTEGER;
        }
        if (error_handling == search_engine.UNPROVIDED) {
            error_handling = (SubLObject)search_engine.$kw127$THROW;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert search_engine.NIL != Types.stringp(corpus) : corpus;
        assert search_engine.NIL != Types.integerp(v_document) : v_document;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(sentence) : sentence;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(span) : span;
        if (search_engine.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && search_engine.NIL == conses_high.member(error_handling, (SubLObject)search_engine.$list208, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)) {
            Errors.error((SubLObject)search_engine.$str209$Invalid_error_handling_tag);
        }
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym200$GURUQA_PASSAGE);
        set_corpus_passage_corpus(passage, corpus);
        set_guruqa_passage_document_id(passage, v_document);
        set_guruqa_passage_sentence_id(passage, sentence);
        set_guruqa_passage_span(passage, span);
        set_guruqa_passage_error_handling(passage, error_handling);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20025L)
    public static SubLObject guruqa_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                print_high.princ(guruqa_passage_get_source_method(self), stream);
                streams_high.terpri(stream);
                if (search_engine.NIL != text) {
                    print_high.princ(text, stream);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20269L)
    public static SubLObject guruqa_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject span = get_guruqa_passage_span(self);
        final SubLObject sentence_id = get_guruqa_passage_sentence_id(self);
        final SubLObject document_id = get_guruqa_passage_document_id(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, PrintLow.format((SubLObject)search_engine.NIL, (SubLObject)search_engine.$str215$Corpus___a__Document___a__Sentenc, new SubLObject[] { corpus, document_id, sentence_id, span }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_guruqa_passage_span(self, span);
                    set_guruqa_passage_sentence_id(self, sentence_id);
                    set_guruqa_passage_document_id(self, document_id);
                    set_corpus_passage_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20498L)
    public static SubLObject guruqa_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject span = get_guruqa_passage_span(self);
        final SubLObject sentence_id = get_guruqa_passage_sentence_id(self);
        final SubLObject document_id = get_guruqa_passage_document_id(self);
        SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                if (search_engine.NIL == text) {
                    SubLObject error = (SubLObject)search_engine.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)search_engine.$sym115$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                text = external_interfaces.guruqa_retrieve_passage(document_id, sentence_id, span, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
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
                    if (search_engine.NIL != error) {
                        guruqa_passage_handle_error_method(self, error);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, text);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_guruqa_passage_span(self, span);
                    set_guruqa_passage_sentence_id(self, sentence_id);
                    set_guruqa_passage_document_id(self, document_id);
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var2, (SubLObject)search_engine.$sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20809L)
    public static SubLObject guruqa_passage_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject error_handling = get_guruqa_passage_error_handling(self);
        try {
            thread.throwStack.push(search_engine.$sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql((SubLObject)search_engine.$kw127$THROW)) {
                    Errors.error(error);
                }
                else if (pcase_var.eql((SubLObject)search_engine.$kw104$WARN)) {
                    Errors.warn(error);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_guruqa_passage_error_handling(self, error_handling);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject get_lemur_query_sentno(final SubLObject lemur_query) {
        return classes.subloop_get_access_protected_instance_slot(lemur_query, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym224$SENTNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject set_lemur_query_sentno(final SubLObject lemur_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_query, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym224$SENTNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject get_lemur_query_docno(final SubLObject lemur_query) {
        return classes.subloop_get_access_protected_instance_slot(lemur_query, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject set_lemur_query_docno(final SubLObject lemur_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_query, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject subloop_reserved_initialize_lemur_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject subloop_reserved_initialize_lemur_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym225$DOCNO, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym224$SENTNO, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
    public static SubLObject lemur_query_p(final SubLObject lemur_query) {
        return classes.subloop_instanceof_class(lemur_query, (SubLObject)search_engine.$sym222$LEMUR_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 21227L)
    public static SubLObject new_lemur_query(final SubLObject string, SubLObject corpus, SubLObject docno, SubLObject sentno) {
        if (corpus == search_engine.UNPROVIDED) {
            corpus = search_engine.$default_corpus$.getDynamicValue();
        }
        if (docno == search_engine.UNPROVIDED) {
            docno = (SubLObject)search_engine.$int228$50;
        }
        if (sentno == search_engine.UNPROVIDED) {
            sentno = (SubLObject)search_engine.$int228$50;
        }
        assert search_engine.NIL != Types.stringp(string) : string;
        assert search_engine.NIL != subl_promotions.positive_integer_p(docno) : docno;
        assert search_engine.NIL != subl_promotions.positive_integer_p(sentno) : sentno;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym222$LEMUR_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        set_lemur_query_docno(query, docno);
        set_lemur_query_sentno(query, sentno);
        if (search_engine.NIL == methods.funcall_instance_method_with_0_args(query, (SubLObject)search_engine.$sym140$GET_CORPUS_PATH)) {
            Errors.error((SubLObject)search_engine.$str153$Non_supported_corpus__a, corpus);
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 21892L)
    public static SubLObject lemur_query_get_corpus_path_mapping_method(final SubLObject self) {
        return (SubLObject)search_engine.$list231;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 22588L)
    public static SubLObject lemur_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_query_method = (SubLObject)search_engine.NIL;
        final SubLObject sentno = get_lemur_query_sentno(self);
        final SubLObject docno = get_lemur_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD);
            try {
                SubLObject passages = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = ask_lemur(query, docno, sentno, (SubLObject)search_engine.ONE_INTEGER, methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym140$GET_CORPUS_PATH), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                SubLObject v_answer = (SubLObject)search_engine.NIL;
                v_answer = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = v_answer;
                    SubLObject id = (SubLObject)search_engine.NIL;
                    SubLObject score = (SubLObject)search_engine.NIL;
                    SubLObject text = (SubLObject)search_engine.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search_engine.$list235);
                    id = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search_engine.$list235);
                    score = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search_engine.$list235);
                    text = current.first();
                    current = current.rest();
                    if (search_engine.NIL == current) {
                        passages = (SubLObject)ConsesLow.cons(new_lemur_passage(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym59$GET_CORPUS), id, score, strip_passage_header(text)), passages);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)search_engine.$list235);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD, Sequences.nreverse(Sequences.remove_duplicates(passages, Symbols.symbol_function((SubLObject)search_engine.$sym166$PASSAGE_EQUAL), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lemur_query_sentno(self, sentno);
                    set_lemur_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lemur_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23080L)
    public static SubLObject ask_lemur(final SubLObject query, SubLObject doc_num, SubLObject sent_num, SubLObject l, SubLObject param_file, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options) {
        if (doc_num == search_engine.UNPROVIDED) {
            doc_num = (SubLObject)search_engine.TEN_INTEGER;
        }
        if (sent_num == search_engine.UNPROVIDED) {
            sent_num = (SubLObject)search_engine.TEN_INTEGER;
        }
        if (l == search_engine.UNPROVIDED) {
            l = (SubLObject)search_engine.ONE_INTEGER;
        }
        if (param_file == search_engine.UNPROVIDED) {
            param_file = (SubLObject)search_engine.$str237$_cyc_projects_aquaint_lemur_indic;
        }
        if (path == search_engine.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)search_engine.$str238$_lemur_cgi);
        }
        if (host == search_engine.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == search_engine.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == search_engine.UNPROVIDED) {
            method = (SubLObject)search_engine.$kw169$POST;
        }
        if (options == search_engine.UNPROVIDED) {
            options = (SubLObject)search_engine.NIL;
        }
        return reader.read_from_string(web_utilities.http_retrieve((SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)search_engine.$str170$query, query), (SubLObject)ConsesLow.list((SubLObject)search_engine.$str239$n, sent_num), (SubLObject)ConsesLow.list((SubLObject)search_engine.$str240$N, doc_num), (SubLObject)ConsesLow.list((SubLObject)search_engine.$str241$l, l), (SubLObject)ConsesLow.list((SubLObject)search_engine.$str242$p, param_file), ConsesLow.append(options, (SubLObject)search_engine.NIL)), path, host, port, method, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject get_lemur_passage_score(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym245$SCORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject set_lemur_passage_score(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym245$SCORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject get_lemur_passage_sentence_number(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym36$SENTENCE_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject set_lemur_passage_sentence_number(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym36$SENTENCE_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject get_lemur_passage_doc_id(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym35$DOC_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject set_lemur_passage_doc_id(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym35$DOC_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject subloop_reserved_initialize_lemur_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject subloop_reserved_initialize_lemur_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym35$DOC_ID, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym36$SENTENCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym245$SCORE, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
    public static SubLObject lemur_passage_p(final SubLObject lemur_passage) {
        return classes.subloop_instanceof_class(lemur_passage, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23936L)
    public static SubLObject new_lemur_passage(final SubLObject corpus, final SubLObject id_string, final SubLObject score, final SubLObject text) {
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym243$LEMUR_PASSAGE);
        final SubLObject split = string_utilities.split_string(id_string, (SubLObject)search_engine.$list248);
        final SubLObject doc_id = string_utilities.bunge(conses_high.butlast(split, (SubLObject)search_engine.UNPROVIDED), (SubLObject)Characters.CHAR_period);
        final SubLObject sentence_number = reader.parse_integer(conses_high.last(split, (SubLObject)search_engine.UNPROVIDED).first(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        set_corpus_passage_corpus(passage, corpus);
        set_corpus_passage_text(passage, text);
        set_lemur_passage_doc_id(passage, doc_id);
        set_lemur_passage_sentence_number(passage, sentence_number);
        set_lemur_passage_score(passage, score);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24530L)
    public static SubLObject lemur_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                print_high.princ(lemur_passage_get_source_method(self), stream);
                streams_high.terpri(stream);
                print_high.princ(text, stream);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24758L)
    public static SubLObject lemur_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject score = get_lemur_passage_score(self);
        final SubLObject sentence_number = get_lemur_passage_sentence_number(self);
        final SubLObject doc_id = get_lemur_passage_doc_id(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push(search_engine.$sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, PrintLow.format((SubLObject)search_engine.NIL, (SubLObject)search_engine.$str254$__Corpus___a__Source___a__Sentenc, new SubLObject[] { corpus, doc_id, sentence_number, score }));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lemur_passage_score(self, score);
                    set_lemur_passage_sentence_number(self, sentence_number);
                    set_lemur_passage_doc_id(self, doc_id);
                    set_corpus_passage_corpus(self, corpus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24985L)
    public static SubLObject lemur_passage_get_publication_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject doc_id = get_lemur_passage_doc_id(self);
        try {
            thread.throwStack.push(search_engine.$sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                if (Sequences.length(doc_id).numG((SubLObject)search_engine.ELEVEN_INTEGER)) {
                    final SubLObject year = reader.read_from_string(string_utilities.substring(doc_id, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.SEVEN_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    final SubLObject month = reader.read_from_string(string_utilities.substring(doc_id, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.NINE_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    final SubLObject day = reader.read_from_string(string_utilities.substring(doc_id, (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.ELEVEN_INTEGER), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date((SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, day, month, year));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lemur_passage_doc_id(self, doc_id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25418L)
    public static SubLObject lemur_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject score = get_lemur_passage_score(self);
        try {
            thread.throwStack.push(search_engine.$sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, score);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lemur_passage_score(self, score);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
    public static SubLObject get_qaga_query_augmentation_terms(final SubLObject qaga_query) {
        return classes.subloop_get_access_protected_instance_slot(qaga_query, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym264$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
    public static SubLObject set_qaga_query_augmentation_terms(final SubLObject qaga_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qaga_query, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym264$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
    public static SubLObject subloop_reserved_initialize_qaga_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
    public static SubLObject subloop_reserved_initialize_qaga_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym264$AUGMENTATION_TERMS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
    public static SubLObject qaga_query_p(final SubLObject qaga_query) {
        return classes.subloop_instanceof_class(qaga_query, (SubLObject)search_engine.$sym262$QAGA_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25785L)
    public static SubLObject new_qaga_query(final SubLObject string, SubLObject corpus) {
        if (corpus == search_engine.UNPROVIDED) {
            corpus = search_engine.$default_corpus$.getDynamicValue();
        }
        assert search_engine.NIL != Types.stringp(string) : string;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym262$QAGA_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 26233L)
    public static SubLObject qaga_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_qaga_query_method = (SubLObject)search_engine.NIL;
        SubLObject augmentation_terms = get_qaga_query_augmentation_terms(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
            try {
                SubLObject passages = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = external_interfaces.ask_qaga(string_utilities.split_string(query, (SubLObject)search_engine.UNPROVIDED), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                SubLObject v_answer = (SubLObject)search_engine.NIL;
                v_answer = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    final SubLObject current;
                    final SubLObject datum = current = v_answer;
                    final SubLObject text_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw165$TEXT, current);
                    final SubLObject text = (SubLObject)((search_engine.NIL != text_tail) ? conses_high.cadr(text_tail) : search_engine.NIL);
                    final SubLObject docid_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw269$DOCID, current);
                    final SubLObject docid = (SubLObject)((search_engine.NIL != docid_tail) ? conses_high.cadr(docid_tail) : search_engine.NIL);
                    final SubLObject score_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw270$SCORE, current);
                    final SubLObject score = (SubLObject)((search_engine.NIL != score_tail) ? conses_high.cadr(score_tail) : search_engine.NIL);
                    final SubLObject augment_tail = cdestructuring_bind.property_list_member((SubLObject)search_engine.$kw271$AUGMENT, current);
                    final SubLObject augment = augmentation_terms = (SubLObject)((search_engine.NIL != augment_tail) ? conses_high.cadr(augment_tail) : search_engine.NIL);
                    passages = (SubLObject)ConsesLow.cons(new_lemur_passage(methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym59$GET_CORPUS), docid, score, text), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, Sequences.nreverse(Sequences.remove_duplicates(passages, Symbols.symbol_function((SubLObject)search_engine.$sym166$PASSAGE_EQUAL), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_qaga_query_augmentation_terms(self, augmentation_terms);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_qaga_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_qaga_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 26651L)
    public static SubLObject qaga_query_get_augmentation_terms_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_qaga_query_method = (SubLObject)search_engine.NIL;
        final SubLObject augmentation_terms = get_qaga_query_augmentation_terms(self);
        try {
            thread.throwStack.push(search_engine.$sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, augmentation_terms);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_qaga_query_augmentation_terms(self, augmentation_terms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_qaga_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_qaga_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject get_google_query_google_key(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym280$GOOGLE_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject set_google_query_google_key(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym280$GOOGLE_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject get_google_query_start(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym281$START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject set_google_query_start(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym281$START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject get_google_query_docno(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject set_google_query_docno(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject subloop_reserved_initialize_google_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject subloop_reserved_initialize_google_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym225$DOCNO, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym281$START, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym280$GOOGLE_KEY, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
    public static SubLObject google_query_p(final SubLObject google_query) {
        return classes.subloop_instanceof_class(google_query, (SubLObject)search_engine.$sym278$GOOGLE_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27378L)
    public static SubLObject new_google_query(final SubLObject string, final SubLObject google_key, SubLObject docno, SubLObject sentno, SubLObject start) {
        if (docno == search_engine.UNPROVIDED) {
            docno = (SubLObject)search_engine.$int228$50;
        }
        if (sentno == search_engine.UNPROVIDED) {
            sentno = (SubLObject)search_engine.$int228$50;
        }
        if (start == search_engine.UNPROVIDED) {
            start = (SubLObject)search_engine.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert search_engine.NIL != Types.stringp(string) : string;
        assert search_engine.NIL != Types.stringp(google_key) : google_key;
        assert search_engine.NIL != subl_promotions.positive_integer_p(docno) : docno;
        assert search_engine.NIL != subl_promotions.positive_integer_p(start) : start;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym278$GOOGLE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, search_engine.$world_wide_web_corpus$.getDynamicValue(thread));
        set_google_query_docno(query, docno);
        set_google_query_start(query, start);
        set_google_query_google_key(query, google_key);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28319L)
    public static SubLObject google_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = (SubLObject)search_engine.NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject start = get_google_query_start(self);
        final SubLObject docno = get_google_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_3_args(get_google_client(google_key), (SubLObject)search_engine.$sym286$SEARCH, query, start, docno));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_google_query_start(self, start);
                    set_google_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28514L)
    public static SubLObject google_query_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = (SubLObject)search_engine.NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args(get_google_client(google_key), (SubLObject)search_engine.$sym288$COUNT, query));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28679L)
    public static SubLObject google_query_quit_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = (SubLObject)search_engine.NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        try {
            thread.throwStack.push(search_engine.$sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(get_google_client(google_key), (SubLObject)search_engine.$sym292$QUIT);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, (SubLObject)search_engine.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28848L)
    public static SubLObject google_query_spelling_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = (SubLObject)search_engine.NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args(get_google_client(google_key), (SubLObject)search_engine.$sym296$SPELLING, query));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29027L)
    public static SubLObject google_query_version_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = (SubLObject)search_engine.NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        try {
            thread.throwStack.push(search_engine.$sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_0_args(get_google_client(google_key), (SubLObject)search_engine.$sym300$VERSION));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29885L)
    public static SubLObject get_google_key() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search_engine.NIL == Filesys.probe_file(search_engine.$google_client_key_file$.getDynamicValue(thread))) {
            return (SubLObject)search_engine.NIL;
        }
        final SubLObject google_key_file = StreamsLow.open(search_engine.$google_client_key_file$.getDynamicValue(thread), new SubLObject[] { search_engine.$kw314$DIRECTION, search_engine.$kw315$INPUT, search_engine.$kw316$IF_DOES_NOT_EXIST, search_engine.$kw317$ERROR });
        final SubLObject google_key = streams_high.read_line(google_key_file, (SubLObject)search_engine.NIL, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        streams_high.close(google_key_file, (SubLObject)search_engine.UNPROVIDED);
        return google_key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30185L)
    public static SubLObject seed_google_client(final SubLObject key, final SubLObject machine, final SubLObject port) {
        assert search_engine.NIL != Types.stringp(key) : key;
        assert search_engine.NIL != Types.stringp(machine) : machine;
        assert search_engine.NIL != subl_promotions.positive_integer_p(port) : port;
        search_engine.$authorized_google_key$.setDynamicValue(key);
        search_engine.$google_client_host$.setDynamicValue(machine);
        search_engine.$google_client_port$.setDynamicValue(port);
        return (SubLObject)search_engine.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30461L)
    public static SubLObject get_google_client(SubLObject licence_key) {
        if (licence_key == search_engine.UNPROVIDED) {
            licence_key = (SubLObject)search_engine.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search_engine.NIL == search_engine.$google_client$.getDynamicValue(thread)) {
            final SubLObject client = object.new_class_instance((SubLObject)search_engine.$sym318$GOOGLE_CLIENT);
            methods.funcall_instance_method_with_1_args(client, (SubLObject)search_engine.$sym319$SET_HOST, search_engine.$google_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args(client, (SubLObject)search_engine.$sym320$SET_PORT, search_engine.$google_client_port$.getDynamicValue(thread));
            search_engine.$google_client$.setDynamicValue(client, thread);
        }
        if (search_engine.NIL != licence_key) {
            methods.funcall_instance_method_with_1_args(search_engine.$google_client$.getDynamicValue(thread), (SubLObject)search_engine.$sym321$SET_CLIENT_KEY, licence_key);
        }
        else {
            methods.funcall_instance_method_with_1_args(search_engine.$google_client$.getDynamicValue(thread), (SubLObject)search_engine.$sym321$SET_CLIENT_KEY, search_engine.$authorized_google_key$.getDynamicValue(thread));
        }
        return search_engine.$google_client$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject get_google_client_client_interaction(final SubLObject google_client) {
        return classes.subloop_get_access_protected_instance_slot(google_client, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject set_google_client_client_interaction(final SubLObject google_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject get_google_client_client_key(final SubLObject google_client) {
        return classes.subloop_get_access_protected_instance_slot(google_client, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym325$CLIENT_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject set_google_client_client_key(final SubLObject google_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym325$CLIENT_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject subloop_reserved_initialize_google_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject subloop_reserved_initialize_google_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.$sym327$HOST, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.$sym328$PORT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym325$CLIENT_KEY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
    public static SubLObject google_client_p(final SubLObject google_client) {
        return classes.subloop_instanceof_class(google_client, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31562L)
    public static SubLObject google_client_initialize_method(final SubLObject self) {
        subloop_tcp_client.tcp_client_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31662L)
    public static SubLObject google_client_set_client_key_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_method = (SubLObject)search_engine.NIL;
        SubLObject client_key = get_google_client_client_key(self);
        try {
            thread.throwStack.push(search_engine.$sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(key) : key;
                client_key = key;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD, key);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_client_key(self, client_key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31794L)
    public static SubLObject google_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject start, SubLObject hits) {
        if (start == search_engine.UNPROVIDED) {
            start = (SubLObject)search_engine.ONE_INTEGER;
        }
        if (hits == search_engine.UNPROVIDED) {
            hits = (SubLObject)search_engine.TEN_INTEGER;
        }
        SubLObject client_interaction = get_google_client_client_interaction(self);
        assert search_engine.NIL != Types.stringp(directive_arg) : directive_arg;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(start) : start;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(hits) : hits;
        client_interaction = methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym339$BUILD_BASIC_GOOGLE_REQUEST, (SubLObject)search_engine.$str340$search, directive_arg);
        set_google_client_client_interaction(self, client_interaction);
        methods.funcall_instance_method_with_1_args(client_interaction, (SubLObject)search_engine.$sym341$SET_DOCNO, hits);
        methods.funcall_instance_method_with_1_args(client_interaction, (SubLObject)search_engine.$sym342$SET_START, start);
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym343$GET_ANSWER_FROM_REQUEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32333L)
    public static SubLObject google_client_count_method(final SubLObject self, final SubLObject directive_arg) {
        assert search_engine.NIL != Types.stringp(directive_arg) : directive_arg;
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$str348$count, directive_arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32516L)
    public static SubLObject google_client_spelling_method(final SubLObject self, final SubLObject directive_arg) {
        assert search_engine.NIL != Types.stringp(directive_arg) : directive_arg;
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$str351$spell, directive_arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32702L)
    public static SubLObject google_client_quit_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$str354$_quit_, (SubLObject)search_engine.$str355$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32824L)
    public static SubLObject google_client_version_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$str358$version, (SubLObject)search_engine.$str355$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32950L)
    public static SubLObject google_client_build_basic_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg) {
        final SubLObject client_key = get_google_client_client_key(self);
        final SubLObject request = object.new_class_instance((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym364$SET_KEY, client_key);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym365$SET_DIRECTIVE, directive);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, directive_arg);
        return request;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 33343L)
    public static SubLObject google_client_get_answer_from_request_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject client_interaction = get_google_client_client_interaction(self);
        SubLObject response = (SubLObject)search_engine.NIL;
        SubLObject error = (SubLObject)search_engine.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)search_engine.$sym115$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    response = methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym369$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(client_interaction, (SubLObject)search_engine.$sym370$REQUEST_STRING));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
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
        if (!error.isString()) {
            methods.funcall_instance_method_with_1_args(client_interaction, (SubLObject)search_engine.$sym371$BUILD_ANSWER, response);
            return methods.funcall_instance_method_with_0_args(client_interaction, (SubLObject)search_engine.$sym372$GET_ANSWER);
        }
        Errors.warn((SubLObject)search_engine.$str373$Error_when_contacting_Google_serv, error);
        return (SubLObject)search_engine.$kw317$ERROR;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 33996L)
    public static SubLObject google_client_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg) {
        SubLObject client_interaction = get_google_client_client_interaction(self);
        client_interaction = methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym339$BUILD_BASIC_GOOGLE_REQUEST, directive, directive_arg);
        set_google_client_client_interaction(self, client_interaction);
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym343$GET_ANSWER_FROM_REQUEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_google_io_error(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.TEN_INTEGER, (SubLObject)search_engine.$sym378$GOOGLE_IO_ERROR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_google_io_error(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.TEN_INTEGER, (SubLObject)search_engine.$sym378$GOOGLE_IO_ERROR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_google_version(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.$sym379$GOOGLE_VERSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_google_version(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.$sym379$GOOGLE_VERSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_google_spelling(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.EIGHT_INTEGER, (SubLObject)search_engine.$sym380$GOOGLE_SPELLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_google_spelling(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.EIGHT_INTEGER, (SubLObject)search_engine.$sym380$GOOGLE_SPELLING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_google_count(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym381$GOOGLE_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_google_count(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym381$GOOGLE_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_google_passages(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym382$GOOGLE_PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_google_passages(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym382$GOOGLE_PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_start(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym281$START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_start(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym281$START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_docno(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_docno(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_directive_arg(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_directive_arg(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_directive(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym384$DIRECTIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_directive(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym384$DIRECTIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_client_key(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym325$CLIENT_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_client_key(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym325$CLIENT_KEY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_total_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.$int385$21);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_total_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.$int385$21, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_rank_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWENTY_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_rank_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWENTY_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINETEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINETEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVENTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVENTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIXTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIXTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_title_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIFTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_title_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIFTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_url_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOURTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_url_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOURTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_content_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THIRTEEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_content_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THIRTEEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_language_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWELVE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_language_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWELVE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_key_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ELEVEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_key_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ELEVEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_start_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_start_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_count_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_count_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_type_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHT_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_type_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHT_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_query_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_query_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIX_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIX_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIVE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIVE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOUR_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOUR_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THREE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THREE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWO_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWO_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject get_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ONE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject set_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(google_client_interaction.isSymbol() ? classes.classes_retrieve_class(google_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(google_client_interaction)) ? google_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(google_client_interaction)) ? subloop_structures.instance_class(google_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ONE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject subloop_reserved_initialize_google_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym386$SEARCH_DIRECTIVE_TAG, (SubLObject)search_engine.$str340$search);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym387$COUNT_DIRECTIVE_TAG, (SubLObject)search_engine.$str348$count);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym388$SPELL_DIRECTIVE_TAG, (SubLObject)search_engine.$str351$spell);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym389$QUIT_DIRECTIVE_TAG, (SubLObject)search_engine.$str354$_quit_);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym390$VERSION_DIRECTIVE_TAG, (SubLObject)search_engine.$str358$version);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym391$SUBL_DIRECTIVE_TAG, (SubLObject)search_engine.$str392$SubL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym393$QUERY_TAG, (SubLObject)search_engine.$str170$query);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym394$QUERY_TYPE_ATTR, (SubLObject)search_engine.$str395$type);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym396$QUERY_COUNT_ATTR, (SubLObject)search_engine.$str397$hitnum);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym398$QUERY_START_ATTR, (SubLObject)search_engine.$str399$startnum);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym400$QUERY_KEY_ATTR, (SubLObject)search_engine.$str401$key);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym402$QUERY_LANGUAGE_ATTR, (SubLObject)search_engine.$str403$language);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym404$CONTENT_KEYWORD, (SubLObject)search_engine.$kw405$CONTENT);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym406$URL_KEYWORD, (SubLObject)search_engine.$kw407$URL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym408$TITLE_KEYWORD, (SubLObject)search_engine.$kw409$TITLE);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym410$FULL_TEXT_KEYWORD, (SubLObject)search_engine.$kw411$FULL_TEXT);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym412$SNIPPET_KEYWORD, (SubLObject)search_engine.$kw413$SNIPPET);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym414$OFFSET_IN_FULL_TEXT_KEYWORD, (SubLObject)search_engine.$kw415$OFFSET_IN_FULL_TEXT);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym416$OFFSET_IN_SNIPPET_KEYWORD, (SubLObject)search_engine.$kw417$OFFSET_IN_SNIPPET);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym418$RANK_KEYWORD, (SubLObject)search_engine.$kw419$RANK);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym420$TOTAL_KEYWORD, (SubLObject)search_engine.$kw421$TOTAL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject subloop_reserved_initialize_google_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym325$CLIENT_KEY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym384$DIRECTIVE, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym225$DOCNO, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym281$START, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym382$GOOGLE_PASSAGES, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym381$GOOGLE_COUNT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym380$GOOGLE_SPELLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym379$GOOGLE_VERSION, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym378$GOOGLE_IO_ERROR, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
    public static SubLObject google_client_interaction_p(final SubLObject google_client_interaction) {
        return classes.subloop_instanceof_class(google_client_interaction, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36566L)
    public static SubLObject google_client_interaction_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        SubLObject google_passages = get_google_client_interaction_google_passages(self);
        SubLObject start = get_google_client_interaction_start(self);
        SubLObject docno = get_google_client_interaction_docno(self);
        try {
            thread.throwStack.push(search_engine.$sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                object.object_initialize_method(self);
                google_passages = object.new_class_instance((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST);
                docno = (SubLObject)search_engine.TEN_INTEGER;
                start = (SubLObject)search_engine.ZERO_INTEGER;
                google_io_error = (SubLObject)search_engine.NIL;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    set_google_client_interaction_google_passages(self, google_passages);
                    set_google_client_interaction_start(self, start);
                    set_google_client_interaction_docno(self, docno);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36811L)
    public static SubLObject google_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject client_key = get_google_client_interaction_client_key(self);
        try {
            thread.throwStack.push(search_engine.$sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(v_object) : v_object;
                client_key = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_client_key(self, client_key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36958L)
    public static SubLObject google_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(v_object) : v_object;
                directive = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37110L)
    public static SubLObject google_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject docno = get_google_client_interaction_docno(self);
        try {
            thread.throwStack.push(search_engine.$sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.integerp(v_object) : v_object;
                docno = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_docno(self, docno);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37255L)
    public static SubLObject google_client_interaction_set_start_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject start = get_google_client_interaction_start(self);
        try {
            thread.throwStack.push(search_engine.$sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.integerp(v_object) : v_object;
                start = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_start(self, start);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37400L)
    public static SubLObject google_client_interaction_get_io_error_flag_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        try {
            thread.throwStack.push(search_engine.$sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_io_error);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37504L)
    public static SubLObject google_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject total_keyword = get_google_client_interaction_total_keyword(self);
        final SubLObject rank_keyword = get_google_client_interaction_rank_keyword(self);
        final SubLObject offset_in_snippet_keyword = get_google_client_interaction_offset_in_snippet_keyword(self);
        final SubLObject offset_in_full_text_keyword = get_google_client_interaction_offset_in_full_text_keyword(self);
        final SubLObject snippet_keyword = get_google_client_interaction_snippet_keyword(self);
        final SubLObject full_text_keyword = get_google_client_interaction_full_text_keyword(self);
        final SubLObject title_keyword = get_google_client_interaction_title_keyword(self);
        final SubLObject url_keyword = get_google_client_interaction_url_keyword(self);
        final SubLObject content_keyword = get_google_client_interaction_content_keyword(self);
        final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag(self);
        final SubLObject quit_directive_tag = get_google_client_interaction_quit_directive_tag(self);
        final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag(self);
        final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag(self);
        SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        SubLObject google_version = get_google_client_interaction_google_version(self);
        SubLObject google_spelling = get_google_client_interaction_google_spelling(self);
        SubLObject google_count = get_google_client_interaction_google_count(self);
        final SubLObject google_passages = get_google_client_interaction_google_passages(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = (SubLObject)search_engine.NIL;
                SubLObject error = (SubLObject)search_engine.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)search_engine.$sym115$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = reader.read_from_string(response_string, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
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
                if (search_engine.NIL != error) {
                    Errors.warn((SubLObject)search_engine.$str447$Could_not_build_answer__the_respo, response_string, error);
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
                }
                if (response == search_engine.$kw448$IO_ERROR) {
                    google_io_error = (SubLObject)search_engine.T;
                }
                else if (directive.equalp(count_directive_tag)) {
                    if (response.isInteger()) {
                        google_count = response;
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str449$Google_count_is_not_a_digit_strin);
                        google_count = (SubLObject)search_engine.ZERO_INTEGER;
                    }
                }
                else if (directive.equalp(search_directive_tag)) {
                    if (response.isList()) {
                        SubLObject cdolist_list_var = response;
                        SubLObject passage = (SubLObject)search_engine.NIL;
                        passage = cdolist_list_var.first();
                        while (search_engine.NIL != cdolist_list_var) {
                            final SubLObject url = conses_high.getf(passage, url_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject title = conses_high.getf(passage, title_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject content = conses_high.getf(passage, content_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject full_text = conses_high.getf(passage, full_text_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject snippet = conses_high.getf(passage, snippet_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject offset_in_snippet = conses_high.getf(passage, offset_in_snippet_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject text = full_text.isString() ? full_text : content;
                            final SubLObject offset_in_full_text = full_text.isString() ? conses_high.getf(passage, offset_in_full_text_keyword, (SubLObject)search_engine.UNPROVIDED) : offset_in_snippet;
                            final SubLObject rank = conses_high.getf(passage, rank_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject total = conses_high.getf(passage, total_keyword, (SubLObject)search_engine.UNPROVIDED);
                            methods.funcall_instance_method_with_1_args(google_passages, (SubLObject)search_engine.$sym450$ADD, new_google_passage(url, rank, title, text, snippet, offset_in_full_text, offset_in_snippet, total));
                            cdolist_list_var = cdolist_list_var.rest();
                            passage = cdolist_list_var.first();
                        }
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str451$Response__A_is_of_unwanted_type__, response, (SubLObject)Types.type_of(response));
                    }
                }
                else if (directive.equalp(version_directive_tag)) {
                    if (search_engine.NIL != list_utilities.property_list_p(response)) {
                        google_version = response;
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str451$Response__A_is_of_unwanted_type__, response, (SubLObject)Types.type_of(response));
                    }
                }
                else if (!directive.equalp(quit_directive_tag)) {
                    if (directive.equalp(spell_directive_tag)) {
                        if (search_engine.NIL != list_utilities.property_list_p(response)) {
                            google_spelling = conses_high.second(response);
                        }
                        else {
                            Errors.warn((SubLObject)search_engine.$str451$Response__A_is_of_unwanted_type__, (SubLObject)Types.type_of(response));
                        }
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str452$Query_directive__S_is_not_support, directive);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_total_keyword(self, total_keyword);
                    set_google_client_interaction_rank_keyword(self, rank_keyword);
                    set_google_client_interaction_offset_in_snippet_keyword(self, offset_in_snippet_keyword);
                    set_google_client_interaction_offset_in_full_text_keyword(self, offset_in_full_text_keyword);
                    set_google_client_interaction_snippet_keyword(self, snippet_keyword);
                    set_google_client_interaction_full_text_keyword(self, full_text_keyword);
                    set_google_client_interaction_title_keyword(self, title_keyword);
                    set_google_client_interaction_url_keyword(self, url_keyword);
                    set_google_client_interaction_content_keyword(self, content_keyword);
                    set_google_client_interaction_version_directive_tag(self, version_directive_tag);
                    set_google_client_interaction_quit_directive_tag(self, quit_directive_tag);
                    set_google_client_interaction_spell_directive_tag(self, spell_directive_tag);
                    set_google_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_google_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    set_google_client_interaction_google_version(self, google_version);
                    set_google_client_interaction_google_spelling(self, google_spelling);
                    set_google_client_interaction_google_count(self, google_count);
                    set_google_client_interaction_google_passages(self, google_passages);
                    set_google_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, (SubLObject)search_engine.$sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40215L)
    public static SubLObject google_client_interaction_get_directive_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, directive);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40309L)
    public static SubLObject google_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject directive_arg = get_google_client_interaction_directive_arg(self);
        try {
            thread.throwStack.push(search_engine.$sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(v_object) : v_object;
                directive_arg = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_directive_arg(self, directive_arg);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40469L)
    public static SubLObject google_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject query_language_attr = get_google_client_interaction_query_language_attr(self);
        final SubLObject query_key_attr = get_google_client_interaction_query_key_attr(self);
        final SubLObject query_start_attr = get_google_client_interaction_query_start_attr(self);
        final SubLObject query_count_attr = get_google_client_interaction_query_count_attr(self);
        final SubLObject query_type_attr = get_google_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_google_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_google_client_interaction_subl_directive_tag(self);
        final SubLObject start = get_google_client_interaction_start(self);
        final SubLObject docno = get_google_client_interaction_docno(self);
        final SubLObject directive_arg = get_google_client_interaction_directive_arg(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        final SubLObject client_key = get_google_client_interaction_client_key(self);
        try {
            thread.throwStack.push(search_engine.$sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject result = (SubLObject)search_engine.$str355$;
                if (search_engine.NIL != client_key && search_engine.NIL != directive && search_engine.NIL != directive_arg) {
                    final SubLObject outstream = streams_high.make_string_output_stream();
                    final SubLObject v_xml_writer = object.new_class_instance((SubLObject)search_engine.$sym463$XML_WRITER);
                    methods.funcall_instance_method_with_1_args(v_xml_writer, (SubLObject)search_engine.$sym464$SET_STREAM, outstream);
                    methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)search_engine.$sym465$START_TAG, query_tag, (SubLObject)ConsesLow.list(new SubLObject[] { query_key_attr, client_key, query_type_attr, directive, query_count_attr, docno, query_start_attr, start, query_language_attr, subl_directive_tag }), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)search_engine.$sym466$XML_PRINT, directive_arg, (SubLObject)search_engine.NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)search_engine.$sym467$END_TAG, query_tag, (SubLObject)search_engine.NIL);
                    result = string_utilities.trim_whitespace(streams_high.get_output_stream_string(outstream));
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_query_language_attr(self, query_language_attr);
                    set_google_client_interaction_query_key_attr(self, query_key_attr);
                    set_google_client_interaction_query_start_attr(self, query_start_attr);
                    set_google_client_interaction_query_count_attr(self, query_count_attr);
                    set_google_client_interaction_query_type_attr(self, query_type_attr);
                    set_google_client_interaction_query_tag(self, query_tag);
                    set_google_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_google_client_interaction_start(self, start);
                    set_google_client_interaction_docno(self, docno);
                    set_google_client_interaction_directive_arg(self, directive_arg);
                    set_google_client_interaction_directive(self, directive);
                    set_google_client_interaction_client_key(self, client_key);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 41199L)
    public static SubLObject google_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag(self);
        final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag(self);
        final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag(self);
        final SubLObject google_version = get_google_client_interaction_google_version(self);
        final SubLObject google_spelling = get_google_client_interaction_google_spelling(self);
        final SubLObject google_count = get_google_client_interaction_google_count(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                if (search_engine.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym440$GET_IO_ERROR_FLAG)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, (SubLObject)search_engine.$kw471$SERVER_ERROR);
                }
                else if (directive.equalp(count_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_count);
                }
                else if (directive.equalp(spell_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_spelling);
                }
                else if (directive.equalp(version_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_version);
                }
                else if (directive.equalp(search_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym472$GET_GOOGLE_PASSAGES));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_version_directive_tag(self, version_directive_tag);
                    set_google_client_interaction_spell_directive_tag(self, spell_directive_tag);
                    set_google_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_google_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_google_client_interaction_google_version(self, google_version);
                    set_google_client_interaction_google_spelling(self, google_spelling);
                    set_google_client_interaction_google_count(self, google_count);
                    set_google_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 41666L)
    public static SubLObject google_client_interaction_get_google_passages_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject google_passages = get_google_client_interaction_google_passages(self);
        try {
            thread.throwStack.push(search_engine.$sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject snippet_list = (SubLObject)search_engine.NIL;
                SubLObject enumerator = (SubLObject)search_engine.NIL;
                if (search_engine.NIL == methods.funcall_instance_method_with_0_args(google_passages, (SubLObject)search_engine.$sym476$EMPTY_P)) {
                    enumerator = methods.funcall_instance_method_with_0_args(google_passages, (SubLObject)search_engine.$sym477$ALLOCATE_ENUMERATOR);
                    snippet_list = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym478$FIRST), snippet_list);
                    while (search_engine.NIL == methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym479$LAST_P)) {
                        snippet_list = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym480$NEXT), snippet_list);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, Sequences.nreverse(snippet_list));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_client_interaction_google_passages(self, google_passages);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
    public static SubLObject subloop_reserved_initialize_google_passage_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
    public static SubLObject subloop_reserved_initialize_google_passage_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym485$BASIC_COLLECTION, (SubLObject)search_engine.$sym486$CONTENTS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym485$BASIC_COLLECTION, (SubLObject)search_engine.$sym487$ELEMENT_EQUALITY_PREDICATE, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
    public static SubLObject google_passage_list_p(final SubLObject google_passage_list) {
        return classes.subloop_instanceof_class(google_passage_list, (SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42515L)
    public static SubLObject google_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search_engine.NIL != instances.instance_of_p(new_element, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE) && search_engine.NIL != methods.funcall_instance_method_with_0_args(new_element, (SubLObject)search_engine.$sym493$IS_COMPLETE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42708L)
    public static SubLObject google_passage_list_add_method(final SubLObject self, final SubLObject new_element) {
        if (search_engine.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym489$ACCEPTABLE_P, new_element)) {
            methods.funcall_instance_super_method_with_1_args(self, (SubLObject)search_engine.$sym450$ADD, new_element);
        }
        else {
            Errors.warn((SubLObject)search_engine.$str496$__Cannot_add__S_to_a_google_passa, new_element);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_parse_trees(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.ELEVEN_INTEGER, (SubLObject)search_engine.$sym499$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_parse_trees(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.ELEVEN_INTEGER, (SubLObject)search_engine.$sym499$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_total(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.TEN_INTEGER, (SubLObject)search_engine.$sym500$TOTAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_total(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.TEN_INTEGER, (SubLObject)search_engine.$sym500$TOTAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_offset_in_text(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.$sym501$OFFSET_IN_TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_offset_in_text(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.$sym501$OFFSET_IN_TEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_offset_in_snippet(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.EIGHT_INTEGER, (SubLObject)search_engine.$sym502$OFFSET_IN_SNIPPET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_offset_in_snippet(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.EIGHT_INTEGER, (SubLObject)search_engine.$sym502$OFFSET_IN_SNIPPET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_snippet(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym503$SNIPPET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_snippet(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.$sym503$SNIPPET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_title(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym504$TITLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_title(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym504$TITLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_url(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym505$URL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_url(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym505$URL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject get_google_passage_rank(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym506$RANK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject set_google_passage_rank(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym506$RANK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject subloop_reserved_initialize_google_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject subloop_reserved_initialize_google_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym506$RANK, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym505$URL, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym504$TITLE, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym503$SNIPPET, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym502$OFFSET_IN_SNIPPET, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym501$OFFSET_IN_TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym500$TOTAL, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym499$PARSE_TREES, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
    public static SubLObject google_passage_p(final SubLObject google_passage) {
        return classes.subloop_instanceof_class(google_passage, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 43970L)
    public static SubLObject new_google_passage(final SubLObject url, final SubLObject rank, final SubLObject title, final SubLObject text, SubLObject snippet, SubLObject text_offset, SubLObject snippet_offset, SubLObject total) {
        if (snippet == search_engine.UNPROVIDED) {
            snippet = (SubLObject)search_engine.NIL;
        }
        if (text_offset == search_engine.UNPROVIDED) {
            text_offset = (SubLObject)search_engine.NIL;
        }
        if (snippet_offset == search_engine.UNPROVIDED) {
            snippet_offset = (SubLObject)search_engine.NIL;
        }
        if (total == search_engine.UNPROVIDED) {
            total = (SubLObject)search_engine.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert search_engine.NIL != Types.stringp(url) : url;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(rank) : rank;
        assert search_engine.NIL != Types.stringp(text) : text;
        assert search_engine.NIL != Types.stringp(title) : title;
        if (search_engine.NIL != text_offset) {
            assert search_engine.NIL != subl_promotions.non_negative_integer_p(text_offset) : text_offset;
        }
        else {
            text_offset = (SubLObject)search_engine.ZERO_INTEGER;
        }
        if (search_engine.NIL != snippet) {
            assert search_engine.NIL != Types.stringp(snippet) : snippet;
        }
        else {
            snippet = text;
            snippet_offset = text_offset;
        }
        if (search_engine.NIL != snippet_offset) {
            assert search_engine.NIL != subl_promotions.non_negative_integer_p(snippet_offset) : snippet_offset;
        }
        else {
            snippet_offset = (SubLObject)search_engine.ZERO_INTEGER;
        }
        if (search_engine.NIL != total) {
            assert search_engine.NIL != subl_promotions.non_negative_integer_p(total) : total;
        }
        else {
            total = (SubLObject)search_engine.ZERO_INTEGER;
        }
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE);
        set_corpus_passage_corpus(passage, search_engine.$world_wide_web_corpus$.getDynamicValue(thread));
        set_corpus_passage_text(passage, text);
        set_google_passage_url(passage, url);
        set_google_passage_title(passage, title);
        set_google_passage_rank(passage, rank);
        set_google_passage_snippet(passage, snippet);
        set_google_passage_offset_in_text(passage, text_offset);
        set_google_passage_offset_in_snippet(passage, snippet_offset);
        set_google_passage_total(passage, total);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45207L)
    public static SubLObject google_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject url = get_google_passage_url(self);
        try {
            thread.throwStack.push(search_engine.$sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_url(self, url);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45330L)
    public static SubLObject google_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject rank = get_google_passage_rank(self);
        try {
            thread.throwStack.push(search_engine.$sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, Numbers.divide((SubLObject)search_engine.ONE_INTEGER, rank));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_rank(self, rank);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45410L)
    public static SubLObject google_passage_is_complete_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject url = get_google_passage_url(self);
        final SubLObject rank = get_google_passage_rank(self);
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                if (search_engine.NIL == subl_promotions.non_negative_integer_p(rank)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                if (!url.isString()) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                if (!text.isString()) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, (SubLObject)search_engine.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_url(self, url);
                    set_google_passage_rank(self, rank);
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45609L)
    public static SubLObject google_passage_get_offset_in_full_text_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject offset_in_text = get_google_passage_offset_in_text(self);
        try {
            thread.throwStack.push(search_engine.$sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_text);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_offset_in_text(self, offset_in_text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45708L)
    public static SubLObject google_passage_get_offset_in_snippet_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject offset_in_snippet = get_google_passage_offset_in_snippet(self);
        try {
            thread.throwStack.push(search_engine.$sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_snippet);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_offset_in_snippet(self, offset_in_snippet);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45807L)
    public static SubLObject google_passage_get_url_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject url = get_google_passage_url(self);
        try {
            thread.throwStack.push(search_engine.$sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_url(self, url);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45878L)
    public static SubLObject google_passage_get_title_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject title = get_google_passage_title(self);
        try {
            thread.throwStack.push(search_engine.$sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, title);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_title(self, title);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45953L)
    public static SubLObject google_passage_get_cached_file_id_method(final SubLObject self) {
        return google_passage_get_url_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46046L)
    public static SubLObject google_passage_get_full_text_method(final SubLObject self) {
        return get_corpus_passage_text(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46150L)
    public static SubLObject google_passage_get_snippet_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject snippet = get_google_passage_snippet(self);
        try {
            thread.throwStack.push(search_engine.$sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, snippet);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_snippet(self, snippet);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46229L)
    public static SubLObject google_passage_get_rank_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject rank = get_google_passage_rank(self);
        try {
            thread.throwStack.push(search_engine.$sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, rank);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_rank(self, rank);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46302L)
    public static SubLObject google_passage_get_total_for_rank_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject total = get_google_passage_total(self);
        try {
            thread.throwStack.push(search_engine.$sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, total);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_google_passage_total(self, total);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46386L)
    public static SubLObject google_passage_get_rank_and_total_method(final SubLObject self) {
        return Values.values(google_passage_get_rank_method(self), google_passage_get_total_for_rank_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46515L)
    public static SubLObject google_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        print_high.princ(google_passage_get_source_method(self), stream);
        streams_high.terpri(stream);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46749L)
    public static SubLObject google_passage_get_publication_date_method(final SubLObject self) {
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject get_lucene_query_sentno(final SubLObject lucene_query) {
        return classes.subloop_get_access_protected_instance_slot(lucene_query, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym224$SENTNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject set_lucene_query_sentno(final SubLObject lucene_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_query, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym224$SENTNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject get_lucene_query_docno(final SubLObject lucene_query) {
        return classes.subloop_get_access_protected_instance_slot(lucene_query, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject set_lucene_query_docno(final SubLObject lucene_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_query, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject subloop_reserved_initialize_lucene_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject subloop_reserved_initialize_lucene_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym225$DOCNO, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym224$SENTNO, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
    public static SubLObject lucene_query_p(final SubLObject lucene_query) {
        return classes.subloop_instanceof_class(lucene_query, (SubLObject)search_engine.$sym559$LUCENE_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47185L)
    public static SubLObject new_lucene_query(final SubLObject string, SubLObject docno, SubLObject sentno) {
        if (docno == search_engine.UNPROVIDED) {
            docno = (SubLObject)search_engine.$int228$50;
        }
        if (sentno == search_engine.UNPROVIDED) {
            sentno = (SubLObject)search_engine.$int228$50;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert search_engine.NIL != Types.stringp(string) : string;
        assert search_engine.NIL != subl_promotions.positive_integer_p(docno) : docno;
        assert search_engine.NIL != subl_promotions.positive_integer_p(sentno) : sentno;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym559$LUCENE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, search_engine.$wikipedia$.getDynamicValue(thread));
        set_lucene_query_docno(query, docno);
        set_lucene_query_sentno(query, sentno);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47734L)
    public static SubLObject lucene_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_query_method = (SubLObject)search_engine.NIL;
        final SubLObject docno = get_lucene_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD, methods.funcall_instance_method_with_2_args(get_lucene_client(), (SubLObject)search_engine.$sym286$SEARCH, query, docno));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48058L)
    public static SubLObject seed_lucene_client(final SubLObject machine, final SubLObject port) {
        assert search_engine.NIL != Types.stringp(machine) : machine;
        assert search_engine.NIL != subl_promotions.positive_integer_p(port) : port;
        search_engine.$lucene_client_host$.setDynamicValue(machine);
        search_engine.$lucene_client_port$.setDynamicValue(port);
        return (SubLObject)search_engine.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48264L)
    public static SubLObject get_lucene_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search_engine.NIL == search_engine.$lucene_client$.getDynamicValue(thread)) {
            search_engine.$lucene_client$.setDynamicValue(object.new_class_instance((SubLObject)search_engine.$sym566$LUCENE_CLIENT), thread);
            methods.funcall_instance_method_with_1_args(search_engine.$lucene_client$.getDynamicValue(thread), (SubLObject)search_engine.$sym319$SET_HOST, search_engine.$lucene_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args(search_engine.$lucene_client$.getDynamicValue(thread), (SubLObject)search_engine.$sym320$SET_PORT, search_engine.$lucene_client_port$.getDynamicValue(thread));
        }
        return search_engine.$lucene_client$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
    public static SubLObject get_lucene_client_client_interaction(final SubLObject lucene_client) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
    public static SubLObject set_lucene_client_client_interaction(final SubLObject lucene_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
    public static SubLObject subloop_reserved_initialize_lucene_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
    public static SubLObject subloop_reserved_initialize_lucene_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.$sym327$HOST, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.$sym328$PORT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym324$CLIENT_INTERACTION, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
    public static SubLObject lucene_client_p(final SubLObject lucene_client) {
        return classes.subloop_instanceof_class(lucene_client, (SubLObject)search_engine.$sym566$LUCENE_CLIENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48978L)
    public static SubLObject lucene_client_initialize_method(final SubLObject self) {
        subloop_tcp_client.tcp_client_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49078L)
    public static SubLObject lucene_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject docno) {
        if (docno == search_engine.UNPROVIDED) {
            docno = (SubLObject)search_engine.$int228$50;
        }
        assert search_engine.NIL != Types.stringp(directive_arg) : directive_arg;
        return methods.funcall_instance_method_with_3_args(self, (SubLObject)search_engine.$sym573$LUCENE_REQUEST, (SubLObject)search_engine.$str340$search, directive_arg, docno);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49291L)
    public static SubLObject lucene_client_count_method(final SubLObject self, final SubLObject directive_arg) {
        assert search_engine.NIL != Types.stringp(directive_arg) : directive_arg;
        return methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym573$LUCENE_REQUEST, (SubLObject)search_engine.$str348$count, directive_arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49474L)
    public static SubLObject lucene_client_lucene_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg, SubLObject docno) {
        if (docno == search_engine.UNPROVIDED) {
            docno = (SubLObject)search_engine.TEN_INTEGER;
        }
        SubLObject client_interaction = get_lucene_client_client_interaction(self);
        final SubLObject request = object.new_class_instance((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym365$SET_DIRECTIVE, directive);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, directive_arg);
        methods.funcall_instance_method_with_1_args(request, (SubLObject)search_engine.$sym341$SET_DOCNO, docno);
        client_interaction = request;
        set_lucene_client_client_interaction(self, client_interaction);
        methods.funcall_instance_method_with_1_args(client_interaction, (SubLObject)search_engine.$sym371$BUILD_ANSWER, methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym369$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(client_interaction, (SubLObject)search_engine.$sym370$REQUEST_STRING)));
        return methods.funcall_instance_method_with_0_args(client_interaction, (SubLObject)search_engine.$sym372$GET_ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym582$LUCENE_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym582$LUCENE_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym583$LUCENE_PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym583$LUCENE_PASSAGES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_directive(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym384$DIRECTIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_directive(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym384$DIRECTIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_docno(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_docno(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym225$DOCNO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.NINE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHT_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.EIGHT_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVEN_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SEVEN_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIX_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.SIX_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIVE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FIVE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOUR_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.FOUR_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THREE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.THREE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWO_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.TWO_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject get_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ONE_INTEGER);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject set_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class(lucene_client_interaction) : ((search_engine.NIL != subloop_structures.class_p(lucene_client_interaction)) ? lucene_client_interaction : ((search_engine.NIL != subloop_structures.instance_p(lucene_client_interaction)) ? subloop_structures.instance_class(lucene_client_interaction) : search_engine.NIL)));
        if (search_engine.NIL != v_class) {
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)search_engine.ONE_INTEGER, value);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject subloop_reserved_initialize_lucene_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym386$SEARCH_DIRECTIVE_TAG, (SubLObject)search_engine.$str340$search);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym387$COUNT_DIRECTIVE_TAG, (SubLObject)search_engine.$str348$count);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym391$SUBL_DIRECTIVE_TAG, (SubLObject)search_engine.$str392$SubL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym393$QUERY_TAG, (SubLObject)search_engine.$str170$query);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym394$QUERY_TYPE_ATTR, (SubLObject)search_engine.$str395$type);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym396$QUERY_COUNT_ATTR, (SubLObject)search_engine.$str397$hitnum);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym402$QUERY_LANGUAGE_ATTR, (SubLObject)search_engine.$str403$language);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym584$ID_KEYWORD, (SubLObject)search_engine.$kw585$ID);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym404$CONTENT_KEYWORD, (SubLObject)search_engine.$kw405$CONTENT);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject subloop_reserved_initialize_lucene_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym225$DOCNO, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym384$DIRECTIVE, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym383$DIRECTIVE_ARG, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym583$LUCENE_PASSAGES, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym582$LUCENE_COUNT, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
    public static SubLObject lucene_client_interaction_p(final SubLObject lucene_client_interaction) {
        return classes.subloop_instanceof_class(lucene_client_interaction, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51409L)
    public static SubLObject lucene_client_interaction_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        try {
            thread.throwStack.push(search_engine.$sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                object.object_initialize_method(self);
                lucene_passages = object.new_class_instance((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51587L)
    public static SubLObject lucene_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(v_object) : v_object;
                directive = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51739L)
    public static SubLObject lucene_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject content_keyword = get_lucene_client_interaction_content_keyword(self);
        final SubLObject id_keyword = get_lucene_client_interaction_id_keyword(self);
        final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag(self);
        SubLObject lucene_count = get_lucene_client_interaction_lucene_count(self);
        final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = (SubLObject)search_engine.NIL;
                SubLObject error = (SubLObject)search_engine.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)search_engine.$sym115$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = reader.read_from_string(response_string, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
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
                if (search_engine.NIL != error) {
                    Errors.warn(error);
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
                }
                if (directive.equalp(count_directive_tag)) {
                    if (response.isInteger()) {
                        lucene_count = response;
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str596$Lucene_count_is_not_a_digit_strin);
                        lucene_count = (SubLObject)search_engine.ZERO_INTEGER;
                    }
                }
                else if (directive.equalp(search_directive_tag)) {
                    if (response.isList()) {
                        final SubLObject rank = (SubLObject)search_engine.ONE_INTEGER;
                        SubLObject cdolist_list_var = response;
                        SubLObject passage = (SubLObject)search_engine.NIL;
                        passage = cdolist_list_var.first();
                        while (search_engine.NIL != cdolist_list_var) {
                            final SubLObject id = conses_high.getf(passage, id_keyword, (SubLObject)search_engine.UNPROVIDED);
                            final SubLObject text = conses_high.getf(passage, content_keyword, (SubLObject)search_engine.UNPROVIDED);
                            methods.funcall_instance_method_with_1_args(lucene_passages, (SubLObject)search_engine.$sym450$ADD, new_lucene_passage(id, rank, text));
                            cdolist_list_var = cdolist_list_var.rest();
                            passage = cdolist_list_var.first();
                        }
                    }
                    else {
                        Errors.warn((SubLObject)search_engine.$str597$Response_is_of_unwanted_type__S_, (SubLObject)Types.type_of(response));
                    }
                }
                else {
                    Errors.warn((SubLObject)search_engine.$str452$Query_directive__S_is_not_support, directive);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_content_keyword(self, content_keyword);
                    set_lucene_client_interaction_id_keyword(self, id_keyword);
                    set_lucene_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_lucene_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_lucene_client_interaction_lucene_count(self, lucene_count);
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    set_lucene_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, (SubLObject)search_engine.$sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 52771L)
    public static SubLObject lucene_client_interaction_get_directive_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, directive);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 52865L)
    public static SubLObject lucene_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject directive_arg = get_lucene_client_interaction_directive_arg(self);
        try {
            thread.throwStack.push(search_engine.$sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.stringp(v_object) : v_object;
                directive_arg = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_directive_arg(self, directive_arg);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53025L)
    public static SubLObject lucene_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        SubLObject docno = get_lucene_client_interaction_docno(self);
        try {
            thread.throwStack.push(search_engine.$sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert search_engine.NIL != Types.integerp(v_object) : v_object;
                docno = v_object;
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_docno(self, docno);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53170L)
    public static SubLObject lucene_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject query_language_attr = get_lucene_client_interaction_query_language_attr(self);
        final SubLObject query_count_attr = get_lucene_client_interaction_query_count_attr(self);
        final SubLObject query_type_attr = get_lucene_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_lucene_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_lucene_client_interaction_subl_directive_tag(self);
        final SubLObject directive_arg = get_lucene_client_interaction_directive_arg(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        final SubLObject docno = get_lucene_client_interaction_docno(self);
        try {
            thread.throwStack.push(search_engine.$sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject result = (SubLObject)search_engine.$str355$;
                if (search_engine.NIL != directive && search_engine.NIL != directive_arg) {
                    final SubLObject outstream = streams_high.make_string_output_stream();
                    final SubLObject v_xml_writer = object.new_class_instance((SubLObject)search_engine.$sym463$XML_WRITER);
                    methods.funcall_instance_method_with_1_args(v_xml_writer, (SubLObject)search_engine.$sym464$SET_STREAM, outstream);
                    methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)search_engine.$sym465$START_TAG, query_tag, (SubLObject)ConsesLow.list(query_type_attr, directive, query_count_attr, docno, query_language_attr, subl_directive_tag), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)search_engine.$sym466$XML_PRINT, directive_arg, (SubLObject)search_engine.NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)search_engine.$sym467$END_TAG, query_tag, (SubLObject)search_engine.NIL);
                    result = string_utilities.trim_whitespace(streams_high.get_output_stream_string(outstream));
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_query_language_attr(self, query_language_attr);
                    set_lucene_client_interaction_query_count_attr(self, query_count_attr);
                    set_lucene_client_interaction_query_type_attr(self, query_type_attr);
                    set_lucene_client_interaction_query_tag(self, query_tag);
                    set_lucene_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_lucene_client_interaction_directive_arg(self, directive_arg);
                    set_lucene_client_interaction_directive(self, directive);
                    set_lucene_client_interaction_docno(self, docno);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53820L)
    public static SubLObject lucene_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag(self);
        final SubLObject lucene_count = get_lucene_client_interaction_lucene_count(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push(search_engine.$sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                if (directive.equalp(count_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, lucene_count);
                }
                else if (directive.equalp(search_directive_tag)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)search_engine.$sym610$GET_LUCENE_PASSAGES));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_lucene_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_lucene_client_interaction_lucene_count(self, lucene_count);
                    set_lucene_client_interaction_directive(self, directive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54073L)
    public static SubLObject lucene_client_interaction_get_lucene_passages_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = (SubLObject)search_engine.NIL;
        final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        try {
            thread.throwStack.push(search_engine.$sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject passage_list = (SubLObject)search_engine.NIL;
                SubLObject enumerator = (SubLObject)search_engine.NIL;
                if (search_engine.NIL == methods.funcall_instance_method_with_0_args(lucene_passages, (SubLObject)search_engine.$sym476$EMPTY_P)) {
                    enumerator = methods.funcall_instance_method_with_0_args(lucene_passages, (SubLObject)search_engine.$sym477$ALLOCATE_ENUMERATOR);
                    passage_list = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym478$FIRST), passage_list);
                    while (search_engine.NIL == methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym479$LAST_P)) {
                        passage_list = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(enumerator, (SubLObject)search_engine.$sym480$NEXT), passage_list);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, Sequences.nreverse(passage_list));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
    public static SubLObject subloop_reserved_initialize_lucene_passage_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
    public static SubLObject subloop_reserved_initialize_lucene_passage_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym485$BASIC_COLLECTION, (SubLObject)search_engine.$sym486$CONTENTS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym485$BASIC_COLLECTION, (SubLObject)search_engine.$sym487$ELEMENT_EQUALITY_PREDICATE, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
    public static SubLObject lucene_passage_list_p(final SubLObject lucene_passage_list) {
        return classes.subloop_instanceof_class(lucene_passage_list, (SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54922L)
    public static SubLObject lucene_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)SubLObjectFactory.makeBoolean(search_engine.NIL != instances.instance_of_p(new_element, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE) && search_engine.NIL != methods.funcall_instance_method_with_0_args(new_element, (SubLObject)search_engine.$sym493$IS_COMPLETE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55115L)
    public static SubLObject lucene_passage_list_add_method(final SubLObject self, final SubLObject new_element) {
        if (search_engine.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym489$ACCEPTABLE_P, new_element)) {
            methods.funcall_instance_super_method_with_1_args(self, (SubLObject)search_engine.$sym450$ADD, new_element);
        }
        else {
            Errors.warn((SubLObject)search_engine.$str621$__Cannot_add__S_to_a_lucene_passa, new_element);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject get_lucene_passage_parse_trees(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym499$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject set_lucene_passage_parse_trees(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.$sym499$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject get_lucene_passage_id(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym624$ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject set_lucene_passage_id(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym624$ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject get_lucene_passage_rank(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym506$RANK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject set_lucene_passage_rank(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym506$RANK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject subloop_reserved_initialize_lucene_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject subloop_reserved_initialize_lucene_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym14$VECTOR, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym56$CORPUS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym42$TEXT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym506$RANK, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym624$ID, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym499$PARSE_TREES, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
    public static SubLObject lucene_passage_p(final SubLObject lucene_passage) {
        return classes.subloop_instanceof_class(lucene_passage, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55697L)
    public static SubLObject new_lucene_passage(final SubLObject id, final SubLObject rank, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert search_engine.NIL != Types.stringp(id) : id;
        assert search_engine.NIL != subl_promotions.non_negative_integer_p(rank) : rank;
        assert search_engine.NIL != Types.stringp(text) : text;
        final SubLObject passage = object.new_class_instance((SubLObject)search_engine.$sym618$LUCENE_PASSAGE);
        set_corpus_passage_corpus(passage, search_engine.$wikipedia$.getDynamicValue(thread));
        set_corpus_passage_text(passage, text);
        set_lucene_passage_id(passage, id);
        set_lucene_passage_rank(passage, rank);
        return passage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56103L)
    public static SubLObject lucene_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject id = get_lucene_passage_id(self);
        try {
            thread.throwStack.push(search_engine.$sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, id);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_passage_id(self, id);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56225L)
    public static SubLObject lucene_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject rank = get_lucene_passage_rank(self);
        try {
            thread.throwStack.push(search_engine.$sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                if (search_engine.NIL == rank) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, (SubLObject)search_engine.ZERO_INTEGER);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, Numbers.divide((SubLObject)search_engine.ONE_INTEGER, rank));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_passage_rank(self, rank);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56383L)
    public static SubLObject lucene_passage_is_complete_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject id = get_lucene_passage_id(self);
        final SubLObject rank = get_lucene_passage_rank(self);
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                if (search_engine.NIL == subl_promotions.non_negative_integer_p(rank)) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                if (!id.isString()) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                if (!text.isString()) {
                    Dynamic.sublisp_throw((SubLObject)search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, (SubLObject)search_engine.NIL);
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, (SubLObject)search_engine.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lucene_passage_id(self, id);
                    set_lucene_passage_rank(self, rank);
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56581L)
    public static SubLObject lucene_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = (SubLObject)search_engine.NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push(search_engine.$sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                print_high.princ(lucene_passage_get_source_method(self), stream);
                streams_high.terpri(stream);
                print_high.princ(text, stream);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56813L)
    public static SubLObject lucene_passage_get_publication_date_method(final SubLObject self) {
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject get_cycl_query_properties(final SubLObject cycl_query) {
        return classes.subloop_get_access_protected_instance_slot(cycl_query, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym642$PROPERTIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject set_cycl_query_properties(final SubLObject cycl_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_query, value, (SubLObject)search_engine.FIVE_INTEGER, (SubLObject)search_engine.$sym642$PROPERTIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject get_cycl_query_knowledge_sources(final SubLObject cycl_query) {
        return classes.subloop_get_access_protected_instance_slot(cycl_query, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym643$KNOWLEDGE_SOURCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject set_cycl_query_knowledge_sources(final SubLObject cycl_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_query, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym643$KNOWLEDGE_SOURCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject subloop_reserved_initialize_cycl_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject subloop_reserved_initialize_cycl_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym643$KNOWLEDGE_SOURCES, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym642$PROPERTIES, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
    public static SubLObject cycl_query_p(final SubLObject cycl_query) {
        return classes.subloop_instanceof_class(cycl_query, (SubLObject)search_engine.$sym640$CYCL_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 57435L)
    public static SubLObject new_cycl_query(final SubLObject formula, SubLObject knowledge_sources, SubLObject v_properties) {
        if (knowledge_sources == search_engine.UNPROVIDED) {
            knowledge_sources = (SubLObject)search_engine.$list646;
        }
        if (v_properties == search_engine.UNPROVIDED) {
            v_properties = (SubLObject)search_engine.$list647;
        }
        assert search_engine.NIL != el_utilities.el_formula_p(formula) : formula;
        assert search_engine.NIL != Types.listp(knowledge_sources) : knowledge_sources;
        assert search_engine.NIL != Types.listp(v_properties) : v_properties;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym640$CYCL_QUERY);
        set_knowledge_source_query_query(query, formula);
        set_cycl_query_knowledge_sources(query, knowledge_sources);
        set_cycl_query_properties(query, v_properties);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58003L)
    public static SubLObject cycl_query_equal_p(final SubLObject obj1, final SubLObject obj2) {
        assert search_engine.NIL != cycl_query_p(obj1) : obj1;
        assert search_engine.NIL != cycl_query_p(obj2) : obj2;
        return Equality.equalp(instances.get_slot(obj1, (SubLObject)search_engine.$sym109$QUERY), instances.get_slot(obj2, (SubLObject)search_engine.$sym109$QUERY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58182L)
    public static SubLObject cycl_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = (SubLObject)search_engine.NIL;
        final SubLObject knowledge_sources = get_cycl_query_knowledge_sources(self);
        try {
            thread.throwStack.push(search_engine.$sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                SubLObject assignments = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var = knowledge_sources;
                SubLObject ks = (SubLObject)search_engine.NIL;
                ks = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    if (search_engine.NIL != fort_types_interface.mtP(ks)) {
                        assignments = ConsesLow.append(assignments, methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym652$GET_FROM_KB, ks));
                    }
                    else if (search_engine.NIL != corpus_p(ks)) {
                        assignments = ConsesLow.append(assignments, methods.funcall_instance_method_with_1_args(self, (SubLObject)search_engine.$sym653$GET_FROM_CORPUS, ks));
                    }
                    else {
                        Errors.error((SubLObject)search_engine.$str654$Unknown_knowledge_source__a, ks);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    ks = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_query_knowledge_sources(self, knowledge_sources);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58631L)
    public static SubLObject corpus_p(final SubLObject v_object) {
        return Types.stringp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58690L)
    public static SubLObject cycl_query_get_from_kb_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = (SubLObject)search_engine.NIL;
        final SubLObject v_properties = get_cycl_query_properties(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                final SubLObject answers = inference_kernel.new_cyc_query(query, mt, v_properties);
                SubLObject assignments = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = (SubLObject)search_engine.NIL;
                v_answer = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    assignments = (SubLObject)ConsesLow.cons(new_var_assignment(v_answer.first(), conses_high.second(v_answer)), assignments);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_query_properties(self, v_properties);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 59092L)
    public static SubLObject cycl_query_get_from_corpus_method(final SubLObject self, final SubLObject corpus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = (SubLObject)search_engine.NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                final SubLObject paraphrase = pph_question.generate_question(query, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                final SubLObject v_question = (SubLObject)((search_engine.NIL != paraphrase) ? question.new_question(paraphrase, (SubLObject)ConsesLow.list(corpus), (SubLObject)search_engine.UNPROVIDED) : search_engine.NIL);
                final SubLObject tmp_mt = new_tmp_mt((SubLObject)search_engine.UNPROVIDED);
                SubLObject assignments = (SubLObject)search_engine.NIL;
                if (search_engine.NIL != v_question) {
                    print_high.princ(v_question, (SubLObject)search_engine.UNPROVIDED);
                    streams_high.terpri((SubLObject)search_engine.UNPROVIDED);
                    SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(v_question, (SubLObject)search_engine.$sym112$ANSWER).first());
                    SubLObject v_answer = (SubLObject)search_engine.NIL;
                    v_answer = cdolist_list_var.first();
                    while (search_engine.NIL != cdolist_list_var) {
                        print_high.princ(v_answer, (SubLObject)search_engine.UNPROVIDED);
                        streams_high.terpri((SubLObject)search_engine.UNPROVIDED);
                        assignments = ConsesLow.append(methods.funcall_instance_method_with_2_args(self, (SubLObject)search_engine.$sym663$GENERATE_ASSIGNMENTS, v_answer, tmp_mt), assignments);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_answer = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 59716L)
    public static SubLObject cycl_query_generate_assignments_method(final SubLObject self, final SubLObject v_answer, final SubLObject tmp_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = (SubLObject)search_engine.NIL;
        final SubLObject v_properties = get_cycl_query_properties(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                assert search_engine.NIL != answer.answer_p(v_answer) : v_answer;
                SubLObject assignments = (SubLObject)search_engine.NIL;
                SubLObject hyp_bindings = (SubLObject)search_engine.NIL;
                SubLObject cdolist_list_var = cyclifier.cyclify(methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)search_engine.$sym19$GET_CONTENT), (SubLObject)search_engine.UNPROVIDED);
                SubLObject cycl = (SubLObject)search_engine.NIL;
                cycl = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    hyp_bindings = (SubLObject)ConsesLow.cons(prove.fi_hypothesize_int(cycl, tmp_mt, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED), hyp_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    cycl = cdolist_list_var.first();
                }
                cdolist_list_var = inference_kernel.new_cyc_query(query, tmp_mt, v_properties);
                SubLObject binding = (SubLObject)search_engine.NIL;
                binding = cdolist_list_var.first();
                while (search_engine.NIL != cdolist_list_var) {
                    assignments = (SubLObject)ConsesLow.cons(new_var_assignment(binding.first(), (SubLObject)ConsesLow.list(conses_high.second(binding), v_answer)), assignments);
                    cdolist_list_var = cdolist_list_var.rest();
                    binding = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_cycl_query_properties(self, v_properties);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60346L)
    public static SubLObject new_tmp_mt(SubLObject super_mt) {
        if (super_mt == search_engine.UNPROVIDED) {
            super_mt = (SubLObject)search_engine.NIL;
        }
        if (search_engine.NIL != super_mt && !search_engine.assertionsDisabledInClass && search_engine.NIL == fort_types_interface.microtheory_p(super_mt)) {
            throw new AssertionError(super_mt);
        }
        final SubLObject spec_mt = fi.fi_create_int(print_high.princ_to_string(Symbols.gensym((SubLObject)search_engine.$str671$TEMP_MT_)), (SubLObject)search_engine.UNPROVIDED);
        fi.fi_assert_int((SubLObject)ConsesLow.listS(search_engine.$const672$isa, spec_mt, (SubLObject)search_engine.$list673), search_engine.$const674$UniversalVocabularyMt, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        if (search_engine.NIL != super_mt) {
            fi.fi_assert_int((SubLObject)ConsesLow.list(search_engine.$const675$genlMt, spec_mt, super_mt), search_engine.$const674$UniversalVocabularyMt, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        }
        return spec_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject get_var_assignment_justification(final SubLObject var_assignment) {
        return classes.subloop_get_access_protected_instance_slot(var_assignment, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym678$JUSTIFICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject set_var_assignment_justification(final SubLObject var_assignment, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(var_assignment, value, (SubLObject)search_engine.TWO_INTEGER, (SubLObject)search_engine.$sym678$JUSTIFICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject get_var_assignment_bindings(final SubLObject var_assignment) {
        return classes.subloop_get_access_protected_instance_slot(var_assignment, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym679$BINDINGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject set_var_assignment_bindings(final SubLObject var_assignment, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(var_assignment, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym679$BINDINGS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject subloop_reserved_initialize_var_assignment_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject subloop_reserved_initialize_var_assignment_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym679$BINDINGS, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym678$JUSTIFICATION, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
    public static SubLObject var_assignment_p(final SubLObject var_assignment) {
        return classes.subloop_instanceof_class(var_assignment, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61101L)
    public static SubLObject new_var_assignment(final SubLObject v_bindings, SubLObject justification) {
        if (justification == search_engine.UNPROVIDED) {
            justification = (SubLObject)search_engine.NIL;
        }
        assert search_engine.NIL != bindings.bindings_p(v_bindings) : v_bindings;
        final SubLObject assignment = object.new_class_instance((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT);
        set_var_assignment_bindings(assignment, v_bindings);
        set_var_assignment_justification(assignment, justification);
        return assignment;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61408L)
    public static SubLObject var_assignment_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = (SubLObject)search_engine.NIL;
        final SubLObject v_bindings = get_var_assignment_bindings(self);
        try {
            thread.throwStack.push(search_engine.$sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                streams_high.write_string((SubLObject)search_engine.$str685$__CYC_ASSIGNMENT__, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                print_high.princ(v_bindings, stream);
                streams_high.write_string((SubLObject)search_engine.$str122$_, stream, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_var_assignment_bindings(self, v_bindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61659L)
    public static SubLObject var_assignment_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = (SubLObject)search_engine.NIL;
        final SubLObject v_bindings = get_var_assignment_bindings(self);
        try {
            thread.throwStack.push(search_engine.$sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, v_bindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_var_assignment_bindings(self, v_bindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61801L)
    public static SubLObject var_assignment_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = (SubLObject)search_engine.NIL;
        final SubLObject justification = get_var_assignment_justification(self);
        try {
            thread.throwStack.push(search_engine.$sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, justification);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_var_assignment_justification(self, justification);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
    public static SubLObject get_wordnet_query_pos(final SubLObject wordnet_query) {
        return classes.subloop_get_access_protected_instance_slot(wordnet_query, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym695$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
    public static SubLObject set_wordnet_query_pos(final SubLObject wordnet_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(wordnet_query, value, (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.$sym695$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
    public static SubLObject subloop_reserved_initialize_wordnet_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
    public static SubLObject subloop_reserved_initialize_wordnet_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym98$ERROR_HANDLING, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym97$TIMEOUT, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym109$QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$sym695$POS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
    public static SubLObject wordnet_query_p(final SubLObject wordnet_query) {
        return classes.subloop_instanceof_class(wordnet_query, (SubLObject)search_engine.$sym693$WORDNET_QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62130L)
    public static SubLObject new_wordnet_query(final SubLObject word, final SubLObject pos) {
        assert search_engine.NIL != Types.stringp(word) : word;
        assert search_engine.NIL != wordnet_pos_p(pos) : pos;
        final SubLObject query = object.new_class_instance((SubLObject)search_engine.$sym693$WORDNET_QUERY);
        set_knowledge_source_query_query(query, word);
        set_wordnet_query_pos(query, pos);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62530L)
    public static SubLObject wordnet_pos_p(final SubLObject string) {
        return conses_high.member(string, (SubLObject)search_engine.$list699, (SubLObject)search_engine.EQUALP, (SubLObject)search_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62723L)
    public static SubLObject wordnet_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wordnet_query_method = (SubLObject)search_engine.NIL;
        final SubLObject pos = get_wordnet_query_pos(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push(search_engine.$sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD);
            try {
                SubLObject glosses = (SubLObject)search_engine.NIL;
                final SubLObject word = wordnet_proxy.new_word_proxy(query, pos);
                if (search_engine.NIL != wordnet_proxy.word_proxy_p(word)) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(word, (SubLObject)search_engine.$sym703$SYNSETS);
                    SubLObject synset = (SubLObject)search_engine.NIL;
                    synset = cdolist_list_var.first();
                    while (search_engine.NIL != cdolist_list_var) {
                        glosses = (SubLObject)ConsesLow.cons(new_wordnet_gloss(instances.get_slot(synset, (SubLObject)search_engine.$sym702$GLOSS)), glosses);
                        cdolist_list_var = cdolist_list_var.rest();
                        synset = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD, glosses);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_wordnet_query_pos(self, pos);
                    set_knowledge_source_query_query(self, query);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wordnet_query_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wordnet_query_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
    public static SubLObject get_wordnet_gloss_gloss(final SubLObject wordnet_gloss) {
        return classes.subloop_get_access_protected_instance_slot(wordnet_gloss, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym702$GLOSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
    public static SubLObject set_wordnet_gloss_gloss(final SubLObject wordnet_gloss, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(wordnet_gloss, value, (SubLObject)search_engine.ONE_INTEGER, (SubLObject)search_engine.$sym702$GLOSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
    public static SubLObject subloop_reserved_initialize_wordnet_gloss_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym3$INSTANCE_COUNT, (SubLObject)search_engine.ZERO_INTEGER);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
    public static SubLObject subloop_reserved_initialize_wordnet_gloss_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym5$ISOLATED_P, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.$sym6$INSTANCE_NUMBER, (SubLObject)search_engine.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym702$GLOSS, (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
    public static SubLObject wordnet_gloss_p(final SubLObject wordnet_gloss) {
        return classes.subloop_instanceof_class(wordnet_gloss, (SubLObject)search_engine.$sym705$WORDNET_GLOSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63354L)
    public static SubLObject new_wordnet_gloss(final SubLObject string) {
        final SubLObject gloss = object.new_class_instance((SubLObject)search_engine.$sym705$WORDNET_GLOSS);
        set_wordnet_gloss_gloss(gloss, string);
        return gloss;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63570L)
    public static SubLObject wordnet_gloss_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wordnet_gloss_method = (SubLObject)search_engine.NIL;
        final SubLObject gloss = get_wordnet_gloss_gloss(self);
        try {
            thread.throwStack.push(search_engine.$sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)search_engine.$sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD, gloss);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)search_engine.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_wordnet_gloss_gloss(self, gloss);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_wordnet_gloss_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wordnet_gloss_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63710L)
    public static SubLObject wordnet_gloss_get_source_method(final SubLObject self) {
        return (SubLObject)search_engine.$str713$Wordnet_1_7_1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63904L)
    public static SubLObject strip_passage_header(final SubLObject string) {
        final SubLObject position = Sequences.position((SubLObject)Characters.CHAR_underbar, string, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        return (search_engine.NIL != position) ? string_utilities.strip_first_n(string, number_utilities.f_1X(position)) : string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 64158L)
    public static SubLObject passage_similarity(final SubLObject passage1, final SubLObject passage2) {
        assert search_engine.NIL != abstract_passage_p(passage1) : passage1;
        assert search_engine.NIL != abstract_passage_p(passage2) : passage2;
        return methods.funcall_class_method_with_2_args((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym21$SIMILARITY, passage1, passage2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 64584L)
    public static SubLObject augment_search_string(final SubLObject word_string, SubLObject num) {
        if (num == search_engine.UNPROVIDED) {
            num = (SubLObject)search_engine.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = lexicon_accessors.denots_of_string(word_string, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        SubLObject auxiliary_forts = (SubLObject)search_engine.NIL;
        SubLObject auxiliary_terms = (SubLObject)search_engine.NIL;
        final SubLObject ass_count = assertion_handles.assertion_count();
        SubLObject cdolist_list_var = denots;
        SubLObject denot = (SubLObject)search_engine.NIL;
        denot = cdolist_list_var.first();
        while (search_engine.NIL != cdolist_list_var) {
            if (search_engine.NIL != isa.isa_in_any_mtP(denot, search_engine.$const715$Collection)) {
                SubLObject cdolist_list_var_$11 = kb_mapping.gather_index_in_any_mt(denot, (SubLObject)search_engine.T);
                SubLObject assertion = (SubLObject)search_engine.NIL;
                assertion = cdolist_list_var_$11.first();
                while (search_engine.NIL != cdolist_list_var_$11) {
                    final SubLObject ass_forts = assertions_high.assertion_forts(assertion, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                    if (search_engine.NIL == subl_promotions.memberP(search_engine.$const716$TheList, ass_forts, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED) && search_engine.NIL == conses_high.member(search_engine.$const717$disjointWith, ass_forts, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)) {
                        SubLObject cdolist_list_var_$12 = ass_forts;
                        SubLObject fort = (SubLObject)search_engine.NIL;
                        fort = cdolist_list_var_$12.first();
                        while (search_engine.NIL != cdolist_list_var_$12) {
                            if (search_engine.NIL != isa.isa_in_any_mtP(fort, search_engine.$const715$Collection) && search_engine.NIL == subl_promotions.memberP(fort, auxiliary_forts, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED)) {
                                final SubLObject idf_score = Numbers.divide(ass_count, kb_indexing.num_index(fort));
                                SubLObject generation = (SubLObject)search_engine.NIL;
                                auxiliary_forts = (SubLObject)ConsesLow.cons(fort, auxiliary_forts);
                                final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_demerit_cutoff$.bind((SubLObject)search_engine.ZERO_INTEGER, thread);
                                    generation = pph_main.generate_phrase(fort, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                                }
                                finally {
                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                                }
                                if (idf_score.numL((SubLObject)search_engine.$int718$200000) && idf_score.numG((SubLObject)search_engine.$int719$5000) && generation.isString()) {
                                    final SubLObject item_var = (SubLObject)ConsesLow.list(idf_score, generation, assertion);
                                    if (search_engine.NIL == conses_high.member(item_var, auxiliary_terms, Symbols.symbol_function((SubLObject)search_engine.EQL), Symbols.symbol_function((SubLObject)search_engine.IDENTITY))) {
                                        auxiliary_terms = (SubLObject)ConsesLow.cons(item_var, auxiliary_terms);
                                    }
                                }
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            fort = cdolist_list_var_$12.first();
                        }
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    assertion = cdolist_list_var_$11.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        return list_utilities.first_n(num, Mapping.mapcar((SubLObject)search_engine.$sym720$SECOND, Sort.sort(auxiliary_terms, (SubLObject)search_engine.$sym721$_, (SubLObject)search_engine.$sym478$FIRST)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66141L)
    public static SubLObject current_google_api_method_invocation_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return search_engine.$google_api_method_invocation_count$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66250L)
    public static SubLObject update_google_api_method_invocation_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (search_engine.$google_api_method_invocation_count$.getDynamicValue(thread).isFixnum()) {
            search_engine.$google_api_method_invocation_count$.setDynamicValue(Numbers.add(search_engine.$google_api_method_invocation_count$.getDynamicValue(thread), (SubLObject)search_engine.ONE_INTEGER), thread);
        }
        return search_engine.$google_api_method_invocation_count$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66463L)
    public static SubLObject with_google_api_method_invocation_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search_engine.$list722);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject final_count = (SubLObject)search_engine.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)search_engine.$list722);
        final_count = current.first();
        current = current.rest();
        if (search_engine.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)search_engine.$sym723$CLET, (SubLObject)search_engine.$list724, reader.bq_cons((SubLObject)search_engine.$sym725$PROGN, ConsesLow.append(body, (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.listS((SubLObject)search_engine.$sym726$CSETF, final_count, (SubLObject)search_engine.$list727));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)search_engine.$list722);
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66828L)
    public static SubLObject google_frequencies(final SubLObject string) {
        final SubLObject v_forts = lexicon_accessors.denots_of_string(string, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        SubLObject result = (SubLObject)search_engine.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)search_engine.NIL;
        fort = cdolist_list_var.first();
        while (search_engine.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = pph_methods_lexicon.all_phrases_for_term(fort, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
            SubLObject generation = (SubLObject)search_engine.NIL;
            generation = cdolist_list_var_$13.first();
            while (search_engine.NIL != cdolist_list_var_$13) {
                final SubLObject google_query = new_google_query(generation, get_google_key(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
                final SubLObject count = methods.funcall_instance_method_with_0_args(google_query, (SubLObject)search_engine.$sym288$COUNT);
                if (count == search_engine.$kw448$IO_ERROR) {
                    return (SubLObject)search_engine.NIL;
                }
                update_google_api_method_invocation_count();
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fort, generation, count), result);
                Errors.warn((SubLObject)search_engine.$str728$_S__, (SubLObject)ConsesLow.list(fort, generation, count));
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                generation = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return Sort.stable_sort(Sort.sort(result, (SubLObject)search_engine.$sym729$_, (SubLObject)search_engine.$sym730$THIRD), (SubLObject)search_engine.$sym731$FORT__, (SubLObject)search_engine.$sym478$FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67400L)
    public static SubLObject google_search(final SubLObject string, SubLObject start, SubLObject hits) {
        if (start == search_engine.UNPROVIDED) {
            start = (SubLObject)search_engine.ONE_INTEGER;
        }
        if (hits == search_engine.UNPROVIDED) {
            hits = (SubLObject)search_engine.TEN_INTEGER;
        }
        final SubLObject google_query = new_google_query(string, get_google_key(), hits, (SubLObject)search_engine.$int228$50, start);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, (SubLObject)search_engine.$sym76$GET);
        if (search_engine.NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67712L)
    public static SubLObject google_count(final SubLObject string) {
        final SubLObject google_query = new_google_query(string, get_google_key(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, (SubLObject)search_engine.$sym288$COUNT);
        if (search_engine.NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67980L)
    public static SubLObject google_status() {
        final SubLObject google_query = new_google_query((SubLObject)search_engine.$str355$, get_google_key(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, (SubLObject)search_engine.$sym300$VERSION);
        if (search_engine.NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68241L)
    public static SubLObject google_spelling(final SubLObject string) {
        final SubLObject google_query = new_google_query(string, get_google_key(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, (SubLObject)search_engine.$sym296$SPELLING);
        if (search_engine.NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68517L)
    public static SubLObject google_server_aliveP() {
        return list_utilities.property_list_p(google_status());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68603L)
    public static SubLObject google_license_count() {
        final SubLObject status = google_status();
        if (search_engine.NIL != list_utilities.property_list_p(status)) {
            return conses_high.getf(status, (SubLObject)search_engine.$kw732$LICENSE_USE, (SubLObject)search_engine.UNPROVIDED);
        }
        return (SubLObject)search_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68759L)
    public static SubLObject google_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = new_google_query((SubLObject)search_engine.$str355$, get_google_key(), (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED, (SubLObject)search_engine.UNPROVIDED);
        SubLObject ignore_errors_tag = (SubLObject)search_engine.NIL;
        try {
            thread.throwStack.push(search_engine.$kw733$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)search_engine.$sym734$IGNORE_ERRORS_HANDLER), thread);
                try {
                    methods.funcall_instance_method_with_0_args(query, (SubLObject)search_engine.$sym292$QUIT);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)search_engine.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)search_engine.$kw733$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)search_engine.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68906L)
    public static SubLObject google_error_tokenP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isKeyword() && (search_engine.$kw317$ERROR == v_object || search_engine.$kw471$SERVER_ERROR == v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 69071L)
    public static SubLObject google_search_url(final SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == search_engine.UNPROVIDED) {
            start = (SubLObject)search_engine.ONE_INTEGER;
        }
        if (hits == search_engine.UNPROVIDED) {
            hits = (SubLObject)search_engine.TEN_INTEGER;
        }
        return PrintLow.format((SubLObject)search_engine.NIL, (SubLObject)search_engine.$str735$http___www_google_com_search_q__A, new SubLObject[] { web_utilities.html_url_encode(search_string, (SubLObject)search_engine.UNPROVIDED), Numbers.subtract(start, (SubLObject)search_engine.ONE_INTEGER), hits });
    }
    
    public static SubLObject declare_search_engine_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_information_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_information_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "information_p", "INFORMATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "information_get_source_method", "INFORMATION-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_abstract_passage_vector", "GET-ABSTRACT-PASSAGE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_abstract_passage_vector", "SET-ABSTRACT-PASSAGE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_abstract_passage_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_abstract_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_p", "ABSTRACT-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_equal_method", "ABSTRACT-PASSAGE-EQUAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_similarity_method", "ABSTRACT-PASSAGE-SIMILARITY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_get_dates_method", "ABSTRACT-PASSAGE-GET-DATES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_older_method", "ABSTRACT-PASSAGE-OLDER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guess_year", "GUESS-YEAR", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_get_publication_date_method", "ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "passage_equal", "PASSAGE-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_simple_passage_text", "GET-SIMPLE-PASSAGE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_simple_passage_text", "SET-SIMPLE-PASSAGE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_simple_passage_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_simple_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "simple_passage_p", "SIMPLE-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_simple_passage", "NEW-SIMPLE-PASSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "simple_passage_print_method", "SIMPLE-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "simple_passage_get_content_method", "SIMPLE-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_corpus_passage_text", "GET-CORPUS-PASSAGE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_corpus_passage_text", "SET-CORPUS-PASSAGE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_corpus_passage_corpus", "GET-CORPUS-PASSAGE-CORPUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_corpus_passage_corpus", "SET-CORPUS-PASSAGE-CORPUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_corpus_passage_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_corpus_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_p", "CORPUS-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_get_corpus_method", "CORPUS-PASSAGE-GET-CORPUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "abstract_passage_get_vector_method", "ABSTRACT-PASSAGE-GET-VECTOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_get_content_method", "CORPUS-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_identify_entities_method", "CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_max_instances_method", "CORPUS-PASSAGE-MAX-INSTANCES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_passage_get_parse_trees_method", "CORPUS-PASSAGE-GET-PARSE-TREES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_information_request_timeout", "GET-INFORMATION-REQUEST-TIMEOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_information_request_timeout", "SET-INFORMATION-REQUEST-TIMEOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_information_request_error_handling", "GET-INFORMATION-REQUEST-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_information_request_error_handling", "SET-INFORMATION-REQUEST-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_information_request_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_information_request_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "information_request_p", "INFORMATION-REQUEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "information_request_initialize_method", "INFORMATION-REQUEST-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_knowledge_source_query_query", "GET-KNOWLEDGE-SOURCE-QUERY-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_knowledge_source_query_query", "SET-KNOWLEDGE-SOURCE-QUERY-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_knowledge_source_query_class", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_knowledge_source_query_instance", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "knowledge_source_query_p", "KNOWLEDGE-SOURCE-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "knowledge_source_query_answer_method", "KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "knowledge_source_query_print_method", "KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "knowledge_source_query_handle_error_method", "KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_corpus_query_corpus", "GET-CORPUS-QUERY-CORPUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_corpus_query_corpus", "SET-CORPUS-QUERY-CORPUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_corpus_query_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_corpus_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_query_p", "CORPUS-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_query_get_corpus_path_mapping_method", "CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_query_get_corpus_method", "CORPUS-QUERY-GET-CORPUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_query_get_corpus_path_method", "CORPUS-QUERY-GET-CORPUS-PATH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_query_print_method", "CORPUS-QUERY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_glimpse_query_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_glimpse_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_query_p", "GLIMPSE-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_glimpse_query", "NEW-GLIMPSE-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_query_get_corpus_path_mapping_method", "GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_query_get_method", "GLIMPSE-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "ask_glimpse", "ASK-GLIMPSE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_glimpse_passage_line", "GET-GLIMPSE-PASSAGE-LINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_glimpse_passage_line", "SET-GLIMPSE-PASSAGE-LINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_glimpse_passage_article", "GET-GLIMPSE-PASSAGE-ARTICLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_glimpse_passage_article", "SET-GLIMPSE-PASSAGE-ARTICLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_glimpse_passage_file", "GET-GLIMPSE-PASSAGE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_glimpse_passage_file", "SET-GLIMPSE-PASSAGE-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_glimpse_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_glimpse_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_passage_p", "GLIMPSE-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_glimpse_passage", "NEW-GLIMPSE-PASSAGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_passage_print_method", "GLIMPSE-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_passage_get_publication_date_method", "GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "glimpse_passage_get_source_method", "GLIMPSE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_guruqa_query_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_guruqa_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_query_p", "GURUQA-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_guruqa_query", "NEW-GURUQA-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_query_get_method", "GURUQA-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_guruqa_passage_error_handling", "GET-GURUQA-PASSAGE-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_guruqa_passage_error_handling", "SET-GURUQA-PASSAGE-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_guruqa_passage_span", "GET-GURUQA-PASSAGE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_guruqa_passage_span", "SET-GURUQA-PASSAGE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_guruqa_passage_sentence_id", "GET-GURUQA-PASSAGE-SENTENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_guruqa_passage_sentence_id", "SET-GURUQA-PASSAGE-SENTENCE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_guruqa_passage_document_id", "GET-GURUQA-PASSAGE-DOCUMENT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_guruqa_passage_document_id", "SET-GURUQA-PASSAGE-DOCUMENT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_guruqa_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_guruqa_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_passage_p", "GURUQA-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_guruqa_passage", "NEW-GURUQA-PASSAGE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_passage_print_method", "GURUQA-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_passage_get_source_method", "GURUQA-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_passage_get_content_method", "GURUQA-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "guruqa_passage_handle_error_method", "GURUQA-PASSAGE-HANDLE-ERROR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lemur_query_sentno", "GET-LEMUR-QUERY-SENTNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lemur_query_sentno", "SET-LEMUR-QUERY-SENTNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lemur_query_docno", "GET-LEMUR-QUERY-DOCNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lemur_query_docno", "SET-LEMUR-QUERY-DOCNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lemur_query_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lemur_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_query_p", "LEMUR-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_lemur_query", "NEW-LEMUR-QUERY", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_query_get_corpus_path_mapping_method", "LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_query_get_method", "LEMUR-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "ask_lemur", "ASK-LEMUR", 1, 9, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lemur_passage_score", "GET-LEMUR-PASSAGE-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lemur_passage_score", "SET-LEMUR-PASSAGE-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lemur_passage_sentence_number", "GET-LEMUR-PASSAGE-SENTENCE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lemur_passage_sentence_number", "SET-LEMUR-PASSAGE-SENTENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lemur_passage_doc_id", "GET-LEMUR-PASSAGE-DOC-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lemur_passage_doc_id", "SET-LEMUR-PASSAGE-DOC-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lemur_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lemur_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_passage_p", "LEMUR-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_lemur_passage", "NEW-LEMUR-PASSAGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_passage_print_method", "LEMUR-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_passage_get_source_method", "LEMUR-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_passage_get_publication_date_method", "LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lemur_passage_get_score_method", "LEMUR-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_qaga_query_augmentation_terms", "GET-QAGA-QUERY-AUGMENTATION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_qaga_query_augmentation_terms", "SET-QAGA-QUERY-AUGMENTATION-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_qaga_query_class", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_qaga_query_instance", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "qaga_query_p", "QAGA-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_qaga_query", "NEW-QAGA-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "qaga_query_get_method", "QAGA-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "qaga_query_get_augmentation_terms_method", "QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_query_google_key", "GET-GOOGLE-QUERY-GOOGLE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_query_google_key", "SET-GOOGLE-QUERY-GOOGLE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_query_start", "GET-GOOGLE-QUERY-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_query_start", "SET-GOOGLE-QUERY-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_query_docno", "GET-GOOGLE-QUERY-DOCNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_query_docno", "SET-GOOGLE-QUERY-DOCNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_query_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_p", "GOOGLE-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_google_query", "NEW-GOOGLE-QUERY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_get_method", "GOOGLE-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_count_method", "GOOGLE-QUERY-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_quit_method", "GOOGLE-QUERY-QUIT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_spelling_method", "GOOGLE-QUERY-SPELLING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_query_version_method", "GOOGLE-QUERY-VERSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_key", "GET-GOOGLE-KEY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "seed_google_client", "SEED-GOOGLE-CLIENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client", "GET-GOOGLE-CLIENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_client_interaction", "GET-GOOGLE-CLIENT-CLIENT-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_client_interaction", "SET-GOOGLE-CLIENT-CLIENT-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_client_key", "GET-GOOGLE-CLIENT-CLIENT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_client_key", "SET-GOOGLE-CLIENT-CLIENT-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_client_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_client_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_p", "GOOGLE-CLIENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_initialize_method", "GOOGLE-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_set_client_key_method", "GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_search_method", "GOOGLE-CLIENT-SEARCH-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_count_method", "GOOGLE-CLIENT-COUNT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_spelling_method", "GOOGLE-CLIENT-SPELLING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_quit_method", "GOOGLE-CLIENT-QUIT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_version_method", "GOOGLE-CLIENT-VERSION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_build_basic_google_request_method", "GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_get_answer_from_request_method", "GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_google_request_method", "GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_google_io_error", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_google_io_error", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_google_version", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_google_version", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_google_spelling", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_google_spelling", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_google_count", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_google_count", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_google_passages", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_google_passages", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_start", "GET-GOOGLE-CLIENT-INTERACTION-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_start", "SET-GOOGLE-CLIENT-INTERACTION-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_docno", "GET-GOOGLE-CLIENT-INTERACTION-DOCNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_docno", "SET-GOOGLE-CLIENT-INTERACTION-DOCNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_directive_arg", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_directive_arg", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_directive", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_directive", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_client_key", "GET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_client_key", "SET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_total_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_total_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_rank_keyword", "GET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_rank_keyword", "SET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_offset_in_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_offset_in_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_offset_in_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_offset_in_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_title_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_title_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_url_keyword", "GET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_url_keyword", "SET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_content_keyword", "GET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_content_keyword", "SET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_language_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_language_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_key_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_key_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_start_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_start_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_count_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_count_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_type_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_type_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_query_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_query_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_subl_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_subl_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_version_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_version_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_quit_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_quit_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_spell_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_spell_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_count_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_count_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_client_interaction_search_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_client_interaction_search_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_p", "GOOGLE-CLIENT-INTERACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_initialize_method", "GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_set_key_method", "GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_set_directive_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_set_docno_method", "GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_set_start_method", "GOOGLE-CLIENT-INTERACTION-SET-START-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_get_io_error_flag_method", "GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_build_answer_method", "GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_get_directive_method", "GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_set_directive_arg_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_request_string_method", "GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_get_answer_method", "GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_client_interaction_get_google_passages_method", "GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_list_p", "GOOGLE-PASSAGE-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_list_acceptable_p_method", "GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_list_add_method", "GOOGLE-PASSAGE-LIST-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_parse_trees", "GET-GOOGLE-PASSAGE-PARSE-TREES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_parse_trees", "SET-GOOGLE-PASSAGE-PARSE-TREES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_total", "GET-GOOGLE-PASSAGE-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_total", "SET-GOOGLE-PASSAGE-TOTAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_offset_in_text", "GET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_offset_in_text", "SET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_offset_in_snippet", "GET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_offset_in_snippet", "SET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_snippet", "GET-GOOGLE-PASSAGE-SNIPPET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_snippet", "SET-GOOGLE-PASSAGE-SNIPPET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_title", "GET-GOOGLE-PASSAGE-TITLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_title", "SET-GOOGLE-PASSAGE-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_url", "GET-GOOGLE-PASSAGE-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_url", "SET-GOOGLE-PASSAGE-URL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_google_passage_rank", "GET-GOOGLE-PASSAGE-RANK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_google_passage_rank", "SET-GOOGLE-PASSAGE-RANK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_google_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_p", "GOOGLE-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_google_passage", "NEW-GOOGLE-PASSAGE", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_source_method", "GOOGLE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_score_method", "GOOGLE-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_is_complete_method", "GOOGLE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_offset_in_full_text_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_offset_in_snippet_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_url_method", "GOOGLE-PASSAGE-GET-URL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_title_method", "GOOGLE-PASSAGE-GET-TITLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_cached_file_id_method", "GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_full_text_method", "GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_snippet_method", "GOOGLE-PASSAGE-GET-SNIPPET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_rank_method", "GOOGLE-PASSAGE-GET-RANK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_total_for_rank_method", "GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_rank_and_total_method", "GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_print_method", "GOOGLE-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_passage_get_publication_date_method", "GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_query_sentno", "GET-LUCENE-QUERY-SENTNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_query_sentno", "SET-LUCENE-QUERY-SENTNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_query_docno", "GET-LUCENE-QUERY-DOCNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_query_docno", "SET-LUCENE-QUERY-DOCNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_query_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_query_p", "LUCENE-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_lucene_query", "NEW-LUCENE-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_query_get_method", "LUCENE-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "seed_lucene_client", "SEED-LUCENE-CLIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client", "GET-LUCENE-CLIENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_client_interaction", "GET-LUCENE-CLIENT-CLIENT-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_client_interaction", "SET-LUCENE-CLIENT-CLIENT-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_client_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_client_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_p", "LUCENE-CLIENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_initialize_method", "LUCENE-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_search_method", "LUCENE-CLIENT-SEARCH-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_count_method", "LUCENE-CLIENT-COUNT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_lucene_request_method", "LUCENE-CLIENT-LUCENE-REQUEST-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_lucene_count", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_lucene_count", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_lucene_passages", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_lucene_passages", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_directive_arg", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_directive_arg", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_directive", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_directive", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_docno", "GET-LUCENE-CLIENT-INTERACTION-DOCNO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_docno", "SET-LUCENE-CLIENT-INTERACTION-DOCNO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_content_keyword", "GET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_content_keyword", "SET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_id_keyword", "GET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_id_keyword", "SET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_query_language_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_query_language_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_query_count_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_query_count_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_query_type_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_query_type_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_query_tag", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_query_tag", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_subl_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_subl_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_count_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_count_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_client_interaction_search_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_client_interaction_search_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_p", "LUCENE-CLIENT-INTERACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_initialize_method", "LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_set_directive_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_build_answer_method", "LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_get_directive_method", "LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_set_directive_arg_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_set_docno_method", "LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_request_string_method", "LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_get_answer_method", "LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_client_interaction_get_lucene_passages_method", "LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_list_p", "LUCENE-PASSAGE-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_list_acceptable_p_method", "LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_list_add_method", "LUCENE-PASSAGE-LIST-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_passage_parse_trees", "GET-LUCENE-PASSAGE-PARSE-TREES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_passage_parse_trees", "SET-LUCENE-PASSAGE-PARSE-TREES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_passage_id", "GET-LUCENE-PASSAGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_passage_id", "SET-LUCENE-PASSAGE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_lucene_passage_rank", "GET-LUCENE-PASSAGE-RANK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_lucene_passage_rank", "SET-LUCENE-PASSAGE-RANK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_lucene_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_p", "LUCENE-PASSAGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_lucene_passage", "NEW-LUCENE-PASSAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_get_source_method", "LUCENE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_get_score_method", "LUCENE-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_is_complete_method", "LUCENE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_print_method", "LUCENE-PASSAGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "lucene_passage_get_publication_date_method", "LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_cycl_query_properties", "GET-CYCL-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_cycl_query_properties", "SET-CYCL-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_cycl_query_knowledge_sources", "GET-CYCL-QUERY-KNOWLEDGE-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_cycl_query_knowledge_sources", "SET-CYCL-QUERY-KNOWLEDGE-SOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_cycl_query_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_cycl_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_p", "CYCL-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_cycl_query", "NEW-CYCL-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_equal_p", "CYCL-QUERY-EQUAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_get_method", "CYCL-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "corpus_p", "CORPUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_get_from_kb_method", "CYCL-QUERY-GET-FROM-KB-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_get_from_corpus_method", "CYCL-QUERY-GET-FROM-CORPUS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "cycl_query_generate_assignments_method", "CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_tmp_mt", "NEW-TMP-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_var_assignment_justification", "GET-VAR-ASSIGNMENT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_var_assignment_justification", "SET-VAR-ASSIGNMENT-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_var_assignment_bindings", "GET-VAR-ASSIGNMENT-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_var_assignment_bindings", "SET-VAR-ASSIGNMENT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_var_assignment_class", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_var_assignment_instance", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "var_assignment_p", "VAR-ASSIGNMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_var_assignment", "NEW-VAR-ASSIGNMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "var_assignment_print_method", "VAR-ASSIGNMENT-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "var_assignment_get_content_method", "VAR-ASSIGNMENT-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "var_assignment_get_source_method", "VAR-ASSIGNMENT-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_wordnet_query_pos", "GET-WORDNET-QUERY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_wordnet_query_pos", "SET-WORDNET-QUERY-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_wordnet_query_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_wordnet_query_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_query_p", "WORDNET-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_wordnet_query", "NEW-WORDNET-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_pos_p", "WORDNET-POS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_query_get_method", "WORDNET-QUERY-GET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "get_wordnet_gloss_gloss", "GET-WORDNET-GLOSS-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "set_wordnet_gloss_gloss", "SET-WORDNET-GLOSS-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_wordnet_gloss_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "subloop_reserved_initialize_wordnet_gloss_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_gloss_p", "WORDNET-GLOSS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "new_wordnet_gloss", "NEW-WORDNET-GLOSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_gloss_get_content_method", "WORDNET-GLOSS-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "wordnet_gloss_get_source_method", "WORDNET-GLOSS-GET-SOURCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "strip_passage_header", "STRIP-PASSAGE-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "passage_similarity", "PASSAGE-SIMILARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "augment_search_string", "AUGMENT-SEARCH-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "current_google_api_method_invocation_count", "CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "update_google_api_method_invocation_count", "UPDATE-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.quirk.search_engine", "with_google_api_method_invocation_tracking", "WITH-GOOGLE-API-METHOD-INVOCATION-TRACKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_frequencies", "GOOGLE-FREQUENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_search", "GOOGLE-SEARCH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_count", "GOOGLE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_status", "GOOGLE-STATUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_spelling", "GOOGLE-SPELLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_server_aliveP", "GOOGLE-SERVER-ALIVE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_license_count", "GOOGLE-LICENSE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_quit", "GOOGLE-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_error_tokenP", "GOOGLE-ERROR-TOKEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.search_engine", "google_search_url", "GOOGLE-SEARCH-URL", 1, 2, false);
        return (SubLObject)search_engine.NIL;
    }
    
    public static SubLObject init_search_engine_file() {
        search_engine.$default_corpus$ = SubLFiles.defparameter("*DEFAULT-CORPUS*", (SubLObject)search_engine.$str129$CNSjan2004);
        search_engine.$world_wide_web_corpus$ = SubLFiles.defparameter("*WORLD-WIDE-WEB-CORPUS*", (SubLObject)search_engine.$str277$WWW);
        search_engine.$authorized_google_key$ = SubLFiles.defvar("*AUTHORIZED-GOOGLE-KEY*", (SubLObject)search_engine.NIL);
        search_engine.$google_client_key_file$ = SubLFiles.defparameter("*GOOGLE-CLIENT-KEY-FILE*", red_infrastructure_macros.red_def_helper((SubLObject)(search_engine.$list304.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$list304) : search_engine.$list304), (SubLObject)search_engine.$sym305$_GOOGLE_CLIENT_KEY_FILE_, (SubLObject)(search_engine.$str306$data_googlekey_txt.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$str306$data_googlekey_txt) : search_engine.$str306$data_googlekey_txt), (SubLObject)search_engine.$kw307$PARAMETER, (SubLObject)search_engine.UNPROVIDED));
        search_engine.$google_client_host$ = SubLFiles.defparameter("*GOOGLE-CLIENT-HOST*", red_infrastructure_macros.red_def_helper((SubLObject)(search_engine.$list308.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$list308) : search_engine.$list308), (SubLObject)search_engine.$sym309$_GOOGLE_CLIENT_HOST_, (SubLObject)(search_engine.$str310$googleserver_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$str310$googleserver_cyc_com) : search_engine.$str310$googleserver_cyc_com), (SubLObject)search_engine.$kw307$PARAMETER, (SubLObject)search_engine.UNPROVIDED));
        search_engine.$google_client_port$ = SubLFiles.defparameter("*GOOGLE-CLIENT-PORT*", red_infrastructure_macros.red_def_helper((SubLObject)(search_engine.$list311.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$list311) : search_engine.$list311), (SubLObject)search_engine.$sym312$_GOOGLE_CLIENT_PORT_, (SubLObject)(search_engine.$int313$6667.isSymbol() ? Symbols.symbol_value((SubLObject)search_engine.$int313$6667) : search_engine.$int313$6667), (SubLObject)search_engine.$kw307$PARAMETER, (SubLObject)search_engine.UNPROVIDED));
        search_engine.$google_client$ = SubLFiles.defparameter("*GOOGLE-CLIENT*", (SubLObject)search_engine.NIL);
        search_engine.$wikipedia$ = SubLFiles.defparameter("*WIKIPEDIA*", (SubLObject)search_engine.$str558$Wikipedia);
        search_engine.$lucene_client_host$ = SubLFiles.defvar("*LUCENE-CLIENT-HOST*", (SubLObject)search_engine.NIL);
        search_engine.$lucene_client_port$ = SubLFiles.defvar("*LUCENE-CLIENT-PORT*", (SubLObject)search_engine.NIL);
        search_engine.$lucene_client$ = SubLFiles.defvar("*LUCENE-CLIENT*", (SubLObject)search_engine.NIL);
        search_engine.$google_api_method_invocation_count$ = SubLFiles.defparameter("*GOOGLE-API-METHOD-INVOCATION-COUNT*", (SubLObject)search_engine.NIL);
        return (SubLObject)search_engine.NIL;
    }
    
    public static SubLObject setup_search_engine_file() {
        classes.subloop_new_class((SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.T, (SubLObject)search_engine.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.$sym4$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.$sym7$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE);
        subloop_reserved_initialize_information_class((SubLObject)search_engine.$sym0$INFORMATION);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list10);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym11$INFORMATION_GET_SOURCE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.NIL, (SubLObject)search_engine.T, (SubLObject)search_engine.$list13);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym15$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym16$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE);
        subloop_reserved_initialize_abstract_passage_class((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.EQUAL, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list18);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.EQUAL, (SubLObject)search_engine.$sym20$ABSTRACT_PASSAGE_EQUAL_METHOD);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym21$SIMILARITY, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list22, (SubLObject)search_engine.$list23);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym21$SIMILARITY, (SubLObject)search_engine.$sym26$ABSTRACT_PASSAGE_SIMILARITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym27$GET_DATES, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list28);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym27$GET_DATES, (SubLObject)search_engine.$sym31$ABSTRACT_PASSAGE_GET_DATES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym32$OLDER, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list33, (SubLObject)search_engine.$list34);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym32$OLDER, (SubLObject)search_engine.$sym37$ABSTRACT_PASSAGE_OLDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list38);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym39$ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list41);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym43$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym44$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_simple_passage_class((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$list46, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list48);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym50$SIMPLE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list51);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym40$SIMPLE_PASSAGE, (SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym53$SIMPLE_PASSAGE_GET_CONTENT_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.T, (SubLObject)search_engine.$list55);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym57$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym58$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE);
        subloop_reserved_initialize_corpus_passage_class((SubLObject)search_engine.$sym54$CORPUS_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym59$GET_CORPUS, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list60);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym59$GET_CORPUS, (SubLObject)search_engine.$sym62$CORPUS_PASSAGE_GET_CORPUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym25$GET_VECTOR, (SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list63);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym12$ABSTRACT_PASSAGE, (SubLObject)search_engine.$sym25$GET_VECTOR, (SubLObject)search_engine.$sym65$ABSTRACT_PASSAGE_GET_VECTOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list51);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym67$CORPUS_PASSAGE_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym68$IDENTIFY_ENTITIES, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list69, (SubLObject)search_engine.$list70);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym68$IDENTIFY_ENTITIES, (SubLObject)search_engine.$sym83$CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym84$MAX_INSTANCES, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list85, (SubLObject)search_engine.$list86);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym84$MAX_INSTANCES, (SubLObject)search_engine.$sym88$CORPUS_PASSAGE_MAX_INSTANCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym89$GET_PARSE_TREES, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list90);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.$sym89$GET_PARSE_TREES, (SubLObject)search_engine.$sym94$CORPUS_PASSAGE_GET_PARSE_TREES_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list96);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym99$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym100$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE);
        subloop_reserved_initialize_information_request_class((SubLObject)search_engine.$sym95$INFORMATION_REQUEST);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list102);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym106$INFORMATION_REQUEST_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym95$INFORMATION_REQUEST, (SubLObject)search_engine.NIL, (SubLObject)search_engine.T, (SubLObject)search_engine.$list108);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym110$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym111$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE);
        subloop_reserved_initialize_knowledge_source_query_class((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym112$ANSWER, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list113);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym112$ANSWER, (SubLObject)search_engine.$sym118$KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$list46, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list119);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym123$KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym117$HANDLE_ERROR, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$list46, (SubLObject)search_engine.$list124, (SubLObject)search_engine.$list125);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.$sym117$HANDLE_ERROR, (SubLObject)search_engine.$sym128$KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list131);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym132$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym133$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE);
        subloop_reserved_initialize_corpus_query_class((SubLObject)search_engine.$sym130$CORPUS_QUERY);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list135);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym136$CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym59$GET_CORPUS, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list137);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym59$GET_CORPUS, (SubLObject)search_engine.$sym139$CORPUS_QUERY_GET_CORPUS_METHOD);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym140$GET_CORPUS_PATH, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list141);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym140$GET_CORPUS_PATH, (SubLObject)search_engine.$sym143$CORPUS_QUERY_GET_CORPUS_PATH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$list46, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list144);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym148$CORPUS_QUERY_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list150);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$sym151$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$sym152$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE);
        subloop_reserved_initialize_glimpse_query_class((SubLObject)search_engine.$sym149$GLIMPSE_QUERY);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list154);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym156$GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list158);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym149$GLIMPSE_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym167$GLIMPSE_QUERY_GET_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list172);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym176$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym177$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_glimpse_passage_class((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$list46, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list181);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym183$GLIMPSE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list184);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym186$GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list187);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym171$GLIMPSE_PASSAGE, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym190$GLIMPSE_PASSAGE_GET_SOURCE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list150);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.$sym192$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.$sym193$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE);
        subloop_reserved_initialize_guruqa_query_class((SubLObject)search_engine.$sym191$GURUQA_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list194);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym191$GURUQA_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym199$GURUQA_QUERY_GET_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list201);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym205$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym206$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE);
        subloop_reserved_initialize_guruqa_passage_class((SubLObject)search_engine.$sym200$GURUQA_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list210);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym212$GURUQA_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list213);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym216$GURUQA_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list217);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym219$GURUQA_PASSAGE_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym117$HANDLE_ERROR, (SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$list157, (SubLObject)search_engine.$list124, (SubLObject)search_engine.$list125);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym200$GURUQA_PASSAGE, (SubLObject)search_engine.$sym117$HANDLE_ERROR, (SubLObject)search_engine.$sym221$GURUQA_PASSAGE_HANDLE_ERROR_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list223);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym226$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym227$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE);
        subloop_reserved_initialize_lemur_query_class((SubLObject)search_engine.$sym222$LEMUR_QUERY);
        methods.methods_incorporate_class_method((SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list230);
        methods.subloop_register_class_method((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym134$GET_CORPUS_PATH_MAPPING, (SubLObject)search_engine.$sym232$LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list233);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym222$LEMUR_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym236$LEMUR_QUERY_GET_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list244);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym246$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym247$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE);
        subloop_reserved_initialize_lemur_passage_class((SubLObject)search_engine.$sym243$LEMUR_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list249);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym251$LEMUR_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list252);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym255$LEMUR_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list256);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym258$LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list259);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym243$LEMUR_PASSAGE, (SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym261$LEMUR_PASSAGE_GET_SCORE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list263);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym265$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym266$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE);
        subloop_reserved_initialize_qaga_query_class((SubLObject)search_engine.$sym262$QAGA_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list267);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym272$QAGA_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym273$GET_AUGMENTATION_TERMS, (SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list274);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym262$QAGA_QUERY, (SubLObject)search_engine.$sym273$GET_AUGMENTATION_TERMS, (SubLObject)search_engine.$sym276$QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list279);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym282$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym283$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE);
        subloop_reserved_initialize_google_query_class((SubLObject)search_engine.$sym278$GOOGLE_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list284);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym287$GOOGLE_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list289);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym291$GOOGLE_QUERY_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym292$QUIT, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list293);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym292$QUIT, (SubLObject)search_engine.$sym295$GOOGLE_QUERY_QUIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym296$SPELLING, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list297);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym296$SPELLING, (SubLObject)search_engine.$sym299$GOOGLE_QUERY_SPELLING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym300$VERSION, (SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list301);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym278$GOOGLE_QUERY, (SubLObject)search_engine.$sym300$VERSION, (SubLObject)search_engine.$sym303$GOOGLE_QUERY_VERSION_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list323);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym326$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym329$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE);
        subloop_reserved_initialize_google_client_class((SubLObject)search_engine.$sym318$GOOGLE_CLIENT);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list330);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym331$GOOGLE_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym321$SET_CLIENT_KEY, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list332, (SubLObject)search_engine.$list333);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym321$SET_CLIENT_KEY, (SubLObject)search_engine.$sym335$GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym286$SEARCH, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list336, (SubLObject)search_engine.$list337, (SubLObject)search_engine.$list338);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym286$SEARCH, (SubLObject)search_engine.$sym344$GOOGLE_CLIENT_SEARCH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list345, (SubLObject)search_engine.$list346);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym349$GOOGLE_CLIENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym296$SPELLING, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list345, (SubLObject)search_engine.$list350);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym296$SPELLING, (SubLObject)search_engine.$sym352$GOOGLE_CLIENT_SPELLING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym292$QUIT, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list353);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym292$QUIT, (SubLObject)search_engine.$sym356$GOOGLE_CLIENT_QUIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym300$VERSION, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list357);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym300$VERSION, (SubLObject)search_engine.$sym359$GOOGLE_CLIENT_VERSION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym339$BUILD_BASIC_GOOGLE_REQUEST, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list360, (SubLObject)search_engine.$list361, (SubLObject)search_engine.$list362);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym339$BUILD_BASIC_GOOGLE_REQUEST, (SubLObject)search_engine.$sym367$GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym343$GET_ANSWER_FROM_REQUEST, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list360, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list368);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym343$GET_ANSWER_FROM_REQUEST, (SubLObject)search_engine.$sym374$GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$list360, (SubLObject)search_engine.$list361, (SubLObject)search_engine.$list375);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym318$GOOGLE_CLIENT, (SubLObject)search_engine.$sym347$GOOGLE_REQUEST, (SubLObject)search_engine.$sym376$GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list377);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym422$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym423$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_google_client_interaction_class((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list424);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym427$GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym364$SET_KEY, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list428);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym364$SET_KEY, (SubLObject)search_engine.$sym430$GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym365$SET_DIRECTIVE, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list431);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym365$SET_DIRECTIVE, (SubLObject)search_engine.$sym433$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym341$SET_DOCNO, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list434);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym341$SET_DOCNO, (SubLObject)search_engine.$sym436$GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym342$SET_START, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list437);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym342$SET_START, (SubLObject)search_engine.$sym439$GOOGLE_CLIENT_INTERACTION_SET_START_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym440$GET_IO_ERROR_FLAG, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list441);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym440$GET_IO_ERROR_FLAG, (SubLObject)search_engine.$sym443$GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym371$BUILD_ANSWER, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list444, (SubLObject)search_engine.$list445);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym371$BUILD_ANSWER, (SubLObject)search_engine.$sym453$GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym454$GET_DIRECTIVE, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list455);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym454$GET_DIRECTIVE, (SubLObject)search_engine.$sym457$GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list458);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, (SubLObject)search_engine.$sym460$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym370$REQUEST_STRING, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list461);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym370$REQUEST_STRING, (SubLObject)search_engine.$sym468$GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym372$GET_ANSWER, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list469);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym372$GET_ANSWER, (SubLObject)search_engine.$sym473$GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym472$GET_GOOGLE_PASSAGES, (SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list474);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym363$GOOGLE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym472$GET_GOOGLE_PASSAGES, (SubLObject)search_engine.$sym481$GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$sym482$BASIC_LIST, (SubLObject)search_engine.$list483, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$sym484$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$sym488$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE);
        subloop_reserved_initialize_google_passage_list_class((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym489$ACCEPTABLE_P, (SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list490, (SubLObject)search_engine.$list491);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$sym489$ACCEPTABLE_P, (SubLObject)search_engine.$sym494$GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym450$ADD, (SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list490, (SubLObject)search_engine.$list495);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym426$GOOGLE_PASSAGE_LIST, (SubLObject)search_engine.$sym450$ADD, (SubLObject)search_engine.$sym497$GOOGLE_PASSAGE_LIST_ADD_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list498);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym507$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym508$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_google_passage_class((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list509);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym511$GOOGLE_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list512);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym514$GOOGLE_PASSAGE_GET_SCORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym493$IS_COMPLETE, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list515);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym493$IS_COMPLETE, (SubLObject)search_engine.$sym517$GOOGLE_PASSAGE_IS_COMPLETE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym518$GET_OFFSET_IN_FULL_TEXT, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list519);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym518$GET_OFFSET_IN_FULL_TEXT, (SubLObject)search_engine.$sym521$GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym522$GET_OFFSET_IN_SNIPPET, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list523);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym522$GET_OFFSET_IN_SNIPPET, (SubLObject)search_engine.$sym525$GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym526$GET_URL, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list527);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym526$GET_URL, (SubLObject)search_engine.$sym529$GOOGLE_PASSAGE_GET_URL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym530$GET_TITLE, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list531);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym530$GET_TITLE, (SubLObject)search_engine.$sym533$GOOGLE_PASSAGE_GET_TITLE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym534$GET_CACHED_FILE_ID, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list535);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym534$GET_CACHED_FILE_ID, (SubLObject)search_engine.$sym536$GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym537$GET_FULL_TEXT, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list538);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym537$GET_FULL_TEXT, (SubLObject)search_engine.$sym539$GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym540$GET_SNIPPET, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list541);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym540$GET_SNIPPET, (SubLObject)search_engine.$sym543$GOOGLE_PASSAGE_GET_SNIPPET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym544$GET_RANK, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list545);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym544$GET_RANK, (SubLObject)search_engine.$sym547$GOOGLE_PASSAGE_GET_RANK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym548$GET_TOTAL_FOR_RANK, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list549);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym548$GET_TOTAL_FOR_RANK, (SubLObject)search_engine.$sym551$GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym552$GET_RANK_AND_TOTAL, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list553);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym552$GET_RANK_AND_TOTAL, (SubLObject)search_engine.$sym554$GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list555);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym556$GOOGLE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list38);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym492$GOOGLE_PASSAGE, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym557$GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym130$CORPUS_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list560);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym561$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym562$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE);
        subloop_reserved_initialize_lucene_query_class((SubLObject)search_engine.$sym559$LUCENE_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list563);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym559$LUCENE_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym565$LUCENE_QUERY_GET_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym322$TCP_CLIENT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list567);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym568$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym569$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE);
        subloop_reserved_initialize_lucene_client_class((SubLObject)search_engine.$sym566$LUCENE_CLIENT);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list330);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym570$LUCENE_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym286$SEARCH, (SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list571, (SubLObject)search_engine.$list572);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym286$SEARCH, (SubLObject)search_engine.$sym574$LUCENE_CLIENT_SEARCH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list345, (SubLObject)search_engine.$list575);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym288$COUNT, (SubLObject)search_engine.$sym576$LUCENE_CLIENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym573$LUCENE_REQUEST, (SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$list360, (SubLObject)search_engine.$list577, (SubLObject)search_engine.$list578);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym566$LUCENE_CLIENT, (SubLObject)search_engine.$sym573$LUCENE_REQUEST, (SubLObject)search_engine.$sym580$LUCENE_CLIENT_LUCENE_REQUEST_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym1$OBJECT, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list581);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym586$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym587$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_lucene_client_interaction_class((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list588);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym101$INITIALIZE, (SubLObject)search_engine.$sym591$LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym365$SET_DIRECTIVE, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list431);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym365$SET_DIRECTIVE, (SubLObject)search_engine.$sym593$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym371$BUILD_ANSWER, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list444, (SubLObject)search_engine.$list594);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym371$BUILD_ANSWER, (SubLObject)search_engine.$sym598$LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym454$GET_DIRECTIVE, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list455);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym454$GET_DIRECTIVE, (SubLObject)search_engine.$sym600$LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list458);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym366$SET_DIRECTIVE_ARG, (SubLObject)search_engine.$sym602$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym341$SET_DOCNO, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list17, (SubLObject)search_engine.$list434);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym341$SET_DOCNO, (SubLObject)search_engine.$sym604$LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym370$REQUEST_STRING, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list605);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym370$REQUEST_STRING, (SubLObject)search_engine.$sym607$LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym372$GET_ANSWER, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list608);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym372$GET_ANSWER, (SubLObject)search_engine.$sym611$LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym610$GET_LUCENE_PASSAGES, (SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list612);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym579$LUCENE_CLIENT_INTERACTION, (SubLObject)search_engine.$sym610$GET_LUCENE_PASSAGES, (SubLObject)search_engine.$sym614$LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$sym482$BASIC_LIST, (SubLObject)search_engine.$list483, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$sym615$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$sym616$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE);
        subloop_reserved_initialize_lucene_passage_list_class((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym489$ACCEPTABLE_P, (SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list490, (SubLObject)search_engine.$list617);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$sym489$ACCEPTABLE_P, (SubLObject)search_engine.$sym619$LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym450$ADD, (SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list490, (SubLObject)search_engine.$list620);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym590$LUCENE_PASSAGE_LIST, (SubLObject)search_engine.$sym450$ADD, (SubLObject)search_engine.$sym622$LUCENE_PASSAGE_LIST_ADD_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym54$CORPUS_PASSAGE, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list623);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym625$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym626$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_lucene_passage_class((SubLObject)search_engine.$sym618$LUCENE_PASSAGE);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list627);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym629$LUCENE_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list630);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym87$GET_SCORE, (SubLObject)search_engine.$sym632$LUCENE_PASSAGE_GET_SCORE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym493$IS_COMPLETE, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list633);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym493$IS_COMPLETE, (SubLObject)search_engine.$sym635$LUCENE_PASSAGE_IS_COMPLETE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list636);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym638$LUCENE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list38);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym618$LUCENE_PASSAGE, (SubLObject)search_engine.$sym29$GET_PUBLICATION_DATE, (SubLObject)search_engine.$sym639$LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list641);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym644$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym645$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE);
        subloop_reserved_initialize_cycl_query_class((SubLObject)search_engine.$sym640$CYCL_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list650);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym655$CYCL_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym652$GET_FROM_KB, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.$list656, (SubLObject)search_engine.$list657);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym652$GET_FROM_KB, (SubLObject)search_engine.$sym659$CYCL_QUERY_GET_FROM_KB_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym653$GET_FROM_CORPUS, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.$list660, (SubLObject)search_engine.$list661);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym653$GET_FROM_CORPUS, (SubLObject)search_engine.$sym664$CYCL_QUERY_GET_FROM_CORPUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym663$GENERATE_ASSIGNMENTS, (SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$list157, (SubLObject)search_engine.$list665, (SubLObject)search_engine.$list666);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym640$CYCL_QUERY, (SubLObject)search_engine.$sym663$GENERATE_ASSIGNMENTS, (SubLObject)search_engine.$sym669$CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list677);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym680$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym681$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE);
        subloop_reserved_initialize_var_assignment_class((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.$list47, (SubLObject)search_engine.$list683);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym45$PRINT, (SubLObject)search_engine.$sym686$VAR_ASSIGNMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list687);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym689$VAR_ASSIGNMENT_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list690);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym676$VAR_ASSIGNMENT, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym692$VAR_ASSIGNMENT_GET_SOURCE_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$sym107$KNOWLEDGE_SOURCE_QUERY, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list694);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$sym696$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$sym697$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE);
        subloop_reserved_initialize_wordnet_query_class((SubLObject)search_engine.$sym693$WORDNET_QUERY);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$list46, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list700);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym693$WORDNET_QUERY, (SubLObject)search_engine.$sym76$GET, (SubLObject)search_engine.$sym704$WORDNET_QUERY_GET_METHOD);
        classes.subloop_new_class((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym0$INFORMATION, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list706);
        classes.class_set_implements_slot_listeners((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym707$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym708$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE);
        subloop_reserved_initialize_wordnet_gloss_class((SubLObject)search_engine.$sym705$WORDNET_GLOSS);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list709);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym19$GET_CONTENT, (SubLObject)search_engine.$sym711$WORDNET_GLOSS_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$list9, (SubLObject)search_engine.NIL, (SubLObject)search_engine.$list712);
        methods.subloop_register_instance_method((SubLObject)search_engine.$sym705$WORDNET_GLOSS, (SubLObject)search_engine.$sym8$GET_SOURCE, (SubLObject)search_engine.$sym714$WORDNET_GLOSS_GET_SOURCE_METHOD);
        return (SubLObject)search_engine.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_search_engine_file();
    }
    
    @Override
	public void initializeVariables() {
        init_search_engine_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_search_engine_file();
    }
    
    static {
        me = (SubLFile)new search_engine();
        search_engine.$default_corpus$ = null;
        search_engine.$world_wide_web_corpus$ = null;
        search_engine.$authorized_google_key$ = null;
        search_engine.$google_client_key_file$ = null;
        search_engine.$google_client_host$ = null;
        search_engine.$google_client_port$ = null;
        search_engine.$google_client$ = null;
        search_engine.$wikipedia$ = null;
        search_engine.$lucene_client_host$ = null;
        search_engine.$lucene_client_port$ = null;
        search_engine.$lucene_client$ = null;
        search_engine.$google_api_method_invocation_count$ = null;
        $sym0$INFORMATION = SubLObjectFactory.makeSymbol("INFORMATION");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym4$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS");
        $sym5$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym6$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE");
        $sym8$GET_SOURCE = SubLObjectFactory.makeSymbol("GET-SOURCE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return objectp; the source of this piece of information, nil if unknown"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL));
        $sym11$INFORMATION_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-GET-SOURCE-METHOD");
        $sym12$ABSTRACT_PASSAGE = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-RECENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE1"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DATES"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)search_engine.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym14$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym15$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS");
        $sym16$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if OBJECT is equal to this passage, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))));
        $sym19$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym20$ABSTRACT_PASSAGE_EQUAL_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-EQUAL-METHOD");
        $sym21$SIMILARITY = SubLObjectFactory.makeSymbol("SIMILARITY");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE1"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE2"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PASSAGE1 abstract-passage-p\n   @param PASSAGE2 abstract-passage-p\n   @return non-negative-integerp; the similarity between PASSAGE1 and PASSAGE2 with\n   0 indicating no similarity and 1 indicating identity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE1"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE2"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"))))));
        $sym24$ABSTRACT_PASSAGE_P = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P");
        $sym25$GET_VECTOR = SubLObjectFactory.makeSymbol("GET-VECTOR");
        $sym26$ABSTRACT_PASSAGE_SIMILARITY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-SIMILARITY-METHOD");
        $sym27$GET_DATES = SubLObjectFactory.makeSymbol("GET-DATES");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of dates found in this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATES"), (SubLObject)search_engine.NIL), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THISDAY"), (SubLObject)SubLObjectFactory.makeSymbol("THISMONTH"), (SubLObject)SubLObjectFactory.makeSymbol("THISYEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECODE-UNIVERSAL-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("THISDAY"), (SubLObject)SubLObjectFactory.makeSymbol("THISMONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PDAY"), (SubLObject)SubLObjectFactory.makeSymbol("PMONTH"), (SubLObject)SubLObjectFactory.makeSymbol("PYEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECODE-UNIVERSAL-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-DATE-TO-UNIVERSAL-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("PMONTH"), (SubLObject)SubLObjectFactory.makeSymbol("PDAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOFYEAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)search_engine.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("MINUTE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR"), (SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECODE-EXTENDED-UNIVERSAL-DATE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("MINUTE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("THISYEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUESS-YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("PYEAR"), (SubLObject)SubLObjectFactory.makeSymbol("PMONTH"), (SubLObject)SubLObjectFactory.makeSymbol("PDAY"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("DAY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)SubLObjectFactory.makeSymbol("DATES")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DATES"))));
        $sym29$GET_PUBLICATION_DATE = SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOFYEAR"));
        $sym31$ABSTRACT_PASSAGE_GET_DATES_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-GET-DATES-METHOD");
        $sym32$OLDER = SubLObjectFactory.makeSymbol("OLDER");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param OTHER-PASSAGE, abstract-passage-p\n   @return BOOLEAN, T is this passage is older than OTHER-PASSAGE, NIL otherwise.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELF-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE<"), (SubLObject)SubLObjectFactory.makeSymbol("SELF-DATE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELF-DOC-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF-DOC-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)search_engine.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("SELF-DOC-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELF-SENTENCE-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-NUMBER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-SENTENCE-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-NUMBER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("SELF-SENTENCE-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-SENTENCE-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("SELF-SENTENCE-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-SENTENCE-NUM")))))))));
        $sym35$DOC_ID = SubLObjectFactory.makeSymbol("DOC-ID");
        $sym36$SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("SENTENCE-NUMBER");
        $sym37$ABSTRACT_PASSAGE_OLDER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL));
        $sym39$ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD");
        $sym40$SIMPLE_PASSAGE = SubLObjectFactory.makeSymbol("SIMPLE-PASSAGE");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym42$TEXT = SubLObjectFactory.makeSymbol("TEXT");
        $sym43$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS");
        $sym44$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE");
        $sym45$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints PASSAGE to STREAM, ignoring depth"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD");
        $sym50$SIMPLE_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("SIMPLE-PASSAGE-PRINT-METHOD");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the text of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")));
        $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD");
        $sym53$SIMPLE_PASSAGE_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("SIMPLE-PASSAGE-GET-CONTENT-METHOD");
        $sym54$CORPUS_PASSAGE = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREES"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IDENTIFY-ENTITIES"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym56$CORPUS = SubLObjectFactory.makeSymbol("CORPUS");
        $sym57$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS");
        $sym58$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE");
        $sym59$GET_CORPUS = SubLObjectFactory.makeSymbol("GET-CORPUS");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the symbolical name of the corpus this passage came from"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")));
        $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD");
        $sym62$CORPUS_PASSAGE_GET_CORPUS_METHOD = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-GET-CORPUS-METHOD");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return svector-p; the word vector corresponding to this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STRING-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")));
        $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-PASSAGE-METHOD");
        $sym65$ABSTRACT_PASSAGE_GET_VECTOR_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-GET-VECTOR-METHOD");
        $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD");
        $sym67$CORPUS_PASSAGE_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-GET-CONTENT-METHOD");
        $sym68$IDENTIFY_ENTITIES = SubLObjectFactory.makeSymbol("IDENTIFY-ENTITIES");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization"))))));
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-SENTENCIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-TAG-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("TAGGED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-DO-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON-P"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)search_engine.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("POS-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES-TO-IDENTIFY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDIVIDUAL?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXTUAL-FOCUS-ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PASSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)search_engine.EQUALP)))))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITIES"))));
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")));
        $sym72$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym73$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym74$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym75$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym76$GET = SubLObjectFactory.makeSymbol("GET");
        $kw77$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw78$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $kw79$STRING = SubLObjectFactory.makeKeyword("STRING");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"));
        $const81$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $sym82$ADD_PASSAGE = SubLObjectFactory.makeSymbol("ADD-PASSAGE");
        $sym83$CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD");
        $sym84$MAX_INSTANCES = SubLObjectFactory.makeSymbol("MAX-INSTANCES");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PASSAGES listp\n    @return list-p; the highest scoring passages among PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)search_engine.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-PASSAGES"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"))), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"))), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-PASSAGES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-PASSAGES"))));
        $sym87$GET_SCORE = SubLObjectFactory.makeSymbol("GET-SCORE");
        $sym88$CORPUS_PASSAGE_MAX_INSTANCES_METHOD = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-MAX-INSTANCES-METHOD");
        $sym89$GET_PARSE_TREES = SubLObjectFactory.makeSymbol("GET-PARSE-TREES");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of the parse trees obtained\n  from parsing the sentences of this passage. The passage\n  is broken into sentences by first turning it into a \n  document-p.\n  @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DOCUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING-INPUT-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREES"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-DO-SENTENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SENT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CHARNIAK-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)SubLObjectFactory.makeSymbol("SENT-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("TREES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TREES"))));
        $sym91$CHARNIAK_PARSER = SubLObjectFactory.makeSymbol("CHARNIAK-PARSER");
        $sym92$GET_PARSER = SubLObjectFactory.makeSymbol("GET-PARSER");
        $sym93$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym94$CORPUS_PASSAGE_GET_PARSE_TREES_METHOD = SubLObjectFactory.makeSymbol("CORPUS-PASSAGE-GET-PARSE-TREES-METHOD");
        $sym95$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym97$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym98$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym99$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS");
        $sym100$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE");
        $sym101$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("WARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeInteger(720)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-REQUEST-METHOD");
        $kw104$WARN = SubLObjectFactory.makeKeyword("WARN");
        $int105$720 = SubLObjectFactory.makeInteger(720);
        $sym106$INFORMATION_REQUEST_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST-INITIALIZE-METHOD");
        $sym107$KNOWLEDGE_SOURCE_QUERY = SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCE-QUERY");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym109$QUERY = SubLObjectFactory.makeSymbol("QUERY");
        $sym110$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS");
        $sym111$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE");
        $sym112$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of answers that is the result of executing this query"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEDOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEDOUT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEDOUT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Query execution timeout after ~a seconds"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR")), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");
        $sym115$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str116$Query_execution_timeout_after__a_ = SubLObjectFactory.makeString("Query execution timeout after ~a seconds");
        $sym117$HANDLE_ERROR = SubLObjectFactory.makeSymbol("HANDLE-ERROR");
        $sym118$KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD = SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this search engine query to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<QUERY: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");
        $str121$__QUERY__ = SubLObjectFactory.makeString("#<QUERY: ");
        $str122$_ = SubLObjectFactory.makeString(">");
        $sym123$KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD = SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"));
        $list125 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")))));
        $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");
        $kw127$THROW = SubLObjectFactory.makeKeyword("THROW");
        $sym128$KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD = SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD");
        $str129$CNSjan2004 = SubLObjectFactory.makeString("CNSjan2004");
        $sym130$CORPUS_QUERY = SubLObjectFactory.makeSymbol("CORPUS-QUERY");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH-MAPPING"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym132$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS");
        $sym133$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE");
        $sym134$GET_CORPUS_PATH_MAPPING = SubLObjectFactory.makeSymbol("GET-CORPUS-PATH-MAPPING");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL));
        $sym136$CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = SubLObjectFactory.makeSymbol("CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the corpus of this query"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")));
        $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");
        $sym139$CORPUS_QUERY_GET_CORPUS_METHOD = SubLObjectFactory.makeSymbol("CORPUS-QUERY-GET-CORPUS-METHOD");
        $sym140$GET_CORPUS_PATH = SubLObjectFactory.makeSymbol("GET-CORPUS-PATH");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the specific index or config file used for CORPUS by this query"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH-MAPPING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)search_engine.EQUALP)))));
        $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");
        $sym143$CORPUS_QUERY_GET_CORPUS_PATH_METHOD = SubLObjectFactory.makeSymbol("CORPUS-QUERY-GET-CORPUS-PATH-METHOD");
        $list144 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Prints this search engine query to STREAM, ignoring DEPTH"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<QUERY("), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("): "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");
        $str146$__QUERY_ = SubLObjectFactory.makeString("#<QUERY(");
        $str147$___ = SubLObjectFactory.makeString("): ");
        $sym148$CORPUS_QUERY_PRINT_METHOD = SubLObjectFactory.makeSymbol("CORPUS-QUERY-PRINT-METHOD");
        $sym149$GLIMPSE_QUERY = SubLObjectFactory.makeSymbol("GLIMPSE-QUERY");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym151$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS");
        $sym152$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE");
        $str153$Non_supported_corpus__a = SubLObjectFactory.makeString("Non supported corpus ~a");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AQUAINT"), (SubLObject)SubLObjectFactory.makeString("/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNSjan2004"), (SubLObject)SubLObjectFactory.makeString("/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small"))))));
        $list155 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AQUAINT"), (SubLObject)SubLObjectFactory.makeString("/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNSjan2004"), (SubLObject)SubLObjectFactory.makeString("/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small")));
        $sym156$GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = SubLObjectFactory.makeSymbol("GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUERY stringpe\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-GLIMPSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeString("index"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("limit"), (SubLObject)SubLObjectFactory.makeString("100:100")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("ARTICLE"), (SubLObject)SubLObjectFactory.makeSymbol("LINE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"))), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("ARTICLE"), (SubLObject)SubLObjectFactory.makeSymbol("LINE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-EQUAL"))))));
        $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-QUERY-METHOD");
        $str160$index = SubLObjectFactory.makeString("index");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("limit"), (SubLObject)SubLObjectFactory.makeString("100:100")));
        $kw162$FILE = SubLObjectFactory.makeKeyword("FILE");
        $kw163$ARTICLE = SubLObjectFactory.makeKeyword("ARTICLE");
        $kw164$LINE = SubLObjectFactory.makeKeyword("LINE");
        $kw165$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $sym166$PASSAGE_EQUAL = SubLObjectFactory.makeSymbol("PASSAGE-EQUAL");
        $sym167$GLIMPSE_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("GLIMPSE-QUERY-GET-METHOD");
        $str168$_glimpse_cgi = SubLObjectFactory.makeString("/glimpse.cgi");
        $kw169$POST = SubLObjectFactory.makeKeyword("POST");
        $str170$query = SubLObjectFactory.makeString("query");
        $sym171$GLIMPSE_PASSAGE = SubLObjectFactory.makeSymbol("GLIMPSE-PASSAGE");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARTICLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym173$LINE = SubLObjectFactory.makeSymbol("LINE");
        $sym174$ARTICLE = SubLObjectFactory.makeSymbol("ARTICLE");
        $sym175$FILE = SubLObjectFactory.makeSymbol("FILE");
        $sym176$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS");
        $sym177$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE");
        $sym178$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym179$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym180$STRING = SubLObjectFactory.makeSymbol("STRING");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this glimpse passage to STREM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");
        $sym183$GLIMPSE_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("GLIMPSE-PASSAGE-PRINT-METHOD");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("FILE")), (SubLObject)search_engine.EIGHT_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)search_engine.ZERO_INTEGER, (SubLObject)search_engine.FOUR_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)search_engine.FOUR_INTEGER, (SubLObject)search_engine.SIX_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)search_engine.SIX_INTEGER, (SubLObject)search_engine.EIGHT_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"))))));
        $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");
        $sym186$GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD = SubLObjectFactory.makeSymbol("GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the location of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeString("~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("ARTICLE"), (SubLObject)SubLObjectFactory.makeSymbol("LINE"))));
        $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");
        $str189$__Corpus___a___File___a___Article = SubLObjectFactory.makeString("~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a");
        $sym190$GLIMPSE_PASSAGE_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("GLIMPSE-PASSAGE-GET-SOURCE-METHOD");
        $sym191$GURUQA_QUERY = SubLObjectFactory.makeSymbol("GURUQA-QUERY");
        $sym192$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS");
        $sym193$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDICES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GURUQA-ANSWER-INDEXES"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDICES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GURUQA-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DOC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("SENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("LEN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING")))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")))));
        $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-QUERY-METHOD");
        $kw196$DOC = SubLObjectFactory.makeKeyword("DOC");
        $kw197$SENT = SubLObjectFactory.makeKeyword("SENT");
        $kw198$LEN = SubLObjectFactory.makeKeyword("LEN");
        $sym199$GURUQA_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("GURUQA-QUERY-GET-METHOD");
        $sym200$GURUQA_PASSAGE = SubLObjectFactory.makeSymbol("GURUQA-PASSAGE");
        $list201 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym202$SPAN = SubLObjectFactory.makeSymbol("SPAN");
        $sym203$SENTENCE_ID = SubLObjectFactory.makeSymbol("SENTENCE-ID");
        $sym204$DOCUMENT_ID = SubLObjectFactory.makeSymbol("DOCUMENT-ID");
        $sym205$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS");
        $sym206$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE");
        $sym207$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"));
        $str209$Invalid_error_handling_tag = SubLObjectFactory.makeString("Invalid error-handling tag");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this guruqa passage to STREAM, ignoring depth"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");
        $sym212$GURUQA_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("GURUQA-PASSAGE-PRINT-METHOD");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the location of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeString("Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"))));
        $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");
        $str215$Corpus___a__Document___a__Sentenc = SubLObjectFactory.makeString("Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a");
        $sym216$GURUQA_PASSAGE_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("GURUQA-PASSAGE-GET-SOURCE-METHOD");
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the text of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GURUQA-RETRIEVE-PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLE-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")));
        $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");
        $sym219$GURUQA_PASSAGE_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("GURUQA-PASSAGE-GET-CONTENT-METHOD");
        $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");
        $sym221$GURUQA_PASSAGE_HANDLE_ERROR_METHOD = SubLObjectFactory.makeSymbol("GURUQA-PASSAGE-HANDLE-ERROR-METHOD");
        $sym222$LEMUR_QUERY = SubLObjectFactory.makeSymbol("LEMUR-QUERY");
        $list223 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH-MAPPING"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym224$SENTNO = SubLObjectFactory.makeSymbol("SENTNO");
        $sym225$DOCNO = SubLObjectFactory.makeSymbol("DOCNO");
        $sym226$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS");
        $sym227$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE");
        $int228$50 = SubLObjectFactory.makeInteger(50);
        $sym229$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $list230 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AQUAINT"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XCNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("WIKIPEDIA"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNSjan2004"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param"))))));
        $list231 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AQUAINT"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XCNS"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("WIKIPEDIA"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("CNSjan2004"), (SubLObject)SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param")));
        $sym232$LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = SubLObjectFactory.makeSymbol("LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-LEMUR"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeSymbol("SENTNO"), (SubLObject)search_engine.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PATH")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"))), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRIP-PASSAGE-HEADER"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-EQUAL")))))));
        $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-QUERY-METHOD");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $sym236$LEMUR_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("LEMUR-QUERY-GET-METHOD");
        $str237$_cyc_projects_aquaint_lemur_indic = SubLObjectFactory.makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param");
        $str238$_lemur_cgi = SubLObjectFactory.makeString("/lemur.cgi");
        $str239$n = SubLObjectFactory.makeString("n");
        $str240$N = SubLObjectFactory.makeString("N");
        $str241$l = SubLObjectFactory.makeString("l");
        $str242$p = SubLObjectFactory.makeString("p");
        $sym243$LEMUR_PASSAGE = SubLObjectFactory.makeSymbol("LEMUR-PASSAGE");
        $list244 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym245$SCORE = SubLObjectFactory.makeSymbol("SCORE");
        $sym246$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS");
        $sym247$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE");
        $list248 = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $list249 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this lemur passage to STREM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");
        $sym251$LEMUR_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("LEMUR-PASSAGE-PRINT-METHOD");
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the location of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeString("~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"))));
        $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");
        $str254$__Corpus___a__Source___a__Sentenc = SubLObjectFactory.makeString("~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a");
        $sym255$LEMUR_PASSAGE_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("LEMUR-PASSAGE-GET-SOURCE-METHOD");
        $list256 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID")), (SubLObject)search_engine.ELEVEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"), (SubLObject)search_engine.THREE_INTEGER, (SubLObject)search_engine.SEVEN_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"), (SubLObject)search_engine.SEVEN_INTEGER, (SubLObject)search_engine.NINE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-ID"), (SubLObject)search_engine.NINE_INTEGER, (SubLObject)search_engine.ELEVEN_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeSymbol("DAY"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR"))))));
        $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");
        $sym258$LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD = SubLObjectFactory.makeSymbol("LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD");
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return numberp; the score of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE")));
        $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");
        $sym261$LEMUR_PASSAGE_GET_SCORE_METHOD = SubLObjectFactory.makeSymbol("LEMUR-PASSAGE-GET-SCORE-METHOD");
        $sym262$QAGA_QUERY = SubLObjectFactory.makeSymbol("QAGA-QUERY");
        $list263 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-AUGMENTATION-TERMS"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym264$AUGMENTATION_TERMS = SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS");
        $sym265$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS");
        $sym266$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE");
        $list267 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-QAGA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("DOCID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS"))), (SubLObject)SubLObjectFactory.makeSymbol("DOCID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-EQUAL")))))));
        $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QAGA-QUERY-METHOD");
        $kw269$DOCID = SubLObjectFactory.makeKeyword("DOCID");
        $kw270$SCORE = SubLObjectFactory.makeKeyword("SCORE");
        $kw271$AUGMENT = SubLObjectFactory.makeKeyword("AUGMENT");
        $sym272$QAGA_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("QAGA-QUERY-GET-METHOD");
        $sym273$GET_AUGMENTATION_TERMS = SubLObjectFactory.makeSymbol("GET-AUGMENTATION-TERMS");
        $list274 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS")));
        $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QAGA-QUERY-METHOD");
        $sym276$QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD = SubLObjectFactory.makeSymbol("QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD");
        $str277$WWW = SubLObjectFactory.makeString("WWW");
        $sym278$GOOGLE_QUERY = SubLObjectFactory.makeSymbol("GOOGLE-QUERY");
        $list279 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SPELLING"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym280$GOOGLE_KEY = SubLObjectFactory.makeSymbol("GOOGLE-KEY");
        $sym281$START = SubLObjectFactory.makeSymbol("START");
        $sym282$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS");
        $sym283$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE");
        $list284 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a ranked list @xref google-passages matching QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"))));
        $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");
        $sym286$SEARCH = SubLObjectFactory.makeSymbol("SEARCH");
        $sym287$GOOGLE_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-QUERY-GET-METHOD");
        $sym288$COUNT = SubLObjectFactory.makeSymbol("COUNT");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return integerp; the number of hits for QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"))));
        $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");
        $sym291$GOOGLE_QUERY_COUNT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-QUERY-COUNT-METHOD");
        $sym292$QUIT = SubLObjectFactory.makeSymbol("QUIT");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; the server is assumed to be shut down"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.T));
        $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");
        $sym295$GOOGLE_QUERY_QUIT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-QUERY-QUIT-METHOD");
        $sym296$SPELLING = SubLObjectFactory.makeSymbol("SPELLING");
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; the server is assumed to be shut down"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SPELLING")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"))));
        $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");
        $sym299$GOOGLE_QUERY_SPELLING_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-QUERY-SPELLING-METHOD");
        $sym300$VERSION = SubLObjectFactory.makeSymbol("VERSION");
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the server sends back various information"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-CLIENT"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION")))));
        $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");
        $sym303$GOOGLE_QUERY_VERSION_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-QUERY-VERSION-METHOD");
        $list304 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.google.client-key-file"));
        $sym305$_GOOGLE_CLIENT_KEY_FILE_ = SubLObjectFactory.makeSymbol("*GOOGLE-CLIENT-KEY-FILE*");
        $str306$data_googlekey_txt = SubLObjectFactory.makeString("data/googlekey.txt");
        $kw307$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.google.client-host"));
        $sym309$_GOOGLE_CLIENT_HOST_ = SubLObjectFactory.makeSymbol("*GOOGLE-CLIENT-HOST*");
        $str310$googleserver_cyc_com = SubLObjectFactory.makeString("googleserver.cyc.com");
        $list311 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.google.client-port"));
        $sym312$_GOOGLE_CLIENT_PORT_ = SubLObjectFactory.makeSymbol("*GOOGLE-CLIENT-PORT*");
        $int313$6667 = SubLObjectFactory.makeInteger(6667);
        $kw314$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw315$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw316$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw317$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym318$GOOGLE_CLIENT = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT");
        $sym319$SET_HOST = SubLObjectFactory.makeSymbol("SET-HOST");
        $sym320$SET_PORT = SubLObjectFactory.makeSymbol("SET-PORT");
        $sym321$SET_CLIENT_KEY = SubLObjectFactory.makeSymbol("SET-CLIENT-KEY");
        $sym322$TCP_CLIENT = SubLObjectFactory.makeSymbol("TCP-CLIENT");
        $list323 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CLIENT-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DOCNO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOC-NUMBER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)search_engine.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HITS"), (SubLObject)search_engine.TEN_INTEGER)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUIT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym324$CLIENT_INTERACTION = SubLObjectFactory.makeSymbol("CLIENT-INTERACTION");
        $sym325$CLIENT_KEY = SubLObjectFactory.makeSymbol("CLIENT-KEY");
        $sym326$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS");
        $sym327$HOST = SubLObjectFactory.makeSymbol("HOST");
        $sym328$PORT = SubLObjectFactory.makeSymbol("PORT");
        $sym329$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE");
        $list330 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym331$GOOGLE_CLIENT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INITIALIZE-METHOD");
        $list332 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")));
        $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-METHOD");
        $sym335$GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD");
        $list336 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"));
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)search_engine.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HITS"), (SubLObject)search_engine.TEN_INTEGER));
        $list338 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("HITS"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BUILD-BASIC-GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("search"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DOCNO")), (SubLObject)SubLObjectFactory.makeSymbol("HITS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-START")), (SubLObject)SubLObjectFactory.makeSymbol("START")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER-FROM-REQUEST")))));
        $sym339$BUILD_BASIC_GOOGLE_REQUEST = SubLObjectFactory.makeSymbol("BUILD-BASIC-GOOGLE-REQUEST");
        $str340$search = SubLObjectFactory.makeString("search");
        $sym341$SET_DOCNO = SubLObjectFactory.makeSymbol("SET-DOCNO");
        $sym342$SET_START = SubLObjectFactory.makeSymbol("SET-START");
        $sym343$GET_ANSWER_FROM_REQUEST = SubLObjectFactory.makeSymbol("GET-ANSWER-FROM-REQUEST");
        $sym344$GOOGLE_CLIENT_SEARCH_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-SEARCH-METHOD");
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"));
        $list346 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("count"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"))));
        $sym347$GOOGLE_REQUEST = SubLObjectFactory.makeSymbol("GOOGLE-REQUEST");
        $str348$count = SubLObjectFactory.makeString("count");
        $sym349$GOOGLE_CLIENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-COUNT-METHOD");
        $list350 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("spell"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"))));
        $str351$spell = SubLObjectFactory.makeString("spell");
        $sym352$GOOGLE_CLIENT_SPELLING_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-SPELLING-METHOD");
        $list353 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("$quit$"), (SubLObject)SubLObjectFactory.makeString(""))));
        $str354$_quit_ = SubLObjectFactory.makeString("$quit$");
        $str355$ = SubLObjectFactory.makeString("");
        $sym356$GOOGLE_CLIENT_QUIT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-QUIT-METHOD");
        $list357 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("version"), (SubLObject)SubLObjectFactory.makeString(""))));
        $str358$version = SubLObjectFactory.makeString("version");
        $sym359$GOOGLE_CLIENT_VERSION_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-VERSION-METHOD");
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list361 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"));
        $list362 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KEY")), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"))));
        $sym363$GOOGLE_CLIENT_INTERACTION = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION");
        $sym364$SET_KEY = SubLObjectFactory.makeSymbol("SET-KEY");
        $sym365$SET_DIRECTIVE = SubLObjectFactory.makeSymbol("SET-DIRECTIVE");
        $sym366$SET_DIRECTIVE_ARG = SubLObjectFactory.makeSymbol("SET-DIRECTIVE-ARG");
        $sym367$GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD");
        $list368 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-REQUEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BUILD-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER"))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Error when contacting Google server: ~A"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"))))));
        $sym369$PERFORM_REQUEST = SubLObjectFactory.makeSymbol("PERFORM-REQUEST");
        $sym370$REQUEST_STRING = SubLObjectFactory.makeSymbol("REQUEST-STRING");
        $sym371$BUILD_ANSWER = SubLObjectFactory.makeSymbol("BUILD-ANSWER");
        $sym372$GET_ANSWER = SubLObjectFactory.makeSymbol("GET-ANSWER");
        $str373$Error_when_contacting_Google_serv = SubLObjectFactory.makeString("Error when contacting Google server: ~A");
        $sym374$GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD");
        $list375 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BUILD-BASIC-GOOGLE-REQUEST")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER-FROM-REQUEST")))));
        $sym376$GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD");
        $list377 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("search")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("count")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPELL-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("spell")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUIT-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("$quit$")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERSION-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("version")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("SubL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("query")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("type")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-COUNT-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("hitnum")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-START-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("startnum")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-KEY-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("key")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("language")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("URL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("TITLE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("FULL-TEXT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("SNIPPET")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("OFFSET-IN-FULL-TEXT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("OFFSET-IN-SNIPPET")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("RANK")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SPELLING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-VERSION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-IO-ERROR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-URL-FROM-START-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TAG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-RAW-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-IO-ERROR-FLAG"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym378$GOOGLE_IO_ERROR = SubLObjectFactory.makeSymbol("GOOGLE-IO-ERROR");
        $sym379$GOOGLE_VERSION = SubLObjectFactory.makeSymbol("GOOGLE-VERSION");
        $sym380$GOOGLE_SPELLING = SubLObjectFactory.makeSymbol("GOOGLE-SPELLING");
        $sym381$GOOGLE_COUNT = SubLObjectFactory.makeSymbol("GOOGLE-COUNT");
        $sym382$GOOGLE_PASSAGES = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES");
        $sym383$DIRECTIVE_ARG = SubLObjectFactory.makeSymbol("DIRECTIVE-ARG");
        $sym384$DIRECTIVE = SubLObjectFactory.makeSymbol("DIRECTIVE");
        $int385$21 = SubLObjectFactory.makeInteger(21);
        $sym386$SEARCH_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG");
        $sym387$COUNT_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG");
        $sym388$SPELL_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("SPELL-DIRECTIVE-TAG");
        $sym389$QUIT_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("QUIT-DIRECTIVE-TAG");
        $sym390$VERSION_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("VERSION-DIRECTIVE-TAG");
        $sym391$SUBL_DIRECTIVE_TAG = SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG");
        $str392$SubL = SubLObjectFactory.makeString("SubL");
        $sym393$QUERY_TAG = SubLObjectFactory.makeSymbol("QUERY-TAG");
        $sym394$QUERY_TYPE_ATTR = SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR");
        $str395$type = SubLObjectFactory.makeString("type");
        $sym396$QUERY_COUNT_ATTR = SubLObjectFactory.makeSymbol("QUERY-COUNT-ATTR");
        $str397$hitnum = SubLObjectFactory.makeString("hitnum");
        $sym398$QUERY_START_ATTR = SubLObjectFactory.makeSymbol("QUERY-START-ATTR");
        $str399$startnum = SubLObjectFactory.makeString("startnum");
        $sym400$QUERY_KEY_ATTR = SubLObjectFactory.makeSymbol("QUERY-KEY-ATTR");
        $str401$key = SubLObjectFactory.makeString("key");
        $sym402$QUERY_LANGUAGE_ATTR = SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR");
        $str403$language = SubLObjectFactory.makeString("language");
        $sym404$CONTENT_KEYWORD = SubLObjectFactory.makeSymbol("CONTENT-KEYWORD");
        $kw405$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $sym406$URL_KEYWORD = SubLObjectFactory.makeSymbol("URL-KEYWORD");
        $kw407$URL = SubLObjectFactory.makeKeyword("URL");
        $sym408$TITLE_KEYWORD = SubLObjectFactory.makeSymbol("TITLE-KEYWORD");
        $kw409$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $sym410$FULL_TEXT_KEYWORD = SubLObjectFactory.makeSymbol("FULL-TEXT-KEYWORD");
        $kw411$FULL_TEXT = SubLObjectFactory.makeKeyword("FULL-TEXT");
        $sym412$SNIPPET_KEYWORD = SubLObjectFactory.makeSymbol("SNIPPET-KEYWORD");
        $kw413$SNIPPET = SubLObjectFactory.makeKeyword("SNIPPET");
        $sym414$OFFSET_IN_FULL_TEXT_KEYWORD = SubLObjectFactory.makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD");
        $kw415$OFFSET_IN_FULL_TEXT = SubLObjectFactory.makeKeyword("OFFSET-IN-FULL-TEXT");
        $sym416$OFFSET_IN_SNIPPET_KEYWORD = SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET-KEYWORD");
        $kw417$OFFSET_IN_SNIPPET = SubLObjectFactory.makeKeyword("OFFSET-IN-SNIPPET");
        $sym418$RANK_KEYWORD = SubLObjectFactory.makeSymbol("RANK-KEYWORD");
        $kw419$RANK = SubLObjectFactory.makeKeyword("RANK");
        $sym420$TOTAL_KEYWORD = SubLObjectFactory.makeSymbol("TOTAL-KEYWORD");
        $kw421$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $sym422$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS");
        $sym423$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE");
        $list424 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)search_engine.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)search_engine.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-IO-ERROR"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym426$GOOGLE_PASSAGE_LIST = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-LIST");
        $sym427$GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD");
        $list428 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym430$GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD");
        $list431 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym433$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD");
        $list434 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym436$GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD");
        $list437 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym439$GOOGLE_CLIENT_INTERACTION_SET_START_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-START-METHOD");
        $sym440$GET_IO_ERROR_FLAG = SubLObjectFactory.makeSymbol("GET-IO-ERROR-FLAG");
        $list441 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-IO-ERROR")));
        $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym443$GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD");
        $list444 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING"));
        $list445 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Could not build answer; the response string ~A created an error: ~A"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQ, (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeKeyword("IO-ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-IO-ERROR"), (SubLObject)search_engine.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Google count is not a digit-string. Setting it to 0.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"), (SubLObject)search_engine.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("URL-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNIPPET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT")), (SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-FULL-TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("FULL-TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD")), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("RANK-KEYWORD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-KEYWORD"))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NEW-GOOGLE-PASSAGE"), SubLObjectFactory.makeSymbol("URL"), SubLObjectFactory.makeSymbol("RANK"), SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("TEXT"), SubLObjectFactory.makeSymbol("SNIPPET"), SubLObjectFactory.makeSymbol("OFFSET-IN-FULL-TEXT"), SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET"), SubLObjectFactory.makeSymbol("TOTAL") }))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Response ~A is of unwanted type ~S."), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-VERSION"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Response ~A is of unwanted type ~S."), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("QUIT-DIRECTIVE-TAG"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SPELL-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Response ~A is of unwanted type ~S."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Query directive ~S is not supported."), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $str447$Could_not_build_answer__the_respo = SubLObjectFactory.makeString("Could not build answer; the response string ~A created an error: ~A");
        $kw448$IO_ERROR = SubLObjectFactory.makeKeyword("IO-ERROR");
        $str449$Google_count_is_not_a_digit_strin = SubLObjectFactory.makeString("Google count is not a digit-string. Setting it to 0.");
        $sym450$ADD = SubLObjectFactory.makeSymbol("ADD");
        $str451$Response__A_is_of_unwanted_type__ = SubLObjectFactory.makeString("Response ~A is of unwanted type ~S.");
        $str452$Query_directive__S_is_not_support = SubLObjectFactory.makeString("Query directive ~S is not supported.");
        $sym453$GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");
        $sym454$GET_DIRECTIVE = SubLObjectFactory.makeSymbol("GET-DIRECTIVE");
        $list455 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE")));
        $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym457$GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD");
        $list458 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym460$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD");
        $list461 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("BQ-LIST"), SubLObjectFactory.makeSymbol("QUERY-KEY-ATTR"), SubLObjectFactory.makeSymbol("CLIENT-KEY"), SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), SubLObjectFactory.makeSymbol("DIRECTIVE"), SubLObjectFactory.makeSymbol("QUERY-COUNT-ATTR"), SubLObjectFactory.makeSymbol("DOCNO"), SubLObjectFactory.makeSymbol("QUERY-START-ATTR"), SubLObjectFactory.makeSymbol("START"), SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG") }), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIM-WHITESPACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-OUTPUT-STREAM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym463$XML_WRITER = SubLObjectFactory.makeSymbol("XML-WRITER");
        $sym464$SET_STREAM = SubLObjectFactory.makeSymbol("SET-STREAM");
        $sym465$START_TAG = SubLObjectFactory.makeSymbol("START-TAG");
        $sym466$XML_PRINT = SubLObjectFactory.makeSymbol("XML-PRINT");
        $sym467$END_TAG = SubLObjectFactory.makeSymbol("END-TAG");
        $sym468$GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD");
        $list469 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-IO-ERROR-FLAG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("SERVER-ERROR"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SPELL-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-SPELLING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-VERSION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GOOGLE-PASSAGES")))))));
        $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $kw471$SERVER_ERROR = SubLObjectFactory.makeKeyword("SERVER-ERROR");
        $sym472$GET_GOOGLE_PASSAGES = SubLObjectFactory.makeSymbol("GET-GOOGLE-PASSAGES");
        $sym473$GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD");
        $list474 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))), (SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("SNIPPET-LIST")))));
        $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");
        $sym476$EMPTY_P = SubLObjectFactory.makeSymbol("EMPTY-P");
        $sym477$ALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR");
        $sym478$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym479$LAST_P = SubLObjectFactory.makeSymbol("LAST-P");
        $sym480$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $sym481$GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD");
        $sym482$BASIC_LIST = SubLObjectFactory.makeSymbol("BASIC-LIST");
        $list483 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-MEMBERSHIP-TEMPLATE"));
        $sym484$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS");
        $sym485$BASIC_COLLECTION = SubLObjectFactory.makeSymbol("BASIC-COLLECTION");
        $sym486$CONTENTS = SubLObjectFactory.makeSymbol("CONTENTS");
        $sym487$ELEMENT_EQUALITY_PREDICATE = SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE");
        $sym488$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE");
        $sym489$ACCEPTABLE_P = SubLObjectFactory.makeSymbol("ACCEPTABLE-P");
        $list490 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"));
        $list491 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OF-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IS-COMPLETE"))))));
        $sym492$GOOGLE_PASSAGE = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE");
        $sym493$IS_COMPLETE = SubLObjectFactory.makeSymbol("IS-COMPLETE");
        $sym494$GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD");
        $list495 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTABLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Cannot add ~S to a google-passage-list"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str496$__Cannot_add__S_to_a_google_passa = SubLObjectFactory.makeString("~%Cannot add ~S to a google-passage-list");
        $sym497$GOOGLE_PASSAGE_LIST_ADD_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-LIST-ADD-METHOD");
        $list498 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SNIPPET"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IS-COMPLETE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-URL"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TITLE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SNIPPET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FULL-TEXT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OFFSET-IN-SNIPPET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OFFSET-IN-FULL-TEXT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TOTAL-FOR-RANK"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RANK-AND-TOTAL"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym499$PARSE_TREES = SubLObjectFactory.makeSymbol("PARSE-TREES");
        $sym500$TOTAL = SubLObjectFactory.makeSymbol("TOTAL");
        $sym501$OFFSET_IN_TEXT = SubLObjectFactory.makeSymbol("OFFSET-IN-TEXT");
        $sym502$OFFSET_IN_SNIPPET = SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET");
        $sym503$SNIPPET = SubLObjectFactory.makeSymbol("SNIPPET");
        $sym504$TITLE = SubLObjectFactory.makeSymbol("TITLE");
        $sym505$URL = SubLObjectFactory.makeSymbol("URL");
        $sym506$RANK = SubLObjectFactory.makeSymbol("RANK");
        $sym507$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS");
        $sym508$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE");
        $list509 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the URL of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("URL")));
        $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym511$GOOGLE_PASSAGE_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-SOURCE-METHOD");
        $list512 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)search_engine.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("RANK"))));
        $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym514$GOOGLE_PASSAGE_GET_SCORE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-SCORE-METHOD");
        $list515 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("URL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.T));
        $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym517$GOOGLE_PASSAGE_IS_COMPLETE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-IS-COMPLETE-METHOD");
        $sym518$GET_OFFSET_IN_FULL_TEXT = SubLObjectFactory.makeSymbol("GET-OFFSET-IN-FULL-TEXT");
        $list519 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-TEXT")));
        $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym521$GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD");
        $sym522$GET_OFFSET_IN_SNIPPET = SubLObjectFactory.makeSymbol("GET-OFFSET-IN-SNIPPET");
        $list523 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET-IN-SNIPPET")));
        $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym525$GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD");
        $sym526$GET_URL = SubLObjectFactory.makeSymbol("GET-URL");
        $list527 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("URL")));
        $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym529$GOOGLE_PASSAGE_GET_URL_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-URL-METHOD");
        $sym530$GET_TITLE = SubLObjectFactory.makeSymbol("GET-TITLE");
        $list531 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")));
        $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym533$GOOGLE_PASSAGE_GET_TITLE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-TITLE-METHOD");
        $sym534$GET_CACHED_FILE_ID = SubLObjectFactory.makeSymbol("GET-CACHED-FILE-ID");
        $list535 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-URL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym536$GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD");
        $sym537$GET_FULL_TEXT = SubLObjectFactory.makeSymbol("GET-FULL-TEXT");
        $list538 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CORPUS-PASSAGE-TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym539$GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD");
        $sym540$GET_SNIPPET = SubLObjectFactory.makeSymbol("GET-SNIPPET");
        $list541 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SNIPPET")));
        $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym543$GOOGLE_PASSAGE_GET_SNIPPET_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-SNIPPET-METHOD");
        $sym544$GET_RANK = SubLObjectFactory.makeSymbol("GET-RANK");
        $list545 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")));
        $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym547$GOOGLE_PASSAGE_GET_RANK_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-RANK-METHOD");
        $sym548$GET_TOTAL_FOR_RANK = SubLObjectFactory.makeSymbol("GET-TOTAL-FOR-RANK");
        $list549 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL")));
        $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");
        $sym551$GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD");
        $sym552$GET_RANK_AND_TOTAL = SubLObjectFactory.makeSymbol("GET-RANK-AND-TOTAL");
        $list553 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TOTAL-FOR-RANK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym554$GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD");
        $list555 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this google passage to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym556$GOOGLE_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-PRINT-METHOD");
        $sym557$GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD = SubLObjectFactory.makeSymbol("GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD");
        $str558$Wikipedia = SubLObjectFactory.makeString("Wikipedia");
        $sym559$LUCENE_QUERY = SubLObjectFactory.makeSymbol("LUCENE-QUERY");
        $list560 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym561$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS");
        $sym562$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE");
        $list563 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUERY stringp\n   @return listp; a ranked list @xref lucene-passages matching QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LUCENE-CLIENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"))));
        $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-QUERY-METHOD");
        $sym565$LUCENE_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("LUCENE-QUERY-GET-METHOD");
        $sym566$LUCENE_CLIENT = SubLObjectFactory.makeSymbol("LUCENE-CLIENT");
        $list567 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CLIENT-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLIENT-KEY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SPELLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym568$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS");
        $sym569$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE");
        $sym570$LUCENE_CLIENT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INITIALIZE-METHOD");
        $list571 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeInteger(50)));
        $list572 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("search"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"))));
        $sym573$LUCENE_REQUEST = SubLObjectFactory.makeSymbol("LUCENE-REQUEST");
        $sym574$LUCENE_CLIENT_SEARCH_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-SEARCH-METHOD");
        $list575 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-REQUEST")), (SubLObject)SubLObjectFactory.makeString("count"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"))));
        $sym576$LUCENE_CLIENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-COUNT-METHOD");
        $list577 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)search_engine.TEN_INTEGER));
        $list578 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE-ARG")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DOCNO")), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BUILD-ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-REQUEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLIENT-INTERACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER"))))));
        $sym579$LUCENE_CLIENT_INTERACTION = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION");
        $sym580$LUCENE_CLIENT_LUCENE_REQUEST_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-LUCENE-REQUEST-METHOD");
        $list581 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("search")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("count")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("SubL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("query")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("type")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-COUNT-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("hitnum")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("language")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ID")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTIVE-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-RAW-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ANSWER"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym582$LUCENE_COUNT = SubLObjectFactory.makeSymbol("LUCENE-COUNT");
        $sym583$LUCENE_PASSAGES = SubLObjectFactory.makeSymbol("LUCENE-PASSAGES");
        $sym584$ID_KEYWORD = SubLObjectFactory.makeSymbol("ID-KEYWORD");
        $kw585$ID = SubLObjectFactory.makeKeyword("ID");
        $sym586$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS");
        $sym587$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE");
        $list588 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym590$LUCENE_PASSAGE_LIST = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-LIST");
        $sym591$LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD");
        $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym593$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD");
        $list594 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE"))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Lucene count is not a digit-string. Setting it to 0.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT"), (SubLObject)search_engine.ZERO_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)search_engine.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ID-KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-KEYWORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LUCENE-PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Response is of unwanted type ~S."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-OF"), (SubLObject)SubLObjectFactory.makeSymbol("RESPONSE")))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Query directive ~S is not supported."), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $str596$Lucene_count_is_not_a_digit_strin = SubLObjectFactory.makeString("Lucene count is not a digit-string. Setting it to 0.");
        $str597$Response_is_of_unwanted_type__S_ = SubLObjectFactory.makeString("Response is of unwanted type ~S.");
        $sym598$LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");
        $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym600$LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD");
        $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym602$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD");
        $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym604$LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD");
        $list605 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TYPE-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-COUNT-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("DOCNO"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-LANGUAGE-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBL-DIRECTIVE-TAG")), (SubLObject)search_engine.NIL, (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE-ARG"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TAG"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIM-WHITESPACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-OUTPUT-STREAM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym607$LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD");
        $list608 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)search_engine.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-DIRECTIVE-TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LUCENE-PASSAGES")))))));
        $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym610$GET_LUCENE_PASSAGES = SubLObjectFactory.makeSymbol("GET-LUCENE-PASSAGES");
        $sym611$LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD");
        $list612 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-LIST")))));
        $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");
        $sym614$LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD = SubLObjectFactory.makeSymbol("LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD");
        $sym615$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS");
        $sym616$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE");
        $list617 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OF-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LUCENE-PASSAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IS-COMPLETE"))))));
        $sym618$LUCENE_PASSAGE = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE");
        $sym619$LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD");
        $list620 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTABLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Cannot add ~S to a lucene-passage-list"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str621$__Cannot_add__S_to_a_lucene_passa = SubLObjectFactory.makeString("~%Cannot add ~S to a lucene-passage-list");
        $sym622$LUCENE_PASSAGE_LIST_ADD_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-LIST-ADD-METHOD");
        $list623 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IS-COMPLETE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym624$ID = SubLObjectFactory.makeSymbol("ID");
        $sym625$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS");
        $sym626$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE");
        $list627 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the URL of this passage"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ID")));
        $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");
        $sym629$LUCENE_PASSAGE_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-GET-SOURCE-METHOD");
        $list630 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RANK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)search_engine.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("RANK"))));
        $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");
        $sym632$LUCENE_PASSAGE_GET_SCORE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-GET-SCORE-METHOD");
        $list633 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeSymbol("RANK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)search_engine.T));
        $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");
        $sym635$LUCENE_PASSAGE_IS_COMPLETE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-IS-COMPLETE-METHOD");
        $list636 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this lucene passage to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");
        $sym638$LUCENE_PASSAGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-PRINT-METHOD");
        $sym639$LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD = SubLObjectFactory.makeSymbol("LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD");
        $sym640$CYCL_QUERY = SubLObjectFactory.makeSymbol("CYCL-QUERY");
        $list641 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FROM-KB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FROM-CORPUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym642$PROPERTIES = SubLObjectFactory.makeSymbol("PROPERTIES");
        $sym643$KNOWLEDGE_SOURCES = SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCES");
        $sym644$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS");
        $sym645$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE");
        $list646 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")));
        $list647 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym648$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym649$CYCL_QUERY_P = SubLObjectFactory.makeSymbol("CYCL-QUERY-P");
        $list650 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param QUERY stringp\n   @return listp; a list of variable assignments"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KS"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWLEDGE-SOURCES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT?"), (SubLObject)SubLObjectFactory.makeSymbol("KS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FROM-KB")), (SubLObject)SubLObjectFactory.makeSymbol("KS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS-P"), (SubLObject)SubLObjectFactory.makeSymbol("KS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FROM-CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("KS"))))), (SubLObject)ConsesLow.list((SubLObject)search_engine.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Unknown knowledge source ~a"), (SubLObject)SubLObjectFactory.makeSymbol("KS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))));
        $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");
        $sym652$GET_FROM_KB = SubLObjectFactory.makeSymbol("GET-FROM-KB");
        $sym653$GET_FROM_CORPUS = SubLObjectFactory.makeSymbol("GET-FROM-CORPUS");
        $str654$Unknown_knowledge_source__a = SubLObjectFactory.makeString("Unknown knowledge source ~a");
        $sym655$CYCL_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("CYCL-QUERY-GET-METHOD");
        $list656 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list657 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT mt?; the microtheory from which to get an assignment for this query\n   @return listp; a list of variable assignments"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR-ASSIGNMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))));
        $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");
        $sym659$CYCL_QUERY_GET_FROM_KB_METHOD = SubLObjectFactory.makeSymbol("CYCL-QUERY-GET-FROM-KB-METHOD");
        $list660 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"));
        $list661 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param CORPUS corpus-p; the corpus from which to get an assignment for this query\n   @return listp; a list of variable assignments"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TMP-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TMP-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-ASSIGNMENTS")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("TMP-MT")), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))));
        $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");
        $sym663$GENERATE_ASSIGNMENTS = SubLObjectFactory.makeSymbol("GENERATE-ASSIGNMENTS");
        $sym664$CYCL_QUERY_GET_FROM_CORPUS_METHOD = SubLObjectFactory.makeSymbol("CYCL-QUERY-GET-FROM-CORPUS-METHOD");
        $list665 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("TMP-MT"));
        $list666 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HYP-BINDINGS"), (SubLObject)search_engine.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE-INT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("TMP-MT")), (SubLObject)SubLObjectFactory.makeSymbol("HYP-BINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("TMP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR-ASSIGNMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENTS"))));
        $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");
        $sym668$ANSWER_P = SubLObjectFactory.makeSymbol("ANSWER-P");
        $sym669$CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD = SubLObjectFactory.makeSymbol("CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD");
        $sym670$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $str671$TEMP_MT_ = SubLObjectFactory.makeString("TEMP-MT-");
        $const672$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list673 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $const674$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const675$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $sym676$VAR_ASSIGNMENT = SubLObjectFactory.makeSymbol("VAR-ASSIGNMENT");
        $list677 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym678$JUSTIFICATION = SubLObjectFactory.makeSymbol("JUSTIFICATION");
        $sym679$BINDINGS = SubLObjectFactory.makeSymbol("BINDINGS");
        $sym680$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS");
        $sym681$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE");
        $sym682$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $list683 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this assignment to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<CYC-ASSIGNMENT: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");
        $str685$__CYC_ASSIGNMENT__ = SubLObjectFactory.makeString("#<CYC-ASSIGNMENT: ");
        $sym686$VAR_ASSIGNMENT_PRINT_METHOD = SubLObjectFactory.makeSymbol("VAR-ASSIGNMENT-PRINT-METHOD");
        $list687 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return binding-list-p; the bindings of this assignment"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")));
        $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");
        $sym689$VAR_ASSIGNMENT_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("VAR-ASSIGNMENT-GET-CONTENT-METHOD");
        $list690 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the source of this assignment"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")));
        $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");
        $sym692$VAR_ASSIGNMENT_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("VAR-ASSIGNMENT-GET-SOURCE-METHOD");
        $sym693$WORDNET_QUERY = SubLObjectFactory.makeSymbol("WORDNET-QUERY");
        $list694 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym695$POS = SubLObjectFactory.makeSymbol("POS");
        $sym696$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS");
        $sym697$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE");
        $sym698$WORDNET_POS_P = SubLObjectFactory.makeSymbol("WORDNET-POS-P");
        $list699 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("noun"), (SubLObject)SubLObjectFactory.makeString("verb"), (SubLObject)SubLObjectFactory.makeString("adjective"), (SubLObject)SubLObjectFactory.makeString("adverb"));
        $list700 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of wordnet-glosses for this wordnet query"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOSSES"), (SubLObject)search_engine.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORD-PROXY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("POS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-PROXY-P"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSETS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORDNET-GLOSS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SYNSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS")))), (SubLObject)SubLObjectFactory.makeSymbol("GLOSSES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSSES"))));
        $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORDNET-QUERY-METHOD");
        $sym702$GLOSS = SubLObjectFactory.makeSymbol("GLOSS");
        $sym703$SYNSETS = SubLObjectFactory.makeSymbol("SYNSETS");
        $sym704$WORDNET_QUERY_GET_METHOD = SubLObjectFactory.makeSymbol("WORDNET-QUERY-GET-METHOD");
        $sym705$WORDNET_GLOSS = SubLObjectFactory.makeSymbol("WORDNET-GLOSS");
        $list706 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SOURCE"), (SubLObject)search_engine.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym707$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS");
        $sym708$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE");
        $list709 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the information of this gloss, as a string"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS")));
        $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORDNET-GLOSS-METHOD");
        $sym711$WORDNET_GLOSS_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("WORDNET-GLOSS-GET-CONTENT-METHOD");
        $list712 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return objectp; the source of this gloss\n   @note should become more detailled than just saying wordnet"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeString("Wordnet 1.7.1")));
        $str713$Wordnet_1_7_1 = SubLObjectFactory.makeString("Wordnet 1.7.1");
        $sym714$WORDNET_GLOSS_GET_SOURCE_METHOD = SubLObjectFactory.makeSymbol("WORDNET-GLOSS-GET-SOURCE-METHOD");
        $const715$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const716$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const717$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $int718$200000 = SubLObjectFactory.makeInteger(200000);
        $int719$5000 = SubLObjectFactory.makeInteger(5000);
        $sym720$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym721$_ = SubLObjectFactory.makeSymbol(">");
        $list722 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINAL-COUNT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym723$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list724 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GOOGLE-API-METHOD-INVOCATION-COUNT*"), (SubLObject)search_engine.ZERO_INTEGER));
        $sym725$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym726$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $list727 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT")));
        $str728$_S__ = SubLObjectFactory.makeString("~S~%");
        $sym729$_ = SubLObjectFactory.makeSymbol("<");
        $sym730$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym731$FORT__ = SubLObjectFactory.makeSymbol("FORT-<");
        $kw732$LICENSE_USE = SubLObjectFactory.makeKeyword("LICENSE-USE");
        $kw733$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym734$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str735$http___www_google_com_search_q__A = SubLObjectFactory.makeString("http://www.google.com/search?q=~A&start=~A&num=~A");
    }
}

/*

	Total time: 4336 ms
	 synthetic 
*/