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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class search_engine
    extends
      SubLTranslatedFile
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
  public static SubLObject subloop_reserved_initialize_information_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1566L)
  public static SubLObject subloop_reserved_initialize_information_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1566L)
  public static SubLObject information_p(final SubLObject information)
  {
    return classes.subloop_instanceof_class( information, $sym0$INFORMATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1833L)
  public static SubLObject information_get_source_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
  public static SubLObject get_abstract_passage_vector(final SubLObject abstract_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( abstract_passage, ONE_INTEGER, $sym14$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
  public static SubLObject set_abstract_passage_vector(final SubLObject abstract_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( abstract_passage, value, ONE_INTEGER, $sym14$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
  public static SubLObject subloop_reserved_initialize_abstract_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
  public static SubLObject subloop_reserved_initialize_abstract_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 1981L)
  public static SubLObject abstract_passage_p(final SubLObject abstract_passage)
  {
    return classes.subloop_instanceof_class( abstract_passage, $sym12$ABSTRACT_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 2609L)
  public static SubLObject abstract_passage_equal_method(final SubLObject self, final SubLObject v_object)
  {
    return makeBoolean( NIL != abstract_passage_p( v_object ) && methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ).equalp( methods.funcall_instance_method_with_0_args( v_object,
        $sym19$GET_CONTENT ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 2862L)
  public static SubLObject abstract_passage_similarity_method(final SubLObject self, final SubLObject passage1, final SubLObject passage2)
  {
    assert NIL != abstract_passage_p( passage1 ) : passage1;
    assert NIL != abstract_passage_p( passage2 ) : passage2;
    if( NIL != Strings.stringE( methods.funcall_instance_method_with_0_args( passage1, $sym19$GET_CONTENT ), methods.funcall_instance_method_with_0_args( passage2, $sym19$GET_CONTENT ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) )
    {
      return ONE_INTEGER;
    }
    return scenario.safe_svector_cosine_angle( methods.funcall_instance_method_with_0_args( passage1, $sym25$GET_VECTOR ), methods.funcall_instance_method_with_0_args( passage2, $sym25$GET_VECTOR ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 3417L)
  public static SubLObject abstract_passage_get_dates_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dates = NIL;
    SubLObject date = NIL;
    thread.resetMultipleValues();
    final SubLObject thisday = numeric_date_utilities.decode_universal_date( numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ) );
    final SubLObject thismonth = thread.secondMultipleValue();
    final SubLObject thisyear = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject pday = numeric_date_utilities.decode_universal_date( date_utilities.cycl_date_to_universal_date( methods.funcall_instance_method_with_0_args( self, $sym29$GET_PUBLICATION_DATE ) ) );
    final SubLObject pmonth = thread.secondMultipleValue();
    final SubLObject pyear = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = external_interfaces.resporator( methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject typeXstring = NIL;
    typeXstring = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( typeXstring.first(), $list30, EQL, UNPROVIDED ) )
      {
        date = external_interfaces.parse_date( typeXstring.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != date )
        {
          thread.resetMultipleValues();
          final SubLObject second = numeric_date_utilities.decode_extended_universal_date( date );
          final SubLObject minute = thread.secondMultipleValue();
          final SubLObject hour = thread.thirdMultipleValue();
          final SubLObject day = thread.fourthMultipleValue();
          final SubLObject month = thread.fifthMultipleValue();
          SubLObject year = thread.sixthMultipleValue();
          thread.resetMultipleValues();
          if( year.numE( thisyear ) )
          {
            year = guess_year( pyear, pmonth, pday, month, day );
          }
          dates = ConsesLow.cons( date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, year ), dates );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      typeXstring = cdolist_list_var.first();
    }
    return dates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 4501L)
  public static SubLObject abstract_passage_older_method(final SubLObject self, final SubLObject other_passage)
  {
    assert NIL != abstract_passage_p( other_passage ) : other_passage;
    final SubLObject self_date = methods.funcall_instance_method_with_0_args( self, $sym29$GET_PUBLICATION_DATE );
    final SubLObject other_date = methods.funcall_instance_method_with_0_args( other_passage, $sym29$GET_PUBLICATION_DATE );
    if( NIL == date_utilities.date_p( self_date ) || NIL == date_utilities.date_p( other_date ) )
    {
      return NIL;
    }
    if( NIL != date_utilities.dateL( self_date, other_date ) )
    {
      return T;
    }
    final SubLObject self_doc_id = instances.get_slot( self, $sym35$DOC_ID );
    if( NIL == self_doc_id )
    {
      return NIL;
    }
    if( !self_doc_id.equal( instances.get_slot( other_passage, $sym35$DOC_ID ) ) )
    {
      return NIL;
    }
    final SubLObject self_sentence_num = instances.get_slot( self, $sym36$SENTENCE_NUMBER );
    final SubLObject other_sentence_num = instances.get_slot( other_passage, $sym36$SENTENCE_NUMBER );
    if( !self_sentence_num.isInteger() || !other_sentence_num.isInteger() )
    {
      return NIL;
    }
    return Numbers.numL( self_sentence_num, other_sentence_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 5444L)
  public static SubLObject guess_year(final SubLObject pub_year, final SubLObject pub_month, final SubLObject pub_day, final SubLObject month, final SubLObject day)
  {
    final SubLObject pub_date = date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, pub_day, pub_month, pub_year );
    final SubLObject next_year_date = date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, number_utilities.f_1X( pub_year ) );
    final SubLObject this_year_date = date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, pub_year );
    final SubLObject previous_year_date = date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, number_utilities.f_1_( pub_year ) );
    final SubLObject next_year_delta = cycl_utilities.formula_arg1( date_utilities.time_elapsed( pub_date, next_year_date, UNPROVIDED ), UNPROVIDED );
    final SubLObject this_year_delta = cycl_utilities.formula_arg1( date_utilities.time_elapsed( pub_date, this_year_date, UNPROVIDED ), UNPROVIDED );
    final SubLObject previous_year_delta = cycl_utilities.formula_arg1( date_utilities.time_elapsed( pub_date, previous_year_date, UNPROVIDED ), UNPROVIDED );
    final SubLObject min = Numbers.min( next_year_delta, new SubLObject[] { this_year_delta, previous_year_delta
    } );
    if( min.numE( next_year_delta ) )
    {
      return number_utilities.f_1X( pub_year );
    }
    if( min.numE( this_year_delta ) )
    {
      return pub_year;
    }
    if( min.numE( previous_year_delta ) )
    {
      return number_utilities.f_1_( pub_year );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6334L)
  public static SubLObject abstract_passage_get_publication_date_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6511L)
  public static SubLObject passage_equal(final SubLObject passage1, final SubLObject passage2)
  {
    return methods.funcall_instance_method_with_1_args( passage1, EQUAL, passage2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
  public static SubLObject get_simple_passage_text(final SubLObject simple_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( simple_passage, TWO_INTEGER, $sym42$TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
  public static SubLObject set_simple_passage_text(final SubLObject simple_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( simple_passage, value, TWO_INTEGER, $sym42$TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
  public static SubLObject subloop_reserved_initialize_simple_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
  public static SubLObject subloop_reserved_initialize_simple_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$SIMPLE_PASSAGE, $sym42$TEXT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6675L)
  public static SubLObject simple_passage_p(final SubLObject simple_passage)
  {
    return classes.subloop_instanceof_class( simple_passage, $sym40$SIMPLE_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 6822L)
  public static SubLObject new_simple_passage(final SubLObject text)
  {
    final SubLObject passage = object.new_class_instance( $sym40$SIMPLE_PASSAGE );
    set_simple_passage_text( passage, text );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7068L)
  public static SubLObject simple_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_simple_passage_method = NIL;
    final SubLObject text = get_simple_passage_text( self );
    try
    {
      thread.throwStack.push( $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD );
      try
      {
        print_high.princ( text, stream );
        Dynamic.sublisp_throw( $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_simple_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_simple_passage_method = Errors.handleThrowable( ccatch_env_var, $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_simple_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7237L)
  public static SubLObject simple_passage_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_simple_passage_method = NIL;
    final SubLObject text = get_simple_passage_text( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, text );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_simple_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_simple_passage_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_simple_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject get_corpus_passage_text(final SubLObject corpus_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( corpus_passage, THREE_INTEGER, $sym42$TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject set_corpus_passage_text(final SubLObject corpus_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( corpus_passage, value, THREE_INTEGER, $sym42$TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject get_corpus_passage_corpus(final SubLObject corpus_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( corpus_passage, TWO_INTEGER, $sym56$CORPUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject set_corpus_passage_corpus(final SubLObject corpus_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( corpus_passage, value, TWO_INTEGER, $sym56$CORPUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject subloop_reserved_initialize_corpus_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject subloop_reserved_initialize_corpus_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7359L)
  public static SubLObject corpus_passage_p(final SubLObject corpus_passage)
  {
    return classes.subloop_instanceof_class( corpus_passage, $sym54$CORPUS_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 7846L)
  public static SubLObject corpus_passage_get_corpus_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_corpus_passage_method = NIL;
    final SubLObject corpus = get_corpus_passage_corpus( self );
    try
    {
      thread.throwStack.push( $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, corpus );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_corpus_passage_method = Errors.handleThrowable( ccatch_env_var, $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_corpus_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8001L)
  public static SubLObject abstract_passage_get_vector_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_abstract_passage_method = NIL;
    SubLObject vector = get_abstract_passage_vector( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD );
      try
      {
        if( NIL == vector )
        {
          vector = question.new_string_vector( methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ) );
        }
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD, vector );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_abstract_passage_vector( self, vector );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_abstract_passage_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_abstract_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8227L)
  public static SubLObject corpus_passage_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_corpus_passage_method = NIL;
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, text );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_corpus_passage_method = Errors.handleThrowable( ccatch_env_var, $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_corpus_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 8349L)
  public static SubLObject corpus_passage_identify_entities_method(final SubLObject self, final SubLObject lexicon, SubLObject types_to_identify)
  {
    if( types_to_identify == UNPROVIDED )
    {
      types_to_identify = $list71;
    }
    assert NIL != Types.listp( types_to_identify ) : types_to_identify;
    assert NIL != abstract_lexicon.abstract_lexicon_p( lexicon ) : lexicon;
    methods.funcall_instance_method_with_1_args( lexicon, $sym74$LEARN, methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ) );
    final SubLObject tagger = pos_tagger.get_tagger();
    SubLObject entities = NIL;
    final SubLObject vector_var;
    final SubLObject sentences = vector_var = document.string_sentencify( methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ), UNPROVIDED );
    final SubLObject backwardP_var = NIL;
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sentence = Vectors.aref( vector_var, element_num );
      tagged = pos_tagger.tagger_tag_sentence( tagger, sentence );
      lexified = methods.funcall_instance_method_with_1_args( lexicon, $sym75$LEXIFY_SENTENCE, tagged );
      cdolist_list_var = document.sentence_yield_exhaustive( lexified );
      word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cdolist_list_var_$1 = document.word_info( word );
        lex_entry = NIL;
        lex_entry = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          denot = ( ( NIL != semtrans_lexicon.semtrans_lexicon_p( lexicon ) ) ? semtrans_lexicon.extract_cycl_from_semtrans_lex_entry( lex_entry, UNPROVIDED )
              : methods.funcall_instance_method_with_1_args( lex_entry, $sym76$GET, $kw77$DENOT ) );
          pos_tags = methods.funcall_instance_method_with_1_args( lex_entry, $sym76$GET, $kw78$PENN_TAGS );
          string = methods.funcall_instance_method_with_1_args( lex_entry, $sym76$GET, $kw79$STRING );
          if( Sequences.length( string ).numG( ONE_INTEGER ) && NIL != conses_high.intersection( pos_tags, $list80, UNPROVIDED, UNPROVIDED ) )
          {
            cdolist_list_var_$2 = types_to_identify;
            type = NIL;
            type = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              if( NIL != at_utilities.more_specific_p( denot, type, UNPROVIDED ) )
              {
                if( NIL == kb_accessors.individualP( denot ) )
                {
                  denot = el_utilities.make_el_formula( $const81$InstanceNamedFn, ConsesLow.list( string, denot ), UNPROVIDED );
                }
                entity = focus_entity.new_textual_focus_entity( string, denot, UNPROVIDED );
                methods.funcall_instance_method_with_1_args( entity, $sym82$ADD_PASSAGE, self );
                item_var = entity;
                if( NIL == conses_high.member( item_var, entities, EQUALP, Symbols.symbol_function( IDENTITY ) ) )
                {
                  entities = ConsesLow.cons( item_var, entities );
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
  public static SubLObject corpus_passage_max_instances_method(final SubLObject self, final SubLObject passages)
  {
    assert NIL != Types.listp( passages ) : passages;
    SubLObject max_score = ZERO_INTEGER;
    SubLObject max_passages = NIL;
    SubLObject cdolist_list_var = passages;
    SubLObject passage = NIL;
    passage = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_0_args( passage, $sym87$GET_SCORE ).numG( max_score ) )
      {
        max_score = methods.funcall_instance_method_with_0_args( passage, $sym87$GET_SCORE );
      }
      cdolist_list_var = cdolist_list_var.rest();
      passage = cdolist_list_var.first();
    }
    cdolist_list_var = passages;
    passage = NIL;
    passage = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_0_args( passage, $sym87$GET_SCORE ).numE( max_score ) )
      {
        max_passages = ConsesLow.cons( passage, max_passages );
      }
      cdolist_list_var = cdolist_list_var.rest();
      passage = cdolist_list_var.first();
    }
    return max_passages;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 10364L)
  public static SubLObject corpus_passage_get_parse_trees_method(final SubLObject self)
  {
    final SubLObject v_document = document.new_document( streams_high.make_string_input_stream( methods.funcall_instance_method_with_0_args( self, $sym19$GET_CONTENT ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    SubLObject trees = NIL;
    final SubLObject vector_var = document.document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$3 = document.paragraph_sentences( paragraph );
      backwardP_var_$4 = NIL;
      for( length_$5 = Sequences.length( vector_var_$3 ), v_iteration_$6 = NIL, v_iteration_$6 = ZERO_INTEGER; v_iteration_$6.numL( length_$5 ); v_iteration_$6 = Numbers.add( v_iteration_$6, ONE_INTEGER ) )
      {
        element_num_$7 = ( ( NIL != backwardP_var_$4 ) ? Numbers.subtract( length_$5, v_iteration_$6, ONE_INTEGER ) : v_iteration_$6 );
        sentence = Vectors.aref( vector_var_$3, element_num_$7 );
        sent_string = document.sentence_string( sentence );
        v_parse_tree = NIL;
        if( NIL != sent_string )
        {
          v_parse_tree = methods.funcall_instance_method_with_1_args( methods.funcall_class_method_with_0_args( $sym91$CHARNIAK_PARSER, $sym92$GET_PARSER ), $sym93$PARSE, sent_string );
          if( NIL != v_parse_tree )
          {
            trees = ConsesLow.cons( v_parse_tree, trees );
          }
        }
      }
    }
    return trees;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject get_information_request_timeout(final SubLObject information_request)
  {
    return classes.subloop_get_access_protected_instance_slot( information_request, TWO_INTEGER, $sym97$TIMEOUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject set_information_request_timeout(final SubLObject information_request, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( information_request, value, TWO_INTEGER, $sym97$TIMEOUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject get_information_request_error_handling(final SubLObject information_request)
  {
    return classes.subloop_get_access_protected_instance_slot( information_request, ONE_INTEGER, $sym98$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject set_information_request_error_handling(final SubLObject information_request, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( information_request, value, ONE_INTEGER, $sym98$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject subloop_reserved_initialize_information_request_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject subloop_reserved_initialize_information_request_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11035L)
  public static SubLObject information_request_p(final SubLObject information_request)
  {
    return classes.subloop_instanceof_class( information_request, $sym95$INFORMATION_REQUEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11459L)
  public static SubLObject information_request_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_information_request_method = NIL;
    SubLObject timeout = get_information_request_timeout( self );
    SubLObject error_handling = get_information_request_error_handling( self );
    try
    {
      thread.throwStack.push( $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD );
      try
      {
        object.object_initialize_method( self );
        error_handling = $kw104$WARN;
        timeout = $int105$720;
        Dynamic.sublisp_throw( $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_information_request_timeout( self, timeout );
          set_information_request_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_information_request_method = Errors.handleThrowable( ccatch_env_var, $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_information_request_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
  public static SubLObject get_knowledge_source_query_query(final SubLObject knowledge_source_query)
  {
    return classes.subloop_get_access_protected_instance_slot( knowledge_source_query, THREE_INTEGER, $sym109$QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
  public static SubLObject set_knowledge_source_query_query(final SubLObject knowledge_source_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( knowledge_source_query, value, THREE_INTEGER, $sym109$QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
  public static SubLObject subloop_reserved_initialize_knowledge_source_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
  public static SubLObject subloop_reserved_initialize_knowledge_source_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11616L)
  public static SubLObject knowledge_source_query_p(final SubLObject knowledge_source_query)
  {
    return classes.subloop_instanceof_class( knowledge_source_query, $sym107$KNOWLEDGE_SOURCE_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 11961L)
  public static SubLObject knowledge_source_query_answer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_knowledge_source_query_method = NIL;
    final SubLObject timeout = get_information_request_timeout( self );
    try
    {
      thread.throwStack.push( $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
      try
      {
        SubLObject answers = NIL;
        SubLObject error = NIL;
        SubLObject timedoutP = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym115$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
              try
              {
                thread.throwStack.push( tag );
                final SubLObject _prev_bind_0_$8 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                  SubLObject timer = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                    try
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                      timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                      answers = methods.funcall_instance_method_with_0_args( self, $sym76$GET );
                    }
                    finally
                    {
                      subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      subl_macro_promotions.with_timeout_stop_timer( timer );
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
                  subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$8, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                timedoutP = Errors.handleThrowable( ccatch_env_var, tag );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL != timedoutP )
              {
                Errors.error( $str116$Query_execution_timeout_after__a_, timeout );
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
        catch( final Throwable ccatch_env_var2 )
        {
          error = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          methods.funcall_instance_method_with_1_args( self, $sym117$HANDLE_ERROR, error );
        }
        Dynamic.sublisp_throw( $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, answers );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_information_request_timeout( self, timeout );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var3 )
    {
      catch_var_for_knowledge_source_query_method = Errors.handleThrowable( ccatch_env_var3, $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_knowledge_source_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12402L)
  public static SubLObject knowledge_source_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_knowledge_source_query_method = NIL;
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
      try
      {
        streams_high.write_string( $str121$__QUERY__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( query, stream );
        streams_high.write_string( $str122$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
        Dynamic.sublisp_throw( $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_knowledge_source_query_method = Errors.handleThrowable( ccatch_env_var, $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_knowledge_source_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12679L)
  public static SubLObject knowledge_source_query_handle_error_method(final SubLObject self, final SubLObject error)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_knowledge_source_query_method = NIL;
    final SubLObject error_handling = get_information_request_error_handling( self );
    try
    {
      thread.throwStack.push( $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
      try
      {
        final SubLObject pcase_var = error_handling;
        if( pcase_var.eql( $kw127$THROW ) )
        {
          Errors.error( error );
        }
        else if( pcase_var.eql( $kw104$WARN ) )
        {
          Errors.warn( error );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_information_request_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_knowledge_source_query_method = Errors.handleThrowable( ccatch_env_var, $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_knowledge_source_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
  public static SubLObject get_corpus_query_corpus(final SubLObject corpus_query)
  {
    return classes.subloop_get_access_protected_instance_slot( corpus_query, FOUR_INTEGER, $sym56$CORPUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
  public static SubLObject set_corpus_query_corpus(final SubLObject corpus_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( corpus_query, value, FOUR_INTEGER, $sym56$CORPUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
  public static SubLObject subloop_reserved_initialize_corpus_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
  public static SubLObject subloop_reserved_initialize_corpus_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 12948L)
  public static SubLObject corpus_query_p(final SubLObject corpus_query)
  {
    return classes.subloop_instanceof_class( corpus_query, $sym130$CORPUS_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13269L)
  public static SubLObject corpus_query_get_corpus_path_mapping_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13499L)
  public static SubLObject corpus_query_get_corpus_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_corpus_query_method = NIL;
    final SubLObject corpus = get_corpus_query_corpus( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, corpus );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_query_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_corpus_query_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_corpus_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13620L)
  public static SubLObject corpus_query_get_corpus_path_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_corpus_query_method = NIL;
    final SubLObject corpus = get_corpus_query_corpus( self );
    try
    {
      thread.throwStack.push( $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, conses_high.assoc( corpus, methods.funcall_class_method_with_0_args( self, $sym134$GET_CORPUS_PATH_MAPPING ), EQUALP, UNPROVIDED ).rest() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_query_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_corpus_query_method = Errors.handleThrowable( ccatch_env_var, $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_corpus_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 13843L)
  public static SubLObject corpus_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_corpus_query_method = NIL;
    final SubLObject corpus = get_corpus_query_corpus( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
      try
      {
        streams_high.write_string( $str146$__QUERY_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( corpus, stream );
        streams_high.write_string( $str147$___, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( query, stream );
        streams_high.write_string( $str122$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
        Dynamic.sublisp_throw( $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_query_corpus( self, corpus );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_corpus_query_method = Errors.handleThrowable( ccatch_env_var, $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_corpus_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
  public static SubLObject subloop_reserved_initialize_glimpse_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
  public static SubLObject subloop_reserved_initialize_glimpse_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14163L)
  public static SubLObject glimpse_query_p(final SubLObject glimpse_query)
  {
    return classes.subloop_instanceof_class( glimpse_query, $sym149$GLIMPSE_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14314L)
  public static SubLObject new_glimpse_query(final SubLObject string, SubLObject corpus)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $default_corpus$.getDynamicValue();
    }
    final SubLObject query = object.new_class_instance( $sym149$GLIMPSE_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, corpus );
    if( NIL == methods.funcall_instance_method_with_0_args( query, $sym140$GET_CORPUS_PATH ) )
    {
      Errors.error( $str153$Non_supported_corpus__a, corpus );
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 14711L)
  public static SubLObject glimpse_query_get_corpus_path_mapping_method(final SubLObject self)
  {
    return $list155;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 15193L)
  public static SubLObject glimpse_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_glimpse_query_method = NIL;
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD );
      try
      {
        SubLObject passages = NIL;
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = ask_glimpse( query, reader.bq_cons( ConsesLow.list( $str160$index, methods.funcall_instance_method_with_0_args( self, $sym140$GET_CORPUS_PATH ) ), $list161 ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject current;
          final SubLObject datum = current = v_answer;
          final SubLObject file_tail = cdestructuring_bind.property_list_member( $kw162$FILE, current );
          final SubLObject file = ( NIL != file_tail ) ? conses_high.cadr( file_tail ) : NIL;
          final SubLObject article_tail = cdestructuring_bind.property_list_member( $kw163$ARTICLE, current );
          final SubLObject article = ( NIL != article_tail ) ? conses_high.cadr( article_tail ) : NIL;
          final SubLObject line_tail = cdestructuring_bind.property_list_member( $kw164$LINE, current );
          final SubLObject line = ( NIL != line_tail ) ? conses_high.cadr( line_tail ) : NIL;
          final SubLObject text_tail = cdestructuring_bind.property_list_member( $kw165$TEXT, current );
          final SubLObject text = ( NIL != text_tail ) ? conses_high.cadr( text_tail ) : NIL;
          passages = ConsesLow.cons( new_glimpse_passage( methods.funcall_instance_method_with_0_args( self, $sym59$GET_CORPUS ), file, article, line, text ), passages );
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD, Sequences.remove_duplicates( passages, Symbols.symbol_function( $sym166$PASSAGE_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_glimpse_query_method = Errors.handleThrowable( ccatch_env_var, $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_glimpse_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 15738L)
  public static SubLObject ask_glimpse(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str168$_glimpse_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw169$POST;
    }
    return reader.read_from_string( web_utilities.http_retrieve( reader.bq_cons( ConsesLow.list( $str170$query, query ), ConsesLow.append( options, NIL ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject get_glimpse_passage_line(final SubLObject glimpse_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( glimpse_passage, SIX_INTEGER, $sym173$LINE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject set_glimpse_passage_line(final SubLObject glimpse_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( glimpse_passage, value, SIX_INTEGER, $sym173$LINE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject get_glimpse_passage_article(final SubLObject glimpse_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( glimpse_passage, FIVE_INTEGER, $sym174$ARTICLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject set_glimpse_passage_article(final SubLObject glimpse_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( glimpse_passage, value, FIVE_INTEGER, $sym174$ARTICLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject get_glimpse_passage_file(final SubLObject glimpse_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( glimpse_passage, FOUR_INTEGER, $sym175$FILE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject set_glimpse_passage_file(final SubLObject glimpse_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( glimpse_passage, value, FOUR_INTEGER, $sym175$FILE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject subloop_reserved_initialize_glimpse_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject subloop_reserved_initialize_glimpse_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym171$GLIMPSE_PASSAGE, $sym175$FILE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym171$GLIMPSE_PASSAGE, $sym174$ARTICLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym171$GLIMPSE_PASSAGE, $sym173$LINE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16018L)
  public static SubLObject glimpse_passage_p(final SubLObject glimpse_passage)
  {
    return classes.subloop_instanceof_class( glimpse_passage, $sym171$GLIMPSE_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16349L)
  public static SubLObject new_glimpse_passage(final SubLObject corpus, final SubLObject file, final SubLObject article, final SubLObject line, final SubLObject text)
  {
    assert NIL != Types.stringp( corpus ) : corpus;
    assert NIL != Types.stringp( file ) : file;
    assert NIL != subl_promotions.non_negative_integer_p( line ) : line;
    assert NIL != Strings.string( text ) : text;
    final SubLObject passage = object.new_class_instance( $sym171$GLIMPSE_PASSAGE );
    set_corpus_passage_corpus( passage, corpus );
    set_glimpse_passage_file( passage, file );
    set_glimpse_passage_article( passage, article );
    set_glimpse_passage_line( passage, line );
    set_corpus_passage_text( passage, text );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 16925L)
  public static SubLObject glimpse_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_glimpse_passage_method = NIL;
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
      try
      {
        print_high.princ( glimpse_passage_get_source_method( self ), stream );
        streams_high.terpri( stream );
        if( NIL != text )
        {
          print_high.princ( text, stream );
        }
        Dynamic.sublisp_throw( $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_glimpse_passage_method = Errors.handleThrowable( ccatch_env_var, $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_glimpse_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17173L)
  public static SubLObject glimpse_passage_get_publication_date_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_glimpse_passage_method = NIL;
    final SubLObject file = get_glimpse_passage_file( self );
    try
    {
      thread.throwStack.push( $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
      try
      {
        if( Sequences.length( file ).numG( EIGHT_INTEGER ) )
        {
          final SubLObject year = reader.read_from_string( string_utilities.substring( file, ZERO_INTEGER, FOUR_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject month = reader.read_from_string( string_utilities.substring( file, FOUR_INTEGER, SIX_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject day = reader.read_from_string( string_utilities.substring( file, SIX_INTEGER, EIGHT_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          Dynamic.sublisp_throw( $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, year ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_glimpse_passage_file( self, file );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_glimpse_passage_method = Errors.handleThrowable( ccatch_env_var, $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_glimpse_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17598L)
  public static SubLObject glimpse_passage_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_glimpse_passage_method = NIL;
    final SubLObject line = get_glimpse_passage_line( self );
    final SubLObject article = get_glimpse_passage_article( self );
    final SubLObject file = get_glimpse_passage_file( self );
    final SubLObject corpus = get_corpus_passage_corpus( self );
    try
    {
      thread.throwStack.push( $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, PrintLow.format( NIL, $str189$__Corpus___a___File___a___Article, new SubLObject[] { corpus, file, article, line
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_glimpse_passage_line( self, line );
          set_glimpse_passage_article( self, article );
          set_glimpse_passage_file( self, file );
          set_corpus_passage_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_glimpse_passage_method = Errors.handleThrowable( ccatch_env_var, $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_glimpse_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
  public static SubLObject subloop_reserved_initialize_guruqa_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
  public static SubLObject subloop_reserved_initialize_guruqa_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17808L)
  public static SubLObject guruqa_query_p(final SubLObject guruqa_query)
  {
    return classes.subloop_instanceof_class( guruqa_query, $sym191$GURUQA_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 17958L)
  public static SubLObject new_guruqa_query(final SubLObject string, SubLObject corpus)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $default_corpus$.getDynamicValue();
    }
    final SubLObject query = object.new_class_instance( $sym191$GURUQA_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, corpus );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18261L)
  public static SubLObject guruqa_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_guruqa_query_method = NIL;
    final SubLObject query = get_knowledge_source_query_query( self );
    final SubLObject error_handling = get_information_request_error_handling( self );
    try
    {
      thread.throwStack.push( $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD );
      try
      {
        final SubLObject indices = external_interfaces.guruqa_answer_indexes( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject passages = NIL;
        SubLObject cdolist_list_var = indices;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          passages = ConsesLow.cons( new_guruqa_passage( methods.funcall_instance_method_with_0_args( self, $sym59$GET_CORPUS ), conses_high.getf( index, $kw196$DOC, UNPROVIDED ), conses_high.getf( index, $kw197$SENT,
              UNPROVIDED ), conses_high.getf( index, $kw198$LEN, UNPROVIDED ), instances.get_slot( self, $sym98$ERROR_HANDLING ) ), passages );
          cdolist_list_var = cdolist_list_var.rest();
          index = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD, Sequences.nreverse( passages ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_knowledge_source_query_query( self, query );
          set_information_request_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_guruqa_query_method = Errors.handleThrowable( ccatch_env_var, $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_guruqa_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject get_guruqa_passage_error_handling(final SubLObject guruqa_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( guruqa_passage, SEVEN_INTEGER, $sym98$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject set_guruqa_passage_error_handling(final SubLObject guruqa_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( guruqa_passage, value, SEVEN_INTEGER, $sym98$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject get_guruqa_passage_span(final SubLObject guruqa_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( guruqa_passage, SIX_INTEGER, $sym202$SPAN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject set_guruqa_passage_span(final SubLObject guruqa_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( guruqa_passage, value, SIX_INTEGER, $sym202$SPAN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject get_guruqa_passage_sentence_id(final SubLObject guruqa_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( guruqa_passage, FIVE_INTEGER, $sym203$SENTENCE_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject set_guruqa_passage_sentence_id(final SubLObject guruqa_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( guruqa_passage, value, FIVE_INTEGER, $sym203$SENTENCE_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject get_guruqa_passage_document_id(final SubLObject guruqa_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( guruqa_passage, FOUR_INTEGER, $sym204$DOCUMENT_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject set_guruqa_passage_document_id(final SubLObject guruqa_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( guruqa_passage, value, FOUR_INTEGER, $sym204$DOCUMENT_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject subloop_reserved_initialize_guruqa_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject subloop_reserved_initialize_guruqa_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym200$GURUQA_PASSAGE, $sym204$DOCUMENT_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym200$GURUQA_PASSAGE, $sym203$SENTENCE_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym200$GURUQA_PASSAGE, $sym202$SPAN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym200$GURUQA_PASSAGE, $sym98$ERROR_HANDLING, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 18707L)
  public static SubLObject guruqa_passage_p(final SubLObject guruqa_passage)
  {
    return classes.subloop_instanceof_class( guruqa_passage, $sym200$GURUQA_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 19104L)
  public static SubLObject new_guruqa_passage(final SubLObject corpus, final SubLObject v_document, final SubLObject sentence, SubLObject span, SubLObject error_handling)
  {
    if( span == UNPROVIDED )
    {
      span = ZERO_INTEGER;
    }
    if( error_handling == UNPROVIDED )
    {
      error_handling = $kw127$THROW;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( corpus ) : corpus;
    assert NIL != Types.integerp( v_document ) : v_document;
    assert NIL != subl_promotions.non_negative_integer_p( sentence ) : sentence;
    assert NIL != subl_promotions.non_negative_integer_p( span ) : span;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( error_handling, $list208, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str209$Invalid_error_handling_tag );
    }
    final SubLObject passage = object.new_class_instance( $sym200$GURUQA_PASSAGE );
    set_corpus_passage_corpus( passage, corpus );
    set_guruqa_passage_document_id( passage, v_document );
    set_guruqa_passage_sentence_id( passage, sentence );
    set_guruqa_passage_span( passage, span );
    set_guruqa_passage_error_handling( passage, error_handling );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20025L)
  public static SubLObject guruqa_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_guruqa_passage_method = NIL;
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
      try
      {
        print_high.princ( guruqa_passage_get_source_method( self ), stream );
        streams_high.terpri( stream );
        if( NIL != text )
        {
          print_high.princ( text, stream );
        }
        Dynamic.sublisp_throw( $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_guruqa_passage_method = Errors.handleThrowable( ccatch_env_var, $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_guruqa_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20269L)
  public static SubLObject guruqa_passage_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_guruqa_passage_method = NIL;
    final SubLObject span = get_guruqa_passage_span( self );
    final SubLObject sentence_id = get_guruqa_passage_sentence_id( self );
    final SubLObject document_id = get_guruqa_passage_document_id( self );
    final SubLObject corpus = get_corpus_passage_corpus( self );
    try
    {
      thread.throwStack.push( $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, PrintLow.format( NIL, $str215$Corpus___a__Document___a__Sentenc, new SubLObject[] { corpus, document_id, sentence_id, span
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_guruqa_passage_span( self, span );
          set_guruqa_passage_sentence_id( self, sentence_id );
          set_guruqa_passage_document_id( self, document_id );
          set_corpus_passage_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_guruqa_passage_method = Errors.handleThrowable( ccatch_env_var, $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_guruqa_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20498L)
  public static SubLObject guruqa_passage_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_guruqa_passage_method = NIL;
    final SubLObject span = get_guruqa_passage_span( self );
    final SubLObject sentence_id = get_guruqa_passage_sentence_id( self );
    final SubLObject document_id = get_guruqa_passage_document_id( self );
    SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
      try
      {
        if( NIL == text )
        {
          SubLObject error = NIL;
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym115$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                text = external_interfaces.guruqa_retrieve_passage( document_id, sentence_id, span, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
            guruqa_passage_handle_error_method( self, error );
          }
        }
        Dynamic.sublisp_throw( $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, text );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_guruqa_passage_span( self, span );
          set_guruqa_passage_sentence_id( self, sentence_id );
          set_guruqa_passage_document_id( self, document_id );
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      catch_var_for_guruqa_passage_method = Errors.handleThrowable( ccatch_env_var2, $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_guruqa_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20809L)
  public static SubLObject guruqa_passage_handle_error_method(final SubLObject self, final SubLObject error)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_guruqa_passage_method = NIL;
    final SubLObject error_handling = get_guruqa_passage_error_handling( self );
    try
    {
      thread.throwStack.push( $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
      try
      {
        final SubLObject pcase_var = error_handling;
        if( pcase_var.eql( $kw127$THROW ) )
        {
          Errors.error( error );
        }
        else if( pcase_var.eql( $kw104$WARN ) )
        {
          Errors.warn( error );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_guruqa_passage_error_handling( self, error_handling );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_guruqa_passage_method = Errors.handleThrowable( ccatch_env_var, $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_guruqa_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject get_lemur_query_sentno(final SubLObject lemur_query)
  {
    return classes.subloop_get_access_protected_instance_slot( lemur_query, SIX_INTEGER, $sym224$SENTNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject set_lemur_query_sentno(final SubLObject lemur_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lemur_query, value, SIX_INTEGER, $sym224$SENTNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject get_lemur_query_docno(final SubLObject lemur_query)
  {
    return classes.subloop_get_access_protected_instance_slot( lemur_query, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject set_lemur_query_docno(final SubLObject lemur_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lemur_query, value, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject subloop_reserved_initialize_lemur_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject subloop_reserved_initialize_lemur_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym222$LEMUR_QUERY, $sym225$DOCNO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym222$LEMUR_QUERY, $sym224$SENTNO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 20956L)
  public static SubLObject lemur_query_p(final SubLObject lemur_query)
  {
    return classes.subloop_instanceof_class( lemur_query, $sym222$LEMUR_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 21227L)
  public static SubLObject new_lemur_query(final SubLObject string, SubLObject corpus, SubLObject docno, SubLObject sentno)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $default_corpus$.getDynamicValue();
    }
    if( docno == UNPROVIDED )
    {
      docno = $int228$50;
    }
    if( sentno == UNPROVIDED )
    {
      sentno = $int228$50;
    }
    assert NIL != Types.stringp( string ) : string;
    assert NIL != subl_promotions.positive_integer_p( docno ) : docno;
    assert NIL != subl_promotions.positive_integer_p( sentno ) : sentno;
    final SubLObject query = object.new_class_instance( $sym222$LEMUR_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, corpus );
    set_lemur_query_docno( query, docno );
    set_lemur_query_sentno( query, sentno );
    if( NIL == methods.funcall_instance_method_with_0_args( query, $sym140$GET_CORPUS_PATH ) )
    {
      Errors.error( $str153$Non_supported_corpus__a, corpus );
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 21892L)
  public static SubLObject lemur_query_get_corpus_path_mapping_method(final SubLObject self)
  {
    return $list231;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 22588L)
  public static SubLObject lemur_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lemur_query_method = NIL;
    final SubLObject sentno = get_lemur_query_sentno( self );
    final SubLObject docno = get_lemur_query_docno( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD );
      try
      {
        SubLObject passages = NIL;
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = ask_lemur( query, docno, sentno, ONE_INTEGER, methods.funcall_instance_method_with_0_args( self, $sym140$GET_CORPUS_PATH ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = v_answer;
          SubLObject id = NIL;
          SubLObject score = NIL;
          SubLObject text = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
          id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
          score = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list235 );
          text = current.first();
          current = current.rest();
          if( NIL == current )
          {
            passages = ConsesLow.cons( new_lemur_passage( methods.funcall_instance_method_with_0_args( self, $sym59$GET_CORPUS ), id, score, strip_passage_header( text ) ), passages );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list235 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD, Sequences.nreverse( Sequences.remove_duplicates( passages, Symbols.symbol_function( $sym166$PASSAGE_EQUAL ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lemur_query_sentno( self, sentno );
          set_lemur_query_docno( self, docno );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lemur_query_method = Errors.handleThrowable( ccatch_env_var, $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lemur_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23080L)
  public static SubLObject ask_lemur(final SubLObject query, SubLObject doc_num, SubLObject sent_num, SubLObject l, SubLObject param_file, SubLObject path, SubLObject host, SubLObject port, SubLObject method,
      SubLObject options)
  {
    if( doc_num == UNPROVIDED )
    {
      doc_num = TEN_INTEGER;
    }
    if( sent_num == UNPROVIDED )
    {
      sent_num = TEN_INTEGER;
    }
    if( l == UNPROVIDED )
    {
      l = ONE_INTEGER;
    }
    if( param_file == UNPROVIDED )
    {
      param_file = $str237$_cyc_projects_aquaint_lemur_indic;
    }
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str238$_lemur_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw169$POST;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    return reader.read_from_string( web_utilities.http_retrieve( ConsesLow.listS( ConsesLow.list( $str170$query, query ), ConsesLow.list( $str239$n, sent_num ), ConsesLow.list( $str240$N, doc_num ), ConsesLow.list(
        $str241$l, l ), ConsesLow.list( $str242$p, param_file ), ConsesLow.append( options, NIL ) ), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject get_lemur_passage_score(final SubLObject lemur_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lemur_passage, SIX_INTEGER, $sym245$SCORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject set_lemur_passage_score(final SubLObject lemur_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lemur_passage, value, SIX_INTEGER, $sym245$SCORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject get_lemur_passage_sentence_number(final SubLObject lemur_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lemur_passage, FIVE_INTEGER, $sym36$SENTENCE_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject set_lemur_passage_sentence_number(final SubLObject lemur_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lemur_passage, value, FIVE_INTEGER, $sym36$SENTENCE_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject get_lemur_passage_doc_id(final SubLObject lemur_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lemur_passage, FOUR_INTEGER, $sym35$DOC_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject set_lemur_passage_doc_id(final SubLObject lemur_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lemur_passage, value, FOUR_INTEGER, $sym35$DOC_ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject subloop_reserved_initialize_lemur_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject subloop_reserved_initialize_lemur_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym243$LEMUR_PASSAGE, $sym35$DOC_ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym243$LEMUR_PASSAGE, $sym36$SENTENCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym243$LEMUR_PASSAGE, $sym245$SCORE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23535L)
  public static SubLObject lemur_passage_p(final SubLObject lemur_passage)
  {
    return classes.subloop_instanceof_class( lemur_passage, $sym243$LEMUR_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 23936L)
  public static SubLObject new_lemur_passage(final SubLObject corpus, final SubLObject id_string, final SubLObject score, final SubLObject text)
  {
    final SubLObject passage = object.new_class_instance( $sym243$LEMUR_PASSAGE );
    final SubLObject split = string_utilities.split_string( id_string, $list248 );
    final SubLObject doc_id = string_utilities.bunge( conses_high.butlast( split, UNPROVIDED ), Characters.CHAR_period );
    final SubLObject sentence_number = reader.parse_integer( conses_high.last( split, UNPROVIDED ).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    set_corpus_passage_corpus( passage, corpus );
    set_corpus_passage_text( passage, text );
    set_lemur_passage_doc_id( passage, doc_id );
    set_lemur_passage_sentence_number( passage, sentence_number );
    set_lemur_passage_score( passage, score );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24530L)
  public static SubLObject lemur_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lemur_passage_method = NIL;
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
      try
      {
        print_high.princ( lemur_passage_get_source_method( self ), stream );
        streams_high.terpri( stream );
        print_high.princ( text, stream );
        Dynamic.sublisp_throw( $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lemur_passage_method = Errors.handleThrowable( ccatch_env_var, $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lemur_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24758L)
  public static SubLObject lemur_passage_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lemur_passage_method = NIL;
    final SubLObject score = get_lemur_passage_score( self );
    final SubLObject sentence_number = get_lemur_passage_sentence_number( self );
    final SubLObject doc_id = get_lemur_passage_doc_id( self );
    final SubLObject corpus = get_corpus_passage_corpus( self );
    try
    {
      thread.throwStack.push( $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, PrintLow.format( NIL, $str254$__Corpus___a__Source___a__Sentenc, new SubLObject[] { corpus, doc_id, sentence_number, score
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lemur_passage_score( self, score );
          set_lemur_passage_sentence_number( self, sentence_number );
          set_lemur_passage_doc_id( self, doc_id );
          set_corpus_passage_corpus( self, corpus );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lemur_passage_method = Errors.handleThrowable( ccatch_env_var, $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lemur_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 24985L)
  public static SubLObject lemur_passage_get_publication_date_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lemur_passage_method = NIL;
    final SubLObject doc_id = get_lemur_passage_doc_id( self );
    try
    {
      thread.throwStack.push( $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
      try
      {
        if( Sequences.length( doc_id ).numG( ELEVEN_INTEGER ) )
        {
          final SubLObject year = reader.read_from_string( string_utilities.substring( doc_id, THREE_INTEGER, SEVEN_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject month = reader.read_from_string( string_utilities.substring( doc_id, SEVEN_INTEGER, NINE_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject day = reader.read_from_string( string_utilities.substring( doc_id, NINE_INTEGER, ELEVEN_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          Dynamic.sublisp_throw( $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date( NIL, NIL, NIL, day, month, year ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lemur_passage_doc_id( self, doc_id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lemur_passage_method = Errors.handleThrowable( ccatch_env_var, $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lemur_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25418L)
  public static SubLObject lemur_passage_get_score_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lemur_passage_method = NIL;
    final SubLObject score = get_lemur_passage_score( self );
    try
    {
      thread.throwStack.push( $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, score );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lemur_passage_score( self, score );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lemur_passage_method = Errors.handleThrowable( ccatch_env_var, $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lemur_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
  public static SubLObject get_qaga_query_augmentation_terms(final SubLObject qaga_query)
  {
    return classes.subloop_get_access_protected_instance_slot( qaga_query, FIVE_INTEGER, $sym264$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
  public static SubLObject set_qaga_query_augmentation_terms(final SubLObject qaga_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( qaga_query, value, FIVE_INTEGER, $sym264$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
  public static SubLObject subloop_reserved_initialize_qaga_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
  public static SubLObject subloop_reserved_initialize_qaga_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym262$QAGA_QUERY, $sym264$AUGMENTATION_TERMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25539L)
  public static SubLObject qaga_query_p(final SubLObject qaga_query)
  {
    return classes.subloop_instanceof_class( qaga_query, $sym262$QAGA_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 25785L)
  public static SubLObject new_qaga_query(final SubLObject string, SubLObject corpus)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = $default_corpus$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject query = object.new_class_instance( $sym262$QAGA_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, corpus );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 26233L)
  public static SubLObject qaga_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_qaga_query_method = NIL;
    SubLObject augmentation_terms = get_qaga_query_augmentation_terms( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD );
      try
      {
        SubLObject passages = NIL;
        SubLObject cdolist_list_var;
        final SubLObject answers = cdolist_list_var = external_interfaces.ask_qaga( string_utilities.split_string( query, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject current;
          final SubLObject datum = current = v_answer;
          final SubLObject text_tail = cdestructuring_bind.property_list_member( $kw165$TEXT, current );
          final SubLObject text = ( NIL != text_tail ) ? conses_high.cadr( text_tail ) : NIL;
          final SubLObject docid_tail = cdestructuring_bind.property_list_member( $kw269$DOCID, current );
          final SubLObject docid = ( NIL != docid_tail ) ? conses_high.cadr( docid_tail ) : NIL;
          final SubLObject score_tail = cdestructuring_bind.property_list_member( $kw270$SCORE, current );
          final SubLObject score = ( NIL != score_tail ) ? conses_high.cadr( score_tail ) : NIL;
          final SubLObject augment_tail = cdestructuring_bind.property_list_member( $kw271$AUGMENT, current );
          final SubLObject augment = augmentation_terms = ( NIL != augment_tail ) ? conses_high.cadr( augment_tail ) : NIL;
          passages = ConsesLow.cons( new_lemur_passage( methods.funcall_instance_method_with_0_args( self, $sym59$GET_CORPUS ), docid, score, text ), passages );
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, Sequences.nreverse( Sequences.remove_duplicates( passages, Symbols.symbol_function( $sym166$PASSAGE_EQUAL ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_qaga_query_augmentation_terms( self, augmentation_terms );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_qaga_query_method = Errors.handleThrowable( ccatch_env_var, $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_qaga_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 26651L)
  public static SubLObject qaga_query_get_augmentation_terms_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_qaga_query_method = NIL;
    final SubLObject augmentation_terms = get_qaga_query_augmentation_terms( self );
    try
    {
      thread.throwStack.push( $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, augmentation_terms );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_qaga_query_augmentation_terms( self, augmentation_terms );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_qaga_query_method = Errors.handleThrowable( ccatch_env_var, $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_qaga_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject get_google_query_google_key(final SubLObject google_query)
  {
    return classes.subloop_get_access_protected_instance_slot( google_query, SEVEN_INTEGER, $sym280$GOOGLE_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject set_google_query_google_key(final SubLObject google_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_query, value, SEVEN_INTEGER, $sym280$GOOGLE_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject get_google_query_start(final SubLObject google_query)
  {
    return classes.subloop_get_access_protected_instance_slot( google_query, SIX_INTEGER, $sym281$START );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject set_google_query_start(final SubLObject google_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_query, value, SIX_INTEGER, $sym281$START );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject get_google_query_docno(final SubLObject google_query)
  {
    return classes.subloop_get_access_protected_instance_slot( google_query, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject set_google_query_docno(final SubLObject google_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_query, value, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject subloop_reserved_initialize_google_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject subloop_reserved_initialize_google_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym278$GOOGLE_QUERY, $sym225$DOCNO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym278$GOOGLE_QUERY, $sym281$START, NIL );
    classes.subloop_initialize_slot( new_instance, $sym278$GOOGLE_QUERY, $sym280$GOOGLE_KEY, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27142L)
  public static SubLObject google_query_p(final SubLObject google_query)
  {
    return classes.subloop_instanceof_class( google_query, $sym278$GOOGLE_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 27378L)
  public static SubLObject new_google_query(final SubLObject string, final SubLObject google_key, SubLObject docno, SubLObject sentno, SubLObject start)
  {
    if( docno == UNPROVIDED )
    {
      docno = $int228$50;
    }
    if( sentno == UNPROVIDED )
    {
      sentno = $int228$50;
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.stringp( google_key ) : google_key;
    assert NIL != subl_promotions.positive_integer_p( docno ) : docno;
    assert NIL != subl_promotions.positive_integer_p( start ) : start;
    final SubLObject query = object.new_class_instance( $sym278$GOOGLE_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, $world_wide_web_corpus$.getDynamicValue( thread ) );
    set_google_query_docno( query, docno );
    set_google_query_start( query, start );
    set_google_query_google_key( query, google_key );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28319L)
  public static SubLObject google_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_query_method = NIL;
    final SubLObject google_key = get_google_query_google_key( self );
    final SubLObject start = get_google_query_start( self );
    final SubLObject docno = get_google_query_docno( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_3_args( get_google_client( google_key ), $sym286$SEARCH, query, start, docno ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_query_google_key( self, google_key );
          set_google_query_start( self, start );
          set_google_query_docno( self, docno );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_query_method = Errors.handleThrowable( ccatch_env_var, $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28514L)
  public static SubLObject google_query_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_query_method = NIL;
    final SubLObject google_key = get_google_query_google_key( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args( get_google_client( google_key ), $sym288$COUNT, query ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_query_google_key( self, google_key );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_query_method = Errors.handleThrowable( ccatch_env_var, $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28679L)
  public static SubLObject google_query_quit_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_query_method = NIL;
    final SubLObject google_key = get_google_query_google_key( self );
    try
    {
      thread.throwStack.push( $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( get_google_client( google_key ), $sym292$QUIT );
        Dynamic.sublisp_throw( $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_query_google_key( self, google_key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_query_method = Errors.handleThrowable( ccatch_env_var, $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 28848L)
  public static SubLObject google_query_spelling_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_query_method = NIL;
    final SubLObject google_key = get_google_query_google_key( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args( get_google_client( google_key ), $sym296$SPELLING, query ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_query_google_key( self, google_key );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_query_method = Errors.handleThrowable( ccatch_env_var, $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29027L)
  public static SubLObject google_query_version_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_query_method = NIL;
    final SubLObject google_key = get_google_query_google_key( self );
    try
    {
      thread.throwStack.push( $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_0_args( get_google_client( google_key ), $sym300$VERSION ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_query_google_key( self, google_key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_query_method = Errors.handleThrowable( ccatch_env_var, $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 29885L)
  public static SubLObject get_google_key()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( $google_client_key_file$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    final SubLObject google_key_file = StreamsLow.open( $google_client_key_file$.getDynamicValue( thread ), new SubLObject[] { $kw314$DIRECTION, $kw315$INPUT, $kw316$IF_DOES_NOT_EXIST, $kw317$ERROR
    } );
    final SubLObject google_key = streams_high.read_line( google_key_file, NIL, UNPROVIDED, UNPROVIDED );
    streams_high.close( google_key_file, UNPROVIDED );
    return google_key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30185L)
  public static SubLObject seed_google_client(final SubLObject key, final SubLObject machine, final SubLObject port)
  {
    assert NIL != Types.stringp( key ) : key;
    assert NIL != Types.stringp( machine ) : machine;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    $authorized_google_key$.setDynamicValue( key );
    $google_client_host$.setDynamicValue( machine );
    $google_client_port$.setDynamicValue( port );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30461L)
  public static SubLObject get_google_client(SubLObject licence_key)
  {
    if( licence_key == UNPROVIDED )
    {
      licence_key = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $google_client$.getDynamicValue( thread ) )
    {
      final SubLObject client = object.new_class_instance( $sym318$GOOGLE_CLIENT );
      methods.funcall_instance_method_with_1_args( client, $sym319$SET_HOST, $google_client_host$.getDynamicValue( thread ) );
      methods.funcall_instance_method_with_1_args( client, $sym320$SET_PORT, $google_client_port$.getDynamicValue( thread ) );
      $google_client$.setDynamicValue( client, thread );
    }
    if( NIL != licence_key )
    {
      methods.funcall_instance_method_with_1_args( $google_client$.getDynamicValue( thread ), $sym321$SET_CLIENT_KEY, licence_key );
    }
    else
    {
      methods.funcall_instance_method_with_1_args( $google_client$.getDynamicValue( thread ), $sym321$SET_CLIENT_KEY, $authorized_google_key$.getDynamicValue( thread ) );
    }
    return $google_client$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject get_google_client_client_interaction(final SubLObject google_client)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client, FOUR_INTEGER, $sym324$CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject set_google_client_client_interaction(final SubLObject google_client, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client, value, FOUR_INTEGER, $sym324$CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject get_google_client_client_key(final SubLObject google_client)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client, THREE_INTEGER, $sym325$CLIENT_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject set_google_client_client_key(final SubLObject google_client, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client, value, THREE_INTEGER, $sym325$CLIENT_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject subloop_reserved_initialize_google_client_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject subloop_reserved_initialize_google_client_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym322$TCP_CLIENT, $sym327$HOST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym322$TCP_CLIENT, $sym328$PORT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym318$GOOGLE_CLIENT, $sym325$CLIENT_KEY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym318$GOOGLE_CLIENT, $sym324$CLIENT_INTERACTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 30914L)
  public static SubLObject google_client_p(final SubLObject google_client)
  {
    return classes.subloop_instanceof_class( google_client, $sym318$GOOGLE_CLIENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31562L)
  public static SubLObject google_client_initialize_method(final SubLObject self)
  {
    subloop_tcp_client.tcp_client_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31662L)
  public static SubLObject google_client_set_client_key_method(final SubLObject self, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_method = NIL;
    SubLObject client_key = get_google_client_client_key( self );
    try
    {
      thread.throwStack.push( $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD );
      try
      {
        assert NIL != Types.stringp( key ) : key;
        client_key = key;
        Dynamic.sublisp_throw( $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD, key );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_client_key( self, client_key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_method = Errors.handleThrowable( ccatch_env_var, $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 31794L)
  public static SubLObject google_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject start, SubLObject hits)
  {
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    SubLObject client_interaction = get_google_client_client_interaction( self );
    assert NIL != Types.stringp( directive_arg ) : directive_arg;
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    assert NIL != subl_promotions.non_negative_integer_p( hits ) : hits;
    client_interaction = methods.funcall_instance_method_with_2_args( self, $sym339$BUILD_BASIC_GOOGLE_REQUEST, $str340$search, directive_arg );
    set_google_client_client_interaction( self, client_interaction );
    methods.funcall_instance_method_with_1_args( client_interaction, $sym341$SET_DOCNO, hits );
    methods.funcall_instance_method_with_1_args( client_interaction, $sym342$SET_START, start );
    return methods.funcall_instance_method_with_0_args( self, $sym343$GET_ANSWER_FROM_REQUEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32333L)
  public static SubLObject google_client_count_method(final SubLObject self, final SubLObject directive_arg)
  {
    assert NIL != Types.stringp( directive_arg ) : directive_arg;
    return methods.funcall_instance_method_with_2_args( self, $sym347$GOOGLE_REQUEST, $str348$count, directive_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32516L)
  public static SubLObject google_client_spelling_method(final SubLObject self, final SubLObject directive_arg)
  {
    assert NIL != Types.stringp( directive_arg ) : directive_arg;
    return methods.funcall_instance_method_with_2_args( self, $sym347$GOOGLE_REQUEST, $str351$spell, directive_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32702L)
  public static SubLObject google_client_quit_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_2_args( self, $sym347$GOOGLE_REQUEST, $str354$_quit_, $str355$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32824L)
  public static SubLObject google_client_version_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_2_args( self, $sym347$GOOGLE_REQUEST, $str358$version, $str355$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 32950L)
  public static SubLObject google_client_build_basic_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg)
  {
    final SubLObject client_key = get_google_client_client_key( self );
    final SubLObject request = object.new_class_instance( $sym363$GOOGLE_CLIENT_INTERACTION );
    methods.funcall_instance_method_with_1_args( request, $sym364$SET_KEY, client_key );
    methods.funcall_instance_method_with_1_args( request, $sym365$SET_DIRECTIVE, directive );
    methods.funcall_instance_method_with_1_args( request, $sym366$SET_DIRECTIVE_ARG, directive_arg );
    return request;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 33343L)
  public static SubLObject google_client_get_answer_from_request_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject client_interaction = get_google_client_client_interaction( self );
    SubLObject response = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym115$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          response = methods.funcall_instance_method_with_1_args( self, $sym369$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args( client_interaction, $sym370$REQUEST_STRING ) );
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
    if( !error.isString() )
    {
      methods.funcall_instance_method_with_1_args( client_interaction, $sym371$BUILD_ANSWER, response );
      return methods.funcall_instance_method_with_0_args( client_interaction, $sym372$GET_ANSWER );
    }
    Errors.warn( $str373$Error_when_contacting_Google_serv, error );
    return $kw317$ERROR;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 33996L)
  public static SubLObject google_client_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg)
  {
    SubLObject client_interaction = get_google_client_client_interaction( self );
    client_interaction = methods.funcall_instance_method_with_2_args( self, $sym339$BUILD_BASIC_GOOGLE_REQUEST, directive, directive_arg );
    set_google_client_client_interaction( self, client_interaction );
    return methods.funcall_instance_method_with_0_args( self, $sym343$GET_ANSWER_FROM_REQUEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_google_io_error(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, TEN_INTEGER, $sym378$GOOGLE_IO_ERROR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_google_io_error(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, TEN_INTEGER, $sym378$GOOGLE_IO_ERROR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_google_version(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, NINE_INTEGER, $sym379$GOOGLE_VERSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_google_version(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, NINE_INTEGER, $sym379$GOOGLE_VERSION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_google_spelling(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, EIGHT_INTEGER, $sym380$GOOGLE_SPELLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_google_spelling(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, EIGHT_INTEGER, $sym380$GOOGLE_SPELLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_google_count(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, SEVEN_INTEGER, $sym381$GOOGLE_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_google_count(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, SEVEN_INTEGER, $sym381$GOOGLE_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_google_passages(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, SIX_INTEGER, $sym382$GOOGLE_PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_google_passages(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, SIX_INTEGER, $sym382$GOOGLE_PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_start(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, FIVE_INTEGER, $sym281$START );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_start(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, FIVE_INTEGER, $sym281$START );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_docno(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, FOUR_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_docno(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, FOUR_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_directive_arg(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, THREE_INTEGER, $sym383$DIRECTIVE_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_directive_arg(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, THREE_INTEGER, $sym383$DIRECTIVE_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_directive(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, TWO_INTEGER, $sym384$DIRECTIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_directive(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, TWO_INTEGER, $sym384$DIRECTIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_client_key(final SubLObject google_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( google_client_interaction, ONE_INTEGER, $sym325$CLIENT_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_client_key(final SubLObject google_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_client_interaction, value, ONE_INTEGER, $sym325$CLIENT_KEY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_total_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), $int385$21 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_total_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), $int385$21, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_rank_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWENTY_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_rank_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWENTY_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), NINETEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), NINETEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), EIGHTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), EIGHTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SEVENTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SEVENTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SIXTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SIXTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_title_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FIFTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_title_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FIFTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_url_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOURTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_url_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOURTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_content_keyword(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THIRTEEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_content_keyword(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THIRTEEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_language_attr(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWELVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_language_attr(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWELVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_key_attr(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ELEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_key_attr(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ELEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_start_attr(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_start_attr(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_count_attr(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_count_attr(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_type_attr(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_type_attr(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_query_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_query_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject get_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject set_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = google_client_interaction.isSymbol() ? classes.classes_retrieve_class( google_client_interaction )
        : ( ( NIL != subloop_structures.class_p( google_client_interaction ) ) ? google_client_interaction
            : ( ( NIL != subloop_structures.instance_p( google_client_interaction ) ) ? subloop_structures.instance_class( google_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject subloop_reserved_initialize_google_client_interaction_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym386$SEARCH_DIRECTIVE_TAG, $str340$search );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym387$COUNT_DIRECTIVE_TAG, $str348$count );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym388$SPELL_DIRECTIVE_TAG, $str351$spell );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym389$QUIT_DIRECTIVE_TAG, $str354$_quit_ );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym390$VERSION_DIRECTIVE_TAG, $str358$version );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym391$SUBL_DIRECTIVE_TAG, $str392$SubL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym393$QUERY_TAG, $str170$query );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym394$QUERY_TYPE_ATTR, $str395$type );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym396$QUERY_COUNT_ATTR, $str397$hitnum );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym398$QUERY_START_ATTR, $str399$startnum );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym400$QUERY_KEY_ATTR, $str401$key );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym402$QUERY_LANGUAGE_ATTR, $str403$language );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym404$CONTENT_KEYWORD, $kw405$CONTENT );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym406$URL_KEYWORD, $kw407$URL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym408$TITLE_KEYWORD, $kw409$TITLE );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym410$FULL_TEXT_KEYWORD, $kw411$FULL_TEXT );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym412$SNIPPET_KEYWORD, $kw413$SNIPPET );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym414$OFFSET_IN_FULL_TEXT_KEYWORD, $kw415$OFFSET_IN_FULL_TEXT );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym416$OFFSET_IN_SNIPPET_KEYWORD, $kw417$OFFSET_IN_SNIPPET );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym418$RANK_KEYWORD, $kw419$RANK );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym420$TOTAL_KEYWORD, $kw421$TOTAL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject subloop_reserved_initialize_google_client_interaction_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym325$CLIENT_KEY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym384$DIRECTIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym383$DIRECTIVE_ARG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym225$DOCNO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym281$START, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym382$GOOGLE_PASSAGES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym381$GOOGLE_COUNT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym380$GOOGLE_SPELLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym379$GOOGLE_VERSION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym363$GOOGLE_CLIENT_INTERACTION, $sym378$GOOGLE_IO_ERROR, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 34285L)
  public static SubLObject google_client_interaction_p(final SubLObject google_client_interaction)
  {
    return classes.subloop_instanceof_class( google_client_interaction, $sym363$GOOGLE_CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36566L)
  public static SubLObject google_client_interaction_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject google_io_error = get_google_client_interaction_google_io_error( self );
    SubLObject google_passages = get_google_client_interaction_google_passages( self );
    SubLObject start = get_google_client_interaction_start( self );
    SubLObject docno = get_google_client_interaction_docno( self );
    try
    {
      thread.throwStack.push( $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        object.object_initialize_method( self );
        google_passages = object.new_class_instance( $sym426$GOOGLE_PASSAGE_LIST );
        docno = TEN_INTEGER;
        start = ZERO_INTEGER;
        google_io_error = NIL;
        Dynamic.sublisp_throw( $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_google_io_error( self, google_io_error );
          set_google_client_interaction_google_passages( self, google_passages );
          set_google_client_interaction_start( self, start );
          set_google_client_interaction_docno( self, docno );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36811L)
  public static SubLObject google_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject client_key = get_google_client_interaction_client_key( self );
    try
    {
      thread.throwStack.push( $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        client_key = v_object;
        Dynamic.sublisp_throw( $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_client_key( self, client_key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 36958L)
  public static SubLObject google_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject directive = get_google_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        directive = v_object;
        Dynamic.sublisp_throw( $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37110L)
  public static SubLObject google_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject docno = get_google_client_interaction_docno( self );
    try
    {
      thread.throwStack.push( $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.integerp( v_object ) : v_object;
        docno = v_object;
        Dynamic.sublisp_throw( $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_docno( self, docno );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37255L)
  public static SubLObject google_client_interaction_set_start_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject start = get_google_client_interaction_start( self );
    try
    {
      thread.throwStack.push( $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.integerp( v_object ) : v_object;
        start = v_object;
        Dynamic.sublisp_throw( $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_start( self, start );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37400L)
  public static SubLObject google_client_interaction_get_io_error_flag_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject google_io_error = get_google_client_interaction_google_io_error( self );
    try
    {
      thread.throwStack.push( $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_io_error );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_google_io_error( self, google_io_error );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 37504L)
  public static SubLObject google_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject total_keyword = get_google_client_interaction_total_keyword( self );
    final SubLObject rank_keyword = get_google_client_interaction_rank_keyword( self );
    final SubLObject offset_in_snippet_keyword = get_google_client_interaction_offset_in_snippet_keyword( self );
    final SubLObject offset_in_full_text_keyword = get_google_client_interaction_offset_in_full_text_keyword( self );
    final SubLObject snippet_keyword = get_google_client_interaction_snippet_keyword( self );
    final SubLObject full_text_keyword = get_google_client_interaction_full_text_keyword( self );
    final SubLObject title_keyword = get_google_client_interaction_title_keyword( self );
    final SubLObject url_keyword = get_google_client_interaction_url_keyword( self );
    final SubLObject content_keyword = get_google_client_interaction_content_keyword( self );
    final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag( self );
    final SubLObject quit_directive_tag = get_google_client_interaction_quit_directive_tag( self );
    final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag( self );
    final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag( self );
    final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag( self );
    SubLObject google_io_error = get_google_client_interaction_google_io_error( self );
    SubLObject google_version = get_google_client_interaction_google_version( self );
    SubLObject google_spelling = get_google_client_interaction_google_spelling( self );
    SubLObject google_count = get_google_client_interaction_google_count( self );
    final SubLObject google_passages = get_google_client_interaction_google_passages( self );
    final SubLObject directive = get_google_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject response = NIL;
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym115$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              response = reader.read_from_string( response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
          Errors.warn( $str447$Could_not_build_answer__the_respo, response_string, error );
          Dynamic.sublisp_throw( $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
        }
        if( response == $kw448$IO_ERROR )
        {
          google_io_error = T;
        }
        else if( directive.equalp( count_directive_tag ) )
        {
          if( response.isInteger() )
          {
            google_count = response;
          }
          else
          {
            Errors.warn( $str449$Google_count_is_not_a_digit_strin );
            google_count = ZERO_INTEGER;
          }
        }
        else if( directive.equalp( search_directive_tag ) )
        {
          if( response.isList() )
          {
            SubLObject cdolist_list_var = response;
            SubLObject passage = NIL;
            passage = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject url = conses_high.getf( passage, url_keyword, UNPROVIDED );
              final SubLObject title = conses_high.getf( passage, title_keyword, UNPROVIDED );
              final SubLObject content = conses_high.getf( passage, content_keyword, UNPROVIDED );
              final SubLObject full_text = conses_high.getf( passage, full_text_keyword, UNPROVIDED );
              final SubLObject snippet = conses_high.getf( passage, snippet_keyword, UNPROVIDED );
              final SubLObject offset_in_snippet = conses_high.getf( passage, offset_in_snippet_keyword, UNPROVIDED );
              final SubLObject text = full_text.isString() ? full_text : content;
              final SubLObject offset_in_full_text = full_text.isString() ? conses_high.getf( passage, offset_in_full_text_keyword, UNPROVIDED ) : offset_in_snippet;
              final SubLObject rank = conses_high.getf( passage, rank_keyword, UNPROVIDED );
              final SubLObject total = conses_high.getf( passage, total_keyword, UNPROVIDED );
              methods.funcall_instance_method_with_1_args( google_passages, $sym450$ADD, new_google_passage( url, rank, title, text, snippet, offset_in_full_text, offset_in_snippet, total ) );
              cdolist_list_var = cdolist_list_var.rest();
              passage = cdolist_list_var.first();
            }
          }
          else
          {
            Errors.warn( $str451$Response__A_is_of_unwanted_type__, response, Types.type_of( response ) );
          }
        }
        else if( directive.equalp( version_directive_tag ) )
        {
          if( NIL != list_utilities.property_list_p( response ) )
          {
            google_version = response;
          }
          else
          {
            Errors.warn( $str451$Response__A_is_of_unwanted_type__, response, Types.type_of( response ) );
          }
        }
        else if( !directive.equalp( quit_directive_tag ) )
        {
          if( directive.equalp( spell_directive_tag ) )
          {
            if( NIL != list_utilities.property_list_p( response ) )
            {
              google_spelling = conses_high.second( response );
            }
            else
            {
              Errors.warn( $str451$Response__A_is_of_unwanted_type__, Types.type_of( response ) );
            }
          }
          else
          {
            Errors.warn( $str452$Query_directive__S_is_not_support, directive );
          }
        }
        Dynamic.sublisp_throw( $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_total_keyword( self, total_keyword );
          set_google_client_interaction_rank_keyword( self, rank_keyword );
          set_google_client_interaction_offset_in_snippet_keyword( self, offset_in_snippet_keyword );
          set_google_client_interaction_offset_in_full_text_keyword( self, offset_in_full_text_keyword );
          set_google_client_interaction_snippet_keyword( self, snippet_keyword );
          set_google_client_interaction_full_text_keyword( self, full_text_keyword );
          set_google_client_interaction_title_keyword( self, title_keyword );
          set_google_client_interaction_url_keyword( self, url_keyword );
          set_google_client_interaction_content_keyword( self, content_keyword );
          set_google_client_interaction_version_directive_tag( self, version_directive_tag );
          set_google_client_interaction_quit_directive_tag( self, quit_directive_tag );
          set_google_client_interaction_spell_directive_tag( self, spell_directive_tag );
          set_google_client_interaction_count_directive_tag( self, count_directive_tag );
          set_google_client_interaction_search_directive_tag( self, search_directive_tag );
          set_google_client_interaction_google_io_error( self, google_io_error );
          set_google_client_interaction_google_version( self, google_version );
          set_google_client_interaction_google_spelling( self, google_spelling );
          set_google_client_interaction_google_count( self, google_count );
          set_google_client_interaction_google_passages( self, google_passages );
          set_google_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var2, $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40215L)
  public static SubLObject google_client_interaction_get_directive_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject directive = get_google_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, directive );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40309L)
  public static SubLObject google_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    SubLObject directive_arg = get_google_client_interaction_directive_arg( self );
    try
    {
      thread.throwStack.push( $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        directive_arg = v_object;
        Dynamic.sublisp_throw( $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_directive_arg( self, directive_arg );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 40469L)
  public static SubLObject google_client_interaction_request_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject query_language_attr = get_google_client_interaction_query_language_attr( self );
    final SubLObject query_key_attr = get_google_client_interaction_query_key_attr( self );
    final SubLObject query_start_attr = get_google_client_interaction_query_start_attr( self );
    final SubLObject query_count_attr = get_google_client_interaction_query_count_attr( self );
    final SubLObject query_type_attr = get_google_client_interaction_query_type_attr( self );
    final SubLObject query_tag = get_google_client_interaction_query_tag( self );
    final SubLObject subl_directive_tag = get_google_client_interaction_subl_directive_tag( self );
    final SubLObject start = get_google_client_interaction_start( self );
    final SubLObject docno = get_google_client_interaction_docno( self );
    final SubLObject directive_arg = get_google_client_interaction_directive_arg( self );
    final SubLObject directive = get_google_client_interaction_directive( self );
    final SubLObject client_key = get_google_client_interaction_client_key( self );
    try
    {
      thread.throwStack.push( $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject result = $str355$;
        if( NIL != client_key && NIL != directive && NIL != directive_arg )
        {
          final SubLObject outstream = streams_high.make_string_output_stream();
          final SubLObject v_xml_writer = object.new_class_instance( $sym463$XML_WRITER );
          methods.funcall_instance_method_with_1_args( v_xml_writer, $sym464$SET_STREAM, outstream );
          methods.funcall_instance_method_with_4_args( v_xml_writer, $sym465$START_TAG, query_tag, ConsesLow.list( new SubLObject[] { query_key_attr, client_key, query_type_attr, directive, query_count_attr, docno,
            query_start_attr, start, query_language_attr, subl_directive_tag
          } ), NIL, NIL );
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym466$XML_PRINT, directive_arg, NIL );
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym467$END_TAG, query_tag, NIL );
          result = string_utilities.trim_whitespace( streams_high.get_output_stream_string( outstream ) );
        }
        Dynamic.sublisp_throw( $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_query_language_attr( self, query_language_attr );
          set_google_client_interaction_query_key_attr( self, query_key_attr );
          set_google_client_interaction_query_start_attr( self, query_start_attr );
          set_google_client_interaction_query_count_attr( self, query_count_attr );
          set_google_client_interaction_query_type_attr( self, query_type_attr );
          set_google_client_interaction_query_tag( self, query_tag );
          set_google_client_interaction_subl_directive_tag( self, subl_directive_tag );
          set_google_client_interaction_start( self, start );
          set_google_client_interaction_docno( self, docno );
          set_google_client_interaction_directive_arg( self, directive_arg );
          set_google_client_interaction_directive( self, directive );
          set_google_client_interaction_client_key( self, client_key );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 41199L)
  public static SubLObject google_client_interaction_get_answer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag( self );
    final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag( self );
    final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag( self );
    final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag( self );
    final SubLObject google_version = get_google_client_interaction_google_version( self );
    final SubLObject google_spelling = get_google_client_interaction_google_spelling( self );
    final SubLObject google_count = get_google_client_interaction_google_count( self );
    final SubLObject directive = get_google_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym440$GET_IO_ERROR_FLAG ) )
        {
          Dynamic.sublisp_throw( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, $kw471$SERVER_ERROR );
        }
        else if( directive.equalp( count_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_count );
        }
        else if( directive.equalp( spell_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_spelling );
        }
        else if( directive.equalp( version_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_version );
        }
        else if( directive.equalp( search_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args( self, $sym472$GET_GOOGLE_PASSAGES ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_version_directive_tag( self, version_directive_tag );
          set_google_client_interaction_spell_directive_tag( self, spell_directive_tag );
          set_google_client_interaction_count_directive_tag( self, count_directive_tag );
          set_google_client_interaction_search_directive_tag( self, search_directive_tag );
          set_google_client_interaction_google_version( self, google_version );
          set_google_client_interaction_google_spelling( self, google_spelling );
          set_google_client_interaction_google_count( self, google_count );
          set_google_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 41666L)
  public static SubLObject google_client_interaction_get_google_passages_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_client_interaction_method = NIL;
    final SubLObject google_passages = get_google_client_interaction_google_passages( self );
    try
    {
      thread.throwStack.push( $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject snippet_list = NIL;
        SubLObject enumerator = NIL;
        if( NIL == methods.funcall_instance_method_with_0_args( google_passages, $sym476$EMPTY_P ) )
        {
          enumerator = methods.funcall_instance_method_with_0_args( google_passages, $sym477$ALLOCATE_ENUMERATOR );
          snippet_list = ConsesLow.cons( methods.funcall_instance_method_with_0_args( enumerator, $sym478$FIRST ), snippet_list );
          while ( NIL == methods.funcall_instance_method_with_0_args( enumerator, $sym479$LAST_P ))
          {
            snippet_list = ConsesLow.cons( methods.funcall_instance_method_with_0_args( enumerator, $sym480$NEXT ), snippet_list );
          }
        }
        Dynamic.sublisp_throw( $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, Sequences.nreverse( snippet_list ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_client_interaction_google_passages( self, google_passages );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
  public static SubLObject subloop_reserved_initialize_google_passage_list_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
  public static SubLObject subloop_reserved_initialize_google_passage_list_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym485$BASIC_COLLECTION, $sym486$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym485$BASIC_COLLECTION, $sym487$ELEMENT_EQUALITY_PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42172L)
  public static SubLObject google_passage_list_p(final SubLObject google_passage_list)
  {
    return classes.subloop_instanceof_class( google_passage_list, $sym426$GOOGLE_PASSAGE_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42515L)
  public static SubLObject google_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element)
  {
    return makeBoolean( NIL != instances.instance_of_p( new_element, $sym492$GOOGLE_PASSAGE ) && NIL != methods.funcall_instance_method_with_0_args( new_element, $sym493$IS_COMPLETE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42708L)
  public static SubLObject google_passage_list_add_method(final SubLObject self, final SubLObject new_element)
  {
    if( NIL != methods.funcall_instance_method_with_1_args( self, $sym489$ACCEPTABLE_P, new_element ) )
    {
      methods.funcall_instance_super_method_with_1_args( self, $sym450$ADD, new_element );
    }
    else
    {
      Errors.warn( $str496$__Cannot_add__S_to_a_google_passa, new_element );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_parse_trees(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, ELEVEN_INTEGER, $sym499$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_parse_trees(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, ELEVEN_INTEGER, $sym499$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_total(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, TEN_INTEGER, $sym500$TOTAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_total(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, TEN_INTEGER, $sym500$TOTAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_offset_in_text(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, NINE_INTEGER, $sym501$OFFSET_IN_TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_offset_in_text(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, NINE_INTEGER, $sym501$OFFSET_IN_TEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_offset_in_snippet(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, EIGHT_INTEGER, $sym502$OFFSET_IN_SNIPPET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_offset_in_snippet(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, EIGHT_INTEGER, $sym502$OFFSET_IN_SNIPPET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_snippet(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, SEVEN_INTEGER, $sym503$SNIPPET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_snippet(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, SEVEN_INTEGER, $sym503$SNIPPET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_title(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, SIX_INTEGER, $sym504$TITLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_title(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, SIX_INTEGER, $sym504$TITLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_url(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, FIVE_INTEGER, $sym505$URL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_url(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, FIVE_INTEGER, $sym505$URL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject get_google_passage_rank(final SubLObject google_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( google_passage, FOUR_INTEGER, $sym506$RANK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject set_google_passage_rank(final SubLObject google_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( google_passage, value, FOUR_INTEGER, $sym506$RANK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject subloop_reserved_initialize_google_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject subloop_reserved_initialize_google_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym506$RANK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym505$URL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym504$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym503$SNIPPET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym502$OFFSET_IN_SNIPPET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym501$OFFSET_IN_TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym500$TOTAL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym492$GOOGLE_PASSAGE, $sym499$PARSE_TREES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 42987L)
  public static SubLObject google_passage_p(final SubLObject google_passage)
  {
    return classes.subloop_instanceof_class( google_passage, $sym492$GOOGLE_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 43970L)
  public static SubLObject new_google_passage(final SubLObject url, final SubLObject rank, final SubLObject title, final SubLObject text, SubLObject snippet, SubLObject text_offset, SubLObject snippet_offset,
      SubLObject total)
  {
    if( snippet == UNPROVIDED )
    {
      snippet = NIL;
    }
    if( text_offset == UNPROVIDED )
    {
      text_offset = NIL;
    }
    if( snippet_offset == UNPROVIDED )
    {
      snippet_offset = NIL;
    }
    if( total == UNPROVIDED )
    {
      total = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( url ) : url;
    assert NIL != subl_promotions.non_negative_integer_p( rank ) : rank;
    assert NIL != Types.stringp( text ) : text;
    assert NIL != Types.stringp( title ) : title;
    if( NIL != text_offset )
    {
      assert NIL != subl_promotions.non_negative_integer_p( text_offset ) : text_offset;
    }
    else
    {
      text_offset = ZERO_INTEGER;
    }
    if( NIL != snippet )
    {
      assert NIL != Types.stringp( snippet ) : snippet;
    }
    else
    {
      snippet = text;
      snippet_offset = text_offset;
    }
    if( NIL != snippet_offset )
    {
      assert NIL != subl_promotions.non_negative_integer_p( snippet_offset ) : snippet_offset;
    }
    else
    {
      snippet_offset = ZERO_INTEGER;
    }
    if( NIL != total )
    {
      assert NIL != subl_promotions.non_negative_integer_p( total ) : total;
    }
    else
    {
      total = ZERO_INTEGER;
    }
    final SubLObject passage = object.new_class_instance( $sym492$GOOGLE_PASSAGE );
    set_corpus_passage_corpus( passage, $world_wide_web_corpus$.getDynamicValue( thread ) );
    set_corpus_passage_text( passage, text );
    set_google_passage_url( passage, url );
    set_google_passage_title( passage, title );
    set_google_passage_rank( passage, rank );
    set_google_passage_snippet( passage, snippet );
    set_google_passage_offset_in_text( passage, text_offset );
    set_google_passage_offset_in_snippet( passage, snippet_offset );
    set_google_passage_total( passage, total );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45207L)
  public static SubLObject google_passage_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject url = get_google_passage_url( self );
    try
    {
      thread.throwStack.push( $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_url( self, url );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45330L)
  public static SubLObject google_passage_get_score_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject rank = get_google_passage_rank( self );
    try
    {
      thread.throwStack.push( $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, Numbers.divide( ONE_INTEGER, rank ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_rank( self, rank );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45410L)
  public static SubLObject google_passage_is_complete_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject url = get_google_passage_url( self );
    final SubLObject rank = get_google_passage_rank( self );
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        if( NIL == subl_promotions.non_negative_integer_p( rank ) )
        {
          Dynamic.sublisp_throw( $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL );
        }
        if( !url.isString() )
        {
          Dynamic.sublisp_throw( $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL );
        }
        if( !text.isString() )
        {
          Dynamic.sublisp_throw( $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL );
        }
        Dynamic.sublisp_throw( $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_url( self, url );
          set_google_passage_rank( self, rank );
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45609L)
  public static SubLObject google_passage_get_offset_in_full_text_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject offset_in_text = get_google_passage_offset_in_text( self );
    try
    {
      thread.throwStack.push( $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_text );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_offset_in_text( self, offset_in_text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45708L)
  public static SubLObject google_passage_get_offset_in_snippet_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject offset_in_snippet = get_google_passage_offset_in_snippet( self );
    try
    {
      thread.throwStack.push( $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_snippet );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_offset_in_snippet( self, offset_in_snippet );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45807L)
  public static SubLObject google_passage_get_url_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject url = get_google_passage_url( self );
    try
    {
      thread.throwStack.push( $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_url( self, url );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45878L)
  public static SubLObject google_passage_get_title_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject title = get_google_passage_title( self );
    try
    {
      thread.throwStack.push( $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, title );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_title( self, title );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 45953L)
  public static SubLObject google_passage_get_cached_file_id_method(final SubLObject self)
  {
    return google_passage_get_url_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46046L)
  public static SubLObject google_passage_get_full_text_method(final SubLObject self)
  {
    return get_corpus_passage_text( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46150L)
  public static SubLObject google_passage_get_snippet_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject snippet = get_google_passage_snippet( self );
    try
    {
      thread.throwStack.push( $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, snippet );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_snippet( self, snippet );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46229L)
  public static SubLObject google_passage_get_rank_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject rank = get_google_passage_rank( self );
    try
    {
      thread.throwStack.push( $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, rank );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_rank( self, rank );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46302L)
  public static SubLObject google_passage_get_total_for_rank_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_google_passage_method = NIL;
    final SubLObject total = get_google_passage_total( self );
    try
    {
      thread.throwStack.push( $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, total );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_google_passage_total( self, total );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_google_passage_method = Errors.handleThrowable( ccatch_env_var, $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_google_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46386L)
  public static SubLObject google_passage_get_rank_and_total_method(final SubLObject self)
  {
    return Values.values( google_passage_get_rank_method( self ), google_passage_get_total_for_rank_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46515L)
  public static SubLObject google_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    print_high.princ( google_passage_get_source_method( self ), stream );
    streams_high.terpri( stream );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 46749L)
  public static SubLObject google_passage_get_publication_date_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject get_lucene_query_sentno(final SubLObject lucene_query)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_query, SIX_INTEGER, $sym224$SENTNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject set_lucene_query_sentno(final SubLObject lucene_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_query, value, SIX_INTEGER, $sym224$SENTNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject get_lucene_query_docno(final SubLObject lucene_query)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_query, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject set_lucene_query_docno(final SubLObject lucene_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_query, value, FIVE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject subloop_reserved_initialize_lucene_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject subloop_reserved_initialize_lucene_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym130$CORPUS_QUERY, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym559$LUCENE_QUERY, $sym225$DOCNO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym559$LUCENE_QUERY, $sym224$SENTNO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47028L)
  public static SubLObject lucene_query_p(final SubLObject lucene_query)
  {
    return classes.subloop_instanceof_class( lucene_query, $sym559$LUCENE_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47185L)
  public static SubLObject new_lucene_query(final SubLObject string, SubLObject docno, SubLObject sentno)
  {
    if( docno == UNPROVIDED )
    {
      docno = $int228$50;
    }
    if( sentno == UNPROVIDED )
    {
      sentno = $int228$50;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != subl_promotions.positive_integer_p( docno ) : docno;
    assert NIL != subl_promotions.positive_integer_p( sentno ) : sentno;
    final SubLObject query = object.new_class_instance( $sym559$LUCENE_QUERY );
    set_knowledge_source_query_query( query, string );
    set_corpus_query_corpus( query, $wikipedia$.getDynamicValue( thread ) );
    set_lucene_query_docno( query, docno );
    set_lucene_query_sentno( query, sentno );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 47734L)
  public static SubLObject lucene_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_query_method = NIL;
    final SubLObject docno = get_lucene_query_docno( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD, methods.funcall_instance_method_with_2_args( get_lucene_client(), $sym286$SEARCH, query, docno ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_query_docno( self, docno );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_query_method = Errors.handleThrowable( ccatch_env_var, $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48058L)
  public static SubLObject seed_lucene_client(final SubLObject machine, final SubLObject port)
  {
    assert NIL != Types.stringp( machine ) : machine;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    $lucene_client_host$.setDynamicValue( machine );
    $lucene_client_port$.setDynamicValue( port );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48264L)
  public static SubLObject get_lucene_client()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $lucene_client$.getDynamicValue( thread ) )
    {
      $lucene_client$.setDynamicValue( object.new_class_instance( $sym566$LUCENE_CLIENT ), thread );
      methods.funcall_instance_method_with_1_args( $lucene_client$.getDynamicValue( thread ), $sym319$SET_HOST, $lucene_client_host$.getDynamicValue( thread ) );
      methods.funcall_instance_method_with_1_args( $lucene_client$.getDynamicValue( thread ), $sym320$SET_PORT, $lucene_client_port$.getDynamicValue( thread ) );
    }
    return $lucene_client$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
  public static SubLObject get_lucene_client_client_interaction(final SubLObject lucene_client)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client, THREE_INTEGER, $sym324$CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
  public static SubLObject set_lucene_client_client_interaction(final SubLObject lucene_client, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client, value, THREE_INTEGER, $sym324$CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
  public static SubLObject subloop_reserved_initialize_lucene_client_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
  public static SubLObject subloop_reserved_initialize_lucene_client_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym322$TCP_CLIENT, $sym327$HOST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym322$TCP_CLIENT, $sym328$PORT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym566$LUCENE_CLIENT, $sym324$CLIENT_INTERACTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48533L)
  public static SubLObject lucene_client_p(final SubLObject lucene_client)
  {
    return classes.subloop_instanceof_class( lucene_client, $sym566$LUCENE_CLIENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 48978L)
  public static SubLObject lucene_client_initialize_method(final SubLObject self)
  {
    subloop_tcp_client.tcp_client_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49078L)
  public static SubLObject lucene_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject docno)
  {
    if( docno == UNPROVIDED )
    {
      docno = $int228$50;
    }
    assert NIL != Types.stringp( directive_arg ) : directive_arg;
    return methods.funcall_instance_method_with_3_args( self, $sym573$LUCENE_REQUEST, $str340$search, directive_arg, docno );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49291L)
  public static SubLObject lucene_client_count_method(final SubLObject self, final SubLObject directive_arg)
  {
    assert NIL != Types.stringp( directive_arg ) : directive_arg;
    return methods.funcall_instance_method_with_2_args( self, $sym573$LUCENE_REQUEST, $str348$count, directive_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 49474L)
  public static SubLObject lucene_client_lucene_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg, SubLObject docno)
  {
    if( docno == UNPROVIDED )
    {
      docno = TEN_INTEGER;
    }
    SubLObject client_interaction = get_lucene_client_client_interaction( self );
    final SubLObject request = object.new_class_instance( $sym579$LUCENE_CLIENT_INTERACTION );
    methods.funcall_instance_method_with_1_args( request, $sym365$SET_DIRECTIVE, directive );
    methods.funcall_instance_method_with_1_args( request, $sym366$SET_DIRECTIVE_ARG, directive_arg );
    methods.funcall_instance_method_with_1_args( request, $sym341$SET_DOCNO, docno );
    client_interaction = request;
    set_lucene_client_client_interaction( self, client_interaction );
    methods.funcall_instance_method_with_1_args( client_interaction, $sym371$BUILD_ANSWER, methods.funcall_instance_method_with_1_args( self, $sym369$PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(
        client_interaction, $sym370$REQUEST_STRING ) ) );
    return methods.funcall_instance_method_with_0_args( client_interaction, $sym372$GET_ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client_interaction, FIVE_INTEGER, $sym582$LUCENE_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client_interaction, value, FIVE_INTEGER, $sym582$LUCENE_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client_interaction, FOUR_INTEGER, $sym583$LUCENE_PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client_interaction, value, FOUR_INTEGER, $sym583$LUCENE_PASSAGES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client_interaction, THREE_INTEGER, $sym383$DIRECTIVE_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client_interaction, value, THREE_INTEGER, $sym383$DIRECTIVE_ARG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_directive(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client_interaction, TWO_INTEGER, $sym384$DIRECTIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_directive(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client_interaction, value, TWO_INTEGER, $sym384$DIRECTIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_docno(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_client_interaction, ONE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_docno(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_client_interaction, value, ONE_INTEGER, $sym225$DOCNO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), NINE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), EIGHT_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject get_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject set_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value)
  {
    final SubLObject v_class = lucene_client_interaction.isSymbol() ? classes.classes_retrieve_class( lucene_client_interaction )
        : ( ( NIL != subloop_structures.class_p( lucene_client_interaction ) ) ? lucene_client_interaction
            : ( ( NIL != subloop_structures.instance_p( lucene_client_interaction ) ) ? subloop_structures.instance_class( lucene_client_interaction ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject subloop_reserved_initialize_lucene_client_interaction_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym386$SEARCH_DIRECTIVE_TAG, $str340$search );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym387$COUNT_DIRECTIVE_TAG, $str348$count );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym391$SUBL_DIRECTIVE_TAG, $str392$SubL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym393$QUERY_TAG, $str170$query );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym394$QUERY_TYPE_ATTR, $str395$type );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym396$QUERY_COUNT_ATTR, $str397$hitnum );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym402$QUERY_LANGUAGE_ATTR, $str403$language );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym584$ID_KEYWORD, $kw585$ID );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym404$CONTENT_KEYWORD, $kw405$CONTENT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject subloop_reserved_initialize_lucene_client_interaction_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym225$DOCNO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym384$DIRECTIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym383$DIRECTIVE_ARG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym583$LUCENE_PASSAGES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym579$LUCENE_CLIENT_INTERACTION, $sym582$LUCENE_COUNT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 50153L)
  public static SubLObject lucene_client_interaction_p(final SubLObject lucene_client_interaction)
  {
    return classes.subloop_instanceof_class( lucene_client_interaction, $sym579$LUCENE_CLIENT_INTERACTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51409L)
  public static SubLObject lucene_client_interaction_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages( self );
    try
    {
      thread.throwStack.push( $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        object.object_initialize_method( self );
        lucene_passages = object.new_class_instance( $sym590$LUCENE_PASSAGE_LIST );
        Dynamic.sublisp_throw( $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_lucene_passages( self, lucene_passages );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51587L)
  public static SubLObject lucene_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    SubLObject directive = get_lucene_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        directive = v_object;
        Dynamic.sublisp_throw( $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 51739L)
  public static SubLObject lucene_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    final SubLObject content_keyword = get_lucene_client_interaction_content_keyword( self );
    final SubLObject id_keyword = get_lucene_client_interaction_id_keyword( self );
    final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag( self );
    final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag( self );
    SubLObject lucene_count = get_lucene_client_interaction_lucene_count( self );
    final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages( self );
    final SubLObject directive = get_lucene_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject response = NIL;
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym115$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              response = reader.read_from_string( response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
          Errors.warn( error );
          Dynamic.sublisp_throw( $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
        }
        if( directive.equalp( count_directive_tag ) )
        {
          if( response.isInteger() )
          {
            lucene_count = response;
          }
          else
          {
            Errors.warn( $str596$Lucene_count_is_not_a_digit_strin );
            lucene_count = ZERO_INTEGER;
          }
        }
        else if( directive.equalp( search_directive_tag ) )
        {
          if( response.isList() )
          {
            final SubLObject rank = ONE_INTEGER;
            SubLObject cdolist_list_var = response;
            SubLObject passage = NIL;
            passage = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject id = conses_high.getf( passage, id_keyword, UNPROVIDED );
              final SubLObject text = conses_high.getf( passage, content_keyword, UNPROVIDED );
              methods.funcall_instance_method_with_1_args( lucene_passages, $sym450$ADD, new_lucene_passage( id, rank, text ) );
              cdolist_list_var = cdolist_list_var.rest();
              passage = cdolist_list_var.first();
            }
          }
          else
          {
            Errors.warn( $str597$Response_is_of_unwanted_type__S_, Types.type_of( response ) );
          }
        }
        else
        {
          Errors.warn( $str452$Query_directive__S_is_not_support, directive );
        }
        Dynamic.sublisp_throw( $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_content_keyword( self, content_keyword );
          set_lucene_client_interaction_id_keyword( self, id_keyword );
          set_lucene_client_interaction_count_directive_tag( self, count_directive_tag );
          set_lucene_client_interaction_search_directive_tag( self, search_directive_tag );
          set_lucene_client_interaction_lucene_count( self, lucene_count );
          set_lucene_client_interaction_lucene_passages( self, lucene_passages );
          set_lucene_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var2, $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 52771L)
  public static SubLObject lucene_client_interaction_get_directive_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    final SubLObject directive = get_lucene_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, directive );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 52865L)
  public static SubLObject lucene_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    SubLObject directive_arg = get_lucene_client_interaction_directive_arg( self );
    try
    {
      thread.throwStack.push( $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.stringp( v_object ) : v_object;
        directive_arg = v_object;
        Dynamic.sublisp_throw( $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_directive_arg( self, directive_arg );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53025L)
  public static SubLObject lucene_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    SubLObject docno = get_lucene_client_interaction_docno( self );
    try
    {
      thread.throwStack.push( $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        assert NIL != Types.integerp( v_object ) : v_object;
        docno = v_object;
        Dynamic.sublisp_throw( $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_docno( self, docno );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53170L)
  public static SubLObject lucene_client_interaction_request_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    final SubLObject query_language_attr = get_lucene_client_interaction_query_language_attr( self );
    final SubLObject query_count_attr = get_lucene_client_interaction_query_count_attr( self );
    final SubLObject query_type_attr = get_lucene_client_interaction_query_type_attr( self );
    final SubLObject query_tag = get_lucene_client_interaction_query_tag( self );
    final SubLObject subl_directive_tag = get_lucene_client_interaction_subl_directive_tag( self );
    final SubLObject directive_arg = get_lucene_client_interaction_directive_arg( self );
    final SubLObject directive = get_lucene_client_interaction_directive( self );
    final SubLObject docno = get_lucene_client_interaction_docno( self );
    try
    {
      thread.throwStack.push( $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject result = $str355$;
        if( NIL != directive && NIL != directive_arg )
        {
          final SubLObject outstream = streams_high.make_string_output_stream();
          final SubLObject v_xml_writer = object.new_class_instance( $sym463$XML_WRITER );
          methods.funcall_instance_method_with_1_args( v_xml_writer, $sym464$SET_STREAM, outstream );
          methods.funcall_instance_method_with_4_args( v_xml_writer, $sym465$START_TAG, query_tag, ConsesLow.list( query_type_attr, directive, query_count_attr, docno, query_language_attr, subl_directive_tag ), NIL,
              NIL );
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym466$XML_PRINT, directive_arg, NIL );
          methods.funcall_instance_method_with_2_args( v_xml_writer, $sym467$END_TAG, query_tag, NIL );
          result = string_utilities.trim_whitespace( streams_high.get_output_stream_string( outstream ) );
        }
        Dynamic.sublisp_throw( $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_query_language_attr( self, query_language_attr );
          set_lucene_client_interaction_query_count_attr( self, query_count_attr );
          set_lucene_client_interaction_query_type_attr( self, query_type_attr );
          set_lucene_client_interaction_query_tag( self, query_tag );
          set_lucene_client_interaction_subl_directive_tag( self, subl_directive_tag );
          set_lucene_client_interaction_directive_arg( self, directive_arg );
          set_lucene_client_interaction_directive( self, directive );
          set_lucene_client_interaction_docno( self, docno );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 53820L)
  public static SubLObject lucene_client_interaction_get_answer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag( self );
    final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag( self );
    final SubLObject lucene_count = get_lucene_client_interaction_lucene_count( self );
    final SubLObject directive = get_lucene_client_interaction_directive( self );
    try
    {
      thread.throwStack.push( $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        if( directive.equalp( count_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, lucene_count );
        }
        else if( directive.equalp( search_directive_tag ) )
        {
          Dynamic.sublisp_throw( $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args( self, $sym610$GET_LUCENE_PASSAGES ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_count_directive_tag( self, count_directive_tag );
          set_lucene_client_interaction_search_directive_tag( self, search_directive_tag );
          set_lucene_client_interaction_lucene_count( self, lucene_count );
          set_lucene_client_interaction_directive( self, directive );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54073L)
  public static SubLObject lucene_client_interaction_get_lucene_passages_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_client_interaction_method = NIL;
    final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages( self );
    try
    {
      thread.throwStack.push( $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
      try
      {
        SubLObject passage_list = NIL;
        SubLObject enumerator = NIL;
        if( NIL == methods.funcall_instance_method_with_0_args( lucene_passages, $sym476$EMPTY_P ) )
        {
          enumerator = methods.funcall_instance_method_with_0_args( lucene_passages, $sym477$ALLOCATE_ENUMERATOR );
          passage_list = ConsesLow.cons( methods.funcall_instance_method_with_0_args( enumerator, $sym478$FIRST ), passage_list );
          while ( NIL == methods.funcall_instance_method_with_0_args( enumerator, $sym479$LAST_P ))
          {
            passage_list = ConsesLow.cons( methods.funcall_instance_method_with_0_args( enumerator, $sym480$NEXT ), passage_list );
          }
        }
        Dynamic.sublisp_throw( $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, Sequences.nreverse( passage_list ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_client_interaction_lucene_passages( self, lucene_passages );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_client_interaction_method = Errors.handleThrowable( ccatch_env_var, $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_client_interaction_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
  public static SubLObject subloop_reserved_initialize_lucene_passage_list_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
  public static SubLObject subloop_reserved_initialize_lucene_passage_list_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym485$BASIC_COLLECTION, $sym486$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym485$BASIC_COLLECTION, $sym487$ELEMENT_EQUALITY_PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54579L)
  public static SubLObject lucene_passage_list_p(final SubLObject lucene_passage_list)
  {
    return classes.subloop_instanceof_class( lucene_passage_list, $sym590$LUCENE_PASSAGE_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 54922L)
  public static SubLObject lucene_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element)
  {
    return makeBoolean( NIL != instances.instance_of_p( new_element, $sym618$LUCENE_PASSAGE ) && NIL != methods.funcall_instance_method_with_0_args( new_element, $sym493$IS_COMPLETE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55115L)
  public static SubLObject lucene_passage_list_add_method(final SubLObject self, final SubLObject new_element)
  {
    if( NIL != methods.funcall_instance_method_with_1_args( self, $sym489$ACCEPTABLE_P, new_element ) )
    {
      methods.funcall_instance_super_method_with_1_args( self, $sym450$ADD, new_element );
    }
    else
    {
      Errors.warn( $str621$__Cannot_add__S_to_a_lucene_passa, new_element );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject get_lucene_passage_parse_trees(final SubLObject lucene_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_passage, SIX_INTEGER, $sym499$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject set_lucene_passage_parse_trees(final SubLObject lucene_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_passage, value, SIX_INTEGER, $sym499$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject get_lucene_passage_id(final SubLObject lucene_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_passage, FIVE_INTEGER, $sym624$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject set_lucene_passage_id(final SubLObject lucene_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_passage, value, FIVE_INTEGER, $sym624$ID );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject get_lucene_passage_rank(final SubLObject lucene_passage)
  {
    return classes.subloop_get_access_protected_instance_slot( lucene_passage, FOUR_INTEGER, $sym506$RANK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject set_lucene_passage_rank(final SubLObject lucene_passage, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lucene_passage, value, FOUR_INTEGER, $sym506$RANK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject subloop_reserved_initialize_lucene_passage_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject subloop_reserved_initialize_lucene_passage_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym12$ABSTRACT_PASSAGE, $sym14$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym56$CORPUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym54$CORPUS_PASSAGE, $sym42$TEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym618$LUCENE_PASSAGE, $sym506$RANK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym618$LUCENE_PASSAGE, $sym624$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym618$LUCENE_PASSAGE, $sym499$PARSE_TREES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55394L)
  public static SubLObject lucene_passage_p(final SubLObject lucene_passage)
  {
    return classes.subloop_instanceof_class( lucene_passage, $sym618$LUCENE_PASSAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 55697L)
  public static SubLObject new_lucene_passage(final SubLObject id, final SubLObject rank, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( id ) : id;
    assert NIL != subl_promotions.non_negative_integer_p( rank ) : rank;
    assert NIL != Types.stringp( text ) : text;
    final SubLObject passage = object.new_class_instance( $sym618$LUCENE_PASSAGE );
    set_corpus_passage_corpus( passage, $wikipedia$.getDynamicValue( thread ) );
    set_corpus_passage_text( passage, text );
    set_lucene_passage_id( passage, id );
    set_lucene_passage_rank( passage, rank );
    return passage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56103L)
  public static SubLObject lucene_passage_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_passage_method = NIL;
    final SubLObject id = get_lucene_passage_id( self );
    try
    {
      thread.throwStack.push( $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, id );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_passage_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_passage_method = Errors.handleThrowable( ccatch_env_var, $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56225L)
  public static SubLObject lucene_passage_get_score_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_passage_method = NIL;
    final SubLObject rank = get_lucene_passage_rank( self );
    try
    {
      thread.throwStack.push( $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
      try
      {
        if( NIL == rank )
        {
          Dynamic.sublisp_throw( $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, ZERO_INTEGER );
        }
        Dynamic.sublisp_throw( $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, Numbers.divide( ONE_INTEGER, rank ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_passage_rank( self, rank );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_passage_method = Errors.handleThrowable( ccatch_env_var, $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56383L)
  public static SubLObject lucene_passage_is_complete_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_passage_method = NIL;
    final SubLObject id = get_lucene_passage_id( self );
    final SubLObject rank = get_lucene_passage_rank( self );
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
      try
      {
        if( NIL == subl_promotions.non_negative_integer_p( rank ) )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL );
        }
        if( !id.isString() )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL );
        }
        if( !text.isString() )
        {
          Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL );
        }
        Dynamic.sublisp_throw( $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lucene_passage_id( self, id );
          set_lucene_passage_rank( self, rank );
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_passage_method = Errors.handleThrowable( ccatch_env_var, $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56581L)
  public static SubLObject lucene_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lucene_passage_method = NIL;
    final SubLObject text = get_corpus_passage_text( self );
    try
    {
      thread.throwStack.push( $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
      try
      {
        print_high.princ( lucene_passage_get_source_method( self ), stream );
        streams_high.terpri( stream );
        print_high.princ( text, stream );
        Dynamic.sublisp_throw( $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_corpus_passage_text( self, text );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_lucene_passage_method = Errors.handleThrowable( ccatch_env_var, $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lucene_passage_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56813L)
  public static SubLObject lucene_passage_get_publication_date_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject get_cycl_query_properties(final SubLObject cycl_query)
  {
    return classes.subloop_get_access_protected_instance_slot( cycl_query, FIVE_INTEGER, $sym642$PROPERTIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject set_cycl_query_properties(final SubLObject cycl_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cycl_query, value, FIVE_INTEGER, $sym642$PROPERTIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject get_cycl_query_knowledge_sources(final SubLObject cycl_query)
  {
    return classes.subloop_get_access_protected_instance_slot( cycl_query, FOUR_INTEGER, $sym643$KNOWLEDGE_SOURCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject set_cycl_query_knowledge_sources(final SubLObject cycl_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cycl_query, value, FOUR_INTEGER, $sym643$KNOWLEDGE_SOURCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject subloop_reserved_initialize_cycl_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject subloop_reserved_initialize_cycl_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym640$CYCL_QUERY, $sym643$KNOWLEDGE_SOURCES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym640$CYCL_QUERY, $sym642$PROPERTIES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 56988L)
  public static SubLObject cycl_query_p(final SubLObject cycl_query)
  {
    return classes.subloop_instanceof_class( cycl_query, $sym640$CYCL_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 57435L)
  public static SubLObject new_cycl_query(final SubLObject formula, SubLObject knowledge_sources, SubLObject v_properties)
  {
    if( knowledge_sources == UNPROVIDED )
    {
      knowledge_sources = $list646;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = $list647;
    }
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    assert NIL != Types.listp( knowledge_sources ) : knowledge_sources;
    assert NIL != Types.listp( v_properties ) : v_properties;
    final SubLObject query = object.new_class_instance( $sym640$CYCL_QUERY );
    set_knowledge_source_query_query( query, formula );
    set_cycl_query_knowledge_sources( query, knowledge_sources );
    set_cycl_query_properties( query, v_properties );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58003L)
  public static SubLObject cycl_query_equal_p(final SubLObject obj1, final SubLObject obj2)
  {
    assert NIL != cycl_query_p( obj1 ) : obj1;
    assert NIL != cycl_query_p( obj2 ) : obj2;
    return Equality.equalp( instances.get_slot( obj1, $sym109$QUERY ), instances.get_slot( obj2, $sym109$QUERY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58182L)
  public static SubLObject cycl_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_query_method = NIL;
    final SubLObject knowledge_sources = get_cycl_query_knowledge_sources( self );
    try
    {
      thread.throwStack.push( $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
      try
      {
        SubLObject assignments = NIL;
        SubLObject cdolist_list_var = knowledge_sources;
        SubLObject ks = NIL;
        ks = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != fort_types_interface.mtP( ks ) )
          {
            assignments = ConsesLow.append( assignments, methods.funcall_instance_method_with_1_args( self, $sym652$GET_FROM_KB, ks ) );
          }
          else if( NIL != corpus_p( ks ) )
          {
            assignments = ConsesLow.append( assignments, methods.funcall_instance_method_with_1_args( self, $sym653$GET_FROM_CORPUS, ks ) );
          }
          else
          {
            Errors.error( $str654$Unknown_knowledge_source__a, ks );
          }
          cdolist_list_var = cdolist_list_var.rest();
          ks = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_query_knowledge_sources( self, knowledge_sources );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cycl_query_method = Errors.handleThrowable( ccatch_env_var, $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58631L)
  public static SubLObject corpus_p(final SubLObject v_object)
  {
    return Types.stringp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 58690L)
  public static SubLObject cycl_query_get_from_kb_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_query_method = NIL;
    final SubLObject v_properties = get_cycl_query_properties( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
      try
      {
        final SubLObject answers = inference_kernel.new_cyc_query( query, mt, v_properties );
        SubLObject assignments = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          assignments = ConsesLow.cons( new_var_assignment( v_answer.first(), conses_high.second( v_answer ) ), assignments );
          cdolist_list_var = cdolist_list_var.rest();
          v_answer = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_query_properties( self, v_properties );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cycl_query_method = Errors.handleThrowable( ccatch_env_var, $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 59092L)
  public static SubLObject cycl_query_get_from_corpus_method(final SubLObject self, final SubLObject corpus)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_query_method = NIL;
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
      try
      {
        final SubLObject paraphrase = pph_question.generate_question( query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject v_question = ( NIL != paraphrase ) ? question.new_question( paraphrase, ConsesLow.list( corpus ), UNPROVIDED ) : NIL;
        final SubLObject tmp_mt = new_tmp_mt( UNPROVIDED );
        SubLObject assignments = NIL;
        if( NIL != v_question )
        {
          print_high.princ( v_question, UNPROVIDED );
          streams_high.terpri( UNPROVIDED );
          SubLObject cdolist_list_var = ConsesLow.list( methods.funcall_instance_method_with_0_args( v_question, $sym112$ANSWER ).first() );
          SubLObject v_answer = NIL;
          v_answer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            print_high.princ( v_answer, UNPROVIDED );
            streams_high.terpri( UNPROVIDED );
            assignments = ConsesLow.append( methods.funcall_instance_method_with_2_args( self, $sym663$GENERATE_ASSIGNMENTS, v_answer, tmp_mt ), assignments );
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cycl_query_method = Errors.handleThrowable( ccatch_env_var, $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 59716L)
  public static SubLObject cycl_query_generate_assignments_method(final SubLObject self, final SubLObject v_answer, final SubLObject tmp_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_query_method = NIL;
    final SubLObject v_properties = get_cycl_query_properties( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
      try
      {
        assert NIL != answer.answer_p( v_answer ) : v_answer;
        SubLObject assignments = NIL;
        SubLObject hyp_bindings = NIL;
        SubLObject cdolist_list_var = cyclifier.cyclify( methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONTENT ), UNPROVIDED );
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          hyp_bindings = ConsesLow.cons( prove.fi_hypothesize_int( cycl, tmp_mt, UNPROVIDED, UNPROVIDED ), hyp_bindings );
          cdolist_list_var = cdolist_list_var.rest();
          cycl = cdolist_list_var.first();
        }
        cdolist_list_var = inference_kernel.new_cyc_query( query, tmp_mt, v_properties );
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          assignments = ConsesLow.cons( new_var_assignment( binding.first(), ConsesLow.list( conses_high.second( binding ), v_answer ) ), assignments );
          cdolist_list_var = cdolist_list_var.rest();
          binding = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_query_properties( self, v_properties );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cycl_query_method = Errors.handleThrowable( ccatch_env_var, $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60346L)
  public static SubLObject new_tmp_mt(SubLObject super_mt)
  {
    if( super_mt == UNPROVIDED )
    {
      super_mt = NIL;
    }
    if( NIL != super_mt && !assertionsDisabledInClass && NIL == fort_types_interface.microtheory_p( super_mt ) )
    {
      throw new AssertionError( super_mt );
    }
    final SubLObject spec_mt = fi.fi_create_int( print_high.princ_to_string( Symbols.gensym( $str671$TEMP_MT_ ) ), UNPROVIDED );
    fi.fi_assert_int( ConsesLow.listS( $const672$isa, spec_mt, $list673 ), $const674$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    if( NIL != super_mt )
    {
      fi.fi_assert_int( ConsesLow.list( $const675$genlMt, spec_mt, super_mt ), $const674$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
    }
    return spec_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject get_var_assignment_justification(final SubLObject var_assignment)
  {
    return classes.subloop_get_access_protected_instance_slot( var_assignment, TWO_INTEGER, $sym678$JUSTIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject set_var_assignment_justification(final SubLObject var_assignment, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( var_assignment, value, TWO_INTEGER, $sym678$JUSTIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject get_var_assignment_bindings(final SubLObject var_assignment)
  {
    return classes.subloop_get_access_protected_instance_slot( var_assignment, ONE_INTEGER, $sym679$BINDINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject set_var_assignment_bindings(final SubLObject var_assignment, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( var_assignment, value, ONE_INTEGER, $sym679$BINDINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject subloop_reserved_initialize_var_assignment_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject subloop_reserved_initialize_var_assignment_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym676$VAR_ASSIGNMENT, $sym679$BINDINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym676$VAR_ASSIGNMENT, $sym678$JUSTIFICATION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 60782L)
  public static SubLObject var_assignment_p(final SubLObject var_assignment)
  {
    return classes.subloop_instanceof_class( var_assignment, $sym676$VAR_ASSIGNMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61101L)
  public static SubLObject new_var_assignment(final SubLObject v_bindings, SubLObject justification)
  {
    if( justification == UNPROVIDED )
    {
      justification = NIL;
    }
    assert NIL != bindings.bindings_p( v_bindings ) : v_bindings;
    final SubLObject assignment = object.new_class_instance( $sym676$VAR_ASSIGNMENT );
    set_var_assignment_bindings( assignment, v_bindings );
    set_var_assignment_justification( assignment, justification );
    return assignment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61408L)
  public static SubLObject var_assignment_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_var_assignment_method = NIL;
    final SubLObject v_bindings = get_var_assignment_bindings( self );
    try
    {
      thread.throwStack.push( $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
      try
      {
        streams_high.write_string( $str685$__CYC_ASSIGNMENT__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( v_bindings, stream );
        streams_high.write_string( $str122$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_var_assignment_bindings( self, v_bindings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_var_assignment_method = Errors.handleThrowable( ccatch_env_var, $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_var_assignment_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61659L)
  public static SubLObject var_assignment_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_var_assignment_method = NIL;
    final SubLObject v_bindings = get_var_assignment_bindings( self );
    try
    {
      thread.throwStack.push( $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, v_bindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_var_assignment_bindings( self, v_bindings );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_var_assignment_method = Errors.handleThrowable( ccatch_env_var, $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_var_assignment_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61801L)
  public static SubLObject var_assignment_get_source_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_var_assignment_method = NIL;
    final SubLObject justification = get_var_assignment_justification( self );
    try
    {
      thread.throwStack.push( $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, justification );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_var_assignment_justification( self, justification );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_var_assignment_method = Errors.handleThrowable( ccatch_env_var, $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_var_assignment_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
  public static SubLObject get_wordnet_query_pos(final SubLObject wordnet_query)
  {
    return classes.subloop_get_access_protected_instance_slot( wordnet_query, FOUR_INTEGER, $sym695$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
  public static SubLObject set_wordnet_query_pos(final SubLObject wordnet_query, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( wordnet_query, value, FOUR_INTEGER, $sym695$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
  public static SubLObject subloop_reserved_initialize_wordnet_query_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
  public static SubLObject subloop_reserved_initialize_wordnet_query_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym98$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym95$INFORMATION_REQUEST, $sym97$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym107$KNOWLEDGE_SOURCE_QUERY, $sym109$QUERY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym693$WORDNET_QUERY, $sym695$POS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 61934L)
  public static SubLObject wordnet_query_p(final SubLObject wordnet_query)
  {
    return classes.subloop_instanceof_class( wordnet_query, $sym693$WORDNET_QUERY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62130L)
  public static SubLObject new_wordnet_query(final SubLObject word, final SubLObject pos)
  {
    assert NIL != Types.stringp( word ) : word;
    assert NIL != wordnet_pos_p( pos ) : pos;
    final SubLObject query = object.new_class_instance( $sym693$WORDNET_QUERY );
    set_knowledge_source_query_query( query, word );
    set_wordnet_query_pos( query, pos );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62530L)
  public static SubLObject wordnet_pos_p(final SubLObject string)
  {
    return conses_high.member( string, $list699, EQUALP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 62723L)
  public static SubLObject wordnet_query_get_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wordnet_query_method = NIL;
    final SubLObject pos = get_wordnet_query_pos( self );
    final SubLObject query = get_knowledge_source_query_query( self );
    try
    {
      thread.throwStack.push( $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD );
      try
      {
        SubLObject glosses = NIL;
        final SubLObject word = wordnet_proxy.new_word_proxy( query, pos );
        if( NIL != wordnet_proxy.word_proxy_p( word ) )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( word, $sym703$SYNSETS );
          SubLObject synset = NIL;
          synset = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            glosses = ConsesLow.cons( new_wordnet_gloss( instances.get_slot( synset, $sym702$GLOSS ) ), glosses );
            cdolist_list_var = cdolist_list_var.rest();
            synset = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD, glosses );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_wordnet_query_pos( self, pos );
          set_knowledge_source_query_query( self, query );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_wordnet_query_method = Errors.handleThrowable( ccatch_env_var, $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wordnet_query_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
  public static SubLObject get_wordnet_gloss_gloss(final SubLObject wordnet_gloss)
  {
    return classes.subloop_get_access_protected_instance_slot( wordnet_gloss, ONE_INTEGER, $sym702$GLOSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
  public static SubLObject set_wordnet_gloss_gloss(final SubLObject wordnet_gloss, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( wordnet_gloss, value, ONE_INTEGER, $sym702$GLOSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
  public static SubLObject subloop_reserved_initialize_wordnet_gloss_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym3$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
  public static SubLObject subloop_reserved_initialize_wordnet_gloss_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym5$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym705$WORDNET_GLOSS, $sym702$GLOSS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63066L)
  public static SubLObject wordnet_gloss_p(final SubLObject wordnet_gloss)
  {
    return classes.subloop_instanceof_class( wordnet_gloss, $sym705$WORDNET_GLOSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63354L)
  public static SubLObject new_wordnet_gloss(final SubLObject string)
  {
    final SubLObject gloss = object.new_class_instance( $sym705$WORDNET_GLOSS );
    set_wordnet_gloss_gloss( gloss, string );
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63570L)
  public static SubLObject wordnet_gloss_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wordnet_gloss_method = NIL;
    final SubLObject gloss = get_wordnet_gloss_gloss( self );
    try
    {
      thread.throwStack.push( $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD, gloss );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_wordnet_gloss_gloss( self, gloss );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_wordnet_gloss_method = Errors.handleThrowable( ccatch_env_var, $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wordnet_gloss_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63710L)
  public static SubLObject wordnet_gloss_get_source_method(final SubLObject self)
  {
    return $str713$Wordnet_1_7_1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 63904L)
  public static SubLObject strip_passage_header(final SubLObject string)
  {
    final SubLObject position = Sequences.position( Characters.CHAR_underbar, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != position ) ? string_utilities.strip_first_n( string, number_utilities.f_1X( position ) ) : string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 64158L)
  public static SubLObject passage_similarity(final SubLObject passage1, final SubLObject passage2)
  {
    assert NIL != abstract_passage_p( passage1 ) : passage1;
    assert NIL != abstract_passage_p( passage2 ) : passage2;
    return methods.funcall_class_method_with_2_args( $sym12$ABSTRACT_PASSAGE, $sym21$SIMILARITY, passage1, passage2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 64584L)
  public static SubLObject augment_search_string(final SubLObject word_string, SubLObject num)
  {
    if( num == UNPROVIDED )
    {
      num = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject denots = lexicon_accessors.denots_of_string( word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject auxiliary_forts = NIL;
    SubLObject auxiliary_terms = NIL;
    final SubLObject ass_count = assertion_handles.assertion_count();
    SubLObject cdolist_list_var = denots;
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isa_in_any_mtP( denot, $const715$Collection ) )
      {
        SubLObject cdolist_list_var_$11 = kb_mapping.gather_index_in_any_mt( denot, T );
        SubLObject assertion = NIL;
        assertion = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          final SubLObject ass_forts = assertions_high.assertion_forts( assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL == subl_promotions.memberP( $const716$TheList, ass_forts, UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member( $const717$disjointWith, ass_forts, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var_$12 = ass_forts;
            SubLObject fort = NIL;
            fort = cdolist_list_var_$12.first();
            while ( NIL != cdolist_list_var_$12)
            {
              if( NIL != isa.isa_in_any_mtP( fort, $const715$Collection ) && NIL == subl_promotions.memberP( fort, auxiliary_forts, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject idf_score = Numbers.divide( ass_count, kb_indexing.num_index( fort ) );
                SubLObject generation = NIL;
                auxiliary_forts = ConsesLow.cons( fort, auxiliary_forts );
                final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                try
                {
                  pph_vars.$pph_demerit_cutoff$.bind( ZERO_INTEGER, thread );
                  generation = pph_main.generate_phrase( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0, thread );
                }
                if( idf_score.numL( $int718$200000 ) && idf_score.numG( $int719$5000 ) && generation.isString() )
                {
                  final SubLObject item_var = ConsesLow.list( idf_score, generation, assertion );
                  if( NIL == conses_high.member( item_var, auxiliary_terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    auxiliary_terms = ConsesLow.cons( item_var, auxiliary_terms );
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
    return list_utilities.first_n( num, Mapping.mapcar( $sym720$SECOND, Sort.sort( auxiliary_terms, $sym721$_, $sym478$FIRST ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66141L)
  public static SubLObject current_google_api_method_invocation_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $google_api_method_invocation_count$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66250L)
  public static SubLObject update_google_api_method_invocation_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $google_api_method_invocation_count$.getDynamicValue( thread ).isFixnum() )
    {
      $google_api_method_invocation_count$.setDynamicValue( Numbers.add( $google_api_method_invocation_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return $google_api_method_invocation_count$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66463L)
  public static SubLObject with_google_api_method_invocation_tracking(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list722 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject final_count = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list722 );
    final_count = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym723$CLET, $list724, reader.bq_cons( $sym725$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym726$CSETF, final_count, $list727 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list722 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 66828L)
  public static SubLObject google_frequencies(final SubLObject string)
  {
    final SubLObject v_forts = lexicon_accessors.denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$13 = pph_methods_lexicon.all_phrases_for_term( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject generation = NIL;
      generation = cdolist_list_var_$13.first();
      while ( NIL != cdolist_list_var_$13)
      {
        final SubLObject google_query = new_google_query( generation, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject count = methods.funcall_instance_method_with_0_args( google_query, $sym288$COUNT );
        if( count == $kw448$IO_ERROR )
        {
          return NIL;
        }
        update_google_api_method_invocation_count();
        result = ConsesLow.cons( ConsesLow.list( fort, generation, count ), result );
        Errors.warn( $str728$_S__, ConsesLow.list( fort, generation, count ) );
        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
        generation = cdolist_list_var_$13.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    return Sort.stable_sort( Sort.sort( result, $sym729$_, $sym730$THIRD ), $sym731$FORT__, $sym478$FIRST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67400L)
  public static SubLObject google_search(final SubLObject string, SubLObject start, SubLObject hits)
  {
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    final SubLObject google_query = new_google_query( string, get_google_key(), hits, $int228$50, start );
    final SubLObject results = methods.funcall_instance_method_with_0_args( google_query, $sym76$GET );
    if( NIL == google_error_tokenP( results ) )
    {
      update_google_api_method_invocation_count();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67712L)
  public static SubLObject google_count(final SubLObject string)
  {
    final SubLObject google_query = new_google_query( string, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject results = methods.funcall_instance_method_with_0_args( google_query, $sym288$COUNT );
    if( NIL == google_error_tokenP( results ) )
    {
      update_google_api_method_invocation_count();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 67980L)
  public static SubLObject google_status()
  {
    final SubLObject google_query = new_google_query( $str355$, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject results = methods.funcall_instance_method_with_0_args( google_query, $sym300$VERSION );
    if( NIL == google_error_tokenP( results ) )
    {
      update_google_api_method_invocation_count();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68241L)
  public static SubLObject google_spelling(final SubLObject string)
  {
    final SubLObject google_query = new_google_query( string, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject results = methods.funcall_instance_method_with_0_args( google_query, $sym296$SPELLING );
    if( NIL == google_error_tokenP( results ) )
    {
      update_google_api_method_invocation_count();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68517L)
  public static SubLObject google_server_aliveP()
  {
    return list_utilities.property_list_p( google_status() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68603L)
  public static SubLObject google_license_count()
  {
    final SubLObject status = google_status();
    if( NIL != list_utilities.property_list_p( status ) )
    {
      return conses_high.getf( status, $kw732$LICENSE_USE, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68759L)
  public static SubLObject google_quit()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query = new_google_query( $str355$, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw733$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym734$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          methods.funcall_instance_method_with_0_args( query, $sym292$QUIT );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw733$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 68906L)
  public static SubLObject google_error_tokenP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && ( $kw317$ERROR == v_object || $kw471$SERVER_ERROR == v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/search-engine.lisp", position = 69071L)
  public static SubLObject google_search_url(final SubLObject search_string, SubLObject start, SubLObject hits)
  {
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    return PrintLow.format( NIL, $str735$http___www_google_com_search_q__A, new SubLObject[] { web_utilities.html_url_encode( search_string, UNPROVIDED ), Numbers.subtract( start, ONE_INTEGER ), hits
    } );
  }

  public static SubLObject declare_search_engine_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "information_p", "INFORMATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "information_get_source_method", "INFORMATION-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_abstract_passage_vector", "GET-ABSTRACT-PASSAGE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_abstract_passage_vector", "SET-ABSTRACT-PASSAGE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_abstract_passage_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_abstract_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_p", "ABSTRACT-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_equal_method", "ABSTRACT-PASSAGE-EQUAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_similarity_method", "ABSTRACT-PASSAGE-SIMILARITY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_get_dates_method", "ABSTRACT-PASSAGE-GET-DATES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_older_method", "ABSTRACT-PASSAGE-OLDER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "guess_year", "GUESS-YEAR", 5, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_get_publication_date_method", "ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "passage_equal", "PASSAGE-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_simple_passage_text", "GET-SIMPLE-PASSAGE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_simple_passage_text", "SET-SIMPLE-PASSAGE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_simple_passage_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_simple_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_passage_p", "SIMPLE-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_simple_passage", "NEW-SIMPLE-PASSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_passage_print_method", "SIMPLE-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "simple_passage_get_content_method", "SIMPLE-PASSAGE-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_corpus_passage_text", "GET-CORPUS-PASSAGE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_corpus_passage_text", "SET-CORPUS-PASSAGE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_corpus_passage_corpus", "GET-CORPUS-PASSAGE-CORPUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_corpus_passage_corpus", "SET-CORPUS-PASSAGE-CORPUS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_corpus_passage_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_corpus_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_passage_p", "CORPUS-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_passage_get_corpus_method", "CORPUS-PASSAGE-GET-CORPUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "abstract_passage_get_vector_method", "ABSTRACT-PASSAGE-GET-VECTOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_passage_get_content_method", "CORPUS-PASSAGE-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_passage_identify_entities_method", "CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "corpus_passage_max_instances_method", "CORPUS-PASSAGE-MAX-INSTANCES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "corpus_passage_get_parse_trees_method", "CORPUS-PASSAGE-GET-PARSE-TREES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_information_request_timeout", "GET-INFORMATION-REQUEST-TIMEOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_information_request_timeout", "SET-INFORMATION-REQUEST-TIMEOUT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_information_request_error_handling", "GET-INFORMATION-REQUEST-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_information_request_error_handling", "SET-INFORMATION-REQUEST-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_request_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_request_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "information_request_p", "INFORMATION-REQUEST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "information_request_initialize_method", "INFORMATION-REQUEST-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_knowledge_source_query_query", "GET-KNOWLEDGE-SOURCE-QUERY-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_knowledge_source_query_query", "SET-KNOWLEDGE-SOURCE-QUERY-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_knowledge_source_query_class", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_knowledge_source_query_instance", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "knowledge_source_query_p", "KNOWLEDGE-SOURCE-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "knowledge_source_query_answer_method", "KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "knowledge_source_query_print_method", "KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "knowledge_source_query_handle_error_method", "KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_corpus_query_corpus", "GET-CORPUS-QUERY-CORPUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_corpus_query_corpus", "SET-CORPUS-QUERY-CORPUS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_corpus_query_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_corpus_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_query_p", "CORPUS-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_query_get_corpus_path_mapping_method", "CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_query_get_corpus_method", "CORPUS-QUERY-GET-CORPUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_query_get_corpus_path_method", "CORPUS-QUERY-GET-CORPUS-PATH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_query_print_method", "CORPUS-QUERY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_glimpse_query_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_glimpse_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "glimpse_query_p", "GLIMPSE-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_glimpse_query", "NEW-GLIMPSE-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "glimpse_query_get_corpus_path_mapping_method", "GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "glimpse_query_get_method", "GLIMPSE-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_glimpse", "ASK-GLIMPSE", 1, 5, false );
    SubLFiles.declareFunction( me, "get_glimpse_passage_line", "GET-GLIMPSE-PASSAGE-LINE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_glimpse_passage_line", "SET-GLIMPSE-PASSAGE-LINE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_glimpse_passage_article", "GET-GLIMPSE-PASSAGE-ARTICLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_glimpse_passage_article", "SET-GLIMPSE-PASSAGE-ARTICLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_glimpse_passage_file", "GET-GLIMPSE-PASSAGE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_glimpse_passage_file", "SET-GLIMPSE-PASSAGE-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_glimpse_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_glimpse_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "glimpse_passage_p", "GLIMPSE-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_glimpse_passage", "NEW-GLIMPSE-PASSAGE", 5, 0, false );
    SubLFiles.declareFunction( me, "glimpse_passage_print_method", "GLIMPSE-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "glimpse_passage_get_publication_date_method", "GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "glimpse_passage_get_source_method", "GLIMPSE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_guruqa_query_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_guruqa_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_query_p", "GURUQA-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_guruqa_query", "NEW-GURUQA-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "guruqa_query_get_method", "GURUQA-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_guruqa_passage_error_handling", "GET-GURUQA-PASSAGE-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_guruqa_passage_error_handling", "SET-GURUQA-PASSAGE-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_guruqa_passage_span", "GET-GURUQA-PASSAGE-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_guruqa_passage_span", "SET-GURUQA-PASSAGE-SPAN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_guruqa_passage_sentence_id", "GET-GURUQA-PASSAGE-SENTENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_guruqa_passage_sentence_id", "SET-GURUQA-PASSAGE-SENTENCE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_guruqa_passage_document_id", "GET-GURUQA-PASSAGE-DOCUMENT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_guruqa_passage_document_id", "SET-GURUQA-PASSAGE-DOCUMENT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_guruqa_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_guruqa_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_passage_p", "GURUQA-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_guruqa_passage", "NEW-GURUQA-PASSAGE", 3, 2, false );
    SubLFiles.declareFunction( me, "guruqa_passage_print_method", "GURUQA-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "guruqa_passage_get_source_method", "GURUQA-PASSAGE-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_passage_get_content_method", "GURUQA-PASSAGE-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "guruqa_passage_handle_error_method", "GURUQA-PASSAGE-HANDLE-ERROR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lemur_query_sentno", "GET-LEMUR-QUERY-SENTNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lemur_query_sentno", "SET-LEMUR-QUERY-SENTNO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lemur_query_docno", "GET-LEMUR-QUERY-DOCNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lemur_query_docno", "SET-LEMUR-QUERY-DOCNO", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lemur_query_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lemur_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lemur_query_p", "LEMUR-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lemur_query", "NEW-LEMUR-QUERY", 1, 3, false );
    SubLFiles.declareFunction( me, "lemur_query_get_corpus_path_mapping_method", "LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lemur_query_get_method", "LEMUR-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_lemur", "ASK-LEMUR", 1, 9, false );
    SubLFiles.declareFunction( me, "get_lemur_passage_score", "GET-LEMUR-PASSAGE-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lemur_passage_score", "SET-LEMUR-PASSAGE-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lemur_passage_sentence_number", "GET-LEMUR-PASSAGE-SENTENCE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lemur_passage_sentence_number", "SET-LEMUR-PASSAGE-SENTENCE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lemur_passage_doc_id", "GET-LEMUR-PASSAGE-DOC-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lemur_passage_doc_id", "SET-LEMUR-PASSAGE-DOC-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lemur_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lemur_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lemur_passage_p", "LEMUR-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lemur_passage", "NEW-LEMUR-PASSAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "lemur_passage_print_method", "LEMUR-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "lemur_passage_get_source_method", "LEMUR-PASSAGE-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lemur_passage_get_publication_date_method", "LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lemur_passage_get_score_method", "LEMUR-PASSAGE-GET-SCORE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_qaga_query_augmentation_terms", "GET-QAGA-QUERY-AUGMENTATION-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_qaga_query_augmentation_terms", "SET-QAGA-QUERY-AUGMENTATION-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_qaga_query_class", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_qaga_query_instance", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "qaga_query_p", "QAGA-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_qaga_query", "NEW-QAGA-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "qaga_query_get_method", "QAGA-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "qaga_query_get_augmentation_terms_method", "QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_google_query_google_key", "GET-GOOGLE-QUERY-GOOGLE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_query_google_key", "SET-GOOGLE-QUERY-GOOGLE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_query_start", "GET-GOOGLE-QUERY-START", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_query_start", "SET-GOOGLE-QUERY-START", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_query_docno", "GET-GOOGLE-QUERY-DOCNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_query_docno", "SET-GOOGLE-QUERY-DOCNO", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_query_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "google_query_p", "GOOGLE-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_google_query", "NEW-GOOGLE-QUERY", 2, 3, false );
    SubLFiles.declareFunction( me, "google_query_get_method", "GOOGLE-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_query_count_method", "GOOGLE-QUERY-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_query_quit_method", "GOOGLE-QUERY-QUIT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_query_spelling_method", "GOOGLE-QUERY-SPELLING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_query_version_method", "GOOGLE-QUERY-VERSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_google_key", "GET-GOOGLE-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "seed_google_client", "SEED-GOOGLE-CLIENT", 3, 0, false );
    SubLFiles.declareFunction( me, "get_google_client", "GET-GOOGLE-CLIENT", 0, 1, false );
    SubLFiles.declareFunction( me, "get_google_client_client_interaction", "GET-GOOGLE-CLIENT-CLIENT-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_client_interaction", "SET-GOOGLE-CLIENT-CLIENT-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_client_key", "GET-GOOGLE-CLIENT-CLIENT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_client_key", "SET-GOOGLE-CLIENT-CLIENT-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_client_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_client_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_p", "GOOGLE-CLIENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_initialize_method", "GOOGLE-CLIENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_set_client_key_method", "GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_search_method", "GOOGLE-CLIENT-SEARCH-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "google_client_count_method", "GOOGLE-CLIENT-COUNT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_spelling_method", "GOOGLE-CLIENT-SPELLING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_quit_method", "GOOGLE-CLIENT-QUIT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_version_method", "GOOGLE-CLIENT-VERSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_build_basic_google_request_method", "GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "google_client_get_answer_from_request_method", "GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_google_request_method", "GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_google_io_error", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_google_io_error", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_google_version", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_google_version", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_google_spelling", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_google_spelling", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_google_count", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_google_count", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_google_passages", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_google_passages", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_start", "GET-GOOGLE-CLIENT-INTERACTION-START", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_start", "SET-GOOGLE-CLIENT-INTERACTION-START", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_docno", "GET-GOOGLE-CLIENT-INTERACTION-DOCNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_docno", "SET-GOOGLE-CLIENT-INTERACTION-DOCNO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_directive_arg", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_directive_arg", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_directive", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_directive", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_client_key", "GET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_client_key", "SET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_total_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_total_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_rank_keyword", "GET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_rank_keyword", "SET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_offset_in_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_offset_in_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_offset_in_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_offset_in_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_title_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_title_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_url_keyword", "GET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_url_keyword", "SET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_content_keyword", "GET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_content_keyword", "SET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_language_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_language_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_key_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_key_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_start_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_start_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_count_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_count_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_type_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_type_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_query_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_query_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_subl_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_subl_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_version_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_version_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_quit_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_quit_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_spell_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_spell_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_count_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_count_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_client_interaction_search_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_client_interaction_search_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_p", "GOOGLE-CLIENT-INTERACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_initialize_method", "GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_set_key_method", "GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_set_directive_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_set_docno_method", "GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_set_start_method", "GOOGLE-CLIENT-INTERACTION-SET-START-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_get_io_error_flag_method", "GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_build_answer_method", "GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_get_directive_method", "GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_set_directive_arg_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_request_string_method", "GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_get_answer_method", "GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_client_interaction_get_google_passages_method", "GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_list_p", "GOOGLE-PASSAGE-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_list_acceptable_p_method", "GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "google_passage_list_add_method", "GOOGLE-PASSAGE-LIST-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_parse_trees", "GET-GOOGLE-PASSAGE-PARSE-TREES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_parse_trees", "SET-GOOGLE-PASSAGE-PARSE-TREES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_total", "GET-GOOGLE-PASSAGE-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_total", "SET-GOOGLE-PASSAGE-TOTAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_offset_in_text", "GET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_offset_in_text", "SET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_offset_in_snippet", "GET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_offset_in_snippet", "SET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_snippet", "GET-GOOGLE-PASSAGE-SNIPPET", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_snippet", "SET-GOOGLE-PASSAGE-SNIPPET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_title", "GET-GOOGLE-PASSAGE-TITLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_title", "SET-GOOGLE-PASSAGE-TITLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_url", "GET-GOOGLE-PASSAGE-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_url", "SET-GOOGLE-PASSAGE-URL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_google_passage_rank", "GET-GOOGLE-PASSAGE-RANK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_google_passage_rank", "SET-GOOGLE-PASSAGE-RANK", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_google_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_p", "GOOGLE-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_google_passage", "NEW-GOOGLE-PASSAGE", 4, 4, false );
    SubLFiles.declareFunction( me, "google_passage_get_source_method", "GOOGLE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_score_method", "GOOGLE-PASSAGE-GET-SCORE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_is_complete_method", "GOOGLE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_offset_in_full_text_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_offset_in_snippet_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_url_method", "GOOGLE-PASSAGE-GET-URL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_title_method", "GOOGLE-PASSAGE-GET-TITLE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_cached_file_id_method", "GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_full_text_method", "GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_snippet_method", "GOOGLE-PASSAGE-GET-SNIPPET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_rank_method", "GOOGLE-PASSAGE-GET-RANK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_total_for_rank_method", "GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_rank_and_total_method", "GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "google_passage_print_method", "GOOGLE-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "google_passage_get_publication_date_method", "GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_query_sentno", "GET-LUCENE-QUERY-SENTNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_query_sentno", "SET-LUCENE-QUERY-SENTNO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_query_docno", "GET-LUCENE-QUERY-DOCNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_query_docno", "SET-LUCENE-QUERY-DOCNO", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_query_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_query_p", "LUCENE-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lucene_query", "NEW-LUCENE-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "lucene_query_get_method", "LUCENE-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "seed_lucene_client", "SEED-LUCENE-CLIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client", "GET-LUCENE-CLIENT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_client_interaction", "GET-LUCENE-CLIENT-CLIENT-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_client_interaction", "SET-LUCENE-CLIENT-CLIENT-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_client_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_client_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_p", "LUCENE-CLIENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_initialize_method", "LUCENE-CLIENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_search_method", "LUCENE-CLIENT-SEARCH-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "lucene_client_count_method", "LUCENE-CLIENT-COUNT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_lucene_request_method", "LUCENE-CLIENT-LUCENE-REQUEST-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_lucene_count", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_lucene_count", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_lucene_passages", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_lucene_passages", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_directive_arg", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_directive_arg", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_directive", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_directive", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_docno", "GET-LUCENE-CLIENT-INTERACTION-DOCNO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_docno", "SET-LUCENE-CLIENT-INTERACTION-DOCNO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_content_keyword", "GET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_content_keyword", "SET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_id_keyword", "GET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_id_keyword", "SET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_query_language_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_query_language_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_query_count_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_query_count_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_query_type_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_query_type_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_query_tag", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_query_tag", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_subl_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_subl_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_count_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_count_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_client_interaction_search_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_client_interaction_search_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_p", "LUCENE-CLIENT-INTERACTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_initialize_method", "LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_set_directive_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_build_answer_method", "LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_get_directive_method", "LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_set_directive_arg_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_set_docno_method", "LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_request_string_method", "LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_get_answer_method", "LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_client_interaction_get_lucene_passages_method", "LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_list_p", "LUCENE-PASSAGE-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_list_acceptable_p_method", "LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_list_add_method", "LUCENE-PASSAGE-LIST-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_passage_parse_trees", "GET-LUCENE-PASSAGE-PARSE-TREES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_passage_parse_trees", "SET-LUCENE-PASSAGE-PARSE-TREES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_passage_id", "GET-LUCENE-PASSAGE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_passage_id", "SET-LUCENE-PASSAGE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lucene_passage_rank", "GET-LUCENE-PASSAGE-RANK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lucene_passage_rank", "SET-LUCENE-PASSAGE-RANK", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lucene_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_p", "LUCENE-PASSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lucene_passage", "NEW-LUCENE-PASSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_get_source_method", "LUCENE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_get_score_method", "LUCENE-PASSAGE-GET-SCORE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_is_complete_method", "LUCENE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_print_method", "LUCENE-PASSAGE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_passage_get_publication_date_method", "LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cycl_query_properties", "GET-CYCL-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_query_properties", "SET-CYCL-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycl_query_knowledge_sources", "GET-CYCL-QUERY-KNOWLEDGE-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_query_knowledge_sources", "SET-CYCL-QUERY-KNOWLEDGE-SOURCES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_query_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_p", "CYCL-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cycl_query", "NEW-CYCL-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "cycl_query_equal_p", "CYCL-QUERY-EQUAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_get_method", "CYCL-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "corpus_p", "CORPUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_get_from_kb_method", "CYCL-QUERY-GET-FROM-KB-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_get_from_corpus_method", "CYCL-QUERY-GET-FROM-CORPUS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_generate_assignments_method", "CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "new_tmp_mt", "NEW-TMP-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "get_var_assignment_justification", "GET-VAR-ASSIGNMENT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_var_assignment_justification", "SET-VAR-ASSIGNMENT-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_var_assignment_bindings", "GET-VAR-ASSIGNMENT-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_var_assignment_bindings", "SET-VAR-ASSIGNMENT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_var_assignment_class", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_var_assignment_instance", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "var_assignment_p", "VAR-ASSIGNMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_var_assignment", "NEW-VAR-ASSIGNMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "var_assignment_print_method", "VAR-ASSIGNMENT-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "var_assignment_get_content_method", "VAR-ASSIGNMENT-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "var_assignment_get_source_method", "VAR-ASSIGNMENT-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_wordnet_query_pos", "GET-WORDNET-QUERY-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_wordnet_query_pos", "SET-WORDNET-QUERY-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_query_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_query_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_query_p", "WORDNET-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_wordnet_query", "NEW-WORDNET-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "wordnet_pos_p", "WORDNET-POS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_query_get_method", "WORDNET-QUERY-GET-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_wordnet_gloss_gloss", "GET-WORDNET-GLOSS-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_wordnet_gloss_gloss", "SET-WORDNET-GLOSS-GLOSS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_gloss_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wordnet_gloss_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_gloss_p", "WORDNET-GLOSS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_wordnet_gloss", "NEW-WORDNET-GLOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_gloss_get_content_method", "WORDNET-GLOSS-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wordnet_gloss_get_source_method", "WORDNET-GLOSS-GET-SOURCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_passage_header", "STRIP-PASSAGE-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "passage_similarity", "PASSAGE-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "augment_search_string", "AUGMENT-SEARCH-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "current_google_api_method_invocation_count", "CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "update_google_api_method_invocation_count", "UPDATE-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false );
    SubLFiles.declareMacro( me, "with_google_api_method_invocation_tracking", "WITH-GOOGLE-API-METHOD-INVOCATION-TRACKING" );
    SubLFiles.declareFunction( me, "google_frequencies", "GOOGLE-FREQUENCIES", 1, 0, false );
    SubLFiles.declareFunction( me, "google_search", "GOOGLE-SEARCH", 1, 2, false );
    SubLFiles.declareFunction( me, "google_count", "GOOGLE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "google_status", "GOOGLE-STATUS", 0, 0, false );
    SubLFiles.declareFunction( me, "google_spelling", "GOOGLE-SPELLING", 1, 0, false );
    SubLFiles.declareFunction( me, "google_server_aliveP", "GOOGLE-SERVER-ALIVE?", 0, 0, false );
    SubLFiles.declareFunction( me, "google_license_count", "GOOGLE-LICENSE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "google_quit", "GOOGLE-QUIT", 0, 0, false );
    SubLFiles.declareFunction( me, "google_error_tokenP", "GOOGLE-ERROR-TOKEN?", 1, 0, false );
    SubLFiles.declareFunction( me, "google_search_url", "GOOGLE-SEARCH-URL", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_search_engine_file()
  {
    $default_corpus$ = SubLFiles.defparameter( "*DEFAULT-CORPUS*", $str129$CNSjan2004 );
    $world_wide_web_corpus$ = SubLFiles.defparameter( "*WORLD-WIDE-WEB-CORPUS*", $str277$WWW );
    $authorized_google_key$ = SubLFiles.defvar( "*AUTHORIZED-GOOGLE-KEY*", NIL );
    $google_client_key_file$ = SubLFiles.defparameter( "*GOOGLE-CLIENT-KEY-FILE*", red_infrastructure_macros.red_def_helper( $list304.isSymbol() ? Symbols.symbol_value( $list304 ) : $list304,
        $sym305$_GOOGLE_CLIENT_KEY_FILE_, $str306$data_googlekey_txt.isSymbol() ? Symbols.symbol_value( $str306$data_googlekey_txt ) : $str306$data_googlekey_txt, $kw307$PARAMETER, UNPROVIDED ) );
    $google_client_host$ = SubLFiles.defparameter( "*GOOGLE-CLIENT-HOST*", red_infrastructure_macros.red_def_helper( $list308.isSymbol() ? Symbols.symbol_value( $list308 ) : $list308, $sym309$_GOOGLE_CLIENT_HOST_,
        $str310$googleserver_cyc_com.isSymbol() ? Symbols.symbol_value( $str310$googleserver_cyc_com ) : $str310$googleserver_cyc_com, $kw307$PARAMETER, UNPROVIDED ) );
    $google_client_port$ = SubLFiles.defparameter( "*GOOGLE-CLIENT-PORT*", red_infrastructure_macros.red_def_helper( $list311.isSymbol() ? Symbols.symbol_value( $list311 ) : $list311, $sym312$_GOOGLE_CLIENT_PORT_,
        $int313$6667.isSymbol() ? Symbols.symbol_value( $int313$6667 ) : $int313$6667, $kw307$PARAMETER, UNPROVIDED ) );
    $google_client$ = SubLFiles.defparameter( "*GOOGLE-CLIENT*", NIL );
    $wikipedia$ = SubLFiles.defparameter( "*WIKIPEDIA*", $str558$Wikipedia );
    $lucene_client_host$ = SubLFiles.defvar( "*LUCENE-CLIENT-HOST*", NIL );
    $lucene_client_port$ = SubLFiles.defvar( "*LUCENE-CLIENT-PORT*", NIL );
    $lucene_client$ = SubLFiles.defvar( "*LUCENE-CLIENT*", NIL );
    $google_api_method_invocation_count$ = SubLFiles.defparameter( "*GOOGLE-API-METHOD-INVOCATION-COUNT*", NIL );
    return NIL;
  }

  public static SubLObject setup_search_engine_file()
  {
    classes.subloop_new_class( $sym0$INFORMATION, $sym1$OBJECT, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$INFORMATION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$INFORMATION, $sym4$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$INFORMATION, $sym7$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE );
    subloop_reserved_initialize_information_class( $sym0$INFORMATION );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym0$INFORMATION, $list9, NIL, $list10 );
    methods.subloop_register_instance_method( $sym0$INFORMATION, $sym8$GET_SOURCE, $sym11$INFORMATION_GET_SOURCE_METHOD );
    classes.subloop_new_class( $sym12$ABSTRACT_PASSAGE, $sym0$INFORMATION, NIL, T, $list13 );
    classes.class_set_implements_slot_listeners( $sym12$ABSTRACT_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym12$ABSTRACT_PASSAGE, $sym15$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym12$ABSTRACT_PASSAGE, $sym16$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE );
    subloop_reserved_initialize_abstract_passage_class( $sym12$ABSTRACT_PASSAGE );
    methods.methods_incorporate_instance_method( EQUAL, $sym12$ABSTRACT_PASSAGE, $list9, $list17, $list18 );
    methods.subloop_register_instance_method( $sym12$ABSTRACT_PASSAGE, EQUAL, $sym20$ABSTRACT_PASSAGE_EQUAL_METHOD );
    methods.methods_incorporate_class_method( $sym21$SIMILARITY, $sym12$ABSTRACT_PASSAGE, $list9, $list22, $list23 );
    methods.subloop_register_class_method( $sym12$ABSTRACT_PASSAGE, $sym21$SIMILARITY, $sym26$ABSTRACT_PASSAGE_SIMILARITY_METHOD );
    methods.methods_incorporate_instance_method( $sym27$GET_DATES, $sym12$ABSTRACT_PASSAGE, $list9, NIL, $list28 );
    methods.subloop_register_instance_method( $sym12$ABSTRACT_PASSAGE, $sym27$GET_DATES, $sym31$ABSTRACT_PASSAGE_GET_DATES_METHOD );
    methods.methods_incorporate_instance_method( $sym32$OLDER, $sym12$ABSTRACT_PASSAGE, $list9, $list33, $list34 );
    methods.subloop_register_instance_method( $sym12$ABSTRACT_PASSAGE, $sym32$OLDER, $sym37$ABSTRACT_PASSAGE_OLDER_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_PUBLICATION_DATE, $sym12$ABSTRACT_PASSAGE, $list9, NIL, $list38 );
    methods.subloop_register_instance_method( $sym12$ABSTRACT_PASSAGE, $sym29$GET_PUBLICATION_DATE, $sym39$ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD );
    classes.subloop_new_class( $sym40$SIMPLE_PASSAGE, $sym12$ABSTRACT_PASSAGE, NIL, NIL, $list41 );
    classes.class_set_implements_slot_listeners( $sym40$SIMPLE_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym40$SIMPLE_PASSAGE, $sym43$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym40$SIMPLE_PASSAGE, $sym44$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE );
    subloop_reserved_initialize_simple_passage_class( $sym40$SIMPLE_PASSAGE );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym40$SIMPLE_PASSAGE, $list46, $list47, $list48 );
    methods.subloop_register_instance_method( $sym40$SIMPLE_PASSAGE, $sym45$PRINT, $sym50$SIMPLE_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_CONTENT, $sym40$SIMPLE_PASSAGE, $list9, NIL, $list51 );
    methods.subloop_register_instance_method( $sym40$SIMPLE_PASSAGE, $sym19$GET_CONTENT, $sym53$SIMPLE_PASSAGE_GET_CONTENT_METHOD );
    classes.subloop_new_class( $sym54$CORPUS_PASSAGE, $sym12$ABSTRACT_PASSAGE, NIL, T, $list55 );
    classes.class_set_implements_slot_listeners( $sym54$CORPUS_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym54$CORPUS_PASSAGE, $sym57$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym54$CORPUS_PASSAGE, $sym58$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE );
    subloop_reserved_initialize_corpus_passage_class( $sym54$CORPUS_PASSAGE );
    methods.methods_incorporate_instance_method( $sym59$GET_CORPUS, $sym54$CORPUS_PASSAGE, $list9, NIL, $list60 );
    methods.subloop_register_instance_method( $sym54$CORPUS_PASSAGE, $sym59$GET_CORPUS, $sym62$CORPUS_PASSAGE_GET_CORPUS_METHOD );
    methods.methods_incorporate_instance_method( $sym25$GET_VECTOR, $sym12$ABSTRACT_PASSAGE, $list9, NIL, $list63 );
    methods.subloop_register_instance_method( $sym12$ABSTRACT_PASSAGE, $sym25$GET_VECTOR, $sym65$ABSTRACT_PASSAGE_GET_VECTOR_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_CONTENT, $sym54$CORPUS_PASSAGE, $list9, NIL, $list51 );
    methods.subloop_register_instance_method( $sym54$CORPUS_PASSAGE, $sym19$GET_CONTENT, $sym67$CORPUS_PASSAGE_GET_CONTENT_METHOD );
    methods.methods_incorporate_instance_method( $sym68$IDENTIFY_ENTITIES, $sym54$CORPUS_PASSAGE, $list9, $list69, $list70 );
    methods.subloop_register_instance_method( $sym54$CORPUS_PASSAGE, $sym68$IDENTIFY_ENTITIES, $sym83$CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD );
    methods.methods_incorporate_class_method( $sym84$MAX_INSTANCES, $sym54$CORPUS_PASSAGE, $list9, $list85, $list86 );
    methods.subloop_register_class_method( $sym54$CORPUS_PASSAGE, $sym84$MAX_INSTANCES, $sym88$CORPUS_PASSAGE_MAX_INSTANCES_METHOD );
    methods.methods_incorporate_instance_method( $sym89$GET_PARSE_TREES, $sym54$CORPUS_PASSAGE, $list9, NIL, $list90 );
    methods.subloop_register_instance_method( $sym54$CORPUS_PASSAGE, $sym89$GET_PARSE_TREES, $sym94$CORPUS_PASSAGE_GET_PARSE_TREES_METHOD );
    classes.subloop_new_class( $sym95$INFORMATION_REQUEST, $sym1$OBJECT, NIL, NIL, $list96 );
    classes.class_set_implements_slot_listeners( $sym95$INFORMATION_REQUEST, NIL );
    classes.subloop_note_class_initialization_function( $sym95$INFORMATION_REQUEST, $sym99$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym95$INFORMATION_REQUEST, $sym100$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE );
    subloop_reserved_initialize_information_request_class( $sym95$INFORMATION_REQUEST );
    methods.methods_incorporate_instance_method( $sym101$INITIALIZE, $sym95$INFORMATION_REQUEST, $list46, NIL, $list102 );
    methods.subloop_register_instance_method( $sym95$INFORMATION_REQUEST, $sym101$INITIALIZE, $sym106$INFORMATION_REQUEST_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym95$INFORMATION_REQUEST, NIL, T, $list108 );
    classes.class_set_implements_slot_listeners( $sym107$KNOWLEDGE_SOURCE_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym110$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym111$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE );
    subloop_reserved_initialize_knowledge_source_query_class( $sym107$KNOWLEDGE_SOURCE_QUERY );
    methods.methods_incorporate_instance_method( $sym112$ANSWER, $sym107$KNOWLEDGE_SOURCE_QUERY, $list9, NIL, $list113 );
    methods.subloop_register_instance_method( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym112$ANSWER, $sym118$KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym107$KNOWLEDGE_SOURCE_QUERY, $list46, $list47, $list119 );
    methods.subloop_register_instance_method( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym45$PRINT, $sym123$KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym117$HANDLE_ERROR, $sym107$KNOWLEDGE_SOURCE_QUERY, $list46, $list124, $list125 );
    methods.subloop_register_instance_method( $sym107$KNOWLEDGE_SOURCE_QUERY, $sym117$HANDLE_ERROR, $sym128$KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD );
    classes.subloop_new_class( $sym130$CORPUS_QUERY, $sym107$KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list131 );
    classes.class_set_implements_slot_listeners( $sym130$CORPUS_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym130$CORPUS_QUERY, $sym132$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym130$CORPUS_QUERY, $sym133$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE );
    subloop_reserved_initialize_corpus_query_class( $sym130$CORPUS_QUERY );
    methods.methods_incorporate_class_method( $sym134$GET_CORPUS_PATH_MAPPING, $sym130$CORPUS_QUERY, $list9, NIL, $list135 );
    methods.subloop_register_class_method( $sym130$CORPUS_QUERY, $sym134$GET_CORPUS_PATH_MAPPING, $sym136$CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym59$GET_CORPUS, $sym130$CORPUS_QUERY, $list9, NIL, $list137 );
    methods.subloop_register_instance_method( $sym130$CORPUS_QUERY, $sym59$GET_CORPUS, $sym139$CORPUS_QUERY_GET_CORPUS_METHOD );
    methods.methods_incorporate_class_method( $sym140$GET_CORPUS_PATH, $sym130$CORPUS_QUERY, $list46, NIL, $list141 );
    methods.subloop_register_class_method( $sym130$CORPUS_QUERY, $sym140$GET_CORPUS_PATH, $sym143$CORPUS_QUERY_GET_CORPUS_PATH_METHOD );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym130$CORPUS_QUERY, $list46, $list47, $list144 );
    methods.subloop_register_instance_method( $sym130$CORPUS_QUERY, $sym45$PRINT, $sym148$CORPUS_QUERY_PRINT_METHOD );
    classes.subloop_new_class( $sym149$GLIMPSE_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list150 );
    classes.class_set_implements_slot_listeners( $sym149$GLIMPSE_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym149$GLIMPSE_QUERY, $sym151$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym149$GLIMPSE_QUERY, $sym152$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE );
    subloop_reserved_initialize_glimpse_query_class( $sym149$GLIMPSE_QUERY );
    methods.methods_incorporate_class_method( $sym134$GET_CORPUS_PATH_MAPPING, $sym149$GLIMPSE_QUERY, $list9, NIL, $list154 );
    methods.subloop_register_class_method( $sym149$GLIMPSE_QUERY, $sym134$GET_CORPUS_PATH_MAPPING, $sym156$GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym149$GLIMPSE_QUERY, $list157, NIL, $list158 );
    methods.subloop_register_instance_method( $sym149$GLIMPSE_QUERY, $sym76$GET, $sym167$GLIMPSE_QUERY_GET_METHOD );
    classes.subloop_new_class( $sym171$GLIMPSE_PASSAGE, $sym54$CORPUS_PASSAGE, NIL, NIL, $list172 );
    classes.class_set_implements_slot_listeners( $sym171$GLIMPSE_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym171$GLIMPSE_PASSAGE, $sym176$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym171$GLIMPSE_PASSAGE, $sym177$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE );
    subloop_reserved_initialize_glimpse_passage_class( $sym171$GLIMPSE_PASSAGE );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym171$GLIMPSE_PASSAGE, $list46, $list47, $list181 );
    methods.subloop_register_instance_method( $sym171$GLIMPSE_PASSAGE, $sym45$PRINT, $sym183$GLIMPSE_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_PUBLICATION_DATE, $sym171$GLIMPSE_PASSAGE, $list9, NIL, $list184 );
    methods.subloop_register_instance_method( $sym171$GLIMPSE_PASSAGE, $sym29$GET_PUBLICATION_DATE, $sym186$GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym171$GLIMPSE_PASSAGE, $list9, NIL, $list187 );
    methods.subloop_register_instance_method( $sym171$GLIMPSE_PASSAGE, $sym8$GET_SOURCE, $sym190$GLIMPSE_PASSAGE_GET_SOURCE_METHOD );
    classes.subloop_new_class( $sym191$GURUQA_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list150 );
    classes.class_set_implements_slot_listeners( $sym191$GURUQA_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym191$GURUQA_QUERY, $sym192$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym191$GURUQA_QUERY, $sym193$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE );
    subloop_reserved_initialize_guruqa_query_class( $sym191$GURUQA_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym191$GURUQA_QUERY, $list157, NIL, $list194 );
    methods.subloop_register_instance_method( $sym191$GURUQA_QUERY, $sym76$GET, $sym199$GURUQA_QUERY_GET_METHOD );
    classes.subloop_new_class( $sym200$GURUQA_PASSAGE, $sym54$CORPUS_PASSAGE, NIL, NIL, $list201 );
    classes.class_set_implements_slot_listeners( $sym200$GURUQA_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym200$GURUQA_PASSAGE, $sym205$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym200$GURUQA_PASSAGE, $sym206$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE );
    subloop_reserved_initialize_guruqa_passage_class( $sym200$GURUQA_PASSAGE );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym200$GURUQA_PASSAGE, $list9, $list47, $list210 );
    methods.subloop_register_instance_method( $sym200$GURUQA_PASSAGE, $sym45$PRINT, $sym212$GURUQA_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym200$GURUQA_PASSAGE, $list9, NIL, $list213 );
    methods.subloop_register_instance_method( $sym200$GURUQA_PASSAGE, $sym8$GET_SOURCE, $sym216$GURUQA_PASSAGE_GET_SOURCE_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_CONTENT, $sym200$GURUQA_PASSAGE, $list9, NIL, $list217 );
    methods.subloop_register_instance_method( $sym200$GURUQA_PASSAGE, $sym19$GET_CONTENT, $sym219$GURUQA_PASSAGE_GET_CONTENT_METHOD );
    methods.methods_incorporate_instance_method( $sym117$HANDLE_ERROR, $sym200$GURUQA_PASSAGE, $list157, $list124, $list125 );
    methods.subloop_register_instance_method( $sym200$GURUQA_PASSAGE, $sym117$HANDLE_ERROR, $sym221$GURUQA_PASSAGE_HANDLE_ERROR_METHOD );
    classes.subloop_new_class( $sym222$LEMUR_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list223 );
    classes.class_set_implements_slot_listeners( $sym222$LEMUR_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym222$LEMUR_QUERY, $sym226$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym222$LEMUR_QUERY, $sym227$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE );
    subloop_reserved_initialize_lemur_query_class( $sym222$LEMUR_QUERY );
    methods.methods_incorporate_class_method( $sym134$GET_CORPUS_PATH_MAPPING, $sym222$LEMUR_QUERY, $list9, NIL, $list230 );
    methods.subloop_register_class_method( $sym222$LEMUR_QUERY, $sym134$GET_CORPUS_PATH_MAPPING, $sym232$LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym222$LEMUR_QUERY, $list157, NIL, $list233 );
    methods.subloop_register_instance_method( $sym222$LEMUR_QUERY, $sym76$GET, $sym236$LEMUR_QUERY_GET_METHOD );
    classes.subloop_new_class( $sym243$LEMUR_PASSAGE, $sym54$CORPUS_PASSAGE, NIL, NIL, $list244 );
    classes.class_set_implements_slot_listeners( $sym243$LEMUR_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym243$LEMUR_PASSAGE, $sym246$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym243$LEMUR_PASSAGE, $sym247$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE );
    subloop_reserved_initialize_lemur_passage_class( $sym243$LEMUR_PASSAGE );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym243$LEMUR_PASSAGE, $list9, $list47, $list249 );
    methods.subloop_register_instance_method( $sym243$LEMUR_PASSAGE, $sym45$PRINT, $sym251$LEMUR_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym243$LEMUR_PASSAGE, $list9, NIL, $list252 );
    methods.subloop_register_instance_method( $sym243$LEMUR_PASSAGE, $sym8$GET_SOURCE, $sym255$LEMUR_PASSAGE_GET_SOURCE_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_PUBLICATION_DATE, $sym243$LEMUR_PASSAGE, $list9, NIL, $list256 );
    methods.subloop_register_instance_method( $sym243$LEMUR_PASSAGE, $sym29$GET_PUBLICATION_DATE, $sym258$LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD );
    methods.methods_incorporate_instance_method( $sym87$GET_SCORE, $sym243$LEMUR_PASSAGE, $list9, NIL, $list259 );
    methods.subloop_register_instance_method( $sym243$LEMUR_PASSAGE, $sym87$GET_SCORE, $sym261$LEMUR_PASSAGE_GET_SCORE_METHOD );
    classes.subloop_new_class( $sym262$QAGA_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list263 );
    classes.class_set_implements_slot_listeners( $sym262$QAGA_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym262$QAGA_QUERY, $sym265$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym262$QAGA_QUERY, $sym266$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE );
    subloop_reserved_initialize_qaga_query_class( $sym262$QAGA_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym262$QAGA_QUERY, $list157, NIL, $list267 );
    methods.subloop_register_instance_method( $sym262$QAGA_QUERY, $sym76$GET, $sym272$QAGA_QUERY_GET_METHOD );
    methods.methods_incorporate_instance_method( $sym273$GET_AUGMENTATION_TERMS, $sym262$QAGA_QUERY, $list9, NIL, $list274 );
    methods.subloop_register_instance_method( $sym262$QAGA_QUERY, $sym273$GET_AUGMENTATION_TERMS, $sym276$QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD );
    classes.subloop_new_class( $sym278$GOOGLE_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list279 );
    classes.class_set_implements_slot_listeners( $sym278$GOOGLE_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym278$GOOGLE_QUERY, $sym282$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym278$GOOGLE_QUERY, $sym283$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE );
    subloop_reserved_initialize_google_query_class( $sym278$GOOGLE_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym278$GOOGLE_QUERY, $list157, NIL, $list284 );
    methods.subloop_register_instance_method( $sym278$GOOGLE_QUERY, $sym76$GET, $sym287$GOOGLE_QUERY_GET_METHOD );
    methods.methods_incorporate_instance_method( $sym288$COUNT, $sym278$GOOGLE_QUERY, $list157, NIL, $list289 );
    methods.subloop_register_instance_method( $sym278$GOOGLE_QUERY, $sym288$COUNT, $sym291$GOOGLE_QUERY_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym292$QUIT, $sym278$GOOGLE_QUERY, $list157, NIL, $list293 );
    methods.subloop_register_instance_method( $sym278$GOOGLE_QUERY, $sym292$QUIT, $sym295$GOOGLE_QUERY_QUIT_METHOD );
    methods.methods_incorporate_instance_method( $sym296$SPELLING, $sym278$GOOGLE_QUERY, $list157, NIL, $list297 );
    methods.subloop_register_instance_method( $sym278$GOOGLE_QUERY, $sym296$SPELLING, $sym299$GOOGLE_QUERY_SPELLING_METHOD );
    methods.methods_incorporate_instance_method( $sym300$VERSION, $sym278$GOOGLE_QUERY, $list157, NIL, $list301 );
    methods.subloop_register_instance_method( $sym278$GOOGLE_QUERY, $sym300$VERSION, $sym303$GOOGLE_QUERY_VERSION_METHOD );
    classes.subloop_new_class( $sym318$GOOGLE_CLIENT, $sym322$TCP_CLIENT, NIL, NIL, $list323 );
    classes.class_set_implements_slot_listeners( $sym318$GOOGLE_CLIENT, NIL );
    classes.subloop_note_class_initialization_function( $sym318$GOOGLE_CLIENT, $sym326$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym318$GOOGLE_CLIENT, $sym329$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE );
    subloop_reserved_initialize_google_client_class( $sym318$GOOGLE_CLIENT );
    methods.methods_incorporate_instance_method( $sym101$INITIALIZE, $sym318$GOOGLE_CLIENT, $list46, NIL, $list330 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym101$INITIALIZE, $sym331$GOOGLE_CLIENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym321$SET_CLIENT_KEY, $sym318$GOOGLE_CLIENT, $list9, $list332, $list333 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym321$SET_CLIENT_KEY, $sym335$GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym286$SEARCH, $sym318$GOOGLE_CLIENT, $list336, $list337, $list338 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym286$SEARCH, $sym344$GOOGLE_CLIENT_SEARCH_METHOD );
    methods.methods_incorporate_instance_method( $sym288$COUNT, $sym318$GOOGLE_CLIENT, $list9, $list345, $list346 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym288$COUNT, $sym349$GOOGLE_CLIENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym296$SPELLING, $sym318$GOOGLE_CLIENT, $list9, $list345, $list350 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym296$SPELLING, $sym352$GOOGLE_CLIENT_SPELLING_METHOD );
    methods.methods_incorporate_instance_method( $sym292$QUIT, $sym318$GOOGLE_CLIENT, $list9, NIL, $list353 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym292$QUIT, $sym356$GOOGLE_CLIENT_QUIT_METHOD );
    methods.methods_incorporate_instance_method( $sym300$VERSION, $sym318$GOOGLE_CLIENT, $list9, NIL, $list357 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym300$VERSION, $sym359$GOOGLE_CLIENT_VERSION_METHOD );
    methods.methods_incorporate_instance_method( $sym339$BUILD_BASIC_GOOGLE_REQUEST, $sym318$GOOGLE_CLIENT, $list360, $list361, $list362 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym339$BUILD_BASIC_GOOGLE_REQUEST, $sym367$GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD );
    methods.methods_incorporate_instance_method( $sym343$GET_ANSWER_FROM_REQUEST, $sym318$GOOGLE_CLIENT, $list360, NIL, $list368 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym343$GET_ANSWER_FROM_REQUEST, $sym374$GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD );
    methods.methods_incorporate_instance_method( $sym347$GOOGLE_REQUEST, $sym318$GOOGLE_CLIENT, $list360, $list361, $list375 );
    methods.subloop_register_instance_method( $sym318$GOOGLE_CLIENT, $sym347$GOOGLE_REQUEST, $sym376$GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD );
    classes.subloop_new_class( $sym363$GOOGLE_CLIENT_INTERACTION, $sym1$OBJECT, NIL, NIL, $list377 );
    classes.class_set_implements_slot_listeners( $sym363$GOOGLE_CLIENT_INTERACTION, NIL );
    classes.subloop_note_class_initialization_function( $sym363$GOOGLE_CLIENT_INTERACTION, $sym422$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym363$GOOGLE_CLIENT_INTERACTION, $sym423$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE );
    subloop_reserved_initialize_google_client_interaction_class( $sym363$GOOGLE_CLIENT_INTERACTION );
    methods.methods_incorporate_instance_method( $sym101$INITIALIZE, $sym363$GOOGLE_CLIENT_INTERACTION, $list46, NIL, $list424 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym101$INITIALIZE, $sym427$GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym364$SET_KEY, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list428 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym364$SET_KEY, $sym430$GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym365$SET_DIRECTIVE, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list431 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym365$SET_DIRECTIVE, $sym433$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD );
    methods.methods_incorporate_instance_method( $sym341$SET_DOCNO, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list434 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym341$SET_DOCNO, $sym436$GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD );
    methods.methods_incorporate_instance_method( $sym342$SET_START, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list437 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym342$SET_START, $sym439$GOOGLE_CLIENT_INTERACTION_SET_START_METHOD );
    methods.methods_incorporate_instance_method( $sym440$GET_IO_ERROR_FLAG, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list441 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym440$GET_IO_ERROR_FLAG, $sym443$GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD );
    methods.methods_incorporate_instance_method( $sym371$BUILD_ANSWER, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list444, $list445 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym371$BUILD_ANSWER, $sym453$GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym454$GET_DIRECTIVE, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list455 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym454$GET_DIRECTIVE, $sym457$GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD );
    methods.methods_incorporate_instance_method( $sym366$SET_DIRECTIVE_ARG, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list458 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym366$SET_DIRECTIVE_ARG, $sym460$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD );
    methods.methods_incorporate_instance_method( $sym370$REQUEST_STRING, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list461 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym370$REQUEST_STRING, $sym468$GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym372$GET_ANSWER, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list469 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym372$GET_ANSWER, $sym473$GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym472$GET_GOOGLE_PASSAGES, $sym363$GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list474 );
    methods.subloop_register_instance_method( $sym363$GOOGLE_CLIENT_INTERACTION, $sym472$GET_GOOGLE_PASSAGES, $sym481$GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD );
    classes.subloop_new_class( $sym426$GOOGLE_PASSAGE_LIST, $sym482$BASIC_LIST, $list483, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym426$GOOGLE_PASSAGE_LIST, NIL );
    classes.subloop_note_class_initialization_function( $sym426$GOOGLE_PASSAGE_LIST, $sym484$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym426$GOOGLE_PASSAGE_LIST, $sym488$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE );
    subloop_reserved_initialize_google_passage_list_class( $sym426$GOOGLE_PASSAGE_LIST );
    methods.methods_incorporate_instance_method( $sym489$ACCEPTABLE_P, $sym426$GOOGLE_PASSAGE_LIST, $list9, $list490, $list491 );
    methods.subloop_register_instance_method( $sym426$GOOGLE_PASSAGE_LIST, $sym489$ACCEPTABLE_P, $sym494$GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym450$ADD, $sym426$GOOGLE_PASSAGE_LIST, $list9, $list490, $list495 );
    methods.subloop_register_instance_method( $sym426$GOOGLE_PASSAGE_LIST, $sym450$ADD, $sym497$GOOGLE_PASSAGE_LIST_ADD_METHOD );
    classes.subloop_new_class( $sym492$GOOGLE_PASSAGE, $sym54$CORPUS_PASSAGE, NIL, NIL, $list498 );
    classes.class_set_implements_slot_listeners( $sym492$GOOGLE_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym492$GOOGLE_PASSAGE, $sym507$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym492$GOOGLE_PASSAGE, $sym508$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE );
    subloop_reserved_initialize_google_passage_class( $sym492$GOOGLE_PASSAGE );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list509 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym8$GET_SOURCE, $sym511$GOOGLE_PASSAGE_GET_SOURCE_METHOD );
    methods.methods_incorporate_instance_method( $sym87$GET_SCORE, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list512 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym87$GET_SCORE, $sym514$GOOGLE_PASSAGE_GET_SCORE_METHOD );
    methods.methods_incorporate_instance_method( $sym493$IS_COMPLETE, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list515 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym493$IS_COMPLETE, $sym517$GOOGLE_PASSAGE_IS_COMPLETE_METHOD );
    methods.methods_incorporate_instance_method( $sym518$GET_OFFSET_IN_FULL_TEXT, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list519 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym518$GET_OFFSET_IN_FULL_TEXT, $sym521$GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym522$GET_OFFSET_IN_SNIPPET, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list523 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym522$GET_OFFSET_IN_SNIPPET, $sym525$GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD );
    methods.methods_incorporate_instance_method( $sym526$GET_URL, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list527 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym526$GET_URL, $sym529$GOOGLE_PASSAGE_GET_URL_METHOD );
    methods.methods_incorporate_instance_method( $sym530$GET_TITLE, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list531 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym530$GET_TITLE, $sym533$GOOGLE_PASSAGE_GET_TITLE_METHOD );
    methods.methods_incorporate_instance_method( $sym534$GET_CACHED_FILE_ID, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list535 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym534$GET_CACHED_FILE_ID, $sym536$GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD );
    methods.methods_incorporate_instance_method( $sym537$GET_FULL_TEXT, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list538 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym537$GET_FULL_TEXT, $sym539$GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym540$GET_SNIPPET, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list541 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym540$GET_SNIPPET, $sym543$GOOGLE_PASSAGE_GET_SNIPPET_METHOD );
    methods.methods_incorporate_instance_method( $sym544$GET_RANK, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list545 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym544$GET_RANK, $sym547$GOOGLE_PASSAGE_GET_RANK_METHOD );
    methods.methods_incorporate_instance_method( $sym548$GET_TOTAL_FOR_RANK, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list549 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym548$GET_TOTAL_FOR_RANK, $sym551$GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD );
    methods.methods_incorporate_instance_method( $sym552$GET_RANK_AND_TOTAL, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list553 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym552$GET_RANK_AND_TOTAL, $sym554$GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym492$GOOGLE_PASSAGE, $list9, $list47, $list555 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym45$PRINT, $sym556$GOOGLE_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_PUBLICATION_DATE, $sym492$GOOGLE_PASSAGE, $list9, NIL, $list38 );
    methods.subloop_register_instance_method( $sym492$GOOGLE_PASSAGE, $sym29$GET_PUBLICATION_DATE, $sym557$GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD );
    classes.subloop_new_class( $sym559$LUCENE_QUERY, $sym130$CORPUS_QUERY, NIL, NIL, $list560 );
    classes.class_set_implements_slot_listeners( $sym559$LUCENE_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym559$LUCENE_QUERY, $sym561$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym559$LUCENE_QUERY, $sym562$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE );
    subloop_reserved_initialize_lucene_query_class( $sym559$LUCENE_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym559$LUCENE_QUERY, $list157, NIL, $list563 );
    methods.subloop_register_instance_method( $sym559$LUCENE_QUERY, $sym76$GET, $sym565$LUCENE_QUERY_GET_METHOD );
    classes.subloop_new_class( $sym566$LUCENE_CLIENT, $sym322$TCP_CLIENT, NIL, NIL, $list567 );
    classes.class_set_implements_slot_listeners( $sym566$LUCENE_CLIENT, NIL );
    classes.subloop_note_class_initialization_function( $sym566$LUCENE_CLIENT, $sym568$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym566$LUCENE_CLIENT, $sym569$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE );
    subloop_reserved_initialize_lucene_client_class( $sym566$LUCENE_CLIENT );
    methods.methods_incorporate_instance_method( $sym101$INITIALIZE, $sym566$LUCENE_CLIENT, $list46, NIL, $list330 );
    methods.subloop_register_instance_method( $sym566$LUCENE_CLIENT, $sym101$INITIALIZE, $sym570$LUCENE_CLIENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym286$SEARCH, $sym566$LUCENE_CLIENT, $list9, $list571, $list572 );
    methods.subloop_register_instance_method( $sym566$LUCENE_CLIENT, $sym286$SEARCH, $sym574$LUCENE_CLIENT_SEARCH_METHOD );
    methods.methods_incorporate_instance_method( $sym288$COUNT, $sym566$LUCENE_CLIENT, $list9, $list345, $list575 );
    methods.subloop_register_instance_method( $sym566$LUCENE_CLIENT, $sym288$COUNT, $sym576$LUCENE_CLIENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym573$LUCENE_REQUEST, $sym566$LUCENE_CLIENT, $list360, $list577, $list578 );
    methods.subloop_register_instance_method( $sym566$LUCENE_CLIENT, $sym573$LUCENE_REQUEST, $sym580$LUCENE_CLIENT_LUCENE_REQUEST_METHOD );
    classes.subloop_new_class( $sym579$LUCENE_CLIENT_INTERACTION, $sym1$OBJECT, NIL, NIL, $list581 );
    classes.class_set_implements_slot_listeners( $sym579$LUCENE_CLIENT_INTERACTION, NIL );
    classes.subloop_note_class_initialization_function( $sym579$LUCENE_CLIENT_INTERACTION, $sym586$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym579$LUCENE_CLIENT_INTERACTION, $sym587$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE );
    subloop_reserved_initialize_lucene_client_interaction_class( $sym579$LUCENE_CLIENT_INTERACTION );
    methods.methods_incorporate_instance_method( $sym101$INITIALIZE, $sym579$LUCENE_CLIENT_INTERACTION, $list46, NIL, $list588 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym101$INITIALIZE, $sym591$LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym365$SET_DIRECTIVE, $sym579$LUCENE_CLIENT_INTERACTION, $list9, $list17, $list431 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym365$SET_DIRECTIVE, $sym593$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD );
    methods.methods_incorporate_instance_method( $sym371$BUILD_ANSWER, $sym579$LUCENE_CLIENT_INTERACTION, $list9, $list444, $list594 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym371$BUILD_ANSWER, $sym598$LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym454$GET_DIRECTIVE, $sym579$LUCENE_CLIENT_INTERACTION, $list9, NIL, $list455 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym454$GET_DIRECTIVE, $sym600$LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD );
    methods.methods_incorporate_instance_method( $sym366$SET_DIRECTIVE_ARG, $sym579$LUCENE_CLIENT_INTERACTION, $list9, $list17, $list458 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym366$SET_DIRECTIVE_ARG, $sym602$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD );
    methods.methods_incorporate_instance_method( $sym341$SET_DOCNO, $sym579$LUCENE_CLIENT_INTERACTION, $list9, $list17, $list434 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym341$SET_DOCNO, $sym604$LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD );
    methods.methods_incorporate_instance_method( $sym370$REQUEST_STRING, $sym579$LUCENE_CLIENT_INTERACTION, $list9, NIL, $list605 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym370$REQUEST_STRING, $sym607$LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym372$GET_ANSWER, $sym579$LUCENE_CLIENT_INTERACTION, $list9, NIL, $list608 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym372$GET_ANSWER, $sym611$LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym610$GET_LUCENE_PASSAGES, $sym579$LUCENE_CLIENT_INTERACTION, $list9, NIL, $list612 );
    methods.subloop_register_instance_method( $sym579$LUCENE_CLIENT_INTERACTION, $sym610$GET_LUCENE_PASSAGES, $sym614$LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD );
    classes.subloop_new_class( $sym590$LUCENE_PASSAGE_LIST, $sym482$BASIC_LIST, $list483, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym590$LUCENE_PASSAGE_LIST, NIL );
    classes.subloop_note_class_initialization_function( $sym590$LUCENE_PASSAGE_LIST, $sym615$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym590$LUCENE_PASSAGE_LIST, $sym616$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE );
    subloop_reserved_initialize_lucene_passage_list_class( $sym590$LUCENE_PASSAGE_LIST );
    methods.methods_incorporate_instance_method( $sym489$ACCEPTABLE_P, $sym590$LUCENE_PASSAGE_LIST, $list9, $list490, $list617 );
    methods.subloop_register_instance_method( $sym590$LUCENE_PASSAGE_LIST, $sym489$ACCEPTABLE_P, $sym619$LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym450$ADD, $sym590$LUCENE_PASSAGE_LIST, $list9, $list490, $list620 );
    methods.subloop_register_instance_method( $sym590$LUCENE_PASSAGE_LIST, $sym450$ADD, $sym622$LUCENE_PASSAGE_LIST_ADD_METHOD );
    classes.subloop_new_class( $sym618$LUCENE_PASSAGE, $sym54$CORPUS_PASSAGE, NIL, NIL, $list623 );
    classes.class_set_implements_slot_listeners( $sym618$LUCENE_PASSAGE, NIL );
    classes.subloop_note_class_initialization_function( $sym618$LUCENE_PASSAGE, $sym625$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym618$LUCENE_PASSAGE, $sym626$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE );
    subloop_reserved_initialize_lucene_passage_class( $sym618$LUCENE_PASSAGE );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym618$LUCENE_PASSAGE, $list9, NIL, $list627 );
    methods.subloop_register_instance_method( $sym618$LUCENE_PASSAGE, $sym8$GET_SOURCE, $sym629$LUCENE_PASSAGE_GET_SOURCE_METHOD );
    methods.methods_incorporate_instance_method( $sym87$GET_SCORE, $sym618$LUCENE_PASSAGE, $list9, NIL, $list630 );
    methods.subloop_register_instance_method( $sym618$LUCENE_PASSAGE, $sym87$GET_SCORE, $sym632$LUCENE_PASSAGE_GET_SCORE_METHOD );
    methods.methods_incorporate_instance_method( $sym493$IS_COMPLETE, $sym618$LUCENE_PASSAGE, $list9, NIL, $list633 );
    methods.subloop_register_instance_method( $sym618$LUCENE_PASSAGE, $sym493$IS_COMPLETE, $sym635$LUCENE_PASSAGE_IS_COMPLETE_METHOD );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym618$LUCENE_PASSAGE, $list9, $list47, $list636 );
    methods.subloop_register_instance_method( $sym618$LUCENE_PASSAGE, $sym45$PRINT, $sym638$LUCENE_PASSAGE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_PUBLICATION_DATE, $sym618$LUCENE_PASSAGE, $list9, NIL, $list38 );
    methods.subloop_register_instance_method( $sym618$LUCENE_PASSAGE, $sym29$GET_PUBLICATION_DATE, $sym639$LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD );
    classes.subloop_new_class( $sym640$CYCL_QUERY, $sym107$KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list641 );
    classes.class_set_implements_slot_listeners( $sym640$CYCL_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym640$CYCL_QUERY, $sym644$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym640$CYCL_QUERY, $sym645$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE );
    subloop_reserved_initialize_cycl_query_class( $sym640$CYCL_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym640$CYCL_QUERY, $list157, NIL, $list650 );
    methods.subloop_register_instance_method( $sym640$CYCL_QUERY, $sym76$GET, $sym655$CYCL_QUERY_GET_METHOD );
    methods.methods_incorporate_instance_method( $sym652$GET_FROM_KB, $sym640$CYCL_QUERY, $list157, $list656, $list657 );
    methods.subloop_register_instance_method( $sym640$CYCL_QUERY, $sym652$GET_FROM_KB, $sym659$CYCL_QUERY_GET_FROM_KB_METHOD );
    methods.methods_incorporate_instance_method( $sym653$GET_FROM_CORPUS, $sym640$CYCL_QUERY, $list157, $list660, $list661 );
    methods.subloop_register_instance_method( $sym640$CYCL_QUERY, $sym653$GET_FROM_CORPUS, $sym664$CYCL_QUERY_GET_FROM_CORPUS_METHOD );
    methods.methods_incorporate_instance_method( $sym663$GENERATE_ASSIGNMENTS, $sym640$CYCL_QUERY, $list157, $list665, $list666 );
    methods.subloop_register_instance_method( $sym640$CYCL_QUERY, $sym663$GENERATE_ASSIGNMENTS, $sym669$CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD );
    classes.subloop_new_class( $sym676$VAR_ASSIGNMENT, $sym0$INFORMATION, NIL, NIL, $list677 );
    classes.class_set_implements_slot_listeners( $sym676$VAR_ASSIGNMENT, NIL );
    classes.subloop_note_class_initialization_function( $sym676$VAR_ASSIGNMENT, $sym680$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym676$VAR_ASSIGNMENT, $sym681$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE );
    subloop_reserved_initialize_var_assignment_class( $sym676$VAR_ASSIGNMENT );
    methods.methods_incorporate_instance_method( $sym45$PRINT, $sym676$VAR_ASSIGNMENT, $list9, $list47, $list683 );
    methods.subloop_register_instance_method( $sym676$VAR_ASSIGNMENT, $sym45$PRINT, $sym686$VAR_ASSIGNMENT_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_CONTENT, $sym676$VAR_ASSIGNMENT, $list9, NIL, $list687 );
    methods.subloop_register_instance_method( $sym676$VAR_ASSIGNMENT, $sym19$GET_CONTENT, $sym689$VAR_ASSIGNMENT_GET_CONTENT_METHOD );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym676$VAR_ASSIGNMENT, $list9, NIL, $list690 );
    methods.subloop_register_instance_method( $sym676$VAR_ASSIGNMENT, $sym8$GET_SOURCE, $sym692$VAR_ASSIGNMENT_GET_SOURCE_METHOD );
    classes.subloop_new_class( $sym693$WORDNET_QUERY, $sym107$KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list694 );
    classes.class_set_implements_slot_listeners( $sym693$WORDNET_QUERY, NIL );
    classes.subloop_note_class_initialization_function( $sym693$WORDNET_QUERY, $sym696$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym693$WORDNET_QUERY, $sym697$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE );
    subloop_reserved_initialize_wordnet_query_class( $sym693$WORDNET_QUERY );
    methods.methods_incorporate_instance_method( $sym76$GET, $sym693$WORDNET_QUERY, $list46, NIL, $list700 );
    methods.subloop_register_instance_method( $sym693$WORDNET_QUERY, $sym76$GET, $sym704$WORDNET_QUERY_GET_METHOD );
    classes.subloop_new_class( $sym705$WORDNET_GLOSS, $sym0$INFORMATION, NIL, NIL, $list706 );
    classes.class_set_implements_slot_listeners( $sym705$WORDNET_GLOSS, NIL );
    classes.subloop_note_class_initialization_function( $sym705$WORDNET_GLOSS, $sym707$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS );
    classes.subloop_note_instance_initialization_function( $sym705$WORDNET_GLOSS, $sym708$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE );
    subloop_reserved_initialize_wordnet_gloss_class( $sym705$WORDNET_GLOSS );
    methods.methods_incorporate_instance_method( $sym19$GET_CONTENT, $sym705$WORDNET_GLOSS, $list9, NIL, $list709 );
    methods.subloop_register_instance_method( $sym705$WORDNET_GLOSS, $sym19$GET_CONTENT, $sym711$WORDNET_GLOSS_GET_CONTENT_METHOD );
    methods.methods_incorporate_instance_method( $sym8$GET_SOURCE, $sym705$WORDNET_GLOSS, $list9, NIL, $list712 );
    methods.subloop_register_instance_method( $sym705$WORDNET_GLOSS, $sym8$GET_SOURCE, $sym714$WORDNET_GLOSS_GET_SOURCE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_search_engine_file();
  }

  @Override
  public void initializeVariables()
  {
    init_search_engine_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_search_engine_file();
  }
  static
  {
    me = new search_engine();
    $default_corpus$ = null;
    $world_wide_web_corpus$ = null;
    $authorized_google_key$ = null;
    $google_client_key_file$ = null;
    $google_client_host$ = null;
    $google_client_port$ = null;
    $google_client$ = null;
    $wikipedia$ = null;
    $lucene_client_host$ = null;
    $lucene_client_port$ = null;
    $lucene_client$ = null;
    $google_api_method_invocation_count$ = null;
    $sym0$INFORMATION = makeSymbol( "INFORMATION" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-SOURCE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym3$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym4$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS" );
    $sym5$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym6$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE" );
    $sym8$GET_SOURCE = makeSymbol( "GET-SOURCE" );
    $list9 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list10 = ConsesLow.list( makeString( "@return objectp; the source of this piece of information, nil if unknown" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym11$INFORMATION_GET_SOURCE_METHOD = makeSymbol( "INFORMATION-GET-SOURCE-METHOD" );
    $sym12$ABSTRACT_PASSAGE = makeSymbol( "ABSTRACT-PASSAGE" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "VECTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "MORE-RECENT" ), ConsesLow
        .list( makeSymbol( "PASSAGE1" ), makeSymbol( "PASSAGE2" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VECTOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DATES" ), NIL, makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PUBLICATION-DATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), EQUAL,
                    ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OLDER" ), ConsesLow.list( makeSymbol( "OTHER-PASSAGE" ) ),
                        makeKeyword( "PUBLIC" ) ) );
    $sym14$VECTOR = makeSymbol( "VECTOR" );
    $sym15$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS" );
    $sym16$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE" );
    $list17 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list18 = ConsesLow.list( makeString( "@return boolean; t if OBJECT is equal to this passage, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
        "ABSTRACT-PASSAGE-P" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ) );
    $sym19$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym20$ABSTRACT_PASSAGE_EQUAL_METHOD = makeSymbol( "ABSTRACT-PASSAGE-EQUAL-METHOD" );
    $sym21$SIMILARITY = makeSymbol( "SIMILARITY" );
    $list22 = ConsesLow.list( makeSymbol( "PASSAGE1" ), makeSymbol( "PASSAGE2" ) );
    $list23 = ConsesLow.list( makeString(
        "@param PASSAGE1 abstract-passage-p\n   @param PASSAGE2 abstract-passage-p\n   @return non-negative-integerp; the similarity between PASSAGE1 and PASSAGE2 with\n   0 indicating no similarity and 1 indicating identity" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGE1" ), makeSymbol( "ABSTRACT-PASSAGE-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGE2" ), makeSymbol(
            "ABSTRACT-PASSAGE-P" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "STRING=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE1" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-CONTENT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE1" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "GET-VECTOR" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VECTOR" ) ) ) ) ) );
    $sym24$ABSTRACT_PASSAGE_P = makeSymbol( "ABSTRACT-PASSAGE-P" );
    $sym25$GET_VECTOR = makeSymbol( "GET-VECTOR" );
    $sym26$ABSTRACT_PASSAGE_SIMILARITY_METHOD = makeSymbol( "ABSTRACT-PASSAGE-SIMILARITY-METHOD" );
    $sym27$GET_DATES = makeSymbol( "GET-DATES" );
    $list28 = ConsesLow.list( makeString( "@return listp; the list of dates found in this passage" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DATES" ), NIL ), makeSymbol(
        "DATE" ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "THISDAY" ), makeSymbol( "THISMONTH" ), makeSymbol( "THISYEAR" ) ), ConsesLow.list( makeSymbol(
            "DECODE-UNIVERSAL-DATE" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-DATE" ) ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "THISDAY" ), makeSymbol( "THISMONTH" ) ), ConsesLow.list( makeSymbol(
                "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "PDAY" ), makeSymbol( "PMONTH" ), makeSymbol( "PYEAR" ) ), ConsesLow.list( makeSymbol( "DECODE-UNIVERSAL-DATE" ), ConsesLow.list( makeSymbol(
                    "CYCL-DATE-TO-UNIVERSAL-DATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PUBLICATION-DATE" ) ) ) ) ), ConsesLow.list(
                        makeSymbol( "IGNORE" ), makeSymbol( "PMONTH" ), makeSymbol( "PDAY" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE.STRING" ), ConsesLow.list( makeSymbol(
                            "RESPORATOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "DATE" ),
                                    makeSymbol( "YEAR" ), makeSymbol( "TIMEOFYEAR" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DATE" ), ConsesLow.list(
                                        makeSymbol( "PARSE-DATE" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TYPE.STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DATE" ), ConsesLow.list(
                                            makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "MINUTE" ), makeSymbol( "HOUR" ), makeSymbol( "DAY" ), makeSymbol( "MONTH" ),
                                                makeSymbol( "YEAR" ) ), ConsesLow.list( makeSymbol( "DECODE-EXTENDED-UNIVERSAL-DATE" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol(
                                                    "SECOND" ), makeSymbol( "MINUTE" ), makeSymbol( "HOUR" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "YEAR" ), makeSymbol(
                                                        "THISYEAR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "YEAR" ), ConsesLow.list( makeSymbol( "GUESS-YEAR" ), makeSymbol( "PYEAR" ), makeSymbol(
                                                            "PMONTH" ), makeSymbol( "PDAY" ), makeSymbol( "MONTH" ), makeSymbol( "DAY" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                                "CONSTRUCT-REDUCED-CYCL-DATE" ), NIL, NIL, NIL, makeSymbol( "DAY" ), makeSymbol( "MONTH" ), makeSymbol( "YEAR" ) ), makeSymbol( "DATES" ) ) ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DATES" ) ) ) );
    $sym29$GET_PUBLICATION_DATE = makeSymbol( "GET-PUBLICATION-DATE" );
    $list30 = ConsesLow.list( makeSymbol( "DATE" ), makeSymbol( "YEAR" ), makeSymbol( "TIMEOFYEAR" ) );
    $sym31$ABSTRACT_PASSAGE_GET_DATES_METHOD = makeSymbol( "ABSTRACT-PASSAGE-GET-DATES-METHOD" );
    $sym32$OLDER = makeSymbol( "OLDER" );
    $list33 = ConsesLow.list( makeSymbol( "OTHER-PASSAGE" ) );
    $list34 = ConsesLow.list( makeString( "@param OTHER-PASSAGE, abstract-passage-p\n   @return BOOLEAN, T is this passage is older than OTHER-PASSAGE, NIL otherwise.\n   @owner bertolo" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "OTHER-PASSAGE" ), makeSymbol( "ABSTRACT-PASSAGE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SELF-DATE" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PUBLICATION-DATE" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-DATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "OTHER-PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PUBLICATION-DATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                    makeSymbol( "DATE-P" ), makeSymbol( "SELF-DATE" ) ), ConsesLow.list( makeSymbol( "DATE-P" ), makeSymbol( "OTHER-DATE" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "DATE<" ),
                        makeSymbol( "SELF-DATE" ), makeSymbol( "OTHER-DATE" ) ), ConsesLow.list( makeSymbol( "RET" ), T ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "SELF-DOC-ID" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DOC-ID" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                                makeSymbol( "SELF-DOC-ID" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, makeSymbol( "SELF-DOC-ID" ), ConsesLow.list(
                                    makeSymbol( "GET-SLOT" ), makeSymbol( "OTHER-PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DOC-ID" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow
                                        .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SELF-SENTENCE-NUM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "SENTENCE-NUMBER" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-SENTENCE-NUM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                                "OTHER-PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENTENCE-NUMBER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
                                                    "CAND" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "SELF-SENTENCE-NUM" ) ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol(
                                                        "OTHER-SENTENCE-NUM" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol(
                                                            "SELF-SENTENCE-NUM" ), makeSymbol( "OTHER-SENTENCE-NUM" ) ) ) ) ) ) ) ) );
    $sym35$DOC_ID = makeSymbol( "DOC-ID" );
    $sym36$SENTENCE_NUMBER = makeSymbol( "SENTENCE-NUMBER" );
    $sym37$ABSTRACT_PASSAGE_OLDER_METHOD = makeSymbol( "ABSTRACT-PASSAGE-OLDER-METHOD" );
    $list38 = ConsesLow.list( makeString( "@return date-p; the publication date of this passage, or nil if it can't be determined" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym39$ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol( "ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD" );
    $sym40$SIMPLE_PASSAGE = makeSymbol( "SIMPLE-PASSAGE" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "TEXT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ) );
    $sym42$TEXT = makeSymbol( "TEXT" );
    $sym43$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS" );
    $sym44$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE" );
    $sym45$PRINT = makeSymbol( "PRINT" );
    $list46 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list47 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list48 = ConsesLow.list( makeString( "Prints PASSAGE to STREAM, ignoring depth" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TEXT" ),
        makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD" );
    $sym50$SIMPLE_PASSAGE_PRINT_METHOD = makeSymbol( "SIMPLE-PASSAGE-PRINT-METHOD" );
    $list51 = ConsesLow.list( makeString( "@return stringp; the text of this passage" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEXT" ) ) );
    $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD" );
    $sym53$SIMPLE_PASSAGE_GET_CONTENT_METHOD = makeSymbol( "SIMPLE-PASSAGE-GET-CONTENT-METHOD" );
    $sym54$CORPUS_PASSAGE = makeSymbol( "CORPUS-PASSAGE" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "CORPUS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TEXT" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SCORE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CORPUS" ),
            NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "GET-PARSE-TREES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "IDENTIFY-ENTITIES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym56$CORPUS = makeSymbol( "CORPUS" );
    $sym57$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS" );
    $sym58$SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE" );
    $sym59$GET_CORPUS = makeSymbol( "GET-CORPUS" );
    $list60 = ConsesLow.list( makeString( "@return stringp; the symbolical name of the corpus this passage came from" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CORPUS" ) ) );
    $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD" );
    $sym62$CORPUS_PASSAGE_GET_CORPUS_METHOD = makeSymbol( "CORPUS-PASSAGE-GET-CORPUS-METHOD" );
    $list63 = ConsesLow.list( makeString( "@return svector-p; the word vector corresponding to this passage" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "VECTOR" ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "VECTOR" ), ConsesLow.list( makeSymbol( "NEW-STRING-VECTOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VECTOR" ) ) );
    $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ABSTRACT-PASSAGE-METHOD" );
    $sym65$ABSTRACT_PASSAGE_GET_VECTOR_METHOD = makeSymbol( "ABSTRACT-PASSAGE-GET-VECTOR-METHOD" );
    $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD" );
    $sym67$CORPUS_PASSAGE_GET_CONTENT_METHOD = makeSymbol( "CORPUS-PASSAGE-GET-CONTENT-METHOD" );
    $sym68$IDENTIFY_ENTITIES = makeSymbol( "IDENTIFY-ENTITIES" );
    $list69 = ConsesLow.list( makeSymbol( "LEXICON" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TYPES-TO-IDENTIFY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ) ) );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TYPES-TO-IDENTIFY" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "LEXICON" ), makeSymbol(
        "ABSTRACT-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TAGGER" ), ConsesLow.list( makeSymbol(
                "GET-TAGGER" ) ) ), ConsesLow.list( makeSymbol( "ENTITIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCES" ), ConsesLow.list( makeSymbol(
                    "STRING-SENTENCIFY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                        "DO-VECTOR" ), ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "SENTENCES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TAGGED" ), ConsesLow.list(
                            makeSymbol( "TAGGER-TAG-SENTENCE" ), makeSymbol( "TAGGER" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( makeSymbol( "LEXIFIED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY-SENTENCE" ) ), makeSymbol( "TAGGED" ) ) ) ), ConsesLow.list( makeSymbol( "SENTENCE-DO-WORDS" ), ConsesLow.list(
                                    makeSymbol( "WORD" ), makeSymbol( "LEXIFIED" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "WORD-INFO" ),
                                        makeSymbol( "WORD" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list(
                                            makeSymbol( "SEMTRANS-LEXICON-P" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY" ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow
                                                .list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "POS-TAGS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword(
                                                        "PENN-TAGS" ) ) ), ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                            makeSymbol( "GET" ) ), makeKeyword( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                                                                ">" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "STRING" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "INTERSECTION" ), makeSymbol(
                                                                    "POS-TAGS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NNP" ), makeKeyword( "NNPS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                        "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TYPES-TO-IDENTIFY" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                                                            makeSymbol( "MORE-SPECIFIC-P" ), makeSymbol( "DENOT" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                                                                                makeSymbol( "INDIVIDUAL?" ), makeSymbol( "DENOT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DENOT" ), ConsesLow.list(
                                                                                    makeSymbol( "MAKE-EL-FORMULA" ), constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) ), ConsesLow.list(
                                                                                        makeSymbol( "BQ-LIST" ), makeSymbol( "STRING" ), makeSymbol( "DENOT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                                                                            .list( ConsesLow.list( makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol( "NEW-TEXTUAL-FOCUS-ENTITY" ), makeSymbol( "STRING" ),
                                                                                                makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol(
                                                                                                    "QUOTE" ), makeSymbol( "ADD-PASSAGE" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol(
                                                                                                        "ENTITY" ), makeSymbol( "ENTITIES" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ) ) ) ) ) ) ) ) ) ) ),
                ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ENTITIES" ) ) ) );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Organization" ) ) );
    $sym72$LISTP = makeSymbol( "LISTP" );
    $sym73$ABSTRACT_LEXICON_P = makeSymbol( "ABSTRACT-LEXICON-P" );
    $sym74$LEARN = makeSymbol( "LEARN" );
    $sym75$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym76$GET = makeSymbol( "GET" );
    $kw77$DENOT = makeKeyword( "DENOT" );
    $kw78$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $kw79$STRING = makeKeyword( "STRING" );
    $list80 = ConsesLow.list( makeKeyword( "NNP" ), makeKeyword( "NNPS" ) );
    $const81$InstanceNamedFn = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn" ) );
    $sym82$ADD_PASSAGE = makeSymbol( "ADD-PASSAGE" );
    $sym83$CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD = makeSymbol( "CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD" );
    $sym84$MAX_INSTANCES = makeSymbol( "MAX-INSTANCES" );
    $list85 = ConsesLow.list( makeSymbol( "PASSAGES" ) );
    $list86 = ConsesLow.list( makeString( "@param PASSAGES listp\n    @return list-p; the highest scoring passages among PASSAGES" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGES" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAX-SCORE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "MAX-PASSAGES" ), NIL ) ), ConsesLow.list( makeSymbol(
            "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "PASSAGES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SCORE" ) ) ), makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX-SCORE" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SCORE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                        "PASSAGE" ), makeSymbol( "PASSAGES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "GET-SCORE" ) ) ), makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "PASSAGE" ), makeSymbol( "MAX-PASSAGES" ) ) ) ), ConsesLow
                                .list( makeSymbol( "RET" ), makeSymbol( "MAX-PASSAGES" ) ) ) );
    $sym87$GET_SCORE = makeSymbol( "GET-SCORE" );
    $sym88$CORPUS_PASSAGE_MAX_INSTANCES_METHOD = makeSymbol( "CORPUS-PASSAGE-MAX-INSTANCES-METHOD" );
    $sym89$GET_PARSE_TREES = makeSymbol( "GET-PARSE-TREES" );
    $list90 = ConsesLow.list( makeString(
        "@return listp; the list of the parse trees obtained\n  from parsing the sentences of this passage. The passage\n  is broken into sentences by first turning it into a \n  document-p.\n  @owner bertolo" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DOCUMENT" ), ConsesLow.list( makeSymbol( "NEW-DOCUMENT" ), ConsesLow.list( makeSymbol( "MAKE-STRING-INPUT-STREAM" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "TREES" ), NIL ) ), ConsesLow.list( makeSymbol(
                "DOCUMENT-DO-SENTENCES" ), ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "DOCUMENT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SENT-STRING" ),
                    ConsesLow.list( makeSymbol( "SENTENCE-STRING" ), makeSymbol( "SENTENCE" ) ) ), makeSymbol( "PARSE-TREE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SENT-STRING" ), ConsesLow.list(
                        makeSymbol( "CSETQ" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "CHARNIAK-PARSER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PARSER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), makeSymbol( "SENT-STRING" ) ) ),
                        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PARSE-TREE" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "PARSE-TREE" ), makeSymbol( "TREES" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                            "RET" ), makeSymbol( "TREES" ) ) ) );
    $sym91$CHARNIAK_PARSER = makeSymbol( "CHARNIAK-PARSER" );
    $sym92$GET_PARSER = makeSymbol( "GET-PARSER" );
    $sym93$PARSE = makeSymbol( "PARSE" );
    $sym94$CORPUS_PASSAGE_GET_PARSE_TREES_METHOD = makeSymbol( "CORPUS-PASSAGE-GET-PARSE-TREES-METHOD" );
    $sym95$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TIMEOUT" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HANDLE-ERROR" ),
            ConsesLow.list( makeSymbol( "ERROR" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym97$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym98$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym99$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS" );
    $sym100$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE" );
    $sym101$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR-HANDLING" ), makeKeyword( "WARN" ) ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "TIMEOUT" ), makeInteger( 720 ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INFORMATION-REQUEST-METHOD" );
    $kw104$WARN = makeKeyword( "WARN" );
    $int105$720 = makeInteger( 720 );
    $sym106$INFORMATION_REQUEST_INITIALIZE_METHOD = makeSymbol( "INFORMATION-REQUEST-INITIALIZE-METHOD" );
    $sym107$KNOWLEDGE_SOURCE_QUERY = makeSymbol( "KNOWLEDGE-SOURCE-QUERY" );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER" ), NIL,
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym109$QUERY = makeSymbol( "QUERY" );
    $sym110$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS" );
    $sym111$SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE" );
    $sym112$ANSWER = makeSymbol( "ANSWER" );
    $list113 = ConsesLow.list( makeString( "@return listp; the list of answers that is the result of executing this query" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "ANSWERS" ), makeSymbol(
        "ERROR" ), makeSymbol( "TIMEDOUT?" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "WITH-TIMEOUT" ), ConsesLow.list( makeSymbol(
            "TIMEOUT" ), makeSymbol( "TIMEDOUT?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TIMEDOUT?" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Query execution timeout after ~a seconds" ), makeSymbol(
                    "TIMEOUT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "HANDLE-ERROR" ) ), makeSymbol( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWERS" ) ) ) );
    $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD" );
    $sym115$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str116$Query_execution_timeout_after__a_ = makeString( "Query execution timeout after ~a seconds" );
    $sym117$HANDLE_ERROR = makeSymbol( "HANDLE-ERROR" );
    $sym118$KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD = makeSymbol( "KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD" );
    $list119 = ConsesLow.list( makeString( "Prints this search engine query to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
        makeString( "#<QUERY: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "QUERY" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD" );
    $str121$__QUERY__ = makeString( "#<QUERY: " );
    $str122$_ = makeString( ">" );
    $sym123$KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD = makeSymbol( "KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD" );
    $list124 = ConsesLow.list( makeSymbol( "ERROR" ) );
    $list125 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeKeyword( "THROW" ), ConsesLow.list( makeSymbol( "ERROR" ), makeSymbol( "ERROR" ) ) ), ConsesLow
        .list( makeKeyword( "WARN" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ) ) ) );
    $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD" );
    $kw127$THROW = makeKeyword( "THROW" );
    $sym128$KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD = makeSymbol( "KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD" );
    $str129$CNSjan2004 = makeString( "CNSjan2004" );
    $sym130$CORPUS_QUERY = makeSymbol( "CORPUS-QUERY" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "CORPUS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "GET-CORPUS-PATH-MAPPING" ),
        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CORPUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-CORPUS-PATH" ), ConsesLow.list( makeSymbol( "CORPUS" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym132$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS" );
    $sym133$SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE" );
    $sym134$GET_CORPUS_PATH_MAPPING = makeSymbol( "GET-CORPUS-PATH-MAPPING" );
    $list135 = ConsesLow.list( makeString( "@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus" ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $sym136$CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol( "CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD" );
    $list137 = ConsesLow.list( makeString( "@return stringp; the corpus of this query" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CORPUS" ) ) );
    $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CORPUS-QUERY-METHOD" );
    $sym139$CORPUS_QUERY_GET_CORPUS_METHOD = makeSymbol( "CORPUS-QUERY-GET-CORPUS-METHOD" );
    $sym140$GET_CORPUS_PATH = makeSymbol( "GET-CORPUS-PATH" );
    $list141 = ConsesLow.list( makeString( "@return stringp; the specific index or config file used for CORPUS by this query" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CDR" ), ConsesLow.list(
        makeSymbol( "ASSOC" ), makeSymbol( "CORPUS" ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORPUS-PATH-MAPPING" ) ) ), ConsesLow.list(
            makeSymbol( "QUOTE" ), EQUALP ) ) ) ) );
    $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CORPUS-QUERY-METHOD" );
    $sym143$CORPUS_QUERY_GET_CORPUS_PATH_METHOD = makeSymbol( "CORPUS-QUERY-GET-CORPUS-PATH-METHOD" );
    $list144 = ConsesLow.list( new SubLObject[] { makeString( "Prints this search engine query to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol(
        "WRITE-STRING" ), makeString( "#<QUERY(" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "CORPUS" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
            makeString( "): " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "QUERY" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ),
                makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CORPUS-QUERY-METHOD" );
    $str146$__QUERY_ = makeString( "#<QUERY(" );
    $str147$___ = makeString( "): " );
    $sym148$CORPUS_QUERY_PRINT_METHOD = makeSymbol( "CORPUS-QUERY-PRINT-METHOD" );
    $sym149$GLIMPSE_QUERY = makeSymbol( "GLIMPSE-QUERY" );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym151$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS" );
    $sym152$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE" );
    $str153$Non_supported_corpus__a = makeString( "Non supported corpus ~a" );
    $list154 = ConsesLow.list( makeString( "@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus" ), ConsesLow.list( makeSymbol(
        "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.cons( makeString( "AQUAINT" ), makeString( "/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small" ) ), ConsesLow.cons( makeString(
            "CNS" ), makeString( "/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small" ) ), ConsesLow.cons( makeString( "CNSjan2004" ), makeString(
                "/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small" ) ) ) ) ) );
    $list155 = ConsesLow.list( ConsesLow.cons( makeString( "AQUAINT" ), makeString( "/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small" ) ), ConsesLow.cons( makeString( "CNS" ), makeString(
        "/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small" ) ), ConsesLow.cons( makeString( "CNSjan2004" ), makeString(
            "/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small" ) ) );
    $sym156$GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol( "GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD" );
    $list157 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list158 = ConsesLow.list( makeString( "@param QUERY stringpe\n   @return listp; a ranked list @xref corpus-passages matching QUERY" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "PASSAGES" ), NIL ), ConsesLow.list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "ASK-GLIMPSE" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "BQ-CONS" ), ConsesLow.list( makeSymbol(
            "BQ-LIST" ), makeString( "index" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORPUS-PATH" ) ) ) ), ConsesLow.list( makeSymbol(
                "QUOTE" ), ConsesLow.list( ConsesLow.list( makeString( "limit" ), makeString( "100:100" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol(
                    "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "FILE" ), makeSymbol( "ARTICLE" ), makeSymbol( "LINE" ), makeSymbol( "TEXT" ),
                        makeSymbol( "&ALLOW-OTHER-KEYS" ) ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GLIMPSE-PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORPUS" ) ) ), makeSymbol( "FILE" ), makeSymbol( "ARTICLE" ), makeSymbol( "LINE" ), makeSymbol( "TEXT" ) ),
                            makeSymbol( "PASSAGES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "REMOVE-DUPLICATES" ), makeSymbol( "PASSAGES" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                makeSymbol( "PASSAGE-EQUAL" ) ) ) ) ) );
    $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GLIMPSE-QUERY-METHOD" );
    $str160$index = makeString( "index" );
    $list161 = ConsesLow.list( ConsesLow.list( makeString( "limit" ), makeString( "100:100" ) ) );
    $kw162$FILE = makeKeyword( "FILE" );
    $kw163$ARTICLE = makeKeyword( "ARTICLE" );
    $kw164$LINE = makeKeyword( "LINE" );
    $kw165$TEXT = makeKeyword( "TEXT" );
    $sym166$PASSAGE_EQUAL = makeSymbol( "PASSAGE-EQUAL" );
    $sym167$GLIMPSE_QUERY_GET_METHOD = makeSymbol( "GLIMPSE-QUERY-GET-METHOD" );
    $str168$_glimpse_cgi = makeString( "/glimpse.cgi" );
    $kw169$POST = makeKeyword( "POST" );
    $str170$query = makeString( "query" );
    $sym171$GLIMPSE_PASSAGE = makeSymbol( "GLIMPSE-PASSAGE" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "ARTICLE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "LINE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PUBLICATION-DATE" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SOURCE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym173$LINE = makeSymbol( "LINE" );
    $sym174$ARTICLE = makeSymbol( "ARTICLE" );
    $sym175$FILE = makeSymbol( "FILE" );
    $sym176$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS" );
    $sym177$SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE" );
    $sym178$STRINGP = makeSymbol( "STRINGP" );
    $sym179$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym180$STRING = makeSymbol( "STRING" );
    $list181 = ConsesLow.list( makeString( "Prints this glimpse passage to STREM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "GET-SOURCE" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEXT" ),
            ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TEXT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD" );
    $sym183$GLIMPSE_PASSAGE_PRINT_METHOD = makeSymbol( "GLIMPSE-PASSAGE-PRINT-METHOD" );
    $list184 = ConsesLow.list( makeString( "@return date-p; the publication date of this passage, or nil if it can't be determined" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow
        .list( makeSymbol( "LENGTH" ), makeSymbol( "FILE" ) ), EIGHT_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "YEAR" ), ConsesLow.list( makeSymbol(
            "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "FILE" ), ZERO_INTEGER, FOUR_INTEGER ) ) ), ConsesLow.list( makeSymbol( "MONTH" ), ConsesLow.list( makeSymbol(
                "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "FILE" ), FOUR_INTEGER, SIX_INTEGER ) ) ), ConsesLow.list( makeSymbol( "DAY" ), ConsesLow.list( makeSymbol(
                    "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "FILE" ), SIX_INTEGER, EIGHT_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                        "CONSTRUCT-REDUCED-CYCL-DATE" ), NIL, NIL, NIL, makeSymbol( "DAY" ), makeSymbol( "MONTH" ), makeSymbol( "YEAR" ) ) ) ) ) );
    $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD" );
    $sym186$GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol( "GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD" );
    $list187 = ConsesLow.list( makeString( "@return stringp; the location of this passage" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
        "~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a" ), makeSymbol( "CORPUS" ), makeSymbol( "FILE" ), makeSymbol( "ARTICLE" ), makeSymbol( "LINE" ) ) ) );
    $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD" );
    $str189$__Corpus___a___File___a___Article = makeString( "~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a" );
    $sym190$GLIMPSE_PASSAGE_GET_SOURCE_METHOD = makeSymbol( "GLIMPSE-PASSAGE-GET-SOURCE-METHOD" );
    $sym191$GURUQA_QUERY = makeSymbol( "GURUQA-QUERY" );
    $sym192$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS" );
    $sym193$SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE" );
    $list194 = ConsesLow.list( makeString( "@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "INDICES" ), ConsesLow.list( makeSymbol( "GURUQA-ANSWER-INDEXES" ), makeSymbol( "QUERY" ) ) ), makeSymbol( "PASSAGES" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INDEX" ),
            makeSymbol( "INDICES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GURUQA-PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "GET-CORPUS" ) ) ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "INDEX" ), makeKeyword( "DOC" ) ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "INDEX" ), makeKeyword(
                    "SENT" ) ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "INDEX" ), makeKeyword( "LEN" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "ERROR-HANDLING" ) ) ) ), makeSymbol( "PASSAGES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "PASSAGES" ) ) ) ) );
    $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GURUQA-QUERY-METHOD" );
    $kw196$DOC = makeKeyword( "DOC" );
    $kw197$SENT = makeKeyword( "SENT" );
    $kw198$LEN = makeKeyword( "LEN" );
    $sym199$GURUQA_QUERY_GET_METHOD = makeSymbol( "GURUQA-QUERY-GET-METHOD" );
    $sym200$GURUQA_PASSAGE = makeSymbol( "GURUQA-PASSAGE" );
    $list201 = ConsesLow.list( ConsesLow.list( makeSymbol( "DOCUMENT-ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SENTENCE-ID" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SPAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "ERROR-HANDLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SOURCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HANDLE-ERROR" ), ConsesLow.list(
            makeSymbol( "ERROR" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym202$SPAN = makeSymbol( "SPAN" );
    $sym203$SENTENCE_ID = makeSymbol( "SENTENCE-ID" );
    $sym204$DOCUMENT_ID = makeSymbol( "DOCUMENT-ID" );
    $sym205$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS" );
    $sym206$SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE" );
    $sym207$INTEGERP = makeSymbol( "INTEGERP" );
    $list208 = ConsesLow.list( makeKeyword( "THROW" ), makeKeyword( "WARN" ), makeKeyword( "IGNORE" ) );
    $str209$Invalid_error_handling_tag = makeString( "Invalid error-handling tag" );
    $list210 = ConsesLow.list( makeString( "Prints this guruqa passage to STREAM, ignoring depth" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "GET-SOURCE" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEXT" ),
            ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TEXT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD" );
    $sym212$GURUQA_PASSAGE_PRINT_METHOD = makeSymbol( "GURUQA-PASSAGE-PRINT-METHOD" );
    $list213 = ConsesLow.list( makeString( "@return stringp; the location of this passage" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
        "Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a" ), makeSymbol( "CORPUS" ), makeSymbol( "DOCUMENT-ID" ), makeSymbol( "SENTENCE-ID" ), makeSymbol( "SPAN" ) ) ) );
    $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD" );
    $str215$Corpus___a__Document___a__Sentenc = makeString( "Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a" );
    $sym216$GURUQA_PASSAGE_GET_SOURCE_METHOD = makeSymbol( "GURUQA-PASSAGE-GET-SOURCE-METHOD" );
    $list217 = ConsesLow.list( makeString( "@return stringp; the text of this passage" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEXT" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol(
        "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEXT" ), ConsesLow.list( makeSymbol(
            "GURUQA-RETRIEVE-PASSAGE" ), makeSymbol( "DOCUMENT-ID" ), makeSymbol( "SENTENCE-ID" ), makeSymbol( "SPAN" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol(
                "HANDLE-ERROR" ), makeSymbol( "SELF" ), makeSymbol( "ERROR" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEXT" ) ) );
    $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD" );
    $sym219$GURUQA_PASSAGE_GET_CONTENT_METHOD = makeSymbol( "GURUQA-PASSAGE-GET-CONTENT-METHOD" );
    $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD" );
    $sym221$GURUQA_PASSAGE_HANDLE_ERROR_METHOD = makeSymbol( "GURUQA-PASSAGE-HANDLE-ERROR-METHOD" );
    $sym222$LEMUR_QUERY = makeSymbol( "LEMUR-QUERY" );
    $list223 = ConsesLow.list( ConsesLow.list( makeSymbol( "DOCNO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SENTNO" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "GET-CORPUS-PATH-MAPPING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym224$SENTNO = makeSymbol( "SENTNO" );
    $sym225$DOCNO = makeSymbol( "DOCNO" );
    $sym226$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS" );
    $sym227$SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE" );
    $int228$50 = makeInteger( 50 );
    $sym229$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $list230 = ConsesLow.list( makeString( "@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus" ), ConsesLow.list( makeSymbol(
        "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.cons( makeString( "AQUAINT" ), makeString( "/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param" ) ), ConsesLow.cons(
            makeString( "CNS" ), makeString( "/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param" ) ), ConsesLow.cons( makeString( "XCNS" ), makeString(
                "/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param" ) ), ConsesLow.cons( makeString( "WIKIPEDIA" ), makeString( "/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param" ) ),
            ConsesLow.cons( makeString( "CNSjan2004" ), makeString( "/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param" ) ) ) ) ) );
    $list231 = ConsesLow.list( ConsesLow.cons( makeString( "AQUAINT" ), makeString( "/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param" ) ), ConsesLow.cons( makeString( "CNS" ), makeString(
        "/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param" ) ), ConsesLow.cons( makeString( "XCNS" ), makeString( "/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param" ) ), ConsesLow.cons( makeString(
            "WIKIPEDIA" ), makeString( "/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param" ) ), ConsesLow.cons( makeString( "CNSjan2004" ), makeString(
                "/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param" ) ) );
    $sym232$LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol( "LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD" );
    $list233 = ConsesLow.list( makeString( "@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PASSAGES" ), NIL ), ConsesLow.list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "ASK-LEMUR" ), makeSymbol( "QUERY" ), makeSymbol( "DOCNO" ), makeSymbol( "SENTNO" ), ONE_INTEGER, ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORPUS-PATH" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ),
                makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SCORE" ), makeSymbol( "TEXT" ) ), makeSymbol( "ANSWER" ), ConsesLow.list(
                    makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LEMUR-PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "GET-CORPUS" ) ) ), makeSymbol( "ID" ), makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "STRIP-PASSAGE-HEADER" ), makeSymbol( "TEXT" ) ) ), makeSymbol( "PASSAGES" ) ) ) ), ConsesLow.list(
                            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), ConsesLow.list( makeSymbol( "REMOVE-DUPLICATES" ), makeSymbol( "PASSAGES" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                makeSymbol( "PASSAGE-EQUAL" ) ) ) ) ) ) );
    $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEMUR-QUERY-METHOD" );
    $list235 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SCORE" ), makeSymbol( "TEXT" ) );
    $sym236$LEMUR_QUERY_GET_METHOD = makeSymbol( "LEMUR-QUERY-GET-METHOD" );
    $str237$_cyc_projects_aquaint_lemur_indic = makeString( "/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param" );
    $str238$_lemur_cgi = makeString( "/lemur.cgi" );
    $str239$n = makeString( "n" );
    $str240$N = makeString( "N" );
    $str241$l = makeString( "l" );
    $str242$p = makeString( "p" );
    $sym243$LEMUR_PASSAGE = makeSymbol( "LEMUR-PASSAGE" );
    $list244 = ConsesLow.list( ConsesLow.list( makeSymbol( "DOC-ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SENTENCE-NUMBER" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SCORE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SOURCE" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PUBLICATION-DATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "GET-SCORE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym245$SCORE = makeSymbol( "SCORE" );
    $sym246$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS" );
    $sym247$SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE" );
    $list248 = ConsesLow.list( Characters.CHAR_period );
    $list249 = ConsesLow.list( makeString( "Prints this lemur passage to STREM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "GET-SOURCE" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TEXT" ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD" );
    $sym251$LEMUR_PASSAGE_PRINT_METHOD = makeSymbol( "LEMUR-PASSAGE-PRINT-METHOD" );
    $list252 = ConsesLow.list( makeString( "@return stringp; the location of this passage" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
        "~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a" ), makeSymbol( "CORPUS" ), makeSymbol( "DOC-ID" ), makeSymbol( "SENTENCE-NUMBER" ), makeSymbol( "SCORE" ) ) ) );
    $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD" );
    $str254$__Corpus___a__Source___a__Sentenc = makeString( "~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a" );
    $sym255$LEMUR_PASSAGE_GET_SOURCE_METHOD = makeSymbol( "LEMUR-PASSAGE-GET-SOURCE-METHOD" );
    $list256 = ConsesLow.list( makeString( "@return date-p; the publication date of this passage, or nil if it can't be determined" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow
        .list( makeSymbol( "LENGTH" ), makeSymbol( "DOC-ID" ) ), ELEVEN_INTEGER ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "YEAR" ), ConsesLow.list( makeSymbol(
            "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "DOC-ID" ), THREE_INTEGER, SEVEN_INTEGER ) ) ), ConsesLow.list( makeSymbol( "MONTH" ), ConsesLow.list( makeSymbol(
                "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "DOC-ID" ), SEVEN_INTEGER, NINE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "DAY" ), ConsesLow.list( makeSymbol(
                    "READ-FROM-STRING" ), ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "DOC-ID" ), NINE_INTEGER, ELEVEN_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                        "CONSTRUCT-REDUCED-CYCL-DATE" ), NIL, NIL, NIL, makeSymbol( "DAY" ), makeSymbol( "MONTH" ), makeSymbol( "YEAR" ) ) ) ) ) );
    $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD" );
    $sym258$LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol( "LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD" );
    $list259 = ConsesLow.list( makeString( "@return numberp; the score of this passage" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCORE" ) ) );
    $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD" );
    $sym261$LEMUR_PASSAGE_GET_SCORE_METHOD = makeSymbol( "LEMUR-PASSAGE-GET-SCORE-METHOD" );
    $sym262$QAGA_QUERY = makeSymbol( "QAGA-QUERY" );
    $list263 = ConsesLow.list( ConsesLow.list( makeSymbol( "AUGMENTATION-TERMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-AUGMENTATION-TERMS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym264$AUGMENTATION_TERMS = makeSymbol( "AUGMENTATION-TERMS" );
    $sym265$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS" );
    $sym266$SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE" );
    $list267 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PASSAGES" ), NIL ), ConsesLow.list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "ASK-QAGA" ),
        ConsesLow.list( makeSymbol( "SPLIT-STRING" ), makeSymbol( "QUERY" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol(
            "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "TEXT" ), makeSymbol( "DOCID" ), makeSymbol( "SCORE" ), makeSymbol( "AUGMENT" ), makeSymbol( "&ALLOW-OTHER-KEYS" ) ), makeSymbol(
                "ANSWER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "AUGMENTATION-TERMS" ), makeSymbol( "AUGMENT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LEMUR-PASSAGE" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CORPUS" ) ) ), makeSymbol( "DOCID" ), makeSymbol( "SCORE" ), makeSymbol( "TEXT" ) ),
                    makeSymbol( "PASSAGES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), ConsesLow.list( makeSymbol( "REMOVE-DUPLICATES" ), makeSymbol( "PASSAGES" ), ConsesLow
                        .list( makeSymbol( "FUNCTION" ), makeSymbol( "PASSAGE-EQUAL" ) ) ) ) ) ) );
    $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QAGA-QUERY-METHOD" );
    $kw269$DOCID = makeKeyword( "DOCID" );
    $kw270$SCORE = makeKeyword( "SCORE" );
    $kw271$AUGMENT = makeKeyword( "AUGMENT" );
    $sym272$QAGA_QUERY_GET_METHOD = makeSymbol( "QAGA-QUERY-GET-METHOD" );
    $sym273$GET_AUGMENTATION_TERMS = makeSymbol( "GET-AUGMENTATION-TERMS" );
    $list274 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "AUGMENTATION-TERMS" ) ) );
    $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QAGA-QUERY-METHOD" );
    $sym276$QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD = makeSymbol( "QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD" );
    $str277$WWW = makeString( "WWW" );
    $sym278$GOOGLE_QUERY = makeSymbol( "GOOGLE-QUERY" );
    $list279 = ConsesLow.list( ConsesLow.list( makeSymbol( "DOCNO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "START" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "GOOGLE-KEY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SPELLING" ), NIL,
            makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym280$GOOGLE_KEY = makeSymbol( "GOOGLE-KEY" );
    $sym281$START = makeSymbol( "START" );
    $sym282$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS" );
    $sym283$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE" );
    $list284 = ConsesLow.list( makeString( "@return listp; a ranked list @xref google-passages matching QUERY" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
        "GET-GOOGLE-CLIENT" ), makeSymbol( "GOOGLE-KEY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SEARCH" ) ), makeSymbol( "QUERY" ), makeSymbol( "START" ), makeSymbol( "DOCNO" ) ) ) );
    $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD" );
    $sym286$SEARCH = makeSymbol( "SEARCH" );
    $sym287$GOOGLE_QUERY_GET_METHOD = makeSymbol( "GOOGLE-QUERY-GET-METHOD" );
    $sym288$COUNT = makeSymbol( "COUNT" );
    $list289 = ConsesLow.list( makeString( "@return integerp; the number of hits for QUERY" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-GOOGLE-CLIENT" ),
        makeSymbol( "GOOGLE-KEY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COUNT" ) ), makeSymbol( "QUERY" ) ) ) );
    $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD" );
    $sym291$GOOGLE_QUERY_COUNT_METHOD = makeSymbol( "GOOGLE-QUERY-COUNT-METHOD" );
    $sym292$QUIT = makeSymbol( "QUIT" );
    $list293 = ConsesLow.list( makeString( "@return boolean; the server is assumed to be shut down" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-GOOGLE-CLIENT" ), makeSymbol( "GOOGLE-KEY" ) ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUIT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD" );
    $sym295$GOOGLE_QUERY_QUIT_METHOD = makeSymbol( "GOOGLE-QUERY-QUIT-METHOD" );
    $sym296$SPELLING = makeSymbol( "SPELLING" );
    $list297 = ConsesLow.list( makeString( "@return boolean; the server is assumed to be shut down" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
        "GET-GOOGLE-CLIENT" ), makeSymbol( "GOOGLE-KEY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SPELLING" ) ), makeSymbol( "QUERY" ) ) ) );
    $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD" );
    $sym299$GOOGLE_QUERY_SPELLING_METHOD = makeSymbol( "GOOGLE-QUERY-SPELLING-METHOD" );
    $sym300$VERSION = makeSymbol( "VERSION" );
    $list301 = ConsesLow.list( makeString( "@return stringp; the server sends back various information" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
        "GET-GOOGLE-CLIENT" ), makeSymbol( "GOOGLE-KEY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERSION" ) ) ) ) );
    $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD" );
    $sym303$GOOGLE_QUERY_VERSION_METHOD = makeSymbol( "GOOGLE-QUERY-VERSION-METHOD" );
    $list304 = ConsesLow.list( makeString( "application.cyc-ir.google.client-key-file" ) );
    $sym305$_GOOGLE_CLIENT_KEY_FILE_ = makeSymbol( "*GOOGLE-CLIENT-KEY-FILE*" );
    $str306$data_googlekey_txt = makeString( "data/googlekey.txt" );
    $kw307$PARAMETER = makeKeyword( "PARAMETER" );
    $list308 = ConsesLow.list( makeString( "application.cyc-ir.google.client-host" ) );
    $sym309$_GOOGLE_CLIENT_HOST_ = makeSymbol( "*GOOGLE-CLIENT-HOST*" );
    $str310$googleserver_cyc_com = makeString( "googleserver.cyc.com" );
    $list311 = ConsesLow.list( makeString( "application.cyc-ir.google.client-port" ) );
    $sym312$_GOOGLE_CLIENT_PORT_ = makeSymbol( "*GOOGLE-CLIENT-PORT*" );
    $int313$6667 = makeInteger( 6667 );
    $kw314$DIRECTION = makeKeyword( "DIRECTION" );
    $kw315$INPUT = makeKeyword( "INPUT" );
    $kw316$IF_DOES_NOT_EXIST = makeKeyword( "IF-DOES-NOT-EXIST" );
    $kw317$ERROR = makeKeyword( "ERROR" );
    $sym318$GOOGLE_CLIENT = makeSymbol( "GOOGLE-CLIENT" );
    $sym319$SET_HOST = makeSymbol( "SET-HOST" );
    $sym320$SET_PORT = makeSymbol( "SET-PORT" );
    $sym321$SET_CLIENT_KEY = makeSymbol( "SET-CLIENT-KEY" );
    $sym322$TCP_CLIENT = makeSymbol( "TCP-CLIENT" );
    $list323 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CLIENT-KEY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "CLIENT-INTERACTION" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CLIENT-KEY" ), ConsesLow.list( makeSymbol( "CLIENT-KEY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DOCNO" ), ConsesLow.list( makeSymbol( "DOC-NUMBER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SEARCH" ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "HITS" ), TEN_INTEGER ) ),
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COUNT" ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SPELLING" ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "QUIT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "VERSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GOOGLE-REQUEST" ), ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PRIVATE" ) )
    } );
    $sym324$CLIENT_INTERACTION = makeSymbol( "CLIENT-INTERACTION" );
    $sym325$CLIENT_KEY = makeSymbol( "CLIENT-KEY" );
    $sym326$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS" );
    $sym327$HOST = makeSymbol( "HOST" );
    $sym328$PORT = makeSymbol( "PORT" );
    $sym329$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE" );
    $list330 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym331$GOOGLE_CLIENT_INITIALIZE_METHOD = makeSymbol( "GOOGLE-CLIENT-INITIALIZE-METHOD" );
    $list332 = ConsesLow.list( makeSymbol( "KEY" ) );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEY" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-KEY" ), makeSymbol( "KEY" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "KEY" ) ) );
    $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-METHOD" );
    $sym335$GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD = makeSymbol( "GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD" );
    $list336 = ConsesLow.list( makeKeyword( "PUBLIC" ), makeKeyword( "AUTO-UPDATE" ) );
    $list337 = ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "HITS" ), TEN_INTEGER ) );
    $list338 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "START" ), makeSymbol(
        "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "HITS" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-INTERACTION" ),
            ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BUILD-BASIC-GOOGLE-REQUEST" ) ), makeString( "search" ), makeSymbol(
                "DIRECTIVE-ARG" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DOCNO" ) ), makeSymbol(
                    "HITS" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-START" ) ), makeSymbol( "START" ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANSWER-FROM-REQUEST" ) ) ) ) );
    $sym339$BUILD_BASIC_GOOGLE_REQUEST = makeSymbol( "BUILD-BASIC-GOOGLE-REQUEST" );
    $str340$search = makeString( "search" );
    $sym341$SET_DOCNO = makeSymbol( "SET-DOCNO" );
    $sym342$SET_START = makeSymbol( "SET-START" );
    $sym343$GET_ANSWER_FROM_REQUEST = makeSymbol( "GET-ANSWER-FROM-REQUEST" );
    $sym344$GOOGLE_CLIENT_SEARCH_METHOD = makeSymbol( "GOOGLE-CLIENT-SEARCH-METHOD" );
    $list345 = ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ) );
    $list346 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GOOGLE-REQUEST" ) ), makeString( "count" ), makeSymbol( "DIRECTIVE-ARG" ) ) ) );
    $sym347$GOOGLE_REQUEST = makeSymbol( "GOOGLE-REQUEST" );
    $str348$count = makeString( "count" );
    $sym349$GOOGLE_CLIENT_COUNT_METHOD = makeSymbol( "GOOGLE-CLIENT-COUNT-METHOD" );
    $list350 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GOOGLE-REQUEST" ) ), makeString( "spell" ), makeSymbol( "DIRECTIVE-ARG" ) ) ) );
    $str351$spell = makeString( "spell" );
    $sym352$GOOGLE_CLIENT_SPELLING_METHOD = makeSymbol( "GOOGLE-CLIENT-SPELLING-METHOD" );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GOOGLE-REQUEST" ) ),
        makeString( "$quit$" ), makeString( "" ) ) ) );
    $str354$_quit_ = makeString( "$quit$" );
    $str355$ = makeString( "" );
    $sym356$GOOGLE_CLIENT_QUIT_METHOD = makeSymbol( "GOOGLE-CLIENT-QUIT-METHOD" );
    $list357 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GOOGLE-REQUEST" ) ),
        makeString( "version" ), makeString( "" ) ) ) );
    $str358$version = makeString( "version" );
    $sym359$GOOGLE_CLIENT_VERSION_METHOD = makeSymbol( "GOOGLE-CLIENT-VERSION-METHOD" );
    $list360 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PRIVATE" ) );
    $list361 = ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) );
    $list362 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GOOGLE-CLIENT-INTERACTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-KEY" ) ), makeSymbol(
            "CLIENT-KEY" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DIRECTIVE" ) ), makeSymbol( "DIRECTIVE" ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DIRECTIVE-ARG" ) ), makeSymbol( "DIRECTIVE-ARG" ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "REQUEST" ) ) ) );
    $sym363$GOOGLE_CLIENT_INTERACTION = makeSymbol( "GOOGLE-CLIENT-INTERACTION" );
    $sym364$SET_KEY = makeSymbol( "SET-KEY" );
    $sym365$SET_DIRECTIVE = makeSymbol( "SET-DIRECTIVE" );
    $sym366$SET_DIRECTIVE_ARG = makeSymbol( "SET-DIRECTIVE-ARG" );
    $sym367$GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD = makeSymbol( "GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD" );
    $list368 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESPONSE" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol(
        "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "PERFORM-REQUEST" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REQUEST-STRING" ) ) ) ) ) ), ConsesLow
                .list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ERROR" ) ) ), ConsesLow.list( makeSymbol(
                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BUILD-ANSWER" ) ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "RET" ),
                        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANSWER" ) ) ) ) ), ConsesLow.list( T, ConsesLow
                            .list( makeSymbol( "WARN" ), makeString( "Error when contacting Google server: ~A" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeKeyword( "ERROR" ) ) ) ) ) );
    $sym369$PERFORM_REQUEST = makeSymbol( "PERFORM-REQUEST" );
    $sym370$REQUEST_STRING = makeSymbol( "REQUEST-STRING" );
    $sym371$BUILD_ANSWER = makeSymbol( "BUILD-ANSWER" );
    $sym372$GET_ANSWER = makeSymbol( "GET-ANSWER" );
    $str373$Error_when_contacting_Google_serv = makeString( "Error when contacting Google server: ~A" );
    $sym374$GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD = makeSymbol( "GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD" );
    $list375 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "BUILD-BASIC-GOOGLE-REQUEST" ) ), makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANSWER-FROM-REQUEST" ) ) ) ) );
    $sym376$GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD = makeSymbol( "GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD" );
    $list377 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SEARCH-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "search" ) ), ConsesLow.list(
        makeSymbol( "COUNT-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "count" ) ), ConsesLow.list( makeSymbol( "SPELL-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ),
            makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "spell" ) ), ConsesLow.list( makeSymbol( "QUIT-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ),
                makeString( "$quit$" ) ), ConsesLow.list( makeSymbol( "VERSION-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "version" ) ), ConsesLow.list(
                    makeSymbol( "SUBL-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "SubL" ) ), ConsesLow.list( makeSymbol( "QUERY-TAG" ), makeKeyword( "CLASS" ),
                        makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "query" ) ), ConsesLow.list( makeSymbol( "QUERY-TYPE-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ),
                            makeString( "type" ) ), ConsesLow.list( makeSymbol( "QUERY-COUNT-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "hitnum" ) ), ConsesLow.list(
                                makeSymbol( "QUERY-START-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "startnum" ) ), ConsesLow.list( makeSymbol( "QUERY-KEY-ATTR" ),
                                    makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "key" ) ), ConsesLow.list( makeSymbol( "QUERY-LANGUAGE-ATTR" ), makeKeyword( "CLASS" ),
                                        makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "language" ) ), ConsesLow.list( makeSymbol( "CONTENT-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ),
                                            makeKeyword( "VALUE" ), makeKeyword( "CONTENT" ) ), ConsesLow.list( makeSymbol( "URL-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ),
                                                makeKeyword( "URL" ) ), ConsesLow.list( makeSymbol( "TITLE-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "TITLE" ) ),
      ConsesLow.list( makeSymbol( "FULL-TEXT-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "FULL-TEXT" ) ), ConsesLow.list( makeSymbol( "SNIPPET-KEYWORD" ),
          makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "SNIPPET" ) ), ConsesLow.list( makeSymbol( "OFFSET-IN-FULL-TEXT-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ),
              makeKeyword( "VALUE" ), makeKeyword( "OFFSET-IN-FULL-TEXT" ) ), ConsesLow.list( makeSymbol( "OFFSET-IN-SNIPPET-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ),
                  makeKeyword( "OFFSET-IN-SNIPPET" ) ), ConsesLow.list( makeSymbol( "RANK-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "RANK" ) ), ConsesLow.list(
                      makeSymbol( "TOTAL-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "TOTAL" ) ), ConsesLow.list( makeSymbol( "CLIENT-KEY" ), makeKeyword(
                          "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ),
                              makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DOCNO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "START" ),
                                  makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GOOGLE-PASSAGES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                      "GOOGLE-COUNT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GOOGLE-SPELLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "GOOGLE-VERSION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GOOGLE-IO-ERROR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "EXTRACT-URL-FROM-START-TAG" ), ConsesLow.list( makeSymbol( "XML-TAG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-KEY" ), ConsesLow.list( makeSymbol( "OBJECT" ) ),
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DIRECTIVE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                  makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTIVE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "SET-DIRECTIVE-ARG" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-RAW-ANSWER" ), ConsesLow.list(
                          makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANSWER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-IO-ERROR-FLAG" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REQUEST-STRING" ), NIL,
                                  makeKeyword( "PUBLIC" ) )
    } );
    $sym378$GOOGLE_IO_ERROR = makeSymbol( "GOOGLE-IO-ERROR" );
    $sym379$GOOGLE_VERSION = makeSymbol( "GOOGLE-VERSION" );
    $sym380$GOOGLE_SPELLING = makeSymbol( "GOOGLE-SPELLING" );
    $sym381$GOOGLE_COUNT = makeSymbol( "GOOGLE-COUNT" );
    $sym382$GOOGLE_PASSAGES = makeSymbol( "GOOGLE-PASSAGES" );
    $sym383$DIRECTIVE_ARG = makeSymbol( "DIRECTIVE-ARG" );
    $sym384$DIRECTIVE = makeSymbol( "DIRECTIVE" );
    $int385$21 = makeInteger( 21 );
    $sym386$SEARCH_DIRECTIVE_TAG = makeSymbol( "SEARCH-DIRECTIVE-TAG" );
    $sym387$COUNT_DIRECTIVE_TAG = makeSymbol( "COUNT-DIRECTIVE-TAG" );
    $sym388$SPELL_DIRECTIVE_TAG = makeSymbol( "SPELL-DIRECTIVE-TAG" );
    $sym389$QUIT_DIRECTIVE_TAG = makeSymbol( "QUIT-DIRECTIVE-TAG" );
    $sym390$VERSION_DIRECTIVE_TAG = makeSymbol( "VERSION-DIRECTIVE-TAG" );
    $sym391$SUBL_DIRECTIVE_TAG = makeSymbol( "SUBL-DIRECTIVE-TAG" );
    $str392$SubL = makeString( "SubL" );
    $sym393$QUERY_TAG = makeSymbol( "QUERY-TAG" );
    $sym394$QUERY_TYPE_ATTR = makeSymbol( "QUERY-TYPE-ATTR" );
    $str395$type = makeString( "type" );
    $sym396$QUERY_COUNT_ATTR = makeSymbol( "QUERY-COUNT-ATTR" );
    $str397$hitnum = makeString( "hitnum" );
    $sym398$QUERY_START_ATTR = makeSymbol( "QUERY-START-ATTR" );
    $str399$startnum = makeString( "startnum" );
    $sym400$QUERY_KEY_ATTR = makeSymbol( "QUERY-KEY-ATTR" );
    $str401$key = makeString( "key" );
    $sym402$QUERY_LANGUAGE_ATTR = makeSymbol( "QUERY-LANGUAGE-ATTR" );
    $str403$language = makeString( "language" );
    $sym404$CONTENT_KEYWORD = makeSymbol( "CONTENT-KEYWORD" );
    $kw405$CONTENT = makeKeyword( "CONTENT" );
    $sym406$URL_KEYWORD = makeSymbol( "URL-KEYWORD" );
    $kw407$URL = makeKeyword( "URL" );
    $sym408$TITLE_KEYWORD = makeSymbol( "TITLE-KEYWORD" );
    $kw409$TITLE = makeKeyword( "TITLE" );
    $sym410$FULL_TEXT_KEYWORD = makeSymbol( "FULL-TEXT-KEYWORD" );
    $kw411$FULL_TEXT = makeKeyword( "FULL-TEXT" );
    $sym412$SNIPPET_KEYWORD = makeSymbol( "SNIPPET-KEYWORD" );
    $kw413$SNIPPET = makeKeyword( "SNIPPET" );
    $sym414$OFFSET_IN_FULL_TEXT_KEYWORD = makeSymbol( "OFFSET-IN-FULL-TEXT-KEYWORD" );
    $kw415$OFFSET_IN_FULL_TEXT = makeKeyword( "OFFSET-IN-FULL-TEXT" );
    $sym416$OFFSET_IN_SNIPPET_KEYWORD = makeSymbol( "OFFSET-IN-SNIPPET-KEYWORD" );
    $kw417$OFFSET_IN_SNIPPET = makeKeyword( "OFFSET-IN-SNIPPET" );
    $sym418$RANK_KEYWORD = makeSymbol( "RANK-KEYWORD" );
    $kw419$RANK = makeKeyword( "RANK" );
    $sym420$TOTAL_KEYWORD = makeSymbol( "TOTAL-KEYWORD" );
    $kw421$TOTAL = makeKeyword( "TOTAL" );
    $sym422$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS" );
    $sym423$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE" );
    $list424 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-PASSAGES" ), ConsesLow.list( makeSymbol(
        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GOOGLE-PASSAGE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOCNO" ), TEN_INTEGER ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "START" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-IO-ERROR" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym426$GOOGLE_PASSAGE_LIST = makeSymbol( "GOOGLE-PASSAGE-LIST" );
    $sym427$GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD" );
    $list428 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-KEY" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym430$GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD" );
    $list431 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTIVE" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym433$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD" );
    $list434 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOCNO" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym436$GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD" );
    $list437 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START" ), makeSymbol( "OBJECT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym439$GOOGLE_CLIENT_INTERACTION_SET_START_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-SET-START-METHOD" );
    $sym440$GET_IO_ERROR_FLAG = makeSymbol( "GET-IO-ERROR-FLAG" );
    $list441 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GOOGLE-IO-ERROR" ) ) );
    $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym443$GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD" );
    $list444 = ConsesLow.list( makeSymbol( "RESPONSE-STRING" ) );
    $list445 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESPONSE" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol(
        "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "READ-FROM-STRING" ), makeSymbol( "RESPONSE-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
            makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "Could not build answer; the response string ~A created an error: ~A" ), makeSymbol( "RESPONSE-STRING" ), makeSymbol( "ERROR" ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( EQ, makeSymbol( "RESPONSE" ), makeKeyword( "IO-ERROR" ) ), ConsesLow.list(
                makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-IO-ERROR" ), T ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "COUNT-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol(
                    "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-COUNT" ), makeSymbol( "RESPONSE" ) ) ),
                    ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ), makeString( "Google count is not a digit-string. Setting it to 0." ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-COUNT" ),
                        ZERO_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "SEARCH-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow
                            .list( makeSymbol( "LISTP" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list(
                                makeSymbol( "CLET" ), ConsesLow.list( new SubLObject[]
                                { ConsesLow.list( makeSymbol( "URL" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "URL-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow
                                    .list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "TITLE-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "CONTENT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol(
                                        "PASSAGE" ), makeSymbol( "CONTENT-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "FULL-TEXT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol(
                                            "FULL-TEXT-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "SNIPPET" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "SNIPPET-KEYWORD" ) ) ),
                                  ConsesLow.list( makeSymbol( "OFFSET-IN-SNIPPET" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "OFFSET-IN-SNIPPET-KEYWORD" ) ) ), ConsesLow.list(
                                      makeSymbol( "TEXT" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "FULL-TEXT" ) ), makeSymbol( "FULL-TEXT" ), makeSymbol(
                                          "CONTENT" ) ) ), ConsesLow.list( makeSymbol( "OFFSET-IN-FULL-TEXT" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "FULL-TEXT" ) ),
                                              ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "OFFSET-IN-FULL-TEXT-KEYWORD" ) ), makeSymbol( "OFFSET-IN-SNIPPET" ) ) ), ConsesLow.list(
                                                  makeSymbol( "RANK" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "RANK-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "TOTAL" ), ConsesLow
                                                      .list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol( "TOTAL-KEYWORD" ) ) )
                                } ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GOOGLE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), ConsesLow.list( new SubLObject[] { makeSymbol(
                                    "NEW-GOOGLE-PASSAGE" ), makeSymbol( "URL" ), makeSymbol( "RANK" ), makeSymbol( "TITLE" ), makeSymbol( "TEXT" ), makeSymbol( "SNIPPET" ), makeSymbol( "OFFSET-IN-FULL-TEXT" ),
                                  makeSymbol( "OFFSET-IN-SNIPPET" ), makeSymbol( "TOTAL" )
                                } ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ), makeString( "Response ~A is of unwanted type ~S." ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol(
                                    "TYPE-OF" ), makeSymbol( "RESPONSE" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "VERSION-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol(
                                        "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY-LIST-P" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GOOGLE-VERSION" ),
                                            makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ), makeString( "Response ~A is of unwanted type ~S." ), makeSymbol( "RESPONSE" ), ConsesLow
                                                .list( makeSymbol( "TYPE-OF" ), makeSymbol( "RESPONSE" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol(
                                                    "QUIT-DIRECTIVE-TAG" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "SPELL-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol(
                                                        "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY-LIST-P" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                            "GOOGLE-SPELLING" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "RESPONSE" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ),
                                                                makeString( "Response ~A is of unwanted type ~S." ), ConsesLow.list( makeSymbol( "TYPE-OF" ), makeSymbol( "RESPONSE" ) ) ) ) ) ), ConsesLow.list( T,
                                                                    ConsesLow.list( makeSymbol( "WARN" ), makeString( "Query directive ~S is not supported." ), makeSymbol( "DIRECTIVE" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                        "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $str447$Could_not_build_answer__the_respo = makeString( "Could not build answer; the response string ~A created an error: ~A" );
    $kw448$IO_ERROR = makeKeyword( "IO-ERROR" );
    $str449$Google_count_is_not_a_digit_strin = makeString( "Google count is not a digit-string. Setting it to 0." );
    $sym450$ADD = makeSymbol( "ADD" );
    $str451$Response__A_is_of_unwanted_type__ = makeString( "Response ~A is of unwanted type ~S." );
    $str452$Query_directive__S_is_not_support = makeString( "Query directive ~S is not supported." );
    $sym453$GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD" );
    $sym454$GET_DIRECTIVE = makeSymbol( "GET-DIRECTIVE" );
    $list455 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DIRECTIVE" ) ) );
    $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym457$GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD" );
    $list458 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "OBJECT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol(
        "OBJECT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym460$GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD" );
    $list461 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), makeString( "" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
        "CAND" ), makeSymbol( "CLIENT-KEY" ), makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OUTSTREAM" ), ConsesLow.list(
            makeSymbol( "MAKE-STRING-OUTPUT-STREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "XML-WRITER" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STREAM" ) ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "START-TAG" ) ), makeSymbol( "QUERY-TAG" ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "BQ-LIST" ), makeSymbol( "QUERY-KEY-ATTR" ), makeSymbol( "CLIENT-KEY" ), makeSymbol( "QUERY-TYPE-ATTR" ), makeSymbol( "DIRECTIVE" ), makeSymbol( "QUERY-COUNT-ATTR" ), makeSymbol(
                        "DOCNO" ), makeSymbol( "QUERY-START-ATTR" ), makeSymbol( "START" ), makeSymbol( "QUERY-LANGUAGE-ATTR" ), makeSymbol( "SUBL-DIRECTIVE-TAG" )
                    } ), NIL, NIL ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-PRINT" ) ), makeSymbol( "DIRECTIVE-ARG" ), NIL ), ConsesLow
                        .list( makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-TAG" ) ), makeSymbol( "QUERY-TAG" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
                            makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "TRIM-WHITESPACE" ), ConsesLow.list( makeSymbol( "GET-OUTPUT-STREAM-STRING" ), makeSymbol( "OUTSTREAM" ) ) ) ) ) ), ConsesLow.list(
                                makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym463$XML_WRITER = makeSymbol( "XML-WRITER" );
    $sym464$SET_STREAM = makeSymbol( "SET-STREAM" );
    $sym465$START_TAG = makeSymbol( "START-TAG" );
    $sym466$XML_PRINT = makeSymbol( "XML-PRINT" );
    $sym467$END_TAG = makeSymbol( "END-TAG" );
    $sym468$GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD" );
    $list469 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-IO-ERROR-FLAG" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeKeyword( "SERVER-ERROR" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "COUNT-DIRECTIVE-TAG" ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GOOGLE-COUNT" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "SPELL-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol(
                "RET" ), makeSymbol( "GOOGLE-SPELLING" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "VERSION-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "GOOGLE-VERSION" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "SEARCH-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-GOOGLE-PASSAGES" ) ) ) ) ) ) );
    $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $kw471$SERVER_ERROR = makeKeyword( "SERVER-ERROR" );
    $sym472$GET_GOOGLE_PASSAGES = makeSymbol( "GET-GOOGLE-PASSAGES" );
    $sym473$GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD" );
    $list474 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SNIPPET-LIST" ), makeSymbol( "ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "GOOGLE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list(
            makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "GOOGLE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALLOCATE-ENUMERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ), makeSymbol( "SNIPPET-LIST" ) ), ConsesLow.list( makeSymbol(
                    "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "NEXT" ) ) ), makeSymbol( "SNIPPET-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "SNIPPET-LIST" ) ) ) ) );
    $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD" );
    $sym476$EMPTY_P = makeSymbol( "EMPTY-P" );
    $sym477$ALLOCATE_ENUMERATOR = makeSymbol( "ALLOCATE-ENUMERATOR" );
    $sym478$FIRST = makeSymbol( "FIRST" );
    $sym479$LAST_P = makeSymbol( "LAST-P" );
    $sym480$NEXT = makeSymbol( "NEXT" );
    $sym481$GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD = makeSymbol( "GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD" );
    $sym482$BASIC_LIST = makeSymbol( "BASIC-LIST" );
    $list483 = ConsesLow.list( makeSymbol( "PROTECTED-MEMBERSHIP-TEMPLATE" ) );
    $sym484$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS" );
    $sym485$BASIC_COLLECTION = makeSymbol( "BASIC-COLLECTION" );
    $sym486$CONTENTS = makeSymbol( "CONTENTS" );
    $sym487$ELEMENT_EQUALITY_PREDICATE = makeSymbol( "ELEMENT-EQUALITY-PREDICATE" );
    $sym488$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE" );
    $sym489$ACCEPTABLE_P = makeSymbol( "ACCEPTABLE-P" );
    $list490 = ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) );
    $list491 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INSTANCE-OF-P" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "GOOGLE-PASSAGE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "IS-COMPLETE" ) ) ) ) ) );
    $sym492$GOOGLE_PASSAGE = makeSymbol( "GOOGLE-PASSAGE" );
    $sym493$IS_COMPLETE = makeSymbol( "IS-COMPLETE" );
    $sym494$GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = makeSymbol( "GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD" );
    $list495 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ACCEPTABLE-P" ) ),
        makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "NEW-ELEMENT" ) ),
        ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%Cannot add ~S to a google-passage-list" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $str496$__Cannot_add__S_to_a_google_passa = makeString( "~%Cannot add ~S to a google-passage-list" );
    $sym497$GOOGLE_PASSAGE_LIST_ADD_METHOD = makeSymbol( "GOOGLE-PASSAGE-LIST-ADD-METHOD" );
    $list498 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "RANK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "URL" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "TITLE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SNIPPET" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "OFFSET-IN-SNIPPET" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "OFFSET-IN-TEXT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "TOTAL" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "PARSE-TREES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list(
          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SCORE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PARSE" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "IS-COMPLETE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-URL" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TITLE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SNIPPET" ),
              NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FULL-TEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                  makeSymbol( "GET-OFFSET-IN-SNIPPET" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OFFSET-IN-FULL-TEXT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TOTAL-FOR-RANK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RANK-AND-TOTAL" ), NIL,
          makeKeyword( "PUBLIC" ) )
    } );
    $sym499$PARSE_TREES = makeSymbol( "PARSE-TREES" );
    $sym500$TOTAL = makeSymbol( "TOTAL" );
    $sym501$OFFSET_IN_TEXT = makeSymbol( "OFFSET-IN-TEXT" );
    $sym502$OFFSET_IN_SNIPPET = makeSymbol( "OFFSET-IN-SNIPPET" );
    $sym503$SNIPPET = makeSymbol( "SNIPPET" );
    $sym504$TITLE = makeSymbol( "TITLE" );
    $sym505$URL = makeSymbol( "URL" );
    $sym506$RANK = makeSymbol( "RANK" );
    $sym507$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS" );
    $sym508$SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE" );
    $list509 = ConsesLow.list( makeString( "@return stringp; the URL of this passage" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "URL" ) ) );
    $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym511$GOOGLE_PASSAGE_GET_SOURCE_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-SOURCE-METHOD" );
    $list512 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "/" ), ONE_INTEGER, makeSymbol( "RANK" ) ) ) );
    $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym514$GOOGLE_PASSAGE_GET_SCORE_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-SCORE-METHOD" );
    $list515 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "URL" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
            "STRINGP" ), makeSymbol( "TEXT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym517$GOOGLE_PASSAGE_IS_COMPLETE_METHOD = makeSymbol( "GOOGLE-PASSAGE-IS-COMPLETE-METHOD" );
    $sym518$GET_OFFSET_IN_FULL_TEXT = makeSymbol( "GET-OFFSET-IN-FULL-TEXT" );
    $list519 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OFFSET-IN-TEXT" ) ) );
    $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym521$GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD" );
    $sym522$GET_OFFSET_IN_SNIPPET = makeSymbol( "GET-OFFSET-IN-SNIPPET" );
    $list523 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OFFSET-IN-SNIPPET" ) ) );
    $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym525$GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD" );
    $sym526$GET_URL = makeSymbol( "GET-URL" );
    $list527 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "URL" ) ) );
    $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym529$GOOGLE_PASSAGE_GET_URL_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-URL-METHOD" );
    $sym530$GET_TITLE = makeSymbol( "GET-TITLE" );
    $list531 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TITLE" ) ) );
    $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym533$GOOGLE_PASSAGE_GET_TITLE_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-TITLE-METHOD" );
    $sym534$GET_CACHED_FILE_ID = makeSymbol( "GET-CACHED-FILE-ID" );
    $list535 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-URL" ), makeSymbol( "SELF" ) ) ) );
    $sym536$GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD" );
    $sym537$GET_FULL_TEXT = makeSymbol( "GET-FULL-TEXT" );
    $list538 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-CORPUS-PASSAGE-TEXT" ), makeSymbol( "SELF" ) ) ) );
    $sym539$GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD" );
    $sym540$GET_SNIPPET = makeSymbol( "GET-SNIPPET" );
    $list541 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SNIPPET" ) ) );
    $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym543$GOOGLE_PASSAGE_GET_SNIPPET_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-SNIPPET-METHOD" );
    $sym544$GET_RANK = makeSymbol( "GET-RANK" );
    $list545 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RANK" ) ) );
    $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym547$GOOGLE_PASSAGE_GET_RANK_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-RANK-METHOD" );
    $sym548$GET_TOTAL_FOR_RANK = makeSymbol( "GET-TOTAL-FOR-RANK" );
    $list549 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TOTAL" ) ) );
    $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD" );
    $sym551$GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD" );
    $sym552$GET_RANK_AND_TOTAL = makeSymbol( "GET-RANK-AND-TOTAL" );
    $list553 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol( "GET-RANK" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
        "GET-TOTAL-FOR-RANK" ), makeSymbol( "SELF" ) ) ) ) );
    $sym554$GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD" );
    $list555 = ConsesLow.list( makeString( "Prints this google passage to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "GET-SOURCE" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym556$GOOGLE_PASSAGE_PRINT_METHOD = makeSymbol( "GOOGLE-PASSAGE-PRINT-METHOD" );
    $sym557$GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol( "GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD" );
    $str558$Wikipedia = makeString( "Wikipedia" );
    $sym559$LUCENE_QUERY = makeSymbol( "LUCENE-QUERY" );
    $list560 = ConsesLow.list( ConsesLow.list( makeSymbol( "DOCNO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SENTNO" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym561$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS" );
    $sym562$SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE" );
    $list563 = ConsesLow.list( makeString( "@param QUERY stringp\n   @return listp; a ranked list @xref lucene-passages matching QUERY" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
        ConsesLow.list( makeSymbol( "GET-LUCENE-CLIENT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SEARCH" ) ), makeSymbol( "QUERY" ), makeSymbol( "DOCNO" ) ) ) );
    $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-QUERY-METHOD" );
    $sym565$LUCENE_QUERY_GET_METHOD = makeSymbol( "LUCENE-QUERY-GET-METHOD" );
    $sym566$LUCENE_CLIENT = makeSymbol( "LUCENE-CLIENT" );
    $list567 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLIENT-INTERACTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-CLIENT-KEY" ), ConsesLow.list( makeSymbol( "CLIENT-KEY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SEARCH" ), ConsesLow.list( makeSymbol(
            "DIRECTIVE-ARG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COUNT" ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SPELLING" ), ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "LUCENE-REQUEST" ), ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym568$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS" );
    $sym569$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE" );
    $sym570$LUCENE_CLIENT_INITIALIZE_METHOD = makeSymbol( "LUCENE-CLIENT-INITIALIZE-METHOD" );
    $list571 = ConsesLow.list( makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DOCNO" ), makeInteger( 50 ) ) );
    $list572 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LUCENE-REQUEST" ) ), makeString( "search" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "DOCNO" ) ) ) );
    $sym573$LUCENE_REQUEST = makeSymbol( "LUCENE-REQUEST" );
    $sym574$LUCENE_CLIENT_SEARCH_METHOD = makeSymbol( "LUCENE-CLIENT-SEARCH-METHOD" );
    $list575 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LUCENE-REQUEST" ) ), makeString( "count" ), makeSymbol( "DIRECTIVE-ARG" ) ) ) );
    $sym576$LUCENE_CLIENT_COUNT_METHOD = makeSymbol( "LUCENE-CLIENT-COUNT-METHOD" );
    $list577 = ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DOCNO" ), TEN_INTEGER ) );
    $list578 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LUCENE-CLIENT-INTERACTION" ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DIRECTIVE" ) ),
            makeSymbol( "DIRECTIVE" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DIRECTIVE-ARG" ) ), makeSymbol(
                "DIRECTIVE-ARG" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-DOCNO" ) ), makeSymbol( "DOCNO" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLIENT-INTERACTION" ), makeSymbol( "REQUEST" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "BUILD-ANSWER" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PERFORM-REQUEST" ) ),
                ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REQUEST-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CLIENT-INTERACTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ANSWER" ) ) ) ) ) );
    $sym579$LUCENE_CLIENT_INTERACTION = makeSymbol( "LUCENE-CLIENT-INTERACTION" );
    $sym580$LUCENE_CLIENT_LUCENE_REQUEST_METHOD = makeSymbol( "LUCENE-CLIENT-LUCENE-REQUEST-METHOD" );
    $list581 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SEARCH-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "search" ) ), ConsesLow.list(
        makeSymbol( "COUNT-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "count" ) ), ConsesLow.list( makeSymbol( "SUBL-DIRECTIVE-TAG" ), makeKeyword( "CLASS" ),
            makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "SubL" ) ), ConsesLow.list( makeSymbol( "QUERY-TAG" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString(
                "query" ) ), ConsesLow.list( makeSymbol( "QUERY-TYPE-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "type" ) ), ConsesLow.list( makeSymbol(
                    "QUERY-COUNT-ATTR" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "hitnum" ) ), ConsesLow.list( makeSymbol( "QUERY-LANGUAGE-ATTR" ), makeKeyword( "CLASS" ),
                        makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeString( "language" ) ), ConsesLow.list( makeSymbol( "ID-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ),
                            makeKeyword( "ID" ) ), ConsesLow.list( makeSymbol( "CONTENT-KEYWORD" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ), makeKeyword( "VALUE" ), makeKeyword( "CONTENT" ) ), ConsesLow.list(
                                makeSymbol( "DOCNO" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DIRECTIVE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow
                                    .list( makeSymbol( "DIRECTIVE-ARG" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "LUCENE-PASSAGES" ), makeKeyword( "INSTANCE" ), makeKeyword(
                                        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "LUCENE-COUNT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DIRECTIVE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ),
                                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTIVE" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DIRECTIVE-ARG" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-RAW-ANSWER" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword(
                                                            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ANSWER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "REQUEST-STRING" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym582$LUCENE_COUNT = makeSymbol( "LUCENE-COUNT" );
    $sym583$LUCENE_PASSAGES = makeSymbol( "LUCENE-PASSAGES" );
    $sym584$ID_KEYWORD = makeSymbol( "ID-KEYWORD" );
    $kw585$ID = makeKeyword( "ID" );
    $sym586$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS" );
    $sym587$SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE" );
    $list588 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LUCENE-PASSAGES" ), ConsesLow.list( makeSymbol(
        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LUCENE-PASSAGE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym590$LUCENE_PASSAGE_LIST = makeSymbol( "LUCENE-PASSAGE-LIST" );
    $sym591$LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD" );
    $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym593$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD" );
    $list594 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "RESPONSE" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol(
        "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESPONSE" ), ConsesLow.list( makeSymbol( "READ-FROM-STRING" ), makeSymbol( "RESPONSE-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
            makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list(
                ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "COUNT-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol(
                    "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LUCENE-COUNT" ), makeSymbol( "RESPONSE" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ), makeString(
                        "Lucene count is not a digit-string. Setting it to 0." ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LUCENE-COUNT" ), ZERO_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list( EQUALP,
                            makeSymbol( "DIRECTIVE" ), makeSymbol( "SEARCH-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "RESPONSE" ) ),
                                ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RANK" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                    "PASSAGE" ), makeSymbol( "RESPONSE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ID" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol(
                                        "PASSAGE" ), makeSymbol( "ID-KEYWORD" ) ) ), ConsesLow.list( makeSymbol( "TEXT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "PASSAGE" ), makeSymbol(
                                            "CONTENT-KEYWORD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LUCENE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), ConsesLow.list(
                                                makeSymbol( "NEW-LUCENE-PASSAGE" ), makeSymbol( "ID" ), makeSymbol( "RANK" ), makeSymbol( "TEXT" ) ) ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "WARN" ),
                                                    makeString( "Response is of unwanted type ~S." ), ConsesLow.list( makeSymbol( "TYPE-OF" ), makeSymbol( "RESPONSE" ) ) ) ) ) ), ConsesLow.list( T, ConsesLow.list(
                                                        makeSymbol( "WARN" ), makeString( "Query directive ~S is not supported." ), makeSymbol( "DIRECTIVE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                            "SELF" ) ) ) );
    $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $str596$Lucene_count_is_not_a_digit_strin = makeString( "Lucene count is not a digit-string. Setting it to 0." );
    $str597$Response_is_of_unwanted_type__S_ = makeString( "Response is of unwanted type ~S." );
    $sym598$LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD" );
    $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym600$LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD" );
    $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym602$LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD" );
    $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym604$LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD" );
    $list605 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), makeString( "" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
        "CAND" ), makeSymbol( "DIRECTIVE" ), makeSymbol( "DIRECTIVE-ARG" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OUTSTREAM" ), ConsesLow.list( makeSymbol(
            "MAKE-STRING-OUTPUT-STREAM" ) ) ), ConsesLow.list( makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-WRITER" ) ) ) ) ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-STREAM" ) ), makeSymbol( "OUTSTREAM" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "START-TAG" ) ), makeSymbol( "QUERY-TAG" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "QUERY-TYPE-ATTR" ),
                    makeSymbol( "DIRECTIVE" ), makeSymbol( "QUERY-COUNT-ATTR" ), makeSymbol( "DOCNO" ), makeSymbol( "QUERY-LANGUAGE-ATTR" ), makeSymbol( "SUBL-DIRECTIVE-TAG" ) ), NIL, NIL ), ConsesLow.list( makeSymbol(
                        "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "XML-PRINT" ) ), makeSymbol( "DIRECTIVE-ARG" ), NIL ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                            "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-TAG" ) ), makeSymbol( "QUERY-TAG" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow
                                .list( makeSymbol( "TRIM-WHITESPACE" ), ConsesLow.list( makeSymbol( "GET-OUTPUT-STREAM-STRING" ), makeSymbol( "OUTSTREAM" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "RESULT" ) ) ) );
    $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym607$LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD" );
    $list608 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "COUNT-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "LUCENE-COUNT" ) ) ), ConsesLow.list( ConsesLow.list( EQUALP, makeSymbol( "DIRECTIVE" ), makeSymbol( "SEARCH-DIRECTIVE-TAG" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LUCENE-PASSAGES" ) ) ) ) ) ) );
    $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym610$GET_LUCENE_PASSAGES = makeSymbol( "GET-LUCENE-PASSAGES" );
    $sym611$LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD" );
    $list612 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "PASSAGE-LIST" ), makeSymbol( "ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LUCENE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list(
            makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LUCENE-PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALLOCATE-ENUMERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ), makeSymbol( "PASSAGE-LIST" ) ), ConsesLow.list( makeSymbol(
                    "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "NEXT" ) ) ), makeSymbol( "PASSAGE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "PASSAGE-LIST" ) ) ) ) );
    $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD" );
    $sym614$LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD = makeSymbol( "LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD" );
    $sym615$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS" );
    $sym616$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE" );
    $list617 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INSTANCE-OF-P" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LUCENE-PASSAGE" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "IS-COMPLETE" ) ) ) ) ) );
    $sym618$LUCENE_PASSAGE = makeSymbol( "LUCENE-PASSAGE" );
    $sym619$LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = makeSymbol( "LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD" );
    $list620 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ACCEPTABLE-P" ) ),
        makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "NEW-ELEMENT" ) ),
        ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%Cannot add ~S to a lucene-passage-list" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $str621$__Cannot_add__S_to_a_lucene_passa = makeString( "~%Cannot add ~S to a lucene-passage-list" );
    $sym622$LUCENE_PASSAGE_LIST_ADD_METHOD = makeSymbol( "LUCENE-PASSAGE-LIST-ADD-METHOD" );
    $list623 = ConsesLow.list( ConsesLow.list( makeSymbol( "RANK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "ID" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "PARSE-TREES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SCORE" ), NIL, makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "IS-COMPLETE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym624$ID = makeSymbol( "ID" );
    $sym625$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS" );
    $sym626$SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE" );
    $list627 = ConsesLow.list( makeString( "@return stringp; the URL of this passage" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ID" ) ) );
    $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD" );
    $sym629$LUCENE_PASSAGE_GET_SOURCE_METHOD = makeSymbol( "LUCENE-PASSAGE-GET-SOURCE-METHOD" );
    $list630 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "RANK" ), ConsesLow.list( makeSymbol( "RET" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "/" ),
        ONE_INTEGER, makeSymbol( "RANK" ) ) ) );
    $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD" );
    $sym632$LUCENE_PASSAGE_GET_SCORE_METHOD = makeSymbol( "LUCENE-PASSAGE-GET-SCORE-METHOD" );
    $list633 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "ID" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
            "STRINGP" ), makeSymbol( "TEXT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD" );
    $sym635$LUCENE_PASSAGE_IS_COMPLETE_METHOD = makeSymbol( "LUCENE-PASSAGE-IS-COMPLETE-METHOD" );
    $list636 = ConsesLow.list( makeString( "Prints this lucene passage to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list(
        makeSymbol( "GET-SOURCE" ), makeSymbol( "SELF" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "TEXT" ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD" );
    $sym638$LUCENE_PASSAGE_PRINT_METHOD = makeSymbol( "LUCENE-PASSAGE-PRINT-METHOD" );
    $sym639$LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol( "LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD" );
    $sym640$CYCL_QUERY = makeSymbol( "CYCL-QUERY" );
    $list641 = ConsesLow.list( ConsesLow.list( makeSymbol( "KNOWLEDGE-SOURCES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "PROPERTIES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FROM-KB" ),
            ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FROM-CORPUS" ), ConsesLow.list( makeSymbol( "CORPUS" ) ), makeKeyword(
                "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GENERATE-ASSIGNMENTS" ), ConsesLow.list( makeSymbol( "PASSAGE" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym642$PROPERTIES = makeSymbol( "PROPERTIES" );
    $sym643$KNOWLEDGE_SOURCES = makeSymbol( "KNOWLEDGE-SOURCES" );
    $sym644$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS" );
    $sym645$SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE" );
    $list646 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ) );
    $list647 = ConsesLow.list( makeKeyword( "RETURN" ), makeKeyword( "BINDINGS-AND-SUPPORTS" ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym648$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym649$CYCL_QUERY_P = makeSymbol( "CYCL-QUERY-P" );
    $list650 = ConsesLow.list( makeString( "@param QUERY stringp\n   @return listp; a list of variable assignments" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASSIGNMENTS" ),
        NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KS" ), makeSymbol( "KNOWLEDGE-SOURCES" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "MT?" ), makeSymbol( "KS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSIGNMENTS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "ASSIGNMENTS" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FROM-KB" ) ), makeSymbol( "KS" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CORPUS-P" ), makeSymbol( "KS" ) ),
                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSIGNMENTS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "ASSIGNMENTS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FROM-CORPUS" ) ), makeSymbol( "KS" ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "ERROR" ), makeString(
                            "Unknown knowledge source ~a" ), makeSymbol( "KS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASSIGNMENTS" ) ) ) );
    $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-QUERY-METHOD" );
    $sym652$GET_FROM_KB = makeSymbol( "GET-FROM-KB" );
    $sym653$GET_FROM_CORPUS = makeSymbol( "GET-FROM-CORPUS" );
    $str654$Unknown_knowledge_source__a = makeString( "Unknown knowledge source ~a" );
    $sym655$CYCL_QUERY_GET_METHOD = makeSymbol( "CYCL-QUERY-GET-METHOD" );
    $list656 = ConsesLow.list( makeSymbol( "MT" ) );
    $list657 = ConsesLow.list( makeString( "@param MT mt?; the microtheory from which to get an assignment for this query\n   @return listp; a list of variable assignments" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "QUERY" ), makeSymbol( "MT" ), makeSymbol( "PROPERTIES" ) ) ), ConsesLow.list( makeSymbol(
            "ASSIGNMENTS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                "NEW-VAR-ASSIGNMENT" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "ANSWER" ) ) ), makeSymbol( "ASSIGNMENTS" ) ) ), ConsesLow
                    .list( makeSymbol( "RET" ), makeSymbol( "ASSIGNMENTS" ) ) ) );
    $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-QUERY-METHOD" );
    $sym659$CYCL_QUERY_GET_FROM_KB_METHOD = makeSymbol( "CYCL-QUERY-GET-FROM-KB-METHOD" );
    $list660 = ConsesLow.list( makeSymbol( "CORPUS" ) );
    $list661 = ConsesLow.list( makeString( "@param CORPUS corpus-p; the corpus from which to get an assignment for this query\n   @return listp; a list of variable assignments" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "PARAPHRASE" ), ConsesLow.list( makeSymbol( "GENERATE-QUESTION" ), makeSymbol( "QUERY" ) ) ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol(
            "FWHEN" ), makeSymbol( "PARAPHRASE" ), ConsesLow.list( makeSymbol( "NEW-QUESTION" ), makeSymbol( "PARAPHRASE" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CORPUS" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "TMP-MT" ), ConsesLow.list( makeSymbol( "NEW-TMP-MT" ) ) ), ConsesLow.list( makeSymbol( "ASSIGNMENTS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "QUESTION" ), ConsesLow
                    .list( makeSymbol( "PRINC" ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "TERPRI" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), ConsesLow.list(
                        makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ) ) ),
                        ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "ANSWER" ) ), ConsesLow.list( makeSymbol( "TERPRI" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSIGNMENTS" ), ConsesLow.list(
                            makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GENERATE-ASSIGNMENTS" ) ), makeSymbol( "ANSWER" ),
                                makeSymbol( "TMP-MT" ) ), makeSymbol( "ASSIGNMENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASSIGNMENTS" ) ) ) );
    $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-QUERY-METHOD" );
    $sym663$GENERATE_ASSIGNMENTS = makeSymbol( "GENERATE-ASSIGNMENTS" );
    $sym664$CYCL_QUERY_GET_FROM_CORPUS_METHOD = makeSymbol( "CYCL-QUERY-GET-FROM-CORPUS-METHOD" );
    $list665 = ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "TMP-MT" ) );
    $list666 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANSWER" ), makeSymbol( "ANSWER-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "ASSIGNMENTS" ), NIL ), ConsesLow.list( makeSymbol( "HYP-BINDINGS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "CYCLIFY" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                "FI-HYPOTHESIZE-INT" ), makeSymbol( "CYCL" ), makeSymbol( "TMP-MT" ) ), makeSymbol( "HYP-BINDINGS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "BINDING" ), ConsesLow.list(
                    makeSymbol( "NEW-CYC-QUERY" ), makeSymbol( "QUERY" ), makeSymbol( "TMP-MT" ), makeSymbol( "PROPERTIES" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-VAR-ASSIGNMENT" ),
                        ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "BINDING" ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "BINDING" ) ), makeSymbol(
                            "ANSWER" ) ) ), makeSymbol( "ASSIGNMENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASSIGNMENTS" ) ) ) );
    $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-QUERY-METHOD" );
    $sym668$ANSWER_P = makeSymbol( "ANSWER-P" );
    $sym669$CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD = makeSymbol( "CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD" );
    $sym670$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $str671$TEMP_MT_ = makeString( "TEMP-MT-" );
    $const672$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list673 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $const674$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const675$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $sym676$VAR_ASSIGNMENT = makeSymbol( "VAR-ASSIGNMENT" );
    $list677 = ConsesLow.list( ConsesLow.list( makeSymbol( "BINDINGS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "JUSTIFICATION" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SOURCE" ),
            NIL, makeKeyword( "PUBLIC" ) ) );
    $sym678$JUSTIFICATION = makeSymbol( "JUSTIFICATION" );
    $sym679$BINDINGS = makeSymbol( "BINDINGS" );
    $sym680$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS" );
    $sym681$SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE" );
    $sym682$BINDINGS_P = makeSymbol( "BINDINGS-P" );
    $list683 = ConsesLow.list( makeString( "Prints this assignment to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
        "#<CYC-ASSIGNMENT: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "BINDINGS" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD" );
    $str685$__CYC_ASSIGNMENT__ = makeString( "#<CYC-ASSIGNMENT: " );
    $sym686$VAR_ASSIGNMENT_PRINT_METHOD = makeSymbol( "VAR-ASSIGNMENT-PRINT-METHOD" );
    $list687 = ConsesLow.list( makeString( "@return binding-list-p; the bindings of this assignment" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BINDINGS" ) ) );
    $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD" );
    $sym689$VAR_ASSIGNMENT_GET_CONTENT_METHOD = makeSymbol( "VAR-ASSIGNMENT-GET-CONTENT-METHOD" );
    $list690 = ConsesLow.list( makeString( "@return listp; the source of this assignment" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "JUSTIFICATION" ) ) );
    $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD" );
    $sym692$VAR_ASSIGNMENT_GET_SOURCE_METHOD = makeSymbol( "VAR-ASSIGNMENT-GET-SOURCE-METHOD" );
    $sym693$WORDNET_QUERY = makeSymbol( "WORDNET-QUERY" );
    $list694 = ConsesLow.list( ConsesLow.list( makeSymbol( "POS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET" ), NIL, makeKeyword(
        "PROTECTED" ) ) );
    $sym695$POS = makeSymbol( "POS" );
    $sym696$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS" );
    $sym697$SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE" );
    $sym698$WORDNET_POS_P = makeSymbol( "WORDNET-POS-P" );
    $list699 = ConsesLow.list( makeString( "noun" ), makeString( "verb" ), makeString( "adjective" ), makeString( "adverb" ) );
    $list700 = ConsesLow.list( makeString( "@return listp; a list of wordnet-glosses for this wordnet query" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "GLOSSES" ), NIL ),
        ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "NEW-WORD-PROXY" ), makeSymbol( "QUERY" ), makeSymbol( "POS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
            "WORD-PROXY-P" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SYNSET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "SYNSETS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-WORDNET-GLOSS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                    "SYNSET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GLOSS" ) ) ) ), makeSymbol( "GLOSSES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GLOSSES" ) ) ) );
    $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORDNET-QUERY-METHOD" );
    $sym702$GLOSS = makeSymbol( "GLOSS" );
    $sym703$SYNSETS = makeSymbol( "SYNSETS" );
    $sym704$WORDNET_QUERY_GET_METHOD = makeSymbol( "WORDNET-QUERY-GET-METHOD" );
    $sym705$WORDNET_GLOSS = makeSymbol( "WORDNET-GLOSS" );
    $list706 = ConsesLow.list( ConsesLow.list( makeSymbol( "GLOSS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL,
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SOURCE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym707$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS" );
    $sym708$SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE" );
    $list709 = ConsesLow.list( makeString( "@return stringp; the information of this gloss, as a string" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GLOSS" ) ) );
    $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORDNET-GLOSS-METHOD" );
    $sym711$WORDNET_GLOSS_GET_CONTENT_METHOD = makeSymbol( "WORDNET-GLOSS-GET-CONTENT-METHOD" );
    $list712 = ConsesLow.list( makeString( "@return objectp; the source of this gloss\n   @note should become more detailled than just saying wordnet" ), ConsesLow.list( makeSymbol( "RET" ), makeString(
        "Wordnet 1.7.1" ) ) );
    $str713$Wordnet_1_7_1 = makeString( "Wordnet 1.7.1" );
    $sym714$WORDNET_GLOSS_GET_SOURCE_METHOD = makeSymbol( "WORDNET-GLOSS-GET-SOURCE-METHOD" );
    $const715$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const716$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $const717$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $int718$200000 = makeInteger( 200000 );
    $int719$5000 = makeInteger( 5000 );
    $sym720$SECOND = makeSymbol( "SECOND" );
    $sym721$_ = makeSymbol( ">" );
    $list722 = ConsesLow.list( ConsesLow.list( makeSymbol( "FINAL-COUNT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym723$CLET = makeSymbol( "CLET" );
    $list724 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GOOGLE-API-METHOD-INVOCATION-COUNT*" ), ZERO_INTEGER ) );
    $sym725$PROGN = makeSymbol( "PROGN" );
    $sym726$CSETF = makeSymbol( "CSETF" );
    $list727 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT" ) ) );
    $str728$_S__ = makeString( "~S~%" );
    $sym729$_ = makeSymbol( "<" );
    $sym730$THIRD = makeSymbol( "THIRD" );
    $sym731$FORT__ = makeSymbol( "FORT-<" );
    $kw732$LICENSE_USE = makeKeyword( "LICENSE-USE" );
    $kw733$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym734$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str735$http___www_google_com_search_q__A = makeString( "http://www.google.com/search?q=~A&start=~A&num=~A" );
  }
}
/*
 * 
 * Total time: 4336 ms synthetic
 */