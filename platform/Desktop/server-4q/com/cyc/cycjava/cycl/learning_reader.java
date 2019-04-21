package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class learning_reader extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.learning_reader";
    public static final String myFingerPrint = "cedad97f620ab6b5720daa6c61c4f948727c0e48706ed88bc6b7cc7d5edeb05b";
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 874L)
    private static SubLSymbol $learning_reader_timestamp$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1738L)
    public static SubLSymbol $l2r_ebmt_index_host$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1789L)
    public static SubLSymbol $l2r_ebmt_index_port$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1829L)
    public static SubLSymbol $l2r_ebmt_index_content$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1920L)
    public static SubLSymbol $l2r_ebmt_index_log$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 3043L)
    public static SubLSymbol $l2r_transmit_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 3107L)
    public static SubLSymbol $l2r_reader_unstable_inside_stepsP$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLSymbol $dtp_l2r_paragraph_reader$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 20391L)
    private static SubLSymbol $l2r_finalization_problem_store$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25614L)
    private static SubLSymbol $long_inference_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25670L)
    private static SubLSymbol $current_long_inference_info$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLSymbol $dtp_l2r_document_reader$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 32484L)
    private static SubLSymbol $l2r_reader_image_document_reader$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48182L)
    private static SubLSymbol $l2r_sentence_level_peg_creation_template_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48482L)
    private static SubLSymbol $l2r_sentence_level_peg_exemplar_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49097L)
    private static SubLSymbol $l2r_sentence_level_peg_creation_template_sentences_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50364L)
    private static SubLSymbol $l2r_document_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50655L)
    private static SubLSymbol $l2r_sentence_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51022L)
    private static SubLSymbol $l2r_supertext_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51367L)
    private static SubLSymbol $l2r_sentence_string_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51693L)
    private static SubLSymbol $l2r_sentence_number_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51998L)
    private static SubLSymbol $l2r_sentence_string_number_indexical_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59410L)
    private static SubLSymbol $l2r_document_sentence_finder_kbq_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 69093L)
    private static SubLSymbol $html_implicit_eos_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 69319L)
    private static SubLSymbol $html_eos_open_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 69369L)
    private static SubLSymbol $html_eos_close_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 70361L)
    private static SubLSymbol $wikipedia_meta_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 84580L)
    private static SubLSymbol $l2r_noun_compound_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 84580L)
    private static SubLSymbol $l2r_noun_compound_category_pairs$;
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 85577L)
    private static SubLSymbol $l2r_noun_compound_tagger$;
    private static final SubLObject $const0$Cyc;
    private static final SubLObject $const1$BaseKB;
    private static final SubLString $str2$L2R__Failed_asserting____S___in__;
    private static final SubLString $str3$L2R_;
    private static final SubLString $str4$cyc8_cyc_com;
    private static final SubLInteger $int5$7779;
    private static final SubLString $str6$_cyc_projects_reading_learning_da;
    private static final SubLString $str7$_cyc_projects_reading_learning_da;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE;
    private static final SubLString $str10$_A_now___;
    private static final SubLString $str11$Halting_image;
    private static final SubLSymbol $sym12$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLString $str13$Finished_reading__S_;
    private static final SubLObject $const14$PropositionalConceptualWork;
    private static final SubLString $str15$The_TextLearner_can_only_read_ins;
    private static final SubLString $str16$Reading_;
    private static final SubLString $str17$Couldn_t_find_any_paragraphs_reif;
    private static final SubLString $str18$cdolist;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$START;
    private static final SubLSymbol $sym21$END;
    private static final SubLSymbol $sym22$CLET;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$FWHEN;
    private static final SubLSymbol $sym25$CSETQ;
    private static final SubLSymbol $sym26$_;
    private static final SubLSymbol $sym27$L2R_IMAGE_ELAPSED_CPU_TIME;
    private static final SubLSymbol $sym28$L2R_COMPUTING_CPU_TIME;
    private static final SubLString $str29$Please_clear_the_local_transcript;
    private static final SubLString $str30$The_Text_Learner_can_t_be_run_whi;
    private static final SubLSymbol $kw31$DONE;
    private static final SubLSymbol $sym32$L2R_PARAGRAPH_READER;
    private static final SubLSymbol $sym33$L2R_PARAGRAPH_READER_P;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PRINT_L2R_PARAGRAPH_READER;
    private static final SubLSymbol $sym39$L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$L2R_PARAGRAPH_READER_PARAGRAPH;
    private static final SubLSymbol $sym42$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH;
    private static final SubLSymbol $sym43$L2R_PARAGRAPH_READER_DOCUMENT;
    private static final SubLSymbol $sym44$_CSETF_L2R_PARAGRAPH_READER_DOCUMENT;
    private static final SubLSymbol $sym45$L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML;
    private static final SubLSymbol $sym46$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML;
    private static final SubLSymbol $sym47$L2R_PARAGRAPH_READER_SENTENCE_VECTOR;
    private static final SubLSymbol $sym48$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR;
    private static final SubLSymbol $sym49$L2R_PARAGRAPH_READER_SENTENCE_PEGS;
    private static final SubLSymbol $sym50$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS;
    private static final SubLSymbol $sym51$L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS;
    private static final SubLSymbol $sym52$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS;
    private static final SubLSymbol $sym53$L2R_PARAGRAPH_READER_SENTENCE_NUMBER;
    private static final SubLSymbol $sym54$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER;
    private static final SubLSymbol $sym55$L2R_PARAGRAPH_READER_LINKAGE;
    private static final SubLSymbol $sym56$_CSETF_L2R_PARAGRAPH_READER_LINKAGE;
    private static final SubLSymbol $sym57$L2R_PARAGRAPH_READER_LINKAGE_FORT;
    private static final SubLSymbol $sym58$_CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT;
    private static final SubLSymbol $sym59$L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT;
    private static final SubLSymbol $sym60$_CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT;
    private static final SubLSymbol $sym61$L2R_PARAGRAPH_READER_TOTAL_TIME;
    private static final SubLSymbol $sym62$_CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME;
    private static final SubLSymbol $sym63$L2R_PARAGRAPH_READER_TOTAL_CPU_TIME;
    private static final SubLSymbol $sym64$_CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME;
    private static final SubLSymbol $sym65$L2R_PARAGRAPH_READER_SENTENCE_TIME;
    private static final SubLSymbol $sym66$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME;
    private static final SubLSymbol $sym67$L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME;
    private static final SubLSymbol $sym68$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME;
    private static final SubLSymbol $sym69$L2R_PARAGRAPH_READER_STATE;
    private static final SubLSymbol $sym70$_CSETF_L2R_PARAGRAPH_READER_STATE;
    private static final SubLSymbol $kw71$PARAGRAPH;
    private static final SubLSymbol $kw72$DOCUMENT;
    private static final SubLSymbol $kw73$PARAGRAPH_SOURCE_HTML;
    private static final SubLSymbol $kw74$SENTENCE_VECTOR;
    private static final SubLSymbol $kw75$SENTENCE_PEGS;
    private static final SubLSymbol $kw76$SENTENCE_NON_HTML_TEXTS;
    private static final SubLSymbol $kw77$SENTENCE_NUMBER;
    private static final SubLSymbol $kw78$LINKAGE;
    private static final SubLSymbol $kw79$LINKAGE_FORT;
    private static final SubLSymbol $kw80$INITIAL_ASSERTION_COUNT;
    private static final SubLSymbol $kw81$TOTAL_TIME;
    private static final SubLSymbol $kw82$TOTAL_CPU_TIME;
    private static final SubLSymbol $kw83$SENTENCE_TIME;
    private static final SubLSymbol $kw84$SENTENCE_CPU_TIME;
    private static final SubLSymbol $kw85$STATE;
    private static final SubLString $str86$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw87$BEGIN;
    private static final SubLSymbol $sym88$MAKE_L2R_PARAGRAPH_READER;
    private static final SubLSymbol $kw89$SLOT;
    private static final SubLSymbol $kw90$END;
    private static final SubLSymbol $sym91$VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD;
    private static final SubLString $str92$_L2R_PARAGRAPH_READER__S__S_;
    private static final SubLString $str93$Couldn_t_find_source_HTML_for__S;
    private static final SubLSymbol $kw94$INITIALIZED;
    private static final SubLSymbol $kw95$EXHAUSTED;
    private static final SubLSymbol $sym96$_SOURCE;
    private static final SubLObject $const97$asHtmlSourceString;
    private static final SubLList $list98;
    private static final SubLObject $const99$EverythingPSC;
    private static final SubLString $str100$asHtmlSourceString_ProprietaryVer;
    private static final SubLString $str101$L2R_Paragraph_Reader;
    private static final SubLSymbol $sym102$L2R_PARAGRAPH_READER_NEXT;
    private static final SubLString $str103$___A__A_Performing_L2R_reader_act;
    private static final SubLSymbol $kw104$UNSTABLE;
    private static final SubLSymbol $kw105$FIND_OR_CREATE_PEGS_FOR_SENTENCE;
    private static final SubLSymbol $kw106$ASSERT_LINKAGE;
    private static final SubLSymbol $kw107$ASSERT_PARSE_TREE_FOR_LINKAGE;
    private static final SubLSymbol $kw108$ADD_PARSING_RESULTS;
    private static final SubLSymbol $kw109$FINALIZE_SENTENCE;
    private static final SubLSymbol $kw110$COLLECT_GARBAGE;
    private static final SubLString $str111$L2R_reader_was_unable_to_complete;
    private static final SubLSymbol $kw112$ABORTED;
    private static final SubLString $str113$__Next_L2R_reader_action___S__;
    private static final SubLSymbol $kw114$DONE_WITH_SENTENCE;
    private static final SubLSymbol $kw115$CREATED_OR_FOUND_SENTENCE_PEGS;
    private static final SubLSymbol $kw116$ASSERTED_LINKAGE;
    private static final SubLSymbol $kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE;
    private static final SubLSymbol $kw118$PARSED;
    private static final SubLSymbol $kw119$DONE_WITH_ALL_SENTENCES;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$THIS_TIME;
    private static final SubLSymbol $sym122$THIS_CPU_TIME;
    private static final SubLSymbol $sym123$CTIME;
    private static final SubLSymbol $sym124$FORMAT;
    private static final SubLString $str125$__This_step_took__A___A_of_CPU_ti;
    private static final SubLSymbol $sym126$L2R_READABLE_TIME_STRING;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$FIF;
    private static final SubLSymbol $sym129$NUMBERP;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$CINC;
    private static final SubLSymbol $sym133$PWHEN;
    private static final SubLString $str134$__Total_time_for_this_sentence___;
    private static final SubLString $str135$__Total_time_for_this_reader___A_;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$OLD_TRANSMIT_STATE;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$CUNWIND_PROTECT;
    private static final SubLSymbol $sym140$PROGN;
    private static final SubLSymbol $sym141$SET_TRANSMIT_STATE;
    private static final SubLSymbol $sym142$OLD_RECEIVE_STATE;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$SET_RECEIVE_STATE;
    private static final SubLString $str145$transmit;
    private static final SubLString $str146$store;
    private static final SubLString $str147$ReadingEvent;
    private static final SubLObject $const148$isa;
    private static final SubLList $list149;
    private static final SubLObject $const150$UniversalVocabularyMt;
    private static final SubLObject $const151$startingDate;
    private static final SubLObject $const152$pcwRead;
    private static final SubLObject $const153$LearnByReadingDocumentDataMt;
    private static final SubLObject $const154$performedBy;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$_READING;
    private static final SubLObject $const157$and;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLObject $const160$InferencePSC;
    private static final SubLObject $const161$temporallySubsumes;
    private static final SubLSymbol $kw162$GAF;
    private static final SubLObject $const163$endingDate;
    private static final SubLString $str164$none;
    private static final SubLString $str165$no;
    private static final SubLObject $const166$InterpretingDocumentMtFn;
    private static final SubLString $str167$unknown_amount;
    private static final SubLObject $const168$contentMtOfLinkage;
    private static final SubLObject $const169$linkageTokenization;
    private static final SubLString $str170$Couldn_t_find_linkage_for__S;
    private static final SubLString $str171$Couldn_t_find_linkage_FORT_for__S;
    private static final SubLString $str172$Couldn_t_find_content_mt_for__S;
    private static final SubLString $str173$Couldn_t_find_tokenization_for__S;
    private static final SubLObject $const174$ist_Asserted;
    private static final SubLObject $const175$parseTreeOfTokenization;
    private static final SubLSymbol $sym176$_PARSE_TREE;
    private static final SubLList $list177;
    private static final SubLObject $const178$LinguisticObject_NoParseAvailable;
    private static final SubLObject $const179$pegInterpretationMts;
    private static final SubLString $str180$__Asserting_Cyclifier_results_for;
    private static final SubLString $str181$__Read_sentence___S_in__A___A_of_;
    private static final SubLString $str182$__After__S_sentences__assertion_c;
    private static final SubLSymbol $sym183$RELEVANT_MT_IS_ANY_MT;
    private static final SubLSymbol $sym184$CYC_FIND_OR_CREATE_NEW_PERMANENT;
    private static final SubLString $str185$Don_t_know_what_to_do_with_finali;
    private static final SubLString $str186$__Asserting_distillation_sentence;
    private static final SubLObject $const187$TextLearnerQuery_WhatAreTheRequir;
    private static final SubLSymbol $sym188$KBQ_FROM_QUERY_RUNNING;
    private static final SubLObject $const189$TextLearnerGarbageCollectionQuery;
    private static final SubLObject $const190$TextLearnerDisambiguationResultsD;
    private static final SubLObject $const191$cycLQueryTypeSpecification;
    private static final SubLList $list192;
    private static final SubLSymbol $kw193$PROBLEM_STORE;
    private static final SubLString $str194$__Read__S_sentences_in__A___;
    private static final SubLString $str195$Long_Inference_Warner;
    private static final SubLSymbol $sym196$WARN_ABOUT_LONG_INFERENCES;
    private static final SubLInteger $int197$600;
    private static final SubLSymbol $kw198$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym199$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str200$_S_finished_after__A_with__S_answ;
    private static final SubLString $str201$_S_has_taken__A_so_far____HL_quer;
    private static final SubLSymbol $sym202$INDEXED_TERM_P;
    private static final SubLSymbol $kw203$MAX_PARSE_TIME;
    private static final SubLInteger $int204$180;
    private static final SubLString $str205$__Asserting_linkage_for__S___S___;
    private static final SubLObject $const206$L2RLinkageReificationTemplate;
    private static final SubLString $str207$Tokenization;
    private static final SubLList $list208;
    private static final SubLObject $const209$tokenizationInputString;
    private static final SubLObject $const210$pegTokenizations;
    private static final SubLObject $const211$ContentModelForPegFn;
    private static final SubLSymbol $sym212$_TOKENIZATION;
    private static final SubLList $list213;
    private static final SubLString $str214$Couldn_t_find_string_for__S;
    private static final SubLString $str215$Couldn_t_find_L2R_document_to_rea;
    private static final SubLSymbol $sym216$L2R_DOCUMENT_READER;
    private static final SubLSymbol $sym217$L2R_DOCUMENT_READER_P;
    private static final SubLList $list218;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$PRINT_L2R_DOCUMENT_READER;
    private static final SubLSymbol $sym223$L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$L2R_DOCUMENT_READER_DOCUMENT;
    private static final SubLSymbol $sym226$_CSETF_L2R_DOCUMENT_READER_DOCUMENT;
    private static final SubLSymbol $sym227$L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS;
    private static final SubLSymbol $sym228$_CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS;
    private static final SubLSymbol $sym229$L2R_DOCUMENT_READER_READ_PARAGRAPHS;
    private static final SubLSymbol $sym230$_CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS;
    private static final SubLSymbol $sym231$L2R_DOCUMENT_READER_PARAGRAPH_READER;
    private static final SubLSymbol $sym232$_CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER;
    private static final SubLSymbol $sym233$L2R_DOCUMENT_READER_READING_EVENT;
    private static final SubLSymbol $sym234$_CSETF_L2R_DOCUMENT_READER_READING_EVENT;
    private static final SubLSymbol $kw235$REMAINING_PARAGRAPHS;
    private static final SubLSymbol $kw236$READ_PARAGRAPHS;
    private static final SubLSymbol $kw237$PARAGRAPH_READER;
    private static final SubLSymbol $kw238$READING_EVENT;
    private static final SubLSymbol $sym239$MAKE_L2R_DOCUMENT_READER;
    private static final SubLSymbol $sym240$VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD;
    private static final SubLString $str241$_L2R_DOCUMENT_READER__S_;
    private static final SubLSymbol $sym242$_L2R_READER_IMAGE_DOCUMENT_READER_;
    private static final SubLObject $const243$TextLearnerQuery_FindWikipediaArt;
    private static final SubLSymbol $sym244$FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT;
    private static final SubLSymbol $sym245$STARTS_BEFORE_STARTING_OF_;
    private static final SubLString $str246$_host_;
    private static final SubLString $str247$_scratch_;
    private static final SubLSymbol $sym248$DIRECTORY_P;
    private static final SubLString $str249$l2r_images_;
    private static final SubLString $str250$done_;
    private static final SubLString $str251$ongoing_;
    private static final SubLObject $const252$referenceWorkEntryTitle;
    private static final SubLSymbol $sym253$ALPHA_CHAR_P;
    private static final SubLString $str254$load;
    private static final SubLString $str255$Saved_image_file_to__S;
    private static final SubLSymbol $sym256$_AIS;
    private static final SubLObject $const257$correspondingAIS;
    private static final SubLList $list258;
    private static final SubLList $list259;
    private static final SubLObject $const260$WorldWideWebPage_PCW;
    private static final SubLList $list261;
    private static final SubLObject $const262$AISForFn;
    private static final SubLString $str263$Don_t_know_how_to_read__S_;
    private static final SubLObject $const264$retainTerm;
    private static final SubLSymbol $sym265$NART_P;
    private static final SubLSymbol $sym266$FORT_P;
    private static final SubLString $str267$_S___has_already_been_downloaded_;
    private static final SubLObject $const268$webPageURL;
    private static final SubLString $str269$WebpageDownload;
    private static final SubLString $str270$_S_doesn_t_have_a___webPageURL_as;
    private static final SubLObject $const271$DownloadTypeOfAISFn;
    private static final SubLObject $const272$dateOfEvent;
    private static final SubLObject $const273$directingAgent;
    private static final SubLObject $const274$CyclistsMt;
    private static final SubLObject $const275$transferredAIS;
    private static final SubLList $list276;
    private static final SubLObject $const277$nthOccurrenceOfStructureTypeInStr;
    private static final SubLSymbol $sym278$_PARAGRAPH;
    private static final SubLSymbol $sym279$_N;
    private static final SubLObject $const280$NLParagraph;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$CAR;
    private static final SubLSymbol $sym283$_;
    private static final SubLString $str284$Reifying_paragraphs_in_;
    private static final SubLString $str285$___;
    private static final SubLString $str286$_p_;
    private static final SubLString $str287$_S_doesn_t_have_any_recognizable_;
    private static final SubLString $str288$Identifying_paragraphs_in_;
    private static final SubLString $str289$__p_;
    private static final SubLString $str290$script;
    private static final SubLString $str291$No_non_tagged_text_in__S;
    private static final SubLString $str292$No_closed_class_words_in__S;
    private static final SubLObject $const293$NthOccurrenceOfStructureTypeInStr;
    private static final SubLString $str294$___S___S__;
    private static final SubLString $str295$SentenceLevelPeg;
    private static final SubLSymbol $sym296$STRING_OR_UNICODE_NAUT_P;
    private static final SubLSymbol $sym297$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym298$_PEG;
    private static final SubLList $list299;
    private static final SubLSymbol $sym300$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE;
    private static final SubLObject $const301$SentenceLevelPegCreationTemplateF;
    private static final SubLString $str302$Failed_to_validate___SentenceLeve;
    private static final SubLSymbol $sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_;
    private static final SubLSymbol $sym304$L2R_SENTENCE_LEVEL_PEG_EXEMPLAR;
    private static final SubLObject $const305$TheExemplarSentenceLevelPeg;
    private static final SubLString $str306$Failed_to_validate___TheExemplarS;
    private static final SubLSymbol $sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_;
    private static final SubLSymbol $sym308$RULE_ASSERTION_;
    private static final SubLString $str309$Failed_to_find_good_L2R_SENTENCE_;
    private static final SubLSymbol $sym310$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES;
    private static final SubLSymbol $sym311$IST_SENTENCE_P;
    private static final SubLString $str312$Failed_to_initialize_L2R_SENTENCE;
    private static final SubLSymbol $sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE;
    private static final SubLList $list314;
    private static final SubLSymbol $sym315$L2R_DOCUMENT_INDEXICAL;
    private static final SubLList $list316;
    private static final SubLString $str317$Failed_to_validate_L2R_DOCUMENT_I;
    private static final SubLSymbol $sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_;
    private static final SubLSymbol $sym319$L2R_SENTENCE_INDEXICAL;
    private static final SubLList $list320;
    private static final SubLString $str321$Failed_to_validate_L2R_SENTENCE_I;
    private static final SubLSymbol $sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_;
    private static final SubLSymbol $sym323$L2R_SUPERTEXT_INDEXICAL;
    private static final SubLList $list324;
    private static final SubLString $str325$Failed_to_validate_L2R_SUPERTEXT_;
    private static final SubLSymbol $sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_;
    private static final SubLSymbol $sym327$L2R_SENTENCE_STRING_INDEXICAL;
    private static final SubLList $list328;
    private static final SubLString $str329$Failed_to_validate_L2R_SENTENCE_S;
    private static final SubLSymbol $sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_;
    private static final SubLSymbol $sym331$L2R_SENTENCE_NUMBER_INDEXICAL;
    private static final SubLList $list332;
    private static final SubLString $str333$Failed_to_validate_L2R_SENTENCE_N;
    private static final SubLSymbol $sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_;
    private static final SubLSymbol $sym335$L2R_SENTENCE_STRING_NUMBER_INDEXICAL;
    private static final SubLList $list336;
    private static final SubLString $str337$Failed_to_validate_L2R_SENTENCE_S;
    private static final SubLSymbol $sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_;
    private static final SubLList $list339;
    private static final SubLObject $const340$assertPriorToInCreationTemplate;
    private static final SubLSymbol $sym341$_HIGHER;
    private static final SubLSymbol $sym342$_LOWER;
    private static final SubLList $list343;
    private static final SubLSymbol $sym344$HL_TO_EL;
    private static final SubLSymbol $sym345$ASSERTION_IST_FORMULA;
    private static final SubLSymbol $sym346$HTML_STRING_WORDIFY;
    private static final SubLString $str347$Couldn_t_make_UTF8_string_from__S;
    private static final SubLSymbol $sym348$NON_ASCII_CHAR_P;
    private static final SubLSymbol $kw349$LEADING_TAGS;
    private static final SubLSymbol $kw350$FOLLOWING_TAGS;
    private static final SubLSymbol $kw351$LEADING_WHITESPACE;
    private static final SubLSymbol $kw352$FOLLOWING_WHITESPACE;
    private static final SubLList $list353;
    private static final SubLObject $const354$SubExpressionAtOffsetFn;
    private static final SubLObject $const355$subExpressionWithStringAtOffset;
    private static final SubLSymbol $sym356$SENTENCE_P;
    private static final SubLSymbol $kw357$NONE;
    private static final SubLString $str358$_a;
    private static final SubLString $str359$href;
    private static final SubLString $str360$__a;
    private static final SubLString $str361$Bad_offset___S_at_offset__S_of__S;
    private static final SubLSymbol $kw362$OK;
    private static final SubLSymbol $sym363$L2R_DOCUMENT_SENTENCE_FINDER_KBQ;
    private static final SubLObject $const364$ReifySentencePegQuery_FindSentenc;
    private static final SubLString $str365$Failed_to_validate___ReifySentenc;
    private static final SubLSymbol $sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_;
    private static final SubLSymbol $sym367$EQUALS_EL_;
    private static final SubLSymbol $sym368$NON_EMPTY_STRING_P;
    private static final SubLString $str369$Asserting_linkages_for____;
    private static final SubLString $str370$_____A__;
    private static final SubLString $str371$Using_L2R_Webpage_Cyclifier_with_;
    private static final SubLString $str372$sentences_;
    private static final SubLInteger $int373$511;
    private static final SubLString $str374$links;
    private static final SubLString $str375$__Writing__S_links_from__S_to__S_;
    private static final SubLSymbol $kw376$OUTPUT;
    private static final SubLString $str377$Unable_to_open__S;
    private static final SubLString $str378$http___en_wikipedia_org_;
    private static final SubLString $str379$;
    private static final SubLString $str380$Following_unknown_phrase_links_in;
    private static final SubLString $str381$_;
    private static final SubLList $list382;
    private static final SubLString $str383$_;
    private static final SubLSymbol $kw384$INPUT;
    private static final SubLList $list385;
    private static final SubLString $str386$_a_href___wiki_;
    private static final SubLString $str387$a_href_;
    private static final SubLString $str388$_img_;
    private static final SubLSymbol $sym389$PUNCTUATION_P;
    private static final SubLString $str390$Logging_cyclifications_for_;
    private static final SubLString $str391$__;
    private static final SubLString $str392$sentence__3__0D_;
    private static final SubLString $str393$Couldn_t_make_directory_____S;
    private static final SubLString $str394$sentence_text_lisp;
    private static final SubLString $str395$__Cyclifying_unparsed_sentences_f;
    private static final SubLString $str396$sentence_;
    private static final SubLString $str397$sentence_parsed_lisp;
    private static final SubLString $str398$__Skipping_already_parsed__S__;
    private static final SubLString $str399$__Parsing__S__;
    private static final SubLString $str400$___Logged__S_sentence_parses_to__;
    private static final SubLString $str401$No_sentence_to_parse_in__S;
    private static final SubLList $list402;
    private static final SubLSymbol $sym403$CCONCATENATE;
    private static final SubLList $list404;
    private static final SubLList $list405;
    private static final SubLList $list406;
    private static final SubLList $list407;
    private static final SubLString $str408$_C;
    private static final SubLString $str409$_;
    private static final SubLString $str410$__;
    private static final SubLString $str411$_;
    private static final SubLString $str412$_ul_;
    private static final SubLString $str413$__ul_;
    private static final SubLString $str414$_____start_content____;
    private static final SubLString $str415$_____end_content____;
    private static final SubLString $str416$ul;
    private static final SubLString $str417$ol;
    private static final SubLString $str418$table;
    private static final SubLString $str419$h1;
    private static final SubLString $str420$h2;
    private static final SubLString $str421$h3;
    private static final SubLSymbol $sym422$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str423$Couldn_t_find_paragraphs_in__S;
    private static final SubLString $str424$No_sentence_string_for__S;
    private static final SubLString $str425$_A_;
    private static final SubLString $str426$href__;
    private static final SubLString $str427$_;
    private static final SubLString $str428$_;
    private static final SubLString $str429$_u0a_;
    private static final SubLString $str430$Downloading_and_sentencifying_tex;
    private static final SubLObject $const431$CurrentWorldDataCollectorMt;
    private static final SubLInteger $int432$30;
    private static final SubLString $str433$__Cannot_open_input_stream_for__A;
    private static final SubLSymbol $kw434$EOF;
    private static final SubLString $str435$Non_string_in__S_____S__;
    private static final SubLString $str436$775;
    private static final SubLString $str437$_S_is_not_empty;
    private static final SubLString $str438$results_dictionary_cfasl;
    private static final SubLString $str439$Parsing_and_partioning_paragraphs;
    private static final SubLSymbol $kw440$SENTENCE;
    private static final SubLSymbol $kw441$GOOD;
    private static final SubLSymbol $kw442$BAD;
    private static final SubLSymbol $kw443$MAYBE;
    private static final SubLString $str444$Writing_results_to__S;
    private static final SubLList $list445;
    private static final SubLList $list446;
    private static final SubLSymbol $sym447$ALPHANUMERICP;
    private static final SubLString $str448$_A__3__0D;
    private static final SubLString $str449$Known_bindings_;
    private static final SubLString $str450$Consistent_;
    private static final SubLString $str451$Known_false_;
    private static final SubLSymbol $sym452$NART_HL_FORMULA;
    private static final SubLSymbol $sym453$ALPHANUMERIC_STRING_;
    private static final SubLSymbol $sym454$WORD_CATEGORY;
    private static final SubLSymbol $kw455$UNINITIALIZED;
    private static final SubLList $list456;
    private static final SubLSymbol $kw457$STRING;
    private static final SubLSymbol $kw458$CATEGORY;
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 936L)
    public static SubLObject default_learning_reader_cyclist() {
        return learning_reader.$const0$Cyc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1039L)
    public static SubLObject l2r_assert(final SubLObject sentence, SubLObject mt) {
        if (mt == learning_reader.UNPROVIDED) {
            mt = learning_reader.$const1$BaseKB;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_assert_now(sentence, mt, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
            final SubLObject problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (learning_reader.NIL == successP) {
                Errors.warn((SubLObject)learning_reader.$str2$L2R__Failed_asserting____S___in__, sentence, mt, problem);
            }
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1354L)
    public static SubLObject l2r_unassert_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            ke.ke_unassert_assertion(assertion);
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 1520L)
    public static SubLObject l2r_create(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_constant = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            new_constant = ke.ke_create_now(Sequences.cconcatenate((SubLObject)learning_reader.$str3$L2R_, name), (SubLObject)learning_reader.UNPROVIDED);
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 2007L)
    public static SubLObject add_text_learner_ebmt_training_example(final SubLObject argument, final SubLObject assertion) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(assertion);
        SubLObject nl_sent = (SubLObject)learning_reader.NIL;
        SubLObject cycl_sent = (SubLObject)learning_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list8);
        nl_sent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list8);
        cycl_sent = current.first();
        current = current.rest();
        if (learning_reader.NIL == current) {
            create_and_add_l2r_ebmt_template(nl_sent, cycl_sent);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list8);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 2294L)
    public static SubLObject create_and_add_l2r_ebmt_template(final SubLObject nl_sent, final SubLObject cycl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind(learning_reader.$l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind(learning_reader.$l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind(learning_reader.$l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind(learning_reader.$l2r_ebmt_index_log$.getGlobalValue(), thread);
            ebmt_template_parser.ebmt_create_and_add_templates(nl_sent, cycl_sent, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        }
        finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_4, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_port$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return nl_sent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 2624L)
    public static SubLObject l2r_ebmt_parse(final SubLObject nl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)learning_reader.NIL;
        SubLObject justifications = (SubLObject)learning_reader.NIL;
        SubLObject weights = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind(learning_reader.$l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind(learning_reader.$l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind(learning_reader.$l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind(learning_reader.$l2r_ebmt_index_log$.getGlobalValue(), thread);
            thread.resetMultipleValues();
            final SubLObject parses_$1 = ebmt_template_parser.ebmt_parse(nl_sent, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
            final SubLObject justifications_$2 = thread.secondMultipleValue();
            final SubLObject weights_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            parses = parses_$1;
            justifications = justifications_$2;
            weights = weights_$3;
        }
        finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_4, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_port$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return Values.values(parses, justifications, weights);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 3171L)
    public static SubLObject l2r_reader_image_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_reader = l2r_reader_image_find_or_create_document_reader();
        set_l2r_reader_image_document_reader(document_reader);
        final SubLObject _prev_bind_0 = learning_reader.$l2r_transmit_operationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = learning_reader.$l2r_reader_unstable_inside_stepsP$.currentBinding(thread);
        try {
            learning_reader.$l2r_transmit_operationsP$.bind((SubLObject)learning_reader.T, thread);
            learning_reader.$l2r_reader_unstable_inside_stepsP$.bind((SubLObject)learning_reader.NIL, thread);
            l2r_document_reader_read_document(document_reader);
        }
        finally {
            learning_reader.$l2r_reader_unstable_inside_stepsP$.rebind(_prev_bind_2, thread);
            learning_reader.$l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str10$_A_now___, (SubLObject)learning_reader.$str11$Halting_image);
        operation_communication.halt_cyc_image((SubLObject)learning_reader.UNPROVIDED);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 3732L)
    public static SubLObject l2r_reader_image_read_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        final SubLObject _prev_bind_0 = learning_reader.$l2r_transmit_operationsP$.currentBinding(thread);
        try {
            learning_reader.$l2r_transmit_operationsP$.bind((SubLObject)learning_reader.T, thread);
            final SubLObject document_reader = l2r_new_reader_for_document(v_document);
            set_l2r_reader_image_document_reader(document_reader);
            l2r_document_reader_read_document(document_reader);
            set_l2r_reader_image_document_reader((SubLObject)learning_reader.NIL);
        }
        finally {
            learning_reader.$l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str13$Finished_reading__S_, v_document);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 4210L)
    public static SubLObject l2r_read_document(final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == learning_reader.UNPROVIDED) {
            reading_event = (SubLObject)learning_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == isa.isa_in_any_mtP(v_document, learning_reader.$const14$PropositionalConceptualWork)) {
            Errors.error((SubLObject)learning_reader.$str15$The_TextLearner_can_only_read_ins, v_document);
        }
        final SubLObject message = Sequences.cconcatenate((SubLObject)learning_reader.$str16$Reading_, format_nil.format_nil_s_no_copy(v_document));
        final SubLObject paragraphs = l2r_find_or_create_document_paragraphs(v_document, (SubLObject)learning_reader.UNPROVIDED);
        if (learning_reader.NIL == list_utilities.non_empty_list_p(paragraphs)) {
            Errors.warn((SubLObject)learning_reader.$str17$Couldn_t_find_any_paragraphs_reif, v_document);
        }
        if (learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
            note_l2r_reading_event_ongoing(reading_event);
        }
        final SubLObject list_var = paragraphs;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((learning_reader.NIL != message) ? message : learning_reader.$str18$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject paragraph = (SubLObject)learning_reader.NIL;
                paragraph = csome_list_var.first();
                while (learning_reader.NIL != csome_list_var) {
                    operation_queues.clear_local_operation_storage_queue();
                    l2r_read_paragraph(paragraph, v_document, (SubLObject)learning_reader.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)learning_reader.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    paragraph = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
        if (learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
            note_l2r_reading_event_done(reading_event);
        }
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 5184L)
    public static SubLObject l2r_computing_cpu_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)learning_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list19);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject start = (SubLObject)learning_reader.$sym20$START;
        final SubLObject end = (SubLObject)learning_reader.$sym21$END;
        return (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym22$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start, (SubLObject)learning_reader.$list23)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(end, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym24$FWHEN, start, (SubLObject)learning_reader.$list23))), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym25$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym24$FWHEN, end, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym26$_, end, start)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 5459L)
    public static SubLObject l2r_image_elapsed_cpu_time() {
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 5622L)
    public static SubLObject l2r_read_paragraph(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == learning_reader.UNPROVIDED) {
            reading_event = (SubLObject)learning_reader.NIL;
        }
        if (learning_reader.NIL == operation_queues.local_operation_storage_queue_empty()) {
            Errors.warn((SubLObject)learning_reader.$str29$Please_clear_the_local_transcript);
            return (SubLObject)learning_reader.NIL;
        }
        if (learning_reader.NIL == operation_queues.local_queue_empty()) {
            Errors.warn((SubLObject)learning_reader.$str30$The_Text_Learner_can_t_be_run_whi);
            return (SubLObject)learning_reader.NIL;
        }
        final SubLObject communication_mode = operation_communication.communication_mode();
        try {
            l2r_read_paragraph_internal(paragraph, v_document, reading_event, (SubLObject)learning_reader.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_communication_mode(communication_mode);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)learning_reader.$kw31$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_l2r_paragraph_reader(v_object, stream, (SubLObject)learning_reader.ZERO_INTEGER);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $l2r_paragraph_reader_native.class) ? learning_reader.T : learning_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_paragraph(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_document(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_vector(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_pegs(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_number(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_linkage(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_linkage_fort(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_total_time(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_total_cpu_time(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_time(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject l2r_paragraph_reader_state(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_paragraph(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_document(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_vector(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_pegs(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_number(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_linkage(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_linkage_fort(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_total_time(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_total_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_time(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject _csetf_l2r_paragraph_reader_state(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_paragraph_reader_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject make_l2r_paragraph_reader(SubLObject arglist) {
        if (arglist == learning_reader.UNPROVIDED) {
            arglist = (SubLObject)learning_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $l2r_paragraph_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)learning_reader.NIL, next = arglist; learning_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)learning_reader.$kw71$PARAGRAPH)) {
                _csetf_l2r_paragraph_reader_paragraph(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw72$DOCUMENT)) {
                _csetf_l2r_paragraph_reader_document(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw73$PARAGRAPH_SOURCE_HTML)) {
                _csetf_l2r_paragraph_reader_paragraph_source_html(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw74$SENTENCE_VECTOR)) {
                _csetf_l2r_paragraph_reader_sentence_vector(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw75$SENTENCE_PEGS)) {
                _csetf_l2r_paragraph_reader_sentence_pegs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw76$SENTENCE_NON_HTML_TEXTS)) {
                _csetf_l2r_paragraph_reader_sentence_non_html_texts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw77$SENTENCE_NUMBER)) {
                _csetf_l2r_paragraph_reader_sentence_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw78$LINKAGE)) {
                _csetf_l2r_paragraph_reader_linkage(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw79$LINKAGE_FORT)) {
                _csetf_l2r_paragraph_reader_linkage_fort(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw80$INITIAL_ASSERTION_COUNT)) {
                _csetf_l2r_paragraph_reader_initial_assertion_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw81$TOTAL_TIME)) {
                _csetf_l2r_paragraph_reader_total_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw82$TOTAL_CPU_TIME)) {
                _csetf_l2r_paragraph_reader_total_cpu_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw83$SENTENCE_TIME)) {
                _csetf_l2r_paragraph_reader_sentence_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw84$SENTENCE_CPU_TIME)) {
                _csetf_l2r_paragraph_reader_sentence_cpu_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw85$STATE)) {
                _csetf_l2r_paragraph_reader_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)learning_reader.$str86$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject visit_defstruct_l2r_paragraph_reader(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw87$BEGIN, (SubLObject)learning_reader.$sym88$MAKE_L2R_PARAGRAPH_READER, (SubLObject)learning_reader.FIFTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw71$PARAGRAPH, l2r_paragraph_reader_paragraph(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw72$DOCUMENT, l2r_paragraph_reader_document(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw73$PARAGRAPH_SOURCE_HTML, l2r_paragraph_reader_paragraph_source_html(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw74$SENTENCE_VECTOR, l2r_paragraph_reader_sentence_vector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw75$SENTENCE_PEGS, l2r_paragraph_reader_sentence_pegs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw76$SENTENCE_NON_HTML_TEXTS, l2r_paragraph_reader_sentence_non_html_texts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw77$SENTENCE_NUMBER, l2r_paragraph_reader_sentence_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw78$LINKAGE, l2r_paragraph_reader_linkage(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw79$LINKAGE_FORT, l2r_paragraph_reader_linkage_fort(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw80$INITIAL_ASSERTION_COUNT, l2r_paragraph_reader_initial_assertion_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw81$TOTAL_TIME, l2r_paragraph_reader_total_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw82$TOTAL_CPU_TIME, l2r_paragraph_reader_total_cpu_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw83$SENTENCE_TIME, l2r_paragraph_reader_sentence_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw84$SENTENCE_CPU_TIME, l2r_paragraph_reader_sentence_cpu_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw85$STATE, l2r_paragraph_reader_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw90$END, (SubLObject)learning_reader.$sym88$MAKE_L2R_PARAGRAPH_READER, (SubLObject)learning_reader.FIFTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6188L)
    public static SubLObject visit_defstruct_object_l2r_paragraph_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_l2r_paragraph_reader(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6524L)
    public static SubLObject print_l2r_paragraph_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)learning_reader.$str92$_L2R_PARAGRAPH_READER__S__S_, l2r_paragraph_reader_paragraph(reader), l2r_paragraph_reader_state(reader));
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 6753L)
    public static SubLObject new_l2r_paragraph_reader(final SubLObject paragraph, final SubLObject v_document) {
        final SubLObject reader = make_l2r_paragraph_reader((SubLObject)learning_reader.UNPROVIDED);
        final SubLObject source_html = l2r_get_source_html(paragraph);
        if (!source_html.isString()) {
            Errors.warn((SubLObject)learning_reader.$str93$Couldn_t_find_source_HTML_for__S, paragraph);
        }
        _csetf_l2r_paragraph_reader_paragraph(reader, paragraph);
        _csetf_l2r_paragraph_reader_document(reader, v_document);
        _csetf_l2r_paragraph_reader_paragraph_source_html(reader, source_html);
        if (source_html.isString()) {
            _csetf_l2r_paragraph_reader_sentence_vector(reader, sentencify_l2r_paragraph(l2r_paragraph_reader_paragraph_source_html(reader)));
        }
        _csetf_l2r_paragraph_reader_sentence_pegs(reader, (SubLObject)learning_reader.NIL);
        _csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, (SubLObject)learning_reader.NIL);
        _csetf_l2r_paragraph_reader_sentence_number(reader, (SubLObject)learning_reader.ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_initial_assertion_count(reader, assertion_handles.assertion_count());
        _csetf_l2r_paragraph_reader_total_time(reader, (SubLObject)learning_reader.ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_total_cpu_time(reader, (SubLObject)learning_reader.ZERO_INTEGER);
        reset_l2r_paragraph_reader_sentence_times(reader);
        _csetf_l2r_paragraph_reader_state(reader, (SubLObject)(source_html.isString() ? learning_reader.$kw94$INITIALIZED : learning_reader.$kw95$EXHAUSTED));
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 7958L)
    public static SubLObject l2r_get_source_html(final SubLObject structure) {
        return backward.removal_ask_variable((SubLObject)learning_reader.$sym96$_SOURCE, (SubLObject)ConsesLow.listS(learning_reader.$const97$asHtmlSourceString, structure, (SubLObject)learning_reader.$list98), learning_reader.$const99$EverythingPSC, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 8123L)
    public static SubLObject l2r_assert_source_html(final SubLObject structure, final SubLObject source_html, final SubLObject mt, SubLObject proprietaryP) {
        if (proprietaryP == learning_reader.UNPROVIDED) {
            proprietaryP = (SubLObject)learning_reader.T;
        }
        final SubLObject proprietary_pred = constants_high.find_constant((SubLObject)learning_reader.$str100$asHtmlSourceString_ProprietaryVer);
        final SubLObject pred = (learning_reader.NIL != proprietaryP && learning_reader.NIL != constant_handles.valid_constantP(proprietary_pred, (SubLObject)learning_reader.UNPROVIDED)) ? proprietary_pred : learning_reader.$const97$asHtmlSourceString;
        return l2r_assert((SubLObject)ConsesLow.list(pred, structure, source_html), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 8483L)
    public static SubLObject l2r_paragraph_reader_next_in_separate_thread(final SubLObject reader) {
        return process_utilities.make_cyc_server_process_with_args((SubLObject)learning_reader.$str101$L2R_Paragraph_Reader, (SubLObject)learning_reader.$sym102$L2R_PARAGRAPH_READER_NEXT, (SubLObject)ConsesLow.list(reader));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 8664L)
    public static SubLObject l2r_paragraph_reader_next(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = l2r_paragraph_reader_state(reader);
        final SubLObject action = l2r_paragraph_reader_next_action(reader);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str103$___A__A_Performing_L2R_reader_act, new SubLObject[] { numeric_date_utilities.datestring((SubLObject)learning_reader.UNPROVIDED), numeric_date_utilities.secondstring((SubLObject)learning_reader.UNPROVIDED), action });
        streams_high.force_output((SubLObject)learning_reader.T);
        if (learning_reader.NIL != learning_reader.$l2r_reader_unstable_inside_stepsP$.getDynamicValue(thread)) {
            _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw104$UNSTABLE);
        }
        inference_metrics.clear_forward_inference_metrics();
        final SubLObject pcase_var = action;
        if (pcase_var.eql((SubLObject)learning_reader.$kw105$FIND_OR_CREATE_PEGS_FOR_SENTENCE)) {
            l2r_paragraph_reader_find_or_create_pegs_for_sentence(reader);
        }
        else if (pcase_var.eql((SubLObject)learning_reader.$kw106$ASSERT_LINKAGE)) {
            l2r_paragraph_reader_find_or_assert_linkage(reader);
        }
        else if (pcase_var.eql((SubLObject)learning_reader.$kw107$ASSERT_PARSE_TREE_FOR_LINKAGE)) {
            l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(reader);
        }
        else if (pcase_var.eql((SubLObject)learning_reader.$kw108$ADD_PARSING_RESULTS)) {
            l2r_paragraph_reader_maybe_add_parsing_results(reader);
        }
        else if (pcase_var.eql((SubLObject)learning_reader.$kw109$FINALIZE_SENTENCE)) {
            l2r_paragraph_reader_finalize_sentence(reader);
        }
        else if (pcase_var.eql((SubLObject)learning_reader.$kw110$COLLECT_GARBAGE)) {
            l2r_paragraph_reader_collect_garbage(reader);
        }
        else {
            final SubLObject pcase_var_$5 = state;
            if (pcase_var_$5.eql((SubLObject)learning_reader.$kw95$EXHAUSTED)) {
                destroy_l2r_paragraph_reader(reader);
                return (SubLObject)learning_reader.$kw95$EXHAUSTED;
            }
            if (pcase_var_$5.eql((SubLObject)learning_reader.$kw104$UNSTABLE)) {
                Errors.warn((SubLObject)learning_reader.$str111$L2R_reader_was_unable_to_complete);
                destroy_l2r_paragraph_reader(reader);
                return (SubLObject)learning_reader.$kw112$ABORTED;
            }
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str113$__Next_L2R_reader_action___S__, l2r_paragraph_reader_next_action(reader));
        streams_high.force_output((SubLObject)learning_reader.T);
        return l2r_paragraph_reader_state(reader);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 10096L)
    public static SubLObject l2r_paragraph_reader_next_action(final SubLObject reader) {
        final SubLObject pcase_var;
        final SubLObject state = pcase_var = l2r_paragraph_reader_state(reader);
        if (pcase_var.eql((SubLObject)learning_reader.$kw94$INITIALIZED) || pcase_var.eql((SubLObject)learning_reader.$kw114$DONE_WITH_SENTENCE)) {
            return (SubLObject)learning_reader.$kw105$FIND_OR_CREATE_PEGS_FOR_SENTENCE;
        }
        if (pcase_var.eql((SubLObject)learning_reader.$kw115$CREATED_OR_FOUND_SENTENCE_PEGS)) {
            return (SubLObject)learning_reader.$kw106$ASSERT_LINKAGE;
        }
        if (pcase_var.eql((SubLObject)learning_reader.$kw116$ASSERTED_LINKAGE)) {
            return (SubLObject)learning_reader.$kw107$ASSERT_PARSE_TREE_FOR_LINKAGE;
        }
        if (pcase_var.eql((SubLObject)learning_reader.$kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE)) {
            return (SubLObject)learning_reader.$kw108$ADD_PARSING_RESULTS;
        }
        if (pcase_var.eql((SubLObject)learning_reader.$kw118$PARSED)) {
            return (SubLObject)learning_reader.$kw109$FINALIZE_SENTENCE;
        }
        if (pcase_var.eql((SubLObject)learning_reader.$kw119$DONE_WITH_ALL_SENTENCES)) {
            return (SubLObject)learning_reader.$kw110$COLLECT_GARBAGE;
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 10679L)
    public static SubLObject destroy_l2r_paragraph_reader(final SubLObject reader) {
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 10761L)
    public static SubLObject updating_l2r_paragraph_reader_times(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reader = (SubLObject)learning_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list120);
        reader = current.first();
        current = current.rest();
        if (learning_reader.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject this_time = (SubLObject)learning_reader.$sym121$THIS_TIME;
            final SubLObject this_cpu_time = (SubLObject)learning_reader.$sym122$THIS_CPU_TIME;
            return (SubLObject)ConsesLow.list(new SubLObject[] { learning_reader.$sym22$CLET, ConsesLow.list(this_time, this_cpu_time), ConsesLow.list((SubLObject)learning_reader.$sym28$L2R_COMPUTING_CPU_TIME, this_cpu_time, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym123$CTIME, this_time, ConsesLow.append(body, (SubLObject)learning_reader.NIL))), ConsesLow.list((SubLObject)learning_reader.$sym124$FORMAT, (SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, this_time, (SubLObject)learning_reader.$list127), (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym128$FIF, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym129$NUMBERP, this_cpu_time), (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, this_cpu_time, (SubLObject)learning_reader.$list130), (SubLObject)learning_reader.$list131)), ConsesLow.list((SubLObject)learning_reader.$sym132$CINC, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym61$L2R_PARAGRAPH_READER_TOTAL_TIME, reader), this_time), ConsesLow.list((SubLObject)learning_reader.$sym132$CINC, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym65$L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), this_time), ConsesLow.list((SubLObject)learning_reader.$sym133$PWHEN, this_cpu_time, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym132$CINC, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym63$L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), this_cpu_time), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym132$CINC, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym67$L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), this_cpu_time)), ConsesLow.list((SubLObject)learning_reader.$sym124$FORMAT, (SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym65$L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), (SubLObject)learning_reader.$list127), (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym67$L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), (SubLObject)learning_reader.$list130)), ConsesLow.list((SubLObject)learning_reader.$sym124$FORMAT, (SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym61$L2R_PARAGRAPH_READER_TOTAL_TIME, reader), (SubLObject)learning_reader.$list127), (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym126$L2R_READABLE_TIME_STRING, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym63$L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), (SubLObject)learning_reader.$list130)) });
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list120);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 12000L)
    public static SubLObject with_temporary_transmit_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)learning_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list136);
        state = current.first();
        current = current.rest();
        if (learning_reader.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject old_transmit_state = (SubLObject)learning_reader.$sym137$OLD_TRANSMIT_STATE;
            return (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym22$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(old_transmit_state, (SubLObject)learning_reader.$list138)), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym139$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym140$PROGN, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym141$SET_TRANSMIT_STATE, state), ConsesLow.append(body, (SubLObject)learning_reader.NIL)), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym141$SET_TRANSMIT_STATE, old_transmit_state)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list136);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 12299L)
    public static SubLObject with_temporary_receive_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = (SubLObject)learning_reader.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list136);
        state = current.first();
        current = current.rest();
        if (learning_reader.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject old_receive_state = (SubLObject)learning_reader.$sym142$OLD_RECEIVE_STATE;
            return (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym22$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(old_receive_state, (SubLObject)learning_reader.$list143)), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym139$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)learning_reader.$sym140$PROGN, (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym144$SET_RECEIVE_STATE, state), ConsesLow.append(body, (SubLObject)learning_reader.NIL)), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym144$SET_RECEIVE_STATE, old_receive_state)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list136);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 12591L)
    public static SubLObject reset_l2r_paragraph_reader_sentence_times(final SubLObject reader) {
        _csetf_l2r_paragraph_reader_sentence_time(reader, (SubLObject)learning_reader.ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, (SubLObject)learning_reader.ZERO_INTEGER);
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 12791L)
    public static SubLObject new_l2r_reading_event_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reading_event = (SubLObject)learning_reader.NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)((learning_reader.NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread)) ? learning_reader.$str145$transmit : learning_reader.$str146$store));
            reading_event = l2r_create((SubLObject)learning_reader.$str147$ReadingEvent);
            l2r_assert((SubLObject)ConsesLow.listS(learning_reader.$const148$isa, reading_event, (SubLObject)learning_reader.$list149), learning_reader.$const150$UniversalVocabularyMt);
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const151$startingDate, reading_event, date_utilities.indexical_now()), learning_reader.$const150$UniversalVocabularyMt);
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const152$pcwRead, reading_event, v_document), learning_reader.$const153$LearnByReadingDocumentDataMt);
            l2r_assert((SubLObject)ConsesLow.listS(learning_reader.$const154$performedBy, reading_event, (SubLObject)learning_reader.$list155), learning_reader.$const153$LearnByReadingDocumentDataMt);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return reading_event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 13397L)
    public static SubLObject find_unfinished_l2r_reading_event_for_document(final SubLObject v_document) {
        return ask_utilities.query_variable((SubLObject)learning_reader.$sym156$_READING, (SubLObject)ConsesLow.listS(learning_reader.$const157$and, (SubLObject)learning_reader.$list158, (SubLObject)ConsesLow.list(learning_reader.$const152$pcwRead, (SubLObject)learning_reader.$sym156$_READING, v_document), (SubLObject)learning_reader.$list159), learning_reader.$const160$InferencePSC, (SubLObject)learning_reader.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 13696L)
    public static SubLObject note_l2r_reading_event_ongoing(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const161$temporallySubsumes, reading_event, now), learning_reader.$const150$UniversalVocabularyMt);
        final SubLObject pred_var = learning_reader.$const161$temporallySubsumes;
        if (learning_reader.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, (SubLObject)learning_reader.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, (SubLObject)learning_reader.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)learning_reader.NIL;
            final SubLObject token_var = (SubLObject)learning_reader.NIL;
            while (learning_reader.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (learning_reader.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)learning_reader.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)learning_reader.$kw162$GAF, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL);
                        SubLObject done_var_$6 = (SubLObject)learning_reader.NIL;
                        final SubLObject token_var_$7 = (SubLObject)learning_reader.NIL;
                        while (learning_reader.NIL == done_var_$6) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(gaf));
                            if (learning_reader.NIL != valid_$8 && !assertions_high.gaf_arg2(gaf).equal(now)) {
                                l2r_unassert_assertion(gaf);
                            }
                            done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == valid_$8);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (learning_reader.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == valid);
            }
        }
        return reading_event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 14058L)
    public static SubLObject note_l2r_reading_event_done(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const163$endingDate, reading_event, now), learning_reader.$const150$UniversalVocabularyMt);
        final SubLObject pred_var = learning_reader.$const161$temporallySubsumes;
        if (learning_reader.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, (SubLObject)learning_reader.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, (SubLObject)learning_reader.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)learning_reader.NIL;
            final SubLObject token_var = (SubLObject)learning_reader.NIL;
            while (learning_reader.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (learning_reader.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)learning_reader.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)learning_reader.$kw162$GAF, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL);
                        SubLObject done_var_$9 = (SubLObject)learning_reader.NIL;
                        final SubLObject token_var_$10 = (SubLObject)learning_reader.NIL;
                        while (learning_reader.NIL == done_var_$9) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(gaf));
                            if (learning_reader.NIL != valid_$11) {
                                l2r_unassert_assertion(gaf);
                            }
                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == valid_$11);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (learning_reader.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == valid);
            }
        }
        return reading_event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 14371L)
    public static SubLObject l2r_paragraph_reader_find_or_create_pegs_for_sentence(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = Vectors.aref(l2r_paragraph_reader_sentence_vector(reader), l2r_paragraph_reader_sentence_number(reader));
        _csetf_l2r_paragraph_reader_sentence_number(reader, Numbers.add(l2r_paragraph_reader_sentence_number(reader), (SubLObject)learning_reader.ONE_INTEGER));
        reset_l2r_paragraph_reader_sentence_times(reader);
        SubLObject this_time = (SubLObject)learning_reader.NIL;
        SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)learning_reader.$str164$none);
            final SubLObject old_receive_state = operation_communication.get_receive_state((SubLObject)learning_reader.UNPROVIDED);
            try {
                operation_communication.set_receive_state((SubLObject)learning_reader.$str165$no);
                final SubLObject sentence_html_text = document.sentence_string(sentence);
                final SubLObject sentence_non_html_text = evaluation_defns.cyc_remove_html_tags(sentence_html_text);
                final SubLObject sentence_string_number = number_utilities.f_1X(Sequences.count(sentence_non_html_text, l2r_paragraph_reader_sentence_non_html_texts(reader), Symbols.symbol_function((SubLObject)learning_reader.EQUAL), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED));
                final SubLObject sentence_peg = l2r_find_or_reify_peg_for_sentence_string(sentence_non_html_text, l2r_paragraph_reader_document(reader), l2r_paragraph_reader_paragraph(reader), l2r_paragraph_reader_sentence_number(reader), sentence_string_number);
                final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(l2r_sentence_level_peg_creation_rules(), thread);
                    l2r_assert_source_html(sentence_peg, sentence_html_text, (SubLObject)ConsesLow.list(learning_reader.$const166$InterpretingDocumentMtFn, l2r_paragraph_reader_document(reader)), (SubLObject)learning_reader.UNPROVIDED);
                    l2r_assert_subexpression_links(sentence, sentence_peg, l2r_paragraph_reader_document(reader));
                }
                finally {
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                }
                _csetf_l2r_paragraph_reader_sentence_pegs(reader, (SubLObject)ConsesLow.cons(sentence_peg, l2r_paragraph_reader_sentence_pegs(reader)));
                _csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, (SubLObject)ConsesLow.cons(sentence_non_html_text, l2r_paragraph_reader_sentence_non_html_texts(reader)));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    operation_communication.set_receive_state(old_receive_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
        this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
        _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (learning_reader.NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw115$CREATED_OR_FOUND_SENTENCE_PEGS);
        return l2r_paragraph_reader_sentence_pegs(reader).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 15986L)
    public static SubLObject l2r_paragraph_reader_find_or_assert_linkage(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        SubLObject linkage_or_linkage_fort = (SubLObject)learning_reader.NIL;
        SubLObject content_mt = (SubLObject)learning_reader.NIL;
        SubLObject this_time = (SubLObject)learning_reader.NIL;
        SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)learning_reader.$str164$none);
            thread.resetMultipleValues();
            final SubLObject linkage_or_linkage_fort_$12 = l2r_find_or_assert_linkage_for_peg(sentence_peg);
            final SubLObject content_mt_$13 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            linkage_or_linkage_fort = linkage_or_linkage_fort_$12;
            content_mt = content_mt_$13;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
        this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
        _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (learning_reader.NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        if (learning_reader.NIL != linkage.linkage_p(linkage_or_linkage_fort) && learning_reader.NIL != content_mt) {
            final SubLObject linkage_fort = kb_mapping_utilities.fpred_value_in_any_mt(content_mt, learning_reader.$const168$contentMtOfLinkage, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
            _csetf_l2r_paragraph_reader_linkage(reader, linkage_or_linkage_fort);
            _csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_fort);
            _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw116$ASSERTED_LINKAGE);
        }
        else if (learning_reader.NIL != forts.fort_p(linkage_or_linkage_fort) && learning_reader.NIL != content_mt) {
            _csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_or_linkage_fort);
            _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE);
        }
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 16994L)
    public static SubLObject l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(final SubLObject reader) {
        final SubLObject v_linkage = l2r_paragraph_reader_linkage(reader);
        final SubLObject linkage_fort = l2r_paragraph_reader_linkage_fort(reader);
        final SubLObject content_mt = linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort));
        final SubLObject tokenization = kb_mapping_utilities.fpred_value_in_any_mt(linkage_fort, learning_reader.$const169$linkageTokenization, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        if (learning_reader.NIL == v_linkage) {
            Errors.warn((SubLObject)learning_reader.$str170$Couldn_t_find_linkage_for__S, reader);
        }
        else if (learning_reader.NIL == linkage_fort) {
            Errors.warn((SubLObject)learning_reader.$str171$Couldn_t_find_linkage_FORT_for__S, reader);
        }
        else if (learning_reader.NIL == content_mt) {
            Errors.warn((SubLObject)learning_reader.$str172$Couldn_t_find_content_mt_for__S, linkage_fort);
        }
        else if (learning_reader.NIL == tokenization) {
            Errors.warn((SubLObject)learning_reader.$str173$Couldn_t_find_tokenization_for__S, linkage_fort);
        }
        else if (learning_reader.NIL != l2r_tokenization_has_parse_treeP(tokenization, content_mt)) {
            _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE);
        }
        else {
            SubLObject this_time = (SubLObject)learning_reader.NIL;
            SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
            final SubLObject start = l2r_image_elapsed_cpu_time();
            final SubLObject time_var = Time.get_internal_real_time();
            final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
            try {
                operation_communication.set_transmit_state((SubLObject)learning_reader.$str164$none);
                l2r_assert_parse_tree_for_linkage(v_linkage, tokenization, content_mt);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    operation_communication.set_transmit_state(old_transmit_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
            this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
            _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
            _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
            if (learning_reader.NIL != this_cpu_time) {
                _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
            }
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
            _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 18097L)
    public static SubLObject l2r_tokenization_has_parse_treeP(final SubLObject tokenization, final SubLObject content_mt) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(learning_reader.$const157$and, (SubLObject)ConsesLow.list(learning_reader.$const174$ist_Asserted, content_mt, (SubLObject)ConsesLow.list(learning_reader.$const175$parseTreeOfTokenization, (SubLObject)learning_reader.$sym176$_PARSE_TREE, tokenization)), (SubLObject)learning_reader.$list177), learning_reader.$const160$InferencePSC, (SubLObject)learning_reader.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 18386L)
    public static SubLObject l2r_paragraph_reader_maybe_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        if (learning_reader.NIL == isa.isa_in_any_mtP(sentence_peg, learning_reader.$const178$LinguisticObject_NoParseAvailable) && learning_reader.NIL == kb_mapping_utilities.some_pred_value_in_any_mt(sentence_peg, learning_reader.$const179$pegInterpretationMts, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.UNPROVIDED)) {
            l2r_paragraph_reader_add_parsing_results(reader);
        }
        _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw118$PARSED);
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 18834L)
    public static SubLObject l2r_paragraph_reader_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str180$__Asserting_Cyclifier_results_for, sentence_peg);
        SubLObject this_time = (SubLObject)learning_reader.NIL;
        SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)learning_reader.$str164$none);
            parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
        this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
        _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (learning_reader.NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 19259L)
    public static SubLObject l2r_paragraph_reader_finalize_sentence(final SubLObject reader) {
        SubLObject this_time = (SubLObject)learning_reader.NIL;
        SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = Time.get_internal_real_time();
        l2r_finalize_sentence_peg(l2r_paragraph_reader_sentence_pegs(reader));
        this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
        this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
        _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (learning_reader.NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str181$__Read_sentence___S_in__A___A_of_, new SubLObject[] { l2r_paragraph_reader_sentence_number(reader), l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.UNPROVIDED), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER) });
        final SubLObject new_assertion_count = assertion_handles.assertion_count();
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str182$__After__S_sentences__assertion_c, new SubLObject[] { l2r_paragraph_reader_sentence_number(reader), Numbers.subtract(new_assertion_count, l2r_paragraph_reader_initial_assertion_count(reader)), l2r_paragraph_reader_initial_assertion_count(reader), new_assertion_count });
        write_l2r_image_for_document(l2r_paragraph_reader_document(reader), (SubLObject)learning_reader.NIL);
        _csetf_l2r_paragraph_reader_state(reader, (SubLObject)((learning_reader.NIL != list_utilities.lengthG(l2r_paragraph_reader_sentence_vector(reader), l2r_paragraph_reader_sentence_number(reader), (SubLObject)learning_reader.UNPROVIDED)) ? learning_reader.$kw114$DONE_WITH_SENTENCE : learning_reader.$kw119$DONE_WITH_ALL_SENTENCES));
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 20452L)
    public static SubLObject l2r_finalize_sentence_peg(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = learning_reader.$l2r_finalization_problem_store$.currentBinding(thread);
        try {
            learning_reader.$l2r_finalization_problem_store$.bind((SubLObject)learning_reader.NIL, thread);
            try {
                learning_reader.$l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store((SubLObject)learning_reader.NIL), thread);
                l2r_assert_sentence_peg_results(sentence_pegs.first());
                SubLObject cdolist_list_var = sentence_pegs.rest();
                SubLObject previous_sentence_peg = (SubLObject)learning_reader.NIL;
                previous_sentence_peg = cdolist_list_var.first();
                while (learning_reader.NIL != cdolist_list_var) {
                    l2r_assert_distillation_query_results(previous_sentence_peg);
                    cdolist_list_var = cdolist_list_var.rest();
                    previous_sentence_peg = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            learning_reader.$l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 20783L)
    public static SubLObject l2r_paragraph_reader_collect_garbage(final SubLObject reader) {
        SubLObject this_time = (SubLObject)learning_reader.NIL;
        SubLObject this_cpu_time = (SubLObject)learning_reader.NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = Time.get_internal_real_time();
        l2r_collect_garbage_for_sentence_pegs(l2r_paragraph_reader_sentence_pegs(reader));
        this_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (SubLObject)((learning_reader.NIL != start) ? l2r_image_elapsed_cpu_time() : learning_reader.NIL);
        this_cpu_time = (SubLObject)((learning_reader.NIL != end) ? Numbers.subtract(end, start) : learning_reader.NIL);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, (SubLObject)learning_reader.TWO_INTEGER), (SubLObject)(this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, (SubLObject)learning_reader.ZERO_INTEGER) : learning_reader.$str167$unknown_amount));
        _csetf_l2r_paragraph_reader_total_time(reader, Numbers.add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, Numbers.add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (learning_reader.NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, Numbers.add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, Numbers.add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), (SubLObject)learning_reader.TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), (SubLObject)learning_reader.ZERO_INTEGER));
        _csetf_l2r_paragraph_reader_state(reader, (SubLObject)learning_reader.$kw95$EXHAUSTED);
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 21056L)
    public static SubLObject l2r_collect_garbage_for_sentence_pegs(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = learning_reader.$l2r_finalization_problem_store$.currentBinding(thread);
        try {
            learning_reader.$l2r_finalization_problem_store$.bind((SubLObject)learning_reader.NIL, thread);
            try {
                learning_reader.$l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store((SubLObject)learning_reader.NIL), thread);
                final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
                try {
                    operation_communication.set_transmit_state((SubLObject)((learning_reader.NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread)) ? learning_reader.$str145$transmit : learning_reader.$str146$store));
                    SubLObject cdolist_list_var = sentence_pegs;
                    SubLObject sentence_peg = (SubLObject)learning_reader.NIL;
                    sentence_peg = cdolist_list_var.first();
                    while (learning_reader.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$15 = l2r_garbage_collection_query_specs();
                        SubLObject query_spec = (SubLObject)learning_reader.NIL;
                        query_spec = cdolist_list_var_$15.first();
                        while (learning_reader.NIL != cdolist_list_var_$15) {
                            l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            query_spec = cdolist_list_var_$15.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence_peg = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        operation_communication.set_transmit_state(old_transmit_state);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store(learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            learning_reader.$l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 21484L)
    public static SubLObject l2r_read_paragraph_internal(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event, SubLObject reader) {
        if (reading_event == learning_reader.UNPROVIDED) {
            reading_event = (SubLObject)learning_reader.NIL;
        }
        if (reader == learning_reader.UNPROVIDED) {
            reader = new_l2r_paragraph_reader(paragraph, v_document);
        }
        while (learning_reader.NIL != l2r_paragraph_reader_next_action(reader)) {
            l2r_paragraph_reader_next(reader);
            if (learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
                note_l2r_reading_event_ongoing(reading_event);
            }
        }
        final SubLObject pegs = Sequences.nreverse(l2r_paragraph_reader_sentence_pegs(reader));
        final SubLObject texts = Sequences.nreverse(l2r_paragraph_reader_sentence_non_html_texts(reader));
        return Values.values(pegs, texts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 22018L)
    public static SubLObject l2r_assert_sentence_peg_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)((learning_reader.NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread)) ? learning_reader.$str145$transmit : learning_reader.$str146$store));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)learning_reader.$sym183$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(learning_reader.$const160$InferencePSC, thread);
                SubLObject cdolist_list_var = l2r_finalization_query_specs();
                SubLObject query_spec = (SubLObject)learning_reader.NIL;
                query_spec = cdolist_list_var.first();
                while (learning_reader.NIL != cdolist_list_var) {
                    l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                    cdolist_list_var = cdolist_list_var.rest();
                    query_spec = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 22420L)
    public static SubLObject l2r_assert_query_spec_results_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        SubLObject cdolist_list_var;
        final SubLObject new_terms = cdolist_list_var = l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
        SubLObject new_term = (SubLObject)learning_reader.NIL;
        new_term = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            if (learning_reader.NIL != constant_handles.constant_p(new_term)) {
                fi.fi_eval((SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym184$CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
            }
            else if (learning_reader.NIL != el_utilities.ist_sentence_p(new_term, (SubLObject)learning_reader.UNPROVIDED)) {
                l2r_assert(new_term, (SubLObject)learning_reader.UNPROVIDED);
            }
            else {
                Errors.warn((SubLObject)learning_reader.$str185$Don_t_know_what_to_do_with_finali, new_term);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_term = cdolist_list_var.first();
        }
        return query_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 22916L)
    public static SubLObject l2r_assert_distillation_query_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)((learning_reader.NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread)) ? learning_reader.$str145$transmit : learning_reader.$str146$store));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)learning_reader.$sym183$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(learning_reader.$const160$InferencePSC, thread);
                SubLObject cdolist_list_var = l2r_distillation_query_specs();
                SubLObject query_spec = (SubLObject)learning_reader.NIL;
                query_spec = cdolist_list_var.first();
                while (learning_reader.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$18;
                    final SubLObject new_terms = cdolist_list_var_$18 = l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
                    SubLObject new_term = (SubLObject)learning_reader.NIL;
                    new_term = cdolist_list_var_$18.first();
                    while (learning_reader.NIL != cdolist_list_var_$18) {
                        if (learning_reader.NIL != constant_handles.constant_p(new_term)) {
                            fi.fi_eval((SubLObject)ConsesLow.list((SubLObject)learning_reader.$sym184$CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
                        }
                        else if (learning_reader.NIL != el_utilities.ist_sentence_p(new_term, (SubLObject)learning_reader.UNPROVIDED)) {
                            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str186$__Asserting_distillation_sentence, new_term);
                            l2r_assert(new_term, (SubLObject)learning_reader.UNPROVIDED);
                        }
                        else {
                            Errors.warn((SubLObject)learning_reader.$str185$Don_t_know_what_to_do_with_finali, new_term);
                        }
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        new_term = cdolist_list_var_$18.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    query_spec = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 23636L)
    public static SubLObject l2r_finalization_query_specs() {
        final SubLObject kbq = learning_reader.$const187$TextLearnerQuery_WhatAreTheRequir;
        final SubLObject el_list = (SubLObject)((learning_reader.NIL != constant_handles.valid_constantP(kbq, (SubLObject)learning_reader.UNPROVIDED)) ? kb_query.new_cyc_query_from_kbq(kbq, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED).first() : learning_reader.NIL);
        return (SubLObject)((learning_reader.NIL != el_list) ? Sequences.remove((SubLObject)learning_reader.NIL, Mapping.mapcar((SubLObject)learning_reader.$sym188$KBQ_FROM_QUERY_RUNNING, el_utilities.el_list_items(el_list)), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 24007L)
    public static SubLObject l2r_garbage_collection_query_specs() {
        return isa.all_fort_instances_in_all_mts(learning_reader.$const189$TextLearnerGarbageCollectionQuery);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 24221L)
    public static SubLObject l2r_distillation_query_specs() {
        return isa.all_fort_instances_in_all_mts(learning_reader.$const190$TextLearnerDisambiguationResultsD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 24439L)
    public static SubLObject kbq_from_query_running(final SubLObject query_running) {
        return kb_mapping_utilities.fpred_value_in_any_mt(query_running, learning_reader.$const191$cycLQueryTypeSpecification, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 24575L)
    public static SubLObject l2r_run_finalization_query_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject sentence_peg_indexical = (SubLObject)learning_reader.$list192;
        final SubLObject dereferenced = cycl_utilities.expression_subst(sentence_peg, sentence_peg_indexical, indexical_sentence, Symbols.symbol_function((SubLObject)learning_reader.EQUAL), (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject v_properties = conses_high.putf(kb_query.kbq_query_properties(query_spec), (SubLObject)learning_reader.$kw193$PROBLEM_STORE, learning_reader.$l2r_finalization_problem_store$.getDynamicValue(thread));
        return inference_kernel.new_cyc_query(dereferenced, mt, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25080L)
    public static SubLObject l2r_print_total_time(final SubLObject total_time, final SubLObject sentence_count, SubLObject stream) {
        if (stream == learning_reader.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        PrintLow.format(stream, (SubLObject)learning_reader.$str194$__Read__S_sentences_in__A___, sentence_count, l2r_readable_time_string(total_time, (SubLObject)learning_reader.UNPROVIDED));
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25316L)
    public static SubLObject l2r_readable_time_string(final SubLObject seconds, SubLObject decimal_precision) {
        if (decimal_precision == learning_reader.UNPROVIDED) {
            decimal_precision = (SubLObject)learning_reader.TWO_INTEGER;
        }
        return numeric_date_utilities.readable_elapsed_time_string(seconds, decimal_precision);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25466L)
    public static SubLObject launch_long_inference_warner() {
        return process_utilities.make_cyc_server_process_with_args((SubLObject)learning_reader.$str195$Long_Inference_Warner, (SubLObject)learning_reader.$sym196$WARN_ABOUT_LONG_INFERENCES, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 25728L)
    public static SubLObject warn_about_long_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject ignore_errors_tag = (SubLObject)learning_reader.NIL;
            try {
                thread.throwStack.push(learning_reader.$kw198$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)learning_reader.$sym199$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject current_long_inference = learning_reader.$current_long_inference_info$.getDynamicValue(thread).first();
                        final SubLObject current_inference_runningP = inference_datastructures_inference.running_inference_p(current_long_inference);
                        final SubLObject inference = (learning_reader.NIL != current_inference_runningP) ? current_long_inference : inference_utilities.latest_inference();
                        final SubLObject elapsed_time = (SubLObject)((learning_reader.NIL != inference_datastructures_inference.running_inference_p(inference)) ? inference_datastructures_inference.inference_elapsed_universal_time_since_start(inference) : learning_reader.ZERO_INTEGER);
                        if (learning_reader.NIL != learning_reader.$current_long_inference_info$.getDynamicValue(thread) && !inference.eql(learning_reader.$current_long_inference_info$.getDynamicValue(thread).first())) {
                            Errors.warn((SubLObject)learning_reader.$str200$_S_finished_after__A_with__S_answ, current_long_inference, l2r_readable_time_string(conses_high.second(learning_reader.$current_long_inference_info$.getDynamicValue(thread)), (SubLObject)learning_reader.UNPROVIDED), conses_high.third(learning_reader.$current_long_inference_info$.getDynamicValue(thread)));
                            learning_reader.$current_long_inference_info$.setDynamicValue((SubLObject)learning_reader.NIL, thread);
                        }
                        if (!elapsed_time.numL(learning_reader.$long_inference_cutoff$.getGlobalValue())) {
                            if (inference.eql(learning_reader.$current_long_inference_info$.getDynamicValue(thread).first())) {
                                ConsesLow.rplacd(learning_reader.$current_long_inference_info$.getDynamicValue(thread), (SubLObject)ConsesLow.list(elapsed_time, inference_datastructures_inference.inference_answer_count(inference)));
                            }
                            else {
                                Errors.warn((SubLObject)learning_reader.$str201$_S_has_taken__A_so_far____HL_quer, new SubLObject[] { inference, l2r_readable_time_string(elapsed_time, (SubLObject)learning_reader.UNPROVIDED), inference_datastructures_inference.inference_hl_query(inference), inference_datastructures_inference.inference_answer_count(inference) });
                                learning_reader.$current_long_inference_info$.setDynamicValue((SubLObject)ConsesLow.list(inference, elapsed_time, inference_datastructures_inference.inference_answer_count(inference)), thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)learning_reader.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)learning_reader.$kw198$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            Threads.sleep(Numbers.divide(learning_reader.$long_inference_cutoff$.getGlobalValue(), (SubLObject)learning_reader.TWO_INTEGER));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 27134L)
    public static SubLObject l2r_read_document_sentence(final SubLObject sentence, final SubLObject v_document) {
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(sentence) : sentence;
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        final SubLObject sentence_peg = l2r_reify_peg_for_sentence(sentence, v_document);
        final SubLObject result = l2r_read_sentence_for_peg(sentence_peg);
        write_l2r_image_for_document(v_document, (SubLObject)learning_reader.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 27570L)
    public static SubLObject l2r_read_sentence_for_peg(final SubLObject sentence_peg) {
        l2r_assert_linkage_for_peg(sentence_peg);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str180$__Asserting_Cyclifier_results_for, sentence_peg);
        parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        return sentence_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 27930L)
    public static SubLObject l2r_find_or_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) : sentence_peg;
        thread.resetMultipleValues();
        SubLObject v_linkage = l2r_find_linkage_for_peg(sentence_peg);
        SubLObject content_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (learning_reader.NIL == v_linkage || learning_reader.NIL == content_mt) {
            thread.resetMultipleValues();
            final SubLObject v_linkage_$19 = l2r_assert_linkage_for_peg(sentence_peg);
            final SubLObject content_mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_linkage = v_linkage_$19;
            content_mt = content_mt_$20;
        }
        return Values.values(v_linkage, content_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 28308L)
    public static SubLObject l2r_find_linkage_for_peg(final SubLObject sentence_peg) {
        assert learning_reader.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) : sentence_peg;
        final SubLObject tokenization = l2r_find_tokenization_for_peg(sentence_peg);
        final SubLObject linkage_fort = (SubLObject)((learning_reader.NIL != kb_indexing_datastructures.indexed_term_p(tokenization)) ? kb_mapping_utilities.fpred_value_in_any_mt(tokenization, learning_reader.$const169$linkageTokenization, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
        final SubLObject content_mt = (SubLObject)((learning_reader.NIL != linkage_fort) ? linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort)) : learning_reader.NIL);
        return (learning_reader.NIL != l2r_tokenization_has_parse_treeP(tokenization, content_mt)) ? Values.values(linkage_fort, content_mt) : Values.values((SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 28852L)
    public static SubLObject l2r_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) : sentence_peg;
        cb_wordnet_utilities.ensure_wn_sks_registered();
        SubLObject v_linkage = (SubLObject)learning_reader.NIL;
        SubLObject content_mt = (SubLObject)learning_reader.NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)learning_reader.$str164$none);
            final SubLObject sentence_text = l2r_sentence_peg_text(sentence_peg);
            final SubLObject linkage_tokenization = l2r_new_tokenization_shell_for_peg(sentence_peg, sentence_text);
            final SubLObject _prev_bind_0 = parsing_vars.$linkage_creation_rules$.currentBinding(thread);
            try {
                parsing_vars.$linkage_creation_rules$.bind(l2r_linkage_creation_rules(), thread);
                final SubLObject link_parse_options = conses_high.putf(conses_high.copy_list(linkage.$link_parse_options$.getDynamicValue(thread)), (SubLObject)learning_reader.$kw203$MAX_PARSE_TIME, (SubLObject)learning_reader.$int204$180);
                PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str205$__Asserting_linkage_for__S___S___, sentence_peg, sentence_text);
                thread.resetMultipleValues();
                final SubLObject v_linkage_$21 = linkage_assertion.assert_linkage(sentence_text, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL, linkage_tokenization, link_parse_options);
                final SubLObject content_mt_$22 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_linkage = v_linkage_$21;
                content_mt = content_mt_$22;
            }
            finally {
                parsing_vars.$linkage_creation_rules$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values(v_linkage, content_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 29634L)
    public static SubLObject l2r_assert_parse_tree_for_linkage(final SubLObject v_linkage, final SubLObject tokenization, final SubLObject content_mt) {
        return linkage_assertion.assert_link_parse_tree(v_linkage, tokenization, content_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 29787L)
    public static SubLObject l2r_linkage_creation_rules() {
        return forward.creation_template_allowable_rules(learning_reader.$const206$L2RLinkageReificationTemplate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 29912L)
    public static SubLObject l2r_new_tokenization_shell_for_peg(final SubLObject sentence_peg, final SubLObject sentence_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokenization = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)learning_reader.NIL, thread);
            tokenization = l2r_create((SubLObject)learning_reader.$str207$Tokenization);
            l2r_assert((SubLObject)ConsesLow.listS(learning_reader.$const148$isa, tokenization, (SubLObject)learning_reader.$list208), learning_reader.$const150$UniversalVocabularyMt);
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const209$tokenizationInputString, tokenization, sentence_text), (SubLObject)learning_reader.UNPROVIDED);
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const210$pegTokenizations, sentence_peg, tokenization), (SubLObject)ConsesLow.list(learning_reader.$const211$ContentModelForPegFn, sentence_peg));
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return tokenization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 30500L)
    public static SubLObject l2r_find_tokenization_for_peg(final SubLObject sentence_peg) {
        return ask_utilities.query_variable((SubLObject)learning_reader.$sym212$_TOKENIZATION, (SubLObject)ConsesLow.listS(learning_reader.$const210$pegTokenizations, sentence_peg, (SubLObject)learning_reader.$list213), (SubLObject)ConsesLow.list(learning_reader.$const211$ContentModelForPegFn, sentence_peg), (SubLObject)learning_reader.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 30708L)
    public static SubLObject l2r_sentence_peg_text(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = parsing_utilities.peg_text(sentence_peg);
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == unicode_nauts.string_or_unicode_naut_p(text)) {
            Errors.error((SubLObject)learning_reader.$str214$Couldn_t_find_string_for__S, sentence_peg);
        }
        return text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 30912L)
    public static SubLObject l2r_reader_image_find_or_create_document_reader() {
        SubLObject document_reader = get_l2r_reader_image_document_reader();
        if (learning_reader.NIL == l2r_document_reader_p(document_reader)) {
            final SubLObject v_document = l2r_pick_document_to_read();
            if (learning_reader.NIL == cycl_grammar.cycl_denotational_term_p(v_document)) {
                Errors.warn((SubLObject)learning_reader.$str215$Couldn_t_find_L2R_document_to_rea);
                return (SubLObject)learning_reader.NIL;
            }
            document_reader = l2r_new_reader_for_document(v_document);
        }
        return document_reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31355L)
    public static SubLObject l2r_new_reader_for_document(final SubLObject v_document) {
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        final SubLObject existing_reading_event = find_unfinished_l2r_reading_event_for_document(v_document);
        final SubLObject reading_event = (learning_reader.NIL != existing_reading_event) ? existing_reading_event : new_l2r_reading_event_for_document(v_document);
        final SubLObject document_reader = new_l2r_document_reader(v_document, reading_event);
        return document_reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_l2r_document_reader(v_object, stream, (SubLObject)learning_reader.ZERO_INTEGER);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $l2r_document_reader_native.class) ? learning_reader.T : learning_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_document(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_remaining_paragraphs(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_read_paragraphs(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_paragraph_reader(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject l2r_document_reader_reading_event(final SubLObject v_object) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject _csetf_l2r_document_reader_document(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject _csetf_l2r_document_reader_remaining_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject _csetf_l2r_document_reader_read_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject _csetf_l2r_document_reader_paragraph_reader(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject _csetf_l2r_document_reader_reading_event(final SubLObject v_object, final SubLObject value) {
        assert learning_reader.NIL != l2r_document_reader_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject make_l2r_document_reader(SubLObject arglist) {
        if (arglist == learning_reader.UNPROVIDED) {
            arglist = (SubLObject)learning_reader.NIL;
        }
        final SubLObject v_new = (SubLObject)new $l2r_document_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)learning_reader.NIL, next = arglist; learning_reader.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)learning_reader.$kw72$DOCUMENT)) {
                _csetf_l2r_document_reader_document(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw235$REMAINING_PARAGRAPHS)) {
                _csetf_l2r_document_reader_remaining_paragraphs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw236$READ_PARAGRAPHS)) {
                _csetf_l2r_document_reader_read_paragraphs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw237$PARAGRAPH_READER)) {
                _csetf_l2r_document_reader_paragraph_reader(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)learning_reader.$kw238$READING_EVENT)) {
                _csetf_l2r_document_reader_reading_event(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)learning_reader.$str86$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject visit_defstruct_l2r_document_reader(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw87$BEGIN, (SubLObject)learning_reader.$sym239$MAKE_L2R_DOCUMENT_READER, (SubLObject)learning_reader.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw72$DOCUMENT, l2r_document_reader_document(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw235$REMAINING_PARAGRAPHS, l2r_document_reader_remaining_paragraphs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw236$READ_PARAGRAPHS, l2r_document_reader_read_paragraphs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw237$PARAGRAPH_READER, l2r_document_reader_paragraph_reader(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw89$SLOT, (SubLObject)learning_reader.$kw238$READING_EVENT, l2r_document_reader_reading_event(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)learning_reader.$kw90$END, (SubLObject)learning_reader.$sym239$MAKE_L2R_DOCUMENT_READER, (SubLObject)learning_reader.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31754L)
    public static SubLObject visit_defstruct_object_l2r_document_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_l2r_document_reader(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 31926L)
    public static SubLObject print_l2r_document_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)learning_reader.$str241$_L2R_DOCUMENT_READER__S_, l2r_document_reader_document(reader));
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 32109L)
    public static SubLObject new_l2r_document_reader(final SubLObject v_document, final SubLObject reading_event) {
        final SubLObject reader = make_l2r_document_reader((SubLObject)learning_reader.UNPROVIDED);
        _csetf_l2r_document_reader_document(reader, v_document);
        _csetf_l2r_document_reader_reading_event(reader, reading_event);
        _csetf_l2r_document_reader_remaining_paragraphs(reader, l2r_find_or_create_document_paragraphs(v_document, (SubLObject)learning_reader.UNPROVIDED));
        return reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 32544L)
    public static SubLObject get_l2r_reader_image_document_reader() {
        return learning_reader.$l2r_reader_image_document_reader$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 32645L)
    public static SubLObject set_l2r_reader_image_document_reader(final SubLObject reader) {
        learning_reader.$l2r_reader_image_document_reader$.setGlobalValue(reader);
        return learning_reader.$l2r_reader_image_document_reader$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 32804L)
    public static SubLObject l2r_document_reader_read_document(final SubLObject document_reader) {
        SubLObject paragraph_reader = l2r_document_reader_find_or_create_paragraph_reader(document_reader);
        final SubLObject reading_event = l2r_document_reader_reading_event(document_reader);
        final SubLObject v_document = l2r_document_reader_document(document_reader);
        while (learning_reader.NIL != l2r_paragraph_reader_p(paragraph_reader)) {
            final SubLObject paragraph = l2r_paragraph_reader_paragraph(paragraph_reader);
            l2r_read_paragraph_internal(paragraph, v_document, reading_event, paragraph_reader);
            _csetf_l2r_document_reader_read_paragraphs(document_reader, (SubLObject)ConsesLow.cons(paragraph, l2r_document_reader_read_paragraphs(document_reader)));
            _csetf_l2r_document_reader_remaining_paragraphs(document_reader, l2r_document_reader_remaining_paragraphs(document_reader).rest());
            paragraph_reader = l2r_document_reader_get_new_paragraph_reader(document_reader);
        }
        set_l2r_reader_image_document_reader((SubLObject)learning_reader.NIL);
        write_l2r_image_for_document(v_document, (SubLObject)learning_reader.T);
        return document_reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 33681L)
    public static SubLObject l2r_document_reader_find_or_create_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = l2r_document_reader_paragraph_reader(document_reader);
        if (learning_reader.NIL == l2r_paragraph_reader_p(paragraph_reader)) {
            paragraph_reader = l2r_document_reader_get_new_paragraph_reader(document_reader);
        }
        return paragraph_reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 34035L)
    public static SubLObject l2r_document_reader_get_new_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = (SubLObject)learning_reader.NIL;
        final SubLObject remaining_paragraphs = l2r_document_reader_remaining_paragraphs(document_reader);
        if (learning_reader.NIL == list_utilities.empty_list_p(remaining_paragraphs)) {
            final SubLObject paragraph = remaining_paragraphs.first();
            final SubLObject v_document = l2r_document_reader_document(document_reader);
            paragraph_reader = new_l2r_paragraph_reader(paragraph, v_document);
            _csetf_l2r_document_reader_paragraph_reader(document_reader, paragraph_reader);
        }
        return paragraph_reader;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 34584L)
    public static SubLObject l2r_pick_document_to_read() {
        final SubLObject all_articles = kb_query.new_cyc_query_from_kbq(learning_reader.$const243$TextLearnerQuery_FindWikipediaArt, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject articles_already_started = list_utilities.find_all_if((SubLObject)learning_reader.$sym244$FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT, all_articles, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject picked_document = (learning_reader.NIL != list_utilities.non_empty_list_p(articles_already_started)) ? list_utilities.extremal(articles_already_started, (SubLObject)learning_reader.$sym245$STARTS_BEFORE_STARTING_OF_, (SubLObject)learning_reader.$sym244$FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT) : all_articles.first();
        return picked_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 35137L)
    public static SubLObject starts_before_starting_ofP(final SubLObject temp_thing1, final SubLObject temp_thing2) {
        return sbhl_time_modules.starts_after_starting_ofP(temp_thing2, temp_thing1, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 35268L)
    public static SubLObject l2r_image_file(final SubLObject v_document, SubLObject doneP) {
        if (doneP == learning_reader.UNPROVIDED) {
            doneP = (SubLObject)learning_reader.NIL;
        }
        final SubLObject machine_name = misc_utilities.machine_name();
        final SubLObject directory = Sequences.cconcatenate((SubLObject)learning_reader.$str246$_host_, new SubLObject[] { format_nil.format_nil_a_no_copy(machine_name), learning_reader.$str247$_scratch_ });
        assert learning_reader.NIL != Filesys.directory_p(directory) : directory;
        final SubLObject parent_directory = file_utilities.relative_filename(directory, (SubLObject)learning_reader.$str249$l2r_images_, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject subdirectory = file_utilities.relative_filename(parent_directory, (SubLObject)((learning_reader.NIL != doneP) ? learning_reader.$str250$done_ : learning_reader.$str251$ongoing_), (SubLObject)learning_reader.UNPROVIDED);
        if (learning_reader.NIL == Filesys.directory_p(subdirectory)) {
            file_utilities.make_directory_recursive(subdirectory, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.UNPROVIDED);
        }
        if (learning_reader.NIL == Filesys.directory_p(subdirectory)) {
            Threads.sleep((SubLObject)learning_reader.ONE_INTEGER);
            assert learning_reader.NIL != Filesys.directory_p(subdirectory) : subdirectory;
        }
        final SubLObject document_title = kb_mapping_utilities.fpred_value_in_any_mt(v_document, learning_reader.$const252$referenceWorkEntryTitle, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject local_filename = Strings.string_downcase(document_title.isString() ? list_utilities.remove_if_not((SubLObject)learning_reader.$sym253$ALPHA_CHAR_P, document_title, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) : ((learning_reader.NIL != constant_handles.constant_p(v_document)) ? constants_high.constant_name(v_document) : list_utilities.remove_if_not((SubLObject)learning_reader.$sym253$ALPHA_CHAR_P, print_high.princ_to_string(v_document), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        return file_utilities.relative_filename(subdirectory, local_filename, (SubLObject)learning_reader.$str254$load);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 36244L)
    public static SubLObject write_l2r_image_for_document(final SubLObject v_document, SubLObject doneP) {
        if (doneP == learning_reader.UNPROVIDED) {
            doneP = (SubLObject)learning_reader.NIL;
        }
        final SubLObject image_file = l2r_image_file(v_document, doneP);
        final SubLObject communication_mode = operation_communication.communication_mode();
        operation_communication.write_cyc_image(image_file, (SubLObject)learning_reader.UNPROVIDED);
        operation_communication.set_communication_mode(communication_mode);
        agenda.restart_agenda((SubLObject)learning_reader.UNPROVIDED);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str255$Saved_image_file_to__S, image_file);
        return image_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 36592L)
    public static SubLObject l2r_find_or_create_document_paragraphs(final SubLObject v_document, SubLObject download) {
        if (download == learning_reader.UNPROVIDED) {
            download = (SubLObject)learning_reader.NIL;
        }
        SubLObject ais = ask_utilities.query_variable((SubLObject)learning_reader.$sym256$_AIS, (SubLObject)ConsesLow.listS(learning_reader.$const257$correspondingAIS, v_document, (SubLObject)learning_reader.$list258), learning_reader.$const160$InferencePSC, (SubLObject)learning_reader.$list259).first();
        final SubLObject webpageP = isa.isa_in_any_mtP(v_document, learning_reader.$const260$WorldWideWebPage_PCW);
        if (learning_reader.NIL != webpageP && learning_reader.NIL == ais) {
            l2r_assert((SubLObject)learning_reader.$list261, (SubLObject)learning_reader.UNPROVIDED);
            ais = narts_high.find_nart((SubLObject)ConsesLow.list(learning_reader.$const262$AISForFn, v_document));
        }
        if (learning_reader.NIL != ais && learning_reader.NIL != webpageP) {
            return l2r_find_or_create_webpage_paragraphs(v_document, ais, download);
        }
        Errors.warn((SubLObject)learning_reader.$str263$Don_t_know_how_to_read__S_, v_document);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 37277L)
    public static SubLObject l2r_find_or_create_webpage_paragraphs(final SubLObject webpage_pcw, final SubLObject ais, SubLObject download) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (learning_reader.NIL == download) {
            download = l2r_most_recent_webpage_download(ais);
        }
        final SubLObject already_downloadedP = list_utilities.sublisp_boolean(download);
        SubLObject interpretation_mt = narts_high.nart_substitute((SubLObject)ConsesLow.list(learning_reader.$const166$InterpretingDocumentMtFn, webpage_pcw));
        SubLObject paragraphs = (SubLObject)learning_reader.NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state((SubLObject)learning_reader.UNPROVIDED);
        try {
            operation_communication.set_transmit_state((SubLObject)((learning_reader.NIL != learning_reader.$l2r_transmit_operationsP$.getDynamicValue(thread)) ? learning_reader.$str145$transmit : learning_reader.$str146$store));
            if (learning_reader.NIL == nart_handles.nart_p(interpretation_mt)) {
                l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const264$retainTerm, interpretation_mt), (SubLObject)learning_reader.UNPROVIDED);
                interpretation_mt = narts_high.find_nart(interpretation_mt);
            }
            assert learning_reader.NIL != nart_handles.nart_p(interpretation_mt) : interpretation_mt;
            if (learning_reader.NIL == download) {
                download = l2r_download_webpage(ais);
            }
            paragraphs = (SubLObject)((learning_reader.NIL != already_downloadedP) ? l2r_find_webpage_paragraphs(ais, download, interpretation_mt) : learning_reader.NIL);
            if (learning_reader.NIL != list_utilities.empty_list_p(paragraphs)) {
                paragraphs = l2r_reify_webpage_paragraphs(ais, download, interpretation_mt);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return paragraphs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 38212L)
    public static SubLObject l2r_download_webpage(final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != forts.fort_p(webpage_ais) : webpage_ais;
        final SubLObject existing = l2r_most_recent_webpage_download(webpage_ais);
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL != existing) {
            Errors.error((SubLObject)learning_reader.$str267$_S___has_already_been_downloaded_, webpage_ais, existing);
        }
        final SubLObject url = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$const268$webPageURL, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject download_time = date_utilities.indexical_now();
        final SubLObject html_source = (SubLObject)((learning_reader.NIL != url) ? evaluation_defns.cyc_url_source(url) : learning_reader.NIL);
        final SubLObject downloading_event = (SubLObject)((learning_reader.NIL != html_source) ? l2r_create((SubLObject)learning_reader.$str269$WebpageDownload) : learning_reader.NIL);
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == url) {
            Errors.error((SubLObject)learning_reader.$str270$_S_doesn_t_have_a___webPageURL_as, webpage_ais);
        }
        if (learning_reader.NIL != downloading_event) {
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const148$isa, downloading_event, (SubLObject)ConsesLow.list(learning_reader.$const271$DownloadTypeOfAISFn, webpage_ais)), learning_reader.$const150$UniversalVocabularyMt);
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const272$dateOfEvent, downloading_event, download_time), learning_reader.$const1$BaseKB);
            if (learning_reader.NIL == ke.cyclist_is_guest()) {
                l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const273$directingAgent, downloading_event, operation_communication.the_cyclist()), learning_reader.$const274$CyclistsMt);
            }
            l2r_assert((SubLObject)ConsesLow.list(learning_reader.$const275$transferredAIS, downloading_event, html_source), learning_reader.$const1$BaseKB);
        }
        return downloading_event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 39437L)
    public static SubLObject l2r_most_recent_webpage_download(final SubLObject webpage_ais) {
        final SubLObject download_type = narts_high.find_nart((SubLObject)ConsesLow.list(learning_reader.$const271$DownloadTypeOfAISFn, webpage_ais));
        final SubLObject all_downloads = (SubLObject)((learning_reader.NIL != download_type) ? isa.all_fort_instances_in_all_mts(download_type) : learning_reader.NIL);
        SubLObject most_recent_date = (SubLObject)learning_reader.NIL;
        SubLObject most_recent_download = (SubLObject)learning_reader.NIL;
        SubLObject cdolist_list_var = all_downloads;
        SubLObject download = (SubLObject)learning_reader.NIL;
        download = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            final SubLObject this_download_date = kb_mapping_utilities.fpred_value_in_any_mt(download, learning_reader.$const272$dateOfEvent, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.UNPROVIDED);
            if (learning_reader.NIL == most_recent_download || learning_reader.NIL == most_recent_date) {
                most_recent_download = download;
                most_recent_date = this_download_date;
            }
            else if (learning_reader.NIL != this_download_date && learning_reader.NIL != date_utilities.dateL(most_recent_date, this_download_date)) {
                most_recent_download = download;
                most_recent_date = this_download_date;
            }
            cdolist_list_var = cdolist_list_var.rest();
            download = cdolist_list_var.first();
        }
        return Values.values(most_recent_download, most_recent_date);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 40225L)
    public static SubLObject l2r_find_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == learning_reader.UNPROVIDED) {
            download = (SubLObject)learning_reader.NIL;
        }
        if (mt == learning_reader.UNPROVIDED) {
            mt = (SubLObject)learning_reader.NIL;
        }
        assert learning_reader.NIL != forts.fort_p(webpage_ais) : webpage_ais;
        if (learning_reader.NIL == download) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        SubLObject paragraphs = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL != download) {
            if (learning_reader.NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$const257$correspondingAIS, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.UNPROVIDED);
                assert learning_reader.NIL != forts.fort_p(v_document) : v_document;
                mt = narts_high.find_nart((SubLObject)ConsesLow.list(learning_reader.$const166$InterpretingDocumentMtFn, v_document));
                assert learning_reader.NIL != nart_handles.nart_p(mt) : mt;
            }
            final SubLObject data = ask_utilities.query_template((SubLObject)learning_reader.$list276, (SubLObject)ConsesLow.list(learning_reader.$const277$nthOccurrenceOfStructureTypeInStr, (SubLObject)learning_reader.$sym278$_PARAGRAPH, (SubLObject)learning_reader.$sym279$_N, learning_reader.$const280$NLParagraph, webpage_ais), mt, (SubLObject)learning_reader.$list281);
            paragraphs = Mapping.mapcar(Symbols.symbol_function((SubLObject)learning_reader.$sym282$CAR), list_utilities.sort_alist_by_values(data, Symbols.symbol_function((SubLObject)learning_reader.$sym283$_)));
        }
        return paragraphs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 41015L)
    public static SubLObject l2r_reify_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == learning_reader.UNPROVIDED) {
            download = (SubLObject)learning_reader.NIL;
        }
        if (mt == learning_reader.UNPROVIDED) {
            mt = (SubLObject)learning_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != forts.fort_p(webpage_ais) : webpage_ais;
        if (learning_reader.NIL == download) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        if (learning_reader.NIL == download) {
            download = l2r_download_webpage(webpage_ais);
        }
        final SubLObject source_html = l2r_best_webpage_source(webpage_ais, download);
        SubLObject paragraphs = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL != source_html) {
            final SubLObject paragraph_texts = l2r_identify_webpage_paragraphs(source_html, webpage_ais);
            if (learning_reader.NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, learning_reader.$const257$correspondingAIS, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.UNPROVIDED);
                assert learning_reader.NIL != forts.fort_p(v_document) : v_document;
                mt = (SubLObject)ConsesLow.list(learning_reader.$const166$InterpretingDocumentMtFn, v_document);
            }
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)learning_reader.$str284$Reifying_paragraphs_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(webpage_ais), learning_reader.$str285$___ }));
                    SubLObject paragraph_num = (SubLObject)learning_reader.ONE_INTEGER;
                    final SubLObject paragraph_count = Sequences.length(paragraph_texts);
                    SubLObject cdolist_list_var = paragraph_texts;
                    SubLObject paragraph_text = (SubLObject)learning_reader.NIL;
                    paragraph_text = cdolist_list_var.first();
                    while (learning_reader.NIL != cdolist_list_var) {
                        final SubLObject paragraph = l2r_reify_one_webpage_paragraph(paragraph_num, paragraph_text, webpage_ais, mt);
                        if (learning_reader.NIL != forts.fort_p(paragraph)) {
                            paragraphs = (SubLObject)ConsesLow.cons(paragraph, paragraphs);
                        }
                        utilities_macros.note_percent_progress(paragraph_num, paragraph_count);
                        paragraph_num = Numbers.add(paragraph_num, (SubLObject)learning_reader.ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        paragraph_text = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
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
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(paragraphs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 42219L)
    public static SubLObject l2r_identify_webpage_paragraphs(final SubLObject source_html, final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_html, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject source_subl_string = (learning_reader.NIL != unicodeP) ? cycl_utilities.nat_arg1(source_html, (SubLObject)learning_reader.UNPROVIDED) : source_html;
        SubLObject paragraph_texts = (SubLObject)learning_reader.NIL;
        SubLObject doneP = Types.sublisp_null(source_html);
        if (learning_reader.NIL == string_utilities.substringP((SubLObject)learning_reader.$str286$_p_, source_subl_string, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
            Errors.warn((SubLObject)learning_reader.$str287$_S_doesn_t_have_any_recognizable_, webpage_ais);
            doneP = (SubLObject)learning_reader.T;
        }
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)learning_reader.$str288$Identifying_paragraphs_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(webpage_ais), learning_reader.$str285$___ }));
                SubLObject start = (SubLObject)learning_reader.ZERO_INTEGER;
                final SubLObject total_length = Sequences.length(source_subl_string);
                SubLObject paragraph_text = (SubLObject)learning_reader.NIL;
                while (learning_reader.NIL == doneP) {
                    thread.resetMultipleValues();
                    final SubLObject paragraph_text_$24 = l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, start);
                    final SubLObject start_$25 = thread.secondMultipleValue();
                    final SubLObject doneP_$26 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    paragraph_text = paragraph_text_$24;
                    start = start_$25;
                    doneP = doneP_$26;
                    if (learning_reader.NIL != unicode_nauts.string_or_unicode_naut_p(paragraph_text)) {
                        paragraph_texts = (SubLObject)ConsesLow.cons(paragraph_text, paragraph_texts);
                    }
                    if (learning_reader.NIL == doneP) {
                        utilities_macros.note_percent_progress(start, total_length);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(paragraph_texts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 43184L)
    public static SubLObject l2r_find_next_webpage_paragraph(final SubLObject source_subl_string, final SubLObject webpage_ais, final SubLObject unicodeP, final SubLObject start) {
        final SubLObject start_pos = Sequences.search((SubLObject)learning_reader.$str286$_p_, source_subl_string, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), Symbols.symbol_function((SubLObject)learning_reader.IDENTITY), (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.NIL, start, (SubLObject)learning_reader.NIL);
        final SubLObject end_pos = (SubLObject)((learning_reader.NIL != start_pos) ? Sequences.search((SubLObject)learning_reader.$str289$__p_, source_subl_string, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), Symbols.symbol_function((SubLObject)learning_reader.IDENTITY), (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.NIL, start_pos, (SubLObject)learning_reader.NIL) : learning_reader.NIL);
        final SubLObject new_start = (SubLObject)learning_reader.NIL;
        SubLObject recurseP = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL == end_pos) {
            return Values.values((SubLObject)learning_reader.NIL, new_start, (SubLObject)learning_reader.T);
        }
        if (learning_reader.NIL != string_utilities.substringP((SubLObject)learning_reader.$str290$script, source_subl_string, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), start_pos, end_pos)) {
            recurseP = (SubLObject)learning_reader.T;
        }
        else {
            final SubLObject raw_paragraph_text = string_utilities.substring(source_subl_string, Numbers.add(start_pos, (SubLObject)learning_reader.THREE_INTEGER), Numbers.subtract(end_pos, (SubLObject)learning_reader.ZERO_INTEGER));
            final SubLObject paragraph_text = (learning_reader.NIL != unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(raw_paragraph_text) : raw_paragraph_text;
            final SubLObject tagless_text = evaluation_defns.cyc_remove_html_tags(paragraph_text);
            if (learning_reader.NIL != string_utilities.empty_string_p(tagless_text)) {
                Errors.warn((SubLObject)learning_reader.$str291$No_non_tagged_text_in__S, paragraph_text);
                recurseP = (SubLObject)learning_reader.T;
            }
            else {
                if (learning_reader.NIL != lexicon_accessors.contains_closed_lexical_class_wordP((learning_reader.NIL != unicode_nauts.unicode_naut_p(tagless_text, (SubLObject)learning_reader.UNPROVIDED)) ? cycl_utilities.nat_arg1(tagless_text, (SubLObject)learning_reader.UNPROVIDED) : tagless_text)) {
                    return Values.values(paragraph_text, end_pos, (SubLObject)learning_reader.NIL);
                }
                Errors.warn((SubLObject)learning_reader.$str292$No_closed_class_words_in__S, tagless_text);
                recurseP = (SubLObject)learning_reader.T;
            }
        }
        if (learning_reader.NIL != recurseP) {
            return l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, end_pos);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 44557L)
    public static SubLObject l2r_reify_one_webpage_paragraph(final SubLObject paragraph_num, final SubLObject paragraph_text, final SubLObject webpage_ais, final SubLObject mt) {
        final SubLObject paragraph_naut = (SubLObject)ConsesLow.list(learning_reader.$const293$NthOccurrenceOfStructureTypeInStr, paragraph_num, learning_reader.$const280$NLParagraph, webpage_ais);
        l2r_assert_source_html(paragraph_naut, paragraph_text, mt, (SubLObject)learning_reader.T);
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str294$___S___S__, paragraph_num, evaluation_defns.cyc_remove_html_tags(paragraph_text));
        return narts_high.find_nart(paragraph_naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 44969L)
    public static SubLObject l2r_best_webpage_source(final SubLObject webpage_ais, SubLObject download) {
        if (download == learning_reader.UNPROVIDED) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        final SubLObject download_text = (SubLObject)((learning_reader.NIL != download) ? kb_mapping_utilities.fpred_value_in_any_mt(download, learning_reader.$const275$transferredAIS, (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)learning_reader.TWO_INTEGER, (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
        final SubLObject source_html = (learning_reader.NIL != download_text) ? download_text : l2r_get_source_html(webpage_ais);
        return source_html;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 45300L)
    public static SubLObject l2r_reify_sentence_level_pegs_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = l2r_sentences_for_document(v_document);
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject sentence_pegs = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)learning_reader.NIL;
            sentence = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                final SubLObject new_peg = l2r_create((SubLObject)learning_reader.$str295$SentenceLevelPeg);
                SubLObject cdolist_list_var_$28 = l2r_sentence_level_peg_creation_template_sentences();
                SubLObject template_sentence = (SubLObject)learning_reader.NIL;
                template_sentence = cdolist_list_var_$28.first();
                while (learning_reader.NIL != cdolist_list_var_$28) {
                    final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL);
                    l2r_assert(dereferenced, (SubLObject)learning_reader.UNPROVIDED);
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    template_sentence = cdolist_list_var_$28.first();
                }
                sentence_pegs = (SubLObject)ConsesLow.cons(new_peg, sentence_pegs);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(sentence_pegs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 46094L)
    public static SubLObject l2r_reify_peg_for_sentence(final SubLObject sentence, final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(sentence) : sentence;
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject new_peg = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            final SubLObject _prev_bind_0_$29 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
                new_peg = l2r_create((SubLObject)learning_reader.$str295$SentenceLevelPeg);
            }
            finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$29, thread);
            }
            SubLObject cdolist_list_var = l2r_sentence_level_peg_creation_template_sentences();
            SubLObject template_sentence = (SubLObject)learning_reader.NIL;
            template_sentence = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL);
                l2r_assert(dereferenced, (SubLObject)learning_reader.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                template_sentence = cdolist_list_var.first();
            }
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return new_peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 46722L)
    public static SubLObject l2r_find_or_reify_peg_for_sentence_string(final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != unicode_nauts.string_or_unicode_naut_p(sentence_string) : sentence_string;
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(supertext) : supertext;
        assert learning_reader.NIL != subl_promotions.positive_integer_p(sentence_number) : sentence_number;
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject dereferenced_sentences = (SubLObject)learning_reader.NIL;
        final SubLObject peg_var = (SubLObject)learning_reader.$sym298$_PEG;
        SubLObject peg = (SubLObject)learning_reader.NIL;
        SubLObject cdolist_list_var = l2r_sentence_level_peg_creation_template_sentences();
        SubLObject template_sentence = (SubLObject)learning_reader.NIL;
        template_sentence = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(peg_var, sentence_string, v_document, supertext, sentence_number, sentence_string_number, template_sentence);
            dereferenced_sentences = (SubLObject)ConsesLow.cons(dereferenced, dereferenced_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            template_sentence = cdolist_list_var.first();
        }
        peg = l2r_find_sentence_peg_from_sentences(peg_var, dereferenced_sentences);
        if (learning_reader.NIL == peg) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                final SubLObject _prev_bind_0_$30 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
                    peg = l2r_create((SubLObject)learning_reader.$str295$SentenceLevelPeg);
                }
                finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$30, thread);
                }
                SubLObject cdolist_list_var2 = Sequences.nreverse(dereferenced_sentences);
                SubLObject dereferenced = (SubLObject)learning_reader.NIL;
                dereferenced = cdolist_list_var2.first();
                while (learning_reader.NIL != cdolist_list_var2) {
                    l2r_assert(cycl_utilities.expression_subst(peg, peg_var, dereferenced, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED), (SubLObject)learning_reader.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    dereferenced = cdolist_list_var2.first();
                }
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
        }
        return peg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 47964L)
    public static SubLObject l2r_find_sentence_peg_from_sentences(final SubLObject peg_var, final SubLObject dereferenced_sentences) {
        return ask_utilities.query_variable(peg_var, simplifier.conjoin(dereferenced_sentences, (SubLObject)learning_reader.UNPROVIDED), learning_reader.$const1$BaseKB, (SubLObject)learning_reader.$list299).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48182L)
    public static SubLObject clear_l2r_sentence_level_peg_creation_template() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48182L)
    public static SubLObject remove_l2r_sentence_level_peg_creation_template() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48182L)
    public static SubLObject l2r_sentence_level_peg_creation_template_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = learning_reader.$const301$SentenceLevelPegCreationTemplateF;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == constant_handles.valid_constantP(template, (SubLObject)learning_reader.T)) {
            Errors.error((SubLObject)learning_reader.$str302$Failed_to_validate___SentenceLeve);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48182L)
    public static SubLObject l2r_sentence_level_peg_creation_template() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym300$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE, (SubLObject)learning_reader.$sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_level_peg_creation_template_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48482L)
    public static SubLObject clear_l2r_sentence_level_peg_exemplar() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48482L)
    public static SubLObject remove_l2r_sentence_level_peg_exemplar() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48482L)
    public static SubLObject l2r_sentence_level_peg_exemplar_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exemplar = learning_reader.$const305$TheExemplarSentenceLevelPeg;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == constant_handles.valid_constantP(exemplar, (SubLObject)learning_reader.T)) {
            Errors.error((SubLObject)learning_reader.$str306$Failed_to_validate___TheExemplarS);
        }
        return exemplar;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48482L)
    public static SubLObject l2r_sentence_level_peg_exemplar() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym304$L2R_SENTENCE_LEVEL_PEG_EXEMPLAR, (SubLObject)learning_reader.$sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_level_peg_exemplar_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 48727L)
    public static SubLObject l2r_sentence_level_peg_creation_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = forward.creation_template_allowable_rules(l2r_sentence_level_peg_creation_template());
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == list_utilities.non_empty_list_of_type_p((SubLObject)learning_reader.$sym308$RULE_ASSERTION_, rules)) {
            Errors.error((SubLObject)learning_reader.$str309$Failed_to_find_good_L2R_SENTENCE_, rules);
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49097L)
    public static SubLObject clear_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLObject cs = learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49097L)
    public static SubLObject remove_l2r_sentence_level_peg_creation_template_sentences() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49097L)
    public static SubLObject l2r_sentence_level_peg_creation_template_sentences_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = get_l2r_sentence_level_peg_creation_template_sentences();
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == list_utilities.non_empty_list_of_type_p((SubLObject)learning_reader.$sym311$IST_SENTENCE_P, sentences)) {
            Errors.error((SubLObject)learning_reader.$str312$Failed_to_initialize_L2R_SENTENCE, sentences);
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49097L)
    public static SubLObject l2r_sentence_level_peg_creation_template_sentences() {
        SubLObject caching_state = learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym310$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES, (SubLObject)learning_reader.$sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_level_peg_creation_template_sentences_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 49506L)
    public static SubLObject l2r_dereference_sentence_level_peg_assertion_sentence(final SubLObject new_peg, final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number, final SubLObject template_sentence) {
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(new_peg) : new_peg;
        SubLObject ans = el_utilities.copy_expression(template_sentence);
        SubLObject cdolist_list_var;
        final SubLObject pairs = cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_peg, l2r_sentence_level_peg_exemplar()), (SubLObject)ConsesLow.list(sentence_string, l2r_sentence_string_indexical()), (SubLObject)ConsesLow.list(v_document, l2r_document_indexical()), (SubLObject)ConsesLow.list(supertext, l2r_supertext_indexical()), (SubLObject)ConsesLow.list(sentence_number, l2r_sentence_number_indexical()), (SubLObject)ConsesLow.list(sentence_string_number, l2r_sentence_string_number_indexical()));
        SubLObject pair = (SubLObject)learning_reader.NIL;
        pair = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject in = (SubLObject)learning_reader.NIL;
            SubLObject out = (SubLObject)learning_reader.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list314);
            in = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list314);
            out = current.first();
            current = current.rest();
            if (learning_reader.NIL == current) {
                ans = cycl_utilities.expression_subst(in, out, ans, Symbols.symbol_function((SubLObject)learning_reader.EQUAL), (SubLObject)learning_reader.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list314);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50364L)
    public static SubLObject clear_l2r_document_indexical() {
        final SubLObject cs = learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50364L)
    public static SubLObject remove_l2r_document_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50364L)
    public static SubLObject l2r_document_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_naut = (SubLObject)learning_reader.$list316;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(document_naut)) {
            Errors.error((SubLObject)learning_reader.$str317$Failed_to_validate_L2R_DOCUMENT_I, document_naut);
        }
        return document_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50364L)
    public static SubLObject l2r_document_indexical() {
        SubLObject caching_state = learning_reader.$l2r_document_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym315$L2R_DOCUMENT_INDEXICAL, (SubLObject)learning_reader.$sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_document_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50655L)
    public static SubLObject clear_l2r_sentence_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50655L)
    public static SubLObject remove_l2r_sentence_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50655L)
    public static SubLObject l2r_sentence_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = (SubLObject)learning_reader.$list320;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(sentence_naut)) {
            Errors.error((SubLObject)learning_reader.$str321$Failed_to_validate_L2R_SENTENCE_I, sentence_naut);
        }
        return sentence_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 50655L)
    public static SubLObject l2r_sentence_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym319$L2R_SENTENCE_INDEXICAL, (SubLObject)learning_reader.$sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51022L)
    public static SubLObject clear_l2r_supertext_indexical() {
        final SubLObject cs = learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51022L)
    public static SubLObject remove_l2r_supertext_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51022L)
    public static SubLObject l2r_supertext_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supertext_naut = (SubLObject)learning_reader.$list324;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(supertext_naut)) {
            Errors.error((SubLObject)learning_reader.$str325$Failed_to_validate_L2R_SUPERTEXT_, supertext_naut);
        }
        return supertext_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51022L)
    public static SubLObject l2r_supertext_indexical() {
        SubLObject caching_state = learning_reader.$l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym323$L2R_SUPERTEXT_INDEXICAL, (SubLObject)learning_reader.$sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_supertext_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51367L)
    public static SubLObject clear_l2r_sentence_string_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51367L)
    public static SubLObject remove_l2r_sentence_string_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51367L)
    public static SubLObject l2r_sentence_string_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = (SubLObject)learning_reader.$list328;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(sentence_naut)) {
            Errors.error((SubLObject)learning_reader.$str329$Failed_to_validate_L2R_SENTENCE_S, sentence_naut);
        }
        return sentence_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51367L)
    public static SubLObject l2r_sentence_string_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym327$L2R_SENTENCE_STRING_INDEXICAL, (SubLObject)learning_reader.$sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_string_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51693L)
    public static SubLObject clear_l2r_sentence_number_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51693L)
    public static SubLObject remove_l2r_sentence_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51693L)
    public static SubLObject l2r_sentence_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = (SubLObject)learning_reader.$list332;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(naut)) {
            Errors.error((SubLObject)learning_reader.$str333$Failed_to_validate_L2R_SENTENCE_N, naut);
        }
        return naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51693L)
    public static SubLObject l2r_sentence_number_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym331$L2R_SENTENCE_NUMBER_INDEXICAL, (SubLObject)learning_reader.$sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51998L)
    public static SubLObject clear_l2r_sentence_string_number_indexical() {
        final SubLObject cs = learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51998L)
    public static SubLObject remove_l2r_sentence_string_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51998L)
    public static SubLObject l2r_sentence_string_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = (SubLObject)learning_reader.$list336;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == narts_high.find_nart(naut)) {
            Errors.error((SubLObject)learning_reader.$str337$Failed_to_validate_L2R_SENTENCE_S, naut);
        }
        return naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 51998L)
    public static SubLObject l2r_sentence_string_number_indexical() {
        SubLObject caching_state = learning_reader.$l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym335$L2R_SENTENCE_STRING_NUMBER_INDEXICAL, (SubLObject)learning_reader.$sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_sentence_string_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 52418L)
    public static SubLObject get_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = l2r_sentence_level_peg_creation_template();
        final SubLObject tuples = ask_utilities.query_template((SubLObject)learning_reader.$list339, (SubLObject)ConsesLow.list(learning_reader.$const340$assertPriorToInCreationTemplate, (SubLObject)learning_reader.$sym341$_HIGHER, (SubLObject)learning_reader.$sym342$_LOWER, template), learning_reader.$const160$InferencePSC, (SubLObject)learning_reader.$list343);
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)learning_reader.$sym344$HL_TO_EL), Mapping.mapcar(Symbols.symbol_function((SubLObject)learning_reader.$sym345$ASSERTION_IST_FORMULA), formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 53124L)
    public static SubLObject sentencify_l2r_paragraph(final SubLObject html_source) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject string = (learning_reader.NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, (SubLObject)learning_reader.UNPROVIDED)) : html_source;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = document.string_sentencify(string, (SubLObject)learning_reader.$sym346$HTML_STRING_WORDIFY);
        final SubLObject backwardP_var = (SubLObject)learning_reader.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)learning_reader.NIL, v_iteration = (SubLObject)learning_reader.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)learning_reader.ONE_INTEGER)) {
            element_num = ((learning_reader.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)learning_reader.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            set_l2r_sentence_string(sentence, unicodeP);
        }
        return sentence_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 53582L)
    public static SubLObject set_l2r_sentence_string(final SubLObject sentence, SubLObject unicodeP) {
        if (unicodeP == learning_reader.UNPROVIDED) {
            unicodeP = (SubLObject)learning_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)learning_reader.NIL;
        SubLObject first_wordP = (SubLObject)learning_reader.T;
        SubLObject stream = (SubLObject)learning_reader.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
            SubLObject word = (SubLObject)learning_reader.NIL;
            word = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                final SubLObject whole_string = l2r_reconstruct_word_string(word, (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == first_wordP));
                print_high.princ(whole_string, stream);
                first_wordP = (SubLObject)learning_reader.NIL;
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (learning_reader.NIL != unicodeP) {
            final SubLObject utf8_string = unicode_strings.html_escaped_to_utf8_string(string);
            if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !utf8_string.isString()) {
                Errors.error((SubLObject)learning_reader.$str347$Couldn_t_make_UTF8_string_from__S, string);
            }
            string = ((learning_reader.NIL != Sequences.find_if((SubLObject)learning_reader.$sym348$NON_ASCII_CHAR_P, utf8_string, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) ? unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(utf8_string)) : utf8_string);
        }
        document._csetf_sign_string(sentence, string);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 54375L)
    public static SubLObject l2r_reconstruct_word_string(final SubLObject word, SubLObject include_leading_whitespaceP) {
        if (include_leading_whitespaceP == learning_reader.UNPROVIDED) {
            include_leading_whitespaceP = (SubLObject)learning_reader.NIL;
        }
        final SubLObject main_string = document.word_string(word);
        final SubLObject info = document.word_info(word);
        final SubLObject leading_tags = conses_high.getf(info, (SubLObject)learning_reader.$kw349$LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject following_tags = conses_high.getf(info, (SubLObject)learning_reader.$kw350$FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject leading_whitespace = (learning_reader.NIL != include_leading_whitespaceP) ? conses_high.getf(info, (SubLObject)learning_reader.$kw351$LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue()) : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject following_whitespace = conses_high.getf(info, (SubLObject)learning_reader.$kw352$FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject whole_string = Sequences.cconcatenate(leading_whitespace, new SubLObject[] { leading_tags, main_string, following_tags, following_whitespace });
        return whole_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 55002L)
    public static SubLObject l2r_word_length(final SubLObject word, SubLObject include_tagsP) {
        if (include_tagsP == learning_reader.UNPROVIDED) {
            include_tagsP = (SubLObject)learning_reader.NIL;
        }
        final SubLObject main_string = document.word_string(word);
        final SubLObject info = document.word_info(word);
        SubLObject length = Sequences.length(unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(unicode_strings.html_escaped_to_utf8_string(main_string))));
        length = Numbers.add(length, Sequences.length(l2r_word_leading_whitespace(word)));
        if (learning_reader.NIL != include_tagsP) {
            length = Numbers.add(length, Sequences.length(conses_high.getf(info, (SubLObject)learning_reader.$kw349$LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
            length = Numbers.add(length, Sequences.length(conses_high.getf(info, (SubLObject)learning_reader.$kw350$FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
        }
        length = Numbers.add(length, Sequences.length(conses_high.getf(info, (SubLObject)learning_reader.$kw352$FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue())));
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 55591L)
    public static SubLObject l2r_word_leading_whitespace(final SubLObject word) {
        final SubLObject info = document.word_info(word);
        return conses_high.getf(info, (SubLObject)learning_reader.$kw351$LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 55736L)
    public static SubLObject l2r_assert_subexpression_links(final SubLObject sentence, final SubLObject sentence_peg, final SubLObject v_document) {
        SubLObject cdolist_list_var = l2r_extract_links_from_sentence(sentence, (SubLObject)learning_reader.UNPROVIDED);
        SubLObject data = (SubLObject)learning_reader.NIL;
        data = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject html = (SubLObject)learning_reader.NIL;
            SubLObject this_html_offset = (SubLObject)learning_reader.NIL;
            SubLObject this_non_html_offset = (SubLObject)learning_reader.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list353);
            html = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list353);
            this_html_offset = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list353);
            this_non_html_offset = current.first();
            current = current.rest();
            if (learning_reader.NIL == current) {
                final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
                final SubLObject subexpression = (SubLObject)ConsesLow.list(learning_reader.$const354$SubExpressionAtOffsetFn, sentence_peg, non_html, this_non_html_offset);
                final SubLObject mt = (SubLObject)ConsesLow.list(learning_reader.$const166$InterpretingDocumentMtFn, v_document);
                final SubLObject sentence_$31 = (SubLObject)ConsesLow.list(learning_reader.$const355$subExpressionWithStringAtOffset, subexpression, sentence_peg, non_html, this_non_html_offset);
                l2r_assert(sentence_$31, mt);
                l2r_assert_source_html(subexpression, html, mt, (SubLObject)learning_reader.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)learning_reader.$list353);
            }
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 56413L)
    public static SubLObject l2r_extract_links_from_sentence(final SubLObject sentence, SubLObject sanity_checkP) {
        if (sanity_checkP == learning_reader.UNPROVIDED) {
            sanity_checkP = (SubLObject)learning_reader.T;
        }
        assert learning_reader.NIL != document.sentence_p(sentence) : sentence;
        SubLObject links = (SubLObject)learning_reader.NIL;
        final SubLObject leading_whitespace_length = Sequences.length(l2r_word_leading_whitespace(document.sentence_get(sentence, (SubLObject)learning_reader.ZERO_INTEGER)));
        SubLObject full_offset = Numbers.minus(leading_whitespace_length);
        SubLObject non_html_offset = Numbers.minus(leading_whitespace_length);
        SubLObject this_html_offset = (SubLObject)learning_reader.$kw357$NONE;
        SubLObject this_non_html_offset = (SubLObject)learning_reader.$kw357$NONE;
        final SubLObject sentence_string = document.sentence_string(sentence);
        final SubLObject full_string = (learning_reader.NIL != unicode_nauts.unicode_naut_p(sentence_string, (SubLObject)learning_reader.UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(sentence_string, (SubLObject)learning_reader.UNPROVIDED)) : unicode_strings.unicode_display_to_html(sentence_string);
        final SubLObject non_html_string = (SubLObject)((learning_reader.NIL != sanity_checkP) ? evaluation_defns.cyc_remove_html_tags(sentence_string) : learning_reader.NIL);
        SubLObject inside_tagP = (SubLObject)learning_reader.NIL;
        SubLObject html = string_utilities.$empty_string$.getGlobalValue();
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = (SubLObject)learning_reader.NIL;
        word = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            final SubLObject leading_tags = conses_high.getf(document.word_info(word), (SubLObject)learning_reader.$kw349$LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
            final SubLObject first_wordP = (SubLObject)((learning_reader.NIL != inside_tagP) ? learning_reader.NIL : SubLObjectFactory.makeBoolean(learning_reader.NIL != Sequences.search((SubLObject)learning_reader.$str358$_a, leading_tags, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) && learning_reader.NIL != Sequences.search((SubLObject)learning_reader.$str359$href, leading_tags, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)));
            inside_tagP = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL != first_wordP || learning_reader.NIL != inside_tagP);
            if (learning_reader.NIL != first_wordP) {
                final SubLObject leading_whitespace_length_$32 = Sequences.length(l2r_word_leading_whitespace(word));
                this_html_offset = Numbers.add(full_offset, leading_whitespace_length_$32);
                this_non_html_offset = Numbers.add(non_html_offset, leading_whitespace_length_$32);
            }
            if (learning_reader.NIL != inside_tagP) {
                html = Sequences.cconcatenate(html, l2r_reconstruct_word_string(word, (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == first_wordP)));
                if (learning_reader.NIL != Sequences.search((SubLObject)learning_reader.$str360$__a, conses_high.getf(document.word_info(word), (SubLObject)learning_reader.$kw350$FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue()), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
                    if (learning_reader.NIL != sanity_checkP) {
                        l2r_sanity_check_subexpression(html, non_html_string, this_non_html_offset, sentence_string, this_html_offset);
                    }
                    links = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(html, this_html_offset, this_non_html_offset), links);
                    inside_tagP = (SubLObject)learning_reader.NIL;
                    html = string_utilities.$empty_string$.getGlobalValue();
                }
            }
            full_offset = Numbers.add(full_offset, l2r_word_length(word, (SubLObject)learning_reader.T));
            non_html_offset = Numbers.add(non_html_offset, l2r_word_length(word, (SubLObject)learning_reader.NIL));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return Sequences.nreverse(links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 58373L)
    public static SubLObject l2r_sanity_check_subexpression(final SubLObject html, final SubLObject non_html_string, final SubLObject this_non_html_offset, final SubLObject sentence_string, final SubLObject this_html_offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !non_html.equal(evaluation_defns.cyc_substring(non_html_string, this_non_html_offset, Numbers.add(this_non_html_offset, Sequences.length(non_html))))) {
            Errors.error((SubLObject)learning_reader.$str361$Bad_offset___S_at_offset__S_of__S, non_html, this_non_html_offset, non_html_string);
        }
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !html.equal(evaluation_defns.cyc_substring(sentence_string, this_html_offset, Numbers.add(this_html_offset, Sequences.length(html))))) {
            Errors.error((SubLObject)learning_reader.$str361$Bad_offset___S_at_offset__S_of__S, html, this_html_offset, sentence_string);
        }
        return (SubLObject)learning_reader.$kw362$OK;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59000L)
    public static SubLObject l2r_sentences_for_document(final SubLObject v_document) {
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        final SubLObject query_sentence = l2r_document_sentence_finder_query_sentence(v_document);
        final SubLObject kbq = l2r_document_sentence_finder_kbq();
        final SubLObject query_properties = kb_query.kbq_query_properties(kbq);
        final SubLObject mt = kb_query.kbq_mt(kbq);
        return inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59410L)
    public static SubLObject clear_l2r_document_sentence_finder_kbq() {
        final SubLObject cs = learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (learning_reader.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59410L)
    public static SubLObject remove_l2r_document_sentence_finder_kbq() {
        return memoization_state.caching_state_remove_function_results_with_args(learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(learning_reader.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59410L)
    public static SubLObject l2r_document_sentence_finder_kbq_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbq = learning_reader.$const364$ReifySentencePegQuery_FindSentenc;
        if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && learning_reader.NIL == constant_handles.valid_constantP(kbq, (SubLObject)learning_reader.T)) {
            Errors.error((SubLObject)learning_reader.$str365$Failed_to_validate___ReifySentenc);
        }
        return kbq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59410L)
    public static SubLObject l2r_document_sentence_finder_kbq() {
        SubLObject caching_state = learning_reader.$l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (learning_reader.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)learning_reader.$sym363$L2R_DOCUMENT_SENTENCE_FINDER_KBQ, (SubLObject)learning_reader.$sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.EQL, (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)learning_reader.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(l2r_document_sentence_finder_kbq_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)learning_reader.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 59657L)
    public static SubLObject l2r_document_sentence_finder_query_sentence(final SubLObject v_document) {
        assert learning_reader.NIL != cycl_grammar.cycl_denotational_term_p(v_document) : v_document;
        final SubLObject kbq = l2r_document_sentence_finder_kbq();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(kbq);
        final SubLObject document_indexical = l2r_document_indexical();
        final SubLObject dereferenced_sentence = cycl_utilities.expression_subst(v_document, document_indexical, indexical_sentence, Symbols.symbol_function((SubLObject)learning_reader.$sym367$EQUALS_EL_), (SubLObject)learning_reader.UNPROVIDED);
        return dereferenced_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 60061L)
    public static SubLObject simple_assert_linkages_for_page(final SubLObject url, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == learning_reader.UNPROVIDED) {
            wikipedia_pageP = (SubLObject)learning_reader.T;
        }
        assert learning_reader.NIL != string_utilities.non_empty_string_p(url) : url;
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str369$Asserting_linkages_for____);
        SubLObject cdolist_list_var = Sequences.reverse(page_to_detagged_sentence_strings(url, wikipedia_pageP, (SubLObject)learning_reader.UNPROVIDED));
        SubLObject sentence = (SubLObject)learning_reader.NIL;
        sentence = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            if (learning_reader.NIL != lexicon_accessors.contains_closed_lexical_class_wordP(sentence) && (learning_reader.NIL == wikipedia_pageP || learning_reader.NIL == probably_wikipedia_meta_sentence_p(sentence))) {
                final SubLObject cycl_sentence = unicode_nauts.display_vector_string_to_cycl_safe_string(unicode_strings.html_escaped_to_display(sentence));
                PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str370$_____A__, cycl_sentence);
                linkage_assertion.assert_linkage(cycl_sentence, (SubLObject)learning_reader.T, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 61356L)
    public static SubLObject l2r_cyclify_webpage(final SubLObject url, final SubLObject directory, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == learning_reader.UNPROVIDED) {
            wikipedia_pageP = (SubLObject)learning_reader.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != string_utilities.non_empty_string_p(url) : url;
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str371$Using_L2R_Webpage_Cyclifier_with_, learning_reader.$learning_reader_timestamp$.getGlobalValue());
        streams_high.force_output((SubLObject)learning_reader.T);
        if (learning_reader.NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.UNPROVIDED);
        }
        final SubLObject sentences_directory = file_utilities.relative_filename(directory, (SubLObject)learning_reader.$str372$sentences_, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject sentences_directory_existsP = Filesys.directory_p(sentences_directory);
        if (learning_reader.NIL == sentences_directory_existsP) {
            Filesys.make_directory(sentences_directory, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$int373$511);
        }
        final SubLObject links_file = file_utilities.relative_filename(directory, (SubLObject)learning_reader.$str374$links, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject get_linksP = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == Filesys.probe_file(links_file));
        thread.resetMultipleValues();
        final SubLObject sentences = page_to_detagged_sentence_strings(url, wikipedia_pageP, get_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (learning_reader.NIL != links) {
            l2r_write_webpage_links(links, url, links_file);
        }
        l2r_save_new_webpage_sentences(sentences, sentences_directory, url, wikipedia_pageP);
        l2r_cyclify_unparsed_sentences(sentences_directory);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 62964L)
    public static SubLObject l2r_write_webpage_links(final SubLObject links, final SubLObject url, final SubLObject links_file) {
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str375$__Writing__S_links_from__S_to__S_, new SubLObject[] { Sequences.length(links), url, links_file });
        SubLObject stream = (SubLObject)learning_reader.NIL;
        try {
            stream = compatibility.open_text(links_file, (SubLObject)learning_reader.$kw376$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, links_file);
            }
            final SubLObject stream_$33 = stream;
            SubLObject cdolist_list_var = links;
            SubLObject link = (SubLObject)learning_reader.NIL;
            link = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                print_high.princ(link, stream_$33);
                streams_high.terpri(stream_$33);
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return links_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 63268L)
    public static SubLObject l2r_cyclify_wikipedia_pages_for_unknown_phrases(final SubLObject links_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unknown_phrase_links = l2r_get_unknown_phrase_wikipedia_links_from_file(links_file);
        if (learning_reader.NIL != list_utilities.non_empty_list_p(unknown_phrase_links)) {
            final SubLObject path = file_utilities.deconstruct_path(links_file);
            final SubLObject base_uri_string = (SubLObject)learning_reader.$str378$http___en_wikipedia_org_;
            final SubLObject directory = file_utilities.reconstruct_path(conses_high.butlast(path, (SubLObject)learning_reader.UNPROVIDED), (SubLObject)learning_reader.$str379$, (SubLObject)learning_reader.UNPROVIDED);
            final SubLObject message = Sequences.cconcatenate((SubLObject)learning_reader.$str380$Following_unknown_phrase_links_in, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), learning_reader.$str381$_, format_nil.format_nil_s_no_copy(links_file) });
            SubLObject done = (SubLObject)learning_reader.ZERO_INTEGER;
            final SubLObject total = Sequences.length(unknown_phrase_links);
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = unknown_phrase_links;
                    SubLObject link = (SubLObject)learning_reader.NIL;
                    link = cdolist_list_var.first();
                    while (learning_reader.NIL != cdolist_list_var) {
                        final SubLObject link_relative_url = extract_link_relative_url(link);
                        final SubLObject subdirectory_name = Sequences.cconcatenate(list_utilities.last_one(string_utilities.string_tokenize(link_relative_url, (SubLObject)learning_reader.$list382, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)), (SubLObject)learning_reader.$str383$_);
                        final SubLObject new_directory = file_utilities.relative_filename(directory, subdirectory_name, (SubLObject)learning_reader.UNPROVIDED);
                        final SubLObject link_url = web_utilities.absolute_url_from_relative_url_and_base(link_relative_url, base_uri_string);
                        if (link_url.isString()) {
                            l2r_cyclify_webpage(link_url, new_directory, (SubLObject)learning_reader.T);
                        }
                        done = Numbers.add(done, (SubLObject)learning_reader.ONE_INTEGER);
                        utilities_macros.note_percent_progress(done, total);
                        cdolist_list_var = cdolist_list_var.rest();
                        link = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
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
        return unknown_phrase_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 64567L)
    public static SubLObject l2r_get_unknown_phrase_wikipedia_links_from_file(final SubLObject links_file) {
        SubLObject unknown_phrase_links = (SubLObject)learning_reader.NIL;
        SubLObject stream = (SubLObject)learning_reader.NIL;
        try {
            stream = compatibility.open_text(links_file, (SubLObject)learning_reader.$kw384$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, links_file);
            }
            for (SubLObject stream_$35 = stream, line = streams_high.read_line(stream_$35, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED); line.isString(); line = streams_high.read_line(stream_$35, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.UNPROVIDED)) {
                if (learning_reader.NIL != unknown_phrase_wikipedia_linkP(line)) {
                    unknown_phrase_links = (SubLObject)ConsesLow.cons(line, unknown_phrase_links);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Sequences.nreverse(unknown_phrase_links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 64971L)
    public static SubLObject extract_link_relative_url(final SubLObject link) {
        final SubLObject quoted = string_utilities.string_tokenize(link, (SubLObject)learning_reader.$list385, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.T, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED).first();
        return (SubLObject)(quoted.isString() ? reader.read_from_string(quoted, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 65165L)
    public static SubLObject unknown_phrase_wikipedia_linkP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL != unknown_phrase_linkP(v_object) && learning_reader.NIL != string_utilities.starts_with(v_object, (SubLObject)learning_reader.$str386$_a_href___wiki_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 65314L)
    public static SubLObject unknown_phrase_linkP(final SubLObject v_object) {
        SubLObject ans = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL != string_utilities.non_empty_string_p(v_object) && learning_reader.NIL != Sequences.search((SubLObject)learning_reader.$str387$a_href_, v_object, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) && learning_reader.NIL == Sequences.search((SubLObject)learning_reader.$str388$_img_, v_object, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
            final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(v_object);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(learning_reader.NIL == lexicon_accessors.denots_of_string(stripped, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) && learning_reader.NIL == Sequences.find_if((SubLObject)learning_reader.$sym389$PUNCTUATION_P, stripped, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) && learning_reader.NIL != Sequences.find((SubLObject)Characters.CHAR_space, stripped, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) && learning_reader.NIL == psp_main.ps_get_cycls_for_phrase(stripped, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 65836L)
    public static SubLObject l2r_save_new_webpage_sentences(final SubLObject sentences, final SubLObject sentences_directory, final SubLObject url, final SubLObject wikipedia_pageP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_num = (SubLObject)learning_reader.ZERO_INTEGER;
        SubLObject sentence_directories = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((learning_reader.NIL != Sequences.cconcatenate((SubLObject)learning_reader.$str390$Logging_cyclifications_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(url), learning_reader.$str391$__, format_nil.$format_nil_percent$.getGlobalValue() })) ? Sequences.cconcatenate((SubLObject)learning_reader.$str390$Logging_cyclifications_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(url), learning_reader.$str391$__, format_nil.$format_nil_percent$.getGlobalValue() }) : learning_reader.$str18$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(sentences), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = sentences;
                SubLObject cycl_sentence = (SubLObject)learning_reader.NIL;
                cycl_sentence = csome_list_var.first();
                while (learning_reader.NIL != csome_list_var) {
                    final SubLObject subl_sentence = (learning_reader.NIL != unicode_nauts.unicode_naut_p(cycl_sentence, (SubLObject)learning_reader.UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(cycl_sentence, (SubLObject)learning_reader.UNPROVIDED)) : cycl_sentence;
                    if (learning_reader.NIL != lexicon_accessors.contains_closed_lexical_class_wordP(subl_sentence) && (learning_reader.NIL == wikipedia_pageP || learning_reader.NIL == probably_wikipedia_meta_sentence_p(subl_sentence))) {
                        final SubLObject sentence_directory_name = PrintLow.format((SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$str392$sentence__3__0D_, sentence_num);
                        final SubLObject sentence_directory = file_utilities.relative_filename(sentences_directory, sentence_directory_name, (SubLObject)learning_reader.UNPROVIDED);
                        if (learning_reader.NIL == Filesys.directory_p(sentence_directory)) {
                            Filesys.make_directory(sentence_directory, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$int373$511);
                            if (learning_reader.NIL == Filesys.directory_p(sentence_directory)) {
                                Threads.sleep((SubLObject)learning_reader.ONE_INTEGER);
                                if (learning_reader.NIL == Filesys.directory_p(sentence_directory)) {
                                    Errors.error((SubLObject)learning_reader.$str393$Couldn_t_make_directory_____S, sentence_directory);
                                }
                            }
                        }
                        final SubLObject output_file = file_utilities.relative_filename(sentence_directory, (SubLObject)learning_reader.$str394$sentence_text_lisp, (SubLObject)learning_reader.UNPROVIDED);
                        if (learning_reader.NIL == Filesys.probe_file(output_file)) {
                            SubLObject stream = (SubLObject)learning_reader.NIL;
                            try {
                                stream = compatibility.open_text(output_file, (SubLObject)learning_reader.$kw376$OUTPUT);
                                if (!stream.isStream()) {
                                    Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, output_file);
                                }
                                final SubLObject stream_$36 = stream;
                                print_high.print(cycl_sentence, stream_$36);
                                streams_high.force_output(stream_$36);
                            }
                            finally {
                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        sentence_directories = (SubLObject)ConsesLow.cons(sentence_directory, sentence_directories);
                        sentence_num = Numbers.add(sentence_num, (SubLObject)learning_reader.ONE_INTEGER);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)learning_reader.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    cycl_sentence = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
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
        return sentence_directories;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 67245L)
    public static SubLObject l2r_cyclify_unparsed_sentences(final SubLObject sentences_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str395$__Cyclifying_unparsed_sentences_f, sentences_directory);
        assert learning_reader.NIL != Filesys.directory_p(sentences_directory) : sentences_directory;
        SubLObject directory_contents_var = Filesys.directory(sentences_directory, (SubLObject)learning_reader.T);
        final SubLObject progress_message_var = (SubLObject)learning_reader.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (learning_reader.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$39 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((learning_reader.NIL != progress_message_var) ? progress_message_var : learning_reader.$str18$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject sentence_directory = (SubLObject)learning_reader.NIL;
                    sentence_directory = csome_list_var.first();
                    while (learning_reader.NIL != csome_list_var) {
                        if (learning_reader.NIL != Filesys.directory_p(sentence_directory) && learning_reader.NIL != string_utilities.starts_with(Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)learning_reader.ONE_INTEGER), file_utilities.deconstruct_path(sentence_directory)), (SubLObject)learning_reader.$str396$sentence_)) {
                            if (learning_reader.NIL == string_utilities.ends_with(sentence_directory, (SubLObject)learning_reader.$str383$_, (SubLObject)learning_reader.UNPROVIDED)) {
                                sentence_directory = Sequences.cconcatenate(sentence_directory, (SubLObject)learning_reader.$str383$_);
                            }
                            l2r_log_cyclifications_for_unparsed_sentences(sentence_directory);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)learning_reader.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        sentence_directory = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$39, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return sentences_directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 67815L)
    public static SubLObject l2r_log_cyclifications_for_unparsed_sentences(final SubLObject sentence_directory) {
        final SubLObject sentence_file = file_utilities.relative_filename(sentence_directory, (SubLObject)learning_reader.$str394$sentence_text_lisp, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject parsed_sentence_file = file_utilities.relative_filename(sentence_directory, (SubLObject)learning_reader.$str397$sentence_parsed_lisp, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject parses = (SubLObject)learning_reader.NIL;
        SubLObject cycl_sentence = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL != Filesys.probe_file(parsed_sentence_file)) {
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str398$__Skipping_already_parsed__S__, parsed_sentence_file);
        }
        else if (learning_reader.NIL != Filesys.probe_file(sentence_file)) {
            SubLObject stream = (SubLObject)learning_reader.NIL;
            try {
                stream = compatibility.open_text(sentence_file, (SubLObject)learning_reader.$kw384$INPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, sentence_file);
                }
                final SubLObject stream_$41 = stream;
                cycl_sentence = reader.read(stream_$41, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str399$__Parsing__S__, cycl_sentence);
            stream = (SubLObject)learning_reader.NIL;
            try {
                stream = compatibility.open_text(sentence_file, (SubLObject)learning_reader.$kw376$OUTPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, sentence_file);
                }
                final SubLObject stream_$42 = stream;
                print_high.print(cycl_sentence, stream_$42);
                streams_high.force_output(stream_$42);
                print_high.print(Mapping.mapcar((SubLObject)learning_reader.$sym344$HL_TO_EL, parses), stream_$42);
            }
            finally {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
            file_utilities.move_file(sentence_file, parsed_sentence_file);
            PrintLow.format((SubLObject)learning_reader.T, (SubLObject)learning_reader.$str400$___Logged__S_sentence_parses_to__, Sequences.length(parses), parsed_sentence_file);
        }
        else {
            Errors.error((SubLObject)learning_reader.$str401$No_sentence_to_parse_in__S, sentence_directory);
        }
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 69420L)
    public static SubLObject html_eos_open_tags() {
        if (learning_reader.NIL != learning_reader.$html_eos_open_tags$.getGlobalValue()) {
            return learning_reader.$html_eos_open_tags$.getGlobalValue();
        }
        learning_reader.$html_eos_open_tags$.setGlobalValue(list_utilities.mapcar_product(Symbols.symbol_function((SubLObject)learning_reader.$sym403$CCONCATENATE), (SubLObject)learning_reader.$list404, conses_high.union(string_utilities.string_list_upcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)));
        return learning_reader.$html_eos_open_tags$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 69846L)
    public static SubLObject html_eos_close_tags() {
        if (learning_reader.NIL != learning_reader.$html_eos_close_tags$.getGlobalValue()) {
            return learning_reader.$html_eos_close_tags$.getGlobalValue();
        }
        learning_reader.$html_eos_close_tags$.setGlobalValue(list_utilities.mapcar_product(Symbols.symbol_function((SubLObject)learning_reader.$sym403$CCONCATENATE), list_utilities.mapcar_product(Symbols.symbol_function((SubLObject)learning_reader.$sym403$CCONCATENATE), (SubLObject)learning_reader.$list405, conses_high.union(string_utilities.string_list_upcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase(learning_reader.$html_implicit_eos_tags$.getGlobalValue()), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)), (SubLObject)learning_reader.$list406));
        return learning_reader.$html_eos_close_tags$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 70854L)
    public static SubLObject wikipedia_meta_strings() {
        return learning_reader.$wikipedia_meta_strings$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 70931L)
    public static SubLObject replace_separator_tags_with_eos(final SubLObject list_of_token_strings) {
        SubLObject retlist = (SubLObject)learning_reader.NIL;
        SubLObject cdolist_list_var = list_of_token_strings;
        SubLObject tok = (SubLObject)learning_reader.NIL;
        tok = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            if (learning_reader.NIL != string_utilities.ends_with_one_of(tok, html_eos_close_tags()) || learning_reader.NIL != string_utilities.starts_with_one_of(tok, html_eos_open_tags())) {
                retlist = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$str408$_C, (SubLObject)Characters.CHAR_escape), retlist);
            }
            else {
                retlist = (SubLObject)ConsesLow.cons(tok, retlist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tok = cdolist_list_var.first();
        }
        return Sequences.nreverse(retlist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 71498L)
    public static SubLObject strip_text_between_tags_of_type(final SubLObject string, final SubLObject tag) {
        SubLObject otag;
        SubLObject ctag;
        SubLObject retstr;
        for (otag = Sequences.cconcatenate((SubLObject)learning_reader.$str409$_, tag), ctag = Sequences.cconcatenate((SubLObject)learning_reader.$str410$__, new SubLObject[] { tag, learning_reader.$str411$_ }), retstr = string_utilities.string_substitute(otag, otag, string, Symbols.symbol_function((SubLObject)learning_reader.EQUALP)), retstr = string_utilities.string_substitute(ctag, ctag, retstr, Symbols.symbol_function((SubLObject)learning_reader.EQUALP)); learning_reader.NIL != string_utilities.get_substring_between_tags(retstr, otag, ctag, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED); retstr = string_utilities.replace_substring_once(retstr, Sequences.cconcatenate(otag, new SubLObject[] { string_utilities.get_substring_between_tags(retstr, otag, ctag, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED), ctag }), (SubLObject)learning_reader.$str379$, (SubLObject)learning_reader.UNPROVIDED)) {}
        return retstr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 72396L)
    public static SubLObject strip_wikipedia_page(final SubLObject pagetext) {
        assert learning_reader.NIL != string_utilities.non_empty_string_p(pagetext) : pagetext;
        SubLObject returned_text = string_utilities.string_subst((SubLObject)learning_reader.$str412$_ul_, (SubLObject)learning_reader.$str412$_ul_, pagetext, Symbols.symbol_function((SubLObject)learning_reader.EQUALP));
        returned_text = string_utilities.string_subst((SubLObject)learning_reader.$str413$__ul_, (SubLObject)learning_reader.$str413$__ul_, returned_text, Symbols.symbol_function((SubLObject)learning_reader.EQUALP));
        if (learning_reader.NIL != string_utilities.substringP((SubLObject)learning_reader.$str414$_____start_content____, returned_text, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
            returned_text = string_utilities.get_substring_between_tags(returned_text, (SubLObject)learning_reader.$str414$_____start_content____, (SubLObject)learning_reader.$str415$_____end_content____, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        }
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str416$ul);
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str417$ol);
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str418$table);
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str419$h1);
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str420$h2);
        returned_text = strip_text_between_tags_of_type(returned_text, (SubLObject)learning_reader.$str421$h3);
        return returned_text;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 73606L)
    public static SubLObject probably_wikipedia_meta_sentence_p(final SubLObject sentence) {
        assert learning_reader.NIL != string_utilities.non_empty_string_p(sentence) : sentence;
        if (learning_reader.NIL != string_utilities.some_are_substringsP(wikipedia_meta_strings(), sentence, (SubLObject)learning_reader.UNPROVIDED) || learning_reader.THREE_INTEGER.numG(string_utilities.number_of_words(sentence))) {
            return (SubLObject)learning_reader.T;
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 73995L)
    public static SubLObject detagged_page_as_string(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == learning_reader.UNPROVIDED) {
            wikipedia_pageP = (SubLObject)learning_reader.NIL;
        }
        if (return_linksP == learning_reader.UNPROVIDED) {
            return_linksP = (SubLObject)learning_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != string_utilities.non_empty_string_p(url) : url;
        final SubLObject links = (SubLObject)((learning_reader.NIL != return_linksP) ? set.new_set(Symbols.symbol_function((SubLObject)learning_reader.EQUAL), (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
        SubLObject retstr = (SubLObject)learning_reader.$str379$;
        SubLObject html_source = (SubLObject)learning_reader.NIL;
        SubLObject error_message = (SubLObject)learning_reader.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)learning_reader.$sym422$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    html_source = evaluation_defns.cyc_url_source(url);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)learning_reader.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (learning_reader.NIL != error_message) {
            Errors.warn(error_message);
            return retstr;
        }
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source, (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject orig_pagetext = (learning_reader.NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, (SubLObject)learning_reader.UNPROVIDED)) : html_source;
        final SubLObject pagetext = (learning_reader.NIL != wikipedia_pageP) ? strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject dirtyP = (SubLObject)learning_reader.NIL;
        SubLObject paragraph_text = (SubLObject)learning_reader.NIL;
        SubLObject start_pos = (SubLObject)learning_reader.ZERO_INTEGER;
        SubLObject output_string_stream = (SubLObject)learning_reader.NIL;
        try {
            output_string_stream = streams_high.make_private_string_output_stream();
            while (learning_reader.NIL == dirtyP || learning_reader.NIL != paragraph_text) {
                thread.resetMultipleValues();
                final SubLObject paragraph_text_$43 = string_utilities.get_substring_between_tags(pagetext, (SubLObject)learning_reader.$str286$_p_, (SubLObject)learning_reader.$str289$__p_, start_pos, (SubLObject)learning_reader.UNPROVIDED);
                final SubLObject start_pos_$44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                paragraph_text = paragraph_text_$43;
                start_pos = start_pos_$44;
                if (paragraph_text.isString() && learning_reader.NIL != Sequences.find_if((SubLObject)learning_reader.$sym253$ALPHA_CHAR_P, evaluation_defns.cyc_remove_html_tags(paragraph_text), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
                    dirtyP = (SubLObject)learning_reader.T;
                    l2r_stringify_one_paragraph(paragraph_text, output_string_stream, links, unicodeP);
                }
            }
            if (learning_reader.NIL == dirtyP) {
                Errors.warn((SubLObject)learning_reader.$str423$Couldn_t_find_paragraphs_in__S, url);
                l2r_stringify_one_paragraph(pagetext, output_string_stream, links, unicodeP);
            }
            retstr = streams_high.get_output_stream_string(output_string_stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(output_string_stream, (SubLObject)learning_reader.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values(string_utilities.remove_last_char(retstr, (SubLObject)learning_reader.UNPROVIDED), (SubLObject)((learning_reader.NIL != links) ? set.set_element_list(links) : learning_reader.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 75605L)
    public static SubLObject l2r_stringify_one_paragraph(final SubLObject paragraph_text, final SubLObject output_string_stream, final SubLObject links, final SubLObject unicodeP) {
        final SubLObject cycl_text = (learning_reader.NIL != unicodeP) ? unicode_nauts.make_unicode_naut(unicode_strings.html_escaped_to_display(paragraph_text)) : paragraph_text;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = sentencify_l2r_paragraph(cycl_text);
        final SubLObject backwardP_var = (SubLObject)learning_reader.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject link_info;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)learning_reader.NIL, v_iteration = (SubLObject)learning_reader.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)learning_reader.ONE_INTEGER)) {
            element_num = ((learning_reader.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)learning_reader.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            if (learning_reader.NIL == document.sentence_string(sentence)) {
                Errors.error((SubLObject)learning_reader.$str424$No_sentence_string_for__S, sentence);
            }
            l2r_stringify_one_sentence(sentence, output_string_stream);
            if (learning_reader.NIL != set.set_p(links)) {
                cdolist_list_var = l2r_extract_links_from_sentence(sentence, (SubLObject)learning_reader.NIL);
                link_info = (SubLObject)learning_reader.NIL;
                link_info = cdolist_list_var.first();
                while (learning_reader.NIL != cdolist_list_var) {
                    set.set_add(link_info.first(), links);
                    cdolist_list_var = cdolist_list_var.rest();
                    link_info = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 76243L)
    public static SubLObject l2r_stringify_one_sentence(final SubLObject sentence, final SubLObject output_string_stream) {
        final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(document.sentence_string(sentence));
        PrintLow.format(output_string_stream, (SubLObject)learning_reader.$str425$_A_, stripped);
        return (SubLObject)learning_reader.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 76453L)
    public static SubLObject detagged_page_as_string_old(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == learning_reader.UNPROVIDED) {
            wikipedia_pageP = (SubLObject)learning_reader.NIL;
        }
        if (return_linksP == learning_reader.UNPROVIDED) {
            return_linksP = (SubLObject)learning_reader.NIL;
        }
        assert learning_reader.NIL != string_utilities.non_empty_string_p(url) : url;
        SubLObject retlist = (SubLObject)learning_reader.NIL;
        SubLObject links = (SubLObject)learning_reader.NIL;
        SubLObject retstr = (SubLObject)learning_reader.$str379$;
        final SubLObject html_source = evaluation_defns.cyc_url_source(url);
        final SubLObject orig_pagetext = (learning_reader.NIL != unicode_nauts.unicode_naut_p(html_source, (SubLObject)learning_reader.UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, (SubLObject)learning_reader.UNPROVIDED)) : html_source;
        final SubLObject pagetext = (learning_reader.NIL != wikipedia_pageP) ? strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject cdolist_list_var;
        final SubLObject xml_tokens = cdolist_list_var = replace_separator_tags_with_eos(xml_parsing_utilities.xml_string_tokenize(pagetext, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED));
        SubLObject token = (SubLObject)learning_reader.NIL;
        token = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            if (learning_reader.NIL != xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)learning_reader.$str409$_)) {
                if (learning_reader.NIL != return_linksP && learning_reader.NIL != Sequences.search((SubLObject)learning_reader.$str358$_a, token, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
                    final SubLObject prefix_string = (SubLObject)learning_reader.$str426$href__;
                    final SubLObject prefix_start_pos = Sequences.search(prefix_string, token, Symbols.symbol_function((SubLObject)learning_reader.EQUALP), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
                    final SubLObject start_pos = (SubLObject)((learning_reader.NIL != prefix_start_pos) ? Numbers.add(prefix_start_pos, Sequences.length(prefix_string)) : learning_reader.NIL);
                    final SubLObject end_pos = (SubLObject)((learning_reader.NIL != start_pos) ? Sequences.search((SubLObject)learning_reader.$str427$_, token, Symbols.symbol_function((SubLObject)learning_reader.EQL), Symbols.symbol_function((SubLObject)learning_reader.IDENTITY), (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)learning_reader.NIL, start_pos, (SubLObject)learning_reader.UNPROVIDED) : learning_reader.NIL);
                    final SubLObject relative_url = (SubLObject)((learning_reader.NIL != end_pos) ? string_utilities.substring(token, start_pos, end_pos) : learning_reader.NIL);
                    if (relative_url.isString()) {
                        links = (SubLObject)ConsesLow.cons(relative_url, links);
                    }
                }
            }
            else if (learning_reader.NIL == xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)learning_reader.$str428$_)) {
                if (learning_reader.NIL == string_utilities.empty_stringP(string_utilities.trim_whitespace(token))) {
                    retlist = (SubLObject)ConsesLow.cons(token, retlist);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        SubLObject stream = (SubLObject)learning_reader.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var2 = Sequences.nreverse(retlist);
            SubLObject token2 = (SubLObject)learning_reader.NIL;
            token2 = cdolist_list_var2.first();
            while (learning_reader.NIL != cdolist_list_var2) {
                print_high.princ(token2, stream);
                print_high.princ((SubLObject)learning_reader.$str381$_, stream);
                cdolist_list_var2 = cdolist_list_var2.rest();
                token2 = cdolist_list_var2.first();
            }
            retstr = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)learning_reader.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        retstr = string_utilities.remove_last_char(string_utilities.string_subst((SubLObject)learning_reader.$str381$_, (SubLObject)learning_reader.$str429$_u0a_, retstr, (SubLObject)learning_reader.UNPROVIDED), (SubLObject)learning_reader.UNPROVIDED);
        return Values.values(retstr, links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 78230L)
    public static SubLObject page_to_detagged_sentence_strings(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == learning_reader.UNPROVIDED) {
            wikipedia_pageP = (SubLObject)learning_reader.NIL;
        }
        if (return_linksP == learning_reader.UNPROVIDED) {
            return_linksP = (SubLObject)learning_reader.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert learning_reader.NIL != string_utilities.non_empty_string_p(url) : url;
        Errors.warn((SubLObject)learning_reader.$str430$Downloading_and_sentencifying_tex, url);
        thread.resetMultipleValues();
        final SubLObject page_text = detagged_page_as_string(url, wikipedia_pageP, return_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(document.sentencify_string(page_text), links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 78773L)
    public static SubLObject parse_and_partition_document_file(final SubLObject file, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == learning_reader.UNPROVIDED) {
            domain_mt = learning_reader.$const431$CurrentWorldDataCollectorMt;
        }
        if (max_parses == learning_reader.UNPROVIDED) {
            max_parses = (SubLObject)learning_reader.NIL;
        }
        if (max_time == learning_reader.UNPROVIDED) {
            max_time = (SubLObject)learning_reader.$int432$30;
        }
        final SubLObject paragraph_texts = read_topic_struct_paragraphs_from_file(file);
        return parse_and_partition_paragraph_texts(paragraph_texts, results_directory, domain_mt, max_parses, max_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 79214L)
    public static SubLObject read_topic_struct_paragraphs_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paragraph_texts = (SubLObject)learning_reader.NIL;
        SubLObject doneP = (SubLObject)learning_reader.NIL;
        SubLObject stream = (SubLObject)learning_reader.NIL;
        try {
            stream = compatibility.open_text(file, (SubLObject)learning_reader.$kw384$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, file);
            }
            final SubLObject in = stream;
            if (learning_reader.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !in.isStream()) {
                Errors.error((SubLObject)learning_reader.$str433$__Cannot_open_input_stream_for__A, file);
            }
            while (learning_reader.NIL == doneP) {
                final SubLObject next = reader.read_ignoring_errors(in, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$kw434$EOF);
                if (next == learning_reader.$kw434$EOF) {
                    doneP = (SubLObject)learning_reader.T;
                }
                else if (learning_reader.NIL != unicode_nauts.string_or_unicode_naut_p(next)) {
                    paragraph_texts = (SubLObject)ConsesLow.cons(next, paragraph_texts);
                }
                else {
                    Errors.warn((SubLObject)learning_reader.$str435$Non_string_in__S_____S__, file, next);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(paragraph_texts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 79717L)
    public static SubLObject parse_and_partition_paragraph_texts(final SubLObject paragraph_texts, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == learning_reader.UNPROVIDED) {
            domain_mt = learning_reader.$const431$CurrentWorldDataCollectorMt;
        }
        if (max_parses == learning_reader.UNPROVIDED) {
            max_parses = (SubLObject)learning_reader.NIL;
        }
        if (max_time == learning_reader.UNPROVIDED) {
            max_time = (SubLObject)learning_reader.$int432$30;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (learning_reader.NIL == Filesys.directory_p(results_directory)) {
            file_utilities.make_directory_recursive(results_directory, (SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$str436$775);
        }
        else if (learning_reader.NIL != Filesys.directory(results_directory, (SubLObject)learning_reader.UNPROVIDED)) {
            Errors.error((SubLObject)learning_reader.$str437$_S_is_not_empty, results_directory);
        }
        final SubLObject results_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)learning_reader.EQUAL), (SubLObject)learning_reader.UNPROVIDED);
        final SubLObject results_dictionary_file = file_utilities.relative_filename(results_directory, (SubLObject)learning_reader.$str438$results_dictionary_cfasl, (SubLObject)learning_reader.UNPROVIDED);
        SubLObject paragraph_num = (SubLObject)learning_reader.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)learning_reader.$str439$Parsing_and_partioning_paragraphs, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(paragraph_texts), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)learning_reader.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)learning_reader.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)learning_reader.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = paragraph_texts;
                SubLObject paragraph_text = (SubLObject)learning_reader.NIL;
                paragraph_text = csome_list_var.first();
                while (learning_reader.NIL != csome_list_var) {
                    final SubLObject subl_paragraph_text = (learning_reader.NIL != unicode_nauts.unicode_naut_p(paragraph_text, (SubLObject)learning_reader.UNPROVIDED)) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(paragraph_text, (SubLObject)learning_reader.UNPROVIDED), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED) : paragraph_text;
                    SubLObject results = (SubLObject)learning_reader.NIL;
                    SubLObject list_var_$45 = (SubLObject)learning_reader.NIL;
                    SubLObject sentence = (SubLObject)learning_reader.NIL;
                    SubLObject sentence_num = (SubLObject)learning_reader.NIL;
                    list_var_$45 = document.sentencify_string(subl_paragraph_text);
                    sentence = list_var_$45.first();
                    for (sentence_num = (SubLObject)learning_reader.ZERO_INTEGER; learning_reader.NIL != list_var_$45; list_var_$45 = list_var_$45.rest(), sentence = list_var_$45.first(), sentence_num = Numbers.add((SubLObject)learning_reader.ONE_INTEGER, sentence_num)) {
                        final SubLObject good = (SubLObject)learning_reader.NIL;
                        final SubLObject maybe = (SubLObject)learning_reader.NIL;
                        final SubLObject bad = (SubLObject)learning_reader.NIL;
                        if (learning_reader.NIL != good || learning_reader.NIL != maybe || learning_reader.NIL != bad) {
                            results = list_utilities.alist_enter(results, sentence, (SubLObject)ConsesLow.list(good, maybe, bad), (SubLObject)learning_reader.UNPROVIDED);
                            dictionary.dictionary_enter(results_dictionary, (SubLObject)ConsesLow.list(paragraph_num, sentence_num), (SubLObject)ConsesLow.list((SubLObject)learning_reader.$kw440$SENTENCE, sentence, (SubLObject)learning_reader.$kw441$GOOD, good, (SubLObject)learning_reader.$kw442$BAD, bad, (SubLObject)learning_reader.$kw443$MAYBE, maybe));
                            cfasl_utilities.cfasl_save_externalized(results_dictionary, results_dictionary_file);
                        }
                    }
                    if (learning_reader.NIL != results) {
                        final SubLObject results_file = file_utilities.relative_filename(results_directory, partioned_parse_results_file_name(subl_paragraph_text, results_directory), (SubLObject)learning_reader.UNPROVIDED);
                        Errors.warn((SubLObject)learning_reader.$str444$Writing_results_to__S, results_file);
                        SubLObject stream = (SubLObject)learning_reader.NIL;
                        try {
                            stream = compatibility.open_text(results_file, (SubLObject)learning_reader.$kw376$OUTPUT);
                            if (!stream.isStream()) {
                                Errors.error((SubLObject)learning_reader.$str377$Unable_to_open__S, results_file);
                            }
                            final SubLObject results_stream = stream;
                            SubLObject cdolist_list_var = results;
                            SubLObject cons = (SubLObject)learning_reader.NIL;
                            cons = cdolist_list_var.first();
                            while (learning_reader.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject sentence2 = (SubLObject)learning_reader.NIL;
                                SubLObject partitioned_parses = (SubLObject)learning_reader.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)learning_reader.$list445);
                                sentence2 = current.first();
                                current = (partitioned_parses = current.rest());
                                SubLObject current_$47;
                                final SubLObject datum_$46 = current_$47 = partitioned_parses;
                                SubLObject good2 = (SubLObject)learning_reader.NIL;
                                SubLObject maybe2 = (SubLObject)learning_reader.NIL;
                                SubLObject bad2 = (SubLObject)learning_reader.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)learning_reader.$list446);
                                good2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)learning_reader.$list446);
                                maybe2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)learning_reader.$list446);
                                bad2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                if (learning_reader.NIL == current_$47) {
                                    write_partioned_parse_results(results_stream, sentence2, good2, maybe2, bad2);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$46, (SubLObject)learning_reader.$list446);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream.isStream()) {
                                    streams_high.close(stream, (SubLObject)learning_reader.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    paragraph_num = Numbers.add(paragraph_num, (SubLObject)learning_reader.ONE_INTEGER);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)learning_reader.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    paragraph_text = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)learning_reader.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
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
        return results_directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 81830L)
    public static SubLObject partioned_parse_results_file_name(final SubLObject subl_paragraph_text, final SubLObject directory) {
        final SubLObject length = (SubLObject)learning_reader.TEN_INTEGER;
        final SubLObject base;
        SubLObject name = base = list_utilities.remove_if_not((SubLObject)learning_reader.$sym447$ALPHANUMERICP, string_utilities.substring(subl_paragraph_text, (SubLObject)learning_reader.ZERO_INTEGER, length), (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED);
        SubLObject doneP = (SubLObject)learning_reader.NIL;
        if (learning_reader.NIL == doneP) {
            SubLObject ext = (SubLObject)learning_reader.NIL;
            ext = (SubLObject)learning_reader.ONE_INTEGER;
            while (learning_reader.NIL == doneP) {
                name = PrintLow.format((SubLObject)learning_reader.NIL, (SubLObject)learning_reader.$str448$_A__3__0D, base, ext);
                if (learning_reader.NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, (SubLObject)learning_reader.UNPROVIDED))) {
                    doneP = (SubLObject)learning_reader.T;
                }
                ext = number_utilities.f_1X(ext);
            }
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 82239L)
    public static SubLObject write_partioned_parse_results(final SubLObject results_stream, final SubLObject sentence, final SubLObject good, final SubLObject maybe, final SubLObject bad) {
        if (learning_reader.NIL != good || learning_reader.NIL != bad || learning_reader.NIL != maybe) {
            print_high.print(sentence, results_stream);
            streams_high.terpri(results_stream);
        }
        if (learning_reader.NIL != good) {
            print_high.princ((SubLObject)learning_reader.$str449$Known_bindings_, results_stream);
            SubLObject cdolist_list_var = good;
            SubLObject good_one = (SubLObject)learning_reader.NIL;
            good_one = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                write_partioned_parse_result(good_one, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                good_one = cdolist_list_var.first();
            }
            streams_high.terpri(results_stream);
        }
        if (learning_reader.NIL != maybe) {
            print_high.princ((SubLObject)learning_reader.$str450$Consistent_, results_stream);
            SubLObject cdolist_list_var = maybe;
            SubLObject parse = (SubLObject)learning_reader.NIL;
            parse = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
            streams_high.terpri(results_stream);
        }
        if (learning_reader.NIL != bad) {
            print_high.princ((SubLObject)learning_reader.$str451$Known_false_, results_stream);
            SubLObject cdolist_list_var = bad;
            SubLObject parse = (SubLObject)learning_reader.NIL;
            parse = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        return results_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 82996L)
    public static SubLObject write_partioned_parse_result(final SubLObject parse, final SubLObject results_stream) {
        print_high.print(cycl_utilities.expression_transform(parse, (SubLObject)learning_reader.$sym265$NART_P, (SubLObject)learning_reader.$sym452$NART_HL_FORMULA, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED), results_stream);
        return results_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 83168L)
    public static SubLObject l2r_paragraph_candidate_noun_compounds(final SubLObject paragraph) {
        assert learning_reader.NIL != forts.fort_p(paragraph) : paragraph;
        SubLObject candidate_noun_compounds = (SubLObject)learning_reader.NIL;
        final SubLObject html_source = l2r_get_source_html(paragraph);
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = sentencify_l2r_paragraph(html_source);
        final SubLObject backwardP_var = (SubLObject)learning_reader.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject candidate_noun_compound;
        SubLObject item_var;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)learning_reader.NIL, v_iteration = (SubLObject)learning_reader.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)learning_reader.ONE_INTEGER)) {
            element_num = ((learning_reader.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)learning_reader.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            cdolist_list_var = l2r_sentence_candidate_noun_compounds(sentence);
            candidate_noun_compound = (SubLObject)learning_reader.NIL;
            candidate_noun_compound = cdolist_list_var.first();
            while (learning_reader.NIL != cdolist_list_var) {
                item_var = candidate_noun_compound;
                if (learning_reader.NIL == conses_high.member(item_var, candidate_noun_compounds, Symbols.symbol_function((SubLObject)learning_reader.EQUAL), Symbols.symbol_function((SubLObject)learning_reader.IDENTITY))) {
                    candidate_noun_compounds = (SubLObject)ConsesLow.cons(item_var, candidate_noun_compounds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_noun_compound = cdolist_list_var.first();
            }
        }
        return candidate_noun_compounds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 83780L)
    public static SubLObject l2r_sentence_candidate_noun_compounds(final SubLObject sentence) {
        assert learning_reader.NIL != document.sentence_p(sentence) : sentence;
        pos_tagger.tagger_tag_sentence(l2r_noun_compound_tagger(), sentence);
        final SubLObject words = document.sentence_constituents(sentence);
        SubLObject candidate_noun_compounds = (SubLObject)learning_reader.NIL;
        SubLObject cdolist_list_var = l2r_noun_compound_patterns();
        SubLObject pattern = (SubLObject)learning_reader.NIL;
        pattern = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$50 = string_utilities.search_all(pattern, words, Symbols.symbol_function((SubLObject)learning_reader.EQL), Symbols.symbol_function((SubLObject)learning_reader.$sym454$WORD_CATEGORY));
            SubLObject start_pos = (SubLObject)learning_reader.NIL;
            start_pos = cdolist_list_var_$50.first();
            while (learning_reader.NIL != cdolist_list_var_$50) {
                SubLObject strings = (SubLObject)learning_reader.NIL;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = Sequences.length(pattern), i = (SubLObject)learning_reader.NIL, i = (SubLObject)learning_reader.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)learning_reader.ONE_INTEGER)) {
                    strings = (SubLObject)ConsesLow.cons(document.word_string(Vectors.aref(words, Numbers.add(i, start_pos))), strings);
                }
                if (learning_reader.NIL == list_utilities.find_if_not((SubLObject)learning_reader.$sym453$ALPHANUMERIC_STRING_, strings, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED)) {
                    final SubLObject item_var;
                    final SubLObject candidate_noun_compound = item_var = string_utilities.bunge(Sequences.nreverse(strings), (SubLObject)learning_reader.UNPROVIDED);
                    if (learning_reader.NIL == conses_high.member(item_var, candidate_noun_compounds, Symbols.symbol_function((SubLObject)learning_reader.EQUAL), Symbols.symbol_function((SubLObject)learning_reader.IDENTITY))) {
                        candidate_noun_compounds = (SubLObject)ConsesLow.cons(item_var, candidate_noun_compounds);
                    }
                }
                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                start_pos = cdolist_list_var_$50.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pattern = cdolist_list_var.first();
        }
        return candidate_noun_compounds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 84991L)
    public static SubLObject initialize_l2r_noun_compound_patterns() {
        SubLObject patterns = (SubLObject)learning_reader.NIL;
        SubLObject cdolist_list_var = learning_reader.$l2r_noun_compound_category_pairs$.getGlobalValue();
        SubLObject pair = (SubLObject)learning_reader.NIL;
        pair = cdolist_list_var.first();
        while (learning_reader.NIL != cdolist_list_var) {
            final SubLObject pattern = Vectors.make_vector(Sequences.length(pair), (SubLObject)learning_reader.UNPROVIDED);
            SubLObject list_var = (SubLObject)learning_reader.NIL;
            SubLObject tag = (SubLObject)learning_reader.NIL;
            SubLObject n = (SubLObject)learning_reader.NIL;
            list_var = pair;
            tag = list_var.first();
            for (n = (SubLObject)learning_reader.ZERO_INTEGER; learning_reader.NIL != list_var; list_var = list_var.rest(), tag = list_var.first(), n = Numbers.add((SubLObject)learning_reader.ONE_INTEGER, n)) {
                Vectors.set_aref(pattern, n, document.new_word((SubLObject)ConsesLow.list((SubLObject)learning_reader.$kw457$STRING, (SubLObject)learning_reader.$str379$, (SubLObject)learning_reader.$kw458$CATEGORY, tag)));
            }
            patterns = (SubLObject)ConsesLow.cons(pattern, patterns);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        learning_reader.$l2r_noun_compound_patterns$.setGlobalValue(patterns);
        return learning_reader.$l2r_noun_compound_patterns$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 85399L)
    public static SubLObject l2r_noun_compound_patterns() {
        if (!learning_reader.$l2r_noun_compound_patterns$.getGlobalValue().isList()) {
            initialize_l2r_noun_compound_patterns();
        }
        return learning_reader.$l2r_noun_compound_patterns$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 85641L)
    public static SubLObject initialize_l2r_noun_compound_tagger() {
        learning_reader.$l2r_noun_compound_tagger$.setGlobalValue(pos_tagger.new_tagger((SubLObject)learning_reader.UNPROVIDED));
        return learning_reader.$l2r_noun_compound_tagger$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/learning-reader.lisp", position = 85783L)
    public static SubLObject l2r_noun_compound_tagger() {
        if (learning_reader.NIL == pos_tagger.tagger_p(learning_reader.$l2r_noun_compound_tagger$.getGlobalValue())) {
            initialize_l2r_noun_compound_tagger();
        }
        return learning_reader.$l2r_noun_compound_tagger$.getGlobalValue();
    }
    
    public static SubLObject declare_learning_reader_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "default_learning_reader_cyclist", "DEFAULT-LEARNING-READER-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert", "L2R-ASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_unassert_assertion", "L2R-UNASSERT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_create", "L2R-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "add_text_learner_ebmt_training_example", "ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "create_and_add_l2r_ebmt_template", "CREATE-AND-ADD-L2R-EBMT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_ebmt_parse", "L2R-EBMT-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reader_image_run", "L2R-READER-IMAGE-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reader_image_read_document", "L2R-READER-IMAGE-READ-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_read_document", "L2R-READ-DOCUMENT", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.learning_reader", "l2r_computing_cpu_time", "L2R-COMPUTING-CPU-TIME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_image_elapsed_cpu_time", "L2R-IMAGE-ELAPSED-CPU-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_read_paragraph", "L2R-READ-PARAGRAPH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_print_function_trampoline", "L2R-PARAGRAPH-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_p", "L2R-PARAGRAPH-READER-P", 1, 0, false);
        new $l2r_paragraph_reader_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_paragraph", "L2R-PARAGRAPH-READER-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_document", "L2R-PARAGRAPH-READER-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_paragraph_source_html", "L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_vector", "L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_pegs", "L2R-PARAGRAPH-READER-SENTENCE-PEGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_non_html_texts", "L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_number", "L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_linkage", "L2R-PARAGRAPH-READER-LINKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_linkage_fort", "L2R-PARAGRAPH-READER-LINKAGE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_initial_assertion_count", "L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_total_time", "L2R-PARAGRAPH-READER-TOTAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_total_cpu_time", "L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_time", "L2R-PARAGRAPH-READER-SENTENCE-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_sentence_cpu_time", "L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_state", "L2R-PARAGRAPH-READER-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_paragraph", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_document", "_CSETF-L2R-PARAGRAPH-READER-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_paragraph_source_html", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_vector", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_pegs", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_non_html_texts", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_number", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_linkage", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_linkage_fort", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_initial_assertion_count", "_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_total_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_total_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_sentence_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_paragraph_reader_state", "_CSETF-L2R-PARAGRAPH-READER-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "make_l2r_paragraph_reader", "MAKE-L2R-PARAGRAPH-READER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "visit_defstruct_l2r_paragraph_reader", "VISIT-DEFSTRUCT-L2R-PARAGRAPH-READER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "visit_defstruct_object_l2r_paragraph_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-PARAGRAPH-READER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "print_l2r_paragraph_reader", "PRINT-L2R-PARAGRAPH-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "new_l2r_paragraph_reader", "NEW-L2R-PARAGRAPH-READER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_get_source_html", "L2R-GET-SOURCE-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_source_html", "L2R-ASSERT-SOURCE-HTML", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_next_in_separate_thread", "L2R-PARAGRAPH-READER-NEXT-IN-SEPARATE-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_next", "L2R-PARAGRAPH-READER-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_next_action", "L2R-PARAGRAPH-READER-NEXT-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "destroy_l2r_paragraph_reader", "DESTROY-L2R-PARAGRAPH-READER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.learning_reader", "updating_l2r_paragraph_reader_times", "UPDATING-L2R-PARAGRAPH-READER-TIMES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.learning_reader", "with_temporary_transmit_state", "WITH-TEMPORARY-TRANSMIT-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.learning_reader", "with_temporary_receive_state", "WITH-TEMPORARY-RECEIVE-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "reset_l2r_paragraph_reader_sentence_times", "RESET-L2R-PARAGRAPH-READER-SENTENCE-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "new_l2r_reading_event_for_document", "NEW-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "find_unfinished_l2r_reading_event_for_document", "FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "note_l2r_reading_event_ongoing", "NOTE-L2R-READING-EVENT-ONGOING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "note_l2r_reading_event_done", "NOTE-L2R-READING-EVENT-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_find_or_create_pegs_for_sentence", "L2R-PARAGRAPH-READER-FIND-OR-CREATE-PEGS-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_find_or_assert_linkage", "L2R-PARAGRAPH-READER-FIND-OR-ASSERT-LINKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage", "L2R-PARAGRAPH-READER-MAYBE-ASSERT-PARSE-TREE-FOR-LINKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_tokenization_has_parse_treeP", "L2R-TOKENIZATION-HAS-PARSE-TREE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_maybe_add_parsing_results", "L2R-PARAGRAPH-READER-MAYBE-ADD-PARSING-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_add_parsing_results", "L2R-PARAGRAPH-READER-ADD-PARSING-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_finalize_sentence", "L2R-PARAGRAPH-READER-FINALIZE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_finalize_sentence_peg", "L2R-FINALIZE-SENTENCE-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_reader_collect_garbage", "L2R-PARAGRAPH-READER-COLLECT-GARBAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_collect_garbage_for_sentence_pegs", "L2R-COLLECT-GARBAGE-FOR-SENTENCE-PEGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_read_paragraph_internal", "L2R-READ-PARAGRAPH-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_sentence_peg_results", "L2R-ASSERT-SENTENCE-PEG-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_query_spec_results_for_sentence_peg", "L2R-ASSERT-QUERY-SPEC-RESULTS-FOR-SENTENCE-PEG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_distillation_query_results", "L2R-ASSERT-DISTILLATION-QUERY-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_finalization_query_specs", "L2R-FINALIZATION-QUERY-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_garbage_collection_query_specs", "L2R-GARBAGE-COLLECTION-QUERY-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_distillation_query_specs", "L2R-DISTILLATION-QUERY-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "kbq_from_query_running", "KBQ-FROM-QUERY-RUNNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_run_finalization_query_for_sentence_peg", "L2R-RUN-FINALIZATION-QUERY-FOR-SENTENCE-PEG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_print_total_time", "L2R-PRINT-TOTAL-TIME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_readable_time_string", "L2R-READABLE-TIME-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "launch_long_inference_warner", "LAUNCH-LONG-INFERENCE-WARNER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "warn_about_long_inferences", "WARN-ABOUT-LONG-INFERENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_read_document_sentence", "L2R-READ-DOCUMENT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_read_sentence_for_peg", "L2R-READ-SENTENCE-FOR-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_or_assert_linkage_for_peg", "L2R-FIND-OR-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_linkage_for_peg", "L2R-FIND-LINKAGE-FOR-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_linkage_for_peg", "L2R-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_parse_tree_for_linkage", "L2R-ASSERT-PARSE-TREE-FOR-LINKAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_linkage_creation_rules", "L2R-LINKAGE-CREATION-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_new_tokenization_shell_for_peg", "L2R-NEW-TOKENIZATION-SHELL-FOR-PEG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_tokenization_for_peg", "L2R-FIND-TOKENIZATION-FOR-PEG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_peg_text", "L2R-SENTENCE-PEG-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reader_image_find_or_create_document_reader", "L2R-READER-IMAGE-FIND-OR-CREATE-DOCUMENT-READER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_new_reader_for_document", "L2R-NEW-READER-FOR-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_print_function_trampoline", "L2R-DOCUMENT-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_p", "L2R-DOCUMENT-READER-P", 1, 0, false);
        new $l2r_document_reader_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_document", "L2R-DOCUMENT-READER-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_remaining_paragraphs", "L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_read_paragraphs", "L2R-DOCUMENT-READER-READ-PARAGRAPHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_paragraph_reader", "L2R-DOCUMENT-READER-PARAGRAPH-READER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_reading_event", "L2R-DOCUMENT-READER-READING-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_document_reader_document", "_CSETF-L2R-DOCUMENT-READER-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_document_reader_remaining_paragraphs", "_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_document_reader_read_paragraphs", "_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_document_reader_paragraph_reader", "_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "_csetf_l2r_document_reader_reading_event", "_CSETF-L2R-DOCUMENT-READER-READING-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "make_l2r_document_reader", "MAKE-L2R-DOCUMENT-READER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "visit_defstruct_l2r_document_reader", "VISIT-DEFSTRUCT-L2R-DOCUMENT-READER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "visit_defstruct_object_l2r_document_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-DOCUMENT-READER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "print_l2r_document_reader", "PRINT-L2R-DOCUMENT-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "new_l2r_document_reader", "NEW-L2R-DOCUMENT-READER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "get_l2r_reader_image_document_reader", "GET-L2R-READER-IMAGE-DOCUMENT-READER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "set_l2r_reader_image_document_reader", "SET-L2R-READER-IMAGE-DOCUMENT-READER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_read_document", "L2R-DOCUMENT-READER-READ-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_find_or_create_paragraph_reader", "L2R-DOCUMENT-READER-FIND-OR-CREATE-PARAGRAPH-READER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_reader_get_new_paragraph_reader", "L2R-DOCUMENT-READER-GET-NEW-PARAGRAPH-READER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_pick_document_to_read", "L2R-PICK-DOCUMENT-TO-READ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "starts_before_starting_ofP", "STARTS-BEFORE-STARTING-OF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_image_file", "L2R-IMAGE-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "write_l2r_image_for_document", "WRITE-L2R-IMAGE-FOR-DOCUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_or_create_document_paragraphs", "L2R-FIND-OR-CREATE-DOCUMENT-PARAGRAPHS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_or_create_webpage_paragraphs", "L2R-FIND-OR-CREATE-WEBPAGE-PARAGRAPHS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_download_webpage", "L2R-DOWNLOAD-WEBPAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_most_recent_webpage_download", "L2R-MOST-RECENT-WEBPAGE-DOWNLOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_webpage_paragraphs", "L2R-FIND-WEBPAGE-PARAGRAPHS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reify_webpage_paragraphs", "L2R-REIFY-WEBPAGE-PARAGRAPHS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_identify_webpage_paragraphs", "L2R-IDENTIFY-WEBPAGE-PARAGRAPHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_next_webpage_paragraph", "L2R-FIND-NEXT-WEBPAGE-PARAGRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reify_one_webpage_paragraph", "L2R-REIFY-ONE-WEBPAGE-PARAGRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_best_webpage_source", "L2R-BEST-WEBPAGE-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reify_sentence_level_pegs_for_document", "L2R-REIFY-SENTENCE-LEVEL-PEGS-FOR-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reify_peg_for_sentence", "L2R-REIFY-PEG-FOR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_or_reify_peg_for_sentence_string", "L2R-FIND-OR-REIFY-PEG-FOR-SENTENCE-STRING", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_find_sentence_peg_from_sentences", "L2R-FIND-SENTENCE-PEG-FROM-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_level_peg_creation_template", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_level_peg_creation_template", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_creation_template_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_creation_template", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_level_peg_exemplar", "CLEAR-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_level_peg_exemplar", "REMOVE-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_exemplar_internal", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_exemplar", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_creation_rules", "L2R-SENTENCE-LEVEL-PEG-CREATION-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_level_peg_creation_template_sentences", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_level_peg_creation_template_sentences", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_creation_template_sentences_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_level_peg_creation_template_sentences", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_dereference_sentence_level_peg_assertion_sentence", "L2R-DEREFERENCE-SENTENCE-LEVEL-PEG-ASSERTION-SENTENCE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_document_indexical", "CLEAR-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_document_indexical", "REMOVE-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_indexical_internal", "L2R-DOCUMENT-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_indexical", "L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_indexical", "CLEAR-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_indexical", "REMOVE-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_indexical_internal", "L2R-SENTENCE-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_indexical", "L2R-SENTENCE-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_supertext_indexical", "CLEAR-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_supertext_indexical", "REMOVE-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_supertext_indexical_internal", "L2R-SUPERTEXT-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_supertext_indexical", "L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_string_indexical", "CLEAR-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_string_indexical", "REMOVE-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_string_indexical_internal", "L2R-SENTENCE-STRING-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_string_indexical", "L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_number_indexical", "CLEAR-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_number_indexical", "REMOVE-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_number_indexical_internal", "L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_number_indexical", "L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_sentence_string_number_indexical", "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_sentence_string_number_indexical", "REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_string_number_indexical_internal", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_string_number_indexical", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "get_l2r_sentence_level_peg_creation_template_sentences", "GET-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "sentencify_l2r_paragraph", "SENTENCIFY-L2R-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "set_l2r_sentence_string", "SET-L2R-SENTENCE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_reconstruct_word_string", "L2R-RECONSTRUCT-WORD-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_word_length", "L2R-WORD-LENGTH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_word_leading_whitespace", "L2R-WORD-LEADING-WHITESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_assert_subexpression_links", "L2R-ASSERT-SUBEXPRESSION-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_extract_links_from_sentence", "L2R-EXTRACT-LINKS-FROM-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sanity_check_subexpression", "L2R-SANITY-CHECK-SUBEXPRESSION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentences_for_document", "L2R-SENTENCES-FOR-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "clear_l2r_document_sentence_finder_kbq", "CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "remove_l2r_document_sentence_finder_kbq", "REMOVE-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_sentence_finder_kbq_internal", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_sentence_finder_kbq", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_document_sentence_finder_query_sentence", "L2R-DOCUMENT-SENTENCE-FINDER-QUERY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "simple_assert_linkages_for_page", "SIMPLE-ASSERT-LINKAGES-FOR-PAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_cyclify_webpage", "L2R-CYCLIFY-WEBPAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_write_webpage_links", "L2R-WRITE-WEBPAGE-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_cyclify_wikipedia_pages_for_unknown_phrases", "L2R-CYCLIFY-WIKIPEDIA-PAGES-FOR-UNKNOWN-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_get_unknown_phrase_wikipedia_links_from_file", "L2R-GET-UNKNOWN-PHRASE-WIKIPEDIA-LINKS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "extract_link_relative_url", "EXTRACT-LINK-RELATIVE-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "unknown_phrase_wikipedia_linkP", "UNKNOWN-PHRASE-WIKIPEDIA-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "unknown_phrase_linkP", "UNKNOWN-PHRASE-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_save_new_webpage_sentences", "L2R-SAVE-NEW-WEBPAGE-SENTENCES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_cyclify_unparsed_sentences", "L2R-CYCLIFY-UNPARSED-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_log_cyclifications_for_unparsed_sentences", "L2R-LOG-CYCLIFICATIONS-FOR-UNPARSED-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "html_eos_open_tags", "HTML-EOS-OPEN-TAGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "html_eos_close_tags", "HTML-EOS-CLOSE-TAGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "wikipedia_meta_strings", "WIKIPEDIA-META-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "replace_separator_tags_with_eos", "REPLACE-SEPARATOR-TAGS-WITH-EOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "strip_text_between_tags_of_type", "STRIP-TEXT-BETWEEN-TAGS-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "strip_wikipedia_page", "STRIP-WIKIPEDIA-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "probably_wikipedia_meta_sentence_p", "PROBABLY-WIKIPEDIA-META-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "detagged_page_as_string", "DETAGGED-PAGE-AS-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_stringify_one_paragraph", "L2R-STRINGIFY-ONE-PARAGRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_stringify_one_sentence", "L2R-STRINGIFY-ONE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "detagged_page_as_string_old", "DETAGGED-PAGE-AS-STRING-OLD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "page_to_detagged_sentence_strings", "PAGE-TO-DETAGGED-SENTENCE-STRINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "parse_and_partition_document_file", "PARSE-AND-PARTITION-DOCUMENT-FILE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "read_topic_struct_paragraphs_from_file", "READ-TOPIC-STRUCT-PARAGRAPHS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "parse_and_partition_paragraph_texts", "PARSE-AND-PARTITION-PARAGRAPH-TEXTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "partioned_parse_results_file_name", "PARTIONED-PARSE-RESULTS-FILE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "write_partioned_parse_results", "WRITE-PARTIONED-PARSE-RESULTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "write_partioned_parse_result", "WRITE-PARTIONED-PARSE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_paragraph_candidate_noun_compounds", "L2R-PARAGRAPH-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_sentence_candidate_noun_compounds", "L2R-SENTENCE-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "initialize_l2r_noun_compound_patterns", "INITIALIZE-L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_noun_compound_patterns", "L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "initialize_l2r_noun_compound_tagger", "INITIALIZE-L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.learning_reader", "l2r_noun_compound_tagger", "L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        return (SubLObject)learning_reader.NIL;
    }
    
    public static SubLObject init_learning_reader_file() {
        learning_reader.$learning_reader_timestamp$ = SubLFiles.deflexical("*LEARNING-READER-TIMESTAMP*", numeric_date_utilities.timestamp((SubLObject)learning_reader.UNPROVIDED, (SubLObject)learning_reader.UNPROVIDED));
        learning_reader.$l2r_ebmt_index_host$ = SubLFiles.deflexical("*L2R-EBMT-INDEX-HOST*", (SubLObject)learning_reader.$str4$cyc8_cyc_com);
        learning_reader.$l2r_ebmt_index_port$ = SubLFiles.deflexical("*L2R-EBMT-INDEX-PORT*", (SubLObject)learning_reader.$int5$7779);
        learning_reader.$l2r_ebmt_index_content$ = SubLFiles.deflexical("*L2R-EBMT-INDEX-CONTENT*", (SubLObject)learning_reader.$str6$_cyc_projects_reading_learning_da);
        learning_reader.$l2r_ebmt_index_log$ = SubLFiles.deflexical("*L2R-EBMT-INDEX-LOG*", (SubLObject)learning_reader.$str7$_cyc_projects_reading_learning_da);
        learning_reader.$l2r_transmit_operationsP$ = SubLFiles.defparameter("*L2R-TRANSMIT-OPERATIONS?*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_reader_unstable_inside_stepsP$ = SubLFiles.defparameter("*L2R-READER-UNSTABLE-INSIDE-STEPS?*", (SubLObject)learning_reader.T);
        learning_reader.$dtp_l2r_paragraph_reader$ = SubLFiles.defconstant("*DTP-L2R-PARAGRAPH-READER*", (SubLObject)learning_reader.$sym32$L2R_PARAGRAPH_READER);
        learning_reader.$l2r_finalization_problem_store$ = SubLFiles.defparameter("*L2R-FINALIZATION-PROBLEM-STORE*", (SubLObject)learning_reader.NIL);
        learning_reader.$long_inference_cutoff$ = SubLFiles.deflexical("*LONG-INFERENCE-CUTOFF*", (SubLObject)learning_reader.$int197$600);
        learning_reader.$current_long_inference_info$ = SubLFiles.defparameter("*CURRENT-LONG-INFERENCE-INFO*", (SubLObject)learning_reader.NIL);
        learning_reader.$dtp_l2r_document_reader$ = SubLFiles.defconstant("*DTP-L2R-DOCUMENT-READER*", (SubLObject)learning_reader.$sym216$L2R_DOCUMENT_READER);
        learning_reader.$l2r_reader_image_document_reader$ = SubLFiles.deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", (SubLObject)(maybeDefault((SubLObject)learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_, learning_reader.$l2r_reader_image_document_reader$, learning_reader.NIL)));
        learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_document_indexical_caching_state$ = SubLFiles.deflexical("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_indexical_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_supertext_indexical_caching_state$ = SubLFiles.deflexical("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_string_indexical_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_number_indexical_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_sentence_string_number_indexical_caching_state$ = SubLFiles.deflexical("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$l2r_document_sentence_finder_kbq_caching_state$ = SubLFiles.deflexical("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*", (SubLObject)learning_reader.NIL);
        learning_reader.$html_implicit_eos_tags$ = SubLFiles.deflexical("*HTML-IMPLICIT-EOS-TAGS*", (SubLObject)learning_reader.$list402);
        learning_reader.$html_eos_open_tags$ = SubLFiles.deflexical("*HTML-EOS-OPEN-TAGS*", (SubLObject)learning_reader.NIL);
        learning_reader.$html_eos_close_tags$ = SubLFiles.deflexical("*HTML-EOS-CLOSE-TAGS*", (SubLObject)learning_reader.NIL);
        learning_reader.$wikipedia_meta_strings$ = SubLFiles.deflexical("*WIKIPEDIA-META-STRINGS*", (SubLObject)learning_reader.$list407);
        learning_reader.$l2r_noun_compound_patterns$ = SubLFiles.deflexical("*L2R-NOUN-COMPOUND-PATTERNS*", (SubLObject)learning_reader.$kw455$UNINITIALIZED);
        learning_reader.$l2r_noun_compound_category_pairs$ = SubLFiles.deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", (SubLObject)learning_reader.$list456);
        learning_reader.$l2r_noun_compound_tagger$ = SubLFiles.deflexical("*L2R-NOUN-COMPOUND-TAGGER*", (SubLObject)learning_reader.$kw455$UNINITIALIZED);
        return (SubLObject)learning_reader.NIL;
    }
    
    public static SubLObject setup_learning_reader_file() {
        utilities_macros.register_kb_function((SubLObject)learning_reader.$sym9$ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE);
        access_macros.register_macro_helper((SubLObject)learning_reader.$sym27$L2R_IMAGE_ELAPSED_CPU_TIME, (SubLObject)learning_reader.$sym28$L2R_COMPUTING_CPU_TIME);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), Symbols.symbol_function((SubLObject)learning_reader.$sym39$L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)learning_reader.$list40);
        Structures.def_csetf((SubLObject)learning_reader.$sym41$L2R_PARAGRAPH_READER_PARAGRAPH, (SubLObject)learning_reader.$sym42$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH);
        Structures.def_csetf((SubLObject)learning_reader.$sym43$L2R_PARAGRAPH_READER_DOCUMENT, (SubLObject)learning_reader.$sym44$_CSETF_L2R_PARAGRAPH_READER_DOCUMENT);
        Structures.def_csetf((SubLObject)learning_reader.$sym45$L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML, (SubLObject)learning_reader.$sym46$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML);
        Structures.def_csetf((SubLObject)learning_reader.$sym47$L2R_PARAGRAPH_READER_SENTENCE_VECTOR, (SubLObject)learning_reader.$sym48$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR);
        Structures.def_csetf((SubLObject)learning_reader.$sym49$L2R_PARAGRAPH_READER_SENTENCE_PEGS, (SubLObject)learning_reader.$sym50$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS);
        Structures.def_csetf((SubLObject)learning_reader.$sym51$L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS, (SubLObject)learning_reader.$sym52$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS);
        Structures.def_csetf((SubLObject)learning_reader.$sym53$L2R_PARAGRAPH_READER_SENTENCE_NUMBER, (SubLObject)learning_reader.$sym54$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER);
        Structures.def_csetf((SubLObject)learning_reader.$sym55$L2R_PARAGRAPH_READER_LINKAGE, (SubLObject)learning_reader.$sym56$_CSETF_L2R_PARAGRAPH_READER_LINKAGE);
        Structures.def_csetf((SubLObject)learning_reader.$sym57$L2R_PARAGRAPH_READER_LINKAGE_FORT, (SubLObject)learning_reader.$sym58$_CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT);
        Structures.def_csetf((SubLObject)learning_reader.$sym59$L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT, (SubLObject)learning_reader.$sym60$_CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT);
        Structures.def_csetf((SubLObject)learning_reader.$sym61$L2R_PARAGRAPH_READER_TOTAL_TIME, (SubLObject)learning_reader.$sym62$_CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME);
        Structures.def_csetf((SubLObject)learning_reader.$sym63$L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, (SubLObject)learning_reader.$sym64$_CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME);
        Structures.def_csetf((SubLObject)learning_reader.$sym65$L2R_PARAGRAPH_READER_SENTENCE_TIME, (SubLObject)learning_reader.$sym66$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME);
        Structures.def_csetf((SubLObject)learning_reader.$sym67$L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, (SubLObject)learning_reader.$sym68$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME);
        Structures.def_csetf((SubLObject)learning_reader.$sym69$L2R_PARAGRAPH_READER_STATE, (SubLObject)learning_reader.$sym70$_CSETF_L2R_PARAGRAPH_READER_STATE);
        Equality.identity((SubLObject)learning_reader.$sym32$L2R_PARAGRAPH_READER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_paragraph_reader$.getGlobalValue(), Symbols.symbol_function((SubLObject)learning_reader.$sym91$VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), Symbols.symbol_function((SubLObject)learning_reader.$sym223$L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)learning_reader.$list224);
        Structures.def_csetf((SubLObject)learning_reader.$sym225$L2R_DOCUMENT_READER_DOCUMENT, (SubLObject)learning_reader.$sym226$_CSETF_L2R_DOCUMENT_READER_DOCUMENT);
        Structures.def_csetf((SubLObject)learning_reader.$sym227$L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS, (SubLObject)learning_reader.$sym228$_CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS);
        Structures.def_csetf((SubLObject)learning_reader.$sym229$L2R_DOCUMENT_READER_READ_PARAGRAPHS, (SubLObject)learning_reader.$sym230$_CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS);
        Structures.def_csetf((SubLObject)learning_reader.$sym231$L2R_DOCUMENT_READER_PARAGRAPH_READER, (SubLObject)learning_reader.$sym232$_CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER);
        Structures.def_csetf((SubLObject)learning_reader.$sym233$L2R_DOCUMENT_READER_READING_EVENT, (SubLObject)learning_reader.$sym234$_CSETF_L2R_DOCUMENT_READER_READING_EVENT);
        Equality.identity((SubLObject)learning_reader.$sym216$L2R_DOCUMENT_READER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), learning_reader.$dtp_l2r_document_reader$.getGlobalValue(), Symbols.symbol_function((SubLObject)learning_reader.$sym240$VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)learning_reader.$sym242$_L2R_READER_IMAGE_DOCUMENT_READER_);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym300$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym304$L2R_SENTENCE_LEVEL_PEG_EXEMPLAR);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym310$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym315$L2R_DOCUMENT_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym319$L2R_SENTENCE_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym323$L2R_SUPERTEXT_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym327$L2R_SENTENCE_STRING_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym331$L2R_SENTENCE_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym335$L2R_SENTENCE_STRING_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function((SubLObject)learning_reader.$sym363$L2R_DOCUMENT_SENTENCE_FINDER_KBQ);
        return (SubLObject)learning_reader.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_learning_reader_file();
    }
    
    @Override
	public void initializeVariables() {
        init_learning_reader_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_learning_reader_file();
    }
    
    static {
        me = (SubLFile)new learning_reader();
        learning_reader.$learning_reader_timestamp$ = null;
        learning_reader.$l2r_ebmt_index_host$ = null;
        learning_reader.$l2r_ebmt_index_port$ = null;
        learning_reader.$l2r_ebmt_index_content$ = null;
        learning_reader.$l2r_ebmt_index_log$ = null;
        learning_reader.$l2r_transmit_operationsP$ = null;
        learning_reader.$l2r_reader_unstable_inside_stepsP$ = null;
        learning_reader.$dtp_l2r_paragraph_reader$ = null;
        learning_reader.$l2r_finalization_problem_store$ = null;
        learning_reader.$long_inference_cutoff$ = null;
        learning_reader.$current_long_inference_info$ = null;
        learning_reader.$dtp_l2r_document_reader$ = null;
        learning_reader.$l2r_reader_image_document_reader$ = null;
        learning_reader.$l2r_sentence_level_peg_creation_template_caching_state$ = null;
        learning_reader.$l2r_sentence_level_peg_exemplar_caching_state$ = null;
        learning_reader.$l2r_sentence_level_peg_creation_template_sentences_caching_state$ = null;
        learning_reader.$l2r_document_indexical_caching_state$ = null;
        learning_reader.$l2r_sentence_indexical_caching_state$ = null;
        learning_reader.$l2r_supertext_indexical_caching_state$ = null;
        learning_reader.$l2r_sentence_string_indexical_caching_state$ = null;
        learning_reader.$l2r_sentence_number_indexical_caching_state$ = null;
        learning_reader.$l2r_sentence_string_number_indexical_caching_state$ = null;
        learning_reader.$l2r_document_sentence_finder_kbq_caching_state$ = null;
        learning_reader.$html_implicit_eos_tags$ = null;
        learning_reader.$html_eos_open_tags$ = null;
        learning_reader.$html_eos_close_tags$ = null;
        learning_reader.$wikipedia_meta_strings$ = null;
        learning_reader.$l2r_noun_compound_patterns$ = null;
        learning_reader.$l2r_noun_compound_category_pairs$ = null;
        learning_reader.$l2r_noun_compound_tagger$ = null;
        $const0$Cyc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc"));
        $const1$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str2$L2R__Failed_asserting____S___in__ = SubLObjectFactory.makeString("L2R: Failed asserting~% ~S~% in ~S:~% ~S");
        $str3$L2R_ = SubLObjectFactory.makeString("L2R-");
        $str4$cyc8_cyc_com = SubLObjectFactory.makeString("cyc8.cyc.com");
        $int5$7779 = SubLObjectFactory.makeInteger(7779);
        $str6$_cyc_projects_reading_learning_da = SubLObjectFactory.makeString("/cyc/projects/reading-learning/data/ebmt-index.txt");
        $str7$_cyc_projects_reading_learning_da = SubLObjectFactory.makeString("/cyc/projects/reading-learning/data/ebmt-index.log");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-SENT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SENT"));
        $sym9$ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE = SubLObjectFactory.makeSymbol("ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE");
        $str10$_A_now___ = SubLObjectFactory.makeString("~A now...");
        $str11$Halting_image = SubLObjectFactory.makeString("Halting image");
        $sym12$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $str13$Finished_reading__S_ = SubLObjectFactory.makeString("Finished reading ~S.");
        $const14$PropositionalConceptualWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PropositionalConceptualWork"));
        $str15$The_TextLearner_can_only_read_ins = SubLObjectFactory.makeString("The TextLearner can only read instances of #$PropositionalConceptualWork, which ~S does not appear to be.");
        $str16$Reading_ = SubLObjectFactory.makeString("Reading ");
        $str17$Couldn_t_find_any_paragraphs_reif = SubLObjectFactory.makeString("Couldn't find any paragraphs reified for ~S");
        $str18$cdolist = SubLObjectFactory.makeString("cdolist");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym20$START = SubLObjectFactory.makeUninternedSymbol("START");
        $sym21$END = SubLObjectFactory.makeUninternedSymbol("END");
        $sym22$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME")));
        $sym24$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym25$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym26$_ = SubLObjectFactory.makeSymbol("-");
        $sym27$L2R_IMAGE_ELAPSED_CPU_TIME = SubLObjectFactory.makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME");
        $sym28$L2R_COMPUTING_CPU_TIME = SubLObjectFactory.makeSymbol("L2R-COMPUTING-CPU-TIME");
        $str29$Please_clear_the_local_transcript = SubLObjectFactory.makeString("Please clear the local transcript before running the Text Learner.");
        $str30$The_Text_Learner_can_t_be_run_whi = SubLObjectFactory.makeString("The Text Learner can't be run while there are operations on the local queue.");
        $kw31$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym32$L2R_PARAGRAPH_READER = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER");
        $sym33$L2R_PARAGRAPH_READER_P = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-P");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PARAGRAPH"), SubLObjectFactory.makeSymbol("DOCUMENT"), SubLObjectFactory.makeSymbol("PARAGRAPH-SOURCE-HTML"), SubLObjectFactory.makeSymbol("SENTENCE-VECTOR"), SubLObjectFactory.makeSymbol("SENTENCE-PEGS"), SubLObjectFactory.makeSymbol("SENTENCE-NON-HTML-TEXTS"), SubLObjectFactory.makeSymbol("SENTENCE-NUMBER"), SubLObjectFactory.makeSymbol("LINKAGE"), SubLObjectFactory.makeSymbol("LINKAGE-FORT"), SubLObjectFactory.makeSymbol("INITIAL-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("TOTAL-TIME"), SubLObjectFactory.makeSymbol("TOTAL-CPU-TIME"), SubLObjectFactory.makeSymbol("SENTENCE-TIME"), SubLObjectFactory.makeSymbol("SENTENCE-CPU-TIME"), SubLObjectFactory.makeSymbol("STATE") });
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PARAGRAPH"), SubLObjectFactory.makeKeyword("DOCUMENT"), SubLObjectFactory.makeKeyword("PARAGRAPH-SOURCE-HTML"), SubLObjectFactory.makeKeyword("SENTENCE-VECTOR"), SubLObjectFactory.makeKeyword("SENTENCE-PEGS"), SubLObjectFactory.makeKeyword("SENTENCE-NON-HTML-TEXTS"), SubLObjectFactory.makeKeyword("SENTENCE-NUMBER"), SubLObjectFactory.makeKeyword("LINKAGE"), SubLObjectFactory.makeKeyword("LINKAGE-FORT"), SubLObjectFactory.makeKeyword("INITIAL-ASSERTION-COUNT"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("TOTAL-CPU-TIME"), SubLObjectFactory.makeKeyword("SENTENCE-TIME"), SubLObjectFactory.makeKeyword("SENTENCE-CPU-TIME"), SubLObjectFactory.makeKeyword("STATE") });
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-LINKAGE"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-STATE") });
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-DOCUMENT"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-STATE") });
        $sym38$PRINT_L2R_PARAGRAPH_READER = SubLObjectFactory.makeSymbol("PRINT-L2R-PARAGRAPH-READER");
        $sym39$L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-PRINT-FUNCTION-TRAMPOLINE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-P"));
        $sym41$L2R_PARAGRAPH_READER_PARAGRAPH = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH");
        $sym42$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH");
        $sym43$L2R_PARAGRAPH_READER_DOCUMENT = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT");
        $sym44$_CSETF_L2R_PARAGRAPH_READER_DOCUMENT = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-DOCUMENT");
        $sym45$L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML");
        $sym46$_CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML");
        $sym47$L2R_PARAGRAPH_READER_SENTENCE_VECTOR = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR");
        $sym48$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR");
        $sym49$L2R_PARAGRAPH_READER_SENTENCE_PEGS = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS");
        $sym50$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS");
        $sym51$L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS");
        $sym52$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS");
        $sym53$L2R_PARAGRAPH_READER_SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER");
        $sym54$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER");
        $sym55$L2R_PARAGRAPH_READER_LINKAGE = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-LINKAGE");
        $sym56$_CSETF_L2R_PARAGRAPH_READER_LINKAGE = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE");
        $sym57$L2R_PARAGRAPH_READER_LINKAGE_FORT = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT");
        $sym58$_CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT");
        $sym59$L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT");
        $sym60$_CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT");
        $sym61$L2R_PARAGRAPH_READER_TOTAL_TIME = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME");
        $sym62$_CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME");
        $sym63$L2R_PARAGRAPH_READER_TOTAL_CPU_TIME = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME");
        $sym64$_CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME");
        $sym65$L2R_PARAGRAPH_READER_SENTENCE_TIME = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME");
        $sym66$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME");
        $sym67$L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME");
        $sym68$_CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME");
        $sym69$L2R_PARAGRAPH_READER_STATE = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-STATE");
        $sym70$_CSETF_L2R_PARAGRAPH_READER_STATE = SubLObjectFactory.makeSymbol("_CSETF-L2R-PARAGRAPH-READER-STATE");
        $kw71$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $kw72$DOCUMENT = SubLObjectFactory.makeKeyword("DOCUMENT");
        $kw73$PARAGRAPH_SOURCE_HTML = SubLObjectFactory.makeKeyword("PARAGRAPH-SOURCE-HTML");
        $kw74$SENTENCE_VECTOR = SubLObjectFactory.makeKeyword("SENTENCE-VECTOR");
        $kw75$SENTENCE_PEGS = SubLObjectFactory.makeKeyword("SENTENCE-PEGS");
        $kw76$SENTENCE_NON_HTML_TEXTS = SubLObjectFactory.makeKeyword("SENTENCE-NON-HTML-TEXTS");
        $kw77$SENTENCE_NUMBER = SubLObjectFactory.makeKeyword("SENTENCE-NUMBER");
        $kw78$LINKAGE = SubLObjectFactory.makeKeyword("LINKAGE");
        $kw79$LINKAGE_FORT = SubLObjectFactory.makeKeyword("LINKAGE-FORT");
        $kw80$INITIAL_ASSERTION_COUNT = SubLObjectFactory.makeKeyword("INITIAL-ASSERTION-COUNT");
        $kw81$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $kw82$TOTAL_CPU_TIME = SubLObjectFactory.makeKeyword("TOTAL-CPU-TIME");
        $kw83$SENTENCE_TIME = SubLObjectFactory.makeKeyword("SENTENCE-TIME");
        $kw84$SENTENCE_CPU_TIME = SubLObjectFactory.makeKeyword("SENTENCE-CPU-TIME");
        $kw85$STATE = SubLObjectFactory.makeKeyword("STATE");
        $str86$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw87$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym88$MAKE_L2R_PARAGRAPH_READER = SubLObjectFactory.makeSymbol("MAKE-L2R-PARAGRAPH-READER");
        $kw89$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw90$END = SubLObjectFactory.makeKeyword("END");
        $sym91$VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-L2R-PARAGRAPH-READER-METHOD");
        $str92$_L2R_PARAGRAPH_READER__S__S_ = SubLObjectFactory.makeString("<L2R-PARAGRAPH-READER ~S ~S>");
        $str93$Couldn_t_find_source_HTML_for__S = SubLObjectFactory.makeString("Couldn't find source HTML for ~S");
        $kw94$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw95$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $sym96$_SOURCE = SubLObjectFactory.makeSymbol("?SOURCE");
        $const97$asHtmlSourceString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("asHtmlSourceString"));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCE"));
        $const99$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str100$asHtmlSourceString_ProprietaryVer = SubLObjectFactory.makeString("asHtmlSourceString-ProprietaryVersion");
        $str101$L2R_Paragraph_Reader = SubLObjectFactory.makeString("L2R Paragraph Reader");
        $sym102$L2R_PARAGRAPH_READER_NEXT = SubLObjectFactory.makeSymbol("L2R-PARAGRAPH-READER-NEXT");
        $str103$___A__A_Performing_L2R_reader_act = SubLObjectFactory.makeString("~&~A ~A Performing L2R reader action: ~S~%");
        $kw104$UNSTABLE = SubLObjectFactory.makeKeyword("UNSTABLE");
        $kw105$FIND_OR_CREATE_PEGS_FOR_SENTENCE = SubLObjectFactory.makeKeyword("FIND-OR-CREATE-PEGS-FOR-SENTENCE");
        $kw106$ASSERT_LINKAGE = SubLObjectFactory.makeKeyword("ASSERT-LINKAGE");
        $kw107$ASSERT_PARSE_TREE_FOR_LINKAGE = SubLObjectFactory.makeKeyword("ASSERT-PARSE-TREE-FOR-LINKAGE");
        $kw108$ADD_PARSING_RESULTS = SubLObjectFactory.makeKeyword("ADD-PARSING-RESULTS");
        $kw109$FINALIZE_SENTENCE = SubLObjectFactory.makeKeyword("FINALIZE-SENTENCE");
        $kw110$COLLECT_GARBAGE = SubLObjectFactory.makeKeyword("COLLECT-GARBAGE");
        $str111$L2R_reader_was_unable_to_complete = SubLObjectFactory.makeString("L2R reader was unable to complete its previous step. Unable to continue.");
        $kw112$ABORTED = SubLObjectFactory.makeKeyword("ABORTED");
        $str113$__Next_L2R_reader_action___S__ = SubLObjectFactory.makeString("~&Next L2R reader action: ~S~%");
        $kw114$DONE_WITH_SENTENCE = SubLObjectFactory.makeKeyword("DONE-WITH-SENTENCE");
        $kw115$CREATED_OR_FOUND_SENTENCE_PEGS = SubLObjectFactory.makeKeyword("CREATED-OR-FOUND-SENTENCE-PEGS");
        $kw116$ASSERTED_LINKAGE = SubLObjectFactory.makeKeyword("ASSERTED-LINKAGE");
        $kw117$ASSERTED_PARSE_TREE_FOR_LINKAGE = SubLObjectFactory.makeKeyword("ASSERTED-PARSE-TREE-FOR-LINKAGE");
        $kw118$PARSED = SubLObjectFactory.makeKeyword("PARSED");
        $kw119$DONE_WITH_ALL_SENTENCES = SubLObjectFactory.makeKeyword("DONE-WITH-ALL-SENTENCES");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym121$THIS_TIME = SubLObjectFactory.makeUninternedSymbol("THIS-TIME");
        $sym122$THIS_CPU_TIME = SubLObjectFactory.makeUninternedSymbol("THIS-CPU-TIME");
        $sym123$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym124$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str125$__This_step_took__A___A_of_CPU_ti = SubLObjectFactory.makeString("~&This step took ~A (~A of CPU time)~%");
        $sym126$L2R_READABLE_TIME_STRING = SubLObjectFactory.makeSymbol("L2R-READABLE-TIME-STRING");
        $list127 = ConsesLow.list((SubLObject)learning_reader.TWO_INTEGER);
        $sym128$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym129$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list130 = ConsesLow.list((SubLObject)learning_reader.ZERO_INTEGER);
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("unknown amount"));
        $sym132$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym133$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $str134$__Total_time_for_this_sentence___ = SubLObjectFactory.makeString("~&Total time for this sentence: ~A (~A of CPU time)~%");
        $str135$__Total_time_for_this_reader___A_ = SubLObjectFactory.makeString("~&Total time for this reader: ~A (~A of CPU time)~%");
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym137$OLD_TRANSMIT_STATE = SubLObjectFactory.makeUninternedSymbol("OLD-TRANSMIT-STATE");
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TRANSMIT-STATE")));
        $sym139$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym140$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym141$SET_TRANSMIT_STATE = SubLObjectFactory.makeSymbol("SET-TRANSMIT-STATE");
        $sym142$OLD_RECEIVE_STATE = SubLObjectFactory.makeUninternedSymbol("OLD-RECEIVE-STATE");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-RECEIVE-STATE")));
        $sym144$SET_RECEIVE_STATE = SubLObjectFactory.makeSymbol("SET-RECEIVE-STATE");
        $str145$transmit = SubLObjectFactory.makeString("transmit");
        $str146$store = SubLObjectFactory.makeString("store");
        $str147$ReadingEvent = SubLObjectFactory.makeString("ReadingEvent");
        $const148$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list149 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reading")));
        $const150$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const151$startingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $const152$pcwRead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pcwRead"));
        $const153$LearnByReadingDocumentDataMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LearnByReadingDocumentDataMt"));
        $const154$performedBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy"));
        $list155 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc")));
        $sym156$_READING = SubLObjectFactory.makeSymbol("?READING");
        $const157$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list158 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?END"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate")), (SubLObject)SubLObjectFactory.makeSymbol("?READING"), (SubLObject)SubLObjectFactory.makeSymbol("?END"))));
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?READING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc"))));
        $const160$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const161$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $kw162$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const163$endingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate"));
        $str164$none = SubLObjectFactory.makeString("none");
        $str165$no = SubLObjectFactory.makeString("no");
        $const166$InterpretingDocumentMtFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InterpretingDocumentMtFn"));
        $str167$unknown_amount = SubLObjectFactory.makeString("unknown amount");
        $const168$contentMtOfLinkage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMtOfLinkage"));
        $const169$linkageTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linkageTokenization"));
        $str170$Couldn_t_find_linkage_for__S = SubLObjectFactory.makeString("Couldn't find linkage for ~S");
        $str171$Couldn_t_find_linkage_FORT_for__S = SubLObjectFactory.makeString("Couldn't find linkage FORT for ~S");
        $str172$Couldn_t_find_content_mt_for__S = SubLObjectFactory.makeString("Couldn't find content-mt for ~S");
        $str173$Couldn_t_find_tokenization_for__S = SubLObjectFactory.makeString("Couldn't find tokenization for ~S");
        $const174$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $const175$parseTreeOfTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parseTreeOfTokenization"));
        $sym176$_PARSE_TREE = SubLObjectFactory.makeSymbol("?PARSE-TREE");
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticRootOfParseTree")), (SubLObject)SubLObjectFactory.makeSymbol("?PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("?ROOT-NODE")));
        $const178$LinguisticObject_NoParseAvailable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinguisticObject-NoParseAvailable"));
        $const179$pegInterpretationMts = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pegInterpretationMts"));
        $str180$__Asserting_Cyclifier_results_for = SubLObjectFactory.makeString("~&Asserting Cyclifier results for ~S...~%");
        $str181$__Read_sentence___S_in__A___A_of_ = SubLObjectFactory.makeString("~&Read sentence #~S in ~A (~A of CPU time)~%");
        $str182$__After__S_sentences__assertion_c = SubLObjectFactory.makeString("~&After ~S sentences, assertion count increased ~S from ~S to ~S~%");
        $sym183$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $sym184$CYC_FIND_OR_CREATE_NEW_PERMANENT = SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-NEW-PERMANENT");
        $str185$Don_t_know_what_to_do_with_finali = SubLObjectFactory.makeString("Don't know what to do with finalization term~% ~S");
        $str186$__Asserting_distillation_sentence = SubLObjectFactory.makeString("~%Asserting distillation sentence:~% ~S~%");
        $const187$TextLearnerQuery_WhatAreTheRequir = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextLearnerQuery-WhatAreTheRequiredScenesOfFinalization"));
        $sym188$KBQ_FROM_QUERY_RUNNING = SubLObjectFactory.makeSymbol("KBQ-FROM-QUERY-RUNNING");
        $const189$TextLearnerGarbageCollectionQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextLearnerGarbageCollectionQuerySpecification"));
        $const190$TextLearnerDisambiguationResultsD = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextLearnerDisambiguationResultsDistillationQuerySpecification"));
        $const191$cycLQueryTypeSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cycLQueryTypeSpecification"));
        $list192 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinguisticExpressionPeg")));
        $kw193$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $str194$__Read__S_sentences_in__A___ = SubLObjectFactory.makeString("~&Read ~S sentences in ~A.~%");
        $str195$Long_Inference_Warner = SubLObjectFactory.makeString("Long Inference Warner");
        $sym196$WARN_ABOUT_LONG_INFERENCES = SubLObjectFactory.makeSymbol("WARN-ABOUT-LONG-INFERENCES");
        $int197$600 = SubLObjectFactory.makeInteger(600);
        $kw198$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym199$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str200$_S_finished_after__A_with__S_answ = SubLObjectFactory.makeString("~S finished after ~A with ~S answers.");
        $str201$_S_has_taken__A_so_far____HL_quer = SubLObjectFactory.makeString("~S has taken ~A so far.~% HL query: ~S. Answer count: ~S");
        $sym202$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $kw203$MAX_PARSE_TIME = SubLObjectFactory.makeKeyword("MAX-PARSE-TIME");
        $int204$180 = SubLObjectFactory.makeInteger(180);
        $str205$__Asserting_linkage_for__S___S___ = SubLObjectFactory.makeString("~&Asserting linkage for ~S (~S)...~%");
        $const206$L2RLinkageReificationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("L2RLinkageReificationTemplate"));
        $str207$Tokenization = SubLObjectFactory.makeString("Tokenization");
        $list208 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycTokenization")));
        $const209$tokenizationInputString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tokenizationInputString"));
        $const210$pegTokenizations = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pegTokenizations"));
        $const211$ContentModelForPegFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentModelForPegFn"));
        $sym212$_TOKENIZATION = SubLObjectFactory.makeSymbol("?TOKENIZATION");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TOKENIZATION"));
        $str214$Couldn_t_find_string_for__S = SubLObjectFactory.makeString("Couldn't find string for ~S");
        $str215$Couldn_t_find_L2R_document_to_rea = SubLObjectFactory.makeString("Couldn't find L2R document to read.");
        $sym216$L2R_DOCUMENT_READER = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER");
        $sym217$L2R_DOCUMENT_READER_P = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-P");
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("REMAINING-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("READ-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-READER"), (SubLObject)SubLObjectFactory.makeSymbol("READING-EVENT"));
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOCUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("REMAINING-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeKeyword("READ-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH-READER"), (SubLObject)SubLObjectFactory.makeKeyword("READING-EVENT"));
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-READ-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-PARAGRAPH-READER"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-READING-EVENT"));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-DOCUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-READING-EVENT"));
        $sym222$PRINT_L2R_DOCUMENT_READER = SubLObjectFactory.makeSymbol("PRINT-L2R-DOCUMENT-READER");
        $sym223$L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-PRINT-FUNCTION-TRAMPOLINE");
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-P"));
        $sym225$L2R_DOCUMENT_READER_DOCUMENT = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-DOCUMENT");
        $sym226$_CSETF_L2R_DOCUMENT_READER_DOCUMENT = SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-DOCUMENT");
        $sym227$L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS");
        $sym228$_CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS = SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS");
        $sym229$L2R_DOCUMENT_READER_READ_PARAGRAPHS = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-READ-PARAGRAPHS");
        $sym230$_CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS = SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS");
        $sym231$L2R_DOCUMENT_READER_PARAGRAPH_READER = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-PARAGRAPH-READER");
        $sym232$_CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER = SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER");
        $sym233$L2R_DOCUMENT_READER_READING_EVENT = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-READER-READING-EVENT");
        $sym234$_CSETF_L2R_DOCUMENT_READER_READING_EVENT = SubLObjectFactory.makeSymbol("_CSETF-L2R-DOCUMENT-READER-READING-EVENT");
        $kw235$REMAINING_PARAGRAPHS = SubLObjectFactory.makeKeyword("REMAINING-PARAGRAPHS");
        $kw236$READ_PARAGRAPHS = SubLObjectFactory.makeKeyword("READ-PARAGRAPHS");
        $kw237$PARAGRAPH_READER = SubLObjectFactory.makeKeyword("PARAGRAPH-READER");
        $kw238$READING_EVENT = SubLObjectFactory.makeKeyword("READING-EVENT");
        $sym239$MAKE_L2R_DOCUMENT_READER = SubLObjectFactory.makeSymbol("MAKE-L2R-DOCUMENT-READER");
        $sym240$VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-L2R-DOCUMENT-READER-METHOD");
        $str241$_L2R_DOCUMENT_READER__S_ = SubLObjectFactory.makeString("<L2R-DOCUMENT-READER ~S>");
        $sym242$_L2R_READER_IMAGE_DOCUMENT_READER_ = SubLObjectFactory.makeSymbol("*L2R-READER-IMAGE-DOCUMENT-READER*");
        $const243$TextLearnerQuery_FindWikipediaArt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextLearnerQuery-FindWikipediaArticleToRead"));
        $sym244$FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT = SubLObjectFactory.makeSymbol("FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT");
        $sym245$STARTS_BEFORE_STARTING_OF_ = SubLObjectFactory.makeSymbol("STARTS-BEFORE-STARTING-OF?");
        $str246$_host_ = SubLObjectFactory.makeString("/host/");
        $str247$_scratch_ = SubLObjectFactory.makeString("/scratch/");
        $sym248$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str249$l2r_images_ = SubLObjectFactory.makeString("l2r-images/");
        $str250$done_ = SubLObjectFactory.makeString("done/");
        $str251$ongoing_ = SubLObjectFactory.makeString("ongoing/");
        $const252$referenceWorkEntryTitle = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("referenceWorkEntryTitle"));
        $sym253$ALPHA_CHAR_P = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $str254$load = SubLObjectFactory.makeString("load");
        $str255$Saved_image_file_to__S = SubLObjectFactory.makeString("Saved image file to ~S");
        $sym256$_AIS = SubLObjectFactory.makeSymbol("?AIS");
        $const257$correspondingAIS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correspondingAIS"));
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?AIS"));
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)learning_reader.ONE_INTEGER);
        $const260$WorldWideWebPage_PCW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WorldWideWebPage-PCW"));
        $list261 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("retainTerm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AISForFn")), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")));
        $const262$AISForFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AISForFn"));
        $str263$Don_t_know_how_to_read__S_ = SubLObjectFactory.makeString("Don't know how to read ~S.");
        $const264$retainTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("retainTerm"));
        $sym265$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym266$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str267$_S___has_already_been_downloaded_ = SubLObjectFactory.makeString("~S~% has already been downloaded: ~S");
        $const268$webPageURL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("webPageURL"));
        $str269$WebpageDownload = SubLObjectFactory.makeString("WebpageDownload");
        $str270$_S_doesn_t_have_a___webPageURL_as = SubLObjectFactory.makeString("~S doesn't have a #$webPageURL assertion.");
        $const271$DownloadTypeOfAISFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DownloadTypeOfAISFn"));
        $const272$dateOfEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent"));
        $const273$directingAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("directingAgent"));
        $const274$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $const275$transferredAIS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transferredAIS"));
        $list276 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $const277$nthOccurrenceOfStructureTypeInStr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthOccurrenceOfStructureTypeInStructure"));
        $sym278$_PARAGRAPH = SubLObjectFactory.makeSymbol("?PARAGRAPH");
        $sym279$_N = SubLObjectFactory.makeSymbol("?N");
        $const280$NLParagraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLParagraph"));
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym282$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym283$_ = SubLObjectFactory.makeSymbol("<");
        $str284$Reifying_paragraphs_in_ = SubLObjectFactory.makeString("Reifying paragraphs in ");
        $str285$___ = SubLObjectFactory.makeString("...");
        $str286$_p_ = SubLObjectFactory.makeString("<p>");
        $str287$_S_doesn_t_have_any_recognizable_ = SubLObjectFactory.makeString("~S doesn't have any recognizable paragraphs.");
        $str288$Identifying_paragraphs_in_ = SubLObjectFactory.makeString("Identifying paragraphs in ");
        $str289$__p_ = SubLObjectFactory.makeString("</p>");
        $str290$script = SubLObjectFactory.makeString("script");
        $str291$No_non_tagged_text_in__S = SubLObjectFactory.makeString("No non-tagged text in ~S");
        $str292$No_closed_class_words_in__S = SubLObjectFactory.makeString("No closed-class words in ~S");
        $const293$NthOccurrenceOfStructureTypeInStr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NthOccurrenceOfStructureTypeInStructureFn"));
        $str294$___S___S__ = SubLObjectFactory.makeString("~&~S: ~S~%");
        $str295$SentenceLevelPeg = SubLObjectFactory.makeString("SentenceLevelPeg");
        $sym296$STRING_OR_UNICODE_NAUT_P = SubLObjectFactory.makeSymbol("STRING-OR-UNICODE-NAUT-P");
        $sym297$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym298$_PEG = SubLObjectFactory.makeSymbol("?PEG");
        $list299 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)learning_reader.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym300$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE = SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE");
        $const301$SentenceLevelPegCreationTemplateF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SentenceLevelPegCreationTemplateForDocumentSlurper"));
        $str302$Failed_to_validate___SentenceLeve = SubLObjectFactory.makeString("Failed to validate #$SentenceLevelPegCreationTemplateForDocumentSlurper");
        $sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");
        $sym304$L2R_SENTENCE_LEVEL_PEG_EXEMPLAR = SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-EXEMPLAR");
        $const305$TheExemplarSentenceLevelPeg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheExemplarSentenceLevelPeg"));
        $str306$Failed_to_validate___TheExemplarS = SubLObjectFactory.makeString("Failed to validate #$TheExemplarSentenceLevelPeg");
        $sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*");
        $sym308$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $str309$Failed_to_find_good_L2R_SENTENCE_ = SubLObjectFactory.makeString("Failed to find good L2R-SENTENCE-LEVEL-PEG-CREATION-RULES:~% ~S~% Must be a non-empty list of forward rules.");
        $sym310$L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES = SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES");
        $sym311$IST_SENTENCE_P = SubLObjectFactory.makeSymbol("IST-SENTENCE-P");
        $str312$Failed_to_initialize_L2R_SENTENCE = SubLObjectFactory.makeString("Failed to initialize L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES:~% ~S~% Must be a non-empty list of #$ist sentences.");
        $sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*");
        $list314 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN"), (SubLObject)SubLObjectFactory.makeSymbol("OUT"));
        $sym315$L2R_DOCUMENT_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-INDEXICAL");
        $list316 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LearnByReadingDocument")));
        $str317$Failed_to_validate_L2R_DOCUMENT_I = SubLObjectFactory.makeString("Failed to validate L2R-DOCUMENT-INDEXICAL: ~S");
        $sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");
        $sym319$L2R_SENTENCE_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-SENTENCE-INDEXICAL");
        $list320 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextualPCW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infoStructureOfCW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"))));
        $str321$Failed_to_validate_L2R_SENTENCE_I = SubLObjectFactory.makeString("Failed to validate L2R-SENTENCE-INDEXICAL: ~S");
        $sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");
        $sym323$L2R_SUPERTEXT_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL");
        $list324 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GraphicalStructure")));
        $str325$Failed_to_validate_L2R_SUPERTEXT_ = SubLObjectFactory.makeString("Failed to validate L2R-SUPERTEXT-INDEXICAL: ~S");
        $sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");
        $sym327$L2R_SENTENCE_STRING_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-INDEXICAL");
        $list328 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ControlCharacterFreeString")));
        $str329$Failed_to_validate_L2R_SENTENCE_S = SubLObjectFactory.makeString("Failed to validate L2R-SENTENCE-STRING-INDEXICAL: ~S");
        $sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");
        $sym331$L2R_SENTENCE_NUMBER_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-SENTENCE-NUMBER-INDEXICAL");
        $list332 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger")), (SubLObject)learning_reader.TWO_INTEGER);
        $str333$Failed_to_validate_L2R_SENTENCE_N = SubLObjectFactory.makeString("Failed to validate L2R-SENTENCE-NUMBER-INDEXICAL: ~S");
        $sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");
        $sym335$L2R_SENTENCE_STRING_NUMBER_INDEXICAL = SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL");
        $list336 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger")), (SubLObject)learning_reader.ONE_INTEGER);
        $str337$Failed_to_validate_L2R_SENTENCE_S = SubLObjectFactory.makeString("Failed to validate L2R-SENTENCE-STRING-NUMBER-INDEXICAL: ~S");
        $sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");
        $list339 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?HIGHER"), (SubLObject)SubLObjectFactory.makeSymbol("?LOWER"));
        $const340$assertPriorToInCreationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertPriorToInCreationTemplate"));
        $sym341$_HIGHER = SubLObjectFactory.makeSymbol("?HIGHER");
        $sym342$_LOWER = SubLObjectFactory.makeSymbol("?LOWER");
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)learning_reader.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym344$HL_TO_EL = SubLObjectFactory.makeSymbol("HL-TO-EL");
        $sym345$ASSERTION_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $sym346$HTML_STRING_WORDIFY = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY");
        $str347$Couldn_t_make_UTF8_string_from__S = SubLObjectFactory.makeString("Couldn't make UTF8 string from ~S");
        $sym348$NON_ASCII_CHAR_P = SubLObjectFactory.makeSymbol("NON-ASCII-CHAR-P");
        $kw349$LEADING_TAGS = SubLObjectFactory.makeKeyword("LEADING-TAGS");
        $kw350$FOLLOWING_TAGS = SubLObjectFactory.makeKeyword("FOLLOWING-TAGS");
        $kw351$LEADING_WHITESPACE = SubLObjectFactory.makeKeyword("LEADING-WHITESPACE");
        $kw352$FOLLOWING_WHITESPACE = SubLObjectFactory.makeKeyword("FOLLOWING-WHITESPACE");
        $list353 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-HTML-OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-NON-HTML-OFFSET"));
        $const354$SubExpressionAtOffsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubExpressionAtOffsetFn"));
        $const355$subExpressionWithStringAtOffset = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subExpressionWithStringAtOffset"));
        $sym356$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
        $kw357$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str358$_a = SubLObjectFactory.makeString("<a");
        $str359$href = SubLObjectFactory.makeString("href");
        $str360$__a = SubLObjectFactory.makeString("</a");
        $str361$Bad_offset___S_at_offset__S_of__S = SubLObjectFactory.makeString("Bad offset: ~S at offset ~S of ~S");
        $kw362$OK = SubLObjectFactory.makeKeyword("OK");
        $sym363$L2R_DOCUMENT_SENTENCE_FINDER_KBQ = SubLObjectFactory.makeSymbol("L2R-DOCUMENT-SENTENCE-FINDER-KBQ");
        $const364$ReifySentencePegQuery_FindSentenc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifySentencePegQuery-FindSentences"));
        $str365$Failed_to_validate___ReifySentenc = SubLObjectFactory.makeString("Failed to validate #$ReifySentencePegQuery-FindSentences");
        $sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*");
        $sym367$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $sym368$NON_EMPTY_STRING_P = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING-P");
        $str369$Asserting_linkages_for____ = SubLObjectFactory.makeString("Asserting linkages for: ~%");
        $str370$_____A__ = SubLObjectFactory.makeString("... ~A~%");
        $str371$Using_L2R_Webpage_Cyclifier_with_ = SubLObjectFactory.makeString("Using L2R Webpage Cyclifier with timestamp ~S.");
        $str372$sentences_ = SubLObjectFactory.makeString("sentences/");
        $int373$511 = SubLObjectFactory.makeInteger(511);
        $str374$links = SubLObjectFactory.makeString("links");
        $str375$__Writing__S_links_from__S_to__S_ = SubLObjectFactory.makeString("~&Writing ~S links from ~S to ~S~%");
        $kw376$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str377$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str378$http___en_wikipedia_org_ = SubLObjectFactory.makeString("http://en.wikipedia.org/");
        $str379$ = SubLObjectFactory.makeString("");
        $str380$Following_unknown_phrase_links_in = SubLObjectFactory.makeString("Following unknown phrase links in");
        $str381$_ = SubLObjectFactory.makeString(" ");
        $list382 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"));
        $str383$_ = SubLObjectFactory.makeString("/");
        $kw384$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<a href="), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeString(" "));
        $str386$_a_href___wiki_ = SubLObjectFactory.makeString("<a href=\"/wiki/");
        $str387$a_href_ = SubLObjectFactory.makeString("a href=");
        $str388$_img_ = SubLObjectFactory.makeString("<img ");
        $sym389$PUNCTUATION_P = SubLObjectFactory.makeSymbol("PUNCTUATION-P");
        $str390$Logging_cyclifications_for_ = SubLObjectFactory.makeString("Logging cyclifications for ");
        $str391$__ = SubLObjectFactory.makeString(": ");
        $str392$sentence__3__0D_ = SubLObjectFactory.makeString("sentence-~3,'0D/");
        $str393$Couldn_t_make_directory_____S = SubLObjectFactory.makeString("Couldn't make directory:~% ~S");
        $str394$sentence_text_lisp = SubLObjectFactory.makeString("sentence-text.lisp");
        $str395$__Cyclifying_unparsed_sentences_f = SubLObjectFactory.makeString("~&Cyclifying unparsed sentences from ~S~%");
        $str396$sentence_ = SubLObjectFactory.makeString("sentence-");
        $str397$sentence_parsed_lisp = SubLObjectFactory.makeString("sentence-parsed.lisp");
        $str398$__Skipping_already_parsed__S__ = SubLObjectFactory.makeString("~&Skipping already-parsed ~S~%");
        $str399$__Parsing__S__ = SubLObjectFactory.makeString("~&Parsing ~S~%");
        $str400$___Logged__S_sentence_parses_to__ = SubLObjectFactory.makeString("~& Logged ~S sentence parses to ~S.~%");
        $str401$No_sentence_to_parse_in__S = SubLObjectFactory.makeString("No sentence to parse in ~S");
        $list402 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("P"), (SubLObject)SubLObjectFactory.makeString("H1"), (SubLObject)SubLObjectFactory.makeString("H2"), (SubLObject)SubLObjectFactory.makeString("H3"), (SubLObject)SubLObjectFactory.makeString("H4"), (SubLObject)SubLObjectFactory.makeString("TABLE"), (SubLObject)SubLObjectFactory.makeString("DIV"));
        $sym403$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list404 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<"));
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("</"));
        $list406 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(">"));
        $list407 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString(" | "), SubLObjectFactory.makeString("@import"), SubLObjectFactory.makeString("Wikipedia"), SubLObjectFactory.makeString(" is a stub."), SubLObjectFactory.makeString("Edit this page"), SubLObjectFactory.makeString("For other uses, see"), SubLObjectFactory.makeString("Create account"), SubLObjectFactory.makeString("All text is available under the terms of"), SubLObjectFactory.makeString("You can help by expanding it."), SubLObjectFactory.makeString("This page was last modified"), SubLObjectFactory.makeString("fixalpha"), SubLObjectFactory.makeString("Wikimedia"), SubLObjectFactory.makeString("Wiktionary"), SubLObjectFactory.makeString("Main Article:"), SubLObjectFactory.makeString("Main Articles:"), SubLObjectFactory.makeString("Wikibooks") });
        $str408$_C = SubLObjectFactory.makeString("~C");
        $str409$_ = SubLObjectFactory.makeString("<");
        $str410$__ = SubLObjectFactory.makeString("</");
        $str411$_ = SubLObjectFactory.makeString(">");
        $str412$_ul_ = SubLObjectFactory.makeString("<ul>");
        $str413$__ul_ = SubLObjectFactory.makeString("</ul>");
        $str414$_____start_content____ = SubLObjectFactory.makeString("<!-- start content -->");
        $str415$_____end_content____ = SubLObjectFactory.makeString("<!-- end content -->");
        $str416$ul = SubLObjectFactory.makeString("ul");
        $str417$ol = SubLObjectFactory.makeString("ol");
        $str418$table = SubLObjectFactory.makeString("table");
        $str419$h1 = SubLObjectFactory.makeString("h1");
        $str420$h2 = SubLObjectFactory.makeString("h2");
        $str421$h3 = SubLObjectFactory.makeString("h3");
        $sym422$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str423$Couldn_t_find_paragraphs_in__S = SubLObjectFactory.makeString("Couldn't find paragraphs in ~S");
        $str424$No_sentence_string_for__S = SubLObjectFactory.makeString("No sentence string for ~S");
        $str425$_A_ = SubLObjectFactory.makeString("~A ");
        $str426$href__ = SubLObjectFactory.makeString("href=\"");
        $str427$_ = SubLObjectFactory.makeString("\"");
        $str428$_ = SubLObjectFactory.makeString("&");
        $str429$_u0a_ = SubLObjectFactory.makeString("&u0a;");
        $str430$Downloading_and_sentencifying_tex = SubLObjectFactory.makeString("Downloading and sentencifying text of ~S");
        $const431$CurrentWorldDataCollectorMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt"));
        $int432$30 = SubLObjectFactory.makeInteger(30);
        $str433$__Cannot_open_input_stream_for__A = SubLObjectFactory.makeString("~%Cannot open input stream for ~A");
        $kw434$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str435$Non_string_in__S_____S__ = SubLObjectFactory.makeString("Non-string in ~S:~% ~S~%");
        $str436$775 = SubLObjectFactory.makeString("775");
        $str437$_S_is_not_empty = SubLObjectFactory.makeString("~S is not empty");
        $str438$results_dictionary_cfasl = SubLObjectFactory.makeString("results-dictionary.cfasl");
        $str439$Parsing_and_partioning_paragraphs = SubLObjectFactory.makeString("Parsing and partioning paragraphs...");
        $kw440$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw441$GOOD = SubLObjectFactory.makeKeyword("GOOD");
        $kw442$BAD = SubLObjectFactory.makeKeyword("BAD");
        $kw443$MAYBE = SubLObjectFactory.makeKeyword("MAYBE");
        $str444$Writing_results_to__S = SubLObjectFactory.makeString("Writing results to ~S");
        $list445 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PARTITIONED-PARSES"));
        $list446 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAYBE"), (SubLObject)SubLObjectFactory.makeSymbol("BAD"));
        $sym447$ALPHANUMERICP = SubLObjectFactory.makeSymbol("ALPHANUMERICP");
        $str448$_A__3__0D = SubLObjectFactory.makeString("~A-~3,'0D");
        $str449$Known_bindings_ = SubLObjectFactory.makeString("Known bindings:");
        $str450$Consistent_ = SubLObjectFactory.makeString("Consistent:");
        $str451$Known_false_ = SubLObjectFactory.makeString("Known false:");
        $sym452$NART_HL_FORMULA = SubLObjectFactory.makeSymbol("NART-HL-FORMULA");
        $sym453$ALPHANUMERIC_STRING_ = SubLObjectFactory.makeSymbol("ALPHANUMERIC-STRING?");
        $sym454$WORD_CATEGORY = SubLObjectFactory.makeSymbol("WORD-CATEGORY");
        $kw455$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list456 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBP"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBG"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBZ"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VB"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJS"), (SubLObject)SubLObjectFactory.makeKeyword("NNS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJR"), (SubLObject)SubLObjectFactory.makeKeyword("NNS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJ"), (SubLObject)SubLObjectFactory.makeKeyword("NNS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJS"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJR"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJ"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeKeyword("NNS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("NN")) });
        $kw457$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw458$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
    }
    
    public static final class $l2r_paragraph_reader_native extends SubLStructNative
    {
        public SubLObject $paragraph;
        public SubLObject $document;
        public SubLObject $paragraph_source_html;
        public SubLObject $sentence_vector;
        public SubLObject $sentence_pegs;
        public SubLObject $sentence_non_html_texts;
        public SubLObject $sentence_number;
        public SubLObject $linkage;
        public SubLObject $linkage_fort;
        public SubLObject $initial_assertion_count;
        public SubLObject $total_time;
        public SubLObject $total_cpu_time;
        public SubLObject $sentence_time;
        public SubLObject $sentence_cpu_time;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $l2r_paragraph_reader_native() {
            this.$paragraph = (SubLObject)CommonSymbols.NIL;
            this.$document = (SubLObject)CommonSymbols.NIL;
            this.$paragraph_source_html = (SubLObject)CommonSymbols.NIL;
            this.$sentence_vector = (SubLObject)CommonSymbols.NIL;
            this.$sentence_pegs = (SubLObject)CommonSymbols.NIL;
            this.$sentence_non_html_texts = (SubLObject)CommonSymbols.NIL;
            this.$sentence_number = (SubLObject)CommonSymbols.NIL;
            this.$linkage = (SubLObject)CommonSymbols.NIL;
            this.$linkage_fort = (SubLObject)CommonSymbols.NIL;
            this.$initial_assertion_count = (SubLObject)CommonSymbols.NIL;
            this.$total_time = (SubLObject)CommonSymbols.NIL;
            this.$total_cpu_time = (SubLObject)CommonSymbols.NIL;
            this.$sentence_time = (SubLObject)CommonSymbols.NIL;
            this.$sentence_cpu_time = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$l2r_paragraph_reader_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$paragraph;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$document;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$paragraph_source_html;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$sentence_vector;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$sentence_pegs;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$sentence_non_html_texts;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$sentence_number;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$linkage;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$linkage_fort;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$initial_assertion_count;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$total_time;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$total_cpu_time;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$sentence_time;
        }
        
        @Override
		public SubLObject getField15() {
            return this.$sentence_cpu_time;
        }
        
        @Override
		public SubLObject getField16() {
            return this.$state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$paragraph = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$document = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$paragraph_source_html = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$sentence_vector = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$sentence_pegs = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$sentence_non_html_texts = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$sentence_number = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$linkage = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$linkage_fort = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$initial_assertion_count = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$total_time = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$total_cpu_time = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$sentence_time = value;
        }
        
        @Override
		public SubLObject setField15(final SubLObject value) {
            return this.$sentence_cpu_time = value;
        }
        
        @Override
		public SubLObject setField16(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$l2r_paragraph_reader_native.class, learning_reader.$sym32$L2R_PARAGRAPH_READER, learning_reader.$sym33$L2R_PARAGRAPH_READER_P, learning_reader.$list34, learning_reader.$list35, new String[] { "$paragraph", "$document", "$paragraph_source_html", "$sentence_vector", "$sentence_pegs", "$sentence_non_html_texts", "$sentence_number", "$linkage", "$linkage_fort", "$initial_assertion_count", "$total_time", "$total_cpu_time", "$sentence_time", "$sentence_cpu_time", "$state" }, learning_reader.$list36, learning_reader.$list37, learning_reader.$sym38$PRINT_L2R_PARAGRAPH_READER);
        }
    }
    
    public static final class $l2r_paragraph_reader_p$UnaryFunction extends UnaryFunction
    {
        public $l2r_paragraph_reader_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("L2R-PARAGRAPH-READER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return learning_reader.l2r_paragraph_reader_p(arg1);
        }
    }
    
    public static final class $l2r_document_reader_native extends SubLStructNative
    {
        public SubLObject $document;
        public SubLObject $remaining_paragraphs;
        public SubLObject $read_paragraphs;
        public SubLObject $paragraph_reader;
        public SubLObject $reading_event;
        private static final SubLStructDeclNative structDecl;
        
        public $l2r_document_reader_native() {
            this.$document = (SubLObject)CommonSymbols.NIL;
            this.$remaining_paragraphs = (SubLObject)CommonSymbols.NIL;
            this.$read_paragraphs = (SubLObject)CommonSymbols.NIL;
            this.$paragraph_reader = (SubLObject)CommonSymbols.NIL;
            this.$reading_event = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$l2r_document_reader_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$document;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$remaining_paragraphs;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$read_paragraphs;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$paragraph_reader;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$reading_event;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$document = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$remaining_paragraphs = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$read_paragraphs = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$paragraph_reader = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$reading_event = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$l2r_document_reader_native.class, learning_reader.$sym216$L2R_DOCUMENT_READER, learning_reader.$sym217$L2R_DOCUMENT_READER_P, learning_reader.$list218, learning_reader.$list219, new String[] { "$document", "$remaining_paragraphs", "$read_paragraphs", "$paragraph_reader", "$reading_event" }, learning_reader.$list220, learning_reader.$list221, learning_reader.$sym222$PRINT_L2R_DOCUMENT_READER);
        }
    }
    
    public static final class $l2r_document_reader_p$UnaryFunction extends UnaryFunction
    {
        public $l2r_document_reader_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("L2R-DOCUMENT-READER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return learning_reader.l2r_document_reader_p(arg1);
        }
    }
}

/*

	Total time: 2097 ms
	
*/