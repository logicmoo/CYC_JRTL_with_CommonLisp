package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_chart extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psp_chart";
    public static final String myFingerPrint = "e07f4428a4809b4ee132dc2299874e983ad752720b8e50a89802b8509487ed4d";
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 899L)
    public static SubLSymbol $psp_parse_wh_wordsP$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLSymbol $dtp_phrase_structure_parser_chart$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 1591L)
    private static SubLSymbol $psp_chart_id_counter$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 3974L)
    private static SubLSymbol $psp_chart_index_edgesP$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLSymbol $dtp_phrase_structure_parser_phrasal_edge$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLSymbol $dtp_phrase_structure_parser_lexical_edge$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 20910L)
    private static SubLSymbol $psp_unknown_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22594L)
    private static SubLSymbol $psp_edge_default_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22731L)
    private static SubLSymbol $psp_edge_greedy_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22806L)
    private static SubLSymbol $psp_edge_dispreferred_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22887L)
    private static SubLSymbol $psp_gap_edge_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24407L)
    private static SubLSymbol $psp_np_gap_semx_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 30273L)
    private static SubLSymbol $psp_tokenization_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 35389L)
    public static SubLSymbol $psp_use_term_lexiconP$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 39235L)
    private static SubLSymbol $fscp_multi_parse_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66522L)
    private static SubLSymbol $psp_bindings_from_frame_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66887L)
    private static SubLSymbol $psp_predicative_frameP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67031L)
    private static SubLSymbol $psp_keywords_for_frame_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67350L)
    private static SubLSymbol $psp_constrained_frameP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67742L)
    private static SubLSymbol $psp_devisable_verb_frames_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68163L)
    private static SubLSymbol $transitive_np_comp_frameP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68354L)
    private static SubLSymbol $intransitive_frameP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68540L)
    private static SubLSymbol $psp_frame_has_typeP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68664L)
    private static SubLSymbol $psp_passivized_dtr_num_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 69646L)
    private static SubLSymbol $psp_passive_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 75351L)
    private static SubLSymbol $titles_conventionally_quoted$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 75731L)
    private static SubLSymbol $psp_preferred_denot_preference_factor$;
    private static final SubLSymbol $sym0$PHRASE_STRUCTURE_PARSER_CHART;
    private static final SubLSymbol $sym1$PHRASE_STRUCTURE_PARSER_CHART_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PPRINT_PSP_CHART;
    private static final SubLSymbol $sym7$PHRASE_STRUCTURE_PARSER_CHART_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PSP_CHART_ID;
    private static final SubLSymbol $sym10$_CSETF_PSP_CHART_ID;
    private static final SubLSymbol $sym11$PSP_CHART_INPUT_STRING;
    private static final SubLSymbol $sym12$_CSETF_PSP_CHART_INPUT_STRING;
    private static final SubLSymbol $sym13$PSP_CHART_LENGTH;
    private static final SubLSymbol $sym14$_CSETF_PSP_CHART_LENGTH;
    private static final SubLSymbol $sym15$PSP_CHART_SPANS_TO_EDGES;
    private static final SubLSymbol $sym16$_CSETF_PSP_CHART_SPANS_TO_EDGES;
    private static final SubLSymbol $sym17$PSP_CHART_GAP_TYPE;
    private static final SubLSymbol $sym18$_CSETF_PSP_CHART_GAP_TYPE;
    private static final SubLSymbol $sym19$PSP_CHART_MEMOIZATION_STATE;
    private static final SubLSymbol $sym20$_CSETF_PSP_CHART_MEMOIZATION_STATE;
    private static final SubLSymbol $sym21$PSP_CHART_EDGE_ID_INDEX;
    private static final SubLSymbol $sym22$_CSETF_PSP_CHART_EDGE_ID_INDEX;
    private static final SubLSymbol $sym23$PSP_CHART_EDGES_TO_NODES;
    private static final SubLSymbol $sym24$_CSETF_PSP_CHART_EDGES_TO_NODES;
    private static final SubLSymbol $sym25$PSP_CHART_MAX_EDGES_PER_SPAN;
    private static final SubLSymbol $sym26$_CSETF_PSP_CHART_MAX_EDGES_PER_SPAN;
    private static final SubLSymbol $sym27$PSP_CHART_MAX_EDGES;
    private static final SubLSymbol $sym28$_CSETF_PSP_CHART_MAX_EDGES;
    private static final SubLSymbol $sym29$PSP_CHART_MAXED_OUT_SPANS;
    private static final SubLSymbol $sym30$_CSETF_PSP_CHART_MAXED_OUT_SPANS;
    private static final SubLSymbol $sym31$PSP_CHART_MAXED_OUT_;
    private static final SubLSymbol $sym32$_CSETF_PSP_CHART_MAXED_OUT_;
    private static final SubLSymbol $sym33$PSP_CHART_PARSED_LEXICAL_SPANS;
    private static final SubLSymbol $sym34$_CSETF_PSP_CHART_PARSED_LEXICAL_SPANS;
    private static final SubLSymbol $kw35$ID;
    private static final SubLSymbol $kw36$INPUT_STRING;
    private static final SubLSymbol $kw37$LENGTH;
    private static final SubLSymbol $kw38$SPANS_TO_EDGES;
    private static final SubLSymbol $kw39$GAP_TYPE;
    private static final SubLSymbol $kw40$MEMOIZATION_STATE;
    private static final SubLSymbol $kw41$EDGE_ID_INDEX;
    private static final SubLSymbol $kw42$EDGES_TO_NODES;
    private static final SubLSymbol $kw43$MAX_EDGES_PER_SPAN;
    private static final SubLSymbol $kw44$MAX_EDGES;
    private static final SubLSymbol $kw45$MAXED_OUT_SPANS;
    private static final SubLSymbol $kw46$MAXED_OUT_;
    private static final SubLSymbol $kw47$PARSED_LEXICAL_SPANS;
    private static final SubLString $str48$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw49$BEGIN;
    private static final SubLSymbol $sym50$MAKE_PHRASE_STRUCTURE_PARSER_CHART;
    private static final SubLSymbol $kw51$SLOT;
    private static final SubLSymbol $kw52$END;
    private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_CHART_METHOD;
    private static final SubLSymbol $sym54$_PSP_CHART_ID_COUNTER_;
    private static final SubLString $str55$__PSP_CHART__S__S_;
    private static final SubLSymbol $kw56$DESTROYED;
    private static final SubLSymbol $kw57$CLEARED;
    private static final SubLSymbol $kw58$SET;
    private static final SubLString $str59$Not_indexing_PSP_edges__Can_t_fin;
    private static final SubLString $str60$_S_is_not_a_PSP_chart__Can_t_find;
    private static final SubLSymbol $sym61$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE;
    private static final SubLSymbol $sym62$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_P;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$PPRINT_PSP_PHRASAL_EDGE;
    private static final SubLSymbol $sym68$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$PSP_PHRASAL_EDGE_WEIGHT;
    private static final SubLSymbol $sym71$_CSETF_PSP_PHRASAL_EDGE_WEIGHT;
    private static final SubLSymbol $sym72$PSP_PHRASAL_EDGE_STRING;
    private static final SubLSymbol $sym73$_CSETF_PSP_PHRASAL_EDGE_STRING;
    private static final SubLSymbol $sym74$PSP_PHRASAL_EDGE_SPAN;
    private static final SubLSymbol $sym75$_CSETF_PSP_PHRASAL_EDGE_SPAN;
    private static final SubLSymbol $sym76$PSP_PHRASAL_EDGE_CATEGORY;
    private static final SubLSymbol $sym77$_CSETF_PSP_PHRASAL_EDGE_CATEGORY;
    private static final SubLSymbol $sym78$PSP_PHRASAL_EDGE_POS_PRED;
    private static final SubLSymbol $sym79$_CSETF_PSP_PHRASAL_EDGE_POS_PRED;
    private static final SubLSymbol $sym80$PSP_PHRASAL_EDGE_CYCLS;
    private static final SubLSymbol $sym81$_CSETF_PSP_PHRASAL_EDGE_CYCLS;
    private static final SubLSymbol $sym82$PSP_PHRASAL_EDGE_RULE;
    private static final SubLSymbol $sym83$_CSETF_PSP_PHRASAL_EDGE_RULE;
    private static final SubLSymbol $sym84$PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS;
    private static final SubLSymbol $sym85$_CSETF_PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS;
    private static final SubLSymbol $sym86$PSP_PHRASAL_EDGE_HEAD_DTR;
    private static final SubLSymbol $sym87$_CSETF_PSP_PHRASAL_EDGE_HEAD_DTR;
    private static final SubLSymbol $sym88$PSP_PHRASAL_EDGE_NON_HEAD_DTRS;
    private static final SubLSymbol $sym89$_CSETF_PSP_PHRASAL_EDGE_NON_HEAD_DTRS;
    private static final SubLSymbol $sym90$PSP_PHRASAL_EDGE_ID;
    private static final SubLSymbol $sym91$_CSETF_PSP_PHRASAL_EDGE_ID;
    private static final SubLSymbol $sym92$PSP_PHRASAL_EDGE_CHART;
    private static final SubLSymbol $sym93$_CSETF_PSP_PHRASAL_EDGE_CHART;
    private static final SubLSymbol $kw94$WEIGHT;
    private static final SubLSymbol $kw95$STRING;
    private static final SubLSymbol $kw96$SPAN;
    private static final SubLSymbol $kw97$CATEGORY;
    private static final SubLSymbol $kw98$POS_PRED;
    private static final SubLSymbol $kw99$CYCLS;
    private static final SubLSymbol $kw100$RULE;
    private static final SubLSymbol $kw101$NEW_DTR_CONSTRAINTS;
    private static final SubLSymbol $kw102$HEAD_DTR;
    private static final SubLSymbol $kw103$NON_HEAD_DTRS;
    private static final SubLSymbol $kw104$CHART;
    private static final SubLSymbol $sym105$MAKE_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE;
    private static final SubLSymbol $sym106$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHO;
    private static final SubLSymbol $sym107$SXHASH_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHOD;
    private static final SubLString $str108$__PSP_PHRASAL_EDGE__S__S__S_;
    private static final SubLSymbol $sym109$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE;
    private static final SubLSymbol $sym110$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_P;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$PPRINT_PSP_LEXICAL_EDGE;
    private static final SubLSymbol $sym116$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$PSP_LEXICAL_EDGE_WEIGHT;
    private static final SubLSymbol $sym119$_CSETF_PSP_LEXICAL_EDGE_WEIGHT;
    private static final SubLSymbol $sym120$PSP_LEXICAL_EDGE_STRING;
    private static final SubLSymbol $sym121$_CSETF_PSP_LEXICAL_EDGE_STRING;
    private static final SubLSymbol $sym122$PSP_LEXICAL_EDGE_SPAN;
    private static final SubLSymbol $sym123$_CSETF_PSP_LEXICAL_EDGE_SPAN;
    private static final SubLSymbol $sym124$PSP_LEXICAL_EDGE_CATEGORY;
    private static final SubLSymbol $sym125$_CSETF_PSP_LEXICAL_EDGE_CATEGORY;
    private static final SubLSymbol $sym126$PSP_LEXICAL_EDGE_POS_PRED;
    private static final SubLSymbol $sym127$_CSETF_PSP_LEXICAL_EDGE_POS_PRED;
    private static final SubLSymbol $sym128$PSP_LEXICAL_EDGE_CYCLS;
    private static final SubLSymbol $sym129$_CSETF_PSP_LEXICAL_EDGE_CYCLS;
    private static final SubLSymbol $sym130$PSP_LEXICAL_EDGE_WU;
    private static final SubLSymbol $sym131$_CSETF_PSP_LEXICAL_EDGE_WU;
    private static final SubLSymbol $sym132$PSP_LEXICAL_EDGE_FRAME;
    private static final SubLSymbol $sym133$_CSETF_PSP_LEXICAL_EDGE_FRAME;
    private static final SubLSymbol $sym134$PSP_LEXICAL_EDGE_ID;
    private static final SubLSymbol $sym135$_CSETF_PSP_LEXICAL_EDGE_ID;
    private static final SubLSymbol $sym136$PSP_LEXICAL_EDGE_CHART;
    private static final SubLSymbol $sym137$_CSETF_PSP_LEXICAL_EDGE_CHART;
    private static final SubLSymbol $kw138$WU;
    private static final SubLSymbol $kw139$FRAME;
    private static final SubLSymbol $sym140$MAKE_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE;
    private static final SubLSymbol $sym141$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHO;
    private static final SubLSymbol $sym142$SXHASH_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHOD;
    private static final SubLString $str143$__PSP_LEXICAL_EDGE__S__S__S__S_W_;
    private static final SubLString $str144$___S___S______S__;
    private static final SubLString $str145$_S_is_not_a_PSP_edge_;
    private static final SubLString $str146$Headless_edge___S;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$CHART_TO_USE;
    private static final SubLSymbol $sym149$CLET;
    private static final SubLSymbol $sym150$FIRST_OF;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$CHECK_TYPE;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$DO_DICTIONARY_KEYS;
    private static final SubLSymbol $kw155$DONE;
    private static final SubLSymbol $sym156$PSP_DO_EDGES_FOR_SPAN;
    private static final SubLSymbol $sym157$PSP_DO_EDGES;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$CSOME;
    private static final SubLSymbol $sym160$PSP_EDGES_WITH_SPAN;
    private static final SubLSymbol $sym161$PWHEN;
    private static final SubLSymbol $sym162$PSP_DO_EDGE_OK_;
    private static final SubLSymbol $sym163$PSP_DO_LEXICAL_EDGES_FOR_SPAN;
    private static final SubLSymbol $sym164$PSP_LEXICAL_EDGES_WITH_SPAN;
    private static final SubLSymbol $kw165$ANY;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $kw168$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw169$COMPLETE_ONLY_;
    private static final SubLSymbol $kw170$TYPE;
    private static final SubLSymbol $sym171$SPAN_TO_DO;
    private static final SubLSymbol $sym172$CHART_TO_USE;
    private static final SubLSymbol $sym173$PCOND;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$PCASE;
    private static final SubLSymbol $sym176$PSP_DO_SPANS;
    private static final SubLSymbol $kw177$LEXICAL;
    private static final SubLSymbol $sym178$INTERVAL_SPAN_P;
    private static final SubLSymbol $kw179$UNKNOWN;
    private static final SubLSymbol $kw180$INTEGER;
    private static final SubLSymbol $kw181$FLOAT;
    private static final SubLFloat $float182$0_0;
    private static final SubLSymbol $sym183$PSP_WEIGHT_P;
    private static final SubLFloat $float184$0_85;
    private static final SubLFloat $float185$1_0;
    private static final SubLFloat $float186$0_75;
    private static final SubLFloat $float187$0_9;
    private static final SubLSymbol $sym188$PSP_NP_GAP_SEMX;
    private static final SubLSymbol $sym189$_PSP_NP_GAP_SEMX_CACHING_STATE_;
    private static final SubLObject $const190$TheGappedTerm;
    private static final SubLSymbol $sym191$NEW_PSP_PHRASAL_EDGE;
    private static final SubLSymbol $sym192$NEW_PSP_LEXICAL_EDGE;
    private static final SubLString $str193$;
    private static final SubLSymbol $kw194$NEW;
    private static final SubLObject $const195$Preposition;
    private static final SubLList $list196;
    private static final SubLSymbol $kw197$NP;
    private static final SubLObject $const198$NounPhrase;
    private static final SubLSymbol $kw199$NONE;
    private static final SubLSymbol $kw200$PP;
    private static final SubLSymbol $sym201$STRINGP;
    private static final SubLSymbol $sym202$DICTIONARY_P;
    private static final SubLSymbol $sym203$LIST;
    private static final SubLSymbol $sym204$PREDICATE_P;
    private static final SubLList $list205;
    private static final SubLSymbol $kw206$OFFSET;
    private static final SubLSymbol $sym207$VECTOR;
    private static final SubLSymbol $kw208$CONSTITUENTS;
    private static final SubLSymbol $sym209$PSP_LEXICON_P;
    private static final SubLString $str210$_;
    private static final SubLString $str211$___;
    private static final SubLSymbol $kw212$INITIALIZED;
    private static final SubLSymbol $sym213$SENTENCE_P;
    private static final SubLSymbol $kw214$DILIGENT;
    private static final SubLSymbol $kw215$ADDED;
    private static final SubLObject $const216$ClosedClassWord;
    private static final SubLSymbol $sym217$PSP_TOKENIZATION_MODE_P;
    private static final SubLSymbol $kw218$GREEDY;
    private static final SubLString $str219$Failed_to_get_bigger_than__S__Lon;
    private static final SubLSymbol $sym220$LEXIFY_SENTENCE;
    private static final SubLList $list221;
    private static final SubLString $str222$a;
    private static final SubLSymbol $sym223$WORD_P;
    private static final SubLObject $const224$Number_SP;
    private static final SubLObject $const225$partOfSpeech;
    private static final SubLSymbol $sym226$PSP_SCALAR_INTERVAL_;
    private static final SubLSymbol $sym227$IBQE_;
    private static final SubLObject $const228$simpleNounStrings;
    private static final SubLSymbol $sym229$WORD_STRING;
    private static final SubLSymbol $sym230$_;
    private static final SubLSymbol $sym231$INTERVAL_SPAN_START;
    private static final SubLList $list232;
    private static final SubLObject $const233$nameString;
    private static final SubLObject $const234$InstanceNamedFn;
    private static final SubLObject $const235$Thing;
    private static final SubLObject $const236$ScalarInterval;
    private static final SubLObject $const237$passiveParticiple;
    private static final SubLObject $const238$perfect;
    private static final SubLSymbol $kw239$PASSIVE;
    private static final SubLSymbol $kw240$PASSIVE_WITH_BY;
    private static final SubLObject $const241$TransitiveNPFrame;
    private static final SubLObject $const242$Verb;
    private static final SubLList $list243;
    private static final SubLObject $const244$MassNoun;
    private static final SubLObject $const245$GerundiveNoun;
    private static final SubLObject $const246$PassivizableFrame;
    private static final SubLString $str247$the_;
    private static final SubLSymbol $kw248$DENOT;
    private static final SubLString $str249$__Adding_new_edge_____S__Looking_;
    private static final SubLSymbol $kw250$NOT_FOUND;
    private static final SubLSymbol $sym251$PSP_LEXICAL_EDGE_;
    private static final SubLList $list252;
    private static final SubLSymbol $sym253$PSP_INCOMPLETE_EDGE_;
    private static final SubLSymbol $sym254$PSP_NP_EDGE_;
    private static final SubLObject $const255$SubcategorizationFrame;
    private static final SubLString $str256$Initializing_Subcategorization_Fr;
    private static final SubLSymbol $kw257$CACHED;
    private static final SubLSymbol $sym258$ADD_SUBCAT_FRAME_INFO;
    private static final SubLSymbol $sym259$REMOVE_SUBCAT_FRAME_INFO;
    private static final SubLSymbol $sym260$PSP_BINDINGS_FROM_FRAME_INT;
    private static final SubLSymbol $kw261$INSTANCE;
    private static final SubLList $list262;
    private static final SubLObject $const263$subcatFrameDependentKeyword;
    private static final SubLSymbol $sym264$_PSP_BINDINGS_FROM_FRAME_INT_CACHING_STATE_;
    private static final SubLInteger $int265$128;
    private static final SubLSymbol $sym266$PSP_PREDICATIVE_FRAME_;
    private static final SubLObject $const267$PredicativeFrame;
    private static final SubLSymbol $sym268$_PSP_PREDICATIVE_FRAME__CACHING_STATE_;
    private static final SubLSymbol $sym269$PSP_KEYWORDS_FOR_FRAME;
    private static final SubLSymbol $sym270$_KEYWORD;
    private static final SubLObject $const271$subcatFrameKeywords;
    private static final SubLList $list272;
    private static final SubLObject $const273$InferencePSC;
    private static final SubLSymbol $sym274$_PSP_KEYWORDS_FOR_FRAME_CACHING_STATE_;
    private static final SubLSymbol $sym275$PSP_CONSTRAINED_FRAME_;
    private static final SubLObject $const276$subcatFrameDependentConstraint;
    private static final SubLSymbol $kw277$TRUE;
    private static final SubLSymbol $sym278$_PSP_CONSTRAINED_FRAME__CACHING_STATE_;
    private static final SubLSymbol $sym279$PSP_DEVISABLE_VERB_FRAMES;
    private static final SubLSymbol $sym280$DEVISABLE_VERB_FRAME_;
    private static final SubLSymbol $sym281$_PSP_DEVISABLE_VERB_FRAMES_CACHING_STATE_;
    private static final SubLSymbol $sym282$TRANSITIVE_NP_COMP_FRAME_;
    private static final SubLObject $const283$TransitiveNPFrameType;
    private static final SubLSymbol $sym284$_TRANSITIVE_NP_COMP_FRAME__CACHING_STATE_;
    private static final SubLSymbol $sym285$INTRANSITIVE_FRAME_;
    private static final SubLObject $const286$subcatFrameArity;
    private static final SubLList $list287;
    private static final SubLSymbol $sym288$_INTRANSITIVE_FRAME__CACHING_STATE_;
    private static final SubLSymbol $sym289$PSP_FRAME_HAS_TYPE_;
    private static final SubLSymbol $sym290$_PSP_FRAME_HAS_TYPE__CACHING_STATE_;
    private static final SubLSymbol $sym291$PSP_PASSIVIZED_DTR_NUM;
    private static final SubLSymbol $sym292$_N;
    private static final SubLObject $const293$and;
    private static final SubLObject $const294$isa;
    private static final SubLList $list295;
    private static final SubLList $list296;
    private static final SubLSymbol $sym297$INTEGERP;
    private static final SubLSymbol $sym298$_PSP_PASSIVIZED_DTR_NUM_CACHING_STATE_;
    private static final SubLSymbol $sym299$SECOND;
    private static final SubLList $list300;
    private static final SubLString $str301$Don_t_know_how_to_passivize__S___;
    private static final SubLList $list302;
    private static final SubLList $list303;
    private static final SubLSymbol $kw304$DENOT_GROUND;
    private static final SubLSymbol $sym305$PSP_CYCL__;
    private static final SubLObject $const306$WHWord;
    private static final SubLSymbol $sym307$GET;
    private static final SubLSymbol $kw308$CYC_CATEGORY;
    private static final SubLSymbol $kw309$WORD_UNIT;
    private static final SubLSymbol $kw310$NO_DENOT;
    private static final SubLObject $const311$RegularNounFrame;
    private static final SubLSymbol $kw312$TRIE_ENTRY;
    private static final SubLSymbol $kw313$PREDICATE;
    private static final SubLSymbol $kw314$INFLECTIONS;
    private static final SubLString $str315$titlesConventionallyQuoted;
    private static final SubLObject $const316$titleOfWork;
    private static final SubLSymbol $sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_;
    private static final SubLList $list318;
    private static final SubLObject $const319$FictionalCharacter;
    private static final SubLObject $const320$ConceptualWork;
    private static final SubLSymbol $sym321$PSP_EDGE_SUBSUMES_;
    private static final SubLString $str322$__Removing_edge_____S__is_subsume;
    private static final SubLSymbol $sym323$PSP_FIND_FRAMES;
    private static final SubLObject $const324$Noun;
    private static final SubLObject $const325$Adjective;
    private static final SubLObject $const326$RegularAdjFrame;
    private static final SubLList $list327;
    private static final SubLSymbol $kw328$DENOT_TEMPLATE;
    private static final SubLSymbol $sym329$PSP_EDGE_TO_PPH_PHRASE;
    private static final SubLSymbol $sym330$TEST_SENTENCE_SET_WORDS_FROM_STRING_LIST;
    private static final SubLSymbol $kw331$TEST;
    private static final SubLSymbol $sym332$WORD_OFFSETS_EQUAL;
    private static final SubLSymbol $kw333$OWNER;
    private static final SubLSymbol $kw334$CLASSES;
    private static final SubLSymbol $kw335$KB;
    private static final SubLSymbol $kw336$FULL;
    private static final SubLSymbol $kw337$WORKING_;
    private static final SubLList $list338;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject phrase_structure_parser_chart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_chart(v_object, stream, (SubLObject)psp_chart.ZERO_INTEGER);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject phrase_structure_parser_chart_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $phrase_structure_parser_chart_native.class) ? psp_chart.T : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_id(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_input_string(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_length(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_spans_to_edges(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_gap_type(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_memoization_state(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_edge_id_index(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_edges_to_nodes(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_max_edges_per_span(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_max_edges(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_maxed_out_spans(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_maxed_outP(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject psp_chart_parsed_lexical_spans(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_id(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_input_string(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_length(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_spans_to_edges(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_gap_type(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_edge_id_index(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_edges_to_nodes(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_max_edges_per_span(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_max_edges(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_maxed_out_spans(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_maxed_outP(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject _csetf_psp_chart_parsed_lexical_spans(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_chart_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject make_phrase_structure_parser_chart(SubLObject arglist) {
        if (arglist == psp_chart.UNPROVIDED) {
            arglist = (SubLObject)psp_chart.NIL;
        }
        final SubLObject v_new = (SubLObject)new $phrase_structure_parser_chart_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)psp_chart.NIL, next = arglist; psp_chart.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)psp_chart.$kw35$ID)) {
                _csetf_psp_chart_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw36$INPUT_STRING)) {
                _csetf_psp_chart_input_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw37$LENGTH)) {
                _csetf_psp_chart_length(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw38$SPANS_TO_EDGES)) {
                _csetf_psp_chart_spans_to_edges(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw39$GAP_TYPE)) {
                _csetf_psp_chart_gap_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw40$MEMOIZATION_STATE)) {
                _csetf_psp_chart_memoization_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw41$EDGE_ID_INDEX)) {
                _csetf_psp_chart_edge_id_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw42$EDGES_TO_NODES)) {
                _csetf_psp_chart_edges_to_nodes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw43$MAX_EDGES_PER_SPAN)) {
                _csetf_psp_chart_max_edges_per_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw44$MAX_EDGES)) {
                _csetf_psp_chart_max_edges(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw45$MAXED_OUT_SPANS)) {
                _csetf_psp_chart_maxed_out_spans(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw46$MAXED_OUT_)) {
                _csetf_psp_chart_maxed_outP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw47$PARSED_LEXICAL_SPANS)) {
                _csetf_psp_chart_parsed_lexical_spans(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)psp_chart.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject visit_defstruct_phrase_structure_parser_chart(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw49$BEGIN, (SubLObject)psp_chart.$sym50$MAKE_PHRASE_STRUCTURE_PARSER_CHART, (SubLObject)psp_chart.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw35$ID, psp_chart_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw36$INPUT_STRING, psp_chart_input_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw37$LENGTH, psp_chart_length(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw38$SPANS_TO_EDGES, psp_chart_spans_to_edges(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw39$GAP_TYPE, psp_chart_gap_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw40$MEMOIZATION_STATE, psp_chart_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw41$EDGE_ID_INDEX, psp_chart_edge_id_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw42$EDGES_TO_NODES, psp_chart_edges_to_nodes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw43$MAX_EDGES_PER_SPAN, psp_chart_max_edges_per_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw44$MAX_EDGES, psp_chart_max_edges(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw45$MAXED_OUT_SPANS, psp_chart_maxed_out_spans(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw46$MAXED_OUT_, psp_chart_maxed_outP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw47$PARSED_LEXICAL_SPANS, psp_chart_parsed_lexical_spans(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw52$END, (SubLObject)psp_chart.$sym50$MAKE_PHRASE_STRUCTURE_PARSER_CHART, (SubLObject)psp_chart.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 946L)
    public static SubLObject visit_defstruct_object_phrase_structure_parser_chart_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_chart(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 1637L)
    public static SubLObject pprint_psp_chart(final SubLObject v_psp_chart, SubLObject stream, SubLObject depth) {
        if (stream == psp_chart.UNPROVIDED) {
            stream = (SubLObject)psp_chart.NIL;
        }
        if (depth == psp_chart.UNPROVIDED) {
            depth = (SubLObject)psp_chart.NIL;
        }
        PrintLow.format(stream, (SubLObject)psp_chart.$str55$__PSP_CHART__S__S_, psp_chart_id(v_psp_chart), psp_chart_input_string(v_psp_chart));
        return v_psp_chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 1844L)
    public static SubLObject new_psp_chart(SubLObject input_string, SubLObject length) {
        if (input_string == psp_chart.UNPROVIDED) {
            input_string = (SubLObject)psp_chart.NIL;
        }
        if (length == psp_chart.UNPROVIDED) {
            length = (SubLObject)psp_chart.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart = make_phrase_structure_parser_chart((SubLObject)psp_chart.UNPROVIDED);
        _csetf_psp_chart_id(chart, psp_chart.$psp_chart_id_counter$.getGlobalValue());
        psp_chart.$psp_chart_id_counter$.setGlobalValue(Numbers.add(psp_chart.$psp_chart_id_counter$.getGlobalValue(), (SubLObject)psp_chart.ONE_INTEGER));
        psp_chart_set_string(chart, input_string);
        _csetf_psp_chart_length(chart, length);
        _csetf_psp_chart_spans_to_edges(chart, dictionary.new_dictionary((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
        _csetf_psp_chart_memoization_state(chart, memoization_state.new_memoization_state((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
        if (psp_chart.NIL != psp_chart_index_edgesP()) {
            _csetf_psp_chart_edge_id_index(chart, id_index.new_id_index((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
        }
        else {
            _csetf_psp_chart_edge_id_index(chart, (SubLObject)psp_chart.ZERO_INTEGER);
        }
        _csetf_psp_chart_edges_to_nodes(chart, dictionary.new_dictionary((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
        _csetf_psp_chart_max_edges(chart, parsing_vars.$psp_max_edges_per_chart$.getDynamicValue(thread));
        _csetf_psp_chart_max_edges_per_span(chart, parsing_vars.$psp_max_edges_per_span$.getDynamicValue(thread));
        _csetf_psp_chart_maxed_out_spans(chart, set.new_set(Symbols.symbol_function((SubLObject)psp_chart.EQ), (SubLObject)psp_chart.UNPROVIDED));
        _csetf_psp_chart_maxed_outP(chart, (SubLObject)psp_chart.NIL);
        _csetf_psp_chart_parsed_lexical_spans(chart, set.new_set(Symbols.symbol_function((SubLObject)psp_chart.EQ), (SubLObject)psp_chart.UNPROVIDED));
        return chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 2821L)
    public static SubLObject destroy_psp_chart(SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        psp_chart_clear(chart);
        return (SubLObject)psp_chart.$kw56$DESTROYED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 2981L)
    public static SubLObject psp_chart_clear(final SubLObject chart) {
        _csetf_psp_chart_input_string(chart, (SubLObject)psp_chart.NIL);
        _csetf_psp_chart_length(chart, (SubLObject)psp_chart.NIL);
        dictionary.clear_dictionary(psp_chart_spans_to_edges(chart));
        dictionary.clear_dictionary(psp_chart_edges_to_nodes(chart));
        set.clear_set(psp_chart_maxed_out_spans(chart));
        set.clear_set(psp_chart_parsed_lexical_spans(chart));
        memoization_state.clear_all_memoization(psp_chart_memoization_state(chart));
        final SubLObject v_id_index = psp_chart_edge_id_index(chart);
        if (psp_chart.NIL != id_index.id_index_p(v_id_index)) {
            id_index.clear_id_index(v_id_index);
        }
        return (SubLObject)psp_chart.$kw57$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 3515L)
    public static SubLObject psp_chart_set_string(final SubLObject chart, final SubLObject string) {
        _csetf_psp_chart_input_string(chart, string);
        return (SubLObject)psp_chart.$kw58$SET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 3630L)
    public static SubLObject psp_chart_new_edge_id(final SubLObject chart) {
        final SubLObject id_index_or_counter = psp_chart_edge_id_index(chart);
        if (psp_chart.NIL != id_index.id_index_p(id_index_or_counter)) {
            return id_index.id_index_reserve(id_index_or_counter);
        }
        if (id_index_or_counter.isInteger()) {
            final SubLObject id = id_index_or_counter;
            _csetf_psp_chart_edge_id_index(chart, Numbers.add(psp_chart_edge_id_index(chart), (SubLObject)psp_chart.ONE_INTEGER));
            return id;
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 4074L)
    public static SubLObject psp_chart_index_edgesP() {
        return psp_chart.$psp_chart_index_edgesP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 4151L)
    public static SubLObject psp_find_edge_by_id(final SubLObject suid, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (psp_chart.NIL == psp_chart_index_edgesP()) {
            Errors.warn((SubLObject)psp_chart.$str59$Not_indexing_PSP_edges__Can_t_fin);
            return (SubLObject)psp_chart.NIL;
        }
        if (psp_chart.NIL == phrase_structure_parser_chart_p(chart)) {
            Errors.warn((SubLObject)psp_chart.$str60$_S_is_not_a_PSP_chart__Can_t_find);
            return (SubLObject)psp_chart.NIL;
        }
        final SubLObject v_id_index = psp_chart_edge_id_index(chart);
        return id_index.id_index_lookup(v_id_index, suid, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 4586L)
    public static SubLObject psp_chart_set_gap_type(final SubLObject chart, final SubLObject gap_type) {
        _csetf_psp_chart_gap_type(chart, gap_type);
        return (SubLObject)psp_chart.$kw58$SET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject phrase_structure_parser_phrasal_edge_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_phrasal_edge(v_object, stream, (SubLObject)psp_chart.ZERO_INTEGER);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject phrase_structure_parser_phrasal_edge_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $phrase_structure_parser_phrasal_edge_native.class) ? psp_chart.T : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_weight(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_string(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_span(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_category(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_pos_pred(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_cycls(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_rule(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_new_dtr_constraints(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_head_dtr(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_non_head_dtrs(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_id(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject psp_phrasal_edge_chart(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_weight(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_string(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_span(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_category(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_pos_pred(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_cycls(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_rule(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_new_dtr_constraints(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_head_dtr(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_non_head_dtrs(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_id(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject _csetf_psp_phrasal_edge_chart(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject make_phrase_structure_parser_phrasal_edge(SubLObject arglist) {
        if (arglist == psp_chart.UNPROVIDED) {
            arglist = (SubLObject)psp_chart.NIL;
        }
        final SubLObject v_new = (SubLObject)new $phrase_structure_parser_phrasal_edge_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)psp_chart.NIL, next = arglist; psp_chart.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)psp_chart.$kw94$WEIGHT)) {
                _csetf_psp_phrasal_edge_weight(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw95$STRING)) {
                _csetf_psp_phrasal_edge_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw96$SPAN)) {
                _csetf_psp_phrasal_edge_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw97$CATEGORY)) {
                _csetf_psp_phrasal_edge_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw98$POS_PRED)) {
                _csetf_psp_phrasal_edge_pos_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw99$CYCLS)) {
                _csetf_psp_phrasal_edge_cycls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw100$RULE)) {
                _csetf_psp_phrasal_edge_rule(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw101$NEW_DTR_CONSTRAINTS)) {
                _csetf_psp_phrasal_edge_new_dtr_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw102$HEAD_DTR)) {
                _csetf_psp_phrasal_edge_head_dtr(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw103$NON_HEAD_DTRS)) {
                _csetf_psp_phrasal_edge_non_head_dtrs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw35$ID)) {
                _csetf_psp_phrasal_edge_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw104$CHART)) {
                _csetf_psp_phrasal_edge_chart(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)psp_chart.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject visit_defstruct_phrase_structure_parser_phrasal_edge(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw49$BEGIN, (SubLObject)psp_chart.$sym105$MAKE_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE, (SubLObject)psp_chart.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw94$WEIGHT, psp_phrasal_edge_weight(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw95$STRING, psp_phrasal_edge_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw96$SPAN, psp_phrasal_edge_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw97$CATEGORY, psp_phrasal_edge_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw98$POS_PRED, psp_phrasal_edge_pos_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw99$CYCLS, psp_phrasal_edge_cycls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw100$RULE, psp_phrasal_edge_rule(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw101$NEW_DTR_CONSTRAINTS, psp_phrasal_edge_new_dtr_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw102$HEAD_DTR, psp_phrasal_edge_head_dtr(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw103$NON_HEAD_DTRS, psp_phrasal_edge_non_head_dtrs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw35$ID, psp_phrasal_edge_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw104$CHART, psp_phrasal_edge_chart(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw52$END, (SubLObject)psp_chart.$sym105$MAKE_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE, (SubLObject)psp_chart.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 5420L)
    public static SubLObject visit_defstruct_object_phrase_structure_parser_phrasal_edge_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_phrasal_edge(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6012L)
    public static SubLObject sxhash_phrase_structure_parser_phrasal_edge_method(final SubLObject v_object) {
        return sxhash_psp_edge(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6118L)
    public static SubLObject pprint_psp_phrasal_edge(final SubLObject psp_phrasal_edge, SubLObject stream, SubLObject depth) {
        if (stream == psp_chart.UNPROVIDED) {
            stream = (SubLObject)psp_chart.NIL;
        }
        if (depth == psp_chart.UNPROVIDED) {
            depth = (SubLObject)psp_chart.NIL;
        }
        PrintLow.format(stream, (SubLObject)psp_chart.$str108$__PSP_PHRASAL_EDGE__S__S__S_, new SubLObject[] { psp_phrasal_edge_id(psp_phrasal_edge), psp_phrasal_edge_string(psp_phrasal_edge), psp_phrasal_edge_rule(psp_phrasal_edge) });
        return psp_phrasal_edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject phrase_structure_parser_lexical_edge_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_lexical_edge(v_object, stream, (SubLObject)psp_chart.ZERO_INTEGER);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject phrase_structure_parser_lexical_edge_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $phrase_structure_parser_lexical_edge_native.class) ? psp_chart.T : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_weight(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_string(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_span(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_category(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_pos_pred(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_cycls(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_wu(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_frame(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_id(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject psp_lexical_edge_chart(final SubLObject v_object) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_weight(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_string(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_span(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_category(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_pos_pred(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_cycls(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_wu(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_frame(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_id(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject _csetf_psp_lexical_edge_chart(final SubLObject v_object, final SubLObject value) {
        assert psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject make_phrase_structure_parser_lexical_edge(SubLObject arglist) {
        if (arglist == psp_chart.UNPROVIDED) {
            arglist = (SubLObject)psp_chart.NIL;
        }
        final SubLObject v_new = (SubLObject)new $phrase_structure_parser_lexical_edge_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)psp_chart.NIL, next = arglist; psp_chart.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)psp_chart.$kw94$WEIGHT)) {
                _csetf_psp_lexical_edge_weight(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw95$STRING)) {
                _csetf_psp_lexical_edge_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw96$SPAN)) {
                _csetf_psp_lexical_edge_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw97$CATEGORY)) {
                _csetf_psp_lexical_edge_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw98$POS_PRED)) {
                _csetf_psp_lexical_edge_pos_pred(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw99$CYCLS)) {
                _csetf_psp_lexical_edge_cycls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw138$WU)) {
                _csetf_psp_lexical_edge_wu(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw139$FRAME)) {
                _csetf_psp_lexical_edge_frame(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw35$ID)) {
                _csetf_psp_lexical_edge_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_chart.$kw104$CHART)) {
                _csetf_psp_lexical_edge_chart(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)psp_chart.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject visit_defstruct_phrase_structure_parser_lexical_edge(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw49$BEGIN, (SubLObject)psp_chart.$sym140$MAKE_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE, (SubLObject)psp_chart.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw94$WEIGHT, psp_lexical_edge_weight(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw95$STRING, psp_lexical_edge_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw96$SPAN, psp_lexical_edge_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw97$CATEGORY, psp_lexical_edge_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw98$POS_PRED, psp_lexical_edge_pos_pred(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw99$CYCLS, psp_lexical_edge_cycls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw138$WU, psp_lexical_edge_wu(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw139$FRAME, psp_lexical_edge_frame(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw35$ID, psp_lexical_edge_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw51$SLOT, (SubLObject)psp_chart.$kw104$CHART, psp_lexical_edge_chart(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_chart.$kw52$END, (SubLObject)psp_chart.$sym140$MAKE_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE, (SubLObject)psp_chart.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 6864L)
    public static SubLObject visit_defstruct_object_phrase_structure_parser_lexical_edge_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_lexical_edge(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 7393L)
    public static SubLObject sxhash_psp_edge(final SubLObject edge) {
        final SubLObject id = get_psp_edge_id(edge);
        if (id.isFixnum()) {
            return id;
        }
        return Sxhash.sxhash(get_psp_edge_string(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 7607L)
    public static SubLObject sxhash_phrase_structure_parser_lexical_edge_method(final SubLObject v_object) {
        return sxhash_psp_edge(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 7712L)
    public static SubLObject psp_chart_spans(SubLObject chart, SubLObject start, SubLObject end) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (start == psp_chart.UNPROVIDED) {
            start = parsing_vars.$psp_chart_start_index$.getDynamicValue();
        }
        if (end == psp_chart.UNPROVIDED) {
            end = parsing_vars.$psp_chart_end_index$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spans = (SubLObject)psp_chart.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart_spans_to_edges(chart))); psp_chart.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (interval_span.interval_span_start(span).numGE(start) && (psp_chart.NIL == end || interval_span.interval_span_end(span).numLE(end))) {
                spans = (SubLObject)ConsesLow.cons(span, spans);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return spans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 8167L)
    public static SubLObject pprint_psp_lexical_edge(final SubLObject psp_lexical_edge, SubLObject stream, SubLObject depth) {
        if (stream == psp_chart.UNPROVIDED) {
            stream = (SubLObject)psp_chart.NIL;
        }
        if (depth == psp_chart.UNPROVIDED) {
            depth = (SubLObject)psp_chart.NIL;
        }
        final SubLObject cycls = psp_lexical_edge_cycls(psp_lexical_edge);
        PrintLow.format(stream, (SubLObject)psp_chart.$str143$__PSP_LEXICAL_EDGE__S__S__S__S_W_, new SubLObject[] { psp_lexical_edge_id(psp_lexical_edge), psp_lexical_edge_string(psp_lexical_edge), get_psp_edge_category(psp_lexical_edge), (psp_chart.NIL != dictionary.dictionary_p(cycls)) ? dictionary.dictionary_values(cycls) : string_utilities.$empty_string$.getGlobalValue(), psp_lexical_edge_weight(psp_lexical_edge) });
        return psp_lexical_edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 8785L)
    public static SubLObject psp_format_edge(final SubLObject edge, SubLObject stream) {
        if (stream == psp_chart.UNPROVIDED) {
            stream = (SubLObject)psp_chart.T;
        }
        final SubLObject semx = psp_semantics.psp_semantics_for_edge(edge, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        if (psp_chart.NIL != semx) {
            PrintLow.format(stream, (SubLObject)psp_chart.$str144$___S___S______S__, new SubLObject[] { get_psp_edge_category(edge), get_psp_edge_pos_pred(edge), semx });
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 9088L)
    public static SubLObject phrase_structure_parser_edge_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(v_object) || psp_chart.NIL != phrase_structure_parser_lexical_edge_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 9260L)
    public static SubLObject get_psp_edge_weight(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_weight(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_weight(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 9546L)
    public static SubLObject get_psp_edge_string(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            SubLObject string = psp_phrasal_edge_string(edge);
            if (psp_chart.NIL == string) {
                SubLObject dtr_strings = (SubLObject)psp_chart.NIL;
                SubLObject csome_list_var = psp_edge_dtrs(edge);
                SubLObject dtr = (SubLObject)psp_chart.NIL;
                dtr = csome_list_var.first();
                while (psp_chart.NIL != csome_list_var) {
                    dtr_strings = (SubLObject)ConsesLow.cons(get_psp_edge_string(dtr), dtr_strings);
                    csome_list_var = csome_list_var.rest();
                    dtr = csome_list_var.first();
                }
                string = string_utilities.bunge(Sequences.nreverse(dtr_strings), (SubLObject)psp_chart.UNPROVIDED);
                _csetf_psp_phrasal_edge_string(edge, string);
            }
            return string;
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_string(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 10094L)
    public static SubLObject get_psp_edge_span(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_span(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_span(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 10373L)
    public static SubLObject get_psp_edge_category(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_category(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_category(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 10664L)
    public static SubLObject get_psp_edge_pos_pred(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_pos_pred(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_pos_pred(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 10955L)
    public static SubLObject get_psp_edge_cycls(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            SubLObject cycls = psp_phrasal_edge_cycls(edge);
            if (psp_chart.NIL == cycls) {
                cycls = psp_new_cycls((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
                _csetf_psp_phrasal_edge_cycls(edge, cycls);
            }
            return cycls;
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            SubLObject cycls = psp_lexical_edge_cycls(edge);
            if (psp_chart.NIL == cycls) {
                cycls = psp_new_cycls((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
                _csetf_psp_lexical_edge_cycls(edge, cycls);
            }
            return cycls;
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 11491L)
    public static SubLObject get_psp_edge_rule(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_rule(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 11653L)
    public static SubLObject get_psp_edge_new_dtr_constraints(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_new_dtr_constraints(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 11845L)
    public static SubLObject get_psp_edge_head_dtr(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_head_dtr(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 12015L)
    public static SubLObject get_psp_edge_non_head_dtrs(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_non_head_dtrs(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 12195L)
    public static SubLObject get_psp_edge_wu(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_wu(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 12353L)
    public static SubLObject get_psp_edge_frame(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_frame(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 12517L)
    public static SubLObject get_psp_edge_id(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_id(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_id(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 12790L)
    public static SubLObject get_psp_edge_chart(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            return psp_phrasal_edge_chart(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            return psp_lexical_edge_chart(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 13072L)
    public static SubLObject get_psp_edge_head_lexeme(final SubLObject edge) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            final SubLObject head_dtr = psp_phrasal_edge_head_dtr(edge);
            if (psp_chart.NIL != head_dtr) {
                return get_psp_edge_head_lexeme(head_dtr);
            }
            Errors.warn((SubLObject)psp_chart.$str146$Headless_edge___S, edge);
            return (SubLObject)psp_chart.NIL;
        }
        else {
            if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
                return edge;
            }
            Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
            return (SubLObject)psp_chart.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 13523L)
    public static SubLObject set_psp_edge_weight(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_weight(edge, value);
            return psp_phrasal_edge_weight(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_weight(edge, value);
            return psp_lexical_edge_weight(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 13927L)
    public static SubLObject set_psp_edge_string(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_string(edge, value);
            return psp_phrasal_edge_string(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_string(edge, value);
            return psp_lexical_edge_string(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 14316L)
    public static SubLObject set_psp_edge_span(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_span(edge, value);
            return psp_phrasal_edge_span(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_span(edge, value);
            return psp_lexical_edge_span(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 14695L)
    public static SubLObject set_psp_edge_category(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_category(edge, value);
            return psp_phrasal_edge_category(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_category(edge, value);
            return psp_lexical_edge_category(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 15094L)
    public static SubLObject set_psp_edge_pos_pred(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_pos_pred(edge, value);
            return psp_phrasal_edge_pos_pred(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_pos_pred(edge, value);
            return psp_lexical_edge_pos_pred(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 15493L)
    public static SubLObject set_psp_edge_cycls(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_cycls(edge, value);
            return psp_phrasal_edge_cycls(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_cycls(edge, value);
            return psp_lexical_edge_cycls(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 15877L)
    public static SubLObject set_psp_edge_rule(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_rule(edge, value);
            return psp_phrasal_edge_rule(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 16092L)
    public static SubLObject set_psp_edge_new_dtr_constraints(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_new_dtr_constraints(edge, value);
            return psp_phrasal_edge_new_dtr_constraints(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 16352L)
    public static SubLObject set_psp_edge_head_dtr(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_head_dtr(edge, value);
            return psp_phrasal_edge_head_dtr(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 16579L)
    public static SubLObject set_psp_edge_non_head_dtrs(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_non_head_dtrs(edge, value);
            return psp_phrasal_edge_non_head_dtrs(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 16821L)
    public static SubLObject set_psp_edge_wu(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_wu(edge, value);
            return psp_lexical_edge_wu(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 17030L)
    public static SubLObject set_psp_edge_frame(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_frame(edge, value);
            return psp_lexical_edge_frame(edge);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 17248L)
    public static SubLObject set_psp_edge_id(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_id(edge, value);
            return psp_phrasal_edge_id(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_id(edge, value);
            return psp_lexical_edge_id(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 17617L)
    public static SubLObject set_psp_edge_chart(final SubLObject edge, final SubLObject value) {
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge)) {
            _csetf_psp_phrasal_edge_chart(edge, value);
            return psp_phrasal_edge_chart(edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_lexical_edge_p(edge)) {
            _csetf_psp_lexical_edge_chart(edge, value);
            return psp_lexical_edge_chart(edge);
        }
        Errors.error((SubLObject)psp_chart.$str145$_S_is_not_a_PSP_edge_, edge);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 18001L)
    public static SubLObject psp_do_spans(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject span_var = (SubLObject)psp_chart.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list147);
        span_var = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : psp_chart.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)psp_chart.$list147);
        current = current.rest();
        final SubLObject chart = (SubLObject)(current.isCons() ? current.first() : psp_chart.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)psp_chart.$list147);
        current = current.rest();
        if (psp_chart.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject chart_to_use = (SubLObject)psp_chart.$sym148$CHART_TO_USE;
            return (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym149$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(chart_to_use, (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym150$FIRST_OF, chart, (SubLObject)psp_chart.$list151))), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym152$CHECK_TYPE, chart_to_use, (SubLObject)psp_chart.$list153), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym154$DO_DICTIONARY_KEYS, (SubLObject)ConsesLow.list(span_var, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym15$PSP_CHART_SPANS_TO_EDGES, chart_to_use), (SubLObject)psp_chart.$kw155$DONE, done), ConsesLow.append(body, (SubLObject)psp_chart.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list147);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 18502L)
    public static SubLObject psp_do_edges_for_span(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject edge_var = (SubLObject)psp_chart.NIL;
        SubLObject chart = (SubLObject)psp_chart.NIL;
        SubLObject category = (SubLObject)psp_chart.NIL;
        SubLObject span = (SubLObject)psp_chart.NIL;
        SubLObject complete_onlyP = (SubLObject)psp_chart.NIL;
        SubLObject done = (SubLObject)psp_chart.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        edge_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        chart = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        category = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        span = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        complete_onlyP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        done = current.first();
        current = current.rest();
        if (psp_chart.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym159$CSOME, (SubLObject)ConsesLow.list(edge_var, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym160$PSP_EDGES_WITH_SPAN, span, chart), done), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym161$PWHEN, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym162$PSP_DO_EDGE_OK_, edge_var, category, complete_onlyP), ConsesLow.append(body, (SubLObject)psp_chart.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list158);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 18911L)
    public static SubLObject psp_do_lexical_edges_for_span(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject edge_var = (SubLObject)psp_chart.NIL;
        SubLObject chart = (SubLObject)psp_chart.NIL;
        SubLObject category = (SubLObject)psp_chart.NIL;
        SubLObject span = (SubLObject)psp_chart.NIL;
        SubLObject complete_onlyP = (SubLObject)psp_chart.NIL;
        SubLObject done = (SubLObject)psp_chart.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        edge_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        chart = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        category = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        span = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        complete_onlyP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list158);
        done = current.first();
        current = current.rest();
        if (psp_chart.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym159$CSOME, (SubLObject)ConsesLow.list(edge_var, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym164$PSP_LEXICAL_EDGES_WITH_SPAN, span, chart), done), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym161$PWHEN, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym162$PSP_DO_EDGE_OK_, edge_var, category, complete_onlyP), ConsesLow.append(body, (SubLObject)psp_chart.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list158);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 19353L)
    public static SubLObject psp_do_edge_okP(final SubLObject edge, final SubLObject category, final SubLObject complete_onlyP) {
        return (SubLObject)SubLObjectFactory.makeBoolean((psp_chart.NIL == complete_onlyP || psp_chart.NIL == psp_incomplete_edgeP(edge)) && (category == psp_chart.$kw165$ANY || psp_chart.NIL != psp_rules.psp_valid_constituent_typeP(get_psp_edge_category(edge), category)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 19716L)
    public static SubLObject psp_do_edges(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject edge_var = (SubLObject)psp_chart.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list166);
        edge_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list166);
        final SubLObject temp_$1 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)psp_chart.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)psp_chart.NIL;
        SubLObject current_$2 = (SubLObject)psp_chart.NIL;
        while (psp_chart.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)psp_chart.$list166);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)psp_chart.$list166);
            if (psp_chart.NIL == conses_high.member(current_$2, (SubLObject)psp_chart.$list167, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED)) {
                bad = (SubLObject)psp_chart.T;
            }
            if (current_$2 == psp_chart.$kw168$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (psp_chart.NIL != bad && psp_chart.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list166);
        }
        final SubLObject chart_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw104$CHART, current);
        final SubLObject chart = (SubLObject)((psp_chart.NIL != chart_tail) ? conses_high.cadr(chart_tail) : psp_chart.NIL);
        final SubLObject category_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw97$CATEGORY, current);
        final SubLObject category = (SubLObject)((psp_chart.NIL != category_tail) ? conses_high.cadr(category_tail) : psp_chart.$kw165$ANY);
        final SubLObject span_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw96$SPAN, current);
        final SubLObject span = (SubLObject)((psp_chart.NIL != span_tail) ? conses_high.cadr(span_tail) : psp_chart.$kw165$ANY);
        final SubLObject complete_onlyP_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw169$COMPLETE_ONLY_, current);
        final SubLObject complete_onlyP = (SubLObject)((psp_chart.NIL != complete_onlyP_tail) ? conses_high.cadr(complete_onlyP_tail) : psp_chart.T);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw170$TYPE, current);
        final SubLObject type = (SubLObject)((psp_chart.NIL != type_tail) ? conses_high.cadr(type_tail) : psp_chart.$kw165$ANY);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)psp_chart.$kw155$DONE, current);
        final SubLObject done = (SubLObject)((psp_chart.NIL != done_tail) ? conses_high.cadr(done_tail) : psp_chart.NIL);
        current = temp_$1;
        if (psp_chart.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject span_to_do = (SubLObject)psp_chart.$sym171$SPAN_TO_DO;
            final SubLObject chart_to_use = (SubLObject)psp_chart.$sym172$CHART_TO_USE;
            return (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym149$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(chart_to_use, (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym150$FIRST_OF, chart, (SubLObject)psp_chart.$list151))), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym152$CHECK_TYPE, chart_to_use, (SubLObject)psp_chart.$list153), (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym173$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)psp_chart.EQ, span, (SubLObject)psp_chart.$list174), (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym175$PCASE, type, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw165$ANY, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym176$PSP_DO_SPANS, (SubLObject)ConsesLow.list(span_to_do, done, chart_to_use), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym156$PSP_DO_EDGES_FOR_SPAN, (SubLObject)ConsesLow.list(edge_var, chart_to_use, category, span_to_do, complete_onlyP, done), ConsesLow.append(body, (SubLObject)psp_chart.NIL)))), (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw177$LEXICAL, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym176$PSP_DO_SPANS, (SubLObject)ConsesLow.list(span_to_do, done, chart_to_use), (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym163$PSP_DO_LEXICAL_EDGES_FOR_SPAN, (SubLObject)ConsesLow.list(edge_var, chart_to_use, category, span_to_do, complete_onlyP, done), ConsesLow.append(body, (SubLObject)psp_chart.NIL)))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym178$INTERVAL_SPAN_P, span), (SubLObject)ConsesLow.list((SubLObject)psp_chart.$sym175$PCASE, type, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw165$ANY, (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym156$PSP_DO_EDGES_FOR_SPAN, (SubLObject)ConsesLow.list(edge_var, chart_to_use, category, span, complete_onlyP, done), ConsesLow.append(body, (SubLObject)psp_chart.NIL))), (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw177$LEXICAL, (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$sym163$PSP_DO_LEXICAL_EDGES_FOR_SPAN, (SubLObject)ConsesLow.list(edge_var, chart_to_use, category, span, complete_onlyP, done), ConsesLow.append(body, (SubLObject)psp_chart.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list166);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 21204L)
    public static SubLObject psp_weight_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_unknown_weight_p(obj) || (psp_chart.NIL != possibly_psp_known_weight_p(obj) && obj.numLE(parsing_vars.$psp_max_weight$.getGlobalValue()) && obj.numGE(parsing_vars.$psp_min_weight$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 21387L)
    public static SubLObject psp_unknown_weight_p(final SubLObject obj) {
        return Equality.eq(obj, psp_chart.$psp_unknown_weight$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 21470L)
    public static SubLObject possibly_psp_known_weight_p(final SubLObject obj) {
        final SubLObject pcase_var = parsing_vars.$psp_weight_type$.getGlobalValue();
        if (pcase_var.eql((SubLObject)psp_chart.$kw180$INTEGER)) {
            return Types.integerp(obj);
        }
        if (pcase_var.eql((SubLObject)psp_chart.$kw181$FLOAT)) {
            return Types.floatp(obj);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 21644L)
    public static SubLObject psp_weight_G(final SubLObject weight1, final SubLObject weight2, SubLObject margin_of_error) {
        if (margin_of_error == psp_chart.UNPROVIDED) {
            margin_of_error = (SubLObject)psp_chart.$float182$0_0;
        }
        assert psp_chart.NIL != psp_weight_p(weight1) : weight1;
        assert psp_chart.NIL != psp_weight_p(weight2) : weight2;
        if (psp_chart.NIL != possibly_psp_known_weight_p(weight1) && psp_chart.NIL != possibly_psp_known_weight_p(weight2)) {
            return Numbers.numG(weight1, Numbers.multiply(weight2, number_utilities.f_1X(margin_of_error)));
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22180L)
    public static SubLObject psp_weight_L(final SubLObject weight1, final SubLObject weight2, SubLObject margin_of_error) {
        if (margin_of_error == psp_chart.UNPROVIDED) {
            margin_of_error = (SubLObject)psp_chart.$float182$0_0;
        }
        assert psp_chart.NIL != psp_weight_p(weight1) : weight1;
        assert psp_chart.NIL != psp_weight_p(weight2) : weight2;
        return Numbers.numL(weight1, Numbers.multiply(weight2, number_utilities.f_1X(margin_of_error)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 22958L)
    public static SubLObject psp_weight_compose(final SubLObject weights) {
        SubLObject known_weightP = (SubLObject)psp_chart.NIL;
        SubLObject current_weight = parsing_vars.$psp_max_weight$.getGlobalValue();
        SubLObject cdolist_list_var = weights;
        SubLObject weight = (SubLObject)psp_chart.NIL;
        weight = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            if (psp_chart.NIL == psp_unknown_weight_p(weight)) {
                known_weightP = (SubLObject)psp_chart.T;
                current_weight = psp_weight_compose_two(current_weight, weight);
            }
            cdolist_list_var = cdolist_list_var.rest();
            weight = cdolist_list_var.first();
        }
        if (psp_chart.NIL != known_weightP) {
            return current_weight;
        }
        return psp_chart.$psp_unknown_weight$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 23401L)
    public static SubLObject psp_weight_compose_two(final SubLObject weight1, final SubLObject weight2) {
        assert psp_chart.NIL != psp_weight_p(weight1) : weight1;
        assert psp_chart.NIL != psp_weight_p(weight2) : weight2;
        if (psp_chart.NIL != psp_unknown_weight_p(weight1)) {
            return weight2;
        }
        if (psp_chart.NIL != psp_unknown_weight_p(weight2)) {
            return weight1;
        }
        final SubLObject weight_product = Numbers.multiply(weight1, weight2);
        final SubLObject pcase_var = parsing_vars.$psp_weight_type$.getGlobalValue();
        if (pcase_var.eql((SubLObject)psp_chart.$kw180$INTEGER)) {
            return Numbers.integerDivide(weight_product, parsing_vars.$psp_max_weight$.getGlobalValue());
        }
        if (pcase_var.eql((SubLObject)psp_chart.$kw181$FLOAT)) {
            return Numbers.divide(weight_product, parsing_vars.$psp_max_weight$.getGlobalValue());
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 23852L)
    public static SubLObject psp_edge_weight_unknown_p(final SubLObject edge) {
        return psp_unknown_weight_p(get_psp_edge_weight(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 23961L)
    public static SubLObject psp_edge_weight_from_dtrs(final SubLObject head_dtr, final SubLObject non_head_dtrs, final SubLObject rule) {
        SubLObject weight = psp_rules.psp_rule_weight(rule);
        if (psp_chart.NIL != head_dtr) {
            weight = psp_weight_compose_two(weight, get_psp_edge_weight(head_dtr));
        }
        SubLObject cdolist_list_var = non_head_dtrs;
        SubLObject non_head_dtr = (SubLObject)psp_chart.NIL;
        non_head_dtr = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            weight = psp_weight_compose_two(weight, get_psp_edge_weight(non_head_dtr));
            cdolist_list_var = cdolist_list_var.rest();
            non_head_dtr = cdolist_list_var.first();
        }
        return weight;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24407L)
    public static SubLObject clear_psp_np_gap_semx() {
        final SubLObject cs = psp_chart.$psp_np_gap_semx_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24407L)
    public static SubLObject remove_psp_np_gap_semx() {
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_np_gap_semx_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(psp_chart.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24407L)
    public static SubLObject psp_np_gap_semx_internal() {
        final SubLObject cycl = psp_np_gap_referent();
        final SubLObject cycls = psp_new_cycls(cycl, (SubLObject)psp_chart.UNPROVIDED);
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24407L)
    public static SubLObject psp_np_gap_semx() {
        SubLObject caching_state = psp_chart.$psp_np_gap_semx_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym188$PSP_NP_GAP_SEMX, (SubLObject)psp_chart.$sym189$_PSP_NP_GAP_SEMX_CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.ZERO_INTEGER, (SubLObject)psp_chart.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)psp_chart.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_np_gap_semx_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24581L)
    public static SubLObject psp_np_gap_referent() {
        return psp_chart.$const190$TheGappedTerm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 24697L)
    public static SubLObject new_psp_gap_edge(final SubLObject index, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrasalP = Numbers.numG(lexicon_utilities.bar_level(category, (SubLObject)psp_chart.UNPROVIDED), (SubLObject)psp_chart.ONE_INTEGER);
        final SubLObject constructor = (SubLObject)((psp_chart.NIL != phrasalP) ? psp_chart.$sym191$NEW_PSP_PHRASAL_EDGE : psp_chart.$sym192$NEW_PSP_LEXICAL_EDGE);
        final SubLObject new_edge = Functions.funcall(constructor, new SubLObject[] { parsing_vars.$psp_chart$.getDynamicValue(thread), interval_span.get_interval_span(index, index), psp_chart.$str193$, category, psp_chart.NIL, psp_chart.$kw194$NEW, psp_chart.$psp_gap_edge_weight$.getGlobalValue() });
        if (category.eql(psp_chart.$const195$Preposition) && psp_chart.NIL != psp_pp_gap_string()) {
            set_psp_edge_wu(new_edge, lexicon_accessors.words_of_stringXspeech_part(psp_pp_gap_string(), psp_chart.$const195$Preposition, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED).first());
        }
        else if (psp_chart.NIL != lexicon_accessors.npP(category)) {
            set_psp_edge_cycls(new_edge, psp_np_gap_semx());
        }
        return new_edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 25381L)
    public static SubLObject psp_gap_edge_p(final SubLObject edge) {
        return Equality.eql(psp_edge_start_index(edge), psp_edge_end_index(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 25496L)
    public static SubLObject psp_np_gap_edge_p(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_gap_edge_p(edge) && psp_chart.NIL != lexicon_accessors.npP(get_psp_edge_category(edge)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 25619L)
    public static SubLObject psp_preposition_gap_edge_p(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_gap_edge_p(edge) && get_psp_edge_category(edge).eql(psp_chart.$const195$Preposition));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 25765L)
    public static SubLObject psp_pp_gap_edge_p(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_gap_edge_p(edge) && psp_chart.NIL != lexicon_accessors.ppP(get_psp_edge_category(edge)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 25888L)
    public static SubLObject psp_gap_constraint_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != conses_high.member(obj, (SubLObject)psp_chart.$list196, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED) || psp_chart.NIL != psp_pp_gap_constraint_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 26004L)
    public static SubLObject psp_allowed_gap_category() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parsing_vars.$psp_gap_type_allowed$.getDynamicValue(thread) == psp_chart.$kw197$NP) {
            return psp_chart.$const198$NounPhrase;
        }
        if (psp_chart.NIL != psp_pp_gap_allowedP()) {
            return psp_chart.$const195$Preposition;
        }
        return (SubLObject)psp_chart.$kw199$NONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 26192L)
    public static SubLObject psp_edge_already_has_gapP(final SubLObject edge) {
        SubLObject csome_list_var = psp_edge_dtrs(edge);
        SubLObject dtr = (SubLObject)psp_chart.NIL;
        dtr = csome_list_var.first();
        while (psp_chart.NIL != csome_list_var) {
            if (psp_chart.NIL != psp_gap_edge_p(dtr) || psp_chart.NIL != psp_edge_already_has_gapP(dtr)) {
                return (SubLObject)psp_chart.T;
            }
            csome_list_var = csome_list_var.rest();
            dtr = csome_list_var.first();
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 26439L)
    public static SubLObject psp_edge_has_np_gapP(final SubLObject edge) {
        SubLObject csome_list_var = psp_edge_dtrs(edge);
        SubLObject dtr = (SubLObject)psp_chart.NIL;
        dtr = csome_list_var.first();
        while (psp_chart.NIL != csome_list_var) {
            if (psp_chart.NIL != psp_np_gap_edge_p(dtr) || psp_chart.NIL != psp_edge_has_np_gapP(dtr)) {
                return (SubLObject)psp_chart.T;
            }
            csome_list_var = csome_list_var.rest();
            dtr = csome_list_var.first();
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 26674L)
    public static SubLObject psp_edge_has_pp_gapP(final SubLObject edge) {
        final SubLObject dtrs = psp_edge_dtrs(edge);
        SubLObject ans = (SubLObject)psp_chart.NIL;
        SubLObject list_var = (SubLObject)psp_chart.NIL;
        SubLObject dtr = (SubLObject)psp_chart.NIL;
        SubLObject i = (SubLObject)psp_chart.NIL;
        list_var = psp_edge_dtrs(edge);
        dtr = list_var.first();
        for (i = (SubLObject)psp_chart.ZERO_INTEGER; psp_chart.NIL == ans && psp_chart.NIL != list_var; list_var = list_var.rest(), dtr = list_var.first(), i = Numbers.add((SubLObject)psp_chart.ONE_INTEGER, i)) {
            final SubLObject n = number_utilities.f_1X(i);
            if (psp_chart.NIL != psp_pp_gap_edge_p(dtr)) {
                return (SubLObject)psp_chart.T;
            }
            if (psp_chart.NIL != psp_preposition_gap_edge_p(dtr)) {
                final SubLObject next_dtr = ConsesLow.nth(n, dtrs);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != next_dtr && psp_chart.NIL != psp_np_gap_edge_p(next_dtr));
            }
            else if (psp_chart.NIL != psp_edge_has_pp_gapP(dtr)) {
                return (SubLObject)psp_chart.T;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 27149L)
    public static SubLObject psp_gap_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(parsing_vars.$psp_gap_type_allowed$.getDynamicValue(thread) != psp_chart.$kw199$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 27238L)
    public static SubLObject psp_pp_gap_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return psp_pp_gap_constraint_p(parsing_vars.$psp_gap_type_allowed$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 27338L)
    public static SubLObject psp_pp_gap_constraint_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isCons() && obj.first() == psp_chart.$kw200$PP && obj.rest().isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 27466L)
    public static SubLObject psp_pp_gap_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((psp_chart.NIL != psp_pp_gap_allowedP()) ? parsing_vars.$psp_gap_type_allowed$.getDynamicValue(thread).rest() : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 27576L)
    public static SubLObject new_psp_phrasal_edge(final SubLObject chart, final SubLObject span, final SubLObject string, SubLObject category, SubLObject pos_pred, SubLObject cycls, SubLObject weight, SubLObject rule, SubLObject new_dtr_constraints, SubLObject head_dtr, SubLObject non_head_dtrs) {
        if (category == psp_chart.UNPROVIDED) {
            category = (SubLObject)psp_chart.NIL;
        }
        if (pos_pred == psp_chart.UNPROVIDED) {
            pos_pred = (SubLObject)psp_chart.NIL;
        }
        if (cycls == psp_chart.UNPROVIDED) {
            cycls = (SubLObject)psp_chart.$kw194$NEW;
        }
        if (weight == psp_chart.UNPROVIDED) {
            weight = (SubLObject)psp_chart.NIL;
        }
        if (rule == psp_chart.UNPROVIDED) {
            rule = (SubLObject)psp_chart.NIL;
        }
        if (new_dtr_constraints == psp_chart.UNPROVIDED) {
            new_dtr_constraints = (SubLObject)psp_chart.NIL;
        }
        if (head_dtr == psp_chart.UNPROVIDED) {
            head_dtr = (SubLObject)psp_chart.NIL;
        }
        if (non_head_dtrs == psp_chart.UNPROVIDED) {
            non_head_dtrs = (SubLObject)psp_chart.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_chart.NIL != string && !psp_chart.assertionsDisabledInClass && psp_chart.NIL == Types.stringp(string)) {
            throw new AssertionError(string);
        }
        assert psp_chart.NIL != interval_span.interval_span_p(span) : span;
        if (cycls == psp_chart.$kw194$NEW) {
            cycls = (SubLObject)psp_chart.NIL;
        }
        if (psp_chart.NIL != cycls && !psp_chart.assertionsDisabledInClass && psp_chart.NIL == dictionary.dictionary_p(cycls)) {
            throw new AssertionError(cycls);
        }
        if (psp_chart.NIL != parsing_vars.$psp_chart_consolidate_edgesP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject head_dtr_$3 = psp_maybe_setify_dtrs(head_dtr, non_head_dtrs);
            final SubLObject non_head_dtrs_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            head_dtr = head_dtr_$3;
            non_head_dtrs = non_head_dtrs_$4;
        }
        final SubLObject edge = make_phrase_structure_parser_phrasal_edge((SubLObject)psp_chart.UNPROVIDED);
        _csetf_psp_phrasal_edge_chart(edge, chart);
        _csetf_psp_phrasal_edge_span(edge, span);
        _csetf_psp_phrasal_edge_string(edge, string);
        _csetf_psp_phrasal_edge_category(edge, category);
        _csetf_psp_phrasal_edge_pos_pred(edge, pos_pred);
        _csetf_psp_phrasal_edge_cycls(edge, cycls);
        _csetf_psp_phrasal_edge_rule(edge, rule);
        _csetf_psp_phrasal_edge_new_dtr_constraints(edge, new_dtr_constraints);
        _csetf_psp_phrasal_edge_head_dtr(edge, head_dtr);
        _csetf_psp_phrasal_edge_non_head_dtrs(edge, non_head_dtrs);
        _csetf_psp_phrasal_edge_id(edge, psp_chart_new_edge_id(chart));
        _csetf_psp_phrasal_edge_weight(edge, (psp_chart.NIL != weight) ? weight : ((psp_chart.NIL != head_dtr || psp_chart.NIL != non_head_dtrs) ? psp_edge_weight_from_dtrs(head_dtr, non_head_dtrs, rule) : psp_chart.$psp_unknown_weight$.getGlobalValue()));
        return edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 29013L)
    public static SubLObject psp_maybe_setify_dtrs(final SubLObject head_dtr, final SubLObject non_head_dtrs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_chart.NIL != parsing_vars.$psp_chart_consolidate_edgesP$.getDynamicValue(thread)) {
            return Values.values((SubLObject)ConsesLow.list(head_dtr), Mapping.mapcar((SubLObject)psp_chart.$sym203$LIST, non_head_dtrs));
        }
        return Values.values(head_dtr, non_head_dtrs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 29229L)
    public static SubLObject new_psp_lexical_edge(final SubLObject chart, final SubLObject span, final SubLObject string, SubLObject category, SubLObject pos_pred, SubLObject cycls, SubLObject weight, SubLObject wu, SubLObject frame) {
        if (category == psp_chart.UNPROVIDED) {
            category = (SubLObject)psp_chart.NIL;
        }
        if (pos_pred == psp_chart.UNPROVIDED) {
            pos_pred = (SubLObject)psp_chart.NIL;
        }
        if (cycls == psp_chart.UNPROVIDED) {
            cycls = (SubLObject)psp_chart.$kw194$NEW;
        }
        if (weight == psp_chart.UNPROVIDED) {
            weight = (SubLObject)psp_chart.NIL;
        }
        if (wu == psp_chart.UNPROVIDED) {
            wu = (SubLObject)psp_chart.NIL;
        }
        if (frame == psp_chart.UNPROVIDED) {
            frame = (SubLObject)psp_chart.NIL;
        }
        assert psp_chart.NIL != Types.stringp(string) : string;
        assert psp_chart.NIL != interval_span.interval_span_p(span) : span;
        if (psp_chart.NIL != category && psp_chart.NIL != string_utilities.non_empty_string_p(string) && !psp_chart.assertionsDisabledInClass && psp_chart.NIL == fort_types_interface.predicate_p(pos_pred)) {
            throw new AssertionError(pos_pred);
        }
        if (cycls == psp_chart.$kw194$NEW) {
            cycls = (SubLObject)psp_chart.NIL;
        }
        if (psp_chart.NIL != cycls && !psp_chart.assertionsDisabledInClass && psp_chart.NIL == dictionary.dictionary_p(cycls)) {
            throw new AssertionError(cycls);
        }
        final SubLObject id = psp_chart_new_edge_id(chart);
        final SubLObject psp_weight = (psp_chart.NIL != weight) ? weight : psp_chart.$psp_unknown_weight$.getGlobalValue();
        final SubLObject edge = make_phrase_structure_parser_lexical_edge((SubLObject)psp_chart.UNPROVIDED);
        _csetf_psp_lexical_edge_chart(edge, chart);
        _csetf_psp_lexical_edge_span(edge, span);
        _csetf_psp_lexical_edge_string(edge, string);
        _csetf_psp_lexical_edge_category(edge, category);
        _csetf_psp_lexical_edge_pos_pred(edge, pos_pred);
        _csetf_psp_lexical_edge_cycls(edge, cycls);
        _csetf_psp_lexical_edge_wu(edge, wu);
        _csetf_psp_lexical_edge_frame(edge, frame);
        _csetf_psp_lexical_edge_id(edge, id);
        _csetf_psp_lexical_edge_weight(edge, psp_weight);
        return edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 30451L)
    public static SubLObject psp_tokenization_mode_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, psp_chart.$psp_tokenization_modes$.getGlobalValue(), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 30546L)
    public static SubLObject sentence_set_words_from_string_list(final SubLObject sentence, final SubLObject strings, final SubLObject sentence_string) {
        SubLObject words = (SubLObject)psp_chart.NIL;
        SubLObject offset = (SubLObject)psp_chart.ZERO_INTEGER;
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)psp_chart.NIL;
        string = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            offset = Sequences.search(string, sentence_string, Symbols.symbol_function((SubLObject)psp_chart.EQUAL), Symbols.symbol_function((SubLObject)psp_chart.IDENTITY), (SubLObject)psp_chart.ZERO_INTEGER, (SubLObject)psp_chart.NIL, offset, (SubLObject)psp_chart.UNPROVIDED);
            if (psp_chart.NIL == offset && psp_chart.NIL == list_utilities.empty_list_p(words)) {
                offset = Numbers.add((SubLObject)psp_chart.ONE_INTEGER, document.word_offset(words.first()), document.word_length(words.first()));
            }
            else if (psp_chart.NIL == offset) {
                offset = (SubLObject)psp_chart.ZERO_INTEGER;
            }
            words = (SubLObject)ConsesLow.cons(document.new_word((SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw95$STRING, string, (SubLObject)psp_chart.$kw206$OFFSET, offset)), words);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        words = Functions.apply((SubLObject)psp_chart.$sym207$VECTOR, Sequences.nreverse(words));
        document.sign_update(sentence, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw208$CONSTITUENTS, words));
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 31444L)
    public static SubLObject initialize_psp_chart(SubLObject input_string, SubLObject chart, SubLObject lexicon, SubLObject gap_type) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (lexicon == psp_chart.UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        }
        if (gap_type == psp_chart.UNPROVIDED) {
            gap_type = (SubLObject)psp_chart.$kw199$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_chart.NIL != psp_lexicon.psp_lexicon_p(lexicon) : lexicon;
        input_string = string_utilities.string_substitute((SubLObject)psp_chart.$str210$_, (SubLObject)psp_chart.$str211$___, input_string, (SubLObject)psp_chart.UNPROVIDED);
        psp_chart_clear(chart);
        psp_chart_set_string(chart, input_string);
        psp_chart_set_gap_type(chart, gap_type);
        final SubLObject sentence = document.new_sentence((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                document.sign_update(sentence, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw95$STRING, input_string));
                sentence_set_words_from_string_list(sentence, psp_string_tokenize(input_string), input_string);
                _csetf_psp_chart_length(chart, document.sentence_length(sentence));
                SubLObject cdolist_list_var = psp_chart.$psp_tokenization_modes$.getGlobalValue();
                SubLObject mode = (SubLObject)psp_chart.NIL;
                mode = cdolist_list_var.first();
                while (psp_chart.NIL != cdolist_list_var) {
                    psp_add_edges_from_sentence(sentence, mode, lexicon, chart);
                    cdolist_list_var = cdolist_list_var.rest();
                    mode = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_chart.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)psp_chart.$kw212$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 32492L)
    public static SubLObject psp_add_edges_from_sentence(final SubLObject sentence, final SubLObject mode, final SubLObject lexicon, final SubLObject chart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_chart.NIL != document.sentence_p(sentence) : sentence;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_chart$.currentBinding(thread);
        try {
            parsing_vars.$psp_chart$.bind(chart, thread);
            SubLObject cdolist_list_var;
            final SubLObject edges = cdolist_list_var = psp_sentence_edgify(sentence, mode, lexicon);
            SubLObject edge = (SubLObject)psp_chart.NIL;
            edge = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                psp_edge_adjust_weight_for_mode(edge, mode);
                if (mode != psp_chart.$kw214$DILIGENT || psp_chart.NIL == psp_chart_has_better_edgeP(chart, edge)) {
                    psp_chart_add_edge(edge, (SubLObject)psp_chart.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                edge = cdolist_list_var.first();
            }
        }
        finally {
            parsing_vars.$psp_chart$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)psp_chart.$kw215$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 32897L)
    public static SubLObject psp_edge_adjust_weight_for_mode(final SubLObject edge, final SubLObject mode) {
        final SubLObject mode_weight = psp_default_weight_for_mode(mode);
        final SubLObject edge_weight = get_psp_edge_weight(edge);
        set_psp_edge_weight(edge, psp_weight_compose_two(mode_weight, edge_weight));
        return get_psp_edge_weight(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 33216L)
    public static SubLObject closed_lexical_class_edgeP(final SubLObject edge) {
        return lexicon_accessors.genl_posP(get_psp_edge_category(edge), psp_chart.$const216$ClosedClassWord, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 33397L)
    public static SubLObject psp_default_weight_for_mode(final SubLObject mode) {
        assert psp_chart.NIL != psp_tokenization_mode_p(mode) : mode;
        return (mode == psp_chart.$kw218$GREEDY) ? psp_chart.$psp_edge_greedy_weight$.getGlobalValue() : psp_chart.$psp_edge_dispreferred_weight$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 33692L)
    public static SubLObject psp_chart_has_better_edgeP(final SubLObject chart, final SubLObject edge) {
        final SubLObject existing_edges = psp_edges_with_span(get_psp_edge_span(edge), chart);
        SubLObject foundP = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == foundP) {
            SubLObject csome_list_var = existing_edges;
            SubLObject existing_edge = (SubLObject)psp_chart.NIL;
            existing_edge = csome_list_var.first();
            while (psp_chart.NIL == foundP && psp_chart.NIL != csome_list_var) {
                if (psp_chart.NIL != psp_better_edgeP(existing_edge, edge)) {
                    foundP = (SubLObject)psp_chart.T;
                }
                csome_list_var = csome_list_var.rest();
                existing_edge = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 33983L)
    public static SubLObject psp_better_edgeP(final SubLObject edge1, final SubLObject edge2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_edge_weightierP(edge1, edge2, (SubLObject)psp_chart.UNPROVIDED) && psp_chart.NIL != psp_edges_same_except_for_weightP(edge1, edge2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 34167L)
    public static SubLObject psp_edges_same_except_for_weightP(final SubLObject edge1, final SubLObject edge2) {
        if (!get_psp_edge_category(edge1).equal(get_psp_edge_category(edge2))) {
            return (SubLObject)psp_chart.NIL;
        }
        if (!get_psp_edge_pos_pred(edge1).equal(get_psp_edge_pos_pred(edge2))) {
            return (SubLObject)psp_chart.NIL;
        }
        if (!get_psp_edge_wu(edge1).equal(get_psp_edge_wu(edge2))) {
            return (SubLObject)psp_chart.NIL;
        }
        if (!get_psp_edge_frame(edge1).equal(get_psp_edge_frame(edge2))) {
            return (SubLObject)psp_chart.NIL;
        }
        if (!get_psp_edge_cycls(edge1).equalp(get_psp_edge_cycls(edge2))) {
            return (SubLObject)psp_chart.NIL;
        }
        return (SubLObject)psp_chart.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 34722L)
    public static SubLObject psp_edge_weightierP(final SubLObject edge1, final SubLObject edge2, SubLObject margin_of_error) {
        if (margin_of_error == psp_chart.UNPROVIDED) {
            margin_of_error = (SubLObject)psp_chart.$float182$0_0;
        }
        final SubLObject ans = (SubLObject)SubLObjectFactory.makeBoolean(get_psp_edge_span(edge1).eql(get_psp_edge_span(edge2)) && psp_chart.NIL != psp_weight_G(get_psp_edge_weight(edge1), get_psp_edge_weight(edge2), margin_of_error));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 35013L)
    public static SubLObject psp_edge_weights_equalP(final SubLObject edge1, final SubLObject edge2, SubLObject margin_of_error) {
        if (margin_of_error == psp_chart.UNPROVIDED) {
            margin_of_error = (SubLObject)psp_chart.$float182$0_0;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == psp_edge_weightierP(edge1, edge2, margin_of_error) && psp_chart.NIL == psp_edge_weightierP(edge2, edge1, margin_of_error));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 35238L)
    public static SubLObject psp_string_tokenize(final SubLObject string) {
        return nl_trie.nl_trie_string_tokenize(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 35443L)
    public static SubLObject psp_sentence_edgify(final SubLObject sentence, SubLObject mode, SubLObject lexicon) {
        if (mode == psp_chart.UNPROVIDED) {
            mode = (SubLObject)psp_chart.$kw218$GREEDY;
        }
        if (lexicon == psp_chart.UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        }
        assert psp_chart.NIL != document.sentence_p(sentence) : sentence;
        assert psp_chart.NIL != psp_lexicon.psp_lexicon_p(lexicon) : lexicon;
        assert psp_chart.NIL != psp_tokenization_mode_p(mode) : mode;
        final SubLObject words = document.sentence_listify(sentence);
        final SubLObject all_edges = Vectors.make_vector(document.sentence_length(sentence), (SubLObject)psp_chart.UNPROVIDED);
        SubLObject edges = (SubLObject)psp_chart.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = document.sentence_length(sentence), i = (SubLObject)psp_chart.NIL, i = (SubLObject)psp_chart.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)psp_chart.ONE_INTEGER)) {
            Vectors.set_aref(all_edges, i, set.new_set((SubLObject)psp_chart.EQUAL, (SubLObject)psp_chart.UNPROVIDED));
        }
        psp_add_indexical_edges(all_edges, words);
        psp_add_lexicon_edges(all_edges, sentence, lexicon);
        final SubLObject sentence_copy = psp_sentence_copy(sentence);
        psp_add_english_number_edges(all_edges, sentence_copy);
        psp_add_digit_edges(all_edges, sentence_copy);
        psp_add_quantity_edges(all_edges, sentence_copy);
        psp_add_guessed_edges(all_edges, words);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)psp_chart.$kw218$GREEDY)) {
            SubLObject end_index;
            SubLObject new_start;
            SubLObject start;
            SubLObject new_edges;
            SubLObject longest_edge;
            for (end_index = document.sentence_length(sentence), new_start = (SubLObject)psp_chart.NIL, start = (SubLObject)psp_chart.NIL, start = (SubLObject)psp_chart.ZERO_INTEGER; !start.eql(end_index); start = new_start) {
                new_edges = psp_longest_edges(Vectors.aref(all_edges, start));
                longest_edge = new_edges.first();
                edges = ConsesLow.nconc(new_edges, edges);
                new_start = ((psp_chart.NIL != longest_edge) ? interval_span.interval_span_end(get_psp_edge_span(longest_edge)) : number_utilities.f_1X(start));
                if (!new_start.numG(start)) {
                    Errors.error((SubLObject)psp_chart.$str219$Failed_to_get_bigger_than__S__Lon, start, longest_edge, get_psp_edge_span(longest_edge));
                }
            }
        }
        else if (pcase_var.eql((SubLObject)psp_chart.$kw214$DILIGENT)) {
            final SubLObject vector_var = all_edges;
            final SubLObject backwardP_var = (SubLObject)psp_chart.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject index_edges;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)psp_chart.NIL, v_iteration = (SubLObject)psp_chart.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)psp_chart.ONE_INTEGER)) {
                element_num = ((psp_chart.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)psp_chart.ONE_INTEGER) : v_iteration);
                index_edges = Vectors.aref(vector_var, element_num);
                edges = ConsesLow.nconc(set.set_element_list(index_edges), edges);
            }
        }
        return edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 37986L)
    public static SubLObject psp_add_edge_to_result_vector(final SubLObject edge, final SubLObject result_vector) {
        return set.set_add(edge, Vectors.aref(result_vector, interval_span.interval_span_start(get_psp_edge_span(edge))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 38177L)
    public static SubLObject psp_add_lexicon_edges(final SubLObject all_edges, final SubLObject original_sentence, SubLObject lexicon) {
        if (lexicon == psp_chart.UNPROVIDED) {
            lexicon = psp_lexicon.get_default_psp_lexicon((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        }
        final SubLObject sentence = el_utilities.copy_sentence(original_sentence);
        final SubLObject tokens = document.sentence_listify(sentence);
        final SubLObject lexified_sentence = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)psp_chart.$sym220$LEXIFY_SENTENCE, sentence);
        SubLObject index = (SubLObject)psp_chart.ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(lexified_sentence);
        SubLObject word = (SubLObject)psp_chart.NIL;
        word = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            final SubLObject word_string = document.word_string(word);
            final SubLObject word_lex_entries = document.word_info(word);
            final SubLObject prefix_length = get_raw_word_count_from_word(word);
            final SubLObject start = index;
            final SubLObject end = Numbers.add(index, prefix_length);
            final SubLObject prefix_words = Sequences.subseq(tokens, start, end);
            if (psp_chart.NIL != word_lex_entries) {
                SubLObject cdolist_list_var_$6 = build_psp_edges_from_lex_entries(start, end, prefix_words, word_string, word_lex_entries);
                SubLObject edge = (SubLObject)psp_chart.NIL;
                edge = cdolist_list_var_$6.first();
                while (psp_chart.NIL != cdolist_list_var_$6) {
                    psp_add_edge_to_result_vector(edge, all_edges);
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    edge = cdolist_list_var_$6.first();
                }
            }
            index = Numbers.add(index, prefix_length);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 39123L)
    public static SubLObject get_raw_word_count_from_word(final SubLObject word) {
        return Sequences.length(psp_string_tokenize(document.word_string(word)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 39317L)
    public static SubLObject fscp_multi_parse_category_p(final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != keyhash_utilities.fast_intersection(category, psp_chart.$fscp_multi_parse_categories$.getGlobalValue(), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 39541L)
    public static SubLObject psp_add_fscp_edges(final SubLObject all_edges, final SubLObject sentence, final SubLObject v_parser, final SubLObject pos, final SubLObject pred, final SubLObject filter_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fscp_constituents = (SubLObject)psp_chart.NIL;
        SubLObject prefix_length = (SubLObject)psp_chart.ZERO_INTEGER;
        final SubLObject weight = psp_chart.$psp_edge_default_weight$.getGlobalValue();
        final SubLObject parse_result = finite_state_cascade_parser.fscp_parse(v_parser, document.sentence_constituents(sentence));
        SubLObject index = (SubLObject)psp_chart.NIL;
        SubLObject signs = (SubLObject)psp_chart.NIL;
        SubLObject sign = (SubLObject)psp_chart.NIL;
        index = (SubLObject)psp_chart.ZERO_INTEGER;
        signs = (parse_result.isVector() ? vector_utilities.vector_elements(parse_result, (SubLObject)psp_chart.UNPROVIDED) : parse_result);
        sign = signs.first();
        while (psp_chart.NIL != signs) {
            if (psp_chart.NIL == document.sign_info(sign)) {
                prefix_length = (SubLObject)psp_chart.ONE_INTEGER;
            }
            else {
                SubLObject cdolist_list_var;
                fscp_constituents = (cdolist_list_var = document.sign_intervals(sign, index));
                SubLObject fscp_constituent = (SubLObject)psp_chart.NIL;
                fscp_constituent = cdolist_list_var.first();
                while (psp_chart.NIL != cdolist_list_var) {
                    final SubLObject sign_$7 = standard_tokenization.interval_token_value(fscp_constituent);
                    SubLObject cdolist_list_var_$8 = (SubLObject)((psp_chart.NIL != fscp_multi_parse_category_p(document.sign_category(sign_$7))) ? document.sign_info(sign_$7) : ConsesLow.list(document.sign_info(sign_$7)));
                    SubLObject cycl = (SubLObject)psp_chart.NIL;
                    cycl = cdolist_list_var_$8.first();
                    while (psp_chart.NIL != cdolist_list_var_$8) {
                        if (psp_chart.NIL != Functions.funcall(filter_fn, cycl) && psp_chart.NIL == Strings.stringE(document.sign_string(sign_$7), (SubLObject)psp_chart.$str222$a, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED)) {
                            final SubLObject cycls = psp_new_cycls(cycl, (SubLObject)psp_chart.UNPROVIDED);
                            psp_add_edge_to_result_vector(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), interval_span.get_interval_span(standard_tokenization.interval_token_start(fscp_constituent), standard_tokenization.interval_token_end(fscp_constituent)), document.sign_string(sign_$7), pos, pred, cycls, weight, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED), all_edges);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        cycl = cdolist_list_var_$8.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    fscp_constituent = cdolist_list_var.first();
                }
                prefix_length = standard_tokenization.interval_token_length(fscp_constituents.first());
            }
            index = Numbers.add(index, prefix_length);
            signs = signs.rest();
            sign = signs.first();
        }
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 40978L)
    public static SubLObject psp_sentence_copy(final SubLObject sentence) {
        assert psp_chart.NIL != document.sentence_p(sentence) : sentence;
        final SubLObject new_sentence = document.new_sentence((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        document._csetf_sign_string(new_sentence, document.sentence_string(sentence));
        final SubLObject new_words = Vectors.make_vector(Sequences.length(document.sentence_constituents(sentence)), (SubLObject)psp_chart.UNPROVIDED);
        SubLObject word_num = (SubLObject)psp_chart.ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = (SubLObject)psp_chart.NIL;
        word = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            Vectors.set_aref(new_words, word_num, psp_word_copy(word));
            word_num = Numbers.add(word_num, (SubLObject)psp_chart.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        document._csetf_sign_constituents(new_sentence, new_words);
        document._csetf_sign_category(new_sentence, document.sentence_category(sentence));
        return new_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 41530L)
    public static SubLObject psp_word_copy(final SubLObject word) {
        assert psp_chart.NIL != document.word_p(word) : word;
        final SubLObject new_word = document.new_word((SubLObject)psp_chart.UNPROVIDED);
        document._csetf_sign_string(new_word, document.word_string(word));
        document._csetf_sign_category(new_word, document.word_category(word));
        return new_word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 41760L)
    public static SubLObject psp_add_english_number_edges(final SubLObject all_edges, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_add_fscp_edges(all_edges, sentence, numeral_parser.$english_interval_parser$.getDynamicValue(thread), psp_chart.$const224$Number_SP, psp_chart.$const225$partOfSpeech, (SubLObject)psp_chart.$sym226$PSP_SCALAR_INTERVAL_);
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 41972L)
    public static SubLObject psp_add_digit_edges(final SubLObject all_edges, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_add_fscp_edges(all_edges, sentence, numeral_parser.$digit_interval_parser$.getDynamicValue(thread), psp_chart.$const224$Number_SP, psp_chart.$const225$partOfSpeech, (SubLObject)psp_chart.$sym227$IBQE_);
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 42159L)
    public static SubLObject psp_add_quantity_edges(final SubLObject all_edges, final SubLObject sentence) {
        psp_add_fscp_edges(all_edges, sentence, english_quantity_parser.english_quantity_parser(), psp_chart.$const198$NounPhrase, psp_chart.$const228$simpleNounStrings, (SubLObject)psp_chart.$sym226$PSP_SCALAR_INTERVAL_);
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 42370L)
    public static SubLObject psp_add_guessed_edges(final SubLObject all_edges, final SubLObject words) {
        SubLObject empty_starts = (SubLObject)psp_chart.NIL;
        SubLObject cdotimes_end_var;
        SubLObject start;
        SubLObject guess_end;
        SubLObject guess_start;
        SubLObject string;
        for (cdotimes_end_var = Sequences.length(words), start = (SubLObject)psp_chart.NIL, start = (SubLObject)psp_chart.ZERO_INTEGER; start.numL(cdotimes_end_var); start = Numbers.add(start, (SubLObject)psp_chart.ONE_INTEGER)) {
            if (psp_chart.NIL == psp_edge_covering_startP(all_edges, start)) {
                empty_starts = (SubLObject)ConsesLow.cons(start, empty_starts);
                guess_end = number_utilities.f_1X(start);
                for (guess_start = start; psp_chart.NIL != conses_high.member(guess_start, empty_starts, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED); guess_start = Numbers.subtract(guess_start, (SubLObject)psp_chart.ONE_INTEGER)) {
                    string = string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)psp_chart.$sym229$WORD_STRING), Sequences.subseq(words, guess_start, guess_end)), (SubLObject)psp_chart.UNPROVIDED);
                    psp_add_guessed_edge(guess_start, guess_end, all_edges, string);
                }
            }
        }
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 43072L)
    public static SubLObject psp_add_guessed_edge(final SubLObject start, final SubLObject end, final SubLObject all_edges, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject psp_guessed_word_weight = parsing_vars.$psp_max_weight$.getGlobalValue();
        thread.resetMultipleValues();
        final SubLObject category = psp_maybe_guess_info_for_unknown_string(string, start, end);
        final SubLObject pos_pred = thread.secondMultipleValue();
        final SubLObject cycls = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject guessed_edge = new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), interval_span.get_interval_span(start, end), string, category, pos_pred, cycls, psp_guessed_word_weight, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        psp_add_edge_to_result_vector(guessed_edge, all_edges);
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 43625L)
    public static SubLObject psp_edge_covering_startP(final SubLObject edges, final SubLObject start) {
        SubLObject foundP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == set.set_emptyP(Vectors.aref(edges, start)));
        if (psp_chart.NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject span;
            for (csome_list_var = psp_spans_starting_at_start(start, (SubLObject)psp_chart.UNPROVIDED), span = (SubLObject)psp_chart.NIL, span = csome_list_var.first(); psp_chart.NIL == foundP && psp_chart.NIL != csome_list_var; foundP = psp_span_has_edges_p(span, (SubLObject)psp_chart.UNPROVIDED), csome_list_var = csome_list_var.rest(), span = csome_list_var.first()) {}
        }
        SubLObject lookup;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject edge;
        for (lookup = (SubLObject)psp_chart.NIL, lookup = number_utilities.f_1_(start); psp_chart.NIL == foundP && !lookup.numL((SubLObject)psp_chart.ZERO_INTEGER); lookup = number_utilities.f_1_(lookup)) {
            set_var = Vectors.aref(edges, lookup);
            set_contents_var = set.do_set_internal(set_var);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_chart.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_chart.NIL == foundP && psp_chart.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                edge = set_contents.do_set_contents_next(basis_object, state);
                if (psp_chart.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                    foundP = Numbers.numG(interval_span.interval_span_end(get_psp_edge_span(edge)), start);
                }
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 44223L)
    public static SubLObject psp_spans_starting_at_start(final SubLObject start, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return list_utilities.find_all(start, psp_chart_spans(chart, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED), Symbols.symbol_function((SubLObject)psp_chart.$sym230$_), (SubLObject)psp_chart.$sym231$INTERVAL_SPAN_START);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 44437L)
    public static SubLObject psp_add_indexical_edges(final SubLObject all_edges, final SubLObject words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = parsing_vars.$psp_indexical_map$.getDynamicValue(thread);
        SubLObject cons = (SubLObject)psp_chart.NIL;
        cons = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject indexical_string = (SubLObject)psp_chart.NIL;
            SubLObject denot = (SubLObject)psp_chart.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list232);
            indexical_string = current.first();
            current = (denot = current.rest());
            final SubLObject indexical_strings = psp_string_tokenize(indexical_string);
            SubLObject start;
            SubLObject end;
            SubLObject span;
            SubLObject category;
            SubLObject pos_pred;
            SubLObject cycls;
            SubLObject indexical_edge;
            for (start = (SubLObject)psp_chart.NIL, start = (SubLObject)psp_chart.ZERO_INTEGER; psp_chart.NIL == list_utilities.lengthLE(words, start, (SubLObject)psp_chart.UNPROVIDED); start = number_utilities.f_1X(start)) {
                end = Numbers.add(start, Sequences.length(indexical_strings));
                if (Mapping.mapcar(Symbols.symbol_function((SubLObject)psp_chart.$sym229$WORD_STRING), Sequences.subseq(words, start, end)).equalp(indexical_strings)) {
                    span = interval_span.get_interval_span(start, end);
                    category = psp_chart.$const198$NounPhrase;
                    pos_pred = psp_chart.$const233$nameString;
                    cycls = psp_new_cycls(denot, (SubLObject)psp_chart.UNPROVIDED);
                    indexical_edge = new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, indexical_string, category, pos_pred, cycls, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
                    psp_add_edge_to_result_vector(indexical_edge, all_edges);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return all_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 45244L)
    public static SubLObject psp_maybe_guess_info_for_unknown_string(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject category = (SubLObject)psp_chart.NIL;
        SubLObject pos_pred = (SubLObject)psp_chart.NIL;
        final SubLObject cycls = psp_new_cycls((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        if (psp_chart.NIL != parsing_vars.$guess_semantics_for_unknown_wordsP$.getDynamicValue(thread)) {
            category = psp_chart.$const198$NounPhrase;
            pos_pred = psp_chart.$const233$nameString;
            final SubLObject type = psp_type_for_unknown_string(string);
            psp_add_cycl_to_cycls((SubLObject)ConsesLow.list(psp_chart.$const234$InstanceNamedFn, string, type), cycls, (SubLObject)psp_chart.UNPROVIDED);
        }
        return Values.values(category, pos_pred, cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 45786L)
    public static SubLObject psp_type_for_unknown_string(final SubLObject string) {
        return psp_chart.$const235$Thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 45875L)
    public static SubLObject psp_scalar_intervalP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isNumber() || psp_chart.NIL != at_defns.quiet_has_typeP(obj, psp_chart.$const236$ScalarInterval, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 45992L)
    public static SubLObject filter_prefixes_by_mt(final SubLObject prefixes, final SubLObject mt) {
        SubLObject filtered = (SubLObject)psp_chart.NIL;
        SubLObject filtered_prefix = (SubLObject)psp_chart.NIL;
        SubLObject cdolist_list_var = prefixes;
        SubLObject prefix = (SubLObject)psp_chart.NIL;
        prefix = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            filtered_prefix = nl_trie_accessors.nl_trie_record_filter_mt(prefix, mt);
            if (psp_chart.NIL != filtered_prefix) {
                filtered = (SubLObject)ConsesLow.cons(filtered_prefix, filtered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            prefix = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 46397L)
    public static SubLObject psp_passive_marker() {
        return psp_chart.$const237$passiveParticiple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 46467L)
    public static SubLObject psp_passive_edges(final SubLObject span, final SubLObject token_string, final SubLObject pos, final SubLObject pos_pred, final SubLObject cycls, final SubLObject wu, final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_chart.NIL == frame || !pos_pred.eql(psp_chart.$const238$perfect)) {
            return (SubLObject)psp_chart.NIL;
        }
        SubLObject new_edges = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != psp_frame_passivizableP(frame)) {
            new_edges = (SubLObject)ConsesLow.cons(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, token_string, pos, psp_passive_marker(), cycls, (SubLObject)psp_chart.NIL, wu, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw239$PASSIVE, frame)), new_edges);
            new_edges = (SubLObject)ConsesLow.cons(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, token_string, pos, psp_passive_marker(), cycls, (SubLObject)psp_chart.NIL, wu, (SubLObject)ConsesLow.list((SubLObject)psp_chart.$kw240$PASSIVE_WITH_BY, frame)), new_edges);
        }
        return new_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 47071L)
    public static SubLObject psp_deverbal_edges(final SubLObject span, final SubLObject token_string, final SubLObject pos, final SubLObject pos_pred, final SubLObject cycls, final SubLObject weight, final SubLObject wu) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_chart.NIL == wu || psp_chart.NIL == cycls || psp_chart.NIL == deverbal_noun_posP(pos)) {
            return (SubLObject)psp_chart.NIL;
        }
        SubLObject new_edges = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != Sequences.find(psp_chart.$const241$TransitiveNPFrame, lexicon_accessors.frames_of_wordXpos(wu, psp_chart.$const242$Verb), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED)) {
            new_edges = (SubLObject)ConsesLow.cons(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, token_string, pos, pos_pred, cycls, weight, wu, narts_high.find_nart((SubLObject)psp_chart.$list243)), new_edges);
        }
        return new_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 47608L)
    public static SubLObject deverbal_noun_posP(final SubLObject pos) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_semantics.psp_genl_posP(pos, psp_chart.$const244$MassNoun, (SubLObject)psp_chart.UNPROVIDED) || psp_chart.NIL != psp_semantics.psp_genl_posP(pos, psp_chart.$const245$GerundiveNoun, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 47739L)
    public static SubLObject psp_frame_passivizableP(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)psp_chart.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            okP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != forts.fort_p(frame) && psp_chart.NIL != isa.isaP(frame, psp_chart.$const246$PassivizableFrame, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 47971L)
    public static SubLObject psp_edge_cycl_passes_name_checkP(final SubLObject token_string, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP;
        final SubLObject exemptP = passP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == kb_indexing_datastructures.indexed_term_p(cycl));
        final SubLObject eq_test = (psp_chart.NIL != lexicon_accessors.closed_lexical_class_stringP(token_string, (SubLObject)psp_chart.UNPROVIDED)) ? Symbols.symbol_function((SubLObject)psp_chart.EQUAL) : Symbols.symbol_function((SubLObject)psp_chart.EQUALP);
        final SubLObject unquoted_string = string_utilities.unquote_string(token_string);
        final SubLObject precise_with_theP = (SubLObject)psp_chart.NIL;
        thread.resetMultipleValues();
        final SubLObject denots = lexicon_accessors.denots_of_name_string(token_string, lexicon_vars.$misspellingsP$.getDynamicValue(thread), parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED), precise_with_theP);
        final SubLObject pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (psp_chart.NIL == passP) {
            SubLObject denot = (SubLObject)psp_chart.NIL;
            SubLObject denot_$9 = (SubLObject)psp_chart.NIL;
            SubLObject pred_list = (SubLObject)psp_chart.NIL;
            SubLObject pred_list_$10 = (SubLObject)psp_chart.NIL;
            denot = denots;
            denot_$9 = denot.first();
            pred_list = pred_lists;
            pred_list_$10 = pred_list.first();
            while (psp_chart.NIL == passP && (psp_chart.NIL != pred_list || psp_chart.NIL != denot)) {
                if (denot_$9.equalp(cycl) && psp_chart.NIL == passP) {
                    SubLObject csome_list_var = pred_list_$10;
                    SubLObject pred = (SubLObject)psp_chart.NIL;
                    pred = csome_list_var.first();
                    while (psp_chart.NIL == passP && psp_chart.NIL != csome_list_var) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED));
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject asserted_strings = kb_mapping_utilities.pred_values(denot_$9, pred, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
                            if (psp_chart.NIL != conses_high.member(unquoted_string, asserted_strings, eq_test, (SubLObject)psp_chart.UNPROVIDED)) {
                                passP = (SubLObject)psp_chart.T;
                            }
                            else if (psp_chart.NIL == precise_with_theP) {
                                final SubLObject starts_with_theP = nl_trie_accessors.starts_with_theP(unquoted_string);
                                final SubLObject the_less_token_string = (psp_chart.NIL != starts_with_theP) ? string_utilities.pre_remove(unquoted_string, (SubLObject)psp_chart.$str247$the_, Symbols.symbol_function((SubLObject)psp_chart.EQUALP)) : unquoted_string;
                                if (psp_chart.NIL == passP) {
                                    SubLObject csome_list_var_$11 = asserted_strings;
                                    SubLObject asserted_string = (SubLObject)psp_chart.NIL;
                                    asserted_string = csome_list_var_$11.first();
                                    while (psp_chart.NIL == passP && psp_chart.NIL != csome_list_var_$11) {
                                        if (psp_chart.NIL != starts_with_theP) {
                                            passP = Functions.funcall(eq_test, the_less_token_string, asserted_string);
                                        }
                                        else {
                                            passP = Functions.funcall(eq_test, unquoted_string, string_utilities.pre_remove(asserted_string, (SubLObject)psp_chart.$str247$the_, Symbols.symbol_function((SubLObject)psp_chart.EQUALP)));
                                        }
                                        csome_list_var_$11 = csome_list_var_$11.rest();
                                        asserted_string = csome_list_var_$11.first();
                                    }
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    }
                }
                denot = denot.rest();
                denot_$9 = denot.first();
                pred_list = pred_list.rest();
                pred_list_$10 = pred_list.first();
            }
        }
        return passP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 49348L)
    public static SubLObject string_has_non_name_denotsP(final SubLObject string) {
        return list_utilities.sublisp_boolean(lexicon_accessors.denots_of_string(string, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.$kw248$DENOT, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.T, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 49464L)
    public static SubLObject psp_chart_add_edge(final SubLObject edge, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLObject span = get_psp_edge_span(edge);
        dictionary_utilities.dictionary_push(psp_chart_spans_to_edges(chart), span, edge);
        if (psp_chart.NIL != psp_chart_index_edgesP()) {
            id_index.id_index_enter(psp_chart_edge_id_index(chart), get_psp_edge_id(edge), edge);
        }
        if (psp_chart.NIL != phrase_structure_parser_phrasal_edge_p(edge) && psp_chart.NIL != psp_rules.psp_traced_ruleP(psp_edge_rule_fort(edge))) {
            PrintLow.format((SubLObject)psp_chart.T, (SubLObject)psp_chart.$str249$__Adding_new_edge_____S__Looking_, edge, get_psp_edge_new_dtr_constraints(edge));
        }
        return (SubLObject)psp_chart.$kw215$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 50020L)
    public static SubLObject psp_edge_set_lookup_node(final SubLObject edge_set, SubLObject not_found) {
        if (not_found == psp_chart.UNPROVIDED) {
            not_found = (SubLObject)psp_chart.$kw250$NOT_FOUND;
        }
        SubLObject node = (SubLObject)psp_chart.NIL;
        final SubLObject set_contents_var = set.do_set_internal(edge_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject edge;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_chart.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_chart.NIL == node && psp_chart.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            edge = set_contents.do_set_contents_next(basis_object, state);
            if (psp_chart.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                node = psp_edge_lookup_node(edge, (SubLObject)psp_chart.NIL);
            }
        }
        if (psp_chart.NIL != node) {
            psp_edge_set_note_node(edge_set, node);
        }
        return (psp_chart.NIL != node) ? node : not_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 50407L)
    public static SubLObject psp_edge_set_note_node(final SubLObject edge_set, final SubLObject node) {
        final SubLObject set_contents_var = set.do_set_internal(edge_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject edge;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_chart.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_chart.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            edge = set_contents.do_set_contents_next(basis_object, state);
            if (psp_chart.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                psp_edge_note_node(edge, node);
            }
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 50605L)
    public static SubLObject psp_edge_lookup_node(final SubLObject edge, SubLObject not_found) {
        if (not_found == psp_chart.UNPROVIDED) {
            not_found = (SubLObject)psp_chart.$kw250$NOT_FOUND;
        }
        final SubLObject chart = get_psp_edge_chart(edge);
        final SubLObject v_dictionary = psp_chart_edges_to_nodes(chart);
        return dictionary.dictionary_lookup(v_dictionary, edge, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 50924L)
    public static SubLObject psp_edge_note_node(final SubLObject edge, final SubLObject node) {
        final SubLObject chart = get_psp_edge_chart(edge);
        final SubLObject v_dictionary = psp_chart_edges_to_nodes(chart);
        return dictionary.dictionary_enter(v_dictionary, edge, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 51178L)
    public static SubLObject psp_edge_rule_struct(final SubLObject edge) {
        return get_psp_edge_rule(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 51314L)
    public static SubLObject psp_edge_rule_fort(final SubLObject edge) {
        final SubLObject rule = psp_edge_rule_struct(edge);
        return (SubLObject)((psp_chart.NIL != rule) ? psp_rules.psp_rule_fort(rule) : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 51450L)
    public static SubLObject psp_longest_edges(final SubLObject edges) {
        SubLObject longest = (SubLObject)psp_chart.NIL;
        SubLObject maxlength = (SubLObject)psp_chart.ZERO_INTEGER;
        SubLObject length = (SubLObject)psp_chart.NIL;
        final SubLObject set_contents_var = set.do_set_internal(edges);
        SubLObject basis_object;
        SubLObject state;
        SubLObject edge;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_chart.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_chart.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            edge = set_contents.do_set_contents_next(basis_object, state);
            if (psp_chart.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                length = interval_span.interval_span_length(get_psp_edge_span(edge));
                if (length.eql(maxlength)) {
                    longest = (SubLObject)ConsesLow.cons(edge, longest);
                }
                else if (length.numG(maxlength)) {
                    maxlength = length;
                    longest = (SubLObject)ConsesLow.list(edge);
                }
            }
        }
        return longest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 51929L)
    public static SubLObject best_cycl_for_edge(final SubLObject edge) {
        return psp_semantics.psp_cycl_cycl(psp_semantics.psp_semantics_for_edge(edge, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED).first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 52089L)
    public static SubLObject psp_edges_with_span(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return dictionary.dictionary_lookup_without_values(psp_chart_spans_to_edges(chart), span, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 52293L)
    public static SubLObject psp_lexical_edges_with_span(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return list_utilities.remove_if_not((SubLObject)psp_chart.$sym251$PSP_LEXICAL_EDGE_, psp_edges_with_span(span, chart), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 52508L)
    public static SubLObject psp_completed_edgeP(final SubLObject edge) {
        if (psp_chart.NIL != psp_edge_might_have_dtrs_p(edge)) {
            return Types.sublisp_null(get_psp_edge_new_dtr_constraints(edge));
        }
        return (SubLObject)psp_chart.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 52751L)
    public static SubLObject psp_incomplete_edgeP(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_edge_might_have_dtrs_p(edge) && psp_chart.NIL != get_psp_edge_new_dtr_constraints(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 52987L)
    public static SubLObject psp_lexical_edgeP(final SubLObject edge) {
        return phrase_structure_parser_lexical_edge_p(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 53198L)
    public static SubLObject psp_edge_might_have_dtrs_p(final SubLObject edge) {
        return phrase_structure_parser_phrasal_edge_p(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 53306L)
    public static SubLObject psp_phrasal_edgeP(final SubLObject edge) {
        return phrase_structure_parser_phrasal_edge_p(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 53474L)
    public static SubLObject psp_adjp_edgeP(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_edge_might_have_dtrs_p(edge) && psp_chart.NIL != psp_phrasal_edgeP(edge) && psp_chart.NIL != lexicon_accessors.adjpP(get_psp_edge_category(edge)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 53639L)
    public static SubLObject psp_predicative_adjp_edgeP(final SubLObject edge) {
        if (psp_chart.NIL != psp_adjp_edgeP(edge)) {
            final SubLObject head_dtr = psp_edge_lexical_head_dtr(edge);
            final SubLObject head_dtr_frame = (SubLObject)((psp_chart.NIL != phrase_structure_parser_edge_p(head_dtr)) ? get_psp_edge_frame(head_dtr) : psp_chart.NIL);
            return psp_predicative_frameP(head_dtr_frame);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 53943L)
    public static SubLObject psp_vbar_edgeP(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_edge_might_have_dtrs_p(edge) && psp_chart.NIL != lexicon_accessors.vbarP(get_psp_edge_category(edge)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54077L)
    public static SubLObject psp_nbar_edgeP(final SubLObject edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != psp_edge_might_have_dtrs_p(edge) && psp_chart.NIL != lexicon_accessors.nbarP(get_psp_edge_category(edge)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54211L)
    public static SubLObject psp_np_edgeP(final SubLObject edge) {
        return lexicon_accessors.npP(get_psp_edge_category(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54294L)
    public static SubLObject psp_edge_starts_with_detpP(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != psp_edge_might_have_dtrs_p(edge) && psp_edge_dtr_count(edge).isPositive()) {
            final SubLObject left_dtr = psp_edge_nth_dtr((SubLObject)psp_chart.ONE_INTEGER, edge);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = psp_semantics.psp_genl_posP(get_psp_edge_category(left_dtr), narts_high.find_nart((SubLObject)psp_chart.$list252), (SubLObject)psp_chart.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54732L)
    public static SubLObject psp_pp_edgeP(final SubLObject edge) {
        return lexicon_accessors.ppP(get_psp_edge_category(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54815L)
    public static SubLObject psp_passive_edgeP(final SubLObject edge) {
        return Equality.eq(get_psp_edge_pos_pred(edge), psp_passive_marker());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 54923L)
    public static SubLObject psp_edge_meets_pos_pred_constraintP(final SubLObject edge, final SubLObject pos_pred) {
        final SubLObject actual_pred = get_psp_edge_pos_pred(edge);
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == pos_pred || psp_chart.NIL != lexicon_accessors.genl_pos_predP(actual_pred, pos_pred, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 55117L)
    public static SubLObject first_edge_matching_pos_pred(final SubLObject edges, final SubLObject pred) {
        SubLObject ans = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == ans) {
            SubLObject csome_list_var = edges;
            SubLObject edge = (SubLObject)psp_chart.NIL;
            edge = csome_list_var.first();
            while (psp_chart.NIL == ans && psp_chart.NIL != csome_list_var) {
                if (psp_chart.NIL != psp_edge_meets_pos_pred_constraintP(edge, pred)) {
                    ans = edge;
                }
                csome_list_var = csome_list_var.rest();
                edge = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 55317L)
    public static SubLObject psp_edge_next_dtr_constraints(final SubLObject edge) {
        final SubLObject pcase_var;
        final SubLObject ndcs = pcase_var = get_psp_edge_new_dtr_constraints(edge);
        if (pcase_var.eql((SubLObject)psp_chart.$kw179$UNKNOWN)) {
            return (SubLObject)psp_chart.$kw179$UNKNOWN;
        }
        return ndcs.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 55594L)
    public static SubLObject psp_edge_later_dtr_constraints(final SubLObject edge) {
        final SubLObject pcase_var;
        final SubLObject ndcs = pcase_var = get_psp_edge_new_dtr_constraints(edge);
        if (pcase_var.eql((SubLObject)psp_chart.$kw179$UNKNOWN)) {
            return (SubLObject)psp_chart.$kw179$UNKNOWN;
        }
        return ndcs.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 55887L)
    public static SubLObject psp_edge_head_dtr_num(final SubLObject edge) {
        final SubLObject rule = psp_edge_rule_struct(edge);
        return (SubLObject)((psp_chart.NIL != rule) ? psp_rules.psp_rule_head(rule) : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 56109L)
    public static SubLObject psp_edge_dtr_count(final SubLObject edge) {
        final SubLObject non_head_dtr_count = Sequences.length(get_psp_edge_non_head_dtrs(edge));
        return (psp_chart.NIL != get_psp_edge_head_dtr(edge)) ? number_utilities.f_1X(non_head_dtr_count) : non_head_dtr_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 56393L)
    public static SubLObject psp_edge_dtrs(final SubLObject edge) {
        final SubLObject head_dtr_num = psp_edge_head_dtr_num(edge);
        if (psp_chart.NIL == head_dtr_num) {
            return (SubLObject)psp_chart.NIL;
        }
        final SubLObject head_dtr = get_psp_edge_head_dtr(edge);
        final SubLObject non_head_dtrs = get_psp_edge_non_head_dtrs(edge);
        SubLObject all_dtrs = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != head_dtr) {
            all_dtrs = ConsesLow.append(list_utilities.first_n(number_utilities.f_1_(head_dtr_num), non_head_dtrs), (SubLObject)ConsesLow.cons(head_dtr, conses_high.nthcdr(number_utilities.f_1_(head_dtr_num), non_head_dtrs)));
        }
        else {
            all_dtrs = non_head_dtrs;
        }
        return all_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 56929L)
    public static SubLObject psp_edge_non_branching_descendentP(final SubLObject mother, final SubLObject dtr) {
        if (psp_chart.NIL == phrase_structure_parser_edge_p(mother) || psp_chart.NIL == phrase_structure_parser_edge_p(dtr)) {
            return (SubLObject)psp_chart.NIL;
        }
        final SubLObject mothers_sole_dtr = psp_edge_sole_dtr(mother);
        if (psp_chart.NIL == mothers_sole_dtr) {
            return (SubLObject)psp_chart.NIL;
        }
        if (dtr.eql(mothers_sole_dtr)) {
            return (SubLObject)psp_chart.T;
        }
        if (psp_chart.NIL != psp_edge_non_branching_descendentP(mothers_sole_dtr, dtr)) {
            return (SubLObject)psp_chart.T;
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 57448L)
    public static SubLObject psp_edge_sem_head_dtr(final SubLObject edge) {
        final SubLObject rule_struct = psp_edge_rule_struct(edge);
        final SubLObject rule_semx = psp_rules.psp_rule_semx(rule_struct);
        final SubLObject semx_args = rule_semx.rest();
        final SubLObject sem_head_dtr_num = semx_args.first();
        final SubLObject sem_head_dtr = (SubLObject)(sem_head_dtr_num.isInteger() ? psp_edge_nth_dtr(sem_head_dtr_num, edge) : psp_chart.NIL);
        return sem_head_dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 57843L)
    public static SubLObject psp_edge_lexical_head_dtr(final SubLObject edge) {
        if (psp_chart.NIL != psp_lexical_edgeP(edge) || psp_chart.NIL == get_psp_edge_head_dtr(edge)) {
            return edge;
        }
        final SubLObject head_dtr = get_psp_edge_head_dtr(edge);
        if (psp_chart.NIL == head_dtr) {
            return (SubLObject)psp_chart.NIL;
        }
        return psp_edge_lexical_head_dtr(head_dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 58207L)
    public static SubLObject psp_edge_nth_dtr(final SubLObject n, final SubLObject edge) {
        return ConsesLow.nth(number_utilities.f_1_(n), psp_edge_dtrs(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 58360L)
    public static SubLObject psp_edge_sole_dtr(final SubLObject mother) {
        if (psp_chart.NIL == psp_edge_might_have_dtrs_p(mother)) {
            return (SubLObject)psp_chart.NIL;
        }
        final SubLObject head_dtr = get_psp_edge_head_dtr(mother);
        return (psp_chart.NIL != head_dtr) ? head_dtr : get_psp_edge_non_head_dtrs(mother).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 58590L)
    public static SubLObject psp_edge_precedesP(final SubLObject edge1, final SubLObject edge2) {
        return Numbers.numL(interval_span.interval_span_start(get_psp_edge_span(edge1)), interval_span.interval_span_start(get_psp_edge_span(edge2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 58754L)
    public static SubLObject psp_edge_equalP(final SubLObject edge1, final SubLObject edge2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(get_psp_edge_span(edge1).equalp(get_psp_edge_span(edge2)) && get_psp_edge_category(edge1).equalp(get_psp_edge_category(edge2)) && get_psp_edge_pos_pred(edge1).equalp(get_psp_edge_pos_pred(edge2)) && get_psp_edge_cycls(edge1).equalp(get_psp_edge_cycls(edge2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 59159L)
    public static SubLObject psp_edge_start_index(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.subtract(interval_span.interval_span_start(get_psp_edge_span(edge)), parsing_vars.$psp_chart_start_index$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 59293L)
    public static SubLObject psp_edge_end_index(final SubLObject edge) {
        return interval_span.interval_span_end(get_psp_edge_span(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 59392L)
    public static SubLObject psp_chart_max_span() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_index = parsing_vars.$psp_chart_start_index$.getDynamicValue(thread);
        final SubLObject end_index = (psp_chart.NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue(thread)) ? parsing_vars.$psp_chart_end_index$.getDynamicValue(thread) : psp_chart_length(parsing_vars.$psp_chart$.getDynamicValue(thread));
        return interval_span.get_interval_span(start_index, end_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 59613L)
    public static SubLObject psp_all_complete_edges(SubLObject non_trivialP) {
        if (non_trivialP == psp_chart.UNPROVIDED) {
            non_trivialP = (SubLObject)psp_chart.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject edges = (SubLObject)psp_chart.NIL;
        final SubLObject chart_to_use = (psp_chart.NIL != parsing_vars.$psp_chart$.getDynamicValue(thread)) ? parsing_vars.$psp_chart$.getDynamicValue(thread) : parsing_vars.$psp_chart$.getDynamicValue(thread);
        assert psp_chart.NIL != phrase_structure_parser_chart_p(chart_to_use) : chart_to_use;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart_spans_to_edges(chart_to_use))); psp_chart.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (psp_chart.NIL == non_trivialP || interval_span.interval_span_length(span).numG((SubLObject)psp_chart.ONE_INTEGER)) {
                edges = ConsesLow.nconc(edges, psp_complete_edges_for_span(span));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (psp_chart.NIL != non_trivialP) ? Sequences.remove_if((SubLObject)psp_chart.$sym251$PSP_LEXICAL_EDGE_, edges, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED) : edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 59974L)
    public static SubLObject psp_input_spanning_edges(SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_chart.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_chart$.currentBinding(thread);
        try {
            parsing_vars.$psp_chart$.bind(chart, thread);
            ans = psp_complete_edges_for_span(psp_chart_max_span());
        }
        finally {
            parsing_vars.$psp_chart$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 60234L)
    public static SubLObject psp_complete_edges_for_span(final SubLObject span) {
        final SubLObject all_edges = psp_edges_with_span(span, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject complete_edges = Sequences.remove_if((SubLObject)psp_chart.$sym253$PSP_INCOMPLETE_EDGE_, all_edges, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        return complete_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 60425L)
    public static SubLObject psp_edge_count(SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        if (psp_chart.NIL == phrase_structure_parser_chart_p(chart)) {
            return (SubLObject)psp_chart.ZERO_INTEGER;
        }
        if (psp_chart.NIL != psp_chart_index_edgesP()) {
            return id_index.id_index_count(psp_chart_edge_id_index(chart));
        }
        return psp_chart_edge_id_index(chart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 60750L)
    public static SubLObject psp_chart_has_unknown_stringsP(SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_chart.NIL != phrase_structure_parser_chart_p(chart) : chart;
        SubLObject unknownP = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == unknownP) {
            SubLObject end_var;
            SubLObject i;
            SubLObject ispan;
            SubLObject knownP;
            SubLObject chart_to_use;
            SubLObject iteration_state;
            SubLObject span;
            SubLObject value;
            SubLObject csome_list_var;
            SubLObject edge;
            for (end_var = psp_chart_length(chart), i = (SubLObject)psp_chart.NIL, i = (SubLObject)psp_chart.ZERO_INTEGER; psp_chart.NIL == unknownP && !i.numGE(end_var); unknownP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == knownP), i = number_utilities.f_1X(i)) {
                ispan = interval_span.get_interval_span(i, number_utilities.f_1X(i));
                knownP = (SubLObject)psp_chart.NIL;
                chart_to_use = ((psp_chart.NIL != chart) ? chart : parsing_vars.$psp_chart$.getDynamicValue(thread));
                assert psp_chart.NIL != phrase_structure_parser_chart_p(chart_to_use) : chart_to_use;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart_spans_to_edges(chart_to_use))); psp_chart.NIL == knownP && psp_chart.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    value = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (psp_chart.NIL != interval_span.interval_span_subsumesP(span, ispan) && psp_chart.NIL == knownP) {
                        csome_list_var = psp_edges_with_span(span, chart);
                        edge = (SubLObject)psp_chart.NIL;
                        edge = csome_list_var.first();
                        while (psp_chart.NIL == knownP && psp_chart.NIL != csome_list_var) {
                            if (psp_chart.NIL != psp_do_edge_okP(edge, (SubLObject)psp_chart.$kw165$ANY, (SubLObject)psp_chart.T) && psp_chart.NIL == dictionary.dictionary_empty_p(get_psp_edge_cycls(edge))) {
                                knownP = (SubLObject)psp_chart.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            edge = csome_list_var.first();
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        return unknownP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 61517L)
    public static SubLObject psp_edge_count_for_span(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return Sequences.length(psp_edges_with_span(span, chart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 61709L)
    public static SubLObject psp_span_has_edges_p(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLObject edge_count = psp_edge_count_for_span(span, chart);
        return (SubLObject)(edge_count.isPositive() ? edge_count : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 61957L)
    public static SubLObject psp_chart_too_many_edgesP(SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLObject limit = psp_chart_max_edges(chart);
        final SubLObject overP = (SubLObject)SubLObjectFactory.makeBoolean(!limit.isInteger() || psp_edge_count(chart).numG(limit));
        if (psp_chart.NIL != overP) {}
        return overP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 62432L)
    public static SubLObject psp_span_too_many_edgesP(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != set.set_memberP(span, psp_chart_maxed_out_spans(chart)) || psp_chart.NIL != psp_span_too_many_edgesP_int(span, chart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 62685L)
    public static SubLObject psp_span_too_many_edgesP_int(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLObject limit = psp_chart_max_edges_per_span(chart);
        final SubLObject overP = (SubLObject)SubLObjectFactory.makeBoolean(!limit.isInteger() || psp_edge_count_for_span(span, chart).numG(limit));
        if (psp_chart.NIL != overP) {
            set.set_add(span, psp_chart_maxed_out_spans(chart));
        }
        return overP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 63277L)
    public static SubLObject psp_lexical_span_parsedP(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return set.set_memberP(span, psp_chart_parsed_lexical_spans(chart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 63425L)
    public static SubLObject note_psp_lexical_span_parsed(final SubLObject span, SubLObject chart) {
        if (chart == psp_chart.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        return set.set_add(span, psp_chart_parsed_lexical_spans(chart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 63573L)
    public static SubLObject psp_np_edges() {
        final SubLObject edges = psp_input_spanning_edges((SubLObject)psp_chart.UNPROVIDED);
        final SubLObject comp_edges = Sequences.remove_if((SubLObject)psp_chart.$sym253$PSP_INCOMPLETE_EDGE_, edges, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject np_edges = list_utilities.remove_if_not((SubLObject)psp_chart.$sym254$PSP_NP_EDGE_, comp_edges, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        return np_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 63833L)
    public static SubLObject psp_input_spanning_edge_count() {
        return psp_edge_count_for_span(psp_chart_max_span(), (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 64019L)
    public static SubLObject psp_bindings_from_head(final SubLObject edge) {
        final SubLObject frame = get_psp_edge_frame(edge);
        return (SubLObject)((psp_chart.NIL != frame) ? psp_bindings_from_frame(frame) : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 64269L)
    public static SubLObject cache_psp_frame_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject frames = isa.all_fort_instances(psp_chart.$const255$SubcategorizationFrame, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
            final SubLObject total = Sequences.length(frames);
            final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$14 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)psp_chart.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)psp_chart.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)psp_chart.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)psp_chart.$str256$Initializing_Subcategorization_Fr);
                    SubLObject list_var = (SubLObject)psp_chart.NIL;
                    SubLObject frame = (SubLObject)psp_chart.NIL;
                    SubLObject sofar = (SubLObject)psp_chart.NIL;
                    list_var = frames;
                    frame = list_var.first();
                    for (sofar = (SubLObject)psp_chart.ZERO_INTEGER; psp_chart.NIL != list_var; list_var = list_var.rest(), frame = list_var.first(), sofar = Numbers.add((SubLObject)psp_chart.ONE_INTEGER, sofar)) {
                        if (psp_chart.NIL != psp_constrained_frameP(frame, (SubLObject)psp_chart.UNPROVIDED)) {
                            psp_bindings_from_frame_int(frame, (SubLObject)psp_chart.UNPROVIDED);
                            psp_keywords_for_frame(frame);
                            psp_predicative_frameP(frame);
                            psp_passivized_dtr_num(frame, (SubLObject)psp_chart.UNPROVIDED);
                        }
                        utilities_macros.note_percent_progress(sofar, total);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_chart.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$14, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)psp_chart.$kw257$CACHED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 64900L)
    public static SubLObject recache_psp_frame_info() {
        clear_psp_frame_info();
        return cache_psp_frame_info();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 65046L)
    public static SubLObject clear_psp_frame_info() {
        clear_psp_bindings_from_frame_int();
        clear_psp_keywords_for_frame();
        clear_psp_constrained_frameP();
        clear_intransitive_frameP();
        clear_psp_devisable_verb_frames();
        clear_psp_passivized_dtr_num();
        return (SubLObject)psp_chart.$kw57$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 65310L)
    public static SubLObject add_subcat_frame_info(final SubLObject argument, final SubLObject assertion) {
        return clear_psp_frame_info();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 65492L)
    public static SubLObject remove_subcat_frame_info(final SubLObject argument, final SubLObject assertion) {
        return clear_psp_frame_info();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 65681L)
    public static SubLObject psp_bindings_from_frame(final SubLObject frame) {
        if (frame.eql((SubLObject)psp_chart.$kw179$UNKNOWN)) {
            return (SubLObject)psp_chart.$kw179$UNKNOWN;
        }
        final SubLObject passiveP = psp_passive_frameP(frame);
        final SubLObject active_frame = (psp_chart.NIL != passiveP) ? psp_active_frame(frame) : frame;
        final SubLObject v_bindings = psp_bindings_from_frame_int(active_frame, (SubLObject)psp_chart.UNPROVIDED);
        return (psp_chart.NIL != passiveP) ? psp_passivize_bindings(v_bindings, frame) : v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66522L)
    public static SubLObject clear_psp_bindings_from_frame_int() {
        final SubLObject cs = psp_chart.$psp_bindings_from_frame_int_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66522L)
    public static SubLObject remove_psp_bindings_from_frame_int(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_bindings_from_frame_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66522L)
    public static SubLObject psp_bindings_from_frame_int_internal(final SubLObject frame, final SubLObject mt) {
        SubLObject v_bindings = (SubLObject)psp_chart.NIL;
        SubLObject cdolist_list_var = ask_utilities.ask_template((SubLObject)psp_chart.$list262, (SubLObject)ConsesLow.listS(psp_chart.$const263$subcatFrameDependentKeyword, frame, (SubLObject)psp_chart.$list262), mt, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        SubLObject binding = (SubLObject)psp_chart.NIL;
        binding = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            ConsesLow.rplaca(binding, number_utilities.f_1X(binding.first()));
            v_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)psp_chart.$kw261$INSTANCE, binding), v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66522L)
    public static SubLObject psp_bindings_from_frame_int(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject caching_state = psp_chart.$psp_bindings_from_frame_int_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym260$PSP_BINDINGS_FROM_FRAME_INT, (SubLObject)psp_chart.$sym264$_PSP_BINDINGS_FROM_FRAME_INT_CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_bindings_from_frame_int_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66887L)
    public static SubLObject clear_psp_predicative_frameP() {
        final SubLObject cs = psp_chart.$psp_predicative_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66887L)
    public static SubLObject remove_psp_predicative_frameP(final SubLObject frame) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_predicative_frameP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66887L)
    public static SubLObject psp_predicative_frameP_internal(final SubLObject frame) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != forts.fort_p(frame) && psp_chart.NIL != isa.isa_in_any_mtP(frame, psp_chart.$const267$PredicativeFrame));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 66887L)
    public static SubLObject psp_predicative_frameP(final SubLObject frame) {
        SubLObject caching_state = psp_chart.$psp_predicative_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym266$PSP_PREDICATIVE_FRAME_, (SubLObject)psp_chart.$sym268$_PSP_PREDICATIVE_FRAME__CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, frame, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_predicative_frameP_internal(frame)));
            memoization_state.caching_state_put(caching_state, frame, results, (SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67031L)
    public static SubLObject clear_psp_keywords_for_frame() {
        final SubLObject cs = psp_chart.$psp_keywords_for_frame_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67031L)
    public static SubLObject remove_psp_keywords_for_frame(final SubLObject frame) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_keywords_for_frame_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67031L)
    public static SubLObject psp_keywords_for_frame_internal(final SubLObject frame) {
        if (psp_chart.NIL != psp_passive_frameP(frame)) {
            return psp_keywords_for_frame(psp_active_frame(frame));
        }
        return ask_utilities.ask_variable((SubLObject)psp_chart.$sym270$_KEYWORD, (SubLObject)ConsesLow.listS(psp_chart.$const271$subcatFrameKeywords, frame, (SubLObject)psp_chart.$list272), psp_chart.$const273$InferencePSC, (SubLObject)psp_chart.FIVE_INTEGER, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67031L)
    public static SubLObject psp_keywords_for_frame(final SubLObject frame) {
        SubLObject caching_state = psp_chart.$psp_keywords_for_frame_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym269$PSP_KEYWORDS_FOR_FRAME, (SubLObject)psp_chart.$sym274$_PSP_KEYWORDS_FOR_FRAME_CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, frame, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_keywords_for_frame_internal(frame)));
            memoization_state.caching_state_put(caching_state, frame, results, (SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67350L)
    public static SubLObject clear_psp_constrained_frameP() {
        final SubLObject cs = psp_chart.$psp_constrained_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67350L)
    public static SubLObject remove_psp_constrained_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_constrained_frameP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67350L)
    public static SubLObject psp_constrained_frameP_internal(final SubLObject frame, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_chart.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != intransitive_frameP(frame, (SubLObject)psp_chart.UNPROVIDED) || psp_chart.NIL != kb_mapping_utilities.some_pred_value(frame, psp_chart.$const276$subcatFrameDependentConstraint, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.$kw277$TRUE));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67350L)
    public static SubLObject psp_constrained_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject caching_state = psp_chart.$psp_constrained_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym275$PSP_CONSTRAINED_FRAME_, (SubLObject)psp_chart.$sym278$_PSP_CONSTRAINED_FRAME__CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_constrained_frameP_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67742L)
    public static SubLObject clear_psp_devisable_verb_frames() {
        final SubLObject cs = psp_chart.$psp_devisable_verb_frames_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67742L)
    public static SubLObject remove_psp_devisable_verb_frames(SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_devisable_verb_frames_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67742L)
    public static SubLObject psp_devisable_verb_frames_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_chart.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            ans = list_utilities.remove_if_not((SubLObject)psp_chart.$sym280$DEVISABLE_VERB_FRAME_, lexicon_vars.verb_frames(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 67742L)
    public static SubLObject psp_devisable_verb_frames(SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject caching_state = psp_chart.$psp_devisable_verb_frames_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym279$PSP_DEVISABLE_VERB_FRAMES, (SubLObject)psp_chart.$sym281$_PSP_DEVISABLE_VERB_FRAMES_CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_devisable_verb_frames_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68163L)
    public static SubLObject clear_transitive_np_comp_frameP() {
        final SubLObject cs = psp_chart.$transitive_np_comp_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68163L)
    public static SubLObject remove_transitive_np_comp_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$transitive_np_comp_frameP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68163L)
    public static SubLObject transitive_np_comp_frameP_internal(final SubLObject frame, final SubLObject mt) {
        return at_defns.quick_quiet_has_typeP(frame, psp_chart.$const283$TransitiveNPFrameType, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68163L)
    public static SubLObject transitive_np_comp_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject caching_state = psp_chart.$transitive_np_comp_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym282$TRANSITIVE_NP_COMP_FRAME_, (SubLObject)psp_chart.$sym284$_TRANSITIVE_NP_COMP_FRAME__CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(transitive_np_comp_frameP_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68354L)
    public static SubLObject clear_intransitive_frameP() {
        final SubLObject cs = psp_chart.$intransitive_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68354L)
    public static SubLObject remove_intransitive_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$intransitive_frameP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68354L)
    public static SubLObject intransitive_frameP_internal(final SubLObject frame, final SubLObject mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.listS(psp_chart.$const286$subcatFrameArity, frame, (SubLObject)psp_chart.$list287), mt, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68354L)
    public static SubLObject intransitive_frameP(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject caching_state = psp_chart.$intransitive_frameP_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym285$INTRANSITIVE_FRAME_, (SubLObject)psp_chart.$sym288$_INTRANSITIVE_FRAME__CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(intransitive_frameP_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68540L)
    public static SubLObject clear_psp_frame_has_typeP() {
        final SubLObject cs = psp_chart.$psp_frame_has_typeP_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68540L)
    public static SubLObject remove_psp_frame_has_typeP(final SubLObject frame, final SubLObject type) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_frame_has_typeP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, type), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68540L)
    public static SubLObject psp_frame_has_typeP_internal(final SubLObject frame, final SubLObject type) {
        return isa.isa_in_any_mtP(frame, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68540L)
    public static SubLObject psp_frame_has_typeP(final SubLObject frame, final SubLObject type) {
        SubLObject caching_state = psp_chart.$psp_frame_has_typeP_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym289$PSP_FRAME_HAS_TYPE_, (SubLObject)psp_chart.$sym290$_PSP_FRAME_HAS_TYPE__CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && type.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_frame_has_typeP_internal(frame, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, type));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68664L)
    public static SubLObject clear_psp_passivized_dtr_num() {
        final SubLObject cs = psp_chart.$psp_passivized_dtr_num_caching_state$.getGlobalValue();
        if (psp_chart.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68664L)
    public static SubLObject remove_psp_passivized_dtr_num(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_chart.$psp_passivized_dtr_num_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(frame, mt), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68664L)
    public static SubLObject psp_passivized_dtr_num_internal(final SubLObject frame, final SubLObject mt) {
        final SubLObject fort_frame = function_terms.naut_to_nart(frame);
        final SubLObject ask_result = ask_utilities.ask_template((SubLObject)psp_chart.$sym292$_N, (SubLObject)ConsesLow.list(psp_chart.$const293$and, (SubLObject)ConsesLow.listS(psp_chart.$const294$isa, fort_frame, (SubLObject)psp_chart.$list295), (SubLObject)ConsesLow.listS(psp_chart.$const276$subcatFrameDependentConstraint, fort_frame, (SubLObject)psp_chart.$list296)), mt, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject nums = list_utilities.remove_if_not((SubLObject)psp_chart.$sym297$INTEGERP, ask_result, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject raw_ans = (SubLObject)((psp_chart.NIL != nums) ? number_utilities.minimum(nums, (SubLObject)psp_chart.UNPROVIDED) : psp_chart.NIL);
        return (SubLObject)(raw_ans.isInteger() ? number_utilities.f_1X(raw_ans) : psp_chart.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 68664L)
    public static SubLObject psp_passivized_dtr_num(final SubLObject frame, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        SubLObject caching_state = psp_chart.$psp_passivized_dtr_num_caching_state$.getGlobalValue();
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_chart.$sym291$PSP_PASSIVIZED_DTR_NUM, (SubLObject)psp_chart.$sym298$_PSP_PASSIVIZED_DTR_NUM_CACHING_STATE_, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.$int265$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(frame, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (frame.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_passivized_dtr_num_internal(frame, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(frame, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 69328L)
    public static SubLObject psp_passivized_dtr_keyword(final SubLObject frame) {
        final SubLObject p_dtr_num = psp_passivized_dtr_num(frame, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject v_bindings = psp_bindings_from_frame(frame);
        final SubLObject binding_list = Sequences.find(p_dtr_num, v_bindings, Symbols.symbol_function((SubLObject)psp_chart.EQL), Symbols.symbol_function((SubLObject)psp_chart.$sym299$SECOND), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject keyword = conses_high.third(binding_list);
        return keyword;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 69717L)
    public static SubLObject psp_passive_frameP(final SubLObject frame) {
        return (SubLObject)SubLObjectFactory.makeBoolean(frame.isCons() && psp_chart.NIL != conses_high.member(frame.first(), psp_chart.$psp_passive_keys$.getGlobalValue(), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 69886L)
    public static SubLObject psp_active_frame(final SubLObject frame) {
        return conses_high.second(frame);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 70021L)
    public static SubLObject psp_passive_frame_type(final SubLObject frame) {
        return frame.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 70144L)
    public static SubLObject psp_passivize_bindings(final SubLObject v_bindings, final SubLObject passive_frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_bindings = (SubLObject)psp_chart.NIL;
        final SubLObject active_frame = psp_active_frame(passive_frame);
        final SubLObject type = psp_passive_frame_type(passive_frame);
        final SubLObject p_dtr_num = psp_passivized_dtr_num(active_frame, (SubLObject)psp_chart.UNPROVIDED);
        if (!p_dtr_num.isInteger() && psp_chart.NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)psp_chart.$str301$Don_t_know_how_to_passivize__S___, active_frame);
            return v_bindings;
        }
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)psp_chart.NIL;
        binding = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject type_$16 = (SubLObject)psp_chart.NIL;
            SubLObject n = (SubLObject)psp_chart.NIL;
            SubLObject keyword = (SubLObject)psp_chart.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list302);
            type_$16 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list302);
            n = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_chart.$list302);
            keyword = current.first();
            current = current.rest();
            if (psp_chart.NIL == current) {
                if (n.numL(p_dtr_num)) {
                    new_bindings = (SubLObject)ConsesLow.cons(binding, new_bindings);
                }
                else if (n.numG(p_dtr_num)) {
                    new_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type_$16, number_utilities.f_1_(n), keyword), new_bindings);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_chart.$list302);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (type == psp_chart.$kw240$PASSIVE_WITH_BY) {
            new_bindings = (SubLObject)ConsesLow.cons(psp_by_subject_binding(active_frame), new_bindings);
        }
        return new_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 70972L)
    public static SubLObject psp_by_subject_binding(final SubLObject active_frame) {
        final SubLObject frame_arity = lexicon_accessors.subcat_frame_arity(active_frame);
        final SubLObject by_obj_num = Numbers.add((SubLObject)psp_chart.TWO_INTEGER, frame_arity);
        return (SubLObject)ConsesLow.listS((SubLObject)psp_chart.$kw261$INSTANCE, by_obj_num, (SubLObject)psp_chart.$list303);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 71167L)
    public static SubLObject psp_add_cycl_to_cycls(final SubLObject cycl, final SubLObject cycls, SubLObject type) {
        if (type == psp_chart.UNPROVIDED) {
            type = (SubLObject)psp_chart.$kw304$DENOT_GROUND;
        }
        dictionary_utilities.dictionary_pushnew(cycls, type, cycl, (SubLObject)psp_chart.$sym305$PSP_CYCL__, (SubLObject)psp_chart.UNPROVIDED);
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 71375L)
    public static SubLObject psp_new_cycls(SubLObject initial_cycl, SubLObject type) {
        if (initial_cycl == psp_chart.UNPROVIDED) {
            initial_cycl = (SubLObject)psp_chart.NIL;
        }
        if (type == psp_chart.UNPROVIDED) {
            type = (SubLObject)psp_chart.$kw304$DENOT_GROUND;
        }
        final SubLObject cycls = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)psp_chart.EQ), (SubLObject)psp_chart.ZERO_INTEGER);
        if (psp_chart.NIL != initial_cycl) {
            psp_add_cycl_to_cycls(initial_cycl, cycls, type);
        }
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 71653L)
    public static SubLObject build_psp_edges_from_lex_entries(final SubLObject start, final SubLObject end, final SubLObject words, final SubLObject edge_string, final SubLObject lex_entries) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject span = interval_span.get_interval_span(start, end);
        SubLObject edges = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != psp_chart.$psp_parse_wh_wordsP$.getGlobalValue() || psp_chart.NIL == lexicon_accessors.string_is_posP(edge_string, psp_chart.$const306$WHWord, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED)) {
            if (psp_chart.NIL != lex_entries) {
                SubLObject cdolist_list_var = lex_entries;
                SubLObject lex_entry = (SubLObject)psp_chart.NIL;
                lex_entry = cdolist_list_var.first();
                while (psp_chart.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$17 = build_psp_edges_from_lex_entry(lex_entry, span, edge_string);
                    SubLObject edge = (SubLObject)psp_chart.NIL;
                    edge = cdolist_list_var_$17.first();
                    while (psp_chart.NIL != cdolist_list_var_$17) {
                        final SubLObject item_var = edge;
                        if (psp_chart.NIL == conses_high.member(item_var, edges, Symbols.symbol_function((SubLObject)psp_chart.EQL), Symbols.symbol_function((SubLObject)psp_chart.IDENTITY))) {
                            edges = (SubLObject)ConsesLow.cons(item_var, edges);
                        }
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        edge = cdolist_list_var_$17.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lex_entry = cdolist_list_var.first();
                }
                edges = psp_adjust_edge_weights(edges);
                edges = psp_consolidate_edges(edges);
            }
            else if (psp_chart.NIL != list_utilities.singletonP(words)) {
                final SubLObject word = words.first();
                edges = (SubLObject)ConsesLow.cons(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, edge_string, psp_find_constant(document.word_category(word).first()), psp_find_constant(conses_high.second(document.word_category(word))), numeral_parser.string_to_interval(document.word_string(word)), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED), edges);
            }
        }
        return edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 72877L)
    public static SubLObject build_psp_edges_from_lex_entry(final SubLObject lex_entry, final SubLObject span, final SubLObject edge_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject edges = (SubLObject)psp_chart.NIL;
        final SubLObject entry_weight = psp_weight_for_lex_entry(lex_entry, edge_string);
        final SubLObject cycl = abstract_lexicon.lex_entry_denot(lex_entry);
        final SubLObject preferred_denots = lex_entry_preferred_denots(lex_entry);
        final SubLObject cat = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw308$CYC_CATEGORY);
        final SubLObject wu = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw309$WORD_UNIT);
        SubLObject cdolist_list_var;
        final SubLObject pos_preds = cdolist_list_var = psp_pos_preds_from_lex_entry(lex_entry);
        SubLObject pos_pred = (SubLObject)psp_chart.NIL;
        pos_pred = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            if (psp_chart.NIL != psp_term_passes_constraintsP(cycl, (SubLObject)psp_chart.UNPROVIDED)) {
                final SubLObject frames = psp_find_frames(wu, cat, cycl, (SubLObject)psp_chart.UNPROVIDED);
                final SubLObject cycls = psp_new_cycls((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
                final SubLObject disprefer_level = psp_dispreference_level(cycl, preferred_denots, pos_pred);
                final SubLObject weight = psp_disprefer_weight(entry_weight, disprefer_level);
                if (cycl != psp_chart.$kw310$NO_DENOT) {
                    psp_add_cycl_to_cycls(cycl, cycls, (SubLObject)psp_chart.UNPROVIDED);
                }
                if (psp_chart.NIL != wu && psp_chart.NIL != subl_promotions.memberP(psp_chart.$const311$RegularNounFrame, frames, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$18 = psp_semantics.psp_noun_sem_trans_cycls(edge_string, wu, cat);
                    SubLObject noun_cycl = (SubLObject)psp_chart.NIL;
                    noun_cycl = cdolist_list_var_$18.first();
                    while (psp_chart.NIL != cdolist_list_var_$18) {
                        psp_add_cycl_to_cycls(noun_cycl, cycls, (SubLObject)psp_chart.UNPROVIDED);
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        noun_cycl = cdolist_list_var_$18.first();
                    }
                }
                edges = ConsesLow.append(edges, psp_deverbal_edges(span, edge_string, cat, pos_pred, cycls, weight, wu));
                SubLObject cdolist_list_var_$19 = frames;
                SubLObject frame = (SubLObject)psp_chart.NIL;
                frame = cdolist_list_var_$19.first();
                while (psp_chart.NIL != cdolist_list_var_$19) {
                    edges = ConsesLow.append(edges, psp_passive_edges(span, edge_string, cat, pos_pred, cycls, wu, frame));
                    edges = (SubLObject)ConsesLow.cons(new_psp_lexical_edge(parsing_vars.$psp_chart$.getDynamicValue(thread), span, edge_string, cat, pos_pred, cycls, weight, wu, frame), edges);
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    frame = cdolist_list_var_$19.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_pred = cdolist_list_var.first();
        }
        return edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 74410L)
    public static SubLObject lex_entry_get_trie_entry(final SubLObject lex_entry) {
        return methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw312$TRIE_ENTRY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 74506L)
    public static SubLObject lex_entry_preferred_denots(final SubLObject lex_entry) {
        final SubLObject nl_trie_entry = lex_entry_get_trie_entry(lex_entry);
        return (SubLObject)((psp_chart.NIL != nl_trie_entry) ? nl_trie.nl_trie_entry_preferred_denots(nl_trie_entry) : ConsesLow.list(methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw248$DENOT)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 74753L)
    public static SubLObject psp_pos_preds_from_lex_entry(final SubLObject lex_entry) {
        return (SubLObject)((psp_chart.NIL == methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw309$WORD_UNIT) && psp_chart.NIL != methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw313$PREDICATE)) ? ConsesLow.list(methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw313$PREDICATE)) : methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)psp_chart.$sym307$GET, (SubLObject)psp_chart.$kw314$INFLECTIONS));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 75161L)
    public static SubLObject psp_term_passes_constraintsP(final SubLObject cycl, SubLObject filters) {
        if (filters == psp_chart.UNPROVIDED) {
            filters = parsing_vars.$psp_concept_filters$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL != rbp_wff.rbp_wff_term_visibleP(cycl) && psp_chart.NIL != term_lexicon.denot_passes_filter_specsP(cycl, filters));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 75411L)
    public static SubLObject titles_conventionally_quoted() {
        if (psp_chart.NIL != psp_chart.$titles_conventionally_quoted$.getGlobalValue()) {
            return psp_chart.$titles_conventionally_quoted$.getGlobalValue();
        }
        final SubLObject pred = constants_high.find_constant((SubLObject)psp_chart.$str315$titlesConventionallyQuoted);
        if (psp_chart.NIL != constant_handles.valid_constantP(pred, (SubLObject)psp_chart.UNPROVIDED)) {
            psp_chart.$titles_conventionally_quoted$.setGlobalValue(pred);
        }
        return psp_chart.$titles_conventionally_quoted$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 75795L)
    public static SubLObject psp_dispreference_level(final SubLObject cycl, final SubLObject preferred_denots, final SubLObject pos_pred) {
        if (psp_chart.NIL != subl_promotions.memberP(cycl, preferred_denots, Symbols.symbol_function((SubLObject)psp_chart.EQUAL), (SubLObject)psp_chart.UNPROVIDED)) {
            return Numbers.minus(psp_chart.$psp_preferred_denot_preference_factor$.getGlobalValue());
        }
        if (psp_chart.NIL != lexicon_accessors.genl_pos_predP(pos_pred, psp_chart.$const316$titleOfWork, (SubLObject)psp_chart.UNPROVIDED) && psp_chart.NIL != cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(titles_conventionally_quoted(), cycl), parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED), (SubLObject)psp_chart.UNPROVIDED))) {
            return (SubLObject)psp_chart.TWO_INTEGER;
        }
        return (SubLObject)psp_chart.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 76234L)
    public static SubLObject psp_disprefer_weight(final SubLObject entry_weight, SubLObject disprefer_level) {
        if (disprefer_level == psp_chart.UNPROVIDED) {
            disprefer_level = (SubLObject)psp_chart.ONE_INTEGER;
        }
        SubLObject weight = entry_weight;
        if (psp_chart.NIL != subl_promotions.positive_integer_p(disprefer_level)) {
            SubLObject i;
            for (i = (SubLObject)psp_chart.NIL, i = (SubLObject)psp_chart.ZERO_INTEGER; i.numL(disprefer_level); i = Numbers.add(i, (SubLObject)psp_chart.ONE_INTEGER)) {
                weight = psp_weight_compose_two(weight, psp_chart.$psp_edge_dispreferred_weight$.getGlobalValue());
            }
        }
        else if (psp_chart.NIL != subl_promotions.negative_integer_p(disprefer_level)) {
            weight = psp_reprefer_weight(entry_weight, Numbers.minus(disprefer_level));
        }
        return weight;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 76660L)
    public static SubLObject psp_reprefer_weight(final SubLObject entry_weight, SubLObject reprefer_level) {
        if (reprefer_level == psp_chart.UNPROVIDED) {
            reprefer_level = (SubLObject)psp_chart.ONE_INTEGER;
        }
        SubLObject weight = entry_weight;
        SubLObject i;
        SubLObject delta;
        for (i = (SubLObject)psp_chart.NIL, i = (SubLObject)psp_chart.ZERO_INTEGER; i.numL(reprefer_level); i = Numbers.add(i, (SubLObject)psp_chart.ONE_INTEGER)) {
            delta = ((parsing_vars.$psp_weight_type$.getGlobalValue() == psp_chart.$kw180$INTEGER) ? Numbers.integerDivide(Numbers.subtract(parsing_vars.$psp_max_weight$.getGlobalValue(), weight), (SubLObject)psp_chart.FOUR_INTEGER) : Numbers.divide(Numbers.subtract(parsing_vars.$psp_max_weight$.getGlobalValue(), weight), (SubLObject)psp_chart.FOUR_INTEGER));
            weight = Numbers.add(weight, delta);
        }
        return weight;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 76987L)
    public static SubLObject psp_weight_for_lex_entry(final SubLObject lex_entry, final SubLObject string) {
        final SubLObject nl_trie_entry = lex_entry_get_trie_entry(lex_entry);
        return (psp_chart.NIL != nl_trie_entry) ? psp_weight_for_trie_entry(nl_trie_entry, string) : psp_chart.$psp_edge_default_weight$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 77314L)
    public static SubLObject psp_weight_for_trie_entry(final SubLObject trie_entry, final SubLObject string) {
        SubLObject weight = psp_chart.$psp_edge_default_weight$.getGlobalValue();
        if (psp_chart.NIL != psp_disprefer_trie_entry_for_stringP(trie_entry, string)) {
            weight = psp_disprefer_weight(weight, (SubLObject)psp_chart.UNPROVIDED);
        }
        return weight;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 77644L)
    public static SubLObject psp_disprefer_trie_entry_for_stringP(final SubLObject trie_entry, final SubLObject string) {
        if (psp_chart.NIL != lexicon_accessors.closed_lexical_class_stringP(string, (SubLObject)psp_chart.UNPROVIDED) && psp_chart.NIL == nl_trie.nl_trie_closed_lexical_class_entryP(trie_entry)) {
            return (SubLObject)psp_chart.T;
        }
        if (psp_chart.NIL == nl_trie_accessors.nl_trie_access_case_sensitive_p() && psp_chart.NIL == string_utilities.upper_case_string_p(string)) {
            return (SubLObject)psp_chart.NIL;
        }
        if (psp_chart.NIL != nl_trie.nl_trie_entry_case_matches_stringP(trie_entry, string)) {
            return (SubLObject)psp_chart.NIL;
        }
        return (SubLObject)psp_chart.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 78099L)
    public static SubLObject psp_term_has_preferred_lexificationsP_internal(final SubLObject cycl) {
        return list_utilities.sublisp_boolean(lexicon_utilities.preferred_lexifications_for_term(cycl, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 78099L)
    public static SubLObject psp_term_has_preferred_lexificationsP(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == v_memoization_state) {
            return psp_term_has_preferred_lexificationsP_internal(cycl);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_chart.$sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_, (SubLObject)psp_chart.UNPROVIDED);
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_chart.$sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_, (SubLObject)psp_chart.ONE_INTEGER, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQL, (SubLObject)psp_chart.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_chart.$sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_term_has_preferred_lexificationsP_internal(cycl)));
            memoization_state.caching_state_put(caching_state, cycl, results, (SubLObject)psp_chart.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 78237L)
    public static SubLObject psp_filter_lexical_quads(final SubLObject quads, final SubLObject quad_string) {
        SubLObject good_quads = (SubLObject)psp_chart.NIL;
        SubLObject cdolist_list_var = quads;
        SubLObject quad = (SubLObject)psp_chart.NIL;
        quad = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            if (psp_chart.NIL != psp_good_lexical_quadP(quad, quad_string)) {
                good_quads = (SubLObject)ConsesLow.cons(quad, good_quads);
            }
            cdolist_list_var = cdolist_list_var.rest();
            quad = cdolist_list_var.first();
        }
        return good_quads;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 78524L)
    public static SubLObject psp_good_lexical_quadP(final SubLObject quad, final SubLObject quad_string) {
        SubLObject cycl = (SubLObject)psp_chart.NIL;
        SubLObject pos = (SubLObject)psp_chart.NIL;
        SubLObject pos_pred = (SubLObject)psp_chart.NIL;
        SubLObject wu = (SubLObject)psp_chart.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(quad, quad, (SubLObject)psp_chart.$list318);
        cycl = quad.first();
        SubLObject current = quad.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, quad, (SubLObject)psp_chart.$list318);
        pos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, quad, (SubLObject)psp_chart.$list318);
        pos_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, quad, (SubLObject)psp_chart.$list318);
        wu = current.first();
        current = current.rest();
        if (psp_chart.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == parsing_utilities.blacklisted_cycl_for_parsersP(cycl) && (psp_chart.NIL == lexicon_vars.name_string_predP(pos_pred) || psp_chart.NIL != psp_edge_cycl_passes_name_checkP(quad_string, cycl)) && (psp_chart.NIL == psp_semantics.psp_genl_posP(pos, psp_chart.$const216$ClosedClassWord, (SubLObject)psp_chart.UNPROVIDED) || psp_chart.NIL != lexicon_accessors.closed_lexical_class_stringP(quad_string, (SubLObject)psp_chart.UNPROVIDED)) && psp_chart.NIL != psp_ok_pos_predP(pos_pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(quad, (SubLObject)psp_chart.$list318);
        return (SubLObject)psp_chart.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 79075L)
    public static SubLObject psp_ok_pos_predP(final SubLObject pos_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == parsing_vars.$psp_pos_pred_filterP$.getDynamicValue(thread) || psp_chart.NIL == conses_high.member(pos_pred, parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 79273L)
    public static SubLObject psp_adjust_edge_weights(final SubLObject edges) {
        SubLObject cdolist_list_var = edges;
        SubLObject edge = (SubLObject)psp_chart.NIL;
        edge = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            psp_adjust_edge_weight(edge, edges);
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        }
        return edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 79567L)
    public static SubLObject psp_adjust_edge_weight(final SubLObject edge, final SubLObject edges) {
        final SubLObject pos_pred = get_psp_edge_pos_pred(edge);
        if (psp_chart.NIL != lexicon_accessors.genl_pos_predP(pos_pred, psp_chart.$const316$titleOfWork, (SubLObject)psp_chart.UNPROVIDED)) {
            SubLObject dispreference_level = (SubLObject)psp_chart.NIL;
            if (psp_chart.NIL == dispreference_level) {
                SubLObject csome_list_var = edges;
                SubLObject other_edge = (SubLObject)psp_chart.NIL;
                other_edge = csome_list_var.first();
                while (psp_chart.NIL == dispreference_level && psp_chart.NIL != csome_list_var) {
                    if (!other_edge.eql(edge) && psp_chart.NIL != lexicon_accessors.genl_pos_predP(get_psp_edge_pos_pred(other_edge), psp_chart.$const233$nameString, (SubLObject)psp_chart.UNPROVIDED) && psp_chart.NIL == dispreference_level) {
                        SubLObject csome_list_var_$20 = psp_edge_lookup_semx(other_edge, (SubLObject)psp_chart.$kw304$DENOT_GROUND);
                        SubLObject cycl = (SubLObject)psp_chart.NIL;
                        cycl = csome_list_var_$20.first();
                        while (psp_chart.NIL == dispreference_level && psp_chart.NIL != csome_list_var_$20) {
                            if (psp_chart.NIL == psp_rules.psp_isaP(cycl, psp_chart.$const319$FictionalCharacter) && psp_chart.NIL == psp_rules.psp_isaP(cycl, psp_chart.$const320$ConceptualWork)) {
                                dispreference_level = (SubLObject)psp_chart.TWO_INTEGER;
                            }
                            csome_list_var_$20 = csome_list_var_$20.rest();
                            cycl = csome_list_var_$20.first();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    other_edge = csome_list_var.first();
                }
            }
            if (psp_chart.NIL != dispreference_level) {
                set_psp_edge_weight(edge, psp_disprefer_weight(get_psp_edge_weight(edge), dispreference_level));
            }
        }
        return edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 80443L)
    public static SubLObject psp_consolidate_edges(final SubLObject edges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_edges = (SubLObject)psp_chart.NIL;
        SubLObject cdolist_list_var = psp_delete_subsumed_edges(edges);
        SubLObject edge = (SubLObject)psp_chart.NIL;
        edge = cdolist_list_var.first();
        while (psp_chart.NIL != cdolist_list_var) {
            final SubLObject prior_edge = psp_find_matching_edge(edge, output_edges);
            final SubLObject edge_cycls = get_psp_edge_cycls(edge);
            if (psp_chart.NIL == prior_edge || psp_chart.NIL == dictionary.dictionary_empty_p(edge_cycls)) {
                if (psp_chart.NIL != prior_edge) {
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(edge_cycls)); psp_chart.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject cycls = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject cdolist_list_var_$21 = cycls;
                        SubLObject cycl = (SubLObject)psp_chart.NIL;
                        cycl = cdolist_list_var_$21.first();
                        while (psp_chart.NIL != cdolist_list_var_$21) {
                            psp_edge_add_cycl(prior_edge, cycl, type);
                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                            cycl = cdolist_list_var_$21.first();
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                else {
                    output_edges = (SubLObject)ConsesLow.cons(edge, output_edges);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        }
        return output_edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 81153L)
    public static SubLObject psp_edge_add_cycl(final SubLObject edge, final SubLObject cycl, SubLObject type) {
        if (type == psp_chart.UNPROVIDED) {
            type = (SubLObject)psp_chart.$kw304$DENOT_GROUND;
        }
        psp_add_cycl_to_cycls(cycl, get_psp_edge_cycls(edge), type);
        return edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 81354L)
    public static SubLObject psp_delete_subsumed_edges(final SubLObject edges) {
        return list_utilities.delete_subsumed_items(edges, (SubLObject)psp_chart.$sym321$PSP_EDGE_SUBSUMES_, (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 81464L)
    public static SubLObject psp_edge_subsumesP(final SubLObject edge, final SubLObject other_edge) {
        return psp_edge_subsumedP(other_edge, edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 81615L)
    public static SubLObject psp_edge_subsumedP(final SubLObject edge, final SubLObject other_edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subsumedP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == psp_edge_weightierP(edge, other_edge, (SubLObject)psp_chart.UNPROVIDED) && psp_chart.NIL != psp_edge_pos_pred_subsumedP(edge, other_edge) && psp_chart.NIL != psp_edge_category_subsumedP(edge, other_edge) && psp_chart.NIL != psp_edge_frame_subsumedP(edge, other_edge) && psp_chart.NIL != psp_edge_cycls_subsumedP(edge, other_edge));
        if (psp_chart.NIL != parsing_vars.$psp_verboseP$.getDynamicValue(thread) && psp_chart.NIL != subsumedP) {
            PrintLow.format((SubLObject)psp_chart.T, (SubLObject)psp_chart.$str322$__Removing_edge_____S__is_subsume, edge, other_edge);
        }
        return subsumedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82142L)
    public static SubLObject psp_edge_pos_pred_subsumedP(final SubLObject edge, final SubLObject other_edge) {
        return lexicon_accessors.genl_pos_predP(get_psp_edge_pos_pred(other_edge), get_psp_edge_pos_pred(edge), (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82295L)
    public static SubLObject psp_edge_category_subsumedP(final SubLObject edge, final SubLObject other_edge) {
        return psp_semantics.psp_genl_posP(get_psp_edge_category(other_edge), get_psp_edge_category(edge), (SubLObject)psp_chart.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82447L)
    public static SubLObject psp_edge_frame_subsumedP(final SubLObject edge, final SubLObject other_edge) {
        return psp_frame_subsumedP(get_psp_edge_frame(edge), get_psp_edge_frame(other_edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82596L)
    public static SubLObject psp_frame_subsumedP(final SubLObject frame, final SubLObject other_frame) {
        return Equality.eq(frame, other_frame);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82685L)
    public static SubLObject psp_edge_cycls_subsumedP(final SubLObject edge, final SubLObject other_edge) {
        return psp_cycls_subsumedP(get_psp_edge_cycls(edge), get_psp_edge_cycls(other_edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 82841L)
    public static SubLObject psp_cycls_subsumedP(final SubLObject cycls, final SubLObject other_cycls) {
        if (psp_chart.NIL != dictionary.dictionary_empty_p(cycls)) {
            return (SubLObject)psp_chart.T;
        }
        SubLObject differentP = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == differentP) {
            SubLObject key;
            SubLObject key_$22;
            SubLObject other_key;
            SubLObject other_key_$23;
            for (key = (SubLObject)psp_chart.NIL, key_$22 = (SubLObject)psp_chart.NIL, other_key = (SubLObject)psp_chart.NIL, other_key_$23 = (SubLObject)psp_chart.NIL, key = dictionary.dictionary_keys(cycls), key_$22 = key.first(), other_key = dictionary.dictionary_keys(other_cycls), other_key_$23 = other_key.first(); psp_chart.NIL == differentP && (psp_chart.NIL != other_key || psp_chart.NIL != key); differentP = (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == psp_cycls_subsumedP_int(dictionary.dictionary_lookup(cycls, key_$22, (SubLObject)psp_chart.UNPROVIDED), dictionary.dictionary_lookup(other_cycls, other_key_$23, (SubLObject)psp_chart.UNPROVIDED))), key = key.rest(), key_$22 = key.first(), other_key = other_key.rest(), other_key_$23 = other_key.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == differentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 83282L)
    public static SubLObject psp_cycls_subsumedP_int(final SubLObject cycls, final SubLObject other_cycls) {
        SubLObject problemP = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == problemP) {
            SubLObject csome_list_var = cycls;
            SubLObject cycl = (SubLObject)psp_chart.NIL;
            cycl = csome_list_var.first();
            while (psp_chart.NIL == problemP && psp_chart.NIL != csome_list_var) {
                if (psp_chart.NIL == subl_promotions.memberP(cycl, other_cycls, Symbols.symbol_function((SubLObject)psp_chart.EQUAL), (SubLObject)psp_chart.UNPROVIDED)) {
                    problemP = (SubLObject)psp_chart.T;
                }
                csome_list_var = csome_list_var.rest();
                cycl = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_chart.NIL == problemP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 83501L)
    public static SubLObject psp_find_matching_edge(final SubLObject edge, final SubLObject other_edges) {
        final SubLObject span = get_psp_edge_span(edge);
        final SubLObject existing_edges = psp_edges_with_span(span, (SubLObject)psp_chart.UNPROVIDED);
        SubLObject match = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == match) {
            SubLObject csome_list_var = ConsesLow.append(other_edges, existing_edges);
            SubLObject other_edge = (SubLObject)psp_chart.NIL;
            other_edge = csome_list_var.first();
            while (psp_chart.NIL == match && psp_chart.NIL != csome_list_var) {
                if (psp_chart.NIL != psp_edges_matchP(edge, other_edge)) {
                    match = other_edge;
                }
                csome_list_var = csome_list_var.rest();
                other_edge = csome_list_var.first();
            }
        }
        return match;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 83822L)
    public static SubLObject psp_edges_matchP(final SubLObject edge, final SubLObject other_edge) {
        return (SubLObject)SubLObjectFactory.makeBoolean(get_psp_edge_pos_pred(edge).eql(get_psp_edge_pos_pred(other_edge)) && get_psp_edge_category(edge).eql(get_psp_edge_category(other_edge)) && get_psp_edge_frame(edge).eql(get_psp_edge_frame(other_edge)) && psp_chart.NIL != psp_edge_weights_equalP(edge, other_edge, (SubLObject)psp_chart.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 84153L)
    public static SubLObject psp_find_frames_internal(final SubLObject wu, final SubLObject pos, final SubLObject denot, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        SubLObject frames = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL != wu && psp_chart.NIL != pos) {
            frames = lexicon_accessors.frames_of_wordXpos(wu, pos);
            if (denot != psp_chart.$kw310$NO_DENOT) {
                frames = conses_high.union(frames, lexicon_accessors.frames_of_word_posXdenot(wu, pos, denot), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
            }
        }
        if (psp_chart.NIL != psp_semantics.psp_genl_posP(pos, psp_chart.$const324$Noun, (SubLObject)psp_chart.UNPROVIDED)) {
            final SubLObject item_var = psp_chart.$const311$RegularNounFrame;
            if (psp_chart.NIL == conses_high.member(item_var, frames, Symbols.symbol_function((SubLObject)psp_chart.EQL), Symbols.symbol_function((SubLObject)psp_chart.IDENTITY))) {
                frames = (SubLObject)ConsesLow.cons(item_var, frames);
            }
        }
        else if (psp_chart.NIL == frames && psp_chart.NIL != psp_semantics.psp_genl_posP(pos, psp_chart.$const325$Adjective, (SubLObject)psp_chart.UNPROVIDED)) {
            final SubLObject item_var = psp_chart.$const326$RegularAdjFrame;
            if (psp_chart.NIL == conses_high.member(item_var, frames, Symbols.symbol_function((SubLObject)psp_chart.EQL), Symbols.symbol_function((SubLObject)psp_chart.IDENTITY))) {
                frames = (SubLObject)ConsesLow.cons(item_var, frames);
            }
        }
        else if (psp_chart.NIL == frames && denot != psp_chart.$kw310$NO_DENOT && psp_chart.NIL != psp_semantics.psp_genl_posP(pos, psp_chart.$const242$Verb, (SubLObject)psp_chart.UNPROVIDED)) {
            frames = psp_devisable_verb_frames(mt);
        }
        frames = list_utilities.remove_if_not((SubLObject)psp_chart.$sym275$PSP_CONSTRAINED_FRAME_, frames, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        return (SubLObject)((psp_chart.NIL != frames) ? frames : psp_chart.$list327);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 84153L)
    public static SubLObject psp_find_frames(final SubLObject wu, final SubLObject pos, final SubLObject denot, SubLObject mt) {
        if (mt == psp_chart.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_chart.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_chart.NIL;
        if (psp_chart.NIL == v_memoization_state) {
            return psp_find_frames_internal(wu, pos, denot, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_chart.$sym323$PSP_FIND_FRAMES, (SubLObject)psp_chart.UNPROVIDED);
        if (psp_chart.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_chart.$sym323$PSP_FIND_FRAMES, (SubLObject)psp_chart.FOUR_INTEGER, (SubLObject)psp_chart.NIL, (SubLObject)psp_chart.EQUAL, (SubLObject)psp_chart.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_chart.$sym323$PSP_FIND_FRAMES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(wu, pos, denot, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_chart.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_chart.NIL;
            collision = cdolist_list_var.first();
            while (psp_chart.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (wu.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (denot.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (psp_chart.NIL != cached_args && psp_chart.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_find_frames_internal(wu, pos, denot, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(wu, pos, denot, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 84891L)
    public static SubLObject psp_find_constant(final SubLObject v_object) {
        if (v_object.isString()) {
            return constants_high.find_constant(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 85017L)
    public static SubLObject psp_edge_semx_doneP(final SubLObject edge, final SubLObject output_type) {
        if (output_type == psp_chart.$kw328$DENOT_TEMPLATE) {
            return (SubLObject)psp_chart.NIL;
        }
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(get_psp_edge_cycls(edge), output_type, (SubLObject)psp_chart.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 85289L)
    public static SubLObject psp_edge_lookup_semx(final SubLObject edge, final SubLObject output_type) {
        final SubLObject semx = dictionary.dictionary_lookup(get_psp_edge_cycls(edge), output_type, (SubLObject)psp_chart.UNPROVIDED);
        return semx;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 85507L)
    public static SubLObject psp_edge_to_pph_phrase(final SubLObject edge) {
        final SubLObject ans = pph_data_structures.new_pph_phrase(get_psp_edge_string(edge), (SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        final SubLObject dtr_list = psp_edge_dtrs(edge);
        pph_phrase.pph_phrase_set_agr(ans, pph_data_structures.new_pph_phrase_agr(pph_utilities.new_pph_agr_constraint((SubLObject)psp_chart.$kw98$POS_PRED, get_psp_edge_pos_pred(edge)), (SubLObject)psp_chart.UNPROVIDED), (SubLObject)psp_chart.UNPROVIDED);
        pph_phrase.pph_phrase_set_category(ans, get_psp_edge_category(edge), (SubLObject)psp_chart.UNPROVIDED);
        pph_phrase.pph_phrase_set_wu(ans, get_psp_edge_wu(edge));
        pph_phrase.set_pph_phrase_dtrs_from_list(ans, Mapping.mapcar((SubLObject)psp_chart.$sym329$PSP_EDGE_TO_PPH_PHRASE, dtr_list), (SubLObject)psp_chart.UNPROVIDED);
        pph_phrase.pph_phrase_set_cycl(ans, best_cycl_for_edge(edge));
        final SubLObject head_dtr_num = psp_edge_head_dtr_num(edge);
        if (psp_chart.NIL != head_dtr_num) {
            pph_phrase.pph_phrase_set_head_dtr_num(ans, number_utilities.f_1_(head_dtr_num));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 86177L)
    public static SubLObject test_sentence_set_words_from_string_list(final SubLObject strings, final SubLObject sentence_string) {
        final SubLObject sentence = document.new_sentence((SubLObject)psp_chart.UNPROVIDED, (SubLObject)psp_chart.UNPROVIDED);
        return sentence_set_words_from_string_list(sentence, strings, sentence_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-chart.lisp", position = 86177L)
    public static SubLObject word_offsets_equal(final SubLObject sentence, final SubLObject word_offsets) {
        SubLObject word = (SubLObject)psp_chart.NIL;
        SubLObject word_$24 = (SubLObject)psp_chart.NIL;
        SubLObject offset = (SubLObject)psp_chart.NIL;
        SubLObject offset_$25 = (SubLObject)psp_chart.NIL;
        word = vector_utilities.vector_elements(document.sentence_yield(sentence), (SubLObject)psp_chart.UNPROVIDED);
        word_$24 = word.first();
        offset = word_offsets;
        offset_$25 = offset.first();
        while (psp_chart.NIL != offset || psp_chart.NIL != word) {
            if (!document.word_offset(word_$24).eql(offset_$25)) {
                return (SubLObject)psp_chart.NIL;
            }
            word = word.rest();
            word_$24 = word.first();
            offset = offset.rest();
            offset_$25 = offset.first();
        }
        return (SubLObject)psp_chart.T;
    }
    
    public static SubLObject declare_psp_chart_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_chart_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-CHART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_chart_p", "PHRASE-STRUCTURE-PARSER-CHART-P", 1, 0, false);
        new $phrase_structure_parser_chart_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_id", "PSP-CHART-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_input_string", "PSP-CHART-INPUT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_length", "PSP-CHART-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_spans_to_edges", "PSP-CHART-SPANS-TO-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_gap_type", "PSP-CHART-GAP-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_memoization_state", "PSP-CHART-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_edge_id_index", "PSP-CHART-EDGE-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_edges_to_nodes", "PSP-CHART-EDGES-TO-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_max_edges_per_span", "PSP-CHART-MAX-EDGES-PER-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_max_edges", "PSP-CHART-MAX-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_maxed_out_spans", "PSP-CHART-MAXED-OUT-SPANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_maxed_outP", "PSP-CHART-MAXED-OUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_parsed_lexical_spans", "PSP-CHART-PARSED-LEXICAL-SPANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_id", "_CSETF-PSP-CHART-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_input_string", "_CSETF-PSP-CHART-INPUT-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_length", "_CSETF-PSP-CHART-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_spans_to_edges", "_CSETF-PSP-CHART-SPANS-TO-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_gap_type", "_CSETF-PSP-CHART-GAP-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_memoization_state", "_CSETF-PSP-CHART-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_edge_id_index", "_CSETF-PSP-CHART-EDGE-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_edges_to_nodes", "_CSETF-PSP-CHART-EDGES-TO-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_max_edges_per_span", "_CSETF-PSP-CHART-MAX-EDGES-PER-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_max_edges", "_CSETF-PSP-CHART-MAX-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_maxed_out_spans", "_CSETF-PSP-CHART-MAXED-OUT-SPANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_maxed_outP", "_CSETF-PSP-CHART-MAXED-OUT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_chart_parsed_lexical_spans", "_CSETF-PSP-CHART-PARSED-LEXICAL-SPANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "make_phrase_structure_parser_chart", "MAKE-PHRASE-STRUCTURE-PARSER-CHART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_phrase_structure_parser_chart", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_object_phrase_structure_parser_chart_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-CHART-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "pprint_psp_chart", "PPRINT-PSP-CHART", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "new_psp_chart", "NEW-PSP-CHART", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "destroy_psp_chart", "DESTROY-PSP-CHART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_clear", "PSP-CHART-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_set_string", "PSP-CHART-SET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_new_edge_id", "PSP-CHART-NEW-EDGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_index_edgesP", "PSP-CHART-INDEX-EDGES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_find_edge_by_id", "PSP-FIND-EDGE-BY-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_set_gap_type", "PSP-CHART-SET-GAP-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_phrasal_edge_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_phrasal_edge_p", "PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-P", 1, 0, false);
        new $phrase_structure_parser_phrasal_edge_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_weight", "PSP-PHRASAL-EDGE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_string", "PSP-PHRASAL-EDGE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_span", "PSP-PHRASAL-EDGE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_category", "PSP-PHRASAL-EDGE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_pos_pred", "PSP-PHRASAL-EDGE-POS-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_cycls", "PSP-PHRASAL-EDGE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_rule", "PSP-PHRASAL-EDGE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_new_dtr_constraints", "PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_head_dtr", "PSP-PHRASAL-EDGE-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_non_head_dtrs", "PSP-PHRASAL-EDGE-NON-HEAD-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_id", "PSP-PHRASAL-EDGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edge_chart", "PSP-PHRASAL-EDGE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_weight", "_CSETF-PSP-PHRASAL-EDGE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_string", "_CSETF-PSP-PHRASAL-EDGE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_span", "_CSETF-PSP-PHRASAL-EDGE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_category", "_CSETF-PSP-PHRASAL-EDGE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_pos_pred", "_CSETF-PSP-PHRASAL-EDGE-POS-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_cycls", "_CSETF-PSP-PHRASAL-EDGE-CYCLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_rule", "_CSETF-PSP-PHRASAL-EDGE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_new_dtr_constraints", "_CSETF-PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_head_dtr", "_CSETF-PSP-PHRASAL-EDGE-HEAD-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_non_head_dtrs", "_CSETF-PSP-PHRASAL-EDGE-NON-HEAD-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_id", "_CSETF-PSP-PHRASAL-EDGE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_phrasal_edge_chart", "_CSETF-PSP-PHRASAL-EDGE-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "make_phrase_structure_parser_phrasal_edge", "MAKE-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_phrase_structure_parser_phrasal_edge", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_object_phrase_structure_parser_phrasal_edge_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "sxhash_phrase_structure_parser_phrasal_edge_method", "SXHASH-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "pprint_psp_phrasal_edge", "PPRINT-PSP-PHRASAL-EDGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_lexical_edge_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_lexical_edge_p", "PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-P", 1, 0, false);
        new $phrase_structure_parser_lexical_edge_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_weight", "PSP-LEXICAL-EDGE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_string", "PSP-LEXICAL-EDGE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_span", "PSP-LEXICAL-EDGE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_category", "PSP-LEXICAL-EDGE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_pos_pred", "PSP-LEXICAL-EDGE-POS-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_cycls", "PSP-LEXICAL-EDGE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_wu", "PSP-LEXICAL-EDGE-WU", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_frame", "PSP-LEXICAL-EDGE-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_id", "PSP-LEXICAL-EDGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edge_chart", "PSP-LEXICAL-EDGE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_weight", "_CSETF-PSP-LEXICAL-EDGE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_string", "_CSETF-PSP-LEXICAL-EDGE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_span", "_CSETF-PSP-LEXICAL-EDGE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_category", "_CSETF-PSP-LEXICAL-EDGE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_pos_pred", "_CSETF-PSP-LEXICAL-EDGE-POS-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_cycls", "_CSETF-PSP-LEXICAL-EDGE-CYCLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_wu", "_CSETF-PSP-LEXICAL-EDGE-WU", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_frame", "_CSETF-PSP-LEXICAL-EDGE-FRAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_id", "_CSETF-PSP-LEXICAL-EDGE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "_csetf_psp_lexical_edge_chart", "_CSETF-PSP-LEXICAL-EDGE-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "make_phrase_structure_parser_lexical_edge", "MAKE-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_phrase_structure_parser_lexical_edge", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "visit_defstruct_object_phrase_structure_parser_lexical_edge_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "sxhash_psp_edge", "SXHASH-PSP-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "sxhash_phrase_structure_parser_lexical_edge_method", "SXHASH-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_spans", "PSP-CHART-SPANS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "pprint_psp_lexical_edge", "PPRINT-PSP-LEXICAL-EDGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_format_edge", "PSP-FORMAT-EDGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "phrase_structure_parser_edge_p", "PHRASE-STRUCTURE-PARSER-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_weight", "GET-PSP-EDGE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_string", "GET-PSP-EDGE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_span", "GET-PSP-EDGE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_category", "GET-PSP-EDGE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_pos_pred", "GET-PSP-EDGE-POS-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_cycls", "GET-PSP-EDGE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_rule", "GET-PSP-EDGE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_new_dtr_constraints", "GET-PSP-EDGE-NEW-DTR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_head_dtr", "GET-PSP-EDGE-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_non_head_dtrs", "GET-PSP-EDGE-NON-HEAD-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_wu", "GET-PSP-EDGE-WU", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_frame", "GET-PSP-EDGE-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_id", "GET-PSP-EDGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_chart", "GET-PSP-EDGE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_psp_edge_head_lexeme", "GET-PSP-EDGE-HEAD-LEXEME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_weight", "SET-PSP-EDGE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_string", "SET-PSP-EDGE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_span", "SET-PSP-EDGE-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_category", "SET-PSP-EDGE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_pos_pred", "SET-PSP-EDGE-POS-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_cycls", "SET-PSP-EDGE-CYCLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_rule", "SET-PSP-EDGE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_new_dtr_constraints", "SET-PSP-EDGE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_head_dtr", "SET-PSP-EDGE-HEAD-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_non_head_dtrs", "SET-PSP-EDGE-NON-HEAD-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_wu", "SET-PSP-EDGE-WU", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_frame", "SET-PSP-EDGE-FRAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_id", "SET-PSP-EDGE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "set_psp_edge_chart", "SET-PSP-EDGE-CHART", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_chart", "psp_do_spans", "PSP-DO-SPANS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_chart", "psp_do_edges_for_span", "PSP-DO-EDGES-FOR-SPAN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_chart", "psp_do_lexical_edges_for_span", "PSP-DO-LEXICAL-EDGES-FOR-SPAN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_do_edge_okP", "PSP-DO-EDGE-OK?", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_chart", "psp_do_edges", "PSP-DO-EDGES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_p", "PSP-WEIGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_unknown_weight_p", "PSP-UNKNOWN-WEIGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "possibly_psp_known_weight_p", "POSSIBLY-PSP-KNOWN-WEIGHT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_G", "PSP-WEIGHT->", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_L", "PSP-WEIGHT-<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_compose", "PSP-WEIGHT-COMPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_compose_two", "PSP-WEIGHT-COMPOSE-TWO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_weight_unknown_p", "PSP-EDGE-WEIGHT-UNKNOWN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_weight_from_dtrs", "PSP-EDGE-WEIGHT-FROM-DTRS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_np_gap_semx", "CLEAR-PSP-NP-GAP-SEMX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_np_gap_semx", "REMOVE-PSP-NP-GAP-SEMX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_gap_semx_internal", "PSP-NP-GAP-SEMX-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_gap_semx", "PSP-NP-GAP-SEMX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_gap_referent", "PSP-NP-GAP-REFERENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "new_psp_gap_edge", "NEW-PSP-GAP-EDGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_gap_edge_p", "PSP-GAP-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_gap_edge_p", "PSP-NP-GAP-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_preposition_gap_edge_p", "PSP-PREPOSITION-GAP-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pp_gap_edge_p", "PSP-PP-GAP-EDGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_gap_constraint_p", "PSP-GAP-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_allowed_gap_category", "PSP-ALLOWED-GAP-CATEGORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_already_has_gapP", "PSP-EDGE-ALREADY-HAS-GAP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_has_np_gapP", "PSP-EDGE-HAS-NP-GAP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_has_pp_gapP", "PSP-EDGE-HAS-PP-GAP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_gap_allowedP", "PSP-GAP-ALLOWED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pp_gap_allowedP", "PSP-PP-GAP-ALLOWED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pp_gap_constraint_p", "PSP-PP-GAP-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pp_gap_string", "PSP-PP-GAP-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "new_psp_phrasal_edge", "NEW-PSP-PHRASAL-EDGE", 3, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_maybe_setify_dtrs", "PSP-MAYBE-SETIFY-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "new_psp_lexical_edge", "NEW-PSP-LEXICAL-EDGE", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_tokenization_mode_p", "PSP-TOKENIZATION-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "sentence_set_words_from_string_list", "SENTENCE-SET-WORDS-FROM-STRING-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "initialize_psp_chart", "INITIALIZE-PSP-CHART", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_edges_from_sentence", "PSP-ADD-EDGES-FROM-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_adjust_weight_for_mode", "PSP-EDGE-ADJUST-WEIGHT-FOR-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "closed_lexical_class_edgeP", "CLOSED-LEXICAL-CLASS-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_default_weight_for_mode", "PSP-DEFAULT-WEIGHT-FOR-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_has_better_edgeP", "PSP-CHART-HAS-BETTER-EDGE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_better_edgeP", "PSP-BETTER-EDGE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edges_same_except_for_weightP", "PSP-EDGES-SAME-EXCEPT-FOR-WEIGHT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_weightierP", "PSP-EDGE-WEIGHTIER?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_weights_equalP", "PSP-EDGE-WEIGHTS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_string_tokenize", "PSP-STRING-TOKENIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_sentence_edgify", "PSP-SENTENCE-EDGIFY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_edge_to_result_vector", "PSP-ADD-EDGE-TO-RESULT-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_lexicon_edges", "PSP-ADD-LEXICON-EDGES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "get_raw_word_count_from_word", "GET-RAW-WORD-COUNT-FROM-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "fscp_multi_parse_category_p", "FSCP-MULTI-PARSE-CATEGORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_fscp_edges", "PSP-ADD-FSCP-EDGES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_sentence_copy", "PSP-SENTENCE-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_word_copy", "PSP-WORD-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_english_number_edges", "PSP-ADD-ENGLISH-NUMBER-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_digit_edges", "PSP-ADD-DIGIT-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_quantity_edges", "PSP-ADD-QUANTITY-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_guessed_edges", "PSP-ADD-GUESSED-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_guessed_edge", "PSP-ADD-GUESSED-EDGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_covering_startP", "PSP-EDGE-COVERING-START?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_spans_starting_at_start", "PSP-SPANS-STARTING-AT-START", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_indexical_edges", "PSP-ADD-INDEXICAL-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_maybe_guess_info_for_unknown_string", "PSP-MAYBE-GUESS-INFO-FOR-UNKNOWN-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_type_for_unknown_string", "PSP-TYPE-FOR-UNKNOWN-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_scalar_intervalP", "PSP-SCALAR-INTERVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "filter_prefixes_by_mt", "FILTER-PREFIXES-BY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passive_marker", "PSP-PASSIVE-MARKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passive_edges", "PSP-PASSIVE-EDGES", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_deverbal_edges", "PSP-DEVERBAL-EDGES", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "deverbal_noun_posP", "DEVERBAL-NOUN-POS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_frame_passivizableP", "PSP-FRAME-PASSIVIZABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_cycl_passes_name_checkP", "PSP-EDGE-CYCL-PASSES-NAME-CHECK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "string_has_non_name_denotsP", "STRING-HAS-NON-NAME-DENOTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_add_edge", "PSP-CHART-ADD-EDGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_set_lookup_node", "PSP-EDGE-SET-LOOKUP-NODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_set_note_node", "PSP-EDGE-SET-NOTE-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_lookup_node", "PSP-EDGE-LOOKUP-NODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_note_node", "PSP-EDGE-NOTE-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_rule_struct", "PSP-EDGE-RULE-STRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_rule_fort", "PSP-EDGE-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_longest_edges", "PSP-LONGEST-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "best_cycl_for_edge", "BEST-CYCL-FOR-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edges_with_span", "PSP-EDGES-WITH-SPAN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edges_with_span", "PSP-LEXICAL-EDGES-WITH-SPAN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_completed_edgeP", "PSP-COMPLETED-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_incomplete_edgeP", "PSP-INCOMPLETE-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_edgeP", "PSP-LEXICAL-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_might_have_dtrs_p", "PSP-EDGE-MIGHT-HAVE-DTRS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_phrasal_edgeP", "PSP-PHRASAL-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_adjp_edgeP", "PSP-ADJP-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_predicative_adjp_edgeP", "PSP-PREDICATIVE-ADJP-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_vbar_edgeP", "PSP-VBAR-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_nbar_edgeP", "PSP-NBAR-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_edgeP", "PSP-NP-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_starts_with_detpP", "PSP-EDGE-STARTS-WITH-DETP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pp_edgeP", "PSP-PP-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passive_edgeP", "PSP-PASSIVE-EDGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_meets_pos_pred_constraintP", "PSP-EDGE-MEETS-POS-PRED-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "first_edge_matching_pos_pred", "FIRST-EDGE-MATCHING-POS-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_next_dtr_constraints", "PSP-EDGE-NEXT-DTR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_later_dtr_constraints", "PSP-EDGE-LATER-DTR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_head_dtr_num", "PSP-EDGE-HEAD-DTR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_dtr_count", "PSP-EDGE-DTR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_dtrs", "PSP-EDGE-DTRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_non_branching_descendentP", "PSP-EDGE-NON-BRANCHING-DESCENDENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_sem_head_dtr", "PSP-EDGE-SEM-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_lexical_head_dtr", "PSP-EDGE-LEXICAL-HEAD-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_nth_dtr", "PSP-EDGE-NTH-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_sole_dtr", "PSP-EDGE-SOLE-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_precedesP", "PSP-EDGE-PRECEDES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_equalP", "PSP-EDGE-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_start_index", "PSP-EDGE-START-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_end_index", "PSP-EDGE-END-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_max_span", "PSP-CHART-MAX-SPAN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_all_complete_edges", "PSP-ALL-COMPLETE-EDGES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_input_spanning_edges", "PSP-INPUT-SPANNING-EDGES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_complete_edges_for_span", "PSP-COMPLETE-EDGES-FOR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_count", "PSP-EDGE-COUNT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_has_unknown_stringsP", "PSP-CHART-HAS-UNKNOWN-STRINGS?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_count_for_span", "PSP-EDGE-COUNT-FOR-SPAN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_span_has_edges_p", "PSP-SPAN-HAS-EDGES-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_chart_too_many_edgesP", "PSP-CHART-TOO-MANY-EDGES?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_span_too_many_edgesP", "PSP-SPAN-TOO-MANY-EDGES?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_span_too_many_edgesP_int", "PSP-SPAN-TOO-MANY-EDGES?-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_lexical_span_parsedP", "PSP-LEXICAL-SPAN-PARSED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "note_psp_lexical_span_parsed", "NOTE-PSP-LEXICAL-SPAN-PARSED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_np_edges", "PSP-NP-EDGES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_input_spanning_edge_count", "PSP-INPUT-SPANNING-EDGE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_bindings_from_head", "PSP-BINDINGS-FROM-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "cache_psp_frame_info", "CACHE-PSP-FRAME-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "recache_psp_frame_info", "RECACHE-PSP-FRAME-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_frame_info", "CLEAR-PSP-FRAME-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "add_subcat_frame_info", "ADD-SUBCAT-FRAME-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_subcat_frame_info", "REMOVE-SUBCAT-FRAME-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_bindings_from_frame", "PSP-BINDINGS-FROM-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_bindings_from_frame_int", "CLEAR-PSP-BINDINGS-FROM-FRAME-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_bindings_from_frame_int", "REMOVE-PSP-BINDINGS-FROM-FRAME-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_bindings_from_frame_int_internal", "PSP-BINDINGS-FROM-FRAME-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_bindings_from_frame_int", "PSP-BINDINGS-FROM-FRAME-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_predicative_frameP", "CLEAR-PSP-PREDICATIVE-FRAME?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_predicative_frameP", "REMOVE-PSP-PREDICATIVE-FRAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_predicative_frameP_internal", "PSP-PREDICATIVE-FRAME?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_predicative_frameP", "PSP-PREDICATIVE-FRAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_keywords_for_frame", "CLEAR-PSP-KEYWORDS-FOR-FRAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_keywords_for_frame", "REMOVE-PSP-KEYWORDS-FOR-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_keywords_for_frame_internal", "PSP-KEYWORDS-FOR-FRAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_keywords_for_frame", "PSP-KEYWORDS-FOR-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_constrained_frameP", "CLEAR-PSP-CONSTRAINED-FRAME?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_constrained_frameP", "REMOVE-PSP-CONSTRAINED-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_constrained_frameP_internal", "PSP-CONSTRAINED-FRAME?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_constrained_frameP", "PSP-CONSTRAINED-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_devisable_verb_frames", "CLEAR-PSP-DEVISABLE-VERB-FRAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_devisable_verb_frames", "REMOVE-PSP-DEVISABLE-VERB-FRAMES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_devisable_verb_frames_internal", "PSP-DEVISABLE-VERB-FRAMES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_devisable_verb_frames", "PSP-DEVISABLE-VERB-FRAMES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_transitive_np_comp_frameP", "CLEAR-TRANSITIVE-NP-COMP-FRAME?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_transitive_np_comp_frameP", "REMOVE-TRANSITIVE-NP-COMP-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "transitive_np_comp_frameP_internal", "TRANSITIVE-NP-COMP-FRAME?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "transitive_np_comp_frameP", "TRANSITIVE-NP-COMP-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_intransitive_frameP", "CLEAR-INTRANSITIVE-FRAME?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_intransitive_frameP", "REMOVE-INTRANSITIVE-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "intransitive_frameP_internal", "INTRANSITIVE-FRAME?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "intransitive_frameP", "INTRANSITIVE-FRAME?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_frame_has_typeP", "CLEAR-PSP-FRAME-HAS-TYPE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_frame_has_typeP", "REMOVE-PSP-FRAME-HAS-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_frame_has_typeP_internal", "PSP-FRAME-HAS-TYPE?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_frame_has_typeP", "PSP-FRAME-HAS-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "clear_psp_passivized_dtr_num", "CLEAR-PSP-PASSIVIZED-DTR-NUM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "remove_psp_passivized_dtr_num", "REMOVE-PSP-PASSIVIZED-DTR-NUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passivized_dtr_num_internal", "PSP-PASSIVIZED-DTR-NUM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passivized_dtr_num", "PSP-PASSIVIZED-DTR-NUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passivized_dtr_keyword", "PSP-PASSIVIZED-DTR-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passive_frameP", "PSP-PASSIVE-FRAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_active_frame", "PSP-ACTIVE-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passive_frame_type", "PSP-PASSIVE-FRAME-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_passivize_bindings", "PSP-PASSIVIZE-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_by_subject_binding", "PSP-BY-SUBJECT-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_add_cycl_to_cycls", "PSP-ADD-CYCL-TO-CYCLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_new_cycls", "PSP-NEW-CYCLS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "build_psp_edges_from_lex_entries", "BUILD-PSP-EDGES-FROM-LEX-ENTRIES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "build_psp_edges_from_lex_entry", "BUILD-PSP-EDGES-FROM-LEX-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "lex_entry_get_trie_entry", "LEX-ENTRY-GET-TRIE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "lex_entry_preferred_denots", "LEX-ENTRY-PREFERRED-DENOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_pos_preds_from_lex_entry", "PSP-POS-PREDS-FROM-LEX-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_term_passes_constraintsP", "PSP-TERM-PASSES-CONSTRAINTS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "titles_conventionally_quoted", "TITLES-CONVENTIONALLY-QUOTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_dispreference_level", "PSP-DISPREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_disprefer_weight", "PSP-DISPREFER-WEIGHT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_reprefer_weight", "PSP-REPREFER-WEIGHT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_for_lex_entry", "PSP-WEIGHT-FOR-LEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_weight_for_trie_entry", "PSP-WEIGHT-FOR-TRIE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_disprefer_trie_entry_for_stringP", "PSP-DISPREFER-TRIE-ENTRY-FOR-STRING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_term_has_preferred_lexificationsP_internal", "PSP-TERM-HAS-PREFERRED-LEXIFICATIONS?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_term_has_preferred_lexificationsP", "PSP-TERM-HAS-PREFERRED-LEXIFICATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_filter_lexical_quads", "PSP-FILTER-LEXICAL-QUADS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_good_lexical_quadP", "PSP-GOOD-LEXICAL-QUAD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_ok_pos_predP", "PSP-OK-POS-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_adjust_edge_weights", "PSP-ADJUST-EDGE-WEIGHTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_adjust_edge_weight", "PSP-ADJUST-EDGE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_consolidate_edges", "PSP-CONSOLIDATE-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_add_cycl", "PSP-EDGE-ADD-CYCL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_delete_subsumed_edges", "PSP-DELETE-SUBSUMED-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_subsumesP", "PSP-EDGE-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_subsumedP", "PSP-EDGE-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_pos_pred_subsumedP", "PSP-EDGE-POS-PRED-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_category_subsumedP", "PSP-EDGE-CATEGORY-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_frame_subsumedP", "PSP-EDGE-FRAME-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_frame_subsumedP", "PSP-FRAME-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_cycls_subsumedP", "PSP-EDGE-CYCLS-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_cycls_subsumedP", "PSP-CYCLS-SUBSUMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_cycls_subsumedP_int", "PSP-CYCLS-SUBSUMED?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_find_matching_edge", "PSP-FIND-MATCHING-EDGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edges_matchP", "PSP-EDGES-MATCH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_find_frames_internal", "PSP-FIND-FRAMES-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_find_frames", "PSP-FIND-FRAMES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_find_constant", "PSP-FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_semx_doneP", "PSP-EDGE-SEMX-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_lookup_semx", "PSP-EDGE-LOOKUP-SEMX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "psp_edge_to_pph_phrase", "PSP-EDGE-TO-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "test_sentence_set_words_from_string_list", "TEST-SENTENCE-SET-WORDS-FROM-STRING-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_chart", "word_offsets_equal", "WORD-OFFSETS-EQUAL", 2, 0, false);
        return (SubLObject)psp_chart.NIL;
    }
    
    public static SubLObject init_psp_chart_file() {
        psp_chart.$psp_parse_wh_wordsP$ = SubLFiles.deflexical("*PSP-PARSE-WH-WORDS?*", (SubLObject)psp_chart.NIL);
        psp_chart.$dtp_phrase_structure_parser_chart$ = SubLFiles.defconstant("*DTP-PHRASE-STRUCTURE-PARSER-CHART*", (SubLObject)psp_chart.$sym0$PHRASE_STRUCTURE_PARSER_CHART);
        psp_chart.$psp_chart_id_counter$ = SubLFiles.deflexical("*PSP-CHART-ID-COUNTER*", (SubLObject)(maybeDefault((SubLObject)psp_chart.$sym54$_PSP_CHART_ID_COUNTER_, psp_chart.$psp_chart_id_counter$, psp_chart.ZERO_INTEGER)));
        psp_chart.$psp_chart_index_edgesP$ = SubLFiles.deflexical("*PSP-CHART-INDEX-EDGES?*", (SubLObject)psp_chart.NIL);
        psp_chart.$dtp_phrase_structure_parser_phrasal_edge$ = SubLFiles.defconstant("*DTP-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE*", (SubLObject)psp_chart.$sym61$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE);
        psp_chart.$dtp_phrase_structure_parser_lexical_edge$ = SubLFiles.defconstant("*DTP-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE*", (SubLObject)psp_chart.$sym109$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE);
        psp_chart.$psp_unknown_weight$ = SubLFiles.defconstant("*PSP-UNKNOWN-WEIGHT*", (SubLObject)psp_chart.$kw179$UNKNOWN);
        psp_chart.$psp_edge_default_weight$ = SubLFiles.defconstant("*PSP-EDGE-DEFAULT-WEIGHT*", parsing_utilities.psp_weight_from_float((SubLObject)psp_chart.$float184$0_85));
        psp_chart.$psp_edge_greedy_weight$ = SubLFiles.defconstant("*PSP-EDGE-GREEDY-WEIGHT*", parsing_utilities.psp_weight_from_float((SubLObject)psp_chart.$float185$1_0));
        psp_chart.$psp_edge_dispreferred_weight$ = SubLFiles.defconstant("*PSP-EDGE-DISPREFERRED-WEIGHT*", parsing_utilities.psp_weight_from_float((SubLObject)psp_chart.$float186$0_75));
        psp_chart.$psp_gap_edge_weight$ = SubLFiles.defconstant("*PSP-GAP-EDGE-WEIGHT*", parsing_utilities.psp_weight_from_float((SubLObject)psp_chart.$float187$0_9));
        psp_chart.$psp_np_gap_semx_caching_state$ = SubLFiles.deflexical("*PSP-NP-GAP-SEMX-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_tokenization_modes$ = SubLFiles.defconstant("*PSP-TOKENIZATION-MODES*", (SubLObject)psp_chart.$list205);
        psp_chart.$psp_use_term_lexiconP$ = SubLFiles.defparameter("*PSP-USE-TERM-LEXICON?*", (SubLObject)psp_chart.NIL);
        psp_chart.$fscp_multi_parse_categories$ = SubLFiles.deflexical("*FSCP-MULTI-PARSE-CATEGORIES*", (SubLObject)psp_chart.$list221);
        psp_chart.$psp_bindings_from_frame_int_caching_state$ = SubLFiles.deflexical("*PSP-BINDINGS-FROM-FRAME-INT-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_predicative_frameP_caching_state$ = SubLFiles.deflexical("*PSP-PREDICATIVE-FRAME?-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_keywords_for_frame_caching_state$ = SubLFiles.deflexical("*PSP-KEYWORDS-FOR-FRAME-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_constrained_frameP_caching_state$ = SubLFiles.deflexical("*PSP-CONSTRAINED-FRAME?-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_devisable_verb_frames_caching_state$ = SubLFiles.deflexical("*PSP-DEVISABLE-VERB-FRAMES-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$transitive_np_comp_frameP_caching_state$ = SubLFiles.deflexical("*TRANSITIVE-NP-COMP-FRAME?-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$intransitive_frameP_caching_state$ = SubLFiles.deflexical("*INTRANSITIVE-FRAME?-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_frame_has_typeP_caching_state$ = SubLFiles.deflexical("*PSP-FRAME-HAS-TYPE?-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_passivized_dtr_num_caching_state$ = SubLFiles.deflexical("*PSP-PASSIVIZED-DTR-NUM-CACHING-STATE*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_passive_keys$ = SubLFiles.defconstant("*PSP-PASSIVE-KEYS*", (SubLObject)psp_chart.$list300);
        psp_chart.$titles_conventionally_quoted$ = SubLFiles.deflexical("*TITLES-CONVENTIONALLY-QUOTED*", (SubLObject)psp_chart.NIL);
        psp_chart.$psp_preferred_denot_preference_factor$ = SubLFiles.deflexical("*PSP-PREFERRED-DENOT-PREFERENCE-FACTOR*", (SubLObject)psp_chart.ONE_INTEGER);
        return (SubLObject)psp_chart.NIL;
    }
    
    public static SubLObject setup_psp_chart_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_chart$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym7$PHRASE_STRUCTURE_PARSER_CHART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)psp_chart.$list8);
        Structures.def_csetf((SubLObject)psp_chart.$sym9$PSP_CHART_ID, (SubLObject)psp_chart.$sym10$_CSETF_PSP_CHART_ID);
        Structures.def_csetf((SubLObject)psp_chart.$sym11$PSP_CHART_INPUT_STRING, (SubLObject)psp_chart.$sym12$_CSETF_PSP_CHART_INPUT_STRING);
        Structures.def_csetf((SubLObject)psp_chart.$sym13$PSP_CHART_LENGTH, (SubLObject)psp_chart.$sym14$_CSETF_PSP_CHART_LENGTH);
        Structures.def_csetf((SubLObject)psp_chart.$sym15$PSP_CHART_SPANS_TO_EDGES, (SubLObject)psp_chart.$sym16$_CSETF_PSP_CHART_SPANS_TO_EDGES);
        Structures.def_csetf((SubLObject)psp_chart.$sym17$PSP_CHART_GAP_TYPE, (SubLObject)psp_chart.$sym18$_CSETF_PSP_CHART_GAP_TYPE);
        Structures.def_csetf((SubLObject)psp_chart.$sym19$PSP_CHART_MEMOIZATION_STATE, (SubLObject)psp_chart.$sym20$_CSETF_PSP_CHART_MEMOIZATION_STATE);
        Structures.def_csetf((SubLObject)psp_chart.$sym21$PSP_CHART_EDGE_ID_INDEX, (SubLObject)psp_chart.$sym22$_CSETF_PSP_CHART_EDGE_ID_INDEX);
        Structures.def_csetf((SubLObject)psp_chart.$sym23$PSP_CHART_EDGES_TO_NODES, (SubLObject)psp_chart.$sym24$_CSETF_PSP_CHART_EDGES_TO_NODES);
        Structures.def_csetf((SubLObject)psp_chart.$sym25$PSP_CHART_MAX_EDGES_PER_SPAN, (SubLObject)psp_chart.$sym26$_CSETF_PSP_CHART_MAX_EDGES_PER_SPAN);
        Structures.def_csetf((SubLObject)psp_chart.$sym27$PSP_CHART_MAX_EDGES, (SubLObject)psp_chart.$sym28$_CSETF_PSP_CHART_MAX_EDGES);
        Structures.def_csetf((SubLObject)psp_chart.$sym29$PSP_CHART_MAXED_OUT_SPANS, (SubLObject)psp_chart.$sym30$_CSETF_PSP_CHART_MAXED_OUT_SPANS);
        Structures.def_csetf((SubLObject)psp_chart.$sym31$PSP_CHART_MAXED_OUT_, (SubLObject)psp_chart.$sym32$_CSETF_PSP_CHART_MAXED_OUT_);
        Structures.def_csetf((SubLObject)psp_chart.$sym33$PSP_CHART_PARSED_LEXICAL_SPANS, (SubLObject)psp_chart.$sym34$_CSETF_PSP_CHART_PARSED_LEXICAL_SPANS);
        Equality.identity((SubLObject)psp_chart.$sym0$PHRASE_STRUCTURE_PARSER_CHART);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_chart$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym53$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_CHART_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)psp_chart.$sym54$_PSP_CHART_ID_COUNTER_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_phrasal_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym68$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)psp_chart.$list69);
        Structures.def_csetf((SubLObject)psp_chart.$sym70$PSP_PHRASAL_EDGE_WEIGHT, (SubLObject)psp_chart.$sym71$_CSETF_PSP_PHRASAL_EDGE_WEIGHT);
        Structures.def_csetf((SubLObject)psp_chart.$sym72$PSP_PHRASAL_EDGE_STRING, (SubLObject)psp_chart.$sym73$_CSETF_PSP_PHRASAL_EDGE_STRING);
        Structures.def_csetf((SubLObject)psp_chart.$sym74$PSP_PHRASAL_EDGE_SPAN, (SubLObject)psp_chart.$sym75$_CSETF_PSP_PHRASAL_EDGE_SPAN);
        Structures.def_csetf((SubLObject)psp_chart.$sym76$PSP_PHRASAL_EDGE_CATEGORY, (SubLObject)psp_chart.$sym77$_CSETF_PSP_PHRASAL_EDGE_CATEGORY);
        Structures.def_csetf((SubLObject)psp_chart.$sym78$PSP_PHRASAL_EDGE_POS_PRED, (SubLObject)psp_chart.$sym79$_CSETF_PSP_PHRASAL_EDGE_POS_PRED);
        Structures.def_csetf((SubLObject)psp_chart.$sym80$PSP_PHRASAL_EDGE_CYCLS, (SubLObject)psp_chart.$sym81$_CSETF_PSP_PHRASAL_EDGE_CYCLS);
        Structures.def_csetf((SubLObject)psp_chart.$sym82$PSP_PHRASAL_EDGE_RULE, (SubLObject)psp_chart.$sym83$_CSETF_PSP_PHRASAL_EDGE_RULE);
        Structures.def_csetf((SubLObject)psp_chart.$sym84$PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS, (SubLObject)psp_chart.$sym85$_CSETF_PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS);
        Structures.def_csetf((SubLObject)psp_chart.$sym86$PSP_PHRASAL_EDGE_HEAD_DTR, (SubLObject)psp_chart.$sym87$_CSETF_PSP_PHRASAL_EDGE_HEAD_DTR);
        Structures.def_csetf((SubLObject)psp_chart.$sym88$PSP_PHRASAL_EDGE_NON_HEAD_DTRS, (SubLObject)psp_chart.$sym89$_CSETF_PSP_PHRASAL_EDGE_NON_HEAD_DTRS);
        Structures.def_csetf((SubLObject)psp_chart.$sym90$PSP_PHRASAL_EDGE_ID, (SubLObject)psp_chart.$sym91$_CSETF_PSP_PHRASAL_EDGE_ID);
        Structures.def_csetf((SubLObject)psp_chart.$sym92$PSP_PHRASAL_EDGE_CHART, (SubLObject)psp_chart.$sym93$_CSETF_PSP_PHRASAL_EDGE_CHART);
        Equality.identity((SubLObject)psp_chart.$sym61$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_phrasal_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym106$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHO));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_phrasal_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym107$SXHASH_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_lexical_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym116$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)psp_chart.$list117);
        Structures.def_csetf((SubLObject)psp_chart.$sym118$PSP_LEXICAL_EDGE_WEIGHT, (SubLObject)psp_chart.$sym119$_CSETF_PSP_LEXICAL_EDGE_WEIGHT);
        Structures.def_csetf((SubLObject)psp_chart.$sym120$PSP_LEXICAL_EDGE_STRING, (SubLObject)psp_chart.$sym121$_CSETF_PSP_LEXICAL_EDGE_STRING);
        Structures.def_csetf((SubLObject)psp_chart.$sym122$PSP_LEXICAL_EDGE_SPAN, (SubLObject)psp_chart.$sym123$_CSETF_PSP_LEXICAL_EDGE_SPAN);
        Structures.def_csetf((SubLObject)psp_chart.$sym124$PSP_LEXICAL_EDGE_CATEGORY, (SubLObject)psp_chart.$sym125$_CSETF_PSP_LEXICAL_EDGE_CATEGORY);
        Structures.def_csetf((SubLObject)psp_chart.$sym126$PSP_LEXICAL_EDGE_POS_PRED, (SubLObject)psp_chart.$sym127$_CSETF_PSP_LEXICAL_EDGE_POS_PRED);
        Structures.def_csetf((SubLObject)psp_chart.$sym128$PSP_LEXICAL_EDGE_CYCLS, (SubLObject)psp_chart.$sym129$_CSETF_PSP_LEXICAL_EDGE_CYCLS);
        Structures.def_csetf((SubLObject)psp_chart.$sym130$PSP_LEXICAL_EDGE_WU, (SubLObject)psp_chart.$sym131$_CSETF_PSP_LEXICAL_EDGE_WU);
        Structures.def_csetf((SubLObject)psp_chart.$sym132$PSP_LEXICAL_EDGE_FRAME, (SubLObject)psp_chart.$sym133$_CSETF_PSP_LEXICAL_EDGE_FRAME);
        Structures.def_csetf((SubLObject)psp_chart.$sym134$PSP_LEXICAL_EDGE_ID, (SubLObject)psp_chart.$sym135$_CSETF_PSP_LEXICAL_EDGE_ID);
        Structures.def_csetf((SubLObject)psp_chart.$sym136$PSP_LEXICAL_EDGE_CHART, (SubLObject)psp_chart.$sym137$_CSETF_PSP_LEXICAL_EDGE_CHART);
        Equality.identity((SubLObject)psp_chart.$sym109$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_lexical_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym141$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHO));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), psp_chart.$dtp_phrase_structure_parser_lexical_edge$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_chart.$sym142$SXHASH_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHOD));
        access_macros.register_macro_helper((SubLObject)psp_chart.$sym156$PSP_DO_EDGES_FOR_SPAN, (SubLObject)psp_chart.$sym157$PSP_DO_EDGES);
        access_macros.register_macro_helper((SubLObject)psp_chart.$sym163$PSP_DO_LEXICAL_EDGES_FOR_SPAN, (SubLObject)psp_chart.$sym157$PSP_DO_EDGES);
        access_macros.register_macro_helper((SubLObject)psp_chart.$sym162$PSP_DO_EDGE_OK_, (SubLObject)psp_chart.$sym156$PSP_DO_EDGES_FOR_SPAN);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym188$PSP_NP_GAP_SEMX);
        utilities_macros.register_kb_function((SubLObject)psp_chart.$sym258$ADD_SUBCAT_FRAME_INFO);
        utilities_macros.register_kb_function((SubLObject)psp_chart.$sym259$REMOVE_SUBCAT_FRAME_INFO);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym260$PSP_BINDINGS_FROM_FRAME_INT);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym266$PSP_PREDICATIVE_FRAME_);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym269$PSP_KEYWORDS_FOR_FRAME);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym275$PSP_CONSTRAINED_FRAME_);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym279$PSP_DEVISABLE_VERB_FRAMES);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym282$TRANSITIVE_NP_COMP_FRAME_);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym285$INTRANSITIVE_FRAME_);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym289$PSP_FRAME_HAS_TYPE_);
        memoization_state.note_globally_cached_function((SubLObject)psp_chart.$sym291$PSP_PASSIVIZED_DTR_NUM);
        memoization_state.note_memoized_function((SubLObject)psp_chart.$sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_);
        memoization_state.note_memoized_function((SubLObject)psp_chart.$sym323$PSP_FIND_FRAMES);
        generic_testing.define_test_case_table_int((SubLObject)psp_chart.$sym330$TEST_SENTENCE_SET_WORDS_FROM_STRING_LIST, (SubLObject)ConsesLow.list(new SubLObject[] { psp_chart.$kw331$TEST, psp_chart.$sym332$WORD_OFFSETS_EQUAL, psp_chart.$kw333$OWNER, psp_chart.NIL, psp_chart.$kw334$CLASSES, psp_chart.NIL, psp_chart.$kw335$KB, psp_chart.$kw336$FULL, psp_chart.$kw337$WORKING_, psp_chart.T }), (SubLObject)psp_chart.$list338);
        return (SubLObject)psp_chart.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_psp_chart_file();
    }
    
    @Override
	public void initializeVariables() {
        init_psp_chart_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_psp_chart_file();
    }
    
    static {
        me = (SubLFile)new psp_chart();
        psp_chart.$psp_parse_wh_wordsP$ = null;
        psp_chart.$dtp_phrase_structure_parser_chart$ = null;
        psp_chart.$psp_chart_id_counter$ = null;
        psp_chart.$psp_chart_index_edgesP$ = null;
        psp_chart.$dtp_phrase_structure_parser_phrasal_edge$ = null;
        psp_chart.$dtp_phrase_structure_parser_lexical_edge$ = null;
        psp_chart.$psp_unknown_weight$ = null;
        psp_chart.$psp_edge_default_weight$ = null;
        psp_chart.$psp_edge_greedy_weight$ = null;
        psp_chart.$psp_edge_dispreferred_weight$ = null;
        psp_chart.$psp_gap_edge_weight$ = null;
        psp_chart.$psp_np_gap_semx_caching_state$ = null;
        psp_chart.$psp_tokenization_modes$ = null;
        psp_chart.$psp_use_term_lexiconP$ = null;
        psp_chart.$fscp_multi_parse_categories$ = null;
        psp_chart.$psp_bindings_from_frame_int_caching_state$ = null;
        psp_chart.$psp_predicative_frameP_caching_state$ = null;
        psp_chart.$psp_keywords_for_frame_caching_state$ = null;
        psp_chart.$psp_constrained_frameP_caching_state$ = null;
        psp_chart.$psp_devisable_verb_frames_caching_state$ = null;
        psp_chart.$transitive_np_comp_frameP_caching_state$ = null;
        psp_chart.$intransitive_frameP_caching_state$ = null;
        psp_chart.$psp_frame_has_typeP_caching_state$ = null;
        psp_chart.$psp_passivized_dtr_num_caching_state$ = null;
        psp_chart.$psp_passive_keys$ = null;
        psp_chart.$titles_conventionally_quoted$ = null;
        psp_chart.$psp_preferred_denot_preference_factor$ = null;
        $sym0$PHRASE_STRUCTURE_PARSER_CHART = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART");
        $sym1$PHRASE_STRUCTURE_PARSER_CHART_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("INPUT-STRING"), SubLObjectFactory.makeSymbol("LENGTH"), SubLObjectFactory.makeSymbol("SPANS-TO-EDGES"), SubLObjectFactory.makeSymbol("GAP-TYPE"), SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("EDGE-ID-INDEX"), SubLObjectFactory.makeSymbol("EDGES-TO-NODES"), SubLObjectFactory.makeSymbol("MAX-EDGES-PER-SPAN"), SubLObjectFactory.makeSymbol("MAX-EDGES"), SubLObjectFactory.makeSymbol("MAXED-OUT-SPANS"), SubLObjectFactory.makeSymbol("MAXED-OUT?"), SubLObjectFactory.makeSymbol("PARSED-LEXICAL-SPANS") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("INPUT-STRING"), SubLObjectFactory.makeKeyword("LENGTH"), SubLObjectFactory.makeKeyword("SPANS-TO-EDGES"), SubLObjectFactory.makeKeyword("GAP-TYPE"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"), SubLObjectFactory.makeKeyword("EDGE-ID-INDEX"), SubLObjectFactory.makeKeyword("EDGES-TO-NODES"), SubLObjectFactory.makeKeyword("MAX-EDGES-PER-SPAN"), SubLObjectFactory.makeKeyword("MAX-EDGES"), SubLObjectFactory.makeKeyword("MAXED-OUT-SPANS"), SubLObjectFactory.makeKeyword("MAXED-OUT?"), SubLObjectFactory.makeKeyword("PARSED-LEXICAL-SPANS") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PSP-CHART-ID"), SubLObjectFactory.makeSymbol("PSP-CHART-INPUT-STRING"), SubLObjectFactory.makeSymbol("PSP-CHART-LENGTH"), SubLObjectFactory.makeSymbol("PSP-CHART-SPANS-TO-EDGES"), SubLObjectFactory.makeSymbol("PSP-CHART-GAP-TYPE"), SubLObjectFactory.makeSymbol("PSP-CHART-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("PSP-CHART-EDGE-ID-INDEX"), SubLObjectFactory.makeSymbol("PSP-CHART-EDGES-TO-NODES"), SubLObjectFactory.makeSymbol("PSP-CHART-MAX-EDGES-PER-SPAN"), SubLObjectFactory.makeSymbol("PSP-CHART-MAX-EDGES"), SubLObjectFactory.makeSymbol("PSP-CHART-MAXED-OUT-SPANS"), SubLObjectFactory.makeSymbol("PSP-CHART-MAXED-OUT?"), SubLObjectFactory.makeSymbol("PSP-CHART-PARSED-LEXICAL-SPANS") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-ID"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-INPUT-STRING"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-LENGTH"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-SPANS-TO-EDGES"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-GAP-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-EDGE-ID-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-EDGES-TO-NODES"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAX-EDGES-PER-SPAN"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAX-EDGES"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAXED-OUT-SPANS"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAXED-OUT?"), SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-PARSED-LEXICAL-SPANS") });
        $sym6$PPRINT_PSP_CHART = SubLObjectFactory.makeSymbol("PPRINT-PSP-CHART");
        $sym7$PHRASE_STRUCTURE_PARSER_CHART_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P"));
        $sym9$PSP_CHART_ID = SubLObjectFactory.makeSymbol("PSP-CHART-ID");
        $sym10$_CSETF_PSP_CHART_ID = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-ID");
        $sym11$PSP_CHART_INPUT_STRING = SubLObjectFactory.makeSymbol("PSP-CHART-INPUT-STRING");
        $sym12$_CSETF_PSP_CHART_INPUT_STRING = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-INPUT-STRING");
        $sym13$PSP_CHART_LENGTH = SubLObjectFactory.makeSymbol("PSP-CHART-LENGTH");
        $sym14$_CSETF_PSP_CHART_LENGTH = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-LENGTH");
        $sym15$PSP_CHART_SPANS_TO_EDGES = SubLObjectFactory.makeSymbol("PSP-CHART-SPANS-TO-EDGES");
        $sym16$_CSETF_PSP_CHART_SPANS_TO_EDGES = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-SPANS-TO-EDGES");
        $sym17$PSP_CHART_GAP_TYPE = SubLObjectFactory.makeSymbol("PSP-CHART-GAP-TYPE");
        $sym18$_CSETF_PSP_CHART_GAP_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-GAP-TYPE");
        $sym19$PSP_CHART_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PSP-CHART-MEMOIZATION-STATE");
        $sym20$_CSETF_PSP_CHART_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MEMOIZATION-STATE");
        $sym21$PSP_CHART_EDGE_ID_INDEX = SubLObjectFactory.makeSymbol("PSP-CHART-EDGE-ID-INDEX");
        $sym22$_CSETF_PSP_CHART_EDGE_ID_INDEX = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-EDGE-ID-INDEX");
        $sym23$PSP_CHART_EDGES_TO_NODES = SubLObjectFactory.makeSymbol("PSP-CHART-EDGES-TO-NODES");
        $sym24$_CSETF_PSP_CHART_EDGES_TO_NODES = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-EDGES-TO-NODES");
        $sym25$PSP_CHART_MAX_EDGES_PER_SPAN = SubLObjectFactory.makeSymbol("PSP-CHART-MAX-EDGES-PER-SPAN");
        $sym26$_CSETF_PSP_CHART_MAX_EDGES_PER_SPAN = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAX-EDGES-PER-SPAN");
        $sym27$PSP_CHART_MAX_EDGES = SubLObjectFactory.makeSymbol("PSP-CHART-MAX-EDGES");
        $sym28$_CSETF_PSP_CHART_MAX_EDGES = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAX-EDGES");
        $sym29$PSP_CHART_MAXED_OUT_SPANS = SubLObjectFactory.makeSymbol("PSP-CHART-MAXED-OUT-SPANS");
        $sym30$_CSETF_PSP_CHART_MAXED_OUT_SPANS = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAXED-OUT-SPANS");
        $sym31$PSP_CHART_MAXED_OUT_ = SubLObjectFactory.makeSymbol("PSP-CHART-MAXED-OUT?");
        $sym32$_CSETF_PSP_CHART_MAXED_OUT_ = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-MAXED-OUT?");
        $sym33$PSP_CHART_PARSED_LEXICAL_SPANS = SubLObjectFactory.makeSymbol("PSP-CHART-PARSED-LEXICAL-SPANS");
        $sym34$_CSETF_PSP_CHART_PARSED_LEXICAL_SPANS = SubLObjectFactory.makeSymbol("_CSETF-PSP-CHART-PARSED-LEXICAL-SPANS");
        $kw35$ID = SubLObjectFactory.makeKeyword("ID");
        $kw36$INPUT_STRING = SubLObjectFactory.makeKeyword("INPUT-STRING");
        $kw37$LENGTH = SubLObjectFactory.makeKeyword("LENGTH");
        $kw38$SPANS_TO_EDGES = SubLObjectFactory.makeKeyword("SPANS-TO-EDGES");
        $kw39$GAP_TYPE = SubLObjectFactory.makeKeyword("GAP-TYPE");
        $kw40$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $kw41$EDGE_ID_INDEX = SubLObjectFactory.makeKeyword("EDGE-ID-INDEX");
        $kw42$EDGES_TO_NODES = SubLObjectFactory.makeKeyword("EDGES-TO-NODES");
        $kw43$MAX_EDGES_PER_SPAN = SubLObjectFactory.makeKeyword("MAX-EDGES-PER-SPAN");
        $kw44$MAX_EDGES = SubLObjectFactory.makeKeyword("MAX-EDGES");
        $kw45$MAXED_OUT_SPANS = SubLObjectFactory.makeKeyword("MAXED-OUT-SPANS");
        $kw46$MAXED_OUT_ = SubLObjectFactory.makeKeyword("MAXED-OUT?");
        $kw47$PARSED_LEXICAL_SPANS = SubLObjectFactory.makeKeyword("PARSED-LEXICAL-SPANS");
        $str48$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw49$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym50$MAKE_PHRASE_STRUCTURE_PARSER_CHART = SubLObjectFactory.makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-CHART");
        $kw51$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw52$END = SubLObjectFactory.makeKeyword("END");
        $sym53$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_CHART_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-CHART-METHOD");
        $sym54$_PSP_CHART_ID_COUNTER_ = SubLObjectFactory.makeSymbol("*PSP-CHART-ID-COUNTER*");
        $str55$__PSP_CHART__S__S_ = SubLObjectFactory.makeString("#<PSP-CHART ~S ~S>");
        $kw56$DESTROYED = SubLObjectFactory.makeKeyword("DESTROYED");
        $kw57$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $kw58$SET = SubLObjectFactory.makeKeyword("SET");
        $str59$Not_indexing_PSP_edges__Can_t_fin = SubLObjectFactory.makeString("Not indexing PSP edges. Can't find edges by IDs.");
        $str60$_S_is_not_a_PSP_chart__Can_t_find = SubLObjectFactory.makeString("~S is not a PSP chart. Can't find edges by IDs.");
        $sym61$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE");
        $sym62$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-P");
        $list63 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("WEIGHT"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("SPAN"), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("CYCLS"), SubLObjectFactory.makeSymbol("RULE"), SubLObjectFactory.makeSymbol("NEW-DTR-CONSTRAINTS"), SubLObjectFactory.makeSymbol("HEAD-DTR"), SubLObjectFactory.makeSymbol("NON-HEAD-DTRS"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CHART") });
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WEIGHT"), SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("SPAN"), SubLObjectFactory.makeKeyword("CATEGORY"), SubLObjectFactory.makeKeyword("POS-PRED"), SubLObjectFactory.makeKeyword("CYCLS"), SubLObjectFactory.makeKeyword("RULE"), SubLObjectFactory.makeKeyword("NEW-DTR-CONSTRAINTS"), SubLObjectFactory.makeKeyword("HEAD-DTR"), SubLObjectFactory.makeKeyword("NON-HEAD-DTRS"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CHART") });
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-WEIGHT"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-STRING"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-SPAN"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CATEGORY"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-POS-PRED"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CYCLS"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-RULE"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-HEAD-DTR"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-NON-HEAD-DTRS"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-ID"), SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CHART") });
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-WEIGHT"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-STRING"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-SPAN"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CATEGORY"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-POS-PRED"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CYCLS"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-RULE"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-HEAD-DTR"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-NON-HEAD-DTRS"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-ID"), SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CHART") });
        $sym67$PPRINT_PSP_PHRASAL_EDGE = SubLObjectFactory.makeSymbol("PPRINT-PSP-PHRASAL-EDGE");
        $sym68$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-PRINT-FUNCTION-TRAMPOLINE");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-P"));
        $sym70$PSP_PHRASAL_EDGE_WEIGHT = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-WEIGHT");
        $sym71$_CSETF_PSP_PHRASAL_EDGE_WEIGHT = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-WEIGHT");
        $sym72$PSP_PHRASAL_EDGE_STRING = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-STRING");
        $sym73$_CSETF_PSP_PHRASAL_EDGE_STRING = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-STRING");
        $sym74$PSP_PHRASAL_EDGE_SPAN = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-SPAN");
        $sym75$_CSETF_PSP_PHRASAL_EDGE_SPAN = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-SPAN");
        $sym76$PSP_PHRASAL_EDGE_CATEGORY = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CATEGORY");
        $sym77$_CSETF_PSP_PHRASAL_EDGE_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CATEGORY");
        $sym78$PSP_PHRASAL_EDGE_POS_PRED = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-POS-PRED");
        $sym79$_CSETF_PSP_PHRASAL_EDGE_POS_PRED = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-POS-PRED");
        $sym80$PSP_PHRASAL_EDGE_CYCLS = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CYCLS");
        $sym81$_CSETF_PSP_PHRASAL_EDGE_CYCLS = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CYCLS");
        $sym82$PSP_PHRASAL_EDGE_RULE = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-RULE");
        $sym83$_CSETF_PSP_PHRASAL_EDGE_RULE = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-RULE");
        $sym84$PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS");
        $sym85$_CSETF_PSP_PHRASAL_EDGE_NEW_DTR_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-NEW-DTR-CONSTRAINTS");
        $sym86$PSP_PHRASAL_EDGE_HEAD_DTR = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-HEAD-DTR");
        $sym87$_CSETF_PSP_PHRASAL_EDGE_HEAD_DTR = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-HEAD-DTR");
        $sym88$PSP_PHRASAL_EDGE_NON_HEAD_DTRS = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-NON-HEAD-DTRS");
        $sym89$_CSETF_PSP_PHRASAL_EDGE_NON_HEAD_DTRS = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-NON-HEAD-DTRS");
        $sym90$PSP_PHRASAL_EDGE_ID = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-ID");
        $sym91$_CSETF_PSP_PHRASAL_EDGE_ID = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-ID");
        $sym92$PSP_PHRASAL_EDGE_CHART = SubLObjectFactory.makeSymbol("PSP-PHRASAL-EDGE-CHART");
        $sym93$_CSETF_PSP_PHRASAL_EDGE_CHART = SubLObjectFactory.makeSymbol("_CSETF-PSP-PHRASAL-EDGE-CHART");
        $kw94$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $kw95$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw96$SPAN = SubLObjectFactory.makeKeyword("SPAN");
        $kw97$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw98$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $kw99$CYCLS = SubLObjectFactory.makeKeyword("CYCLS");
        $kw100$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw101$NEW_DTR_CONSTRAINTS = SubLObjectFactory.makeKeyword("NEW-DTR-CONSTRAINTS");
        $kw102$HEAD_DTR = SubLObjectFactory.makeKeyword("HEAD-DTR");
        $kw103$NON_HEAD_DTRS = SubLObjectFactory.makeKeyword("NON-HEAD-DTRS");
        $kw104$CHART = SubLObjectFactory.makeKeyword("CHART");
        $sym105$MAKE_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE = SubLObjectFactory.makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE");
        $sym106$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHO = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-METHOD");
        $sym107$SXHASH_PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-METHOD");
        $str108$__PSP_PHRASAL_EDGE__S__S__S_ = SubLObjectFactory.makeString("#<PSP-PHRASAL-EDGE ~S ~S ~S>");
        $sym109$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE");
        $sym110$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-P");
        $list111 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("WEIGHT"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("SPAN"), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("CYCLS"), SubLObjectFactory.makeSymbol("WU"), SubLObjectFactory.makeSymbol("FRAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CHART") });
        $list112 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("WEIGHT"), SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("SPAN"), SubLObjectFactory.makeKeyword("CATEGORY"), SubLObjectFactory.makeKeyword("POS-PRED"), SubLObjectFactory.makeKeyword("CYCLS"), SubLObjectFactory.makeKeyword("WU"), SubLObjectFactory.makeKeyword("FRAME"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CHART") });
        $list113 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-WEIGHT"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-STRING"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-SPAN"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CATEGORY"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-POS-PRED"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CYCLS"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-WU"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-FRAME"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-ID"), SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CHART") });
        $list114 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-WEIGHT"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-STRING"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-SPAN"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CATEGORY"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-POS-PRED"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CYCLS"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-WU"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-FRAME"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-ID"), SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CHART") });
        $sym115$PPRINT_PSP_LEXICAL_EDGE = SubLObjectFactory.makeSymbol("PPRINT-PSP-LEXICAL-EDGE");
        $sym116$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-PRINT-FUNCTION-TRAMPOLINE");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-P"));
        $sym118$PSP_LEXICAL_EDGE_WEIGHT = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-WEIGHT");
        $sym119$_CSETF_PSP_LEXICAL_EDGE_WEIGHT = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-WEIGHT");
        $sym120$PSP_LEXICAL_EDGE_STRING = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-STRING");
        $sym121$_CSETF_PSP_LEXICAL_EDGE_STRING = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-STRING");
        $sym122$PSP_LEXICAL_EDGE_SPAN = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-SPAN");
        $sym123$_CSETF_PSP_LEXICAL_EDGE_SPAN = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-SPAN");
        $sym124$PSP_LEXICAL_EDGE_CATEGORY = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CATEGORY");
        $sym125$_CSETF_PSP_LEXICAL_EDGE_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CATEGORY");
        $sym126$PSP_LEXICAL_EDGE_POS_PRED = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-POS-PRED");
        $sym127$_CSETF_PSP_LEXICAL_EDGE_POS_PRED = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-POS-PRED");
        $sym128$PSP_LEXICAL_EDGE_CYCLS = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CYCLS");
        $sym129$_CSETF_PSP_LEXICAL_EDGE_CYCLS = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CYCLS");
        $sym130$PSP_LEXICAL_EDGE_WU = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-WU");
        $sym131$_CSETF_PSP_LEXICAL_EDGE_WU = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-WU");
        $sym132$PSP_LEXICAL_EDGE_FRAME = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-FRAME");
        $sym133$_CSETF_PSP_LEXICAL_EDGE_FRAME = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-FRAME");
        $sym134$PSP_LEXICAL_EDGE_ID = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-ID");
        $sym135$_CSETF_PSP_LEXICAL_EDGE_ID = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-ID");
        $sym136$PSP_LEXICAL_EDGE_CHART = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE-CHART");
        $sym137$_CSETF_PSP_LEXICAL_EDGE_CHART = SubLObjectFactory.makeSymbol("_CSETF-PSP-LEXICAL-EDGE-CHART");
        $kw138$WU = SubLObjectFactory.makeKeyword("WU");
        $kw139$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $sym140$MAKE_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE = SubLObjectFactory.makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE");
        $sym141$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHO = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-METHOD");
        $sym142$SXHASH_PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-METHOD");
        $str143$__PSP_LEXICAL_EDGE__S__S__S__S_W_ = SubLObjectFactory.makeString("#<PSP-LEXICAL-EDGE ~S ~S ~S ~S W=~S>");
        $str144$___S___S______S__ = SubLObjectFactory.makeString("~&~S (~S):~% ~S~%");
        $str145$_S_is_not_a_PSP_edge_ = SubLObjectFactory.makeString("~S is not a PSP edge.");
        $str146$Headless_edge___S = SubLObjectFactory.makeString("Headless edge: ~S");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("CHART")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym148$CHART_TO_USE = SubLObjectFactory.makeUninternedSymbol("CHART-TO-USE");
        $sym149$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym150$FIRST_OF = SubLObjectFactory.makeSymbol("FIRST-OF");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PSP-CHART*"));
        $sym152$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P"));
        $sym154$DO_DICTIONARY_KEYS = SubLObjectFactory.makeSymbol("DO-DICTIONARY-KEYS");
        $kw155$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym156$PSP_DO_EDGES_FOR_SPAN = SubLObjectFactory.makeSymbol("PSP-DO-EDGES-FOR-SPAN");
        $sym157$PSP_DO_EDGES = SubLObjectFactory.makeSymbol("PSP-DO-EDGES");
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CHART"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-ONLY?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym159$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym160$PSP_EDGES_WITH_SPAN = SubLObjectFactory.makeSymbol("PSP-EDGES-WITH-SPAN");
        $sym161$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym162$PSP_DO_EDGE_OK_ = SubLObjectFactory.makeSymbol("PSP-DO-EDGE-OK?");
        $sym163$PSP_DO_LEXICAL_EDGES_FOR_SPAN = SubLObjectFactory.makeSymbol("PSP-DO-LEXICAL-EDGES-FOR-SPAN");
        $sym164$PSP_LEXICAL_EDGES_WITH_SPAN = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGES-WITH-SPAN");
        $kw165$ANY = SubLObjectFactory.makeKeyword("ANY");
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EDGE-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHART"), (SubLObject)psp_chart.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-ONLY?"), (SubLObject)psp_chart.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)psp_chart.NIL))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHART"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("SPAN"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-ONLY?"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw168$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw169$COMPLETE_ONLY_ = SubLObjectFactory.makeKeyword("COMPLETE-ONLY?");
        $kw170$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $sym171$SPAN_TO_DO = SubLObjectFactory.makeUninternedSymbol("SPAN-TO-DO");
        $sym172$CHART_TO_USE = SubLObjectFactory.makeUninternedSymbol("CHART-TO-USE");
        $sym173$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"));
        $sym175$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym176$PSP_DO_SPANS = SubLObjectFactory.makeSymbol("PSP-DO-SPANS");
        $kw177$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym178$INTERVAL_SPAN_P = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-P");
        $kw179$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw180$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $kw181$FLOAT = SubLObjectFactory.makeKeyword("FLOAT");
        $float182$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $sym183$PSP_WEIGHT_P = SubLObjectFactory.makeSymbol("PSP-WEIGHT-P");
        $float184$0_85 = (SubLFloat)SubLObjectFactory.makeDouble(0.85);
        $float185$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $float186$0_75 = (SubLFloat)SubLObjectFactory.makeDouble(0.75);
        $float187$0_9 = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $sym188$PSP_NP_GAP_SEMX = SubLObjectFactory.makeSymbol("PSP-NP-GAP-SEMX");
        $sym189$_PSP_NP_GAP_SEMX_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-NP-GAP-SEMX-CACHING-STATE*");
        $const190$TheGappedTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheGappedTerm"));
        $sym191$NEW_PSP_PHRASAL_EDGE = SubLObjectFactory.makeSymbol("NEW-PSP-PHRASAL-EDGE");
        $sym192$NEW_PSP_LEXICAL_EDGE = SubLObjectFactory.makeSymbol("NEW-PSP-LEXICAL-EDGE");
        $str193$ = SubLObjectFactory.makeString("");
        $kw194$NEW = SubLObjectFactory.makeKeyword("NEW");
        $const195$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $kw197$NP = SubLObjectFactory.makeKeyword("NP");
        $const198$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $kw199$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw200$PP = SubLObjectFactory.makeKeyword("PP");
        $sym201$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym202$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym203$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym204$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GREEDY"), (SubLObject)SubLObjectFactory.makeKeyword("DILIGENT"));
        $kw206$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $sym207$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $kw208$CONSTITUENTS = SubLObjectFactory.makeKeyword("CONSTITUENTS");
        $sym209$PSP_LEXICON_P = SubLObjectFactory.makeSymbol("PSP-LEXICON-P");
        $str210$_ = SubLObjectFactory.makeString("'");
        $str211$___ = SubLObjectFactory.makeString(" ' ");
        $kw212$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $sym213$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
        $kw214$DILIGENT = SubLObjectFactory.makeKeyword("DILIGENT");
        $kw215$ADDED = SubLObjectFactory.makeKeyword("ADDED");
        $const216$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $sym217$PSP_TOKENIZATION_MODE_P = SubLObjectFactory.makeSymbol("PSP-TOKENIZATION-MODE-P");
        $kw218$GREEDY = SubLObjectFactory.makeKeyword("GREEDY");
        $str219$Failed_to_get_bigger_than__S__Lon = SubLObjectFactory.makeString("Failed to get bigger than ~S. Longest edge:~% ~S (span: ~S)~%");
        $sym220$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUANTITY"), (SubLObject)SubLObjectFactory.makeKeyword("UNIT-OF-MEASURE"));
        $str222$a = SubLObjectFactory.makeString("a");
        $sym223$WORD_P = SubLObjectFactory.makeSymbol("WORD-P");
        $const224$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $const225$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $sym226$PSP_SCALAR_INTERVAL_ = SubLObjectFactory.makeSymbol("PSP-SCALAR-INTERVAL?");
        $sym227$IBQE_ = SubLObjectFactory.makeSymbol("IBQE?");
        $const228$simpleNounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("simpleNounStrings"));
        $sym229$WORD_STRING = SubLObjectFactory.makeSymbol("WORD-STRING");
        $sym230$_ = SubLObjectFactory.makeSymbol("=");
        $sym231$INTERVAL_SPAN_START = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-START");
        $list232 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"));
        $const233$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $const234$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $const235$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const236$ScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $const237$passiveParticiple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passiveParticiple"));
        $const238$perfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"));
        $kw239$PASSIVE = SubLObjectFactory.makeKeyword("PASSIVE");
        $kw240$PASSIVE_WITH_BY = SubLObjectFactory.makeKeyword("PASSIVE-WITH-BY");
        $const241$TransitiveNPFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame"));
        $const242$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $list243 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrameFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Of-TheWord")));
        $const244$MassNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $const245$GerundiveNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GerundiveNoun"));
        $const246$PassivizableFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PassivizableFrame"));
        $str247$the_ = SubLObjectFactory.makeString("the ");
        $kw248$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $str249$__Adding_new_edge_____S__Looking_ = SubLObjectFactory.makeString("~&Adding new edge:~% ~S~%Looking for dtrs:~% ~S~%");
        $kw250$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym251$PSP_LEXICAL_EDGE_ = SubLObjectFactory.makeSymbol("PSP-LEXICAL-EDGE?");
        $list252 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $sym253$PSP_INCOMPLETE_EDGE_ = SubLObjectFactory.makeSymbol("PSP-INCOMPLETE-EDGE?");
        $sym254$PSP_NP_EDGE_ = SubLObjectFactory.makeSymbol("PSP-NP-EDGE?");
        $const255$SubcategorizationFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcategorizationFrame"));
        $str256$Initializing_Subcategorization_Fr = SubLObjectFactory.makeString("Initializing Subcategorization Frames...");
        $kw257$CACHED = SubLObjectFactory.makeKeyword("CACHED");
        $sym258$ADD_SUBCAT_FRAME_INFO = SubLObjectFactory.makeSymbol("ADD-SUBCAT-FRAME-INFO");
        $sym259$REMOVE_SUBCAT_FRAME_INFO = SubLObjectFactory.makeSymbol("REMOVE-SUBCAT-FRAME-INFO");
        $sym260$PSP_BINDINGS_FROM_FRAME_INT = SubLObjectFactory.makeSymbol("PSP-BINDINGS-FROM-FRAME-INT");
        $kw261$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NUM"), (SubLObject)SubLObjectFactory.makeSymbol("?KEY"));
        $const263$subcatFrameDependentKeyword = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameDependentKeyword"));
        $sym264$_PSP_BINDINGS_FROM_FRAME_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-BINDINGS-FROM-FRAME-INT-CACHING-STATE*");
        $int265$128 = SubLObjectFactory.makeInteger(128);
        $sym266$PSP_PREDICATIVE_FRAME_ = SubLObjectFactory.makeSymbol("PSP-PREDICATIVE-FRAME?");
        $const267$PredicativeFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicativeFrame"));
        $sym268$_PSP_PREDICATIVE_FRAME__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-PREDICATIVE-FRAME?-CACHING-STATE*");
        $sym269$PSP_KEYWORDS_FOR_FRAME = SubLObjectFactory.makeSymbol("PSP-KEYWORDS-FOR-FRAME");
        $sym270$_KEYWORD = SubLObjectFactory.makeSymbol("?KEYWORD");
        $const271$subcatFrameKeywords = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameKeywords"));
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?KEYWORD"));
        $const273$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym274$_PSP_KEYWORDS_FOR_FRAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-KEYWORDS-FOR-FRAME-CACHING-STATE*");
        $sym275$PSP_CONSTRAINED_FRAME_ = SubLObjectFactory.makeSymbol("PSP-CONSTRAINED-FRAME?");
        $const276$subcatFrameDependentConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameDependentConstraint"));
        $kw277$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym278$_PSP_CONSTRAINED_FRAME__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-CONSTRAINED-FRAME?-CACHING-STATE*");
        $sym279$PSP_DEVISABLE_VERB_FRAMES = SubLObjectFactory.makeSymbol("PSP-DEVISABLE-VERB-FRAMES");
        $sym280$DEVISABLE_VERB_FRAME_ = SubLObjectFactory.makeSymbol("DEVISABLE-VERB-FRAME?");
        $sym281$_PSP_DEVISABLE_VERB_FRAMES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-DEVISABLE-VERB-FRAMES-CACHING-STATE*");
        $sym282$TRANSITIVE_NP_COMP_FRAME_ = SubLObjectFactory.makeSymbol("TRANSITIVE-NP-COMP-FRAME?");
        $const283$TransitiveNPFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrameType"));
        $sym284$_TRANSITIVE_NP_COMP_FRAME__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TRANSITIVE-NP-COMP-FRAME?-CACHING-STATE*");
        $sym285$INTRANSITIVE_FRAME_ = SubLObjectFactory.makeSymbol("INTRANSITIVE-FRAME?");
        $const286$subcatFrameArity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameArity"));
        $list287 = ConsesLow.list((SubLObject)psp_chart.ZERO_INTEGER);
        $sym288$_INTRANSITIVE_FRAME__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*INTRANSITIVE-FRAME?-CACHING-STATE*");
        $sym289$PSP_FRAME_HAS_TYPE_ = SubLObjectFactory.makeSymbol("PSP-FRAME-HAS-TYPE?");
        $sym290$_PSP_FRAME_HAS_TYPE__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-FRAME-HAS-TYPE?-CACHING-STATE*");
        $sym291$PSP_PASSIVIZED_DTR_NUM = SubLObjectFactory.makeSymbol("PSP-PASSIVIZED-DTR-NUM");
        $sym292$_N = SubLObjectFactory.makeSymbol("?N");
        $const293$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const294$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list295 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrameForVerbs")));
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))));
        $sym297$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym298$_PSP_PASSIVIZED_DTR_NUM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-PASSIVIZED-DTR-NUM-CACHING-STATE*");
        $sym299$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list300 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PASSIVE"), (SubLObject)SubLObjectFactory.makeKeyword("PASSIVE-WITH-BY"));
        $str301$Don_t_know_how_to_passivize__S___ = SubLObjectFactory.makeString("Don't know how to passivize ~S.~%");
        $list302 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"));
        $list303 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BY-SUBJECT"));
        $kw304$DENOT_GROUND = SubLObjectFactory.makeKeyword("DENOT-GROUND");
        $sym305$PSP_CYCL__ = SubLObjectFactory.makeSymbol("PSP-CYCL-=");
        $const306$WHWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHWord"));
        $sym307$GET = SubLObjectFactory.makeSymbol("GET");
        $kw308$CYC_CATEGORY = SubLObjectFactory.makeKeyword("CYC-CATEGORY");
        $kw309$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $kw310$NO_DENOT = SubLObjectFactory.makeKeyword("NO-DENOT");
        $const311$RegularNounFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"));
        $kw312$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $kw313$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw314$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $str315$titlesConventionallyQuoted = SubLObjectFactory.makeString("titlesConventionallyQuoted");
        $const316$titleOfWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork"));
        $sym317$PSP_TERM_HAS_PREFERRED_LEXIFICATIONS_ = SubLObjectFactory.makeSymbol("PSP-TERM-HAS-PREFERRED-LEXIFICATIONS?");
        $list318 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WU"));
        $const319$FictionalCharacter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FictionalCharacter"));
        $const320$ConceptualWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptualWork"));
        $sym321$PSP_EDGE_SUBSUMES_ = SubLObjectFactory.makeSymbol("PSP-EDGE-SUBSUMES?");
        $str322$__Removing_edge_____S__is_subsume = SubLObjectFactory.makeString("~&Removing edge:~% ~S~%is subsumed by~% ~S~%~%");
        $sym323$PSP_FIND_FRAMES = SubLObjectFactory.makeSymbol("PSP-FIND-FRAMES");
        $const324$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const325$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $const326$RegularAdjFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularAdjFrame"));
        $list327 = ConsesLow.list((SubLObject)psp_chart.NIL);
        $kw328$DENOT_TEMPLATE = SubLObjectFactory.makeKeyword("DENOT-TEMPLATE");
        $sym329$PSP_EDGE_TO_PPH_PHRASE = SubLObjectFactory.makeSymbol("PSP-EDGE-TO-PPH-PHRASE");
        $sym330$TEST_SENTENCE_SET_WORDS_FROM_STRING_LIST = SubLObjectFactory.makeSymbol("TEST-SENTENCE-SET-WORDS-FROM-STRING-LIST");
        $kw331$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym332$WORD_OFFSETS_EQUAL = SubLObjectFactory.makeSymbol("WORD-OFFSETS-EQUAL");
        $kw333$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw334$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw335$KB = SubLObjectFactory.makeKeyword("KB");
        $kw336$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw337$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list338 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("6"), (SubLObject)SubLObjectFactory.makeString("degrees"), (SubLObject)SubLObjectFactory.makeString("per"), (SubLObject)SubLObjectFactory.makeString("second"), (SubLObject)SubLObjectFactory.makeString("per"), (SubLObject)SubLObjectFactory.makeString("second")), (SubLObject)SubLObjectFactory.makeString("6 degrees per second per  second")), (SubLObject)ConsesLow.list((SubLObject)psp_chart.ZERO_INTEGER, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.TEN_INTEGER, (SubLObject)psp_chart.FOURTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)SubLObjectFactory.makeInteger(26))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("6"), (SubLObject)SubLObjectFactory.makeString("degrees"), (SubLObject)SubLObjectFactory.makeString("per"), (SubLObject)SubLObjectFactory.makeString("second"), (SubLObject)SubLObjectFactory.makeString("per"), (SubLObject)SubLObjectFactory.makeString("second")), (SubLObject)SubLObjectFactory.makeString("6 degrees per second per second")), (SubLObject)ConsesLow.list((SubLObject)psp_chart.ZERO_INTEGER, (SubLObject)psp_chart.TWO_INTEGER, (SubLObject)psp_chart.TEN_INTEGER, (SubLObject)psp_chart.FOURTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)SubLObjectFactory.makeInteger(25))));
    }
    
    public static final class $phrase_structure_parser_chart_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $input_string;
        public SubLObject $length;
        public SubLObject $spans_to_edges;
        public SubLObject $gap_type;
        public SubLObject $memoization_state;
        public SubLObject $edge_id_index;
        public SubLObject $edges_to_nodes;
        public SubLObject $max_edges_per_span;
        public SubLObject $max_edges;
        public SubLObject $maxed_out_spans;
        public SubLObject $maxed_outP;
        public SubLObject $parsed_lexical_spans;
        private static final SubLStructDeclNative structDecl;
        
        public $phrase_structure_parser_chart_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$input_string = (SubLObject)CommonSymbols.NIL;
            this.$length = (SubLObject)CommonSymbols.NIL;
            this.$spans_to_edges = (SubLObject)CommonSymbols.NIL;
            this.$gap_type = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
            this.$edge_id_index = (SubLObject)CommonSymbols.NIL;
            this.$edges_to_nodes = (SubLObject)CommonSymbols.NIL;
            this.$max_edges_per_span = (SubLObject)CommonSymbols.NIL;
            this.$max_edges = (SubLObject)CommonSymbols.NIL;
            this.$maxed_out_spans = (SubLObject)CommonSymbols.NIL;
            this.$maxed_outP = (SubLObject)CommonSymbols.NIL;
            this.$parsed_lexical_spans = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$phrase_structure_parser_chart_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$input_string;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$length;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$spans_to_edges;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$gap_type;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$memoization_state;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$edge_id_index;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$edges_to_nodes;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$max_edges_per_span;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$max_edges;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$maxed_out_spans;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$maxed_outP;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$parsed_lexical_spans;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$input_string = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$length = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$spans_to_edges = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$gap_type = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$edge_id_index = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$edges_to_nodes = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$max_edges_per_span = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$max_edges = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$maxed_out_spans = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$maxed_outP = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$parsed_lexical_spans = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$phrase_structure_parser_chart_native.class, psp_chart.$sym0$PHRASE_STRUCTURE_PARSER_CHART, psp_chart.$sym1$PHRASE_STRUCTURE_PARSER_CHART_P, psp_chart.$list2, psp_chart.$list3, new String[] { "$id", "$input_string", "$length", "$spans_to_edges", "$gap_type", "$memoization_state", "$edge_id_index", "$edges_to_nodes", "$max_edges_per_span", "$max_edges", "$maxed_out_spans", "$maxed_outP", "$parsed_lexical_spans" }, psp_chart.$list4, psp_chart.$list5, psp_chart.$sym6$PPRINT_PSP_CHART);
        }
    }
    
    public static final class $phrase_structure_parser_chart_p$UnaryFunction extends UnaryFunction
    {
        public $phrase_structure_parser_chart_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PHRASE-STRUCTURE-PARSER-CHART-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return psp_chart.phrase_structure_parser_chart_p(arg1);
        }
    }
    
    public static final class $phrase_structure_parser_phrasal_edge_native extends SubLStructNative
    {
        public SubLObject $weight;
        public SubLObject $string;
        public SubLObject $span;
        public SubLObject $category;
        public SubLObject $pos_pred;
        public SubLObject $cycls;
        public SubLObject $rule;
        public SubLObject $new_dtr_constraints;
        public SubLObject $head_dtr;
        public SubLObject $non_head_dtrs;
        public SubLObject $id;
        public SubLObject $chart;
        private static final SubLStructDeclNative structDecl;
        
        public $phrase_structure_parser_phrasal_edge_native() {
            this.$weight = (SubLObject)CommonSymbols.NIL;
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$span = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$pos_pred = (SubLObject)CommonSymbols.NIL;
            this.$cycls = (SubLObject)CommonSymbols.NIL;
            this.$rule = (SubLObject)CommonSymbols.NIL;
            this.$new_dtr_constraints = (SubLObject)CommonSymbols.NIL;
            this.$head_dtr = (SubLObject)CommonSymbols.NIL;
            this.$non_head_dtrs = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$chart = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$phrase_structure_parser_phrasal_edge_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$weight;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$string;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$span;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$category;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$pos_pred;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$cycls;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$rule;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$new_dtr_constraints;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$head_dtr;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$non_head_dtrs;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$chart;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$weight = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$string = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$span = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$category = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$pos_pred = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$cycls = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$rule = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$new_dtr_constraints = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$head_dtr = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$non_head_dtrs = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$chart = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$phrase_structure_parser_phrasal_edge_native.class, psp_chart.$sym61$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE, psp_chart.$sym62$PHRASE_STRUCTURE_PARSER_PHRASAL_EDGE_P, psp_chart.$list63, psp_chart.$list64, new String[] { "$weight", "$string", "$span", "$category", "$pos_pred", "$cycls", "$rule", "$new_dtr_constraints", "$head_dtr", "$non_head_dtrs", "$id", "$chart" }, psp_chart.$list65, psp_chart.$list66, psp_chart.$sym67$PPRINT_PSP_PHRASAL_EDGE);
        }
    }
    
    public static final class $phrase_structure_parser_phrasal_edge_p$UnaryFunction extends UnaryFunction
    {
        public $phrase_structure_parser_phrasal_edge_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PHRASE-STRUCTURE-PARSER-PHRASAL-EDGE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return psp_chart.phrase_structure_parser_phrasal_edge_p(arg1);
        }
    }
    
    public static final class $phrase_structure_parser_lexical_edge_native extends SubLStructNative
    {
        public SubLObject $weight;
        public SubLObject $string;
        public SubLObject $span;
        public SubLObject $category;
        public SubLObject $pos_pred;
        public SubLObject $cycls;
        public SubLObject $wu;
        public SubLObject $frame;
        public SubLObject $id;
        public SubLObject $chart;
        private static final SubLStructDeclNative structDecl;
        
        public $phrase_structure_parser_lexical_edge_native() {
            this.$weight = (SubLObject)CommonSymbols.NIL;
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$span = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$pos_pred = (SubLObject)CommonSymbols.NIL;
            this.$cycls = (SubLObject)CommonSymbols.NIL;
            this.$wu = (SubLObject)CommonSymbols.NIL;
            this.$frame = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$chart = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$phrase_structure_parser_lexical_edge_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$weight;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$string;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$span;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$category;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$pos_pred;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$cycls;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$wu;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$frame;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$chart;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$weight = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$string = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$span = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$category = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$pos_pred = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$cycls = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$wu = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$frame = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$chart = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$phrase_structure_parser_lexical_edge_native.class, psp_chart.$sym109$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE, psp_chart.$sym110$PHRASE_STRUCTURE_PARSER_LEXICAL_EDGE_P, psp_chart.$list111, psp_chart.$list112, new String[] { "$weight", "$string", "$span", "$category", "$pos_pred", "$cycls", "$wu", "$frame", "$id", "$chart" }, psp_chart.$list113, psp_chart.$list114, psp_chart.$sym115$PPRINT_PSP_LEXICAL_EDGE);
        }
    }
    
    public static final class $phrase_structure_parser_lexical_edge_p$UnaryFunction extends UnaryFunction
    {
        public $phrase_structure_parser_lexical_edge_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PHRASE-STRUCTURE-PARSER-LEXICAL-EDGE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return psp_chart.phrase_structure_parser_lexical_edge_p(arg1);
        }
    }
}

/*

	Total time: 1641 ms
	 synthetic 
*/